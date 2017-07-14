/**
 */
package gluemodel.CIM.IEC61968.Customers;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

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
 * @see gluemodel.CIM.IEC61968.Customers.CustomersFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package contains the core information classes that support customer billing applications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package contains the core information classes that support customer billing applications.'"
 * @generated
 */
public interface CustomersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Customers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Customers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimCustomers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomersPackage eINSTANCE = gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomerImpl
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__UUID = CommonPackage.ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MRID = CommonPackage.ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = CommonPackage.ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DESCRIPTION = CommonPackage.ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PATH_NAME = CommonPackage.ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MODELING_AUTHORITY_SET = CommonPackage.ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LOCAL_NAME = CommonPackage.ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ALIAS_NAME = CommonPackage.ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__STREET_ADDRESS = CommonPackage.ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ELECTRONIC_ADDRESS = CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__POSTAL_ADDRESS = CommonPackage.ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE1 = CommonPackage.ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE2 = CommonPackage.ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MARKET_ROLES = CommonPackage.ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BUSINESS_ROLES = CommonPackage.ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Planned Outage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PLANNED_OUTAGE = CommonPackage.ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Device Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__END_DEVICE_ASSETS = CommonPackage.ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__STATUS = CommonPackage.ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__KIND = CommonPackage.ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trouble Tickets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__TROUBLE_TICKETS = CommonPackage.ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ERP_PERSONS = CommonPackage.ORGANISATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outage Notifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__OUTAGE_NOTIFICATIONS = CommonPackage.ORGANISATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Special Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SPECIAL_NEED = CommonPackage.ORGANISATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Puc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PUC_NUMBER = CommonPackage.ORGANISATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__WORKS = CommonPackage.ORGANISATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_AGREEMENTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Vip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__VIP = CommonPackage.ORGANISATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = CommonPackage.ORGANISATION_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = CommonPackage.ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl <em>Service Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getServiceCategory()
	 * @generated
	 */
	int SERVICE_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>SP Accounting Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__CUSTOMER_AGREEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pricing Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY__PRICING_STRUCTURES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Service Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CATEGORY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl <em>Pricing Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getPricingStructure()
	 * @generated
	 */
	int PRICING_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tax Exemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__TAX_EXEMPTION = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__SERVICE_CATEGORY = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__CUSTOMER_AGREEMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Daily Floor Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__DAILY_FLOOR_USAGE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Revenue Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__REVENUE_KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Power Quality Pricings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__POWER_QUALITY_PRICINGS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tariffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__TARIFFS = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Daily Ceiling Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__DAILY_CEILING_USAGE = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subscribe Power Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Daily Estimated Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE__TRANSACTIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Pricing Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Pricing Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_STRUCTURE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl <em>Service Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getServiceLocation()
	 * @generated
	 */
	int SERVICE_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__UUID = CommonPackage.LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__MRID = CommonPackage.LOCATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__NAME = CommonPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__DESCRIPTION = CommonPackage.LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__PATH_NAME = CommonPackage.LOCATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__MODELING_AUTHORITY_SET = CommonPackage.LOCATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__LOCAL_NAME = CommonPackage.LOCATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__ALIAS_NAME = CommonPackage.LOCATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Secondary Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__SECONDARY_ADDRESS = CommonPackage.LOCATION__SECONDARY_ADDRESS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__MEASUREMENTS = CommonPackage.LOCATION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__DIRECTIONS = CommonPackage.LOCATION__DIRECTIONS;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__POWER_SYSTEM_RESOURCES = CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__PHONE2 = CommonPackage.LOCATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__PHONE1 = CommonPackage.LOCATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__LAND_PROPERTIES = CommonPackage.LOCATION__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__GEO_INFO_REFERENCE = CommonPackage.LOCATION__GEO_INFO_REFERENCE;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__DIMENSIONS_INFO = CommonPackage.LOCATION__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__CHANGE_ITEMS = CommonPackage.LOCATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Erp Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__ERP_ORGANISATIONS = CommonPackage.LOCATION__ERP_ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__COORDINATE_SYSTEMS = CommonPackage.LOCATION__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__ASSETS = CommonPackage.LOCATION__ASSETS;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__ROUTES = CommonPackage.LOCATION__ROUTES;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__HAZARDS = CommonPackage.LOCATION__HAZARDS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__CATEGORY = CommonPackage.LOCATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Main Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__MAIN_ADDRESS = CommonPackage.LOCATION__MAIN_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__ELECTRONIC_ADDRESS = CommonPackage.LOCATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__CORPORATE_CODE = CommonPackage.LOCATION__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Red Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__RED_LINES = CommonPackage.LOCATION__RED_LINES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__STATUS = CommonPackage.LOCATION__STATUS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__DIRECTION = CommonPackage.LOCATION__DIRECTION;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__CREWS = CommonPackage.LOCATION__CREWS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__POSITION = CommonPackage.LOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Needs Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__NEEDS_INSPECTION = CommonPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__SERVICE_DELIVERY_POINTS = CommonPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__ERP_PERSONS = CommonPackage.LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__ACCESS_METHOD = CommonPackage.LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__CUSTOMER_AGREEMENTS = CommonPackage.LOCATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Site Access Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__SITE_ACCESS_PROBLEM = CommonPackage.LOCATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Device Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION__END_DEVICE_ASSETS = CommonPackage.LOCATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Service Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION_FEATURE_COUNT = CommonPackage.LOCATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Service Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LOCATION_OPERATION_COUNT = CommonPackage.LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAccountImpl <em>Customer Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomerAccountImpl
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getCustomerAccount()
	 * @generated
	 */
	int CUSTOMER_ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Work Billing Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__WORK_BILLING_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Invoicees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__ERP_INVOICEES = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Customer Billing Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Customer Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Customer Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl <em>Customer Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getCustomerAgreement()
	 * @generated
	 */
	int CUSTOMER_AGREEMENT = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Service Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__SERVICE_SUPPLIER = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Industry Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Billing Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__BILLING_CYCLE = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS = CommonPackage.AGREEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meter Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__METER_READINGS = CommonPackage.AGREEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__SERVICE_LOCATIONS = CommonPackage.AGREEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pricing Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__PRICING_STRUCTURES = CommonPackage.AGREEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Load Mgmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__LOAD_MGMT = CommonPackage.AGREEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Auxiliary Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS = CommonPackage.AGREEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS = CommonPackage.AGREEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Budget Bill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__BUDGET_BILL = CommonPackage.AGREEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__CUSTOMER = CommonPackage.AGREEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Service Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__SERVICE_CATEGORY = CommonPackage.AGREEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Customer Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Demand Response Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM = CommonPackage.AGREEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT__EQUIPMENTS = CommonPackage.AGREEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Customer Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Customer Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_AGREEMENT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.impl.TariffImpl <em>Tariff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.impl.TariffImpl
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getTariff()
	 * @generated
	 */
	int TARIFF = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Tariff Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__TARIFF_PROFILES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pricing Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__PRICING_STRUCTURES = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__END_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF__START_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tariff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tariff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.CustomerKind <em>Customer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerKind
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getCustomerKind()
	 * @generated
	 */
	int CUSTOMER_KIND = 7;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.ServiceKind <em>Service Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceKind
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getServiceKind()
	 * @generated
	 */
	int SERVICE_KIND = 8;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Customers.RevenueKind <em>Revenue Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Customers.RevenueKind
	 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getRevenueKind()
	 * @generated
	 */
	int REVENUE_KIND = 9;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Customers.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.Customer#getPlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planned Outage</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getPlannedOutage()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_PlannedOutage();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.Customer#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Assets</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getEndDeviceAssets()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_EndDeviceAssets();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.Customer#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getStatus()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Status();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.Customer#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getKind()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Kind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.Customer#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trouble Tickets</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getTroubleTickets()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_TroubleTickets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.Customer#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getErpPersons()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_ErpPersons();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.Customer#getOutageNotifications <em>Outage Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Notifications</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getOutageNotifications()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_OutageNotifications();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.Customer#getSpecialNeed <em>Special Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Need</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getSpecialNeed()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_SpecialNeed();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.Customer#getPucNumber <em>Puc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puc Number</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getPucNumber()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PucNumber();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.Customer#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getWorks()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Works();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.Customer#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getCustomerAgreements()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_CustomerAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.Customer#isVip <em>Vip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vip</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#isVip()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Vip();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Category</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory
	 * @generated
	 */
	EClass getServiceCategory();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getSPAccountingFunctions <em>SP Accounting Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SP Accounting Functions</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getSPAccountingFunctions()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EReference getServiceCategory_SPAccountingFunctions();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getServiceDeliveryPoints()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EReference getServiceCategory_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getCustomerAgreements()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EReference getServiceCategory_CustomerAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getKind()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EAttribute getServiceCategory_Kind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pricing Structures</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getPricingStructures()
	 * @see #getServiceCategory()
	 * @generated
	 */
	EReference getServiceCategory_PricingStructures();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricing Structure</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure
	 * @generated
	 */
	EClass getPricingStructure();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getCode()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EAttribute getPricingStructure_Code();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#isTaxExemption <em>Tax Exemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Exemption</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#isTaxExemption()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EAttribute getPricingStructure_TaxExemption();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Category</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceCategory()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EReference getPricingStructure_ServiceCategory();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getCustomerAgreements()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EReference getPricingStructure_CustomerAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily Floor Usage</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyFloorUsage()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EAttribute getPricingStructure_DailyFloorUsage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getRevenueKind <em>Revenue Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revenue Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getRevenueKind()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EAttribute getPricingStructure_RevenueKind();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getPowerQualityPricings <em>Power Quality Pricings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Quality Pricings</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getPowerQualityPricings()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EReference getPricingStructure_PowerQualityPricings();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tariffs</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getTariffs()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EReference getPricingStructure_Tariffs();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getServiceDeliveryPoints()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EReference getPricingStructure_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily Ceiling Usage</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyCeilingUsage()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EAttribute getPricingStructure_DailyCeilingUsage();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getSubscribePowerCurve <em>Subscribe Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscribe Power Curve</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getSubscribePowerCurve()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EReference getPricingStructure_SubscribePowerCurve();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily Estimated Usage</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getDailyEstimatedUsage()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EAttribute getPricingStructure_DailyEstimatedUsage();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.PricingStructure#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.PricingStructure#getTransactions()
	 * @see #getPricingStructure()
	 * @generated
	 */
	EReference getPricingStructure_Transactions();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Location</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation
	 * @generated
	 */
	EClass getServiceLocation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#isNeedsInspection <em>Needs Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Inspection</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#isNeedsInspection()
	 * @see #getServiceLocation()
	 * @generated
	 */
	EAttribute getServiceLocation_NeedsInspection();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getServiceDeliveryPoints()
	 * @see #getServiceLocation()
	 * @generated
	 */
	EReference getServiceLocation_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getErpPersons()
	 * @see #getServiceLocation()
	 * @generated
	 */
	EReference getServiceLocation_ErpPersons();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getAccessMethod <em>Access Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Method</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getAccessMethod()
	 * @see #getServiceLocation()
	 * @generated
	 */
	EAttribute getServiceLocation_AccessMethod();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getCustomerAgreements()
	 * @see #getServiceLocation()
	 * @generated
	 */
	EReference getServiceLocation_CustomerAgreements();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getSiteAccessProblem <em>Site Access Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Access Problem</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getSiteAccessProblem()
	 * @see #getServiceLocation()
	 * @generated
	 */
	EAttribute getServiceLocation_SiteAccessProblem();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Assets</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getEndDeviceAssets()
	 * @see #getServiceLocation()
	 * @generated
	 */
	EReference getServiceLocation_EndDeviceAssets();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Account</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount
	 * @generated
	 */
	EClass getCustomerAccount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount#getWorkBillingInfos <em>Work Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Billing Infos</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount#getWorkBillingInfos()
	 * @see #getCustomerAccount()
	 * @generated
	 */
	EReference getCustomerAccount_WorkBillingInfos();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Transactions</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount#getPaymentTransactions()
	 * @see #getCustomerAccount()
	 * @generated
	 */
	EReference getCustomerAccount_PaymentTransactions();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount#getCustomerAgreements()
	 * @see #getCustomerAccount()
	 * @generated
	 */
	EReference getCustomerAccount_CustomerAgreements();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount#getErpInvoicees <em>Erp Invoicees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoicees</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount#getErpInvoicees()
	 * @see #getCustomerAccount()
	 * @generated
	 */
	EReference getCustomerAccount_ErpInvoicees();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAccount#getCustomerBillingInfos <em>Customer Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Billing Infos</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAccount#getCustomerBillingInfos()
	 * @see #getCustomerAccount()
	 * @generated
	 */
	EReference getCustomerAccount_CustomerBillingInfos();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Agreement</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement
	 * @generated
	 */
	EClass getCustomerAgreement();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Supplier</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceSupplier()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_ServiceSupplier();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getStandardIndustryCode <em>Standard Industry Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Standard Industry Code</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getStandardIndustryCode()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_StandardIndustryCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getBillingCycle <em>Billing Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Cycle</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getBillingCycle()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EAttribute getCustomerAgreement_BillingCycle();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceDeliveryPoints()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Readings</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getMeterReadings()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_MeterReadings();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceLocations <em>Service Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Locations</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceLocations()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_ServiceLocations();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pricing Structures</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getPricingStructures()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_PricingStructures();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Mgmt</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getLoadMgmt()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EAttribute getCustomerAgreement_LoadMgmt();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary Agreements</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getAuxiliaryAgreements()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_AuxiliaryAgreements();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Controls</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getEndDeviceControls()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_EndDeviceControls();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getBudgetBill <em>Budget Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Bill</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getBudgetBill()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EAttribute getCustomerAgreement_BudgetBill();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getCustomer()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_Customer();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Category</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getServiceCategory()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_ServiceCategory();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Account</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getCustomerAccount()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_CustomerAccount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Demand Response Program</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_DemandResponseProgram();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipments</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getEquipments()
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	EReference getCustomerAgreement_Equipments();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Customers.Tariff <em>Tariff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tariff</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Tariff
	 * @generated
	 */
	EClass getTariff();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.Tariff#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tariff Profiles</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Tariff#getTariffProfiles()
	 * @see #getTariff()
	 * @generated
	 */
	EReference getTariff_TariffProfiles();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Customers.Tariff#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pricing Structures</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Tariff#getPricingStructures()
	 * @see #getTariff()
	 * @generated
	 */
	EReference getTariff_PricingStructures();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.Tariff#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Tariff#getEndDate()
	 * @see #getTariff()
	 * @generated
	 */
	EAttribute getTariff_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Customers.Tariff#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.Tariff#getStartDate()
	 * @see #getTariff()
	 * @generated
	 */
	EAttribute getTariff_StartDate();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.Customers.CustomerKind <em>Customer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Customer Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerKind
	 * @generated
	 */
	EEnum getCustomerKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.Customers.ServiceKind <em>Service Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceKind
	 * @generated
	 */
	EEnum getServiceKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.Customers.RevenueKind <em>Revenue Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Revenue Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Customers.RevenueKind
	 * @generated
	 */
	EEnum getRevenueKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomersFactory getCustomersFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomerImpl
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Planned Outage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PLANNED_OUTAGE = eINSTANCE.getCustomer_PlannedOutage();

		/**
		 * The meta object literal for the '<em><b>End Device Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__END_DEVICE_ASSETS = eINSTANCE.getCustomer_EndDeviceAssets();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__STATUS = eINSTANCE.getCustomer_Status();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__KIND = eINSTANCE.getCustomer_Kind();

		/**
		 * The meta object literal for the '<em><b>Trouble Tickets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__TROUBLE_TICKETS = eINSTANCE.getCustomer_TroubleTickets();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ERP_PERSONS = eINSTANCE.getCustomer_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Outage Notifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__OUTAGE_NOTIFICATIONS = eINSTANCE.getCustomer_OutageNotifications();

		/**
		 * The meta object literal for the '<em><b>Special Need</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__SPECIAL_NEED = eINSTANCE.getCustomer_SpecialNeed();

		/**
		 * The meta object literal for the '<em><b>Puc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PUC_NUMBER = eINSTANCE.getCustomer_PucNumber();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__WORKS = eINSTANCE.getCustomer_Works();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CUSTOMER_AGREEMENTS = eINSTANCE.getCustomer_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Vip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__VIP = eINSTANCE.getCustomer_Vip();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl <em>Service Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getServiceCategory()
		 * @generated
		 */
		EClass SERVICE_CATEGORY = eINSTANCE.getServiceCategory();

		/**
		 * The meta object literal for the '<em><b>SP Accounting Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS = eINSTANCE.getServiceCategory_SPAccountingFunctions();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS = eINSTANCE.getServiceCategory_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CATEGORY__CUSTOMER_AGREEMENTS = eINSTANCE.getServiceCategory_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CATEGORY__KIND = eINSTANCE.getServiceCategory_Kind();

		/**
		 * The meta object literal for the '<em><b>Pricing Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CATEGORY__PRICING_STRUCTURES = eINSTANCE.getServiceCategory_PricingStructures();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl <em>Pricing Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.impl.PricingStructureImpl
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getPricingStructure()
		 * @generated
		 */
		EClass PRICING_STRUCTURE = eINSTANCE.getPricingStructure();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_STRUCTURE__CODE = eINSTANCE.getPricingStructure_Code();

		/**
		 * The meta object literal for the '<em><b>Tax Exemption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_STRUCTURE__TAX_EXEMPTION = eINSTANCE.getPricingStructure_TaxExemption();

		/**
		 * The meta object literal for the '<em><b>Service Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_STRUCTURE__SERVICE_CATEGORY = eINSTANCE.getPricingStructure_ServiceCategory();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_STRUCTURE__CUSTOMER_AGREEMENTS = eINSTANCE.getPricingStructure_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Daily Floor Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_STRUCTURE__DAILY_FLOOR_USAGE = eINSTANCE.getPricingStructure_DailyFloorUsage();

		/**
		 * The meta object literal for the '<em><b>Revenue Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_STRUCTURE__REVENUE_KIND = eINSTANCE.getPricingStructure_RevenueKind();

		/**
		 * The meta object literal for the '<em><b>Power Quality Pricings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_STRUCTURE__POWER_QUALITY_PRICINGS = eINSTANCE.getPricingStructure_PowerQualityPricings();

		/**
		 * The meta object literal for the '<em><b>Tariffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_STRUCTURE__TARIFFS = eINSTANCE.getPricingStructure_Tariffs();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS = eINSTANCE.getPricingStructure_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Daily Ceiling Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_STRUCTURE__DAILY_CEILING_USAGE = eINSTANCE.getPricingStructure_DailyCeilingUsage();

		/**
		 * The meta object literal for the '<em><b>Subscribe Power Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_STRUCTURE__SUBSCRIBE_POWER_CURVE = eINSTANCE.getPricingStructure_SubscribePowerCurve();

		/**
		 * The meta object literal for the '<em><b>Daily Estimated Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE = eINSTANCE.getPricingStructure_DailyEstimatedUsage();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_STRUCTURE__TRANSACTIONS = eINSTANCE.getPricingStructure_Transactions();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl <em>Service Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getServiceLocation()
		 * @generated
		 */
		EClass SERVICE_LOCATION = eINSTANCE.getServiceLocation();

		/**
		 * The meta object literal for the '<em><b>Needs Inspection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LOCATION__NEEDS_INSPECTION = eINSTANCE.getServiceLocation_NeedsInspection();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LOCATION__SERVICE_DELIVERY_POINTS = eINSTANCE.getServiceLocation_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LOCATION__ERP_PERSONS = eINSTANCE.getServiceLocation_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Access Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LOCATION__ACCESS_METHOD = eINSTANCE.getServiceLocation_AccessMethod();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LOCATION__CUSTOMER_AGREEMENTS = eINSTANCE.getServiceLocation_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Site Access Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LOCATION__SITE_ACCESS_PROBLEM = eINSTANCE.getServiceLocation_SiteAccessProblem();

		/**
		 * The meta object literal for the '<em><b>End Device Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LOCATION__END_DEVICE_ASSETS = eINSTANCE.getServiceLocation_EndDeviceAssets();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAccountImpl <em>Customer Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomerAccountImpl
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getCustomerAccount()
		 * @generated
		 */
		EClass CUSTOMER_ACCOUNT = eINSTANCE.getCustomerAccount();

		/**
		 * The meta object literal for the '<em><b>Work Billing Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ACCOUNT__WORK_BILLING_INFOS = eINSTANCE.getCustomerAccount_WorkBillingInfos();

		/**
		 * The meta object literal for the '<em><b>Payment Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS = eINSTANCE.getCustomerAccount_PaymentTransactions();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS = eINSTANCE.getCustomerAccount_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Erp Invoicees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ACCOUNT__ERP_INVOICEES = eINSTANCE.getCustomerAccount_ErpInvoicees();

		/**
		 * The meta object literal for the '<em><b>Customer Billing Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS = eINSTANCE.getCustomerAccount_CustomerBillingInfos();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl <em>Customer Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomerAgreementImpl
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getCustomerAgreement()
		 * @generated
		 */
		EClass CUSTOMER_AGREEMENT = eINSTANCE.getCustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>Service Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__SERVICE_SUPPLIER = eINSTANCE.getCustomerAgreement_ServiceSupplier();

		/**
		 * The meta object literal for the '<em><b>Standard Industry Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE = eINSTANCE.getCustomerAgreement_StandardIndustryCode();

		/**
		 * The meta object literal for the '<em><b>Billing Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_AGREEMENT__BILLING_CYCLE = eINSTANCE.getCustomerAgreement_BillingCycle();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS = eINSTANCE.getCustomerAgreement_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Meter Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__METER_READINGS = eINSTANCE.getCustomerAgreement_MeterReadings();

		/**
		 * The meta object literal for the '<em><b>Service Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__SERVICE_LOCATIONS = eINSTANCE.getCustomerAgreement_ServiceLocations();

		/**
		 * The meta object literal for the '<em><b>Pricing Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__PRICING_STRUCTURES = eINSTANCE.getCustomerAgreement_PricingStructures();

		/**
		 * The meta object literal for the '<em><b>Load Mgmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_AGREEMENT__LOAD_MGMT = eINSTANCE.getCustomerAgreement_LoadMgmt();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS = eINSTANCE.getCustomerAgreement_AuxiliaryAgreements();

		/**
		 * The meta object literal for the '<em><b>End Device Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS = eINSTANCE.getCustomerAgreement_EndDeviceControls();

		/**
		 * The meta object literal for the '<em><b>Budget Bill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_AGREEMENT__BUDGET_BILL = eINSTANCE.getCustomerAgreement_BudgetBill();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__CUSTOMER = eINSTANCE.getCustomerAgreement_Customer();

		/**
		 * The meta object literal for the '<em><b>Service Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__SERVICE_CATEGORY = eINSTANCE.getCustomerAgreement_ServiceCategory();

		/**
		 * The meta object literal for the '<em><b>Customer Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT = eINSTANCE.getCustomerAgreement_CustomerAccount();

		/**
		 * The meta object literal for the '<em><b>Demand Response Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM = eINSTANCE.getCustomerAgreement_DemandResponseProgram();

		/**
		 * The meta object literal for the '<em><b>Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_AGREEMENT__EQUIPMENTS = eINSTANCE.getCustomerAgreement_Equipments();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.impl.TariffImpl <em>Tariff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.impl.TariffImpl
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getTariff()
		 * @generated
		 */
		EClass TARIFF = eINSTANCE.getTariff();

		/**
		 * The meta object literal for the '<em><b>Tariff Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARIFF__TARIFF_PROFILES = eINSTANCE.getTariff_TariffProfiles();

		/**
		 * The meta object literal for the '<em><b>Pricing Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARIFF__PRICING_STRUCTURES = eINSTANCE.getTariff_PricingStructures();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARIFF__END_DATE = eINSTANCE.getTariff_EndDate();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARIFF__START_DATE = eINSTANCE.getTariff_StartDate();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.CustomerKind <em>Customer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.CustomerKind
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getCustomerKind()
		 * @generated
		 */
		EEnum CUSTOMER_KIND = eINSTANCE.getCustomerKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.ServiceKind <em>Service Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.ServiceKind
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getServiceKind()
		 * @generated
		 */
		EEnum SERVICE_KIND = eINSTANCE.getServiceKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Customers.RevenueKind <em>Revenue Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Customers.RevenueKind
		 * @see gluemodel.CIM.IEC61968.Customers.impl.CustomersPackageImpl#getRevenueKind()
		 * @generated
		 */
		EEnum REVENUE_KIND = eINSTANCE.getRevenueKind();

	}

} //CustomersPackage
