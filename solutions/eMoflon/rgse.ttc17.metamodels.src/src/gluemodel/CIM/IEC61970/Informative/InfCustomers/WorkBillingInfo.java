/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCustomers;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Customers.CustomerAccount;

import gluemodel.CIM.IEC61968.Work.Work;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Billing Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getReceivedDateTime <em>Received Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDiscount <em>Discount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getIssueDateTime <em>Issue Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getErpLineItems <em>Erp Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDueDateTime <em>Due Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDeposit <em>Deposit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorks <em>Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorkPrice <em>Work Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCostEstimate <em>Cost Estimate</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Billing information for work performed for the customer. The history of Work Billing Info, Invoices, and Payments is to be maintained in associated ActivityRecords.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Billing information for work performed for the customer. The history of Work Billing Info, Invoices, and Payments is to be maintained in associated ActivityRecords.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Billing information for work performed for the customer. The history of Work Billing Info, Invoices, and Payments is to be maintained in associated ActivityRecords.' Profile\040documentation='Billing information for work performed for the customer. The history of Work Billing Info, Invoices, and Payments is to be maintained in associated ActivityRecords.'"
 * @generated
 */
public interface WorkBillingInfo extends Document {
	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount#getWorkBillingInfos <em>Work Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_CustomerAccount()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount#getWorkBillingInfos
	 * @model opposite="WorkBillingInfos"
	 * @generated
	 */
	CustomerAccount getCustomerAccount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Account</em>' reference.
	 * @see #getCustomerAccount()
	 * @generated
	 */
	void setCustomerAccount(CustomerAccount value);

	/**
	 * Returns the value of the '<em><b>Received Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Date Time</em>' attribute.
	 * @see #setReceivedDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_ReceivedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date payment was received from client.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date payment was received from client.'"
	 * @generated
	 */
	Date getReceivedDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getReceivedDateTime <em>Received Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Date Time</em>' attribute.
	 * @see #getReceivedDateTime()
	 * @generated
	 */
	void setReceivedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_Discount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Discount from standard price.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Discount from standard price.'"
	 * @generated
	 */
	float getDiscount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(float value);

	/**
	 * Returns the value of the '<em><b>Issue Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date Time</em>' attribute.
	 * @see #setIssueDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_IssueDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time bill was issued to client.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time bill was issued to client.'"
	 * @generated
	 */
	Date getIssueDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getIssueDateTime <em>Issue Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date Time</em>' attribute.
	 * @see #getIssueDateTime()
	 * @generated
	 */
	void setIssueDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Erp Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos <em>Work Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_ErpLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos
	 * @model opposite="WorkBillingInfos"
	 * @generated
	 */
	EList<ErpInvoiceLineItem> getErpLineItems();

	/**
	 * Returns the value of the '<em><b>Due Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date Time</em>' attribute.
	 * @see #setDueDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_DueDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time by which payment for bill is expected from client.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time by which payment for bill is expected from client.'"
	 * @generated
	 */
	Date getDueDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDueDateTime <em>Due Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date Time</em>' attribute.
	 * @see #getDueDateTime()
	 * @generated
	 */
	void setDueDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Deposit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposit</em>' attribute.
	 * @see #setDeposit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_Deposit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount of price on deposit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount of price on deposit.'"
	 * @generated
	 */
	float getDeposit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDeposit <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposit</em>' attribute.
	 * @see #getDeposit()
	 * @generated
	 */
	void setDeposit(float value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Work.Work#getWorkBillingInfo <em>Work Billing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_Works()
	 * @see gluemodel.CIM.IEC61968.Work.Work#getWorkBillingInfo
	 * @model opposite="WorkBillingInfo"
	 * @generated
	 */
	EList<Work> getWorks();

	/**
	 * Returns the value of the '<em><b>Work Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Price</em>' attribute.
	 * @see #setWorkPrice(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_WorkPrice()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount of bill.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount of bill.'"
	 * @generated
	 */
	float getWorkPrice();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorkPrice <em>Work Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Price</em>' attribute.
	 * @see #getWorkPrice()
	 * @generated
	 */
	void setWorkPrice(float value);

	/**
	 * Returns the value of the '<em><b>Cost Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Estimate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Estimate</em>' attribute.
	 * @see #setCostEstimate(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage#getWorkBillingInfo_CostEstimate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated cost for work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated cost for work.'"
	 * @generated
	 */
	float getCostEstimate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCostEstimate <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Estimate</em>' attribute.
	 * @see #getCostEstimate()
	 * @generated
	 */
	void setCostEstimate(float value);

} // WorkBillingInfo
