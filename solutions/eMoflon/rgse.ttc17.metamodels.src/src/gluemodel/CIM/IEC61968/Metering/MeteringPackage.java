/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61968.Work.WorkPackage;

import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;

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
 * @see gluemodel.CIM.IEC61968.Metering.MeteringFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package contains the core information classes that support end device applications with specialized classes for metering equipment and remote reading functions. These classes are generally associated with the point where a service is delivered to the customer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package contains the core information classes that support end device applications with specialized classes for metering equipment and remote reading functions. These classes are generally associated with the point where a service is delivered to the customer.'"
 * @generated
 */
public interface MeteringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Metering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#Metering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimMetering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeteringPackage eINSTANCE = gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceEventImpl <em>End Device Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.EndDeviceEventImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getEndDeviceEvent()
	 * @generated
	 */
	int END_DEVICE_EVENT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__DESCRIPTION = CommonPackage.ACTIVITY_RECORD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__PATH_NAME = CommonPackage.ACTIVITY_RECORD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__LOCAL_NAME = CommonPackage.ACTIVITY_RECORD__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__MARKET_FACTORS = CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__USER_ID = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__METER_READING = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT__DEVICE_FUNCTION = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>End Device Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>End Device Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_EVENT_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ReadingTypeImpl <em>Reading Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.ReadingTypeImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getReadingType()
	 * @generated
	 */
	int READING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Interval Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__INTERVAL_LENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__DYNAMIC_CONFIGURATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__DEFAULT_QUALITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__REGISTER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interval Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__INTERVAL_BLOCKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__READINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Channel Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__CHANNEL_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__MULTIPLIER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Value Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__DEFAULT_VALUE_DATA_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reverse Chronology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__REVERSE_CHRONOLOGY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE__PENDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Reading Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Reading Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.MeterServiceWorkImpl <em>Meter Service Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeterServiceWorkImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getMeterServiceWork()
	 * @generated
	 */
	int METER_SERVICE_WORK = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__UUID = WorkPackage.WORK__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__MRID = WorkPackage.WORK__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__NAME = WorkPackage.WORK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__DESCRIPTION = WorkPackage.WORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__PATH_NAME = WorkPackage.WORK__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__MODELING_AUTHORITY_SET = WorkPackage.WORK__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__LOCAL_NAME = WorkPackage.WORK__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__ALIAS_NAME = WorkPackage.WORK__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__SUBJECT = WorkPackage.WORK__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__SCHEDULED_EVENTS = WorkPackage.WORK__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__ERP_ORGANISATION_ROLES = WorkPackage.WORK__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__CREATED_DATE_TIME = WorkPackage.WORK__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__TO_DOCUMENT_ROLES = WorkPackage.WORK__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__ASSET_ROLES = WorkPackage.WORK__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__ERP_PERSON_ROLES = WorkPackage.WORK__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__REVISION_NUMBER = WorkPackage.WORK__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__ELECTRONIC_ADDRESS = WorkPackage.WORK__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__STATUS = WorkPackage.WORK__STATUS;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__NETWORK_DATA_SETS = WorkPackage.WORK__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__POWER_SYSTEM_RESOURCE_ROLES = WorkPackage.WORK__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__CATEGORY = WorkPackage.WORK__CATEGORY;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__ACTIVITY_RECORDS = WorkPackage.WORK__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__MEASUREMENTS = WorkPackage.WORK__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__FROM_DOCUMENT_ROLES = WorkPackage.WORK__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__LAST_MODIFIED_DATE_TIME = WorkPackage.WORK__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__CHANGE_SETS = WorkPackage.WORK__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__DOC_STATUS = WorkPackage.WORK__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__CHANGE_ITEMS = WorkPackage.WORK__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__SCHEDULE_PARAMETER_INFOS = WorkPackage.WORK__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__TITLE = WorkPackage.WORK__TITLE;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__WORK_TASKS = WorkPackage.WORK__WORK_TASKS;

	/**
	 * The feature id for the '<em><b>Designs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__DESIGNS = WorkPackage.WORK__DESIGNS;

	/**
	 * The feature id for the '<em><b>Business Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__BUSINESS_CASE = WorkPackage.WORK__BUSINESS_CASE;

	/**
	 * The feature id for the '<em><b>Work Flow Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__WORK_FLOW_STEPS = WorkPackage.WORK__WORK_FLOW_STEPS;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__PRIORITY = WorkPackage.WORK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__WORK_COST_DETAILS = WorkPackage.WORK__WORK_COST_DETAILS;

	/**
	 * The feature id for the '<em><b>Erp Project Accounting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__ERP_PROJECT_ACCOUNTING = WorkPackage.WORK__ERP_PROJECT_ACCOUNTING;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__PROJECT = WorkPackage.WORK__PROJECT;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__REQUEST = WorkPackage.WORK__REQUEST;

	/**
	 * The feature id for the '<em><b>Work Billing Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__WORK_BILLING_INFO = WorkPackage.WORK__WORK_BILLING_INFO;

	/**
	 * The feature id for the '<em><b>Request Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__REQUEST_DATE_TIME = WorkPackage.WORK__REQUEST_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__KIND = WorkPackage.WORK__KIND;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__CUSTOMERS = WorkPackage.WORK__CUSTOMERS;

	/**
	 * The feature id for the '<em><b>Old Meter Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__OLD_METER_ASSET = WorkPackage.WORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK__METER_ASSET = WorkPackage.WORK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter Service Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK_FEATURE_COUNT = WorkPackage.WORK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meter Service Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_SERVICE_WORK_OPERATION_COUNT = WorkPackage.WORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.DeviceFunctionImpl <em>Device Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.DeviceFunctionImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getDeviceFunction()
	 * @generated
	 */
	int DEVICE_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__UUID = AssetsPackage.ASSET_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__MRID = AssetsPackage.ASSET_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__NAME = AssetsPackage.ASSET_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__DESCRIPTION = AssetsPackage.ASSET_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__PATH_NAME = AssetsPackage.ASSET_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__LOCAL_NAME = AssetsPackage.ASSET_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__ALIAS_NAME = AssetsPackage.ASSET_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__HARDWARE_ID = AssetsPackage.ASSET_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__PROGRAM_ID = AssetsPackage.ASSET_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__FIRMWARE_ID = AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__ASSET = AssetsPackage.ASSET_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__PASSWORD = AssetsPackage.ASSET_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__CONFIG_ID = AssetsPackage.ASSET_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__COM_EQUIPMENT_ASSET = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__DISABLED = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__END_DEVICE_ASSET = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__END_DEVICE_EVENTS = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION__REGISTERS = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Device Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION_FEATURE_COUNT = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Device Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTION_OPERATION_COUNT = AssetsPackage.ASSET_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceGroupImpl <em>End Device Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.EndDeviceGroupImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getEndDeviceGroup()
	 * @generated
	 */
	int END_DEVICE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Demand Response Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__GROUP_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Device Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__END_DEVICE_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP__END_DEVICE_CONTROLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>End Device Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>End Device Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.DynamicDemandImpl <em>Dynamic Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.DynamicDemandImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getDynamicDemand()
	 * @generated
	 */
	int DYNAMIC_DEMAND = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_DEMAND__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Sub Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_DEMAND__SUB_INTERVAL = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_DEMAND__INTERVAL = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_DEMAND__KIND = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_DEMAND_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dynamic Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_DEMAND_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.IntervalReadingImpl <em>Interval Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.IntervalReadingImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getIntervalReading()
	 * @generated
	 */
	int INTERVAL_READING = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__UUID = MeasPackage.MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__MRID = MeasPackage.MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__NAME = MeasPackage.MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__DESCRIPTION = MeasPackage.MEASUREMENT_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__PATH_NAME = MeasPackage.MEASUREMENT_VALUE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__MODELING_AUTHORITY_SET = MeasPackage.MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__LOCAL_NAME = MeasPackage.MEASUREMENT_VALUE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__ALIAS_NAME = MeasPackage.MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__GML_VALUES = MeasPackage.MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__PROCEDURE_DATA_SETS = MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__SENSOR_ACCURACY = MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__MEASUREMENT_VALUE_QUALITY = MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__ERP_PERSON = MeasPackage.MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__TIME_STAMP = MeasPackage.MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__MEASUREMENT_VALUE_SOURCE = MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__REMOTE_SOURCE = MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__VALUE = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reading Qualities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__READING_QUALITIES = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING__INTERVAL_BLOCKS = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interval Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING_FEATURE_COUNT = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interval Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_READING_OPERATION_COUNT = MeasPackage.MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.SDPLocationImpl <em>SDP Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.SDPLocationImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getSDPLocation()
	 * @generated
	 */
	int SDP_LOCATION = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__UUID = CommonPackage.LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__MRID = CommonPackage.LOCATION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__NAME = CommonPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__DESCRIPTION = CommonPackage.LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__PATH_NAME = CommonPackage.LOCATION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__MODELING_AUTHORITY_SET = CommonPackage.LOCATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__LOCAL_NAME = CommonPackage.LOCATION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__ALIAS_NAME = CommonPackage.LOCATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Secondary Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__SECONDARY_ADDRESS = CommonPackage.LOCATION__SECONDARY_ADDRESS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__MEASUREMENTS = CommonPackage.LOCATION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__DIRECTIONS = CommonPackage.LOCATION__DIRECTIONS;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__POWER_SYSTEM_RESOURCES = CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__PHONE2 = CommonPackage.LOCATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__PHONE1 = CommonPackage.LOCATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__LAND_PROPERTIES = CommonPackage.LOCATION__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__GEO_INFO_REFERENCE = CommonPackage.LOCATION__GEO_INFO_REFERENCE;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__DIMENSIONS_INFO = CommonPackage.LOCATION__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__CHANGE_ITEMS = CommonPackage.LOCATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Erp Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__ERP_ORGANISATIONS = CommonPackage.LOCATION__ERP_ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__COORDINATE_SYSTEMS = CommonPackage.LOCATION__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__ASSETS = CommonPackage.LOCATION__ASSETS;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__ROUTES = CommonPackage.LOCATION__ROUTES;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__HAZARDS = CommonPackage.LOCATION__HAZARDS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__CATEGORY = CommonPackage.LOCATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Main Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__MAIN_ADDRESS = CommonPackage.LOCATION__MAIN_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__ELECTRONIC_ADDRESS = CommonPackage.LOCATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__CORPORATE_CODE = CommonPackage.LOCATION__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Red Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__RED_LINES = CommonPackage.LOCATION__RED_LINES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__STATUS = CommonPackage.LOCATION__STATUS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__DIRECTION = CommonPackage.LOCATION__DIRECTION;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__CREWS = CommonPackage.LOCATION__CREWS;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__POSITION = CommonPackage.LOCATION__POSITION;

	/**
	 * The feature id for the '<em><b>Access Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__ACCESS_METHOD = CommonPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__REMARK = CommonPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Site Access Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__SITE_ACCESS_PROBLEM = CommonPackage.LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occupancy Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__OCCUPANCY_DATE = CommonPackage.LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION__SERVICE_DELIVERY_POINTS = CommonPackage.LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SDP Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION_FEATURE_COUNT = CommonPackage.LOCATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>SDP Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDP_LOCATION_OPERATION_COUNT = CommonPackage.LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl <em>End Device Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getEndDeviceAsset()
	 * @generated
	 */
	int END_DEVICE_ASSET = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__DESCRIPTION = AssetsPackage.ASSET_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__PATH_NAME = AssetsPackage.ASSET_CONTAINER__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__LOCAL_NAME = AssetsPackage.ASSET_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The feature id for the '<em><b>Disconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__DISCONNECT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relay Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__RELAY_CAPABLE = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__READINGS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__SERVICE_DELIVERY_POINT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metrology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__METROLOGY = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__RATED_VOLTAGE = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__RATED_CURRENT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Zone Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__TIME_ZONE_OFFSET = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Service Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__SERVICE_LOCATION = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__END_DEVICE_CONTROLS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>End Device Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__END_DEVICE_MODEL = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Read Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__READ_REQUEST = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Dst Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__DST_ENABLED = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__PHASE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__DEVICE_FUNCTIONS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reverse Flow Handling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__REVERSE_FLOW_HANDLING = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Demand Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__DEMAND_RESPONSE = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__CUSTOMER = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Amr System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__AMR_SYSTEM = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Load Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__LOAD_CONTROL = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Outage Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__OUTAGE_REPORT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>End Device Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__END_DEVICE_GROUPS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>End Device Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>End Device Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.IntervalBlockImpl <em>Interval Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.IntervalBlockImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getIntervalBlock()
	 * @generated
	 */
	int INTERVAL_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_BLOCK__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Meter Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_BLOCK__METER_READING = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_BLOCK__INTERVAL_READINGS = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_BLOCK__PENDING = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reading Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_BLOCK__READING_TYPE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interval Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_BLOCK_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interval Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_BLOCK_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ReadingQualityImpl <em>Reading Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.ReadingQualityImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getReadingQuality()
	 * @generated
	 */
	int READING_QUALITY = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_QUALITY__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Interval Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_QUALITY__INTERVAL_READING = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_QUALITY__QUALITY = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_QUALITY__READING = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reading Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_QUALITY_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reading Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_QUALITY_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl <em>Meter Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getMeterAsset()
	 * @generated
	 */
	int METER_ASSET = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__UUID = END_DEVICE_ASSET__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__MRID = END_DEVICE_ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__NAME = END_DEVICE_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__DESCRIPTION = END_DEVICE_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__PATH_NAME = END_DEVICE_ASSET__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__MODELING_AUTHORITY_SET = END_DEVICE_ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__LOCAL_NAME = END_DEVICE_ASSET__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ALIAS_NAME = END_DEVICE_ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ASSET_PROPERTY_CURVES = END_DEVICE_ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__SERIAL_NUMBER = END_DEVICE_ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__MEASUREMENTS = END_DEVICE_ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__FINANCIAL_INFO = END_DEVICE_ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__FROM_ASSET_ROLES = END_DEVICE_ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ACTIVITY_RECORDS = END_DEVICE_ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__DOCUMENT_ROLES = END_DEVICE_ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ASSET_CONTAINER = END_DEVICE_ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__CRITICAL = END_DEVICE_ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ERP_INVENTORY = END_DEVICE_ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__RELIABILITY_INFOS = END_DEVICE_ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__MANUFACTURED_DATE = END_DEVICE_ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__WORK_TASK = END_DEVICE_ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__LOT_NUMBER = END_DEVICE_ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ELECTRONIC_ADDRESS = END_DEVICE_ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__SCHEDULED_EVENTS = END_DEVICE_ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__CHANGE_ITEMS = END_DEVICE_ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__INITIAL_LOSS_OF_LIFE = END_DEVICE_ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ASSET_FUNCTIONS = END_DEVICE_ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__STATUS = END_DEVICE_ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__INITIAL_CONDITION = END_DEVICE_ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__UTC_NUMBER = END_DEVICE_ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__INSTALLATION_DATE = END_DEVICE_ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ERP_ORGANISATION_ROLES = END_DEVICE_ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__RATINGS = END_DEVICE_ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__MEDIUMS = END_DEVICE_ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__PROPERTIES = END_DEVICE_ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ASSET_INFO = END_DEVICE_ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__CORPORATE_CODE = END_DEVICE_ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__PURCHASE_PRICE = END_DEVICE_ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__TO_ASSET_ROLES = END_DEVICE_ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__LOCATION = END_DEVICE_ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__APPLICATION = END_DEVICE_ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__POWER_SYSTEM_RESOURCES = END_DEVICE_ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__CATEGORY = END_DEVICE_ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ERP_ITEM_MASTER = END_DEVICE_ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ACCEPTANCE_TEST = END_DEVICE_ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ERP_REC_DELIVERY_ITEMS = END_DEVICE_ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__LAND_PROPERTIES = END_DEVICE_ASSET__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__ASSETS = END_DEVICE_ASSET__ASSETS;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__SEALS = END_DEVICE_ASSET__SEALS;

	/**
	 * The feature id for the '<em><b>Disconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__DISCONNECT = END_DEVICE_ASSET__DISCONNECT;

	/**
	 * The feature id for the '<em><b>Relay Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__RELAY_CAPABLE = END_DEVICE_ASSET__RELAY_CAPABLE;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__READINGS = END_DEVICE_ASSET__READINGS;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__SERVICE_DELIVERY_POINT = END_DEVICE_ASSET__SERVICE_DELIVERY_POINT;

	/**
	 * The feature id for the '<em><b>Metrology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__METROLOGY = END_DEVICE_ASSET__METROLOGY;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__RATED_VOLTAGE = END_DEVICE_ASSET__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__RATED_CURRENT = END_DEVICE_ASSET__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Time Zone Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__TIME_ZONE_OFFSET = END_DEVICE_ASSET__TIME_ZONE_OFFSET;

	/**
	 * The feature id for the '<em><b>Service Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__SERVICE_LOCATION = END_DEVICE_ASSET__SERVICE_LOCATION;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__END_DEVICE_CONTROLS = END_DEVICE_ASSET__END_DEVICE_CONTROLS;

	/**
	 * The feature id for the '<em><b>End Device Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__END_DEVICE_MODEL = END_DEVICE_ASSET__END_DEVICE_MODEL;

	/**
	 * The feature id for the '<em><b>Read Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__READ_REQUEST = END_DEVICE_ASSET__READ_REQUEST;

	/**
	 * The feature id for the '<em><b>Dst Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__DST_ENABLED = END_DEVICE_ASSET__DST_ENABLED;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__PHASE_COUNT = END_DEVICE_ASSET__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__DEVICE_FUNCTIONS = END_DEVICE_ASSET__DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Reverse Flow Handling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__REVERSE_FLOW_HANDLING = END_DEVICE_ASSET__REVERSE_FLOW_HANDLING;

	/**
	 * The feature id for the '<em><b>Demand Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__DEMAND_RESPONSE = END_DEVICE_ASSET__DEMAND_RESPONSE;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__CUSTOMER = END_DEVICE_ASSET__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Amr System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__AMR_SYSTEM = END_DEVICE_ASSET__AMR_SYSTEM;

	/**
	 * The feature id for the '<em><b>Load Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__LOAD_CONTROL = END_DEVICE_ASSET__LOAD_CONTROL;

	/**
	 * The feature id for the '<em><b>Outage Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__OUTAGE_REPORT = END_DEVICE_ASSET__OUTAGE_REPORT;

	/**
	 * The feature id for the '<em><b>End Device Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__END_DEVICE_GROUPS = END_DEVICE_ASSET__END_DEVICE_GROUPS;

	/**
	 * The feature id for the '<em><b>Meter Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__METER_ASSET_MODEL = END_DEVICE_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vending Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__VENDING_TRANSACTIONS = END_DEVICE_ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>KR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__KR = END_DEVICE_ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meter Service Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__METER_SERVICE_WORKS = END_DEVICE_ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>KH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__KH = END_DEVICE_ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Form Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__FORM_NUMBER = END_DEVICE_ASSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Meter Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__METER_READINGS = END_DEVICE_ASSET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Meter Replacement Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET__METER_REPLACEMENT_WORKS = END_DEVICE_ASSET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Meter Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_FEATURE_COUNT = END_DEVICE_ASSET_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Meter Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_OPERATION_COUNT = END_DEVICE_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.MeterReadingImpl <em>Meter Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeterReadingImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getMeterReading()
	 * @generated
	 */
	int METER_READING = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__END_DEVICE_EVENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__SERVICE_DELIVERY_POINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__CUSTOMER_AGREEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meter Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__METER_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Values Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__VALUES_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__READINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interval Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING__INTERVAL_BLOCKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Meter Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Meter Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_READING_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ReadingImpl <em>Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.ReadingImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getReading()
	 * @generated
	 */
	int READING = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__UUID = MeasPackage.MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__MRID = MeasPackage.MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__NAME = MeasPackage.MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__DESCRIPTION = MeasPackage.MEASUREMENT_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__PATH_NAME = MeasPackage.MEASUREMENT_VALUE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__MODELING_AUTHORITY_SET = MeasPackage.MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__LOCAL_NAME = MeasPackage.MEASUREMENT_VALUE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__ALIAS_NAME = MeasPackage.MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__GML_VALUES = MeasPackage.MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__PROCEDURE_DATA_SETS = MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__SENSOR_ACCURACY = MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__MEASUREMENT_VALUE_QUALITY = MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__ERP_PERSON = MeasPackage.MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__TIME_STAMP = MeasPackage.MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__MEASUREMENT_VALUE_SOURCE = MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__REMOTE_SOURCE = MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__END_DEVICE_ASSET = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reading Qualities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__READING_QUALITIES = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meter Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__METER_READINGS = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__VALUE = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reading Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__READING_TYPE = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FEATURE_COUNT = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_OPERATION_COUNT = MeasPackage.MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl <em>Demand Response Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getDemandResponseProgram()
	 * @generated
	 */
	int DEMAND_RESPONSE_PROGRAM = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Device Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Demand Response Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Demand Response Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_RESPONSE_PROGRAM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ComFunctionImpl <em>Com Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.ComFunctionImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getComFunction()
	 * @generated
	 */
	int COM_FUNCTION = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__UUID = DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__MRID = DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__NAME = DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__DESCRIPTION = DEVICE_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__PATH_NAME = DEVICE_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__MODELING_AUTHORITY_SET = DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__LOCAL_NAME = DEVICE_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__ALIAS_NAME = DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__HARDWARE_ID = DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__PROGRAM_ID = DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__FIRMWARE_ID = DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__ASSET = DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__PASSWORD = DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__CONFIG_ID = DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__COM_EQUIPMENT_ASSET = DEVICE_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__DISABLED = DEVICE_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__END_DEVICE_ASSET = DEVICE_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__END_DEVICE_EVENTS = DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__REGISTERS = DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Two Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__TWO_WAY = DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amr Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__AMR_ADDRESS = DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amr Router</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION__AMR_ROUTER = DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Com Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION_FEATURE_COUNT = DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Com Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_FUNCTION_OPERATION_COUNT = DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl <em>Service Delivery Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getServiceDeliveryPoint()
	 * @generated
	 */
	int SERVICE_DELIVERY_POINT = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Service Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__SERVICE_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Quality Pricings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__PHASE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rated Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__RATED_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Customer Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Energy Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__ENERGY_CONSUMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__SERVICE_CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__GROUNDED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__RATED_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nominal Service Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__NOMINAL_SERVICE_VOLTAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Estimated Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__ESTIMATED_LOAD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>End Device Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Service Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pricing Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__PRICING_STRUCTURES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__TRANSFORMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__SERVICE_PRIORITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Meter Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__METER_READINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>SDP Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__SDP_LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Service Delivery Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Check Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__CHECK_BILLING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Ctpt Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__CTPT_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.RegisterImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Left Digit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__LEFT_DIGIT_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reading Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__READING_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__DEVICE_FUNCTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right Digit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__RIGHT_DIGIT_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceControlImpl <em>End Device Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.EndDeviceControlImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getEndDeviceControl()
	 * @generated
	 */
	int END_DEVICE_CONTROL = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Scheduled Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__SCHEDULED_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dr Program Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dr Program Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__DR_PROGRAM_LEVEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Customer Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__CUSTOMER_AGREEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__END_DEVICE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Price Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__PRICE_SIGNAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End Device Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__END_DEVICE_GROUP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Demand Response Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>End Device Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>End Device Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_CONTROL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.PendingImpl <em>Pending</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.PendingImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getPending()
	 * @generated
	 */
	int PENDING = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING__OFFSET = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiply Before Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING__MULTIPLY_BEFORE_ADD = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scalar Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING__SCALAR_FLOAT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reading Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING__READING_TYPE = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scalar Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING__SCALAR_DENOMINATOR = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interval Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING__INTERVAL_BLOCKS = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scalar Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING__SCALAR_NUMERATOR = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pending</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pending</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENDING_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl <em>Electric Metering Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getElectricMeteringFunction()
	 * @generated
	 */
	int ELECTRIC_METERING_FUNCTION = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__UUID = DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__MRID = DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__NAME = DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__DESCRIPTION = DEVICE_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__PATH_NAME = DEVICE_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__MODELING_AUTHORITY_SET = DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__LOCAL_NAME = DEVICE_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__ALIAS_NAME = DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__HARDWARE_ID = DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__PROGRAM_ID = DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__FIRMWARE_ID = DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__ASSET = DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__PASSWORD = DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__CONFIG_ID = DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__COM_EQUIPMENT_ASSET = DEVICE_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__DISABLED = DEVICE_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__END_DEVICE_ASSET = DEVICE_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__END_DEVICE_EVENTS = DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__REGISTERS = DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Demand Multiplier Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER_APPLIED = DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer CT Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__TRANSFORMER_CT_RATIO = DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Billing Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER = DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metering Function Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION = DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__CURRENT_RATING = DEVICE_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transformer Ratios Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__TRANSFORMER_RATIOS_APPLIED = DEVICE_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>KW Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER = DEVICE_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Billing Multiplier Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER_APPLIED = DEVICE_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Demand Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER = DEVICE_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>KWh Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER = DEVICE_FUNCTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transformer VT Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__TRANSFORMER_VT_RATIO = DEVICE_FUNCTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Voltage Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION__VOLTAGE_RATING = DEVICE_FUNCTION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Electric Metering Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION_FEATURE_COUNT = DEVICE_FUNCTION_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Electric Metering Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_METERING_FUNCTION_OPERATION_COUNT = DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.ReadingKind <em>Reading Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingKind
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getReadingKind()
	 * @generated
	 */
	int READING_KIND = 21;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.Metering.DemandKind <em>Demand Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.Metering.DemandKind
	 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getDemandKind()
	 * @generated
	 */
	int DEMAND_KIND = 22;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent <em>End Device Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Event</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceEvent
	 * @generated
	 */
	EClass getEndDeviceEvent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getUserID()
	 * @see #getEndDeviceEvent()
	 * @generated
	 */
	EAttribute getEndDeviceEvent_UserID();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Reading</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getMeterReading()
	 * @see #getEndDeviceEvent()
	 * @generated
	 */
	EReference getEndDeviceEvent_MeterReading();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getDeviceFunction <em>Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Function</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getDeviceFunction()
	 * @see #getEndDeviceEvent()
	 * @generated
	 */
	EReference getEndDeviceEvent_DeviceFunction();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.ReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Type</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType
	 * @generated
	 */
	EClass getReadingType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getIntervalLength <em>Interval Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Length</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getIntervalLength()
	 * @see #getReadingType()
	 * @generated
	 */
	EAttribute getReadingType_IntervalLength();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDynamicConfiguration <em>Dynamic Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Configuration</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getDynamicConfiguration()
	 * @see #getReadingType()
	 * @generated
	 */
	EReference getReadingType_DynamicConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getUnit()
	 * @see #getReadingType()
	 * @generated
	 */
	EAttribute getReadingType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDefaultQuality <em>Default Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Quality</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getDefaultQuality()
	 * @see #getReadingType()
	 * @generated
	 */
	EAttribute getReadingType_DefaultQuality();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getKind()
	 * @see #getReadingType()
	 * @generated
	 */
	EAttribute getReadingType_Kind();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Register</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getRegister()
	 * @see #getReadingType()
	 * @generated
	 */
	EReference getReadingType_Register();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Blocks</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getIntervalBlocks()
	 * @see #getReadingType()
	 * @generated
	 */
	EReference getReadingType_IntervalBlocks();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readings</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getReadings()
	 * @see #getReadingType()
	 * @generated
	 */
	EReference getReadingType_Readings();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getChannelNumber <em>Channel Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Number</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getChannelNumber()
	 * @see #getReadingType()
	 * @generated
	 */
	EAttribute getReadingType_ChannelNumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getMultiplier()
	 * @see #getReadingType()
	 * @generated
	 */
	EAttribute getReadingType_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getDefaultValueDataType <em>Default Value Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Data Type</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getDefaultValueDataType()
	 * @see #getReadingType()
	 * @generated
	 */
	EAttribute getReadingType_DefaultValueDataType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#isReverseChronology <em>Reverse Chronology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Chronology</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#isReverseChronology()
	 * @see #getReadingType()
	 * @generated
	 */
	EAttribute getReadingType_ReverseChronology();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ReadingType#getPending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pending</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingType#getPending()
	 * @see #getReadingType()
	 * @generated
	 */
	EReference getReadingType_Pending();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.MeterServiceWork <em>Meter Service Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Service Work</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterServiceWork
	 * @generated
	 */
	EClass getMeterServiceWork();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.MeterServiceWork#getOldMeterAsset <em>Old Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Meter Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterServiceWork#getOldMeterAsset()
	 * @see #getMeterServiceWork()
	 * @generated
	 */
	EReference getMeterServiceWork_OldMeterAsset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.MeterServiceWork#getMeterAsset <em>Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterServiceWork#getMeterAsset()
	 * @see #getMeterServiceWork()
	 * @generated
	 */
	EReference getMeterServiceWork_MeterAsset();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction <em>Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Function</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction
	 * @generated
	 */
	EClass getDeviceFunction();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction#getComEquipmentAsset <em>Com Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com Equipment Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction#getComEquipmentAsset()
	 * @see #getDeviceFunction()
	 * @generated
	 */
	EReference getDeviceFunction_ComEquipmentAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction#isDisabled()
	 * @see #getDeviceFunction()
	 * @generated
	 */
	EAttribute getDeviceFunction_Disabled();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction#getEndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction#getEndDeviceAsset()
	 * @see #getDeviceFunction()
	 * @generated
	 */
	EReference getDeviceFunction_EndDeviceAsset();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction#getEndDeviceEvents <em>End Device Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Events</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction#getEndDeviceEvents()
	 * @see #getDeviceFunction()
	 * @generated
	 */
	EReference getDeviceFunction_EndDeviceEvents();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registers</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction#getRegisters()
	 * @see #getDeviceFunction()
	 * @generated
	 */
	EReference getDeviceFunction_Registers();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup <em>End Device Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Group</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceGroup
	 * @generated
	 */
	EClass getEndDeviceGroup();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Demand Response Program</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram()
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	EReference getEndDeviceGroup_DemandResponseProgram();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getGroupAddress <em>Group Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Address</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getGroupAddress()
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	EAttribute getEndDeviceGroup_GroupAddress();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Assets</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceAssets()
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	EReference getEndDeviceGroup_EndDeviceAssets();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Controls</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls()
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	EReference getEndDeviceGroup_EndDeviceControls();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand <em>Dynamic Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Demand</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DynamicDemand
	 * @generated
	 */
	EClass getDynamicDemand();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getSubInterval <em>Sub Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Interval</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DynamicDemand#getSubInterval()
	 * @see #getDynamicDemand()
	 * @generated
	 */
	EAttribute getDynamicDemand_SubInterval();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DynamicDemand#getInterval()
	 * @see #getDynamicDemand()
	 * @generated
	 */
	EAttribute getDynamicDemand_Interval();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.DynamicDemand#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DynamicDemand#getKind()
	 * @see #getDynamicDemand()
	 * @generated
	 */
	EAttribute getDynamicDemand_Kind();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.IntervalReading <em>Interval Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Reading</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalReading
	 * @generated
	 */
	EClass getIntervalReading();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.IntervalReading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalReading#getValue()
	 * @see #getIntervalReading()
	 * @generated
	 */
	EAttribute getIntervalReading_Value();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.IntervalReading#getReadingQualities <em>Reading Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reading Qualities</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalReading#getReadingQualities()
	 * @see #getIntervalReading()
	 * @generated
	 */
	EReference getIntervalReading_ReadingQualities();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.IntervalReading#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Blocks</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalReading#getIntervalBlocks()
	 * @see #getIntervalReading()
	 * @generated
	 */
	EReference getIntervalReading_IntervalBlocks();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.SDPLocation <em>SDP Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDP Location</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.SDPLocation
	 * @generated
	 */
	EClass getSDPLocation();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.SDPLocation#getAccessMethod <em>Access Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Method</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.SDPLocation#getAccessMethod()
	 * @see #getSDPLocation()
	 * @generated
	 */
	EAttribute getSDPLocation_AccessMethod();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.SDPLocation#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.SDPLocation#getRemark()
	 * @see #getSDPLocation()
	 * @generated
	 */
	EAttribute getSDPLocation_Remark();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.SDPLocation#getSiteAccessProblem <em>Site Access Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Access Problem</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.SDPLocation#getSiteAccessProblem()
	 * @see #getSDPLocation()
	 * @generated
	 */
	EAttribute getSDPLocation_SiteAccessProblem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.SDPLocation#getOccupancyDate <em>Occupancy Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupancy Date</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.SDPLocation#getOccupancyDate()
	 * @see #getSDPLocation()
	 * @generated
	 */
	EAttribute getSDPLocation_OccupancyDate();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints()
	 * @see #getSDPLocation()
	 * @generated
	 */
	EReference getSDPLocation_ServiceDeliveryPoints();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset
	 * @generated
	 */
	EClass getEndDeviceAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDisconnect <em>Disconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disconnect</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDisconnect()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_Disconnect();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isRelayCapable <em>Relay Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relay Capable</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isRelayCapable()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_RelayCapable();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readings</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getReadings()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_Readings();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Delivery Point</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceDeliveryPoint()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isMetrology <em>Metrology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrology</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isMetrology()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_Metrology();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getRatedVoltage()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_RatedVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getRatedCurrent()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_RatedCurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getTimeZoneOffset <em>Time Zone Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone Offset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getTimeZoneOffset()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_TimeZoneOffset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Location</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceLocation()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_ServiceLocation();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Controls</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceControls()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_EndDeviceControls();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceModel <em>End Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Model</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceModel()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_EndDeviceModel();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isReadRequest <em>Read Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Request</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isReadRequest()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_ReadRequest();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDstEnabled <em>Dst Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dst Enabled</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDstEnabled()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_DstEnabled();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getPhaseCount <em>Phase Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Count</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getPhaseCount()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_PhaseCount();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getDeviceFunctions <em>Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device Functions</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getDeviceFunctions()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_DeviceFunctions();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isReverseFlowHandling <em>Reverse Flow Handling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Flow Handling</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isReverseFlowHandling()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_ReverseFlowHandling();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDemandResponse <em>Demand Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demand Response</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDemandResponse()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_DemandResponse();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getCustomer()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_Customer();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getAmrSystem <em>Amr System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amr System</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getAmrSystem()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_AmrSystem();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isLoadControl <em>Load Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Control</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isLoadControl()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_LoadControl();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isOutageReport <em>Outage Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outage Report</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isOutageReport()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EAttribute getEndDeviceAsset_OutageReport();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceGroups <em>End Device Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Groups</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceGroups()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_EndDeviceGroups();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.IntervalBlock <em>Interval Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Block</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalBlock
	 * @generated
	 */
	EClass getIntervalBlock();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.IntervalBlock#getMeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Reading</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalBlock#getMeterReading()
	 * @see #getIntervalBlock()
	 * @generated
	 */
	EReference getIntervalBlock_MeterReading();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.IntervalBlock#getIntervalReadings <em>Interval Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Readings</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalBlock#getIntervalReadings()
	 * @see #getIntervalBlock()
	 * @generated
	 */
	EReference getIntervalBlock_IntervalReadings();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.IntervalBlock#getPending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pending</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalBlock#getPending()
	 * @see #getIntervalBlock()
	 * @generated
	 */
	EReference getIntervalBlock_Pending();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.IntervalBlock#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading Type</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalBlock#getReadingType()
	 * @see #getIntervalBlock()
	 * @generated
	 */
	EReference getIntervalBlock_ReadingType();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.ReadingQuality <em>Reading Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Quality</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingQuality
	 * @generated
	 */
	EClass getReadingQuality();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ReadingQuality#getIntervalReading <em>Interval Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Reading</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingQuality#getIntervalReading()
	 * @see #getReadingQuality()
	 * @generated
	 */
	EReference getReadingQuality_IntervalReading();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ReadingQuality#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingQuality#getQuality()
	 * @see #getReadingQuality()
	 * @generated
	 */
	EAttribute getReadingQuality_Quality();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ReadingQuality#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingQuality#getReading()
	 * @see #getReadingQuality()
	 * @generated
	 */
	EReference getReadingQuality_Reading();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset <em>Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset
	 * @generated
	 */
	EClass getMeterAsset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterAssetModel <em>Meter Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Asset Model</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterAssetModel()
	 * @see #getMeterAsset()
	 * @generated
	 */
	EReference getMeterAsset_MeterAssetModel();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getVendingTransactions <em>Vending Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vending Transactions</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getVendingTransactions()
	 * @see #getMeterAsset()
	 * @generated
	 */
	EReference getMeterAsset_VendingTransactions();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getKR <em>KR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KR</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getKR()
	 * @see #getMeterAsset()
	 * @generated
	 */
	EAttribute getMeterAsset_KR();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterServiceWorks <em>Meter Service Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Service Works</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterServiceWorks()
	 * @see #getMeterAsset()
	 * @generated
	 */
	EReference getMeterAsset_MeterServiceWorks();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getKH <em>KH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KH</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getKH()
	 * @see #getMeterAsset()
	 * @generated
	 */
	EAttribute getMeterAsset_KH();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getFormNumber <em>Form Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Number</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getFormNumber()
	 * @see #getMeterAsset()
	 * @generated
	 */
	EAttribute getMeterAsset_FormNumber();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Readings</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterReadings()
	 * @see #getMeterAsset()
	 * @generated
	 */
	EReference getMeterAsset_MeterReadings();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterReplacementWorks <em>Meter Replacement Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Replacement Works</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterReplacementWorks()
	 * @see #getMeterAsset()
	 * @generated
	 */
	EReference getMeterAsset_MeterReplacementWorks();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.MeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Reading</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading
	 * @generated
	 */
	EClass getMeterReading();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getEndDeviceEvents <em>End Device Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Events</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getEndDeviceEvents()
	 * @see #getMeterReading()
	 * @generated
	 */
	EReference getMeterReading_EndDeviceEvents();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Delivery Point</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getServiceDeliveryPoint()
	 * @see #getMeterReading()
	 * @generated
	 */
	EReference getMeterReading_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Agreement</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getCustomerAgreement()
	 * @see #getMeterReading()
	 * @generated
	 */
	EReference getMeterReading_CustomerAgreement();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getMeterAsset <em>Meter Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getMeterAsset()
	 * @see #getMeterReading()
	 * @generated
	 */
	EReference getMeterReading_MeterAsset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getValuesInterval <em>Values Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Values Interval</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getValuesInterval()
	 * @see #getMeterReading()
	 * @generated
	 */
	EReference getMeterReading_ValuesInterval();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readings</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getReadings()
	 * @see #getMeterReading()
	 * @generated
	 */
	EReference getMeterReading_Readings();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Blocks</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getIntervalBlocks()
	 * @see #getMeterReading()
	 * @generated
	 */
	EReference getMeterReading_IntervalBlocks();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.Reading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Reading
	 * @generated
	 */
	EClass getReading();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.Reading#getEndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Reading#getEndDeviceAsset()
	 * @see #getReading()
	 * @generated
	 */
	EReference getReading_EndDeviceAsset();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.Reading#getReadingQualities <em>Reading Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reading Qualities</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Reading#getReadingQualities()
	 * @see #getReading()
	 * @generated
	 */
	EReference getReading_ReadingQualities();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.Reading#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Readings</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Reading#getMeterReadings()
	 * @see #getReading()
	 * @generated
	 */
	EReference getReading_MeterReadings();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.Reading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Reading#getValue()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Value();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.Reading#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading Type</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Reading#getReadingType()
	 * @see #getReading()
	 * @generated
	 */
	EReference getReading_ReadingType();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demand Response Program</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandResponseProgram
	 * @generated
	 */
	EClass getDemandResponseProgram();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	EReference getDemandResponseProgram_CustomerAgreements();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getValidityInterval <em>Validity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validity Interval</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getValidityInterval()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	EReference getDemandResponseProgram_ValidityInterval();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups <em>End Device Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Groups</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	EReference getDemandResponseProgram_EndDeviceGroups();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Controls</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	EReference getDemandResponseProgram_EndDeviceControls();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandResponseProgram#getType()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	EAttribute getDemandResponseProgram_Type();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.ComFunction <em>Com Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Function</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ComFunction
	 * @generated
	 */
	EClass getComFunction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ComFunction#isTwoWay <em>Two Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Two Way</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ComFunction#isTwoWay()
	 * @see #getComFunction()
	 * @generated
	 */
	EAttribute getComFunction_TwoWay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ComFunction#getAmrAddress <em>Amr Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amr Address</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ComFunction#getAmrAddress()
	 * @see #getComFunction()
	 * @generated
	 */
	EAttribute getComFunction_AmrAddress();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ComFunction#getAmrRouter <em>Amr Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amr Router</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ComFunction#getAmrRouter()
	 * @see #getComFunction()
	 * @generated
	 */
	EAttribute getComFunction_AmrRouter();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Delivery Point</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint
	 * @generated
	 */
	EClass getServiceDeliveryPoint();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Location</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_ServiceLocation();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPowerQualityPricings <em>Power Quality Pricings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Quality Pricings</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPowerQualityPricings()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_PowerQualityPricings();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_PhaseCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower <em>Rated Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Power</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_RatedPower();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Agreement</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_CustomerAgreement();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Consumer</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_EnergyConsumer();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Category</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_ServiceCategory();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#isGrounded <em>Grounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grounded</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#isGrounded()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_Grounded();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_RatedCurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getNominalServiceVoltage <em>Nominal Service Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Service Voltage</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getNominalServiceVoltage()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_NominalServiceVoltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad <em>Estimated Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Load</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_EstimatedLoad();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Assets</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEndDeviceAssets()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_EndDeviceAssets();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Supplier</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_ServiceSupplier();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pricing Structures</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_PricingStructures();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getTransformer()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_Transformer();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority <em>Service Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Priority</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_ServicePriority();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Readings</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_MeterReadings();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations <em>SDP Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SDP Locations</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_SDPLocations();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark <em>Service Delivery Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Delivery Remark</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_ServiceDeliveryRemark();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling <em>Check Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Billing</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_CheckBilling();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference <em>Ctpt Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctpt Reference</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EAttribute getServiceDeliveryPoint_CtptReference();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.Register#getLeftDigitCount <em>Left Digit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Digit Count</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Register#getLeftDigitCount()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_LeftDigitCount();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.Register#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading Type</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Register#getReadingType()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_ReadingType();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.Register#getDeviceFunction <em>Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Function</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Register#getDeviceFunction()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_DeviceFunction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.Register#getRightDigitCount <em>Right Digit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Digit Count</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Register#getRightDigitCount()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_RightDigitCount();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl <em>End Device Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Control</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl
	 * @generated
	 */
	EClass getEndDeviceControl();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled Interval</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getScheduledInterval()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EReference getEndDeviceControl_ScheduledInterval();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory <em>Dr Program Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dr Program Mandatory</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EAttribute getEndDeviceControl_DrProgramMandatory();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dr Program Level</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getDrProgramLevel()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EAttribute getEndDeviceControl_DrProgramLevel();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Agreement</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getCustomerAgreement()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EReference getEndDeviceControl_CustomerAgreement();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Asset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceAsset()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EReference getEndDeviceControl_EndDeviceAsset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getType()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EAttribute getEndDeviceControl_Type();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getPriceSignal <em>Price Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Signal</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getPriceSignal()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EAttribute getEndDeviceControl_PriceSignal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup <em>End Device Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Group</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EReference getEndDeviceControl_EndDeviceGroup();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Demand Response Program</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	EReference getEndDeviceControl_DemandResponseProgram();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.Pending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pending</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Pending
	 * @generated
	 */
	EClass getPending();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.Pending#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Pending#getOffset()
	 * @see #getPending()
	 * @generated
	 */
	EAttribute getPending_Offset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.Pending#isMultiplyBeforeAdd <em>Multiply Before Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiply Before Add</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Pending#isMultiplyBeforeAdd()
	 * @see #getPending()
	 * @generated
	 */
	EAttribute getPending_MultiplyBeforeAdd();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarFloat <em>Scalar Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalar Float</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Pending#getScalarFloat()
	 * @see #getPending()
	 * @generated
	 */
	EAttribute getPending_ScalarFloat();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.Pending#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading Type</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Pending#getReadingType()
	 * @see #getPending()
	 * @generated
	 */
	EReference getPending_ReadingType();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarDenominator <em>Scalar Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalar Denominator</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Pending#getScalarDenominator()
	 * @see #getPending()
	 * @generated
	 */
	EAttribute getPending_ScalarDenominator();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.Metering.Pending#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Blocks</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Pending#getIntervalBlocks()
	 * @see #getPending()
	 * @generated
	 */
	EReference getPending_IntervalBlocks();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.Pending#getScalarNumerator <em>Scalar Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalar Numerator</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.Pending#getScalarNumerator()
	 * @see #getPending()
	 * @generated
	 */
	EAttribute getPending_ScalarNumerator();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction <em>Electric Metering Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electric Metering Function</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction
	 * @generated
	 */
	EClass getElectricMeteringFunction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#isDemandMultiplierApplied <em>Demand Multiplier Applied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demand Multiplier Applied</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#isDemandMultiplierApplied()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_DemandMultiplierApplied();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getTransformerCTRatio <em>Transformer CT Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer CT Ratio</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getTransformerCTRatio()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_TransformerCTRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getBillingMultiplier <em>Billing Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getBillingMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_BillingMultiplier();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getMeteringFunctionConfiguration <em>Metering Function Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metering Function Configuration</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getMeteringFunctionConfiguration()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EReference getElectricMeteringFunction_MeteringFunctionConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getCurrentRating <em>Current Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Rating</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getCurrentRating()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_CurrentRating();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#isTransformerRatiosApplied <em>Transformer Ratios Applied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer Ratios Applied</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#isTransformerRatiosApplied()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_TransformerRatiosApplied();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier <em>KW Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KW Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_KWMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#isBillingMultiplierApplied <em>Billing Multiplier Applied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Multiplier Applied</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#isBillingMultiplierApplied()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_BillingMultiplierApplied();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getDemandMultiplier <em>Demand Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demand Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getDemandMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_DemandMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier <em>KWh Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KWh Multiplier</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_KWhMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getTransformerVTRatio <em>Transformer VT Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer VT Ratio</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getTransformerVTRatio()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_TransformerVTRatio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getVoltageRating <em>Voltage Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Rating</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ElectricMeteringFunction#getVoltageRating()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	EAttribute getElectricMeteringFunction_VoltageRating();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.Metering.ReadingKind <em>Reading Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reading Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.ReadingKind
	 * @generated
	 */
	EEnum getReadingKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61968.Metering.DemandKind <em>Demand Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Demand Kind</em>'.
	 * @see gluemodel.CIM.IEC61968.Metering.DemandKind
	 * @generated
	 */
	EEnum getDemandKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeteringFactory getMeteringFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceEventImpl <em>End Device Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.EndDeviceEventImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getEndDeviceEvent()
		 * @generated
		 */
		EClass END_DEVICE_EVENT = eINSTANCE.getEndDeviceEvent();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_EVENT__USER_ID = eINSTANCE.getEndDeviceEvent_UserID();

		/**
		 * The meta object literal for the '<em><b>Meter Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_EVENT__METER_READING = eINSTANCE.getEndDeviceEvent_MeterReading();

		/**
		 * The meta object literal for the '<em><b>Device Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_EVENT__DEVICE_FUNCTION = eINSTANCE.getEndDeviceEvent_DeviceFunction();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ReadingTypeImpl <em>Reading Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.ReadingTypeImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getReadingType()
		 * @generated
		 */
		EClass READING_TYPE = eINSTANCE.getReadingType();

		/**
		 * The meta object literal for the '<em><b>Interval Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TYPE__INTERVAL_LENGTH = eINSTANCE.getReadingType_IntervalLength();

		/**
		 * The meta object literal for the '<em><b>Dynamic Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_TYPE__DYNAMIC_CONFIGURATION = eINSTANCE.getReadingType_DynamicConfiguration();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TYPE__UNIT = eINSTANCE.getReadingType_Unit();

		/**
		 * The meta object literal for the '<em><b>Default Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TYPE__DEFAULT_QUALITY = eINSTANCE.getReadingType_DefaultQuality();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TYPE__KIND = eINSTANCE.getReadingType_Kind();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_TYPE__REGISTER = eINSTANCE.getReadingType_Register();

		/**
		 * The meta object literal for the '<em><b>Interval Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_TYPE__INTERVAL_BLOCKS = eINSTANCE.getReadingType_IntervalBlocks();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_TYPE__READINGS = eINSTANCE.getReadingType_Readings();

		/**
		 * The meta object literal for the '<em><b>Channel Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TYPE__CHANNEL_NUMBER = eINSTANCE.getReadingType_ChannelNumber();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TYPE__MULTIPLIER = eINSTANCE.getReadingType_Multiplier();

		/**
		 * The meta object literal for the '<em><b>Default Value Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TYPE__DEFAULT_VALUE_DATA_TYPE = eINSTANCE.getReadingType_DefaultValueDataType();

		/**
		 * The meta object literal for the '<em><b>Reverse Chronology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TYPE__REVERSE_CHRONOLOGY = eINSTANCE.getReadingType_ReverseChronology();

		/**
		 * The meta object literal for the '<em><b>Pending</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_TYPE__PENDING = eINSTANCE.getReadingType_Pending();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.MeterServiceWorkImpl <em>Meter Service Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeterServiceWorkImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getMeterServiceWork()
		 * @generated
		 */
		EClass METER_SERVICE_WORK = eINSTANCE.getMeterServiceWork();

		/**
		 * The meta object literal for the '<em><b>Old Meter Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_SERVICE_WORK__OLD_METER_ASSET = eINSTANCE.getMeterServiceWork_OldMeterAsset();

		/**
		 * The meta object literal for the '<em><b>Meter Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_SERVICE_WORK__METER_ASSET = eINSTANCE.getMeterServiceWork_MeterAsset();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.DeviceFunctionImpl <em>Device Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.DeviceFunctionImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getDeviceFunction()
		 * @generated
		 */
		EClass DEVICE_FUNCTION = eINSTANCE.getDeviceFunction();

		/**
		 * The meta object literal for the '<em><b>Com Equipment Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_FUNCTION__COM_EQUIPMENT_ASSET = eINSTANCE.getDeviceFunction_ComEquipmentAsset();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_FUNCTION__DISABLED = eINSTANCE.getDeviceFunction_Disabled();

		/**
		 * The meta object literal for the '<em><b>End Device Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_FUNCTION__END_DEVICE_ASSET = eINSTANCE.getDeviceFunction_EndDeviceAsset();

		/**
		 * The meta object literal for the '<em><b>End Device Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_FUNCTION__END_DEVICE_EVENTS = eINSTANCE.getDeviceFunction_EndDeviceEvents();

		/**
		 * The meta object literal for the '<em><b>Registers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_FUNCTION__REGISTERS = eINSTANCE.getDeviceFunction_Registers();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceGroupImpl <em>End Device Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.EndDeviceGroupImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getEndDeviceGroup()
		 * @generated
		 */
		EClass END_DEVICE_GROUP = eINSTANCE.getEndDeviceGroup();

		/**
		 * The meta object literal for the '<em><b>Demand Response Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM = eINSTANCE.getEndDeviceGroup_DemandResponseProgram();

		/**
		 * The meta object literal for the '<em><b>Group Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_GROUP__GROUP_ADDRESS = eINSTANCE.getEndDeviceGroup_GroupAddress();

		/**
		 * The meta object literal for the '<em><b>End Device Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_GROUP__END_DEVICE_ASSETS = eINSTANCE.getEndDeviceGroup_EndDeviceAssets();

		/**
		 * The meta object literal for the '<em><b>End Device Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_GROUP__END_DEVICE_CONTROLS = eINSTANCE.getEndDeviceGroup_EndDeviceControls();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.DynamicDemandImpl <em>Dynamic Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.DynamicDemandImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getDynamicDemand()
		 * @generated
		 */
		EClass DYNAMIC_DEMAND = eINSTANCE.getDynamicDemand();

		/**
		 * The meta object literal for the '<em><b>Sub Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_DEMAND__SUB_INTERVAL = eINSTANCE.getDynamicDemand_SubInterval();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_DEMAND__INTERVAL = eINSTANCE.getDynamicDemand_Interval();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_DEMAND__KIND = eINSTANCE.getDynamicDemand_Kind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.IntervalReadingImpl <em>Interval Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.IntervalReadingImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getIntervalReading()
		 * @generated
		 */
		EClass INTERVAL_READING = eINSTANCE.getIntervalReading();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_READING__VALUE = eINSTANCE.getIntervalReading_Value();

		/**
		 * The meta object literal for the '<em><b>Reading Qualities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL_READING__READING_QUALITIES = eINSTANCE.getIntervalReading_ReadingQualities();

		/**
		 * The meta object literal for the '<em><b>Interval Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL_READING__INTERVAL_BLOCKS = eINSTANCE.getIntervalReading_IntervalBlocks();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.SDPLocationImpl <em>SDP Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.SDPLocationImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getSDPLocation()
		 * @generated
		 */
		EClass SDP_LOCATION = eINSTANCE.getSDPLocation();

		/**
		 * The meta object literal for the '<em><b>Access Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDP_LOCATION__ACCESS_METHOD = eINSTANCE.getSDPLocation_AccessMethod();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDP_LOCATION__REMARK = eINSTANCE.getSDPLocation_Remark();

		/**
		 * The meta object literal for the '<em><b>Site Access Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDP_LOCATION__SITE_ACCESS_PROBLEM = eINSTANCE.getSDPLocation_SiteAccessProblem();

		/**
		 * The meta object literal for the '<em><b>Occupancy Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDP_LOCATION__OCCUPANCY_DATE = eINSTANCE.getSDPLocation_OccupancyDate();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDP_LOCATION__SERVICE_DELIVERY_POINTS = eINSTANCE.getSDPLocation_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl <em>End Device Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getEndDeviceAsset()
		 * @generated
		 */
		EClass END_DEVICE_ASSET = eINSTANCE.getEndDeviceAsset();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__DISCONNECT = eINSTANCE.getEndDeviceAsset_Disconnect();

		/**
		 * The meta object literal for the '<em><b>Relay Capable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__RELAY_CAPABLE = eINSTANCE.getEndDeviceAsset_RelayCapable();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__READINGS = eINSTANCE.getEndDeviceAsset_Readings();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__SERVICE_DELIVERY_POINT = eINSTANCE.getEndDeviceAsset_ServiceDeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>Metrology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__METROLOGY = eINSTANCE.getEndDeviceAsset_Metrology();

		/**
		 * The meta object literal for the '<em><b>Rated Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__RATED_VOLTAGE = eINSTANCE.getEndDeviceAsset_RatedVoltage();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__RATED_CURRENT = eINSTANCE.getEndDeviceAsset_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Time Zone Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__TIME_ZONE_OFFSET = eINSTANCE.getEndDeviceAsset_TimeZoneOffset();

		/**
		 * The meta object literal for the '<em><b>Service Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__SERVICE_LOCATION = eINSTANCE.getEndDeviceAsset_ServiceLocation();

		/**
		 * The meta object literal for the '<em><b>End Device Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__END_DEVICE_CONTROLS = eINSTANCE.getEndDeviceAsset_EndDeviceControls();

		/**
		 * The meta object literal for the '<em><b>End Device Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__END_DEVICE_MODEL = eINSTANCE.getEndDeviceAsset_EndDeviceModel();

		/**
		 * The meta object literal for the '<em><b>Read Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__READ_REQUEST = eINSTANCE.getEndDeviceAsset_ReadRequest();

		/**
		 * The meta object literal for the '<em><b>Dst Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__DST_ENABLED = eINSTANCE.getEndDeviceAsset_DstEnabled();

		/**
		 * The meta object literal for the '<em><b>Phase Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__PHASE_COUNT = eINSTANCE.getEndDeviceAsset_PhaseCount();

		/**
		 * The meta object literal for the '<em><b>Device Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__DEVICE_FUNCTIONS = eINSTANCE.getEndDeviceAsset_DeviceFunctions();

		/**
		 * The meta object literal for the '<em><b>Reverse Flow Handling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__REVERSE_FLOW_HANDLING = eINSTANCE.getEndDeviceAsset_ReverseFlowHandling();

		/**
		 * The meta object literal for the '<em><b>Demand Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__DEMAND_RESPONSE = eINSTANCE.getEndDeviceAsset_DemandResponse();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__CUSTOMER = eINSTANCE.getEndDeviceAsset_Customer();

		/**
		 * The meta object literal for the '<em><b>Amr System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__AMR_SYSTEM = eINSTANCE.getEndDeviceAsset_AmrSystem();

		/**
		 * The meta object literal for the '<em><b>Load Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__LOAD_CONTROL = eINSTANCE.getEndDeviceAsset_LoadControl();

		/**
		 * The meta object literal for the '<em><b>Outage Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_ASSET__OUTAGE_REPORT = eINSTANCE.getEndDeviceAsset_OutageReport();

		/**
		 * The meta object literal for the '<em><b>End Device Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__END_DEVICE_GROUPS = eINSTANCE.getEndDeviceAsset_EndDeviceGroups();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.IntervalBlockImpl <em>Interval Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.IntervalBlockImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getIntervalBlock()
		 * @generated
		 */
		EClass INTERVAL_BLOCK = eINSTANCE.getIntervalBlock();

		/**
		 * The meta object literal for the '<em><b>Meter Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL_BLOCK__METER_READING = eINSTANCE.getIntervalBlock_MeterReading();

		/**
		 * The meta object literal for the '<em><b>Interval Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL_BLOCK__INTERVAL_READINGS = eINSTANCE.getIntervalBlock_IntervalReadings();

		/**
		 * The meta object literal for the '<em><b>Pending</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL_BLOCK__PENDING = eINSTANCE.getIntervalBlock_Pending();

		/**
		 * The meta object literal for the '<em><b>Reading Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL_BLOCK__READING_TYPE = eINSTANCE.getIntervalBlock_ReadingType();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ReadingQualityImpl <em>Reading Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.ReadingQualityImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getReadingQuality()
		 * @generated
		 */
		EClass READING_QUALITY = eINSTANCE.getReadingQuality();

		/**
		 * The meta object literal for the '<em><b>Interval Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_QUALITY__INTERVAL_READING = eINSTANCE.getReadingQuality_IntervalReading();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_QUALITY__QUALITY = eINSTANCE.getReadingQuality_Quality();

		/**
		 * The meta object literal for the '<em><b>Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_QUALITY__READING = eINSTANCE.getReadingQuality_Reading();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl <em>Meter Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeterAssetImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getMeterAsset()
		 * @generated
		 */
		EClass METER_ASSET = eINSTANCE.getMeterAsset();

		/**
		 * The meta object literal for the '<em><b>Meter Asset Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET__METER_ASSET_MODEL = eINSTANCE.getMeterAsset_MeterAssetModel();

		/**
		 * The meta object literal for the '<em><b>Vending Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET__VENDING_TRANSACTIONS = eINSTANCE.getMeterAsset_VendingTransactions();

		/**
		 * The meta object literal for the '<em><b>KR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET__KR = eINSTANCE.getMeterAsset_KR();

		/**
		 * The meta object literal for the '<em><b>Meter Service Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET__METER_SERVICE_WORKS = eINSTANCE.getMeterAsset_MeterServiceWorks();

		/**
		 * The meta object literal for the '<em><b>KH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET__KH = eINSTANCE.getMeterAsset_KH();

		/**
		 * The meta object literal for the '<em><b>Form Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_ASSET__FORM_NUMBER = eINSTANCE.getMeterAsset_FormNumber();

		/**
		 * The meta object literal for the '<em><b>Meter Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET__METER_READINGS = eINSTANCE.getMeterAsset_MeterReadings();

		/**
		 * The meta object literal for the '<em><b>Meter Replacement Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET__METER_REPLACEMENT_WORKS = eINSTANCE.getMeterAsset_MeterReplacementWorks();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.MeterReadingImpl <em>Meter Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeterReadingImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getMeterReading()
		 * @generated
		 */
		EClass METER_READING = eINSTANCE.getMeterReading();

		/**
		 * The meta object literal for the '<em><b>End Device Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_READING__END_DEVICE_EVENTS = eINSTANCE.getMeterReading_EndDeviceEvents();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_READING__SERVICE_DELIVERY_POINT = eINSTANCE.getMeterReading_ServiceDeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>Customer Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_READING__CUSTOMER_AGREEMENT = eINSTANCE.getMeterReading_CustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>Meter Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_READING__METER_ASSET = eINSTANCE.getMeterReading_MeterAsset();

		/**
		 * The meta object literal for the '<em><b>Values Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_READING__VALUES_INTERVAL = eINSTANCE.getMeterReading_ValuesInterval();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_READING__READINGS = eINSTANCE.getMeterReading_Readings();

		/**
		 * The meta object literal for the '<em><b>Interval Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_READING__INTERVAL_BLOCKS = eINSTANCE.getMeterReading_IntervalBlocks();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ReadingImpl <em>Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.ReadingImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getReading()
		 * @generated
		 */
		EClass READING = eINSTANCE.getReading();

		/**
		 * The meta object literal for the '<em><b>End Device Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING__END_DEVICE_ASSET = eINSTANCE.getReading_EndDeviceAsset();

		/**
		 * The meta object literal for the '<em><b>Reading Qualities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING__READING_QUALITIES = eINSTANCE.getReading_ReadingQualities();

		/**
		 * The meta object literal for the '<em><b>Meter Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING__METER_READINGS = eINSTANCE.getReading_MeterReadings();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__VALUE = eINSTANCE.getReading_Value();

		/**
		 * The meta object literal for the '<em><b>Reading Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING__READING_TYPE = eINSTANCE.getReading_ReadingType();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl <em>Demand Response Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getDemandResponseProgram()
		 * @generated
		 */
		EClass DEMAND_RESPONSE_PROGRAM = eINSTANCE.getDemandResponseProgram();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS = eINSTANCE.getDemandResponseProgram_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Validity Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL = eINSTANCE.getDemandResponseProgram_ValidityInterval();

		/**
		 * The meta object literal for the '<em><b>End Device Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS = eINSTANCE.getDemandResponseProgram_EndDeviceGroups();

		/**
		 * The meta object literal for the '<em><b>End Device Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS = eINSTANCE.getDemandResponseProgram_EndDeviceControls();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMAND_RESPONSE_PROGRAM__TYPE = eINSTANCE.getDemandResponseProgram_Type();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ComFunctionImpl <em>Com Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.ComFunctionImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getComFunction()
		 * @generated
		 */
		EClass COM_FUNCTION = eINSTANCE.getComFunction();

		/**
		 * The meta object literal for the '<em><b>Two Way</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_FUNCTION__TWO_WAY = eINSTANCE.getComFunction_TwoWay();

		/**
		 * The meta object literal for the '<em><b>Amr Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_FUNCTION__AMR_ADDRESS = eINSTANCE.getComFunction_AmrAddress();

		/**
		 * The meta object literal for the '<em><b>Amr Router</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COM_FUNCTION__AMR_ROUTER = eINSTANCE.getComFunction_AmrRouter();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl <em>Service Delivery Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.ServiceDeliveryPointImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getServiceDeliveryPoint()
		 * @generated
		 */
		EClass SERVICE_DELIVERY_POINT = eINSTANCE.getServiceDeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>Service Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__SERVICE_LOCATION = eINSTANCE.getServiceDeliveryPoint_ServiceLocation();

		/**
		 * The meta object literal for the '<em><b>Power Quality Pricings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__POWER_QUALITY_PRICINGS = eINSTANCE.getServiceDeliveryPoint_PowerQualityPricings();

		/**
		 * The meta object literal for the '<em><b>Phase Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__PHASE_CODE = eINSTANCE.getServiceDeliveryPoint_PhaseCode();

		/**
		 * The meta object literal for the '<em><b>Rated Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__RATED_POWER = eINSTANCE.getServiceDeliveryPoint_RatedPower();

		/**
		 * The meta object literal for the '<em><b>Customer Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT = eINSTANCE.getServiceDeliveryPoint_CustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>Energy Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__ENERGY_CONSUMER = eINSTANCE.getServiceDeliveryPoint_EnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Service Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__SERVICE_CATEGORY = eINSTANCE.getServiceDeliveryPoint_ServiceCategory();

		/**
		 * The meta object literal for the '<em><b>Grounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__GROUNDED = eINSTANCE.getServiceDeliveryPoint_Grounded();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__RATED_CURRENT = eINSTANCE.getServiceDeliveryPoint_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Nominal Service Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__NOMINAL_SERVICE_VOLTAGE = eINSTANCE.getServiceDeliveryPoint_NominalServiceVoltage();

		/**
		 * The meta object literal for the '<em><b>Estimated Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__ESTIMATED_LOAD = eINSTANCE.getServiceDeliveryPoint_EstimatedLoad();

		/**
		 * The meta object literal for the '<em><b>End Device Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS = eINSTANCE.getServiceDeliveryPoint_EndDeviceAssets();

		/**
		 * The meta object literal for the '<em><b>Service Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER = eINSTANCE.getServiceDeliveryPoint_ServiceSupplier();

		/**
		 * The meta object literal for the '<em><b>Pricing Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__PRICING_STRUCTURES = eINSTANCE.getServiceDeliveryPoint_PricingStructures();

		/**
		 * The meta object literal for the '<em><b>Transformer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__TRANSFORMER = eINSTANCE.getServiceDeliveryPoint_Transformer();

		/**
		 * The meta object literal for the '<em><b>Service Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__SERVICE_PRIORITY = eINSTANCE.getServiceDeliveryPoint_ServicePriority();

		/**
		 * The meta object literal for the '<em><b>Meter Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__METER_READINGS = eINSTANCE.getServiceDeliveryPoint_MeterReadings();

		/**
		 * The meta object literal for the '<em><b>SDP Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__SDP_LOCATIONS = eINSTANCE.getServiceDeliveryPoint_SDPLocations();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK = eINSTANCE.getServiceDeliveryPoint_ServiceDeliveryRemark();

		/**
		 * The meta object literal for the '<em><b>Check Billing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__CHECK_BILLING = eINSTANCE.getServiceDeliveryPoint_CheckBilling();

		/**
		 * The meta object literal for the '<em><b>Ctpt Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DELIVERY_POINT__CTPT_REFERENCE = eINSTANCE.getServiceDeliveryPoint_CtptReference();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.RegisterImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Left Digit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__LEFT_DIGIT_COUNT = eINSTANCE.getRegister_LeftDigitCount();

		/**
		 * The meta object literal for the '<em><b>Reading Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__READING_TYPE = eINSTANCE.getRegister_ReadingType();

		/**
		 * The meta object literal for the '<em><b>Device Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__DEVICE_FUNCTION = eINSTANCE.getRegister_DeviceFunction();

		/**
		 * The meta object literal for the '<em><b>Right Digit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__RIGHT_DIGIT_COUNT = eINSTANCE.getRegister_RightDigitCount();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceControlImpl <em>End Device Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.EndDeviceControlImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getEndDeviceControl()
		 * @generated
		 */
		EClass END_DEVICE_CONTROL = eINSTANCE.getEndDeviceControl();

		/**
		 * The meta object literal for the '<em><b>Scheduled Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_CONTROL__SCHEDULED_INTERVAL = eINSTANCE.getEndDeviceControl_ScheduledInterval();

		/**
		 * The meta object literal for the '<em><b>Dr Program Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY = eINSTANCE.getEndDeviceControl_DrProgramMandatory();

		/**
		 * The meta object literal for the '<em><b>Dr Program Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_CONTROL__DR_PROGRAM_LEVEL = eINSTANCE.getEndDeviceControl_DrProgramLevel();

		/**
		 * The meta object literal for the '<em><b>Customer Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_CONTROL__CUSTOMER_AGREEMENT = eINSTANCE.getEndDeviceControl_CustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>End Device Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_CONTROL__END_DEVICE_ASSET = eINSTANCE.getEndDeviceControl_EndDeviceAsset();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_CONTROL__TYPE = eINSTANCE.getEndDeviceControl_Type();

		/**
		 * The meta object literal for the '<em><b>Price Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_DEVICE_CONTROL__PRICE_SIGNAL = eINSTANCE.getEndDeviceControl_PriceSignal();

		/**
		 * The meta object literal for the '<em><b>End Device Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_CONTROL__END_DEVICE_GROUP = eINSTANCE.getEndDeviceControl_EndDeviceGroup();

		/**
		 * The meta object literal for the '<em><b>Demand Response Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM = eINSTANCE.getEndDeviceControl_DemandResponseProgram();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.PendingImpl <em>Pending</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.PendingImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getPending()
		 * @generated
		 */
		EClass PENDING = eINSTANCE.getPending();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENDING__OFFSET = eINSTANCE.getPending_Offset();

		/**
		 * The meta object literal for the '<em><b>Multiply Before Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENDING__MULTIPLY_BEFORE_ADD = eINSTANCE.getPending_MultiplyBeforeAdd();

		/**
		 * The meta object literal for the '<em><b>Scalar Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENDING__SCALAR_FLOAT = eINSTANCE.getPending_ScalarFloat();

		/**
		 * The meta object literal for the '<em><b>Reading Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PENDING__READING_TYPE = eINSTANCE.getPending_ReadingType();

		/**
		 * The meta object literal for the '<em><b>Scalar Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENDING__SCALAR_DENOMINATOR = eINSTANCE.getPending_ScalarDenominator();

		/**
		 * The meta object literal for the '<em><b>Interval Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PENDING__INTERVAL_BLOCKS = eINSTANCE.getPending_IntervalBlocks();

		/**
		 * The meta object literal for the '<em><b>Scalar Numerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENDING__SCALAR_NUMERATOR = eINSTANCE.getPending_ScalarNumerator();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl <em>Electric Metering Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.impl.ElectricMeteringFunctionImpl
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getElectricMeteringFunction()
		 * @generated
		 */
		EClass ELECTRIC_METERING_FUNCTION = eINSTANCE.getElectricMeteringFunction();

		/**
		 * The meta object literal for the '<em><b>Demand Multiplier Applied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER_APPLIED = eINSTANCE.getElectricMeteringFunction_DemandMultiplierApplied();

		/**
		 * The meta object literal for the '<em><b>Transformer CT Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__TRANSFORMER_CT_RATIO = eINSTANCE.getElectricMeteringFunction_TransformerCTRatio();

		/**
		 * The meta object literal for the '<em><b>Billing Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_BillingMultiplier();

		/**
		 * The meta object literal for the '<em><b>Metering Function Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRIC_METERING_FUNCTION__METERING_FUNCTION_CONFIGURATION = eINSTANCE.getElectricMeteringFunction_MeteringFunctionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Current Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__CURRENT_RATING = eINSTANCE.getElectricMeteringFunction_CurrentRating();

		/**
		 * The meta object literal for the '<em><b>Transformer Ratios Applied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__TRANSFORMER_RATIOS_APPLIED = eINSTANCE.getElectricMeteringFunction_TransformerRatiosApplied();

		/**
		 * The meta object literal for the '<em><b>KW Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_KWMultiplier();

		/**
		 * The meta object literal for the '<em><b>Billing Multiplier Applied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER_APPLIED = eINSTANCE.getElectricMeteringFunction_BillingMultiplierApplied();

		/**
		 * The meta object literal for the '<em><b>Demand Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_DemandMultiplier();

		/**
		 * The meta object literal for the '<em><b>KWh Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_KWhMultiplier();

		/**
		 * The meta object literal for the '<em><b>Transformer VT Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__TRANSFORMER_VT_RATIO = eINSTANCE.getElectricMeteringFunction_TransformerVTRatio();

		/**
		 * The meta object literal for the '<em><b>Voltage Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC_METERING_FUNCTION__VOLTAGE_RATING = eINSTANCE.getElectricMeteringFunction_VoltageRating();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.ReadingKind <em>Reading Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.ReadingKind
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getReadingKind()
		 * @generated
		 */
		EEnum READING_KIND = eINSTANCE.getReadingKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.Metering.DemandKind <em>Demand Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.Metering.DemandKind
		 * @see gluemodel.CIM.IEC61968.Metering.impl.MeteringPackageImpl#getDemandKind()
		 * @generated
		 */
		EEnum DEMAND_KIND = eINSTANCE.getDemandKind();

	}

} //MeteringPackage
