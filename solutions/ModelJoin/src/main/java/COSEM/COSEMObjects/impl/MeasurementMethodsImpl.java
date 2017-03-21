/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.MeasurementMethods;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Methods</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementMethodsImpl#getAlgorithm_for_active_power_measurement <em>Algorithm for active power measurement</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementMethodsImpl#getAlgorithm_for_active_energy_management <em>Algorithm for active energy management</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementMethodsImpl#getAlgorithm_for_reactive_power_measurement <em>Algorithm for reactive power measurement</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementMethodsImpl#getAlgorithm_for_reactive_energy_measurement <em>Algorithm for reactive energy measurement</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementMethodsImpl#getAlgorithm_for_apparent_power_measurement <em>Algorithm for apparent power measurement</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementMethodsImpl#getAlgorithm_for_apparent_energy_measurement <em>Algorithm for apparent energy measurement</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementMethodsImpl#getAlgorithm_for_power_factor_calculation <em>Algorithm for power factor calculation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementMethodsImpl extends DataImpl implements MeasurementMethods {
	/**
	 * The default value of the '{@link #getAlgorithm_for_active_power_measurement() <em>Algorithm for active power measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_active_power_measurement()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm_for_active_power_measurement() <em>Algorithm for active power measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_active_power_measurement()
	 * @generated
	 * @ordered
	 */
	protected String algorithm_for_active_power_measurement = ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm_for_active_energy_management() <em>Algorithm for active energy management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_active_energy_management()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm_for_active_energy_management() <em>Algorithm for active energy management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_active_energy_management()
	 * @generated
	 * @ordered
	 */
	protected String algorithm_for_active_energy_management = ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm_for_reactive_power_measurement() <em>Algorithm for reactive power measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_reactive_power_measurement()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm_for_reactive_power_measurement() <em>Algorithm for reactive power measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_reactive_power_measurement()
	 * @generated
	 * @ordered
	 */
	protected String algorithm_for_reactive_power_measurement = ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm_for_reactive_energy_measurement() <em>Algorithm for reactive energy measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_reactive_energy_measurement()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm_for_reactive_energy_measurement() <em>Algorithm for reactive energy measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_reactive_energy_measurement()
	 * @generated
	 * @ordered
	 */
	protected String algorithm_for_reactive_energy_measurement = ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm_for_apparent_power_measurement() <em>Algorithm for apparent power measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_apparent_power_measurement()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm_for_apparent_power_measurement() <em>Algorithm for apparent power measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_apparent_power_measurement()
	 * @generated
	 * @ordered
	 */
	protected String algorithm_for_apparent_power_measurement = ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm_for_apparent_energy_measurement() <em>Algorithm for apparent energy measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_apparent_energy_measurement()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm_for_apparent_energy_measurement() <em>Algorithm for apparent energy measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_apparent_energy_measurement()
	 * @generated
	 * @ordered
	 */
	protected String algorithm_for_apparent_energy_measurement = ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm_for_power_factor_calculation() <em>Algorithm for power factor calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_power_factor_calculation()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_FOR_POWER_FACTOR_CALCULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm_for_power_factor_calculation() <em>Algorithm for power factor calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm_for_power_factor_calculation()
	 * @generated
	 * @ordered
	 */
	protected String algorithm_for_power_factor_calculation = ALGORITHM_FOR_POWER_FACTOR_CALCULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementMethodsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getMeasurementMethods();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm_for_active_power_measurement() {
		return algorithm_for_active_power_measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm_for_active_power_measurement(String newAlgorithm_for_active_power_measurement) {
		String oldAlgorithm_for_active_power_measurement = algorithm_for_active_power_measurement;
		algorithm_for_active_power_measurement = newAlgorithm_for_active_power_measurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT, oldAlgorithm_for_active_power_measurement, algorithm_for_active_power_measurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm_for_active_energy_management() {
		return algorithm_for_active_energy_management;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm_for_active_energy_management(String newAlgorithm_for_active_energy_management) {
		String oldAlgorithm_for_active_energy_management = algorithm_for_active_energy_management;
		algorithm_for_active_energy_management = newAlgorithm_for_active_energy_management;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT, oldAlgorithm_for_active_energy_management, algorithm_for_active_energy_management));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm_for_reactive_power_measurement() {
		return algorithm_for_reactive_power_measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm_for_reactive_power_measurement(String newAlgorithm_for_reactive_power_measurement) {
		String oldAlgorithm_for_reactive_power_measurement = algorithm_for_reactive_power_measurement;
		algorithm_for_reactive_power_measurement = newAlgorithm_for_reactive_power_measurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT, oldAlgorithm_for_reactive_power_measurement, algorithm_for_reactive_power_measurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm_for_reactive_energy_measurement() {
		return algorithm_for_reactive_energy_measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm_for_reactive_energy_measurement(String newAlgorithm_for_reactive_energy_measurement) {
		String oldAlgorithm_for_reactive_energy_measurement = algorithm_for_reactive_energy_measurement;
		algorithm_for_reactive_energy_measurement = newAlgorithm_for_reactive_energy_measurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT, oldAlgorithm_for_reactive_energy_measurement, algorithm_for_reactive_energy_measurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm_for_apparent_power_measurement() {
		return algorithm_for_apparent_power_measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm_for_apparent_power_measurement(String newAlgorithm_for_apparent_power_measurement) {
		String oldAlgorithm_for_apparent_power_measurement = algorithm_for_apparent_power_measurement;
		algorithm_for_apparent_power_measurement = newAlgorithm_for_apparent_power_measurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT, oldAlgorithm_for_apparent_power_measurement, algorithm_for_apparent_power_measurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm_for_apparent_energy_measurement() {
		return algorithm_for_apparent_energy_measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm_for_apparent_energy_measurement(String newAlgorithm_for_apparent_energy_measurement) {
		String oldAlgorithm_for_apparent_energy_measurement = algorithm_for_apparent_energy_measurement;
		algorithm_for_apparent_energy_measurement = newAlgorithm_for_apparent_energy_measurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT, oldAlgorithm_for_apparent_energy_measurement, algorithm_for_apparent_energy_measurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm_for_power_factor_calculation() {
		return algorithm_for_power_factor_calculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm_for_power_factor_calculation(String newAlgorithm_for_power_factor_calculation) {
		String oldAlgorithm_for_power_factor_calculation = algorithm_for_power_factor_calculation;
		algorithm_for_power_factor_calculation = newAlgorithm_for_power_factor_calculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_POWER_FACTOR_CALCULATION, oldAlgorithm_for_power_factor_calculation, algorithm_for_power_factor_calculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT:
				return getAlgorithm_for_active_power_measurement();
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT:
				return getAlgorithm_for_active_energy_management();
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT:
				return getAlgorithm_for_reactive_power_measurement();
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT:
				return getAlgorithm_for_reactive_energy_measurement();
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT:
				return getAlgorithm_for_apparent_power_measurement();
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT:
				return getAlgorithm_for_apparent_energy_measurement();
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_POWER_FACTOR_CALCULATION:
				return getAlgorithm_for_power_factor_calculation();
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
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT:
				setAlgorithm_for_active_power_measurement((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT:
				setAlgorithm_for_active_energy_management((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT:
				setAlgorithm_for_reactive_power_measurement((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT:
				setAlgorithm_for_reactive_energy_measurement((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT:
				setAlgorithm_for_apparent_power_measurement((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT:
				setAlgorithm_for_apparent_energy_measurement((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_POWER_FACTOR_CALCULATION:
				setAlgorithm_for_power_factor_calculation((String)newValue);
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
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT:
				setAlgorithm_for_active_power_measurement(ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT:
				setAlgorithm_for_active_energy_management(ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT:
				setAlgorithm_for_reactive_power_measurement(ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT:
				setAlgorithm_for_reactive_energy_measurement(ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT:
				setAlgorithm_for_apparent_power_measurement(ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT:
				setAlgorithm_for_apparent_energy_measurement(ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_POWER_FACTOR_CALCULATION:
				setAlgorithm_for_power_factor_calculation(ALGORITHM_FOR_POWER_FACTOR_CALCULATION_EDEFAULT);
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
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT:
				return ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT_EDEFAULT == null ? algorithm_for_active_power_measurement != null : !ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT_EDEFAULT.equals(algorithm_for_active_power_measurement);
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT:
				return ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT_EDEFAULT == null ? algorithm_for_active_energy_management != null : !ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT_EDEFAULT.equals(algorithm_for_active_energy_management);
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT:
				return ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT_EDEFAULT == null ? algorithm_for_reactive_power_measurement != null : !ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT_EDEFAULT.equals(algorithm_for_reactive_power_measurement);
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT:
				return ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT_EDEFAULT == null ? algorithm_for_reactive_energy_measurement != null : !ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT_EDEFAULT.equals(algorithm_for_reactive_energy_measurement);
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT:
				return ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT_EDEFAULT == null ? algorithm_for_apparent_power_measurement != null : !ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT_EDEFAULT.equals(algorithm_for_apparent_power_measurement);
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT:
				return ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT_EDEFAULT == null ? algorithm_for_apparent_energy_measurement != null : !ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT_EDEFAULT.equals(algorithm_for_apparent_energy_measurement);
			case COSEMObjectsPackage.MEASUREMENT_METHODS__ALGORITHM_FOR_POWER_FACTOR_CALCULATION:
				return ALGORITHM_FOR_POWER_FACTOR_CALCULATION_EDEFAULT == null ? algorithm_for_power_factor_calculation != null : !ALGORITHM_FOR_POWER_FACTOR_CALCULATION_EDEFAULT.equals(algorithm_for_power_factor_calculation);
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
		result.append(" (Algorithm_for_active_power_measurement: ");
		result.append(algorithm_for_active_power_measurement);
		result.append(", Algorithm_for_active_energy_management: ");
		result.append(algorithm_for_active_energy_management);
		result.append(", Algorithm_for_reactive_power_measurement: ");
		result.append(algorithm_for_reactive_power_measurement);
		result.append(", Algorithm_for_reactive_energy_measurement: ");
		result.append(algorithm_for_reactive_energy_measurement);
		result.append(", Algorithm_for_apparent_power_measurement: ");
		result.append(algorithm_for_apparent_power_measurement);
		result.append(", Algorithm_for_apparent_energy_measurement: ");
		result.append(algorithm_for_apparent_energy_measurement);
		result.append(", Algorithm_for_power_factor_calculation: ");
		result.append(algorithm_for_power_factor_calculation);
		result.append(')');
		return result.toString();
	}

} //MeasurementMethodsImpl
