/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61970.Core.ConductingEquipment;

import CIM.IEC61970.Informative.InfCommon.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Step Psr Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep <em>Outage Step</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStepPsrRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Power System Resources and Outage Steps. Examples roles include: normal supply, actual supply, interrupting device, restoration device.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Power System Resources and Outage Steps. Examples roles include: normal supply, actual supply, interrupting device, restoration device.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Power System Resources and Outage Steps. Examples roles include: normal supply, actual supply, interrupting device, restoration device.' Profile\040documentation='Roles played between Power System Resources and Outage Steps. Examples roles include: normal supply, actual supply, interrupting device, restoration device.'"
 * @generated
 */
public interface OutageStepPsrRole extends Role {
	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ConductingEquipment#getOutageStepRoles <em>Outage Step Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStepPsrRole_ConductingEquipment()
	 * @see CIM.IEC61970.Core.ConductingEquipment#getOutageStepRoles
	 * @model opposite="OutageStepRoles"
	 * @generated
	 */
	ConductingEquipment getConductingEquipment();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducting Equipment</em>' reference.
	 * @see #getConductingEquipment()
	 * @generated
	 */
	void setConductingEquipment(ConductingEquipment value);

	/**
	 * Returns the value of the '<em><b>Outage Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles <em>Conducting Equipment Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Step</em>' reference.
	 * @see #setOutageStep(OutageStep)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStepPsrRole_OutageStep()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles
	 * @model opposite="ConductingEquipmentRoles"
	 * @generated
	 */
	OutageStep getOutageStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep <em>Outage Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Step</em>' reference.
	 * @see #getOutageStep()
	 * @generated
	 */
	void setOutageStep(OutageStep value);

} // OutageStepPsrRole
