/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61968.Assets.Asset;
import CIM.IEC61968.Assets.AssetsPackage;

import CIM.IEC61970.Informative.InfAssets.AssetAssetRole;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Asset Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.AssetAssetRoleImpl#getToAsset <em>To Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.AssetAssetRoleImpl#getFromAsset <em>From Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetAssetRoleImpl extends RoleImpl implements AssetAssetRole {
	/**
	 * The cached value of the '{@link #getToAsset() <em>To Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset toAsset;

	/**
	 * The cached value of the '{@link #getFromAsset() <em>From Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset fromAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetAssetRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getAssetAssetRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getToAsset() {
		if (toAsset != null && toAsset.eIsProxy()) {
			InternalEObject oldToAsset = (InternalEObject)toAsset;
			toAsset = (Asset)eResolveProxy(oldToAsset);
			if (toAsset != oldToAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET, oldToAsset, toAsset));
			}
		}
		return toAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetToAsset() {
		return toAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToAsset(Asset newToAsset, NotificationChain msgs) {
		Asset oldToAsset = toAsset;
		toAsset = newToAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET, oldToAsset, newToAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAsset(Asset newToAsset) {
		if (newToAsset != toAsset) {
			NotificationChain msgs = null;
			if (toAsset != null)
				msgs = ((InternalEObject)toAsset).eInverseRemove(this, AssetsPackage.ASSET__FROM_ASSET_ROLES, Asset.class, msgs);
			if (newToAsset != null)
				msgs = ((InternalEObject)newToAsset).eInverseAdd(this, AssetsPackage.ASSET__FROM_ASSET_ROLES, Asset.class, msgs);
			msgs = basicSetToAsset(newToAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET, newToAsset, newToAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getFromAsset() {
		if (fromAsset != null && fromAsset.eIsProxy()) {
			InternalEObject oldFromAsset = (InternalEObject)fromAsset;
			fromAsset = (Asset)eResolveProxy(oldFromAsset);
			if (fromAsset != oldFromAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET, oldFromAsset, fromAsset));
			}
		}
		return fromAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetFromAsset() {
		return fromAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromAsset(Asset newFromAsset, NotificationChain msgs) {
		Asset oldFromAsset = fromAsset;
		fromAsset = newFromAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET, oldFromAsset, newFromAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromAsset(Asset newFromAsset) {
		if (newFromAsset != fromAsset) {
			NotificationChain msgs = null;
			if (fromAsset != null)
				msgs = ((InternalEObject)fromAsset).eInverseRemove(this, AssetsPackage.ASSET__TO_ASSET_ROLES, Asset.class, msgs);
			if (newFromAsset != null)
				msgs = ((InternalEObject)newFromAsset).eInverseAdd(this, AssetsPackage.ASSET__TO_ASSET_ROLES, Asset.class, msgs);
			msgs = basicSetFromAsset(newFromAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET, newFromAsset, newFromAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				if (toAsset != null)
					msgs = ((InternalEObject)toAsset).eInverseRemove(this, AssetsPackage.ASSET__FROM_ASSET_ROLES, Asset.class, msgs);
				return basicSetToAsset((Asset)otherEnd, msgs);
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				if (fromAsset != null)
					msgs = ((InternalEObject)fromAsset).eInverseRemove(this, AssetsPackage.ASSET__TO_ASSET_ROLES, Asset.class, msgs);
				return basicSetFromAsset((Asset)otherEnd, msgs);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				return basicSetToAsset(null, msgs);
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				return basicSetFromAsset(null, msgs);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				if (resolve) return getToAsset();
				return basicGetToAsset();
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				if (resolve) return getFromAsset();
				return basicGetFromAsset();
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				setToAsset((Asset)newValue);
				return;
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				setFromAsset((Asset)newValue);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				setToAsset((Asset)null);
				return;
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				setFromAsset((Asset)null);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				return toAsset != null;
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				return fromAsset != null;
		}
		return super.eIsSet(featureID);
	}

} //AssetAssetRoleImpl
