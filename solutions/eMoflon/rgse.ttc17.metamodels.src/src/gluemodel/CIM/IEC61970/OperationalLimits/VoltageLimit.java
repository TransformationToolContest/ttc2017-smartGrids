/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.VoltageLimit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getVoltageLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operational limit applied to voltage.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Operational limit applied to voltage.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operational limit applied to voltage.' Profile\040documentation='Operational limit applied to voltage.'"
 * @generated
 */
public interface VoltageLimit extends OperationalLimit {
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
	 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getVoltageLimit_Value()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Limit on voltage. High or low limit depends on the OperatoinalLimit.limitKind'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limit on voltage. High or low limit depends on the OperatoinalLimit.limitKind'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.OperationalLimits.VoltageLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // VoltageLimit
