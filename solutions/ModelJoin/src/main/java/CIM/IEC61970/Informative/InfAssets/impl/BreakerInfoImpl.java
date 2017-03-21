/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.BreakerInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breaker Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.BreakerInfoImpl#getPhaseTrip <em>Phase Trip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakerInfoImpl extends SwitchInfoImpl implements BreakerInfo {
	/**
	 * The default value of the '{@link #getPhaseTrip() <em>Phase Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTrip()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_TRIP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseTrip() <em>Phase Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTrip()
	 * @generated
	 * @ordered
	 */
	protected float phaseTrip = PHASE_TRIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakerInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getBreakerInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPhaseTrip() {
		return phaseTrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseTrip(float newPhaseTrip) {
		float oldPhaseTrip = phaseTrip;
		phaseTrip = newPhaseTrip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.BREAKER_INFO__PHASE_TRIP, oldPhaseTrip, phaseTrip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.BREAKER_INFO__PHASE_TRIP:
				return getPhaseTrip();
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
			case InfAssetsPackage.BREAKER_INFO__PHASE_TRIP:
				setPhaseTrip((Float)newValue);
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
			case InfAssetsPackage.BREAKER_INFO__PHASE_TRIP:
				setPhaseTrip(PHASE_TRIP_EDEFAULT);
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
			case InfAssetsPackage.BREAKER_INFO__PHASE_TRIP:
				return phaseTrip != PHASE_TRIP_EDEFAULT;
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
		result.append(" (phaseTrip: ");
		result.append(phaseTrip);
		result.append(')');
		return result.toString();
	}

} //BreakerInfoImpl
