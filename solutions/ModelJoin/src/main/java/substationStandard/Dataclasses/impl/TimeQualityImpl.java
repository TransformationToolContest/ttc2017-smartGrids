/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.TimeQuality;

import substationStandard.Enumerations.TimeAccuracyKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.impl.TimeQualityImpl#isLeapSecondsKnown <em>Leap Seconds Known</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.TimeQualityImpl#isClockFailure <em>Clock Failure</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.TimeQualityImpl#isClockNotSynchronized <em>Clock Not Synchronized</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.impl.TimeQualityImpl#getTimeAccuracy <em>Time Accuracy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeQualityImpl extends MinimalEObjectImpl.Container implements TimeQuality {
	/**
	 * The default value of the '{@link #isLeapSecondsKnown() <em>Leap Seconds Known</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeapSecondsKnown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEAP_SECONDS_KNOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeapSecondsKnown() <em>Leap Seconds Known</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeapSecondsKnown()
	 * @generated
	 * @ordered
	 */
	protected boolean leapSecondsKnown = LEAP_SECONDS_KNOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #isClockFailure() <em>Clock Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOCK_FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClockFailure() <em>Clock Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean clockFailure = CLOCK_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isClockNotSynchronized() <em>Clock Not Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockNotSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOCK_NOT_SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClockNotSynchronized() <em>Clock Not Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockNotSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean clockNotSynchronized = CLOCK_NOT_SYNCHRONIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeAccuracy() <em>Time Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final TimeAccuracyKind TIME_ACCURACY_EDEFAULT = TimeAccuracyKind.T0;

	/**
	 * The cached value of the '{@link #getTimeAccuracy() <em>Time Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAccuracy()
	 * @generated
	 * @ordered
	 */
	protected TimeAccuracyKind timeAccuracy = TIME_ACCURACY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeQualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.TIME_QUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeapSecondsKnown() {
		return leapSecondsKnown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeapSecondsKnown(boolean newLeapSecondsKnown) {
		boolean oldLeapSecondsKnown = leapSecondsKnown;
		leapSecondsKnown = newLeapSecondsKnown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.TIME_QUALITY__LEAP_SECONDS_KNOWN, oldLeapSecondsKnown, leapSecondsKnown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClockFailure() {
		return clockFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockFailure(boolean newClockFailure) {
		boolean oldClockFailure = clockFailure;
		clockFailure = newClockFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.TIME_QUALITY__CLOCK_FAILURE, oldClockFailure, clockFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClockNotSynchronized() {
		return clockNotSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockNotSynchronized(boolean newClockNotSynchronized) {
		boolean oldClockNotSynchronized = clockNotSynchronized;
		clockNotSynchronized = newClockNotSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.TIME_QUALITY__CLOCK_NOT_SYNCHRONIZED, oldClockNotSynchronized, clockNotSynchronized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAccuracyKind getTimeAccuracy() {
		return timeAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAccuracy(TimeAccuracyKind newTimeAccuracy) {
		TimeAccuracyKind oldTimeAccuracy = timeAccuracy;
		timeAccuracy = newTimeAccuracy == null ? TIME_ACCURACY_EDEFAULT : newTimeAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.TIME_QUALITY__TIME_ACCURACY, oldTimeAccuracy, timeAccuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.TIME_QUALITY__LEAP_SECONDS_KNOWN:
				return isLeapSecondsKnown();
			case DataclassesPackage.TIME_QUALITY__CLOCK_FAILURE:
				return isClockFailure();
			case DataclassesPackage.TIME_QUALITY__CLOCK_NOT_SYNCHRONIZED:
				return isClockNotSynchronized();
			case DataclassesPackage.TIME_QUALITY__TIME_ACCURACY:
				return getTimeAccuracy();
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
			case DataclassesPackage.TIME_QUALITY__LEAP_SECONDS_KNOWN:
				setLeapSecondsKnown((Boolean)newValue);
				return;
			case DataclassesPackage.TIME_QUALITY__CLOCK_FAILURE:
				setClockFailure((Boolean)newValue);
				return;
			case DataclassesPackage.TIME_QUALITY__CLOCK_NOT_SYNCHRONIZED:
				setClockNotSynchronized((Boolean)newValue);
				return;
			case DataclassesPackage.TIME_QUALITY__TIME_ACCURACY:
				setTimeAccuracy((TimeAccuracyKind)newValue);
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
			case DataclassesPackage.TIME_QUALITY__LEAP_SECONDS_KNOWN:
				setLeapSecondsKnown(LEAP_SECONDS_KNOWN_EDEFAULT);
				return;
			case DataclassesPackage.TIME_QUALITY__CLOCK_FAILURE:
				setClockFailure(CLOCK_FAILURE_EDEFAULT);
				return;
			case DataclassesPackage.TIME_QUALITY__CLOCK_NOT_SYNCHRONIZED:
				setClockNotSynchronized(CLOCK_NOT_SYNCHRONIZED_EDEFAULT);
				return;
			case DataclassesPackage.TIME_QUALITY__TIME_ACCURACY:
				setTimeAccuracy(TIME_ACCURACY_EDEFAULT);
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
			case DataclassesPackage.TIME_QUALITY__LEAP_SECONDS_KNOWN:
				return leapSecondsKnown != LEAP_SECONDS_KNOWN_EDEFAULT;
			case DataclassesPackage.TIME_QUALITY__CLOCK_FAILURE:
				return clockFailure != CLOCK_FAILURE_EDEFAULT;
			case DataclassesPackage.TIME_QUALITY__CLOCK_NOT_SYNCHRONIZED:
				return clockNotSynchronized != CLOCK_NOT_SYNCHRONIZED_EDEFAULT;
			case DataclassesPackage.TIME_QUALITY__TIME_ACCURACY:
				return timeAccuracy != TIME_ACCURACY_EDEFAULT;
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
		result.append(" (leapSecondsKnown: ");
		result.append(leapSecondsKnown);
		result.append(", clockFailure: ");
		result.append(clockFailure);
		result.append(", clockNotSynchronized: ");
		result.append(clockNotSynchronized);
		result.append(", timeAccuracy: ");
		result.append(timeAccuracy);
		result.append(')');
		return result.toString();
	}

} //TimeQualityImpl
