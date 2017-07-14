/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogue;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

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
 * An implementation of the model object '<em><b>Asset Model Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueImpl#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.impl.AssetModelCatalogueImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetModelCatalogueImpl extends IdentifiedObjectImpl implements AssetModelCatalogue {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetModelCatalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetModelsPackage.Literals.ASSET_MODEL_CATALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetModelCatalogueItem> getAssetModelCatalogueItems() {
		if (assetModelCatalogueItems == null) {
			assetModelCatalogueItems = new EObjectWithInverseResolvingEList<AssetModelCatalogueItem>(AssetModelCatalogueItem.class, this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE);
		}
		return assetModelCatalogueItems;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS, oldStatus, status));
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetModelCatalogueItems()).basicAdd(otherEnd, msgs);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				return ((InternalEList<?>)getAssetModelCatalogueItems()).basicRemove(otherEnd, msgs);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				return getAssetModelCatalogueItems();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				getAssetModelCatalogueItems().clear();
				getAssetModelCatalogueItems().addAll((Collection<? extends AssetModelCatalogueItem>)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				setStatus((Status)newValue);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				getAssetModelCatalogueItems().clear();
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				setStatus((Status)null);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				return assetModelCatalogueItems != null && !assetModelCatalogueItems.isEmpty();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //AssetModelCatalogueImpl
