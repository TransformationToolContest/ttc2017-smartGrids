/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Power Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getActivePowerLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Limit on active power flow.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Limit on active power flow.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limit on active power flow.' Profile\040documentation='Limit on active power flow.'"
 * @generated
 */
public interface ActivePowerLimit extends OperationalLimit {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getActivePowerLimit_Value()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Value of active power limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Value of active power limit.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // ActivePowerLimit
