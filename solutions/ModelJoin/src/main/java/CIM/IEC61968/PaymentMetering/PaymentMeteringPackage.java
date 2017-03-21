/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.CIMPackage;

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
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package is an extension of the Metering package and contains the information classes that support specialized applications such as prepayment metering. These classes are generally associated with the collection and control of revenue from the customer for a delivered service.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package is an extension of the Metering package and contains the information classes that support specialized applications such as prepayment metering. These classes are generally associated with the collection and control of revenue from the customer for a delivered service.'"
 * @generated
 */
public interface PaymentMeteringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PaymentMetering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#PaymentMetering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimPaymentMetering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentMeteringPackage eINSTANCE = CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.CashierImpl <em>Cashier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.CashierImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCashier()
	 * @generated
	 */
	int CASHIER = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Cashier Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__CASHIER_SHIFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__VENDOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cashier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cashier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.TransactorImpl <em>Transactor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.TransactorImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTransactor()
	 * @generated
	 */
	int TRANSACTOR = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Merchant Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR__MERCHANT_ACCOUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transactor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transactor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTOR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.TariffProfileImpl <em>Tariff Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.TariffProfileImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTariffProfile()
	 * @generated
	 */
	int TARIFF_PROFILE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Tariff Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__TARIFF_CYCLE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__TIME_TARIFF_INTERVALS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tariffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__TARIFFS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tariff Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tariff Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFF_PROFILE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.MerchantAgreementImpl <em>Merchant Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.MerchantAgreementImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getMerchantAgreement()
	 * @generated
	 */
	int MERCHANT_AGREEMENT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Merchant Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merchant Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Merchant Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_AGREEMENT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.ShiftImpl <em>Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.ShiftImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getShift()
	 * @generated
	 */
	int SHIFT = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__TRANSACTIONS_GRAND_TOTAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__ACTIVITY_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transaction Summaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__TRANSACTION_SUMMARIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Receipt Summaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__RECEIPT_SUMMARIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl <em>Vendor Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getVendorShift()
	 * @generated
	 */
	int VENDOR_SHIFT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__UUID = SHIFT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__MRID = SHIFT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__NAME = SHIFT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__DESCRIPTION = SHIFT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__PATH_NAME = SHIFT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__MODELING_AUTHORITY_SET = SHIFT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__LOCAL_NAME = SHIFT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__ALIAS_NAME = SHIFT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__TRANSACTIONS_GRAND_TOTAL = SHIFT__TRANSACTIONS_GRAND_TOTAL;

	/**
	 * The feature id for the '<em><b>Activity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__ACTIVITY_INTERVAL = SHIFT__ACTIVITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Transaction Summaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__TRANSACTION_SUMMARIES = SHIFT__TRANSACTION_SUMMARIES;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING = SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING = SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE = SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE = SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE;

	/**
	 * The feature id for the '<em><b>Receipt Summaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__RECEIPT_SUMMARIES = SHIFT__RECEIPT_SUMMARIES;

	/**
	 * The feature id for the '<em><b>Receipts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__RECEIPTS = SHIFT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merchant Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT = SHIFT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__VENDOR = SHIFT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__TRANSACTIONS = SHIFT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Merchant Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__MERCHANT_ACCOUNT = SHIFT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT__POSTED = SHIFT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Vendor Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT_FEATURE_COUNT = SHIFT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Vendor Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_SHIFT_OPERATION_COUNT = SHIFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.TransactionImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__USER_ATTRIBUTES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Units Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__SERVICE_UNITS_ERROR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reversed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__REVERSED_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meter Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__METER_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LINE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Receiver Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__RECEIVER_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Donor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DONOR_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Vendor Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__VENDOR_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cashier Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CASHIER_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Auxiliary Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__AUXILIARY_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pricing Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PRICING_STRUCTURE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Service Units Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__SERVICE_UNITS_ENERGY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Customer Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CUSTOMER_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__RECEIPT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Diverse Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DIVERSE_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.ChequeImpl <em>Cheque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.ChequeImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCheque()
	 * @generated
	 */
	int CHEQUE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Micr Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__MICR_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cheque Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__CHEQUE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__KIND = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bank Account Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__BANK_ACCOUNT_DETAIL = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__TENDER = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cheque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Cheque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl <em>Auxiliary Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getAuxiliaryAgreement()
	 * @generated
	 */
	int AUXILIARY_AGREEMENT = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Customer Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aux Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__AUX_CYCLE = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aux Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__AUX_REF = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__SUB_CATEGORY = CommonPackage.AGREEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__MIN_AMOUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vend Portion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__VEND_PORTION = CommonPackage.AGREEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aux Priority Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE = CommonPackage.AGREEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Arrears Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__ARREARS_INTEREST = CommonPackage.AGREEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fixed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__FIXED_AMOUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pay Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__PAY_CYCLE = CommonPackage.AGREEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Auxiliary Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS = CommonPackage.AGREEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Vend Portion Arrear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR = CommonPackage.AGREEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Auxiliary Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Auxiliary Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_AGREEMENT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.ConsumptionTariffIntervalImpl <em>Consumption Tariff Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.ConsumptionTariffIntervalImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getConsumptionTariffInterval()
	 * @generated
	 */
	int CONSUMPTION_TARIFF_INTERVAL = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_TARIFF_INTERVAL__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Tariff Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_TARIFF_INTERVAL__CHARGES = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_TARIFF_INTERVAL__START_VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Consumption Tariff Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_TARIFF_INTERVAL_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Consumption Tariff Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_TARIFF_INTERVAL_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.ReceiptImpl <em>Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.ReceiptImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getReceipt()
	 * @generated
	 */
	int RECEIPT = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__TRANSACTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cashier Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__CASHIER_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__TENDERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vendor Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__VENDOR_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__IS_BANKABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__LINE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.DueImpl <em>Due</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.DueImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getDue()
	 * @generated
	 */
	int DUE = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUE__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUE__INTEREST = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Principle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUE__PRINCIPLE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUE__CURRENT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arrears</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUE__ARREARS = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUE__CHARGES = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Due</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUE_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Due</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUE_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl <em>Bank Account Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getBankAccountDetail()
	 * @generated
	 */
	int BANK_ACCOUNT_DETAIL = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_DETAIL__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_DETAIL__BANK_NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Holder ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_DETAIL__HOLDER_ID = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Branch Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_DETAIL__BRANCH_CODE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_DETAIL__HOLDER_NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bank Account Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_DETAIL_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Bank Account Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_DETAIL_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.LineDetailImpl <em>Line Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.LineDetailImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getLineDetail()
	 * @generated
	 */
	int LINE_DETAIL = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DETAIL__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DETAIL__ROUNDING = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DETAIL__AMOUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DETAIL__DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DETAIL__NOTE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Line Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DETAIL_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Line Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_DETAIL_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl <em>Service Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getServiceSupplier()
	 * @generated
	 */
	int SERVICE_SUPPLIER = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__UUID = CommonPackage.ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__MRID = CommonPackage.ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__NAME = CommonPackage.ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__DESCRIPTION = CommonPackage.ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__PATH_NAME = CommonPackage.ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__MODELING_AUTHORITY_SET = CommonPackage.ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__LOCAL_NAME = CommonPackage.ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__ALIAS_NAME = CommonPackage.ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__STREET_ADDRESS = CommonPackage.ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__ELECTRONIC_ADDRESS = CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__POSTAL_ADDRESS = CommonPackage.ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__PHONE1 = CommonPackage.ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__PHONE2 = CommonPackage.ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__MARKET_ROLES = CommonPackage.ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__BUSINESS_ROLES = CommonPackage.ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bank Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__BANK_ACCOUNTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issuer Identification Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER = CommonPackage.ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__KIND = CommonPackage.ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER_FEATURE_COUNT = CommonPackage.ORGANISATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Service Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SUPPLIER_OPERATION_COUNT = CommonPackage.ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.AccountMovementImpl <em>Account Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.AccountMovementImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getAccountMovement()
	 * @generated
	 */
	int ACCOUNT_MOVEMENT = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MOVEMENT__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MOVEMENT__REASON = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MOVEMENT__AMOUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MOVEMENT__DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Account Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MOVEMENT_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Account Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MOVEMENT_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.PointOfSaleImpl <em>Point Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.PointOfSaleImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getPointOfSale()
	 * @generated
	 */
	int POINT_OF_SALE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__TOKENS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cashier Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__CASHIER_SHIFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE__VENDOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Point Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Point Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl <em>Auxiliary Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getAuxiliaryAccount()
	 * @generated
	 */
	int AUXILIARY_ACCOUNT = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Payment Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Due</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__DUE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Credit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__LAST_CREDIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Principle Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auxiliary Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__CHARGES = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Debit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__LAST_DEBIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT__BALANCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Auxiliary Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Auxiliary Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ACCOUNT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.ChargeImpl <em>Charge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.ChargeImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCharge()
	 * @generated
	 */
	int CHARGE = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Auxiliary Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__AUXILIARY_ACCOUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Charge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__PARENT_CHARGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__CONSUMPTION_TARIFF_INTERVALS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__CHILD_CHARGES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__TIME_TARIFF_INTERVALS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variable Portion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__VARIABLE_PORTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fixed Portion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__FIXED_PORTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.AccountingUnitImpl <em>Accounting Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.AccountingUnitImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getAccountingUnit()
	 * @generated
	 */
	int ACCOUNTING_UNIT = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_UNIT__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Monetary Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_UNIT__MONETARY_UNIT = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_UNIT__ENERGY_UNIT = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_UNIT__VALUE = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_UNIT__MULTIPLIER = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Accounting Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_UNIT_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Accounting Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTING_UNIT_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.TimeTariffIntervalImpl <em>Time Tariff Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.TimeTariffIntervalImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTimeTariffInterval()
	 * @generated
	 */
	int TIME_TARIFF_INTERVAL = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TARIFF_INTERVAL__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TARIFF_INTERVAL__START_DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tariff Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TARIFF_INTERVAL__TARIFF_PROFILES = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TARIFF_INTERVAL__CHARGES = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time Tariff Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TARIFF_INTERVAL_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Time Tariff Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TARIFF_INTERVAL_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl <em>Cashier Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCashierShift()
	 * @generated
	 */
	int CASHIER_SHIFT = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__UUID = SHIFT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__MRID = SHIFT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__NAME = SHIFT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__DESCRIPTION = SHIFT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__PATH_NAME = SHIFT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__MODELING_AUTHORITY_SET = SHIFT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__LOCAL_NAME = SHIFT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__ALIAS_NAME = SHIFT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__TRANSACTIONS_GRAND_TOTAL = SHIFT__TRANSACTIONS_GRAND_TOTAL;

	/**
	 * The feature id for the '<em><b>Activity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__ACTIVITY_INTERVAL = SHIFT__ACTIVITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Transaction Summaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__TRANSACTION_SUMMARIES = SHIFT__TRANSACTION_SUMMARIES;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING = SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING = SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE = SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE = SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE;

	/**
	 * The feature id for the '<em><b>Receipt Summaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__RECEIPT_SUMMARIES = SHIFT__RECEIPT_SUMMARIES;

	/**
	 * The feature id for the '<em><b>Cashier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__CASHIER = SHIFT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point Of Sale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__POINT_OF_SALE = SHIFT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receipts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__RECEIPTS = SHIFT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cash Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__CASH_FLOAT = SHIFT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT__TRANSACTIONS = SHIFT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cashier Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT_FEATURE_COUNT = SHIFT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cashier Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_SHIFT_OPERATION_COUNT = SHIFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl <em>Merchant Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getMerchantAccount()
	 * @generated
	 */
	int MERCHANT_ACCOUNT = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Bank Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__BANK_STATEMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merchant Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__MERCHANT_AGREEMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transactors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__TRANSACTORS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provisional Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__PROVISIONAL_BALANCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__CURRENT_BALANCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vendors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__VENDORS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vendor Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT__VENDOR_SHIFTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Merchant Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Merchant Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_ACCOUNT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.TenderImpl <em>Tender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.TenderImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTender()
	 * @generated
	 */
	int TENDER = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__CHANGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__RECEIPT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cheque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__CHEQUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER__CARD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Tender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENDER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.VendorImpl <em>Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.VendorImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getVendor()
	 * @generated
	 */
	int VENDOR = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Point Of Sales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__POINT_OF_SALES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cashiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__CASHIERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merchant Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MERCHANT_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bank Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__BANK_STATEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vendor Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__VENDOR_SHIFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.impl.CardImpl
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Cv Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CV_NUMBER = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__EXPIRY_DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__PAN = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Account Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ACCOUNT_HOLDER_NAME = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TENDER = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.TransactionKind <em>Transaction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.TransactionKind
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTransactionKind()
	 * @generated
	 */
	int TRANSACTION_KIND = 26;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.SupplierKind <em>Supplier Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.SupplierKind
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getSupplierKind()
	 * @generated
	 */
	int SUPPLIER_KIND = 27;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.ChargeKind <em>Charge Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.ChargeKind
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getChargeKind()
	 * @generated
	 */
	int CHARGE_KIND = 28;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.TenderKind <em>Tender Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.TenderKind
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTenderKind()
	 * @generated
	 */
	int TENDER_KIND = 29;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.CreditKind <em>Credit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.CreditKind
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCreditKind()
	 * @generated
	 */
	int CREDIT_KIND = 30;

	/**
	 * The meta object id for the '{@link CIM.IEC61968.PaymentMetering.ChequeKind <em>Cheque Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61968.PaymentMetering.ChequeKind
	 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getChequeKind()
	 * @generated
	 */
	int CHEQUE_KIND = 31;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Cashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cashier</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cashier
	 * @generated
	 */
	EClass getCashier();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Cashier#getCashierShifts <em>Cashier Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cashier Shifts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cashier#getCashierShifts()
	 * @see #getCashier()
	 * @generated
	 */
	EReference getCashier_CashierShifts();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Cashier#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electronic Address</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cashier#getElectronicAddress()
	 * @see #getCashier()
	 * @generated
	 */
	EReference getCashier_ElectronicAddress();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Cashier#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cashier#getVendor()
	 * @see #getCashier()
	 * @generated
	 */
	EReference getCashier_Vendor();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Transactor <em>Transactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactor</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transactor
	 * @generated
	 */
	EClass getTransactor();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Transactor#getMerchantAccounts <em>Merchant Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merchant Accounts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transactor#getMerchantAccounts()
	 * @see #getTransactor()
	 * @generated
	 */
	EReference getTransactor_MerchantAccounts();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.TariffProfile <em>Tariff Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tariff Profile</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TariffProfile
	 * @generated
	 */
	EClass getTariffProfile();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff Cycle</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TariffProfile#getTariffCycle()
	 * @see #getTariffProfile()
	 * @generated
	 */
	EAttribute getTariffProfile_TariffCycle();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Tariff Intervals</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals()
	 * @see #getTariffProfile()
	 * @generated
	 */
	EReference getTariffProfile_TimeTariffIntervals();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.TariffProfile#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tariffs</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TariffProfile#getTariffs()
	 * @see #getTariffProfile()
	 * @generated
	 */
	EReference getTariffProfile_Tariffs();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumption Tariff Intervals</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals()
	 * @see #getTariffProfile()
	 * @generated
	 */
	EReference getTariffProfile_ConsumptionTariffIntervals();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.MerchantAgreement <em>Merchant Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merchant Agreement</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAgreement
	 * @generated
	 */
	EClass getMerchantAgreement();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts <em>Merchant Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merchant Accounts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts()
	 * @see #getMerchantAgreement()
	 * @generated
	 */
	EReference getMerchantAgreement_MerchantAccounts();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.VendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Shift</em>'.
	 * @see CIM.IEC61968.PaymentMetering.VendorShift
	 * @generated
	 */
	EClass getVendorShift();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.VendorShift#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receipts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.VendorShift#getReceipts()
	 * @see #getVendorShift()
	 * @generated
	 */
	EReference getVendorShift_Receipts();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Debit Amount</em>'.
	 * @see CIM.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount()
	 * @see #getVendorShift()
	 * @generated
	 */
	EAttribute getVendorShift_MerchantDebitAmount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.VendorShift#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor</em>'.
	 * @see CIM.IEC61968.PaymentMetering.VendorShift#getVendor()
	 * @see #getVendorShift()
	 * @generated
	 */
	EReference getVendorShift_Vendor();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.VendorShift#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see CIM.IEC61968.PaymentMetering.VendorShift#getTransactions()
	 * @see #getVendorShift()
	 * @generated
	 */
	EReference getVendorShift_Transactions();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.VendorShift#getMerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merchant Account</em>'.
	 * @see CIM.IEC61968.PaymentMetering.VendorShift#getMerchantAccount()
	 * @see #getVendorShift()
	 * @generated
	 */
	EReference getVendorShift_MerchantAccount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.VendorShift#isPosted <em>Posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted</em>'.
	 * @see CIM.IEC61968.PaymentMetering.VendorShift#isPosted()
	 * @see #getVendorShift()
	 * @generated
	 */
	EAttribute getVendorShift_Posted();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Transaction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getKind()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Kind();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Transaction#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getUserAttributes()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_UserAttributes();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Transaction#getServiceUnitsError <em>Service Units Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Units Error</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getServiceUnitsError()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_ServiceUnitsError();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Transaction#getReversedId <em>Reversed Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reversed Id</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getReversedId()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_ReversedId();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Transaction#getMeterAsset <em>Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Asset</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getMeterAsset()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_MeterAsset();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Transaction#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getLine()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Line();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Transaction#getReceiverReference <em>Receiver Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Reference</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getReceiverReference()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_ReceiverReference();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Transaction#getDonorReference <em>Donor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Donor Reference</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getDonorReference()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_DonorReference();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Transaction#getVendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor Shift</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getVendorShift()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_VendorShift();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Transaction#getCashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cashier Shift</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getCashierShift()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_CashierShift();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auxiliary Account</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_AuxiliaryAccount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Transaction#getPricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pricing Structure</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getPricingStructure()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_PricingStructure();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Units Energy</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_ServiceUnitsEnergy();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Transaction#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Account</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getCustomerAccount()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_CustomerAccount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Transaction#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getReceipt()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Receipt();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Transaction#getDiverseReference <em>Diverse Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diverse Reference</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getDiverseReference()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_DiverseReference();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Cheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cheque</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cheque
	 * @generated
	 */
	EClass getCheque();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Cheque#getMicrNumber <em>Micr Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Micr Number</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cheque#getMicrNumber()
	 * @see #getCheque()
	 * @generated
	 */
	EAttribute getCheque_MicrNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Cheque#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cheque#getDate()
	 * @see #getCheque()
	 * @generated
	 */
	EAttribute getCheque_Date();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Cheque#getChequeNumber <em>Cheque Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cheque Number</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cheque#getChequeNumber()
	 * @see #getCheque()
	 * @generated
	 */
	EAttribute getCheque_ChequeNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Cheque#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cheque#getKind()
	 * @see #getCheque()
	 * @generated
	 */
	EAttribute getCheque_Kind();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Cheque#getBankAccountDetail <em>Bank Account Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank Account Detail</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cheque#getBankAccountDetail()
	 * @see #getCheque()
	 * @generated
	 */
	EReference getCheque_BankAccountDetail();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Cheque#getTender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tender</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Cheque#getTender()
	 * @see #getCheque()
	 * @generated
	 */
	EReference getCheque_Tender();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement <em>Auxiliary Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Agreement</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement
	 * @generated
	 */
	EClass getAuxiliaryAgreement();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Agreement</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EReference getAuxiliaryAgreement_CustomerAgreement();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Cycle</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_AuxCycle();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef <em>Aux Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Ref</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_AuxRef();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Category</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_SubCategory();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Amount</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_MinAmount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vend Portion</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_VendPortion();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Priority Code</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_AuxPriorityCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrears Interest</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_ArrearsInterest();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Amount</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_FixedAmount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay Cycle</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_PayCycle();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary Accounts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EReference getAuxiliaryAgreement_AuxiliaryAccounts();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vend Portion Arrear</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	EAttribute getAuxiliaryAgreement_VendPortionArrear();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Shift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift
	 * @generated
	 */
	EClass getShift();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transactions Grand Total</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_TransactionsGrandTotal();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Shift#getActivityInterval <em>Activity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Interval</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift#getActivityInterval()
	 * @see #getShift()
	 * @generated
	 */
	EReference getShift_ActivityInterval();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Shift#getTransactionSummaries <em>Transaction Summaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transaction Summaries</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift#getTransactionSummaries()
	 * @see #getShift()
	 * @generated
	 */
	EReference getShift_TransactionSummaries();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipts Grand Total Rounding</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_ReceiptsGrandTotalRounding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transactions Grand Total Rounding</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_TransactionsGrandTotalRounding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipts Grand Total Non Bankable</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_ReceiptsGrandTotalNonBankable();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipts Grand Total Bankable</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_ReceiptsGrandTotalBankable();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptSummaries <em>Receipt Summaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receipt Summaries</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Shift#getReceiptSummaries()
	 * @see #getShift()
	 * @generated
	 */
	EReference getShift_ReceiptSummaries();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval <em>Consumption Tariff Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumption Tariff Interval</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval
	 * @generated
	 */
	EClass getConsumptionTariffInterval();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tariff Profiles</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	EReference getConsumptionTariffInterval_TariffProfiles();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	EAttribute getConsumptionTariffInterval_SequenceNumber();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charges</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	EReference getConsumptionTariffInterval_Charges();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue <em>Start Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	EAttribute getConsumptionTariffInterval_StartValue();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Receipt
	 * @generated
	 */
	EClass getReceipt();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Receipt#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Receipt#getTransactions()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Transactions();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Receipt#getCashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cashier Shift</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Receipt#getCashierShift()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_CashierShift();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Receipt#getTenders <em>Tenders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tenders</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Receipt#getTenders()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Tenders();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Receipt#getVendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor Shift</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Receipt#getVendorShift()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_VendorShift();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Receipt#isIsBankable <em>Is Bankable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bankable</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Receipt#isIsBankable()
	 * @see #getReceipt()
	 * @generated
	 */
	EAttribute getReceipt_IsBankable();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Receipt#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Receipt#getLine()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Line();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Due <em>Due</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Due</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Due
	 * @generated
	 */
	EClass getDue();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Due#getInterest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interest</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Due#getInterest()
	 * @see #getDue()
	 * @generated
	 */
	EAttribute getDue_Interest();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Due#getPrinciple <em>Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principle</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Due#getPrinciple()
	 * @see #getDue()
	 * @generated
	 */
	EAttribute getDue_Principle();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Due#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Due#getCurrent()
	 * @see #getDue()
	 * @generated
	 */
	EAttribute getDue_Current();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Due#getArrears <em>Arrears</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrears</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Due#getArrears()
	 * @see #getDue()
	 * @generated
	 */
	EAttribute getDue_Arrears();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Due#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charges</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Due#getCharges()
	 * @see #getDue()
	 * @generated
	 */
	EAttribute getDue_Charges();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail <em>Bank Account Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Account Detail</em>'.
	 * @see CIM.IEC61968.PaymentMetering.BankAccountDetail
	 * @generated
	 */
	EClass getBankAccountDetail();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getBankName <em>Bank Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank Name</em>'.
	 * @see CIM.IEC61968.PaymentMetering.BankAccountDetail#getBankName()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	EAttribute getBankAccountDetail_BankName();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see CIM.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	EAttribute getBankAccountDetail_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getHolderID <em>Holder ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holder ID</em>'.
	 * @see CIM.IEC61968.PaymentMetering.BankAccountDetail#getHolderID()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	EAttribute getBankAccountDetail_HolderID();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode <em>Branch Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Code</em>'.
	 * @see CIM.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	EAttribute getBankAccountDetail_BranchCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getHolderName <em>Holder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holder Name</em>'.
	 * @see CIM.IEC61968.PaymentMetering.BankAccountDetail#getHolderName()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	EAttribute getBankAccountDetail_HolderName();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.LineDetail <em>Line Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Detail</em>'.
	 * @see CIM.IEC61968.PaymentMetering.LineDetail
	 * @generated
	 */
	EClass getLineDetail();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.LineDetail#getRounding <em>Rounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding</em>'.
	 * @see CIM.IEC61968.PaymentMetering.LineDetail#getRounding()
	 * @see #getLineDetail()
	 * @generated
	 */
	EAttribute getLineDetail_Rounding();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.LineDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM.IEC61968.PaymentMetering.LineDetail#getAmount()
	 * @see #getLineDetail()
	 * @generated
	 */
	EAttribute getLineDetail_Amount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.LineDetail#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM.IEC61968.PaymentMetering.LineDetail#getDateTime()
	 * @see #getLineDetail()
	 * @generated
	 */
	EAttribute getLineDetail_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.LineDetail#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see CIM.IEC61968.PaymentMetering.LineDetail#getNote()
	 * @see #getLineDetail()
	 * @generated
	 */
	EAttribute getLineDetail_Note();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.ServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Supplier</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ServiceSupplier
	 * @generated
	 */
	EClass getServiceSupplier();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	EReference getServiceSupplier_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts <em>Bank Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bank Accounts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	EReference getServiceSupplier_BankAccounts();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Identification Number</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	EAttribute getServiceSupplier_IssuerIdentificationNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.ServiceSupplier#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ServiceSupplier#getKind()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	EAttribute getServiceSupplier_Kind();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	EReference getServiceSupplier_CustomerAgreements();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.AccountMovement <em>Account Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Movement</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountMovement
	 * @generated
	 */
	EClass getAccountMovement();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AccountMovement#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountMovement#getReason()
	 * @see #getAccountMovement()
	 * @generated
	 */
	EAttribute getAccountMovement_Reason();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AccountMovement#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountMovement#getAmount()
	 * @see #getAccountMovement()
	 * @generated
	 */
	EAttribute getAccountMovement_Amount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AccountMovement#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountMovement#getDateTime()
	 * @see #getAccountMovement()
	 * @generated
	 */
	EAttribute getAccountMovement_DateTime();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.PointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Of Sale</em>'.
	 * @see CIM.IEC61968.PaymentMetering.PointOfSale
	 * @generated
	 */
	EClass getPointOfSale();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.PointOfSale#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see CIM.IEC61968.PaymentMetering.PointOfSale#getTokens()
	 * @see #getPointOfSale()
	 * @generated
	 */
	EReference getPointOfSale_Tokens();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.PointOfSale#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see CIM.IEC61968.PaymentMetering.PointOfSale#getLocation()
	 * @see #getPointOfSale()
	 * @generated
	 */
	EAttribute getPointOfSale_Location();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cashier Shifts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.PointOfSale#getCashierShifts()
	 * @see #getPointOfSale()
	 * @generated
	 */
	EReference getPointOfSale_CashierShifts();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.PointOfSale#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor</em>'.
	 * @see CIM.IEC61968.PaymentMetering.PointOfSale#getVendor()
	 * @see #getPointOfSale()
	 * @generated
	 */
	EReference getPointOfSale_Vendor();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount <em>Auxiliary Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Account</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount
	 * @generated
	 */
	EClass getAuxiliaryAccount();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Transactions</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	EReference getAuxiliaryAccount_PaymentTransactions();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getDue <em>Due</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Due</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getDue()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	EReference getAuxiliaryAccount_Due();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Credit</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getLastCredit()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	EReference getAuxiliaryAccount_LastCredit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principle Amount</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	EAttribute getAuxiliaryAccount_PrincipleAmount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auxiliary Agreement</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	EReference getAuxiliaryAccount_AuxiliaryAgreement();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charges</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	EReference getAuxiliaryAccount_Charges();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Debit</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getLastDebit()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	EReference getAuxiliaryAccount_LastDebit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	EAttribute getAuxiliaryAccount_Balance();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Charge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge
	 * @generated
	 */
	EClass getCharge();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary Accounts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts()
	 * @see #getCharge()
	 * @generated
	 */
	EReference getCharge_AuxiliaryAccounts();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Charge#getParentCharge <em>Parent Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Charge</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge#getParentCharge()
	 * @see #getCharge()
	 * @generated
	 */
	EReference getCharge_ParentCharge();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumption Tariff Intervals</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals()
	 * @see #getCharge()
	 * @generated
	 */
	EReference getCharge_ConsumptionTariffIntervals();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Charge#getChildCharges <em>Child Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Charges</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge#getChildCharges()
	 * @see #getCharge()
	 * @generated
	 */
	EReference getCharge_ChildCharges();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Charge#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge#getKind()
	 * @see #getCharge()
	 * @generated
	 */
	EAttribute getCharge_Kind();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Tariff Intervals</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals()
	 * @see #getCharge()
	 * @generated
	 */
	EReference getCharge_TimeTariffIntervals();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Charge#getVariablePortion <em>Variable Portion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Portion</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge#getVariablePortion()
	 * @see #getCharge()
	 * @generated
	 */
	EAttribute getCharge_VariablePortion();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Charge#getFixedPortion <em>Fixed Portion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Portion</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Charge#getFixedPortion()
	 * @see #getCharge()
	 * @generated
	 */
	EReference getCharge_FixedPortion();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.AccountingUnit <em>Accounting Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accounting Unit</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountingUnit
	 * @generated
	 */
	EClass getAccountingUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monetary Unit</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit()
	 * @see #getAccountingUnit()
	 * @generated
	 */
	EAttribute getAccountingUnit_MonetaryUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Unit</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit()
	 * @see #getAccountingUnit()
	 * @generated
	 */
	EAttribute getAccountingUnit_EnergyUnit();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AccountingUnit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountingUnit#getValue()
	 * @see #getAccountingUnit()
	 * @generated
	 */
	EAttribute getAccountingUnit_Value();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.AccountingUnit#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see CIM.IEC61968.PaymentMetering.AccountingUnit#getMultiplier()
	 * @see #getAccountingUnit()
	 * @generated
	 */
	EAttribute getAccountingUnit_Multiplier();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.TimeTariffInterval <em>Time Tariff Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Tariff Interval</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TimeTariffInterval
	 * @generated
	 */
	EClass getTimeTariffInterval();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime <em>Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date Time</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	EAttribute getTimeTariffInterval_StartDateTime();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	EAttribute getTimeTariffInterval_SequenceNumber();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tariff Profiles</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	EReference getTimeTariffInterval_TariffProfiles();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.TimeTariffInterval#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charges</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TimeTariffInterval#getCharges()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	EReference getTimeTariffInterval_Charges();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.CashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cashier Shift</em>'.
	 * @see CIM.IEC61968.PaymentMetering.CashierShift
	 * @generated
	 */
	EClass getCashierShift();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.CashierShift#getCashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cashier</em>'.
	 * @see CIM.IEC61968.PaymentMetering.CashierShift#getCashier()
	 * @see #getCashierShift()
	 * @generated
	 */
	EReference getCashierShift_Cashier();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.CashierShift#getPointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Of Sale</em>'.
	 * @see CIM.IEC61968.PaymentMetering.CashierShift#getPointOfSale()
	 * @see #getCashierShift()
	 * @generated
	 */
	EReference getCashierShift_PointOfSale();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.CashierShift#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receipts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.CashierShift#getReceipts()
	 * @see #getCashierShift()
	 * @generated
	 */
	EReference getCashierShift_Receipts();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.CashierShift#getCashFloat <em>Cash Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cash Float</em>'.
	 * @see CIM.IEC61968.PaymentMetering.CashierShift#getCashFloat()
	 * @see #getCashierShift()
	 * @generated
	 */
	EAttribute getCashierShift_CashFloat();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.CashierShift#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see CIM.IEC61968.PaymentMetering.CashierShift#getTransactions()
	 * @see #getCashierShift()
	 * @generated
	 */
	EReference getCashierShift_Transactions();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.MerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merchant Account</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount
	 * @generated
	 */
	EClass getMerchantAccount();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getBankStatements <em>Bank Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bank Statements</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getBankStatements()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	EReference getMerchantAccount_BankStatements();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merchant Agreement</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	EReference getMerchantAccount_MerchantAgreement();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getTransactors <em>Transactors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactors</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getTransactors()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	EReference getMerchantAccount_Transactors();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provisional Balance</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	EAttribute getMerchantAccount_ProvisionalBalance();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance <em>Current Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Balance</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	EAttribute getMerchantAccount_CurrentBalance();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getVendors <em>Vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vendors</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getVendors()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	EReference getMerchantAccount_Vendors();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vendor Shifts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	EReference getMerchantAccount_VendorShifts();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Tender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tender</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Tender
	 * @generated
	 */
	EClass getTender();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Tender#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Tender#getAmount()
	 * @see #getTender()
	 * @generated
	 */
	EAttribute getTender_Amount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Tender#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Tender#getChange()
	 * @see #getTender()
	 * @generated
	 */
	EAttribute getTender_Change();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Tender#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Tender#getKind()
	 * @see #getTender()
	 * @generated
	 */
	EAttribute getTender_Kind();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Tender#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Tender#getReceipt()
	 * @see #getTender()
	 * @generated
	 */
	EReference getTender_Receipt();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Tender#getCheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cheque</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Tender#getCheque()
	 * @see #getTender()
	 * @generated
	 */
	EReference getTender_Cheque();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Tender#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Tender#getCard()
	 * @see #getTender()
	 * @generated
	 */
	EReference getTender_Card();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Vendor
	 * @generated
	 */
	EClass getVendor();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Vendor#getPointOfSales <em>Point Of Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Point Of Sales</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getPointOfSales()
	 * @see #getVendor()
	 * @generated
	 */
	EReference getVendor_PointOfSales();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Vendor#getCashiers <em>Cashiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cashiers</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getCashiers()
	 * @see #getVendor()
	 * @generated
	 */
	EReference getVendor_Cashiers();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Vendor#getMerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merchant Account</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getMerchantAccount()
	 * @see #getVendor()
	 * @generated
	 */
	EReference getVendor_MerchantAccount();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Vendor#getBankStatements <em>Bank Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bank Statements</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getBankStatements()
	 * @see #getVendor()
	 * @generated
	 */
	EReference getVendor_BankStatements();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61968.PaymentMetering.Vendor#getVendorShifts <em>Vendor Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vendor Shifts</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getVendorShifts()
	 * @see #getVendor()
	 * @generated
	 */
	EReference getVendor_VendorShifts();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61968.PaymentMetering.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Card#getCvNumber <em>Cv Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cv Number</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Card#getCvNumber()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CvNumber();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Card#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Card#getExpiryDate()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_ExpiryDate();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Card#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Card#getPan()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Pan();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61968.PaymentMetering.Card#getAccountHolderName <em>Account Holder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Holder Name</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Card#getAccountHolderName()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_AccountHolderName();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61968.PaymentMetering.Card#getTender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tender</em>'.
	 * @see CIM.IEC61968.PaymentMetering.Card#getTender()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Tender();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61968.PaymentMetering.TransactionKind <em>Transaction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TransactionKind
	 * @generated
	 */
	EEnum getTransactionKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61968.PaymentMetering.SupplierKind <em>Supplier Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplier Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.SupplierKind
	 * @generated
	 */
	EEnum getSupplierKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61968.PaymentMetering.ChargeKind <em>Charge Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charge Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ChargeKind
	 * @generated
	 */
	EEnum getChargeKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61968.PaymentMetering.TenderKind <em>Tender Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tender Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.TenderKind
	 * @generated
	 */
	EEnum getTenderKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61968.PaymentMetering.CreditKind <em>Credit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Credit Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.CreditKind
	 * @generated
	 */
	EEnum getCreditKind();

	/**
	 * Returns the meta object for enum '{@link CIM.IEC61968.PaymentMetering.ChequeKind <em>Cheque Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cheque Kind</em>'.
	 * @see CIM.IEC61968.PaymentMetering.ChequeKind
	 * @generated
	 */
	EEnum getChequeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PaymentMeteringFactory getPaymentMeteringFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.CashierImpl <em>Cashier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.CashierImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCashier()
		 * @generated
		 */
		EClass CASHIER = eINSTANCE.getCashier();

		/**
		 * The meta object literal for the '<em><b>Cashier Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASHIER__CASHIER_SHIFTS = eINSTANCE.getCashier_CashierShifts();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASHIER__ELECTRONIC_ADDRESS = eINSTANCE.getCashier_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASHIER__VENDOR = eINSTANCE.getCashier_Vendor();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.TransactorImpl <em>Transactor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.TransactorImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTransactor()
		 * @generated
		 */
		EClass TRANSACTOR = eINSTANCE.getTransactor();

		/**
		 * The meta object literal for the '<em><b>Merchant Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTOR__MERCHANT_ACCOUNTS = eINSTANCE.getTransactor_MerchantAccounts();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.TariffProfileImpl <em>Tariff Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.TariffProfileImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTariffProfile()
		 * @generated
		 */
		EClass TARIFF_PROFILE = eINSTANCE.getTariffProfile();

		/**
		 * The meta object literal for the '<em><b>Tariff Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARIFF_PROFILE__TARIFF_CYCLE = eINSTANCE.getTariffProfile_TariffCycle();

		/**
		 * The meta object literal for the '<em><b>Time Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARIFF_PROFILE__TIME_TARIFF_INTERVALS = eINSTANCE.getTariffProfile_TimeTariffIntervals();

		/**
		 * The meta object literal for the '<em><b>Tariffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARIFF_PROFILE__TARIFFS = eINSTANCE.getTariffProfile_Tariffs();

		/**
		 * The meta object literal for the '<em><b>Consumption Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS = eINSTANCE.getTariffProfile_ConsumptionTariffIntervals();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.MerchantAgreementImpl <em>Merchant Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.MerchantAgreementImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getMerchantAgreement()
		 * @generated
		 */
		EClass MERCHANT_AGREEMENT = eINSTANCE.getMerchantAgreement();

		/**
		 * The meta object literal for the '<em><b>Merchant Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS = eINSTANCE.getMerchantAgreement_MerchantAccounts();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl <em>Vendor Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getVendorShift()
		 * @generated
		 */
		EClass VENDOR_SHIFT = eINSTANCE.getVendorShift();

		/**
		 * The meta object literal for the '<em><b>Receipts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR_SHIFT__RECEIPTS = eINSTANCE.getVendorShift_Receipts();

		/**
		 * The meta object literal for the '<em><b>Merchant Debit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT = eINSTANCE.getVendorShift_MerchantDebitAmount();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR_SHIFT__VENDOR = eINSTANCE.getVendorShift_Vendor();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR_SHIFT__TRANSACTIONS = eINSTANCE.getVendorShift_Transactions();

		/**
		 * The meta object literal for the '<em><b>Merchant Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR_SHIFT__MERCHANT_ACCOUNT = eINSTANCE.getVendorShift_MerchantAccount();

		/**
		 * The meta object literal for the '<em><b>Posted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR_SHIFT__POSTED = eINSTANCE.getVendorShift_Posted();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.TransactionImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__KIND = eINSTANCE.getTransaction_Kind();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__USER_ATTRIBUTES = eINSTANCE.getTransaction_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Service Units Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__SERVICE_UNITS_ERROR = eINSTANCE.getTransaction_ServiceUnitsError();

		/**
		 * The meta object literal for the '<em><b>Reversed Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__REVERSED_ID = eINSTANCE.getTransaction_ReversedId();

		/**
		 * The meta object literal for the '<em><b>Meter Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__METER_ASSET = eINSTANCE.getTransaction_MeterAsset();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__LINE = eINSTANCE.getTransaction_Line();

		/**
		 * The meta object literal for the '<em><b>Receiver Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__RECEIVER_REFERENCE = eINSTANCE.getTransaction_ReceiverReference();

		/**
		 * The meta object literal for the '<em><b>Donor Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DONOR_REFERENCE = eINSTANCE.getTransaction_DonorReference();

		/**
		 * The meta object literal for the '<em><b>Vendor Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__VENDOR_SHIFT = eINSTANCE.getTransaction_VendorShift();

		/**
		 * The meta object literal for the '<em><b>Cashier Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__CASHIER_SHIFT = eINSTANCE.getTransaction_CashierShift();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__AUXILIARY_ACCOUNT = eINSTANCE.getTransaction_AuxiliaryAccount();

		/**
		 * The meta object literal for the '<em><b>Pricing Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__PRICING_STRUCTURE = eINSTANCE.getTransaction_PricingStructure();

		/**
		 * The meta object literal for the '<em><b>Service Units Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__SERVICE_UNITS_ENERGY = eINSTANCE.getTransaction_ServiceUnitsEnergy();

		/**
		 * The meta object literal for the '<em><b>Customer Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__CUSTOMER_ACCOUNT = eINSTANCE.getTransaction_CustomerAccount();

		/**
		 * The meta object literal for the '<em><b>Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__RECEIPT = eINSTANCE.getTransaction_Receipt();

		/**
		 * The meta object literal for the '<em><b>Diverse Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DIVERSE_REFERENCE = eINSTANCE.getTransaction_DiverseReference();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.ChequeImpl <em>Cheque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.ChequeImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCheque()
		 * @generated
		 */
		EClass CHEQUE = eINSTANCE.getCheque();

		/**
		 * The meta object literal for the '<em><b>Micr Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE__MICR_NUMBER = eINSTANCE.getCheque_MicrNumber();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE__DATE = eINSTANCE.getCheque_Date();

		/**
		 * The meta object literal for the '<em><b>Cheque Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE__CHEQUE_NUMBER = eINSTANCE.getCheque_ChequeNumber();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE__KIND = eINSTANCE.getCheque_Kind();

		/**
		 * The meta object literal for the '<em><b>Bank Account Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE__BANK_ACCOUNT_DETAIL = eINSTANCE.getCheque_BankAccountDetail();

		/**
		 * The meta object literal for the '<em><b>Tender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE__TENDER = eINSTANCE.getCheque_Tender();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl <em>Auxiliary Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.AuxiliaryAgreementImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getAuxiliaryAgreement()
		 * @generated
		 */
		EClass AUXILIARY_AGREEMENT = eINSTANCE.getAuxiliaryAgreement();

		/**
		 * The meta object literal for the '<em><b>Customer Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT = eINSTANCE.getAuxiliaryAgreement_CustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>Aux Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__AUX_CYCLE = eINSTANCE.getAuxiliaryAgreement_AuxCycle();

		/**
		 * The meta object literal for the '<em><b>Aux Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__AUX_REF = eINSTANCE.getAuxiliaryAgreement_AuxRef();

		/**
		 * The meta object literal for the '<em><b>Sub Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__SUB_CATEGORY = eINSTANCE.getAuxiliaryAgreement_SubCategory();

		/**
		 * The meta object literal for the '<em><b>Min Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__MIN_AMOUNT = eINSTANCE.getAuxiliaryAgreement_MinAmount();

		/**
		 * The meta object literal for the '<em><b>Vend Portion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__VEND_PORTION = eINSTANCE.getAuxiliaryAgreement_VendPortion();

		/**
		 * The meta object literal for the '<em><b>Aux Priority Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE = eINSTANCE.getAuxiliaryAgreement_AuxPriorityCode();

		/**
		 * The meta object literal for the '<em><b>Arrears Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__ARREARS_INTEREST = eINSTANCE.getAuxiliaryAgreement_ArrearsInterest();

		/**
		 * The meta object literal for the '<em><b>Fixed Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__FIXED_AMOUNT = eINSTANCE.getAuxiliaryAgreement_FixedAmount();

		/**
		 * The meta object literal for the '<em><b>Pay Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__PAY_CYCLE = eINSTANCE.getAuxiliaryAgreement_PayCycle();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS = eINSTANCE.getAuxiliaryAgreement_AuxiliaryAccounts();

		/**
		 * The meta object literal for the '<em><b>Vend Portion Arrear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR = eINSTANCE.getAuxiliaryAgreement_VendPortionArrear();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.ShiftImpl <em>Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.ShiftImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getShift()
		 * @generated
		 */
		EClass SHIFT = eINSTANCE.getShift();

		/**
		 * The meta object literal for the '<em><b>Transactions Grand Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__TRANSACTIONS_GRAND_TOTAL = eINSTANCE.getShift_TransactionsGrandTotal();

		/**
		 * The meta object literal for the '<em><b>Activity Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT__ACTIVITY_INTERVAL = eINSTANCE.getShift_ActivityInterval();

		/**
		 * The meta object literal for the '<em><b>Transaction Summaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT__TRANSACTION_SUMMARIES = eINSTANCE.getShift_TransactionSummaries();

		/**
		 * The meta object literal for the '<em><b>Receipts Grand Total Rounding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING = eINSTANCE.getShift_ReceiptsGrandTotalRounding();

		/**
		 * The meta object literal for the '<em><b>Transactions Grand Total Rounding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING = eINSTANCE.getShift_TransactionsGrandTotalRounding();

		/**
		 * The meta object literal for the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE = eINSTANCE.getShift_ReceiptsGrandTotalNonBankable();

		/**
		 * The meta object literal for the '<em><b>Receipts Grand Total Bankable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE = eINSTANCE.getShift_ReceiptsGrandTotalBankable();

		/**
		 * The meta object literal for the '<em><b>Receipt Summaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT__RECEIPT_SUMMARIES = eINSTANCE.getShift_ReceiptSummaries();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.ConsumptionTariffIntervalImpl <em>Consumption Tariff Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.ConsumptionTariffIntervalImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getConsumptionTariffInterval()
		 * @generated
		 */
		EClass CONSUMPTION_TARIFF_INTERVAL = eINSTANCE.getConsumptionTariffInterval();

		/**
		 * The meta object literal for the '<em><b>Tariff Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES = eINSTANCE.getConsumptionTariffInterval_TariffProfiles();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER = eINSTANCE.getConsumptionTariffInterval_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMPTION_TARIFF_INTERVAL__CHARGES = eINSTANCE.getConsumptionTariffInterval_Charges();

		/**
		 * The meta object literal for the '<em><b>Start Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMPTION_TARIFF_INTERVAL__START_VALUE = eINSTANCE.getConsumptionTariffInterval_StartValue();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.ReceiptImpl <em>Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.ReceiptImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getReceipt()
		 * @generated
		 */
		EClass RECEIPT = eINSTANCE.getReceipt();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__TRANSACTIONS = eINSTANCE.getReceipt_Transactions();

		/**
		 * The meta object literal for the '<em><b>Cashier Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__CASHIER_SHIFT = eINSTANCE.getReceipt_CashierShift();

		/**
		 * The meta object literal for the '<em><b>Tenders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__TENDERS = eINSTANCE.getReceipt_Tenders();

		/**
		 * The meta object literal for the '<em><b>Vendor Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__VENDOR_SHIFT = eINSTANCE.getReceipt_VendorShift();

		/**
		 * The meta object literal for the '<em><b>Is Bankable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT__IS_BANKABLE = eINSTANCE.getReceipt_IsBankable();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__LINE = eINSTANCE.getReceipt_Line();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.DueImpl <em>Due</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.DueImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getDue()
		 * @generated
		 */
		EClass DUE = eINSTANCE.getDue();

		/**
		 * The meta object literal for the '<em><b>Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUE__INTEREST = eINSTANCE.getDue_Interest();

		/**
		 * The meta object literal for the '<em><b>Principle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUE__PRINCIPLE = eINSTANCE.getDue_Principle();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUE__CURRENT = eINSTANCE.getDue_Current();

		/**
		 * The meta object literal for the '<em><b>Arrears</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUE__ARREARS = eINSTANCE.getDue_Arrears();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUE__CHARGES = eINSTANCE.getDue_Charges();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl <em>Bank Account Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getBankAccountDetail()
		 * @generated
		 */
		EClass BANK_ACCOUNT_DETAIL = eINSTANCE.getBankAccountDetail();

		/**
		 * The meta object literal for the '<em><b>Bank Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT_DETAIL__BANK_NAME = eINSTANCE.getBankAccountDetail_BankName();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER = eINSTANCE.getBankAccountDetail_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>Holder ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT_DETAIL__HOLDER_ID = eINSTANCE.getBankAccountDetail_HolderID();

		/**
		 * The meta object literal for the '<em><b>Branch Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT_DETAIL__BRANCH_CODE = eINSTANCE.getBankAccountDetail_BranchCode();

		/**
		 * The meta object literal for the '<em><b>Holder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT_DETAIL__HOLDER_NAME = eINSTANCE.getBankAccountDetail_HolderName();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.LineDetailImpl <em>Line Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.LineDetailImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getLineDetail()
		 * @generated
		 */
		EClass LINE_DETAIL = eINSTANCE.getLineDetail();

		/**
		 * The meta object literal for the '<em><b>Rounding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_DETAIL__ROUNDING = eINSTANCE.getLineDetail_Rounding();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_DETAIL__AMOUNT = eINSTANCE.getLineDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_DETAIL__DATE_TIME = eINSTANCE.getLineDetail_DateTime();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_DETAIL__NOTE = eINSTANCE.getLineDetail_Note();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl <em>Service Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getServiceSupplier()
		 * @generated
		 */
		EClass SERVICE_SUPPLIER = eINSTANCE.getServiceSupplier();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS = eINSTANCE.getServiceSupplier_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Bank Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SUPPLIER__BANK_ACCOUNTS = eINSTANCE.getServiceSupplier_BankAccounts();

		/**
		 * The meta object literal for the '<em><b>Issuer Identification Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER = eINSTANCE.getServiceSupplier_IssuerIdentificationNumber();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SUPPLIER__KIND = eINSTANCE.getServiceSupplier_Kind();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS = eINSTANCE.getServiceSupplier_CustomerAgreements();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.AccountMovementImpl <em>Account Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.AccountMovementImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getAccountMovement()
		 * @generated
		 */
		EClass ACCOUNT_MOVEMENT = eINSTANCE.getAccountMovement();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_MOVEMENT__REASON = eINSTANCE.getAccountMovement_Reason();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_MOVEMENT__AMOUNT = eINSTANCE.getAccountMovement_Amount();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_MOVEMENT__DATE_TIME = eINSTANCE.getAccountMovement_DateTime();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.PointOfSaleImpl <em>Point Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.PointOfSaleImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getPointOfSale()
		 * @generated
		 */
		EClass POINT_OF_SALE = eINSTANCE.getPointOfSale();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_OF_SALE__TOKENS = eINSTANCE.getPointOfSale_Tokens();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_OF_SALE__LOCATION = eINSTANCE.getPointOfSale_Location();

		/**
		 * The meta object literal for the '<em><b>Cashier Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_OF_SALE__CASHIER_SHIFTS = eINSTANCE.getPointOfSale_CashierShifts();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_OF_SALE__VENDOR = eINSTANCE.getPointOfSale_Vendor();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl <em>Auxiliary Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getAuxiliaryAccount()
		 * @generated
		 */
		EClass AUXILIARY_ACCOUNT = eINSTANCE.getAuxiliaryAccount();

		/**
		 * The meta object literal for the '<em><b>Payment Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS = eINSTANCE.getAuxiliaryAccount_PaymentTransactions();

		/**
		 * The meta object literal for the '<em><b>Due</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_ACCOUNT__DUE = eINSTANCE.getAuxiliaryAccount_Due();

		/**
		 * The meta object literal for the '<em><b>Last Credit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_ACCOUNT__LAST_CREDIT = eINSTANCE.getAuxiliaryAccount_LastCredit();

		/**
		 * The meta object literal for the '<em><b>Principle Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT = eINSTANCE.getAuxiliaryAccount_PrincipleAmount();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT = eINSTANCE.getAuxiliaryAccount_AuxiliaryAgreement();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_ACCOUNT__CHARGES = eINSTANCE.getAuxiliaryAccount_Charges();

		/**
		 * The meta object literal for the '<em><b>Last Debit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_ACCOUNT__LAST_DEBIT = eINSTANCE.getAuxiliaryAccount_LastDebit();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_ACCOUNT__BALANCE = eINSTANCE.getAuxiliaryAccount_Balance();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.ChargeImpl <em>Charge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.ChargeImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCharge()
		 * @generated
		 */
		EClass CHARGE = eINSTANCE.getCharge();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE__AUXILIARY_ACCOUNTS = eINSTANCE.getCharge_AuxiliaryAccounts();

		/**
		 * The meta object literal for the '<em><b>Parent Charge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE__PARENT_CHARGE = eINSTANCE.getCharge_ParentCharge();

		/**
		 * The meta object literal for the '<em><b>Consumption Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE__CONSUMPTION_TARIFF_INTERVALS = eINSTANCE.getCharge_ConsumptionTariffIntervals();

		/**
		 * The meta object literal for the '<em><b>Child Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE__CHILD_CHARGES = eINSTANCE.getCharge_ChildCharges();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE__KIND = eINSTANCE.getCharge_Kind();

		/**
		 * The meta object literal for the '<em><b>Time Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE__TIME_TARIFF_INTERVALS = eINSTANCE.getCharge_TimeTariffIntervals();

		/**
		 * The meta object literal for the '<em><b>Variable Portion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE__VARIABLE_PORTION = eINSTANCE.getCharge_VariablePortion();

		/**
		 * The meta object literal for the '<em><b>Fixed Portion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE__FIXED_PORTION = eINSTANCE.getCharge_FixedPortion();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.AccountingUnitImpl <em>Accounting Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.AccountingUnitImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getAccountingUnit()
		 * @generated
		 */
		EClass ACCOUNTING_UNIT = eINSTANCE.getAccountingUnit();

		/**
		 * The meta object literal for the '<em><b>Monetary Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_UNIT__MONETARY_UNIT = eINSTANCE.getAccountingUnit_MonetaryUnit();

		/**
		 * The meta object literal for the '<em><b>Energy Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_UNIT__ENERGY_UNIT = eINSTANCE.getAccountingUnit_EnergyUnit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_UNIT__VALUE = eINSTANCE.getAccountingUnit_Value();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNTING_UNIT__MULTIPLIER = eINSTANCE.getAccountingUnit_Multiplier();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.TimeTariffIntervalImpl <em>Time Tariff Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.TimeTariffIntervalImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTimeTariffInterval()
		 * @generated
		 */
		EClass TIME_TARIFF_INTERVAL = eINSTANCE.getTimeTariffInterval();

		/**
		 * The meta object literal for the '<em><b>Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TARIFF_INTERVAL__START_DATE_TIME = eINSTANCE.getTimeTariffInterval_StartDateTime();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER = eINSTANCE.getTimeTariffInterval_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Tariff Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_TARIFF_INTERVAL__TARIFF_PROFILES = eINSTANCE.getTimeTariffInterval_TariffProfiles();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_TARIFF_INTERVAL__CHARGES = eINSTANCE.getTimeTariffInterval_Charges();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl <em>Cashier Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCashierShift()
		 * @generated
		 */
		EClass CASHIER_SHIFT = eINSTANCE.getCashierShift();

		/**
		 * The meta object literal for the '<em><b>Cashier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASHIER_SHIFT__CASHIER = eINSTANCE.getCashierShift_Cashier();

		/**
		 * The meta object literal for the '<em><b>Point Of Sale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASHIER_SHIFT__POINT_OF_SALE = eINSTANCE.getCashierShift_PointOfSale();

		/**
		 * The meta object literal for the '<em><b>Receipts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASHIER_SHIFT__RECEIPTS = eINSTANCE.getCashierShift_Receipts();

		/**
		 * The meta object literal for the '<em><b>Cash Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASHIER_SHIFT__CASH_FLOAT = eINSTANCE.getCashierShift_CashFloat();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASHIER_SHIFT__TRANSACTIONS = eINSTANCE.getCashierShift_Transactions();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl <em>Merchant Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getMerchantAccount()
		 * @generated
		 */
		EClass MERCHANT_ACCOUNT = eINSTANCE.getMerchantAccount();

		/**
		 * The meta object literal for the '<em><b>Bank Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERCHANT_ACCOUNT__BANK_STATEMENTS = eINSTANCE.getMerchantAccount_BankStatements();

		/**
		 * The meta object literal for the '<em><b>Merchant Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERCHANT_ACCOUNT__MERCHANT_AGREEMENT = eINSTANCE.getMerchantAccount_MerchantAgreement();

		/**
		 * The meta object literal for the '<em><b>Transactors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERCHANT_ACCOUNT__TRANSACTORS = eINSTANCE.getMerchantAccount_Transactors();

		/**
		 * The meta object literal for the '<em><b>Provisional Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERCHANT_ACCOUNT__PROVISIONAL_BALANCE = eINSTANCE.getMerchantAccount_ProvisionalBalance();

		/**
		 * The meta object literal for the '<em><b>Current Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERCHANT_ACCOUNT__CURRENT_BALANCE = eINSTANCE.getMerchantAccount_CurrentBalance();

		/**
		 * The meta object literal for the '<em><b>Vendors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERCHANT_ACCOUNT__VENDORS = eINSTANCE.getMerchantAccount_Vendors();

		/**
		 * The meta object literal for the '<em><b>Vendor Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERCHANT_ACCOUNT__VENDOR_SHIFTS = eINSTANCE.getMerchantAccount_VendorShifts();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.TenderImpl <em>Tender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.TenderImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTender()
		 * @generated
		 */
		EClass TENDER = eINSTANCE.getTender();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENDER__AMOUNT = eINSTANCE.getTender_Amount();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENDER__CHANGE = eINSTANCE.getTender_Change();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENDER__KIND = eINSTANCE.getTender_Kind();

		/**
		 * The meta object literal for the '<em><b>Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENDER__RECEIPT = eINSTANCE.getTender_Receipt();

		/**
		 * The meta object literal for the '<em><b>Cheque</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENDER__CHEQUE = eINSTANCE.getTender_Cheque();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENDER__CARD = eINSTANCE.getTender_Card();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.VendorImpl <em>Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.VendorImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getVendor()
		 * @generated
		 */
		EClass VENDOR = eINSTANCE.getVendor();

		/**
		 * The meta object literal for the '<em><b>Point Of Sales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR__POINT_OF_SALES = eINSTANCE.getVendor_PointOfSales();

		/**
		 * The meta object literal for the '<em><b>Cashiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR__CASHIERS = eINSTANCE.getVendor_Cashiers();

		/**
		 * The meta object literal for the '<em><b>Merchant Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR__MERCHANT_ACCOUNT = eINSTANCE.getVendor_MerchantAccount();

		/**
		 * The meta object literal for the '<em><b>Bank Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR__BANK_STATEMENTS = eINSTANCE.getVendor_BankStatements();

		/**
		 * The meta object literal for the '<em><b>Vendor Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR__VENDOR_SHIFTS = eINSTANCE.getVendor_VendorShifts();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.impl.CardImpl
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Cv Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CV_NUMBER = eINSTANCE.getCard_CvNumber();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__EXPIRY_DATE = eINSTANCE.getCard_ExpiryDate();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__PAN = eINSTANCE.getCard_Pan();

		/**
		 * The meta object literal for the '<em><b>Account Holder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__ACCOUNT_HOLDER_NAME = eINSTANCE.getCard_AccountHolderName();

		/**
		 * The meta object literal for the '<em><b>Tender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__TENDER = eINSTANCE.getCard_Tender();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.TransactionKind <em>Transaction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.TransactionKind
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTransactionKind()
		 * @generated
		 */
		EEnum TRANSACTION_KIND = eINSTANCE.getTransactionKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.SupplierKind <em>Supplier Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.SupplierKind
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getSupplierKind()
		 * @generated
		 */
		EEnum SUPPLIER_KIND = eINSTANCE.getSupplierKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.ChargeKind <em>Charge Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.ChargeKind
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getChargeKind()
		 * @generated
		 */
		EEnum CHARGE_KIND = eINSTANCE.getChargeKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.TenderKind <em>Tender Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.TenderKind
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getTenderKind()
		 * @generated
		 */
		EEnum TENDER_KIND = eINSTANCE.getTenderKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.CreditKind <em>Credit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.CreditKind
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getCreditKind()
		 * @generated
		 */
		EEnum CREDIT_KIND = eINSTANCE.getCreditKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61968.PaymentMetering.ChequeKind <em>Cheque Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61968.PaymentMetering.ChequeKind
		 * @see CIM.IEC61968.PaymentMetering.impl.PaymentMeteringPackageImpl#getChequeKind()
		 * @generated
		 */
		EEnum CHEQUE_KIND = eINSTANCE.getChequeKind();

	}

} //PaymentMeteringPackage
