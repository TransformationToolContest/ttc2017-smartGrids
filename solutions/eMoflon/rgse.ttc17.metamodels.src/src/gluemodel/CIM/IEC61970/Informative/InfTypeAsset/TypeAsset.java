/**
 */
package gluemodel.CIM.IEC61970.Informative.InfTypeAsset;

import gluemodel.CIM.IEC61968.AssetModels.AssetModel;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem;

import gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset;
import gluemodel.CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpBomItemDatas <em>Erp Bom Item Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#isStockItem <em>Stock Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpReqLineItems <em>Erp Req Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getErpInventoryIssues <em>Erp Inventory Issues</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getEstimatedUnitCost <em>Estimated Unit Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetModels <em>Asset Models</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUAsset <em>CU Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Whereas an AssetModel is a particular model and version of a vendor\'s product, a TypeAsset stands for a generic asset or material item that may be used for design purposes.\nAny number of AssetModels may be used to perform this generic function.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Whereas an AssetModel is a particular model and version of a vendor\'s product, a TypeAsset stands for a generic asset or material item that may be used for design purposes.\nAny number of AssetModels may be used to perform this generic function.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Whereas an AssetModel is a particular model and version of a vendor\'s product, a TypeAsset stands for a generic asset or material item that may be used for design purposes.\nAny number of AssetModels may be used to perform this generic function.' Profile\040documentation='Whereas an AssetModel is a particular model and version of a vendor\'s product, a TypeAsset stands for a generic asset or material item that may be used for design purposes.\nAny number of AssetModels may be used to perform this generic function.'"
 * @generated
 */
public interface TypeAsset extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Type Asset Catalogue</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets <em>Type Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset Catalogue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset Catalogue</em>' reference.
	 * @see #setTypeAssetCatalogue(TypeAssetCatalogue)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_TypeAssetCatalogue()
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets
	 * @model opposite="TypeAssets"
	 * @generated
	 */
	TypeAssetCatalogue getTypeAssetCatalogue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset Catalogue</em>' reference.
	 * @see #getTypeAssetCatalogue()
	 * @generated
	 */
	void setTypeAssetCatalogue(TypeAssetCatalogue value);

	/**
	 * Returns the value of the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Bom Item Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Bom Item Datas</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_ErpBomItemDatas()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset
	 * @model opposite="TypeAsset"
	 * @generated
	 */
	EList<ErpBomItemData> getErpBomItemDatas();

	/**
	 * Returns the value of the '<em><b>Asset Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Info</em>' reference.
	 * @see #setAssetInfo(AssetInfo)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_AssetInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getTypeAsset
	 * @model opposite="TypeAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set of parameters applicable to this type asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set of parameters applicable to this type asset.'"
	 * @generated
	 */
	AssetInfo getAssetInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetInfo <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Info</em>' reference.
	 * @see #getAssetInfo()
	 * @generated
	 */
	void setAssetInfo(AssetInfo value);

	/**
	 * Returns the value of the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Item</em>' attribute.
	 * @see #setStockItem(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_StockItem()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if item is a stock item (default).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if item is a stock item (default).'"
	 * @generated
	 */
	boolean isStockItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#isStockItem <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Item</em>' attribute.
	 * @see #isStockItem()
	 * @generated
	 */
	void setStockItem(boolean value);

	/**
	 * Returns the value of the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Req Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Req Line Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_ErpReqLineItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset
	 * @model opposite="TypeAsset"
	 * @generated
	 */
	EList<ErpReqLineItem> getErpReqLineItems();

	/**
	 * Returns the value of the '<em><b>Erp Inventory Issues</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Inventory Issues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Inventory Issues</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_ErpInventoryIssues()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset
	 * @model opposite="TypeAsset"
	 * @generated
	 */
	EList<ErpIssueInventory> getErpInventoryIssues();

	/**
	 * Returns the value of the '<em><b>Estimated Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Unit Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Unit Cost</em>' attribute.
	 * @see #setEstimatedUnitCost(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_EstimatedUnitCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated unit cost (or cost per unit length) of this type of asset. It does not include labor to install/construct or configure it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated unit cost (or cost per unit length) of this type of asset. It does not include labor to install/construct or configure it.'"
	 * @generated
	 */
	float getEstimatedUnitCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getEstimatedUnitCost <em>Estimated Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Unit Cost</em>' attribute.
	 * @see #getEstimatedUnitCost()
	 * @generated
	 */
	void setEstimatedUnitCost(float value);

	/**
	 * Returns the value of the '<em><b>CU Work Equipment Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Work Equipment Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Work Equipment Asset</em>' reference.
	 * @see #setCUWorkEquipmentAsset(CUWorkEquipmentItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_CUWorkEquipmentAsset()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset
	 * @model opposite="TypeAsset"
	 * @generated
	 */
	CUWorkEquipmentItem getCUWorkEquipmentAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Work Equipment Asset</em>' reference.
	 * @see #getCUWorkEquipmentAsset()
	 * @generated
	 */
	void setCUWorkEquipmentAsset(CUWorkEquipmentItem value);

	/**
	 * Returns the value of the '<em><b>Asset Models</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.AssetModel}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.AssetModel#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Models</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_AssetModels()
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModel#getTypeAsset
	 * @model opposite="TypeAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of asset may be satisified with many different types of asset models.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of asset may be satisified with many different types of asset models.'"
	 * @generated
	 */
	EList<AssetModel> getAssetModels();

	/**
	 * Returns the value of the '<em><b>CU Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Asset</em>' reference.
	 * @see #setCUAsset(CUAsset)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_CUAsset()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset#getTypeAsset
	 * @model opposite="TypeAsset"
	 * @generated
	 */
	CUAsset getCUAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getCUAsset <em>CU Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Asset</em>' reference.
	 * @see #getCUAsset()
	 * @generated
	 */
	void setCUAsset(CUAsset value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAsset_Quantity()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.StringQuantity" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value, unit of measure, and multiplier for the quantity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value, unit of measure, and multiplier for the quantity.'"
	 * @generated
	 */
	String getQuantity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(String value);

} // TypeAsset
