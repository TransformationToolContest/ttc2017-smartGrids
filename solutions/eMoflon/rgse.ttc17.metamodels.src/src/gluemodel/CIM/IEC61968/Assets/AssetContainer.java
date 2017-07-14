/**
 */
package gluemodel.CIM.IEC61968.Assets;

import gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.AssetContainer#getLandProperties <em>Land Properties</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.AssetContainer#getAssets <em>Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.AssetContainer#getSeals <em>Seals</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAssetContainer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Asset that is aggregation of other assets such as conductors, transformers, switchgear, land, fences, buildings, equipment, vehicles, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Asset that is aggregation of other assets such as conductors, transformers, switchgear, land, fences, buildings, equipment, vehicles, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Asset that is aggregation of other assets such as conductors, transformers, switchgear, land, fences, buildings, equipment, vehicles, etc.' Profile\040documentation='Asset that is aggregation of other assets such as conductors, transformers, switchgear, land, fences, buildings, equipment, vehicles, etc.'"
 * @generated
 */
public interface AssetContainer extends Asset {
	/**
	 * Returns the value of the '<em><b>Land Properties</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getAssetContainers <em>Asset Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Properties</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAssetContainer_LandProperties()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty#getAssetContainers
	 * @model opposite="AssetContainers"
	 * @generated
	 */
	EList<LandProperty> getLandProperties();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getAssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAssetContainer_Assets()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getAssetContainer
	 * @model opposite="AssetContainer"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Seals</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Assets.Seal}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Seal#getAssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seals</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Assets.AssetsPackage#getAssetContainer_Seals()
	 * @see gluemodel.CIM.IEC61968.Assets.Seal#getAssetContainer
	 * @model opposite="AssetContainer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All seals applied to this asset container.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All seals applied to this asset container.'"
	 * @generated
	 */
	EList<Seal> getSeals();

} // AssetContainer
