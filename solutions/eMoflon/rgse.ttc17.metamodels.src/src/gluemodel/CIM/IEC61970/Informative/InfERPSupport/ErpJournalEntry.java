/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfWork.CostType;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Journal Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal <em>Erp Journal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime <em>Posting Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes <em>Cost Types</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpPayableLineItems <em>Erp Payable Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpRecLineItems <em>Erp Rec Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID <em>Source ID</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details of an individual entry in a journal, which is to be posted to a ledger on the posting date.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Details of an individual entry in a journal, which is to be posted to a ledger on the posting date.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details of an individual entry in a journal, which is to be posted to a ledger on the posting date.' Profile\040documentation='Details of an individual entry in a journal, which is to be posted to a ledger on the posting date.'"
 * @generated
 */
public interface ErpJournalEntry extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_AccountID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Account identifier for this entry.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Account identifier for this entry.'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

	/**
	 * Returns the value of the '<em><b>Erp Ledger Entry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry <em>Erp Jounal Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Entry</em>' reference.
	 * @see #setErpLedgerEntry(ErpLedgerEntry)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_ErpLedgerEntry()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry
	 * @model opposite="ErpJounalEntry"
	 * @generated
	 */
	ErpLedgerEntry getErpLedgerEntry();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Ledger Entry</em>' reference.
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	void setErpLedgerEntry(ErpLedgerEntry value);

	/**
	 * Returns the value of the '<em><b>Erp Journal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal</em>' reference.
	 * @see #setErpJournal(ErpJournal)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_ErpJournal()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries
	 * @model opposite="ErpJournalEntries"
	 * @generated
	 */
	ErpJournal getErpJournal();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal <em>Erp Journal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Journal</em>' reference.
	 * @see #getErpJournal()
	 * @generated
	 */
	void setErpJournal(ErpJournal value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_Amount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount of the debit or credit for this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount of the debit or credit for this account.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Posting Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posting Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posting Date Time</em>' attribute.
	 * @see #setPostingDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_PostingDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time this entry is to be posted to the ledger.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time this entry is to be posted to the ledger.'"
	 * @generated
	 */
	Date getPostingDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime <em>Posting Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posting Date Time</em>' attribute.
	 * @see #getPostingDateTime()
	 * @generated
	 */
	void setPostingDateTime(Date value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_TransactionDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time journal entry was recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time journal entry was recorded.'"
	 * @generated
	 */
	Date getTransactionDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #getTransactionDateTime()
	 * @generated
	 */
	void setTransactionDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Cost Types</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.CostType}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CostType#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Types</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_CostTypes()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CostType#getErpJournalEntries
	 * @model opposite="ErpJournalEntries"
	 * @generated
	 */
	EList<CostType> getCostTypes();

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #setErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_ErpInvoiceLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries
	 * @model opposite="ErpJournalEntries"
	 * @generated
	 */
	ErpInvoiceLineItem getErpInvoiceLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	void setErpInvoiceLineItem(ErpInvoiceLineItem value);

	/**
	 * Returns the value of the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payable Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payable Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_ErpPayableLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries
	 * @model opposite="ErpJournalEntries"
	 * @generated
	 */
	EList<ErpPayableLineItem> getErpPayableLineItems();

	/**
	 * Returns the value of the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_ErpRecLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries
	 * @model opposite="ErpJournalEntries"
	 * @generated
	 */
	EList<ErpRecLineItem> getErpRecLineItems();

	/**
	 * Returns the value of the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ID</em>' attribute.
	 * @see #setSourceID(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry_SourceID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The identifer of the source for this entry.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The identifer of the source for this entry.'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

} // ErpJournalEntry
