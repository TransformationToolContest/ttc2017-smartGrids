/**
 */
package CIM.IEC61970.Meas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Meas.MeasPackage
 * @generated
 */
public interface MeasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasFactory eINSTANCE = CIM.IEC61970.Meas.impl.MeasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Accumulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accumulator</em>'.
	 * @generated
	 */
	Accumulator createAccumulator();

	/**
	 * Returns a new object of class '<em>Measurement Value Quality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Value Quality</em>'.
	 * @generated
	 */
	MeasurementValueQuality createMeasurementValueQuality();

	/**
	 * Returns a new object of class '<em>Accumulator Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accumulator Limit</em>'.
	 * @generated
	 */
	AccumulatorLimit createAccumulatorLimit();

	/**
	 * Returns a new object of class '<em>Potential Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Potential Transformer</em>'.
	 * @generated
	 */
	PotentialTransformer createPotentialTransformer();

	/**
	 * Returns a new object of class '<em>Measurement Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Value</em>'.
	 * @generated
	 */
	MeasurementValue createMeasurementValue();

	/**
	 * Returns a new object of class '<em>Analog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog</em>'.
	 * @generated
	 */
	Analog createAnalog();

	/**
	 * Returns a new object of class '<em>String Measurement Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Measurement Value</em>'.
	 * @generated
	 */
	StringMeasurementValue createStringMeasurementValue();

	/**
	 * Returns a new object of class '<em>Value To Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value To Alias</em>'.
	 * @generated
	 */
	ValueToAlias createValueToAlias();

	/**
	 * Returns a new object of class '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit</em>'.
	 * @generated
	 */
	Limit createLimit();

	/**
	 * Returns a new object of class '<em>Current Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Transformer</em>'.
	 * @generated
	 */
	CurrentTransformer createCurrentTransformer();

	/**
	 * Returns a new object of class '<em>Analog Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Limit Set</em>'.
	 * @generated
	 */
	AnalogLimitSet createAnalogLimitSet();

	/**
	 * Returns a new object of class '<em>Accumulator Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accumulator Value</em>'.
	 * @generated
	 */
	AccumulatorValue createAccumulatorValue();

	/**
	 * Returns a new object of class '<em>Set Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Point</em>'.
	 * @generated
	 */
	SetPoint createSetPoint();

	/**
	 * Returns a new object of class '<em>Discrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Value</em>'.
	 * @generated
	 */
	DiscreteValue createDiscreteValue();

	/**
	 * Returns a new object of class '<em>Analog Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Value</em>'.
	 * @generated
	 */
	AnalogValue createAnalogValue();

	/**
	 * Returns a new object of class '<em>Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Type</em>'.
	 * @generated
	 */
	ControlType createControlType();

	/**
	 * Returns a new object of class '<em>Measurement Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Value Source</em>'.
	 * @generated
	 */
	MeasurementValueSource createMeasurementValueSource();

	/**
	 * Returns a new object of class '<em>Analog Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Limit</em>'.
	 * @generated
	 */
	AnalogLimit createAnalogLimit();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement</em>'.
	 * @generated
	 */
	Measurement createMeasurement();

	/**
	 * Returns a new object of class '<em>Value Alias Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Alias Set</em>'.
	 * @generated
	 */
	ValueAliasSet createValueAliasSet();

	/**
	 * Returns a new object of class '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control</em>'.
	 * @generated
	 */
	Control createControl();

	/**
	 * Returns a new object of class '<em>Accumulator Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accumulator Limit Set</em>'.
	 * @generated
	 */
	AccumulatorLimitSet createAccumulatorLimitSet();

	/**
	 * Returns a new object of class '<em>Quality61850</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality61850</em>'.
	 * @generated
	 */
	Quality61850 createQuality61850();

	/**
	 * Returns a new object of class '<em>Discrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete</em>'.
	 * @generated
	 */
	Discrete createDiscrete();

	/**
	 * Returns a new object of class '<em>String Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Measurement</em>'.
	 * @generated
	 */
	StringMeasurement createStringMeasurement();

	/**
	 * Returns a new object of class '<em>Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit Set</em>'.
	 * @generated
	 */
	LimitSet createLimitSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MeasPackage getMeasPackage();

} //MeasFactory
