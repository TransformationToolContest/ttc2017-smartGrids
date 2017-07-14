/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Common.impl.ActivityRecordImpl;

import gluemodel.CIM.IEC61968.Metering.DeviceFunction;
import gluemodel.CIM.IEC61968.Metering.EndDeviceEvent;
import gluemodel.CIM.IEC61968.Metering.MeterReading;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceEventImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceEventImpl#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceEventImpl#getDeviceFunction <em>Device Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceEventImpl extends ActivityRecordImpl implements EndDeviceEvent {
	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeterReading() <em>Meter Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReading()
	 * @generated
	 * @ordered
	 */
	protected MeterReading meterReading;

	/**
	 * The cached value of the '{@link #getDeviceFunction() <em>Device Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFunction()
	 * @generated
	 * @ordered
	 */
	protected DeviceFunction deviceFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_EVENT__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterReading getMeterReading() {
		if (meterReading != null && meterReading.eIsProxy()) {
			InternalEObject oldMeterReading = (InternalEObject)meterReading;
			meterReading = (MeterReading)eResolveProxy(oldMeterReading);
			if (meterReading != oldMeterReading) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_EVENT__METER_READING, oldMeterReading, meterReading));
			}
		}
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterReading basicGetMeterReading() {
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeterReading(MeterReading newMeterReading, NotificationChain msgs) {
		MeterReading oldMeterReading = meterReading;
		meterReading = newMeterReading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_EVENT__METER_READING, oldMeterReading, newMeterReading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeterReading(MeterReading newMeterReading) {
		if (newMeterReading != meterReading) {
			NotificationChain msgs = null;
			if (meterReading != null)
				msgs = ((InternalEObject)meterReading).eInverseRemove(this, MeteringPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs);
			if (newMeterReading != null)
				msgs = ((InternalEObject)newMeterReading).eInverseAdd(this, MeteringPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs);
			msgs = basicSetMeterReading(newMeterReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_EVENT__METER_READING, newMeterReading, newMeterReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFunction getDeviceFunction() {
		if (deviceFunction != null && deviceFunction.eIsProxy()) {
			InternalEObject oldDeviceFunction = (InternalEObject)deviceFunction;
			deviceFunction = (DeviceFunction)eResolveProxy(oldDeviceFunction);
			if (deviceFunction != oldDeviceFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION, oldDeviceFunction, deviceFunction));
			}
		}
		return deviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFunction basicGetDeviceFunction() {
		return deviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceFunction(DeviceFunction newDeviceFunction, NotificationChain msgs) {
		DeviceFunction oldDeviceFunction = deviceFunction;
		deviceFunction = newDeviceFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION, oldDeviceFunction, newDeviceFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceFunction(DeviceFunction newDeviceFunction) {
		if (newDeviceFunction != deviceFunction) {
			NotificationChain msgs = null;
			if (deviceFunction != null)
				msgs = ((InternalEObject)deviceFunction).eInverseRemove(this, MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS, DeviceFunction.class, msgs);
			if (newDeviceFunction != null)
				msgs = ((InternalEObject)newDeviceFunction).eInverseAdd(this, MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS, DeviceFunction.class, msgs);
			msgs = basicSetDeviceFunction(newDeviceFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION, newDeviceFunction, newDeviceFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				if (meterReading != null)
					msgs = ((InternalEObject)meterReading).eInverseRemove(this, MeteringPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs);
				return basicSetMeterReading((MeterReading)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION:
				if (deviceFunction != null)
					msgs = ((InternalEObject)deviceFunction).eInverseRemove(this, MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS, DeviceFunction.class, msgs);
				return basicSetDeviceFunction((DeviceFunction)otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				return basicSetMeterReading(null, msgs);
			case MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION:
				return basicSetDeviceFunction(null, msgs);
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
			case MeteringPackage.END_DEVICE_EVENT__USER_ID:
				return getUserID();
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				if (resolve) return getMeterReading();
				return basicGetMeterReading();
			case MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION:
				if (resolve) return getDeviceFunction();
				return basicGetDeviceFunction();
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
			case MeteringPackage.END_DEVICE_EVENT__USER_ID:
				setUserID((String)newValue);
				return;
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				setMeterReading((MeterReading)newValue);
				return;
			case MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION:
				setDeviceFunction((DeviceFunction)newValue);
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
			case MeteringPackage.END_DEVICE_EVENT__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				setMeterReading((MeterReading)null);
				return;
			case MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION:
				setDeviceFunction((DeviceFunction)null);
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
			case MeteringPackage.END_DEVICE_EVENT__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				return meterReading != null;
			case MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION:
				return deviceFunction != null;
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
		result.append(" (userID: ");
		result.append(userID);
		result.append(')');
		return result.toString();
	}

} //EndDeviceEventImpl
