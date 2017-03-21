/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpPayableLineItems <em>Erp Payable Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment <em>Terms Payment</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getErpRecLineItems <em>Erp Rec Line Items</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Payment infromation and status for any individual line item of an ErpInvoice (e.g., when payment is from a customer). ErpPayable is also updated when payment is to a supplier and ErpReceivable is updated when payment is from a customer. Multiple payments can be made against a single line item and an individual payment can apply to more that one line item.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Payment infromation and status for any individual line item of an ErpInvoice (e.g., when payment is from a customer). ErpPayable is also updated when payment is to a supplier and ErpReceivable is updated when payment is from a customer. Multiple payments can be made against a single line item and an individual payment can apply to more that one line item.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Payment infromation and status for any individual line item of an ErpInvoice (e.g., when payment is from a customer). ErpPayable is also updated when payment is to a supplier and ErpReceivable is updated when payment is from a customer. Multiple payments can be made against a single line item and an individual payment can apply to more that one line item.' Profile\040documentation='Payment infromation and status for any individual line item of an ErpInvoice (e.g., when payment is from a customer). ErpPayable is also updated when payment is to a supplier and ErpReceivable is updated when payment is from a customer. Multiple payments can be made against a single line item and an individual payment can apply to more that one line item.'"
 * @generated
 */
public interface ErpPayment extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payable Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payable Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayment_ErpPayableLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments
	 * @model opposite="ErpPayments"
	 * @generated
	 */
	EList<ErpPayableLineItem> getErpPayableLineItems();

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayment_ErpInvoiceLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments
	 * @model opposite="ErpPayments"
	 * @generated
	 */
	EList<ErpInvoiceLineItem> getErpInvoiceLineItems();

	/**
	 * Returns the value of the '<em><b>Terms Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms Payment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms Payment</em>' attribute.
	 * @see #setTermsPayment(String)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayment_TermsPayment()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Payment terms (e.g., net 30).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Payment terms (e.g., net 30).'"
	 * @generated
	 */
	String getTermsPayment();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment <em>Terms Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Payment</em>' attribute.
	 * @see #getTermsPayment()
	 * @generated
	 */
	void setTermsPayment(String value);

	/**
	 * Returns the value of the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayment_ErpRecLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments
	 * @model opposite="ErpPayments"
	 * @generated
	 */
	EList<ErpRecLineItem> getErpRecLineItems();

} // ErpPayment
