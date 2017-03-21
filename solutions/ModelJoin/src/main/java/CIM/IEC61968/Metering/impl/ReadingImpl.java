/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Metering.EndDeviceAsset;
import CIM.IEC61968.Metering.MeterReading;
import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.Reading;
import CIM.IEC61968.Metering.ReadingQuality;
import CIM.IEC61968.Metering.ReadingType;

import CIM.IEC61970.Meas.impl.MeasurementValueImpl;

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
 * An implementation of the model object '<em><b>Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingImpl#getEndDeviceAsset <em>End Device Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingImpl#getReadingQualities <em>Reading Qualities</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingImpl#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingImpl extends MeasurementValueImpl implements Reading {
	/**
	 * The cached value of the '{@link #getEndDeviceAsset() <em>End Device Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceAsset()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceAsset endDeviceAsset;

	/**
	 * The cached value of the '{@link #getReadingQualities() <em>Reading Qualities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadingQuality> readingQualities;

	/**
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadingType() <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingType()
	 * @generated
	 * @ordered
	 */
	protected ReadingType readingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceAsset getEndDeviceAsset() {
		if (endDeviceAsset != null && endDeviceAsset.eIsProxy()) {
			InternalEObject oldEndDeviceAsset = (InternalEObject)endDeviceAsset;
			endDeviceAsset = (EndDeviceAsset)eResolveProxy(oldEndDeviceAsset);
			if (endDeviceAsset != oldEndDeviceAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.READING__END_DEVICE_ASSET, oldEndDeviceAsset, endDeviceAsset));
			}
		}
		return endDeviceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceAsset basicGetEndDeviceAsset() {
		return endDeviceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceAsset(EndDeviceAsset newEndDeviceAsset, NotificationChain msgs) {
		EndDeviceAsset oldEndDeviceAsset = endDeviceAsset;
		endDeviceAsset = newEndDeviceAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.READING__END_DEVICE_ASSET, oldEndDeviceAsset, newEndDeviceAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDeviceAsset(EndDeviceAsset newEndDeviceAsset) {
		if (newEndDeviceAsset != endDeviceAsset) {
			NotificationChain msgs = null;
			if (endDeviceAsset != null)
				msgs = ((InternalEObject)endDeviceAsset).eInverseRemove(this, MeteringPackage.END_DEVICE_ASSET__READINGS, EndDeviceAsset.class, msgs);
			if (newEndDeviceAsset != null)
				msgs = ((InternalEObject)newEndDeviceAsset).eInverseAdd(this, MeteringPackage.END_DEVICE_ASSET__READINGS, EndDeviceAsset.class, msgs);
			msgs = basicSetEndDeviceAsset(newEndDeviceAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING__END_DEVICE_ASSET, newEndDeviceAsset, newEndDeviceAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadingQuality> getReadingQualities() {
		if (readingQualities == null) {
			readingQualities = new EObjectWithInverseResolvingEList<ReadingQuality>(ReadingQuality.class, this, MeteringPackage.READING__READING_QUALITIES, MeteringPackage.READING_QUALITY__READING);
		}
		return readingQualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new EObjectWithInverseResolvingEList.ManyInverse<MeterReading>(MeterReading.class, this, MeteringPackage.READING__METER_READINGS, MeteringPackage.METER_READING__READINGS);
		}
		return meterReadings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType getReadingType() {
		if (readingType != null && readingType.eIsProxy()) {
			InternalEObject oldReadingType = (InternalEObject)readingType;
			readingType = (ReadingType)eResolveProxy(oldReadingType);
			if (readingType != oldReadingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.READING__READING_TYPE, oldReadingType, readingType));
			}
		}
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType basicGetReadingType() {
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadingType(ReadingType newReadingType, NotificationChain msgs) {
		ReadingType oldReadingType = readingType;
		readingType = newReadingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.READING__READING_TYPE, oldReadingType, newReadingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingType(ReadingType newReadingType) {
		if (newReadingType != readingType) {
			NotificationChain msgs = null;
			if (readingType != null)
				msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__READINGS, ReadingType.class, msgs);
			if (newReadingType != null)
				msgs = ((InternalEObject)newReadingType).eInverseAdd(this, MeteringPackage.READING_TYPE__READINGS, ReadingType.class, msgs);
			msgs = basicSetReadingType(newReadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING__READING_TYPE, newReadingType, newReadingType));
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
			case MeteringPackage.READING__END_DEVICE_ASSET:
				if (endDeviceAsset != null)
					msgs = ((InternalEObject)endDeviceAsset).eInverseRemove(this, MeteringPackage.END_DEVICE_ASSET__READINGS, EndDeviceAsset.class, msgs);
				return basicSetEndDeviceAsset((EndDeviceAsset)otherEnd, msgs);
			case MeteringPackage.READING__READING_QUALITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadingQualities()).basicAdd(otherEnd, msgs);
			case MeteringPackage.READING__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.READING__READING_TYPE:
				if (readingType != null)
					msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__READINGS, ReadingType.class, msgs);
				return basicSetReadingType((ReadingType)otherEnd, msgs);
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
			case MeteringPackage.READING__END_DEVICE_ASSET:
				return basicSetEndDeviceAsset(null, msgs);
			case MeteringPackage.READING__READING_QUALITIES:
				return ((InternalEList<?>)getReadingQualities()).basicRemove(otherEnd, msgs);
			case MeteringPackage.READING__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.READING__READING_TYPE:
				return basicSetReadingType(null, msgs);
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
			case MeteringPackage.READING__END_DEVICE_ASSET:
				if (resolve) return getEndDeviceAsset();
				return basicGetEndDeviceAsset();
			case MeteringPackage.READING__READING_QUALITIES:
				return getReadingQualities();
			case MeteringPackage.READING__METER_READINGS:
				return getMeterReadings();
			case MeteringPackage.READING__VALUE:
				return getValue();
			case MeteringPackage.READING__READING_TYPE:
				if (resolve) return getReadingType();
				return basicGetReadingType();
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
			case MeteringPackage.READING__END_DEVICE_ASSET:
				setEndDeviceAsset((EndDeviceAsset)newValue);
				return;
			case MeteringPackage.READING__READING_QUALITIES:
				getReadingQualities().clear();
				getReadingQualities().addAll((Collection<? extends ReadingQuality>)newValue);
				return;
			case MeteringPackage.READING__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case MeteringPackage.READING__VALUE:
				setValue((Float)newValue);
				return;
			case MeteringPackage.READING__READING_TYPE:
				setReadingType((ReadingType)newValue);
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
			case MeteringPackage.READING__END_DEVICE_ASSET:
				setEndDeviceAsset((EndDeviceAsset)null);
				return;
			case MeteringPackage.READING__READING_QUALITIES:
				getReadingQualities().clear();
				return;
			case MeteringPackage.READING__METER_READINGS:
				getMeterReadings().clear();
				return;
			case MeteringPackage.READING__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeteringPackage.READING__READING_TYPE:
				setReadingType((ReadingType)null);
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
			case MeteringPackage.READING__END_DEVICE_ASSET:
				return endDeviceAsset != null;
			case MeteringPackage.READING__READING_QUALITIES:
				return readingQualities != null && !readingQualities.isEmpty();
			case MeteringPackage.READING__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case MeteringPackage.READING__VALUE:
				return value != VALUE_EDEFAULT;
			case MeteringPackage.READING__READING_TYPE:
				return readingType != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ReadingImpl
