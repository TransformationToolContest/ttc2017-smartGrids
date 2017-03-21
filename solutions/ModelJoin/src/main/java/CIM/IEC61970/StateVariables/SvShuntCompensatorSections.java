/**
 */
package CIM.IEC61970.StateVariables;

import CIM.IEC61970.Wires.ShuntCompensator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Shunt Compensator Sections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getContinuousSections <em>Continuous Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getSections <em>Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShuntCompensatorSections()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='State variable for the number of sections in service for a shunt compensator.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='State variable for the number of sections in service for a shunt compensator.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='State variable for the number of sections in service for a shunt compensator.' Profile\040documentation='State variable for the number of sections in service for a shunt compensator.'"
 * @generated
 */
public interface SvShuntCompensatorSections extends StateVariable {
	/**
	 * Returns the value of the '<em><b>Continuous Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuous Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuous Sections</em>' attribute.
	 * @see #setContinuousSections(float)
	 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShuntCompensatorSections_ContinuousSections()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The number of sections in service as a continous variable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The number of sections in service as a continous variable.'"
	 * @generated
	 */
	float getContinuousSections();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getContinuousSections <em>Continuous Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuous Sections</em>' attribute.
	 * @see #getContinuousSections()
	 * @generated
	 */
	void setContinuousSections(float value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' attribute.
	 * @see #setSections(int)
	 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShuntCompensatorSections_Sections()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The number of sections in service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The number of sections in service.'"
	 * @generated
	 */
	int getSections();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' attribute.
	 * @see #getSections()
	 * @generated
	 */
	void setSections(int value);

	/**
	 * Returns the value of the '<em><b>Shunt Compensator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt Compensator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt Compensator</em>' reference.
	 * @see #setShuntCompensator(ShuntCompensator)
	 * @see CIM.IEC61970.StateVariables.StateVariablesPackage#getSvShuntCompensatorSections_ShuntCompensator()
	 * @see CIM.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections
	 * @model opposite="SvShuntCompensatorSections"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The shunt compensator for which the state applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The shunt compensator for which the state applies.'"
	 * @generated
	 */
	ShuntCompensator getShuntCompensator();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt Compensator</em>' reference.
	 * @see #getShuntCompensator()
	 * @generated
	 */
	void setShuntCompensator(ShuntCompensator value);

} // SvShuntCompensatorSections
