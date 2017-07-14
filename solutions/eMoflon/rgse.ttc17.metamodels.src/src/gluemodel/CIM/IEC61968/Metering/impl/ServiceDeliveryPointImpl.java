/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.PricingStructure;
import gluemodel.CIM.IEC61968.Customers.ServiceCategory;
import gluemodel.CIM.IEC61968.Customers.ServiceLocation;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeterReading;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.SDPLocation;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.PhaseCode;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing;

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
 * An implementation of the model object '<em><b>Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getPowerQualityPricings <em>Power Quality Pricings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getRatedPower <em>Rated Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getEnergyConsumer <em>Energy Consumer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#isGrounded <em>Grounded</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getNominalServiceVoltage <em>Nominal Service Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getEstimatedLoad <em>Estimated Load</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getEndDeviceAssets <em>End Device Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getServicePriority <em>Service Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getSDPLocations <em>SDP Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getServiceDeliveryRemark <em>Service Delivery Remark</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#isCheckBilling <em>Check Billing</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl#getCtptReference <em>Ctpt Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDeliveryPointImpl extends IdentifiedObjectImpl implements ServiceDeliveryPoint {
	/**
	 * The cached value of the '{@link #getServiceLocation() <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLocation()
	 * @generated
	 * @ordered
	 */
	protected ServiceLocation serviceLocation;

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
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.ABC;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedPower() <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPower()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedPower() <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPower()
	 * @generated
	 * @ordered
	 */
	protected float ratedPower = RATED_POWER_EDEFAULT;

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
	 * The cached value of the '{@link #getEnergyConsumer() <em>Energy Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumer()
	 * @generated
	 * @ordered
	 */
	protected EnergyConsumer energyConsumer;

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
	 * The default value of the '{@link #isGrounded() <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUNDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrounded() <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrounded()
	 * @generated
	 * @ordered
	 */
	protected boolean grounded = GROUNDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratedCurrent = RATED_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalServiceVoltage() <em>Nominal Service Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalServiceVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final int NOMINAL_SERVICE_VOLTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNominalServiceVoltage() <em>Nominal Service Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalServiceVoltage()
	 * @generated
	 * @ordered
	 */
	protected int nominalServiceVoltage = NOMINAL_SERVICE_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedLoad() <em>Estimated Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final float ESTIMATED_LOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstimatedLoad() <em>Estimated Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedLoad()
	 * @generated
	 * @ordered
	 */
	protected float estimatedLoad = ESTIMATED_LOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndDeviceAssets() <em>End Device Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceAsset> endDeviceAssets;

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
	 * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingStructure> pricingStructures;

	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected DistributionTransformer transformer;

	/**
	 * The default value of the '{@link #getServicePriority() <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePriority()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServicePriority() <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePriority()
	 * @generated
	 * @ordered
	 */
	protected String servicePriority = SERVICE_PRIORITY_EDEFAULT;

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
	 * The cached value of the '{@link #getSDPLocations() <em>SDP Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDPLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<SDPLocation> sdpLocations;

	/**
	 * The default value of the '{@link #getServiceDeliveryRemark() <em>Service Delivery Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DELIVERY_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDeliveryRemark() <em>Service Delivery Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryRemark()
	 * @generated
	 * @ordered
	 */
	protected String serviceDeliveryRemark = SERVICE_DELIVERY_REMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckBilling() <em>Check Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckBilling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_BILLING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckBilling() <em>Check Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckBilling()
	 * @generated
	 * @ordered
	 */
	protected boolean checkBilling = CHECK_BILLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCtptReference() <em>Ctpt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtptReference()
	 * @generated
	 * @ordered
	 */
	protected static final int CTPT_REFERENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCtptReference() <em>Ctpt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtptReference()
	 * @generated
	 * @ordered
	 */
	protected int ctptReference = CTPT_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDeliveryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.SERVICE_DELIVERY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation getServiceLocation() {
		if (serviceLocation != null && serviceLocation.eIsProxy()) {
			InternalEObject oldServiceLocation = (InternalEObject)serviceLocation;
			serviceLocation = (ServiceLocation)eResolveProxy(oldServiceLocation);
			if (serviceLocation != oldServiceLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION, oldServiceLocation, serviceLocation));
			}
		}
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation basicGetServiceLocation() {
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLocation(ServiceLocation newServiceLocation, NotificationChain msgs) {
		ServiceLocation oldServiceLocation = serviceLocation;
		serviceLocation = newServiceLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION, oldServiceLocation, newServiceLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLocation(ServiceLocation newServiceLocation) {
		if (newServiceLocation != serviceLocation) {
			NotificationChain msgs = null;
			if (serviceLocation != null)
				msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS, ServiceLocation.class, msgs);
			if (newServiceLocation != null)
				msgs = ((InternalEObject)newServiceLocation).eInverseAdd(this, CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS, ServiceLocation.class, msgs);
			msgs = basicSetServiceLocation(newServiceLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION, newServiceLocation, newServiceLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerQualityPricing> getPowerQualityPricings() {
		if (powerQualityPricings == null) {
			powerQualityPricings = new EObjectWithInverseResolvingEList.ManyInverse<PowerQualityPricing>(PowerQualityPricing.class, this, MeteringPackage.SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS, InfCustomersPackage.POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS);
		}
		return powerQualityPricings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		PhaseCode oldPhaseCode = phaseCode;
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE, oldPhaseCode, phaseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedPower() {
		return ratedPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedPower(float newRatedPower) {
		float oldRatedPower = ratedPower;
		ratedPower = newRatedPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER, oldRatedPower, ratedPower));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT, oldCustomerAgreement, customerAgreement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT, oldCustomerAgreement, newCustomerAgreement);
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
				msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS, CustomerAgreement.class, msgs);
			if (newCustomerAgreement != null)
				msgs = ((InternalEObject)newCustomerAgreement).eInverseAdd(this, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS, CustomerAgreement.class, msgs);
			msgs = basicSetCustomerAgreement(newCustomerAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT, newCustomerAgreement, newCustomerAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer getEnergyConsumer() {
		if (energyConsumer != null && energyConsumer.eIsProxy()) {
			InternalEObject oldEnergyConsumer = (InternalEObject)energyConsumer;
			energyConsumer = (EnergyConsumer)eResolveProxy(oldEnergyConsumer);
			if (energyConsumer != oldEnergyConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER, oldEnergyConsumer, energyConsumer));
			}
		}
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer basicGetEnergyConsumer() {
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyConsumer(EnergyConsumer newEnergyConsumer, NotificationChain msgs) {
		EnergyConsumer oldEnergyConsumer = energyConsumer;
		energyConsumer = newEnergyConsumer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER, oldEnergyConsumer, newEnergyConsumer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyConsumer(EnergyConsumer newEnergyConsumer) {
		if (newEnergyConsumer != energyConsumer) {
			NotificationChain msgs = null;
			if (energyConsumer != null)
				msgs = ((InternalEObject)energyConsumer).eInverseRemove(this, WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS, EnergyConsumer.class, msgs);
			if (newEnergyConsumer != null)
				msgs = ((InternalEObject)newEnergyConsumer).eInverseAdd(this, WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS, EnergyConsumer.class, msgs);
			msgs = basicSetEnergyConsumer(newEnergyConsumer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER, newEnergyConsumer, newEnergyConsumer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY, oldServiceCategory, serviceCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory);
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
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS, ServiceCategory.class, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS, ServiceCategory.class, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY, newServiceCategory, newServiceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrounded() {
		return grounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrounded(boolean newGrounded) {
		boolean oldGrounded = grounded;
		grounded = newGrounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED, oldGrounded, grounded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedCurrent() {
		return ratedCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedCurrent(float newRatedCurrent) {
		float oldRatedCurrent = ratedCurrent;
		ratedCurrent = newRatedCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT, oldRatedCurrent, ratedCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNominalServiceVoltage() {
		return nominalServiceVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalServiceVoltage(int newNominalServiceVoltage) {
		int oldNominalServiceVoltage = nominalServiceVoltage;
		nominalServiceVoltage = newNominalServiceVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__NOMINAL_SERVICE_VOLTAGE, oldNominalServiceVoltage, nominalServiceVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEstimatedLoad() {
		return estimatedLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedLoad(float newEstimatedLoad) {
		float oldEstimatedLoad = estimatedLoad;
		estimatedLoad = newEstimatedLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD, oldEstimatedLoad, estimatedLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceAsset> getEndDeviceAssets() {
		if (endDeviceAssets == null) {
			endDeviceAssets = new EObjectWithInverseResolvingEList<EndDeviceAsset>(EndDeviceAsset.class, this, MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS, MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT);
		}
		return endDeviceAssets;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER, oldServiceSupplier, serviceSupplier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER, oldServiceSupplier, newServiceSupplier);
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
				msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS, ServiceSupplier.class, msgs);
			if (newServiceSupplier != null)
				msgs = ((InternalEObject)newServiceSupplier).eInverseAdd(this, PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS, ServiceSupplier.class, msgs);
			msgs = basicSetServiceSupplier(newServiceSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER, newServiceSupplier, newServiceSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PricingStructure> getPricingStructures() {
		if (pricingStructures == null) {
			pricingStructures = new EObjectWithInverseResolvingEList.ManyInverse<PricingStructure>(PricingStructure.class, this, MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES, CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS);
		}
		return pricingStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformer getTransformer() {
		if (transformer != null && transformer.eIsProxy()) {
			InternalEObject oldTransformer = (InternalEObject)transformer;
			transformer = (DistributionTransformer)eResolveProxy(oldTransformer);
			if (transformer != oldTransformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER, oldTransformer, transformer));
			}
		}
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionTransformer basicGetTransformer() {
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformer(DistributionTransformer newTransformer, NotificationChain msgs) {
		DistributionTransformer oldTransformer = transformer;
		transformer = newTransformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER, oldTransformer, newTransformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformer(DistributionTransformer newTransformer) {
		if (newTransformer != transformer) {
			NotificationChain msgs = null;
			if (transformer != null)
				msgs = ((InternalEObject)transformer).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS, DistributionTransformer.class, msgs);
			if (newTransformer != null)
				msgs = ((InternalEObject)newTransformer).eInverseAdd(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS, DistributionTransformer.class, msgs);
			msgs = basicSetTransformer(newTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER, newTransformer, newTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicePriority() {
		return servicePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePriority(String newServicePriority) {
		String oldServicePriority = servicePriority;
		servicePriority = newServicePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY, oldServicePriority, servicePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new EObjectWithInverseResolvingEList<MeterReading>(MeterReading.class, this, MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS, MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT);
		}
		return meterReadings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SDPLocation> getSDPLocations() {
		if (sdpLocations == null) {
			sdpLocations = new EObjectWithInverseResolvingEList.ManyInverse<SDPLocation>(SDPLocation.class, this, MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS, MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS);
		}
		return sdpLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDeliveryRemark() {
		return serviceDeliveryRemark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDeliveryRemark(String newServiceDeliveryRemark) {
		String oldServiceDeliveryRemark = serviceDeliveryRemark;
		serviceDeliveryRemark = newServiceDeliveryRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK, oldServiceDeliveryRemark, serviceDeliveryRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckBilling() {
		return checkBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckBilling(boolean newCheckBilling) {
		boolean oldCheckBilling = checkBilling;
		checkBilling = newCheckBilling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING, oldCheckBilling, checkBilling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCtptReference() {
		return ctptReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtptReference(int newCtptReference) {
		int oldCtptReference = ctptReference;
		ctptReference = newCtptReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE, oldCtptReference, ctptReference));
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				if (serviceLocation != null)
					msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS, ServiceLocation.class, msgs);
				return basicSetServiceLocation((ServiceLocation)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerQualityPricings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				if (customerAgreement != null)
					msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS, CustomerAgreement.class, msgs);
				return basicSetCustomerAgreement((CustomerAgreement)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				if (energyConsumer != null)
					msgs = ((InternalEObject)energyConsumer).eInverseRemove(this, WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS, EnergyConsumer.class, msgs);
				return basicSetEnergyConsumer((EnergyConsumer)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				if (serviceCategory != null)
					msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS, ServiceCategory.class, msgs);
				return basicSetServiceCategory((ServiceCategory)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceAssets()).basicAdd(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				if (serviceSupplier != null)
					msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS, ServiceSupplier.class, msgs);
				return basicSetServiceSupplier((ServiceSupplier)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPricingStructures()).basicAdd(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER:
				if (transformer != null)
					msgs = ((InternalEObject)transformer).eInverseRemove(this, WiresExtPackage.DISTRIBUTION_TRANSFORMER__SERVICE_DELIVERY_POINTS, DistributionTransformer.class, msgs);
				return basicSetTransformer((DistributionTransformer)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSDPLocations()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				return basicSetServiceLocation(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS:
				return ((InternalEList<?>)getPowerQualityPricings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				return basicSetCustomerAgreement(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				return basicSetEnergyConsumer(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS:
				return ((InternalEList<?>)getEndDeviceAssets()).basicRemove(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				return basicSetServiceSupplier(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				return ((InternalEList<?>)getPricingStructures()).basicRemove(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER:
				return basicSetTransformer(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				return ((InternalEList<?>)getSDPLocations()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				if (resolve) return getServiceLocation();
				return basicGetServiceLocation();
			case MeteringPackage.SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS:
				return getPowerQualityPricings();
			case MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE:
				return getPhaseCode();
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER:
				return getRatedPower();
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				if (resolve) return getCustomerAgreement();
				return basicGetCustomerAgreement();
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				if (resolve) return getEnergyConsumer();
				return basicGetEnergyConsumer();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				if (resolve) return getServiceCategory();
				return basicGetServiceCategory();
			case MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED:
				return isGrounded();
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT:
				return getRatedCurrent();
			case MeteringPackage.SERVICE_DELIVERY_POINT__NOMINAL_SERVICE_VOLTAGE:
				return getNominalServiceVoltage();
			case MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD:
				return getEstimatedLoad();
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS:
				return getEndDeviceAssets();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				if (resolve) return getServiceSupplier();
				return basicGetServiceSupplier();
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				return getPricingStructures();
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER:
				if (resolve) return getTransformer();
				return basicGetTransformer();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY:
				return getServicePriority();
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				return getMeterReadings();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				return getSDPLocations();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK:
				return getServiceDeliveryRemark();
			case MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING:
				return isCheckBilling();
			case MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE:
				return getCtptReference();
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS:
				getPowerQualityPricings().clear();
				getPowerQualityPricings().addAll((Collection<? extends PowerQualityPricing>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER:
				setRatedPower((Float)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				setEnergyConsumer((EnergyConsumer)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED:
				setGrounded((Boolean)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__NOMINAL_SERVICE_VOLTAGE:
				setNominalServiceVoltage((Integer)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD:
				setEstimatedLoad((Float)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
				getEndDeviceAssets().addAll((Collection<? extends EndDeviceAsset>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				getPricingStructures().clear();
				getPricingStructures().addAll((Collection<? extends PricingStructure>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER:
				setTransformer((DistributionTransformer)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY:
				setServicePriority((String)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				getSDPLocations().clear();
				getSDPLocations().addAll((Collection<? extends SDPLocation>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK:
				setServiceDeliveryRemark((String)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING:
				setCheckBilling((Boolean)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE:
				setCtptReference((Integer)newValue);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS:
				getPowerQualityPricings().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE:
				setPhaseCode(PHASE_CODE_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER:
				setRatedPower(RATED_POWER_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				setEnergyConsumer((EnergyConsumer)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED:
				setGrounded(GROUNDED_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT:
				setRatedCurrent(RATED_CURRENT_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__NOMINAL_SERVICE_VOLTAGE:
				setNominalServiceVoltage(NOMINAL_SERVICE_VOLTAGE_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD:
				setEstimatedLoad(ESTIMATED_LOAD_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				getPricingStructures().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER:
				setTransformer((DistributionTransformer)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY:
				setServicePriority(SERVICE_PRIORITY_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				getMeterReadings().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				getSDPLocations().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK:
				setServiceDeliveryRemark(SERVICE_DELIVERY_REMARK_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING:
				setCheckBilling(CHECK_BILLING_EDEFAULT);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE:
				setCtptReference(CTPT_REFERENCE_EDEFAULT);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				return serviceLocation != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS:
				return powerQualityPricings != null && !powerQualityPricings.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE:
				return phaseCode != PHASE_CODE_EDEFAULT;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER:
				return ratedPower != RATED_POWER_EDEFAULT;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				return customerAgreement != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				return energyConsumer != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				return serviceCategory != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED:
				return grounded != GROUNDED_EDEFAULT;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT:
				return ratedCurrent != RATED_CURRENT_EDEFAULT;
			case MeteringPackage.SERVICE_DELIVERY_POINT__NOMINAL_SERVICE_VOLTAGE:
				return nominalServiceVoltage != NOMINAL_SERVICE_VOLTAGE_EDEFAULT;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD:
				return estimatedLoad != ESTIMATED_LOAD_EDEFAULT;
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS:
				return endDeviceAssets != null && !endDeviceAssets.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				return serviceSupplier != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				return pricingStructures != null && !pricingStructures.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER:
				return transformer != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY:
				return SERVICE_PRIORITY_EDEFAULT == null ? servicePriority != null : !SERVICE_PRIORITY_EDEFAULT.equals(servicePriority);
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				return sdpLocations != null && !sdpLocations.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK:
				return SERVICE_DELIVERY_REMARK_EDEFAULT == null ? serviceDeliveryRemark != null : !SERVICE_DELIVERY_REMARK_EDEFAULT.equals(serviceDeliveryRemark);
			case MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING:
				return checkBilling != CHECK_BILLING_EDEFAULT;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE:
				return ctptReference != CTPT_REFERENCE_EDEFAULT;
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
		result.append(" (phaseCode: ");
		result.append(phaseCode);
		result.append(", ratedPower: ");
		result.append(ratedPower);
		result.append(", grounded: ");
		result.append(grounded);
		result.append(", ratedCurrent: ");
		result.append(ratedCurrent);
		result.append(", nominalServiceVoltage: ");
		result.append(nominalServiceVoltage);
		result.append(", estimatedLoad: ");
		result.append(estimatedLoad);
		result.append(", servicePriority: ");
		result.append(servicePriority);
		result.append(", serviceDeliveryRemark: ");
		result.append(serviceDeliveryRemark);
		result.append(", checkBilling: ");
		result.append(checkBilling);
		result.append(", ctptReference: ");
		result.append(ctptReference);
		result.append(')');
		return result.toString();
	}

} //ServiceDeliveryPointImpl
