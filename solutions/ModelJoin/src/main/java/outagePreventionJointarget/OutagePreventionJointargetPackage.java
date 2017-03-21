/**
 */
package outagePreventionJointarget;

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
 * @see outagePreventionJointarget.OutagePreventionJointargetFactory
 * @model kind="package"
 * @generated
 */
public interface OutagePreventionJointargetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "outagePreventionJointarget";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/VoltagePhaseMeasurements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "outagePreventionJt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutagePreventionJointargetPackage eINSTANCE = outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl.init();

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.AssetImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl <em>PMU Voltage Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.PMUVoltageMeterImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getPMUVoltageMeter()
	 * @generated
	 */
	int PMU_VOLTAGE_METER = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__LOCATION = ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__SERVICE_DELIVERY_POINT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__MRID = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage AMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_AMAG = ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Voltage AAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_AANG = ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Voltage BMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_BMAG = ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Voltage BAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_BANG = ASSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Voltage CMag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_CMAG = ASSET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Voltage CAng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_CANG = ASSET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Voltage Neut Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_NEUT_MAG = ASSET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Voltage Neut Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_NEUT_ANG = ASSET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Voltage Net Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_NET_MAG = ASSET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Voltage Net Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_NET_ANG = ASSET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Voltage Res Mag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_RES_MAG = ASSET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Voltage Res Ang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER__VOLTAGE_RES_ANG = ASSET_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>PMU Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER_FEATURE_COUNT = ASSET_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>PMU Voltage Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMU_VOLTAGE_METER_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.PrivateMeterVoltageImpl <em>Private Meter Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.PrivateMeterVoltageImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getPrivateMeterVoltage()
	 * @generated
	 */
	int PRIVATE_METER_VOLTAGE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE__LOCATION = ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE__ID = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE__VOLTAGE_A = ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Voltage B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE__VOLTAGE_B = ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Voltage C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE__VOLTAGE_C = ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Private Meter Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Private Meter Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_METER_VOLTAGE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.LocationImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POWER_SYSTEM_RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.PositionPointImpl <em>Position Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.PositionPointImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getPositionPoint()
	 * @generated
	 */
	int POSITION_POINT = 4;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__YPOSITION = 1;

	/**
	 * The feature id for the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT__ZPOSITION = 2;

	/**
	 * The number of structural features of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.PowerSystemResourceImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getPowerSystemResource()
	 * @generated
	 */
	int POWER_SYSTEM_RESOURCE = 5;

	/**
	 * The number of structural features of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SYSTEM_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.ConductingEquipmentImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getConductingEquipment()
	 * @generated
	 */
	int CONDUCTING_EQUIPMENT = 6;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT__TERMINALS = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTING_EQUIPMENT_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.TerminalImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 7;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TIE_FLOW = 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.TieFlowImpl <em>Tie Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.TieFlowImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getTieFlow()
	 * @generated
	 */
	int TIE_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW__CONTROL_AREA = 0;

	/**
	 * The number of structural features of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIE_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.ControlAreaImpl <em>Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.ControlAreaImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getControlArea()
	 * @generated
	 */
	int CONTROL_AREA = 9;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA__MRID = 0;

	/**
	 * The number of structural features of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.EndDeviceAssetImpl <em>End Device Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.EndDeviceAssetImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getEndDeviceAsset()
	 * @generated
	 */
	int END_DEVICE_ASSET = 10;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET__SERVICE_DELIVERY_POINT = 0;

	/**
	 * The number of structural features of the '<em>End Device Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>End Device Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DEVICE_ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.ServiceDeliveryPointImpl <em>Service Delivery Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.ServiceDeliveryPointImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getServiceDeliveryPoint()
	 * @generated
	 */
	int SERVICE_DELIVERY_POINT = 11;

	/**
	 * The feature id for the '<em><b>Energy Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT__ENERGY_CONSUMER = 0;

	/**
	 * The number of structural features of the '<em>Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DELIVERY_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.EnergyConsumerImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getEnergyConsumer()
	 * @generated
	 */
	int ENERGY_CONSUMER = 12;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER__MRID = 0;

	/**
	 * The number of structural features of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.ConformLoadImpl <em>Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.ConformLoadImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getConformLoad()
	 * @generated
	 */
	int CONFORM_LOAD = 13;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__MRID = ENERGY_CONSUMER__MRID;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD__LOAD_GROUP = ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_FEATURE_COUNT = ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_OPERATION_COUNT = ENERGY_CONSUMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.LoadGroupImpl <em>Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.LoadGroupImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getLoadGroup()
	 * @generated
	 */
	int LOAD_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP__SUB_LOAD_AREA = 0;

	/**
	 * The number of structural features of the '<em>Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.ConformLoadGroupImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getConformLoadGroup()
	 * @generated
	 */
	int CONFORM_LOAD_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP__SUB_LOAD_AREA = LOAD_GROUP__SUB_LOAD_AREA;

	/**
	 * The number of structural features of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_FEATURE_COUNT = LOAD_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORM_LOAD_GROUP_OPERATION_COUNT = LOAD_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.SubLoadAreaImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getSubLoadArea()
	 * @generated
	 */
	int SUB_LOAD_AREA = 16;

	/**
	 * The feature id for the '<em><b>Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA__LOAD_AREA = 0;

	/**
	 * The number of structural features of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOAD_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.LoadAreaImpl <em>Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.LoadAreaImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getLoadArea()
	 * @generated
	 */
	int LOAD_AREA = 17;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA__CONTROL_AREA = 0;

	/**
	 * The number of structural features of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.NonConformLoadImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getNonConformLoad()
	 * @generated
	 */
	int NON_CONFORM_LOAD = 18;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__MRID = ENERGY_CONSUMER__MRID;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD__LOAD_GROUP = ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_FEATURE_COUNT = ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_OPERATION_COUNT = ENERGY_CONSUMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link outagePreventionJointarget.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see outagePreventionJointarget.impl.NonConformLoadGroupImpl
	 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getNonConformLoadGroup()
	 * @generated
	 */
	int NON_CONFORM_LOAD_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP__SUB_LOAD_AREA = LOAD_GROUP__SUB_LOAD_AREA;

	/**
	 * The number of structural features of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_FEATURE_COUNT = LOAD_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONFORM_LOAD_GROUP_OPERATION_COUNT = LOAD_GROUP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.PMUVoltageMeter <em>PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PMU Voltage Meter</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter
	 * @generated
	 */
	EClass getPMUVoltageMeter();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getMRID <em>MRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MRID</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getMRID()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_MRID();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageAMag <em>Voltage AMag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage AMag</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageAMag()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageAMag();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageAAng <em>Voltage AAng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage AAng</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageAAng()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageAAng();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageBMag <em>Voltage BMag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage BMag</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageBMag()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageBMag();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageBAng <em>Voltage BAng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage BAng</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageBAng()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageBAng();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageCMag <em>Voltage CMag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage CMag</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageCMag()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageCMag();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageCAng <em>Voltage CAng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage CAng</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageCAng()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageCAng();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNeutMag <em>Voltage Neut Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Neut Mag</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageNeutMag()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageNeutMag();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNeutAng <em>Voltage Neut Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Neut Ang</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageNeutAng()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageNeutAng();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNetMag <em>Voltage Net Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Net Mag</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageNetMag()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageNetMag();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageNetAng <em>Voltage Net Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Net Ang</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageNetAng()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageNetAng();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageResMag <em>Voltage Res Mag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Res Mag</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageResMag()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageResMag();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PMUVoltageMeter#getVoltageResAng <em>Voltage Res Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Res Ang</em>'.
	 * @see outagePreventionJointarget.PMUVoltageMeter#getVoltageResAng()
	 * @see #getPMUVoltageMeter()
	 * @generated
	 */
	EAttribute getPMUVoltageMeter_VoltageResAng();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.PrivateMeterVoltage <em>Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Meter Voltage</em>'.
	 * @see outagePreventionJointarget.PrivateMeterVoltage
	 * @generated
	 */
	EClass getPrivateMeterVoltage();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PrivateMeterVoltage#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see outagePreventionJointarget.PrivateMeterVoltage#getID()
	 * @see #getPrivateMeterVoltage()
	 * @generated
	 */
	EAttribute getPrivateMeterVoltage_ID();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageA <em>Voltage A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage A</em>'.
	 * @see outagePreventionJointarget.PrivateMeterVoltage#getVoltageA()
	 * @see #getPrivateMeterVoltage()
	 * @generated
	 */
	EAttribute getPrivateMeterVoltage_VoltageA();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageB <em>Voltage B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage B</em>'.
	 * @see outagePreventionJointarget.PrivateMeterVoltage#getVoltageB()
	 * @see #getPrivateMeterVoltage()
	 * @generated
	 */
	EAttribute getPrivateMeterVoltage_VoltageB();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PrivateMeterVoltage#getVoltageC <em>Voltage C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage C</em>'.
	 * @see outagePreventionJointarget.PrivateMeterVoltage#getVoltageC()
	 * @see #getPrivateMeterVoltage()
	 * @generated
	 */
	EAttribute getPrivateMeterVoltage_VoltageC();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see outagePreventionJointarget.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.Asset#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see outagePreventionJointarget.Asset#getLocation()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Location();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see outagePreventionJointarget.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.Location#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see outagePreventionJointarget.Location#getPosition()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Position();

	/**
	 * Returns the meta object for the reference list '{@link outagePreventionJointarget.Location#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see outagePreventionJointarget.Location#getPowerSystemResources()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_PowerSystemResources();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point</em>'.
	 * @see outagePreventionJointarget.PositionPoint
	 * @generated
	 */
	EClass getPositionPoint();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PositionPoint#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see outagePreventionJointarget.PositionPoint#getXPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PositionPoint#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see outagePreventionJointarget.PositionPoint#getYPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.PositionPoint#getZPosition <em>ZPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZPosition</em>'.
	 * @see outagePreventionJointarget.PositionPoint#getZPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	EAttribute getPositionPoint_ZPosition();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power System Resource</em>'.
	 * @see outagePreventionJointarget.PowerSystemResource
	 * @generated
	 */
	EClass getPowerSystemResource();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conducting Equipment</em>'.
	 * @see outagePreventionJointarget.ConductingEquipment
	 * @generated
	 */
	EClass getConductingEquipment();

	/**
	 * Returns the meta object for the reference list '{@link outagePreventionJointarget.ConductingEquipment#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see outagePreventionJointarget.ConductingEquipment#getTerminals()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	EReference getConductingEquipment_Terminals();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see outagePreventionJointarget.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the reference list '{@link outagePreventionJointarget.Terminal#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Flow</em>'.
	 * @see outagePreventionJointarget.Terminal#getTieFlow()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_TieFlow();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Flow</em>'.
	 * @see outagePreventionJointarget.TieFlow
	 * @generated
	 */
	EClass getTieFlow();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.TieFlow#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see outagePreventionJointarget.TieFlow#getControlArea()
	 * @see #getTieFlow()
	 * @generated
	 */
	EReference getTieFlow_ControlArea();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area</em>'.
	 * @see outagePreventionJointarget.ControlArea
	 * @generated
	 */
	EClass getControlArea();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.ControlArea#getMRID <em>MRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MRID</em>'.
	 * @see outagePreventionJointarget.ControlArea#getMRID()
	 * @see #getControlArea()
	 * @generated
	 */
	EAttribute getControlArea_MRID();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.EndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Asset</em>'.
	 * @see outagePreventionJointarget.EndDeviceAsset
	 * @generated
	 */
	EClass getEndDeviceAsset();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.EndDeviceAsset#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Delivery Point</em>'.
	 * @see outagePreventionJointarget.EndDeviceAsset#getServiceDeliveryPoint()
	 * @see #getEndDeviceAsset()
	 * @generated
	 */
	EReference getEndDeviceAsset_ServiceDeliveryPoint();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.ServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Delivery Point</em>'.
	 * @see outagePreventionJointarget.ServiceDeliveryPoint
	 * @generated
	 */
	EClass getServiceDeliveryPoint();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Consumer</em>'.
	 * @see outagePreventionJointarget.ServiceDeliveryPoint#getEnergyConsumer()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	EReference getServiceDeliveryPoint_EnergyConsumer();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer</em>'.
	 * @see outagePreventionJointarget.EnergyConsumer
	 * @generated
	 */
	EClass getEnergyConsumer();

	/**
	 * Returns the meta object for the attribute '{@link outagePreventionJointarget.EnergyConsumer#getMRID <em>MRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MRID</em>'.
	 * @see outagePreventionJointarget.EnergyConsumer#getMRID()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	EAttribute getEnergyConsumer_MRID();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load</em>'.
	 * @see outagePreventionJointarget.ConformLoad
	 * @generated
	 */
	EClass getConformLoad();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.ConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see outagePreventionJointarget.ConformLoad#getLoadGroup()
	 * @see #getConformLoad()
	 * @generated
	 */
	EReference getConformLoad_LoadGroup();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Group</em>'.
	 * @see outagePreventionJointarget.ConformLoadGroup
	 * @generated
	 */
	EClass getConformLoadGroup();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.LoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Group</em>'.
	 * @see outagePreventionJointarget.LoadGroup
	 * @generated
	 */
	EClass getLoadGroup();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Load Area</em>'.
	 * @see outagePreventionJointarget.LoadGroup#getSubLoadArea()
	 * @see #getLoadGroup()
	 * @generated
	 */
	EReference getLoadGroup_SubLoadArea();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Load Area</em>'.
	 * @see outagePreventionJointarget.SubLoadArea
	 * @generated
	 */
	EClass getSubLoadArea();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.SubLoadArea#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Area</em>'.
	 * @see outagePreventionJointarget.SubLoadArea#getLoadArea()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	EReference getSubLoadArea_LoadArea();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Area</em>'.
	 * @see outagePreventionJointarget.LoadArea
	 * @generated
	 */
	EClass getLoadArea();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.LoadArea#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see outagePreventionJointarget.LoadArea#getControlArea()
	 * @see #getLoadArea()
	 * @generated
	 */
	EReference getLoadArea_ControlArea();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load</em>'.
	 * @see outagePreventionJointarget.NonConformLoad
	 * @generated
	 */
	EClass getNonConformLoad();

	/**
	 * Returns the meta object for the reference '{@link outagePreventionJointarget.NonConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see outagePreventionJointarget.NonConformLoad#getLoadGroup()
	 * @see #getNonConformLoad()
	 * @generated
	 */
	EReference getNonConformLoad_LoadGroup();

	/**
	 * Returns the meta object for class '{@link outagePreventionJointarget.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Group</em>'.
	 * @see outagePreventionJointarget.NonConformLoadGroup
	 * @generated
	 */
	EClass getNonConformLoadGroup();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OutagePreventionJointargetFactory getOutagePreventionJointargetFactory();

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
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.PMUVoltageMeterImpl <em>PMU Voltage Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.PMUVoltageMeterImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getPMUVoltageMeter()
		 * @generated
		 */
		EClass PMU_VOLTAGE_METER = eINSTANCE.getPMUVoltageMeter();

		/**
		 * The meta object literal for the '<em><b>MRID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__MRID = eINSTANCE.getPMUVoltageMeter_MRID();

		/**
		 * The meta object literal for the '<em><b>Voltage AMag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_AMAG = eINSTANCE.getPMUVoltageMeter_VoltageAMag();

		/**
		 * The meta object literal for the '<em><b>Voltage AAng</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_AANG = eINSTANCE.getPMUVoltageMeter_VoltageAAng();

		/**
		 * The meta object literal for the '<em><b>Voltage BMag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_BMAG = eINSTANCE.getPMUVoltageMeter_VoltageBMag();

		/**
		 * The meta object literal for the '<em><b>Voltage BAng</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_BANG = eINSTANCE.getPMUVoltageMeter_VoltageBAng();

		/**
		 * The meta object literal for the '<em><b>Voltage CMag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_CMAG = eINSTANCE.getPMUVoltageMeter_VoltageCMag();

		/**
		 * The meta object literal for the '<em><b>Voltage CAng</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_CANG = eINSTANCE.getPMUVoltageMeter_VoltageCAng();

		/**
		 * The meta object literal for the '<em><b>Voltage Neut Mag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_NEUT_MAG = eINSTANCE.getPMUVoltageMeter_VoltageNeutMag();

		/**
		 * The meta object literal for the '<em><b>Voltage Neut Ang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_NEUT_ANG = eINSTANCE.getPMUVoltageMeter_VoltageNeutAng();

		/**
		 * The meta object literal for the '<em><b>Voltage Net Mag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_NET_MAG = eINSTANCE.getPMUVoltageMeter_VoltageNetMag();

		/**
		 * The meta object literal for the '<em><b>Voltage Net Ang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_NET_ANG = eINSTANCE.getPMUVoltageMeter_VoltageNetAng();

		/**
		 * The meta object literal for the '<em><b>Voltage Res Mag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_RES_MAG = eINSTANCE.getPMUVoltageMeter_VoltageResMag();

		/**
		 * The meta object literal for the '<em><b>Voltage Res Ang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMU_VOLTAGE_METER__VOLTAGE_RES_ANG = eINSTANCE.getPMUVoltageMeter_VoltageResAng();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.PrivateMeterVoltageImpl <em>Private Meter Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.PrivateMeterVoltageImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getPrivateMeterVoltage()
		 * @generated
		 */
		EClass PRIVATE_METER_VOLTAGE = eINSTANCE.getPrivateMeterVoltage();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_METER_VOLTAGE__ID = eINSTANCE.getPrivateMeterVoltage_ID();

		/**
		 * The meta object literal for the '<em><b>Voltage A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_METER_VOLTAGE__VOLTAGE_A = eINSTANCE.getPrivateMeterVoltage_VoltageA();

		/**
		 * The meta object literal for the '<em><b>Voltage B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_METER_VOLTAGE__VOLTAGE_B = eINSTANCE.getPrivateMeterVoltage_VoltageB();

		/**
		 * The meta object literal for the '<em><b>Voltage C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_METER_VOLTAGE__VOLTAGE_C = eINSTANCE.getPrivateMeterVoltage_VoltageC();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.AssetImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__LOCATION = eINSTANCE.getAsset_Location();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.LocationImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__POSITION = eINSTANCE.getLocation_Position();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__POWER_SYSTEM_RESOURCES = eINSTANCE.getLocation_PowerSystemResources();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.PositionPointImpl <em>Position Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.PositionPointImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getPositionPoint()
		 * @generated
		 */
		EClass POSITION_POINT = eINSTANCE.getPositionPoint();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__XPOSITION = eINSTANCE.getPositionPoint_XPosition();

		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__YPOSITION = eINSTANCE.getPositionPoint_YPosition();

		/**
		 * The meta object literal for the '<em><b>ZPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_POINT__ZPOSITION = eINSTANCE.getPositionPoint_ZPosition();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.PowerSystemResourceImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getPowerSystemResource()
		 * @generated
		 */
		EClass POWER_SYSTEM_RESOURCE = eINSTANCE.getPowerSystemResource();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.ConductingEquipmentImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getConductingEquipment()
		 * @generated
		 */
		EClass CONDUCTING_EQUIPMENT = eINSTANCE.getConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTING_EQUIPMENT__TERMINALS = eINSTANCE.getConductingEquipment_Terminals();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.TerminalImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__TIE_FLOW = eINSTANCE.getTerminal_TieFlow();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.TieFlowImpl <em>Tie Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.TieFlowImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getTieFlow()
		 * @generated
		 */
		EClass TIE_FLOW = eINSTANCE.getTieFlow();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIE_FLOW__CONTROL_AREA = eINSTANCE.getTieFlow_ControlArea();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.ControlAreaImpl <em>Control Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.ControlAreaImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getControlArea()
		 * @generated
		 */
		EClass CONTROL_AREA = eINSTANCE.getControlArea();

		/**
		 * The meta object literal for the '<em><b>MRID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_AREA__MRID = eINSTANCE.getControlArea_MRID();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.EndDeviceAssetImpl <em>End Device Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.EndDeviceAssetImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getEndDeviceAsset()
		 * @generated
		 */
		EClass END_DEVICE_ASSET = eINSTANCE.getEndDeviceAsset();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_DEVICE_ASSET__SERVICE_DELIVERY_POINT = eINSTANCE.getEndDeviceAsset_ServiceDeliveryPoint();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.ServiceDeliveryPointImpl <em>Service Delivery Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.ServiceDeliveryPointImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getServiceDeliveryPoint()
		 * @generated
		 */
		EClass SERVICE_DELIVERY_POINT = eINSTANCE.getServiceDeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>Energy Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DELIVERY_POINT__ENERGY_CONSUMER = eINSTANCE.getServiceDeliveryPoint_EnergyConsumer();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.EnergyConsumerImpl <em>Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.EnergyConsumerImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getEnergyConsumer()
		 * @generated
		 */
		EClass ENERGY_CONSUMER = eINSTANCE.getEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>MRID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CONSUMER__MRID = eINSTANCE.getEnergyConsumer_MRID();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.ConformLoadImpl <em>Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.ConformLoadImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getConformLoad()
		 * @generated
		 */
		EClass CONFORM_LOAD = eINSTANCE.getConformLoad();

		/**
		 * The meta object literal for the '<em><b>Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORM_LOAD__LOAD_GROUP = eINSTANCE.getConformLoad_LoadGroup();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.ConformLoadGroupImpl <em>Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.ConformLoadGroupImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getConformLoadGroup()
		 * @generated
		 */
		EClass CONFORM_LOAD_GROUP = eINSTANCE.getConformLoadGroup();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.LoadGroupImpl <em>Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.LoadGroupImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getLoadGroup()
		 * @generated
		 */
		EClass LOAD_GROUP = eINSTANCE.getLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Sub Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_GROUP__SUB_LOAD_AREA = eINSTANCE.getLoadGroup_SubLoadArea();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.SubLoadAreaImpl <em>Sub Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.SubLoadAreaImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getSubLoadArea()
		 * @generated
		 */
		EClass SUB_LOAD_AREA = eINSTANCE.getSubLoadArea();

		/**
		 * The meta object literal for the '<em><b>Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_LOAD_AREA__LOAD_AREA = eINSTANCE.getSubLoadArea_LoadArea();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.LoadAreaImpl <em>Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.LoadAreaImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getLoadArea()
		 * @generated
		 */
		EClass LOAD_AREA = eINSTANCE.getLoadArea();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_AREA__CONTROL_AREA = eINSTANCE.getLoadArea_ControlArea();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.NonConformLoadImpl <em>Non Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.NonConformLoadImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getNonConformLoad()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD = eINSTANCE.getNonConformLoad();

		/**
		 * The meta object literal for the '<em><b>Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONFORM_LOAD__LOAD_GROUP = eINSTANCE.getNonConformLoad_LoadGroup();

		/**
		 * The meta object literal for the '{@link outagePreventionJointarget.impl.NonConformLoadGroupImpl <em>Non Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see outagePreventionJointarget.impl.NonConformLoadGroupImpl
		 * @see outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl#getNonConformLoadGroup()
		 * @generated
		 */
		EClass NON_CONFORM_LOAD_GROUP = eINSTANCE.getNonConformLoadGroup();

	}

} //OutagePreventionJointargetPackage
