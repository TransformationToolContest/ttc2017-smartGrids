/**
 */
package CIM.IEC61970.OperationalLimits;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apparent Power Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getApparentPowerLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Apparent power limit.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Apparent power limit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Apparent power limit.' Profile\040documentation='Apparent power limit.'"
 * @generated
 */
public interface ApparentPowerLimit extends OperationalLimit {
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
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getApparentPowerLimit_Value()
	 * @model dataType="CIM.IEC61970.Domain.ApparentPower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The apparent power limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The apparent power limit.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // ApparentPowerLimit
