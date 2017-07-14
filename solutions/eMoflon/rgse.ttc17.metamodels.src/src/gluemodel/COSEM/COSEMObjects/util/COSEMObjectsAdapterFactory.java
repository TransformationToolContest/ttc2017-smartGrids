/**
 */
package gluemodel.COSEM.COSEMObjects.util;

import gluemodel.COSEM.COSEMObjects.*;

import gluemodel.COSEM.InterfaceClasses.Account;
import gluemodel.COSEM.InterfaceClasses.Activitycalendar;
import gluemodel.COSEM.InterfaceClasses.Arbitrator;
import gluemodel.COSEM.InterfaceClasses.AssociationLN;
import gluemodel.COSEM.InterfaceClasses.Auto_answer;
import gluemodel.COSEM.InterfaceClasses.Auto_connect;
import gluemodel.COSEM.InterfaceClasses.Base;
import gluemodel.COSEM.InterfaceClasses.Charge;
import gluemodel.COSEM.InterfaceClasses.Compactdata;
import gluemodel.COSEM.InterfaceClasses.Credit;
import gluemodel.COSEM.InterfaceClasses.DLMS_COSEM_Server_M_Bus_port_setup;
import gluemodel.COSEM.InterfaceClasses.Data;
import gluemodel.COSEM.InterfaceClasses.Dataprotection;
import gluemodel.COSEM.InterfaceClasses.ExtendedRegister;
import gluemodel.COSEM.InterfaceClasses.G3_PLC_6LoWPAN;
import gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_layer_counters;
import gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_setup;
import gluemodel.COSEM.InterfaceClasses.GPRS_modem_setup;
import gluemodel.COSEM.InterfaceClasses.GSM_Diagnostic;
import gluemodel.COSEM.InterfaceClasses.IEC61334_4_32LLCsetup;
import gluemodel.COSEM.InterfaceClasses.IEC8802_2LLCType3;
import gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_G3_NB;
import gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_Type_1;
import gluemodel.COSEM.InterfaceClasses.IEC_HDLC_setup;
import gluemodel.COSEM.InterfaceClasses.IEC_local_port_setup;
import gluemodel.COSEM.InterfaceClasses.IEC_twisted_pair_setup;
import gluemodel.COSEM.InterfaceClasses.IPv4setup;
import gluemodel.COSEM.InterfaceClasses.IPv6setup;
import gluemodel.COSEM.InterfaceClasses.Imagetransfer;
import gluemodel.COSEM.InterfaceClasses.Limiter;
import gluemodel.COSEM.InterfaceClasses.MACaddresssetup;
import gluemodel.COSEM.InterfaceClasses.M_Bus_client;
import gluemodel.COSEM.InterfaceClasses.M_Bus_diagnostic;
import gluemodel.COSEM.InterfaceClasses.M_Bus_master_port_setup;
import gluemodel.COSEM.InterfaceClasses.M_Bus_slave_port_setup;
import gluemodel.COSEM.InterfaceClasses.Modemconfiguration;
import gluemodel.COSEM.InterfaceClasses.PPPsetup;
import gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Application_identification;
import gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_counters;
import gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_functionalparams;
import gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACnetworkadmindata;
import gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACsetup;
import gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Phy_layer_counters;
import gluemodel.COSEM.InterfaceClasses.Parametermonitor;
import gluemodel.COSEM.InterfaceClasses.Profilegeneric;
import gluemodel.COSEM.InterfaceClasses.Pushsetup;
import gluemodel.COSEM.InterfaceClasses.Register;
import gluemodel.COSEM.InterfaceClasses.RegisterActivation;
import gluemodel.COSEM.InterfaceClasses.Registermonitor;
import gluemodel.COSEM.InterfaceClasses.Registertable;
import gluemodel.COSEM.InterfaceClasses.SAPAssignment;
import gluemodel.COSEM.InterfaceClasses.SMTPsetup;
import gluemodel.COSEM.InterfaceClasses.S_FSKActiveinitiator;
import gluemodel.COSEM.InterfaceClasses.S_FSKMACcounters;
import gluemodel.COSEM.InterfaceClasses.S_FSKMACsynctimeouts;
import gluemodel.COSEM.InterfaceClasses.S_FSKReportingsystemlist;
import gluemodel.COSEM.InterfaceClasses.S_FSK_PHY_MACsetup;
import gluemodel.COSEM.InterfaceClasses.Schedule;
import gluemodel.COSEM.InterfaceClasses.Scripttable;
import gluemodel.COSEM.InterfaceClasses.Securitysetup;
import gluemodel.COSEM.InterfaceClasses.Singleactionschedule;
import gluemodel.COSEM.InterfaceClasses.Specialdaystable;
import gluemodel.COSEM.InterfaceClasses.Statusmapping;
import gluemodel.COSEM.InterfaceClasses.TCP_UDPsetup;
import gluemodel.COSEM.InterfaceClasses.Tokengateway;
import gluemodel.COSEM.InterfaceClasses.Utilitytables;
import gluemodel.COSEM.InterfaceClasses.Wireless_Mode_Q_Channel;
import gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_APS_fragmentation;
import gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_join;
import gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_startup;
import gluemodel.COSEM.InterfaceClasses.ZigBeenetworkcontrol;
import gluemodel.COSEM.InterfaceClasses.ZigBeetunnelsetup;
import gluemodel.COSEM.InterfaceClasses.t61334_32_LLC_SSCS_setup;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage
 * @generated
 */
public class COSEMObjectsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static COSEMObjectsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMObjectsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = COSEMObjectsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COSEMObjectsSwitch<Adapter> modelSwitch =
		new COSEMObjectsSwitch<Adapter>() {
			@Override
			public Adapter caseProgramEntries(ProgramEntries object) {
				return createProgramEntriesAdapter();
			}
			@Override
			public Adapter caseBillingPeriodValues(BillingPeriodValues object) {
				return createBillingPeriodValuesAdapter();
			}
			@Override
			public Adapter caseTimeEntries(TimeEntries object) {
				return createTimeEntriesAdapter();
			}
			@Override
			public Adapter caseUNIXClock(UNIXClock object) {
				return createUNIXClockAdapter();
			}
			@Override
			public Adapter caseModemConfigurationObject(ModemConfigurationObject object) {
				return createModemConfigurationObjectAdapter();
			}
			@Override
			public Adapter caseAutoConnectObject(AutoConnectObject object) {
				return createAutoConnectObjectAdapter();
			}
			@Override
			public Adapter caseAutoAnswerObject(AutoAnswerObject object) {
				return createAutoAnswerObjectAdapter();
			}
			@Override
			public Adapter caseScriptTable(ScriptTable object) {
				return createScriptTableAdapter();
			}
			@Override
			public Adapter caseGlobalMeterReset(GlobalMeterReset object) {
				return createGlobalMeterResetAdapter();
			}
			@Override
			public Adapter caseMDIReset(MDIReset object) {
				return createMDIResetAdapter();
			}
			@Override
			public Adapter caseTariffication(Tariffication object) {
				return createTarifficationAdapter();
			}
			@Override
			public Adapter caseActivateTestMode(ActivateTestMode object) {
				return createActivateTestModeAdapter();
			}
			@Override
			public Adapter caseActivateNormalMode(ActivateNormalMode object) {
				return createActivateNormalModeAdapter();
			}
			@Override
			public Adapter caseSetOutputSignal(SetOutputSignal object) {
				return createSetOutputSignalAdapter();
			}
			@Override
			public Adapter caseSwitchOpticalTestOutput(SwitchOpticalTestOutput object) {
				return createSwitchOpticalTestOutputAdapter();
			}
			@Override
			public Adapter casePowerQualityMeasurementManagement(PowerQualityMeasurementManagement object) {
				return createPowerQualityMeasurementManagementAdapter();
			}
			@Override
			public Adapter caseDisconnectControl(DisconnectControl object) {
				return createDisconnectControlAdapter();
			}
			@Override
			public Adapter caseImageActivation(ImageActivation object) {
				return createImageActivationAdapter();
			}
			@Override
			public Adapter casePush(Push object) {
				return createPushAdapter();
			}
			@Override
			public Adapter caseBroadcast(Broadcast object) {
				return createBroadcastAdapter();
			}
			@Override
			public Adapter caseSpecialDays(SpecialDays object) {
				return createSpecialDaysAdapter();
			}
			@Override
			public Adapter caseScheduleObject(ScheduleObject object) {
				return createScheduleObjectAdapter();
			}
			@Override
			public Adapter caseActivityCalendarObject(ActivityCalendarObject object) {
				return createActivityCalendarObjectAdapter();
			}
			@Override
			public Adapter caseRegisterActivationObject(RegisterActivationObject object) {
				return createRegisterActivationObjectAdapter();
			}
			@Override
			public Adapter caseSingleActionScheduleObject(SingleActionScheduleObject object) {
				return createSingleActionScheduleObjectAdapter();
			}
			@Override
			public Adapter caseDisconnectControlSchedule(DisconnectControlSchedule object) {
				return createDisconnectControlScheduleAdapter();
			}
			@Override
			public Adapter caseEndOfBillingPeriodSchedule(EndOfBillingPeriodSchedule object) {
				return createEndOfBillingPeriodScheduleAdapter();
			}
			@Override
			public Adapter caseImageActivationSchedule(ImageActivationSchedule object) {
				return createImageActivationScheduleAdapter();
			}
			@Override
			public Adapter caseOutputControlSchedule(OutputControlSchedule object) {
				return createOutputControlScheduleAdapter();
			}
			@Override
			public Adapter casePushSchedule(PushSchedule object) {
				return createPushScheduleAdapter();
			}
			@Override
			public Adapter caseRegisterMonitorObject(RegisterMonitorObject object) {
				return createRegisterMonitorObjectAdapter();
			}
			@Override
			public Adapter caseAlarmMonitor(AlarmMonitor object) {
				return createAlarmMonitorAdapter();
			}
			@Override
			public Adapter caseParameterMonitorObject(ParameterMonitorObject object) {
				return createParameterMonitorObjectAdapter();
			}
			@Override
			public Adapter caseLimiterObject(LimiterObject object) {
				return createLimiterObjectAdapter();
			}
			@Override
			public Adapter caseAccountObject(AccountObject object) {
				return createAccountObjectAdapter();
			}
			@Override
			public Adapter caseCreditObject(CreditObject object) {
				return createCreditObjectAdapter();
			}
			@Override
			public Adapter caseChargeObject(ChargeObject object) {
				return createChargeObjectAdapter();
			}
			@Override
			public Adapter caseTokenGatewayObject(TokenGatewayObject object) {
				return createTokenGatewayObjectAdapter();
			}
			@Override
			public Adapter caseMaxCreditLimit(MaxCreditLimit object) {
				return createMaxCreditLimitAdapter();
			}
			@Override
			public Adapter caseMaxVendLimit(MaxVendLimit object) {
				return createMaxVendLimitAdapter();
			}
			@Override
			public Adapter caseIECOpticalPortSetup(IECOpticalPortSetup object) {
				return createIECOpticalPortSetupAdapter();
			}
			@Override
			public Adapter caseIECElectricalPortSetup(IECElectricalPortSetup object) {
				return createIECElectricalPortSetupAdapter();
			}
			@Override
			public Adapter caseStandardReadout(StandardReadout object) {
				return createStandardReadoutAdapter();
			}
			@Override
			public Adapter caseStandardReadoutParam(StandardReadoutParam object) {
				return createStandardReadoutParamAdapter();
			}
			@Override
			public Adapter caseIECHDLCSetupObject(IECHDLCSetupObject object) {
				return createIECHDLCSetupObjectAdapter();
			}
			@Override
			public Adapter caseIECTwistedPairSetupObject(IECTwistedPairSetupObject object) {
				return createIECTwistedPairSetupObjectAdapter();
			}
			@Override
			public Adapter caseIECTwistedPairMACAddressSetup(IECTwistedPairMACAddressSetup object) {
				return createIECTwistedPairMACAddressSetupAdapter();
			}
			@Override
			public Adapter caseIECTwistedPairFatalErrorRegister(IECTwistedPairFatalErrorRegister object) {
				return createIECTwistedPairFatalErrorRegisterAdapter();
			}
			@Override
			public Adapter caseIEC62056_3_1ShortReadout(IEC62056_3_1ShortReadout object) {
				return createIEC62056_3_1ShortReadoutAdapter();
			}
			@Override
			public Adapter caseIEC62056_3_1LongReadout(IEC62056_3_1LongReadout object) {
				return createIEC62056_3_1LongReadoutAdapter();
			}
			@Override
			public Adapter caseIEC_62056_3_1AlternateReadoutProfile(IEC_62056_3_1AlternateReadoutProfile object) {
				return createIEC_62056_3_1AlternateReadoutProfileAdapter();
			}
			@Override
			public Adapter caseM_BusSlavePortSetupObject(M_BusSlavePortSetupObject object) {
				return createM_BusSlavePortSetupObjectAdapter();
			}
			@Override
			public Adapter caseM_BusClientObject(M_BusClientObject object) {
				return createM_BusClientObjectAdapter();
			}
			@Override
			public Adapter caseM_BusValue(M_BusValue object) {
				return createM_BusValueAdapter();
			}
			@Override
			public Adapter caseM_BusProfileGeneric(M_BusProfileGeneric object) {
				return createM_BusProfileGenericAdapter();
			}
			@Override
			public Adapter caseM_BusDisconnectControl(M_BusDisconnectControl object) {
				return createM_BusDisconnectControlAdapter();
			}
			@Override
			public Adapter caseM_BusControlLog(M_BusControlLog object) {
				return createM_BusControlLogAdapter();
			}
			@Override
			public Adapter caseM_BusMasterPortSetupObject(M_BusMasterPortSetupObject object) {
				return createM_BusMasterPortSetupObjectAdapter();
			}
			@Override
			public Adapter caseWirelessModeQChannelObject(WirelessModeQChannelObject object) {
				return createWirelessModeQChannelObjectAdapter();
			}
			@Override
			public Adapter caseDLMS_COSEMServerM_BusPortSetupObject(DLMS_COSEMServerM_BusPortSetupObject object) {
				return createDLMS_COSEMServerM_BusPortSetupObjectAdapter();
			}
			@Override
			public Adapter caseM_BusDiagnosticObject(M_BusDiagnosticObject object) {
				return createM_BusDiagnosticObjectAdapter();
			}
			@Override
			public Adapter caseTCP_UDPSetupObject(TCP_UDPSetupObject object) {
				return createTCP_UDPSetupObjectAdapter();
			}
			@Override
			public Adapter caseIPv4SetupObject(IPv4SetupObject object) {
				return createIPv4SetupObjectAdapter();
			}
			@Override
			public Adapter caseMACAddressSetupObject(MACAddressSetupObject object) {
				return createMACAddressSetupObjectAdapter();
			}
			@Override
			public Adapter casePPPSetupObject(PPPSetupObject object) {
				return createPPPSetupObjectAdapter();
			}
			@Override
			public Adapter caseGPRSModemSetupObject(GPRSModemSetupObject object) {
				return createGPRSModemSetupObjectAdapter();
			}
			@Override
			public Adapter caseSMTPSetupObject(SMTPSetupObject object) {
				return createSMTPSetupObjectAdapter();
			}
			@Override
			public Adapter caseGSMDiagnosticObject(GSMDiagnosticObject object) {
				return createGSMDiagnosticObjectAdapter();
			}
			@Override
			public Adapter caseIPv6SetupObject(IPv6SetupObject object) {
				return createIPv6SetupObjectAdapter();
			}
			@Override
			public Adapter casePushSetupObject(PushSetupObject object) {
				return createPushSetupObjectAdapter();
			}
			@Override
			public Adapter caseS_FSKPhy_MACSetupObject(S_FSKPhy_MACSetupObject object) {
				return createS_FSKPhy_MACSetupObjectAdapter();
			}
			@Override
			public Adapter caseS_FSKActiveInitiatorObject(S_FSKActiveInitiatorObject object) {
				return createS_FSKActiveInitiatorObjectAdapter();
			}
			@Override
			public Adapter caseS_FSKMACSynchronizationTimeouts(S_FSKMACSynchronizationTimeouts object) {
				return createS_FSKMACSynchronizationTimeoutsAdapter();
			}
			@Override
			public Adapter caseS_FSKMACCountersObject(S_FSKMACCountersObject object) {
				return createS_FSKMACCountersObjectAdapter();
			}
			@Override
			public Adapter caseIEC61334_4_32LLCSetupObject(IEC61334_4_32LLCSetupObject object) {
				return createIEC61334_4_32LLCSetupObjectAdapter();
			}
			@Override
			public Adapter caseS_FSKReportingSystemListObject(S_FSKReportingSystemListObject object) {
				return createS_FSKReportingSystemListObjectAdapter();
			}
			@Override
			public Adapter caseISO_IEC8802_2LLCType1SetupObject(ISO_IEC8802_2LLCType1SetupObject object) {
				return createISO_IEC8802_2LLCType1SetupObjectAdapter();
			}
			@Override
			public Adapter caseISO_IEC8802_2LLCType2Setup(ISO_IEC8802_2LLCType2Setup object) {
				return createISO_IEC8802_2LLCType2SetupAdapter();
			}
			@Override
			public Adapter caseISO_IEC8802_2LLCType3Setup(ISO_IEC8802_2LLCType3Setup object) {
				return createISO_IEC8802_2LLCType3SetupAdapter();
			}
			@Override
			public Adapter caset61334_4_32LLCSSCSsetupobject(t61334_4_32LLCSSCSsetupobject object) {
				return createt61334_4_32LLCSSCSsetupobjectAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_Physical_layer_counters_object(PRIME_NB_OFDM_PLC_Physical_layer_counters_object object) {
				return createPRIME_NB_OFDM_PLC_Physical_layer_counters_objectAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MAC_setup_object(PRIME_NB_OFDM_PLC_MAC_setup_object object) {
				return createPRIME_NB_OFDM_PLC_MAC_setup_objectAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MAC_functional_parameters_object(PRIME_NB_OFDM_PLC_MAC_functional_parameters_object object) {
				return createPRIME_NB_OFDM_PLC_MAC_functional_parameters_objectAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MAC_counters_object(PRIME_NB_OFDM_PLC_MAC_counters_object object) {
				return createPRIME_NB_OFDM_PLC_MAC_counters_objectAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MAC_network_administration_data_object(PRIME_NB_OFDM_PLC_MAC_network_administration_data_object object) {
				return createPRIME_NB_OFDM_PLC_MAC_network_administration_data_objectAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MAC_address_setup(PRIME_NB_OFDM_PLC_MAC_address_setup object) {
				return createPRIME_NB_OFDM_PLC_MAC_address_setupAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_Application_identification_object(PRIME_NB_OFDM_PLC_Application_identification_object object) {
				return createPRIME_NB_OFDM_PLC_Application_identification_objectAdapter();
			}
			@Override
			public Adapter caseG3_PLC_MAC_layer_counters_object(G3_PLC_MAC_layer_counters_object object) {
				return createG3_PLC_MAC_layer_counters_objectAdapter();
			}
			@Override
			public Adapter caseG3_PLC_MAC_setup_object(G3_PLC_MAC_setup_object object) {
				return createG3_PLC_MAC_setup_objectAdapter();
			}
			@Override
			public Adapter caseG3_PLC_6LoWPAN_adaptation_layer_setup_object(G3_PLC_6LoWPAN_adaptation_layer_setup_object object) {
				return createG3_PLC_6LoWPAN_adaptation_layer_setup_objectAdapter();
			}
			@Override
			public Adapter caseZigBee_SAS_startup_object(ZigBee_SAS_startup_object object) {
				return createZigBee_SAS_startup_objectAdapter();
			}
			@Override
			public Adapter caseZigBee_SAS_join_object(ZigBee_SAS_join_object object) {
				return createZigBee_SAS_join_objectAdapter();
			}
			@Override
			public Adapter caseZigBee_SAS_APS_fragmentation_object(ZigBee_SAS_APS_fragmentation_object object) {
				return createZigBee_SAS_APS_fragmentation_objectAdapter();
			}
			@Override
			public Adapter caseZigBee_network_control_object(ZigBee_network_control_object object) {
				return createZigBee_network_control_objectAdapter();
			}
			@Override
			public Adapter caseZigBee_tunnel_setup_object(ZigBee_tunnel_setup_object object) {
				return createZigBee_tunnel_setup_objectAdapter();
			}
			@Override
			public Adapter caseCurrentAssociation(CurrentAssociation object) {
				return createCurrentAssociationAdapter();
			}
			@Override
			public Adapter caseSAPAssignmentCurrent(SAPAssignmentCurrent object) {
				return createSAPAssignmentCurrentAdapter();
			}
			@Override
			public Adapter caseSecuritySetupObject(SecuritySetupObject object) {
				return createSecuritySetupObjectAdapter();
			}
			@Override
			public Adapter caseInvocationCounter(InvocationCounter object) {
				return createInvocationCounterAdapter();
			}
			@Override
			public Adapter caseDataProtectionObject(DataProtectionObject object) {
				return createDataProtectionObjectAdapter();
			}
			@Override
			public Adapter caseImageTransferObject(ImageTransferObject object) {
				return createImageTransferObjectAdapter();
			}
			@Override
			public Adapter caseUtilitiesTableObject(UtilitiesTableObject object) {
				return createUtilitiesTableObjectAdapter();
			}
			@Override
			public Adapter caseCompactDataObject(CompactDataObject object) {
				return createCompactDataObjectAdapter();
			}
			@Override
			public Adapter caseDeviceID(DeviceID object) {
				return createDeviceIDAdapter();
			}
			@Override
			public Adapter caseMeteringPointID(MeteringPointID object) {
				return createMeteringPointIDAdapter();
			}
			@Override
			public Adapter caseParameterChangesObject(ParameterChangesObject object) {
				return createParameterChangesObjectAdapter();
			}
			@Override
			public Adapter caseI_O_control_signal_objects_contentsmanufacturerspecific(I_O_control_signal_objects_contentsmanufacturerspecific object) {
				return createI_O_control_signal_objects_contentsmanufacturerspecificAdapter();
			}
			@Override
			public Adapter caseI_O_control_signal_objects_contentsmappedtoareferencetable(I_O_control_signal_objects_contentsmappedtoareferencetable object) {
				return createI_O_control_signal_objects_contentsmappedtoareferencetableAdapter();
			}
			@Override
			public Adapter caseI_O_control_signal_objects_global(I_O_control_signal_objects_global object) {
				return createI_O_control_signal_objects_globalAdapter();
			}
			@Override
			public Adapter caseIOControlSignalsManufacturer(IOControlSignalsManufacturer object) {
				return createIOControlSignalsManufacturerAdapter();
			}
			@Override
			public Adapter caseIOControlSignalsMapped(IOControlSignalsMapped object) {
				return createIOControlSignalsMappedAdapter();
			}
			@Override
			public Adapter caseIOControlSignalsGlobal(IOControlSignalsGlobal object) {
				return createIOControlSignalsGlobalAdapter();
			}
			@Override
			public Adapter caseDisconnectControlObject(DisconnectControlObject object) {
				return createDisconnectControlObjectAdapter();
			}
			@Override
			public Adapter caseGeneralPurposeArbitrator(GeneralPurposeArbitrator object) {
				return createGeneralPurposeArbitratorAdapter();
			}
			@Override
			public Adapter caseInternalControlManu(InternalControlManu object) {
				return createInternalControlManuAdapter();
			}
			@Override
			public Adapter caseInternalControlMapped(InternalControlMapped object) {
				return createInternalControlMappedAdapter();
			}
			@Override
			public Adapter caseInternalControlGlobal(InternalControlGlobal object) {
				return createInternalControlGlobalAdapter();
			}
			@Override
			public Adapter caseInternalOperatingStatusManu(InternalOperatingStatusManu object) {
				return createInternalOperatingStatusManuAdapter();
			}
			@Override
			public Adapter caseInternalOperatingStatusMapped(InternalOperatingStatusMapped object) {
				return createInternalOperatingStatusMappedAdapter();
			}
			@Override
			public Adapter caseInternalOperatingStatusGlobal(InternalOperatingStatusGlobal object) {
				return createInternalOperatingStatusGlobalAdapter();
			}
			@Override
			public Adapter caseStatusRegisterManu(StatusRegisterManu object) {
				return createStatusRegisterManuAdapter();
			}
			@Override
			public Adapter caseStatusRegisterMapped(StatusRegisterMapped object) {
				return createStatusRegisterMappedAdapter();
			}
			@Override
			public Adapter caseErrorRegisterObject(ErrorRegisterObject object) {
				return createErrorRegisterObjectAdapter();
			}
			@Override
			public Adapter caseErrorProfileObject(ErrorProfileObject object) {
				return createErrorProfileObjectAdapter();
			}
			@Override
			public Adapter caseErrorTableObject(ErrorTableObject object) {
				return createErrorTableObjectAdapter();
			}
			@Override
			public Adapter caseAlarmRegisterObject(AlarmRegisterObject object) {
				return createAlarmRegisterObjectAdapter();
			}
			@Override
			public Adapter caseAlarmFilterObject(AlarmFilterObject object) {
				return createAlarmFilterObjectAdapter();
			}
			@Override
			public Adapter caseAlarmDescriptorObject(AlarmDescriptorObject object) {
				return createAlarmDescriptorObjectAdapter();
			}
			@Override
			public Adapter caseEventLog(EventLog object) {
				return createEventLogAdapter();
			}
			@Override
			public Adapter caseElectricityID(ElectricityID object) {
				return createElectricityIDAdapter();
			}
			@Override
			public Adapter caseElectricityProgramEntries(ElectricityProgramEntries object) {
				return createElectricityProgramEntriesAdapter();
			}
			@Override
			public Adapter caseOutputPulseValues_constants(OutputPulseValues_constants object) {
				return createOutputPulseValues_constantsAdapter();
			}
			@Override
			public Adapter caseReadingFactorAndCT_VTratio(ReadingFactorAndCT_VTratio object) {
				return createReadingFactorAndCT_VTratioAdapter();
			}
			@Override
			public Adapter caseElectricityNominalValues(ElectricityNominalValues object) {
				return createElectricityNominalValuesAdapter();
			}
			@Override
			public Adapter caseInputPulseValuesOrConstants(InputPulseValuesOrConstants object) {
				return createInputPulseValuesOrConstantsAdapter();
			}
			@Override
			public Adapter caseMeasurementPeriod_recordingInterval_billingPeriodDuration(MeasurementPeriod_recordingInterval_billingPeriodDuration object) {
				return createMeasurementPeriod_recordingInterval_billingPeriodDurationAdapter();
			}
			@Override
			public Adapter caseElectricityTimeEntries(ElectricityTimeEntries object) {
				return createElectricityTimeEntriesAdapter();
			}
			@Override
			public Adapter caseCoefficients(Coefficients object) {
				return createCoefficientsAdapter();
			}
			@Override
			public Adapter caseMeasurementMethods(MeasurementMethods object) {
				return createMeasurementMethodsAdapter();
			}
			@Override
			public Adapter caseElectricityMeteringPointID(ElectricityMeteringPointID object) {
				return createElectricityMeteringPointIDAdapter();
			}
			@Override
			public Adapter caseElectricityRelatedStatusData(ElectricityRelatedStatusData object) {
				return createElectricityRelatedStatusDataAdapter();
			}
			@Override
			public Adapter caseElectricityRelatedStatusDataMapped(ElectricityRelatedStatusDataMapped object) {
				return createElectricityRelatedStatusDataMappedAdapter();
			}
			@Override
			public Adapter caseBatteryEntries(BatteryEntries object) {
				return createBatteryEntriesAdapter();
			}
			@Override
			public Adapter casePowerFailureMonitoring(PowerFailureMonitoring object) {
				return createPowerFailureMonitoringAdapter();
			}
			@Override
			public Adapter caseOperatingTime(OperatingTime object) {
				return createOperatingTimeAdapter();
			}
			@Override
			public Adapter caseEnvironmentRelatedParameters(EnvironmentRelatedParameters object) {
				return createEnvironmentRelatedParametersAdapter();
			}
			@Override
			public Adapter caseStatusRegister(StatusRegister object) {
				return createStatusRegisterAdapter();
			}
			@Override
			public Adapter caseEventCode(EventCode object) {
				return createEventCodeAdapter();
			}
			@Override
			public Adapter caseCommunicationPortLogParameters(CommunicationPortLogParameters object) {
				return createCommunicationPortLogParametersAdapter();
			}
			@Override
			public Adapter caseConsumerMessage(ConsumerMessage object) {
				return createConsumerMessageAdapter();
			}
			@Override
			public Adapter caseCurrentlyActiveTariff(CurrentlyActiveTariff object) {
				return createCurrentlyActiveTariffAdapter();
			}
			@Override
			public Adapter caseEventCounterObject(EventCounterObject object) {
				return createEventCounterObjectAdapter();
			}
			@Override
			public Adapter caseProfileEntryDigitalSignatureObject(ProfileEntryDigitalSignatureObject object) {
				return createProfileEntryDigitalSignatureObjectAdapter();
			}
			@Override
			public Adapter caseMeterTemperEventRelatedObject(MeterTemperEventRelatedObject object) {
				return createMeterTemperEventRelatedObjectAdapter();
			}
			@Override
			public Adapter caseElectricityValues(ElectricityValues object) {
				return createElectricityValuesAdapter();
			}
			@Override
			public Adapter caseMeasurementValues(MeasurementValues object) {
				return createMeasurementValuesAdapter();
			}
			@Override
			public Adapter caseElectricityHarmonics(ElectricityHarmonics object) {
				return createElectricityHarmonicsAdapter();
			}
			@Override
			public Adapter caseExtendedPhaseAngleMeasurement(ExtendedPhaseAngleMeasurement object) {
				return createExtendedPhaseAngleMeasurementAdapter();
			}
			@Override
			public Adapter caseTransformerAndLineLosses(TransformerAndLineLosses object) {
				return createTransformerAndLineLossesAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseModemconfiguration(Modemconfiguration object) {
				return createModemconfigurationAdapter();
			}
			@Override
			public Adapter caseAuto_connect(Auto_connect object) {
				return createAuto_connectAdapter();
			}
			@Override
			public Adapter caseAuto_answer(Auto_answer object) {
				return createAuto_answerAdapter();
			}
			@Override
			public Adapter caseScripttable(Scripttable object) {
				return createScripttableAdapter();
			}
			@Override
			public Adapter caseSpecialdaystable(Specialdaystable object) {
				return createSpecialdaystableAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseActivitycalendar(Activitycalendar object) {
				return createActivitycalendarAdapter();
			}
			@Override
			public Adapter caseRegisterActivation(RegisterActivation object) {
				return createRegisterActivationAdapter();
			}
			@Override
			public Adapter caseSingleactionschedule(Singleactionschedule object) {
				return createSingleactionscheduleAdapter();
			}
			@Override
			public Adapter caseRegistermonitor(Registermonitor object) {
				return createRegistermonitorAdapter();
			}
			@Override
			public Adapter caseParametermonitor(Parametermonitor object) {
				return createParametermonitorAdapter();
			}
			@Override
			public Adapter caseLimiter(Limiter object) {
				return createLimiterAdapter();
			}
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseCredit(Credit object) {
				return createCreditAdapter();
			}
			@Override
			public Adapter caseCharge(Charge object) {
				return createChargeAdapter();
			}
			@Override
			public Adapter caseTokengateway(Tokengateway object) {
				return createTokengatewayAdapter();
			}
			@Override
			public Adapter caseIEC_local_port_setup(IEC_local_port_setup object) {
				return createIEC_local_port_setupAdapter();
			}
			@Override
			public Adapter caseProfilegeneric(Profilegeneric object) {
				return createProfilegenericAdapter();
			}
			@Override
			public Adapter caseIEC_HDLC_setup(IEC_HDLC_setup object) {
				return createIEC_HDLC_setupAdapter();
			}
			@Override
			public Adapter caseIEC_twisted_pair_setup(IEC_twisted_pair_setup object) {
				return createIEC_twisted_pair_setupAdapter();
			}
			@Override
			public Adapter caseMACaddresssetup(MACaddresssetup object) {
				return createMACaddresssetupAdapter();
			}
			@Override
			public Adapter caseM_Bus_slave_port_setup(M_Bus_slave_port_setup object) {
				return createM_Bus_slave_port_setupAdapter();
			}
			@Override
			public Adapter caseM_Bus_client(M_Bus_client object) {
				return createM_Bus_clientAdapter();
			}
			@Override
			public Adapter caseRegister(Register object) {
				return createRegisterAdapter();
			}
			@Override
			public Adapter caseExtendedRegister(ExtendedRegister object) {
				return createExtendedRegisterAdapter();
			}
			@Override
			public Adapter caseInterfaceClasses_DisconnectControl(gluemodel.COSEM.InterfaceClasses.DisconnectControl object) {
				return createInterfaceClasses_DisconnectControlAdapter();
			}
			@Override
			public Adapter caseM_Bus_master_port_setup(M_Bus_master_port_setup object) {
				return createM_Bus_master_port_setupAdapter();
			}
			@Override
			public Adapter caseWireless_Mode_Q_Channel(Wireless_Mode_Q_Channel object) {
				return createWireless_Mode_Q_ChannelAdapter();
			}
			@Override
			public Adapter caseDLMS_COSEM_Server_M_Bus_port_setup(DLMS_COSEM_Server_M_Bus_port_setup object) {
				return createDLMS_COSEM_Server_M_Bus_port_setupAdapter();
			}
			@Override
			public Adapter caseM_Bus_diagnostic(M_Bus_diagnostic object) {
				return createM_Bus_diagnosticAdapter();
			}
			@Override
			public Adapter caseTCP_UDPsetup(TCP_UDPsetup object) {
				return createTCP_UDPsetupAdapter();
			}
			@Override
			public Adapter caseIPv4setup(IPv4setup object) {
				return createIPv4setupAdapter();
			}
			@Override
			public Adapter casePPPsetup(PPPsetup object) {
				return createPPPsetupAdapter();
			}
			@Override
			public Adapter caseGPRS_modem_setup(GPRS_modem_setup object) {
				return createGPRS_modem_setupAdapter();
			}
			@Override
			public Adapter caseSMTPsetup(SMTPsetup object) {
				return createSMTPsetupAdapter();
			}
			@Override
			public Adapter caseGSM_Diagnostic(GSM_Diagnostic object) {
				return createGSM_DiagnosticAdapter();
			}
			@Override
			public Adapter caseIPv6setup(IPv6setup object) {
				return createIPv6setupAdapter();
			}
			@Override
			public Adapter casePushsetup(Pushsetup object) {
				return createPushsetupAdapter();
			}
			@Override
			public Adapter caseS_FSK_PHY_MACsetup(S_FSK_PHY_MACsetup object) {
				return createS_FSK_PHY_MACsetupAdapter();
			}
			@Override
			public Adapter caseS_FSKActiveinitiator(S_FSKActiveinitiator object) {
				return createS_FSKActiveinitiatorAdapter();
			}
			@Override
			public Adapter caseS_FSKMACsynctimeouts(S_FSKMACsynctimeouts object) {
				return createS_FSKMACsynctimeoutsAdapter();
			}
			@Override
			public Adapter caseS_FSKMACcounters(S_FSKMACcounters object) {
				return createS_FSKMACcountersAdapter();
			}
			@Override
			public Adapter caseIEC61334_4_32LLCsetup(IEC61334_4_32LLCsetup object) {
				return createIEC61334_4_32LLCsetupAdapter();
			}
			@Override
			public Adapter caseS_FSKReportingsystemlist(S_FSKReportingsystemlist object) {
				return createS_FSKReportingsystemlistAdapter();
			}
			@Override
			public Adapter caseIEC_8802_2_LLC_Type_1(IEC_8802_2_LLC_Type_1 object) {
				return createIEC_8802_2_LLC_Type_1Adapter();
			}
			@Override
			public Adapter caseIEC_8802_2_LLC_G3_NB(IEC_8802_2_LLC_G3_NB object) {
				return createIEC_8802_2_LLC_G3_NBAdapter();
			}
			@Override
			public Adapter caseIEC8802_2LLCType3(IEC8802_2LLCType3 object) {
				return createIEC8802_2LLCType3Adapter();
			}
			@Override
			public Adapter caset61334_32_LLC_SSCS_setup(t61334_32_LLC_SSCS_setup object) {
				return createt61334_32_LLC_SSCS_setupAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_Phy_layer_counters(PRIME_NB_OFDM_PLC_Phy_layer_counters object) {
				return createPRIME_NB_OFDM_PLC_Phy_layer_countersAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MACsetup(PRIME_NB_OFDM_PLC_MACsetup object) {
				return createPRIME_NB_OFDM_PLC_MACsetupAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MAC_functionalparams(PRIME_NB_OFDM_PLC_MAC_functionalparams object) {
				return createPRIME_NB_OFDM_PLC_MAC_functionalparamsAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MAC_counters(PRIME_NB_OFDM_PLC_MAC_counters object) {
				return createPRIME_NB_OFDM_PLC_MAC_countersAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MACnetworkadmindata(PRIME_NB_OFDM_PLC_MACnetworkadmindata object) {
				return createPRIME_NB_OFDM_PLC_MACnetworkadmindataAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_Application_identification(PRIME_NB_OFDM_PLC_Application_identification object) {
				return createPRIME_NB_OFDM_PLC_Application_identificationAdapter();
			}
			@Override
			public Adapter caseG3_PLC_MAC_layer_counters(G3_PLC_MAC_layer_counters object) {
				return createG3_PLC_MAC_layer_countersAdapter();
			}
			@Override
			public Adapter caseG3_PLC_MAC_setup(G3_PLC_MAC_setup object) {
				return createG3_PLC_MAC_setupAdapter();
			}
			@Override
			public Adapter caseG3_PLC_6LoWPAN(G3_PLC_6LoWPAN object) {
				return createG3_PLC_6LoWPANAdapter();
			}
			@Override
			public Adapter caseZigBee_SAS_startup(ZigBee_SAS_startup object) {
				return createZigBee_SAS_startupAdapter();
			}
			@Override
			public Adapter caseZigBee_SAS_join(ZigBee_SAS_join object) {
				return createZigBee_SAS_joinAdapter();
			}
			@Override
			public Adapter caseZigBee_SAS_APS_fragmentation(ZigBee_SAS_APS_fragmentation object) {
				return createZigBee_SAS_APS_fragmentationAdapter();
			}
			@Override
			public Adapter caseZigBeenetworkcontrol(ZigBeenetworkcontrol object) {
				return createZigBeenetworkcontrolAdapter();
			}
			@Override
			public Adapter caseZigBeetunnelsetup(ZigBeetunnelsetup object) {
				return createZigBeetunnelsetupAdapter();
			}
			@Override
			public Adapter caseAssociationLN(AssociationLN object) {
				return createAssociationLNAdapter();
			}
			@Override
			public Adapter caseSAPAssignment(SAPAssignment object) {
				return createSAPAssignmentAdapter();
			}
			@Override
			public Adapter caseSecuritysetup(Securitysetup object) {
				return createSecuritysetupAdapter();
			}
			@Override
			public Adapter caseDataprotection(Dataprotection object) {
				return createDataprotectionAdapter();
			}
			@Override
			public Adapter caseImagetransfer(Imagetransfer object) {
				return createImagetransferAdapter();
			}
			@Override
			public Adapter caseUtilitytables(Utilitytables object) {
				return createUtilitytablesAdapter();
			}
			@Override
			public Adapter caseCompactdata(Compactdata object) {
				return createCompactdataAdapter();
			}
			@Override
			public Adapter caseStatusmapping(Statusmapping object) {
				return createStatusmappingAdapter();
			}
			@Override
			public Adapter caseArbitrator(Arbitrator object) {
				return createArbitratorAdapter();
			}
			@Override
			public Adapter caseRegistertable(Registertable object) {
				return createRegistertableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ProgramEntries <em>Program Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ProgramEntries
	 * @generated
	 */
	public Adapter createProgramEntriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.BillingPeriodValues <em>Billing Period Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.BillingPeriodValues
	 * @generated
	 */
	public Adapter createBillingPeriodValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.TimeEntries <em>Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.TimeEntries
	 * @generated
	 */
	public Adapter createTimeEntriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.UNIXClock <em>UNIX Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.UNIXClock
	 * @generated
	 */
	public Adapter createUNIXClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ModemConfigurationObject <em>Modem Configuration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ModemConfigurationObject
	 * @generated
	 */
	public Adapter createModemConfigurationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.AutoConnectObject <em>Auto Connect Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.AutoConnectObject
	 * @generated
	 */
	public Adapter createAutoConnectObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.AutoAnswerObject <em>Auto Answer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.AutoAnswerObject
	 * @generated
	 */
	public Adapter createAutoAnswerObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ScriptTable <em>Script Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ScriptTable
	 * @generated
	 */
	public Adapter createScriptTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.GlobalMeterReset <em>Global Meter Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.GlobalMeterReset
	 * @generated
	 */
	public Adapter createGlobalMeterResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MDIReset <em>MDI Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MDIReset
	 * @generated
	 */
	public Adapter createMDIResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.Tariffication <em>Tariffication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.Tariffication
	 * @generated
	 */
	public Adapter createTarifficationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ActivateTestMode <em>Activate Test Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ActivateTestMode
	 * @generated
	 */
	public Adapter createActivateTestModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ActivateNormalMode <em>Activate Normal Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ActivateNormalMode
	 * @generated
	 */
	public Adapter createActivateNormalModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.SetOutputSignal <em>Set Output Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.SetOutputSignal
	 * @generated
	 */
	public Adapter createSetOutputSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.SwitchOpticalTestOutput <em>Switch Optical Test Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.SwitchOpticalTestOutput
	 * @generated
	 */
	public Adapter createSwitchOpticalTestOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PowerQualityMeasurementManagement <em>Power Quality Measurement Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PowerQualityMeasurementManagement
	 * @generated
	 */
	public Adapter createPowerQualityMeasurementManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.DisconnectControl <em>Disconnect Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.DisconnectControl
	 * @generated
	 */
	public Adapter createDisconnectControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ImageActivation <em>Image Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ImageActivation
	 * @generated
	 */
	public Adapter createImageActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.Push
	 * @generated
	 */
	public Adapter createPushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.Broadcast <em>Broadcast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.Broadcast
	 * @generated
	 */
	public Adapter createBroadcastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.SpecialDays <em>Special Days</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.SpecialDays
	 * @generated
	 */
	public Adapter createSpecialDaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ScheduleObject <em>Schedule Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ScheduleObject
	 * @generated
	 */
	public Adapter createScheduleObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ActivityCalendarObject <em>Activity Calendar Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ActivityCalendarObject
	 * @generated
	 */
	public Adapter createActivityCalendarObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.RegisterActivationObject <em>Register Activation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.RegisterActivationObject
	 * @generated
	 */
	public Adapter createRegisterActivationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject <em>Single Action Schedule Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.SingleActionScheduleObject
	 * @generated
	 */
	public Adapter createSingleActionScheduleObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.DisconnectControlSchedule <em>Disconnect Control Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.DisconnectControlSchedule
	 * @generated
	 */
	public Adapter createDisconnectControlScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.EndOfBillingPeriodSchedule <em>End Of Billing Period Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.EndOfBillingPeriodSchedule
	 * @generated
	 */
	public Adapter createEndOfBillingPeriodScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ImageActivationSchedule <em>Image Activation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ImageActivationSchedule
	 * @generated
	 */
	public Adapter createImageActivationScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.OutputControlSchedule <em>Output Control Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.OutputControlSchedule
	 * @generated
	 */
	public Adapter createOutputControlScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PushSchedule <em>Push Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PushSchedule
	 * @generated
	 */
	public Adapter createPushScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.RegisterMonitorObject <em>Register Monitor Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.RegisterMonitorObject
	 * @generated
	 */
	public Adapter createRegisterMonitorObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.AlarmMonitor <em>Alarm Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmMonitor
	 * @generated
	 */
	public Adapter createAlarmMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ParameterMonitorObject <em>Parameter Monitor Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterMonitorObject
	 * @generated
	 */
	public Adapter createParameterMonitorObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.LimiterObject <em>Limiter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.LimiterObject
	 * @generated
	 */
	public Adapter createLimiterObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.AccountObject <em>Account Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.AccountObject
	 * @generated
	 */
	public Adapter createAccountObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.CreditObject <em>Credit Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.CreditObject
	 * @generated
	 */
	public Adapter createCreditObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ChargeObject <em>Charge Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ChargeObject
	 * @generated
	 */
	public Adapter createChargeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.TokenGatewayObject <em>Token Gateway Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.TokenGatewayObject
	 * @generated
	 */
	public Adapter createTokenGatewayObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MaxCreditLimit <em>Max Credit Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MaxCreditLimit
	 * @generated
	 */
	public Adapter createMaxCreditLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MaxVendLimit <em>Max Vend Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MaxVendLimit
	 * @generated
	 */
	public Adapter createMaxVendLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IECOpticalPortSetup <em>IEC Optical Port Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IECOpticalPortSetup
	 * @generated
	 */
	public Adapter createIECOpticalPortSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IECElectricalPortSetup <em>IEC Electrical Port Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IECElectricalPortSetup
	 * @generated
	 */
	public Adapter createIECElectricalPortSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.StandardReadout <em>Standard Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadout
	 * @generated
	 */
	public Adapter createStandardReadoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.StandardReadoutParam <em>Standard Readout Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.StandardReadoutParam
	 * @generated
	 */
	public Adapter createStandardReadoutParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IECHDLCSetupObject <em>IECHDLC Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IECHDLCSetupObject
	 * @generated
	 */
	public Adapter createIECHDLCSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IECTwistedPairSetupObject <em>IEC Twisted Pair Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IECTwistedPairSetupObject
	 * @generated
	 */
	public Adapter createIECTwistedPairSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IECTwistedPairMACAddressSetup <em>IEC Twisted Pair MAC Address Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IECTwistedPairMACAddressSetup
	 * @generated
	 */
	public Adapter createIECTwistedPairMACAddressSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IECTwistedPairFatalErrorRegister <em>IEC Twisted Pair Fatal Error Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IECTwistedPairFatalErrorRegister
	 * @generated
	 */
	public Adapter createIECTwistedPairFatalErrorRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IEC62056_3_1ShortReadout <em>IEC62056 31Short Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IEC62056_3_1ShortReadout
	 * @generated
	 */
	public Adapter createIEC62056_3_1ShortReadoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IEC62056_3_1LongReadout <em>IEC62056 31Long Readout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IEC62056_3_1LongReadout
	 * @generated
	 */
	public Adapter createIEC62056_3_1LongReadoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IEC_62056_3_1AlternateReadoutProfile <em>IEC 62056 31Alternate Readout Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IEC_62056_3_1AlternateReadoutProfile
	 * @generated
	 */
	public Adapter createIEC_62056_3_1AlternateReadoutProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.M_BusSlavePortSetupObject <em>MBus Slave Port Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusSlavePortSetupObject
	 * @generated
	 */
	public Adapter createM_BusSlavePortSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.M_BusClientObject <em>MBus Client Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusClientObject
	 * @generated
	 */
	public Adapter createM_BusClientObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.M_BusValue <em>MBus Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusValue
	 * @generated
	 */
	public Adapter createM_BusValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.M_BusProfileGeneric <em>MBus Profile Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusProfileGeneric
	 * @generated
	 */
	public Adapter createM_BusProfileGenericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.M_BusDisconnectControl <em>MBus Disconnect Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusDisconnectControl
	 * @generated
	 */
	public Adapter createM_BusDisconnectControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.M_BusControlLog <em>MBus Control Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusControlLog
	 * @generated
	 */
	public Adapter createM_BusControlLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.M_BusMasterPortSetupObject <em>MBus Master Port Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusMasterPortSetupObject
	 * @generated
	 */
	public Adapter createM_BusMasterPortSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.WirelessModeQChannelObject <em>Wireless Mode QChannel Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.WirelessModeQChannelObject
	 * @generated
	 */
	public Adapter createWirelessModeQChannelObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.DLMS_COSEMServerM_BusPortSetupObject <em>DLMS COSEM Server MBus Port Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.DLMS_COSEMServerM_BusPortSetupObject
	 * @generated
	 */
	public Adapter createDLMS_COSEMServerM_BusPortSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.M_BusDiagnosticObject <em>MBus Diagnostic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.M_BusDiagnosticObject
	 * @generated
	 */
	public Adapter createM_BusDiagnosticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.TCP_UDPSetupObject <em>TCP UDP Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.TCP_UDPSetupObject
	 * @generated
	 */
	public Adapter createTCP_UDPSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IPv4SetupObject <em>IPv4 Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IPv4SetupObject
	 * @generated
	 */
	public Adapter createIPv4SetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MACAddressSetupObject <em>MAC Address Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MACAddressSetupObject
	 * @generated
	 */
	public Adapter createMACAddressSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PPPSetupObject <em>PPP Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PPPSetupObject
	 * @generated
	 */
	public Adapter createPPPSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.GPRSModemSetupObject <em>GPRS Modem Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.GPRSModemSetupObject
	 * @generated
	 */
	public Adapter createGPRSModemSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.SMTPSetupObject <em>SMTP Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.SMTPSetupObject
	 * @generated
	 */
	public Adapter createSMTPSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.GSMDiagnosticObject <em>GSM Diagnostic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.GSMDiagnosticObject
	 * @generated
	 */
	public Adapter createGSMDiagnosticObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IPv6SetupObject <em>IPv6 Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IPv6SetupObject
	 * @generated
	 */
	public Adapter createIPv6SetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PushSetupObject <em>Push Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PushSetupObject
	 * @generated
	 */
	public Adapter createPushSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.S_FSKPhy_MACSetupObject <em>SFSK Phy MAC Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKPhy_MACSetupObject
	 * @generated
	 */
	public Adapter createS_FSKPhy_MACSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.S_FSKActiveInitiatorObject <em>SFSK Active Initiator Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKActiveInitiatorObject
	 * @generated
	 */
	public Adapter createS_FSKActiveInitiatorObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.S_FSKMACSynchronizationTimeouts <em>SFSKMAC Synchronization Timeouts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKMACSynchronizationTimeouts
	 * @generated
	 */
	public Adapter createS_FSKMACSynchronizationTimeoutsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.S_FSKMACCountersObject <em>SFSKMAC Counters Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKMACCountersObject
	 * @generated
	 */
	public Adapter createS_FSKMACCountersObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IEC61334_4_32LLCSetupObject <em>IEC61334 432LLC Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IEC61334_4_32LLCSetupObject
	 * @generated
	 */
	public Adapter createIEC61334_4_32LLCSetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.S_FSKReportingSystemListObject <em>SFSK Reporting System List Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.S_FSKReportingSystemListObject
	 * @generated
	 */
	public Adapter createS_FSKReportingSystemListObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType1SetupObject <em>ISO IEC8802 2LLC Type1 Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType1SetupObject
	 * @generated
	 */
	public Adapter createISO_IEC8802_2LLCType1SetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType2Setup <em>ISO IEC8802 2LLC Type2 Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType2Setup
	 * @generated
	 */
	public Adapter createISO_IEC8802_2LLCType2SetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType3Setup <em>ISO IEC8802 2LLC Type3 Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ISO_IEC8802_2LLCType3Setup
	 * @generated
	 */
	public Adapter createISO_IEC8802_2LLCType3SetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.t61334_4_32LLCSSCSsetupobject <em>t61334 432LLCSSC Ssetupobject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.t61334_4_32LLCSSCSsetupobject
	 * @generated
	 */
	public Adapter createt61334_4_32LLCSSCSsetupobjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_Physical_layer_counters_object <em>PRIME NB OFDM PLC Physical layer counters object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_Physical_layer_counters_object
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_Physical_layer_counters_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_setup_object <em>PRIME NB OFDM PLC MAC setup object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_setup_object
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MAC_setup_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_functional_parameters_object <em>PRIME NB OFDM PLC MAC functional parameters object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_functional_parameters_object
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MAC_functional_parameters_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_counters_object <em>PRIME NB OFDM PLC MAC counters object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_counters_object
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MAC_counters_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_network_administration_data_object <em>PRIME NB OFDM PLC MAC network administration data object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_network_administration_data_object
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MAC_network_administration_data_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_address_setup <em>PRIME NB OFDM PLC MAC address setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_MAC_address_setup
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MAC_address_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_Application_identification_object <em>PRIME NB OFDM PLC Application identification object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PRIME_NB_OFDM_PLC_Application_identification_object
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_Application_identification_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.G3_PLC_MAC_layer_counters_object <em>G3 PLC MAC layer counters object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.G3_PLC_MAC_layer_counters_object
	 * @generated
	 */
	public Adapter createG3_PLC_MAC_layer_counters_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.G3_PLC_MAC_setup_object <em>G3 PLC MAC setup object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.G3_PLC_MAC_setup_object
	 * @generated
	 */
	public Adapter createG3_PLC_MAC_setup_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.G3_PLC_6LoWPAN_adaptation_layer_setup_object <em>G3 PLC 6Lo WPAN adaptation layer setup object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.G3_PLC_6LoWPAN_adaptation_layer_setup_object
	 * @generated
	 */
	public Adapter createG3_PLC_6LoWPAN_adaptation_layer_setup_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_SAS_startup_object <em>Zig Bee SAS startup object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_SAS_startup_object
	 * @generated
	 */
	public Adapter createZigBee_SAS_startup_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_SAS_join_object <em>Zig Bee SAS join object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_SAS_join_object
	 * @generated
	 */
	public Adapter createZigBee_SAS_join_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_SAS_APS_fragmentation_object <em>Zig Bee SAS APS fragmentation object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_SAS_APS_fragmentation_object
	 * @generated
	 */
	public Adapter createZigBee_SAS_APS_fragmentation_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_network_control_object <em>Zig Bee network control object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_network_control_object
	 * @generated
	 */
	public Adapter createZigBee_network_control_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ZigBee_tunnel_setup_object <em>Zig Bee tunnel setup object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ZigBee_tunnel_setup_object
	 * @generated
	 */
	public Adapter createZigBee_tunnel_setup_objectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.CurrentAssociation <em>Current Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.CurrentAssociation
	 * @generated
	 */
	public Adapter createCurrentAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.SAPAssignmentCurrent <em>SAP Assignment Current</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.SAPAssignmentCurrent
	 * @generated
	 */
	public Adapter createSAPAssignmentCurrentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.SecuritySetupObject <em>Security Setup Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.SecuritySetupObject
	 * @generated
	 */
	public Adapter createSecuritySetupObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.InvocationCounter <em>Invocation Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.InvocationCounter
	 * @generated
	 */
	public Adapter createInvocationCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.DataProtectionObject <em>Data Protection Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.DataProtectionObject
	 * @generated
	 */
	public Adapter createDataProtectionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ImageTransferObject <em>Image Transfer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ImageTransferObject
	 * @generated
	 */
	public Adapter createImageTransferObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.UtilitiesTableObject <em>Utilities Table Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.UtilitiesTableObject
	 * @generated
	 */
	public Adapter createUtilitiesTableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.CompactDataObject <em>Compact Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.CompactDataObject
	 * @generated
	 */
	public Adapter createCompactDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.DeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.DeviceID
	 * @generated
	 */
	public Adapter createDeviceIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MeteringPointID <em>Metering Point ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MeteringPointID
	 * @generated
	 */
	public Adapter createMeteringPointIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ParameterChangesObject <em>Parameter Changes Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ParameterChangesObject
	 * @generated
	 */
	public Adapter createParameterChangesObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmanufacturerspecific <em>IOcontrol signal objects contentsmanufacturerspecific</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmanufacturerspecific
	 * @generated
	 */
	public Adapter createI_O_control_signal_objects_contentsmanufacturerspecificAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmappedtoareferencetable <em>IOcontrol signal objects contentsmappedtoareferencetable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_contentsmappedtoareferencetable
	 * @generated
	 */
	public Adapter createI_O_control_signal_objects_contentsmappedtoareferencetableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_global <em>IOcontrol signal objects global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.I_O_control_signal_objects_global
	 * @generated
	 */
	public Adapter createI_O_control_signal_objects_globalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IOControlSignalsManufacturer <em>IO Control Signals Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IOControlSignalsManufacturer
	 * @generated
	 */
	public Adapter createIOControlSignalsManufacturerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IOControlSignalsMapped <em>IO Control Signals Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IOControlSignalsMapped
	 * @generated
	 */
	public Adapter createIOControlSignalsMappedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.IOControlSignalsGlobal <em>IO Control Signals Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.IOControlSignalsGlobal
	 * @generated
	 */
	public Adapter createIOControlSignalsGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.DisconnectControlObject <em>Disconnect Control Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.DisconnectControlObject
	 * @generated
	 */
	public Adapter createDisconnectControlObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.GeneralPurposeArbitrator <em>General Purpose Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.GeneralPurposeArbitrator
	 * @generated
	 */
	public Adapter createGeneralPurposeArbitratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.InternalControlManu <em>Internal Control Manu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.InternalControlManu
	 * @generated
	 */
	public Adapter createInternalControlManuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.InternalControlMapped <em>Internal Control Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.InternalControlMapped
	 * @generated
	 */
	public Adapter createInternalControlMappedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.InternalControlGlobal <em>Internal Control Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.InternalControlGlobal
	 * @generated
	 */
	public Adapter createInternalControlGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.InternalOperatingStatusManu <em>Internal Operating Status Manu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.InternalOperatingStatusManu
	 * @generated
	 */
	public Adapter createInternalOperatingStatusManuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.InternalOperatingStatusMapped <em>Internal Operating Status Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.InternalOperatingStatusMapped
	 * @generated
	 */
	public Adapter createInternalOperatingStatusMappedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.InternalOperatingStatusGlobal <em>Internal Operating Status Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.InternalOperatingStatusGlobal
	 * @generated
	 */
	public Adapter createInternalOperatingStatusGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.StatusRegisterManu <em>Status Register Manu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.StatusRegisterManu
	 * @generated
	 */
	public Adapter createStatusRegisterManuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.StatusRegisterMapped <em>Status Register Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.StatusRegisterMapped
	 * @generated
	 */
	public Adapter createStatusRegisterMappedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ErrorRegisterObject <em>Error Register Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ErrorRegisterObject
	 * @generated
	 */
	public Adapter createErrorRegisterObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ErrorProfileObject <em>Error Profile Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ErrorProfileObject
	 * @generated
	 */
	public Adapter createErrorProfileObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ErrorTableObject <em>Error Table Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ErrorTableObject
	 * @generated
	 */
	public Adapter createErrorTableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.AlarmRegisterObject <em>Alarm Register Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmRegisterObject
	 * @generated
	 */
	public Adapter createAlarmRegisterObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.AlarmFilterObject <em>Alarm Filter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmFilterObject
	 * @generated
	 */
	public Adapter createAlarmFilterObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.AlarmDescriptorObject <em>Alarm Descriptor Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.AlarmDescriptorObject
	 * @generated
	 */
	public Adapter createAlarmDescriptorObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.EventLog <em>Event Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.EventLog
	 * @generated
	 */
	public Adapter createEventLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityID <em>Electricity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityID
	 * @generated
	 */
	public Adapter createElectricityIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries <em>Electricity Program Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityProgramEntries
	 * @generated
	 */
	public Adapter createElectricityProgramEntriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants <em>Output Pulse Values constants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.OutputPulseValues_constants
	 * @generated
	 */
	public Adapter createOutputPulseValues_constantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio <em>Reading Factor And CT VTratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ReadingFactorAndCT_VTratio
	 * @generated
	 */
	public Adapter createReadingFactorAndCT_VTratioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityNominalValues <em>Electricity Nominal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityNominalValues
	 * @generated
	 */
	public Adapter createElectricityNominalValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants <em>Input Pulse Values Or Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.InputPulseValuesOrConstants
	 * @generated
	 */
	public Adapter createInputPulseValuesOrConstantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration <em>Measurement Period recording Interval billing Period Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration
	 * @generated
	 */
	public Adapter createMeasurementPeriod_recordingInterval_billingPeriodDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries <em>Electricity Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityTimeEntries
	 * @generated
	 */
	public Adapter createElectricityTimeEntriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.Coefficients <em>Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.Coefficients
	 * @generated
	 */
	public Adapter createCoefficientsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MeasurementMethods <em>Measurement Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementMethods
	 * @generated
	 */
	public Adapter createMeasurementMethodsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityMeteringPointID <em>Electricity Metering Point ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityMeteringPointID
	 * @generated
	 */
	public Adapter createElectricityMeteringPointIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData <em>Electricity Related Status Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusData
	 * @generated
	 */
	public Adapter createElectricityRelatedStatusDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusDataMapped <em>Electricity Related Status Data Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityRelatedStatusDataMapped
	 * @generated
	 */
	public Adapter createElectricityRelatedStatusDataMappedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.BatteryEntries <em>Battery Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.BatteryEntries
	 * @generated
	 */
	public Adapter createBatteryEntriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring <em>Power Failure Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.PowerFailureMonitoring
	 * @generated
	 */
	public Adapter createPowerFailureMonitoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.OperatingTime <em>Operating Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.OperatingTime
	 * @generated
	 */
	public Adapter createOperatingTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters <em>Environment Related Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters
	 * @generated
	 */
	public Adapter createEnvironmentRelatedParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.StatusRegister <em>Status Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.StatusRegister
	 * @generated
	 */
	public Adapter createStatusRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.EventCode <em>Event Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.EventCode
	 * @generated
	 */
	public Adapter createEventCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters <em>Communication Port Log Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.CommunicationPortLogParameters
	 * @generated
	 */
	public Adapter createCommunicationPortLogParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ConsumerMessage <em>Consumer Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ConsumerMessage
	 * @generated
	 */
	public Adapter createConsumerMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.CurrentlyActiveTariff <em>Currently Active Tariff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.CurrentlyActiveTariff
	 * @generated
	 */
	public Adapter createCurrentlyActiveTariffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.EventCounterObject <em>Event Counter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.EventCounterObject
	 * @generated
	 */
	public Adapter createEventCounterObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ProfileEntryDigitalSignatureObject <em>Profile Entry Digital Signature Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ProfileEntryDigitalSignatureObject
	 * @generated
	 */
	public Adapter createProfileEntryDigitalSignatureObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject <em>Meter Temper Event Related Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MeterTemperEventRelatedObject
	 * @generated
	 */
	public Adapter createMeterTemperEventRelatedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityValues <em>Electricity Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityValues
	 * @generated
	 */
	public Adapter createElectricityValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.MeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.MeasurementValues
	 * @generated
	 */
	public Adapter createMeasurementValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ElectricityHarmonics <em>Electricity Harmonics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ElectricityHarmonics
	 * @generated
	 */
	public Adapter createElectricityHarmonicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement <em>Extended Phase Angle Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement
	 * @generated
	 */
	public Adapter createExtendedPhaseAngleMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses <em>Transformer And Line Losses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.COSEMObjects.TransformerAndLineLosses
	 * @generated
	 */
	public Adapter createTransformerAndLineLossesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Base
	 * @generated
	 */
	public Adapter createBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Modemconfiguration <em>Modemconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Modemconfiguration
	 * @generated
	 */
	public Adapter createModemconfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Auto_connect <em>Auto connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Auto_connect
	 * @generated
	 */
	public Adapter createAuto_connectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Auto_answer <em>Auto answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Auto_answer
	 * @generated
	 */
	public Adapter createAuto_answerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Scripttable <em>Scripttable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Scripttable
	 * @generated
	 */
	public Adapter createScripttableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Specialdaystable <em>Specialdaystable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Specialdaystable
	 * @generated
	 */
	public Adapter createSpecialdaystableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Activitycalendar <em>Activitycalendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Activitycalendar
	 * @generated
	 */
	public Adapter createActivitycalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.RegisterActivation <em>Register Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.RegisterActivation
	 * @generated
	 */
	public Adapter createRegisterActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Singleactionschedule <em>Singleactionschedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Singleactionschedule
	 * @generated
	 */
	public Adapter createSingleactionscheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Registermonitor <em>Registermonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Registermonitor
	 * @generated
	 */
	public Adapter createRegistermonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Parametermonitor <em>Parametermonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Parametermonitor
	 * @generated
	 */
	public Adapter createParametermonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Limiter <em>Limiter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Limiter
	 * @generated
	 */
	public Adapter createLimiterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Credit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Credit
	 * @generated
	 */
	public Adapter createCreditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Charge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Charge
	 * @generated
	 */
	public Adapter createChargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Tokengateway <em>Tokengateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Tokengateway
	 * @generated
	 */
	public Adapter createTokengatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IEC_local_port_setup <em>IEC local port setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_local_port_setup
	 * @generated
	 */
	public Adapter createIEC_local_port_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Profilegeneric <em>Profilegeneric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Profilegeneric
	 * @generated
	 */
	public Adapter createProfilegenericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IEC_HDLC_setup <em>IEC HDLC setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_HDLC_setup
	 * @generated
	 */
	public Adapter createIEC_HDLC_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IEC_twisted_pair_setup <em>IEC twisted pair setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_twisted_pair_setup
	 * @generated
	 */
	public Adapter createIEC_twisted_pair_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.MACaddresssetup <em>MA Caddresssetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.MACaddresssetup
	 * @generated
	 */
	public Adapter createMACaddresssetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.M_Bus_slave_port_setup <em>MBus slave port setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.M_Bus_slave_port_setup
	 * @generated
	 */
	public Adapter createM_Bus_slave_port_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.M_Bus_client <em>MBus client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.M_Bus_client
	 * @generated
	 */
	public Adapter createM_Bus_clientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Register
	 * @generated
	 */
	public Adapter createRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.ExtendedRegister <em>Extended Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.ExtendedRegister
	 * @generated
	 */
	public Adapter createExtendedRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl <em>Disconnect Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.DisconnectControl
	 * @generated
	 */
	public Adapter createInterfaceClasses_DisconnectControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.M_Bus_master_port_setup <em>MBus master port setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.M_Bus_master_port_setup
	 * @generated
	 */
	public Adapter createM_Bus_master_port_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Wireless_Mode_Q_Channel <em>Wireless Mode QChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Wireless_Mode_Q_Channel
	 * @generated
	 */
	public Adapter createWireless_Mode_Q_ChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.DLMS_COSEM_Server_M_Bus_port_setup <em>DLMS COSEM Server MBus port setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.DLMS_COSEM_Server_M_Bus_port_setup
	 * @generated
	 */
	public Adapter createDLMS_COSEM_Server_M_Bus_port_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.M_Bus_diagnostic <em>MBus diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.M_Bus_diagnostic
	 * @generated
	 */
	public Adapter createM_Bus_diagnosticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.TCP_UDPsetup <em>TCP UD Psetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.TCP_UDPsetup
	 * @generated
	 */
	public Adapter createTCP_UDPsetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IPv4setup <em>IPv4setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IPv4setup
	 * @generated
	 */
	public Adapter createIPv4setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.PPPsetup <em>PP Psetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.PPPsetup
	 * @generated
	 */
	public Adapter createPPPsetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.GPRS_modem_setup <em>GPRS modem setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.GPRS_modem_setup
	 * @generated
	 */
	public Adapter createGPRS_modem_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.SMTPsetup <em>SMT Psetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.SMTPsetup
	 * @generated
	 */
	public Adapter createSMTPsetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.GSM_Diagnostic <em>GSM Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.GSM_Diagnostic
	 * @generated
	 */
	public Adapter createGSM_DiagnosticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IPv6setup <em>IPv6setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IPv6setup
	 * @generated
	 */
	public Adapter createIPv6setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Pushsetup <em>Pushsetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Pushsetup
	 * @generated
	 */
	public Adapter createPushsetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.S_FSK_PHY_MACsetup <em>SFSK PHY MA Csetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSK_PHY_MACsetup
	 * @generated
	 */
	public Adapter createS_FSK_PHY_MACsetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.S_FSKActiveinitiator <em>SFSK Activeinitiator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSKActiveinitiator
	 * @generated
	 */
	public Adapter createS_FSKActiveinitiatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.S_FSKMACsynctimeouts <em>SFSKMA Csynctimeouts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSKMACsynctimeouts
	 * @generated
	 */
	public Adapter createS_FSKMACsynctimeoutsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.S_FSKMACcounters <em>SFSKMA Ccounters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSKMACcounters
	 * @generated
	 */
	public Adapter createS_FSKMACcountersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IEC61334_4_32LLCsetup <em>IEC61334 432LL Csetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC61334_4_32LLCsetup
	 * @generated
	 */
	public Adapter createIEC61334_4_32LLCsetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.S_FSKReportingsystemlist <em>SFSK Reportingsystemlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.S_FSKReportingsystemlist
	 * @generated
	 */
	public Adapter createS_FSKReportingsystemlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_Type_1 <em>IEC 8802 2LLC Type 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_Type_1
	 * @generated
	 */
	public Adapter createIEC_8802_2_LLC_Type_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_G3_NB <em>IEC 8802 2LLC G3 NB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC_8802_2_LLC_G3_NB
	 * @generated
	 */
	public Adapter createIEC_8802_2_LLC_G3_NBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.IEC8802_2LLCType3 <em>IEC8802 2LLC Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.IEC8802_2LLCType3
	 * @generated
	 */
	public Adapter createIEC8802_2LLCType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.t61334_32_LLC_SSCS_setup <em>t61334 32 LLC SSCS setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.t61334_32_LLC_SSCS_setup
	 * @generated
	 */
	public Adapter createt61334_32_LLC_SSCS_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Phy_layer_counters <em>PRIME NB OFDM PLC Phy layer counters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Phy_layer_counters
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_Phy_layer_countersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACsetup <em>PRIME NB OFDM PLC MA Csetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACsetup
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MACsetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_functionalparams <em>PRIME NB OFDM PLC MAC functionalparams</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_functionalparams
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MAC_functionalparamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_counters <em>PRIME NB OFDM PLC MAC counters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_counters
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MAC_countersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACnetworkadmindata <em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACnetworkadmindata
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_MACnetworkadmindataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Application_identification <em>PRIME NB OFDM PLC Application identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Application_identification
	 * @generated
	 */
	public Adapter createPRIME_NB_OFDM_PLC_Application_identificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_layer_counters <em>G3 PLC MAC layer counters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_layer_counters
	 * @generated
	 */
	public Adapter createG3_PLC_MAC_layer_countersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_setup <em>G3 PLC MAC setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.G3_PLC_MAC_setup
	 * @generated
	 */
	public Adapter createG3_PLC_MAC_setupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.G3_PLC_6LoWPAN <em>G3 PLC 6Lo WPAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.G3_PLC_6LoWPAN
	 * @generated
	 */
	public Adapter createG3_PLC_6LoWPANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_startup <em>Zig Bee SAS startup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_startup
	 * @generated
	 */
	public Adapter createZigBee_SAS_startupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_join <em>Zig Bee SAS join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_join
	 * @generated
	 */
	public Adapter createZigBee_SAS_joinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_APS_fragmentation <em>Zig Bee SAS APS fragmentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBee_SAS_APS_fragmentation
	 * @generated
	 */
	public Adapter createZigBee_SAS_APS_fragmentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.ZigBeenetworkcontrol <em>Zig Beenetworkcontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBeenetworkcontrol
	 * @generated
	 */
	public Adapter createZigBeenetworkcontrolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.ZigBeetunnelsetup <em>Zig Beetunnelsetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.ZigBeetunnelsetup
	 * @generated
	 */
	public Adapter createZigBeetunnelsetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.AssociationLN <em>Association LN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.AssociationLN
	 * @generated
	 */
	public Adapter createAssociationLNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.SAPAssignment <em>SAP Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.SAPAssignment
	 * @generated
	 */
	public Adapter createSAPAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Securitysetup <em>Securitysetup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Securitysetup
	 * @generated
	 */
	public Adapter createSecuritysetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Dataprotection <em>Dataprotection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Dataprotection
	 * @generated
	 */
	public Adapter createDataprotectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Imagetransfer <em>Imagetransfer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Imagetransfer
	 * @generated
	 */
	public Adapter createImagetransferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Utilitytables <em>Utilitytables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Utilitytables
	 * @generated
	 */
	public Adapter createUtilitytablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Compactdata <em>Compactdata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Compactdata
	 * @generated
	 */
	public Adapter createCompactdataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Statusmapping <em>Statusmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Statusmapping
	 * @generated
	 */
	public Adapter createStatusmappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Arbitrator
	 * @generated
	 */
	public Adapter createArbitratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Registertable <em>Registertable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Registertable
	 * @generated
	 */
	public Adapter createRegistertableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //COSEMObjectsAdapterFactory
