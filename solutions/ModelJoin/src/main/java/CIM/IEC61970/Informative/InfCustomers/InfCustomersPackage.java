/**
 */
package CIM.IEC61970.Informative.InfCustomers;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61970.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see CIM.IEC61970.Informative.InfCustomers.InfCustomersFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The package is used to define detailed customer models.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The package is used to define detailed customer models.'"
 * @generated
 */
public interface InfCustomersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfCustomers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfCustomers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfCustomers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfCustomersPackage eINSTANCE = CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.StandardIndustryCodeImpl <em>Standard Industry Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.StandardIndustryCodeImpl
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getStandardIndustryCode()
	 * @generated
	 */
	int STANDARD_INDUSTRY_CODE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__CUSTOMER_AGREEMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE__CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Standard Industry Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Standard Industry Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INDUSTRY_CODE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl <em>Customer Billing Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getCustomerBillingInfo()
	 * @generated
	 */
	int CUSTOMER_BILLING_INFO = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__DUE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pymt Plan Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Billing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__BILLING_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Payment Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pymt Plan Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Out Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__OUT_BALANCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Customer Billing Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Customer Billing Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_INFO_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl <em>Power Quality Pricing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getPowerQualityPricing()
	 * @generated
	 */
	int POWER_QUALITY_PRICING = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Pricing Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__PRICING_STRUCTURE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Uninterrupted Service Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_ENERGY = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volt Imbalance Viol Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__VOLT_IMBALANCE_VIOL_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volt Limit Viol Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__VOLT_LIMIT_VIOL_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Emergency Low Volt Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__EMERGENCY_LOW_VOLT_LIMIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Uninterrupted Service P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_P = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Emergency High Volt Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__EMERGENCY_HIGH_VOLT_LIMIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Power Factor Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__POWER_FACTOR_MIN = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Normal Low Volt Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__NORMAL_LOW_VOLT_LIMIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Normal High Volt Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING__NORMAL_HIGH_VOLT_LIMIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Power Quality Pricing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Power Quality Pricing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_PRICING_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.OutageHistoryImpl <em>Outage History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.OutageHistoryImpl
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getOutageHistory()
	 * @generated
	 */
	int OUTAGE_HISTORY = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Outage Reports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY__OUTAGE_REPORTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Outage History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Outage History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTAGE_HISTORY_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl <em>Work Billing Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getWorkBillingInfo()
	 * @generated
	 */
	int WORK_BILLING_INFO = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Customer Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__CUSTOMER_ACCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Received Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__RECEIVED_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__DISCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issue Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__ISSUE_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__ERP_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Due Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__DUE_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Deposit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__DEPOSIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Work Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__WORK_PRICE = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cost Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO__COST_ESTIMATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Work Billing Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Work Billing Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_BILLING_INFO_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.SubscribePowerCurveImpl <em>Subscribe Power Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.SubscribePowerCurveImpl
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getSubscribePowerCurve()
	 * @generated
	 */
	int SUBSCRIBE_POWER_CURVE = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__DESCRIPTION = CorePackage.CURVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__PATH_NAME = CorePackage.CURVE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__LOCAL_NAME = CorePackage.CURVE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Pricing Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subscribe Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subscribe Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_POWER_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.ServiceGuaranteeImpl <em>Service Guarantee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.ServiceGuaranteeImpl
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getServiceGuarantee()
	 * @generated
	 */
	int SERVICE_GUARANTEE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Pay Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__PAY_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__APPLICATION_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Automatic Pay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__AUTOMATIC_PAY = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE__SERVICE_REQUIREMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Guarantee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Guarantee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_GUARANTEE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.ExternalCustomerAgreementImpl <em>External Customer Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.ExternalCustomerAgreementImpl
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getExternalCustomerAgreement()
	 * @generated
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The number of structural features of the '<em>External Customer Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Customer Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CUSTOMER_AGREEMENT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind <em>Customer Billing Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind
	 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getCustomerBillingKind()
	 * @generated
	 */
	int CUSTOMER_BILLING_KIND = 8;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode <em>Standard Industry Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Industry Code</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode
	 * @generated
	 */
	EClass getStandardIndustryCode();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCustomerAgreements()
	 * @see #getStandardIndustryCode()
	 * @generated
	 */
	EReference getStandardIndustryCode_CustomerAgreements();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCode()
	 * @see #getStandardIndustryCode()
	 * @generated
	 */
	EAttribute getStandardIndustryCode_Code();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo <em>Customer Billing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Billing Info</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo
	 * @generated
	 */
	EClass getCustomerBillingInfo();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getDueDate()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EAttribute getCustomerBillingInfo_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanAmt <em>Pymt Plan Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pymt Plan Amt</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanAmt()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EAttribute getCustomerBillingInfo_PymtPlanAmt();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Account</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EReference getCustomerBillingInfo_CustomerAccount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentDate <em>Last Payment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Payment Date</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentDate()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EAttribute getCustomerBillingInfo_LastPaymentDate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getBillingDate <em>Billing Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Date</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getBillingDate()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EAttribute getCustomerBillingInfo_BillingDate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentAmt <em>Last Payment Amt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Payment Amt</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentAmt()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EAttribute getCustomerBillingInfo_LastPaymentAmt();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanType <em>Pymt Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pymt Plan Type</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanType()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EAttribute getCustomerBillingInfo_PymtPlanType();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getOutBalance <em>Out Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Balance</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getOutBalance()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EAttribute getCustomerBillingInfo_OutBalance();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoice Line Items</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getErpInvoiceLineItems()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EReference getCustomerBillingInfo_ErpInvoiceLineItems();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getKind()
	 * @see #getCustomerBillingInfo()
	 * @generated
	 */
	EAttribute getCustomerBillingInfo_Kind();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing <em>Power Quality Pricing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Quality Pricing</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing
	 * @generated
	 */
	EClass getPowerQualityPricing();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pricing Structure</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPricingStructure()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EReference getPowerQualityPricing_PricingStructure();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getValueUninterruptedServiceEnergy <em>Value Uninterrupted Service Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Uninterrupted Service Energy</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getValueUninterruptedServiceEnergy()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_ValueUninterruptedServiceEnergy();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getVoltImbalanceViolCost <em>Volt Imbalance Viol Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volt Imbalance Viol Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getVoltImbalanceViolCost()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_VoltImbalanceViolCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getVoltLimitViolCost <em>Volt Limit Viol Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volt Limit Viol Cost</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getVoltLimitViolCost()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_VoltLimitViolCost();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getEmergencyLowVoltLimit <em>Emergency Low Volt Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency Low Volt Limit</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getEmergencyLowVoltLimit()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_EmergencyLowVoltLimit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getValueUninterruptedServiceP <em>Value Uninterrupted Service P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Uninterrupted Service P</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getValueUninterruptedServiceP()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_ValueUninterruptedServiceP();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getEmergencyHighVoltLimit <em>Emergency High Volt Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency High Volt Limit</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getEmergencyHighVoltLimit()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_EmergencyHighVoltLimit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPowerFactorMin <em>Power Factor Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Factor Min</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getPowerFactorMin()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_PowerFactorMin();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getServiceDeliveryPoints()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EReference getPowerQualityPricing_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getNormalLowVoltLimit <em>Normal Low Volt Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Low Volt Limit</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getNormalLowVoltLimit()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_NormalLowVoltLimit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getNormalHighVoltLimit <em>Normal High Volt Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal High Volt Limit</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.PowerQualityPricing#getNormalHighVoltLimit()
	 * @see #getPowerQualityPricing()
	 * @generated
	 */
	EAttribute getPowerQualityPricing_NormalHighVoltLimit();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfCustomers.OutageHistory <em>Outage History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage History</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.OutageHistory
	 * @generated
	 */
	EClass getOutageHistory();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfCustomers.OutageHistory#getOutageReports <em>Outage Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Reports</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.OutageHistory#getOutageReports()
	 * @see #getOutageHistory()
	 * @generated
	 */
	EReference getOutageHistory_OutageReports();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo <em>Work Billing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Billing Info</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo
	 * @generated
	 */
	EClass getWorkBillingInfo();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Account</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EReference getWorkBillingInfo_CustomerAccount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getReceivedDateTime <em>Received Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getReceivedDateTime()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EAttribute getWorkBillingInfo_ReceivedDateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDiscount()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EAttribute getWorkBillingInfo_Discount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getIssueDateTime <em>Issue Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getIssueDateTime()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EAttribute getWorkBillingInfo_IssueDateTime();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getErpLineItems <em>Erp Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Line Items</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getErpLineItems()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EReference getWorkBillingInfo_ErpLineItems();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDueDateTime <em>Due Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDueDateTime()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EAttribute getWorkBillingInfo_DueDateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDeposit <em>Deposit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deposit</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDeposit()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EAttribute getWorkBillingInfo_Deposit();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorks()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EReference getWorkBillingInfo_Works();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorkPrice <em>Work Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Price</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorkPrice()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EAttribute getWorkBillingInfo_WorkPrice();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCostEstimate <em>Cost Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Estimate</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCostEstimate()
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	EAttribute getWorkBillingInfo_CostEstimate();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve <em>Subscribe Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe Power Curve</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve
	 * @generated
	 */
	EClass getSubscribePowerCurve();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve#getPricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pricing Structure</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.SubscribePowerCurve#getPricingStructure()
	 * @see #getSubscribePowerCurve()
	 * @generated
	 */
	EReference getSubscribePowerCurve_PricingStructure();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee <em>Service Guarantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Guarantee</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee
	 * @generated
	 */
	EClass getServiceGuarantee();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getPayAmount <em>Pay Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getPayAmount()
	 * @see #getServiceGuarantee()
	 * @generated
	 */
	EAttribute getServiceGuarantee_PayAmount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getApplicationPeriod <em>Application Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Period</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getApplicationPeriod()
	 * @see #getServiceGuarantee()
	 * @generated
	 */
	EReference getServiceGuarantee_ApplicationPeriod();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#isAutomaticPay <em>Automatic Pay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Pay</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#isAutomaticPay()
	 * @see #getServiceGuarantee()
	 * @generated
	 */
	EAttribute getServiceGuarantee_AutomaticPay();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getServiceRequirement <em>Service Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Requirement</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee#getServiceRequirement()
	 * @see #getServiceGuarantee()
	 * @generated
	 */
	EAttribute getServiceGuarantee_ServiceRequirement();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfCustomers.ExternalCustomerAgreement <em>External Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Customer Agreement</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.ExternalCustomerAgreement
	 * @generated
	 */
	EClass getExternalCustomerAgreement();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind <em>Customer Billing Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Customer Billing Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind
	 * @generated
	 */
	EEnum getCustomerBillingKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfCustomersFactory getInfCustomersFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.StandardIndustryCodeImpl <em>Standard Industry Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.StandardIndustryCodeImpl
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getStandardIndustryCode()
		 * @generated
		 */
		EClass STANDARD_INDUSTRY_CODE = eINSTANCE.getStandardIndustryCode();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_INDUSTRY_CODE__CUSTOMER_AGREEMENTS = eINSTANCE.getStandardIndustryCode_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_INDUSTRY_CODE__CODE = eINSTANCE.getStandardIndustryCode_Code();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl <em>Customer Billing Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getCustomerBillingInfo()
		 * @generated
		 */
		EClass CUSTOMER_BILLING_INFO = eINSTANCE.getCustomerBillingInfo();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_BILLING_INFO__DUE_DATE = eINSTANCE.getCustomerBillingInfo_DueDate();

		/**
		 * The meta object literal for the '<em><b>Pymt Plan Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT = eINSTANCE.getCustomerBillingInfo_PymtPlanAmt();

		/**
		 * The meta object literal for the '<em><b>Customer Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT = eINSTANCE.getCustomerBillingInfo_CustomerAccount();

		/**
		 * The meta object literal for the '<em><b>Last Payment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE = eINSTANCE.getCustomerBillingInfo_LastPaymentDate();

		/**
		 * The meta object literal for the '<em><b>Billing Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_BILLING_INFO__BILLING_DATE = eINSTANCE.getCustomerBillingInfo_BillingDate();

		/**
		 * The meta object literal for the '<em><b>Last Payment Amt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT = eINSTANCE.getCustomerBillingInfo_LastPaymentAmt();

		/**
		 * The meta object literal for the '<em><b>Pymt Plan Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE = eINSTANCE.getCustomerBillingInfo_PymtPlanType();

		/**
		 * The meta object literal for the '<em><b>Out Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_BILLING_INFO__OUT_BALANCE = eINSTANCE.getCustomerBillingInfo_OutBalance();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS = eINSTANCE.getCustomerBillingInfo_ErpInvoiceLineItems();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_BILLING_INFO__KIND = eINSTANCE.getCustomerBillingInfo_Kind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl <em>Power Quality Pricing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.PowerQualityPricingImpl
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getPowerQualityPricing()
		 * @generated
		 */
		EClass POWER_QUALITY_PRICING = eINSTANCE.getPowerQualityPricing();

		/**
		 * The meta object literal for the '<em><b>Pricing Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_QUALITY_PRICING__PRICING_STRUCTURE = eINSTANCE.getPowerQualityPricing_PricingStructure();

		/**
		 * The meta object literal for the '<em><b>Value Uninterrupted Service Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_ENERGY = eINSTANCE.getPowerQualityPricing_ValueUninterruptedServiceEnergy();

		/**
		 * The meta object literal for the '<em><b>Volt Imbalance Viol Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__VOLT_IMBALANCE_VIOL_COST = eINSTANCE.getPowerQualityPricing_VoltImbalanceViolCost();

		/**
		 * The meta object literal for the '<em><b>Volt Limit Viol Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__VOLT_LIMIT_VIOL_COST = eINSTANCE.getPowerQualityPricing_VoltLimitViolCost();

		/**
		 * The meta object literal for the '<em><b>Emergency Low Volt Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__EMERGENCY_LOW_VOLT_LIMIT = eINSTANCE.getPowerQualityPricing_EmergencyLowVoltLimit();

		/**
		 * The meta object literal for the '<em><b>Value Uninterrupted Service P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__VALUE_UNINTERRUPTED_SERVICE_P = eINSTANCE.getPowerQualityPricing_ValueUninterruptedServiceP();

		/**
		 * The meta object literal for the '<em><b>Emergency High Volt Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__EMERGENCY_HIGH_VOLT_LIMIT = eINSTANCE.getPowerQualityPricing_EmergencyHighVoltLimit();

		/**
		 * The meta object literal for the '<em><b>Power Factor Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__POWER_FACTOR_MIN = eINSTANCE.getPowerQualityPricing_PowerFactorMin();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_QUALITY_PRICING__SERVICE_DELIVERY_POINTS = eINSTANCE.getPowerQualityPricing_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Normal Low Volt Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__NORMAL_LOW_VOLT_LIMIT = eINSTANCE.getPowerQualityPricing_NormalLowVoltLimit();

		/**
		 * The meta object literal for the '<em><b>Normal High Volt Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_QUALITY_PRICING__NORMAL_HIGH_VOLT_LIMIT = eINSTANCE.getPowerQualityPricing_NormalHighVoltLimit();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.OutageHistoryImpl <em>Outage History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.OutageHistoryImpl
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getOutageHistory()
		 * @generated
		 */
		EClass OUTAGE_HISTORY = eINSTANCE.getOutageHistory();

		/**
		 * The meta object literal for the '<em><b>Outage Reports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTAGE_HISTORY__OUTAGE_REPORTS = eINSTANCE.getOutageHistory_OutageReports();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl <em>Work Billing Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getWorkBillingInfo()
		 * @generated
		 */
		EClass WORK_BILLING_INFO = eINSTANCE.getWorkBillingInfo();

		/**
		 * The meta object literal for the '<em><b>Customer Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_BILLING_INFO__CUSTOMER_ACCOUNT = eINSTANCE.getWorkBillingInfo_CustomerAccount();

		/**
		 * The meta object literal for the '<em><b>Received Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BILLING_INFO__RECEIVED_DATE_TIME = eINSTANCE.getWorkBillingInfo_ReceivedDateTime();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BILLING_INFO__DISCOUNT = eINSTANCE.getWorkBillingInfo_Discount();

		/**
		 * The meta object literal for the '<em><b>Issue Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BILLING_INFO__ISSUE_DATE_TIME = eINSTANCE.getWorkBillingInfo_IssueDateTime();

		/**
		 * The meta object literal for the '<em><b>Erp Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_BILLING_INFO__ERP_LINE_ITEMS = eINSTANCE.getWorkBillingInfo_ErpLineItems();

		/**
		 * The meta object literal for the '<em><b>Due Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BILLING_INFO__DUE_DATE_TIME = eINSTANCE.getWorkBillingInfo_DueDateTime();

		/**
		 * The meta object literal for the '<em><b>Deposit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BILLING_INFO__DEPOSIT = eINSTANCE.getWorkBillingInfo_Deposit();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_BILLING_INFO__WORKS = eINSTANCE.getWorkBillingInfo_Works();

		/**
		 * The meta object literal for the '<em><b>Work Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BILLING_INFO__WORK_PRICE = eINSTANCE.getWorkBillingInfo_WorkPrice();

		/**
		 * The meta object literal for the '<em><b>Cost Estimate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_BILLING_INFO__COST_ESTIMATE = eINSTANCE.getWorkBillingInfo_CostEstimate();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.SubscribePowerCurveImpl <em>Subscribe Power Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.SubscribePowerCurveImpl
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getSubscribePowerCurve()
		 * @generated
		 */
		EClass SUBSCRIBE_POWER_CURVE = eINSTANCE.getSubscribePowerCurve();

		/**
		 * The meta object literal for the '<em><b>Pricing Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE_POWER_CURVE__PRICING_STRUCTURE = eINSTANCE.getSubscribePowerCurve_PricingStructure();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.ServiceGuaranteeImpl <em>Service Guarantee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.ServiceGuaranteeImpl
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getServiceGuarantee()
		 * @generated
		 */
		EClass SERVICE_GUARANTEE = eINSTANCE.getServiceGuarantee();

		/**
		 * The meta object literal for the '<em><b>Pay Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_GUARANTEE__PAY_AMOUNT = eINSTANCE.getServiceGuarantee_PayAmount();

		/**
		 * The meta object literal for the '<em><b>Application Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_GUARANTEE__APPLICATION_PERIOD = eINSTANCE.getServiceGuarantee_ApplicationPeriod();

		/**
		 * The meta object literal for the '<em><b>Automatic Pay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_GUARANTEE__AUTOMATIC_PAY = eINSTANCE.getServiceGuarantee_AutomaticPay();

		/**
		 * The meta object literal for the '<em><b>Service Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_GUARANTEE__SERVICE_REQUIREMENT = eINSTANCE.getServiceGuarantee_ServiceRequirement();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.impl.ExternalCustomerAgreementImpl <em>External Customer Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.ExternalCustomerAgreementImpl
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getExternalCustomerAgreement()
		 * @generated
		 */
		EClass EXTERNAL_CUSTOMER_AGREEMENT = eINSTANCE.getExternalCustomerAgreement();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind <em>Customer Billing Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind
		 * @see CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersPackageImpl#getCustomerBillingKind()
		 * @generated
		 */
		EEnum CUSTOMER_BILLING_KIND = eINSTANCE.getCustomerBillingKind();

	}

} //InfCustomersPackage
