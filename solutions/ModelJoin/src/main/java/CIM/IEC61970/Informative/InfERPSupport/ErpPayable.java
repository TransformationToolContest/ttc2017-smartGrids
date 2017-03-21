/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfWork.ContractorItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Payable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems <em>Contractor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getErpPayableLineItems <em>Erp Payable Line Items</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayable()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A transaction that represents an invoice from a supplier. A payable (or voucher) is an open item, approved and ready for payment, in the Accounts Payable ledger.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A transaction that represents an invoice from a supplier. A payable (or voucher) is an open item, approved and ready for payment, in the Accounts Payable ledger.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transaction that represents an invoice from a supplier. A payable (or voucher) is an open item, approved and ready for payment, in the Accounts Payable ledger.' Profile\040documentation='A transaction that represents an invoice from a supplier. A payable (or voucher) is an open item, approved and ready for payment, in the Accounts Payable ledger.'"
 * @generated
 */
public interface ErpPayable extends Document {
	/**
	 * Returns the value of the '<em><b>Contractor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.ContractorItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getErpPayables <em>Erp Payables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractor Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayable_ContractorItems()
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getErpPayables
	 * @model opposite="ErpPayables"
	 * @generated
	 */
	EList<ContractorItem> getContractorItems();

	/**
	 * Returns the value of the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayable <em>Erp Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payable Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payable Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayable_ErpPayableLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayable
	 * @model opposite="ErpPayable"
	 * @generated
	 */
	EList<ErpPayableLineItem> getErpPayableLineItems();

} // ErpPayable
