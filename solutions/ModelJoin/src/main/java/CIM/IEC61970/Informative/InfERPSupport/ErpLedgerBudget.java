/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Ledger Budget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems <em>Erp Led Bud Line Items</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerBudget()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information for utility Ledger Budgets. They support the transfer budget amounts between all possible source applications throughout an enterprise and a general ledger or budget application.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Information for utility Ledger Budgets. They support the transfer budget amounts between all possible source applications throughout an enterprise and a general ledger or budget application.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information for utility Ledger Budgets. They support the transfer budget amounts between all possible source applications throughout an enterprise and a general ledger or budget application.' Profile\040documentation='Information for utility Ledger Budgets. They support the transfer budget amounts between all possible source applications throughout an enterprise and a general ledger or budget application.'"
 * @generated
 */
public interface ErpLedgerBudget extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Led Bud Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget <em>Erp Ledger Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Led Bud Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Led Bud Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerBudget_ErpLedBudLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget
	 * @model opposite="ErpLedgerBudget"
	 * @generated
	 */
	EList<ErpLedBudLineItem> getErpLedBudLineItems();

} // ErpLedgerBudget
