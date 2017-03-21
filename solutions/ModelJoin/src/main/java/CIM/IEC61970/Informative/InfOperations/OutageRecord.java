/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.Document;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getMode <em>Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport <em>Outage Report</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken <em>Action Taken</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime <em>End Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps <em>Outage Steps</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes <em>Outage Codes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode <em>Damage Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned <em>Is Planned</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A document describing details of an outage in part of the electrical network, typically produced by a SCADA system following a breaker trip, or within a Trouble Call System by grouping customer calls. This has an associated OutageStep for each supply point. Primary cause of the outage is captured in \'category\'.\nIn some countries all outage restoration is performed using a SwitchingSchedule which complements the OutageRecord and records the ErpPersons (crew) and any planned Work. In other systems, it may be acceptable to manage outages including new WorkTasks without switching schedules.\nNote: The relationship between OutageRecord and ErpPerson and Crew is inherited as each is a type of Document.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A document describing details of an outage in part of the electrical network, typically produced by a SCADA system following a breaker trip, or within a Trouble Call System by grouping customer calls. This has an associated OutageStep for each supply point. Primary cause of the outage is captured in \'category\'.\nIn some countries all outage restoration is performed using a SwitchingSchedule which complements the OutageRecord and records the ErpPersons (crew) and any planned Work. In other systems, it may be acceptable to manage outages including new WorkTasks without switching schedules.\nNote: The relationship between OutageRecord and ErpPerson and Crew is inherited as each is a type of Document.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A document describing details of an outage in part of the electrical network, typically produced by a SCADA system following a breaker trip, or within a Trouble Call System by grouping customer calls. This has an associated OutageStep for each supply point. Primary cause of the outage is captured in \'category\'.\nIn some countries all outage restoration is performed using a SwitchingSchedule which complements the OutageRecord and records the ErpPersons (crew) and any planned Work. In other systems, it may be acceptable to manage outages including new WorkTasks without switching schedules.\nNote: The relationship between OutageRecord and ErpPerson and Crew is inherited as each is a type of Document.' Profile\040documentation='A document describing details of an outage in part of the electrical network, typically produced by a SCADA system following a breaker trip, or within a Trouble Call System by grouping customer calls. This has an associated OutageStep for each supply point. Primary cause of the outage is captured in \'category\'.\nIn some countries all outage restoration is performed using a SwitchingSchedule which complements the OutageRecord and records the ErpPersons (crew) and any planned Work. In other systems, it may be acceptable to manage outages including new WorkTasks without switching schedules.\nNote: The relationship between OutageRecord and ErpPerson and Crew is inherited as each is a type of Document.'"
 * @generated
 */
public interface OutageRecord extends Document {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord_Mode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of ErpOrganisation.mode at the time of OutageRecord.startDateTime.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of ErpOrganisation.mode at the time of OutageRecord.startDateTime.'"
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Outage Report</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Report</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Report</em>' reference.
	 * @see #setOutageReport(OutageReport)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord_OutageReport()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord
	 * @model opposite="OutageRecord"
	 * @generated
	 */
	OutageReport getOutageReport();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport <em>Outage Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Report</em>' reference.
	 * @see #getOutageReport()
	 * @generated
	 */
	void setOutageReport(OutageReport value);

	/**
	 * Returns the value of the '<em><b>Action Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Taken</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Taken</em>' attribute.
	 * @see #setActionTaken(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord_ActionTaken()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Overall action taken to resolve outage (details are in \'WorkTasks\').'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Overall action taken to resolve outage (details are in \'WorkTasks\').'"
	 * @generated
	 */
	String getActionTaken();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken <em>Action Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Taken</em>' attribute.
	 * @see #getActionTaken()
	 * @generated
	 */
	void setActionTaken(String value);

	/**
	 * Returns the value of the '<em><b>End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date Time</em>' attribute.
	 * @see #setEndDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord_EndDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time restoration was completed for all customers impacted by this outage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time restoration was completed for all customers impacted by this outage.'"
	 * @generated
	 */
	Date getEndDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date Time</em>' attribute.
	 * @see #getEndDateTime()
	 * @generated
	 */
	void setEndDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Outage Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.OutageStep}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Steps</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord_OutageSteps()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord
	 * @model opposite="OutageRecord"
	 * @generated
	 */
	EList<OutageStep> getOutageSteps();

	/**
	 * Returns the value of the '<em><b>Outage Codes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.OutageCode}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords <em>Outage Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Codes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Codes</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord_OutageCodes()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords
	 * @model opposite="OutageRecords"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiple outage codes may apply to an outage record.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiple outage codes may apply to an outage record.'"
	 * @generated
	 */
	EList<OutageCode> getOutageCodes();

	/**
	 * Returns the value of the '<em><b>Damage Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Code</em>' attribute.
	 * @see #setDamageCode(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord_DamageCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The damage code relative to the associated PowerSystemResource(s) and/or Asset(s). Examples include broken, burnout, failure, flashed (burned), manually operated, wire down, no damage - rolling blackout, none.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The damage code relative to the associated PowerSystemResource(s) and/or Asset(s). Examples include broken, burnout, failure, flashed (burned), manually operated, wire down, no damage - rolling blackout, none.'"
	 * @generated
	 */
	String getDamageCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode <em>Damage Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Code</em>' attribute.
	 * @see #getDamageCode()
	 * @generated
	 */
	void setDamageCode(String value);

	/**
	 * Returns the value of the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Planned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Planned</em>' attribute.
	 * @see #setIsPlanned(boolean)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord_IsPlanned()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if planned, false otherwise (for example due to a breaker trip).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if planned, false otherwise (for example due to a breaker trip).'"
	 * @generated
	 */
	boolean isIsPlanned();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Planned</em>' attribute.
	 * @see #isIsPlanned()
	 * @generated
	 */
	void setIsPlanned(boolean value);

} // OutageRecord
