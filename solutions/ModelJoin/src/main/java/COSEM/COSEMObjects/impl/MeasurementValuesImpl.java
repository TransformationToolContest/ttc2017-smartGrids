/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ElectricityValues;
import COSEM.COSEMObjects.MeasurementValues;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getBilling_period_average <em>Billing period average</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getCumulative_minimum <em>Cumulative minimum</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getCumulative_maximum <em>Cumulative maximum</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getCurrent_average <em>Current average</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getLast_average <em>Last average</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getInstantaneous_value <em>Instantaneous value</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getTime_integral <em>Time integral</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getUnder_limit_threshold <em>Under limit threshold</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getUnder_limit_occurrence_counter <em>Under limit occurrence counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getUnder_limit_duration <em>Under limit duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getUnder_limit_magnitude <em>Under limit magnitude</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getOver_limit_threshold <em>Over limit threshold</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getOver_limit_occurrence_counter <em>Over limit occurrence counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getOver_limit_duration <em>Over limit duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getOver_limit_magnitude <em>Over limit magnitude</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#isMissing_threshold <em>Missing threshold</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#isMissing_occurrence_counter <em>Missing occurrence counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#isMissing_duration <em>Missing duration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#isMissing_magnitude <em>Missing magnitude</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getTime_threshold_for_under_limit <em>Time threshold for under limit</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getTime_threshold_for_over_limit <em>Time threshold for over limit</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getTime_threshold_for_missing_magnitude <em>Time threshold for missing magnitude</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getContracted_value <em>Contracted value</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getMinimum_for_recording_interval <em>Minimum for recording interval</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getMaximum_for_recording_interval <em>Maximum for recording interval</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getTest_average <em>Test average</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.MeasurementValuesImpl#getCalculations <em>Calculations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementValuesImpl extends DataImpl implements MeasurementValues {
	/**
	 * The default value of the '{@link #getBilling_period_average() <em>Billing period average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilling_period_average()
	 * @generated
	 * @ordered
	 */
	protected static final double BILLING_PERIOD_AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBilling_period_average() <em>Billing period average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilling_period_average()
	 * @generated
	 * @ordered
	 */
	protected double billing_period_average = BILLING_PERIOD_AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCumulative_minimum() <em>Cumulative minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulative_minimum()
	 * @generated
	 * @ordered
	 */
	protected static final double CUMULATIVE_MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCumulative_minimum() <em>Cumulative minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulative_minimum()
	 * @generated
	 * @ordered
	 */
	protected double cumulative_minimum = CUMULATIVE_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCumulative_maximum() <em>Cumulative maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulative_maximum()
	 * @generated
	 * @ordered
	 */
	protected static final double CUMULATIVE_MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCumulative_maximum() <em>Cumulative maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCumulative_maximum()
	 * @generated
	 * @ordered
	 */
	protected double cumulative_maximum = CUMULATIVE_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected double minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_average() <em>Current average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_average()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrent_average() <em>Current average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_average()
	 * @generated
	 * @ordered
	 */
	protected double current_average = CURRENT_AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast_average() <em>Last average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_average()
	 * @generated
	 * @ordered
	 */
	protected static final double LAST_AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLast_average() <em>Last average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_average()
	 * @generated
	 * @ordered
	 */
	protected double last_average = LAST_AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected double maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstantaneous_value() <em>Instantaneous value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantaneous_value()
	 * @generated
	 * @ordered
	 */
	protected static final double INSTANTANEOUS_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInstantaneous_value() <em>Instantaneous value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantaneous_value()
	 * @generated
	 * @ordered
	 */
	protected double instantaneous_value = INSTANTANEOUS_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_integral() <em>Time integral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_integral()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_INTEGRAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTime_integral() <em>Time integral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_integral()
	 * @generated
	 * @ordered
	 */
	protected double time_integral = TIME_INTEGRAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnder_limit_threshold() <em>Under limit threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnder_limit_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final double UNDER_LIMIT_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUnder_limit_threshold() <em>Under limit threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnder_limit_threshold()
	 * @generated
	 * @ordered
	 */
	protected double under_limit_threshold = UNDER_LIMIT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnder_limit_occurrence_counter() <em>Under limit occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnder_limit_occurrence_counter()
	 * @generated
	 * @ordered
	 */
	protected static final double UNDER_LIMIT_OCCURRENCE_COUNTER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUnder_limit_occurrence_counter() <em>Under limit occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnder_limit_occurrence_counter()
	 * @generated
	 * @ordered
	 */
	protected double under_limit_occurrence_counter = UNDER_LIMIT_OCCURRENCE_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnder_limit_duration() <em>Under limit duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnder_limit_duration()
	 * @generated
	 * @ordered
	 */
	protected static final double UNDER_LIMIT_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUnder_limit_duration() <em>Under limit duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnder_limit_duration()
	 * @generated
	 * @ordered
	 */
	protected double under_limit_duration = UNDER_LIMIT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnder_limit_magnitude() <em>Under limit magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnder_limit_magnitude()
	 * @generated
	 * @ordered
	 */
	protected static final double UNDER_LIMIT_MAGNITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUnder_limit_magnitude() <em>Under limit magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnder_limit_magnitude()
	 * @generated
	 * @ordered
	 */
	protected double under_limit_magnitude = UNDER_LIMIT_MAGNITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOver_limit_threshold() <em>Over limit threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_limit_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final double OVER_LIMIT_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOver_limit_threshold() <em>Over limit threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_limit_threshold()
	 * @generated
	 * @ordered
	 */
	protected double over_limit_threshold = OVER_LIMIT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOver_limit_occurrence_counter() <em>Over limit occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_limit_occurrence_counter()
	 * @generated
	 * @ordered
	 */
	protected static final double OVER_LIMIT_OCCURRENCE_COUNTER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOver_limit_occurrence_counter() <em>Over limit occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_limit_occurrence_counter()
	 * @generated
	 * @ordered
	 */
	protected double over_limit_occurrence_counter = OVER_LIMIT_OCCURRENCE_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOver_limit_duration() <em>Over limit duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_limit_duration()
	 * @generated
	 * @ordered
	 */
	protected static final double OVER_LIMIT_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOver_limit_duration() <em>Over limit duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_limit_duration()
	 * @generated
	 * @ordered
	 */
	protected double over_limit_duration = OVER_LIMIT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOver_limit_magnitude() <em>Over limit magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_limit_magnitude()
	 * @generated
	 * @ordered
	 */
	protected static final double OVER_LIMIT_MAGNITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOver_limit_magnitude() <em>Over limit magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_limit_magnitude()
	 * @generated
	 * @ordered
	 */
	protected double over_limit_magnitude = OVER_LIMIT_MAGNITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMissing_threshold() <em>Missing threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MISSING_THRESHOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMissing_threshold() <em>Missing threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing_threshold()
	 * @generated
	 * @ordered
	 */
	protected boolean missing_threshold = MISSING_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isMissing_occurrence_counter() <em>Missing occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing_occurrence_counter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MISSING_OCCURRENCE_COUNTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMissing_occurrence_counter() <em>Missing occurrence counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing_occurrence_counter()
	 * @generated
	 * @ordered
	 */
	protected boolean missing_occurrence_counter = MISSING_OCCURRENCE_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isMissing_duration() <em>Missing duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing_duration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MISSING_DURATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMissing_duration() <em>Missing duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing_duration()
	 * @generated
	 * @ordered
	 */
	protected boolean missing_duration = MISSING_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isMissing_magnitude() <em>Missing magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing_magnitude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MISSING_MAGNITUDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMissing_magnitude() <em>Missing magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing_magnitude()
	 * @generated
	 * @ordered
	 */
	protected boolean missing_magnitude = MISSING_MAGNITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_threshold_for_under_limit() <em>Time threshold for under limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_threshold_for_under_limit()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_THRESHOLD_FOR_UNDER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime_threshold_for_under_limit() <em>Time threshold for under limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_threshold_for_under_limit()
	 * @generated
	 * @ordered
	 */
	protected String time_threshold_for_under_limit = TIME_THRESHOLD_FOR_UNDER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_threshold_for_over_limit() <em>Time threshold for over limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_threshold_for_over_limit()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_THRESHOLD_FOR_OVER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime_threshold_for_over_limit() <em>Time threshold for over limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_threshold_for_over_limit()
	 * @generated
	 * @ordered
	 */
	protected String time_threshold_for_over_limit = TIME_THRESHOLD_FOR_OVER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_threshold_for_missing_magnitude() <em>Time threshold for missing magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_threshold_for_missing_magnitude()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_THRESHOLD_FOR_MISSING_MAGNITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime_threshold_for_missing_magnitude() <em>Time threshold for missing magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_threshold_for_missing_magnitude()
	 * @generated
	 * @ordered
	 */
	protected String time_threshold_for_missing_magnitude = TIME_THRESHOLD_FOR_MISSING_MAGNITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContracted_value() <em>Contracted value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracted_value()
	 * @generated
	 * @ordered
	 */
	protected static final double CONTRACTED_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getContracted_value() <em>Contracted value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracted_value()
	 * @generated
	 * @ordered
	 */
	protected double contracted_value = CONTRACTED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum_for_recording_interval() <em>Minimum for recording interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_for_recording_interval()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_FOR_RECORDING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum_for_recording_interval() <em>Minimum for recording interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_for_recording_interval()
	 * @generated
	 * @ordered
	 */
	protected double minimum_for_recording_interval = MINIMUM_FOR_RECORDING_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_for_recording_interval() <em>Maximum for recording interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_for_recording_interval()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_FOR_RECORDING_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum_for_recording_interval() <em>Maximum for recording interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_for_recording_interval()
	 * @generated
	 * @ordered
	 */
	protected double maximum_for_recording_interval = MAXIMUM_FOR_RECORDING_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTest_average() <em>Test average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_average()
	 * @generated
	 * @ordered
	 */
	protected static final double TEST_AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTest_average() <em>Test average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_average()
	 * @generated
	 * @ordered
	 */
	protected double test_average = TEST_AVERAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalculations() <em>Calculations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculations()
	 * @generated
	 * @ordered
	 */
	protected ElectricityValues calculations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getMeasurementValues();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBilling_period_average() {
		return billing_period_average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBilling_period_average(double newBilling_period_average) {
		double oldBilling_period_average = billing_period_average;
		billing_period_average = newBilling_period_average;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__BILLING_PERIOD_AVERAGE, oldBilling_period_average, billing_period_average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCumulative_minimum() {
		return cumulative_minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCumulative_minimum(double newCumulative_minimum) {
		double oldCumulative_minimum = cumulative_minimum;
		cumulative_minimum = newCumulative_minimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MINIMUM, oldCumulative_minimum, cumulative_minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCumulative_maximum() {
		return cumulative_maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCumulative_maximum(double newCumulative_maximum) {
		double oldCumulative_maximum = cumulative_maximum;
		cumulative_maximum = newCumulative_maximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MAXIMUM, oldCumulative_maximum, cumulative_maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(double newMinimum) {
		double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrent_average() {
		return current_average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_average(double newCurrent_average) {
		double oldCurrent_average = current_average;
		current_average = newCurrent_average;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__CURRENT_AVERAGE, oldCurrent_average, current_average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLast_average() {
		return last_average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast_average(double newLast_average) {
		double oldLast_average = last_average;
		last_average = newLast_average;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__LAST_AVERAGE, oldLast_average, last_average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(double newMaximum) {
		double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInstantaneous_value() {
		return instantaneous_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantaneous_value(double newInstantaneous_value) {
		double oldInstantaneous_value = instantaneous_value;
		instantaneous_value = newInstantaneous_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__INSTANTANEOUS_VALUE, oldInstantaneous_value, instantaneous_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTime_integral() {
		return time_integral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_integral(double newTime_integral) {
		double oldTime_integral = time_integral;
		time_integral = newTime_integral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_INTEGRAL, oldTime_integral, time_integral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnder_limit_threshold() {
		return under_limit_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnder_limit_threshold(double newUnder_limit_threshold) {
		double oldUnder_limit_threshold = under_limit_threshold;
		under_limit_threshold = newUnder_limit_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_THRESHOLD, oldUnder_limit_threshold, under_limit_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnder_limit_occurrence_counter() {
		return under_limit_occurrence_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnder_limit_occurrence_counter(double newUnder_limit_occurrence_counter) {
		double oldUnder_limit_occurrence_counter = under_limit_occurrence_counter;
		under_limit_occurrence_counter = newUnder_limit_occurrence_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_OCCURRENCE_COUNTER, oldUnder_limit_occurrence_counter, under_limit_occurrence_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnder_limit_duration() {
		return under_limit_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnder_limit_duration(double newUnder_limit_duration) {
		double oldUnder_limit_duration = under_limit_duration;
		under_limit_duration = newUnder_limit_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_DURATION, oldUnder_limit_duration, under_limit_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnder_limit_magnitude() {
		return under_limit_magnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnder_limit_magnitude(double newUnder_limit_magnitude) {
		double oldUnder_limit_magnitude = under_limit_magnitude;
		under_limit_magnitude = newUnder_limit_magnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_MAGNITUDE, oldUnder_limit_magnitude, under_limit_magnitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOver_limit_threshold() {
		return over_limit_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOver_limit_threshold(double newOver_limit_threshold) {
		double oldOver_limit_threshold = over_limit_threshold;
		over_limit_threshold = newOver_limit_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_THRESHOLD, oldOver_limit_threshold, over_limit_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOver_limit_occurrence_counter() {
		return over_limit_occurrence_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOver_limit_occurrence_counter(double newOver_limit_occurrence_counter) {
		double oldOver_limit_occurrence_counter = over_limit_occurrence_counter;
		over_limit_occurrence_counter = newOver_limit_occurrence_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_OCCURRENCE_COUNTER, oldOver_limit_occurrence_counter, over_limit_occurrence_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOver_limit_duration() {
		return over_limit_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOver_limit_duration(double newOver_limit_duration) {
		double oldOver_limit_duration = over_limit_duration;
		over_limit_duration = newOver_limit_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_DURATION, oldOver_limit_duration, over_limit_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOver_limit_magnitude() {
		return over_limit_magnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOver_limit_magnitude(double newOver_limit_magnitude) {
		double oldOver_limit_magnitude = over_limit_magnitude;
		over_limit_magnitude = newOver_limit_magnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_MAGNITUDE, oldOver_limit_magnitude, over_limit_magnitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMissing_threshold() {
		return missing_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing_threshold(boolean newMissing_threshold) {
		boolean oldMissing_threshold = missing_threshold;
		missing_threshold = newMissing_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_THRESHOLD, oldMissing_threshold, missing_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMissing_occurrence_counter() {
		return missing_occurrence_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing_occurrence_counter(boolean newMissing_occurrence_counter) {
		boolean oldMissing_occurrence_counter = missing_occurrence_counter;
		missing_occurrence_counter = newMissing_occurrence_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_OCCURRENCE_COUNTER, oldMissing_occurrence_counter, missing_occurrence_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMissing_duration() {
		return missing_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing_duration(boolean newMissing_duration) {
		boolean oldMissing_duration = missing_duration;
		missing_duration = newMissing_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_DURATION, oldMissing_duration, missing_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMissing_magnitude() {
		return missing_magnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing_magnitude(boolean newMissing_magnitude) {
		boolean oldMissing_magnitude = missing_magnitude;
		missing_magnitude = newMissing_magnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_MAGNITUDE, oldMissing_magnitude, missing_magnitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime_threshold_for_under_limit() {
		return time_threshold_for_under_limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_threshold_for_under_limit(String newTime_threshold_for_under_limit) {
		String oldTime_threshold_for_under_limit = time_threshold_for_under_limit;
		time_threshold_for_under_limit = newTime_threshold_for_under_limit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_UNDER_LIMIT, oldTime_threshold_for_under_limit, time_threshold_for_under_limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime_threshold_for_over_limit() {
		return time_threshold_for_over_limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_threshold_for_over_limit(String newTime_threshold_for_over_limit) {
		String oldTime_threshold_for_over_limit = time_threshold_for_over_limit;
		time_threshold_for_over_limit = newTime_threshold_for_over_limit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_OVER_LIMIT, oldTime_threshold_for_over_limit, time_threshold_for_over_limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime_threshold_for_missing_magnitude() {
		return time_threshold_for_missing_magnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_threshold_for_missing_magnitude(String newTime_threshold_for_missing_magnitude) {
		String oldTime_threshold_for_missing_magnitude = time_threshold_for_missing_magnitude;
		time_threshold_for_missing_magnitude = newTime_threshold_for_missing_magnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_MISSING_MAGNITUDE, oldTime_threshold_for_missing_magnitude, time_threshold_for_missing_magnitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getContracted_value() {
		return contracted_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContracted_value(double newContracted_value) {
		double oldContracted_value = contracted_value;
		contracted_value = newContracted_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__CONTRACTED_VALUE, oldContracted_value, contracted_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimum_for_recording_interval() {
		return minimum_for_recording_interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum_for_recording_interval(double newMinimum_for_recording_interval) {
		double oldMinimum_for_recording_interval = minimum_for_recording_interval;
		minimum_for_recording_interval = newMinimum_for_recording_interval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM_FOR_RECORDING_INTERVAL, oldMinimum_for_recording_interval, minimum_for_recording_interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximum_for_recording_interval() {
		return maximum_for_recording_interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum_for_recording_interval(double newMaximum_for_recording_interval) {
		double oldMaximum_for_recording_interval = maximum_for_recording_interval;
		maximum_for_recording_interval = newMaximum_for_recording_interval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM_FOR_RECORDING_INTERVAL, oldMaximum_for_recording_interval, maximum_for_recording_interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTest_average() {
		return test_average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest_average(double newTest_average) {
		double oldTest_average = test_average;
		test_average = newTest_average;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__TEST_AVERAGE, oldTest_average, test_average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityValues getCalculations() {
		if (calculations != null && calculations.eIsProxy()) {
			InternalEObject oldCalculations = (InternalEObject)calculations;
			calculations = (ElectricityValues)eResolveProxy(oldCalculations);
			if (calculations != oldCalculations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMObjectsPackage.MEASUREMENT_VALUES__CALCULATIONS, oldCalculations, calculations));
			}
		}
		return calculations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityValues basicGetCalculations() {
		return calculations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculations(ElectricityValues newCalculations) {
		ElectricityValues oldCalculations = calculations;
		calculations = newCalculations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.MEASUREMENT_VALUES__CALCULATIONS, oldCalculations, calculations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.MEASUREMENT_VALUES__BILLING_PERIOD_AVERAGE:
				return getBilling_period_average();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MINIMUM:
				return getCumulative_minimum();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MAXIMUM:
				return getCumulative_maximum();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM:
				return getMinimum();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CURRENT_AVERAGE:
				return getCurrent_average();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__LAST_AVERAGE:
				return getLast_average();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM:
				return getMaximum();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__INSTANTANEOUS_VALUE:
				return getInstantaneous_value();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_INTEGRAL:
				return getTime_integral();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_THRESHOLD:
				return getUnder_limit_threshold();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_OCCURRENCE_COUNTER:
				return getUnder_limit_occurrence_counter();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_DURATION:
				return getUnder_limit_duration();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_MAGNITUDE:
				return getUnder_limit_magnitude();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_THRESHOLD:
				return getOver_limit_threshold();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_OCCURRENCE_COUNTER:
				return getOver_limit_occurrence_counter();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_DURATION:
				return getOver_limit_duration();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_MAGNITUDE:
				return getOver_limit_magnitude();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_THRESHOLD:
				return isMissing_threshold();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_OCCURRENCE_COUNTER:
				return isMissing_occurrence_counter();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_DURATION:
				return isMissing_duration();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_MAGNITUDE:
				return isMissing_magnitude();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_UNDER_LIMIT:
				return getTime_threshold_for_under_limit();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_OVER_LIMIT:
				return getTime_threshold_for_over_limit();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_MISSING_MAGNITUDE:
				return getTime_threshold_for_missing_magnitude();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CONTRACTED_VALUE:
				return getContracted_value();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM_FOR_RECORDING_INTERVAL:
				return getMinimum_for_recording_interval();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM_FOR_RECORDING_INTERVAL:
				return getMaximum_for_recording_interval();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TEST_AVERAGE:
				return getTest_average();
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CALCULATIONS:
				if (resolve) return getCalculations();
				return basicGetCalculations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSEMObjectsPackage.MEASUREMENT_VALUES__BILLING_PERIOD_AVERAGE:
				setBilling_period_average((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MINIMUM:
				setCumulative_minimum((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MAXIMUM:
				setCumulative_maximum((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CURRENT_AVERAGE:
				setCurrent_average((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__LAST_AVERAGE:
				setLast_average((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__INSTANTANEOUS_VALUE:
				setInstantaneous_value((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_INTEGRAL:
				setTime_integral((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_THRESHOLD:
				setUnder_limit_threshold((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_OCCURRENCE_COUNTER:
				setUnder_limit_occurrence_counter((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_DURATION:
				setUnder_limit_duration((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_MAGNITUDE:
				setUnder_limit_magnitude((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_THRESHOLD:
				setOver_limit_threshold((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_OCCURRENCE_COUNTER:
				setOver_limit_occurrence_counter((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_DURATION:
				setOver_limit_duration((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_MAGNITUDE:
				setOver_limit_magnitude((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_THRESHOLD:
				setMissing_threshold((Boolean)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_OCCURRENCE_COUNTER:
				setMissing_occurrence_counter((Boolean)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_DURATION:
				setMissing_duration((Boolean)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_MAGNITUDE:
				setMissing_magnitude((Boolean)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_UNDER_LIMIT:
				setTime_threshold_for_under_limit((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_OVER_LIMIT:
				setTime_threshold_for_over_limit((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_MISSING_MAGNITUDE:
				setTime_threshold_for_missing_magnitude((String)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CONTRACTED_VALUE:
				setContracted_value((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM_FOR_RECORDING_INTERVAL:
				setMinimum_for_recording_interval((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM_FOR_RECORDING_INTERVAL:
				setMaximum_for_recording_interval((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TEST_AVERAGE:
				setTest_average((Double)newValue);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CALCULATIONS:
				setCalculations((ElectricityValues)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.MEASUREMENT_VALUES__BILLING_PERIOD_AVERAGE:
				setBilling_period_average(BILLING_PERIOD_AVERAGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MINIMUM:
				setCumulative_minimum(CUMULATIVE_MINIMUM_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MAXIMUM:
				setCumulative_maximum(CUMULATIVE_MAXIMUM_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CURRENT_AVERAGE:
				setCurrent_average(CURRENT_AVERAGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__LAST_AVERAGE:
				setLast_average(LAST_AVERAGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__INSTANTANEOUS_VALUE:
				setInstantaneous_value(INSTANTANEOUS_VALUE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_INTEGRAL:
				setTime_integral(TIME_INTEGRAL_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_THRESHOLD:
				setUnder_limit_threshold(UNDER_LIMIT_THRESHOLD_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_OCCURRENCE_COUNTER:
				setUnder_limit_occurrence_counter(UNDER_LIMIT_OCCURRENCE_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_DURATION:
				setUnder_limit_duration(UNDER_LIMIT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_MAGNITUDE:
				setUnder_limit_magnitude(UNDER_LIMIT_MAGNITUDE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_THRESHOLD:
				setOver_limit_threshold(OVER_LIMIT_THRESHOLD_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_OCCURRENCE_COUNTER:
				setOver_limit_occurrence_counter(OVER_LIMIT_OCCURRENCE_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_DURATION:
				setOver_limit_duration(OVER_LIMIT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_MAGNITUDE:
				setOver_limit_magnitude(OVER_LIMIT_MAGNITUDE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_THRESHOLD:
				setMissing_threshold(MISSING_THRESHOLD_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_OCCURRENCE_COUNTER:
				setMissing_occurrence_counter(MISSING_OCCURRENCE_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_DURATION:
				setMissing_duration(MISSING_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_MAGNITUDE:
				setMissing_magnitude(MISSING_MAGNITUDE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_UNDER_LIMIT:
				setTime_threshold_for_under_limit(TIME_THRESHOLD_FOR_UNDER_LIMIT_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_OVER_LIMIT:
				setTime_threshold_for_over_limit(TIME_THRESHOLD_FOR_OVER_LIMIT_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_MISSING_MAGNITUDE:
				setTime_threshold_for_missing_magnitude(TIME_THRESHOLD_FOR_MISSING_MAGNITUDE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CONTRACTED_VALUE:
				setContracted_value(CONTRACTED_VALUE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM_FOR_RECORDING_INTERVAL:
				setMinimum_for_recording_interval(MINIMUM_FOR_RECORDING_INTERVAL_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM_FOR_RECORDING_INTERVAL:
				setMaximum_for_recording_interval(MAXIMUM_FOR_RECORDING_INTERVAL_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TEST_AVERAGE:
				setTest_average(TEST_AVERAGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CALCULATIONS:
				setCalculations((ElectricityValues)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.MEASUREMENT_VALUES__BILLING_PERIOD_AVERAGE:
				return billing_period_average != BILLING_PERIOD_AVERAGE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MINIMUM:
				return cumulative_minimum != CUMULATIVE_MINIMUM_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CUMULATIVE_MAXIMUM:
				return cumulative_maximum != CUMULATIVE_MAXIMUM_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CURRENT_AVERAGE:
				return current_average != CURRENT_AVERAGE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__LAST_AVERAGE:
				return last_average != LAST_AVERAGE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__INSTANTANEOUS_VALUE:
				return instantaneous_value != INSTANTANEOUS_VALUE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_INTEGRAL:
				return time_integral != TIME_INTEGRAL_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_THRESHOLD:
				return under_limit_threshold != UNDER_LIMIT_THRESHOLD_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_OCCURRENCE_COUNTER:
				return under_limit_occurrence_counter != UNDER_LIMIT_OCCURRENCE_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_DURATION:
				return under_limit_duration != UNDER_LIMIT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__UNDER_LIMIT_MAGNITUDE:
				return under_limit_magnitude != UNDER_LIMIT_MAGNITUDE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_THRESHOLD:
				return over_limit_threshold != OVER_LIMIT_THRESHOLD_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_OCCURRENCE_COUNTER:
				return over_limit_occurrence_counter != OVER_LIMIT_OCCURRENCE_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_DURATION:
				return over_limit_duration != OVER_LIMIT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__OVER_LIMIT_MAGNITUDE:
				return over_limit_magnitude != OVER_LIMIT_MAGNITUDE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_THRESHOLD:
				return missing_threshold != MISSING_THRESHOLD_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_OCCURRENCE_COUNTER:
				return missing_occurrence_counter != MISSING_OCCURRENCE_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_DURATION:
				return missing_duration != MISSING_DURATION_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MISSING_MAGNITUDE:
				return missing_magnitude != MISSING_MAGNITUDE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_UNDER_LIMIT:
				return TIME_THRESHOLD_FOR_UNDER_LIMIT_EDEFAULT == null ? time_threshold_for_under_limit != null : !TIME_THRESHOLD_FOR_UNDER_LIMIT_EDEFAULT.equals(time_threshold_for_under_limit);
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_OVER_LIMIT:
				return TIME_THRESHOLD_FOR_OVER_LIMIT_EDEFAULT == null ? time_threshold_for_over_limit != null : !TIME_THRESHOLD_FOR_OVER_LIMIT_EDEFAULT.equals(time_threshold_for_over_limit);
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_MISSING_MAGNITUDE:
				return TIME_THRESHOLD_FOR_MISSING_MAGNITUDE_EDEFAULT == null ? time_threshold_for_missing_magnitude != null : !TIME_THRESHOLD_FOR_MISSING_MAGNITUDE_EDEFAULT.equals(time_threshold_for_missing_magnitude);
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CONTRACTED_VALUE:
				return contracted_value != CONTRACTED_VALUE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MINIMUM_FOR_RECORDING_INTERVAL:
				return minimum_for_recording_interval != MINIMUM_FOR_RECORDING_INTERVAL_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__MAXIMUM_FOR_RECORDING_INTERVAL:
				return maximum_for_recording_interval != MAXIMUM_FOR_RECORDING_INTERVAL_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__TEST_AVERAGE:
				return test_average != TEST_AVERAGE_EDEFAULT;
			case COSEMObjectsPackage.MEASUREMENT_VALUES__CALCULATIONS:
				return calculations != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Billing_period_average: ");
		result.append(billing_period_average);
		result.append(", Cumulative_minimum: ");
		result.append(cumulative_minimum);
		result.append(", Cumulative_maximum: ");
		result.append(cumulative_maximum);
		result.append(", Minimum: ");
		result.append(minimum);
		result.append(", Current_average: ");
		result.append(current_average);
		result.append(", Last_average: ");
		result.append(last_average);
		result.append(", Maximum: ");
		result.append(maximum);
		result.append(", Instantaneous_value: ");
		result.append(instantaneous_value);
		result.append(", Time_integral: ");
		result.append(time_integral);
		result.append(", Under_limit_threshold: ");
		result.append(under_limit_threshold);
		result.append(", Under_limit_occurrence_counter: ");
		result.append(under_limit_occurrence_counter);
		result.append(", Under_limit_duration: ");
		result.append(under_limit_duration);
		result.append(", Under_limit_magnitude: ");
		result.append(under_limit_magnitude);
		result.append(", Over_limit_threshold: ");
		result.append(over_limit_threshold);
		result.append(", Over_limit_occurrence_counter: ");
		result.append(over_limit_occurrence_counter);
		result.append(", Over_limit_duration: ");
		result.append(over_limit_duration);
		result.append(", Over_limit_magnitude: ");
		result.append(over_limit_magnitude);
		result.append(", Missing_threshold: ");
		result.append(missing_threshold);
		result.append(", Missing_occurrence_counter: ");
		result.append(missing_occurrence_counter);
		result.append(", Missing_duration: ");
		result.append(missing_duration);
		result.append(", Missing_magnitude: ");
		result.append(missing_magnitude);
		result.append(", Time_threshold_for_under_limit: ");
		result.append(time_threshold_for_under_limit);
		result.append(", Time_threshold_for_over_limit: ");
		result.append(time_threshold_for_over_limit);
		result.append(", Time_threshold_for_missing_magnitude: ");
		result.append(time_threshold_for_missing_magnitude);
		result.append(", Contracted_value: ");
		result.append(contracted_value);
		result.append(", Minimum_for_recording_interval: ");
		result.append(minimum_for_recording_interval);
		result.append(", Maximum_for_recording_interval: ");
		result.append(maximum_for_recording_interval);
		result.append(", Test_average: ");
		result.append(test_average);
		result.append(')');
		return result.toString();
	}

} //MeasurementValuesImpl
