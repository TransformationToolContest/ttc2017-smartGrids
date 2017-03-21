/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModel;
import CIM.IEC61968.AssetModels.AssetModelUsageKind;
import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.CorporateStandardKind;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;
import CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import CIM.IEC61970.Informative.InfAssets.AssetInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;
import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getCorporateStandardKind <em>Corporate Standard Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getErpInventoryCounts <em>Erp Inventory Counts</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.AssetModelImpl#getWeightTotal <em>Weight Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetModelImpl extends IdentifiedObjectImpl implements AssetModel {
	/**
	 * The default value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelVersion()
	 * @generated
	 * @ordered
	 */
	protected String modelVersion = MODEL_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetInfo() <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetInfo()
	 * @generated
	 * @ordered
	 */
	protected AssetInfo assetInfo;

	/**
	 * The default value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected String modelNumber = MODEL_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetModelCatalogueItems() <em>Asset Model Catalogue Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModelCatalogueItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetModelCatalogueItem> assetModelCatalogueItems;

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
	 * The default value of the '{@link #getCorporateStandardKind() <em>Corporate Standard Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateStandardKind()
	 * @generated
	 * @ordered
	 */
	protected static final CorporateStandardKind CORPORATE_STANDARD_KIND_EDEFAULT = CorporateStandardKind.UNDER_EVALUATION;

	/**
	 * The cached value of the '{@link #getCorporateStandardKind() <em>Corporate Standard Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateStandardKind()
	 * @generated
	 * @ordered
	 */
	protected CorporateStandardKind corporateStandardKind = CORPORATE_STANDARD_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpInventoryCounts() <em>Erp Inventory Counts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInventoryCounts()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInventoryCount> erpInventoryCounts;

	/**
	 * The default value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageKind()
	 * @generated
	 * @ordered
	 */
	protected static final AssetModelUsageKind USAGE_KIND_EDEFAULT = AssetModelUsageKind.STREETLIGHT;

	/**
	 * The cached value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageKind()
	 * @generated
	 * @ordered
	 */
	protected AssetModelUsageKind usageKind = USAGE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightTotal() <em>Weight Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightTotal()
	 * @generated
	 * @ordered
	 */
	protected static final float WEIGHT_TOTAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWeightTotal() <em>Weight Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightTotal()
	 * @generated
	 * @ordered
	 */
	protected float weightTotal = WEIGHT_TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.ASSET_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelVersion() {
		return modelVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelVersion(String newModelVersion) {
		String oldModelVersion = modelVersion;
		modelVersion = newModelVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__MODEL_VERSION, oldModelVersion, modelVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetInfo getAssetInfo() {
		if (assetInfo != null && assetInfo.eIsProxy()) {
			InternalEObject oldAssetInfo = (InternalEObject)assetInfo;
			assetInfo = (AssetInfo)eResolveProxy(oldAssetInfo);
			if (assetInfo != oldAssetInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.ASSET_MODEL__ASSET_INFO, oldAssetInfo, assetInfo));
			}
		}
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetInfo basicGetAssetInfo() {
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetInfo(AssetInfo newAssetInfo, NotificationChain msgs) {
		AssetInfo oldAssetInfo = assetInfo;
		assetInfo = newAssetInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__ASSET_INFO, oldAssetInfo, newAssetInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetInfo(AssetInfo newAssetInfo) {
		if (newAssetInfo != assetInfo) {
			NotificationChain msgs = null;
			if (assetInfo != null)
				msgs = ((InternalEObject)assetInfo).eInverseRemove(this, InfAssetsPackage.ASSET_INFO__ASSET_MODEL, AssetInfo.class, msgs);
			if (newAssetInfo != null)
				msgs = ((InternalEObject)newAssetInfo).eInverseAdd(this, InfAssetsPackage.ASSET_INFO__ASSET_MODEL, AssetInfo.class, msgs);
			msgs = basicSetAssetInfo(newAssetInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__ASSET_INFO, newAssetInfo, newAssetInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelNumber(String newModelNumber) {
		String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__MODEL_NUMBER, oldModelNumber, modelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetModelCatalogueItem> getAssetModelCatalogueItems() {
		if (assetModelCatalogueItems == null) {
			assetModelCatalogueItems = new EObjectWithInverseResolvingEList<AssetModelCatalogueItem>(AssetModelCatalogueItem.class, this, AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL);
		}
		return assetModelCatalogueItems;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetModelsPackage.ASSET_MODEL__TYPE_ASSET, oldTypeAsset, typeAsset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__TYPE_ASSET, oldTypeAsset, newTypeAsset);
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
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS, TypeAsset.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS, TypeAsset.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__TYPE_ASSET, newTypeAsset, newTypeAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorporateStandardKind getCorporateStandardKind() {
		return corporateStandardKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorporateStandardKind(CorporateStandardKind newCorporateStandardKind) {
		CorporateStandardKind oldCorporateStandardKind = corporateStandardKind;
		corporateStandardKind = newCorporateStandardKind == null ? CORPORATE_STANDARD_KIND_EDEFAULT : newCorporateStandardKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__CORPORATE_STANDARD_KIND, oldCorporateStandardKind, corporateStandardKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInventoryCount> getErpInventoryCounts() {
		if (erpInventoryCounts == null) {
			erpInventoryCounts = new EObjectWithInverseResolvingEList<ErpInventoryCount>(ErpInventoryCount.class, this, AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS, InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL);
		}
		return erpInventoryCounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelUsageKind getUsageKind() {
		return usageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageKind(AssetModelUsageKind newUsageKind) {
		AssetModelUsageKind oldUsageKind = usageKind;
		usageKind = newUsageKind == null ? USAGE_KIND_EDEFAULT : newUsageKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__USAGE_KIND, oldUsageKind, usageKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWeightTotal() {
		return weightTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightTotal(float newWeightTotal) {
		float oldWeightTotal = weightTotal;
		weightTotal = newWeightTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.ASSET_MODEL__WEIGHT_TOTAL, oldWeightTotal, weightTotal));
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
			case AssetModelsPackage.ASSET_MODEL__ASSET_INFO:
				if (assetInfo != null)
					msgs = ((InternalEObject)assetInfo).eInverseRemove(this, InfAssetsPackage.ASSET_INFO__ASSET_MODEL, AssetInfo.class, msgs);
				return basicSetAssetInfo((AssetInfo)otherEnd, msgs);
			case AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetModelCatalogueItems()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.ASSET_MODEL__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS, TypeAsset.class, msgs);
				return basicSetTypeAsset((TypeAsset)otherEnd, msgs);
			case AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInventoryCounts()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.ASSET_MODEL__ASSET_INFO:
				return basicSetAssetInfo(null, msgs);
			case AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				return ((InternalEList<?>)getAssetModelCatalogueItems()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.ASSET_MODEL__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
			case AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				return ((InternalEList<?>)getErpInventoryCounts()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.ASSET_MODEL__MODEL_VERSION:
				return getModelVersion();
			case AssetModelsPackage.ASSET_MODEL__ASSET_INFO:
				if (resolve) return getAssetInfo();
				return basicGetAssetInfo();
			case AssetModelsPackage.ASSET_MODEL__MODEL_NUMBER:
				return getModelNumber();
			case AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				return getAssetModelCatalogueItems();
			case AssetModelsPackage.ASSET_MODEL__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
			case AssetModelsPackage.ASSET_MODEL__CORPORATE_STANDARD_KIND:
				return getCorporateStandardKind();
			case AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				return getErpInventoryCounts();
			case AssetModelsPackage.ASSET_MODEL__USAGE_KIND:
				return getUsageKind();
			case AssetModelsPackage.ASSET_MODEL__WEIGHT_TOTAL:
				return getWeightTotal();
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
			case AssetModelsPackage.ASSET_MODEL__MODEL_VERSION:
				setModelVersion((String)newValue);
				return;
			case AssetModelsPackage.ASSET_MODEL__ASSET_INFO:
				setAssetInfo((AssetInfo)newValue);
				return;
			case AssetModelsPackage.ASSET_MODEL__MODEL_NUMBER:
				setModelNumber((String)newValue);
				return;
			case AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				getAssetModelCatalogueItems().clear();
				getAssetModelCatalogueItems().addAll((Collection<? extends AssetModelCatalogueItem>)newValue);
				return;
			case AssetModelsPackage.ASSET_MODEL__TYPE_ASSET:
				setTypeAsset((TypeAsset)newValue);
				return;
			case AssetModelsPackage.ASSET_MODEL__CORPORATE_STANDARD_KIND:
				setCorporateStandardKind((CorporateStandardKind)newValue);
				return;
			case AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				getErpInventoryCounts().clear();
				getErpInventoryCounts().addAll((Collection<? extends ErpInventoryCount>)newValue);
				return;
			case AssetModelsPackage.ASSET_MODEL__USAGE_KIND:
				setUsageKind((AssetModelUsageKind)newValue);
				return;
			case AssetModelsPackage.ASSET_MODEL__WEIGHT_TOTAL:
				setWeightTotal((Float)newValue);
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
			case AssetModelsPackage.ASSET_MODEL__MODEL_VERSION:
				setModelVersion(MODEL_VERSION_EDEFAULT);
				return;
			case AssetModelsPackage.ASSET_MODEL__ASSET_INFO:
				setAssetInfo((AssetInfo)null);
				return;
			case AssetModelsPackage.ASSET_MODEL__MODEL_NUMBER:
				setModelNumber(MODEL_NUMBER_EDEFAULT);
				return;
			case AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				getAssetModelCatalogueItems().clear();
				return;
			case AssetModelsPackage.ASSET_MODEL__TYPE_ASSET:
				setTypeAsset((TypeAsset)null);
				return;
			case AssetModelsPackage.ASSET_MODEL__CORPORATE_STANDARD_KIND:
				setCorporateStandardKind(CORPORATE_STANDARD_KIND_EDEFAULT);
				return;
			case AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				getErpInventoryCounts().clear();
				return;
			case AssetModelsPackage.ASSET_MODEL__USAGE_KIND:
				setUsageKind(USAGE_KIND_EDEFAULT);
				return;
			case AssetModelsPackage.ASSET_MODEL__WEIGHT_TOTAL:
				setWeightTotal(WEIGHT_TOTAL_EDEFAULT);
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
			case AssetModelsPackage.ASSET_MODEL__MODEL_VERSION:
				return MODEL_VERSION_EDEFAULT == null ? modelVersion != null : !MODEL_VERSION_EDEFAULT.equals(modelVersion);
			case AssetModelsPackage.ASSET_MODEL__ASSET_INFO:
				return assetInfo != null;
			case AssetModelsPackage.ASSET_MODEL__MODEL_NUMBER:
				return MODEL_NUMBER_EDEFAULT == null ? modelNumber != null : !MODEL_NUMBER_EDEFAULT.equals(modelNumber);
			case AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				return assetModelCatalogueItems != null && !assetModelCatalogueItems.isEmpty();
			case AssetModelsPackage.ASSET_MODEL__TYPE_ASSET:
				return typeAsset != null;
			case AssetModelsPackage.ASSET_MODEL__CORPORATE_STANDARD_KIND:
				return corporateStandardKind != CORPORATE_STANDARD_KIND_EDEFAULT;
			case AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				return erpInventoryCounts != null && !erpInventoryCounts.isEmpty();
			case AssetModelsPackage.ASSET_MODEL__USAGE_KIND:
				return usageKind != USAGE_KIND_EDEFAULT;
			case AssetModelsPackage.ASSET_MODEL__WEIGHT_TOTAL:
				return weightTotal != WEIGHT_TOTAL_EDEFAULT;
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
		result.append(" (modelVersion: ");
		result.append(modelVersion);
		result.append(", modelNumber: ");
		result.append(modelNumber);
		result.append(", corporateStandardKind: ");
		result.append(corporateStandardKind);
		result.append(", usageKind: ");
		result.append(usageKind);
		result.append(", weightTotal: ");
		result.append(weightTotal);
		result.append(')');
		return result.toString();
	}

} //AssetModelImpl
