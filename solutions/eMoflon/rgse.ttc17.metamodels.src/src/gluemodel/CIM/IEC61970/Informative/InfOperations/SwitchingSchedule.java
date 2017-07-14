/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switching Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps <em>Schedule Steps</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getInterval <em>Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews <em>Crews</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Document describing a sequence of steps to perform an item of work, for example to isolate some plant with regard to safety, equipment ratings, and standards of customer service.\nNote 1: SwitchingSchedule is intended to describe the full operational details for switching for real time operation which includes other operations such as grounding, applying safety documents etc. \nNote 2: The association to ErpPerson suits the UK practice of quoting specific names (e.g the crew foreman). The association to Crew is for US practice.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Document describing a sequence of steps to perform an item of work, for example to isolate some plant with regard to safety, equipment ratings, and standards of customer service.\nNote 1: SwitchingSchedule is intended to describe the full operational details for switching for real time operation which includes other operations such as grounding, applying safety documents etc. \nNote 2: The association to ErpPerson suits the UK practice of quoting specific names (e.g the crew foreman). The association to Crew is for US practice.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Document describing a sequence of steps to perform an item of work, for example to isolate some plant with regard to safety, equipment ratings, and standards of customer service.\nNote 1: SwitchingSchedule is intended to describe the full operational details for switching for real time operation which includes other operations such as grounding, applying safety documents etc. \nNote 2: The association to ErpPerson suits the UK practice of quoting specific names (e.g the crew foreman). The association to Crew is for US practice.' Profile\040documentation='Document describing a sequence of steps to perform an item of work, for example to isolate some plant with regard to safety, equipment ratings, and standards of customer service.\nNote 1: SwitchingSchedule is intended to describe the full operational details for switching for real time operation which includes other operations such as grounding, applying safety documents etc. \nNote 2: The association to ErpPerson suits the UK practice of quoting specific names (e.g the crew foreman). The association to Crew is for US practice.'"
 * @generated
 */
public interface SwitchingSchedule extends Document {
	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules <em>Switching Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingSchedule_WorkTask()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules
	 * @model opposite="SwitchingSchedules"
	 * @generated
	 */
	WorkTask getWorkTask();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	void setWorkTask(WorkTask value);

	/**
	 * Returns the value of the '<em><b>Schedule Steps</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule <em>Switching Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Steps</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingSchedule_ScheduleSteps()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule
	 * @model opposite="SwitchingSchedule"
	 * @generated
	 */
	EList<SwitchingStep> getScheduleSteps();

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' reference.
	 * @see #setInterval(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingSchedule_Interval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval between starting and completion of the switching.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval between starting and completion of the switching.'"
	 * @generated
	 */
	DateTimeInterval getInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getInterval <em>Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' reference.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules <em>Switching Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingSchedule_Crews()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules
	 * @model opposite="SwitchingSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All Crews executing this SwitchingSchedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All Crews executing this SwitchingSchedule.'"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingSchedule_Reason()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reason for switching.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reason for switching.'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

} // SwitchingSchedule
