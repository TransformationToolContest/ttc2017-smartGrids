/**
 */
package gluemodel.CIM.IEC61968.Customers.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.PricingStructure;
import gluemodel.CIM.IEC61968.Customers.RevenueKind;
import gluemodel.CIM.IEC61968.Customers.ServiceCategory;
import gluemodel.CIM.IEC61968.Customers.Tariff;

import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Transaction;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve;

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
 * An implementation of the model object '<em><b>Pricing Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#isTaxExemption <em>Tax Exemption</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getDailyFloorUsage <em>Daily Floor Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getRevenueKind <em>Revenue Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getPowerQualityPricings <em>Power Quality Pricings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getSubscribePowerCurve <em>Subscribe Power Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PricingStructureImpl extends DocumentImpl implements PricingStructure {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTaxExemption() <em>Tax Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxExemption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAX_EXEMPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTaxExemption() <em>Tax Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxExemption()
	 * @generated
	 * @ordered
	 */
	protected boolean taxExemption = TAX_EXEMPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected ServiceCategory serviceCategory;

	/**
	 * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAgreement> customerAgreements;

	/**
	 * The default value of the '{@link #getDailyFloorUsage() <em>Daily Floor Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyFloorUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAILY_FLOOR_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDailyFloorUsage() <em>Daily Floor Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyFloorUsage()
	 * @generated
	 * @ordered
	 */
	protected int dailyFloorUsage = DAILY_FLOOR_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevenueKind() <em>Revenue Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenueKind()
	 * @generated
	 * @ordered
	 */
	protected static final RevenueKind REVENUE_KIND_EDEFAULT = RevenueKind.COMMERCIAL;

	/**
	 * The cached value of the '{@link #getRevenueKind() <em>Revenue Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenueKind()
	 * @generated
	 * @ordered
	 */
	protected RevenueKind revenueKind = REVENUE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerQualityPricings() <em>Power Quality Pricings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerQualityPricings()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerQualityPricing> powerQualityPricings;

	/**
	 * The cached value of the '{@link #getTariffs() <em>Tariffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Tariff> tariffs;

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
	 * The default value of the '{@link #getDailyCeilingUsage() <em>Daily Ceiling Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyCeilingUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAILY_CEILING_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDailyCeilingUsage() <em>Daily Ceiling Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyCeilingUsage()
	 * @generated
	 * @ordered
	 */
	protected int dailyCeilingUsage = DAILY_CEILING_USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscribePowerCurve() <em>Subscribe Power Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribePowerCurve()
	 * @generated
	 * @ordered
	 */
	protected SubscribePowerCurve subscribePowerCurve;

	/**
	 * The default value of the '{@link #getDailyEstimatedUsage() <em>Daily Estimated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyEstimatedUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAILY_ESTIMATED_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDailyEstimatedUsage() <em>Daily Estimated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyEstimatedUsage()
	 * @generated
	 * @ordered
	 */
	protected int dailyEstimatedUsage = DAILY_ESTIMATED_USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PricingStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.PRICING_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTaxExemption() {
		return taxExemption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExemption(boolean newTaxExemption) {
		boolean oldTaxExemption = taxExemption;
		taxExemption = newTaxExemption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION, oldTaxExemption, taxExemption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory getServiceCategory() {
		if (serviceCategory != null && serviceCategory.eIsProxy()) {
			InternalEObject oldServiceCategory = (InternalEObject)serviceCategory;
			serviceCategory = (ServiceCategory)eResolveProxy(oldServiceCategory);
			if (serviceCategory != oldServiceCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
			}
		}
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory basicGetServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCategory(ServiceCategory newServiceCategory, NotificationChain msgs) {
		ServiceCategory oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCategory(ServiceCategory newServiceCategory) {
		if (newServiceCategory != serviceCategory) {
			NotificationChain msgs = null;
			if (serviceCategory != null)
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY, newServiceCategory, newServiceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new EObjectWithInverseResolvingEList.ManyInverse<CustomerAgreement>(CustomerAgreement.class, this, CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS, CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES);
		}
		return customerAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDailyFloorUsage() {
		return dailyFloorUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyFloorUsage(int newDailyFloorUsage) {
		int oldDailyFloorUsage = dailyFloorUsage;
		dailyFloorUsage = newDailyFloorUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE, oldDailyFloorUsage, dailyFloorUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevenueKind getRevenueKind() {
		return revenueKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenueKind(RevenueKind newRevenueKind) {
		RevenueKind oldRevenueKind = revenueKind;
		revenueKind = newRevenueKind == null ? REVENUE_KIND_EDEFAULT : newRevenueKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND, oldRevenueKind, revenueKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerQualityPricing> getPowerQualityPricings() {
		if (powerQualityPricings == null) {
			powerQualityPricings = new EObjectWithInverseResolvingEList<PowerQualityPricing>(PowerQualityPricing.class, this, CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS, InfCustomersPackage.POWER_QUALITY_PRICING__PRICING_STRUCTURE);
		}
		return powerQualityPricings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tariff> getTariffs() {
		if (tariffs == null) {
			tariffs = new EObjectWithInverseResolvingEList.ManyInverse<Tariff>(Tariff.class, this, CustomersPackage.PRICING_STRUCTURE__TARIFFS, CustomersPackage.TARIFF__PRICING_STRUCTURES);
		}
		return tariffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList.ManyInverse<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDailyCeilingUsage() {
		return dailyCeilingUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyCeilingUsage(int newDailyCeilingUsage) {
		int oldDailyCeilingUsage = dailyCeilingUsage;
		dailyCeilingUsage = newDailyCeilingUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE, oldDailyCeilingUsage, dailyCeilingUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribePowerCurve getSubscribePowerCurve() {
		if (subscribePowerCurve != null && subscribePowerCurve.eIsProxy()) {
			InternalEObject oldSubscribePowerCurve = (InternalEObject)subscribePowerCurve;
			subscribePowerCurve = (SubscribePowerCurve)eResolveProxy(oldSubscribePowerCurve);
			if (subscribePowerCurve != oldSubscribePowerCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE, oldSubscribePowerCurve, subscribePowerCurve));
			}
		}
		return subscribePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribePowerCurve basicGetSubscribePowerCurve() {
		return subscribePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribePowerCurve(SubscribePowerCurve newSubscribePowerCurve, NotificationChain msgs) {
		SubscribePowerCurve oldSubscribePowerCurve = subscribePowerCurve;
		subscribePowerCurve = newSubscribePowerCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE, oldSubscribePowerCurve, newSubscribePowerCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribePowerCurve(SubscribePowerCurve newSubscribePowerCurve) {
		if (newSubscribePowerCurve != subscribePowerCurve) {
			NotificationChain msgs = null;
			if (subscribePowerCurve != null)
				msgs = ((InternalEObject)subscribePowerCurve).eInverseRemove(this, InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE, SubscribePowerCurve.class, msgs);
			if (newSubscribePowerCurve != null)
				msgs = ((InternalEObject)newSubscribePowerCurve).eInverseAdd(this, InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE, SubscribePowerCurve.class, msgs);
			msgs = basicSetSubscribePowerCurve(newSubscribePowerCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE, newSubscribePowerCurve, newSubscribePowerCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDailyEstimatedUsage() {
		return dailyEstimatedUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyEstimatedUsage(int newDailyEstimatedUsage) {
		int oldDailyEstimatedUsage = dailyEstimatedUsage;
		dailyEstimatedUsage = newDailyEstimatedUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE, oldDailyEstimatedUsage, dailyEstimatedUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS, PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE);
		}
		return transactions;
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
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				if (serviceCategory != null)
					msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs);
				return basicSetServiceCategory((ServiceCategory)otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerQualityPricings()).basicAdd(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffs()).basicAdd(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE:
				if (subscribePowerCurve != null)
					msgs = ((InternalEObject)subscribePowerCurve).eInverseRemove(this, InfCustomersPackage.SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE, SubscribePowerCurve.class, msgs);
				return basicSetSubscribePowerCurve((SubscribePowerCurve)otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactions()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS:
				return ((InternalEList<?>)getPowerQualityPricings()).basicRemove(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				return ((InternalEList<?>)getTariffs()).basicRemove(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE:
				return basicSetSubscribePowerCurve(null, msgs);
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.PRICING_STRUCTURE__CODE:
				return getCode();
			case CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
				return isTaxExemption();
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				if (resolve) return getServiceCategory();
				return basicGetServiceCategory();
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
				return getDailyFloorUsage();
			case CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND:
				return getRevenueKind();
			case CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS:
				return getPowerQualityPricings();
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				return getTariffs();
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
				return getDailyCeilingUsage();
			case CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE:
				if (resolve) return getSubscribePowerCurve();
				return basicGetSubscribePowerCurve();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
				return getDailyEstimatedUsage();
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				return getTransactions();
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
			case CustomersPackage.PRICING_STRUCTURE__CODE:
				setCode((String)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
				setTaxExemption((Boolean)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
				setDailyFloorUsage((Integer)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND:
				setRevenueKind((RevenueKind)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS:
				getPowerQualityPricings().clear();
				getPowerQualityPricings().addAll((Collection<? extends PowerQualityPricing>)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				getTariffs().clear();
				getTariffs().addAll((Collection<? extends Tariff>)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
				setDailyCeilingUsage((Integer)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE:
				setSubscribePowerCurve((SubscribePowerCurve)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
				setDailyEstimatedUsage((Integer)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
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
			case CustomersPackage.PRICING_STRUCTURE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
				setTaxExemption(TAX_EXEMPTION_EDEFAULT);
				return;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)null);
				return;
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
				setDailyFloorUsage(DAILY_FLOOR_USAGE_EDEFAULT);
				return;
			case CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND:
				setRevenueKind(REVENUE_KIND_EDEFAULT);
				return;
			case CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS:
				getPowerQualityPricings().clear();
				return;
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				getTariffs().clear();
				return;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
				setDailyCeilingUsage(DAILY_CEILING_USAGE_EDEFAULT);
				return;
			case CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE:
				setSubscribePowerCurve((SubscribePowerCurve)null);
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
				setDailyEstimatedUsage(DAILY_ESTIMATED_USAGE_EDEFAULT);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				getTransactions().clear();
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
			case CustomersPackage.PRICING_STRUCTURE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
				return taxExemption != TAX_EXEMPTION_EDEFAULT;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				return serviceCategory != null;
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
				return dailyFloorUsage != DAILY_FLOOR_USAGE_EDEFAULT;
			case CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND:
				return revenueKind != REVENUE_KIND_EDEFAULT;
			case CustomersPackage.PRICING_STRUCTURE__POWER_QUALITY_PRICINGS:
				return powerQualityPricings != null && !powerQualityPricings.isEmpty();
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				return tariffs != null && !tariffs.isEmpty();
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
				return dailyCeilingUsage != DAILY_CEILING_USAGE_EDEFAULT;
			case CustomersPackage.PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE:
				return subscribePowerCurve != null;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
				return dailyEstimatedUsage != DAILY_ESTIMATED_USAGE_EDEFAULT;
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", taxExemption: ");
		result.append(taxExemption);
		result.append(", dailyFloorUsage: ");
		result.append(dailyFloorUsage);
		result.append(", revenueKind: ");
		result.append(revenueKind);
		result.append(", dailyCeilingUsage: ");
		result.append(dailyCeilingUsage);
		result.append(", dailyEstimatedUsage: ");
		result.append(dailyEstimatedUsage);
		result.append(')');
		return result.toString();
	}

} //PricingStructureImpl
