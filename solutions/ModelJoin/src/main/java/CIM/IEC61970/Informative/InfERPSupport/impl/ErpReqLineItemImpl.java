/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpRequisition;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;
import CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.TypeMaterial;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Req Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getErpRequisition <em>Erp Requisition</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpReqLineItemImpl#getErpPOLineItem <em>Erp PO Line Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpReqLineItemImpl extends IdentifiedObjectImpl implements ErpReqLineItem {
	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected String deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeMaterial() <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMaterial()
	 * @generated
	 * @ordered
	 */
	protected TypeMaterial typeMaterial;

	/**
	 * The cached value of the '{@link #getErpQuoteLineItem() <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpQuoteLineItem erpQuoteLineItem;

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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpRequisition() <em>Erp Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRequisition()
	 * @generated
	 * @ordered
	 */
	protected ErpRequisition erpRequisition;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

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
	 * The cached value of the '{@link #getErpPOLineItem() <em>Erp PO Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPOLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpPOLineItem erpPOLineItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpReqLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_REQ_LINE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(String newDeliveryDate) {
		String oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial getTypeMaterial() {
		if (typeMaterial != null && typeMaterial.eIsProxy()) {
			InternalEObject oldTypeMaterial = (InternalEObject)typeMaterial;
			typeMaterial = (TypeMaterial)eResolveProxy(oldTypeMaterial);
			if (typeMaterial != oldTypeMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL, oldTypeMaterial, typeMaterial));
			}
		}
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial basicGetTypeMaterial() {
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMaterial(TypeMaterial newTypeMaterial, NotificationChain msgs) {
		TypeMaterial oldTypeMaterial = typeMaterial;
		typeMaterial = newTypeMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL, oldTypeMaterial, newTypeMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMaterial(TypeMaterial newTypeMaterial) {
		if (newTypeMaterial != typeMaterial) {
			NotificationChain msgs = null;
			if (typeMaterial != null)
				msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS, TypeMaterial.class, msgs);
			if (newTypeMaterial != null)
				msgs = ((InternalEObject)newTypeMaterial).eInverseAdd(this, InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS, TypeMaterial.class, msgs);
			msgs = basicSetTypeMaterial(newTypeMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL, newTypeMaterial, newTypeMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem getErpQuoteLineItem() {
		if (erpQuoteLineItem != null && erpQuoteLineItem.eIsProxy()) {
			InternalEObject oldErpQuoteLineItem = (InternalEObject)erpQuoteLineItem;
			erpQuoteLineItem = (ErpQuoteLineItem)eResolveProxy(oldErpQuoteLineItem);
			if (erpQuoteLineItem != oldErpQuoteLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, oldErpQuoteLineItem, erpQuoteLineItem));
			}
		}
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem basicGetErpQuoteLineItem() {
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem, NotificationChain msgs) {
		ErpQuoteLineItem oldErpQuoteLineItem = erpQuoteLineItem;
		erpQuoteLineItem = newErpQuoteLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, oldErpQuoteLineItem, newErpQuoteLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem) {
		if (newErpQuoteLineItem != erpQuoteLineItem) {
			NotificationChain msgs = null;
			if (erpQuoteLineItem != null)
				msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpQuoteLineItem.class, msgs);
			if (newErpQuoteLineItem != null)
				msgs = ((InternalEObject)newErpQuoteLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpQuoteLineItem.class, msgs);
			msgs = basicSetErpQuoteLineItem(newErpQuoteLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, newErpQuoteLineItem, newErpQuoteLineItem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRequisition getErpRequisition() {
		if (erpRequisition != null && erpRequisition.eIsProxy()) {
			InternalEObject oldErpRequisition = (InternalEObject)erpRequisition;
			erpRequisition = (ErpRequisition)eResolveProxy(oldErpRequisition);
			if (erpRequisition != oldErpRequisition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION, oldErpRequisition, erpRequisition));
			}
		}
		return erpRequisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRequisition basicGetErpRequisition() {
		return erpRequisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpRequisition(ErpRequisition newErpRequisition, NotificationChain msgs) {
		ErpRequisition oldErpRequisition = erpRequisition;
		erpRequisition = newErpRequisition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION, oldErpRequisition, newErpRequisition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpRequisition(ErpRequisition newErpRequisition) {
		if (newErpRequisition != erpRequisition) {
			NotificationChain msgs = null;
			if (erpRequisition != null)
				msgs = ((InternalEObject)erpRequisition).eInverseRemove(this, InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS, ErpRequisition.class, msgs);
			if (newErpRequisition != null)
				msgs = ((InternalEObject)newErpRequisition).eInverseAdd(this, InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS, ErpRequisition.class, msgs);
			msgs = basicSetErpRequisition(newErpRequisition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION, newErpRequisition, newErpRequisition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST, oldCost, cost));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET, oldTypeAsset, typeAsset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET, oldTypeAsset, newTypeAsset);
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
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS, TypeAsset.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS, TypeAsset.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET, newTypeAsset, newTypeAsset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM, oldErpPOLineItem, erpPOLineItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM, oldErpPOLineItem, newErpPOLineItem);
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
				msgs = ((InternalEObject)erpPOLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpPOLineItem.class, msgs);
			if (newErpPOLineItem != null)
				msgs = ((InternalEObject)newErpPOLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpPOLineItem.class, msgs);
			msgs = basicSetErpPOLineItem(newErpPOLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM, newErpPOLineItem, newErpPOLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				if (typeMaterial != null)
					msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS, TypeMaterial.class, msgs);
				return basicSetTypeMaterial((TypeMaterial)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				if (erpQuoteLineItem != null)
					msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpQuoteLineItem.class, msgs);
				return basicSetErpQuoteLineItem((ErpQuoteLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				if (erpRequisition != null)
					msgs = ((InternalEObject)erpRequisition).eInverseRemove(this, InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS, ErpRequisition.class, msgs);
				return basicSetErpRequisition((ErpRequisition)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET__ERP_REQ_LINE_ITEMS, TypeAsset.class, msgs);
				return basicSetTypeAsset((TypeAsset)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				if (erpPOLineItem != null)
					msgs = ((InternalEObject)erpPOLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpPOLineItem.class, msgs);
				return basicSetErpPOLineItem((ErpPOLineItem)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				return basicSetTypeMaterial(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				return basicSetErpQuoteLineItem(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				return basicSetErpRequisition(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				return basicSetErpPOLineItem(null, msgs);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE:
				return getDeliveryDate();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				if (resolve) return getTypeMaterial();
				return basicGetTypeMaterial();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				if (resolve) return getErpQuoteLineItem();
				return basicGetErpQuoteLineItem();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY:
				return getQuantity();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				if (resolve) return getErpRequisition();
				return basicGetErpRequisition();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE:
				return getCode();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST:
				return getCost();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				if (resolve) return getErpPOLineItem();
				return basicGetErpPOLineItem();
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE:
				setDeliveryDate((String)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				setErpRequisition((ErpRequisition)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE:
				setCode((String)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST:
				setCost((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				setTypeAsset((TypeAsset)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				setErpPOLineItem((ErpPOLineItem)newValue);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				setErpRequisition((ErpRequisition)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST:
				setCost(COST_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				setTypeAsset((TypeAsset)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				setErpPOLineItem((ErpPOLineItem)null);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				return typeMaterial != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				return erpQuoteLineItem != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				return erpRequisition != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST:
				return cost != COST_EDEFAULT;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				return typeAsset != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				return erpPOLineItem != null;
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
		result.append(" (deliveryDate: ");
		result.append(deliveryDate);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", code: ");
		result.append(code);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ErpReqLineItemImpl
