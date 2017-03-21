/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electricity Related Status Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_missing_voltage <em>Status information missing voltage</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_missing_current <em>Status information missing current</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_current_without_voltage <em>Status information current without voltage</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_auxiliary_power_supply <em>Status information auxiliary power supply</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityRelatedStatusData()
 * @model
 * @generated
 */
public interface ElectricityRelatedStatusData extends Data {
	/**
	 * Returns the value of the '<em><b>Status information missing voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status information missing voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status information missing voltage</em>' attribute.
	 * @see #setStatus_information_missing_voltage(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityRelatedStatusData_Status_information_missing_voltage()
	 * @model
	 * @generated
	 */
	String getStatus_information_missing_voltage();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_missing_voltage <em>Status information missing voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status information missing voltage</em>' attribute.
	 * @see #getStatus_information_missing_voltage()
	 * @generated
	 */
	void setStatus_information_missing_voltage(String value);

	/**
	 * Returns the value of the '<em><b>Status information missing current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status information missing current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status information missing current</em>' attribute.
	 * @see #setStatus_information_missing_current(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityRelatedStatusData_Status_information_missing_current()
	 * @model
	 * @generated
	 */
	String getStatus_information_missing_current();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_missing_current <em>Status information missing current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status information missing current</em>' attribute.
	 * @see #getStatus_information_missing_current()
	 * @generated
	 */
	void setStatus_information_missing_current(String value);

	/**
	 * Returns the value of the '<em><b>Status information current without voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status information current without voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status information current without voltage</em>' attribute.
	 * @see #setStatus_information_current_without_voltage(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityRelatedStatusData_Status_information_current_without_voltage()
	 * @model
	 * @generated
	 */
	String getStatus_information_current_without_voltage();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_current_without_voltage <em>Status information current without voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status information current without voltage</em>' attribute.
	 * @see #getStatus_information_current_without_voltage()
	 * @generated
	 */
	void setStatus_information_current_without_voltage(String value);

	/**
	 * Returns the value of the '<em><b>Status information auxiliary power supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status information auxiliary power supply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status information auxiliary power supply</em>' attribute.
	 * @see #setStatus_information_auxiliary_power_supply(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityRelatedStatusData_Status_information_auxiliary_power_supply()
	 * @model
	 * @generated
	 */
	String getStatus_information_auxiliary_power_supply();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_auxiliary_power_supply <em>Status information auxiliary power supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status information auxiliary power supply</em>' attribute.
	 * @see #getStatus_information_auxiliary_power_supply()
	 * @generated
	 */
	void setStatus_information_auxiliary_power_supply(String value);

} // ElectricityRelatedStatusData
