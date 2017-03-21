/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import substationStandard.LNNodes.LNGroupR.RBDR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RBDR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RBDRImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RBDRImpl#getChTrg <em>Ch Trg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RBDRImpl#getChNum <em>Ch Num</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RBDRImpl#getTrgMod <em>Trg Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RBDRImpl#getLevMod <em>Lev Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RBDRImpl#getPreTmms <em>Pre Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RBDRImpl#getPstTmms <em>Pst Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RBDRImpl extends GroupRImpl implements RBDR {
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
	 * The cached value of the '{@link #getTrgMod() <em>Trg Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgMod()
	 * @generated
	 * @ordered
	 */
	protected ING trgMod;

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
	protected RBDRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RBDR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBDR__OP_CNT_RS, oldOpCntRs, opCntRs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBDR__OP_CNT_RS, oldOpCntRs, opCntRs));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBDR__CH_TRG, oldChTrg, chTrg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBDR__CH_TRG, oldChTrg, chTrg));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBDR__CH_NUM, oldChNum, chNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBDR__CH_NUM, oldChNum, chNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getTrgMod() {
		if (trgMod != null && trgMod.eIsProxy()) {
			InternalEObject oldTrgMod = (InternalEObject)trgMod;
			trgMod = (ING)eResolveProxy(oldTrgMod);
			if (trgMod != oldTrgMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBDR__TRG_MOD, oldTrgMod, trgMod));
			}
		}
		return trgMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetTrgMod() {
		return trgMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrgMod(ING newTrgMod) {
		ING oldTrgMod = trgMod;
		trgMod = newTrgMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBDR__TRG_MOD, oldTrgMod, trgMod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBDR__LEV_MOD, oldLevMod, levMod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBDR__LEV_MOD, oldLevMod, levMod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBDR__PRE_TMMS, oldPreTmms, preTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBDR__PRE_TMMS, oldPreTmms, preTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RBDR__PST_TMMS, oldPstTmms, pstTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RBDR__PST_TMMS, oldPstTmms, pstTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RBDR__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupRPackage.RBDR__CH_TRG:
				if (resolve) return getChTrg();
				return basicGetChTrg();
			case LNGroupRPackage.RBDR__CH_NUM:
				if (resolve) return getChNum();
				return basicGetChNum();
			case LNGroupRPackage.RBDR__TRG_MOD:
				if (resolve) return getTrgMod();
				return basicGetTrgMod();
			case LNGroupRPackage.RBDR__LEV_MOD:
				if (resolve) return getLevMod();
				return basicGetLevMod();
			case LNGroupRPackage.RBDR__PRE_TMMS:
				if (resolve) return getPreTmms();
				return basicGetPreTmms();
			case LNGroupRPackage.RBDR__PST_TMMS:
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
			case LNGroupRPackage.RBDR__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupRPackage.RBDR__CH_TRG:
				setChTrg((SPS)newValue);
				return;
			case LNGroupRPackage.RBDR__CH_NUM:
				setChNum((ING)newValue);
				return;
			case LNGroupRPackage.RBDR__TRG_MOD:
				setTrgMod((ING)newValue);
				return;
			case LNGroupRPackage.RBDR__LEV_MOD:
				setLevMod((ING)newValue);
				return;
			case LNGroupRPackage.RBDR__PRE_TMMS:
				setPreTmms((ING)newValue);
				return;
			case LNGroupRPackage.RBDR__PST_TMMS:
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
			case LNGroupRPackage.RBDR__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupRPackage.RBDR__CH_TRG:
				setChTrg((SPS)null);
				return;
			case LNGroupRPackage.RBDR__CH_NUM:
				setChNum((ING)null);
				return;
			case LNGroupRPackage.RBDR__TRG_MOD:
				setTrgMod((ING)null);
				return;
			case LNGroupRPackage.RBDR__LEV_MOD:
				setLevMod((ING)null);
				return;
			case LNGroupRPackage.RBDR__PRE_TMMS:
				setPreTmms((ING)null);
				return;
			case LNGroupRPackage.RBDR__PST_TMMS:
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
			case LNGroupRPackage.RBDR__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupRPackage.RBDR__CH_TRG:
				return chTrg != null;
			case LNGroupRPackage.RBDR__CH_NUM:
				return chNum != null;
			case LNGroupRPackage.RBDR__TRG_MOD:
				return trgMod != null;
			case LNGroupRPackage.RBDR__LEV_MOD:
				return levMod != null;
			case LNGroupRPackage.RBDR__PRE_TMMS:
				return preTmms != null;
			case LNGroupRPackage.RBDR__PST_TMMS:
				return pstTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //RBDRImpl
