/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensions Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth <em>Size Width</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth <em>Size Depth</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter <em>Size Diameter</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos <em>Asset Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength <em>Size Length</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='As applicable, the basic linear, area, or volume dimensions of an asset, asset type (AssetModel) or other type of object (such as land area). Units and multipliers are specified per dimension.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='As applicable, the basic linear, area, or volume dimensions of an asset, asset type (AssetModel) or other type of object (such as land area). Units and multipliers are specified per dimension.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='As applicable, the basic linear, area, or volume dimensions of an asset, asset type (AssetModel) or other type of object (such as land area). Units and multipliers are specified per dimension.' Profile\040documentation='As applicable, the basic linear, area, or volume dimensions of an asset, asset type (AssetModel) or other type of object (such as land area). Units and multipliers are specified per dimension.'"
 * @generated
 */
public interface DimensionsInfo extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo_Orientation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A description of the orientation of the object relative to the dimensions. As an example, a vault may have north-south orientation for the sizeLength measurement and sizeDepth may be the height of the vault.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A description of the orientation of the object relative to the dimensions. As an example, a vault may have north-south orientation for the sizeLength measurement and sizeDepth may be the height of the vault.'"
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Location#getDimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo_Locations()
	 * @see gluemodel.CIM.IEC61968.Common.Location#getDimensionsInfo
	 * @model opposite="DimensionsInfo"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Size Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Width</em>' attribute.
	 * @see #setSizeWidth(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo_SizeWidth()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Width measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Width measurement.'"
	 * @generated
	 */
	float getSizeWidth();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth <em>Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Width</em>' attribute.
	 * @see #getSizeWidth()
	 * @generated
	 */
	void setSizeWidth(float value);

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos <em>Dimensions Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo_Specifications()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos
	 * @model opposite="DimensionsInfos"
	 * @generated
	 */
	EList<Specification> getSpecifications();

	/**
	 * Returns the value of the '<em><b>Size Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Depth</em>' attribute.
	 * @see #setSizeDepth(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo_SizeDepth()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Depth measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Depth measurement.'"
	 * @generated
	 */
	float getSizeDepth();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth <em>Size Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Depth</em>' attribute.
	 * @see #getSizeDepth()
	 * @generated
	 */
	void setSizeDepth(float value);

	/**
	 * Returns the value of the '<em><b>Size Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Diameter</em>' attribute.
	 * @see #setSizeDiameter(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo_SizeDiameter()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Diameter measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Diameter measurement.'"
	 * @generated
	 */
	float getSizeDiameter();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter <em>Size Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Diameter</em>' attribute.
	 * @see #getSizeDiameter()
	 * @generated
	 */
	void setSizeDiameter(float value);

	/**
	 * Returns the value of the '<em><b>Asset Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getDimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo_AssetInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo#getDimensionsInfo
	 * @model opposite="DimensionsInfo"
	 * @generated
	 */
	EList<AssetInfo> getAssetInfos();

	/**
	 * Returns the value of the '<em><b>Size Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Length</em>' attribute.
	 * @see #setSizeLength(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo_SizeLength()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Length measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Length measurement.'"
	 * @generated
	 */
	float getSizeLength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength <em>Size Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Length</em>' attribute.
	 * @see #getSizeLength()
	 * @generated
	 */
	void setSizeLength(float value);

} // DimensionsInfo
