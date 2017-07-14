/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole;

import gluemodel.CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Org Asset Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.OrgAssetRoleImpl#getErpOrganisation <em>Erp Organisation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.OrgAssetRoleImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.OrgAssetRoleImpl#getPercentOwnership <em>Percent Ownership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrgAssetRoleImpl extends RoleImpl implements OrgAssetRole {
	/**
	 * The cached value of the '{@link #getErpOrganisation() <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation erpOrganisation;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The default value of the '{@link #getPercentOwnership() <em>Percent Ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOwnership()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENT_OWNERSHIP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercentOwnership() <em>Percent Ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOwnership()
	 * @generated
	 * @ordered
	 */
	protected float percentOwnership = PERCENT_OWNERSHIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgAssetRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getOrgAssetRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation getErpOrganisation() {
		if (erpOrganisation != null && erpOrganisation.eIsProxy()) {
			InternalEObject oldErpOrganisation = (InternalEObject)erpOrganisation;
			erpOrganisation = (ErpOrganisation)eResolveProxy(oldErpOrganisation);
			if (erpOrganisation != oldErpOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION, oldErpOrganisation, erpOrganisation));
			}
		}
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetErpOrganisation() {
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpOrganisation(ErpOrganisation newErpOrganisation, NotificationChain msgs) {
		ErpOrganisation oldErpOrganisation = erpOrganisation;
		erpOrganisation = newErpOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION, oldErpOrganisation, newErpOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpOrganisation(ErpOrganisation newErpOrganisation) {
		if (newErpOrganisation != erpOrganisation) {
			NotificationChain msgs = null;
			if (erpOrganisation != null)
				msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES, ErpOrganisation.class, msgs);
			if (newErpOrganisation != null)
				msgs = ((InternalEObject)newErpOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetErpOrganisation(newErpOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION, newErpOrganisation, newErpOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.ORG_ASSET_ROLE__ASSET, oldAsset, asset));
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ORG_ASSET_ROLE__ASSET, oldAsset, newAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__ERP_ORGANISATION_ROLES, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, AssetsPackage.ASSET__ERP_ORGANISATION_ROLES, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ORG_ASSET_ROLE__ASSET, newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPercentOwnership() {
		return percentOwnership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentOwnership(float newPercentOwnership) {
		float oldPercentOwnership = percentOwnership;
		percentOwnership = newPercentOwnership;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.ORG_ASSET_ROLE__PERCENT_OWNERSHIP, oldPercentOwnership, percentOwnership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION:
				if (erpOrganisation != null)
					msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES, ErpOrganisation.class, msgs);
				return basicSetErpOrganisation((ErpOrganisation)otherEnd, msgs);
			case InfAssetsPackage.ORG_ASSET_ROLE__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__ERP_ORGANISATION_ROLES, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
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
			case InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION:
				return basicSetErpOrganisation(null, msgs);
			case InfAssetsPackage.ORG_ASSET_ROLE__ASSET:
				return basicSetAsset(null, msgs);
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
			case InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION:
				if (resolve) return getErpOrganisation();
				return basicGetErpOrganisation();
			case InfAssetsPackage.ORG_ASSET_ROLE__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case InfAssetsPackage.ORG_ASSET_ROLE__PERCENT_OWNERSHIP:
				return getPercentOwnership();
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
			case InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)newValue);
				return;
			case InfAssetsPackage.ORG_ASSET_ROLE__ASSET:
				setAsset((Asset)newValue);
				return;
			case InfAssetsPackage.ORG_ASSET_ROLE__PERCENT_OWNERSHIP:
				setPercentOwnership((Float)newValue);
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
			case InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)null);
				return;
			case InfAssetsPackage.ORG_ASSET_ROLE__ASSET:
				setAsset((Asset)null);
				return;
			case InfAssetsPackage.ORG_ASSET_ROLE__PERCENT_OWNERSHIP:
				setPercentOwnership(PERCENT_OWNERSHIP_EDEFAULT);
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
			case InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION:
				return erpOrganisation != null;
			case InfAssetsPackage.ORG_ASSET_ROLE__ASSET:
				return asset != null;
			case InfAssetsPackage.ORG_ASSET_ROLE__PERCENT_OWNERSHIP:
				return percentOwnership != PERCENT_OWNERSHIP_EDEFAULT;
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
		result.append(" (percentOwnership: ");
		result.append(percentOwnership);
		result.append(')');
		return result.toString();
	}

} //OrgAssetRoleImpl
