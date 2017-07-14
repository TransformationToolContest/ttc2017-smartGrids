/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLoadControl;

import gluemodel.CIM.IEC61968.Common.CommonPackage;

import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

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
 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlFactory
 * @model kind="package"
 * @generated
 */
public interface InfLoadControlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfLoadControl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfLoadControl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfLoadControl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfLoadControlPackage eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtRecordImpl <em>Load Mgmt Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtRecordImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadMgmtRecord()
	 * @generated
	 */
	int LOAD_MGMT_RECORD = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__DESCRIPTION = CommonPackage.ACTIVITY_RECORD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__PATH_NAME = CommonPackage.ACTIVITY_RECORD__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__LOCAL_NAME = CommonPackage.ACTIVITY_RECORD__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Market Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__MARKET_FACTORS = CommonPackage.ACTIVITY_RECORD__MARKET_FACTORS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Load Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__LOAD_REDUCTION = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Mgmt Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Mgmt Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Load Mgmt Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_RECORD_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl <em>Load Mgmt Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadMgmtFunction()
	 * @generated
	 */
	int LOAD_MGMT_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__UUID = MeteringPackage.DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__MRID = MeteringPackage.DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__NAME = MeteringPackage.DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__DESCRIPTION = MeteringPackage.DEVICE_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__PATH_NAME = MeteringPackage.DEVICE_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__MODELING_AUTHORITY_SET = MeteringPackage.DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__LOCAL_NAME = MeteringPackage.DEVICE_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__ALIAS_NAME = MeteringPackage.DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__HARDWARE_ID = MeteringPackage.DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__PROGRAM_ID = MeteringPackage.DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__FIRMWARE_ID = MeteringPackage.DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__ASSET = MeteringPackage.DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__PASSWORD = MeteringPackage.DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__CONFIG_ID = MeteringPackage.DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__COM_EQUIPMENT_ASSET = MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__DISABLED = MeteringPackage.DEVICE_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__END_DEVICE_ASSET = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__END_DEVICE_EVENTS = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__REGISTERS = MeteringPackage.DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Manual Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Auto Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__IS_AUTO_OP = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scheduling Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__SCHEDULING_BASIS = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remote Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Load Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__LOAD_STATUS = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__SWITCHES = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Load Mgmt Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Over Ride Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Load Mgmt Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION_FEATURE_COUNT = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Load Mgmt Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MGMT_FUNCTION_OPERATION_COUNT = MeteringPackage.DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadShedFunctionImpl <em>Load Shed Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadShedFunctionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadShedFunction()
	 * @generated
	 */
	int LOAD_SHED_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__UUID = LOAD_MGMT_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__MRID = LOAD_MGMT_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__NAME = LOAD_MGMT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__DESCRIPTION = LOAD_MGMT_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__PATH_NAME = LOAD_MGMT_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__MODELING_AUTHORITY_SET = LOAD_MGMT_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__LOCAL_NAME = LOAD_MGMT_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__ALIAS_NAME = LOAD_MGMT_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__HARDWARE_ID = LOAD_MGMT_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__PROGRAM_ID = LOAD_MGMT_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__FIRMWARE_ID = LOAD_MGMT_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__ASSET = LOAD_MGMT_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__PASSWORD = LOAD_MGMT_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__CONFIG_ID = LOAD_MGMT_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__COM_EQUIPMENT_ASSET = LOAD_MGMT_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__DISABLED = LOAD_MGMT_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__END_DEVICE_ASSET = LOAD_MGMT_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__END_DEVICE_EVENTS = LOAD_MGMT_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__REGISTERS = LOAD_MGMT_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Manual Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__MANUAL_OVER_RIDE = LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE;

	/**
	 * The feature id for the '<em><b>Is Auto Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__IS_AUTO_OP = LOAD_MGMT_FUNCTION__IS_AUTO_OP;

	/**
	 * The feature id for the '<em><b>Scheduling Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__SCHEDULING_BASIS = LOAD_MGMT_FUNCTION__SCHEDULING_BASIS;

	/**
	 * The feature id for the '<em><b>Remote Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__REMOTE_OVER_RIDE = LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE;

	/**
	 * The feature id for the '<em><b>Load Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__LOAD_STATUS = LOAD_MGMT_FUNCTION__LOAD_STATUS;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__SWITCHES = LOAD_MGMT_FUNCTION__SWITCHES;

	/**
	 * The feature id for the '<em><b>Load Mgmt Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__LOAD_MGMT_RECORDS = LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS;

	/**
	 * The feature id for the '<em><b>Over Ride Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__OVER_RIDE_TIME_OUT = LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Switched Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION__SWITCHED_LOAD = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Shed Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION_FEATURE_COUNT = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Shed Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_SHED_FUNCTION_OPERATION_COUNT = LOAD_MGMT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadLimitFunctionImpl <em>Load Limit Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadLimitFunctionImpl
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadLimitFunction()
	 * @generated
	 */
	int LOAD_LIMIT_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__UUID = LOAD_MGMT_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__MRID = LOAD_MGMT_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__NAME = LOAD_MGMT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__DESCRIPTION = LOAD_MGMT_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__PATH_NAME = LOAD_MGMT_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__MODELING_AUTHORITY_SET = LOAD_MGMT_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__LOCAL_NAME = LOAD_MGMT_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__ALIAS_NAME = LOAD_MGMT_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__HARDWARE_ID = LOAD_MGMT_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__PROGRAM_ID = LOAD_MGMT_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__FIRMWARE_ID = LOAD_MGMT_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__ASSET = LOAD_MGMT_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__PASSWORD = LOAD_MGMT_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__CONFIG_ID = LOAD_MGMT_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__COM_EQUIPMENT_ASSET = LOAD_MGMT_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__DISABLED = LOAD_MGMT_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__END_DEVICE_ASSET = LOAD_MGMT_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__END_DEVICE_EVENTS = LOAD_MGMT_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__REGISTERS = LOAD_MGMT_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Manual Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__MANUAL_OVER_RIDE = LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE;

	/**
	 * The feature id for the '<em><b>Is Auto Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__IS_AUTO_OP = LOAD_MGMT_FUNCTION__IS_AUTO_OP;

	/**
	 * The feature id for the '<em><b>Scheduling Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__SCHEDULING_BASIS = LOAD_MGMT_FUNCTION__SCHEDULING_BASIS;

	/**
	 * The feature id for the '<em><b>Remote Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__REMOTE_OVER_RIDE = LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE;

	/**
	 * The feature id for the '<em><b>Load Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__LOAD_STATUS = LOAD_MGMT_FUNCTION__LOAD_STATUS;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__SWITCHES = LOAD_MGMT_FUNCTION__SWITCHES;

	/**
	 * The feature id for the '<em><b>Load Mgmt Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__LOAD_MGMT_RECORDS = LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS;

	/**
	 * The feature id for the '<em><b>Over Ride Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__OVER_RIDE_TIME_OUT = LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Is Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconnect Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disconnect Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Load Limit Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION_FEATURE_COUNT = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Load Limit Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_LIMIT_FUNCTION_OPERATION_COUNT = LOAD_MGMT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind <em>Load State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadStateKind()
	 * @generated
	 */
	int LOAD_STATE_KIND = 4;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind <em>Load Mgmt Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadMgmtKind()
	 * @generated
	 */
	int LOAD_MGMT_KIND = 5;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord <em>Load Mgmt Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Mgmt Record</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord
	 * @generated
	 */
	EClass getLoadMgmtRecord();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction <em>Load Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Reduction</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction()
	 * @see #getLoadMgmtRecord()
	 * @generated
	 */
	EAttribute getLoadMgmtRecord_LoadReduction();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction <em>Load Mgmt Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Mgmt Function</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction()
	 * @see #getLoadMgmtRecord()
	 * @generated
	 */
	EReference getLoadMgmtRecord_LoadMgmtFunction();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction <em>Load Mgmt Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Mgmt Function</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction
	 * @generated
	 */
	EClass getLoadMgmtFunction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide <em>Manual Over Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Over Ride</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	EAttribute getLoadMgmtFunction_ManualOverRide();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp <em>Is Auto Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Op</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	EAttribute getLoadMgmtFunction_IsAutoOp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis <em>Scheduling Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Basis</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	EAttribute getLoadMgmtFunction_SchedulingBasis();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide <em>Remote Over Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Over Ride</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	EAttribute getLoadMgmtFunction_RemoteOverRide();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus <em>Load Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Status</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	EAttribute getLoadMgmtFunction_LoadStatus();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switches</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	EReference getLoadMgmtFunction_Switches();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords <em>Load Mgmt Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Mgmt Records</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	EReference getLoadMgmtFunction_LoadMgmtRecords();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut <em>Over Ride Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over Ride Time Out</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	EAttribute getLoadMgmtFunction_OverRideTimeOut();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadShedFunction <em>Load Shed Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Shed Function</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadShedFunction
	 * @generated
	 */
	EClass getLoadShedFunction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad <em>Switched Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switched Load</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad()
	 * @see #getLoadShedFunction()
	 * @generated
	 */
	EAttribute getLoadShedFunction_SwitchedLoad();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction <em>Load Limit Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Limit Function</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction
	 * @generated
	 */
	EClass getLoadLimitFunction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp <em>Is Auto Recon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Recon Op</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp()
	 * @see #getLoadLimitFunction()
	 * @generated
	 */
	EAttribute getLoadLimitFunction_IsAutoReconOp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad <em>Maximum Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Load</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad()
	 * @see #getLoadLimitFunction()
	 * @generated
	 */
	EAttribute getLoadLimitFunction_MaximumLoad();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay <em>Reconnect Time Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconnect Time Delay</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay()
	 * @see #getLoadLimitFunction()
	 * @generated
	 */
	EAttribute getLoadLimitFunction_ReconnectTimeDelay();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disconnect Time Delay</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay()
	 * @see #getLoadLimitFunction()
	 * @generated
	 */
	EAttribute getLoadLimitFunction_DisconnectTimeDelay();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind <em>Load State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load State Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind
	 * @generated
	 */
	EEnum getLoadStateKind();

	/**
	 * Returns the meta object for enum '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind <em>Load Mgmt Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load Mgmt Kind</em>'.
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind
	 * @generated
	 */
	EEnum getLoadMgmtKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfLoadControlFactory getInfLoadControlFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtRecordImpl <em>Load Mgmt Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtRecordImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadMgmtRecord()
		 * @generated
		 */
		EClass LOAD_MGMT_RECORD = eINSTANCE.getLoadMgmtRecord();

		/**
		 * The meta object literal for the '<em><b>Load Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_MGMT_RECORD__LOAD_REDUCTION = eINSTANCE.getLoadMgmtRecord_LoadReduction();

		/**
		 * The meta object literal for the '<em><b>Load Mgmt Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION = eINSTANCE.getLoadMgmtRecord_LoadMgmtFunction();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl <em>Load Mgmt Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadMgmtFunction()
		 * @generated
		 */
		EClass LOAD_MGMT_FUNCTION = eINSTANCE.getLoadMgmtFunction();

		/**
		 * The meta object literal for the '<em><b>Manual Over Ride</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE = eINSTANCE.getLoadMgmtFunction_ManualOverRide();

		/**
		 * The meta object literal for the '<em><b>Is Auto Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_MGMT_FUNCTION__IS_AUTO_OP = eINSTANCE.getLoadMgmtFunction_IsAutoOp();

		/**
		 * The meta object literal for the '<em><b>Scheduling Basis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_MGMT_FUNCTION__SCHEDULING_BASIS = eINSTANCE.getLoadMgmtFunction_SchedulingBasis();

		/**
		 * The meta object literal for the '<em><b>Remote Over Ride</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE = eINSTANCE.getLoadMgmtFunction_RemoteOverRide();

		/**
		 * The meta object literal for the '<em><b>Load Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_MGMT_FUNCTION__LOAD_STATUS = eINSTANCE.getLoadMgmtFunction_LoadStatus();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_MGMT_FUNCTION__SWITCHES = eINSTANCE.getLoadMgmtFunction_Switches();

		/**
		 * The meta object literal for the '<em><b>Load Mgmt Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS = eINSTANCE.getLoadMgmtFunction_LoadMgmtRecords();

		/**
		 * The meta object literal for the '<em><b>Over Ride Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT = eINSTANCE.getLoadMgmtFunction_OverRideTimeOut();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadShedFunctionImpl <em>Load Shed Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadShedFunctionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadShedFunction()
		 * @generated
		 */
		EClass LOAD_SHED_FUNCTION = eINSTANCE.getLoadShedFunction();

		/**
		 * The meta object literal for the '<em><b>Switched Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_SHED_FUNCTION__SWITCHED_LOAD = eINSTANCE.getLoadShedFunction_SwitchedLoad();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadLimitFunctionImpl <em>Load Limit Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.LoadLimitFunctionImpl
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadLimitFunction()
		 * @generated
		 */
		EClass LOAD_LIMIT_FUNCTION = eINSTANCE.getLoadLimitFunction();

		/**
		 * The meta object literal for the '<em><b>Is Auto Recon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP = eINSTANCE.getLoadLimitFunction_IsAutoReconOp();

		/**
		 * The meta object literal for the '<em><b>Maximum Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD = eINSTANCE.getLoadLimitFunction_MaximumLoad();

		/**
		 * The meta object literal for the '<em><b>Reconnect Time Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY = eINSTANCE.getLoadLimitFunction_ReconnectTimeDelay();

		/**
		 * The meta object literal for the '<em><b>Disconnect Time Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY = eINSTANCE.getLoadLimitFunction_DisconnectTimeDelay();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind <em>Load State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadStateKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadStateKind()
		 * @generated
		 */
		EEnum LOAD_STATE_KIND = eINSTANCE.getLoadStateKind();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind <em>Load Mgmt Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind
		 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.impl.InfLoadControlPackageImpl#getLoadMgmtKind()
		 * @generated
		 */
		EEnum LOAD_MGMT_KIND = eINSTANCE.getLoadMgmtKind();

	}

} //InfLoadControlPackage
