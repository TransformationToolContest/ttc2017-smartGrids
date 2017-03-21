/**
 */
package CIM.IEC61970.Informative.InfCustomers.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.Customers.CustomersPackage;
import CIM.IEC61968.Customers.PricingStructure;

import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.ServiceDeliveryPoint;

import CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing;

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
 * An implementation of the model object '<em><b>Power Quality Pricing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getPricingStructure <em>Pricing Structure</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getValueUninterruptedServiceEnergy <em>Value Uninterrupted Service Energy</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getVoltImbalanceViolCost <em>Volt Imbalance Viol Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getVoltLimitViolCost <em>Volt Limit Viol Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getEmergencyLowVoltLimit <em>Emergency Low Volt Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getValueUninterruptedServiceP <em>Value Uninterrupted Service P</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getEmergencyHighVoltLimit <em>Emergency High Volt Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getPowerFactorMin <em>Power Factor Min</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getNormalLowVoltLimit <em>Normal Low Volt Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl#getNormalHighVoltLimit <em>Normal High Volt Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerQualityPricingImpl extends DocumentImpl implements PowerQualityPricing {
	/**
	 * The cached value of the '{@link #getPricingStructure() <em>Pricing Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructure()
	 * @generated
	 * @ordered
	 */
	protected PricingStructure pricingStructure;

	/**
	 * The default value of the '{@link #getValueUninterruptedServiceEnergy() <em>Value Uninterrupted Service Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUninterruptedServiceEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_UNINTERRUPTED_SERVICE_ENERGY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValueUninterruptedServiceEnergy() <em>Value Uninterrupted Service Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUninterruptedServiceEnergy()
	 * @generated
	 * @ordered
	 */
	protected float valueUninterruptedServiceEnergy = VALUE_UNINTERRUPTED_SERVICE_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltImbalanceViolCost() <em>Volt Imbalance Viol Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltImbalanceViolCost()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLT_IMBALANCE_VIOL_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltImbalanceViolCost() <em>Volt Imbalance Viol Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltImbalanceViolCost()
	 * @generated
	 * @ordered
	 */
	protected float voltImbalanceViolCost = VOLT_IMBALANCE_VIOL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltLimitViolCost() <em>Volt Limit Viol Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltLimitViolCost()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLT_LIMIT_VIOL_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltLimitViolCost() <em>Volt Limit Viol Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltLimitViolCost()
	 * @generated
	 * @ordered
	 */
	protected float voltLimitViolCost = VOLT_LIMIT_VIOL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmergencyLowVoltLimit() <em>Emergency Low Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyLowVoltLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float EMERGENCY_LOW_VOLT_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmergencyLowVoltLimit() <em>Emergency Low Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyLowVoltLimit()
	 * @generated
	 * @ordered
	 */
	protected float emergencyLowVoltLimit = EMERGENCY_LOW_VOLT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueUninterruptedServiceP() <em>Value Uninterrupted Service P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUninterruptedServiceP()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_UNINTERRUPTED_SERVICE_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValueUninterruptedServiceP() <em>Value Uninterrupted Service P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUninterruptedServiceP()
	 * @generated
	 * @ordered
	 */
	protected float valueUninterruptedServiceP = VALUE_UNINTERRUPTED_SERVICE_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmergencyHighVoltLimit() <em>Emergency High Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyHighVoltLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float EMERGENCY_HIGH_VOLT_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmergencyHighVoltLimit() <em>Emergency High Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyHighVoltLimit()
	 * @generated
	 * @ordered
	 */
	protected float emergencyHighVoltLimit = EMERGENCY_HIGH_VOLT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerFactorMin() <em>Power Factor Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorMin()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_FACTOR_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPowerFactorMin() <em>Power Factor Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorMin()
	 * @generated
	 * @ordered
	 */
	protected float powerFactorMin = POWER_FACTOR_MIN_EDEFAULT;

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
	 * The default value of the '{@link #getNormalLowVoltLimit() <em>Normal Low Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalLowVoltLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_LOW_VOLT_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalLowVoltLimit() <em>Normal Low Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalLowVoltLimit()
	 * @generated
	 * @ordered
	 */
	protected float normalLowVoltLimit = NORMAL_LOW_VOLT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalHighVoltLimit() <em>Normal High Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalHighVoltLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_HIGH_VOLT_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalHighVoltLimit() <em>Normal High Volt Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalHighVoltLimit()
	 * @generated
	 * @ordered
	 */
	protected float normalHighVoltLimit = NORMAL_HIGH_VOLT_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerQualityPricingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.POWER_QUALITY_PRICING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingStructure getPricingStructure() {
		if (pricingStructure != null && pricingStructure.eIsProxy()) {
			InternalEObject oldPricingStructure = (InternalEObject)pricingStructure;
			pricingStructure = (PricingStructure)eResolveProxy(oldPricingStructure);
			if (pricingStructure != oldPricingStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE, oldPricingStructure, pricingStructure));
			}
		}
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingStructure basicGetPricingStructure() {
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPricingStructure(PricingStructure newPricingStructure, NotificationChain msgs) {
		PricingStructure oldPricingStructure = pricingStructure;
		pricingStructure = newPricingStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE, oldPricingStructure, newPricingStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricingStructure(PricingStructure newPricingStructure) {
		if (newPricingStructure != pricingStructure) {
			NotificationChain msgs = null;
			if (pricingStructure != null)
				msgs = ((InternalEObject)pricingStructure).eInverseRemove(this, CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS, PricingStructure.class, msgs);
			if (newPricingStructure != null)
				msgs = ((InternalEObject)newPricingStructure).eInverseAdd(this, CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS, PricingStructure.class, msgs);
			msgs = basicSetPricingStructure(newPricingStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE, newPricingStructure, newPricingStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValueUninterruptedServiceEnergy() {
		return valueUninterruptedServiceEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueUninterruptedServiceEnergy(float newValueUninterruptedServiceEnergy) {
		float oldValueUninterruptedServiceEnergy = valueUninterruptedServiceEnergy;
		valueUninterruptedServiceEnergy = newValueUninterruptedServiceEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_ENERGY, oldValueUninterruptedServiceEnergy, valueUninterruptedServiceEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltImbalanceViolCost() {
		return voltImbalanceViolCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltImbalanceViolCost(float newVoltImbalanceViolCost) {
		float oldVoltImbalanceViolCost = voltImbalanceViolCost;
		voltImbalanceViolCost = newVoltImbalanceViolCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_IMBALANCE_VIOL_COST, oldVoltImbalanceViolCost, voltImbalanceViolCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltLimitViolCost() {
		return voltLimitViolCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltLimitViolCost(float newVoltLimitViolCost) {
		float oldVoltLimitViolCost = voltLimitViolCost;
		voltLimitViolCost = newVoltLimitViolCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_LIMIT_VIOL_COST, oldVoltLimitViolCost, voltLimitViolCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEmergencyLowVoltLimit() {
		return emergencyLowVoltLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmergencyLowVoltLimit(float newEmergencyLowVoltLimit) {
		float oldEmergencyLowVoltLimit = emergencyLowVoltLimit;
		emergencyLowVoltLimit = newEmergencyLowVoltLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_LOW_VOLT_LIMIT, oldEmergencyLowVoltLimit, emergencyLowVoltLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValueUninterruptedServiceP() {
		return valueUninterruptedServiceP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueUninterruptedServiceP(float newValueUninterruptedServiceP) {
		float oldValueUninterruptedServiceP = valueUninterruptedServiceP;
		valueUninterruptedServiceP = newValueUninterruptedServiceP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_P, oldValueUninterruptedServiceP, valueUninterruptedServiceP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEmergencyHighVoltLimit() {
		return emergencyHighVoltLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmergencyHighVoltLimit(float newEmergencyHighVoltLimit) {
		float oldEmergencyHighVoltLimit = emergencyHighVoltLimit;
		emergencyHighVoltLimit = newEmergencyHighVoltLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_HIGH_VOLT_LIMIT, oldEmergencyHighVoltLimit, emergencyHighVoltLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPowerFactorMin() {
		return powerFactorMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerFactorMin(float newPowerFactorMin) {
		float oldPowerFactorMin = powerFactorMin;
		powerFactorMin = newPowerFactorMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__POWER_FACTOR_MIN, oldPowerFactorMin, powerFactorMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList.ManyInverse<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, InfCustomersPackage.POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormalLowVoltLimit() {
		return normalLowVoltLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalLowVoltLimit(float newNormalLowVoltLimit) {
		float oldNormalLowVoltLimit = normalLowVoltLimit;
		normalLowVoltLimit = newNormalLowVoltLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_LOW_VOLT_LIMIT, oldNormalLowVoltLimit, normalLowVoltLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormalHighVoltLimit() {
		return normalHighVoltLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalHighVoltLimit(float newNormalHighVoltLimit) {
		float oldNormalHighVoltLimit = normalHighVoltLimit;
		normalHighVoltLimit = newNormalHighVoltLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_HIGH_VOLT_LIMIT, oldNormalHighVoltLimit, normalHighVoltLimit));
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
			case InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE:
				if (pricingStructure != null)
					msgs = ((InternalEObject)pricingStructure).eInverseRemove(this, CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS, PricingStructure.class, msgs);
				return basicSetPricingStructure((PricingStructure)otherEnd, msgs);
			case InfCustomersPackage.POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
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
			case InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE:
				return basicSetPricingStructure(null, msgs);
			case InfCustomersPackage.POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
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
			case InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE:
				if (resolve) return getPricingStructure();
				return basicGetPricingStructure();
			case InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_ENERGY:
				return getValueUninterruptedServiceEnergy();
			case InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_IMBALANCE_VIOL_COST:
				return getVoltImbalanceViolCost();
			case InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_LIMIT_VIOL_COST:
				return getVoltLimitViolCost();
			case InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_LOW_VOLT_LIMIT:
				return getEmergencyLowVoltLimit();
			case InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_P:
				return getValueUninterruptedServiceP();
			case InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_HIGH_VOLT_LIMIT:
				return getEmergencyHighVoltLimit();
			case InfCustomersPackage.POWER_QUALITY_PRICING__POWER_FACTOR_MIN:
				return getPowerFactorMin();
			case InfCustomersPackage.POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_LOW_VOLT_LIMIT:
				return getNormalLowVoltLimit();
			case InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_HIGH_VOLT_LIMIT:
				return getNormalHighVoltLimit();
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
			case InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE:
				setPricingStructure((PricingStructure)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_ENERGY:
				setValueUninterruptedServiceEnergy((Float)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_IMBALANCE_VIOL_COST:
				setVoltImbalanceViolCost((Float)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_LIMIT_VIOL_COST:
				setVoltLimitViolCost((Float)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_LOW_VOLT_LIMIT:
				setEmergencyLowVoltLimit((Float)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_P:
				setValueUninterruptedServiceP((Float)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_HIGH_VOLT_LIMIT:
				setEmergencyHighVoltLimit((Float)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__POWER_FACTOR_MIN:
				setPowerFactorMin((Float)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_LOW_VOLT_LIMIT:
				setNormalLowVoltLimit((Float)newValue);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_HIGH_VOLT_LIMIT:
				setNormalHighVoltLimit((Float)newValue);
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
			case InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE:
				setPricingStructure((PricingStructure)null);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_ENERGY:
				setValueUninterruptedServiceEnergy(VALUE_UNINTERRUPTED_SERVICE_ENERGY_EDEFAULT);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_IMBALANCE_VIOL_COST:
				setVoltImbalanceViolCost(VOLT_IMBALANCE_VIOL_COST_EDEFAULT);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_LIMIT_VIOL_COST:
				setVoltLimitViolCost(VOLT_LIMIT_VIOL_COST_EDEFAULT);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_LOW_VOLT_LIMIT:
				setEmergencyLowVoltLimit(EMERGENCY_LOW_VOLT_LIMIT_EDEFAULT);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_P:
				setValueUninterruptedServiceP(VALUE_UNINTERRUPTED_SERVICE_P_EDEFAULT);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_HIGH_VOLT_LIMIT:
				setEmergencyHighVoltLimit(EMERGENCY_HIGH_VOLT_LIMIT_EDEFAULT);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__POWER_FACTOR_MIN:
				setPowerFactorMin(POWER_FACTOR_MIN_EDEFAULT);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_LOW_VOLT_LIMIT:
				setNormalLowVoltLimit(NORMAL_LOW_VOLT_LIMIT_EDEFAULT);
				return;
			case InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_HIGH_VOLT_LIMIT:
				setNormalHighVoltLimit(NORMAL_HIGH_VOLT_LIMIT_EDEFAULT);
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
			case InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE:
				return pricingStructure != null;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_ENERGY:
				return valueUninterruptedServiceEnergy != VALUE_UNINTERRUPTED_SERVICE_ENERGY_EDEFAULT;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_IMBALANCE_VIOL_COST:
				return voltImbalanceViolCost != VOLT_IMBALANCE_VIOL_COST_EDEFAULT;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VOLT_LIMIT_VIOL_COST:
				return voltLimitViolCost != VOLT_LIMIT_VIOL_COST_EDEFAULT;
			case InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_LOW_VOLT_LIMIT:
				return emergencyLowVoltLimit != EMERGENCY_LOW_VOLT_LIMIT_EDEFAULT;
			case InfCustomersPackage.POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_P:
				return valueUninterruptedServiceP != VALUE_UNINTERRUPTED_SERVICE_P_EDEFAULT;
			case InfCustomersPackage.POWER_QUALITY_PRICING__EMERGENCY_HIGH_VOLT_LIMIT:
				return emergencyHighVoltLimit != EMERGENCY_HIGH_VOLT_LIMIT_EDEFAULT;
			case InfCustomersPackage.POWER_QUALITY_PRICING__POWER_FACTOR_MIN:
				return powerFactorMin != POWER_FACTOR_MIN_EDEFAULT;
			case InfCustomersPackage.POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_LOW_VOLT_LIMIT:
				return normalLowVoltLimit != NORMAL_LOW_VOLT_LIMIT_EDEFAULT;
			case InfCustomersPackage.POWER_QUALITY_PRICING__NORMAL_HIGH_VOLT_LIMIT:
				return normalHighVoltLimit != NORMAL_HIGH_VOLT_LIMIT_EDEFAULT;
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
		result.append(" (valueUninterruptedServiceEnergy: ");
		result.append(valueUninterruptedServiceEnergy);
		result.append(", voltImbalanceViolCost: ");
		result.append(voltImbalanceViolCost);
		result.append(", voltLimitViolCost: ");
		result.append(voltLimitViolCost);
		result.append(", emergencyLowVoltLimit: ");
		result.append(emergencyLowVoltLimit);
		result.append(", valueUninterruptedServiceP: ");
		result.append(valueUninterruptedServiceP);
		result.append(", emergencyHighVoltLimit: ");
		result.append(emergencyHighVoltLimit);
		result.append(", powerFactorMin: ");
		result.append(powerFactorMin);
		result.append(", normalLowVoltLimit: ");
		result.append(normalLowVoltLimit);
		result.append(", normalHighVoltLimit: ");
		result.append(normalHighVoltLimit);
		result.append(')');
		return result.toString();
	}

} //PowerQualityPricingImpl
