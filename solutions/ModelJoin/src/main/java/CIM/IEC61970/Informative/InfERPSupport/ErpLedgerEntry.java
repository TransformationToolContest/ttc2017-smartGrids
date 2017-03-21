/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Status;
import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.MarketOperations.Settlement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Ledger Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry <em>Erp Jounal Entry</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getSettlements <em>Settlements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime <em>Posted Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind <em>Account Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedger <em>Erp Ledger</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details of an individual entry in a ledger, which was posted from a journal on the posted date.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Details of an individual entry in a ledger, which was posted from a journal on the posted date.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details of an individual entry in a ledger, which was posted from a journal on the posted date.' Profile\040documentation='Details of an individual entry in a ledger, which was posted from a journal on the posted date.'"
 * @generated
 */
public interface ErpLedgerEntry extends IdentifiedObject {
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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_TransactionDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time journal entry was recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time journal entry was recorded.'"
	 * @generated
	 */
	Date getTransactionDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #getTransactionDateTime()
	 * @generated
	 */
	void setTransactionDateTime(Date value);

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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_AccountID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Account identifier for this entry.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Account identifier for this entry.'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

	/**
	 * Returns the value of the '<em><b>Erp Jounal Entry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Jounal Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Jounal Entry</em>' reference.
	 * @see #setErpJounalEntry(ErpJournalEntry)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_ErpJounalEntry()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry
	 * @model opposite="ErpLedgerEntry"
	 * @generated
	 */
	ErpJournalEntry getErpJounalEntry();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry <em>Erp Jounal Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Jounal Entry</em>' reference.
	 * @see #getErpJounalEntry()
	 * @generated
	 */
	void setErpJounalEntry(ErpJournalEntry value);

	/**
	 * Returns the value of the '<em><b>Erp Ledger Entry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Entry</em>' reference.
	 * @see #setErpLedgerEntry(ErpLedBudLineItem)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_ErpLedgerEntry()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem
	 * @model opposite="ErpLedBudLineItem"
	 * @generated
	 */
	ErpLedBudLineItem getErpLedgerEntry();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Ledger Entry</em>' reference.
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	void setErpLedgerEntry(ErpLedBudLineItem value);

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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_Amount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount of the debit or credit for this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount of the debit or credit for this account.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.UserAttribute#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_UserAttributes()
	 * @see CIM.IEC61968.Common.UserAttribute#getErpLedgerEntries
	 * @model opposite="ErpLedgerEntries"
	 * @generated
	 */
	EList<UserAttribute> getUserAttributes();

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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Settlements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.Settlement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Settlement#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlements</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_Settlements()
	 * @see CIM.IEC61970.Informative.MarketOperations.Settlement#getErpLedgerEntries
	 * @model opposite="ErpLedgerEntries"
	 * @generated
	 */
	EList<Settlement> getSettlements();

	/**
	 * Returns the value of the '<em><b>Posted Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date Time</em>' attribute.
	 * @see #setPostedDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_PostedDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time this entry was posted to the ledger.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time this entry was posted to the ledger.'"
	 * @generated
	 */
	Date getPostedDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date Time</em>' attribute.
	 * @see #getPostedDateTime()
	 * @generated
	 */
	void setPostedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Account Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind
	 * @see #setAccountKind(ErpAccountKind)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_AccountKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of account for this entry.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of account for this entry.'"
	 * @generated
	 */
	ErpAccountKind getAccountKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind <em>Account Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Kind</em>' attribute.
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind
	 * @see #getAccountKind()
	 * @generated
	 */
	void setAccountKind(ErpAccountKind value);

	/**
	 * Returns the value of the '<em><b>Erp Ledger</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedger#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger</em>' reference.
	 * @see #setErpLedger(ErpLedger)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry_ErpLedger()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpLedger#getErpLedgerEntries
	 * @model opposite="ErpLedgerEntries"
	 * @generated
	 */
	ErpLedger getErpLedger();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedger <em>Erp Ledger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Ledger</em>' reference.
	 * @see #getErpLedger()
	 * @generated
	 */
	void setErpLedger(ErpLedger value);

} // ErpLedgerEntry
