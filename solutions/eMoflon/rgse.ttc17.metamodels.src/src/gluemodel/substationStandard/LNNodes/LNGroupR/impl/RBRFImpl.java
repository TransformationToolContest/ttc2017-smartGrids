/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR.impl;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.ING;

import gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import gluemodel.substationStandard.LNNodes.LNGroupR.RBRF;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RBRF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getOpEx <em>Op Ex</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getOpIn <em>Op In</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getFailMod <em>Fail Mod</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getFailTmms <em>Fail Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getSPlTrTmms <em>SPl Tr Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getTPTrTmms <em>TP Tr Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getDetValA <em>Det Val A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl#getReTrMod <em>Re Tr Mod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RBRFImpl extends GroupRImpl implements RBRF {
	/**
	 * The cached value of the '{@link #getOpCntRs() <em>Op Cnt Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCntRs()
	 * @generated
	 * @ordered
	 */
	protected INC opCntRs;

	/**
	 * The cached value of the '{@link #getStr() <em>Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr()
	 * @generated
	 * @ordered
	 */
	protected ACD str;

	/**
	 * The cached value of the '{@link #getOpEx() <em>Op Ex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpEx()
	 * @generated
	 * @ordered
	 */
	protected ACT opEx;

	/**
	 * The cached value of the '{@link #getOpIn() <em>Op In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpIn()
	 * @generated
	 * @ordered
	 */
	protected ACT opIn;

	/**
	 * The cached value of the '{@link #getFailMod() <em>Fail Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailMod()
	 * @generated
	 * @ordered
	 */
	protected ING failMod;

	/**
	 * The cached value of the '{@link #getFailTmms() <em>Fail Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailTmms()
	 * @generated
	 * @ordered
	 */
	protected ING failTmms;

	/**
	 * The cached value of the '{@link #getSPlTrTmms() <em>SPl Tr Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPlTrTmms()
	 * @generated
	 * @ordered
	 */
	protected ING sPlTrTmms;

	/**
	 * The cached value of the '{@link #getTPTrTmms() <em>TP Tr Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTPTrTmms()
	 * @generated
	 * @ordered
	 */
	protected ING tpTrTmms;

	/**
	 * The cached value of the '{@link #getDetValA() <em>Det Val A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetValA()
	 * @generated
	 * @ordered
	 */
	protected ASG detValA;

	/**
	 * The cached value of the '{@link #getReTrMod() <em>Re Tr Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReTrMod()
	 * @generated
	 * @ordered
	 */
	protected ING reTrMod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBRFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RBRF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC getOpCntRs() {
		if (opCntRs != null && opCntRs.eIsProxy()) {
			InternalEObject oldOpCntRs = (InternalEObject)opCntRs;
			opCntRs = (INC)eResolveProxy(oldOpCntRs);
			if (opCntRs != oldOpCntRs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__OP_CNT_RS, oldOpCntRs, opCntRs));
			}
		}
		return opCntRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC basicGetOpCntRs() {
		return opCntRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpCntRs(INC newOpCntRs) {
		INC oldOpCntRs = opCntRs;
		opCntRs = newOpCntRs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__OP_CNT_RS, oldOpCntRs, opCntRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD getStr() {
		if (str != null && str.eIsProxy()) {
			InternalEObject oldStr = (InternalEObject)str;
			str = (ACD)eResolveProxy(oldStr);
			if (str != oldStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__STR, oldStr, str));
			}
		}
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD basicGetStr() {
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStr(ACD newStr) {
		ACD oldStr = str;
		str = newStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__STR, oldStr, str));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOpEx() {
		if (opEx != null && opEx.eIsProxy()) {
			InternalEObject oldOpEx = (InternalEObject)opEx;
			opEx = (ACT)eResolveProxy(oldOpEx);
			if (opEx != oldOpEx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__OP_EX, oldOpEx, opEx));
			}
		}
		return opEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOpEx() {
		return opEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpEx(ACT newOpEx) {
		ACT oldOpEx = opEx;
		opEx = newOpEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__OP_EX, oldOpEx, opEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOpIn() {
		if (opIn != null && opIn.eIsProxy()) {
			InternalEObject oldOpIn = (InternalEObject)opIn;
			opIn = (ACT)eResolveProxy(oldOpIn);
			if (opIn != oldOpIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__OP_IN, oldOpIn, opIn));
			}
		}
		return opIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOpIn() {
		return opIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpIn(ACT newOpIn) {
		ACT oldOpIn = opIn;
		opIn = newOpIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__OP_IN, oldOpIn, opIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getFailMod() {
		if (failMod != null && failMod.eIsProxy()) {
			InternalEObject oldFailMod = (InternalEObject)failMod;
			failMod = (ING)eResolveProxy(oldFailMod);
			if (failMod != oldFailMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__FAIL_MOD, oldFailMod, failMod));
			}
		}
		return failMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetFailMod() {
		return failMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailMod(ING newFailMod) {
		ING oldFailMod = failMod;
		failMod = newFailMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__FAIL_MOD, oldFailMod, failMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getFailTmms() {
		if (failTmms != null && failTmms.eIsProxy()) {
			InternalEObject oldFailTmms = (InternalEObject)failTmms;
			failTmms = (ING)eResolveProxy(oldFailTmms);
			if (failTmms != oldFailTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__FAIL_TMMS, oldFailTmms, failTmms));
			}
		}
		return failTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetFailTmms() {
		return failTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailTmms(ING newFailTmms) {
		ING oldFailTmms = failTmms;
		failTmms = newFailTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__FAIL_TMMS, oldFailTmms, failTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getSPlTrTmms() {
		if (sPlTrTmms != null && sPlTrTmms.eIsProxy()) {
			InternalEObject oldSPlTrTmms = (InternalEObject)sPlTrTmms;
			sPlTrTmms = (ING)eResolveProxy(oldSPlTrTmms);
			if (sPlTrTmms != oldSPlTrTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__SPL_TR_TMMS, oldSPlTrTmms, sPlTrTmms));
			}
		}
		return sPlTrTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetSPlTrTmms() {
		return sPlTrTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPlTrTmms(ING newSPlTrTmms) {
		ING oldSPlTrTmms = sPlTrTmms;
		sPlTrTmms = newSPlTrTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__SPL_TR_TMMS, oldSPlTrTmms, sPlTrTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getTPTrTmms() {
		if (tpTrTmms != null && tpTrTmms.eIsProxy()) {
			InternalEObject oldTPTrTmms = (InternalEObject)tpTrTmms;
			tpTrTmms = (ING)eResolveProxy(oldTPTrTmms);
			if (tpTrTmms != oldTPTrTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__TP_TR_TMMS, oldTPTrTmms, tpTrTmms));
			}
		}
		return tpTrTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetTPTrTmms() {
		return tpTrTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTPTrTmms(ING newTPTrTmms) {
		ING oldTPTrTmms = tpTrTmms;
		tpTrTmms = newTPTrTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__TP_TR_TMMS, oldTPTrTmms, tpTrTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getDetValA() {
		if (detValA != null && detValA.eIsProxy()) {
			InternalEObject oldDetValA = (InternalEObject)detValA;
			detValA = (ASG)eResolveProxy(oldDetValA);
			if (detValA != oldDetValA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__DET_VAL_A, oldDetValA, detValA));
			}
		}
		return detValA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetDetValA() {
		return detValA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetValA(ASG newDetValA) {
		ASG oldDetValA = detValA;
		detValA = newDetValA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__DET_VAL_A, oldDetValA, detValA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getReTrMod() {
		if (reTrMod != null && reTrMod.eIsProxy()) {
			InternalEObject oldReTrMod = (InternalEObject)reTrMod;
			reTrMod = (ING)eResolveProxy(oldReTrMod);
			if (reTrMod != oldReTrMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBRF__RE_TR_MOD, oldReTrMod, reTrMod));
			}
		}
		return reTrMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetReTrMod() {
		return reTrMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReTrMod(ING newReTrMod) {
		ING oldReTrMod = reTrMod;
		reTrMod = newReTrMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBRF__RE_TR_MOD, oldReTrMod, reTrMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RBRF__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupRPackage.RBRF__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupRPackage.RBRF__OP_EX:
				if (resolve) return getOpEx();
				return basicGetOpEx();
			case LNGroupRPackage.RBRF__OP_IN:
				if (resolve) return getOpIn();
				return basicGetOpIn();
			case LNGroupRPackage.RBRF__FAIL_MOD:
				if (resolve) return getFailMod();
				return basicGetFailMod();
			case LNGroupRPackage.RBRF__FAIL_TMMS:
				if (resolve) return getFailTmms();
				return basicGetFailTmms();
			case LNGroupRPackage.RBRF__SPL_TR_TMMS:
				if (resolve) return getSPlTrTmms();
				return basicGetSPlTrTmms();
			case LNGroupRPackage.RBRF__TP_TR_TMMS:
				if (resolve) return getTPTrTmms();
				return basicGetTPTrTmms();
			case LNGroupRPackage.RBRF__DET_VAL_A:
				if (resolve) return getDetValA();
				return basicGetDetValA();
			case LNGroupRPackage.RBRF__RE_TR_MOD:
				if (resolve) return getReTrMod();
				return basicGetReTrMod();
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
			case LNGroupRPackage.RBRF__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupRPackage.RBRF__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupRPackage.RBRF__OP_EX:
				setOpEx((ACT)newValue);
				return;
			case LNGroupRPackage.RBRF__OP_IN:
				setOpIn((ACT)newValue);
				return;
			case LNGroupRPackage.RBRF__FAIL_MOD:
				setFailMod((ING)newValue);
				return;
			case LNGroupRPackage.RBRF__FAIL_TMMS:
				setFailTmms((ING)newValue);
				return;
			case LNGroupRPackage.RBRF__SPL_TR_TMMS:
				setSPlTrTmms((ING)newValue);
				return;
			case LNGroupRPackage.RBRF__TP_TR_TMMS:
				setTPTrTmms((ING)newValue);
				return;
			case LNGroupRPackage.RBRF__DET_VAL_A:
				setDetValA((ASG)newValue);
				return;
			case LNGroupRPackage.RBRF__RE_TR_MOD:
				setReTrMod((ING)newValue);
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
			case LNGroupRPackage.RBRF__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupRPackage.RBRF__STR:
				setStr((ACD)null);
				return;
			case LNGroupRPackage.RBRF__OP_EX:
				setOpEx((ACT)null);
				return;
			case LNGroupRPackage.RBRF__OP_IN:
				setOpIn((ACT)null);
				return;
			case LNGroupRPackage.RBRF__FAIL_MOD:
				setFailMod((ING)null);
				return;
			case LNGroupRPackage.RBRF__FAIL_TMMS:
				setFailTmms((ING)null);
				return;
			case LNGroupRPackage.RBRF__SPL_TR_TMMS:
				setSPlTrTmms((ING)null);
				return;
			case LNGroupRPackage.RBRF__TP_TR_TMMS:
				setTPTrTmms((ING)null);
				return;
			case LNGroupRPackage.RBRF__DET_VAL_A:
				setDetValA((ASG)null);
				return;
			case LNGroupRPackage.RBRF__RE_TR_MOD:
				setReTrMod((ING)null);
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
			case LNGroupRPackage.RBRF__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupRPackage.RBRF__STR:
				return str != null;
			case LNGroupRPackage.RBRF__OP_EX:
				return opEx != null;
			case LNGroupRPackage.RBRF__OP_IN:
				return opIn != null;
			case LNGroupRPackage.RBRF__FAIL_MOD:
				return failMod != null;
			case LNGroupRPackage.RBRF__FAIL_TMMS:
				return failTmms != null;
			case LNGroupRPackage.RBRF__SPL_TR_TMMS:
				return sPlTrTmms != null;
			case LNGroupRPackage.RBRF__TP_TR_TMMS:
				return tpTrTmms != null;
			case LNGroupRPackage.RBRF__DET_VAL_A:
				return detValA != null;
			case LNGroupRPackage.RBRF__RE_TR_MOD:
				return reTrMod != null;
		}
		return super.eIsSet(featureID);
	}

} //RBRFImpl
