/**
 */
package gluemodel.CIM.IEC61970.Equivalents.impl;

import gluemodel.CIM.IEC61970.Equivalents.EquivalentInjection;
import gluemodel.CIM.IEC61970.Equivalents.EquivalentsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Injection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl#isRegulationStatus <em>Regulation Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl#isRegulationCapability <em>Regulation Capability</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl#getMinP <em>Min P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl#getMaxP <em>Max P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Equivalents.impl.EquivalentInjectionImpl#getRegulationTarget <em>Regulation Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentInjectionImpl extends EquivalentEquipmentImpl implements EquivalentInjection {
	/**
	 * The default value of the '{@link #isRegulationStatus() <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGULATION_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegulationStatus() <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean regulationStatus = REGULATION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegulationCapability() <em>Regulation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationCapability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGULATION_CAPABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegulationCapability() <em>Regulation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationCapability()
	 * @generated
	 * @ordered
	 */
	protected boolean regulationCapability = REGULATION_CAPABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected float minP = MIN_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected float maxP = MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegulationTarget() <em>Regulation Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationTarget()
	 * @generated
	 * @ordered
	 */
	protected static final float REGULATION_TARGET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRegulationTarget() <em>Regulation Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationTarget()
	 * @generated
	 * @ordered
	 */
	protected float regulationTarget = REGULATION_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentInjectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquivalentsPackage.Literals.EQUIVALENT_INJECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegulationStatus() {
		return regulationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulationStatus(boolean newRegulationStatus) {
		boolean oldRegulationStatus = regulationStatus;
		regulationStatus = newRegulationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS, oldRegulationStatus, regulationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegulationCapability() {
		return regulationCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulationCapability(boolean newRegulationCapability) {
		boolean oldRegulationCapability = regulationCapability;
		regulationCapability = newRegulationCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY, oldRegulationCapability, regulationCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinP() {
		return minP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinP(float newMinP) {
		float oldMinP = minP;
		minP = newMinP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P, oldMinP, minP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxP() {
		return maxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxP(float newMaxP) {
		float oldMaxP = maxP;
		maxP = newMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P, oldMaxP, maxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRegulationTarget() {
		return regulationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulationTarget(float newRegulationTarget) {
		float oldRegulationTarget = regulationTarget;
		regulationTarget = newRegulationTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET, oldRegulationTarget, regulationTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
				return isRegulationStatus();
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
				return isRegulationCapability();
			case EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P:
				return getMinP();
			case EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P:
				return getMaxP();
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
				return getRegulationTarget();
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
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
				setRegulationStatus((Boolean)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
				setRegulationCapability((Boolean)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P:
				setMinP((Float)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P:
				setMaxP((Float)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
				setRegulationTarget((Float)newValue);
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
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
				setRegulationStatus(REGULATION_STATUS_EDEFAULT);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
				setRegulationCapability(REGULATION_CAPABILITY_EDEFAULT);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P:
				setMinP(MIN_P_EDEFAULT);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P:
				setMaxP(MAX_P_EDEFAULT);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
				setRegulationTarget(REGULATION_TARGET_EDEFAULT);
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
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
				return regulationStatus != REGULATION_STATUS_EDEFAULT;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
				return regulationCapability != REGULATION_CAPABILITY_EDEFAULT;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P:
				return minP != MIN_P_EDEFAULT;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P:
				return maxP != MAX_P_EDEFAULT;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
				return regulationTarget != REGULATION_TARGET_EDEFAULT;
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
		result.append(" (regulationStatus: ");
		result.append(regulationStatus);
		result.append(", regulationCapability: ");
		result.append(regulationCapability);
		result.append(", minP: ");
		result.append(minP);
		result.append(", maxP: ");
		result.append(maxP);
		result.append(", regulationTarget: ");
		result.append(regulationTarget);
		result.append(')');
		return result.toString();
	}

} //EquivalentInjectionImpl
