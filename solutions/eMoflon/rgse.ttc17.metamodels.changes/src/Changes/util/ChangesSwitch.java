/**
 */
package Changes.util;

import Changes.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Changes.ChangesPackage
 * @generated
 */
public class ChangesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChangesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangesSwitch() {
		if (modelPackage == null) {
			modelPackage = ChangesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ChangesPackage.MODEL_CHANGE_SET: {
				ModelChangeSet modelChangeSet = (ModelChangeSet)theEObject;
				T result = caseModelChangeSet(modelChangeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.MODEL_CHANGE: {
				ModelChange modelChange = (ModelChange)theEObject;
				T result = caseModelChange(modelChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ELEMENTARY_CHANGE: {
				ElementaryChange elementaryChange = (ElementaryChange)theEObject;
				T result = caseElementaryChange(elementaryChange);
				if (result == null) result = caseModelChange(elementaryChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION: {
				ElementaryChangeTransaction elementaryChangeTransaction = (ElementaryChangeTransaction)theEObject;
				T result = caseElementaryChangeTransaction(elementaryChangeTransaction);
				if (result == null) result = caseElementaryChange(elementaryChangeTransaction);
				if (result == null) result = caseModelChange(elementaryChangeTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COLLECTION_DELETION: {
				CollectionDeletion collectionDeletion = (CollectionDeletion)theEObject;
				T result = caseCollectionDeletion(collectionDeletion);
				if (result == null) result = caseElementaryChange(collectionDeletion);
				if (result == null) result = caseModelChange(collectionDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ASSOCIATION_COLLECTION_DELETION: {
				AssociationCollectionDeletion associationCollectionDeletion = (AssociationCollectionDeletion)theEObject;
				T result = caseAssociationCollectionDeletion(associationCollectionDeletion);
				if (result == null) result = caseCollectionDeletion(associationCollectionDeletion);
				if (result == null) result = caseElementaryChange(associationCollectionDeletion);
				if (result == null) result = caseModelChange(associationCollectionDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COMPOSITION_COLLECTION_DELETION: {
				CompositionCollectionDeletion compositionCollectionDeletion = (CompositionCollectionDeletion)theEObject;
				T result = caseCompositionCollectionDeletion(compositionCollectionDeletion);
				if (result == null) result = caseCollectionDeletion(compositionCollectionDeletion);
				if (result == null) result = caseElementaryChange(compositionCollectionDeletion);
				if (result == null) result = caseModelChange(compositionCollectionDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ATTRIBUTE_COLLECTION_DELETION: {
				AttributeCollectionDeletion attributeCollectionDeletion = (AttributeCollectionDeletion)theEObject;
				T result = caseAttributeCollectionDeletion(attributeCollectionDeletion);
				if (result == null) result = caseCollectionDeletion(attributeCollectionDeletion);
				if (result == null) result = caseElementaryChange(attributeCollectionDeletion);
				if (result == null) result = caseModelChange(attributeCollectionDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COLLECTION_INSERTION: {
				CollectionInsertion collectionInsertion = (CollectionInsertion)theEObject;
				T result = caseCollectionInsertion(collectionInsertion);
				if (result == null) result = caseElementaryChange(collectionInsertion);
				if (result == null) result = caseModelChange(collectionInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ASSOCIATION_COLLECTION_INSERTION: {
				AssociationCollectionInsertion associationCollectionInsertion = (AssociationCollectionInsertion)theEObject;
				T result = caseAssociationCollectionInsertion(associationCollectionInsertion);
				if (result == null) result = caseCollectionInsertion(associationCollectionInsertion);
				if (result == null) result = caseElementaryChange(associationCollectionInsertion);
				if (result == null) result = caseModelChange(associationCollectionInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COMPOSITION_COLLECTION_INSERTION: {
				CompositionCollectionInsertion compositionCollectionInsertion = (CompositionCollectionInsertion)theEObject;
				T result = caseCompositionCollectionInsertion(compositionCollectionInsertion);
				if (result == null) result = caseCollectionInsertion(compositionCollectionInsertion);
				if (result == null) result = caseElementaryChange(compositionCollectionInsertion);
				if (result == null) result = caseModelChange(compositionCollectionInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ATTRIBUTE_COLLECTION_INSERTION: {
				AttributeCollectionInsertion attributeCollectionInsertion = (AttributeCollectionInsertion)theEObject;
				T result = caseAttributeCollectionInsertion(attributeCollectionInsertion);
				if (result == null) result = caseCollectionInsertion(attributeCollectionInsertion);
				if (result == null) result = caseElementaryChange(attributeCollectionInsertion);
				if (result == null) result = caseModelChange(attributeCollectionInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COLLECTION_RESET: {
				CollectionReset collectionReset = (CollectionReset)theEObject;
				T result = caseCollectionReset(collectionReset);
				if (result == null) result = caseElementaryChange(collectionReset);
				if (result == null) result = caseModelChange(collectionReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ASSOCIATION_COLLECTION_RESET: {
				AssociationCollectionReset associationCollectionReset = (AssociationCollectionReset)theEObject;
				T result = caseAssociationCollectionReset(associationCollectionReset);
				if (result == null) result = caseCollectionReset(associationCollectionReset);
				if (result == null) result = caseElementaryChange(associationCollectionReset);
				if (result == null) result = caseModelChange(associationCollectionReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COMPOSITION_COLLECTION_RESET: {
				CompositionCollectionReset compositionCollectionReset = (CompositionCollectionReset)theEObject;
				T result = caseCompositionCollectionReset(compositionCollectionReset);
				if (result == null) result = caseCollectionReset(compositionCollectionReset);
				if (result == null) result = caseElementaryChange(compositionCollectionReset);
				if (result == null) result = caseModelChange(compositionCollectionReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ATTRIBUTE_COLLECTION_RESET: {
				AttributeCollectionReset attributeCollectionReset = (AttributeCollectionReset)theEObject;
				T result = caseAttributeCollectionReset(attributeCollectionReset);
				if (result == null) result = caseCollectionReset(attributeCollectionReset);
				if (result == null) result = caseElementaryChange(attributeCollectionReset);
				if (result == null) result = caseModelChange(attributeCollectionReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.LIST_DELETION: {
				ListDeletion listDeletion = (ListDeletion)theEObject;
				T result = caseListDeletion(listDeletion);
				if (result == null) result = caseElementaryChange(listDeletion);
				if (result == null) result = caseModelChange(listDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ASSOCIATION_LIST_DELETION: {
				AssociationListDeletion associationListDeletion = (AssociationListDeletion)theEObject;
				T result = caseAssociationListDeletion(associationListDeletion);
				if (result == null) result = caseListDeletion(associationListDeletion);
				if (result == null) result = caseElementaryChange(associationListDeletion);
				if (result == null) result = caseModelChange(associationListDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COMPOSITION_LIST_DELETION: {
				CompositionListDeletion compositionListDeletion = (CompositionListDeletion)theEObject;
				T result = caseCompositionListDeletion(compositionListDeletion);
				if (result == null) result = caseListDeletion(compositionListDeletion);
				if (result == null) result = caseElementaryChange(compositionListDeletion);
				if (result == null) result = caseModelChange(compositionListDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ATTRIBUTE_LIST_DELETION: {
				AttributeListDeletion attributeListDeletion = (AttributeListDeletion)theEObject;
				T result = caseAttributeListDeletion(attributeListDeletion);
				if (result == null) result = caseListDeletion(attributeListDeletion);
				if (result == null) result = caseElementaryChange(attributeListDeletion);
				if (result == null) result = caseModelChange(attributeListDeletion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.LIST_INSERTION: {
				ListInsertion listInsertion = (ListInsertion)theEObject;
				T result = caseListInsertion(listInsertion);
				if (result == null) result = caseElementaryChange(listInsertion);
				if (result == null) result = caseModelChange(listInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ASSOCIATION_LIST_INSERTION: {
				AssociationListInsertion associationListInsertion = (AssociationListInsertion)theEObject;
				T result = caseAssociationListInsertion(associationListInsertion);
				if (result == null) result = caseListInsertion(associationListInsertion);
				if (result == null) result = caseElementaryChange(associationListInsertion);
				if (result == null) result = caseModelChange(associationListInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COMPOSITION_LIST_INSERTION: {
				CompositionListInsertion compositionListInsertion = (CompositionListInsertion)theEObject;
				T result = caseCompositionListInsertion(compositionListInsertion);
				if (result == null) result = caseListInsertion(compositionListInsertion);
				if (result == null) result = caseElementaryChange(compositionListInsertion);
				if (result == null) result = caseModelChange(compositionListInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ATTRIBUTE_LIST_INSERTION: {
				AttributeListInsertion attributeListInsertion = (AttributeListInsertion)theEObject;
				T result = caseAttributeListInsertion(attributeListInsertion);
				if (result == null) result = caseListInsertion(attributeListInsertion);
				if (result == null) result = caseElementaryChange(attributeListInsertion);
				if (result == null) result = caseModelChange(attributeListInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.PROPERTY_CHANGE: {
				PropertyChange propertyChange = (PropertyChange)theEObject;
				T result = casePropertyChange(propertyChange);
				if (result == null) result = caseElementaryChange(propertyChange);
				if (result == null) result = caseModelChange(propertyChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ATTRIBUTE_CHANGE: {
				AttributeChange attributeChange = (AttributeChange)theEObject;
				T result = caseAttributeChange(attributeChange);
				if (result == null) result = casePropertyChange(attributeChange);
				if (result == null) result = caseElementaryChange(attributeChange);
				if (result == null) result = caseModelChange(attributeChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.ASSOCIATION_CHANGE: {
				AssociationChange associationChange = (AssociationChange)theEObject;
				T result = caseAssociationChange(associationChange);
				if (result == null) result = casePropertyChange(associationChange);
				if (result == null) result = caseElementaryChange(associationChange);
				if (result == null) result = caseModelChange(associationChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChangesPackage.COMPOSITION_CHANGE: {
				CompositionChange compositionChange = (CompositionChange)theEObject;
				T result = caseCompositionChange(compositionChange);
				if (result == null) result = casePropertyChange(compositionChange);
				if (result == null) result = caseElementaryChange(compositionChange);
				if (result == null) result = caseModelChange(compositionChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Change Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Change Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelChangeSet(ModelChangeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelChange(ModelChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryChange(ElementaryChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Change Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Change Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryChangeTransaction(ElementaryChangeTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionDeletion(CollectionDeletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Collection Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Collection Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationCollectionDeletion(AssociationCollectionDeletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Collection Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Collection Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionCollectionDeletion(CompositionCollectionDeletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Collection Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Collection Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeCollectionDeletion(AttributeCollectionDeletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionInsertion(CollectionInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Collection Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Collection Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationCollectionInsertion(AssociationCollectionInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Collection Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Collection Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionCollectionInsertion(CompositionCollectionInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Collection Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Collection Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeCollectionInsertion(AttributeCollectionInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionReset(CollectionReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Collection Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Collection Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationCollectionReset(AssociationCollectionReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Collection Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Collection Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionCollectionReset(CompositionCollectionReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Collection Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Collection Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeCollectionReset(AttributeCollectionReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListDeletion(ListDeletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association List Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association List Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationListDeletion(AssociationListDeletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition List Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition List Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionListDeletion(CompositionListDeletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute List Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute List Deletion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeListDeletion(AttributeListDeletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListInsertion(ListInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association List Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association List Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationListInsertion(AssociationListInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition List Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition List Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionListInsertion(CompositionListInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute List Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute List Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeListInsertion(AttributeListInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyChange(PropertyChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeChange(AttributeChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationChange(AssociationChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionChange(CompositionChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ChangesSwitch
