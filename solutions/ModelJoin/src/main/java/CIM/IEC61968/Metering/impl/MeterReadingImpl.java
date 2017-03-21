/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Common.DateTimeInterval;

import CIM.IEC61968.Customers.CustomerAgreement;
import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61968.Metering.EndDeviceEvent;
import CIM.IEC61968.Metering.IntervalBlock;
import CIM.IEC61968.Metering.MeterAsset;
import CIM.IEC61968.Metering.MeterReading;
import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.Reading;
import CIM.IEC61968.Metering.ServiceDeliveryPoint;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Meter Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.MeterReadingImpl#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.MeterReadingImpl#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.MeterReadingImpl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.MeterReadingImpl#getMeterAsset <em>Meter Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.MeterReadingImpl#getValuesInterval <em>Values Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.MeterReadingImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.MeterReadingImpl#getIntervalBlocks <em>Interval Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterReadingImpl extends IdentifiedObjectImpl implements MeterReading {
	/**
	 * The cached value of the '{@link #getEndDeviceEvents() <em>End Device Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceEvent> endDeviceEvents;

	/**
	 * The cached value of the '{@link #getServiceDeliveryPoint() <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 * @ordered
	 */
	protected ServiceDeliveryPoint serviceDeliveryPoint;

	/**
	 * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreement()
	 * @generated
	 * @ordered
	 */
	protected CustomerAgreement customerAgreement;

	/**
	 * The cached value of the '{@link #getMeterAsset() <em>Meter Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterAsset()
	 * @generated
	 * @ordered
	 */
	protected MeterAsset meterAsset;

	/**
	 * The cached value of the '{@link #getValuesInterval() <em>Values Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval valuesInterval;

	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Reading> readings;

	/**
	 * The cached value of the '{@link #getIntervalBlocks() <em>Interval Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<IntervalBlock> intervalBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.METER_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceEvent> getEndDeviceEvents() {
		if (endDeviceEvents == null) {
			endDeviceEvents = new EObjectWithInverseResolvingEList<EndDeviceEvent>(EndDeviceEvent.class, this, MeteringPackage.METER_READING__END_DEVICE_EVENTS, MeteringPackage.END_DEVICE_EVENT__METER_READING);
		}
		return endDeviceEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint getServiceDeliveryPoint() {
		if (serviceDeliveryPoint != null && serviceDeliveryPoint.eIsProxy()) {
			InternalEObject oldServiceDeliveryPoint = (InternalEObject)serviceDeliveryPoint;
			serviceDeliveryPoint = (ServiceDeliveryPoint)eResolveProxy(oldServiceDeliveryPoint);
			if (serviceDeliveryPoint != oldServiceDeliveryPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, serviceDeliveryPoint));
			}
		}
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint basicGetServiceDeliveryPoint() {
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint, NotificationChain msgs) {
		ServiceDeliveryPoint oldServiceDeliveryPoint = serviceDeliveryPoint;
		serviceDeliveryPoint = newServiceDeliveryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, newServiceDeliveryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint) {
		if (newServiceDeliveryPoint != serviceDeliveryPoint) {
			NotificationChain msgs = null;
			if (serviceDeliveryPoint != null)
				msgs = ((InternalEObject)serviceDeliveryPoint).eInverseRemove(this, MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS, ServiceDeliveryPoint.class, msgs);
			if (newServiceDeliveryPoint != null)
				msgs = ((InternalEObject)newServiceDeliveryPoint).eInverseAdd(this, MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS, ServiceDeliveryPoint.class, msgs);
			msgs = basicSetServiceDeliveryPoint(newServiceDeliveryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT, newServiceDeliveryPoint, newServiceDeliveryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement getCustomerAgreement() {
		if (customerAgreement != null && customerAgreement.eIsProxy()) {
			InternalEObject oldCustomerAgreement = (InternalEObject)customerAgreement;
			customerAgreement = (CustomerAgreement)eResolveProxy(oldCustomerAgreement);
			if (customerAgreement != oldCustomerAgreement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.METER_READING__CUSTOMER_AGREEMENT, oldCustomerAgreement, customerAgreement));
			}
		}
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement basicGetCustomerAgreement() {
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAgreement(CustomerAgreement newCustomerAgreement, NotificationChain msgs) {
		CustomerAgreement oldCustomerAgreement = customerAgreement;
		customerAgreement = newCustomerAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_READING__CUSTOMER_AGREEMENT, oldCustomerAgreement, newCustomerAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAgreement(CustomerAgreement newCustomerAgreement) {
		if (newCustomerAgreement != customerAgreement) {
			NotificationChain msgs = null;
			if (customerAgreement != null)
				msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs);
			if (newCustomerAgreement != null)
				msgs = ((InternalEObject)newCustomerAgreement).eInverseAdd(this, CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs);
			msgs = basicSetCustomerAgreement(newCustomerAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_READING__CUSTOMER_AGREEMENT, newCustomerAgreement, newCustomerAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset getMeterAsset() {
		if (meterAsset != null && meterAsset.eIsProxy()) {
			InternalEObject oldMeterAsset = (InternalEObject)meterAsset;
			meterAsset = (MeterAsset)eResolveProxy(oldMeterAsset);
			if (meterAsset != oldMeterAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.METER_READING__METER_ASSET, oldMeterAsset, meterAsset));
			}
		}
		return meterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset basicGetMeterAsset() {
		return meterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeterAsset(MeterAsset newMeterAsset, NotificationChain msgs) {
		MeterAsset oldMeterAsset = meterAsset;
		meterAsset = newMeterAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_READING__METER_ASSET, oldMeterAsset, newMeterAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeterAsset(MeterAsset newMeterAsset) {
		if (newMeterAsset != meterAsset) {
			NotificationChain msgs = null;
			if (meterAsset != null)
				msgs = ((InternalEObject)meterAsset).eInverseRemove(this, MeteringPackage.METER_ASSET__METER_READINGS, MeterAsset.class, msgs);
			if (newMeterAsset != null)
				msgs = ((InternalEObject)newMeterAsset).eInverseAdd(this, MeteringPackage.METER_ASSET__METER_READINGS, MeterAsset.class, msgs);
			msgs = basicSetMeterAsset(newMeterAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_READING__METER_ASSET, newMeterAsset, newMeterAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getValuesInterval() {
		if (valuesInterval != null && valuesInterval.eIsProxy()) {
			InternalEObject oldValuesInterval = (InternalEObject)valuesInterval;
			valuesInterval = (DateTimeInterval)eResolveProxy(oldValuesInterval);
			if (valuesInterval != oldValuesInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.METER_READING__VALUES_INTERVAL, oldValuesInterval, valuesInterval));
			}
		}
		return valuesInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetValuesInterval() {
		return valuesInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesInterval(DateTimeInterval newValuesInterval) {
		DateTimeInterval oldValuesInterval = valuesInterval;
		valuesInterval = newValuesInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.METER_READING__VALUES_INTERVAL, oldValuesInterval, valuesInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reading> getReadings() {
		if (readings == null) {
			readings = new EObjectWithInverseResolvingEList.ManyInverse<Reading>(Reading.class, this, MeteringPackage.METER_READING__READINGS, MeteringPackage.READING__METER_READINGS);
		}
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntervalBlock> getIntervalBlocks() {
		if (intervalBlocks == null) {
			intervalBlocks = new EObjectWithInverseResolvingEList<IntervalBlock>(IntervalBlock.class, this, MeteringPackage.METER_READING__INTERVAL_BLOCKS, MeteringPackage.INTERVAL_BLOCK__METER_READING);
		}
		return intervalBlocks;
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
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceEvents()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				if (serviceDeliveryPoint != null)
					msgs = ((InternalEObject)serviceDeliveryPoint).eInverseRemove(this, MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS, ServiceDeliveryPoint.class, msgs);
				return basicSetServiceDeliveryPoint((ServiceDeliveryPoint)otherEnd, msgs);
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				if (customerAgreement != null)
					msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs);
				return basicSetCustomerAgreement((CustomerAgreement)otherEnd, msgs);
			case MeteringPackage.METER_READING__METER_ASSET:
				if (meterAsset != null)
					msgs = ((InternalEObject)meterAsset).eInverseRemove(this, MeteringPackage.METER_ASSET__METER_READINGS, MeterAsset.class, msgs);
				return basicSetMeterAsset((MeterAsset)otherEnd, msgs);
			case MeteringPackage.METER_READING__READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervalBlocks()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				return ((InternalEList<?>)getEndDeviceEvents()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				return basicSetServiceDeliveryPoint(null, msgs);
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				return basicSetCustomerAgreement(null, msgs);
			case MeteringPackage.METER_READING__METER_ASSET:
				return basicSetMeterAsset(null, msgs);
			case MeteringPackage.METER_READING__READINGS:
				return ((InternalEList<?>)getReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				return ((InternalEList<?>)getIntervalBlocks()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				return getEndDeviceEvents();
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				if (resolve) return getServiceDeliveryPoint();
				return basicGetServiceDeliveryPoint();
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				if (resolve) return getCustomerAgreement();
				return basicGetCustomerAgreement();
			case MeteringPackage.METER_READING__METER_ASSET:
				if (resolve) return getMeterAsset();
				return basicGetMeterAsset();
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				if (resolve) return getValuesInterval();
				return basicGetValuesInterval();
			case MeteringPackage.METER_READING__READINGS:
				return getReadings();
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				return getIntervalBlocks();
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
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				getEndDeviceEvents().clear();
				getEndDeviceEvents().addAll((Collection<? extends EndDeviceEvent>)newValue);
				return;
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)newValue);
				return;
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)newValue);
				return;
			case MeteringPackage.METER_READING__METER_ASSET:
				setMeterAsset((MeterAsset)newValue);
				return;
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				setValuesInterval((DateTimeInterval)newValue);
				return;
			case MeteringPackage.METER_READING__READINGS:
				getReadings().clear();
				getReadings().addAll((Collection<? extends Reading>)newValue);
				return;
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				getIntervalBlocks().addAll((Collection<? extends IntervalBlock>)newValue);
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
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				getEndDeviceEvents().clear();
				return;
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)null);
				return;
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)null);
				return;
			case MeteringPackage.METER_READING__METER_ASSET:
				setMeterAsset((MeterAsset)null);
				return;
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				setValuesInterval((DateTimeInterval)null);
				return;
			case MeteringPackage.METER_READING__READINGS:
				getReadings().clear();
				return;
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
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
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				return endDeviceEvents != null && !endDeviceEvents.isEmpty();
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				return serviceDeliveryPoint != null;
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				return customerAgreement != null;
			case MeteringPackage.METER_READING__METER_ASSET:
				return meterAsset != null;
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				return valuesInterval != null;
			case MeteringPackage.METER_READING__READINGS:
				return readings != null && !readings.isEmpty();
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				return intervalBlocks != null && !intervalBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeterReadingImpl
