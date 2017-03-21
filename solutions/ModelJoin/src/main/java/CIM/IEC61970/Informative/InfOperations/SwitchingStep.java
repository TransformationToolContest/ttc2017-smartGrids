/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.DateTimeInterval;

import CIM.IEC61970.Core.IdentifiedObject;
import CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switching Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind <em>Status Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole <em>Erp Person Role</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule <em>Switching Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument <em>Safety Document</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction <em>Required Control Action</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getText <em>Text</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlActionInterval <em>Required Control Action Interval</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState <em>Desired End State</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A single step within a SwitchingSchedule. Could be a switching operation (applying a network alteration), or issuing a safety document.\nNote: Inherited attribute IdentifiedObject.name is used to hold the sequence number.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A single step within a SwitchingSchedule. Could be a switching operation (applying a network alteration), or issuing a safety document.\nNote: Inherited attribute IdentifiedObject.name is used to hold the sequence number.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A single step within a SwitchingSchedule. Could be a switching operation (applying a network alteration), or issuing a safety document.\nNote: Inherited attribute IdentifiedObject.name is used to hold the sequence number.' Profile\040documentation='A single step within a SwitchingSchedule. Could be a switching operation (applying a network alteration), or issuing a safety document.\nNote: Inherited attribute IdentifiedObject.name is used to hold the sequence number.'"
 * @generated
 */
public interface SwitchingStep extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Status Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
	 * @see #setStatusKind(SwitchingStepStatusKind)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_StatusKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of this SwitchingStep.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of this SwitchingStep.'"
	 * @generated
	 */
	SwitchingStepStatusKind getStatusKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind <em>Status Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
	 * @see #getStatusKind()
	 * @generated
	 */
	void setStatusKind(SwitchingStepStatusKind value);

	/**
	 * Returns the value of the '<em><b>Erp Person Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep <em>Switching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person Role</em>' reference.
	 * @see #setErpPersonRole(ErpPersonScheduleStepRole)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_ErpPersonRole()
	 * @see CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep
	 * @model opposite="SwitchingStep"
	 * @generated
	 */
	ErpPersonScheduleStepRole getErpPersonRole();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole <em>Erp Person Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person Role</em>' reference.
	 * @see #getErpPersonRole()
	 * @generated
	 */
	void setErpPersonRole(ErpPersonScheduleStepRole value);

	/**
	 * Returns the value of the '<em><b>Switching Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Schedule</em>' reference.
	 * @see #setSwitchingSchedule(SwitchingSchedule)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_SwitchingSchedule()
	 * @see CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps
	 * @model opposite="ScheduleSteps"
	 * @generated
	 */
	SwitchingSchedule getSwitchingSchedule();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule <em>Switching Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switching Schedule</em>' reference.
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	void setSwitchingSchedule(SwitchingSchedule value);

	/**
	 * Returns the value of the '<em><b>Safety Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Document</em>' reference.
	 * @see #setSafetyDocument(SafetyDocument)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_SafetyDocument()
	 * @see CIM.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps
	 * @model opposite="ScheduleSteps"
	 * @generated
	 */
	SafetyDocument getSafetyDocument();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument <em>Safety Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Document</em>' reference.
	 * @see #getSafetyDocument()
	 * @generated
	 */
	void setSafetyDocument(SafetyDocument value);

	/**
	 * Returns the value of the '<em><b>Required Control Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Control Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Control Action</em>' attribute.
	 * @see #setRequiredControlAction(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_RequiredControlAction()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Control actions required to perform this step.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Control actions required to perform this step.'"
	 * @generated
	 */
	String getRequiredControlAction();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction <em>Required Control Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Control Action</em>' attribute.
	 * @see #getRequiredControlAction()
	 * @generated
	 */
	void setRequiredControlAction(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_Text()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information regarding this switching schedule step.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information regarding this switching schedule step.'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PowerSystemResource#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_PowerSystemResources()
	 * @see CIM.IEC61970.Core.PowerSystemResource#getScheduleSteps
	 * @model opposite="ScheduleSteps"
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResources();

	/**
	 * Returns the value of the '<em><b>Required Control Action Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Control Action Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Control Action Interval</em>' reference.
	 * @see #setRequiredControlActionInterval(DateTimeInterval)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_RequiredControlActionInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval between \'requiredControlAction\' was issued and completed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval between \'requiredControlAction\' was issued and completed.'"
	 * @generated
	 */
	DateTimeInterval getRequiredControlActionInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlActionInterval <em>Required Control Action Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Control Action Interval</em>' reference.
	 * @see #getRequiredControlActionInterval()
	 * @generated
	 */
	void setRequiredControlActionInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Desired End State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired End State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired End State</em>' attribute.
	 * @see #setDesiredEndState(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep_DesiredEndState()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Desired end state for the associated PowerSystemResource as a result of this schedule step.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Desired end state for the associated PowerSystemResource as a result of this schedule step.'"
	 * @generated
	 */
	String getDesiredEndState();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState <em>Desired End State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired End State</em>' attribute.
	 * @see #getDesiredEndState()
	 * @generated
	 */
	void setDesiredEndState(String value);

} // SwitchingStep
