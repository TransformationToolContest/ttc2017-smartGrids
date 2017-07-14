/**
 */
package rgse.ttc17.emoflon.tgg.task2;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

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
 * @see rgse.ttc17.emoflon.tgg.task2.Task2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='rgse.ttc17.emoflon.tgg'"
 * @generated
 */
public interface Task2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "task2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/rgse.ttc17.emoflon.tgg.task2/model/Task2.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rgse.ttc17.emoflon.tgg.task2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Task2Package eINSTANCE = rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl.init();

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.ControlAreaToControlSreaImpl <em>Control Area To Control Srea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.ControlAreaToControlSreaImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getControlAreaToControlSrea()
	 * @generated
	 */
	int CONTROL_AREA_TO_CONTROL_SREA = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_TO_CONTROL_SREA__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_TO_CONTROL_SREA__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Area To Control Srea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_TO_CONTROL_SREA_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Area To Control Srea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_TO_CONTROL_SREA_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.ServiceDeliveryPointToServiceDeliveryPointImpl <em>Service Delivery Point To Service Delivery Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.ServiceDeliveryPointToServiceDeliveryPointImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getServiceDeliveryPointToServiceDeliveryPoint()
	 * @generated
	 */
	int SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Service Delivery Point To Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Service Delivery Point To Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.PowerSystemResourceToPowerSystemResourceImpl <em>Power System Resource To Power System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.PowerSystemResourceToPowerSystemResourceImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getPowerSystemResourceToPowerSystemResource()
	 * @generated
	 */
	int POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Power System Resource To Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Power System Resource To Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.PhysicalDeviceToPrivateMeterVoltageImpl <em>Physical Device To Private Meter Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.PhysicalDeviceToPrivateMeterVoltageImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getPhysicalDeviceToPrivateMeterVoltage()
	 * @generated
	 */
	int PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Device To Private Meter Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Physical Device To Private Meter Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.LocationToLocationImpl <em>Location To Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.LocationToLocationImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getLocationToLocation()
	 * @generated
	 */
	int LOCATION_TO_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TO_LOCATION__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TO_LOCATION__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TO_LOCATION_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Location To Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TO_LOCATION_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.EnergyConsumerToEnergyConsumerImpl <em>Energy Consumer To Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.EnergyConsumerToEnergyConsumerImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getEnergyConsumerToEnergyConsumer()
	 * @generated
	 */
	int ENERGY_CONSUMER_TO_ENERGY_CONSUMER = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_TO_ENERGY_CONSUMER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_TO_ENERGY_CONSUMER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Energy Consumer To Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_TO_ENERGY_CONSUMER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Energy Consumer To Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_TO_ENERGY_CONSUMER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToPrivateMeterVoltageImpl <em>Meter Asset To Private Meter Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToPrivateMeterVoltageImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getMeterAssetToPrivateMeterVoltage()
	 * @generated
	 */
	int METER_ASSET_TO_PRIVATE_METER_VOLTAGE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_PRIVATE_METER_VOLTAGE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_PRIVATE_METER_VOLTAGE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter Asset To Private Meter Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_PRIVATE_METER_VOLTAGE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meter Asset To Private Meter Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_PRIVATE_METER_VOLTAGE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToMMXUToVoltageMeterImpl <em>Meter Asset To MMXU To Voltage Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToMMXUToVoltageMeterImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getMeterAssetToMMXUToVoltageMeter()
	 * @generated
	 */
	int METER_ASSET_TO_MMXU_TO_VOLTAGE_METER = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter Asset To MMXU To Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_MMXU_TO_VOLTAGE_METER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meter Asset To MMXU To Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_MMXU_TO_VOLTAGE_METER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.MMXUToPMUVoltageMeterImpl <em>MMXU To PMU Voltage Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.MMXUToPMUVoltageMeterImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getMMXUToPMUVoltageMeter()
	 * @generated
	 */
	int MMXU_TO_PMU_VOLTAGE_METER = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU_TO_PMU_VOLTAGE_METER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU_TO_PMU_VOLTAGE_METER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMXU To PMU Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU_TO_PMU_VOLTAGE_METER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MMXU To PMU Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU_TO_PMU_VOLTAGE_METER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.ConformLoadGroupToConformLoadGroupImpl <em>Conform Load Group To Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.ConformLoadGroupToConformLoadGroupImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getConformLoadGroupToConformLoadGroup()
	 * @generated
	 */
	int CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conform Load Group To Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Conform Load Group To Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.SubLoadAreaToSubLoadAreaImpl <em>Sub Load Area To Sub Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.SubLoadAreaToSubLoadAreaImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getSubLoadAreaToSubLoadArea()
	 * @generated
	 */
	int SUB_LOAD_AREA_TO_SUB_LOAD_AREA = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_TO_SUB_LOAD_AREA__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_TO_SUB_LOAD_AREA__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Load Area To Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_TO_SUB_LOAD_AREA_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Load Area To Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_TO_SUB_LOAD_AREA_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.LoadAreaToLoadAreaImpl <em>Load Area To Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.LoadAreaToLoadAreaImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getLoadAreaToLoadArea()
	 * @generated
	 */
	int LOAD_AREA_TO_LOAD_AREA = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_TO_LOAD_AREA__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_TO_LOAD_AREA__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Area To Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_TO_LOAD_AREA_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Load Area To Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_TO_LOAD_AREA_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToPMUVoltageMeterImpl <em>Meter Asset To PMU Voltage Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToPMUVoltageMeterImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getMeterAssetToPMUVoltageMeter()
	 * @generated
	 */
	int METER_ASSET_TO_PMU_VOLTAGE_METER = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_PMU_VOLTAGE_METER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_PMU_VOLTAGE_METER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter Asset To PMU Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_PMU_VOLTAGE_METER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meter Asset To PMU Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_ASSET_TO_PMU_VOLTAGE_METER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.PositionPointToPositionPointImpl <em>Position Point To Position Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.PositionPointToPositionPointImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getPositionPointToPositionPoint()
	 * @generated
	 */
	int POSITION_POINT_TO_POSITION_POINT = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_TO_POSITION_POINT__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_TO_POSITION_POINT__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position Point To Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_TO_POSITION_POINT_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position Point To Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_TO_POSITION_POINT_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.NonConformLoadGroupNonToConformLoadGroupImpl <em>Non Conform Load Group Non To Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.NonConformLoadGroupNonToConformLoadGroupImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getNonConformLoadGroupNonToConformLoadGroup()
	 * @generated
	 */
	int NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Non Conform Load Group Non To Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Non Conform Load Group Non To Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.TerminalToTerminalImpl <em>Terminal To Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.TerminalToTerminalImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getTerminalToTerminal()
	 * @generated
	 */
	int TERMINAL_TO_TERMINAL = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_TO_TERMINAL__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_TO_TERMINAL__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminal To Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_TO_TERMINAL_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Terminal To Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_TO_TERMINAL_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.TieFlowToTieFlowImpl <em>Tie Flow To Tie Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.TieFlowToTieFlowImpl
	 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getTieFlowToTieFlow()
	 * @generated
	 */
	int TIE_FLOW_TO_TIE_FLOW = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_TO_TIE_FLOW__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_TO_TIE_FLOW__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tie Flow To Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_TO_TIE_FLOW_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tie Flow To Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_TO_TIE_FLOW_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea <em>Control Area To Control Srea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area To Control Srea</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea
	 * @generated
	 */
	EClass getControlAreaToControlSrea();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea#getSource()
	 * @see #getControlAreaToControlSrea()
	 * @generated
	 */
	EReference getControlAreaToControlSrea_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ControlAreaToControlSrea#getTarget()
	 * @see #getControlAreaToControlSrea()
	 * @generated
	 */
	EReference getControlAreaToControlSrea_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint <em>Service Delivery Point To Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Delivery Point To Service Delivery Point</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint
	 * @generated
	 */
	EClass getServiceDeliveryPointToServiceDeliveryPoint();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint#getSource()
	 * @see #getServiceDeliveryPointToServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPointToServiceDeliveryPoint_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint#getTarget()
	 * @see #getServiceDeliveryPointToServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPointToServiceDeliveryPoint_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource <em>Power System Resource To Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power System Resource To Power System Resource</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource
	 * @generated
	 */
	EClass getPowerSystemResourceToPowerSystemResource();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource#getSource()
	 * @see #getPowerSystemResourceToPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResourceToPowerSystemResource_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource#getTarget()
	 * @see #getPowerSystemResourceToPowerSystemResource()
	 * @generated
	 */
	EReference getPowerSystemResourceToPowerSystemResource_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage <em>Physical Device To Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Device To Private Meter Voltage</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage
	 * @generated
	 */
	EClass getPhysicalDeviceToPrivateMeterVoltage();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage#getSource()
	 * @see #getPhysicalDeviceToPrivateMeterVoltage()
	 * @generated
	 */
	EReference getPhysicalDeviceToPrivateMeterVoltage_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PhysicalDeviceToPrivateMeterVoltage#getTarget()
	 * @see #getPhysicalDeviceToPrivateMeterVoltage()
	 * @generated
	 */
	EReference getPhysicalDeviceToPrivateMeterVoltage_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.LocationToLocation <em>Location To Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location To Location</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.LocationToLocation
	 * @generated
	 */
	EClass getLocationToLocation();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.LocationToLocation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.LocationToLocation#getSource()
	 * @see #getLocationToLocation()
	 * @generated
	 */
	EReference getLocationToLocation_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.LocationToLocation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.LocationToLocation#getTarget()
	 * @see #getLocationToLocation()
	 * @generated
	 */
	EReference getLocationToLocation_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer <em>Energy Consumer To Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer To Energy Consumer</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer
	 * @generated
	 */
	EClass getEnergyConsumerToEnergyConsumer();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer#getSource()
	 * @see #getEnergyConsumerToEnergyConsumer()
	 * @generated
	 */
	EReference getEnergyConsumerToEnergyConsumer_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.EnergyConsumerToEnergyConsumer#getTarget()
	 * @see #getEnergyConsumerToEnergyConsumer()
	 * @generated
	 */
	EReference getEnergyConsumerToEnergyConsumer_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage <em>Meter Asset To Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Asset To Private Meter Voltage</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage
	 * @generated
	 */
	EClass getMeterAssetToPrivateMeterVoltage();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage#getSource()
	 * @see #getMeterAssetToPrivateMeterVoltage()
	 * @generated
	 */
	EReference getMeterAssetToPrivateMeterVoltage_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToPrivateMeterVoltage#getTarget()
	 * @see #getMeterAssetToPrivateMeterVoltage()
	 * @generated
	 */
	EReference getMeterAssetToPrivateMeterVoltage_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter <em>Meter Asset To MMXU To Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Asset To MMXU To Voltage Meter</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter
	 * @generated
	 */
	EClass getMeterAssetToMMXUToVoltageMeter();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter#getSource()
	 * @see #getMeterAssetToMMXUToVoltageMeter()
	 * @generated
	 */
	EReference getMeterAssetToMMXUToVoltageMeter_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter#getTarget()
	 * @see #getMeterAssetToMMXUToVoltageMeter()
	 * @generated
	 */
	EReference getMeterAssetToMMXUToVoltageMeter_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter <em>MMXU To PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMXU To PMU Voltage Meter</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter
	 * @generated
	 */
	EClass getMMXUToPMUVoltageMeter();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter#getSource()
	 * @see #getMMXUToPMUVoltageMeter()
	 * @generated
	 */
	EReference getMMXUToPMUVoltageMeter_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MMXUToPMUVoltageMeter#getTarget()
	 * @see #getMMXUToPMUVoltageMeter()
	 * @generated
	 */
	EReference getMMXUToPMUVoltageMeter_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup <em>Conform Load Group To Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Group To Conform Load Group</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup
	 * @generated
	 */
	EClass getConformLoadGroupToConformLoadGroup();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup#getSource()
	 * @see #getConformLoadGroupToConformLoadGroup()
	 * @generated
	 */
	EReference getConformLoadGroupToConformLoadGroup_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.ConformLoadGroupToConformLoadGroup#getTarget()
	 * @see #getConformLoadGroupToConformLoadGroup()
	 * @generated
	 */
	EReference getConformLoadGroupToConformLoadGroup_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea <em>Sub Load Area To Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Load Area To Sub Load Area</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea
	 * @generated
	 */
	EClass getSubLoadAreaToSubLoadArea();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea#getSource()
	 * @see #getSubLoadAreaToSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadAreaToSubLoadArea_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.SubLoadAreaToSubLoadArea#getTarget()
	 * @see #getSubLoadAreaToSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadAreaToSubLoadArea_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea <em>Load Area To Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Area To Load Area</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea
	 * @generated
	 */
	EClass getLoadAreaToLoadArea();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea#getSource()
	 * @see #getLoadAreaToLoadArea()
	 * @generated
	 */
	EReference getLoadAreaToLoadArea_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.LoadAreaToLoadArea#getTarget()
	 * @see #getLoadAreaToLoadArea()
	 * @generated
	 */
	EReference getLoadAreaToLoadArea_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter <em>Meter Asset To PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Asset To PMU Voltage Meter</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter
	 * @generated
	 */
	EClass getMeterAssetToPMUVoltageMeter();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter#getSource()
	 * @see #getMeterAssetToPMUVoltageMeter()
	 * @generated
	 */
	EReference getMeterAssetToPMUVoltageMeter_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.MeterAssetToPMUVoltageMeter#getTarget()
	 * @see #getMeterAssetToPMUVoltageMeter()
	 * @generated
	 */
	EReference getMeterAssetToPMUVoltageMeter_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint <em>Position Point To Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point To Position Point</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint
	 * @generated
	 */
	EClass getPositionPointToPositionPoint();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint#getSource()
	 * @see #getPositionPointToPositionPoint()
	 * @generated
	 */
	EReference getPositionPointToPositionPoint_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.PositionPointToPositionPoint#getTarget()
	 * @see #getPositionPointToPositionPoint()
	 * @generated
	 */
	EReference getPositionPointToPositionPoint_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup <em>Non Conform Load Group Non To Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Group Non To Conform Load Group</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup
	 * @generated
	 */
	EClass getNonConformLoadGroupNonToConformLoadGroup();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup#getSource()
	 * @see #getNonConformLoadGroupNonToConformLoadGroup()
	 * @generated
	 */
	EReference getNonConformLoadGroupNonToConformLoadGroup_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup#getTarget()
	 * @see #getNonConformLoadGroupNonToConformLoadGroup()
	 * @generated
	 */
	EReference getNonConformLoadGroupNonToConformLoadGroup_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal <em>Terminal To Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal To Terminal</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal
	 * @generated
	 */
	EClass getTerminalToTerminal();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal#getSource()
	 * @see #getTerminalToTerminal()
	 * @generated
	 */
	EReference getTerminalToTerminal_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.TerminalToTerminal#getTarget()
	 * @see #getTerminalToTerminal()
	 * @generated
	 */
	EReference getTerminalToTerminal_Target();

	/**
	 * Returns the meta object for class '{@link rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow <em>Tie Flow To Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Flow To Tie Flow</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow
	 * @generated
	 */
	EClass getTieFlowToTieFlow();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow#getSource()
	 * @see #getTieFlowToTieFlow()
	 * @generated
	 */
	EReference getTieFlowToTieFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rgse.ttc17.emoflon.tgg.task2.TieFlowToTieFlow#getTarget()
	 * @see #getTieFlowToTieFlow()
	 * @generated
	 */
	EReference getTieFlowToTieFlow_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Task2Factory getTask2Factory();

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
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.ControlAreaToControlSreaImpl <em>Control Area To Control Srea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.ControlAreaToControlSreaImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getControlAreaToControlSrea()
		 * @generated
		 */
		EClass CONTROL_AREA_TO_CONTROL_SREA = eINSTANCE.getControlAreaToControlSrea();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_TO_CONTROL_SREA__SOURCE = eINSTANCE.getControlAreaToControlSrea_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_AREA_TO_CONTROL_SREA__TARGET = eINSTANCE.getControlAreaToControlSrea_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.ServiceDeliveryPointToServiceDeliveryPointImpl <em>Service Delivery Point To Service Delivery Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.ServiceDeliveryPointToServiceDeliveryPointImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getServiceDeliveryPointToServiceDeliveryPoint()
		 * @generated
		 */
		EClass SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT = eINSTANCE
				.getServiceDeliveryPointToServiceDeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__SOURCE = eINSTANCE
				.getServiceDeliveryPointToServiceDeliveryPoint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__TARGET = eINSTANCE
				.getServiceDeliveryPointToServiceDeliveryPoint_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.PowerSystemResourceToPowerSystemResourceImpl <em>Power System Resource To Power System Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.PowerSystemResourceToPowerSystemResourceImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getPowerSystemResourceToPowerSystemResource()
		 * @generated
		 */
		EClass POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE = eINSTANCE.getPowerSystemResourceToPowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__SOURCE = eINSTANCE
				.getPowerSystemResourceToPowerSystemResource_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__TARGET = eINSTANCE
				.getPowerSystemResourceToPowerSystemResource_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.PhysicalDeviceToPrivateMeterVoltageImpl <em>Physical Device To Private Meter Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.PhysicalDeviceToPrivateMeterVoltageImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getPhysicalDeviceToPrivateMeterVoltage()
		 * @generated
		 */
		EClass PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE = eINSTANCE.getPhysicalDeviceToPrivateMeterVoltage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE__SOURCE = eINSTANCE
				.getPhysicalDeviceToPrivateMeterVoltage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE__TARGET = eINSTANCE
				.getPhysicalDeviceToPrivateMeterVoltage_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.LocationToLocationImpl <em>Location To Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.LocationToLocationImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getLocationToLocation()
		 * @generated
		 */
		EClass LOCATION_TO_LOCATION = eINSTANCE.getLocationToLocation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TO_LOCATION__SOURCE = eINSTANCE.getLocationToLocation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TO_LOCATION__TARGET = eINSTANCE.getLocationToLocation_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.EnergyConsumerToEnergyConsumerImpl <em>Energy Consumer To Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.EnergyConsumerToEnergyConsumerImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getEnergyConsumerToEnergyConsumer()
		 * @generated
		 */
		EClass ENERGY_CONSUMER_TO_ENERGY_CONSUMER = eINSTANCE.getEnergyConsumerToEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CONSUMER_TO_ENERGY_CONSUMER__SOURCE = eINSTANCE.getEnergyConsumerToEnergyConsumer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CONSUMER_TO_ENERGY_CONSUMER__TARGET = eINSTANCE.getEnergyConsumerToEnergyConsumer_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToPrivateMeterVoltageImpl <em>Meter Asset To Private Meter Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToPrivateMeterVoltageImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getMeterAssetToPrivateMeterVoltage()
		 * @generated
		 */
		EClass METER_ASSET_TO_PRIVATE_METER_VOLTAGE = eINSTANCE.getMeterAssetToPrivateMeterVoltage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_TO_PRIVATE_METER_VOLTAGE__SOURCE = eINSTANCE.getMeterAssetToPrivateMeterVoltage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_TO_PRIVATE_METER_VOLTAGE__TARGET = eINSTANCE.getMeterAssetToPrivateMeterVoltage_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToMMXUToVoltageMeterImpl <em>Meter Asset To MMXU To Voltage Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToMMXUToVoltageMeterImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getMeterAssetToMMXUToVoltageMeter()
		 * @generated
		 */
		EClass METER_ASSET_TO_MMXU_TO_VOLTAGE_METER = eINSTANCE.getMeterAssetToMMXUToVoltageMeter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__SOURCE = eINSTANCE.getMeterAssetToMMXUToVoltageMeter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__TARGET = eINSTANCE.getMeterAssetToMMXUToVoltageMeter_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.MMXUToPMUVoltageMeterImpl <em>MMXU To PMU Voltage Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.MMXUToPMUVoltageMeterImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getMMXUToPMUVoltageMeter()
		 * @generated
		 */
		EClass MMXU_TO_PMU_VOLTAGE_METER = eINSTANCE.getMMXUToPMUVoltageMeter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU_TO_PMU_VOLTAGE_METER__SOURCE = eINSTANCE.getMMXUToPMUVoltageMeter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU_TO_PMU_VOLTAGE_METER__TARGET = eINSTANCE.getMMXUToPMUVoltageMeter_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.ConformLoadGroupToConformLoadGroupImpl <em>Conform Load Group To Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.ConformLoadGroupToConformLoadGroupImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getConformLoadGroupToConformLoadGroup()
		 * @generated
		 */
		EClass CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP = eINSTANCE.getConformLoadGroupToConformLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP__SOURCE = eINSTANCE
				.getConformLoadGroupToConformLoadGroup_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP__TARGET = eINSTANCE
				.getConformLoadGroupToConformLoadGroup_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.SubLoadAreaToSubLoadAreaImpl <em>Sub Load Area To Sub Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.SubLoadAreaToSubLoadAreaImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getSubLoadAreaToSubLoadArea()
		 * @generated
		 */
		EClass SUB_LOAD_AREA_TO_SUB_LOAD_AREA = eINSTANCE.getSubLoadAreaToSubLoadArea();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LOAD_AREA_TO_SUB_LOAD_AREA__SOURCE = eINSTANCE.getSubLoadAreaToSubLoadArea_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LOAD_AREA_TO_SUB_LOAD_AREA__TARGET = eINSTANCE.getSubLoadAreaToSubLoadArea_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.LoadAreaToLoadAreaImpl <em>Load Area To Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.LoadAreaToLoadAreaImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getLoadAreaToLoadArea()
		 * @generated
		 */
		EClass LOAD_AREA_TO_LOAD_AREA = eINSTANCE.getLoadAreaToLoadArea();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_AREA_TO_LOAD_AREA__SOURCE = eINSTANCE.getLoadAreaToLoadArea_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_AREA_TO_LOAD_AREA__TARGET = eINSTANCE.getLoadAreaToLoadArea_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToPMUVoltageMeterImpl <em>Meter Asset To PMU Voltage Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToPMUVoltageMeterImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getMeterAssetToPMUVoltageMeter()
		 * @generated
		 */
		EClass METER_ASSET_TO_PMU_VOLTAGE_METER = eINSTANCE.getMeterAssetToPMUVoltageMeter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_TO_PMU_VOLTAGE_METER__SOURCE = eINSTANCE.getMeterAssetToPMUVoltageMeter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER_ASSET_TO_PMU_VOLTAGE_METER__TARGET = eINSTANCE.getMeterAssetToPMUVoltageMeter_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.PositionPointToPositionPointImpl <em>Position Point To Position Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.PositionPointToPositionPointImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getPositionPointToPositionPoint()
		 * @generated
		 */
		EClass POSITION_POINT_TO_POSITION_POINT = eINSTANCE.getPositionPointToPositionPoint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_POINT_TO_POSITION_POINT__SOURCE = eINSTANCE.getPositionPointToPositionPoint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_POINT_TO_POSITION_POINT__TARGET = eINSTANCE.getPositionPointToPositionPoint_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.NonConformLoadGroupNonToConformLoadGroupImpl <em>Non Conform Load Group Non To Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.NonConformLoadGroupNonToConformLoadGroupImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getNonConformLoadGroupNonToConformLoadGroup()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP = eINSTANCE
				.getNonConformLoadGroupNonToConformLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__SOURCE = eINSTANCE
				.getNonConformLoadGroupNonToConformLoadGroup_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__TARGET = eINSTANCE
				.getNonConformLoadGroupNonToConformLoadGroup_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.TerminalToTerminalImpl <em>Terminal To Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.TerminalToTerminalImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getTerminalToTerminal()
		 * @generated
		 */
		EClass TERMINAL_TO_TERMINAL = eINSTANCE.getTerminalToTerminal();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_TO_TERMINAL__SOURCE = eINSTANCE.getTerminalToTerminal_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_TO_TERMINAL__TARGET = eINSTANCE.getTerminalToTerminal_Target();

		/**
		 * The meta object literal for the '{@link rgse.ttc17.emoflon.tgg.task2.impl.TieFlowToTieFlowImpl <em>Tie Flow To Tie Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.TieFlowToTieFlowImpl
		 * @see rgse.ttc17.emoflon.tgg.task2.impl.Task2PackageImpl#getTieFlowToTieFlow()
		 * @generated
		 */
		EClass TIE_FLOW_TO_TIE_FLOW = eINSTANCE.getTieFlowToTieFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_FLOW_TO_TIE_FLOW__SOURCE = eINSTANCE.getTieFlowToTieFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_FLOW_TO_TIE_FLOW__TARGET = eINSTANCE.getTieFlowToTieFlow_Target();

	}

} //Task2Package
