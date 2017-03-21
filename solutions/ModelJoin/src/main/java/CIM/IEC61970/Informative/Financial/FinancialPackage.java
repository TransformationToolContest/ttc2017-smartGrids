/**
 */
package CIM.IEC61970.Informative.Financial;

import CIM.CIMPackage;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.Financial.FinancialFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package is responsible for Settlement and Billing. These classes represent the legal entities who participate in formal or informal agreements.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package is responsible for Settlement and Billing. These classes represent the legal entities who participate in formal or informal agreements.'"
 * @generated
 */
public interface FinancialPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Financial";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Financial";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimFinancial";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinancialPackage eINSTANCE = CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.FinancialVersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialVersionImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getFinancialVersion()
	 * @generated
	 */
	int FINANCIAL_VERSION = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_VERSION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_VERSION__VERSION = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_VERSION__DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_VERSION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCIAL_VERSION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.MarketerImpl <em>Marketer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.MarketerImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getMarketer()
	 * @generated
	 */
	int MARKETER = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__UUID = InfERPSupportPackage.ERP_ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__MRID = InfERPSupportPackage.ERP_ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__NAME = InfERPSupportPackage.ERP_ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__DESCRIPTION = InfERPSupportPackage.ERP_ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__PATH_NAME = InfERPSupportPackage.ERP_ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__MODELING_AUTHORITY_SET = InfERPSupportPackage.ERP_ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__LOCAL_NAME = InfERPSupportPackage.ERP_ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__ALIAS_NAME = InfERPSupportPackage.ERP_ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__STREET_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__ELECTRONIC_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__POSTAL_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__PHONE1 = InfERPSupportPackage.ERP_ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__PHONE2 = InfERPSupportPackage.ERP_ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__MARKET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__BUSINESS_ROLES = InfERPSupportPackage.ERP_ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__CREWS = InfERPSupportPackage.ERP_ORGANISATION__CREWS;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__REQUESTS = InfERPSupportPackage.ERP_ORGANISATION__REQUESTS;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__MODE = InfERPSupportPackage.ERP_ORGANISATION__MODE;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__OPT_OUT = InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__REGISTERED_RESOURCES = InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__POWER_SYSTEM_RESOURCE_ROLES = InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__IS_PROFIT_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__IS_COST_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__DOCUMENT_ROLES = InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__ASSET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__VIOLATION_LIMITS = InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__PARENT_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__LAND_PROPERTY_ROLES = InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__ERP_PERSON_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__CODE = InfERPSupportPackage.ERP_ORGANISATION__CODE;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__CHILD_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__INDUSTRY_ID = InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__CHANGE_ITEMS = InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__CATEGORY = InfERPSupportPackage.ERP_ORGANISATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__LOCATIONS = InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__INT_SCHED_AGREEMENT = InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__ACTIVITY_RECORDS = InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__GOVERNMENT_ID = InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID;

	/**
	 * The feature id for the '<em><b>Resells Energy Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__RESELLS_ENERGY_PRODUCT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Held By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__HELD_BY = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Holds Title To Energy Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resold By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER__RESOLD_BY = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Marketer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER_FEATURE_COUNT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Marketer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETER_OPERATION_COUNT = InfERPSupportPackage.ERP_ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.IntSchedAgreementImpl <em>Int Sched Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.IntSchedAgreementImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getIntSchedAgreement()
	 * @generated
	 */
	int INT_SCHED_AGREEMENT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__ORGANISATIONS = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Integration Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT__DEFAULT_INTEGRATION_METHOD = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Sched Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Int Sched Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_SCHED_AGREEMENT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl <em>Transmission Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getTransmissionProvider()
	 * @generated
	 */
	int TRANSMISSION_PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__UUID = InfERPSupportPackage.ERP_ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__MRID = InfERPSupportPackage.ERP_ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__NAME = InfERPSupportPackage.ERP_ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__DESCRIPTION = InfERPSupportPackage.ERP_ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__PATH_NAME = InfERPSupportPackage.ERP_ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__MODELING_AUTHORITY_SET = InfERPSupportPackage.ERP_ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__LOCAL_NAME = InfERPSupportPackage.ERP_ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__ALIAS_NAME = InfERPSupportPackage.ERP_ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__STREET_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__ELECTRONIC_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__POSTAL_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__PHONE1 = InfERPSupportPackage.ERP_ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__PHONE2 = InfERPSupportPackage.ERP_ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__MARKET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__BUSINESS_ROLES = InfERPSupportPackage.ERP_ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__CREWS = InfERPSupportPackage.ERP_ORGANISATION__CREWS;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__REQUESTS = InfERPSupportPackage.ERP_ORGANISATION__REQUESTS;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__MODE = InfERPSupportPackage.ERP_ORGANISATION__MODE;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__OPT_OUT = InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__REGISTERED_RESOURCES = InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__POWER_SYSTEM_RESOURCE_ROLES = InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__IS_PROFIT_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__IS_COST_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__DOCUMENT_ROLES = InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__ASSET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__VIOLATION_LIMITS = InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__PARENT_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__LAND_PROPERTY_ROLES = InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__ERP_PERSON_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__CODE = InfERPSupportPackage.ERP_ORGANISATION__CODE;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__CHILD_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__INDUSTRY_ID = InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__CHANGE_ITEMS = InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__CATEGORY = InfERPSupportPackage.ERP_ORGANISATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__LOCATIONS = InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__INT_SCHED_AGREEMENT = InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__ACTIVITY_RECORDS = InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__GOVERNMENT_ID = InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID;

	/**
	 * The feature id for the '<em><b>Service Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__SERVICE_POINT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ancillary Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__ANCILLARY_SERVICES = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__FOR = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Offered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__OFFERED_BY = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flowgate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__FLOWGATE = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sold By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__SOLD_BY = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transmission Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transmission Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER_FEATURE_COUNT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Transmission Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PROVIDER_OPERATION_COUNT = InfERPSupportPackage.ERP_ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.TransmissionProductImpl <em>Transmission Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.TransmissionProductImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getTransmissionProduct()
	 * @generated
	 */
	int TRANSMISSION_PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Transmission Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__TRANSMISSION_PRODUCT_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__LOCATION_FOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transmission Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT__OFFERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transmission Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transmission Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_PRODUCT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.GenerationProviderImpl <em>Generation Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.GenerationProviderImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getGenerationProvider()
	 * @generated
	 */
	int GENERATION_PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__UUID = InfERPSupportPackage.ERP_ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__MRID = InfERPSupportPackage.ERP_ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__NAME = InfERPSupportPackage.ERP_ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__DESCRIPTION = InfERPSupportPackage.ERP_ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__PATH_NAME = InfERPSupportPackage.ERP_ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__MODELING_AUTHORITY_SET = InfERPSupportPackage.ERP_ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__LOCAL_NAME = InfERPSupportPackage.ERP_ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__ALIAS_NAME = InfERPSupportPackage.ERP_ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__STREET_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__ELECTRONIC_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__POSTAL_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__PHONE1 = InfERPSupportPackage.ERP_ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__PHONE2 = InfERPSupportPackage.ERP_ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__MARKET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__BUSINESS_ROLES = InfERPSupportPackage.ERP_ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__CREWS = InfERPSupportPackage.ERP_ORGANISATION__CREWS;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__REQUESTS = InfERPSupportPackage.ERP_ORGANISATION__REQUESTS;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__MODE = InfERPSupportPackage.ERP_ORGANISATION__MODE;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__OPT_OUT = InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__REGISTERED_RESOURCES = InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__POWER_SYSTEM_RESOURCE_ROLES = InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__IS_PROFIT_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__IS_COST_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__DOCUMENT_ROLES = InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__ASSET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__VIOLATION_LIMITS = InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__PARENT_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__LAND_PROPERTY_ROLES = InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__ERP_PERSON_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__CODE = InfERPSupportPackage.ERP_ORGANISATION__CODE;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__CHILD_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__INDUSTRY_ID = InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__CHANGE_ITEMS = InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__CATEGORY = InfERPSupportPackage.ERP_ORGANISATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__LOCATIONS = InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__INT_SCHED_AGREEMENT = InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__ACTIVITY_RECORDS = InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__GOVERNMENT_ID = InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID;

	/**
	 * The feature id for the '<em><b>Service Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__SERVICE_POINT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__GENERATING_UNITS = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER__ENERGY_PRODUCTS = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generation Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER_FEATURE_COUNT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generation Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_PROVIDER_OPERATION_COUNT = InfERPSupportPackage.ERP_ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.CustomerConsumerImpl <em>Customer Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.CustomerConsumerImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getCustomerConsumer()
	 * @generated
	 */
	int CUSTOMER_CONSUMER = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__UUID = InfERPSupportPackage.ERP_ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__MRID = InfERPSupportPackage.ERP_ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__NAME = InfERPSupportPackage.ERP_ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__DESCRIPTION = InfERPSupportPackage.ERP_ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__PATH_NAME = InfERPSupportPackage.ERP_ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__MODELING_AUTHORITY_SET = InfERPSupportPackage.ERP_ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__LOCAL_NAME = InfERPSupportPackage.ERP_ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__ALIAS_NAME = InfERPSupportPackage.ERP_ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__STREET_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__ELECTRONIC_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__POSTAL_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__PHONE1 = InfERPSupportPackage.ERP_ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__PHONE2 = InfERPSupportPackage.ERP_ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__MARKET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__BUSINESS_ROLES = InfERPSupportPackage.ERP_ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__CREWS = InfERPSupportPackage.ERP_ORGANISATION__CREWS;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__REQUESTS = InfERPSupportPackage.ERP_ORGANISATION__REQUESTS;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__MODE = InfERPSupportPackage.ERP_ORGANISATION__MODE;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__OPT_OUT = InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__REGISTERED_RESOURCES = InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__POWER_SYSTEM_RESOURCE_ROLES = InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__IS_PROFIT_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__IS_COST_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__DOCUMENT_ROLES = InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__ASSET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__VIOLATION_LIMITS = InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__PARENT_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__LAND_PROPERTY_ROLES = InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__ERP_PERSON_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__CODE = InfERPSupportPackage.ERP_ORGANISATION__CODE;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__CHILD_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__INDUSTRY_ID = InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__CHANGE_ITEMS = InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__CATEGORY = InfERPSupportPackage.ERP_ORGANISATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__LOCATIONS = InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__INT_SCHED_AGREEMENT = InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__ACTIVITY_RECORDS = InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__GOVERNMENT_ID = InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID;

	/**
	 * The feature id for the '<em><b>Tie Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__TIE_LINES = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER__SERVICE_POINT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Customer Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER_FEATURE_COUNT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_CONSUMER_OPERATION_COUNT = InfERPSupportPackage.ERP_ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.OpenAccessProductImpl <em>Open Access Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.OpenAccessProductImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getOpenAccessProduct()
	 * @generated
	 */
	int OPEN_ACCESS_PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Provided By Transmission Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ancillary Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Open Access Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Open Access Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_ACCESS_PRODUCT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.Financial.impl.ControlAreaOperatorImpl <em>Control Area Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.Financial.impl.ControlAreaOperatorImpl
	 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getControlAreaOperator()
	 * @generated
	 */
	int CONTROL_AREA_OPERATOR = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__UUID = InfERPSupportPackage.ERP_ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__MRID = InfERPSupportPackage.ERP_ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__NAME = InfERPSupportPackage.ERP_ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__DESCRIPTION = InfERPSupportPackage.ERP_ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__PATH_NAME = InfERPSupportPackage.ERP_ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__MODELING_AUTHORITY_SET = InfERPSupportPackage.ERP_ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__LOCAL_NAME = InfERPSupportPackage.ERP_ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__ALIAS_NAME = InfERPSupportPackage.ERP_ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__STREET_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__ELECTRONIC_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__POSTAL_ADDRESS = InfERPSupportPackage.ERP_ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__PHONE1 = InfERPSupportPackage.ERP_ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__PHONE2 = InfERPSupportPackage.ERP_ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__MARKET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__BUSINESS_ROLES = InfERPSupportPackage.ERP_ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__CREWS = InfERPSupportPackage.ERP_ORGANISATION__CREWS;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__REQUESTS = InfERPSupportPackage.ERP_ORGANISATION__REQUESTS;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__MODE = InfERPSupportPackage.ERP_ORGANISATION__MODE;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__OPT_OUT = InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT;

	/**
	 * The feature id for the '<em><b>Registered Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__REGISTERED_RESOURCES = InfERPSupportPackage.ERP_ORGANISATION__REGISTERED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__POWER_SYSTEM_RESOURCE_ROLES = InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__IS_PROFIT_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__IS_COST_CENTER = InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__DOCUMENT_ROLES = InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__ASSET_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Violation Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__VIOLATION_LIMITS = InfERPSupportPackage.ERP_ORGANISATION__VIOLATION_LIMITS;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__PARENT_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__LAND_PROPERTY_ROLES = InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__ERP_PERSON_ROLES = InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__CODE = InfERPSupportPackage.ERP_ORGANISATION__CODE;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__CHILD_ORGANISATION_ROLES = InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__INDUSTRY_ID = InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__CHANGE_ITEMS = InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__CATEGORY = InfERPSupportPackage.ERP_ORGANISATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__LOCATIONS = InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Int Sched Agreement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__INT_SCHED_AGREEMENT = InfERPSupportPackage.ERP_ORGANISATION__INT_SCHED_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__ACTIVITY_RECORDS = InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__GOVERNMENT_ID = InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID;

	/**
	 * The feature id for the '<em><b>Ancillary Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tie Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__TIE_LINES = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR__CONTROLLED_BY = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Area Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR_FEATURE_COUNT = InfERPSupportPackage.ERP_ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Control Area Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATOR_OPERATION_COUNT = InfERPSupportPackage.ERP_ORGANISATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.FinancialVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see CIM.IEC61970.Informative.Financial.FinancialVersion
	 * @generated
	 */
	EClass getFinancialVersion();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.Financial.FinancialVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CIM.IEC61970.Informative.Financial.FinancialVersion#getVersion()
	 * @see #getFinancialVersion()
	 * @generated
	 */
	EAttribute getFinancialVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.Financial.FinancialVersion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see CIM.IEC61970.Informative.Financial.FinancialVersion#getDate()
	 * @see #getFinancialVersion()
	 * @generated
	 */
	EAttribute getFinancialVersion_Date();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.Marketer <em>Marketer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketer</em>'.
	 * @see CIM.IEC61970.Informative.Financial.Marketer
	 * @generated
	 */
	EClass getMarketer();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.Marketer#getResells_EnergyProduct <em>Resells Energy Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resells Energy Product</em>'.
	 * @see CIM.IEC61970.Informative.Financial.Marketer#getResells_EnergyProduct()
	 * @see #getMarketer()
	 * @generated
	 */
	EReference getMarketer_Resells_EnergyProduct();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.Marketer#getHeldBy <em>Held By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Held By</em>'.
	 * @see CIM.IEC61970.Informative.Financial.Marketer#getHeldBy()
	 * @see #getMarketer()
	 * @generated
	 */
	EReference getMarketer_HeldBy();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.Marketer#getHoldsTitleTo_EnergyProducts <em>Holds Title To Energy Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Holds Title To Energy Products</em>'.
	 * @see CIM.IEC61970.Informative.Financial.Marketer#getHoldsTitleTo_EnergyProducts()
	 * @see #getMarketer()
	 * @generated
	 */
	EReference getMarketer_HoldsTitleTo_EnergyProducts();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.Financial.Marketer#getResoldBy <em>Resold By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resold By</em>'.
	 * @see CIM.IEC61970.Informative.Financial.Marketer#getResoldBy()
	 * @see #getMarketer()
	 * @generated
	 */
	EReference getMarketer_ResoldBy();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.IntSchedAgreement <em>Int Sched Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Sched Agreement</em>'.
	 * @see CIM.IEC61970.Informative.Financial.IntSchedAgreement
	 * @generated
	 */
	EClass getIntSchedAgreement();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.IntSchedAgreement#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organisations</em>'.
	 * @see CIM.IEC61970.Informative.Financial.IntSchedAgreement#getOrganisations()
	 * @see #getIntSchedAgreement()
	 * @generated
	 */
	EReference getIntSchedAgreement_Organisations();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.Financial.IntSchedAgreement#getDefaultIntegrationMethod <em>Default Integration Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Integration Method</em>'.
	 * @see CIM.IEC61970.Informative.Financial.IntSchedAgreement#getDefaultIntegrationMethod()
	 * @see #getIntSchedAgreement()
	 * @generated
	 */
	EAttribute getIntSchedAgreement_DefaultIntegrationMethod();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider <em>Transmission Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Provider</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider
	 * @generated
	 */
	EClass getTransmissionProvider();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Point</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getServicePoint()
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	EReference getTransmissionProvider_ServicePoint();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getAncillaryServices <em>Ancillary Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ancillary Services</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getAncillaryServices()
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	EReference getTransmissionProvider_AncillaryServices();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>For</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getFor()
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	EReference getTransmissionProvider_For();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getOfferedBy <em>Offered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered By</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getOfferedBy()
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	EReference getTransmissionProvider_OfferedBy();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getFlowgate <em>Flowgate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flowgate</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getFlowgate()
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	EReference getTransmissionProvider_Flowgate();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getSoldBy <em>Sold By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sold By</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getSoldBy()
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	EReference getTransmissionProvider_SoldBy();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProvider#getTransmissionProducts <em>Transmission Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transmission Products</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProvider#getTransmissionProducts()
	 * @see #getTransmissionProvider()
	 * @generated
	 */
	EReference getTransmissionProvider_TransmissionProducts();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.TransmissionProduct <em>Transmission Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Product</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProduct
	 * @generated
	 */
	EClass getTransmissionProduct();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProductType <em>Transmission Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Product Type</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProductType()
	 * @see #getTransmissionProduct()
	 * @generated
	 */
	EAttribute getTransmissionProduct_TransmissionProductType();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getLocationFor <em>Location For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location For</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProduct#getLocationFor()
	 * @see #getTransmissionProduct()
	 * @generated
	 */
	EReference getTransmissionProduct_LocationFor();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProvider <em>Transmission Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transmission Provider</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProduct#getTransmissionProvider()
	 * @see #getTransmissionProduct()
	 * @generated
	 */
	EReference getTransmissionProduct_TransmissionProvider();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.TransmissionProduct#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offers</em>'.
	 * @see CIM.IEC61970.Informative.Financial.TransmissionProduct#getOffers()
	 * @see #getTransmissionProduct()
	 * @generated
	 */
	EReference getTransmissionProduct_Offers();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.GenerationProvider <em>Generation Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Provider</em>'.
	 * @see CIM.IEC61970.Informative.Financial.GenerationProvider
	 * @generated
	 */
	EClass getGenerationProvider();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.GenerationProvider#getServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Point</em>'.
	 * @see CIM.IEC61970.Informative.Financial.GenerationProvider#getServicePoint()
	 * @see #getGenerationProvider()
	 * @generated
	 */
	EReference getGenerationProvider_ServicePoint();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.GenerationProvider#getGeneratingUnits <em>Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generating Units</em>'.
	 * @see CIM.IEC61970.Informative.Financial.GenerationProvider#getGeneratingUnits()
	 * @see #getGenerationProvider()
	 * @generated
	 */
	EReference getGenerationProvider_GeneratingUnits();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.GenerationProvider#getEnergyProducts <em>Energy Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Products</em>'.
	 * @see CIM.IEC61970.Informative.Financial.GenerationProvider#getEnergyProducts()
	 * @see #getGenerationProvider()
	 * @generated
	 */
	EReference getGenerationProvider_EnergyProducts();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.CustomerConsumer <em>Customer Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Consumer</em>'.
	 * @see CIM.IEC61970.Informative.Financial.CustomerConsumer
	 * @generated
	 */
	EClass getCustomerConsumer();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.CustomerConsumer#getTieLines <em>Tie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Lines</em>'.
	 * @see CIM.IEC61970.Informative.Financial.CustomerConsumer#getTieLines()
	 * @see #getCustomerConsumer()
	 * @generated
	 */
	EReference getCustomerConsumer_TieLines();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.CustomerConsumer#getServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Point</em>'.
	 * @see CIM.IEC61970.Informative.Financial.CustomerConsumer#getServicePoint()
	 * @see #getCustomerConsumer()
	 * @generated
	 */
	EReference getCustomerConsumer_ServicePoint();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.OpenAccessProduct <em>Open Access Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Access Product</em>'.
	 * @see CIM.IEC61970.Informative.Financial.OpenAccessProduct
	 * @generated
	 */
	EClass getOpenAccessProduct();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.OpenAccessProduct#getProvidedBy_TransmissionService <em>Provided By Transmission Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided By Transmission Service</em>'.
	 * @see CIM.IEC61970.Informative.Financial.OpenAccessProduct#getProvidedBy_TransmissionService()
	 * @see #getOpenAccessProduct()
	 * @generated
	 */
	EReference getOpenAccessProduct_ProvidedBy_TransmissionService();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.OpenAccessProduct#getAncillaryServices <em>Ancillary Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ancillary Services</em>'.
	 * @see CIM.IEC61970.Informative.Financial.OpenAccessProduct#getAncillaryServices()
	 * @see #getOpenAccessProduct()
	 * @generated
	 */
	EReference getOpenAccessProduct_AncillaryServices();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator <em>Control Area Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area Operator</em>'.
	 * @see CIM.IEC61970.Informative.Financial.ControlAreaOperator
	 * @generated
	 */
	EClass getControlAreaOperator();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getAncillaryService <em>Ancillary Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ancillary Service</em>'.
	 * @see CIM.IEC61970.Informative.Financial.ControlAreaOperator#getAncillaryService()
	 * @see #getControlAreaOperator()
	 * @generated
	 */
	EReference getControlAreaOperator_AncillaryService();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getTieLines <em>Tie Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Lines</em>'.
	 * @see CIM.IEC61970.Informative.Financial.ControlAreaOperator#getTieLines()
	 * @see #getControlAreaOperator()
	 * @generated
	 */
	EReference getControlAreaOperator_TieLines();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.Financial.ControlAreaOperator#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlled By</em>'.
	 * @see CIM.IEC61970.Informative.Financial.ControlAreaOperator#getControlledBy()
	 * @see #getControlAreaOperator()
	 * @generated
	 */
	EReference getControlAreaOperator_ControlledBy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FinancialFactory getFinancialFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.FinancialVersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialVersionImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getFinancialVersion()
		 * @generated
		 */
		EClass FINANCIAL_VERSION = eINSTANCE.getFinancialVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_VERSION__VERSION = eINSTANCE.getFinancialVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANCIAL_VERSION__DATE = eINSTANCE.getFinancialVersion_Date();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.MarketerImpl <em>Marketer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.MarketerImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getMarketer()
		 * @generated
		 */
		EClass MARKETER = eINSTANCE.getMarketer();

		/**
		 * The meta object literal for the '<em><b>Resells Energy Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETER__RESELLS_ENERGY_PRODUCT = eINSTANCE.getMarketer_Resells_EnergyProduct();

		/**
		 * The meta object literal for the '<em><b>Held By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETER__HELD_BY = eINSTANCE.getMarketer_HeldBy();

		/**
		 * The meta object literal for the '<em><b>Holds Title To Energy Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETER__HOLDS_TITLE_TO_ENERGY_PRODUCTS = eINSTANCE.getMarketer_HoldsTitleTo_EnergyProducts();

		/**
		 * The meta object literal for the '<em><b>Resold By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETER__RESOLD_BY = eINSTANCE.getMarketer_ResoldBy();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.IntSchedAgreementImpl <em>Int Sched Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.IntSchedAgreementImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getIntSchedAgreement()
		 * @generated
		 */
		EClass INT_SCHED_AGREEMENT = eINSTANCE.getIntSchedAgreement();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_SCHED_AGREEMENT__ORGANISATIONS = eINSTANCE.getIntSchedAgreement_Organisations();

		/**
		 * The meta object literal for the '<em><b>Default Integration Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_SCHED_AGREEMENT__DEFAULT_INTEGRATION_METHOD = eINSTANCE.getIntSchedAgreement_DefaultIntegrationMethod();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl <em>Transmission Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.TransmissionProviderImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getTransmissionProvider()
		 * @generated
		 */
		EClass TRANSMISSION_PROVIDER = eINSTANCE.getTransmissionProvider();

		/**
		 * The meta object literal for the '<em><b>Service Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PROVIDER__SERVICE_POINT = eINSTANCE.getTransmissionProvider_ServicePoint();

		/**
		 * The meta object literal for the '<em><b>Ancillary Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PROVIDER__ANCILLARY_SERVICES = eINSTANCE.getTransmissionProvider_AncillaryServices();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PROVIDER__FOR = eINSTANCE.getTransmissionProvider_For();

		/**
		 * The meta object literal for the '<em><b>Offered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PROVIDER__OFFERED_BY = eINSTANCE.getTransmissionProvider_OfferedBy();

		/**
		 * The meta object literal for the '<em><b>Flowgate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PROVIDER__FLOWGATE = eINSTANCE.getTransmissionProvider_Flowgate();

		/**
		 * The meta object literal for the '<em><b>Sold By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PROVIDER__SOLD_BY = eINSTANCE.getTransmissionProvider_SoldBy();

		/**
		 * The meta object literal for the '<em><b>Transmission Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PROVIDER__TRANSMISSION_PRODUCTS = eINSTANCE.getTransmissionProvider_TransmissionProducts();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.TransmissionProductImpl <em>Transmission Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.TransmissionProductImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getTransmissionProduct()
		 * @generated
		 */
		EClass TRANSMISSION_PRODUCT = eINSTANCE.getTransmissionProduct();

		/**
		 * The meta object literal for the '<em><b>Transmission Product Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_PRODUCT__TRANSMISSION_PRODUCT_TYPE = eINSTANCE.getTransmissionProduct_TransmissionProductType();

		/**
		 * The meta object literal for the '<em><b>Location For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PRODUCT__LOCATION_FOR = eINSTANCE.getTransmissionProduct_LocationFor();

		/**
		 * The meta object literal for the '<em><b>Transmission Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PRODUCT__TRANSMISSION_PROVIDER = eINSTANCE.getTransmissionProduct_TransmissionProvider();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_PRODUCT__OFFERS = eINSTANCE.getTransmissionProduct_Offers();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.GenerationProviderImpl <em>Generation Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.GenerationProviderImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getGenerationProvider()
		 * @generated
		 */
		EClass GENERATION_PROVIDER = eINSTANCE.getGenerationProvider();

		/**
		 * The meta object literal for the '<em><b>Service Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION_PROVIDER__SERVICE_POINT = eINSTANCE.getGenerationProvider_ServicePoint();

		/**
		 * The meta object literal for the '<em><b>Generating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION_PROVIDER__GENERATING_UNITS = eINSTANCE.getGenerationProvider_GeneratingUnits();

		/**
		 * The meta object literal for the '<em><b>Energy Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION_PROVIDER__ENERGY_PRODUCTS = eINSTANCE.getGenerationProvider_EnergyProducts();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.CustomerConsumerImpl <em>Customer Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.CustomerConsumerImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getCustomerConsumer()
		 * @generated
		 */
		EClass CUSTOMER_CONSUMER = eINSTANCE.getCustomerConsumer();

		/**
		 * The meta object literal for the '<em><b>Tie Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_CONSUMER__TIE_LINES = eINSTANCE.getCustomerConsumer_TieLines();

		/**
		 * The meta object literal for the '<em><b>Service Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_CONSUMER__SERVICE_POINT = eINSTANCE.getCustomerConsumer_ServicePoint();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.OpenAccessProductImpl <em>Open Access Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.OpenAccessProductImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getOpenAccessProduct()
		 * @generated
		 */
		EClass OPEN_ACCESS_PRODUCT = eINSTANCE.getOpenAccessProduct();

		/**
		 * The meta object literal for the '<em><b>Provided By Transmission Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_ACCESS_PRODUCT__PROVIDED_BY_TRANSMISSION_SERVICE = eINSTANCE.getOpenAccessProduct_ProvidedBy_TransmissionService();

		/**
		 * The meta object literal for the '<em><b>Ancillary Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_ACCESS_PRODUCT__ANCILLARY_SERVICES = eINSTANCE.getOpenAccessProduct_AncillaryServices();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.Financial.impl.ControlAreaOperatorImpl <em>Control Area Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.Financial.impl.ControlAreaOperatorImpl
		 * @see CIM.IEC61970.Informative.Financial.impl.FinancialPackageImpl#getControlAreaOperator()
		 * @generated
		 */
		EClass CONTROL_AREA_OPERATOR = eINSTANCE.getControlAreaOperator();

		/**
		 * The meta object literal for the '<em><b>Ancillary Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_OPERATOR__ANCILLARY_SERVICE = eINSTANCE.getControlAreaOperator_AncillaryService();

		/**
		 * The meta object literal for the '<em><b>Tie Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_OPERATOR__TIE_LINES = eINSTANCE.getControlAreaOperator_TieLines();

		/**
		 * The meta object literal for the '<em><b>Controlled By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_OPERATOR__CONTROLLED_BY = eINSTANCE.getControlAreaOperator_ControlledBy();

	}

} //FinancialPackage
