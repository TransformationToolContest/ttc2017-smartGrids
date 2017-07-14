/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupX.impl;

import gluemodel.substationStandard.Dataclasses.BCR;
import gluemodel.substationStandard.Dataclasses.INS;

import gluemodel.substationStandard.Enumerations.SwitchingCapabilityKind;

import gluemodel.substationStandard.LNNodes.LNGroupC.CSWI;

import gluemodel.substationStandard.LNNodes.LNGroupX.LNGroupXPackage;
import gluemodel.substationStandard.LNNodes.LNGroupX.XCBR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XCBR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XCBRImpl#getSumSwARs <em>Sum Sw ARs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XCBRImpl#getCBOpCap <em>CB Op Cap</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XCBRImpl#getPOWCap <em>POW Cap</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XCBRImpl#getMaxOpCap <em>Max Op Cap</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupX.impl.XCBRImpl#getSwitchControl <em>Switch Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XCBRImpl extends GroupXImpl implements XCBR {
	/**
	 * The cached value of the '{@link #getSumSwARs() <em>Sum Sw ARs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSumSwARs()
	 * @generated
	 * @ordered
	 */
	protected BCR sumSwARs;

	/**
	 * The cached value of the '{@link #getCBOpCap() <em>CB Op Cap</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBOpCap()
	 * @generated
	 * @ordered
	 */
	protected INS cbOpCap;

	/**
	 * The default value of the '{@link #getPOWCap() <em>POW Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOWCap()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchingCapabilityKind POW_CAP_EDEFAULT = SwitchingCapabilityKind.NONE;

	/**
	 * The cached value of the '{@link #getPOWCap() <em>POW Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOWCap()
	 * @generated
	 * @ordered
	 */
	protected SwitchingCapabilityKind powCap = POW_CAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaxOpCap() <em>Max Op Cap</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOpCap()
	 * @generated
	 * @ordered
	 */
	protected INS maxOpCap;

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
	protected XCBRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupXPackage.Literals.XCBR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR getSumSwARs() {
		if (sumSwARs != null && sumSwARs.eIsProxy()) {
			InternalEObject oldSumSwARs = (InternalEObject)sumSwARs;
			sumSwARs = (BCR)eResolveProxy(oldSumSwARs);
			if (sumSwARs != oldSumSwARs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.XCBR__SUM_SW_ARS, oldSumSwARs, sumSwARs));
			}
		}
		return sumSwARs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR basicGetSumSwARs() {
		return sumSwARs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSumSwARs(BCR newSumSwARs) {
		BCR oldSumSwARs = sumSwARs;
		sumSwARs = newSumSwARs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XCBR__SUM_SW_ARS, oldSumSwARs, sumSwARs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getCBOpCap() {
		if (cbOpCap != null && cbOpCap.eIsProxy()) {
			InternalEObject oldCBOpCap = (InternalEObject)cbOpCap;
			cbOpCap = (INS)eResolveProxy(oldCBOpCap);
			if (cbOpCap != oldCBOpCap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.XCBR__CB_OP_CAP, oldCBOpCap, cbOpCap));
			}
		}
		return cbOpCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetCBOpCap() {
		return cbOpCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCBOpCap(INS newCBOpCap) {
		INS oldCBOpCap = cbOpCap;
		cbOpCap = newCBOpCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XCBR__CB_OP_CAP, oldCBOpCap, cbOpCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingCapabilityKind getPOWCap() {
		return powCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOWCap(SwitchingCapabilityKind newPOWCap) {
		SwitchingCapabilityKind oldPOWCap = powCap;
		powCap = newPOWCap == null ? POW_CAP_EDEFAULT : newPOWCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XCBR__POW_CAP, oldPOWCap, powCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getMaxOpCap() {
		if (maxOpCap != null && maxOpCap.eIsProxy()) {
			InternalEObject oldMaxOpCap = (InternalEObject)maxOpCap;
			maxOpCap = (INS)eResolveProxy(oldMaxOpCap);
			if (maxOpCap != oldMaxOpCap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.XCBR__MAX_OP_CAP, oldMaxOpCap, maxOpCap));
			}
		}
		return maxOpCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetMaxOpCap() {
		return maxOpCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOpCap(INS newMaxOpCap) {
		INS oldMaxOpCap = maxOpCap;
		maxOpCap = newMaxOpCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XCBR__MAX_OP_CAP, oldMaxOpCap, maxOpCap));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.XCBR__SWITCH_CONTROL, oldSwitchControl, switchControl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.XCBR__SWITCH_CONTROL, oldSwitchControl, switchControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupXPackage.XCBR__SUM_SW_ARS:
				if (resolve) return getSumSwARs();
				return basicGetSumSwARs();
			case LNGroupXPackage.XCBR__CB_OP_CAP:
				if (resolve) return getCBOpCap();
				return basicGetCBOpCap();
			case LNGroupXPackage.XCBR__POW_CAP:
				return getPOWCap();
			case LNGroupXPackage.XCBR__MAX_OP_CAP:
				if (resolve) return getMaxOpCap();
				return basicGetMaxOpCap();
			case LNGroupXPackage.XCBR__SWITCH_CONTROL:
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
			case LNGroupXPackage.XCBR__SUM_SW_ARS:
				setSumSwARs((BCR)newValue);
				return;
			case LNGroupXPackage.XCBR__CB_OP_CAP:
				setCBOpCap((INS)newValue);
				return;
			case LNGroupXPackage.XCBR__POW_CAP:
				setPOWCap((SwitchingCapabilityKind)newValue);
				return;
			case LNGroupXPackage.XCBR__MAX_OP_CAP:
				setMaxOpCap((INS)newValue);
				return;
			case LNGroupXPackage.XCBR__SWITCH_CONTROL:
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
			case LNGroupXPackage.XCBR__SUM_SW_ARS:
				setSumSwARs((BCR)null);
				return;
			case LNGroupXPackage.XCBR__CB_OP_CAP:
				setCBOpCap((INS)null);
				return;
			case LNGroupXPackage.XCBR__POW_CAP:
				setPOWCap(POW_CAP_EDEFAULT);
				return;
			case LNGroupXPackage.XCBR__MAX_OP_CAP:
				setMaxOpCap((INS)null);
				return;
			case LNGroupXPackage.XCBR__SWITCH_CONTROL:
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
			case LNGroupXPackage.XCBR__SUM_SW_ARS:
				return sumSwARs != null;
			case LNGroupXPackage.XCBR__CB_OP_CAP:
				return cbOpCap != null;
			case LNGroupXPackage.XCBR__POW_CAP:
				return powCap != POW_CAP_EDEFAULT;
			case LNGroupXPackage.XCBR__MAX_OP_CAP:
				return maxOpCap != null;
			case LNGroupXPackage.XCBR__SWITCH_CONTROL:
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
		result.append(" (POWCap: ");
		result.append(powCap);
		result.append(')');
		return result.toString();
	}

} //XCBRImpl
