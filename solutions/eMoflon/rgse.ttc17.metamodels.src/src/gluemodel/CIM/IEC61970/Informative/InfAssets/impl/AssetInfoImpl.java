/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModel;
import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.DimensionsInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;
import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetInfoImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetInfoImpl#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetInfoImpl#getAssetModel <em>Asset Model</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.AssetInfoImpl#getDimensionsInfo <em>Dimensions Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetInfoImpl extends IdentifiedObjectImpl implements AssetInfo {
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
	 * The cached value of the '{@link #getTypeAsset() <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsset()
	 * @generated
	 * @ordered
	 */
	protected TypeAsset typeAsset;

	/**
	 * The cached value of the '{@link #getAssetModel() <em>Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModel()
	 * @generated
	 * @ordered
	 */
	protected AssetModel assetModel;

	/**
	 * The cached value of the '{@link #getDimensionsInfo() <em>Dimensions Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionsInfo()
	 * @generated
	 * @ordered
	 */
	protected DimensionsInfo dimensionsInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getAssetInfo();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ASSET_INFO__ASSET, oldAsset, asset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_INFO__ASSET, oldAsset, newAsset);
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
				msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__ASSET_INFO, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, AssetsPackage.ASSET__ASSET_INFO, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_INFO__ASSET, newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAsset getTypeAsset() {
		if (typeAsset != null && typeAsset.eIsProxy()) {
			InternalEObject oldTypeAsset = (InternalEObject)typeAsset;
			typeAsset = (TypeAsset)eResolveProxy(oldTypeAsset);
			if (typeAsset != oldTypeAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ASSET_INFO__TYPE_ASSET, oldTypeAsset, typeAsset));
			}
		}
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAsset basicGetTypeAsset() {
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAsset(TypeAsset newTypeAsset, NotificationChain msgs) {
		TypeAsset oldTypeAsset = typeAsset;
		typeAsset = newTypeAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_INFO__TYPE_ASSET, oldTypeAsset, newTypeAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAsset(TypeAsset newTypeAsset) {
		if (newTypeAsset != typeAsset) {
			NotificationChain msgs = null;
			if (typeAsset != null)
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO, TypeAsset.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO, TypeAsset.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_INFO__TYPE_ASSET, newTypeAsset, newTypeAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModel getAssetModel() {
		if (assetModel != null && assetModel.eIsProxy()) {
			InternalEObject oldAssetModel = (InternalEObject)assetModel;
			assetModel = (AssetModel)eResolveProxy(oldAssetModel);
			if (assetModel != oldAssetModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ASSET_INFO__ASSET_MODEL, oldAssetModel, assetModel));
			}
		}
		return assetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModel basicGetAssetModel() {
		return assetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetModel(AssetModel newAssetModel, NotificationChain msgs) {
		AssetModel oldAssetModel = assetModel;
		assetModel = newAssetModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_INFO__ASSET_MODEL, oldAssetModel, newAssetModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetModel(AssetModel newAssetModel) {
		if (newAssetModel != assetModel) {
			NotificationChain msgs = null;
			if (assetModel != null)
				msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetModelsPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs);
			if (newAssetModel != null)
				msgs = ((InternalEObject)newAssetModel).eInverseAdd(this, AssetModelsPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs);
			msgs = basicSetAssetModel(newAssetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_INFO__ASSET_MODEL, newAssetModel, newAssetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsInfo getDimensionsInfo() {
		if (dimensionsInfo != null && dimensionsInfo.eIsProxy()) {
			InternalEObject oldDimensionsInfo = (InternalEObject)dimensionsInfo;
			dimensionsInfo = (DimensionsInfo)eResolveProxy(oldDimensionsInfo);
			if (dimensionsInfo != oldDimensionsInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO, oldDimensionsInfo, dimensionsInfo));
			}
		}
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsInfo basicGetDimensionsInfo() {
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionsInfo(DimensionsInfo newDimensionsInfo, NotificationChain msgs) {
		DimensionsInfo oldDimensionsInfo = dimensionsInfo;
		dimensionsInfo = newDimensionsInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO, oldDimensionsInfo, newDimensionsInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionsInfo(DimensionsInfo newDimensionsInfo) {
		if (newDimensionsInfo != dimensionsInfo) {
			NotificationChain msgs = null;
			if (dimensionsInfo != null)
				msgs = ((InternalEObject)dimensionsInfo).eInverseRemove(this, InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS, DimensionsInfo.class, msgs);
			if (newDimensionsInfo != null)
				msgs = ((InternalEObject)newDimensionsInfo).eInverseAdd(this, InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS, DimensionsInfo.class, msgs);
			msgs = basicSetDimensionsInfo(newDimensionsInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO, newDimensionsInfo, newDimensionsInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.ASSET_INFO__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__ASSET_INFO, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
			case InfAssetsPackage.ASSET_INFO__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO, TypeAsset.class, msgs);
				return basicSetTypeAsset((TypeAsset)otherEnd, msgs);
			case InfAssetsPackage.ASSET_INFO__ASSET_MODEL:
				if (assetModel != null)
					msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetModelsPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs);
				return basicSetAssetModel((AssetModel)otherEnd, msgs);
			case InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				if (dimensionsInfo != null)
					msgs = ((InternalEObject)dimensionsInfo).eInverseRemove(this, InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS, DimensionsInfo.class, msgs);
				return basicSetDimensionsInfo((DimensionsInfo)otherEnd, msgs);
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
			case InfAssetsPackage.ASSET_INFO__ASSET:
				return basicSetAsset(null, msgs);
			case InfAssetsPackage.ASSET_INFO__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
			case InfAssetsPackage.ASSET_INFO__ASSET_MODEL:
				return basicSetAssetModel(null, msgs);
			case InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				return basicSetDimensionsInfo(null, msgs);
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
			case InfAssetsPackage.ASSET_INFO__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case InfAssetsPackage.ASSET_INFO__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
			case InfAssetsPackage.ASSET_INFO__ASSET_MODEL:
				if (resolve) return getAssetModel();
				return basicGetAssetModel();
			case InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				if (resolve) return getDimensionsInfo();
				return basicGetDimensionsInfo();
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
			case InfAssetsPackage.ASSET_INFO__ASSET:
				setAsset((Asset)newValue);
				return;
			case InfAssetsPackage.ASSET_INFO__TYPE_ASSET:
				setTypeAsset((TypeAsset)newValue);
				return;
			case InfAssetsPackage.ASSET_INFO__ASSET_MODEL:
				setAssetModel((AssetModel)newValue);
				return;
			case InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				setDimensionsInfo((DimensionsInfo)newValue);
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
			case InfAssetsPackage.ASSET_INFO__ASSET:
				setAsset((Asset)null);
				return;
			case InfAssetsPackage.ASSET_INFO__TYPE_ASSET:
				setTypeAsset((TypeAsset)null);
				return;
			case InfAssetsPackage.ASSET_INFO__ASSET_MODEL:
				setAssetModel((AssetModel)null);
				return;
			case InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				setDimensionsInfo((DimensionsInfo)null);
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
			case InfAssetsPackage.ASSET_INFO__ASSET:
				return asset != null;
			case InfAssetsPackage.ASSET_INFO__TYPE_ASSET:
				return typeAsset != null;
			case InfAssetsPackage.ASSET_INFO__ASSET_MODEL:
				return assetModel != null;
			case InfAssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				return dimensionsInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //AssetInfoImpl
