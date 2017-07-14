/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getAssetProperites <em>Asset Properites</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos <em>Reliability Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getRatings <em>Ratings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getAssetPropertyCurves <em>Asset Property Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos <em>Dimensions Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Specification#getMediums <em>Mediums</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specification can be used for various purposes relative to an asset, a logical device (PowerSystemResource), location, etc. Examples include documents supplied by manufacturers such as asset installation instructions, asset maintenance instructions, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specification can be used for various purposes relative to an asset, a logical device (PowerSystemResource), location, etc. Examples include documents supplied by manufacturers such as asset installation instructions, asset maintenance instructions, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specification can be used for various purposes relative to an asset, a logical device (PowerSystemResource), location, etc. Examples include documents supplied by manufacturers such as asset installation instructions, asset maintenance instructions, etc.' Profile\040documentation='Specification can be used for various purposes relative to an asset, a logical device (PowerSystemResource), location, etc. Examples include documents supplied by manufacturers such as asset installation instructions, asset maintenance instructions, etc.'"
 * @generated
 */
public interface Specification extends Document {
	/**
	 * Returns the value of the '<em><b>Asset Properites</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getPropertySpecification <em>Property Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Properites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Properites</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification_AssetProperites()
	 * @see gluemodel.CIM.IEC61968.Common.UserAttribute#getPropertySpecification
	 * @model opposite="PropertySpecification"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='UserAttributes used to specify further properties of the asset covered with this specification. Use \'name\' to specify what kind of property it is, and \'value.value\' attribute for the actual value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='UserAttributes used to specify further properties of the asset covered with this specification. Use \'name\' to specify what kind of property it is, and \'value.value\' attribute for the actual value.'"
	 * @generated
	 */
	EList<UserAttribute> getAssetProperites();

	/**
	 * Returns the value of the '<em><b>Reliability Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification_ReliabilityInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification
	 * @model opposite="Specification"
	 * @generated
	 */
	EList<ReliabilityInfo> getReliabilityInfos();

	/**
	 * Returns the value of the '<em><b>Ratings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.UserAttribute#getRatingSpecification <em>Rating Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratings</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification_Ratings()
	 * @see gluemodel.CIM.IEC61968.Common.UserAttribute#getRatingSpecification
	 * @model opposite="RatingSpecification"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='UserAttributes used to specify ratings of the asset covered by this specification. Ratings also can be used to set the initial value of operational measurement limits. Use \'name\' to specify what kind of rating it is (e.g., voltage, current), and \'value\' attribute for the actual value and unit information of the rating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='UserAttributes used to specify ratings of the asset covered by this specification. Ratings also can be used to set the initial value of operational measurement limits. Use \'name\' to specify what kind of rating it is (e.g., voltage, current), and \'value\' attribute for the actual value and unit information of the rating.'"
	 * @generated
	 */
	EList<UserAttribute> getRatings();

	/**
	 * Returns the value of the '<em><b>Qualification Requirements</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Requirements</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification_QualificationRequirements()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications
	 * @model opposite="Specifications"
	 * @generated
	 */
	EList<QualificationRequirement> getQualificationRequirements();

	/**
	 * Returns the value of the '<em><b>Asset Property Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Property Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Property Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification_AssetPropertyCurves()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification
	 * @model opposite="Specification"
	 * @generated
	 */
	EList<AssetPropertyCurve> getAssetPropertyCurves();

	/**
	 * Returns the value of the '<em><b>Dimensions Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification_DimensionsInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications
	 * @model opposite="Specifications"
	 * @generated
	 */
	EList<DimensionsInfo> getDimensionsInfos();

	/**
	 * Returns the value of the '<em><b>Mediums</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediums</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediums</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification_Mediums()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.Medium#getSpecification
	 * @model opposite="Specification"
	 * @generated
	 */
	EList<Medium> getMediums();

} // Specification
