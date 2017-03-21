/**
 */
package CIM.IEC61968.Assets.impl;

import CIM.IEC61968.Assets.Asset;
import CIM.IEC61968.Assets.AssetContainer;
import CIM.IEC61968.Assets.AssetsPackage;
import CIM.IEC61968.Assets.Seal;

import CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import CIM.IEC61970.Informative.InfLocations.LandProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetContainerImpl#getLandProperties <em>Land Properties</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetContainerImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.Assets.impl.AssetContainerImpl#getSeals <em>Seals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetContainerImpl extends AssetImpl implements AssetContainer {
	/**
	 * The cached value of the '{@link #getLandProperties() <em>Land Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<LandProperty> landProperties;

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
	 * The cached value of the '{@link #getSeals() <em>Seals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeals()
	 * @generated
	 * @ordered
	 */
	protected EList<Seal> seals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.ASSET_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LandProperty> getLandProperties() {
		if (landProperties == null) {
			landProperties = new EObjectWithInverseResolvingEList.ManyInverse<LandProperty>(LandProperty.class, this, AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES, InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS);
		}
		return landProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectWithInverseResolvingEList<Asset>(Asset.class, this, AssetsPackage.ASSET_CONTAINER__ASSETS, AssetsPackage.ASSET__ASSET_CONTAINER);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Seal> getSeals() {
		if (seals == null) {
			seals = new EObjectWithInverseResolvingEList<Seal>(Seal.class, this, AssetsPackage.ASSET_CONTAINER__SEALS, AssetsPackage.SEAL__ASSET_CONTAINER);
		}
		return seals;
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
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandProperties()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeals()).basicAdd(otherEnd, msgs);
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
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				return ((InternalEList<?>)getLandProperties()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				return ((InternalEList<?>)getSeals()).basicRemove(otherEnd, msgs);
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
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				return getLandProperties();
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				return getAssets();
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				return getSeals();
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
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				getLandProperties().clear();
				getLandProperties().addAll((Collection<? extends LandProperty>)newValue);
				return;
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				getSeals().clear();
				getSeals().addAll((Collection<? extends Seal>)newValue);
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
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				getLandProperties().clear();
				return;
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				getAssets().clear();
				return;
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				getSeals().clear();
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
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				return landProperties != null && !landProperties.isEmpty();
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				return assets != null && !assets.isEmpty();
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				return seals != null && !seals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssetContainerImpl
