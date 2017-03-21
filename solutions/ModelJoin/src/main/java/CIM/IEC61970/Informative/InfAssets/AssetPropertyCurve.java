/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61970.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Property Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification <em>Specification</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetPropertyCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An Asset Property that is described through curves rather than as a data point. The relationship is to be defined between an independent variable (X-axis) and one or two dependent variables (Y1-axis and Y2-axis).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An Asset Property that is described through curves rather than as a data point. The relationship is to be defined between an independent variable (X-axis) and one or two dependent variables (Y1-axis and Y2-axis).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An Asset Property that is described through curves rather than as a data point. The relationship is to be defined between an independent variable (X-axis) and one or two dependent variables (Y1-axis and Y2-axis).' Profile\040documentation='An Asset Property that is described through curves rather than as a data point. The relationship is to be defined between an independent variable (X-axis) and one or two dependent variables (Y1-axis and Y2-axis).'"
 * @generated
 */
public interface AssetPropertyCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.Specification#getAssetPropertyCurves <em>Asset Property Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(Specification)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetPropertyCurve_Specification()
	 * @see CIM.IEC61970.Informative.InfAssets.Specification#getAssetPropertyCurves
	 * @model opposite="AssetPropertyCurves"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getAssetPropertyCurves <em>Asset Property Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetPropertyCurve_Assets()
	 * @see CIM.IEC61968.Assets.Asset#getAssetPropertyCurves
	 * @model opposite="AssetPropertyCurves"
	 * @generated
	 */
	EList<Asset> getAssets();

} // AssetPropertyCurve
