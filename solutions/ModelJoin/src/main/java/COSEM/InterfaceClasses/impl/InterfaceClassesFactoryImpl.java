/**
 */
package COSEM.InterfaceClasses.impl;

import COSEM.InterfaceClasses.*;

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
public class InterfaceClassesFactoryImpl extends EFactoryImpl implements InterfaceClassesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceClassesFactory init() {
		try {
			InterfaceClassesFactory theInterfaceClassesFactory = (InterfaceClassesFactory)EPackage.Registry.INSTANCE.getEFactory(InterfaceClassesPackage.eNS_URI);
			if (theInterfaceClassesFactory != null) {
				return theInterfaceClassesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterfaceClassesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassesFactoryImpl() {
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
			case InterfaceClassesPackage.SFSK_PHY_MA_CSETUP: return createS_FSK_PHY_MACsetup();
			case InterfaceClassesPackage.SFSK_ACTIVEINITIATOR: return createS_FSKActiveinitiator();
			case InterfaceClassesPackage.SFSKMA_CSYNCTIMEOUTS: return createS_FSKMACsynctimeouts();
			case InterfaceClassesPackage.SFSKMA_CCOUNTERS: return createS_FSKMACcounters();
			case InterfaceClassesPackage.IEC61334_432LL_CSETUP: return createIEC61334_4_32LLCsetup();
			case InterfaceClassesPackage.SFSK_REPORTINGSYSTEMLIST: return createS_FSKReportingsystemlist();
			case InterfaceClassesPackage.T61334_32_LLC_SSCS_SETUP: return createt61334_32_LLC_SSCS_setup();
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS: return createPRIME_NB_OFDM_PLC_Phy_layer_counters();
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CSETUP: return createPRIME_NB_OFDM_PLC_MACsetup();
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_COUNTERS: return createPRIME_NB_OFDM_PLC_MAC_counters();
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS: return createPRIME_NB_OFDM_PLC_MAC_functionalparams();
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA: return createPRIME_NB_OFDM_PLC_MACnetworkadmindata();
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION: return createPRIME_NB_OFDM_PLC_Application_identification();
			case InterfaceClassesPackage.G3_PLC_MAC_LAYER_COUNTERS: return createG3_PLC_MAC_layer_counters();
			case InterfaceClassesPackage.G3_PLC_MAC_SETUP: return createG3_PLC_MAC_setup();
			case InterfaceClassesPackage.G3_PLC_6LO_WPAN: return createG3_PLC_6LoWPAN();
			case InterfaceClassesPackage.ZIG_BEE_SAS_STARTUP: return createZigBee_SAS_startup();
			case InterfaceClassesPackage.ZIG_BEE_SAS_JOIN: return createZigBee_SAS_join();
			case InterfaceClassesPackage.ZIG_BEE_SAS_APS_FRAGMENTATION: return createZigBee_SAS_APS_fragmentation();
			case InterfaceClassesPackage.ZIG_BEENETWORKCONTROL: return createZigBeenetworkcontrol();
			case InterfaceClassesPackage.ZIG_BEETUNNELSETUP: return createZigBeetunnelsetup();
			case InterfaceClassesPackage.TCP_UD_PSETUP: return createTCP_UDPsetup();
			case InterfaceClassesPackage.IPV4SETUP: return createIPv4setup();
			case InterfaceClassesPackage.IPV6SETUP: return createIPv6setup();
			case InterfaceClassesPackage.MA_CADDRESSSETUP: return createMACaddresssetup();
			case InterfaceClassesPackage.PP_PSETUP: return createPPPsetup();
			case InterfaceClassesPackage.SMT_PSETUP: return createSMTPsetup();
			case InterfaceClassesPackage.MODEMCONFIGURATION: return createModemconfiguration();
			case InterfaceClassesPackage.AUTO_ANSWER: return createAuto_answer();
			case InterfaceClassesPackage.AUTO_CONNECT: return createAuto_connect();
			case InterfaceClassesPackage.GPRS_MODEM_SETUP: return createGPRS_modem_setup();
			case InterfaceClassesPackage.GSM_DIAGNOSTIC: return createGSM_Diagnostic();
			case InterfaceClassesPackage.IEC_TWISTED_PAIR_SETUP: return createIEC_twisted_pair_setup();
			case InterfaceClassesPackage.MBUS_SLAVE_PORT_SETUP: return createM_Bus_slave_port_setup();
			case InterfaceClassesPackage.MBUS_CLIENT: return createM_Bus_client();
			case InterfaceClassesPackage.WIRELESS_MODE_QCHANNEL: return createWireless_Mode_Q_Channel();
			case InterfaceClassesPackage.MBUS_MASTER_PORT_SETUP: return createM_Bus_master_port_setup();
			case InterfaceClassesPackage.DLMS_COSEM_SERVER_MBUS_PORT_SETUP: return createDLMS_COSEM_Server_M_Bus_port_setup();
			case InterfaceClassesPackage.MBUS_DIAGNOSTIC: return createM_Bus_diagnostic();
			case InterfaceClassesPackage.SCRIPTTABLE: return createScripttable();
			case InterfaceClassesPackage.SCRIPT: return createScript();
			case InterfaceClassesPackage.SCHEDULE: return createSchedule();
			case InterfaceClassesPackage.SPECIALDAYSTABLE: return createSpecialdaystable();
			case InterfaceClassesPackage.ACTIVITYCALENDAR: return createActivitycalendar();
			case InterfaceClassesPackage.REGISTERMONITOR: return createRegistermonitor();
			case InterfaceClassesPackage.SINGLEACTIONSCHEDULE: return createSingleactionschedule();
			case InterfaceClassesPackage.PARAMETERMONITOR: return createParametermonitor();
			case InterfaceClassesPackage.SENSORMANAGER: return createSensormanager();
			case InterfaceClassesPackage.ARBITRATOR: return createArbitrator();
			case InterfaceClassesPackage.DISCONNECT_CONTROL: return createDisconnectControl();
			case InterfaceClassesPackage.LIMITER: return createLimiter();
			case InterfaceClassesPackage.ACCOUNT: return createAccount();
			case InterfaceClassesPackage.CREDIT: return createCredit();
			case InterfaceClassesPackage.CHARGE: return createCharge();
			case InterfaceClassesPackage.TOKENGATEWAY: return createTokengateway();
			case InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP: return createIEC_local_port_setup();
			case InterfaceClassesPackage.IEC_HDLC_SETUP: return createIEC_HDLC_setup();
			case InterfaceClassesPackage.IEC_8802_2LLC_TYPE_1: return createIEC_8802_2_LLC_Type_1();
			case InterfaceClassesPackage.IEC_8802_2LLC_G3_NB: return createIEC_8802_2_LLC_G3_NB();
			case InterfaceClassesPackage.IEC8802_2LLC_TYPE3: return createIEC8802_2LLCType3();
			case InterfaceClassesPackage.REGISTER: return createRegister();
			case InterfaceClassesPackage.SAP_ASSIGNMENT: return createSAPAssignment();
			case InterfaceClassesPackage.ASSOCIATION_LN: return createAssociationLN();
			case InterfaceClassesPackage.DATA: return createData();
			case InterfaceClassesPackage.EXTENDED_REGISTER: return createExtendedRegister();
			case InterfaceClassesPackage.DEMAND_REGISTER: return createDemandRegister();
			case InterfaceClassesPackage.REGISTER_ACTIVATION: return createRegisterActivation();
			case InterfaceClassesPackage.PROFILEGENERIC: return createProfilegeneric();
			case InterfaceClassesPackage.BASE: return createBase();
			case InterfaceClassesPackage.UTILITYTABLES: return createUtilitytables();
			case InterfaceClassesPackage.REGISTERTABLE: return createRegistertable();
			case InterfaceClassesPackage.COMPACTDATA: return createCompactdata();
			case InterfaceClassesPackage.STATUSMAPPING: return createStatusmapping();
			case InterfaceClassesPackage.ASSOCIATION_SN: return createAssociationSN();
			case InterfaceClassesPackage.IMAGETRANSFER: return createImagetransfer();
			case InterfaceClassesPackage.DATAPROTECTION: return createDataprotection();
			case InterfaceClassesPackage.PUSHSETUP: return createPushsetup();
			case InterfaceClassesPackage.SECURITYSETUP: return createSecuritysetup();
			case InterfaceClassesPackage.CLOCK: return createClock();
			case InterfaceClassesPackage.APPLICATION_ASSOCIATION: return createApplicationAssociation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSK_PHY_MACsetup createS_FSK_PHY_MACsetup() {
		S_FSK_PHY_MACsetupImpl s_FSK_PHY_MACsetup = new S_FSK_PHY_MACsetupImpl();
		return s_FSK_PHY_MACsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKActiveinitiator createS_FSKActiveinitiator() {
		S_FSKActiveinitiatorImpl s_FSKActiveinitiator = new S_FSKActiveinitiatorImpl();
		return s_FSKActiveinitiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKMACsynctimeouts createS_FSKMACsynctimeouts() {
		S_FSKMACsynctimeoutsImpl s_FSKMACsynctimeouts = new S_FSKMACsynctimeoutsImpl();
		return s_FSKMACsynctimeouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKMACcounters createS_FSKMACcounters() {
		S_FSKMACcountersImpl s_FSKMACcounters = new S_FSKMACcountersImpl();
		return s_FSKMACcounters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61334_4_32LLCsetup createIEC61334_4_32LLCsetup() {
		IEC61334_4_32LLCsetupImpl iec61334_4_32LLCsetup = new IEC61334_4_32LLCsetupImpl();
		return iec61334_4_32LLCsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S_FSKReportingsystemlist createS_FSKReportingsystemlist() {
		S_FSKReportingsystemlistImpl s_FSKReportingsystemlist = new S_FSKReportingsystemlistImpl();
		return s_FSKReportingsystemlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public t61334_32_LLC_SSCS_setup createt61334_32_LLC_SSCS_setup() {
		t61334_32_LLC_SSCS_setupImpl t61334_32_LLC_SSCS_setup = new t61334_32_LLC_SSCS_setupImpl();
		return t61334_32_LLC_SSCS_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_Phy_layer_counters createPRIME_NB_OFDM_PLC_Phy_layer_counters() {
		PRIME_NB_OFDM_PLC_Phy_layer_countersImpl primE_NB_OFDM_PLC_Phy_layer_counters = new PRIME_NB_OFDM_PLC_Phy_layer_countersImpl();
		return primE_NB_OFDM_PLC_Phy_layer_counters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MACsetup createPRIME_NB_OFDM_PLC_MACsetup() {
		PRIME_NB_OFDM_PLC_MACsetupImpl primE_NB_OFDM_PLC_MACsetup = new PRIME_NB_OFDM_PLC_MACsetupImpl();
		return primE_NB_OFDM_PLC_MACsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MAC_counters createPRIME_NB_OFDM_PLC_MAC_counters() {
		PRIME_NB_OFDM_PLC_MAC_countersImpl primE_NB_OFDM_PLC_MAC_counters = new PRIME_NB_OFDM_PLC_MAC_countersImpl();
		return primE_NB_OFDM_PLC_MAC_counters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MAC_functionalparams createPRIME_NB_OFDM_PLC_MAC_functionalparams() {
		PRIME_NB_OFDM_PLC_MAC_functionalparamsImpl primE_NB_OFDM_PLC_MAC_functionalparams = new PRIME_NB_OFDM_PLC_MAC_functionalparamsImpl();
		return primE_NB_OFDM_PLC_MAC_functionalparams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_MACnetworkadmindata createPRIME_NB_OFDM_PLC_MACnetworkadmindata() {
		PRIME_NB_OFDM_PLC_MACnetworkadmindataImpl primE_NB_OFDM_PLC_MACnetworkadmindata = new PRIME_NB_OFDM_PLC_MACnetworkadmindataImpl();
		return primE_NB_OFDM_PLC_MACnetworkadmindata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRIME_NB_OFDM_PLC_Application_identification createPRIME_NB_OFDM_PLC_Application_identification() {
		PRIME_NB_OFDM_PLC_Application_identificationImpl primE_NB_OFDM_PLC_Application_identification = new PRIME_NB_OFDM_PLC_Application_identificationImpl();
		return primE_NB_OFDM_PLC_Application_identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_PLC_MAC_layer_counters createG3_PLC_MAC_layer_counters() {
		G3_PLC_MAC_layer_countersImpl g3_PLC_MAC_layer_counters = new G3_PLC_MAC_layer_countersImpl();
		return g3_PLC_MAC_layer_counters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_PLC_MAC_setup createG3_PLC_MAC_setup() {
		G3_PLC_MAC_setupImpl g3_PLC_MAC_setup = new G3_PLC_MAC_setupImpl();
		return g3_PLC_MAC_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G3_PLC_6LoWPAN createG3_PLC_6LoWPAN() {
		G3_PLC_6LoWPANImpl g3_PLC_6LoWPAN = new G3_PLC_6LoWPANImpl();
		return g3_PLC_6LoWPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBee_SAS_startup createZigBee_SAS_startup() {
		ZigBee_SAS_startupImpl zigBee_SAS_startup = new ZigBee_SAS_startupImpl();
		return zigBee_SAS_startup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBee_SAS_join createZigBee_SAS_join() {
		ZigBee_SAS_joinImpl zigBee_SAS_join = new ZigBee_SAS_joinImpl();
		return zigBee_SAS_join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBee_SAS_APS_fragmentation createZigBee_SAS_APS_fragmentation() {
		ZigBee_SAS_APS_fragmentationImpl zigBee_SAS_APS_fragmentation = new ZigBee_SAS_APS_fragmentationImpl();
		return zigBee_SAS_APS_fragmentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBeenetworkcontrol createZigBeenetworkcontrol() {
		ZigBeenetworkcontrolImpl zigBeenetworkcontrol = new ZigBeenetworkcontrolImpl();
		return zigBeenetworkcontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZigBeetunnelsetup createZigBeetunnelsetup() {
		ZigBeetunnelsetupImpl zigBeetunnelsetup = new ZigBeetunnelsetupImpl();
		return zigBeetunnelsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCP_UDPsetup createTCP_UDPsetup() {
		TCP_UDPsetupImpl tcP_UDPsetup = new TCP_UDPsetupImpl();
		return tcP_UDPsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv4setup createIPv4setup() {
		IPv4setupImpl iPv4setup = new IPv4setupImpl();
		return iPv4setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv6setup createIPv6setup() {
		IPv6setupImpl iPv6setup = new IPv6setupImpl();
		return iPv6setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MACaddresssetup createMACaddresssetup() {
		MACaddresssetupImpl maCaddresssetup = new MACaddresssetupImpl();
		return maCaddresssetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPPsetup createPPPsetup() {
		PPPsetupImpl ppPsetup = new PPPsetupImpl();
		return ppPsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMTPsetup createSMTPsetup() {
		SMTPsetupImpl smtPsetup = new SMTPsetupImpl();
		return smtPsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modemconfiguration createModemconfiguration() {
		ModemconfigurationImpl modemconfiguration = new ModemconfigurationImpl();
		return modemconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auto_answer createAuto_answer() {
		Auto_answerImpl auto_answer = new Auto_answerImpl();
		return auto_answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auto_connect createAuto_connect() {
		Auto_connectImpl auto_connect = new Auto_connectImpl();
		return auto_connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPRS_modem_setup createGPRS_modem_setup() {
		GPRS_modem_setupImpl gprS_modem_setup = new GPRS_modem_setupImpl();
		return gprS_modem_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSM_Diagnostic createGSM_Diagnostic() {
		GSM_DiagnosticImpl gsM_Diagnostic = new GSM_DiagnosticImpl();
		return gsM_Diagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC_twisted_pair_setup createIEC_twisted_pair_setup() {
		IEC_twisted_pair_setupImpl ieC_twisted_pair_setup = new IEC_twisted_pair_setupImpl();
		return ieC_twisted_pair_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_Bus_slave_port_setup createM_Bus_slave_port_setup() {
		M_Bus_slave_port_setupImpl m_Bus_slave_port_setup = new M_Bus_slave_port_setupImpl();
		return m_Bus_slave_port_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_Bus_client createM_Bus_client() {
		M_Bus_clientImpl m_Bus_client = new M_Bus_clientImpl();
		return m_Bus_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wireless_Mode_Q_Channel createWireless_Mode_Q_Channel() {
		Wireless_Mode_Q_ChannelImpl wireless_Mode_Q_Channel = new Wireless_Mode_Q_ChannelImpl();
		return wireless_Mode_Q_Channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_Bus_master_port_setup createM_Bus_master_port_setup() {
		M_Bus_master_port_setupImpl m_Bus_master_port_setup = new M_Bus_master_port_setupImpl();
		return m_Bus_master_port_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLMS_COSEM_Server_M_Bus_port_setup createDLMS_COSEM_Server_M_Bus_port_setup() {
		DLMS_COSEM_Server_M_Bus_port_setupImpl dlmS_COSEM_Server_M_Bus_port_setup = new DLMS_COSEM_Server_M_Bus_port_setupImpl();
		return dlmS_COSEM_Server_M_Bus_port_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M_Bus_diagnostic createM_Bus_diagnostic() {
		M_Bus_diagnosticImpl m_Bus_diagnostic = new M_Bus_diagnosticImpl();
		return m_Bus_diagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scripttable createScripttable() {
		ScripttableImpl scripttable = new ScripttableImpl();
		return scripttable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialdaystable createSpecialdaystable() {
		SpecialdaystableImpl specialdaystable = new SpecialdaystableImpl();
		return specialdaystable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitycalendar createActivitycalendar() {
		ActivitycalendarImpl activitycalendar = new ActivitycalendarImpl();
		return activitycalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registermonitor createRegistermonitor() {
		RegistermonitorImpl registermonitor = new RegistermonitorImpl();
		return registermonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Singleactionschedule createSingleactionschedule() {
		SingleactionscheduleImpl singleactionschedule = new SingleactionscheduleImpl();
		return singleactionschedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametermonitor createParametermonitor() {
		ParametermonitorImpl parametermonitor = new ParametermonitorImpl();
		return parametermonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensormanager createSensormanager() {
		SensormanagerImpl sensormanager = new SensormanagerImpl();
		return sensormanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arbitrator createArbitrator() {
		ArbitratorImpl arbitrator = new ArbitratorImpl();
		return arbitrator;
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
	public Limiter createLimiter() {
		LimiterImpl limiter = new LimiterImpl();
		return limiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credit createCredit() {
		CreditImpl credit = new CreditImpl();
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charge createCharge() {
		ChargeImpl charge = new ChargeImpl();
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tokengateway createTokengateway() {
		TokengatewayImpl tokengateway = new TokengatewayImpl();
		return tokengateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC_local_port_setup createIEC_local_port_setup() {
		IEC_local_port_setupImpl ieC_local_port_setup = new IEC_local_port_setupImpl();
		return ieC_local_port_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC_HDLC_setup createIEC_HDLC_setup() {
		IEC_HDLC_setupImpl ieC_HDLC_setup = new IEC_HDLC_setupImpl();
		return ieC_HDLC_setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC_8802_2_LLC_Type_1 createIEC_8802_2_LLC_Type_1() {
		IEC_8802_2_LLC_Type_1Impl ieC_8802_2_LLC_Type_1 = new IEC_8802_2_LLC_Type_1Impl();
		return ieC_8802_2_LLC_Type_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC_8802_2_LLC_G3_NB createIEC_8802_2_LLC_G3_NB() {
		IEC_8802_2_LLC_G3_NBImpl ieC_8802_2_LLC_G3_NB = new IEC_8802_2_LLC_G3_NBImpl();
		return ieC_8802_2_LLC_G3_NB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC8802_2LLCType3 createIEC8802_2LLCType3() {
		IEC8802_2LLCType3Impl iec8802_2LLCType3 = new IEC8802_2LLCType3Impl();
		return iec8802_2LLCType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register createRegister() {
		RegisterImpl register = new RegisterImpl();
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAPAssignment createSAPAssignment() {
		SAPAssignmentImpl sapAssignment = new SAPAssignmentImpl();
		return sapAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationLN createAssociationLN() {
		AssociationLNImpl associationLN = new AssociationLNImpl();
		return associationLN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedRegister createExtendedRegister() {
		ExtendedRegisterImpl extendedRegister = new ExtendedRegisterImpl();
		return extendedRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandRegister createDemandRegister() {
		DemandRegisterImpl demandRegister = new DemandRegisterImpl();
		return demandRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterActivation createRegisterActivation() {
		RegisterActivationImpl registerActivation = new RegisterActivationImpl();
		return registerActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profilegeneric createProfilegeneric() {
		ProfilegenericImpl profilegeneric = new ProfilegenericImpl();
		return profilegeneric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base createBase() {
		BaseImpl base = new BaseImpl();
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilitytables createUtilitytables() {
		UtilitytablesImpl utilitytables = new UtilitytablesImpl();
		return utilitytables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registertable createRegistertable() {
		RegistertableImpl registertable = new RegistertableImpl();
		return registertable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compactdata createCompactdata() {
		CompactdataImpl compactdata = new CompactdataImpl();
		return compactdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statusmapping createStatusmapping() {
		StatusmappingImpl statusmapping = new StatusmappingImpl();
		return statusmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationSN createAssociationSN() {
		AssociationSNImpl associationSN = new AssociationSNImpl();
		return associationSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imagetransfer createImagetransfer() {
		ImagetransferImpl imagetransfer = new ImagetransferImpl();
		return imagetransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataprotection createDataprotection() {
		DataprotectionImpl dataprotection = new DataprotectionImpl();
		return dataprotection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pushsetup createPushsetup() {
		PushsetupImpl pushsetup = new PushsetupImpl();
		return pushsetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Securitysetup createSecuritysetup() {
		SecuritysetupImpl securitysetup = new SecuritysetupImpl();
		return securitysetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAssociation createApplicationAssociation() {
		ApplicationAssociationImpl applicationAssociation = new ApplicationAssociationImpl();
		return applicationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassesPackage getInterfaceClassesPackage() {
		return (InterfaceClassesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterfaceClassesPackage getPackage() {
		return InterfaceClassesPackage.eINSTANCE;
	}

} //InterfaceClassesFactoryImpl
