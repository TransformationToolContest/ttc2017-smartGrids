/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR.impl;

import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.SPC;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRPackage;
import gluemodel.substationStandard.LNNodes.LNGroupR.RREC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RREC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getOpCntRs <em>Op Cnt Rs</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getBlkRec <em>Blk Rec</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getChkRec <em>Chk Rec</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getAuto <em>Auto</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getAutoRecSt <em>Auto Rec St</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getRec1Tmms <em>Rec1 Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getRec2Tmms <em>Rec2 Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getRec3Tmms <em>Rec3 Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getPlsTmms <em>Pls Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl#getRclTmms <em>Rcl Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RRECImpl extends GroupRImpl implements RREC {
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
	 * The cached value of the '{@link #getBlkRec() <em>Blk Rec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkRec()
	 * @generated
	 * @ordered
	 */
	protected SPC blkRec;

	/**
	 * The cached value of the '{@link #getChkRec() <em>Chk Rec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChkRec()
	 * @generated
	 * @ordered
	 */
	protected SPC chkRec;

	/**
	 * The cached value of the '{@link #getAuto() <em>Auto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuto()
	 * @generated
	 * @ordered
	 */
	protected SPS auto;

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
	 * The cached value of the '{@link #getAutoRecSt() <em>Auto Rec St</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoRecSt()
	 * @generated
	 * @ordered
	 */
	protected INS autoRecSt;

	/**
	 * The cached value of the '{@link #getRec1Tmms() <em>Rec1 Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRec1Tmms()
	 * @generated
	 * @ordered
	 */
	protected ING rec1Tmms;

	/**
	 * The cached value of the '{@link #getRec2Tmms() <em>Rec2 Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRec2Tmms()
	 * @generated
	 * @ordered
	 */
	protected ING rec2Tmms;

	/**
	 * The cached value of the '{@link #getRec3Tmms() <em>Rec3 Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRec3Tmms()
	 * @generated
	 * @ordered
	 */
	protected ING rec3Tmms;

	/**
	 * The cached value of the '{@link #getPlsTmms() <em>Pls Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlsTmms()
	 * @generated
	 * @ordered
	 */
	protected ING plsTmms;

	/**
	 * The cached value of the '{@link #getRclTmms() <em>Rcl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRclTmms()
	 * @generated
	 * @ordered
	 */
	protected ING rclTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RRECImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupRPackage.Literals.RREC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__OP_CNT_RS, oldOpCntRs, opCntRs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__OP_CNT_RS, oldOpCntRs, opCntRs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getBlkRec() {
		if (blkRec != null && blkRec.eIsProxy()) {
			InternalEObject oldBlkRec = (InternalEObject)blkRec;
			blkRec = (SPC)eResolveProxy(oldBlkRec);
			if (blkRec != oldBlkRec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__BLK_REC, oldBlkRec, blkRec));
			}
		}
		return blkRec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetBlkRec() {
		return blkRec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkRec(SPC newBlkRec) {
		SPC oldBlkRec = blkRec;
		blkRec = newBlkRec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__BLK_REC, oldBlkRec, blkRec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getChkRec() {
		if (chkRec != null && chkRec.eIsProxy()) {
			InternalEObject oldChkRec = (InternalEObject)chkRec;
			chkRec = (SPC)eResolveProxy(oldChkRec);
			if (chkRec != oldChkRec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__CHK_REC, oldChkRec, chkRec));
			}
		}
		return chkRec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetChkRec() {
		return chkRec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChkRec(SPC newChkRec) {
		SPC oldChkRec = chkRec;
		chkRec = newChkRec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__CHK_REC, oldChkRec, chkRec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getAuto() {
		if (auto != null && auto.eIsProxy()) {
			InternalEObject oldAuto = (InternalEObject)auto;
			auto = (SPS)eResolveProxy(oldAuto);
			if (auto != oldAuto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__AUTO, oldAuto, auto));
			}
		}
		return auto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetAuto() {
		return auto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuto(SPS newAuto) {
		SPS oldAuto = auto;
		auto = newAuto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__AUTO, oldAuto, auto));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getAutoRecSt() {
		if (autoRecSt != null && autoRecSt.eIsProxy()) {
			InternalEObject oldAutoRecSt = (InternalEObject)autoRecSt;
			autoRecSt = (INS)eResolveProxy(oldAutoRecSt);
			if (autoRecSt != oldAutoRecSt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__AUTO_REC_ST, oldAutoRecSt, autoRecSt));
			}
		}
		return autoRecSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetAutoRecSt() {
		return autoRecSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoRecSt(INS newAutoRecSt) {
		INS oldAutoRecSt = autoRecSt;
		autoRecSt = newAutoRecSt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__AUTO_REC_ST, oldAutoRecSt, autoRecSt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRec1Tmms() {
		if (rec1Tmms != null && rec1Tmms.eIsProxy()) {
			InternalEObject oldRec1Tmms = (InternalEObject)rec1Tmms;
			rec1Tmms = (ING)eResolveProxy(oldRec1Tmms);
			if (rec1Tmms != oldRec1Tmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__REC1_TMMS, oldRec1Tmms, rec1Tmms));
			}
		}
		return rec1Tmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRec1Tmms() {
		return rec1Tmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRec1Tmms(ING newRec1Tmms) {
		ING oldRec1Tmms = rec1Tmms;
		rec1Tmms = newRec1Tmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__REC1_TMMS, oldRec1Tmms, rec1Tmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRec2Tmms() {
		if (rec2Tmms != null && rec2Tmms.eIsProxy()) {
			InternalEObject oldRec2Tmms = (InternalEObject)rec2Tmms;
			rec2Tmms = (ING)eResolveProxy(oldRec2Tmms);
			if (rec2Tmms != oldRec2Tmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__REC2_TMMS, oldRec2Tmms, rec2Tmms));
			}
		}
		return rec2Tmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRec2Tmms() {
		return rec2Tmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRec2Tmms(ING newRec2Tmms) {
		ING oldRec2Tmms = rec2Tmms;
		rec2Tmms = newRec2Tmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__REC2_TMMS, oldRec2Tmms, rec2Tmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRec3Tmms() {
		if (rec3Tmms != null && rec3Tmms.eIsProxy()) {
			InternalEObject oldRec3Tmms = (InternalEObject)rec3Tmms;
			rec3Tmms = (ING)eResolveProxy(oldRec3Tmms);
			if (rec3Tmms != oldRec3Tmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__REC3_TMMS, oldRec3Tmms, rec3Tmms));
			}
		}
		return rec3Tmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRec3Tmms() {
		return rec3Tmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRec3Tmms(ING newRec3Tmms) {
		ING oldRec3Tmms = rec3Tmms;
		rec3Tmms = newRec3Tmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__REC3_TMMS, oldRec3Tmms, rec3Tmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getPlsTmms() {
		if (plsTmms != null && plsTmms.eIsProxy()) {
			InternalEObject oldPlsTmms = (InternalEObject)plsTmms;
			plsTmms = (ING)eResolveProxy(oldPlsTmms);
			if (plsTmms != oldPlsTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__PLS_TMMS, oldPlsTmms, plsTmms));
			}
		}
		return plsTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetPlsTmms() {
		return plsTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlsTmms(ING newPlsTmms) {
		ING oldPlsTmms = plsTmms;
		plsTmms = newPlsTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__PLS_TMMS, oldPlsTmms, plsTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getRclTmms() {
		if (rclTmms != null && rclTmms.eIsProxy()) {
			InternalEObject oldRclTmms = (InternalEObject)rclTmms;
			rclTmms = (ING)eResolveProxy(oldRclTmms);
			if (rclTmms != oldRclTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupRPackage.RREC__RCL_TMMS, oldRclTmms, rclTmms));
			}
		}
		return rclTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetRclTmms() {
		return rclTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRclTmms(ING newRclTmms) {
		ING oldRclTmms = rclTmms;
		rclTmms = newRclTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupRPackage.RREC__RCL_TMMS, oldRclTmms, rclTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupRPackage.RREC__OP_CNT_RS:
				if (resolve) return getOpCntRs();
				return basicGetOpCntRs();
			case LNGroupRPackage.RREC__BLK_REC:
				if (resolve) return getBlkRec();
				return basicGetBlkRec();
			case LNGroupRPackage.RREC__CHK_REC:
				if (resolve) return getChkRec();
				return basicGetChkRec();
			case LNGroupRPackage.RREC__AUTO:
				if (resolve) return getAuto();
				return basicGetAuto();
			case LNGroupRPackage.RREC__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupRPackage.RREC__AUTO_REC_ST:
				if (resolve) return getAutoRecSt();
				return basicGetAutoRecSt();
			case LNGroupRPackage.RREC__REC1_TMMS:
				if (resolve) return getRec1Tmms();
				return basicGetRec1Tmms();
			case LNGroupRPackage.RREC__REC2_TMMS:
				if (resolve) return getRec2Tmms();
				return basicGetRec2Tmms();
			case LNGroupRPackage.RREC__REC3_TMMS:
				if (resolve) return getRec3Tmms();
				return basicGetRec3Tmms();
			case LNGroupRPackage.RREC__PLS_TMMS:
				if (resolve) return getPlsTmms();
				return basicGetPlsTmms();
			case LNGroupRPackage.RREC__RCL_TMMS:
				if (resolve) return getRclTmms();
				return basicGetRclTmms();
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
			case LNGroupRPackage.RREC__OP_CNT_RS:
				setOpCntRs((INC)newValue);
				return;
			case LNGroupRPackage.RREC__BLK_REC:
				setBlkRec((SPC)newValue);
				return;
			case LNGroupRPackage.RREC__CHK_REC:
				setChkRec((SPC)newValue);
				return;
			case LNGroupRPackage.RREC__AUTO:
				setAuto((SPS)newValue);
				return;
			case LNGroupRPackage.RREC__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupRPackage.RREC__AUTO_REC_ST:
				setAutoRecSt((INS)newValue);
				return;
			case LNGroupRPackage.RREC__REC1_TMMS:
				setRec1Tmms((ING)newValue);
				return;
			case LNGroupRPackage.RREC__REC2_TMMS:
				setRec2Tmms((ING)newValue);
				return;
			case LNGroupRPackage.RREC__REC3_TMMS:
				setRec3Tmms((ING)newValue);
				return;
			case LNGroupRPackage.RREC__PLS_TMMS:
				setPlsTmms((ING)newValue);
				return;
			case LNGroupRPackage.RREC__RCL_TMMS:
				setRclTmms((ING)newValue);
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
			case LNGroupRPackage.RREC__OP_CNT_RS:
				setOpCntRs((INC)null);
				return;
			case LNGroupRPackage.RREC__BLK_REC:
				setBlkRec((SPC)null);
				return;
			case LNGroupRPackage.RREC__CHK_REC:
				setChkRec((SPC)null);
				return;
			case LNGroupRPackage.RREC__AUTO:
				setAuto((SPS)null);
				return;
			case LNGroupRPackage.RREC__OP:
				setOp((ACT)null);
				return;
			case LNGroupRPackage.RREC__AUTO_REC_ST:
				setAutoRecSt((INS)null);
				return;
			case LNGroupRPackage.RREC__REC1_TMMS:
				setRec1Tmms((ING)null);
				return;
			case LNGroupRPackage.RREC__REC2_TMMS:
				setRec2Tmms((ING)null);
				return;
			case LNGroupRPackage.RREC__REC3_TMMS:
				setRec3Tmms((ING)null);
				return;
			case LNGroupRPackage.RREC__PLS_TMMS:
				setPlsTmms((ING)null);
				return;
			case LNGroupRPackage.RREC__RCL_TMMS:
				setRclTmms((ING)null);
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
			case LNGroupRPackage.RREC__OP_CNT_RS:
				return opCntRs != null;
			case LNGroupRPackage.RREC__BLK_REC:
				return blkRec != null;
			case LNGroupRPackage.RREC__CHK_REC:
				return chkRec != null;
			case LNGroupRPackage.RREC__AUTO:
				return auto != null;
			case LNGroupRPackage.RREC__OP:
				return op != null;
			case LNGroupRPackage.RREC__AUTO_REC_ST:
				return autoRecSt != null;
			case LNGroupRPackage.RREC__REC1_TMMS:
				return rec1Tmms != null;
			case LNGroupRPackage.RREC__REC2_TMMS:
				return rec2Tmms != null;
			case LNGroupRPackage.RREC__REC3_TMMS:
				return rec3Tmms != null;
			case LNGroupRPackage.RREC__PLS_TMMS:
				return plsTmms != null;
			case LNGroupRPackage.RREC__RCL_TMMS:
				return rclTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //RRECImpl
