/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.ActivityRecord;
import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Location;

import CIM.IEC61968.Common.impl.OrganisationImpl;

import CIM.IEC61970.Informative.Financial.FinancialPackage;
import CIM.IEC61970.Informative.Financial.IntSchedAgreement;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.OrgAssetRole;

import CIM.IEC61970.Informative.InfERPSupport.DocOrgRole;
import CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;
import CIM.IEC61970.Informative.InfERPSupport.OrgErpPersonRole;
import CIM.IEC61970.Informative.InfERPSupport.OrgOrgRole;

import CIM.IEC61970.Informative.InfLocations.InfLocationsPackage;
import CIM.IEC61970.Informative.InfLocations.OrgPropertyRole;

import CIM.IEC61970.Informative.InfOperations.ChangeItem;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.OrgPsrRole;

import CIM.IEC61970.Informative.InfWork.Crew;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.Request;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.RegisteredResource;
import CIM.IEC61970.Informative.MarketOperations.ViolationLimit;

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
 * An implementation of the model object '<em><b>Erp Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#isOptOut <em>Opt Out</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getRegisteredResources <em>Registered Resources</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#isIsProfitCenter <em>Is Profit Center</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#isIsCostCenter <em>Is Cost Center</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getAssetRoles <em>Asset Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getViolationLimits <em>Violation Limits</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getParentOrganisationRoles <em>Parent Organisation Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getLandPropertyRoles <em>Land Property Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getChildOrganisationRoles <em>Child Organisation Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getIndustryID <em>Industry ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getIntSchedAgreement <em>Int Sched Agreement</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpOrganisationImpl#getGovernmentID <em>Government ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpOrganisationImpl extends OrganisationImpl implements ErpOrganisation {
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
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptOut() <em>Opt Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPT_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptOut() <em>Opt Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptOut()
	 * @generated
	 * @ordered
	 */
	protected boolean optOut = OPT_OUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegisteredResources() <em>Registered Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredResource> registeredResources;

	/**
	 * The cached value of the '{@link #getPowerSystemResourceRoles() <em>Power System Resource Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResourceRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgPsrRole> powerSystemResourceRoles;

	/**
	 * The default value of the '{@link #isIsProfitCenter() <em>Is Profit Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProfitCenter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROFIT_CENTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProfitCenter() <em>Is Profit Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProfitCenter()
	 * @generated
	 * @ordered
	 */
	protected boolean isProfitCenter = IS_PROFIT_CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCostCenter() <em>Is Cost Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCostCenter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COST_CENTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCostCenter() <em>Is Cost Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCostCenter()
	 * @generated
	 * @ordered
	 */
	protected boolean isCostCenter = IS_COST_CENTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentRoles() <em>Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocOrgRole> documentRoles;

	/**
	 * The cached value of the '{@link #getAssetRoles() <em>Asset Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgAssetRole> assetRoles;

	/**
	 * The cached value of the '{@link #getViolationLimits() <em>Violation Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<ViolationLimit> violationLimits;

	/**
	 * The cached value of the '{@link #getParentOrganisationRoles() <em>Parent Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgOrgRole> parentOrganisationRoles;

	/**
	 * The cached value of the '{@link #getLandPropertyRoles() <em>Land Property Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandPropertyRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgPropertyRole> landPropertyRoles;

	/**
	 * The cached value of the '{@link #getErpPersonRoles() <em>Erp Person Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgErpPersonRole> erpPersonRoles;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildOrganisationRoles() <em>Child Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgOrgRole> childOrganisationRoles;

	/**
	 * The default value of the '{@link #getIndustryID() <em>Industry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustryID()
	 * @generated
	 * @ordered
	 */
	protected static final String INDUSTRY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndustryID() <em>Industry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustryID()
	 * @generated
	 * @ordered
	 */
	protected String industryID = INDUSTRY_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getIntSchedAgreement() <em>Int Sched Agreement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntSchedAgreement()
	 * @generated
	 * @ordered
	 */
	protected EList<IntSchedAgreement> intSchedAgreement;

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
	 * The default value of the '{@link #getGovernmentID() <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernmentID()
	 * @generated
	 * @ordered
	 */
	protected static final String GOVERNMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGovernmentID() <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernmentID()
	 * @generated
	 * @ordered
	 */
	protected String governmentID = GOVERNMENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpOrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new EObjectWithInverseResolvingEList.ManyInverse<Crew>(Crew.class, this, InfERPSupportPackage.ERP_ORGANISATION__CREWS, InfWorkPackage.CREW__ORGANISATIONS);
		}
		return crews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRequests() {
		if (requests == null) {
			requests = new EObjectWithInverseResolvingEList<Request>(Request.class, this, InfERPSupportPackage.ERP_ORGANISATION__REQUESTS, InfWorkPackage.REQUEST__ORGANISATION);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_ORGANISATION__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptOut() {
		return optOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptOut(boolean newOptOut) {
		boolean oldOptOut = optOut;
		optOut = newOptOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT, oldOptOut, optOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredResource> getRegisteredResources() {
		if (registeredResources == null) {
			registeredResources = new EObjectWithInverseResolvingEList<RegisteredResource>(RegisteredResource.class, this, InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES, MarketOperationsPackage.REGISTERED_RESOURCE__ORGANISATION);
		}
		return registeredResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgPsrRole> getPowerSystemResourceRoles() {
		if (powerSystemResourceRoles == null) {
			powerSystemResourceRoles = new EObjectWithInverseResolvingEList<OrgPsrRole>(OrgPsrRole.class, this, InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES, InfOperationsPackage.ORG_PSR_ROLE__ERP_ORGANISATION);
		}
		return powerSystemResourceRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProfitCenter() {
		return isProfitCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProfitCenter(boolean newIsProfitCenter) {
		boolean oldIsProfitCenter = isProfitCenter;
		isProfitCenter = newIsProfitCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER, oldIsProfitCenter, isProfitCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCostCenter() {
		return isCostCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCostCenter(boolean newIsCostCenter) {
		boolean oldIsCostCenter = isCostCenter;
		isCostCenter = newIsCostCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER, oldIsCostCenter, isCostCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocOrgRole> getDocumentRoles() {
		if (documentRoles == null) {
			documentRoles = new EObjectWithInverseResolvingEList<DocOrgRole>(DocOrgRole.class, this, InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES, InfERPSupportPackage.DOC_ORG_ROLE__ERP_ORGANISATION);
		}
		return documentRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgAssetRole> getAssetRoles() {
		if (assetRoles == null) {
			assetRoles = new EObjectWithInverseResolvingEList<OrgAssetRole>(OrgAssetRole.class, this, InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES, InfAssetsPackage.ORG_ASSET_ROLE__ERP_ORGANISATION);
		}
		return assetRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViolationLimit> getViolationLimits() {
		if (violationLimits == null) {
			violationLimits = new EObjectWithInverseResolvingEList.ManyInverse<ViolationLimit>(ViolationLimit.class, this, InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS, MarketOperationsPackage.VIOLATION_LIMIT__ORGANISATIONS);
		}
		return violationLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgOrgRole> getParentOrganisationRoles() {
		if (parentOrganisationRoles == null) {
			parentOrganisationRoles = new EObjectWithInverseResolvingEList<OrgOrgRole>(OrgOrgRole.class, this, InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES, InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION);
		}
		return parentOrganisationRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgPropertyRole> getLandPropertyRoles() {
		if (landPropertyRoles == null) {
			landPropertyRoles = new EObjectWithInverseResolvingEList<OrgPropertyRole>(OrgPropertyRole.class, this, InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES, InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION);
		}
		return landPropertyRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgErpPersonRole> getErpPersonRoles() {
		if (erpPersonRoles == null) {
			erpPersonRoles = new EObjectWithInverseResolvingEList<OrgErpPersonRole>(OrgErpPersonRole.class, this, InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES, InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION);
		}
		return erpPersonRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_ORGANISATION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrgOrgRole> getChildOrganisationRoles() {
		if (childOrganisationRoles == null) {
			childOrganisationRoles = new EObjectWithInverseResolvingEList<OrgOrgRole>(OrgOrgRole.class, this, InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES, InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION);
		}
		return childOrganisationRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndustryID() {
		return industryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndustryID(String newIndustryID) {
		String oldIndustryID = industryID;
		industryID = newIndustryID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID, oldIndustryID, industryID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new EObjectWithInverseResolvingEList<ChangeItem>(ChangeItem.class, this, InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS, InfOperationsPackage.CHANGE_ITEM__ORGANISATION);
		}
		return changeItems;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_ORGANISATION__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectWithInverseResolvingEList.ManyInverse<Location>(Location.class, this, InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS, CommonPackage.LOCATION__ERP_ORGANISATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntSchedAgreement> getIntSchedAgreement() {
		if (intSchedAgreement == null) {
			intSchedAgreement = new EObjectWithInverseResolvingEList.ManyInverse<IntSchedAgreement>(IntSchedAgreement.class, this, InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT, FinancialPackage.INT_SCHED_AGREEMENT__ORGANISATIONS);
		}
		return intSchedAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityRecord> getActivityRecords() {
		if (activityRecords == null) {
			activityRecords = new EObjectWithInverseResolvingEList.ManyInverse<ActivityRecord>(ActivityRecord.class, this, InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS, CommonPackage.ACTIVITY_RECORD__ORGANISATIONS);
		}
		return activityRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGovernmentID() {
		return governmentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGovernmentID(String newGovernmentID) {
		String oldGovernmentID = governmentID;
		governmentID = newGovernmentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID, oldGovernmentID, governmentID));
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
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequests()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegisteredResources()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResourceRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViolationLimits()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOrganisationRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandPropertyRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersonRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildOrganisationRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntSchedAgreement()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRecords()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES:
				return ((InternalEList<?>)getRegisteredResources()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				return ((InternalEList<?>)getPowerSystemResourceRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				return ((InternalEList<?>)getDocumentRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				return ((InternalEList<?>)getAssetRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS:
				return ((InternalEList<?>)getViolationLimits()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				return ((InternalEList<?>)getParentOrganisationRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				return ((InternalEList<?>)getLandPropertyRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				return ((InternalEList<?>)getErpPersonRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				return ((InternalEList<?>)getChildOrganisationRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT:
				return ((InternalEList<?>)getIntSchedAgreement()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				return ((InternalEList<?>)getActivityRecords()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				return getCrews();
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				return getRequests();
			case InfERPSupportPackage.ERP_ORGANISATION__MODE:
				return getMode();
			case InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT:
				return isOptOut();
			case InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES:
				return getRegisteredResources();
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				return getPowerSystemResourceRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER:
				return isIsProfitCenter();
			case InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER:
				return isIsCostCenter();
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				return getDocumentRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				return getAssetRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS:
				return getViolationLimits();
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				return getParentOrganisationRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				return getLandPropertyRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				return getErpPersonRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__CODE:
				return getCode();
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				return getChildOrganisationRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID:
				return getIndustryID();
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				return getChangeItems();
			case InfERPSupportPackage.ERP_ORGANISATION__CATEGORY:
				return getCategory();
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				return getLocations();
			case InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT:
				return getIntSchedAgreement();
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				return getActivityRecords();
			case InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID:
				return getGovernmentID();
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
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__MODE:
				setMode((String)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT:
				setOptOut((Boolean)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
				getRegisteredResources().addAll((Collection<? extends RegisteredResource>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				getPowerSystemResourceRoles().clear();
				getPowerSystemResourceRoles().addAll((Collection<? extends OrgPsrRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER:
				setIsProfitCenter((Boolean)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER:
				setIsCostCenter((Boolean)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				getDocumentRoles().addAll((Collection<? extends DocOrgRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				getAssetRoles().clear();
				getAssetRoles().addAll((Collection<? extends OrgAssetRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS:
				getViolationLimits().clear();
				getViolationLimits().addAll((Collection<? extends ViolationLimit>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				getParentOrganisationRoles().clear();
				getParentOrganisationRoles().addAll((Collection<? extends OrgOrgRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				getLandPropertyRoles().clear();
				getLandPropertyRoles().addAll((Collection<? extends OrgPropertyRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				getErpPersonRoles().addAll((Collection<? extends OrgErpPersonRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CODE:
				setCode((String)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				getChildOrganisationRoles().clear();
				getChildOrganisationRoles().addAll((Collection<? extends OrgOrgRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID:
				setIndustryID((String)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT:
				getIntSchedAgreement().clear();
				getIntSchedAgreement().addAll((Collection<? extends IntSchedAgreement>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				getActivityRecords().addAll((Collection<? extends ActivityRecord>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID:
				setGovernmentID((String)newValue);
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
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				getCrews().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				getRequests().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT:
				setOptOut(OPT_OUT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES:
				getRegisteredResources().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				getPowerSystemResourceRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER:
				setIsProfitCenter(IS_PROFIT_CENTER_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER:
				setIsCostCenter(IS_COST_CENTER_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				getAssetRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS:
				getViolationLimits().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				getParentOrganisationRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				getLandPropertyRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				getChildOrganisationRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID:
				setIndustryID(INDUSTRY_ID_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				getLocations().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT:
				getIntSchedAgreement().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID:
				setGovernmentID(GOVERNMENT_ID_EDEFAULT);
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
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				return crews != null && !crews.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				return requests != null && !requests.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT:
				return optOut != OPT_OUT_EDEFAULT;
			case InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES:
				return registeredResources != null && !registeredResources.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				return powerSystemResourceRoles != null && !powerSystemResourceRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER:
				return isProfitCenter != IS_PROFIT_CENTER_EDEFAULT;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER:
				return isCostCenter != IS_COST_CENTER_EDEFAULT;
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				return documentRoles != null && !documentRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				return assetRoles != null && !assetRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS:
				return violationLimits != null && !violationLimits.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				return parentOrganisationRoles != null && !parentOrganisationRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				return landPropertyRoles != null && !landPropertyRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				return erpPersonRoles != null && !erpPersonRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				return childOrganisationRoles != null && !childOrganisationRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID:
				return INDUSTRY_ID_EDEFAULT == null ? industryID != null : !INDUSTRY_ID_EDEFAULT.equals(industryID);
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT:
				return intSchedAgreement != null && !intSchedAgreement.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				return activityRecords != null && !activityRecords.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID:
				return GOVERNMENT_ID_EDEFAULT == null ? governmentID != null : !GOVERNMENT_ID_EDEFAULT.equals(governmentID);
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", optOut: ");
		result.append(optOut);
		result.append(", isProfitCenter: ");
		result.append(isProfitCenter);
		result.append(", isCostCenter: ");
		result.append(isCostCenter);
		result.append(", code: ");
		result.append(code);
		result.append(", industryID: ");
		result.append(industryID);
		result.append(", category: ");
		result.append(category);
		result.append(", governmentID: ");
		result.append(governmentID);
		result.append(')');
		return result.toString();
	}

} //ErpOrganisationImpl
