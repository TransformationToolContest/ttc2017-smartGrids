/**
 */
package CIM.IEC61968.AssetModels;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;

import CIM.IEC61970.Informative.InfAssets.AssetInfo;

import CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount;

import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getErpInventoryCounts <em>Erp Inventory Counts</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.AssetModel#getWeightTotal <em>Weight Total</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation for a particular product model made by a manufacturer. There are typically many instances of an asset associated with a single asset model.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation for a particular product model made by a manufacturer. There are typically many instances of an asset associated with a single asset model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation for a particular product model made by a manufacturer. There are typically many instances of an asset associated with a single asset model.' Profile\040documentation='Documentation for a particular product model made by a manufacturer. There are typically many instances of an asset associated with a single asset model.'"
 * @generated
 */
public interface AssetModel extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Version</em>' attribute.
	 * @see #setModelVersion(String)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_ModelVersion()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Version number for product model, which indicates vintage of the product.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Version number for product model, which indicates vintage of the product.'"
	 * @generated
	 */
	String getModelVersion();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.AssetModel#getModelVersion <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Version</em>' attribute.
	 * @see #getModelVersion()
	 * @generated
	 */
	void setModelVersion(String value);

	/**
	 * Returns the value of the '<em><b>Asset Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Info</em>' reference.
	 * @see #setAssetInfo(AssetInfo)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_AssetInfo()
	 * @see CIM.IEC61970.Informative.InfAssets.AssetInfo#getAssetModel
	 * @model opposite="AssetModel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set of parameters applicable to this asset model.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set of parameters applicable to this asset model.'"
	 * @generated
	 */
	AssetInfo getAssetInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.AssetModel#getAssetInfo <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Info</em>' reference.
	 * @see #getAssetInfo()
	 * @generated
	 */
	void setAssetInfo(AssetInfo value);

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Number</em>' attribute.
	 * @see #setModelNumber(String)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_ModelNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Manufacturer\'s model number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Manufacturer\'s model number.'"
	 * @generated
	 */
	String getModelNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.AssetModel#getModelNumber <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' attribute.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(String value);

	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue Items</em>' reference list.
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_AssetModelCatalogueItems()
	 * @see CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel
	 * @model opposite="AssetModel"
	 * @generated
	 */
	EList<AssetModelCatalogueItem> getAssetModelCatalogueItems();

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetModels <em>Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(TypeAsset)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_TypeAsset()
	 * @see CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetModels
	 * @model opposite="AssetModels"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of asset may be satisified with many different types of asset models.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of asset may be satisified with many different types of asset models.'"
	 * @generated
	 */
	TypeAsset getTypeAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.AssetModel#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	void setTypeAsset(TypeAsset value);

	/**
	 * Returns the value of the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.AssetModels.CorporateStandardKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Standard Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Standard Kind</em>' attribute.
	 * @see CIM.IEC61968.AssetModels.CorporateStandardKind
	 * @see #setCorporateStandardKind(CorporateStandardKind)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_CorporateStandardKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of corporate standard for this asset model.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of corporate standard for this asset model.'"
	 * @generated
	 */
	CorporateStandardKind getCorporateStandardKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.AssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Standard Kind</em>' attribute.
	 * @see CIM.IEC61968.AssetModels.CorporateStandardKind
	 * @see #getCorporateStandardKind()
	 * @generated
	 */
	void setCorporateStandardKind(CorporateStandardKind value);

	/**
	 * Returns the value of the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Inventory Counts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Inventory Counts</em>' reference list.
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_ErpInventoryCounts()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel
	 * @model opposite="AssetModel"
	 * @generated
	 */
	EList<ErpInventoryCount> getErpInventoryCounts();

	/**
	 * Returns the value of the '<em><b>Usage Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.AssetModels.AssetModelUsageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Kind</em>' attribute.
	 * @see CIM.IEC61968.AssetModels.AssetModelUsageKind
	 * @see #setUsageKind(AssetModelUsageKind)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_UsageKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Intended usage for this asset model.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Intended usage for this asset model.'"
	 * @generated
	 */
	AssetModelUsageKind getUsageKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.AssetModel#getUsageKind <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Kind</em>' attribute.
	 * @see CIM.IEC61968.AssetModels.AssetModelUsageKind
	 * @see #getUsageKind()
	 * @generated
	 */
	void setUsageKind(AssetModelUsageKind value);

	/**
	 * Returns the value of the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Total</em>' attribute.
	 * @see #setWeightTotal(float)
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModel_WeightTotal()
	 * @model dataType="CIM.IEC61970.Domain.Weight" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total manufactured weight of asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total manufactured weight of asset.'"
	 * @generated
	 */
	float getWeightTotal();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.AssetModels.AssetModel#getWeightTotal <em>Weight Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Total</em>' attribute.
	 * @see #getWeightTotal()
	 * @generated
	 */
	void setWeightTotal(float value);

} // AssetModel
