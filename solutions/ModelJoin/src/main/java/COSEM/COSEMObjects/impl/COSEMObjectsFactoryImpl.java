/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class COSEMObjectsFactoryImpl extends EFactoryImpl implements COSEMObjectsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COSEMObjectsFactory init() {
		try {
			COSEMObjectsFactory theCOSEMObjectsFactory = (COSEMObjectsFactory)EPackage.Registry.INSTANCE.getEFactory(COSEMObjectsPackage.eNS_URI);
			if (theCOSEMObjectsFactory != null) {
				return theCOSEMObjectsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new COSEMObjectsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMObjectsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case COSEMObjectsPackage.PROGRAM_ENTRIES: return createProgramEntries();
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES: return createBillingPeriodValues();
			case COSEMObjectsPackage.TIME_ENTRIES: return createTimeEntries();
			case COSEMObjectsPackage.UNIX_CLOCK: return createUNIXClock();
			case COSEMObjectsPackage.MODEM_CONFIGURATION_OBJECT: return createModemConfigurationObject();
			case COSEMObjectsPackage.AUTO_CONNECT_OBJECT: return createAutoConnectObject();
			case COSEMObjectsPackage.AUTO_ANSWER_OBJECT: return createAutoAnswerObject();
			case COSEMObjectsPackage.SCRIPT_TABLE: return createScriptTable();
			case COSEMObjectsPackage.GLOBAL_METER_RESET: return createGlobalMeterReset();
			case COSEMObjectsPackage.MDI_RESET: return createMDIReset();
			case COSEMObjectsPackage.TARIFFICATION: return createTariffication();
			case COSEMObjectsPackage.ACTIVATE_TEST_MODE: return createActivateTestMode();
			case COSEMObjectsPackage.ACTIVATE_NORMAL_MODE: return createActivateNormalMode();
			case COSEMObjectsPackage.SET_OUTPUT_SIGNAL: return createSetOutputSignal();
			case COSEMObjectsPackage.SWITCH_OPTICAL_TEST_OUTPUT: return createSwitchOpticalTestOutput();
			case COSEMObjectsPackage.POWER_QUALITY_MEASUREMENT_MANAGEMENT: return createPowerQualityMeasurementManagement();
			case COSEMObjectsPackage.DISCONNECT_CONTROL: return createDisconnectControl();
			case COSEMObjectsPackage.IMAGE_ACTIVATION: return createImageActivation();
			case COSEMObjectsPackage.PUSH: return createPush();
			case COSEMObjectsPackage.BROADCAST: return createBroadcast();
			case COSEMObjectsPackage.SPECIAL_DAYS: return createSpecialDays();
			case COSEMObjectsPackage.SCHEDULE_OBJECT: return createScheduleObject();
			case COSEMObjectsPackage.ACTIVITY_CALENDAR_OBJECT: return createActivityCalendarObject();
			case COSEMObjectsPackage.REGISTER_ACTIVATION_OBJECT: return createRegisterActivationObject();
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT: return createSingleActionScheduleObject();
			case COSEMObjectsPackage.DISCONNECT_CONTROL_SCHEDULE: return createDisconnectControlSchedule();
			case COSEMObjectsPackage.END_OF_BILLING_PERIOD_SCHEDULE: return createEndOfBillingPeriodSchedule();
			case COSEMObjectsPackage.IMAGE_ACTIVATION_SCHEDULE: return createImageActivationSchedule();
			case COSEMObjectsPackage.OUTPUT_CONTROL_SCHEDULE: return createOutputControlSchedule();
			case COSEMObjectsPackage.PUSH_SCHEDULE: return createPushSchedule();
			case COSEMObjectsPackage.REGISTER_MONITOR_OBJECT: return createRegisterMonitorObject();
			case COSEMObjectsPackage.ALARM_MONITOR: return createAlarmMonitor();
			case COSEMObjectsPackage.PARAMETER_MONITOR_OBJECT: return createParameterMonitorObject();
			case COSEMObjectsPackage.LIMITER_OBJECT: return createLimiterObject();
			case COSEMObjectsPackage.ACCOUNT_OBJECT: return createAccountObject();
			case COSEMObjectsPackage.CREDIT_OBJECT: return createCreditObject();
			case COSEMObjectsPackage.CHARGE_OBJECT: return createChargeObject();
			case COSEMObjectsPackage.TOKEN_GATEWAY_OBJECT: return createTokenGatewayObject();
			case COSEMObjectsPackage.MAX_CREDIT_LIMIT: return createMaxCreditLimit();
			case COSEMObjectsPackage.MAX_VEND_LIMIT: return createMaxVendLimit();
			case COSEMObjectsPackage.IEC_OPTICAL_PORT_SETUP: return createIECOpticalPortSetup();
			case COSEMObjectsPackage.IEC_ELECTRICAL_PORT_SETUP: return createIECElectricalPortSetup();
			case COSEMObjectsPackage.STANDARD_READOUT: return createStandardReadout();
			case COSEMObjectsPackage.STANDARD_READOUT_PARAM: return createStandardReadoutParam();
			case COSEMObjectsPackage.IECHDLC_SETUP_OBJECT: return createIECHDLCSetupObject();
			case COSEMObjectsPackage.IEC_TWISTED_PAIR_SETUP_OBJECT: return createIECTwistedPairSetupObject();
			case COSEMObjectsPackage.IEC_TWISTED_PAIR_MAC_ADDRESS_SETUP: return createIECTwistedPairMACAddressSetup();
			case COSEMObjectsPackage.IEC_TWISTED_PAIR_FATAL_ERROR_REGISTER: return createIECTwistedPairFatalErrorRegister();
			case COSEMObjectsPackage.IEC62056_31SHORT_READOUT: return createIEC62056_3_1ShortReadout();
			case COSEMObjectsPackage.IEC62056_31LONG_READOUT: return createIEC62056_3_1LongReadout();
			case COSEMObjectsPackage.IEC_62056_31ALTERNATE_READOUT_PROFILE: return createIEC_62056_3_1AlternateReadoutProfile();
			case COSEMObjectsPackage.MBUS_SLAVE_PORT_SETUP_OBJECT: return createM_BusSlavePortSetupObject();
			case COSEMObjectsPackage.MBUS_CLIENT_OBJECT: return createM_BusClientObject();
			case COSEMObjectsPackage.MBUS_VALUE: return createM_BusValue();
			case COSEMObjectsPackage.MBUS_PROFILE_GENERIC: return createM_BusProfileGeneric();
			case COSEMObjectsPackage.MBUS_DISCONNECT_CONTROL: return createM_BusDisconnectControl();
			case COSEMObjectsPackage.MBUS_CONTROL_LOG: return createM_BusControlLog();
			case COSEMObjectsPackage.MBUS_MASTER_PORT_SETUP_OBJECT: return createM_BusMasterPortSetupObject();
			case COSEMObjectsPackage.WIRELESS_MODE_QCHANNEL_OBJECT: return createWirelessModeQChannelObject();
			case COSEMObjectsPackage.DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OBJECT: return createDLMS_COSEMServerM_BusPortSetupObject();
			case COSEMObjectsPackage.MBUS_DIAGNOSTIC_OBJECT: return createM_BusDiagnosticObject();
			case COSEMObjectsPackage.TCP_UDP_SETUP_OBJECT: return createTCP_UDPSetupObject();
			case COSEMObjectsPackage.IPV4_SETUP_OBJECT: return createIPv4SetupObject();
			case COSEMObjectsPackage.MAC_ADDRESS_SETUP_OBJECT: return createMACAddressSetupObject();
			case COSEMObjectsPackage.PPP_SETUP_OBJECT: return createPPPSetupObject();
			case COSEMObjectsPackage.GPRS_MODEM_SETUP_OBJECT: return createGPRSModemSetupObject();
			case COSEMObjectsPackage.SMTP_SETUP_OBJECT: return createSMTPSetupObject();
			case COSEMObjectsPackage.GSM_DIAGNOSTIC_OBJECT: return createGSMDiagnosticObject();
			case COSEMObjectsPackage.IPV6_SETUP_OBJECT: return createIPv6SetupObject();
			case COSEMObjectsPackage.PUSH_SETUP_OBJECT: return createPushSetupObject();
			case COSEMObjectsPackage.SFSK_PHY_MAC_SETUP_OBJECT: return createS_FSKPhy_MACSetupObject();
			case COSEMObjectsPackage.SFSK_ACTIVE_INITIATOR_OBJECT: return createS_FSKActiveInitiatorObject();
			case COSEMObjectsPackage.SFSKMAC_SYNCHRONIZATION_TIMEOUTS: return createS_FSKMACSynchronizationTimeouts();
			case COSEMObjectsPackage.SFSKMAC_COUNTERS_OBJECT: return createS_FSKMACCountersObject();
			case COSEMObjectsPackage.IEC61334_432LLC_SETUP_OBJECT: return createIEC61334_4_32LLCSetupObject();
			case COSEMObjectsPackage.SFSK_REPORTING_SYSTEM_LIST_OBJECT: return createS_FSKReportingSystemListObject();
			case COSEMObjectsPackage.ISO_IEC8802_2LLC_TYPE1_SETUP_OBJECT: return createISO_IEC8802_2LLCType1SetupObject();
			case COSEMObjectsPackage.ISO_IEC8802_2LLC_TYPE2_SETUP: return createISO_IEC8802_2LLCType2Setup();
			case COSEMObjectsPackage.ISO_IEC8802_2LLC_TYPE3_SETUP: return createISO_IEC8802_2LLCType3Setup();
			case COSEMObjectsPackage.T61334_432LLCSSC_SSETUPOBJECT: return createt61334_4_32LLCSSCSsetupobject();
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_PHYSICAL_LAYER_COUNTERS_OBJECT: return createPRIME_NB_OFDM_PLC_Physical_layer_counters_object();
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_SETUP_OBJECT: return createPRIME_NB_OFDM_PLC_MAC_setup_object();
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_FUNCTIONAL_PARAMETERS_OBJECT: return createPRIME_NB_OFDM_PLC_MAC_functional_parameters_object();
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_COUNTERS_OBJECT: return createPRIME_NB_OFDM_PLC_MAC_counters_object();
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_NETWORK_ADMINISTRATION_DATA_OBJECT: return createPRIME_NB_OFDM_PLC_MAC_network_administration_data_object();
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_ADDRESS_SETUP: return createPRIME_NB_OFDM_PLC_MAC_address_setup();
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OBJECT: return createPRIME_NB_OFDM_PLC_Application_identification_object();
			case COSEMObjectsPackage.G3_PLC_MAC_LAYER_COUNTERS_OBJECT: return createG3_PLC_MAC_layer_counters_object();
			case COSEMObjectsPackage.G3_PLC_MAC_SETUP_OBJECT: return createG3_PLC_MAC_setup_object();
			case COSEMObjectsPackage.G3_PLC_6LO_WPAN_ADAPTATION_LAYER_SETUP_OBJECT: return createG3_PLC_6LoWPAN_adaptation_layer_setup_object();
			case COSEMObjectsPackage.ZIG_BEE_SAS_STARTUP_OBJECT: return createZigBee_SAS_startup_object();
			case COSEMObjectsPackage.ZIG_BEE_SAS_JOIN_OBJECT: return createZigBee_SAS_join_object();
			case COSEMObjectsPackage.ZIG_BEE_SAS_APS_FRAGMENTATION_OBJECT: return createZigBee_SAS_APS_fragmentation_object();
			case COSEMObjectsPackage.ZIG_BEE_NETWORK_CONTROL_OBJECT: return createZigBee_network_control_object();
			case COSEMObjectsPackage.ZIG_BEE_TUNNEL_SETUP_OBJECT: return createZigBee_tunnel_setup_object();
			case COSEMObjectsPackage.CURRENT_ASSOCIATION: return createCurrentAssociation();
			case COSEMObjectsPackage.SAP_ASSIGNMENT_CURRENT: return createSAPAssignmentCurrent();
			case COSEMObjectsPackage.SECURITY_SETUP_OBJECT: return createSecuritySetupObject();
			case COSEMObjectsPackage.INVOCATION_COUNTER: return createInvocationCounter();
			case COSEMObjectsPackage.DATA_PROTECTION_OBJECT: return createDataProtectionObject();
			case COSEMObjectsPackage.IMAGE_TRANSFER_OBJECT: return createImageTransferObject();
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT: return createUtilitiesTableObject();
			case COSEMObjectsPackage.COMPACT_DATA_OBJECT: return createCompactDataObject();
			case COSEMObjectsPackage.DEVICE_ID: return createDeviceID();
			case COSEMObjectsPackage.METERING_POINT_ID: return createMeteringPointID();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT: return createParameterChangesObject();
			case COSEMObjectsPackage.IOCONTROL_SIGNAL_OBJECTS_CONTENTSMANUFACTURERSPECIFIC: return createI_O_control_signal_objects_contentsmanufacturerspecific();
			case COSEMObjectsPackage.IOCONTROL_SIGNAL_OBJECTS_CONTENTSMAPPEDTOAREFERENCETABLE: return createI_O_control_signal_objects_contentsmappedtoareferencetable();
			case COSEMObjectsPackage.IOCONTROL_SIGNAL_OBJECTS_GLOBAL: return createI_O_control_signal_objects_global();
			case COSEMObjectsPackage.IO_CONTROL_SIGNALS_MANUFACTURER: return createIOControlSignalsManufacturer();
			case COSEMObjectsPackage.IO_CONTROL_SIGNALS_MAPPED: return createIOControlSignalsMapped();
			case COSEMObjectsPackage.IO_CONTROL_SIGNALS_GLOBAL: return createIOControlSignalsGlobal();
			case COSEMObjectsPackage.DISCONNECT_CONTROL_OBJECT: return createDisconnectControlObject();
			case COSEMObjectsPackage.GENERAL_PURPOSE_ARBITRATOR: return createGeneralPurposeArbitrator();
			case COSEMObjectsPackage.INTERNAL_CONTROL_MANU: return createInternalControlManu();
			case COSEMObjectsPackage.INTERNAL_CONTROL_MAPPED: return createInternalControlMapped();
			case COSEMObjectsPackage.INTERNAL_CONTROL_GLOBAL: return createInternalControlGlobal();
			case COSEMObjectsPackage.INTERNAL_OPERATING_STATUS_MANU: return createInternalOperatingStatusManu();
			case COSEMObjectsPackage.INTERNAL_OPERATING_STATUS_MAPPED: return createInternalOperatingStatusMapped();
			case COSEMObjectsPackage.INTERNAL_OPERATING_STATUS_GLOBAL: return createInternalOperatingStatusGlobal();
			case COSEMObjectsPackage.STATUS_REGISTER_MANU: return createStatusRegisterManu();
			case COSEMObjectsPackage.STATUS_REGISTER_MAPPED: return createStatusRegisterMapped();
			case COSEMObjectsPackage.ERROR_REGISTER_OBJECT: return createErrorRegisterObject();
			case COSEMObjectsPackage.ERROR_PROFILE_OBJECT: return createErrorProfileObject();
			case COSEMObjectsPackage.ERROR_TABLE_OBJECT: return createErrorTableObject();
			case COSEMObjectsPackage.ALARM_REGISTER_OBJECT: return createAlarmRegisterObject();
			case COSEMObjectsPackage.ALARM_FILTER_OBJECT: return createAlarmFilterObject();
			case COSEMObjectsPackage.ALARM_DESCRIPTOR_OBJECT: return createAlarmDescriptorObject();
			case COSEMObjectsPackage.EVENT_LOG: return createEventLog();
			case COSEMObjectsPackage.ELECTRICITY_ID: return createElectricityID();
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES: return createElectricityProgramEntries();
			case COSEMObjectsPackage.OUTPUT_PULSE_VALUES_CONSTANTS: return createOutputPulseValues_constants();
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO: return createReadingFactorAndCT_VTratio();
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES: return createElectricityNominalValues();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS: return createInputPulseValuesOrConstants();
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION: return createMeasurementPeriod_recordingInterval_billingPeriodDuration();
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES: return createElectricityTimeEntries();
			case COSEMObjectsPackage.COEFFICIENTS: return createCoefficients();
			case COSEMObjectsPackage.MEASUREMENT_METHODS: return createMeasurementMethods();
			case COSEMObjectsPackage.ELECTRICITY_METERING_POINT_ID: return createElectricityMeteringPointID();
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA: return createElectricityRelatedStatusData();
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA_MAPPED: return createElectricityRelatedStatusDataMapped();
			case COSEMObjectsPackage.BATTERY_ENTRIES: return createBatteryEntries();
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING: return createPowerFailureMonitoring();
			case COSEMObjectsPackage.OPERATING_TIME: return createOperatingTime();
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS: return createEnvironmentRelatedParameters();
			case COSEMObjectsPackage.STATUS_REGISTER: return createStatusRegister();
			case COSEMObjectsPackage.EVENT_CODE: return createEventCode();
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS: return createCommunicationPortLogParameters();
			case COSEMObjectsPackage.CONSUMER_MESSAGE: return createConsumerMessage();
			case COSEMObjectsPackage.CURRENTLY_ACTIVE_TARIFF: return createCurrentlyActiveTariff();
			case COSEMObjectsPackage.EVENT_COUNTER_OBJECT: return createEventCounterObject();
			case COSEMObjectsPackage.PROFILE_ENTRY_DIGITAL_SIGNATURE_OBJECT: return createProfileEntryDigitalSignatureObject();
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT: return createMeterTemperEventRelatedObject();
			case COSEMObjectsPackage.ELECTRICITY_VALUES: return createElectricityValues();
			case COSEMObjectsPackage.MEASUREMENT_VALUES: return createMeasurementValues();
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS: return createElectricityHarmonics();
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT: return createExtendedPhaseAngleMeasurement();
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES: return createTransformerAndLineLosses();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramEntries createProgramEntries() {
		ProgramEntriesImpl programEntries = new ProgramEntriesImpl();
		return programEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingPeriodValues createBillingPeriodValues() {
		BillingPeriodValuesImpl billingPeriodValues = new BillingPeriodValuesImpl();
		return billingPeriodValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEntries createTimeEntries() {
		TimeEntriesImpl timeEntries = new TimeEntriesImpl();
		return timeEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNIXClock createUNIXClock() {
		UNIXClockImpl unixClock = new UNIXClockImpl();
		return unixClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModemConfigurationObject createModemConfigurationObject() {
		ModemConfigurationObjectImpl modemConfigurationObject = new ModemConfigurationObjectImpl();
		return modemConfigurationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoConnectObject createAutoConnectObject() {
		AutoConnectObjectImpl autoConnectObject = new AutoConnectObjectImpl();
		return autoConnectObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoAnswerObject createAutoAnswerObject() {
		AutoAnswerObjectImpl autoAnswerObject = new AutoAnswerObjectImpl();
		return autoAnswerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTable createScriptTable() {
		ScriptTableImpl scriptTable = new ScriptTableImpl();
		return scriptTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMeterReset createGlobalMeterReset() {
		GlobalMeterResetImpl globalMeterReset = new GlobalMeterResetImpl();
		return globalMeterReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDIReset createMDIReset() {
		MDIResetImpl mdiReset = new MDIResetImpl();
		return mdiReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tariffication createTariffication() {
		TarifficationImpl tariffication = new TarifficationImpl();
		return tariffication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateTestMode createActivateTestMode() {
		ActivateTestModeImpl activateTestMode = new ActivateTestModeImpl();
		return activateTestMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivateNormalMode createActivateNormalMode() {
		ActivateNormalModeImpl activateNormalMode = new ActivateNormalModeImpl();
		return activateNormalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOutputSignal createSetOutputSignal() {
		SetOutputSignalImpl setOutputSignal = new SetOutputSignalImpl();
		return setOutputSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchOpticalTestOutput createSwitchOpticalTestOutput() {
		SwitchOpticalTestOutputImpl switchOpticalTestOutput = new SwitchOpticalTestOutputImpl();
		return switchOpticalTestOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerQualityMeasurementManagement createPowerQualityMeasurementManagement() {
		PowerQualityMeasurementManagementImpl powerQualityMeasurementManagement = new PowerQualityMeasurementManagementImpl();
		return powerQualityMeasurementManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControl createDisconnectControl() {
		DisconnectControlImpl disconnectControl = new DisconnectControlImpl();
		return disconnectControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageActivation createImageActivation() {
		ImageActivationImpl imageActivation = new ImageActivationImpl();
		return imageActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Push createPush() {
		PushImpl push = new PushImpl();
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Broadcast createBroadcast() {
		BroadcastImpl broadcast = new BroadcastImpl();
		return broadcast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialDays createSpecialDays() {
		SpecialDaysImpl specialDays = new SpecialDaysImpl();
		return specialDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleObject createScheduleObject() {
		ScheduleObjectImpl scheduleObject = new ScheduleObjectImpl();
		return scheduleObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityCalendarObject createActivityCalendarObject() {
		ActivityCalendarObjectImpl activityCalendarObject = new ActivityCalendarObjectImpl();
		return activityCalendarObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterActivationObject createRegisterActivationObject() {
		RegisterActivationObjectImpl registerActivationObject = new RegisterActivationObjectImpl();
		return registerActivationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleActionScheduleObject createSingleActionScheduleObject() {
		SingleActionScheduleObjectImpl singleActionScheduleObject = new SingleActionScheduleObjectImpl();
		return singleActionScheduleObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControlSchedule createDisconnectControlSchedule() {
		DisconnectControlScheduleImpl disconnectControlSchedule = new DisconnectControlScheduleImpl();
		return disconnectControlSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfBillingPeriodSchedule createEndOfBillingPeriodSchedule() {
		EndOfBillingPeriodScheduleImpl endOfBillingPeriodSchedule = new EndOfBillingPeriodScheduleImpl();
		return endOfBillingPeriodSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageActivationSchedule createImageActivationSchedule() {
		ImageActivationScheduleImpl imageActivationSchedule = new ImageActivationScheduleImpl();
		return imageActivationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputControlSchedule createOutputControlSchedule() {
		OutputControlScheduleImpl outputControlSchedule = new OutputControlScheduleImpl();
		return outputControlSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushSchedule createPushSchedule() {
		PushScheduleImpl pushSchedule = new PushScheduleImpl();
		return pushSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterMonitorObject createRegisterMonitorObject() {
		RegisterMonitorObjectImpl registerMonitorObject = new RegisterMonitorObjectImpl();
		return registerMonitorObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmMonitor createAlarmMonitor() {
		AlarmMonitorImpl alarmMonitor = new AlarmMonitorImpl();
		return alarmMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMonitorObject createParameterMonitorObject() {
		ParameterMonitorObjectImpl parameterMonitorObject = new ParameterMonitorObjectImpl();
		return parameterMonitorObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimiterObject createLimiterObject() {
		LimiterObjectImpl limiterObject = new LimiterObjectImpl();
		return limiterObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountObject createAccountObject() {
		AccountObjectImpl accountObject = new AccountObjectImpl();
		return accountObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditObject createCreditObject() {
		CreditObjectImpl creditObject = new CreditObjectImpl();
		return creditObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeObject createChargeObject() {
		ChargeObjectImpl chargeObject = new ChargeObjectImpl();
		return chargeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenGatewayObject createTokenGatewayObject() {
		TokenGatewayObjectImpl tokenGatewayObject = new TokenGatewayObjectImpl();
		return tokenGatewayObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxCreditLimit createMaxCreditLimit() {
		MaxCreditLimitImpl maxCreditLimit = new MaxCreditLimitImpl();
		return maxCreditLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxVendLimit createMaxVendLimit() {
		MaxVendLimitImpl maxVendLimit = new MaxVendLimitImpl();
		return maxVendLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECOpticalPortSetup createIECOpticalPortSetup() {
		IECOpticalPortSetupImpl iecOpticalPortSetup = new IECOpticalPortSetupImpl();
		return iecOpticalPortSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECElectricalPortSetup createIECElectricalPortSetup() {
		IECElectricalPortSetupImpl iecElectricalPortSetup = new IECElectricalPortSetupImpl();
		return iecElectricalPortSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardReadout createStandardReadout() {
		StandardReadoutImpl standardReadout = new StandardReadoutImpl();
		return standardReadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardReadoutParam createStandardReadoutParam() {
		StandardReadoutParamImpl standardReadoutParam = new StandardReadoutParamImpl();
		return standardReadoutParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECHDLCSetupObject createIECHDLCSetupObject() {
		IECHDLCSetupObjectImpl iechdlcSetupObject = new IECHDLCSetupObjectImpl();
		return iechdlcSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTwistedPairSetupObject createIECTwistedPairSetupObject() {
		IECTwistedPairSetupObjectImpl iecTwistedPairSetupObject = new IECTwistedPairSetupObjectImpl();
		return iecTwistedPairSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTwistedPairMACAddressSetup createIECTwistedPairMACAddressSetup() {
		IECTwistedPairMACAddressSetupImpl iecTwistedPairMACAddressSetup = new IECTwistedPairMACAddressSetupImpl();
		return iecTwistedPairMACAddressSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTwistedPairFatalErrorRegister createIECTwistedPairFatalErrorRegister() {
		IECTwistedPairFatalErrorRegisterImpl iecTwistedPairFatalErrorRegister = new IECTwistedPairFatalErrorRegisterImpl();
		return iecTwistedPairFatalErrorRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC62056_3_1ShortReadout createIEC62056_3_1ShortReadout() {
		IEC62056_3_1ShortReadoutImpl iec62056_3_1ShortReadout = new IEC62056_3_1ShortReadoutImpl();
		return iec62056_3_1ShortReadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC62056_3_1LongReadout createIEC62056_3_1LongReadout() {
		IEC62056_3_1LongReadoutImpl iec62056_3_1LongReadout = new IEC62056_3_1LongReadoutImpl();
		return iec62056_3_1LongReadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC_62056_3_1AlternateReadoutProfile createIEC_62056_3_1AlternateReadoutProfile() {
		IEC_62056_3_1AlternateReadoutProfileImpl ieC_62056_3_1AlternateReadoutProfile = new IEC_62056_3_1AlternateReadoutProfileImpl();
		return ieC_62056_3_1AlternateReadoutProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_BusSlavePortSetupObject createM_BusSlavePortSetupObject() {
		M_BusSlavePortSetupObjectImpl m_BusSlavePortSetupObject = new M_BusSlavePortSetupObjectImpl();
		return m_BusSlavePortSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_BusClientObject createM_BusClientObject() {
		M_BusClientObjectImpl m_BusClientObject = new M_BusClientObjectImpl();
		return m_BusClientObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_BusValue createM_BusValue() {
		M_BusValueImpl m_BusValue = new M_BusValueImpl();
		return m_BusValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_BusProfileGeneric createM_BusProfileGeneric() {
		M_BusProfileGenericImpl m_BusProfileGeneric = new M_BusProfileGenericImpl();
		return m_BusProfileGeneric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_BusDisconnectControl createM_BusDisconnectControl() {
		M_BusDisconnectControlImpl m_BusDisconnectControl = new M_BusDisconnectControlImpl();
		return m_BusDisconnectControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_BusControlLog createM_BusControlLog() {
		M_BusControlLogImpl m_BusControlLog = new M_BusControlLogImpl();
		return m_BusControlLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_BusMasterPortSetupObject createM_BusMasterPortSetupObject() {
		M_BusMasterPortSetupObjectImpl m_BusMasterPortSetupObject = new M_BusMasterPortSetupObjectImpl();
		return m_BusMasterPortSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WirelessModeQChannelObject createWirelessModeQChannelObject() {
		WirelessModeQChannelObjectImpl wirelessModeQChannelObject = new WirelessModeQChannelObjectImpl();
		return wirelessModeQChannelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLMS_COSEMServerM_BusPortSetupObject createDLMS_COSEMServerM_BusPortSetupObject() {
		DLMS_COSEMServerM_BusPortSetupObjectImpl dlmS_COSEMServerM_BusPortSetupObject = new DLMS_COSEMServerM_BusPortSetupObjectImpl();
		return dlmS_COSEMServerM_BusPortSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_BusDiagnosticObject createM_BusDiagnosticObject() {
		M_BusDiagnosticObjectImpl m_BusDiagnosticObject = new M_BusDiagnosticObjectImpl();
		return m_BusDiagnosticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCP_UDPSetupObject createTCP_UDPSetupObject() {
		TCP_UDPSetupObjectImpl tcP_UDPSetupObject = new TCP_UDPSetupObjectImpl();
		return tcP_UDPSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv4SetupObject createIPv4SetupObject() {
		IPv4SetupObjectImpl iPv4SetupObject = new IPv4SetupObjectImpl();
		return iPv4SetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MACAddressSetupObject createMACAddressSetupObject() {
		MACAddressSetupObjectImpl macAddressSetupObject = new MACAddressSetupObjectImpl();
		return macAddressSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPPSetupObject createPPPSetupObject() {
		PPPSetupObjectImpl pppSetupObject = new PPPSetupObjectImpl();
		return pppSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPRSModemSetupObject createGPRSModemSetupObject() {
		GPRSModemSetupObjectImpl gprsModemSetupObject = new GPRSModemSetupObjectImpl();
		return gprsModemSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMTPSetupObject createSMTPSetupObject() {
		SMTPSetupObjectImpl smtpSetupObject = new SMTPSetupObjectImpl();
		return smtpSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMDiagnosticObject createGSMDiagnosticObject() {
		GSMDiagnosticObjectImpl gsmDiagnosticObject = new GSMDiagnosticObjectImpl();
		return gsmDiagnosticObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv6SetupObject createIPv6SetupObject() {
		IPv6SetupObjectImpl iPv6SetupObject = new IPv6SetupObjectImpl();
		return iPv6SetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushSetupObject createPushSetupObject() {
		PushSetupObjectImpl pushSetupObject = new PushSetupObjectImpl();
		return pushSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKPhy_MACSetupObject createS_FSKPhy_MACSetupObject() {
		S_FSKPhy_MACSetupObjectImpl s_FSKPhy_MACSetupObject = new S_FSKPhy_MACSetupObjectImpl();
		return s_FSKPhy_MACSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKActiveInitiatorObject createS_FSKActiveInitiatorObject() {
		S_FSKActiveInitiatorObjectImpl s_FSKActiveInitiatorObject = new S_FSKActiveInitiatorObjectImpl();
		return s_FSKActiveInitiatorObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKMACSynchronizationTimeouts createS_FSKMACSynchronizationTimeouts() {
		S_FSKMACSynchronizationTimeoutsImpl s_FSKMACSynchronizationTimeouts = new S_FSKMACSynchronizationTimeoutsImpl();
		return s_FSKMACSynchronizationTimeouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKMACCountersObject createS_FSKMACCountersObject() {
		S_FSKMACCountersObjectImpl s_FSKMACCountersObject = new S_FSKMACCountersObjectImpl();
		return s_FSKMACCountersObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61334_4_32LLCSetupObject createIEC61334_4_32LLCSetupObject() {
		IEC61334_4_32LLCSetupObjectImpl iec61334_4_32LLCSetupObject = new IEC61334_4_32LLCSetupObjectImpl();
		return iec61334_4_32LLCSetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKReportingSystemListObject createS_FSKReportingSystemListObject() {
		S_FSKReportingSystemListObjectImpl s_FSKReportingSystemListObject = new S_FSKReportingSystemListObjectImpl();
		return s_FSKReportingSystemListObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO_IEC8802_2LLCType1SetupObject createISO_IEC8802_2LLCType1SetupObject() {
		ISO_IEC8802_2LLCType1SetupObjectImpl isO_IEC8802_2LLCType1SetupObject = new ISO_IEC8802_2LLCType1SetupObjectImpl();
		return isO_IEC8802_2LLCType1SetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO_IEC8802_2LLCType2Setup createISO_IEC8802_2LLCType2Setup() {
		ISO_IEC8802_2LLCType2SetupImpl isO_IEC8802_2LLCType2Setup = new ISO_IEC8802_2LLCType2SetupImpl();
		return isO_IEC8802_2LLCType2Setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO_IEC8802_2LLCType3Setup createISO_IEC8802_2LLCType3Setup() {
		ISO_IEC8802_2LLCType3SetupImpl isO_IEC8802_2LLCType3Setup = new ISO_IEC8802_2LLCType3SetupImpl();
		return isO_IEC8802_2LLCType3Setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public t61334_4_32LLCSSCSsetupobject createt61334_4_32LLCSSCSsetupobject() {
		t61334_4_32LLCSSCSsetupobjectImpl t61334_4_32LLCSSCSsetupobject = new t61334_4_32LLCSSCSsetupobjectImpl();
		return t61334_4_32LLCSSCSsetupobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_Physical_layer_counters_object createPRIME_NB_OFDM_PLC_Physical_layer_counters_object() {
		PRIME_NB_OFDM_PLC_Physical_layer_counters_objectImpl primE_NB_OFDM_PLC_Physical_layer_counters_object = new PRIME_NB_OFDM_PLC_Physical_layer_counters_objectImpl();
		return primE_NB_OFDM_PLC_Physical_layer_counters_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MAC_setup_object createPRIME_NB_OFDM_PLC_MAC_setup_object() {
		PRIME_NB_OFDM_PLC_MAC_setup_objectImpl primE_NB_OFDM_PLC_MAC_setup_object = new PRIME_NB_OFDM_PLC_MAC_setup_objectImpl();
		return primE_NB_OFDM_PLC_MAC_setup_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MAC_functional_parameters_object createPRIME_NB_OFDM_PLC_MAC_functional_parameters_object() {
		PRIME_NB_OFDM_PLC_MAC_functional_parameters_objectImpl primE_NB_OFDM_PLC_MAC_functional_parameters_object = new PRIME_NB_OFDM_PLC_MAC_functional_parameters_objectImpl();
		return primE_NB_OFDM_PLC_MAC_functional_parameters_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MAC_counters_object createPRIME_NB_OFDM_PLC_MAC_counters_object() {
		PRIME_NB_OFDM_PLC_MAC_counters_objectImpl primE_NB_OFDM_PLC_MAC_counters_object = new PRIME_NB_OFDM_PLC_MAC_counters_objectImpl();
		return primE_NB_OFDM_PLC_MAC_counters_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MAC_network_administration_data_object createPRIME_NB_OFDM_PLC_MAC_network_administration_data_object() {
		PRIME_NB_OFDM_PLC_MAC_network_administration_data_objectImpl primE_NB_OFDM_PLC_MAC_network_administration_data_object = new PRIME_NB_OFDM_PLC_MAC_network_administration_data_objectImpl();
		return primE_NB_OFDM_PLC_MAC_network_administration_data_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MAC_address_setup createPRIME_NB_OFDM_PLC_MAC_address_setup() {
		PRIME_NB_OFDM_PLC_MAC_address_setupImpl primE_NB_OFDM_PLC_MAC_address_setup = new PRIME_NB_OFDM_PLC_MAC_address_setupImpl();
		return primE_NB_OFDM_PLC_MAC_address_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_Application_identification_object createPRIME_NB_OFDM_PLC_Application_identification_object() {
		PRIME_NB_OFDM_PLC_Application_identification_objectImpl primE_NB_OFDM_PLC_Application_identification_object = new PRIME_NB_OFDM_PLC_Application_identification_objectImpl();
		return primE_NB_OFDM_PLC_Application_identification_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_PLC_MAC_layer_counters_object createG3_PLC_MAC_layer_counters_object() {
		G3_PLC_MAC_layer_counters_objectImpl g3_PLC_MAC_layer_counters_object = new G3_PLC_MAC_layer_counters_objectImpl();
		return g3_PLC_MAC_layer_counters_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_PLC_MAC_setup_object createG3_PLC_MAC_setup_object() {
		G3_PLC_MAC_setup_objectImpl g3_PLC_MAC_setup_object = new G3_PLC_MAC_setup_objectImpl();
		return g3_PLC_MAC_setup_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_PLC_6LoWPAN_adaptation_layer_setup_object createG3_PLC_6LoWPAN_adaptation_layer_setup_object() {
		G3_PLC_6LoWPAN_adaptation_layer_setup_objectImpl g3_PLC_6LoWPAN_adaptation_layer_setup_object = new G3_PLC_6LoWPAN_adaptation_layer_setup_objectImpl();
		return g3_PLC_6LoWPAN_adaptation_layer_setup_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBee_SAS_startup_object createZigBee_SAS_startup_object() {
		ZigBee_SAS_startup_objectImpl zigBee_SAS_startup_object = new ZigBee_SAS_startup_objectImpl();
		return zigBee_SAS_startup_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBee_SAS_join_object createZigBee_SAS_join_object() {
		ZigBee_SAS_join_objectImpl zigBee_SAS_join_object = new ZigBee_SAS_join_objectImpl();
		return zigBee_SAS_join_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBee_SAS_APS_fragmentation_object createZigBee_SAS_APS_fragmentation_object() {
		ZigBee_SAS_APS_fragmentation_objectImpl zigBee_SAS_APS_fragmentation_object = new ZigBee_SAS_APS_fragmentation_objectImpl();
		return zigBee_SAS_APS_fragmentation_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBee_network_control_object createZigBee_network_control_object() {
		ZigBee_network_control_objectImpl zigBee_network_control_object = new ZigBee_network_control_objectImpl();
		return zigBee_network_control_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBee_tunnel_setup_object createZigBee_tunnel_setup_object() {
		ZigBee_tunnel_setup_objectImpl zigBee_tunnel_setup_object = new ZigBee_tunnel_setup_objectImpl();
		return zigBee_tunnel_setup_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentAssociation createCurrentAssociation() {
		CurrentAssociationImpl currentAssociation = new CurrentAssociationImpl();
		return currentAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAPAssignmentCurrent createSAPAssignmentCurrent() {
		SAPAssignmentCurrentImpl sapAssignmentCurrent = new SAPAssignmentCurrentImpl();
		return sapAssignmentCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySetupObject createSecuritySetupObject() {
		SecuritySetupObjectImpl securitySetupObject = new SecuritySetupObjectImpl();
		return securitySetupObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationCounter createInvocationCounter() {
		InvocationCounterImpl invocationCounter = new InvocationCounterImpl();
		return invocationCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProtectionObject createDataProtectionObject() {
		DataProtectionObjectImpl dataProtectionObject = new DataProtectionObjectImpl();
		return dataProtectionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageTransferObject createImageTransferObject() {
		ImageTransferObjectImpl imageTransferObject = new ImageTransferObjectImpl();
		return imageTransferObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilitiesTableObject createUtilitiesTableObject() {
		UtilitiesTableObjectImpl utilitiesTableObject = new UtilitiesTableObjectImpl();
		return utilitiesTableObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompactDataObject createCompactDataObject() {
		CompactDataObjectImpl compactDataObject = new CompactDataObjectImpl();
		return compactDataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceID createDeviceID() {
		DeviceIDImpl deviceID = new DeviceIDImpl();
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringPointID createMeteringPointID() {
		MeteringPointIDImpl meteringPointID = new MeteringPointIDImpl();
		return meteringPointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterChangesObject createParameterChangesObject() {
		ParameterChangesObjectImpl parameterChangesObject = new ParameterChangesObjectImpl();
		return parameterChangesObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I_O_control_signal_objects_contentsmanufacturerspecific createI_O_control_signal_objects_contentsmanufacturerspecific() {
		I_O_control_signal_objects_contentsmanufacturerspecificImpl i_O_control_signal_objects_contentsmanufacturerspecific = new I_O_control_signal_objects_contentsmanufacturerspecificImpl();
		return i_O_control_signal_objects_contentsmanufacturerspecific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I_O_control_signal_objects_contentsmappedtoareferencetable createI_O_control_signal_objects_contentsmappedtoareferencetable() {
		I_O_control_signal_objects_contentsmappedtoareferencetableImpl i_O_control_signal_objects_contentsmappedtoareferencetable = new I_O_control_signal_objects_contentsmappedtoareferencetableImpl();
		return i_O_control_signal_objects_contentsmappedtoareferencetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I_O_control_signal_objects_global createI_O_control_signal_objects_global() {
		I_O_control_signal_objects_globalImpl i_O_control_signal_objects_global = new I_O_control_signal_objects_globalImpl();
		return i_O_control_signal_objects_global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOControlSignalsManufacturer createIOControlSignalsManufacturer() {
		IOControlSignalsManufacturerImpl ioControlSignalsManufacturer = new IOControlSignalsManufacturerImpl();
		return ioControlSignalsManufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOControlSignalsMapped createIOControlSignalsMapped() {
		IOControlSignalsMappedImpl ioControlSignalsMapped = new IOControlSignalsMappedImpl();
		return ioControlSignalsMapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOControlSignalsGlobal createIOControlSignalsGlobal() {
		IOControlSignalsGlobalImpl ioControlSignalsGlobal = new IOControlSignalsGlobalImpl();
		return ioControlSignalsGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControlObject createDisconnectControlObject() {
		DisconnectControlObjectImpl disconnectControlObject = new DisconnectControlObjectImpl();
		return disconnectControlObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralPurposeArbitrator createGeneralPurposeArbitrator() {
		GeneralPurposeArbitratorImpl generalPurposeArbitrator = new GeneralPurposeArbitratorImpl();
		return generalPurposeArbitrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalControlManu createInternalControlManu() {
		InternalControlManuImpl internalControlManu = new InternalControlManuImpl();
		return internalControlManu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalControlMapped createInternalControlMapped() {
		InternalControlMappedImpl internalControlMapped = new InternalControlMappedImpl();
		return internalControlMapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalControlGlobal createInternalControlGlobal() {
		InternalControlGlobalImpl internalControlGlobal = new InternalControlGlobalImpl();
		return internalControlGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalOperatingStatusManu createInternalOperatingStatusManu() {
		InternalOperatingStatusManuImpl internalOperatingStatusManu = new InternalOperatingStatusManuImpl();
		return internalOperatingStatusManu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalOperatingStatusMapped createInternalOperatingStatusMapped() {
		InternalOperatingStatusMappedImpl internalOperatingStatusMapped = new InternalOperatingStatusMappedImpl();
		return internalOperatingStatusMapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalOperatingStatusGlobal createInternalOperatingStatusGlobal() {
		InternalOperatingStatusGlobalImpl internalOperatingStatusGlobal = new InternalOperatingStatusGlobalImpl();
		return internalOperatingStatusGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusRegisterManu createStatusRegisterManu() {
		StatusRegisterManuImpl statusRegisterManu = new StatusRegisterManuImpl();
		return statusRegisterManu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusRegisterMapped createStatusRegisterMapped() {
		StatusRegisterMappedImpl statusRegisterMapped = new StatusRegisterMappedImpl();
		return statusRegisterMapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorRegisterObject createErrorRegisterObject() {
		ErrorRegisterObjectImpl errorRegisterObject = new ErrorRegisterObjectImpl();
		return errorRegisterObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorProfileObject createErrorProfileObject() {
		ErrorProfileObjectImpl errorProfileObject = new ErrorProfileObjectImpl();
		return errorProfileObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorTableObject createErrorTableObject() {
		ErrorTableObjectImpl errorTableObject = new ErrorTableObjectImpl();
		return errorTableObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmRegisterObject createAlarmRegisterObject() {
		AlarmRegisterObjectImpl alarmRegisterObject = new AlarmRegisterObjectImpl();
		return alarmRegisterObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmFilterObject createAlarmFilterObject() {
		AlarmFilterObjectImpl alarmFilterObject = new AlarmFilterObjectImpl();
		return alarmFilterObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmDescriptorObject createAlarmDescriptorObject() {
		AlarmDescriptorObjectImpl alarmDescriptorObject = new AlarmDescriptorObjectImpl();
		return alarmDescriptorObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventLog createEventLog() {
		EventLogImpl eventLog = new EventLogImpl();
		return eventLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityID createElectricityID() {
		ElectricityIDImpl electricityID = new ElectricityIDImpl();
		return electricityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityProgramEntries createElectricityProgramEntries() {
		ElectricityProgramEntriesImpl electricityProgramEntries = new ElectricityProgramEntriesImpl();
		return electricityProgramEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPulseValues_constants createOutputPulseValues_constants() {
		OutputPulseValues_constantsImpl outputPulseValues_constants = new OutputPulseValues_constantsImpl();
		return outputPulseValues_constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingFactorAndCT_VTratio createReadingFactorAndCT_VTratio() {
		ReadingFactorAndCT_VTratioImpl readingFactorAndCT_VTratio = new ReadingFactorAndCT_VTratioImpl();
		return readingFactorAndCT_VTratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityNominalValues createElectricityNominalValues() {
		ElectricityNominalValuesImpl electricityNominalValues = new ElectricityNominalValuesImpl();
		return electricityNominalValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPulseValuesOrConstants createInputPulseValuesOrConstants() {
		InputPulseValuesOrConstantsImpl inputPulseValuesOrConstants = new InputPulseValuesOrConstantsImpl();
		return inputPulseValuesOrConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementPeriod_recordingInterval_billingPeriodDuration createMeasurementPeriod_recordingInterval_billingPeriodDuration() {
		MeasurementPeriod_recordingInterval_billingPeriodDurationImpl measurementPeriod_recordingInterval_billingPeriodDuration = new MeasurementPeriod_recordingInterval_billingPeriodDurationImpl();
		return measurementPeriod_recordingInterval_billingPeriodDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityTimeEntries createElectricityTimeEntries() {
		ElectricityTimeEntriesImpl electricityTimeEntries = new ElectricityTimeEntriesImpl();
		return electricityTimeEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coefficients createCoefficients() {
		CoefficientsImpl coefficients = new CoefficientsImpl();
		return coefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementMethods createMeasurementMethods() {
		MeasurementMethodsImpl measurementMethods = new MeasurementMethodsImpl();
		return measurementMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityMeteringPointID createElectricityMeteringPointID() {
		ElectricityMeteringPointIDImpl electricityMeteringPointID = new ElectricityMeteringPointIDImpl();
		return electricityMeteringPointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityRelatedStatusData createElectricityRelatedStatusData() {
		ElectricityRelatedStatusDataImpl electricityRelatedStatusData = new ElectricityRelatedStatusDataImpl();
		return electricityRelatedStatusData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityRelatedStatusDataMapped createElectricityRelatedStatusDataMapped() {
		ElectricityRelatedStatusDataMappedImpl electricityRelatedStatusDataMapped = new ElectricityRelatedStatusDataMappedImpl();
		return electricityRelatedStatusDataMapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryEntries createBatteryEntries() {
		BatteryEntriesImpl batteryEntries = new BatteryEntriesImpl();
		return batteryEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerFailureMonitoring createPowerFailureMonitoring() {
		PowerFailureMonitoringImpl powerFailureMonitoring = new PowerFailureMonitoringImpl();
		return powerFailureMonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingTime createOperatingTime() {
		OperatingTimeImpl operatingTime = new OperatingTimeImpl();
		return operatingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentRelatedParameters createEnvironmentRelatedParameters() {
		EnvironmentRelatedParametersImpl environmentRelatedParameters = new EnvironmentRelatedParametersImpl();
		return environmentRelatedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusRegister createStatusRegister() {
		StatusRegisterImpl statusRegister = new StatusRegisterImpl();
		return statusRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCode createEventCode() {
		EventCodeImpl eventCode = new EventCodeImpl();
		return eventCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPortLogParameters createCommunicationPortLogParameters() {
		CommunicationPortLogParametersImpl communicationPortLogParameters = new CommunicationPortLogParametersImpl();
		return communicationPortLogParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumerMessage createConsumerMessage() {
		ConsumerMessageImpl consumerMessage = new ConsumerMessageImpl();
		return consumerMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentlyActiveTariff createCurrentlyActiveTariff() {
		CurrentlyActiveTariffImpl currentlyActiveTariff = new CurrentlyActiveTariffImpl();
		return currentlyActiveTariff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCounterObject createEventCounterObject() {
		EventCounterObjectImpl eventCounterObject = new EventCounterObjectImpl();
		return eventCounterObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileEntryDigitalSignatureObject createProfileEntryDigitalSignatureObject() {
		ProfileEntryDigitalSignatureObjectImpl profileEntryDigitalSignatureObject = new ProfileEntryDigitalSignatureObjectImpl();
		return profileEntryDigitalSignatureObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterTemperEventRelatedObject createMeterTemperEventRelatedObject() {
		MeterTemperEventRelatedObjectImpl meterTemperEventRelatedObject = new MeterTemperEventRelatedObjectImpl();
		return meterTemperEventRelatedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityValues createElectricityValues() {
		ElectricityValuesImpl electricityValues = new ElectricityValuesImpl();
		return electricityValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValues createMeasurementValues() {
		MeasurementValuesImpl measurementValues = new MeasurementValuesImpl();
		return measurementValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityHarmonics createElectricityHarmonics() {
		ElectricityHarmonicsImpl electricityHarmonics = new ElectricityHarmonicsImpl();
		return electricityHarmonics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPhaseAngleMeasurement createExtendedPhaseAngleMeasurement() {
		ExtendedPhaseAngleMeasurementImpl extendedPhaseAngleMeasurement = new ExtendedPhaseAngleMeasurementImpl();
		return extendedPhaseAngleMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAndLineLosses createTransformerAndLineLosses() {
		TransformerAndLineLossesImpl transformerAndLineLosses = new TransformerAndLineLossesImpl();
		return transformerAndLineLosses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMObjectsPackage getCOSEMObjectsPackage() {
		return (COSEMObjectsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static COSEMObjectsPackage getPackage() {
		return COSEMObjectsPackage.eINSTANCE;
	}

} //COSEMObjectsFactoryImpl
