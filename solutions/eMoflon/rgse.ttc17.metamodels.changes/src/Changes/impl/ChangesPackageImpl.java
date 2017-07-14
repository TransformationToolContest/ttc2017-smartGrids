/**
 */
package Changes.impl;

import Changes.AssociationChange;
import Changes.AssociationCollectionDeletion;
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
import Changes.ChangesFactory;
import Changes.ChangesPackage;
import Changes.CollectionDeletion;
import Changes.CollectionInsertion;
import Changes.CollectionReset;
import Changes.CompositionChange;
import Changes.CompositionCollectionDeletion;
import Changes.CompositionCollectionInsertion;
import Changes.CompositionCollectionReset;
import Changes.CompositionListDeletion;
import Changes.CompositionListInsertion;
import Changes.ElementaryChange;
import Changes.ElementaryChangeTransaction;
import Changes.ListDeletion;
import Changes.ListInsertion;
import Changes.ModelChange;
import Changes.ModelChangeSet;
import Changes.PropertyChange;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangesPackageImpl extends EPackageImpl implements ChangesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelChangeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryChangeTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationCollectionDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionCollectionDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeCollectionDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationCollectionInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionCollectionInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeCollectionInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationCollectionResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionCollectionResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeCollectionResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationListDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionListDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeListDeletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationListInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionListInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeListInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionChangeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Changes.ChangesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChangesPackageImpl() {
		super(eNS_URI, ChangesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ChangesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChangesPackage init() {
		if (isInited) return (ChangesPackage)EPackage.Registry.INSTANCE.getEPackage(ChangesPackage.eNS_URI);

		// Obtain or create and register package
		ChangesPackageImpl theChangesPackage = (ChangesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChangesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChangesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theChangesPackage.createPackageContents();

		// Initialize created meta-data
		theChangesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChangesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChangesPackage.eNS_URI, theChangesPackage);
		return theChangesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelChangeSet() {
		return modelChangeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelChangeSet_Changes() {
		return (EReference)modelChangeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelChange() {
		return modelChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryChange() {
		return elementaryChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryChange_AffectedElement() {
		return (EReference)elementaryChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryChange_Feature() {
		return (EReference)elementaryChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryChangeTransaction() {
		return elementaryChangeTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryChangeTransaction_SourceChange() {
		return (EReference)elementaryChangeTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryChangeTransaction_NestedChanges() {
		return (EReference)elementaryChangeTransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionDeletion() {
		return collectionDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationCollectionDeletion() {
		return associationCollectionDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationCollectionDeletion_DeletedElement() {
		return (EReference)associationCollectionDeletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionCollectionDeletion() {
		return compositionCollectionDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionCollectionDeletion_DeletedElement() {
		return (EReference)compositionCollectionDeletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeCollectionDeletion() {
		return attributeCollectionDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeCollectionDeletion_DeletedValue() {
		return (EAttribute)attributeCollectionDeletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionInsertion() {
		return collectionInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationCollectionInsertion() {
		return associationCollectionInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationCollectionInsertion_AddedElement() {
		return (EReference)associationCollectionInsertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionCollectionInsertion() {
		return compositionCollectionInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionCollectionInsertion_AddedElement() {
		return (EReference)compositionCollectionInsertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeCollectionInsertion() {
		return attributeCollectionInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeCollectionInsertion_AddedValue() {
		return (EAttribute)attributeCollectionInsertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionReset() {
		return collectionResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationCollectionReset() {
		return associationCollectionResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionCollectionReset() {
		return compositionCollectionResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeCollectionReset() {
		return attributeCollectionResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListDeletion() {
		return listDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListDeletion_Index() {
		return (EAttribute)listDeletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationListDeletion() {
		return associationListDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationListDeletion_DeletedElement() {
		return (EReference)associationListDeletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionListDeletion() {
		return compositionListDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionListDeletion_DeletedElement() {
		return (EReference)compositionListDeletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeListDeletion() {
		return attributeListDeletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeListDeletion_DeletedValue() {
		return (EAttribute)attributeListDeletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListInsertion() {
		return listInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListInsertion_Index() {
		return (EAttribute)listInsertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationListInsertion() {
		return associationListInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationListInsertion_AddedElement() {
		return (EReference)associationListInsertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionListInsertion() {
		return compositionListInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionListInsertion_AddedElement() {
		return (EReference)compositionListInsertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeListInsertion() {
		return attributeListInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeListInsertion_AddedValue() {
		return (EAttribute)attributeListInsertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyChange() {
		return propertyChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeChange() {
		return attributeChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeChange_NewValue() {
		return (EAttribute)attributeChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeChange_OldValue() {
		return (EAttribute)attributeChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationChange() {
		return associationChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationChange_NewValue() {
		return (EReference)associationChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationChange_OldValue() {
		return (EReference)associationChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionChange() {
		return compositionChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionChange_NewValue() {
		return (EReference)compositionChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionChange_OldValue() {
		return (EReference)compositionChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangesFactory getChangesFactory() {
		return (ChangesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelChangeSetEClass = createEClass(MODEL_CHANGE_SET);
		createEReference(modelChangeSetEClass, MODEL_CHANGE_SET__CHANGES);

		modelChangeEClass = createEClass(MODEL_CHANGE);

		elementaryChangeEClass = createEClass(ELEMENTARY_CHANGE);
		createEReference(elementaryChangeEClass, ELEMENTARY_CHANGE__AFFECTED_ELEMENT);
		createEReference(elementaryChangeEClass, ELEMENTARY_CHANGE__FEATURE);

		elementaryChangeTransactionEClass = createEClass(ELEMENTARY_CHANGE_TRANSACTION);
		createEReference(elementaryChangeTransactionEClass, ELEMENTARY_CHANGE_TRANSACTION__SOURCE_CHANGE);
		createEReference(elementaryChangeTransactionEClass, ELEMENTARY_CHANGE_TRANSACTION__NESTED_CHANGES);

		collectionDeletionEClass = createEClass(COLLECTION_DELETION);

		associationCollectionDeletionEClass = createEClass(ASSOCIATION_COLLECTION_DELETION);
		createEReference(associationCollectionDeletionEClass, ASSOCIATION_COLLECTION_DELETION__DELETED_ELEMENT);

		compositionCollectionDeletionEClass = createEClass(COMPOSITION_COLLECTION_DELETION);
		createEReference(compositionCollectionDeletionEClass, COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT);

		attributeCollectionDeletionEClass = createEClass(ATTRIBUTE_COLLECTION_DELETION);
		createEAttribute(attributeCollectionDeletionEClass, ATTRIBUTE_COLLECTION_DELETION__DELETED_VALUE);

		collectionInsertionEClass = createEClass(COLLECTION_INSERTION);

		associationCollectionInsertionEClass = createEClass(ASSOCIATION_COLLECTION_INSERTION);
		createEReference(associationCollectionInsertionEClass, ASSOCIATION_COLLECTION_INSERTION__ADDED_ELEMENT);

		compositionCollectionInsertionEClass = createEClass(COMPOSITION_COLLECTION_INSERTION);
		createEReference(compositionCollectionInsertionEClass, COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT);

		attributeCollectionInsertionEClass = createEClass(ATTRIBUTE_COLLECTION_INSERTION);
		createEAttribute(attributeCollectionInsertionEClass, ATTRIBUTE_COLLECTION_INSERTION__ADDED_VALUE);

		collectionResetEClass = createEClass(COLLECTION_RESET);

		associationCollectionResetEClass = createEClass(ASSOCIATION_COLLECTION_RESET);

		compositionCollectionResetEClass = createEClass(COMPOSITION_COLLECTION_RESET);

		attributeCollectionResetEClass = createEClass(ATTRIBUTE_COLLECTION_RESET);

		listDeletionEClass = createEClass(LIST_DELETION);
		createEAttribute(listDeletionEClass, LIST_DELETION__INDEX);

		associationListDeletionEClass = createEClass(ASSOCIATION_LIST_DELETION);
		createEReference(associationListDeletionEClass, ASSOCIATION_LIST_DELETION__DELETED_ELEMENT);

		compositionListDeletionEClass = createEClass(COMPOSITION_LIST_DELETION);
		createEReference(compositionListDeletionEClass, COMPOSITION_LIST_DELETION__DELETED_ELEMENT);

		attributeListDeletionEClass = createEClass(ATTRIBUTE_LIST_DELETION);
		createEAttribute(attributeListDeletionEClass, ATTRIBUTE_LIST_DELETION__DELETED_VALUE);

		listInsertionEClass = createEClass(LIST_INSERTION);
		createEAttribute(listInsertionEClass, LIST_INSERTION__INDEX);

		associationListInsertionEClass = createEClass(ASSOCIATION_LIST_INSERTION);
		createEReference(associationListInsertionEClass, ASSOCIATION_LIST_INSERTION__ADDED_ELEMENT);

		compositionListInsertionEClass = createEClass(COMPOSITION_LIST_INSERTION);
		createEReference(compositionListInsertionEClass, COMPOSITION_LIST_INSERTION__ADDED_ELEMENT);

		attributeListInsertionEClass = createEClass(ATTRIBUTE_LIST_INSERTION);
		createEAttribute(attributeListInsertionEClass, ATTRIBUTE_LIST_INSERTION__ADDED_VALUE);

		propertyChangeEClass = createEClass(PROPERTY_CHANGE);

		attributeChangeEClass = createEClass(ATTRIBUTE_CHANGE);
		createEAttribute(attributeChangeEClass, ATTRIBUTE_CHANGE__NEW_VALUE);
		createEAttribute(attributeChangeEClass, ATTRIBUTE_CHANGE__OLD_VALUE);

		associationChangeEClass = createEClass(ASSOCIATION_CHANGE);
		createEReference(associationChangeEClass, ASSOCIATION_CHANGE__NEW_VALUE);
		createEReference(associationChangeEClass, ASSOCIATION_CHANGE__OLD_VALUE);

		compositionChangeEClass = createEClass(COMPOSITION_CHANGE);
		createEReference(compositionChangeEClass, COMPOSITION_CHANGE__NEW_VALUE);
		createEReference(compositionChangeEClass, COMPOSITION_CHANGE__OLD_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementaryChangeEClass.getESuperTypes().add(this.getModelChange());
		elementaryChangeTransactionEClass.getESuperTypes().add(this.getElementaryChange());
		collectionDeletionEClass.getESuperTypes().add(this.getElementaryChange());
		associationCollectionDeletionEClass.getESuperTypes().add(this.getCollectionDeletion());
		compositionCollectionDeletionEClass.getESuperTypes().add(this.getCollectionDeletion());
		attributeCollectionDeletionEClass.getESuperTypes().add(this.getCollectionDeletion());
		collectionInsertionEClass.getESuperTypes().add(this.getElementaryChange());
		associationCollectionInsertionEClass.getESuperTypes().add(this.getCollectionInsertion());
		compositionCollectionInsertionEClass.getESuperTypes().add(this.getCollectionInsertion());
		attributeCollectionInsertionEClass.getESuperTypes().add(this.getCollectionInsertion());
		collectionResetEClass.getESuperTypes().add(this.getElementaryChange());
		associationCollectionResetEClass.getESuperTypes().add(this.getCollectionReset());
		compositionCollectionResetEClass.getESuperTypes().add(this.getCollectionReset());
		attributeCollectionResetEClass.getESuperTypes().add(this.getCollectionReset());
		listDeletionEClass.getESuperTypes().add(this.getElementaryChange());
		associationListDeletionEClass.getESuperTypes().add(this.getListDeletion());
		compositionListDeletionEClass.getESuperTypes().add(this.getListDeletion());
		attributeListDeletionEClass.getESuperTypes().add(this.getListDeletion());
		listInsertionEClass.getESuperTypes().add(this.getElementaryChange());
		associationListInsertionEClass.getESuperTypes().add(this.getListInsertion());
		compositionListInsertionEClass.getESuperTypes().add(this.getListInsertion());
		attributeListInsertionEClass.getESuperTypes().add(this.getListInsertion());
		propertyChangeEClass.getESuperTypes().add(this.getElementaryChange());
		attributeChangeEClass.getESuperTypes().add(this.getPropertyChange());
		associationChangeEClass.getESuperTypes().add(this.getPropertyChange());
		compositionChangeEClass.getESuperTypes().add(this.getPropertyChange());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelChangeSetEClass, ModelChangeSet.class, "ModelChangeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelChangeSet_Changes(), this.getModelChange(), null, "changes", null, 0, -1, ModelChangeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelChangeEClass, ModelChange.class, "ModelChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementaryChangeEClass, ElementaryChange.class, "ElementaryChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryChange_AffectedElement(), ecorePackage.getEObject(), null, "affectedElement", null, 1, 1, ElementaryChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementaryChange_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, ElementaryChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryChangeTransactionEClass, ElementaryChangeTransaction.class, "ElementaryChangeTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryChangeTransaction_SourceChange(), this.getModelChange(), null, "sourceChange", null, 1, 1, ElementaryChangeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementaryChangeTransaction_NestedChanges(), this.getModelChange(), null, "nestedChanges", null, 0, -1, ElementaryChangeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionDeletionEClass, CollectionDeletion.class, "CollectionDeletion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationCollectionDeletionEClass, AssociationCollectionDeletion.class, "AssociationCollectionDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationCollectionDeletion_DeletedElement(), ecorePackage.getEObject(), null, "deletedElement", null, 1, 1, AssociationCollectionDeletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionCollectionDeletionEClass, CompositionCollectionDeletion.class, "CompositionCollectionDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionCollectionDeletion_DeletedElement(), ecorePackage.getEObject(), null, "deletedElement", null, 0, 1, CompositionCollectionDeletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeCollectionDeletionEClass, AttributeCollectionDeletion.class, "AttributeCollectionDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeCollectionDeletion_DeletedValue(), ecorePackage.getEString(), "deletedValue", null, 1, 1, AttributeCollectionDeletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionInsertionEClass, CollectionInsertion.class, "CollectionInsertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationCollectionInsertionEClass, AssociationCollectionInsertion.class, "AssociationCollectionInsertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationCollectionInsertion_AddedElement(), ecorePackage.getEObject(), null, "addedElement", null, 1, 1, AssociationCollectionInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionCollectionInsertionEClass, CompositionCollectionInsertion.class, "CompositionCollectionInsertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionCollectionInsertion_AddedElement(), ecorePackage.getEObject(), null, "addedElement", null, 1, 1, CompositionCollectionInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeCollectionInsertionEClass, AttributeCollectionInsertion.class, "AttributeCollectionInsertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeCollectionInsertion_AddedValue(), ecorePackage.getEString(), "addedValue", null, 1, 1, AttributeCollectionInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionResetEClass, CollectionReset.class, "CollectionReset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationCollectionResetEClass, AssociationCollectionReset.class, "AssociationCollectionReset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionCollectionResetEClass, CompositionCollectionReset.class, "CompositionCollectionReset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeCollectionResetEClass, AttributeCollectionReset.class, "AttributeCollectionReset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listDeletionEClass, ListDeletion.class, "ListDeletion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListDeletion_Index(), ecorePackage.getEInt(), "index", null, 1, 1, ListDeletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationListDeletionEClass, AssociationListDeletion.class, "AssociationListDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationListDeletion_DeletedElement(), ecorePackage.getEObject(), null, "deletedElement", null, 0, 1, AssociationListDeletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionListDeletionEClass, CompositionListDeletion.class, "CompositionListDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionListDeletion_DeletedElement(), ecorePackage.getEObject(), null, "deletedElement", null, 0, 1, CompositionListDeletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeListDeletionEClass, AttributeListDeletion.class, "AttributeListDeletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeListDeletion_DeletedValue(), ecorePackage.getEString(), "deletedValue", null, 0, 1, AttributeListDeletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listInsertionEClass, ListInsertion.class, "ListInsertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListInsertion_Index(), ecorePackage.getEInt(), "index", null, 1, 1, ListInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationListInsertionEClass, AssociationListInsertion.class, "AssociationListInsertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationListInsertion_AddedElement(), ecorePackage.getEObject(), null, "addedElement", null, 1, 1, AssociationListInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionListInsertionEClass, CompositionListInsertion.class, "CompositionListInsertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionListInsertion_AddedElement(), ecorePackage.getEObject(), null, "addedElement", null, 1, 1, CompositionListInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeListInsertionEClass, AttributeListInsertion.class, "AttributeListInsertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeListInsertion_AddedValue(), ecorePackage.getEString(), "addedValue", null, 1, 1, AttributeListInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyChangeEClass, PropertyChange.class, "PropertyChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeChangeEClass, AttributeChange.class, "AttributeChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeChange_NewValue(), ecorePackage.getEString(), "newValue", null, 0, 1, AttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeChange_OldValue(), ecorePackage.getEString(), "oldValue", null, 0, 1, AttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationChangeEClass, AssociationChange.class, "AssociationChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationChange_NewValue(), ecorePackage.getEObject(), null, "newValue", null, 0, 1, AssociationChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationChange_OldValue(), ecorePackage.getEObject(), null, "oldValue", null, 0, 1, AssociationChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionChangeEClass, CompositionChange.class, "CompositionChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionChange_NewValue(), ecorePackage.getEObject(), null, "newValue", null, 0, 1, CompositionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositionChange_OldValue(), ecorePackage.getEObject(), null, "oldValue", null, 0, 1, CompositionChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ChangesPackageImpl
