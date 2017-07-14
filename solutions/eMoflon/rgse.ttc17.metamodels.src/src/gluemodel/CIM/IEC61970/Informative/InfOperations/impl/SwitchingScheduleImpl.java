/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingSchedule;
import gluemodel.CIM.IEC61970.Informative.InfOperations.SwitchingStep;

import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

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
 * An implementation of the model object '<em><b>Switching Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl#getScheduleSteps <em>Schedule Steps</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.SwitchingScheduleImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchingScheduleImpl extends DocumentImpl implements SwitchingSchedule {
	/**
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * The cached value of the '{@link #getScheduleSteps() <em>Schedule Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingStep> scheduleSteps;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval interval;

	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchingScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.SWITCHING_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask getWorkTask() {
		if (workTask != null && workTask.eIsProxy()) {
			InternalEObject oldWorkTask = (InternalEObject)workTask;
			workTask = (WorkTask)eResolveProxy(oldWorkTask);
			if (workTask != oldWorkTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK, oldWorkTask, workTask));
			}
		}
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask basicGetWorkTask() {
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTask(WorkTask newWorkTask, NotificationChain msgs) {
		WorkTask oldWorkTask = workTask;
		workTask = newWorkTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK, oldWorkTask, newWorkTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkTask(WorkTask newWorkTask) {
		if (newWorkTask != workTask) {
			NotificationChain msgs = null;
			if (workTask != null)
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK, newWorkTask, newWorkTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchingStep> getScheduleSteps() {
		if (scheduleSteps == null) {
			scheduleSteps = new EObjectWithInverseResolvingEList<SwitchingStep>(SwitchingStep.class, this, InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS, InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE);
		}
		return scheduleSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getInterval() {
		if (interval != null && interval.eIsProxy()) {
			InternalEObject oldInterval = (InternalEObject)interval;
			interval = (DateTimeInterval)eResolveProxy(oldInterval);
			if (interval != oldInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL, oldInterval, interval));
			}
		}
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(DateTimeInterval newInterval) {
		DateTimeInterval oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new EObjectWithInverseResolvingEList.ManyInverse<Crew>(Crew.class, this, InfOperationsPackage.SWITCHING_SCHEDULE__CREWS, InfWorkPackage.CREW__SWITCHING_SCHEDULES);
		}
		return crews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SWITCHING_SCHEDULE__REASON, oldReason, reason));
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduleSteps()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				return ((InternalEList<?>)getScheduleSteps()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				return getScheduleSteps();
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				if (resolve) return getInterval();
				return basicGetInterval();
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				return getCrews();
			case InfOperationsPackage.SWITCHING_SCHEDULE__REASON:
				return getReason();
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				getScheduleSteps().addAll((Collection<? extends SwitchingStep>)newValue);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				setInterval((DateTimeInterval)newValue);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__REASON:
				setReason((String)newValue);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				setInterval((DateTimeInterval)null);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				getCrews().clear();
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__REASON:
				setReason(REASON_EDEFAULT);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				return workTask != null;
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				return scheduleSteps != null && !scheduleSteps.isEmpty();
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				return interval != null;
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				return crews != null && !crews.isEmpty();
			case InfOperationsPackage.SWITCHING_SCHEDULE__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
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
		result.append(" (reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //SwitchingScheduleImpl
