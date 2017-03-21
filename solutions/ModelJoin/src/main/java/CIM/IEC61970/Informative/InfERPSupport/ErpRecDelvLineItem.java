/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfWork.MaterialItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Rec Delv Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery <em>Erp Receive Delivery</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Of an ErpReceiveDelivery, this is an individually received good or service by the Organisation receiving goods or services. It may be used to indicate receipt of goods in conjunction with a purchase order line item.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Of an ErpReceiveDelivery, this is an individually received good or service by the Organisation receiving goods or services. It may be used to indicate receipt of goods in conjunction with a purchase order line item.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Of an ErpReceiveDelivery, this is an individually received good or service by the Organisation receiving goods or services. It may be used to indicate receipt of goods in conjunction with a purchase order line item.' Profile\040documentation='Of an ErpReceiveDelivery, this is an individually received good or service by the Organisation receiving goods or services. It may be used to indicate receipt of goods in conjunction with a purchase order line item.'"
 * @generated
 */
public interface ErpRecDelvLineItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Erp PO Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem <em>Erp Rec Del Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Item</em>' reference.
	 * @see #setErpPOLineItem(ErpPOLineItem)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem_ErpPOLineItem()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem
	 * @model opposite="ErpRecDelLineItem"
	 * @generated
	 */
	ErpPOLineItem getErpPOLineItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp PO Line Item</em>' reference.
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	void setErpPOLineItem(ErpPOLineItem value);

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #setErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem_ErpInvoiceLineItem()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem
	 * @model opposite="ErpRecDelvLineItem"
	 * @generated
	 */
	ErpInvoiceLineItem getErpInvoiceLineItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	void setErpInvoiceLineItem(ErpInvoiceLineItem value);

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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Erp Receive Delivery</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Receive Delivery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Receive Delivery</em>' reference.
	 * @see #setErpReceiveDelivery(ErpReceiveDelivery)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem_ErpReceiveDelivery()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems
	 * @model opposite="ErpRecDelvLineItems"
	 * @generated
	 */
	ErpReceiveDelivery getErpReceiveDelivery();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery <em>Erp Receive Delivery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Receive Delivery</em>' reference.
	 * @see #getErpReceiveDelivery()
	 * @generated
	 */
	void setErpReceiveDelivery(ErpReceiveDelivery value);

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem_MaterialItems()
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems
	 * @model opposite="ErpRecDelvLineItems"
	 * @generated
	 */
	EList<MaterialItem> getMaterialItems();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getErpRecDeliveryItems <em>Erp Rec Delivery Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem_Assets()
	 * @see CIM.IEC61968.Assets.Asset#getErpRecDeliveryItems
	 * @model opposite="ErpRecDeliveryItems"
	 * @generated
	 */
	EList<Asset> getAssets();

} // ErpRecDelvLineItem
