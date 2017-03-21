/**
 */
package COSEM.COSEMObjects.util;

import COSEM.COSEMObjects.*;

import COSEM.InterfaceClasses.Account;
import COSEM.InterfaceClasses.Activitycalendar;
import COSEM.InterfaceClasses.Arbitrator;
import COSEM.InterfaceClasses.AssociationLN;
import COSEM.InterfaceClasses.Auto_answer;
import COSEM.InterfaceClasses.Auto_connect;
import COSEM.InterfaceClasses.Base;
import COSEM.InterfaceClasses.Charge;
import COSEM.InterfaceClasses.Compactdata;
import COSEM.InterfaceClasses.Credit;
import COSEM.InterfaceClasses.DLMS_COSEM_Server_M_Bus_port_setup;
import COSEM.InterfaceClasses.Data;
import COSEM.InterfaceClasses.Dataprotection;
import COSEM.InterfaceClasses.ExtendedRegister;
import COSEM.InterfaceClasses.G3_PLC_6LoWPAN;
import COSEM.InterfaceClasses.G3_PLC_MAC_layer_counters;
import COSEM.InterfaceClasses.G3_PLC_MAC_setup;
import COSEM.InterfaceClasses.GPRS_modem_setup;
import COSEM.InterfaceClasses.GSM_Diagnostic;
import COSEM.InterfaceClasses.IEC61334_4_32LLCsetup;
import COSEM.InterfaceClasses.IEC8802_2LLCType3;
import COSEM.InterfaceClasses.IEC_8802_2_LLC_G3_NB;
import COSEM.InterfaceClasses.IEC_8802_2_LLC_Type_1;
import COSEM.InterfaceClasses.IEC_HDLC_setup;
import COSEM.InterfaceClasses.IEC_local_port_setup;
import COSEM.InterfaceClasses.IEC_twisted_pair_setup;
import COSEM.InterfaceClasses.IPv4setup;
import COSEM.InterfaceClasses.IPv6setup;
import COSEM.InterfaceClasses.Imagetransfer;
import COSEM.InterfaceClasses.Limiter;
import COSEM.InterfaceClasses.MACaddresssetup;
import COSEM.InterfaceClasses.M_Bus_client;
import COSEM.InterfaceClasses.M_Bus_diagnostic;
import COSEM.InterfaceClasses.M_Bus_master_port_setup;
import COSEM.InterfaceClasses.M_Bus_slave_port_setup;
import COSEM.InterfaceClasses.Modemconfiguration;
import COSEM.InterfaceClasses.PPPsetup;
import COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Application_identification;
import COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_counters;
import COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MAC_functionalparams;
import COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACnetworkadmindata;
import COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_MACsetup;
import COSEM.InterfaceClasses.PRIME_NB_OFDM_PLC_Phy_layer_counters;
import COSEM.InterfaceClasses.Parametermonitor;
import COSEM.InterfaceClasses.Profilegeneric;
import COSEM.InterfaceClasses.Pushsetup;
import COSEM.InterfaceClasses.Register;
import COSEM.InterfaceClasses.RegisterActivation;
import COSEM.InterfaceClasses.Registermonitor;
import COSEM.InterfaceClasses.Registertable;
import COSEM.InterfaceClasses.SAPAssignment;
import COSEM.InterfaceClasses.SMTPsetup;
import COSEM.InterfaceClasses.S_FSKActiveinitiator;
import COSEM.InterfaceClasses.S_FSKMACcounters;
import COSEM.InterfaceClasses.S_FSKMACsynctimeouts;
import COSEM.InterfaceClasses.S_FSKReportingsystemlist;
import COSEM.InterfaceClasses.S_FSK_PHY_MACsetup;
import COSEM.InterfaceClasses.Schedule;
import COSEM.InterfaceClasses.Scripttable;
import COSEM.InterfaceClasses.Securitysetup;
import COSEM.InterfaceClasses.Singleactionschedule;
import COSEM.InterfaceClasses.Specialdaystable;
import COSEM.InterfaceClasses.Statusmapping;
import COSEM.InterfaceClasses.TCP_UDPsetup;
import COSEM.InterfaceClasses.Tokengateway;
import COSEM.InterfaceClasses.Utilitytables;
import COSEM.InterfaceClasses.Wireless_Mode_Q_Channel;
import COSEM.InterfaceClasses.ZigBee_SAS_APS_fragmentation;
import COSEM.InterfaceClasses.ZigBee_SAS_join;
import COSEM.InterfaceClasses.ZigBee_SAS_startup;
import COSEM.InterfaceClasses.ZigBeenetworkcontrol;
import COSEM.InterfaceClasses.ZigBeetunnelsetup;
import COSEM.InterfaceClasses.t61334_32_LLC_SSCS_setup;
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
 * @see COSEM.COSEMObjects.COSEMObjectsPackage
 * @generated
 */
public class COSEMObjectsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static COSEMObjectsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMObjectsSwitch() {
		if (modelPackage == null) {
			modelPackage = COSEMObjectsPackage.eINSTANCE;
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
			case COSEMObjectsPackage.PROGRAM_ENTRIES: {
				ProgramEntries programEntries = (ProgramEntries)theEObject;
				T result = caseProgramEntries(programEntries);
				if (result == null) result = caseData(programEntries);
				if (result == null) result = caseBase(programEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES: {
				BillingPeriodValues billingPeriodValues = (BillingPeriodValues)theEObject;
				T result = caseBillingPeriodValues(billingPeriodValues);
				if (result == null) result = caseData(billingPeriodValues);
				if (result == null) result = caseBase(billingPeriodValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.TIME_ENTRIES: {
				TimeEntries timeEntries = (TimeEntries)theEObject;
				T result = caseTimeEntries(timeEntries);
				if (result == null) result = caseData(timeEntries);
				if (result == null) result = caseBase(timeEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.UNIX_CLOCK: {
				UNIXClock unixClock = (UNIXClock)theEObject;
				T result = caseUNIXClock(unixClock);
				if (result == null) result = caseData(unixClock);
				if (result == null) result = caseBase(unixClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MODEM_CONFIGURATION_OBJECT: {
				ModemConfigurationObject modemConfigurationObject = (ModemConfigurationObject)theEObject;
				T result = caseModemConfigurationObject(modemConfigurationObject);
				if (result == null) result = caseModemconfiguration(modemConfigurationObject);
				if (result == null) result = caseBase(modemConfigurationObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.AUTO_CONNECT_OBJECT: {
				AutoConnectObject autoConnectObject = (AutoConnectObject)theEObject;
				T result = caseAutoConnectObject(autoConnectObject);
				if (result == null) result = caseAuto_connect(autoConnectObject);
				if (result == null) result = caseBase(autoConnectObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.AUTO_ANSWER_OBJECT: {
				AutoAnswerObject autoAnswerObject = (AutoAnswerObject)theEObject;
				T result = caseAutoAnswerObject(autoAnswerObject);
				if (result == null) result = caseAuto_answer(autoAnswerObject);
				if (result == null) result = caseBase(autoAnswerObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SCRIPT_TABLE: {
				ScriptTable scriptTable = (ScriptTable)theEObject;
				T result = caseScriptTable(scriptTable);
				if (result == null) result = caseScripttable(scriptTable);
				if (result == null) result = caseBase(scriptTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.GLOBAL_METER_RESET: {
				GlobalMeterReset globalMeterReset = (GlobalMeterReset)theEObject;
				T result = caseGlobalMeterReset(globalMeterReset);
				if (result == null) result = caseScripttable(globalMeterReset);
				if (result == null) result = caseBase(globalMeterReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MDI_RESET: {
				MDIReset mdiReset = (MDIReset)theEObject;
				T result = caseMDIReset(mdiReset);
				if (result == null) result = caseScripttable(mdiReset);
				if (result == null) result = caseBase(mdiReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.TARIFFICATION: {
				Tariffication tariffication = (Tariffication)theEObject;
				T result = caseTariffication(tariffication);
				if (result == null) result = caseScripttable(tariffication);
				if (result == null) result = caseBase(tariffication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ACTIVATE_TEST_MODE: {
				ActivateTestMode activateTestMode = (ActivateTestMode)theEObject;
				T result = caseActivateTestMode(activateTestMode);
				if (result == null) result = caseScripttable(activateTestMode);
				if (result == null) result = caseBase(activateTestMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ACTIVATE_NORMAL_MODE: {
				ActivateNormalMode activateNormalMode = (ActivateNormalMode)theEObject;
				T result = caseActivateNormalMode(activateNormalMode);
				if (result == null) result = caseScripttable(activateNormalMode);
				if (result == null) result = caseBase(activateNormalMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SET_OUTPUT_SIGNAL: {
				SetOutputSignal setOutputSignal = (SetOutputSignal)theEObject;
				T result = caseSetOutputSignal(setOutputSignal);
				if (result == null) result = caseScripttable(setOutputSignal);
				if (result == null) result = caseBase(setOutputSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SWITCH_OPTICAL_TEST_OUTPUT: {
				SwitchOpticalTestOutput switchOpticalTestOutput = (SwitchOpticalTestOutput)theEObject;
				T result = caseSwitchOpticalTestOutput(switchOpticalTestOutput);
				if (result == null) result = caseScripttable(switchOpticalTestOutput);
				if (result == null) result = caseBase(switchOpticalTestOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.POWER_QUALITY_MEASUREMENT_MANAGEMENT: {
				PowerQualityMeasurementManagement powerQualityMeasurementManagement = (PowerQualityMeasurementManagement)theEObject;
				T result = casePowerQualityMeasurementManagement(powerQualityMeasurementManagement);
				if (result == null) result = caseScripttable(powerQualityMeasurementManagement);
				if (result == null) result = caseBase(powerQualityMeasurementManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.DISCONNECT_CONTROL: {
				DisconnectControl disconnectControl = (DisconnectControl)theEObject;
				T result = caseDisconnectControl(disconnectControl);
				if (result == null) result = caseScripttable(disconnectControl);
				if (result == null) result = caseBase(disconnectControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IMAGE_ACTIVATION: {
				ImageActivation imageActivation = (ImageActivation)theEObject;
				T result = caseImageActivation(imageActivation);
				if (result == null) result = caseScripttable(imageActivation);
				if (result == null) result = caseBase(imageActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PUSH: {
				Push push = (Push)theEObject;
				T result = casePush(push);
				if (result == null) result = caseScripttable(push);
				if (result == null) result = caseBase(push);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.BROADCAST: {
				Broadcast broadcast = (Broadcast)theEObject;
				T result = caseBroadcast(broadcast);
				if (result == null) result = caseScripttable(broadcast);
				if (result == null) result = caseBase(broadcast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SPECIAL_DAYS: {
				SpecialDays specialDays = (SpecialDays)theEObject;
				T result = caseSpecialDays(specialDays);
				if (result == null) result = caseSpecialdaystable(specialDays);
				if (result == null) result = caseBase(specialDays);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SCHEDULE_OBJECT: {
				ScheduleObject scheduleObject = (ScheduleObject)theEObject;
				T result = caseScheduleObject(scheduleObject);
				if (result == null) result = caseSchedule(scheduleObject);
				if (result == null) result = caseBase(scheduleObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ACTIVITY_CALENDAR_OBJECT: {
				ActivityCalendarObject activityCalendarObject = (ActivityCalendarObject)theEObject;
				T result = caseActivityCalendarObject(activityCalendarObject);
				if (result == null) result = caseActivitycalendar(activityCalendarObject);
				if (result == null) result = caseBase(activityCalendarObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.REGISTER_ACTIVATION_OBJECT: {
				RegisterActivationObject registerActivationObject = (RegisterActivationObject)theEObject;
				T result = caseRegisterActivationObject(registerActivationObject);
				if (result == null) result = caseRegisterActivation(registerActivationObject);
				if (result == null) result = caseBase(registerActivationObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SINGLE_ACTION_SCHEDULE_OBJECT: {
				SingleActionScheduleObject singleActionScheduleObject = (SingleActionScheduleObject)theEObject;
				T result = caseSingleActionScheduleObject(singleActionScheduleObject);
				if (result == null) result = caseSingleactionschedule(singleActionScheduleObject);
				if (result == null) result = caseBase(singleActionScheduleObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.DISCONNECT_CONTROL_SCHEDULE: {
				DisconnectControlSchedule disconnectControlSchedule = (DisconnectControlSchedule)theEObject;
				T result = caseDisconnectControlSchedule(disconnectControlSchedule);
				if (result == null) result = caseSingleactionschedule(disconnectControlSchedule);
				if (result == null) result = caseBase(disconnectControlSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.END_OF_BILLING_PERIOD_SCHEDULE: {
				EndOfBillingPeriodSchedule endOfBillingPeriodSchedule = (EndOfBillingPeriodSchedule)theEObject;
				T result = caseEndOfBillingPeriodSchedule(endOfBillingPeriodSchedule);
				if (result == null) result = caseSingleactionschedule(endOfBillingPeriodSchedule);
				if (result == null) result = caseBase(endOfBillingPeriodSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IMAGE_ACTIVATION_SCHEDULE: {
				ImageActivationSchedule imageActivationSchedule = (ImageActivationSchedule)theEObject;
				T result = caseImageActivationSchedule(imageActivationSchedule);
				if (result == null) result = caseSingleactionschedule(imageActivationSchedule);
				if (result == null) result = caseBase(imageActivationSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.OUTPUT_CONTROL_SCHEDULE: {
				OutputControlSchedule outputControlSchedule = (OutputControlSchedule)theEObject;
				T result = caseOutputControlSchedule(outputControlSchedule);
				if (result == null) result = caseSingleactionschedule(outputControlSchedule);
				if (result == null) result = caseBase(outputControlSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PUSH_SCHEDULE: {
				PushSchedule pushSchedule = (PushSchedule)theEObject;
				T result = casePushSchedule(pushSchedule);
				if (result == null) result = caseSingleactionschedule(pushSchedule);
				if (result == null) result = caseBase(pushSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.REGISTER_MONITOR_OBJECT: {
				RegisterMonitorObject registerMonitorObject = (RegisterMonitorObject)theEObject;
				T result = caseRegisterMonitorObject(registerMonitorObject);
				if (result == null) result = caseRegistermonitor(registerMonitorObject);
				if (result == null) result = caseBase(registerMonitorObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ALARM_MONITOR: {
				AlarmMonitor alarmMonitor = (AlarmMonitor)theEObject;
				T result = caseAlarmMonitor(alarmMonitor);
				if (result == null) result = caseRegistermonitor(alarmMonitor);
				if (result == null) result = caseBase(alarmMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PARAMETER_MONITOR_OBJECT: {
				ParameterMonitorObject parameterMonitorObject = (ParameterMonitorObject)theEObject;
				T result = caseParameterMonitorObject(parameterMonitorObject);
				if (result == null) result = caseParametermonitor(parameterMonitorObject);
				if (result == null) result = caseBase(parameterMonitorObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.LIMITER_OBJECT: {
				LimiterObject limiterObject = (LimiterObject)theEObject;
				T result = caseLimiterObject(limiterObject);
				if (result == null) result = caseLimiter(limiterObject);
				if (result == null) result = caseBase(limiterObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ACCOUNT_OBJECT: {
				AccountObject accountObject = (AccountObject)theEObject;
				T result = caseAccountObject(accountObject);
				if (result == null) result = caseAccount(accountObject);
				if (result == null) result = caseBase(accountObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.CREDIT_OBJECT: {
				CreditObject creditObject = (CreditObject)theEObject;
				T result = caseCreditObject(creditObject);
				if (result == null) result = caseCredit(creditObject);
				if (result == null) result = caseBase(creditObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.CHARGE_OBJECT: {
				ChargeObject chargeObject = (ChargeObject)theEObject;
				T result = caseChargeObject(chargeObject);
				if (result == null) result = caseCharge(chargeObject);
				if (result == null) result = caseBase(chargeObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.TOKEN_GATEWAY_OBJECT: {
				TokenGatewayObject tokenGatewayObject = (TokenGatewayObject)theEObject;
				T result = caseTokenGatewayObject(tokenGatewayObject);
				if (result == null) result = caseTokengateway(tokenGatewayObject);
				if (result == null) result = caseBase(tokenGatewayObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MAX_CREDIT_LIMIT: {
				MaxCreditLimit maxCreditLimit = (MaxCreditLimit)theEObject;
				T result = caseMaxCreditLimit(maxCreditLimit);
				if (result == null) result = caseData(maxCreditLimit);
				if (result == null) result = caseBase(maxCreditLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MAX_VEND_LIMIT: {
				MaxVendLimit maxVendLimit = (MaxVendLimit)theEObject;
				T result = caseMaxVendLimit(maxVendLimit);
				if (result == null) result = caseData(maxVendLimit);
				if (result == null) result = caseBase(maxVendLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC_OPTICAL_PORT_SETUP: {
				IECOpticalPortSetup iecOpticalPortSetup = (IECOpticalPortSetup)theEObject;
				T result = caseIECOpticalPortSetup(iecOpticalPortSetup);
				if (result == null) result = caseIEC_local_port_setup(iecOpticalPortSetup);
				if (result == null) result = caseBase(iecOpticalPortSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC_ELECTRICAL_PORT_SETUP: {
				IECElectricalPortSetup iecElectricalPortSetup = (IECElectricalPortSetup)theEObject;
				T result = caseIECElectricalPortSetup(iecElectricalPortSetup);
				if (result == null) result = caseIEC_local_port_setup(iecElectricalPortSetup);
				if (result == null) result = caseBase(iecElectricalPortSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.STANDARD_READOUT: {
				StandardReadout standardReadout = (StandardReadout)theEObject;
				T result = caseStandardReadout(standardReadout);
				if (result == null) result = caseProfilegeneric(standardReadout);
				if (result == null) result = caseBase(standardReadout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.STANDARD_READOUT_PARAM: {
				StandardReadoutParam standardReadoutParam = (StandardReadoutParam)theEObject;
				T result = caseStandardReadoutParam(standardReadoutParam);
				if (result == null) result = caseData(standardReadoutParam);
				if (result == null) result = caseBase(standardReadoutParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IECHDLC_SETUP_OBJECT: {
				IECHDLCSetupObject iechdlcSetupObject = (IECHDLCSetupObject)theEObject;
				T result = caseIECHDLCSetupObject(iechdlcSetupObject);
				if (result == null) result = caseIEC_HDLC_setup(iechdlcSetupObject);
				if (result == null) result = caseBase(iechdlcSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC_TWISTED_PAIR_SETUP_OBJECT: {
				IECTwistedPairSetupObject iecTwistedPairSetupObject = (IECTwistedPairSetupObject)theEObject;
				T result = caseIECTwistedPairSetupObject(iecTwistedPairSetupObject);
				if (result == null) result = caseIEC_twisted_pair_setup(iecTwistedPairSetupObject);
				if (result == null) result = caseBase(iecTwistedPairSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC_TWISTED_PAIR_MAC_ADDRESS_SETUP: {
				IECTwistedPairMACAddressSetup iecTwistedPairMACAddressSetup = (IECTwistedPairMACAddressSetup)theEObject;
				T result = caseIECTwistedPairMACAddressSetup(iecTwistedPairMACAddressSetup);
				if (result == null) result = caseMACaddresssetup(iecTwistedPairMACAddressSetup);
				if (result == null) result = caseBase(iecTwistedPairMACAddressSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC_TWISTED_PAIR_FATAL_ERROR_REGISTER: {
				IECTwistedPairFatalErrorRegister iecTwistedPairFatalErrorRegister = (IECTwistedPairFatalErrorRegister)theEObject;
				T result = caseIECTwistedPairFatalErrorRegister(iecTwistedPairFatalErrorRegister);
				if (result == null) result = caseData(iecTwistedPairFatalErrorRegister);
				if (result == null) result = caseBase(iecTwistedPairFatalErrorRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC62056_31SHORT_READOUT: {
				IEC62056_3_1ShortReadout iec62056_3_1ShortReadout = (IEC62056_3_1ShortReadout)theEObject;
				T result = caseIEC62056_3_1ShortReadout(iec62056_3_1ShortReadout);
				if (result == null) result = caseProfilegeneric(iec62056_3_1ShortReadout);
				if (result == null) result = caseBase(iec62056_3_1ShortReadout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC62056_31LONG_READOUT: {
				IEC62056_3_1LongReadout iec62056_3_1LongReadout = (IEC62056_3_1LongReadout)theEObject;
				T result = caseIEC62056_3_1LongReadout(iec62056_3_1LongReadout);
				if (result == null) result = caseProfilegeneric(iec62056_3_1LongReadout);
				if (result == null) result = caseBase(iec62056_3_1LongReadout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC_62056_31ALTERNATE_READOUT_PROFILE: {
				IEC_62056_3_1AlternateReadoutProfile ieC_62056_3_1AlternateReadoutProfile = (IEC_62056_3_1AlternateReadoutProfile)theEObject;
				T result = caseIEC_62056_3_1AlternateReadoutProfile(ieC_62056_3_1AlternateReadoutProfile);
				if (result == null) result = caseProfilegeneric(ieC_62056_3_1AlternateReadoutProfile);
				if (result == null) result = caseBase(ieC_62056_3_1AlternateReadoutProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MBUS_SLAVE_PORT_SETUP_OBJECT: {
				M_BusSlavePortSetupObject m_BusSlavePortSetupObject = (M_BusSlavePortSetupObject)theEObject;
				T result = caseM_BusSlavePortSetupObject(m_BusSlavePortSetupObject);
				if (result == null) result = caseM_Bus_slave_port_setup(m_BusSlavePortSetupObject);
				if (result == null) result = caseBase(m_BusSlavePortSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MBUS_CLIENT_OBJECT: {
				M_BusClientObject m_BusClientObject = (M_BusClientObject)theEObject;
				T result = caseM_BusClientObject(m_BusClientObject);
				if (result == null) result = caseM_Bus_client(m_BusClientObject);
				if (result == null) result = caseBase(m_BusClientObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MBUS_VALUE: {
				M_BusValue m_BusValue = (M_BusValue)theEObject;
				T result = caseM_BusValue(m_BusValue);
				if (result == null) result = caseExtendedRegister(m_BusValue);
				if (result == null) result = caseRegister(m_BusValue);
				if (result == null) result = caseData(m_BusValue);
				if (result == null) result = caseBase(m_BusValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MBUS_PROFILE_GENERIC: {
				M_BusProfileGeneric m_BusProfileGeneric = (M_BusProfileGeneric)theEObject;
				T result = caseM_BusProfileGeneric(m_BusProfileGeneric);
				if (result == null) result = caseProfilegeneric(m_BusProfileGeneric);
				if (result == null) result = caseBase(m_BusProfileGeneric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MBUS_DISCONNECT_CONTROL: {
				M_BusDisconnectControl m_BusDisconnectControl = (M_BusDisconnectControl)theEObject;
				T result = caseM_BusDisconnectControl(m_BusDisconnectControl);
				if (result == null) result = caseInterfaceClasses_DisconnectControl(m_BusDisconnectControl);
				if (result == null) result = caseBase(m_BusDisconnectControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MBUS_CONTROL_LOG: {
				M_BusControlLog m_BusControlLog = (M_BusControlLog)theEObject;
				T result = caseM_BusControlLog(m_BusControlLog);
				if (result == null) result = caseProfilegeneric(m_BusControlLog);
				if (result == null) result = caseBase(m_BusControlLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MBUS_MASTER_PORT_SETUP_OBJECT: {
				M_BusMasterPortSetupObject m_BusMasterPortSetupObject = (M_BusMasterPortSetupObject)theEObject;
				T result = caseM_BusMasterPortSetupObject(m_BusMasterPortSetupObject);
				if (result == null) result = caseM_Bus_master_port_setup(m_BusMasterPortSetupObject);
				if (result == null) result = caseBase(m_BusMasterPortSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.WIRELESS_MODE_QCHANNEL_OBJECT: {
				WirelessModeQChannelObject wirelessModeQChannelObject = (WirelessModeQChannelObject)theEObject;
				T result = caseWirelessModeQChannelObject(wirelessModeQChannelObject);
				if (result == null) result = caseWireless_Mode_Q_Channel(wirelessModeQChannelObject);
				if (result == null) result = caseBase(wirelessModeQChannelObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.DLMS_COSEM_SERVER_MBUS_PORT_SETUP_OBJECT: {
				DLMS_COSEMServerM_BusPortSetupObject dlmS_COSEMServerM_BusPortSetupObject = (DLMS_COSEMServerM_BusPortSetupObject)theEObject;
				T result = caseDLMS_COSEMServerM_BusPortSetupObject(dlmS_COSEMServerM_BusPortSetupObject);
				if (result == null) result = caseDLMS_COSEM_Server_M_Bus_port_setup(dlmS_COSEMServerM_BusPortSetupObject);
				if (result == null) result = caseBase(dlmS_COSEMServerM_BusPortSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MBUS_DIAGNOSTIC_OBJECT: {
				M_BusDiagnosticObject m_BusDiagnosticObject = (M_BusDiagnosticObject)theEObject;
				T result = caseM_BusDiagnosticObject(m_BusDiagnosticObject);
				if (result == null) result = caseM_Bus_diagnostic(m_BusDiagnosticObject);
				if (result == null) result = caseBase(m_BusDiagnosticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.TCP_UDP_SETUP_OBJECT: {
				TCP_UDPSetupObject tcP_UDPSetupObject = (TCP_UDPSetupObject)theEObject;
				T result = caseTCP_UDPSetupObject(tcP_UDPSetupObject);
				if (result == null) result = caseTCP_UDPsetup(tcP_UDPSetupObject);
				if (result == null) result = caseBase(tcP_UDPSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IPV4_SETUP_OBJECT: {
				IPv4SetupObject iPv4SetupObject = (IPv4SetupObject)theEObject;
				T result = caseIPv4SetupObject(iPv4SetupObject);
				if (result == null) result = caseIPv4setup(iPv4SetupObject);
				if (result == null) result = caseBase(iPv4SetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MAC_ADDRESS_SETUP_OBJECT: {
				MACAddressSetupObject macAddressSetupObject = (MACAddressSetupObject)theEObject;
				T result = caseMACAddressSetupObject(macAddressSetupObject);
				if (result == null) result = caseMACaddresssetup(macAddressSetupObject);
				if (result == null) result = caseBase(macAddressSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PPP_SETUP_OBJECT: {
				PPPSetupObject pppSetupObject = (PPPSetupObject)theEObject;
				T result = casePPPSetupObject(pppSetupObject);
				if (result == null) result = casePPPsetup(pppSetupObject);
				if (result == null) result = caseBase(pppSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.GPRS_MODEM_SETUP_OBJECT: {
				GPRSModemSetupObject gprsModemSetupObject = (GPRSModemSetupObject)theEObject;
				T result = caseGPRSModemSetupObject(gprsModemSetupObject);
				if (result == null) result = caseGPRS_modem_setup(gprsModemSetupObject);
				if (result == null) result = caseBase(gprsModemSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SMTP_SETUP_OBJECT: {
				SMTPSetupObject smtpSetupObject = (SMTPSetupObject)theEObject;
				T result = caseSMTPSetupObject(smtpSetupObject);
				if (result == null) result = caseSMTPsetup(smtpSetupObject);
				if (result == null) result = caseBase(smtpSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.GSM_DIAGNOSTIC_OBJECT: {
				GSMDiagnosticObject gsmDiagnosticObject = (GSMDiagnosticObject)theEObject;
				T result = caseGSMDiagnosticObject(gsmDiagnosticObject);
				if (result == null) result = caseGSM_Diagnostic(gsmDiagnosticObject);
				if (result == null) result = caseBase(gsmDiagnosticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IPV6_SETUP_OBJECT: {
				IPv6SetupObject iPv6SetupObject = (IPv6SetupObject)theEObject;
				T result = caseIPv6SetupObject(iPv6SetupObject);
				if (result == null) result = caseIPv6setup(iPv6SetupObject);
				if (result == null) result = caseBase(iPv6SetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PUSH_SETUP_OBJECT: {
				PushSetupObject pushSetupObject = (PushSetupObject)theEObject;
				T result = casePushSetupObject(pushSetupObject);
				if (result == null) result = casePushsetup(pushSetupObject);
				if (result == null) result = caseBase(pushSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SFSK_PHY_MAC_SETUP_OBJECT: {
				S_FSKPhy_MACSetupObject s_FSKPhy_MACSetupObject = (S_FSKPhy_MACSetupObject)theEObject;
				T result = caseS_FSKPhy_MACSetupObject(s_FSKPhy_MACSetupObject);
				if (result == null) result = caseS_FSK_PHY_MACsetup(s_FSKPhy_MACSetupObject);
				if (result == null) result = caseBase(s_FSKPhy_MACSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SFSK_ACTIVE_INITIATOR_OBJECT: {
				S_FSKActiveInitiatorObject s_FSKActiveInitiatorObject = (S_FSKActiveInitiatorObject)theEObject;
				T result = caseS_FSKActiveInitiatorObject(s_FSKActiveInitiatorObject);
				if (result == null) result = caseS_FSKActiveinitiator(s_FSKActiveInitiatorObject);
				if (result == null) result = caseBase(s_FSKActiveInitiatorObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SFSKMAC_SYNCHRONIZATION_TIMEOUTS: {
				S_FSKMACSynchronizationTimeouts s_FSKMACSynchronizationTimeouts = (S_FSKMACSynchronizationTimeouts)theEObject;
				T result = caseS_FSKMACSynchronizationTimeouts(s_FSKMACSynchronizationTimeouts);
				if (result == null) result = caseS_FSKMACsynctimeouts(s_FSKMACSynchronizationTimeouts);
				if (result == null) result = caseBase(s_FSKMACSynchronizationTimeouts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SFSKMAC_COUNTERS_OBJECT: {
				S_FSKMACCountersObject s_FSKMACCountersObject = (S_FSKMACCountersObject)theEObject;
				T result = caseS_FSKMACCountersObject(s_FSKMACCountersObject);
				if (result == null) result = caseS_FSKMACcounters(s_FSKMACCountersObject);
				if (result == null) result = caseBase(s_FSKMACCountersObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IEC61334_432LLC_SETUP_OBJECT: {
				IEC61334_4_32LLCSetupObject iec61334_4_32LLCSetupObject = (IEC61334_4_32LLCSetupObject)theEObject;
				T result = caseIEC61334_4_32LLCSetupObject(iec61334_4_32LLCSetupObject);
				if (result == null) result = caseIEC61334_4_32LLCsetup(iec61334_4_32LLCSetupObject);
				if (result == null) result = caseBase(iec61334_4_32LLCSetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SFSK_REPORTING_SYSTEM_LIST_OBJECT: {
				S_FSKReportingSystemListObject s_FSKReportingSystemListObject = (S_FSKReportingSystemListObject)theEObject;
				T result = caseS_FSKReportingSystemListObject(s_FSKReportingSystemListObject);
				if (result == null) result = caseS_FSKReportingsystemlist(s_FSKReportingSystemListObject);
				if (result == null) result = caseBase(s_FSKReportingSystemListObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ISO_IEC8802_2LLC_TYPE1_SETUP_OBJECT: {
				ISO_IEC8802_2LLCType1SetupObject isO_IEC8802_2LLCType1SetupObject = (ISO_IEC8802_2LLCType1SetupObject)theEObject;
				T result = caseISO_IEC8802_2LLCType1SetupObject(isO_IEC8802_2LLCType1SetupObject);
				if (result == null) result = caseIEC_8802_2_LLC_Type_1(isO_IEC8802_2LLCType1SetupObject);
				if (result == null) result = caseBase(isO_IEC8802_2LLCType1SetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ISO_IEC8802_2LLC_TYPE2_SETUP: {
				ISO_IEC8802_2LLCType2Setup isO_IEC8802_2LLCType2Setup = (ISO_IEC8802_2LLCType2Setup)theEObject;
				T result = caseISO_IEC8802_2LLCType2Setup(isO_IEC8802_2LLCType2Setup);
				if (result == null) result = caseIEC_8802_2_LLC_G3_NB(isO_IEC8802_2LLCType2Setup);
				if (result == null) result = caseBase(isO_IEC8802_2LLCType2Setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ISO_IEC8802_2LLC_TYPE3_SETUP: {
				ISO_IEC8802_2LLCType3Setup isO_IEC8802_2LLCType3Setup = (ISO_IEC8802_2LLCType3Setup)theEObject;
				T result = caseISO_IEC8802_2LLCType3Setup(isO_IEC8802_2LLCType3Setup);
				if (result == null) result = caseIEC8802_2LLCType3(isO_IEC8802_2LLCType3Setup);
				if (result == null) result = caseBase(isO_IEC8802_2LLCType3Setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.T61334_432LLCSSC_SSETUPOBJECT: {
				t61334_4_32LLCSSCSsetupobject t61334_4_32LLCSSCSsetupobject = (t61334_4_32LLCSSCSsetupobject)theEObject;
				T result = caset61334_4_32LLCSSCSsetupobject(t61334_4_32LLCSSCSsetupobject);
				if (result == null) result = caset61334_32_LLC_SSCS_setup(t61334_4_32LLCSSCSsetupobject);
				if (result == null) result = caseBase(t61334_4_32LLCSSCSsetupobject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_PHYSICAL_LAYER_COUNTERS_OBJECT: {
				PRIME_NB_OFDM_PLC_Physical_layer_counters_object primE_NB_OFDM_PLC_Physical_layer_counters_object = (PRIME_NB_OFDM_PLC_Physical_layer_counters_object)theEObject;
				T result = casePRIME_NB_OFDM_PLC_Physical_layer_counters_object(primE_NB_OFDM_PLC_Physical_layer_counters_object);
				if (result == null) result = casePRIME_NB_OFDM_PLC_Phy_layer_counters(primE_NB_OFDM_PLC_Physical_layer_counters_object);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_Physical_layer_counters_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_SETUP_OBJECT: {
				PRIME_NB_OFDM_PLC_MAC_setup_object primE_NB_OFDM_PLC_MAC_setup_object = (PRIME_NB_OFDM_PLC_MAC_setup_object)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MAC_setup_object(primE_NB_OFDM_PLC_MAC_setup_object);
				if (result == null) result = casePRIME_NB_OFDM_PLC_MACsetup(primE_NB_OFDM_PLC_MAC_setup_object);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MAC_setup_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_FUNCTIONAL_PARAMETERS_OBJECT: {
				PRIME_NB_OFDM_PLC_MAC_functional_parameters_object primE_NB_OFDM_PLC_MAC_functional_parameters_object = (PRIME_NB_OFDM_PLC_MAC_functional_parameters_object)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MAC_functional_parameters_object(primE_NB_OFDM_PLC_MAC_functional_parameters_object);
				if (result == null) result = casePRIME_NB_OFDM_PLC_MAC_functionalparams(primE_NB_OFDM_PLC_MAC_functional_parameters_object);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MAC_functional_parameters_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_COUNTERS_OBJECT: {
				PRIME_NB_OFDM_PLC_MAC_counters_object primE_NB_OFDM_PLC_MAC_counters_object = (PRIME_NB_OFDM_PLC_MAC_counters_object)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MAC_counters_object(primE_NB_OFDM_PLC_MAC_counters_object);
				if (result == null) result = casePRIME_NB_OFDM_PLC_MAC_counters(primE_NB_OFDM_PLC_MAC_counters_object);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MAC_counters_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_NETWORK_ADMINISTRATION_DATA_OBJECT: {
				PRIME_NB_OFDM_PLC_MAC_network_administration_data_object primE_NB_OFDM_PLC_MAC_network_administration_data_object = (PRIME_NB_OFDM_PLC_MAC_network_administration_data_object)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MAC_network_administration_data_object(primE_NB_OFDM_PLC_MAC_network_administration_data_object);
				if (result == null) result = casePRIME_NB_OFDM_PLC_MACnetworkadmindata(primE_NB_OFDM_PLC_MAC_network_administration_data_object);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MAC_network_administration_data_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_MAC_ADDRESS_SETUP: {
				PRIME_NB_OFDM_PLC_MAC_address_setup primE_NB_OFDM_PLC_MAC_address_setup = (PRIME_NB_OFDM_PLC_MAC_address_setup)theEObject;
				T result = casePRIME_NB_OFDM_PLC_MAC_address_setup(primE_NB_OFDM_PLC_MAC_address_setup);
				if (result == null) result = caseMACaddresssetup(primE_NB_OFDM_PLC_MAC_address_setup);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_MAC_address_setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PRIME_NB_OFDM_PLC_APPLICATION_IDENTIFICATION_OBJECT: {
				PRIME_NB_OFDM_PLC_Application_identification_object primE_NB_OFDM_PLC_Application_identification_object = (PRIME_NB_OFDM_PLC_Application_identification_object)theEObject;
				T result = casePRIME_NB_OFDM_PLC_Application_identification_object(primE_NB_OFDM_PLC_Application_identification_object);
				if (result == null) result = casePRIME_NB_OFDM_PLC_Application_identification(primE_NB_OFDM_PLC_Application_identification_object);
				if (result == null) result = caseBase(primE_NB_OFDM_PLC_Application_identification_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.G3_PLC_MAC_LAYER_COUNTERS_OBJECT: {
				G3_PLC_MAC_layer_counters_object g3_PLC_MAC_layer_counters_object = (G3_PLC_MAC_layer_counters_object)theEObject;
				T result = caseG3_PLC_MAC_layer_counters_object(g3_PLC_MAC_layer_counters_object);
				if (result == null) result = caseG3_PLC_MAC_layer_counters(g3_PLC_MAC_layer_counters_object);
				if (result == null) result = caseBase(g3_PLC_MAC_layer_counters_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.G3_PLC_MAC_SETUP_OBJECT: {
				G3_PLC_MAC_setup_object g3_PLC_MAC_setup_object = (G3_PLC_MAC_setup_object)theEObject;
				T result = caseG3_PLC_MAC_setup_object(g3_PLC_MAC_setup_object);
				if (result == null) result = caseG3_PLC_MAC_setup(g3_PLC_MAC_setup_object);
				if (result == null) result = caseBase(g3_PLC_MAC_setup_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.G3_PLC_6LO_WPAN_ADAPTATION_LAYER_SETUP_OBJECT: {
				G3_PLC_6LoWPAN_adaptation_layer_setup_object g3_PLC_6LoWPAN_adaptation_layer_setup_object = (G3_PLC_6LoWPAN_adaptation_layer_setup_object)theEObject;
				T result = caseG3_PLC_6LoWPAN_adaptation_layer_setup_object(g3_PLC_6LoWPAN_adaptation_layer_setup_object);
				if (result == null) result = caseG3_PLC_6LoWPAN(g3_PLC_6LoWPAN_adaptation_layer_setup_object);
				if (result == null) result = caseBase(g3_PLC_6LoWPAN_adaptation_layer_setup_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ZIG_BEE_SAS_STARTUP_OBJECT: {
				ZigBee_SAS_startup_object zigBee_SAS_startup_object = (ZigBee_SAS_startup_object)theEObject;
				T result = caseZigBee_SAS_startup_object(zigBee_SAS_startup_object);
				if (result == null) result = caseZigBee_SAS_startup(zigBee_SAS_startup_object);
				if (result == null) result = caseBase(zigBee_SAS_startup_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ZIG_BEE_SAS_JOIN_OBJECT: {
				ZigBee_SAS_join_object zigBee_SAS_join_object = (ZigBee_SAS_join_object)theEObject;
				T result = caseZigBee_SAS_join_object(zigBee_SAS_join_object);
				if (result == null) result = caseZigBee_SAS_join(zigBee_SAS_join_object);
				if (result == null) result = caseBase(zigBee_SAS_join_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ZIG_BEE_SAS_APS_FRAGMENTATION_OBJECT: {
				ZigBee_SAS_APS_fragmentation_object zigBee_SAS_APS_fragmentation_object = (ZigBee_SAS_APS_fragmentation_object)theEObject;
				T result = caseZigBee_SAS_APS_fragmentation_object(zigBee_SAS_APS_fragmentation_object);
				if (result == null) result = caseZigBee_SAS_APS_fragmentation(zigBee_SAS_APS_fragmentation_object);
				if (result == null) result = caseBase(zigBee_SAS_APS_fragmentation_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ZIG_BEE_NETWORK_CONTROL_OBJECT: {
				ZigBee_network_control_object zigBee_network_control_object = (ZigBee_network_control_object)theEObject;
				T result = caseZigBee_network_control_object(zigBee_network_control_object);
				if (result == null) result = caseZigBeenetworkcontrol(zigBee_network_control_object);
				if (result == null) result = caseBase(zigBee_network_control_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ZIG_BEE_TUNNEL_SETUP_OBJECT: {
				ZigBee_tunnel_setup_object zigBee_tunnel_setup_object = (ZigBee_tunnel_setup_object)theEObject;
				T result = caseZigBee_tunnel_setup_object(zigBee_tunnel_setup_object);
				if (result == null) result = caseZigBeetunnelsetup(zigBee_tunnel_setup_object);
				if (result == null) result = caseBase(zigBee_tunnel_setup_object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.CURRENT_ASSOCIATION: {
				CurrentAssociation currentAssociation = (CurrentAssociation)theEObject;
				T result = caseCurrentAssociation(currentAssociation);
				if (result == null) result = caseAssociationLN(currentAssociation);
				if (result == null) result = caseBase(currentAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SAP_ASSIGNMENT_CURRENT: {
				SAPAssignmentCurrent sapAssignmentCurrent = (SAPAssignmentCurrent)theEObject;
				T result = caseSAPAssignmentCurrent(sapAssignmentCurrent);
				if (result == null) result = caseSAPAssignment(sapAssignmentCurrent);
				if (result == null) result = caseBase(sapAssignmentCurrent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.SECURITY_SETUP_OBJECT: {
				SecuritySetupObject securitySetupObject = (SecuritySetupObject)theEObject;
				T result = caseSecuritySetupObject(securitySetupObject);
				if (result == null) result = caseSecuritysetup(securitySetupObject);
				if (result == null) result = caseBase(securitySetupObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.INVOCATION_COUNTER: {
				InvocationCounter invocationCounter = (InvocationCounter)theEObject;
				T result = caseInvocationCounter(invocationCounter);
				if (result == null) result = caseData(invocationCounter);
				if (result == null) result = caseBase(invocationCounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.DATA_PROTECTION_OBJECT: {
				DataProtectionObject dataProtectionObject = (DataProtectionObject)theEObject;
				T result = caseDataProtectionObject(dataProtectionObject);
				if (result == null) result = caseDataprotection(dataProtectionObject);
				if (result == null) result = caseBase(dataProtectionObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IMAGE_TRANSFER_OBJECT: {
				ImageTransferObject imageTransferObject = (ImageTransferObject)theEObject;
				T result = caseImageTransferObject(imageTransferObject);
				if (result == null) result = caseImagetransfer(imageTransferObject);
				if (result == null) result = caseBase(imageTransferObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.UTILITIES_TABLE_OBJECT: {
				UtilitiesTableObject utilitiesTableObject = (UtilitiesTableObject)theEObject;
				T result = caseUtilitiesTableObject(utilitiesTableObject);
				if (result == null) result = caseUtilitytables(utilitiesTableObject);
				if (result == null) result = caseBase(utilitiesTableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.COMPACT_DATA_OBJECT: {
				CompactDataObject compactDataObject = (CompactDataObject)theEObject;
				T result = caseCompactDataObject(compactDataObject);
				if (result == null) result = caseCompactdata(compactDataObject);
				if (result == null) result = caseBase(compactDataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.DEVICE_ID: {
				DeviceID deviceID = (DeviceID)theEObject;
				T result = caseDeviceID(deviceID);
				if (result == null) result = caseData(deviceID);
				if (result == null) result = caseBase(deviceID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.METERING_POINT_ID: {
				MeteringPointID meteringPointID = (MeteringPointID)theEObject;
				T result = caseMeteringPointID(meteringPointID);
				if (result == null) result = caseData(meteringPointID);
				if (result == null) result = caseBase(meteringPointID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT: {
				ParameterChangesObject parameterChangesObject = (ParameterChangesObject)theEObject;
				T result = caseParameterChangesObject(parameterChangesObject);
				if (result == null) result = caseData(parameterChangesObject);
				if (result == null) result = caseBase(parameterChangesObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IOCONTROL_SIGNAL_OBJECTS_CONTENTSMANUFACTURERSPECIFIC: {
				I_O_control_signal_objects_contentsmanufacturerspecific i_O_control_signal_objects_contentsmanufacturerspecific = (I_O_control_signal_objects_contentsmanufacturerspecific)theEObject;
				T result = caseI_O_control_signal_objects_contentsmanufacturerspecific(i_O_control_signal_objects_contentsmanufacturerspecific);
				if (result == null) result = caseData(i_O_control_signal_objects_contentsmanufacturerspecific);
				if (result == null) result = caseBase(i_O_control_signal_objects_contentsmanufacturerspecific);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IOCONTROL_SIGNAL_OBJECTS_CONTENTSMAPPEDTOAREFERENCETABLE: {
				I_O_control_signal_objects_contentsmappedtoareferencetable i_O_control_signal_objects_contentsmappedtoareferencetable = (I_O_control_signal_objects_contentsmappedtoareferencetable)theEObject;
				T result = caseI_O_control_signal_objects_contentsmappedtoareferencetable(i_O_control_signal_objects_contentsmappedtoareferencetable);
				if (result == null) result = caseStatusmapping(i_O_control_signal_objects_contentsmappedtoareferencetable);
				if (result == null) result = caseBase(i_O_control_signal_objects_contentsmappedtoareferencetable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IOCONTROL_SIGNAL_OBJECTS_GLOBAL: {
				I_O_control_signal_objects_global i_O_control_signal_objects_global = (I_O_control_signal_objects_global)theEObject;
				T result = caseI_O_control_signal_objects_global(i_O_control_signal_objects_global);
				if (result == null) result = caseProfilegeneric(i_O_control_signal_objects_global);
				if (result == null) result = caseBase(i_O_control_signal_objects_global);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IO_CONTROL_SIGNALS_MANUFACTURER: {
				IOControlSignalsManufacturer ioControlSignalsManufacturer = (IOControlSignalsManufacturer)theEObject;
				T result = caseIOControlSignalsManufacturer(ioControlSignalsManufacturer);
				if (result == null) result = caseData(ioControlSignalsManufacturer);
				if (result == null) result = caseBase(ioControlSignalsManufacturer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IO_CONTROL_SIGNALS_MAPPED: {
				IOControlSignalsMapped ioControlSignalsMapped = (IOControlSignalsMapped)theEObject;
				T result = caseIOControlSignalsMapped(ioControlSignalsMapped);
				if (result == null) result = caseStatusmapping(ioControlSignalsMapped);
				if (result == null) result = caseBase(ioControlSignalsMapped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.IO_CONTROL_SIGNALS_GLOBAL: {
				IOControlSignalsGlobal ioControlSignalsGlobal = (IOControlSignalsGlobal)theEObject;
				T result = caseIOControlSignalsGlobal(ioControlSignalsGlobal);
				if (result == null) result = caseProfilegeneric(ioControlSignalsGlobal);
				if (result == null) result = caseBase(ioControlSignalsGlobal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.DISCONNECT_CONTROL_OBJECT: {
				DisconnectControlObject disconnectControlObject = (DisconnectControlObject)theEObject;
				T result = caseDisconnectControlObject(disconnectControlObject);
				if (result == null) result = caseInterfaceClasses_DisconnectControl(disconnectControlObject);
				if (result == null) result = caseBase(disconnectControlObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.GENERAL_PURPOSE_ARBITRATOR: {
				GeneralPurposeArbitrator generalPurposeArbitrator = (GeneralPurposeArbitrator)theEObject;
				T result = caseGeneralPurposeArbitrator(generalPurposeArbitrator);
				if (result == null) result = caseArbitrator(generalPurposeArbitrator);
				if (result == null) result = caseBase(generalPurposeArbitrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.INTERNAL_CONTROL_MANU: {
				InternalControlManu internalControlManu = (InternalControlManu)theEObject;
				T result = caseInternalControlManu(internalControlManu);
				if (result == null) result = caseData(internalControlManu);
				if (result == null) result = caseBase(internalControlManu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.INTERNAL_CONTROL_MAPPED: {
				InternalControlMapped internalControlMapped = (InternalControlMapped)theEObject;
				T result = caseInternalControlMapped(internalControlMapped);
				if (result == null) result = caseStatusmapping(internalControlMapped);
				if (result == null) result = caseBase(internalControlMapped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.INTERNAL_CONTROL_GLOBAL: {
				InternalControlGlobal internalControlGlobal = (InternalControlGlobal)theEObject;
				T result = caseInternalControlGlobal(internalControlGlobal);
				if (result == null) result = caseProfilegeneric(internalControlGlobal);
				if (result == null) result = caseBase(internalControlGlobal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.INTERNAL_OPERATING_STATUS_MANU: {
				InternalOperatingStatusManu internalOperatingStatusManu = (InternalOperatingStatusManu)theEObject;
				T result = caseInternalOperatingStatusManu(internalOperatingStatusManu);
				if (result == null) result = caseData(internalOperatingStatusManu);
				if (result == null) result = caseBase(internalOperatingStatusManu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.INTERNAL_OPERATING_STATUS_MAPPED: {
				InternalOperatingStatusMapped internalOperatingStatusMapped = (InternalOperatingStatusMapped)theEObject;
				T result = caseInternalOperatingStatusMapped(internalOperatingStatusMapped);
				if (result == null) result = caseStatusmapping(internalOperatingStatusMapped);
				if (result == null) result = caseBase(internalOperatingStatusMapped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.INTERNAL_OPERATING_STATUS_GLOBAL: {
				InternalOperatingStatusGlobal internalOperatingStatusGlobal = (InternalOperatingStatusGlobal)theEObject;
				T result = caseInternalOperatingStatusGlobal(internalOperatingStatusGlobal);
				if (result == null) result = caseRegistertable(internalOperatingStatusGlobal);
				if (result == null) result = caseBase(internalOperatingStatusGlobal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.STATUS_REGISTER_MANU: {
				StatusRegisterManu statusRegisterManu = (StatusRegisterManu)theEObject;
				T result = caseStatusRegisterManu(statusRegisterManu);
				if (result == null) result = caseData(statusRegisterManu);
				if (result == null) result = caseBase(statusRegisterManu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.STATUS_REGISTER_MAPPED: {
				StatusRegisterMapped statusRegisterMapped = (StatusRegisterMapped)theEObject;
				T result = caseStatusRegisterMapped(statusRegisterMapped);
				if (result == null) result = caseStatusmapping(statusRegisterMapped);
				if (result == null) result = caseBase(statusRegisterMapped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ERROR_REGISTER_OBJECT: {
				ErrorRegisterObject errorRegisterObject = (ErrorRegisterObject)theEObject;
				T result = caseErrorRegisterObject(errorRegisterObject);
				if (result == null) result = caseData(errorRegisterObject);
				if (result == null) result = caseBase(errorRegisterObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ERROR_PROFILE_OBJECT: {
				ErrorProfileObject errorProfileObject = (ErrorProfileObject)theEObject;
				T result = caseErrorProfileObject(errorProfileObject);
				if (result == null) result = caseProfilegeneric(errorProfileObject);
				if (result == null) result = caseBase(errorProfileObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ERROR_TABLE_OBJECT: {
				ErrorTableObject errorTableObject = (ErrorTableObject)theEObject;
				T result = caseErrorTableObject(errorTableObject);
				if (result == null) result = caseRegistertable(errorTableObject);
				if (result == null) result = caseBase(errorTableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ALARM_REGISTER_OBJECT: {
				AlarmRegisterObject alarmRegisterObject = (AlarmRegisterObject)theEObject;
				T result = caseAlarmRegisterObject(alarmRegisterObject);
				if (result == null) result = caseData(alarmRegisterObject);
				if (result == null) result = caseBase(alarmRegisterObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ALARM_FILTER_OBJECT: {
				AlarmFilterObject alarmFilterObject = (AlarmFilterObject)theEObject;
				T result = caseAlarmFilterObject(alarmFilterObject);
				if (result == null) result = caseData(alarmFilterObject);
				if (result == null) result = caseBase(alarmFilterObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ALARM_DESCRIPTOR_OBJECT: {
				AlarmDescriptorObject alarmDescriptorObject = (AlarmDescriptorObject)theEObject;
				T result = caseAlarmDescriptorObject(alarmDescriptorObject);
				if (result == null) result = caseData(alarmDescriptorObject);
				if (result == null) result = caseBase(alarmDescriptorObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.EVENT_LOG: {
				EventLog eventLog = (EventLog)theEObject;
				T result = caseEventLog(eventLog);
				if (result == null) result = caseProfilegeneric(eventLog);
				if (result == null) result = caseBase(eventLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_ID: {
				ElectricityID electricityID = (ElectricityID)theEObject;
				T result = caseElectricityID(electricityID);
				if (result == null) result = caseData(electricityID);
				if (result == null) result = caseBase(electricityID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_PROGRAM_ENTRIES: {
				ElectricityProgramEntries electricityProgramEntries = (ElectricityProgramEntries)theEObject;
				T result = caseElectricityProgramEntries(electricityProgramEntries);
				if (result == null) result = caseData(electricityProgramEntries);
				if (result == null) result = caseBase(electricityProgramEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.OUTPUT_PULSE_VALUES_CONSTANTS: {
				OutputPulseValues_constants outputPulseValues_constants = (OutputPulseValues_constants)theEObject;
				T result = caseOutputPulseValues_constants(outputPulseValues_constants);
				if (result == null) result = caseData(outputPulseValues_constants);
				if (result == null) result = caseBase(outputPulseValues_constants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.READING_FACTOR_AND_CT_VTRATIO: {
				ReadingFactorAndCT_VTratio readingFactorAndCT_VTratio = (ReadingFactorAndCT_VTratio)theEObject;
				T result = caseReadingFactorAndCT_VTratio(readingFactorAndCT_VTratio);
				if (result == null) result = caseData(readingFactorAndCT_VTratio);
				if (result == null) result = caseBase(readingFactorAndCT_VTratio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_NOMINAL_VALUES: {
				ElectricityNominalValues electricityNominalValues = (ElectricityNominalValues)theEObject;
				T result = caseElectricityNominalValues(electricityNominalValues);
				if (result == null) result = caseData(electricityNominalValues);
				if (result == null) result = caseBase(electricityNominalValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS: {
				InputPulseValuesOrConstants inputPulseValuesOrConstants = (InputPulseValuesOrConstants)theEObject;
				T result = caseInputPulseValuesOrConstants(inputPulseValuesOrConstants);
				if (result == null) result = caseData(inputPulseValuesOrConstants);
				if (result == null) result = caseBase(inputPulseValuesOrConstants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MEASUREMENT_PERIOD_RECORDING_INTERVAL_BILLING_PERIOD_DURATION: {
				MeasurementPeriod_recordingInterval_billingPeriodDuration measurementPeriod_recordingInterval_billingPeriodDuration = (MeasurementPeriod_recordingInterval_billingPeriodDuration)theEObject;
				T result = caseMeasurementPeriod_recordingInterval_billingPeriodDuration(measurementPeriod_recordingInterval_billingPeriodDuration);
				if (result == null) result = caseData(measurementPeriod_recordingInterval_billingPeriodDuration);
				if (result == null) result = caseBase(measurementPeriod_recordingInterval_billingPeriodDuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_TIME_ENTRIES: {
				ElectricityTimeEntries electricityTimeEntries = (ElectricityTimeEntries)theEObject;
				T result = caseElectricityTimeEntries(electricityTimeEntries);
				if (result == null) result = caseData(electricityTimeEntries);
				if (result == null) result = caseBase(electricityTimeEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.COEFFICIENTS: {
				Coefficients coefficients = (Coefficients)theEObject;
				T result = caseCoefficients(coefficients);
				if (result == null) result = caseData(coefficients);
				if (result == null) result = caseBase(coefficients);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MEASUREMENT_METHODS: {
				MeasurementMethods measurementMethods = (MeasurementMethods)theEObject;
				T result = caseMeasurementMethods(measurementMethods);
				if (result == null) result = caseData(measurementMethods);
				if (result == null) result = caseBase(measurementMethods);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_METERING_POINT_ID: {
				ElectricityMeteringPointID electricityMeteringPointID = (ElectricityMeteringPointID)theEObject;
				T result = caseElectricityMeteringPointID(electricityMeteringPointID);
				if (result == null) result = caseData(electricityMeteringPointID);
				if (result == null) result = caseBase(electricityMeteringPointID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA: {
				ElectricityRelatedStatusData electricityRelatedStatusData = (ElectricityRelatedStatusData)theEObject;
				T result = caseElectricityRelatedStatusData(electricityRelatedStatusData);
				if (result == null) result = caseData(electricityRelatedStatusData);
				if (result == null) result = caseBase(electricityRelatedStatusData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_RELATED_STATUS_DATA_MAPPED: {
				ElectricityRelatedStatusDataMapped electricityRelatedStatusDataMapped = (ElectricityRelatedStatusDataMapped)theEObject;
				T result = caseElectricityRelatedStatusDataMapped(electricityRelatedStatusDataMapped);
				if (result == null) result = caseStatusmapping(electricityRelatedStatusDataMapped);
				if (result == null) result = caseBase(electricityRelatedStatusDataMapped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.BATTERY_ENTRIES: {
				BatteryEntries batteryEntries = (BatteryEntries)theEObject;
				T result = caseBatteryEntries(batteryEntries);
				if (result == null) result = caseData(batteryEntries);
				if (result == null) result = caseBase(batteryEntries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.POWER_FAILURE_MONITORING: {
				PowerFailureMonitoring powerFailureMonitoring = (PowerFailureMonitoring)theEObject;
				T result = casePowerFailureMonitoring(powerFailureMonitoring);
				if (result == null) result = caseData(powerFailureMonitoring);
				if (result == null) result = caseBase(powerFailureMonitoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.OPERATING_TIME: {
				OperatingTime operatingTime = (OperatingTime)theEObject;
				T result = caseOperatingTime(operatingTime);
				if (result == null) result = caseData(operatingTime);
				if (result == null) result = caseBase(operatingTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ENVIRONMENT_RELATED_PARAMETERS: {
				EnvironmentRelatedParameters environmentRelatedParameters = (EnvironmentRelatedParameters)theEObject;
				T result = caseEnvironmentRelatedParameters(environmentRelatedParameters);
				if (result == null) result = caseRegister(environmentRelatedParameters);
				if (result == null) result = caseData(environmentRelatedParameters);
				if (result == null) result = caseBase(environmentRelatedParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.STATUS_REGISTER: {
				StatusRegister statusRegister = (StatusRegister)theEObject;
				T result = caseStatusRegister(statusRegister);
				if (result == null) result = caseRegister(statusRegister);
				if (result == null) result = caseData(statusRegister);
				if (result == null) result = caseBase(statusRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.EVENT_CODE: {
				EventCode eventCode = (EventCode)theEObject;
				T result = caseEventCode(eventCode);
				if (result == null) result = caseData(eventCode);
				if (result == null) result = caseBase(eventCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.COMMUNICATION_PORT_LOG_PARAMETERS: {
				CommunicationPortLogParameters communicationPortLogParameters = (CommunicationPortLogParameters)theEObject;
				T result = caseCommunicationPortLogParameters(communicationPortLogParameters);
				if (result == null) result = caseData(communicationPortLogParameters);
				if (result == null) result = caseBase(communicationPortLogParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.CONSUMER_MESSAGE: {
				ConsumerMessage consumerMessage = (ConsumerMessage)theEObject;
				T result = caseConsumerMessage(consumerMessage);
				if (result == null) result = caseData(consumerMessage);
				if (result == null) result = caseBase(consumerMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.CURRENTLY_ACTIVE_TARIFF: {
				CurrentlyActiveTariff currentlyActiveTariff = (CurrentlyActiveTariff)theEObject;
				T result = caseCurrentlyActiveTariff(currentlyActiveTariff);
				if (result == null) result = caseData(currentlyActiveTariff);
				if (result == null) result = caseBase(currentlyActiveTariff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.EVENT_COUNTER_OBJECT: {
				EventCounterObject eventCounterObject = (EventCounterObject)theEObject;
				T result = caseEventCounterObject(eventCounterObject);
				if (result == null) result = caseData(eventCounterObject);
				if (result == null) result = caseBase(eventCounterObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.PROFILE_ENTRY_DIGITAL_SIGNATURE_OBJECT: {
				ProfileEntryDigitalSignatureObject profileEntryDigitalSignatureObject = (ProfileEntryDigitalSignatureObject)theEObject;
				T result = caseProfileEntryDigitalSignatureObject(profileEntryDigitalSignatureObject);
				if (result == null) result = caseData(profileEntryDigitalSignatureObject);
				if (result == null) result = caseBase(profileEntryDigitalSignatureObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.METER_TEMPER_EVENT_RELATED_OBJECT: {
				MeterTemperEventRelatedObject meterTemperEventRelatedObject = (MeterTemperEventRelatedObject)theEObject;
				T result = caseMeterTemperEventRelatedObject(meterTemperEventRelatedObject);
				if (result == null) result = caseData(meterTemperEventRelatedObject);
				if (result == null) result = caseBase(meterTemperEventRelatedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_VALUES: {
				ElectricityValues electricityValues = (ElectricityValues)theEObject;
				T result = caseElectricityValues(electricityValues);
				if (result == null) result = caseData(electricityValues);
				if (result == null) result = caseBase(electricityValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.MEASUREMENT_VALUES: {
				MeasurementValues measurementValues = (MeasurementValues)theEObject;
				T result = caseMeasurementValues(measurementValues);
				if (result == null) result = caseData(measurementValues);
				if (result == null) result = caseBase(measurementValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.ELECTRICITY_HARMONICS: {
				ElectricityHarmonics electricityHarmonics = (ElectricityHarmonics)theEObject;
				T result = caseElectricityHarmonics(electricityHarmonics);
				if (result == null) result = caseData(electricityHarmonics);
				if (result == null) result = caseBase(electricityHarmonics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.EXTENDED_PHASE_ANGLE_MEASUREMENT: {
				ExtendedPhaseAngleMeasurement extendedPhaseAngleMeasurement = (ExtendedPhaseAngleMeasurement)theEObject;
				T result = caseExtendedPhaseAngleMeasurement(extendedPhaseAngleMeasurement);
				if (result == null) result = caseData(extendedPhaseAngleMeasurement);
				if (result == null) result = caseBase(extendedPhaseAngleMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case COSEMObjectsPackage.TRANSFORMER_AND_LINE_LOSSES: {
				TransformerAndLineLosses transformerAndLineLosses = (TransformerAndLineLosses)theEObject;
				T result = caseTransformerAndLineLosses(transformerAndLineLosses);
				if (result == null) result = caseData(transformerAndLineLosses);
				if (result == null) result = caseBase(transformerAndLineLosses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramEntries(ProgramEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billing Period Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billing Period Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillingPeriodValues(BillingPeriodValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEntries(TimeEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UNIX Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UNIX Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUNIXClock(UNIXClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modem Configuration Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modem Configuration Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModemConfigurationObject(ModemConfigurationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Connect Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Connect Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoConnectObject(AutoConnectObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Answer Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Answer Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoAnswerObject(AutoAnswerObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptTable(ScriptTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Meter Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Meter Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalMeterReset(GlobalMeterReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDI Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDI Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDIReset(MDIReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tariffication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tariffication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTariffication(Tariffication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activate Test Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activate Test Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivateTestMode(ActivateTestMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activate Normal Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activate Normal Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivateNormalMode(ActivateNormalMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Output Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Output Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOutputSignal(SetOutputSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Optical Test Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Optical Test Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchOpticalTestOutput(SwitchOpticalTestOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Quality Measurement Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Quality Measurement Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerQualityMeasurementManagement(PowerQualityMeasurementManagement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Image Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageActivation(ImageActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePush(Push object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcast(Broadcast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Days</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Days</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialDays(SpecialDays object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleObject(ScheduleObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Calendar Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Calendar Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityCalendarObject(ActivityCalendarObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Activation Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Activation Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterActivationObject(RegisterActivationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Action Schedule Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Action Schedule Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleActionScheduleObject(SingleActionScheduleObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnect Control Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnect Control Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnectControlSchedule(DisconnectControlSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Of Billing Period Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Of Billing Period Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndOfBillingPeriodSchedule(EndOfBillingPeriodSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Activation Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Activation Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageActivationSchedule(ImageActivationSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Control Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Control Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputControlSchedule(OutputControlSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushSchedule(PushSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Monitor Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Monitor Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterMonitorObject(RegisterMonitorObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmMonitor(AlarmMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Monitor Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Monitor Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterMonitorObject(ParameterMonitorObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limiter Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limiter Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimiterObject(LimiterObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountObject(AccountObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditObject(CreditObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeObject(ChargeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Gateway Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Gateway Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenGatewayObject(TokenGatewayObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Credit Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Credit Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxCreditLimit(MaxCreditLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Vend Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Vend Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxVendLimit(MaxVendLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Optical Port Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Optical Port Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECOpticalPortSetup(IECOpticalPortSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Electrical Port Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Electrical Port Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECElectricalPortSetup(IECElectricalPortSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Readout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Readout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardReadout(StandardReadout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Readout Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Readout Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardReadoutParam(StandardReadoutParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IECHDLC Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IECHDLC Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECHDLCSetupObject(IECHDLCSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Twisted Pair Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Twisted Pair Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECTwistedPairSetupObject(IECTwistedPairSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Twisted Pair MAC Address Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Twisted Pair MAC Address Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECTwistedPairMACAddressSetup(IECTwistedPairMACAddressSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Twisted Pair Fatal Error Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Twisted Pair Fatal Error Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECTwistedPairFatalErrorRegister(IECTwistedPairFatalErrorRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC62056 31Short Readout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC62056 31Short Readout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC62056_3_1ShortReadout(IEC62056_3_1ShortReadout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC62056 31Long Readout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC62056 31Long Readout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC62056_3_1LongReadout(IEC62056_3_1LongReadout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC 62056 31Alternate Readout Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC 62056 31Alternate Readout Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC_62056_3_1AlternateReadoutProfile(IEC_62056_3_1AlternateReadoutProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus Slave Port Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus Slave Port Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_BusSlavePortSetupObject(M_BusSlavePortSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus Client Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus Client Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_BusClientObject(M_BusClientObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_BusValue(M_BusValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus Profile Generic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus Profile Generic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_BusProfileGeneric(M_BusProfileGeneric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus Disconnect Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus Disconnect Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_BusDisconnectControl(M_BusDisconnectControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus Control Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus Control Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_BusControlLog(M_BusControlLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus Master Port Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus Master Port Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_BusMasterPortSetupObject(M_BusMasterPortSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wireless Mode QChannel Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wireless Mode QChannel Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirelessModeQChannelObject(WirelessModeQChannelObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DLMS COSEM Server MBus Port Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DLMS COSEM Server MBus Port Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDLMS_COSEMServerM_BusPortSetupObject(DLMS_COSEMServerM_BusPortSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBus Diagnostic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBus Diagnostic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM_BusDiagnosticObject(M_BusDiagnosticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP UDP Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP UDP Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCP_UDPSetupObject(TCP_UDPSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPv4 Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPv4 Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPv4SetupObject(IPv4SetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAC Address Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAC Address Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMACAddressSetupObject(MACAddressSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPP Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPP Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPPSetupObject(PPPSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPRS Modem Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPRS Modem Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPRSModemSetupObject(GPRSModemSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMTP Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMTP Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMTPSetupObject(SMTPSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSM Diagnostic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSM Diagnostic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSMDiagnosticObject(GSMDiagnosticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPv6 Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPv6 Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPv6SetupObject(IPv6SetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushSetupObject(PushSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSK Phy MAC Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSK Phy MAC Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKPhy_MACSetupObject(S_FSKPhy_MACSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSK Active Initiator Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSK Active Initiator Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKActiveInitiatorObject(S_FSKActiveInitiatorObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSKMAC Synchronization Timeouts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSKMAC Synchronization Timeouts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKMACSynchronizationTimeouts(S_FSKMACSynchronizationTimeouts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSKMAC Counters Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSKMAC Counters Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKMACCountersObject(S_FSKMACCountersObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC61334 432LLC Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC61334 432LLC Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEC61334_4_32LLCSetupObject(IEC61334_4_32LLCSetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFSK Reporting System List Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFSK Reporting System List Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseS_FSKReportingSystemListObject(S_FSKReportingSystemListObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISO IEC8802 2LLC Type1 Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISO IEC8802 2LLC Type1 Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISO_IEC8802_2LLCType1SetupObject(ISO_IEC8802_2LLCType1SetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISO IEC8802 2LLC Type2 Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISO IEC8802 2LLC Type2 Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISO_IEC8802_2LLCType2Setup(ISO_IEC8802_2LLCType2Setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISO IEC8802 2LLC Type3 Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISO IEC8802 2LLC Type3 Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISO_IEC8802_2LLCType3Setup(ISO_IEC8802_2LLCType3Setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>t61334 432LLCSSC Ssetupobject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>t61334 432LLCSSC Ssetupobject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caset61334_4_32LLCSSCSsetupobject(t61334_4_32LLCSSCSsetupobject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC Physical layer counters object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC Physical layer counters object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_Physical_layer_counters_object(PRIME_NB_OFDM_PLC_Physical_layer_counters_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC setup object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC setup object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MAC_setup_object(PRIME_NB_OFDM_PLC_MAC_setup_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC functional parameters object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC functional parameters object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MAC_functional_parameters_object(PRIME_NB_OFDM_PLC_MAC_functional_parameters_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC counters object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC counters object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MAC_counters_object(PRIME_NB_OFDM_PLC_MAC_counters_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC network administration data object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC network administration data object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MAC_network_administration_data_object(PRIME_NB_OFDM_PLC_MAC_network_administration_data_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC address setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC MAC address setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_MAC_address_setup(PRIME_NB_OFDM_PLC_MAC_address_setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC Application identification object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRIME NB OFDM PLC Application identification object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRIME_NB_OFDM_PLC_Application_identification_object(PRIME_NB_OFDM_PLC_Application_identification_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 PLC MAC layer counters object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 PLC MAC layer counters object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_PLC_MAC_layer_counters_object(G3_PLC_MAC_layer_counters_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 PLC MAC setup object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 PLC MAC setup object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_PLC_MAC_setup_object(G3_PLC_MAC_setup_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 PLC 6Lo WPAN adaptation layer setup object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 PLC 6Lo WPAN adaptation layer setup object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_PLC_6LoWPAN_adaptation_layer_setup_object(G3_PLC_6LoWPAN_adaptation_layer_setup_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Bee SAS startup object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Bee SAS startup object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBee_SAS_startup_object(ZigBee_SAS_startup_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Bee SAS join object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Bee SAS join object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBee_SAS_join_object(ZigBee_SAS_join_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Bee SAS APS fragmentation object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Bee SAS APS fragmentation object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBee_SAS_APS_fragmentation_object(ZigBee_SAS_APS_fragmentation_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Bee network control object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Bee network control object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBee_network_control_object(ZigBee_network_control_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zig Bee tunnel setup object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zig Bee tunnel setup object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZigBee_tunnel_setup_object(ZigBee_tunnel_setup_object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentAssociation(CurrentAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAP Assignment Current</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAP Assignment Current</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAPAssignmentCurrent(SAPAssignmentCurrent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Setup Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Setup Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuritySetupObject(SecuritySetupObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationCounter(InvocationCounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Protection Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Protection Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProtectionObject(DataProtectionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Transfer Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Transfer Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageTransferObject(ImageTransferObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilities Table Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilities Table Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilitiesTableObject(UtilitiesTableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compact Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compact Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompactDataObject(CompactDataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceID(DeviceID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metering Point ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metering Point ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeteringPointID(MeteringPointID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Changes Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Changes Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterChangesObject(ParameterChangesObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOcontrol signal objects contentsmanufacturerspecific</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOcontrol signal objects contentsmanufacturerspecific</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI_O_control_signal_objects_contentsmanufacturerspecific(I_O_control_signal_objects_contentsmanufacturerspecific object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOcontrol signal objects contentsmappedtoareferencetable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOcontrol signal objects contentsmappedtoareferencetable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI_O_control_signal_objects_contentsmappedtoareferencetable(I_O_control_signal_objects_contentsmappedtoareferencetable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOcontrol signal objects global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOcontrol signal objects global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI_O_control_signal_objects_global(I_O_control_signal_objects_global object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Control Signals Manufacturer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Control Signals Manufacturer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOControlSignalsManufacturer(IOControlSignalsManufacturer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Control Signals Mapped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Control Signals Mapped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOControlSignalsMapped(IOControlSignalsMapped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Control Signals Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Control Signals Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOControlSignalsGlobal(IOControlSignalsGlobal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnect Control Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnect Control Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnectControlObject(DisconnectControlObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Purpose Arbitrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Purpose Arbitrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralPurposeArbitrator(GeneralPurposeArbitrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Control Manu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Control Manu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalControlManu(InternalControlManu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Control Mapped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Control Mapped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalControlMapped(InternalControlMapped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Control Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Control Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalControlGlobal(InternalControlGlobal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Operating Status Manu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Operating Status Manu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalOperatingStatusManu(InternalOperatingStatusManu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Operating Status Mapped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Operating Status Mapped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalOperatingStatusMapped(InternalOperatingStatusMapped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Operating Status Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Operating Status Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalOperatingStatusGlobal(InternalOperatingStatusGlobal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Register Manu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Register Manu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusRegisterManu(StatusRegisterManu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Register Mapped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Register Mapped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusRegisterMapped(StatusRegisterMapped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Register Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Register Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorRegisterObject(ErrorRegisterObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Profile Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Profile Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorProfileObject(ErrorProfileObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Table Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Table Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorTableObject(ErrorTableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Register Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Register Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmRegisterObject(AlarmRegisterObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Filter Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Filter Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmFilterObject(AlarmFilterObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Descriptor Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Descriptor Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmDescriptorObject(AlarmDescriptorObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventLog(EventLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityID(ElectricityID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity Program Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity Program Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityProgramEntries(ElectricityProgramEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pulse Values constants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pulse Values constants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPulseValues_constants(OutputPulseValues_constants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Factor And CT VTratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Factor And CT VTratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingFactorAndCT_VTratio(ReadingFactorAndCT_VTratio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity Nominal Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity Nominal Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityNominalValues(ElectricityNominalValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pulse Values Or Constants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pulse Values Or Constants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPulseValuesOrConstants(InputPulseValuesOrConstants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Period recording Interval billing Period Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Period recording Interval billing Period Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementPeriod_recordingInterval_billingPeriodDuration(MeasurementPeriod_recordingInterval_billingPeriodDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity Time Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity Time Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityTimeEntries(ElectricityTimeEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coefficients</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coefficients</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoefficients(Coefficients object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Methods</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Methods</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementMethods(MeasurementMethods object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity Metering Point ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity Metering Point ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityMeteringPointID(ElectricityMeteringPointID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity Related Status Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity Related Status Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityRelatedStatusData(ElectricityRelatedStatusData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity Related Status Data Mapped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity Related Status Data Mapped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityRelatedStatusDataMapped(ElectricityRelatedStatusDataMapped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Entries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Entries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryEntries(BatteryEntries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Failure Monitoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Failure Monitoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerFailureMonitoring(PowerFailureMonitoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingTime(OperatingTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Related Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Related Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentRelatedParameters(EnvironmentRelatedParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusRegister(StatusRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventCode(EventCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Port Log Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Port Log Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPortLogParameters(CommunicationPortLogParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumerMessage(ConsumerMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currently Active Tariff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currently Active Tariff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentlyActiveTariff(CurrentlyActiveTariff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Counter Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Counter Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventCounterObject(EventCounterObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Entry Digital Signature Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Entry Digital Signature Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileEntryDigitalSignatureObject(ProfileEntryDigitalSignatureObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Temper Event Related Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Temper Event Related Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterTemperEventRelatedObject(MeterTemperEventRelatedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityValues(ElectricityValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementValues(MeasurementValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electricity Harmonics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electricity Harmonics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricityHarmonics(ElectricityHarmonics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Phase Angle Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Phase Angle Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedPhaseAngleMeasurement(ExtendedPhaseAngleMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer And Line Losses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer And Line Losses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerAndLineLosses(TransformerAndLineLosses object) {
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
	public T caseInterfaceClasses_DisconnectControl(COSEM.InterfaceClasses.DisconnectControl object) {
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

} //COSEMObjectsSwitch
