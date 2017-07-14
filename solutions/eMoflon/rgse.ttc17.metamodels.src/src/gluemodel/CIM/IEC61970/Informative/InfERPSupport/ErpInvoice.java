/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Customers.CustomerAccount;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate <em>Mailed Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType <em>Transfer Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma <em>Pro Forma</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind <em>Bill Media Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A roll up of invoice line items. The whole invoice has a due date and amount to be paid, with information such as customer, banks etc. being obtained through associations. The invoice roll up is based on individual line items that each contain amounts and descriptions for specific services or products.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A roll up of invoice line items. The whole invoice has a due date and amount to be paid, with information such as customer, banks etc. being obtained through associations. The invoice roll up is based on individual line items that each contain amounts and descriptions for specific services or products.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A roll up of invoice line items. The whole invoice has a due date and amount to be paid, with information such as customer, banks etc. being obtained through associations. The invoice roll up is based on individual line items that each contain amounts and descriptions for specific services or products.' Profile\040documentation='A roll up of invoice line items. The whole invoice has a due date and amount to be paid, with information such as customer, banks etc. being obtained through associations. The invoice roll up is based on individual line items that each contain amounts and descriptions for specific services or products.'"
 * @generated
 */
public interface ErpInvoice extends Document {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_Amount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total amount due on this invoice based on line items and applicable adjustments.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total amount due on this invoice based on line items and applicable adjustments.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
	 * @see #setKind(ErpInvoiceKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of invoice (default is \'sales\').'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of invoice (default is \'sales\').'"
	 * @generated
	 */
	ErpInvoiceKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ErpInvoiceKind value);

	/**
	 * Returns the value of the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #setTransactionDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_TransactionDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time when the invoice is issued.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time when the invoice is issued.'"
	 * @generated
	 */
	Date getTransactionDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #getTransactionDateTime()
	 * @generated
	 */
	void setTransactionDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_ReferenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of an invoice to be reference by this invoice.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of an invoice to be reference by this invoice.'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_DueDate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Calculated date upon which the Invoice amount is due.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Calculated date upon which the Invoice amount is due.'"
	 * @generated
	 */
	String getDueDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(String value);

	/**
	 * Returns the value of the '<em><b>Mailed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mailed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mailed Date</em>' attribute.
	 * @see #setMailedDate(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_MailedDate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date on which the customer billing statement/invoice was printed/mailed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date on which the customer billing statement/invoice was printed/mailed.'"
	 * @generated
	 */
	String getMailedDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate <em>Mailed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mailed Date</em>' attribute.
	 * @see #getMailedDate()
	 * @generated
	 */
	void setMailedDate(String value);

	/**
	 * Returns the value of the '<em><b>Transfer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Type</em>' attribute.
	 * @see #setTransferType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_TransferType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of invoice transfer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of invoice transfer.'"
	 * @generated
	 */
	String getTransferType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Type</em>' attribute.
	 * @see #getTransferType()
	 * @generated
	 */
	void setTransferType(String value);

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount#getErpInvoicees <em>Erp Invoicees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_CustomerAccount()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount#getErpInvoicees
	 * @model opposite="ErpInvoicees"
	 * @generated
	 */
	CustomerAccount getCustomerAccount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Account</em>' reference.
	 * @see #getCustomerAccount()
	 * @generated
	 */
	void setCustomerAccount(CustomerAccount value);

	/**
	 * Returns the value of the '<em><b>Pro Forma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pro Forma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pro Forma</em>' attribute.
	 * @see #setProForma(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_ProForma()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if payment is to be paid by a Customer to accept a particular ErpQuote (with associated Design) and have work initiated, at which time an associated ErpInvoice should automatically be generated. EprPayment.subjectStatus satisfies terms specificed in the ErpQuote.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if payment is to be paid by a Customer to accept a particular ErpQuote (with associated Design) and have work initiated, at which time an associated ErpInvoice should automatically be generated. EprPayment.subjectStatus satisfies terms specificed in the ErpQuote.'"
	 * @generated
	 */
	boolean isProForma();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma <em>Pro Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pro Forma</em>' attribute.
	 * @see #isProForma()
	 * @generated
	 */
	void setProForma(boolean value);

	/**
	 * Returns the value of the '<em><b>Bill Media Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Media Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Media Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind
	 * @see #setBillMediaKind(BillMediaKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_BillMediaKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of media by which the CustomerBillingInfo was delivered.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of media by which the CustomerBillingInfo was delivered.'"
	 * @generated
	 */
	BillMediaKind getBillMediaKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind <em>Bill Media Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Media Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.BillMediaKind
	 * @see #getBillMediaKind()
	 * @generated
	 */
	void setBillMediaKind(BillMediaKind value);

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice <em>Erp Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice_ErpInvoiceLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice
	 * @model opposite="ErpInvoice"
	 * @generated
	 */
	EList<ErpInvoiceLineItem> getErpInvoiceLineItems();

} // ErpInvoice
