/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;
import CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpQuote;
import CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpReqLineItem;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.Design;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.Request;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Quote Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl#getErpReqLineItem <em>Erp Req Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl#getErpQuote <em>Erp Quote</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpQuoteLineItemImpl#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpQuoteLineItemImpl extends IdentifiedObjectImpl implements ErpQuoteLineItem {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Request request;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected Design design;

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
	 * The cached value of the '{@link #getErpReqLineItem() <em>Erp Req Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReqLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpReqLineItem erpReqLineItem;

	/**
	 * The cached value of the '{@link #getErpQuote() <em>Erp Quote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuote()
	 * @generated
	 * @ordered
	 */
	protected ErpQuote erpQuote;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpQuoteLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_QUOTE_LINE_ITEM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Request)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
		Request oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Request newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, Request.class, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, Request.class, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design getDesign() {
		if (design != null && design.eIsProxy()) {
			InternalEObject oldDesign = (InternalEObject)design;
			design = (Design)eResolveProxy(oldDesign);
			if (design != oldDesign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, oldDesign, design));
			}
		}
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design basicGetDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(Design newDesign, NotificationChain msgs) {
		Design oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(Design newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, Design.class, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, Design.class, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, newDesign, newDesign));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, oldErpInvoiceLineItem, erpInvoiceLineItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, oldErpInvoiceLineItem, newErpInvoiceLineItem);
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
				msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			if (newErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetErpInvoiceLineItem(newErpInvoiceLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, newErpInvoiceLineItem, newErpInvoiceLineItem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, oldErpReqLineItem, erpReqLineItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, oldErpReqLineItem, newErpReqLineItem);
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
				msgs = ((InternalEObject)erpReqLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpReqLineItem.class, msgs);
			if (newErpReqLineItem != null)
				msgs = ((InternalEObject)newErpReqLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpReqLineItem.class, msgs);
			msgs = basicSetErpReqLineItem(newErpReqLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, newErpReqLineItem, newErpReqLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuote getErpQuote() {
		if (erpQuote != null && erpQuote.eIsProxy()) {
			InternalEObject oldErpQuote = (InternalEObject)erpQuote;
			erpQuote = (ErpQuote)eResolveProxy(oldErpQuote);
			if (erpQuote != oldErpQuote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE, oldErpQuote, erpQuote));
			}
		}
		return erpQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuote basicGetErpQuote() {
		return erpQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpQuote(ErpQuote newErpQuote, NotificationChain msgs) {
		ErpQuote oldErpQuote = erpQuote;
		erpQuote = newErpQuote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE, oldErpQuote, newErpQuote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpQuote(ErpQuote newErpQuote) {
		if (newErpQuote != erpQuote) {
			NotificationChain msgs = null;
			if (erpQuote != null)
				msgs = ((InternalEObject)erpQuote).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS, ErpQuote.class, msgs);
			if (newErpQuote != null)
				msgs = ((InternalEObject)newErpQuote).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS, ErpQuote.class, msgs);
			msgs = basicSetErpQuote(newErpQuote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE, newErpQuote, newErpQuote));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM, oldAssetModelCatalogueItem, assetModelCatalogueItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM, oldAssetModelCatalogueItem, newAssetModelCatalogueItem);
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
				msgs = ((InternalEObject)assetModelCatalogueItem).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
			if (newAssetModelCatalogueItem != null)
				msgs = ((InternalEObject)newAssetModelCatalogueItem).eInverseAdd(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
			msgs = basicSetAssetModelCatalogueItem(newAssetModelCatalogueItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM, newAssetModelCatalogueItem, newAssetModelCatalogueItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				if (request != null)
					msgs = ((InternalEObject)request).eInverseRemove(this, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, Request.class, msgs);
				return basicSetRequest((Request)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				if (design != null)
					msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, Design.class, msgs);
				return basicSetDesign((Design)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (erpInvoiceLineItem != null)
					msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
				return basicSetErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				if (erpReqLineItem != null)
					msgs = ((InternalEObject)erpReqLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpReqLineItem.class, msgs);
				return basicSetErpReqLineItem((ErpReqLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				if (erpQuote != null)
					msgs = ((InternalEObject)erpQuote).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS, ErpQuote.class, msgs);
				return basicSetErpQuote((ErpQuote)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				if (assetModelCatalogueItem != null)
					msgs = ((InternalEObject)assetModelCatalogueItem).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
				return basicSetAssetModelCatalogueItem((AssetModelCatalogueItem)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				return basicSetRequest(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				return basicSetDesign(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return basicSetErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				return basicSetErpReqLineItem(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				return basicSetErpQuote(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				return basicSetAssetModelCatalogueItem(null, msgs);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				if (resolve) return getDesign();
				return basicGetDesign();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (resolve) return getErpInvoiceLineItem();
				return basicGetErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				if (resolve) return getErpReqLineItem();
				return basicGetErpReqLineItem();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				if (resolve) return getErpQuote();
				return basicGetErpQuote();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				if (resolve) return getAssetModelCatalogueItem();
				return basicGetAssetModelCatalogueItem();
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				setRequest((Request)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				setDesign((Design)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				setErpReqLineItem((ErpReqLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				setErpQuote((ErpQuote)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				setAssetModelCatalogueItem((AssetModelCatalogueItem)newValue);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				setRequest((Request)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				setDesign((Design)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				setErpReqLineItem((ErpReqLineItem)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				setErpQuote((ErpQuote)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				setAssetModelCatalogueItem((AssetModelCatalogueItem)null);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				return request != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				return design != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return erpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				return erpReqLineItem != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				return erpQuote != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				return assetModelCatalogueItem != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpQuoteLineItemImpl
