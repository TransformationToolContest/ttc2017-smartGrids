/**
 */
package CIM.IEC61968.Assets;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Assets.AssetFunction#getHardwareID <em>Hardware ID</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.AssetFunction#getProgramID <em>Program ID</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.AssetFunction#getFirmwareID <em>Firmware ID</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.AssetFunction#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.AssetFunction#getPassword <em>Password</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.AssetFunction#getConfigID <em>Config ID</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Assets.AssetsPackage#getAssetFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Function performed by an asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Function performed by an asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Function performed by an asset.' Profile\040documentation='Function performed by an asset.'"
 * @generated
 */
public interface AssetFunction extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware ID</em>' attribute.
	 * @see #setHardwareID(String)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAssetFunction_HardwareID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Hardware version.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Hardware version.'"
	 * @generated
	 */
	String getHardwareID();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AssetFunction#getHardwareID <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware ID</em>' attribute.
	 * @see #getHardwareID()
	 * @generated
	 */
	void setHardwareID(String value);

	/**
	 * Returns the value of the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program ID</em>' attribute.
	 * @see #setProgramID(String)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAssetFunction_ProgramID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of program.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of program.'"
	 * @generated
	 */
	String getProgramID();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AssetFunction#getProgramID <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program ID</em>' attribute.
	 * @see #getProgramID()
	 * @generated
	 */
	void setProgramID(String value);

	/**
	 * Returns the value of the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmware ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware ID</em>' attribute.
	 * @see #setFirmwareID(String)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAssetFunction_FirmwareID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Firmware version.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Firmware version.'"
	 * @generated
	 */
	String getFirmwareID();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AssetFunction#getFirmwareID <em>Firmware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware ID</em>' attribute.
	 * @see #getFirmwareID()
	 * @generated
	 */
	void setFirmwareID(String value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getAssetFunctions <em>Asset Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAssetFunction_Asset()
	 * @see CIM.IEC61968.Assets.Asset#getAssetFunctions
	 * @model opposite="AssetFunctions"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AssetFunction#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAssetFunction_Password()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Password needed to access this function.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Password needed to access this function.'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AssetFunction#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config ID</em>' attribute.
	 * @see #setConfigID(String)
	 * @see CIM.IEC61968.Assets.AssetsPackage#getAssetFunction_ConfigID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Configuration specified for this function.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Configuration specified for this function.'"
	 * @generated
	 */
	String getConfigID();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Assets.AssetFunction#getConfigID <em>Config ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config ID</em>' attribute.
	 * @see #getConfigID()
	 * @generated
	 */
	void setConfigID(String value);

} // AssetFunction
