/**
 */
package COSEM.InterfaceClasses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.Clock#getTime <em>Time</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.Clock#getTime_zone <em>Time zone</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.Clock#getStatus <em>Status</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.Clock#getDaylight_savings_begin <em>Daylight savings begin</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.Clock#getDaylight_savings_end <em>Daylight savings end</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.Clock#getDaylight_savings_deviation <em>Daylight savings deviation</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.Clock#isDaylight_savings_enabled <em>Daylight savings enabled</em>}</li>
 * </ul>
 *
 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getClock()
 * @model
 * @generated
 */
public interface Clock extends Base {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getClock_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Clock#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Time zone</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time zone</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time zone</em>' attribute list.
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getClock_Time_zone()
	 * @model upper="720"
	 * @generated
	 */
	EList<Long> getTime_zone();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getClock_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Clock#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Daylight savings begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daylight savings begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylight savings begin</em>' attribute.
	 * @see #setDaylight_savings_begin(String)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getClock_Daylight_savings_begin()
	 * @model
	 * @generated
	 */
	String getDaylight_savings_begin();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Clock#getDaylight_savings_begin <em>Daylight savings begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight savings begin</em>' attribute.
	 * @see #getDaylight_savings_begin()
	 * @generated
	 */
	void setDaylight_savings_begin(String value);

	/**
	 * Returns the value of the '<em><b>Daylight savings end</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daylight savings end</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylight savings end</em>' attribute.
	 * @see #setDaylight_savings_end(String)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getClock_Daylight_savings_end()
	 * @model
	 * @generated
	 */
	String getDaylight_savings_end();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Clock#getDaylight_savings_end <em>Daylight savings end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight savings end</em>' attribute.
	 * @see #getDaylight_savings_end()
	 * @generated
	 */
	void setDaylight_savings_end(String value);

	/**
	 * Returns the value of the '<em><b>Daylight savings deviation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daylight savings deviation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylight savings deviation</em>' attribute list.
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getClock_Daylight_savings_deviation()
	 * @model upper="120"
	 * @generated
	 */
	EList<Integer> getDaylight_savings_deviation();

	/**
	 * Returns the value of the '<em><b>Daylight savings enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daylight savings enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylight savings enabled</em>' attribute.
	 * @see #setDaylight_savings_enabled(boolean)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getClock_Daylight_savings_enabled()
	 * @model
	 * @generated
	 */
	boolean isDaylight_savings_enabled();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Clock#isDaylight_savings_enabled <em>Daylight savings enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight savings enabled</em>' attribute.
	 * @see #isDaylight_savings_enabled()
	 * @generated
	 */
	void setDaylight_savings_enabled(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void adjust_to_quarter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void adjust_to_measuring_period();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void adjust_to_minute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void adjust_to_present_time();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void present_adjusting_time();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void shift_time();

} // Clock
