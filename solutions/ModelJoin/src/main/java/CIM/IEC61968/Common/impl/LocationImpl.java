/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Assets.Asset;
import CIM.IEC61968.Assets.AssetsPackage;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.CoordinateSystem;
import CIM.IEC61968.Common.ElectronicAddress;
import CIM.IEC61968.Common.Location;
import CIM.IEC61968.Common.PositionPoint;
import CIM.IEC61968.Common.Status;
import CIM.IEC61968.Common.StreetAddress;
import CIM.IEC61968.Common.TelephoneNumber;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.DimensionsInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfLocations.Direction;
import CIM.IEC61970.Informative.InfLocations.Hazard;
import CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import CIM.IEC61970.Informative.InfLocations.LandProperty;
import CIM.IEC61970.Informative.InfLocations.RedLine;
import CIM.IEC61970.Informative.InfLocations.Route;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import CIM.IEC61970.Informative.InfWork.Crew;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.Measurement;

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
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getSecondaryAddress <em>Secondary Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getDirections <em>Directions</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getLandProperties <em>Land Properties</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getGeoInfoReference <em>Geo Info Reference</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getDimensionsInfo <em>Dimensions Info</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getErpOrganisations <em>Erp Organisations</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getCoordinateSystems <em>Coordinate Systems</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getMainAddress <em>Main Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getRedLines <em>Red Lines</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.LocationImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends IdentifiedObjectImpl implements Location {
	/**
	 * The cached value of the '{@link #getSecondaryAddress() <em>Secondary Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryAddress()
	 * @generated
	 * @ordered
	 */
	protected StreetAddress secondaryAddress;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * The cached value of the '{@link #getDirections() <em>Directions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirections()
	 * @generated
	 * @ordered
	 */
	protected EList<Direction> directions;

	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

	/**
	 * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone2()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber phone2;

	/**
	 * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone1()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber phone1;

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
	 * The default value of the '{@link #getGeoInfoReference() <em>Geo Info Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoInfoReference()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_INFO_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeoInfoReference() <em>Geo Info Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoInfoReference()
	 * @generated
	 * @ordered
	 */
	protected String geoInfoReference = GEO_INFO_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimensionsInfo() <em>Dimensions Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionsInfo()
	 * @generated
	 * @ordered
	 */
	protected DimensionsInfo dimensionsInfo;

	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

	/**
	 * The cached value of the '{@link #getErpOrganisations() <em>Erp Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpOrganisation> erpOrganisations;

	/**
	 * The cached value of the '{@link #getCoordinateSystems() <em>Coordinate Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinateSystem> coordinateSystems;

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
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMainAddress() <em>Main Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainAddress()
	 * @generated
	 * @ordered
	 */
	protected StreetAddress mainAddress;

	/**
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

	/**
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedLines() <em>Red Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedLines()
	 * @generated
	 * @ordered
	 */
	protected EList<RedLine> redLines;

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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionPoint position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress getSecondaryAddress() {
		if (secondaryAddress != null && secondaryAddress.eIsProxy()) {
			InternalEObject oldSecondaryAddress = (InternalEObject)secondaryAddress;
			secondaryAddress = (StreetAddress)eResolveProxy(oldSecondaryAddress);
			if (secondaryAddress != oldSecondaryAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.LOCATION__SECONDARY_ADDRESS, oldSecondaryAddress, secondaryAddress));
			}
		}
		return secondaryAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress basicGetSecondaryAddress() {
		return secondaryAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryAddress(StreetAddress newSecondaryAddress) {
		StreetAddress oldSecondaryAddress = secondaryAddress;
		secondaryAddress = newSecondaryAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__SECONDARY_ADDRESS, oldSecondaryAddress, secondaryAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList.ManyInverse<Measurement>(Measurement.class, this, CommonPackage.LOCATION__MEASUREMENTS, MeasPackage.MEASUREMENT__LOCATIONS);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Direction> getDirections() {
		if (directions == null) {
			directions = new EObjectWithInverseResolvingEList<Direction>(Direction.class, this, CommonPackage.LOCATION__DIRECTIONS, InfLocationsPackage.DIRECTION__LOCATION);
		}
		return directions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new EObjectWithInverseResolvingEList<PowerSystemResource>(PowerSystemResource.class, this, CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES, CorePackage.POWER_SYSTEM_RESOURCE__LOCATION);
		}
		return powerSystemResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber getPhone2() {
		if (phone2 != null && phone2.eIsProxy()) {
			InternalEObject oldPhone2 = (InternalEObject)phone2;
			phone2 = (TelephoneNumber)eResolveProxy(oldPhone2);
			if (phone2 != oldPhone2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.LOCATION__PHONE2, oldPhone2, phone2));
			}
		}
		return phone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber basicGetPhone2() {
		return phone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone2(TelephoneNumber newPhone2) {
		TelephoneNumber oldPhone2 = phone2;
		phone2 = newPhone2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__PHONE2, oldPhone2, phone2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber getPhone1() {
		if (phone1 != null && phone1.eIsProxy()) {
			InternalEObject oldPhone1 = (InternalEObject)phone1;
			phone1 = (TelephoneNumber)eResolveProxy(oldPhone1);
			if (phone1 != oldPhone1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.LOCATION__PHONE1, oldPhone1, phone1));
			}
		}
		return phone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber basicGetPhone1() {
		return phone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone1(TelephoneNumber newPhone1) {
		TelephoneNumber oldPhone1 = phone1;
		phone1 = newPhone1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__PHONE1, oldPhone1, phone1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LandProperty> getLandProperties() {
		if (landProperties == null) {
			landProperties = new EObjectWithInverseResolvingEList.ManyInverse<LandProperty>(LandProperty.class, this, CommonPackage.LOCATION__LAND_PROPERTIES, InfLocationsPackage.LAND_PROPERTY__LOCATIONS);
		}
		return landProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeoInfoReference() {
		return geoInfoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoInfoReference(String newGeoInfoReference) {
		String oldGeoInfoReference = geoInfoReference;
		geoInfoReference = newGeoInfoReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__GEO_INFO_REFERENCE, oldGeoInfoReference, geoInfoReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsInfo getDimensionsInfo() {
		if (dimensionsInfo != null && dimensionsInfo.eIsProxy()) {
			InternalEObject oldDimensionsInfo = (InternalEObject)dimensionsInfo;
			dimensionsInfo = (DimensionsInfo)eResolveProxy(oldDimensionsInfo);
			if (dimensionsInfo != oldDimensionsInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.LOCATION__DIMENSIONS_INFO, oldDimensionsInfo, dimensionsInfo));
			}
		}
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsInfo basicGetDimensionsInfo() {
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionsInfo(DimensionsInfo newDimensionsInfo, NotificationChain msgs) {
		DimensionsInfo oldDimensionsInfo = dimensionsInfo;
		dimensionsInfo = newDimensionsInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__DIMENSIONS_INFO, oldDimensionsInfo, newDimensionsInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionsInfo(DimensionsInfo newDimensionsInfo) {
		if (newDimensionsInfo != dimensionsInfo) {
			NotificationChain msgs = null;
			if (dimensionsInfo != null)
				msgs = ((InternalEObject)dimensionsInfo).eInverseRemove(this, InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS, DimensionsInfo.class, msgs);
			if (newDimensionsInfo != null)
				msgs = ((InternalEObject)newDimensionsInfo).eInverseAdd(this, InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS, DimensionsInfo.class, msgs);
			msgs = basicSetDimensionsInfo(newDimensionsInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__DIMENSIONS_INFO, newDimensionsInfo, newDimensionsInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, CommonPackage.LOCATION__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__LOCATION);
		}
		return changeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpOrganisation> getErpOrganisations() {
		if (erpOrganisations == null) {
			erpOrganisations = new EObjectWithInverseResolvingEList.ManyInverse<ErpOrganisation>(ErpOrganisation.class, this, CommonPackage.LOCATION__ERP_ORGANISATIONS, InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS);
		}
		return erpOrganisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinateSystem> getCoordinateSystems() {
		if (coordinateSystems == null) {
			coordinateSystems = new EObjectWithInverseResolvingEList<CoordinateSystem>(CoordinateSystem.class, this, CommonPackage.LOCATION__COORDINATE_SYSTEMS, CommonPackage.COORDINATE_SYSTEM__LOCATION);
		}
		return coordinateSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectWithInverseResolvingEList<Asset>(Asset.class, this, CommonPackage.LOCATION__ASSETS, AssetsPackage.ASSET__LOCATION);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectWithInverseResolvingEList.ManyInverse<Route>(Route.class, this, CommonPackage.LOCATION__ROUTES, InfLocationsPackage.ROUTE__LOCATIONS);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new EObjectWithInverseResolvingEList.ManyInverse<Hazard>(Hazard.class, this, CommonPackage.LOCATION__HAZARDS, InfLocationsPackage.HAZARD__LOCATIONS);
		}
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress getMainAddress() {
		if (mainAddress != null && mainAddress.eIsProxy()) {
			InternalEObject oldMainAddress = (InternalEObject)mainAddress;
			mainAddress = (StreetAddress)eResolveProxy(oldMainAddress);
			if (mainAddress != oldMainAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.LOCATION__MAIN_ADDRESS, oldMainAddress, mainAddress));
			}
		}
		return mainAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress basicGetMainAddress() {
		return mainAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainAddress(StreetAddress newMainAddress) {
		StreetAddress oldMainAddress = mainAddress;
		mainAddress = newMainAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__MAIN_ADDRESS, oldMainAddress, mainAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		if (electronicAddress != null && electronicAddress.eIsProxy()) {
			InternalEObject oldElectronicAddress = (InternalEObject)electronicAddress;
			electronicAddress = (ElectronicAddress)eResolveProxy(oldElectronicAddress);
			if (electronicAddress != oldElectronicAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.LOCATION__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
			}
		}
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress basicGetElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		String oldCorporateCode = corporateCode;
		corporateCode = newCorporateCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__CORPORATE_CODE, oldCorporateCode, corporateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedLine> getRedLines() {
		if (redLines == null) {
			redLines = new EObjectWithInverseResolvingEList.ManyInverse<RedLine>(RedLine.class, this, CommonPackage.LOCATION__RED_LINES, InfLocationsPackage.RED_LINE__LOCATIONS);
		}
		return redLines;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.LOCATION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new EObjectWithInverseResolvingEList.ManyInverse<Crew>(Crew.class, this, CommonPackage.LOCATION__CREWS, InfWorkPackage.CREW__LOCATIONS);
		}
		return crews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPoint getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (PositionPoint)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.LOCATION__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPoint basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PositionPoint newPosition) {
		PositionPoint oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.LOCATION__POSITION, oldPosition, position));
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
			case CommonPackage.LOCATION__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__DIRECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDirections()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandProperties()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				if (dimensionsInfo != null)
					msgs = ((InternalEObject)dimensionsInfo).eInverseRemove(this, InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS, DimensionsInfo.class, msgs);
				return basicSetDimensionsInfo((DimensionsInfo)otherEnd, msgs);
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisations()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__COORDINATE_SYSTEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoordinateSystems()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__ROUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoutes()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__HAZARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHazards()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__RED_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRedLines()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.LOCATION__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__DIRECTIONS:
				return ((InternalEList<?>)getDirections()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				return ((InternalEList<?>)getLandProperties()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				return basicSetDimensionsInfo(null, msgs);
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				return ((InternalEList<?>)getErpOrganisations()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__COORDINATE_SYSTEMS:
				return ((InternalEList<?>)getCoordinateSystems()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__HAZARDS:
				return ((InternalEList<?>)getHazards()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__RED_LINES:
				return ((InternalEList<?>)getRedLines()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				if (resolve) return getSecondaryAddress();
				return basicGetSecondaryAddress();
			case CommonPackage.LOCATION__MEASUREMENTS:
				return getMeasurements();
			case CommonPackage.LOCATION__DIRECTIONS:
				return getDirections();
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case CommonPackage.LOCATION__PHONE2:
				if (resolve) return getPhone2();
				return basicGetPhone2();
			case CommonPackage.LOCATION__PHONE1:
				if (resolve) return getPhone1();
				return basicGetPhone1();
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				return getLandProperties();
			case CommonPackage.LOCATION__GEO_INFO_REFERENCE:
				return getGeoInfoReference();
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				if (resolve) return getDimensionsInfo();
				return basicGetDimensionsInfo();
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				return getChangeItems();
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				return getErpOrganisations();
			case CommonPackage.LOCATION__COORDINATE_SYSTEMS:
				return getCoordinateSystems();
			case CommonPackage.LOCATION__ASSETS:
				return getAssets();
			case CommonPackage.LOCATION__ROUTES:
				return getRoutes();
			case CommonPackage.LOCATION__HAZARDS:
				return getHazards();
			case CommonPackage.LOCATION__CATEGORY:
				return getCategory();
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				if (resolve) return getMainAddress();
				return basicGetMainAddress();
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				if (resolve) return getElectronicAddress();
				return basicGetElectronicAddress();
			case CommonPackage.LOCATION__CORPORATE_CODE:
				return getCorporateCode();
			case CommonPackage.LOCATION__RED_LINES:
				return getRedLines();
			case CommonPackage.LOCATION__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CommonPackage.LOCATION__DIRECTION:
				return getDirection();
			case CommonPackage.LOCATION__CREWS:
				return getCrews();
			case CommonPackage.LOCATION__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
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
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				setSecondaryAddress((StreetAddress)newValue);
				return;
			case CommonPackage.LOCATION__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CommonPackage.LOCATION__DIRECTIONS:
				getDirections().clear();
				getDirections().addAll((Collection<? extends Direction>)newValue);
				return;
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case CommonPackage.LOCATION__PHONE2:
				setPhone2((TelephoneNumber)newValue);
				return;
			case CommonPackage.LOCATION__PHONE1:
				setPhone1((TelephoneNumber)newValue);
				return;
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				getLandProperties().clear();
				getLandProperties().addAll((Collection<? extends LandProperty>)newValue);
				return;
			case CommonPackage.LOCATION__GEO_INFO_REFERENCE:
				setGeoInfoReference((String)newValue);
				return;
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				setDimensionsInfo((DimensionsInfo)newValue);
				return;
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				getErpOrganisations().clear();
				getErpOrganisations().addAll((Collection<? extends ErpOrganisation>)newValue);
				return;
			case CommonPackage.LOCATION__COORDINATE_SYSTEMS:
				getCoordinateSystems().clear();
				getCoordinateSystems().addAll((Collection<? extends CoordinateSystem>)newValue);
				return;
			case CommonPackage.LOCATION__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CommonPackage.LOCATION__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Route>)newValue);
				return;
			case CommonPackage.LOCATION__HAZARDS:
				getHazards().clear();
				getHazards().addAll((Collection<? extends Hazard>)newValue);
				return;
			case CommonPackage.LOCATION__CATEGORY:
				setCategory((String)newValue);
				return;
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				setMainAddress((StreetAddress)newValue);
				return;
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case CommonPackage.LOCATION__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case CommonPackage.LOCATION__RED_LINES:
				getRedLines().clear();
				getRedLines().addAll((Collection<? extends RedLine>)newValue);
				return;
			case CommonPackage.LOCATION__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.LOCATION__DIRECTION:
				setDirection((String)newValue);
				return;
			case CommonPackage.LOCATION__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case CommonPackage.LOCATION__POSITION:
				setPosition((PositionPoint)newValue);
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
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				setSecondaryAddress((StreetAddress)null);
				return;
			case CommonPackage.LOCATION__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CommonPackage.LOCATION__DIRECTIONS:
				getDirections().clear();
				return;
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case CommonPackage.LOCATION__PHONE2:
				setPhone2((TelephoneNumber)null);
				return;
			case CommonPackage.LOCATION__PHONE1:
				setPhone1((TelephoneNumber)null);
				return;
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				getLandProperties().clear();
				return;
			case CommonPackage.LOCATION__GEO_INFO_REFERENCE:
				setGeoInfoReference(GEO_INFO_REFERENCE_EDEFAULT);
				return;
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				setDimensionsInfo((DimensionsInfo)null);
				return;
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				getErpOrganisations().clear();
				return;
			case CommonPackage.LOCATION__COORDINATE_SYSTEMS:
				getCoordinateSystems().clear();
				return;
			case CommonPackage.LOCATION__ASSETS:
				getAssets().clear();
				return;
			case CommonPackage.LOCATION__ROUTES:
				getRoutes().clear();
				return;
			case CommonPackage.LOCATION__HAZARDS:
				getHazards().clear();
				return;
			case CommonPackage.LOCATION__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				setMainAddress((StreetAddress)null);
				return;
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case CommonPackage.LOCATION__CORPORATE_CODE:
				setCorporateCode(CORPORATE_CODE_EDEFAULT);
				return;
			case CommonPackage.LOCATION__RED_LINES:
				getRedLines().clear();
				return;
			case CommonPackage.LOCATION__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.LOCATION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case CommonPackage.LOCATION__CREWS:
				getCrews().clear();
				return;
			case CommonPackage.LOCATION__POSITION:
				setPosition((PositionPoint)null);
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
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				return secondaryAddress != null;
			case CommonPackage.LOCATION__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CommonPackage.LOCATION__DIRECTIONS:
				return directions != null && !directions.isEmpty();
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case CommonPackage.LOCATION__PHONE2:
				return phone2 != null;
			case CommonPackage.LOCATION__PHONE1:
				return phone1 != null;
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				return landProperties != null && !landProperties.isEmpty();
			case CommonPackage.LOCATION__GEO_INFO_REFERENCE:
				return GEO_INFO_REFERENCE_EDEFAULT == null ? geoInfoReference != null : !GEO_INFO_REFERENCE_EDEFAULT.equals(geoInfoReference);
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				return dimensionsInfo != null;
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				return erpOrganisations != null && !erpOrganisations.isEmpty();
			case CommonPackage.LOCATION__COORDINATE_SYSTEMS:
				return coordinateSystems != null && !coordinateSystems.isEmpty();
			case CommonPackage.LOCATION__ASSETS:
				return assets != null && !assets.isEmpty();
			case CommonPackage.LOCATION__ROUTES:
				return routes != null && !routes.isEmpty();
			case CommonPackage.LOCATION__HAZARDS:
				return hazards != null && !hazards.isEmpty();
			case CommonPackage.LOCATION__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				return mainAddress != null;
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case CommonPackage.LOCATION__CORPORATE_CODE:
				return CORPORATE_CODE_EDEFAULT == null ? corporateCode != null : !CORPORATE_CODE_EDEFAULT.equals(corporateCode);
			case CommonPackage.LOCATION__RED_LINES:
				return redLines != null && !redLines.isEmpty();
			case CommonPackage.LOCATION__STATUS:
				return status != null;
			case CommonPackage.LOCATION__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case CommonPackage.LOCATION__CREWS:
				return crews != null && !crews.isEmpty();
			case CommonPackage.LOCATION__POSITION:
				return position != null;
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
		result.append(" (geoInfoReference: ");
		result.append(geoInfoReference);
		result.append(", category: ");
		result.append(category);
		result.append(", corporateCode: ");
		result.append(corporateCode);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
