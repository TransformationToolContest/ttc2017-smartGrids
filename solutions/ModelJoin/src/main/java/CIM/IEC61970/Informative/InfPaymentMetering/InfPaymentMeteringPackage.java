/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering;

import CIM.CIMPackage;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61970.Core.CorePackage;

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
 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringFactory
 * @model kind="package"
 * @generated
 */
public interface InfPaymentMeteringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfPaymentMetering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfPaymentMetering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfPaymentMetering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfPaymentMeteringPackage eINSTANCE = CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TSPAgreementImpl <em>TSP Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.TSPAgreementImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getTSPAgreement()
	 * @generated
	 */
	int TSP_AGREEMENT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__DESCRIPTION = CommonPackage.AGREEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__PATH_NAME = CommonPackage.AGREEMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__LOCAL_NAME = CommonPackage.AGREEMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The number of structural features of the '<em>TSP Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TSP Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSP_AGREEMENT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.ReceiptSummaryImpl <em>Receipt Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.ReceiptSummaryImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getReceiptSummary()
	 * @generated
	 */
	int RECEIPT_SUMMARY = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_SUMMARY__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_SUMMARY__LINE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tender Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_SUMMARY__TENDER_KIND = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_SUMMARY__SHIFT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Receipt Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_SUMMARY_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Receipt Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_SUMMARY_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TransactionSummaryImpl <em>Transaction Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.TransactionSummaryImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getTransactionSummary()
	 * @generated
	 */
	int TRANSACTION_SUMMARY = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Transaction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY__TRANSACTION_KIND = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY__LINE = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY__SHIFT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transaction Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transaction Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl <em>Bank Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getBankStatement()
	 * @generated
	 */
	int BANK_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__DESCRIPTION = CommonPackage.DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__PATH_NAME = CommonPackage.DOCUMENT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__LOCAL_NAME = CommonPackage.DOCUMENT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Merchant Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__MERCHANT_CREDIT_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bank Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__BANK_ACCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deposit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__DEPOSIT_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deposit Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__DEPOSIT_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Merchant Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__MERCHANT_ACCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__VENDOR = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT__POSTED = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Bank Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Bank Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_STATEMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl <em>SDP Accounting Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getSDPAccountingFunction()
	 * @generated
	 */
	int SDP_ACCOUNTING_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__UUID = MeteringPackage.DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__MRID = MeteringPackage.DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__NAME = MeteringPackage.DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__DESCRIPTION = MeteringPackage.DEVICE_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__PATH_NAME = MeteringPackage.DEVICE_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__MODELING_AUTHORITY_SET = MeteringPackage.DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__LOCAL_NAME = MeteringPackage.DEVICE_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__ALIAS_NAME = MeteringPackage.DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__HARDWARE_ID = MeteringPackage.DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__PROGRAM_ID = MeteringPackage.DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__FIRMWARE_ID = MeteringPackage.DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__ASSET = MeteringPackage.DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__PASSWORD = MeteringPackage.DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__CONFIG_ID = MeteringPackage.DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__COM_EQUIPMENT_ASSET = MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__DISABLED = MeteringPackage.DEVICE_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__END_DEVICE_ASSET = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__END_DEVICE_EVENTS = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__REGISTERS = MeteringPackage.DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Available Credit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__AVAILABLE_CREDIT = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Credit Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charge Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Credit Warning Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__LOW_CREDIT_WARNING_LEVEL = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Credit Expiry Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__CREDIT_EXPIRY_LEVEL = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION__SERVICE_KIND = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>SDP Accounting Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION_FEATURE_COUNT = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>SDP Accounting Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_ACCOUNTING_FUNCTION_OPERATION_COUNT = MeteringPackage.DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.CreditRegisterImpl <em>Credit Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.CreditRegisterImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getCreditRegister()
	 * @generated
	 */
	int CREDIT_REGISTER = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__CREDIT_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Credit Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__CREDIT_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SDP Accounting Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Credit Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Credit Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REGISTER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.ChargeRegisterImpl <em>Charge Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.ChargeRegisterImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getChargeRegister()
	 * @generated
	 */
	int CHARGE_REGISTER = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Charge Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__CHARGE_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SP Accounting Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charge Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER__CHARGE_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Charge Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Charge Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_REGISTER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.BankImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__UUID = CommonPackage.ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__MRID = CommonPackage.ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__NAME = CommonPackage.ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__DESCRIPTION = CommonPackage.ORGANISATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__PATH_NAME = CommonPackage.ORGANISATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__MODELING_AUTHORITY_SET = CommonPackage.ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__LOCAL_NAME = CommonPackage.ORGANISATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ALIAS_NAME = CommonPackage.ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__STREET_ADDRESS = CommonPackage.ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ELECTRONIC_ADDRESS = CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__POSTAL_ADDRESS = CommonPackage.ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__PHONE1 = CommonPackage.ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__PHONE2 = CommonPackage.ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Market Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__MARKET_ROLES = CommonPackage.ORGANISATION__MARKET_ROLES;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__BUSINESS_ROLES = CommonPackage.ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Bank Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__BANK_ACCOUNTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branch Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__BRANCH_CODE = CommonPackage.ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__BIC = CommonPackage.ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__IBAN = CommonPackage.ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = CommonPackage.ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = CommonPackage.ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.TokenImpl
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Point Of Sale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__POINT_OF_SALE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__COMMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.TSPAgreement <em>TSP Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSP Agreement</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.TSPAgreement
	 * @generated
	 */
	EClass getTSPAgreement();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary <em>Receipt Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt Summary</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary
	 * @generated
	 */
	EClass getReceiptSummary();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getLine()
	 * @see #getReceiptSummary()
	 * @generated
	 */
	EReference getReceiptSummary_Line();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getTenderKind <em>Tender Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tender Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getTenderKind()
	 * @see #getReceiptSummary()
	 * @generated
	 */
	EAttribute getReceiptSummary_TenderKind();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shift</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getShift()
	 * @see #getReceiptSummary()
	 * @generated
	 */
	EReference getReceiptSummary_Shift();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary <em>Transaction Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Summary</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary
	 * @generated
	 */
	EClass getTransactionSummary();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getTransactionKind <em>Transaction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getTransactionKind()
	 * @see #getTransactionSummary()
	 * @generated
	 */
	EAttribute getTransactionSummary_TransactionKind();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getLine()
	 * @see #getTransactionSummary()
	 * @generated
	 */
	EReference getTransactionSummary_Line();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shift</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getShift()
	 * @see #getTransactionSummary()
	 * @generated
	 */
	EReference getTransactionSummary_Shift();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement <em>Bank Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Statement</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement
	 * @generated
	 */
	EClass getBankStatement();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantCreditAmount <em>Merchant Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Credit Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantCreditAmount()
	 * @see #getBankStatement()
	 * @generated
	 */
	EAttribute getBankStatement_MerchantCreditAmount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getBankAccount <em>Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank Account</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getBankAccount()
	 * @see #getBankStatement()
	 * @generated
	 */
	EReference getBankStatement_BankAccount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getDepositAmount <em>Deposit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deposit Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getDepositAmount()
	 * @see #getBankStatement()
	 * @generated
	 */
	EAttribute getBankStatement_DepositAmount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getDepositDateTime <em>Deposit Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deposit Date Time</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getDepositDateTime()
	 * @see #getBankStatement()
	 * @generated
	 */
	EAttribute getBankStatement_DepositDateTime();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merchant Account</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantAccount()
	 * @see #getBankStatement()
	 * @generated
	 */
	EReference getBankStatement_MerchantAccount();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getVendor()
	 * @see #getBankStatement()
	 * @generated
	 */
	EReference getBankStatement_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#isPosted <em>Posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#isPosted()
	 * @see #getBankStatement()
	 * @generated
	 */
	EAttribute getBankStatement_Posted();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction <em>SDP Accounting Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDP Accounting Function</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction
	 * @generated
	 */
	EClass getSDPAccountingFunction();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getAvailableCredit <em>Available Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Available Credit</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getAvailableCredit()
	 * @see #getSDPAccountingFunction()
	 * @generated
	 */
	EReference getSDPAccountingFunction_AvailableCredit();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditRegisters <em>Credit Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Credit Registers</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditRegisters()
	 * @see #getSDPAccountingFunction()
	 * @generated
	 */
	EReference getSDPAccountingFunction_CreditRegisters();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getChargeRegisters <em>Charge Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charge Registers</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getChargeRegisters()
	 * @see #getSDPAccountingFunction()
	 * @generated
	 */
	EReference getSDPAccountingFunction_ChargeRegisters();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getLowCreditWarningLevel <em>Low Credit Warning Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Low Credit Warning Level</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getLowCreditWarningLevel()
	 * @see #getSDPAccountingFunction()
	 * @generated
	 */
	EReference getSDPAccountingFunction_LowCreditWarningLevel();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditExpiryLevel <em>Credit Expiry Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Expiry Level</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditExpiryLevel()
	 * @see #getSDPAccountingFunction()
	 * @generated
	 */
	EReference getSDPAccountingFunction_CreditExpiryLevel();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getServiceKind <em>Service Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getServiceKind()
	 * @see #getSDPAccountingFunction()
	 * @generated
	 */
	EReference getSDPAccountingFunction_ServiceKind();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister <em>Credit Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Register</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister
	 * @generated
	 */
	EClass getCreditRegister();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getCreditAmount()
	 * @see #getCreditRegister()
	 * @generated
	 */
	EReference getCreditRegister_CreditAmount();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getCreditKind <em>Credit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getCreditKind()
	 * @see #getCreditRegister()
	 * @generated
	 */
	EAttribute getCreditRegister_CreditKind();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getSDPAccountingFunction <em>SDP Accounting Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SDP Accounting Function</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getSDPAccountingFunction()
	 * @see #getCreditRegister()
	 * @generated
	 */
	EReference getCreditRegister_SDPAccountingFunction();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister <em>Charge Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge Register</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister
	 * @generated
	 */
	EClass getChargeRegister();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getChargeKind <em>Charge Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Kind</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getChargeKind()
	 * @see #getChargeRegister()
	 * @generated
	 */
	EAttribute getChargeRegister_ChargeKind();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getSPAccountingFunction <em>SP Accounting Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SP Accounting Function</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getSPAccountingFunction()
	 * @see #getChargeRegister()
	 * @generated
	 */
	EReference getChargeRegister_SPAccountingFunction();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getChargeAmount <em>Charge Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Charge Amount</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getChargeAmount()
	 * @see #getChargeRegister()
	 * @generated
	 */
	EReference getChargeRegister_ChargeAmount();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBankAccounts <em>Bank Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bank Accounts</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBankAccounts()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_BankAccounts();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBranchCode <em>Branch Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Code</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBranchCode()
	 * @see #getBank()
	 * @generated
	 */
	EAttribute getBank_BranchCode();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBic <em>Bic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bic</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBic()
	 * @see #getBank()
	 * @generated
	 */
	EAttribute getBank_Bic();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getIban <em>Iban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iban</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Bank#getIban()
	 * @see #getBank()
	 * @generated
	 */
	EAttribute getBank_Iban();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfPaymentMetering.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link CIM.IEC61970.Informative.InfPaymentMetering.Token#getPointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Of Sale</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Token#getPointOfSale()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_PointOfSale();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.Token#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Token#getComment()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Comment();

	/**
	 * Returns the meta object for the attribute '{@link CIM.IEC61970.Informative.InfPaymentMetering.Token#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Token#getCode()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Code();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfPaymentMeteringFactory getInfPaymentMeteringFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TSPAgreementImpl <em>TSP Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.TSPAgreementImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getTSPAgreement()
		 * @generated
		 */
		EClass TSP_AGREEMENT = eINSTANCE.getTSPAgreement();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.ReceiptSummaryImpl <em>Receipt Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.ReceiptSummaryImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getReceiptSummary()
		 * @generated
		 */
		EClass RECEIPT_SUMMARY = eINSTANCE.getReceiptSummary();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT_SUMMARY__LINE = eINSTANCE.getReceiptSummary_Line();

		/**
		 * The meta object literal for the '<em><b>Tender Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT_SUMMARY__TENDER_KIND = eINSTANCE.getReceiptSummary_TenderKind();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT_SUMMARY__SHIFT = eINSTANCE.getReceiptSummary_Shift();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TransactionSummaryImpl <em>Transaction Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.TransactionSummaryImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getTransactionSummary()
		 * @generated
		 */
		EClass TRANSACTION_SUMMARY = eINSTANCE.getTransactionSummary();

		/**
		 * The meta object literal for the '<em><b>Transaction Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_SUMMARY__TRANSACTION_KIND = eINSTANCE.getTransactionSummary_TransactionKind();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_SUMMARY__LINE = eINSTANCE.getTransactionSummary_Line();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_SUMMARY__SHIFT = eINSTANCE.getTransactionSummary_Shift();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl <em>Bank Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getBankStatement()
		 * @generated
		 */
		EClass BANK_STATEMENT = eINSTANCE.getBankStatement();

		/**
		 * The meta object literal for the '<em><b>Merchant Credit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_STATEMENT__MERCHANT_CREDIT_AMOUNT = eINSTANCE.getBankStatement_MerchantCreditAmount();

		/**
		 * The meta object literal for the '<em><b>Bank Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_STATEMENT__BANK_ACCOUNT = eINSTANCE.getBankStatement_BankAccount();

		/**
		 * The meta object literal for the '<em><b>Deposit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_STATEMENT__DEPOSIT_AMOUNT = eINSTANCE.getBankStatement_DepositAmount();

		/**
		 * The meta object literal for the '<em><b>Deposit Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_STATEMENT__DEPOSIT_DATE_TIME = eINSTANCE.getBankStatement_DepositDateTime();

		/**
		 * The meta object literal for the '<em><b>Merchant Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_STATEMENT__MERCHANT_ACCOUNT = eINSTANCE.getBankStatement_MerchantAccount();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_STATEMENT__VENDOR = eINSTANCE.getBankStatement_Vendor();

		/**
		 * The meta object literal for the '<em><b>Posted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_STATEMENT__POSTED = eINSTANCE.getBankStatement_Posted();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl <em>SDP Accounting Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getSDPAccountingFunction()
		 * @generated
		 */
		EClass SDP_ACCOUNTING_FUNCTION = eINSTANCE.getSDPAccountingFunction();

		/**
		 * The meta object literal for the '<em><b>Available Credit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDP_ACCOUNTING_FUNCTION__AVAILABLE_CREDIT = eINSTANCE.getSDPAccountingFunction_AvailableCredit();

		/**
		 * The meta object literal for the '<em><b>Credit Registers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS = eINSTANCE.getSDPAccountingFunction_CreditRegisters();

		/**
		 * The meta object literal for the '<em><b>Charge Registers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS = eINSTANCE.getSDPAccountingFunction_ChargeRegisters();

		/**
		 * The meta object literal for the '<em><b>Low Credit Warning Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDP_ACCOUNTING_FUNCTION__LOW_CREDIT_WARNING_LEVEL = eINSTANCE.getSDPAccountingFunction_LowCreditWarningLevel();

		/**
		 * The meta object literal for the '<em><b>Credit Expiry Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDP_ACCOUNTING_FUNCTION__CREDIT_EXPIRY_LEVEL = eINSTANCE.getSDPAccountingFunction_CreditExpiryLevel();

		/**
		 * The meta object literal for the '<em><b>Service Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDP_ACCOUNTING_FUNCTION__SERVICE_KIND = eINSTANCE.getSDPAccountingFunction_ServiceKind();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.CreditRegisterImpl <em>Credit Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.CreditRegisterImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getCreditRegister()
		 * @generated
		 */
		EClass CREDIT_REGISTER = eINSTANCE.getCreditRegister();

		/**
		 * The meta object literal for the '<em><b>Credit Amount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREDIT_REGISTER__CREDIT_AMOUNT = eINSTANCE.getCreditRegister_CreditAmount();

		/**
		 * The meta object literal for the '<em><b>Credit Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_REGISTER__CREDIT_KIND = eINSTANCE.getCreditRegister_CreditKind();

		/**
		 * The meta object literal for the '<em><b>SDP Accounting Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION = eINSTANCE.getCreditRegister_SDPAccountingFunction();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.ChargeRegisterImpl <em>Charge Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.ChargeRegisterImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getChargeRegister()
		 * @generated
		 */
		EClass CHARGE_REGISTER = eINSTANCE.getChargeRegister();

		/**
		 * The meta object literal for the '<em><b>Charge Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE_REGISTER__CHARGE_KIND = eINSTANCE.getChargeRegister_ChargeKind();

		/**
		 * The meta object literal for the '<em><b>SP Accounting Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION = eINSTANCE.getChargeRegister_SPAccountingFunction();

		/**
		 * The meta object literal for the '<em><b>Charge Amount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE_REGISTER__CHARGE_AMOUNT = eINSTANCE.getChargeRegister_ChargeAmount();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.BankImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();

		/**
		 * The meta object literal for the '<em><b>Bank Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__BANK_ACCOUNTS = eINSTANCE.getBank_BankAccounts();

		/**
		 * The meta object literal for the '<em><b>Branch Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK__BRANCH_CODE = eINSTANCE.getBank_BranchCode();

		/**
		 * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK__BIC = eINSTANCE.getBank_Bic();

		/**
		 * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK__IBAN = eINSTANCE.getBank_Iban();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.TokenImpl
		 * @see CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Point Of Sale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__POINT_OF_SALE = eINSTANCE.getToken_PointOfSale();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__COMMENT = eINSTANCE.getToken_Comment();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__CODE = eINSTANCE.getToken_Code();

	}

} //InfPaymentMeteringPackage
