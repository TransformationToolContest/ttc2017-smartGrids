/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_use_time_counter <em>Battery use time counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_charge_display <em>Battery charge display</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getDate_of_next_battery_change <em>Date of next battery change</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_voltage <em>Battery voltage</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_initial_capacity <em>Battery initial capacity</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_installation_date_and_time <em>Battery installation date and time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_estimated_remaining_use_time <em>Battery estimated remaining use time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getAux_supply_use_time_counter <em>Aux supply use time counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getAux_voltage <em>Aux voltage</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries()
 * @model
 * @generated
 */
public interface BatteryEntries extends Data {
	/**
	 * Returns the value of the '<em><b>Battery use time counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery use time counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery use time counter</em>' attribute.
	 * @see #setBattery_use_time_counter(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Battery_use_time_counter()
	 * @model
	 * @generated
	 */
	int getBattery_use_time_counter();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_use_time_counter <em>Battery use time counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery use time counter</em>' attribute.
	 * @see #getBattery_use_time_counter()
	 * @generated
	 */
	void setBattery_use_time_counter(int value);

	/**
	 * Returns the value of the '<em><b>Battery charge display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery charge display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery charge display</em>' attribute.
	 * @see #setBattery_charge_display(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Battery_charge_display()
	 * @model
	 * @generated
	 */
	String getBattery_charge_display();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_charge_display <em>Battery charge display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery charge display</em>' attribute.
	 * @see #getBattery_charge_display()
	 * @generated
	 */
	void setBattery_charge_display(String value);

	/**
	 * Returns the value of the '<em><b>Date of next battery change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date of next battery change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date of next battery change</em>' attribute.
	 * @see #setDate_of_next_battery_change(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Date_of_next_battery_change()
	 * @model
	 * @generated
	 */
	String getDate_of_next_battery_change();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getDate_of_next_battery_change <em>Date of next battery change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date of next battery change</em>' attribute.
	 * @see #getDate_of_next_battery_change()
	 * @generated
	 */
	void setDate_of_next_battery_change(String value);

	/**
	 * Returns the value of the '<em><b>Battery voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery voltage</em>' attribute.
	 * @see #setBattery_voltage(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Battery_voltage()
	 * @model
	 * @generated
	 */
	double getBattery_voltage();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_voltage <em>Battery voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery voltage</em>' attribute.
	 * @see #getBattery_voltage()
	 * @generated
	 */
	void setBattery_voltage(double value);

	/**
	 * Returns the value of the '<em><b>Battery initial capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery initial capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery initial capacity</em>' attribute.
	 * @see #setBattery_initial_capacity(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Battery_initial_capacity()
	 * @model
	 * @generated
	 */
	double getBattery_initial_capacity();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_initial_capacity <em>Battery initial capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery initial capacity</em>' attribute.
	 * @see #getBattery_initial_capacity()
	 * @generated
	 */
	void setBattery_initial_capacity(double value);

	/**
	 * Returns the value of the '<em><b>Battery installation date and time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery installation date and time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery installation date and time</em>' attribute.
	 * @see #setBattery_installation_date_and_time(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Battery_installation_date_and_time()
	 * @model
	 * @generated
	 */
	String getBattery_installation_date_and_time();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_installation_date_and_time <em>Battery installation date and time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery installation date and time</em>' attribute.
	 * @see #getBattery_installation_date_and_time()
	 * @generated
	 */
	void setBattery_installation_date_and_time(String value);

	/**
	 * Returns the value of the '<em><b>Battery estimated remaining use time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery estimated remaining use time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery estimated remaining use time</em>' attribute.
	 * @see #setBattery_estimated_remaining_use_time(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Battery_estimated_remaining_use_time()
	 * @model
	 * @generated
	 */
	String getBattery_estimated_remaining_use_time();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_estimated_remaining_use_time <em>Battery estimated remaining use time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery estimated remaining use time</em>' attribute.
	 * @see #getBattery_estimated_remaining_use_time()
	 * @generated
	 */
	void setBattery_estimated_remaining_use_time(String value);

	/**
	 * Returns the value of the '<em><b>Aux supply use time counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux supply use time counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux supply use time counter</em>' attribute.
	 * @see #setAux_supply_use_time_counter(int)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Aux_supply_use_time_counter()
	 * @model
	 * @generated
	 */
	int getAux_supply_use_time_counter();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getAux_supply_use_time_counter <em>Aux supply use time counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux supply use time counter</em>' attribute.
	 * @see #getAux_supply_use_time_counter()
	 * @generated
	 */
	void setAux_supply_use_time_counter(int value);

	/**
	 * Returns the value of the '<em><b>Aux voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux voltage</em>' attribute.
	 * @see #setAux_voltage(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getBatteryEntries_Aux_voltage()
	 * @model
	 * @generated
	 */
	double getAux_voltage();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getAux_voltage <em>Aux voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux voltage</em>' attribute.
	 * @see #getAux_voltage()
	 * @generated
	 */
	void setAux_voltage(double value);

} // BatteryEntries
