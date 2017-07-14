/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupX.impl;

import gluemodel.substationStandard.Enumerations.SwitchTypeKind;
import gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind;

import gluemodel.substationStandard.LNNodes.LNGroupC.CSWI;

import gluemodel.substationStandard.LNNodes.LNGroupX.LNGroupXPackage;
import gluemodel.substationStandard.LNNodes.LNGroupX.XSWI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSWI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XSWIImpl#getSwOpCap <em>Sw Op Cap</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XSWIImpl#getMaxOpCap <em>Max Op Cap</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XSWIImpl#getSwTyp <em>Sw Typ</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XSWIImpl#getSwitchControl <em>Switch Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSWIImpl extends GroupXImpl implements XSWI {
	/**
	 * The default value of the '{@link #getSwOpCap() <em>Sw Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwOpCap()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchingCapabilityKind SW_OP_CAP_EDEFAULT = SwitchingCapabilityKind.NONE;

	/**
	 * The cached value of the '{@link #getSwOpCap() <em>Sw Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwOpCap()
	 * @generated
	 * @ordered
	 */
	protected SwitchingCapabilityKind swOpCap = SW_OP_CAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOpCap() <em>Max Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOpCap()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchingCapabilityKind MAX_OP_CAP_EDEFAULT = SwitchingCapabilityKind.NONE;

	/**
	 * The cached value of the '{@link #getMaxOpCap() <em>Max Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOpCap()
	 * @generated
	 * @ordered
	 */
	protected SwitchingCapabilityKind maxOpCap = MAX_OP_CAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwTyp() <em>Sw Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwTyp()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchTypeKind SW_TYP_EDEFAULT = SwitchTypeKind.LOAD_BREAK;

	/**
	 * The cached value of the '{@link #getSwTyp() <em>Sw Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwTyp()
	 * @generated
	 * @ordered
	 */
	protected SwitchTypeKind swTyp = SW_TYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitchControl() <em>Switch Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchControl()
	 * @generated
	 * @ordered
	 */
	protected CSWI switchControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSWIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupXPackage.Literals.XSWI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingCapabilityKind getSwOpCap() {
		return swOpCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwOpCap(SwitchingCapabilityKind newSwOpCap) {
		SwitchingCapabilityKind oldSwOpCap = swOpCap;
		swOpCap = newSwOpCap == null ? SW_OP_CAP_EDEFAULT : newSwOpCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XSWI__SW_OP_CAP, oldSwOpCap, swOpCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingCapabilityKind getMaxOpCap() {
		return maxOpCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOpCap(SwitchingCapabilityKind newMaxOpCap) {
		SwitchingCapabilityKind oldMaxOpCap = maxOpCap;
		maxOpCap = newMaxOpCap == null ? MAX_OP_CAP_EDEFAULT : newMaxOpCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XSWI__MAX_OP_CAP, oldMaxOpCap, maxOpCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchTypeKind getSwTyp() {
		return swTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwTyp(SwitchTypeKind newSwTyp) {
		SwitchTypeKind oldSwTyp = swTyp;
		swTyp = newSwTyp == null ? SW_TYP_EDEFAULT : newSwTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XSWI__SW_TYP, oldSwTyp, swTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSWI getSwitchControl() {
		if (switchControl != null && switchControl.eIsProxy()) {
			InternalEObject oldSwitchControl = (InternalEObject)switchControl;
			switchControl = (CSWI)eResolveProxy(oldSwitchControl);
			if (switchControl != oldSwitchControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.XSWI__SWITCH_CONTROL, oldSwitchControl, switchControl));
			}
		}
		return switchControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSWI basicGetSwitchControl() {
		return switchControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchControl(CSWI newSwitchControl) {
		CSWI oldSwitchControl = switchControl;
		switchControl = newSwitchControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XSWI__SWITCH_CONTROL, oldSwitchControl, switchControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupXPackage.XSWI__SW_OP_CAP:
				return getSwOpCap();
			case LNGroupXPackage.XSWI__MAX_OP_CAP:
				return getMaxOpCap();
			case LNGroupXPackage.XSWI__SW_TYP:
				return getSwTyp();
			case LNGroupXPackage.XSWI__SWITCH_CONTROL:
				if (resolve) return getSwitchControl();
				return basicGetSwitchControl();
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
			case LNGroupXPackage.XSWI__SW_OP_CAP:
				setSwOpCap((SwitchingCapabilityKind)newValue);
				return;
			case LNGroupXPackage.XSWI__MAX_OP_CAP:
				setMaxOpCap((SwitchingCapabilityKind)newValue);
				return;
			case LNGroupXPackage.XSWI__SW_TYP:
				setSwTyp((SwitchTypeKind)newValue);
				return;
			case LNGroupXPackage.XSWI__SWITCH_CONTROL:
				setSwitchControl((CSWI)newValue);
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
			case LNGroupXPackage.XSWI__SW_OP_CAP:
				setSwOpCap(SW_OP_CAP_EDEFAULT);
				return;
			case LNGroupXPackage.XSWI__MAX_OP_CAP:
				setMaxOpCap(MAX_OP_CAP_EDEFAULT);
				return;
			case LNGroupXPackage.XSWI__SW_TYP:
				setSwTyp(SW_TYP_EDEFAULT);
				return;
			case LNGroupXPackage.XSWI__SWITCH_CONTROL:
				setSwitchControl((CSWI)null);
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
			case LNGroupXPackage.XSWI__SW_OP_CAP:
				return swOpCap != SW_OP_CAP_EDEFAULT;
			case LNGroupXPackage.XSWI__MAX_OP_CAP:
				return maxOpCap != MAX_OP_CAP_EDEFAULT;
			case LNGroupXPackage.XSWI__SW_TYP:
				return swTyp != SW_TYP_EDEFAULT;
			case LNGroupXPackage.XSWI__SWITCH_CONTROL:
				return switchControl != null;
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
		result.append(" (SwOpCap: ");
		result.append(swOpCap);
		result.append(", MaxOpCap: ");
		result.append(maxOpCap);
		result.append(", SwTyp: ");
		result.append(swTyp);
		result.append(')');
		return result.toString();
	}

} //XSWIImpl
