/**
 */
package CIM.IEC61968.Customers;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.PaymentMetering.Transaction;

import CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo;
import CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Customers.CustomerAccount#getWorkBillingInfos <em>Work Billing Infos</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.CustomerAccount#getErpInvoicees <em>Erp Invoicees</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.CustomerAccount#getCustomerBillingInfos <em>Customer Billing Infos</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomerAccount()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Assignment of a group of products and services purchased by the Customer through a CustomerAgreement, used as a mechanism for customer billing and payment. It contains common information from the various types of CustomerAgreements to create billings (invoices) for a Customer and receive payment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Assignment of a group of products and services purchased by the Customer through a CustomerAgreement, used as a mechanism for customer billing and payment. It contains common information from the various types of CustomerAgreements to create billings (invoices) for a Customer and receive payment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Assignment of a group of products and services purchased by the Customer through a CustomerAgreement, used as a mechanism for customer billing and payment. It contains common information from the various types of CustomerAgreements to create billings (invoices) for a Customer and receive payment.' Profile\040documentation='Assignment of a group of products and services purchased by the Customer through a CustomerAgreement, used as a mechanism for customer billing and payment. It contains common information from the various types of CustomerAgreements to create billings (invoices) for a Customer and receive payment.'"
 * @generated
 */
public interface CustomerAccount extends Document {
	/**
	 * Returns the value of the '<em><b>Work Billing Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Billing Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Billing Infos</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomerAccount_WorkBillingInfos()
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount
	 * @model opposite="CustomerAccount"
	 * @generated
	 */
	EList<WorkBillingInfo> getWorkBillingInfos();

	/**
	 * Returns the value of the '<em><b>Payment Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Transaction#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Transactions</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomerAccount_PaymentTransactions()
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getCustomerAccount
	 * @model opposite="CustomerAccount"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All payment transactions for this customer account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All payment transactions for this customer account.'"
	 * @generated
	 */
	EList<Transaction> getPaymentTransactions();

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomerAccount_CustomerAgreements()
	 * @see CIM.IEC61968.Customers.CustomerAgreement#getCustomerAccount
	 * @model opposite="CustomerAccount"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All agreements for this customer account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All agreements for this customer account.'"
	 * @generated
	 */
	EList<CustomerAgreement> getCustomerAgreements();

	/**
	 * Returns the value of the '<em><b>Erp Invoicees</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoice}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoicees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoicees</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomerAccount_ErpInvoicees()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount
	 * @model opposite="CustomerAccount"
	 * @generated
	 */
	EList<ErpInvoice> getErpInvoicees();

	/**
	 * Returns the value of the '<em><b>Customer Billing Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Billing Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Billing Infos</em>' reference list.
	 * @see CIM.IEC61968.Customers.CustomersPackage#getCustomerAccount_CustomerBillingInfos()
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount
	 * @model opposite="CustomerAccount"
	 * @generated
	 */
	EList<CustomerBillingInfo> getCustomerBillingInfos();

} // CustomerAccount
