/**
 */
package Changes.impl;

import Changes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangesFactoryImpl extends EFactoryImpl implements ChangesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangesFactory init() {
		try {
			ChangesFactory theChangesFactory = (ChangesFactory)EPackage.Registry.INSTANCE.getEFactory(ChangesPackage.eNS_URI);
			if (theChangesFactory != null) {
				return theChangesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChangesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChangesPackage.MODEL_CHANGE_SET: return createModelChangeSet();
			case ChangesPackage.ELEMENTARY_CHANGE_TRANSACTION: return createElementaryChangeTransaction();
			case ChangesPackage.ASSOCIATION_COLLECTION_DELETION: return createAssociationCollectionDeletion();
			case ChangesPackage.COMPOSITION_COLLECTION_DELETION: return createCompositionCollectionDeletion();
			case ChangesPackage.ATTRIBUTE_COLLECTION_DELETION: return createAttributeCollectionDeletion();
			case ChangesPackage.ASSOCIATION_COLLECTION_INSERTION: return createAssociationCollectionInsertion();
			case ChangesPackage.COMPOSITION_COLLECTION_INSERTION: return createCompositionCollectionInsertion();
			case ChangesPackage.ATTRIBUTE_COLLECTION_INSERTION: return createAttributeCollectionInsertion();
			case ChangesPackage.ASSOCIATION_COLLECTION_RESET: return createAssociationCollectionReset();
			case ChangesPackage.COMPOSITION_COLLECTION_RESET: return createCompositionCollectionReset();
			case ChangesPackage.ATTRIBUTE_COLLECTION_RESET: return createAttributeCollectionReset();
			case ChangesPackage.ASSOCIATION_LIST_DELETION: return createAssociationListDeletion();
			case ChangesPackage.COMPOSITION_LIST_DELETION: return createCompositionListDeletion();
			case ChangesPackage.ATTRIBUTE_LIST_DELETION: return createAttributeListDeletion();
			case ChangesPackage.ASSOCIATION_LIST_INSERTION: return createAssociationListInsertion();
			case ChangesPackage.COMPOSITION_LIST_INSERTION: return createCompositionListInsertion();
			case ChangesPackage.ATTRIBUTE_LIST_INSERTION: return createAttributeListInsertion();
			case ChangesPackage.ATTRIBUTE_CHANGE: return createAttributeChange();
			case ChangesPackage.ASSOCIATION_CHANGE: return createAssociationChange();
			case ChangesPackage.COMPOSITION_CHANGE: return createCompositionChange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelChangeSet createModelChangeSet() {
		ModelChangeSetImpl modelChangeSet = new ModelChangeSetImpl();
		return modelChangeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryChangeTransaction createElementaryChangeTransaction() {
		ElementaryChangeTransactionImpl elementaryChangeTransaction = new ElementaryChangeTransactionImpl();
		return elementaryChangeTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationCollectionDeletion createAssociationCollectionDeletion() {
		AssociationCollectionDeletionImpl associationCollectionDeletion = new AssociationCollectionDeletionImpl();
		return associationCollectionDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionCollectionDeletion createCompositionCollectionDeletion() {
		CompositionCollectionDeletionImpl compositionCollectionDeletion = new CompositionCollectionDeletionImpl();
		return compositionCollectionDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCollectionDeletion createAttributeCollectionDeletion() {
		AttributeCollectionDeletionImpl attributeCollectionDeletion = new AttributeCollectionDeletionImpl();
		return attributeCollectionDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationCollectionInsertion createAssociationCollectionInsertion() {
		AssociationCollectionInsertionImpl associationCollectionInsertion = new AssociationCollectionInsertionImpl();
		return associationCollectionInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionCollectionInsertion createCompositionCollectionInsertion() {
		CompositionCollectionInsertionImpl compositionCollectionInsertion = new CompositionCollectionInsertionImpl();
		return compositionCollectionInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCollectionInsertion createAttributeCollectionInsertion() {
		AttributeCollectionInsertionImpl attributeCollectionInsertion = new AttributeCollectionInsertionImpl();
		return attributeCollectionInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationCollectionReset createAssociationCollectionReset() {
		AssociationCollectionResetImpl associationCollectionReset = new AssociationCollectionResetImpl();
		return associationCollectionReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionCollectionReset createCompositionCollectionReset() {
		CompositionCollectionResetImpl compositionCollectionReset = new CompositionCollectionResetImpl();
		return compositionCollectionReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCollectionReset createAttributeCollectionReset() {
		AttributeCollectionResetImpl attributeCollectionReset = new AttributeCollectionResetImpl();
		return attributeCollectionReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationListDeletion createAssociationListDeletion() {
		AssociationListDeletionImpl associationListDeletion = new AssociationListDeletionImpl();
		return associationListDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionListDeletion createCompositionListDeletion() {
		CompositionListDeletionImpl compositionListDeletion = new CompositionListDeletionImpl();
		return compositionListDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeListDeletion createAttributeListDeletion() {
		AttributeListDeletionImpl attributeListDeletion = new AttributeListDeletionImpl();
		return attributeListDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationListInsertion createAssociationListInsertion() {
		AssociationListInsertionImpl associationListInsertion = new AssociationListInsertionImpl();
		return associationListInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionListInsertion createCompositionListInsertion() {
		CompositionListInsertionImpl compositionListInsertion = new CompositionListInsertionImpl();
		return compositionListInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeListInsertion createAttributeListInsertion() {
		AttributeListInsertionImpl attributeListInsertion = new AttributeListInsertionImpl();
		return attributeListInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeChange createAttributeChange() {
		AttributeChangeImpl attributeChange = new AttributeChangeImpl();
		return attributeChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationChange createAssociationChange() {
		AssociationChangeImpl associationChange = new AssociationChangeImpl();
		return associationChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionChange createCompositionChange() {
		CompositionChangeImpl compositionChange = new CompositionChangeImpl();
		return compositionChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangesPackage getChangesPackage() {
		return (ChangesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChangesPackage getPackage() {
		return ChangesPackage.eINSTANCE;
	}

} //ChangesFactoryImpl
