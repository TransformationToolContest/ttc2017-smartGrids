/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Meas.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasFactoryImpl extends EFactoryImpl implements MeasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasFactory init() {
		try {
			MeasFactory theMeasFactory = (MeasFactory)EPackage.Registry.INSTANCE.getEFactory(MeasPackage.eNS_URI);
			if (theMeasFactory != null) {
				return theMeasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MeasPackage.ACCUMULATOR: return createAccumulator();
			case MeasPackage.MEASUREMENT_VALUE_QUALITY: return createMeasurementValueQuality();
			case MeasPackage.ACCUMULATOR_LIMIT: return createAccumulatorLimit();
			case MeasPackage.POTENTIAL_TRANSFORMER: return createPotentialTransformer();
			case MeasPackage.MEASUREMENT_VALUE: return createMeasurementValue();
			case MeasPackage.ANALOG: return createAnalog();
			case MeasPackage.STRING_MEASUREMENT_VALUE: return createStringMeasurementValue();
			case MeasPackage.VALUE_TO_ALIAS: return createValueToAlias();
			case MeasPackage.LIMIT: return createLimit();
			case MeasPackage.CURRENT_TRANSFORMER: return createCurrentTransformer();
			case MeasPackage.ANALOG_LIMIT_SET: return createAnalogLimitSet();
			case MeasPackage.ACCUMULATOR_VALUE: return createAccumulatorValue();
			case MeasPackage.SET_POINT: return createSetPoint();
			case MeasPackage.DISCRETE_VALUE: return createDiscreteValue();
			case MeasPackage.ANALOG_VALUE: return createAnalogValue();
			case MeasPackage.CONTROL_TYPE: return createControlType();
			case MeasPackage.MEASUREMENT_VALUE_SOURCE: return createMeasurementValueSource();
			case MeasPackage.ANALOG_LIMIT: return createAnalogLimit();
			case MeasPackage.COMMAND: return createCommand();
			case MeasPackage.MEASUREMENT: return createMeasurement();
			case MeasPackage.VALUE_ALIAS_SET: return createValueAliasSet();
			case MeasPackage.CONTROL: return createControl();
			case MeasPackage.ACCUMULATOR_LIMIT_SET: return createAccumulatorLimitSet();
			case MeasPackage.QUALITY61850: return createQuality61850();
			case MeasPackage.DISCRETE: return createDiscrete();
			case MeasPackage.STRING_MEASUREMENT: return createStringMeasurement();
			case MeasPackage.LIMIT_SET: return createLimitSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MeasPackage.VALIDITY:
				return createValidityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MeasPackage.VALIDITY:
				return convertValidityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator createAccumulator() {
		AccumulatorImpl accumulator = new AccumulatorImpl();
		return accumulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueQuality createMeasurementValueQuality() {
		MeasurementValueQualityImpl measurementValueQuality = new MeasurementValueQualityImpl();
		return measurementValueQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorLimit createAccumulatorLimit() {
		AccumulatorLimitImpl accumulatorLimit = new AccumulatorLimitImpl();
		return accumulatorLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialTransformer createPotentialTransformer() {
		PotentialTransformerImpl potentialTransformer = new PotentialTransformerImpl();
		return potentialTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue createMeasurementValue() {
		MeasurementValueImpl measurementValue = new MeasurementValueImpl();
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog createAnalog() {
		AnalogImpl analog = new AnalogImpl();
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMeasurementValue createStringMeasurementValue() {
		StringMeasurementValueImpl stringMeasurementValue = new StringMeasurementValueImpl();
		return stringMeasurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueToAlias createValueToAlias() {
		ValueToAliasImpl valueToAlias = new ValueToAliasImpl();
		return valueToAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit createLimit() {
		LimitImpl limit = new LimitImpl();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTransformer createCurrentTransformer() {
		CurrentTransformerImpl currentTransformer = new CurrentTransformerImpl();
		return currentTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogLimitSet createAnalogLimitSet() {
		AnalogLimitSetImpl analogLimitSet = new AnalogLimitSetImpl();
		return analogLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorValue createAccumulatorValue() {
		AccumulatorValueImpl accumulatorValue = new AccumulatorValueImpl();
		return accumulatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPoint createSetPoint() {
		SetPointImpl setPoint = new SetPointImpl();
		return setPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteValue createDiscreteValue() {
		DiscreteValueImpl discreteValue = new DiscreteValueImpl();
		return discreteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue createAnalogValue() {
		AnalogValueImpl analogValue = new AnalogValueImpl();
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlType() {
		ControlTypeImpl controlType = new ControlTypeImpl();
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource createMeasurementValueSource() {
		MeasurementValueSourceImpl measurementValueSource = new MeasurementValueSourceImpl();
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogLimit createAnalogLimit() {
		AnalogLimitImpl analogLimit = new AnalogLimitImpl();
		return analogLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAliasSet createValueAliasSet() {
		ValueAliasSetImpl valueAliasSet = new ValueAliasSetImpl();
		return valueAliasSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorLimitSet createAccumulatorLimitSet() {
		AccumulatorLimitSetImpl accumulatorLimitSet = new AccumulatorLimitSetImpl();
		return accumulatorLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality61850 createQuality61850() {
		Quality61850Impl quality61850 = new Quality61850Impl();
		return quality61850;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete createDiscrete() {
		DiscreteImpl discrete = new DiscreteImpl();
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMeasurement createStringMeasurement() {
		StringMeasurementImpl stringMeasurement = new StringMeasurementImpl();
		return stringMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitSet createLimitSet() {
		LimitSetImpl limitSet = new LimitSetImpl();
		return limitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validity createValidityFromString(EDataType eDataType, String initialValue) {
		Validity result = Validity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasPackage getMeasPackage() {
		return (MeasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeasPackage getPackage() {
		return MeasPackage.eINSTANCE;
	}

} //MeasFactoryImpl
