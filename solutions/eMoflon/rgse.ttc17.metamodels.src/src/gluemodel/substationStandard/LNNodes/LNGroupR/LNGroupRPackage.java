/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupR;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupR.LNGroupRFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupRPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupR";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupR";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupRPackage eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.GroupRImpl <em>Group R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.GroupRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getGroupR()
	 * @generated
	 */
	int GROUP_R = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_R__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_R__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_R__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_R__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The number of structural features of the '<em>Group R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_R_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_R_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDREImpl <em>RDRE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDREImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRDRE()
	 * @generated
	 */
	int RDRE = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__OP_CNT_RS = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rcd Trg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__RCD_TRG = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mem Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__MEM_RS = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mem Clr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__MEM_CLR = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rcd Made</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__RCD_MADE = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flt Num</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__FLT_NUM = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gri Flt Num</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__GRI_FLT_NUM = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rcd Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__RCD_STR = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mem Used</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__MEM_USED = GROUP_R_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trg Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__TRG_MOD = GROUP_R_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lev Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__LEV_MOD = GROUP_R_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pre Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__PRE_TMMS = GROUP_R_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pst Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__PST_TMMS = GROUP_R_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Mem Full</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__MEM_FULL = GROUP_R_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max Num Rcd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__MAX_NUM_RCD = GROUP_R_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Re Trg Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__RE_TRG_MOD = GROUP_R_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Per Trg Tms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__PER_TRG_TMS = GROUP_R_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Excl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__EXCL_TMMS = GROUP_R_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Op Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE__OP_MOD = GROUP_R_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>RDRE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>RDRE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRE_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDRSImpl <em>RDRS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDRSImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRDRS()
	 * @generated
	 */
	int RDRS = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRS__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRS__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRS__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRS__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Auto Up Lod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRS__AUTO_UP_LOD = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dlt Rcd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRS__DLT_RCD = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RDRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRS_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RDRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDRS_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RPSBImpl <em>RPSB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RPSBImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRPSB()
	 * @generated
	 */
	int RPSB = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__OP_CNT_RS = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__STR = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__OP = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blk Zn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__BLK_ZN = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Zero Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__ZERO_ENA = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ng Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__NG_ENA = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__MAX_ENA = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Swg Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__SWG_VAL = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Swg Ris</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__SWG_RIS = GROUP_R_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Swg React</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__SWG_REACT = GROUP_R_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Swg Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__SWG_TMMS = GROUP_R_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Un Blk Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__UN_BLK_TMMS = GROUP_R_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Num Slp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__MAX_NUM_SLP = GROUP_R_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ev Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB__EV_TMMS = GROUP_R_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>RPSB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>RPSB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPSB_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl <em>RBRF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRBRF()
	 * @generated
	 */
	int RBRF = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__OP_CNT_RS = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Str</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__STR = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op Ex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__OP_EX = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Op In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__OP_IN = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fail Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__FAIL_MOD = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fail Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__FAIL_TMMS = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>SPl Tr Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__SPL_TR_TMMS = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>TP Tr Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__TP_TR_TMMS = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Det Val A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__DET_VAL_A = GROUP_R_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Re Tr Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF__RE_TR_MOD = GROUP_R_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>RBRF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>RBRF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBRF_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RADRImpl <em>RADR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RADRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRADR()
	 * @generated
	 */
	int RADR = 5;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__OP_CNT_RS = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ch Trg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__CH_TRG = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ch Num</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__CH_NUM = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tr GMod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__TR_GMOD = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lev Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__LEV_MOD = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hi Trg Lev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__HI_TRG_LEV = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lo Trg Lev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__LO_TRG_LEV = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pre Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__PRE_TMMS = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pst Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR__PST_TMMS = GROUP_R_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>RADR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>RADR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADR_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBDRImpl <em>RBDR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBDRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRBDR()
	 * @generated
	 */
	int RBDR = 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__OP_CNT_RS = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ch Trg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__CH_TRG = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ch Num</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__CH_NUM = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trg Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__TRG_MOD = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lev Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__LEV_MOD = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pre Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__PRE_TMMS = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pst Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR__PST_TMMS = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>RBDR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>RBDR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBDR_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDIRImpl <em>RDIR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDIRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRDIR()
	 * @generated
	 */
	int RDIR = 7;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__DIR = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chr Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__CHR_ANG = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Fwd Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__MIN_FWD_ANG = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Rv Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__MIN_RV_ANG = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Fwd Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__MAX_FWD_ANG = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Rv Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__MAX_RV_ANG = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Blk Val A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__BLK_VAL_A = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Blk Val V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__BLK_VAL_V = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pol Qty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__POL_QTY = GROUP_R_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min PPV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR__MIN_PPV = GROUP_R_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>RDIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>RDIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDIR_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RFLOImpl <em>RFLO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RFLOImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRFLO()
	 * @generated
	 */
	int RFLO = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__OP_CNT_RS = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flt Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__FLT_Z = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flt Diskm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__FLT_DISKM = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flt Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__FLT_LOOP = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lin Len Km</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__LIN_LEN_KM = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>R1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__R1 = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>X1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__X1 = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>R0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__R0 = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>X0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__X0 = GROUP_R_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Z1 Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__Z1_MOD = GROUP_R_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Z1 Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__Z1_ANG = GROUP_R_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Z0 Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__Z0_MOD = GROUP_R_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Z0 Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__Z0_ANG = GROUP_R_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rm0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__RM0 = GROUP_R_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Xm0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__XM0 = GROUP_R_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Zm0 Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__ZM0_MOD = GROUP_R_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Zm0 Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO__ZM0_ANG = GROUP_R_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>RFLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>RFLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFLO_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl <em>RREC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRREC()
	 * @generated
	 */
	int RREC = 9;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__OP_CNT_RS = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blk Rec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__BLK_REC = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chk Rec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__CHK_REC = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__AUTO = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__OP = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Auto Rec St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__AUTO_REC_ST = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rec1 Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__REC1_TMMS = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rec2 Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__REC2_TMMS = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rec3 Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__REC3_TMMS = GROUP_R_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pls Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__PLS_TMMS = GROUP_R_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rcl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC__RCL_TMMS = GROUP_R_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>RREC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>RREC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREC_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl <em>RSYN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRSYN()
	 * @generated
	 */
	int RSYN = 10;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__MODE = GROUP_R__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__BEHAVIOUR = GROUP_R__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__HEALTH = GROUP_R__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__NAME_PLT = GROUP_R__NAME_PLT;

	/**
	 * The feature id for the '<em><b>RHz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__RHZ = GROUP_R_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>LHz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__LHZ = GROUP_R_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__RV = GROUP_R_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__LV = GROUP_R_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__REL = GROUP_R_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vlnd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__VLND = GROUP_R_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ang Ind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__ANG_IND = GROUP_R_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hz Ind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__HZ_IND = GROUP_R_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Syn Prg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__SYN_PRG = GROUP_R_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dif VClc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__DIF_VCLC = GROUP_R_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Dif Ang Clc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__DIF_ANG_CLC = GROUP_R_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Dif V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__DIF_V = GROUP_R_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Dif Hz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__DIF_HZ = GROUP_R_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Dif Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__DIF_ANG = GROUP_R_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Liv Dea Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__LIV_DEA_MOD = GROUP_R_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Dea Lin Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__DEA_LIN_VAL = GROUP_R_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Liv Lin Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__LIV_LIN_VAL = GROUP_R_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Dea Bus Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__DEA_BUS_VAL = GROUP_R_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pls Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__PLS_TMMS = GROUP_R_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Bkr Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN__BKR_TMMS = GROUP_R_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>RSYN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN_FEATURE_COUNT = GROUP_R_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>RSYN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSYN_OPERATION_COUNT = GROUP_R_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.GroupR <em>Group R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group R</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.GroupR
	 * @generated
	 */
	EClass getGroupR();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE <em>RDRE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDRE</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE
	 * @generated
	 */
	EClass getRDRE();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getOpCntRs()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdTrg <em>Rcd Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rcd Trg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdTrg()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_RcdTrg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemRs <em>Mem Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mem Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemRs()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_MemRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemClr <em>Mem Clr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mem Clr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemClr()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_MemClr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdMade <em>Rcd Made</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rcd Made</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdMade()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_RcdMade();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getFltNum <em>Flt Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flt Num</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getFltNum()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_FltNum();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getGriFltNum <em>Gri Flt Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gri Flt Num</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getGriFltNum()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_GriFltNum();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdStr <em>Rcd Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rcd Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getRcdStr()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_RcdStr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemUsed <em>Mem Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mem Used</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemUsed()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_MemUsed();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getTrgMod <em>Trg Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trg Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getTrgMod()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_TrgMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getLevMod <em>Lev Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lev Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getLevMod()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_LevMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPreTmms <em>Pre Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPreTmms()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_PreTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPstTmms <em>Pst Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pst Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPstTmms()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_PstTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemFull <em>Mem Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mem Full</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMemFull()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_MemFull();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMaxNumRcd <em>Max Num Rcd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Num Rcd</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getMaxNumRcd()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_MaxNumRcd();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getReTrgMod <em>Re Trg Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Re Trg Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getReTrgMod()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_ReTrgMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPerTrgTms <em>Per Trg Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Per Trg Tms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getPerTrgTms()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_PerTrgTms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getExclTmms <em>Excl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Excl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getExclTmms()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_ExclTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getOpMod <em>Op Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRE#getOpMod()
	 * @see #getRDRE()
	 * @generated
	 */
	EReference getRDRE_OpMod();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRS <em>RDRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDRS</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRS
	 * @generated
	 */
	EClass getRDRS();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRS#getAutoUpLod <em>Auto Up Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto Up Lod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRS#getAutoUpLod()
	 * @see #getRDRS()
	 * @generated
	 */
	EReference getRDRS_AutoUpLod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDRS#getDltRcd <em>Dlt Rcd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dlt Rcd</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDRS#getDltRcd()
	 * @see #getRDRS()
	 * @generated
	 */
	EReference getRDRS_DltRcd();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB <em>RPSB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPSB</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB
	 * @generated
	 */
	EClass getRPSB();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getOpCntRs()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getStr()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getOp()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getBlkZn <em>Blk Zn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Zn</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getBlkZn()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_BlkZn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getZeroEna <em>Zero Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zero Ena</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getZeroEna()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_ZeroEna();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getNgEna <em>Ng Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ng Ena</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getNgEna()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_NgEna();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getMaxEna <em>Max Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Ena</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getMaxEna()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_MaxEna();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgVal <em>Swg Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swg Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgVal()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_SwgVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgRis <em>Swg Ris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swg Ris</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgRis()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_SwgRis();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgReact <em>Swg React</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swg React</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgReact()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_SwgReact();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgTmms <em>Swg Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swg Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getSwgTmms()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_SwgTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getUnBlkTmms <em>Un Blk Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Un Blk Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getUnBlkTmms()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_UnBlkTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getMaxNumSlp <em>Max Num Slp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Num Slp</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getMaxNumSlp()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_MaxNumSlp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getEvTmms <em>Ev Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ev Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RPSB#getEvTmms()
	 * @see #getRPSB()
	 * @generated
	 */
	EReference getRPSB_EvTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF <em>RBRF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBRF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF
	 * @generated
	 */
	EClass getRBRF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getOpCntRs()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getStr()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_Str();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getOpEx <em>Op Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Ex</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getOpEx()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_OpEx();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getOpIn <em>Op In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op In</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getOpIn()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_OpIn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getFailMod <em>Fail Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fail Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getFailMod()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_FailMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getFailTmms <em>Fail Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fail Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getFailTmms()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_FailTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getSPlTrTmms <em>SPl Tr Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPl Tr Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getSPlTrTmms()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_SPlTrTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getTPTrTmms <em>TP Tr Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TP Tr Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getTPTrTmms()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_TPTrTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getDetValA <em>Det Val A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Det Val A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getDetValA()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_DetValA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getReTrMod <em>Re Tr Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Re Tr Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBRF#getReTrMod()
	 * @see #getRBRF()
	 * @generated
	 */
	EReference getRBRF_ReTrMod();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR <em>RADR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RADR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR
	 * @generated
	 */
	EClass getRADR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getOpCntRs()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getChTrg <em>Ch Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ch Trg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getChTrg()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_ChTrg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getChNum <em>Ch Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ch Num</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getChNum()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_ChNum();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getTrGMod <em>Tr GMod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tr GMod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getTrGMod()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_TrGMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getLevMod <em>Lev Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lev Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getLevMod()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_LevMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getHiTrgLev <em>Hi Trg Lev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hi Trg Lev</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getHiTrgLev()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_HiTrgLev();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getLoTrgLev <em>Lo Trg Lev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lo Trg Lev</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getLoTrgLev()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_LoTrgLev();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getPreTmms <em>Pre Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getPreTmms()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_PreTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getPstTmms <em>Pst Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pst Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RADR#getPstTmms()
	 * @see #getRADR()
	 * @generated
	 */
	EReference getRADR_PstTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR <em>RBDR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBDR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR
	 * @generated
	 */
	EClass getRBDR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getOpCntRs()
	 * @see #getRBDR()
	 * @generated
	 */
	EReference getRBDR_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getChTrg <em>Ch Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ch Trg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getChTrg()
	 * @see #getRBDR()
	 * @generated
	 */
	EReference getRBDR_ChTrg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getChNum <em>Ch Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ch Num</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getChNum()
	 * @see #getRBDR()
	 * @generated
	 */
	EReference getRBDR_ChNum();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getTrgMod <em>Trg Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trg Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getTrgMod()
	 * @see #getRBDR()
	 * @generated
	 */
	EReference getRBDR_TrgMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getLevMod <em>Lev Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lev Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getLevMod()
	 * @see #getRBDR()
	 * @generated
	 */
	EReference getRBDR_LevMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getPreTmms <em>Pre Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getPreTmms()
	 * @see #getRBDR()
	 * @generated
	 */
	EReference getRBDR_PreTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getPstTmms <em>Pst Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pst Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RBDR#getPstTmms()
	 * @see #getRBDR()
	 * @generated
	 */
	EReference getRBDR_PstTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR <em>RDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDIR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR
	 * @generated
	 */
	EClass getRDIR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dir</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getDir()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_Dir();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getChrAng <em>Chr Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chr Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getChrAng()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_ChrAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinFwdAng <em>Min Fwd Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Fwd Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinFwdAng()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_MinFwdAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinRvAng <em>Min Rv Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Rv Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinRvAng()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_MinRvAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMaxFwdAng <em>Max Fwd Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Fwd Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMaxFwdAng()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_MaxFwdAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMaxRvAng <em>Max Rv Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Rv Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMaxRvAng()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_MaxRvAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getBlkValA <em>Blk Val A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getBlkValA()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_BlkValA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getBlkValV <em>Blk Val V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Val V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getBlkValV()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_BlkValV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getPolQty <em>Pol Qty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pol Qty</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getPolQty()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_PolQty();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinPPV <em>Min PPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min PPV</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RDIR#getMinPPV()
	 * @see #getRDIR()
	 * @generated
	 */
	EReference getRDIR_MinPPV();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO <em>RFLO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFLO</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO
	 * @generated
	 */
	EClass getRFLO();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getOpCntRs()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getFltZ <em>Flt Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flt Z</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getFltZ()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_FltZ();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getFltDiskm <em>Flt Diskm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flt Diskm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getFltDiskm()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_FltDiskm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getFltLoop <em>Flt Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flt Loop</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getFltLoop()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_FltLoop();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getLinLenKm <em>Lin Len Km</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lin Len Km</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getLinLenKm()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_LinLenKm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getR1 <em>R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>R1</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getR1()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_R1();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X1</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getX1()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_X1();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>R0</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getR0()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_R0();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X0</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getX0()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_X0();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZ1Mod <em>Z1 Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Z1 Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZ1Mod()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_Z1Mod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZ1Ang <em>Z1 Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Z1 Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZ1Ang()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_Z1Ang();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZ0Mod <em>Z0 Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Z0 Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZ0Mod()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_Z0Mod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZ0Ang <em>Z0 Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Z0 Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZ0Ang()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_Z0Ang();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getRm0 <em>Rm0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rm0</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getRm0()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_Rm0();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getXm0 <em>Xm0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xm0</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getXm0()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_Xm0();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZm0Mod <em>Zm0 Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zm0 Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZm0Mod()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_Zm0Mod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZm0Ang <em>Zm0 Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zm0 Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RFLO#getZm0Ang()
	 * @see #getRFLO()
	 * @generated
	 */
	EReference getRFLO_Zm0Ang();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC <em>RREC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RREC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC
	 * @generated
	 */
	EClass getRREC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getOpCntRs()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getBlkRec <em>Blk Rec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Rec</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getBlkRec()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_BlkRec();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getChkRec <em>Chk Rec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chk Rec</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getChkRec()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_ChkRec();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getAuto <em>Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getAuto()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_Auto();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getOp()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_Op();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getAutoRecSt <em>Auto Rec St</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto Rec St</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getAutoRecSt()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_AutoRecSt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec1Tmms <em>Rec1 Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rec1 Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec1Tmms()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_Rec1Tmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec2Tmms <em>Rec2 Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rec2 Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec2Tmms()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_Rec2Tmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec3Tmms <em>Rec3 Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rec3 Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRec3Tmms()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_Rec3Tmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getPlsTmms <em>Pls Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pls Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getPlsTmms()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_PlsTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRclTmms <em>Rcl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rcl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RREC#getRclTmms()
	 * @see #getRREC()
	 * @generated
	 */
	EReference getRREC_RclTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN <em>RSYN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSYN</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN
	 * @generated
	 */
	EClass getRSYN();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRHz <em>RHz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RHz</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRHz()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_RHz();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLHz <em>LHz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LHz</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLHz()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_LHz();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRV <em>RV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RV</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRV()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_RV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLV <em>LV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LV</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLV()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_LV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rel</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getRel()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_Rel();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getVlnd <em>Vlnd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vlnd</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getVlnd()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_Vlnd();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getAngInd <em>Ang Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang Ind</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getAngInd()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_AngInd();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getHzInd <em>Hz Ind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hz Ind</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getHzInd()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_HzInd();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getSynPrg <em>Syn Prg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Syn Prg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getSynPrg()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_SynPrg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifVClc <em>Dif VClc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dif VClc</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifVClc()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_DifVClc();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifAngClc <em>Dif Ang Clc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dif Ang Clc</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifAngClc()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_DifAngClc();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifV <em>Dif V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dif V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifV()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_DifV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifHz <em>Dif Hz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dif Hz</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifHz()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_DifHz();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifAng <em>Dif Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dif Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDifAng()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_DifAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLivDeaMod <em>Liv Dea Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Liv Dea Mod</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLivDeaMod()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_LivDeaMod();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDeaLinVal <em>Dea Lin Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dea Lin Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDeaLinVal()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_DeaLinVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLivLinVal <em>Liv Lin Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Liv Lin Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getLivLinVal()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_LivLinVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDeaBusVal <em>Dea Bus Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dea Bus Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getDeaBusVal()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_DeaBusVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getPlsTmms <em>Pls Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pls Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getPlsTmms()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_PlsTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getBkrTmms <em>Bkr Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bkr Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupR.RSYN#getBkrTmms()
	 * @see #getRSYN()
	 * @generated
	 */
	EReference getRSYN_BkrTmms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupRFactory getLNGroupRFactory();

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
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.GroupRImpl <em>Group R</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.GroupRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getGroupR()
		 * @generated
		 */
		EClass GROUP_R = eINSTANCE.getGroupR();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDREImpl <em>RDRE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDREImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRDRE()
		 * @generated
		 */
		EClass RDRE = eINSTANCE.getRDRE();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__OP_CNT_RS = eINSTANCE.getRDRE_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Rcd Trg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__RCD_TRG = eINSTANCE.getRDRE_RcdTrg();

		/**
		 * The meta object literal for the '<em><b>Mem Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__MEM_RS = eINSTANCE.getRDRE_MemRs();

		/**
		 * The meta object literal for the '<em><b>Mem Clr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__MEM_CLR = eINSTANCE.getRDRE_MemClr();

		/**
		 * The meta object literal for the '<em><b>Rcd Made</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__RCD_MADE = eINSTANCE.getRDRE_RcdMade();

		/**
		 * The meta object literal for the '<em><b>Flt Num</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__FLT_NUM = eINSTANCE.getRDRE_FltNum();

		/**
		 * The meta object literal for the '<em><b>Gri Flt Num</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__GRI_FLT_NUM = eINSTANCE.getRDRE_GriFltNum();

		/**
		 * The meta object literal for the '<em><b>Rcd Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__RCD_STR = eINSTANCE.getRDRE_RcdStr();

		/**
		 * The meta object literal for the '<em><b>Mem Used</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__MEM_USED = eINSTANCE.getRDRE_MemUsed();

		/**
		 * The meta object literal for the '<em><b>Trg Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__TRG_MOD = eINSTANCE.getRDRE_TrgMod();

		/**
		 * The meta object literal for the '<em><b>Lev Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__LEV_MOD = eINSTANCE.getRDRE_LevMod();

		/**
		 * The meta object literal for the '<em><b>Pre Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__PRE_TMMS = eINSTANCE.getRDRE_PreTmms();

		/**
		 * The meta object literal for the '<em><b>Pst Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__PST_TMMS = eINSTANCE.getRDRE_PstTmms();

		/**
		 * The meta object literal for the '<em><b>Mem Full</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__MEM_FULL = eINSTANCE.getRDRE_MemFull();

		/**
		 * The meta object literal for the '<em><b>Max Num Rcd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__MAX_NUM_RCD = eINSTANCE.getRDRE_MaxNumRcd();

		/**
		 * The meta object literal for the '<em><b>Re Trg Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__RE_TRG_MOD = eINSTANCE.getRDRE_ReTrgMod();

		/**
		 * The meta object literal for the '<em><b>Per Trg Tms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__PER_TRG_TMS = eINSTANCE.getRDRE_PerTrgTms();

		/**
		 * The meta object literal for the '<em><b>Excl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__EXCL_TMMS = eINSTANCE.getRDRE_ExclTmms();

		/**
		 * The meta object literal for the '<em><b>Op Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRE__OP_MOD = eINSTANCE.getRDRE_OpMod();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDRSImpl <em>RDRS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDRSImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRDRS()
		 * @generated
		 */
		EClass RDRS = eINSTANCE.getRDRS();

		/**
		 * The meta object literal for the '<em><b>Auto Up Lod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRS__AUTO_UP_LOD = eINSTANCE.getRDRS_AutoUpLod();

		/**
		 * The meta object literal for the '<em><b>Dlt Rcd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDRS__DLT_RCD = eINSTANCE.getRDRS_DltRcd();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RPSBImpl <em>RPSB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RPSBImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRPSB()
		 * @generated
		 */
		EClass RPSB = eINSTANCE.getRPSB();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__OP_CNT_RS = eINSTANCE.getRPSB_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__STR = eINSTANCE.getRPSB_Str();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__OP = eINSTANCE.getRPSB_Op();

		/**
		 * The meta object literal for the '<em><b>Blk Zn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__BLK_ZN = eINSTANCE.getRPSB_BlkZn();

		/**
		 * The meta object literal for the '<em><b>Zero Ena</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__ZERO_ENA = eINSTANCE.getRPSB_ZeroEna();

		/**
		 * The meta object literal for the '<em><b>Ng Ena</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__NG_ENA = eINSTANCE.getRPSB_NgEna();

		/**
		 * The meta object literal for the '<em><b>Max Ena</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__MAX_ENA = eINSTANCE.getRPSB_MaxEna();

		/**
		 * The meta object literal for the '<em><b>Swg Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__SWG_VAL = eINSTANCE.getRPSB_SwgVal();

		/**
		 * The meta object literal for the '<em><b>Swg Ris</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__SWG_RIS = eINSTANCE.getRPSB_SwgRis();

		/**
		 * The meta object literal for the '<em><b>Swg React</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__SWG_REACT = eINSTANCE.getRPSB_SwgReact();

		/**
		 * The meta object literal for the '<em><b>Swg Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__SWG_TMMS = eINSTANCE.getRPSB_SwgTmms();

		/**
		 * The meta object literal for the '<em><b>Un Blk Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__UN_BLK_TMMS = eINSTANCE.getRPSB_UnBlkTmms();

		/**
		 * The meta object literal for the '<em><b>Max Num Slp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__MAX_NUM_SLP = eINSTANCE.getRPSB_MaxNumSlp();

		/**
		 * The meta object literal for the '<em><b>Ev Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPSB__EV_TMMS = eINSTANCE.getRPSB_EvTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl <em>RBRF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBRFImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRBRF()
		 * @generated
		 */
		EClass RBRF = eINSTANCE.getRBRF();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__OP_CNT_RS = eINSTANCE.getRBRF_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__STR = eINSTANCE.getRBRF_Str();

		/**
		 * The meta object literal for the '<em><b>Op Ex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__OP_EX = eINSTANCE.getRBRF_OpEx();

		/**
		 * The meta object literal for the '<em><b>Op In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__OP_IN = eINSTANCE.getRBRF_OpIn();

		/**
		 * The meta object literal for the '<em><b>Fail Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__FAIL_MOD = eINSTANCE.getRBRF_FailMod();

		/**
		 * The meta object literal for the '<em><b>Fail Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__FAIL_TMMS = eINSTANCE.getRBRF_FailTmms();

		/**
		 * The meta object literal for the '<em><b>SPl Tr Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__SPL_TR_TMMS = eINSTANCE.getRBRF_SPlTrTmms();

		/**
		 * The meta object literal for the '<em><b>TP Tr Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__TP_TR_TMMS = eINSTANCE.getRBRF_TPTrTmms();

		/**
		 * The meta object literal for the '<em><b>Det Val A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__DET_VAL_A = eINSTANCE.getRBRF_DetValA();

		/**
		 * The meta object literal for the '<em><b>Re Tr Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBRF__RE_TR_MOD = eINSTANCE.getRBRF_ReTrMod();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RADRImpl <em>RADR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RADRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRADR()
		 * @generated
		 */
		EClass RADR = eINSTANCE.getRADR();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__OP_CNT_RS = eINSTANCE.getRADR_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Ch Trg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__CH_TRG = eINSTANCE.getRADR_ChTrg();

		/**
		 * The meta object literal for the '<em><b>Ch Num</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__CH_NUM = eINSTANCE.getRADR_ChNum();

		/**
		 * The meta object literal for the '<em><b>Tr GMod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__TR_GMOD = eINSTANCE.getRADR_TrGMod();

		/**
		 * The meta object literal for the '<em><b>Lev Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__LEV_MOD = eINSTANCE.getRADR_LevMod();

		/**
		 * The meta object literal for the '<em><b>Hi Trg Lev</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__HI_TRG_LEV = eINSTANCE.getRADR_HiTrgLev();

		/**
		 * The meta object literal for the '<em><b>Lo Trg Lev</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__LO_TRG_LEV = eINSTANCE.getRADR_LoTrgLev();

		/**
		 * The meta object literal for the '<em><b>Pre Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__PRE_TMMS = eINSTANCE.getRADR_PreTmms();

		/**
		 * The meta object literal for the '<em><b>Pst Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADR__PST_TMMS = eINSTANCE.getRADR_PstTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBDRImpl <em>RBDR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RBDRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRBDR()
		 * @generated
		 */
		EClass RBDR = eINSTANCE.getRBDR();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBDR__OP_CNT_RS = eINSTANCE.getRBDR_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Ch Trg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBDR__CH_TRG = eINSTANCE.getRBDR_ChTrg();

		/**
		 * The meta object literal for the '<em><b>Ch Num</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBDR__CH_NUM = eINSTANCE.getRBDR_ChNum();

		/**
		 * The meta object literal for the '<em><b>Trg Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBDR__TRG_MOD = eINSTANCE.getRBDR_TrgMod();

		/**
		 * The meta object literal for the '<em><b>Lev Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBDR__LEV_MOD = eINSTANCE.getRBDR_LevMod();

		/**
		 * The meta object literal for the '<em><b>Pre Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBDR__PRE_TMMS = eINSTANCE.getRBDR_PreTmms();

		/**
		 * The meta object literal for the '<em><b>Pst Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBDR__PST_TMMS = eINSTANCE.getRBDR_PstTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDIRImpl <em>RDIR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RDIRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRDIR()
		 * @generated
		 */
		EClass RDIR = eINSTANCE.getRDIR();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__DIR = eINSTANCE.getRDIR_Dir();

		/**
		 * The meta object literal for the '<em><b>Chr Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__CHR_ANG = eINSTANCE.getRDIR_ChrAng();

		/**
		 * The meta object literal for the '<em><b>Min Fwd Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__MIN_FWD_ANG = eINSTANCE.getRDIR_MinFwdAng();

		/**
		 * The meta object literal for the '<em><b>Min Rv Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__MIN_RV_ANG = eINSTANCE.getRDIR_MinRvAng();

		/**
		 * The meta object literal for the '<em><b>Max Fwd Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__MAX_FWD_ANG = eINSTANCE.getRDIR_MaxFwdAng();

		/**
		 * The meta object literal for the '<em><b>Max Rv Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__MAX_RV_ANG = eINSTANCE.getRDIR_MaxRvAng();

		/**
		 * The meta object literal for the '<em><b>Blk Val A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__BLK_VAL_A = eINSTANCE.getRDIR_BlkValA();

		/**
		 * The meta object literal for the '<em><b>Blk Val V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__BLK_VAL_V = eINSTANCE.getRDIR_BlkValV();

		/**
		 * The meta object literal for the '<em><b>Pol Qty</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__POL_QTY = eINSTANCE.getRDIR_PolQty();

		/**
		 * The meta object literal for the '<em><b>Min PPV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDIR__MIN_PPV = eINSTANCE.getRDIR_MinPPV();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RFLOImpl <em>RFLO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RFLOImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRFLO()
		 * @generated
		 */
		EClass RFLO = eINSTANCE.getRFLO();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__OP_CNT_RS = eINSTANCE.getRFLO_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Flt Z</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__FLT_Z = eINSTANCE.getRFLO_FltZ();

		/**
		 * The meta object literal for the '<em><b>Flt Diskm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__FLT_DISKM = eINSTANCE.getRFLO_FltDiskm();

		/**
		 * The meta object literal for the '<em><b>Flt Loop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__FLT_LOOP = eINSTANCE.getRFLO_FltLoop();

		/**
		 * The meta object literal for the '<em><b>Lin Len Km</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__LIN_LEN_KM = eINSTANCE.getRFLO_LinLenKm();

		/**
		 * The meta object literal for the '<em><b>R1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__R1 = eINSTANCE.getRFLO_R1();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__X1 = eINSTANCE.getRFLO_X1();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__R0 = eINSTANCE.getRFLO_R0();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__X0 = eINSTANCE.getRFLO_X0();

		/**
		 * The meta object literal for the '<em><b>Z1 Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__Z1_MOD = eINSTANCE.getRFLO_Z1Mod();

		/**
		 * The meta object literal for the '<em><b>Z1 Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__Z1_ANG = eINSTANCE.getRFLO_Z1Ang();

		/**
		 * The meta object literal for the '<em><b>Z0 Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__Z0_MOD = eINSTANCE.getRFLO_Z0Mod();

		/**
		 * The meta object literal for the '<em><b>Z0 Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__Z0_ANG = eINSTANCE.getRFLO_Z0Ang();

		/**
		 * The meta object literal for the '<em><b>Rm0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__RM0 = eINSTANCE.getRFLO_Rm0();

		/**
		 * The meta object literal for the '<em><b>Xm0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__XM0 = eINSTANCE.getRFLO_Xm0();

		/**
		 * The meta object literal for the '<em><b>Zm0 Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__ZM0_MOD = eINSTANCE.getRFLO_Zm0Mod();

		/**
		 * The meta object literal for the '<em><b>Zm0 Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFLO__ZM0_ANG = eINSTANCE.getRFLO_Zm0Ang();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl <em>RREC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RRECImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRREC()
		 * @generated
		 */
		EClass RREC = eINSTANCE.getRREC();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__OP_CNT_RS = eINSTANCE.getRREC_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Blk Rec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__BLK_REC = eINSTANCE.getRREC_BlkRec();

		/**
		 * The meta object literal for the '<em><b>Chk Rec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__CHK_REC = eINSTANCE.getRREC_ChkRec();

		/**
		 * The meta object literal for the '<em><b>Auto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__AUTO = eINSTANCE.getRREC_Auto();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__OP = eINSTANCE.getRREC_Op();

		/**
		 * The meta object literal for the '<em><b>Auto Rec St</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__AUTO_REC_ST = eINSTANCE.getRREC_AutoRecSt();

		/**
		 * The meta object literal for the '<em><b>Rec1 Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__REC1_TMMS = eINSTANCE.getRREC_Rec1Tmms();

		/**
		 * The meta object literal for the '<em><b>Rec2 Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__REC2_TMMS = eINSTANCE.getRREC_Rec2Tmms();

		/**
		 * The meta object literal for the '<em><b>Rec3 Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__REC3_TMMS = eINSTANCE.getRREC_Rec3Tmms();

		/**
		 * The meta object literal for the '<em><b>Pls Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__PLS_TMMS = eINSTANCE.getRREC_PlsTmms();

		/**
		 * The meta object literal for the '<em><b>Rcl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREC__RCL_TMMS = eINSTANCE.getRREC_RclTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl <em>RSYN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.RSYNImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl#getRSYN()
		 * @generated
		 */
		EClass RSYN = eINSTANCE.getRSYN();

		/**
		 * The meta object literal for the '<em><b>RHz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__RHZ = eINSTANCE.getRSYN_RHz();

		/**
		 * The meta object literal for the '<em><b>LHz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__LHZ = eINSTANCE.getRSYN_LHz();

		/**
		 * The meta object literal for the '<em><b>RV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__RV = eINSTANCE.getRSYN_RV();

		/**
		 * The meta object literal for the '<em><b>LV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__LV = eINSTANCE.getRSYN_LV();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__REL = eINSTANCE.getRSYN_Rel();

		/**
		 * The meta object literal for the '<em><b>Vlnd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__VLND = eINSTANCE.getRSYN_Vlnd();

		/**
		 * The meta object literal for the '<em><b>Ang Ind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__ANG_IND = eINSTANCE.getRSYN_AngInd();

		/**
		 * The meta object literal for the '<em><b>Hz Ind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__HZ_IND = eINSTANCE.getRSYN_HzInd();

		/**
		 * The meta object literal for the '<em><b>Syn Prg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__SYN_PRG = eINSTANCE.getRSYN_SynPrg();

		/**
		 * The meta object literal for the '<em><b>Dif VClc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__DIF_VCLC = eINSTANCE.getRSYN_DifVClc();

		/**
		 * The meta object literal for the '<em><b>Dif Ang Clc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__DIF_ANG_CLC = eINSTANCE.getRSYN_DifAngClc();

		/**
		 * The meta object literal for the '<em><b>Dif V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__DIF_V = eINSTANCE.getRSYN_DifV();

		/**
		 * The meta object literal for the '<em><b>Dif Hz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__DIF_HZ = eINSTANCE.getRSYN_DifHz();

		/**
		 * The meta object literal for the '<em><b>Dif Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__DIF_ANG = eINSTANCE.getRSYN_DifAng();

		/**
		 * The meta object literal for the '<em><b>Liv Dea Mod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__LIV_DEA_MOD = eINSTANCE.getRSYN_LivDeaMod();

		/**
		 * The meta object literal for the '<em><b>Dea Lin Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__DEA_LIN_VAL = eINSTANCE.getRSYN_DeaLinVal();

		/**
		 * The meta object literal for the '<em><b>Liv Lin Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__LIV_LIN_VAL = eINSTANCE.getRSYN_LivLinVal();

		/**
		 * The meta object literal for the '<em><b>Dea Bus Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__DEA_BUS_VAL = eINSTANCE.getRSYN_DeaBusVal();

		/**
		 * The meta object literal for the '<em><b>Pls Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__PLS_TMMS = eINSTANCE.getRSYN_PlsTmms();

		/**
		 * The meta object literal for the '<em><b>Bkr Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSYN__BKR_TMMS = eINSTANCE.getRSYN_BkrTmms();

	}

} //LNGroupRPackage
