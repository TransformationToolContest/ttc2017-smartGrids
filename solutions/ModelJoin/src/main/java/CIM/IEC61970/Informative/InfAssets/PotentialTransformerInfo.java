/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61970.Informative.InfCommon.Ratio;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass <em>Pt Class</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPotentialTransformerInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of potential transformer asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of potential transformer asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of potential transformer asset.' Profile\040documentation='Properties of potential transformer asset.'"
 * @generated
 */
public interface PotentialTransformerInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Secondary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Ratio</em>' reference.
	 * @see #setSecondaryRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPotentialTransformerInfo_SecondaryRatio()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio for the secondary winding tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio for the secondary winding tap changer.'"
	 * @generated
	 */
	Ratio getSecondaryRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Ratio</em>' reference.
	 * @see #getSecondaryRatio()
	 * @generated
	 */
	void setSecondaryRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Nominal Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Ratio</em>' reference.
	 * @see #setNominalRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPotentialTransformerInfo_NominalRatio()
	 * @model
	 * @generated
	 */
	Ratio getNominalRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Ratio</em>' reference.
	 * @see #getNominalRatio()
	 * @generated
	 */
	void setNominalRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy Class</em>' attribute.
	 * @see #setAccuracyClass(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPotentialTransformerInfo_AccuracyClass()
	 * @model required="true"
	 * @generated
	 */
	String getAccuracyClass();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Class</em>' attribute.
	 * @see #getAccuracyClass()
	 * @generated
	 */
	void setAccuracyClass(String value);

	/**
	 * Returns the value of the '<em><b>Primary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Ratio</em>' reference.
	 * @see #setPrimaryRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPotentialTransformerInfo_PrimaryRatio()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio for the primary winding tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio for the primary winding tap changer.'"
	 * @generated
	 */
	Ratio getPrimaryRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Ratio</em>' reference.
	 * @see #getPrimaryRatio()
	 * @generated
	 */
	void setPrimaryRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Pt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt Class</em>' attribute.
	 * @see #setPtClass(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPotentialTransformerInfo_PtClass()
	 * @model required="true"
	 * @generated
	 */
	String getPtClass();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass <em>Pt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt Class</em>' attribute.
	 * @see #getPtClass()
	 * @generated
	 */
	void setPtClass(String value);

	/**
	 * Returns the value of the '<em><b>Tertiary Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tertiary Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tertiary Ratio</em>' reference.
	 * @see #setTertiaryRatio(Ratio)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getPotentialTransformerInfo_TertiaryRatio()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ratio for the tertiary winding tap changer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ratio for the tertiary winding tap changer.'"
	 * @generated
	 */
	Ratio getTertiaryRatio();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tertiary Ratio</em>' reference.
	 * @see #getTertiaryRatio()
	 * @generated
	 */
	void setTertiaryRatio(Ratio value);

} // PotentialTransformerInfo
