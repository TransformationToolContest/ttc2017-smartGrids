package rgse.ttc17.emoflon.tgg.task2.org.moflon.tie;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.moflon.core.utilities.MoflonUtil;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.delta.Delta;
import org.moflon.tgg.algorithm.synchronization.ForwardSynchronizer;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;
import org.moflon.tgg.runtime.AttributeDelta;
import org.moflon.tgg.runtime.DeltaSpecification;
import org.moflon.tgg.runtime.EMoflonEdge;

import Changes.ChangesPackage;
import gluemodel.GluemodelPackage;
import outagePreventionJointarget.OutagePreventionJointargetPackage;

import rgse.ttc17.emoflon.tgg.task2.Task2Package;

public class Task2Sync extends SynchronizationHelper {
	
	public Task2Sync(ResourceSet rs, boolean debug) throws IOException{
		this.set = rs;
		initialize(debug);
	}
	
	public Task2Sync(boolean debug) throws IOException {
		this.set = eMoflonEMFUtil.createDefaultResourceSet();
		initialize(debug);
	}

	private void initialize(boolean debug) throws IOException {
		BasicConfigurator.configure();
		setMute(true);
		setCorrPackage(Task2Package.eINSTANCE);
		if (debug) {
			String pathToProject = "../rgse.ttc17.emoflon.tgg.task2";
			Resource r = set.getResource(eMoflonEMFUtil.createFileURI(pathToProject + "/model/"
					+ MoflonUtil.getDefaultNameOfFileInProjectWithoutExtension("Task2") + ".sma.xmi", true), true);
			setRules((StaticAnalysis) r.getContents().get(0));
		} else {
			InputStream in = getClass().getResourceAsStream("/Task2.sma.xmi");
			Resource r = set.createResource(URI.createURI("Task2.sma.xmi"));
			r.load(in, Collections.EMPTY_MAP);
			setRules((StaticAnalysis) r.getContents().get(0));
		}
		configurator = new Configurator() {
		};
		changeSrc = (root -> {
		});
		changeTrg = (root -> {
		});
		
		recursiveLoad(GluemodelPackage.eINSTANCE, getResourceSet());
		recursiveLoad(ChangesPackage.eINSTANCE, getResourceSet());
		recursiveLoad(OutagePreventionJointargetPackage.eINSTANCE, getResourceSet());
		EcoreUtil.resolveAll(getResourceSet());
	}

	public static void recursiveLoad(EPackage pack, ResourceSet resSet) {
		pack.eClass();
		resSet.getPackageRegistry().put(pack.getNsURI(), pack);
		for (EPackage sub : pack.getESubpackages()) {
			recursiveLoad(sub, resSet);
		}
	}

	public void sync(DeltaSpecification emoflonDelta) {
		Delta delta = new Delta();
		for (EMoflonEdge edge : emoflonDelta.getDeletedEdges()) {
			delta.deleteEdge(edge);
		}
		for (EObject node : emoflonDelta.getDeletedNodes()) {
			delta.deleteNode(node);
		}
		for (EObject node : emoflonDelta.getAddedNodes()) {
			delta.addNode(node);
		}
		for (EMoflonEdge edge : emoflonDelta.getAddedEdges()) {
			delta.addEdge(edge);
		}
		for (AttributeDelta attrib : emoflonDelta.getAttributeChanges()) {
			delta.changeAttribute(attrib.getAffectedAttribute(), attrib.getOldValue(), attrib.getNewValue(),
					attrib.getAffectedNode());
		}
		setDelta(delta);
		sanityCheckDelta();

		if (noChangesWereMade() && protocol == null) {
			throw new RuntimeException();
		} else {
			batchMode = false;
		}

		establishTranslationProtocol();

		performSynchronization(new ForwardSynchronizer(corr, delta, protocol, configurator, determineLookupMethods(),
				tempOutputContainer));
	}
}