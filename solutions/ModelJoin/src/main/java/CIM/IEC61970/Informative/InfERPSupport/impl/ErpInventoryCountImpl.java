/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.AssetModels.AssetModel;
import CIM.IEC61968.AssetModels.AssetModelsPackage;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.MaterialItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Inventory Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryCountImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryCountImpl#getMaterialItem <em>Material Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInventoryCountImpl#getAssetModel <em>Asset Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpInventoryCountImpl extends IdentifiedObjectImpl implements ErpInventoryCount {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getMaterialItem() <em>Material Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItem()
	 * @generated
	 * @ordered
	 */
	protected MaterialItem materialItem;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpInventoryCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_INVENTORY_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialItem getMaterialItem() {
		if (materialItem != null && materialItem.eIsProxy()) {
			InternalEObject oldMaterialItem = (InternalEObject)materialItem;
			materialItem = (MaterialItem)eResolveProxy(oldMaterialItem);
			if (materialItem != oldMaterialItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM, oldMaterialItem, materialItem));
			}
		}
		return materialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialItem basicGetMaterialItem() {
		return materialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialItem(MaterialItem newMaterialItem, NotificationChain msgs) {
		MaterialItem oldMaterialItem = materialItem;
		materialItem = newMaterialItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM, oldMaterialItem, newMaterialItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialItem(MaterialItem newMaterialItem) {
		if (newMaterialItem != materialItem) {
			NotificationChain msgs = null;
			if (materialItem != null)
				msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS, MaterialItem.class, msgs);
			if (newMaterialItem != null)
				msgs = ((InternalEObject)newMaterialItem).eInverseAdd(this, InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS, MaterialItem.class, msgs);
			msgs = basicSetMaterialItem(newMaterialItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM, newMaterialItem, newMaterialItem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL, oldAssetModel, assetModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL, oldAssetModel, newAssetModel);
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
				msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS, AssetModel.class, msgs);
			if (newAssetModel != null)
				msgs = ((InternalEObject)newAssetModel).eInverseAdd(this, AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS, AssetModel.class, msgs);
			msgs = basicSetAssetModel(newAssetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL, newAssetModel, newAssetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				if (materialItem != null)
					msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS, MaterialItem.class, msgs);
				return basicSetMaterialItem((MaterialItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				if (assetModel != null)
					msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetModelsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS, AssetModel.class, msgs);
				return basicSetAssetModel((AssetModel)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				return basicSetMaterialItem(null, msgs);
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				return basicSetAssetModel(null, msgs);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				if (resolve) return getMaterialItem();
				return basicGetMaterialItem();
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				if (resolve) return getAssetModel();
				return basicGetAssetModel();
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				setAssetModel((AssetModel)newValue);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)null);
				return;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				setAssetModel((AssetModel)null);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				return materialItem != null;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				return assetModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpInventoryCountImpl
