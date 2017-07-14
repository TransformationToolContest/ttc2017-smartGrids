/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage;

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
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsFactory
 * @model kind="package"
 * @generated
 */
public interface COSEMObjectsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "COSEMObjects";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "objects";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "objects";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	COSEMObjectsPackage eINSTANCE = gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ProgramEntriesImpl <em>Program Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ProgramEntriesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getProgramEntries()
	 * @generated
	 */
	int PROGRAM_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRIES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRIES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Active Firmware Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRIES__ACTIVE_FIRMWARE_IDENTIFIER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRIES__ACTIVE_FIRMWARE_VERSION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Firmware Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRIES__ACTIVE_FIRMWARE_SIGNATURE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Program Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRIES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Program Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ENTRIES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.BillingPeriodValuesImpl <em>Billing Period Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.BillingPeriodValuesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getBillingPeriodValues()
	 * @generated
	 */
	int BILLING_PERIOD_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_PERIOD_VALUES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_PERIOD_VALUES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Billing Period Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_PERIOD_VALUES__BILLING_PERIOD_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Available Billing Periods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_PERIOD_VALUES__NUMBER_AVAILABLE_BILLING_PERIODS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timestamp Recent Billing Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_PERIOD_VALUES__TIMESTAMP_RECENT_BILLING_PERIOD = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Billing Period Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_PERIOD_VALUES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Billing Period Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_PERIOD_VALUES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.TimeEntriesImpl <em>Time Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.TimeEntriesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getTimeEntries()
	 * @generated
	 */
	int TIME_ENTRIES = 2;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Local Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES__LOCAL_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES__LOCAL_DATE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRIES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.UNIXClockImpl <em>UNIX Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.UNIXClockImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getUNIXClock()
	 * @generated
	 */
	int UNIX_CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_CLOCK__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_CLOCK__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_CLOCK__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UNIX Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_CLOCK_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UNIX Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIX_CLOCK_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ModemConfigurationObjectImpl <em>Modem Configuration Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ModemConfigurationObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getModemConfigurationObject()
	 * @generated
	 */
	int MODEM_CONFIGURATION_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEM_CONFIGURATION_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.MODEMCONFIGURATION__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEM_CONFIGURATION_OBJECT__OBI_SCODE = InterfaceClassesPackage.MODEMCONFIGURATION__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Modem Configuration Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEM_CONFIGURATION_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.MODEMCONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modem Configuration Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEM_CONFIGURATION_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.MODEMCONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.AutoConnectObjectImpl <em>Auto Connect Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.AutoConnectObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getAutoConnectObject()
	 * @generated
	 */
	int AUTO_CONNECT_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.AUTO_CONNECT__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT_OBJECT__OBI_SCODE = InterfaceClassesPackage.AUTO_CONNECT__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT_OBJECT__CONNECTION = InterfaceClassesPackage.AUTO_CONNECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auto Connect Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.AUTO_CONNECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auto Connect Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONNECT_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.AUTO_CONNECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.AutoAnswerObjectImpl <em>Auto Answer Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.AutoAnswerObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getAutoAnswerObject()
	 * @generated
	 */
	int AUTO_ANSWER_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.AUTO_ANSWER__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER_OBJECT__OBI_SCODE = InterfaceClassesPackage.AUTO_ANSWER__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER_OBJECT__ANSWER = InterfaceClassesPackage.AUTO_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auto Answer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.AUTO_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auto Answer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_ANSWER_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.AUTO_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ScriptTableImpl <em>Script Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ScriptTableImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getScriptTable()
	 * @generated
	 */
	int SCRIPT_TABLE = 7;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Global Meter Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__GLOBAL_METER_RESET = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MDI Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__MDI_RESET = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tariffication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__TARIFFICATION = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Acitvate Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__ACITVATE_TEST = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activate Normal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__ACTIVATE_NORMAL = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Set Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__SET_OUTPUT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Switch Optical</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__SWITCH_OPTICAL = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Power Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__POWER_QUALITY = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disconnect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__DISCONNECT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__IMAGE = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Push</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__PUSH = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Broadcast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE__BROADCAST = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Script Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Script Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TABLE_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.GlobalMeterResetImpl <em>Global Meter Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.GlobalMeterResetImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getGlobalMeterReset()
	 * @generated
	 */
	int GLOBAL_METER_RESET = 8;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_METER_RESET__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_METER_RESET__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_METER_RESET__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Global Meter Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_METER_RESET_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_METER_RESET___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Global Meter Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_METER_RESET_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MDIResetImpl <em>MDI Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MDIResetImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMDIReset()
	 * @generated
	 */
	int MDI_RESET = 9;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDI_RESET__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDI_RESET__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDI_RESET__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>MDI Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDI_RESET_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDI_RESET___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>MDI Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDI_RESET_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.TarifficationImpl <em>Tariffication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.TarifficationImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getTariffication()
	 * @generated
	 */
	int TARIFFICATION = 10;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFFICATION__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFFICATION__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFFICATION__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Tariffication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFFICATION_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFFICATION___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Tariffication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFFICATION_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ActivateTestModeImpl <em>Activate Test Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ActivateTestModeImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getActivateTestMode()
	 * @generated
	 */
	int ACTIVATE_TEST_MODE = 11;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_TEST_MODE__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_TEST_MODE__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_TEST_MODE__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Activate Test Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_TEST_MODE_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_TEST_MODE___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Activate Test Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_TEST_MODE_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ActivateNormalModeImpl <em>Activate Normal Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ActivateNormalModeImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getActivateNormalMode()
	 * @generated
	 */
	int ACTIVATE_NORMAL_MODE = 12;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_NORMAL_MODE__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_NORMAL_MODE__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_NORMAL_MODE__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Activate Normal Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_NORMAL_MODE_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_NORMAL_MODE___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Activate Normal Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATE_NORMAL_MODE_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.SetOutputSignalImpl <em>Set Output Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.SetOutputSignalImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getSetOutputSignal()
	 * @generated
	 */
	int SET_OUTPUT_SIGNAL = 13;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OUTPUT_SIGNAL__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OUTPUT_SIGNAL__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OUTPUT_SIGNAL__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Set Output Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OUTPUT_SIGNAL_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OUTPUT_SIGNAL___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Set Output Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OUTPUT_SIGNAL_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.SwitchOpticalTestOutputImpl <em>Switch Optical Test Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.SwitchOpticalTestOutputImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getSwitchOpticalTestOutput()
	 * @generated
	 */
	int SWITCH_OPTICAL_TEST_OUTPUT = 14;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPTICAL_TEST_OUTPUT__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPTICAL_TEST_OUTPUT__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPTICAL_TEST_OUTPUT__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Switch Optical Test Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPTICAL_TEST_OUTPUT_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPTICAL_TEST_OUTPUT___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Switch Optical Test Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPTICAL_TEST_OUTPUT_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PowerQualityMeasurementManagementImpl <em>Power Quality Measurement Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PowerQualityMeasurementManagementImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPowerQualityMeasurementManagement()
	 * @generated
	 */
	int POWER_QUALITY_MEASUREMENT_MANAGEMENT = 15;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_MEASUREMENT_MANAGEMENT__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_MEASUREMENT_MANAGEMENT__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_MEASUREMENT_MANAGEMENT__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Power Quality Measurement Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_MEASUREMENT_MANAGEMENT_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_MEASUREMENT_MANAGEMENT___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Power Quality Measurement Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_QUALITY_MEASUREMENT_MANAGEMENT_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.DisconnectControlImpl <em>Disconnect Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.DisconnectControlImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getDisconnectControl()
	 * @generated
	 */
	int DISCONNECT_CONTROL = 16;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Disconnect Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Disconnect Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ImageActivationImpl <em>Image Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ImageActivationImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getImageActivation()
	 * @generated
	 */
	int IMAGE_ACTIVATION = 17;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Image Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Image Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PushImpl <em>Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PushImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPush()
	 * @generated
	 */
	int PUSH = 18;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.BroadcastImpl <em>Broadcast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.BroadcastImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getBroadcast()
	 * @generated
	 */
	int BROADCAST = 19;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST__LOGICAL_NAME = InterfaceClassesPackage.SCRIPTTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST__OBI_SCODE = InterfaceClassesPackage.SCRIPTTABLE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST__INCLUDES = InterfaceClassesPackage.SCRIPTTABLE__INCLUDES;

	/**
	 * The number of structural features of the '<em>Broadcast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_FEATURE_COUNT = InterfaceClassesPackage.SCRIPTTABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST___EXECUTE = InterfaceClassesPackage.SCRIPTTABLE___EXECUTE;

	/**
	 * The number of operations of the '<em>Broadcast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_OPERATION_COUNT = InterfaceClassesPackage.SCRIPTTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.SpecialDaysImpl <em>Special Days</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.SpecialDaysImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getSpecialDays()
	 * @generated
	 */
	int SPECIAL_DAYS = 20;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_DAYS__LOGICAL_NAME = InterfaceClassesPackage.SPECIALDAYSTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_DAYS__OBI_SCODE = InterfaceClassesPackage.SPECIALDAYSTABLE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Special Days</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_DAYS_FEATURE_COUNT = InterfaceClassesPackage.SPECIALDAYSTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Special Days</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_DAYS_OPERATION_COUNT = InterfaceClassesPackage.SPECIALDAYSTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ScheduleObjectImpl <em>Schedule Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ScheduleObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getScheduleObject()
	 * @generated
	 */
	int SCHEDULE_OBJECT = 21;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.SCHEDULE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OBJECT__OBI_SCODE = InterfaceClassesPackage.SCHEDULE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Schedule Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schedule Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ActivityCalendarObjectImpl <em>Activity Calendar Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ActivityCalendarObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getActivityCalendarObject()
	 * @generated
	 */
	int ACTIVITY_CALENDAR_OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALENDAR_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.ACTIVITYCALENDAR__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALENDAR_OBJECT__OBI_SCODE = InterfaceClassesPackage.ACTIVITYCALENDAR__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Activity Calendar Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALENDAR_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.ACTIVITYCALENDAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Calendar Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALENDAR_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.ACTIVITYCALENDAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.RegisterActivationObjectImpl <em>Register Activation Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.RegisterActivationObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getRegisterActivationObject()
	 * @generated
	 */
	int REGISTER_ACTIVATION_OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ACTIVATION_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.REGISTER_ACTIVATION__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ACTIVATION_OBJECT__OBI_SCODE = InterfaceClassesPackage.REGISTER_ACTIVATION__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Register Activation Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ACTIVATION_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.REGISTER_ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Register Activation Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_ACTIVATION_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.REGISTER_ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.SingleActionScheduleObjectImpl <em>Single Action Schedule Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.SingleActionScheduleObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getSingleActionScheduleObject()
	 * @generated
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT = 24;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT__OBI_SCODE = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Disconnect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT__DISCONNECT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Billing Period End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT__BILLING_PERIOD_END = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT__IMAGE = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT__OUTPUT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Push</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT__PUSH = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Single Action Schedule Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Single Action Schedule Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTION_SCHEDULE_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.DisconnectControlScheduleImpl <em>Disconnect Control Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.DisconnectControlScheduleImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getDisconnectControlSchedule()
	 * @generated
	 */
	int DISCONNECT_CONTROL_SCHEDULE = 25;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_SCHEDULE__LOGICAL_NAME = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_SCHEDULE__OBI_SCODE = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Disconnect Control Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_SCHEDULE_FEATURE_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disconnect Control Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_SCHEDULE_OPERATION_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.EndOfBillingPeriodScheduleImpl <em>End Of Billing Period Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.EndOfBillingPeriodScheduleImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getEndOfBillingPeriodSchedule()
	 * @generated
	 */
	int END_OF_BILLING_PERIOD_SCHEDULE = 26;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_BILLING_PERIOD_SCHEDULE__LOGICAL_NAME = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_BILLING_PERIOD_SCHEDULE__OBI_SCODE = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>End Of Billing Period Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_BILLING_PERIOD_SCHEDULE_FEATURE_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Of Billing Period Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_BILLING_PERIOD_SCHEDULE_OPERATION_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ImageActivationScheduleImpl <em>Image Activation Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ImageActivationScheduleImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getImageActivationSchedule()
	 * @generated
	 */
	int IMAGE_ACTIVATION_SCHEDULE = 27;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION_SCHEDULE__LOGICAL_NAME = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION_SCHEDULE__OBI_SCODE = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Image Activation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION_SCHEDULE_FEATURE_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Activation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ACTIVATION_SCHEDULE_OPERATION_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.OutputControlScheduleImpl <em>Output Control Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.OutputControlScheduleImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getOutputControlSchedule()
	 * @generated
	 */
	int OUTPUT_CONTROL_SCHEDULE = 28;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL_SCHEDULE__LOGICAL_NAME = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL_SCHEDULE__OBI_SCODE = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Output Control Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL_SCHEDULE_FEATURE_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Control Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL_SCHEDULE_OPERATION_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PushScheduleImpl <em>Push Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PushScheduleImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPushSchedule()
	 * @generated
	 */
	int PUSH_SCHEDULE = 29;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_SCHEDULE__LOGICAL_NAME = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_SCHEDULE__OBI_SCODE = InterfaceClassesPackage.SINGLEACTIONSCHEDULE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Push Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_SCHEDULE_FEATURE_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Push Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_SCHEDULE_OPERATION_COUNT = InterfaceClassesPackage.SINGLEACTIONSCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.RegisterMonitorObjectImpl <em>Register Monitor Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.RegisterMonitorObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getRegisterMonitorObject()
	 * @generated
	 */
	int REGISTER_MONITOR_OBJECT = 30;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_MONITOR_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.REGISTERMONITOR__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_MONITOR_OBJECT__OBI_SCODE = InterfaceClassesPackage.REGISTERMONITOR__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Register Monitor Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_MONITOR_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.REGISTERMONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Register Monitor Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_MONITOR_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.REGISTERMONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.AlarmMonitorImpl <em>Alarm Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.AlarmMonitorImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getAlarmMonitor()
	 * @generated
	 */
	int ALARM_MONITOR = 31;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_MONITOR__LOGICAL_NAME = InterfaceClassesPackage.REGISTERMONITOR__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_MONITOR__OBI_SCODE = InterfaceClassesPackage.REGISTERMONITOR__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Alarm Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_MONITOR_FEATURE_COUNT = InterfaceClassesPackage.REGISTERMONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alarm Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_MONITOR_OPERATION_COUNT = InterfaceClassesPackage.REGISTERMONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ParameterMonitorObjectImpl <em>Parameter Monitor Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ParameterMonitorObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getParameterMonitorObject()
	 * @generated
	 */
	int PARAMETER_MONITOR_OBJECT = 32;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MONITOR_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PARAMETERMONITOR__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MONITOR_OBJECT__OBI_SCODE = InterfaceClassesPackage.PARAMETERMONITOR__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Parameter Monitor Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MONITOR_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PARAMETERMONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Monitor Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MONITOR_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PARAMETERMONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.LimiterObjectImpl <em>Limiter Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.LimiterObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getLimiterObject()
	 * @generated
	 */
	int LIMITER_OBJECT = 33;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITER_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.LIMITER__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITER_OBJECT__OBI_SCODE = InterfaceClassesPackage.LIMITER__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Limiter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITER_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.LIMITER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Limiter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITER_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.LIMITER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.AccountObjectImpl <em>Account Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.AccountObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getAccountObject()
	 * @generated
	 */
	int ACCOUNT_OBJECT = 34;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.ACCOUNT__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OBJECT__OBI_SCODE = InterfaceClassesPackage.ACCOUNT__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Account Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Account Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.CreditObjectImpl <em>Credit Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.CreditObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getCreditObject()
	 * @generated
	 */
	int CREDIT_OBJECT = 35;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.CREDIT__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_OBJECT__OBI_SCODE = InterfaceClassesPackage.CREDIT__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Credit Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.CREDIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Credit Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.CREDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ChargeObjectImpl <em>Charge Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ChargeObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getChargeObject()
	 * @generated
	 */
	int CHARGE_OBJECT = 36;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.CHARGE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OBJECT__OBI_SCODE = InterfaceClassesPackage.CHARGE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Charge Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.CHARGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Charge Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.CHARGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.TokenGatewayObjectImpl <em>Token Gateway Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.TokenGatewayObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getTokenGatewayObject()
	 * @generated
	 */
	int TOKEN_GATEWAY_OBJECT = 37;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_GATEWAY_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.TOKENGATEWAY__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_GATEWAY_OBJECT__OBI_SCODE = InterfaceClassesPackage.TOKENGATEWAY__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Token Gateway Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_GATEWAY_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.TOKENGATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Token Gateway Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_GATEWAY_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.TOKENGATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MaxCreditLimitImpl <em>Max Credit Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MaxCreditLimitImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMaxCreditLimit()
	 * @generated
	 */
	int MAX_CREDIT_LIMIT = 38;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CREDIT_LIMIT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CREDIT_LIMIT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CREDIT_LIMIT__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Credit Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CREDIT_LIMIT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Credit Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CREDIT_LIMIT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MaxVendLimitImpl <em>Max Vend Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MaxVendLimitImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMaxVendLimit()
	 * @generated
	 */
	int MAX_VEND_LIMIT = 39;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VEND_LIMIT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VEND_LIMIT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VEND_LIMIT__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Vend Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VEND_LIMIT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Vend Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VEND_LIMIT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IECOpticalPortSetupImpl <em>IEC Optical Port Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IECOpticalPortSetupImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIECOpticalPortSetup()
	 * @generated
	 */
	int IEC_OPTICAL_PORT_SETUP = 40;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_OPTICAL_PORT_SETUP__LOGICAL_NAME = InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_OPTICAL_PORT_SETUP__OBI_SCODE = InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC Optical Port Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_OPTICAL_PORT_SETUP_FEATURE_COUNT = InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Optical Port Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_OPTICAL_PORT_SETUP_OPERATION_COUNT = InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IECElectricalPortSetupImpl <em>IEC Electrical Port Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IECElectricalPortSetupImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIECElectricalPortSetup()
	 * @generated
	 */
	int IEC_ELECTRICAL_PORT_SETUP = 41;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ELECTRICAL_PORT_SETUP__LOGICAL_NAME = InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ELECTRICAL_PORT_SETUP__OBI_SCODE = InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC Electrical Port Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ELECTRICAL_PORT_SETUP_FEATURE_COUNT = InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Electrical Port Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ELECTRICAL_PORT_SETUP_OPERATION_COUNT = InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.StandardReadoutImpl <em>Standard Readout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.StandardReadoutImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getStandardReadout()
	 * @generated
	 */
	int STANDARD_READOUT = 42;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>General Local Port Readout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT__GENERAL_LOCAL_PORT_READOUT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General Display Readout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT__GENERAL_DISPLAY_READOUT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternate Display Readout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT__ALTERNATE_DISPLAY_READOUT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Display Readout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT__SERVICE_DISPLAY_READOUT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>List Config Meter Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT__LIST_CONFIG_METER_DATA = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Additional Readout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT__ADDITIONAL_READOUT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Standard Readout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Standard Readout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.StandardReadoutParamImpl <em>Standard Readout Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.StandardReadoutParamImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getStandardReadoutParam()
	 * @generated
	 */
	int STANDARD_READOUT_PARAM = 43;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT_PARAM__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT_PARAM__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Standard Readout Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT_PARAM_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard Readout Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_READOUT_PARAM_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IECHDLCSetupObjectImpl <em>IECHDLC Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IECHDLCSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIECHDLCSetupObject()
	 * @generated
	 */
	int IECHDLC_SETUP_OBJECT = 44;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IECHDLC_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.IEC_HDLC_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IECHDLC_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.IEC_HDLC_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IECHDLC Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IECHDLC_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.IEC_HDLC_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IECHDLC Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IECHDLC_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.IEC_HDLC_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IECTwistedPairSetupObjectImpl <em>IEC Twisted Pair Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IECTwistedPairSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIECTwistedPairSetupObject()
	 * @generated
	 */
	int IEC_TWISTED_PAIR_SETUP_OBJECT = 45;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.IEC_TWISTED_PAIR_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.IEC_TWISTED_PAIR_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC Twisted Pair Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.IEC_TWISTED_PAIR_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Twisted Pair Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.IEC_TWISTED_PAIR_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IECTwistedPairMACAddressSetupImpl <em>IEC Twisted Pair MAC Address Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IECTwistedPairMACAddressSetupImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIECTwistedPairMACAddressSetup()
	 * @generated
	 */
	int IEC_TWISTED_PAIR_MAC_ADDRESS_SETUP = 46;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_MAC_ADDRESS_SETUP__LOGICAL_NAME = InterfaceClassesPackage.MA_CADDRESSSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_MAC_ADDRESS_SETUP__OBI_SCODE = InterfaceClassesPackage.MA_CADDRESSSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC Twisted Pair MAC Address Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_MAC_ADDRESS_SETUP_FEATURE_COUNT = InterfaceClassesPackage.MA_CADDRESSSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Twisted Pair MAC Address Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_MAC_ADDRESS_SETUP_OPERATION_COUNT = InterfaceClassesPackage.MA_CADDRESSSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IECTwistedPairFatalErrorRegisterImpl <em>IEC Twisted Pair Fatal Error Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IECTwistedPairFatalErrorRegisterImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIECTwistedPairFatalErrorRegister()
	 * @generated
	 */
	int IEC_TWISTED_PAIR_FATAL_ERROR_REGISTER = 47;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_FATAL_ERROR_REGISTER__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_FATAL_ERROR_REGISTER__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC Twisted Pair Fatal Error Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_FATAL_ERROR_REGISTER_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Twisted Pair Fatal Error Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TWISTED_PAIR_FATAL_ERROR_REGISTER_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IEC62056_3_1ShortReadoutImpl <em>IEC62056 31Short Readout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IEC62056_3_1ShortReadoutImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIEC62056_3_1ShortReadout()
	 * @generated
	 */
	int IEC62056_31SHORT_READOUT = 48;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62056_31SHORT_READOUT__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62056_31SHORT_READOUT__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC62056 31Short Readout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62056_31SHORT_READOUT_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC62056 31Short Readout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62056_31SHORT_READOUT_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IEC62056_3_1LongReadoutImpl <em>IEC62056 31Long Readout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IEC62056_3_1LongReadoutImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIEC62056_3_1LongReadout()
	 * @generated
	 */
	int IEC62056_31LONG_READOUT = 49;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62056_31LONG_READOUT__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62056_31LONG_READOUT__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC62056 31Long Readout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62056_31LONG_READOUT_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC62056 31Long Readout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62056_31LONG_READOUT_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IEC_62056_3_1AlternateReadoutProfileImpl <em>IEC 62056 31Alternate Readout Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IEC_62056_3_1AlternateReadoutProfileImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIEC_62056_3_1AlternateReadoutProfile()
	 * @generated
	 */
	int IEC_62056_31ALTERNATE_READOUT_PROFILE = 50;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_62056_31ALTERNATE_READOUT_PROFILE__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_62056_31ALTERNATE_READOUT_PROFILE__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC 62056 31Alternate Readout Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_62056_31ALTERNATE_READOUT_PROFILE_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC 62056 31Alternate Readout Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_62056_31ALTERNATE_READOUT_PROFILE_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.M_BusSlavePortSetupObjectImpl <em>MBus Slave Port Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.M_BusSlavePortSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getM_BusSlavePortSetupObject()
	 * @generated
	 */
	int MBUS_SLAVE_PORT_SETUP_OBJECT = 51;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_SLAVE_PORT_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.MBUS_SLAVE_PORT_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_SLAVE_PORT_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.MBUS_SLAVE_PORT_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus Slave Port Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_SLAVE_PORT_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.MBUS_SLAVE_PORT_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus Slave Port Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_SLAVE_PORT_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.MBUS_SLAVE_PORT_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.M_BusClientObjectImpl <em>MBus Client Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.M_BusClientObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getM_BusClientObject()
	 * @generated
	 */
	int MBUS_CLIENT_OBJECT = 52;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CLIENT_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.MBUS_CLIENT__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CLIENT_OBJECT__OBI_SCODE = InterfaceClassesPackage.MBUS_CLIENT__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus Client Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CLIENT_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.MBUS_CLIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus Client Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CLIENT_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.MBUS_CLIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.M_BusValueImpl <em>MBus Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.M_BusValueImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getM_BusValue()
	 * @generated
	 */
	int MBUS_VALUE = 53;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_VALUE__LOGICAL_NAME = InterfaceClassesPackage.EXTENDED_REGISTER__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_VALUE__OBI_SCODE = InterfaceClassesPackage.EXTENDED_REGISTER__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_VALUE__VALUE = InterfaceClassesPackage.EXTENDED_REGISTER__VALUE;

	/**
	 * The feature id for the '<em><b>Scaler unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_VALUE__SCALER_UNIT = InterfaceClassesPackage.EXTENDED_REGISTER__SCALER_UNIT;

	/**
	 * The number of structural features of the '<em>MBus Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_VALUE_FEATURE_COUNT = InterfaceClassesPackage.EXTENDED_REGISTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_VALUE___RESET = InterfaceClassesPackage.EXTENDED_REGISTER___RESET;

	/**
	 * The number of operations of the '<em>MBus Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_VALUE_OPERATION_COUNT = InterfaceClassesPackage.EXTENDED_REGISTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.M_BusProfileGenericImpl <em>MBus Profile Generic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.M_BusProfileGenericImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getM_BusProfileGeneric()
	 * @generated
	 */
	int MBUS_PROFILE_GENERIC = 54;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_PROFILE_GENERIC__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_PROFILE_GENERIC__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus Profile Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_PROFILE_GENERIC_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus Profile Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_PROFILE_GENERIC_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.M_BusDisconnectControlImpl <em>MBus Disconnect Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.M_BusDisconnectControlImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getM_BusDisconnectControl()
	 * @generated
	 */
	int MBUS_DISCONNECT_CONTROL = 55;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DISCONNECT_CONTROL__LOGICAL_NAME = InterfaceClassesPackage.DISCONNECT_CONTROL__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DISCONNECT_CONTROL__OBI_SCODE = InterfaceClassesPackage.DISCONNECT_CONTROL__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DISCONNECT_CONTROL__STATE = InterfaceClassesPackage.DISCONNECT_CONTROL__STATE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DISCONNECT_CONTROL__TRANSITION = InterfaceClassesPackage.DISCONNECT_CONTROL__TRANSITION;

	/**
	 * The number of structural features of the '<em>MBus Disconnect Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DISCONNECT_CONTROL_FEATURE_COUNT = InterfaceClassesPackage.DISCONNECT_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus Disconnect Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DISCONNECT_CONTROL_OPERATION_COUNT = InterfaceClassesPackage.DISCONNECT_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.M_BusControlLogImpl <em>MBus Control Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.M_BusControlLogImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getM_BusControlLog()
	 * @generated
	 */
	int MBUS_CONTROL_LOG = 56;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CONTROL_LOG__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CONTROL_LOG__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus Control Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CONTROL_LOG_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus Control Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_CONTROL_LOG_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.M_BusMasterPortSetupObjectImpl <em>MBus Master Port Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.M_BusMasterPortSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getM_BusMasterPortSetupObject()
	 * @generated
	 */
	int MBUS_MASTER_PORT_SETUP_OBJECT = 57;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_MASTER_PORT_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.MBUS_MASTER_PORT_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_MASTER_PORT_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.MBUS_MASTER_PORT_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus Master Port Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_MASTER_PORT_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.MBUS_MASTER_PORT_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus Master Port Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_MASTER_PORT_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.MBUS_MASTER_PORT_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.WirelessModeQChannelObjectImpl <em>Wireless Mode QChannel Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.WirelessModeQChannelObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getWirelessModeQChannelObject()
	 * @generated
	 */
	int WIRELESS_MODE_QCHANNEL_OBJECT = 58;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRELESS_MODE_QCHANNEL_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.WIRELESS_MODE_QCHANNEL__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRELESS_MODE_QCHANNEL_OBJECT__OBI_SCODE = InterfaceClassesPackage.WIRELESS_MODE_QCHANNEL__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Wireless Mode QChannel Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRELESS_MODE_QCHANNEL_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.WIRELESS_MODE_QCHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wireless Mode QChannel Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRELESS_MODE_QCHANNEL_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.WIRELESS_MODE_QCHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.DLMS_COSEMServerM_BusPortSetupObjectImpl <em>DLMS COSEM Server MBus Port Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.DLMS_COSEMServerM_BusPortSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getDLMS_COSEMServerM_BusPortSetupObject()
	 * @generated
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OBJECT = 59;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DLMS_COSEM_SERVER_MBUS_PORT_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.DLMS_COSEM_SERVER_MBUS_PORT_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>DLMS COSEM Server MBus Port Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DLMS_COSEM_SERVER_MBUS_PORT_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DLMS COSEM Server MBus Port Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.M_BusDiagnosticObjectImpl <em>MBus Diagnostic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.M_BusDiagnosticObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getM_BusDiagnosticObject()
	 * @generated
	 */
	int MBUS_DIAGNOSTIC_OBJECT = 60;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DIAGNOSTIC_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.MBUS_DIAGNOSTIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DIAGNOSTIC_OBJECT__OBI_SCODE = InterfaceClassesPackage.MBUS_DIAGNOSTIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MBus Diagnostic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DIAGNOSTIC_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.MBUS_DIAGNOSTIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBus Diagnostic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBUS_DIAGNOSTIC_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.MBUS_DIAGNOSTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.TCP_UDPSetupObjectImpl <em>TCP UDP Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.TCP_UDPSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getTCP_UDPSetupObject()
	 * @generated
	 */
	int TCP_UDP_SETUP_OBJECT = 61;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_UDP_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.TCP_UD_PSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_UDP_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.TCP_UD_PSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>TCP UDP Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_UDP_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.TCP_UD_PSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCP UDP Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_UDP_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.TCP_UD_PSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IPv4SetupObjectImpl <em>IPv4 Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IPv4SetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIPv4SetupObject()
	 * @generated
	 */
	int IPV4_SETUP_OBJECT = 62;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV4_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.IPV4SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV4_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.IPV4SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IPv4 Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV4_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.IPV4SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPv4 Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV4_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.IPV4SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MACAddressSetupObjectImpl <em>MAC Address Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MACAddressSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMACAddressSetupObject()
	 * @generated
	 */
	int MAC_ADDRESS_SETUP_OBJECT = 63;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.MA_CADDRESSSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.MA_CADDRESSSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>MAC Address Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.MA_CADDRESSSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MAC Address Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.MA_CADDRESSSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PPPSetupObjectImpl <em>PPP Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PPPSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPPPSetupObject()
	 * @generated
	 */
	int PPP_SETUP_OBJECT = 64;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPP_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PP_PSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPP_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.PP_PSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PPP Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPP_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PP_PSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PPP Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPP_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PP_PSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.GPRSModemSetupObjectImpl <em>GPRS Modem Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.GPRSModemSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getGPRSModemSetupObject()
	 * @generated
	 */
	int GPRS_MODEM_SETUP_OBJECT = 65;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRS_MODEM_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.GPRS_MODEM_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRS_MODEM_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.GPRS_MODEM_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>GPRS Modem Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRS_MODEM_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.GPRS_MODEM_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GPRS Modem Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRS_MODEM_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.GPRS_MODEM_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.SMTPSetupObjectImpl <em>SMTP Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.SMTPSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getSMTPSetupObject()
	 * @generated
	 */
	int SMTP_SETUP_OBJECT = 66;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMTP_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.SMT_PSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMTP_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.SMT_PSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SMTP Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMTP_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.SMT_PSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SMTP Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMTP_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.SMT_PSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.GSMDiagnosticObjectImpl <em>GSM Diagnostic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.GSMDiagnosticObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getGSMDiagnosticObject()
	 * @generated
	 */
	int GSM_DIAGNOSTIC_OBJECT = 67;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSM_DIAGNOSTIC_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.GSM_DIAGNOSTIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSM_DIAGNOSTIC_OBJECT__OBI_SCODE = InterfaceClassesPackage.GSM_DIAGNOSTIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>GSM Diagnostic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSM_DIAGNOSTIC_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.GSM_DIAGNOSTIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSM Diagnostic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSM_DIAGNOSTIC_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.GSM_DIAGNOSTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IPv6SetupObjectImpl <em>IPv6 Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IPv6SetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIPv6SetupObject()
	 * @generated
	 */
	int IPV6_SETUP_OBJECT = 68;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.IPV6SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.IPV6SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IPv6 Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.IPV6SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPv6 Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.IPV6SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PushSetupObjectImpl <em>Push Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PushSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPushSetupObject()
	 * @generated
	 */
	int PUSH_SETUP_OBJECT = 69;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PUSHSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.PUSHSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Push Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PUSHSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Push Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PUSHSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.S_FSKPhy_MACSetupObjectImpl <em>SFSK Phy MAC Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.S_FSKPhy_MACSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getS_FSKPhy_MACSetupObject()
	 * @generated
	 */
	int SFSK_PHY_MAC_SETUP_OBJECT = 70;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_PHY_MAC_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.SFSK_PHY_MA_CSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_PHY_MAC_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.SFSK_PHY_MA_CSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSK Phy MAC Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_PHY_MAC_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.SFSK_PHY_MA_CSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSK Phy MAC Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_PHY_MAC_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.SFSK_PHY_MA_CSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.S_FSKActiveInitiatorObjectImpl <em>SFSK Active Initiator Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.S_FSKActiveInitiatorObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getS_FSKActiveInitiatorObject()
	 * @generated
	 */
	int SFSK_ACTIVE_INITIATOR_OBJECT = 71;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_ACTIVE_INITIATOR_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.SFSK_ACTIVEINITIATOR__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_ACTIVE_INITIATOR_OBJECT__OBI_SCODE = InterfaceClassesPackage.SFSK_ACTIVEINITIATOR__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSK Active Initiator Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_ACTIVE_INITIATOR_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.SFSK_ACTIVEINITIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSK Active Initiator Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_ACTIVE_INITIATOR_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.SFSK_ACTIVEINITIATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.S_FSKMACSynchronizationTimeoutsImpl <em>SFSKMAC Synchronization Timeouts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.S_FSKMACSynchronizationTimeoutsImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getS_FSKMACSynchronizationTimeouts()
	 * @generated
	 */
	int SFSKMAC_SYNCHRONIZATION_TIMEOUTS = 72;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMAC_SYNCHRONIZATION_TIMEOUTS__LOGICAL_NAME = InterfaceClassesPackage.SFSKMA_CSYNCTIMEOUTS__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMAC_SYNCHRONIZATION_TIMEOUTS__OBI_SCODE = InterfaceClassesPackage.SFSKMA_CSYNCTIMEOUTS__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSKMAC Synchronization Timeouts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMAC_SYNCHRONIZATION_TIMEOUTS_FEATURE_COUNT = InterfaceClassesPackage.SFSKMA_CSYNCTIMEOUTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSKMAC Synchronization Timeouts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMAC_SYNCHRONIZATION_TIMEOUTS_OPERATION_COUNT = InterfaceClassesPackage.SFSKMA_CSYNCTIMEOUTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.S_FSKMACCountersObjectImpl <em>SFSKMAC Counters Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.S_FSKMACCountersObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getS_FSKMACCountersObject()
	 * @generated
	 */
	int SFSKMAC_COUNTERS_OBJECT = 73;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMAC_COUNTERS_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.SFSKMA_CCOUNTERS__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMAC_COUNTERS_OBJECT__OBI_SCODE = InterfaceClassesPackage.SFSKMA_CCOUNTERS__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSKMAC Counters Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMAC_COUNTERS_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.SFSKMA_CCOUNTERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSKMAC Counters Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSKMAC_COUNTERS_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.SFSKMA_CCOUNTERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IEC61334_4_32LLCSetupObjectImpl <em>IEC61334 432LLC Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IEC61334_4_32LLCSetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIEC61334_4_32LLCSetupObject()
	 * @generated
	 */
	int IEC61334_432LLC_SETUP_OBJECT = 74;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61334_432LLC_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.IEC61334_432LL_CSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61334_432LLC_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.IEC61334_432LL_CSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IEC61334 432LLC Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61334_432LLC_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.IEC61334_432LL_CSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC61334 432LLC Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC61334_432LLC_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.IEC61334_432LL_CSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.S_FSKReportingSystemListObjectImpl <em>SFSK Reporting System List Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.S_FSKReportingSystemListObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getS_FSKReportingSystemListObject()
	 * @generated
	 */
	int SFSK_REPORTING_SYSTEM_LIST_OBJECT = 75;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_REPORTING_SYSTEM_LIST_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.SFSK_REPORTINGSYSTEMLIST__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_REPORTING_SYSTEM_LIST_OBJECT__OBI_SCODE = InterfaceClassesPackage.SFSK_REPORTINGSYSTEMLIST__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>SFSK Reporting System List Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_REPORTING_SYSTEM_LIST_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.SFSK_REPORTINGSYSTEMLIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFSK Reporting System List Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFSK_REPORTING_SYSTEM_LIST_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.SFSK_REPORTINGSYSTEMLIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ISO_IEC8802_2LLCType1SetupObjectImpl <em>ISO IEC8802 2LLC Type1 Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ISO_IEC8802_2LLCType1SetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getISO_IEC8802_2LLCType1SetupObject()
	 * @generated
	 */
	int ISO_IEC8802_2LLC_TYPE1_SETUP_OBJECT = 76;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE1_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.IEC_8802_2LLC_TYPE_1__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE1_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.IEC_8802_2LLC_TYPE_1__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>ISO IEC8802 2LLC Type1 Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE1_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.IEC_8802_2LLC_TYPE_1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISO IEC8802 2LLC Type1 Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE1_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.IEC_8802_2LLC_TYPE_1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ISO_IEC8802_2LLCType2SetupImpl <em>ISO IEC8802 2LLC Type2 Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ISO_IEC8802_2LLCType2SetupImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getISO_IEC8802_2LLCType2Setup()
	 * @generated
	 */
	int ISO_IEC8802_2LLC_TYPE2_SETUP = 77;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE2_SETUP__LOGICAL_NAME = InterfaceClassesPackage.IEC_8802_2LLC_G3_NB__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE2_SETUP__OBI_SCODE = InterfaceClassesPackage.IEC_8802_2LLC_G3_NB__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>ISO IEC8802 2LLC Type2 Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE2_SETUP_FEATURE_COUNT = InterfaceClassesPackage.IEC_8802_2LLC_G3_NB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISO IEC8802 2LLC Type2 Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE2_SETUP_OPERATION_COUNT = InterfaceClassesPackage.IEC_8802_2LLC_G3_NB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ISO_IEC8802_2LLCType3SetupImpl <em>ISO IEC8802 2LLC Type3 Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ISO_IEC8802_2LLCType3SetupImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getISO_IEC8802_2LLCType3Setup()
	 * @generated
	 */
	int ISO_IEC8802_2LLC_TYPE3_SETUP = 78;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE3_SETUP__LOGICAL_NAME = InterfaceClassesPackage.IEC8802_2LLC_TYPE3__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE3_SETUP__OBI_SCODE = InterfaceClassesPackage.IEC8802_2LLC_TYPE3__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>ISO IEC8802 2LLC Type3 Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE3_SETUP_FEATURE_COUNT = InterfaceClassesPackage.IEC8802_2LLC_TYPE3_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISO IEC8802 2LLC Type3 Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO_IEC8802_2LLC_TYPE3_SETUP_OPERATION_COUNT = InterfaceClassesPackage.IEC8802_2LLC_TYPE3_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.t61334_4_32LLCSSCSsetupobjectImpl <em>t61334 432LLCSSC Ssetupobject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.t61334_4_32LLCSSCSsetupobjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#gett61334_4_32LLCSSCSsetupobject()
	 * @generated
	 */
	int T61334_432LLCSSC_SSETUPOBJECT = 79;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T61334_432LLCSSC_SSETUPOBJECT__LOGICAL_NAME = InterfaceClassesPackage.T61334_32_LLC_SSCS_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T61334_432LLCSSC_SSETUPOBJECT__OBI_SCODE = InterfaceClassesPackage.T61334_32_LLC_SSCS_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>t61334 432LLCSSC Ssetupobject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T61334_432LLCSSC_SSETUPOBJECT_FEATURE_COUNT = InterfaceClassesPackage.T61334_32_LLC_SSCS_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>t61334 432LLCSSC Ssetupobject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T61334_432LLCSSC_SSETUPOBJECT_OPERATION_COUNT = InterfaceClassesPackage.T61334_32_LLC_SSCS_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_Physical_layer_counters_objectImpl <em>PRIME NB OFDM PLC Physical layer counters object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_Physical_layer_counters_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPRIME_NB_OFDM_PLC_Physical_layer_counters_object()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_PHYSICAL_LAYER_COUNTERS_OBJECT = 80;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_PHYSICAL_LAYER_COUNTERS_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_PHYSICAL_LAYER_COUNTERS_OBJECT__OBI_SCODE = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC Physical layer counters object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_PHYSICAL_LAYER_COUNTERS_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC Physical layer counters object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_PHYSICAL_LAYER_COUNTERS_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_setup_objectImpl <em>PRIME NB OFDM PLC MAC setup object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_setup_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPRIME_NB_OFDM_PLC_MAC_setup_object()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MAC_SETUP_OBJECT = 81;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MAC setup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MAC setup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_functional_parameters_objectImpl <em>PRIME NB OFDM PLC MAC functional parameters object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_functional_parameters_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPRIME_NB_OFDM_PLC_MAC_functional_parameters_object()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONAL_PARAMETERS_OBJECT = 82;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONAL_PARAMETERS_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONAL_PARAMETERS_OBJECT__OBI_SCODE = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MAC functional parameters object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONAL_PARAMETERS_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MAC functional parameters object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_FUNCTIONAL_PARAMETERS_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_counters_objectImpl <em>PRIME NB OFDM PLC MAC counters object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_counters_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPRIME_NB_OFDM_PLC_MAC_counters_object()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS_OBJECT = 83;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_COUNTERS__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS_OBJECT__OBI_SCODE = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_COUNTERS__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MAC counters object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_COUNTERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MAC counters object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_COUNTERS_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_COUNTERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_network_administration_data_objectImpl <em>PRIME NB OFDM PLC MAC network administration data object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_network_administration_data_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPRIME_NB_OFDM_PLC_MAC_network_administration_data_object()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MAC_NETWORK_ADMINISTRATION_DATA_OBJECT = 84;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_NETWORK_ADMINISTRATION_DATA_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_NETWORK_ADMINISTRATION_DATA_OBJECT__OBI_SCODE = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MAC network administration data object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_NETWORK_ADMINISTRATION_DATA_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MAC network administration data object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_NETWORK_ADMINISTRATION_DATA_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_address_setupImpl <em>PRIME NB OFDM PLC MAC address setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_MAC_address_setupImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPRIME_NB_OFDM_PLC_MAC_address_setup()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_MAC_ADDRESS_SETUP = 85;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_ADDRESS_SETUP__LOGICAL_NAME = InterfaceClassesPackage.MA_CADDRESSSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_ADDRESS_SETUP__OBI_SCODE = InterfaceClassesPackage.MA_CADDRESSSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC MAC address setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_ADDRESS_SETUP_FEATURE_COUNT = InterfaceClassesPackage.MA_CADDRESSSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC MAC address setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_MAC_ADDRESS_SETUP_OPERATION_COUNT = InterfaceClassesPackage.MA_CADDRESSSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_Application_identification_objectImpl <em>PRIME NB OFDM PLC Application identification object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PRIME_NB_OFDM_PLC_Application_identification_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPRIME_NB_OFDM_PLC_Application_identification_object()
	 * @generated
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OBJECT = 86;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OBJECT__OBI_SCODE = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>PRIME NB OFDM PLC Application identification object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PRIME NB OFDM PLC Application identification object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.G3_PLC_MAC_layer_counters_objectImpl <em>G3 PLC MAC layer counters object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.G3_PLC_MAC_layer_counters_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getG3_PLC_MAC_layer_counters_object()
	 * @generated
	 */
	int G3_PLC_MAC_LAYER_COUNTERS_OBJECT = 87;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_LAYER_COUNTERS_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.G3_PLC_MAC_LAYER_COUNTERS__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_LAYER_COUNTERS_OBJECT__OBI_SCODE = InterfaceClassesPackage.G3_PLC_MAC_LAYER_COUNTERS__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>G3 PLC MAC layer counters object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_LAYER_COUNTERS_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.G3_PLC_MAC_LAYER_COUNTERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>G3 PLC MAC layer counters object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_LAYER_COUNTERS_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.G3_PLC_MAC_LAYER_COUNTERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.G3_PLC_MAC_setup_objectImpl <em>G3 PLC MAC setup object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.G3_PLC_MAC_setup_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getG3_PLC_MAC_setup_object()
	 * @generated
	 */
	int G3_PLC_MAC_SETUP_OBJECT = 88;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.G3_PLC_MAC_SETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.G3_PLC_MAC_SETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>G3 PLC MAC setup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.G3_PLC_MAC_SETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>G3 PLC MAC setup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_MAC_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.G3_PLC_MAC_SETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.G3_PLC_6LoWPAN_adaptation_layer_setup_objectImpl <em>G3 PLC 6Lo WPAN adaptation layer setup object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.G3_PLC_6LoWPAN_adaptation_layer_setup_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getG3_PLC_6LoWPAN_adaptation_layer_setup_object()
	 * @generated
	 */
	int G3_PLC_6LO_WPAN_ADAPTATION_LAYER_SETUP_OBJECT = 89;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_6LO_WPAN_ADAPTATION_LAYER_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.G3_PLC_6LO_WPAN__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_6LO_WPAN_ADAPTATION_LAYER_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.G3_PLC_6LO_WPAN__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>G3 PLC 6Lo WPAN adaptation layer setup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_6LO_WPAN_ADAPTATION_LAYER_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.G3_PLC_6LO_WPAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>G3 PLC 6Lo WPAN adaptation layer setup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int G3_PLC_6LO_WPAN_ADAPTATION_LAYER_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.G3_PLC_6LO_WPAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ZigBee_SAS_startup_objectImpl <em>Zig Bee SAS startup object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ZigBee_SAS_startup_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getZigBee_SAS_startup_object()
	 * @generated
	 */
	int ZIG_BEE_SAS_STARTUP_OBJECT = 90;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_STARTUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.ZIG_BEE_SAS_STARTUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_STARTUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.ZIG_BEE_SAS_STARTUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Bee SAS startup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_STARTUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.ZIG_BEE_SAS_STARTUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Bee SAS startup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_STARTUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.ZIG_BEE_SAS_STARTUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ZigBee_SAS_join_objectImpl <em>Zig Bee SAS join object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ZigBee_SAS_join_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getZigBee_SAS_join_object()
	 * @generated
	 */
	int ZIG_BEE_SAS_JOIN_OBJECT = 91;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_JOIN_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.ZIG_BEE_SAS_JOIN__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_JOIN_OBJECT__OBI_SCODE = InterfaceClassesPackage.ZIG_BEE_SAS_JOIN__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Bee SAS join object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_JOIN_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.ZIG_BEE_SAS_JOIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Bee SAS join object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_JOIN_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.ZIG_BEE_SAS_JOIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ZigBee_SAS_APS_fragmentation_objectImpl <em>Zig Bee SAS APS fragmentation object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ZigBee_SAS_APS_fragmentation_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getZigBee_SAS_APS_fragmentation_object()
	 * @generated
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION_OBJECT = 92;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.ZIG_BEE_SAS_APS_FRAGMENTATION__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION_OBJECT__OBI_SCODE = InterfaceClassesPackage.ZIG_BEE_SAS_APS_FRAGMENTATION__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Bee SAS APS fragmentation object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.ZIG_BEE_SAS_APS_FRAGMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Bee SAS APS fragmentation object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_SAS_APS_FRAGMENTATION_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.ZIG_BEE_SAS_APS_FRAGMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ZigBee_network_control_objectImpl <em>Zig Bee network control object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ZigBee_network_control_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getZigBee_network_control_object()
	 * @generated
	 */
	int ZIG_BEE_NETWORK_CONTROL_OBJECT = 93;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_NETWORK_CONTROL_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.ZIG_BEENETWORKCONTROL__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_NETWORK_CONTROL_OBJECT__OBI_SCODE = InterfaceClassesPackage.ZIG_BEENETWORKCONTROL__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Bee network control object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_NETWORK_CONTROL_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.ZIG_BEENETWORKCONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Bee network control object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_NETWORK_CONTROL_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.ZIG_BEENETWORKCONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ZigBee_tunnel_setup_objectImpl <em>Zig Bee tunnel setup object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ZigBee_tunnel_setup_objectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getZigBee_tunnel_setup_object()
	 * @generated
	 */
	int ZIG_BEE_TUNNEL_SETUP_OBJECT = 94;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_TUNNEL_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.ZIG_BEETUNNELSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_TUNNEL_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.ZIG_BEETUNNELSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Zig Bee tunnel setup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_TUNNEL_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.ZIG_BEETUNNELSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zig Bee tunnel setup object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIG_BEE_TUNNEL_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.ZIG_BEETUNNELSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.CurrentAssociationImpl <em>Current Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.CurrentAssociationImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getCurrentAssociation()
	 * @generated
	 */
	int CURRENT_ASSOCIATION = 95;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ASSOCIATION__LOGICAL_NAME = InterfaceClassesPackage.ASSOCIATION_LN__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ASSOCIATION__OBI_SCODE = InterfaceClassesPackage.ASSOCIATION_LN__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>AA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ASSOCIATION__AA = InterfaceClassesPackage.ASSOCIATION_LN__AA;

	/**
	 * The number of structural features of the '<em>Current Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ASSOCIATION_FEATURE_COUNT = InterfaceClassesPackage.ASSOCIATION_LN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_ASSOCIATION_OPERATION_COUNT = InterfaceClassesPackage.ASSOCIATION_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.SAPAssignmentCurrentImpl <em>SAP Assignment Current</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.SAPAssignmentCurrentImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getSAPAssignmentCurrent()
	 * @generated
	 */
	int SAP_ASSIGNMENT_CURRENT = 96;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT_CURRENT__LOGICAL_NAME = InterfaceClassesPackage.SAP_ASSIGNMENT__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT_CURRENT__OBI_SCODE = InterfaceClassesPackage.SAP_ASSIGNMENT__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Ldnname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT_CURRENT__LDNNAME = InterfaceClassesPackage.SAP_ASSIGNMENT__LDNNAME;

	/**
	 * The number of structural features of the '<em>SAP Assignment Current</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT_CURRENT_FEATURE_COUNT = InterfaceClassesPackage.SAP_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SAP Assignment Current</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAP_ASSIGNMENT_CURRENT_OPERATION_COUNT = InterfaceClassesPackage.SAP_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.SecuritySetupObjectImpl <em>Security Setup Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.SecuritySetupObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getSecuritySetupObject()
	 * @generated
	 */
	int SECURITY_SETUP_OBJECT = 97;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SETUP_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.SECURITYSETUP__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SETUP_OBJECT__OBI_SCODE = InterfaceClassesPackage.SECURITYSETUP__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Security Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SETUP_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.SECURITYSETUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Setup Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SETUP_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.SECURITYSETUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.InvocationCounterImpl <em>Invocation Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.InvocationCounterImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getInvocationCounter()
	 * @generated
	 */
	int INVOCATION_COUNTER = 98;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_COUNTER__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_COUNTER__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_COUNTER__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invocation Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_COUNTER_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Invocation Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_COUNTER_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.DataProtectionObjectImpl <em>Data Protection Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.DataProtectionObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getDataProtectionObject()
	 * @generated
	 */
	int DATA_PROTECTION_OBJECT = 99;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTECTION_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATAPROTECTION__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTECTION_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATAPROTECTION__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Data Protection Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTECTION_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATAPROTECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Protection Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROTECTION_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATAPROTECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ImageTransferObjectImpl <em>Image Transfer Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ImageTransferObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getImageTransferObject()
	 * @generated
	 */
	int IMAGE_TRANSFER_OBJECT = 100;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSFER_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.IMAGETRANSFER__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSFER_OBJECT__OBI_SCODE = InterfaceClassesPackage.IMAGETRANSFER__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Image Transfer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSFER_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.IMAGETRANSFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Transfer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSFER_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.IMAGETRANSFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.UtilitiesTableObjectImpl <em>Utilities Table Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.UtilitiesTableObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getUtilitiesTableObject()
	 * @generated
	 */
	int UTILITIES_TABLE_OBJECT = 101;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_TABLE_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.UTILITYTABLES__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_TABLE_OBJECT__OBI_SCODE = InterfaceClassesPackage.UTILITYTABLES__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_TABLE_OBJECT__STANDARD = InterfaceClassesPackage.UTILITYTABLES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_TABLE_OBJECT__MANUFACTURER = InterfaceClassesPackage.UTILITYTABLES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Std Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_TABLE_OBJECT__STD_PENDING = InterfaceClassesPackage.UTILITYTABLES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mfg Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_TABLE_OBJECT__MFG_PENDING = InterfaceClassesPackage.UTILITYTABLES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Utilities Table Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_TABLE_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.UTILITYTABLES_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Utilities Table Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_TABLE_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.UTILITYTABLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.CompactDataObjectImpl <em>Compact Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.CompactDataObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getCompactDataObject()
	 * @generated
	 */
	int COMPACT_DATA_OBJECT = 102;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_DATA_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.COMPACTDATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_DATA_OBJECT__OBI_SCODE = InterfaceClassesPackage.COMPACTDATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Compact buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_DATA_OBJECT__COMPACT_BUFFER = InterfaceClassesPackage.COMPACTDATA__COMPACT_BUFFER;

	/**
	 * The feature id for the '<em><b>Template id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_DATA_OBJECT__TEMPLATE_ID = InterfaceClassesPackage.COMPACTDATA__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Template description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_DATA_OBJECT__TEMPLATE_DESCRIPTION = InterfaceClassesPackage.COMPACTDATA__TEMPLATE_DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Compact Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_DATA_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.COMPACTDATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compact Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPACT_DATA_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.COMPACTDATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.DeviceIDImpl <em>Device ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.DeviceIDImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getDeviceID()
	 * @generated
	 */
	int DEVICE_ID = 103;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MeteringPointIDImpl <em>Metering Point ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MeteringPointIDImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMeteringPointID()
	 * @generated
	 */
	int METERING_POINT_ID = 104;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_ID__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_ID__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_ID__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metering Point ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_ID_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metering Point ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_POINT_ID_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl <em>Parameter Changes Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getParameterChangesObject()
	 * @generated
	 */
	int PARAMETER_CHANGES_OBJECT = 105;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Number Config Program Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__NUMBER_CONFIG_PROGRAM_CHANGES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Last Config Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_LAST_CONFIG_CHANGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Last Switch Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_LAST_SWITCH_CHANGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Last Ripple Control Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_LAST_RIPPLE_CONTROL_CHANGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Security Switches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__STATUS_SECURITY_SWITCHES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Last Calibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_LAST_CALIBRATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date Next Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_NEXT_CONFIG = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Date Activation Passiv Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_ACTIVATION_PASSIV_CALENDAR = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Number Protected Config Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__NUMBER_PROTECTED_CONFIG_CHANGES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Date Last Protected Config Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_LAST_PROTECTED_CONFIG_CHANGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Date Last Clock Synch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_LAST_CLOCK_SYNCH = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Date Last Firmware Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT__DATE_LAST_FIRMWARE_ACTIVATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Parameter Changes Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Parameter Changes Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CHANGES_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.I_O_control_signal_objects_contentsmanufacturerspecificImpl <em>IOcontrol signal objects contentsmanufacturerspecific</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.I_O_control_signal_objects_contentsmanufacturerspecificImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getI_O_control_signal_objects_contentsmanufacturerspecific()
	 * @generated
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMANUFACTURERSPECIFIC = 106;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMANUFACTURERSPECIFIC__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMANUFACTURERSPECIFIC__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMANUFACTURERSPECIFIC__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IOcontrol signal objects contentsmanufacturerspecific</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMANUFACTURERSPECIFIC_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IOcontrol signal objects contentsmanufacturerspecific</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMANUFACTURERSPECIFIC_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.I_O_control_signal_objects_contentsmappedtoareferencetableImpl <em>IOcontrol signal objects contentsmappedtoareferencetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.I_O_control_signal_objects_contentsmappedtoareferencetableImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getI_O_control_signal_objects_contentsmappedtoareferencetable()
	 * @generated
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMAPPEDTOAREFERENCETABLE = 107;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMAPPEDTOAREFERENCETABLE__LOGICAL_NAME = InterfaceClassesPackage.STATUSMAPPING__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMAPPEDTOAREFERENCETABLE__OBI_SCODE = InterfaceClassesPackage.STATUSMAPPING__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IOcontrol signal objects contentsmappedtoareferencetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMAPPEDTOAREFERENCETABLE_FEATURE_COUNT = InterfaceClassesPackage.STATUSMAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IOcontrol signal objects contentsmappedtoareferencetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_CONTENTSMAPPEDTOAREFERENCETABLE_OPERATION_COUNT = InterfaceClassesPackage.STATUSMAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.I_O_control_signal_objects_globalImpl <em>IOcontrol signal objects global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.I_O_control_signal_objects_globalImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getI_O_control_signal_objects_global()
	 * @generated
	 */
	int IOCONTROL_SIGNAL_OBJECTS_GLOBAL = 108;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_GLOBAL__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_GLOBAL__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IOcontrol signal objects global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_GLOBAL_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IOcontrol signal objects global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOCONTROL_SIGNAL_OBJECTS_GLOBAL_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IOControlSignalsManufacturerImpl <em>IO Control Signals Manufacturer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IOControlSignalsManufacturerImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIOControlSignalsManufacturer()
	 * @generated
	 */
	int IO_CONTROL_SIGNALS_MANUFACTURER = 109;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MANUFACTURER__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MANUFACTURER__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MANUFACTURER__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO Control Signals Manufacturer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MANUFACTURER_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IO Control Signals Manufacturer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MANUFACTURER_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IOControlSignalsMappedImpl <em>IO Control Signals Mapped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IOControlSignalsMappedImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIOControlSignalsMapped()
	 * @generated
	 */
	int IO_CONTROL_SIGNALS_MAPPED = 110;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MAPPED__LOGICAL_NAME = InterfaceClassesPackage.STATUSMAPPING__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MAPPED__OBI_SCODE = InterfaceClassesPackage.STATUSMAPPING__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IO Control Signals Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MAPPED_FEATURE_COUNT = InterfaceClassesPackage.STATUSMAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IO Control Signals Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_MAPPED_OPERATION_COUNT = InterfaceClassesPackage.STATUSMAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.IOControlSignalsGlobalImpl <em>IO Control Signals Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.IOControlSignalsGlobalImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getIOControlSignalsGlobal()
	 * @generated
	 */
	int IO_CONTROL_SIGNALS_GLOBAL = 111;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_GLOBAL__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_GLOBAL__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>IO Control Signals Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_GLOBAL_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IO Control Signals Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_SIGNALS_GLOBAL_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.DisconnectControlObjectImpl <em>Disconnect Control Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.DisconnectControlObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getDisconnectControlObject()
	 * @generated
	 */
	int DISCONNECT_CONTROL_OBJECT = 112;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DISCONNECT_CONTROL__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_OBJECT__OBI_SCODE = InterfaceClassesPackage.DISCONNECT_CONTROL__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_OBJECT__STATE = InterfaceClassesPackage.DISCONNECT_CONTROL__STATE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_OBJECT__TRANSITION = InterfaceClassesPackage.DISCONNECT_CONTROL__TRANSITION;

	/**
	 * The number of structural features of the '<em>Disconnect Control Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DISCONNECT_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disconnect Control Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_CONTROL_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DISCONNECT_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.GeneralPurposeArbitratorImpl <em>General Purpose Arbitrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.GeneralPurposeArbitratorImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getGeneralPurposeArbitrator()
	 * @generated
	 */
	int GENERAL_PURPOSE_ARBITRATOR = 113;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_ARBITRATOR__LOGICAL_NAME = InterfaceClassesPackage.ARBITRATOR__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_ARBITRATOR__OBI_SCODE = InterfaceClassesPackage.ARBITRATOR__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>General Purpose Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_ARBITRATOR_FEATURE_COUNT = InterfaceClassesPackage.ARBITRATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Purpose Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_ARBITRATOR_OPERATION_COUNT = InterfaceClassesPackage.ARBITRATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.InternalControlManuImpl <em>Internal Control Manu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.InternalControlManuImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getInternalControlManu()
	 * @generated
	 */
	int INTERNAL_CONTROL_MANU = 114;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MANU__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MANU__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MANU__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Control Manu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MANU_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Internal Control Manu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MANU_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.InternalControlMappedImpl <em>Internal Control Mapped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.InternalControlMappedImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getInternalControlMapped()
	 * @generated
	 */
	int INTERNAL_CONTROL_MAPPED = 115;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MAPPED__LOGICAL_NAME = InterfaceClassesPackage.STATUSMAPPING__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MAPPED__OBI_SCODE = InterfaceClassesPackage.STATUSMAPPING__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Internal Control Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MAPPED_FEATURE_COUNT = InterfaceClassesPackage.STATUSMAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Control Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_MAPPED_OPERATION_COUNT = InterfaceClassesPackage.STATUSMAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.InternalControlGlobalImpl <em>Internal Control Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.InternalControlGlobalImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getInternalControlGlobal()
	 * @generated
	 */
	int INTERNAL_CONTROL_GLOBAL = 116;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_GLOBAL__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_GLOBAL__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Internal Control Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_GLOBAL_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Control Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONTROL_GLOBAL_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.InternalOperatingStatusManuImpl <em>Internal Operating Status Manu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.InternalOperatingStatusManuImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getInternalOperatingStatusManu()
	 * @generated
	 */
	int INTERNAL_OPERATING_STATUS_MANU = 117;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_MANU__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_MANU__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Internal Operating Status Manu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_MANU_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Operating Status Manu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_MANU_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.InternalOperatingStatusMappedImpl <em>Internal Operating Status Mapped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.InternalOperatingStatusMappedImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getInternalOperatingStatusMapped()
	 * @generated
	 */
	int INTERNAL_OPERATING_STATUS_MAPPED = 118;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_MAPPED__LOGICAL_NAME = InterfaceClassesPackage.STATUSMAPPING__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_MAPPED__OBI_SCODE = InterfaceClassesPackage.STATUSMAPPING__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Internal Operating Status Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_MAPPED_FEATURE_COUNT = InterfaceClassesPackage.STATUSMAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Operating Status Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_MAPPED_OPERATION_COUNT = InterfaceClassesPackage.STATUSMAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.InternalOperatingStatusGlobalImpl <em>Internal Operating Status Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.InternalOperatingStatusGlobalImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getInternalOperatingStatusGlobal()
	 * @generated
	 */
	int INTERNAL_OPERATING_STATUS_GLOBAL = 119;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_GLOBAL__LOGICAL_NAME = InterfaceClassesPackage.REGISTERTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_GLOBAL__OBI_SCODE = InterfaceClassesPackage.REGISTERTABLE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Internal Operating Status Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_GLOBAL_FEATURE_COUNT = InterfaceClassesPackage.REGISTERTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Operating Status Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OPERATING_STATUS_GLOBAL_OPERATION_COUNT = InterfaceClassesPackage.REGISTERTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.StatusRegisterManuImpl <em>Status Register Manu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.StatusRegisterManuImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getStatusRegisterManu()
	 * @generated
	 */
	int STATUS_REGISTER_MANU = 120;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_MANU__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_MANU__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Status Register Manu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_MANU_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status Register Manu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_MANU_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.StatusRegisterMappedImpl <em>Status Register Mapped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.StatusRegisterMappedImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getStatusRegisterMapped()
	 * @generated
	 */
	int STATUS_REGISTER_MAPPED = 121;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_MAPPED__LOGICAL_NAME = InterfaceClassesPackage.STATUSMAPPING__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_MAPPED__OBI_SCODE = InterfaceClassesPackage.STATUSMAPPING__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Status Register Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_MAPPED_FEATURE_COUNT = InterfaceClassesPackage.STATUSMAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status Register Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_MAPPED_OPERATION_COUNT = InterfaceClassesPackage.STATUSMAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ErrorRegisterObjectImpl <em>Error Register Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ErrorRegisterObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getErrorRegisterObject()
	 * @generated
	 */
	int ERROR_REGISTER_OBJECT = 122;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_REGISTER_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_REGISTER_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_REGISTER_OBJECT__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Register Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_REGISTER_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Register Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_REGISTER_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ErrorProfileObjectImpl <em>Error Profile Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ErrorProfileObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getErrorProfileObject()
	 * @generated
	 */
	int ERROR_PROFILE_OBJECT = 123;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROFILE_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROFILE_OBJECT__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Error Profile Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROFILE_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Error Profile Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROFILE_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ErrorTableObjectImpl <em>Error Table Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ErrorTableObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getErrorTableObject()
	 * @generated
	 */
	int ERROR_TABLE_OBJECT = 124;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TABLE_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.REGISTERTABLE__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TABLE_OBJECT__OBI_SCODE = InterfaceClassesPackage.REGISTERTABLE__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Error Table Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TABLE_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.REGISTERTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Error Table Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TABLE_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.REGISTERTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.AlarmRegisterObjectImpl <em>Alarm Register Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.AlarmRegisterObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getAlarmRegisterObject()
	 * @generated
	 */
	int ALARM_REGISTER_OBJECT = 125;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REGISTER_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REGISTER_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REGISTER_OBJECT__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alarm Register Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REGISTER_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alarm Register Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_REGISTER_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.AlarmFilterObjectImpl <em>Alarm Filter Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.AlarmFilterObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getAlarmFilterObject()
	 * @generated
	 */
	int ALARM_FILTER_OBJECT = 126;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FILTER_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FILTER_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FILTER_OBJECT__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alarm Filter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FILTER_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alarm Filter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FILTER_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.AlarmDescriptorObjectImpl <em>Alarm Descriptor Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.AlarmDescriptorObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getAlarmDescriptorObject()
	 * @generated
	 */
	int ALARM_DESCRIPTOR_OBJECT = 127;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_DESCRIPTOR_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_DESCRIPTOR_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_DESCRIPTOR_OBJECT__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alarm Descriptor Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_DESCRIPTOR_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alarm Descriptor Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_DESCRIPTOR_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.EventLogImpl <em>Event Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.EventLogImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getEventLog()
	 * @generated
	 */
	int EVENT_LOG = 128;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LOG__LOGICAL_NAME = InterfaceClassesPackage.PROFILEGENERIC__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LOG__OBI_SCODE = InterfaceClassesPackage.PROFILEGENERIC__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Event Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LOG_FEATURE_COUNT = InterfaceClassesPackage.PROFILEGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LOG_OPERATION_COUNT = InterfaceClassesPackage.PROFILEGENERIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityIDImpl <em>Electricity ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityIDImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityID()
	 * @generated
	 */
	int ELECTRICITY_ID = 129;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_ID__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_ID__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_ID__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Electricity ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_ID_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Electricity ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_ID_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl <em>Electricity Program Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityProgramEntriesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityProgramEntries()
	 * @generated
	 */
	int ELECTRICITY_PROGRAM_ENTRIES = 130;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Activefirmwareidentifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWAREIDENTIFIER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameterrecordnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__PARAMETERRECORDNUMBER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timeswitchprogramnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__TIMESWITCHPROGRAMNUMBER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>RC Rprogramnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__RC_RPROGRAMNUMBER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meterconnectiondiagram ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__METERCONNECTIONDIAGRAM_ID = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Passivecalendarname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__PASSIVECALENDARNAME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activefirmwaresignature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES__ACTIVEFIRMWARESIGNATURE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Electricity Program Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Electricity Program Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_PROGRAM_ENTRIES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.OutputPulseValues_constantsImpl <em>Output Pulse Values constants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.OutputPulseValues_constantsImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getOutputPulseValues_constants()
	 * @generated
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS = 131;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Activeenergymetrological LED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__ACTIVEENERGYMETROLOGICAL_LED = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reactiveenergymetrological LED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__REACTIVEENERGYMETROLOGICAL_LED = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Apparentenergymetrological LED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__APPARENTENERGYMETROLOGICAL_LED = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activeenergyoutputpulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__ACTIVEENERGYOUTPUTPULSE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reactiveenergyoutputpulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__REACTIVEENERGYOUTPUTPULSE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Apparentenergyoutputpulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__APPARENTENERGYOUTPUTPULSE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Volt squaredhoursmetrological LED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__VOLT_SQUAREDHOURSMETROLOGICAL_LED = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ampere squaredhoursmetrological LED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__AMPERE_SQUAREDHOURSMETROLOGICAL_LED = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Volt squaredhoursoutputpulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__VOLT_SQUAREDHOURSOUTPUTPULSE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ampere squaredhoursoutputpulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS__AMPERE_SQUAREDHOURSOUTPUTPULSE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Output Pulse Values constants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Output Pulse Values constants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PULSE_VALUES_CONSTANTS_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl <em>Reading Factor And CT VTratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ReadingFactorAndCT_VTratioImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	int READING_FACTOR_AND_CT_VTRATIO = 132;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Readingfactorforpower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORPOWER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Readingfactorforenergy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__READINGFACTORFORENERGY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformerratio currentzaehler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTZAEHLER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformerratio voltagezaehler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGEZAEHLER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Overalltransformerratiozaehler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMERRATIOZAEHLER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transformerratio currentnenner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_CURRENTNENNER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transformerratio voltagenenner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__TRANSFORMERRATIO_VOLTAGENENNER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Overalltransformer rationenner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO__OVERALLTRANSFORMER_RATIONENNER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Reading Factor And CT VTratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Reading Factor And CT VTratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FACTOR_AND_CT_VTRATIO_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityNominalValuesImpl <em>Electricity Nominal Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityNominalValuesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityNominalValues()
	 * @generated
	 */
	int ELECTRICITY_NOMINAL_VALUES = 133;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES__VOLTAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nominalcurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES__NOMINALCURRENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES__FREQUENCY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximumcurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES__MAXIMUMCURRENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference voltage for power quality measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_POWER_QUALITY_MEASUREMENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reference voltage for aux power supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES__REFERENCE_VOLTAGE_FOR_AUX_POWER_SUPPLY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Electricity Nominal Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Electricity Nominal Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_NOMINAL_VALUES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl <em>Input Pulse Values Or Constants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getInputPulseValuesOrConstants()
	 * @generated
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS = 134;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Active Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reactive energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Apparent energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volt squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__VOLT_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ampere squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__AMPERE_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unitless quantities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__UNITLESS_QUANTITIES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Active energy export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY_EXPORT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reactive energy export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY_EXPORT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Apparent energy export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY_EXPORT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Input Pulse Values Or Constants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Input Pulse Values Or Constants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PULSE_VALUES_OR_CONSTANTS_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl <em>Measurement Period recording Interval billing Period Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MeasurementPeriod_recordingInterval_billingPeriodDurationImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMeasurementPeriod_recordingInterval_billingPeriodDuration()
	 * @generated
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION = 135;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Measurement period 1for averaging scheme 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_1FOR_AVERAGING_SCHEME_1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement period 2for averagingscheme 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_2FOR_AVERAGINGSCHEME_2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurement period 3for instantaneous value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_3FOR_INSTANTANEOUS_VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measurement period 4for test value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__MEASUREMENT_PERIOD_4FOR_TEST_VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recording interval 1for loadprofile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_1FOR_LOADPROFILE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recording interval 2for loadprofile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__RECORDING_INTERVAL_2FOR_LOADPROFILE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Billingperiod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION__BILLINGPERIOD = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Measurement Period recording Interval billing Period Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Measurement Period recording Interval billing Period Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl <em>Electricity Time Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityTimeEntriesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityTimeEntries()
	 * @generated
	 */
	int ELECTRICITY_TIME_ENTRIES = 136;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Time expired since last end of billing period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__TIME_EXPIRED_SINCE_LAST_END_OF_BILLING_PERIOD = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Localtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__LOCALTIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Localdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__LOCALDATE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Weekday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__WEEKDAY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timeoflastreset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__TIMEOFLASTRESET = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dateoflastreset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__DATEOFLASTRESET = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outputpulseduration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__OUTPUTPULSEDURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clocksynchronizationwindow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__CLOCKSYNCHRONIZATIONWINDOW = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Clock synchronization method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__CLOCK_SYNCHRONIZATION_METHOD = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Clock time shift limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__CLOCK_TIME_SHIFT_LIMIT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Billing period reset lockout time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES__BILLING_PERIOD_RESET_LOCKOUT_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Electricity Time Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Electricity Time Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_TIME_ENTRIES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.CoefficientsImpl <em>Coefficients</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.CoefficientsImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getCoefficients()
	 * @generated
	 */
	int COEFFICIENTS = 137;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENTS__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENTS__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Transformer magnetic losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENTS__TRANSFORMER_MAGNETIC_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer iron losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENTS__TRANSFORMER_IRON_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line resistance losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENTS__LINE_RESISTANCE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line reactance losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENTS__LINE_REACTANCE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coefficients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENTS_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Coefficients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COEFFICIENTS_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementMethodsImpl <em>Measurement Methods</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MeasurementMethodsImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMeasurementMethods()
	 * @generated
	 */
	int MEASUREMENT_METHODS = 138;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Algorithm for active power measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_POWER_MEASUREMENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm for active energy management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__ALGORITHM_FOR_ACTIVE_ENERGY_MANAGEMENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Algorithm for reactive power measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_POWER_MEASUREMENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Algorithm for reactive energy measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__ALGORITHM_FOR_REACTIVE_ENERGY_MEASUREMENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Algorithm for apparent power measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_POWER_MEASUREMENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Algorithm for apparent energy measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__ALGORITHM_FOR_APPARENT_ENERGY_MEASUREMENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Algorithm for power factor calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS__ALGORITHM_FOR_POWER_FACTOR_CALCULATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Measurement Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Measurement Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_METHODS_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityMeteringPointIDImpl <em>Electricity Metering Point ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityMeteringPointIDImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityMeteringPointID()
	 * @generated
	 */
	int ELECTRICITY_METERING_POINT_ID = 139;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_METERING_POINT_ID__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_METERING_POINT_ID__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_METERING_POINT_ID__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Electricity Metering Point ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_METERING_POINT_ID_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Electricity Metering Point ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_METERING_POINT_ID_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityRelatedStatusDataImpl <em>Electricity Related Status Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityRelatedStatusDataImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityRelatedStatusData()
	 * @generated
	 */
	int ELECTRICITY_RELATED_STATUS_DATA = 140;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Status information missing voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_VOLTAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status information missing current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_MISSING_CURRENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status information current without voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_CURRENT_WITHOUT_VOLTAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status information auxiliary power supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA__STATUS_INFORMATION_AUXILIARY_POWER_SUPPLY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Electricity Related Status Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Electricity Related Status Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityRelatedStatusDataMappedImpl <em>Electricity Related Status Data Mapped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityRelatedStatusDataMappedImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityRelatedStatusDataMapped()
	 * @generated
	 */
	int ELECTRICITY_RELATED_STATUS_DATA_MAPPED = 141;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA_MAPPED__LOGICAL_NAME = InterfaceClassesPackage.STATUSMAPPING__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA_MAPPED__OBI_SCODE = InterfaceClassesPackage.STATUSMAPPING__OBI_SCODE;

	/**
	 * The number of structural features of the '<em>Electricity Related Status Data Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA_MAPPED_FEATURE_COUNT = InterfaceClassesPackage.STATUSMAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Electricity Related Status Data Mapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_RELATED_STATUS_DATA_MAPPED_OPERATION_COUNT = InterfaceClassesPackage.STATUSMAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.BatteryEntriesImpl <em>Battery Entries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.BatteryEntriesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getBatteryEntries()
	 * @generated
	 */
	int BATTERY_ENTRIES = 142;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Battery use time counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__BATTERY_USE_TIME_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Battery charge display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__BATTERY_CHARGE_DISPLAY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date of next battery change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__DATE_OF_NEXT_BATTERY_CHANGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Battery voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__BATTERY_VOLTAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Battery initial capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__BATTERY_INITIAL_CAPACITY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Battery installation date and time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__BATTERY_INSTALLATION_DATE_AND_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Battery estimated remaining use time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__BATTERY_ESTIMATED_REMAINING_USE_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Aux supply use time counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__AUX_SUPPLY_USE_TIME_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Aux voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES__AUX_VOLTAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Battery Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Battery Entries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_ENTRIES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl <em>Power Failure Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.PowerFailureMonitoringImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getPowerFailureMonitoring()
	 * @generated
	 */
	int POWER_FAILURE_MONITORING = 143;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Failures All Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__FAILURES_ALL_PHASES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failures L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__FAILURES_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failures L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__FAILURES_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failures L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__FAILURES_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Failures Any</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__FAILURES_ANY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Auxiliarysupply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__AUXILIARYSUPPLY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Long Fails All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__LONG_FAILS_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Long Fails L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__LONG_FAILS_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Long Fails L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__LONG_FAILS_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Long Fails L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__LONG_FAILS_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Long Fails Any</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__LONG_FAILS_ANY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Time All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__TIME_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Time L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__TIME_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Time L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__TIME_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Time L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__TIME_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Time Any</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__TIME_ANY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Duration All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__DURATION_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Duration L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__DURATION_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Duration L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__DURATION_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Duration L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__DURATION_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Duration Any</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__DURATION_ANY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Time threshold long powerfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING__TIME_THRESHOLD_LONG_POWERFAILURE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Power Failure Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Power Failure Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FAILURE_MONITORING_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.OperatingTimeImpl <em>Operating Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.OperatingTimeImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getOperatingTime()
	 * @generated
	 */
	int OPERATING_TIME = 144;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_TIME__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_TIME__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Timeofoperation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_TIME__TIMEOFOPERATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operating Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_TIME_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operating Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_TIME_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.EnvironmentRelatedParametersImpl <em>Environment Related Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.EnvironmentRelatedParametersImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getEnvironmentRelatedParameters()
	 * @generated
	 */
	int ENVIRONMENT_RELATED_PARAMETERS = 145;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS__LOGICAL_NAME = InterfaceClassesPackage.REGISTER__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS__OBI_SCODE = InterfaceClassesPackage.REGISTER__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS__VALUE = InterfaceClassesPackage.REGISTER__VALUE;

	/**
	 * The feature id for the '<em><b>Scaler unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS__SCALER_UNIT = InterfaceClassesPackage.REGISTER__SCALER_UNIT;

	/**
	 * The feature id for the '<em><b>Ambient temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_TEMPERATURE = InterfaceClassesPackage.REGISTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ambient pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS__AMBIENT_PRESSURE = InterfaceClassesPackage.REGISTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relative humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS__RELATIVE_HUMIDITY = InterfaceClassesPackage.REGISTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Environment Related Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS_FEATURE_COUNT = InterfaceClassesPackage.REGISTER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS___RESET = InterfaceClassesPackage.REGISTER___RESET;

	/**
	 * The number of operations of the '<em>Environment Related Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_RELATED_PARAMETERS_OPERATION_COUNT = InterfaceClassesPackage.REGISTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.StatusRegisterImpl <em>Status Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.StatusRegisterImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getStatusRegister()
	 * @generated
	 */
	int STATUS_REGISTER = 146;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER__LOGICAL_NAME = InterfaceClassesPackage.REGISTER__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER__OBI_SCODE = InterfaceClassesPackage.REGISTER__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER__VALUE = InterfaceClassesPackage.REGISTER__VALUE;

	/**
	 * The feature id for the '<em><b>Scaler unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER__SCALER_UNIT = InterfaceClassesPackage.REGISTER__SCALER_UNIT;

	/**
	 * The number of structural features of the '<em>Status Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_FEATURE_COUNT = InterfaceClassesPackage.REGISTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER___RESET = InterfaceClassesPackage.REGISTER___RESET;

	/**
	 * The number of operations of the '<em>Status Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_REGISTER_OPERATION_COUNT = InterfaceClassesPackage.REGISTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.EventCodeImpl <em>Event Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.EventCodeImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getEventCode()
	 * @generated
	 */
	int EVENT_CODE = 147;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CODE__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CODE__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Event code object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CODE__EVENT_CODE_OBJECT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CODE_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CODE_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.CommunicationPortLogParametersImpl <em>Communication Port Log Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.CommunicationPortLogParametersImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getCommunicationPortLogParameters()
	 * @generated
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS = 148;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS__RESERVED = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS__NUMBER_CONNECTIONS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication port parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATION_PORT_PARAMETER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>GSM field strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS__GSM_FIELD_STRENGTH = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Communicationaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS__COMMUNICATIONADDRESS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Communication Port Log Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Communication Port Log Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_LOG_PARAMETERS_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ConsumerMessageImpl <em>Consumer Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ConsumerMessageImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getConsumerMessage()
	 * @generated
	 */
	int CONSUMER_MESSAGE = 149;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_MESSAGE__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_MESSAGE__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Consumer message via local consumer information port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_LOCAL_CONSUMER_INFORMATION_PORT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumer message via meter display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_MESSAGE__CONSUMER_MESSAGE_VIA_METER_DISPLAY = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Consumer Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_MESSAGE_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Consumer Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_MESSAGE_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.CurrentlyActiveTariffImpl <em>Currently Active Tariff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.CurrentlyActiveTariffImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getCurrentlyActiveTariff()
	 * @generated
	 */
	int CURRENTLY_ACTIVE_TARIFF = 150;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENTLY_ACTIVE_TARIFF__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENTLY_ACTIVE_TARIFF__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENTLY_ACTIVE_TARIFF__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Currently Active Tariff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENTLY_ACTIVE_TARIFF_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Currently Active Tariff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENTLY_ACTIVE_TARIFF_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.EventCounterObjectImpl <em>Event Counter Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.EventCounterObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getEventCounterObject()
	 * @generated
	 */
	int EVENT_COUNTER_OBJECT = 151;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COUNTER_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COUNTER_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COUNTER_OBJECT__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Counter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COUNTER_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Counter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COUNTER_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ProfileEntryDigitalSignatureObjectImpl <em>Profile Entry Digital Signature Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ProfileEntryDigitalSignatureObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getProfileEntryDigitalSignatureObject()
	 * @generated
	 */
	int PROFILE_ENTRY_DIGITAL_SIGNATURE_OBJECT = 152;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_ENTRY_DIGITAL_SIGNATURE_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_ENTRY_DIGITAL_SIGNATURE_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_ENTRY_DIGITAL_SIGNATURE_OBJECT__VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Profile Entry Digital Signature Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_ENTRY_DIGITAL_SIGNATURE_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Profile Entry Digital Signature Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_ENTRY_DIGITAL_SIGNATURE_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl <em>Meter Temper Event Related Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MeterTemperEventRelatedObjectImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMeterTemperEventRelatedObject()
	 * @generated
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT = 153;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Meter open event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter open event timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_TIMESTAMP = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meter open event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meter open event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__METER_OPEN_EVENT_CUMULATIVE_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Terminal cover open event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Terminal cover open event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Terminal cover open event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Terminal cover open event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__TERMINAL_COVER_OPEN_EVENT_CUMULATIVE_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tilt event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tilt event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tilt event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tilt event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__TILT_EVENT_CUMULATIVE_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Strong DC magnetic field event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Strong DC magnetic field event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Strong DC magnetic field event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Strong DC magnetic field event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__STRONG_DC_MAGNETIC_FIELD_EVENT_CUMULATIVE_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Supply control switch event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Supply control switch event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Supply control switch event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Supply control switch event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__SUPPLY_CONTROL_SWITCH_EVENT_CUMULATIVE_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Metrology tamper event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Metrology tamper event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Metrology tamper event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Metrology tamper event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__METROLOGY_TAMPER_EVENT_CUMULATIVE_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Communication tamper event counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Communication tamper event time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_TIME = InterfaceClassesPackage.DATA_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Communication tamper event duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Communication tamper event cumulative duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__COMMUNICATION_TAMPER_EVENT_CUMULATIVE_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Manufacturer specific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT__MANUFACTURER_SPECIFIC = InterfaceClassesPackage.DATA_FEATURE_COUNT + 28;

	/**
	 * The number of structural features of the '<em>Meter Temper Event Related Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 29;

	/**
	 * The number of operations of the '<em>Meter Temper Event Related Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TEMPER_EVENT_RELATED_OBJECT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityValuesImpl <em>Electricity Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityValuesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityValues()
	 * @generated
	 */
	int ELECTRICITY_VALUES = 154;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Active Powerp L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWERP_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Powerpall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWERPALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Powerp L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWERP_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active Powerp L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWERP_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active Powerm L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWERM_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active Powerm L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWERM_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Active Powerm L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWERM_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Active Powermall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWERMALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reactive Powerp L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWERP_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reactive Powerp L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWERP_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reactive Powerp L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWERP_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reactive Powerpall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWERPALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reactive Powerm L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWERM_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reactive Powerm L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWERM_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reactive Powerm L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWERM_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reactive Powermall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWERMALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reactive Power QIL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reactive Power QIL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Reactive Power QIL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Reactive Power QIall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Reactive Power QIIL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIIL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Reactive Power QIIL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIIL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Reactive Power QIIL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIIL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Reactive Power QI Iall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QI_IALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Reactive Power QIIIL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Reactive Power QIIIL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Reactive Power QIIIL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Reactive Power QII Iall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QII_IALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Reactive Power QIVL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIVL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Reactive Power QIVL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIVL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Reactive Power QIVL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QIVL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Reactive Power QI Vall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__REACTIVE_POWER_QI_VALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Apparent Powerp L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__APPARENT_POWERP_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Apparent Powerp L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__APPARENT_POWERP_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Apparent Powerp L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__APPARENT_POWERP_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Apparent Powerp All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__APPARENT_POWERP_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Apparent Powerm L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__APPARENT_POWERM_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Apparent Powerm L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__APPARENT_POWERM_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Apparent Powerm L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__APPARENT_POWERM_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Apparent Powerm All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__APPARENT_POWERM_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Current L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__CURRENT_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Current L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__CURRENT_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Current L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__CURRENT_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Current All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__CURRENT_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Voltage L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__VOLTAGE_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Voltage L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__VOLTAGE_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Voltage L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__VOLTAGE_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Voltage All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__VOLTAGE_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Power Factor L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__POWER_FACTOR_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Power Factor L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__POWER_FACTOR_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Power Factor L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__POWER_FACTOR_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Power Factor All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__POWER_FACTOR_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Supply Frequency L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Supply Frequency L2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Supply Frequency L3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Supply Frequency All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__SUPPLY_FREQUENCY_ALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Active Power Abs PL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Active Power Abs PL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Active Power Abs PL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Active Power Abs PAll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Active Power Abs ML1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Active Power Abs ML2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Active Power Abs ML3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Active Power Abs MAll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_ABS_MALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Active Power QIL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Active Power QIL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Active Power QIL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Active Power QIall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Active Power QIIL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIIL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Active Power QIIL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIIL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Active Power QIIL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIIL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Active Power QI Iall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QI_IALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Active Power QIIIL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Active Power QIIIL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Active Power QIIIL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>Active Power QII Iall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QII_IALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>Active Power QIVL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIVL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>Active Power QIVL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIVL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>Active Power QIVL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QIVL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>Active Power QI Vall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ACTIVE_POWER_QI_VALL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 79;

	/**
	 * The feature id for the '<em><b>Angles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__ANGLES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 80;

	/**
	 * The feature id for the '<em><b>Pulses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__PULSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 81;

	/**
	 * The feature id for the '<em><b>Ampere squared Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__AMPERE_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 82;

	/**
	 * The feature id for the '<em><b>Volt squared Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__VOLT_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 83;

	/**
	 * The feature id for the '<em><b>Neutral Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__NEUTRAL_CURRENT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 84;

	/**
	 * The feature id for the '<em><b>Neutral Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES__NEUTRAL_VOLTAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 85;

	/**
	 * The number of structural features of the '<em>Electricity Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 86;

	/**
	 * The number of operations of the '<em>Electricity Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_VALUES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.MeasurementValuesImpl <em>Measurement Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.MeasurementValuesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getMeasurementValues()
	 * @generated
	 */
	int MEASUREMENT_VALUES = 155;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Billing period average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__BILLING_PERIOD_AVERAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cumulative minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__CUMULATIVE_MINIMUM = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cumulative maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__CUMULATIVE_MAXIMUM = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__MINIMUM = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__CURRENT_AVERAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__LAST_AVERAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__MAXIMUM = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Instantaneous value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__INSTANTANEOUS_VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Time integral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__TIME_INTEGRAL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Under limit threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__UNDER_LIMIT_THRESHOLD = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Under limit occurrence counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__UNDER_LIMIT_OCCURRENCE_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Under limit duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__UNDER_LIMIT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Under limit magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__UNDER_LIMIT_MAGNITUDE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Over limit threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__OVER_LIMIT_THRESHOLD = InterfaceClassesPackage.DATA_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Over limit occurrence counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__OVER_LIMIT_OCCURRENCE_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Over limit duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__OVER_LIMIT_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Over limit magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__OVER_LIMIT_MAGNITUDE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Missing threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__MISSING_THRESHOLD = InterfaceClassesPackage.DATA_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Missing occurrence counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__MISSING_OCCURRENCE_COUNTER = InterfaceClassesPackage.DATA_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Missing duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__MISSING_DURATION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Missing magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__MISSING_MAGNITUDE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Time threshold for under limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_UNDER_LIMIT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Time threshold for over limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_OVER_LIMIT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Time threshold for missing magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__TIME_THRESHOLD_FOR_MISSING_MAGNITUDE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Contracted value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__CONTRACTED_VALUE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Minimum for recording interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__MINIMUM_FOR_RECORDING_INTERVAL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Maximum for recording interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__MAXIMUM_FOR_RECORDING_INTERVAL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Test average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__TEST_AVERAGE = InterfaceClassesPackage.DATA_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Calculations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES__CALCULATIONS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 28;

	/**
	 * The number of structural features of the '<em>Measurement Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 29;

	/**
	 * The number of operations of the '<em>Measurement Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_VALUES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl <em>Electricity Harmonics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ElectricityHarmonicsImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getElectricityHarmonics()
	 * @generated
	 */
	int ELECTRICITY_HARMONICS = 156;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__TOTAL = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fundamental harmonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__FUNDAMENTAL_HARMONIC = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Harmonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__HARMONIC = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Total Harmoni Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__TOTAL_HARMONI_DISTORTION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total Demand Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__TOTAL_DEMAND_DISTORTION = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All harmonics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__ALL_HARMONICS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All harmonics to nominal value ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS__ALL_HARMONICS_TO_NOMINAL_VALUE_RATIO = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Electricity Harmonics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Electricity Harmonics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICITY_HARMONICS_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl <em>Extended Phase Angle Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.ExtendedPhaseAngleMeasurementImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT = 157;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>From UL 1to UL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From UL 1to UL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_UL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From UL 1to IL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From UL 1to IL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From UL 1to IL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From UL 1to IL0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_1TO_IL0 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From UL 2to UL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From UL 2to UL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_UL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From UL 2to IL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>From UL 2to IL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>From UL 2to IL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>From UL 2to IL0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_2TO_IL0 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>From UL 3to UL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>From UL 3to UL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_UL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>From UL 3to IL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>From UL 3to IL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>From UL 3to IL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>From UL 3to IL0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_UL_3TO_IL0 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>From IL 1to UL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>From IL 1to UL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>From IL 1to UL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_UL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>From IL 1to IL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>From IL 1to IL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>From IL 1to IL0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_1TO_IL0 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>From IL 2to UL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>From IL 2to UL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>From IL 2to UL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_UL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>From IL 2to IL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>From IL 2to IL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>From IL 2to IL0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_2TO_IL0 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>From IL 3to UL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>From IL 3to UL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>From IL 3to UL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_UL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>From IL 3to IL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>From IL 3to IL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>From IL 3to IL0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_3TO_IL0 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>From IL 0to UL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>From IL 0to UL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>From IL 0to UL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_UL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>From IL 0to IL1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL1 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>From IL 0to IL2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL2 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>From IL 0to IL3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT__FROM_IL_0TO_IL3 = InterfaceClassesPackage.DATA_FEATURE_COUNT + 41;

	/**
	 * The number of structural features of the '<em>Extended Phase Angle Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 42;

	/**
	 * The number of operations of the '<em>Extended Phase Angle Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PHASE_ANGLE_MEASUREMENT_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl <em>Transformer And Line Losses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.COSEMObjects.impl.TransformerAndLineLossesImpl
	 * @see gluemodel.COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl#getTransformerAndLineLosses()
	 * @generated
	 */
	int TRANSFORMER_AND_LINE_LOSSES = 158;

	/**
	 * The feature id for the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__LOGICAL_NAME = InterfaceClassesPackage.DATA__LOGICAL_NAME;

	/**
	 * The feature id for the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__OBI_SCODE = InterfaceClassesPackage.DATA__OBI_SCODE;

	/**
	 * The feature id for the '<em><b>Active line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LINE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Active losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Active losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Active losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__ACTIVE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reactive line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reactive line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reactive line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LINE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reactive transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reactive transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reactive transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reactive losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reactive losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reactive losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__REACTIVE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Total normalized transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Total normalized line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__TOTAL_NORMALIZED_LINE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Compensated active gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Compensated active net P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Compensated active gross M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_GROSS_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Compensated active net M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_ACTIVE_NET_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Compensated reactive gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Compensated reactive net P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Compensated reactive gross M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_GROSS_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Compensated reactive net M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__COMPENSATED_REACTIVE_NET_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>L1active line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>L1active line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LINE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>L1active transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>L1active transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>L1active transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>L1active losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>L1active losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>L1active losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1ACTIVE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>L1reactive line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>L1reactive line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>L1reactive line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_LINE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>L1reactive transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>L1reactive transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>L1reactive transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1REACTIVE_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>L1 Reactive losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>L1 Reactive losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>L1 Reactive losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1_REACTIVE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>L1 Ampere squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1_AMPERE_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>L1 Volt squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L1_VOLT_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>L2active line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>L2active line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LINE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>L2active transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>L2active transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>L2active transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>L2active losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>L2active losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>L2active losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2ACTIVE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>L2reactive line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>L2reactive line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>L2reactive line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LINE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>L2reactive transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>L2reactive transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>L2reactive transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_TRANSFORMER_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>L2reactive losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>L2reactive losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>L2reactive losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2REACTIVE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>L2 Ampere squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2_AMPERE_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>L2 Volt squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L2_VOLT_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>L3 Active line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>L3 Active line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3_ACTIVE_LINE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>L3active transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>L3active transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>L3active transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>L3active losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>L3active losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>L3active losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3ACTIVE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>L3reactive line losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>L3reactive line losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>L3reactive line losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LINE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>L3reactive transformer losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>L3reactive transformer losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>L3reactive transformer losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_TRANSFORMER_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 79;

	/**
	 * The feature id for the '<em><b>L3reactive losses P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_P = InterfaceClassesPackage.DATA_FEATURE_COUNT + 80;

	/**
	 * The feature id for the '<em><b>L3reactive losses M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES_M = InterfaceClassesPackage.DATA_FEATURE_COUNT + 81;

	/**
	 * The feature id for the '<em><b>L3reactive losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3REACTIVE_LOSSES = InterfaceClassesPackage.DATA_FEATURE_COUNT + 82;

	/**
	 * The feature id for the '<em><b>L3 Ampere squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3_AMPERE_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 83;

	/**
	 * The feature id for the '<em><b>L3 Volt Squared hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES__L3_VOLT_SQUARED_HOURS = InterfaceClassesPackage.DATA_FEATURE_COUNT + 84;

	/**
	 * The number of structural features of the '<em>Transformer And Line Losses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES_FEATURE_COUNT = InterfaceClassesPackage.DATA_FEATURE_COUNT + 85;

	/**
	 * The number of operations of the '<em>Transformer And Line Losses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_AND_LINE_LOSSES_OPERATION_COUNT = InterfaceClassesPackage.DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ProgramEntries <em>Program Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Entries</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ProgramEntries
	 * @generated
	 */
	EClass getProgramEntries();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareIdentifier <em>Active Firmware Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Firmware Identifier</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareIdentifier()
	 * @see #getProgramEntries()
	 * @generated
	 */
	EAttribute getProgramEntries_ActiveFirmwareIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareVersion <em>Active Firmware Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Firmware Version</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareVersion()
	 * @see #getProgramEntries()
	 * @generated
	 */
	EAttribute getProgramEntries_ActiveFirmwareVersion();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareSignature <em>Active Firmware Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Firmware Signature</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ProgramEntries#getActiveFirmwareSignature()
	 * @see #getProgramEntries()
	 * @generated
	 */
	EAttribute getProgramEntries_ActiveFirmwareSignature();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues <em>Billing Period Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing Period Values</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BillingPeriodValues
	 * @generated
	 */
	EClass getBillingPeriodValues();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getBillingPeriodCounter <em>Billing Period Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Period Counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getBillingPeriodCounter()
	 * @see #getBillingPeriodValues()
	 * @generated
	 */
	EAttribute getBillingPeriodValues_BillingPeriodCounter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getNumberAvailableBillingPeriods <em>Number Available Billing Periods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Available Billing Periods</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getNumberAvailableBillingPeriods()
	 * @see #getBillingPeriodValues()
	 * @generated
	 */
	EAttribute getBillingPeriodValues_NumberAvailableBillingPeriods();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getTimestampRecentBillingPeriod <em>Timestamp Recent Billing Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp Recent Billing Period</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BillingPeriodValues#getTimestampRecentBillingPeriod()
	 * @see #getBillingPeriodValues()
	 * @generated
	 */
	EAttribute getBillingPeriodValues_TimestampRecentBillingPeriod();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.TimeEntries <em>Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Entries</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TimeEntries
	 * @generated
	 */
	EClass getTimeEntries();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TimeEntries#getLocalTime <em>Local Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TimeEntries#getLocalTime()
	 * @see #getTimeEntries()
	 * @generated
	 */
	EAttribute getTimeEntries_LocalTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TimeEntries#getLocalDate <em>Local Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Date</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TimeEntries#getLocalDate()
	 * @see #getTimeEntries()
	 * @generated
	 */
	EAttribute getTimeEntries_LocalDate();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.UNIXClock <em>UNIX Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UNIX Clock</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.UNIXClock
	 * @generated
	 */
	EClass getUNIXClock();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.UNIXClock#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.UNIXClock#getValue()
	 * @see #getUNIXClock()
	 * @generated
	 */
	EAttribute getUNIXClock_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ModemConfigurationObject <em>Modem Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modem Configuration Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ModemConfigurationObject
	 * @generated
	 */
	EClass getModemConfigurationObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.AutoConnectObject <em>Auto Connect Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Connect Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AutoConnectObject
	 * @generated
	 */
	EClass getAutoConnectObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.AutoConnectObject#isConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AutoConnectObject#isConnection()
	 * @see #getAutoConnectObject()
	 * @generated
	 */
	EAttribute getAutoConnectObject_Connection();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.AutoAnswerObject <em>Auto Answer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Answer Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AutoAnswerObject
	 * @generated
	 */
	EClass getAutoAnswerObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.AutoAnswerObject#isAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AutoAnswerObject#isAnswer()
	 * @see #getAutoAnswerObject()
	 * @generated
	 */
	EAttribute getAutoAnswerObject_Answer();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ScriptTable <em>Script Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Table</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable
	 * @generated
	 */
	EClass getScriptTable();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getGlobalMeterReset <em>Global Meter Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global Meter Reset</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getGlobalMeterReset()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_GlobalMeterReset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getMDIReset <em>MDI Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MDI Reset</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getMDIReset()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_MDIReset();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getTariffication <em>Tariffication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tariffication</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getTariffication()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_Tariffication();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getAcitvateTest <em>Acitvate Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acitvate Test</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getAcitvateTest()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_AcitvateTest();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getActivateNormal <em>Activate Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activate Normal</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getActivateNormal()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_ActivateNormal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getSetOutput <em>Set Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Output</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getSetOutput()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_SetOutput();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getSwitchOptical <em>Switch Optical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switch Optical</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getSwitchOptical()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_SwitchOptical();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getPowerQuality <em>Power Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Quality</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getPowerQuality()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_PowerQuality();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getDisconnect <em>Disconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Disconnect</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getDisconnect()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_Disconnect();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getImage()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_Image();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getPush <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Push</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getPush()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_Push();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.ScriptTable#getBroadcast <em>Broadcast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Broadcast</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable#getBroadcast()
	 * @see #getScriptTable()
	 * @generated
	 */
	EReference getScriptTable_Broadcast();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.GlobalMeterReset <em>Global Meter Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Meter Reset</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.GlobalMeterReset
	 * @generated
	 */
	EClass getGlobalMeterReset();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MDIReset <em>MDI Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDI Reset</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MDIReset
	 * @generated
	 */
	EClass getMDIReset();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.Tariffication <em>Tariffication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tariffication</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.Tariffication
	 * @generated
	 */
	EClass getTariffication();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ActivateTestMode <em>Activate Test Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activate Test Mode</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ActivateTestMode
	 * @generated
	 */
	EClass getActivateTestMode();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ActivateNormalMode <em>Activate Normal Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activate Normal Mode</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ActivateNormalMode
	 * @generated
	 */
	EClass getActivateNormalMode();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.SetOutputSignal <em>Set Output Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Output Signal</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SetOutputSignal
	 * @generated
	 */
	EClass getSetOutputSignal();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.SwitchOpticalTestOutput <em>Switch Optical Test Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Optical Test Output</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SwitchOpticalTestOutput
	 * @generated
	 */
	EClass getSwitchOpticalTestOutput();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PowerQualityMeasurementManagement <em>Power Quality Measurement Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Quality Measurement Management</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerQualityMeasurementManagement
	 * @generated
	 */
	EClass getPowerQualityMeasurementManagement();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.DisconnectControl <em>Disconnect Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnect Control</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.DisconnectControl
	 * @generated
	 */
	EClass getDisconnectControl();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ImageActivation <em>Image Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Activation</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ImageActivation
	 * @generated
	 */
	EClass getImageActivation();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.Push
	 * @generated
	 */
	EClass getPush();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.Broadcast <em>Broadcast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.Broadcast
	 * @generated
	 */
	EClass getBroadcast();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.SpecialDays <em>Special Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Days</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SpecialDays
	 * @generated
	 */
	EClass getSpecialDays();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ScheduleObject <em>Schedule Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ScheduleObject
	 * @generated
	 */
	EClass getScheduleObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ActivityCalendarObject <em>Activity Calendar Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Calendar Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ActivityCalendarObject
	 * @generated
	 */
	EClass getActivityCalendarObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.RegisterActivationObject <em>Register Activation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Activation Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.RegisterActivationObject
	 * @generated
	 */
	EClass getRegisterActivationObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject <em>Single Action Schedule Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Action Schedule Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject
	 * @generated
	 */
	EClass getSingleActionScheduleObject();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getDisconnect <em>Disconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Disconnect</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getDisconnect()
	 * @see #getSingleActionScheduleObject()
	 * @generated
	 */
	EReference getSingleActionScheduleObject_Disconnect();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getBillingPeriodEnd <em>Billing Period End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Period End</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getBillingPeriodEnd()
	 * @see #getSingleActionScheduleObject()
	 * @generated
	 */
	EReference getSingleActionScheduleObject_BillingPeriodEnd();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getImage()
	 * @see #getSingleActionScheduleObject()
	 * @generated
	 */
	EReference getSingleActionScheduleObject_Image();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getOutput()
	 * @see #getSingleActionScheduleObject()
	 * @generated
	 */
	EReference getSingleActionScheduleObject_Output();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getPush <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Push</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject#getPush()
	 * @see #getSingleActionScheduleObject()
	 * @generated
	 */
	EReference getSingleActionScheduleObject_Push();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.DisconnectControlSchedule <em>Disconnect Control Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnect Control Schedule</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.DisconnectControlSchedule
	 * @generated
	 */
	EClass getDisconnectControlSchedule();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.EndOfBillingPeriodSchedule <em>End Of Billing Period Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Of Billing Period Schedule</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EndOfBillingPeriodSchedule
	 * @generated
	 */
	EClass getEndOfBillingPeriodSchedule();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ImageActivationSchedule <em>Image Activation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Activation Schedule</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ImageActivationSchedule
	 * @generated
	 */
	EClass getImageActivationSchedule();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.OutputControlSchedule <em>Output Control Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Control Schedule</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputControlSchedule
	 * @generated
	 */
	EClass getOutputControlSchedule();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PushSchedule <em>Push Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Schedule</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PushSchedule
	 * @generated
	 */
	EClass getPushSchedule();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.RegisterMonitorObject <em>Register Monitor Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Monitor Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.RegisterMonitorObject
	 * @generated
	 */
	EClass getRegisterMonitorObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.AlarmMonitor <em>Alarm Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Monitor</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmMonitor
	 * @generated
	 */
	EClass getAlarmMonitor();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ParameterMonitorObject <em>Parameter Monitor Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Monitor Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterMonitorObject
	 * @generated
	 */
	EClass getParameterMonitorObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.LimiterObject <em>Limiter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limiter Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.LimiterObject
	 * @generated
	 */
	EClass getLimiterObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.AccountObject <em>Account Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AccountObject
	 * @generated
	 */
	EClass getAccountObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.CreditObject <em>Credit Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CreditObject
	 * @generated
	 */
	EClass getCreditObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ChargeObject <em>Charge Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ChargeObject
	 * @generated
	 */
	EClass getChargeObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.TokenGatewayObject <em>Token Gateway Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Gateway Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TokenGatewayObject
	 * @generated
	 */
	EClass getTokenGatewayObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MaxCreditLimit <em>Max Credit Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Credit Limit</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MaxCreditLimit
	 * @generated
	 */
	EClass getMaxCreditLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MaxCreditLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MaxCreditLimit#getValue()
	 * @see #getMaxCreditLimit()
	 * @generated
	 */
	EAttribute getMaxCreditLimit_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MaxVendLimit <em>Max Vend Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Vend Limit</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MaxVendLimit
	 * @generated
	 */
	EClass getMaxVendLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MaxVendLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MaxVendLimit#getValue()
	 * @see #getMaxVendLimit()
	 * @generated
	 */
	EAttribute getMaxVendLimit_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IECOpticalPortSetup <em>IEC Optical Port Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Optical Port Setup</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IECOpticalPortSetup
	 * @generated
	 */
	EClass getIECOpticalPortSetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IECElectricalPortSetup <em>IEC Electrical Port Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Electrical Port Setup</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IECElectricalPortSetup
	 * @generated
	 */
	EClass getIECElectricalPortSetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.StandardReadout <em>Standard Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Readout</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadout
	 * @generated
	 */
	EClass getStandardReadout();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.StandardReadout#getGeneralLocalPortReadout <em>General Local Port Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Local Port Readout</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadout#getGeneralLocalPortReadout()
	 * @see #getStandardReadout()
	 * @generated
	 */
	EAttribute getStandardReadout_GeneralLocalPortReadout();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.StandardReadout#getGeneralDisplayReadout <em>General Display Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Display Readout</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadout#getGeneralDisplayReadout()
	 * @see #getStandardReadout()
	 * @generated
	 */
	EAttribute getStandardReadout_GeneralDisplayReadout();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.StandardReadout#getAlternateDisplayReadout <em>Alternate Display Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternate Display Readout</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadout#getAlternateDisplayReadout()
	 * @see #getStandardReadout()
	 * @generated
	 */
	EAttribute getStandardReadout_AlternateDisplayReadout();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.StandardReadout#getServiceDisplayReadout <em>Service Display Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Display Readout</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadout#getServiceDisplayReadout()
	 * @see #getStandardReadout()
	 * @generated
	 */
	EAttribute getStandardReadout_ServiceDisplayReadout();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.StandardReadout#getListConfigMeterData <em>List Config Meter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Config Meter Data</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadout#getListConfigMeterData()
	 * @see #getStandardReadout()
	 * @generated
	 */
	EAttribute getStandardReadout_ListConfigMeterData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.StandardReadout#getAdditionalReadout <em>Additional Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Readout</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadout#getAdditionalReadout()
	 * @see #getStandardReadout()
	 * @generated
	 */
	EAttribute getStandardReadout_AdditionalReadout();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.StandardReadoutParam <em>Standard Readout Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Readout Param</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadoutParam
	 * @generated
	 */
	EClass getStandardReadoutParam();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IECHDLCSetupObject <em>IECHDLC Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IECHDLC Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IECHDLCSetupObject
	 * @generated
	 */
	EClass getIECHDLCSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IECTwistedPairSetupObject <em>IEC Twisted Pair Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Twisted Pair Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IECTwistedPairSetupObject
	 * @generated
	 */
	EClass getIECTwistedPairSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IECTwistedPairMACAddressSetup <em>IEC Twisted Pair MAC Address Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Twisted Pair MAC Address Setup</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IECTwistedPairMACAddressSetup
	 * @generated
	 */
	EClass getIECTwistedPairMACAddressSetup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IECTwistedPairFatalErrorRegister <em>IEC Twisted Pair Fatal Error Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Twisted Pair Fatal Error Register</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IECTwistedPairFatalErrorRegister
	 * @generated
	 */
	EClass getIECTwistedPairFatalErrorRegister();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IEC62056_3_1ShortReadout <em>IEC62056 31Short Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC62056 31Short Readout</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IEC62056_3_1ShortReadout
	 * @generated
	 */
	EClass getIEC62056_3_1ShortReadout();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IEC62056_3_1LongReadout <em>IEC62056 31Long Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC62056 31Long Readout</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IEC62056_3_1LongReadout
	 * @generated
	 */
	EClass getIEC62056_3_1LongReadout();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IEC_62056_3_1AlternateReadoutProfile <em>IEC 62056 31Alternate Readout Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC 62056 31Alternate Readout Profile</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IEC_62056_3_1AlternateReadoutProfile
	 * @generated
	 */
	EClass getIEC_62056_3_1AlternateReadoutProfile();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.M_BusSlavePortSetupObject <em>MBus Slave Port Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus Slave Port Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusSlavePortSetupObject
	 * @generated
	 */
	EClass getM_BusSlavePortSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.M_BusClientObject <em>MBus Client Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus Client Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusClientObject
	 * @generated
	 */
	EClass getM_BusClientObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.M_BusValue <em>MBus Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusValue
	 * @generated
	 */
	EClass getM_BusValue();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.M_BusProfileGeneric <em>MBus Profile Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus Profile Generic</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusProfileGeneric
	 * @generated
	 */
	EClass getM_BusProfileGeneric();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.M_BusDisconnectControl <em>MBus Disconnect Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus Disconnect Control</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusDisconnectControl
	 * @generated
	 */
	EClass getM_BusDisconnectControl();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.M_BusControlLog <em>MBus Control Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus Control Log</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusControlLog
	 * @generated
	 */
	EClass getM_BusControlLog();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.M_BusMasterPortSetupObject <em>MBus Master Port Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus Master Port Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusMasterPortSetupObject
	 * @generated
	 */
	EClass getM_BusMasterPortSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.WirelessModeQChannelObject <em>Wireless Mode QChannel Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wireless Mode QChannel Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.WirelessModeQChannelObject
	 * @generated
	 */
	EClass getWirelessModeQChannelObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.DLMS_COSEMServerM_BusPortSetupObject <em>DLMS COSEM Server MBus Port Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DLMS COSEM Server MBus Port Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.DLMS_COSEMServerM_BusPortSetupObject
	 * @generated
	 */
	EClass getDLMS_COSEMServerM_BusPortSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.M_BusDiagnosticObject <em>MBus Diagnostic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBus Diagnostic Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusDiagnosticObject
	 * @generated
	 */
	EClass getM_BusDiagnosticObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.TCP_UDPSetupObject <em>TCP UDP Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP UDP Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TCP_UDPSetupObject
	 * @generated
	 */
	EClass getTCP_UDPSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IPv4SetupObject <em>IPv4 Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPv4 Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IPv4SetupObject
	 * @generated
	 */
	EClass getIPv4SetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MACAddressSetupObject <em>MAC Address Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAC Address Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MACAddressSetupObject
	 * @generated
	 */
	EClass getMACAddressSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PPPSetupObject <em>PPP Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPP Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PPPSetupObject
	 * @generated
	 */
	EClass getPPPSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.GPRSModemSetupObject <em>GPRS Modem Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPRS Modem Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.GPRSModemSetupObject
	 * @generated
	 */
	EClass getGPRSModemSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.SMTPSetupObject <em>SMTP Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMTP Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SMTPSetupObject
	 * @generated
	 */
	EClass getSMTPSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.GSMDiagnosticObject <em>GSM Diagnostic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSM Diagnostic Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.GSMDiagnosticObject
	 * @generated
	 */
	EClass getGSMDiagnosticObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IPv6SetupObject <em>IPv6 Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPv6 Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IPv6SetupObject
	 * @generated
	 */
	EClass getIPv6SetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PushSetupObject <em>Push Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PushSetupObject
	 * @generated
	 */
	EClass getPushSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.S_FSKPhy_MACSetupObject <em>SFSK Phy MAC Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSK Phy MAC Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKPhy_MACSetupObject
	 * @generated
	 */
	EClass getS_FSKPhy_MACSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.S_FSKActiveInitiatorObject <em>SFSK Active Initiator Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSK Active Initiator Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKActiveInitiatorObject
	 * @generated
	 */
	EClass getS_FSKActiveInitiatorObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.S_FSKMACSynchronizationTimeouts <em>SFSKMAC Synchronization Timeouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSKMAC Synchronization Timeouts</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKMACSynchronizationTimeouts
	 * @generated
	 */
	EClass getS_FSKMACSynchronizationTimeouts();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.S_FSKMACCountersObject <em>SFSKMAC Counters Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSKMAC Counters Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKMACCountersObject
	 * @generated
	 */
	EClass getS_FSKMACCountersObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IEC61334_4_32LLCSetupObject <em>IEC61334 432LLC Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC61334 432LLC Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IEC61334_4_32LLCSetupObject
	 * @generated
	 */
	EClass getIEC61334_4_32LLCSetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.S_FSKReportingSystemListObject <em>SFSK Reporting System List Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFSK Reporting System List Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKReportingSystemListObject
	 * @generated
	 */
	EClass getS_FSKReportingSystemListObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType1SetupObject <em>ISO IEC8802 2LLC Type1 Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO IEC8802 2LLC Type1 Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType1SetupObject
	 * @generated
	 */
	EClass getISO_IEC8802_2LLCType1SetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType2Setup <em>ISO IEC8802 2LLC Type2 Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO IEC8802 2LLC Type2 Setup</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType2Setup
	 * @generated
	 */
	EClass getISO_IEC8802_2LLCType2Setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType3Setup <em>ISO IEC8802 2LLC Type3 Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO IEC8802 2LLC Type3 Setup</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType3Setup
	 * @generated
	 */
	EClass getISO_IEC8802_2LLCType3Setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.t61334_4_32LLCSSCSsetupobject <em>t61334 432LLCSSC Ssetupobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>t61334 432LLCSSC Ssetupobject</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.t61334_4_32LLCSSCSsetupobject
	 * @generated
	 */
	EClass gett61334_4_32LLCSSCSsetupobject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_Physical_layer_counters_object <em>PRIME NB OFDM PLC Physical layer counters object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC Physical layer counters object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_Physical_layer_counters_object
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_Physical_layer_counters_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_setup_object <em>PRIME NB OFDM PLC MAC setup object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MAC setup object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_setup_object
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MAC_setup_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_functional_parameters_object <em>PRIME NB OFDM PLC MAC functional parameters object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MAC functional parameters object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_functional_parameters_object
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MAC_functional_parameters_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_counters_object <em>PRIME NB OFDM PLC MAC counters object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MAC counters object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_counters_object
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MAC_counters_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_network_administration_data_object <em>PRIME NB OFDM PLC MAC network administration data object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MAC network administration data object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_network_administration_data_object
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MAC_network_administration_data_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_address_setup <em>PRIME NB OFDM PLC MAC address setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC MAC address setup</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_address_setup
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_MAC_address_setup();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_Application_identification_object <em>PRIME NB OFDM PLC Application identification object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRIME NB OFDM PLC Application identification object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_Application_identification_object
	 * @generated
	 */
	EClass getPRIME_NB_OFDM_PLC_Application_identification_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.G3_PLC_MAC_layer_counters_object <em>G3 PLC MAC layer counters object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 PLC MAC layer counters object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.G3_PLC_MAC_layer_counters_object
	 * @generated
	 */
	EClass getG3_PLC_MAC_layer_counters_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.G3_PLC_MAC_setup_object <em>G3 PLC MAC setup object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 PLC MAC setup object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.G3_PLC_MAC_setup_object
	 * @generated
	 */
	EClass getG3_PLC_MAC_setup_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.G3_PLC_6LoWPAN_adaptation_layer_setup_object <em>G3 PLC 6Lo WPAN adaptation layer setup object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>G3 PLC 6Lo WPAN adaptation layer setup object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.G3_PLC_6LoWPAN_adaptation_layer_setup_object
	 * @generated
	 */
	EClass getG3_PLC_6LoWPAN_adaptation_layer_setup_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_SAS_startup_object <em>Zig Bee SAS startup object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Bee SAS startup object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_SAS_startup_object
	 * @generated
	 */
	EClass getZigBee_SAS_startup_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_SAS_join_object <em>Zig Bee SAS join object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Bee SAS join object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_SAS_join_object
	 * @generated
	 */
	EClass getZigBee_SAS_join_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_SAS_APS_fragmentation_object <em>Zig Bee SAS APS fragmentation object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Bee SAS APS fragmentation object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_SAS_APS_fragmentation_object
	 * @generated
	 */
	EClass getZigBee_SAS_APS_fragmentation_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_network_control_object <em>Zig Bee network control object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Bee network control object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_network_control_object
	 * @generated
	 */
	EClass getZigBee_network_control_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_tunnel_setup_object <em>Zig Bee tunnel setup object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zig Bee tunnel setup object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_tunnel_setup_object
	 * @generated
	 */
	EClass getZigBee_tunnel_setup_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.CurrentAssociation <em>Current Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Association</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CurrentAssociation
	 * @generated
	 */
	EClass getCurrentAssociation();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.SAPAssignmentCurrent <em>SAP Assignment Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAP Assignment Current</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SAPAssignmentCurrent
	 * @generated
	 */
	EClass getSAPAssignmentCurrent();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.SecuritySetupObject <em>Security Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Setup Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.SecuritySetupObject
	 * @generated
	 */
	EClass getSecuritySetupObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.InvocationCounter <em>Invocation Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InvocationCounter
	 * @generated
	 */
	EClass getInvocationCounter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InvocationCounter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InvocationCounter#getValue()
	 * @see #getInvocationCounter()
	 * @generated
	 */
	EAttribute getInvocationCounter_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.DataProtectionObject <em>Data Protection Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Protection Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.DataProtectionObject
	 * @generated
	 */
	EClass getDataProtectionObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ImageTransferObject <em>Image Transfer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Transfer Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ImageTransferObject
	 * @generated
	 */
	EClass getImageTransferObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.UtilitiesTableObject <em>Utilities Table Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilities Table Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.UtilitiesTableObject
	 * @generated
	 */
	EClass getUtilitiesTableObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.UtilitiesTableObject#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.UtilitiesTableObject#getStandard()
	 * @see #getUtilitiesTableObject()
	 * @generated
	 */
	EAttribute getUtilitiesTableObject_Standard();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.UtilitiesTableObject#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.UtilitiesTableObject#getManufacturer()
	 * @see #getUtilitiesTableObject()
	 * @generated
	 */
	EAttribute getUtilitiesTableObject_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.UtilitiesTableObject#getStdPending <em>Std Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std Pending</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.UtilitiesTableObject#getStdPending()
	 * @see #getUtilitiesTableObject()
	 * @generated
	 */
	EAttribute getUtilitiesTableObject_StdPending();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.UtilitiesTableObject#getMfgPending <em>Mfg Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mfg Pending</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.UtilitiesTableObject#getMfgPending()
	 * @see #getUtilitiesTableObject()
	 * @generated
	 */
	EAttribute getUtilitiesTableObject_MfgPending();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.CompactDataObject <em>Compact Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compact Data Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CompactDataObject
	 * @generated
	 */
	EClass getCompactDataObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.DeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device ID</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.DeviceID
	 * @generated
	 */
	EClass getDeviceID();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.DeviceID#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.DeviceID#getValue()
	 * @see #getDeviceID()
	 * @generated
	 */
	EAttribute getDeviceID_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MeteringPointID <em>Metering Point ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metering Point ID</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeteringPointID
	 * @generated
	 */
	EClass getMeteringPointID();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeteringPointID#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeteringPointID#getValue()
	 * @see #getMeteringPointID()
	 * @generated
	 */
	EAttribute getMeteringPointID_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject <em>Parameter Changes Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Changes Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject
	 * @generated
	 */
	EClass getParameterChangesObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getNumberConfigProgramChanges <em>Number Config Program Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Config Program Changes</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getNumberConfigProgramChanges()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_NumberConfigProgramChanges();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastConfigChange <em>Date Last Config Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Config Change</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastConfigChange()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateLastConfigChange();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastSwitchChange <em>Date Last Switch Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Switch Change</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastSwitchChange()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateLastSwitchChange();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastRippleControlChange <em>Date Last Ripple Control Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Ripple Control Change</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastRippleControlChange()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateLastRippleControlChange();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getStatusSecuritySwitches <em>Status Security Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Security Switches</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getStatusSecuritySwitches()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_StatusSecuritySwitches();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastCalibration <em>Date Last Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Calibration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastCalibration()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateLastCalibration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateNextConfig <em>Date Next Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Next Config</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateNextConfig()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateNextConfig();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateActivationPassivCalendar <em>Date Activation Passiv Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Activation Passiv Calendar</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateActivationPassivCalendar()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateActivationPassivCalendar();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getNumberProtectedConfigChanges <em>Number Protected Config Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Protected Config Changes</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getNumberProtectedConfigChanges()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_NumberProtectedConfigChanges();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastProtectedConfigChange <em>Date Last Protected Config Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Protected Config Change</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastProtectedConfigChange()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateLastProtectedConfigChange();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastClockSynch <em>Date Last Clock Synch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Clock Synch</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastClockSynch()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateLastClockSynch();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastFirmwareActivation <em>Date Last Firmware Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Firmware Activation</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject#getDateLastFirmwareActivation()
	 * @see #getParameterChangesObject()
	 * @generated
	 */
	EAttribute getParameterChangesObject_DateLastFirmwareActivation();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmanufacturerspecific <em>IOcontrol signal objects contentsmanufacturerspecific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOcontrol signal objects contentsmanufacturerspecific</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmanufacturerspecific
	 * @generated
	 */
	EClass getI_O_control_signal_objects_contentsmanufacturerspecific();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmanufacturerspecific#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmanufacturerspecific#getValue()
	 * @see #getI_O_control_signal_objects_contentsmanufacturerspecific()
	 * @generated
	 */
	EAttribute getI_O_control_signal_objects_contentsmanufacturerspecific_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmappedtoareferencetable <em>IOcontrol signal objects contentsmappedtoareferencetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOcontrol signal objects contentsmappedtoareferencetable</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmappedtoareferencetable
	 * @generated
	 */
	EClass getI_O_control_signal_objects_contentsmappedtoareferencetable();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_global <em>IOcontrol signal objects global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOcontrol signal objects global</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_global
	 * @generated
	 */
	EClass getI_O_control_signal_objects_global();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IOControlSignalsManufacturer <em>IO Control Signals Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Control Signals Manufacturer</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IOControlSignalsManufacturer
	 * @generated
	 */
	EClass getIOControlSignalsManufacturer();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.IOControlSignalsManufacturer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IOControlSignalsManufacturer#getValue()
	 * @see #getIOControlSignalsManufacturer()
	 * @generated
	 */
	EAttribute getIOControlSignalsManufacturer_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IOControlSignalsMapped <em>IO Control Signals Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Control Signals Mapped</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IOControlSignalsMapped
	 * @generated
	 */
	EClass getIOControlSignalsMapped();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.IOControlSignalsGlobal <em>IO Control Signals Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Control Signals Global</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.IOControlSignalsGlobal
	 * @generated
	 */
	EClass getIOControlSignalsGlobal();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.DisconnectControlObject <em>Disconnect Control Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnect Control Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.DisconnectControlObject
	 * @generated
	 */
	EClass getDisconnectControlObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.GeneralPurposeArbitrator <em>General Purpose Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Purpose Arbitrator</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.GeneralPurposeArbitrator
	 * @generated
	 */
	EClass getGeneralPurposeArbitrator();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.InternalControlManu <em>Internal Control Manu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Control Manu</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InternalControlManu
	 * @generated
	 */
	EClass getInternalControlManu();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InternalControlManu#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InternalControlManu#getValue()
	 * @see #getInternalControlManu()
	 * @generated
	 */
	EAttribute getInternalControlManu_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.InternalControlMapped <em>Internal Control Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Control Mapped</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InternalControlMapped
	 * @generated
	 */
	EClass getInternalControlMapped();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.InternalControlGlobal <em>Internal Control Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Control Global</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InternalControlGlobal
	 * @generated
	 */
	EClass getInternalControlGlobal();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.InternalOperatingStatusManu <em>Internal Operating Status Manu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Operating Status Manu</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InternalOperatingStatusManu
	 * @generated
	 */
	EClass getInternalOperatingStatusManu();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.InternalOperatingStatusMapped <em>Internal Operating Status Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Operating Status Mapped</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InternalOperatingStatusMapped
	 * @generated
	 */
	EClass getInternalOperatingStatusMapped();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.InternalOperatingStatusGlobal <em>Internal Operating Status Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Operating Status Global</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InternalOperatingStatusGlobal
	 * @generated
	 */
	EClass getInternalOperatingStatusGlobal();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.StatusRegisterManu <em>Status Register Manu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Register Manu</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StatusRegisterManu
	 * @generated
	 */
	EClass getStatusRegisterManu();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.StatusRegisterMapped <em>Status Register Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Register Mapped</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StatusRegisterMapped
	 * @generated
	 */
	EClass getStatusRegisterMapped();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ErrorRegisterObject <em>Error Register Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Register Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ErrorRegisterObject
	 * @generated
	 */
	EClass getErrorRegisterObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ErrorRegisterObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ErrorRegisterObject#getValue()
	 * @see #getErrorRegisterObject()
	 * @generated
	 */
	EAttribute getErrorRegisterObject_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ErrorProfileObject <em>Error Profile Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Profile Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ErrorProfileObject
	 * @generated
	 */
	EClass getErrorProfileObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ErrorTableObject <em>Error Table Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Table Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ErrorTableObject
	 * @generated
	 */
	EClass getErrorTableObject();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.AlarmRegisterObject <em>Alarm Register Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Register Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmRegisterObject
	 * @generated
	 */
	EClass getAlarmRegisterObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.AlarmRegisterObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmRegisterObject#getValue()
	 * @see #getAlarmRegisterObject()
	 * @generated
	 */
	EAttribute getAlarmRegisterObject_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.AlarmFilterObject <em>Alarm Filter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Filter Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmFilterObject
	 * @generated
	 */
	EClass getAlarmFilterObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.AlarmFilterObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmFilterObject#getValue()
	 * @see #getAlarmFilterObject()
	 * @generated
	 */
	EAttribute getAlarmFilterObject_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.AlarmDescriptorObject <em>Alarm Descriptor Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Descriptor Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmDescriptorObject
	 * @generated
	 */
	EClass getAlarmDescriptorObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.AlarmDescriptorObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmDescriptorObject#getValue()
	 * @see #getAlarmDescriptorObject()
	 * @generated
	 */
	EAttribute getAlarmDescriptorObject_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.EventLog <em>Event Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Log</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EventLog
	 * @generated
	 */
	EClass getEventLog();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityID <em>Electricity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity ID</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityID
	 * @generated
	 */
	EClass getElectricityID();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityID#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityID#getValue()
	 * @see #getElectricityID()
	 * @generated
	 */
	EAttribute getElectricityID_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries <em>Electricity Program Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity Program Entries</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries
	 * @generated
	 */
	EClass getElectricityProgramEntries();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getActivefirmwareidentifier <em>Activefirmwareidentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activefirmwareidentifier</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getActivefirmwareidentifier()
	 * @see #getElectricityProgramEntries()
	 * @generated
	 */
	EAttribute getElectricityProgramEntries_Activefirmwareidentifier();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getParameterrecordnumber <em>Parameterrecordnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameterrecordnumber</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getParameterrecordnumber()
	 * @see #getElectricityProgramEntries()
	 * @generated
	 */
	EAttribute getElectricityProgramEntries_Parameterrecordnumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getTimeswitchprogramnumber <em>Timeswitchprogramnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeswitchprogramnumber</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getTimeswitchprogramnumber()
	 * @see #getElectricityProgramEntries()
	 * @generated
	 */
	EAttribute getElectricityProgramEntries_Timeswitchprogramnumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getRCRprogramnumber <em>RC Rprogramnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RC Rprogramnumber</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getRCRprogramnumber()
	 * @see #getElectricityProgramEntries()
	 * @generated
	 */
	EAttribute getElectricityProgramEntries_RCRprogramnumber();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getMeterconnectiondiagramID <em>Meterconnectiondiagram ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meterconnectiondiagram ID</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getMeterconnectiondiagramID()
	 * @see #getElectricityProgramEntries()
	 * @generated
	 */
	EAttribute getElectricityProgramEntries_MeterconnectiondiagramID();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getPassivecalendarname <em>Passivecalendarname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passivecalendarname</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getPassivecalendarname()
	 * @see #getElectricityProgramEntries()
	 * @generated
	 */
	EAttribute getElectricityProgramEntries_Passivecalendarname();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getActivefirmwaresignature <em>Activefirmwaresignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activefirmwaresignature</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries#getActivefirmwaresignature()
	 * @see #getElectricityProgramEntries()
	 * @generated
	 */
	EAttribute getElectricityProgramEntries_Activefirmwaresignature();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants <em>Output Pulse Values constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pulse Values constants</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants
	 * @generated
	 */
	EClass getOutputPulseValues_constants();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getActiveenergymetrologicalLED <em>Activeenergymetrological LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activeenergymetrological LED</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getActiveenergymetrologicalLED()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_ActiveenergymetrologicalLED();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getReactiveenergymetrologicalLED <em>Reactiveenergymetrological LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactiveenergymetrological LED</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getReactiveenergymetrologicalLED()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_ReactiveenergymetrologicalLED();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getApparentenergymetrologicalLED <em>Apparentenergymetrological LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparentenergymetrological LED</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getApparentenergymetrologicalLED()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_ApparentenergymetrologicalLED();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getActiveenergyoutputpulse <em>Activeenergyoutputpulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activeenergyoutputpulse</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getActiveenergyoutputpulse()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_Activeenergyoutputpulse();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getReactiveenergyoutputpulse <em>Reactiveenergyoutputpulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactiveenergyoutputpulse</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getReactiveenergyoutputpulse()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_Reactiveenergyoutputpulse();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getApparentenergyoutputpulse <em>Apparentenergyoutputpulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparentenergyoutputpulse</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getApparentenergyoutputpulse()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_Apparentenergyoutputpulse();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getVolt_squaredhoursmetrologicalLED <em>Volt squaredhoursmetrological LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volt squaredhoursmetrological LED</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getVolt_squaredhoursmetrologicalLED()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_Volt_squaredhoursmetrologicalLED();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getAmpere_squaredhoursmetrologicalLED <em>Ampere squaredhoursmetrological LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ampere squaredhoursmetrological LED</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getAmpere_squaredhoursmetrologicalLED()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_Ampere_squaredhoursmetrologicalLED();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getVolt_squaredhoursoutputpulse <em>Volt squaredhoursoutputpulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volt squaredhoursoutputpulse</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getVolt_squaredhoursoutputpulse()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_Volt_squaredhoursoutputpulse();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getAmpere_squaredhoursoutputpulse <em>Ampere squaredhoursoutputpulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ampere squaredhoursoutputpulse</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants#getAmpere_squaredhoursoutputpulse()
	 * @see #getOutputPulseValues_constants()
	 * @generated
	 */
	EAttribute getOutputPulseValues_constants_Ampere_squaredhoursoutputpulse();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio <em>Reading Factor And CT VTratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Factor And CT VTratio</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio
	 * @generated
	 */
	EClass getReadingFactorAndCT_VTratio();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getReadingfactorforpower <em>Readingfactorforpower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readingfactorforpower</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getReadingfactorforpower()
	 * @see #getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	EAttribute getReadingFactorAndCT_VTratio_Readingfactorforpower();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getReadingfactorforenergy <em>Readingfactorforenergy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readingfactorforenergy</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getReadingfactorforenergy()
	 * @see #getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	EAttribute getReadingFactorAndCT_VTratio_Readingfactorforenergy();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getTransformerratio_currentzaehler <em>Transformerratio currentzaehler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformerratio currentzaehler</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getTransformerratio_currentzaehler()
	 * @see #getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	EAttribute getReadingFactorAndCT_VTratio_Transformerratio_currentzaehler();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getTransformerratio_voltagezaehler <em>Transformerratio voltagezaehler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformerratio voltagezaehler</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getTransformerratio_voltagezaehler()
	 * @see #getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	EAttribute getReadingFactorAndCT_VTratio_Transformerratio_voltagezaehler();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getOveralltransformerratiozaehler <em>Overalltransformerratiozaehler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overalltransformerratiozaehler</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getOveralltransformerratiozaehler()
	 * @see #getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	EAttribute getReadingFactorAndCT_VTratio_Overalltransformerratiozaehler();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getTransformerratio_currentnenner <em>Transformerratio currentnenner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformerratio currentnenner</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getTransformerratio_currentnenner()
	 * @see #getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	EAttribute getReadingFactorAndCT_VTratio_Transformerratio_currentnenner();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getTransformerratio_voltagenenner <em>Transformerratio voltagenenner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformerratio voltagenenner</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getTransformerratio_voltagenenner()
	 * @see #getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	EAttribute getReadingFactorAndCT_VTratio_Transformerratio_voltagenenner();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getOveralltransformer_rationenner <em>Overalltransformer rationenner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overalltransformer rationenner</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio#getOveralltransformer_rationenner()
	 * @see #getReadingFactorAndCT_VTratio()
	 * @generated
	 */
	EAttribute getReadingFactorAndCT_VTratio_Overalltransformer_rationenner();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues <em>Electricity Nominal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity Nominal Values</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityNominalValues
	 * @generated
	 */
	EClass getElectricityNominalValues();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getVoltage()
	 * @see #getElectricityNominalValues()
	 * @generated
	 */
	EAttribute getElectricityNominalValues_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getNominalcurrent <em>Nominalcurrent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominalcurrent</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getNominalcurrent()
	 * @see #getElectricityNominalValues()
	 * @generated
	 */
	EAttribute getElectricityNominalValues_Nominalcurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getFrequency()
	 * @see #getElectricityNominalValues()
	 * @generated
	 */
	EAttribute getElectricityNominalValues_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getMaximumcurrent <em>Maximumcurrent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximumcurrent</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getMaximumcurrent()
	 * @see #getElectricityNominalValues()
	 * @generated
	 */
	EAttribute getElectricityNominalValues_Maximumcurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getReference_voltage_for_power_quality_measurement <em>Reference voltage for power quality measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference voltage for power quality measurement</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getReference_voltage_for_power_quality_measurement()
	 * @see #getElectricityNominalValues()
	 * @generated
	 */
	EAttribute getElectricityNominalValues_Reference_voltage_for_power_quality_measurement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getReference_voltage_for_aux_power_supply <em>Reference voltage for aux power supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference voltage for aux power supply</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityNominalValues#getReference_voltage_for_aux_power_supply()
	 * @see #getElectricityNominalValues()
	 * @generated
	 */
	EAttribute getElectricityNominalValues_Reference_voltage_for_aux_power_supply();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants <em>Input Pulse Values Or Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pulse Values Or Constants</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants
	 * @generated
	 */
	EClass getInputPulseValuesOrConstants();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getActiveEnergy <em>Active Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Energy</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getActiveEnergy()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_ActiveEnergy();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getReactive_energy <em>Reactive energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive energy</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getReactive_energy()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_Reactive_energy();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getApparent_energy <em>Apparent energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent energy</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getApparent_energy()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_Apparent_energy();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getVolt_squared_hours <em>Volt squared hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volt squared hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getVolt_squared_hours()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_Volt_squared_hours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getAmpere_squared_hours <em>Ampere squared hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ampere squared hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getAmpere_squared_hours()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_Ampere_squared_hours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getUnitless_quantities <em>Unitless quantities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unitless quantities</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getUnitless_quantities()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_Unitless_quantities();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getActive_energy_export <em>Active energy export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active energy export</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getActive_energy_export()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_Active_energy_export();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getReactive_energy_export <em>Reactive energy export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive energy export</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getReactive_energy_export()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_Reactive_energy_export();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getApparent_energy_export <em>Apparent energy export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent energy export</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants#getApparent_energy_export()
	 * @see #getInputPulseValuesOrConstants()
	 * @generated
	 */
	EAttribute getInputPulseValuesOrConstants_Apparent_energy_export();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration <em>Measurement Period recording Interval billing Period Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Period recording Interval billing Period Duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration
	 * @generated
	 */
	EClass getMeasurementPeriod_recordingInterval_billingPeriodDuration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getMeasurement_period_1_for_averaging_scheme_1 <em>Measurement period 1for averaging scheme 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement period 1for averaging scheme 1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getMeasurement_period_1_for_averaging_scheme_1()
	 * @see #getMeasurementPeriod_recordingInterval_billingPeriodDuration()
	 * @generated
	 */
	EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Measurement_period_1_for_averaging_scheme_1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getMeasurement_period_2_for_averagingscheme_2 <em>Measurement period 2for averagingscheme 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement period 2for averagingscheme 2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getMeasurement_period_2_for_averagingscheme_2()
	 * @see #getMeasurementPeriod_recordingInterval_billingPeriodDuration()
	 * @generated
	 */
	EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Measurement_period_2_for_averagingscheme_2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getMeasurement_period_3_for_instantaneous_value <em>Measurement period 3for instantaneous value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement period 3for instantaneous value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getMeasurement_period_3_for_instantaneous_value()
	 * @see #getMeasurementPeriod_recordingInterval_billingPeriodDuration()
	 * @generated
	 */
	EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Measurement_period_3_for_instantaneous_value();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getMeasurement_period_4_for_test_value <em>Measurement period 4for test value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement period 4for test value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getMeasurement_period_4_for_test_value()
	 * @see #getMeasurementPeriod_recordingInterval_billingPeriodDuration()
	 * @generated
	 */
	EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Measurement_period_4_for_test_value();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getRecording_interval_1_for_loadprofile <em>Recording interval 1for loadprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording interval 1for loadprofile</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getRecording_interval_1_for_loadprofile()
	 * @see #getMeasurementPeriod_recordingInterval_billingPeriodDuration()
	 * @generated
	 */
	EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Recording_interval_1_for_loadprofile();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getRecording_interval_2_for_loadprofile <em>Recording interval 2for loadprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording interval 2for loadprofile</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getRecording_interval_2_for_loadprofile()
	 * @see #getMeasurementPeriod_recordingInterval_billingPeriodDuration()
	 * @generated
	 */
	EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Recording_interval_2_for_loadprofile();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getBillingperiod <em>Billingperiod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billingperiod</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration#getBillingperiod()
	 * @see #getMeasurementPeriod_recordingInterval_billingPeriodDuration()
	 * @generated
	 */
	EAttribute getMeasurementPeriod_recordingInterval_billingPeriodDuration_Billingperiod();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries <em>Electricity Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity Time Entries</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries
	 * @generated
	 */
	EClass getElectricityTimeEntries();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getTime_expired_since_last_end_of_billing_period <em>Time expired since last end of billing period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time expired since last end of billing period</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getTime_expired_since_last_end_of_billing_period()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Time_expired_since_last_end_of_billing_period();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getLocaltime <em>Localtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Localtime</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getLocaltime()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Localtime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getLocaldate <em>Localdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Localdate</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getLocaldate()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Localdate();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getWeekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weekday</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getWeekday()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Weekday();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getTimeoflastreset <em>Timeoflastreset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeoflastreset</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getTimeoflastreset()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Timeoflastreset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getDateoflastreset <em>Dateoflastreset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dateoflastreset</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getDateoflastreset()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Dateoflastreset();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getOutputpulseduration <em>Outputpulseduration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outputpulseduration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getOutputpulseduration()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Outputpulseduration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClocksynchronizationwindow <em>Clocksynchronizationwindow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clocksynchronizationwindow</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClocksynchronizationwindow()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Clocksynchronizationwindow();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClock_synchronization_method <em>Clock synchronization method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock synchronization method</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClock_synchronization_method()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Clock_synchronization_method();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClock_time_shift_limit <em>Clock time shift limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock time shift limit</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getClock_time_shift_limit()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Clock_time_shift_limit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getBilling_period_reset_lockout_time <em>Billing period reset lockout time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing period reset lockout time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries#getBilling_period_reset_lockout_time()
	 * @see #getElectricityTimeEntries()
	 * @generated
	 */
	EAttribute getElectricityTimeEntries_Billing_period_reset_lockout_time();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.Coefficients <em>Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coefficients</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.Coefficients
	 * @generated
	 */
	EClass getCoefficients();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.Coefficients#getTransformer_magnetic_losses <em>Transformer magnetic losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer magnetic losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.Coefficients#getTransformer_magnetic_losses()
	 * @see #getCoefficients()
	 * @generated
	 */
	EAttribute getCoefficients_Transformer_magnetic_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.Coefficients#getTransformer_iron_losses <em>Transformer iron losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformer iron losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.Coefficients#getTransformer_iron_losses()
	 * @see #getCoefficients()
	 * @generated
	 */
	EAttribute getCoefficients_Transformer_iron_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.Coefficients#getLine_resistance_losses <em>Line resistance losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line resistance losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.Coefficients#getLine_resistance_losses()
	 * @see #getCoefficients()
	 * @generated
	 */
	EAttribute getCoefficients_Line_resistance_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.Coefficients#getLine_reactance_losses <em>Line reactance losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line reactance losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.Coefficients#getLine_reactance_losses()
	 * @see #getCoefficients()
	 * @generated
	 */
	EAttribute getCoefficients_Line_reactance_losses();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods <em>Measurement Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Methods</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods
	 * @generated
	 */
	EClass getMeasurementMethods();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_active_power_measurement <em>Algorithm for active power measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm for active power measurement</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_active_power_measurement()
	 * @see #getMeasurementMethods()
	 * @generated
	 */
	EAttribute getMeasurementMethods_Algorithm_for_active_power_measurement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_active_energy_management <em>Algorithm for active energy management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm for active energy management</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_active_energy_management()
	 * @see #getMeasurementMethods()
	 * @generated
	 */
	EAttribute getMeasurementMethods_Algorithm_for_active_energy_management();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_reactive_power_measurement <em>Algorithm for reactive power measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm for reactive power measurement</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_reactive_power_measurement()
	 * @see #getMeasurementMethods()
	 * @generated
	 */
	EAttribute getMeasurementMethods_Algorithm_for_reactive_power_measurement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_reactive_energy_measurement <em>Algorithm for reactive energy measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm for reactive energy measurement</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_reactive_energy_measurement()
	 * @see #getMeasurementMethods()
	 * @generated
	 */
	EAttribute getMeasurementMethods_Algorithm_for_reactive_energy_measurement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_apparent_power_measurement <em>Algorithm for apparent power measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm for apparent power measurement</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_apparent_power_measurement()
	 * @see #getMeasurementMethods()
	 * @generated
	 */
	EAttribute getMeasurementMethods_Algorithm_for_apparent_power_measurement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_apparent_energy_measurement <em>Algorithm for apparent energy measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm for apparent energy measurement</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_apparent_energy_measurement()
	 * @see #getMeasurementMethods()
	 * @generated
	 */
	EAttribute getMeasurementMethods_Algorithm_for_apparent_energy_measurement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_power_factor_calculation <em>Algorithm for power factor calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm for power factor calculation</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods#getAlgorithm_for_power_factor_calculation()
	 * @see #getMeasurementMethods()
	 * @generated
	 */
	EAttribute getMeasurementMethods_Algorithm_for_power_factor_calculation();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityMeteringPointID <em>Electricity Metering Point ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity Metering Point ID</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityMeteringPointID
	 * @generated
	 */
	EClass getElectricityMeteringPointID();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityMeteringPointID#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityMeteringPointID#getValue()
	 * @see #getElectricityMeteringPointID()
	 * @generated
	 */
	EAttribute getElectricityMeteringPointID_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData <em>Electricity Related Status Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity Related Status Data</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData
	 * @generated
	 */
	EClass getElectricityRelatedStatusData();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_missing_voltage <em>Status information missing voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status information missing voltage</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_missing_voltage()
	 * @see #getElectricityRelatedStatusData()
	 * @generated
	 */
	EAttribute getElectricityRelatedStatusData_Status_information_missing_voltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_missing_current <em>Status information missing current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status information missing current</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_missing_current()
	 * @see #getElectricityRelatedStatusData()
	 * @generated
	 */
	EAttribute getElectricityRelatedStatusData_Status_information_missing_current();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_current_without_voltage <em>Status information current without voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status information current without voltage</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_current_without_voltage()
	 * @see #getElectricityRelatedStatusData()
	 * @generated
	 */
	EAttribute getElectricityRelatedStatusData_Status_information_current_without_voltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_auxiliary_power_supply <em>Status information auxiliary power supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status information auxiliary power supply</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData#getStatus_information_auxiliary_power_supply()
	 * @see #getElectricityRelatedStatusData()
	 * @generated
	 */
	EAttribute getElectricityRelatedStatusData_Status_information_auxiliary_power_supply();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusDataMapped <em>Electricity Related Status Data Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity Related Status Data Mapped</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusDataMapped
	 * @generated
	 */
	EClass getElectricityRelatedStatusDataMapped();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries <em>Battery Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Entries</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries
	 * @generated
	 */
	EClass getBatteryEntries();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_use_time_counter <em>Battery use time counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery use time counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_use_time_counter()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Battery_use_time_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_charge_display <em>Battery charge display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery charge display</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_charge_display()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Battery_charge_display();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getDate_of_next_battery_change <em>Date of next battery change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date of next battery change</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getDate_of_next_battery_change()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Date_of_next_battery_change();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_voltage <em>Battery voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery voltage</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_voltage()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Battery_voltage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_initial_capacity <em>Battery initial capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery initial capacity</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_initial_capacity()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Battery_initial_capacity();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_installation_date_and_time <em>Battery installation date and time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery installation date and time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_installation_date_and_time()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Battery_installation_date_and_time();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_estimated_remaining_use_time <em>Battery estimated remaining use time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery estimated remaining use time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getBattery_estimated_remaining_use_time()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Battery_estimated_remaining_use_time();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getAux_supply_use_time_counter <em>Aux supply use time counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux supply use time counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getAux_supply_use_time_counter()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Aux_supply_use_time_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries#getAux_voltage <em>Aux voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux voltage</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries#getAux_voltage()
	 * @see #getBatteryEntries()
	 * @generated
	 */
	EAttribute getBatteryEntries_Aux_voltage();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring <em>Power Failure Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Failure Monitoring</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring
	 * @generated
	 */
	EClass getPowerFailureMonitoring();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresAllPhases <em>Failures All Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failures All Phases</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresAllPhases()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_FailuresAllPhases();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL1 <em>Failures L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failures L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL1()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_FailuresL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL2 <em>Failures L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failures L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL2()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_FailuresL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL3 <em>Failures L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failures L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresL3()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_FailuresL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresAny <em>Failures Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failures Any</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getFailuresAny()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_FailuresAny();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getAuxiliarysupply <em>Auxiliarysupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auxiliarysupply</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getAuxiliarysupply()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_Auxiliarysupply();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsAll <em>Long Fails All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Fails All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsAll()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_LongFailsAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL1 <em>Long Fails L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Fails L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL1()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_LongFailsL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL2 <em>Long Fails L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Fails L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL2()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_LongFailsL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL3 <em>Long Fails L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Fails L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsL3()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_LongFailsL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsAny <em>Long Fails Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Fails Any</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getLongFailsAny()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_LongFailsAny();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeAll <em>Time All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeAll()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_TimeAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL1 <em>Time L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL1()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_TimeL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL2 <em>Time L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL2()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_TimeL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL3 <em>Time L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeL3()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_TimeL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeAny <em>Time Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Any</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTimeAny()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_TimeAny();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationAll <em>Duration All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationAll()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_DurationAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL1 <em>Duration L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL1()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_DurationL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL2 <em>Duration L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL2()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_DurationL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL3 <em>Duration L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationL3()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_DurationL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationAny <em>Duration Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Any</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getDurationAny()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_DurationAny();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTime_threshold_long_powerfailure <em>Time threshold long powerfailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time threshold long powerfailure</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring#getTime_threshold_long_powerfailure()
	 * @see #getPowerFailureMonitoring()
	 * @generated
	 */
	EAttribute getPowerFailureMonitoring_Time_threshold_long_powerfailure();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.OperatingTime <em>Operating Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OperatingTime
	 * @generated
	 */
	EClass getOperatingTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.OperatingTime#getTimeofoperation <em>Timeofoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeofoperation</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.OperatingTime#getTimeofoperation()
	 * @see #getOperatingTime()
	 * @generated
	 */
	EAttribute getOperatingTime_Timeofoperation();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters <em>Environment Related Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Related Parameters</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters
	 * @generated
	 */
	EClass getEnvironmentRelatedParameters();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getAmbient_temperature <em>Ambient temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient temperature</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getAmbient_temperature()
	 * @see #getEnvironmentRelatedParameters()
	 * @generated
	 */
	EAttribute getEnvironmentRelatedParameters_Ambient_temperature();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getAmbient_pressure <em>Ambient pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient pressure</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getAmbient_pressure()
	 * @see #getEnvironmentRelatedParameters()
	 * @generated
	 */
	EAttribute getEnvironmentRelatedParameters_Ambient_pressure();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getRelative_humidity <em>Relative humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative humidity</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getRelative_humidity()
	 * @see #getEnvironmentRelatedParameters()
	 * @generated
	 */
	EAttribute getEnvironmentRelatedParameters_Relative_humidity();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.StatusRegister <em>Status Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Register</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.StatusRegister
	 * @generated
	 */
	EClass getStatusRegister();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.EventCode <em>Event Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Code</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EventCode
	 * @generated
	 */
	EClass getEventCode();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.EventCode#getEvent_code_object <em>Event code object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event code object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EventCode#getEvent_code_object()
	 * @see #getEventCode()
	 * @generated
	 */
	EAttribute getEventCode_Event_code_object();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters <em>Communication Port Log Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Port Log Parameters</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters
	 * @generated
	 */
	EClass getCommunicationPortLogParameters();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getReserved()
	 * @see #getCommunicationPortLogParameters()
	 * @generated
	 */
	EAttribute getCommunicationPortLogParameters_Reserved();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getNumber_connections <em>Number connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number connections</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getNumber_connections()
	 * @see #getCommunicationPortLogParameters()
	 * @generated
	 */
	EAttribute getCommunicationPortLogParameters_Number_connections();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getCommunication_port_parameter <em>Communication port parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication port parameter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getCommunication_port_parameter()
	 * @see #getCommunicationPortLogParameters()
	 * @generated
	 */
	EAttribute getCommunicationPortLogParameters_Communication_port_parameter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getGSM_field_strength <em>GSM field strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GSM field strength</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getGSM_field_strength()
	 * @see #getCommunicationPortLogParameters()
	 * @generated
	 */
	EAttribute getCommunicationPortLogParameters_GSM_field_strength();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getCommunicationaddress <em>Communicationaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communicationaddress</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters#getCommunicationaddress()
	 * @see #getCommunicationPortLogParameters()
	 * @generated
	 */
	EAttribute getCommunicationPortLogParameters_Communicationaddress();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ConsumerMessage <em>Consumer Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer Message</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ConsumerMessage
	 * @generated
	 */
	EClass getConsumerMessage();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ConsumerMessage#getConsumer_message_via_local_consumer_information_port <em>Consumer message via local consumer information port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer message via local consumer information port</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ConsumerMessage#getConsumer_message_via_local_consumer_information_port()
	 * @see #getConsumerMessage()
	 * @generated
	 */
	EAttribute getConsumerMessage_Consumer_message_via_local_consumer_information_port();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ConsumerMessage#getConsumer_message_via_meter_display <em>Consumer message via meter display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer message via meter display</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ConsumerMessage#getConsumer_message_via_meter_display()
	 * @see #getConsumerMessage()
	 * @generated
	 */
	EAttribute getConsumerMessage_Consumer_message_via_meter_display();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.CurrentlyActiveTariff <em>Currently Active Tariff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currently Active Tariff</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CurrentlyActiveTariff
	 * @generated
	 */
	EClass getCurrentlyActiveTariff();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.CurrentlyActiveTariff#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.CurrentlyActiveTariff#getValue()
	 * @see #getCurrentlyActiveTariff()
	 * @generated
	 */
	EAttribute getCurrentlyActiveTariff_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.EventCounterObject <em>Event Counter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Counter Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EventCounterObject
	 * @generated
	 */
	EClass getEventCounterObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.EventCounterObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.EventCounterObject#getValue()
	 * @see #getEventCounterObject()
	 * @generated
	 */
	EAttribute getEventCounterObject_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ProfileEntryDigitalSignatureObject <em>Profile Entry Digital Signature Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Entry Digital Signature Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ProfileEntryDigitalSignatureObject
	 * @generated
	 */
	EClass getProfileEntryDigitalSignatureObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ProfileEntryDigitalSignatureObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ProfileEntryDigitalSignatureObject#getValue()
	 * @see #getProfileEntryDigitalSignatureObject()
	 * @generated
	 */
	EAttribute getProfileEntryDigitalSignatureObject_Value();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject <em>Meter Temper Event Related Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Temper Event Related Object</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject
	 * @generated
	 */
	EClass getMeterTemperEventRelatedObject();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_counter <em>Meter open event counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter open event counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_counter()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Meter_open_event_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_timestamp <em>Meter open event timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter open event timestamp</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_timestamp()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Meter_open_event_timestamp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_duration <em>Meter open event duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter open event duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Meter_open_event_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_cumulative_duration <em>Meter open event cumulative duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter open event cumulative duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMeter_open_event_cumulative_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Meter_open_event_cumulative_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_counter <em>Terminal cover open event counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal cover open event counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_counter()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Terminal_cover_open_event_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_time <em>Terminal cover open event time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal cover open event time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_time()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Terminal_cover_open_event_time();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_duration <em>Terminal cover open event duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal cover open event duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Terminal_cover_open_event_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_cumulative_duration <em>Terminal cover open event cumulative duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal cover open event cumulative duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTerminal_cover_open_event_cumulative_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Terminal_cover_open_event_cumulative_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_counter <em>Tilt event counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt event counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_counter()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Tilt_event_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_time <em>Tilt event time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt event time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_time()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Tilt_event_time();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_duration <em>Tilt event duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt event duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Tilt_event_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_cumulative_duration <em>Tilt event cumulative duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt event cumulative duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getTilt_event_cumulative_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Tilt_event_cumulative_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_counter <em>Strong DC magnetic field event counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strong DC magnetic field event counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_counter()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_time <em>Strong DC magnetic field event time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strong DC magnetic field event time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_time()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_time();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_duration <em>Strong DC magnetic field event duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strong DC magnetic field event duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_cumulative_duration <em>Strong DC magnetic field event cumulative duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strong DC magnetic field event cumulative duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getStrong_DC_magnetic_field_event_cumulative_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Strong_DC_magnetic_field_event_cumulative_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_counter <em>Supply control switch event counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supply control switch event counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_counter()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Supply_control_switch_event_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_time <em>Supply control switch event time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supply control switch event time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_time()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Supply_control_switch_event_time();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_duration <em>Supply control switch event duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supply control switch event duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Supply_control_switch_event_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_cumulative_duration <em>Supply control switch event cumulative duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supply control switch event cumulative duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getSupply_control_switch_event_cumulative_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Supply_control_switch_event_cumulative_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_counter <em>Metrology tamper event counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrology tamper event counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_counter()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Metrology_tamper_event_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_time <em>Metrology tamper event time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrology tamper event time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_time()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Metrology_tamper_event_time();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_duration <em>Metrology tamper event duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrology tamper event duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Metrology_tamper_event_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_cumulative_duration <em>Metrology tamper event cumulative duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrology tamper event cumulative duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getMetrology_tamper_event_cumulative_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Metrology_tamper_event_cumulative_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_counter <em>Communication tamper event counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication tamper event counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_counter()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Communication_tamper_event_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_time <em>Communication tamper event time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication tamper event time</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_time()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Communication_tamper_event_time();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_duration <em>Communication tamper event duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication tamper event duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Communication_tamper_event_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_cumulative_duration <em>Communication tamper event cumulative duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication tamper event cumulative duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getCommunication_tamper_event_cumulative_duration()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Communication_tamper_event_cumulative_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getManufacturer_specific <em>Manufacturer specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer specific</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject#getManufacturer_specific()
	 * @see #getMeterTemperEventRelatedObject()
	 * @generated
	 */
	EAttribute getMeterTemperEventRelatedObject_Manufacturer_specific();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues <em>Electricity Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity Values</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues
	 * @generated
	 */
	EClass getElectricityValues();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerpL1 <em>Active Powerp L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Powerp L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerpL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerpL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerpall <em>Active Powerpall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Powerpall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerpall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerpall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerpL2 <em>Active Powerp L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Powerp L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerpL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerpL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerpL3 <em>Active Powerp L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Powerp L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerpL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerpL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowermL2 <em>Active Powerm L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Powerm L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowermL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowermL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowermL1 <em>Active Powerm L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Powerm L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowermL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowermL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowermL3 <em>Active Powerm L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Powerm L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowermL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowermL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowermall <em>Active Powermall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Powermall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowermall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowermall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerpL1 <em>Reactive Powerp L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Powerp L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerpL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerpL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerpL2 <em>Reactive Powerp L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Powerp L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerpL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerpL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerpL3 <em>Reactive Powerp L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Powerp L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerpL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerpL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerpall <em>Reactive Powerpall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Powerpall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerpall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerpall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowermL1 <em>Reactive Powerm L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Powerm L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowermL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowermL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowermL2 <em>Reactive Powerm L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Powerm L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowermL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowermL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowermL3 <em>Reactive Powerm L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Powerm L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowermL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowermL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowermall <em>Reactive Powermall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Powermall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowermall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowermall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIL1 <em>Reactive Power QIL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIL2 <em>Reactive Power QIL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIL3 <em>Reactive Power QIL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIall <em>Reactive Power QIall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIL1 <em>Reactive Power QIIL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIIL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIL2 <em>Reactive Power QIIL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIIL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIL3 <em>Reactive Power QIIL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIIL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIall <em>Reactive Power QI Iall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QI Iall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIIall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIIL1 <em>Reactive Power QIIIL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIIIL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIIL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIIIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIIL2 <em>Reactive Power QIIIL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIIIL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIIL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIIIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIIL3 <em>Reactive Power QIIIL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIIIL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIIL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIIIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIIall <em>Reactive Power QII Iall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QII Iall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIIIall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIIIall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIVL1 <em>Reactive Power QIVL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIVL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIVL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIVL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIVL2 <em>Reactive Power QIVL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIVL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIVL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIVL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIVL3 <em>Reactive Power QIVL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QIVL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIVL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIVL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIVall <em>Reactive Power QI Vall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Power QI Vall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getReactivePowerQIVall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ReactivePowerQIVall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowerpL1 <em>Apparent Powerp L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent Powerp L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowerpL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ApparentPowerpL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowerpL2 <em>Apparent Powerp L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent Powerp L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowerpL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ApparentPowerpL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowerpL3 <em>Apparent Powerp L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent Powerp L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowerpL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ApparentPowerpL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowerpAll <em>Apparent Powerp All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent Powerp All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowerpAll()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ApparentPowerpAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowermL1 <em>Apparent Powerm L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent Powerm L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowermL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ApparentPowermL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowermL2 <em>Apparent Powerm L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent Powerm L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowermL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ApparentPowermL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowermL3 <em>Apparent Powerm L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent Powerm L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowermL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ApparentPowermL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowermAll <em>Apparent Powerm All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apparent Powerm All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getApparentPowermAll()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ApparentPowermAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getCurrentL1 <em>Current L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getCurrentL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_CurrentL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getCurrentL2 <em>Current L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getCurrentL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_CurrentL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getCurrentL3 <em>Current L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getCurrentL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_CurrentL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getCurrentAll <em>Current All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getCurrentAll()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_CurrentAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getVoltageL1 <em>Voltage L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getVoltageL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_VoltageL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getVoltageL2 <em>Voltage L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getVoltageL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_VoltageL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getVoltageL3 <em>Voltage L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getVoltageL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_VoltageL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getVoltageAll <em>Voltage All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getVoltageAll()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_VoltageAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getPowerFactorL1 <em>Power Factor L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Factor L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getPowerFactorL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_PowerFactorL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getPowerFactorL2 <em>Power Factor L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Factor L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getPowerFactorL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_PowerFactorL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getPowerFactorL3 <em>Power Factor L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Factor L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getPowerFactorL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_PowerFactorL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getPowerFactorAll <em>Power Factor All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Factor All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getPowerFactorAll()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_PowerFactorAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getSupplyFrequencyL1 <em>Supply Frequency L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supply Frequency L1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getSupplyFrequencyL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_SupplyFrequencyL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getSupplyFrequencyL2 <em>Supply Frequency L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supply Frequency L2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getSupplyFrequencyL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_SupplyFrequencyL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getSupplyFrequencyL3 <em>Supply Frequency L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supply Frequency L3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getSupplyFrequencyL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_SupplyFrequencyL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getSupplyFrequencyAll <em>Supply Frequency All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supply Frequency All</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getSupplyFrequencyAll()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_SupplyFrequencyAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsPL1 <em>Active Power Abs PL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power Abs PL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsPL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerAbsPL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsPL2 <em>Active Power Abs PL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power Abs PL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsPL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerAbsPL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsPL3 <em>Active Power Abs PL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power Abs PL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsPL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerAbsPL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsPAll <em>Active Power Abs PAll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power Abs PAll</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsPAll()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerAbsPAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsML1 <em>Active Power Abs ML1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power Abs ML1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsML1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerAbsML1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsML2 <em>Active Power Abs ML2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power Abs ML2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsML2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerAbsML2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsML3 <em>Active Power Abs ML3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power Abs ML3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsML3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerAbsML3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsMAll <em>Active Power Abs MAll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power Abs MAll</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerAbsMAll()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerAbsMAll();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIL1 <em>Active Power QIL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIL2 <em>Active Power QIL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIL3 <em>Active Power QIL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIall <em>Active Power QIall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIL1 <em>Active Power QIIL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIIL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIL2 <em>Active Power QIIL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIIL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIL3 <em>Active Power QIIL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIIL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIall <em>Active Power QI Iall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QI Iall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIIall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIIL1 <em>Active Power QIIIL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIIIL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIIL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIIIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIIL2 <em>Active Power QIIIL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIIIL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIIL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIIIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIIL3 <em>Active Power QIIIL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIIIL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIIL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIIIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIIall <em>Active Power QII Iall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QII Iall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIIIall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIIIall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIVL1 <em>Active Power QIVL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIVL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIVL1()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIVL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIVL2 <em>Active Power QIVL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIVL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIVL2()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIVL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIVL3 <em>Active Power QIVL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QIVL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIVL3()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIVL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIVall <em>Active Power QI Vall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power QI Vall</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getActivePowerQIVall()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_ActivePowerQIVall();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getAngles <em>Angles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angles</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getAngles()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_Angles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getPulses <em>Pulses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pulses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getPulses()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_Pulses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getAmpere_squaredHours <em>Ampere squared Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ampere squared Hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getAmpere_squaredHours()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_Ampere_squaredHours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getVolt_squaredHours <em>Volt squared Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volt squared Hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getVolt_squaredHours()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_Volt_squaredHours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getNeutralCurrent <em>Neutral Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Current</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getNeutralCurrent()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_NeutralCurrent();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues#getNeutralVoltage <em>Neutral Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Voltage</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues#getNeutralVoltage()
	 * @see #getElectricityValues()
	 * @generated
	 */
	EAttribute getElectricityValues_NeutralVoltage();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Values</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues
	 * @generated
	 */
	EClass getMeasurementValues();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getBilling_period_average <em>Billing period average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing period average</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getBilling_period_average()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Billing_period_average();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCumulative_minimum <em>Cumulative minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cumulative minimum</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getCumulative_minimum()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Cumulative_minimum();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCumulative_maximum <em>Cumulative maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cumulative maximum</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getCumulative_maximum()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Cumulative_maximum();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getMinimum()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCurrent_average <em>Current average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current average</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getCurrent_average()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Current_average();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getLast_average <em>Last average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last average</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getLast_average()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Last_average();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getMaximum()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getInstantaneous_value <em>Instantaneous value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantaneous value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getInstantaneous_value()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Instantaneous_value();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_integral <em>Time integral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time integral</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_integral()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Time_integral();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_threshold <em>Under limit threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Under limit threshold</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_threshold()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Under_limit_threshold();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_occurrence_counter <em>Under limit occurrence counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Under limit occurrence counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_occurrence_counter()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Under_limit_occurrence_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_duration <em>Under limit duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Under limit duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_duration()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Under_limit_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_magnitude <em>Under limit magnitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Under limit magnitude</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getUnder_limit_magnitude()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Under_limit_magnitude();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_threshold <em>Over limit threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over limit threshold</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_threshold()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Over_limit_threshold();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_occurrence_counter <em>Over limit occurrence counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over limit occurrence counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_occurrence_counter()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Over_limit_occurrence_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_duration <em>Over limit duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over limit duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_duration()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Over_limit_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_magnitude <em>Over limit magnitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over limit magnitude</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getOver_limit_magnitude()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Over_limit_magnitude();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_threshold <em>Missing threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing threshold</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_threshold()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Missing_threshold();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_occurrence_counter <em>Missing occurrence counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing occurrence counter</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_occurrence_counter()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Missing_occurrence_counter();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_duration <em>Missing duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing duration</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_duration()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Missing_duration();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_magnitude <em>Missing magnitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing magnitude</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#isMissing_magnitude()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Missing_magnitude();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_under_limit <em>Time threshold for under limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time threshold for under limit</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_under_limit()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Time_threshold_for_under_limit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_over_limit <em>Time threshold for over limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time threshold for over limit</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_over_limit()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Time_threshold_for_over_limit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_missing_magnitude <em>Time threshold for missing magnitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time threshold for missing magnitude</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getTime_threshold_for_missing_magnitude()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Time_threshold_for_missing_magnitude();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getContracted_value <em>Contracted value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contracted value</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getContracted_value()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Contracted_value();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMinimum_for_recording_interval <em>Minimum for recording interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum for recording interval</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getMinimum_for_recording_interval()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Minimum_for_recording_interval();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getMaximum_for_recording_interval <em>Maximum for recording interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum for recording interval</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getMaximum_for_recording_interval()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Maximum_for_recording_interval();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getTest_average <em>Test average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test average</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getTest_average()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EAttribute getMeasurementValues_Test_average();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues#getCalculations <em>Calculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calculations</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues#getCalculations()
	 * @see #getMeasurementValues()
	 * @generated
	 */
	EReference getMeasurementValues_Calculations();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics <em>Electricity Harmonics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electricity Harmonics</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics
	 * @generated
	 */
	EClass getElectricityHarmonics();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getTotal()
	 * @see #getElectricityHarmonics()
	 * @generated
	 */
	EAttribute getElectricityHarmonics_Total();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getFundamental_harmonic <em>Fundamental harmonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fundamental harmonic</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getFundamental_harmonic()
	 * @see #getElectricityHarmonics()
	 * @generated
	 */
	EAttribute getElectricityHarmonics_Fundamental_harmonic();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getHarmonic <em>Harmonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Harmonic</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getHarmonic()
	 * @see #getElectricityHarmonics()
	 * @generated
	 */
	EAttribute getElectricityHarmonics_Harmonic();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getTotal_Harmoni_Distortion <em>Total Harmoni Distortion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Harmoni Distortion</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getTotal_Harmoni_Distortion()
	 * @see #getElectricityHarmonics()
	 * @generated
	 */
	EAttribute getElectricityHarmonics_Total_Harmoni_Distortion();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getTotal_Demand_Distortion <em>Total Demand Distortion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Demand Distortion</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getTotal_Demand_Distortion()
	 * @see #getElectricityHarmonics()
	 * @generated
	 */
	EAttribute getElectricityHarmonics_Total_Demand_Distortion();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getAll_harmonics <em>All harmonics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All harmonics</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getAll_harmonics()
	 * @see #getElectricityHarmonics()
	 * @generated
	 */
	EAttribute getElectricityHarmonics_All_harmonics();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getAll_harmonics_to_nominal_value_ratio <em>All harmonics to nominal value ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All harmonics to nominal value ratio</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics#getAll_harmonics_to_nominal_value_ratio()
	 * @see #getElectricityHarmonics()
	 * @generated
	 */
	EAttribute getElectricityHarmonics_All_harmonics_to_nominal_value_ratio();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement <em>Extended Phase Angle Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Phase Angle Measurement</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement
	 * @generated
	 */
	EClass getExtendedPhaseAngleMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toUL2 <em>From UL 1to UL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 1to UL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toUL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL1toUL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toUL3 <em>From UL 1to UL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 1to UL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toUL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL1toUL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toIL1 <em>From UL 1to IL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 1to IL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toIL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL1toIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toIL2 <em>From UL 1to IL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 1to IL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toIL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL1toIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toIL3 <em>From UL 1to IL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 1to IL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toIL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL1toIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toIL0 <em>From UL 1to IL0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 1to IL0</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL1toIL0()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL1toIL0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toUL1 <em>From UL 2to UL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 2to UL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toUL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL2toUL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toUL3 <em>From UL 2to UL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 2to UL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toUL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL2toUL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toIL1 <em>From UL 2to IL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 2to IL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toIL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL2toIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toIL2 <em>From UL 2to IL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 2to IL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toIL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL2toIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toIL3 <em>From UL 2to IL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 2to IL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toIL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL2toIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toIL0 <em>From UL 2to IL0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 2to IL0</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL2toIL0()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL2toIL0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toUL1 <em>From UL 3to UL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 3to UL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toUL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL3toUL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toUL2 <em>From UL 3to UL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 3to UL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toUL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL3toUL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toIL1 <em>From UL 3to IL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 3to IL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toIL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL3toIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toIL2 <em>From UL 3to IL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 3to IL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toIL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL3toIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toIL3 <em>From UL 3to IL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 3to IL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toIL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL3toIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toIL0 <em>From UL 3to IL0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From UL 3to IL0</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromUL3toIL0()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromUL3toIL0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toUL1 <em>From IL 1to UL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 1to UL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toUL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL1toUL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toUL2 <em>From IL 1to UL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 1to UL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toUL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL1toUL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toUL3 <em>From IL 1to UL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 1to UL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toUL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL1toUL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toIL2 <em>From IL 1to IL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 1to IL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toIL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL1toIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toIL3 <em>From IL 1to IL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 1to IL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toIL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL1toIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toIL0 <em>From IL 1to IL0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 1to IL0</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL1toIL0()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL1toIL0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toUL1 <em>From IL 2to UL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 2to UL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toUL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL2toUL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toUL2 <em>From IL 2to UL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 2to UL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toUL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL2toUL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toUL3 <em>From IL 2to UL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 2to UL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toUL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL2toUL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toIL1 <em>From IL 2to IL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 2to IL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toIL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL2toIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toIL3 <em>From IL 2to IL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 2to IL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toIL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL2toIL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toIL0 <em>From IL 2to IL0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 2to IL0</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL2toIL0()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL2toIL0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toUL1 <em>From IL 3to UL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 3to UL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toUL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL3toUL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toUL2 <em>From IL 3to UL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 3to UL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toUL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL3toUL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toUL3 <em>From IL 3to UL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 3to UL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toUL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL3toUL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toIL1 <em>From IL 3to IL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 3to IL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toIL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL3toIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toIL2 <em>From IL 3to IL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 3to IL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toIL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL3toIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toIL0 <em>From IL 3to IL0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 3to IL0</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL3toIL0()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL3toIL0();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toUL1 <em>From IL 0to UL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 0to UL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toUL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL0toUL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toUL2 <em>From IL 0to UL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 0to UL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toUL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL0toUL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toUL3 <em>From IL 0to UL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 0to UL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toUL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL0toUL3();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toIL1 <em>From IL 0to IL1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 0to IL1</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toIL1()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL0toIL1();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toIL2 <em>From IL 0to IL2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 0to IL2</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toIL2()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL0toIL2();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toIL3 <em>From IL 0to IL3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From IL 0to IL3</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement#getFromIL0toIL3()
	 * @see #getExtendedPhaseAngleMeasurement()
	 * @generated
	 */
	EAttribute getExtendedPhaseAngleMeasurement_FromIL0toIL3();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses <em>Transformer And Line Losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer And Line Losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses
	 * @generated
	 */
	EClass getTransformerAndLineLosses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses_P <em>Active line losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active line losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_line_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses_M <em>Active line losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active line losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_line_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses <em>Active line losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active line losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_line_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_line_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses_P <em>Active transformer losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active transformer losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_transformer_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses_M <em>Active transformer losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active transformer losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_transformer_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses <em>Active transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses_P <em>Active losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses_M <em>Active losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses <em>Active losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getActive_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Active_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses_P <em>Reactive line losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive line losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_line_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses_M <em>Reactive line losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive line losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_line_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses <em>Reactive line losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive line losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_line_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_line_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses_P <em>Reactive transformer losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive transformer losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_transformer_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses_M <em>Reactive transformer losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive transformer losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_transformer_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses <em>Reactive transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses_P <em>Reactive losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses_M <em>Reactive losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses <em>Reactive losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getReactive_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Reactive_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getTotal_normalized_transformer_losses <em>Total normalized transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total normalized transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getTotal_normalized_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Total_normalized_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getTotal_normalized_line_losses <em>Total normalized line losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total normalized line losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getTotal_normalized_line_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Total_normalized_line_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_gross_P <em>Compensated active gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensated active gross P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_gross_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Compensated_active_gross_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_net_P <em>Compensated active net P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensated active net P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_net_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Compensated_active_net_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_gross_M <em>Compensated active gross M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensated active gross M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_gross_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Compensated_active_gross_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_net_M <em>Compensated active net M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensated active net M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_active_net_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Compensated_active_net_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_gross_P <em>Compensated reactive gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensated reactive gross P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_gross_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Compensated_reactive_gross_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_net_P <em>Compensated reactive net P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensated reactive net P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_net_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Compensated_reactive_net_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_gross_M <em>Compensated reactive gross M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensated reactive gross M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_gross_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Compensated_reactive_gross_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_net_M <em>Compensated reactive net M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensated reactive net M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getCompensated_reactive_net_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_Compensated_reactive_net_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_line_losses <em>L1active line losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1active line losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_line_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1active_line_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_line_losses_M <em>L1active line losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1active line losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_line_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1active_line_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses_P <em>L1active transformer losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1active transformer losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1active_transformer_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses_M <em>L1active transformer losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1active transformer losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1active_transformer_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses <em>L1active transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1active transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1active_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses_P <em>L1active losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1active losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1active_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses_M <em>L1active losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1active losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1active_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses <em>L1active losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1active losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1active_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1active_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses_P <em>L1reactive line losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1reactive line losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1reactive_line_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses_M <em>L1reactive line losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1reactive line losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1reactive_line_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses <em>L1reactive line losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1reactive line losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_line_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1reactive_line_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses_P <em>L1reactive transformer losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1reactive transformer losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1reactive_transformer_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses_M <em>L1reactive transformer losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1reactive transformer losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1reactive_transformer_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses <em>L1reactive transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1reactive transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1reactive_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1reactive_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses_P <em>L1 Reactive losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1 Reactive losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1Reactive_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses_M <em>L1 Reactive losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1 Reactive losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1Reactive_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses <em>L1 Reactive losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1 Reactive losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Reactive_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1Reactive_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Ampere_squared_hours <em>L1 Ampere squared hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1 Ampere squared hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Ampere_squared_hours()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1Ampere_squared_hours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Volt_squared_hours <em>L1 Volt squared hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L1 Volt squared hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL1Volt_squared_hours()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L1Volt_squared_hours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_line_losses_P <em>L2active line losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2active line losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_line_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2active_line_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_line_losses_M <em>L2active line losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2active line losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_line_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2active_line_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses_P <em>L2active transformer losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2active transformer losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2active_transformer_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses_M <em>L2active transformer losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2active transformer losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2active_transformer_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses <em>L2active transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2active transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2active_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses_P <em>L2active losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2active losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2active_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses_M <em>L2active losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2active losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2active_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses <em>L2active losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2active losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2active_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2active_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses_P <em>L2reactive line losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive line losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_line_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses_M <em>L2reactive line losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive line losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_line_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses <em>L2reactive line losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive line losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_line_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_line_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses <em>L2reactive transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses_P <em>L2reactive transformer losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive transformer losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_transformer_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses_M <em>L2reactive transformer losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive transformer losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_transformer_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_transformer_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses <em>L2reactive losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses_P <em>L2reactive losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses_M <em>L2reactive losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2reactive losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2reactive_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2reactive_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2Ampere_squared_hours <em>L2 Ampere squared hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2 Ampere squared hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2Ampere_squared_hours()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2Ampere_squared_hours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2Volt_squared_hours <em>L2 Volt squared hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2 Volt squared hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL2Volt_squared_hours()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L2Volt_squared_hours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Active_line_losses_P <em>L3 Active line losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3 Active line losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Active_line_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3Active_line_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Active_line_losses_M <em>L3 Active line losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3 Active line losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Active_line_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3Active_line_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses_P <em>L3active transformer losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3active transformer losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3active_transformer_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses_M <em>L3active transformer losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3active transformer losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3active_transformer_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses <em>L3active transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3active transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3active_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses_P <em>L3active losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3active losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3active_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses_M <em>L3active losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3active losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3active_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses <em>L3active losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3active losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3active_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3active_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses_P <em>L3reactive line losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive line losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_line_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses_M <em>L3reactive line losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive line losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_line_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses <em>L3reactive line losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive line losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_line_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_line_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses_P <em>L3reactive transformer losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive transformer losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_transformer_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses_M <em>L3reactive transformer losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive transformer losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_transformer_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses <em>L3reactive transformer losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive transformer losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_transformer_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_transformer_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses_P <em>L3reactive losses P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive losses P</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses_P()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_losses_P();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses_M <em>L3reactive losses M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive losses M</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses_M()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_losses_M();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses <em>L3reactive losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3reactive losses</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3reactive_losses()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3reactive_losses();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Ampere_squared_hours <em>L3 Ampere squared hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3 Ampere squared hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Ampere_squared_hours()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3Ampere_squared_hours();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Volt_Squared_hours <em>L3 Volt Squared hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L3 Volt Squared hours</em>'.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses#getL3Volt_Squared_hours()
	 * @see #getTransformerAndLineLosses()
	 * @generated
	 */
	EAttribute getTransformerAndLineLosses_L3Volt_Squared_hours();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	COSEMObjectsFactory getCOSEMObjectsFactory();

} //COSEMObjectsPackage
