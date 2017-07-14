/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupY.impl;

import gluemodel.substationStandard.Dataclasses.BSC;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.ISC;
import gluemodel.substationStandard.Dataclasses.MV;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupY.LNGroupYPackage;
import gluemodel.substationStandard.LNNodes.LNGroupY.YLTC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YLTC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl#getOpCnt <em>Op Cnt</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl#getTorq <em>Torq</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl#getMotDrvA <em>Mot Drv A</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl#getTapPos <em>Tap Pos</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl#getTapChg <em>Tap Chg</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl#getEndPosR <em>End Pos R</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl#getEndPosL <em>End Pos L</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl#getOilFil <em>Oil Fil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YLTCImpl extends GroupYImpl implements YLTC {
	/**
	 * The cached value of the '{@link #getOpCnt() <em>Op Cnt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCnt()
	 * @generated
	 * @ordered
	 */
	protected INS opCnt;

	/**
	 * The cached value of the '{@link #getTorq() <em>Torq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorq()
	 * @generated
	 * @ordered
	 */
	protected MV torq;

	/**
	 * The cached value of the '{@link #getMotDrvA() <em>Mot Drv A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotDrvA()
	 * @generated
	 * @ordered
	 */
	protected MV motDrvA;

	/**
	 * The cached value of the '{@link #getTapPos() <em>Tap Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapPos()
	 * @generated
	 * @ordered
	 */
	protected ISC tapPos;

	/**
	 * The cached value of the '{@link #getTapChg() <em>Tap Chg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChg()
	 * @generated
	 * @ordered
	 */
	protected BSC tapChg;

	/**
	 * The cached value of the '{@link #getEndPosR() <em>End Pos R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosR()
	 * @generated
	 * @ordered
	 */
	protected SPS endPosR;

	/**
	 * The cached value of the '{@link #getEndPosL() <em>End Pos L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosL()
	 * @generated
	 * @ordered
	 */
	protected SPS endPosL;

	/**
	 * The cached value of the '{@link #getOilFil() <em>Oil Fil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilFil()
	 * @generated
	 * @ordered
	 */
	protected SPS oilFil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YLTCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupYPackage.Literals.YLTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getOpCnt() {
		if (opCnt != null && opCnt.eIsProxy()) {
			InternalEObject oldOpCnt = (InternalEObject)opCnt;
			opCnt = (INS)eResolveProxy(oldOpCnt);
			if (opCnt != oldOpCnt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YLTC__OP_CNT, oldOpCnt, opCnt));
			}
		}
		return opCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetOpCnt() {
		return opCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpCnt(INS newOpCnt) {
		INS oldOpCnt = opCnt;
		opCnt = newOpCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YLTC__OP_CNT, oldOpCnt, opCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getTorq() {
		if (torq != null && torq.eIsProxy()) {
			InternalEObject oldTorq = (InternalEObject)torq;
			torq = (MV)eResolveProxy(oldTorq);
			if (torq != oldTorq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YLTC__TORQ, oldTorq, torq));
			}
		}
		return torq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetTorq() {
		return torq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorq(MV newTorq) {
		MV oldTorq = torq;
		torq = newTorq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YLTC__TORQ, oldTorq, torq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV getMotDrvA() {
		if (motDrvA != null && motDrvA.eIsProxy()) {
			InternalEObject oldMotDrvA = (InternalEObject)motDrvA;
			motDrvA = (MV)eResolveProxy(oldMotDrvA);
			if (motDrvA != oldMotDrvA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YLTC__MOT_DRV_A, oldMotDrvA, motDrvA));
			}
		}
		return motDrvA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV basicGetMotDrvA() {
		return motDrvA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotDrvA(MV newMotDrvA) {
		MV oldMotDrvA = motDrvA;
		motDrvA = newMotDrvA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YLTC__MOT_DRV_A, oldMotDrvA, motDrvA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISC getTapPos() {
		if (tapPos != null && tapPos.eIsProxy()) {
			InternalEObject oldTapPos = (InternalEObject)tapPos;
			tapPos = (ISC)eResolveProxy(oldTapPos);
			if (tapPos != oldTapPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YLTC__TAP_POS, oldTapPos, tapPos));
			}
		}
		return tapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISC basicGetTapPos() {
		return tapPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapPos(ISC newTapPos) {
		ISC oldTapPos = tapPos;
		tapPos = newTapPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YLTC__TAP_POS, oldTapPos, tapPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC getTapChg() {
		if (tapChg != null && tapChg.eIsProxy()) {
			InternalEObject oldTapChg = (InternalEObject)tapChg;
			tapChg = (BSC)eResolveProxy(oldTapChg);
			if (tapChg != oldTapChg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YLTC__TAP_CHG, oldTapChg, tapChg));
			}
		}
		return tapChg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC basicGetTapChg() {
		return tapChg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapChg(BSC newTapChg) {
		BSC oldTapChg = tapChg;
		tapChg = newTapChg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YLTC__TAP_CHG, oldTapChg, tapChg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getEndPosR() {
		if (endPosR != null && endPosR.eIsProxy()) {
			InternalEObject oldEndPosR = (InternalEObject)endPosR;
			endPosR = (SPS)eResolveProxy(oldEndPosR);
			if (endPosR != oldEndPosR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YLTC__END_POS_R, oldEndPosR, endPosR));
			}
		}
		return endPosR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetEndPosR() {
		return endPosR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosR(SPS newEndPosR) {
		SPS oldEndPosR = endPosR;
		endPosR = newEndPosR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YLTC__END_POS_R, oldEndPosR, endPosR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getEndPosL() {
		if (endPosL != null && endPosL.eIsProxy()) {
			InternalEObject oldEndPosL = (InternalEObject)endPosL;
			endPosL = (SPS)eResolveProxy(oldEndPosL);
			if (endPosL != oldEndPosL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YLTC__END_POS_L, oldEndPosL, endPosL));
			}
		}
		return endPosL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetEndPosL() {
		return endPosL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosL(SPS newEndPosL) {
		SPS oldEndPosL = endPosL;
		endPosL = newEndPosL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YLTC__END_POS_L, oldEndPosL, endPosL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getOilFil() {
		if (oilFil != null && oilFil.eIsProxy()) {
			InternalEObject oldOilFil = (InternalEObject)oilFil;
			oilFil = (SPS)eResolveProxy(oldOilFil);
			if (oilFil != oldOilFil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YLTC__OIL_FIL, oldOilFil, oilFil));
			}
		}
		return oilFil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetOilFil() {
		return oilFil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOilFil(SPS newOilFil) {
		SPS oldOilFil = oilFil;
		oilFil = newOilFil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YLTC__OIL_FIL, oldOilFil, oilFil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupYPackage.YLTC__OP_CNT:
				if (resolve) return getOpCnt();
				return basicGetOpCnt();
			case LNGroupYPackage.YLTC__TORQ:
				if (resolve) return getTorq();
				return basicGetTorq();
			case LNGroupYPackage.YLTC__MOT_DRV_A:
				if (resolve) return getMotDrvA();
				return basicGetMotDrvA();
			case LNGroupYPackage.YLTC__TAP_POS:
				if (resolve) return getTapPos();
				return basicGetTapPos();
			case LNGroupYPackage.YLTC__TAP_CHG:
				if (resolve) return getTapChg();
				return basicGetTapChg();
			case LNGroupYPackage.YLTC__END_POS_R:
				if (resolve) return getEndPosR();
				return basicGetEndPosR();
			case LNGroupYPackage.YLTC__END_POS_L:
				if (resolve) return getEndPosL();
				return basicGetEndPosL();
			case LNGroupYPackage.YLTC__OIL_FIL:
				if (resolve) return getOilFil();
				return basicGetOilFil();
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
			case LNGroupYPackage.YLTC__OP_CNT:
				setOpCnt((INS)newValue);
				return;
			case LNGroupYPackage.YLTC__TORQ:
				setTorq((MV)newValue);
				return;
			case LNGroupYPackage.YLTC__MOT_DRV_A:
				setMotDrvA((MV)newValue);
				return;
			case LNGroupYPackage.YLTC__TAP_POS:
				setTapPos((ISC)newValue);
				return;
			case LNGroupYPackage.YLTC__TAP_CHG:
				setTapChg((BSC)newValue);
				return;
			case LNGroupYPackage.YLTC__END_POS_R:
				setEndPosR((SPS)newValue);
				return;
			case LNGroupYPackage.YLTC__END_POS_L:
				setEndPosL((SPS)newValue);
				return;
			case LNGroupYPackage.YLTC__OIL_FIL:
				setOilFil((SPS)newValue);
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
			case LNGroupYPackage.YLTC__OP_CNT:
				setOpCnt((INS)null);
				return;
			case LNGroupYPackage.YLTC__TORQ:
				setTorq((MV)null);
				return;
			case LNGroupYPackage.YLTC__MOT_DRV_A:
				setMotDrvA((MV)null);
				return;
			case LNGroupYPackage.YLTC__TAP_POS:
				setTapPos((ISC)null);
				return;
			case LNGroupYPackage.YLTC__TAP_CHG:
				setTapChg((BSC)null);
				return;
			case LNGroupYPackage.YLTC__END_POS_R:
				setEndPosR((SPS)null);
				return;
			case LNGroupYPackage.YLTC__END_POS_L:
				setEndPosL((SPS)null);
				return;
			case LNGroupYPackage.YLTC__OIL_FIL:
				setOilFil((SPS)null);
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
			case LNGroupYPackage.YLTC__OP_CNT:
				return opCnt != null;
			case LNGroupYPackage.YLTC__TORQ:
				return torq != null;
			case LNGroupYPackage.YLTC__MOT_DRV_A:
				return motDrvA != null;
			case LNGroupYPackage.YLTC__TAP_POS:
				return tapPos != null;
			case LNGroupYPackage.YLTC__TAP_CHG:
				return tapChg != null;
			case LNGroupYPackage.YLTC__END_POS_R:
				return endPosR != null;
			case LNGroupYPackage.YLTC__END_POS_L:
				return endPosL != null;
			case LNGroupYPackage.YLTC__OIL_FIL:
				return oilFil != null;
		}
		return super.eIsSet(featureID);
	}

} //YLTCImpl
