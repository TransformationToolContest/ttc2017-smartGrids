/**
 */
package gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModel;
import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpBomItemData;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpIssueInventory;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;
import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;
import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue;

import gluemodel.CIM.IEC61970.Informative.InfWork.CUAsset;
import gluemodel.CIM.IEC61970.Informative.InfWork.CUWorkEquipmentItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>Type Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getErpBomItemDatas <em>Erp Bom Item Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#isStockItem <em>Stock Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getErpReqLineItems <em>Erp Req Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getErpInventoryIssues <em>Erp Inventory Issues</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getEstimatedUnitCost <em>Estimated Unit Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getAssetModels <em>Asset Models</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getCUAsset <em>CU Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeAssetImpl extends IdentifiedObjectImpl implements TypeAsset {
	/**
	 * The cached value of the '{@link #getTypeAssetCatalogue() <em>Type Asset Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssetCatalogue()
	 * @generated
	 * @ordered
	 */
	protected TypeAssetCatalogue typeAssetCatalogue;

	/**
	 * The cached value of the '{@link #getErpBomItemDatas() <em>Erp Bom Item Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBomItemDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpBomItemData> erpBomItemDatas;

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
	 * The default value of the '{@link #isStockItem() <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStockItem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOCK_ITEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStockItem() <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStockItem()
	 * @generated
	 * @ordered
	 */
	protected boolean stockItem = STOCK_ITEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpReqLineItems() <em>Erp Req Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReqLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpReqLineItem> erpReqLineItems;

	/**
	 * The cached value of the '{@link #getErpInventoryIssues() <em>Erp Inventory Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInventoryIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpIssueInventory> erpInventoryIssues;

	/**
	 * The default value of the '{@link #getEstimatedUnitCost() <em>Estimated Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedUnitCost()
	 * @generated
	 * @ordered
	 */
	protected static final float ESTIMATED_UNIT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstimatedUnitCost() <em>Estimated Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedUnitCost()
	 * @generated
	 * @ordered
	 */
	protected float estimatedUnitCost = ESTIMATED_UNIT_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCUWorkEquipmentAsset() <em>CU Work Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUWorkEquipmentAsset()
	 * @generated
	 * @ordered
	 */
	protected CUWorkEquipmentItem cuWorkEquipmentAsset;

	/**
	 * The cached value of the '{@link #getAssetModels() <em>Asset Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetModel> assetModels;

	/**
	 * The cached value of the '{@link #getCUAsset() <em>CU Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUAsset()
	 * @generated
	 * @ordered
	 */
	protected CUAsset cuAsset;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected String quantity = QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfTypeAssetPackage.Literals.TYPE_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssetCatalogue getTypeAssetCatalogue() {
		if (typeAssetCatalogue != null && typeAssetCatalogue.eIsProxy()) {
			InternalEObject oldTypeAssetCatalogue = (InternalEObject)typeAssetCatalogue;
			typeAssetCatalogue = (TypeAssetCatalogue)eResolveProxy(oldTypeAssetCatalogue);
			if (typeAssetCatalogue != oldTypeAssetCatalogue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE, oldTypeAssetCatalogue, typeAssetCatalogue));
			}
		}
		return typeAssetCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssetCatalogue basicGetTypeAssetCatalogue() {
		return typeAssetCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAssetCatalogue(TypeAssetCatalogue newTypeAssetCatalogue, NotificationChain msgs) {
		TypeAssetCatalogue oldTypeAssetCatalogue = typeAssetCatalogue;
		typeAssetCatalogue = newTypeAssetCatalogue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE, oldTypeAssetCatalogue, newTypeAssetCatalogue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAssetCatalogue(TypeAssetCatalogue newTypeAssetCatalogue) {
		if (newTypeAssetCatalogue != typeAssetCatalogue) {
			NotificationChain msgs = null;
			if (typeAssetCatalogue != null)
				msgs = ((InternalEObject)typeAssetCatalogue).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS, TypeAssetCatalogue.class, msgs);
			if (newTypeAssetCatalogue != null)
				msgs = ((InternalEObject)newTypeAssetCatalogue).eInverseAdd(this, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS, TypeAssetCatalogue.class, msgs);
			msgs = basicSetTypeAssetCatalogue(newTypeAssetCatalogue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE, newTypeAssetCatalogue, newTypeAssetCatalogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpBomItemData> getErpBomItemDatas() {
		if (erpBomItemDatas == null) {
			erpBomItemDatas = new EObjectWithInverseResolvingEList<ErpBomItemData>(ErpBomItemData.class, this, InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS, InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET);
		}
		return erpBomItemDatas;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO, oldAssetInfo, assetInfo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO, oldAssetInfo, newAssetInfo);
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
				msgs = ((InternalEObject)assetInfo).eInverseRemove(this, InfAssetsPackage.ASSET_INFO__TYPE_ASSET, AssetInfo.class, msgs);
			if (newAssetInfo != null)
				msgs = ((InternalEObject)newAssetInfo).eInverseAdd(this, InfAssetsPackage.ASSET_INFO__TYPE_ASSET, AssetInfo.class, msgs);
			msgs = basicSetAssetInfo(newAssetInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO, newAssetInfo, newAssetInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStockItem() {
		return stockItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockItem(boolean newStockItem) {
		boolean oldStockItem = stockItem;
		stockItem = newStockItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__STOCK_ITEM, oldStockItem, stockItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpReqLineItem> getErpReqLineItems() {
		if (erpReqLineItems == null) {
			erpReqLineItems = new EObjectWithInverseResolvingEList<ErpReqLineItem>(ErpReqLineItem.class, this, InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS, InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET);
		}
		return erpReqLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpIssueInventory> getErpInventoryIssues() {
		if (erpInventoryIssues == null) {
			erpInventoryIssues = new EObjectWithInverseResolvingEList<ErpIssueInventory>(ErpIssueInventory.class, this, InfTypeAssetPackage.TYPE_ASSET__ERP_INVENTORY_ISSUES, InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_ASSET);
		}
		return erpInventoryIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEstimatedUnitCost() {
		return estimatedUnitCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedUnitCost(float newEstimatedUnitCost) {
		float oldEstimatedUnitCost = estimatedUnitCost;
		estimatedUnitCost = newEstimatedUnitCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__ESTIMATED_UNIT_COST, oldEstimatedUnitCost, estimatedUnitCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUWorkEquipmentItem getCUWorkEquipmentAsset() {
		if (cuWorkEquipmentAsset != null && cuWorkEquipmentAsset.eIsProxy()) {
			InternalEObject oldCUWorkEquipmentAsset = (InternalEObject)cuWorkEquipmentAsset;
			cuWorkEquipmentAsset = (CUWorkEquipmentItem)eResolveProxy(oldCUWorkEquipmentAsset);
			if (cuWorkEquipmentAsset != oldCUWorkEquipmentAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET, oldCUWorkEquipmentAsset, cuWorkEquipmentAsset));
			}
		}
		return cuWorkEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUWorkEquipmentItem basicGetCUWorkEquipmentAsset() {
		return cuWorkEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCUWorkEquipmentAsset(CUWorkEquipmentItem newCUWorkEquipmentAsset, NotificationChain msgs) {
		CUWorkEquipmentItem oldCUWorkEquipmentAsset = cuWorkEquipmentAsset;
		cuWorkEquipmentAsset = newCUWorkEquipmentAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET, oldCUWorkEquipmentAsset, newCUWorkEquipmentAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCUWorkEquipmentAsset(CUWorkEquipmentItem newCUWorkEquipmentAsset) {
		if (newCUWorkEquipmentAsset != cuWorkEquipmentAsset) {
			NotificationChain msgs = null;
			if (cuWorkEquipmentAsset != null)
				msgs = ((InternalEObject)cuWorkEquipmentAsset).eInverseRemove(this, InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET, CUWorkEquipmentItem.class, msgs);
			if (newCUWorkEquipmentAsset != null)
				msgs = ((InternalEObject)newCUWorkEquipmentAsset).eInverseAdd(this, InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET, CUWorkEquipmentItem.class, msgs);
			msgs = basicSetCUWorkEquipmentAsset(newCUWorkEquipmentAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET, newCUWorkEquipmentAsset, newCUWorkEquipmentAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetModel> getAssetModels() {
		if (assetModels == null) {
			assetModels = new EObjectWithInverseResolvingEList<AssetModel>(AssetModel.class, this, InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS, AssetModelsPackage.ASSET_MODEL__TYPE_ASSET);
		}
		return assetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAsset getCUAsset() {
		if (cuAsset != null && cuAsset.eIsProxy()) {
			InternalEObject oldCUAsset = (InternalEObject)cuAsset;
			cuAsset = (CUAsset)eResolveProxy(oldCUAsset);
			if (cuAsset != oldCUAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfTypeAssetPackage.TYPE_ASSET__CU_ASSET, oldCUAsset, cuAsset));
			}
		}
		return cuAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAsset basicGetCUAsset() {
		return cuAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCUAsset(CUAsset newCUAsset, NotificationChain msgs) {
		CUAsset oldCUAsset = cuAsset;
		cuAsset = newCUAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__CU_ASSET, oldCUAsset, newCUAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCUAsset(CUAsset newCUAsset) {
		if (newCUAsset != cuAsset) {
			NotificationChain msgs = null;
			if (cuAsset != null)
				msgs = ((InternalEObject)cuAsset).eInverseRemove(this, InfWorkPackage.CU_ASSET__TYPE_ASSET, CUAsset.class, msgs);
			if (newCUAsset != null)
				msgs = ((InternalEObject)newCUAsset).eInverseAdd(this, InfWorkPackage.CU_ASSET__TYPE_ASSET, CUAsset.class, msgs);
			msgs = basicSetCUAsset(newCUAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__CU_ASSET, newCUAsset, newCUAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(String newQuantity) {
		String oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET__QUANTITY, oldQuantity, quantity));
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
			case InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE:
				if (typeAssetCatalogue != null)
					msgs = ((InternalEObject)typeAssetCatalogue).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS, TypeAssetCatalogue.class, msgs);
				return basicSetTypeAssetCatalogue((TypeAssetCatalogue)otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpBomItemDatas()).basicAdd(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO:
				if (assetInfo != null)
					msgs = ((InternalEObject)assetInfo).eInverseRemove(this, InfAssetsPackage.ASSET_INFO__TYPE_ASSET, AssetInfo.class, msgs);
				return basicSetAssetInfo((AssetInfo)otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpReqLineItems()).basicAdd(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ERP_INVENTORY_ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInventoryIssues()).basicAdd(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET:
				if (cuWorkEquipmentAsset != null)
					msgs = ((InternalEObject)cuWorkEquipmentAsset).eInverseRemove(this, InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET, CUWorkEquipmentItem.class, msgs);
				return basicSetCUWorkEquipmentAsset((CUWorkEquipmentItem)otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetModels()).basicAdd(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__CU_ASSET:
				if (cuAsset != null)
					msgs = ((InternalEObject)cuAsset).eInverseRemove(this, InfWorkPackage.CU_ASSET__TYPE_ASSET, CUAsset.class, msgs);
				return basicSetCUAsset((CUAsset)otherEnd, msgs);
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
			case InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE:
				return basicSetTypeAssetCatalogue(null, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<?>)getErpBomItemDatas()).basicRemove(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO:
				return basicSetAssetInfo(null, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<?>)getErpReqLineItems()).basicRemove(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ERP_INVENTORY_ISSUES:
				return ((InternalEList<?>)getErpInventoryIssues()).basicRemove(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET:
				return basicSetCUWorkEquipmentAsset(null, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS:
				return ((InternalEList<?>)getAssetModels()).basicRemove(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET__CU_ASSET:
				return basicSetCUAsset(null, msgs);
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
			case InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE:
				if (resolve) return getTypeAssetCatalogue();
				return basicGetTypeAssetCatalogue();
			case InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS:
				return getErpBomItemDatas();
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO:
				if (resolve) return getAssetInfo();
				return basicGetAssetInfo();
			case InfTypeAssetPackage.TYPE_ASSET__STOCK_ITEM:
				return isStockItem();
			case InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS:
				return getErpReqLineItems();
			case InfTypeAssetPackage.TYPE_ASSET__ERP_INVENTORY_ISSUES:
				return getErpInventoryIssues();
			case InfTypeAssetPackage.TYPE_ASSET__ESTIMATED_UNIT_COST:
				return getEstimatedUnitCost();
			case InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET:
				if (resolve) return getCUWorkEquipmentAsset();
				return basicGetCUWorkEquipmentAsset();
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS:
				return getAssetModels();
			case InfTypeAssetPackage.TYPE_ASSET__CU_ASSET:
				if (resolve) return getCUAsset();
				return basicGetCUAsset();
			case InfTypeAssetPackage.TYPE_ASSET__QUANTITY:
				return getQuantity();
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
			case InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE:
				setTypeAssetCatalogue((TypeAssetCatalogue)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				getErpBomItemDatas().addAll((Collection<? extends ErpBomItemData>)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO:
				setAssetInfo((AssetInfo)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__STOCK_ITEM:
				setStockItem((Boolean)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				getErpReqLineItems().addAll((Collection<? extends ErpReqLineItem>)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ERP_INVENTORY_ISSUES:
				getErpInventoryIssues().clear();
				getErpInventoryIssues().addAll((Collection<? extends ErpIssueInventory>)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ESTIMATED_UNIT_COST:
				setEstimatedUnitCost((Float)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET:
				setCUWorkEquipmentAsset((CUWorkEquipmentItem)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS:
				getAssetModels().clear();
				getAssetModels().addAll((Collection<? extends AssetModel>)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__CU_ASSET:
				setCUAsset((CUAsset)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__QUANTITY:
				setQuantity((String)newValue);
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
			case InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE:
				setTypeAssetCatalogue((TypeAssetCatalogue)null);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO:
				setAssetInfo((AssetInfo)null);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__STOCK_ITEM:
				setStockItem(STOCK_ITEM_EDEFAULT);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ERP_INVENTORY_ISSUES:
				getErpInventoryIssues().clear();
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ESTIMATED_UNIT_COST:
				setEstimatedUnitCost(ESTIMATED_UNIT_COST_EDEFAULT);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET:
				setCUWorkEquipmentAsset((CUWorkEquipmentItem)null);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS:
				getAssetModels().clear();
				return;
			case InfTypeAssetPackage.TYPE_ASSET__CU_ASSET:
				setCUAsset((CUAsset)null);
				return;
			case InfTypeAssetPackage.TYPE_ASSET__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
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
			case InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE:
				return typeAssetCatalogue != null;
			case InfTypeAssetPackage.TYPE_ASSET__ERP_BOM_ITEM_DATAS:
				return erpBomItemDatas != null && !erpBomItemDatas.isEmpty();
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_INFO:
				return assetInfo != null;
			case InfTypeAssetPackage.TYPE_ASSET__STOCK_ITEM:
				return stockItem != STOCK_ITEM_EDEFAULT;
			case InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS:
				return erpReqLineItems != null && !erpReqLineItems.isEmpty();
			case InfTypeAssetPackage.TYPE_ASSET__ERP_INVENTORY_ISSUES:
				return erpInventoryIssues != null && !erpInventoryIssues.isEmpty();
			case InfTypeAssetPackage.TYPE_ASSET__ESTIMATED_UNIT_COST:
				return estimatedUnitCost != ESTIMATED_UNIT_COST_EDEFAULT;
			case InfTypeAssetPackage.TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET:
				return cuWorkEquipmentAsset != null;
			case InfTypeAssetPackage.TYPE_ASSET__ASSET_MODELS:
				return assetModels != null && !assetModels.isEmpty();
			case InfTypeAssetPackage.TYPE_ASSET__CU_ASSET:
				return cuAsset != null;
			case InfTypeAssetPackage.TYPE_ASSET__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
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
		result.append(" (stockItem: ");
		result.append(stockItem);
		result.append(", estimatedUnitCost: ");
		result.append(estimatedUnitCost);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //TypeAssetImpl
