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
import substationStandard.Dataclasses.ING;
import substationStandard.Dataclasses.SPS;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import substationStandard.LNNodes.LNGroupP.POPF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>POPF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getBlkA <em>Blk A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getBlkV <em>Blk V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getOpDiTmms <em>Op Di Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getRsDiTmms <em>Rs Di Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getBlkValA <em>Blk Val A</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.POPFImpl#getBlkValV <em>Blk Val V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class POPFImpl extends GroupPImpl implements POPF {
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
	 * The cached value of the '{@link #getBlkA() <em>Blk A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkA()
	 * @generated
	 * @ordered
	 */
	protected SPS blkA;

	/**
	 * The cached value of the '{@link #getBlkV() <em>Blk V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkV()
	 * @generated
	 * @ordered
	 */
	protected SPS blkV;

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
	 * The cached value of the '{@link #getOpDiTmms() <em>Op Di Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpDiTmms()
	 * @generated
	 * @ordered
	 */
	protected ING opDiTmms;

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
	 * The cached value of the '{@link #getBlkValA() <em>Blk Val A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkValA()
	 * @generated
	 * @ordered
	 */
	protected ASG blkValA;

	/**
	 * The cached value of the '{@link #getBlkValV() <em>Blk Val V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkValV()
	 * @generated
	 * @ordered
	 */
	protected ASG blkValV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected POPFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.POPF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getBlkA() {
		if (blkA != null && blkA.eIsProxy()) {
			InternalEObject oldBlkA = (InternalEObject)blkA;
			blkA = (SPS)eResolveProxy(oldBlkA);
			if (blkA != oldBlkA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__BLK_A, oldBlkA, blkA));
			}
		}
		return blkA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetBlkA() {
		return blkA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkA(SPS newBlkA) {
		SPS oldBlkA = blkA;
		blkA = newBlkA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__BLK_A, oldBlkA, blkA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getBlkV() {
		if (blkV != null && blkV.eIsProxy()) {
			InternalEObject oldBlkV = (InternalEObject)blkV;
			blkV = (SPS)eResolveProxy(oldBlkV);
			if (blkV != oldBlkV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__BLK_V, oldBlkV, blkV));
			}
		}
		return blkV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetBlkV() {
		return blkV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkV(SPS newBlkV) {
		SPS oldBlkV = blkV;
		blkV = newBlkV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__BLK_V, oldBlkV, blkV));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__STR_VAL, oldStrVal, strVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__STR_VAL, oldStrVal, strVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING getOpDiTmms() {
		if (opDiTmms != null && opDiTmms.eIsProxy()) {
			InternalEObject oldOpDiTmms = (InternalEObject)opDiTmms;
			opDiTmms = (ING)eResolveProxy(oldOpDiTmms);
			if (opDiTmms != oldOpDiTmms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__OP_DI_TMMS, oldOpDiTmms, opDiTmms));
			}
		}
		return opDiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING basicGetOpDiTmms() {
		return opDiTmms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpDiTmms(ING newOpDiTmms) {
		ING oldOpDiTmms = opDiTmms;
		opDiTmms = newOpDiTmms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__OP_DI_TMMS, oldOpDiTmms, opDiTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__RS_DI_TMMS, oldRsDiTmms, rsDiTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__RS_DI_TMMS, oldRsDiTmms, rsDiTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBlkValA() {
		if (blkValA != null && blkValA.eIsProxy()) {
			InternalEObject oldBlkValA = (InternalEObject)blkValA;
			blkValA = (ASG)eResolveProxy(oldBlkValA);
			if (blkValA != oldBlkValA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__BLK_VAL_A, oldBlkValA, blkValA));
			}
		}
		return blkValA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBlkValA() {
		return blkValA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkValA(ASG newBlkValA) {
		ASG oldBlkValA = blkValA;
		blkValA = newBlkValA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__BLK_VAL_A, oldBlkValA, blkValA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBlkValV() {
		if (blkValV != null && blkValV.eIsProxy()) {
			InternalEObject oldBlkValV = (InternalEObject)blkValV;
			blkValV = (ASG)eResolveProxy(oldBlkValV);
			if (blkValV != oldBlkValV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.POPF__BLK_VAL_V, oldBlkValV, blkValV));
			}
		}
		return blkValV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBlkValV() {
		return blkValV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkValV(ASG newBlkValV) {
		ASG oldBlkValV = blkValV;
		blkValV = newBlkValV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.POPF__BLK_VAL_V, oldBlkValV, blkValV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.POPF__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.POPF__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.POPF__BLK_A:
				if (resolve) return getBlkA();
				return basicGetBlkA();
			case LNGroupPPackage.POPF__BLK_V:
				if (resolve) return getBlkV();
				return basicGetBlkV();
			case LNGroupPPackage.POPF__STR_VAL:
				if (resolve) return getStrVal();
				return basicGetStrVal();
			case LNGroupPPackage.POPF__OP_DI_TMMS:
				if (resolve) return getOpDiTmms();
				return basicGetOpDiTmms();
			case LNGroupPPackage.POPF__RS_DI_TMMS:
				if (resolve) return getRsDiTmms();
				return basicGetRsDiTmms();
			case LNGroupPPackage.POPF__BLK_VAL_A:
				if (resolve) return getBlkValA();
				return basicGetBlkValA();
			case LNGroupPPackage.POPF__BLK_VAL_V:
				if (resolve) return getBlkValV();
				return basicGetBlkValV();
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
			case LNGroupPPackage.POPF__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.POPF__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.POPF__BLK_A:
				setBlkA((SPS)newValue);
				return;
			case LNGroupPPackage.POPF__BLK_V:
				setBlkV((SPS)newValue);
				return;
			case LNGroupPPackage.POPF__STR_VAL:
				setStrVal((ASG)newValue);
				return;
			case LNGroupPPackage.POPF__OP_DI_TMMS:
				setOpDiTmms((ING)newValue);
				return;
			case LNGroupPPackage.POPF__RS_DI_TMMS:
				setRsDiTmms((ING)newValue);
				return;
			case LNGroupPPackage.POPF__BLK_VAL_A:
				setBlkValA((ASG)newValue);
				return;
			case LNGroupPPackage.POPF__BLK_VAL_V:
				setBlkValV((ASG)newValue);
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
			case LNGroupPPackage.POPF__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.POPF__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.POPF__BLK_A:
				setBlkA((SPS)null);
				return;
			case LNGroupPPackage.POPF__BLK_V:
				setBlkV((SPS)null);
				return;
			case LNGroupPPackage.POPF__STR_VAL:
				setStrVal((ASG)null);
				return;
			case LNGroupPPackage.POPF__OP_DI_TMMS:
				setOpDiTmms((ING)null);
				return;
			case LNGroupPPackage.POPF__RS_DI_TMMS:
				setRsDiTmms((ING)null);
				return;
			case LNGroupPPackage.POPF__BLK_VAL_A:
				setBlkValA((ASG)null);
				return;
			case LNGroupPPackage.POPF__BLK_VAL_V:
				setBlkValV((ASG)null);
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
			case LNGroupPPackage.POPF__STR:
				return str != null;
			case LNGroupPPackage.POPF__OP:
				return op != null;
			case LNGroupPPackage.POPF__BLK_A:
				return blkA != null;
			case LNGroupPPackage.POPF__BLK_V:
				return blkV != null;
			case LNGroupPPackage.POPF__STR_VAL:
				return strVal != null;
			case LNGroupPPackage.POPF__OP_DI_TMMS:
				return opDiTmms != null;
			case LNGroupPPackage.POPF__RS_DI_TMMS:
				return rsDiTmms != null;
			case LNGroupPPackage.POPF__BLK_VAL_A:
				return blkValA != null;
			case LNGroupPPackage.POPF__BLK_VAL_V:
				return blkValV != null;
		}
		return super.eIsSet(featureID);
	}

} //POPFImpl
