/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.Dataclasses.DataclassesFactory
 * @model kind="package"
 * @generated
 */
public interface DataclassesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Dataclasses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/dataclasses";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataclassesPackage eINSTANCE = gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.TimeStampImpl <em>Time Stamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.TimeStampImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getTimeStamp()
	 * @generated
	 */
	int TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP__VAL = 0;

	/**
	 * The number of structural features of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.P_TimeStampImpl <em>PTime Stamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.P_TimeStampImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getP_TimeStamp()
	 * @generated
	 */
	int PTIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Second Since Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTIME_STAMP__SECOND_SINCE_EPOCH = 0;

	/**
	 * The feature id for the '<em><b>Fraction Of Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTIME_STAMP__FRACTION_OF_SECOND = 1;

	/**
	 * The feature id for the '<em><b>Time Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTIME_STAMP__TIME_QUALITY = 2;

	/**
	 * The number of structural features of the '<em>PTime Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTIME_STAMP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PTime Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTIME_STAMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.TimeQualityImpl <em>Time Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.TimeQualityImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getTimeQuality()
	 * @generated
	 */
	int TIME_QUALITY = 2;

	/**
	 * The feature id for the '<em><b>Leap Seconds Known</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_QUALITY__LEAP_SECONDS_KNOWN = 0;

	/**
	 * The feature id for the '<em><b>Clock Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_QUALITY__CLOCK_FAILURE = 1;

	/**
	 * The feature id for the '<em><b>Clock Not Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_QUALITY__CLOCK_NOT_SYNCHRONIZED = 2;

	/**
	 * The feature id for the '<em><b>Time Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_QUALITY__TIME_ACCURACY = 3;

	/**
	 * The number of structural features of the '<em>Time Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_QUALITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Time Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_QUALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.AnalogueValueImpl <em>Analogue Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.AnalogueValueImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getAnalogueValue()
	 * @generated
	 */
	int ANALOGUE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_VALUE__I = 0;

	/**
	 * The feature id for the '<em><b>F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_VALUE__F = 1;

	/**
	 * The number of structural features of the '<em>Analogue Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Analogue Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.AngleReferenceImpl <em>Angle Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.AngleReferenceImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getAngleReference()
	 * @generated
	 */
	int ANGLE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_REFERENCE__VAL = 0;

	/**
	 * The number of structural features of the '<em>Angle Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Angle Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.BSControlImpl <em>BS Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.BSControlImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getBSControl()
	 * @generated
	 */
	int BS_CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_CONTROL__VAL = 0;

	/**
	 * The number of structural features of the '<em>BS Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_CONTROL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BS Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BS_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.CMVAngleReferenceImpl <em>CMV Angle Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.CMVAngleReferenceImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCMVAngleReference()
	 * @generated
	 */
	int CMV_ANGLE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV_ANGLE_REFERENCE__VAL = 0;

	/**
	 * The number of structural features of the '<em>CMV Angle Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV_ANGLE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CMV Angle Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV_ANGLE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ControlOutputImpl <em>Control Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ControlOutputImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getControlOutput()
	 * @generated
	 */
	int CONTROL_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OUTPUT__VAL = 0;

	/**
	 * The number of structural features of the '<em>Control Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OUTPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.CtlModelsImpl <em>Ctl Models</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.CtlModelsImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCtlModels()
	 * @generated
	 */
	int CTL_MODELS = 8;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTL_MODELS__VAL = 0;

	/**
	 * The number of structural features of the '<em>Ctl Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTL_MODELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ctl Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTL_MODELS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.CurveCharImpl <em>Curve Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.CurveCharImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCurveChar()
	 * @generated
	 */
	int CURVE_CHAR = 9;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_CHAR__VAL = 0;

	/**
	 * The number of structural features of the '<em>Curve Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_CHAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Curve Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_CHAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.DirectionPhaseImpl <em>Direction Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.DirectionPhaseImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDirectionPhase()
	 * @generated
	 */
	int DIRECTION_PHASE = 10;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_PHASE__VAL = 0;

	/**
	 * The number of structural features of the '<em>Direction Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_PHASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Direction Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.DPStatusImpl <em>DP Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.DPStatusImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDPStatus()
	 * @generated
	 */
	int DP_STATUS = 11;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DP_STATUS__VAL = 0;

	/**
	 * The number of structural features of the '<em>DP Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DP_STATUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DP Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DP_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.FaultDirectionImpl <em>Fault Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.FaultDirectionImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getFaultDirection()
	 * @generated
	 */
	int FAULT_DIRECTION = 12;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_DIRECTION__VAL = 0;

	/**
	 * The number of structural features of the '<em>Fault Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_DIRECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fault Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_DIRECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.MagReferenceImpl <em>Mag Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.MagReferenceImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getMagReference()
	 * @generated
	 */
	int MAG_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAG_REFERENCE__VAL = 0;

	/**
	 * The number of structural features of the '<em>Mag Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAG_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mag Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAG_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.MultiplierImpl <em>Multiplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.MultiplierImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getMultiplier()
	 * @generated
	 */
	int MULTIPLIER = 14;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLIER__VAL = 0;

	/**
	 * The number of structural features of the '<em>Multiplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Multiplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.OriginatorImpl <em>Originator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.OriginatorImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getOriginator()
	 * @generated
	 */
	int ORIGINATOR = 15;

	/**
	 * The feature id for the '<em><b>Orident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__ORIDENT = 0;

	/**
	 * The feature id for the '<em><b>Or Cat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__OR_CAT = 1;

	/**
	 * The number of structural features of the '<em>Originator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Originator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.OriginatorCategoryImpl <em>Originator Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.OriginatorCategoryImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getOriginatorCategory()
	 * @generated
	 */
	int ORIGINATOR_CATEGORY = 16;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR_CATEGORY__VAL = 0;

	/**
	 * The number of structural features of the '<em>Originator Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR_CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Originator Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR_CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.PhaseReferenceImpl <em>Phase Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.PhaseReferenceImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPhaseReference()
	 * @generated
	 */
	int PHASE_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_REFERENCE__VAL = 0;

	/**
	 * The number of structural features of the '<em>Phase Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Phase Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.PointImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 18;

	/**
	 * The feature id for the '<em><b>XVal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__XVAL = 0;

	/**
	 * The feature id for the '<em><b>YVal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__YVAL = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.PointArrayImpl <em>Point Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.PointArrayImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPointArray()
	 * @generated
	 */
	int POINT_ARRAY = 19;

	/**
	 * The feature id for the '<em><b>Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ARRAY__POINT = 0;

	/**
	 * The number of structural features of the '<em>Point Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Point Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.PulseConfigImpl <em>Pulse Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.PulseConfigImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPulseConfig()
	 * @generated
	 */
	int PULSE_CONFIG = 20;

	/**
	 * The feature id for the '<em><b>On Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_CONFIG__ON_DUR = 0;

	/**
	 * The feature id for the '<em><b>Off Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_CONFIG__OFF_DUR = 1;

	/**
	 * The feature id for the '<em><b>Num Pls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_CONFIG__NUM_PLS = 2;

	/**
	 * The feature id for the '<em><b>Cmd Qual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_CONFIG__CMD_QUAL = 3;

	/**
	 * The number of structural features of the '<em>Pulse Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_CONFIG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pulse Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSE_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.QualityImpl <em>Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.QualityImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getQuality()
	 * @generated
	 */
	int QUALITY = 21;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__TEST = 0;

	/**
	 * The feature id for the '<em><b>Operator Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__OPERATOR_BLOCKED = 1;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__VALIDITY = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Detail Qual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__DETAIL_QUAL = 4;

	/**
	 * The number of structural features of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.DetailQualImpl <em>Detail Qual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.DetailQualImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDetailQual()
	 * @generated
	 */
	int DETAIL_QUAL = 22;

	/**
	 * The feature id for the '<em><b>Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL__OVERFLOW = 0;

	/**
	 * The feature id for the '<em><b>Out Of Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL__OUT_OF_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Bad Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL__BAD_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Oscillatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL__OSCILLATORY = 3;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL__FAILURE = 4;

	/**
	 * The feature id for the '<em><b>Old Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL__OLD_DATA = 5;

	/**
	 * The feature id for the '<em><b>Inconsistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL__INCONSISTENT = 6;

	/**
	 * The feature id for the '<em><b>Inaccurate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL__INACCURATE = 7;

	/**
	 * The number of structural features of the '<em>Detail Qual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Detail Qual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_QUAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.RangeImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 23;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__VAL = 0;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl <em>Range Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getRangeConfig()
	 * @generated
	 */
	int RANGE_CONFIG = 24;

	/**
	 * The feature id for the '<em><b>Hh Lim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONFIG__HH_LIM = 0;

	/**
	 * The feature id for the '<em><b>HLim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONFIG__HLIM = 1;

	/**
	 * The feature id for the '<em><b>LLim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONFIG__LLIM = 2;

	/**
	 * The feature id for the '<em><b>Ll Lim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONFIG__LL_LIM = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONFIG__MIN = 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONFIG__MAX = 5;

	/**
	 * The number of structural features of the '<em>Range Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONFIG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Range Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SboClassesImpl <em>Sbo Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SboClassesImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSboClasses()
	 * @generated
	 */
	int SBO_CLASSES = 25;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBO_CLASSES__VAL = 0;

	/**
	 * The number of structural features of the '<em>Sbo Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBO_CLASSES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sbo Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBO_CLASSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ScaledValueConfigImpl <em>Scaled Value Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ScaledValueConfigImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getScaledValueConfig()
	 * @generated
	 */
	int SCALED_VALUE_CONFIG = 26;

	/**
	 * The feature id for the '<em><b>Scale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_VALUE_CONFIG__SCALE_FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_VALUE_CONFIG__OFFSET = 1;

	/**
	 * The number of structural features of the '<em>Scaled Value Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_VALUE_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scaled Value Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALED_VALUE_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SequenceImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 27;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VAL = 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SeverityImpl <em>Severity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SeverityImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 28;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__VAL = 0;

	/**
	 * The number of structural features of the '<em>Severity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Severity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SlUnitsImpl <em>Sl Units</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SlUnitsImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSlUnits()
	 * @generated
	 */
	int SL_UNITS = 29;

	/**
	 * The feature id for the '<em><b>Sl Units Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_UNITS__SL_UNITS_KIND = 0;

	/**
	 * The number of structural features of the '<em>Sl Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_UNITS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sl Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_UNITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.UnitsImpl <em>Units</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.UnitsImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getUnits()
	 * @generated
	 */
	int UNITS = 30;

	/**
	 * The feature id for the '<em><b>Sl Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS__SL_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS__MULTIPLIER = 1;

	/**
	 * The number of structural features of the '<em>Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ValWithTransImpl <em>Val With Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ValWithTransImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getValWithTrans()
	 * @generated
	 */
	int VAL_WITH_TRANS = 31;

	/**
	 * The feature id for the '<em><b>Pos Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_WITH_TRANS__POS_VAL = 0;

	/**
	 * The feature id for the '<em><b>Trans Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_WITH_TRANS__TRANS_IND = 1;

	/**
	 * The number of structural features of the '<em>Val With Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_WITH_TRANS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Val With Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAL_WITH_TRANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.VectorImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 32;

	/**
	 * The feature id for the '<em><b>Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__MAG = 0;

	/**
	 * The feature id for the '<em><b>Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__ANG = 1;

	/**
	 * The number of structural features of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.VectorArrayImpl <em>Vector Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.VectorArrayImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getVectorArray()
	 * @generated
	 */
	int VECTOR_ARRAY = 33;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_ARRAY__VECTOR = 0;

	/**
	 * The number of structural features of the '<em>Vector Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vector Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.C_PrimitiveCDCImpl <em>CPrimitive CDC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.C_PrimitiveCDCImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getC_PrimitiveCDC()
	 * @generated
	 */
	int CPRIMITIVE_CDC = 34;

	/**
	 * The feature id for the '<em><b>Cdc Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPRIMITIVE_CDC__CDC_NS = 0;

	/**
	 * The feature id for the '<em><b>Cdc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPRIMITIVE_CDC__CDC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Data Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPRIMITIVE_CDC__DATA_NS = 2;

	/**
	 * The number of structural features of the '<em>CPrimitive CDC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPRIMITIVE_CDC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>CPrimitive CDC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPRIMITIVE_CDC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.C_ComposedCDCImpl <em>CComposed CDC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.C_ComposedCDCImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getC_ComposedCDC()
	 * @generated
	 */
	int CCOMPOSED_CDC = 35;

	/**
	 * The feature id for the '<em><b>Cdc Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCOMPOSED_CDC__CDC_NS = 0;

	/**
	 * The feature id for the '<em><b>Cdc Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCOMPOSED_CDC__CDC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Data Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCOMPOSED_CDC__DATA_NS = 2;

	/**
	 * The number of structural features of the '<em>CComposed CDC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCOMPOSED_CDC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>CComposed CDC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCOMPOSED_CDC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.StatusInfoImpl <em>Status Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.StatusInfoImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getStatusInfo()
	 * @generated
	 */
	int STATUS_INFO = 36;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_INFO__T = 0;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_INFO__D = 1;

	/**
	 * The feature id for the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_INFO__DU = 2;

	/**
	 * The number of structural features of the '<em>Status Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_INFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Status Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SPSImpl <em>SPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SPSImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSPS()
	 * @generated
	 */
	int SPS = 37;

	/**
	 * The feature id for the '<em><b>St Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS__ST_VAL = 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS__Q = 1;

	/**
	 * The feature id for the '<em><b>Sub Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS__SUB_ENA = 2;

	/**
	 * The feature id for the '<em><b>Sub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS__SUB_VAL = 3;

	/**
	 * The feature id for the '<em><b>Sub Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS__SUB_Q = 4;

	/**
	 * The feature id for the '<em><b>Sub ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS__SUB_ID = 5;

	/**
	 * The number of structural features of the '<em>SPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>SPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.INSImpl <em>INS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.INSImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getINS()
	 * @generated
	 */
	int INS = 38;

	/**
	 * The feature id for the '<em><b>St Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__ST_VAL = 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__Q = 1;

	/**
	 * The feature id for the '<em><b>Sub Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SUB_ENA = 2;

	/**
	 * The feature id for the '<em><b>Sub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SUB_VAL = 3;

	/**
	 * The feature id for the '<em><b>Sub Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SUB_Q = 4;

	/**
	 * The feature id for the '<em><b>Sub ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SUB_ID = 5;

	/**
	 * The number of structural features of the '<em>INS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>INS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.DPSImpl <em>DPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.DPSImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDPS()
	 * @generated
	 */
	int DPS = 39;

	/**
	 * The feature id for the '<em><b>St Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPS__ST_VAL = 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPS__Q = 1;

	/**
	 * The feature id for the '<em><b>Sub Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPS__SUB_ENA = 2;

	/**
	 * The feature id for the '<em><b>Sub Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPS__SUB_VAL = 3;

	/**
	 * The feature id for the '<em><b>Sub Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPS__SUB_Q = 4;

	/**
	 * The feature id for the '<em><b>Sub ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPS__SUB_ID = 5;

	/**
	 * The number of structural features of the '<em>DPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>DPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl <em>ACT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ACTImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getACT()
	 * @generated
	 */
	int ACT = 40;

	/**
	 * The feature id for the '<em><b>General</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__GENERAL = 0;

	/**
	 * The feature id for the '<em><b>Phs A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PHS_A = 1;

	/**
	 * The feature id for the '<em><b>Phs B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PHS_B = 2;

	/**
	 * The feature id for the '<em><b>Phs C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__PHS_C = 3;

	/**
	 * The feature id for the '<em><b>Neut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__NEUT = 4;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__Q = 5;

	/**
	 * The feature id for the '<em><b>Oper Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT__OPER_TM = 6;

	/**
	 * The number of structural features of the '<em>ACT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>ACT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl <em>ACD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ACDImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getACD()
	 * @generated
	 */
	int ACD = 41;

	/**
	 * The feature id for the '<em><b>General</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__GENERAL = 0;

	/**
	 * The feature id for the '<em><b>Dir General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__DIR_GENERAL = 1;

	/**
	 * The feature id for the '<em><b>Phs A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__PHS_A = 2;

	/**
	 * The feature id for the '<em><b>Dir Phs A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__DIR_PHS_A = 3;

	/**
	 * The feature id for the '<em><b>Phs B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__PHS_B = 4;

	/**
	 * The feature id for the '<em><b>Dir Phs B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__DIR_PHS_B = 5;

	/**
	 * The feature id for the '<em><b>Phs C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__PHS_C = 6;

	/**
	 * The feature id for the '<em><b>Dir Phs C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__DIR_PHS_C = 7;

	/**
	 * The feature id for the '<em><b>Neut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__NEUT = 8;

	/**
	 * The feature id for the '<em><b>Dir Neut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__DIR_NEUT = 9;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD__Q = 10;

	/**
	 * The number of structural features of the '<em>ACD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>ACD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SECImpl <em>SEC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SECImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSEC()
	 * @generated
	 */
	int SEC = 42;

	/**
	 * The feature id for the '<em><b>Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC__CNT = 0;

	/**
	 * The feature id for the '<em><b>Sev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC__SEV = 1;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC__ADDR = 2;

	/**
	 * The feature id for the '<em><b>Add Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC__ADD_INFO = 3;

	/**
	 * The number of structural features of the '<em>SEC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>SEC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl <em>BCR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.BCRImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getBCR()
	 * @generated
	 */
	int BCR = 43;

	/**
	 * The feature id for the '<em><b>Act Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__ACT_VAL = 0;

	/**
	 * The feature id for the '<em><b>Fr Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__FR_VAL = 1;

	/**
	 * The feature id for the '<em><b>Fr Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__FR_TM = 2;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__Q = 3;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__UNITS = 4;

	/**
	 * The feature id for the '<em><b>Puls Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__PULS_QTY = 5;

	/**
	 * The feature id for the '<em><b>Fr Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__FR_ENA = 6;

	/**
	 * The feature id for the '<em><b>Str Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__STR_TM = 7;

	/**
	 * The feature id for the '<em><b>Fr Pd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__FR_PD = 8;

	/**
	 * The feature id for the '<em><b>Fr Rs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR__FR_RS = 9;

	/**
	 * The number of structural features of the '<em>BCR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>BCR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.PrimitiveMeasureAndInfoImpl <em>Primitive Measure And Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.PrimitiveMeasureAndInfoImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPrimitiveMeasureAndInfo()
	 * @generated
	 */
	int PRIMITIVE_MEASURE_AND_INFO = 44;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_MEASURE_AND_INFO__D = 0;

	/**
	 * The feature id for the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_MEASURE_AND_INFO__DU = 1;

	/**
	 * The number of structural features of the '<em>Primitive Measure And Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_MEASURE_AND_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Primitive Measure And Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_MEASURE_AND_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ComposedMeasureAndInfoImpl <em>Composed Measure And Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ComposedMeasureAndInfoImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getComposedMeasureAndInfo()
	 * @generated
	 */
	int COMPOSED_MEASURE_AND_INFO = 45;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MEASURE_AND_INFO__D = 0;

	/**
	 * The feature id for the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MEASURE_AND_INFO__DU = 1;

	/**
	 * The number of structural features of the '<em>Composed Measure And Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MEASURE_AND_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Composed Measure And Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MEASURE_AND_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl <em>MV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.MVImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getMV()
	 * @generated
	 */
	int MV = 46;

	/**
	 * The feature id for the '<em><b>Inst Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__INST_MAG = 0;

	/**
	 * The feature id for the '<em><b>Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__MAG = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__Q = 3;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__T = 4;

	/**
	 * The feature id for the '<em><b>Sub Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__SUB_ENA = 5;

	/**
	 * The feature id for the '<em><b>Sub Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__SUB_MAG = 6;

	/**
	 * The feature id for the '<em><b>Sub Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__SUB_Q = 7;

	/**
	 * The feature id for the '<em><b>Sub ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__SUB_ID = 8;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__UNITS = 9;

	/**
	 * The feature id for the '<em><b>Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__DB = 10;

	/**
	 * The feature id for the '<em><b>Zero Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__ZERO_DB = 11;

	/**
	 * The feature id for the '<em><b>SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__SVC = 12;

	/**
	 * The feature id for the '<em><b>Range C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__RANGE_C = 13;

	/**
	 * The feature id for the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV__SMP_RATE = 14;

	/**
	 * The number of structural features of the '<em>MV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>MV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl <em>CMV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.CMVImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCMV()
	 * @generated
	 */
	int CMV = 47;

	/**
	 * The feature id for the '<em><b>Inst CVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__INST_CVAL = 0;

	/**
	 * The feature id for the '<em><b>CVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__CVAL = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__Q = 3;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__T = 4;

	/**
	 * The feature id for the '<em><b>Sub Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__SUB_ENA = 5;

	/**
	 * The feature id for the '<em><b>Sub CVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__SUB_CVAL = 6;

	/**
	 * The feature id for the '<em><b>Sub Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__SUB_Q = 7;

	/**
	 * The feature id for the '<em><b>Sub ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__SUB_ID = 8;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__UNITS = 9;

	/**
	 * The feature id for the '<em><b>Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__DB = 10;

	/**
	 * The feature id for the '<em><b>Zero Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__ZERO_DB = 11;

	/**
	 * The feature id for the '<em><b>Range C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__RANGE_C = 12;

	/**
	 * The feature id for the '<em><b>Mag SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__MAG_SVC = 13;

	/**
	 * The feature id for the '<em><b>Ang SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__ANG_SVC = 14;

	/**
	 * The feature id for the '<em><b>Ang Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__ANG_REF = 15;

	/**
	 * The feature id for the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV__SMP_RATE = 16;

	/**
	 * The number of structural features of the '<em>CMV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>CMV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SAVImpl <em>SAV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SAVImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSAV()
	 * @generated
	 */
	int SAV = 48;

	/**
	 * The feature id for the '<em><b>Inst Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV__INST_MAG = 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV__Q = 1;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV__T = 2;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV__UNITS = 3;

	/**
	 * The feature id for the '<em><b>SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV__SVC = 4;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV__MIN = 5;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV__MAX = 6;

	/**
	 * The number of structural features of the '<em>SAV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>SAV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.DELImpl <em>DEL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.DELImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDEL()
	 * @generated
	 */
	int DEL = 49;

	/**
	 * The feature id for the '<em><b>Phs AB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__PHS_AB = 0;

	/**
	 * The feature id for the '<em><b>Phs BC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__PHS_BC = 1;

	/**
	 * The feature id for the '<em><b>Phs CA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__PHS_CA = 2;

	/**
	 * The feature id for the '<em><b>Ang Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__ANG_REF = 3;

	/**
	 * The number of structural features of the '<em>DEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.WYEImpl <em>WYE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.WYEImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getWYE()
	 * @generated
	 */
	int WYE = 50;

	/**
	 * The feature id for the '<em><b>Phs A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE__PHS_A = 0;

	/**
	 * The feature id for the '<em><b>Phs B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE__PHS_B = 1;

	/**
	 * The feature id for the '<em><b>Phs C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE__PHS_C = 2;

	/**
	 * The feature id for the '<em><b>Neut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE__NEUT = 3;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE__NET = 4;

	/**
	 * The feature id for the '<em><b>Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE__RES = 5;

	/**
	 * The feature id for the '<em><b>Ang Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE__ANG_REF = 6;

	/**
	 * The number of structural features of the '<em>WYE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>WYE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WYE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SEQImpl <em>SEQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SEQImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSEQ()
	 * @generated
	 */
	int SEQ = 51;

	/**
	 * The feature id for the '<em><b>C1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__C1 = 0;

	/**
	 * The feature id for the '<em><b>C2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__C2 = 1;

	/**
	 * The feature id for the '<em><b>C3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__C3 = 2;

	/**
	 * The feature id for the '<em><b>Seq T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__SEQ_T = 3;

	/**
	 * The feature id for the '<em><b>Phs Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__PHS_REF = 4;

	/**
	 * The number of structural features of the '<em>SEQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SEQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.HMVImpl <em>HMV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.HMVImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getHMV()
	 * @generated
	 */
	int HMV = 52;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__Q = 0;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__T = 1;

	/**
	 * The feature id for the '<em><b>Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__HAR = 2;

	/**
	 * The feature id for the '<em><b>Num Har</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__NUM_HAR = 3;

	/**
	 * The feature id for the '<em><b>Num Cyc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__NUM_CYC = 4;

	/**
	 * The feature id for the '<em><b>Eval Tm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__EVAL_TM = 5;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__UNITS = 6;

	/**
	 * The feature id for the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__SMP_RATE = 7;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__FREQUENCY = 8;

	/**
	 * The feature id for the '<em><b>Hv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__HV_REF = 9;

	/**
	 * The feature id for the '<em><b>Rms Cyc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV__RMS_CYC = 10;

	/**
	 * The number of structural features of the '<em>HMV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>HMV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl <em>HYWE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.HYWEImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getHYWE()
	 * @generated
	 */
	int HYWE = 53;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__Q = 0;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__T = 1;

	/**
	 * The feature id for the '<em><b>Phs AHar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__PHS_AHAR = 2;

	/**
	 * The feature id for the '<em><b>Phs BHar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__PHS_BHAR = 3;

	/**
	 * The feature id for the '<em><b>Phs CHar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__PHS_CHAR = 4;

	/**
	 * The feature id for the '<em><b>Neut Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__NEUT_HAR = 5;

	/**
	 * The feature id for the '<em><b>Net Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__NET_HAR = 6;

	/**
	 * The feature id for the '<em><b>Res Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__RES_HAR = 7;

	/**
	 * The feature id for the '<em><b>Num Har</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__NUM_HAR = 8;

	/**
	 * The feature id for the '<em><b>Num Cyc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__NUM_CYC = 9;

	/**
	 * The feature id for the '<em><b>Eval Tm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__EVAL_TM = 10;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__UNITS = 11;

	/**
	 * The feature id for the '<em><b>Ang Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__ANG_REF = 12;

	/**
	 * The feature id for the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__SMP_RATE = 13;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__FREQUENCY = 14;

	/**
	 * The feature id for the '<em><b>Hv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__HV_REF = 15;

	/**
	 * The feature id for the '<em><b>Rms Cyc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE__RMS_CYC = 16;

	/**
	 * The number of structural features of the '<em>HYWE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>HYWE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYWE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl <em>HDEL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.HDELImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getHDEL()
	 * @generated
	 */
	int HDEL = 54;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__Q = 0;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__T = 1;

	/**
	 * The feature id for the '<em><b>Phs AB Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__PHS_AB_HAR = 2;

	/**
	 * The feature id for the '<em><b>Phs BC Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__PHS_BC_HAR = 3;

	/**
	 * The feature id for the '<em><b>Phs CA Har</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__PHS_CA_HAR = 4;

	/**
	 * The feature id for the '<em><b>Num Har</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__NUM_HAR = 5;

	/**
	 * The feature id for the '<em><b>Num Cyc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__NUM_CYC = 6;

	/**
	 * The feature id for the '<em><b>Eval Tm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__EVAL_TM = 7;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__UNITS = 8;

	/**
	 * The feature id for the '<em><b>Ang Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__ANG_REF = 9;

	/**
	 * The feature id for the '<em><b>Smp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__SMP_RATE = 10;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__FREQUENCY = 11;

	/**
	 * The feature id for the '<em><b>Hv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__HV_REF = 12;

	/**
	 * The feature id for the '<em><b>Rms Cyc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL__RMS_CYC = 13;

	/**
	 * The number of structural features of the '<em>HDEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>HDEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ControllableStatusInfoImpl <em>Controllable Status Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ControllableStatusInfoImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getControllableStatusInfo()
	 * @generated
	 */
	int CONTROLLABLE_STATUS_INFO = 55;

	/**
	 * The feature id for the '<em><b>Oper Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__OPER_TM = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>Ctl Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__CTL_NUM = 2;

	/**
	 * The feature id for the '<em><b>St Seld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__ST_SELD = 3;

	/**
	 * The feature id for the '<em><b>Sub Ena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__SUB_ENA = 4;

	/**
	 * The feature id for the '<em><b>Sub Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__SUB_Q = 5;

	/**
	 * The feature id for the '<em><b>Sub ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__SUB_ID = 6;

	/**
	 * The feature id for the '<em><b>Ctl Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__CTL_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Sbo Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__SBO_TIMEOUT = 8;

	/**
	 * The feature id for the '<em><b>Sbo Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__SBO_CLASS = 9;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__D = 10;

	/**
	 * The feature id for the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO__DU = 11;

	/**
	 * The number of structural features of the '<em>Controllable Status Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Controllable Status Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_STATUS_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SPCImpl <em>SPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SPCImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSPC()
	 * @generated
	 */
	int SPC = 56;

	/**
	 * The feature id for the '<em><b>Ctl Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPC__CTL_VAL = 0;

	/**
	 * The feature id for the '<em><b>St Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPC__ST_VAL = 1;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPC__Q = 2;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPC__T = 3;

	/**
	 * The feature id for the '<em><b>Sub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPC__SUB_VAL = 4;

	/**
	 * The feature id for the '<em><b>Pulse Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPC__PULSE_CONFIG = 5;

	/**
	 * The number of structural features of the '<em>SPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>SPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.DPCImpl <em>DPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.DPCImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDPC()
	 * @generated
	 */
	int DPC = 57;

	/**
	 * The feature id for the '<em><b>Ctl Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPC__CTL_VAL = 0;

	/**
	 * The feature id for the '<em><b>St Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPC__ST_VAL = 1;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPC__Q = 2;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPC__T = 3;

	/**
	 * The feature id for the '<em><b>Sub Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPC__SUB_VAL = 4;

	/**
	 * The feature id for the '<em><b>Pulse Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPC__PULSE_CONFIG = 5;

	/**
	 * The number of structural features of the '<em>DPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>DPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.INCImpl <em>INC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.INCImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getINC()
	 * @generated
	 */
	int INC = 58;

	/**
	 * The feature id for the '<em><b>Ctl Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC__CTL_VAL = 0;

	/**
	 * The feature id for the '<em><b>St Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC__ST_VAL = 1;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC__Q = 2;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC__T = 3;

	/**
	 * The feature id for the '<em><b>Sub Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC__SUB_VAL = 4;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC__MIN_VAL = 5;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC__MAX_VAL = 6;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC__STEP_SIZE = 7;

	/**
	 * The number of structural features of the '<em>INC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>INC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.BSCImpl <em>BSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.BSCImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getBSC()
	 * @generated
	 */
	int BSC = 59;

	/**
	 * The feature id for the '<em><b>Ctl Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__CTL_VAL = 0;

	/**
	 * The feature id for the '<em><b>Val WTr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__VAL_WTR = 1;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__Q = 2;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__T = 3;

	/**
	 * The feature id for the '<em><b>Sub Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__SUB_VAL = 4;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__PERSISTENT = 5;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__MIN_VAL = 6;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__MAX_VAL = 7;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC__STEP_SIZE = 8;

	/**
	 * The number of structural features of the '<em>BSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>BSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl <em>ISC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ISCImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getISC()
	 * @generated
	 */
	int ISC = 60;

	/**
	 * The feature id for the '<em><b>Ctl Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC__CTL_VAL = 0;

	/**
	 * The feature id for the '<em><b>Val WTr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC__VAL_WTR = 1;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC__T = 2;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC__Q = 3;

	/**
	 * The feature id for the '<em><b>Sub Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC__SUB_VAL = 4;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC__MIN_VAL = 5;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC__MAX_VAL = 6;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC__STEP_SIZE = 7;

	/**
	 * The number of structural features of the '<em>ISC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>ISC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ControllableAnalogueInfoImpl <em>Controllable Analogue Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ControllableAnalogueInfoImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getControllableAnalogueInfo()
	 * @generated
	 */
	int CONTROLLABLE_ANALOGUE_INFO = 61;

	/**
	 * The feature id for the '<em><b>APC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_ANALOGUE_INFO__APC = 0;

	/**
	 * The feature id for the '<em><b>CPrimitive CDC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_ANALOGUE_INFO__CPRIMITIVE_CDC = 1;

	/**
	 * The number of structural features of the '<em>Controllable Analogue Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_ANALOGUE_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Controllable Analogue Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLABLE_ANALOGUE_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl <em>APC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.APCImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getAPC()
	 * @generated
	 */
	int APC = 62;

	/**
	 * The feature id for the '<em><b>Set Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__SET_MAG = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>Oper Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__OPER_TM = 2;

	/**
	 * The feature id for the '<em><b>Q</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__Q = 3;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__T = 4;

	/**
	 * The feature id for the '<em><b>Ctl Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__CTL_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__UNITS = 6;

	/**
	 * The feature id for the '<em><b>SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__SVC = 7;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__MIN_VAL = 8;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__MAX_VAL = 9;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__STEP_SIZE = 10;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__D = 11;

	/**
	 * The feature id for the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC__DU = 12;

	/**
	 * The number of structural features of the '<em>APC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>APC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.SPGImpl <em>SPG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.SPGImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSPG()
	 * @generated
	 */
	int SPG = 63;

	/**
	 * The feature id for the '<em><b>Set Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPG__SET_VAL = 0;

	/**
	 * The number of structural features of the '<em>SPG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SPG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.INGImpl <em>ING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.INGImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getING()
	 * @generated
	 */
	int ING = 64;

	/**
	 * The feature id for the '<em><b>Set Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ING__SET_VAL = 0;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ING__MIN_VAL = 1;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ING__MAX_VAL = 2;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ING__STEP_SIZE = 3;

	/**
	 * The number of structural features of the '<em>ING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.AnalogueSettingsImpl <em>Analogue Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.AnalogueSettingsImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getAnalogueSettings()
	 * @generated
	 */
	int ANALOGUE_SETTINGS = 65;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_SETTINGS__D = 0;

	/**
	 * The feature id for the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_SETTINGS__DU = 1;

	/**
	 * The number of structural features of the '<em>Analogue Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_SETTINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Analogue Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.ASGImpl <em>ASG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.ASGImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getASG()
	 * @generated
	 */
	int ASG = 66;

	/**
	 * The feature id for the '<em><b>Set Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASG__SET_MAG = 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASG__UNITS = 1;

	/**
	 * The feature id for the '<em><b>SVC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASG__SVC = 2;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASG__MIN_VAL = 3;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASG__MAX_VAL = 4;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASG__STEP_SIZE = 5;

	/**
	 * The number of structural features of the '<em>ASG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>ASG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.CURVEImpl <em>CURVE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.CURVEImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCURVE()
	 * @generated
	 */
	int CURVE = 67;

	/**
	 * The feature id for the '<em><b>Set Charact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__SET_CHARACT = 0;

	/**
	 * The feature id for the '<em><b>Set Par A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__SET_PAR_A = 1;

	/**
	 * The feature id for the '<em><b>Set Par B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__SET_PAR_B = 2;

	/**
	 * The feature id for the '<em><b>Set Par C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__SET_PAR_C = 3;

	/**
	 * The feature id for the '<em><b>Set Par D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__SET_PAR_D = 4;

	/**
	 * The feature id for the '<em><b>Set Par E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__SET_PAR_E = 5;

	/**
	 * The feature id for the '<em><b>Set Par F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE__SET_PAR_F = 6;

	/**
	 * The number of structural features of the '<em>CURVE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>CURVE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.DescriptionInfoImpl <em>Description Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.DescriptionInfoImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDescriptionInfo()
	 * @generated
	 */
	int DESCRIPTION_INFO = 68;

	/**
	 * The feature id for the '<em><b>DPL</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_INFO__DPL = 0;

	/**
	 * The feature id for the '<em><b>LPL</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_INFO__LPL = 1;

	/**
	 * The feature id for the '<em><b>CSD</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_INFO__CSD = 2;

	/**
	 * The feature id for the '<em><b>CPrimitive CDC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_INFO__CPRIMITIVE_CDC = 3;

	/**
	 * The number of structural features of the '<em>Description Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Description Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.DPLImpl <em>DPL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.DPLImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDPL()
	 * @generated
	 */
	int DPL = 69;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPL__VENDOR = 0;

	/**
	 * The feature id for the '<em><b>Hw Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPL__HW_REV = 1;

	/**
	 * The feature id for the '<em><b>Sw Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPL__SW_REV = 2;

	/**
	 * The feature id for the '<em><b>Ser Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPL__SER_NUM = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPL__MODEL = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPL__LOCATION = 5;

	/**
	 * The number of structural features of the '<em>DPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>DPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl <em>LPL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.LPLImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getLPL()
	 * @generated
	 */
	int LPL = 70;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL__VENDOR = 0;

	/**
	 * The feature id for the '<em><b>Sw Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL__SW_REV = 1;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL__D = 2;

	/**
	 * The feature id for the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL__DU = 3;

	/**
	 * The feature id for the '<em><b>Config Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL__CONFIG_REV = 4;

	/**
	 * The feature id for the '<em><b>Id Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL__ID_NS = 5;

	/**
	 * The feature id for the '<em><b>Ln Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL__LN_NS = 6;

	/**
	 * The number of structural features of the '<em>LPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>LPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.Dataclasses.impl.CSDImpl <em>CSD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.Dataclasses.impl.CSDImpl
	 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCSD()
	 * @generated
	 */
	int CSD = 71;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD__XUNIT = 0;

	/**
	 * The feature id for the '<em><b>XD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD__XD = 1;

	/**
	 * The feature id for the '<em><b>YUnit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD__YUNIT = 2;

	/**
	 * The feature id for the '<em><b>YD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD__YD = 3;

	/**
	 * The feature id for the '<em><b>Num Pts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD__NUM_PTS = 4;

	/**
	 * The feature id for the '<em><b>Crv Pts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD__CRV_PTS = 5;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD__D = 6;

	/**
	 * The feature id for the '<em><b>DU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD__DU = 7;

	/**
	 * The number of structural features of the '<em>CSD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>CSD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamp</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.TimeStamp
	 * @generated
	 */
	EClass getTimeStamp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.TimeStamp#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.TimeStamp#getVal()
	 * @see #getTimeStamp()
	 * @generated
	 */
	EReference getTimeStamp_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.P_TimeStamp <em>PTime Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTime Stamp</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.P_TimeStamp
	 * @generated
	 */
	EClass getP_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.P_TimeStamp#getSecondSinceEpoch <em>Second Since Epoch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Since Epoch</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.P_TimeStamp#getSecondSinceEpoch()
	 * @see #getP_TimeStamp()
	 * @generated
	 */
	EAttribute getP_TimeStamp_SecondSinceEpoch();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.P_TimeStamp#getFractionOfSecond <em>Fraction Of Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction Of Second</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.P_TimeStamp#getFractionOfSecond()
	 * @see #getP_TimeStamp()
	 * @generated
	 */
	EAttribute getP_TimeStamp_FractionOfSecond();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.P_TimeStamp#getTimeQuality <em>Time Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Quality</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.P_TimeStamp#getTimeQuality()
	 * @see #getP_TimeStamp()
	 * @generated
	 */
	EReference getP_TimeStamp_TimeQuality();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.TimeQuality <em>Time Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Quality</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.TimeQuality
	 * @generated
	 */
	EClass getTimeQuality();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isLeapSecondsKnown <em>Leap Seconds Known</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leap Seconds Known</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.TimeQuality#isLeapSecondsKnown()
	 * @see #getTimeQuality()
	 * @generated
	 */
	EAttribute getTimeQuality_LeapSecondsKnown();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isClockFailure <em>Clock Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Failure</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.TimeQuality#isClockFailure()
	 * @see #getTimeQuality()
	 * @generated
	 */
	EAttribute getTimeQuality_ClockFailure();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.TimeQuality#isClockNotSynchronized <em>Clock Not Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Not Synchronized</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.TimeQuality#isClockNotSynchronized()
	 * @see #getTimeQuality()
	 * @generated
	 */
	EAttribute getTimeQuality_ClockNotSynchronized();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.TimeQuality#getTimeAccuracy <em>Time Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Accuracy</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.TimeQuality#getTimeAccuracy()
	 * @see #getTimeQuality()
	 * @generated
	 */
	EAttribute getTimeQuality_TimeAccuracy();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.AnalogueValue <em>Analogue Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analogue Value</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.AnalogueValue
	 * @generated
	 */
	EClass getAnalogueValue();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.AnalogueValue#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.AnalogueValue#getI()
	 * @see #getAnalogueValue()
	 * @generated
	 */
	EAttribute getAnalogueValue_I();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.AnalogueValue#getF <em>F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>F</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.AnalogueValue#getF()
	 * @see #getAnalogueValue()
	 * @generated
	 */
	EAttribute getAnalogueValue_F();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.AngleReference <em>Angle Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Reference</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.AngleReference
	 * @generated
	 */
	EClass getAngleReference();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.AngleReference#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.AngleReference#getVal()
	 * @see #getAngleReference()
	 * @generated
	 */
	EAttribute getAngleReference_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.BSControl <em>BS Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BS Control</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSControl
	 * @generated
	 */
	EClass getBSControl();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BSControl#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSControl#getVal()
	 * @see #getBSControl()
	 * @generated
	 */
	EAttribute getBSControl_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.CMVAngleReference <em>CMV Angle Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMV Angle Reference</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMVAngleReference
	 * @generated
	 */
	EClass getCMVAngleReference();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CMVAngleReference#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMVAngleReference#getVal()
	 * @see #getCMVAngleReference()
	 * @generated
	 */
	EAttribute getCMVAngleReference_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ControlOutput <em>Control Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Output</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControlOutput
	 * @generated
	 */
	EClass getControlOutput();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ControlOutput#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControlOutput#getVal()
	 * @see #getControlOutput()
	 * @generated
	 */
	EAttribute getControlOutput_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.CtlModels <em>Ctl Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctl Models</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CtlModels
	 * @generated
	 */
	EClass getCtlModels();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CtlModels#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CtlModels#getVal()
	 * @see #getCtlModels()
	 * @generated
	 */
	EAttribute getCtlModels_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.CurveChar <em>Curve Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve Char</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CurveChar
	 * @generated
	 */
	EClass getCurveChar();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CurveChar#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CurveChar#getVal()
	 * @see #getCurveChar()
	 * @generated
	 */
	EAttribute getCurveChar_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.DirectionPhase <em>Direction Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction Phase</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DirectionPhase
	 * @generated
	 */
	EClass getDirectionPhase();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DirectionPhase#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DirectionPhase#getVal()
	 * @see #getDirectionPhase()
	 * @generated
	 */
	EAttribute getDirectionPhase_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.DPStatus <em>DP Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DP Status</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPStatus
	 * @generated
	 */
	EClass getDPStatus();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPStatus#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPStatus#getVal()
	 * @see #getDPStatus()
	 * @generated
	 */
	EAttribute getDPStatus_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.FaultDirection <em>Fault Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Direction</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.FaultDirection
	 * @generated
	 */
	EClass getFaultDirection();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.FaultDirection#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.FaultDirection#getVal()
	 * @see #getFaultDirection()
	 * @generated
	 */
	EAttribute getFaultDirection_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.MagReference <em>Mag Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mag Reference</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MagReference
	 * @generated
	 */
	EClass getMagReference();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.MagReference#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MagReference#getVal()
	 * @see #getMagReference()
	 * @generated
	 */
	EAttribute getMagReference_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Multiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplier</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Multiplier
	 * @generated
	 */
	EClass getMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Multiplier#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Multiplier#getVal()
	 * @see #getMultiplier()
	 * @generated
	 */
	EAttribute getMultiplier_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Originator <em>Originator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Originator</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Originator
	 * @generated
	 */
	EClass getOriginator();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Originator#getOrident <em>Orident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orident</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Originator#getOrident()
	 * @see #getOriginator()
	 * @generated
	 */
	EAttribute getOriginator_Orident();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.Originator#getOrCat <em>Or Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Or Cat</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Originator#getOrCat()
	 * @see #getOriginator()
	 * @generated
	 */
	EReference getOriginator_OrCat();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.OriginatorCategory <em>Originator Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Originator Category</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.OriginatorCategory
	 * @generated
	 */
	EClass getOriginatorCategory();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.OriginatorCategory#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.OriginatorCategory#getVal()
	 * @see #getOriginatorCategory()
	 * @generated
	 */
	EAttribute getOriginatorCategory_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.PhaseReference <em>Phase Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Reference</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PhaseReference
	 * @generated
	 */
	EClass getPhaseReference();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.PhaseReference#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PhaseReference#getVal()
	 * @see #getPhaseReference()
	 * @generated
	 */
	EAttribute getPhaseReference_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Point#getXVal <em>XVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XVal</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Point#getXVal()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_XVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Point#getYVal <em>YVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YVal</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Point#getYVal()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_YVal();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.PointArray <em>Point Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Array</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PointArray
	 * @generated
	 */
	EClass getPointArray();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.substationStandard.Dataclasses.PointArray#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Point</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PointArray#getPoint()
	 * @see #getPointArray()
	 * @generated
	 */
	EReference getPointArray_Point();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.PulseConfig <em>Pulse Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pulse Config</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PulseConfig
	 * @generated
	 */
	EClass getPulseConfig();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.PulseConfig#getOnDur <em>On Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Dur</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PulseConfig#getOnDur()
	 * @see #getPulseConfig()
	 * @generated
	 */
	EAttribute getPulseConfig_OnDur();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.PulseConfig#getOffDur <em>Off Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Off Dur</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PulseConfig#getOffDur()
	 * @see #getPulseConfig()
	 * @generated
	 */
	EAttribute getPulseConfig_OffDur();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.PulseConfig#getNumPls <em>Num Pls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Pls</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PulseConfig#getNumPls()
	 * @see #getPulseConfig()
	 * @generated
	 */
	EAttribute getPulseConfig_NumPls();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.PulseConfig#getCmdQual <em>Cmd Qual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cmd Qual</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PulseConfig#getCmdQual()
	 * @see #getPulseConfig()
	 * @generated
	 */
	EReference getPulseConfig_CmdQual();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Quality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Quality
	 * @generated
	 */
	EClass getQuality();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Quality#isTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Quality#isTest()
	 * @see #getQuality()
	 * @generated
	 */
	EAttribute getQuality_Test();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Quality#isOperatorBlocked <em>Operator Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Blocked</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Quality#isOperatorBlocked()
	 * @see #getQuality()
	 * @generated
	 */
	EAttribute getQuality_OperatorBlocked();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Quality#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Quality#getValidity()
	 * @see #getQuality()
	 * @generated
	 */
	EAttribute getQuality_Validity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Quality#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Quality#getSource()
	 * @see #getQuality()
	 * @generated
	 */
	EAttribute getQuality_Source();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.Quality#getDetailQual <em>Detail Qual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detail Qual</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Quality#getDetailQual()
	 * @see #getQuality()
	 * @generated
	 */
	EReference getQuality_DetailQual();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.DetailQual <em>Detail Qual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail Qual</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual
	 * @generated
	 */
	EClass getDetailQual();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DetailQual#isOverflow <em>Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overflow</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual#isOverflow()
	 * @see #getDetailQual()
	 * @generated
	 */
	EAttribute getDetailQual_Overflow();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DetailQual#isOutOfRange <em>Out Of Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Of Range</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual#isOutOfRange()
	 * @see #getDetailQual()
	 * @generated
	 */
	EAttribute getDetailQual_OutOfRange();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DetailQual#isBadReference <em>Bad Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bad Reference</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual#isBadReference()
	 * @see #getDetailQual()
	 * @generated
	 */
	EAttribute getDetailQual_BadReference();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DetailQual#isOscillatory <em>Oscillatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscillatory</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual#isOscillatory()
	 * @see #getDetailQual()
	 * @generated
	 */
	EAttribute getDetailQual_Oscillatory();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DetailQual#isFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual#isFailure()
	 * @see #getDetailQual()
	 * @generated
	 */
	EAttribute getDetailQual_Failure();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DetailQual#isOldData <em>Old Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Data</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual#isOldData()
	 * @see #getDetailQual()
	 * @generated
	 */
	EAttribute getDetailQual_OldData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DetailQual#isInconsistent <em>Inconsistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inconsistent</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual#isInconsistent()
	 * @see #getDetailQual()
	 * @generated
	 */
	EAttribute getDetailQual_Inconsistent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DetailQual#isInaccurate <em>Inaccurate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inaccurate</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DetailQual#isInaccurate()
	 * @see #getDetailQual()
	 * @generated
	 */
	EAttribute getDetailQual_Inaccurate();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Range#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Range#getVal()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.RangeConfig <em>Range Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Config</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.RangeConfig
	 * @generated
	 */
	EClass getRangeConfig();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.RangeConfig#getHhLim <em>Hh Lim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hh Lim</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.RangeConfig#getHhLim()
	 * @see #getRangeConfig()
	 * @generated
	 */
	EReference getRangeConfig_HhLim();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.RangeConfig#getHLim <em>HLim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HLim</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.RangeConfig#getHLim()
	 * @see #getRangeConfig()
	 * @generated
	 */
	EReference getRangeConfig_HLim();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.RangeConfig#getLLim <em>LLim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LLim</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.RangeConfig#getLLim()
	 * @see #getRangeConfig()
	 * @generated
	 */
	EReference getRangeConfig_LLim();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.RangeConfig#getLlLim <em>Ll Lim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ll Lim</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.RangeConfig#getLlLim()
	 * @see #getRangeConfig()
	 * @generated
	 */
	EReference getRangeConfig_LlLim();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.RangeConfig#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.RangeConfig#getMin()
	 * @see #getRangeConfig()
	 * @generated
	 */
	EReference getRangeConfig_Min();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.RangeConfig#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.RangeConfig#getMax()
	 * @see #getRangeConfig()
	 * @generated
	 */
	EReference getRangeConfig_Max();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.SboClasses <em>Sbo Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sbo Classes</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SboClasses
	 * @generated
	 */
	EClass getSboClasses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SboClasses#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SboClasses#getVal()
	 * @see #getSboClasses()
	 * @generated
	 */
	EAttribute getSboClasses_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ScaledValueConfig <em>Scaled Value Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaled Value Config</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ScaledValueConfig
	 * @generated
	 */
	EClass getScaledValueConfig();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ScaledValueConfig#getScaleFactor <em>Scale Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Factor</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ScaledValueConfig#getScaleFactor()
	 * @see #getScaledValueConfig()
	 * @generated
	 */
	EAttribute getScaledValueConfig_ScaleFactor();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ScaledValueConfig#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ScaledValueConfig#getOffset()
	 * @see #getScaledValueConfig()
	 * @generated
	 */
	EAttribute getScaledValueConfig_Offset();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Sequence#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Sequence#getVal()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Severity
	 * @generated
	 */
	EClass getSeverity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.Severity#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Severity#getVal()
	 * @see #getSeverity()
	 * @generated
	 */
	EAttribute getSeverity_Val();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.SlUnits <em>Sl Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sl Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SlUnits
	 * @generated
	 */
	EClass getSlUnits();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SlUnits#getSlUnitsKind <em>Sl Units Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sl Units Kind</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SlUnits#getSlUnitsKind()
	 * @see #getSlUnits()
	 * @generated
	 */
	EAttribute getSlUnits_SlUnitsKind();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Units
	 * @generated
	 */
	EClass getUnits();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.Units#getSlUnits <em>Sl Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sl Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Units#getSlUnits()
	 * @see #getUnits()
	 * @generated
	 */
	EReference getUnits_SlUnits();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.Units#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multiplier</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Units#getMultiplier()
	 * @see #getUnits()
	 * @generated
	 */
	EReference getUnits_Multiplier();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ValWithTrans <em>Val With Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Val With Trans</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ValWithTrans
	 * @generated
	 */
	EClass getValWithTrans();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ValWithTrans#getPosVal <em>Pos Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ValWithTrans#getPosVal()
	 * @see #getValWithTrans()
	 * @generated
	 */
	EAttribute getValWithTrans_PosVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ValWithTrans#isTransInd <em>Trans Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Ind</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ValWithTrans#isTransInd()
	 * @see #getValWithTrans()
	 * @generated
	 */
	EAttribute getValWithTrans_TransInd();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.Vector#getMag <em>Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mag</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Vector#getMag()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_Mag();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.Vector#getAng <em>Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.Vector#getAng()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_Ang();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.VectorArray <em>Vector Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Array</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.VectorArray
	 * @generated
	 */
	EClass getVectorArray();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.substationStandard.Dataclasses.VectorArray#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vector</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.VectorArray#getVector()
	 * @see #getVectorArray()
	 * @generated
	 */
	EReference getVectorArray_Vector();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC <em>CPrimitive CDC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPrimitive CDC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC
	 * @generated
	 */
	EClass getC_PrimitiveCDC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC#getCdcNs <em>Cdc Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdc Ns</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC#getCdcNs()
	 * @see #getC_PrimitiveCDC()
	 * @generated
	 */
	EAttribute getC_PrimitiveCDC_CdcNs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC#getCdcName <em>Cdc Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdc Name</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC#getCdcName()
	 * @see #getC_PrimitiveCDC()
	 * @generated
	 */
	EAttribute getC_PrimitiveCDC_CdcName();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC#getDataNs <em>Data Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Ns</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.C_PrimitiveCDC#getDataNs()
	 * @see #getC_PrimitiveCDC()
	 * @generated
	 */
	EAttribute getC_PrimitiveCDC_DataNs();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.C_ComposedCDC <em>CComposed CDC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CComposed CDC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.C_ComposedCDC
	 * @generated
	 */
	EClass getC_ComposedCDC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.C_ComposedCDC#getCdcNs <em>Cdc Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdc Ns</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.C_ComposedCDC#getCdcNs()
	 * @see #getC_ComposedCDC()
	 * @generated
	 */
	EAttribute getC_ComposedCDC_CdcNs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.C_ComposedCDC#getCdcName <em>Cdc Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdc Name</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.C_ComposedCDC#getCdcName()
	 * @see #getC_ComposedCDC()
	 * @generated
	 */
	EAttribute getC_ComposedCDC_CdcName();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.C_ComposedCDC#getDataNs <em>Data Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Ns</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.C_ComposedCDC#getDataNs()
	 * @see #getC_ComposedCDC()
	 * @generated
	 */
	EAttribute getC_ComposedCDC_DataNs();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.StatusInfo <em>Status Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Info</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.StatusInfo
	 * @generated
	 */
	EClass getStatusInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.StatusInfo#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.StatusInfo#getT()
	 * @see #getStatusInfo()
	 * @generated
	 */
	EReference getStatusInfo_T();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.StatusInfo#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.StatusInfo#getD()
	 * @see #getStatusInfo()
	 * @generated
	 */
	EAttribute getStatusInfo_D();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.StatusInfo#getDU <em>DU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DU</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.StatusInfo#getDU()
	 * @see #getStatusInfo()
	 * @generated
	 */
	EAttribute getStatusInfo_DU();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.SPS <em>SPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPS</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPS
	 * @generated
	 */
	EClass getSPS();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SPS#isStVal <em>St Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>St Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPS#isStVal()
	 * @see #getSPS()
	 * @generated
	 */
	EAttribute getSPS_StVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SPS#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPS#getQ()
	 * @see #getSPS()
	 * @generated
	 */
	EReference getSPS_Q();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SPS#isSubEna <em>Sub Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Ena</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPS#isSubEna()
	 * @see #getSPS()
	 * @generated
	 */
	EAttribute getSPS_SubEna();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SPS#isSubVal <em>Sub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPS#isSubVal()
	 * @see #getSPS()
	 * @generated
	 */
	EAttribute getSPS_SubVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SPS#getSubQ <em>Sub Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPS#getSubQ()
	 * @see #getSPS()
	 * @generated
	 */
	EReference getSPS_SubQ();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SPS#getSubID <em>Sub ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub ID</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPS#getSubID()
	 * @see #getSPS()
	 * @generated
	 */
	EAttribute getSPS_SubID();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.INS <em>INS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INS</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INS
	 * @generated
	 */
	EClass getINS();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INS#getStVal <em>St Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>St Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INS#getStVal()
	 * @see #getINS()
	 * @generated
	 */
	EAttribute getINS_StVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.INS#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INS#getQ()
	 * @see #getINS()
	 * @generated
	 */
	EReference getINS_Q();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INS#isSubEna <em>Sub Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Ena</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INS#isSubEna()
	 * @see #getINS()
	 * @generated
	 */
	EAttribute getINS_SubEna();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INS#getSubVal <em>Sub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INS#getSubVal()
	 * @see #getINS()
	 * @generated
	 */
	EAttribute getINS_SubVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.INS#getSubQ <em>Sub Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INS#getSubQ()
	 * @see #getINS()
	 * @generated
	 */
	EReference getINS_SubQ();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INS#getSubID <em>Sub ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub ID</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INS#getSubID()
	 * @see #getINS()
	 * @generated
	 */
	EAttribute getINS_SubID();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.DPS <em>DPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPS</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPS
	 * @generated
	 */
	EClass getDPS();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPS#getStVal <em>St Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>St Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPS#getStVal()
	 * @see #getDPS()
	 * @generated
	 */
	EReference getDPS_StVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPS#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPS#getQ()
	 * @see #getDPS()
	 * @generated
	 */
	EReference getDPS_Q();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPS#isSubEna <em>Sub Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Ena</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPS#isSubEna()
	 * @see #getDPS()
	 * @generated
	 */
	EAttribute getDPS_SubEna();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPS#getSubVal <em>Sub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPS#getSubVal()
	 * @see #getDPS()
	 * @generated
	 */
	EReference getDPS_SubVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPS#getSubQ <em>Sub Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPS#getSubQ()
	 * @see #getDPS()
	 * @generated
	 */
	EReference getDPS_SubQ();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPS#getSubID <em>Sub ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub ID</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPS#getSubID()
	 * @see #getDPS()
	 * @generated
	 */
	EAttribute getDPS_SubID();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ACT <em>ACT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACT</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACT
	 * @generated
	 */
	EClass getACT();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACT#isGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACT#isGeneral()
	 * @see #getACT()
	 * @generated
	 */
	EAttribute getACT_General();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACT#isPhsA <em>Phs A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phs A</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACT#isPhsA()
	 * @see #getACT()
	 * @generated
	 */
	EAttribute getACT_PhsA();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACT#isPhsB <em>Phs B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phs B</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACT#isPhsB()
	 * @see #getACT()
	 * @generated
	 */
	EAttribute getACT_PhsB();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACT#isPhsC <em>Phs C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phs C</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACT#isPhsC()
	 * @see #getACT()
	 * @generated
	 */
	EAttribute getACT_PhsC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACT#isNeut <em>Neut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neut</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACT#isNeut()
	 * @see #getACT()
	 * @generated
	 */
	EAttribute getACT_Neut();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ACT#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACT#getQ()
	 * @see #getACT()
	 * @generated
	 */
	EReference getACT_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ACT#getOperTm <em>Oper Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oper Tm</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACT#getOperTm()
	 * @see #getACT()
	 * @generated
	 */
	EReference getACT_OperTm();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ACD <em>ACD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACD</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD
	 * @generated
	 */
	EClass getACD();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACD#isGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#isGeneral()
	 * @see #getACD()
	 * @generated
	 */
	EAttribute getACD_General();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ACD#getDirGeneral <em>Dir General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir General</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#getDirGeneral()
	 * @see #getACD()
	 * @generated
	 */
	EReference getACD_DirGeneral();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACD#isPhsA <em>Phs A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phs A</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#isPhsA()
	 * @see #getACD()
	 * @generated
	 */
	EAttribute getACD_PhsA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ACD#getDirPhsA <em>Dir Phs A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Phs A</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#getDirPhsA()
	 * @see #getACD()
	 * @generated
	 */
	EReference getACD_DirPhsA();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACD#isPhsB <em>Phs B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phs B</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#isPhsB()
	 * @see #getACD()
	 * @generated
	 */
	EAttribute getACD_PhsB();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ACD#getDirPhsB <em>Dir Phs B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Phs B</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#getDirPhsB()
	 * @see #getACD()
	 * @generated
	 */
	EReference getACD_DirPhsB();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACD#isPhsC <em>Phs C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phs C</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#isPhsC()
	 * @see #getACD()
	 * @generated
	 */
	EAttribute getACD_PhsC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ACD#getDirPhsC <em>Dir Phs C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Phs C</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#getDirPhsC()
	 * @see #getACD()
	 * @generated
	 */
	EReference getACD_DirPhsC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ACD#isNeut <em>Neut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neut</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#isNeut()
	 * @see #getACD()
	 * @generated
	 */
	EAttribute getACD_Neut();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ACD#getDirNeut <em>Dir Neut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Neut</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#getDirNeut()
	 * @see #getACD()
	 * @generated
	 */
	EReference getACD_DirNeut();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ACD#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ACD#getQ()
	 * @see #getACD()
	 * @generated
	 */
	EReference getACD_Q();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.SEC <em>SEC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEC
	 * @generated
	 */
	EClass getSEC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SEC#getCnt <em>Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cnt</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEC#getCnt()
	 * @see #getSEC()
	 * @generated
	 */
	EAttribute getSEC_Cnt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SEC#getSev <em>Sev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sev</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEC#getSev()
	 * @see #getSEC()
	 * @generated
	 */
	EReference getSEC_Sev();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SEC#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEC#getAddr()
	 * @see #getSEC()
	 * @generated
	 */
	EAttribute getSEC_Addr();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SEC#getAddInfo <em>Add Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Info</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEC#getAddInfo()
	 * @see #getSEC()
	 * @generated
	 */
	EAttribute getSEC_AddInfo();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.BCR <em>BCR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCR</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR
	 * @generated
	 */
	EClass getBCR();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BCR#getActVal <em>Act Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Act Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#getActVal()
	 * @see #getBCR()
	 * @generated
	 */
	EAttribute getBCR_ActVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BCR#getFrVal <em>Fr Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fr Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#getFrVal()
	 * @see #getBCR()
	 * @generated
	 */
	EAttribute getBCR_FrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BCR#getFrTm <em>Fr Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fr Tm</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#getFrTm()
	 * @see #getBCR()
	 * @generated
	 */
	EReference getBCR_FrTm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BCR#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#getQ()
	 * @see #getBCR()
	 * @generated
	 */
	EReference getBCR_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BCR#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#getUnits()
	 * @see #getBCR()
	 * @generated
	 */
	EReference getBCR_Units();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BCR#getPulsQty <em>Puls Qty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puls Qty</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#getPulsQty()
	 * @see #getBCR()
	 * @generated
	 */
	EAttribute getBCR_PulsQty();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BCR#isFrEna <em>Fr Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fr Ena</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#isFrEna()
	 * @see #getBCR()
	 * @generated
	 */
	EAttribute getBCR_FrEna();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BCR#getStrTm <em>Str Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Tm</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#getStrTm()
	 * @see #getBCR()
	 * @generated
	 */
	EReference getBCR_StrTm();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BCR#getFrPd <em>Fr Pd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fr Pd</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#getFrPd()
	 * @see #getBCR()
	 * @generated
	 */
	EAttribute getBCR_FrPd();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BCR#isFrRs <em>Fr Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fr Rs</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BCR#isFrRs()
	 * @see #getBCR()
	 * @generated
	 */
	EAttribute getBCR_FrRs();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo <em>Primitive Measure And Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Measure And Info</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo
	 * @generated
	 */
	EClass getPrimitiveMeasureAndInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo#getD()
	 * @see #getPrimitiveMeasureAndInfo()
	 * @generated
	 */
	EAttribute getPrimitiveMeasureAndInfo_D();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo#getDU <em>DU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DU</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.PrimitiveMeasureAndInfo#getDU()
	 * @see #getPrimitiveMeasureAndInfo()
	 * @generated
	 */
	EAttribute getPrimitiveMeasureAndInfo_DU();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ComposedMeasureAndInfo <em>Composed Measure And Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Measure And Info</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ComposedMeasureAndInfo
	 * @generated
	 */
	EClass getComposedMeasureAndInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ComposedMeasureAndInfo#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ComposedMeasureAndInfo#getD()
	 * @see #getComposedMeasureAndInfo()
	 * @generated
	 */
	EAttribute getComposedMeasureAndInfo_D();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ComposedMeasureAndInfo#getDU <em>DU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DU</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ComposedMeasureAndInfo#getDU()
	 * @see #getComposedMeasureAndInfo()
	 * @generated
	 */
	EAttribute getComposedMeasureAndInfo_DU();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.MV <em>MV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MV</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV
	 * @generated
	 */
	EClass getMV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getInstMag <em>Inst Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inst Mag</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getInstMag()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_InstMag();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getMag <em>Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mag</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getMag()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_Mag();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getRange()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_Range();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getQ()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getT()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_T();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.MV#isSubEna <em>Sub Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Ena</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#isSubEna()
	 * @see #getMV()
	 * @generated
	 */
	EAttribute getMV_SubEna();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getSubMag <em>Sub Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Mag</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getSubMag()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_SubMag();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getSubQ <em>Sub Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getSubQ()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_SubQ();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.MV#getSubID <em>Sub ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub ID</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getSubID()
	 * @see #getMV()
	 * @generated
	 */
	EAttribute getMV_SubID();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getUnits()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_Units();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.MV#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getDb()
	 * @see #getMV()
	 * @generated
	 */
	EAttribute getMV_Db();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.MV#getZeroDb <em>Zero Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero Db</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getZeroDb()
	 * @see #getMV()
	 * @generated
	 */
	EAttribute getMV_ZeroDb();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getSVC <em>SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SVC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getSVC()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_SVC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.MV#getRangeC <em>Range C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range C</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getRangeC()
	 * @see #getMV()
	 * @generated
	 */
	EReference getMV_RangeC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.MV#getSmpRate <em>Smp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smp Rate</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.MV#getSmpRate()
	 * @see #getMV()
	 * @generated
	 */
	EAttribute getMV_SmpRate();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.CMV <em>CMV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMV</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV
	 * @generated
	 */
	EClass getCMV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getInstCVal <em>Inst CVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inst CVal</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getInstCVal()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_InstCVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getCVal <em>CVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CVal</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getCVal()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_CVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getRange()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_Range();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getQ()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getT()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_T();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CMV#isSubEna <em>Sub Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Ena</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#isSubEna()
	 * @see #getCMV()
	 * @generated
	 */
	EAttribute getCMV_SubEna();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getSubCVal <em>Sub CVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub CVal</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getSubCVal()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_SubCVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getSubQ <em>Sub Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getSubQ()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_SubQ();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CMV#getSubID <em>Sub ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub ID</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getSubID()
	 * @see #getCMV()
	 * @generated
	 */
	EAttribute getCMV_SubID();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getUnits()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_Units();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CMV#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getDb()
	 * @see #getCMV()
	 * @generated
	 */
	EAttribute getCMV_Db();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CMV#getZeroDb <em>Zero Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero Db</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getZeroDb()
	 * @see #getCMV()
	 * @generated
	 */
	EAttribute getCMV_ZeroDb();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getRangeC <em>Range C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range C</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getRangeC()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_RangeC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getMagSVC <em>Mag SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mag SVC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getMagSVC()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_MagSVC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getAngSVC <em>Ang SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang SVC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getAngSVC()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_AngSVC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CMV#getAngRef <em>Ang Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getAngRef()
	 * @see #getCMV()
	 * @generated
	 */
	EReference getCMV_AngRef();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CMV#getSmpRate <em>Smp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smp Rate</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CMV#getSmpRate()
	 * @see #getCMV()
	 * @generated
	 */
	EAttribute getCMV_SmpRate();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.SAV <em>SAV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAV</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SAV
	 * @generated
	 */
	EClass getSAV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SAV#getInstMag <em>Inst Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inst Mag</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SAV#getInstMag()
	 * @see #getSAV()
	 * @generated
	 */
	EReference getSAV_InstMag();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SAV#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SAV#getQ()
	 * @see #getSAV()
	 * @generated
	 */
	EReference getSAV_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SAV#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SAV#getT()
	 * @see #getSAV()
	 * @generated
	 */
	EReference getSAV_T();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SAV#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SAV#getUnits()
	 * @see #getSAV()
	 * @generated
	 */
	EReference getSAV_Units();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SAV#getSVC <em>SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SVC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SAV#getSVC()
	 * @see #getSAV()
	 * @generated
	 */
	EReference getSAV_SVC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SAV#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SAV#getMin()
	 * @see #getSAV()
	 * @generated
	 */
	EReference getSAV_Min();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SAV#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SAV#getMax()
	 * @see #getSAV()
	 * @generated
	 */
	EReference getSAV_Max();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.DEL <em>DEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEL</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DEL
	 * @generated
	 */
	EClass getDEL();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsAB <em>Phs AB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs AB</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DEL#getPhsAB()
	 * @see #getDEL()
	 * @generated
	 */
	EReference getDEL_PhsAB();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsBC <em>Phs BC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs BC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DEL#getPhsBC()
	 * @see #getDEL()
	 * @generated
	 */
	EReference getDEL_PhsBC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DEL#getPhsCA <em>Phs CA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs CA</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DEL#getPhsCA()
	 * @see #getDEL()
	 * @generated
	 */
	EReference getDEL_PhsCA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DEL#getAngRef <em>Ang Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DEL#getAngRef()
	 * @see #getDEL()
	 * @generated
	 */
	EReference getDEL_AngRef();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.WYE <em>WYE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WYE</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.WYE
	 * @generated
	 */
	EClass getWYE();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.WYE#getPhsA <em>Phs A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs A</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.WYE#getPhsA()
	 * @see #getWYE()
	 * @generated
	 */
	EReference getWYE_PhsA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.WYE#getPhsB <em>Phs B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs B</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.WYE#getPhsB()
	 * @see #getWYE()
	 * @generated
	 */
	EReference getWYE_PhsB();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.WYE#getPhsC <em>Phs C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs C</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.WYE#getPhsC()
	 * @see #getWYE()
	 * @generated
	 */
	EReference getWYE_PhsC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.WYE#getNeut <em>Neut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neut</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.WYE#getNeut()
	 * @see #getWYE()
	 * @generated
	 */
	EReference getWYE_Neut();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.WYE#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.WYE#getNet()
	 * @see #getWYE()
	 * @generated
	 */
	EReference getWYE_Net();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.WYE#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Res</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.WYE#getRes()
	 * @see #getWYE()
	 * @generated
	 */
	EReference getWYE_Res();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.WYE#getAngRef <em>Ang Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.WYE#getAngRef()
	 * @see #getWYE()
	 * @generated
	 */
	EReference getWYE_AngRef();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.SEQ <em>SEQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEQ</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEQ
	 * @generated
	 */
	EClass getSEQ();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SEQ#getC1 <em>C1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>C1</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEQ#getC1()
	 * @see #getSEQ()
	 * @generated
	 */
	EReference getSEQ_C1();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SEQ#getC2 <em>C2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>C2</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEQ#getC2()
	 * @see #getSEQ()
	 * @generated
	 */
	EReference getSEQ_C2();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SEQ#getC3 <em>C3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>C3</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEQ#getC3()
	 * @see #getSEQ()
	 * @generated
	 */
	EReference getSEQ_C3();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SEQ#getSeqT <em>Seq T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seq T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEQ#getSeqT()
	 * @see #getSEQ()
	 * @generated
	 */
	EReference getSEQ_SeqT();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SEQ#getPhsRef <em>Phs Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SEQ#getPhsRef()
	 * @see #getSEQ()
	 * @generated
	 */
	EReference getSEQ_PhsRef();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.HMV <em>HMV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMV</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV
	 * @generated
	 */
	EClass getHMV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HMV#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getQ()
	 * @see #getHMV()
	 * @generated
	 */
	EReference getHMV_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HMV#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getT()
	 * @see #getHMV()
	 * @generated
	 */
	EReference getHMV_T();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HMV#getHar <em>Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getHar()
	 * @see #getHMV()
	 * @generated
	 */
	EReference getHMV_Har();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HMV#getNumHar <em>Num Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getNumHar()
	 * @see #getHMV()
	 * @generated
	 */
	EAttribute getHMV_NumHar();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HMV#getNumCyc <em>Num Cyc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cyc</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getNumCyc()
	 * @see #getHMV()
	 * @generated
	 */
	EAttribute getHMV_NumCyc();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HMV#getEvalTm <em>Eval Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eval Tm</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getEvalTm()
	 * @see #getHMV()
	 * @generated
	 */
	EAttribute getHMV_EvalTm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HMV#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getUnits()
	 * @see #getHMV()
	 * @generated
	 */
	EReference getHMV_Units();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HMV#getSmpRate <em>Smp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smp Rate</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getSmpRate()
	 * @see #getHMV()
	 * @generated
	 */
	EAttribute getHMV_SmpRate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HMV#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getFrequency()
	 * @see #getHMV()
	 * @generated
	 */
	EAttribute getHMV_Frequency();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HMV#getHvRef <em>Hv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hv Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getHvRef()
	 * @see #getHMV()
	 * @generated
	 */
	EReference getHMV_HvRef();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HMV#getRmsCyc <em>Rms Cyc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rms Cyc</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HMV#getRmsCyc()
	 * @see #getHMV()
	 * @generated
	 */
	EAttribute getHMV_RmsCyc();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.HYWE <em>HYWE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HYWE</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE
	 * @generated
	 */
	EClass getHYWE();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getQ()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getT()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_T();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getPhsAHar <em>Phs AHar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs AHar</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getPhsAHar()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_PhsAHar();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getPhsBHar <em>Phs BHar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs BHar</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getPhsBHar()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_PhsBHar();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getPhsCHar <em>Phs CHar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs CHar</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getPhsCHar()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_PhsCHar();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getNeutHar <em>Neut Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neut Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getNeutHar()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_NeutHar();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getNetHar <em>Net Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getNetHar()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_NetHar();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getResHar <em>Res Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Res Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getResHar()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_ResHar();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HYWE#getNumHar <em>Num Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getNumHar()
	 * @see #getHYWE()
	 * @generated
	 */
	EAttribute getHYWE_NumHar();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HYWE#getNumCyc <em>Num Cyc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cyc</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getNumCyc()
	 * @see #getHYWE()
	 * @generated
	 */
	EAttribute getHYWE_NumCyc();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HYWE#getEvalTm <em>Eval Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eval Tm</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getEvalTm()
	 * @see #getHYWE()
	 * @generated
	 */
	EAttribute getHYWE_EvalTm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getUnits()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_Units();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getAngRef <em>Ang Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getAngRef()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_AngRef();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HYWE#getSmpRate <em>Smp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smp Rate</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getSmpRate()
	 * @see #getHYWE()
	 * @generated
	 */
	EAttribute getHYWE_SmpRate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HYWE#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getFrequency()
	 * @see #getHYWE()
	 * @generated
	 */
	EAttribute getHYWE_Frequency();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HYWE#getHvRef <em>Hv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hv Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getHvRef()
	 * @see #getHYWE()
	 * @generated
	 */
	EReference getHYWE_HvRef();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HYWE#getRmsCyc <em>Rms Cyc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rms Cyc</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HYWE#getRmsCyc()
	 * @see #getHYWE()
	 * @generated
	 */
	EAttribute getHYWE_RmsCyc();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.HDEL <em>HDEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDEL</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL
	 * @generated
	 */
	EClass getHDEL();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HDEL#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getQ()
	 * @see #getHDEL()
	 * @generated
	 */
	EReference getHDEL_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HDEL#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getT()
	 * @see #getHDEL()
	 * @generated
	 */
	EReference getHDEL_T();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsABHar <em>Phs AB Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs AB Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getPhsABHar()
	 * @see #getHDEL()
	 * @generated
	 */
	EReference getHDEL_PhsABHar();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsBCHar <em>Phs BC Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs BC Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getPhsBCHar()
	 * @see #getHDEL()
	 * @generated
	 */
	EReference getHDEL_PhsBCHar();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HDEL#getPhsCAHar <em>Phs CA Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phs CA Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getPhsCAHar()
	 * @see #getHDEL()
	 * @generated
	 */
	EReference getHDEL_PhsCAHar();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HDEL#getNumHar <em>Num Har</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Har</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getNumHar()
	 * @see #getHDEL()
	 * @generated
	 */
	EAttribute getHDEL_NumHar();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HDEL#getNumCyc <em>Num Cyc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cyc</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getNumCyc()
	 * @see #getHDEL()
	 * @generated
	 */
	EAttribute getHDEL_NumCyc();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HDEL#getEvalTm <em>Eval Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eval Tm</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getEvalTm()
	 * @see #getHDEL()
	 * @generated
	 */
	EAttribute getHDEL_EvalTm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HDEL#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getUnits()
	 * @see #getHDEL()
	 * @generated
	 */
	EReference getHDEL_Units();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HDEL#getAngRef <em>Ang Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getAngRef()
	 * @see #getHDEL()
	 * @generated
	 */
	EReference getHDEL_AngRef();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HDEL#getSmpRate <em>Smp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smp Rate</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getSmpRate()
	 * @see #getHDEL()
	 * @generated
	 */
	EAttribute getHDEL_SmpRate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HDEL#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getFrequency()
	 * @see #getHDEL()
	 * @generated
	 */
	EAttribute getHDEL_Frequency();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.HDEL#getHvRef <em>Hv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hv Ref</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getHvRef()
	 * @see #getHDEL()
	 * @generated
	 */
	EReference getHDEL_HvRef();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.HDEL#getRmsCyc <em>Rms Cyc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rms Cyc</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.HDEL#getRmsCyc()
	 * @see #getHDEL()
	 * @generated
	 */
	EAttribute getHDEL_RmsCyc();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo <em>Controllable Status Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controllable Status Info</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo
	 * @generated
	 */
	EClass getControllableStatusInfo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getOperTm <em>Oper Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oper Tm</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getOperTm()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EReference getControllableStatusInfo_OperTm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getOrigin()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EReference getControllableStatusInfo_Origin();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getCtlNum <em>Ctl Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctl Num</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getCtlNum()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EAttribute getControllableStatusInfo_CtlNum();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#isStSeld <em>St Seld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>St Seld</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#isStSeld()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EAttribute getControllableStatusInfo_StSeld();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#isSubEna <em>Sub Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Ena</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#isSubEna()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EAttribute getControllableStatusInfo_SubEna();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getSubQ <em>Sub Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getSubQ()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EReference getControllableStatusInfo_SubQ();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getSubID <em>Sub ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub ID</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getSubID()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EAttribute getControllableStatusInfo_SubID();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getCtlModel <em>Ctl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctl Model</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getCtlModel()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EReference getControllableStatusInfo_CtlModel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getSboTimeout <em>Sbo Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sbo Timeout</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getSboTimeout()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EAttribute getControllableStatusInfo_SboTimeout();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getSboClass <em>Sbo Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sbo Class</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getSboClass()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EReference getControllableStatusInfo_SboClass();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getD()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EAttribute getControllableStatusInfo_D();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getDU <em>DU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DU</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableStatusInfo#getDU()
	 * @see #getControllableStatusInfo()
	 * @generated
	 */
	EAttribute getControllableStatusInfo_DU();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.SPC <em>SPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPC
	 * @generated
	 */
	EClass getSPC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SPC#isCtlVal <em>Ctl Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctl Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPC#isCtlVal()
	 * @see #getSPC()
	 * @generated
	 */
	EAttribute getSPC_CtlVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SPC#isStVal <em>St Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>St Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPC#isStVal()
	 * @see #getSPC()
	 * @generated
	 */
	EAttribute getSPC_StVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SPC#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPC#getQ()
	 * @see #getSPC()
	 * @generated
	 */
	EReference getSPC_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SPC#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPC#getT()
	 * @see #getSPC()
	 * @generated
	 */
	EReference getSPC_T();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SPC#isSubVal <em>Sub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPC#isSubVal()
	 * @see #getSPC()
	 * @generated
	 */
	EAttribute getSPC_SubVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.SPC#getPulseConfig <em>Pulse Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pulse Config</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPC#getPulseConfig()
	 * @see #getSPC()
	 * @generated
	 */
	EReference getSPC_PulseConfig();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.DPC <em>DPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPC
	 * @generated
	 */
	EClass getDPC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPC#isCtlVal <em>Ctl Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctl Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPC#isCtlVal()
	 * @see #getDPC()
	 * @generated
	 */
	EAttribute getDPC_CtlVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPC#getStVal <em>St Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>St Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPC#getStVal()
	 * @see #getDPC()
	 * @generated
	 */
	EReference getDPC_StVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPC#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPC#getQ()
	 * @see #getDPC()
	 * @generated
	 */
	EReference getDPC_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPC#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPC#getT()
	 * @see #getDPC()
	 * @generated
	 */
	EReference getDPC_T();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPC#getSubVal <em>Sub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPC#getSubVal()
	 * @see #getDPC()
	 * @generated
	 */
	EReference getDPC_SubVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.DPC#getPulseConfig <em>Pulse Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pulse Config</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPC#getPulseConfig()
	 * @see #getDPC()
	 * @generated
	 */
	EReference getDPC_PulseConfig();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.INC <em>INC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC
	 * @generated
	 */
	EClass getINC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INC#getCtlVal <em>Ctl Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctl Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC#getCtlVal()
	 * @see #getINC()
	 * @generated
	 */
	EAttribute getINC_CtlVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INC#getStVal <em>St Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>St Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC#getStVal()
	 * @see #getINC()
	 * @generated
	 */
	EAttribute getINC_StVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.INC#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC#getQ()
	 * @see #getINC()
	 * @generated
	 */
	EReference getINC_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.INC#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC#getT()
	 * @see #getINC()
	 * @generated
	 */
	EReference getINC_T();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INC#getSubVal <em>Sub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC#getSubVal()
	 * @see #getINC()
	 * @generated
	 */
	EAttribute getINC_SubVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INC#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC#getMinVal()
	 * @see #getINC()
	 * @generated
	 */
	EAttribute getINC_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INC#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC#getMaxVal()
	 * @see #getINC()
	 * @generated
	 */
	EAttribute getINC_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.INC#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.INC#getStepSize()
	 * @see #getINC()
	 * @generated
	 */
	EAttribute getINC_StepSize();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.BSC <em>BSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC
	 * @generated
	 */
	EClass getBSC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BSC#getCtlVal <em>Ctl Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctl Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#getCtlVal()
	 * @see #getBSC()
	 * @generated
	 */
	EReference getBSC_CtlVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BSC#getValWTr <em>Val WTr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Val WTr</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#getValWTr()
	 * @see #getBSC()
	 * @generated
	 */
	EReference getBSC_ValWTr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BSC#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#getQ()
	 * @see #getBSC()
	 * @generated
	 */
	EReference getBSC_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BSC#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#getT()
	 * @see #getBSC()
	 * @generated
	 */
	EReference getBSC_T();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.BSC#getSubVal <em>Sub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#getSubVal()
	 * @see #getBSC()
	 * @generated
	 */
	EReference getBSC_SubVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BSC#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#isPersistent()
	 * @see #getBSC()
	 * @generated
	 */
	EAttribute getBSC_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BSC#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#getMinVal()
	 * @see #getBSC()
	 * @generated
	 */
	EAttribute getBSC_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BSC#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#getMaxVal()
	 * @see #getBSC()
	 * @generated
	 */
	EAttribute getBSC_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.BSC#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.BSC#getStepSize()
	 * @see #getBSC()
	 * @generated
	 */
	EAttribute getBSC_StepSize();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ISC <em>ISC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC
	 * @generated
	 */
	EClass getISC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ISC#getCtlVal <em>Ctl Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctl Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC#getCtlVal()
	 * @see #getISC()
	 * @generated
	 */
	EAttribute getISC_CtlVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ISC#getValWTr <em>Val WTr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Val WTr</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC#getValWTr()
	 * @see #getISC()
	 * @generated
	 */
	EReference getISC_ValWTr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ISC#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC#getT()
	 * @see #getISC()
	 * @generated
	 */
	EReference getISC_T();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ISC#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC#getQ()
	 * @see #getISC()
	 * @generated
	 */
	EReference getISC_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ISC#getSubVal <em>Sub Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC#getSubVal()
	 * @see #getISC()
	 * @generated
	 */
	EReference getISC_SubVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ISC#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC#getMinVal()
	 * @see #getISC()
	 * @generated
	 */
	EAttribute getISC_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ISC#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC#getMaxVal()
	 * @see #getISC()
	 * @generated
	 */
	EAttribute getISC_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ISC#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ISC#getStepSize()
	 * @see #getISC()
	 * @generated
	 */
	EAttribute getISC_StepSize();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo <em>Controllable Analogue Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controllable Analogue Info</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo
	 * @generated
	 */
	EClass getControllableAnalogueInfo();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo#getAPC <em>APC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>APC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo#getAPC()
	 * @see #getControllableAnalogueInfo()
	 * @generated
	 */
	EReference getControllableAnalogueInfo_APC();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo#getC_PrimitiveCDC <em>CPrimitive CDC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CPrimitive CDC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ControllableAnalogueInfo#getC_PrimitiveCDC()
	 * @see #getControllableAnalogueInfo()
	 * @generated
	 */
	EReference getControllableAnalogueInfo_C_PrimitiveCDC();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.APC <em>APC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC
	 * @generated
	 */
	EClass getAPC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getSetMag <em>Set Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Mag</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getSetMag()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_SetMag();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getOrigin()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_Origin();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getOperTm <em>Oper Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oper Tm</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getOperTm()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_OperTm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Q</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getQ()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_Q();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getT()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_T();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getCtlModel <em>Ctl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctl Model</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getCtlModel()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_CtlModel();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getUnits()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_Units();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getSVC <em>SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SVC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getSVC()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_SVC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getMinVal()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_MinVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getMaxVal()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_MaxVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.APC#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step Size</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getStepSize()
	 * @see #getAPC()
	 * @generated
	 */
	EReference getAPC_StepSize();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.APC#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getD()
	 * @see #getAPC()
	 * @generated
	 */
	EAttribute getAPC_D();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.APC#getDU <em>DU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DU</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.APC#getDU()
	 * @see #getAPC()
	 * @generated
	 */
	EAttribute getAPC_DU();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.SPG <em>SPG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPG</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPG
	 * @generated
	 */
	EClass getSPG();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.SPG#isSetVal <em>Set Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.SPG#isSetVal()
	 * @see #getSPG()
	 * @generated
	 */
	EAttribute getSPG_SetVal();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ING <em>ING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ING</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ING
	 * @generated
	 */
	EClass getING();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ING#getSetVal <em>Set Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ING#getSetVal()
	 * @see #getING()
	 * @generated
	 */
	EAttribute getING_SetVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ING#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ING#getMinVal()
	 * @see #getING()
	 * @generated
	 */
	EAttribute getING_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ING#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ING#getMaxVal()
	 * @see #getING()
	 * @generated
	 */
	EAttribute getING_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.ING#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ING#getStepSize()
	 * @see #getING()
	 * @generated
	 */
	EAttribute getING_StepSize();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.AnalogueSettings <em>Analogue Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analogue Settings</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.AnalogueSettings
	 * @generated
	 */
	EClass getAnalogueSettings();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.AnalogueSettings#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.AnalogueSettings#getD()
	 * @see #getAnalogueSettings()
	 * @generated
	 */
	EAttribute getAnalogueSettings_D();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.AnalogueSettings#getDU <em>DU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DU</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.AnalogueSettings#getDU()
	 * @see #getAnalogueSettings()
	 * @generated
	 */
	EAttribute getAnalogueSettings_DU();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.ASG <em>ASG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASG</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ASG
	 * @generated
	 */
	EClass getASG();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ASG#getSetMag <em>Set Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Mag</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ASG#getSetMag()
	 * @see #getASG()
	 * @generated
	 */
	EReference getASG_SetMag();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ASG#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Units</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ASG#getUnits()
	 * @see #getASG()
	 * @generated
	 */
	EReference getASG_Units();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ASG#getSVC <em>SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SVC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ASG#getSVC()
	 * @see #getASG()
	 * @generated
	 */
	EReference getASG_SVC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ASG#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ASG#getMinVal()
	 * @see #getASG()
	 * @generated
	 */
	EReference getASG_MinVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ASG#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Val</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ASG#getMaxVal()
	 * @see #getASG()
	 * @generated
	 */
	EReference getASG_MaxVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.ASG#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step Size</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.ASG#getStepSize()
	 * @see #getASG()
	 * @generated
	 */
	EReference getASG_StepSize();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.CURVE <em>CURVE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CURVE</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE
	 * @generated
	 */
	EClass getCURVE();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CURVE#getSetCharact <em>Set Charact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Charact</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE#getSetCharact()
	 * @see #getCURVE()
	 * @generated
	 */
	EReference getCURVE_SetCharact();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CURVE#getSetParA <em>Set Par A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Par A</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE#getSetParA()
	 * @see #getCURVE()
	 * @generated
	 */
	EAttribute getCURVE_SetParA();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CURVE#getSetParB <em>Set Par B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Par B</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE#getSetParB()
	 * @see #getCURVE()
	 * @generated
	 */
	EAttribute getCURVE_SetParB();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CURVE#getSetParC <em>Set Par C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Par C</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE#getSetParC()
	 * @see #getCURVE()
	 * @generated
	 */
	EAttribute getCURVE_SetParC();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CURVE#getSetParD <em>Set Par D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Par D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE#getSetParD()
	 * @see #getCURVE()
	 * @generated
	 */
	EAttribute getCURVE_SetParD();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CURVE#getSetParE <em>Set Par E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Par E</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE#getSetParE()
	 * @see #getCURVE()
	 * @generated
	 */
	EAttribute getCURVE_SetParE();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CURVE#getSetParF <em>Set Par F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Par F</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CURVE#getSetParF()
	 * @see #getCURVE()
	 * @generated
	 */
	EAttribute getCURVE_SetParF();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.DescriptionInfo <em>Description Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Info</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DescriptionInfo
	 * @generated
	 */
	EClass getDescriptionInfo();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.substationStandard.Dataclasses.DescriptionInfo#getDPL <em>DPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DPL</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DescriptionInfo#getDPL()
	 * @see #getDescriptionInfo()
	 * @generated
	 */
	EReference getDescriptionInfo_DPL();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.substationStandard.Dataclasses.DescriptionInfo#getLPL <em>LPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LPL</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DescriptionInfo#getLPL()
	 * @see #getDescriptionInfo()
	 * @generated
	 */
	EReference getDescriptionInfo_LPL();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.substationStandard.Dataclasses.DescriptionInfo#getCSD <em>CSD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CSD</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DescriptionInfo#getCSD()
	 * @see #getDescriptionInfo()
	 * @generated
	 */
	EReference getDescriptionInfo_CSD();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.substationStandard.Dataclasses.DescriptionInfo#getC_PrimitiveCDC <em>CPrimitive CDC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CPrimitive CDC</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DescriptionInfo#getC_PrimitiveCDC()
	 * @see #getDescriptionInfo()
	 * @generated
	 */
	EReference getDescriptionInfo_C_PrimitiveCDC();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.DPL <em>DPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPL</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPL
	 * @generated
	 */
	EClass getDPL();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPL#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPL#getVendor()
	 * @see #getDPL()
	 * @generated
	 */
	EAttribute getDPL_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPL#getHwRev <em>Hw Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hw Rev</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPL#getHwRev()
	 * @see #getDPL()
	 * @generated
	 */
	EAttribute getDPL_HwRev();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPL#getSwRev <em>Sw Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Rev</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPL#getSwRev()
	 * @see #getDPL()
	 * @generated
	 */
	EAttribute getDPL_SwRev();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPL#getSerNum <em>Ser Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ser Num</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPL#getSerNum()
	 * @see #getDPL()
	 * @generated
	 */
	EAttribute getDPL_SerNum();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPL#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPL#getModel()
	 * @see #getDPL()
	 * @generated
	 */
	EAttribute getDPL_Model();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.DPL#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.DPL#getLocation()
	 * @see #getDPL()
	 * @generated
	 */
	EAttribute getDPL_Location();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.LPL <em>LPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LPL</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.LPL
	 * @generated
	 */
	EClass getLPL();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.LPL#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.LPL#getVendor()
	 * @see #getLPL()
	 * @generated
	 */
	EAttribute getLPL_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.LPL#getSwRev <em>Sw Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Rev</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.LPL#getSwRev()
	 * @see #getLPL()
	 * @generated
	 */
	EAttribute getLPL_SwRev();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.LPL#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.LPL#getD()
	 * @see #getLPL()
	 * @generated
	 */
	EAttribute getLPL_D();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.LPL#getDU <em>DU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DU</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.LPL#getDU()
	 * @see #getLPL()
	 * @generated
	 */
	EAttribute getLPL_DU();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.LPL#getConfigRev <em>Config Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Rev</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.LPL#getConfigRev()
	 * @see #getLPL()
	 * @generated
	 */
	EAttribute getLPL_ConfigRev();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.LPL#getIdNs <em>Id Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ns</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.LPL#getIdNs()
	 * @see #getLPL()
	 * @generated
	 */
	EAttribute getLPL_IdNs();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.LPL#getLnNs <em>Ln Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ln Ns</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.LPL#getLnNs()
	 * @see #getLPL()
	 * @generated
	 */
	EAttribute getLPL_LnNs();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.Dataclasses.CSD <em>CSD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSD</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD
	 * @generated
	 */
	EClass getCSD();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CSD#getXUnit <em>XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XUnit</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD#getXUnit()
	 * @see #getCSD()
	 * @generated
	 */
	EReference getCSD_XUnit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CSD#getXD <em>XD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XD</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD#getXD()
	 * @see #getCSD()
	 * @generated
	 */
	EAttribute getCSD_XD();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CSD#getYUnit <em>YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>YUnit</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD#getYUnit()
	 * @see #getCSD()
	 * @generated
	 */
	EReference getCSD_YUnit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CSD#getYD <em>YD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YD</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD#getYD()
	 * @see #getCSD()
	 * @generated
	 */
	EAttribute getCSD_YD();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CSD#getNumPts <em>Num Pts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Pts</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD#getNumPts()
	 * @see #getCSD()
	 * @generated
	 */
	EAttribute getCSD_NumPts();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.Dataclasses.CSD#getCrvPts <em>Crv Pts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crv Pts</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD#getCrvPts()
	 * @see #getCSD()
	 * @generated
	 */
	EReference getCSD_CrvPts();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CSD#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD#getD()
	 * @see #getCSD()
	 * @generated
	 */
	EAttribute getCSD_D();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.Dataclasses.CSD#getDU <em>DU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DU</em>'.
	 * @see gluemodel.substationStandard.Dataclasses.CSD#getDU()
	 * @see #getCSD()
	 * @generated
	 */
	EAttribute getCSD_DU();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataclassesFactory getDataclassesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.TimeStampImpl <em>Time Stamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.TimeStampImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getTimeStamp()
		 * @generated
		 */
		EClass TIME_STAMP = eINSTANCE.getTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_STAMP__VAL = eINSTANCE.getTimeStamp_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.P_TimeStampImpl <em>PTime Stamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.P_TimeStampImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getP_TimeStamp()
		 * @generated
		 */
		EClass PTIME_STAMP = eINSTANCE.getP_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Second Since Epoch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTIME_STAMP__SECOND_SINCE_EPOCH = eINSTANCE.getP_TimeStamp_SecondSinceEpoch();

		/**
		 * The meta object literal for the '<em><b>Fraction Of Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTIME_STAMP__FRACTION_OF_SECOND = eINSTANCE.getP_TimeStamp_FractionOfSecond();

		/**
		 * The meta object literal for the '<em><b>Time Quality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTIME_STAMP__TIME_QUALITY = eINSTANCE.getP_TimeStamp_TimeQuality();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.TimeQualityImpl <em>Time Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.TimeQualityImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getTimeQuality()
		 * @generated
		 */
		EClass TIME_QUALITY = eINSTANCE.getTimeQuality();

		/**
		 * The meta object literal for the '<em><b>Leap Seconds Known</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_QUALITY__LEAP_SECONDS_KNOWN = eINSTANCE.getTimeQuality_LeapSecondsKnown();

		/**
		 * The meta object literal for the '<em><b>Clock Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_QUALITY__CLOCK_FAILURE = eINSTANCE.getTimeQuality_ClockFailure();

		/**
		 * The meta object literal for the '<em><b>Clock Not Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_QUALITY__CLOCK_NOT_SYNCHRONIZED = eINSTANCE.getTimeQuality_ClockNotSynchronized();

		/**
		 * The meta object literal for the '<em><b>Time Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_QUALITY__TIME_ACCURACY = eINSTANCE.getTimeQuality_TimeAccuracy();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.AnalogueValueImpl <em>Analogue Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.AnalogueValueImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getAnalogueValue()
		 * @generated
		 */
		EClass ANALOGUE_VALUE = eINSTANCE.getAnalogueValue();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_VALUE__I = eINSTANCE.getAnalogueValue_I();

		/**
		 * The meta object literal for the '<em><b>F</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_VALUE__F = eINSTANCE.getAnalogueValue_F();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.AngleReferenceImpl <em>Angle Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.AngleReferenceImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getAngleReference()
		 * @generated
		 */
		EClass ANGLE_REFERENCE = eINSTANCE.getAngleReference();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE_REFERENCE__VAL = eINSTANCE.getAngleReference_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.BSControlImpl <em>BS Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.BSControlImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getBSControl()
		 * @generated
		 */
		EClass BS_CONTROL = eINSTANCE.getBSControl();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BS_CONTROL__VAL = eINSTANCE.getBSControl_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.CMVAngleReferenceImpl <em>CMV Angle Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.CMVAngleReferenceImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCMVAngleReference()
		 * @generated
		 */
		EClass CMV_ANGLE_REFERENCE = eINSTANCE.getCMVAngleReference();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMV_ANGLE_REFERENCE__VAL = eINSTANCE.getCMVAngleReference_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ControlOutputImpl <em>Control Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ControlOutputImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getControlOutput()
		 * @generated
		 */
		EClass CONTROL_OUTPUT = eINSTANCE.getControlOutput();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_OUTPUT__VAL = eINSTANCE.getControlOutput_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.CtlModelsImpl <em>Ctl Models</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.CtlModelsImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCtlModels()
		 * @generated
		 */
		EClass CTL_MODELS = eINSTANCE.getCtlModels();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTL_MODELS__VAL = eINSTANCE.getCtlModels_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.CurveCharImpl <em>Curve Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.CurveCharImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCurveChar()
		 * @generated
		 */
		EClass CURVE_CHAR = eINSTANCE.getCurveChar();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE_CHAR__VAL = eINSTANCE.getCurveChar_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.DirectionPhaseImpl <em>Direction Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.DirectionPhaseImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDirectionPhase()
		 * @generated
		 */
		EClass DIRECTION_PHASE = eINSTANCE.getDirectionPhase();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_PHASE__VAL = eINSTANCE.getDirectionPhase_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.DPStatusImpl <em>DP Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.DPStatusImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDPStatus()
		 * @generated
		 */
		EClass DP_STATUS = eINSTANCE.getDPStatus();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DP_STATUS__VAL = eINSTANCE.getDPStatus_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.FaultDirectionImpl <em>Fault Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.FaultDirectionImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getFaultDirection()
		 * @generated
		 */
		EClass FAULT_DIRECTION = eINSTANCE.getFaultDirection();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_DIRECTION__VAL = eINSTANCE.getFaultDirection_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.MagReferenceImpl <em>Mag Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.MagReferenceImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getMagReference()
		 * @generated
		 */
		EClass MAG_REFERENCE = eINSTANCE.getMagReference();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAG_REFERENCE__VAL = eINSTANCE.getMagReference_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.MultiplierImpl <em>Multiplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.MultiplierImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getMultiplier()
		 * @generated
		 */
		EClass MULTIPLIER = eINSTANCE.getMultiplier();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLIER__VAL = eINSTANCE.getMultiplier_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.OriginatorImpl <em>Originator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.OriginatorImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getOriginator()
		 * @generated
		 */
		EClass ORIGINATOR = eINSTANCE.getOriginator();

		/**
		 * The meta object literal for the '<em><b>Orident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGINATOR__ORIDENT = eINSTANCE.getOriginator_Orident();

		/**
		 * The meta object literal for the '<em><b>Or Cat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIGINATOR__OR_CAT = eINSTANCE.getOriginator_OrCat();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.OriginatorCategoryImpl <em>Originator Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.OriginatorCategoryImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getOriginatorCategory()
		 * @generated
		 */
		EClass ORIGINATOR_CATEGORY = eINSTANCE.getOriginatorCategory();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGINATOR_CATEGORY__VAL = eINSTANCE.getOriginatorCategory_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.PhaseReferenceImpl <em>Phase Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.PhaseReferenceImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPhaseReference()
		 * @generated
		 */
		EClass PHASE_REFERENCE = eINSTANCE.getPhaseReference();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE_REFERENCE__VAL = eINSTANCE.getPhaseReference_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.PointImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>XVal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__XVAL = eINSTANCE.getPoint_XVal();

		/**
		 * The meta object literal for the '<em><b>YVal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__YVAL = eINSTANCE.getPoint_YVal();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.PointArrayImpl <em>Point Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.PointArrayImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPointArray()
		 * @generated
		 */
		EClass POINT_ARRAY = eINSTANCE.getPointArray();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_ARRAY__POINT = eINSTANCE.getPointArray_Point();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.PulseConfigImpl <em>Pulse Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.PulseConfigImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPulseConfig()
		 * @generated
		 */
		EClass PULSE_CONFIG = eINSTANCE.getPulseConfig();

		/**
		 * The meta object literal for the '<em><b>On Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_CONFIG__ON_DUR = eINSTANCE.getPulseConfig_OnDur();

		/**
		 * The meta object literal for the '<em><b>Off Dur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_CONFIG__OFF_DUR = eINSTANCE.getPulseConfig_OffDur();

		/**
		 * The meta object literal for the '<em><b>Num Pls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSE_CONFIG__NUM_PLS = eINSTANCE.getPulseConfig_NumPls();

		/**
		 * The meta object literal for the '<em><b>Cmd Qual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULSE_CONFIG__CMD_QUAL = eINSTANCE.getPulseConfig_CmdQual();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.QualityImpl <em>Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.QualityImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getQuality()
		 * @generated
		 */
		EClass QUALITY = eINSTANCE.getQuality();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY__TEST = eINSTANCE.getQuality_Test();

		/**
		 * The meta object literal for the '<em><b>Operator Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY__OPERATOR_BLOCKED = eINSTANCE.getQuality_OperatorBlocked();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY__VALIDITY = eINSTANCE.getQuality_Validity();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY__SOURCE = eINSTANCE.getQuality_Source();

		/**
		 * The meta object literal for the '<em><b>Detail Qual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY__DETAIL_QUAL = eINSTANCE.getQuality_DetailQual();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.DetailQualImpl <em>Detail Qual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.DetailQualImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDetailQual()
		 * @generated
		 */
		EClass DETAIL_QUAL = eINSTANCE.getDetailQual();

		/**
		 * The meta object literal for the '<em><b>Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL_QUAL__OVERFLOW = eINSTANCE.getDetailQual_Overflow();

		/**
		 * The meta object literal for the '<em><b>Out Of Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL_QUAL__OUT_OF_RANGE = eINSTANCE.getDetailQual_OutOfRange();

		/**
		 * The meta object literal for the '<em><b>Bad Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL_QUAL__BAD_REFERENCE = eINSTANCE.getDetailQual_BadReference();

		/**
		 * The meta object literal for the '<em><b>Oscillatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL_QUAL__OSCILLATORY = eINSTANCE.getDetailQual_Oscillatory();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL_QUAL__FAILURE = eINSTANCE.getDetailQual_Failure();

		/**
		 * The meta object literal for the '<em><b>Old Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL_QUAL__OLD_DATA = eINSTANCE.getDetailQual_OldData();

		/**
		 * The meta object literal for the '<em><b>Inconsistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL_QUAL__INCONSISTENT = eINSTANCE.getDetailQual_Inconsistent();

		/**
		 * The meta object literal for the '<em><b>Inaccurate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL_QUAL__INACCURATE = eINSTANCE.getDetailQual_Inaccurate();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.RangeImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__VAL = eINSTANCE.getRange_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl <em>Range Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.RangeConfigImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getRangeConfig()
		 * @generated
		 */
		EClass RANGE_CONFIG = eINSTANCE.getRangeConfig();

		/**
		 * The meta object literal for the '<em><b>Hh Lim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_CONFIG__HH_LIM = eINSTANCE.getRangeConfig_HhLim();

		/**
		 * The meta object literal for the '<em><b>HLim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_CONFIG__HLIM = eINSTANCE.getRangeConfig_HLim();

		/**
		 * The meta object literal for the '<em><b>LLim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_CONFIG__LLIM = eINSTANCE.getRangeConfig_LLim();

		/**
		 * The meta object literal for the '<em><b>Ll Lim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_CONFIG__LL_LIM = eINSTANCE.getRangeConfig_LlLim();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_CONFIG__MIN = eINSTANCE.getRangeConfig_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_CONFIG__MAX = eINSTANCE.getRangeConfig_Max();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SboClassesImpl <em>Sbo Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SboClassesImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSboClasses()
		 * @generated
		 */
		EClass SBO_CLASSES = eINSTANCE.getSboClasses();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SBO_CLASSES__VAL = eINSTANCE.getSboClasses_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ScaledValueConfigImpl <em>Scaled Value Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ScaledValueConfigImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getScaledValueConfig()
		 * @generated
		 */
		EClass SCALED_VALUE_CONFIG = eINSTANCE.getScaledValueConfig();

		/**
		 * The meta object literal for the '<em><b>Scale Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALED_VALUE_CONFIG__SCALE_FACTOR = eINSTANCE.getScaledValueConfig_ScaleFactor();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALED_VALUE_CONFIG__OFFSET = eINSTANCE.getScaledValueConfig_Offset();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SequenceImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__VAL = eINSTANCE.getSequence_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SeverityImpl <em>Severity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SeverityImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSeverity()
		 * @generated
		 */
		EClass SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEVERITY__VAL = eINSTANCE.getSeverity_Val();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SlUnitsImpl <em>Sl Units</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SlUnitsImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSlUnits()
		 * @generated
		 */
		EClass SL_UNITS = eINSTANCE.getSlUnits();

		/**
		 * The meta object literal for the '<em><b>Sl Units Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SL_UNITS__SL_UNITS_KIND = eINSTANCE.getSlUnits_SlUnitsKind();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.UnitsImpl <em>Units</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.UnitsImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getUnits()
		 * @generated
		 */
		EClass UNITS = eINSTANCE.getUnits();

		/**
		 * The meta object literal for the '<em><b>Sl Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITS__SL_UNITS = eINSTANCE.getUnits_SlUnits();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITS__MULTIPLIER = eINSTANCE.getUnits_Multiplier();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ValWithTransImpl <em>Val With Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ValWithTransImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getValWithTrans()
		 * @generated
		 */
		EClass VAL_WITH_TRANS = eINSTANCE.getValWithTrans();

		/**
		 * The meta object literal for the '<em><b>Pos Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAL_WITH_TRANS__POS_VAL = eINSTANCE.getValWithTrans_PosVal();

		/**
		 * The meta object literal for the '<em><b>Trans Ind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAL_WITH_TRANS__TRANS_IND = eINSTANCE.getValWithTrans_TransInd();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.VectorImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getVector()
		 * @generated
		 */
		EClass VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '<em><b>Mag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__MAG = eINSTANCE.getVector_Mag();

		/**
		 * The meta object literal for the '<em><b>Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__ANG = eINSTANCE.getVector_Ang();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.VectorArrayImpl <em>Vector Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.VectorArrayImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getVectorArray()
		 * @generated
		 */
		EClass VECTOR_ARRAY = eINSTANCE.getVectorArray();

		/**
		 * The meta object literal for the '<em><b>Vector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_ARRAY__VECTOR = eINSTANCE.getVectorArray_Vector();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.C_PrimitiveCDCImpl <em>CPrimitive CDC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.C_PrimitiveCDCImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getC_PrimitiveCDC()
		 * @generated
		 */
		EClass CPRIMITIVE_CDC = eINSTANCE.getC_PrimitiveCDC();

		/**
		 * The meta object literal for the '<em><b>Cdc Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPRIMITIVE_CDC__CDC_NS = eINSTANCE.getC_PrimitiveCDC_CdcNs();

		/**
		 * The meta object literal for the '<em><b>Cdc Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPRIMITIVE_CDC__CDC_NAME = eINSTANCE.getC_PrimitiveCDC_CdcName();

		/**
		 * The meta object literal for the '<em><b>Data Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPRIMITIVE_CDC__DATA_NS = eINSTANCE.getC_PrimitiveCDC_DataNs();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.C_ComposedCDCImpl <em>CComposed CDC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.C_ComposedCDCImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getC_ComposedCDC()
		 * @generated
		 */
		EClass CCOMPOSED_CDC = eINSTANCE.getC_ComposedCDC();

		/**
		 * The meta object literal for the '<em><b>Cdc Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CCOMPOSED_CDC__CDC_NS = eINSTANCE.getC_ComposedCDC_CdcNs();

		/**
		 * The meta object literal for the '<em><b>Cdc Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CCOMPOSED_CDC__CDC_NAME = eINSTANCE.getC_ComposedCDC_CdcName();

		/**
		 * The meta object literal for the '<em><b>Data Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CCOMPOSED_CDC__DATA_NS = eINSTANCE.getC_ComposedCDC_DataNs();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.StatusInfoImpl <em>Status Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.StatusInfoImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getStatusInfo()
		 * @generated
		 */
		EClass STATUS_INFO = eINSTANCE.getStatusInfo();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_INFO__T = eINSTANCE.getStatusInfo_T();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_INFO__D = eINSTANCE.getStatusInfo_D();

		/**
		 * The meta object literal for the '<em><b>DU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_INFO__DU = eINSTANCE.getStatusInfo_DU();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SPSImpl <em>SPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SPSImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSPS()
		 * @generated
		 */
		EClass SPS = eINSTANCE.getSPS();

		/**
		 * The meta object literal for the '<em><b>St Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPS__ST_VAL = eINSTANCE.getSPS_StVal();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPS__Q = eINSTANCE.getSPS_Q();

		/**
		 * The meta object literal for the '<em><b>Sub Ena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPS__SUB_ENA = eINSTANCE.getSPS_SubEna();

		/**
		 * The meta object literal for the '<em><b>Sub Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPS__SUB_VAL = eINSTANCE.getSPS_SubVal();

		/**
		 * The meta object literal for the '<em><b>Sub Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPS__SUB_Q = eINSTANCE.getSPS_SubQ();

		/**
		 * The meta object literal for the '<em><b>Sub ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPS__SUB_ID = eINSTANCE.getSPS_SubID();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.INSImpl <em>INS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.INSImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getINS()
		 * @generated
		 */
		EClass INS = eINSTANCE.getINS();

		/**
		 * The meta object literal for the '<em><b>St Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS__ST_VAL = eINSTANCE.getINS_StVal();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INS__Q = eINSTANCE.getINS_Q();

		/**
		 * The meta object literal for the '<em><b>Sub Ena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS__SUB_ENA = eINSTANCE.getINS_SubEna();

		/**
		 * The meta object literal for the '<em><b>Sub Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS__SUB_VAL = eINSTANCE.getINS_SubVal();

		/**
		 * The meta object literal for the '<em><b>Sub Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INS__SUB_Q = eINSTANCE.getINS_SubQ();

		/**
		 * The meta object literal for the '<em><b>Sub ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS__SUB_ID = eINSTANCE.getINS_SubID();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.DPSImpl <em>DPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.DPSImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDPS()
		 * @generated
		 */
		EClass DPS = eINSTANCE.getDPS();

		/**
		 * The meta object literal for the '<em><b>St Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPS__ST_VAL = eINSTANCE.getDPS_StVal();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPS__Q = eINSTANCE.getDPS_Q();

		/**
		 * The meta object literal for the '<em><b>Sub Ena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPS__SUB_ENA = eINSTANCE.getDPS_SubEna();

		/**
		 * The meta object literal for the '<em><b>Sub Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPS__SUB_VAL = eINSTANCE.getDPS_SubVal();

		/**
		 * The meta object literal for the '<em><b>Sub Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPS__SUB_Q = eINSTANCE.getDPS_SubQ();

		/**
		 * The meta object literal for the '<em><b>Sub ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPS__SUB_ID = eINSTANCE.getDPS_SubID();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ACTImpl <em>ACT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ACTImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getACT()
		 * @generated
		 */
		EClass ACT = eINSTANCE.getACT();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__GENERAL = eINSTANCE.getACT_General();

		/**
		 * The meta object literal for the '<em><b>Phs A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__PHS_A = eINSTANCE.getACT_PhsA();

		/**
		 * The meta object literal for the '<em><b>Phs B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__PHS_B = eINSTANCE.getACT_PhsB();

		/**
		 * The meta object literal for the '<em><b>Phs C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__PHS_C = eINSTANCE.getACT_PhsC();

		/**
		 * The meta object literal for the '<em><b>Neut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT__NEUT = eINSTANCE.getACT_Neut();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__Q = eINSTANCE.getACT_Q();

		/**
		 * The meta object literal for the '<em><b>Oper Tm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT__OPER_TM = eINSTANCE.getACT_OperTm();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ACDImpl <em>ACD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ACDImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getACD()
		 * @generated
		 */
		EClass ACD = eINSTANCE.getACD();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACD__GENERAL = eINSTANCE.getACD_General();

		/**
		 * The meta object literal for the '<em><b>Dir General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACD__DIR_GENERAL = eINSTANCE.getACD_DirGeneral();

		/**
		 * The meta object literal for the '<em><b>Phs A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACD__PHS_A = eINSTANCE.getACD_PhsA();

		/**
		 * The meta object literal for the '<em><b>Dir Phs A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACD__DIR_PHS_A = eINSTANCE.getACD_DirPhsA();

		/**
		 * The meta object literal for the '<em><b>Phs B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACD__PHS_B = eINSTANCE.getACD_PhsB();

		/**
		 * The meta object literal for the '<em><b>Dir Phs B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACD__DIR_PHS_B = eINSTANCE.getACD_DirPhsB();

		/**
		 * The meta object literal for the '<em><b>Phs C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACD__PHS_C = eINSTANCE.getACD_PhsC();

		/**
		 * The meta object literal for the '<em><b>Dir Phs C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACD__DIR_PHS_C = eINSTANCE.getACD_DirPhsC();

		/**
		 * The meta object literal for the '<em><b>Neut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACD__NEUT = eINSTANCE.getACD_Neut();

		/**
		 * The meta object literal for the '<em><b>Dir Neut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACD__DIR_NEUT = eINSTANCE.getACD_DirNeut();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACD__Q = eINSTANCE.getACD_Q();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SECImpl <em>SEC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SECImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSEC()
		 * @generated
		 */
		EClass SEC = eINSTANCE.getSEC();

		/**
		 * The meta object literal for the '<em><b>Cnt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEC__CNT = eINSTANCE.getSEC_Cnt();

		/**
		 * The meta object literal for the '<em><b>Sev</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEC__SEV = eINSTANCE.getSEC_Sev();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEC__ADDR = eINSTANCE.getSEC_Addr();

		/**
		 * The meta object literal for the '<em><b>Add Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEC__ADD_INFO = eINSTANCE.getSEC_AddInfo();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.BCRImpl <em>BCR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.BCRImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getBCR()
		 * @generated
		 */
		EClass BCR = eINSTANCE.getBCR();

		/**
		 * The meta object literal for the '<em><b>Act Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCR__ACT_VAL = eINSTANCE.getBCR_ActVal();

		/**
		 * The meta object literal for the '<em><b>Fr Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCR__FR_VAL = eINSTANCE.getBCR_FrVal();

		/**
		 * The meta object literal for the '<em><b>Fr Tm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCR__FR_TM = eINSTANCE.getBCR_FrTm();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCR__Q = eINSTANCE.getBCR_Q();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCR__UNITS = eINSTANCE.getBCR_Units();

		/**
		 * The meta object literal for the '<em><b>Puls Qty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCR__PULS_QTY = eINSTANCE.getBCR_PulsQty();

		/**
		 * The meta object literal for the '<em><b>Fr Ena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCR__FR_ENA = eINSTANCE.getBCR_FrEna();

		/**
		 * The meta object literal for the '<em><b>Str Tm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCR__STR_TM = eINSTANCE.getBCR_StrTm();

		/**
		 * The meta object literal for the '<em><b>Fr Pd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCR__FR_PD = eINSTANCE.getBCR_FrPd();

		/**
		 * The meta object literal for the '<em><b>Fr Rs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCR__FR_RS = eINSTANCE.getBCR_FrRs();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.PrimitiveMeasureAndInfoImpl <em>Primitive Measure And Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.PrimitiveMeasureAndInfoImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getPrimitiveMeasureAndInfo()
		 * @generated
		 */
		EClass PRIMITIVE_MEASURE_AND_INFO = eINSTANCE.getPrimitiveMeasureAndInfo();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_MEASURE_AND_INFO__D = eINSTANCE.getPrimitiveMeasureAndInfo_D();

		/**
		 * The meta object literal for the '<em><b>DU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_MEASURE_AND_INFO__DU = eINSTANCE.getPrimitiveMeasureAndInfo_DU();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ComposedMeasureAndInfoImpl <em>Composed Measure And Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ComposedMeasureAndInfoImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getComposedMeasureAndInfo()
		 * @generated
		 */
		EClass COMPOSED_MEASURE_AND_INFO = eINSTANCE.getComposedMeasureAndInfo();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSED_MEASURE_AND_INFO__D = eINSTANCE.getComposedMeasureAndInfo_D();

		/**
		 * The meta object literal for the '<em><b>DU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSED_MEASURE_AND_INFO__DU = eINSTANCE.getComposedMeasureAndInfo_DU();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.MVImpl <em>MV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.MVImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getMV()
		 * @generated
		 */
		EClass MV = eINSTANCE.getMV();

		/**
		 * The meta object literal for the '<em><b>Inst Mag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__INST_MAG = eINSTANCE.getMV_InstMag();

		/**
		 * The meta object literal for the '<em><b>Mag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__MAG = eINSTANCE.getMV_Mag();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__RANGE = eINSTANCE.getMV_Range();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__Q = eINSTANCE.getMV_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__T = eINSTANCE.getMV_T();

		/**
		 * The meta object literal for the '<em><b>Sub Ena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MV__SUB_ENA = eINSTANCE.getMV_SubEna();

		/**
		 * The meta object literal for the '<em><b>Sub Mag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__SUB_MAG = eINSTANCE.getMV_SubMag();

		/**
		 * The meta object literal for the '<em><b>Sub Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__SUB_Q = eINSTANCE.getMV_SubQ();

		/**
		 * The meta object literal for the '<em><b>Sub ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MV__SUB_ID = eINSTANCE.getMV_SubID();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__UNITS = eINSTANCE.getMV_Units();

		/**
		 * The meta object literal for the '<em><b>Db</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MV__DB = eINSTANCE.getMV_Db();

		/**
		 * The meta object literal for the '<em><b>Zero Db</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MV__ZERO_DB = eINSTANCE.getMV_ZeroDb();

		/**
		 * The meta object literal for the '<em><b>SVC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__SVC = eINSTANCE.getMV_SVC();

		/**
		 * The meta object literal for the '<em><b>Range C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MV__RANGE_C = eINSTANCE.getMV_RangeC();

		/**
		 * The meta object literal for the '<em><b>Smp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MV__SMP_RATE = eINSTANCE.getMV_SmpRate();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.CMVImpl <em>CMV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.CMVImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCMV()
		 * @generated
		 */
		EClass CMV = eINSTANCE.getCMV();

		/**
		 * The meta object literal for the '<em><b>Inst CVal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__INST_CVAL = eINSTANCE.getCMV_InstCVal();

		/**
		 * The meta object literal for the '<em><b>CVal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__CVAL = eINSTANCE.getCMV_CVal();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__RANGE = eINSTANCE.getCMV_Range();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__Q = eINSTANCE.getCMV_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__T = eINSTANCE.getCMV_T();

		/**
		 * The meta object literal for the '<em><b>Sub Ena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMV__SUB_ENA = eINSTANCE.getCMV_SubEna();

		/**
		 * The meta object literal for the '<em><b>Sub CVal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__SUB_CVAL = eINSTANCE.getCMV_SubCVal();

		/**
		 * The meta object literal for the '<em><b>Sub Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__SUB_Q = eINSTANCE.getCMV_SubQ();

		/**
		 * The meta object literal for the '<em><b>Sub ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMV__SUB_ID = eINSTANCE.getCMV_SubID();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__UNITS = eINSTANCE.getCMV_Units();

		/**
		 * The meta object literal for the '<em><b>Db</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMV__DB = eINSTANCE.getCMV_Db();

		/**
		 * The meta object literal for the '<em><b>Zero Db</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMV__ZERO_DB = eINSTANCE.getCMV_ZeroDb();

		/**
		 * The meta object literal for the '<em><b>Range C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__RANGE_C = eINSTANCE.getCMV_RangeC();

		/**
		 * The meta object literal for the '<em><b>Mag SVC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__MAG_SVC = eINSTANCE.getCMV_MagSVC();

		/**
		 * The meta object literal for the '<em><b>Ang SVC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__ANG_SVC = eINSTANCE.getCMV_AngSVC();

		/**
		 * The meta object literal for the '<em><b>Ang Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMV__ANG_REF = eINSTANCE.getCMV_AngRef();

		/**
		 * The meta object literal for the '<em><b>Smp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMV__SMP_RATE = eINSTANCE.getCMV_SmpRate();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SAVImpl <em>SAV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SAVImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSAV()
		 * @generated
		 */
		EClass SAV = eINSTANCE.getSAV();

		/**
		 * The meta object literal for the '<em><b>Inst Mag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAV__INST_MAG = eINSTANCE.getSAV_InstMag();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAV__Q = eINSTANCE.getSAV_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAV__T = eINSTANCE.getSAV_T();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAV__UNITS = eINSTANCE.getSAV_Units();

		/**
		 * The meta object literal for the '<em><b>SVC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAV__SVC = eINSTANCE.getSAV_SVC();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAV__MIN = eINSTANCE.getSAV_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAV__MAX = eINSTANCE.getSAV_Max();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.DELImpl <em>DEL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.DELImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDEL()
		 * @generated
		 */
		EClass DEL = eINSTANCE.getDEL();

		/**
		 * The meta object literal for the '<em><b>Phs AB</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEL__PHS_AB = eINSTANCE.getDEL_PhsAB();

		/**
		 * The meta object literal for the '<em><b>Phs BC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEL__PHS_BC = eINSTANCE.getDEL_PhsBC();

		/**
		 * The meta object literal for the '<em><b>Phs CA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEL__PHS_CA = eINSTANCE.getDEL_PhsCA();

		/**
		 * The meta object literal for the '<em><b>Ang Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEL__ANG_REF = eINSTANCE.getDEL_AngRef();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.WYEImpl <em>WYE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.WYEImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getWYE()
		 * @generated
		 */
		EClass WYE = eINSTANCE.getWYE();

		/**
		 * The meta object literal for the '<em><b>Phs A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WYE__PHS_A = eINSTANCE.getWYE_PhsA();

		/**
		 * The meta object literal for the '<em><b>Phs B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WYE__PHS_B = eINSTANCE.getWYE_PhsB();

		/**
		 * The meta object literal for the '<em><b>Phs C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WYE__PHS_C = eINSTANCE.getWYE_PhsC();

		/**
		 * The meta object literal for the '<em><b>Neut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WYE__NEUT = eINSTANCE.getWYE_Neut();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WYE__NET = eINSTANCE.getWYE_Net();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WYE__RES = eINSTANCE.getWYE_Res();

		/**
		 * The meta object literal for the '<em><b>Ang Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WYE__ANG_REF = eINSTANCE.getWYE_AngRef();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SEQImpl <em>SEQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SEQImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSEQ()
		 * @generated
		 */
		EClass SEQ = eINSTANCE.getSEQ();

		/**
		 * The meta object literal for the '<em><b>C1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__C1 = eINSTANCE.getSEQ_C1();

		/**
		 * The meta object literal for the '<em><b>C2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__C2 = eINSTANCE.getSEQ_C2();

		/**
		 * The meta object literal for the '<em><b>C3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__C3 = eINSTANCE.getSEQ_C3();

		/**
		 * The meta object literal for the '<em><b>Seq T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__SEQ_T = eINSTANCE.getSEQ_SeqT();

		/**
		 * The meta object literal for the '<em><b>Phs Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__PHS_REF = eINSTANCE.getSEQ_PhsRef();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.HMVImpl <em>HMV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.HMVImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getHMV()
		 * @generated
		 */
		EClass HMV = eINSTANCE.getHMV();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMV__Q = eINSTANCE.getHMV_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMV__T = eINSTANCE.getHMV_T();

		/**
		 * The meta object literal for the '<em><b>Har</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMV__HAR = eINSTANCE.getHMV_Har();

		/**
		 * The meta object literal for the '<em><b>Num Har</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMV__NUM_HAR = eINSTANCE.getHMV_NumHar();

		/**
		 * The meta object literal for the '<em><b>Num Cyc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMV__NUM_CYC = eINSTANCE.getHMV_NumCyc();

		/**
		 * The meta object literal for the '<em><b>Eval Tm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMV__EVAL_TM = eINSTANCE.getHMV_EvalTm();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMV__UNITS = eINSTANCE.getHMV_Units();

		/**
		 * The meta object literal for the '<em><b>Smp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMV__SMP_RATE = eINSTANCE.getHMV_SmpRate();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMV__FREQUENCY = eINSTANCE.getHMV_Frequency();

		/**
		 * The meta object literal for the '<em><b>Hv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HMV__HV_REF = eINSTANCE.getHMV_HvRef();

		/**
		 * The meta object literal for the '<em><b>Rms Cyc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HMV__RMS_CYC = eINSTANCE.getHMV_RmsCyc();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.HYWEImpl <em>HYWE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.HYWEImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getHYWE()
		 * @generated
		 */
		EClass HYWE = eINSTANCE.getHYWE();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__Q = eINSTANCE.getHYWE_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__T = eINSTANCE.getHYWE_T();

		/**
		 * The meta object literal for the '<em><b>Phs AHar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__PHS_AHAR = eINSTANCE.getHYWE_PhsAHar();

		/**
		 * The meta object literal for the '<em><b>Phs BHar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__PHS_BHAR = eINSTANCE.getHYWE_PhsBHar();

		/**
		 * The meta object literal for the '<em><b>Phs CHar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__PHS_CHAR = eINSTANCE.getHYWE_PhsCHar();

		/**
		 * The meta object literal for the '<em><b>Neut Har</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__NEUT_HAR = eINSTANCE.getHYWE_NeutHar();

		/**
		 * The meta object literal for the '<em><b>Net Har</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__NET_HAR = eINSTANCE.getHYWE_NetHar();

		/**
		 * The meta object literal for the '<em><b>Res Har</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__RES_HAR = eINSTANCE.getHYWE_ResHar();

		/**
		 * The meta object literal for the '<em><b>Num Har</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYWE__NUM_HAR = eINSTANCE.getHYWE_NumHar();

		/**
		 * The meta object literal for the '<em><b>Num Cyc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYWE__NUM_CYC = eINSTANCE.getHYWE_NumCyc();

		/**
		 * The meta object literal for the '<em><b>Eval Tm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYWE__EVAL_TM = eINSTANCE.getHYWE_EvalTm();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__UNITS = eINSTANCE.getHYWE_Units();

		/**
		 * The meta object literal for the '<em><b>Ang Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__ANG_REF = eINSTANCE.getHYWE_AngRef();

		/**
		 * The meta object literal for the '<em><b>Smp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYWE__SMP_RATE = eINSTANCE.getHYWE_SmpRate();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYWE__FREQUENCY = eINSTANCE.getHYWE_Frequency();

		/**
		 * The meta object literal for the '<em><b>Hv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYWE__HV_REF = eINSTANCE.getHYWE_HvRef();

		/**
		 * The meta object literal for the '<em><b>Rms Cyc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYWE__RMS_CYC = eINSTANCE.getHYWE_RmsCyc();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.HDELImpl <em>HDEL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.HDELImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getHDEL()
		 * @generated
		 */
		EClass HDEL = eINSTANCE.getHDEL();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDEL__Q = eINSTANCE.getHDEL_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDEL__T = eINSTANCE.getHDEL_T();

		/**
		 * The meta object literal for the '<em><b>Phs AB Har</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDEL__PHS_AB_HAR = eINSTANCE.getHDEL_PhsABHar();

		/**
		 * The meta object literal for the '<em><b>Phs BC Har</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDEL__PHS_BC_HAR = eINSTANCE.getHDEL_PhsBCHar();

		/**
		 * The meta object literal for the '<em><b>Phs CA Har</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDEL__PHS_CA_HAR = eINSTANCE.getHDEL_PhsCAHar();

		/**
		 * The meta object literal for the '<em><b>Num Har</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDEL__NUM_HAR = eINSTANCE.getHDEL_NumHar();

		/**
		 * The meta object literal for the '<em><b>Num Cyc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDEL__NUM_CYC = eINSTANCE.getHDEL_NumCyc();

		/**
		 * The meta object literal for the '<em><b>Eval Tm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDEL__EVAL_TM = eINSTANCE.getHDEL_EvalTm();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDEL__UNITS = eINSTANCE.getHDEL_Units();

		/**
		 * The meta object literal for the '<em><b>Ang Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDEL__ANG_REF = eINSTANCE.getHDEL_AngRef();

		/**
		 * The meta object literal for the '<em><b>Smp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDEL__SMP_RATE = eINSTANCE.getHDEL_SmpRate();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDEL__FREQUENCY = eINSTANCE.getHDEL_Frequency();

		/**
		 * The meta object literal for the '<em><b>Hv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDEL__HV_REF = eINSTANCE.getHDEL_HvRef();

		/**
		 * The meta object literal for the '<em><b>Rms Cyc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDEL__RMS_CYC = eINSTANCE.getHDEL_RmsCyc();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ControllableStatusInfoImpl <em>Controllable Status Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ControllableStatusInfoImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getControllableStatusInfo()
		 * @generated
		 */
		EClass CONTROLLABLE_STATUS_INFO = eINSTANCE.getControllableStatusInfo();

		/**
		 * The meta object literal for the '<em><b>Oper Tm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLABLE_STATUS_INFO__OPER_TM = eINSTANCE.getControllableStatusInfo_OperTm();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLABLE_STATUS_INFO__ORIGIN = eINSTANCE.getControllableStatusInfo_Origin();

		/**
		 * The meta object literal for the '<em><b>Ctl Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLABLE_STATUS_INFO__CTL_NUM = eINSTANCE.getControllableStatusInfo_CtlNum();

		/**
		 * The meta object literal for the '<em><b>St Seld</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLABLE_STATUS_INFO__ST_SELD = eINSTANCE.getControllableStatusInfo_StSeld();

		/**
		 * The meta object literal for the '<em><b>Sub Ena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLABLE_STATUS_INFO__SUB_ENA = eINSTANCE.getControllableStatusInfo_SubEna();

		/**
		 * The meta object literal for the '<em><b>Sub Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLABLE_STATUS_INFO__SUB_Q = eINSTANCE.getControllableStatusInfo_SubQ();

		/**
		 * The meta object literal for the '<em><b>Sub ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLABLE_STATUS_INFO__SUB_ID = eINSTANCE.getControllableStatusInfo_SubID();

		/**
		 * The meta object literal for the '<em><b>Ctl Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLABLE_STATUS_INFO__CTL_MODEL = eINSTANCE.getControllableStatusInfo_CtlModel();

		/**
		 * The meta object literal for the '<em><b>Sbo Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLABLE_STATUS_INFO__SBO_TIMEOUT = eINSTANCE.getControllableStatusInfo_SboTimeout();

		/**
		 * The meta object literal for the '<em><b>Sbo Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLABLE_STATUS_INFO__SBO_CLASS = eINSTANCE.getControllableStatusInfo_SboClass();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLABLE_STATUS_INFO__D = eINSTANCE.getControllableStatusInfo_D();

		/**
		 * The meta object literal for the '<em><b>DU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLABLE_STATUS_INFO__DU = eINSTANCE.getControllableStatusInfo_DU();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SPCImpl <em>SPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SPCImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSPC()
		 * @generated
		 */
		EClass SPC = eINSTANCE.getSPC();

		/**
		 * The meta object literal for the '<em><b>Ctl Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPC__CTL_VAL = eINSTANCE.getSPC_CtlVal();

		/**
		 * The meta object literal for the '<em><b>St Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPC__ST_VAL = eINSTANCE.getSPC_StVal();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPC__Q = eINSTANCE.getSPC_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPC__T = eINSTANCE.getSPC_T();

		/**
		 * The meta object literal for the '<em><b>Sub Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPC__SUB_VAL = eINSTANCE.getSPC_SubVal();

		/**
		 * The meta object literal for the '<em><b>Pulse Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPC__PULSE_CONFIG = eINSTANCE.getSPC_PulseConfig();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.DPCImpl <em>DPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.DPCImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDPC()
		 * @generated
		 */
		EClass DPC = eINSTANCE.getDPC();

		/**
		 * The meta object literal for the '<em><b>Ctl Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPC__CTL_VAL = eINSTANCE.getDPC_CtlVal();

		/**
		 * The meta object literal for the '<em><b>St Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPC__ST_VAL = eINSTANCE.getDPC_StVal();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPC__Q = eINSTANCE.getDPC_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPC__T = eINSTANCE.getDPC_T();

		/**
		 * The meta object literal for the '<em><b>Sub Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPC__SUB_VAL = eINSTANCE.getDPC_SubVal();

		/**
		 * The meta object literal for the '<em><b>Pulse Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPC__PULSE_CONFIG = eINSTANCE.getDPC_PulseConfig();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.INCImpl <em>INC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.INCImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getINC()
		 * @generated
		 */
		EClass INC = eINSTANCE.getINC();

		/**
		 * The meta object literal for the '<em><b>Ctl Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INC__CTL_VAL = eINSTANCE.getINC_CtlVal();

		/**
		 * The meta object literal for the '<em><b>St Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INC__ST_VAL = eINSTANCE.getINC_StVal();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INC__Q = eINSTANCE.getINC_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INC__T = eINSTANCE.getINC_T();

		/**
		 * The meta object literal for the '<em><b>Sub Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INC__SUB_VAL = eINSTANCE.getINC_SubVal();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INC__MIN_VAL = eINSTANCE.getINC_MinVal();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INC__MAX_VAL = eINSTANCE.getINC_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INC__STEP_SIZE = eINSTANCE.getINC_StepSize();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.BSCImpl <em>BSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.BSCImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getBSC()
		 * @generated
		 */
		EClass BSC = eINSTANCE.getBSC();

		/**
		 * The meta object literal for the '<em><b>Ctl Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSC__CTL_VAL = eINSTANCE.getBSC_CtlVal();

		/**
		 * The meta object literal for the '<em><b>Val WTr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSC__VAL_WTR = eINSTANCE.getBSC_ValWTr();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSC__Q = eINSTANCE.getBSC_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSC__T = eINSTANCE.getBSC_T();

		/**
		 * The meta object literal for the '<em><b>Sub Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSC__SUB_VAL = eINSTANCE.getBSC_SubVal();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSC__PERSISTENT = eINSTANCE.getBSC_Persistent();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSC__MIN_VAL = eINSTANCE.getBSC_MinVal();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSC__MAX_VAL = eINSTANCE.getBSC_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSC__STEP_SIZE = eINSTANCE.getBSC_StepSize();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ISCImpl <em>ISC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ISCImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getISC()
		 * @generated
		 */
		EClass ISC = eINSTANCE.getISC();

		/**
		 * The meta object literal for the '<em><b>Ctl Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC__CTL_VAL = eINSTANCE.getISC_CtlVal();

		/**
		 * The meta object literal for the '<em><b>Val WTr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISC__VAL_WTR = eINSTANCE.getISC_ValWTr();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISC__T = eINSTANCE.getISC_T();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISC__Q = eINSTANCE.getISC_Q();

		/**
		 * The meta object literal for the '<em><b>Sub Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISC__SUB_VAL = eINSTANCE.getISC_SubVal();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC__MIN_VAL = eINSTANCE.getISC_MinVal();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC__MAX_VAL = eINSTANCE.getISC_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC__STEP_SIZE = eINSTANCE.getISC_StepSize();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ControllableAnalogueInfoImpl <em>Controllable Analogue Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ControllableAnalogueInfoImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getControllableAnalogueInfo()
		 * @generated
		 */
		EClass CONTROLLABLE_ANALOGUE_INFO = eINSTANCE.getControllableAnalogueInfo();

		/**
		 * The meta object literal for the '<em><b>APC</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLABLE_ANALOGUE_INFO__APC = eINSTANCE.getControllableAnalogueInfo_APC();

		/**
		 * The meta object literal for the '<em><b>CPrimitive CDC</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLABLE_ANALOGUE_INFO__CPRIMITIVE_CDC = eINSTANCE.getControllableAnalogueInfo_C_PrimitiveCDC();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.APCImpl <em>APC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.APCImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getAPC()
		 * @generated
		 */
		EClass APC = eINSTANCE.getAPC();

		/**
		 * The meta object literal for the '<em><b>Set Mag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__SET_MAG = eINSTANCE.getAPC_SetMag();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__ORIGIN = eINSTANCE.getAPC_Origin();

		/**
		 * The meta object literal for the '<em><b>Oper Tm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__OPER_TM = eINSTANCE.getAPC_OperTm();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__Q = eINSTANCE.getAPC_Q();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__T = eINSTANCE.getAPC_T();

		/**
		 * The meta object literal for the '<em><b>Ctl Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__CTL_MODEL = eINSTANCE.getAPC_CtlModel();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__UNITS = eINSTANCE.getAPC_Units();

		/**
		 * The meta object literal for the '<em><b>SVC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__SVC = eINSTANCE.getAPC_SVC();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__MIN_VAL = eINSTANCE.getAPC_MinVal();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__MAX_VAL = eINSTANCE.getAPC_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APC__STEP_SIZE = eINSTANCE.getAPC_StepSize();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APC__D = eINSTANCE.getAPC_D();

		/**
		 * The meta object literal for the '<em><b>DU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APC__DU = eINSTANCE.getAPC_DU();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.SPGImpl <em>SPG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.SPGImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getSPG()
		 * @generated
		 */
		EClass SPG = eINSTANCE.getSPG();

		/**
		 * The meta object literal for the '<em><b>Set Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPG__SET_VAL = eINSTANCE.getSPG_SetVal();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.INGImpl <em>ING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.INGImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getING()
		 * @generated
		 */
		EClass ING = eINSTANCE.getING();

		/**
		 * The meta object literal for the '<em><b>Set Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ING__SET_VAL = eINSTANCE.getING_SetVal();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ING__MIN_VAL = eINSTANCE.getING_MinVal();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ING__MAX_VAL = eINSTANCE.getING_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ING__STEP_SIZE = eINSTANCE.getING_StepSize();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.AnalogueSettingsImpl <em>Analogue Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.AnalogueSettingsImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getAnalogueSettings()
		 * @generated
		 */
		EClass ANALOGUE_SETTINGS = eINSTANCE.getAnalogueSettings();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_SETTINGS__D = eINSTANCE.getAnalogueSettings_D();

		/**
		 * The meta object literal for the '<em><b>DU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_SETTINGS__DU = eINSTANCE.getAnalogueSettings_DU();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.ASGImpl <em>ASG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.ASGImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getASG()
		 * @generated
		 */
		EClass ASG = eINSTANCE.getASG();

		/**
		 * The meta object literal for the '<em><b>Set Mag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASG__SET_MAG = eINSTANCE.getASG_SetMag();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASG__UNITS = eINSTANCE.getASG_Units();

		/**
		 * The meta object literal for the '<em><b>SVC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASG__SVC = eINSTANCE.getASG_SVC();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASG__MIN_VAL = eINSTANCE.getASG_MinVal();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASG__MAX_VAL = eINSTANCE.getASG_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASG__STEP_SIZE = eINSTANCE.getASG_StepSize();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.CURVEImpl <em>CURVE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.CURVEImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCURVE()
		 * @generated
		 */
		EClass CURVE = eINSTANCE.getCURVE();

		/**
		 * The meta object literal for the '<em><b>Set Charact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURVE__SET_CHARACT = eINSTANCE.getCURVE_SetCharact();

		/**
		 * The meta object literal for the '<em><b>Set Par A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__SET_PAR_A = eINSTANCE.getCURVE_SetParA();

		/**
		 * The meta object literal for the '<em><b>Set Par B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__SET_PAR_B = eINSTANCE.getCURVE_SetParB();

		/**
		 * The meta object literal for the '<em><b>Set Par C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__SET_PAR_C = eINSTANCE.getCURVE_SetParC();

		/**
		 * The meta object literal for the '<em><b>Set Par D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__SET_PAR_D = eINSTANCE.getCURVE_SetParD();

		/**
		 * The meta object literal for the '<em><b>Set Par E</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__SET_PAR_E = eINSTANCE.getCURVE_SetParE();

		/**
		 * The meta object literal for the '<em><b>Set Par F</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURVE__SET_PAR_F = eINSTANCE.getCURVE_SetParF();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.DescriptionInfoImpl <em>Description Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.DescriptionInfoImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDescriptionInfo()
		 * @generated
		 */
		EClass DESCRIPTION_INFO = eINSTANCE.getDescriptionInfo();

		/**
		 * The meta object literal for the '<em><b>DPL</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_INFO__DPL = eINSTANCE.getDescriptionInfo_DPL();

		/**
		 * The meta object literal for the '<em><b>LPL</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_INFO__LPL = eINSTANCE.getDescriptionInfo_LPL();

		/**
		 * The meta object literal for the '<em><b>CSD</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_INFO__CSD = eINSTANCE.getDescriptionInfo_CSD();

		/**
		 * The meta object literal for the '<em><b>CPrimitive CDC</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_INFO__CPRIMITIVE_CDC = eINSTANCE.getDescriptionInfo_C_PrimitiveCDC();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.DPLImpl <em>DPL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.DPLImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getDPL()
		 * @generated
		 */
		EClass DPL = eINSTANCE.getDPL();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPL__VENDOR = eINSTANCE.getDPL_Vendor();

		/**
		 * The meta object literal for the '<em><b>Hw Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPL__HW_REV = eINSTANCE.getDPL_HwRev();

		/**
		 * The meta object literal for the '<em><b>Sw Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPL__SW_REV = eINSTANCE.getDPL_SwRev();

		/**
		 * The meta object literal for the '<em><b>Ser Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPL__SER_NUM = eINSTANCE.getDPL_SerNum();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPL__MODEL = eINSTANCE.getDPL_Model();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPL__LOCATION = eINSTANCE.getDPL_Location();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.LPLImpl <em>LPL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.LPLImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getLPL()
		 * @generated
		 */
		EClass LPL = eINSTANCE.getLPL();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LPL__VENDOR = eINSTANCE.getLPL_Vendor();

		/**
		 * The meta object literal for the '<em><b>Sw Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LPL__SW_REV = eINSTANCE.getLPL_SwRev();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LPL__D = eINSTANCE.getLPL_D();

		/**
		 * The meta object literal for the '<em><b>DU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LPL__DU = eINSTANCE.getLPL_DU();

		/**
		 * The meta object literal for the '<em><b>Config Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LPL__CONFIG_REV = eINSTANCE.getLPL_ConfigRev();

		/**
		 * The meta object literal for the '<em><b>Id Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LPL__ID_NS = eINSTANCE.getLPL_IdNs();

		/**
		 * The meta object literal for the '<em><b>Ln Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LPL__LN_NS = eINSTANCE.getLPL_LnNs();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.Dataclasses.impl.CSDImpl <em>CSD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.Dataclasses.impl.CSDImpl
		 * @see gluemodel.substationStandard.Dataclasses.impl.DataclassesPackageImpl#getCSD()
		 * @generated
		 */
		EClass CSD = eINSTANCE.getCSD();

		/**
		 * The meta object literal for the '<em><b>XUnit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSD__XUNIT = eINSTANCE.getCSD_XUnit();

		/**
		 * The meta object literal for the '<em><b>XD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSD__XD = eINSTANCE.getCSD_XD();

		/**
		 * The meta object literal for the '<em><b>YUnit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSD__YUNIT = eINSTANCE.getCSD_YUnit();

		/**
		 * The meta object literal for the '<em><b>YD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSD__YD = eINSTANCE.getCSD_YD();

		/**
		 * The meta object literal for the '<em><b>Num Pts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSD__NUM_PTS = eINSTANCE.getCSD_NumPts();

		/**
		 * The meta object literal for the '<em><b>Crv Pts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSD__CRV_PTS = eINSTANCE.getCSD_CrvPts();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSD__D = eINSTANCE.getCSD_D();

		/**
		 * The meta object literal for the '<em><b>DU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSD__DU = eINSTANCE.getCSD_DU();

	}

} //DataclassesPackage
