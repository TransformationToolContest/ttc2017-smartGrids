/**
 */
package CIM.IEC61970.Informative.InfCustomers;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.Customers.CustomerAccount;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Billing Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanAmt <em>Pymt Plan Amt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentDate <em>Last Payment Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getBillingDate <em>Billing Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentAmt <em>Last Payment Amt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanType <em>Pymt Plan Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getOutBalance <em>Out Balance</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The creation of the monthly customer billing statements is the method employed to notify Customers of charges, adjustments and credits applied to their account for Services and Products. The actuall billing occurs through an ErpInvoice. The CustomerBillingInfo includes information from the payment, collection, meter reading, installed meter, service, site, customer, customer account, customer agreement, services and pricing subject areas. Each component price shows up as a separate line item on the ErpInvoice.\nThe Customer Billing Statement may include collection and account messages, marketing/civic event messages and bill inserts.\nOne Customer Billing Statement is produced for all Agreements under a CustomerAccount per billing cycle date defined in \'CustomerAccount.billingCycle\'.\nThe history of CustomerBillingInfo, Invoices and Payments is to be maintained in associated ActivityRecords.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The creation of the monthly customer billing statements is the method employed to notify Customers of charges, adjustments and credits applied to their account for Services and Products. The actuall billing occurs through an ErpInvoice. The CustomerBillingInfo includes information from the payment, collection, meter reading, installed meter, service, site, customer, customer account, customer agreement, services and pricing subject areas. Each component price shows up as a separate line item on the ErpInvoice.\nThe Customer Billing Statement may include collection and account messages, marketing/civic event messages and bill inserts.\nOne Customer Billing Statement is produced for all Agreements under a CustomerAccount per billing cycle date defined in \'CustomerAccount.billingCycle\'.\nThe history of CustomerBillingInfo, Invoices and Payments is to be maintained in associated ActivityRecords.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The creation of the monthly customer billing statements is the method employed to notify Customers of charges, adjustments and credits applied to their account for Services and Products. The actuall billing occurs through an ErpInvoice. The CustomerBillingInfo includes information from the payment, collection, meter reading, installed meter, service, site, customer, customer account, customer agreement, services and pricing subject areas. Each component price shows up as a separate line item on the ErpInvoice.\nThe Customer Billing Statement may include collection and account messages, marketing/civic event messages and bill inserts.\nOne Customer Billing Statement is produced for all Agreements under a CustomerAccount per billing cycle date defined in \'CustomerAccount.billingCycle\'.\nThe history of CustomerBillingInfo, Invoices and Payments is to be maintained in associated ActivityRecords.' Profile\040documentation='The creation of the monthly customer billing statements is the method employed to notify Customers of charges, adjustments and credits applied to their account for Services and Products. The actuall billing occurs through an ErpInvoice. The CustomerBillingInfo includes information from the payment, collection, meter reading, installed meter, service, site, customer, customer account, customer agreement, services and pricing subject areas. Each component price shows up as a separate line item on the ErpInvoice.\nThe Customer Billing Statement may include collection and account messages, marketing/civic event messages and bill inserts.\nOne Customer Billing Statement is produced for all Agreements under a CustomerAccount per billing cycle date defined in \'CustomerAccount.billingCycle\'.\nThe history of CustomerBillingInfo, Invoices and Payments is to be maintained in associated ActivityRecords.'"
 * @generated
 */
public interface CustomerBillingInfo extends Document {
	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(String)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_DueDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Calculated date upon which a customer billing amount is due, used in the invoicing process to determine when a Customer\'s Payment is delinquent. It takes into consideration the regulatory criteria and the Customer\'s requested due date. In the absence of a Customer requested due date, the due date is typically calculated from the regulated number of days and the \'billingDate\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Calculated date upon which a customer billing amount is due, used in the invoicing process to determine when a Customer\'s Payment is delinquent. It takes into consideration the regulatory criteria and the Customer\'s requested due date. In the absence of a Customer requested due date, the due date is typically calculated from the regulated number of days and the \'billingDate\'.'"
	 * @generated
	 */
	String getDueDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(String value);

	/**
	 * Returns the value of the '<em><b>Pymt Plan Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pymt Plan Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pymt Plan Amt</em>' attribute.
	 * @see #setPymtPlanAmt(float)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_PymtPlanAmt()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Monthly amortized amount due during each billing cycle for the CustomerAccount balance for which the Payment Plan is set-up.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Monthly amortized amount due during each billing cycle for the CustomerAccount balance for which the Payment Plan is set-up.'"
	 * @generated
	 */
	float getPymtPlanAmt();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanAmt <em>Pymt Plan Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pymt Plan Amt</em>' attribute.
	 * @see #getPymtPlanAmt()
	 * @generated
	 */
	void setPymtPlanAmt(float value);

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.CustomerAccount#getCustomerBillingInfos <em>Customer Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_CustomerAccount()
	 * @see CIM.IEC61968.Customers.CustomerAccount#getCustomerBillingInfos
	 * @model opposite="CustomerBillingInfos"
	 * @generated
	 */
	CustomerAccount getCustomerAccount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Account</em>' reference.
	 * @see #getCustomerAccount()
	 * @generated
	 */
	void setCustomerAccount(CustomerAccount value);

	/**
	 * Returns the value of the '<em><b>Last Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Payment Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Payment Date</em>' attribute.
	 * @see #setLastPaymentDate(String)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_LastPaymentDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date of the last payment received from the customer. It is retained in the Customer Billing system, although the details of each payment are tracked in the ERP system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date of the last payment received from the customer. It is retained in the Customer Billing system, although the details of each payment are tracked in the ERP system.'"
	 * @generated
	 */
	String getLastPaymentDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentDate <em>Last Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Payment Date</em>' attribute.
	 * @see #getLastPaymentDate()
	 * @generated
	 */
	void setLastPaymentDate(String value);

	/**
	 * Returns the value of the '<em><b>Billing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Date</em>' attribute.
	 * @see #setBillingDate(String)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_BillingDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Business date designated for the billing run which produced this CustomerBillingInfo.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Business date designated for the billing run which produced this CustomerBillingInfo.'"
	 * @generated
	 */
	String getBillingDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getBillingDate <em>Billing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Date</em>' attribute.
	 * @see #getBillingDate()
	 * @generated
	 */
	void setBillingDate(String value);

	/**
	 * Returns the value of the '<em><b>Last Payment Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Payment Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Payment Amt</em>' attribute.
	 * @see #setLastPaymentAmt(float)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_LastPaymentAmt()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount of the last payment received from the customer. It is retained in the Customer Billing system, although the details of each payment are tracked in the ERP system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount of the last payment received from the customer. It is retained in the Customer Billing system, although the details of each payment are tracked in the ERP system.'"
	 * @generated
	 */
	float getLastPaymentAmt();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentAmt <em>Last Payment Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Payment Amt</em>' attribute.
	 * @see #getLastPaymentAmt()
	 * @generated
	 */
	void setLastPaymentAmt(float value);

	/**
	 * Returns the value of the '<em><b>Pymt Plan Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pymt Plan Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pymt Plan Type</em>' attribute.
	 * @see #setPymtPlanType(String)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_PymtPlanType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of payment plan.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of payment plan.'"
	 * @generated
	 */
	String getPymtPlanType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanType <em>Pymt Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pymt Plan Type</em>' attribute.
	 * @see #getPymtPlanType()
	 * @generated
	 */
	void setPymtPlanType(String value);

	/**
	 * Returns the value of the '<em><b>Out Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Balance</em>' attribute.
	 * @see #setOutBalance(float)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_OutBalance()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Outstanding balance on the CustomerAccount as of the statement date.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Outstanding balance on the CustomerAccount as of the statement date.'"
	 * @generated
	 */
	float getOutBalance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getOutBalance <em>Out Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Balance</em>' attribute.
	 * @see #getOutBalance()
	 * @generated
	 */
	void setOutBalance(float value);

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos <em>Customer Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_ErpInvoiceLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos
	 * @model opposite="CustomerBillingInfos"
	 * @generated
	 */
	EList<ErpInvoiceLineItem> getErpInvoiceLineItems();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind
	 * @see #setKind(CustomerBillingKind)
	 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingInfo_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of bill customer receives.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of bill customer receives.'"
	 * @generated
	 */
	CustomerBillingKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CustomerBillingKind value);

} // CustomerBillingInfo
