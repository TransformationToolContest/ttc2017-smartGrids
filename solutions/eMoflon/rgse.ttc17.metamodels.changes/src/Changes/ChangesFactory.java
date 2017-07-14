/**
 */
package Changes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Changes.ChangesPackage
 * @generated
 */
public interface ChangesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChangesFactory eINSTANCE = Changes.impl.ChangesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Change Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Change Set</em>'.
	 * @generated
	 */
	ModelChangeSet createModelChangeSet();

	/**
	 * Returns a new object of class '<em>Elementary Change Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementary Change Transaction</em>'.
	 * @generated
	 */
	ElementaryChangeTransaction createElementaryChangeTransaction();

	/**
	 * Returns a new object of class '<em>Association Collection Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Collection Deletion</em>'.
	 * @generated
	 */
	AssociationCollectionDeletion createAssociationCollectionDeletion();

	/**
	 * Returns a new object of class '<em>Composition Collection Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Collection Deletion</em>'.
	 * @generated
	 */
	CompositionCollectionDeletion createCompositionCollectionDeletion();

	/**
	 * Returns a new object of class '<em>Attribute Collection Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Collection Deletion</em>'.
	 * @generated
	 */
	AttributeCollectionDeletion createAttributeCollectionDeletion();

	/**
	 * Returns a new object of class '<em>Association Collection Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Collection Insertion</em>'.
	 * @generated
	 */
	AssociationCollectionInsertion createAssociationCollectionInsertion();

	/**
	 * Returns a new object of class '<em>Composition Collection Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Collection Insertion</em>'.
	 * @generated
	 */
	CompositionCollectionInsertion createCompositionCollectionInsertion();

	/**
	 * Returns a new object of class '<em>Attribute Collection Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Collection Insertion</em>'.
	 * @generated
	 */
	AttributeCollectionInsertion createAttributeCollectionInsertion();

	/**
	 * Returns a new object of class '<em>Association Collection Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Collection Reset</em>'.
	 * @generated
	 */
	AssociationCollectionReset createAssociationCollectionReset();

	/**
	 * Returns a new object of class '<em>Composition Collection Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Collection Reset</em>'.
	 * @generated
	 */
	CompositionCollectionReset createCompositionCollectionReset();

	/**
	 * Returns a new object of class '<em>Attribute Collection Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Collection Reset</em>'.
	 * @generated
	 */
	AttributeCollectionReset createAttributeCollectionReset();

	/**
	 * Returns a new object of class '<em>Association List Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association List Deletion</em>'.
	 * @generated
	 */
	AssociationListDeletion createAssociationListDeletion();

	/**
	 * Returns a new object of class '<em>Composition List Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition List Deletion</em>'.
	 * @generated
	 */
	CompositionListDeletion createCompositionListDeletion();

	/**
	 * Returns a new object of class '<em>Attribute List Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute List Deletion</em>'.
	 * @generated
	 */
	AttributeListDeletion createAttributeListDeletion();

	/**
	 * Returns a new object of class '<em>Association List Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association List Insertion</em>'.
	 * @generated
	 */
	AssociationListInsertion createAssociationListInsertion();

	/**
	 * Returns a new object of class '<em>Composition List Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition List Insertion</em>'.
	 * @generated
	 */
	CompositionListInsertion createCompositionListInsertion();

	/**
	 * Returns a new object of class '<em>Attribute List Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute List Insertion</em>'.
	 * @generated
	 */
	AttributeListInsertion createAttributeListInsertion();

	/**
	 * Returns a new object of class '<em>Attribute Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Change</em>'.
	 * @generated
	 */
	AttributeChange createAttributeChange();

	/**
	 * Returns a new object of class '<em>Association Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Change</em>'.
	 * @generated
	 */
	AssociationChange createAssociationChange();

	/**
	 * Returns a new object of class '<em>Composition Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Change</em>'.
	 * @generated
	 */
	CompositionChange createCompositionChange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChangesPackage getChangesPackage();

} //ChangesFactory
