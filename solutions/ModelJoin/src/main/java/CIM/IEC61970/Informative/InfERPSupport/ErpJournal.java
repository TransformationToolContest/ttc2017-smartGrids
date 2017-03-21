/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Journal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournal()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Book for recording accounting transactions as they occur. Transactions and adjustments are first recorded in a journal, which is like a diary of instructions, advising which account to be charged and by how much.\nA journal represents a change in the balances of a business\'s financial accounts. Many tasks or transactions throughout an enterprise will result in the creation of a journal. Some examples are creating a customer invoice, paying a vendor, transferring inventory, or paying employees.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Book for recording accounting transactions as they occur. Transactions and adjustments are first recorded in a journal, which is like a diary of instructions, advising which account to be charged and by how much.\nA journal represents a change in the balances of a business\'s financial accounts. Many tasks or transactions throughout an enterprise will result in the creation of a journal. Some examples are creating a customer invoice, paying a vendor, transferring inventory, or paying employees.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Book for recording accounting transactions as they occur. Transactions and adjustments are first recorded in a journal, which is like a diary of instructions, advising which account to be charged and by how much.\nA journal represents a change in the balances of a business\'s financial accounts. Many tasks or transactions throughout an enterprise will result in the creation of a journal. Some examples are creating a customer invoice, paying a vendor, transferring inventory, or paying employees.' Profile\040documentation='Book for recording accounting transactions as they occur. Transactions and adjustments are first recorded in a journal, which is like a diary of instructions, advising which account to be charged and by how much.\nA journal represents a change in the balances of a business\'s financial accounts. Many tasks or transactions throughout an enterprise will result in the creation of a journal. Some examples are creating a customer invoice, paying a vendor, transferring inventory, or paying employees.'"
 * @generated
 */
public interface ErpJournal extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal <em>Erp Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal Entries</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournal_ErpJournalEntries()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal
	 * @model opposite="ErpJournal"
	 * @generated
	 */
	EList<ErpJournalEntry> getErpJournalEntries();

} // ErpJournal
