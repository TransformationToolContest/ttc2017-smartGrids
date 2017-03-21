/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Metering.IntervalBlock;
import CIM.IEC61968.Metering.IntervalReading;
import CIM.IEC61968.Metering.MeterReading;
import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.Pending;
import CIM.IEC61968.Metering.ReadingType;

import CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Interval Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.IntervalBlockImpl#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.IntervalBlockImpl#getIntervalReadings <em>Interval Readings</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.IntervalBlockImpl#getPending <em>Pending</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.IntervalBlockImpl#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalBlockImpl extends ElementImpl implements IntervalBlock {
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
	 * The cached value of the '{@link #getIntervalReadings() <em>Interval Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<IntervalReading> intervalReadings;

	/**
	 * The cached value of the '{@link #getPending() <em>Pending</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPending()
	 * @generated
	 * @ordered
	 */
	protected Pending pending;

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
	protected IntervalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.INTERVAL_BLOCK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.INTERVAL_BLOCK__METER_READING, oldMeterReading, meterReading));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.INTERVAL_BLOCK__METER_READING, oldMeterReading, newMeterReading);
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
				msgs = ((InternalEObject)meterReading).eInverseRemove(this, MeteringPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs);
			if (newMeterReading != null)
				msgs = ((InternalEObject)newMeterReading).eInverseAdd(this, MeteringPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs);
			msgs = basicSetMeterReading(newMeterReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.INTERVAL_BLOCK__METER_READING, newMeterReading, newMeterReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntervalReading> getIntervalReadings() {
		if (intervalReadings == null) {
			intervalReadings = new EObjectWithInverseResolvingEList.ManyInverse<IntervalReading>(IntervalReading.class, this, MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS, MeteringPackage.INTERVAL_READING__INTERVAL_BLOCKS);
		}
		return intervalReadings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pending getPending() {
		if (pending != null && pending.eIsProxy()) {
			InternalEObject oldPending = (InternalEObject)pending;
			pending = (Pending)eResolveProxy(oldPending);
			if (pending != oldPending) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.INTERVAL_BLOCK__PENDING, oldPending, pending));
			}
		}
		return pending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pending basicGetPending() {
		return pending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPending(Pending newPending, NotificationChain msgs) {
		Pending oldPending = pending;
		pending = newPending;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.INTERVAL_BLOCK__PENDING, oldPending, newPending);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPending(Pending newPending) {
		if (newPending != pending) {
			NotificationChain msgs = null;
			if (pending != null)
				msgs = ((InternalEObject)pending).eInverseRemove(this, MeteringPackage.PENDING__INTERVAL_BLOCKS, Pending.class, msgs);
			if (newPending != null)
				msgs = ((InternalEObject)newPending).eInverseAdd(this, MeteringPackage.PENDING__INTERVAL_BLOCKS, Pending.class, msgs);
			msgs = basicSetPending(newPending, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.INTERVAL_BLOCK__PENDING, newPending, newPending));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.INTERVAL_BLOCK__READING_TYPE, oldReadingType, readingType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.INTERVAL_BLOCK__READING_TYPE, oldReadingType, newReadingType);
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
				msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs);
			if (newReadingType != null)
				msgs = ((InternalEObject)newReadingType).eInverseAdd(this, MeteringPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs);
			msgs = basicSetReadingType(newReadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.INTERVAL_BLOCK__READING_TYPE, newReadingType, newReadingType));
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
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				if (meterReading != null)
					msgs = ((InternalEObject)meterReading).eInverseRemove(this, MeteringPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs);
				return basicSetMeterReading((MeterReading)otherEnd, msgs);
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervalReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.INTERVAL_BLOCK__PENDING:
				if (pending != null)
					msgs = ((InternalEObject)pending).eInverseRemove(this, MeteringPackage.PENDING__INTERVAL_BLOCKS, Pending.class, msgs);
				return basicSetPending((Pending)otherEnd, msgs);
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
				if (readingType != null)
					msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs);
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
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				return basicSetMeterReading(null, msgs);
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				return ((InternalEList<?>)getIntervalReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.INTERVAL_BLOCK__PENDING:
				return basicSetPending(null, msgs);
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
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
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				if (resolve) return getMeterReading();
				return basicGetMeterReading();
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				return getIntervalReadings();
			case MeteringPackage.INTERVAL_BLOCK__PENDING:
				if (resolve) return getPending();
				return basicGetPending();
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
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
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				setMeterReading((MeterReading)newValue);
				return;
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				getIntervalReadings().clear();
				getIntervalReadings().addAll((Collection<? extends IntervalReading>)newValue);
				return;
			case MeteringPackage.INTERVAL_BLOCK__PENDING:
				setPending((Pending)newValue);
				return;
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
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
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				setMeterReading((MeterReading)null);
				return;
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				getIntervalReadings().clear();
				return;
			case MeteringPackage.INTERVAL_BLOCK__PENDING:
				setPending((Pending)null);
				return;
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
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
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				return meterReading != null;
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				return intervalReadings != null && !intervalReadings.isEmpty();
			case MeteringPackage.INTERVAL_BLOCK__PENDING:
				return pending != null;
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
				return readingType != null;
		}
		return super.eIsSet(featureID);
	}

} //IntervalBlockImpl
