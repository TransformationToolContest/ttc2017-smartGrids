/**
 */
package substationStandard.LNNodes.LNGroupX;

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
 * @see substationStandard.LNNodes.LNGroupX.LNGroupXFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupXPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupX";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupX";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupXPackage eINSTANCE = substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl.init();

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl <em>Group X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupX.impl.GroupXImpl
	 * @see substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl#getGroupX()
	 * @generated
	 */
	int GROUP_X = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__LOC = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__EE_HEALTH = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__EE_NAME = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Op Cnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__OP_CNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__POS = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blk Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__BLK_OPN = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Blk Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__BLK_CLS = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cha Mot Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X__CHA_MOT_ENA = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Group X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Group X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_X_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupX.impl.XCBRImpl <em>XCBR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupX.impl.XCBRImpl
	 * @see substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl#getXCBR()
	 * @generated
	 */
	int XCBR = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__MODE = GROUP_X__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__BEHAVIOUR = GROUP_X__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__HEALTH = GROUP_X__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__NAME_PLT = GROUP_X__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__LOC = GROUP_X__LOC;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__EE_HEALTH = GROUP_X__EE_HEALTH;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__EE_NAME = GROUP_X__EE_NAME;

	/**
	 * The feature id for the '<em><b>Op Cnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__OP_CNT = GROUP_X__OP_CNT;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__POS = GROUP_X__POS;

	/**
	 * The feature id for the '<em><b>Blk Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__BLK_OPN = GROUP_X__BLK_OPN;

	/**
	 * The feature id for the '<em><b>Blk Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__BLK_CLS = GROUP_X__BLK_CLS;

	/**
	 * The feature id for the '<em><b>Cha Mot Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__CHA_MOT_ENA = GROUP_X__CHA_MOT_ENA;

	/**
	 * The feature id for the '<em><b>Sum Sw ARs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__SUM_SW_ARS = GROUP_X_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CB Op Cap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__CB_OP_CAP = GROUP_X_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>POW Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__POW_CAP = GROUP_X_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Op Cap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__MAX_OP_CAP = GROUP_X_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Switch Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR__SWITCH_CONTROL = GROUP_X_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XCBR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR_FEATURE_COUNT = GROUP_X_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>XCBR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCBR_OPERATION_COUNT = GROUP_X_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link substationStandard.LNNodes.LNGroupX.impl.XSWIImpl <em>XSWI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.LNNodes.LNGroupX.impl.XSWIImpl
	 * @see substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl#getXSWI()
	 * @generated
	 */
	int XSWI = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__MODE = GROUP_X__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__BEHAVIOUR = GROUP_X__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__HEALTH = GROUP_X__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__NAME_PLT = GROUP_X__NAME_PLT;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__LOC = GROUP_X__LOC;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__EE_HEALTH = GROUP_X__EE_HEALTH;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__EE_NAME = GROUP_X__EE_NAME;

	/**
	 * The feature id for the '<em><b>Op Cnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__OP_CNT = GROUP_X__OP_CNT;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__POS = GROUP_X__POS;

	/**
	 * The feature id for the '<em><b>Blk Opn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__BLK_OPN = GROUP_X__BLK_OPN;

	/**
	 * The feature id for the '<em><b>Blk Cls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__BLK_CLS = GROUP_X__BLK_CLS;

	/**
	 * The feature id for the '<em><b>Cha Mot Ena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__CHA_MOT_ENA = GROUP_X__CHA_MOT_ENA;

	/**
	 * The feature id for the '<em><b>Sw Op Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__SW_OP_CAP = GROUP_X_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Op Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__MAX_OP_CAP = GROUP_X_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sw Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__SW_TYP = GROUP_X_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Switch Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI__SWITCH_CONTROL = GROUP_X_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XSWI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI_FEATURE_COUNT = GROUP_X_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XSWI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSWI_OPERATION_COUNT = GROUP_X_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupX.GroupX <em>Group X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group X</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX
	 * @generated
	 */
	EClass getGroupX();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.GroupX#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX#getLoc()
	 * @see #getGroupX()
	 * @generated
	 */
	EReference getGroupX_Loc();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupX.GroupX#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX#getEEHealth()
	 * @see #getGroupX()
	 * @generated
	 */
	EAttribute getGroupX_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.GroupX#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX#getEEName()
	 * @see #getGroupX()
	 * @generated
	 */
	EReference getGroupX_EEName();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.GroupX#getOpCnt <em>Op Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Cnt</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX#getOpCnt()
	 * @see #getGroupX()
	 * @generated
	 */
	EReference getGroupX_OpCnt();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.GroupX#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pos</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX#getPos()
	 * @see #getGroupX()
	 * @generated
	 */
	EReference getGroupX_Pos();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.GroupX#getBlkOpn <em>Blk Opn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Opn</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX#getBlkOpn()
	 * @see #getGroupX()
	 * @generated
	 */
	EReference getGroupX_BlkOpn();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.GroupX#getBlkCls <em>Blk Cls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blk Cls</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX#getBlkCls()
	 * @see #getGroupX()
	 * @generated
	 */
	EReference getGroupX_BlkCls();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.GroupX#getChaMotEna <em>Cha Mot Ena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cha Mot Ena</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.GroupX#getChaMotEna()
	 * @see #getGroupX()
	 * @generated
	 */
	EReference getGroupX_ChaMotEna();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupX.XCBR <em>XCBR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCBR</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XCBR
	 * @generated
	 */
	EClass getXCBR();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.XCBR#getSumSwARs <em>Sum Sw ARs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sum Sw ARs</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XCBR#getSumSwARs()
	 * @see #getXCBR()
	 * @generated
	 */
	EReference getXCBR_SumSwARs();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.XCBR#getCBOpCap <em>CB Op Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CB Op Cap</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XCBR#getCBOpCap()
	 * @see #getXCBR()
	 * @generated
	 */
	EReference getXCBR_CBOpCap();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupX.XCBR#getPOWCap <em>POW Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POW Cap</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XCBR#getPOWCap()
	 * @see #getXCBR()
	 * @generated
	 */
	EAttribute getXCBR_POWCap();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.XCBR#getMaxOpCap <em>Max Op Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Op Cap</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XCBR#getMaxOpCap()
	 * @see #getXCBR()
	 * @generated
	 */
	EReference getXCBR_MaxOpCap();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.XCBR#getSwitchControl <em>Switch Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switch Control</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XCBR#getSwitchControl()
	 * @see #getXCBR()
	 * @generated
	 */
	EReference getXCBR_SwitchControl();

	/**
	 * Returns the meta object for class '{@link substationStandard.LNNodes.LNGroupX.XSWI <em>XSWI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSWI</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XSWI
	 * @generated
	 */
	EClass getXSWI();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupX.XSWI#getSwOpCap <em>Sw Op Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Op Cap</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XSWI#getSwOpCap()
	 * @see #getXSWI()
	 * @generated
	 */
	EAttribute getXSWI_SwOpCap();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupX.XSWI#getMaxOpCap <em>Max Op Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Op Cap</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XSWI#getMaxOpCap()
	 * @see #getXSWI()
	 * @generated
	 */
	EAttribute getXSWI_MaxOpCap();

	/**
	 * Returns the meta object for the attribute '{@link substationStandard.LNNodes.LNGroupX.XSWI#getSwTyp <em>Sw Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Typ</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XSWI#getSwTyp()
	 * @see #getXSWI()
	 * @generated
	 */
	EAttribute getXSWI_SwTyp();

	/**
	 * Returns the meta object for the reference '{@link substationStandard.LNNodes.LNGroupX.XSWI#getSwitchControl <em>Switch Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switch Control</em>'.
	 * @see substationStandard.LNNodes.LNGroupX.XSWI#getSwitchControl()
	 * @see #getXSWI()
	 * @generated
	 */
	EReference getXSWI_SwitchControl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupXFactory getLNGroupXFactory();

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
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupX.impl.GroupXImpl <em>Group X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupX.impl.GroupXImpl
		 * @see substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl#getGroupX()
		 * @generated
		 */
		EClass GROUP_X = eINSTANCE.getGroupX();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_X__LOC = eINSTANCE.getGroupX_Loc();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_X__EE_HEALTH = eINSTANCE.getGroupX_EEHealth();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_X__EE_NAME = eINSTANCE.getGroupX_EEName();

		/**
		 * The meta object literal for the '<em><b>Op Cnt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_X__OP_CNT = eINSTANCE.getGroupX_OpCnt();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_X__POS = eINSTANCE.getGroupX_Pos();

		/**
		 * The meta object literal for the '<em><b>Blk Opn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_X__BLK_OPN = eINSTANCE.getGroupX_BlkOpn();

		/**
		 * The meta object literal for the '<em><b>Blk Cls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_X__BLK_CLS = eINSTANCE.getGroupX_BlkCls();

		/**
		 * The meta object literal for the '<em><b>Cha Mot Ena</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_X__CHA_MOT_ENA = eINSTANCE.getGroupX_ChaMotEna();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupX.impl.XCBRImpl <em>XCBR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupX.impl.XCBRImpl
		 * @see substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl#getXCBR()
		 * @generated
		 */
		EClass XCBR = eINSTANCE.getXCBR();

		/**
		 * The meta object literal for the '<em><b>Sum Sw ARs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCBR__SUM_SW_ARS = eINSTANCE.getXCBR_SumSwARs();

		/**
		 * The meta object literal for the '<em><b>CB Op Cap</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCBR__CB_OP_CAP = eINSTANCE.getXCBR_CBOpCap();

		/**
		 * The meta object literal for the '<em><b>POW Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCBR__POW_CAP = eINSTANCE.getXCBR_POWCap();

		/**
		 * The meta object literal for the '<em><b>Max Op Cap</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCBR__MAX_OP_CAP = eINSTANCE.getXCBR_MaxOpCap();

		/**
		 * The meta object literal for the '<em><b>Switch Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCBR__SWITCH_CONTROL = eINSTANCE.getXCBR_SwitchControl();

		/**
		 * The meta object literal for the '{@link substationStandard.LNNodes.LNGroupX.impl.XSWIImpl <em>XSWI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.LNNodes.LNGroupX.impl.XSWIImpl
		 * @see substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl#getXSWI()
		 * @generated
		 */
		EClass XSWI = eINSTANCE.getXSWI();

		/**
		 * The meta object literal for the '<em><b>Sw Op Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSWI__SW_OP_CAP = eINSTANCE.getXSWI_SwOpCap();

		/**
		 * The meta object literal for the '<em><b>Max Op Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSWI__MAX_OP_CAP = eINSTANCE.getXSWI_MaxOpCap();

		/**
		 * The meta object literal for the '<em><b>Sw Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSWI__SW_TYP = eINSTANCE.getXSWI_SwTyp();

		/**
		 * The meta object literal for the '<em><b>Switch Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSWI__SWITCH_CONTROL = eINSTANCE.getXSWI_SwitchControl();

	}

} //LNGroupXPackage
