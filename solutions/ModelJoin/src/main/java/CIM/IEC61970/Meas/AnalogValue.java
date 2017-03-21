/**
 */
package CIM.IEC61970.Meas;

import CIM.IEC61970.ControlArea.AltGeneratingUnitMeas;
import CIM.IEC61970.ControlArea.AltTieMeas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.AnalogValue#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.AnalogValue#getAnalog <em>Analog</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogValue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='AnalogValue represents an analog MeasurementValue.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='AnalogValue represents an analog MeasurementValue.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AnalogValue represents an analog MeasurementValue.' Profile\040documentation='AnalogValue represents an analog MeasurementValue.'"
 * @generated
 */
public interface AnalogValue extends MeasurementValue {
	/**
	 * Returns the value of the '<em><b>Alt Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Generating Unit</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogValue_AltGeneratingUnit()
	 * @see CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue
	 * @model opposite="AnalogValue"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The alternate generating unit for which this measurement value applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The alternate generating unit for which this measurement value applies.'"
	 * @generated
	 */
	EList<AltGeneratingUnitMeas> getAltGeneratingUnit();

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
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogValue_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value to supervise.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value to supervise.'"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.AnalogValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Alt Tie Meas</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.ControlArea.AltTieMeas}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.AltTieMeas#getAnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Tie Meas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Tie Meas</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogValue_AltTieMeas()
	 * @see CIM.IEC61970.ControlArea.AltTieMeas#getAnalogValue
	 * @model opposite="AnalogValue"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The usage of the measurement within the control area specification.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The usage of the measurement within the control area specification.'"
	 * @generated
	 */
	EList<AltTieMeas> getAltTieMeas();

	/**
	 * Returns the value of the '<em><b>Analog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Analog#getAnalogValues <em>Analog Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog</em>' reference.
	 * @see #setAnalog(Analog)
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalogValue_Analog()
	 * @see CIM.IEC61970.Meas.Analog#getAnalogValues
	 * @model opposite="AnalogValues"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement to which this value is connected.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement to which this value is connected.'"
	 * @generated
	 */
	Analog getAnalog();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.AnalogValue#getAnalog <em>Analog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analog</em>' reference.
	 * @see #getAnalog()
	 * @generated
	 */
	void setAnalog(Analog value);

} // AnalogValue
