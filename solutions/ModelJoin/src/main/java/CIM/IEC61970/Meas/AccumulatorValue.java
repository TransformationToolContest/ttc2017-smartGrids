/**
 */
package CIM.IEC61970.Meas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accumulator Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.AccumulatorValue#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.AccumulatorValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getAccumulatorValue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='AccumulatorValue represents a accumulated (counted) MeasurementValue.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='AccumulatorValue represents a accumulated (counted) MeasurementValue.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AccumulatorValue represents a accumulated (counted) MeasurementValue.' Profile\040documentation='AccumulatorValue represents a accumulated (counted) MeasurementValue.'"
 * @generated
 */
public interface AccumulatorValue extends MeasurementValue {
	/**
	 * Returns the value of the '<em><b>Accumulator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulator</em>' reference.
	 * @see #setAccumulator(Accumulator)
	 * @see CIM.IEC61970.Meas.MeasPackage#getAccumulatorValue_Accumulator()
	 * @see CIM.IEC61970.Meas.Accumulator#getAccumulatorValues
	 * @model opposite="AccumulatorValues"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement to which this value is connected.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement to which this value is connected.'"
	 * @generated
	 */
	Accumulator getAccumulator();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.AccumulatorValue#getAccumulator <em>Accumulator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulator</em>' reference.
	 * @see #getAccumulator()
	 * @generated
	 */
	void setAccumulator(Accumulator value);

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
	 * @see CIM.IEC61970.Meas.MeasPackage#getAccumulatorValue_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value to supervise. The value is positive.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value to supervise. The value is positive.'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Meas.AccumulatorValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // AccumulatorValue
