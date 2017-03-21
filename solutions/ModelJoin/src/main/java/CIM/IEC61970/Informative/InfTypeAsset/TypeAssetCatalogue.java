/**
 */
package CIM.IEC61970.Informative.InfTypeAsset;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Asset Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets <em>Type Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAssetCatalogue()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Catalogue of generic types of assets (TypeAsset) that may be used for design purposes. It is not associated with a particular manufacturer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Catalogue of generic types of assets (TypeAsset) that may be used for design purposes. It is not associated with a particular manufacturer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Catalogue of generic types of assets (TypeAsset) that may be used for design purposes. It is not associated with a particular manufacturer.' Profile\040documentation='Catalogue of generic types of assets (TypeAsset) that may be used for design purposes. It is not associated with a particular manufacturer.'"
 * @generated
 */
public interface TypeAssetCatalogue extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Type Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Assets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAssetCatalogue_TypeAssets()
	 * @see CIM.IEC61970.Informative.InfTypeAsset.TypeAsset#getTypeAssetCatalogue
	 * @model opposite="TypeAssetCatalogue"
	 * @generated
	 */
	EList<TypeAsset> getTypeAssets();

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
	 * @see CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAssetCatalogue_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // TypeAssetCatalogue
