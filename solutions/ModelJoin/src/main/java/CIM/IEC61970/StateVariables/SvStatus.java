/**
 */
package CIM.IEC61970.StateVariables;

import CIM.IEC61970.Core.ConductingEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.SvStatus#isInService <em>In Service</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvStatus()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='State variable for status.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='State variable for status.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='State variable for status.' Profile\040documentation='State variable for status.'"
 * @generated
 */
public interface SvStatus extends StateVariable {
	/**
	 * Returns the value of the '<em><b>In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Service</em>' attribute.
	 * @see #setInService(boolean)
	 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvStatus_InService()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The in service status as a result of topology processing.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The in service status as a result of topology processing.'"
	 * @generated
	 */
	boolean isInService();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.StateVariables.SvStatus#isInService <em>In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Service</em>' attribute.
	 * @see #isInService()
	 * @generated
	 */
	void setInService(boolean value);

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.ConductingEquipment#getSvStatus <em>Sv Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvStatus_ConductingEquipment()
	 * @see CIM.IEC61970.Core.ConductingEquipment#getSvStatus
	 * @model opposite="SvStatus"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The conducting equipment associated with the status state.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The conducting equipment associated with the status state.'"
	 * @generated
	 */
	ConductingEquipment getConductingEquipment();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.StateVariables.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducting Equipment</em>' reference.
	 * @see #getConductingEquipment()
	 * @generated
	 */
	void setConductingEquipment(ConductingEquipment value);

} // SvStatus
