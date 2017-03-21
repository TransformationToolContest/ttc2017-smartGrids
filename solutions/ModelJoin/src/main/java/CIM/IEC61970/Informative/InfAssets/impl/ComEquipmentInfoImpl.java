/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.Metering.DeviceFunction;
import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Equipment Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.ComEquipmentInfoImpl#getDeviceFunctions <em>Device Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComEquipmentInfoImpl extends AssetInfoImpl implements ComEquipmentInfo {
	/**
	 * The cached value of the '{@link #getDeviceFunctions() <em>Device Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceFunction> deviceFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComEquipmentInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getComEquipmentInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceFunction> getDeviceFunctions() {
		if (deviceFunctions == null) {
			deviceFunctions = new EObjectWithInverseResolvingEList<DeviceFunction>(DeviceFunction.class, this, InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS, MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET);
		}
		return deviceFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeviceFunctions()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS:
				return ((InternalEList<?>)getDeviceFunctions()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS:
				return getDeviceFunctions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS:
				getDeviceFunctions().clear();
				getDeviceFunctions().addAll((Collection<? extends DeviceFunction>)newValue);
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
			case InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS:
				getDeviceFunctions().clear();
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
			case InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS:
				return deviceFunctions != null && !deviceFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComEquipmentInfoImpl
