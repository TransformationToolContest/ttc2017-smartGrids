/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorResetKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Indicator Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.FaultIndicatorInfoImpl#getResetKind <em>Reset Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultIndicatorInfoImpl extends ElectricalInfoImpl implements FaultIndicatorInfo {
	/**
	 * The default value of the '{@link #getResetKind() <em>Reset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetKind()
	 * @generated
	 * @ordered
	 */
	protected static final FaultIndicatorResetKind RESET_KIND_EDEFAULT = FaultIndicatorResetKind.REMOTE;

	/**
	 * The cached value of the '{@link #getResetKind() <em>Reset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetKind()
	 * @generated
	 * @ordered
	 */
	protected FaultIndicatorResetKind resetKind = RESET_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultIndicatorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getFaultIndicatorInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultIndicatorResetKind getResetKind() {
		return resetKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetKind(FaultIndicatorResetKind newResetKind) {
		FaultIndicatorResetKind oldResetKind = resetKind;
		resetKind = newResetKind == null ? RESET_KIND_EDEFAULT : newResetKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND, oldResetKind, resetKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND:
				return getResetKind();
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND:
				setResetKind((FaultIndicatorResetKind)newValue);
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND:
				setResetKind(RESET_KIND_EDEFAULT);
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND:
				return resetKind != RESET_KIND_EDEFAULT;
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
		result.append(" (resetKind: ");
		result.append(resetKind);
		result.append(')');
		return result.toString();
	}

} //FaultIndicatorInfoImpl
