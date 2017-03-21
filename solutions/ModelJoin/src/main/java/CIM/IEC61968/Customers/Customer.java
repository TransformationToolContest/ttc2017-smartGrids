/**
 */
package CIM.IEC61968.Customers;

import CIM.IEC61968.Common.Organisation;
import CIM.IEC61968.Common.Status;

import CIM.IEC61968.Metering.EndDeviceAsset;

import CIM.IEC61968.Work.Work;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import CIM.IEC61970.Informative.InfOperations.OutageNotification;
import CIM.IEC61970.Informative.InfOperations.PlannedOutage;
import CIM.IEC61970.Informative.InfOperations.TroubleTicket;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getPlannedOutage <em>Planned Outage</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getEndDeviceAssets <em>End Device Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getOutageNotifications <em>Outage Notifications</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getPucNumber <em>Puc Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.Customer#isVip <em>Vip</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Organisation receiving services from ServiceSupplier.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Organisation receiving services from ServiceSupplier.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Organisation receiving services from ServiceSupplier.' Profile\040documentation='Organisation receiving services from ServiceSupplier.'"
 * @generated
 */
public interface Customer extends Organisation {
	/**
	 * Returns the value of the '<em><b>Planned Outage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas <em>Customer Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Outage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Outage</em>' reference.
	 * @see #setPlannedOutage(PlannedOutage)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_PlannedOutage()
	 * @see CIM.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas
	 * @model opposite="CustomerDatas"
	 * @generated
	 */
	PlannedOutage getPlannedOutage();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.Customer#getPlannedOutage <em>Planned Outage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Outage</em>' reference.
	 * @see #getPlannedOutage()
	 * @generated
	 */
	void setPlannedOutage(PlannedOutage value);

	/**
	 * Returns the value of the '<em><b>End Device Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.EndDeviceAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceAsset#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Assets</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_EndDeviceAssets()
	 * @see CIM.IEC61968.Metering.EndDeviceAsset#getCustomer
	 * @model opposite="Customer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device assets of this customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device assets of this customer.'"
	 * @generated
	 */
	EList<EndDeviceAsset> getEndDeviceAssets();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_Status()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Status of this customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Status of this customer.'"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.Customer#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.Customers.CustomerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.Customers.CustomerKind
	 * @see #setKind(CustomerKind)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of customer.'"
	 * @generated
	 */
	CustomerKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.Customer#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.Customers.CustomerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CustomerKind value);

	/**
	 * Returns the value of the '<em><b>Trouble Tickets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.TroubleTicket}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData <em>Customer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trouble Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trouble Tickets</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_TroubleTickets()
	 * @see CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData
	 * @model opposite="CustomerData"
	 * @generated
	 */
	EList<TroubleTicket> getTroubleTickets();

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData <em>Customer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_ErpPersons()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData
	 * @model opposite="CustomerData"
	 * @generated
	 */
	EList<ErpPerson> getErpPersons();

	/**
	 * Returns the value of the '<em><b>Outage Notifications</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.OutageNotification}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas <em>Customer Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Notifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Notifications</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_OutageNotifications()
	 * @see CIM.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas
	 * @model opposite="CustomerDatas"
	 * @generated
	 */
	EList<OutageNotification> getOutageNotifications();

	/**
	 * Returns the value of the '<em><b>Special Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Need</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Need</em>' attribute.
	 * @see #setSpecialNeed(String)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_SpecialNeed()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if customer organisation has special service needs such as life support, hospitals, etc.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if customer organisation has special service needs such as life support, hospitals, etc.'"
	 * @generated
	 */
	String getSpecialNeed();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.Customer#getSpecialNeed <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Need</em>' attribute.
	 * @see #getSpecialNeed()
	 * @generated
	 */
	void setSpecialNeed(String value);

	/**
	 * Returns the value of the '<em><b>Puc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puc Number</em>' attribute.
	 * @see #setPucNumber(String)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_PucNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if applicable) Public Utility Commission identification number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if applicable) Public Utility Commission identification number.'"
	 * @generated
	 */
	String getPucNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.Customer#getPucNumber <em>Puc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puc Number</em>' attribute.
	 * @see #getPucNumber()
	 * @generated
	 */
	void setPucNumber(String value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Work.Work#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_Works()
	 * @see CIM.IEC61968.Work.Work#getCustomers
	 * @model opposite="Customers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All the works performed for this customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All the works performed for this customer.'"
	 * @generated
	 */
	EList<Work> getWorks();

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.CustomerAgreement#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_CustomerAgreements()
	 * @see CIM.IEC61968.Customers.CustomerAgreement#getCustomer
	 * @model opposite="Customer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All agreements of this customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All agreements of this customer.'"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

	/**
	 * Returns the value of the '<em><b>Vip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vip</em>' attribute.
	 * @see #setVip(boolean)
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomer_Vip()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this is an important customer. Importance is for matters different than those in \'specialNeed\' attribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this is an important customer. Importance is for matters different than those in \'specialNeed\' attribute.'"
	 * @generated
	 */
	boolean isVip();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Customers.Customer#isVip <em>Vip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vip</em>' attribute.
	 * @see #isVip()
	 * @generated
	 */
	void setVip(boolean value);

} // Customer
