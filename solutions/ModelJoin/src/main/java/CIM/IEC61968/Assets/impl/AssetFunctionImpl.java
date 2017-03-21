/**
 */
package CIM.IEC61968.Assets.impl;

import CIM.IEC61968.Assets.Asset;
import CIM.IEC61968.Assets.AssetFunction;
import CIM.IEC61968.Assets.AssetsPackage;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetFunctionImpl#getHardwareID <em>Hardware ID</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetFunctionImpl#getProgramID <em>Program ID</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetFunctionImpl#getFirmwareID <em>Firmware ID</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetFunctionImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetFunctionImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetFunctionImpl#getConfigID <em>Config ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetFunctionImpl extends IdentifiedObjectImpl implements AssetFunction {
	/**
	 * The default value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareID()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareID()
	 * @generated
	 * @ordered
	 */
	protected String hardwareID = HARDWARE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramID() <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramID() <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramID()
	 * @generated
	 * @ordered
	 */
	protected String programID = PROGRAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirmwareID() <em>Firmware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareID()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRMWARE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirmwareID() <em>Firmware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareID()
	 * @generated
	 * @ordered
	 */
	protected String firmwareID = FIRMWARE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigID() <em>Config ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigID() <em>Config ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigID()
	 * @generated
	 * @ordered
	 */
	protected String configID = CONFIG_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.ASSET_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardwareID() {
		return hardwareID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareID(String newHardwareID) {
		String oldHardwareID = hardwareID;
		hardwareID = newHardwareID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET_FUNCTION__HARDWARE_ID, oldHardwareID, hardwareID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramID() {
		return programID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramID(String newProgramID) {
		String oldProgramID = programID;
		programID = newProgramID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET_FUNCTION__PROGRAM_ID, oldProgramID, programID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirmwareID() {
		return firmwareID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmwareID(String newFirmwareID) {
		String oldFirmwareID = firmwareID;
		firmwareID = newFirmwareID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID, oldFirmwareID, firmwareID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET_FUNCTION__ASSET, oldAsset, asset));
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET_FUNCTION__ASSET, oldAsset, newAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__ASSET_FUNCTIONS, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, AssetsPackage.ASSET__ASSET_FUNCTIONS, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET_FUNCTION__ASSET, newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET_FUNCTION__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigID() {
		return configID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigID(String newConfigID) {
		String oldConfigID = configID;
		configID = newConfigID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET_FUNCTION__CONFIG_ID, oldConfigID, configID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__ASSET_FUNCTIONS, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				return basicSetAsset(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssetsPackage.ASSET_FUNCTION__HARDWARE_ID:
				return getHardwareID();
			case AssetsPackage.ASSET_FUNCTION__PROGRAM_ID:
				return getProgramID();
			case AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID:
				return getFirmwareID();
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case AssetsPackage.ASSET_FUNCTION__PASSWORD:
				return getPassword();
			case AssetsPackage.ASSET_FUNCTION__CONFIG_ID:
				return getConfigID();
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
			case AssetsPackage.ASSET_FUNCTION__HARDWARE_ID:
				setHardwareID((String)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__PROGRAM_ID:
				setProgramID((String)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID:
				setFirmwareID((String)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				setAsset((Asset)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__PASSWORD:
				setPassword((String)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__CONFIG_ID:
				setConfigID((String)newValue);
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
			case AssetsPackage.ASSET_FUNCTION__HARDWARE_ID:
				setHardwareID(HARDWARE_ID_EDEFAULT);
				return;
			case AssetsPackage.ASSET_FUNCTION__PROGRAM_ID:
				setProgramID(PROGRAM_ID_EDEFAULT);
				return;
			case AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID:
				setFirmwareID(FIRMWARE_ID_EDEFAULT);
				return;
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				setAsset((Asset)null);
				return;
			case AssetsPackage.ASSET_FUNCTION__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case AssetsPackage.ASSET_FUNCTION__CONFIG_ID:
				setConfigID(CONFIG_ID_EDEFAULT);
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
			case AssetsPackage.ASSET_FUNCTION__HARDWARE_ID:
				return HARDWARE_ID_EDEFAULT == null ? hardwareID != null : !HARDWARE_ID_EDEFAULT.equals(hardwareID);
			case AssetsPackage.ASSET_FUNCTION__PROGRAM_ID:
				return PROGRAM_ID_EDEFAULT == null ? programID != null : !PROGRAM_ID_EDEFAULT.equals(programID);
			case AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID:
				return FIRMWARE_ID_EDEFAULT == null ? firmwareID != null : !FIRMWARE_ID_EDEFAULT.equals(firmwareID);
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				return asset != null;
			case AssetsPackage.ASSET_FUNCTION__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case AssetsPackage.ASSET_FUNCTION__CONFIG_ID:
				return CONFIG_ID_EDEFAULT == null ? configID != null : !CONFIG_ID_EDEFAULT.equals(configID);
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
		result.append(" (hardwareID: ");
		result.append(hardwareID);
		result.append(", programID: ");
		result.append(programID);
		result.append(", firmwareID: ");
		result.append(firmwareID);
		result.append(", password: ");
		result.append(password);
		result.append(", configID: ");
		result.append(configID);
		result.append(')');
		return result.toString();
	}

} //AssetFunctionImpl
