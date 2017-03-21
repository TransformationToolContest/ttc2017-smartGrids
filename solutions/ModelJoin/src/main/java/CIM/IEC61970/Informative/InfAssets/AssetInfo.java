/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.AssetModels.AssetModel;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getAssetModel <em>Asset Model</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getDimensionsInfo <em>Dimensions Info</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set of attributes of an asset that can be instantiated in different data exchange contexts:\n- as attributes of an asset instance (installed or in stock)\n- as attributes of an asset model (product by a manufacturer)\n- as attributes of an asset type (generic type of an asset as used in designs/extension planning).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Set of attributes of an asset that can be instantiated in different data exchange contexts:\n- as attributes of an asset instance (installed or in stock)\n- as attributes of an asset model (product by a manufacturer)\n- as attributes of an asset type (generic type of an asset as used in designs/extension planning).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set of attributes of an asset that can be instantiated in different data exchange contexts:\n- as attributes of an asset instance (installed or in stock)\n- as attributes of an asset model (product by a manufacturer)\n- as attributes of an asset type (generic type of an asset as used in designs/extension planning).' Profile\040documentation='Set of attributes of an asset that can be instantiated in different data exchange contexts:\n- as attributes of an asset instance (installed or in stock)\n- as attributes of an asset model (product by a manufacturer)\n- as attributes of an asset type (generic type of an asset as used in designs/extension planning).'"
 * @generated
 */
public interface AssetInfo extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetInfo_Asset()
	 * @see CIM.IEC61968.Assets.Asset#getAssetInfo
	 * @model opposite="AssetInfo"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Asset described by this set of parameters.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Asset described by this set of parameters.'"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(TypeAsset)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetInfo_TypeAsset()
	 * @see CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getAssetInfo
	 * @model opposite="AssetInfo"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type asset (so called \"compatible units\" asset) described by this set of parameters.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type asset (so called \"compatible units\" asset) described by this set of parameters.'"
	 * @generated
	 */
	TypeAsset getTypeAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	void setTypeAsset(TypeAsset value);

	/**
	 * Returns the value of the '<em><b>Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.AssetModels.AssetModel#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model</em>' reference.
	 * @see #setAssetModel(AssetModel)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetInfo_AssetModel()
	 * @see CIM.IEC61968.AssetModels.AssetModel#getAssetInfo
	 * @model opposite="AssetInfo"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Asset model described by this set of parameters.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Asset model described by this set of parameters.'"
	 * @generated
	 */
	AssetModel getAssetModel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getAssetModel <em>Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model</em>' reference.
	 * @see #getAssetModel()
	 * @generated
	 */
	void setAssetModel(AssetModel value);

	/**
	 * Returns the value of the '<em><b>Dimensions Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos <em>Asset Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions Info</em>' reference.
	 * @see #setDimensionsInfo(DimensionsInfo)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetInfo_DimensionsInfo()
	 * @see CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos
	 * @model opposite="AssetInfos"
	 * @generated
	 */
	DimensionsInfo getDimensionsInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.AssetInfo#getDimensionsInfo <em>Dimensions Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions Info</em>' reference.
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	void setDimensionsInfo(DimensionsInfo value);

} // AssetInfo
