/**
 */
package Changes.impl;

import Changes.ChangesPackage;
import Changes.CompositionCollectionInsertion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Collection Insertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Changes.impl.CompositionCollectionInsertionImpl#getAddedElement <em>Added Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionCollectionInsertionImpl extends CollectionInsertionImpl implements CompositionCollectionInsertion {
	/**
	 * The cached value of the '{@link #getAddedElement() <em>Added Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject addedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionCollectionInsertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangesPackage.Literals.COMPOSITION_COLLECTION_INSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAddedElement() {
		return addedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddedElement(EObject newAddedElement, NotificationChain msgs) {
		EObject oldAddedElement = addedElement;
		addedElement = newAddedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT, oldAddedElement, newAddedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddedElement(EObject newAddedElement) {
		if (newAddedElement != addedElement) {
			NotificationChain msgs = null;
			if (addedElement != null)
				msgs = ((InternalEObject)addedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT, null, msgs);
			if (newAddedElement != null)
				msgs = ((InternalEObject)newAddedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT, null, msgs);
			msgs = basicSetAddedElement(newAddedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT, newAddedElement, newAddedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT:
				return basicSetAddedElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT:
				return getAddedElement();
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
			case ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT:
				setAddedElement((EObject)newValue);
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
			case ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT:
				setAddedElement((EObject)null);
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
			case ChangesPackage.COMPOSITION_COLLECTION_INSERTION__ADDED_ELEMENT:
				return addedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionCollectionInsertionImpl
