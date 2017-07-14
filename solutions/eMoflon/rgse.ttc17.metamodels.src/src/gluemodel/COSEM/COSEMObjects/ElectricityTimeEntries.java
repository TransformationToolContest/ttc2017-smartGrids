/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electricity Time Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getTime_expired_since_last_end_of_billing_period <em>Time expired since last end of billing period</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getLocaltime <em>Localtime</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getLocaldate <em>Localdate</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getWeekday <em>Weekday</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getTimeoflastreset <em>Timeoflastreset</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getDateoflastreset <em>Dateoflastreset</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getOutputpulseduration <em>Outputpulseduration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClocksynchronizationwindow <em>Clocksynchronizationwindow</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClock_synchronization_method <em>Clock synchronization method</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClock_time_shift_limit <em>Clock time shift limit</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getBilling_period_reset_lockout_time <em>Billing period reset lockout time</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries()
 * @model
 * @generated
 */
public interface ElectricityTimeEntries extends Data {
	/**
	 * Returns the value of the '<em><b>Time expired since last end of billing period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time expired since last end of billing period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time expired since last end of billing period</em>' attribute.
	 * @see #setTime_expired_since_last_end_of_billing_period(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Time_expired_since_last_end_of_billing_period()
	 * @model
	 * @generated
	 */
	String getTime_expired_since_last_end_of_billing_period();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getTime_expired_since_last_end_of_billing_period <em>Time expired since last end of billing period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time expired since last end of billing period</em>' attribute.
	 * @see #getTime_expired_since_last_end_of_billing_period()
	 * @generated
	 */
	void setTime_expired_since_last_end_of_billing_period(String value);

	/**
	 * Returns the value of the '<em><b>Localtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localtime</em>' attribute.
	 * @see #setLocaltime(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Localtime()
	 * @model
	 * @generated
	 */
	String getLocaltime();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getLocaltime <em>Localtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localtime</em>' attribute.
	 * @see #getLocaltime()
	 * @generated
	 */
	void setLocaltime(String value);

	/**
	 * Returns the value of the '<em><b>Localdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localdate</em>' attribute.
	 * @see #setLocaldate(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Localdate()
	 * @model
	 * @generated
	 */
	String getLocaldate();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getLocaldate <em>Localdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localdate</em>' attribute.
	 * @see #getLocaldate()
	 * @generated
	 */
	void setLocaldate(String value);

	/**
	 * Returns the value of the '<em><b>Weekday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weekday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekday</em>' attribute.
	 * @see #setWeekday(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Weekday()
	 * @model
	 * @generated
	 */
	String getWeekday();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getWeekday <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weekday</em>' attribute.
	 * @see #getWeekday()
	 * @generated
	 */
	void setWeekday(String value);

	/**
	 * Returns the value of the '<em><b>Timeoflastreset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeoflastreset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeoflastreset</em>' attribute.
	 * @see #setTimeoflastreset(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Timeoflastreset()
	 * @model
	 * @generated
	 */
	String getTimeoflastreset();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getTimeoflastreset <em>Timeoflastreset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeoflastreset</em>' attribute.
	 * @see #getTimeoflastreset()
	 * @generated
	 */
	void setTimeoflastreset(String value);

	/**
	 * Returns the value of the '<em><b>Dateoflastreset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dateoflastreset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dateoflastreset</em>' attribute.
	 * @see #setDateoflastreset(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Dateoflastreset()
	 * @model
	 * @generated
	 */
	String getDateoflastreset();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getDateoflastreset <em>Dateoflastreset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateoflastreset</em>' attribute.
	 * @see #getDateoflastreset()
	 * @generated
	 */
	void setDateoflastreset(String value);

	/**
	 * Returns the value of the '<em><b>Outputpulseduration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputpulseduration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputpulseduration</em>' attribute.
	 * @see #setOutputpulseduration(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Outputpulseduration()
	 * @model
	 * @generated
	 */
	String getOutputpulseduration();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getOutputpulseduration <em>Outputpulseduration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputpulseduration</em>' attribute.
	 * @see #getOutputpulseduration()
	 * @generated
	 */
	void setOutputpulseduration(String value);

	/**
	 * Returns the value of the '<em><b>Clocksynchronizationwindow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocksynchronizationwindow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clocksynchronizationwindow</em>' attribute.
	 * @see #setClocksynchronizationwindow(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Clocksynchronizationwindow()
	 * @model
	 * @generated
	 */
	String getClocksynchronizationwindow();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClocksynchronizationwindow <em>Clocksynchronizationwindow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clocksynchronizationwindow</em>' attribute.
	 * @see #getClocksynchronizationwindow()
	 * @generated
	 */
	void setClocksynchronizationwindow(String value);

	/**
	 * Returns the value of the '<em><b>Clock synchronization method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock synchronization method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock synchronization method</em>' attribute.
	 * @see #setClock_synchronization_method(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Clock_synchronization_method()
	 * @model
	 * @generated
	 */
	String getClock_synchronization_method();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClock_synchronization_method <em>Clock synchronization method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock synchronization method</em>' attribute.
	 * @see #getClock_synchronization_method()
	 * @generated
	 */
	void setClock_synchronization_method(String value);

	/**
	 * Returns the value of the '<em><b>Clock time shift limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock time shift limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock time shift limit</em>' attribute.
	 * @see #setClock_time_shift_limit(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Clock_time_shift_limit()
	 * @model
	 * @generated
	 */
	String getClock_time_shift_limit();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClock_time_shift_limit <em>Clock time shift limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock time shift limit</em>' attribute.
	 * @see #getClock_time_shift_limit()
	 * @generated
	 */
	void setClock_time_shift_limit(String value);

	/**
	 * Returns the value of the '<em><b>Billing period reset lockout time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing period reset lockout time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing period reset lockout time</em>' attribute.
	 * @see #setBilling_period_reset_lockout_time(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityTimeEntries_Billing_period_reset_lockout_time()
	 * @model
	 * @generated
	 */
	String getBilling_period_reset_lockout_time();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getBilling_period_reset_lockout_time <em>Billing period reset lockout time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing period reset lockout time</em>' attribute.
	 * @see #getBilling_period_reset_lockout_time()
	 * @generated
	 */
	void setBilling_period_reset_lockout_time(String value);

} // ElectricityTimeEntries
