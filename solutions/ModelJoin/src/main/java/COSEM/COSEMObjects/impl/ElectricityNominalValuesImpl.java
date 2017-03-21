/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ElectricityNominalValues;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electricity Nominal Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityNominalValuesImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityNominalValuesImpl#getNominalcurrent <em>Nominalcurrent</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityNominalValuesImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityNominalValuesImpl#getMaximumcurrent <em>Maximumcurrent</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityNominalValuesImpl#getReference_voltage_for_power_quality_measurement <em>Reference voltage for power quality measurement</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityNominalValuesImpl#getReference_voltage_for_aux_power_supply <em>Reference voltage for aux power supply</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricityNominalValuesImpl extends DataImpl implements ElectricityNominalValues {
	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected double voltage = VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalcurrent() <em>Nominalcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalcurrent()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINALCURRENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalcurrent() <em>Nominalcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalcurrent()
	 * @generated
	 * @ordered
	 */
	protected double nominalcurrent = NOMINALCURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final double FREQUENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected double frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumcurrent() <em>Maximumcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumcurrent()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUMCURRENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumcurrent() <em>Maximumcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumcurrent()
	 * @generated
	 * @ordered
	 */
	protected double maximumcurrent = MAXIMUMCURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference_voltage_for_power_quality_measurement() <em>Reference voltage for power quality measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_voltage_for_power_quality_measurement()
	 * @generated
	 * @ordered
	 */
	protected static final double REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReference_voltage_for_power_quality_measurement() <em>Reference voltage for power quality measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_voltage_for_power_quality_measurement()
	 * @generated
	 * @ordered
	 */
	protected double reference_voltage_for_power_quality_measurement = REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference_voltage_for_aux_power_supply() <em>Reference voltage for aux power supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_voltage_for_aux_power_supply()
	 * @generated
	 * @ordered
	 */
	protected static final double REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReference_voltage_for_aux_power_supply() <em>Reference voltage for aux power supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_voltage_for_aux_power_supply()
	 * @generated
	 * @ordered
	 */
	protected double reference_voltage_for_aux_power_supply = REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricityNominalValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getElectricityNominalValues();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(double newVoltage) {
		double oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__VOLTAGE, oldVoltage, voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalcurrent() {
		return nominalcurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalcurrent(double newNominalcurrent) {
		double oldNominalcurrent = nominalcurrent;
		nominalcurrent = newNominalcurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__NOMINALCURRENT, oldNominalcurrent, nominalcurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(double newFrequency) {
		double oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumcurrent() {
		return maximumcurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumcurrent(double newMaximumcurrent) {
		double oldMaximumcurrent = maximumcurrent;
		maximumcurrent = newMaximumcurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__MAXIMUMCURRENT, oldMaximumcurrent, maximumcurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReference_voltage_for_power_quality_measurement() {
		return reference_voltage_for_power_quality_measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference_voltage_for_power_quality_measurement(double newReference_voltage_for_power_quality_measurement) {
		double oldReference_voltage_for_power_quality_measurement = reference_voltage_for_power_quality_measurement;
		reference_voltage_for_power_quality_measurement = newReference_voltage_for_power_quality_measurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT, oldReference_voltage_for_power_quality_measurement, reference_voltage_for_power_quality_measurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReference_voltage_for_aux_power_supply() {
		return reference_voltage_for_aux_power_supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference_voltage_for_aux_power_supply(double newReference_voltage_for_aux_power_supply) {
		double oldReference_voltage_for_aux_power_supply = reference_voltage_for_aux_power_supply;
		reference_voltage_for_aux_power_supply = newReference_voltage_for_aux_power_supply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY, oldReference_voltage_for_aux_power_supply, reference_voltage_for_aux_power_supply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__VOLTAGE:
				return getVoltage();
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__NOMINALCURRENT:
				return getNominalcurrent();
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__FREQUENCY:
				return getFrequency();
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__MAXIMUMCURRENT:
				return getMaximumcurrent();
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT:
				return getReference_voltage_for_power_quality_measurement();
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY:
				return getReference_voltage_for_aux_power_supply();
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
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__VOLTAGE:
				setVoltage((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__NOMINALCURRENT:
				setNominalcurrent((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__FREQUENCY:
				setFrequency((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__MAXIMUMCURRENT:
				setMaximumcurrent((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT:
				setReference_voltage_for_power_quality_measurement((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY:
				setReference_voltage_for_aux_power_supply((Double)newValue);
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
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__VOLTAGE:
				setVoltage(VOLTAGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__NOMINALCURRENT:
				setNominalcurrent(NOMINALCURRENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__MAXIMUMCURRENT:
				setMaximumcurrent(MAXIMUMCURRENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT:
				setReference_voltage_for_power_quality_measurement(REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY:
				setReference_voltage_for_aux_power_supply(REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY_EDEFAULT);
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
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__VOLTAGE:
				return voltage != VOLTAGE_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__NOMINALCURRENT:
				return nominalcurrent != NOMINALCURRENT_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__MAXIMUMCURRENT:
				return maximumcurrent != MAXIMUMCURRENT_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT:
				return reference_voltage_for_power_quality_measurement != REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY:
				return reference_voltage_for_aux_power_supply != REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY_EDEFAULT;
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
		result.append(" (Voltage: ");
		result.append(voltage);
		result.append(", Nominalcurrent: ");
		result.append(nominalcurrent);
		result.append(", Frequency: ");
		result.append(frequency);
		result.append(", Maximumcurrent: ");
		result.append(maximumcurrent);
		result.append(", Reference_voltage_for_power_quality_measurement: ");
		result.append(reference_voltage_for_power_quality_measurement);
		result.append(", Reference_voltage_for_aux_power_supply: ");
		result.append(reference_voltage_for_aux_power_supply);
		result.append(')');
		return result.toString();
	}

} //ElectricityNominalValuesImpl
