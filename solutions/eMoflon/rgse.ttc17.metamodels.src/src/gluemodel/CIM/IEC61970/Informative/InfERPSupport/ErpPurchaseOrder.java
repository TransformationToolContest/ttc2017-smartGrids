/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPurchaseOrder()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A document that communicates an order to purchase goods from a buyer to a supplier. The PurchaseOrder carries information to and from the buyer and supplier. It is a legally binding document once both Parties agree to the contents and the specified terms and conditions of the order.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A document that communicates an order to purchase goods from a buyer to a supplier. The PurchaseOrder carries information to and from the buyer and supplier. It is a legally binding document once both Parties agree to the contents and the specified terms and conditions of the order.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A document that communicates an order to purchase goods from a buyer to a supplier. The PurchaseOrder carries information to and from the buyer and supplier. It is a legally binding document once both Parties agree to the contents and the specified terms and conditions of the order.' Profile\040documentation='A document that communicates an order to purchase goods from a buyer to a supplier. The PurchaseOrder carries information to and from the buyer and supplier. It is a legally binding document once both Parties agree to the contents and the specified terms and conditions of the order.'"
 * @generated
 */
public interface ErpPurchaseOrder extends Document {
	/**
	 * Returns the value of the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder <em>Erp Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPurchaseOrder_ErpPOLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder
	 * @model opposite="ErpPurchaseOrder"
	 * @generated
	 */
	EList<ErpPOLineItem> getErpPOLineItems();

} // ErpPurchaseOrder
