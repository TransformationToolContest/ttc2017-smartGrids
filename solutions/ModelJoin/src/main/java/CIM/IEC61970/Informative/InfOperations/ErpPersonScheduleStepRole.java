/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61970.Informative.InfCommon.Role;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Person Schedule Step Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep <em>Switching Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson <em>Erp Person</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getErpPersonScheduleStepRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Persons and Schedule Steps.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Persons and Schedule Steps.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Persons and Schedule Steps.' Profile\040documentation='Roles played between Persons and Schedule Steps.'"
 * @generated
 */
public interface ErpPersonScheduleStepRole extends Role {
	/**
	 * Returns the value of the '<em><b>Switching Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole <em>Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Step</em>' reference.
	 * @see #setSwitchingStep(SwitchingStep)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getErpPersonScheduleStepRole_SwitchingStep()
	 * @see CIM.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole
	 * @model opposite="ErpPersonRole"
	 * @generated
	 */
	SwitchingStep getSwitchingStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep <em>Switching Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switching Step</em>' reference.
	 * @see #getSwitchingStep()
	 * @generated
	 */
	void setSwitchingStep(SwitchingStep value);

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles <em>Switching Step Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getErpPersonScheduleStepRole_ErpPerson()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles
	 * @model opposite="SwitchingStepRoles"
	 * @generated
	 */
	ErpPerson getErpPerson();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	void setErpPerson(ErpPerson value);

} // ErpPersonScheduleStepRole
