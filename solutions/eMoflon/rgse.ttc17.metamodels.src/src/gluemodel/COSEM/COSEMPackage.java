/**
 */
package gluemodel.COSEM;

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
 * @see gluemodel.COSEM.COSEMFactory
 * @model kind="package"
 * @generated
 */
public interface COSEMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "COSEM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/cosem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cosem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	COSEMPackage eINSTANCE = gluemodel.COSEM.impl.COSEMPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.impl.LogicalDeviceImpl <em>Logical Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.impl.LogicalDeviceImpl
	 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getLogicalDevice()
	 * @generated
	 */
	int LOGICAL_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>AA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__AA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Auto Connect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__AUTO_CONNECT = 2;

	/**
	 * The feature id for the '<em><b>Billing Period Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__BILLING_PERIOD_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Electricity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__ELECTRICITY_ID = 4;

	/**
	 * The feature id for the '<em><b>Program Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__PROGRAM_ENTRIES = 5;

	/**
	 * The feature id for the '<em><b>Output Pulse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__OUTPUT_PULSE = 6;

	/**
	 * The feature id for the '<em><b>Reading Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__READING_FACTOR = 7;

	/**
	 * The feature id for the '<em><b>Nominal Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__NOMINAL_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Input Pulse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__INPUT_PULSE = 9;

	/**
	 * The feature id for the '<em><b>Measurement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__MEASUREMENT_PERIOD = 10;

	/**
	 * The feature id for the '<em><b>Time Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__TIME_ENTRIES = 11;

	/**
	 * The feature id for the '<em><b>Transformer Line Losses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__TRANSFORMER_LINE_LOSSES = 12;

	/**
	 * The feature id for the '<em><b>Measurement Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__MEASUREMENT_ALGORITHM = 13;

	/**
	 * The feature id for the '<em><b>Metering Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__METERING_POINT = 14;

	/**
	 * The feature id for the '<em><b>Electricity Related Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__ELECTRICITY_RELATED_STATUS = 15;

	/**
	 * The feature id for the '<em><b>Register Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__REGISTER_MONITOR = 16;

	/**
	 * The feature id for the '<em><b>Electricity Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__ELECTRICITY_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Measurement Value Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__MEASUREMENT_VALUE_TYPES = 18;

	/**
	 * The feature id for the '<em><b>Harmonics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__HARMONICS = 19;

	/**
	 * The feature id for the '<em><b>Tariffs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__TARIFFS = 20;

	/**
	 * The feature id for the '<em><b>Phaseangles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__PHASEANGLES = 21;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE__ID = 22;

	/**
	 * The number of structural features of the '<em>Logical Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Logical Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.impl.PhysicalDeviceImpl <em>Physical Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.impl.PhysicalDeviceImpl
	 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getPhysicalDevice()
	 * @generated
	 */
	int PHYSICAL_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Management Logical Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__MANAGEMENT_LOGICAL_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__ID = 1;

	/**
	 * The feature id for the '<em><b>Logical Device</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__LOGICAL_DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Electricity Related Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS = 3;

	/**
	 * The feature id for the '<em><b>AA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__AA = 4;

	/**
	 * The feature id for the '<em><b>Auto Connect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__AUTO_CONNECT = 5;

	/**
	 * The feature id for the '<em><b>Billing Period Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__BILLING_PERIOD_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Electricity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__ELECTRICITY_ID = 7;

	/**
	 * The feature id for the '<em><b>Program Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__PROGRAM_ENTRIES = 8;

	/**
	 * The feature id for the '<em><b>Output Pulse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__OUTPUT_PULSE = 9;

	/**
	 * The feature id for the '<em><b>Reading Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__READING_FACTOR = 10;

	/**
	 * The feature id for the '<em><b>Nominal Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__NOMINAL_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Input Pulse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__INPUT_PULSE = 12;

	/**
	 * The feature id for the '<em><b>Measurement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__MEASUREMENT_PERIOD = 13;

	/**
	 * The feature id for the '<em><b>Time Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__TIME_ENTRIES = 14;

	/**
	 * The feature id for the '<em><b>Transformer Line Losses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES = 15;

	/**
	 * The feature id for the '<em><b>Measurement Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM = 16;

	/**
	 * The feature id for the '<em><b>Metering Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__METERING_POINT = 17;

	/**
	 * The feature id for the '<em><b>Register Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__REGISTER_MONITOR = 18;

	/**
	 * The feature id for the '<em><b>Electricity Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__ELECTRICITY_VALUES = 19;

	/**
	 * The feature id for the '<em><b>Measurement Value Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES = 20;

	/**
	 * The feature id for the '<em><b>Harmonics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__HARMONICS = 21;

	/**
	 * The feature id for the '<em><b>Tariffs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__TARIFFS = 22;

	/**
	 * The feature id for the '<em><b>Phaseangles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE__PHASEANGLES = 23;

	/**
	 * The number of structural features of the '<em>Physical Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Physical Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.impl.ManagementLogicalDeviceImpl <em>Management Logical Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.impl.ManagementLogicalDeviceImpl
	 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getManagementLogicalDevice()
	 * @generated
	 */
	int MANAGEMENT_LOGICAL_DEVICE = 2;

	/**
	 * The feature id for the '<em><b>AA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__AA = LOGICAL_DEVICE__AA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__NAME = LOGICAL_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Auto Connect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__AUTO_CONNECT = LOGICAL_DEVICE__AUTO_CONNECT;

	/**
	 * The feature id for the '<em><b>Billing Period Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__BILLING_PERIOD_VALUES = LOGICAL_DEVICE__BILLING_PERIOD_VALUES;

	/**
	 * The feature id for the '<em><b>Electricity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__ELECTRICITY_ID = LOGICAL_DEVICE__ELECTRICITY_ID;

	/**
	 * The feature id for the '<em><b>Program Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__PROGRAM_ENTRIES = LOGICAL_DEVICE__PROGRAM_ENTRIES;

	/**
	 * The feature id for the '<em><b>Output Pulse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__OUTPUT_PULSE = LOGICAL_DEVICE__OUTPUT_PULSE;

	/**
	 * The feature id for the '<em><b>Reading Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__READING_FACTOR = LOGICAL_DEVICE__READING_FACTOR;

	/**
	 * The feature id for the '<em><b>Nominal Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__NOMINAL_VALUES = LOGICAL_DEVICE__NOMINAL_VALUES;

	/**
	 * The feature id for the '<em><b>Input Pulse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__INPUT_PULSE = LOGICAL_DEVICE__INPUT_PULSE;

	/**
	 * The feature id for the '<em><b>Measurement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__MEASUREMENT_PERIOD = LOGICAL_DEVICE__MEASUREMENT_PERIOD;

	/**
	 * The feature id for the '<em><b>Time Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__TIME_ENTRIES = LOGICAL_DEVICE__TIME_ENTRIES;

	/**
	 * The feature id for the '<em><b>Transformer Line Losses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__TRANSFORMER_LINE_LOSSES = LOGICAL_DEVICE__TRANSFORMER_LINE_LOSSES;

	/**
	 * The feature id for the '<em><b>Measurement Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__MEASUREMENT_ALGORITHM = LOGICAL_DEVICE__MEASUREMENT_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Metering Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__METERING_POINT = LOGICAL_DEVICE__METERING_POINT;

	/**
	 * The feature id for the '<em><b>Electricity Related Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__ELECTRICITY_RELATED_STATUS = LOGICAL_DEVICE__ELECTRICITY_RELATED_STATUS;

	/**
	 * The feature id for the '<em><b>Register Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__REGISTER_MONITOR = LOGICAL_DEVICE__REGISTER_MONITOR;

	/**
	 * The feature id for the '<em><b>Electricity Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__ELECTRICITY_VALUES = LOGICAL_DEVICE__ELECTRICITY_VALUES;

	/**
	 * The feature id for the '<em><b>Measurement Value Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__MEASUREMENT_VALUE_TYPES = LOGICAL_DEVICE__MEASUREMENT_VALUE_TYPES;

	/**
	 * The feature id for the '<em><b>Harmonics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__HARMONICS = LOGICAL_DEVICE__HARMONICS;

	/**
	 * The feature id for the '<em><b>Tariffs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__TARIFFS = LOGICAL_DEVICE__TARIFFS;

	/**
	 * The feature id for the '<em><b>Phaseangles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__PHASEANGLES = LOGICAL_DEVICE__PHASEANGLES;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE__ID = LOGICAL_DEVICE__ID;

	/**
	 * The number of structural features of the '<em>Management Logical Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE_FEATURE_COUNT = LOGICAL_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Management Logical Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_LOGICAL_DEVICE_OPERATION_COUNT = LOGICAL_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.impl.LogicalDeviceNameImpl <em>Logical Device Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.impl.LogicalDeviceNameImpl
	 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getLogicalDeviceName()
	 * @generated
	 */
	int LOGICAL_DEVICE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Logical Device Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE_NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logical Device Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DEVICE_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gluemodel.COSEM.impl.COSEMRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.COSEM.impl.COSEMRootImpl
	 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getCOSEMRoot()
	 * @generated
	 */
	int COSEM_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Physical Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSEM_ROOT__PHYSICAL_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Logical Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSEM_ROOT__LOGICAL_DEVICE = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSEM_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSEM_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.LogicalDevice <em>Logical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Device</em>'.
	 * @see gluemodel.COSEM.LogicalDevice
	 * @generated
	 */
	EClass getLogicalDevice();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getAA <em>AA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AA</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getAA()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_AA();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getName()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getAutoConnect <em>Auto Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Connect</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getAutoConnect()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_AutoConnect();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getBillingPeriodValues <em>Billing Period Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Period Values</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getBillingPeriodValues()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_BillingPeriodValues();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getElectricityID <em>Electricity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electricity ID</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getElectricityID()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_ElectricityID();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getProgramEntries <em>Program Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Entries</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getProgramEntries()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_ProgramEntries();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getOutputPulse <em>Output Pulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Pulse</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getOutputPulse()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_OutputPulse();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getReadingFactor <em>Reading Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reading Factor</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getReadingFactor()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_ReadingFactor();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getNominalValues <em>Nominal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Values</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getNominalValues()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_NominalValues();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getInputPulse <em>Input Pulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Pulse</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getInputPulse()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_InputPulse();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getMeasurementPeriod <em>Measurement Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Period</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getMeasurementPeriod()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_MeasurementPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getTimeEntries <em>Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Entries</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getTimeEntries()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_TimeEntries();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getTransformerLineLosses <em>Transformer Line Losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Line Losses</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getTransformerLineLosses()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_TransformerLineLosses();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getMeasurementAlgorithm <em>Measurement Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Algorithm</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getMeasurementAlgorithm()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_MeasurementAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getMeteringPoint <em>Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metering Point</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getMeteringPoint()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_MeteringPoint();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getElectricityRelatedStatus <em>Electricity Related Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electricity Related Status</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getElectricityRelatedStatus()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_ElectricityRelatedStatus();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getRegisterMonitor <em>Register Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Register Monitor</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getRegisterMonitor()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_RegisterMonitor();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getElectricityValues <em>Electricity Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electricity Values</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getElectricityValues()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_ElectricityValues();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getMeasurementValueTypes <em>Measurement Value Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Value Types</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getMeasurementValueTypes()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_MeasurementValueTypes();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getHarmonics <em>Harmonics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Harmonics</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getHarmonics()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_Harmonics();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tariffs</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getTariffs()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_Tariffs();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDevice#getPhaseangles <em>Phaseangles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phaseangles</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getPhaseangles()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EReference getLogicalDevice_Phaseangles();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.LogicalDevice#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gluemodel.COSEM.LogicalDevice#getID()
	 * @see #getLogicalDevice()
	 * @generated
	 */
	EAttribute getLogicalDevice_ID();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.PhysicalDevice <em>Physical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Device</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice
	 * @generated
	 */
	EClass getPhysicalDevice();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.COSEM.PhysicalDevice#getManagementLogicalDevice <em>Management Logical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Management Logical Device</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getManagementLogicalDevice()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_ManagementLogicalDevice();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.COSEM.PhysicalDevice#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getID()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EAttribute getPhysicalDevice_ID();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.COSEM.PhysicalDevice#getLogicalDevice <em>Logical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical Device</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getLogicalDevice()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_LogicalDevice();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getElectricityRelatedStatus <em>Electricity Related Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electricity Related Status</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getElectricityRelatedStatus()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_ElectricityRelatedStatus();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getAA <em>AA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AA</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getAA()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_AA();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getAutoConnect <em>Auto Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Connect</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getAutoConnect()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_AutoConnect();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getBillingPeriodValues <em>Billing Period Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Period Values</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getBillingPeriodValues()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_BillingPeriodValues();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getElectricityID <em>Electricity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electricity ID</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getElectricityID()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_ElectricityID();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getProgramEntries <em>Program Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Entries</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getProgramEntries()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_ProgramEntries();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getOutputPulse <em>Output Pulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Pulse</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getOutputPulse()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_OutputPulse();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getReadingFactor <em>Reading Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reading Factor</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getReadingFactor()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_ReadingFactor();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getNominalValues <em>Nominal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Values</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getNominalValues()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_NominalValues();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getInputPulse <em>Input Pulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Pulse</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getInputPulse()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_InputPulse();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getMeasurementPeriod <em>Measurement Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Period</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getMeasurementPeriod()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_MeasurementPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getTimeEntries <em>Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Entries</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getTimeEntries()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_TimeEntries();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getTransformerLineLosses <em>Transformer Line Losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformer Line Losses</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getTransformerLineLosses()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_TransformerLineLosses();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getMeasurementAlgorithm <em>Measurement Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Algorithm</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getMeasurementAlgorithm()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_MeasurementAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getMeteringPoint <em>Metering Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metering Point</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getMeteringPoint()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_MeteringPoint();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getRegisterMonitor <em>Register Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Register Monitor</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getRegisterMonitor()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_RegisterMonitor();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getElectricityValues <em>Electricity Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electricity Values</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getElectricityValues()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_ElectricityValues();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getMeasurementValueTypes <em>Measurement Value Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurement Value Types</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getMeasurementValueTypes()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_MeasurementValueTypes();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getHarmonics <em>Harmonics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Harmonics</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getHarmonics()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_Harmonics();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tariffs</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getTariffs()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_Tariffs();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.PhysicalDevice#getPhaseangles <em>Phaseangles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phaseangles</em>'.
	 * @see gluemodel.COSEM.PhysicalDevice#getPhaseangles()
	 * @see #getPhysicalDevice()
	 * @generated
	 */
	EReference getPhysicalDevice_Phaseangles();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.ManagementLogicalDevice <em>Management Logical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Logical Device</em>'.
	 * @see gluemodel.COSEM.ManagementLogicalDevice
	 * @generated
	 */
	EClass getManagementLogicalDevice();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.LogicalDeviceName <em>Logical Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Device Name</em>'.
	 * @see gluemodel.COSEM.LogicalDeviceName
	 * @generated
	 */
	EClass getLogicalDeviceName();

	/**
	 * Returns the meta object for the containment reference '{@link gluemodel.COSEM.LogicalDeviceName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see gluemodel.COSEM.LogicalDeviceName#getName()
	 * @see #getLogicalDeviceName()
	 * @generated
	 */
	EReference getLogicalDeviceName_Name();

	/**
	 * Returns the meta object for class '{@link gluemodel.COSEM.COSEMRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see gluemodel.COSEM.COSEMRoot
	 * @generated
	 */
	EClass getCOSEMRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link gluemodel.COSEM.COSEMRoot#getPhysicalDevice <em>Physical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Device</em>'.
	 * @see gluemodel.COSEM.COSEMRoot#getPhysicalDevice()
	 * @see #getCOSEMRoot()
	 * @generated
	 */
	EReference getCOSEMRoot_PhysicalDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link gluemodel.COSEM.COSEMRoot#getLogicalDevice <em>Logical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Device</em>'.
	 * @see gluemodel.COSEM.COSEMRoot#getLogicalDevice()
	 * @see #getCOSEMRoot()
	 * @generated
	 */
	EReference getCOSEMRoot_LogicalDevice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	COSEMFactory getCOSEMFactory();

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
		 * The meta object literal for the '{@link gluemodel.COSEM.impl.LogicalDeviceImpl <em>Logical Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.impl.LogicalDeviceImpl
		 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getLogicalDevice()
		 * @generated
		 */
		EClass LOGICAL_DEVICE = eINSTANCE.getLogicalDevice();

		/**
		 * The meta object literal for the '<em><b>AA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__AA = eINSTANCE.getLogicalDevice_AA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__NAME = eINSTANCE.getLogicalDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Auto Connect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__AUTO_CONNECT = eINSTANCE.getLogicalDevice_AutoConnect();

		/**
		 * The meta object literal for the '<em><b>Billing Period Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__BILLING_PERIOD_VALUES = eINSTANCE.getLogicalDevice_BillingPeriodValues();

		/**
		 * The meta object literal for the '<em><b>Electricity ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__ELECTRICITY_ID = eINSTANCE.getLogicalDevice_ElectricityID();

		/**
		 * The meta object literal for the '<em><b>Program Entries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__PROGRAM_ENTRIES = eINSTANCE.getLogicalDevice_ProgramEntries();

		/**
		 * The meta object literal for the '<em><b>Output Pulse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__OUTPUT_PULSE = eINSTANCE.getLogicalDevice_OutputPulse();

		/**
		 * The meta object literal for the '<em><b>Reading Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__READING_FACTOR = eINSTANCE.getLogicalDevice_ReadingFactor();

		/**
		 * The meta object literal for the '<em><b>Nominal Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__NOMINAL_VALUES = eINSTANCE.getLogicalDevice_NominalValues();

		/**
		 * The meta object literal for the '<em><b>Input Pulse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__INPUT_PULSE = eINSTANCE.getLogicalDevice_InputPulse();

		/**
		 * The meta object literal for the '<em><b>Measurement Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__MEASUREMENT_PERIOD = eINSTANCE.getLogicalDevice_MeasurementPeriod();

		/**
		 * The meta object literal for the '<em><b>Time Entries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__TIME_ENTRIES = eINSTANCE.getLogicalDevice_TimeEntries();

		/**
		 * The meta object literal for the '<em><b>Transformer Line Losses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__TRANSFORMER_LINE_LOSSES = eINSTANCE.getLogicalDevice_TransformerLineLosses();

		/**
		 * The meta object literal for the '<em><b>Measurement Algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__MEASUREMENT_ALGORITHM = eINSTANCE.getLogicalDevice_MeasurementAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Metering Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__METERING_POINT = eINSTANCE.getLogicalDevice_MeteringPoint();

		/**
		 * The meta object literal for the '<em><b>Electricity Related Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__ELECTRICITY_RELATED_STATUS = eINSTANCE.getLogicalDevice_ElectricityRelatedStatus();

		/**
		 * The meta object literal for the '<em><b>Register Monitor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__REGISTER_MONITOR = eINSTANCE.getLogicalDevice_RegisterMonitor();

		/**
		 * The meta object literal for the '<em><b>Electricity Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__ELECTRICITY_VALUES = eINSTANCE.getLogicalDevice_ElectricityValues();

		/**
		 * The meta object literal for the '<em><b>Measurement Value Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__MEASUREMENT_VALUE_TYPES = eINSTANCE.getLogicalDevice_MeasurementValueTypes();

		/**
		 * The meta object literal for the '<em><b>Harmonics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__HARMONICS = eINSTANCE.getLogicalDevice_Harmonics();

		/**
		 * The meta object literal for the '<em><b>Tariffs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__TARIFFS = eINSTANCE.getLogicalDevice_Tariffs();

		/**
		 * The meta object literal for the '<em><b>Phaseangles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE__PHASEANGLES = eINSTANCE.getLogicalDevice_Phaseangles();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_DEVICE__ID = eINSTANCE.getLogicalDevice_ID();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.impl.PhysicalDeviceImpl <em>Physical Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.impl.PhysicalDeviceImpl
		 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getPhysicalDevice()
		 * @generated
		 */
		EClass PHYSICAL_DEVICE = eINSTANCE.getPhysicalDevice();

		/**
		 * The meta object literal for the '<em><b>Management Logical Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__MANAGEMENT_LOGICAL_DEVICE = eINSTANCE.getPhysicalDevice_ManagementLogicalDevice();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_DEVICE__ID = eINSTANCE.getPhysicalDevice_ID();

		/**
		 * The meta object literal for the '<em><b>Logical Device</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__LOGICAL_DEVICE = eINSTANCE.getPhysicalDevice_LogicalDevice();

		/**
		 * The meta object literal for the '<em><b>Electricity Related Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS = eINSTANCE.getPhysicalDevice_ElectricityRelatedStatus();

		/**
		 * The meta object literal for the '<em><b>AA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__AA = eINSTANCE.getPhysicalDevice_AA();

		/**
		 * The meta object literal for the '<em><b>Auto Connect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__AUTO_CONNECT = eINSTANCE.getPhysicalDevice_AutoConnect();

		/**
		 * The meta object literal for the '<em><b>Billing Period Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__BILLING_PERIOD_VALUES = eINSTANCE.getPhysicalDevice_BillingPeriodValues();

		/**
		 * The meta object literal for the '<em><b>Electricity ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__ELECTRICITY_ID = eINSTANCE.getPhysicalDevice_ElectricityID();

		/**
		 * The meta object literal for the '<em><b>Program Entries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__PROGRAM_ENTRIES = eINSTANCE.getPhysicalDevice_ProgramEntries();

		/**
		 * The meta object literal for the '<em><b>Output Pulse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__OUTPUT_PULSE = eINSTANCE.getPhysicalDevice_OutputPulse();

		/**
		 * The meta object literal for the '<em><b>Reading Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__READING_FACTOR = eINSTANCE.getPhysicalDevice_ReadingFactor();

		/**
		 * The meta object literal for the '<em><b>Nominal Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__NOMINAL_VALUES = eINSTANCE.getPhysicalDevice_NominalValues();

		/**
		 * The meta object literal for the '<em><b>Input Pulse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__INPUT_PULSE = eINSTANCE.getPhysicalDevice_InputPulse();

		/**
		 * The meta object literal for the '<em><b>Measurement Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__MEASUREMENT_PERIOD = eINSTANCE.getPhysicalDevice_MeasurementPeriod();

		/**
		 * The meta object literal for the '<em><b>Time Entries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__TIME_ENTRIES = eINSTANCE.getPhysicalDevice_TimeEntries();

		/**
		 * The meta object literal for the '<em><b>Transformer Line Losses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES = eINSTANCE.getPhysicalDevice_TransformerLineLosses();

		/**
		 * The meta object literal for the '<em><b>Measurement Algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM = eINSTANCE.getPhysicalDevice_MeasurementAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Metering Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__METERING_POINT = eINSTANCE.getPhysicalDevice_MeteringPoint();

		/**
		 * The meta object literal for the '<em><b>Register Monitor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__REGISTER_MONITOR = eINSTANCE.getPhysicalDevice_RegisterMonitor();

		/**
		 * The meta object literal for the '<em><b>Electricity Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__ELECTRICITY_VALUES = eINSTANCE.getPhysicalDevice_ElectricityValues();

		/**
		 * The meta object literal for the '<em><b>Measurement Value Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES = eINSTANCE.getPhysicalDevice_MeasurementValueTypes();

		/**
		 * The meta object literal for the '<em><b>Harmonics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__HARMONICS = eINSTANCE.getPhysicalDevice_Harmonics();

		/**
		 * The meta object literal for the '<em><b>Tariffs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__TARIFFS = eINSTANCE.getPhysicalDevice_Tariffs();

		/**
		 * The meta object literal for the '<em><b>Phaseangles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE__PHASEANGLES = eINSTANCE.getPhysicalDevice_Phaseangles();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.impl.ManagementLogicalDeviceImpl <em>Management Logical Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.impl.ManagementLogicalDeviceImpl
		 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getManagementLogicalDevice()
		 * @generated
		 */
		EClass MANAGEMENT_LOGICAL_DEVICE = eINSTANCE.getManagementLogicalDevice();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.impl.LogicalDeviceNameImpl <em>Logical Device Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.impl.LogicalDeviceNameImpl
		 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getLogicalDeviceName()
		 * @generated
		 */
		EClass LOGICAL_DEVICE_NAME = eINSTANCE.getLogicalDeviceName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DEVICE_NAME__NAME = eINSTANCE.getLogicalDeviceName_Name();

		/**
		 * The meta object literal for the '{@link gluemodel.COSEM.impl.COSEMRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.COSEM.impl.COSEMRootImpl
		 * @see gluemodel.COSEM.impl.COSEMPackageImpl#getCOSEMRoot()
		 * @generated
		 */
		EClass COSEM_ROOT = eINSTANCE.getCOSEMRoot();

		/**
		 * The meta object literal for the '<em><b>Physical Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COSEM_ROOT__PHYSICAL_DEVICE = eINSTANCE.getCOSEMRoot_PhysicalDevice();

		/**
		 * The meta object literal for the '<em><b>Logical Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COSEM_ROOT__LOGICAL_DEVICE = eINSTANCE.getCOSEMRoot_LogicalDevice();

	}

} //COSEMPackage
