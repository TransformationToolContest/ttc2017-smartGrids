/**
 */
package CIM.IEC61970.Informative.InfERPSupport;

import CIM.IEC61968.AssetModels.AssetModel;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfWork.MaterialItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Inventory Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem <em>Material Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel <em>Asset Model</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInventoryCount()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is related to Inventory physical counts organized by AssetModel. Note that a count of a type of asset can be accomplished by the association inherited by AssetModel (from Document) to Asset.\nIt enables ERP applications to transfer an inventory count between ERP and the actual physical inventory location. This count may be a cycle count or a physical count.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This is related to Inventory physical counts organized by AssetModel. Note that a count of a type of asset can be accomplished by the association inherited by AssetModel (from Document) to Asset.\nIt enables ERP applications to transfer an inventory count between ERP and the actual physical inventory location. This count may be a cycle count or a physical count.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is related to Inventory physical counts organized by AssetModel. Note that a count of a type of asset can be accomplished by the association inherited by AssetModel (from Document) to Asset.\nIt enables ERP applications to transfer an inventory count between ERP and the actual physical inventory location. This count may be a cycle count or a physical count.' Profile\040documentation='This is related to Inventory physical counts organized by AssetModel. Note that a count of a type of asset can be accomplished by the association inherited by AssetModel (from Document) to Asset.\nIt enables ERP applications to transfer an inventory count between ERP and the actual physical inventory location. This count may be a cycle count or a physical count.'"
 * @generated
 */
public interface ErpInventoryCount extends IdentifiedObject {
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
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInventoryCount_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Material Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts <em>Erp Inventory Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Item</em>' reference.
	 * @see #setMaterialItem(MaterialItem)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInventoryCount_MaterialItem()
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts
	 * @model opposite="ErpInventoryCounts"
	 * @generated
	 */
	MaterialItem getMaterialItem();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem <em>Material Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Item</em>' reference.
	 * @see #getMaterialItem()
	 * @generated
	 */
	void setMaterialItem(MaterialItem value);

	/**
	 * Returns the value of the '<em><b>Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.AssetModel#getErpInventoryCounts <em>Erp Inventory Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model</em>' reference.
	 * @see #setAssetModel(AssetModel)
	 * @see CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInventoryCount_AssetModel()
	 * @see CIM.IEC61968.AssetModels.AssetModel#getErpInventoryCounts
	 * @model opposite="ErpInventoryCounts"
	 * @generated
	 */
	AssetModel getAssetModel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel <em>Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model</em>' reference.
	 * @see #getAssetModel()
	 * @generated
	 */
	void setAssetModel(AssetModel value);

} // ErpInventoryCount
