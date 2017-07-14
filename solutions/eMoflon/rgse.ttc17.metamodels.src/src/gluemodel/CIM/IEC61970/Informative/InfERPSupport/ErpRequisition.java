/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Requisition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems <em>Erp Req Line Items</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRequisition()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='General information that applies to a utility requisition that is a request for the purchase of goods or services. Typically, a requisition leads to the creation of a purchase order to a specific supplier.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='General information that applies to a utility requisition that is a request for the purchase of goods or services. Typically, a requisition leads to the creation of a purchase order to a specific supplier.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='General information that applies to a utility requisition that is a request for the purchase of goods or services. Typically, a requisition leads to the creation of a purchase order to a specific supplier.' Profile\040documentation='General information that applies to a utility requisition that is a request for the purchase of goods or services. Typically, a requisition leads to the creation of a purchase order to a specific supplier.'"
 * @generated
 */
public interface ErpRequisition extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition <em>Erp Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Req Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Req Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRequisition_ErpReqLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition
	 * @model opposite="ErpRequisition"
	 * @generated
	 */
	EList<ErpReqLineItem> getErpReqLineItems();

} // ErpRequisition
