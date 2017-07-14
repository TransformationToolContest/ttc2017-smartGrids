package rgse.ttc17.solution;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import Changes.ModelChange;
import Changes.ModelChangeSet;
import Changes.converter.Changes2DeltaSpecification;
import gluemodel.CIM.CIMRoot;
import gluemodel.COSEM.COSEMRoot;
import gluemodel.Root;
import gluemodel.substationStandard.Substandard;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.algorithm.TempOutputContainer;
import org.moflon.tgg.runtime.DeltaSpecification;
import org.moflon.tgg.runtime.RuntimeFactory;
import rgse.ttc17.emoflon.tgg.task1.org.moflon.tie.Task1Sync;
import rgse.ttc17.emoflon.tgg.task2.org.moflon.tie.Task2Sync;
import rgse.ttc17.metamodels.src.GlueModelCreator;

public class Main {
	
	// Set to true if you are debugging inside of Eclipse
	private static final boolean DEBUG = false;
	
	@com.beust.jcommander.Parameter(names = {
			"-view"}, description = "The view that should be computed", required = true)
	private String transformation;
	private ResourceSet rs;
	private SynchronizationHelper tgg;

	public Main() {
	}

	public static void main(String[] args) {
		Main app = new Main();

		JCommander jc = new JCommander(app);
		try {
			jc.parse(args);
		} catch (ParameterException pe) {
			System.err.println(pe.getMessage());
			jc.usage();
			return;
		}
		try {
			app.run();
		} catch (IOException e) {
			e.printStackTrace();
			jc.usage();
			return;
		}
	}

	public void run() throws IOException {
		Map<String, String> env = System.getenv();
		String changeSet = (String) env.get("ChangeSet");
		String changePath = (String) env.get("ChangePath");
		String runIndex = (String) env.get("RunIndex");
		String sequencesString = (String) env.get("Sequences");
		int sequenceLength;
		if (sequencesString != null) {
			sequenceLength = Integer.parseInt(sequencesString);
		} else {
			sequenceLength = 10;
			System.err.println("Env variable Sequences is null, assuming 10");
		}

		long start = System.nanoTime();

		if ("OutagePrevention".equalsIgnoreCase(transformation)) {
			tgg = new Task2Sync(DEBUG);
		} else if ("OutageDetection".equalsIgnoreCase(transformation)) {
			tgg = new Task1Sync(DEBUG);
		} else {
			return;
		}
		rs = tgg.getResourceSet();

		long end = System.nanoTime();

		System.out.println("RGSEeMoflonTGG;" + transformation + ";" + changeSet + ";" + runIndex + ";;Loading;Time;"
				+ Long.toString(end - start));

		initialize(changePath + "/CIM_DCIM-out000.xmi", changePath + "/COSEM-out000.xmi",
				changePath + "/Substandard-out000.xmi", 0, changeSet, runIndex, "Initial");

		for (int i = 1; i <= sequenceLength; i++) {
			if ("OutagePrevention".equalsIgnoreCase(transformation)) {
				tgg = new Task2Sync(rs, DEBUG);
			} else if ("OutageDetection".equalsIgnoreCase(transformation)) {
				tgg = new Task1Sync(rs, DEBUG);
			} else {
				return;
			}
			initialize(changePath + String.format("/CIM_DCIM-out%03d.xmi", new Object[] { Integer.valueOf(i) }),
					changePath + String.format("/COSEM-out%03d.xmi", new Object[] { Integer.valueOf(i) }),
					changePath + String.format("/Substandard-out%03d.xmi", new Object[] { Integer.valueOf(i) }), i,
					changeSet, runIndex, "Update");
		}
	}

	private void initialize(String cim, String cosem, String substation, int index, String changeSet, String runIndex,
			String phase) {
		long loadModelsstart = System.nanoTime();

		CIMRoot cimRoot = (CIMRoot) load(cim, "CIM_DCIM-out000.xmi");
		COSEMRoot cosemRoot = (COSEMRoot) load(cosem, "CIM_DCIM-out000.xmi");
		Substandard subRoot = (Substandard) load(substation, "Substandard-out000.xmi");

		long loadModelsEnd = System.nanoTime();
		System.out.println(
				"RGSEeMoflonTGG;" + transformation + ";" + changeSet + ";" + runIndex + ";" + Integer.toString(index)
						+ ";" + phase + ";LoadTime;" + Long.toString(loadModelsEnd - loadModelsstart));

		long start = System.nanoTime();
		Root root;
		if ("OutagePrevention".equalsIgnoreCase(transformation)) {
			root = GlueModelCreator.createGlueModel(cimRoot, subRoot, cosemRoot);
		} else {
			root = GlueModelCreator.createGlueModel(cimRoot, null, cosemRoot);
		}

		tgg.setSrc(root);
		tgg.integrateForward();

		EObject trg = tgg.getTrg();

		long end = System.nanoTime();

		Set<EObject> keep = new HashSet();
		if ((trg instanceof TempOutputContainer)) {
			TempOutputContainer container = (TempOutputContainer) trg;
			keep.addAll(container.getPotentialRoots());
		}
		Resource targetResource = rs
				.createResource(URI.createFileURI(new File(transformation + ".xmi").getAbsolutePath()));
		targetResource.getContents().addAll(keep);
		try {
			targetResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("RGSEeMoflonTGG;" + transformation + ";" + changeSet + ";" + runIndex + ";"
				+ Integer.toString(index) + ";" + phase + ";Time;" + Long.toString(end - start));
		System.out.println(
				"RGSEeMoflonTGG;" + transformation + ";" + changeSet + ";" + runIndex + ";" + Integer.toString(index)
						+ ";" + phase + ";Elements;" + Integer.toString(targetResource.getContents().size()));
	}

	private EObject load(String path, String name) {
		Resource r = rs.createResource(URI.createURI(name));
		try {
			r.load(new java.io.FileInputStream(new File(path).getAbsoluteFile()), Collections.EMPTY_MAP);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (EObject) r.getContents().get(0);
	}

	private void sync(String cim, String cosem, String substation, int index, String changeSet, String runIndex,
			String phase) throws IOException {
		DeltaSpecification emoflonDelta = RuntimeFactory.eINSTANCE.createDeltaSpecification();
		emoflonDelta.setTargetModel(tgg.getSrc());

		File cimTemp = File.createTempFile("cim", "temp");
		List<String> out = new ArrayList();
		for (String line : Files.readAllLines(new File(cim).getAbsoluteFile().toPath())) {
			out.add(line
					.replaceAll("http://iec.ch/TC57/2009/CIM-schema-cim14#//",
							"platform:/plugin/rgse.ttc17.metamodels.src/model/Gluemodel.ecore#//CIM/")
					.replaceAll("CIM_DCIM-out000.xmi#//", "CIM_DCIM-out000.xmi#/"));
		}
		Files.write(cimTemp.toPath(), out, new OpenOption[0]);
		Resource cimDeltaResource = rs.createResource(URI.createURI(cimTemp.toString()));
		cimDeltaResource.load(Collections.EMPTY_MAP);
		ModelChangeSet cimModelChangeSet = (ModelChangeSet) cimDeltaResource.getContents().get(0);

		File cosemTemp = File.createTempFile("cim", "temp");
		List<String> cosemout = new ArrayList();
		for (String line : Files.readAllLines(new File(cosem).getAbsoluteFile().toPath())) {
			cosemout.add(line
					.replaceAll("http://www.transformation-tool-contest.eu/2017/smartGrids/cosem#//",
							"platform:/plugin/rgse.ttc17.metamodels.src/model/Gluemodel.ecore#//COSEM/")
					.replaceAll("COSEM-out000.xmi#//", "COSEM-out000.xmi#/"));
		}
		Files.write(cosemTemp.toPath(), cosemout, new OpenOption[0]);
		Resource cosemDeltaResource = rs.createResource(URI.createURI(cosemTemp.getAbsolutePath()));
		cosemDeltaResource.load(Collections.EMPTY_MAP);
		ModelChangeSet cosemModelChangeSet = (ModelChangeSet) cosemDeltaResource.getContents().get(0);

		File substationTemp = File.createTempFile("cim", "temp");
		List<String> substationout = new ArrayList();
		for (String line : Files.readAllLines(new File(substation).getAbsoluteFile().toPath())) {
			substationout.add(line.replaceAll("Substandard-out000.xmi#//", "Substandard-out000.xmi#/"));
		}
		Files.write(substationTemp.toPath(), substationout, new OpenOption[0]);
		Resource substationDeltaResource = rs.createResource(URI.createURI(substationTemp.getAbsolutePath()));
		substationDeltaResource.load(Collections.EMPTY_MAP);
		ModelChangeSet substationModelChangeSet = (ModelChangeSet) substationDeltaResource.getContents().get(0);

		long start = System.nanoTime();

		for (ModelChange change : cimModelChangeSet.getChanges()) {
			Changes2DeltaSpecification.convert(change, emoflonDelta);
		}

		for (ModelChange change : cosemModelChangeSet.getChanges()) {
			Changes2DeltaSpecification.convert(change, emoflonDelta);
		}

		if ("OutagePrevention".equalsIgnoreCase(transformation)) {
			for (ModelChange change : substationModelChangeSet.getChanges()) {
				Changes2DeltaSpecification.convert(change, emoflonDelta);
			}
		}

		if ((tgg instanceof Task1Sync)) {
			((Task1Sync) tgg).sync(emoflonDelta);
		} else {
			((Task2Sync) tgg).sync(emoflonDelta);
		}

		EObject trg = tgg.getTrg();

		long end = System.nanoTime();

		Set<EObject> keep = new HashSet();
		if ((trg instanceof TempOutputContainer)) {
			TempOutputContainer container = (TempOutputContainer) trg;
			keep.addAll(container.getPotentialRoots());
		}
		File targetFile = new File(transformation + ".xmi");
		Resource targetResource = new ResourceSetImpl().createResource(URI.createFileURI(targetFile.getAbsolutePath()));
		targetResource.getContents().addAll(keep);
		try {
			targetResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<String> tout = new ArrayList();
		for (String line : Files.readAllLines(targetFile.getAbsoluteFile().toPath())) {
			cosemout.add(line
					.replaceAll(
							"platform:/plugin/rgse.ttc17.metamodels.trg.outage.detection/model/outageDetection-target.ecore",
							"http://www.transformation-tool-contest.eu/2017/smartGrids/ConsumerReachabilityView")
					.replaceAll(
							"platform:/plugin/rgse.ttc17.metamodels.trg.outage.prevention/model/outageDetection-target.ecore",
							"http://www.transformation-tool-contest.eu/2017/smartGrids/VoltagePhaseMeasurements"));
		}
		Files.write(targetFile.toPath(), tout, new OpenOption[0]);

		System.out.println("RGSEeMoflonTGG;" + transformation + ";" + changeSet + ";" + runIndex + ";"
				+ Integer.toString(index) + ";" + phase + ";Time;" + Long.toString(end - start));
		System.out.println(
				"RGSEeMoflonTGG;" + transformation + ";" + changeSet + ";" + runIndex + ";" + Integer.toString(index)
						+ ";" + phase + ";Elements;" + Integer.toString(targetResource.getContents().size()));
	}
}
