/**
 */
package substationStandard.LNNodes.LNGroupM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import substationStandard.LNNodes.DomainLNs.DomainLNsPackage;

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
 * @see substationStandard.LNNodes.LNGroupM.LNGroupMFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupMPackage eINSTANCE = substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl.init();

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.GroupMImpl <em>Group M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.GroupMImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getGroupM()
	 * @generated
	 */
	int GROUP_M = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_M__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_M__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_M__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_M__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The number of structural features of the '<em>Group M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_M_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_M_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.MDIFImpl <em>MDIF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.MDIFImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMDIF()
	 * @generated
	 */
	int MDIF = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF__MODE = GROUP_M__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF__BEHAVIOUR = GROUP_M__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF__HEALTH = GROUP_M__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF__NAME_PLT = GROUP_M__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op ARem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF__OP_AREM = GROUP_M_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amp1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF__AMP1 = GROUP_M_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF__AMP2 = GROUP_M_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amp3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF__AMP3 = GROUP_M_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MDIF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF_FEATURE_COUNT = GROUP_M_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>MDIF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDIF_OPERATION_COUNT = GROUP_M_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl <em>MHAI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.MHAIImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMHAI()
	 * @generated
	 */
	int MHAI = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__MODE = GROUP_M__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__BEHAVIOUR = GROUP_M__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HEALTH = GROUP_M__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__NAME_PLT = GROUP_M__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__EE_NAME = GROUP_M_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HZ = GROUP_M_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HA = GROUP_M_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>HPh V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HPH_V = GROUP_M_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>HPPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HPPV = GROUP_M_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>HW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HW = GROUP_M_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>HV Ar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HV_AR = GROUP_M_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>HVA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HVA = GROUP_M_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>HRms A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HRMS_A = GROUP_M_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>HRms Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HRMS_PH_V = GROUP_M_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>HRms PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HRMS_PPV = GROUP_M_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>HTu W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HTU_W = GROUP_M_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>HTs W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HTS_W = GROUP_M_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>HA Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HA_TM = GROUP_M_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>HKf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HKF = GROUP_M_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>HTdf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HTDF = GROUP_M_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Thd A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_A = GROUP_M_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Thd Odd A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_ODD_A = GROUP_M_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Thd Evn A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_EVN_A = GROUP_M_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Thd Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_PH_V = GROUP_M_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Thd Odd Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_ODD_PH_V = GROUP_M_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Thd Evn V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_EVN_V = GROUP_M_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Thd PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_PPV = GROUP_M_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Thd Odd PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_ODD_PPV = GROUP_M_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Thd Evn PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_EVN_PPV = GROUP_M_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>HCf Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HCF_PH_V = GROUP_M_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>HCf PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HCF_PPV = GROUP_M_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>HCf A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HCF_A = GROUP_M_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>HTif</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HTIF = GROUP_M_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Hz Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__HZ_SET = GROUP_M_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Ev Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__EV_TMMS = GROUP_M_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Num Cyc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__NUM_CYC = GROUP_M_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Thd AVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_AVAL = GROUP_M_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Thd VVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_VVAL = GROUP_M_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Thd ATmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_ATMMS = GROUP_M_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Thd VTmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__THD_VTMMS = GROUP_M_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Nom A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__NOM_A = GROUP_M_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI__EE_HEALTH = GROUP_M_FEATURE_COUNT + 37;

	/**
	 * The number of structural features of the '<em>MHAI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI_FEATURE_COUNT = GROUP_M_FEATURE_COUNT + 38;

	/**
	 * The number of operations of the '<em>MHAI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAI_OPERATION_COUNT = GROUP_M_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.MHANImpl <em>MHAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.MHANImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMHAN()
	 * @generated
	 */
	int MHAN = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__MODE = GROUP_M__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__BEHAVIOUR = GROUP_M__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HEALTH = GROUP_M__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__NAME_PLT = GROUP_M__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__EE_NAME = GROUP_M_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__EE_HEALTH = GROUP_M_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HZ = GROUP_M_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ha Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_AMP = GROUP_M_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ha Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_VOL = GROUP_M_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ha Watt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_WATT = GROUP_M_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ha Vol Ampr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_VOL_AMPR = GROUP_M_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ha Vol Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_VOL_AMP = GROUP_M_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ha Rms Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_RMS_AMP = GROUP_M_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ha Rms Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_RMS_VOL = GROUP_M_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ha Tu Watt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_TU_WATT = GROUP_M_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ha Ts Watt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_TS_WATT = GROUP_M_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ha Amp Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_AMP_TM = GROUP_M_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ha KFact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_KFACT = GROUP_M_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Ha Td Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_TD_FACT = GROUP_M_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Thd Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_AMP = GROUP_M_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Thd Odd Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_ODD_AMP = GROUP_M_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Thd Evn Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_EVN_AMP = GROUP_M_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Tdd Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__TDD_AMP = GROUP_M_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Tdd Odd Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__TDD_ODD_AMP = GROUP_M_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Tdd Evn Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__TDD_EVN_AMP = GROUP_M_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Thd Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_VOL = GROUP_M_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Thd Odd Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_ODD_VOL = GROUP_M_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Thd Evn Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_EVN_VOL = GROUP_M_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Ha Cf Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_CF_AMP = GROUP_M_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Ha Cf Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_CF_VOL = GROUP_M_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Ha Ti Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HA_TI_FACT = GROUP_M_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Hz Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__HZ_SET = GROUP_M_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Ev Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__EV_TMMS = GROUP_M_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Num Cyc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__NUM_CYC = GROUP_M_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Thd AVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_AVAL = GROUP_M_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Thd VVal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_VVAL = GROUP_M_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Thd ATmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_ATMMS = GROUP_M_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Thd VTmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__THD_VTMMS = GROUP_M_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Nom A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN__NOM_A = GROUP_M_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>MHAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN_FEATURE_COUNT = GROUP_M_FEATURE_COUNT + 35;

	/**
	 * The number of operations of the '<em>MHAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MHAN_OPERATION_COUNT = GROUP_M_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.MMXUImpl <em>MMXU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.MMXUImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMMXU()
	 * @generated
	 */
	int MMXU = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__MODE = GROUP_M__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__BEHAVIOUR = GROUP_M__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__HEALTH = GROUP_M__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__NAME_PLT = GROUP_M__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Tot W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__TOT_W = GROUP_M_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__EE_HEALTH = GROUP_M_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tot VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__TOT_VAR = GROUP_M_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tot VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__TOT_VA = GROUP_M_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tot PF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__TOT_PF = GROUP_M_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__HZ = GROUP_M_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__PPV = GROUP_M_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ph V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__PH_V = GROUP_M_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__A = GROUP_M_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__W = GROUP_M_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__VAR = GROUP_M_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__VA = GROUP_M_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>PF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__PF = GROUP_M_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU__Z = GROUP_M_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>MMXU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU_FEATURE_COUNT = GROUP_M_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>MMXU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXU_OPERATION_COUNT = GROUP_M_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl <em>MSQI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.MSQIImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMSQI()
	 * @generated
	 */
	int MSQI = 5;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__MODE = GROUP_M__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__BEHAVIOUR = GROUP_M__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__HEALTH = GROUP_M__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__NAME_PLT = GROUP_M__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__EE_NAME = GROUP_M_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__EE_HEALTH = GROUP_M_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seq A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__SEQ_A = GROUP_M_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Seq V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__SEQ_V = GROUP_M_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>DQ0 Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__DQ0_SEQ = GROUP_M_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Imb A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__IMB_A = GROUP_M_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imb Ng A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__IMB_NG_A = GROUP_M_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Imb Ng V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__IMB_NG_V = GROUP_M_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Imb PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__IMB_PPV = GROUP_M_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Imb V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__IMB_V = GROUP_M_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Imb Zro A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__IMB_ZRO_A = GROUP_M_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Imb Zro V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__IMB_ZRO_V = GROUP_M_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Imb A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__MAX_IMB_A = GROUP_M_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Imb PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__MAX_IMB_PPV = GROUP_M_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max Imb V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI__MAX_IMB_V = GROUP_M_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>MSQI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI_FEATURE_COUNT = GROUP_M_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>MSQI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSQI_OPERATION_COUNT = GROUP_M_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.MMTRImpl <em>MMTR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.MMTRImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMMTR()
	 * @generated
	 */
	int MMTR = 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__MODE = GROUP_M__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__BEHAVIOUR = GROUP_M__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__HEALTH = GROUP_M__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__NAME_PLT = GROUP_M__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__EE_NAME = GROUP_M_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__EE_HEALTH = GROUP_M_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tot VAh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__TOT_VAH = GROUP_M_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tot Wh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__TOT_WH = GROUP_M_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tot VArh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__TOT_VARH = GROUP_M_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sup Wh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__SUP_WH = GROUP_M_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sup VArh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__SUP_VARH = GROUP_M_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dmd Wh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__DMD_WH = GROUP_M_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dmd VArh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR__DMD_VARH = GROUP_M_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>MMTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR_FEATURE_COUNT = GROUP_M_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>MMTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMTR_OPERATION_COUNT = GROUP_M_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl <em>MMXN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.MMXNImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMMXN()
	 * @generated
	 */
	int MMXN = 7;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__MODE = GROUP_M__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__BEHAVIOUR = GROUP_M__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__HEALTH = GROUP_M__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__NAME_PLT = GROUP_M__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__EE_NAME = GROUP_M_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__EE_HEALTH = GROUP_M_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__AMP = GROUP_M_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__VOL = GROUP_M_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Watt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__WATT = GROUP_M_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vol Ampr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__VOL_AMPR = GROUP_M_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vol Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__VOL_AMP = GROUP_M_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pwr Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__PWR_FACT = GROUP_M_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Imp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__IMP = GROUP_M_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN__HZ = GROUP_M_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>MMXN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN_FEATURE_COUNT = GROUP_M_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>MMXN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMXN_OPERATION_COUNT = GROUP_M_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl <em>MSTA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupM.impl.MSTAImpl
	 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMSTA()
	 * @generated
	 */
	int MSTA = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MODE = GROUP_M__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__BEHAVIOUR = GROUP_M__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__HEALTH = GROUP_M__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__NAME_PLT = GROUP_M__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__EE_NAME = GROUP_M_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__EE_HEALTH = GROUP_M_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Av Amps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__AV_AMPS = GROUP_M_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Amps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MAX_AMPS = GROUP_M_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Amps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MIN_AMPS = GROUP_M_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Av Volts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__AV_VOLTS = GROUP_M_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Volts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MAX_VOLTS = GROUP_M_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Volts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MIN_VOLTS = GROUP_M_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Av VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__AV_VA = GROUP_M_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MAX_VA = GROUP_M_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Min VA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MIN_VA = GROUP_M_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Av W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__AV_W = GROUP_M_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MAX_W = GROUP_M_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Min W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MIN_W = GROUP_M_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Av VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__AV_VAR = GROUP_M_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Max VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MAX_VAR = GROUP_M_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Min VAr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__MIN_VAR = GROUP_M_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Ev Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__EV_STR = GROUP_M_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ev Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA__EV_TMMS = GROUP_M_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>MSTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA_FEATURE_COUNT = GROUP_M_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>MSTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSTA_OPERATION_COUNT = GROUP_M_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.GroupM <em>Group M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group M</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.GroupM
	 * @generated
	 */
	EClass getGroupM();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.MDIF <em>MDIF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MDIF</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MDIF
	 * @generated
	 */
	EClass getMDIF();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MDIF#getOpARem <em>Op ARem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op ARem</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MDIF#getOpARem()
	 * @see #getMDIF()
	 * @generated
	 */
	EReference getMDIF_OpARem();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp1 <em>Amp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amp1</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MDIF#getAmp1()
	 * @see #getMDIF()
	 * @generated
	 */
	EReference getMDIF_Amp1();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp2 <em>Amp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amp2</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MDIF#getAmp2()
	 * @see #getMDIF()
	 * @generated
	 */
	EReference getMDIF_Amp2();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MDIF#getAmp3 <em>Amp3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amp3</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MDIF#getAmp3()
	 * @see #getMDIF()
	 * @generated
	 */
	EReference getMDIF_Amp3();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.MHAI <em>MHAI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MHAI</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI
	 * @generated
	 */
	EClass getMHAI();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getEEName()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_EEName();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHz <em>Hz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hz</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHz()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_Hz();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHA <em>HA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HA</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHA()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHPhV <em>HPh V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HPh V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHPhV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HPhV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHPPV <em>HPPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HPPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHPPV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HPPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHW <em>HW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HW</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHW()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HW();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHVAr <em>HV Ar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HV Ar</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHVAr()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HVAr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHVA <em>HVA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HVA</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHVA()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HVA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHRmsA <em>HRms A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HRms A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHRmsA()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HRmsA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHRmsPhV <em>HRms Ph V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HRms Ph V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHRmsPhV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HRmsPhV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHRmsPPV <em>HRms PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HRms PPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHRmsPPV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HRmsPPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHTuW <em>HTu W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HTu W</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHTuW()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HTuW();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHTsW <em>HTs W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HTs W</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHTsW()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HTsW();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHATm <em>HA Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HA Tm</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHATm()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HATm();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHKf <em>HKf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HKf</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHKf()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HKf();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHTdf <em>HTdf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HTdf</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHTdf()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HTdf();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdA <em>Thd A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdA()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdOddA <em>Thd Odd A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Odd A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdOddA()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdOddA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnA <em>Thd Evn A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Evn A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnA()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdEvnA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdPhV <em>Thd Ph V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Ph V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdPhV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdPhV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdOddPhV <em>Thd Odd Ph V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Odd Ph V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdOddPhV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdOddPhV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnV <em>Thd Evn V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Evn V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdEvnV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdPPV <em>Thd PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd PPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdPPV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdPPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdOddPPV <em>Thd Odd PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Odd PPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdOddPPV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdOddPPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnPPV <em>Thd Evn PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Evn PPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdEvnPPV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdEvnPPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHCfPhV <em>HCf Ph V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HCf Ph V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHCfPhV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HCfPhV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHCfPPV <em>HCf PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HCf PPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHCfPPV()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HCfPPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHCfA <em>HCf A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HCf A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHCfA()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HCfA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHTif <em>HTif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HTif</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHTif()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HTif();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getHzSet <em>Hz Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hz Set</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getHzSet()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_HzSet();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getEvTmms <em>Ev Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ev Tmms</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getEvTmms()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_EvTmms();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getNumCyc <em>Num Cyc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Num Cyc</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getNumCyc()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_NumCyc();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdAVal <em>Thd AVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd AVal</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdAVal()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdAVal();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdVVal <em>Thd VVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd VVal</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdVVal()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdVVal();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdATmms <em>Thd ATmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd ATmms</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdATmms()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdATmms();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getThdVTmms <em>Thd VTmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd VTmms</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getThdVTmms()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_ThdVTmms();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAI#getNomA <em>Nom A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nom A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getNomA()
	 * @see #getMHAI()
	 * @generated
	 */
	EReference getMHAI_NomA();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupM.MHAI#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAI#getEEHealth()
	 * @see #getMHAI()
	 * @generated
	 */
	EAttribute getMHAI_EEHealth();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.MHAN <em>MHAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MHAN</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN
	 * @generated
	 */
	EClass getMHAN();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getEEName()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_EEName();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupM.MHAN#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getEEHealth()
	 * @see #getMHAN()
	 * @generated
	 */
	EAttribute getMHAN_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHz <em>Hz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hz</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHz()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_Hz();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaAmp <em>Ha Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVol <em>Ha Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Vol</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaVol()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaVol();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaWatt <em>Ha Watt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Watt</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaWatt()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaWatt();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVolAmpr <em>Ha Vol Ampr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Vol Ampr</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaVolAmpr()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaVolAmpr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaVolAmp <em>Ha Vol Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Vol Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaVolAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaVolAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaRmsAmp <em>Ha Rms Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Rms Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaRmsAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaRmsAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaRmsVol <em>Ha Rms Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Rms Vol</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaRmsVol()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaRmsVol();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTuWatt <em>Ha Tu Watt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Tu Watt</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaTuWatt()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaTuWatt();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTsWatt <em>Ha Ts Watt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Ts Watt</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaTsWatt()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaTsWatt();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaAmpTm <em>Ha Amp Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Amp Tm</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaAmpTm()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaAmpTm();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaKFact <em>Ha KFact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha KFact</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaKFact()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaKFact();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTdFact <em>Ha Td Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Td Fact</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaTdFact()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaTdFact();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdAmp <em>Thd Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdOddAmp <em>Thd Odd Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Odd Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdOddAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdOddAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdEvnAmp <em>Thd Evn Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Evn Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdEvnAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdEvnAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddAmp <em>Tdd Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tdd Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getTddAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_TddAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddOddAmp <em>Tdd Odd Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tdd Odd Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getTddOddAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_TddOddAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getTddEvnAmp <em>Tdd Evn Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tdd Evn Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getTddEvnAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_TddEvnAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVol <em>Thd Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Vol</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdVol()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdVol();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdOddVol <em>Thd Odd Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Odd Vol</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdOddVol()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdOddVol();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdEvnVol <em>Thd Evn Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd Evn Vol</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdEvnVol()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdEvnVol();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaCfAmp <em>Ha Cf Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Cf Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaCfAmp()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaCfAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaCfVol <em>Ha Cf Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Cf Vol</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaCfVol()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaCfVol();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHaTiFact <em>Ha Ti Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Ti Fact</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHaTiFact()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HaTiFact();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getHzSet <em>Hz Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hz Set</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getHzSet()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_HzSet();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getEvTmms <em>Ev Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ev Tmms</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getEvTmms()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_EvTmms();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getNumCyc <em>Num Cyc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Num Cyc</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getNumCyc()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_NumCyc();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdAVal <em>Thd AVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd AVal</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdAVal()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdAVal();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVVal <em>Thd VVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd VVal</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdVVal()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdVVal();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdATmms <em>Thd ATmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd ATmms</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdATmms()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdATmms();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getThdVTmms <em>Thd VTmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thd VTmms</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getThdVTmms()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_ThdVTmms();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MHAN#getNomA <em>Nom A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nom A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MHAN#getNomA()
	 * @see #getMHAN()
	 * @generated
	 */
	EReference getMHAN_NomA();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.MMXU <em>MMXU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMXU</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU
	 * @generated
	 */
	EClass getMMXU();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotW <em>Tot W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tot W</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getTotW()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_TotW();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupM.MMXU#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getEEHealth()
	 * @see #getMMXU()
	 * @generated
	 */
	EAttribute getMMXU_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotVAr <em>Tot VAr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tot VAr</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getTotVAr()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_TotVAr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotVA <em>Tot VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tot VA</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getTotVA()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_TotVA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getTotPF <em>Tot PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tot PF</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getTotPF()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_TotPF();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getHz <em>Hz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hz</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getHz()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_Hz();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getPPV <em>PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getPPV()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_PPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getPhV <em>Ph V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ph V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getPhV()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_PhV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getA()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_A();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>W</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getW()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_W();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getVAr <em>VAr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VAr</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getVAr()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_VAr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getVA <em>VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VA</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getVA()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_VA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getPF <em>PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PF</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getPF()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_PF();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXU#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Z</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXU#getZ()
	 * @see #getMMXU()
	 * @generated
	 */
	EReference getMMXU_Z();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.MSQI <em>MSQI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSQI</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI
	 * @generated
	 */
	EClass getMSQI();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getEEName()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_EEName();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupM.MSQI#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getEEHealth()
	 * @see #getMSQI()
	 * @generated
	 */
	EAttribute getMSQI_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getSeqA <em>Seq A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seq A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getSeqA()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_SeqA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getSeqV <em>Seq V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seq V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getSeqV()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_SeqV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getDQ0Seq <em>DQ0 Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DQ0 Seq</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getDQ0Seq()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_DQ0Seq();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getImbA <em>Imb A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imb A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getImbA()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_ImbA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getImbNgA <em>Imb Ng A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imb Ng A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getImbNgA()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_ImbNgA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getImbNgV <em>Imb Ng V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imb Ng V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getImbNgV()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_ImbNgV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getImbPPV <em>Imb PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imb PPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getImbPPV()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_ImbPPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getImbV <em>Imb V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imb V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getImbV()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_ImbV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getImbZroA <em>Imb Zro A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imb Zro A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getImbZroA()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_ImbZroA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getImbZroV <em>Imb Zro V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imb Zro V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getImbZroV()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_ImbZroV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbA <em>Max Imb A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Imb A</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbA()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_MaxImbA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbPPV <em>Max Imb PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Imb PPV</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbPPV()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_MaxImbPPV();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbV <em>Max Imb V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Imb V</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSQI#getMaxImbV()
	 * @see #getMSQI()
	 * @generated
	 */
	EReference getMSQI_MaxImbV();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.MMTR <em>MMTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMTR</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR
	 * @generated
	 */
	EClass getMMTR();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMTR#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getEEName()
	 * @see #getMMTR()
	 * @generated
	 */
	EReference getMMTR_EEName();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupM.MMTR#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getEEHealth()
	 * @see #getMMTR()
	 * @generated
	 */
	EAttribute getMMTR_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotVAh <em>Tot VAh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tot VAh</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getTotVAh()
	 * @see #getMMTR()
	 * @generated
	 */
	EReference getMMTR_TotVAh();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotWh <em>Tot Wh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tot Wh</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getTotWh()
	 * @see #getMMTR()
	 * @generated
	 */
	EReference getMMTR_TotWh();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMTR#getTotVArh <em>Tot VArh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tot VArh</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getTotVArh()
	 * @see #getMMTR()
	 * @generated
	 */
	EReference getMMTR_TotVArh();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMTR#getSupWh <em>Sup Wh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sup Wh</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getSupWh()
	 * @see #getMMTR()
	 * @generated
	 */
	EReference getMMTR_SupWh();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMTR#getSupVArh <em>Sup VArh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sup VArh</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getSupVArh()
	 * @see #getMMTR()
	 * @generated
	 */
	EReference getMMTR_SupVArh();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMTR#getDmdWh <em>Dmd Wh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dmd Wh</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getDmdWh()
	 * @see #getMMTR()
	 * @generated
	 */
	EReference getMMTR_DmdWh();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMTR#getDmdVArh <em>Dmd VArh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dmd VArh</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMTR#getDmdVArh()
	 * @see #getMMTR()
	 * @generated
	 */
	EReference getMMTR_DmdVArh();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.MMXN <em>MMXN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMXN</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN
	 * @generated
	 */
	EClass getMMXN();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getEEName()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_EEName();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupM.MMXN#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getEEHealth()
	 * @see #getMMXN()
	 * @generated
	 */
	EAttribute getMMXN_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getAmp <em>Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getAmp()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_Amp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getVol <em>Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vol</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getVol()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_Vol();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getWatt <em>Watt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watt</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getWatt()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_Watt();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getVolAmpr <em>Vol Ampr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vol Ampr</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getVolAmpr()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_VolAmpr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getVolAmp <em>Vol Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vol Amp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getVolAmp()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_VolAmp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getPwrFact <em>Pwr Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pwr Fact</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getPwrFact()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_PwrFact();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getImp <em>Imp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imp</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getImp()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_Imp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MMXN#getHz <em>Hz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hz</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MMXN#getHz()
	 * @see #getMMXN()
	 * @generated
	 */
	EReference getMMXN_Hz();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupM.MSTA <em>MSTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSTA</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA
	 * @generated
	 */
	EClass getMSTA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getEEName()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_EEName();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupM.MSTA#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getEEHealth()
	 * @see #getMSTA()
	 * @generated
	 */
	EAttribute getMSTA_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getAvAmps <em>Av Amps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Av Amps</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getAvAmps()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_AvAmps();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMaxAmps <em>Max Amps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Amps</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMaxAmps()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MaxAmps();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMinAmps <em>Min Amps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Amps</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMinAmps()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MinAmps();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getAvVolts <em>Av Volts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Av Volts</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getAvVolts()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_AvVolts();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMaxVolts <em>Max Volts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Volts</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMaxVolts()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MaxVolts();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMinVolts <em>Min Volts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Volts</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMinVolts()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MinVolts();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getAvVA <em>Av VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Av VA</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getAvVA()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_AvVA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMaxVA <em>Max VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max VA</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMaxVA()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MaxVA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMinVA <em>Min VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min VA</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMinVA()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MinVA();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getAvW <em>Av W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Av W</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getAvW()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_AvW();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMaxW <em>Max W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max W</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMaxW()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MaxW();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMinW <em>Min W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min W</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMinW()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MinW();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getAvVAr <em>Av VAr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Av VAr</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getAvVAr()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_AvVAr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMaxVAr <em>Max VAr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max VAr</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMaxVAr()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MaxVAr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getMinVAr <em>Min VAr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min VAr</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getMinVAr()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_MinVAr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getEvStr <em>Ev Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ev Str</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getEvStr()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_EvStr();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupM.MSTA#getEvTmms <em>Ev Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ev Tmms</em>'.
	 * @see substationStandard.LNNodes.LNGroupM.MSTA#getEvTmms()
	 * @see #getMSTA()
	 * @generated
	 */
	EReference getMSTA_EvTmms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupMFactory getLNGroupMFactory();

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
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.GroupMImpl <em>Group M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.GroupMImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getGroupM()
		 * @generated
		 */
		EClass GROUP_M = eINSTANCE.getGroupM();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.MDIFImpl <em>MDIF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.MDIFImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMDIF()
		 * @generated
		 */
		EClass MDIF = eINSTANCE.getMDIF();

		/**
		 * The meta object literal for the '<em><b>Op ARem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDIF__OP_AREM = eINSTANCE.getMDIF_OpARem();

		/**
		 * The meta object literal for the '<em><b>Amp1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDIF__AMP1 = eINSTANCE.getMDIF_Amp1();

		/**
		 * The meta object literal for the '<em><b>Amp2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDIF__AMP2 = eINSTANCE.getMDIF_Amp2();

		/**
		 * The meta object literal for the '<em><b>Amp3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDIF__AMP3 = eINSTANCE.getMDIF_Amp3();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.MHAIImpl <em>MHAI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.MHAIImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMHAI()
		 * @generated
		 */
		EClass MHAI = eINSTANCE.getMHAI();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__EE_NAME = eINSTANCE.getMHAI_EEName();

		/**
		 * The meta object literal for the '<em><b>Hz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HZ = eINSTANCE.getMHAI_Hz();

		/**
		 * The meta object literal for the '<em><b>HA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HA = eINSTANCE.getMHAI_HA();

		/**
		 * The meta object literal for the '<em><b>HPh V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HPH_V = eINSTANCE.getMHAI_HPhV();

		/**
		 * The meta object literal for the '<em><b>HPPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HPPV = eINSTANCE.getMHAI_HPPV();

		/**
		 * The meta object literal for the '<em><b>HW</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HW = eINSTANCE.getMHAI_HW();

		/**
		 * The meta object literal for the '<em><b>HV Ar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HV_AR = eINSTANCE.getMHAI_HVAr();

		/**
		 * The meta object literal for the '<em><b>HVA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HVA = eINSTANCE.getMHAI_HVA();

		/**
		 * The meta object literal for the '<em><b>HRms A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HRMS_A = eINSTANCE.getMHAI_HRmsA();

		/**
		 * The meta object literal for the '<em><b>HRms Ph V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HRMS_PH_V = eINSTANCE.getMHAI_HRmsPhV();

		/**
		 * The meta object literal for the '<em><b>HRms PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HRMS_PPV = eINSTANCE.getMHAI_HRmsPPV();

		/**
		 * The meta object literal for the '<em><b>HTu W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HTU_W = eINSTANCE.getMHAI_HTuW();

		/**
		 * The meta object literal for the '<em><b>HTs W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HTS_W = eINSTANCE.getMHAI_HTsW();

		/**
		 * The meta object literal for the '<em><b>HA Tm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HA_TM = eINSTANCE.getMHAI_HATm();

		/**
		 * The meta object literal for the '<em><b>HKf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HKF = eINSTANCE.getMHAI_HKf();

		/**
		 * The meta object literal for the '<em><b>HTdf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HTDF = eINSTANCE.getMHAI_HTdf();

		/**
		 * The meta object literal for the '<em><b>Thd A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_A = eINSTANCE.getMHAI_ThdA();

		/**
		 * The meta object literal for the '<em><b>Thd Odd A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_ODD_A = eINSTANCE.getMHAI_ThdOddA();

		/**
		 * The meta object literal for the '<em><b>Thd Evn A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_EVN_A = eINSTANCE.getMHAI_ThdEvnA();

		/**
		 * The meta object literal for the '<em><b>Thd Ph V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_PH_V = eINSTANCE.getMHAI_ThdPhV();

		/**
		 * The meta object literal for the '<em><b>Thd Odd Ph V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_ODD_PH_V = eINSTANCE.getMHAI_ThdOddPhV();

		/**
		 * The meta object literal for the '<em><b>Thd Evn V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_EVN_V = eINSTANCE.getMHAI_ThdEvnV();

		/**
		 * The meta object literal for the '<em><b>Thd PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_PPV = eINSTANCE.getMHAI_ThdPPV();

		/**
		 * The meta object literal for the '<em><b>Thd Odd PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_ODD_PPV = eINSTANCE.getMHAI_ThdOddPPV();

		/**
		 * The meta object literal for the '<em><b>Thd Evn PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_EVN_PPV = eINSTANCE.getMHAI_ThdEvnPPV();

		/**
		 * The meta object literal for the '<em><b>HCf Ph V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HCF_PH_V = eINSTANCE.getMHAI_HCfPhV();

		/**
		 * The meta object literal for the '<em><b>HCf PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HCF_PPV = eINSTANCE.getMHAI_HCfPPV();

		/**
		 * The meta object literal for the '<em><b>HCf A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HCF_A = eINSTANCE.getMHAI_HCfA();

		/**
		 * The meta object literal for the '<em><b>HTif</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HTIF = eINSTANCE.getMHAI_HTif();

		/**
		 * The meta object literal for the '<em><b>Hz Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__HZ_SET = eINSTANCE.getMHAI_HzSet();

		/**
		 * The meta object literal for the '<em><b>Ev Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__EV_TMMS = eINSTANCE.getMHAI_EvTmms();

		/**
		 * The meta object literal for the '<em><b>Num Cyc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__NUM_CYC = eINSTANCE.getMHAI_NumCyc();

		/**
		 * The meta object literal for the '<em><b>Thd AVal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_AVAL = eINSTANCE.getMHAI_ThdAVal();

		/**
		 * The meta object literal for the '<em><b>Thd VVal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_VVAL = eINSTANCE.getMHAI_ThdVVal();

		/**
		 * The meta object literal for the '<em><b>Thd ATmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_ATMMS = eINSTANCE.getMHAI_ThdATmms();

		/**
		 * The meta object literal for the '<em><b>Thd VTmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__THD_VTMMS = eINSTANCE.getMHAI_ThdVTmms();

		/**
		 * The meta object literal for the '<em><b>Nom A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAI__NOM_A = eINSTANCE.getMHAI_NomA();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MHAI__EE_HEALTH = eINSTANCE.getMHAI_EEHealth();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.MHANImpl <em>MHAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.MHANImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMHAN()
		 * @generated
		 */
		EClass MHAN = eINSTANCE.getMHAN();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__EE_NAME = eINSTANCE.getMHAN_EEName();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MHAN__EE_HEALTH = eINSTANCE.getMHAN_EEHealth();

		/**
		 * The meta object literal for the '<em><b>Hz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HZ = eINSTANCE.getMHAN_Hz();

		/**
		 * The meta object literal for the '<em><b>Ha Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_AMP = eINSTANCE.getMHAN_HaAmp();

		/**
		 * The meta object literal for the '<em><b>Ha Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_VOL = eINSTANCE.getMHAN_HaVol();

		/**
		 * The meta object literal for the '<em><b>Ha Watt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_WATT = eINSTANCE.getMHAN_HaWatt();

		/**
		 * The meta object literal for the '<em><b>Ha Vol Ampr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_VOL_AMPR = eINSTANCE.getMHAN_HaVolAmpr();

		/**
		 * The meta object literal for the '<em><b>Ha Vol Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_VOL_AMP = eINSTANCE.getMHAN_HaVolAmp();

		/**
		 * The meta object literal for the '<em><b>Ha Rms Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_RMS_AMP = eINSTANCE.getMHAN_HaRmsAmp();

		/**
		 * The meta object literal for the '<em><b>Ha Rms Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_RMS_VOL = eINSTANCE.getMHAN_HaRmsVol();

		/**
		 * The meta object literal for the '<em><b>Ha Tu Watt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_TU_WATT = eINSTANCE.getMHAN_HaTuWatt();

		/**
		 * The meta object literal for the '<em><b>Ha Ts Watt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_TS_WATT = eINSTANCE.getMHAN_HaTsWatt();

		/**
		 * The meta object literal for the '<em><b>Ha Amp Tm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_AMP_TM = eINSTANCE.getMHAN_HaAmpTm();

		/**
		 * The meta object literal for the '<em><b>Ha KFact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_KFACT = eINSTANCE.getMHAN_HaKFact();

		/**
		 * The meta object literal for the '<em><b>Ha Td Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_TD_FACT = eINSTANCE.getMHAN_HaTdFact();

		/**
		 * The meta object literal for the '<em><b>Thd Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_AMP = eINSTANCE.getMHAN_ThdAmp();

		/**
		 * The meta object literal for the '<em><b>Thd Odd Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_ODD_AMP = eINSTANCE.getMHAN_ThdOddAmp();

		/**
		 * The meta object literal for the '<em><b>Thd Evn Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_EVN_AMP = eINSTANCE.getMHAN_ThdEvnAmp();

		/**
		 * The meta object literal for the '<em><b>Tdd Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__TDD_AMP = eINSTANCE.getMHAN_TddAmp();

		/**
		 * The meta object literal for the '<em><b>Tdd Odd Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__TDD_ODD_AMP = eINSTANCE.getMHAN_TddOddAmp();

		/**
		 * The meta object literal for the '<em><b>Tdd Evn Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__TDD_EVN_AMP = eINSTANCE.getMHAN_TddEvnAmp();

		/**
		 * The meta object literal for the '<em><b>Thd Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_VOL = eINSTANCE.getMHAN_ThdVol();

		/**
		 * The meta object literal for the '<em><b>Thd Odd Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_ODD_VOL = eINSTANCE.getMHAN_ThdOddVol();

		/**
		 * The meta object literal for the '<em><b>Thd Evn Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_EVN_VOL = eINSTANCE.getMHAN_ThdEvnVol();

		/**
		 * The meta object literal for the '<em><b>Ha Cf Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_CF_AMP = eINSTANCE.getMHAN_HaCfAmp();

		/**
		 * The meta object literal for the '<em><b>Ha Cf Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_CF_VOL = eINSTANCE.getMHAN_HaCfVol();

		/**
		 * The meta object literal for the '<em><b>Ha Ti Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HA_TI_FACT = eINSTANCE.getMHAN_HaTiFact();

		/**
		 * The meta object literal for the '<em><b>Hz Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__HZ_SET = eINSTANCE.getMHAN_HzSet();

		/**
		 * The meta object literal for the '<em><b>Ev Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__EV_TMMS = eINSTANCE.getMHAN_EvTmms();

		/**
		 * The meta object literal for the '<em><b>Num Cyc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__NUM_CYC = eINSTANCE.getMHAN_NumCyc();

		/**
		 * The meta object literal for the '<em><b>Thd AVal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_AVAL = eINSTANCE.getMHAN_ThdAVal();

		/**
		 * The meta object literal for the '<em><b>Thd VVal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_VVAL = eINSTANCE.getMHAN_ThdVVal();

		/**
		 * The meta object literal for the '<em><b>Thd ATmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_ATMMS = eINSTANCE.getMHAN_ThdATmms();

		/**
		 * The meta object literal for the '<em><b>Thd VTmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__THD_VTMMS = eINSTANCE.getMHAN_ThdVTmms();

		/**
		 * The meta object literal for the '<em><b>Nom A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MHAN__NOM_A = eINSTANCE.getMHAN_NomA();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.MMXUImpl <em>MMXU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.MMXUImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMMXU()
		 * @generated
		 */
		EClass MMXU = eINSTANCE.getMMXU();

		/**
		 * The meta object literal for the '<em><b>Tot W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__TOT_W = eINSTANCE.getMMXU_TotW();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMXU__EE_HEALTH = eINSTANCE.getMMXU_EEHealth();

		/**
		 * The meta object literal for the '<em><b>Tot VAr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__TOT_VAR = eINSTANCE.getMMXU_TotVAr();

		/**
		 * The meta object literal for the '<em><b>Tot VA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__TOT_VA = eINSTANCE.getMMXU_TotVA();

		/**
		 * The meta object literal for the '<em><b>Tot PF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__TOT_PF = eINSTANCE.getMMXU_TotPF();

		/**
		 * The meta object literal for the '<em><b>Hz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__HZ = eINSTANCE.getMMXU_Hz();

		/**
		 * The meta object literal for the '<em><b>PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__PPV = eINSTANCE.getMMXU_PPV();

		/**
		 * The meta object literal for the '<em><b>Ph V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__PH_V = eINSTANCE.getMMXU_PhV();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__A = eINSTANCE.getMMXU_A();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__W = eINSTANCE.getMMXU_W();

		/**
		 * The meta object literal for the '<em><b>VAr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__VAR = eINSTANCE.getMMXU_VAr();

		/**
		 * The meta object literal for the '<em><b>VA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__VA = eINSTANCE.getMMXU_VA();

		/**
		 * The meta object literal for the '<em><b>PF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__PF = eINSTANCE.getMMXU_PF();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXU__Z = eINSTANCE.getMMXU_Z();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.MSQIImpl <em>MSQI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.MSQIImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMSQI()
		 * @generated
		 */
		EClass MSQI = eINSTANCE.getMSQI();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__EE_NAME = eINSTANCE.getMSQI_EEName();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSQI__EE_HEALTH = eINSTANCE.getMSQI_EEHealth();

		/**
		 * The meta object literal for the '<em><b>Seq A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__SEQ_A = eINSTANCE.getMSQI_SeqA();

		/**
		 * The meta object literal for the '<em><b>Seq V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__SEQ_V = eINSTANCE.getMSQI_SeqV();

		/**
		 * The meta object literal for the '<em><b>DQ0 Seq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__DQ0_SEQ = eINSTANCE.getMSQI_DQ0Seq();

		/**
		 * The meta object literal for the '<em><b>Imb A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__IMB_A = eINSTANCE.getMSQI_ImbA();

		/**
		 * The meta object literal for the '<em><b>Imb Ng A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__IMB_NG_A = eINSTANCE.getMSQI_ImbNgA();

		/**
		 * The meta object literal for the '<em><b>Imb Ng V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__IMB_NG_V = eINSTANCE.getMSQI_ImbNgV();

		/**
		 * The meta object literal for the '<em><b>Imb PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__IMB_PPV = eINSTANCE.getMSQI_ImbPPV();

		/**
		 * The meta object literal for the '<em><b>Imb V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__IMB_V = eINSTANCE.getMSQI_ImbV();

		/**
		 * The meta object literal for the '<em><b>Imb Zro A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__IMB_ZRO_A = eINSTANCE.getMSQI_ImbZroA();

		/**
		 * The meta object literal for the '<em><b>Imb Zro V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__IMB_ZRO_V = eINSTANCE.getMSQI_ImbZroV();

		/**
		 * The meta object literal for the '<em><b>Max Imb A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__MAX_IMB_A = eINSTANCE.getMSQI_MaxImbA();

		/**
		 * The meta object literal for the '<em><b>Max Imb PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__MAX_IMB_PPV = eINSTANCE.getMSQI_MaxImbPPV();

		/**
		 * The meta object literal for the '<em><b>Max Imb V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSQI__MAX_IMB_V = eINSTANCE.getMSQI_MaxImbV();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.MMTRImpl <em>MMTR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.MMTRImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMMTR()
		 * @generated
		 */
		EClass MMTR = eINSTANCE.getMMTR();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMTR__EE_NAME = eINSTANCE.getMMTR_EEName();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMTR__EE_HEALTH = eINSTANCE.getMMTR_EEHealth();

		/**
		 * The meta object literal for the '<em><b>Tot VAh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMTR__TOT_VAH = eINSTANCE.getMMTR_TotVAh();

		/**
		 * The meta object literal for the '<em><b>Tot Wh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMTR__TOT_WH = eINSTANCE.getMMTR_TotWh();

		/**
		 * The meta object literal for the '<em><b>Tot VArh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMTR__TOT_VARH = eINSTANCE.getMMTR_TotVArh();

		/**
		 * The meta object literal for the '<em><b>Sup Wh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMTR__SUP_WH = eINSTANCE.getMMTR_SupWh();

		/**
		 * The meta object literal for the '<em><b>Sup VArh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMTR__SUP_VARH = eINSTANCE.getMMTR_SupVArh();

		/**
		 * The meta object literal for the '<em><b>Dmd Wh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMTR__DMD_WH = eINSTANCE.getMMTR_DmdWh();

		/**
		 * The meta object literal for the '<em><b>Dmd VArh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMTR__DMD_VARH = eINSTANCE.getMMTR_DmdVArh();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.MMXNImpl <em>MMXN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.MMXNImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMMXN()
		 * @generated
		 */
		EClass MMXN = eINSTANCE.getMMXN();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__EE_NAME = eINSTANCE.getMMXN_EEName();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMXN__EE_HEALTH = eINSTANCE.getMMXN_EEHealth();

		/**
		 * The meta object literal for the '<em><b>Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__AMP = eINSTANCE.getMMXN_Amp();

		/**
		 * The meta object literal for the '<em><b>Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__VOL = eINSTANCE.getMMXN_Vol();

		/**
		 * The meta object literal for the '<em><b>Watt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__WATT = eINSTANCE.getMMXN_Watt();

		/**
		 * The meta object literal for the '<em><b>Vol Ampr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__VOL_AMPR = eINSTANCE.getMMXN_VolAmpr();

		/**
		 * The meta object literal for the '<em><b>Vol Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__VOL_AMP = eINSTANCE.getMMXN_VolAmp();

		/**
		 * The meta object literal for the '<em><b>Pwr Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__PWR_FACT = eINSTANCE.getMMXN_PwrFact();

		/**
		 * The meta object literal for the '<em><b>Imp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__IMP = eINSTANCE.getMMXN_Imp();

		/**
		 * The meta object literal for the '<em><b>Hz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMXN__HZ = eINSTANCE.getMMXN_Hz();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupM.impl.MSTAImpl <em>MSTA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupM.impl.MSTAImpl
		 * @see substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl#getMSTA()
		 * @generated
		 */
		EClass MSTA = eINSTANCE.getMSTA();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__EE_NAME = eINSTANCE.getMSTA_EEName();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSTA__EE_HEALTH = eINSTANCE.getMSTA_EEHealth();

		/**
		 * The meta object literal for the '<em><b>Av Amps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__AV_AMPS = eINSTANCE.getMSTA_AvAmps();

		/**
		 * The meta object literal for the '<em><b>Max Amps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MAX_AMPS = eINSTANCE.getMSTA_MaxAmps();

		/**
		 * The meta object literal for the '<em><b>Min Amps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MIN_AMPS = eINSTANCE.getMSTA_MinAmps();

		/**
		 * The meta object literal for the '<em><b>Av Volts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__AV_VOLTS = eINSTANCE.getMSTA_AvVolts();

		/**
		 * The meta object literal for the '<em><b>Max Volts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MAX_VOLTS = eINSTANCE.getMSTA_MaxVolts();

		/**
		 * The meta object literal for the '<em><b>Min Volts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MIN_VOLTS = eINSTANCE.getMSTA_MinVolts();

		/**
		 * The meta object literal for the '<em><b>Av VA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__AV_VA = eINSTANCE.getMSTA_AvVA();

		/**
		 * The meta object literal for the '<em><b>Max VA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MAX_VA = eINSTANCE.getMSTA_MaxVA();

		/**
		 * The meta object literal for the '<em><b>Min VA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MIN_VA = eINSTANCE.getMSTA_MinVA();

		/**
		 * The meta object literal for the '<em><b>Av W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__AV_W = eINSTANCE.getMSTA_AvW();

		/**
		 * The meta object literal for the '<em><b>Max W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MAX_W = eINSTANCE.getMSTA_MaxW();

		/**
		 * The meta object literal for the '<em><b>Min W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MIN_W = eINSTANCE.getMSTA_MinW();

		/**
		 * The meta object literal for the '<em><b>Av VAr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__AV_VAR = eINSTANCE.getMSTA_AvVAr();

		/**
		 * The meta object literal for the '<em><b>Max VAr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MAX_VAR = eINSTANCE.getMSTA_MaxVAr();

		/**
		 * The meta object literal for the '<em><b>Min VAr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__MIN_VAR = eINSTANCE.getMSTA_MinVAr();

		/**
		 * The meta object literal for the '<em><b>Ev Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__EV_STR = eINSTANCE.getMSTA_EvStr();

		/**
		 * The meta object literal for the '<em><b>Ev Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSTA__EV_TMMS = eINSTANCE.getMSTA_EvTmms();

	}

} //LNGroupMPackage
