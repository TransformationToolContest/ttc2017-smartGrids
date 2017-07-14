/**
 */
package gluemodel.CIM.IEC61968.Customers.impl;

import gluemodel.CIM.IEC61968.Common.impl.AgreementImpl;

import gluemodel.CIM.IEC61968.Customers.Customer;
import gluemodel.CIM.IEC61968.Customers.CustomerAccount;
import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.PricingStructure;
import gluemodel.CIM.IEC61968.Customers.ServiceCategory;
import gluemodel.CIM.IEC61968.Customers.ServiceLocation;

import gluemodel.CIM.IEC61968.Metering.DemandResponseProgram;
import gluemodel.CIM.IEC61968.Metering.EndDeviceControl;
import gluemodel.CIM.IEC61968.Metering.MeterReading;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Equipment;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode;

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
 * An implementation of the model object '<em><b>Customer Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getStandardIndustryCode <em>Standard Industry Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getBillingCycle <em>Billing Cycle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getServiceLocations <em>Service Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getLoadMgmt <em>Load Mgmt</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getBudgetBill <em>Budget Bill</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl#getEquipments <em>Equipments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerAgreementImpl extends AgreementImpl implements CustomerAgreement {
	/**
	 * The cached value of the '{@link #getServiceSupplier() <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSupplier()
	 * @generated
	 * @ordered
	 */
	protected ServiceSupplier serviceSupplier;

	/**
	 * The cached value of the '{@link #getStandardIndustryCode() <em>Standard Industry Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardIndustryCode()
	 * @generated
	 * @ordered
	 */
	protected StandardIndustryCode standardIndustryCode;

	/**
	 * The default value of the '{@link #getBillingCycle() <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingCycle() <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCycle()
	 * @generated
	 * @ordered
	 */
	protected String billingCycle = BILLING_CYCLE_EDEFAULT;

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
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

	/**
	 * The cached value of the '{@link #getServiceLocations() <em>Service Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLocation> serviceLocations;

	/**
	 * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingStructure> pricingStructures;

	/**
	 * The default value of the '{@link #getLoadMgmt() <em>Load Mgmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmt()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_MGMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadMgmt() <em>Load Mgmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmt()
	 * @generated
	 * @ordered
	 */
	protected String loadMgmt = LOAD_MGMT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuxiliaryAgreements() <em>Auxiliary Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryAgreement> auxiliaryAgreements;

	/**
	 * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceControl> endDeviceControls;

	/**
	 * The default value of the '{@link #getBudgetBill() <em>Budget Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetBill()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_BILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBudgetBill() <em>Budget Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetBill()
	 * @generated
	 * @ordered
	 */
	protected String budgetBill = BUDGET_BILL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

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
	 * The cached value of the '{@link #getCustomerAccount() <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAccount()
	 * @generated
	 * @ordered
	 */
	protected CustomerAccount customerAccount;

	/**
	 * The cached value of the '{@link #getDemandResponseProgram() <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandResponseProgram()
	 * @generated
	 * @ordered
	 */
	protected DemandResponseProgram demandResponseProgram;

	/**
	 * The cached value of the '{@link #getEquipments() <em>Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<Equipment> equipments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerAgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.CUSTOMER_AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier getServiceSupplier() {
		if (serviceSupplier != null && serviceSupplier.eIsProxy()) {
			InternalEObject oldServiceSupplier = (InternalEObject)serviceSupplier;
			serviceSupplier = (ServiceSupplier)eResolveProxy(oldServiceSupplier);
			if (serviceSupplier != oldServiceSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER, oldServiceSupplier, serviceSupplier));
			}
		}
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier basicGetServiceSupplier() {
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSupplier(ServiceSupplier newServiceSupplier, NotificationChain msgs) {
		ServiceSupplier oldServiceSupplier = serviceSupplier;
		serviceSupplier = newServiceSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER, oldServiceSupplier, newServiceSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceSupplier(ServiceSupplier newServiceSupplier) {
		if (newServiceSupplier != serviceSupplier) {
			NotificationChain msgs = null;
			if (serviceSupplier != null)
				msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs);
			if (newServiceSupplier != null)
				msgs = ((InternalEObject)newServiceSupplier).eInverseAdd(this, PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs);
			msgs = basicSetServiceSupplier(newServiceSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER, newServiceSupplier, newServiceSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardIndustryCode getStandardIndustryCode() {
		if (standardIndustryCode != null && standardIndustryCode.eIsProxy()) {
			InternalEObject oldStandardIndustryCode = (InternalEObject)standardIndustryCode;
			standardIndustryCode = (StandardIndustryCode)eResolveProxy(oldStandardIndustryCode);
			if (standardIndustryCode != oldStandardIndustryCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE, oldStandardIndustryCode, standardIndustryCode));
			}
		}
		return standardIndustryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardIndustryCode basicGetStandardIndustryCode() {
		return standardIndustryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardIndustryCode(StandardIndustryCode newStandardIndustryCode, NotificationChain msgs) {
		StandardIndustryCode oldStandardIndustryCode = standardIndustryCode;
		standardIndustryCode = newStandardIndustryCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE, oldStandardIndustryCode, newStandardIndustryCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardIndustryCode(StandardIndustryCode newStandardIndustryCode) {
		if (newStandardIndustryCode != standardIndustryCode) {
			NotificationChain msgs = null;
			if (standardIndustryCode != null)
				msgs = ((InternalEObject)standardIndustryCode).eInverseRemove(this, InfCustomersPackage.STANDARD_INDUSTRY_CODE__CUSTOMER_AGREEMENTS, StandardIndustryCode.class, msgs);
			if (newStandardIndustryCode != null)
				msgs = ((InternalEObject)newStandardIndustryCode).eInverseAdd(this, InfCustomersPackage.STANDARD_INDUSTRY_CODE__CUSTOMER_AGREEMENTS, StandardIndustryCode.class, msgs);
			msgs = basicSetStandardIndustryCode(newStandardIndustryCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE, newStandardIndustryCode, newStandardIndustryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillingCycle() {
		return billingCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingCycle(String newBillingCycle) {
		String oldBillingCycle = billingCycle;
		billingCycle = newBillingCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE, oldBillingCycle, billingCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new EObjectWithInverseResolvingEList<MeterReading>(MeterReading.class, this, CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS, MeteringPackage.METER_READING__CUSTOMER_AGREEMENT);
		}
		return meterReadings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLocation> getServiceLocations() {
		if (serviceLocations == null) {
			serviceLocations = new EObjectWithInverseResolvingEList.ManyInverse<ServiceLocation>(ServiceLocation.class, this, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS, CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS);
		}
		return serviceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PricingStructure> getPricingStructures() {
		if (pricingStructures == null) {
			pricingStructures = new EObjectWithInverseResolvingEList.ManyInverse<PricingStructure>(PricingStructure.class, this, CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES, CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS);
		}
		return pricingStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoadMgmt() {
		return loadMgmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadMgmt(String newLoadMgmt) {
		String oldLoadMgmt = loadMgmt;
		loadMgmt = newLoadMgmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT, oldLoadMgmt, loadMgmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryAgreement> getAuxiliaryAgreements() {
		if (auxiliaryAgreements == null) {
			auxiliaryAgreements = new EObjectWithInverseResolvingEList<AuxiliaryAgreement>(AuxiliaryAgreement.class, this, CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT);
		}
		return auxiliaryAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceControl> getEndDeviceControls() {
		if (endDeviceControls == null) {
			endDeviceControls = new EObjectWithInverseResolvingEList<EndDeviceControl>(EndDeviceControl.class, this, CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS, MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT);
		}
		return endDeviceControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBudgetBill() {
		return budgetBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBudgetBill(String newBudgetBill) {
		String oldBudgetBill = budgetBill;
		budgetBill = newBudgetBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL, oldBudgetBill, budgetBill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER, newCustomer, newCustomer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory);
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
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS, ServiceCategory.class, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS, ServiceCategory.class, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY, newServiceCategory, newServiceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount getCustomerAccount() {
		if (customerAccount != null && customerAccount.eIsProxy()) {
			InternalEObject oldCustomerAccount = (InternalEObject)customerAccount;
			customerAccount = (CustomerAccount)eResolveProxy(oldCustomerAccount);
			if (customerAccount != oldCustomerAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT, oldCustomerAccount, customerAccount));
			}
		}
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount basicGetCustomerAccount() {
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAccount(CustomerAccount newCustomerAccount, NotificationChain msgs) {
		CustomerAccount oldCustomerAccount = customerAccount;
		customerAccount = newCustomerAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT, oldCustomerAccount, newCustomerAccount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAccount(CustomerAccount newCustomerAccount) {
		if (newCustomerAccount != customerAccount) {
			NotificationChain msgs = null;
			if (customerAccount != null)
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT, newCustomerAccount, newCustomerAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram getDemandResponseProgram() {
		if (demandResponseProgram != null && demandResponseProgram.eIsProxy()) {
			InternalEObject oldDemandResponseProgram = (InternalEObject)demandResponseProgram;
			demandResponseProgram = (DemandResponseProgram)eResolveProxy(oldDemandResponseProgram);
			if (demandResponseProgram != oldDemandResponseProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM, oldDemandResponseProgram, demandResponseProgram));
			}
		}
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram basicGetDemandResponseProgram() {
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandResponseProgram(DemandResponseProgram newDemandResponseProgram, NotificationChain msgs) {
		DemandResponseProgram oldDemandResponseProgram = demandResponseProgram;
		demandResponseProgram = newDemandResponseProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM, oldDemandResponseProgram, newDemandResponseProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandResponseProgram(DemandResponseProgram newDemandResponseProgram) {
		if (newDemandResponseProgram != demandResponseProgram) {
			NotificationChain msgs = null;
			if (demandResponseProgram != null)
				msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS, DemandResponseProgram.class, msgs);
			if (newDemandResponseProgram != null)
				msgs = ((InternalEObject)newDemandResponseProgram).eInverseAdd(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS, DemandResponseProgram.class, msgs);
			msgs = basicSetDemandResponseProgram(newDemandResponseProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM, newDemandResponseProgram, newDemandResponseProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equipment> getEquipments() {
		if (equipments == null) {
			equipments = new EObjectWithInverseResolvingEList.ManyInverse<Equipment>(Equipment.class, this, CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS, CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS);
		}
		return equipments;
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
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				if (serviceSupplier != null)
					msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs);
				return basicSetServiceSupplier((ServiceSupplier)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				if (standardIndustryCode != null)
					msgs = ((InternalEObject)standardIndustryCode).eInverseRemove(this, InfCustomersPackage.STANDARD_INDUSTRY_CODE__CUSTOMER_AGREEMENTS, StandardIndustryCode.class, msgs);
				return basicSetStandardIndustryCode((StandardIndustryCode)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceLocations()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPricingStructures()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceControls()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
				if (serviceCategory != null)
					msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS, ServiceCategory.class, msgs);
				return basicSetServiceCategory((ServiceCategory)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				if (demandResponseProgram != null)
					msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS, DemandResponseProgram.class, msgs);
				return basicSetDemandResponseProgram((DemandResponseProgram)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquipments()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				return basicSetServiceSupplier(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				return basicSetStandardIndustryCode(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				return ((InternalEList<?>)getServiceLocations()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				return ((InternalEList<?>)getPricingStructures()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				return ((InternalEList<?>)getAuxiliaryAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				return ((InternalEList<?>)getEndDeviceControls()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				return basicSetDemandResponseProgram(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				return ((InternalEList<?>)getEquipments()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				if (resolve) return getServiceSupplier();
				return basicGetServiceSupplier();
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				if (resolve) return getStandardIndustryCode();
				return basicGetStandardIndustryCode();
			case CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE:
				return getBillingCycle();
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				return getMeterReadings();
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				return getServiceLocations();
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				return getPricingStructures();
			case CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
				return getLoadMgmt();
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				return getAuxiliaryAgreements();
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				return getEndDeviceControls();
			case CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL:
				return getBudgetBill();
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
				if (resolve) return getServiceCategory();
				return basicGetServiceCategory();
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				if (resolve) return getDemandResponseProgram();
				return basicGetDemandResponseProgram();
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				return getEquipments();
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
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				setStandardIndustryCode((StandardIndustryCode)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE:
				setBillingCycle((String)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				getServiceLocations().clear();
				getServiceLocations().addAll((Collection<? extends ServiceLocation>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				getPricingStructures().clear();
				getPricingStructures().addAll((Collection<? extends PricingStructure>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
				setLoadMgmt((String)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				getAuxiliaryAgreements().clear();
				getAuxiliaryAgreements().addAll((Collection<? extends AuxiliaryAgreement>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				getEndDeviceControls().addAll((Collection<? extends EndDeviceControl>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL:
				setBudgetBill((String)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				getEquipments().clear();
				getEquipments().addAll((Collection<? extends Equipment>)newValue);
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
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				setStandardIndustryCode((StandardIndustryCode)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE:
				setBillingCycle(BILLING_CYCLE_EDEFAULT);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				getMeterReadings().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				getServiceLocations().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				getPricingStructures().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
				setLoadMgmt(LOAD_MGMT_EDEFAULT);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				getAuxiliaryAgreements().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL:
				setBudgetBill(BUDGET_BILL_EDEFAULT);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				getEquipments().clear();
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
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				return serviceSupplier != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				return standardIndustryCode != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE:
				return BILLING_CYCLE_EDEFAULT == null ? billingCycle != null : !BILLING_CYCLE_EDEFAULT.equals(billingCycle);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				return serviceLocations != null && !serviceLocations.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				return pricingStructures != null && !pricingStructures.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
				return LOAD_MGMT_EDEFAULT == null ? loadMgmt != null : !LOAD_MGMT_EDEFAULT.equals(loadMgmt);
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				return auxiliaryAgreements != null && !auxiliaryAgreements.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				return endDeviceControls != null && !endDeviceControls.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL:
				return BUDGET_BILL_EDEFAULT == null ? budgetBill != null : !BUDGET_BILL_EDEFAULT.equals(budgetBill);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				return customer != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
				return serviceCategory != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				return customerAccount != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				return demandResponseProgram != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				return equipments != null && !equipments.isEmpty();
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
		result.append(" (billingCycle: ");
		result.append(billingCycle);
		result.append(", loadMgmt: ");
		result.append(loadMgmt);
		result.append(", budgetBill: ");
		result.append(budgetBill);
		result.append(')');
		return result.toString();
	}

} //CustomerAgreementImpl
