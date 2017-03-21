/**
 */
package substationStandard.LNNodes.LNGroupX.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.DPC;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.INS;
import substationStandard.Dataclasses.SPC;
import substationStandard.Dataclasses.SPS;

import substationStandard.Enumerations.HealthStateKind;

import substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl;

import substationStandard.LNNodes.LNGroupX.GroupX;
import substationStandard.LNNodes.LNGroupX.LNGroupXPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl#getLoc <em>Loc</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl#getOpCnt <em>Op Cnt</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl#getBlkOpn <em>Blk Opn</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl#getBlkCls <em>Blk Cls</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl#getChaMotEna <em>Cha Mot Ena</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupXImpl extends DomainLNImpl implements GroupX {
	/**
	 * The cached value of the '{@link #getLoc() <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoc()
	 * @generated
	 * @ordered
	 */
	protected SPS loc;

	/**
	 * The default value of the '{@link #getEEHealth() <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEHealth()
	 * @generated
	 * @ordered
	 */
	protected static final HealthStateKind EE_HEALTH_EDEFAULT = HealthStateKind.OK;

	/**
	 * The cached value of the '{@link #getEEHealth() <em>EE Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEHealth()
	 * @generated
	 * @ordered
	 */
	protected HealthStateKind eeHealth = EE_HEALTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEEName() <em>EE Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEName()
	 * @generated
	 * @ordered
	 */
	protected DPL eeName;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupXPackage.Literals.GROUP_X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS getLoc() {
		if (loc != null && loc.eIsProxy()) {
			InternalEObject oldLoc = (InternalEObject)loc;
			loc = (SPS)eResolveProxy(oldLoc);
			if (loc != oldLoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.GROUP_X__LOC, oldLoc, loc));
			}
		}
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS basicGetLoc() {
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoc(SPS newLoc) {
		SPS oldLoc = loc;
		loc = newLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.GROUP_X__LOC, oldLoc, loc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStateKind getEEHealth() {
		return eeHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEHealth(HealthStateKind newEEHealth) {
		HealthStateKind oldEEHealth = eeHealth;
		eeHealth = newEEHealth == null ? EE_HEALTH_EDEFAULT : newEEHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.GROUP_X__EE_HEALTH, oldEEHealth, eeHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPL getEEName() {
		if (eeName != null && eeName.eIsProxy()) {
			InternalEObject oldEEName = (InternalEObject)eeName;
			eeName = (DPL)eResolveProxy(oldEEName);
			if (eeName != oldEEName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.GROUP_X__EE_NAME, oldEEName, eeName));
			}
		}
		return eeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPL basicGetEEName() {
		return eeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEName(DPL newEEName) {
		DPL oldEEName = eeName;
		eeName = newEEName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.GROUP_X__EE_NAME, oldEEName, eeName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.GROUP_X__OP_CNT, oldOpCnt, opCnt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.GROUP_X__OP_CNT, oldOpCnt, opCnt));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.GROUP_X__POS, oldPos, pos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.GROUP_X__POS, oldPos, pos));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.GROUP_X__BLK_OPN, oldBlkOpn, blkOpn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.GROUP_X__BLK_OPN, oldBlkOpn, blkOpn));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.GROUP_X__BLK_CLS, oldBlkCls, blkCls));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.GROUP_X__BLK_CLS, oldBlkCls, blkCls));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupXPackage.GROUP_X__CHA_MOT_ENA, oldChaMotEna, chaMotEna));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupXPackage.GROUP_X__CHA_MOT_ENA, oldChaMotEna, chaMotEna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupXPackage.GROUP_X__LOC:
				if (resolve) return getLoc();
				return basicGetLoc();
			case LNGroupXPackage.GROUP_X__EE_HEALTH:
				return getEEHealth();
			case LNGroupXPackage.GROUP_X__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupXPackage.GROUP_X__OP_CNT:
				if (resolve) return getOpCnt();
				return basicGetOpCnt();
			case LNGroupXPackage.GROUP_X__POS:
				if (resolve) return getPos();
				return basicGetPos();
			case LNGroupXPackage.GROUP_X__BLK_OPN:
				if (resolve) return getBlkOpn();
				return basicGetBlkOpn();
			case LNGroupXPackage.GROUP_X__BLK_CLS:
				if (resolve) return getBlkCls();
				return basicGetBlkCls();
			case LNGroupXPackage.GROUP_X__CHA_MOT_ENA:
				if (resolve) return getChaMotEna();
				return basicGetChaMotEna();
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
			case LNGroupXPackage.GROUP_X__LOC:
				setLoc((SPS)newValue);
				return;
			case LNGroupXPackage.GROUP_X__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
				return;
			case LNGroupXPackage.GROUP_X__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupXPackage.GROUP_X__OP_CNT:
				setOpCnt((INS)newValue);
				return;
			case LNGroupXPackage.GROUP_X__POS:
				setPos((DPC)newValue);
				return;
			case LNGroupXPackage.GROUP_X__BLK_OPN:
				setBlkOpn((SPC)newValue);
				return;
			case LNGroupXPackage.GROUP_X__BLK_CLS:
				setBlkCls((SPC)newValue);
				return;
			case LNGroupXPackage.GROUP_X__CHA_MOT_ENA:
				setChaMotEna((SPC)newValue);
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
			case LNGroupXPackage.GROUP_X__LOC:
				setLoc((SPS)null);
				return;
			case LNGroupXPackage.GROUP_X__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
				return;
			case LNGroupXPackage.GROUP_X__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupXPackage.GROUP_X__OP_CNT:
				setOpCnt((INS)null);
				return;
			case LNGroupXPackage.GROUP_X__POS:
				setPos((DPC)null);
				return;
			case LNGroupXPackage.GROUP_X__BLK_OPN:
				setBlkOpn((SPC)null);
				return;
			case LNGroupXPackage.GROUP_X__BLK_CLS:
				setBlkCls((SPC)null);
				return;
			case LNGroupXPackage.GROUP_X__CHA_MOT_ENA:
				setChaMotEna((SPC)null);
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
			case LNGroupXPackage.GROUP_X__LOC:
				return loc != null;
			case LNGroupXPackage.GROUP_X__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
			case LNGroupXPackage.GROUP_X__EE_NAME:
				return eeName != null;
			case LNGroupXPackage.GROUP_X__OP_CNT:
				return opCnt != null;
			case LNGroupXPackage.GROUP_X__POS:
				return pos != null;
			case LNGroupXPackage.GROUP_X__BLK_OPN:
				return blkOpn != null;
			case LNGroupXPackage.GROUP_X__BLK_CLS:
				return blkCls != null;
			case LNGroupXPackage.GROUP_X__CHA_MOT_ENA:
				return chaMotEna != null;
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
		result.append(" (EEHealth: ");
		result.append(eeHealth);
		result.append(')');
		return result.toString();
	}

} //GroupXImpl
