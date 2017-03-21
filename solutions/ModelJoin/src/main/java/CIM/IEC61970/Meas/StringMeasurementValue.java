/**
 */
package CIM.IEC61970.Meas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.StringMeasurementValue#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getStringMeasurementValue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='StringMeasurementValue represents a measurement value of type string.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='StringMeasurementValue represents a measurement value of type string.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='StringMeasurementValue represents a measurement value of type string.' Profile\040documentation='StringMeasurementValue represents a measurement value of type string.'"
 * @generated
 */
public interface StringMeasurementValue extends MeasurementValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CIM.IEC61970.Meas.MeasPackage#getStringMeasurementValue_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value to supervise.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value to supervise.'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.StringMeasurementValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>String Measurement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Measurement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Measurement</em>' reference.
	 * @see #setStringMeasurement(StringMeasurement)
	 * @see CIM.IEC61970.Meas.MeasPackage#getStringMeasurementValue_StringMeasurement()
	 * @see CIM.IEC61970.Meas.StringMeasurement#getStringMeasurementValues
	 * @model opposite="StringMeasurementValues"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement to which this value is connected.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement to which this value is connected.'"
	 * @generated
	 */
	StringMeasurement getStringMeasurement();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Measurement</em>' reference.
	 * @see #getStringMeasurement()
	 * @generated
	 */
	void setStringMeasurement(StringMeasurement value);

} // StringMeasurementValue
