/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP.impl;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.CSD;
import gluemodel.substationStandard.Dataclasses.CURVE;
import gluemodel.substationStandard.Dataclasses.ING;

import gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import gluemodel.substationStandard.LNNodes.LNGroupP.PTUV;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTUV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getTmVSt <em>Tm VSt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getTmVCrv <em>Tm VCrv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getTmMult <em>Tm Mult</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTUVImpl extends GroupPImpl implements PTUV {
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
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected ACT op;

	/**
	 * The cached value of the '{@link #getTmVSt() <em>Tm VSt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmVSt()
	 * @generated
	 * @ordered
	 */
	protected CSD tmVSt;

	/**
	 * The cached value of the '{@link #getTmVCrv() <em>Tm VCrv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmVCrv()
	 * @generated
	 * @ordered
	 */
	protected CURVE tmVCrv;

	/**
	 * The cached value of the '{@link #getStrVal() <em>Str Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrVal()
	 * @generated
	 * @ordered
	 */
	protected ASG strVal;

	/**
	 * The cached value of the '{@link #getTmMult() <em>Tm Mult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmMult()
	 * @generated
	 * @ordered
	 */
	protected ASG tmMult;

	/**
	 * The cached value of the '{@link #getMinOpTmms() <em>Min Op Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOpTmms()
	 * @generated
	 * @ordered
	 */
	protected ING minOpTmms;

	/**
	 * The cached value of the '{@link #getMaxOpTmms() <em>Max Op Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOpTmms()
	 * @generated
	 * @ordered
	 */
	protected ING maxOpTmms;

	/**
	 * The cached value of the '{@link #getOpDlTmms() <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING opDlTmms;

	/**
	 * The cached value of the '{@link #getRsDlTmms() <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING rsDlTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PTUV;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__STR, oldStr, str));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getOp() {
		if (op != null && op.eIsProxy()) {
			InternalEObject oldOp = (InternalEObject)op;
			op = (ACT)eResolveProxy(oldOp);
			if (op != oldOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__OP, oldOp, op));
			}
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(ACT newOp) {
		ACT oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD getTmVSt() {
		if (tmVSt != null && tmVSt.eIsProxy()) {
			InternalEObject oldTmVSt = (InternalEObject)tmVSt;
			tmVSt = (CSD)eResolveProxy(oldTmVSt);
			if (tmVSt != oldTmVSt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__TM_VST, oldTmVSt, tmVSt));
			}
		}
		return tmVSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD basicGetTmVSt() {
		return tmVSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmVSt(CSD newTmVSt) {
		CSD oldTmVSt = tmVSt;
		tmVSt = newTmVSt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__TM_VST, oldTmVSt, tmVSt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE getTmVCrv() {
		if (tmVCrv != null && tmVCrv.eIsProxy()) {
			InternalEObject oldTmVCrv = (InternalEObject)tmVCrv;
			tmVCrv = (CURVE)eResolveProxy(oldTmVCrv);
			if (tmVCrv != oldTmVCrv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__TM_VCRV, oldTmVCrv, tmVCrv));
			}
		}
		return tmVCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE basicGetTmVCrv() {
		return tmVCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmVCrv(CURVE newTmVCrv) {
		CURVE oldTmVCrv = tmVCrv;
		tmVCrv = newTmVCrv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__TM_VCRV, oldTmVCrv, tmVCrv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getStrVal() {
		if (strVal != null && strVal.eIsProxy()) {
			InternalEObject oldStrVal = (InternalEObject)strVal;
			strVal = (ASG)eResolveProxy(oldStrVal);
			if (strVal != oldStrVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__STR_VAL, oldStrVal, strVal));
			}
		}
		return strVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetStrVal() {
		return strVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrVal(ASG newStrVal) {
		ASG oldStrVal = strVal;
		strVal = newStrVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__STR_VAL, oldStrVal, strVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getTmMult() {
		if (tmMult != null && tmMult.eIsProxy()) {
			InternalEObject oldTmMult = (InternalEObject)tmMult;
			tmMult = (ASG)eResolveProxy(oldTmMult);
			if (tmMult != oldTmMult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__TM_MULT, oldTmMult, tmMult));
			}
		}
		return tmMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetTmMult() {
		return tmMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmMult(ASG newTmMult) {
		ASG oldTmMult = tmMult;
		tmMult = newTmMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__TM_MULT, oldTmMult, tmMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMinOpTmms() {
		if (minOpTmms != null && minOpTmms.eIsProxy()) {
			InternalEObject oldMinOpTmms = (InternalEObject)minOpTmms;
			minOpTmms = (ING)eResolveProxy(oldMinOpTmms);
			if (minOpTmms != oldMinOpTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
			}
		}
		return minOpTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMinOpTmms() {
		return minOpTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOpTmms(ING newMinOpTmms) {
		ING oldMinOpTmms = minOpTmms;
		minOpTmms = newMinOpTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMaxOpTmms() {
		if (maxOpTmms != null && maxOpTmms.eIsProxy()) {
			InternalEObject oldMaxOpTmms = (InternalEObject)maxOpTmms;
			maxOpTmms = (ING)eResolveProxy(oldMaxOpTmms);
			if (maxOpTmms != oldMaxOpTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
			}
		}
		return maxOpTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMaxOpTmms() {
		return maxOpTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOpTmms(ING newMaxOpTmms) {
		ING oldMaxOpTmms = maxOpTmms;
		maxOpTmms = newMaxOpTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getOpDlTmms() {
		if (opDlTmms != null && opDlTmms.eIsProxy()) {
			InternalEObject oldOpDlTmms = (InternalEObject)opDlTmms;
			opDlTmms = (ING)eResolveProxy(oldOpDlTmms);
			if (opDlTmms != oldOpDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
			}
		}
		return opDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetOpDlTmms() {
		return opDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpDlTmms(ING newOpDlTmms) {
		ING oldOpDlTmms = opDlTmms;
		opDlTmms = newOpDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRsDlTmms() {
		if (rsDlTmms != null && rsDlTmms.eIsProxy()) {
			InternalEObject oldRsDlTmms = (InternalEObject)rsDlTmms;
			rsDlTmms = (ING)eResolveProxy(oldRsDlTmms);
			if (rsDlTmms != oldRsDlTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUV__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
			}
		}
		return rsDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRsDlTmms() {
		return rsDlTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRsDlTmms(ING newRsDlTmms) {
		ING oldRsDlTmms = rsDlTmms;
		rsDlTmms = newRsDlTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUV__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PTUV__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PTUV__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PTUV__TM_VST:
				if (resolve) return getTmVSt();
				return basicGetTmVSt();
			case LNGroupPPackage.PTUV__TM_VCRV:
				if (resolve) return getTmVCrv();
				return basicGetTmVCrv();
			case LNGroupPPackage.PTUV__STR_VAL:
				if (resolve) return getStrVal();
				return basicGetStrVal();
			case LNGroupPPackage.PTUV__TM_MULT:
				if (resolve) return getTmMult();
				return basicGetTmMult();
			case LNGroupPPackage.PTUV__MIN_OP_TMMS:
				if (resolve) return getMinOpTmms();
				return basicGetMinOpTmms();
			case LNGroupPPackage.PTUV__MAX_OP_TMMS:
				if (resolve) return getMaxOpTmms();
				return basicGetMaxOpTmms();
			case LNGroupPPackage.PTUV__OP_DL_TMMS:
				if (resolve) return getOpDlTmms();
				return basicGetOpDlTmms();
			case LNGroupPPackage.PTUV__RS_DL_TMMS:
				if (resolve) return getRsDlTmms();
				return basicGetRsDlTmms();
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
			case LNGroupPPackage.PTUV__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PTUV__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PTUV__TM_VST:
				setTmVSt((CSD)newValue);
				return;
			case LNGroupPPackage.PTUV__TM_VCRV:
				setTmVCrv((CURVE)newValue);
				return;
			case LNGroupPPackage.PTUV__STR_VAL:
				setStrVal((ASG)newValue);
				return;
			case LNGroupPPackage.PTUV__TM_MULT:
				setTmMult((ASG)newValue);
				return;
			case LNGroupPPackage.PTUV__MIN_OP_TMMS:
				setMinOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PTUV__MAX_OP_TMMS:
				setMaxOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PTUV__OP_DL_TMMS:
				setOpDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PTUV__RS_DL_TMMS:
				setRsDlTmms((ING)newValue);
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
			case LNGroupPPackage.PTUV__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PTUV__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PTUV__TM_VST:
				setTmVSt((CSD)null);
				return;
			case LNGroupPPackage.PTUV__TM_VCRV:
				setTmVCrv((CURVE)null);
				return;
			case LNGroupPPackage.PTUV__STR_VAL:
				setStrVal((ASG)null);
				return;
			case LNGroupPPackage.PTUV__TM_MULT:
				setTmMult((ASG)null);
				return;
			case LNGroupPPackage.PTUV__MIN_OP_TMMS:
				setMinOpTmms((ING)null);
				return;
			case LNGroupPPackage.PTUV__MAX_OP_TMMS:
				setMaxOpTmms((ING)null);
				return;
			case LNGroupPPackage.PTUV__OP_DL_TMMS:
				setOpDlTmms((ING)null);
				return;
			case LNGroupPPackage.PTUV__RS_DL_TMMS:
				setRsDlTmms((ING)null);
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
			case LNGroupPPackage.PTUV__STR:
				return str != null;
			case LNGroupPPackage.PTUV__OP:
				return op != null;
			case LNGroupPPackage.PTUV__TM_VST:
				return tmVSt != null;
			case LNGroupPPackage.PTUV__TM_VCRV:
				return tmVCrv != null;
			case LNGroupPPackage.PTUV__STR_VAL:
				return strVal != null;
			case LNGroupPPackage.PTUV__TM_MULT:
				return tmMult != null;
			case LNGroupPPackage.PTUV__MIN_OP_TMMS:
				return minOpTmms != null;
			case LNGroupPPackage.PTUV__MAX_OP_TMMS:
				return maxOpTmms != null;
			case LNGroupPPackage.PTUV__OP_DL_TMMS:
				return opDlTmms != null;
			case LNGroupPPackage.PTUV__RS_DL_TMMS:
				return rsDlTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PTUVImpl
