/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.AssetModels.CableInfo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duct Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getYCoord <em>YCoord</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getXCoord <em>XCoord</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getCableInfos <em>Cable Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getDuctBankInfo <em>Duct Bank Info</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Duct contains underground cables and is contained within a duct bank. The xCoord and yCoord attributes define its positioning within the DuctBank.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Duct contains underground cables and is contained within a duct bank. The xCoord and yCoord attributes define its positioning within the DuctBank.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Duct contains underground cables and is contained within a duct bank. The xCoord and yCoord attributes define its positioning within the DuctBank.' Profile\040documentation='A Duct contains underground cables and is contained within a duct bank. The xCoord and yCoord attributes define its positioning within the DuctBank.'"
 * @generated
 */
public interface DuctInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>YCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoord</em>' attribute.
	 * @see #setYCoord(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctInfo_YCoord()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Y position of the duct within the duct bank.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Y position of the duct within the duct bank.'"
	 * @generated
	 */
	int getYCoord();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getYCoord <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoord</em>' attribute.
	 * @see #getYCoord()
	 * @generated
	 */
	void setYCoord(int value);

	/**
	 * Returns the value of the '<em><b>XCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XCoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoord</em>' attribute.
	 * @see #setXCoord(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctInfo_XCoord()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='X position of the duct within the duct bank.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='X position of the duct within the duct bank.'"
	 * @generated
	 */
	int getXCoord();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getXCoord <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoord</em>' attribute.
	 * @see #getXCoord()
	 * @generated
	 */
	void setXCoord(int value);

	/**
	 * Returns the value of the '<em><b>Cable Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.CableInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cable Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cable Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctInfo_CableInfos()
	 * @see gluemodel.CIM.IEC61968.AssetModels.CableInfo#getDuctBankInfo
	 * @model opposite="DuctBankInfo"
	 * @generated
	 */
	EList<CableInfo> getCableInfos();

	/**
	 * Returns the value of the '<em><b>Duct Bank Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getDuctInfos <em>Duct Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duct Bank Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duct Bank Info</em>' reference.
	 * @see #setDuctBankInfo(DuctBankInfo)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctInfo_DuctBankInfo()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.DuctBankInfo#getDuctInfos
	 * @model opposite="DuctInfos"
	 * @generated
	 */
	DuctBankInfo getDuctBankInfo();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.DuctInfo#getDuctBankInfo <em>Duct Bank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duct Bank Info</em>' reference.
	 * @see #getDuctBankInfo()
	 * @generated
	 */
	void setDuctBankInfo(DuctBankInfo value);

} // DuctInfo
