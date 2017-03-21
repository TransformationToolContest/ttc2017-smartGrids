/**
 */
package CIM.IEC61968.Customers;

import CIM.IEC61968.Metering.ServiceDeliveryPoint;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Customers.ServiceCategory#getSPAccountingFunctions <em>SP Accounting Functions</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceCategory#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceCategory#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceCategory#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.ServiceCategory#getPricingStructures <em>Pricing Structures</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceCategory()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Category of service provided to the customer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Category of service provided to the customer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Category of service provided to the customer.' Profile\040documentation='Category of service provided to the customer.'"
 * @generated
 */
public interface ServiceCategory extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>SP Accounting Functions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getServiceKind <em>Service Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SP Accounting Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SP Accounting Functions</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceCategory_SPAccountingFunctions()
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getServiceKind
	 * @model opposite="ServiceKind"
	 * @generated
	 */
	EList<SDPAccountingFunction> getSPAccountingFunctions();

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceCategory_ServiceDeliveryPoints()
	 * @see CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory
	 * @model opposite="ServiceCategory"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All service delivery points that deliver this category of service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All service delivery points that deliver this category of service.'"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.CustomerAgreement#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceCategory_CustomerAgreements()
	 * @see CIM.IEC61968.Customers.CustomerAgreement#getServiceCategory
	 * @model opposite="ServiceCategory"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.Customers.ServiceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.Customers.ServiceKind
	 * @see #setKind(ServiceKind)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceCategory_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of service.'"
	 * @generated
	 */
	ServiceKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.ServiceCategory#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.Customers.ServiceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ServiceKind value);

	/**
	 * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.PricingStructure}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.PricingStructure#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structures</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getServiceCategory_PricingStructures()
	 * @see CIM.IEC61968.Customers.PricingStructure#getServiceCategory
	 * @model opposite="ServiceCategory"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All pricing structures applicable to this service category.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All pricing structures applicable to this service category.'"
	 * @generated
	 */
	EList<PricingStructure> getPricingStructures();

} // ServiceCategory
