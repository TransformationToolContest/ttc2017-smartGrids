/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Receivable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpReceivable#getErpRecLineItems <em>Erp Rec Line Items</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReceivable()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transaction representing an invoice, credit memo or debit memo to a customer. It is an open (unpaid) item in the Accounts Receivable ledger.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Transaction representing an invoice, credit memo or debit memo to a customer. It is an open (unpaid) item in the Accounts Receivable ledger.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transaction representing an invoice, credit memo or debit memo to a customer. It is an open (unpaid) item in the Accounts Receivable ledger.' Profile\040documentation='Transaction representing an invoice, credit memo or debit memo to a customer. It is an open (unpaid) item in the Accounts Receivable ledger.'"
 * @generated
 */
public interface ErpReceivable extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpReceivable <em>Erp Receivable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReceivable_ErpRecLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpReceivable
	 * @model opposite="ErpReceivable"
	 * @generated
	 */
	EList<ErpRecLineItem> getErpRecLineItems();

} // ErpReceivable
