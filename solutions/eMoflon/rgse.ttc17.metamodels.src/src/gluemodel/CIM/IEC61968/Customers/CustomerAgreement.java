/**
 */
package gluemodel.CIM.IEC61968.Customers;

import gluemodel.CIM.IEC61968.Common.Agreement;

import gluemodel.CIM.IEC61968.Metering.DemandResponseProgram;
import gluemodel.CIM.IEC61968.Metering.EndDeviceControl;
import gluemodel.CIM.IEC61968.Metering.MeterReading;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement;
import gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier;

import gluemodel.CIM.IEC61970.Core.Equipment;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getStandardIndustryCode <em>Standard Industry Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getBillingCycle <em>Billing Cycle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceLocations <em>Service Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getBudgetBill <em>Budget Bill</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getCustomer <em>Customer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getEquipments <em>Equipments</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Agreement between the Customer and the ServiceSupplier to pay for service at a specific ServiceLocation. It records certain billing information about the type of service provided at the ServiceLocation and is used during charge creation to determine the type of service.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Agreement between the Customer and the ServiceSupplier to pay for service at a specific ServiceLocation. It records certain billing information about the type of service provided at the ServiceLocation and is used during charge creation to determine the type of service.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Agreement between the Customer and the ServiceSupplier to pay for service at a specific ServiceLocation. It records certain billing information about the type of service provided at the ServiceLocation and is used during charge creation to determine the type of service.' Profile\040documentation='Agreement between the Customer and the ServiceSupplier to pay for service at a specific ServiceLocation. It records certain billing information about the type of service provided at the ServiceLocation and is used during charge creation to determine the type of service.'"
 * @generated
 */
public interface CustomerAgreement extends Agreement {
	/**
	 * Returns the value of the '<em><b>Service Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Supplier</em>' reference.
	 * @see #setServiceSupplier(ServiceSupplier)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_ServiceSupplier()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Service supplier for this customer agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Service supplier for this customer agreement.'"
	 * @generated
	 */
	ServiceSupplier getServiceSupplier();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Supplier</em>' reference.
	 * @see #getServiceSupplier()
	 * @generated
	 */
	void setServiceSupplier(ServiceSupplier value);

	/**
	 * Returns the value of the '<em><b>Standard Industry Code</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Industry Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Industry Code</em>' reference.
	 * @see #setStandardIndustryCode(StandardIndustryCode)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_StandardIndustryCode()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 * @generated
	 */
	StandardIndustryCode getStandardIndustryCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getStandardIndustryCode <em>Standard Industry Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Industry Code</em>' reference.
	 * @see #getStandardIndustryCode()
	 * @generated
	 */
	void setStandardIndustryCode(StandardIndustryCode value);

	/**
	 * Returns the value of the '<em><b>Billing Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Cycle</em>' attribute.
	 * @see #setBillingCycle(String)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_BillingCycle()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cycle day on which the associated customer account will normally be billed, used to determine when to produce the billing.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cycle day on which the associated customer account will normally be billed, used to determine when to produce the billing.'"
	 * @generated
	 */
	String getBillingCycle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getBillingCycle <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Cycle</em>' attribute.
	 * @see #getBillingCycle()
	 * @generated
	 */
	void setBillingCycle(String value);

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_ServiceDeliveryPoints()
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement
	 * @model opposite="CustomerAgreement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All service delivery points regulated by this customer agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All service delivery points regulated by this customer agreement.'"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.MeterReading}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_MeterReadings()
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getCustomerAgreement
	 * @model opposite="CustomerAgreement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(could be deprecated in the future) All meter readings for this customer agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(could be deprecated in the future) All meter readings for this customer agreement.'"
	 * @generated
	 */
	EList<MeterReading> getMeterReadings();

	/**
	 * Returns the value of the '<em><b>Service Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.ServiceLocation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_ServiceLocations()
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All service locations regulated by this customer agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All service locations regulated by this customer agreement.'"
	 * @generated
	 */
	EList<ServiceLocation> getServiceLocations();

	/**
	 * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.PricingStructure}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structures</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_PricingStructures()
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All pricing structures applicable to this customer agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All pricing structures applicable to this customer agreement.'"
	 * @generated
	 */
	EList<PricingStructure> getPricingStructures();

	/**
	 * Returns the value of the '<em><b>Load Mgmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Mgmt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Mgmt</em>' attribute.
	 * @see #setLoadMgmt(String)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_LoadMgmt()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Load management code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Load management code.'"
	 * @generated
	 */
	String getLoadMgmt();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Mgmt</em>' attribute.
	 * @see #getLoadMgmt()
	 * @generated
	 */
	void setLoadMgmt(String value);

	/**
	 * Returns the value of the '<em><b>Auxiliary Agreements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Agreements</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_AuxiliaryAgreements()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement
	 * @model opposite="CustomerAgreement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All (non-service related) auxiliary agreements that refer to this customer agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All (non-service related) auxiliary agreements that refer to this customer agreement.'"
	 * @generated
	 */
	EList<AuxiliaryAgreement> getAuxiliaryAgreements();

	/**
	 * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Controls</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_EndDeviceControls()
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getCustomerAgreement
	 * @model opposite="CustomerAgreement"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Could be deprecated in the future.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Could be deprecated in the future.'"
	 * @generated
	 */
	EList<EndDeviceControl> getEndDeviceControls();

	/**
	 * Returns the value of the '<em><b>Budget Bill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Bill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Bill</em>' attribute.
	 * @see #setBudgetBill(String)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_BudgetBill()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Budget bill code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Budget bill code.'"
	 * @generated
	 */
	String getBudgetBill();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getBudgetBill <em>Budget Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Bill</em>' attribute.
	 * @see #getBudgetBill()
	 * @generated
	 */
	void setBudgetBill(String value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.Customer#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_Customer()
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Customer for this agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Customer for this agreement.'"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' reference.
	 * @see #setServiceCategory(ServiceCategory)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_ServiceCategory()
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 * @generated
	 */
	ServiceCategory getServiceCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceCategory <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Category</em>' reference.
	 * @see #getServiceCategory()
	 * @generated
	 */
	void setServiceCategory(ServiceCategory value);

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_CustomerAccount()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Customer account owning this agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Customer account owning this agreement.'"
	 * @generated
	 */
	CustomerAccount getCustomerAccount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Account</em>' reference.
	 * @see #getCustomerAccount()
	 * @generated
	 */
	void setCustomerAccount(CustomerAccount value);

	/**
	 * Returns the value of the '<em><b>Demand Response Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Response Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Response Program</em>' reference.
	 * @see #setDemandResponseProgram(DemandResponseProgram)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_DemandResponseProgram()
	 * @see gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Demand response program for this customer agreement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Demand response program for this customer agreement.'"
	 * @generated
	 */
	DemandResponseProgram getDemandResponseProgram();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Response Program</em>' reference.
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	void setDemandResponseProgram(DemandResponseProgram value);

	/**
	 * Returns the value of the '<em><b>Equipments</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.Equipment}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Equipment#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipments</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getCustomerAgreement_Equipments()
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#getCustomerAgreements
	 * @model opposite="CustomerAgreements"
	 * @generated
	 */
	EList<Equipment> getEquipments();

} // CustomerAgreement
