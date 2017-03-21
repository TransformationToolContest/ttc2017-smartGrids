/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import substationStandard.LNNodes.LNGroupR.RDRE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDRE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getRcdTrg <em>Rcd Trg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getMemRs <em>Mem Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getMemClr <em>Mem Clr</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getRcdMade <em>Rcd Made</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getFltNum <em>Flt Num</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getGriFltNum <em>Gri Flt Num</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getRcdStr <em>Rcd Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getMemUsed <em>Mem Used</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getTrgMod <em>Trg Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getLevMod <em>Lev Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getPreTmms <em>Pre Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getPstTmms <em>Pst Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getMemFull <em>Mem Full</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getMaxNumRcd <em>Max Num Rcd</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getReTrgMod <em>Re Trg Mod</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getPerTrgTms <em>Per Trg Tms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getExclTmms <em>Excl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RDREImpl#getOpMod <em>Op Mod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDREImpl extends GroupRImpl implements RDRE {
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
	 * The cached value of the '{@link #getRcdTrg() <em>Rcd Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcdTrg()
	 * @generated
	 * @ordered
	 */
	protected SPC rcdTrg;

	/**
	 * The cached value of the '{@link #getMemRs() <em>Mem Rs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemRs()
	 * @generated
	 * @ordered
	 */
	protected SPC memRs;

	/**
	 * The cached value of the '{@link #getMemClr() <em>Mem Clr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemClr()
	 * @generated
	 * @ordered
	 */
	protected SPC memClr;

	/**
	 * The cached value of the '{@link #getRcdMade() <em>Rcd Made</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcdMade()
	 * @generated
	 * @ordered
	 */
	protected SPS rcdMade;

	/**
	 * The cached value of the '{@link #getFltNum() <em>Flt Num</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFltNum()
	 * @generated
	 * @ordered
	 */
	protected INS fltNum;

	/**
	 * The cached value of the '{@link #getGriFltNum() <em>Gri Flt Num</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGriFltNum()
	 * @generated
	 * @ordered
	 */
	protected INS griFltNum;

	/**
	 * The cached value of the '{@link #getRcdStr() <em>Rcd Str</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcdStr()
	 * @generated
	 * @ordered
	 */
	protected SPS rcdStr;

	/**
	 * The cached value of the '{@link #getMemUsed() <em>Mem Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemUsed()
	 * @generated
	 * @ordered
	 */
	protected INS memUsed;

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
	 * The cached value of the '{@link #getMemFull() <em>Mem Full</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemFull()
	 * @generated
	 * @ordered
	 */
	protected ING memFull;

	/**
	 * The cached value of the '{@link #getMaxNumRcd() <em>Max Num Rcd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumRcd()
	 * @generated
	 * @ordered
	 */
	protected ING maxNumRcd;

	/**
	 * The cached value of the '{@link #getReTrgMod() <em>Re Trg Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReTrgMod()
	 * @generated
	 * @ordered
	 */
	protected ING reTrgMod;

	/**
	 * The cached value of the '{@link #getPerTrgTms() <em>Per Trg Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerTrgTms()
	 * @generated
	 * @ordered
	 */
	protected ING perTrgTms;

	/**
	 * The cached value of the '{@link #getExclTmms() <em>Excl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclTmms()
	 * @generated
	 * @ordered
	 */
	protected ING exclTmms;

	/**
	 * The cached value of the '{@link #getOpMod() <em>Op Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpMod()
	 * @generated
	 * @ordered
	 */
	protected ING opMod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDREImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RDRE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__OP_CNT_RS, oldOpCntRs, opCntRs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__OP_CNT_RS, oldOpCntRs, opCntRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getRcdTrg() {
		if (rcdTrg != null && rcdTrg.eIsProxy()) {
			InternalEObject oldRcdTrg = (InternalEObject)rcdTrg;
			rcdTrg = (SPC)eResolveProxy(oldRcdTrg);
			if (rcdTrg != oldRcdTrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__RCD_TRG, oldRcdTrg, rcdTrg));
			}
		}
		return rcdTrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetRcdTrg() {
		return rcdTrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRcdTrg(SPC newRcdTrg) {
		SPC oldRcdTrg = rcdTrg;
		rcdTrg = newRcdTrg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__RCD_TRG, oldRcdTrg, rcdTrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getMemRs() {
		if (memRs != null && memRs.eIsProxy()) {
			InternalEObject oldMemRs = (InternalEObject)memRs;
			memRs = (SPC)eResolveProxy(oldMemRs);
			if (memRs != oldMemRs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__MEM_RS, oldMemRs, memRs));
			}
		}
		return memRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetMemRs() {
		return memRs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemRs(SPC newMemRs) {
		SPC oldMemRs = memRs;
		memRs = newMemRs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__MEM_RS, oldMemRs, memRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getMemClr() {
		if (memClr != null && memClr.eIsProxy()) {
			InternalEObject oldMemClr = (InternalEObject)memClr;
			memClr = (SPC)eResolveProxy(oldMemClr);
			if (memClr != oldMemClr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__MEM_CLR, oldMemClr, memClr));
			}
		}
		return memClr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetMemClr() {
		return memClr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemClr(SPC newMemClr) {
		SPC oldMemClr = memClr;
		memClr = newMemClr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__MEM_CLR, oldMemClr, memClr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getRcdMade() {
		if (rcdMade != null && rcdMade.eIsProxy()) {
			InternalEObject oldRcdMade = (InternalEObject)rcdMade;
			rcdMade = (SPS)eResolveProxy(oldRcdMade);
			if (rcdMade != oldRcdMade) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__RCD_MADE, oldRcdMade, rcdMade));
			}
		}
		return rcdMade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetRcdMade() {
		return rcdMade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRcdMade(SPS newRcdMade) {
		SPS oldRcdMade = rcdMade;
		rcdMade = newRcdMade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__RCD_MADE, oldRcdMade, rcdMade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getFltNum() {
		if (fltNum != null && fltNum.eIsProxy()) {
			InternalEObject oldFltNum = (InternalEObject)fltNum;
			fltNum = (INS)eResolveProxy(oldFltNum);
			if (fltNum != oldFltNum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__FLT_NUM, oldFltNum, fltNum));
			}
		}
		return fltNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetFltNum() {
		return fltNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFltNum(INS newFltNum) {
		INS oldFltNum = fltNum;
		fltNum = newFltNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__FLT_NUM, oldFltNum, fltNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getGriFltNum() {
		if (griFltNum != null && griFltNum.eIsProxy()) {
			InternalEObject oldGriFltNum = (InternalEObject)griFltNum;
			griFltNum = (INS)eResolveProxy(oldGriFltNum);
			if (griFltNum != oldGriFltNum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__GRI_FLT_NUM, oldGriFltNum, griFltNum));
			}
		}
		return griFltNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetGriFltNum() {
		return griFltNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGriFltNum(INS newGriFltNum) {
		INS oldGriFltNum = griFltNum;
		griFltNum = newGriFltNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__GRI_FLT_NUM, oldGriFltNum, griFltNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getRcdStr() {
		if (rcdStr != null && rcdStr.eIsProxy()) {
			InternalEObject oldRcdStr = (InternalEObject)rcdStr;
			rcdStr = (SPS)eResolveProxy(oldRcdStr);
			if (rcdStr != oldRcdStr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__RCD_STR, oldRcdStr, rcdStr));
			}
		}
		return rcdStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetRcdStr() {
		return rcdStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRcdStr(SPS newRcdStr) {
		SPS oldRcdStr = rcdStr;
		rcdStr = newRcdStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__RCD_STR, oldRcdStr, rcdStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getMemUsed() {
		if (memUsed != null && memUsed.eIsProxy()) {
			InternalEObject oldMemUsed = (InternalEObject)memUsed;
			memUsed = (INS)eResolveProxy(oldMemUsed);
			if (memUsed != oldMemUsed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__MEM_USED, oldMemUsed, memUsed));
			}
		}
		return memUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetMemUsed() {
		return memUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemUsed(INS newMemUsed) {
		INS oldMemUsed = memUsed;
		memUsed = newMemUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__MEM_USED, oldMemUsed, memUsed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__TRG_MOD, oldTrgMod, trgMod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__TRG_MOD, oldTrgMod, trgMod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__LEV_MOD, oldLevMod, levMod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__LEV_MOD, oldLevMod, levMod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__PRE_TMMS, oldPreTmms, preTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__PRE_TMMS, oldPreTmms, preTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__PST_TMMS, oldPstTmms, pstTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__PST_TMMS, oldPstTmms, pstTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMemFull() {
		if (memFull != null && memFull.eIsProxy()) {
			InternalEObject oldMemFull = (InternalEObject)memFull;
			memFull = (ING)eResolveProxy(oldMemFull);
			if (memFull != oldMemFull) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__MEM_FULL, oldMemFull, memFull));
			}
		}
		return memFull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMemFull() {
		return memFull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemFull(ING newMemFull) {
		ING oldMemFull = memFull;
		memFull = newMemFull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__MEM_FULL, oldMemFull, memFull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMaxNumRcd() {
		if (maxNumRcd != null && maxNumRcd.eIsProxy()) {
			InternalEObject oldMaxNumRcd = (InternalEObject)maxNumRcd;
			maxNumRcd = (ING)eResolveProxy(oldMaxNumRcd);
			if (maxNumRcd != oldMaxNumRcd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__MAX_NUM_RCD, oldMaxNumRcd, maxNumRcd));
			}
		}
		return maxNumRcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMaxNumRcd() {
		return maxNumRcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumRcd(ING newMaxNumRcd) {
		ING oldMaxNumRcd = maxNumRcd;
		maxNumRcd = newMaxNumRcd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__MAX_NUM_RCD, oldMaxNumRcd, maxNumRcd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getReTrgMod() {
		if (reTrgMod != null && reTrgMod.eIsProxy()) {
			InternalEObject oldReTrgMod = (InternalEObject)reTrgMod;
			reTrgMod = (ING)eResolveProxy(oldReTrgMod);
			if (reTrgMod != oldReTrgMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__RE_TRG_MOD, oldReTrgMod, reTrgMod));
			}
		}
		return reTrgMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetReTrgMod() {
		return reTrgMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReTrgMod(ING newReTrgMod) {
		ING oldReTrgMod = reTrgMod;
		reTrgMod = newReTrgMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__RE_TRG_MOD, oldReTrgMod, reTrgMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getPerTrgTms() {
		if (perTrgTms != null && perTrgTms.eIsProxy()) {
			InternalEObject oldPerTrgTms = (InternalEObject)perTrgTms;
			perTrgTms = (ING)eResolveProxy(oldPerTrgTms);
			if (perTrgTms != oldPerTrgTms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__PER_TRG_TMS, oldPerTrgTms, perTrgTms));
			}
		}
		return perTrgTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetPerTrgTms() {
		return perTrgTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerTrgTms(ING newPerTrgTms) {
		ING oldPerTrgTms = perTrgTms;
		perTrgTms = newPerTrgTms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__PER_TRG_TMS, oldPerTrgTms, perTrgTms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getExclTmms() {
		if (exclTmms != null && exclTmms.eIsProxy()) {
			InternalEObject oldExclTmms = (InternalEObject)exclTmms;
			exclTmms = (ING)eResolveProxy(oldExclTmms);
			if (exclTmms != oldExclTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__EXCL_TMMS, oldExclTmms, exclTmms));
			}
		}
		return exclTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetExclTmms() {
		return exclTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclTmms(ING newExclTmms) {
		ING oldExclTmms = exclTmms;
		exclTmms = newExclTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__EXCL_TMMS, oldExclTmms, exclTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getOpMod() {
		if (opMod != null && opMod.eIsProxy()) {
			InternalEObject oldOpMod = (InternalEObject)opMod;
			opMod = (ING)eResolveProxy(oldOpMod);
			if (opMod != oldOpMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RDRE__OP_MOD, oldOpMod, opMod));
			}
		}
		return opMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetOpMod() {
		return opMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpMod(ING newOpMod) {
		ING oldOpMod = opMod;
		opMod = newOpMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RDRE__OP_MOD, oldOpMod, opMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RDRE__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupRPackage.RDRE__RCD_TRG:
				if (resolve) return getRcdTrg();
				return basicGetRcdTrg();
			case LNGroupRPackage.RDRE__MEM_RS:
				if (resolve) return getMemRs();
				return basicGetMemRs();
			case LNGroupRPackage.RDRE__MEM_CLR:
				if (resolve) return getMemClr();
				return basicGetMemClr();
			case LNGroupRPackage.RDRE__RCD_MADE:
				if (resolve) return getRcdMade();
				return basicGetRcdMade();
			case LNGroupRPackage.RDRE__FLT_NUM:
				if (resolve) return getFltNum();
				return basicGetFltNum();
			case LNGroupRPackage.RDRE__GRI_FLT_NUM:
				if (resolve) return getGriFltNum();
				return basicGetGriFltNum();
			case LNGroupRPackage.RDRE__RCD_STR:
				if (resolve) return getRcdStr();
				return basicGetRcdStr();
			case LNGroupRPackage.RDRE__MEM_USED:
				if (resolve) return getMemUsed();
				return basicGetMemUsed();
			case LNGroupRPackage.RDRE__TRG_MOD:
				if (resolve) return getTrgMod();
				return basicGetTrgMod();
			case LNGroupRPackage.RDRE__LEV_MOD:
				if (resolve) return getLevMod();
				return basicGetLevMod();
			case LNGroupRPackage.RDRE__PRE_TMMS:
				if (resolve) return getPreTmms();
				return basicGetPreTmms();
			case LNGroupRPackage.RDRE__PST_TMMS:
				if (resolve) return getPstTmms();
				return basicGetPstTmms();
			case LNGroupRPackage.RDRE__MEM_FULL:
				if (resolve) return getMemFull();
				return basicGetMemFull();
			case LNGroupRPackage.RDRE__MAX_NUM_RCD:
				if (resolve) return getMaxNumRcd();
				return basicGetMaxNumRcd();
			case LNGroupRPackage.RDRE__RE_TRG_MOD:
				if (resolve) return getReTrgMod();
				return basicGetReTrgMod();
			case LNGroupRPackage.RDRE__PER_TRG_TMS:
				if (resolve) return getPerTrgTms();
				return basicGetPerTrgTms();
			case LNGroupRPackage.RDRE__EXCL_TMMS:
				if (resolve) return getExclTmms();
				return basicGetExclTmms();
			case LNGroupRPackage.RDRE__OP_MOD:
				if (resolve) return getOpMod();
				return basicGetOpMod();
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
			case LNGroupRPackage.RDRE__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupRPackage.RDRE__RCD_TRG:
				setRcdTrg((SPC)newValue);
				return;
			case LNGroupRPackage.RDRE__MEM_RS:
				setMemRs((SPC)newValue);
				return;
			case LNGroupRPackage.RDRE__MEM_CLR:
				setMemClr((SPC)newValue);
				return;
			case LNGroupRPackage.RDRE__RCD_MADE:
				setRcdMade((SPS)newValue);
				return;
			case LNGroupRPackage.RDRE__FLT_NUM:
				setFltNum((INS)newValue);
				return;
			case LNGroupRPackage.RDRE__GRI_FLT_NUM:
				setGriFltNum((INS)newValue);
				return;
			case LNGroupRPackage.RDRE__RCD_STR:
				setRcdStr((SPS)newValue);
				return;
			case LNGroupRPackage.RDRE__MEM_USED:
				setMemUsed((INS)newValue);
				return;
			case LNGroupRPackage.RDRE__TRG_MOD:
				setTrgMod((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__LEV_MOD:
				setLevMod((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__PRE_TMMS:
				setPreTmms((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__PST_TMMS:
				setPstTmms((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__MEM_FULL:
				setMemFull((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__MAX_NUM_RCD:
				setMaxNumRcd((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__RE_TRG_MOD:
				setReTrgMod((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__PER_TRG_TMS:
				setPerTrgTms((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__EXCL_TMMS:
				setExclTmms((ING)newValue);
				return;
			case LNGroupRPackage.RDRE__OP_MOD:
				setOpMod((ING)newValue);
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
			case LNGroupRPackage.RDRE__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupRPackage.RDRE__RCD_TRG:
				setRcdTrg((SPC)null);
				return;
			case LNGroupRPackage.RDRE__MEM_RS:
				setMemRs((SPC)null);
				return;
			case LNGroupRPackage.RDRE__MEM_CLR:
				setMemClr((SPC)null);
				return;
			case LNGroupRPackage.RDRE__RCD_MADE:
				setRcdMade((SPS)null);
				return;
			case LNGroupRPackage.RDRE__FLT_NUM:
				setFltNum((INS)null);
				return;
			case LNGroupRPackage.RDRE__GRI_FLT_NUM:
				setGriFltNum((INS)null);
				return;
			case LNGroupRPackage.RDRE__RCD_STR:
				setRcdStr((SPS)null);
				return;
			case LNGroupRPackage.RDRE__MEM_USED:
				setMemUsed((INS)null);
				return;
			case LNGroupRPackage.RDRE__TRG_MOD:
				setTrgMod((ING)null);
				return;
			case LNGroupRPackage.RDRE__LEV_MOD:
				setLevMod((ING)null);
				return;
			case LNGroupRPackage.RDRE__PRE_TMMS:
				setPreTmms((ING)null);
				return;
			case LNGroupRPackage.RDRE__PST_TMMS:
				setPstTmms((ING)null);
				return;
			case LNGroupRPackage.RDRE__MEM_FULL:
				setMemFull((ING)null);
				return;
			case LNGroupRPackage.RDRE__MAX_NUM_RCD:
				setMaxNumRcd((ING)null);
				return;
			case LNGroupRPackage.RDRE__RE_TRG_MOD:
				setReTrgMod((ING)null);
				return;
			case LNGroupRPackage.RDRE__PER_TRG_TMS:
				setPerTrgTms((ING)null);
				return;
			case LNGroupRPackage.RDRE__EXCL_TMMS:
				setExclTmms((ING)null);
				return;
			case LNGroupRPackage.RDRE__OP_MOD:
				setOpMod((ING)null);
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
			case LNGroupRPackage.RDRE__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupRPackage.RDRE__RCD_TRG:
				return rcdTrg != null;
			case LNGroupRPackage.RDRE__MEM_RS:
				return memRs != null;
			case LNGroupRPackage.RDRE__MEM_CLR:
				return memClr != null;
			case LNGroupRPackage.RDRE__RCD_MADE:
				return rcdMade != null;
			case LNGroupRPackage.RDRE__FLT_NUM:
				return fltNum != null;
			case LNGroupRPackage.RDRE__GRI_FLT_NUM:
				return griFltNum != null;
			case LNGroupRPackage.RDRE__RCD_STR:
				return rcdStr != null;
			case LNGroupRPackage.RDRE__MEM_USED:
				return memUsed != null;
			case LNGroupRPackage.RDRE__TRG_MOD:
				return trgMod != null;
			case LNGroupRPackage.RDRE__LEV_MOD:
				return levMod != null;
			case LNGroupRPackage.RDRE__PRE_TMMS:
				return preTmms != null;
			case LNGroupRPackage.RDRE__PST_TMMS:
				return pstTmms != null;
			case LNGroupRPackage.RDRE__MEM_FULL:
				return memFull != null;
			case LNGroupRPackage.RDRE__MAX_NUM_RCD:
				return maxNumRcd != null;
			case LNGroupRPackage.RDRE__RE_TRG_MOD:
				return reTrgMod != null;
			case LNGroupRPackage.RDRE__PER_TRG_TMS:
				return perTrgTms != null;
			case LNGroupRPackage.RDRE__EXCL_TMMS:
				return exclTmms != null;
			case LNGroupRPackage.RDRE__OP_MOD:
				return opMod != null;
		}
		return super.eIsSet(featureID);
	}

} //RDREImpl
