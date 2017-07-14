/**
 */
package gluemodel.COSEM.InterfaceClasses.impl;

import gluemodel.COSEM.InterfaceClasses.Clock;
import gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl#getTime <em>Time</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl#getTime_zone <em>Time zone</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl#getDaylight_savings_begin <em>Daylight savings begin</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl#getDaylight_savings_end <em>Daylight savings end</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl#getDaylight_savings_deviation <em>Daylight savings deviation</em>}</li>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.impl.ClockImpl#isDaylight_savings_enabled <em>Daylight savings enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockImpl extends BaseImpl implements Clock {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTime_zone() <em>Time zone</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_zone()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> time_zone;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylight_savings_begin() <em>Daylight savings begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylight_savings_begin()
	 * @generated
	 * @ordered
	 */
	protected static final String DAYLIGHT_SAVINGS_BEGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylight_savings_begin() <em>Daylight savings begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylight_savings_begin()
	 * @generated
	 * @ordered
	 */
	protected String daylight_savings_begin = DAYLIGHT_SAVINGS_BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaylight_savings_end() <em>Daylight savings end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylight_savings_end()
	 * @generated
	 * @ordered
	 */
	protected static final String DAYLIGHT_SAVINGS_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylight_savings_end() <em>Daylight savings end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylight_savings_end()
	 * @generated
	 * @ordered
	 */
	protected String daylight_savings_end = DAYLIGHT_SAVINGS_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDaylight_savings_deviation() <em>Daylight savings deviation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylight_savings_deviation()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> daylight_savings_deviation;

	/**
	 * The default value of the '{@link #isDaylight_savings_enabled() <em>Daylight savings enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDaylight_savings_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAYLIGHT_SAVINGS_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDaylight_savings_enabled() <em>Daylight savings enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDaylight_savings_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean daylight_savings_enabled = DAYLIGHT_SAVINGS_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.CLOCK__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getTime_zone() {
		if (time_zone == null) {
			time_zone = new EDataTypeUniqueEList<Long>(Long.class, this, InterfaceClassesPackage.CLOCK__TIME_ZONE);
		}
		return time_zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.CLOCK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDaylight_savings_begin() {
		return daylight_savings_begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaylight_savings_begin(String newDaylight_savings_begin) {
		String oldDaylight_savings_begin = daylight_savings_begin;
		daylight_savings_begin = newDaylight_savings_begin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_BEGIN, oldDaylight_savings_begin, daylight_savings_begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDaylight_savings_end() {
		return daylight_savings_end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaylight_savings_end(String newDaylight_savings_end) {
		String oldDaylight_savings_end = daylight_savings_end;
		daylight_savings_end = newDaylight_savings_end;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_END, oldDaylight_savings_end, daylight_savings_end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDaylight_savings_deviation() {
		if (daylight_savings_deviation == null) {
			daylight_savings_deviation = new EDataTypeUniqueEList<Integer>(Integer.class, this, InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_DEVIATION);
		}
		return daylight_savings_deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDaylight_savings_enabled() {
		return daylight_savings_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaylight_savings_enabled(boolean newDaylight_savings_enabled) {
		boolean oldDaylight_savings_enabled = daylight_savings_enabled;
		daylight_savings_enabled = newDaylight_savings_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_ENABLED, oldDaylight_savings_enabled, daylight_savings_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void adjust_to_quarter() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void adjust_to_measuring_period() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void adjust_to_minute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void adjust_to_present_time() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void present_adjusting_time() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void shift_time() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceClassesPackage.CLOCK__TIME:
				return getTime();
			case InterfaceClassesPackage.CLOCK__TIME_ZONE:
				return getTime_zone();
			case InterfaceClassesPackage.CLOCK__STATUS:
				return getStatus();
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_BEGIN:
				return getDaylight_savings_begin();
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_END:
				return getDaylight_savings_end();
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_DEVIATION:
				return getDaylight_savings_deviation();
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_ENABLED:
				return isDaylight_savings_enabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InterfaceClassesPackage.CLOCK__TIME:
				setTime((String)newValue);
				return;
			case InterfaceClassesPackage.CLOCK__TIME_ZONE:
				getTime_zone().clear();
				getTime_zone().addAll((Collection<? extends Long>)newValue);
				return;
			case InterfaceClassesPackage.CLOCK__STATUS:
				setStatus((String)newValue);
				return;
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_BEGIN:
				setDaylight_savings_begin((String)newValue);
				return;
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_END:
				setDaylight_savings_end((String)newValue);
				return;
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_DEVIATION:
				getDaylight_savings_deviation().clear();
				getDaylight_savings_deviation().addAll((Collection<? extends Integer>)newValue);
				return;
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_ENABLED:
				setDaylight_savings_enabled((Boolean)newValue);
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
			case InterfaceClassesPackage.CLOCK__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case InterfaceClassesPackage.CLOCK__TIME_ZONE:
				getTime_zone().clear();
				return;
			case InterfaceClassesPackage.CLOCK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_BEGIN:
				setDaylight_savings_begin(DAYLIGHT_SAVINGS_BEGIN_EDEFAULT);
				return;
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_END:
				setDaylight_savings_end(DAYLIGHT_SAVINGS_END_EDEFAULT);
				return;
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_DEVIATION:
				getDaylight_savings_deviation().clear();
				return;
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_ENABLED:
				setDaylight_savings_enabled(DAYLIGHT_SAVINGS_ENABLED_EDEFAULT);
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
			case InterfaceClassesPackage.CLOCK__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case InterfaceClassesPackage.CLOCK__TIME_ZONE:
				return time_zone != null && !time_zone.isEmpty();
			case InterfaceClassesPackage.CLOCK__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_BEGIN:
				return DAYLIGHT_SAVINGS_BEGIN_EDEFAULT == null ? daylight_savings_begin != null : !DAYLIGHT_SAVINGS_BEGIN_EDEFAULT.equals(daylight_savings_begin);
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_END:
				return DAYLIGHT_SAVINGS_END_EDEFAULT == null ? daylight_savings_end != null : !DAYLIGHT_SAVINGS_END_EDEFAULT.equals(daylight_savings_end);
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_DEVIATION:
				return daylight_savings_deviation != null && !daylight_savings_deviation.isEmpty();
			case InterfaceClassesPackage.CLOCK__DAYLIGHT_SAVINGS_ENABLED:
				return daylight_savings_enabled != DAYLIGHT_SAVINGS_ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InterfaceClassesPackage.CLOCK___ADJUST_TO_QUARTER:
				adjust_to_quarter();
				return null;
			case InterfaceClassesPackage.CLOCK___ADJUST_TO_MEASURING_PERIOD:
				adjust_to_measuring_period();
				return null;
			case InterfaceClassesPackage.CLOCK___ADJUST_TO_MINUTE:
				adjust_to_minute();
				return null;
			case InterfaceClassesPackage.CLOCK___ADJUST_TO_PRESENT_TIME:
				adjust_to_present_time();
				return null;
			case InterfaceClassesPackage.CLOCK___PRESENT_ADJUSTING_TIME:
				present_adjusting_time();
				return null;
			case InterfaceClassesPackage.CLOCK___SHIFT_TIME:
				shift_time();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (time: ");
		result.append(time);
		result.append(", time_zone: ");
		result.append(time_zone);
		result.append(", status: ");
		result.append(status);
		result.append(", daylight_savings_begin: ");
		result.append(daylight_savings_begin);
		result.append(", daylight_savings_end: ");
		result.append(daylight_savings_end);
		result.append(", daylight_savings_deviation: ");
		result.append(daylight_savings_deviation);
		result.append(", daylight_savings_enabled: ");
		result.append(daylight_savings_enabled);
		result.append(')');
		return result.toString();
	}

} //ClockImpl
