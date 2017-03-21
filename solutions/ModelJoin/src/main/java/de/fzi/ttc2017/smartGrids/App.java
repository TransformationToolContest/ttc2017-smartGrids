package de.fzi.ttc2017.smartGrids;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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

		Map<String, String> env = System.getenv();
		String changeSet = env.get("ChangeSet");
		String changePath = env.get("ChangePath");
		String runIndex = env.get("RunIndex");
		int sequenceLength = Integer.parseInt(env.get("Sequences"));
		
		long start = System.nanoTime();

		this.rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		this.rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		
		CIM.CIMPackage.eINSTANCE.getCIMFactory();
		COSEM.COSEMPackage.eINSTANCE.getCOSEMFactory();
		substationStandard.SubstationStandardPackage.eINSTANCE.getSubstationStandardFactory();
		outageDetectionJointarget.OutageDetectionJointargetPackage.eINSTANCE.getOutageDetectionJointargetFactory();
		outageDetectionMjtrace.OutageDetectionMjtracePackage.eINSTANCE.getOutageDetectionMjtraceFactory();
		outagePreventionJointarget.OutagePreventionJointargetPackage.eINSTANCE.getOutagePreventionJointargetFactory();
		outagePreventionMjtrace.OutagePreventionMjtracePackage.eINSTANCE.getOutagePreventionMjtraceFactory();

		URI txURI = URI.createFileURI(new File("transformations/" + this.transformation + ".qvto").getAbsolutePath());
		TransformationExecutor executor = new TransformationExecutor(txURI);

		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);

		OutputStreamWriter outStream = new OutputStreamWriter(System.err);
		Log log = new WriterLog(outStream);
		context.setLog(log);
		long end = System.nanoTime();

		System.out.println("ModelJoin;" + this.transformation + ";" + changeSet + ";" + runIndex + ";;Initialization;Time;" + Long.toString(end-start));
		
		this.runIteration(changePath + "\\CIM_DCIM-out000.xmi",
						  changePath + "\\COSEM-out000.xmi",
						  changePath + "\\Substandard-out000.xmi",
						  0, changeSet, runIndex, "Initial", executor, context);
		
		for (int i = 1; i <= sequenceLength; i++) {
			this.runIteration(changePath + String.format("\\CIM_DCIM-out%03d.xmi", i),
							  changePath + String.format("\\COSEM-out%03d.xmi", i),
							  changePath + String.format("\\Substandard-out%03d.xmi", i),
							  i, changeSet, runIndex, "Update", executor, context);
		}
	}
	
	private void runIteration(String cim, String cosem, String substation, int index, String changeSet, String runIndex, String phase, TransformationExecutor executor, ExecutionContextImpl context) {

		List<ModelExtent> modelExtents = new ArrayList<ModelExtent>();
		long loadModelsstart = System.nanoTime();
		modelExtents.add(this.createModelExtent(cim));
		if (this.transformation == "OutagePrevention") {
			modelExtents.add(this.createModelExtent(substation));
		}
		modelExtents.add(this.createModelExtent(cosem));
		long loadModelsEnd = System.nanoTime();
		if (phase == "Initial") {
			System.out.println("ModelJoin;" + this.transformation + ";" + changeSet + ";" + runIndex + ";" + Integer.toString(index) + ";" + phase + ";Time;" + Long.toString(loadModelsEnd-loadModelsstart));
		}
		ModelExtent output = new BasicModelExtent();
		modelExtents.add(output);
		modelExtents.add(new BasicModelExtent());

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
				System.out.println("ModelJoin;" + this.transformation + ";" + changeSet + ";" + runIndex + ";" + Integer.toString(index) + ";" + phase + ";Time;" + Long.toString(end-start));
				System.out.println("ModelJoin;" + this.transformation + ";" + changeSet + ";" + runIndex + ";" + Integer.toString(index) + ";" + phase + ";Elements;" + Integer.toString(outResource.getContents().size()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			IStatus status = BasicDiagnostic.toIStatus(result);
			StringBuilder s = new StringBuilder();
			s.append("Failed to execute ");
			s.append(this.transformation);
			s.append(": ");
			s.append(status.getMessage());
			for (IStatus child : status.getChildren()) {
				s.append("\n " + child.getMessage());
			}
			System.err.println(s);
		}
	}

}
