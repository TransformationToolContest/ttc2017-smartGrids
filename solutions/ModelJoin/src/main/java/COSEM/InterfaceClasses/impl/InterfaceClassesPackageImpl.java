/**
 */
package COSEM.InterfaceClasses.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;

import COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl;

import COSEM.COSEMPackage;

import COSEM.Datatypes.DatatypesPackage;

import COSEM.Datatypes.impl.DatatypesPackageImpl;

import COSEM.InterfaceClasses.InterfaceClassesFactory;
import COSEM.InterfaceClasses.InterfaceClassesPackage;

import COSEM.impl.COSEMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceClassesPackageImpl extends EPackageImpl implements InterfaceClassesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSK_PHY_MACsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKActiveinitiatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKMACsynctimeoutsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKMACcountersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec61334_4_32LLCsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s_FSKReportingsystemlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass t61334_32_LLC_SSCS_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_Phy_layer_countersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MACsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_countersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MAC_functionalparamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_MACnetworkadmindataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primE_NB_OFDM_PLC_Application_identificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_MAC_layer_countersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_MAC_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass g3_PLC_6LoWPANEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_startupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBee_SAS_APS_fragmentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBeenetworkcontrolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zigBeetunnelsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcP_UDPsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPv4setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPv6setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maCaddresssetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ppPsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smtPsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modemconfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_connectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gprS_modem_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsM_DiagnosticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_twisted_pair_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_Bus_slave_port_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_Bus_clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireless_Mode_Q_ChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_Bus_master_port_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dlmS_COSEM_Server_M_Bus_port_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass m_Bus_diagnosticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scripttableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialdaystableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitycalendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registermonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleactionscheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametermonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensormanagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokengatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_local_port_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_HDLC_setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_8802_2_LLC_Type_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ieC_8802_2_LLC_G3_NBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec8802_2LLCType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sapAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationLNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demandRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profilegenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilitytablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registertableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compactdataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusmappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationSNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagetransferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataprotectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushsetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitysetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAssociationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfaceClassesPackageImpl() {
		super(eNS_URI, InterfaceClassesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InterfaceClassesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InterfaceClassesPackage init() {
		if (isInited) return (InterfaceClassesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI);

		// Obtain or create and register package
		InterfaceClassesPackageImpl theInterfaceClassesPackage = (InterfaceClassesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterfaceClassesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterfaceClassesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		COSEMPackageImpl theCOSEMPackage = (COSEMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) instanceof COSEMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) : COSEMPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		COSEMObjectsPackageImpl theCOSEMObjectsPackage = (COSEMObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI) instanceof COSEMObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI) : COSEMObjectsPackage.eINSTANCE);

		// Load packages
		theCOSEMPackage.loadPackage();

		// Fix loaded packages
		theInterfaceClassesPackage.fixPackageContents();
		theCOSEMPackage.fixPackageContents();
		theDatatypesPackage.fixPackageContents();
		theCOSEMObjectsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfaceClassesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfaceClassesPackage.eNS_URI, theInterfaceClassesPackage);
		return theInterfaceClassesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSK_PHY_MACsetup() {
		if (s_FSK_PHY_MACsetupEClass == null) {
			s_FSK_PHY_MACsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return s_FSK_PHY_MACsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKActiveinitiator() {
		if (s_FSKActiveinitiatorEClass == null) {
			s_FSKActiveinitiatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return s_FSKActiveinitiatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKMACsynctimeouts() {
		if (s_FSKMACsynctimeoutsEClass == null) {
			s_FSKMACsynctimeoutsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return s_FSKMACsynctimeoutsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKMACcounters() {
		if (s_FSKMACcountersEClass == null) {
			s_FSKMACcountersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return s_FSKMACcountersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC61334_4_32LLCsetup() {
		if (iec61334_4_32LLCsetupEClass == null) {
			iec61334_4_32LLCsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return iec61334_4_32LLCsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS_FSKReportingsystemlist() {
		if (s_FSKReportingsystemlistEClass == null) {
			s_FSKReportingsystemlistEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return s_FSKReportingsystemlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gett61334_32_LLC_SSCS_setup() {
		if (t61334_32_LLC_SSCS_setupEClass == null) {
			t61334_32_LLC_SSCS_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return t61334_32_LLC_SSCS_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_Phy_layer_counters() {
		if (primE_NB_OFDM_PLC_Phy_layer_countersEClass == null) {
			primE_NB_OFDM_PLC_Phy_layer_countersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return primE_NB_OFDM_PLC_Phy_layer_countersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MACsetup() {
		if (primE_NB_OFDM_PLC_MACsetupEClass == null) {
			primE_NB_OFDM_PLC_MACsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return primE_NB_OFDM_PLC_MACsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_counters() {
		if (primE_NB_OFDM_PLC_MAC_countersEClass == null) {
			primE_NB_OFDM_PLC_MAC_countersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return primE_NB_OFDM_PLC_MAC_countersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MAC_functionalparams() {
		if (primE_NB_OFDM_PLC_MAC_functionalparamsEClass == null) {
			primE_NB_OFDM_PLC_MAC_functionalparamsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(10);
		}
		return primE_NB_OFDM_PLC_MAC_functionalparamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_MACnetworkadmindata() {
		if (primE_NB_OFDM_PLC_MACnetworkadmindataEClass == null) {
			primE_NB_OFDM_PLC_MACnetworkadmindataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return primE_NB_OFDM_PLC_MACnetworkadmindataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRIME_NB_OFDM_PLC_Application_identification() {
		if (primE_NB_OFDM_PLC_Application_identificationEClass == null) {
			primE_NB_OFDM_PLC_Application_identificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return primE_NB_OFDM_PLC_Application_identificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_MAC_layer_counters() {
		if (g3_PLC_MAC_layer_countersEClass == null) {
			g3_PLC_MAC_layer_countersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return g3_PLC_MAC_layer_countersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_MAC_setup() {
		if (g3_PLC_MAC_setupEClass == null) {
			g3_PLC_MAC_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(14);
		}
		return g3_PLC_MAC_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getG3_PLC_6LoWPAN() {
		if (g3_PLC_6LoWPANEClass == null) {
			g3_PLC_6LoWPANEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return g3_PLC_6LoWPANEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_startup() {
		if (zigBee_SAS_startupEClass == null) {
			zigBee_SAS_startupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(16);
		}
		return zigBee_SAS_startupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_join() {
		if (zigBee_SAS_joinEClass == null) {
			zigBee_SAS_joinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(17);
		}
		return zigBee_SAS_joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBee_SAS_APS_fragmentation() {
		if (zigBee_SAS_APS_fragmentationEClass == null) {
			zigBee_SAS_APS_fragmentationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(18);
		}
		return zigBee_SAS_APS_fragmentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBeenetworkcontrol() {
		if (zigBeenetworkcontrolEClass == null) {
			zigBeenetworkcontrolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(19);
		}
		return zigBeenetworkcontrolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZigBeetunnelsetup() {
		if (zigBeetunnelsetupEClass == null) {
			zigBeetunnelsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(20);
		}
		return zigBeetunnelsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCP_UDPsetup() {
		if (tcP_UDPsetupEClass == null) {
			tcP_UDPsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(21);
		}
		return tcP_UDPsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPv4setup() {
		if (iPv4setupEClass == null) {
			iPv4setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(22);
		}
		return iPv4setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPv6setup() {
		if (iPv6setupEClass == null) {
			iPv6setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(23);
		}
		return iPv6setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMACaddresssetup() {
		if (maCaddresssetupEClass == null) {
			maCaddresssetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(24);
		}
		return maCaddresssetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPPsetup() {
		if (ppPsetupEClass == null) {
			ppPsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(25);
		}
		return ppPsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMTPsetup() {
		if (smtPsetupEClass == null) {
			smtPsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(26);
		}
		return smtPsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModemconfiguration() {
		if (modemconfigurationEClass == null) {
			modemconfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(27);
		}
		return modemconfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuto_answer() {
		if (auto_answerEClass == null) {
			auto_answerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(28);
		}
		return auto_answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuto_connect() {
		if (auto_connectEClass == null) {
			auto_connectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(29);
		}
		return auto_connectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPRS_modem_setup() {
		if (gprS_modem_setupEClass == null) {
			gprS_modem_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(30);
		}
		return gprS_modem_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSM_Diagnostic() {
		if (gsM_DiagnosticEClass == null) {
			gsM_DiagnosticEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(31);
		}
		return gsM_DiagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_twisted_pair_setup() {
		if (ieC_twisted_pair_setupEClass == null) {
			ieC_twisted_pair_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(32);
		}
		return ieC_twisted_pair_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_Bus_slave_port_setup() {
		if (m_Bus_slave_port_setupEClass == null) {
			m_Bus_slave_port_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(33);
		}
		return m_Bus_slave_port_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_Bus_client() {
		if (m_Bus_clientEClass == null) {
			m_Bus_clientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(34);
		}
		return m_Bus_clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireless_Mode_Q_Channel() {
		if (wireless_Mode_Q_ChannelEClass == null) {
			wireless_Mode_Q_ChannelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(35);
		}
		return wireless_Mode_Q_ChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_Bus_master_port_setup() {
		if (m_Bus_master_port_setupEClass == null) {
			m_Bus_master_port_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(36);
		}
		return m_Bus_master_port_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDLMS_COSEM_Server_M_Bus_port_setup() {
		if (dlmS_COSEM_Server_M_Bus_port_setupEClass == null) {
			dlmS_COSEM_Server_M_Bus_port_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(37);
		}
		return dlmS_COSEM_Server_M_Bus_port_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM_Bus_diagnostic() {
		if (m_Bus_diagnosticEClass == null) {
			m_Bus_diagnosticEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(38);
		}
		return m_Bus_diagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScripttable() {
		if (scripttableEClass == null) {
			scripttableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(39);
		}
		return scripttableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScripttable_Includes() {
        return (EReference)getScripttable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScripttable__Execute() {
        return getScripttable().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		if (scriptEClass == null) {
			scriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(40);
		}
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		if (scheduleEClass == null) {
			scheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(41);
		}
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialdaystable() {
		if (specialdaystableEClass == null) {
			specialdaystableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(42);
		}
		return specialdaystableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitycalendar() {
		if (activitycalendarEClass == null) {
			activitycalendarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(43);
		}
		return activitycalendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistermonitor() {
		if (registermonitorEClass == null) {
			registermonitorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(44);
		}
		return registermonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleactionschedule() {
		if (singleactionscheduleEClass == null) {
			singleactionscheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(45);
		}
		return singleactionscheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametermonitor() {
		if (parametermonitorEClass == null) {
			parametermonitorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(46);
		}
		return parametermonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensormanager() {
		if (sensormanagerEClass == null) {
			sensormanagerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(47);
		}
		return sensormanagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitrator() {
		if (arbitratorEClass == null) {
			arbitratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(48);
		}
		return arbitratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectControl() {
		if (disconnectControlEClass == null) {
			disconnectControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(49);
		}
		return disconnectControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectControl_State() {
        return (EAttribute)getDisconnectControl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectControl_Transition() {
        return (EAttribute)getDisconnectControl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimiter() {
		if (limiterEClass == null) {
			limiterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(50);
		}
		return limiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		if (accountEClass == null) {
			accountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(51);
		}
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCredit() {
		if (creditEClass == null) {
			creditEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(52);
		}
		return creditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharge() {
		if (chargeEClass == null) {
			chargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(53);
		}
		return chargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokengateway() {
		if (tokengatewayEClass == null) {
			tokengatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(54);
		}
		return tokengatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_local_port_setup() {
		if (ieC_local_port_setupEClass == null) {
			ieC_local_port_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(55);
		}
		return ieC_local_port_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_HDLC_setup() {
		if (ieC_HDLC_setupEClass == null) {
			ieC_HDLC_setupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(56);
		}
		return ieC_HDLC_setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_8802_2_LLC_Type_1() {
		if (ieC_8802_2_LLC_Type_1EClass == null) {
			ieC_8802_2_LLC_Type_1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(57);
		}
		return ieC_8802_2_LLC_Type_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC_8802_2_LLC_G3_NB() {
		if (ieC_8802_2_LLC_G3_NBEClass == null) {
			ieC_8802_2_LLC_G3_NBEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(58);
		}
		return ieC_8802_2_LLC_G3_NBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC8802_2LLCType3() {
		if (iec8802_2LLCType3EClass == null) {
			iec8802_2LLCType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(59);
		}
		return iec8802_2LLCType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		if (registerEClass == null) {
			registerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(60);
		}
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_Value() {
        return (EAttribute)getRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_Scaler_unit() {
        return (EReference)getRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegister__Reset() {
        return getRegister().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAPAssignment() {
		if (sapAssignmentEClass == null) {
			sapAssignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(61);
		}
		return sapAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAPAssignment_Ldnname() {
        return (EReference)getSAPAssignment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationLN() {
		if (associationLNEClass == null) {
			associationLNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(62);
		}
		return associationLNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationLN_AA() {
        return (EReference)getAssociationLN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		if (dataEClass == null) {
			dataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(63);
		}
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedRegister() {
		if (extendedRegisterEClass == null) {
			extendedRegisterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(64);
		}
		return extendedRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemandRegister() {
		if (demandRegisterEClass == null) {
			demandRegisterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(65);
		}
		return demandRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemandRegister_Number_of_periods() {
        return (EAttribute)getDemandRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemandRegister_Period() {
        return (EAttribute)getDemandRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemandRegister_Current_average_value() {
        return (EAttribute)getDemandRegister().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDemandRegister__Calculate_current_average_value() {
        return getDemandRegister().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDemandRegister__Calculate_last_average_value() {
        return getDemandRegister().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterActivation() {
		if (registerActivationEClass == null) {
			registerActivationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(66);
		}
		return registerActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfilegeneric() {
		if (profilegenericEClass == null) {
			profilegenericEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(67);
		}
		return profilegenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase() {
		if (baseEClass == null) {
			baseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(68);
		}
		return baseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase_Logical_name() {
        return (EAttribute)getBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase_OBIScode() {
        return (EAttribute)getBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilitytables() {
		if (utilitytablesEClass == null) {
			utilitytablesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(69);
		}
		return utilitytablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistertable() {
		if (registertableEClass == null) {
			registertableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(70);
		}
		return registertableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompactdata() {
		if (compactdataEClass == null) {
			compactdataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(71);
		}
		return compactdataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactdata_Compact_buffer() {
        return (EAttribute)getCompactdata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactdata_Template_id() {
        return (EAttribute)getCompactdata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompactdata_Template_description() {
        return (EAttribute)getCompactdata().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusmapping() {
		if (statusmappingEClass == null) {
			statusmappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(72);
		}
		return statusmappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationSN() {
		if (associationSNEClass == null) {
			associationSNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(73);
		}
		return associationSNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagetransfer() {
		if (imagetransferEClass == null) {
			imagetransferEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(74);
		}
		return imagetransferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataprotection() {
		if (dataprotectionEClass == null) {
			dataprotectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(75);
		}
		return dataprotectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushsetup() {
		if (pushsetupEClass == null) {
			pushsetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(76);
		}
		return pushsetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecuritysetup() {
		if (securitysetupEClass == null) {
			securitysetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(77);
		}
		return securitysetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClock() {
		if (clockEClass == null) {
			clockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(78);
		}
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Time() {
        return (EAttribute)getClock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Time_zone() {
        return (EAttribute)getClock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Status() {
        return (EAttribute)getClock().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Daylight_savings_begin() {
        return (EAttribute)getClock().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Daylight_savings_end() {
        return (EAttribute)getClock().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Daylight_savings_deviation() {
        return (EAttribute)getClock().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_Daylight_savings_enabled() {
        return (EAttribute)getClock().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Adjust_to_quarter() {
        return getClock().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Adjust_to_measuring_period() {
        return getClock().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Adjust_to_minute() {
        return getClock().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Adjust_to_present_time() {
        return getClock().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Present_adjusting_time() {
        return getClock().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClock__Shift_time() {
        return getClock().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAssociation() {
		if (applicationAssociationEClass == null) {
			applicationAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI).getEClassifiers().get(79);
		}
		return applicationAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassesFactory getInterfaceClassesFactory() {
		return (InterfaceClassesFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("COSEM.InterfaceClasses." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InterfaceClassesPackageImpl
