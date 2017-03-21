/**
 */
package CIM.IEC61970.Meas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.Command#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Command#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Command#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Command#getDiscrete <em>Discrete</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getCommand()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Command is a discrete control used for supervisory control.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Command is a discrete control used for supervisory control.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Command is a discrete control used for supervisory control.' Profile\040documentation='A Command is a discrete control used for supervisory control.'"
 * @generated
 */
public interface Command extends Control {
	/**
	 * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Value</em>' attribute.
	 * @see #setNormalValue(int)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCommand_NormalValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value for Control.value e.g. used for percentage scaling'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value for Control.value e.g. used for percentage scaling'"
	 * @generated
	 */
	int getNormalValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Command#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Value</em>' attribute.
	 * @see #getNormalValue()
	 * @generated
	 */
	void setNormalValue(int value);

	/**
	 * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.ValueAliasSet#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Alias Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Alias Set</em>' reference.
	 * @see #setValueAliasSet(ValueAliasSet)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCommand_ValueAliasSet()
	 * @see CIM.IEC61970.Meas.ValueAliasSet#getCommands
	 * @model opposite="Commands"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Commands using the set for translation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Commands using the set for translation.'"
	 * @generated
	 */
	ValueAliasSet getValueAliasSet();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Command#getValueAliasSet <em>Value Alias Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Alias Set</em>' reference.
	 * @see #getValueAliasSet()
	 * @generated
	 */
	void setValueAliasSet(ValueAliasSet value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCommand_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value representing the actuator output'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value representing the actuator output'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Command#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Discrete</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Discrete#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete</em>' reference.
	 * @see #setDiscrete(Discrete)
	 * @see CIM.IEC61970.Meas.MeasPackage#getCommand_Discrete()
	 * @see CIM.IEC61970.Meas.Discrete#getCommand
	 * @model opposite="Command"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Measurement variable used for control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Measurement variable used for control.'"
	 * @generated
	 */
	Discrete getDiscrete();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Command#getDiscrete <em>Discrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete</em>' reference.
	 * @see #getDiscrete()
	 * @generated
	 */
	void setDiscrete(Discrete value);

} // Command
