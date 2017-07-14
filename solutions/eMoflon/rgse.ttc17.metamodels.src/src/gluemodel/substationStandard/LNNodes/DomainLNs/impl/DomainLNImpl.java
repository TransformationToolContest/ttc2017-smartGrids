/**
 */
package gluemodel.substationStandard.LNNodes.DomainLNs.impl;

import gluemodel.substationStandard.Dataclasses.INC;
import gluemodel.substationStandard.Dataclasses.INS;
import gluemodel.substationStandard.Dataclasses.LPL;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN;
import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLNsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl#getHealth <em>Health</em>}</li>
 *   <li>{@link gluemodel.substationStandard.LNNodes.DomainLNs.impl.DomainLNImpl#getNamePlt <em>Name Plt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainLNImpl extends MinimalEObjectImpl.Container implements DomainLN {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected INC mode;

	/**
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected INS behaviour;

	/**
	 * The cached value of the '{@link #getHealth() <em>Health</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth()
	 * @generated
	 * @ordered
	 */
	protected INS health;

	/**
	 * The cached value of the '{@link #getNamePlt() <em>Name Plt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePlt()
	 * @generated
	 * @ordered
	 */
	protected LPL namePlt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainLNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainLNsPackage.Literals.DOMAIN_LN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (INC)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainLNsPackage.DOMAIN_LN__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(INC newMode) {
		INC oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainLNsPackage.DOMAIN_LN__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getBehaviour() {
		if (behaviour != null && behaviour.eIsProxy()) {
			InternalEObject oldBehaviour = (InternalEObject)behaviour;
			behaviour = (INS)eResolveProxy(oldBehaviour);
			if (behaviour != oldBehaviour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainLNsPackage.DOMAIN_LN__BEHAVIOUR, oldBehaviour, behaviour));
			}
		}
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetBehaviour() {
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviour(INS newBehaviour) {
		INS oldBehaviour = behaviour;
		behaviour = newBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainLNsPackage.DOMAIN_LN__BEHAVIOUR, oldBehaviour, behaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS getHealth() {
		if (health != null && health.eIsProxy()) {
			InternalEObject oldHealth = (InternalEObject)health;
			health = (INS)eResolveProxy(oldHealth);
			if (health != oldHealth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainLNsPackage.DOMAIN_LN__HEALTH, oldHealth, health));
			}
		}
		return health;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS basicGetHealth() {
		return health;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealth(INS newHealth) {
		INS oldHealth = health;
		health = newHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainLNsPackage.DOMAIN_LN__HEALTH, oldHealth, health));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPL getNamePlt() {
		if (namePlt != null && namePlt.eIsProxy()) {
			InternalEObject oldNamePlt = (InternalEObject)namePlt;
			namePlt = (LPL)eResolveProxy(oldNamePlt);
			if (namePlt != oldNamePlt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainLNsPackage.DOMAIN_LN__NAME_PLT, oldNamePlt, namePlt));
			}
		}
		return namePlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPL basicGetNamePlt() {
		return namePlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePlt(LPL newNamePlt) {
		LPL oldNamePlt = namePlt;
		namePlt = newNamePlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainLNsPackage.DOMAIN_LN__NAME_PLT, oldNamePlt, namePlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainLNsPackage.DOMAIN_LN__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case DomainLNsPackage.DOMAIN_LN__BEHAVIOUR:
				if (resolve) return getBehaviour();
				return basicGetBehaviour();
			case DomainLNsPackage.DOMAIN_LN__HEALTH:
				if (resolve) return getHealth();
				return basicGetHealth();
			case DomainLNsPackage.DOMAIN_LN__NAME_PLT:
				if (resolve) return getNamePlt();
				return basicGetNamePlt();
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
			case DomainLNsPackage.DOMAIN_LN__MODE:
				setMode((INC)newValue);
				return;
			case DomainLNsPackage.DOMAIN_LN__BEHAVIOUR:
				setBehaviour((INS)newValue);
				return;
			case DomainLNsPackage.DOMAIN_LN__HEALTH:
				setHealth((INS)newValue);
				return;
			case DomainLNsPackage.DOMAIN_LN__NAME_PLT:
				setNamePlt((LPL)newValue);
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
			case DomainLNsPackage.DOMAIN_LN__MODE:
				setMode((INC)null);
				return;
			case DomainLNsPackage.DOMAIN_LN__BEHAVIOUR:
				setBehaviour((INS)null);
				return;
			case DomainLNsPackage.DOMAIN_LN__HEALTH:
				setHealth((INS)null);
				return;
			case DomainLNsPackage.DOMAIN_LN__NAME_PLT:
				setNamePlt((LPL)null);
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
			case DomainLNsPackage.DOMAIN_LN__MODE:
				return mode != null;
			case DomainLNsPackage.DOMAIN_LN__BEHAVIOUR:
				return behaviour != null;
			case DomainLNsPackage.DOMAIN_LN__HEALTH:
				return health != null;
			case DomainLNsPackage.DOMAIN_LN__NAME_PLT:
				return namePlt != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainLNImpl
