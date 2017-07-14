/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electricity Nominal Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getNominalcurrent <em>Nominalcurrent</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getMaximumcurrent <em>Maximumcurrent</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getReference_voltage_for_power_quality_measurement <em>Reference voltage for power quality measurement</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getReference_voltage_for_aux_power_supply <em>Reference voltage for aux power supply</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityNominalValues()
 * @model
 * @generated
 */
public interface ElectricityNominalValues extends Data {
	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityNominalValues_Voltage()
	 * @model
	 * @generated
	 */
	double getVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Nominalcurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominalcurrent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominalcurrent</em>' attribute.
	 * @see #setNominalcurrent(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityNominalValues_Nominalcurrent()
	 * @model
	 * @generated
	 */
	double getNominalcurrent();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getNominalcurrent <em>Nominalcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominalcurrent</em>' attribute.
	 * @see #getNominalcurrent()
	 * @generated
	 */
	void setNominalcurrent(double value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityNominalValues_Frequency()
	 * @model
	 * @generated
	 */
	double getFrequency();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(double value);

	/**
	 * Returns the value of the '<em><b>Maximumcurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximumcurrent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximumcurrent</em>' attribute.
	 * @see #setMaximumcurrent(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityNominalValues_Maximumcurrent()
	 * @model
	 * @generated
	 */
	double getMaximumcurrent();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getMaximumcurrent <em>Maximumcurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximumcurrent</em>' attribute.
	 * @see #getMaximumcurrent()
	 * @generated
	 */
	void setMaximumcurrent(double value);

	/**
	 * Returns the value of the '<em><b>Reference voltage for power quality measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference voltage for power quality measurement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference voltage for power quality measurement</em>' attribute.
	 * @see #setReference_voltage_for_power_quality_measurement(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityNominalValues_Reference_voltage_for_power_quality_measurement()
	 * @model
	 * @generated
	 */
	double getReference_voltage_for_power_quality_measurement();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getReference_voltage_for_power_quality_measurement <em>Reference voltage for power quality measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference voltage for power quality measurement</em>' attribute.
	 * @see #getReference_voltage_for_power_quality_measurement()
	 * @generated
	 */
	void setReference_voltage_for_power_quality_measurement(double value);

	/**
	 * Returns the value of the '<em><b>Reference voltage for aux power supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference voltage for aux power supply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference voltage for aux power supply</em>' attribute.
	 * @see #setReference_voltage_for_aux_power_supply(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityNominalValues_Reference_voltage_for_aux_power_supply()
	 * @model
	 * @generated
	 */
	double getReference_voltage_for_aux_power_supply();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getReference_voltage_for_aux_power_supply <em>Reference voltage for aux power supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference voltage for aux power supply</em>' attribute.
	 * @see #getReference_voltage_for_aux_power_supply()
	 * @generated
	 */
	void setReference_voltage_for_aux_power_supply(double value);

} // ElectricityNominalValues
