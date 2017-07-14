/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp PO Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl#getErpPurchaseOrder <em>Erp Purchase Order</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl#getMaterialItem <em>Material Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl#getErpReqLineItem <em>Erp Req Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpPOLineItemImpl#getErpRecDelLineItem <em>Erp Rec Del Line Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpPOLineItemImpl extends DocumentImpl implements ErpPOLineItem {
	/**
	 * The cached value of the '{@link #getErpPurchaseOrder() <em>Erp Purchase Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPurchaseOrder()
	 * @generated
	 * @ordered
	 */
	protected ErpPurchaseOrder erpPurchaseOrder;

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
	 * The cached value of the '{@link #getErpReqLineItem() <em>Erp Req Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReqLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpReqLineItem erpReqLineItem;

	/**
	 * The cached value of the '{@link #getAssetModelCatalogueItem() <em>Asset Model Catalogue Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 * @ordered
	 */
	protected AssetModelCatalogueItem assetModelCatalogueItem;

	/**
	 * The cached value of the '{@link #getErpRecDelLineItem() <em>Erp Rec Del Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecDelLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpRecDelvLineItem erpRecDelLineItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPOLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PO_LINE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPurchaseOrder getErpPurchaseOrder() {
		if (erpPurchaseOrder != null && erpPurchaseOrder.eIsProxy()) {
			InternalEObject oldErpPurchaseOrder = (InternalEObject)erpPurchaseOrder;
			erpPurchaseOrder = (ErpPurchaseOrder)eResolveProxy(oldErpPurchaseOrder);
			if (erpPurchaseOrder != oldErpPurchaseOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER, oldErpPurchaseOrder, erpPurchaseOrder));
			}
		}
		return erpPurchaseOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPurchaseOrder basicGetErpPurchaseOrder() {
		return erpPurchaseOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPurchaseOrder(ErpPurchaseOrder newErpPurchaseOrder, NotificationChain msgs) {
		ErpPurchaseOrder oldErpPurchaseOrder = erpPurchaseOrder;
		erpPurchaseOrder = newErpPurchaseOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER, oldErpPurchaseOrder, newErpPurchaseOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpPurchaseOrder(ErpPurchaseOrder newErpPurchaseOrder) {
		if (newErpPurchaseOrder != erpPurchaseOrder) {
			NotificationChain msgs = null;
			if (erpPurchaseOrder != null)
				msgs = ((InternalEObject)erpPurchaseOrder).eInverseRemove(this, InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS, ErpPurchaseOrder.class, msgs);
			if (newErpPurchaseOrder != null)
				msgs = ((InternalEObject)newErpPurchaseOrder).eInverseAdd(this, InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS, ErpPurchaseOrder.class, msgs);
			msgs = basicSetErpPurchaseOrder(newErpPurchaseOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER, newErpPurchaseOrder, newErpPurchaseOrder));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM, oldMaterialItem, materialItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM, oldMaterialItem, newMaterialItem);
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
				msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS, MaterialItem.class, msgs);
			if (newMaterialItem != null)
				msgs = ((InternalEObject)newMaterialItem).eInverseAdd(this, InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS, MaterialItem.class, msgs);
			msgs = basicSetMaterialItem(newMaterialItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM, newMaterialItem, newMaterialItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReqLineItem getErpReqLineItem() {
		if (erpReqLineItem != null && erpReqLineItem.eIsProxy()) {
			InternalEObject oldErpReqLineItem = (InternalEObject)erpReqLineItem;
			erpReqLineItem = (ErpReqLineItem)eResolveProxy(oldErpReqLineItem);
			if (erpReqLineItem != oldErpReqLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, oldErpReqLineItem, erpReqLineItem));
			}
		}
		return erpReqLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReqLineItem basicGetErpReqLineItem() {
		return erpReqLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpReqLineItem(ErpReqLineItem newErpReqLineItem, NotificationChain msgs) {
		ErpReqLineItem oldErpReqLineItem = erpReqLineItem;
		erpReqLineItem = newErpReqLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, oldErpReqLineItem, newErpReqLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpReqLineItem(ErpReqLineItem newErpReqLineItem) {
		if (newErpReqLineItem != erpReqLineItem) {
			NotificationChain msgs = null;
			if (erpReqLineItem != null)
				msgs = ((InternalEObject)erpReqLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM, ErpReqLineItem.class, msgs);
			if (newErpReqLineItem != null)
				msgs = ((InternalEObject)newErpReqLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM, ErpReqLineItem.class, msgs);
			msgs = basicSetErpReqLineItem(newErpReqLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, newErpReqLineItem, newErpReqLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogueItem getAssetModelCatalogueItem() {
		if (assetModelCatalogueItem != null && assetModelCatalogueItem.eIsProxy()) {
			InternalEObject oldAssetModelCatalogueItem = (InternalEObject)assetModelCatalogueItem;
			assetModelCatalogueItem = (AssetModelCatalogueItem)eResolveProxy(oldAssetModelCatalogueItem);
			if (assetModelCatalogueItem != oldAssetModelCatalogueItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM, oldAssetModelCatalogueItem, assetModelCatalogueItem));
			}
		}
		return assetModelCatalogueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogueItem basicGetAssetModelCatalogueItem() {
		return assetModelCatalogueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetModelCatalogueItem(AssetModelCatalogueItem newAssetModelCatalogueItem, NotificationChain msgs) {
		AssetModelCatalogueItem oldAssetModelCatalogueItem = assetModelCatalogueItem;
		assetModelCatalogueItem = newAssetModelCatalogueItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM, oldAssetModelCatalogueItem, newAssetModelCatalogueItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetModelCatalogueItem(AssetModelCatalogueItem newAssetModelCatalogueItem) {
		if (newAssetModelCatalogueItem != assetModelCatalogueItem) {
			NotificationChain msgs = null;
			if (assetModelCatalogueItem != null)
				msgs = ((InternalEObject)assetModelCatalogueItem).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
			if (newAssetModelCatalogueItem != null)
				msgs = ((InternalEObject)newAssetModelCatalogueItem).eInverseAdd(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
			msgs = basicSetAssetModelCatalogueItem(newAssetModelCatalogueItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM, newAssetModelCatalogueItem, newAssetModelCatalogueItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecDelvLineItem getErpRecDelLineItem() {
		if (erpRecDelLineItem != null && erpRecDelLineItem.eIsProxy()) {
			InternalEObject oldErpRecDelLineItem = (InternalEObject)erpRecDelLineItem;
			erpRecDelLineItem = (ErpRecDelvLineItem)eResolveProxy(oldErpRecDelLineItem);
			if (erpRecDelLineItem != oldErpRecDelLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, oldErpRecDelLineItem, erpRecDelLineItem));
			}
		}
		return erpRecDelLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecDelvLineItem basicGetErpRecDelLineItem() {
		return erpRecDelLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpRecDelLineItem(ErpRecDelvLineItem newErpRecDelLineItem, NotificationChain msgs) {
		ErpRecDelvLineItem oldErpRecDelLineItem = erpRecDelLineItem;
		erpRecDelLineItem = newErpRecDelLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, oldErpRecDelLineItem, newErpRecDelLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpRecDelLineItem(ErpRecDelvLineItem newErpRecDelLineItem) {
		if (newErpRecDelLineItem != erpRecDelLineItem) {
			NotificationChain msgs = null;
			if (erpRecDelLineItem != null)
				msgs = ((InternalEObject)erpRecDelLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
			if (newErpRecDelLineItem != null)
				msgs = ((InternalEObject)newErpRecDelLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
			msgs = basicSetErpRecDelLineItem(newErpRecDelLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, newErpRecDelLineItem, newErpRecDelLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER:
				if (erpPurchaseOrder != null)
					msgs = ((InternalEObject)erpPurchaseOrder).eInverseRemove(this, InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS, ErpPurchaseOrder.class, msgs);
				return basicSetErpPurchaseOrder((ErpPurchaseOrder)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM:
				if (materialItem != null)
					msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS, MaterialItem.class, msgs);
				return basicSetMaterialItem((MaterialItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM:
				if (erpReqLineItem != null)
					msgs = ((InternalEObject)erpReqLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM, ErpReqLineItem.class, msgs);
				return basicSetErpReqLineItem((ErpReqLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				if (assetModelCatalogueItem != null)
					msgs = ((InternalEObject)assetModelCatalogueItem).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
				return basicSetAssetModelCatalogueItem((AssetModelCatalogueItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM:
				if (erpRecDelLineItem != null)
					msgs = ((InternalEObject)erpRecDelLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
				return basicSetErpRecDelLineItem((ErpRecDelvLineItem)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER:
				return basicSetErpPurchaseOrder(null, msgs);
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM:
				return basicSetMaterialItem(null, msgs);
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM:
				return basicSetErpReqLineItem(null, msgs);
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				return basicSetAssetModelCatalogueItem(null, msgs);
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM:
				return basicSetErpRecDelLineItem(null, msgs);
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
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER:
				if (resolve) return getErpPurchaseOrder();
				return basicGetErpPurchaseOrder();
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM:
				if (resolve) return getMaterialItem();
				return basicGetMaterialItem();
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM:
				if (resolve) return getErpReqLineItem();
				return basicGetErpReqLineItem();
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				if (resolve) return getAssetModelCatalogueItem();
				return basicGetAssetModelCatalogueItem();
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM:
				if (resolve) return getErpRecDelLineItem();
				return basicGetErpRecDelLineItem();
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
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER:
				setErpPurchaseOrder((ErpPurchaseOrder)newValue);
				return;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)newValue);
				return;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM:
				setErpReqLineItem((ErpReqLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				setAssetModelCatalogueItem((AssetModelCatalogueItem)newValue);
				return;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM:
				setErpRecDelLineItem((ErpRecDelvLineItem)newValue);
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
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER:
				setErpPurchaseOrder((ErpPurchaseOrder)null);
				return;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)null);
				return;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM:
				setErpReqLineItem((ErpReqLineItem)null);
				return;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				setAssetModelCatalogueItem((AssetModelCatalogueItem)null);
				return;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM:
				setErpRecDelLineItem((ErpRecDelvLineItem)null);
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
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER:
				return erpPurchaseOrder != null;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM:
				return materialItem != null;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM:
				return erpReqLineItem != null;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				return assetModelCatalogueItem != null;
			case InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM:
				return erpRecDelLineItem != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpPOLineItemImpl
