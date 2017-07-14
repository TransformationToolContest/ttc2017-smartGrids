/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupA;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupA.LNGroupAFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupAPackage eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.GroupAImpl <em>Group A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.GroupAImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getGroupA()
	 * @generated
	 */
	int GROUP_A = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A__LOC = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A__OP_CNT_RS = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A__AUTO = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Group A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_A_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ANCRImpl <em>ANCR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.ANCRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getANCR()
	 * @generated
	 */
	int ANCR = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__MODE = GROUP_A__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__BEHAVIOUR = GROUP_A__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__HEALTH = GROUP_A__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__NAME_PLT = GROUP_A__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__LOC = GROUP_A__LOC;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__OP_CNT_RS = GROUP_A__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__AUTO = GROUP_A__AUTO;

	/**
	 * The feature id for the '<em><b>Tap Chg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__TAP_CHG = GROUP_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RCol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__RCOL = GROUP_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LCol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR__LCOL = GROUP_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ANCR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR_FEATURE_COUNT = GROUP_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ANCR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCR_OPERATION_COUNT = GROUP_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ARCOImpl <em>ARCO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.ARCOImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getARCO()
	 * @generated
	 */
	int ARCO = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__MODE = GROUP_A__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__BEHAVIOUR = GROUP_A__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__HEALTH = GROUP_A__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__NAME_PLT = GROUP_A__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__LOC = GROUP_A__LOC;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__OP_CNT_RS = GROUP_A__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__AUTO = GROUP_A__AUTO;

	/**
	 * The feature id for the '<em><b>Tap Chg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__TAP_CHG = GROUP_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VOv St</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__VOV_ST = GROUP_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Neut Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__NEUT_ALM = GROUP_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dsch Blk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__DSCH_BLK = GROUP_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ARCO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_FEATURE_COUNT = GROUP_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>ARCO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_OPERATION_COUNT = GROUP_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ATCCImpl <em>ATCC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.ATCCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getATCC()
	 * @generated
	 */
	int ATCC = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__MODE = GROUP_A__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__BEHAVIOUR = GROUP_A__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__HEALTH = GROUP_A__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__NAME_PLT = GROUP_A__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LOC = GROUP_A__LOC;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__OP_CNT_RS = GROUP_A__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__AUTO = GROUP_A__AUTO;

	/**
	 * The feature id for the '<em><b>Tap Chg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__TAP_CHG = GROUP_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__TAP_POS = GROUP_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Par Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__PAR_OP = GROUP_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>LTC Blk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LTC_BLK = GROUP_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>LTC Drag Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LTC_DRAG_RS = GROUP_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>VRed1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__VRED1 = GROUP_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>VRed2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__VRED2 = GROUP_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ctl V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__CTL_V = GROUP_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lod A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LOD_A = GROUP_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Circ A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__CIRC_A = GROUP_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ph Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__PH_ANG = GROUP_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hi Ctl V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__HI_CTL_V = GROUP_A_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Lo Ctl V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LO_CTL_V = GROUP_A_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Hi Dmd A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__HI_DMD_A = GROUP_A_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Hi Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__HI_TAP_POS = GROUP_A_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Lo Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LO_TAP_POS = GROUP_A_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Bnd Ctr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__BND_CTR = GROUP_A_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Bnd Wid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__BND_WID = GROUP_A_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ctl Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__CTL_DL_TMMS = GROUP_A_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>LDCR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LDCR = GROUP_A_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>LDCX</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LDCX = GROUP_A_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Blk LV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__BLK_LV = GROUP_A_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Blk RV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__BLK_RV = GROUP_A_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Rnbk RV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__RNBK_RV = GROUP_A_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Lim Lod A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LIM_LOD_A = GROUP_A_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>LDC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LDC = GROUP_A_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Tm Dl Chr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__TM_DL_CHR = GROUP_A_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>LDCZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__LDCZ = GROUP_A_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>VRed Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__VRED_VAL = GROUP_A_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Tap Blk R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__TAP_BLK_R = GROUP_A_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Tap Blk L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC__TAP_BLK_L = GROUP_A_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>ATCC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC_FEATURE_COUNT = GROUP_A_FEATURE_COUNT + 31;

	/**
	 * The number of operations of the '<em>ATCC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCC_OPERATION_COUNT = GROUP_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl <em>AVCO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getAVCO()
	 * @generated
	 */
	int AVCO = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__MODE = GROUP_A__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__BEHAVIOUR = GROUP_A__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__HEALTH = GROUP_A__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__NAME_PLT = GROUP_A__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__LOC = GROUP_A__LOC;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__OP_CNT_RS = GROUP_A__OP_CNT_RS;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__AUTO = GROUP_A__AUTO;

	/**
	 * The feature id for the '<em><b>Tap Chg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__TAP_CHG = GROUP_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blk EF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__BLK_EF = GROUP_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blk AOv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__BLK_AOV = GROUP_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blk VOv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__BLK_VOV = GROUP_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lim AOv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__LIM_AOV = GROUP_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lim VOv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO__LIM_VOV = GROUP_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>AVCO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO_FEATURE_COUNT = GROUP_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>AVCO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVCO_OPERATION_COUNT = GROUP_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupA.GroupA <em>Group A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.GroupA
	 * @generated
	 */
	EClass getGroupA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.GroupA#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.GroupA#getLoc()
	 * @see #getGroupA()
	 * @generated
	 */
	EReference getGroupA_Loc();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.GroupA#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.GroupA#getOpCntRs()
	 * @see #getGroupA()
	 * @generated
	 */
	EReference getGroupA_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.GroupA#getAuto <em>Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.GroupA#getAuto()
	 * @see #getGroupA()
	 * @generated
	 */
	EReference getGroupA_Auto();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ANCR <em>ANCR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANCR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ANCR
	 * @generated
	 */
	EClass getANCR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ANCR#getTapChg <em>Tap Chg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Chg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ANCR#getTapChg()
	 * @see #getANCR()
	 * @generated
	 */
	EReference getANCR_TapChg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ANCR#getRCol <em>RCol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RCol</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ANCR#getRCol()
	 * @see #getANCR()
	 * @generated
	 */
	EReference getANCR_RCol();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ANCR#getLCol <em>LCol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LCol</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ANCR#getLCol()
	 * @see #getANCR()
	 * @generated
	 */
	EReference getANCR_LCol();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO <em>ARCO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARCO</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ARCO
	 * @generated
	 */
	EClass getARCO();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getTapChg <em>Tap Chg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Chg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getTapChg()
	 * @see #getARCO()
	 * @generated
	 */
	EReference getARCO_TapChg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getVOvSt <em>VOv St</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VOv St</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getVOvSt()
	 * @see #getARCO()
	 * @generated
	 */
	EReference getARCO_VOvSt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getNeutAlm <em>Neut Alm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neut Alm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getNeutAlm()
	 * @see #getARCO()
	 * @generated
	 */
	EReference getARCO_NeutAlm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getDschBlk <em>Dsch Blk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dsch Blk</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ARCO#getDschBlk()
	 * @see #getARCO()
	 * @generated
	 */
	EReference getARCO_DschBlk();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC <em>ATCC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATCC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC
	 * @generated
	 */
	EClass getATCC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTapChg <em>Tap Chg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Chg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTapChg()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_TapChg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTapPos <em>Tap Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Pos</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTapPos()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_TapPos();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getParOp <em>Par Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Par Op</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getParOp()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_ParOp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLTCBlk <em>LTC Blk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LTC Blk</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLTCBlk()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LTCBlk();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLTCDragRs <em>LTC Drag Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LTC Drag Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLTCDragRs()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LTCDragRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getVRed1 <em>VRed1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VRed1</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getVRed1()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_VRed1();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getVRed2 <em>VRed2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VRed2</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getVRed2()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_VRed2();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getCtlV <em>Ctl V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctl V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getCtlV()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_CtlV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLodA <em>Lod A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lod A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLodA()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LodA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getCircA <em>Circ A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circ A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getCircA()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_CircA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getPhAng <em>Ph Ang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ph Ang</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getPhAng()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_PhAng();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getHiCtlV <em>Hi Ctl V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hi Ctl V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getHiCtlV()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_HiCtlV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLoCtlV <em>Lo Ctl V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lo Ctl V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLoCtlV()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LoCtlV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getHiDmdA <em>Hi Dmd A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hi Dmd A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getHiDmdA()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_HiDmdA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getHiTapPos <em>Hi Tap Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hi Tap Pos</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getHiTapPos()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_HiTapPos();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLoTapPos <em>Lo Tap Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lo Tap Pos</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLoTapPos()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LoTapPos();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getBndCtr <em>Bnd Ctr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bnd Ctr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getBndCtr()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_BndCtr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getBndWid <em>Bnd Wid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bnd Wid</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getBndWid()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_BndWid();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getCtlDlTmms <em>Ctl Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctl Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getCtlDlTmms()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_CtlDlTmms();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLDCR <em>LDCR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LDCR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLDCR()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LDCR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLDCX <em>LDCX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LDCX</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLDCX()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LDCX();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getBlkLV <em>Blk LV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk LV</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getBlkLV()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_BlkLV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getBlkRV <em>Blk RV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk RV</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getBlkRV()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_BlkRV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getRnbkRV <em>Rnbk RV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rnbk RV</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getRnbkRV()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_RnbkRV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLimLodA <em>Lim Lod A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lim Lod A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLimLodA()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LimLodA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLDC <em>LDC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LDC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLDC()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LDC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTmDlChr <em>Tm Dl Chr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Dl Chr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTmDlChr()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_TmDlChr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLDCZ <em>LDCZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>LDCZ</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getLDCZ()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_LDCZ();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getVRedVal <em>VRed Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VRed Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getVRedVal()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_VRedVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTapBlkR <em>Tap Blk R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Blk R</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTapBlkR()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_TapBlkR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTapBlkL <em>Tap Blk L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Blk L</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.ATCC#getTapBlkL()
	 * @see #getATCC()
	 * @generated
	 */
	EReference getATCC_TapBlkL();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupA.AVCO <em>AVCO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVCO</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.AVCO
	 * @generated
	 */
	EClass getAVCO();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getTapChg <em>Tap Chg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Chg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getTapChg()
	 * @see #getAVCO()
	 * @generated
	 */
	EReference getAVCO_TapChg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getBlkEF <em>Blk EF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk EF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getBlkEF()
	 * @see #getAVCO()
	 * @generated
	 */
	EReference getAVCO_BlkEF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getBlkAOv <em>Blk AOv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk AOv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getBlkAOv()
	 * @see #getAVCO()
	 * @generated
	 */
	EReference getAVCO_BlkAOv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getBlkVOv <em>Blk VOv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk VOv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getBlkVOv()
	 * @see #getAVCO()
	 * @generated
	 */
	EReference getAVCO_BlkVOv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getLimAOv <em>Lim AOv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lim AOv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getLimAOv()
	 * @see #getAVCO()
	 * @generated
	 */
	EReference getAVCO_LimAOv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getLimVOv <em>Lim VOv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lim VOv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupA.AVCO#getLimVOv()
	 * @see #getAVCO()
	 * @generated
	 */
	EReference getAVCO_LimVOv();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupAFactory getLNGroupAFactory();

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
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.GroupAImpl <em>Group A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.GroupAImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getGroupA()
		 * @generated
		 */
		EClass GROUP_A = eINSTANCE.getGroupA();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_A__LOC = eINSTANCE.getGroupA_Loc();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_A__OP_CNT_RS = eINSTANCE.getGroupA_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Auto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_A__AUTO = eINSTANCE.getGroupA_Auto();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ANCRImpl <em>ANCR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.ANCRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getANCR()
		 * @generated
		 */
		EClass ANCR = eINSTANCE.getANCR();

		/**
		 * The meta object literal for the '<em><b>Tap Chg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCR__TAP_CHG = eINSTANCE.getANCR_TapChg();

		/**
		 * The meta object literal for the '<em><b>RCol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCR__RCOL = eINSTANCE.getANCR_RCol();

		/**
		 * The meta object literal for the '<em><b>LCol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCR__LCOL = eINSTANCE.getANCR_LCol();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ARCOImpl <em>ARCO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.ARCOImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getARCO()
		 * @generated
		 */
		EClass ARCO = eINSTANCE.getARCO();

		/**
		 * The meta object literal for the '<em><b>Tap Chg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO__TAP_CHG = eINSTANCE.getARCO_TapChg();

		/**
		 * The meta object literal for the '<em><b>VOv St</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO__VOV_ST = eINSTANCE.getARCO_VOvSt();

		/**
		 * The meta object literal for the '<em><b>Neut Alm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO__NEUT_ALM = eINSTANCE.getARCO_NeutAlm();

		/**
		 * The meta object literal for the '<em><b>Dsch Blk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO__DSCH_BLK = eINSTANCE.getARCO_DschBlk();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.ATCCImpl <em>ATCC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.ATCCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getATCC()
		 * @generated
		 */
		EClass ATCC = eINSTANCE.getATCC();

		/**
		 * The meta object literal for the '<em><b>Tap Chg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__TAP_CHG = eINSTANCE.getATCC_TapChg();

		/**
		 * The meta object literal for the '<em><b>Tap Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__TAP_POS = eINSTANCE.getATCC_TapPos();

		/**
		 * The meta object literal for the '<em><b>Par Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__PAR_OP = eINSTANCE.getATCC_ParOp();

		/**
		 * The meta object literal for the '<em><b>LTC Blk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LTC_BLK = eINSTANCE.getATCC_LTCBlk();

		/**
		 * The meta object literal for the '<em><b>LTC Drag Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LTC_DRAG_RS = eINSTANCE.getATCC_LTCDragRs();

		/**
		 * The meta object literal for the '<em><b>VRed1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__VRED1 = eINSTANCE.getATCC_VRed1();

		/**
		 * The meta object literal for the '<em><b>VRed2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__VRED2 = eINSTANCE.getATCC_VRed2();

		/**
		 * The meta object literal for the '<em><b>Ctl V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__CTL_V = eINSTANCE.getATCC_CtlV();

		/**
		 * The meta object literal for the '<em><b>Lod A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LOD_A = eINSTANCE.getATCC_LodA();

		/**
		 * The meta object literal for the '<em><b>Circ A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__CIRC_A = eINSTANCE.getATCC_CircA();

		/**
		 * The meta object literal for the '<em><b>Ph Ang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__PH_ANG = eINSTANCE.getATCC_PhAng();

		/**
		 * The meta object literal for the '<em><b>Hi Ctl V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__HI_CTL_V = eINSTANCE.getATCC_HiCtlV();

		/**
		 * The meta object literal for the '<em><b>Lo Ctl V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LO_CTL_V = eINSTANCE.getATCC_LoCtlV();

		/**
		 * The meta object literal for the '<em><b>Hi Dmd A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__HI_DMD_A = eINSTANCE.getATCC_HiDmdA();

		/**
		 * The meta object literal for the '<em><b>Hi Tap Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__HI_TAP_POS = eINSTANCE.getATCC_HiTapPos();

		/**
		 * The meta object literal for the '<em><b>Lo Tap Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LO_TAP_POS = eINSTANCE.getATCC_LoTapPos();

		/**
		 * The meta object literal for the '<em><b>Bnd Ctr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__BND_CTR = eINSTANCE.getATCC_BndCtr();

		/**
		 * The meta object literal for the '<em><b>Bnd Wid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__BND_WID = eINSTANCE.getATCC_BndWid();

		/**
		 * The meta object literal for the '<em><b>Ctl Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__CTL_DL_TMMS = eINSTANCE.getATCC_CtlDlTmms();

		/**
		 * The meta object literal for the '<em><b>LDCR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LDCR = eINSTANCE.getATCC_LDCR();

		/**
		 * The meta object literal for the '<em><b>LDCX</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LDCX = eINSTANCE.getATCC_LDCX();

		/**
		 * The meta object literal for the '<em><b>Blk LV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__BLK_LV = eINSTANCE.getATCC_BlkLV();

		/**
		 * The meta object literal for the '<em><b>Blk RV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__BLK_RV = eINSTANCE.getATCC_BlkRV();

		/**
		 * The meta object literal for the '<em><b>Rnbk RV</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__RNBK_RV = eINSTANCE.getATCC_RnbkRV();

		/**
		 * The meta object literal for the '<em><b>Lim Lod A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LIM_LOD_A = eINSTANCE.getATCC_LimLodA();

		/**
		 * The meta object literal for the '<em><b>LDC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LDC = eINSTANCE.getATCC_LDC();

		/**
		 * The meta object literal for the '<em><b>Tm Dl Chr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__TM_DL_CHR = eINSTANCE.getATCC_TmDlChr();

		/**
		 * The meta object literal for the '<em><b>LDCZ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__LDCZ = eINSTANCE.getATCC_LDCZ();

		/**
		 * The meta object literal for the '<em><b>VRed Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__VRED_VAL = eINSTANCE.getATCC_VRedVal();

		/**
		 * The meta object literal for the '<em><b>Tap Blk R</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__TAP_BLK_R = eINSTANCE.getATCC_TapBlkR();

		/**
		 * The meta object literal for the '<em><b>Tap Blk L</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATCC__TAP_BLK_L = eINSTANCE.getATCC_TapBlkL();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl <em>AVCO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.AVCOImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl#getAVCO()
		 * @generated
		 */
		EClass AVCO = eINSTANCE.getAVCO();

		/**
		 * The meta object literal for the '<em><b>Tap Chg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVCO__TAP_CHG = eINSTANCE.getAVCO_TapChg();

		/**
		 * The meta object literal for the '<em><b>Blk EF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVCO__BLK_EF = eINSTANCE.getAVCO_BlkEF();

		/**
		 * The meta object literal for the '<em><b>Blk AOv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVCO__BLK_AOV = eINSTANCE.getAVCO_BlkAOv();

		/**
		 * The meta object literal for the '<em><b>Blk VOv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVCO__BLK_VOV = eINSTANCE.getAVCO_BlkVOv();

		/**
		 * The meta object literal for the '<em><b>Lim AOv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVCO__LIM_AOV = eINSTANCE.getAVCO_LimAOv();

		/**
		 * The meta object literal for the '<em><b>Lim VOv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVCO__LIM_VOV = eINSTANCE.getAVCO_LimVOv();

	}

} //LNGroupAPackage
