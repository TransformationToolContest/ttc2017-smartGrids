/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duct Bank Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getDuctInfos <em>Duct Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getCircuitCount <em>Circuit Count</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctBankInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A duct bank may contain many ducts. Each duct contains individual lines that are expressed as conductor assets (thereby describing each line\'s physical asset characteristics), which are each associated with ACLineSegments and other classes describing their electrical characteristics.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A duct bank may contain many ducts. Each duct contains individual lines that are expressed as conductor assets (thereby describing each line\'s physical asset characteristics), which are each associated with ACLineSegments and other classes describing their electrical characteristics.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A duct bank may contain many ducts. Each duct contains individual lines that are expressed as conductor assets (thereby describing each line\'s physical asset characteristics), which are each associated with ACLineSegments and other classes describing their electrical characteristics.' Profile\040documentation='A duct bank may contain many ducts. Each duct contains individual lines that are expressed as conductor assets (thereby describing each line\'s physical asset characteristics), which are each associated with ACLineSegments and other classes describing their electrical characteristics.'"
 * @generated
 */
public interface DuctBankInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Duct Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getDuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duct Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duct Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctBankInfo_DuctInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getDuctBankInfo
	 * @model opposite="DuctBankInfo"
	 * @generated
	 */
	EList<DuctInfo> getDuctInfos();

	/**
	 * Returns the value of the '<em><b>Circuit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Count</em>' attribute.
	 * @see #setCircuitCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctBankInfo_CircuitCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of circuits in duct bank. Refer to associations between a duct (ConductorAsset) and an ACLineSegment to understand which circuits are in which ducts.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of circuits in duct bank. Refer to associations between a duct (ConductorAsset) and an ACLineSegment to understand which circuits are in which ducts.'"
	 * @generated
	 */
	int getCircuitCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getCircuitCount <em>Circuit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Count</em>' attribute.
	 * @see #getCircuitCount()
	 * @generated
	 */
	void setCircuitCount(int value);

} // DuctBankInfo
