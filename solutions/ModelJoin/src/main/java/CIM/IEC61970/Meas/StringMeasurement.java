/**
 */
package CIM.IEC61970.Meas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getStringMeasurement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='StringMeasurement represents a measurement with values of type string.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='StringMeasurement represents a measurement with values of type string.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='StringMeasurement represents a measurement with values of type string.' Profile\040documentation='StringMeasurement represents a measurement with values of type string.'"
 * @generated
 */
public interface StringMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>String Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.StringMeasurementValue}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Measurement Values</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getStringMeasurement_StringMeasurementValues()
	 * @see CIM.IEC61970.Meas.StringMeasurementValue#getStringMeasurement
	 * @model opposite="StringMeasurement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The values connected to this measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The values connected to this measurement.'"
	 * @generated
	 */
	EList<StringMeasurementValue> getStringMeasurementValues();

} // StringMeasurement
