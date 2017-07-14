/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP.impl;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.CSD;
import gluemodel.substationStandard.Dataclasses.CURVE;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.MV;

import gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import gluemodel.substationStandard.LNNodes.LNGroupP.PTTR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTTR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getAmp <em>Amp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getTmp <em>Tmp</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getTmpRl <em>Tmp Rl</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getLodRsvAlm <em>Lod Rsv Alm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getLodRsvTr <em>Lod Rsv Tr</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getAgeRat <em>Age Rat</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getAlmThm <em>Alm Thm</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getTmTmpSt <em>Tm Tmp St</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getTmASt <em>Tm ASt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getTmTmpCrv <em>Tm Tmp Crv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getTmACrv <em>Tm ACrv</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getTmpMax <em>Tmp Max</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getMinOpTmms <em>Min Op Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getMaxOpTmms <em>Max Op Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getConsTms <em>Cons Tms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl#getAlmVal <em>Alm Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTTRImpl extends GroupPImpl implements PTTR {
	/**
	 * The cached value of the '{@link #getAmp() <em>Amp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmp()
	 * @generated
	 * @ordered
	 */
	protected MV amp;

	/**
	 * The cached value of the '{@link #getTmp() <em>Tmp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmp()
	 * @generated
	 * @ordered
	 */
	protected MV tmp;

	/**
	 * The cached value of the '{@link #getTmpRl() <em>Tmp Rl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmpRl()
	 * @generated
	 * @ordered
	 */
	protected MV tmpRl;

	/**
	 * The cached value of the '{@link #getLodRsvAlm() <em>Lod Rsv Alm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLodRsvAlm()
	 * @generated
	 * @ordered
	 */
	protected MV lodRsvAlm;

	/**
	 * The cached value of the '{@link #getLodRsvTr() <em>Lod Rsv Tr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLodRsvTr()
	 * @generated
	 * @ordered
	 */
	protected MV lodRsvTr;

	/**
	 * The cached value of the '{@link #getAgeRat() <em>Age Rat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeRat()
	 * @generated
	 * @ordered
	 */
	protected MV ageRat;

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
	 * The cached value of the '{@link #getAlmThm() <em>Alm Thm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlmThm()
	 * @generated
	 * @ordered
	 */
	protected ACT almThm;

	/**
	 * The cached value of the '{@link #getTmTmpSt() <em>Tm Tmp St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmTmpSt()
	 * @generated
	 * @ordered
	 */
	protected CSD tmTmpSt;

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
	 * The cached value of the '{@link #getTmTmpCrv() <em>Tm Tmp Crv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmTmpCrv()
	 * @generated
	 * @ordered
	 */
	protected CURVE tmTmpCrv;

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
	 * The cached value of the '{@link #getTmpMax() <em>Tmp Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmpMax()
	 * @generated
	 * @ordered
	 */
	protected ASG tmpMax;

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
	 * The cached value of the '{@link #getRsDlTmms() <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING rsDlTmms;

	/**
	 * The cached value of the '{@link #getConsTms() <em>Cons Tms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsTms()
	 * @generated
	 * @ordered
	 */
	protected ING consTms;

	/**
	 * The cached value of the '{@link #getAlmVal() <em>Alm Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlmVal()
	 * @generated
	 * @ordered
	 */
	protected ASG almVal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTTRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PTTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAmp() {
		if (amp != null && amp.eIsProxy()) {
			InternalEObject oldAmp = (InternalEObject)amp;
			amp = (MV)eResolveProxy(oldAmp);
			if (amp != oldAmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__AMP, oldAmp, amp));
			}
		}
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAmp() {
		return amp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmp(MV newAmp) {
		MV oldAmp = amp;
		amp = newAmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__AMP, oldAmp, amp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTmp() {
		if (tmp != null && tmp.eIsProxy()) {
			InternalEObject oldTmp = (InternalEObject)tmp;
			tmp = (MV)eResolveProxy(oldTmp);
			if (tmp != oldTmp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__TMP, oldTmp, tmp));
			}
		}
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTmp() {
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmp(MV newTmp) {
		MV oldTmp = tmp;
		tmp = newTmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__TMP, oldTmp, tmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTmpRl() {
		if (tmpRl != null && tmpRl.eIsProxy()) {
			InternalEObject oldTmpRl = (InternalEObject)tmpRl;
			tmpRl = (MV)eResolveProxy(oldTmpRl);
			if (tmpRl != oldTmpRl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__TMP_RL, oldTmpRl, tmpRl));
			}
		}
		return tmpRl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTmpRl() {
		return tmpRl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmpRl(MV newTmpRl) {
		MV oldTmpRl = tmpRl;
		tmpRl = newTmpRl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__TMP_RL, oldTmpRl, tmpRl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getLodRsvAlm() {
		if (lodRsvAlm != null && lodRsvAlm.eIsProxy()) {
			InternalEObject oldLodRsvAlm = (InternalEObject)lodRsvAlm;
			lodRsvAlm = (MV)eResolveProxy(oldLodRsvAlm);
			if (lodRsvAlm != oldLodRsvAlm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__LOD_RSV_ALM, oldLodRsvAlm, lodRsvAlm));
			}
		}
		return lodRsvAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetLodRsvAlm() {
		return lodRsvAlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLodRsvAlm(MV newLodRsvAlm) {
		MV oldLodRsvAlm = lodRsvAlm;
		lodRsvAlm = newLodRsvAlm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__LOD_RSV_ALM, oldLodRsvAlm, lodRsvAlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getLodRsvTr() {
		if (lodRsvTr != null && lodRsvTr.eIsProxy()) {
			InternalEObject oldLodRsvTr = (InternalEObject)lodRsvTr;
			lodRsvTr = (MV)eResolveProxy(oldLodRsvTr);
			if (lodRsvTr != oldLodRsvTr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__LOD_RSV_TR, oldLodRsvTr, lodRsvTr));
			}
		}
		return lodRsvTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetLodRsvTr() {
		return lodRsvTr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLodRsvTr(MV newLodRsvTr) {
		MV oldLodRsvTr = lodRsvTr;
		lodRsvTr = newLodRsvTr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__LOD_RSV_TR, oldLodRsvTr, lodRsvTr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getAgeRat() {
		if (ageRat != null && ageRat.eIsProxy()) {
			InternalEObject oldAgeRat = (InternalEObject)ageRat;
			ageRat = (MV)eResolveProxy(oldAgeRat);
			if (ageRat != oldAgeRat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__AGE_RAT, oldAgeRat, ageRat));
			}
		}
		return ageRat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetAgeRat() {
		return ageRat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeRat(MV newAgeRat) {
		MV oldAgeRat = ageRat;
		ageRat = newAgeRat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__AGE_RAT, oldAgeRat, ageRat));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getAlmThm() {
		if (almThm != null && almThm.eIsProxy()) {
			InternalEObject oldAlmThm = (InternalEObject)almThm;
			almThm = (ACT)eResolveProxy(oldAlmThm);
			if (almThm != oldAlmThm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__ALM_THM, oldAlmThm, almThm));
			}
		}
		return almThm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetAlmThm() {
		return almThm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlmThm(ACT newAlmThm) {
		ACT oldAlmThm = almThm;
		almThm = newAlmThm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__ALM_THM, oldAlmThm, almThm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD getTmTmpSt() {
		if (tmTmpSt != null && tmTmpSt.eIsProxy()) {
			InternalEObject oldTmTmpSt = (InternalEObject)tmTmpSt;
			tmTmpSt = (CSD)eResolveProxy(oldTmTmpSt);
			if (tmTmpSt != oldTmTmpSt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__TM_TMP_ST, oldTmTmpSt, tmTmpSt));
			}
		}
		return tmTmpSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD basicGetTmTmpSt() {
		return tmTmpSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmTmpSt(CSD newTmTmpSt) {
		CSD oldTmTmpSt = tmTmpSt;
		tmTmpSt = newTmTmpSt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__TM_TMP_ST, oldTmTmpSt, tmTmpSt));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__TM_AST, oldTmASt, tmASt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__TM_AST, oldTmASt, tmASt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE getTmTmpCrv() {
		if (tmTmpCrv != null && tmTmpCrv.eIsProxy()) {
			InternalEObject oldTmTmpCrv = (InternalEObject)tmTmpCrv;
			tmTmpCrv = (CURVE)eResolveProxy(oldTmTmpCrv);
			if (tmTmpCrv != oldTmTmpCrv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__TM_TMP_CRV, oldTmTmpCrv, tmTmpCrv));
			}
		}
		return tmTmpCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE basicGetTmTmpCrv() {
		return tmTmpCrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmTmpCrv(CURVE newTmTmpCrv) {
		CURVE oldTmTmpCrv = tmTmpCrv;
		tmTmpCrv = newTmTmpCrv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__TM_TMP_CRV, oldTmTmpCrv, tmTmpCrv));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__TM_ACRV, oldTmACrv, tmACrv));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__TM_ACRV, oldTmACrv, tmACrv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getTmpMax() {
		if (tmpMax != null && tmpMax.eIsProxy()) {
			InternalEObject oldTmpMax = (InternalEObject)tmpMax;
			tmpMax = (ASG)eResolveProxy(oldTmpMax);
			if (tmpMax != oldTmpMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__TMP_MAX, oldTmpMax, tmpMax));
			}
		}
		return tmpMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetTmpMax() {
		return tmpMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmpMax(ASG newTmpMax) {
		ASG oldTmpMax = tmpMax;
		tmpMax = newTmpMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__TMP_MAX, oldTmpMax, tmpMax));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__STR_VAL, oldStrVal, strVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__STR_VAL, oldStrVal, strVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__MIN_OP_TMMS, oldMinOpTmms, minOpTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__MAX_OP_TMMS, oldMaxOpTmms, maxOpTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getConsTms() {
		if (consTms != null && consTms.eIsProxy()) {
			InternalEObject oldConsTms = (InternalEObject)consTms;
			consTms = (ING)eResolveProxy(oldConsTms);
			if (consTms != oldConsTms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__CONS_TMS, oldConsTms, consTms));
			}
		}
		return consTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetConsTms() {
		return consTms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsTms(ING newConsTms) {
		ING oldConsTms = consTms;
		consTms = newConsTms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__CONS_TMS, oldConsTms, consTms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getAlmVal() {
		if (almVal != null && almVal.eIsProxy()) {
			InternalEObject oldAlmVal = (InternalEObject)almVal;
			almVal = (ASG)eResolveProxy(oldAlmVal);
			if (almVal != oldAlmVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTTR__ALM_VAL, oldAlmVal, almVal));
			}
		}
		return almVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetAlmVal() {
		return almVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlmVal(ASG newAlmVal) {
		ASG oldAlmVal = almVal;
		almVal = newAlmVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTTR__ALM_VAL, oldAlmVal, almVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PTTR__AMP:
				if (resolve) return getAmp();
				return basicGetAmp();
			case LNGroupPPackage.PTTR__TMP:
				if (resolve) return getTmp();
				return basicGetTmp();
			case LNGroupPPackage.PTTR__TMP_RL:
				if (resolve) return getTmpRl();
				return basicGetTmpRl();
			case LNGroupPPackage.PTTR__LOD_RSV_ALM:
				if (resolve) return getLodRsvAlm();
				return basicGetLodRsvAlm();
			case LNGroupPPackage.PTTR__LOD_RSV_TR:
				if (resolve) return getLodRsvTr();
				return basicGetLodRsvTr();
			case LNGroupPPackage.PTTR__AGE_RAT:
				if (resolve) return getAgeRat();
				return basicGetAgeRat();
			case LNGroupPPackage.PTTR__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PTTR__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PTTR__ALM_THM:
				if (resolve) return getAlmThm();
				return basicGetAlmThm();
			case LNGroupPPackage.PTTR__TM_TMP_ST:
				if (resolve) return getTmTmpSt();
				return basicGetTmTmpSt();
			case LNGroupPPackage.PTTR__TM_AST:
				if (resolve) return getTmASt();
				return basicGetTmASt();
			case LNGroupPPackage.PTTR__TM_TMP_CRV:
				if (resolve) return getTmTmpCrv();
				return basicGetTmTmpCrv();
			case LNGroupPPackage.PTTR__TM_ACRV:
				if (resolve) return getTmACrv();
				return basicGetTmACrv();
			case LNGroupPPackage.PTTR__TMP_MAX:
				if (resolve) return getTmpMax();
				return basicGetTmpMax();
			case LNGroupPPackage.PTTR__STR_VAL:
				if (resolve) return getStrVal();
				return basicGetStrVal();
			case LNGroupPPackage.PTTR__OP_DL_TMMS:
				if (resolve) return getOpDlTmms();
				return basicGetOpDlTmms();
			case LNGroupPPackage.PTTR__MIN_OP_TMMS:
				if (resolve) return getMinOpTmms();
				return basicGetMinOpTmms();
			case LNGroupPPackage.PTTR__MAX_OP_TMMS:
				if (resolve) return getMaxOpTmms();
				return basicGetMaxOpTmms();
			case LNGroupPPackage.PTTR__RS_DL_TMMS:
				if (resolve) return getRsDlTmms();
				return basicGetRsDlTmms();
			case LNGroupPPackage.PTTR__CONS_TMS:
				if (resolve) return getConsTms();
				return basicGetConsTms();
			case LNGroupPPackage.PTTR__ALM_VAL:
				if (resolve) return getAlmVal();
				return basicGetAlmVal();
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
			case LNGroupPPackage.PTTR__AMP:
				setAmp((MV)newValue);
				return;
			case LNGroupPPackage.PTTR__TMP:
				setTmp((MV)newValue);
				return;
			case LNGroupPPackage.PTTR__TMP_RL:
				setTmpRl((MV)newValue);
				return;
			case LNGroupPPackage.PTTR__LOD_RSV_ALM:
				setLodRsvAlm((MV)newValue);
				return;
			case LNGroupPPackage.PTTR__LOD_RSV_TR:
				setLodRsvTr((MV)newValue);
				return;
			case LNGroupPPackage.PTTR__AGE_RAT:
				setAgeRat((MV)newValue);
				return;
			case LNGroupPPackage.PTTR__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PTTR__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PTTR__ALM_THM:
				setAlmThm((ACT)newValue);
				return;
			case LNGroupPPackage.PTTR__TM_TMP_ST:
				setTmTmpSt((CSD)newValue);
				return;
			case LNGroupPPackage.PTTR__TM_AST:
				setTmASt((CSD)newValue);
				return;
			case LNGroupPPackage.PTTR__TM_TMP_CRV:
				setTmTmpCrv((CURVE)newValue);
				return;
			case LNGroupPPackage.PTTR__TM_ACRV:
				setTmACrv((CURVE)newValue);
				return;
			case LNGroupPPackage.PTTR__TMP_MAX:
				setTmpMax((ASG)newValue);
				return;
			case LNGroupPPackage.PTTR__STR_VAL:
				setStrVal((ASG)newValue);
				return;
			case LNGroupPPackage.PTTR__OP_DL_TMMS:
				setOpDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PTTR__MIN_OP_TMMS:
				setMinOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PTTR__MAX_OP_TMMS:
				setMaxOpTmms((ING)newValue);
				return;
			case LNGroupPPackage.PTTR__RS_DL_TMMS:
				setRsDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PTTR__CONS_TMS:
				setConsTms((ING)newValue);
				return;
			case LNGroupPPackage.PTTR__ALM_VAL:
				setAlmVal((ASG)newValue);
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
			case LNGroupPPackage.PTTR__AMP:
				setAmp((MV)null);
				return;
			case LNGroupPPackage.PTTR__TMP:
				setTmp((MV)null);
				return;
			case LNGroupPPackage.PTTR__TMP_RL:
				setTmpRl((MV)null);
				return;
			case LNGroupPPackage.PTTR__LOD_RSV_ALM:
				setLodRsvAlm((MV)null);
				return;
			case LNGroupPPackage.PTTR__LOD_RSV_TR:
				setLodRsvTr((MV)null);
				return;
			case LNGroupPPackage.PTTR__AGE_RAT:
				setAgeRat((MV)null);
				return;
			case LNGroupPPackage.PTTR__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PTTR__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PTTR__ALM_THM:
				setAlmThm((ACT)null);
				return;
			case LNGroupPPackage.PTTR__TM_TMP_ST:
				setTmTmpSt((CSD)null);
				return;
			case LNGroupPPackage.PTTR__TM_AST:
				setTmASt((CSD)null);
				return;
			case LNGroupPPackage.PTTR__TM_TMP_CRV:
				setTmTmpCrv((CURVE)null);
				return;
			case LNGroupPPackage.PTTR__TM_ACRV:
				setTmACrv((CURVE)null);
				return;
			case LNGroupPPackage.PTTR__TMP_MAX:
				setTmpMax((ASG)null);
				return;
			case LNGroupPPackage.PTTR__STR_VAL:
				setStrVal((ASG)null);
				return;
			case LNGroupPPackage.PTTR__OP_DL_TMMS:
				setOpDlTmms((ING)null);
				return;
			case LNGroupPPackage.PTTR__MIN_OP_TMMS:
				setMinOpTmms((ING)null);
				return;
			case LNGroupPPackage.PTTR__MAX_OP_TMMS:
				setMaxOpTmms((ING)null);
				return;
			case LNGroupPPackage.PTTR__RS_DL_TMMS:
				setRsDlTmms((ING)null);
				return;
			case LNGroupPPackage.PTTR__CONS_TMS:
				setConsTms((ING)null);
				return;
			case LNGroupPPackage.PTTR__ALM_VAL:
				setAlmVal((ASG)null);
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
			case LNGroupPPackage.PTTR__AMP:
				return amp != null;
			case LNGroupPPackage.PTTR__TMP:
				return tmp != null;
			case LNGroupPPackage.PTTR__TMP_RL:
				return tmpRl != null;
			case LNGroupPPackage.PTTR__LOD_RSV_ALM:
				return lodRsvAlm != null;
			case LNGroupPPackage.PTTR__LOD_RSV_TR:
				return lodRsvTr != null;
			case LNGroupPPackage.PTTR__AGE_RAT:
				return ageRat != null;
			case LNGroupPPackage.PTTR__STR:
				return str != null;
			case LNGroupPPackage.PTTR__OP:
				return op != null;
			case LNGroupPPackage.PTTR__ALM_THM:
				return almThm != null;
			case LNGroupPPackage.PTTR__TM_TMP_ST:
				return tmTmpSt != null;
			case LNGroupPPackage.PTTR__TM_AST:
				return tmASt != null;
			case LNGroupPPackage.PTTR__TM_TMP_CRV:
				return tmTmpCrv != null;
			case LNGroupPPackage.PTTR__TM_ACRV:
				return tmACrv != null;
			case LNGroupPPackage.PTTR__TMP_MAX:
				return tmpMax != null;
			case LNGroupPPackage.PTTR__STR_VAL:
				return strVal != null;
			case LNGroupPPackage.PTTR__OP_DL_TMMS:
				return opDlTmms != null;
			case LNGroupPPackage.PTTR__MIN_OP_TMMS:
				return minOpTmms != null;
			case LNGroupPPackage.PTTR__MAX_OP_TMMS:
				return maxOpTmms != null;
			case LNGroupPPackage.PTTR__RS_DL_TMMS:
				return rsDlTmms != null;
			case LNGroupPPackage.PTTR__CONS_TMS:
				return consTms != null;
			case LNGroupPPackage.PTTR__ALM_VAL:
				return almVal != null;
		}
		return super.eIsSet(featureID);
	}

} //PTTRImpl
