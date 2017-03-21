/**
 */
package substationStandard;

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
 * @see substationStandard.SubstationStandardFactory
 * @model kind="package"
 * @generated
 */
public interface SubstationStandardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "substationStandard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.transformation-tool-contest.eu/2017/smartGrids/substationStandard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sub";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubstationStandardPackage eINSTANCE = substationStandard.impl.SubstationStandardPackageImpl.init();

	/**
	 * The meta object id for the '{@link substationStandard.impl.SubstandardImpl <em>Substandard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see substationStandard.impl.SubstandardImpl
	 * @see substationStandard.impl.SubstationStandardPackageImpl#getSubstandard()
	 * @generated
	 */
	int SUBSTANDARD = 0;

	/**
	 * The feature id for the '<em><b>LN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__LN = 0;

	/**
	 * The feature id for the '<em><b>Name Plt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__NAME_PLT = 1;

	/**
	 * The feature id for the '<em><b>LPL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__LPL = 2;

	/**
	 * The feature id for the '<em><b>DPC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__DPC = 3;

	/**
	 * The feature id for the '<em><b>ACT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__ACT = 4;

	/**
	 * The feature id for the '<em><b>SPS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__SPS = 5;

	/**
	 * The feature id for the '<em><b>BSC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__BSC = 6;

	/**
	 * The feature id for the '<em><b>ISC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__ISC = 7;

	/**
	 * The feature id for the '<em><b>SPC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__SPC = 8;

	/**
	 * The feature id for the '<em><b>MV</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__MV = 9;

	/**
	 * The feature id for the '<em><b>INS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__INS = 10;

	/**
	 * The feature id for the '<em><b>ASG</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__ASG = 11;

	/**
	 * The feature id for the '<em><b>WYE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__WYE = 12;

	/**
	 * The feature id for the '<em><b>DP Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__DP_STATUS = 13;

	/**
	 * The feature id for the '<em><b>Analogue Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__ANALOGUE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>CMV</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__CMV = 15;

	/**
	 * The feature id for the '<em><b>Val With Trans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__VAL_WITH_TRANS = 16;

	/**
	 * The feature id for the '<em><b>BS Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__BS_CONTROL = 17;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD__VECTOR = 18;

	/**
	 * The number of structural features of the '<em>Substandard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Substandard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANDARD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link substationStandard.Substandard <em>Substandard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substandard</em>'.
	 * @see substationStandard.Substandard
	 * @generated
	 */
	EClass getSubstandard();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getLN <em>LN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LN</em>'.
	 * @see substationStandard.Substandard#getLN()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_LN();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getNamePlt <em>Name Plt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Plt</em>'.
	 * @see substationStandard.Substandard#getNamePlt()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_NamePlt();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getLPL <em>LPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LPL</em>'.
	 * @see substationStandard.Substandard#getLPL()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_LPL();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getDPC <em>DPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DPC</em>'.
	 * @see substationStandard.Substandard#getDPC()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_DPC();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getACT <em>ACT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ACT</em>'.
	 * @see substationStandard.Substandard#getACT()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_ACT();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getSPS <em>SPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPS</em>'.
	 * @see substationStandard.Substandard#getSPS()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_SPS();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getBSC <em>BSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BSC</em>'.
	 * @see substationStandard.Substandard#getBSC()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_BSC();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getISC <em>ISC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ISC</em>'.
	 * @see substationStandard.Substandard#getISC()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_ISC();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getSPC <em>SPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPC</em>'.
	 * @see substationStandard.Substandard#getSPC()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_SPC();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getMV <em>MV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MV</em>'.
	 * @see substationStandard.Substandard#getMV()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_MV();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getINS <em>INS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>INS</em>'.
	 * @see substationStandard.Substandard#getINS()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_INS();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getASG <em>ASG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ASG</em>'.
	 * @see substationStandard.Substandard#getASG()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_ASG();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getWYE <em>WYE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>WYE</em>'.
	 * @see substationStandard.Substandard#getWYE()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_WYE();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getDPStatus <em>DP Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DP Status</em>'.
	 * @see substationStandard.Substandard#getDPStatus()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_DPStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getAnalogueValue <em>Analogue Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analogue Value</em>'.
	 * @see substationStandard.Substandard#getAnalogueValue()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_AnalogueValue();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getCMV <em>CMV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CMV</em>'.
	 * @see substationStandard.Substandard#getCMV()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_CMV();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getValWithTrans <em>Val With Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Val With Trans</em>'.
	 * @see substationStandard.Substandard#getValWithTrans()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_ValWithTrans();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getBSControl <em>BS Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BS Control</em>'.
	 * @see substationStandard.Substandard#getBSControl()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_BSControl();

	/**
	 * Returns the meta object for the containment reference list '{@link substationStandard.Substandard#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vector</em>'.
	 * @see substationStandard.Substandard#getVector()
	 * @see #getSubstandard()
	 * @generated
	 */
	EReference getSubstandard_Vector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubstationStandardFactory getSubstationStandardFactory();

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
		 * The meta object literal for the '{@link substationStandard.impl.SubstandardImpl <em>Substandard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see substationStandard.impl.SubstandardImpl
		 * @see substationStandard.impl.SubstationStandardPackageImpl#getSubstandard()
		 * @generated
		 */
		EClass SUBSTANDARD = eINSTANCE.getSubstandard();

		/**
		 * The meta object literal for the '<em><b>LN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__LN = eINSTANCE.getSubstandard_LN();

		/**
		 * The meta object literal for the '<em><b>Name Plt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__NAME_PLT = eINSTANCE.getSubstandard_NamePlt();

		/**
		 * The meta object literal for the '<em><b>LPL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__LPL = eINSTANCE.getSubstandard_LPL();

		/**
		 * The meta object literal for the '<em><b>DPC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__DPC = eINSTANCE.getSubstandard_DPC();

		/**
		 * The meta object literal for the '<em><b>ACT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__ACT = eINSTANCE.getSubstandard_ACT();

		/**
		 * The meta object literal for the '<em><b>SPS</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__SPS = eINSTANCE.getSubstandard_SPS();

		/**
		 * The meta object literal for the '<em><b>BSC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__BSC = eINSTANCE.getSubstandard_BSC();

		/**
		 * The meta object literal for the '<em><b>ISC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__ISC = eINSTANCE.getSubstandard_ISC();

		/**
		 * The meta object literal for the '<em><b>SPC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__SPC = eINSTANCE.getSubstandard_SPC();

		/**
		 * The meta object literal for the '<em><b>MV</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__MV = eINSTANCE.getSubstandard_MV();

		/**
		 * The meta object literal for the '<em><b>INS</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__INS = eINSTANCE.getSubstandard_INS();

		/**
		 * The meta object literal for the '<em><b>ASG</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__ASG = eINSTANCE.getSubstandard_ASG();

		/**
		 * The meta object literal for the '<em><b>WYE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__WYE = eINSTANCE.getSubstandard_WYE();

		/**
		 * The meta object literal for the '<em><b>DP Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__DP_STATUS = eINSTANCE.getSubstandard_DPStatus();

		/**
		 * The meta object literal for the '<em><b>Analogue Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__ANALOGUE_VALUE = eINSTANCE.getSubstandard_AnalogueValue();

		/**
		 * The meta object literal for the '<em><b>CMV</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__CMV = eINSTANCE.getSubstandard_CMV();

		/**
		 * The meta object literal for the '<em><b>Val With Trans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__VAL_WITH_TRANS = eINSTANCE.getSubstandard_ValWithTrans();

		/**
		 * The meta object literal for the '<em><b>BS Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__BS_CONTROL = eINSTANCE.getSubstandard_BSControl();

		/**
		 * The meta object literal for the '<em><b>Vector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANDARD__VECTOR = eINSTANCE.getSubstandard_Vector();

	}

} //SubstationStandardPackage
