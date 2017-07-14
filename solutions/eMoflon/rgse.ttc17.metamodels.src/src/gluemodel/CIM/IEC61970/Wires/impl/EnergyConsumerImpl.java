/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;
import gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic;
import gluemodel.CIM.IEC61970.LoadModel.PowerCutZone;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl#getPowerCutZone <em>Power Cut Zone</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl#getCustomerCount <em>Customer Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl#getLoadResponse <em>Load Response</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl#getPfixedPct <em>Pfixed Pct</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergyConsumerImpl#getQfixed <em>Qfixed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyConsumerImpl extends ConductingEquipmentImpl implements EnergyConsumer {
	/**
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * The cached value of the '{@link #getPowerCutZone() <em>Power Cut Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCutZone()
	 * @generated
	 * @ordered
	 */
	protected PowerCutZone powerCutZone;

	/**
	 * The default value of the '{@link #getPfixed() <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixed()
	 * @generated
	 * @ordered
	 */
	protected static final float PFIXED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPfixed() <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixed()
	 * @generated
	 * @ordered
	 */
	protected float pfixed = PFIXED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQfixedPct() <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixedPct()
	 * @generated
	 * @ordered
	 */
	protected static final float QFIXED_PCT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQfixedPct() <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixedPct()
	 * @generated
	 * @ordered
	 */
	protected float qfixedPct = QFIXED_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int customerCount = CUSTOMER_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadResponse() <em>Load Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadResponse()
	 * @generated
	 * @ordered
	 */
	protected LoadResponseCharacteristic loadResponse;

	/**
	 * The default value of the '{@link #getPfixedPct() <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixedPct()
	 * @generated
	 * @ordered
	 */
	protected static final float PFIXED_PCT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPfixedPct() <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixedPct()
	 * @generated
	 * @ordered
	 */
	protected float pfixedPct = PFIXED_PCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQfixed() <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixed()
	 * @generated
	 * @ordered
	 */
	protected static final float QFIXED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQfixed() <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixed()
	 * @generated
	 * @ordered
	 */
	protected float qfixed = QFIXED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.ENERGY_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCutZone getPowerCutZone() {
		if (powerCutZone != null && powerCutZone.eIsProxy()) {
			InternalEObject oldPowerCutZone = (InternalEObject)powerCutZone;
			powerCutZone = (PowerCutZone)eResolveProxy(oldPowerCutZone);
			if (powerCutZone != oldPowerCutZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE, oldPowerCutZone, powerCutZone));
			}
		}
		return powerCutZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCutZone basicGetPowerCutZone() {
		return powerCutZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerCutZone(PowerCutZone newPowerCutZone, NotificationChain msgs) {
		PowerCutZone oldPowerCutZone = powerCutZone;
		powerCutZone = newPowerCutZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE, oldPowerCutZone, newPowerCutZone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerCutZone(PowerCutZone newPowerCutZone) {
		if (newPowerCutZone != powerCutZone) {
			NotificationChain msgs = null;
			if (powerCutZone != null)
				msgs = ((InternalEObject)powerCutZone).eInverseRemove(this, LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs);
			if (newPowerCutZone != null)
				msgs = ((InternalEObject)newPowerCutZone).eInverseAdd(this, LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs);
			msgs = basicSetPowerCutZone(newPowerCutZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE, newPowerCutZone, newPowerCutZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPfixed() {
		return pfixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPfixed(float newPfixed) {
		float oldPfixed = pfixed;
		pfixed = newPfixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__PFIXED, oldPfixed, pfixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQfixedPct() {
		return qfixedPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQfixedPct(float newQfixedPct) {
		float oldQfixedPct = qfixedPct;
		qfixedPct = newQfixedPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__QFIXED_PCT, oldQfixedPct, qfixedPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerCount() {
		return customerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerCount(int newCustomerCount) {
		int oldCustomerCount = customerCount;
		customerCount = newCustomerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT, oldCustomerCount, customerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadResponseCharacteristic getLoadResponse() {
		if (loadResponse != null && loadResponse.eIsProxy()) {
			InternalEObject oldLoadResponse = (InternalEObject)loadResponse;
			loadResponse = (LoadResponseCharacteristic)eResolveProxy(oldLoadResponse);
			if (loadResponse != oldLoadResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE, oldLoadResponse, loadResponse));
			}
		}
		return loadResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadResponseCharacteristic basicGetLoadResponse() {
		return loadResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadResponse(LoadResponseCharacteristic newLoadResponse, NotificationChain msgs) {
		LoadResponseCharacteristic oldLoadResponse = loadResponse;
		loadResponse = newLoadResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE, oldLoadResponse, newLoadResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadResponse(LoadResponseCharacteristic newLoadResponse) {
		if (newLoadResponse != loadResponse) {
			NotificationChain msgs = null;
			if (loadResponse != null)
				msgs = ((InternalEObject)loadResponse).eInverseRemove(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
			if (newLoadResponse != null)
				msgs = ((InternalEObject)newLoadResponse).eInverseAdd(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
			msgs = basicSetLoadResponse(newLoadResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE, newLoadResponse, newLoadResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPfixedPct() {
		return pfixedPct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPfixedPct(float newPfixedPct) {
		float oldPfixedPct = pfixedPct;
		pfixedPct = newPfixedPct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__PFIXED_PCT, oldPfixedPct, pfixedPct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQfixed() {
		return qfixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQfixed(float newQfixed) {
		float oldQfixed = qfixed;
		qfixed = newQfixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_CONSUMER__QFIXED, oldQfixed, qfixed));
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
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				if (powerCutZone != null)
					msgs = ((InternalEObject)powerCutZone).eInverseRemove(this, LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs);
				return basicSetPowerCutZone((PowerCutZone)otherEnd, msgs);
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				if (loadResponse != null)
					msgs = ((InternalEObject)loadResponse).eInverseRemove(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
				return basicSetLoadResponse((LoadResponseCharacteristic)otherEnd, msgs);
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
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				return basicSetPowerCutZone(null, msgs);
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				return basicSetLoadResponse(null, msgs);
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
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				if (resolve) return getPowerCutZone();
				return basicGetPowerCutZone();
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				return getPfixed();
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				return getQfixedPct();
			case WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
				return getCustomerCount();
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				if (resolve) return getLoadResponse();
				return basicGetLoadResponse();
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				return getPfixedPct();
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				return getQfixed();
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
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				setPowerCutZone((PowerCutZone)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				setPfixed((Float)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				setQfixedPct((Float)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
				setCustomerCount((Integer)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				setLoadResponse((LoadResponseCharacteristic)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				setPfixedPct((Float)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				setQfixed((Float)newValue);
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
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				setPowerCutZone((PowerCutZone)null);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				setPfixed(PFIXED_EDEFAULT);
				return;
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				setQfixedPct(QFIXED_PCT_EDEFAULT);
				return;
			case WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
				setCustomerCount(CUSTOMER_COUNT_EDEFAULT);
				return;
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				setLoadResponse((LoadResponseCharacteristic)null);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				setPfixedPct(PFIXED_PCT_EDEFAULT);
				return;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				setQfixed(QFIXED_EDEFAULT);
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
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				return powerCutZone != null;
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				return pfixed != PFIXED_EDEFAULT;
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				return qfixedPct != QFIXED_PCT_EDEFAULT;
			case WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
				return customerCount != CUSTOMER_COUNT_EDEFAULT;
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				return loadResponse != null;
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				return pfixedPct != PFIXED_PCT_EDEFAULT;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				return qfixed != QFIXED_EDEFAULT;
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
		result.append(" (pfixed: ");
		result.append(pfixed);
		result.append(", qfixedPct: ");
		result.append(qfixedPct);
		result.append(", customerCount: ");
		result.append(customerCount);
		result.append(", pfixedPct: ");
		result.append(pfixedPct);
		result.append(", qfixed: ");
		result.append(qfixed);
		result.append(')');
		return result.toString();
	}

} //EnergyConsumerImpl
