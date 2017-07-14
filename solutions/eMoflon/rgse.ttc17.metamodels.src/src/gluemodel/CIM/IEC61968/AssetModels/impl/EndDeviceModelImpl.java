/**
 */
package gluemodel.CIM.IEC61968.AssetModels.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.EndDeviceModelImpl#getEndDeviceAssets <em>End Device Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceModelImpl extends AssetModelImpl implements EndDeviceModel {
	/**
	 * The cached value of the '{@link #getEndDeviceAssets() <em>End Device Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceAsset> endDeviceAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.END_DEVICE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceAsset> getEndDeviceAssets() {
		if (endDeviceAssets == null) {
			endDeviceAssets = new EObjectWithInverseResolvingEList<EndDeviceAsset>(EndDeviceAsset.class, this, AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL);
		}
		return endDeviceAssets;
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
			case AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceAssets()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS:
				return ((InternalEList<?>)getEndDeviceAssets()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS:
				return getEndDeviceAssets();
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
			case AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
				getEndDeviceAssets().addAll((Collection<? extends EndDeviceAsset>)newValue);
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
			case AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
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
			case AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS:
				return endDeviceAssets != null && !endDeviceAssets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndDeviceModelImpl
