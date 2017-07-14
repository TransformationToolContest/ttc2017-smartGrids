/**
 */
package gluemodel.COSEM.InterfaceClasses.util;

import gluemodel.COSEM.InterfaceClasses.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage
 * @generated
 */
public class InterfaceClassesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfaceClassesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InterfaceClassesPackage.eINSTANCE;
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
	protected InterfaceClassesSwitch<Adapter> modelSwitch =
		new InterfaceClassesSwitch<Adapter>() {
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
			public Adapter casePRIME_NB_OFDM_PLC_MAC_counters(PRIME_NB_OFDM_PLC_MAC_counters object) {
				return createPRIME_NB_OFDM_PLC_MAC_countersAdapter();
			}
			@Override
			public Adapter casePRIME_NB_OFDM_PLC_MAC_functionalparams(PRIME_NB_OFDM_PLC_MAC_functionalparams object) {
				return createPRIME_NB_OFDM_PLC_MAC_functionalparamsAdapter();
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
			public Adapter caseTCP_UDPsetup(TCP_UDPsetup object) {
				return createTCP_UDPsetupAdapter();
			}
			@Override
			public Adapter caseIPv4setup(IPv4setup object) {
				return createIPv4setupAdapter();
			}
			@Override
			public Adapter caseIPv6setup(IPv6setup object) {
				return createIPv6setupAdapter();
			}
			@Override
			public Adapter caseMACaddresssetup(MACaddresssetup object) {
				return createMACaddresssetupAdapter();
			}
			@Override
			public Adapter casePPPsetup(PPPsetup object) {
				return createPPPsetupAdapter();
			}
			@Override
			public Adapter caseSMTPsetup(SMTPsetup object) {
				return createSMTPsetupAdapter();
			}
			@Override
			public Adapter caseModemconfiguration(Modemconfiguration object) {
				return createModemconfigurationAdapter();
			}
			@Override
			public Adapter caseAuto_answer(Auto_answer object) {
				return createAuto_answerAdapter();
			}
			@Override
			public Adapter caseAuto_connect(Auto_connect object) {
				return createAuto_connectAdapter();
			}
			@Override
			public Adapter caseGPRS_modem_setup(GPRS_modem_setup object) {
				return createGPRS_modem_setupAdapter();
			}
			@Override
			public Adapter caseGSM_Diagnostic(GSM_Diagnostic object) {
				return createGSM_DiagnosticAdapter();
			}
			@Override
			public Adapter caseIEC_twisted_pair_setup(IEC_twisted_pair_setup object) {
				return createIEC_twisted_pair_setupAdapter();
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
			public Adapter caseWireless_Mode_Q_Channel(Wireless_Mode_Q_Channel object) {
				return createWireless_Mode_Q_ChannelAdapter();
			}
			@Override
			public Adapter caseM_Bus_master_port_setup(M_Bus_master_port_setup object) {
				return createM_Bus_master_port_setupAdapter();
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
			public Adapter caseScripttable(Scripttable object) {
				return createScripttableAdapter();
			}
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseSchedule(Schedule object) {
				return createScheduleAdapter();
			}
			@Override
			public Adapter caseSpecialdaystable(Specialdaystable object) {
				return createSpecialdaystableAdapter();
			}
			@Override
			public Adapter caseActivitycalendar(Activitycalendar object) {
				return createActivitycalendarAdapter();
			}
			@Override
			public Adapter caseRegistermonitor(Registermonitor object) {
				return createRegistermonitorAdapter();
			}
			@Override
			public Adapter caseSingleactionschedule(Singleactionschedule object) {
				return createSingleactionscheduleAdapter();
			}
			@Override
			public Adapter caseParametermonitor(Parametermonitor object) {
				return createParametermonitorAdapter();
			}
			@Override
			public Adapter caseSensormanager(Sensormanager object) {
				return createSensormanagerAdapter();
			}
			@Override
			public Adapter caseArbitrator(Arbitrator object) {
				return createArbitratorAdapter();
			}
			@Override
			public Adapter caseDisconnectControl(DisconnectControl object) {
				return createDisconnectControlAdapter();
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
			public Adapter caseIEC_HDLC_setup(IEC_HDLC_setup object) {
				return createIEC_HDLC_setupAdapter();
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
			public Adapter caseRegister(Register object) {
				return createRegisterAdapter();
			}
			@Override
			public Adapter caseSAPAssignment(SAPAssignment object) {
				return createSAPAssignmentAdapter();
			}
			@Override
			public Adapter caseAssociationLN(AssociationLN object) {
				return createAssociationLNAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseExtendedRegister(ExtendedRegister object) {
				return createExtendedRegisterAdapter();
			}
			@Override
			public Adapter caseDemandRegister(DemandRegister object) {
				return createDemandRegisterAdapter();
			}
			@Override
			public Adapter caseRegisterActivation(RegisterActivation object) {
				return createRegisterActivationAdapter();
			}
			@Override
			public Adapter caseProfilegeneric(Profilegeneric object) {
				return createProfilegenericAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseUtilitytables(Utilitytables object) {
				return createUtilitytablesAdapter();
			}
			@Override
			public Adapter caseRegistertable(Registertable object) {
				return createRegistertableAdapter();
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
			public Adapter caseAssociationSN(AssociationSN object) {
				return createAssociationSNAdapter();
			}
			@Override
			public Adapter caseImagetransfer(Imagetransfer object) {
				return createImagetransferAdapter();
			}
			@Override
			public Adapter caseDataprotection(Dataprotection object) {
				return createDataprotectionAdapter();
			}
			@Override
			public Adapter casePushsetup(Pushsetup object) {
				return createPushsetupAdapter();
			}
			@Override
			public Adapter caseSecuritysetup(Securitysetup object) {
				return createSecuritysetupAdapter();
			}
			@Override
			public Adapter caseClock(Clock object) {
				return createClockAdapter();
			}
			@Override
			public Adapter caseApplicationAssociation(ApplicationAssociation object) {
				return createApplicationAssociationAdapter();
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
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
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
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Sensormanager <em>Sensormanager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Sensormanager
	 * @generated
	 */
	public Adapter createSensormanagerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.DisconnectControl <em>Disconnect Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.DisconnectControl
	 * @generated
	 */
	public Adapter createDisconnectControlAdapter() {
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
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.DemandRegister <em>Demand Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.DemandRegister
	 * @generated
	 */
	public Adapter createDemandRegisterAdapter() {
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
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.AssociationSN <em>Association SN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.AssociationSN
	 * @generated
	 */
	public Adapter createAssociationSNAdapter() {
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
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.COSEM.InterfaceClasses.ApplicationAssociation <em>Application Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.COSEM.InterfaceClasses.ApplicationAssociation
	 * @generated
	 */
	public Adapter createApplicationAssociationAdapter() {
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

} //InterfaceClassesAdapterFactory
