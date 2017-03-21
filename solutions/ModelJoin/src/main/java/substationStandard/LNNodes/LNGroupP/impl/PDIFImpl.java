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
import substationStandard.Dataclasses.WYE;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import substationStandard.LNNodes.LNGroupP.PDIF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDIF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getTmASt <em>Tm ASt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getDifAClc <em>Dif AClc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getRstA <em>Rst A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getLinCapac <em>Lin Capac</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getLoSet <em>Lo Set</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getHiSet <em>Hi Set</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getRstMod <em>Rst Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getRsDiTmms <em>Rs Di Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PDIFImpl#getTmACrv <em>Tm ACrv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PDIFImpl extends GroupPImpl implements PDIF {
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
	 * The cached value of the '{@link #getTmASt() <em>Tm ASt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmASt()
	 * @generated
	 * @ordered
	 */
	protected CSD tmASt;

	/**
	 * The cached value of the '{@link #getDifAClc() <em>Dif AClc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifAClc()
	 * @generated
	 * @ordered
	 */
	protected WYE difAClc;

	/**
	 * The cached value of the '{@link #getRstA() <em>Rst A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRstA()
	 * @generated
	 * @ordered
	 */
	protected WYE rstA;

	/**
	 * The cached value of the '{@link #getLinCapac() <em>Lin Capac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinCapac()
	 * @generated
	 * @ordered
	 */
	protected ASG linCapac;

	/**
	 * The cached value of the '{@link #getLoSet() <em>Lo Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoSet()
	 * @generated
	 * @ordered
	 */
	protected ING loSet;

	/**
	 * The cached value of the '{@link #getHiSet() <em>Hi Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiSet()
	 * @generated
	 * @ordered
	 */
	protected ING hiSet;

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
	 * The cached value of the '{@link #getRstMod() <em>Rst Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRstMod()
	 * @generated
	 * @ordered
	 */
	protected ING rstMod;

	/**
	 * The cached value of the '{@link #getRsDiTmms() <em>Rs Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsDiTmms()
	 * @generated
	 * @ordered
	 */
	protected ING rsDiTmms;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDIFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PDIF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__OP, oldOp, op));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__TM_AST, oldTmASt, tmASt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__TM_AST, oldTmASt, tmASt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getDifAClc() {
		if (difAClc != null && difAClc.eIsProxy()) {
			InternalEObject oldDifAClc = (InternalEObject)difAClc;
			difAClc = (WYE)eResolveProxy(oldDifAClc);
			if (difAClc != oldDifAClc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__DIF_ACLC, oldDifAClc, difAClc));
			}
		}
		return difAClc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetDifAClc() {
		return difAClc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifAClc(WYE newDifAClc) {
		WYE oldDifAClc = difAClc;
		difAClc = newDifAClc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__DIF_ACLC, oldDifAClc, difAClc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE getRstA() {
		if (rstA != null && rstA.eIsProxy()) {
			InternalEObject oldRstA = (InternalEObject)rstA;
			rstA = (WYE)eResolveProxy(oldRstA);
			if (rstA != oldRstA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__RST_A, oldRstA, rstA));
			}
		}
		return rstA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE basicGetRstA() {
		return rstA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRstA(WYE newRstA) {
		WYE oldRstA = rstA;
		rstA = newRstA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__RST_A, oldRstA, rstA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLinCapac() {
		if (linCapac != null && linCapac.eIsProxy()) {
			InternalEObject oldLinCapac = (InternalEObject)linCapac;
			linCapac = (ASG)eResolveProxy(oldLinCapac);
			if (linCapac != oldLinCapac) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__LIN_CAPAC, oldLinCapac, linCapac));
			}
		}
		return linCapac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLinCapac() {
		return linCapac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinCapac(ASG newLinCapac) {
		ASG oldLinCapac = linCapac;
		linCapac = newLinCapac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__LIN_CAPAC, oldLinCapac, linCapac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getLoSet() {
		if (loSet != null && loSet.eIsProxy()) {
			InternalEObject oldLoSet = (InternalEObject)loSet;
			loSet = (ING)eResolveProxy(oldLoSet);
			if (loSet != oldLoSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__LO_SET, oldLoSet, loSet));
			}
		}
		return loSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetLoSet() {
		return loSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoSet(ING newLoSet) {
		ING oldLoSet = loSet;
		loSet = newLoSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__LO_SET, oldLoSet, loSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getHiSet() {
		if (hiSet != null && hiSet.eIsProxy()) {
			InternalEObject oldHiSet = (InternalEObject)hiSet;
			hiSet = (ING)eResolveProxy(oldHiSet);
			if (hiSet != oldHiSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__HI_SET, oldHiSet, hiSet));
			}
		}
		return hiSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetHiSet() {
		return hiSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiSet(ING newHiSet) {
		ING oldHiSet = hiSet;
		hiSet = newHiSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__HI_SET, oldHiSet, hiSet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRstMod() {
		if (rstMod != null && rstMod.eIsProxy()) {
			InternalEObject oldRstMod = (InternalEObject)rstMod;
			rstMod = (ING)eResolveProxy(oldRstMod);
			if (rstMod != oldRstMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__RST_MOD, oldRstMod, rstMod));
			}
		}
		return rstMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRstMod() {
		return rstMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRstMod(ING newRstMod) {
		ING oldRstMod = rstMod;
		rstMod = newRstMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__RST_MOD, oldRstMod, rstMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRsDiTmms() {
		if (rsDiTmms != null && rsDiTmms.eIsProxy()) {
			InternalEObject oldRsDiTmms = (InternalEObject)rsDiTmms;
			rsDiTmms = (ING)eResolveProxy(oldRsDiTmms);
			if (rsDiTmms != oldRsDiTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__RS_DI_TMMS, oldRsDiTmms, rsDiTmms));
			}
		}
		return rsDiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRsDiTmms() {
		return rsDiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRsDiTmms(ING newRsDiTmms) {
		ING oldRsDiTmms = rsDiTmms;
		rsDiTmms = newRsDiTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__RS_DI_TMMS, oldRsDiTmms, rsDiTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PDIF__TM_ACRV, oldTmACrv, tmACrv));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PDIF__TM_ACRV, oldTmACrv, tmACrv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PDIF__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PDIF__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PDIF__TM_AST:
				if (resolve) return getTmASt();
				return basicGetTmASt();
			case LNGroupPPackage.PDIF__DIF_ACLC:
				if (resolve) return getDifAClc();
				return basicGetDifAClc();
			case LNGroupPPackage.PDIF__RST_A:
				if (resolve) return getRstA();
				return basicGetRstA();
			case LNGroupPPackage.PDIF__LIN_CAPAC:
				if (resolve) return getLinCapac();
				return basicGetLinCapac();
			case LNGroupPPackage.PDIF__LO_SET:
				if (resolve) return getLoSet();
				return basicGetLoSet();
			case LNGroupPPackage.PDIF__HI_SET:
				if (resolve) return getHiSet();
				return basicGetHiSet();
			case LNGroupPPackage.PDIF__MIN_OP_TMMS:
				if (resolve) return getMinOpTmms();
				return basicGetMinOpTmms();
			case LNGroupPPackage.PDIF__MAX_OP_TMMS:
				if (resolve) return getMaxOpTmms();
				return basicGetMaxOpTmms();
			case LNGroupPPackage.PDIF__RST_MOD:
				if (resolve) return getRstMod();
				return basicGetRstMod();
			case LNGroupPPackage.PDIF__RS_DI_TMMS:
				if (resolve) return getRsDiTmms();
				return basicGetRsDiTmms();
			case LNGroupPPackage.PDIF__TM_ACRV:
				if (resolve) return getTmACrv();
				return basicGetTmACrv();
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
			case LNGroupPPackage.PDIF__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PDIF__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PDIF__TM_AST:
				setTmASt((CSD)newValue);
				return;
			case LNGroupPPackage.PDIF__DIF_ACLC:
				setDifAClc((WYE)newValue);
				return;
			case LNGroupPPackage.PDIF__RST_A:
				setRstA((WYE)newValue);
				return;
			case LNGroupPPackage.PDIF__LIN_CAPAC:
				setLinCapac((ASG)newValue);
				return;
			case LNGroupPPackage.PDIF__LO_SET:
				setLoSet((ING)newValue);
				return;
			case LNGroupPPackage.PDIF__HI_SET:
				setHiSet((ING)newValue);
				return;
			case LNGroupPPackage.PDIF__MIN_OP_TMMS:
				setMinOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PDIF__MAX_OP_TMMS:
				setMaxOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PDIF__RST_MOD:
				setRstMod((ING)newValue);
				return;
			case LNGroupPPackage.PDIF__RS_DI_TMMS:
				setRsDiTmms((ING)newValue);
				return;
			case LNGroupPPackage.PDIF__TM_ACRV:
				setTmACrv((CURVE)newValue);
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
			case LNGroupPPackage.PDIF__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PDIF__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PDIF__TM_AST:
				setTmASt((CSD)null);
				return;
			case LNGroupPPackage.PDIF__DIF_ACLC:
				setDifAClc((WYE)null);
				return;
			case LNGroupPPackage.PDIF__RST_A:
				setRstA((WYE)null);
				return;
			case LNGroupPPackage.PDIF__LIN_CAPAC:
				setLinCapac((ASG)null);
				return;
			case LNGroupPPackage.PDIF__LO_SET:
				setLoSet((ING)null);
				return;
			case LNGroupPPackage.PDIF__HI_SET:
				setHiSet((ING)null);
				return;
			case LNGroupPPackage.PDIF__MIN_OP_TMMS:
				setMinOpTmms((ING)null);
				return;
			case LNGroupPPackage.PDIF__MAX_OP_TMMS:
				setMaxOpTmms((ING)null);
				return;
			case LNGroupPPackage.PDIF__RST_MOD:
				setRstMod((ING)null);
				return;
			case LNGroupPPackage.PDIF__RS_DI_TMMS:
				setRsDiTmms((ING)null);
				return;
			case LNGroupPPackage.PDIF__TM_ACRV:
				setTmACrv((CURVE)null);
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
			case LNGroupPPackage.PDIF__STR:
				return str != null;
			case LNGroupPPackage.PDIF__OP:
				return op != null;
			case LNGroupPPackage.PDIF__TM_AST:
				return tmASt != null;
			case LNGroupPPackage.PDIF__DIF_ACLC:
				return difAClc != null;
			case LNGroupPPackage.PDIF__RST_A:
				return rstA != null;
			case LNGroupPPackage.PDIF__LIN_CAPAC:
				return linCapac != null;
			case LNGroupPPackage.PDIF__LO_SET:
				return loSet != null;
			case LNGroupPPackage.PDIF__HI_SET:
				return hiSet != null;
			case LNGroupPPackage.PDIF__MIN_OP_TMMS:
				return minOpTmms != null;
			case LNGroupPPackage.PDIF__MAX_OP_TMMS:
				return maxOpTmms != null;
			case LNGroupPPackage.PDIF__RST_MOD:
				return rstMod != null;
			case LNGroupPPackage.PDIF__RS_DI_TMMS:
				return rsDiTmms != null;
			case LNGroupPPackage.PDIF__TM_ACRV:
				return tmACrv != null;
		}
		return super.eIsSet(featureID);
	}

} //PDIFImpl
