/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.Originator;
import gluemodel.substationStandard.Dataclasses.OriginatorCategory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Originator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.OriginatorImpl#getOrident <em>Orident</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.OriginatorImpl#getOrCat <em>Or Cat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OriginatorImpl extends MinimalEObjectImpl.Container implements Originator {
	/**
	 * The default value of the '{@link #getOrident() <em>Orident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrident()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrident() <em>Orident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrident()
	 * @generated
	 * @ordered
	 */
	protected String orident = ORIDENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrCat() <em>Or Cat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrCat()
	 * @generated
	 * @ordered
	 */
	protected OriginatorCategory orCat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OriginatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.ORIGINATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrident() {
		return orident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrident(String newOrident) {
		String oldOrident = orident;
		orident = newOrident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ORIGINATOR__ORIDENT, oldOrident, orident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginatorCategory getOrCat() {
		if (orCat != null && orCat.eIsProxy()) {
			InternalEObject oldOrCat = (InternalEObject)orCat;
			orCat = (OriginatorCategory)eResolveProxy(oldOrCat);
			if (orCat != oldOrCat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.ORIGINATOR__OR_CAT, oldOrCat, orCat));
			}
		}
		return orCat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginatorCategory basicGetOrCat() {
		return orCat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrCat(OriginatorCategory newOrCat) {
		OriginatorCategory oldOrCat = orCat;
		orCat = newOrCat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.ORIGINATOR__OR_CAT, oldOrCat, orCat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.ORIGINATOR__ORIDENT:
				return getOrident();
			case DataclassesPackage.ORIGINATOR__OR_CAT:
				if (resolve) return getOrCat();
				return basicGetOrCat();
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
			case DataclassesPackage.ORIGINATOR__ORIDENT:
				setOrident((String)newValue);
				return;
			case DataclassesPackage.ORIGINATOR__OR_CAT:
				setOrCat((OriginatorCategory)newValue);
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
			case DataclassesPackage.ORIGINATOR__ORIDENT:
				setOrident(ORIDENT_EDEFAULT);
				return;
			case DataclassesPackage.ORIGINATOR__OR_CAT:
				setOrCat((OriginatorCategory)null);
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
			case DataclassesPackage.ORIGINATOR__ORIDENT:
				return ORIDENT_EDEFAULT == null ? orident != null : !ORIDENT_EDEFAULT.equals(orident);
			case DataclassesPackage.ORIGINATOR__OR_CAT:
				return orCat != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (orident: ");
		result.append(orident);
		result.append(')');
		return result.toString();
	}

} //OriginatorImpl
