/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Payable Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments <em>Erp Payments</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayable <em>Erp Payable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayableLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Of an ErpPayable, a line item references an ErpInvoiceLineitem or other source such as credit memos.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Of an ErpPayable, a line item references an ErpInvoiceLineitem or other source such as credit memos.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Of an ErpPayable, a line item references an ErpInvoiceLineitem or other source such as credit memos.' Profile\040documentation='Of an ErpPayable, a line item references an ErpInvoiceLineitem or other source such as credit memos.'"
 * @generated
 */
public interface ErpPayableLineItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem <em>Erp Payable Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #setErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayableLineItem_ErpInvoiceLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem
	 * @model opposite="ErpPayableLineItem"
	 * @generated
	 */
	ErpInvoiceLineItem getErpInvoiceLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' reference.
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
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payments</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayableLineItem_ErpPayments()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpPayableLineItems
	 * @model opposite="ErpPayableLineItems"
	 * @generated
	 */
	EList<ErpPayment> getErpPayments();

	/**
	 * Returns the value of the '<em><b>Erp Payable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payable</em>' reference.
	 * @see #setErpPayable(ErpPayable)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayableLineItem_ErpPayable()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getErpPayableLineItems
	 * @model opposite="ErpPayableLineItems"
	 * @generated
	 */
	ErpPayable getErpPayable();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayable <em>Erp Payable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Payable</em>' reference.
	 * @see #getErpPayable()
	 * @generated
	 */
	void setErpPayable(ErpPayable value);

	/**
	 * Returns the value of the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal Entries</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayableLineItem_ErpJournalEntries()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpPayableLineItems
	 * @model opposite="ErpPayableLineItems"
	 * @generated
	 */
	EList<ErpJournalEntry> getErpJournalEntries();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayableLineItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // ErpPayableLineItem
