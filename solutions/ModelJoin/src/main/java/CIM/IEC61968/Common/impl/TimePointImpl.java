/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.Status;
import CIM.IEC61968.Common.TimePoint;
import CIM.IEC61968.Common.TimeSchedule;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Time Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.TimePointImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimePointImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimePointImpl#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimePointImpl#getRelativeTimeInterval <em>Relative Time Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimePointImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimePointImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.TimePointImpl#getTimeSchedule <em>Time Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePointImpl extends IdentifiedObjectImpl implements TimePoint {
	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduledEvent> scheduledEvents;

	/**
	 * The default value of the '{@link #getRelativeTimeInterval() <em>Relative Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float RELATIVE_TIME_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRelativeTimeInterval() <em>Relative Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected float relativeTimeInterval = RELATIVE_TIME_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval window;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSchedule() <em>Time Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSchedule()
	 * @generated
	 * @ordered
	 */
	protected TimeSchedule timeSchedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TIME_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_POINT__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.TIME_POINT__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_POINT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduledEvent> getScheduledEvents() {
		if (scheduledEvents == null) {
			scheduledEvents = new EObjectWithInverseResolvingEList<ScheduledEvent>(ScheduledEvent.class, this, CommonPackage.TIME_POINT__SCHEDULED_EVENTS, InfCommonPackage.SCHEDULED_EVENT__TIME_POINT);
		}
		return scheduledEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRelativeTimeInterval() {
		return relativeTimeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeTimeInterval(float newRelativeTimeInterval) {
		float oldRelativeTimeInterval = relativeTimeInterval;
		relativeTimeInterval = newRelativeTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL, oldRelativeTimeInterval, relativeTimeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getWindow() {
		if (window != null && window.eIsProxy()) {
			InternalEObject oldWindow = (InternalEObject)window;
			window = (DateTimeInterval)eResolveProxy(oldWindow);
			if (window != oldWindow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.TIME_POINT__WINDOW, oldWindow, window));
			}
		}
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetWindow() {
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow(DateTimeInterval newWindow) {
		DateTimeInterval oldWindow = window;
		window = newWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_POINT__WINDOW, oldWindow, window));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_POINT__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSchedule getTimeSchedule() {
		if (timeSchedule != null && timeSchedule.eIsProxy()) {
			InternalEObject oldTimeSchedule = (InternalEObject)timeSchedule;
			timeSchedule = (TimeSchedule)eResolveProxy(oldTimeSchedule);
			if (timeSchedule != oldTimeSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.TIME_POINT__TIME_SCHEDULE, oldTimeSchedule, timeSchedule));
			}
		}
		return timeSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSchedule basicGetTimeSchedule() {
		return timeSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSchedule(TimeSchedule newTimeSchedule, NotificationChain msgs) {
		TimeSchedule oldTimeSchedule = timeSchedule;
		timeSchedule = newTimeSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_POINT__TIME_SCHEDULE, oldTimeSchedule, newTimeSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSchedule(TimeSchedule newTimeSchedule) {
		if (newTimeSchedule != timeSchedule) {
			NotificationChain msgs = null;
			if (timeSchedule != null)
				msgs = ((InternalEObject)timeSchedule).eInverseRemove(this, CommonPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs);
			if (newTimeSchedule != null)
				msgs = ((InternalEObject)newTimeSchedule).eInverseAdd(this, CommonPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs);
			msgs = basicSetTimeSchedule(newTimeSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TIME_POINT__TIME_SCHEDULE, newTimeSchedule, newTimeSchedule));
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
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledEvents()).basicAdd(otherEnd, msgs);
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				if (timeSchedule != null)
					msgs = ((InternalEObject)timeSchedule).eInverseRemove(this, CommonPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs);
				return basicSetTimeSchedule((TimeSchedule)otherEnd, msgs);
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
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				return ((InternalEList<?>)getScheduledEvents()).basicRemove(otherEnd, msgs);
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				return basicSetTimeSchedule(null, msgs);
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
			case CommonPackage.TIME_POINT__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CommonPackage.TIME_POINT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				return getScheduledEvents();
			case CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
				return getRelativeTimeInterval();
			case CommonPackage.TIME_POINT__WINDOW:
				if (resolve) return getWindow();
				return basicGetWindow();
			case CommonPackage.TIME_POINT__DATE_TIME:
				return getDateTime();
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				if (resolve) return getTimeSchedule();
				return basicGetTimeSchedule();
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
			case CommonPackage.TIME_POINT__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case CommonPackage.TIME_POINT__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				getScheduledEvents().addAll((Collection<? extends ScheduledEvent>)newValue);
				return;
			case CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
				setRelativeTimeInterval((Float)newValue);
				return;
			case CommonPackage.TIME_POINT__WINDOW:
				setWindow((DateTimeInterval)newValue);
				return;
			case CommonPackage.TIME_POINT__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				setTimeSchedule((TimeSchedule)newValue);
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
			case CommonPackage.TIME_POINT__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case CommonPackage.TIME_POINT__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				return;
			case CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
				setRelativeTimeInterval(RELATIVE_TIME_INTERVAL_EDEFAULT);
				return;
			case CommonPackage.TIME_POINT__WINDOW:
				setWindow((DateTimeInterval)null);
				return;
			case CommonPackage.TIME_POINT__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				setTimeSchedule((TimeSchedule)null);
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
			case CommonPackage.TIME_POINT__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case CommonPackage.TIME_POINT__STATUS:
				return status != null;
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				return scheduledEvents != null && !scheduledEvents.isEmpty();
			case CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
				return relativeTimeInterval != RELATIVE_TIME_INTERVAL_EDEFAULT;
			case CommonPackage.TIME_POINT__WINDOW:
				return window != null;
			case CommonPackage.TIME_POINT__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				return timeSchedule != null;
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
		result.append(" (sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", relativeTimeInterval: ");
		result.append(relativeTimeInterval);
		result.append(", dateTime: ");
		result.append(dateTime);
		result.append(')');
		return result.toString();
	}

} //TimePointImpl
