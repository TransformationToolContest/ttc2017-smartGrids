/**
 */
package gluemodel.CIM.IEC61970.Meas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Discrete#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Discrete#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Discrete#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Discrete#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Discrete#getCommand <em>Command</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.Discrete#getDiscreteValues <em>Discrete Values</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscrete()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Discrete represents a discrete Measurement, i.e. a Measurement reprsenting discrete values, e.g. a Breaker position.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Discrete represents a discrete Measurement, i.e. a Measurement reprsenting discrete values, e.g. a Breaker position.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Discrete represents a discrete Measurement, i.e. a Measurement reprsenting discrete values, e.g. a Breaker position.' Profile\040documentation='Discrete represents a discrete Measurement, i.e. a Measurement reprsenting discrete values, e.g. a Breaker position.'"
 * @generated
 */
public interface Discrete extends Measurement {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscrete_MinValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value range minimum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value range minimum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values'"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Discrete#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.ValueAliasSet#getDiscretes <em>Discretes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Alias Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Alias Set</em>' reference.
	 * @see #setValueAliasSet(ValueAliasSet)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscrete_ValueAliasSet()
	 * @see gluemodel.CIM.IEC61970.Meas.ValueAliasSet#getDiscretes
	 * @model opposite="Discretes"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The ValueAliasSet used for translation of a MeasurementValue.value to a name'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The ValueAliasSet used for translation of a MeasurementValue.value to a name'"
	 * @generated
	 */
	ValueAliasSet getValueAliasSet();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Discrete#getValueAliasSet <em>Value Alias Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Alias Set</em>' reference.
	 * @see #getValueAliasSet()
	 * @generated
	 */
	void setValueAliasSet(ValueAliasSet value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscrete_MaxValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal value range maximum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal value range maximum for any of the MeasurementValue.values. Used for scaling, e.g. in bar graphs or of telemetered raw values.'"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Discrete#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Value</em>' attribute.
	 * @see #setNormalValue(int)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscrete_NormalValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal measurement value, e.g., used for percentage calculations.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal measurement value, e.g., used for percentage calculations.'"
	 * @generated
	 */
	int getNormalValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Discrete#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Value</em>' attribute.
	 * @see #getNormalValue()
	 * @generated
	 */
	void setNormalValue(int value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Command#getDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscrete_Command()
	 * @see gluemodel.CIM.IEC61970.Meas.Command#getDiscrete
	 * @model opposite="Discrete"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Control variable associated with the Measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Control variable associated with the Measurement.'"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Meas.Discrete#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Discrete Values</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.DiscreteValue}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.DiscreteValue#getDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete Values</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Meas.MeasPackage#getDiscrete_DiscreteValues()
	 * @see gluemodel.CIM.IEC61970.Meas.DiscreteValue#getDiscrete
	 * @model opposite="Discrete"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The values connected to this measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The values connected to this measurement.'"
	 * @generated
	 */
	EList<DiscreteValue> getDiscreteValues();

} // Discrete
