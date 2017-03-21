/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfCommon.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Asset Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.DocAssetRole#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.DocAssetRole#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDocAssetRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Documents and Assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Documents and Assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Documents and Assets.' Profile\040documentation='Roles played between Documents and Assets.'"
 * @generated
 */
public interface DocAssetRole extends Role {
	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDocAssetRole_Asset()
	 * @see CIM.IEC61968.Assets.Asset#getDocumentRoles
	 * @model opposite="DocumentRoles"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.DocAssetRole#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.Document#getAssetRoles <em>Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDocAssetRole_Document()
	 * @see CIM.IEC61968.Common.Document#getAssetRoles
	 * @model opposite="AssetRoles"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.DocAssetRole#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

} // DocAssetRole
