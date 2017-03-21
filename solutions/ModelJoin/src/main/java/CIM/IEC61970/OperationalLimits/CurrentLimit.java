/**
 */
package CIM.IEC61970.OperationalLimits;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.OperationalLimits.CurrentLimit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getCurrentLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operational limit on current.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Operational limit on current.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operational limit on current.' Profile\040documentation='Operational limit on current.'"
 * @generated
 */
public interface CurrentLimit extends OperationalLimit {
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
	 * @see CIM.IEC61970.OperationalLimits.OperationalLimitsPackage#getCurrentLimit_Value()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Limit on current flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limit on current flow.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.OperationalLimits.CurrentLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // CurrentLimit
