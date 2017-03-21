/**
 */
package CIM.IEC61970.Meas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.AnalogLimit#getLimitSet <em>Limit Set</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.AnalogLimit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogLimit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Limit values for Analog measurements'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Limit values for Analog measurements'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Limit values for Analog measurements' Profile\040documentation='Limit values for Analog measurements'"
 * @generated
 */
public interface AnalogLimit extends Limit {
	/**
	 * Returns the value of the '<em><b>Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.AnalogLimitSet#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Set</em>' reference.
	 * @see #setLimitSet(AnalogLimitSet)
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogLimit_LimitSet()
	 * @see CIM.IEC61970.Meas.AnalogLimitSet#getLimits
	 * @model opposite="Limits"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The set of limits.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The set of limits.'"
	 * @generated
	 */
	AnalogLimitSet getLimitSet();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.AnalogLimit#getLimitSet <em>Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Set</em>' reference.
	 * @see #getLimitSet()
	 * @generated
	 */
	void setLimitSet(AnalogLimitSet value);

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
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogLimit_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value to supervise against.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value to supervise against.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.AnalogLimit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // AnalogLimit
