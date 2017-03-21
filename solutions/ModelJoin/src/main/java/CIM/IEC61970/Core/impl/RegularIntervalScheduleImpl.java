/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.RegularIntervalSchedule;
import CIM.IEC61970.Core.RegularTimePoint;

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
 * An implementation of the model object '<em><b>Regular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl#getTimePoints <em>Time Points</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegularIntervalScheduleImpl extends BasicIntervalScheduleImpl implements RegularIntervalSchedule {
	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected String endTime = END_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimePoints() <em>Time Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<RegularTimePoint> timePoints;

	/**
	 * The default value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_STEP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected float timeStep = TIME_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularIntervalScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REGULAR_INTERVAL_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(String newEndTime) {
		String oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularTimePoint> getTimePoints() {
		if (timePoints == null) {
			timePoints = new EObjectWithInverseResolvingEList<RegularTimePoint>(RegularTimePoint.class, this, CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS, CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE);
		}
		return timePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeStep() {
		return timeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStep(float newTimeStep) {
		float oldTimeStep = timeStep;
		timeStep = newTimeStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP, oldTimeStep, timeStep));
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
				return getEndTime();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return getTimePoints();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
				return getTimeStep();
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
				setEndTime((String)newValue);
				return;
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
				getTimePoints().addAll((Collection<? extends RegularTimePoint>)newValue);
				return;
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
				setTimeStep((Float)newValue);
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
				return;
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
				setTimeStep(TIME_STEP_EDEFAULT);
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return timePoints != null && !timePoints.isEmpty();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
				return timeStep != TIME_STEP_EDEFAULT;
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
		result.append(" (endTime: ");
		result.append(endTime);
		result.append(", timeStep: ");
		result.append(timeStep);
		result.append(')');
		return result.toString();
	}

} //RegularIntervalScheduleImpl
