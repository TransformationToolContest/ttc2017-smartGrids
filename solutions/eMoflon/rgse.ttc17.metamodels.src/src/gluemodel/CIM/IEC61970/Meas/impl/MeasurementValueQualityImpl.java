/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.MeasurementValue;
import gluemodel.CIM.IEC61970.Meas.MeasurementValueQuality;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Value Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementValueQualityImpl#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementValueQualityImpl extends Quality61850Impl implements MeasurementValueQuality {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementValueQualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.MEASUREMENT_VALUE_QUALITY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, oldMeasurementValue, measurementValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, oldMeasurementValue, newMeasurementValue);
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
				msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs);
			if (newMeasurementValue != null)
				msgs = ((InternalEObject)newMeasurementValue).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs);
			msgs = basicSetMeasurementValue(newMeasurementValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, newMeasurementValue, newMeasurementValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				if (measurementValue != null)
					msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				if (resolve) return getMeasurementValue();
				return basicGetMeasurementValue();
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)newValue);
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)null);
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				return measurementValue != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurementValueQualityImpl
