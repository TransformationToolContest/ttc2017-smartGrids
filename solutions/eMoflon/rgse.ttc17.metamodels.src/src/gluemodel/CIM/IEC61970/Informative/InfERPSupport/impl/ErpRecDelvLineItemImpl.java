/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem;

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
 * An implementation of the model object '<em><b>Erp Rec Delv Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl#getErpPOLineItem <em>Erp PO Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl#getErpReceiveDelivery <em>Erp Receive Delivery</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecDelvLineItemImpl#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpRecDelvLineItemImpl extends IdentifiedObjectImpl implements ErpRecDelvLineItem {
	/**
	 * The cached value of the '{@link #getErpPOLineItem() <em>Erp PO Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPOLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpPOLineItem erpPOLineItem;

	/**
	 * The cached value of the '{@link #getErpInvoiceLineItem() <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceLineItem erpInvoiceLineItem;

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
	 * The cached value of the '{@link #getErpReceiveDelivery() <em>Erp Receive Delivery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReceiveDelivery()
	 * @generated
	 * @ordered
	 */
	protected ErpReceiveDelivery erpReceiveDelivery;

	/**
	 * The cached value of the '{@link #getMaterialItems() <em>Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialItem> materialItems;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpRecDelvLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_REC_DELV_LINE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPOLineItem getErpPOLineItem() {
		if (erpPOLineItem != null && erpPOLineItem.eIsProxy()) {
			InternalEObject oldErpPOLineItem = (InternalEObject)erpPOLineItem;
			erpPOLineItem = (ErpPOLineItem)eResolveProxy(oldErpPOLineItem);
			if (erpPOLineItem != oldErpPOLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM, oldErpPOLineItem, erpPOLineItem));
			}
		}
		return erpPOLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPOLineItem basicGetErpPOLineItem() {
		return erpPOLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPOLineItem(ErpPOLineItem newErpPOLineItem, NotificationChain msgs) {
		ErpPOLineItem oldErpPOLineItem = erpPOLineItem;
		erpPOLineItem = newErpPOLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM, oldErpPOLineItem, newErpPOLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpPOLineItem(ErpPOLineItem newErpPOLineItem) {
		if (newErpPOLineItem != erpPOLineItem) {
			NotificationChain msgs = null;
			if (erpPOLineItem != null)
				msgs = ((InternalEObject)erpPOLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, ErpPOLineItem.class, msgs);
			if (newErpPOLineItem != null)
				msgs = ((InternalEObject)newErpPOLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, ErpPOLineItem.class, msgs);
			msgs = basicSetErpPOLineItem(newErpPOLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM, newErpPOLineItem, newErpPOLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem getErpInvoiceLineItem() {
		if (erpInvoiceLineItem != null && erpInvoiceLineItem.eIsProxy()) {
			InternalEObject oldErpInvoiceLineItem = (InternalEObject)erpInvoiceLineItem;
			erpInvoiceLineItem = (ErpInvoiceLineItem)eResolveProxy(oldErpInvoiceLineItem);
			if (erpInvoiceLineItem != oldErpInvoiceLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, oldErpInvoiceLineItem, erpInvoiceLineItem));
			}
		}
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem basicGetErpInvoiceLineItem() {
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpInvoiceLineItem(ErpInvoiceLineItem newErpInvoiceLineItem, NotificationChain msgs) {
		ErpInvoiceLineItem oldErpInvoiceLineItem = erpInvoiceLineItem;
		erpInvoiceLineItem = newErpInvoiceLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, oldErpInvoiceLineItem, newErpInvoiceLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpInvoiceLineItem(ErpInvoiceLineItem newErpInvoiceLineItem) {
		if (newErpInvoiceLineItem != erpInvoiceLineItem) {
			NotificationChain msgs = null;
			if (erpInvoiceLineItem != null)
				msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			if (newErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetErpInvoiceLineItem(newErpInvoiceLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, newErpInvoiceLineItem, newErpInvoiceLineItem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceiveDelivery getErpReceiveDelivery() {
		if (erpReceiveDelivery != null && erpReceiveDelivery.eIsProxy()) {
			InternalEObject oldErpReceiveDelivery = (InternalEObject)erpReceiveDelivery;
			erpReceiveDelivery = (ErpReceiveDelivery)eResolveProxy(oldErpReceiveDelivery);
			if (erpReceiveDelivery != oldErpReceiveDelivery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY, oldErpReceiveDelivery, erpReceiveDelivery));
			}
		}
		return erpReceiveDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceiveDelivery basicGetErpReceiveDelivery() {
		return erpReceiveDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpReceiveDelivery(ErpReceiveDelivery newErpReceiveDelivery, NotificationChain msgs) {
		ErpReceiveDelivery oldErpReceiveDelivery = erpReceiveDelivery;
		erpReceiveDelivery = newErpReceiveDelivery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY, oldErpReceiveDelivery, newErpReceiveDelivery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpReceiveDelivery(ErpReceiveDelivery newErpReceiveDelivery) {
		if (newErpReceiveDelivery != erpReceiveDelivery) {
			NotificationChain msgs = null;
			if (erpReceiveDelivery != null)
				msgs = ((InternalEObject)erpReceiveDelivery).eInverseRemove(this, InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS, ErpReceiveDelivery.class, msgs);
			if (newErpReceiveDelivery != null)
				msgs = ((InternalEObject)newErpReceiveDelivery).eInverseAdd(this, InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS, ErpReceiveDelivery.class, msgs);
			msgs = basicSetErpReceiveDelivery(newErpReceiveDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY, newErpReceiveDelivery, newErpReceiveDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new EObjectWithInverseResolvingEList.ManyInverse<MaterialItem>(MaterialItem.class, this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS, InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS);
		}
		return materialItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectWithInverseResolvingEList.ManyInverse<Asset>(Asset.class, this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS, AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS);
		}
		return assets;
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				if (erpPOLineItem != null)
					msgs = ((InternalEObject)erpPOLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, ErpPOLineItem.class, msgs);
				return basicSetErpPOLineItem((ErpPOLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (erpInvoiceLineItem != null)
					msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
				return basicSetErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				if (erpReceiveDelivery != null)
					msgs = ((InternalEObject)erpReceiveDelivery).eInverseRemove(this, InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS, ErpReceiveDelivery.class, msgs);
				return basicSetErpReceiveDelivery((ErpReceiveDelivery)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				return basicSetErpPOLineItem(null, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return basicSetErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				return basicSetErpReceiveDelivery(null, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				if (resolve) return getErpPOLineItem();
				return basicGetErpPOLineItem();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (resolve) return getErpInvoiceLineItem();
				return basicGetErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				if (resolve) return getErpReceiveDelivery();
				return basicGetErpReceiveDelivery();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				return getAssets();
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				setErpPOLineItem((ErpPOLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				setErpReceiveDelivery((ErpReceiveDelivery)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				setErpPOLineItem((ErpPOLineItem)null);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				setErpReceiveDelivery((ErpReceiveDelivery)null);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				getAssets().clear();
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				return erpPOLineItem != null;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return erpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				return erpReceiveDelivery != null;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				return assets != null && !assets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpRecDelvLineItemImpl
