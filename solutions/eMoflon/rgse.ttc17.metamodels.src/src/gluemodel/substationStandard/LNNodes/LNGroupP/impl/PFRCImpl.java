/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP.impl;

import gluemodel.substationStandard.Dataclasses.ACD;
import gluemodel.substationStandard.Dataclasses.ACT;
import gluemodel.substationStandard.Dataclasses.ASG;
import gluemodel.substationStandard.Dataclasses.ING;
import gluemodel.substationStandard.Dataclasses.SPS;

import gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPPackage;
import gluemodel.substationStandard.LNNodes.LNGroupP.PFRC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFRC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl#getStr <em>Str</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl#getBlkV <em>Blk V</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl#getBlkVal <em>Blk Val</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl#getOpDiTmms <em>Op Di Tmms</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl#getRsDiTmms <em>Rs Di Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PFRCImpl extends GroupPImpl implements PFRC {
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
	 * The cached value of the '{@link #getBlkVal() <em>Blk Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkVal()
	 * @generated
	 * @ordered
	 */
	protected ASG blkVal;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFRCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PFRC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PFRC__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PFRC__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PFRC__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PFRC__OP, oldOp, op));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PFRC__BLK_V, oldBlkV, blkV));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PFRC__BLK_V, oldBlkV, blkV));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PFRC__STR_VAL, oldStrVal, strVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PFRC__STR_VAL, oldStrVal, strVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getBlkVal() {
		if (blkVal != null && blkVal.eIsProxy()) {
			InternalEObject oldBlkVal = (InternalEObject)blkVal;
			blkVal = (ASG)eResolveProxy(oldBlkVal);
			if (blkVal != oldBlkVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PFRC__BLK_VAL, oldBlkVal, blkVal));
			}
		}
		return blkVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetBlkVal() {
		return blkVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkVal(ASG newBlkVal) {
		ASG oldBlkVal = blkVal;
		blkVal = newBlkVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PFRC__BLK_VAL, oldBlkVal, blkVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PFRC__OP_DI_TMMS, oldOpDiTmms, opDiTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PFRC__OP_DI_TMMS, oldOpDiTmms, opDiTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PFRC__RS_DI_TMMS, oldRsDiTmms, rsDiTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PFRC__RS_DI_TMMS, oldRsDiTmms, rsDiTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PFRC__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PFRC__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PFRC__BLK_V:
				if (resolve) return getBlkV();
				return basicGetBlkV();
			case LNGroupPPackage.PFRC__STR_VAL:
				if (resolve) return getStrVal();
				return basicGetStrVal();
			case LNGroupPPackage.PFRC__BLK_VAL:
				if (resolve) return getBlkVal();
				return basicGetBlkVal();
			case LNGroupPPackage.PFRC__OP_DI_TMMS:
				if (resolve) return getOpDiTmms();
				return basicGetOpDiTmms();
			case LNGroupPPackage.PFRC__RS_DI_TMMS:
				if (resolve) return getRsDiTmms();
				return basicGetRsDiTmms();
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
			case LNGroupPPackage.PFRC__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PFRC__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PFRC__BLK_V:
				setBlkV((SPS)newValue);
				return;
			case LNGroupPPackage.PFRC__STR_VAL:
				setStrVal((ASG)newValue);
				return;
			case LNGroupPPackage.PFRC__BLK_VAL:
				setBlkVal((ASG)newValue);
				return;
			case LNGroupPPackage.PFRC__OP_DI_TMMS:
				setOpDiTmms((ING)newValue);
				return;
			case LNGroupPPackage.PFRC__RS_DI_TMMS:
				setRsDiTmms((ING)newValue);
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
			case LNGroupPPackage.PFRC__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PFRC__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PFRC__BLK_V:
				setBlkV((SPS)null);
				return;
			case LNGroupPPackage.PFRC__STR_VAL:
				setStrVal((ASG)null);
				return;
			case LNGroupPPackage.PFRC__BLK_VAL:
				setBlkVal((ASG)null);
				return;
			case LNGroupPPackage.PFRC__OP_DI_TMMS:
				setOpDiTmms((ING)null);
				return;
			case LNGroupPPackage.PFRC__RS_DI_TMMS:
				setRsDiTmms((ING)null);
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
			case LNGroupPPackage.PFRC__STR:
				return str != null;
			case LNGroupPPackage.PFRC__OP:
				return op != null;
			case LNGroupPPackage.PFRC__BLK_V:
				return blkV != null;
			case LNGroupPPackage.PFRC__STR_VAL:
				return strVal != null;
			case LNGroupPPackage.PFRC__BLK_VAL:
				return blkVal != null;
			case LNGroupPPackage.PFRC__OP_DI_TMMS:
				return opDiTmms != null;
			case LNGroupPPackage.PFRC__RS_DI_TMMS:
				return rsDiTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PFRCImpl
