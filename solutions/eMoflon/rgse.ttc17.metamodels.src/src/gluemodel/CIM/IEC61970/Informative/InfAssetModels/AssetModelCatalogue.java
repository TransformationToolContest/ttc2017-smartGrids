/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Model Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Catalogue of available types of products and materials that are used to build or install, maintain or operate an Asset. Each catalogue item is for a specific product (AssetModel) available from a specific supplier.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Catalogue of available types of products and materials that are used to build or install, maintain or operate an Asset. Each catalogue item is for a specific product (AssetModel) available from a specific supplier.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Catalogue of available types of products and materials that are used to build or install, maintain or operate an Asset. Each catalogue item is for a specific product (AssetModel) available from a specific supplier.' Profile\040documentation='Catalogue of available types of products and materials that are used to build or install, maintain or operate an Asset. Each catalogue item is for a specific product (AssetModel) available from a specific supplier.'"
 * @generated
 */
public interface AssetModelCatalogue extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue <em>Asset Model Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogue_AssetModelCatalogueItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue
	 * @model opposite="AssetModelCatalogue"
	 * @generated
	 */
	EList<AssetModelCatalogueItem> getAssetModelCatalogueItems();

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogue_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // AssetModelCatalogue
