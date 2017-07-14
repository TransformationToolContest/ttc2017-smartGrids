/**
 */
package gluemodel.CIM.IEC61968.Assets.impl;

import gluemodel.CIM.IEC61968.Assets.AcceptanceTest;
import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetContainer;
import gluemodel.CIM.IEC61968.Assets.AssetFunction;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;
import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.ElectronicAddress;
import gluemodel.CIM.IEC61968.Common.Location;
import gluemodel.CIM.IEC61968.Common.Status;
import gluemodel.CIM.IEC61968.Common.UserAttribute;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetAssetRole;
import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.AssetPropertyCurve;
import gluemodel.CIM.IEC61970.Informative.InfAssets.DocAssetRole;
import gluemodel.CIM.IEC61970.Informative.InfAssets.FinancialInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.Medium;
import gluemodel.CIM.IEC61970.Informative.InfAssets.OrgAssetRole;
import gluemodel.CIM.IEC61970.Informative.InfAssets.ReliabilityInfo;

import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;
import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInventory;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpItemMaster;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import gluemodel.CIM.IEC61970.Informative.InfOperations.ChangeItem;
import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.Measurement;

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
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getAssetPropertyCurves <em>Asset Property Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getFinancialInfo <em>Financial Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getFromAssetRoles <em>From Asset Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getAssetContainer <em>Asset Container</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getErpInventory <em>Erp Inventory</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getReliabilityInfos <em>Reliability Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getManufacturedDate <em>Manufactured Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getInitialLossOfLife <em>Initial Loss Of Life</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getAssetFunctions <em>Asset Functions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getUtcNumber <em>Utc Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getInstallationDate <em>Installation Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getRatings <em>Ratings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getMediums <em>Mediums</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getPurchasePrice <em>Purchase Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getToAssetRoles <em>To Asset Roles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getErpItemMaster <em>Erp Item Master</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Assets.impl.AssetImpl#getErpRecDeliveryItems <em>Erp Rec Delivery Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends IdentifiedObjectImpl implements Asset {
	/**
	 * The cached value of the '{@link #getAssetPropertyCurves() <em>Asset Property Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetPropertyCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetPropertyCurve> assetPropertyCurves;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getFinancialInfo() <em>Financial Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialInfo()
	 * @generated
	 * @ordered
	 */
	protected FinancialInfo financialInfo;

	/**
	 * The cached value of the '{@link #getFromAssetRoles() <em>From Asset Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAssetRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetAssetRole> fromAssetRoles;

	/**
	 * The cached value of the '{@link #getActivityRecords() <em>Activity Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityRecord> activityRecords;

	/**
	 * The cached value of the '{@link #getDocumentRoles() <em>Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocAssetRole> documentRoles;

	/**
	 * The cached value of the '{@link #getAssetContainer() <em>Asset Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetContainer()
	 * @generated
	 * @ordered
	 */
	protected AssetContainer assetContainer;

	/**
	 * The default value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected boolean critical = CRITICAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpInventory() <em>Erp Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInventory()
	 * @generated
	 * @ordered
	 */
	protected ErpInventory erpInventory;

	/**
	 * The cached value of the '{@link #getReliabilityInfos() <em>Reliability Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ReliabilityInfo> reliabilityInfos;

	/**
	 * The default value of the '{@link #getManufacturedDate() <em>Manufactured Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturedDate() <em>Manufactured Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedDate()
	 * @generated
	 * @ordered
	 */
	protected String manufacturedDate = MANUFACTURED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * The default value of the '{@link #getLotNumber() <em>Lot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LOT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected String lotNumber = LOT_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduledEvent> scheduledEvents;

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
	 * The default value of the '{@link #getInitialLossOfLife() <em>Initial Loss Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLossOfLife()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_LOSS_OF_LIFE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialLossOfLife() <em>Initial Loss Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLossOfLife()
	 * @generated
	 * @ordered
	 */
	protected float initialLossOfLife = INITIAL_LOSS_OF_LIFE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssetFunctions() <em>Asset Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetFunction> assetFunctions;

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
	 * The default value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected String initialCondition = INITIAL_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtcNumber() <em>Utc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String UTC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtcNumber() <em>Utc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcNumber()
	 * @generated
	 * @ordered
	 */
	protected String utcNumber = UTC_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstallationDate() <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALLATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallationDate() <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationDate()
	 * @generated
	 * @ordered
	 */
	protected String installationDate = INSTALLATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgAssetRole> erpOrganisationRoles;

	/**
	 * The cached value of the '{@link #getRatings() <em>Ratings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> ratings;

	/**
	 * The cached value of the '{@link #getMediums() <em>Mediums</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediums()
	 * @generated
	 * @ordered
	 */
	protected EList<Medium> mediums;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> properties;

	/**
	 * The cached value of the '{@link #getAssetInfo() <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetInfo()
	 * @generated
	 * @ordered
	 */
	protected AssetInfo assetInfo;

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
	 * The default value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchasePrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PURCHASE_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchasePrice()
	 * @generated
	 * @ordered
	 */
	protected float purchasePrice = PURCHASE_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToAssetRoles() <em>To Asset Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAssetRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetAssetRole> toAssetRoles;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

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
	 * The cached value of the '{@link #getErpItemMaster() <em>Erp Item Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpItemMaster()
	 * @generated
	 * @ordered
	 */
	protected ErpItemMaster erpItemMaster;

	/**
	 * The cached value of the '{@link #getAcceptanceTest() <em>Acceptance Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceTest()
	 * @generated
	 * @ordered
	 */
	protected AcceptanceTest acceptanceTest;

	/**
	 * The cached value of the '{@link #getErpRecDeliveryItems() <em>Erp Rec Delivery Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecDeliveryItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecDelvLineItem> erpRecDeliveryItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetPropertyCurve> getAssetPropertyCurves() {
		if (assetPropertyCurves == null) {
			assetPropertyCurves = new EObjectWithInverseResolvingEList.ManyInverse<AssetPropertyCurve>(AssetPropertyCurve.class, this, AssetsPackage.ASSET__ASSET_PROPERTY_CURVES, InfAssetsPackage.ASSET_PROPERTY_CURVE__ASSETS);
		}
		return assetPropertyCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, AssetsPackage.ASSET__MEASUREMENTS, MeasPackage.MEASUREMENT__ASSET);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialInfo getFinancialInfo() {
		if (financialInfo != null && financialInfo.eIsProxy()) {
			InternalEObject oldFinancialInfo = (InternalEObject)financialInfo;
			financialInfo = (FinancialInfo)eResolveProxy(oldFinancialInfo);
			if (financialInfo != oldFinancialInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__FINANCIAL_INFO, oldFinancialInfo, financialInfo));
			}
		}
		return financialInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialInfo basicGetFinancialInfo() {
		return financialInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinancialInfo(FinancialInfo newFinancialInfo, NotificationChain msgs) {
		FinancialInfo oldFinancialInfo = financialInfo;
		financialInfo = newFinancialInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__FINANCIAL_INFO, oldFinancialInfo, newFinancialInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinancialInfo(FinancialInfo newFinancialInfo) {
		if (newFinancialInfo != financialInfo) {
			NotificationChain msgs = null;
			if (financialInfo != null)
				msgs = ((InternalEObject)financialInfo).eInverseRemove(this, InfAssetsPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs);
			if (newFinancialInfo != null)
				msgs = ((InternalEObject)newFinancialInfo).eInverseAdd(this, InfAssetsPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs);
			msgs = basicSetFinancialInfo(newFinancialInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__FINANCIAL_INFO, newFinancialInfo, newFinancialInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetAssetRole> getFromAssetRoles() {
		if (fromAssetRoles == null) {
			fromAssetRoles = new EObjectWithInverseResolvingEList<AssetAssetRole>(AssetAssetRole.class, this, AssetsPackage.ASSET__FROM_ASSET_ROLES, InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET);
		}
		return fromAssetRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityRecord> getActivityRecords() {
		if (activityRecords == null) {
			activityRecords = new EObjectWithInverseResolvingEList.ManyInverse<ActivityRecord>(ActivityRecord.class, this, AssetsPackage.ASSET__ACTIVITY_RECORDS, CommonPackage.ACTIVITY_RECORD__ASSETS);
		}
		return activityRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocAssetRole> getDocumentRoles() {
		if (documentRoles == null) {
			documentRoles = new EObjectWithInverseResolvingEList<DocAssetRole>(DocAssetRole.class, this, AssetsPackage.ASSET__DOCUMENT_ROLES, InfAssetsPackage.DOC_ASSET_ROLE__ASSET);
		}
		return documentRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetContainer getAssetContainer() {
		if (assetContainer != null && assetContainer.eIsProxy()) {
			InternalEObject oldAssetContainer = (InternalEObject)assetContainer;
			assetContainer = (AssetContainer)eResolveProxy(oldAssetContainer);
			if (assetContainer != oldAssetContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__ASSET_CONTAINER, oldAssetContainer, assetContainer));
			}
		}
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetContainer basicGetAssetContainer() {
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetContainer(AssetContainer newAssetContainer, NotificationChain msgs) {
		AssetContainer oldAssetContainer = assetContainer;
		assetContainer = newAssetContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ASSET_CONTAINER, oldAssetContainer, newAssetContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetContainer(AssetContainer newAssetContainer) {
		if (newAssetContainer != assetContainer) {
			NotificationChain msgs = null;
			if (assetContainer != null)
				msgs = ((InternalEObject)assetContainer).eInverseRemove(this, AssetsPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs);
			if (newAssetContainer != null)
				msgs = ((InternalEObject)newAssetContainer).eInverseAdd(this, AssetsPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs);
			msgs = basicSetAssetContainer(newAssetContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ASSET_CONTAINER, newAssetContainer, newAssetContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritical(boolean newCritical) {
		boolean oldCritical = critical;
		critical = newCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__CRITICAL, oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInventory getErpInventory() {
		if (erpInventory != null && erpInventory.eIsProxy()) {
			InternalEObject oldErpInventory = (InternalEObject)erpInventory;
			erpInventory = (ErpInventory)eResolveProxy(oldErpInventory);
			if (erpInventory != oldErpInventory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__ERP_INVENTORY, oldErpInventory, erpInventory));
			}
		}
		return erpInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInventory basicGetErpInventory() {
		return erpInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpInventory(ErpInventory newErpInventory, NotificationChain msgs) {
		ErpInventory oldErpInventory = erpInventory;
		erpInventory = newErpInventory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ERP_INVENTORY, oldErpInventory, newErpInventory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpInventory(ErpInventory newErpInventory) {
		if (newErpInventory != erpInventory) {
			NotificationChain msgs = null;
			if (erpInventory != null)
				msgs = ((InternalEObject)erpInventory).eInverseRemove(this, InfERPSupportPackage.ERP_INVENTORY__ASSET, ErpInventory.class, msgs);
			if (newErpInventory != null)
				msgs = ((InternalEObject)newErpInventory).eInverseAdd(this, InfERPSupportPackage.ERP_INVENTORY__ASSET, ErpInventory.class, msgs);
			msgs = basicSetErpInventory(newErpInventory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ERP_INVENTORY, newErpInventory, newErpInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReliabilityInfo> getReliabilityInfos() {
		if (reliabilityInfos == null) {
			reliabilityInfos = new EObjectWithInverseResolvingEList.ManyInverse<ReliabilityInfo>(ReliabilityInfo.class, this, AssetsPackage.ASSET__RELIABILITY_INFOS, InfAssetsPackage.RELIABILITY_INFO__ASSETS);
		}
		return reliabilityInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturedDate() {
		return manufacturedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturedDate(String newManufacturedDate) {
		String oldManufacturedDate = manufacturedDate;
		manufacturedDate = newManufacturedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__MANUFACTURED_DATE, oldManufacturedDate, manufacturedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask getWorkTask() {
		if (workTask != null && workTask.eIsProxy()) {
			InternalEObject oldWorkTask = (InternalEObject)workTask;
			workTask = (WorkTask)eResolveProxy(oldWorkTask);
			if (workTask != oldWorkTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__WORK_TASK, oldWorkTask, workTask));
			}
		}
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask basicGetWorkTask() {
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTask(WorkTask newWorkTask, NotificationChain msgs) {
		WorkTask oldWorkTask = workTask;
		workTask = newWorkTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__WORK_TASK, oldWorkTask, newWorkTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkTask(WorkTask newWorkTask) {
		if (newWorkTask != workTask) {
			NotificationChain msgs = null;
			if (workTask != null)
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__ASSETS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__ASSETS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__WORK_TASK, newWorkTask, newWorkTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(String newLotNumber) {
		String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__LOT_NUMBER, oldLotNumber, lotNumber));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ELECTRONIC_ADDRESS, oldElectronicAddress, electronicAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduledEvent> getScheduledEvents() {
		if (scheduledEvents == null) {
			scheduledEvents = new EObjectWithInverseResolvingEList.ManyInverse<ScheduledEvent>(ScheduledEvent.class, this, AssetsPackage.ASSET__SCHEDULED_EVENTS, InfCommonPackage.SCHEDULED_EVENT__ASSETS);
		}
		return scheduledEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, AssetsPackage.ASSET__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__ASSET);
		}
		return changeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInitialLossOfLife() {
		return initialLossOfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialLossOfLife(float newInitialLossOfLife) {
		float oldInitialLossOfLife = initialLossOfLife;
		initialLossOfLife = newInitialLossOfLife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE, oldInitialLossOfLife, initialLossOfLife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetFunction> getAssetFunctions() {
		if (assetFunctions == null) {
			assetFunctions = new EObjectWithInverseResolvingEList<AssetFunction>(AssetFunction.class, this, AssetsPackage.ASSET__ASSET_FUNCTIONS, AssetsPackage.ASSET_FUNCTION__ASSET);
		}
		return assetFunctions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialCondition() {
		return initialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCondition(String newInitialCondition) {
		String oldInitialCondition = initialCondition;
		initialCondition = newInitialCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__INITIAL_CONDITION, oldInitialCondition, initialCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUtcNumber() {
		return utcNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtcNumber(String newUtcNumber) {
		String oldUtcNumber = utcNumber;
		utcNumber = newUtcNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__UTC_NUMBER, oldUtcNumber, utcNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallationDate() {
		return installationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallationDate(String newInstallationDate) {
		String oldInstallationDate = installationDate;
		installationDate = newInstallationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__INSTALLATION_DATE, oldInstallationDate, installationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgAssetRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new EObjectWithInverseResolvingEList<OrgAssetRole>(OrgAssetRole.class, this, AssetsPackage.ASSET__ERP_ORGANISATION_ROLES, InfAssetsPackage.ORG_ASSET_ROLE__ASSET);
		}
		return erpOrganisationRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getRatings() {
		if (ratings == null) {
			ratings = new EObjectWithInverseResolvingEList.ManyInverse<UserAttribute>(UserAttribute.class, this, AssetsPackage.ASSET__RATINGS, CommonPackage.USER_ATTRIBUTE__RATING_ASSETS);
		}
		return ratings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medium> getMediums() {
		if (mediums == null) {
			mediums = new EObjectWithInverseResolvingEList.ManyInverse<Medium>(Medium.class, this, AssetsPackage.ASSET__MEDIUMS, InfAssetsPackage.MEDIUM__ASSETS);
		}
		return mediums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getProperties() {
		if (properties == null) {
			properties = new EObjectWithInverseResolvingEList.ManyInverse<UserAttribute>(UserAttribute.class, this, AssetsPackage.ASSET__PROPERTIES, CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetInfo getAssetInfo() {
		if (assetInfo != null && assetInfo.eIsProxy()) {
			InternalEObject oldAssetInfo = (InternalEObject)assetInfo;
			assetInfo = (AssetInfo)eResolveProxy(oldAssetInfo);
			if (assetInfo != oldAssetInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__ASSET_INFO, oldAssetInfo, assetInfo));
			}
		}
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetInfo basicGetAssetInfo() {
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetInfo(AssetInfo newAssetInfo, NotificationChain msgs) {
		AssetInfo oldAssetInfo = assetInfo;
		assetInfo = newAssetInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ASSET_INFO, oldAssetInfo, newAssetInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetInfo(AssetInfo newAssetInfo) {
		if (newAssetInfo != assetInfo) {
			NotificationChain msgs = null;
			if (assetInfo != null)
				msgs = ((InternalEObject)assetInfo).eInverseRemove(this, InfAssetsPackage.ASSET_INFO__ASSET, AssetInfo.class, msgs);
			if (newAssetInfo != null)
				msgs = ((InternalEObject)newAssetInfo).eInverseAdd(this, InfAssetsPackage.ASSET_INFO__ASSET, AssetInfo.class, msgs);
			msgs = basicSetAssetInfo(newAssetInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ASSET_INFO, newAssetInfo, newAssetInfo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__CORPORATE_CODE, oldCorporateCode, corporateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchasePrice(float newPurchasePrice) {
		float oldPurchasePrice = purchasePrice;
		purchasePrice = newPurchasePrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__PURCHASE_PRICE, oldPurchasePrice, purchasePrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssetAssetRole> getToAssetRoles() {
		if (toAssetRoles == null) {
			toAssetRoles = new EObjectWithInverseResolvingEList<AssetAssetRole>(AssetAssetRole.class, this, AssetsPackage.ASSET__TO_ASSET_ROLES, InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET);
		}
		return toAssetRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__ASSETS, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CommonPackage.LOCATION__ASSETS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new EObjectWithInverseResolvingEList.ManyInverse<PowerSystemResource>(PowerSystemResource.class, this, AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES, CorePackage.POWER_SYSTEM_RESOURCE__ASSETS);
		}
		return powerSystemResources;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpItemMaster getErpItemMaster() {
		if (erpItemMaster != null && erpItemMaster.eIsProxy()) {
			InternalEObject oldErpItemMaster = (InternalEObject)erpItemMaster;
			erpItemMaster = (ErpItemMaster)eResolveProxy(oldErpItemMaster);
			if (erpItemMaster != oldErpItemMaster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__ERP_ITEM_MASTER, oldErpItemMaster, erpItemMaster));
			}
		}
		return erpItemMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpItemMaster basicGetErpItemMaster() {
		return erpItemMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpItemMaster(ErpItemMaster newErpItemMaster, NotificationChain msgs) {
		ErpItemMaster oldErpItemMaster = erpItemMaster;
		erpItemMaster = newErpItemMaster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ERP_ITEM_MASTER, oldErpItemMaster, newErpItemMaster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpItemMaster(ErpItemMaster newErpItemMaster) {
		if (newErpItemMaster != erpItemMaster) {
			NotificationChain msgs = null;
			if (erpItemMaster != null)
				msgs = ((InternalEObject)erpItemMaster).eInverseRemove(this, InfERPSupportPackage.ERP_ITEM_MASTER__ASSET, ErpItemMaster.class, msgs);
			if (newErpItemMaster != null)
				msgs = ((InternalEObject)newErpItemMaster).eInverseAdd(this, InfERPSupportPackage.ERP_ITEM_MASTER__ASSET, ErpItemMaster.class, msgs);
			msgs = basicSetErpItemMaster(newErpItemMaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ERP_ITEM_MASTER, newErpItemMaster, newErpItemMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTest getAcceptanceTest() {
		if (acceptanceTest != null && acceptanceTest.eIsProxy()) {
			InternalEObject oldAcceptanceTest = (InternalEObject)acceptanceTest;
			acceptanceTest = (AcceptanceTest)eResolveProxy(oldAcceptanceTest);
			if (acceptanceTest != oldAcceptanceTest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssetsPackage.ASSET__ACCEPTANCE_TEST, oldAcceptanceTest, acceptanceTest));
			}
		}
		return acceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTest basicGetAcceptanceTest() {
		return acceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceTest(AcceptanceTest newAcceptanceTest) {
		AcceptanceTest oldAcceptanceTest = acceptanceTest;
		acceptanceTest = newAcceptanceTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetsPackage.ASSET__ACCEPTANCE_TEST, oldAcceptanceTest, acceptanceTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpRecDelvLineItem> getErpRecDeliveryItems() {
		if (erpRecDeliveryItems == null) {
			erpRecDeliveryItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpRecDelvLineItem>(ErpRecDelvLineItem.class, this, AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS);
		}
		return erpRecDeliveryItems;
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
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetPropertyCurves()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				if (financialInfo != null)
					msgs = ((InternalEObject)financialInfo).eInverseRemove(this, InfAssetsPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs);
				return basicSetFinancialInfo((FinancialInfo)otherEnd, msgs);
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromAssetRoles()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRecords()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentRoles()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				if (assetContainer != null)
					msgs = ((InternalEObject)assetContainer).eInverseRemove(this, AssetsPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs);
				return basicSetAssetContainer((AssetContainer)otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_INVENTORY:
				if (erpInventory != null)
					msgs = ((InternalEObject)erpInventory).eInverseRemove(this, InfERPSupportPackage.ERP_INVENTORY__ASSET, ErpInventory.class, msgs);
				return basicSetErpInventory((ErpInventory)otherEnd, msgs);
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReliabilityInfos()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__ASSETS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledEvents()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetFunctions()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__RATINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRatings()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__MEDIUMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMediums()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_INFO:
				if (assetInfo != null)
					msgs = ((InternalEObject)assetInfo).eInverseRemove(this, InfAssetsPackage.ASSET_INFO__ASSET, AssetInfo.class, msgs);
				return basicSetAssetInfo((AssetInfo)otherEnd, msgs);
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToAssetRoles()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__ASSETS, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				if (erpItemMaster != null)
					msgs = ((InternalEObject)erpItemMaster).eInverseRemove(this, InfERPSupportPackage.ERP_ITEM_MASTER__ASSET, ErpItemMaster.class, msgs);
				return basicSetErpItemMaster((ErpItemMaster)otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecDeliveryItems()).basicAdd(otherEnd, msgs);
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
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				return ((InternalEList<?>)getAssetPropertyCurves()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				return basicSetFinancialInfo(null, msgs);
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				return ((InternalEList<?>)getFromAssetRoles()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				return ((InternalEList<?>)getActivityRecords()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				return ((InternalEList<?>)getDocumentRoles()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				return basicSetAssetContainer(null, msgs);
			case AssetsPackage.ASSET__ERP_INVENTORY:
				return basicSetErpInventory(null, msgs);
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				return ((InternalEList<?>)getReliabilityInfos()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				return ((InternalEList<?>)getScheduledEvents()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				return ((InternalEList<?>)getAssetFunctions()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__RATINGS:
				return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__MEDIUMS:
				return ((InternalEList<?>)getMediums()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_INFO:
				return basicSetAssetInfo(null, msgs);
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				return ((InternalEList<?>)getToAssetRoles()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__LOCATION:
				return basicSetLocation(null, msgs);
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				return basicSetErpItemMaster(null, msgs);
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				return ((InternalEList<?>)getErpRecDeliveryItems()).basicRemove(otherEnd, msgs);
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
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				return getAssetPropertyCurves();
			case AssetsPackage.ASSET__SERIAL_NUMBER:
				return getSerialNumber();
			case AssetsPackage.ASSET__MEASUREMENTS:
				return getMeasurements();
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				if (resolve) return getFinancialInfo();
				return basicGetFinancialInfo();
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				return getFromAssetRoles();
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				return getActivityRecords();
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				return getDocumentRoles();
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				if (resolve) return getAssetContainer();
				return basicGetAssetContainer();
			case AssetsPackage.ASSET__CRITICAL:
				return isCritical();
			case AssetsPackage.ASSET__ERP_INVENTORY:
				if (resolve) return getErpInventory();
				return basicGetErpInventory();
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				return getReliabilityInfos();
			case AssetsPackage.ASSET__MANUFACTURED_DATE:
				return getManufacturedDate();
			case AssetsPackage.ASSET__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case AssetsPackage.ASSET__LOT_NUMBER:
				return getLotNumber();
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				if (resolve) return getElectronicAddress();
				return basicGetElectronicAddress();
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				return getScheduledEvents();
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				return getChangeItems();
			case AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE:
				return getInitialLossOfLife();
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				return getAssetFunctions();
			case AssetsPackage.ASSET__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case AssetsPackage.ASSET__INITIAL_CONDITION:
				return getInitialCondition();
			case AssetsPackage.ASSET__UTC_NUMBER:
				return getUtcNumber();
			case AssetsPackage.ASSET__INSTALLATION_DATE:
				return getInstallationDate();
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case AssetsPackage.ASSET__RATINGS:
				return getRatings();
			case AssetsPackage.ASSET__MEDIUMS:
				return getMediums();
			case AssetsPackage.ASSET__PROPERTIES:
				return getProperties();
			case AssetsPackage.ASSET__ASSET_INFO:
				if (resolve) return getAssetInfo();
				return basicGetAssetInfo();
			case AssetsPackage.ASSET__CORPORATE_CODE:
				return getCorporateCode();
			case AssetsPackage.ASSET__PURCHASE_PRICE:
				return getPurchasePrice();
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				return getToAssetRoles();
			case AssetsPackage.ASSET__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case AssetsPackage.ASSET__APPLICATION:
				return getApplication();
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case AssetsPackage.ASSET__CATEGORY:
				return getCategory();
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				if (resolve) return getErpItemMaster();
				return basicGetErpItemMaster();
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				if (resolve) return getAcceptanceTest();
				return basicGetAcceptanceTest();
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				return getErpRecDeliveryItems();
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
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				getAssetPropertyCurves().clear();
				getAssetPropertyCurves().addAll((Collection<? extends AssetPropertyCurve>)newValue);
				return;
			case AssetsPackage.ASSET__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case AssetsPackage.ASSET__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				setFinancialInfo((FinancialInfo)newValue);
				return;
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				getFromAssetRoles().clear();
				getFromAssetRoles().addAll((Collection<? extends AssetAssetRole>)newValue);
				return;
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				getActivityRecords().addAll((Collection<? extends ActivityRecord>)newValue);
				return;
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				getDocumentRoles().addAll((Collection<? extends DocAssetRole>)newValue);
				return;
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				setAssetContainer((AssetContainer)newValue);
				return;
			case AssetsPackage.ASSET__CRITICAL:
				setCritical((Boolean)newValue);
				return;
			case AssetsPackage.ASSET__ERP_INVENTORY:
				setErpInventory((ErpInventory)newValue);
				return;
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				getReliabilityInfos().clear();
				getReliabilityInfos().addAll((Collection<? extends ReliabilityInfo>)newValue);
				return;
			case AssetsPackage.ASSET__MANUFACTURED_DATE:
				setManufacturedDate((String)newValue);
				return;
			case AssetsPackage.ASSET__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case AssetsPackage.ASSET__LOT_NUMBER:
				setLotNumber((String)newValue);
				return;
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				getScheduledEvents().addAll((Collection<? extends ScheduledEvent>)newValue);
				return;
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE:
				setInitialLossOfLife((Float)newValue);
				return;
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				getAssetFunctions().clear();
				getAssetFunctions().addAll((Collection<? extends AssetFunction>)newValue);
				return;
			case AssetsPackage.ASSET__STATUS:
				setStatus((Status)newValue);
				return;
			case AssetsPackage.ASSET__INITIAL_CONDITION:
				setInitialCondition((String)newValue);
				return;
			case AssetsPackage.ASSET__UTC_NUMBER:
				setUtcNumber((String)newValue);
				return;
			case AssetsPackage.ASSET__INSTALLATION_DATE:
				setInstallationDate((String)newValue);
				return;
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends OrgAssetRole>)newValue);
				return;
			case AssetsPackage.ASSET__RATINGS:
				getRatings().clear();
				getRatings().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case AssetsPackage.ASSET__MEDIUMS:
				getMediums().clear();
				getMediums().addAll((Collection<? extends Medium>)newValue);
				return;
			case AssetsPackage.ASSET__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case AssetsPackage.ASSET__ASSET_INFO:
				setAssetInfo((AssetInfo)newValue);
				return;
			case AssetsPackage.ASSET__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case AssetsPackage.ASSET__PURCHASE_PRICE:
				setPurchasePrice((Float)newValue);
				return;
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				getToAssetRoles().clear();
				getToAssetRoles().addAll((Collection<? extends AssetAssetRole>)newValue);
				return;
			case AssetsPackage.ASSET__LOCATION:
				setLocation((Location)newValue);
				return;
			case AssetsPackage.ASSET__APPLICATION:
				setApplication((String)newValue);
				return;
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case AssetsPackage.ASSET__CATEGORY:
				setCategory((String)newValue);
				return;
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				setErpItemMaster((ErpItemMaster)newValue);
				return;
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				setAcceptanceTest((AcceptanceTest)newValue);
				return;
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				getErpRecDeliveryItems().clear();
				getErpRecDeliveryItems().addAll((Collection<? extends ErpRecDelvLineItem>)newValue);
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
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				getAssetPropertyCurves().clear();
				return;
			case AssetsPackage.ASSET__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case AssetsPackage.ASSET__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				setFinancialInfo((FinancialInfo)null);
				return;
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				getFromAssetRoles().clear();
				return;
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				return;
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				return;
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				setAssetContainer((AssetContainer)null);
				return;
			case AssetsPackage.ASSET__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
				return;
			case AssetsPackage.ASSET__ERP_INVENTORY:
				setErpInventory((ErpInventory)null);
				return;
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				getReliabilityInfos().clear();
				return;
			case AssetsPackage.ASSET__MANUFACTURED_DATE:
				setManufacturedDate(MANUFACTURED_DATE_EDEFAULT);
				return;
			case AssetsPackage.ASSET__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case AssetsPackage.ASSET__LOT_NUMBER:
				setLotNumber(LOT_NUMBER_EDEFAULT);
				return;
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				return;
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE:
				setInitialLossOfLife(INITIAL_LOSS_OF_LIFE_EDEFAULT);
				return;
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				getAssetFunctions().clear();
				return;
			case AssetsPackage.ASSET__STATUS:
				setStatus((Status)null);
				return;
			case AssetsPackage.ASSET__INITIAL_CONDITION:
				setInitialCondition(INITIAL_CONDITION_EDEFAULT);
				return;
			case AssetsPackage.ASSET__UTC_NUMBER:
				setUtcNumber(UTC_NUMBER_EDEFAULT);
				return;
			case AssetsPackage.ASSET__INSTALLATION_DATE:
				setInstallationDate(INSTALLATION_DATE_EDEFAULT);
				return;
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case AssetsPackage.ASSET__RATINGS:
				getRatings().clear();
				return;
			case AssetsPackage.ASSET__MEDIUMS:
				getMediums().clear();
				return;
			case AssetsPackage.ASSET__PROPERTIES:
				getProperties().clear();
				return;
			case AssetsPackage.ASSET__ASSET_INFO:
				setAssetInfo((AssetInfo)null);
				return;
			case AssetsPackage.ASSET__CORPORATE_CODE:
				setCorporateCode(CORPORATE_CODE_EDEFAULT);
				return;
			case AssetsPackage.ASSET__PURCHASE_PRICE:
				setPurchasePrice(PURCHASE_PRICE_EDEFAULT);
				return;
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				getToAssetRoles().clear();
				return;
			case AssetsPackage.ASSET__LOCATION:
				setLocation((Location)null);
				return;
			case AssetsPackage.ASSET__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case AssetsPackage.ASSET__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				setErpItemMaster((ErpItemMaster)null);
				return;
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				setAcceptanceTest((AcceptanceTest)null);
				return;
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				getErpRecDeliveryItems().clear();
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
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				return assetPropertyCurves != null && !assetPropertyCurves.isEmpty();
			case AssetsPackage.ASSET__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case AssetsPackage.ASSET__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				return financialInfo != null;
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				return fromAssetRoles != null && !fromAssetRoles.isEmpty();
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				return activityRecords != null && !activityRecords.isEmpty();
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				return documentRoles != null && !documentRoles.isEmpty();
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				return assetContainer != null;
			case AssetsPackage.ASSET__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
			case AssetsPackage.ASSET__ERP_INVENTORY:
				return erpInventory != null;
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				return reliabilityInfos != null && !reliabilityInfos.isEmpty();
			case AssetsPackage.ASSET__MANUFACTURED_DATE:
				return MANUFACTURED_DATE_EDEFAULT == null ? manufacturedDate != null : !MANUFACTURED_DATE_EDEFAULT.equals(manufacturedDate);
			case AssetsPackage.ASSET__WORK_TASK:
				return workTask != null;
			case AssetsPackage.ASSET__LOT_NUMBER:
				return LOT_NUMBER_EDEFAULT == null ? lotNumber != null : !LOT_NUMBER_EDEFAULT.equals(lotNumber);
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				return scheduledEvents != null && !scheduledEvents.isEmpty();
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE:
				return initialLossOfLife != INITIAL_LOSS_OF_LIFE_EDEFAULT;
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				return assetFunctions != null && !assetFunctions.isEmpty();
			case AssetsPackage.ASSET__STATUS:
				return status != null;
			case AssetsPackage.ASSET__INITIAL_CONDITION:
				return INITIAL_CONDITION_EDEFAULT == null ? initialCondition != null : !INITIAL_CONDITION_EDEFAULT.equals(initialCondition);
			case AssetsPackage.ASSET__UTC_NUMBER:
				return UTC_NUMBER_EDEFAULT == null ? utcNumber != null : !UTC_NUMBER_EDEFAULT.equals(utcNumber);
			case AssetsPackage.ASSET__INSTALLATION_DATE:
				return INSTALLATION_DATE_EDEFAULT == null ? installationDate != null : !INSTALLATION_DATE_EDEFAULT.equals(installationDate);
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case AssetsPackage.ASSET__RATINGS:
				return ratings != null && !ratings.isEmpty();
			case AssetsPackage.ASSET__MEDIUMS:
				return mediums != null && !mediums.isEmpty();
			case AssetsPackage.ASSET__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case AssetsPackage.ASSET__ASSET_INFO:
				return assetInfo != null;
			case AssetsPackage.ASSET__CORPORATE_CODE:
				return CORPORATE_CODE_EDEFAULT == null ? corporateCode != null : !CORPORATE_CODE_EDEFAULT.equals(corporateCode);
			case AssetsPackage.ASSET__PURCHASE_PRICE:
				return purchasePrice != PURCHASE_PRICE_EDEFAULT;
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				return toAssetRoles != null && !toAssetRoles.isEmpty();
			case AssetsPackage.ASSET__LOCATION:
				return location != null;
			case AssetsPackage.ASSET__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case AssetsPackage.ASSET__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				return erpItemMaster != null;
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				return acceptanceTest != null;
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				return erpRecDeliveryItems != null && !erpRecDeliveryItems.isEmpty();
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
		result.append(" (serialNumber: ");
		result.append(serialNumber);
		result.append(", critical: ");
		result.append(critical);
		result.append(", manufacturedDate: ");
		result.append(manufacturedDate);
		result.append(", lotNumber: ");
		result.append(lotNumber);
		result.append(", initialLossOfLife: ");
		result.append(initialLossOfLife);
		result.append(", initialCondition: ");
		result.append(initialCondition);
		result.append(", utcNumber: ");
		result.append(utcNumber);
		result.append(", installationDate: ");
		result.append(installationDate);
		result.append(", corporateCode: ");
		result.append(corporateCode);
		result.append(", purchasePrice: ");
		result.append(purchasePrice);
		result.append(", application: ");
		result.append(application);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
