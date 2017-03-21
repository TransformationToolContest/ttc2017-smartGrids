/**
 */
package CIM.IEC61970.Informative.InfAssetModels;

import CIM.IEC61968.AssetModels.AssetModel;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Model Catalogue Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems <em>Erp Quote Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue <em>Asset Model Catalogue</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel <em>Asset Model</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogueItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Provides pricing and other relevant information about a specific manufacturer\'s product (i.e., AssetModel), and its price from a given supplier. A single AssetModel may be availble from multiple suppliers. Note that manufacturer and supplier are both types of organisation, which the association is inherited from Document.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Provides pricing and other relevant information about a specific manufacturer\'s product (i.e., AssetModel), and its price from a given supplier. A single AssetModel may be availble from multiple suppliers. Note that manufacturer and supplier are both types of organisation, which the association is inherited from Document.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Provides pricing and other relevant information about a specific manufacturer\'s product (i.e., AssetModel), and its price from a given supplier. A single AssetModel may be availble from multiple suppliers. Note that manufacturer and supplier are both types of organisation, which the association is inherited from Document.' Profile\040documentation='Provides pricing and other relevant information about a specific manufacturer\'s product (i.e., AssetModel), and its price from a given supplier. A single AssetModel may be availble from multiple suppliers. Note that manufacturer and supplier are both types of organisation, which the association is inherited from Document.'"
 * @generated
 */
public interface AssetModelCatalogueItem extends Document {
	/**
	 * Returns the value of the '<em><b>Erp Quote Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogueItem_ErpQuoteLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem
	 * @model opposite="AssetModelCatalogueItem"
	 * @generated
	 */
	EList<ErpQuoteLineItem> getErpQuoteLineItems();

	/**
	 * Returns the value of the '<em><b>Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Cost</em>' attribute.
	 * @see #setUnitCost(float)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogueItem_UnitCost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit cost for an asset model from a specific supplier, either for a unit cost or cost per unit length. Cost is for material or asset only and does not include labor to install/construct or configure it.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit cost for an asset model from a specific supplier, either for a unit cost or cost per unit length. Cost is for material or asset only and does not include labor to install/construct or configure it.'"
	 * @generated
	 */
	float getUnitCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Cost</em>' attribute.
	 * @see #getUnitCost()
	 * @generated
	 */
	void setUnitCost(float value);

	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue</em>' reference.
	 * @see #setAssetModelCatalogue(AssetModelCatalogue)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogueItem_AssetModelCatalogue()
	 * @see CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems
	 * @model opposite="AssetModelCatalogueItems"
	 * @generated
	 */
	AssetModelCatalogue getAssetModelCatalogue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue <em>Asset Model Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model Catalogue</em>' reference.
	 * @see #getAssetModelCatalogue()
	 * @generated
	 */
	void setAssetModelCatalogue(AssetModelCatalogue value);

	/**
	 * Returns the value of the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogueItem_ErpPOLineItems()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem
	 * @model opposite="AssetModelCatalogueItem"
	 * @generated
	 */
	EList<ErpPOLineItem> getErpPOLineItems();

	/**
	 * Returns the value of the '<em><b>Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.AssetModel#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model</em>' reference.
	 * @see #setAssetModel(AssetModel)
	 * @see CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogueItem_AssetModel()
	 * @see CIM.IEC61968.AssetModels.AssetModel#getAssetModelCatalogueItems
	 * @model opposite="AssetModelCatalogueItems"
	 * @generated
	 */
	AssetModel getAssetModel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel <em>Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model</em>' reference.
	 * @see #getAssetModel()
	 * @generated
	 */
	void setAssetModel(AssetModel value);

} // AssetModelCatalogueItem
