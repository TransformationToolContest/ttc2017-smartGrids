/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import substationStandard.LNNodes.LNGroupR.RADR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RADR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getChTrg <em>Ch Trg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getChNum <em>Ch Num</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getTrGMod <em>Tr GMod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getLevMod <em>Lev Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getHiTrgLev <em>Hi Trg Lev</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getLoTrgLev <em>Lo Trg Lev</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getPreTmms <em>Pre Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RADRImpl#getPstTmms <em>Pst Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RADRImpl extends GroupRImpl implements RADR {
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
	 * The cached value of the '{@link #getChTrg() <em>Ch Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChTrg()
	 * @generated
	 * @ordered
	 */
	protected SPS chTrg;

	/**
	 * The cached value of the '{@link #getChNum() <em>Ch Num</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChNum()
	 * @generated
	 * @ordered
	 */
	protected ING chNum;

	/**
	 * The cached value of the '{@link #getTrGMod() <em>Tr GMod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrGMod()
	 * @generated
	 * @ordered
	 */
	protected ING trGMod;

	/**
	 * The cached value of the '{@link #getLevMod() <em>Lev Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevMod()
	 * @generated
	 * @ordered
	 */
	protected ING levMod;

	/**
	 * The cached value of the '{@link #getHiTrgLev() <em>Hi Trg Lev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiTrgLev()
	 * @generated
	 * @ordered
	 */
	protected ASG hiTrgLev;

	/**
	 * The cached value of the '{@link #getLoTrgLev() <em>Lo Trg Lev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoTrgLev()
	 * @generated
	 * @ordered
	 */
	protected ASG loTrgLev;

	/**
	 * The cached value of the '{@link #getPreTmms() <em>Pre Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreTmms()
	 * @generated
	 * @ordered
	 */
	protected ING preTmms;

	/**
	 * The cached value of the '{@link #getPstTmms() <em>Pst Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPstTmms()
	 * @generated
	 * @ordered
	 */
	protected ING pstTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RADRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RADR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__OP_CNT_RS, oldOpCntRs, opCntRs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__OP_CNT_RS, oldOpCntRs, opCntRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getChTrg() {
		if (chTrg != null && chTrg.eIsProxy()) {
			InternalEObject oldChTrg = (InternalEObject)chTrg;
			chTrg = (SPS)eResolveProxy(oldChTrg);
			if (chTrg != oldChTrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__CH_TRG, oldChTrg, chTrg));
			}
		}
		return chTrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetChTrg() {
		return chTrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChTrg(SPS newChTrg) {
		SPS oldChTrg = chTrg;
		chTrg = newChTrg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__CH_TRG, oldChTrg, chTrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getChNum() {
		if (chNum != null && chNum.eIsProxy()) {
			InternalEObject oldChNum = (InternalEObject)chNum;
			chNum = (ING)eResolveProxy(oldChNum);
			if (chNum != oldChNum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__CH_NUM, oldChNum, chNum));
			}
		}
		return chNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetChNum() {
		return chNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChNum(ING newChNum) {
		ING oldChNum = chNum;
		chNum = newChNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__CH_NUM, oldChNum, chNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getTrGMod() {
		if (trGMod != null && trGMod.eIsProxy()) {
			InternalEObject oldTrGMod = (InternalEObject)trGMod;
			trGMod = (ING)eResolveProxy(oldTrGMod);
			if (trGMod != oldTrGMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__TR_GMOD, oldTrGMod, trGMod));
			}
		}
		return trGMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetTrGMod() {
		return trGMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrGMod(ING newTrGMod) {
		ING oldTrGMod = trGMod;
		trGMod = newTrGMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__TR_GMOD, oldTrGMod, trGMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getLevMod() {
		if (levMod != null && levMod.eIsProxy()) {
			InternalEObject oldLevMod = (InternalEObject)levMod;
			levMod = (ING)eResolveProxy(oldLevMod);
			if (levMod != oldLevMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__LEV_MOD, oldLevMod, levMod));
			}
		}
		return levMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetLevMod() {
		return levMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevMod(ING newLevMod) {
		ING oldLevMod = levMod;
		levMod = newLevMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__LEV_MOD, oldLevMod, levMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getHiTrgLev() {
		if (hiTrgLev != null && hiTrgLev.eIsProxy()) {
			InternalEObject oldHiTrgLev = (InternalEObject)hiTrgLev;
			hiTrgLev = (ASG)eResolveProxy(oldHiTrgLev);
			if (hiTrgLev != oldHiTrgLev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__HI_TRG_LEV, oldHiTrgLev, hiTrgLev));
			}
		}
		return hiTrgLev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetHiTrgLev() {
		return hiTrgLev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiTrgLev(ASG newHiTrgLev) {
		ASG oldHiTrgLev = hiTrgLev;
		hiTrgLev = newHiTrgLev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__HI_TRG_LEV, oldHiTrgLev, hiTrgLev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getLoTrgLev() {
		if (loTrgLev != null && loTrgLev.eIsProxy()) {
			InternalEObject oldLoTrgLev = (InternalEObject)loTrgLev;
			loTrgLev = (ASG)eResolveProxy(oldLoTrgLev);
			if (loTrgLev != oldLoTrgLev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__LO_TRG_LEV, oldLoTrgLev, loTrgLev));
			}
		}
		return loTrgLev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetLoTrgLev() {
		return loTrgLev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoTrgLev(ASG newLoTrgLev) {
		ASG oldLoTrgLev = loTrgLev;
		loTrgLev = newLoTrgLev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__LO_TRG_LEV, oldLoTrgLev, loTrgLev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getPreTmms() {
		if (preTmms != null && preTmms.eIsProxy()) {
			InternalEObject oldPreTmms = (InternalEObject)preTmms;
			preTmms = (ING)eResolveProxy(oldPreTmms);
			if (preTmms != oldPreTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__PRE_TMMS, oldPreTmms, preTmms));
			}
		}
		return preTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetPreTmms() {
		return preTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreTmms(ING newPreTmms) {
		ING oldPreTmms = preTmms;
		preTmms = newPreTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__PRE_TMMS, oldPreTmms, preTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getPstTmms() {
		if (pstTmms != null && pstTmms.eIsProxy()) {
			InternalEObject oldPstTmms = (InternalEObject)pstTmms;
			pstTmms = (ING)eResolveProxy(oldPstTmms);
			if (pstTmms != oldPstTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RADR__PST_TMMS, oldPstTmms, pstTmms));
			}
		}
		return pstTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetPstTmms() {
		return pstTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPstTmms(ING newPstTmms) {
		ING oldPstTmms = pstTmms;
		pstTmms = newPstTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RADR__PST_TMMS, oldPstTmms, pstTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RADR__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupRPackage.RADR__CH_TRG:
				if (resolve) return getChTrg();
				return basicGetChTrg();
			case LNGroupRPackage.RADR__CH_NUM:
				if (resolve) return getChNum();
				return basicGetChNum();
			case LNGroupRPackage.RADR__TR_GMOD:
				if (resolve) return getTrGMod();
				return basicGetTrGMod();
			case LNGroupRPackage.RADR__LEV_MOD:
				if (resolve) return getLevMod();
				return basicGetLevMod();
			case LNGroupRPackage.RADR__HI_TRG_LEV:
				if (resolve) return getHiTrgLev();
				return basicGetHiTrgLev();
			case LNGroupRPackage.RADR__LO_TRG_LEV:
				if (resolve) return getLoTrgLev();
				return basicGetLoTrgLev();
			case LNGroupRPackage.RADR__PRE_TMMS:
				if (resolve) return getPreTmms();
				return basicGetPreTmms();
			case LNGroupRPackage.RADR__PST_TMMS:
				if (resolve) return getPstTmms();
				return basicGetPstTmms();
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
			case LNGroupRPackage.RADR__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupRPackage.RADR__CH_TRG:
				setChTrg((SPS)newValue);
				return;
			case LNGroupRPackage.RADR__CH_NUM:
				setChNum((ING)newValue);
				return;
			case LNGroupRPackage.RADR__TR_GMOD:
				setTrGMod((ING)newValue);
				return;
			case LNGroupRPackage.RADR__LEV_MOD:
				setLevMod((ING)newValue);
				return;
			case LNGroupRPackage.RADR__HI_TRG_LEV:
				setHiTrgLev((ASG)newValue);
				return;
			case LNGroupRPackage.RADR__LO_TRG_LEV:
				setLoTrgLev((ASG)newValue);
				return;
			case LNGroupRPackage.RADR__PRE_TMMS:
				setPreTmms((ING)newValue);
				return;
			case LNGroupRPackage.RADR__PST_TMMS:
				setPstTmms((ING)newValue);
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
			case LNGroupRPackage.RADR__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupRPackage.RADR__CH_TRG:
				setChTrg((SPS)null);
				return;
			case LNGroupRPackage.RADR__CH_NUM:
				setChNum((ING)null);
				return;
			case LNGroupRPackage.RADR__TR_GMOD:
				setTrGMod((ING)null);
				return;
			case LNGroupRPackage.RADR__LEV_MOD:
				setLevMod((ING)null);
				return;
			case LNGroupRPackage.RADR__HI_TRG_LEV:
				setHiTrgLev((ASG)null);
				return;
			case LNGroupRPackage.RADR__LO_TRG_LEV:
				setLoTrgLev((ASG)null);
				return;
			case LNGroupRPackage.RADR__PRE_TMMS:
				setPreTmms((ING)null);
				return;
			case LNGroupRPackage.RADR__PST_TMMS:
				setPstTmms((ING)null);
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
			case LNGroupRPackage.RADR__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupRPackage.RADR__CH_TRG:
				return chTrg != null;
			case LNGroupRPackage.RADR__CH_NUM:
				return chNum != null;
			case LNGroupRPackage.RADR__TR_GMOD:
				return trGMod != null;
			case LNGroupRPackage.RADR__LEV_MOD:
				return levMod != null;
			case LNGroupRPackage.RADR__HI_TRG_LEV:
				return hiTrgLev != null;
			case LNGroupRPackage.RADR__LO_TRG_LEV:
				return loTrgLev != null;
			case LNGroupRPackage.RADR__PRE_TMMS:
				return preTmms != null;
			case LNGroupRPackage.RADR__PST_TMMS:
				return pstTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //RADRImpl
