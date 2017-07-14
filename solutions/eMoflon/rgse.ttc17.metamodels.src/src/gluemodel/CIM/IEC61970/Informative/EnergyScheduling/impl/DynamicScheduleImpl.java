/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl;

import gluemodel.CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.Measurement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl#getDynSchedStatus <em>Dyn Sched Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl#getReceive_HostControlArea <em>Receive Host Control Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl#getSend_HostControlArea <em>Send Host Control Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.DynamicScheduleImpl#isDynSchedSignRev <em>Dyn Sched Sign Rev</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicScheduleImpl extends RegularIntervalScheduleImpl implements DynamicSchedule {
	/**
	 * The default value of the '{@link #getDynSchedStatus() <em>Dyn Sched Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynSchedStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String DYN_SCHED_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynSchedStatus() <em>Dyn Sched Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynSchedStatus()
	 * @generated
	 * @ordered
	 */
	protected String dynSchedStatus = DYN_SCHED_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceive_HostControlArea() <em>Receive Host Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive_HostControlArea()
	 * @generated
	 * @ordered
	 */
	protected HostControlArea receive_HostControlArea;

	/**
	 * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement()
	 * @generated
	 * @ordered
	 */
	protected Measurement measurement;

	/**
	 * The cached value of the '{@link #getSend_HostControlArea() <em>Send Host Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend_HostControlArea()
	 * @generated
	 * @ordered
	 */
	protected HostControlArea send_HostControlArea;

	/**
	 * The default value of the '{@link #isDynSchedSignRev() <em>Dyn Sched Sign Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynSchedSignRev()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYN_SCHED_SIGN_REV_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynSchedSignRev() <em>Dyn Sched Sign Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynSchedSignRev()
	 * @generated
	 * @ordered
	 */
	protected boolean dynSchedSignRev = DYN_SCHED_SIGN_REV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.DYNAMIC_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDynSchedStatus() {
		return dynSchedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynSchedStatus(String newDynSchedStatus) {
		String oldDynSchedStatus = dynSchedStatus;
		dynSchedStatus = newDynSchedStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_STATUS, oldDynSchedStatus, dynSchedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea getReceive_HostControlArea() {
		if (receive_HostControlArea != null && receive_HostControlArea.eIsProxy()) {
			InternalEObject oldReceive_HostControlArea = (InternalEObject)receive_HostControlArea;
			receive_HostControlArea = (HostControlArea)eResolveProxy(oldReceive_HostControlArea);
			if (receive_HostControlArea != oldReceive_HostControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA, oldReceive_HostControlArea, receive_HostControlArea));
			}
		}
		return receive_HostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea basicGetReceive_HostControlArea() {
		return receive_HostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceive_HostControlArea(HostControlArea newReceive_HostControlArea, NotificationChain msgs) {
		HostControlArea oldReceive_HostControlArea = receive_HostControlArea;
		receive_HostControlArea = newReceive_HostControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA, oldReceive_HostControlArea, newReceive_HostControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceive_HostControlArea(HostControlArea newReceive_HostControlArea) {
		if (newReceive_HostControlArea != receive_HostControlArea) {
			NotificationChain msgs = null;
			if (receive_HostControlArea != null)
				msgs = ((InternalEObject)receive_HostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES, HostControlArea.class, msgs);
			if (newReceive_HostControlArea != null)
				msgs = ((InternalEObject)newReceive_HostControlArea).eInverseAdd(this, EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES, HostControlArea.class, msgs);
			msgs = basicSetReceive_HostControlArea(newReceive_HostControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA, newReceive_HostControlArea, newReceive_HostControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getMeasurement() {
		if (measurement != null && measurement.eIsProxy()) {
			InternalEObject oldMeasurement = (InternalEObject)measurement;
			measurement = (Measurement)eResolveProxy(oldMeasurement);
			if (measurement != oldMeasurement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT, oldMeasurement, measurement));
			}
		}
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement basicGetMeasurement() {
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurement(Measurement newMeasurement, NotificationChain msgs) {
		Measurement oldMeasurement = measurement;
		measurement = newMeasurement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT, oldMeasurement, newMeasurement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurement(Measurement newMeasurement) {
		if (newMeasurement != measurement) {
			NotificationChain msgs = null;
			if (measurement != null)
				msgs = ((InternalEObject)measurement).eInverseRemove(this, MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES, Measurement.class, msgs);
			if (newMeasurement != null)
				msgs = ((InternalEObject)newMeasurement).eInverseAdd(this, MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES, Measurement.class, msgs);
			msgs = basicSetMeasurement(newMeasurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT, newMeasurement, newMeasurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea getSend_HostControlArea() {
		if (send_HostControlArea != null && send_HostControlArea.eIsProxy()) {
			InternalEObject oldSend_HostControlArea = (InternalEObject)send_HostControlArea;
			send_HostControlArea = (HostControlArea)eResolveProxy(oldSend_HostControlArea);
			if (send_HostControlArea != oldSend_HostControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA, oldSend_HostControlArea, send_HostControlArea));
			}
		}
		return send_HostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea basicGetSend_HostControlArea() {
		return send_HostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSend_HostControlArea(HostControlArea newSend_HostControlArea, NotificationChain msgs) {
		HostControlArea oldSend_HostControlArea = send_HostControlArea;
		send_HostControlArea = newSend_HostControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA, oldSend_HostControlArea, newSend_HostControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend_HostControlArea(HostControlArea newSend_HostControlArea) {
		if (newSend_HostControlArea != send_HostControlArea) {
			NotificationChain msgs = null;
			if (send_HostControlArea != null)
				msgs = ((InternalEObject)send_HostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES, HostControlArea.class, msgs);
			if (newSend_HostControlArea != null)
				msgs = ((InternalEObject)newSend_HostControlArea).eInverseAdd(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES, HostControlArea.class, msgs);
			msgs = basicSetSend_HostControlArea(newSend_HostControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA, newSend_HostControlArea, newSend_HostControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynSchedSignRev() {
		return dynSchedSignRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynSchedSignRev(boolean newDynSchedSignRev) {
		boolean oldDynSchedSignRev = dynSchedSignRev;
		dynSchedSignRev = newDynSchedSignRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_SIGN_REV, oldDynSchedSignRev, dynSchedSignRev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA:
				if (receive_HostControlArea != null)
					msgs = ((InternalEObject)receive_HostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__RECEIVE_DYNAMIC_SCHEDULES, HostControlArea.class, msgs);
				return basicSetReceive_HostControlArea((HostControlArea)otherEnd, msgs);
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT:
				if (measurement != null)
					msgs = ((InternalEObject)measurement).eInverseRemove(this, MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES, Measurement.class, msgs);
				return basicSetMeasurement((Measurement)otherEnd, msgs);
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA:
				if (send_HostControlArea != null)
					msgs = ((InternalEObject)send_HostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__SEND_DYNAMIC_SCHEDULES, HostControlArea.class, msgs);
				return basicSetSend_HostControlArea((HostControlArea)otherEnd, msgs);
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
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA:
				return basicSetReceive_HostControlArea(null, msgs);
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT:
				return basicSetMeasurement(null, msgs);
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA:
				return basicSetSend_HostControlArea(null, msgs);
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
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_STATUS:
				return getDynSchedStatus();
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA:
				if (resolve) return getReceive_HostControlArea();
				return basicGetReceive_HostControlArea();
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT:
				if (resolve) return getMeasurement();
				return basicGetMeasurement();
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA:
				if (resolve) return getSend_HostControlArea();
				return basicGetSend_HostControlArea();
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_SIGN_REV:
				return isDynSchedSignRev();
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
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_STATUS:
				setDynSchedStatus((String)newValue);
				return;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA:
				setReceive_HostControlArea((HostControlArea)newValue);
				return;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT:
				setMeasurement((Measurement)newValue);
				return;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA:
				setSend_HostControlArea((HostControlArea)newValue);
				return;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_SIGN_REV:
				setDynSchedSignRev((Boolean)newValue);
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
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_STATUS:
				setDynSchedStatus(DYN_SCHED_STATUS_EDEFAULT);
				return;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA:
				setReceive_HostControlArea((HostControlArea)null);
				return;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT:
				setMeasurement((Measurement)null);
				return;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA:
				setSend_HostControlArea((HostControlArea)null);
				return;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_SIGN_REV:
				setDynSchedSignRev(DYN_SCHED_SIGN_REV_EDEFAULT);
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
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_STATUS:
				return DYN_SCHED_STATUS_EDEFAULT == null ? dynSchedStatus != null : !DYN_SCHED_STATUS_EDEFAULT.equals(dynSchedStatus);
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__RECEIVE_HOST_CONTROL_AREA:
				return receive_HostControlArea != null;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT:
				return measurement != null;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__SEND_HOST_CONTROL_AREA:
				return send_HostControlArea != null;
			case EnergySchedulingPackage.DYNAMIC_SCHEDULE__DYN_SCHED_SIGN_REV:
				return dynSchedSignRev != DYN_SCHED_SIGN_REV_EDEFAULT;
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
		result.append(" (dynSchedStatus: ");
		result.append(dynSchedStatus);
		result.append(", dynSchedSignRev: ");
		result.append(dynSchedSignRev);
		result.append(')');
		return result.toString();
	}

} //DynamicScheduleImpl
