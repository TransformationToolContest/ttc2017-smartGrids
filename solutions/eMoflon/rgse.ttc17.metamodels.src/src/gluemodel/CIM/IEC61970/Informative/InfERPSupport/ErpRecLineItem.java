/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Rec Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpReceivable <em>Erp Receivable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments <em>Erp Payments</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Individual entry of an ErpReceivable, it is a particular transaction representing an invoice, credit memo or debit memo to a customer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Individual entry of an ErpReceivable, it is a particular transaction representing an invoice, credit memo or debit memo to a customer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Individual entry of an ErpReceivable, it is a particular transaction representing an invoice, credit memo or debit memo to a customer.' Profile\040documentation='Individual entry of an ErpReceivable, it is a particular transaction representing an invoice, credit memo or debit memo to a customer.'"
 * @generated
 */
public interface ErpRecLineItem extends IdentifiedObject {
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecLineItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal Entries</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecLineItem_ErpJournalEntries()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpRecLineItems
	 * @model opposite="ErpRecLineItems"
	 * @generated
	 */
	EList<ErpJournalEntry> getErpJournalEntries();

	/**
	 * Returns the value of the '<em><b>Erp Receivable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceivable#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Receivable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Receivable</em>' reference.
	 * @see #setErpReceivable(ErpReceivable)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecLineItem_ErpReceivable()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceivable#getErpRecLineItems
	 * @model opposite="ErpRecLineItems"
	 * @generated
	 */
	ErpReceivable getErpReceivable();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpReceivable <em>Erp Receivable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Receivable</em>' reference.
	 * @see #getErpReceivable()
	 * @generated
	 */
	void setErpReceivable(ErpReceivable value);

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem <em>Erp Rec Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #setErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecLineItem_ErpInvoiceLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem
	 * @model opposite="ErpRecLineItem"
	 * @generated
	 */
	ErpInvoiceLineItem getErpInvoiceLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	void setErpInvoiceLineItem(ErpInvoiceLineItem value);

	/**
	 * Returns the value of the '<em><b>Erp Payments</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payments</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecLineItem_ErpPayments()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpRecLineItems
	 * @model opposite="ErpRecLineItems"
	 * @generated
	 */
	EList<ErpPayment> getErpPayments();

} // ErpRecLineItem
