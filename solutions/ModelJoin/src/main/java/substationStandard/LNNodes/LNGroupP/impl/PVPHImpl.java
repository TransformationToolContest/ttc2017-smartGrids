/**
 */
package substationStandard.LNNodes.LNGroupP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.CSD;
import substationStandard.Dataclasses.CURVE;
import substationStandard.Dataclasses.ING;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import substationStandard.LNNodes.LNGroupP.PVPH;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PVPH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getVHzSt <em>VHz St</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getVHzCrv <em>VHz Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getTypRsCrv <em>Typ Rs Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getTmMult <em>Tm Mult</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVPHImpl#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PVPHImpl extends GroupPImpl implements PVPH {
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
	 * The cached value of the '{@link #getVHzSt() <em>VHz St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVHzSt()
	 * @generated
	 * @ordered
	 */
	protected CSD vHzSt;

	/**
	 * The cached value of the '{@link #getVHzCrv() <em>VHz Crv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVHzCrv()
	 * @generated
	 * @ordered
	 */
	protected CURVE vHzCrv;

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
	 * The cached value of the '{@link #getOpDlTmms() <em>Op Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING opDlTmms;

	/**
	 * The cached value of the '{@link #getTypRsCrv() <em>Typ Rs Crv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypRsCrv()
	 * @generated
	 * @ordered
	 */
	protected ING typRsCrv;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PVPHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PVPH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD getVHzSt() {
		if (vHzSt != null && vHzSt.eIsProxy()) {
			InternalEObject oldVHzSt = (InternalEObject)vHzSt;
			vHzSt = (CSD)eResolveProxy(oldVHzSt);
			if (vHzSt != oldVHzSt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__VHZ_ST, oldVHzSt, vHzSt));
			}
		}
		return vHzSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD basicGetVHzSt() {
		return vHzSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVHzSt(CSD newVHzSt) {
		CSD oldVHzSt = vHzSt;
		vHzSt = newVHzSt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__VHZ_ST, oldVHzSt, vHzSt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE getVHzCrv() {
		if (vHzCrv != null && vHzCrv.eIsProxy()) {
			InternalEObject oldVHzCrv = (InternalEObject)vHzCrv;
			vHzCrv = (CURVE)eResolveProxy(oldVHzCrv);
			if (vHzCrv != oldVHzCrv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__VHZ_CRV, oldVHzCrv, vHzCrv));
			}
		}
		return vHzCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE basicGetVHzCrv() {
		return vHzCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVHzCrv(CURVE newVHzCrv) {
		CURVE oldVHzCrv = vHzCrv;
		vHzCrv = newVHzCrv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__VHZ_CRV, oldVHzCrv, vHzCrv));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__STR_VAL, oldStrVal, strVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__STR_VAL, oldStrVal, strVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getTypRsCrv() {
		if (typRsCrv != null && typRsCrv.eIsProxy()) {
			InternalEObject oldTypRsCrv = (InternalEObject)typRsCrv;
			typRsCrv = (ING)eResolveProxy(oldTypRsCrv);
			if (typRsCrv != oldTypRsCrv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__TYP_RS_CRV, oldTypRsCrv, typRsCrv));
			}
		}
		return typRsCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetTypRsCrv() {
		return typRsCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypRsCrv(ING newTypRsCrv) {
		ING oldTypRsCrv = typRsCrv;
		typRsCrv = newTypRsCrv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__TYP_RS_CRV, oldTypRsCrv, typRsCrv));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__TM_MULT, oldTmMult, tmMult));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__TM_MULT, oldTmMult, tmMult));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVPH__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVPH__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PVPH__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PVPH__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PVPH__VHZ_ST:
				if (resolve) return getVHzSt();
				return basicGetVHzSt();
			case LNGroupPPackage.PVPH__VHZ_CRV:
				if (resolve) return getVHzCrv();
				return basicGetVHzCrv();
			case LNGroupPPackage.PVPH__STR_VAL:
				if (resolve) return getStrVal();
				return basicGetStrVal();
			case LNGroupPPackage.PVPH__OP_DL_TMMS:
				if (resolve) return getOpDlTmms();
				return basicGetOpDlTmms();
			case LNGroupPPackage.PVPH__TYP_RS_CRV:
				if (resolve) return getTypRsCrv();
				return basicGetTypRsCrv();
			case LNGroupPPackage.PVPH__RS_DL_TMMS:
				if (resolve) return getRsDlTmms();
				return basicGetRsDlTmms();
			case LNGroupPPackage.PVPH__TM_MULT:
				if (resolve) return getTmMult();
				return basicGetTmMult();
			case LNGroupPPackage.PVPH__MIN_OP_TMMS:
				if (resolve) return getMinOpTmms();
				return basicGetMinOpTmms();
			case LNGroupPPackage.PVPH__MAX_OP_TMMS:
				if (resolve) return getMaxOpTmms();
				return basicGetMaxOpTmms();
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
			case LNGroupPPackage.PVPH__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PVPH__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PVPH__VHZ_ST:
				setVHzSt((CSD)newValue);
				return;
			case LNGroupPPackage.PVPH__VHZ_CRV:
				setVHzCrv((CURVE)newValue);
				return;
			case LNGroupPPackage.PVPH__STR_VAL:
				setStrVal((ASG)newValue);
				return;
			case LNGroupPPackage.PVPH__OP_DL_TMMS:
				setOpDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PVPH__TYP_RS_CRV:
				setTypRsCrv((ING)newValue);
				return;
			case LNGroupPPackage.PVPH__RS_DL_TMMS:
				setRsDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PVPH__TM_MULT:
				setTmMult((ASG)newValue);
				return;
			case LNGroupPPackage.PVPH__MIN_OP_TMMS:
				setMinOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PVPH__MAX_OP_TMMS:
				setMaxOpTmms((ING)newValue);
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
			case LNGroupPPackage.PVPH__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PVPH__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PVPH__VHZ_ST:
				setVHzSt((CSD)null);
				return;
			case LNGroupPPackage.PVPH__VHZ_CRV:
				setVHzCrv((CURVE)null);
				return;
			case LNGroupPPackage.PVPH__STR_VAL:
				setStrVal((ASG)null);
				return;
			case LNGroupPPackage.PVPH__OP_DL_TMMS:
				setOpDlTmms((ING)null);
				return;
			case LNGroupPPackage.PVPH__TYP_RS_CRV:
				setTypRsCrv((ING)null);
				return;
			case LNGroupPPackage.PVPH__RS_DL_TMMS:
				setRsDlTmms((ING)null);
				return;
			case LNGroupPPackage.PVPH__TM_MULT:
				setTmMult((ASG)null);
				return;
			case LNGroupPPackage.PVPH__MIN_OP_TMMS:
				setMinOpTmms((ING)null);
				return;
			case LNGroupPPackage.PVPH__MAX_OP_TMMS:
				setMaxOpTmms((ING)null);
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
			case LNGroupPPackage.PVPH__STR:
				return str != null;
			case LNGroupPPackage.PVPH__OP:
				return op != null;
			case LNGroupPPackage.PVPH__VHZ_ST:
				return vHzSt != null;
			case LNGroupPPackage.PVPH__VHZ_CRV:
				return vHzCrv != null;
			case LNGroupPPackage.PVPH__STR_VAL:
				return strVal != null;
			case LNGroupPPackage.PVPH__OP_DL_TMMS:
				return opDlTmms != null;
			case LNGroupPPackage.PVPH__TYP_RS_CRV:
				return typRsCrv != null;
			case LNGroupPPackage.PVPH__RS_DL_TMMS:
				return rsDlTmms != null;
			case LNGroupPPackage.PVPH__TM_MULT:
				return tmMult != null;
			case LNGroupPPackage.PVPH__MIN_OP_TMMS:
				return minOpTmms != null;
			case LNGroupPPackage.PVPH__MAX_OP_TMMS:
				return maxOpTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PVPHImpl
