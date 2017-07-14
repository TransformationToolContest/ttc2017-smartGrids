/**
 */
package gluemodel.CIM.IEC61968.LoadControl;

import gluemodel.CIM.CIMPackage;

import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

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
 * @see gluemodel.CIM.IEC61968.LoadControl.LoadControlFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package is an extension of the Metering package and contains the information classes that support specialized applications such as demand-side management using load control equipment. These classes are generally associated with the point where a service is delivered to the customer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package is an extension of the Metering package and contains the information classes that support specialized applications such as demand-side management using load control equipment. These classes are generally associated with the point where a service is delivered to the customer.'"
 * @generated
 */
public interface LoadControlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LoadControl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#LoadControl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimLoadControl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoadControlPackage eINSTANCE = gluemodel.CIM.IEC61968.LoadControl.impl.LoadControlPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl <em>Remote Connect Disconnect Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl
	 * @see gluemodel.CIM.IEC61968.LoadControl.impl.LoadControlPackageImpl#getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Power Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Energy Limiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING = CIMPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Energy Usage Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING = CIMPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Needs Voltage Limit Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK = CIMPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Energy Usage Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME = CIMPackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Use Pushbutton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON = CIMPackage.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Arm Disconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT = CIMPackage.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Arm Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT = CIMPackage.ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Needs Power Limit Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK = CIMPackage.ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Armed Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT = CIMPackage.ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Remote Connect Disconnect Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Remote Connect Disconnect Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CONNECT_DISCONNECT_INFO_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl <em>Connect Disconnect Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl
	 * @see gluemodel.CIM.IEC61968.LoadControl.impl.LoadControlPackageImpl#getConnectDisconnectFunction()
	 * @generated
	 */
	int CONNECT_DISCONNECT_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__UUID = MeteringPackage.DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__MRID = MeteringPackage.DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__NAME = MeteringPackage.DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__DESCRIPTION = MeteringPackage.DEVICE_FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__PATH_NAME = MeteringPackage.DEVICE_FUNCTION__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__MODELING_AUTHORITY_SET = MeteringPackage.DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__LOCAL_NAME = MeteringPackage.DEVICE_FUNCTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__ALIAS_NAME = MeteringPackage.DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__HARDWARE_ID = MeteringPackage.DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__PROGRAM_ID = MeteringPackage.DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__FIRMWARE_ID = MeteringPackage.DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__ASSET = MeteringPackage.DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__PASSWORD = MeteringPackage.DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__CONFIG_ID = MeteringPackage.DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Com Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__COM_EQUIPMENT_ASSET = MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__DISABLED = MeteringPackage.DEVICE_FUNCTION__DISABLED;

	/**
	 * The feature id for the '<em><b>End Device Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__END_DEVICE_ASSET = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__END_DEVICE_EVENTS = MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__REGISTERS = MeteringPackage.DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Is Delayed Discon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Local Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Local Auto Discon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__SWITCHES = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rcd Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__RCD_INFO = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Remote Auto Discon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Event Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Remote Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Connect Disconnect Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION_FEATURE_COUNT = MeteringPackage.DEVICE_FUNCTION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Connect Disconnect Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_DISCONNECT_FUNCTION_OPERATION_COUNT = MeteringPackage.DEVICE_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo <em>Remote Connect Disconnect Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Connect Disconnect Info</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo
	 * @generated
	 */
	EClass getRemoteConnectDisconnectInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Limit</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_PowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Voltage Limit</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_CustomerVoltageLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Limit</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_EnergyLimit();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting <em>Is Energy Limiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Energy Limiting</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_IsEnergyLimiting();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Usage Warning</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_EnergyUsageWarning();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Voltage Limit Check</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_NeedsVoltageLimitCheck();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Usage Start Date Time</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_EnergyUsageStartDateTime();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton <em>Use Pushbutton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Pushbutton</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_UsePushbutton();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect <em>Is Arm Disconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Arm Disconnect</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_IsArmDisconnect();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect <em>Is Arm Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Arm Connect</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_IsArmConnect();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Power Limit Check</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_NeedsPowerLimitCheck();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armed Timeout</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	EAttribute getRemoteConnectDisconnectInfo_ArmedTimeout();

	/**
	 * Returns the meta object for class '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction <em>Connect Disconnect Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Disconnect Function</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction
	 * @generated
	 */
	EClass getConnectDisconnectFunction();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon <em>Is Delayed Discon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Delayed Discon</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EAttribute getConnectDisconnectFunction_IsDelayedDiscon();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local Auto Recon Op</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EAttribute getConnectDisconnectFunction_IsLocalAutoReconOp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local Auto Discon Op</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EAttribute getConnectDisconnectFunction_IsLocalAutoDisconOp();

	/**
	 * Returns the meta object for the reference list '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switches</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EReference getConnectDisconnectFunction_Switches();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected <em>Is Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connected</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EAttribute getConnectDisconnectFunction_IsConnected();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rcd Info</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getRcdInfo()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EReference getConnectDisconnectFunction_RcdInfo();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Remote Auto Discon Op</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EAttribute getConnectDisconnectFunction_IsRemoteAutoDisconOp();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Count</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EAttribute getConnectDisconnectFunction_EventCount();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Remote Auto Recon Op</em>'.
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	EAttribute getConnectDisconnectFunction_IsRemoteAutoReconOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LoadControlFactory getLoadControlFactory();

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
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl <em>Remote Connect Disconnect Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl
		 * @see gluemodel.CIM.IEC61968.LoadControl.impl.LoadControlPackageImpl#getRemoteConnectDisconnectInfo()
		 * @generated
		 */
		EClass REMOTE_CONNECT_DISCONNECT_INFO = eINSTANCE.getRemoteConnectDisconnectInfo();

		/**
		 * The meta object literal for the '<em><b>Power Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT = eINSTANCE.getRemoteConnectDisconnectInfo_PowerLimit();

		/**
		 * The meta object literal for the '<em><b>Customer Voltage Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT = eINSTANCE.getRemoteConnectDisconnectInfo_CustomerVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Energy Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT = eINSTANCE.getRemoteConnectDisconnectInfo_EnergyLimit();

		/**
		 * The meta object literal for the '<em><b>Is Energy Limiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING = eINSTANCE.getRemoteConnectDisconnectInfo_IsEnergyLimiting();

		/**
		 * The meta object literal for the '<em><b>Energy Usage Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING = eINSTANCE.getRemoteConnectDisconnectInfo_EnergyUsageWarning();

		/**
		 * The meta object literal for the '<em><b>Needs Voltage Limit Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK = eINSTANCE.getRemoteConnectDisconnectInfo_NeedsVoltageLimitCheck();

		/**
		 * The meta object literal for the '<em><b>Energy Usage Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME = eINSTANCE.getRemoteConnectDisconnectInfo_EnergyUsageStartDateTime();

		/**
		 * The meta object literal for the '<em><b>Use Pushbutton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON = eINSTANCE.getRemoteConnectDisconnectInfo_UsePushbutton();

		/**
		 * The meta object literal for the '<em><b>Is Arm Disconnect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT = eINSTANCE.getRemoteConnectDisconnectInfo_IsArmDisconnect();

		/**
		 * The meta object literal for the '<em><b>Is Arm Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT = eINSTANCE.getRemoteConnectDisconnectInfo_IsArmConnect();

		/**
		 * The meta object literal for the '<em><b>Needs Power Limit Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK = eINSTANCE.getRemoteConnectDisconnectInfo_NeedsPowerLimitCheck();

		/**
		 * The meta object literal for the '<em><b>Armed Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT = eINSTANCE.getRemoteConnectDisconnectInfo_ArmedTimeout();

		/**
		 * The meta object literal for the '{@link gluemodel.CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl <em>Connect Disconnect Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl
		 * @see gluemodel.CIM.IEC61968.LoadControl.impl.LoadControlPackageImpl#getConnectDisconnectFunction()
		 * @generated
		 */
		EClass CONNECT_DISCONNECT_FUNCTION = eINSTANCE.getConnectDisconnectFunction();

		/**
		 * The meta object literal for the '<em><b>Is Delayed Discon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON = eINSTANCE.getConnectDisconnectFunction_IsDelayedDiscon();

		/**
		 * The meta object literal for the '<em><b>Is Local Auto Recon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP = eINSTANCE.getConnectDisconnectFunction_IsLocalAutoReconOp();

		/**
		 * The meta object literal for the '<em><b>Is Local Auto Discon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP = eINSTANCE.getConnectDisconnectFunction_IsLocalAutoDisconOp();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_DISCONNECT_FUNCTION__SWITCHES = eINSTANCE.getConnectDisconnectFunction_Switches();

		/**
		 * The meta object literal for the '<em><b>Is Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED = eINSTANCE.getConnectDisconnectFunction_IsConnected();

		/**
		 * The meta object literal for the '<em><b>Rcd Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT_DISCONNECT_FUNCTION__RCD_INFO = eINSTANCE.getConnectDisconnectFunction_RcdInfo();

		/**
		 * The meta object literal for the '<em><b>Is Remote Auto Discon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP = eINSTANCE.getConnectDisconnectFunction_IsRemoteAutoDisconOp();

		/**
		 * The meta object literal for the '<em><b>Event Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT = eINSTANCE.getConnectDisconnectFunction_EventCount();

		/**
		 * The meta object literal for the '<em><b>Is Remote Auto Recon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP = eINSTANCE.getConnectDisconnectFunction_IsRemoteAutoReconOp();

	}

} //LoadControlPackage
