package Changes.converter;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.moflon.tgg.runtime.AttributeDelta;
import org.moflon.tgg.runtime.DeltaSpecification;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.RuntimeFactory;

import Changes.AssociationChange;
import Changes.AssociationCollectionInsertion;
import Changes.AssociationCollectionReset;
import Changes.AssociationListDeletion;
import Changes.AssociationListInsertion;
import Changes.AttributeChange;
import Changes.AttributeCollectionDeletion;
import Changes.AttributeCollectionInsertion;
import Changes.AttributeCollectionReset;
import Changes.AttributeListDeletion;
import Changes.AttributeListInsertion;
import Changes.CompositionChange;
import Changes.CompositionCollectionDeletion;
import Changes.CompositionCollectionInsertion;
import Changes.CompositionCollectionReset;
import Changes.CompositionListDeletion;
import Changes.CompositionListInsertion;
import Changes.ElementaryChange;
import Changes.ElementaryChangeTransaction;
import Changes.ModelChange;
import Changes.ModelChangeSet;

@SuppressWarnings("rawtypes")
public class Changes2DeltaSpecification {
	public static DeltaSpecification convert(ModelChangeSet modelChangeSet) {
		DeltaSpecification result = RuntimeFactory.eINSTANCE.createDeltaSpecification();
		result.setTargetModel(getTargetModel(modelChangeSet));

		for (ModelChange change : modelChangeSet.getChanges()) {
			convert(change, result);
		}
		
		return result;
	}

	private static EObject getTargetModel(ModelChangeSet modelChangeSet) {
		ElementaryChange firstChange = (ElementaryChange) modelChangeSet.getChanges().get(0);
		EObject affected = firstChange.getAffectedElement();
		return affected.eResource().getContents().get(0);
	}

	public static void convert(ModelChange change, DeltaSpecification result) {
		// ElementaryChangeTransaction a;
		if (change instanceof ElementaryChangeTransaction) {
			ElementaryChangeTransaction trx = (ElementaryChangeTransaction) change;
			convert(trx.getSourceChange(), result);
			for (ModelChange ch : trx.getNestedChanges()) {
				convert(ch, result);
			}
		}

		if (change instanceof AttributeListInsertion || change instanceof AttributeListDeletion
				|| change instanceof AttributeCollectionInsertion || change instanceof AttributeCollectionDeletion
				|| change instanceof AttributeCollectionDeletion || change instanceof AttributeCollectionReset) {
			throw new RuntimeException("Attribute collections are not supported!");
		}

		if (change instanceof CompositionListInsertion) {
			CompositionListInsertion ch = (CompositionListInsertion) change;
			EObject addedNode = ch.getAddedElement();
			EObject container = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			addNode(addedNode, result);
			addEdge(container, addedNode, feature, result);
		}
		if (change instanceof CompositionCollectionInsertion) {
			CompositionListInsertion ch = (CompositionListInsertion) change;
			EObject addedNode = ch.getAddedElement();
			EObject container = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			addNode(addedNode, result);
			addEdge(container, addedNode, feature, result);
		}

		if (change instanceof AssociationListInsertion) {
			AssociationListInsertion ch = (AssociationListInsertion) change;
			EObject addedNode = ch.getAddedElement();
			EObject container = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			addEdge(container, addedNode, feature, result);
		}
		if (change instanceof AssociationCollectionInsertion) {
			AssociationCollectionInsertion ch = (AssociationCollectionInsertion) change;
			EObject addedNode = ch.getAddedElement();
			EObject container = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			addEdge(container, addedNode, feature, result);
		}

		if (change instanceof CompositionListDeletion) {
			CompositionListDeletion ch = (CompositionListDeletion) change;
			EObject deletedNode = ch.getDeletedElement();
			EObject container = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			deleteNode(deletedNode, result);
			deleteEdge(container, deletedNode, feature, result);
		}
		if (change instanceof CompositionCollectionDeletion) {
			CompositionCollectionDeletion ch = (CompositionCollectionDeletion) change;
			EObject deletedNode = ch.getDeletedElement();
			EObject container = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			deleteNode(deletedNode, result);
			deleteEdge(container, deletedNode, feature, result);
		}

		if (change instanceof AssociationListDeletion) {
			AssociationListDeletion ch = (AssociationListDeletion) change;
			EObject deletedNode = ch.getDeletedElement();
			EObject container = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			deleteEdge(container, deletedNode, feature, result);
		}
		if (change instanceof CompositionCollectionDeletion) {
			CompositionCollectionDeletion ch = (CompositionCollectionDeletion) change;
			EObject deletedNode = ch.getDeletedElement();
			EObject container = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			deleteEdge(container, deletedNode, feature, result);
		}

		if (change instanceof AttributeChange) {
			AttributeChange ch = (AttributeChange) change;
			String oldValue = ch.getOldValue();
			String newValue = ch.getNewValue();
			EStructuralFeature feature = ch.getFeature();
			EObject object = ch.getAffectedElement();
			changeAttribute(object, feature, oldValue, newValue, result);
		}

		if (change instanceof AssociationChange) {
			AssociationChange ch = (AssociationChange) change;
			EObject element = ch.getAffectedElement();
			EObject oldValue = ch.getOldValue();
			EObject newValue = ch.getNewValue();
			EStructuralFeature feature = ch.getFeature();
			deleteEdge(element, oldValue, feature, result);
			addEdge(element, newValue, feature, result);
		}
		if (change instanceof CompositionChange) {
			CompositionChange ch = (CompositionChange) change;
			EObject element = ch.getAffectedElement();
			EObject oldValue = ch.getOldValue();
			EObject newValue = ch.getNewValue();
			EStructuralFeature feature = ch.getFeature();
			deleteNode(oldValue, result);
			deleteEdge(element, oldValue, feature, result);
			addNode(oldValue, result);
			addEdge(element, newValue, feature, result);
		}
		
		if (change instanceof AssociationCollectionReset) {
			AssociationCollectionReset ch = (AssociationCollectionReset) change;
			EObject element = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			Collection values = (Collection) element.eGet(feature);
			for (Object value : values) {
				EObject val = (EObject) value;
				deleteEdge(element,val,feature,result);
			}
		}
		if (change instanceof CompositionCollectionReset) {
			CompositionCollectionReset ch = (CompositionCollectionReset) change;
			EObject element = ch.getAffectedElement();
			EStructuralFeature feature = ch.getFeature();
			Collection values = (Collection) element.eGet(feature);
			for (Object value : values) {
				EObject val = (EObject) value;
				deleteNode(val,result);
				deleteEdge(element,val,feature,result);
			}
		}
	}

	private static void addEdge(EObject source, EObject target, EStructuralFeature feature, DeltaSpecification result) {
		EMoflonEdge e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		e.setSrc(source);
		e.setTrg(target);
		e.setName(feature.getName());
		result.getAddedEdges().add(e);
	}

	private static void addNode(EObject node, DeltaSpecification result) {
		result.getAddedNodes().add(node);
	}

	private static void deleteEdge(EObject source, EObject target, EStructuralFeature feature,
			DeltaSpecification result) {
		EMoflonEdge e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		e.setSrc(source);
		e.setTrg(target);
		e.setName(feature.getName());
		result.getDeletedEdges().add(e);
	}

	private static void deleteNode(EObject node, DeltaSpecification result) {
		result.getDeletedNodes().add(node);
	}

	private static void changeAttribute(EObject object, EStructuralFeature feature, String oldValue, String newValue,
			DeltaSpecification result) {
		AttributeDelta delta = RuntimeFactory.eINSTANCE.createAttributeDelta();
		delta.setOldValue(oldValue);
		delta.setNewValue(newValue);
		delta.setAffectedNode(object);
		delta.setAffectedAttribute((EAttribute) feature);
		result.getAttributeChanges().add(delta);
	}
}
