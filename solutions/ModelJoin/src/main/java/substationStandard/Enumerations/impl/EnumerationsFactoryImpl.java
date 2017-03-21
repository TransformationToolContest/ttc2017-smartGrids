/**
 */
package substationStandard.Enumerations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import substationStandard.Enumerations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationsFactoryImpl extends EFactoryImpl implements EnumerationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumerationsFactory init() {
		try {
			EnumerationsFactory theEnumerationsFactory = (EnumerationsFactory)EPackage.Registry.INSTANCE.getEFactory(EnumerationsPackage.eNS_URI);
			if (theEnumerationsFactory != null) {
				return theEnumerationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnumerationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsFactoryImpl() {
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
			case EnumerationsPackage.TIME_ACCURACY_KIND:
				return createTimeAccuracyKindFromString(eDataType, initialValue);
			case EnumerationsPackage.ANGLE_REFERENCE_KIND:
				return createAngleReferenceKindFromString(eDataType, initialValue);
			case EnumerationsPackage.BS_CONTROL_KIND:
				return createBSControlKindFromString(eDataType, initialValue);
			case EnumerationsPackage.CMV_ANGLE_REFERENCE_KIND:
				return createCMVAngleReferenceKindFromString(eDataType, initialValue);
			case EnumerationsPackage.CONTROL_OUTPUT_KIND:
				return createControlOutputKindFromString(eDataType, initialValue);
			case EnumerationsPackage.CTL_MODELS_KIND:
				return createCtlModelsKindFromString(eDataType, initialValue);
			case EnumerationsPackage.CURVE_CHAR_KIND:
				return createCurveCharKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DP_STATUS_KIND:
				return createDPStatusKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DIRECTION_PHASE_KIND:
				return createDirectionPhaseKindFromString(eDataType, initialValue);
			case EnumerationsPackage.FAULT_DIRECTION_KIND:
				return createFaultDirectionKindFromString(eDataType, initialValue);
			case EnumerationsPackage.MAG_REFERENCE_KIND:
				return createMagReferenceKindFromString(eDataType, initialValue);
			case EnumerationsPackage.MULTIPLIER_KIND:
				return createMultiplierKindFromString(eDataType, initialValue);
			case EnumerationsPackage.ORIGINATOR_CATEGORY_KIND:
				return createOriginatorCategoryKindFromString(eDataType, initialValue);
			case EnumerationsPackage.PHASE_REFERENCE_KIND:
				return createPhaseReferenceKindFromString(eDataType, initialValue);
			case EnumerationsPackage.RANGE_KIND:
				return createRangeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.SBO_CLASSES_KIND:
				return createSboClassesKindFromString(eDataType, initialValue);
			case EnumerationsPackage.SEQUENCE_KIND:
				return createSequenceKindFromString(eDataType, initialValue);
			case EnumerationsPackage.SEVERITY_KIND:
				return createSeverityKindFromString(eDataType, initialValue);
			case EnumerationsPackage.SI_UNITS_KIND:
				return createSIUnitsKindFromString(eDataType, initialValue);
			case EnumerationsPackage.AUTO_RECLOSING_STATUS_KIND:
				return createAutoReclosingStatusKindFromString(eDataType, initialValue);
			case EnumerationsPackage.BREAKER_OPERATING_CAPABILITY_KIND:
				return createBreakerOperatingCapabilityKindFromString(eDataType, initialValue);
			case EnumerationsPackage.CURRENT_REVERSAL_MODE_KIND:
				return createCurrentReversalModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.DIRECTION_MODE_KIND:
				return createDirectionModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.FAILURE_DETECTION_MODE_KIND:
				return createFailureDetectionModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.FAN_CONTROL_KIND:
				return createFanControlKindFromString(eDataType, initialValue);
			case EnumerationsPackage.FAULT_LOOP_KIND:
				return createFaultLoopKindFromString(eDataType, initialValue);
			case EnumerationsPackage.GENERATOR_STATE_KIND:
				return createGeneratorStateKindFromString(eDataType, initialValue);
			case EnumerationsPackage.HEALTH_STATE_KIND:
				return createHealthStateKindFromString(eDataType, initialValue);
			case EnumerationsPackage.INTERNAL_TRIGGER_MODE_KIND:
				return createInternalTriggerModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.MODE_BEHAVIOUR_KIND:
				return createModeBehaviourKindFromString(eDataType, initialValue);
			case EnumerationsPackage.LIVE_DEAD_MODE_KIND:
				return createLiveDeadModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.POLARIZING_QUANTITY_KIND:
				return createPolarizingQuantityKindFromString(eDataType, initialValue);
			case EnumerationsPackage.PUMP_CONTROL_KIND:
				return createPumpControlKindFromString(eDataType, initialValue);
			case EnumerationsPackage.RECORDING_MODE_KIND:
				return createRecordingModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.RESET_CURVE_KIND:
				return createResetCurveKindFromString(eDataType, initialValue);
			case EnumerationsPackage.RESTRAINT_MODE_KIND:
				return createRestraintModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.RETRIP_MODE_KIND:
				return createRetripModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.SCHEME_TYPE_KIND:
				return createSchemeTypeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.SWITCHING_CAPABILITY_KIND:
				return createSwitchingCapabilityKindFromString(eDataType, initialValue);
			case EnumerationsPackage.SWITCH_TYPE_KIND:
				return createSwitchTypeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.TRIGGER_SOURCE_KIND:
				return createTriggerSourceKindFromString(eDataType, initialValue);
			case EnumerationsPackage.TRIP_MODE_KIND:
				return createTripModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.UNBLOCK_FUNCTION_MODE_KIND:
				return createUnblockFunctionModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.WEAK_END_INFEED_MODE_KIND:
				return createWeakEndInfeedModeKindFromString(eDataType, initialValue);
			case EnumerationsPackage.VALIDITY_KIND:
				return createValidityKindFromString(eDataType, initialValue);
			case EnumerationsPackage.SOURCE_KIND:
				return createSourceKindFromString(eDataType, initialValue);
			case EnumerationsPackage.FC_KIND:
				return createFcKindFromString(eDataType, initialValue);
			case EnumerationsPackage.TRG_OP_KIND:
				return createTrgOpKindFromString(eDataType, initialValue);
			case EnumerationsPackage.PRESENCE_CONDITION:
				return createPresenceConditionFromString(eDataType, initialValue);
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
			case EnumerationsPackage.TIME_ACCURACY_KIND:
				return convertTimeAccuracyKindToString(eDataType, instanceValue);
			case EnumerationsPackage.ANGLE_REFERENCE_KIND:
				return convertAngleReferenceKindToString(eDataType, instanceValue);
			case EnumerationsPackage.BS_CONTROL_KIND:
				return convertBSControlKindToString(eDataType, instanceValue);
			case EnumerationsPackage.CMV_ANGLE_REFERENCE_KIND:
				return convertCMVAngleReferenceKindToString(eDataType, instanceValue);
			case EnumerationsPackage.CONTROL_OUTPUT_KIND:
				return convertControlOutputKindToString(eDataType, instanceValue);
			case EnumerationsPackage.CTL_MODELS_KIND:
				return convertCtlModelsKindToString(eDataType, instanceValue);
			case EnumerationsPackage.CURVE_CHAR_KIND:
				return convertCurveCharKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DP_STATUS_KIND:
				return convertDPStatusKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DIRECTION_PHASE_KIND:
				return convertDirectionPhaseKindToString(eDataType, instanceValue);
			case EnumerationsPackage.FAULT_DIRECTION_KIND:
				return convertFaultDirectionKindToString(eDataType, instanceValue);
			case EnumerationsPackage.MAG_REFERENCE_KIND:
				return convertMagReferenceKindToString(eDataType, instanceValue);
			case EnumerationsPackage.MULTIPLIER_KIND:
				return convertMultiplierKindToString(eDataType, instanceValue);
			case EnumerationsPackage.ORIGINATOR_CATEGORY_KIND:
				return convertOriginatorCategoryKindToString(eDataType, instanceValue);
			case EnumerationsPackage.PHASE_REFERENCE_KIND:
				return convertPhaseReferenceKindToString(eDataType, instanceValue);
			case EnumerationsPackage.RANGE_KIND:
				return convertRangeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.SBO_CLASSES_KIND:
				return convertSboClassesKindToString(eDataType, instanceValue);
			case EnumerationsPackage.SEQUENCE_KIND:
				return convertSequenceKindToString(eDataType, instanceValue);
			case EnumerationsPackage.SEVERITY_KIND:
				return convertSeverityKindToString(eDataType, instanceValue);
			case EnumerationsPackage.SI_UNITS_KIND:
				return convertSIUnitsKindToString(eDataType, instanceValue);
			case EnumerationsPackage.AUTO_RECLOSING_STATUS_KIND:
				return convertAutoReclosingStatusKindToString(eDataType, instanceValue);
			case EnumerationsPackage.BREAKER_OPERATING_CAPABILITY_KIND:
				return convertBreakerOperatingCapabilityKindToString(eDataType, instanceValue);
			case EnumerationsPackage.CURRENT_REVERSAL_MODE_KIND:
				return convertCurrentReversalModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.DIRECTION_MODE_KIND:
				return convertDirectionModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.FAILURE_DETECTION_MODE_KIND:
				return convertFailureDetectionModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.FAN_CONTROL_KIND:
				return convertFanControlKindToString(eDataType, instanceValue);
			case EnumerationsPackage.FAULT_LOOP_KIND:
				return convertFaultLoopKindToString(eDataType, instanceValue);
			case EnumerationsPackage.GENERATOR_STATE_KIND:
				return convertGeneratorStateKindToString(eDataType, instanceValue);
			case EnumerationsPackage.HEALTH_STATE_KIND:
				return convertHealthStateKindToString(eDataType, instanceValue);
			case EnumerationsPackage.INTERNAL_TRIGGER_MODE_KIND:
				return convertInternalTriggerModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.MODE_BEHAVIOUR_KIND:
				return convertModeBehaviourKindToString(eDataType, instanceValue);
			case EnumerationsPackage.LIVE_DEAD_MODE_KIND:
				return convertLiveDeadModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.POLARIZING_QUANTITY_KIND:
				return convertPolarizingQuantityKindToString(eDataType, instanceValue);
			case EnumerationsPackage.PUMP_CONTROL_KIND:
				return convertPumpControlKindToString(eDataType, instanceValue);
			case EnumerationsPackage.RECORDING_MODE_KIND:
				return convertRecordingModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.RESET_CURVE_KIND:
				return convertResetCurveKindToString(eDataType, instanceValue);
			case EnumerationsPackage.RESTRAINT_MODE_KIND:
				return convertRestraintModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.RETRIP_MODE_KIND:
				return convertRetripModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.SCHEME_TYPE_KIND:
				return convertSchemeTypeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.SWITCHING_CAPABILITY_KIND:
				return convertSwitchingCapabilityKindToString(eDataType, instanceValue);
			case EnumerationsPackage.SWITCH_TYPE_KIND:
				return convertSwitchTypeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.TRIGGER_SOURCE_KIND:
				return convertTriggerSourceKindToString(eDataType, instanceValue);
			case EnumerationsPackage.TRIP_MODE_KIND:
				return convertTripModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.UNBLOCK_FUNCTION_MODE_KIND:
				return convertUnblockFunctionModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.WEAK_END_INFEED_MODE_KIND:
				return convertWeakEndInfeedModeKindToString(eDataType, instanceValue);
			case EnumerationsPackage.VALIDITY_KIND:
				return convertValidityKindToString(eDataType, instanceValue);
			case EnumerationsPackage.SOURCE_KIND:
				return convertSourceKindToString(eDataType, instanceValue);
			case EnumerationsPackage.FC_KIND:
				return convertFcKindToString(eDataType, instanceValue);
			case EnumerationsPackage.TRG_OP_KIND:
				return convertTrgOpKindToString(eDataType, instanceValue);
			case EnumerationsPackage.PRESENCE_CONDITION:
				return convertPresenceConditionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAccuracyKind createTimeAccuracyKindFromString(EDataType eDataType, String initialValue) {
		TimeAccuracyKind result = TimeAccuracyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeAccuracyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleReferenceKind createAngleReferenceKindFromString(EDataType eDataType, String initialValue) {
		AngleReferenceKind result = AngleReferenceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleReferenceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSControlKind createBSControlKindFromString(EDataType eDataType, String initialValue) {
		BSControlKind result = BSControlKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBSControlKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMVAngleReferenceKind createCMVAngleReferenceKindFromString(EDataType eDataType, String initialValue) {
		CMVAngleReferenceKind result = CMVAngleReferenceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMVAngleReferenceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlOutputKind createControlOutputKindFromString(EDataType eDataType, String initialValue) {
		ControlOutputKind result = ControlOutputKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlOutputKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlModelsKind createCtlModelsKindFromString(EDataType eDataType, String initialValue) {
		CtlModelsKind result = CtlModelsKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCtlModelsKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveCharKind createCurveCharKindFromString(EDataType eDataType, String initialValue) {
		CurveCharKind result = CurveCharKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurveCharKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPStatusKind createDPStatusKindFromString(EDataType eDataType, String initialValue) {
		DPStatusKind result = DPStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDPStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhaseKind createDirectionPhaseKindFromString(EDataType eDataType, String initialValue) {
		DirectionPhaseKind result = DirectionPhaseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionPhaseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultDirectionKind createFaultDirectionKindFromString(EDataType eDataType, String initialValue) {
		FaultDirectionKind result = FaultDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagReferenceKind createMagReferenceKindFromString(EDataType eDataType, String initialValue) {
		MagReferenceKind result = MagReferenceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMagReferenceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplierKind createMultiplierKindFromString(EDataType eDataType, String initialValue) {
		MultiplierKind result = MultiplierKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplierKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginatorCategoryKind createOriginatorCategoryKindFromString(EDataType eDataType, String initialValue) {
		OriginatorCategoryKind result = OriginatorCategoryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOriginatorCategoryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseReferenceKind createPhaseReferenceKindFromString(EDataType eDataType, String initialValue) {
		PhaseReferenceKind result = PhaseReferenceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseReferenceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeKind createRangeKindFromString(EDataType eDataType, String initialValue) {
		RangeKind result = RangeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SboClassesKind createSboClassesKindFromString(EDataType eDataType, String initialValue) {
		SboClassesKind result = SboClassesKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSboClassesKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceKind createSequenceKindFromString(EDataType eDataType, String initialValue) {
		SequenceKind result = SequenceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityKind createSeverityKindFromString(EDataType eDataType, String initialValue) {
		SeverityKind result = SeverityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIUnitsKind createSIUnitsKindFromString(EDataType eDataType, String initialValue) {
		SIUnitsKind result = SIUnitsKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIUnitsKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoReclosingStatusKind createAutoReclosingStatusKindFromString(EDataType eDataType, String initialValue) {
		AutoReclosingStatusKind result = AutoReclosingStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutoReclosingStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakerOperatingCapabilityKind createBreakerOperatingCapabilityKindFromString(EDataType eDataType, String initialValue) {
		BreakerOperatingCapabilityKind result = BreakerOperatingCapabilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakerOperatingCapabilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentReversalModeKind createCurrentReversalModeKindFromString(EDataType eDataType, String initialValue) {
		CurrentReversalModeKind result = CurrentReversalModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrentReversalModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionModeKind createDirectionModeKindFromString(EDataType eDataType, String initialValue) {
		DirectionModeKind result = DirectionModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureDetectionModeKind createFailureDetectionModeKindFromString(EDataType eDataType, String initialValue) {
		FailureDetectionModeKind result = FailureDetectionModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureDetectionModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FanControlKind createFanControlKindFromString(EDataType eDataType, String initialValue) {
		FanControlKind result = FanControlKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFanControlKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultLoopKind createFaultLoopKindFromString(EDataType eDataType, String initialValue) {
		FaultLoopKind result = FaultLoopKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultLoopKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorStateKind createGeneratorStateKindFromString(EDataType eDataType, String initialValue) {
		GeneratorStateKind result = GeneratorStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratorStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStateKind createHealthStateKindFromString(EDataType eDataType, String initialValue) {
		HealthStateKind result = HealthStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHealthStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTriggerModeKind createInternalTriggerModeKindFromString(EDataType eDataType, String initialValue) {
		InternalTriggerModeKind result = InternalTriggerModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInternalTriggerModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeBehaviourKind createModeBehaviourKindFromString(EDataType eDataType, String initialValue) {
		ModeBehaviourKind result = ModeBehaviourKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeBehaviourKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDeadModeKind createLiveDeadModeKindFromString(EDataType eDataType, String initialValue) {
		LiveDeadModeKind result = LiveDeadModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLiveDeadModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarizingQuantityKind createPolarizingQuantityKindFromString(EDataType eDataType, String initialValue) {
		PolarizingQuantityKind result = PolarizingQuantityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolarizingQuantityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PumpControlKind createPumpControlKindFromString(EDataType eDataType, String initialValue) {
		PumpControlKind result = PumpControlKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPumpControlKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordingModeKind createRecordingModeKindFromString(EDataType eDataType, String initialValue) {
		RecordingModeKind result = RecordingModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordingModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetCurveKind createResetCurveKindFromString(EDataType eDataType, String initialValue) {
		ResetCurveKind result = ResetCurveKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResetCurveKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestraintModeKind createRestraintModeKindFromString(EDataType eDataType, String initialValue) {
		RestraintModeKind result = RestraintModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestraintModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetripModeKind createRetripModeKindFromString(EDataType eDataType, String initialValue) {
		RetripModeKind result = RetripModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRetripModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemeTypeKind createSchemeTypeKindFromString(EDataType eDataType, String initialValue) {
		SchemeTypeKind result = SchemeTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemeTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingCapabilityKind createSwitchingCapabilityKindFromString(EDataType eDataType, String initialValue) {
		SwitchingCapabilityKind result = SwitchingCapabilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwitchingCapabilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchTypeKind createSwitchTypeKindFromString(EDataType eDataType, String initialValue) {
		SwitchTypeKind result = SwitchTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwitchTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerSourceKind createTriggerSourceKindFromString(EDataType eDataType, String initialValue) {
		TriggerSourceKind result = TriggerSourceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerSourceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripModeKind createTripModeKindFromString(EDataType eDataType, String initialValue) {
		TripModeKind result = TripModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTripModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnblockFunctionModeKind createUnblockFunctionModeKindFromString(EDataType eDataType, String initialValue) {
		UnblockFunctionModeKind result = UnblockFunctionModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnblockFunctionModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeakEndInfeedModeKind createWeakEndInfeedModeKindFromString(EDataType eDataType, String initialValue) {
		WeakEndInfeedModeKind result = WeakEndInfeedModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeakEndInfeedModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityKind createValidityKindFromString(EDataType eDataType, String initialValue) {
		ValidityKind result = ValidityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceKind createSourceKindFromString(EDataType eDataType, String initialValue) {
		SourceKind result = SourceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcKind createFcKindFromString(EDataType eDataType, String initialValue) {
		FcKind result = FcKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFcKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgOpKind createTrgOpKindFromString(EDataType eDataType, String initialValue) {
		TrgOpKind result = TrgOpKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrgOpKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceCondition createPresenceConditionFromString(EDataType eDataType, String initialValue) {
		PresenceCondition result = PresenceCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresenceConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsPackage getEnumerationsPackage() {
		return (EnumerationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnumerationsPackage getPackage() {
		return EnumerationsPackage.eINSTANCE;
	}

} //EnumerationsFactoryImpl
