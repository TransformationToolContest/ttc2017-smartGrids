/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareIdentifier <em>Active Firmware Identifier</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareVersion <em>Active Firmware Version</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareSignature <em>Active Firmware Signature</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getProgramEntries()
 * @model
 * @generated
 */
public interface ProgramEntries extends Data {
	/**
	 * Returns the value of the '<em><b>Active Firmware Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Firmware Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Firmware Identifier</em>' attribute.
	 * @see #setActiveFirmwareIdentifier(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getProgramEntries_ActiveFirmwareIdentifier()
	 * @model
	 * @generated
	 */
	String getActiveFirmwareIdentifier();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareIdentifier <em>Active Firmware Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Firmware Identifier</em>' attribute.
	 * @see #getActiveFirmwareIdentifier()
	 * @generated
	 */
	void setActiveFirmwareIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Active Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Firmware Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Firmware Version</em>' attribute.
	 * @see #setActiveFirmwareVersion(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getProgramEntries_ActiveFirmwareVersion()
	 * @model
	 * @generated
	 */
	String getActiveFirmwareVersion();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareVersion <em>Active Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Firmware Version</em>' attribute.
	 * @see #getActiveFirmwareVersion()
	 * @generated
	 */
	void setActiveFirmwareVersion(String value);

	/**
	 * Returns the value of the '<em><b>Active Firmware Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Firmware Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Firmware Signature</em>' attribute.
	 * @see #setActiveFirmwareSignature(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getProgramEntries_ActiveFirmwareSignature()
	 * @model
	 * @generated
	 */
	String getActiveFirmwareSignature();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareSignature <em>Active Firmware Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Firmware Signature</em>' attribute.
	 * @see #getActiveFirmwareSignature()
	 * @generated
	 */
	void setActiveFirmwareSignature(String value);

} // ProgramEntries
