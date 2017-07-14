/**
 */
package Changes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Changes.ChangesFactory
 * @model kind="package"
 * @generated
 */
public interface ChangesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Changes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nmf.codeplex.com/changes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "changes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChangesPackage eINSTANCE = Changes.impl.ChangesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Changes.impl.ModelChangeSetImpl <em>Model Change Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.ModelChangeSetImpl
	 * @see Changes.impl.ChangesPackageImpl#getModelChangeSet()
	 * @generated
	 */
	int MODEL_CHANGE_SET = 0;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHANGE_SET__CHANGES = 0;

	/**
	 * The number of structural features of the '<em>Model Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHANGE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHANGE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Changes.impl.ModelChangeImpl <em>Model Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.ModelChangeImpl
	 * @see Changes.impl.ChangesPackageImpl#getModelChange()
	 * @generated
	 */
	int MODEL_CHANGE = 1;

	/**
	 * The number of structural features of the '<em>Model Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHANGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Changes.impl.ElementaryChangeImpl <em>Elementary Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.ElementaryChangeImpl
	 * @see Changes.impl.ChangesPackageImpl#getElementaryChange()
	 * @generated
	 */
	int ELEMENTARY_CHANGE = 2;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE__AFFECTED_ELEMENT = MODEL_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE__FEATURE = MODEL_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elementary Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE_FEATURE_COUNT = MODEL_CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elementary Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE_OPERATION_COUNT = MODEL_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.ElementaryChangeTransactionImpl <em>Elementary Change Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.ElementaryChangeTransactionImpl
	 * @see Changes.impl.ChangesPackageImpl#getElementaryChangeTransaction()
	 * @generated
	 */
	int ELEMENTARY_CHANGE_TRANSACTION = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE_TRANSACTION__AFFECTED_ELEMENT = ELEMENTARY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE_TRANSACTION__FEATURE = ELEMENTARY_CHANGE__FEATURE;

	/**
	 * The feature id for the '<em><b>Source Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE = ELEMENTARY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES = ELEMENTARY_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elementary Change Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE_TRANSACTION_FEATURE_COUNT = ELEMENTARY_CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elementary Change Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_CHANGE_TRANSACTION_OPERATION_COUNT = ELEMENTARY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CollectionDeletionImpl <em>Collection Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CollectionDeletionImpl
	 * @see Changes.impl.ChangesPackageImpl#getCollectionDeletion()
	 * @generated
	 */
	int COLLECTION_DELETION = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DELETION__AFFECTED_ELEMENT = ELEMENTARY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DELETION__FEATURE = ELEMENTARY_CHANGE__FEATURE;

	/**
	 * The number of structural features of the '<em>Collection Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DELETION_FEATURE_COUNT = ELEMENTARY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DELETION_OPERATION_COUNT = ELEMENTARY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AssociationCollectionDeletionImpl <em>Association Collection Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AssociationCollectionDeletionImpl
	 * @see Changes.impl.ChangesPackageImpl#getAssociationCollectionDeletion()
	 * @generated
	 */
	int ASSOCIATION_COLLECTION_DELETION = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_DELETION__AFFECTED_ELEMENT = COLLECTION_DELETION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_DELETION__FEATURE = COLLECTION_DELETION__FEATURE;

	/**
	 * The feature id for the '<em><b>Deleted Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_DELETION__DELETED_ELEMENT = COLLECTION_DELETION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Collection Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_DELETION_FEATURE_COUNT = COLLECTION_DELETION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association Collection Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_DELETION_OPERATION_COUNT = COLLECTION_DELETION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CompositionCollectionDeletionImpl <em>Composition Collection Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CompositionCollectionDeletionImpl
	 * @see Changes.impl.ChangesPackageImpl#getCompositionCollectionDeletion()
	 * @generated
	 */
	int COMPOSITION_COLLECTION_DELETION = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_DELETION__AFFECTED_ELEMENT = COLLECTION_DELETION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_DELETION__FEATURE = COLLECTION_DELETION__FEATURE;

	/**
	 * The feature id for the '<em><b>Deleted Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT = COLLECTION_DELETION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition Collection Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_DELETION_FEATURE_COUNT = COLLECTION_DELETION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition Collection Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_DELETION_OPERATION_COUNT = COLLECTION_DELETION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AttributeCollectionDeletionImpl <em>Attribute Collection Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AttributeCollectionDeletionImpl
	 * @see Changes.impl.ChangesPackageImpl#getAttributeCollectionDeletion()
	 * @generated
	 */
	int ATTRIBUTE_COLLECTION_DELETION = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_DELETION__AFFECTED_ELEMENT = COLLECTION_DELETION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_DELETION__FEATURE = COLLECTION_DELETION__FEATURE;

	/**
	 * The feature id for the '<em><b>Deleted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_DELETION__DELETED_VALUE = COLLECTION_DELETION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Collection Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_DELETION_FEATURE_COUNT = COLLECTION_DELETION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Collection Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_DELETION_OPERATION_COUNT = COLLECTION_DELETION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CollectionInsertionImpl <em>Collection Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CollectionInsertionImpl
	 * @see Changes.impl.ChangesPackageImpl#getCollectionInsertion()
	 * @generated
	 */
	int COLLECTION_INSERTION = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INSERTION__AFFECTED_ELEMENT = ELEMENTARY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INSERTION__FEATURE = ELEMENTARY_CHANGE__FEATURE;

	/**
	 * The number of structural features of the '<em>Collection Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INSERTION_FEATURE_COUNT = ELEMENTARY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INSERTION_OPERATION_COUNT = ELEMENTARY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AssociationCollectionInsertionImpl <em>Association Collection Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AssociationCollectionInsertionImpl
	 * @see Changes.impl.ChangesPackageImpl#getAssociationCollectionInsertion()
	 * @generated
	 */
	int ASSOCIATION_COLLECTION_INSERTION = 9;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_INSERTION__AFFECTED_ELEMENT = COLLECTION_INSERTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_INSERTION__FEATURE = COLLECTION_INSERTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Added Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_INSERTION__ADDED_ELEMENT = COLLECTION_INSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Collection Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_INSERTION_FEATURE_COUNT = COLLECTION_INSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association Collection Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_INSERTION_OPERATION_COUNT = COLLECTION_INSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CompositionCollectionInsertionImpl <em>Composition Collection Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CompositionCollectionInsertionImpl
	 * @see Changes.impl.ChangesPackageImpl#getCompositionCollectionInsertion()
	 * @generated
	 */
	int COMPOSITION_COLLECTION_INSERTION = 10;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_INSERTION__AFFECTED_ELEMENT = COLLECTION_INSERTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_INSERTION__FEATURE = COLLECTION_INSERTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Added Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT = COLLECTION_INSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition Collection Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_INSERTION_FEATURE_COUNT = COLLECTION_INSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition Collection Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_INSERTION_OPERATION_COUNT = COLLECTION_INSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AttributeCollectionInsertionImpl <em>Attribute Collection Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AttributeCollectionInsertionImpl
	 * @see Changes.impl.ChangesPackageImpl#getAttributeCollectionInsertion()
	 * @generated
	 */
	int ATTRIBUTE_COLLECTION_INSERTION = 11;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_INSERTION__AFFECTED_ELEMENT = COLLECTION_INSERTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_INSERTION__FEATURE = COLLECTION_INSERTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Added Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_INSERTION__ADDED_VALUE = COLLECTION_INSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Collection Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_INSERTION_FEATURE_COUNT = COLLECTION_INSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Collection Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_INSERTION_OPERATION_COUNT = COLLECTION_INSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CollectionResetImpl <em>Collection Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CollectionResetImpl
	 * @see Changes.impl.ChangesPackageImpl#getCollectionReset()
	 * @generated
	 */
	int COLLECTION_RESET = 12;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESET__AFFECTED_ELEMENT = ELEMENTARY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESET__FEATURE = ELEMENTARY_CHANGE__FEATURE;

	/**
	 * The number of structural features of the '<em>Collection Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESET_FEATURE_COUNT = ELEMENTARY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESET_OPERATION_COUNT = ELEMENTARY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AssociationCollectionResetImpl <em>Association Collection Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AssociationCollectionResetImpl
	 * @see Changes.impl.ChangesPackageImpl#getAssociationCollectionReset()
	 * @generated
	 */
	int ASSOCIATION_COLLECTION_RESET = 13;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_RESET__AFFECTED_ELEMENT = COLLECTION_RESET__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_RESET__FEATURE = COLLECTION_RESET__FEATURE;

	/**
	 * The number of structural features of the '<em>Association Collection Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_RESET_FEATURE_COUNT = COLLECTION_RESET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association Collection Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_COLLECTION_RESET_OPERATION_COUNT = COLLECTION_RESET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CompositionCollectionResetImpl <em>Composition Collection Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CompositionCollectionResetImpl
	 * @see Changes.impl.ChangesPackageImpl#getCompositionCollectionReset()
	 * @generated
	 */
	int COMPOSITION_COLLECTION_RESET = 14;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_RESET__AFFECTED_ELEMENT = COLLECTION_RESET__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_RESET__FEATURE = COLLECTION_RESET__FEATURE;

	/**
	 * The number of structural features of the '<em>Composition Collection Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_RESET_FEATURE_COUNT = COLLECTION_RESET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition Collection Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_COLLECTION_RESET_OPERATION_COUNT = COLLECTION_RESET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AttributeCollectionResetImpl <em>Attribute Collection Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AttributeCollectionResetImpl
	 * @see Changes.impl.ChangesPackageImpl#getAttributeCollectionReset()
	 * @generated
	 */
	int ATTRIBUTE_COLLECTION_RESET = 15;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_RESET__AFFECTED_ELEMENT = COLLECTION_RESET__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_RESET__FEATURE = COLLECTION_RESET__FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute Collection Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_RESET_FEATURE_COUNT = COLLECTION_RESET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Collection Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COLLECTION_RESET_OPERATION_COUNT = COLLECTION_RESET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.ListDeletionImpl <em>List Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.ListDeletionImpl
	 * @see Changes.impl.ChangesPackageImpl#getListDeletion()
	 * @generated
	 */
	int LIST_DELETION = 16;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DELETION__AFFECTED_ELEMENT = ELEMENTARY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DELETION__FEATURE = ELEMENTARY_CHANGE__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DELETION__INDEX = ELEMENTARY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DELETION_FEATURE_COUNT = ELEMENTARY_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DELETION_OPERATION_COUNT = ELEMENTARY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AssociationListDeletionImpl <em>Association List Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AssociationListDeletionImpl
	 * @see Changes.impl.ChangesPackageImpl#getAssociationListDeletion()
	 * @generated
	 */
	int ASSOCIATION_LIST_DELETION = 17;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_DELETION__AFFECTED_ELEMENT = LIST_DELETION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_DELETION__FEATURE = LIST_DELETION__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_DELETION__INDEX = LIST_DELETION__INDEX;

	/**
	 * The feature id for the '<em><b>Deleted Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_DELETION__DELETED_ELEMENT = LIST_DELETION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association List Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_DELETION_FEATURE_COUNT = LIST_DELETION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association List Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_DELETION_OPERATION_COUNT = LIST_DELETION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CompositionListDeletionImpl <em>Composition List Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CompositionListDeletionImpl
	 * @see Changes.impl.ChangesPackageImpl#getCompositionListDeletion()
	 * @generated
	 */
	int COMPOSITION_LIST_DELETION = 18;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_DELETION__AFFECTED_ELEMENT = LIST_DELETION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_DELETION__FEATURE = LIST_DELETION__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_DELETION__INDEX = LIST_DELETION__INDEX;

	/**
	 * The feature id for the '<em><b>Deleted Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_DELETION__DELETED_ELEMENT = LIST_DELETION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition List Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_DELETION_FEATURE_COUNT = LIST_DELETION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition List Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_DELETION_OPERATION_COUNT = LIST_DELETION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AttributeListDeletionImpl <em>Attribute List Deletion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AttributeListDeletionImpl
	 * @see Changes.impl.ChangesPackageImpl#getAttributeListDeletion()
	 * @generated
	 */
	int ATTRIBUTE_LIST_DELETION = 19;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_DELETION__AFFECTED_ELEMENT = LIST_DELETION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_DELETION__FEATURE = LIST_DELETION__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_DELETION__INDEX = LIST_DELETION__INDEX;

	/**
	 * The feature id for the '<em><b>Deleted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_DELETION__DELETED_VALUE = LIST_DELETION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute List Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_DELETION_FEATURE_COUNT = LIST_DELETION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute List Deletion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_DELETION_OPERATION_COUNT = LIST_DELETION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.ListInsertionImpl <em>List Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.ListInsertionImpl
	 * @see Changes.impl.ChangesPackageImpl#getListInsertion()
	 * @generated
	 */
	int LIST_INSERTION = 20;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INSERTION__AFFECTED_ELEMENT = ELEMENTARY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INSERTION__FEATURE = ELEMENTARY_CHANGE__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INSERTION__INDEX = ELEMENTARY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INSERTION_FEATURE_COUNT = ELEMENTARY_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INSERTION_OPERATION_COUNT = ELEMENTARY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AssociationListInsertionImpl <em>Association List Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AssociationListInsertionImpl
	 * @see Changes.impl.ChangesPackageImpl#getAssociationListInsertion()
	 * @generated
	 */
	int ASSOCIATION_LIST_INSERTION = 21;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_INSERTION__AFFECTED_ELEMENT = LIST_INSERTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_INSERTION__FEATURE = LIST_INSERTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_INSERTION__INDEX = LIST_INSERTION__INDEX;

	/**
	 * The feature id for the '<em><b>Added Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_INSERTION__ADDED_ELEMENT = LIST_INSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association List Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_INSERTION_FEATURE_COUNT = LIST_INSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association List Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_LIST_INSERTION_OPERATION_COUNT = LIST_INSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CompositionListInsertionImpl <em>Composition List Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CompositionListInsertionImpl
	 * @see Changes.impl.ChangesPackageImpl#getCompositionListInsertion()
	 * @generated
	 */
	int COMPOSITION_LIST_INSERTION = 22;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_INSERTION__AFFECTED_ELEMENT = LIST_INSERTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_INSERTION__FEATURE = LIST_INSERTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_INSERTION__INDEX = LIST_INSERTION__INDEX;

	/**
	 * The feature id for the '<em><b>Added Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_INSERTION__ADDED_ELEMENT = LIST_INSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition List Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_INSERTION_FEATURE_COUNT = LIST_INSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition List Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_LIST_INSERTION_OPERATION_COUNT = LIST_INSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AttributeListInsertionImpl <em>Attribute List Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AttributeListInsertionImpl
	 * @see Changes.impl.ChangesPackageImpl#getAttributeListInsertion()
	 * @generated
	 */
	int ATTRIBUTE_LIST_INSERTION = 23;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_INSERTION__AFFECTED_ELEMENT = LIST_INSERTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_INSERTION__FEATURE = LIST_INSERTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_INSERTION__INDEX = LIST_INSERTION__INDEX;

	/**
	 * The feature id for the '<em><b>Added Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_INSERTION__ADDED_VALUE = LIST_INSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute List Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_INSERTION_FEATURE_COUNT = LIST_INSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute List Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LIST_INSERTION_OPERATION_COUNT = LIST_INSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.PropertyChangeImpl <em>Property Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.PropertyChangeImpl
	 * @see Changes.impl.ChangesPackageImpl#getPropertyChange()
	 * @generated
	 */
	int PROPERTY_CHANGE = 24;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHANGE__AFFECTED_ELEMENT = ELEMENTARY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHANGE__FEATURE = ELEMENTARY_CHANGE__FEATURE;

	/**
	 * The number of structural features of the '<em>Property Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHANGE_FEATURE_COUNT = ELEMENTARY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CHANGE_OPERATION_COUNT = ELEMENTARY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AttributeChangeImpl <em>Attribute Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AttributeChangeImpl
	 * @see Changes.impl.ChangesPackageImpl#getAttributeChange()
	 * @generated
	 */
	int ATTRIBUTE_CHANGE = 25;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE__AFFECTED_ELEMENT = PROPERTY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE__FEATURE = PROPERTY_CHANGE__FEATURE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE__NEW_VALUE = PROPERTY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE__OLD_VALUE = PROPERTY_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_FEATURE_COUNT = PROPERTY_CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_OPERATION_COUNT = PROPERTY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.AssociationChangeImpl <em>Association Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.AssociationChangeImpl
	 * @see Changes.impl.ChangesPackageImpl#getAssociationChange()
	 * @generated
	 */
	int ASSOCIATION_CHANGE = 26;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CHANGE__AFFECTED_ELEMENT = PROPERTY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CHANGE__FEATURE = PROPERTY_CHANGE__FEATURE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CHANGE__NEW_VALUE = PROPERTY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CHANGE__OLD_VALUE = PROPERTY_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CHANGE_FEATURE_COUNT = PROPERTY_CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Association Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CHANGE_OPERATION_COUNT = PROPERTY_CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Changes.impl.CompositionChangeImpl <em>Composition Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Changes.impl.CompositionChangeImpl
	 * @see Changes.impl.ChangesPackageImpl#getCompositionChange()
	 * @generated
	 */
	int COMPOSITION_CHANGE = 27;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CHANGE__AFFECTED_ELEMENT = PROPERTY_CHANGE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CHANGE__FEATURE = PROPERTY_CHANGE__FEATURE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CHANGE__NEW_VALUE = PROPERTY_CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CHANGE__OLD_VALUE = PROPERTY_CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composition Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CHANGE_FEATURE_COUNT = PROPERTY_CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composition Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_CHANGE_OPERATION_COUNT = PROPERTY_CHANGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Changes.ModelChangeSet <em>Model Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Change Set</em>'.
	 * @see Changes.ModelChangeSet
	 * @generated
	 */
	EClass getModelChangeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link Changes.ModelChangeSet#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changes</em>'.
	 * @see Changes.ModelChangeSet#getChanges()
	 * @see #getModelChangeSet()
	 * @generated
	 */
	EReference getModelChangeSet_Changes();

	/**
	 * Returns the meta object for class '{@link Changes.ModelChange <em>Model Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Change</em>'.
	 * @see Changes.ModelChange
	 * @generated
	 */
	EClass getModelChange();

	/**
	 * Returns the meta object for class '{@link Changes.ElementaryChange <em>Elementary Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Change</em>'.
	 * @see Changes.ElementaryChange
	 * @generated
	 */
	EClass getElementaryChange();

	/**
	 * Returns the meta object for the reference '{@link Changes.ElementaryChange#getAffectedElement <em>Affected Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Element</em>'.
	 * @see Changes.ElementaryChange#getAffectedElement()
	 * @see #getElementaryChange()
	 * @generated
	 */
	EReference getElementaryChange_AffectedElement();

	/**
	 * Returns the meta object for the reference '{@link Changes.ElementaryChange#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see Changes.ElementaryChange#getFeature()
	 * @see #getElementaryChange()
	 * @generated
	 */
	EReference getElementaryChange_Feature();

	/**
	 * Returns the meta object for class '{@link Changes.ElementaryChangeTransaction <em>Elementary Change Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Change Transaction</em>'.
	 * @see Changes.ElementaryChangeTransaction
	 * @generated
	 */
	EClass getElementaryChangeTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link Changes.ElementaryChangeTransaction#getSourceChange <em>Source Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Change</em>'.
	 * @see Changes.ElementaryChangeTransaction#getSourceChange()
	 * @see #getElementaryChangeTransaction()
	 * @generated
	 */
	EReference getElementaryChangeTransaction_SourceChange();

	/**
	 * Returns the meta object for the containment reference list '{@link Changes.ElementaryChangeTransaction#getNestedChanges <em>Nested Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Changes</em>'.
	 * @see Changes.ElementaryChangeTransaction#getNestedChanges()
	 * @see #getElementaryChangeTransaction()
	 * @generated
	 */
	EReference getElementaryChangeTransaction_NestedChanges();

	/**
	 * Returns the meta object for class '{@link Changes.CollectionDeletion <em>Collection Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Deletion</em>'.
	 * @see Changes.CollectionDeletion
	 * @generated
	 */
	EClass getCollectionDeletion();

	/**
	 * Returns the meta object for class '{@link Changes.AssociationCollectionDeletion <em>Association Collection Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Collection Deletion</em>'.
	 * @see Changes.AssociationCollectionDeletion
	 * @generated
	 */
	EClass getAssociationCollectionDeletion();

	/**
	 * Returns the meta object for the reference '{@link Changes.AssociationCollectionDeletion#getDeletedElement <em>Deleted Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deleted Element</em>'.
	 * @see Changes.AssociationCollectionDeletion#getDeletedElement()
	 * @see #getAssociationCollectionDeletion()
	 * @generated
	 */
	EReference getAssociationCollectionDeletion_DeletedElement();

	/**
	 * Returns the meta object for class '{@link Changes.CompositionCollectionDeletion <em>Composition Collection Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Collection Deletion</em>'.
	 * @see Changes.CompositionCollectionDeletion
	 * @generated
	 */
	EClass getCompositionCollectionDeletion();

	/**
	 * Returns the meta object for the reference '{@link Changes.CompositionCollectionDeletion#getDeletedElement <em>Deleted Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deleted Element</em>'.
	 * @see Changes.CompositionCollectionDeletion#getDeletedElement()
	 * @see #getCompositionCollectionDeletion()
	 * @generated
	 */
	EReference getCompositionCollectionDeletion_DeletedElement();

	/**
	 * Returns the meta object for class '{@link Changes.AttributeCollectionDeletion <em>Attribute Collection Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Collection Deletion</em>'.
	 * @see Changes.AttributeCollectionDeletion
	 * @generated
	 */
	EClass getAttributeCollectionDeletion();

	/**
	 * Returns the meta object for the attribute '{@link Changes.AttributeCollectionDeletion#getDeletedValue <em>Deleted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Value</em>'.
	 * @see Changes.AttributeCollectionDeletion#getDeletedValue()
	 * @see #getAttributeCollectionDeletion()
	 * @generated
	 */
	EAttribute getAttributeCollectionDeletion_DeletedValue();

	/**
	 * Returns the meta object for class '{@link Changes.CollectionInsertion <em>Collection Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Insertion</em>'.
	 * @see Changes.CollectionInsertion
	 * @generated
	 */
	EClass getCollectionInsertion();

	/**
	 * Returns the meta object for class '{@link Changes.AssociationCollectionInsertion <em>Association Collection Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Collection Insertion</em>'.
	 * @see Changes.AssociationCollectionInsertion
	 * @generated
	 */
	EClass getAssociationCollectionInsertion();

	/**
	 * Returns the meta object for the reference '{@link Changes.AssociationCollectionInsertion#getAddedElement <em>Added Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Added Element</em>'.
	 * @see Changes.AssociationCollectionInsertion#getAddedElement()
	 * @see #getAssociationCollectionInsertion()
	 * @generated
	 */
	EReference getAssociationCollectionInsertion_AddedElement();

	/**
	 * Returns the meta object for class '{@link Changes.CompositionCollectionInsertion <em>Composition Collection Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Collection Insertion</em>'.
	 * @see Changes.CompositionCollectionInsertion
	 * @generated
	 */
	EClass getCompositionCollectionInsertion();

	/**
	 * Returns the meta object for the containment reference '{@link Changes.CompositionCollectionInsertion#getAddedElement <em>Added Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Added Element</em>'.
	 * @see Changes.CompositionCollectionInsertion#getAddedElement()
	 * @see #getCompositionCollectionInsertion()
	 * @generated
	 */
	EReference getCompositionCollectionInsertion_AddedElement();

	/**
	 * Returns the meta object for class '{@link Changes.AttributeCollectionInsertion <em>Attribute Collection Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Collection Insertion</em>'.
	 * @see Changes.AttributeCollectionInsertion
	 * @generated
	 */
	EClass getAttributeCollectionInsertion();

	/**
	 * Returns the meta object for the attribute '{@link Changes.AttributeCollectionInsertion#getAddedValue <em>Added Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Added Value</em>'.
	 * @see Changes.AttributeCollectionInsertion#getAddedValue()
	 * @see #getAttributeCollectionInsertion()
	 * @generated
	 */
	EAttribute getAttributeCollectionInsertion_AddedValue();

	/**
	 * Returns the meta object for class '{@link Changes.CollectionReset <em>Collection Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Reset</em>'.
	 * @see Changes.CollectionReset
	 * @generated
	 */
	EClass getCollectionReset();

	/**
	 * Returns the meta object for class '{@link Changes.AssociationCollectionReset <em>Association Collection Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Collection Reset</em>'.
	 * @see Changes.AssociationCollectionReset
	 * @generated
	 */
	EClass getAssociationCollectionReset();

	/**
	 * Returns the meta object for class '{@link Changes.CompositionCollectionReset <em>Composition Collection Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Collection Reset</em>'.
	 * @see Changes.CompositionCollectionReset
	 * @generated
	 */
	EClass getCompositionCollectionReset();

	/**
	 * Returns the meta object for class '{@link Changes.AttributeCollectionReset <em>Attribute Collection Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Collection Reset</em>'.
	 * @see Changes.AttributeCollectionReset
	 * @generated
	 */
	EClass getAttributeCollectionReset();

	/**
	 * Returns the meta object for class '{@link Changes.ListDeletion <em>List Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Deletion</em>'.
	 * @see Changes.ListDeletion
	 * @generated
	 */
	EClass getListDeletion();

	/**
	 * Returns the meta object for the attribute '{@link Changes.ListDeletion#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see Changes.ListDeletion#getIndex()
	 * @see #getListDeletion()
	 * @generated
	 */
	EAttribute getListDeletion_Index();

	/**
	 * Returns the meta object for class '{@link Changes.AssociationListDeletion <em>Association List Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association List Deletion</em>'.
	 * @see Changes.AssociationListDeletion
	 * @generated
	 */
	EClass getAssociationListDeletion();

	/**
	 * Returns the meta object for the reference '{@link Changes.AssociationListDeletion#getDeletedElement <em>Deleted Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deleted Element</em>'.
	 * @see Changes.AssociationListDeletion#getDeletedElement()
	 * @see #getAssociationListDeletion()
	 * @generated
	 */
	EReference getAssociationListDeletion_DeletedElement();

	/**
	 * Returns the meta object for class '{@link Changes.CompositionListDeletion <em>Composition List Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition List Deletion</em>'.
	 * @see Changes.CompositionListDeletion
	 * @generated
	 */
	EClass getCompositionListDeletion();

	/**
	 * Returns the meta object for the reference '{@link Changes.CompositionListDeletion#getDeletedElement <em>Deleted Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deleted Element</em>'.
	 * @see Changes.CompositionListDeletion#getDeletedElement()
	 * @see #getCompositionListDeletion()
	 * @generated
	 */
	EReference getCompositionListDeletion_DeletedElement();

	/**
	 * Returns the meta object for class '{@link Changes.AttributeListDeletion <em>Attribute List Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute List Deletion</em>'.
	 * @see Changes.AttributeListDeletion
	 * @generated
	 */
	EClass getAttributeListDeletion();

	/**
	 * Returns the meta object for the attribute '{@link Changes.AttributeListDeletion#getDeletedValue <em>Deleted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Value</em>'.
	 * @see Changes.AttributeListDeletion#getDeletedValue()
	 * @see #getAttributeListDeletion()
	 * @generated
	 */
	EAttribute getAttributeListDeletion_DeletedValue();

	/**
	 * Returns the meta object for class '{@link Changes.ListInsertion <em>List Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Insertion</em>'.
	 * @see Changes.ListInsertion
	 * @generated
	 */
	EClass getListInsertion();

	/**
	 * Returns the meta object for the attribute '{@link Changes.ListInsertion#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see Changes.ListInsertion#getIndex()
	 * @see #getListInsertion()
	 * @generated
	 */
	EAttribute getListInsertion_Index();

	/**
	 * Returns the meta object for class '{@link Changes.AssociationListInsertion <em>Association List Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association List Insertion</em>'.
	 * @see Changes.AssociationListInsertion
	 * @generated
	 */
	EClass getAssociationListInsertion();

	/**
	 * Returns the meta object for the reference '{@link Changes.AssociationListInsertion#getAddedElement <em>Added Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Added Element</em>'.
	 * @see Changes.AssociationListInsertion#getAddedElement()
	 * @see #getAssociationListInsertion()
	 * @generated
	 */
	EReference getAssociationListInsertion_AddedElement();

	/**
	 * Returns the meta object for class '{@link Changes.CompositionListInsertion <em>Composition List Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition List Insertion</em>'.
	 * @see Changes.CompositionListInsertion
	 * @generated
	 */
	EClass getCompositionListInsertion();

	/**
	 * Returns the meta object for the containment reference '{@link Changes.CompositionListInsertion#getAddedElement <em>Added Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Added Element</em>'.
	 * @see Changes.CompositionListInsertion#getAddedElement()
	 * @see #getCompositionListInsertion()
	 * @generated
	 */
	EReference getCompositionListInsertion_AddedElement();

	/**
	 * Returns the meta object for class '{@link Changes.AttributeListInsertion <em>Attribute List Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute List Insertion</em>'.
	 * @see Changes.AttributeListInsertion
	 * @generated
	 */
	EClass getAttributeListInsertion();

	/**
	 * Returns the meta object for the attribute '{@link Changes.AttributeListInsertion#getAddedValue <em>Added Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Added Value</em>'.
	 * @see Changes.AttributeListInsertion#getAddedValue()
	 * @see #getAttributeListInsertion()
	 * @generated
	 */
	EAttribute getAttributeListInsertion_AddedValue();

	/**
	 * Returns the meta object for class '{@link Changes.PropertyChange <em>Property Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Change</em>'.
	 * @see Changes.PropertyChange
	 * @generated
	 */
	EClass getPropertyChange();

	/**
	 * Returns the meta object for class '{@link Changes.AttributeChange <em>Attribute Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Change</em>'.
	 * @see Changes.AttributeChange
	 * @generated
	 */
	EClass getAttributeChange();

	/**
	 * Returns the meta object for the attribute '{@link Changes.AttributeChange#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see Changes.AttributeChange#getNewValue()
	 * @see #getAttributeChange()
	 * @generated
	 */
	EAttribute getAttributeChange_NewValue();

	/**
	 * Returns the meta object for the attribute '{@link Changes.AttributeChange#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see Changes.AttributeChange#getOldValue()
	 * @see #getAttributeChange()
	 * @generated
	 */
	EAttribute getAttributeChange_OldValue();

	/**
	 * Returns the meta object for class '{@link Changes.AssociationChange <em>Association Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Change</em>'.
	 * @see Changes.AssociationChange
	 * @generated
	 */
	EClass getAssociationChange();

	/**
	 * Returns the meta object for the reference '{@link Changes.AssociationChange#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Value</em>'.
	 * @see Changes.AssociationChange#getNewValue()
	 * @see #getAssociationChange()
	 * @generated
	 */
	EReference getAssociationChange_NewValue();

	/**
	 * Returns the meta object for the reference '{@link Changes.AssociationChange#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Value</em>'.
	 * @see Changes.AssociationChange#getOldValue()
	 * @see #getAssociationChange()
	 * @generated
	 */
	EReference getAssociationChange_OldValue();

	/**
	 * Returns the meta object for class '{@link Changes.CompositionChange <em>Composition Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Change</em>'.
	 * @see Changes.CompositionChange
	 * @generated
	 */
	EClass getCompositionChange();

	/**
	 * Returns the meta object for the containment reference '{@link Changes.CompositionChange#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Value</em>'.
	 * @see Changes.CompositionChange#getNewValue()
	 * @see #getCompositionChange()
	 * @generated
	 */
	EReference getCompositionChange_NewValue();

	/**
	 * Returns the meta object for the reference '{@link Changes.CompositionChange#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Value</em>'.
	 * @see Changes.CompositionChange#getOldValue()
	 * @see #getCompositionChange()
	 * @generated
	 */
	EReference getCompositionChange_OldValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChangesFactory getChangesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Changes.impl.ModelChangeSetImpl <em>Model Change Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.ModelChangeSetImpl
		 * @see Changes.impl.ChangesPackageImpl#getModelChangeSet()
		 * @generated
		 */
		EClass MODEL_CHANGE_SET = eINSTANCE.getModelChangeSet();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CHANGE_SET__CHANGES = eINSTANCE.getModelChangeSet_Changes();

		/**
		 * The meta object literal for the '{@link Changes.impl.ModelChangeImpl <em>Model Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.ModelChangeImpl
		 * @see Changes.impl.ChangesPackageImpl#getModelChange()
		 * @generated
		 */
		EClass MODEL_CHANGE = eINSTANCE.getModelChange();

		/**
		 * The meta object literal for the '{@link Changes.impl.ElementaryChangeImpl <em>Elementary Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.ElementaryChangeImpl
		 * @see Changes.impl.ChangesPackageImpl#getElementaryChange()
		 * @generated
		 */
		EClass ELEMENTARY_CHANGE = eINSTANCE.getElementaryChange();

		/**
		 * The meta object literal for the '<em><b>Affected Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_CHANGE__AFFECTED_ELEMENT = eINSTANCE.getElementaryChange_AffectedElement();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_CHANGE__FEATURE = eINSTANCE.getElementaryChange_Feature();

		/**
		 * The meta object literal for the '{@link Changes.impl.ElementaryChangeTransactionImpl <em>Elementary Change Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.ElementaryChangeTransactionImpl
		 * @see Changes.impl.ChangesPackageImpl#getElementaryChangeTransaction()
		 * @generated
		 */
		EClass ELEMENTARY_CHANGE_TRANSACTION = eINSTANCE.getElementaryChangeTransaction();

		/**
		 * The meta object literal for the '<em><b>Source Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE = eINSTANCE.getElementaryChangeTransaction_SourceChange();

		/**
		 * The meta object literal for the '<em><b>Nested Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES = eINSTANCE.getElementaryChangeTransaction_NestedChanges();

		/**
		 * The meta object literal for the '{@link Changes.impl.CollectionDeletionImpl <em>Collection Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CollectionDeletionImpl
		 * @see Changes.impl.ChangesPackageImpl#getCollectionDeletion()
		 * @generated
		 */
		EClass COLLECTION_DELETION = eINSTANCE.getCollectionDeletion();

		/**
		 * The meta object literal for the '{@link Changes.impl.AssociationCollectionDeletionImpl <em>Association Collection Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AssociationCollectionDeletionImpl
		 * @see Changes.impl.ChangesPackageImpl#getAssociationCollectionDeletion()
		 * @generated
		 */
		EClass ASSOCIATION_COLLECTION_DELETION = eINSTANCE.getAssociationCollectionDeletion();

		/**
		 * The meta object literal for the '<em><b>Deleted Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_COLLECTION_DELETION__DELETED_ELEMENT = eINSTANCE.getAssociationCollectionDeletion_DeletedElement();

		/**
		 * The meta object literal for the '{@link Changes.impl.CompositionCollectionDeletionImpl <em>Composition Collection Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CompositionCollectionDeletionImpl
		 * @see Changes.impl.ChangesPackageImpl#getCompositionCollectionDeletion()
		 * @generated
		 */
		EClass COMPOSITION_COLLECTION_DELETION = eINSTANCE.getCompositionCollectionDeletion();

		/**
		 * The meta object literal for the '<em><b>Deleted Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT = eINSTANCE.getCompositionCollectionDeletion_DeletedElement();

		/**
		 * The meta object literal for the '{@link Changes.impl.AttributeCollectionDeletionImpl <em>Attribute Collection Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AttributeCollectionDeletionImpl
		 * @see Changes.impl.ChangesPackageImpl#getAttributeCollectionDeletion()
		 * @generated
		 */
		EClass ATTRIBUTE_COLLECTION_DELETION = eINSTANCE.getAttributeCollectionDeletion();

		/**
		 * The meta object literal for the '<em><b>Deleted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_COLLECTION_DELETION__DELETED_VALUE = eINSTANCE.getAttributeCollectionDeletion_DeletedValue();

		/**
		 * The meta object literal for the '{@link Changes.impl.CollectionInsertionImpl <em>Collection Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CollectionInsertionImpl
		 * @see Changes.impl.ChangesPackageImpl#getCollectionInsertion()
		 * @generated
		 */
		EClass COLLECTION_INSERTION = eINSTANCE.getCollectionInsertion();

		/**
		 * The meta object literal for the '{@link Changes.impl.AssociationCollectionInsertionImpl <em>Association Collection Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AssociationCollectionInsertionImpl
		 * @see Changes.impl.ChangesPackageImpl#getAssociationCollectionInsertion()
		 * @generated
		 */
		EClass ASSOCIATION_COLLECTION_INSERTION = eINSTANCE.getAssociationCollectionInsertion();

		/**
		 * The meta object literal for the '<em><b>Added Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_COLLECTION_INSERTION__ADDED_ELEMENT = eINSTANCE.getAssociationCollectionInsertion_AddedElement();

		/**
		 * The meta object literal for the '{@link Changes.impl.CompositionCollectionInsertionImpl <em>Composition Collection Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CompositionCollectionInsertionImpl
		 * @see Changes.impl.ChangesPackageImpl#getCompositionCollectionInsertion()
		 * @generated
		 */
		EClass COMPOSITION_COLLECTION_INSERTION = eINSTANCE.getCompositionCollectionInsertion();

		/**
		 * The meta object literal for the '<em><b>Added Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT = eINSTANCE.getCompositionCollectionInsertion_AddedElement();

		/**
		 * The meta object literal for the '{@link Changes.impl.AttributeCollectionInsertionImpl <em>Attribute Collection Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AttributeCollectionInsertionImpl
		 * @see Changes.impl.ChangesPackageImpl#getAttributeCollectionInsertion()
		 * @generated
		 */
		EClass ATTRIBUTE_COLLECTION_INSERTION = eINSTANCE.getAttributeCollectionInsertion();

		/**
		 * The meta object literal for the '<em><b>Added Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_COLLECTION_INSERTION__ADDED_VALUE = eINSTANCE.getAttributeCollectionInsertion_AddedValue();

		/**
		 * The meta object literal for the '{@link Changes.impl.CollectionResetImpl <em>Collection Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CollectionResetImpl
		 * @see Changes.impl.ChangesPackageImpl#getCollectionReset()
		 * @generated
		 */
		EClass COLLECTION_RESET = eINSTANCE.getCollectionReset();

		/**
		 * The meta object literal for the '{@link Changes.impl.AssociationCollectionResetImpl <em>Association Collection Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AssociationCollectionResetImpl
		 * @see Changes.impl.ChangesPackageImpl#getAssociationCollectionReset()
		 * @generated
		 */
		EClass ASSOCIATION_COLLECTION_RESET = eINSTANCE.getAssociationCollectionReset();

		/**
		 * The meta object literal for the '{@link Changes.impl.CompositionCollectionResetImpl <em>Composition Collection Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CompositionCollectionResetImpl
		 * @see Changes.impl.ChangesPackageImpl#getCompositionCollectionReset()
		 * @generated
		 */
		EClass COMPOSITION_COLLECTION_RESET = eINSTANCE.getCompositionCollectionReset();

		/**
		 * The meta object literal for the '{@link Changes.impl.AttributeCollectionResetImpl <em>Attribute Collection Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AttributeCollectionResetImpl
		 * @see Changes.impl.ChangesPackageImpl#getAttributeCollectionReset()
		 * @generated
		 */
		EClass ATTRIBUTE_COLLECTION_RESET = eINSTANCE.getAttributeCollectionReset();

		/**
		 * The meta object literal for the '{@link Changes.impl.ListDeletionImpl <em>List Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.ListDeletionImpl
		 * @see Changes.impl.ChangesPackageImpl#getListDeletion()
		 * @generated
		 */
		EClass LIST_DELETION = eINSTANCE.getListDeletion();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_DELETION__INDEX = eINSTANCE.getListDeletion_Index();

		/**
		 * The meta object literal for the '{@link Changes.impl.AssociationListDeletionImpl <em>Association List Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AssociationListDeletionImpl
		 * @see Changes.impl.ChangesPackageImpl#getAssociationListDeletion()
		 * @generated
		 */
		EClass ASSOCIATION_LIST_DELETION = eINSTANCE.getAssociationListDeletion();

		/**
		 * The meta object literal for the '<em><b>Deleted Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_LIST_DELETION__DELETED_ELEMENT = eINSTANCE.getAssociationListDeletion_DeletedElement();

		/**
		 * The meta object literal for the '{@link Changes.impl.CompositionListDeletionImpl <em>Composition List Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CompositionListDeletionImpl
		 * @see Changes.impl.ChangesPackageImpl#getCompositionListDeletion()
		 * @generated
		 */
		EClass COMPOSITION_LIST_DELETION = eINSTANCE.getCompositionListDeletion();

		/**
		 * The meta object literal for the '<em><b>Deleted Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_LIST_DELETION__DELETED_ELEMENT = eINSTANCE.getCompositionListDeletion_DeletedElement();

		/**
		 * The meta object literal for the '{@link Changes.impl.AttributeListDeletionImpl <em>Attribute List Deletion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AttributeListDeletionImpl
		 * @see Changes.impl.ChangesPackageImpl#getAttributeListDeletion()
		 * @generated
		 */
		EClass ATTRIBUTE_LIST_DELETION = eINSTANCE.getAttributeListDeletion();

		/**
		 * The meta object literal for the '<em><b>Deleted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_LIST_DELETION__DELETED_VALUE = eINSTANCE.getAttributeListDeletion_DeletedValue();

		/**
		 * The meta object literal for the '{@link Changes.impl.ListInsertionImpl <em>List Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.ListInsertionImpl
		 * @see Changes.impl.ChangesPackageImpl#getListInsertion()
		 * @generated
		 */
		EClass LIST_INSERTION = eINSTANCE.getListInsertion();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_INSERTION__INDEX = eINSTANCE.getListInsertion_Index();

		/**
		 * The meta object literal for the '{@link Changes.impl.AssociationListInsertionImpl <em>Association List Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AssociationListInsertionImpl
		 * @see Changes.impl.ChangesPackageImpl#getAssociationListInsertion()
		 * @generated
		 */
		EClass ASSOCIATION_LIST_INSERTION = eINSTANCE.getAssociationListInsertion();

		/**
		 * The meta object literal for the '<em><b>Added Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_LIST_INSERTION__ADDED_ELEMENT = eINSTANCE.getAssociationListInsertion_AddedElement();

		/**
		 * The meta object literal for the '{@link Changes.impl.CompositionListInsertionImpl <em>Composition List Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CompositionListInsertionImpl
		 * @see Changes.impl.ChangesPackageImpl#getCompositionListInsertion()
		 * @generated
		 */
		EClass COMPOSITION_LIST_INSERTION = eINSTANCE.getCompositionListInsertion();

		/**
		 * The meta object literal for the '<em><b>Added Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_LIST_INSERTION__ADDED_ELEMENT = eINSTANCE.getCompositionListInsertion_AddedElement();

		/**
		 * The meta object literal for the '{@link Changes.impl.AttributeListInsertionImpl <em>Attribute List Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AttributeListInsertionImpl
		 * @see Changes.impl.ChangesPackageImpl#getAttributeListInsertion()
		 * @generated
		 */
		EClass ATTRIBUTE_LIST_INSERTION = eINSTANCE.getAttributeListInsertion();

		/**
		 * The meta object literal for the '<em><b>Added Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_LIST_INSERTION__ADDED_VALUE = eINSTANCE.getAttributeListInsertion_AddedValue();

		/**
		 * The meta object literal for the '{@link Changes.impl.PropertyChangeImpl <em>Property Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.PropertyChangeImpl
		 * @see Changes.impl.ChangesPackageImpl#getPropertyChange()
		 * @generated
		 */
		EClass PROPERTY_CHANGE = eINSTANCE.getPropertyChange();

		/**
		 * The meta object literal for the '{@link Changes.impl.AttributeChangeImpl <em>Attribute Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AttributeChangeImpl
		 * @see Changes.impl.ChangesPackageImpl#getAttributeChange()
		 * @generated
		 */
		EClass ATTRIBUTE_CHANGE = eINSTANCE.getAttributeChange();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CHANGE__NEW_VALUE = eINSTANCE.getAttributeChange_NewValue();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CHANGE__OLD_VALUE = eINSTANCE.getAttributeChange_OldValue();

		/**
		 * The meta object literal for the '{@link Changes.impl.AssociationChangeImpl <em>Association Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.AssociationChangeImpl
		 * @see Changes.impl.ChangesPackageImpl#getAssociationChange()
		 * @generated
		 */
		EClass ASSOCIATION_CHANGE = eINSTANCE.getAssociationChange();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_CHANGE__NEW_VALUE = eINSTANCE.getAssociationChange_NewValue();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_CHANGE__OLD_VALUE = eINSTANCE.getAssociationChange_OldValue();

		/**
		 * The meta object literal for the '{@link Changes.impl.CompositionChangeImpl <em>Composition Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Changes.impl.CompositionChangeImpl
		 * @see Changes.impl.ChangesPackageImpl#getCompositionChange()
		 * @generated
		 */
		EClass COMPOSITION_CHANGE = eINSTANCE.getCompositionChange();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_CHANGE__NEW_VALUE = eINSTANCE.getCompositionChange_NewValue();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_CHANGE__OLD_VALUE = eINSTANCE.getCompositionChange_OldValue();

	}

} //ChangesPackage
