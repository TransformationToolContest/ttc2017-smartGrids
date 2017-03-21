/**
 */
package substationStandard.LNNodes.LNGroupY.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPC;

import substationStandard.Enumerations.SwitchingCapabilityKind;

import substationStandard.LNNodes.LNGroupY.LNGroupYPackage;
import substationStandard.LNNodes.LNGroupY.YPSH;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YPSH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YPSHImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YPSHImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YPSHImpl#getBlkOpn <em>Blk Opn</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YPSHImpl#getBlkCls <em>Blk Cls</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YPSHImpl#getChaMotEna <em>Cha Mot Ena</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YPSHImpl#getShOpCap <em>Sh Op Cap</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupY.impl.YPSHImpl#getMaxOpCap <em>Max Op Cap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YPSHImpl extends GroupYImpl implements YPSH {
	/**
	 * The cached value of the '{@link #getOpTmh() <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTmh()
	 * @generated
	 * @ordered
	 */
	protected INS opTmh;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected DPC pos;

	/**
	 * The cached value of the '{@link #getBlkOpn() <em>Blk Opn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkOpn()
	 * @generated
	 * @ordered
	 */
	protected SPC blkOpn;

	/**
	 * The cached value of the '{@link #getBlkCls() <em>Blk Cls</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlkCls()
	 * @generated
	 * @ordered
	 */
	protected SPC blkCls;

	/**
	 * The cached value of the '{@link #getChaMotEna() <em>Cha Mot Ena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChaMotEna()
	 * @generated
	 * @ordered
	 */
	protected SPC chaMotEna;

	/**
	 * The default value of the '{@link #getShOpCap() <em>Sh Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShOpCap()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchingCapabilityKind SH_OP_CAP_EDEFAULT = SwitchingCapabilityKind.NONE;

	/**
	 * The cached value of the '{@link #getShOpCap() <em>Sh Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShOpCap()
	 * @generated
	 * @ordered
	 */
	protected SwitchingCapabilityKind shOpCap = SH_OP_CAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOpCap() <em>Max Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOpCap()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchingCapabilityKind MAX_OP_CAP_EDEFAULT = SwitchingCapabilityKind.NONE;

	/**
	 * The cached value of the '{@link #getMaxOpCap() <em>Max Op Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOpCap()
	 * @generated
	 * @ordered
	 */
	protected SwitchingCapabilityKind maxOpCap = MAX_OP_CAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YPSHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupYPackage.Literals.YPSH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getOpTmh() {
		if (opTmh != null && opTmh.eIsProxy()) {
			InternalEObject oldOpTmh = (InternalEObject)opTmh;
			opTmh = (INS)eResolveProxy(oldOpTmh);
			if (opTmh != oldOpTmh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPSH__OP_TMH, oldOpTmh, opTmh));
			}
		}
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetOpTmh() {
		return opTmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpTmh(INS newOpTmh) {
		INS oldOpTmh = opTmh;
		opTmh = newOpTmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPSH__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC getPos() {
		if (pos != null && pos.eIsProxy()) {
			InternalEObject oldPos = (InternalEObject)pos;
			pos = (DPC)eResolveProxy(oldPos);
			if (pos != oldPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPSH__POS, oldPos, pos));
			}
		}
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC basicGetPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(DPC newPos) {
		DPC oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPSH__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getBlkOpn() {
		if (blkOpn != null && blkOpn.eIsProxy()) {
			InternalEObject oldBlkOpn = (InternalEObject)blkOpn;
			blkOpn = (SPC)eResolveProxy(oldBlkOpn);
			if (blkOpn != oldBlkOpn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPSH__BLK_OPN, oldBlkOpn, blkOpn));
			}
		}
		return blkOpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetBlkOpn() {
		return blkOpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkOpn(SPC newBlkOpn) {
		SPC oldBlkOpn = blkOpn;
		blkOpn = newBlkOpn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPSH__BLK_OPN, oldBlkOpn, blkOpn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getBlkCls() {
		if (blkCls != null && blkCls.eIsProxy()) {
			InternalEObject oldBlkCls = (InternalEObject)blkCls;
			blkCls = (SPC)eResolveProxy(oldBlkCls);
			if (blkCls != oldBlkCls) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPSH__BLK_CLS, oldBlkCls, blkCls));
			}
		}
		return blkCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetBlkCls() {
		return blkCls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlkCls(SPC newBlkCls) {
		SPC oldBlkCls = blkCls;
		blkCls = newBlkCls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPSH__BLK_CLS, oldBlkCls, blkCls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC getChaMotEna() {
		if (chaMotEna != null && chaMotEna.eIsProxy()) {
			InternalEObject oldChaMotEna = (InternalEObject)chaMotEna;
			chaMotEna = (SPC)eResolveProxy(oldChaMotEna);
			if (chaMotEna != oldChaMotEna) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupYPackage.YPSH__CHA_MOT_ENA, oldChaMotEna, chaMotEna));
			}
		}
		return chaMotEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC basicGetChaMotEna() {
		return chaMotEna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChaMotEna(SPC newChaMotEna) {
		SPC oldChaMotEna = chaMotEna;
		chaMotEna = newChaMotEna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPSH__CHA_MOT_ENA, oldChaMotEna, chaMotEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingCapabilityKind getShOpCap() {
		return shOpCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShOpCap(SwitchingCapabilityKind newShOpCap) {
		SwitchingCapabilityKind oldShOpCap = shOpCap;
		shOpCap = newShOpCap == null ? SH_OP_CAP_EDEFAULT : newShOpCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPSH__SH_OP_CAP, oldShOpCap, shOpCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingCapabilityKind getMaxOpCap() {
		return maxOpCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOpCap(SwitchingCapabilityKind newMaxOpCap) {
		SwitchingCapabilityKind oldMaxOpCap = maxOpCap;
		maxOpCap = newMaxOpCap == null ? MAX_OP_CAP_EDEFAULT : newMaxOpCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupYPackage.YPSH__MAX_OP_CAP, oldMaxOpCap, maxOpCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupYPackage.YPSH__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupYPackage.YPSH__POS:
				if (resolve) return getPos();
				return basicGetPos();
			case LNGroupYPackage.YPSH__BLK_OPN:
				if (resolve) return getBlkOpn();
				return basicGetBlkOpn();
			case LNGroupYPackage.YPSH__BLK_CLS:
				if (resolve) return getBlkCls();
				return basicGetBlkCls();
			case LNGroupYPackage.YPSH__CHA_MOT_ENA:
				if (resolve) return getChaMotEna();
				return basicGetChaMotEna();
			case LNGroupYPackage.YPSH__SH_OP_CAP:
				return getShOpCap();
			case LNGroupYPackage.YPSH__MAX_OP_CAP:
				return getMaxOpCap();
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
			case LNGroupYPackage.YPSH__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupYPackage.YPSH__POS:
				setPos((DPC)newValue);
				return;
			case LNGroupYPackage.YPSH__BLK_OPN:
				setBlkOpn((SPC)newValue);
				return;
			case LNGroupYPackage.YPSH__BLK_CLS:
				setBlkCls((SPC)newValue);
				return;
			case LNGroupYPackage.YPSH__CHA_MOT_ENA:
				setChaMotEna((SPC)newValue);
				return;
			case LNGroupYPackage.YPSH__SH_OP_CAP:
				setShOpCap((SwitchingCapabilityKind)newValue);
				return;
			case LNGroupYPackage.YPSH__MAX_OP_CAP:
				setMaxOpCap((SwitchingCapabilityKind)newValue);
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
			case LNGroupYPackage.YPSH__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupYPackage.YPSH__POS:
				setPos((DPC)null);
				return;
			case LNGroupYPackage.YPSH__BLK_OPN:
				setBlkOpn((SPC)null);
				return;
			case LNGroupYPackage.YPSH__BLK_CLS:
				setBlkCls((SPC)null);
				return;
			case LNGroupYPackage.YPSH__CHA_MOT_ENA:
				setChaMotEna((SPC)null);
				return;
			case LNGroupYPackage.YPSH__SH_OP_CAP:
				setShOpCap(SH_OP_CAP_EDEFAULT);
				return;
			case LNGroupYPackage.YPSH__MAX_OP_CAP:
				setMaxOpCap(MAX_OP_CAP_EDEFAULT);
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
			case LNGroupYPackage.YPSH__OP_TMH:
				return opTmh != null;
			case LNGroupYPackage.YPSH__POS:
				return pos != null;
			case LNGroupYPackage.YPSH__BLK_OPN:
				return blkOpn != null;
			case LNGroupYPackage.YPSH__BLK_CLS:
				return blkCls != null;
			case LNGroupYPackage.YPSH__CHA_MOT_ENA:
				return chaMotEna != null;
			case LNGroupYPackage.YPSH__SH_OP_CAP:
				return shOpCap != SH_OP_CAP_EDEFAULT;
			case LNGroupYPackage.YPSH__MAX_OP_CAP:
				return maxOpCap != MAX_OP_CAP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ShOpCap: ");
		result.append(shOpCap);
		result.append(", MaxOpCap: ");
		result.append(maxOpCap);
		result.append(')');
		return result.toString();
	}

} //YPSHImpl
