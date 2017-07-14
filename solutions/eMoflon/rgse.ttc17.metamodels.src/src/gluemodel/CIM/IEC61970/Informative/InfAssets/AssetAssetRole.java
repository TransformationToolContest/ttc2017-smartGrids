/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Asset Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset <em>To Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset <em>From Asset</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetAssetRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Assets and other Assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Assets and other Assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Assets and other Assets.' Profile\040documentation='Roles played between Assets and other Assets.'"
 * @generated
 */
public interface AssetAssetRole extends Role {
	/**
	 * Returns the value of the '<em><b>To Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getFromAssetRoles <em>From Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Asset</em>' reference.
	 * @see #setToAsset(Asset)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetAssetRole_ToAsset()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getFromAssetRoles
	 * @model opposite="FromAssetRoles"
	 * @generated
	 */
	Asset getToAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset <em>To Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Asset</em>' reference.
	 * @see #getToAsset()
	 * @generated
	 */
	void setToAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>From Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Assets.Asset#getToAssetRoles <em>To Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Asset</em>' reference.
	 * @see #setFromAsset(Asset)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetAssetRole_FromAsset()
	 * @see gluemodel.CIM.IEC61968.Assets.Asset#getToAssetRoles
	 * @model opposite="ToAssetRoles"
	 * @generated
	 */
	Asset getFromAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset <em>From Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Asset</em>' reference.
	 * @see #getFromAsset()
	 * @generated
	 */
	void setFromAsset(Asset value);

} // AssetAssetRole
