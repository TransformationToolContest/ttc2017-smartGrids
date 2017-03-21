/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Changes Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getNumberConfigProgramChanges <em>Number Config Program Changes</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastConfigChange <em>Date Last Config Change</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastSwitchChange <em>Date Last Switch Change</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastRippleControlChange <em>Date Last Ripple Control Change</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getStatusSecuritySwitches <em>Status Security Switches</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastCalibration <em>Date Last Calibration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateNextConfig <em>Date Next Config</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateActivationPassivCalendar <em>Date Activation Passiv Calendar</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getNumberProtectedConfigChanges <em>Number Protected Config Changes</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastProtectedConfigChange <em>Date Last Protected Config Change</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastClockSynch <em>Date Last Clock Synch</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastFirmwareActivation <em>Date Last Firmware Activation</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject()
 * @model
 * @generated
 */
public interface ParameterChangesObject extends Data {
	/**
	 * Returns the value of the '<em><b>Number Config Program Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Config Program Changes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Config Program Changes</em>' attribute.
	 * @see #setNumberConfigProgramChanges(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_NumberConfigProgramChanges()
	 * @model
	 * @generated
	 */
	int getNumberConfigProgramChanges();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getNumberConfigProgramChanges <em>Number Config Program Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Config Program Changes</em>' attribute.
	 * @see #getNumberConfigProgramChanges()
	 * @generated
	 */
	void setNumberConfigProgramChanges(int value);

	/**
	 * Returns the value of the '<em><b>Date Last Config Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Config Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Config Change</em>' attribute.
	 * @see #setDateLastConfigChange(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateLastConfigChange()
	 * @model
	 * @generated
	 */
	Date getDateLastConfigChange();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastConfigChange <em>Date Last Config Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Config Change</em>' attribute.
	 * @see #getDateLastConfigChange()
	 * @generated
	 */
	void setDateLastConfigChange(Date value);

	/**
	 * Returns the value of the '<em><b>Date Last Switch Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Switch Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Switch Change</em>' attribute.
	 * @see #setDateLastSwitchChange(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateLastSwitchChange()
	 * @model
	 * @generated
	 */
	Date getDateLastSwitchChange();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastSwitchChange <em>Date Last Switch Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Switch Change</em>' attribute.
	 * @see #getDateLastSwitchChange()
	 * @generated
	 */
	void setDateLastSwitchChange(Date value);

	/**
	 * Returns the value of the '<em><b>Date Last Ripple Control Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Ripple Control Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Ripple Control Change</em>' attribute.
	 * @see #setDateLastRippleControlChange(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateLastRippleControlChange()
	 * @model
	 * @generated
	 */
	Date getDateLastRippleControlChange();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastRippleControlChange <em>Date Last Ripple Control Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Ripple Control Change</em>' attribute.
	 * @see #getDateLastRippleControlChange()
	 * @generated
	 */
	void setDateLastRippleControlChange(Date value);

	/**
	 * Returns the value of the '<em><b>Status Security Switches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Security Switches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Security Switches</em>' attribute.
	 * @see #setStatusSecuritySwitches(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_StatusSecuritySwitches()
	 * @model
	 * @generated
	 */
	String getStatusSecuritySwitches();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getStatusSecuritySwitches <em>Status Security Switches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Security Switches</em>' attribute.
	 * @see #getStatusSecuritySwitches()
	 * @generated
	 */
	void setStatusSecuritySwitches(String value);

	/**
	 * Returns the value of the '<em><b>Date Last Calibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Calibration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Calibration</em>' attribute.
	 * @see #setDateLastCalibration(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateLastCalibration()
	 * @model
	 * @generated
	 */
	Date getDateLastCalibration();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastCalibration <em>Date Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Calibration</em>' attribute.
	 * @see #getDateLastCalibration()
	 * @generated
	 */
	void setDateLastCalibration(Date value);

	/**
	 * Returns the value of the '<em><b>Date Next Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Next Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Next Config</em>' attribute.
	 * @see #setDateNextConfig(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateNextConfig()
	 * @model
	 * @generated
	 */
	Date getDateNextConfig();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateNextConfig <em>Date Next Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Next Config</em>' attribute.
	 * @see #getDateNextConfig()
	 * @generated
	 */
	void setDateNextConfig(Date value);

	/**
	 * Returns the value of the '<em><b>Date Activation Passiv Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Activation Passiv Calendar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Activation Passiv Calendar</em>' attribute.
	 * @see #setDateActivationPassivCalendar(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateActivationPassivCalendar()
	 * @model
	 * @generated
	 */
	Date getDateActivationPassivCalendar();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateActivationPassivCalendar <em>Date Activation Passiv Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Activation Passiv Calendar</em>' attribute.
	 * @see #getDateActivationPassivCalendar()
	 * @generated
	 */
	void setDateActivationPassivCalendar(Date value);

	/**
	 * Returns the value of the '<em><b>Number Protected Config Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Protected Config Changes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Protected Config Changes</em>' attribute.
	 * @see #setNumberProtectedConfigChanges(int)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_NumberProtectedConfigChanges()
	 * @model
	 * @generated
	 */
	int getNumberProtectedConfigChanges();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getNumberProtectedConfigChanges <em>Number Protected Config Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Protected Config Changes</em>' attribute.
	 * @see #getNumberProtectedConfigChanges()
	 * @generated
	 */
	void setNumberProtectedConfigChanges(int value);

	/**
	 * Returns the value of the '<em><b>Date Last Protected Config Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Protected Config Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Protected Config Change</em>' attribute.
	 * @see #setDateLastProtectedConfigChange(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateLastProtectedConfigChange()
	 * @model
	 * @generated
	 */
	Date getDateLastProtectedConfigChange();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastProtectedConfigChange <em>Date Last Protected Config Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Protected Config Change</em>' attribute.
	 * @see #getDateLastProtectedConfigChange()
	 * @generated
	 */
	void setDateLastProtectedConfigChange(Date value);

	/**
	 * Returns the value of the '<em><b>Date Last Clock Synch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Clock Synch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Clock Synch</em>' attribute.
	 * @see #setDateLastClockSynch(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateLastClockSynch()
	 * @model
	 * @generated
	 */
	Date getDateLastClockSynch();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastClockSynch <em>Date Last Clock Synch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Clock Synch</em>' attribute.
	 * @see #getDateLastClockSynch()
	 * @generated
	 */
	void setDateLastClockSynch(Date value);

	/**
	 * Returns the value of the '<em><b>Date Last Firmware Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Last Firmware Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Last Firmware Activation</em>' attribute.
	 * @see #setDateLastFirmwareActivation(Date)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getParameterChangesObject_DateLastFirmwareActivation()
	 * @model
	 * @generated
	 */
	Date getDateLastFirmwareActivation();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ParameterChangesObject#getDateLastFirmwareActivation <em>Date Last Firmware Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Last Firmware Activation</em>' attribute.
	 * @see #getDateLastFirmwareActivation()
	 * @generated
	 */
	void setDateLastFirmwareActivation(Date value);

} // ParameterChangesObject
