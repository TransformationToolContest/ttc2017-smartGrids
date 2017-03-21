/**
 */
package substationStandard.LNNodes.LNGroupT.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import substationStandard.Dataclasses.ASG;
import substationStandard.Dataclasses.DPL;
import substationStandard.Dataclasses.INS;

import substationStandard.Enumerations.HealthStateKind;

import substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl;

import substationStandard.LNNodes.LNGroupT.GroupT;
import substationStandard.LNNodes.LNGroupT.LNGroupTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.impl.GroupTImpl#getEEName <em>EE Name</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.impl.GroupTImpl#getEEHealth <em>EE Health</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.impl.GroupTImpl#getOpTmh <em>Op Tmh</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.impl.GroupTImpl#getHzRtg <em>Hz Rtg</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.impl.GroupTImpl#getRat <em>Rat</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.impl.GroupTImpl#getCor <em>Cor</em>}</li>
 *   <li>{@link substationStandard.LNNodes.LNGroupT.impl.GroupTImpl#getAngCor <em>Ang Cor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupTImpl extends DomainLNImpl implements GroupT {
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
	 * The cached value of the '{@link #getOpTmh() <em>Op Tmh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTmh()
	 * @generated
	 * @ordered
	 */
	protected INS opTmh;

	/**
	 * The cached value of the '{@link #getHzRtg() <em>Hz Rtg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHzRtg()
	 * @generated
	 * @ordered
	 */
	protected ASG hzRtg;

	/**
	 * The cached value of the '{@link #getRat() <em>Rat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRat()
	 * @generated
	 * @ordered
	 */
	protected ASG rat;

	/**
	 * The cached value of the '{@link #getCor() <em>Cor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCor()
	 * @generated
	 * @ordered
	 */
	protected ASG cor;

	/**
	 * The cached value of the '{@link #getAngCor() <em>Ang Cor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngCor()
	 * @generated
	 * @ordered
	 */
	protected ASG angCor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LNGroupTPackage.Literals.GROUP_T;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.GROUP_T__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.GROUP_T__EE_NAME, oldEEName, eeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.GROUP_T__EE_HEALTH, oldEEHealth, eeHealth));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.GROUP_T__OP_TMH, oldOpTmh, opTmh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.GROUP_T__OP_TMH, oldOpTmh, opTmh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getHzRtg() {
		if (hzRtg != null && hzRtg.eIsProxy()) {
			InternalEObject oldHzRtg = (InternalEObject)hzRtg;
			hzRtg = (ASG)eResolveProxy(oldHzRtg);
			if (hzRtg != oldHzRtg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.GROUP_T__HZ_RTG, oldHzRtg, hzRtg));
			}
		}
		return hzRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetHzRtg() {
		return hzRtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHzRtg(ASG newHzRtg) {
		ASG oldHzRtg = hzRtg;
		hzRtg = newHzRtg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.GROUP_T__HZ_RTG, oldHzRtg, hzRtg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getRat() {
		if (rat != null && rat.eIsProxy()) {
			InternalEObject oldRat = (InternalEObject)rat;
			rat = (ASG)eResolveProxy(oldRat);
			if (rat != oldRat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.GROUP_T__RAT, oldRat, rat));
			}
		}
		return rat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetRat() {
		return rat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRat(ASG newRat) {
		ASG oldRat = rat;
		rat = newRat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.GROUP_T__RAT, oldRat, rat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getCor() {
		if (cor != null && cor.eIsProxy()) {
			InternalEObject oldCor = (InternalEObject)cor;
			cor = (ASG)eResolveProxy(oldCor);
			if (cor != oldCor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.GROUP_T__COR, oldCor, cor));
			}
		}
		return cor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetCor() {
		return cor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCor(ASG newCor) {
		ASG oldCor = cor;
		cor = newCor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.GROUP_T__COR, oldCor, cor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG getAngCor() {
		if (angCor != null && angCor.eIsProxy()) {
			InternalEObject oldAngCor = (InternalEObject)angCor;
			angCor = (ASG)eResolveProxy(oldAngCor);
			if (angCor != oldAngCor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LNGroupTPackage.GROUP_T__ANG_COR, oldAngCor, angCor));
			}
		}
		return angCor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG basicGetAngCor() {
		return angCor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngCor(ASG newAngCor) {
		ASG oldAngCor = angCor;
		angCor = newAngCor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LNGroupTPackage.GROUP_T__ANG_COR, oldAngCor, angCor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LNGroupTPackage.GROUP_T__EE_NAME:
				if (resolve) return getEEName();
				return basicGetEEName();
			case LNGroupTPackage.GROUP_T__EE_HEALTH:
				return getEEHealth();
			case LNGroupTPackage.GROUP_T__OP_TMH:
				if (resolve) return getOpTmh();
				return basicGetOpTmh();
			case LNGroupTPackage.GROUP_T__HZ_RTG:
				if (resolve) return getHzRtg();
				return basicGetHzRtg();
			case LNGroupTPackage.GROUP_T__RAT:
				if (resolve) return getRat();
				return basicGetRat();
			case LNGroupTPackage.GROUP_T__COR:
				if (resolve) return getCor();
				return basicGetCor();
			case LNGroupTPackage.GROUP_T__ANG_COR:
				if (resolve) return getAngCor();
				return basicGetAngCor();
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
			case LNGroupTPackage.GROUP_T__EE_NAME:
				setEEName((DPL)newValue);
				return;
			case LNGroupTPackage.GROUP_T__EE_HEALTH:
				setEEHealth((HealthStateKind)newValue);
				return;
			case LNGroupTPackage.GROUP_T__OP_TMH:
				setOpTmh((INS)newValue);
				return;
			case LNGroupTPackage.GROUP_T__HZ_RTG:
				setHzRtg((ASG)newValue);
				return;
			case LNGroupTPackage.GROUP_T__RAT:
				setRat((ASG)newValue);
				return;
			case LNGroupTPackage.GROUP_T__COR:
				setCor((ASG)newValue);
				return;
			case LNGroupTPackage.GROUP_T__ANG_COR:
				setAngCor((ASG)newValue);
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
			case LNGroupTPackage.GROUP_T__EE_NAME:
				setEEName((DPL)null);
				return;
			case LNGroupTPackage.GROUP_T__EE_HEALTH:
				setEEHealth(EE_HEALTH_EDEFAULT);
				return;
			case LNGroupTPackage.GROUP_T__OP_TMH:
				setOpTmh((INS)null);
				return;
			case LNGroupTPackage.GROUP_T__HZ_RTG:
				setHzRtg((ASG)null);
				return;
			case LNGroupTPackage.GROUP_T__RAT:
				setRat((ASG)null);
				return;
			case LNGroupTPackage.GROUP_T__COR:
				setCor((ASG)null);
				return;
			case LNGroupTPackage.GROUP_T__ANG_COR:
				setAngCor((ASG)null);
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
			case LNGroupTPackage.GROUP_T__EE_NAME:
				return eeName != null;
			case LNGroupTPackage.GROUP_T__EE_HEALTH:
				return eeHealth != EE_HEALTH_EDEFAULT;
			case LNGroupTPackage.GROUP_T__OP_TMH:
				return opTmh != null;
			case LNGroupTPackage.GROUP_T__HZ_RTG:
				return hzRtg != null;
			case LNGroupTPackage.GROUP_T__RAT:
				return rat != null;
			case LNGroupTPackage.GROUP_T__COR:
				return cor != null;
			case LNGroupTPackage.GROUP_T__ANG_COR:
				return angCor != null;
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

} //GroupTImpl
