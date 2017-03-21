/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Temper Event Related Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_counter <em>Meter open event counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_timestamp <em>Meter open event timestamp</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_duration <em>Meter open event duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_cumulative_duration <em>Meter open event cumulative duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_counter <em>Terminal cover open event counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_time <em>Terminal cover open event time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_duration <em>Terminal cover open event duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_cumulative_duration <em>Terminal cover open event cumulative duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_counter <em>Tilt event counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_time <em>Tilt event time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_duration <em>Tilt event duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_cumulative_duration <em>Tilt event cumulative duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_counter <em>Strong DC magnetic field event counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_time <em>Strong DC magnetic field event time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_duration <em>Strong DC magnetic field event duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_cumulative_duration <em>Strong DC magnetic field event cumulative duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_counter <em>Supply control switch event counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_time <em>Supply control switch event time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_duration <em>Supply control switch event duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_cumulative_duration <em>Supply control switch event cumulative duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_counter <em>Metrology tamper event counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_time <em>Metrology tamper event time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_duration <em>Metrology tamper event duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_cumulative_duration <em>Metrology tamper event cumulative duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_counter <em>Communication tamper event counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_time <em>Communication tamper event time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_duration <em>Communication tamper event duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_cumulative_duration <em>Communication tamper event cumulative duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getManufacturer_specific <em>Manufacturer specific</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject()
 * @model
 * @generated
 */
public interface MeterTemperEventRelatedObject extends Data {
	/**
	 * Returns the value of the '<em><b>Meter open event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter open event counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter open event counter</em>' attribute.
	 * @see #setMeter_open_event_counter(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Meter_open_event_counter()
	 * @model
	 * @generated
	 */
	int getMeter_open_event_counter();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_counter <em>Meter open event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter open event counter</em>' attribute.
	 * @see #getMeter_open_event_counter()
	 * @generated
	 */
	void setMeter_open_event_counter(int value);

	/**
	 * Returns the value of the '<em><b>Meter open event timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter open event timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter open event timestamp</em>' attribute.
	 * @see #setMeter_open_event_timestamp(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Meter_open_event_timestamp()
	 * @model
	 * @generated
	 */
	String getMeter_open_event_timestamp();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_timestamp <em>Meter open event timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter open event timestamp</em>' attribute.
	 * @see #getMeter_open_event_timestamp()
	 * @generated
	 */
	void setMeter_open_event_timestamp(String value);

	/**
	 * Returns the value of the '<em><b>Meter open event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter open event duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter open event duration</em>' attribute.
	 * @see #setMeter_open_event_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Meter_open_event_duration()
	 * @model
	 * @generated
	 */
	int getMeter_open_event_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_duration <em>Meter open event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter open event duration</em>' attribute.
	 * @see #getMeter_open_event_duration()
	 * @generated
	 */
	void setMeter_open_event_duration(int value);

	/**
	 * Returns the value of the '<em><b>Meter open event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter open event cumulative duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter open event cumulative duration</em>' attribute.
	 * @see #setMeter_open_event_cumulative_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Meter_open_event_cumulative_duration()
	 * @model
	 * @generated
	 */
	int getMeter_open_event_cumulative_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_cumulative_duration <em>Meter open event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter open event cumulative duration</em>' attribute.
	 * @see #getMeter_open_event_cumulative_duration()
	 * @generated
	 */
	void setMeter_open_event_cumulative_duration(int value);

	/**
	 * Returns the value of the '<em><b>Terminal cover open event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal cover open event counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal cover open event counter</em>' attribute.
	 * @see #setTerminal_cover_open_event_counter(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Terminal_cover_open_event_counter()
	 * @model
	 * @generated
	 */
	int getTerminal_cover_open_event_counter();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_counter <em>Terminal cover open event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal cover open event counter</em>' attribute.
	 * @see #getTerminal_cover_open_event_counter()
	 * @generated
	 */
	void setTerminal_cover_open_event_counter(int value);

	/**
	 * Returns the value of the '<em><b>Terminal cover open event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal cover open event time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal cover open event time</em>' attribute.
	 * @see #setTerminal_cover_open_event_time(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Terminal_cover_open_event_time()
	 * @model
	 * @generated
	 */
	String getTerminal_cover_open_event_time();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_time <em>Terminal cover open event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal cover open event time</em>' attribute.
	 * @see #getTerminal_cover_open_event_time()
	 * @generated
	 */
	void setTerminal_cover_open_event_time(String value);

	/**
	 * Returns the value of the '<em><b>Terminal cover open event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal cover open event duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal cover open event duration</em>' attribute.
	 * @see #setTerminal_cover_open_event_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Terminal_cover_open_event_duration()
	 * @model
	 * @generated
	 */
	int getTerminal_cover_open_event_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_duration <em>Terminal cover open event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal cover open event duration</em>' attribute.
	 * @see #getTerminal_cover_open_event_duration()
	 * @generated
	 */
	void setTerminal_cover_open_event_duration(int value);

	/**
	 * Returns the value of the '<em><b>Terminal cover open event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal cover open event cumulative duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal cover open event cumulative duration</em>' attribute.
	 * @see #setTerminal_cover_open_event_cumulative_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Terminal_cover_open_event_cumulative_duration()
	 * @model
	 * @generated
	 */
	int getTerminal_cover_open_event_cumulative_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_cumulative_duration <em>Terminal cover open event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal cover open event cumulative duration</em>' attribute.
	 * @see #getTerminal_cover_open_event_cumulative_duration()
	 * @generated
	 */
	void setTerminal_cover_open_event_cumulative_duration(int value);

	/**
	 * Returns the value of the '<em><b>Tilt event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt event counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt event counter</em>' attribute.
	 * @see #setTilt_event_counter(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Tilt_event_counter()
	 * @model
	 * @generated
	 */
	int getTilt_event_counter();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_counter <em>Tilt event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt event counter</em>' attribute.
	 * @see #getTilt_event_counter()
	 * @generated
	 */
	void setTilt_event_counter(int value);

	/**
	 * Returns the value of the '<em><b>Tilt event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt event time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt event time</em>' attribute.
	 * @see #setTilt_event_time(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Tilt_event_time()
	 * @model
	 * @generated
	 */
	String getTilt_event_time();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_time <em>Tilt event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt event time</em>' attribute.
	 * @see #getTilt_event_time()
	 * @generated
	 */
	void setTilt_event_time(String value);

	/**
	 * Returns the value of the '<em><b>Tilt event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt event duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt event duration</em>' attribute.
	 * @see #setTilt_event_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Tilt_event_duration()
	 * @model
	 * @generated
	 */
	int getTilt_event_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_duration <em>Tilt event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt event duration</em>' attribute.
	 * @see #getTilt_event_duration()
	 * @generated
	 */
	void setTilt_event_duration(int value);

	/**
	 * Returns the value of the '<em><b>Tilt event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt event cumulative duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt event cumulative duration</em>' attribute.
	 * @see #setTilt_event_cumulative_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Tilt_event_cumulative_duration()
	 * @model
	 * @generated
	 */
	int getTilt_event_cumulative_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_cumulative_duration <em>Tilt event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt event cumulative duration</em>' attribute.
	 * @see #getTilt_event_cumulative_duration()
	 * @generated
	 */
	void setTilt_event_cumulative_duration(int value);

	/**
	 * Returns the value of the '<em><b>Strong DC magnetic field event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strong DC magnetic field event counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong DC magnetic field event counter</em>' attribute.
	 * @see #setStrong_DC_magnetic_field_event_counter(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_counter()
	 * @model
	 * @generated
	 */
	int getStrong_DC_magnetic_field_event_counter();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_counter <em>Strong DC magnetic field event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong DC magnetic field event counter</em>' attribute.
	 * @see #getStrong_DC_magnetic_field_event_counter()
	 * @generated
	 */
	void setStrong_DC_magnetic_field_event_counter(int value);

	/**
	 * Returns the value of the '<em><b>Strong DC magnetic field event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strong DC magnetic field event time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong DC magnetic field event time</em>' attribute.
	 * @see #setStrong_DC_magnetic_field_event_time(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_time()
	 * @model
	 * @generated
	 */
	String getStrong_DC_magnetic_field_event_time();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_time <em>Strong DC magnetic field event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong DC magnetic field event time</em>' attribute.
	 * @see #getStrong_DC_magnetic_field_event_time()
	 * @generated
	 */
	void setStrong_DC_magnetic_field_event_time(String value);

	/**
	 * Returns the value of the '<em><b>Strong DC magnetic field event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strong DC magnetic field event duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong DC magnetic field event duration</em>' attribute.
	 * @see #setStrong_DC_magnetic_field_event_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_duration()
	 * @model
	 * @generated
	 */
	int getStrong_DC_magnetic_field_event_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_duration <em>Strong DC magnetic field event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong DC magnetic field event duration</em>' attribute.
	 * @see #getStrong_DC_magnetic_field_event_duration()
	 * @generated
	 */
	void setStrong_DC_magnetic_field_event_duration(int value);

	/**
	 * Returns the value of the '<em><b>Strong DC magnetic field event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strong DC magnetic field event cumulative duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong DC magnetic field event cumulative duration</em>' attribute.
	 * @see #setStrong_DC_magnetic_field_event_cumulative_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_cumulative_duration()
	 * @model
	 * @generated
	 */
	int getStrong_DC_magnetic_field_event_cumulative_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_cumulative_duration <em>Strong DC magnetic field event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong DC magnetic field event cumulative duration</em>' attribute.
	 * @see #getStrong_DC_magnetic_field_event_cumulative_duration()
	 * @generated
	 */
	void setStrong_DC_magnetic_field_event_cumulative_duration(int value);

	/**
	 * Returns the value of the '<em><b>Supply control switch event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply control switch event counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply control switch event counter</em>' attribute.
	 * @see #setSupply_control_switch_event_counter(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Supply_control_switch_event_counter()
	 * @model
	 * @generated
	 */
	int getSupply_control_switch_event_counter();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_counter <em>Supply control switch event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply control switch event counter</em>' attribute.
	 * @see #getSupply_control_switch_event_counter()
	 * @generated
	 */
	void setSupply_control_switch_event_counter(int value);

	/**
	 * Returns the value of the '<em><b>Supply control switch event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply control switch event time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply control switch event time</em>' attribute.
	 * @see #setSupply_control_switch_event_time(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Supply_control_switch_event_time()
	 * @model
	 * @generated
	 */
	String getSupply_control_switch_event_time();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_time <em>Supply control switch event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply control switch event time</em>' attribute.
	 * @see #getSupply_control_switch_event_time()
	 * @generated
	 */
	void setSupply_control_switch_event_time(String value);

	/**
	 * Returns the value of the '<em><b>Supply control switch event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply control switch event duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply control switch event duration</em>' attribute.
	 * @see #setSupply_control_switch_event_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Supply_control_switch_event_duration()
	 * @model
	 * @generated
	 */
	int getSupply_control_switch_event_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_duration <em>Supply control switch event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply control switch event duration</em>' attribute.
	 * @see #getSupply_control_switch_event_duration()
	 * @generated
	 */
	void setSupply_control_switch_event_duration(int value);

	/**
	 * Returns the value of the '<em><b>Supply control switch event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supply control switch event cumulative duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supply control switch event cumulative duration</em>' attribute.
	 * @see #setSupply_control_switch_event_cumulative_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Supply_control_switch_event_cumulative_duration()
	 * @model
	 * @generated
	 */
	int getSupply_control_switch_event_cumulative_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_cumulative_duration <em>Supply control switch event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply control switch event cumulative duration</em>' attribute.
	 * @see #getSupply_control_switch_event_cumulative_duration()
	 * @generated
	 */
	void setSupply_control_switch_event_cumulative_duration(int value);

	/**
	 * Returns the value of the '<em><b>Metrology tamper event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrology tamper event counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrology tamper event counter</em>' attribute.
	 * @see #setMetrology_tamper_event_counter(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Metrology_tamper_event_counter()
	 * @model
	 * @generated
	 */
	int getMetrology_tamper_event_counter();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_counter <em>Metrology tamper event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrology tamper event counter</em>' attribute.
	 * @see #getMetrology_tamper_event_counter()
	 * @generated
	 */
	void setMetrology_tamper_event_counter(int value);

	/**
	 * Returns the value of the '<em><b>Metrology tamper event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrology tamper event time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrology tamper event time</em>' attribute.
	 * @see #setMetrology_tamper_event_time(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Metrology_tamper_event_time()
	 * @model
	 * @generated
	 */
	String getMetrology_tamper_event_time();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_time <em>Metrology tamper event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrology tamper event time</em>' attribute.
	 * @see #getMetrology_tamper_event_time()
	 * @generated
	 */
	void setMetrology_tamper_event_time(String value);

	/**
	 * Returns the value of the '<em><b>Metrology tamper event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrology tamper event duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrology tamper event duration</em>' attribute.
	 * @see #setMetrology_tamper_event_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Metrology_tamper_event_duration()
	 * @model
	 * @generated
	 */
	int getMetrology_tamper_event_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_duration <em>Metrology tamper event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrology tamper event duration</em>' attribute.
	 * @see #getMetrology_tamper_event_duration()
	 * @generated
	 */
	void setMetrology_tamper_event_duration(int value);

	/**
	 * Returns the value of the '<em><b>Metrology tamper event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrology tamper event cumulative duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrology tamper event cumulative duration</em>' attribute.
	 * @see #setMetrology_tamper_event_cumulative_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Metrology_tamper_event_cumulative_duration()
	 * @model
	 * @generated
	 */
	int getMetrology_tamper_event_cumulative_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_cumulative_duration <em>Metrology tamper event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrology tamper event cumulative duration</em>' attribute.
	 * @see #getMetrology_tamper_event_cumulative_duration()
	 * @generated
	 */
	void setMetrology_tamper_event_cumulative_duration(int value);

	/**
	 * Returns the value of the '<em><b>Communication tamper event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication tamper event counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication tamper event counter</em>' attribute.
	 * @see #setCommunication_tamper_event_counter(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Communication_tamper_event_counter()
	 * @model
	 * @generated
	 */
	int getCommunication_tamper_event_counter();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_counter <em>Communication tamper event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication tamper event counter</em>' attribute.
	 * @see #getCommunication_tamper_event_counter()
	 * @generated
	 */
	void setCommunication_tamper_event_counter(int value);

	/**
	 * Returns the value of the '<em><b>Communication tamper event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication tamper event time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication tamper event time</em>' attribute.
	 * @see #setCommunication_tamper_event_time(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Communication_tamper_event_time()
	 * @model
	 * @generated
	 */
	String getCommunication_tamper_event_time();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_time <em>Communication tamper event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication tamper event time</em>' attribute.
	 * @see #getCommunication_tamper_event_time()
	 * @generated
	 */
	void setCommunication_tamper_event_time(String value);

	/**
	 * Returns the value of the '<em><b>Communication tamper event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication tamper event duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication tamper event duration</em>' attribute.
	 * @see #setCommunication_tamper_event_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Communication_tamper_event_duration()
	 * @model
	 * @generated
	 */
	int getCommunication_tamper_event_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_duration <em>Communication tamper event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication tamper event duration</em>' attribute.
	 * @see #getCommunication_tamper_event_duration()
	 * @generated
	 */
	void setCommunication_tamper_event_duration(int value);

	/**
	 * Returns the value of the '<em><b>Communication tamper event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication tamper event cumulative duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication tamper event cumulative duration</em>' attribute.
	 * @see #setCommunication_tamper_event_cumulative_duration(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Communication_tamper_event_cumulative_duration()
	 * @model
	 * @generated
	 */
	int getCommunication_tamper_event_cumulative_duration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_cumulative_duration <em>Communication tamper event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication tamper event cumulative duration</em>' attribute.
	 * @see #getCommunication_tamper_event_cumulative_duration()
	 * @generated
	 */
	void setCommunication_tamper_event_cumulative_duration(int value);

	/**
	 * Returns the value of the '<em><b>Manufacturer specific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer specific</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer specific</em>' attribute.
	 * @see #setManufacturer_specific(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getMeterTemperEventRelatedObject_Manufacturer_specific()
	 * @model
	 * @generated
	 */
	String getManufacturer_specific();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.MeterTemperEventRelatedObject#getManufacturer_specific <em>Manufacturer specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer specific</em>' attribute.
	 * @see #getManufacturer_specific()
	 * @generated
	 */
	void setManufacturer_specific(String value);

} // MeterTemperEventRelatedObject
