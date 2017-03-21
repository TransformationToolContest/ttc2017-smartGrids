/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.TimePoint;
import CIM.IEC61968.Common.TimeSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.TimeScheduleImpl#getRecurrencePattern <em>Recurrence Pattern</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimeScheduleImpl#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimeScheduleImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimeScheduleImpl#getRecurrencePeriod <em>Recurrence Period</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimeScheduleImpl#getTimePoints <em>Time Points</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimeScheduleImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeScheduleImpl extends DocumentImpl implements TimeSchedule {
	/**
	 * The default value of the '{@link #getRecurrencePattern() <em>Recurrence Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURRENCE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurrencePattern() <em>Recurrence Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencePattern()
	 * @generated
	 * @ordered
	 */
	protected String recurrencePattern = RECURRENCE_PATTERN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScheduleInterval() <em>Schedule Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval scheduleInterval;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean disabled = DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurrencePeriod() <em>Recurrence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final float RECURRENCE_PERIOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRecurrencePeriod() <em>Recurrence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected float recurrencePeriod = RECURRENCE_PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimePoints() <em>Time Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<TimePoint> timePoints;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected float offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TIME_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecurrencePattern() {
		return recurrencePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurrencePattern(String newRecurrencePattern) {
		String oldRecurrencePattern = recurrencePattern;
		recurrencePattern = newRecurrencePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN, oldRecurrencePattern, recurrencePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getScheduleInterval() {
		if (scheduleInterval != null && scheduleInterval.eIsProxy()) {
			InternalEObject oldScheduleInterval = (InternalEObject)scheduleInterval;
			scheduleInterval = (DateTimeInterval)eResolveProxy(oldScheduleInterval);
			if (scheduleInterval != oldScheduleInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, oldScheduleInterval, scheduleInterval));
			}
		}
		return scheduleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetScheduleInterval() {
		return scheduleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleInterval(DateTimeInterval newScheduleInterval) {
		DateTimeInterval oldScheduleInterval = scheduleInterval;
		scheduleInterval = newScheduleInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, oldScheduleInterval, scheduleInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		boolean oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_SCHEDULE__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRecurrencePeriod() {
		return recurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurrencePeriod(float newRecurrencePeriod) {
		float oldRecurrencePeriod = recurrencePeriod;
		recurrencePeriod = newRecurrencePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD, oldRecurrencePeriod, recurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimePoint> getTimePoints() {
		if (timePoints == null) {
			timePoints = new EObjectWithInverseResolvingEList<TimePoint>(TimePoint.class, this, CommonPackage.TIME_SCHEDULE__TIME_POINTS, CommonPackage.TIME_POINT__TIME_SCHEDULE);
		}
		return timePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(float newOffset) {
		float oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_SCHEDULE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimePoints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				return ((InternalEList<?>)getTimePoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
				return getRecurrencePattern();
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				if (resolve) return getScheduleInterval();
				return basicGetScheduleInterval();
			case CommonPackage.TIME_SCHEDULE__DISABLED:
				return isDisabled();
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
				return getRecurrencePeriod();
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				return getTimePoints();
			case CommonPackage.TIME_SCHEDULE__OFFSET:
				return getOffset();
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
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
				setRecurrencePattern((String)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				setScheduleInterval((DateTimeInterval)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
				setRecurrencePeriod((Float)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
				getTimePoints().addAll((Collection<? extends TimePoint>)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__OFFSET:
				setOffset((Float)newValue);
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
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
				setRecurrencePattern(RECURRENCE_PATTERN_EDEFAULT);
				return;
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				setScheduleInterval((DateTimeInterval)null);
				return;
			case CommonPackage.TIME_SCHEDULE__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
				setRecurrencePeriod(RECURRENCE_PERIOD_EDEFAULT);
				return;
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
				return;
			case CommonPackage.TIME_SCHEDULE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
				return RECURRENCE_PATTERN_EDEFAULT == null ? recurrencePattern != null : !RECURRENCE_PATTERN_EDEFAULT.equals(recurrencePattern);
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				return scheduleInterval != null;
			case CommonPackage.TIME_SCHEDULE__DISABLED:
				return disabled != DISABLED_EDEFAULT;
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
				return recurrencePeriod != RECURRENCE_PERIOD_EDEFAULT;
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				return timePoints != null && !timePoints.isEmpty();
			case CommonPackage.TIME_SCHEDULE__OFFSET:
				return offset != OFFSET_EDEFAULT;
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
		result.append(" (recurrencePattern: ");
		result.append(recurrencePattern);
		result.append(", disabled: ");
		result.append(disabled);
		result.append(", recurrencePeriod: ");
		result.append(recurrencePeriod);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //TimeScheduleImpl
