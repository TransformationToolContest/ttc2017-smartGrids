/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ProgramEntries;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ProgramEntriesImpl#getActiveFirmwareIdentifier <em>Active Firmware Identifier</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ProgramEntriesImpl#getActiveFirmwareVersion <em>Active Firmware Version</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ProgramEntriesImpl#getActiveFirmwareSignature <em>Active Firmware Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramEntriesImpl extends DataImpl implements ProgramEntries {
	/**
	 * The default value of the '{@link #getActiveFirmwareIdentifier() <em>Active Firmware Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFirmwareIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_FIRMWARE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveFirmwareIdentifier() <em>Active Firmware Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFirmwareIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String activeFirmwareIdentifier = ACTIVE_FIRMWARE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveFirmwareVersion() <em>Active Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_FIRMWARE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveFirmwareVersion() <em>Active Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected String activeFirmwareVersion = ACTIVE_FIRMWARE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveFirmwareSignature() <em>Active Firmware Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFirmwareSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_FIRMWARE_SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveFirmwareSignature() <em>Active Firmware Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFirmwareSignature()
	 * @generated
	 * @ordered
	 */
	protected String activeFirmwareSignature = ACTIVE_FIRMWARE_SIGNATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramEntriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getProgramEntries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiveFirmwareIdentifier() {
		return activeFirmwareIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveFirmwareIdentifier(String newActiveFirmwareIdentifier) {
		String oldActiveFirmwareIdentifier = activeFirmwareIdentifier;
		activeFirmwareIdentifier = newActiveFirmwareIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_IDENTIFIER, oldActiveFirmwareIdentifier, activeFirmwareIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiveFirmwareVersion() {
		return activeFirmwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveFirmwareVersion(String newActiveFirmwareVersion) {
		String oldActiveFirmwareVersion = activeFirmwareVersion;
		activeFirmwareVersion = newActiveFirmwareVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_VERSION, oldActiveFirmwareVersion, activeFirmwareVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiveFirmwareSignature() {
		return activeFirmwareSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveFirmwareSignature(String newActiveFirmwareSignature) {
		String oldActiveFirmwareSignature = activeFirmwareSignature;
		activeFirmwareSignature = newActiveFirmwareSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_SIGNATURE, oldActiveFirmwareSignature, activeFirmwareSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_IDENTIFIER:
				return getActiveFirmwareIdentifier();
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_VERSION:
				return getActiveFirmwareVersion();
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_SIGNATURE:
				return getActiveFirmwareSignature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_IDENTIFIER:
				setActiveFirmwareIdentifier((String)newValue);
				return;
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_VERSION:
				setActiveFirmwareVersion((String)newValue);
				return;
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_SIGNATURE:
				setActiveFirmwareSignature((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_IDENTIFIER:
				setActiveFirmwareIdentifier(ACTIVE_FIRMWARE_IDENTIFIER_EDEFAULT);
				return;
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_VERSION:
				setActiveFirmwareVersion(ACTIVE_FIRMWARE_VERSION_EDEFAULT);
				return;
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_SIGNATURE:
				setActiveFirmwareSignature(ACTIVE_FIRMWARE_SIGNATURE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_IDENTIFIER:
				return ACTIVE_FIRMWARE_IDENTIFIER_EDEFAULT == null ? activeFirmwareIdentifier != null : !ACTIVE_FIRMWARE_IDENTIFIER_EDEFAULT.equals(activeFirmwareIdentifier);
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_VERSION:
				return ACTIVE_FIRMWARE_VERSION_EDEFAULT == null ? activeFirmwareVersion != null : !ACTIVE_FIRMWARE_VERSION_EDEFAULT.equals(activeFirmwareVersion);
			case COSEMObjectsPackage.PROGRAM_ENTRIES__ACTIVE_FIRMWARE_SIGNATURE:
				return ACTIVE_FIRMWARE_SIGNATURE_EDEFAULT == null ? activeFirmwareSignature != null : !ACTIVE_FIRMWARE_SIGNATURE_EDEFAULT.equals(activeFirmwareSignature);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ActiveFirmwareIdentifier: ");
		result.append(activeFirmwareIdentifier);
		result.append(", ActiveFirmwareVersion: ");
		result.append(activeFirmwareVersion);
		result.append(", ActiveFirmwareSignature: ");
		result.append(activeFirmwareSignature);
		result.append(')');
		return result.toString();
	}

} //ProgramEntriesImpl
