/**
 */
package CIM.IEC61970.SCADA.impl;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.MeasurementValue;

import CIM.IEC61970.SCADA.RemoteSource;
import CIM.IEC61970.SCADA.SCADAPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteSourceImpl#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteSourceImpl#getSensorMinimum <em>Sensor Minimum</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteSourceImpl#getMeasurementValue <em>Measurement Value</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteSourceImpl#getScanInterval <em>Scan Interval</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteSourceImpl#getSensorMaximum <em>Sensor Maximum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteSourceImpl extends RemotePointImpl implements RemoteSource {
	/**
	 * The default value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadband()
	 * @generated
	 * @ordered
	 */
	protected static final float DEADBAND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadband()
	 * @generated
	 * @ordered
	 */
	protected float deadband = DEADBAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorMinimum() <em>Sensor Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final float SENSOR_MINIMUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSensorMinimum() <em>Sensor Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMinimum()
	 * @generated
	 * @ordered
	 */
	protected float sensorMinimum = SENSOR_MINIMUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValue()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue measurementValue;

	/**
	 * The default value of the '{@link #getScanInterval() <em>Scan Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float SCAN_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getScanInterval() <em>Scan Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanInterval()
	 * @generated
	 * @ordered
	 */
	protected float scanInterval = SCAN_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorMaximum() <em>Sensor Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final float SENSOR_MAXIMUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSensorMaximum() <em>Sensor Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMaximum()
	 * @generated
	 * @ordered
	 */
	protected float sensorMaximum = SENSOR_MAXIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.REMOTE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDeadband() {
		return deadband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadband(float newDeadband) {
		float oldDeadband = deadband;
		deadband = newDeadband;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_SOURCE__DEADBAND, oldDeadband, deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSensorMinimum() {
		return sensorMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorMinimum(float newSensorMinimum) {
		float oldSensorMinimum = sensorMinimum;
		sensorMinimum = newSensorMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM, oldSensorMinimum, sensorMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue getMeasurementValue() {
		if (measurementValue != null && measurementValue.eIsProxy()) {
			InternalEObject oldMeasurementValue = (InternalEObject)measurementValue;
			measurementValue = (MeasurementValue)eResolveProxy(oldMeasurementValue);
			if (measurementValue != oldMeasurementValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, oldMeasurementValue, measurementValue));
			}
		}
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue basicGetMeasurementValue() {
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValue(MeasurementValue newMeasurementValue, NotificationChain msgs) {
		MeasurementValue oldMeasurementValue = measurementValue;
		measurementValue = newMeasurementValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, oldMeasurementValue, newMeasurementValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementValue(MeasurementValue newMeasurementValue) {
		if (newMeasurementValue != measurementValue) {
			NotificationChain msgs = null;
			if (measurementValue != null)
				msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs);
			if (newMeasurementValue != null)
				msgs = ((InternalEObject)newMeasurementValue).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs);
			msgs = basicSetMeasurementValue(newMeasurementValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, newMeasurementValue, newMeasurementValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScanInterval() {
		return scanInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScanInterval(float newScanInterval) {
		float oldScanInterval = scanInterval;
		scanInterval = newScanInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL, oldScanInterval, scanInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSensorMaximum() {
		return sensorMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorMaximum(float newSensorMaximum) {
		float oldSensorMaximum = sensorMaximum;
		sensorMaximum = newSensorMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM, oldSensorMaximum, sensorMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				if (measurementValue != null)
					msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs);
				return basicSetMeasurementValue((MeasurementValue)otherEnd, msgs);
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
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				return basicSetMeasurementValue(null, msgs);
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
			case SCADAPackage.REMOTE_SOURCE__DEADBAND:
				return getDeadband();
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
				return getSensorMinimum();
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				if (resolve) return getMeasurementValue();
				return basicGetMeasurementValue();
			case SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL:
				return getScanInterval();
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
				return getSensorMaximum();
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
			case SCADAPackage.REMOTE_SOURCE__DEADBAND:
				setDeadband((Float)newValue);
				return;
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
				setSensorMinimum((Float)newValue);
				return;
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)newValue);
				return;
			case SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL:
				setScanInterval((Float)newValue);
				return;
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
				setSensorMaximum((Float)newValue);
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
			case SCADAPackage.REMOTE_SOURCE__DEADBAND:
				setDeadband(DEADBAND_EDEFAULT);
				return;
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
				setSensorMinimum(SENSOR_MINIMUM_EDEFAULT);
				return;
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)null);
				return;
			case SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL:
				setScanInterval(SCAN_INTERVAL_EDEFAULT);
				return;
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
				setSensorMaximum(SENSOR_MAXIMUM_EDEFAULT);
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
			case SCADAPackage.REMOTE_SOURCE__DEADBAND:
				return deadband != DEADBAND_EDEFAULT;
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
				return sensorMinimum != SENSOR_MINIMUM_EDEFAULT;
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				return measurementValue != null;
			case SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL:
				return scanInterval != SCAN_INTERVAL_EDEFAULT;
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
				return sensorMaximum != SENSOR_MAXIMUM_EDEFAULT;
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
		result.append(" (deadband: ");
		result.append(deadband);
		result.append(", sensorMinimum: ");
		result.append(sensorMinimum);
		result.append(", scanInterval: ");
		result.append(scanInterval);
		result.append(", sensorMaximum: ");
		result.append(sensorMaximum);
		result.append(')');
		return result.toString();
	}

} //RemoteSourceImpl
