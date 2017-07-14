/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupT;

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
 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTFactory
 * @model kind="package"
 * @generated
 */
public interface LNGroupTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LNGroupT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard/groupT";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LNGroupTPackage eINSTANCE = gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl.init();

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.GroupTImpl <em>Group T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.GroupTImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl#getGroupT()
	 * @generated
	 */
	int GROUP_T = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__MODE = DomainLNsPackage.DOMAIN_LN__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__BEHAVIOUR = DomainLNsPackage.DOMAIN_LN__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__HEALTH = DomainLNsPackage.DOMAIN_LN__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__NAME_PLT = DomainLNsPackage.DOMAIN_LN__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__EE_NAME = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__EE_HEALTH = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__OP_TMH = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hz Rtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__HZ_RTG = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__RAT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__COR = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ang Cor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T__ANG_COR = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Group T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T_FEATURE_COUNT = DomainLNsPackage.DOMAIN_LN_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Group T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_T_OPERATION_COUNT = DomainLNsPackage.DOMAIN_LN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TCTRImpl <em>TCTR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.TCTRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl#getTCTR()
	 * @generated
	 */
	int TCTR = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__MODE = GROUP_T__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__BEHAVIOUR = GROUP_T__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__HEALTH = GROUP_T__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__NAME_PLT = GROUP_T__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__EE_NAME = GROUP_T__EE_NAME;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__EE_HEALTH = GROUP_T__EE_HEALTH;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__OP_TMH = GROUP_T__OP_TMH;

	/**
	 * The feature id for the '<em><b>Hz Rtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__HZ_RTG = GROUP_T__HZ_RTG;

	/**
	 * The feature id for the '<em><b>Rat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__RAT = GROUP_T__RAT;

	/**
	 * The feature id for the '<em><b>Cor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__COR = GROUP_T__COR;

	/**
	 * The feature id for the '<em><b>Ang Cor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__ANG_COR = GROUP_T__ANG_COR;

	/**
	 * The feature id for the '<em><b>Amp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__AMP = GROUP_T_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ARtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR__ARTG = GROUP_T_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR_FEATURE_COUNT = GROUP_T_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCTR_OPERATION_COUNT = GROUP_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TVTRImpl <em>TVTR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.TVTRImpl
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl#getTVTR()
	 * @generated
	 */
	int TVTR = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__MODE = GROUP_T__MODE;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__BEHAVIOUR = GROUP_T__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Health</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__HEALTH = GROUP_T__HEALTH;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__NAME_PLT = GROUP_T__NAME_PLT;

	/**
	 * The feature id for the '<em><b>EE Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__EE_NAME = GROUP_T__EE_NAME;

	/**
	 * The feature id for the '<em><b>EE Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__EE_HEALTH = GROUP_T__EE_HEALTH;

	/**
	 * The feature id for the '<em><b>Op Tmh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__OP_TMH = GROUP_T__OP_TMH;

	/**
	 * The feature id for the '<em><b>Hz Rtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__HZ_RTG = GROUP_T__HZ_RTG;

	/**
	 * The feature id for the '<em><b>Rat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__RAT = GROUP_T__RAT;

	/**
	 * The feature id for the '<em><b>Cor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__COR = GROUP_T__COR;

	/**
	 * The feature id for the '<em><b>Ang Cor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__ANG_COR = GROUP_T__ANG_COR;

	/**
	 * The feature id for the '<em><b>Vol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__VOL = GROUP_T_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fu Fail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__FU_FAIL = GROUP_T_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VRtg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR__VRTG = GROUP_T_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TVTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR_FEATURE_COUNT = GROUP_T_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TVTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVTR_OPERATION_COUNT = GROUP_T_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT <em>Group T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group T</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT
	 * @generated
	 */
	EClass getGroupT();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getEEName <em>EE Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EE Name</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getEEName()
	 * @see #getGroupT()
	 * @generated
	 */
	EReference getGroupT_EEName();

	/**
	 * Returns the meta object for the attribute '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getEEHealth <em>EE Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EE Health</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getEEHealth()
	 * @see #getGroupT()
	 * @generated
	 */
	EAttribute getGroupT_EEHealth();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getOpTmh <em>Op Tmh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Tmh</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getOpTmh()
	 * @see #getGroupT()
	 * @generated
	 */
	EReference getGroupT_OpTmh();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getHzRtg <em>Hz Rtg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hz Rtg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getHzRtg()
	 * @see #getGroupT()
	 * @generated
	 */
	EReference getGroupT_HzRtg();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getRat <em>Rat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rat</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getRat()
	 * @see #getGroupT()
	 * @generated
	 */
	EReference getGroupT_Rat();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getCor <em>Cor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cor</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getCor()
	 * @see #getGroupT()
	 * @generated
	 */
	EReference getGroupT_Cor();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getAngCor <em>Ang Cor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ang Cor</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT#getAngCor()
	 * @see #getGroupT()
	 * @generated
	 */
	EReference getGroupT_AngCor();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TCTR <em>TCTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCTR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TCTR
	 * @generated
	 */
	EClass getTCTR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TCTR#getAmp <em>Amp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amp</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TCTR#getAmp()
	 * @see #getTCTR()
	 * @generated
	 */
	EReference getTCTR_Amp();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TCTR#getARtg <em>ARtg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ARtg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TCTR#getARtg()
	 * @see #getTCTR()
	 * @generated
	 */
	EReference getTCTR_ARtg();

	/**
	 * Returns the meta object for class '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TVTR <em>TVTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVTR</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TVTR
	 * @generated
	 */
	EClass getTVTR();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TVTR#getVol <em>Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vol</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TVTR#getVol()
	 * @see #getTVTR()
	 * @generated
	 */
	EReference getTVTR_Vol();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TVTR#getFuFail <em>Fu Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fu Fail</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TVTR#getFuFail()
	 * @see #getTVTR()
	 * @generated
	 */
	EReference getTVTR_FuFail();

	/**
	 * Returns the meta object for the reference '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TVTR#getVRtg <em>VRtg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VRtg</em>'.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TVTR#getVRtg()
	 * @see #getTVTR()
	 * @generated
	 */
	EReference getTVTR_VRtg();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LNGroupTFactory getLNGroupTFactory();

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
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.GroupTImpl <em>Group T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.GroupTImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl#getGroupT()
		 * @generated
		 */
		EClass GROUP_T = eINSTANCE.getGroupT();

		/**
		 * The meta object literal for the '<em><b>EE Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_T__EE_NAME = eINSTANCE.getGroupT_EEName();

		/**
		 * The meta object literal for the '<em><b>EE Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_T__EE_HEALTH = eINSTANCE.getGroupT_EEHealth();

		/**
		 * The meta object literal for the '<em><b>Op Tmh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_T__OP_TMH = eINSTANCE.getGroupT_OpTmh();

		/**
		 * The meta object literal for the '<em><b>Hz Rtg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_T__HZ_RTG = eINSTANCE.getGroupT_HzRtg();

		/**
		 * The meta object literal for the '<em><b>Rat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_T__RAT = eINSTANCE.getGroupT_Rat();

		/**
		 * The meta object literal for the '<em><b>Cor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_T__COR = eINSTANCE.getGroupT_Cor();

		/**
		 * The meta object literal for the '<em><b>Ang Cor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_T__ANG_COR = eINSTANCE.getGroupT_AngCor();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TCTRImpl <em>TCTR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.TCTRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl#getTCTR()
		 * @generated
		 */
		EClass TCTR = eINSTANCE.getTCTR();

		/**
		 * The meta object literal for the '<em><b>Amp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCTR__AMP = eINSTANCE.getTCTR_Amp();

		/**
		 * The meta object literal for the '<em><b>ARtg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCTR__ARTG = eINSTANCE.getTCTR_ARtg();

		/**
		 * The meta object literal for the '{@link gluemodel.substationStandard.LNNodes.LNGroupT.impl.TVTRImpl <em>TVTR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.TVTRImpl
		 * @see gluemodel.substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl#getTVTR()
		 * @generated
		 */
		EClass TVTR = eINSTANCE.getTVTR();

		/**
		 * The meta object literal for the '<em><b>Vol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVTR__VOL = eINSTANCE.getTVTR_Vol();

		/**
		 * The meta object literal for the '<em><b>Fu Fail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVTR__FU_FAIL = eINSTANCE.getTVTR_FuFail();

		/**
		 * The meta object literal for the '<em><b>VRtg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVTR__VRTG = eINSTANCE.getTVTR_VRtg();

	}

} //LNGroupTPackage
