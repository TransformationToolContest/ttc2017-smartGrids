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
import substationStandard.LNNodes.LNGroupP.PTUF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTUF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTUFImpl#getStr <em>Str</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTUFImpl#getOp <em>Op</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTUFImpl#getBlkV <em>Blk V</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTUFImpl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTUFImpl#getBlkVal <em>Blk Val</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTUFImpl#getOpDlTmms <em>Op Dl Tmms</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupP.impl.PTUFImpl#getRsDlTmms <em>Rs Dl Tmms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTUFImpl extends GroupPImpl implements PTUF {
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
	protected ACT blkVal;

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
	 * The cached value of the '{@link #getRsDlTmms() <em>Rs Dl Tmms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRsDlTmms()
	 * @generated
	 * @ordered
	 */
	protected ING rsDlTmms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupPPackage.Literals.PTUF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUF__STR, oldStr, str));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUF__STR, oldStr, str));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUF__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUF__OP, oldOp, op));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUF__BLK_V, oldBlkV, blkV));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUF__BLK_V, oldBlkV, blkV));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUF__STR_VAL, oldStrVal, strVal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUF__STR_VAL, oldStrVal, strVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT getBlkVal() {
		if (blkVal != null && blkVal.eIsProxy()) {
			InternalEObject oldBlkVal = (InternalEObject)blkVal;
			blkVal = (ACT)eResolveProxy(oldBlkVal);
			if (blkVal != oldBlkVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUF__BLK_VAL, oldBlkVal, blkVal));
			}
		}
		return blkVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT basicGetBlkVal() {
		return blkVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkVal(ACT newBlkVal) {
		ACT oldBlkVal = blkVal;
		blkVal = newBlkVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUF__BLK_VAL, oldBlkVal, blkVal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUF__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUF__OP_DL_TMMS, oldOpDlTmms, opDlTmms));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupPPackage.PTUF__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupPPackage.PTUF__RS_DL_TMMS, oldRsDlTmms, rsDlTmms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupPPackage.PTUF__STR:
				if (resolve) return getStr();
				return basicGetStr();
			case LNGroupPPackage.PTUF__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case LNGroupPPackage.PTUF__BLK_V:
				if (resolve) return getBlkV();
				return basicGetBlkV();
			case LNGroupPPackage.PTUF__STR_VAL:
				if (resolve) return getStrVal();
				return basicGetStrVal();
			case LNGroupPPackage.PTUF__BLK_VAL:
				if (resolve) return getBlkVal();
				return basicGetBlkVal();
			case LNGroupPPackage.PTUF__OP_DL_TMMS:
				if (resolve) return getOpDlTmms();
				return basicGetOpDlTmms();
			case LNGroupPPackage.PTUF__RS_DL_TMMS:
				if (resolve) return getRsDlTmms();
				return basicGetRsDlTmms();
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
			case LNGroupPPackage.PTUF__STR:
				setStr((ACD)newValue);
				return;
			case LNGroupPPackage.PTUF__OP:
				setOp((ACT)newValue);
				return;
			case LNGroupPPackage.PTUF__BLK_V:
				setBlkV((SPS)newValue);
				return;
			case LNGroupPPackage.PTUF__STR_VAL:
				setStrVal((ASG)newValue);
				return;
			case LNGroupPPackage.PTUF__BLK_VAL:
				setBlkVal((ACT)newValue);
				return;
			case LNGroupPPackage.PTUF__OP_DL_TMMS:
				setOpDlTmms((ING)newValue);
				return;
			case LNGroupPPackage.PTUF__RS_DL_TMMS:
				setRsDlTmms((ING)newValue);
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
			case LNGroupPPackage.PTUF__STR:
				setStr((ACD)null);
				return;
			case LNGroupPPackage.PTUF__OP:
				setOp((ACT)null);
				return;
			case LNGroupPPackage.PTUF__BLK_V:
				setBlkV((SPS)null);
				return;
			case LNGroupPPackage.PTUF__STR_VAL:
				setStrVal((ASG)null);
				return;
			case LNGroupPPackage.PTUF__BLK_VAL:
				setBlkVal((ACT)null);
				return;
			case LNGroupPPackage.PTUF__OP_DL_TMMS:
				setOpDlTmms((ING)null);
				return;
			case LNGroupPPackage.PTUF__RS_DL_TMMS:
				setRsDlTmms((ING)null);
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
			case LNGroupPPackage.PTUF__STR:
				return str != null;
			case LNGroupPPackage.PTUF__OP:
				return op != null;
			case LNGroupPPackage.PTUF__BLK_V:
				return blkV != null;
			case LNGroupPPackage.PTUF__STR_VAL:
				return strVal != null;
			case LNGroupPPackage.PTUF__BLK_VAL:
				return blkVal != null;
			case LNGroupPPackage.PTUF__OP_DL_TMMS:
				return opDlTmms != null;
			case LNGroupPPackage.PTUF__RS_DL_TMMS:
				return rsDlTmms != null;
		}
		return super.eIsSet(featureID);
	}

} //PTUFImpl
