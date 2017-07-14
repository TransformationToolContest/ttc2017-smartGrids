/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupC;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupC.LNGroupCFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupCPackage eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.GroupCImpl <em>Group C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.GroupCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getGroupC()
	 * @generated
	 */
	int GROUP_C = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_C__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_C__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_C__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_C__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The number of structural features of the '<em>Group C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_C_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_C_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CALHImpl <em>CALH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CALHImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCALH()
	 * @generated
	 */
	int CALH = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH__MODE = GROUP_C__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH__BEHAVIOUR = GROUP_C__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH__HEALTH = GROUP_C__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH__NAME_PLT = GROUP_C__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Gr Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH__GR_ALM = GROUP_C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gr Wrn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH__GR_WRN = GROUP_C_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alm Lst Ov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH__ALM_LST_OV = GROUP_C_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CALH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH_FEATURE_COUNT = GROUP_C_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CALH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALH_OPERATION_COUNT = GROUP_C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CILOImpl <em>CILO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CILOImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCILO()
	 * @generated
	 */
	int CILO = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILO__MODE = GROUP_C__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILO__BEHAVIOUR = GROUP_C__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILO__HEALTH = GROUP_C__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILO__NAME_PLT = GROUP_C__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Ena Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILO__ENA_OPN = GROUP_C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ena Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILO__ENA_CLS = GROUP_C_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CILO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILO_FEATURE_COUNT = GROUP_C_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CILO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILO_OPERATION_COUNT = GROUP_C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CCGRImpl <em>CCGR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CCGRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCCGR()
	 * @generated
	 */
	int CCGR = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__MODE = GROUP_C__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__BEHAVIOUR = GROUP_C__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__HEALTH = GROUP_C__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__NAME_PLT = GROUP_C__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__EE_HEALTH = GROUP_C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__EE_NAME = GROUP_C_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__OP_TMH = GROUP_C_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Env Tmp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__ENV_TMP = GROUP_C_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Oil Tmp In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__OIL_TMP_IN = GROUP_C_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Oil Tmp Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__OIL_TMP_OUT = GROUP_C_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Oil Mot A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__OIL_MOT_A = GROUP_C_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fan Flw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__FAN_FLW = GROUP_C_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fan A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__FAN_A = GROUP_C_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CE Ctl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__CE_CTL = GROUP_C_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pmp Ctl Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__PMP_CTL_GEN = GROUP_C_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pmp Ctl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__PMP_CTL = GROUP_C_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fan Ctl Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__FAN_CTL_GEN = GROUP_C_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fan Ctl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__FAN_CTL = GROUP_C_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Auto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__AUTO = GROUP_C_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fan Ov Cur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__FAN_OV_CUR = GROUP_C_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pmp Ov Cur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__PMP_OV_CUR = GROUP_C_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pmp Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__PMP_ALM = GROUP_C_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Oil Tmp Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR__OIL_TMP_SET = GROUP_C_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>CCGR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR_FEATURE_COUNT = GROUP_C_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>CCGR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCGR_OPERATION_COUNT = GROUP_C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl <em>CPOW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCPOW()
	 * @generated
	 */
	int CPOW = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__MODE = GROUP_C__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__BEHAVIOUR = GROUP_C__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__HEALTH = GROUP_C__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__NAME_PLT = GROUP_C__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Tm Exc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__TM_EXC = GROUP_C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Str POW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__STR_POW = GROUP_C_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__OP_OPN = GROUP_C_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Op Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__OP_CLS = GROUP_C_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Dl Tmms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW__MAX_DL_TMMS = GROUP_C_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CPOW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW_FEATURE_COUNT = GROUP_C_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>CPOW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOW_OPERATION_COUNT = GROUP_C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl <em>CSWI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCSWI()
	 * @generated
	 */
	int CSWI = 5;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__MODE = GROUP_C__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__BEHAVIOUR = GROUP_C__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__HEALTH = GROUP_C__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__NAME_PLT = GROUP_C__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__LOC = GROUP_C_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op Cnt Rs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__OP_CNT_RS = GROUP_C_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__POS = GROUP_C_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__POS_A = GROUP_C_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__POS_B = GROUP_C_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pos C</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__POS_C = GROUP_C_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Op Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__OP_OPN = GROUP_C_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Op Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI__OP_CLS = GROUP_C_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>CSWI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI_FEATURE_COUNT = GROUP_C_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>CSWI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSWI_OPERATION_COUNT = GROUP_C_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupC.GroupC <em>Group C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group C</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.GroupC
	 * @generated
	 */
	EClass getGroupC();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH <em>CALH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CALH</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CALH
	 * @generated
	 */
	EClass getCALH();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getGrAlm <em>Gr Alm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gr Alm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getGrAlm()
	 * @see #getCALH()
	 * @generated
	 */
	EReference getCALH_GrAlm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getGrWrn <em>Gr Wrn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gr Wrn</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getGrWrn()
	 * @see #getCALH()
	 * @generated
	 */
	EReference getCALH_GrWrn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getAlmLstOv <em>Alm Lst Ov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alm Lst Ov</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CALH#getAlmLstOv()
	 * @see #getCALH()
	 * @generated
	 */
	EReference getCALH_AlmLstOv();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CILO <em>CILO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CILO</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CILO
	 * @generated
	 */
	EClass getCILO();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CILO#getEnaOpn <em>Ena Opn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ena Opn</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CILO#getEnaOpn()
	 * @see #getCILO()
	 * @generated
	 */
	EReference getCILO_EnaOpn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CILO#getEnaCls <em>Ena Cls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ena Cls</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CILO#getEnaCls()
	 * @see #getCILO()
	 * @generated
	 */
	EReference getCILO_EnaCls();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR <em>CCGR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CCGR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR
	 * @generated
	 */
	EClass getCCGR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Health</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEEHealth()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEEName()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_EEName();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOpTmh()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEnvTmp <em>Env Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Env Tmp</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getEnvTmp()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_EnvTmp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpIn <em>Oil Tmp In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oil Tmp In</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpIn()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_OilTmpIn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpOut <em>Oil Tmp Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oil Tmp Out</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpOut()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_OilTmpOut();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilMotA <em>Oil Mot A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oil Mot A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilMotA()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_OilMotA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanFlw <em>Fan Flw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fan Flw</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanFlw()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_FanFlw();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanA <em>Fan A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fan A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanA()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_FanA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getCECtl <em>CE Ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CE Ctl</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getCECtl()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_CECtl();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpCtlGen <em>Pmp Ctl Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pmp Ctl Gen</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpCtlGen()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_PmpCtlGen();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpCtl <em>Pmp Ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pmp Ctl</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpCtl()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_PmpCtl();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanCtlGen <em>Fan Ctl Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fan Ctl Gen</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanCtlGen()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_FanCtlGen();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanCtl <em>Fan Ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fan Ctl</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanCtl()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_FanCtl();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getAuto <em>Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getAuto()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_Auto();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanOvCur <em>Fan Ov Cur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fan Ov Cur</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getFanOvCur()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_FanOvCur();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpOvCur <em>Pmp Ov Cur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pmp Ov Cur</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpOvCur()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_PmpOvCur();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpAlm <em>Pmp Alm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pmp Alm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getPmpAlm()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_PmpAlm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpSet <em>Oil Tmp Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oil Tmp Set</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CCGR#getOilTmpSet()
	 * @see #getCCGR()
	 * @generated
	 */
	EReference getCCGR_OilTmpSet();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CPOW <em>CPOW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPOW</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CPOW
	 * @generated
	 */
	EClass getCPOW();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getTmExc <em>Tm Exc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Exc</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getTmExc()
	 * @see #getCPOW()
	 * @generated
	 */
	EReference getCPOW_TmExc();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getStrPOW <em>Str POW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Str POW</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getStrPOW()
	 * @see #getCPOW()
	 * @generated
	 */
	EReference getCPOW_StrPOW();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getOpOpn <em>Op Opn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Opn</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getOpOpn()
	 * @see #getCPOW()
	 * @generated
	 */
	EReference getCPOW_OpOpn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getOpCls <em>Op Cls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cls</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getOpCls()
	 * @see #getCPOW()
	 * @generated
	 */
	EReference getCPOW_OpCls();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getMaxDlTmms <em>Max Dl Tmms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Dl Tmms</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CPOW#getMaxDlTmms()
	 * @see #getCPOW()
	 * @generated
	 */
	EReference getCPOW_MaxDlTmms();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI <em>CSWI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSWI</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI
	 * @generated
	 */
	EClass getCSWI();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getLoc()
	 * @see #getCSWI()
	 * @generated
	 */
	EReference getCSWI_Loc();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getOpCntRs <em>Op Cnt Rs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt Rs</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getOpCntRs()
	 * @see #getCSWI()
	 * @generated
	 */
	EReference getCSWI_OpCntRs();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getPos()
	 * @see #getCSWI()
	 * @generated
	 */
	EReference getCSWI_Pos();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getPosA <em>Pos A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getPosA()
	 * @see #getCSWI()
	 * @generated
	 */
	EReference getCSWI_PosA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getPosB <em>Pos B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos B</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getPosB()
	 * @see #getCSWI()
	 * @generated
	 */
	EReference getCSWI_PosB();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getPosC <em>Pos C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos C</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getPosC()
	 * @see #getCSWI()
	 * @generated
	 */
	EReference getCSWI_PosC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getOpOpn <em>Op Opn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Opn</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getOpOpn()
	 * @see #getCSWI()
	 * @generated
	 */
	EReference getCSWI_OpOpn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getOpCls <em>Op Cls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cls</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupC.CSWI#getOpCls()
	 * @see #getCSWI()
	 * @generated
	 */
	EReference getCSWI_OpCls();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupCFactory getLNGroupCFactory();

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
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.GroupCImpl <em>Group C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.GroupCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getGroupC()
		 * @generated
		 */
		EClass GROUP_C = eINSTANCE.getGroupC();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CALHImpl <em>CALH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CALHImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCALH()
		 * @generated
		 */
		EClass CALH = eINSTANCE.getCALH();

		/**
		 * The meta object literal for the '<em><b>Gr Alm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALH__GR_ALM = eINSTANCE.getCALH_GrAlm();

		/**
		 * The meta object literal for the '<em><b>Gr Wrn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALH__GR_WRN = eINSTANCE.getCALH_GrWrn();

		/**
		 * The meta object literal for the '<em><b>Alm Lst Ov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALH__ALM_LST_OV = eINSTANCE.getCALH_AlmLstOv();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CILOImpl <em>CILO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CILOImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCILO()
		 * @generated
		 */
		EClass CILO = eINSTANCE.getCILO();

		/**
		 * The meta object literal for the '<em><b>Ena Opn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CILO__ENA_OPN = eINSTANCE.getCILO_EnaOpn();

		/**
		 * The meta object literal for the '<em><b>Ena Cls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CILO__ENA_CLS = eINSTANCE.getCILO_EnaCls();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CCGRImpl <em>CCGR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CCGRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCCGR()
		 * @generated
		 */
		EClass CCGR = eINSTANCE.getCCGR();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__EE_HEALTH = eINSTANCE.getCCGR_EEHealth();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__EE_NAME = eINSTANCE.getCCGR_EEName();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__OP_TMH = eINSTANCE.getCCGR_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Env Tmp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__ENV_TMP = eINSTANCE.getCCGR_EnvTmp();

		/**
		 * The meta object literal for the '<em><b>Oil Tmp In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__OIL_TMP_IN = eINSTANCE.getCCGR_OilTmpIn();

		/**
		 * The meta object literal for the '<em><b>Oil Tmp Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__OIL_TMP_OUT = eINSTANCE.getCCGR_OilTmpOut();

		/**
		 * The meta object literal for the '<em><b>Oil Mot A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__OIL_MOT_A = eINSTANCE.getCCGR_OilMotA();

		/**
		 * The meta object literal for the '<em><b>Fan Flw</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__FAN_FLW = eINSTANCE.getCCGR_FanFlw();

		/**
		 * The meta object literal for the '<em><b>Fan A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__FAN_A = eINSTANCE.getCCGR_FanA();

		/**
		 * The meta object literal for the '<em><b>CE Ctl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__CE_CTL = eINSTANCE.getCCGR_CECtl();

		/**
		 * The meta object literal for the '<em><b>Pmp Ctl Gen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__PMP_CTL_GEN = eINSTANCE.getCCGR_PmpCtlGen();

		/**
		 * The meta object literal for the '<em><b>Pmp Ctl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__PMP_CTL = eINSTANCE.getCCGR_PmpCtl();

		/**
		 * The meta object literal for the '<em><b>Fan Ctl Gen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__FAN_CTL_GEN = eINSTANCE.getCCGR_FanCtlGen();

		/**
		 * The meta object literal for the '<em><b>Fan Ctl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__FAN_CTL = eINSTANCE.getCCGR_FanCtl();

		/**
		 * The meta object literal for the '<em><b>Auto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__AUTO = eINSTANCE.getCCGR_Auto();

		/**
		 * The meta object literal for the '<em><b>Fan Ov Cur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__FAN_OV_CUR = eINSTANCE.getCCGR_FanOvCur();

		/**
		 * The meta object literal for the '<em><b>Pmp Ov Cur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__PMP_OV_CUR = eINSTANCE.getCCGR_PmpOvCur();

		/**
		 * The meta object literal for the '<em><b>Pmp Alm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__PMP_ALM = eINSTANCE.getCCGR_PmpAlm();

		/**
		 * The meta object literal for the '<em><b>Oil Tmp Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCGR__OIL_TMP_SET = eINSTANCE.getCCGR_OilTmpSet();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl <em>CPOW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CPOWImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCPOW()
		 * @generated
		 */
		EClass CPOW = eINSTANCE.getCPOW();

		/**
		 * The meta object literal for the '<em><b>Tm Exc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPOW__TM_EXC = eINSTANCE.getCPOW_TmExc();

		/**
		 * The meta object literal for the '<em><b>Str POW</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPOW__STR_POW = eINSTANCE.getCPOW_StrPOW();

		/**
		 * The meta object literal for the '<em><b>Op Opn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPOW__OP_OPN = eINSTANCE.getCPOW_OpOpn();

		/**
		 * The meta object literal for the '<em><b>Op Cls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPOW__OP_CLS = eINSTANCE.getCPOW_OpCls();

		/**
		 * The meta object literal for the '<em><b>Max Dl Tmms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPOW__MAX_DL_TMMS = eINSTANCE.getCPOW_MaxDlTmms();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl <em>CSWI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.CSWIImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl#getCSWI()
		 * @generated
		 */
		EClass CSWI = eINSTANCE.getCSWI();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSWI__LOC = eINSTANCE.getCSWI_Loc();

		/**
		 * The meta object literal for the '<em><b>Op Cnt Rs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSWI__OP_CNT_RS = eINSTANCE.getCSWI_OpCntRs();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSWI__POS = eINSTANCE.getCSWI_Pos();

		/**
		 * The meta object literal for the '<em><b>Pos A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSWI__POS_A = eINSTANCE.getCSWI_PosA();

		/**
		 * The meta object literal for the '<em><b>Pos B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSWI__POS_B = eINSTANCE.getCSWI_PosB();

		/**
		 * The meta object literal for the '<em><b>Pos C</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSWI__POS_C = eINSTANCE.getCSWI_PosC();

		/**
		 * The meta object literal for the '<em><b>Op Opn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSWI__OP_OPN = eINSTANCE.getCSWI_OpOpn();

		/**
		 * The meta object literal for the '<em><b>Op Cls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSWI__OP_CLS = eINSTANCE.getCSWI_OpCls();

	}

} //LNGroupCPackage
