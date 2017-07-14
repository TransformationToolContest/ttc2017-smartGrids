/**
 */
package gluemodel.CIM.IEC61970.Meas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.DiscreteValue#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.DiscreteValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscreteValue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='DiscreteValue represents a discrete MeasurementValue.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='DiscreteValue represents a discrete MeasurementValue.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='DiscreteValue represents a discrete MeasurementValue.' Profile\040documentation='DiscreteValue represents a discrete MeasurementValue.'"
 * @generated
 */
public interface DiscreteValue extends MeasurementValue {
	/**
	 * Returns the value of the '<em><b>Discrete</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Discrete#getDiscreteValues <em>Discrete Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete</em>' reference.
	 * @see #setDiscrete(Discrete)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscreteValue_Discrete()
	 * @see gluemodel.CIM.IEC61970.Meas.Discrete#getDiscreteValues
	 * @model opposite="DiscreteValues"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Measurement to which this value is connected.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Measurement to which this value is connected.'"
	 * @generated
	 */
	Discrete getDiscrete();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.DiscreteValue#getDiscrete <em>Discrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete</em>' reference.
	 * @see #getDiscrete()
	 * @generated
	 */
	void setDiscrete(Discrete value);

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
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscreteValue_Value()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value to supervise.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value to supervise.'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.DiscreteValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // DiscreteValue
