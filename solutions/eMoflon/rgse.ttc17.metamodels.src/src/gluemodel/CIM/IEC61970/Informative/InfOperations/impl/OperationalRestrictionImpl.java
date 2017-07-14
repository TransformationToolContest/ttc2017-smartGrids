/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OperationalRestriction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OperationalRestrictionImpl#getActivePeriod <em>Active Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalRestrictionImpl extends DocumentImpl implements OperationalRestriction {
	/**
	 * The cached value of the '{@link #getActivePeriod() <em>Active Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval activePeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OPERATIONAL_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getActivePeriod() {
		if (activePeriod != null && activePeriod.eIsProxy()) {
			InternalEObject oldActivePeriod = (InternalEObject)activePeriod;
			activePeriod = (DateTimeInterval)eResolveProxy(oldActivePeriod);
			if (activePeriod != oldActivePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, oldActivePeriod, activePeriod));
			}
		}
		return activePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetActivePeriod() {
		return activePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePeriod(DateTimeInterval newActivePeriod) {
		DateTimeInterval oldActivePeriod = activePeriod;
		activePeriod = newActivePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, oldActivePeriod, activePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				if (resolve) return getActivePeriod();
				return basicGetActivePeriod();
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
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				setActivePeriod((DateTimeInterval)newValue);
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
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				setActivePeriod((DateTimeInterval)null);
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
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				return activePeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationalRestrictionImpl
