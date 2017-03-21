/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.TapChangerAsset#getTapChangerAssetModel <em>Tap Changer Asset Model</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTapChangerAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Physical asset performing TapChanger function.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Physical asset performing TapChanger function.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Physical asset performing TapChanger function.' Profile\040documentation='Physical asset performing TapChanger function.'"
 * @generated
 */
public interface TapChangerAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Tap Changer Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapChangerAssets <em>Tap Changer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer Asset Model</em>' reference.
	 * @see #setTapChangerAssetModel(TapChangerAssetModel)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getTapChangerAsset_TapChangerAssetModel()
	 * @see CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel#getTapChangerAssets
	 * @model opposite="TapChangerAssets"
	 * @generated
	 */
	TapChangerAssetModel getTapChangerAssetModel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.TapChangerAsset#getTapChangerAssetModel <em>Tap Changer Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Changer Asset Model</em>' reference.
	 * @see #getTapChangerAssetModel()
	 * @generated
	 */
	void setTapChangerAssetModel(TapChangerAssetModel value);

} // TapChangerAsset
