/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61968.Common.Organisation;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;

import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.Informative.InfCommon.BankAccount;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts <em>Bank Accounts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements <em>Customer Agreements</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getServiceSupplier()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Organisation that provides services to Customers.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Organisation that provides services to Customers.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Organisation that provides services to Customers.' Profile\040documentation='Organisation that provides services to Customers.'"
 * @generated
 */
public interface ServiceSupplier extends Organisation {
	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getServiceSupplier_ServiceDeliveryPoints()
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier
	 * @model opposite="ServiceSupplier"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All service delivery points this service supplier utilises to deliver a service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All service delivery points this service supplier utilises to deliver a service.'"
	 * @generated
	 */
	EList<ServiceDeliveryPoint> getServiceDeliveryPoints();

	/**
	 * Returns the value of the '<em><b>Bank Accounts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfCommon.BankAccount}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfCommon.BankAccount#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Accounts</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getServiceSupplier_BankAccounts()
	 * @see gluemodel.CIM.IEC61970.Informative.InfCommon.BankAccount#getServiceSupplier
	 * @model opposite="ServiceSupplier"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All BackAccounts this ServiceSupplier owns.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All BackAccounts this ServiceSupplier owns.'"
	 * @generated
	 */
	EList<BankAccount> getBankAccounts();

	/**
	 * Returns the value of the '<em><b>Issuer Identification Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer Identification Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Identification Number</em>' attribute.
	 * @see #setIssuerIdentificationNumber(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getServiceSupplier_IssuerIdentificationNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unique transaction reference prefix number issued to an entity by the International Standards Organisation for the purpose of tagging onto electronic financial transactions, as defined in ISO/IEC 7812-1 and ISO/IEC 7812-2.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unique transaction reference prefix number issued to an entity by the International Standards Organisation for the purpose of tagging onto electronic financial transactions, as defined in ISO/IEC 7812-1 and ISO/IEC 7812-2.'"
	 * @generated
	 */
	String getIssuerIdentificationNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Identification Number</em>' attribute.
	 * @see #getIssuerIdentificationNumber()
	 * @generated
	 */
	void setIssuerIdentificationNumber(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.PaymentMetering.SupplierKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.SupplierKind
	 * @see #setKind(SupplierKind)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getServiceSupplier_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of supplier.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of supplier.'"
	 * @generated
	 */
	SupplierKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.SupplierKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SupplierKind value);

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getServiceSupplier_CustomerAgreements()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceSupplier
	 * @model opposite="ServiceSupplier"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All customer agreements of this service supplier.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All customer agreements of this service supplier.'"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

} // ServiceSupplier
