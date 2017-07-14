/**
 */
package Changes.impl;

import Changes.ChangesPackage;
import Changes.ElementaryChange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elementary Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Changes.impl.ElementaryChangeImpl#getAffectedElement <em>Affected Element</em>}</li>
 *   <li>{@link Changes.impl.ElementaryChangeImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementaryChangeImpl extends ModelChangeImpl implements ElementaryChange {
	/**
	 * The cached value of the '{@link #getAffectedElement() <em>Affected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject affectedElement;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChangesPackage.Literals.ELEMENTARY_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAffectedElement() {
		if (affectedElement != null && affectedElement.eIsProxy()) {
			InternalEObject oldAffectedElement = (InternalEObject)affectedElement;
			affectedElement = eResolveProxy(oldAffectedElement);
			if (affectedElement != oldAffectedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChangesPackage.ELEMENTARY_CHANGE__AFFECTED_ELEMENT, oldAffectedElement, affectedElement));
			}
		}
		return affectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetAffectedElement() {
		return affectedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedElement(EObject newAffectedElement) {
		EObject oldAffectedElement = affectedElement;
		affectedElement = newAffectedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangesPackage.ELEMENTARY_CHANGE__AFFECTED_ELEMENT, oldAffectedElement, affectedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChangesPackage.ELEMENTARY_CHANGE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChangesPackage.ELEMENTARY_CHANGE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChangesPackage.ELEMENTARY_CHANGE__AFFECTED_ELEMENT:
				if (resolve) return getAffectedElement();
				return basicGetAffectedElement();
			case ChangesPackage.ELEMENTARY_CHANGE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case ChangesPackage.ELEMENTARY_CHANGE__AFFECTED_ELEMENT:
				setAffectedElement((EObject)newValue);
				return;
			case ChangesPackage.ELEMENTARY_CHANGE__FEATURE:
				setFeature((EStructuralFeature)newValue);
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
			case ChangesPackage.ELEMENTARY_CHANGE__AFFECTED_ELEMENT:
				setAffectedElement((EObject)null);
				return;
			case ChangesPackage.ELEMENTARY_CHANGE__FEATURE:
				setFeature((EStructuralFeature)null);
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
			case ChangesPackage.ELEMENTARY_CHANGE__AFFECTED_ELEMENT:
				return affectedElement != null;
			case ChangesPackage.ELEMENTARY_CHANGE__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementaryChangeImpl
