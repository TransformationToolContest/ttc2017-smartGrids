/**
 */
package CIM.IEC61968.Common;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.TimePoint#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimePoint#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimePoint#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimePoint#getRelativeTimeInterval <em>Relative Time Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimePoint#getWindow <em>Window</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimePoint#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.TimePoint#getTimeSchedule <em>Time Schedule</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Common.CommonPackage#getTimePoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A point in time within a sequence of points in time relative to a TimeSchedule.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A point in time within a sequence of points in time relative to a TimeSchedule.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A point in time within a sequence of points in time relative to a TimeSchedule.' Profile\040documentation='A point in time within a sequence of points in time relative to a TimeSchedule.'"
 * @generated
 */
public interface TimePoint extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimePoint_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if sequence-based) Relative sequence number for this time point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if sequence-based) Relative sequence number for this time point.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimePoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimePoint_Status()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of this time point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of this time point.'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimePoint#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.ScheduledEvent}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getTimePoint <em>Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference list.
	 * @see CIM.IEC61968.Common.CommonPackage#getTimePoint_ScheduledEvents()
	 * @see CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getTimePoint
	 * @model opposite="TimePoint"
	 * @generated
	 */
	EList<ScheduledEvent> getScheduledEvents();

	/**
	 * Returns the value of the '<em><b>Relative Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Time Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Time Interval</em>' attribute.
	 * @see #setRelativeTimeInterval(float)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimePoint_RelativeTimeInterval()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if interval-based) A point in time relative to scheduled start time in \'TimeSchedule.scheduleInterval.start\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if interval-based) A point in time relative to scheduled start time in \'TimeSchedule.scheduleInterval.start\'.'"
	 * @generated
	 */
	float getRelativeTimeInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimePoint#getRelativeTimeInterval <em>Relative Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Time Interval</em>' attribute.
	 * @see #getRelativeTimeInterval()
	 * @generated
	 */
	void setRelativeTimeInterval(float value);

	/**
	 * Returns the value of the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' reference.
	 * @see #setWindow(DateTimeInterval)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimePoint_Window()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval defining the window of time that this time point is valid (for example, seasonal, only on weekends, not on weekends, only 8:00 to 5:00, etc.).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval defining the window of time that this time point is valid (for example, seasonal, only on weekends, not on weekends, only 8:00 to 5:00, etc.).'"
	 * @generated
	 */
	DateTimeInterval getWindow();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimePoint#getWindow <em>Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' reference.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimePoint_DateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Absolute date and time for this time point. For calendar-based time point, it is typically manually entered, while for interval-based or sequence-based time point it is derived.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Absolute date and time for this time point. For calendar-based time point, it is typically manually entered, while for interval-based or sequence-based time point it is derived.'"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimePoint#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Time Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.TimeSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Schedule</em>' reference.
	 * @see #setTimeSchedule(TimeSchedule)
	 * @see CIM.IEC61968.Common.CommonPackage#getTimePoint_TimeSchedule()
	 * @see CIM.IEC61968.Common.TimeSchedule#getTimePoints
	 * @model opposite="TimePoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time schedule owning this time point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time schedule owning this time point.'"
	 * @generated
	 */
	TimeSchedule getTimeSchedule();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Common.TimePoint#getTimeSchedule <em>Time Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Schedule</em>' reference.
	 * @see #getTimeSchedule()
	 * @generated
	 */
	void setTimeSchedule(TimeSchedule value);

} // TimePoint
