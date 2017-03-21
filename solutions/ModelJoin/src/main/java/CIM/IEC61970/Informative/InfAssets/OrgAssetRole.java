/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61970.Informative.InfCommon.Role;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Asset Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation <em>Erp Organisation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getPercentOwnership <em>Percent Ownership</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getOrgAssetRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The roles played between an Organisations and an Asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The roles played between an Organisations and an Asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The roles played between an Organisations and an Asset.' Profile\040documentation='The roles played between an Organisations and an Asset.'"
 * @generated
 */
public interface OrgAssetRole extends Role {
	/**
	 * Returns the value of the '<em><b>Erp Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getAssetRoles <em>Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation</em>' reference.
	 * @see #setErpOrganisation(ErpOrganisation)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getOrgAssetRole_ErpOrganisation()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getAssetRoles
	 * @model opposite="AssetRoles"
	 * @generated
	 */
	ErpOrganisation getErpOrganisation();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Organisation</em>' reference.
	 * @see #getErpOrganisation()
	 * @generated
	 */
	void setErpOrganisation(ErpOrganisation value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getOrgAssetRole_Asset()
	 * @see CIM.IEC61968.Assets.Asset#getErpOrganisationRoles
	 * @model opposite="ErpOrganisationRoles"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Percent Ownership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Ownership</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Ownership</em>' attribute.
	 * @see #setPercentOwnership(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getOrgAssetRole_PercentOwnership()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If the role type is \"owner,\" this indicate the percentage of ownership.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If the role type is \"owner,\" this indicate the percentage of ownership.'"
	 * @generated
	 */
	float getPercentOwnership();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.OrgAssetRole#getPercentOwnership <em>Percent Ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Ownership</em>' attribute.
	 * @see #getPercentOwnership()
	 * @generated
	 */
	void setPercentOwnership(float value);

} // OrgAssetRole
