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
import substationStandard.LNNodes.LNGroupP.PVOC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PVOC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getAVSt <em>AV St</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getTmASt <em>Tm ASt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getTmMult <em>Tm Mult</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getAVCrv <em>AV Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getTmACrv <em>Tm ACrv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getTypRsCrv <em>Typ Rs Crv</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PVOCImpl#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PVOCImpl extends GroupPImpl implements PVOC {
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
	 * The cached value of the '{@link #getAVSt() <em>AV St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVSt()
	 * @generated
	 * @ordered
	 */
	protected CSD avSt;

	/**
	 * The cached value of the '{@link #getTmASt() <em>Tm ASt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmASt()
	 * @generated
	 * @ordered
	 */
	protected CSD tmASt;

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
	 * The cached value of the '{@link #getAVCrv() <em>AV Crv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVCrv()
	 * @generated
	 * @ordered
	 */
	protected CURVE avCrv;

	/**
	 * The cached value of the '{@link #getTmACrv() <em>Tm ACrv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmACrv()
	 * @generated
	 * @ordered
	 */
	protected CURVE tmACrv;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PVOCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PVOC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD getAVSt() {
		if (avSt != null && avSt.eIsProxy()) {
			InternalEObject oldAVSt = (InternalEObject)avSt;
			avSt = (CSD)eResolveProxy(oldAVSt);
			if (avSt != oldAVSt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__AV_ST, oldAVSt, avSt));
			}
		}
		return avSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD basicGetAVSt() {
		return avSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAVSt(CSD newAVSt) {
		CSD oldAVSt = avSt;
		avSt = newAVSt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__AV_ST, oldAVSt, avSt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD getTmASt() {
		if (tmASt != null && tmASt.eIsProxy()) {
			InternalEObject oldTmASt = (InternalEObject)tmASt;
			tmASt = (CSD)eResolveProxy(oldTmASt);
			if (tmASt != oldTmASt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__TM_AST, oldTmASt, tmASt));
			}
		}
		return tmASt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD basicGetTmASt() {
		return tmASt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmASt(CSD newTmASt) {
		CSD oldTmASt = tmASt;
		tmASt = newTmASt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__TM_AST, oldTmASt, tmASt));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__TM_MULT, oldTmMult, tmMult));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__TM_MULT, oldTmMult, tmMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE getAVCrv() {
		if (avCrv != null && avCrv.eIsProxy()) {
			InternalEObject oldAVCrv = (InternalEObject)avCrv;
			avCrv = (CURVE)eResolveProxy(oldAVCrv);
			if (avCrv != oldAVCrv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__AV_CRV, oldAVCrv, avCrv));
			}
		}
		return avCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE basicGetAVCrv() {
		return avCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAVCrv(CURVE newAVCrv) {
		CURVE oldAVCrv = avCrv;
		avCrv = newAVCrv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__AV_CRV, oldAVCrv, avCrv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE getTmACrv() {
		if (tmACrv != null && tmACrv.eIsProxy()) {
			InternalEObject oldTmACrv = (InternalEObject)tmACrv;
			tmACrv = (CURVE)eResolveProxy(oldTmACrv);
			if (tmACrv != oldTmACrv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__TM_ACRV, oldTmACrv, tmACrv));
			}
		}
		return tmACrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE basicGetTmACrv() {
		return tmACrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmACrv(CURVE newTmACrv) {
		CURVE oldTmACrv = tmACrv;
		tmACrv = newTmACrv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__TM_ACRV, oldTmACrv, tmACrv));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__TYP_RS_CRV, oldTypRsCrv, typRsCrv));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__TYP_RS_CRV, oldTypRsCrv, typRsCrv));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PVOC__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PVOC__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PVOC__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PVOC__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PVOC__AV_ST:
				if (resolve) return getAVSt();
				return basicGetAVSt();
			case LNGroupPPackage.PVOC__TM_AST:
				if (resolve) return getTmASt();
				return basicGetTmASt();
			case LNGroupPPackage.PVOC__TM_MULT:
				if (resolve) return getTmMult();
				return basicGetTmMult();
			case LNGroupPPackage.PVOC__AV_CRV:
				if (resolve) return getAVCrv();
				return basicGetAVCrv();
			case LNGroupPPackage.PVOC__TM_ACRV:
				if (resolve) return getTmACrv();
				return basicGetTmACrv();
			case LNGroupPPackage.PVOC__MIN_OP_TMMS:
				if (resolve) return getMinOpTmms();
				return basicGetMinOpTmms();
			case LNGroupPPackage.PVOC__MAX_OP_TMMS:
				if (resolve) return getMaxOpTmms();
				return basicGetMaxOpTmms();
			case LNGroupPPackage.PVOC__OP_DL_TMMS:
				if (resolve) return getOpDlTmms();
				return basicGetOpDlTmms();
			case LNGroupPPackage.PVOC__TYP_RS_CRV:
				if (resolve) return getTypRsCrv();
				return basicGetTypRsCrv();
			case LNGroupPPackage.PVOC__RS_DL_TMMS:
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
			case LNGroupPPackage.PVOC__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PVOC__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PVOC__AV_ST:
				setAVSt((CSD)newValue);
				return;
			case LNGroupPPackage.PVOC__TM_AST:
				setTmASt((CSD)newValue);
				return;
			case LNGroupPPackage.PVOC__TM_MULT:
				setTmMult((ASG)newValue);
				return;
			case LNGroupPPackage.PVOC__AV_CRV:
				setAVCrv((CURVE)newValue);
				return;
			case LNGroupPPackage.PVOC__TM_ACRV:
				setTmACrv((CURVE)newValue);
				return;
			case LNGroupPPackage.PVOC__MIN_OP_TMMS:
				setMinOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PVOC__MAX_OP_TMMS:
				setMaxOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PVOC__OP_DL_TMMS:
				setOpDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PVOC__TYP_RS_CRV:
				setTypRsCrv((ING)newValue);
				return;
			case LNGroupPPackage.PVOC__RS_DL_TMMS:
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
			case LNGroupPPackage.PVOC__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PVOC__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PVOC__AV_ST:
				setAVSt((CSD)null);
				return;
			case LNGroupPPackage.PVOC__TM_AST:
				setTmASt((CSD)null);
				return;
			case LNGroupPPackage.PVOC__TM_MULT:
				setTmMult((ASG)null);
				return;
			case LNGroupPPackage.PVOC__AV_CRV:
				setAVCrv((CURVE)null);
				return;
			case LNGroupPPackage.PVOC__TM_ACRV:
				setTmACrv((CURVE)null);
				return;
			case LNGroupPPackage.PVOC__MIN_OP_TMMS:
				setMinOpTmms((ING)null);
				return;
			case LNGroupPPackage.PVOC__MAX_OP_TMMS:
				setMaxOpTmms((ING)null);
				return;
			case LNGroupPPackage.PVOC__OP_DL_TMMS:
				setOpDlTmms((ING)null);
				return;
			case LNGroupPPackage.PVOC__TYP_RS_CRV:
				setTypRsCrv((ING)null);
				return;
			case LNGroupPPackage.PVOC__RS_DL_TMMS:
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
			case LNGroupPPackage.PVOC__STR:
				return str != null;
			case LNGroupPPackage.PVOC__OP:
				return op != null;
			case LNGroupPPackage.PVOC__AV_ST:
				return avSt != null;
			case LNGroupPPackage.PVOC__TM_AST:
				return tmASt != null;
			case LNGroupPPackage.PVOC__TM_MULT:
				return tmMult != null;
			case LNGroupPPackage.PVOC__AV_CRV:
				return avCrv != null;
			case LNGroupPPackage.PVOC__TM_ACRV:
				return tmACrv != null;
			case LNGroupPPackage.PVOC__MIN_OP_TMMS:
				return minOpTmms != null;
			case LNGroupPPackage.PVOC__MAX_OP_TMMS:
				return maxOpTmms != null;
			case LNGroupPPackage.PVOC__OP_DL_TMMS:
				return opDlTmms != null;
			case LNGroupPPackage.PVOC__TYP_RS_CRV:
				return typRsCrv != null;
			case LNGroupPPackage.PVOC__RS_DL_TMMS:
				return rsDlTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PVOCImpl
