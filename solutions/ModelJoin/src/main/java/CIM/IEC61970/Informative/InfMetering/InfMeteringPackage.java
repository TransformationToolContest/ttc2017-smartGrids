/**
 */
package CIM.IEC61970.Informative.InfMetering;

import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61970.Core.CorePackage;

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
 * @see CIM.IEC61970.Informative.InfMetering.InfMeteringFactory
 * @model kind="package"
 * @generated
 */
public interface InfMeteringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InfMetering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#InfMetering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimInfMetering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfMeteringPackage eINSTANCE = CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfMetering.impl.WaterMeteringFunctionImpl <em>Water Metering Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfMetering.impl.WaterMeteringFunctionImpl
	 * @see CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl#getWaterMeteringFunction()
	 * @generated
	 */
	int WATER_METERING_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__UUID = MeteringPackage.DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__MRID = MeteringPackage.DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__NAME = MeteringPackage.DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__DESCRIPTION = MeteringPackage.DEVICE_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__PATH_NAME = MeteringPackage.DEVICE_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__MODELING_AUTHORITY_SET = MeteringPackage.DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__LOCAL_NAME = MeteringPackage.DEVICE_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__ALIAS_NAME = MeteringPackage.DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__HARDWARE_ID = MeteringPackage.DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__PROGRAM_ID = MeteringPackage.DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__FIRMWARE_ID = MeteringPackage.DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__ASSET = MeteringPackage.DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__PASSWORD = MeteringPackage.DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__CONFIG_ID = MeteringPackage.DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__COM_EQUIPMENT_ASSET = MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__DISABLED = MeteringPackage.DEVICE_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__END_DEVICE_ASSET = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__END_DEVICE_EVENTS = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION__REGISTERS = MeteringPackage.DEVICE_FUNCTION__REGISTERS;

	/**
	 * The number of structural features of the '<em>Water Metering Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION_FEATURE_COUNT = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Water Metering Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_METERING_FUNCTION_OPERATION_COUNT = MeteringPackage.DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfMetering.impl.GasMeteringFunctionImpl <em>Gas Metering Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfMetering.impl.GasMeteringFunctionImpl
	 * @see CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl#getGasMeteringFunction()
	 * @generated
	 */
	int GAS_METERING_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__UUID = MeteringPackage.DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__MRID = MeteringPackage.DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__NAME = MeteringPackage.DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__DESCRIPTION = MeteringPackage.DEVICE_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__PATH_NAME = MeteringPackage.DEVICE_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__MODELING_AUTHORITY_SET = MeteringPackage.DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__LOCAL_NAME = MeteringPackage.DEVICE_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__ALIAS_NAME = MeteringPackage.DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__HARDWARE_ID = MeteringPackage.DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__PROGRAM_ID = MeteringPackage.DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__FIRMWARE_ID = MeteringPackage.DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__ASSET = MeteringPackage.DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__PASSWORD = MeteringPackage.DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__CONFIG_ID = MeteringPackage.DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__COM_EQUIPMENT_ASSET = MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__DISABLED = MeteringPackage.DEVICE_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__END_DEVICE_ASSET = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__END_DEVICE_EVENTS = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION__REGISTERS = MeteringPackage.DEVICE_FUNCTION__REGISTERS;

	/**
	 * The number of structural features of the '<em>Gas Metering Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION_FEATURE_COUNT = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gas Metering Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAS_METERING_FUNCTION_OPERATION_COUNT = MeteringPackage.DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfMetering.impl.MeteringFunctionConfigurationImpl <em>Metering Function Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfMetering.impl.MeteringFunctionConfigurationImpl
	 * @see CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl#getMeteringFunctionConfiguration()
	 * @generated
	 */
	int METERING_FUNCTION_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Electric Metering Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metering Function Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metering Function Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_FUNCTION_CONFIGURATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM.IEC61970.Informative.InfMetering.impl.ComPortImpl <em>Com Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.IEC61970.Informative.InfMetering.impl.ComPortImpl
	 * @see CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl#getComPort()
	 * @generated
	 */
	int COM_PORT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT__DESCRIPTION = CorePackage.IDENTIFIED_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT__PATH_NAME = CorePackage.IDENTIFIED_OBJECT__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT__LOCAL_NAME = CorePackage.IDENTIFIED_OBJECT__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The number of structural features of the '<em>Com Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_PORT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfMetering.WaterMeteringFunction <em>Water Metering Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Metering Function</em>'.
	 * @see CIM.IEC61970.Informative.InfMetering.WaterMeteringFunction
	 * @generated
	 */
	EClass getWaterMeteringFunction();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfMetering.GasMeteringFunction <em>Gas Metering Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gas Metering Function</em>'.
	 * @see CIM.IEC61970.Informative.InfMetering.GasMeteringFunction
	 * @generated
	 */
	EClass getGasMeteringFunction();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration <em>Metering Function Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metering Function Configuration</em>'.
	 * @see CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration
	 * @generated
	 */
	EClass getMeteringFunctionConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration#getElectricMeteringFunctions <em>Electric Metering Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electric Metering Functions</em>'.
	 * @see CIM.IEC61970.Informative.InfMetering.MeteringFunctionConfiguration#getElectricMeteringFunctions()
	 * @see #getMeteringFunctionConfiguration()
	 * @generated
	 */
	EReference getMeteringFunctionConfiguration_ElectricMeteringFunctions();

	/**
	 * Returns the meta object for class '{@link CIM.IEC61970.Informative.InfMetering.ComPort <em>Com Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Port</em>'.
	 * @see CIM.IEC61970.Informative.InfMetering.ComPort
	 * @generated
	 */
	EClass getComPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfMeteringFactory getInfMeteringFactory();

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
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfMetering.impl.WaterMeteringFunctionImpl <em>Water Metering Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfMetering.impl.WaterMeteringFunctionImpl
		 * @see CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl#getWaterMeteringFunction()
		 * @generated
		 */
		EClass WATER_METERING_FUNCTION = eINSTANCE.getWaterMeteringFunction();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfMetering.impl.GasMeteringFunctionImpl <em>Gas Metering Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfMetering.impl.GasMeteringFunctionImpl
		 * @see CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl#getGasMeteringFunction()
		 * @generated
		 */
		EClass GAS_METERING_FUNCTION = eINSTANCE.getGasMeteringFunction();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfMetering.impl.MeteringFunctionConfigurationImpl <em>Metering Function Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfMetering.impl.MeteringFunctionConfigurationImpl
		 * @see CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl#getMeteringFunctionConfiguration()
		 * @generated
		 */
		EClass METERING_FUNCTION_CONFIGURATION = eINSTANCE.getMeteringFunctionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Electric Metering Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METERING_FUNCTION_CONFIGURATION__ELECTRIC_METERING_FUNCTIONS = eINSTANCE.getMeteringFunctionConfiguration_ElectricMeteringFunctions();

		/**
		 * The meta object literal for the '{@link CIM.IEC61970.Informative.InfMetering.impl.ComPortImpl <em>Com Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.IEC61970.Informative.InfMetering.impl.ComPortImpl
		 * @see CIM.IEC61970.Informative.InfMetering.impl.InfMeteringPackageImpl#getComPort()
		 * @generated
		 */
		EClass COM_PORT = eINSTANCE.getComPort();

	}

} //InfMeteringPackage
