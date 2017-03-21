/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Outage.ClearanceTag;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags <em>Clearance Tags</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps <em>Schedule Steps</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSafetyDocument()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A document restricting or authorising works on electrical equipment (for example a permit to work, sanction for test, limitation of access, or certificate of isolation), defined based upon organisational practices.\nNote: SafetyDocument may refer to ClearanceTag-s associated with ConductingEquipment for which the SafetyDocument is issued.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A document restricting or authorising works on electrical equipment (for example a permit to work, sanction for test, limitation of access, or certificate of isolation), defined based upon organisational practices.\nNote: SafetyDocument may refer to ClearanceTag-s associated with ConductingEquipment for which the SafetyDocument is issued.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A document restricting or authorising works on electrical equipment (for example a permit to work, sanction for test, limitation of access, or certificate of isolation), defined based upon organisational practices.\nNote: SafetyDocument may refer to ClearanceTag-s associated with ConductingEquipment for which the SafetyDocument is issued.' Profile\040documentation='A document restricting or authorising works on electrical equipment (for example a permit to work, sanction for test, limitation of access, or certificate of isolation), defined based upon organisational practices.\nNote: SafetyDocument may refer to ClearanceTag-s associated with ConductingEquipment for which the SafetyDocument is issued.'"
 * @generated
 */
public interface SafetyDocument extends Document {
	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PowerSystemResource#getSafetyDocuments <em>Safety Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSafetyDocument_PowerSystemResource()
	 * @see CIM.IEC61970.Core.PowerSystemResource#getSafetyDocuments
	 * @model opposite="SafetyDocuments"
	 * @generated
	 */
	PowerSystemResource getPowerSystemResource();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	void setPowerSystemResource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Clearance Tags</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Outage.ClearanceTag}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Outage.ClearanceTag#getSafetyDocument <em>Safety Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearance Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearance Tags</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSafetyDocument_ClearanceTags()
	 * @see CIM.IEC61970.Outage.ClearanceTag#getSafetyDocument
	 * @model opposite="SafetyDocument"
	 * @generated
	 */
	EList<ClearanceTag> getClearanceTags();

	/**
	 * Returns the value of the '<em><b>Schedule Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.SwitchingStep}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument <em>Safety Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Steps</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSafetyDocument_ScheduleSteps()
	 * @see CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument
	 * @model opposite="SafetyDocument"
	 * @generated
	 */
	EList<SwitchingStep> getScheduleSteps();

} // SafetyDocument
