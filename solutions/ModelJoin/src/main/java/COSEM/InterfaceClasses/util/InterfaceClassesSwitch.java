/**
 */
package COSEM.InterfaceClasses.util;

import COSEM.InterfaceClasses.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see COSEM.InterfaceClasses.InterfaceClassesPackage
 * @generated
 */
public class InterfaceClassesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfaceClassesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassesSwitch() {
		if (modelPackage == null) {
			modelPackage = InterfaceClassesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InterfaceClassesPackage.SFSK_PHY_MA_CSETUP: {
				S_FSK_PHY_MACsetup s_FSK_PHY_MACsetup = (S_FSK_PHY_MACsetup)theEObject;
				T result = caseS_FSK_PHY_MACsetup(s_FSK_PHY_MACsetup);
				if (result == null) result = caseBase(s_FSK_PHY_MACsetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SFSK_ACTIVEINITIATOR: {
				S_FSKActiveinitiator s_FSKActiveinitiator = (S_FSKActiveinitiator)theEObject;
				T result = caseS_FSKActiveinitiator(s_FSKActiveinitiator);
				if (result == null) result = caseBase(s_FSKActiveinitiator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SFSKMA_CSYNCTIMEOUTS: {
				S_FSKMACsynctimeouts s_FSKMACsynctimeouts = (S_FSKMACsynctimeouts)theEObject;
				T result = caseS_FSKMACsynctimeouts(s_FSKMACsynctimeouts);
				if (result == null) result = caseBase(s_FSKMACsynctimeouts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SFSKMA_CCOUNTERS: {
				S_FSKMACcounters s_FSKMACcounters = (S_FSKMACcounters)theEObject;
				T result = caseS_FSKMACcounters(s_FSKMACcounters);
				if (result == null) result = caseBase(s_FSKMACcounters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IEC61334_432LL_CSETUP: {
				IEC61334_4_32LLCsetup iec61334_4_32LLCsetup = (IEC61334_4_32LLCsetup)theEObject;
				T result = caseIEC61334_4_32LLCsetup(iec61334_4_32LLCsetup);
				if (result == null) result = caseBase(iec61334_4_32LLCsetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SFSK_REPORTINGSYSTEMLIST: {
				S_FSKReportingsystemlist s_FSKReportingsystemlist = (S_FSKReportingsystemlist)theEObject;
				T result = caseS_FSKReportingsystemlist(s_FSKReportingsystemlist);
				if (result == null) result = caseBase(s_FSKReportingsystemlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.T61334_32_LLC_SSCS_SETUP: {
				t61334_32_LLC_SSCS_setup t61334_32_LLC_SSCS_setup = (t61334_32_LLC_SSCS_setup)theEObject;
				T result = caset61334_32_LLC_SSCS_setup(t61334_32_LLC_SSCS_setup);
				if (result == null) result = caseBase(t61334_32_LLC_SSCS_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_PHY_LAYER_COUNTERS: {
				PRIME_NB_OFDM_PLC_Phy_layer_counters primE_NB_OFDM_PLC_Phy_layer_counters = (PRIME_NB_OFDM_PLC_Phy_layer_counters)theEObject;
				T result = casePRIME_NB_OFDM_PLC_Phy_layer_counters(primE_NB_OFDM_PLC_Phy_layer_counters);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_Phy_layer_counters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CSETUP: {
				PRIME_NB_OFDM_PLC_MACsetup primE_NB_OFDM_PLC_MACsetup = (PRIME_NB_OFDM_PLC_MACsetup)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MACsetup(primE_NB_OFDM_PLC_MACsetup);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MACsetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_COUNTERS: {
				PRIME_NB_OFDM_PLC_MAC_counters primE_NB_OFDM_PLC_MAC_counters = (PRIME_NB_OFDM_PLC_MAC_counters)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MAC_counters(primE_NB_OFDM_PLC_MAC_counters);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MAC_counters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MAC_FUNCTIONALPARAMS: {
				PRIME_NB_OFDM_PLC_MAC_functionalparams primE_NB_OFDM_PLC_MAC_functionalparams = (PRIME_NB_OFDM_PLC_MAC_functionalparams)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MAC_functionalparams(primE_NB_OFDM_PLC_MAC_functionalparams);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MAC_functionalparams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_MA_CNETWORKADMINDATA: {
				PRIME_NB_OFDM_PLC_MACnetworkadmindata primE_NB_OFDM_PLC_MACnetworkadmindata = (PRIME_NB_OFDM_PLC_MACnetworkadmindata)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MACnetworkadmindata(primE_NB_OFDM_PLC_MACnetworkadmindata);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MACnetworkadmindata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION: {
				PRIME_NB_OFDM_PLC_Application_identification primE_NB_OFDM_PLC_Application_identification = (PRIME_NB_OFDM_PLC_Application_identification)theEObject;
				T result = casePRIME_NB_OFDM_PLC_Application_identification(primE_NB_OFDM_PLC_Application_identification);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_Application_identification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.G3_PLC_MAC_LAYER_COUNTERS: {
				G3_PLC_MAC_layer_counters g3_PLC_MAC_layer_counters = (G3_PLC_MAC_layer_counters)theEObject;
				T result = caseG3_PLC_MAC_layer_counters(g3_PLC_MAC_layer_counters);
				if (result == null) result = caseBase(g3_PLC_MAC_layer_counters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.G3_PLC_MAC_SETUP: {
				G3_PLC_MAC_setup g3_PLC_MAC_setup = (G3_PLC_MAC_setup)theEObject;
				T result = caseG3_PLC_MAC_setup(g3_PLC_MAC_setup);
				if (result == null) result = caseBase(g3_PLC_MAC_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.G3_PLC_6LO_WPAN: {
				G3_PLC_6LoWPAN g3_PLC_6LoWPAN = (G3_PLC_6LoWPAN)theEObject;
				T result = caseG3_PLC_6LoWPAN(g3_PLC_6LoWPAN);
				if (result == null) result = caseBase(g3_PLC_6LoWPAN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ZIG_BEE_SAS_STARTUP: {
				ZigBee_SAS_startup zigBee_SAS_startup = (ZigBee_SAS_startup)theEObject;
				T result = caseZigBee_SAS_startup(zigBee_SAS_startup);
				if (result == null) result = caseBase(zigBee_SAS_startup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ZIG_BEE_SAS_JOIN: {
				ZigBee_SAS_join zigBee_SAS_join = (ZigBee_SAS_join)theEObject;
				T result = caseZigBee_SAS_join(zigBee_SAS_join);
				if (result == null) result = caseBase(zigBee_SAS_join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ZIG_BEE_SAS_APS_FRAGMENTATION: {
				ZigBee_SAS_APS_fragmentation zigBee_SAS_APS_fragmentation = (ZigBee_SAS_APS_fragmentation)theEObject;
				T result = caseZigBee_SAS_APS_fragmentation(zigBee_SAS_APS_fragmentation);
				if (result == null) result = caseBase(zigBee_SAS_APS_fragmentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ZIG_BEENETWORKCONTROL: {
				ZigBeenetworkcontrol zigBeenetworkcontrol = (ZigBeenetworkcontrol)theEObject;
				T result = caseZigBeenetworkcontrol(zigBeenetworkcontrol);
				if (result == null) result = caseBase(zigBeenetworkcontrol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ZIG_BEETUNNELSETUP: {
				ZigBeetunnelsetup zigBeetunnelsetup = (ZigBeetunnelsetup)theEObject;
				T result = caseZigBeetunnelsetup(zigBeetunnelsetup);
				if (result == null) result = caseBase(zigBeetunnelsetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.TCP_UD_PSETUP: {
				TCP_UDPsetup tcP_UDPsetup = (TCP_UDPsetup)theEObject;
				T result = caseTCP_UDPsetup(tcP_UDPsetup);
				if (result == null) result = caseBase(tcP_UDPsetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IPV4SETUP: {
				IPv4setup iPv4setup = (IPv4setup)theEObject;
				T result = caseIPv4setup(iPv4setup);
				if (result == null) result = caseBase(iPv4setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IPV6SETUP: {
				IPv6setup iPv6setup = (IPv6setup)theEObject;
				T result = caseIPv6setup(iPv6setup);
				if (result == null) result = caseBase(iPv6setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.MA_CADDRESSSETUP: {
				MACaddresssetup maCaddresssetup = (MACaddresssetup)theEObject;
				T result = caseMACaddresssetup(maCaddresssetup);
				if (result == null) result = caseBase(maCaddresssetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PP_PSETUP: {
				PPPsetup ppPsetup = (PPPsetup)theEObject;
				T result = casePPPsetup(ppPsetup);
				if (result == null) result = caseBase(ppPsetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SMT_PSETUP: {
				SMTPsetup smtPsetup = (SMTPsetup)theEObject;
				T result = caseSMTPsetup(smtPsetup);
				if (result == null) result = caseBase(smtPsetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.MODEMCONFIGURATION: {
				Modemconfiguration modemconfiguration = (Modemconfiguration)theEObject;
				T result = caseModemconfiguration(modemconfiguration);
				if (result == null) result = caseBase(modemconfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.AUTO_ANSWER: {
				Auto_answer auto_answer = (Auto_answer)theEObject;
				T result = caseAuto_answer(auto_answer);
				if (result == null) result = caseBase(auto_answer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.AUTO_CONNECT: {
				Auto_connect auto_connect = (Auto_connect)theEObject;
				T result = caseAuto_connect(auto_connect);
				if (result == null) result = caseBase(auto_connect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.GPRS_MODEM_SETUP: {
				GPRS_modem_setup gprS_modem_setup = (GPRS_modem_setup)theEObject;
				T result = caseGPRS_modem_setup(gprS_modem_setup);
				if (result == null) result = caseBase(gprS_modem_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.GSM_DIAGNOSTIC: {
				GSM_Diagnostic gsM_Diagnostic = (GSM_Diagnostic)theEObject;
				T result = caseGSM_Diagnostic(gsM_Diagnostic);
				if (result == null) result = caseBase(gsM_Diagnostic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IEC_TWISTED_PAIR_SETUP: {
				IEC_twisted_pair_setup ieC_twisted_pair_setup = (IEC_twisted_pair_setup)theEObject;
				T result = caseIEC_twisted_pair_setup(ieC_twisted_pair_setup);
				if (result == null) result = caseBase(ieC_twisted_pair_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.MBUS_SLAVE_PORT_SETUP: {
				M_Bus_slave_port_setup m_Bus_slave_port_setup = (M_Bus_slave_port_setup)theEObject;
				T result = caseM_Bus_slave_port_setup(m_Bus_slave_port_setup);
				if (result == null) result = caseBase(m_Bus_slave_port_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.MBUS_CLIENT: {
				M_Bus_client m_Bus_client = (M_Bus_client)theEObject;
				T result = caseM_Bus_client(m_Bus_client);
				if (result == null) result = caseBase(m_Bus_client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.WIRELESS_MODE_QCHANNEL: {
				Wireless_Mode_Q_Channel wireless_Mode_Q_Channel = (Wireless_Mode_Q_Channel)theEObject;
				T result = caseWireless_Mode_Q_Channel(wireless_Mode_Q_Channel);
				if (result == null) result = caseBase(wireless_Mode_Q_Channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.MBUS_MASTER_PORT_SETUP: {
				M_Bus_master_port_setup m_Bus_master_port_setup = (M_Bus_master_port_setup)theEObject;
				T result = caseM_Bus_master_port_setup(m_Bus_master_port_setup);
				if (result == null) result = caseBase(m_Bus_master_port_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.DLMS_COSEM_SERVER_MBUS_PORT_SETUP: {
				DLMS_COSEM_Server_M_Bus_port_setup dlmS_COSEM_Server_M_Bus_port_setup = (DLMS_COSEM_Server_M_Bus_port_setup)theEObject;
				T result = caseDLMS_COSEM_Server_M_Bus_port_setup(dlmS_COSEM_Server_M_Bus_port_setup);
				if (result == null) result = caseBase(dlmS_COSEM_Server_M_Bus_port_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.MBUS_DIAGNOSTIC: {
				M_Bus_diagnostic m_Bus_diagnostic = (M_Bus_diagnostic)theEObject;
				T result = caseM_Bus_diagnostic(m_Bus_diagnostic);
				if (result == null) result = caseBase(m_Bus_diagnostic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SCRIPTTABLE: {
				Scripttable scripttable = (Scripttable)theEObject;
				T result = caseScripttable(scripttable);
				if (result == null) result = caseBase(scripttable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = caseBase(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SPECIALDAYSTABLE: {
				Specialdaystable specialdaystable = (Specialdaystable)theEObject;
				T result = caseSpecialdaystable(specialdaystable);
				if (result == null) result = caseBase(specialdaystable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ACTIVITYCALENDAR: {
				Activitycalendar activitycalendar = (Activitycalendar)theEObject;
				T result = caseActivitycalendar(activitycalendar);
				if (result == null) result = caseBase(activitycalendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.REGISTERMONITOR: {
				Registermonitor registermonitor = (Registermonitor)theEObject;
				T result = caseRegistermonitor(registermonitor);
				if (result == null) result = caseBase(registermonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SINGLEACTIONSCHEDULE: {
				Singleactionschedule singleactionschedule = (Singleactionschedule)theEObject;
				T result = caseSingleactionschedule(singleactionschedule);
				if (result == null) result = caseBase(singleactionschedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PARAMETERMONITOR: {
				Parametermonitor parametermonitor = (Parametermonitor)theEObject;
				T result = caseParametermonitor(parametermonitor);
				if (result == null) result = caseBase(parametermonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SENSORMANAGER: {
				Sensormanager sensormanager = (Sensormanager)theEObject;
				T result = caseSensormanager(sensormanager);
				if (result == null) result = caseBase(sensormanager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ARBITRATOR: {
				Arbitrator arbitrator = (Arbitrator)theEObject;
				T result = caseArbitrator(arbitrator);
				if (result == null) result = caseBase(arbitrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.DISCONNECT_CONTROL: {
				DisconnectControl disconnectControl = (DisconnectControl)theEObject;
				T result = caseDisconnectControl(disconnectControl);
				if (result == null) result = caseBase(disconnectControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.LIMITER: {
				Limiter limiter = (Limiter)theEObject;
				T result = caseLimiter(limiter);
				if (result == null) result = caseBase(limiter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseBase(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.CREDIT: {
				Credit credit = (Credit)theEObject;
				T result = caseCredit(credit);
				if (result == null) result = caseBase(credit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.CHARGE: {
				Charge charge = (Charge)theEObject;
				T result = caseCharge(charge);
				if (result == null) result = caseBase(charge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.TOKENGATEWAY: {
				Tokengateway tokengateway = (Tokengateway)theEObject;
				T result = caseTokengateway(tokengateway);
				if (result == null) result = caseBase(tokengateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IEC_LOCAL_PORT_SETUP: {
				IEC_local_port_setup ieC_local_port_setup = (IEC_local_port_setup)theEObject;
				T result = caseIEC_local_port_setup(ieC_local_port_setup);
				if (result == null) result = caseBase(ieC_local_port_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IEC_HDLC_SETUP: {
				IEC_HDLC_setup ieC_HDLC_setup = (IEC_HDLC_setup)theEObject;
				T result = caseIEC_HDLC_setup(ieC_HDLC_setup);
				if (result == null) result = caseBase(ieC_HDLC_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IEC_8802_2LLC_TYPE_1: {
				IEC_8802_2_LLC_Type_1 ieC_8802_2_LLC_Type_1 = (IEC_8802_2_LLC_Type_1)theEObject;
				T result = caseIEC_8802_2_LLC_Type_1(ieC_8802_2_LLC_Type_1);
				if (result == null) result = caseBase(ieC_8802_2_LLC_Type_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IEC_8802_2LLC_G3_NB: {
				IEC_8802_2_LLC_G3_NB ieC_8802_2_LLC_G3_NB = (IEC_8802_2_LLC_G3_NB)theEObject;
				T result = caseIEC_8802_2_LLC_G3_NB(ieC_8802_2_LLC_G3_NB);
				if (result == null) result = caseBase(ieC_8802_2_LLC_G3_NB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IEC8802_2LLC_TYPE3: {
				IEC8802_2LLCType3 iec8802_2LLCType3 = (IEC8802_2LLCType3)theEObject;
				T result = caseIEC8802_2LLCType3(iec8802_2LLCType3);
				if (result == null) result = caseBase(iec8802_2LLCType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.REGISTER: {
				Register register = (Register)theEObject;
				T result = caseRegister(register);
				if (result == null) result = caseData(register);
				if (result == null) result = caseBase(register);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SAP_ASSIGNMENT: {
				SAPAssignment sapAssignment = (SAPAssignment)theEObject;
				T result = caseSAPAssignment(sapAssignment);
				if (result == null) result = caseBase(sapAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ASSOCIATION_LN: {
				AssociationLN associationLN = (AssociationLN)theEObject;
				T result = caseAssociationLN(associationLN);
				if (result == null) result = caseBase(associationLN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseBase(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.EXTENDED_REGISTER: {
				ExtendedRegister extendedRegister = (ExtendedRegister)theEObject;
				T result = caseExtendedRegister(extendedRegister);
				if (result == null) result = caseRegister(extendedRegister);
				if (result == null) result = caseData(extendedRegister);
				if (result == null) result = caseBase(extendedRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.DEMAND_REGISTER: {
				DemandRegister demandRegister = (DemandRegister)theEObject;
				T result = caseDemandRegister(demandRegister);
				if (result == null) result = caseExtendedRegister(demandRegister);
				if (result == null) result = caseRegister(demandRegister);
				if (result == null) result = caseData(demandRegister);
				if (result == null) result = caseBase(demandRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.REGISTER_ACTIVATION: {
				RegisterActivation registerActivation = (RegisterActivation)theEObject;
				T result = caseRegisterActivation(registerActivation);
				if (result == null) result = caseBase(registerActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PROFILEGENERIC: {
				Profilegeneric profilegeneric = (Profilegeneric)theEObject;
				T result = caseProfilegeneric(profilegeneric);
				if (result == null) result = caseBase(profilegeneric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.BASE: {
				Base base = (Base)theEObject;
				T result = caseBase(base);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.UTILITYTABLES: {
				Utilitytables utilitytables = (Utilitytables)theEObject;
				T result = caseUtilitytables(utilitytables);
				if (result == null) result = caseBase(utilitytables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.REGISTERTABLE: {
				Registertable registertable = (Registertable)theEObject;
				T result = caseRegistertable(registertable);
				if (result == null) result = caseBase(registertable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.COMPACTDATA: {
				Compactdata compactdata = (Compactdata)theEObject;
				T result = caseCompactdata(compactdata);
				if (result == null) result = caseBase(compactdata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.STATUSMAPPING: {
				Statusmapping statusmapping = (Statusmapping)theEObject;
				T result = caseStatusmapping(statusmapping);
				if (result == null) result = caseBase(statusmapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.ASSOCIATION_SN: {
				AssociationSN associationSN = (AssociationSN)theEObject;
				T result = caseAssociationSN(associationSN);
				if (result == null) result = caseBase(associationSN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.IMAGETRANSFER: {
				Imagetransfer imagetransfer = (Imagetransfer)theEObject;
				T result = caseImagetransfer(imagetransfer);
				if (result == null) result = caseBase(imagetransfer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.DATAPROTECTION: {
				Dataprotection dataprotection = (Dataprotection)theEObject;
				T result = caseDataprotection(dataprotection);
				if (result == null) result = caseBase(dataprotection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.PUSHSETUP: {
				Pushsetup pushsetup = (Pushsetup)theEObject;
				T result = casePushsetup(pushsetup);
				if (result == null) result = caseBase(pushsetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.SECURITYSETUP: {
				Securitysetup securitysetup = (Securitysetup)theEObject;
				T result = caseSecuritysetup(securitysetup);
				if (result == null) result = caseBase(securitysetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.CLOCK: {
				Clock clock = (Clock)theEObject;
				T result = caseClock(clock);
				if (result == null) result = caseBase(clock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfaceClassesPackage.APPLICATION_ASSOCIATION: {
				ApplicationAssociation applicationAssociation = (ApplicationAssociation)theEObject;
				T result = caseApplicationAssociation(applicationAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSK PHY MA Csetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSK PHY MA Csetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSK_PHY_MACsetup(S_FSK_PHY_MACsetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSK Activeinitiator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSK Activeinitiator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKActiveinitiator(S_FSKActiveinitiator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSKMA Csynctimeouts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSKMA Csynctimeouts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKMACsynctimeouts(S_FSKMACsynctimeouts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSKMA Ccounters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSKMA Ccounters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKMACcounters(S_FSKMACcounters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC61334 432LL Csetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC61334 432LL Csetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC61334_4_32LLCsetup(IEC61334_4_32LLCsetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSK Reportingsystemlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSK Reportingsystemlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKReportingsystemlist(S_FSKReportingsystemlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>t61334 32 LLC SSCS setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>t61334 32 LLC SSCS setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caset61334_32_LLC_SSCS_setup(t61334_32_LLC_SSCS_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC Phy layer counters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC Phy layer counters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_Phy_layer_counters(PRIME_NB_OFDM_PLC_Phy_layer_counters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MA Csetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MA Csetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MACsetup(PRIME_NB_OFDM_PLC_MACsetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC counters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC counters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MAC_counters(PRIME_NB_OFDM_PLC_MAC_counters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC functionalparams</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC functionalparams</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MAC_functionalparams(PRIME_NB_OFDM_PLC_MAC_functionalparams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MA Cnetworkadmindata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MACnetworkadmindata(PRIME_NB_OFDM_PLC_MACnetworkadmindata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC Application identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC Application identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_Application_identification(PRIME_NB_OFDM_PLC_Application_identification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 PLC MAC layer counters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 PLC MAC layer counters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_PLC_MAC_layer_counters(G3_PLC_MAC_layer_counters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 PLC MAC setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 PLC MAC setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_PLC_MAC_setup(G3_PLC_MAC_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 PLC 6Lo WPAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 PLC 6Lo WPAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_PLC_6LoWPAN(G3_PLC_6LoWPAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Bee SAS startup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Bee SAS startup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBee_SAS_startup(ZigBee_SAS_startup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Bee SAS join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Bee SAS join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBee_SAS_join(ZigBee_SAS_join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Bee SAS APS fragmentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Bee SAS APS fragmentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBee_SAS_APS_fragmentation(ZigBee_SAS_APS_fragmentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Beenetworkcontrol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Beenetworkcontrol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBeenetworkcontrol(ZigBeenetworkcontrol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Beetunnelsetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Beetunnelsetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBeetunnelsetup(ZigBeetunnelsetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP UD Psetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP UD Psetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCP_UDPsetup(TCP_UDPsetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPv4setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPv4setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPv4setup(IPv4setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPv6setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPv6setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPv6setup(IPv6setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MA Caddresssetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MA Caddresssetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMACaddresssetup(MACaddresssetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PP Psetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PP Psetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPPsetup(PPPsetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMT Psetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMT Psetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMTPsetup(SMTPsetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modemconfiguration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modemconfiguration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModemconfiguration(Modemconfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuto_answer(Auto_answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuto_connect(Auto_connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPRS modem setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPRS modem setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPRS_modem_setup(GPRS_modem_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSM Diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSM Diagnostic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSM_Diagnostic(GSM_Diagnostic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC twisted pair setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC twisted pair setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC_twisted_pair_setup(IEC_twisted_pair_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus slave port setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus slave port setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_Bus_slave_port_setup(M_Bus_slave_port_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_Bus_client(M_Bus_client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wireless Mode QChannel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wireless Mode QChannel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireless_Mode_Q_Channel(Wireless_Mode_Q_Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus master port setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus master port setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_Bus_master_port_setup(M_Bus_master_port_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DLMS COSEM Server MBus port setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DLMS COSEM Server MBus port setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDLMS_COSEM_Server_M_Bus_port_setup(DLMS_COSEM_Server_M_Bus_port_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus diagnostic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_Bus_diagnostic(M_Bus_diagnostic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scripttable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scripttable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScripttable(Scripttable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialdaystable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialdaystable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialdaystable(Specialdaystable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activitycalendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activitycalendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivitycalendar(Activitycalendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registermonitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registermonitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistermonitor(Registermonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleactionschedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleactionschedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleactionschedule(Singleactionschedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametermonitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametermonitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametermonitor(Parametermonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensormanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensormanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensormanager(Sensormanager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitrator(Arbitrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnect Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnect Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnectControl(DisconnectControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limiter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limiter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimiter(Limiter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCredit(Credit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharge(Charge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tokengateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tokengateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokengateway(Tokengateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC local port setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC local port setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC_local_port_setup(IEC_local_port_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC HDLC setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC HDLC setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC_HDLC_setup(IEC_HDLC_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC 8802 2LLC Type 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC 8802 2LLC Type 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC_8802_2_LLC_Type_1(IEC_8802_2_LLC_Type_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC 8802 2LLC G3 NB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC 8802 2LLC G3 NB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC_8802_2_LLC_G3_NB(IEC_8802_2_LLC_G3_NB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC8802 2LLC Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC8802 2LLC Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC8802_2LLCType3(IEC8802_2LLCType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegister(Register object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAP Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAP Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAPAssignment(SAPAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association LN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association LN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationLN(AssociationLN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedRegister(ExtendedRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demand Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demand Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemandRegister(DemandRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterActivation(RegisterActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profilegeneric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profilegeneric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfilegeneric(Profilegeneric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase(Base object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilitytables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilitytables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilitytables(Utilitytables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registertable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registertable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistertable(Registertable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compactdata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compactdata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompactdata(Compactdata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statusmapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statusmapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusmapping(Statusmapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association SN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association SN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationSN(AssociationSN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imagetransfer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imagetransfer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagetransfer(Imagetransfer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataprotection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataprotection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataprotection(Dataprotection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pushsetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pushsetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushsetup(Pushsetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Securitysetup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Securitysetup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuritysetup(Securitysetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationAssociation(ApplicationAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InterfaceClassesSwitch
