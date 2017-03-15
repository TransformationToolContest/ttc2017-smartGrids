package at.ac.wu.nm.qvto;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.WriterLog;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

public class App {

	@Parameter
	private List<String> parameters = new ArrayList<String>();

	@Parameter(names = { "-cim" }, description = "The cim source model", required = true)
	private String cim;

	@Parameter(names = { "-cosem" }, description = "The cosem source model", required = true)
	private String cosem;

	@Parameter(names = { "-substation" }, description = "The substation source model", required = false)
	private String substation;
	
	@Parameter(names = { "-view" }, description = "The view that should be computed", required = true)
	private String transformation;

	private ResourceSet rs = new ResourceSetImpl();

	public static void main(String[] args) {

		App app = new App();
		JCommander jc = new JCommander(app);

		try {
			jc.parse(args);
		} catch (ParameterException pe) {
			System.err.println(pe.getMessage());
			jc.usage();
			return;
		}

		app.build();

	}

	private ModelExtent createModelExtent(String model) {
		Resource mRes = this.rs.getResource(URI.createFileURI(new File(model).getAbsolutePath()), true);

		return new BasicModelExtent(mRes.getContents());
	}
	
	private void registerMetamodel(String metamodel) {
		Resource mmRes = this.rs.getResource(URI.createFileURI(new File(metamodel).getAbsolutePath()), true);

		EObject eObject = mmRes.getContents().get(0);
		if (eObject instanceof EPackage) {
			EPackage p = (EPackage) eObject;
			EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
		}
	}

	public void build() {

		this.rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		this.rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		List<ModelExtent> modelExtents = new ArrayList<ModelExtent>();
		
		this.registerMetamodel("metamodels/61850.ecore");
		this.registerMetamodel("metamodels/COSEM.ecore");
		this.registerMetamodel("metamodels/schema.ecore");
		this.registerMetamodel("metamodels/" + this.transformation  + "-target.ecore");
		this.registerMetamodel("metamodels/" + this.transformation  + "-trace.ecore");

		modelExtents.add(this.createModelExtent(this.cim));
		if (this.substation != null) {
			modelExtents.add(this.createModelExtent(this.substation));
		}
		modelExtents.add(this.createModelExtent(this.cosem));

		URI txURI = URI.createFileURI(new File("transformations/" + this.transformation + ".qvto").getAbsolutePath());
		TransformationExecutor executor = new TransformationExecutor(txURI);

		ModelExtent output = new BasicModelExtent();
		modelExtents.add(output);
		modelExtents.add(new BasicModelExtent());

		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);

		OutputStreamWriter outStream = new OutputStreamWriter(System.err);
		Log log = new WriterLog(outStream);
		context.setLog(log);

		long start = System.nanoTime();
		ExecutionDiagnostic result = executor.execute(context,
				modelExtents.toArray(new ModelExtent[modelExtents.size()]));
		long end = System.nanoTime();

		if (result.getSeverity() == Diagnostic.OK) {
			// the output objects got captured in the output extent
			XMIResource outResource = (XMIResource) rs
					.createResource(URI.createFileURI(new File("out.xmi").getAbsolutePath()));
			outResource.getContents().addAll(output.getContents());
			try {
				outResource.save(null);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			IStatus status = BasicDiagnostic.toIStatus(result);
			StringBuilder s = new StringBuilder();
			s.append("Failed to execute ");
			s.append(txURI);
			s.append(": ");
			s.append(status.getMessage());
			for (IStatus child : status.getChildren()) {
				s.append("\n " + child.getMessage());
			}
			System.out.println(s);
		}
	}

}
