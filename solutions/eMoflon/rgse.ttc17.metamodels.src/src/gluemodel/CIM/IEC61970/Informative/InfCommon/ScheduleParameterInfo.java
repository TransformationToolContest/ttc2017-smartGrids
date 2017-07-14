/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCommon;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfWork.InspectionDataSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Parameter Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getRequestedWindow <em>Requested Window</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getForInspectionDataSet <em>For Inspection Data Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getEstimatedWindow <em>Estimated Window</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getDocuments <em>Documents</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduleParameterInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Schedule parameters for an activity that is to occur, is occurring, or has completed.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Schedule parameters for an activity that is to occur, is occurring, or has completed.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedule parameters for an activity that is to occur, is occurring, or has completed.' Profile\040documentation='Schedule parameters for an activity that is to occur, is occurring, or has completed.'"
 * @generated
 */
public interface ScheduleParameterInfo extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getScheduleParameterInfo <em>Schedule Parameter Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduleParameterInfo_ScheduledEvents()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent#getScheduleParameterInfo
	 * @model opposite="ScheduleParameterInfo"
	 * @generated
	 */
	EList<ScheduledEvent> getScheduledEvents();

	/**
	 * Returns the value of the '<em><b>Requested Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Window</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Window</em>' reference.
	 * @see #setRequestedWindow(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduleParameterInfo_RequestedWindow()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Requested date and time interval for activity execution.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Requested date and time interval for activity execution.'"
	 * @generated
	 */
	DateTimeInterval getRequestedWindow();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getRequestedWindow <em>Requested Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Window</em>' reference.
	 * @see #getRequestedWindow()
	 * @generated
	 */
	void setRequestedWindow(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>For Inspection Data Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Inspection Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Inspection Data Set</em>' reference.
	 * @see #setForInspectionDataSet(InspectionDataSet)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduleParameterInfo_ForInspectionDataSet()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules
	 * @model opposite="AccordingToSchedules"
	 * @generated
	 */
	InspectionDataSet getForInspectionDataSet();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getForInspectionDataSet <em>For Inspection Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Inspection Data Set</em>' reference.
	 * @see #getForInspectionDataSet()
	 * @generated
	 */
	void setForInspectionDataSet(InspectionDataSet value);

	/**
	 * Returns the value of the '<em><b>Estimated Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Window</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Window</em>' reference.
	 * @see #setEstimatedWindow(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduleParameterInfo_EstimatedWindow()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated date and time for activity execution (with earliest possibility of activity initiation and latest possibility of activity completion).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated date and time for activity execution (with earliest possibility of activity initiation and latest possibility of activity completion).'"
	 * @generated
	 */
	DateTimeInterval getEstimatedWindow();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getEstimatedWindow <em>Estimated Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Window</em>' reference.
	 * @see #getEstimatedWindow()
	 * @generated
	 */
	void setEstimatedWindow(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Document}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Document#getScheduleParameterInfos <em>Schedule Parameter Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduleParameterInfo_Documents()
	 * @see gluemodel.CIM.IEC61968.Common.Document#getScheduleParameterInfos
	 * @model opposite="ScheduleParameterInfos"
	 * @generated
	 */
	EList<Document> getDocuments();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getScheduleParameterInfo_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // ScheduleParameterInfo
