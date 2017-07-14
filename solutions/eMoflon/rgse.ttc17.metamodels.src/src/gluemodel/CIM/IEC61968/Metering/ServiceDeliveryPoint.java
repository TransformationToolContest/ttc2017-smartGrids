/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.PricingStructure;
import gluemodel.CIM.IEC61968.Customers.ServiceCategory;
import gluemodel.CIM.IEC61968.Customers.ServiceLocation;

import gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.PhaseCode;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPowerQualityPricings <em>Power Quality Pricings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower <em>Rated Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#isGrounded <em>Grounded</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getNominalServiceVoltage <em>Nominal Service Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad <em>Estimated Load</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEndDeviceAssets <em>End Device Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority <em>Service Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations <em>SDP Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark <em>Service Delivery Remark</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling <em>Check Billing</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference <em>Ctpt Reference</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Logical point on the network where the ownership of the service changes hands. It is one of potentially many service points within a ServiceLocation, delivering service in accordance with a CustomerAgreement. Used at the place where a meter may be installed.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Logical point on the network where the ownership of the service changes hands. It is one of potentially many service points within a ServiceLocation, delivering service in accordance with a CustomerAgreement. Used at the place where a meter may be installed.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Logical point on the network where the ownership of the service changes hands. It is one of potentially many service points within a ServiceLocation, delivering service in accordance with a CustomerAgreement. Used at the place where a meter may be installed.' Profile\040documentation='Logical point on the network where the ownership of the service changes hands. It is one of potentially many service points within a ServiceLocation, delivering service in accordance with a CustomerAgreement. Used at the place where a meter may be installed.'"
 * @generated
 */
public interface ServiceDeliveryPoint extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Service Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Location</em>' reference.
	 * @see #setServiceLocation(ServiceLocation)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_ServiceLocation()
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Service location where the service delivered by this service delivery point is consumed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Service location where the service delivered by this service delivery point is consumed.'"
	 * @generated
	 */
	ServiceLocation getServiceLocation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Location</em>' reference.
	 * @see #getServiceLocation()
	 * @generated
	 */
	void setServiceLocation(ServiceLocation value);

	/**
	 * Returns the value of the '<em><b>Power Quality Pricings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Quality Pricings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Quality Pricings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_PowerQualityPricings()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 * @generated
	 */
	EList<PowerQualityPricing> getPowerQualityPricings();

	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #setPhaseCode(PhaseCode)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_PhaseCode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase code. Number of wires and number of phases can be deduced from enumeration literal values. For example, ABCN is three-phase, four-wire. s12n (splitSecondary12N) is single-phase, three-wire. s1n and s2n are single-phase, two-wire.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase code. Number of wires and number of phases can be deduced from enumeration literal values. For example, ABCN is three-phase, four-wire. s12n (splitSecondary12N) is single-phase, three-wire. s1n and s2n are single-phase, two-wire.'"
	 * @generated
	 */
	PhaseCode getPhaseCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #getPhaseCode()
	 * @generated
	 */
	void setPhaseCode(PhaseCode value);

	/**
	 * Returns the value of the '<em><b>Rated Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Power</em>' attribute.
	 * @see #setRatedPower(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_RatedPower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Power that this service delivery point is configured to deliver.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Power that this service delivery point is configured to deliver.'"
	 * @generated
	 */
	float getRatedPower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Power</em>' attribute.
	 * @see #getRatedPower()
	 * @generated
	 */
	void setRatedPower(float value);

	/**
	 * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreement</em>' reference.
	 * @see #setCustomerAgreement(CustomerAgreement)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_CustomerAgreement()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Customer agreement regulating this service delivery point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Customer agreement regulating this service delivery point.'"
	 * @generated
	 */
	CustomerAgreement getCustomerAgreement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Agreement</em>' reference.
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	void setCustomerAgreement(CustomerAgreement value);

	/**
	 * Returns the value of the '<em><b>Energy Consumer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumer</em>' reference.
	 * @see #setEnergyConsumer(EnergyConsumer)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_EnergyConsumer()
	 * @see gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 * @generated
	 */
	EnergyConsumer getEnergyConsumer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Consumer</em>' reference.
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	void setEnergyConsumer(EnergyConsumer value);

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' reference.
	 * @see #setServiceCategory(ServiceCategory)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_ServiceCategory()
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Service category delivered by this service delivery point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Service category delivered by this service delivery point.'"
	 * @generated
	 */
	ServiceCategory getServiceCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Category</em>' reference.
	 * @see #getServiceCategory()
	 * @generated
	 */
	void setServiceCategory(ServiceCategory value);

	/**
	 * Returns the value of the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded</em>' attribute.
	 * @see #setGrounded(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_Grounded()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if grounded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if grounded.'"
	 * @generated
	 */
	boolean isGrounded();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#isGrounded <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounded</em>' attribute.
	 * @see #isGrounded()
	 * @generated
	 */
	void setGrounded(boolean value);

	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #setRatedCurrent(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_RatedCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current that this service delivery point is configured to deliver.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current that this service delivery point is configured to deliver.'"
	 * @generated
	 */
	float getRatedCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #getRatedCurrent()
	 * @generated
	 */
	void setRatedCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Nominal Service Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Service Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Service Voltage</em>' attribute.
	 * @see #setNominalServiceVoltage(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_NominalServiceVoltage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Nominal service voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Nominal service voltage.'"
	 * @generated
	 */
	int getNominalServiceVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getNominalServiceVoltage <em>Nominal Service Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Service Voltage</em>' attribute.
	 * @see #getNominalServiceVoltage()
	 * @generated
	 */
	void setNominalServiceVoltage(int value);

	/**
	 * Returns the value of the '<em><b>Estimated Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Load</em>' attribute.
	 * @see #setEstimatedLoad(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_EstimatedLoad()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated load.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated load.'"
	 * @generated
	 */
	float getEstimatedLoad();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad <em>Estimated Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Load</em>' attribute.
	 * @see #getEstimatedLoad()
	 * @generated
	 */
	void setEstimatedLoad(float value);

	/**
	 * Returns the value of the '<em><b>End Device Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_EndDeviceAssets()
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceDeliveryPoint
	 * @model opposite="ServiceDeliveryPoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device assets at this service delivery point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device assets at this service delivery point.'"
	 * @generated
	 */
	EList<EndDeviceAsset> getEndDeviceAssets();

	/**
	 * Returns the value of the '<em><b>Service Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Supplier</em>' reference.
	 * @see #setServiceSupplier(ServiceSupplier)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_ServiceSupplier()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='ServiceSupplier (Utility) utilising this service delivery point to deliver a service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ServiceSupplier (Utility) utilising this service delivery point to deliver a service.'"
	 * @generated
	 */
	ServiceSupplier getServiceSupplier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Supplier</em>' reference.
	 * @see #getServiceSupplier()
	 * @generated
	 */
	void setServiceSupplier(ServiceSupplier value);

	/**
	 * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.PricingStructure}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structures</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_PricingStructures()
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All pricing structures applicable to this service delivery point (with prepayment meter running as a stand-alone device, with no CustomerAgreement or Customer).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All pricing structures applicable to this service delivery point (with prepayment meter running as a stand-alone device, with no CustomerAgreement or Customer).'"
	 * @generated
	 */
	EList<PricingStructure> getPricingStructures();

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' reference.
	 * @see #setTransformer(DistributionTransformer)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_Transformer()
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transformer supplying this service delivery point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transformer supplying this service delivery point.'"
	 * @generated
	 */
	DistributionTransformer getTransformer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getTransformer <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer</em>' reference.
	 * @see #getTransformer()
	 * @generated
	 */
	void setTransformer(DistributionTransformer value);

	/**
	 * Returns the value of the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Priority</em>' attribute.
	 * @see #setServicePriority(String)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_ServicePriority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Priority of service for this service delivery point. Note that service delivery points at the same service location can have different priorities.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Priority of service for this service delivery point. Note that service delivery points at the same service location can have different priorities.'"
	 * @generated
	 */
	String getServicePriority();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Priority</em>' attribute.
	 * @see #getServicePriority()
	 * @generated
	 */
	void setServicePriority(String value);

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.MeterReading}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_MeterReadings()
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getServiceDeliveryPoint
	 * @model opposite="ServiceDeliveryPoint"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All meter readings obtained from this service delivery point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All meter readings obtained from this service delivery point.'"
	 * @generated
	 */
	EList<MeterReading> getMeterReadings();

	/**
	 * Returns the value of the '<em><b>SDP Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.SDPLocation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDP Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDP Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_SDPLocations()
	 * @see gluemodel.CIM.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints
	 * @model opposite="ServiceDeliveryPoints"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All locations of this service delivery point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All locations of this service delivery point.'"
	 * @generated
	 */
	EList<SDPLocation> getSDPLocations();

	/**
	 * Returns the value of the '<em><b>Service Delivery Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Remark</em>' attribute.
	 * @see #setServiceDeliveryRemark(String)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_ServiceDeliveryRemark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remarks about this service delivery point, for example the reason for it being rated with a non-nominal priority.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remarks about this service delivery point, for example the reason for it being rated with a non-nominal priority.'"
	 * @generated
	 */
	String getServiceDeliveryRemark();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark <em>Service Delivery Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delivery Remark</em>' attribute.
	 * @see #getServiceDeliveryRemark()
	 * @generated
	 */
	void setServiceDeliveryRemark(String value);

	/**
	 * Returns the value of the '<em><b>Check Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Billing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Billing</em>' attribute.
	 * @see #setCheckBilling(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_CheckBilling()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if as a result of an inspection or otherwise, there is a reason to suspect that a previous billing may have been performed with erroneous data. Value should be reset once this potential discrepancy has been resolved.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if as a result of an inspection or otherwise, there is a reason to suspect that a previous billing may have been performed with erroneous data. Value should be reset once this potential discrepancy has been resolved.'"
	 * @generated
	 */
	boolean isCheckBilling();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling <em>Check Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Billing</em>' attribute.
	 * @see #isCheckBilling()
	 * @generated
	 */
	void setCheckBilling(boolean value);

	/**
	 * Returns the value of the '<em><b>Ctpt Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctpt Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctpt Reference</em>' attribute.
	 * @see #setCtptReference(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint_CtptReference()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(optional for medium voltage connections) Reference to the low side terminal of a CT or PT that obtain readings from a medium or high voltage point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(optional for medium voltage connections) Reference to the low side terminal of a CT or PT that obtain readings from a medium or high voltage point.'"
	 * @generated
	 */
	int getCtptReference();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference <em>Ctpt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctpt Reference</em>' attribute.
	 * @see #getCtptReference()
	 * @generated
	 */
	void setCtptReference(int value);

} // ServiceDeliveryPoint
