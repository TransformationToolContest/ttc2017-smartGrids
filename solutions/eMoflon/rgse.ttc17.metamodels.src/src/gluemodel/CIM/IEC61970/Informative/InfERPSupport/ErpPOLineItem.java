/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;

import gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp PO Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder <em>Erp Purchase Order</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem <em>Material Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem <em>Erp Rec Del Line Item</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPOLineItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Of an ErpPurchaseOrder, this is an individually ordered item or product along with the quantity, price and other descriptive information.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Of an ErpPurchaseOrder, this is an individually ordered item or product along with the quantity, price and other descriptive information.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Of an ErpPurchaseOrder, this is an individually ordered item or product along with the quantity, price and other descriptive information.' Profile\040documentation='Of an ErpPurchaseOrder, this is an individually ordered item or product along with the quantity, price and other descriptive information.'"
 * @generated
 */
public interface ErpPOLineItem extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Purchase Order</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Purchase Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Purchase Order</em>' reference.
	 * @see #setErpPurchaseOrder(ErpPurchaseOrder)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPOLineItem_ErpPurchaseOrder()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder#getErpPOLineItems
	 * @model opposite="ErpPOLineItems"
	 * @generated
	 */
	ErpPurchaseOrder getErpPurchaseOrder();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder <em>Erp Purchase Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Purchase Order</em>' reference.
	 * @see #getErpPurchaseOrder()
	 * @generated
	 */
	void setErpPurchaseOrder(ErpPurchaseOrder value);

	/**
	 * Returns the value of the '<em><b>Material Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Item</em>' reference.
	 * @see #setMaterialItem(MaterialItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPOLineItem_MaterialItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem#getErpPOLineItems
	 * @model opposite="ErpPOLineItems"
	 * @generated
	 */
	MaterialItem getMaterialItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem <em>Material Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Item</em>' reference.
	 * @see #getMaterialItem()
	 * @generated
	 */
	void setMaterialItem(MaterialItem value);

	/**
	 * Returns the value of the '<em><b>Erp Req Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Req Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Req Line Item</em>' reference.
	 * @see #setErpReqLineItem(ErpReqLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPOLineItem_ErpReqLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem
	 * @model opposite="ErpPOLineItem"
	 * @generated
	 */
	ErpReqLineItem getErpReqLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Req Line Item</em>' reference.
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	void setErpReqLineItem(ErpReqLineItem value);

	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue Item</em>' reference.
	 * @see #setAssetModelCatalogueItem(AssetModelCatalogueItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPOLineItem_AssetModelCatalogueItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpPOLineItems
	 * @model opposite="ErpPOLineItems"
	 * @generated
	 */
	AssetModelCatalogueItem getAssetModelCatalogueItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model Catalogue Item</em>' reference.
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	void setAssetModelCatalogueItem(AssetModelCatalogueItem value);

	/**
	 * Returns the value of the '<em><b>Erp Rec Del Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Del Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Del Line Item</em>' reference.
	 * @see #setErpRecDelLineItem(ErpRecDelvLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPOLineItem_ErpRecDelLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem
	 * @model opposite="ErpPOLineItem"
	 * @generated
	 */
	ErpRecDelvLineItem getErpRecDelLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem <em>Erp Rec Del Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Rec Del Line Item</em>' reference.
	 * @see #getErpRecDelLineItem()
	 * @generated
	 */
	void setErpRecDelLineItem(ErpRecDelvLineItem value);

} // ErpPOLineItem
