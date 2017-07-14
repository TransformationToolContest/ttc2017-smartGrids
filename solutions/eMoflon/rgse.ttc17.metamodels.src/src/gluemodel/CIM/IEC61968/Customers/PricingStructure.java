/**
 */
package gluemodel.CIM.IEC61968.Customers;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61968.PaymentMetering.Transaction;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getCode <em>Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#isTaxExemption <em>Tax Exemption</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getRevenueKind <em>Revenue Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getPowerQualityPricings <em>Power Quality Pricings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getSubscribePowerCurve <em>Subscribe Power Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Grouping of pricing components and prices used in the creation of customer charges and the eligibility criteria under which these terms may be offered to a customer. The reasons for grouping include state, customer classification, site characteristics, classification (i.e. fee price structure, deposit price structure, electric service price structure, etc.) and accounting requirements.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Grouping of pricing components and prices used in the creation of customer charges and the eligibility criteria under which these terms may be offered to a customer. The reasons for grouping include state, customer classification, site characteristics, classification (i.e. fee price structure, deposit price structure, electric service price structure, etc.) and accounting requirements.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Grouping of pricing components and prices used in the creation of customer charges and the eligibility criteria under which these terms may be offered to a customer. The reasons for grouping include state, customer classification, site characteristics, classification (i.e. fee price structure, deposit price structure, electric service price structure, etc.) and accounting requirements.' Profile\040documentation='Grouping of pricing components and prices used in the creation of customer charges and the eligibility criteria under which these terms may be offered to a customer. The reasons for grouping include state, customer classification, site characteristics, classification (i.e. fee price structure, deposit price structure, electric service price structure, etc.) and accounting requirements.'"
 * @generated
 */
public interface PricingStructure extends Document {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unique user-allocated key for this pricing structure, used by company representatives to identify the correct price structure for allocating to a customer. For rate schedules it is often prefixed by a state code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unique user-allocated key for this pricing structure, used by company representatives to identify the correct price structure for allocating to a customer. For rate schedules it is often prefixed by a state code.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Tax Exemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Exemption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Exemption</em>' attribute.
	 * @see #setTaxExemption(boolean)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_TaxExemption()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this pricing structure is not taxable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this pricing structure is not taxable.'"
	 * @generated
	 */
	boolean isTaxExemption();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#isTaxExemption <em>Tax Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exemption</em>' attribute.
	 * @see #isTaxExemption()
	 * @generated
	 */
	void setTaxExemption(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' reference.
	 * @see #setServiceCategory(ServiceCategory)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_ServiceCategory()
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getPricingStructures
	 * @model opposite="PricingStructures"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Service category to which this pricing structure applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Service category to which this pricing structure applies.'"
	 * @generated
	 */
	ServiceCategory getServiceCategory();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceCategory <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Category</em>' reference.
	 * @see #getServiceCategory()
	 * @generated
	 */
	void setServiceCategory(ServiceCategory value);

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_CustomerAgreements()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getPricingStructures
	 * @model opposite="PricingStructures"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All customer agreements with this pricing structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All customer agreements with this pricing structure.'"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

	/**
	 * Returns the value of the '<em><b>Daily Floor Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Floor Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Floor Usage</em>' attribute.
	 * @see #setDailyFloorUsage(int)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_DailyFloorUsage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Absolute minimum valid non-demand usage quantity used in validating a customer\'s billed non-demand usage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Absolute minimum valid non-demand usage quantity used in validating a customer\'s billed non-demand usage.'"
	 * @generated
	 */
	int getDailyFloorUsage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Floor Usage</em>' attribute.
	 * @see #getDailyFloorUsage()
	 * @generated
	 */
	void setDailyFloorUsage(int value);

	/**
	 * Returns the value of the '<em><b>Revenue Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.Customers.RevenueKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revenue Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.Customers.RevenueKind
	 * @see #setRevenueKind(RevenueKind)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_RevenueKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(Accounting) Kind of revenue, often used to determine the grace period allowed, before collection actions are taken on a customer (grace periods vary between revenue classes).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(Accounting) Kind of revenue, often used to determine the grace period allowed, before collection actions are taken on a customer (grace periods vary between revenue classes).'"
	 * @generated
	 */
	RevenueKind getRevenueKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getRevenueKind <em>Revenue Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.Customers.RevenueKind
	 * @see #getRevenueKind()
	 * @generated
	 */
	void setRevenueKind(RevenueKind value);

	/**
	 * Returns the value of the '<em><b>Power Quality Pricings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Quality Pricings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Quality Pricings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_PowerQualityPricings()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPricingStructure
	 * @model opposite="PricingStructure"
	 * @generated
	 */
	EList<PowerQualityPricing> getPowerQualityPricings();

	/**
	 * Returns the value of the '<em><b>Tariffs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.Tariff}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.Tariff#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariffs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariffs</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_Tariffs()
	 * @see gluemodel.CIM.IEC61968.Customers.Tariff#getPricingStructures
	 * @model opposite="PricingStructures"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All tariffs used by this pricing structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All tariffs used by this pricing structure.'"
	 * @generated
	 */
	EList<Tariff> getTariffs();

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_ServiceDeliveryPoints()
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures
	 * @model opposite="PricingStructures"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All service delivery points (with prepayment meter running as a stand-alone device, with no CustomerAgreement or Customer) to which this pricing structure applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All service delivery points (with prepayment meter running as a stand-alone device, with no CustomerAgreement or Customer) to which this pricing structure applies.'"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

	/**
	 * Returns the value of the '<em><b>Daily Ceiling Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Ceiling Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Ceiling Usage</em>' attribute.
	 * @see #setDailyCeilingUsage(int)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_DailyCeilingUsage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Absolute maximum valid non-demand usage quantity used in validating a customer\'s billed non-demand usage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Absolute maximum valid non-demand usage quantity used in validating a customer\'s billed non-demand usage.'"
	 * @generated
	 */
	int getDailyCeilingUsage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Ceiling Usage</em>' attribute.
	 * @see #getDailyCeilingUsage()
	 * @generated
	 */
	void setDailyCeilingUsage(int value);

	/**
	 * Returns the value of the '<em><b>Subscribe Power Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve#getPricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe Power Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe Power Curve</em>' reference.
	 * @see #setSubscribePowerCurve(SubscribePowerCurve)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_SubscribePowerCurve()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve#getPricingStructure
	 * @model opposite="PricingStructure"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='SubscribePowerCurve specifies the cost according to a prcing structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='SubscribePowerCurve specifies the cost according to a prcing structure.'"
	 * @generated
	 */
	SubscribePowerCurve getSubscribePowerCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getSubscribePowerCurve <em>Subscribe Power Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe Power Curve</em>' reference.
	 * @see #getSubscribePowerCurve()
	 * @generated
	 */
	void setSubscribePowerCurve(SubscribePowerCurve value);

	/**
	 * Returns the value of the '<em><b>Daily Estimated Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Estimated Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Estimated Usage</em>' attribute.
	 * @see #setDailyEstimatedUsage(int)
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_DailyEstimatedUsage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used in place of actual computed estimated average when history of usage is not available, and typically manually entered by customer accounting.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used in place of actual computed estimated average when history of usage is not available, and typically manually entered by customer accounting.'"
	 * @generated
	 */
	int getDailyEstimatedUsage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Estimated Usage</em>' attribute.
	 * @see #getDailyEstimatedUsage()
	 * @generated
	 */
	void setDailyEstimatedUsage(int value);

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Transaction#getPricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getPricingStructure_Transactions()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Transaction#getPricingStructure
	 * @model opposite="PricingStructure"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All transactions applying this pricing structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All transactions applying this pricing structure.'"
	 * @generated
	 */
	EList<Transaction> getTransactions();

} // PricingStructure
