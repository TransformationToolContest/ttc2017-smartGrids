/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;
import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.Status;
import gluemodel.CIM.IEC61968.Common.TimePoint;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getDocument <em>Document</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getTimePoint <em>Time Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getDuration <em>Duration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getScheduleParameterInfo <em>Schedule Parameter Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getActivityRecord <em>Activity Record</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Signifies an event to trigger one or more activities, such as reading a meter, recalculating a bill, requesting work, when generating units must be scheduled for maintenance, when a transformer is scheduled to be refurbished, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Signifies an event to trigger one or more activities, such as reading a meter, recalculating a bill, requesting work, when generating units must be scheduled for maintenance, when a transformer is scheduled to be refurbished, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Signifies an event to trigger one or more activities, such as reading a meter, recalculating a bill, requesting work, when generating units must be scheduled for maintenance, when a transformer is scheduled to be refurbished, etc.' Profile\040documentation='Signifies an event to trigger one or more activities, such as reading a meter, recalculating a bill, requesting work, when generating units must be scheduled for maintenance, when a transformer is scheduled to be refurbished, etc.'"
 * @generated
 */
public interface ScheduledEvent extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Document#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent_Document()
	 * @see gluemodel.CIM.IEC61968.Common.Document#getScheduledEvents
	 * @model opposite="ScheduledEvents"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Time Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.TimePoint#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Point</em>' reference.
	 * @see #setTimePoint(TimePoint)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent_TimePoint()
	 * @see gluemodel.CIM.IEC61968.Common.TimePoint#getScheduledEvents
	 * @model opposite="ScheduledEvents"
	 * @generated
	 */
	TimePoint getTimePoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getTimePoint <em>Time Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Point</em>' reference.
	 * @see #getTimePoint()
	 * @generated
	 */
	void setTimePoint(TimePoint value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent_Duration()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Duration of the scheduled event, for example, the time to ramp between values.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Duration of the scheduled event, for example, the time to ramp between values.'"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Schedule Parameter Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Parameter Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Parameter Info</em>' reference.
	 * @see #setScheduleParameterInfo(ScheduleParameterInfo)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent_ScheduleParameterInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getScheduledEvents
	 * @model opposite="ScheduledEvents"
	 * @generated
	 */
	ScheduleParameterInfo getScheduleParameterInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getScheduleParameterInfo <em>Schedule Parameter Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Parameter Info</em>' reference.
	 * @see #getScheduleParameterInfo()
	 * @generated
	 */
	void setScheduleParameterInfo(ScheduleParameterInfo value);

	/**
	 * Returns the value of the '<em><b>Activity Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.ActivityRecord#getScheduledEvent <em>Scheduled Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Record</em>' reference.
	 * @see #setActivityRecord(ActivityRecord)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent_ActivityRecord()
	 * @see gluemodel.CIM.IEC61968.Common.ActivityRecord#getScheduledEvent
	 * @model opposite="ScheduledEvent"
	 * @generated
	 */
	ActivityRecord getActivityRecord();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getActivityRecord <em>Activity Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Record</em>' reference.
	 * @see #getActivityRecord()
	 * @generated
	 */
	void setActivityRecord(ActivityRecord value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent_Category()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category of scheduled event.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category of scheduled event.'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent_Assets()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getScheduledEvents
	 * @model opposite="ScheduledEvents"
	 * @generated
	 */
	EList<Asset> getAssets();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduledEvent_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // ScheduledEvent
