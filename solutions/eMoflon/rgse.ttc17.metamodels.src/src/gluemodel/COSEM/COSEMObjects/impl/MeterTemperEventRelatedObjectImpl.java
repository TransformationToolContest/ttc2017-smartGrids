/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;
import gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject;

import gluemodel.COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Temper Event Related Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getMeter_open_event_counter <em>Meter open event counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getMeter_open_event_timestamp <em>Meter open event timestamp</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getMeter_open_event_duration <em>Meter open event duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getMeter_open_event_cumulative_duration <em>Meter open event cumulative duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getTerminal_cover_open_event_counter <em>Terminal cover open event counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getTerminal_cover_open_event_time <em>Terminal cover open event time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getTerminal_cover_open_event_duration <em>Terminal cover open event duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getTerminal_cover_open_event_cumulative_duration <em>Terminal cover open event cumulative duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getTilt_event_counter <em>Tilt event counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getTilt_event_time <em>Tilt event time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getTilt_event_duration <em>Tilt event duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getTilt_event_cumulative_duration <em>Tilt event cumulative duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getStrong_DC_magnetic_field_event_counter <em>Strong DC magnetic field event counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getStrong_DC_magnetic_field_event_time <em>Strong DC magnetic field event time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getStrong_DC_magnetic_field_event_duration <em>Strong DC magnetic field event duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getStrong_DC_magnetic_field_event_cumulative_duration <em>Strong DC magnetic field event cumulative duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getSupply_control_switch_event_counter <em>Supply control switch event counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getSupply_control_switch_event_time <em>Supply control switch event time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getSupply_control_switch_event_duration <em>Supply control switch event duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getSupply_control_switch_event_cumulative_duration <em>Supply control switch event cumulative duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getMetrology_tamper_event_counter <em>Metrology tamper event counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getMetrology_tamper_event_time <em>Metrology tamper event time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getMetrology_tamper_event_duration <em>Metrology tamper event duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getMetrology_tamper_event_cumulative_duration <em>Metrology tamper event cumulative duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getCommunication_tamper_event_counter <em>Communication tamper event counter</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getCommunication_tamper_event_time <em>Communication tamper event time</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getCommunication_tamper_event_duration <em>Communication tamper event duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getCommunication_tamper_event_cumulative_duration <em>Communication tamper event cumulative duration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl#getManufacturer_specific <em>Manufacturer specific</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterTemperEventRelatedObjectImpl extends DataImpl implements MeterTemperEventRelatedObject {
	/**
	 * The default value of the '{@link #getMeter_open_event_counter() <em>Meter open event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_open_event_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int METER_OPEN_EVENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeter_open_event_counter() <em>Meter open event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_open_event_counter()
	 * @generated
	 * @ordered
	 */
	protected int meter_open_event_counter = METER_OPEN_EVENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeter_open_event_timestamp() <em>Meter open event timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_open_event_timestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String METER_OPEN_EVENT_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeter_open_event_timestamp() <em>Meter open event timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_open_event_timestamp()
	 * @generated
	 * @ordered
	 */
	protected String meter_open_event_timestamp = METER_OPEN_EVENT_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeter_open_event_duration() <em>Meter open event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_open_event_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int METER_OPEN_EVENT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeter_open_event_duration() <em>Meter open event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_open_event_duration()
	 * @generated
	 * @ordered
	 */
	protected int meter_open_event_duration = METER_OPEN_EVENT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeter_open_event_cumulative_duration() <em>Meter open event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_open_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int METER_OPEN_EVENT_CUMULATIVE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeter_open_event_cumulative_duration() <em>Meter open event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_open_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected int meter_open_event_cumulative_duration = METER_OPEN_EVENT_CUMULATIVE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminal_cover_open_event_counter() <em>Terminal cover open event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal_cover_open_event_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int TERMINAL_COVER_OPEN_EVENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTerminal_cover_open_event_counter() <em>Terminal cover open event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal_cover_open_event_counter()
	 * @generated
	 * @ordered
	 */
	protected int terminal_cover_open_event_counter = TERMINAL_COVER_OPEN_EVENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminal_cover_open_event_time() <em>Terminal cover open event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal_cover_open_event_time()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINAL_COVER_OPEN_EVENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminal_cover_open_event_time() <em>Terminal cover open event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal_cover_open_event_time()
	 * @generated
	 * @ordered
	 */
	protected String terminal_cover_open_event_time = TERMINAL_COVER_OPEN_EVENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminal_cover_open_event_duration() <em>Terminal cover open event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal_cover_open_event_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int TERMINAL_COVER_OPEN_EVENT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTerminal_cover_open_event_duration() <em>Terminal cover open event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal_cover_open_event_duration()
	 * @generated
	 * @ordered
	 */
	protected int terminal_cover_open_event_duration = TERMINAL_COVER_OPEN_EVENT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminal_cover_open_event_cumulative_duration() <em>Terminal cover open event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal_cover_open_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTerminal_cover_open_event_cumulative_duration() <em>Terminal cover open event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal_cover_open_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected int terminal_cover_open_event_cumulative_duration = TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTilt_event_counter() <em>Tilt event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt_event_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int TILT_EVENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTilt_event_counter() <em>Tilt event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt_event_counter()
	 * @generated
	 * @ordered
	 */
	protected int tilt_event_counter = TILT_EVENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTilt_event_time() <em>Tilt event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt_event_time()
	 * @generated
	 * @ordered
	 */
	protected static final String TILT_EVENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTilt_event_time() <em>Tilt event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt_event_time()
	 * @generated
	 * @ordered
	 */
	protected String tilt_event_time = TILT_EVENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTilt_event_duration() <em>Tilt event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt_event_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int TILT_EVENT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTilt_event_duration() <em>Tilt event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt_event_duration()
	 * @generated
	 * @ordered
	 */
	protected int tilt_event_duration = TILT_EVENT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTilt_event_cumulative_duration() <em>Tilt event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int TILT_EVENT_CUMULATIVE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTilt_event_cumulative_duration() <em>Tilt event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected int tilt_event_cumulative_duration = TILT_EVENT_CUMULATIVE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrong_DC_magnetic_field_event_counter() <em>Strong DC magnetic field event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrong_DC_magnetic_field_event_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrong_DC_magnetic_field_event_counter() <em>Strong DC magnetic field event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrong_DC_magnetic_field_event_counter()
	 * @generated
	 * @ordered
	 */
	protected int strong_DC_magnetic_field_event_counter = STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrong_DC_magnetic_field_event_time() <em>Strong DC magnetic field event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrong_DC_magnetic_field_event_time()
	 * @generated
	 * @ordered
	 */
	protected static final String STRONG_DC_MAGNETIC_FIELD_EVENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrong_DC_magnetic_field_event_time() <em>Strong DC magnetic field event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrong_DC_magnetic_field_event_time()
	 * @generated
	 * @ordered
	 */
	protected String strong_DC_magnetic_field_event_time = STRONG_DC_MAGNETIC_FIELD_EVENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrong_DC_magnetic_field_event_duration() <em>Strong DC magnetic field event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrong_DC_magnetic_field_event_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrong_DC_magnetic_field_event_duration() <em>Strong DC magnetic field event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrong_DC_magnetic_field_event_duration()
	 * @generated
	 * @ordered
	 */
	protected int strong_DC_magnetic_field_event_duration = STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrong_DC_magnetic_field_event_cumulative_duration() <em>Strong DC magnetic field event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrong_DC_magnetic_field_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrong_DC_magnetic_field_event_cumulative_duration() <em>Strong DC magnetic field event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrong_DC_magnetic_field_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected int strong_DC_magnetic_field_event_cumulative_duration = STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupply_control_switch_event_counter() <em>Supply control switch event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply_control_switch_event_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int SUPPLY_CONTROL_SWITCH_EVENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSupply_control_switch_event_counter() <em>Supply control switch event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply_control_switch_event_counter()
	 * @generated
	 * @ordered
	 */
	protected int supply_control_switch_event_counter = SUPPLY_CONTROL_SWITCH_EVENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupply_control_switch_event_time() <em>Supply control switch event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply_control_switch_event_time()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLY_CONTROL_SWITCH_EVENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupply_control_switch_event_time() <em>Supply control switch event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply_control_switch_event_time()
	 * @generated
	 * @ordered
	 */
	protected String supply_control_switch_event_time = SUPPLY_CONTROL_SWITCH_EVENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupply_control_switch_event_duration() <em>Supply control switch event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply_control_switch_event_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int SUPPLY_CONTROL_SWITCH_EVENT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSupply_control_switch_event_duration() <em>Supply control switch event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply_control_switch_event_duration()
	 * @generated
	 * @ordered
	 */
	protected int supply_control_switch_event_duration = SUPPLY_CONTROL_SWITCH_EVENT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupply_control_switch_event_cumulative_duration() <em>Supply control switch event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply_control_switch_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSupply_control_switch_event_cumulative_duration() <em>Supply control switch event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply_control_switch_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected int supply_control_switch_event_cumulative_duration = SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetrology_tamper_event_counter() <em>Metrology tamper event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrology_tamper_event_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int METROLOGY_TAMPER_EVENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMetrology_tamper_event_counter() <em>Metrology tamper event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrology_tamper_event_counter()
	 * @generated
	 * @ordered
	 */
	protected int metrology_tamper_event_counter = METROLOGY_TAMPER_EVENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetrology_tamper_event_time() <em>Metrology tamper event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrology_tamper_event_time()
	 * @generated
	 * @ordered
	 */
	protected static final String METROLOGY_TAMPER_EVENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetrology_tamper_event_time() <em>Metrology tamper event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrology_tamper_event_time()
	 * @generated
	 * @ordered
	 */
	protected String metrology_tamper_event_time = METROLOGY_TAMPER_EVENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetrology_tamper_event_duration() <em>Metrology tamper event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrology_tamper_event_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int METROLOGY_TAMPER_EVENT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMetrology_tamper_event_duration() <em>Metrology tamper event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrology_tamper_event_duration()
	 * @generated
	 * @ordered
	 */
	protected int metrology_tamper_event_duration = METROLOGY_TAMPER_EVENT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetrology_tamper_event_cumulative_duration() <em>Metrology tamper event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrology_tamper_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMetrology_tamper_event_cumulative_duration() <em>Metrology tamper event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrology_tamper_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected int metrology_tamper_event_cumulative_duration = METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunication_tamper_event_counter() <em>Communication tamper event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_tamper_event_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMUNICATION_TAMPER_EVENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommunication_tamper_event_counter() <em>Communication tamper event counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_tamper_event_counter()
	 * @generated
	 * @ordered
	 */
	protected int communication_tamper_event_counter = COMMUNICATION_TAMPER_EVENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunication_tamper_event_time() <em>Communication tamper event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_tamper_event_time()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_TAMPER_EVENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunication_tamper_event_time() <em>Communication tamper event time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_tamper_event_time()
	 * @generated
	 * @ordered
	 */
	protected String communication_tamper_event_time = COMMUNICATION_TAMPER_EVENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunication_tamper_event_duration() <em>Communication tamper event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_tamper_event_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMUNICATION_TAMPER_EVENT_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommunication_tamper_event_duration() <em>Communication tamper event duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_tamper_event_duration()
	 * @generated
	 * @ordered
	 */
	protected int communication_tamper_event_duration = COMMUNICATION_TAMPER_EVENT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunication_tamper_event_cumulative_duration() <em>Communication tamper event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_tamper_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommunication_tamper_event_cumulative_duration() <em>Communication tamper event cumulative duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication_tamper_event_cumulative_duration()
	 * @generated
	 * @ordered
	 */
	protected int communication_tamper_event_cumulative_duration = COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer_specific() <em>Manufacturer specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer_specific()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_SPECIFIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer_specific() <em>Manufacturer specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer_specific()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer_specific = MANUFACTURER_SPECIFIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterTemperEventRelatedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getMeterTemperEventRelatedObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMeter_open_event_counter() {
		return meter_open_event_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeter_open_event_counter(int newMeter_open_event_counter) {
		int oldMeter_open_event_counter = meter_open_event_counter;
		meter_open_event_counter = newMeter_open_event_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_COUNTER, oldMeter_open_event_counter, meter_open_event_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeter_open_event_timestamp() {
		return meter_open_event_timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeter_open_event_timestamp(String newMeter_open_event_timestamp) {
		String oldMeter_open_event_timestamp = meter_open_event_timestamp;
		meter_open_event_timestamp = newMeter_open_event_timestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_TIMESTAMP, oldMeter_open_event_timestamp, meter_open_event_timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMeter_open_event_duration() {
		return meter_open_event_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeter_open_event_duration(int newMeter_open_event_duration) {
		int oldMeter_open_event_duration = meter_open_event_duration;
		meter_open_event_duration = newMeter_open_event_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_DURATION, oldMeter_open_event_duration, meter_open_event_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMeter_open_event_cumulative_duration() {
		return meter_open_event_cumulative_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeter_open_event_cumulative_duration(int newMeter_open_event_cumulative_duration) {
		int oldMeter_open_event_cumulative_duration = meter_open_event_cumulative_duration;
		meter_open_event_cumulative_duration = newMeter_open_event_cumulative_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_CUMULATIVE_DURATION, oldMeter_open_event_cumulative_duration, meter_open_event_cumulative_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTerminal_cover_open_event_counter() {
		return terminal_cover_open_event_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal_cover_open_event_counter(int newTerminal_cover_open_event_counter) {
		int oldTerminal_cover_open_event_counter = terminal_cover_open_event_counter;
		terminal_cover_open_event_counter = newTerminal_cover_open_event_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_COUNTER, oldTerminal_cover_open_event_counter, terminal_cover_open_event_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerminal_cover_open_event_time() {
		return terminal_cover_open_event_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal_cover_open_event_time(String newTerminal_cover_open_event_time) {
		String oldTerminal_cover_open_event_time = terminal_cover_open_event_time;
		terminal_cover_open_event_time = newTerminal_cover_open_event_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_TIME, oldTerminal_cover_open_event_time, terminal_cover_open_event_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTerminal_cover_open_event_duration() {
		return terminal_cover_open_event_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal_cover_open_event_duration(int newTerminal_cover_open_event_duration) {
		int oldTerminal_cover_open_event_duration = terminal_cover_open_event_duration;
		terminal_cover_open_event_duration = newTerminal_cover_open_event_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_DURATION, oldTerminal_cover_open_event_duration, terminal_cover_open_event_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTerminal_cover_open_event_cumulative_duration() {
		return terminal_cover_open_event_cumulative_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal_cover_open_event_cumulative_duration(int newTerminal_cover_open_event_cumulative_duration) {
		int oldTerminal_cover_open_event_cumulative_duration = terminal_cover_open_event_cumulative_duration;
		terminal_cover_open_event_cumulative_duration = newTerminal_cover_open_event_cumulative_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION, oldTerminal_cover_open_event_cumulative_duration, terminal_cover_open_event_cumulative_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTilt_event_counter() {
		return tilt_event_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilt_event_counter(int newTilt_event_counter) {
		int oldTilt_event_counter = tilt_event_counter;
		tilt_event_counter = newTilt_event_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_COUNTER, oldTilt_event_counter, tilt_event_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTilt_event_time() {
		return tilt_event_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilt_event_time(String newTilt_event_time) {
		String oldTilt_event_time = tilt_event_time;
		tilt_event_time = newTilt_event_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_TIME, oldTilt_event_time, tilt_event_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTilt_event_duration() {
		return tilt_event_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilt_event_duration(int newTilt_event_duration) {
		int oldTilt_event_duration = tilt_event_duration;
		tilt_event_duration = newTilt_event_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_DURATION, oldTilt_event_duration, tilt_event_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTilt_event_cumulative_duration() {
		return tilt_event_cumulative_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilt_event_cumulative_duration(int newTilt_event_cumulative_duration) {
		int oldTilt_event_cumulative_duration = tilt_event_cumulative_duration;
		tilt_event_cumulative_duration = newTilt_event_cumulative_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_CUMULATIVE_DURATION, oldTilt_event_cumulative_duration, tilt_event_cumulative_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStrong_DC_magnetic_field_event_counter() {
		return strong_DC_magnetic_field_event_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrong_DC_magnetic_field_event_counter(int newStrong_DC_magnetic_field_event_counter) {
		int oldStrong_DC_magnetic_field_event_counter = strong_DC_magnetic_field_event_counter;
		strong_DC_magnetic_field_event_counter = newStrong_DC_magnetic_field_event_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER, oldStrong_DC_magnetic_field_event_counter, strong_DC_magnetic_field_event_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrong_DC_magnetic_field_event_time() {
		return strong_DC_magnetic_field_event_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrong_DC_magnetic_field_event_time(String newStrong_DC_magnetic_field_event_time) {
		String oldStrong_DC_magnetic_field_event_time = strong_DC_magnetic_field_event_time;
		strong_DC_magnetic_field_event_time = newStrong_DC_magnetic_field_event_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_TIME, oldStrong_DC_magnetic_field_event_time, strong_DC_magnetic_field_event_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStrong_DC_magnetic_field_event_duration() {
		return strong_DC_magnetic_field_event_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrong_DC_magnetic_field_event_duration(int newStrong_DC_magnetic_field_event_duration) {
		int oldStrong_DC_magnetic_field_event_duration = strong_DC_magnetic_field_event_duration;
		strong_DC_magnetic_field_event_duration = newStrong_DC_magnetic_field_event_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION, oldStrong_DC_magnetic_field_event_duration, strong_DC_magnetic_field_event_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStrong_DC_magnetic_field_event_cumulative_duration() {
		return strong_DC_magnetic_field_event_cumulative_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrong_DC_magnetic_field_event_cumulative_duration(int newStrong_DC_magnetic_field_event_cumulative_duration) {
		int oldStrong_DC_magnetic_field_event_cumulative_duration = strong_DC_magnetic_field_event_cumulative_duration;
		strong_DC_magnetic_field_event_cumulative_duration = newStrong_DC_magnetic_field_event_cumulative_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION, oldStrong_DC_magnetic_field_event_cumulative_duration, strong_DC_magnetic_field_event_cumulative_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSupply_control_switch_event_counter() {
		return supply_control_switch_event_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply_control_switch_event_counter(int newSupply_control_switch_event_counter) {
		int oldSupply_control_switch_event_counter = supply_control_switch_event_counter;
		supply_control_switch_event_counter = newSupply_control_switch_event_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_COUNTER, oldSupply_control_switch_event_counter, supply_control_switch_event_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupply_control_switch_event_time() {
		return supply_control_switch_event_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply_control_switch_event_time(String newSupply_control_switch_event_time) {
		String oldSupply_control_switch_event_time = supply_control_switch_event_time;
		supply_control_switch_event_time = newSupply_control_switch_event_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_TIME, oldSupply_control_switch_event_time, supply_control_switch_event_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSupply_control_switch_event_duration() {
		return supply_control_switch_event_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply_control_switch_event_duration(int newSupply_control_switch_event_duration) {
		int oldSupply_control_switch_event_duration = supply_control_switch_event_duration;
		supply_control_switch_event_duration = newSupply_control_switch_event_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_DURATION, oldSupply_control_switch_event_duration, supply_control_switch_event_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSupply_control_switch_event_cumulative_duration() {
		return supply_control_switch_event_cumulative_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply_control_switch_event_cumulative_duration(int newSupply_control_switch_event_cumulative_duration) {
		int oldSupply_control_switch_event_cumulative_duration = supply_control_switch_event_cumulative_duration;
		supply_control_switch_event_cumulative_duration = newSupply_control_switch_event_cumulative_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION, oldSupply_control_switch_event_cumulative_duration, supply_control_switch_event_cumulative_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMetrology_tamper_event_counter() {
		return metrology_tamper_event_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrology_tamper_event_counter(int newMetrology_tamper_event_counter) {
		int oldMetrology_tamper_event_counter = metrology_tamper_event_counter;
		metrology_tamper_event_counter = newMetrology_tamper_event_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_COUNTER, oldMetrology_tamper_event_counter, metrology_tamper_event_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetrology_tamper_event_time() {
		return metrology_tamper_event_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrology_tamper_event_time(String newMetrology_tamper_event_time) {
		String oldMetrology_tamper_event_time = metrology_tamper_event_time;
		metrology_tamper_event_time = newMetrology_tamper_event_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_TIME, oldMetrology_tamper_event_time, metrology_tamper_event_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMetrology_tamper_event_duration() {
		return metrology_tamper_event_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrology_tamper_event_duration(int newMetrology_tamper_event_duration) {
		int oldMetrology_tamper_event_duration = metrology_tamper_event_duration;
		metrology_tamper_event_duration = newMetrology_tamper_event_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_DURATION, oldMetrology_tamper_event_duration, metrology_tamper_event_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMetrology_tamper_event_cumulative_duration() {
		return metrology_tamper_event_cumulative_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrology_tamper_event_cumulative_duration(int newMetrology_tamper_event_cumulative_duration) {
		int oldMetrology_tamper_event_cumulative_duration = metrology_tamper_event_cumulative_duration;
		metrology_tamper_event_cumulative_duration = newMetrology_tamper_event_cumulative_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION, oldMetrology_tamper_event_cumulative_duration, metrology_tamper_event_cumulative_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommunication_tamper_event_counter() {
		return communication_tamper_event_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication_tamper_event_counter(int newCommunication_tamper_event_counter) {
		int oldCommunication_tamper_event_counter = communication_tamper_event_counter;
		communication_tamper_event_counter = newCommunication_tamper_event_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_COUNTER, oldCommunication_tamper_event_counter, communication_tamper_event_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommunication_tamper_event_time() {
		return communication_tamper_event_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication_tamper_event_time(String newCommunication_tamper_event_time) {
		String oldCommunication_tamper_event_time = communication_tamper_event_time;
		communication_tamper_event_time = newCommunication_tamper_event_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_TIME, oldCommunication_tamper_event_time, communication_tamper_event_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommunication_tamper_event_duration() {
		return communication_tamper_event_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication_tamper_event_duration(int newCommunication_tamper_event_duration) {
		int oldCommunication_tamper_event_duration = communication_tamper_event_duration;
		communication_tamper_event_duration = newCommunication_tamper_event_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_DURATION, oldCommunication_tamper_event_duration, communication_tamper_event_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommunication_tamper_event_cumulative_duration() {
		return communication_tamper_event_cumulative_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication_tamper_event_cumulative_duration(int newCommunication_tamper_event_cumulative_duration) {
		int oldCommunication_tamper_event_cumulative_duration = communication_tamper_event_cumulative_duration;
		communication_tamper_event_cumulative_duration = newCommunication_tamper_event_cumulative_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION, oldCommunication_tamper_event_cumulative_duration, communication_tamper_event_cumulative_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer_specific() {
		return manufacturer_specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer_specific(String newManufacturer_specific) {
		String oldManufacturer_specific = manufacturer_specific;
		manufacturer_specific = newManufacturer_specific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__MANUFACTURER_SPECIFIC, oldManufacturer_specific, manufacturer_specific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_COUNTER:
				return getMeter_open_event_counter();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_TIMESTAMP:
				return getMeter_open_event_timestamp();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_DURATION:
				return getMeter_open_event_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_CUMULATIVE_DURATION:
				return getMeter_open_event_cumulative_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_COUNTER:
				return getTerminal_cover_open_event_counter();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_TIME:
				return getTerminal_cover_open_event_time();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_DURATION:
				return getTerminal_cover_open_event_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION:
				return getTerminal_cover_open_event_cumulative_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_COUNTER:
				return getTilt_event_counter();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_TIME:
				return getTilt_event_time();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_DURATION:
				return getTilt_event_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_CUMULATIVE_DURATION:
				return getTilt_event_cumulative_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER:
				return getStrong_DC_magnetic_field_event_counter();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_TIME:
				return getStrong_DC_magnetic_field_event_time();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION:
				return getStrong_DC_magnetic_field_event_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION:
				return getStrong_DC_magnetic_field_event_cumulative_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_COUNTER:
				return getSupply_control_switch_event_counter();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_TIME:
				return getSupply_control_switch_event_time();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_DURATION:
				return getSupply_control_switch_event_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION:
				return getSupply_control_switch_event_cumulative_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_COUNTER:
				return getMetrology_tamper_event_counter();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_TIME:
				return getMetrology_tamper_event_time();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_DURATION:
				return getMetrology_tamper_event_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION:
				return getMetrology_tamper_event_cumulative_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_COUNTER:
				return getCommunication_tamper_event_counter();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_TIME:
				return getCommunication_tamper_event_time();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_DURATION:
				return getCommunication_tamper_event_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION:
				return getCommunication_tamper_event_cumulative_duration();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__MANUFACTURER_SPECIFIC:
				return getManufacturer_specific();
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
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_COUNTER:
				setMeter_open_event_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_TIMESTAMP:
				setMeter_open_event_timestamp((String)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_DURATION:
				setMeter_open_event_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_CUMULATIVE_DURATION:
				setMeter_open_event_cumulative_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_COUNTER:
				setTerminal_cover_open_event_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_TIME:
				setTerminal_cover_open_event_time((String)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_DURATION:
				setTerminal_cover_open_event_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION:
				setTerminal_cover_open_event_cumulative_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_COUNTER:
				setTilt_event_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_TIME:
				setTilt_event_time((String)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_DURATION:
				setTilt_event_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_CUMULATIVE_DURATION:
				setTilt_event_cumulative_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER:
				setStrong_DC_magnetic_field_event_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_TIME:
				setStrong_DC_magnetic_field_event_time((String)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION:
				setStrong_DC_magnetic_field_event_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION:
				setStrong_DC_magnetic_field_event_cumulative_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_COUNTER:
				setSupply_control_switch_event_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_TIME:
				setSupply_control_switch_event_time((String)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_DURATION:
				setSupply_control_switch_event_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION:
				setSupply_control_switch_event_cumulative_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_COUNTER:
				setMetrology_tamper_event_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_TIME:
				setMetrology_tamper_event_time((String)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_DURATION:
				setMetrology_tamper_event_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION:
				setMetrology_tamper_event_cumulative_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_COUNTER:
				setCommunication_tamper_event_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_TIME:
				setCommunication_tamper_event_time((String)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_DURATION:
				setCommunication_tamper_event_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION:
				setCommunication_tamper_event_cumulative_duration((Integer)newValue);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__MANUFACTURER_SPECIFIC:
				setManufacturer_specific((String)newValue);
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
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_COUNTER:
				setMeter_open_event_counter(METER_OPEN_EVENT_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_TIMESTAMP:
				setMeter_open_event_timestamp(METER_OPEN_EVENT_TIMESTAMP_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_DURATION:
				setMeter_open_event_duration(METER_OPEN_EVENT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_CUMULATIVE_DURATION:
				setMeter_open_event_cumulative_duration(METER_OPEN_EVENT_CUMULATIVE_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_COUNTER:
				setTerminal_cover_open_event_counter(TERMINAL_COVER_OPEN_EVENT_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_TIME:
				setTerminal_cover_open_event_time(TERMINAL_COVER_OPEN_EVENT_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_DURATION:
				setTerminal_cover_open_event_duration(TERMINAL_COVER_OPEN_EVENT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION:
				setTerminal_cover_open_event_cumulative_duration(TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_COUNTER:
				setTilt_event_counter(TILT_EVENT_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_TIME:
				setTilt_event_time(TILT_EVENT_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_DURATION:
				setTilt_event_duration(TILT_EVENT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_CUMULATIVE_DURATION:
				setTilt_event_cumulative_duration(TILT_EVENT_CUMULATIVE_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER:
				setStrong_DC_magnetic_field_event_counter(STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_TIME:
				setStrong_DC_magnetic_field_event_time(STRONG_DC_MAGNETIC_FIELD_EVENT_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION:
				setStrong_DC_magnetic_field_event_duration(STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION:
				setStrong_DC_magnetic_field_event_cumulative_duration(STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_COUNTER:
				setSupply_control_switch_event_counter(SUPPLY_CONTROL_SWITCH_EVENT_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_TIME:
				setSupply_control_switch_event_time(SUPPLY_CONTROL_SWITCH_EVENT_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_DURATION:
				setSupply_control_switch_event_duration(SUPPLY_CONTROL_SWITCH_EVENT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION:
				setSupply_control_switch_event_cumulative_duration(SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_COUNTER:
				setMetrology_tamper_event_counter(METROLOGY_TAMPER_EVENT_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_TIME:
				setMetrology_tamper_event_time(METROLOGY_TAMPER_EVENT_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_DURATION:
				setMetrology_tamper_event_duration(METROLOGY_TAMPER_EVENT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION:
				setMetrology_tamper_event_cumulative_duration(METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_COUNTER:
				setCommunication_tamper_event_counter(COMMUNICATION_TAMPER_EVENT_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_TIME:
				setCommunication_tamper_event_time(COMMUNICATION_TAMPER_EVENT_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_DURATION:
				setCommunication_tamper_event_duration(COMMUNICATION_TAMPER_EVENT_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION:
				setCommunication_tamper_event_cumulative_duration(COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__MANUFACTURER_SPECIFIC:
				setManufacturer_specific(MANUFACTURER_SPECIFIC_EDEFAULT);
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
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_COUNTER:
				return meter_open_event_counter != METER_OPEN_EVENT_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_TIMESTAMP:
				return METER_OPEN_EVENT_TIMESTAMP_EDEFAULT == null ? meter_open_event_timestamp != null : !METER_OPEN_EVENT_TIMESTAMP_EDEFAULT.equals(meter_open_event_timestamp);
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_DURATION:
				return meter_open_event_duration != METER_OPEN_EVENT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_CUMULATIVE_DURATION:
				return meter_open_event_cumulative_duration != METER_OPEN_EVENT_CUMULATIVE_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_COUNTER:
				return terminal_cover_open_event_counter != TERMINAL_COVER_OPEN_EVENT_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_TIME:
				return TERMINAL_COVER_OPEN_EVENT_TIME_EDEFAULT == null ? terminal_cover_open_event_time != null : !TERMINAL_COVER_OPEN_EVENT_TIME_EDEFAULT.equals(terminal_cover_open_event_time);
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_DURATION:
				return terminal_cover_open_event_duration != TERMINAL_COVER_OPEN_EVENT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION:
				return terminal_cover_open_event_cumulative_duration != TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_COUNTER:
				return tilt_event_counter != TILT_EVENT_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_TIME:
				return TILT_EVENT_TIME_EDEFAULT == null ? tilt_event_time != null : !TILT_EVENT_TIME_EDEFAULT.equals(tilt_event_time);
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_DURATION:
				return tilt_event_duration != TILT_EVENT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_CUMULATIVE_DURATION:
				return tilt_event_cumulative_duration != TILT_EVENT_CUMULATIVE_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER:
				return strong_DC_magnetic_field_event_counter != STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_TIME:
				return STRONG_DC_MAGNETIC_FIELD_EVENT_TIME_EDEFAULT == null ? strong_DC_magnetic_field_event_time != null : !STRONG_DC_MAGNETIC_FIELD_EVENT_TIME_EDEFAULT.equals(strong_DC_magnetic_field_event_time);
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION:
				return strong_DC_magnetic_field_event_duration != STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION:
				return strong_DC_magnetic_field_event_cumulative_duration != STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_COUNTER:
				return supply_control_switch_event_counter != SUPPLY_CONTROL_SWITCH_EVENT_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_TIME:
				return SUPPLY_CONTROL_SWITCH_EVENT_TIME_EDEFAULT == null ? supply_control_switch_event_time != null : !SUPPLY_CONTROL_SWITCH_EVENT_TIME_EDEFAULT.equals(supply_control_switch_event_time);
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_DURATION:
				return supply_control_switch_event_duration != SUPPLY_CONTROL_SWITCH_EVENT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION:
				return supply_control_switch_event_cumulative_duration != SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_COUNTER:
				return metrology_tamper_event_counter != METROLOGY_TAMPER_EVENT_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_TIME:
				return METROLOGY_TAMPER_EVENT_TIME_EDEFAULT == null ? metrology_tamper_event_time != null : !METROLOGY_TAMPER_EVENT_TIME_EDEFAULT.equals(metrology_tamper_event_time);
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_DURATION:
				return metrology_tamper_event_duration != METROLOGY_TAMPER_EVENT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION:
				return metrology_tamper_event_cumulative_duration != METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_COUNTER:
				return communication_tamper_event_counter != COMMUNICATION_TAMPER_EVENT_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_TIME:
				return COMMUNICATION_TAMPER_EVENT_TIME_EDEFAULT == null ? communication_tamper_event_time != null : !COMMUNICATION_TAMPER_EVENT_TIME_EDEFAULT.equals(communication_tamper_event_time);
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_DURATION:
				return communication_tamper_event_duration != COMMUNICATION_TAMPER_EVENT_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION:
				return communication_tamper_event_cumulative_duration != COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION_EDEFAULT;
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT__MANUFACTURER_SPECIFIC:
				return MANUFACTURER_SPECIFIC_EDEFAULT == null ? manufacturer_specific != null : !MANUFACTURER_SPECIFIC_EDEFAULT.equals(manufacturer_specific);
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
		result.append(" (Meter_open_event_counter: ");
		result.append(meter_open_event_counter);
		result.append(", Meter_open_event_timestamp: ");
		result.append(meter_open_event_timestamp);
		result.append(", Meter_open_event_duration: ");
		result.append(meter_open_event_duration);
		result.append(", Meter_open_event_cumulative_duration: ");
		result.append(meter_open_event_cumulative_duration);
		result.append(", Terminal_cover_open_event_counter: ");
		result.append(terminal_cover_open_event_counter);
		result.append(", Terminal_cover_open_event_time: ");
		result.append(terminal_cover_open_event_time);
		result.append(", Terminal_cover_open_event_duration: ");
		result.append(terminal_cover_open_event_duration);
		result.append(", Terminal_cover_open_event_cumulative_duration: ");
		result.append(terminal_cover_open_event_cumulative_duration);
		result.append(", Tilt_event_counter: ");
		result.append(tilt_event_counter);
		result.append(", Tilt_event_time: ");
		result.append(tilt_event_time);
		result.append(", Tilt_event_duration: ");
		result.append(tilt_event_duration);
		result.append(", Tilt_event_cumulative_duration: ");
		result.append(tilt_event_cumulative_duration);
		result.append(", Strong_DC_magnetic_field_event_counter: ");
		result.append(strong_DC_magnetic_field_event_counter);
		result.append(", Strong_DC_magnetic_field_event_time: ");
		result.append(strong_DC_magnetic_field_event_time);
		result.append(", Strong_DC_magnetic_field_event_duration: ");
		result.append(strong_DC_magnetic_field_event_duration);
		result.append(", Strong_DC_magnetic_field_event_cumulative_duration: ");
		result.append(strong_DC_magnetic_field_event_cumulative_duration);
		result.append(", Supply_control_switch_event_counter: ");
		result.append(supply_control_switch_event_counter);
		result.append(", Supply_control_switch_event_time: ");
		result.append(supply_control_switch_event_time);
		result.append(", Supply_control_switch_event_duration: ");
		result.append(supply_control_switch_event_duration);
		result.append(", Supply_control_switch_event_cumulative_duration: ");
		result.append(supply_control_switch_event_cumulative_duration);
		result.append(", Metrology_tamper_event_counter: ");
		result.append(metrology_tamper_event_counter);
		result.append(", Metrology_tamper_event_time: ");
		result.append(metrology_tamper_event_time);
		result.append(", Metrology_tamper_event_duration: ");
		result.append(metrology_tamper_event_duration);
		result.append(", Metrology_tamper_event_cumulative_duration: ");
		result.append(metrology_tamper_event_cumulative_duration);
		result.append(", Communication_tamper_event_counter: ");
		result.append(communication_tamper_event_counter);
		result.append(", Communication_tamper_event_time: ");
		result.append(communication_tamper_event_time);
		result.append(", Communication_tamper_event_duration: ");
		result.append(communication_tamper_event_duration);
		result.append(", Communication_tamper_event_cumulative_duration: ");
		result.append(communication_tamper_event_cumulative_duration);
		result.append(", Manufacturer_specific: ");
		result.append(manufacturer_specific);
		result.append(')');
		return result.toString();
	}

} //MeterTemperEventRelatedObjectImpl
