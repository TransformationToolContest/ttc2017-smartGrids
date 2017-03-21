/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ACD;
import substationStandard.Dataclasses.ACT;
import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.INC;
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.SPG;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import substationStandard.LNNodes.LNGroupR.RPSB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPSB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getBlkZn <em>Blk Zn</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getZeroEna <em>Zero Ena</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getNgEna <em>Ng Ena</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getMaxEna <em>Max Ena</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getSwgVal <em>Swg Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getSwgRis <em>Swg Ris</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getSwgReact <em>Swg React</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getSwgTmms <em>Swg Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getUnBlkTmms <em>Un Blk Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getMaxNumSlp <em>Max Num Slp</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupR.impl.RPSBImpl#getEvTmms <em>Ev Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPSBImpl extends GroupRImpl implements RPSB {
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
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected ACT op;

	/**
	 * The cached value of the '{@link #getBlkZn() <em>Blk Zn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkZn()
	 * @generated
	 * @ordered
	 */
	protected SPS blkZn;

	/**
	 * The cached value of the '{@link #getZeroEna() <em>Zero Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroEna()
	 * @generated
	 * @ordered
	 */
	protected SPG zeroEna;

	/**
	 * The cached value of the '{@link #getNgEna() <em>Ng Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNgEna()
	 * @generated
	 * @ordered
	 */
	protected SPG ngEna;

	/**
	 * The cached value of the '{@link #getMaxEna() <em>Max Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEna()
	 * @generated
	 * @ordered
	 */
	protected SPG maxEna;

	/**
	 * The cached value of the '{@link #getSwgVal() <em>Swg Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwgVal()
	 * @generated
	 * @ordered
	 */
	protected ASG swgVal;

	/**
	 * The cached value of the '{@link #getSwgRis() <em>Swg Ris</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwgRis()
	 * @generated
	 * @ordered
	 */
	protected ASG swgRis;

	/**
	 * The cached value of the '{@link #getSwgReact() <em>Swg React</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwgReact()
	 * @generated
	 * @ordered
	 */
	protected ASG swgReact;

	/**
	 * The cached value of the '{@link #getSwgTmms() <em>Swg Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwgTmms()
	 * @generated
	 * @ordered
	 */
	protected ING swgTmms;

	/**
	 * The cached value of the '{@link #getUnBlkTmms() <em>Un Blk Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnBlkTmms()
	 * @generated
	 * @ordered
	 */
	protected ING unBlkTmms;

	/**
	 * The cached value of the '{@link #getMaxNumSlp() <em>Max Num Slp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumSlp()
	 * @generated
	 * @ordered
	 */
	protected ING maxNumSlp;

	/**
	 * The cached value of the '{@link #getEvTmms() <em>Ev Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvTmms()
	 * @generated
	 * @ordered
	 */
	protected ING evTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPSBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RPSB;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__OP_CNT_RS, oldOpCntRs, opCntRs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__OP_CNT_RS, oldOpCntRs, opCntRs));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getBlkZn() {
		if (blkZn != null && blkZn.eIsProxy()) {
			InternalEObject oldBlkZn = (InternalEObject)blkZn;
			blkZn = (SPS)eResolveProxy(oldBlkZn);
			if (blkZn != oldBlkZn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__BLK_ZN, oldBlkZn, blkZn));
			}
		}
		return blkZn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetBlkZn() {
		return blkZn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkZn(SPS newBlkZn) {
		SPS oldBlkZn = blkZn;
		blkZn = newBlkZn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__BLK_ZN, oldBlkZn, blkZn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG getZeroEna() {
		if (zeroEna != null && zeroEna.eIsProxy()) {
			InternalEObject oldZeroEna = (InternalEObject)zeroEna;
			zeroEna = (SPG)eResolveProxy(oldZeroEna);
			if (zeroEna != oldZeroEna) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__ZERO_ENA, oldZeroEna, zeroEna));
			}
		}
		return zeroEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG basicGetZeroEna() {
		return zeroEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroEna(SPG newZeroEna) {
		SPG oldZeroEna = zeroEna;
		zeroEna = newZeroEna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__ZERO_ENA, oldZeroEna, zeroEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG getNgEna() {
		if (ngEna != null && ngEna.eIsProxy()) {
			InternalEObject oldNgEna = (InternalEObject)ngEna;
			ngEna = (SPG)eResolveProxy(oldNgEna);
			if (ngEna != oldNgEna) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__NG_ENA, oldNgEna, ngEna));
			}
		}
		return ngEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG basicGetNgEna() {
		return ngEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNgEna(SPG newNgEna) {
		SPG oldNgEna = ngEna;
		ngEna = newNgEna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__NG_ENA, oldNgEna, ngEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG getMaxEna() {
		if (maxEna != null && maxEna.eIsProxy()) {
			InternalEObject oldMaxEna = (InternalEObject)maxEna;
			maxEna = (SPG)eResolveProxy(oldMaxEna);
			if (maxEna != oldMaxEna) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__MAX_ENA, oldMaxEna, maxEna));
			}
		}
		return maxEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG basicGetMaxEna() {
		return maxEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEna(SPG newMaxEna) {
		SPG oldMaxEna = maxEna;
		maxEna = newMaxEna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__MAX_ENA, oldMaxEna, maxEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getSwgVal() {
		if (swgVal != null && swgVal.eIsProxy()) {
			InternalEObject oldSwgVal = (InternalEObject)swgVal;
			swgVal = (ASG)eResolveProxy(oldSwgVal);
			if (swgVal != oldSwgVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__SWG_VAL, oldSwgVal, swgVal));
			}
		}
		return swgVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetSwgVal() {
		return swgVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwgVal(ASG newSwgVal) {
		ASG oldSwgVal = swgVal;
		swgVal = newSwgVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__SWG_VAL, oldSwgVal, swgVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getSwgRis() {
		if (swgRis != null && swgRis.eIsProxy()) {
			InternalEObject oldSwgRis = (InternalEObject)swgRis;
			swgRis = (ASG)eResolveProxy(oldSwgRis);
			if (swgRis != oldSwgRis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__SWG_RIS, oldSwgRis, swgRis));
			}
		}
		return swgRis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetSwgRis() {
		return swgRis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwgRis(ASG newSwgRis) {
		ASG oldSwgRis = swgRis;
		swgRis = newSwgRis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__SWG_RIS, oldSwgRis, swgRis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getSwgReact() {
		if (swgReact != null && swgReact.eIsProxy()) {
			InternalEObject oldSwgReact = (InternalEObject)swgReact;
			swgReact = (ASG)eResolveProxy(oldSwgReact);
			if (swgReact != oldSwgReact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__SWG_REACT, oldSwgReact, swgReact));
			}
		}
		return swgReact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetSwgReact() {
		return swgReact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwgReact(ASG newSwgReact) {
		ASG oldSwgReact = swgReact;
		swgReact = newSwgReact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__SWG_REACT, oldSwgReact, swgReact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getSwgTmms() {
		if (swgTmms != null && swgTmms.eIsProxy()) {
			InternalEObject oldSwgTmms = (InternalEObject)swgTmms;
			swgTmms = (ING)eResolveProxy(oldSwgTmms);
			if (swgTmms != oldSwgTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__SWG_TMMS, oldSwgTmms, swgTmms));
			}
		}
		return swgTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetSwgTmms() {
		return swgTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwgTmms(ING newSwgTmms) {
		ING oldSwgTmms = swgTmms;
		swgTmms = newSwgTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__SWG_TMMS, oldSwgTmms, swgTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getUnBlkTmms() {
		if (unBlkTmms != null && unBlkTmms.eIsProxy()) {
			InternalEObject oldUnBlkTmms = (InternalEObject)unBlkTmms;
			unBlkTmms = (ING)eResolveProxy(oldUnBlkTmms);
			if (unBlkTmms != oldUnBlkTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__UN_BLK_TMMS, oldUnBlkTmms, unBlkTmms));
			}
		}
		return unBlkTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetUnBlkTmms() {
		return unBlkTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnBlkTmms(ING newUnBlkTmms) {
		ING oldUnBlkTmms = unBlkTmms;
		unBlkTmms = newUnBlkTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__UN_BLK_TMMS, oldUnBlkTmms, unBlkTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getMaxNumSlp() {
		if (maxNumSlp != null && maxNumSlp.eIsProxy()) {
			InternalEObject oldMaxNumSlp = (InternalEObject)maxNumSlp;
			maxNumSlp = (ING)eResolveProxy(oldMaxNumSlp);
			if (maxNumSlp != oldMaxNumSlp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__MAX_NUM_SLP, oldMaxNumSlp, maxNumSlp));
			}
		}
		return maxNumSlp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetMaxNumSlp() {
		return maxNumSlp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumSlp(ING newMaxNumSlp) {
		ING oldMaxNumSlp = maxNumSlp;
		maxNumSlp = newMaxNumSlp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__MAX_NUM_SLP, oldMaxNumSlp, maxNumSlp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getEvTmms() {
		if (evTmms != null && evTmms.eIsProxy()) {
			InternalEObject oldEvTmms = (InternalEObject)evTmms;
			evTmms = (ING)eResolveProxy(oldEvTmms);
			if (evTmms != oldEvTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RPSB__EV_TMMS, oldEvTmms, evTmms));
			}
		}
		return evTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetEvTmms() {
		return evTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvTmms(ING newEvTmms) {
		ING oldEvTmms = evTmms;
		evTmms = newEvTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RPSB__EV_TMMS, oldEvTmms, evTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RPSB__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupRPackage.RPSB__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupRPackage.RPSB__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupRPackage.RPSB__BLK_ZN:
				if (resolve) return getBlkZn();
				return basicGetBlkZn();
			case LNGroupRPackage.RPSB__ZERO_ENA:
				if (resolve) return getZeroEna();
				return basicGetZeroEna();
			case LNGroupRPackage.RPSB__NG_ENA:
				if (resolve) return getNgEna();
				return basicGetNgEna();
			case LNGroupRPackage.RPSB__MAX_ENA:
				if (resolve) return getMaxEna();
				return basicGetMaxEna();
			case LNGroupRPackage.RPSB__SWG_VAL:
				if (resolve) return getSwgVal();
				return basicGetSwgVal();
			case LNGroupRPackage.RPSB__SWG_RIS:
				if (resolve) return getSwgRis();
				return basicGetSwgRis();
			case LNGroupRPackage.RPSB__SWG_REACT:
				if (resolve) return getSwgReact();
				return basicGetSwgReact();
			case LNGroupRPackage.RPSB__SWG_TMMS:
				if (resolve) return getSwgTmms();
				return basicGetSwgTmms();
			case LNGroupRPackage.RPSB__UN_BLK_TMMS:
				if (resolve) return getUnBlkTmms();
				return basicGetUnBlkTmms();
			case LNGroupRPackage.RPSB__MAX_NUM_SLP:
				if (resolve) return getMaxNumSlp();
				return basicGetMaxNumSlp();
			case LNGroupRPackage.RPSB__EV_TMMS:
				if (resolve) return getEvTmms();
				return basicGetEvTmms();
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
			case LNGroupRPackage.RPSB__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupRPackage.RPSB__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupRPackage.RPSB__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupRPackage.RPSB__BLK_ZN:
				setBlkZn((SPS)newValue);
				return;
			case LNGroupRPackage.RPSB__ZERO_ENA:
				setZeroEna((SPG)newValue);
				return;
			case LNGroupRPackage.RPSB__NG_ENA:
				setNgEna((SPG)newValue);
				return;
			case LNGroupRPackage.RPSB__MAX_ENA:
				setMaxEna((SPG)newValue);
				return;
			case LNGroupRPackage.RPSB__SWG_VAL:
				setSwgVal((ASG)newValue);
				return;
			case LNGroupRPackage.RPSB__SWG_RIS:
				setSwgRis((ASG)newValue);
				return;
			case LNGroupRPackage.RPSB__SWG_REACT:
				setSwgReact((ASG)newValue);
				return;
			case LNGroupRPackage.RPSB__SWG_TMMS:
				setSwgTmms((ING)newValue);
				return;
			case LNGroupRPackage.RPSB__UN_BLK_TMMS:
				setUnBlkTmms((ING)newValue);
				return;
			case LNGroupRPackage.RPSB__MAX_NUM_SLP:
				setMaxNumSlp((ING)newValue);
				return;
			case LNGroupRPackage.RPSB__EV_TMMS:
				setEvTmms((ING)newValue);
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
			case LNGroupRPackage.RPSB__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupRPackage.RPSB__STR:
				setStr((ACD)null);
				return;
			case LNGroupRPackage.RPSB__OP:
				setOp((ACT)null);
				return;
			case LNGroupRPackage.RPSB__BLK_ZN:
				setBlkZn((SPS)null);
				return;
			case LNGroupRPackage.RPSB__ZERO_ENA:
				setZeroEna((SPG)null);
				return;
			case LNGroupRPackage.RPSB__NG_ENA:
				setNgEna((SPG)null);
				return;
			case LNGroupRPackage.RPSB__MAX_ENA:
				setMaxEna((SPG)null);
				return;
			case LNGroupRPackage.RPSB__SWG_VAL:
				setSwgVal((ASG)null);
				return;
			case LNGroupRPackage.RPSB__SWG_RIS:
				setSwgRis((ASG)null);
				return;
			case LNGroupRPackage.RPSB__SWG_REACT:
				setSwgReact((ASG)null);
				return;
			case LNGroupRPackage.RPSB__SWG_TMMS:
				setSwgTmms((ING)null);
				return;
			case LNGroupRPackage.RPSB__UN_BLK_TMMS:
				setUnBlkTmms((ING)null);
				return;
			case LNGroupRPackage.RPSB__MAX_NUM_SLP:
				setMaxNumSlp((ING)null);
				return;
			case LNGroupRPackage.RPSB__EV_TMMS:
				setEvTmms((ING)null);
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
			case LNGroupRPackage.RPSB__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupRPackage.RPSB__STR:
				return str != null;
			case LNGroupRPackage.RPSB__OP:
				return op != null;
			case LNGroupRPackage.RPSB__BLK_ZN:
				return blkZn != null;
			case LNGroupRPackage.RPSB__ZERO_ENA:
				return zeroEna != null;
			case LNGroupRPackage.RPSB__NG_ENA:
				return ngEna != null;
			case LNGroupRPackage.RPSB__MAX_ENA:
				return maxEna != null;
			case LNGroupRPackage.RPSB__SWG_VAL:
				return swgVal != null;
			case LNGroupRPackage.RPSB__SWG_RIS:
				return swgRis != null;
			case LNGroupRPackage.RPSB__SWG_REACT:
				return swgReact != null;
			case LNGroupRPackage.RPSB__SWG_TMMS:
				return swgTmms != null;
			case LNGroupRPackage.RPSB__UN_BLK_TMMS:
				return unBlkTmms != null;
			case LNGroupRPackage.RPSB__MAX_NUM_SLP:
				return maxNumSlp != null;
			case LNGroupRPackage.RPSB__EV_TMMS:
				return evTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //RPSBImpl
