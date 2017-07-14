/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupP;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLNsPackage;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupP.LNGroupPFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupP";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupPPackage eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.GroupPImpl <em>Group P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.GroupPImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getGroupP()
	 * @generated
	 */
	int GROUP_P = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_P__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_P__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_P__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_P__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_P__OP_CNT_RS = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_P_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_P_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDIFImpl <em>PDIF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDIFImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDIF()
	 * @generated
	 */
	int PDIF = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tm ASt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__TM_AST = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dif AClc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__DIF_ACLC = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rst A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__RST_A = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lin Capac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__LIN_CAPAC = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lo Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__LO_SET = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hi Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__HI_SET = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__MIN_OP_TMMS = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__MAX_OP_TMMS = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rst Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__RST_MOD = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rs Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__RS_DI_TMMS = GROUP_P_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tm ACrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF__TM_ACRV = GROUP_P_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>PDIF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>PDIF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIF_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDIRImpl <em>PDIR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDIRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDIR()
	 * @generated
	 */
	int PDIR = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rs Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR__RS_DI_TMMS = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PDIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PDIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIR_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl <em>PFRC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPFRC()
	 * @generated
	 */
	int PFRC = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blk V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__BLK_V = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__STR_VAL = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Blk Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__BLK_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__OP_DI_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rs Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC__RS_DI_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PFRC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PFRC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFRC_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PHARImpl <em>PHAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PHARImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPHAR()
	 * @generated
	 */
	int PHAR = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ha Rst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__HA_RST = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ph Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__PH_STR = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ph Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__PH_STOP = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Op Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__OP_DI_TMMS = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rs Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR__RS_DI_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PHAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>PHAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHAR_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.POPFImpl <em>POPF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.POPFImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPOPF()
	 * @generated
	 */
	int POPF = 5;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blk A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__BLK_A = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blk V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__BLK_V = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__STR_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__OP_DI_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rs Di Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__RS_DI_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Blk Val A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__BLK_VAL_A = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Blk Val V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF__BLK_VAL_V = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>POPF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>POPF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPF_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PPAMImpl <em>PPAM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PPAMImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPPAM()
	 * @generated
	 */
	int PPAM = 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM__STR_VAL = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PPAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PPAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAM_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDISImpl <em>PDIS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDISImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDIS()
	 * @generated
	 */
	int PDIS = 7;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Po Rch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__PO_RCH = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ph Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__PH_STR = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gnd Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__GND_STR = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dir Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__DIR_MOD = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pct Rch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__PCT_RCH = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ofs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__OFS = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pct Ofs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__PCT_OFS = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ris Lod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__RIS_LOD = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ang Lod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__ANG_LOD = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tm Dl Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__TM_DL_MOD = GROUP_P_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ph Dl Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__PH_DL_MOD = GROUP_P_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Ph Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__PH_DL_TMMS = GROUP_P_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Gnd Dl Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__GND_DL_MOD = GROUP_P_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Gnd Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__GND_DL_TMMS = GROUP_P_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>X1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__X1 = GROUP_P_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Lin Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__LIN_ANG = GROUP_P_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Ris Gnd Rch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__RIS_GND_RCH = GROUP_P_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Ris Ph Rch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__RIS_PH_RCH = GROUP_P_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>K0 Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__K0_FACT = GROUP_P_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>K0 Fact Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__K0_FACT_ANG = GROUP_P_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>PDIS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>PDIS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDIS_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDOPImpl <em>PDOP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDOPImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDOP()
	 * @generated
	 */
	int PDOP = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dir Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__DIR_MOD = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__STR_VAL = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PDOP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>PDOP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOP_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PHIZImpl <em>PHIZ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PHIZImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPHIZ()
	 * @generated
	 */
	int PHIZ = 9;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>AStr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__ASTR = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>VStr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__VSTR = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>HV Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__HV_STR = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PHIZ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PHIZ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHIZ_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PIOCImpl <em>PIOC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PIOCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPIOC()
	 * @generated
	 */
	int PIOC = 10;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC__STR_VAL = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PIOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PIOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIOC_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMRIImpl <em>PMRI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMRIImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPMRI()
	 * @generated
	 */
	int PMRI = 11;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__OP = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Str Inh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__STR_INH = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Str Inh Tmm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__STR_INH_TMM = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Set A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__SET_A = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Set Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__SET_TMS = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Num Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__MAX_NUM_STR = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Wrm Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__MAX_WRM_STR = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Str Tmm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__MAX_STR_TMM = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Eq Tmm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__EQ_TMM = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inh Tmm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI__INH_TMM = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>PMRI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>PMRI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMRI_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl <em>PMSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPMSS()
	 * @generated
	 */
	int PMSS = 12;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Set A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__SET_A = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Set Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__SET_TMS = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mot Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__MOT_STR = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lok Rot Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS__LOK_ROT_TMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PMSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>PMSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMSS_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSCHImpl <em>PSCH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSCHImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPSCH()
	 * @generated
	 */
	int PSCH = 13;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Pro Tx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__PRO_TX = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pro Rx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__PRO_RX = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__STR = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__OP = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Car Rx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__CAR_RX = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Los Of Grd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__LOS_OF_GRD = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Echo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__ECHO = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Wei Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__WEI_OP = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rv ABlk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__RV_ABLK = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Grd Rx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__GRD_RX = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sch Typ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__SCH_TYP = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Crd Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__CRD_TMMS = GROUP_P_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Dur Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__DUR_TMMS = GROUP_P_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Un Blk Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__UN_BLK_MOD = GROUP_P_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sec Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__SEC_TMMS = GROUP_P_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Wei Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__WEI_MOD = GROUP_P_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Wei Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__WEI_TMMS = GROUP_P_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>PPV Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__PPV_VAL = GROUP_P_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Ph Gnd Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__PH_GND_VAL = GROUP_P_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Rv AMod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__RV_AMOD = GROUP_P_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Rv ATmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__RV_ATMMS = GROUP_P_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Rv Rs Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH__RV_RS_TMMS = GROUP_P_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>PSCH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>PSCH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSCH_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl <em>PSDE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPSDE()
	 * @generated
	 */
	int PSDE = 14;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__ANG = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gnd Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__GND_STR = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gnd Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__GND_OP = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Str Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__STR_DL_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dir Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE__DIR_MOD = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>PSDE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>PSDE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSDE_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDUPImpl <em>PDUP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDUPImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDUP()
	 * @generated
	 */
	int PDUP = 15;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__STR_VAL = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dir Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP__DIR_MOD = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PDUP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>PDUP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDUP_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTEFImpl <em>PTEF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTEFImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTEF()
	 * @generated
	 */
	int PTEF = 16;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gnd Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__GND_STR = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dir Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF__DIR_MOD = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PTEF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>PTEF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTEF_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOCImpl <em>PTOC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTOC()
	 * @generated
	 */
	int PTOC = 17;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tm ASt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__TM_AST = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tm ACrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__TM_ACRV = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__STR_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tm Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__TM_MULT = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__MIN_OP_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__MAX_OP_TMMS = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Typ Rs Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__TYP_RS_CRV = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Dir Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC__DIR_MOD = GROUP_P_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>PTOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>PTOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOC_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOFImpl <em>PTOF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOFImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTOF()
	 * @generated
	 */
	int PTOF = 18;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blk V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__BLK_V = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__STR_VAL = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Blk Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__BLK_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PTOF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PTOF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOF_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOVImpl <em>PTOV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOVImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTOV()
	 * @generated
	 */
	int PTOV = 19;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tm Vst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__TM_VST = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tm VCrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__TM_VCRV = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__STR_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tm Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__TM_MULT = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__MIN_OP_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__MAX_OP_TMMS = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>PTOV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>PTOV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTOV_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl <em>PTTR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTTR()
	 * @generated
	 */
	int PTTR = 20;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__AMP = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tmp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__TMP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tmp Rl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__TMP_RL = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod Rsv Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__LOD_RSV_ALM = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod Rsv Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__LOD_RSV_TR = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Age Rat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__AGE_RAT = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__STR = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__OP = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Alm Thm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__ALM_THM = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tm Tmp St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__TM_TMP_ST = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tm ASt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__TM_AST = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tm Tmp Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__TM_TMP_CRV = GROUP_P_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tm ACrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__TM_ACRV = GROUP_P_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tmp Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__TMP_MAX = GROUP_P_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__STR_VAL = GROUP_P_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__MIN_OP_TMMS = GROUP_P_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__MAX_OP_TMMS = GROUP_P_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Cons Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__CONS_TMS = GROUP_P_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Alm Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR__ALM_VAL = GROUP_P_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>PTTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>PTTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTTR_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUCImpl <em>PTUC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTUC()
	 * @generated
	 */
	int PTUC = 21;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tm ASt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__TM_AST = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tm ACrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__TM_ACRV = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__STR_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tm Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__TM_MULT = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__MIN_OP_TMMS = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__MAX_OP_TMMS = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cons Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__CONS_TMS = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Alm Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC__ALM_VAL = GROUP_P_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>PTUC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>PTUC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUC_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUFImpl <em>PTUF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUFImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTUF()
	 * @generated
	 */
	int PTUF = 22;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blk V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__BLK_V = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__STR_VAL = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Blk Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__BLK_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PTUF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PTUF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUF_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PVOCImpl <em>PVOC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PVOCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPVOC()
	 * @generated
	 */
	int PVOC = 23;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>AV St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__AV_ST = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tm ASt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__TM_AST = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tm Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__TM_MULT = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>AV Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__AV_CRV = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tm ACrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__TM_ACRV = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__MIN_OP_TMMS = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__MAX_OP_TMMS = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Typ Rs Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__TYP_RS_CRV = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>PVOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>PVOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVOC_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PVPHImpl <em>PVPH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PVPHImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPVPH()
	 * @generated
	 */
	int PVPH = 24;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VHz St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__VHZ_ST = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>VHz Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__VHZ_CRV = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__STR_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Typ Rs Crv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__TYP_RS_CRV = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tm Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__TM_MULT = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__MIN_OP_TMMS = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH__MAX_OP_TMMS = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>PVPH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>PVPH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVPH_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl <em>PTRC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTRC()
	 * @generated
	 */
	int PTRC = 25;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__TR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__STR = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tr Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__TR_MOD = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tr Pls Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC__TR_PLS_TMMS = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>PTRC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>PTRC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRC_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl <em>PTUV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTUV()
	 * @generated
	 */
	int PTUV = 26;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tm VSt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__TM_VST = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tm VCrv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__TM_VCRV = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__STR_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tm Mult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__TM_MULT = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__MIN_OP_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Op Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__MAX_OP_TMMS = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>PTUV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>PTUV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTUV_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PUPFImpl <em>PUPF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PUPFImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPUPF()
	 * @generated
	 */
	int PUPF = 27;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blk A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__BLK_A = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blk V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__BLK_V = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__STR_VAL = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Blk Val A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__BLK_VAL_A = GROUP_P_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Blk Val V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF__BLK_VAL_V = GROUP_P_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>PUPF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>PUPF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPF_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PZSUImpl <em>PZSU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PZSUImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPZSU()
	 * @generated
	 */
	int PZSU = 28;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__MODE = GROUP_P__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__BEHAVIOUR = GROUP_P__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__HEALTH = GROUP_P__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__NAME_PLT = GROUP_P__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__OP_CNT_RS = GROUP_P__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__STR = GROUP_P_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__OP = GROUP_P_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Str Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__STR_VAL = GROUP_P_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Op Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__OP_DL_TMMS = GROUP_P_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rs Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU__RS_DL_TMMS = GROUP_P_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>PZSU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU_FEATURE_COUNT = GROUP_P_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>PZSU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PZSU_OPERATION_COUNT = GROUP_P_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.GroupP <em>Group P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group P</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.GroupP
	 * @generated
	 */
	EClass getGroupP();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.GroupP#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.GroupP#getOpCntRs()
	 * @see #getGroupP()
	 * @generated
	 */
	EReference getGroupP_OpCntRs();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF <em>PDIF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDIF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF
	 * @generated
	 */
	EClass getPDIF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getStr()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getOp()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getTmASt <em>Tm ASt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ASt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getTmASt()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_TmASt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getDifAClc <em>Dif AClc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dif AClc</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getDifAClc()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_DifAClc();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getRstA <em>Rst A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rst A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getRstA()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_RstA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getLinCapac <em>Lin Capac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lin Capac</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getLinCapac()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_LinCapac();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getLoSet <em>Lo Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lo Set</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getLoSet()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_LoSet();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getHiSet <em>Hi Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hi Set</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getHiSet()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_HiSet();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getMinOpTmms <em>Min Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getMinOpTmms()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_MinOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getMaxOpTmms <em>Max Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getMaxOpTmms()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_MaxOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getRstMod <em>Rst Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rst Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getRstMod()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_RstMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getRsDiTmms <em>Rs Di Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Di Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getRsDiTmms()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_RsDiTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getTmACrv <em>Tm ACrv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ACrv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIF#getTmACrv()
	 * @see #getPDIF()
	 * @generated
	 */
	EReference getPDIF_TmACrv();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIR <em>PDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDIR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIR
	 * @generated
	 */
	EClass getPDIR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIR#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIR#getStr()
	 * @see #getPDIR()
	 * @generated
	 */
	EReference getPDIR_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIR#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIR#getOp()
	 * @see #getPDIR()
	 * @generated
	 */
	EReference getPDIR_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIR#getRsDiTmms <em>Rs Di Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Di Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIR#getRsDiTmms()
	 * @see #getPDIR()
	 * @generated
	 */
	EReference getPDIR_RsDiTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PFRC <em>PFRC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PFRC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PFRC
	 * @generated
	 */
	EClass getPFRC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getStr()
	 * @see #getPFRC()
	 * @generated
	 */
	EReference getPFRC_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getOp()
	 * @see #getPFRC()
	 * @generated
	 */
	EReference getPFRC_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getBlkV <em>Blk V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getBlkV()
	 * @see #getPFRC()
	 * @generated
	 */
	EReference getPFRC_BlkV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getStrVal()
	 * @see #getPFRC()
	 * @generated
	 */
	EReference getPFRC_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getBlkVal <em>Blk Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getBlkVal()
	 * @see #getPFRC()
	 * @generated
	 */
	EReference getPFRC_BlkVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getOpDiTmms <em>Op Di Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Di Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getOpDiTmms()
	 * @see #getPFRC()
	 * @generated
	 */
	EReference getPFRC_OpDiTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getRsDiTmms <em>Rs Di Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Di Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PFRC#getRsDiTmms()
	 * @see #getPFRC()
	 * @generated
	 */
	EReference getPFRC_RsDiTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHAR <em>PHAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHAR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHAR
	 * @generated
	 */
	EClass getPHAR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getStr()
	 * @see #getPHAR()
	 * @generated
	 */
	EReference getPHAR_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getHaRst <em>Ha Rst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ha Rst</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getHaRst()
	 * @see #getPHAR()
	 * @generated
	 */
	EReference getPHAR_HaRst();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getPhStr <em>Ph Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ph Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getPhStr()
	 * @see #getPHAR()
	 * @generated
	 */
	EReference getPHAR_PhStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getPhStop <em>Ph Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ph Stop</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getPhStop()
	 * @see #getPHAR()
	 * @generated
	 */
	EReference getPHAR_PhStop();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getOpDiTmms <em>Op Di Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Di Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getOpDiTmms()
	 * @see #getPHAR()
	 * @generated
	 */
	EReference getPHAR_OpDiTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getRsDiTmms <em>Rs Di Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Di Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHAR#getRsDiTmms()
	 * @see #getPHAR()
	 * @generated
	 */
	EReference getPHAR_RsDiTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF <em>POPF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POPF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF
	 * @generated
	 */
	EClass getPOPF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getStr()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getOp()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkA <em>Blk A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkA()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_BlkA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkV <em>Blk V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkV()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_BlkV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getStrVal()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getOpDiTmms <em>Op Di Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Di Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getOpDiTmms()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_OpDiTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getRsDiTmms <em>Rs Di Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Di Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getRsDiTmms()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_RsDiTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkValA <em>Blk Val A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkValA()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_BlkValA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkValV <em>Blk Val V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.POPF#getBlkValV()
	 * @see #getPOPF()
	 * @generated
	 */
	EReference getPOPF_BlkValV();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PPAM <em>PPAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPAM</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PPAM
	 * @generated
	 */
	EClass getPPAM();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PPAM#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PPAM#getStr()
	 * @see #getPPAM()
	 * @generated
	 */
	EReference getPPAM_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PPAM#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PPAM#getOp()
	 * @see #getPPAM()
	 * @generated
	 */
	EReference getPPAM_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PPAM#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PPAM#getStrVal()
	 * @see #getPPAM()
	 * @generated
	 */
	EReference getPPAM_StrVal();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS <em>PDIS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDIS</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS
	 * @generated
	 */
	EClass getPDIS();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getStr()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOp()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPoRch <em>Po Rch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Po Rch</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPoRch()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_PoRch();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhStr <em>Ph Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ph Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhStr()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_PhStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndStr <em>Gnd Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gnd Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndStr()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_GndStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getDirMod <em>Dir Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getDirMod()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_DirMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPctRch <em>Pct Rch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pct Rch</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPctRch()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_PctRch();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOfs <em>Ofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ofs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOfs()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_Ofs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPctOfs <em>Pct Ofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pct Ofs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPctOfs()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_PctOfs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisLod <em>Ris Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ris Lod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisLod()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_RisLod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getAngLod <em>Ang Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang Lod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getAngLod()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_AngLod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getTmDlMod <em>Tm Dl Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Dl Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getTmDlMod()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_TmDlMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getOpDlTmms()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhDlMod <em>Ph Dl Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ph Dl Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhDlMod()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_PhDlMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhDlTmms <em>Ph Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ph Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getPhDlTmms()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_PhDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndDlMod <em>Gnd Dl Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gnd Dl Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndDlMod()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_GndDlMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndDlTmms <em>Gnd Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gnd Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getGndDlTmms()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_GndDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X1</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getX1()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_X1();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getLinAng <em>Lin Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lin Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getLinAng()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_LinAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisGndRch <em>Ris Gnd Rch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ris Gnd Rch</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisGndRch()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_RisGndRch();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisPhRch <em>Ris Ph Rch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ris Ph Rch</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRisPhRch()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_RisPhRch();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getK0Fact <em>K0 Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>K0 Fact</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getK0Fact()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_K0Fact();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getK0FactAng <em>K0 Fact Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>K0 Fact Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getK0FactAng()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_K0FactAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDIS#getRsDlTmms()
	 * @see #getPDIS()
	 * @generated
	 */
	EReference getPDIS_RsDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDOP <em>PDOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDOP</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDOP
	 * @generated
	 */
	EClass getPDOP();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getStr()
	 * @see #getPDOP()
	 * @generated
	 */
	EReference getPDOP_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getOp()
	 * @see #getPDOP()
	 * @generated
	 */
	EReference getPDOP_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getDirMod <em>Dir Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getDirMod()
	 * @see #getPDOP()
	 * @generated
	 */
	EReference getPDOP_DirMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getStrVal()
	 * @see #getPDOP()
	 * @generated
	 */
	EReference getPDOP_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getOpDlTmms()
	 * @see #getPDOP()
	 * @generated
	 */
	EReference getPDOP_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDOP#getRsDlTmms()
	 * @see #getPDOP()
	 * @generated
	 */
	EReference getPDOP_RsDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ <em>PHIZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHIZ</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ
	 * @generated
	 */
	EClass getPHIZ();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getStr()
	 * @see #getPHIZ()
	 * @generated
	 */
	EReference getPHIZ_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getOp()
	 * @see #getPHIZ()
	 * @generated
	 */
	EReference getPHIZ_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getAStr <em>AStr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AStr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getAStr()
	 * @see #getPHIZ()
	 * @generated
	 */
	EReference getPHIZ_AStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getVStr <em>VStr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VStr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getVStr()
	 * @see #getPHIZ()
	 * @generated
	 */
	EReference getPHIZ_VStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getHVStr <em>HV Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HV Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getHVStr()
	 * @see #getPHIZ()
	 * @generated
	 */
	EReference getPHIZ_HVStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getOpDlTmms()
	 * @see #getPHIZ()
	 * @generated
	 */
	EReference getPHIZ_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PHIZ#getRsDlTmms()
	 * @see #getPHIZ()
	 * @generated
	 */
	EReference getPHIZ_RsDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PIOC <em>PIOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIOC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PIOC
	 * @generated
	 */
	EClass getPIOC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PIOC#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PIOC#getStr()
	 * @see #getPIOC()
	 * @generated
	 */
	EReference getPIOC_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PIOC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PIOC#getOp()
	 * @see #getPIOC()
	 * @generated
	 */
	EReference getPIOC_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PIOC#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PIOC#getStrVal()
	 * @see #getPIOC()
	 * @generated
	 */
	EReference getPIOC_StrVal();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI <em>PMRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PMRI</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI
	 * @generated
	 */
	EClass getPMRI();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getOp()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getStrInh <em>Str Inh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Inh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getStrInh()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_StrInh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getStrInhTmm <em>Str Inh Tmm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Inh Tmm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getStrInhTmm()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_StrInhTmm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getSetA <em>Set A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getSetA()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_SetA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getSetTms <em>Set Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Tms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getSetTms()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_SetTms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxNumStr <em>Max Num Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Num Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxNumStr()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_MaxNumStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxWrmStr <em>Max Wrm Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Wrm Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxWrmStr()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_MaxWrmStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxStrTmm <em>Max Str Tmm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Str Tmm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getMaxStrTmm()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_MaxStrTmm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getEqTmm <em>Eq Tmm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eq Tmm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getEqTmm()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_EqTmm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getInhTmm <em>Inh Tmm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inh Tmm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMRI#getInhTmm()
	 * @see #getPMRI()
	 * @generated
	 */
	EReference getPMRI_InhTmm();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMSS <em>PMSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PMSS</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMSS
	 * @generated
	 */
	EClass getPMSS();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getStr()
	 * @see #getPMSS()
	 * @generated
	 */
	EReference getPMSS_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getOp()
	 * @see #getPMSS()
	 * @generated
	 */
	EReference getPMSS_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getSetA <em>Set A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getSetA()
	 * @see #getPMSS()
	 * @generated
	 */
	EReference getPMSS_SetA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getSetTms <em>Set Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Tms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getSetTms()
	 * @see #getPMSS()
	 * @generated
	 */
	EReference getPMSS_SetTms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getMotStr <em>Mot Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mot Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getMotStr()
	 * @see #getPMSS()
	 * @generated
	 */
	EReference getPMSS_MotStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getLokRotTms <em>Lok Rot Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lok Rot Tms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PMSS#getLokRotTms()
	 * @see #getPMSS()
	 * @generated
	 */
	EReference getPMSS_LokRotTms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH <em>PSCH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSCH</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH
	 * @generated
	 */
	EClass getPSCH();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getProTx <em>Pro Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pro Tx</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getProTx()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_ProTx();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getProRx <em>Pro Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pro Rx</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getProRx()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_ProRx();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getStr()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getOp()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getCarRx <em>Car Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Car Rx</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getCarRx()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_CarRx();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getLosOfGrd <em>Los Of Grd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Los Of Grd</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getLosOfGrd()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_LosOfGrd();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getEcho <em>Echo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Echo</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getEcho()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_Echo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiOp <em>Wei Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wei Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiOp()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_WeiOp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvABlk <em>Rv ABlk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rv ABlk</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvABlk()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_RvABlk();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getGrdRx <em>Grd Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grd Rx</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getGrdRx()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_GrdRx();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getSchTyp <em>Sch Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sch Typ</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getSchTyp()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_SchTyp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getOpDlTmms()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getCrdTmms <em>Crd Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crd Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getCrdTmms()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_CrdTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getDurTmms <em>Dur Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dur Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getDurTmms()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_DurTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getUnBlkMod <em>Un Blk Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Un Blk Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getUnBlkMod()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_UnBlkMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getSecTmms <em>Sec Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sec Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getSecTmms()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_SecTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiMod <em>Wei Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wei Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiMod()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_WeiMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiTmms <em>Wei Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wei Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getWeiTmms()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_WeiTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getPPVVal <em>PPV Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PPV Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getPPVVal()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_PPVVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getPhGndVal <em>Ph Gnd Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ph Gnd Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getPhGndVal()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_PhGndVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvAMod <em>Rv AMod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rv AMod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvAMod()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_RvAMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvATmms <em>Rv ATmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rv ATmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvATmms()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_RvATmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvRsTmms <em>Rv Rs Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rv Rs Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSCH#getRvRsTmms()
	 * @see #getPSCH()
	 * @generated
	 */
	EReference getPSCH_RvRsTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE <em>PSDE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSDE</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE
	 * @generated
	 */
	EClass getPSDE();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getStr()
	 * @see #getPSDE()
	 * @generated
	 */
	EReference getPSDE_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getOp()
	 * @see #getPSDE()
	 * @generated
	 */
	EReference getPSDE_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getAng <em>Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getAng()
	 * @see #getPSDE()
	 * @generated
	 */
	EReference getPSDE_Ang();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getGndStr <em>Gnd Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gnd Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getGndStr()
	 * @see #getPSDE()
	 * @generated
	 */
	EReference getPSDE_GndStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getGndOp <em>Gnd Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gnd Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getGndOp()
	 * @see #getPSDE()
	 * @generated
	 */
	EReference getPSDE_GndOp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getStrDlTmms <em>Str Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getStrDlTmms()
	 * @see #getPSDE()
	 * @generated
	 */
	EReference getPSDE_StrDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getOpDlTmms()
	 * @see #getPSDE()
	 * @generated
	 */
	EReference getPSDE_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getDirMod <em>Dir Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PSDE#getDirMod()
	 * @see #getPSDE()
	 * @generated
	 */
	EReference getPSDE_DirMod();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDUP <em>PDUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDUP</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDUP
	 * @generated
	 */
	EClass getPDUP();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getStr()
	 * @see #getPDUP()
	 * @generated
	 */
	EReference getPDUP_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getOp()
	 * @see #getPDUP()
	 * @generated
	 */
	EReference getPDUP_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getStrVal()
	 * @see #getPDUP()
	 * @generated
	 */
	EReference getPDUP_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getOpDlTmms()
	 * @see #getPDUP()
	 * @generated
	 */
	EReference getPDUP_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getRsDlTmms()
	 * @see #getPDUP()
	 * @generated
	 */
	EReference getPDUP_RsDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getDirMod <em>Dir Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PDUP#getDirMod()
	 * @see #getPDUP()
	 * @generated
	 */
	EReference getPDUP_DirMod();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTEF <em>PTEF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTEF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTEF
	 * @generated
	 */
	EClass getPTEF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTEF#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTEF#getStr()
	 * @see #getPTEF()
	 * @generated
	 */
	EReference getPTEF_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTEF#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTEF#getOp()
	 * @see #getPTEF()
	 * @generated
	 */
	EReference getPTEF_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTEF#getGndStr <em>Gnd Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gnd Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTEF#getGndStr()
	 * @see #getPTEF()
	 * @generated
	 */
	EReference getPTEF_GndStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTEF#getDirMod <em>Dir Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTEF#getDirMod()
	 * @see #getPTEF()
	 * @generated
	 */
	EReference getPTEF_DirMod();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC <em>PTOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTOC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC
	 * @generated
	 */
	EClass getPTOC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getStr()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getOp()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmASt <em>Tm ASt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ASt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmASt()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_TmASt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmACrv <em>Tm ACrv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ACrv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmACrv()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_TmACrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getStrVal()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmMult <em>Tm Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Mult</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTmMult()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_TmMult();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getMinOpTmms <em>Min Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getMinOpTmms()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_MinOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getMaxOpTmms <em>Max Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getMaxOpTmms()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_MaxOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getOpDlTmms()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTypRsCrv <em>Typ Rs Crv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typ Rs Crv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getTypRsCrv()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_TypRsCrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getRsDlTmms()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_RsDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getDirMod <em>Dir Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOC#getDirMod()
	 * @see #getPTOC()
	 * @generated
	 */
	EReference getPTOC_DirMod();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOF <em>PTOF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTOF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOF
	 * @generated
	 */
	EClass getPTOF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getStr()
	 * @see #getPTOF()
	 * @generated
	 */
	EReference getPTOF_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getOp()
	 * @see #getPTOF()
	 * @generated
	 */
	EReference getPTOF_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getBlkV <em>Blk V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getBlkV()
	 * @see #getPTOF()
	 * @generated
	 */
	EReference getPTOF_BlkV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getStrVal()
	 * @see #getPTOF()
	 * @generated
	 */
	EReference getPTOF_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getBlkVal <em>Blk Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getBlkVal()
	 * @see #getPTOF()
	 * @generated
	 */
	EReference getPTOF_BlkVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getOpDlTmms()
	 * @see #getPTOF()
	 * @generated
	 */
	EReference getPTOF_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOF#getRsDlTmms()
	 * @see #getPTOF()
	 * @generated
	 */
	EReference getPTOF_RsDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV <em>PTOV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTOV</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV
	 * @generated
	 */
	EClass getPTOV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getStr()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getOp()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getTmVst <em>Tm Vst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Vst</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getTmVst()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_TmVst();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getTmVCrv <em>Tm VCrv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm VCrv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getTmVCrv()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_TmVCrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getStrVal()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getTmMult <em>Tm Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Mult</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getTmMult()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_TmMult();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getMinOpTmms <em>Min Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getMinOpTmms()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_MinOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getMaxOpTmms <em>Max Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getMaxOpTmms()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_MaxOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getOpDlTmms()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTOV#getRsDlTmms()
	 * @see #getPTOV()
	 * @generated
	 */
	EReference getPTOV_RsDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR <em>PTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTTR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR
	 * @generated
	 */
	EClass getPTTR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getAmp <em>Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amp</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getAmp()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_Amp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmp <em>Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmp</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmp()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_Tmp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmpRl <em>Tmp Rl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmp Rl</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmpRl()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_TmpRl();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getLodRsvAlm <em>Lod Rsv Alm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lod Rsv Alm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getLodRsvAlm()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_LodRsvAlm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getLodRsvTr <em>Lod Rsv Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lod Rsv Tr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getLodRsvTr()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_LodRsvTr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getAgeRat <em>Age Rat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Age Rat</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getAgeRat()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_AgeRat();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getStr()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getOp()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getAlmThm <em>Alm Thm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alm Thm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getAlmThm()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_AlmThm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmTmpSt <em>Tm Tmp St</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Tmp St</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmTmpSt()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_TmTmpSt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmASt <em>Tm ASt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ASt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmASt()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_TmASt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmTmpCrv <em>Tm Tmp Crv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Tmp Crv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmTmpCrv()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_TmTmpCrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmACrv <em>Tm ACrv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ACrv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmACrv()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_TmACrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmpMax <em>Tmp Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmp Max</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getTmpMax()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_TmpMax();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getStrVal()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getOpDlTmms()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getMinOpTmms <em>Min Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getMinOpTmms()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_MinOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getMaxOpTmms <em>Max Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getMaxOpTmms()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_MaxOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getRsDlTmms()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_RsDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getConsTms <em>Cons Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cons Tms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getConsTms()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_ConsTms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getAlmVal <em>Alm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alm Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTTR#getAlmVal()
	 * @see #getPTTR()
	 * @generated
	 */
	EReference getPTTR_AlmVal();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC <em>PTUC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTUC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC
	 * @generated
	 */
	EClass getPTUC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getStr()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getOp()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getTmASt <em>Tm ASt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ASt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getTmASt()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_TmASt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getTmACrv <em>Tm ACrv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ACrv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getTmACrv()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_TmACrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getStrVal()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getOpDlTmms()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getTmMult <em>Tm Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Mult</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getTmMult()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_TmMult();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getMinOpTmms <em>Min Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getMinOpTmms()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_MinOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getMaxOpTmms <em>Max Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getMaxOpTmms()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_MaxOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getRsDlTmms()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_RsDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getConsTms <em>Cons Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cons Tms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getConsTms()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_ConsTms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getAlmVal <em>Alm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alm Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUC#getAlmVal()
	 * @see #getPTUC()
	 * @generated
	 */
	EReference getPTUC_AlmVal();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUF <em>PTUF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTUF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUF
	 * @generated
	 */
	EClass getPTUF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getStr()
	 * @see #getPTUF()
	 * @generated
	 */
	EReference getPTUF_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getOp()
	 * @see #getPTUF()
	 * @generated
	 */
	EReference getPTUF_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getBlkV <em>Blk V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getBlkV()
	 * @see #getPTUF()
	 * @generated
	 */
	EReference getPTUF_BlkV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getStrVal()
	 * @see #getPTUF()
	 * @generated
	 */
	EReference getPTUF_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getBlkVal <em>Blk Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getBlkVal()
	 * @see #getPTUF()
	 * @generated
	 */
	EReference getPTUF_BlkVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getOpDlTmms()
	 * @see #getPTUF()
	 * @generated
	 */
	EReference getPTUF_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUF#getRsDlTmms()
	 * @see #getPTUF()
	 * @generated
	 */
	EReference getPTUF_RsDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC <em>PVOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PVOC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC
	 * @generated
	 */
	EClass getPVOC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getStr()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getOp()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getAVSt <em>AV St</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AV St</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getAVSt()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_AVSt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getTmASt <em>Tm ASt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ASt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getTmASt()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_TmASt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getTmMult <em>Tm Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Mult</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getTmMult()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_TmMult();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getAVCrv <em>AV Crv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AV Crv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getAVCrv()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_AVCrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getTmACrv <em>Tm ACrv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm ACrv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getTmACrv()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_TmACrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getMinOpTmms <em>Min Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getMinOpTmms()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_MinOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getMaxOpTmms <em>Max Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getMaxOpTmms()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_MaxOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getOpDlTmms()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getTypRsCrv <em>Typ Rs Crv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typ Rs Crv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getTypRsCrv()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_TypRsCrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVOC#getRsDlTmms()
	 * @see #getPVOC()
	 * @generated
	 */
	EReference getPVOC_RsDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH <em>PVPH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PVPH</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH
	 * @generated
	 */
	EClass getPVPH();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getStr()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getOp()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getVHzSt <em>VHz St</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VHz St</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getVHzSt()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_VHzSt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getVHzCrv <em>VHz Crv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VHz Crv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getVHzCrv()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_VHzCrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getStrVal()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getOpDlTmms()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getTypRsCrv <em>Typ Rs Crv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typ Rs Crv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getTypRsCrv()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_TypRsCrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getRsDlTmms()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_RsDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getTmMult <em>Tm Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Mult</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getTmMult()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_TmMult();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getMinOpTmms <em>Min Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getMinOpTmms()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_MinOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getMaxOpTmms <em>Max Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PVPH#getMaxOpTmms()
	 * @see #getPVPH()
	 * @generated
	 */
	EReference getPVPH_MaxOpTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTRC <em>PTRC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTRC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTRC
	 * @generated
	 */
	EClass getPTRC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getTr()
	 * @see #getPTRC()
	 * @generated
	 */
	EReference getPTRC_Tr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getOp()
	 * @see #getPTRC()
	 * @generated
	 */
	EReference getPTRC_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getStr()
	 * @see #getPTRC()
	 * @generated
	 */
	EReference getPTRC_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getTrMod <em>Tr Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getTrMod()
	 * @see #getPTRC()
	 * @generated
	 */
	EReference getPTRC_TrMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getTrPlsTmms <em>Tr Pls Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr Pls Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTRC#getTrPlsTmms()
	 * @see #getPTRC()
	 * @generated
	 */
	EReference getPTRC_TrPlsTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV <em>PTUV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTUV</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV
	 * @generated
	 */
	EClass getPTUV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getStr()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getOp()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getTmVSt <em>Tm VSt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm VSt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getTmVSt()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_TmVSt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getTmVCrv <em>Tm VCrv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm VCrv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getTmVCrv()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_TmVCrv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getStrVal()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getTmMult <em>Tm Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Mult</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getTmMult()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_TmMult();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getMinOpTmms <em>Min Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getMinOpTmms()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_MinOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getMaxOpTmms <em>Max Op Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getMaxOpTmms()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_MaxOpTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getOpDlTmms()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PTUV#getRsDlTmms()
	 * @see #getPTUV()
	 * @generated
	 */
	EReference getPTUV_RsDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF <em>PUPF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PUPF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF
	 * @generated
	 */
	EClass getPUPF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getStr()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getOp()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getBlkA <em>Blk A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getBlkA()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_BlkA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getBlkV <em>Blk V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getBlkV()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_BlkV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getStrVal()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getOpDlTmms()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getRsDlTmms()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_RsDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getBlkValA <em>Blk Val A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getBlkValA()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_BlkValA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getBlkValV <em>Blk Val V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PUPF#getBlkValV()
	 * @see #getPUPF()
	 * @generated
	 */
	EReference getPUPF_BlkValV();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PZSU <em>PZSU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PZSU</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PZSU
	 * @generated
	 */
	EClass getPZSU();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getStr()
	 * @see #getPZSU()
	 * @generated
	 */
	EReference getPZSU_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getOp()
	 * @see #getPZSU()
	 * @generated
	 */
	EReference getPZSU_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getStrVal <em>Str Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getStrVal()
	 * @see #getPZSU()
	 * @generated
	 */
	EReference getPZSU_StrVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getOpDlTmms <em>Op Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getOpDlTmms()
	 * @see #getPZSU()
	 * @generated
	 */
	EReference getPZSU_OpDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getRsDlTmms <em>Rs Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rs Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupP.PZSU#getRsDlTmms()
	 * @see #getPZSU()
	 * @generated
	 */
	EReference getPZSU_RsDlTmms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupPFactory getLNGroupPFactory();

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
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.GroupPImpl <em>Group P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.GroupPImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getGroupP()
		 * @generated
		 */
		EClass GROUP_P = eINSTANCE.getGroupP();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_P__OP_CNT_RS = eINSTANCE.getGroupP_OpCntRs();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDIFImpl <em>PDIF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDIFImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDIF()
		 * @generated
		 */
		EClass PDIF = eINSTANCE.getPDIF();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__STR = eINSTANCE.getPDIF_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__OP = eINSTANCE.getPDIF_Op();

		/**
		 * The meta object literal for the '<em><b>Tm ASt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__TM_AST = eINSTANCE.getPDIF_TmASt();

		/**
		 * The meta object literal for the '<em><b>Dif AClc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__DIF_ACLC = eINSTANCE.getPDIF_DifAClc();

		/**
		 * The meta object literal for the '<em><b>Rst A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__RST_A = eINSTANCE.getPDIF_RstA();

		/**
		 * The meta object literal for the '<em><b>Lin Capac</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__LIN_CAPAC = eINSTANCE.getPDIF_LinCapac();

		/**
		 * The meta object literal for the '<em><b>Lo Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__LO_SET = eINSTANCE.getPDIF_LoSet();

		/**
		 * The meta object literal for the '<em><b>Hi Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__HI_SET = eINSTANCE.getPDIF_HiSet();

		/**
		 * The meta object literal for the '<em><b>Min Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__MIN_OP_TMMS = eINSTANCE.getPDIF_MinOpTmms();

		/**
		 * The meta object literal for the '<em><b>Max Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__MAX_OP_TMMS = eINSTANCE.getPDIF_MaxOpTmms();

		/**
		 * The meta object literal for the '<em><b>Rst Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__RST_MOD = eINSTANCE.getPDIF_RstMod();

		/**
		 * The meta object literal for the '<em><b>Rs Di Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__RS_DI_TMMS = eINSTANCE.getPDIF_RsDiTmms();

		/**
		 * The meta object literal for the '<em><b>Tm ACrv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIF__TM_ACRV = eINSTANCE.getPDIF_TmACrv();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDIRImpl <em>PDIR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDIRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDIR()
		 * @generated
		 */
		EClass PDIR = eINSTANCE.getPDIR();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIR__STR = eINSTANCE.getPDIR_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIR__OP = eINSTANCE.getPDIR_Op();

		/**
		 * The meta object literal for the '<em><b>Rs Di Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIR__RS_DI_TMMS = eINSTANCE.getPDIR_RsDiTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl <em>PFRC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PFRCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPFRC()
		 * @generated
		 */
		EClass PFRC = eINSTANCE.getPFRC();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFRC__STR = eINSTANCE.getPFRC_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFRC__OP = eINSTANCE.getPFRC_Op();

		/**
		 * The meta object literal for the '<em><b>Blk V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFRC__BLK_V = eINSTANCE.getPFRC_BlkV();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFRC__STR_VAL = eINSTANCE.getPFRC_StrVal();

		/**
		 * The meta object literal for the '<em><b>Blk Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFRC__BLK_VAL = eINSTANCE.getPFRC_BlkVal();

		/**
		 * The meta object literal for the '<em><b>Op Di Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFRC__OP_DI_TMMS = eINSTANCE.getPFRC_OpDiTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Di Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFRC__RS_DI_TMMS = eINSTANCE.getPFRC_RsDiTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PHARImpl <em>PHAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PHARImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPHAR()
		 * @generated
		 */
		EClass PHAR = eINSTANCE.getPHAR();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHAR__STR = eINSTANCE.getPHAR_Str();

		/**
		 * The meta object literal for the '<em><b>Ha Rst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHAR__HA_RST = eINSTANCE.getPHAR_HaRst();

		/**
		 * The meta object literal for the '<em><b>Ph Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHAR__PH_STR = eINSTANCE.getPHAR_PhStr();

		/**
		 * The meta object literal for the '<em><b>Ph Stop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHAR__PH_STOP = eINSTANCE.getPHAR_PhStop();

		/**
		 * The meta object literal for the '<em><b>Op Di Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHAR__OP_DI_TMMS = eINSTANCE.getPHAR_OpDiTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Di Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHAR__RS_DI_TMMS = eINSTANCE.getPHAR_RsDiTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.POPFImpl <em>POPF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.POPFImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPOPF()
		 * @generated
		 */
		EClass POPF = eINSTANCE.getPOPF();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__STR = eINSTANCE.getPOPF_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__OP = eINSTANCE.getPOPF_Op();

		/**
		 * The meta object literal for the '<em><b>Blk A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__BLK_A = eINSTANCE.getPOPF_BlkA();

		/**
		 * The meta object literal for the '<em><b>Blk V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__BLK_V = eINSTANCE.getPOPF_BlkV();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__STR_VAL = eINSTANCE.getPOPF_StrVal();

		/**
		 * The meta object literal for the '<em><b>Op Di Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__OP_DI_TMMS = eINSTANCE.getPOPF_OpDiTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Di Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__RS_DI_TMMS = eINSTANCE.getPOPF_RsDiTmms();

		/**
		 * The meta object literal for the '<em><b>Blk Val A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__BLK_VAL_A = eINSTANCE.getPOPF_BlkValA();

		/**
		 * The meta object literal for the '<em><b>Blk Val V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPF__BLK_VAL_V = eINSTANCE.getPOPF_BlkValV();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PPAMImpl <em>PPAM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PPAMImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPPAM()
		 * @generated
		 */
		EClass PPAM = eINSTANCE.getPPAM();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPAM__STR = eINSTANCE.getPPAM_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPAM__OP = eINSTANCE.getPPAM_Op();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPAM__STR_VAL = eINSTANCE.getPPAM_StrVal();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDISImpl <em>PDIS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDISImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDIS()
		 * @generated
		 */
		EClass PDIS = eINSTANCE.getPDIS();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__STR = eINSTANCE.getPDIS_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__OP = eINSTANCE.getPDIS_Op();

		/**
		 * The meta object literal for the '<em><b>Po Rch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__PO_RCH = eINSTANCE.getPDIS_PoRch();

		/**
		 * The meta object literal for the '<em><b>Ph Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__PH_STR = eINSTANCE.getPDIS_PhStr();

		/**
		 * The meta object literal for the '<em><b>Gnd Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__GND_STR = eINSTANCE.getPDIS_GndStr();

		/**
		 * The meta object literal for the '<em><b>Dir Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__DIR_MOD = eINSTANCE.getPDIS_DirMod();

		/**
		 * The meta object literal for the '<em><b>Pct Rch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__PCT_RCH = eINSTANCE.getPDIS_PctRch();

		/**
		 * The meta object literal for the '<em><b>Ofs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__OFS = eINSTANCE.getPDIS_Ofs();

		/**
		 * The meta object literal for the '<em><b>Pct Ofs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__PCT_OFS = eINSTANCE.getPDIS_PctOfs();

		/**
		 * The meta object literal for the '<em><b>Ris Lod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__RIS_LOD = eINSTANCE.getPDIS_RisLod();

		/**
		 * The meta object literal for the '<em><b>Ang Lod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__ANG_LOD = eINSTANCE.getPDIS_AngLod();

		/**
		 * The meta object literal for the '<em><b>Tm Dl Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__TM_DL_MOD = eINSTANCE.getPDIS_TmDlMod();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__OP_DL_TMMS = eINSTANCE.getPDIS_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Ph Dl Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__PH_DL_MOD = eINSTANCE.getPDIS_PhDlMod();

		/**
		 * The meta object literal for the '<em><b>Ph Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__PH_DL_TMMS = eINSTANCE.getPDIS_PhDlTmms();

		/**
		 * The meta object literal for the '<em><b>Gnd Dl Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__GND_DL_MOD = eINSTANCE.getPDIS_GndDlMod();

		/**
		 * The meta object literal for the '<em><b>Gnd Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__GND_DL_TMMS = eINSTANCE.getPDIS_GndDlTmms();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__X1 = eINSTANCE.getPDIS_X1();

		/**
		 * The meta object literal for the '<em><b>Lin Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__LIN_ANG = eINSTANCE.getPDIS_LinAng();

		/**
		 * The meta object literal for the '<em><b>Ris Gnd Rch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__RIS_GND_RCH = eINSTANCE.getPDIS_RisGndRch();

		/**
		 * The meta object literal for the '<em><b>Ris Ph Rch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__RIS_PH_RCH = eINSTANCE.getPDIS_RisPhRch();

		/**
		 * The meta object literal for the '<em><b>K0 Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__K0_FACT = eINSTANCE.getPDIS_K0Fact();

		/**
		 * The meta object literal for the '<em><b>K0 Fact Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__K0_FACT_ANG = eINSTANCE.getPDIS_K0FactAng();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDIS__RS_DL_TMMS = eINSTANCE.getPDIS_RsDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDOPImpl <em>PDOP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDOPImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDOP()
		 * @generated
		 */
		EClass PDOP = eINSTANCE.getPDOP();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDOP__STR = eINSTANCE.getPDOP_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDOP__OP = eINSTANCE.getPDOP_Op();

		/**
		 * The meta object literal for the '<em><b>Dir Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDOP__DIR_MOD = eINSTANCE.getPDOP_DirMod();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDOP__STR_VAL = eINSTANCE.getPDOP_StrVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDOP__OP_DL_TMMS = eINSTANCE.getPDOP_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDOP__RS_DL_TMMS = eINSTANCE.getPDOP_RsDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PHIZImpl <em>PHIZ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PHIZImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPHIZ()
		 * @generated
		 */
		EClass PHIZ = eINSTANCE.getPHIZ();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHIZ__STR = eINSTANCE.getPHIZ_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHIZ__OP = eINSTANCE.getPHIZ_Op();

		/**
		 * The meta object literal for the '<em><b>AStr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHIZ__ASTR = eINSTANCE.getPHIZ_AStr();

		/**
		 * The meta object literal for the '<em><b>VStr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHIZ__VSTR = eINSTANCE.getPHIZ_VStr();

		/**
		 * The meta object literal for the '<em><b>HV Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHIZ__HV_STR = eINSTANCE.getPHIZ_HVStr();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHIZ__OP_DL_TMMS = eINSTANCE.getPHIZ_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHIZ__RS_DL_TMMS = eINSTANCE.getPHIZ_RsDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PIOCImpl <em>PIOC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PIOCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPIOC()
		 * @generated
		 */
		EClass PIOC = eINSTANCE.getPIOC();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIOC__STR = eINSTANCE.getPIOC_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIOC__OP = eINSTANCE.getPIOC_Op();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIOC__STR_VAL = eINSTANCE.getPIOC_StrVal();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMRIImpl <em>PMRI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMRIImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPMRI()
		 * @generated
		 */
		EClass PMRI = eINSTANCE.getPMRI();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__OP = eINSTANCE.getPMRI_Op();

		/**
		 * The meta object literal for the '<em><b>Str Inh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__STR_INH = eINSTANCE.getPMRI_StrInh();

		/**
		 * The meta object literal for the '<em><b>Str Inh Tmm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__STR_INH_TMM = eINSTANCE.getPMRI_StrInhTmm();

		/**
		 * The meta object literal for the '<em><b>Set A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__SET_A = eINSTANCE.getPMRI_SetA();

		/**
		 * The meta object literal for the '<em><b>Set Tms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__SET_TMS = eINSTANCE.getPMRI_SetTms();

		/**
		 * The meta object literal for the '<em><b>Max Num Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__MAX_NUM_STR = eINSTANCE.getPMRI_MaxNumStr();

		/**
		 * The meta object literal for the '<em><b>Max Wrm Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__MAX_WRM_STR = eINSTANCE.getPMRI_MaxWrmStr();

		/**
		 * The meta object literal for the '<em><b>Max Str Tmm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__MAX_STR_TMM = eINSTANCE.getPMRI_MaxStrTmm();

		/**
		 * The meta object literal for the '<em><b>Eq Tmm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__EQ_TMM = eINSTANCE.getPMRI_EqTmm();

		/**
		 * The meta object literal for the '<em><b>Inh Tmm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMRI__INH_TMM = eINSTANCE.getPMRI_InhTmm();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl <em>PMSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PMSSImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPMSS()
		 * @generated
		 */
		EClass PMSS = eINSTANCE.getPMSS();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMSS__STR = eINSTANCE.getPMSS_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMSS__OP = eINSTANCE.getPMSS_Op();

		/**
		 * The meta object literal for the '<em><b>Set A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMSS__SET_A = eINSTANCE.getPMSS_SetA();

		/**
		 * The meta object literal for the '<em><b>Set Tms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMSS__SET_TMS = eINSTANCE.getPMSS_SetTms();

		/**
		 * The meta object literal for the '<em><b>Mot Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMSS__MOT_STR = eINSTANCE.getPMSS_MotStr();

		/**
		 * The meta object literal for the '<em><b>Lok Rot Tms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMSS__LOK_ROT_TMS = eINSTANCE.getPMSS_LokRotTms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSCHImpl <em>PSCH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSCHImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPSCH()
		 * @generated
		 */
		EClass PSCH = eINSTANCE.getPSCH();

		/**
		 * The meta object literal for the '<em><b>Pro Tx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__PRO_TX = eINSTANCE.getPSCH_ProTx();

		/**
		 * The meta object literal for the '<em><b>Pro Rx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__PRO_RX = eINSTANCE.getPSCH_ProRx();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__STR = eINSTANCE.getPSCH_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__OP = eINSTANCE.getPSCH_Op();

		/**
		 * The meta object literal for the '<em><b>Car Rx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__CAR_RX = eINSTANCE.getPSCH_CarRx();

		/**
		 * The meta object literal for the '<em><b>Los Of Grd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__LOS_OF_GRD = eINSTANCE.getPSCH_LosOfGrd();

		/**
		 * The meta object literal for the '<em><b>Echo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__ECHO = eINSTANCE.getPSCH_Echo();

		/**
		 * The meta object literal for the '<em><b>Wei Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__WEI_OP = eINSTANCE.getPSCH_WeiOp();

		/**
		 * The meta object literal for the '<em><b>Rv ABlk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__RV_ABLK = eINSTANCE.getPSCH_RvABlk();

		/**
		 * The meta object literal for the '<em><b>Grd Rx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__GRD_RX = eINSTANCE.getPSCH_GrdRx();

		/**
		 * The meta object literal for the '<em><b>Sch Typ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__SCH_TYP = eINSTANCE.getPSCH_SchTyp();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__OP_DL_TMMS = eINSTANCE.getPSCH_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Crd Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__CRD_TMMS = eINSTANCE.getPSCH_CrdTmms();

		/**
		 * The meta object literal for the '<em><b>Dur Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__DUR_TMMS = eINSTANCE.getPSCH_DurTmms();

		/**
		 * The meta object literal for the '<em><b>Un Blk Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__UN_BLK_MOD = eINSTANCE.getPSCH_UnBlkMod();

		/**
		 * The meta object literal for the '<em><b>Sec Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__SEC_TMMS = eINSTANCE.getPSCH_SecTmms();

		/**
		 * The meta object literal for the '<em><b>Wei Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__WEI_MOD = eINSTANCE.getPSCH_WeiMod();

		/**
		 * The meta object literal for the '<em><b>Wei Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__WEI_TMMS = eINSTANCE.getPSCH_WeiTmms();

		/**
		 * The meta object literal for the '<em><b>PPV Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__PPV_VAL = eINSTANCE.getPSCH_PPVVal();

		/**
		 * The meta object literal for the '<em><b>Ph Gnd Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__PH_GND_VAL = eINSTANCE.getPSCH_PhGndVal();

		/**
		 * The meta object literal for the '<em><b>Rv AMod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__RV_AMOD = eINSTANCE.getPSCH_RvAMod();

		/**
		 * The meta object literal for the '<em><b>Rv ATmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__RV_ATMMS = eINSTANCE.getPSCH_RvATmms();

		/**
		 * The meta object literal for the '<em><b>Rv Rs Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSCH__RV_RS_TMMS = eINSTANCE.getPSCH_RvRsTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl <em>PSDE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PSDEImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPSDE()
		 * @generated
		 */
		EClass PSDE = eINSTANCE.getPSDE();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSDE__STR = eINSTANCE.getPSDE_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSDE__OP = eINSTANCE.getPSDE_Op();

		/**
		 * The meta object literal for the '<em><b>Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSDE__ANG = eINSTANCE.getPSDE_Ang();

		/**
		 * The meta object literal for the '<em><b>Gnd Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSDE__GND_STR = eINSTANCE.getPSDE_GndStr();

		/**
		 * The meta object literal for the '<em><b>Gnd Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSDE__GND_OP = eINSTANCE.getPSDE_GndOp();

		/**
		 * The meta object literal for the '<em><b>Str Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSDE__STR_DL_TMMS = eINSTANCE.getPSDE_StrDlTmms();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSDE__OP_DL_TMMS = eINSTANCE.getPSDE_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Dir Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSDE__DIR_MOD = eINSTANCE.getPSDE_DirMod();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDUPImpl <em>PDUP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PDUPImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPDUP()
		 * @generated
		 */
		EClass PDUP = eINSTANCE.getPDUP();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDUP__STR = eINSTANCE.getPDUP_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDUP__OP = eINSTANCE.getPDUP_Op();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDUP__STR_VAL = eINSTANCE.getPDUP_StrVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDUP__OP_DL_TMMS = eINSTANCE.getPDUP_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDUP__RS_DL_TMMS = eINSTANCE.getPDUP_RsDlTmms();

		/**
		 * The meta object literal for the '<em><b>Dir Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDUP__DIR_MOD = eINSTANCE.getPDUP_DirMod();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTEFImpl <em>PTEF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTEFImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTEF()
		 * @generated
		 */
		EClass PTEF = eINSTANCE.getPTEF();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTEF__STR = eINSTANCE.getPTEF_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTEF__OP = eINSTANCE.getPTEF_Op();

		/**
		 * The meta object literal for the '<em><b>Gnd Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTEF__GND_STR = eINSTANCE.getPTEF_GndStr();

		/**
		 * The meta object literal for the '<em><b>Dir Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTEF__DIR_MOD = eINSTANCE.getPTEF_DirMod();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOCImpl <em>PTOC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTOC()
		 * @generated
		 */
		EClass PTOC = eINSTANCE.getPTOC();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__STR = eINSTANCE.getPTOC_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__OP = eINSTANCE.getPTOC_Op();

		/**
		 * The meta object literal for the '<em><b>Tm ASt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__TM_AST = eINSTANCE.getPTOC_TmASt();

		/**
		 * The meta object literal for the '<em><b>Tm ACrv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__TM_ACRV = eINSTANCE.getPTOC_TmACrv();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__STR_VAL = eINSTANCE.getPTOC_StrVal();

		/**
		 * The meta object literal for the '<em><b>Tm Mult</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__TM_MULT = eINSTANCE.getPTOC_TmMult();

		/**
		 * The meta object literal for the '<em><b>Min Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__MIN_OP_TMMS = eINSTANCE.getPTOC_MinOpTmms();

		/**
		 * The meta object literal for the '<em><b>Max Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__MAX_OP_TMMS = eINSTANCE.getPTOC_MaxOpTmms();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__OP_DL_TMMS = eINSTANCE.getPTOC_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Typ Rs Crv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__TYP_RS_CRV = eINSTANCE.getPTOC_TypRsCrv();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__RS_DL_TMMS = eINSTANCE.getPTOC_RsDlTmms();

		/**
		 * The meta object literal for the '<em><b>Dir Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOC__DIR_MOD = eINSTANCE.getPTOC_DirMod();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOFImpl <em>PTOF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOFImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTOF()
		 * @generated
		 */
		EClass PTOF = eINSTANCE.getPTOF();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOF__STR = eINSTANCE.getPTOF_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOF__OP = eINSTANCE.getPTOF_Op();

		/**
		 * The meta object literal for the '<em><b>Blk V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOF__BLK_V = eINSTANCE.getPTOF_BlkV();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOF__STR_VAL = eINSTANCE.getPTOF_StrVal();

		/**
		 * The meta object literal for the '<em><b>Blk Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOF__BLK_VAL = eINSTANCE.getPTOF_BlkVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOF__OP_DL_TMMS = eINSTANCE.getPTOF_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOF__RS_DL_TMMS = eINSTANCE.getPTOF_RsDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOVImpl <em>PTOV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTOVImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTOV()
		 * @generated
		 */
		EClass PTOV = eINSTANCE.getPTOV();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__STR = eINSTANCE.getPTOV_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__OP = eINSTANCE.getPTOV_Op();

		/**
		 * The meta object literal for the '<em><b>Tm Vst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__TM_VST = eINSTANCE.getPTOV_TmVst();

		/**
		 * The meta object literal for the '<em><b>Tm VCrv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__TM_VCRV = eINSTANCE.getPTOV_TmVCrv();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__STR_VAL = eINSTANCE.getPTOV_StrVal();

		/**
		 * The meta object literal for the '<em><b>Tm Mult</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__TM_MULT = eINSTANCE.getPTOV_TmMult();

		/**
		 * The meta object literal for the '<em><b>Min Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__MIN_OP_TMMS = eINSTANCE.getPTOV_MinOpTmms();

		/**
		 * The meta object literal for the '<em><b>Max Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__MAX_OP_TMMS = eINSTANCE.getPTOV_MaxOpTmms();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__OP_DL_TMMS = eINSTANCE.getPTOV_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTOV__RS_DL_TMMS = eINSTANCE.getPTOV_RsDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl <em>PTTR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTTRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTTR()
		 * @generated
		 */
		EClass PTTR = eINSTANCE.getPTTR();

		/**
		 * The meta object literal for the '<em><b>Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__AMP = eINSTANCE.getPTTR_Amp();

		/**
		 * The meta object literal for the '<em><b>Tmp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__TMP = eINSTANCE.getPTTR_Tmp();

		/**
		 * The meta object literal for the '<em><b>Tmp Rl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__TMP_RL = eINSTANCE.getPTTR_TmpRl();

		/**
		 * The meta object literal for the '<em><b>Lod Rsv Alm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__LOD_RSV_ALM = eINSTANCE.getPTTR_LodRsvAlm();

		/**
		 * The meta object literal for the '<em><b>Lod Rsv Tr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__LOD_RSV_TR = eINSTANCE.getPTTR_LodRsvTr();

		/**
		 * The meta object literal for the '<em><b>Age Rat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__AGE_RAT = eINSTANCE.getPTTR_AgeRat();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__STR = eINSTANCE.getPTTR_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__OP = eINSTANCE.getPTTR_Op();

		/**
		 * The meta object literal for the '<em><b>Alm Thm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__ALM_THM = eINSTANCE.getPTTR_AlmThm();

		/**
		 * The meta object literal for the '<em><b>Tm Tmp St</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__TM_TMP_ST = eINSTANCE.getPTTR_TmTmpSt();

		/**
		 * The meta object literal for the '<em><b>Tm ASt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__TM_AST = eINSTANCE.getPTTR_TmASt();

		/**
		 * The meta object literal for the '<em><b>Tm Tmp Crv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__TM_TMP_CRV = eINSTANCE.getPTTR_TmTmpCrv();

		/**
		 * The meta object literal for the '<em><b>Tm ACrv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__TM_ACRV = eINSTANCE.getPTTR_TmACrv();

		/**
		 * The meta object literal for the '<em><b>Tmp Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__TMP_MAX = eINSTANCE.getPTTR_TmpMax();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__STR_VAL = eINSTANCE.getPTTR_StrVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__OP_DL_TMMS = eINSTANCE.getPTTR_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Min Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__MIN_OP_TMMS = eINSTANCE.getPTTR_MinOpTmms();

		/**
		 * The meta object literal for the '<em><b>Max Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__MAX_OP_TMMS = eINSTANCE.getPTTR_MaxOpTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__RS_DL_TMMS = eINSTANCE.getPTTR_RsDlTmms();

		/**
		 * The meta object literal for the '<em><b>Cons Tms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__CONS_TMS = eINSTANCE.getPTTR_ConsTms();

		/**
		 * The meta object literal for the '<em><b>Alm Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTTR__ALM_VAL = eINSTANCE.getPTTR_AlmVal();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUCImpl <em>PTUC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTUC()
		 * @generated
		 */
		EClass PTUC = eINSTANCE.getPTUC();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__STR = eINSTANCE.getPTUC_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__OP = eINSTANCE.getPTUC_Op();

		/**
		 * The meta object literal for the '<em><b>Tm ASt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__TM_AST = eINSTANCE.getPTUC_TmASt();

		/**
		 * The meta object literal for the '<em><b>Tm ACrv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__TM_ACRV = eINSTANCE.getPTUC_TmACrv();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__STR_VAL = eINSTANCE.getPTUC_StrVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__OP_DL_TMMS = eINSTANCE.getPTUC_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Tm Mult</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__TM_MULT = eINSTANCE.getPTUC_TmMult();

		/**
		 * The meta object literal for the '<em><b>Min Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__MIN_OP_TMMS = eINSTANCE.getPTUC_MinOpTmms();

		/**
		 * The meta object literal for the '<em><b>Max Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__MAX_OP_TMMS = eINSTANCE.getPTUC_MaxOpTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__RS_DL_TMMS = eINSTANCE.getPTUC_RsDlTmms();

		/**
		 * The meta object literal for the '<em><b>Cons Tms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__CONS_TMS = eINSTANCE.getPTUC_ConsTms();

		/**
		 * The meta object literal for the '<em><b>Alm Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUC__ALM_VAL = eINSTANCE.getPTUC_AlmVal();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUFImpl <em>PTUF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUFImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTUF()
		 * @generated
		 */
		EClass PTUF = eINSTANCE.getPTUF();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUF__STR = eINSTANCE.getPTUF_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUF__OP = eINSTANCE.getPTUF_Op();

		/**
		 * The meta object literal for the '<em><b>Blk V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUF__BLK_V = eINSTANCE.getPTUF_BlkV();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUF__STR_VAL = eINSTANCE.getPTUF_StrVal();

		/**
		 * The meta object literal for the '<em><b>Blk Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUF__BLK_VAL = eINSTANCE.getPTUF_BlkVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUF__OP_DL_TMMS = eINSTANCE.getPTUF_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUF__RS_DL_TMMS = eINSTANCE.getPTUF_RsDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PVOCImpl <em>PVOC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PVOCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPVOC()
		 * @generated
		 */
		EClass PVOC = eINSTANCE.getPVOC();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__STR = eINSTANCE.getPVOC_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__OP = eINSTANCE.getPVOC_Op();

		/**
		 * The meta object literal for the '<em><b>AV St</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__AV_ST = eINSTANCE.getPVOC_AVSt();

		/**
		 * The meta object literal for the '<em><b>Tm ASt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__TM_AST = eINSTANCE.getPVOC_TmASt();

		/**
		 * The meta object literal for the '<em><b>Tm Mult</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__TM_MULT = eINSTANCE.getPVOC_TmMult();

		/**
		 * The meta object literal for the '<em><b>AV Crv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__AV_CRV = eINSTANCE.getPVOC_AVCrv();

		/**
		 * The meta object literal for the '<em><b>Tm ACrv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__TM_ACRV = eINSTANCE.getPVOC_TmACrv();

		/**
		 * The meta object literal for the '<em><b>Min Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__MIN_OP_TMMS = eINSTANCE.getPVOC_MinOpTmms();

		/**
		 * The meta object literal for the '<em><b>Max Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__MAX_OP_TMMS = eINSTANCE.getPVOC_MaxOpTmms();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__OP_DL_TMMS = eINSTANCE.getPVOC_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Typ Rs Crv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__TYP_RS_CRV = eINSTANCE.getPVOC_TypRsCrv();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVOC__RS_DL_TMMS = eINSTANCE.getPVOC_RsDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PVPHImpl <em>PVPH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PVPHImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPVPH()
		 * @generated
		 */
		EClass PVPH = eINSTANCE.getPVPH();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__STR = eINSTANCE.getPVPH_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__OP = eINSTANCE.getPVPH_Op();

		/**
		 * The meta object literal for the '<em><b>VHz St</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__VHZ_ST = eINSTANCE.getPVPH_VHzSt();

		/**
		 * The meta object literal for the '<em><b>VHz Crv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__VHZ_CRV = eINSTANCE.getPVPH_VHzCrv();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__STR_VAL = eINSTANCE.getPVPH_StrVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__OP_DL_TMMS = eINSTANCE.getPVPH_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Typ Rs Crv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__TYP_RS_CRV = eINSTANCE.getPVPH_TypRsCrv();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__RS_DL_TMMS = eINSTANCE.getPVPH_RsDlTmms();

		/**
		 * The meta object literal for the '<em><b>Tm Mult</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__TM_MULT = eINSTANCE.getPVPH_TmMult();

		/**
		 * The meta object literal for the '<em><b>Min Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__MIN_OP_TMMS = eINSTANCE.getPVPH_MinOpTmms();

		/**
		 * The meta object literal for the '<em><b>Max Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVPH__MAX_OP_TMMS = eINSTANCE.getPVPH_MaxOpTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl <em>PTRC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTRCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTRC()
		 * @generated
		 */
		EClass PTRC = eINSTANCE.getPTRC();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTRC__TR = eINSTANCE.getPTRC_Tr();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTRC__OP = eINSTANCE.getPTRC_Op();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTRC__STR = eINSTANCE.getPTRC_Str();

		/**
		 * The meta object literal for the '<em><b>Tr Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTRC__TR_MOD = eINSTANCE.getPTRC_TrMod();

		/**
		 * The meta object literal for the '<em><b>Tr Pls Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTRC__TR_PLS_TMMS = eINSTANCE.getPTRC_TrPlsTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl <em>PTUV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PTUVImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPTUV()
		 * @generated
		 */
		EClass PTUV = eINSTANCE.getPTUV();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__STR = eINSTANCE.getPTUV_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__OP = eINSTANCE.getPTUV_Op();

		/**
		 * The meta object literal for the '<em><b>Tm VSt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__TM_VST = eINSTANCE.getPTUV_TmVSt();

		/**
		 * The meta object literal for the '<em><b>Tm VCrv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__TM_VCRV = eINSTANCE.getPTUV_TmVCrv();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__STR_VAL = eINSTANCE.getPTUV_StrVal();

		/**
		 * The meta object literal for the '<em><b>Tm Mult</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__TM_MULT = eINSTANCE.getPTUV_TmMult();

		/**
		 * The meta object literal for the '<em><b>Min Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__MIN_OP_TMMS = eINSTANCE.getPTUV_MinOpTmms();

		/**
		 * The meta object literal for the '<em><b>Max Op Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__MAX_OP_TMMS = eINSTANCE.getPTUV_MaxOpTmms();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__OP_DL_TMMS = eINSTANCE.getPTUV_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTUV__RS_DL_TMMS = eINSTANCE.getPTUV_RsDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PUPFImpl <em>PUPF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PUPFImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPUPF()
		 * @generated
		 */
		EClass PUPF = eINSTANCE.getPUPF();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__STR = eINSTANCE.getPUPF_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__OP = eINSTANCE.getPUPF_Op();

		/**
		 * The meta object literal for the '<em><b>Blk A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__BLK_A = eINSTANCE.getPUPF_BlkA();

		/**
		 * The meta object literal for the '<em><b>Blk V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__BLK_V = eINSTANCE.getPUPF_BlkV();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__STR_VAL = eINSTANCE.getPUPF_StrVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__OP_DL_TMMS = eINSTANCE.getPUPF_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__RS_DL_TMMS = eINSTANCE.getPUPF_RsDlTmms();

		/**
		 * The meta object literal for the '<em><b>Blk Val A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__BLK_VAL_A = eINSTANCE.getPUPF_BlkValA();

		/**
		 * The meta object literal for the '<em><b>Blk Val V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUPF__BLK_VAL_V = eINSTANCE.getPUPF_BlkValV();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupP.impl.PZSUImpl <em>PZSU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.PZSUImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl#getPZSU()
		 * @generated
		 */
		EClass PZSU = eINSTANCE.getPZSU();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZSU__STR = eINSTANCE.getPZSU_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZSU__OP = eINSTANCE.getPZSU_Op();

		/**
		 * The meta object literal for the '<em><b>Str Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZSU__STR_VAL = eINSTANCE.getPZSU_StrVal();

		/**
		 * The meta object literal for the '<em><b>Op Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZSU__OP_DL_TMMS = eINSTANCE.getPZSU_OpDlTmms();

		/**
		 * The meta object literal for the '<em><b>Rs Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PZSU__RS_DL_TMMS = eINSTANCE.getPZSU_RsDlTmms();

	}

} //LNGroupPPackage
