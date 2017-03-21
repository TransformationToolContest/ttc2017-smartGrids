/**
 */
package CIM.IEC61968.Common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimeSchedule#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimeSchedule#getTimePoints <em>Time Points</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimeSchedule#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getTimeSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Description of anything that changes through time. Time schedule is used to perform a single-valued function of time. Use inherited \'category\' attribute to give additional information on this schedule, such as: periodic (hourly, daily, weekly, monthly, etc.), day of the month, by date, calendar (specific times and dates).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Description of anything that changes through time. Time schedule is used to perform a single-valued function of time. Use inherited \'category\' attribute to give additional information on this schedule, such as: periodic (hourly, daily, weekly, monthly, etc.), day of the month, by date, calendar (specific times and dates).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Description of anything that changes through time. Time schedule is used to perform a single-valued function of time. Use inherited \'category\' attribute to give additional information on this schedule, such as: periodic (hourly, daily, weekly, monthly, etc.), day of the month, by date, calendar (specific times and dates).' Profile\040documentation='Description of anything that changes through time. Time schedule is used to perform a single-valued function of time. Use inherited \'category\' attribute to give additional information on this schedule, such as: periodic (hourly, daily, weekly, monthly, etc.), day of the month, by date, calendar (specific times and dates).'"
 * @generated
 */
public interface TimeSchedule extends Document {
	/**
	 * Returns the value of the '<em><b>Recurrence Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Pattern</em>' attribute.
	 * @see #setRecurrencePattern(String)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimeSchedule_RecurrencePattern()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval at which the scheduled action repeats (e.g., first Monday of every month, last day of the month, etc.).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval at which the scheduled action repeats (e.g., first Monday of every month, last day of the month, etc.).'"
	 * @generated
	 */
	String getRecurrencePattern();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Pattern</em>' attribute.
	 * @see #getRecurrencePattern()
	 * @generated
	 */
	void setRecurrencePattern(String value);

	/**
	 * Returns the value of the '<em><b>Schedule Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Interval</em>' reference.
	 * @see #setScheduleInterval(DateTimeInterval)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimeSchedule_ScheduleInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Schedule date and time interval.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedule date and time interval.'"
	 * @generated
	 */
	DateTimeInterval getScheduleInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Interval</em>' reference.
	 * @see #getScheduleInterval()
	 * @generated
	 */
	void setScheduleInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimeSchedule_Disabled()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this schedule is deactivated (disabled).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this schedule is deactivated (disabled).'"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimeSchedule#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Recurrence Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Period</em>' attribute.
	 * @see #setRecurrencePeriod(float)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimeSchedule_RecurrencePeriod()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Duration between time points, from the beginning of one period to the beginning of the next period. Note that a device like a meter may have multiple interval periods (e.g., 1 min, 5 min, 15 min, 30 min, or 60 min).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Duration between time points, from the beginning of one period to the beginning of the next period. Note that a device like a meter may have multiple interval periods (e.g., 1 min, 5 min, 15 min, 30 min, or 60 min).'"
	 * @generated
	 */
	float getRecurrencePeriod();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Period</em>' attribute.
	 * @see #getRecurrencePeriod()
	 * @generated
	 */
	void setRecurrencePeriod(float value);

	/**
	 * Returns the value of the '<em><b>Time Points</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.TimePoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.TimePoint#getTimeSchedule <em>Time Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Points</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getTimeSchedule_TimePoints()
	 * @see CIM.IEC61968.Common.TimePoint#getTimeSchedule
	 * @model opposite="TimeSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Sequence of time points belonging to this time schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Sequence of time points belonging to this time schedule.'"
	 * @generated
	 */
	EList<TimePoint> getTimePoints();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(float)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimeSchedule_Offset()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The offset from midnight (i.e., 0 h, 0 min, 0 s) for the periodic time points to begin. For example, for an interval meter that is set up for five minute intervals (\'recurrencePeriod\'=300=5 min), setting \'offset\'=120=2 min would result in scheduled events to read the meter executing at 2 min, 7 min, 12 min, 17 min, 22 min, 27 min, 32 min, 37 min, 42 min, 47 min, 52 min, and 57 min past each hour.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The offset from midnight (i.e., 0 h, 0 min, 0 s) for the periodic time points to begin. For example, for an interval meter that is set up for five minute intervals (\'recurrencePeriod\'=300=5 min), setting \'offset\'=120=2 min would result in scheduled events to read the meter executing at 2 min, 7 min, 12 min, 17 min, 22 min, 27 min, 32 min, 37 min, 42 min, 47 min, 52 min, and 57 min past each hour.'"
	 * @generated
	 */
	float getOffset();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimeSchedule#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(float value);

} // TimeSchedule
