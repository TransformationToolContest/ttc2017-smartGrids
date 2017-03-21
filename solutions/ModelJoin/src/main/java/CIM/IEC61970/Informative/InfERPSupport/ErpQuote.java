/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Quote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems <em>Erp Quote Line Items</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuote()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Document describing the prices of goods or services provided by a supplier. It includes the terms of the purchase, delivery proposals, identification of goods or services ordered, as well as their quantities.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Document describing the prices of goods or services provided by a supplier. It includes the terms of the purchase, delivery proposals, identification of goods or services ordered, as well as their quantities.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Document describing the prices of goods or services provided by a supplier. It includes the terms of the purchase, delivery proposals, identification of goods or services ordered, as well as their quantities.' Profile\040documentation='Document describing the prices of goods or services provided by a supplier. It includes the terms of the purchase, delivery proposals, identification of goods or services ordered, as well as their quantities.'"
 * @generated
 */
public interface ErpQuote extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Quote Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote <em>Erp Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuote_ErpQuoteLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote
	 * @model opposite="ErpQuote"
	 * @generated
	 */
	EList<ErpQuoteLineItem> getErpQuoteLineItems();

} // ErpQuote
