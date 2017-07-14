/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupY;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupY.LNGroupYFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupYPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupY";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupY";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupYPackage eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.GroupYImpl <em>Group Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.GroupYImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getGroupY()
	 * @generated
	 */
	int GROUP_Y = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Y__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Y__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Y__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Y__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Y__EE_NAME = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Y__EE_HEALTH = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Y_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_Y_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YEFNImpl <em>YEFN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.YEFNImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getYEFN()
	 * @generated
	 */
	int YEFN = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__MODE = GROUP_Y__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__BEHAVIOUR = GROUP_Y__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__HEALTH = GROUP_Y__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__NAME_PLT = GROUP_Y__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__EE_NAME = GROUP_Y__EE_NAME;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__EE_HEALTH = GROUP_Y__EE_HEALTH;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__LOC = GROUP_Y_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__OP_TMH = GROUP_Y_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ECA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__ECA = GROUP_Y_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Col Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__COL_TAP_POS = GROUP_Y_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Col Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN__COL_POS = GROUP_Y_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YEFN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN_FEATURE_COUNT = GROUP_Y_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>YEFN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEFN_OPERATION_COUNT = GROUP_Y_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl <em>YLTC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getYLTC()
	 * @generated
	 */
	int YLTC = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__MODE = GROUP_Y__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__BEHAVIOUR = GROUP_Y__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__HEALTH = GROUP_Y__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__NAME_PLT = GROUP_Y__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__EE_NAME = GROUP_Y__EE_NAME;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__EE_HEALTH = GROUP_Y__EE_HEALTH;

	/**
	 * The feature id for the '<em><b>Op Cnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__OP_CNT = GROUP_Y_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Torq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__TORQ = GROUP_Y_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mot Drv A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__MOT_DRV_A = GROUP_Y_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tap Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__TAP_POS = GROUP_Y_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tap Chg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__TAP_CHG = GROUP_Y_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Pos R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__END_POS_R = GROUP_Y_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Pos L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__END_POS_L = GROUP_Y_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Oil Fil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC__OIL_FIL = GROUP_Y_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>YLTC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC_FEATURE_COUNT = GROUP_Y_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>YLTC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLTC_OPERATION_COUNT = GROUP_Y_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPSHImpl <em>YPSH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPSHImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getYPSH()
	 * @generated
	 */
	int YPSH = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__MODE = GROUP_Y__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__BEHAVIOUR = GROUP_Y__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__HEALTH = GROUP_Y__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__NAME_PLT = GROUP_Y__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__EE_NAME = GROUP_Y__EE_NAME;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__EE_HEALTH = GROUP_Y__EE_HEALTH;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__OP_TMH = GROUP_Y_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__POS = GROUP_Y_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blk Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__BLK_OPN = GROUP_Y_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blk Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__BLK_CLS = GROUP_Y_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cha Mot Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__CHA_MOT_ENA = GROUP_Y_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sh Op Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__SH_OP_CAP = GROUP_Y_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Op Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH__MAX_OP_CAP = GROUP_Y_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>YPSH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH_FEATURE_COUNT = GROUP_Y_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>YPSH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPSH_OPERATION_COUNT = GROUP_Y_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl <em>YPTR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getYPTR()
	 * @generated
	 */
	int YPTR = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__MODE = GROUP_Y__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__BEHAVIOUR = GROUP_Y__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__HEALTH = GROUP_Y__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__NAME_PLT = GROUP_Y__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__EE_NAME = GROUP_Y__EE_NAME;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__EE_HEALTH = GROUP_Y__EE_HEALTH;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__OP_TMH = GROUP_Y_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HP Tmp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__HP_TMP = GROUP_Y_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HP Zmp Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__HP_ZMP_ALM = GROUP_Y_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>HP Tmp Tr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__HP_TMP_TR = GROUP_Y_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>OANL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__OANL = GROUP_Y_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Op Ov A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__OP_OV_A = GROUP_Y_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Op Ov V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__OP_OV_V = GROUP_Y_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Op Un V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__OP_UN_V = GROUP_Y_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CG Alm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__CG_ALM = GROUP_Y_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hi VRtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__HI_VRTG = GROUP_Y_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lo VRtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__LO_VRTG = GROUP_Y_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pwr Rtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__PWR_RTG = GROUP_Y_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Transformer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR__TRANSFORMER_CONTROL = GROUP_Y_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>YPTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR_FEATURE_COUNT = GROUP_Y_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>YPTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPTR_OPERATION_COUNT = GROUP_Y_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupY.GroupY <em>Group Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Y</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.GroupY
	 * @generated
	 */
	EClass getGroupY();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.GroupY#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.GroupY#getEEName()
	 * @see #getGroupY()
	 * @generated
	 */
	EReference getGroupY_EEName();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.LNNodes.LNGroupY.GroupY#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.GroupY#getEEHealth()
	 * @see #getGroupY()
	 * @generated
	 */
	EAttribute getGroupY_EEHealth();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YEFN <em>YEFN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEFN</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YEFN
	 * @generated
	 */
	EClass getYEFN();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getLoc()
	 * @see #getYEFN()
	 * @generated
	 */
	EReference getYEFN_Loc();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getOpTmh()
	 * @see #getYEFN()
	 * @generated
	 */
	EReference getYEFN_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getECA <em>ECA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ECA</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getECA()
	 * @see #getYEFN()
	 * @generated
	 */
	EReference getYEFN_ECA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getColTapPos <em>Col Tap Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Col Tap Pos</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getColTapPos()
	 * @see #getYEFN()
	 * @generated
	 */
	EReference getYEFN_ColTapPos();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getColPos <em>Col Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Col Pos</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YEFN#getColPos()
	 * @see #getYEFN()
	 * @generated
	 */
	EReference getYEFN_ColPos();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC <em>YLTC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YLTC</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC
	 * @generated
	 */
	EClass getYLTC();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getOpCnt <em>Op Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getOpCnt()
	 * @see #getYLTC()
	 * @generated
	 */
	EReference getYLTC_OpCnt();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getTorq <em>Torq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Torq</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getTorq()
	 * @see #getYLTC()
	 * @generated
	 */
	EReference getYLTC_Torq();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getMotDrvA <em>Mot Drv A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mot Drv A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getMotDrvA()
	 * @see #getYLTC()
	 * @generated
	 */
	EReference getYLTC_MotDrvA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getTapPos <em>Tap Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Pos</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getTapPos()
	 * @see #getYLTC()
	 * @generated
	 */
	EReference getYLTC_TapPos();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getTapChg <em>Tap Chg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Chg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getTapChg()
	 * @see #getYLTC()
	 * @generated
	 */
	EReference getYLTC_TapChg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getEndPosR <em>End Pos R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Pos R</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getEndPosR()
	 * @see #getYLTC()
	 * @generated
	 */
	EReference getYLTC_EndPosR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getEndPosL <em>End Pos L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Pos L</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getEndPosL()
	 * @see #getYLTC()
	 * @generated
	 */
	EReference getYLTC_EndPosL();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getOilFil <em>Oil Fil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Oil Fil</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YLTC#getOilFil()
	 * @see #getYLTC()
	 * @generated
	 */
	EReference getYLTC_OilFil();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPSH <em>YPSH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPSH</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPSH
	 * @generated
	 */
	EClass getYPSH();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getOpTmh()
	 * @see #getYPSH()
	 * @generated
	 */
	EReference getYPSH_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getPos()
	 * @see #getYPSH()
	 * @generated
	 */
	EReference getYPSH_Pos();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getBlkOpn <em>Blk Opn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Opn</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getBlkOpn()
	 * @see #getYPSH()
	 * @generated
	 */
	EReference getYPSH_BlkOpn();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getBlkCls <em>Blk Cls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Cls</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getBlkCls()
	 * @see #getYPSH()
	 * @generated
	 */
	EReference getYPSH_BlkCls();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getChaMotEna <em>Cha Mot Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cha Mot Ena</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getChaMotEna()
	 * @see #getYPSH()
	 * @generated
	 */
	EReference getYPSH_ChaMotEna();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getShOpCap <em>Sh Op Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sh Op Cap</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getShOpCap()
	 * @see #getYPSH()
	 * @generated
	 */
	EAttribute getYPSH_ShOpCap();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getMaxOpCap <em>Max Op Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Op Cap</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPSH#getMaxOpCap()
	 * @see #getYPSH()
	 * @generated
	 */
	EAttribute getYPSH_MaxOpCap();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR <em>YPTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YPTR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR
	 * @generated
	 */
	EClass getYPTR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOpTmh()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getHPTmp <em>HP Tmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HP Tmp</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getHPTmp()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_HPTmp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getHPZmpAlm <em>HP Zmp Alm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HP Zmp Alm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getHPZmpAlm()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_HPZmpAlm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getHPTmpTr <em>HP Tmp Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HP Tmp Tr</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getHPTmpTr()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_HPTmpTr();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOANL <em>OANL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OANL</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOANL()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_OANL();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOpOvA <em>Op Ov A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Ov A</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOpOvA()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_OpOvA();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOpOvV <em>Op Ov V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Ov V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOpOvV()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_OpOvV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOpUnV <em>Op Un V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Un V</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getOpUnV()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_OpUnV();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getCGAlm <em>CG Alm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CG Alm</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getCGAlm()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_CGAlm();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getHiVRtg <em>Hi VRtg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hi VRtg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getHiVRtg()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_HiVRtg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getLoVRtg <em>Lo VRtg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lo VRtg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getLoVRtg()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_LoVRtg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getPwrRtg <em>Pwr Rtg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pwr Rtg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getPwrRtg()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_PwrRtg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getTransformerControl <em>Transformer Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Control</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupY.YPTR#getTransformerControl()
	 * @see #getYPTR()
	 * @generated
	 */
	EReference getYPTR_TransformerControl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupYFactory getLNGroupYFactory();

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
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.GroupYImpl <em>Group Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.GroupYImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getGroupY()
		 * @generated
		 */
		EClass GROUP_Y = eINSTANCE.getGroupY();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_Y__EE_NAME = eINSTANCE.getGroupY_EEName();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_Y__EE_HEALTH = eINSTANCE.getGroupY_EEHealth();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YEFNImpl <em>YEFN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.YEFNImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getYEFN()
		 * @generated
		 */
		EClass YEFN = eINSTANCE.getYEFN();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEFN__LOC = eINSTANCE.getYEFN_Loc();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEFN__OP_TMH = eINSTANCE.getYEFN_OpTmh();

		/**
		 * The meta object literal for the '<em><b>ECA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEFN__ECA = eINSTANCE.getYEFN_ECA();

		/**
		 * The meta object literal for the '<em><b>Col Tap Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEFN__COL_TAP_POS = eINSTANCE.getYEFN_ColTapPos();

		/**
		 * The meta object literal for the '<em><b>Col Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEFN__COL_POS = eINSTANCE.getYEFN_ColPos();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl <em>YLTC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.YLTCImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getYLTC()
		 * @generated
		 */
		EClass YLTC = eINSTANCE.getYLTC();

		/**
		 * The meta object literal for the '<em><b>Op Cnt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLTC__OP_CNT = eINSTANCE.getYLTC_OpCnt();

		/**
		 * The meta object literal for the '<em><b>Torq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLTC__TORQ = eINSTANCE.getYLTC_Torq();

		/**
		 * The meta object literal for the '<em><b>Mot Drv A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLTC__MOT_DRV_A = eINSTANCE.getYLTC_MotDrvA();

		/**
		 * The meta object literal for the '<em><b>Tap Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLTC__TAP_POS = eINSTANCE.getYLTC_TapPos();

		/**
		 * The meta object literal for the '<em><b>Tap Chg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLTC__TAP_CHG = eINSTANCE.getYLTC_TapChg();

		/**
		 * The meta object literal for the '<em><b>End Pos R</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLTC__END_POS_R = eINSTANCE.getYLTC_EndPosR();

		/**
		 * The meta object literal for the '<em><b>End Pos L</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLTC__END_POS_L = eINSTANCE.getYLTC_EndPosL();

		/**
		 * The meta object literal for the '<em><b>Oil Fil</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLTC__OIL_FIL = eINSTANCE.getYLTC_OilFil();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPSHImpl <em>YPSH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPSHImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getYPSH()
		 * @generated
		 */
		EClass YPSH = eINSTANCE.getYPSH();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPSH__OP_TMH = eINSTANCE.getYPSH_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPSH__POS = eINSTANCE.getYPSH_Pos();

		/**
		 * The meta object literal for the '<em><b>Blk Opn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPSH__BLK_OPN = eINSTANCE.getYPSH_BlkOpn();

		/**
		 * The meta object literal for the '<em><b>Blk Cls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPSH__BLK_CLS = eINSTANCE.getYPSH_BlkCls();

		/**
		 * The meta object literal for the '<em><b>Cha Mot Ena</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPSH__CHA_MOT_ENA = eINSTANCE.getYPSH_ChaMotEna();

		/**
		 * The meta object literal for the '<em><b>Sh Op Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPSH__SH_OP_CAP = eINSTANCE.getYPSH_ShOpCap();

		/**
		 * The meta object literal for the '<em><b>Max Op Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPSH__MAX_OP_CAP = eINSTANCE.getYPSH_MaxOpCap();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl <em>YPTR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.YPTRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl#getYPTR()
		 * @generated
		 */
		EClass YPTR = eINSTANCE.getYPTR();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__OP_TMH = eINSTANCE.getYPTR_OpTmh();

		/**
		 * The meta object literal for the '<em><b>HP Tmp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__HP_TMP = eINSTANCE.getYPTR_HPTmp();

		/**
		 * The meta object literal for the '<em><b>HP Zmp Alm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__HP_ZMP_ALM = eINSTANCE.getYPTR_HPZmpAlm();

		/**
		 * The meta object literal for the '<em><b>HP Tmp Tr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__HP_TMP_TR = eINSTANCE.getYPTR_HPTmpTr();

		/**
		 * The meta object literal for the '<em><b>OANL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__OANL = eINSTANCE.getYPTR_OANL();

		/**
		 * The meta object literal for the '<em><b>Op Ov A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__OP_OV_A = eINSTANCE.getYPTR_OpOvA();

		/**
		 * The meta object literal for the '<em><b>Op Ov V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__OP_OV_V = eINSTANCE.getYPTR_OpOvV();

		/**
		 * The meta object literal for the '<em><b>Op Un V</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__OP_UN_V = eINSTANCE.getYPTR_OpUnV();

		/**
		 * The meta object literal for the '<em><b>CG Alm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__CG_ALM = eINSTANCE.getYPTR_CGAlm();

		/**
		 * The meta object literal for the '<em><b>Hi VRtg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__HI_VRTG = eINSTANCE.getYPTR_HiVRtg();

		/**
		 * The meta object literal for the '<em><b>Lo VRtg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__LO_VRTG = eINSTANCE.getYPTR_LoVRtg();

		/**
		 * The meta object literal for the '<em><b>Pwr Rtg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__PWR_RTG = eINSTANCE.getYPTR_PwrRtg();

		/**
		 * The meta object literal for the '<em><b>Transformer Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPTR__TRANSFORMER_CONTROL = eINSTANCE.getYPTR_TransformerControl();

	}

} //LNGroupYPackage
