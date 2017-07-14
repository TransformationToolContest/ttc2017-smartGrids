/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLocations.impl;

import gluemodel.CIM.IEC61968.Assets.AssetContainer;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.Location;
import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpSiteLevelData;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfLocations.DemographicKind;
import gluemodel.CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfLocations.LandProperty;
import gluemodel.CIM.IEC61970.Informative.InfLocations.LandPropertyKind;
import gluemodel.CIM.IEC61970.Informative.InfLocations.LocationGrant;
import gluemodel.CIM.IEC61970.Informative.InfLocations.OrgPropertyRole;
import gluemodel.CIM.IEC61970.Informative.InfLocations.PersonPropertyRole;
import gluemodel.CIM.IEC61970.Informative.InfLocations.RightOfWay;

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
 * An implementation of the model object '<em><b>Land Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getDemographicKind <em>Demographic Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getExternalRecordReference <em>External Record Reference</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getErpSiteLevelDatas <em>Erp Site Level Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getLocationGrants <em>Location Grants</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getRightOfWays <em>Right Of Ways</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfLocations.impl.LandPropertyImpl#getAssetContainers <em>Asset Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandPropertyImpl extends IdentifiedObjectImpl implements LandProperty {
	/**
	 * The default value of the '{@link #getDemographicKind() <em>Demographic Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemographicKind()
	 * @generated
	 * @ordered
	 */
	protected static final DemographicKind DEMOGRAPHIC_KIND_EDEFAULT = DemographicKind.OTHER;

	/**
	 * The cached value of the '{@link #getDemographicKind() <em>Demographic Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemographicKind()
	 * @generated
	 * @ordered
	 */
	protected DemographicKind demographicKind = DEMOGRAPHIC_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalRecordReference() <em>External Record Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRecordReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_RECORD_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalRecordReference() <em>External Record Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRecordReference()
	 * @generated
	 * @ordered
	 */
	protected String externalRecordReference = EXTERNAL_RECORD_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpSiteLevelDatas() <em>Erp Site Level Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpSiteLevelDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpSiteLevelData> erpSiteLevelDatas;

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
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgPropertyRole> erpOrganisationRoles;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getLocationGrants() <em>Location Grants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationGrants()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationGrant> locationGrants;

	/**
	 * The cached value of the '{@link #getErpPersonRoles() <em>Erp Person Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonPropertyRole> erpPersonRoles;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final LandPropertyKind KIND_EDEFAULT = LandPropertyKind.BUILDING;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected LandPropertyKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightOfWays() <em>Right Of Ways</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOfWays()
	 * @generated
	 * @ordered
	 */
	protected EList<RightOfWay> rightOfWays;

	/**
	 * The cached value of the '{@link #getAssetContainers() <em>Asset Containers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetContainer> assetContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.LAND_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemographicKind getDemographicKind() {
		return demographicKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemographicKind(DemographicKind newDemographicKind) {
		DemographicKind oldDemographicKind = demographicKind;
		demographicKind = newDemographicKind == null ? DEMOGRAPHIC_KIND_EDEFAULT : newDemographicKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND, oldDemographicKind, demographicKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalRecordReference() {
		return externalRecordReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalRecordReference(String newExternalRecordReference) {
		String oldExternalRecordReference = externalRecordReference;
		externalRecordReference = newExternalRecordReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE, oldExternalRecordReference, externalRecordReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpSiteLevelData> getErpSiteLevelDatas() {
		if (erpSiteLevelDatas == null) {
			erpSiteLevelDatas = new EObjectWithInverseResolvingEList<ErpSiteLevelData>(ErpSiteLevelData.class, this, InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS, InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY);
		}
		return erpSiteLevelDatas;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfLocationsPackage.LAND_PROPERTY__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.LAND_PROPERTY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgPropertyRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new EObjectWithInverseResolvingEList.ManyInverse<OrgPropertyRole>(OrgPropertyRole.class, this, InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES, InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY);
		}
		return erpOrganisationRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectWithInverseResolvingEList.ManyInverse<Location>(Location.class, this, InfLocationsPackage.LAND_PROPERTY__LOCATIONS, CommonPackage.LOCATION__LAND_PROPERTIES);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationGrant> getLocationGrants() {
		if (locationGrants == null) {
			locationGrants = new EObjectWithInverseResolvingEList<LocationGrant>(LocationGrant.class, this, InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS, InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY);
		}
		return locationGrants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonPropertyRole> getErpPersonRoles() {
		if (erpPersonRoles == null) {
			erpPersonRoles = new EObjectWithInverseResolvingEList<PersonPropertyRole>(PersonPropertyRole.class, this, InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES, InfLocationsPackage.PERSON_PROPERTY_ROLE__LAND_PROPERTY);
		}
		return erpPersonRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandPropertyKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(LandPropertyKind newKind) {
		LandPropertyKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLocationsPackage.LAND_PROPERTY__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightOfWay> getRightOfWays() {
		if (rightOfWays == null) {
			rightOfWays = new EObjectWithInverseResolvingEList.ManyInverse<RightOfWay>(RightOfWay.class, this, InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS, InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES);
		}
		return rightOfWays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetContainer> getAssetContainers() {
		if (assetContainers == null) {
			assetContainers = new EObjectWithInverseResolvingEList.ManyInverse<AssetContainer>(AssetContainer.class, this, InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS, AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES);
		}
		return assetContainers;
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
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpSiteLevelDatas()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocationGrants()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersonRoles()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRightOfWays()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetContainers()).basicAdd(otherEnd, msgs);
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
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				return ((InternalEList<?>)getErpSiteLevelDatas()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				return ((InternalEList<?>)getLocationGrants()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				return ((InternalEList<?>)getErpPersonRoles()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				return ((InternalEList<?>)getRightOfWays()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				return ((InternalEList<?>)getAssetContainers()).basicRemove(otherEnd, msgs);
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
			case InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND:
				return getDemographicKind();
			case InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE:
				return getExternalRecordReference();
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				return getErpSiteLevelDatas();
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				return getLocations();
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				return getLocationGrants();
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				return getErpPersonRoles();
			case InfLocationsPackage.LAND_PROPERTY__KIND:
				return getKind();
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				return getRightOfWays();
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				return getAssetContainers();
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
			case InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND:
				setDemographicKind((DemographicKind)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE:
				setExternalRecordReference((String)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				getErpSiteLevelDatas().clear();
				getErpSiteLevelDatas().addAll((Collection<? extends ErpSiteLevelData>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends OrgPropertyRole>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				getLocationGrants().clear();
				getLocationGrants().addAll((Collection<? extends LocationGrant>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				getErpPersonRoles().addAll((Collection<? extends PersonPropertyRole>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__KIND:
				setKind((LandPropertyKind)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				getRightOfWays().clear();
				getRightOfWays().addAll((Collection<? extends RightOfWay>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				getAssetContainers().clear();
				getAssetContainers().addAll((Collection<? extends AssetContainer>)newValue);
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
			case InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND:
				setDemographicKind(DEMOGRAPHIC_KIND_EDEFAULT);
				return;
			case InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE:
				setExternalRecordReference(EXTERNAL_RECORD_REFERENCE_EDEFAULT);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				getErpSiteLevelDatas().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				setStatus((Status)null);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				getLocations().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				getLocationGrants().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				getRightOfWays().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				getAssetContainers().clear();
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
			case InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND:
				return demographicKind != DEMOGRAPHIC_KIND_EDEFAULT;
			case InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE:
				return EXTERNAL_RECORD_REFERENCE_EDEFAULT == null ? externalRecordReference != null : !EXTERNAL_RECORD_REFERENCE_EDEFAULT.equals(externalRecordReference);
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				return erpSiteLevelDatas != null && !erpSiteLevelDatas.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				return status != null;
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				return locationGrants != null && !locationGrants.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				return erpPersonRoles != null && !erpPersonRoles.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__KIND:
				return kind != KIND_EDEFAULT;
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				return rightOfWays != null && !rightOfWays.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				return assetContainers != null && !assetContainers.isEmpty();
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
		result.append(" (demographicKind: ");
		result.append(demographicKind);
		result.append(", externalRecordReference: ");
		result.append(externalRecordReference);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //LandPropertyImpl
