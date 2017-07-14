/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupZ;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLNsPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.LNGroupZFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupZPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupZ";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupZ";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupZPackage eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.GroupZImpl <em>Group Z</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.GroupZImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getGroupZ()
	 * @generated
	 */
	int GROUP_Z = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Z__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Z__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Z__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Z__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The number of structural features of the '<em>Group Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Z_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Z_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZAXNImpl <em>ZAXN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZAXNImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZAXN()
	 * @generated
	 */
	int ZAXN = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN__VOL = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN__AMP = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ZAXN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ZAXN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAXN_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGILImpl <em>ZGIL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGILImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZGIL()
	 * @generated
	 */
	int ZGIL = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGIL__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGIL__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGIL__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGIL__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGIL__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZGIL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGIL_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ZGIL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGIL_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl <em>ZBAT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZBAT()
	 * @generated
	 */
	int ZBAT = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__VOL = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vol Chg Rte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__VOL_CHG_RTE = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__AMP = GROUP_Z_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bat Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__BAT_TEST = GROUP_Z_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Rsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__TEST_RSL = GROUP_Z_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bat Hi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__BAT_HI = GROUP_Z_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bat Lo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__BAT_LO = GROUP_Z_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lo Bat Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__LO_BAT_VAL = GROUP_Z_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hi Bat Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT__HI_BAT_VAL = GROUP_Z_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>ZBAT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>ZBAT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBAT_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZLINImpl <em>ZLIN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZLINImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZLIN()
	 * @generated
	 */
	int ZLIN = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLIN__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLIN__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLIN__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLIN__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLIN__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZLIN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLIN_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ZLIN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLIN_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl <em>ZMOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZMOT()
	 * @generated
	 */
	int ZMOT = 5;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DExt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__DEXT = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Los Oil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__LOS_OIL = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Los Vac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__LOS_VAC = GROUP_Z_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pres Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT__PRES_ALM = GROUP_Z_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ZMOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ZMOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZMOT_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZREAImpl <em>ZREA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZREAImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZREA()
	 * @generated
	 */
	int ZREA = 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZREA__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZREA__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZREA__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZREA__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZREA__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reactor Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZREA__REACTOR_CONTROL = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZREA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZREA_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ZREA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZREA_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl <em>ZBSH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZBSH()
	 * @generated
	 */
	int ZBSH = 7;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>React</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__REACT = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Los Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__LOS_FACT = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__VOL = GROUP_Z_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ref React</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__REF_REACT = GROUP_Z_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ref PF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__REF_PF = GROUP_Z_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ref V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH__REF_V = GROUP_Z_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>ZBSH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>ZBSH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZBSH_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZRRCImpl <em>ZRRC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZRRCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZRRC()
	 * @generated
	 */
	int ZRRC = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZRRC__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZRRC__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZRRC__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZRRC__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZRRC__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZRRC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZRRC_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ZRRC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZRRC_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZSARImpl <em>ZSAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZSARImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZSAR()
	 * @generated
	 */
	int ZSAR = 9;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZSAR__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZSAR__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZSAR__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZSAR__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Cnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZSAR__OP_CNT = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OPSA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZSAR__OPSA = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZSAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZSAR_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ZSAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZSAR_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZTCFImpl <em>ZTCF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZTCFImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZTCF()
	 * @generated
	 */
	int ZTCF = 10;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCF__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCF__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCF__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCF__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCF__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pwr Frq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCF__PWR_FRQ = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ZTCF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCF_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ZTCF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCF_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZTCRImpl <em>ZTCR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZTCRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZTCR()
	 * @generated
	 */
	int ZTCR = 11;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCR__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCR__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCR__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCR__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCR__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZTCR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCR_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ZTCR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTCR_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCABImpl <em>ZCAB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCABImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZCAB()
	 * @generated
	 */
	int ZCAB = 12;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAB__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAB__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAB__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAB__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAB__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZCAB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAB_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ZCAB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAB_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCAPImpl <em>ZCAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCAPImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZCAP()
	 * @generated
	 */
	int ZCAP = 13;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cap DS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP__CAP_DS = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dsch Blk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP__DSCH_BLK = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cap Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP__CAP_CONTROL = GROUP_Z_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ZCAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>ZCAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCAP_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCONImpl <em>ZCON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCONImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZCON()
	 * @generated
	 */
	int ZCON = 14;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCON__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCON__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCON__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCON__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCON__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ZCON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCON_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ZCON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZCON_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl <em>ZGEN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZGEN()
	 * @generated
	 */
	int ZGEN = 15;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__MODE = GROUP_Z__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__BEHAVIOUR = GROUP_Z__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__HEALTH = GROUP_Z__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__NAME_PLT = GROUP_Z__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__OP_TMH = GROUP_Z_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gn Ctl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__GN_CTL = GROUP_Z_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DExt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__DEXT = GROUP_Z_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aux SCO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__AUX_SCO = GROUP_Z_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stop Vlv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__STOP_VLV = GROUP_Z_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>React Pwr R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__REACT_PWR_R = GROUP_Z_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>React Pwr L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__REACT_PWR_L = GROUP_Z_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gn Spd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__GN_SPD = GROUP_Z_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>OANL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__OANL = GROUP_Z_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gn St</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__GN_ST = GROUP_Z_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Clk Rot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__CLK_ROT = GROUP_Z_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cnt Clk Rot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__CNT_CLK_ROT = GROUP_Z_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Op Un Ext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__OP_UN_EXT = GROUP_Z_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Op Ov Ext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__OP_OV_EXT = GROUP_Z_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Los Oil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__LOS_OIL = GROUP_Z_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Los Vac</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__LOS_VAC = GROUP_Z_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pres Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__PRES_ALM = GROUP_Z_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Dmd Pwr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__DMD_PWR = GROUP_Z_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pwr Rtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__PWR_RTG = GROUP_Z_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>VRtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN__VRTG = GROUP_Z_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>ZGEN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN_FEATURE_COUNT = GROUP_Z_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>ZGEN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZGEN_OPERATION_COUNT = GROUP_Z_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.GroupZ <em>Group Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Z</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.GroupZ
	 * @generated
	 */
	EClass getGroupZ();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZAXN <em>ZAXN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZAXN</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZAXN
	 * @generated
	 */
	EClass getZAXN();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZAXN#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZAXN#getOpTmh()
	 * @see #getZAXN()
	 * @generated
	 */
	EReference getZAXN_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZAXN#getVol <em>Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vol</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZAXN#getVol()
	 * @see #getZAXN()
	 * @generated
	 */
	EReference getZAXN_Vol();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZAXN#getAmp <em>Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amp</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZAXN#getAmp()
	 * @see #getZAXN()
	 * @generated
	 */
	EReference getZAXN_Amp();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGIL <em>ZGIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZGIL</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGIL
	 * @generated
	 */
	EClass getZGIL();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGIL#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGIL#getOpTmh()
	 * @see #getZGIL()
	 * @generated
	 */
	EReference getZGIL_OpTmh();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT <em>ZBAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZBAT</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT
	 * @generated
	 */
	EClass getZBAT();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getOpTmh()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getVol <em>Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vol</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getVol()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_Vol();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getVolChgRte <em>Vol Chg Rte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vol Chg Rte</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getVolChgRte()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_VolChgRte();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getAmp <em>Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amp</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getAmp()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_Amp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatTest <em>Bat Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bat Test</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatTest()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_BatTest();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getTestRsl <em>Test Rsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Rsl</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getTestRsl()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_TestRsl();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatHi <em>Bat Hi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bat Hi</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatHi()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_BatHi();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatLo <em>Bat Lo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bat Lo</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getBatLo()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_BatLo();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getLoBatVal <em>Lo Bat Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lo Bat Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getLoBatVal()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_LoBatVal();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getHiBatVal <em>Hi Bat Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hi Bat Val</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBAT#getHiBatVal()
	 * @see #getZBAT()
	 * @generated
	 */
	EReference getZBAT_HiBatVal();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZLIN <em>ZLIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZLIN</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZLIN
	 * @generated
	 */
	EClass getZLIN();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZLIN#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZLIN#getOpTmh()
	 * @see #getZLIN()
	 * @generated
	 */
	EReference getZLIN_OpTmh();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT <em>ZMOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZMOT</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT
	 * @generated
	 */
	EClass getZMOT();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getOpTmh()
	 * @see #getZMOT()
	 * @generated
	 */
	EReference getZMOT_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getDExt <em>DExt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DExt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getDExt()
	 * @see #getZMOT()
	 * @generated
	 */
	EReference getZMOT_DExt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getLosOil <em>Los Oil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Los Oil</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getLosOil()
	 * @see #getZMOT()
	 * @generated
	 */
	EReference getZMOT_LosOil();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getLosVac <em>Los Vac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Los Vac</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getLosVac()
	 * @see #getZMOT()
	 * @generated
	 */
	EReference getZMOT_LosVac();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getPresAlm <em>Pres Alm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pres Alm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZMOT#getPresAlm()
	 * @see #getZMOT()
	 * @generated
	 */
	EReference getZMOT_PresAlm();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA <em>ZREA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZREA</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA
	 * @generated
	 */
	EClass getZREA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA#getOpTmh()
	 * @see #getZREA()
	 * @generated
	 */
	EReference getZREA_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA#getReactorControl <em>Reactor Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reactor Control</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZREA#getReactorControl()
	 * @see #getZREA()
	 * @generated
	 */
	EReference getZREA_ReactorControl();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH <em>ZBSH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZBSH</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH
	 * @generated
	 */
	EClass getZBSH();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getOpTmh()
	 * @see #getZBSH()
	 * @generated
	 */
	EReference getZBSH_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getReact <em>React</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>React</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getReact()
	 * @see #getZBSH()
	 * @generated
	 */
	EReference getZBSH_React();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getLosFact <em>Los Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Los Fact</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getLosFact()
	 * @see #getZBSH()
	 * @generated
	 */
	EReference getZBSH_LosFact();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getVol <em>Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vol</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getVol()
	 * @see #getZBSH()
	 * @generated
	 */
	EReference getZBSH_Vol();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefReact <em>Ref React</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref React</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefReact()
	 * @see #getZBSH()
	 * @generated
	 */
	EReference getZBSH_RefReact();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefPF <em>Ref PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref PF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefPF()
	 * @see #getZBSH()
	 * @generated
	 */
	EReference getZBSH_RefPF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefV <em>Ref V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZBSH#getRefV()
	 * @see #getZBSH()
	 * @generated
	 */
	EReference getZBSH_RefV();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZRRC <em>ZRRC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZRRC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZRRC
	 * @generated
	 */
	EClass getZRRC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZRRC#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZRRC#getOpTmh()
	 * @see #getZRRC()
	 * @generated
	 */
	EReference getZRRC_OpTmh();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR <em>ZSAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZSAR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR
	 * @generated
	 */
	EClass getZSAR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR#getOpCnt <em>Op Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR#getOpCnt()
	 * @see #getZSAR()
	 * @generated
	 */
	EReference getZSAR_OpCnt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR#getOPSA <em>OPSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OPSA</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZSAR#getOPSA()
	 * @see #getZSAR()
	 * @generated
	 */
	EReference getZSAR_OPSA();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCF <em>ZTCF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZTCF</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCF
	 * @generated
	 */
	EClass getZTCF();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCF#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCF#getOpTmh()
	 * @see #getZTCF()
	 * @generated
	 */
	EReference getZTCF_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCF#getPwrFrq <em>Pwr Frq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pwr Frq</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCF#getPwrFrq()
	 * @see #getZTCF()
	 * @generated
	 */
	EReference getZTCF_PwrFrq();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCR <em>ZTCR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZTCR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCR
	 * @generated
	 */
	EClass getZTCR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCR#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZTCR#getOpTmh()
	 * @see #getZTCR()
	 * @generated
	 */
	EReference getZTCR_OpTmh();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAB <em>ZCAB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZCAB</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAB
	 * @generated
	 */
	EClass getZCAB();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAB#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAB#getOpTmh()
	 * @see #getZCAB()
	 * @generated
	 */
	EReference getZCAB_OpTmh();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP <em>ZCAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZCAP</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP
	 * @generated
	 */
	EClass getZCAP();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP#getOpTmh()
	 * @see #getZCAP()
	 * @generated
	 */
	EReference getZCAP_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP#getCapDS <em>Cap DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cap DS</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP#getCapDS()
	 * @see #getZCAP()
	 * @generated
	 */
	EReference getZCAP_CapDS();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP#getDschBlk <em>Dsch Blk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dsch Blk</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP#getDschBlk()
	 * @see #getZCAP()
	 * @generated
	 */
	EReference getZCAP_DschBlk();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP#getCapControl <em>Cap Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cap Control</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCAP#getCapControl()
	 * @see #getZCAP()
	 * @generated
	 */
	EReference getZCAP_CapControl();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCON <em>ZCON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZCON</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCON
	 * @generated
	 */
	EClass getZCON();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZCON#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZCON#getOpTmh()
	 * @see #getZCON()
	 * @generated
	 */
	EReference getZCON_OpTmh();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN <em>ZGEN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZGEN</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN
	 * @generated
	 */
	EClass getZGEN();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getOpTmh()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getGnCtl <em>Gn Ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gn Ctl</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getGnCtl()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_GnCtl();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getDExt <em>DExt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DExt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getDExt()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_DExt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getAuxSCO <em>Aux SCO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aux SCO</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getAuxSCO()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_AuxSCO();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getStopVlv <em>Stop Vlv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stop Vlv</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getStopVlv()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_StopVlv();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getReactPwrR <em>React Pwr R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>React Pwr R</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getReactPwrR()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_ReactPwrR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getReactPwrL <em>React Pwr L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>React Pwr L</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getReactPwrL()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_ReactPwrL();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getGnSpd <em>Gn Spd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gn Spd</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getGnSpd()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_GnSpd();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getOANL <em>OANL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OANL</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getOANL()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_OANL();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getGnSt <em>Gn St</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gn St</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getGnSt()
	 * @see #getZGEN()
	 * @generated
	 */
	EAttribute getZGEN_GnSt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getClkRot <em>Clk Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clk Rot</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getClkRot()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_ClkRot();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getCntClkRot <em>Cnt Clk Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cnt Clk Rot</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getCntClkRot()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_CntClkRot();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getOpUnExt <em>Op Un Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Un Ext</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getOpUnExt()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_OpUnExt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getOpOvExt <em>Op Ov Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Ov Ext</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getOpOvExt()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_OpOvExt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getLosOil <em>Los Oil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Los Oil</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getLosOil()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_LosOil();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getLosVac <em>Los Vac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Los Vac</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getLosVac()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_LosVac();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getPresAlm <em>Pres Alm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pres Alm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getPresAlm()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_PresAlm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getDmdPwr <em>Dmd Pwr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dmd Pwr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getDmdPwr()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_DmdPwr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getPwrRtg <em>Pwr Rtg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pwr Rtg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getPwrRtg()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_PwrRtg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getVRtg <em>VRtg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VRtg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.ZGEN#getVRtg()
	 * @see #getZGEN()
	 * @generated
	 */
	EReference getZGEN_VRtg();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupZFactory getLNGroupZFactory();

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
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.GroupZImpl <em>Group Z</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.GroupZImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getGroupZ()
		 * @generated
		 */
		EClass GROUP_Z = eINSTANCE.getGroupZ();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZAXNImpl <em>ZAXN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZAXNImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZAXN()
		 * @generated
		 */
		EClass ZAXN = eINSTANCE.getZAXN();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZAXN__OP_TMH = eINSTANCE.getZAXN_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZAXN__VOL = eINSTANCE.getZAXN_Vol();

		/**
		 * The meta object literal for the '<em><b>Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZAXN__AMP = eINSTANCE.getZAXN_Amp();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGILImpl <em>ZGIL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGILImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZGIL()
		 * @generated
		 */
		EClass ZGIL = eINSTANCE.getZGIL();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGIL__OP_TMH = eINSTANCE.getZGIL_OpTmh();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl <em>ZBAT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBATImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZBAT()
		 * @generated
		 */
		EClass ZBAT = eINSTANCE.getZBAT();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__OP_TMH = eINSTANCE.getZBAT_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__VOL = eINSTANCE.getZBAT_Vol();

		/**
		 * The meta object literal for the '<em><b>Vol Chg Rte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__VOL_CHG_RTE = eINSTANCE.getZBAT_VolChgRte();

		/**
		 * The meta object literal for the '<em><b>Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__AMP = eINSTANCE.getZBAT_Amp();

		/**
		 * The meta object literal for the '<em><b>Bat Test</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__BAT_TEST = eINSTANCE.getZBAT_BatTest();

		/**
		 * The meta object literal for the '<em><b>Test Rsl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__TEST_RSL = eINSTANCE.getZBAT_TestRsl();

		/**
		 * The meta object literal for the '<em><b>Bat Hi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__BAT_HI = eINSTANCE.getZBAT_BatHi();

		/**
		 * The meta object literal for the '<em><b>Bat Lo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__BAT_LO = eINSTANCE.getZBAT_BatLo();

		/**
		 * The meta object literal for the '<em><b>Lo Bat Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__LO_BAT_VAL = eINSTANCE.getZBAT_LoBatVal();

		/**
		 * The meta object literal for the '<em><b>Hi Bat Val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBAT__HI_BAT_VAL = eINSTANCE.getZBAT_HiBatVal();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZLINImpl <em>ZLIN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZLINImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZLIN()
		 * @generated
		 */
		EClass ZLIN = eINSTANCE.getZLIN();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZLIN__OP_TMH = eINSTANCE.getZLIN_OpTmh();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl <em>ZMOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZMOTImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZMOT()
		 * @generated
		 */
		EClass ZMOT = eINSTANCE.getZMOT();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZMOT__OP_TMH = eINSTANCE.getZMOT_OpTmh();

		/**
		 * The meta object literal for the '<em><b>DExt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZMOT__DEXT = eINSTANCE.getZMOT_DExt();

		/**
		 * The meta object literal for the '<em><b>Los Oil</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZMOT__LOS_OIL = eINSTANCE.getZMOT_LosOil();

		/**
		 * The meta object literal for the '<em><b>Los Vac</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZMOT__LOS_VAC = eINSTANCE.getZMOT_LosVac();

		/**
		 * The meta object literal for the '<em><b>Pres Alm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZMOT__PRES_ALM = eINSTANCE.getZMOT_PresAlm();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZREAImpl <em>ZREA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZREAImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZREA()
		 * @generated
		 */
		EClass ZREA = eINSTANCE.getZREA();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZREA__OP_TMH = eINSTANCE.getZREA_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Reactor Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZREA__REACTOR_CONTROL = eINSTANCE.getZREA_ReactorControl();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl <em>ZBSH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZBSHImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZBSH()
		 * @generated
		 */
		EClass ZBSH = eINSTANCE.getZBSH();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBSH__OP_TMH = eINSTANCE.getZBSH_OpTmh();

		/**
		 * The meta object literal for the '<em><b>React</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBSH__REACT = eINSTANCE.getZBSH_React();

		/**
		 * The meta object literal for the '<em><b>Los Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBSH__LOS_FACT = eINSTANCE.getZBSH_LosFact();

		/**
		 * The meta object literal for the '<em><b>Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBSH__VOL = eINSTANCE.getZBSH_Vol();

		/**
		 * The meta object literal for the '<em><b>Ref React</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBSH__REF_REACT = eINSTANCE.getZBSH_RefReact();

		/**
		 * The meta object literal for the '<em><b>Ref PF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBSH__REF_PF = eINSTANCE.getZBSH_RefPF();

		/**
		 * The meta object literal for the '<em><b>Ref V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZBSH__REF_V = eINSTANCE.getZBSH_RefV();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZRRCImpl <em>ZRRC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZRRCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZRRC()
		 * @generated
		 */
		EClass ZRRC = eINSTANCE.getZRRC();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZRRC__OP_TMH = eINSTANCE.getZRRC_OpTmh();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZSARImpl <em>ZSAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZSARImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZSAR()
		 * @generated
		 */
		EClass ZSAR = eINSTANCE.getZSAR();

		/**
		 * The meta object literal for the '<em><b>Op Cnt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZSAR__OP_CNT = eINSTANCE.getZSAR_OpCnt();

		/**
		 * The meta object literal for the '<em><b>OPSA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZSAR__OPSA = eINSTANCE.getZSAR_OPSA();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZTCFImpl <em>ZTCF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZTCFImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZTCF()
		 * @generated
		 */
		EClass ZTCF = eINSTANCE.getZTCF();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZTCF__OP_TMH = eINSTANCE.getZTCF_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Pwr Frq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZTCF__PWR_FRQ = eINSTANCE.getZTCF_PwrFrq();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZTCRImpl <em>ZTCR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZTCRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZTCR()
		 * @generated
		 */
		EClass ZTCR = eINSTANCE.getZTCR();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZTCR__OP_TMH = eINSTANCE.getZTCR_OpTmh();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCABImpl <em>ZCAB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCABImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZCAB()
		 * @generated
		 */
		EClass ZCAB = eINSTANCE.getZCAB();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZCAB__OP_TMH = eINSTANCE.getZCAB_OpTmh();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCAPImpl <em>ZCAP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCAPImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZCAP()
		 * @generated
		 */
		EClass ZCAP = eINSTANCE.getZCAP();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZCAP__OP_TMH = eINSTANCE.getZCAP_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Cap DS</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZCAP__CAP_DS = eINSTANCE.getZCAP_CapDS();

		/**
		 * The meta object literal for the '<em><b>Dsch Blk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZCAP__DSCH_BLK = eINSTANCE.getZCAP_DschBlk();

		/**
		 * The meta object literal for the '<em><b>Cap Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZCAP__CAP_CONTROL = eINSTANCE.getZCAP_CapControl();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCONImpl <em>ZCON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZCONImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZCON()
		 * @generated
		 */
		EClass ZCON = eINSTANCE.getZCON();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZCON__OP_TMH = eINSTANCE.getZCON_OpTmh();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl <em>ZGEN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.ZGENImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl#getZGEN()
		 * @generated
		 */
		EClass ZGEN = eINSTANCE.getZGEN();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__OP_TMH = eINSTANCE.getZGEN_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Gn Ctl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__GN_CTL = eINSTANCE.getZGEN_GnCtl();

		/**
		 * The meta object literal for the '<em><b>DExt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__DEXT = eINSTANCE.getZGEN_DExt();

		/**
		 * The meta object literal for the '<em><b>Aux SCO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__AUX_SCO = eINSTANCE.getZGEN_AuxSCO();

		/**
		 * The meta object literal for the '<em><b>Stop Vlv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__STOP_VLV = eINSTANCE.getZGEN_StopVlv();

		/**
		 * The meta object literal for the '<em><b>React Pwr R</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__REACT_PWR_R = eINSTANCE.getZGEN_ReactPwrR();

		/**
		 * The meta object literal for the '<em><b>React Pwr L</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__REACT_PWR_L = eINSTANCE.getZGEN_ReactPwrL();

		/**
		 * The meta object literal for the '<em><b>Gn Spd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__GN_SPD = eINSTANCE.getZGEN_GnSpd();

		/**
		 * The meta object literal for the '<em><b>OANL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__OANL = eINSTANCE.getZGEN_OANL();

		/**
		 * The meta object literal for the '<em><b>Gn St</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZGEN__GN_ST = eINSTANCE.getZGEN_GnSt();

		/**
		 * The meta object literal for the '<em><b>Clk Rot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__CLK_ROT = eINSTANCE.getZGEN_ClkRot();

		/**
		 * The meta object literal for the '<em><b>Cnt Clk Rot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__CNT_CLK_ROT = eINSTANCE.getZGEN_CntClkRot();

		/**
		 * The meta object literal for the '<em><b>Op Un Ext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__OP_UN_EXT = eINSTANCE.getZGEN_OpUnExt();

		/**
		 * The meta object literal for the '<em><b>Op Ov Ext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__OP_OV_EXT = eINSTANCE.getZGEN_OpOvExt();

		/**
		 * The meta object literal for the '<em><b>Los Oil</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__LOS_OIL = eINSTANCE.getZGEN_LosOil();

		/**
		 * The meta object literal for the '<em><b>Los Vac</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__LOS_VAC = eINSTANCE.getZGEN_LosVac();

		/**
		 * The meta object literal for the '<em><b>Pres Alm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__PRES_ALM = eINSTANCE.getZGEN_PresAlm();

		/**
		 * The meta object literal for the '<em><b>Dmd Pwr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__DMD_PWR = eINSTANCE.getZGEN_DmdPwr();

		/**
		 * The meta object literal for the '<em><b>Pwr Rtg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__PWR_RTG = eINSTANCE.getZGEN_PwrRtg();

		/**
		 * The meta object literal for the '<em><b>VRtg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZGEN__VRTG = eINSTANCE.getZGEN_VRtg();

	}

} //LNGroupZPackage
