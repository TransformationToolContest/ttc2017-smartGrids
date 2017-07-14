/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Receive Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReceiveDelivery()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transaction for an Organisation receiving goods or services that may be used to indicate receipt of goods in conjunction with a purchase order. A receivable is an open (unpaid) item in the Accounts Receivable ledger.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Transaction for an Organisation receiving goods or services that may be used to indicate receipt of goods in conjunction with a purchase order. A receivable is an open (unpaid) item in the Accounts Receivable ledger.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transaction for an Organisation receiving goods or services that may be used to indicate receipt of goods in conjunction with a purchase order. A receivable is an open (unpaid) item in the Accounts Receivable ledger.' Profile\040documentation='Transaction for an Organisation receiving goods or services that may be used to indicate receipt of goods in conjunction with a purchase order. A receivable is an open (unpaid) item in the Accounts Receivable ledger.'"
 * @generated
 */
public interface ErpReceiveDelivery extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Rec Delv Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery <em>Erp Receive Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Delv Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Delv Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReceiveDelivery_ErpRecDelvLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery
	 * @model opposite="ErpReceiveDelivery"
	 * @generated
	 */
	EList<ErpRecDelvLineItem> getErpRecDelvLineItems();

} // ErpReceiveDelivery
