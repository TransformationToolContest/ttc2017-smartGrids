/**
 */
package CIM.IEC61970.Meas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.Analog#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Analog#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Analog#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Analog#getLimitSets <em>Limit Sets</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Analog#getSetPoint <em>Set Point</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.Analog#getAnalogValues <em>Analog Values</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getAnalog()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Analog represents an analog Measurement.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Analog represents an analog Measurement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Analog represents an analog Measurement.' Profile\040documentation='Analog represents an analog Measurement.'"
 * @generated
 */
public interface Analog extends Measurement {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(float)
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalog_MinValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value range minimum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value range minimum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values'"
	 * @generated
	 */
	float getMinValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Analog#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(float value);

	/**
	 * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Value</em>' attribute.
	 * @see #setNormalValue(float)
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalog_NormalValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal measurement value, e.g., used for percentage calculations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal measurement value, e.g., used for percentage calculations.'"
	 * @generated
	 */
	float getNormalValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Analog#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Value</em>' attribute.
	 * @see #getNormalValue()
	 * @generated
	 */
	void setNormalValue(float value);

	/**
	 * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Flow In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Flow In</em>' attribute.
	 * @see #setPositiveFlowIn(boolean)
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalog_PositiveFlowIn()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If true then this measurement is an active power, reactive power or current with the convention that a positive value measured at the Terminal means power is flowing into the related PowerSystemResource.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If true then this measurement is an active power, reactive power or current with the convention that a positive value measured at the Terminal means power is flowing into the related PowerSystemResource.'"
	 * @generated
	 */
	boolean isPositiveFlowIn();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isPositiveFlowIn()
	 * @generated
	 */
	void setPositiveFlowIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(float)
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalog_MaxValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value range maximum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value range maximum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values.'"
	 * @generated
	 */
	float getMaxValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Analog#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(float value);

	/**
	 * Returns the value of the '<em><b>Limit Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.AnalogLimitSet}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.AnalogLimitSet#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Sets</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalog_LimitSets()
	 * @see CIM.IEC61970.Meas.AnalogLimitSet#getMeasurements
	 * @model opposite="Measurements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A measurement may have zero or more limit ranges defined for it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A measurement may have zero or more limit ranges defined for it.'"
	 * @generated
	 */
	EList<AnalogLimitSet> getLimitSets();

	/**
	 * Returns the value of the '<em><b>Set Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.SetPoint#getAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Point</em>' reference.
	 * @see #setSetPoint(SetPoint)
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalog_SetPoint()
	 * @see CIM.IEC61970.Meas.SetPoint#getAnalog
	 * @model opposite="Analog"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Control variable associated with the Measurement'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Control variable associated with the Measurement'"
	 * @generated
	 */
	SetPoint getSetPoint();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.Analog#getSetPoint <em>Set Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Point</em>' reference.
	 * @see #getSetPoint()
	 * @generated
	 */
	void setSetPoint(SetPoint value);

	/**
	 * Returns the value of the '<em><b>Analog Values</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.AnalogValue}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.AnalogValue#getAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Values</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getAnalog_AnalogValues()
	 * @see CIM.IEC61970.Meas.AnalogValue#getAnalog
	 * @model opposite="Analog"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The values connected to this measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The values connected to this measurement.'"
	 * @generated
	 */
	EList<AnalogValue> getAnalogValues();

} // Analog
