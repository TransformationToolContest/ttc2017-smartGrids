/**
 */
package Changes.impl;

import Changes.ChangesPackage;
import Changes.CompositionCollectionDeletion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Collection Deletion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Changes.impl.CompositionCollectionDeletionImpl#getDeletedElement <em>Deleted Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionCollectionDeletionImpl extends CollectionDeletionImpl implements CompositionCollectionDeletion {
	/**
	 * The cached value of the '{@link #getDeletedElement() <em>Deleted Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject deletedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionCollectionDeletionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangesPackage.Literals.COMPOSITION_COLLECTION_DELETION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDeletedElement() {
		if (deletedElement != null && deletedElement.eIsProxy()) {
			InternalEObject oldDeletedElement = (InternalEObject)deletedElement;
			deletedElement = eResolveProxy(oldDeletedElement);
			if (deletedElement != oldDeletedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChangesPackage.COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT, oldDeletedElement, deletedElement));
			}
		}
		return deletedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDeletedElement() {
		return deletedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletedElement(EObject newDeletedElement) {
		EObject oldDeletedElement = deletedElement;
		deletedElement = newDeletedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangesPackage.COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT, oldDeletedElement, deletedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChangesPackage.COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT:
				if (resolve) return getDeletedElement();
				return basicGetDeletedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChangesPackage.COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT:
				setDeletedElement((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChangesPackage.COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT:
				setDeletedElement((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChangesPackage.COMPOSITION_COLLECTION_DELETION__DELETED_ELEMENT:
				return deletedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionCollectionDeletionImpl
