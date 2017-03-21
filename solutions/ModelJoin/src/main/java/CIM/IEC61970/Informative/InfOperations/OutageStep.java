/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfWork.Crew;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#isInjury <em>Injury</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes <em>Outage Codes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount <em>Special Customer Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#isFatality <em>Fatality</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getCallerCount <em>Caller Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#isDamage <em>Damage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getJobPriority <em>Job Priority</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#isShockReported <em>Shock Reported</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getAverageCml <em>Average Cml</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getTotalCml <em>Total Cml</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount <em>Total Customer Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount <em>Critical Customer Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getNoPowerInterval <em>No Power Interval</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles <em>Conducting Equipment Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord <em>Outage Record</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Holds an outage start and end time for each supply point of an outage record. The supply point for a given step is the associated PowerSystemResource instance.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Holds an outage start and end time for each supply point of an outage record. The supply point for a given step is the associated PowerSystemResource instance.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Holds an outage start and end time for each supply point of an outage record. The supply point for a given step is the associated PowerSystemResource instance.' Profile\040documentation='Holds an outage start and end time for each supply point of an outage record. The supply point for a given step is the associated PowerSystemResource instance.'"
 * @generated
 */
public interface OutageStep extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Injury</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injury</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injury</em>' attribute.
	 * @see #setInjury(boolean)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_Injury()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if injuries reported by caller or engineer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if injuries reported by caller or engineer.'"
	 * @generated
	 */
	boolean isInjury();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#isInjury <em>Injury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injury</em>' attribute.
	 * @see #isInjury()
	 * @generated
	 */
	void setInjury(boolean value);

	/**
	 * Returns the value of the '<em><b>Outage Codes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.OutageCode}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Codes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Codes</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_OutageCodes()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps
	 * @model opposite="OutageSteps"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Multiple outage codes may apply to an outage step.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Multiple outage codes may apply to an outage step.'"
	 * @generated
	 */
	EList<OutageCode> getOutageCodes();

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Crew#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_Crews()
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getOutageSteps
	 * @model opposite="OutageSteps"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Special Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Customer Count</em>' attribute.
	 * @see #setSpecialCustomerCount(int)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_SpecialCustomerCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of customers with high reliability required.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of customers with high reliability required.'"
	 * @generated
	 */
	int getSpecialCustomerCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount <em>Special Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Customer Count</em>' attribute.
	 * @see #getSpecialCustomerCount()
	 * @generated
	 */
	void setSpecialCustomerCount(int value);

	/**
	 * Returns the value of the '<em><b>Estimated Restore Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Restore Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Restore Date Time</em>' attribute.
	 * @see #setEstimatedRestoreDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_EstimatedRestoreDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated time of restoration.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated time of restoration.'"
	 * @generated
	 */
	Date getEstimatedRestoreDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Restore Date Time</em>' attribute.
	 * @see #getEstimatedRestoreDateTime()
	 * @generated
	 */
	void setEstimatedRestoreDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Fatality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fatality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fatality</em>' attribute.
	 * @see #setFatality(boolean)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_Fatality()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if fatalities reported by caller or engineer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if fatalities reported by caller or engineer.'"
	 * @generated
	 */
	boolean isFatality();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#isFatality <em>Fatality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fatality</em>' attribute.
	 * @see #isFatality()
	 * @generated
	 */
	void setFatality(boolean value);

	/**
	 * Returns the value of the '<em><b>Caller Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller Count</em>' attribute.
	 * @see #setCallerCount(int)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_CallerCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of customers phoning in.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of customers phoning in.'"
	 * @generated
	 */
	int getCallerCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getCallerCount <em>Caller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller Count</em>' attribute.
	 * @see #getCallerCount()
	 * @generated
	 */
	void setCallerCount(int value);

	/**
	 * Returns the value of the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage</em>' attribute.
	 * @see #setDamage(boolean)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_Damage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if damage reported by caller or engineer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if damage reported by caller or engineer.'"
	 * @generated
	 */
	boolean isDamage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#isDamage <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage</em>' attribute.
	 * @see #isDamage()
	 * @generated
	 */
	void setDamage(boolean value);

	/**
	 * Returns the value of the '<em><b>Job Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Priority</em>' attribute.
	 * @see #setJobPriority(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_JobPriority()
	 * @model required="true"
	 * @generated
	 */
	String getJobPriority();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getJobPriority <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Priority</em>' attribute.
	 * @see #getJobPriority()
	 * @generated
	 */
	void setJobPriority(String value);

	/**
	 * Returns the value of the '<em><b>Shock Reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shock Reported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shock Reported</em>' attribute.
	 * @see #setShockReported(boolean)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_ShockReported()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if shocks reported by caller or engineer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if shocks reported by caller or engineer.'"
	 * @generated
	 */
	boolean isShockReported();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#isShockReported <em>Shock Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shock Reported</em>' attribute.
	 * @see #isShockReported()
	 * @generated
	 */
	void setShockReported(boolean value);

	/**
	 * Returns the value of the '<em><b>Average Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Cml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Cml</em>' attribute.
	 * @see #setAverageCml(float)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_AverageCml()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Average Customer Minutes Lost (CML) for this supply point for this outage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Average Customer Minutes Lost (CML) for this supply point for this outage.'"
	 * @generated
	 */
	float getAverageCml();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getAverageCml <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Cml</em>' attribute.
	 * @see #getAverageCml()
	 * @generated
	 */
	void setAverageCml(float value);

	/**
	 * Returns the value of the '<em><b>Total Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cml</em>' attribute.
	 * @see #setTotalCml(float)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_TotalCml()
	 * @model dataType="CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total Customer Minutes Lost (CML) for this supply point for this outage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total Customer Minutes Lost (CML) for this supply point for this outage.'"
	 * @generated
	 */
	float getTotalCml();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getTotalCml <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cml</em>' attribute.
	 * @see #getTotalCml()
	 * @generated
	 */
	void setTotalCml(float value);

	/**
	 * Returns the value of the '<em><b>Total Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Customer Count</em>' attribute.
	 * @see #setTotalCustomerCount(int)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_TotalCustomerCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of customers connected to the PowerSystemResource.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of customers connected to the PowerSystemResource.'"
	 * @generated
	 */
	int getTotalCustomerCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount <em>Total Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Customer Count</em>' attribute.
	 * @see #getTotalCustomerCount()
	 * @generated
	 */
	void setTotalCustomerCount(int value);

	/**
	 * Returns the value of the '<em><b>Critical Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical Customer Count</em>' attribute.
	 * @see #setCriticalCustomerCount(int)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_CriticalCustomerCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of customers with critical needs, e.g., with a dialysis machine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of customers with critical needs, e.g., with a dialysis machine.'"
	 * @generated
	 */
	int getCriticalCustomerCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount <em>Critical Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Customer Count</em>' attribute.
	 * @see #getCriticalCustomerCount()
	 * @generated
	 */
	void setCriticalCustomerCount(int value);

	/**
	 * Returns the value of the '<em><b>No Power Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Power Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Power Interval</em>' reference.
	 * @see #setNoPowerInterval(DateTimeInterval)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_NoPowerInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time interval between loss and restoration of power.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time interval between loss and restoration of power.'"
	 * @generated
	 */
	DateTimeInterval getNoPowerInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getNoPowerInterval <em>No Power Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Power Interval</em>' reference.
	 * @see #getNoPowerInterval()
	 * @generated
	 */
	void setNoPowerInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Conducting Equipment Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep <em>Outage Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment Roles</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_ConductingEquipmentRoles()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep
	 * @model opposite="OutageStep"
	 * @generated
	 */
	EList<OutageStepPsrRole> getConductingEquipmentRoles();

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
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Outage Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Record</em>' reference.
	 * @see #setOutageRecord(OutageRecord)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep_OutageRecord()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps
	 * @model opposite="OutageSteps"
	 * @generated
	 */
	OutageRecord getOutageRecord();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord <em>Outage Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Record</em>' reference.
	 * @see #getOutageRecord()
	 * @generated
	 */
	void setOutageRecord(OutageRecord value);

} // OutageStep
