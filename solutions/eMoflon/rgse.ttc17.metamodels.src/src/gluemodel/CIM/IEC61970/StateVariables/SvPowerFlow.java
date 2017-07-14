/**
 */
package gluemodel.CIM.IEC61970.StateVariables;

import gluemodel.CIM.IEC61970.Core.Terminal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Power Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getP <em>P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvPowerFlow()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='State variable for power flow.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='State variable for power flow.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='State variable for power flow.' Profile\040documentation='State variable for power flow.'"
 * @generated
 */
public interface SvPowerFlow extends StateVariable {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvPowerFlow_Terminal()
	 * @see gluemodel.CIM.IEC61970.Core.Terminal#getSvPowerFlow
	 * @model opposite="SvPowerFlow"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The terminal associated with the power flow state.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminal associated with the power flow state.'"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #setP(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvPowerFlow_P()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The active power flow into the terminal.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The active power flow into the terminal.'"
	 * @generated
	 */
	float getP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' attribute.
	 * @see #getP()
	 * @generated
	 */
	void setP(float value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' attribute.
	 * @see #setQ(float)
	 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage#getSvPowerFlow_Q()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reactive power flow into the terminal.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reactive power flow into the terminal.'"
	 * @generated
	 */
	float getQ();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.StateVariables.SvPowerFlow#getQ <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' attribute.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(float value);

} // SvPowerFlow
