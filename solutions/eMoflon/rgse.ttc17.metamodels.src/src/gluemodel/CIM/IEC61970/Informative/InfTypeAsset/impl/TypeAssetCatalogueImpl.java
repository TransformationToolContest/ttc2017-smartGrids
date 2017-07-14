/**
 */
package gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;
import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAsset;
import gluemodel.CIM.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue;

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
 * An implementation of the model object '<em><b>Type Asset Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetCatalogueImpl#getTypeAssets <em>Type Assets</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfTypeAsset.impl.TypeAssetCatalogueImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeAssetCatalogueImpl extends IdentifiedObjectImpl implements TypeAssetCatalogue {
	/**
	 * The cached value of the '{@link #getTypeAssets() <em>Type Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAsset> typeAssets;

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
	protected TypeAssetCatalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfTypeAssetPackage.Literals.TYPE_ASSET_CATALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAsset> getTypeAssets() {
		if (typeAssets == null) {
			typeAssets = new EObjectWithInverseResolvingEList<TypeAsset>(TypeAsset.class, this, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS, InfTypeAssetPackage.TYPE_ASSET__TYPE_ASSET_CATALOGUE);
		}
		return typeAssets;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS, oldStatus, status));
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeAssets()).basicAdd(otherEnd, msgs);
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				return ((InternalEList<?>)getTypeAssets()).basicRemove(otherEnd, msgs);
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				return getTypeAssets();
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				getTypeAssets().clear();
				getTypeAssets().addAll((Collection<? extends TypeAsset>)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				getTypeAssets().clear();
				return;
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				return typeAssets != null && !typeAssets.isEmpty();
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAssetCatalogueImpl
