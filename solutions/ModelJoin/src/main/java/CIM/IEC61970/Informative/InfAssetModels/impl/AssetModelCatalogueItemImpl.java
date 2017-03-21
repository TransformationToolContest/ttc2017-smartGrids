/**
 */
package CIM.IEC61970.Informative.InfAssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModel;
import CIM.IEC61968.AssetModels.AssetModelsPackage;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue;
import CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;
import CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * An implementation of the model object '<em><b>Asset Model Catalogue Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl#getErpQuoteLineItems <em>Erp Quote Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl#getAssetModelCatalogue <em>Asset Model Catalogue</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueItemImpl#getAssetModel <em>Asset Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetModelCatalogueItemImpl extends DocumentImpl implements AssetModelCatalogueItem {
	/**
	 * The cached value of the '{@link #getErpQuoteLineItems() <em>Erp Quote Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpQuoteLineItem> erpQuoteLineItems;

	/**
	 * The default value of the '{@link #getUnitCost() <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCost()
	 * @generated
	 * @ordered
	 */
	protected static final float UNIT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnitCost() <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCost()
	 * @generated
	 * @ordered
	 */
	protected float unitCost = UNIT_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetModelCatalogue() <em>Asset Model Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModelCatalogue()
	 * @generated
	 * @ordered
	 */
	protected AssetModelCatalogue assetModelCatalogue;

	/**
	 * The cached value of the '{@link #getErpPOLineItems() <em>Erp PO Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPOLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPOLineItem> erpPOLineItems;

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
	protected AssetModelCatalogueItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetModelsPackage.Literals.ASSET_MODEL_CATALOGUE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpQuoteLineItem> getErpQuoteLineItems() {
		if (erpQuoteLineItems == null) {
			erpQuoteLineItems = new EObjectWithInverseResolvingEList<ErpQuoteLineItem>(ErpQuoteLineItem.class, this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM);
		}
		return erpQuoteLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUnitCost() {
		return unitCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitCost(float newUnitCost) {
		float oldUnitCost = unitCost;
		unitCost = newUnitCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST, oldUnitCost, unitCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogue getAssetModelCatalogue() {
		if (assetModelCatalogue != null && assetModelCatalogue.eIsProxy()) {
			InternalEObject oldAssetModelCatalogue = (InternalEObject)assetModelCatalogue;
			assetModelCatalogue = (AssetModelCatalogue)eResolveProxy(oldAssetModelCatalogue);
			if (assetModelCatalogue != oldAssetModelCatalogue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE, oldAssetModelCatalogue, assetModelCatalogue));
			}
		}
		return assetModelCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogue basicGetAssetModelCatalogue() {
		return assetModelCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetModelCatalogue(AssetModelCatalogue newAssetModelCatalogue, NotificationChain msgs) {
		AssetModelCatalogue oldAssetModelCatalogue = assetModelCatalogue;
		assetModelCatalogue = newAssetModelCatalogue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE, oldAssetModelCatalogue, newAssetModelCatalogue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetModelCatalogue(AssetModelCatalogue newAssetModelCatalogue) {
		if (newAssetModelCatalogue != assetModelCatalogue) {
			NotificationChain msgs = null;
			if (assetModelCatalogue != null)
				msgs = ((InternalEObject)assetModelCatalogue).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS, AssetModelCatalogue.class, msgs);
			if (newAssetModelCatalogue != null)
				msgs = ((InternalEObject)newAssetModelCatalogue).eInverseAdd(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS, AssetModelCatalogue.class, msgs);
			msgs = basicSetAssetModelCatalogue(newAssetModelCatalogue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE, newAssetModelCatalogue, newAssetModelCatalogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPOLineItem> getErpPOLineItems() {
		if (erpPOLineItems == null) {
			erpPOLineItems = new EObjectWithInverseResolvingEList<ErpPOLineItem>(ErpPOLineItem.class, this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS, InfERPSupportPackage.ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM);
		}
		return erpPOLineItems;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL, oldAssetModel, assetModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL, oldAssetModel, newAssetModel);
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
				msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS, AssetModel.class, msgs);
			if (newAssetModel != null)
				msgs = ((InternalEObject)newAssetModel).eInverseAdd(this, AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS, AssetModel.class, msgs);
			msgs = basicSetAssetModel(newAssetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL, newAssetModel, newAssetModel));
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpQuoteLineItems()).basicAdd(otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				if (assetModelCatalogue != null)
					msgs = ((InternalEObject)assetModelCatalogue).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS, AssetModelCatalogue.class, msgs);
				return basicSetAssetModelCatalogue((AssetModelCatalogue)otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPOLineItems()).basicAdd(otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
				if (assetModel != null)
					msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetModelsPackage.ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS, AssetModel.class, msgs);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				return ((InternalEList<?>)getErpQuoteLineItems()).basicRemove(otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				return basicSetAssetModelCatalogue(null, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				return ((InternalEList<?>)getErpPOLineItems()).basicRemove(otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				return getErpQuoteLineItems();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST:
				return getUnitCost();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				if (resolve) return getAssetModelCatalogue();
				return basicGetAssetModelCatalogue();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				return getErpPOLineItems();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				getErpQuoteLineItems().clear();
				getErpQuoteLineItems().addAll((Collection<? extends ErpQuoteLineItem>)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST:
				setUnitCost((Float)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				setAssetModelCatalogue((AssetModelCatalogue)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				getErpPOLineItems().addAll((Collection<? extends ErpPOLineItem>)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				getErpQuoteLineItems().clear();
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST:
				setUnitCost(UNIT_COST_EDEFAULT);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				setAssetModelCatalogue((AssetModelCatalogue)null);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				return erpQuoteLineItems != null && !erpQuoteLineItems.isEmpty();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST:
				return unitCost != UNIT_COST_EDEFAULT;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				return assetModelCatalogue != null;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				return erpPOLineItems != null && !erpPOLineItems.isEmpty();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
				return assetModel != null;
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
		result.append(" (unitCost: ");
		result.append(unitCost);
		result.append(')');
		return result.toString();
	}

} //AssetModelCatalogueItemImpl
