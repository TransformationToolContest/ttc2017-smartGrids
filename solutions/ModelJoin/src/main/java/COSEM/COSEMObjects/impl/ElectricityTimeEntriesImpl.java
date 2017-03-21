/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ElectricityTimeEntries;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electricity Time Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getTime_expired_since_last_end_of_billing_period <em>Time expired since last end of billing period</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getLocaltime <em>Localtime</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getLocaldate <em>Localdate</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getWeekday <em>Weekday</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getTimeoflastreset <em>Timeoflastreset</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getDateoflastreset <em>Dateoflastreset</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getOutputpulseduration <em>Outputpulseduration</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getClocksynchronizationwindow <em>Clocksynchronizationwindow</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getClock_synchronization_method <em>Clock synchronization method</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getClock_time_shift_limit <em>Clock time shift limit</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl#getBilling_period_reset_lockout_time <em>Billing period reset lockout time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricityTimeEntriesImpl extends DataImpl implements ElectricityTimeEntries {
	/**
	 * The default value of the '{@link #getTime_expired_since_last_end_of_billing_period() <em>Time expired since last end of billing period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_expired_since_last_end_of_billing_period()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime_expired_since_last_end_of_billing_period() <em>Time expired since last end of billing period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_expired_since_last_end_of_billing_period()
	 * @generated
	 * @ordered
	 */
	protected String time_expired_since_last_end_of_billing_period = TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocaltime() <em>Localtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaltime()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocaltime() <em>Localtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaltime()
	 * @generated
	 * @ordered
	 */
	protected String localtime = LOCALTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocaldate() <em>Localdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaldate()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocaldate() <em>Localdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaldate()
	 * @generated
	 * @ordered
	 */
	protected String localdate = LOCALDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeekday() <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekday()
	 * @generated
	 * @ordered
	 */
	protected static final String WEEKDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeekday() <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekday()
	 * @generated
	 * @ordered
	 */
	protected String weekday = WEEKDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoflastreset() <em>Timeoflastreset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoflastreset()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOFLASTRESET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoflastreset() <em>Timeoflastreset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoflastreset()
	 * @generated
	 * @ordered
	 */
	protected String timeoflastreset = TIMEOFLASTRESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateoflastreset() <em>Dateoflastreset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateoflastreset()
	 * @generated
	 * @ordered
	 */
	protected static final String DATEOFLASTRESET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateoflastreset() <em>Dateoflastreset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateoflastreset()
	 * @generated
	 * @ordered
	 */
	protected String dateoflastreset = DATEOFLASTRESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputpulseduration() <em>Outputpulseduration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputpulseduration()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUTPULSEDURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputpulseduration() <em>Outputpulseduration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputpulseduration()
	 * @generated
	 * @ordered
	 */
	protected String outputpulseduration = OUTPUTPULSEDURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClocksynchronizationwindow() <em>Clocksynchronizationwindow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocksynchronizationwindow()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCKSYNCHRONIZATIONWINDOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClocksynchronizationwindow() <em>Clocksynchronizationwindow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocksynchronizationwindow()
	 * @generated
	 * @ordered
	 */
	protected String clocksynchronizationwindow = CLOCKSYNCHRONIZATIONWINDOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getClock_synchronization_method() <em>Clock synchronization method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock_synchronization_method()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_SYNCHRONIZATION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClock_synchronization_method() <em>Clock synchronization method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock_synchronization_method()
	 * @generated
	 * @ordered
	 */
	protected String clock_synchronization_method = CLOCK_SYNCHRONIZATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getClock_time_shift_limit() <em>Clock time shift limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock_time_shift_limit()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_TIME_SHIFT_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClock_time_shift_limit() <em>Clock time shift limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock_time_shift_limit()
	 * @generated
	 * @ordered
	 */
	protected String clock_time_shift_limit = CLOCK_TIME_SHIFT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBilling_period_reset_lockout_time() <em>Billing period reset lockout time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilling_period_reset_lockout_time()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_PERIOD_RESET_LOCKOUT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBilling_period_reset_lockout_time() <em>Billing period reset lockout time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilling_period_reset_lockout_time()
	 * @generated
	 * @ordered
	 */
	protected String billing_period_reset_lockout_time = BILLING_PERIOD_RESET_LOCKOUT_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricityTimeEntriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getElectricityTimeEntries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime_expired_since_last_end_of_billing_period() {
		return time_expired_since_last_end_of_billing_period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_expired_since_last_end_of_billing_period(String newTime_expired_since_last_end_of_billing_period) {
		String oldTime_expired_since_last_end_of_billing_period = time_expired_since_last_end_of_billing_period;
		time_expired_since_last_end_of_billing_period = newTime_expired_since_last_end_of_billing_period;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD, oldTime_expired_since_last_end_of_billing_period, time_expired_since_last_end_of_billing_period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocaltime() {
		return localtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaltime(String newLocaltime) {
		String oldLocaltime = localtime;
		localtime = newLocaltime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALTIME, oldLocaltime, localtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocaldate() {
		return localdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocaldate(String newLocaldate) {
		String oldLocaldate = localdate;
		localdate = newLocaldate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALDATE, oldLocaldate, localdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeekday() {
		return weekday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekday(String newWeekday) {
		String oldWeekday = weekday;
		weekday = newWeekday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__WEEKDAY, oldWeekday, weekday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeoflastreset() {
		return timeoflastreset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoflastreset(String newTimeoflastreset) {
		String oldTimeoflastreset = timeoflastreset;
		timeoflastreset = newTimeoflastreset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIMEOFLASTRESET, oldTimeoflastreset, timeoflastreset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateoflastreset() {
		return dateoflastreset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateoflastreset(String newDateoflastreset) {
		String oldDateoflastreset = dateoflastreset;
		dateoflastreset = newDateoflastreset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__DATEOFLASTRESET, oldDateoflastreset, dateoflastreset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputpulseduration() {
		return outputpulseduration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputpulseduration(String newOutputpulseduration) {
		String oldOutputpulseduration = outputpulseduration;
		outputpulseduration = newOutputpulseduration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__OUTPUTPULSEDURATION, oldOutputpulseduration, outputpulseduration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClocksynchronizationwindow() {
		return clocksynchronizationwindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClocksynchronizationwindow(String newClocksynchronizationwindow) {
		String oldClocksynchronizationwindow = clocksynchronizationwindow;
		clocksynchronizationwindow = newClocksynchronizationwindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCKSYNCHRONIZATIONWINDOW, oldClocksynchronizationwindow, clocksynchronizationwindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClock_synchronization_method() {
		return clock_synchronization_method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock_synchronization_method(String newClock_synchronization_method) {
		String oldClock_synchronization_method = clock_synchronization_method;
		clock_synchronization_method = newClock_synchronization_method;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_SYNCHRONIZATION_METHOD, oldClock_synchronization_method, clock_synchronization_method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClock_time_shift_limit() {
		return clock_time_shift_limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock_time_shift_limit(String newClock_time_shift_limit) {
		String oldClock_time_shift_limit = clock_time_shift_limit;
		clock_time_shift_limit = newClock_time_shift_limit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_TIME_SHIFT_LIMIT, oldClock_time_shift_limit, clock_time_shift_limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBilling_period_reset_lockout_time() {
		return billing_period_reset_lockout_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBilling_period_reset_lockout_time(String newBilling_period_reset_lockout_time) {
		String oldBilling_period_reset_lockout_time = billing_period_reset_lockout_time;
		billing_period_reset_lockout_time = newBilling_period_reset_lockout_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__BILLING_PERIOD_RESET_LOCKOUT_TIME, oldBilling_period_reset_lockout_time, billing_period_reset_lockout_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD:
				return getTime_expired_since_last_end_of_billing_period();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALTIME:
				return getLocaltime();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALDATE:
				return getLocaldate();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__WEEKDAY:
				return getWeekday();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIMEOFLASTRESET:
				return getTimeoflastreset();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__DATEOFLASTRESET:
				return getDateoflastreset();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__OUTPUTPULSEDURATION:
				return getOutputpulseduration();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCKSYNCHRONIZATIONWINDOW:
				return getClocksynchronizationwindow();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_SYNCHRONIZATION_METHOD:
				return getClock_synchronization_method();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_TIME_SHIFT_LIMIT:
				return getClock_time_shift_limit();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__BILLING_PERIOD_RESET_LOCKOUT_TIME:
				return getBilling_period_reset_lockout_time();
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
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD:
				setTime_expired_since_last_end_of_billing_period((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALTIME:
				setLocaltime((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALDATE:
				setLocaldate((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__WEEKDAY:
				setWeekday((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIMEOFLASTRESET:
				setTimeoflastreset((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__DATEOFLASTRESET:
				setDateoflastreset((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__OUTPUTPULSEDURATION:
				setOutputpulseduration((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCKSYNCHRONIZATIONWINDOW:
				setClocksynchronizationwindow((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_SYNCHRONIZATION_METHOD:
				setClock_synchronization_method((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_TIME_SHIFT_LIMIT:
				setClock_time_shift_limit((String)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__BILLING_PERIOD_RESET_LOCKOUT_TIME:
				setBilling_period_reset_lockout_time((String)newValue);
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
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD:
				setTime_expired_since_last_end_of_billing_period(TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALTIME:
				setLocaltime(LOCALTIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALDATE:
				setLocaldate(LOCALDATE_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__WEEKDAY:
				setWeekday(WEEKDAY_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIMEOFLASTRESET:
				setTimeoflastreset(TIMEOFLASTRESET_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__DATEOFLASTRESET:
				setDateoflastreset(DATEOFLASTRESET_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__OUTPUTPULSEDURATION:
				setOutputpulseduration(OUTPUTPULSEDURATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCKSYNCHRONIZATIONWINDOW:
				setClocksynchronizationwindow(CLOCKSYNCHRONIZATIONWINDOW_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_SYNCHRONIZATION_METHOD:
				setClock_synchronization_method(CLOCK_SYNCHRONIZATION_METHOD_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_TIME_SHIFT_LIMIT:
				setClock_time_shift_limit(CLOCK_TIME_SHIFT_LIMIT_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__BILLING_PERIOD_RESET_LOCKOUT_TIME:
				setBilling_period_reset_lockout_time(BILLING_PERIOD_RESET_LOCKOUT_TIME_EDEFAULT);
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
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD:
				return TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD_EDEFAULT == null ? time_expired_since_last_end_of_billing_period != null : !TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD_EDEFAULT.equals(time_expired_since_last_end_of_billing_period);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALTIME:
				return LOCALTIME_EDEFAULT == null ? localtime != null : !LOCALTIME_EDEFAULT.equals(localtime);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__LOCALDATE:
				return LOCALDATE_EDEFAULT == null ? localdate != null : !LOCALDATE_EDEFAULT.equals(localdate);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__WEEKDAY:
				return WEEKDAY_EDEFAULT == null ? weekday != null : !WEEKDAY_EDEFAULT.equals(weekday);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__TIMEOFLASTRESET:
				return TIMEOFLASTRESET_EDEFAULT == null ? timeoflastreset != null : !TIMEOFLASTRESET_EDEFAULT.equals(timeoflastreset);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__DATEOFLASTRESET:
				return DATEOFLASTRESET_EDEFAULT == null ? dateoflastreset != null : !DATEOFLASTRESET_EDEFAULT.equals(dateoflastreset);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__OUTPUTPULSEDURATION:
				return OUTPUTPULSEDURATION_EDEFAULT == null ? outputpulseduration != null : !OUTPUTPULSEDURATION_EDEFAULT.equals(outputpulseduration);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCKSYNCHRONIZATIONWINDOW:
				return CLOCKSYNCHRONIZATIONWINDOW_EDEFAULT == null ? clocksynchronizationwindow != null : !CLOCKSYNCHRONIZATIONWINDOW_EDEFAULT.equals(clocksynchronizationwindow);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_SYNCHRONIZATION_METHOD:
				return CLOCK_SYNCHRONIZATION_METHOD_EDEFAULT == null ? clock_synchronization_method != null : !CLOCK_SYNCHRONIZATION_METHOD_EDEFAULT.equals(clock_synchronization_method);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__CLOCK_TIME_SHIFT_LIMIT:
				return CLOCK_TIME_SHIFT_LIMIT_EDEFAULT == null ? clock_time_shift_limit != null : !CLOCK_TIME_SHIFT_LIMIT_EDEFAULT.equals(clock_time_shift_limit);
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES__BILLING_PERIOD_RESET_LOCKOUT_TIME:
				return BILLING_PERIOD_RESET_LOCKOUT_TIME_EDEFAULT == null ? billing_period_reset_lockout_time != null : !BILLING_PERIOD_RESET_LOCKOUT_TIME_EDEFAULT.equals(billing_period_reset_lockout_time);
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
		result.append(" (Time_expired_since_last_end_of_billing_period: ");
		result.append(time_expired_since_last_end_of_billing_period);
		result.append(", Localtime: ");
		result.append(localtime);
		result.append(", Localdate: ");
		result.append(localdate);
		result.append(", Weekday: ");
		result.append(weekday);
		result.append(", Timeoflastreset: ");
		result.append(timeoflastreset);
		result.append(", Dateoflastreset: ");
		result.append(dateoflastreset);
		result.append(", Outputpulseduration: ");
		result.append(outputpulseduration);
		result.append(", Clocksynchronizationwindow: ");
		result.append(clocksynchronizationwindow);
		result.append(", Clock_synchronization_method: ");
		result.append(clock_synchronization_method);
		result.append(", Clock_time_shift_limit: ");
		result.append(clock_time_shift_limit);
		result.append(", Billing_period_reset_lockout_time: ");
		result.append(billing_period_reset_lockout_time);
		result.append(')');
		return result.toString();
	}

} //ElectricityTimeEntriesImpl
