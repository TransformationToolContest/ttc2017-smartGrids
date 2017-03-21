/**
 */
package substationStandard.LNNodes.LNGroupM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import substationStandard.Dataclasses.DataclassesPackage;

import substationStandard.Dataclasses.impl.DataclassesPackageImpl;

import substationStandard.Enumerations.EnumerationsPackage;

import substationStandard.Enumerations.impl.EnumerationsPackageImpl;

import substationStandard.LNNodes.DomainLNs.DomainLNsPackage;

import substationStandard.LNNodes.DomainLNs.impl.DomainLNsPackageImpl;

import substationStandard.LNNodes.LNGroupA.LNGroupAPackage;

import substationStandard.LNNodes.LNGroupA.impl.LNGroupAPackageImpl;

import substationStandard.LNNodes.LNGroupC.LNGroupCPackage;

import substationStandard.LNNodes.LNGroupC.impl.LNGroupCPackageImpl;

import substationStandard.LNNodes.LNGroupM.GroupM;
import substationStandard.LNNodes.LNGroupM.LNGroupMFactory;
import substationStandard.LNNodes.LNGroupM.LNGroupMPackage;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;

import substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl;

import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;

import substationStandard.LNNodes.LNGroupR.impl.LNGroupRPackageImpl;

import substationStandard.LNNodes.LNGroupT.LNGroupTPackage;

import substationStandard.LNNodes.LNGroupT.impl.LNGroupTPackageImpl;

import substationStandard.LNNodes.LNGroupX.LNGroupXPackage;

import substationStandard.LNNodes.LNGroupX.impl.LNGroupXPackageImpl;

import substationStandard.LNNodes.LNGroupY.LNGroupYPackage;

import substationStandard.LNNodes.LNGroupY.impl.LNGroupYPackageImpl;

import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;

import substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl;

import substationStandard.SubstationStandardPackage;

import substationStandard.impl.SubstationStandardPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LNGroupMPackageImpl extends EPackageImpl implements LNGroupMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mhaiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mhanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmxuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msqiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmtrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmxnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mstaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see substationStandard.LNNodes.LNGroupM.LNGroupMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LNGroupMPackageImpl() {
		super(eNS_URI, LNGroupMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LNGroupMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LNGroupMPackage init() {
		if (isInited) return (LNGroupMPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI);

		// Obtain or create and register package
		LNGroupMPackageImpl theLNGroupMPackage = (LNGroupMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LNGroupMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LNGroupMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SubstationStandardPackageImpl theSubstationStandardPackage = (SubstationStandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) instanceof SubstationStandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) : SubstationStandardPackage.eINSTANCE);
		DomainLNsPackageImpl theDomainLNsPackage = (DomainLNsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) instanceof DomainLNsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) : DomainLNsPackage.eINSTANCE);
		LNGroupPPackageImpl theLNGroupPPackage = (LNGroupPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) instanceof LNGroupPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) : LNGroupPPackage.eINSTANCE);
		LNGroupRPackageImpl theLNGroupRPackage = (LNGroupRPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI) instanceof LNGroupRPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI) : LNGroupRPackage.eINSTANCE);
		LNGroupCPackageImpl theLNGroupCPackage = (LNGroupCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI) instanceof LNGroupCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI) : LNGroupCPackage.eINSTANCE);
		LNGroupAPackageImpl theLNGroupAPackage = (LNGroupAPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI) instanceof LNGroupAPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI) : LNGroupAPackage.eINSTANCE);
		LNGroupXPackageImpl theLNGroupXPackage = (LNGroupXPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI) instanceof LNGroupXPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI) : LNGroupXPackage.eINSTANCE);
		LNGroupTPackageImpl theLNGroupTPackage = (LNGroupTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI) instanceof LNGroupTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI) : LNGroupTPackage.eINSTANCE);
		LNGroupYPackageImpl theLNGroupYPackage = (LNGroupYPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI) instanceof LNGroupYPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI) : LNGroupYPackage.eINSTANCE);
		LNGroupZPackageImpl theLNGroupZPackage = (LNGroupZPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) instanceof LNGroupZPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) : LNGroupZPackage.eINSTANCE);
		DataclassesPackageImpl theDataclassesPackage = (DataclassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) instanceof DataclassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) : DataclassesPackage.eINSTANCE);
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);

		// Create package meta-data objects
		theLNGroupMPackage.createPackageContents();
		theSubstationStandardPackage.createPackageContents();
		theDomainLNsPackage.createPackageContents();
		theLNGroupPPackage.createPackageContents();
		theLNGroupRPackage.createPackageContents();
		theLNGroupCPackage.createPackageContents();
		theLNGroupAPackage.createPackageContents();
		theLNGroupXPackage.createPackageContents();
		theLNGroupTPackage.createPackageContents();
		theLNGroupYPackage.createPackageContents();
		theLNGroupZPackage.createPackageContents();
		theDataclassesPackage.createPackageContents();
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theLNGroupMPackage.initializePackageContents();
		theSubstationStandardPackage.initializePackageContents();
		theDomainLNsPackage.initializePackageContents();
		theLNGroupPPackage.initializePackageContents();
		theLNGroupRPackage.initializePackageContents();
		theLNGroupCPackage.initializePackageContents();
		theLNGroupAPackage.initializePackageContents();
		theLNGroupXPackage.initializePackageContents();
		theLNGroupTPackage.initializePackageContents();
		theLNGroupYPackage.initializePackageContents();
		theLNGroupZPackage.initializePackageContents();
		theDataclassesPackage.initializePackageContents();
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLNGroupMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LNGroupMPackage.eNS_URI, theLNGroupMPackage);
		return theLNGroupMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupM() {
		return groupMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMDIF() {
		return mdifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDIF_OpARem() {
		return (EReference)mdifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDIF_Amp1() {
		return (EReference)mdifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDIF_Amp2() {
		return (EReference)mdifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDIF_Amp3() {
		return (EReference)mdifEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMHAI() {
		return mhaiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_EEName() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_Hz() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HA() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HPhV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HPPV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HW() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HVAr() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HVA() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HRmsA() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HRmsPhV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HRmsPPV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HTuW() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HTsW() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HATm() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HKf() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HTdf() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdA() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdOddA() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdEvnA() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdPhV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdOddPhV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdEvnV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdPPV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdOddPPV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdEvnPPV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HCfPhV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HCfPPV() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HCfA() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HTif() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_HzSet() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_EvTmms() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_NumCyc() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdAVal() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdVVal() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdATmms() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_ThdVTmms() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAI_NomA() {
		return (EReference)mhaiEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMHAI_EEHealth() {
		return (EAttribute)mhaiEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMHAN() {
		return mhanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_EEName() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMHAN_EEHealth() {
		return (EAttribute)mhanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_Hz() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaVol() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaWatt() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaVolAmpr() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaVolAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaRmsAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaRmsVol() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaTuWatt() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaTsWatt() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaAmpTm() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaKFact() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaTdFact() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdOddAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdEvnAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_TddAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_TddOddAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_TddEvnAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdVol() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdOddVol() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdEvnVol() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaCfAmp() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaCfVol() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HaTiFact() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_HzSet() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_EvTmms() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_NumCyc() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdAVal() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdVVal() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdATmms() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_ThdVTmms() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMHAN_NomA() {
		return (EReference)mhanEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMXU() {
		return mmxuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_TotW() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMMXU_EEHealth() {
		return (EAttribute)mmxuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_TotVAr() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_TotVA() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_TotPF() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_Hz() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_PPV() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_PhV() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_A() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_W() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_VAr() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_VA() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_PF() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXU_Z() {
		return (EReference)mmxuEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSQI() {
		return msqiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_EEName() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSQI_EEHealth() {
		return (EAttribute)msqiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_SeqA() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_SeqV() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_DQ0Seq() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_ImbA() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_ImbNgA() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_ImbNgV() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_ImbPPV() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_ImbV() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_ImbZroA() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_ImbZroV() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_MaxImbA() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_MaxImbPPV() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSQI_MaxImbV() {
		return (EReference)msqiEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMTR() {
		return mmtrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMTR_EEName() {
		return (EReference)mmtrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMMTR_EEHealth() {
		return (EAttribute)mmtrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMTR_TotVAh() {
		return (EReference)mmtrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMTR_TotWh() {
		return (EReference)mmtrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMTR_TotVArh() {
		return (EReference)mmtrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMTR_SupWh() {
		return (EReference)mmtrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMTR_SupVArh() {
		return (EReference)mmtrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMTR_DmdWh() {
		return (EReference)mmtrEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMTR_DmdVArh() {
		return (EReference)mmtrEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMXN() {
		return mmxnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_EEName() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMMXN_EEHealth() {
		return (EAttribute)mmxnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_Amp() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_Vol() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_Watt() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_VolAmpr() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_VolAmp() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_PwrFact() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_Imp() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXN_Hz() {
		return (EReference)mmxnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSTA() {
		return mstaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_EEName() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSTA_EEHealth() {
		return (EAttribute)mstaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_AvAmps() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MaxAmps() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MinAmps() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_AvVolts() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MaxVolts() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MinVolts() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_AvVA() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MaxVA() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MinVA() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_AvW() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MaxW() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MinW() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_AvVAr() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MaxVAr() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_MinVAr() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_EvStr() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSTA_EvTmms() {
		return (EReference)mstaEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupMFactory getLNGroupMFactory() {
		return (LNGroupMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		groupMEClass = createEClass(GROUP_M);

		mdifEClass = createEClass(MDIF);
		createEReference(mdifEClass, MDIF__OP_AREM);
		createEReference(mdifEClass, MDIF__AMP1);
		createEReference(mdifEClass, MDIF__AMP2);
		createEReference(mdifEClass, MDIF__AMP3);

		mhaiEClass = createEClass(MHAI);
		createEReference(mhaiEClass, MHAI__EE_NAME);
		createEReference(mhaiEClass, MHAI__HZ);
		createEReference(mhaiEClass, MHAI__HA);
		createEReference(mhaiEClass, MHAI__HPH_V);
		createEReference(mhaiEClass, MHAI__HPPV);
		createEReference(mhaiEClass, MHAI__HW);
		createEReference(mhaiEClass, MHAI__HV_AR);
		createEReference(mhaiEClass, MHAI__HVA);
		createEReference(mhaiEClass, MHAI__HRMS_A);
		createEReference(mhaiEClass, MHAI__HRMS_PH_V);
		createEReference(mhaiEClass, MHAI__HRMS_PPV);
		createEReference(mhaiEClass, MHAI__HTU_W);
		createEReference(mhaiEClass, MHAI__HTS_W);
		createEReference(mhaiEClass, MHAI__HA_TM);
		createEReference(mhaiEClass, MHAI__HKF);
		createEReference(mhaiEClass, MHAI__HTDF);
		createEReference(mhaiEClass, MHAI__THD_A);
		createEReference(mhaiEClass, MHAI__THD_ODD_A);
		createEReference(mhaiEClass, MHAI__THD_EVN_A);
		createEReference(mhaiEClass, MHAI__THD_PH_V);
		createEReference(mhaiEClass, MHAI__THD_ODD_PH_V);
		createEReference(mhaiEClass, MHAI__THD_EVN_V);
		createEReference(mhaiEClass, MHAI__THD_PPV);
		createEReference(mhaiEClass, MHAI__THD_ODD_PPV);
		createEReference(mhaiEClass, MHAI__THD_EVN_PPV);
		createEReference(mhaiEClass, MHAI__HCF_PH_V);
		createEReference(mhaiEClass, MHAI__HCF_PPV);
		createEReference(mhaiEClass, MHAI__HCF_A);
		createEReference(mhaiEClass, MHAI__HTIF);
		createEReference(mhaiEClass, MHAI__HZ_SET);
		createEReference(mhaiEClass, MHAI__EV_TMMS);
		createEReference(mhaiEClass, MHAI__NUM_CYC);
		createEReference(mhaiEClass, MHAI__THD_AVAL);
		createEReference(mhaiEClass, MHAI__THD_VVAL);
		createEReference(mhaiEClass, MHAI__THD_ATMMS);
		createEReference(mhaiEClass, MHAI__THD_VTMMS);
		createEReference(mhaiEClass, MHAI__NOM_A);
		createEAttribute(mhaiEClass, MHAI__EE_HEALTH);

		mhanEClass = createEClass(MHAN);
		createEReference(mhanEClass, MHAN__EE_NAME);
		createEAttribute(mhanEClass, MHAN__EE_HEALTH);
		createEReference(mhanEClass, MHAN__HZ);
		createEReference(mhanEClass, MHAN__HA_AMP);
		createEReference(mhanEClass, MHAN__HA_VOL);
		createEReference(mhanEClass, MHAN__HA_WATT);
		createEReference(mhanEClass, MHAN__HA_VOL_AMPR);
		createEReference(mhanEClass, MHAN__HA_VOL_AMP);
		createEReference(mhanEClass, MHAN__HA_RMS_AMP);
		createEReference(mhanEClass, MHAN__HA_RMS_VOL);
		createEReference(mhanEClass, MHAN__HA_TU_WATT);
		createEReference(mhanEClass, MHAN__HA_TS_WATT);
		createEReference(mhanEClass, MHAN__HA_AMP_TM);
		createEReference(mhanEClass, MHAN__HA_KFACT);
		createEReference(mhanEClass, MHAN__HA_TD_FACT);
		createEReference(mhanEClass, MHAN__THD_AMP);
		createEReference(mhanEClass, MHAN__THD_ODD_AMP);
		createEReference(mhanEClass, MHAN__THD_EVN_AMP);
		createEReference(mhanEClass, MHAN__TDD_AMP);
		createEReference(mhanEClass, MHAN__TDD_ODD_AMP);
		createEReference(mhanEClass, MHAN__TDD_EVN_AMP);
		createEReference(mhanEClass, MHAN__THD_VOL);
		createEReference(mhanEClass, MHAN__THD_ODD_VOL);
		createEReference(mhanEClass, MHAN__THD_EVN_VOL);
		createEReference(mhanEClass, MHAN__HA_CF_AMP);
		createEReference(mhanEClass, MHAN__HA_CF_VOL);
		createEReference(mhanEClass, MHAN__HA_TI_FACT);
		createEReference(mhanEClass, MHAN__HZ_SET);
		createEReference(mhanEClass, MHAN__EV_TMMS);
		createEReference(mhanEClass, MHAN__NUM_CYC);
		createEReference(mhanEClass, MHAN__THD_AVAL);
		createEReference(mhanEClass, MHAN__THD_VVAL);
		createEReference(mhanEClass, MHAN__THD_ATMMS);
		createEReference(mhanEClass, MHAN__THD_VTMMS);
		createEReference(mhanEClass, MHAN__NOM_A);

		mmxuEClass = createEClass(MMXU);
		createEReference(mmxuEClass, MMXU__TOT_W);
		createEAttribute(mmxuEClass, MMXU__EE_HEALTH);
		createEReference(mmxuEClass, MMXU__TOT_VAR);
		createEReference(mmxuEClass, MMXU__TOT_VA);
		createEReference(mmxuEClass, MMXU__TOT_PF);
		createEReference(mmxuEClass, MMXU__HZ);
		createEReference(mmxuEClass, MMXU__PPV);
		createEReference(mmxuEClass, MMXU__PH_V);
		createEReference(mmxuEClass, MMXU__A);
		createEReference(mmxuEClass, MMXU__W);
		createEReference(mmxuEClass, MMXU__VAR);
		createEReference(mmxuEClass, MMXU__VA);
		createEReference(mmxuEClass, MMXU__PF);
		createEReference(mmxuEClass, MMXU__Z);

		msqiEClass = createEClass(MSQI);
		createEReference(msqiEClass, MSQI__EE_NAME);
		createEAttribute(msqiEClass, MSQI__EE_HEALTH);
		createEReference(msqiEClass, MSQI__SEQ_A);
		createEReference(msqiEClass, MSQI__SEQ_V);
		createEReference(msqiEClass, MSQI__DQ0_SEQ);
		createEReference(msqiEClass, MSQI__IMB_A);
		createEReference(msqiEClass, MSQI__IMB_NG_A);
		createEReference(msqiEClass, MSQI__IMB_NG_V);
		createEReference(msqiEClass, MSQI__IMB_PPV);
		createEReference(msqiEClass, MSQI__IMB_V);
		createEReference(msqiEClass, MSQI__IMB_ZRO_A);
		createEReference(msqiEClass, MSQI__IMB_ZRO_V);
		createEReference(msqiEClass, MSQI__MAX_IMB_A);
		createEReference(msqiEClass, MSQI__MAX_IMB_PPV);
		createEReference(msqiEClass, MSQI__MAX_IMB_V);

		mmtrEClass = createEClass(MMTR);
		createEReference(mmtrEClass, MMTR__EE_NAME);
		createEAttribute(mmtrEClass, MMTR__EE_HEALTH);
		createEReference(mmtrEClass, MMTR__TOT_VAH);
		createEReference(mmtrEClass, MMTR__TOT_WH);
		createEReference(mmtrEClass, MMTR__TOT_VARH);
		createEReference(mmtrEClass, MMTR__SUP_WH);
		createEReference(mmtrEClass, MMTR__SUP_VARH);
		createEReference(mmtrEClass, MMTR__DMD_WH);
		createEReference(mmtrEClass, MMTR__DMD_VARH);

		mmxnEClass = createEClass(MMXN);
		createEReference(mmxnEClass, MMXN__EE_NAME);
		createEAttribute(mmxnEClass, MMXN__EE_HEALTH);
		createEReference(mmxnEClass, MMXN__AMP);
		createEReference(mmxnEClass, MMXN__VOL);
		createEReference(mmxnEClass, MMXN__WATT);
		createEReference(mmxnEClass, MMXN__VOL_AMPR);
		createEReference(mmxnEClass, MMXN__VOL_AMP);
		createEReference(mmxnEClass, MMXN__PWR_FACT);
		createEReference(mmxnEClass, MMXN__IMP);
		createEReference(mmxnEClass, MMXN__HZ);

		mstaEClass = createEClass(MSTA);
		createEReference(mstaEClass, MSTA__EE_NAME);
		createEAttribute(mstaEClass, MSTA__EE_HEALTH);
		createEReference(mstaEClass, MSTA__AV_AMPS);
		createEReference(mstaEClass, MSTA__MAX_AMPS);
		createEReference(mstaEClass, MSTA__MIN_AMPS);
		createEReference(mstaEClass, MSTA__AV_VOLTS);
		createEReference(mstaEClass, MSTA__MAX_VOLTS);
		createEReference(mstaEClass, MSTA__MIN_VOLTS);
		createEReference(mstaEClass, MSTA__AV_VA);
		createEReference(mstaEClass, MSTA__MAX_VA);
		createEReference(mstaEClass, MSTA__MIN_VA);
		createEReference(mstaEClass, MSTA__AV_W);
		createEReference(mstaEClass, MSTA__MAX_W);
		createEReference(mstaEClass, MSTA__MIN_W);
		createEReference(mstaEClass, MSTA__AV_VAR);
		createEReference(mstaEClass, MSTA__MAX_VAR);
		createEReference(mstaEClass, MSTA__MIN_VAR);
		createEReference(mstaEClass, MSTA__EV_STR);
		createEReference(mstaEClass, MSTA__EV_TMMS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DomainLNsPackage theDomainLNsPackage = (DomainLNsPackage)EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI);
		DataclassesPackage theDataclassesPackage = (DataclassesPackage)EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI);
		EnumerationsPackage theEnumerationsPackage = (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groupMEClass.getESuperTypes().add(theDomainLNsPackage.getDomainLN());
		mdifEClass.getESuperTypes().add(this.getGroupM());
		mhaiEClass.getESuperTypes().add(this.getGroupM());
		mhanEClass.getESuperTypes().add(this.getGroupM());
		mmxuEClass.getESuperTypes().add(this.getGroupM());
		msqiEClass.getESuperTypes().add(this.getGroupM());
		mmtrEClass.getESuperTypes().add(this.getGroupM());
		mmxnEClass.getESuperTypes().add(this.getGroupM());
		mstaEClass.getESuperTypes().add(this.getGroupM());

		// Initialize classes, features, and operations; add parameters
		initEClass(groupMEClass, GroupM.class, "GroupM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mdifEClass, substationStandard.LNNodes.LNGroupM.MDIF.class, "MDIF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDIF_OpARem(), theDataclassesPackage.getWYE(), null, "OpARem", null, 1, 1, substationStandard.LNNodes.LNGroupM.MDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDIF_Amp1(), theDataclassesPackage.getSAV(), null, "Amp1", null, 1, 1, substationStandard.LNNodes.LNGroupM.MDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDIF_Amp2(), theDataclassesPackage.getSAV(), null, "Amp2", null, 1, 1, substationStandard.LNNodes.LNGroupM.MDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDIF_Amp3(), theDataclassesPackage.getSAV(), null, "Amp3", null, 1, 1, substationStandard.LNNodes.LNGroupM.MDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mhaiEClass, substationStandard.LNNodes.LNGroupM.MHAI.class, "MHAI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMHAI_EEName(), theDataclassesPackage.getDPL(), null, "EEName", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_Hz(), theDataclassesPackage.getMV(), null, "Hz", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HA(), theDataclassesPackage.getHYWE(), null, "HA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HPhV(), theDataclassesPackage.getHYWE(), null, "HPhV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HPPV(), theDataclassesPackage.getHDEL(), null, "HPPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HW(), theDataclassesPackage.getHYWE(), null, "HW", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HVAr(), theDataclassesPackage.getHYWE(), null, "HVAr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HVA(), theDataclassesPackage.getHYWE(), null, "HVA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HRmsA(), theDataclassesPackage.getWYE(), null, "HRmsA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HRmsPhV(), theDataclassesPackage.getWYE(), null, "HRmsPhV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HRmsPPV(), theDataclassesPackage.getDEL(), null, "HRmsPPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HTuW(), theDataclassesPackage.getWYE(), null, "HTuW", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HTsW(), theDataclassesPackage.getWYE(), null, "HTsW", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HATm(), theDataclassesPackage.getWYE(), null, "HATm", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HKf(), theDataclassesPackage.getWYE(), null, "HKf", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HTdf(), theDataclassesPackage.getWYE(), null, "HTdf", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdA(), theDataclassesPackage.getWYE(), null, "ThdA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdOddA(), theDataclassesPackage.getWYE(), null, "ThdOddA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdEvnA(), theDataclassesPackage.getWYE(), null, "ThdEvnA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdPhV(), theDataclassesPackage.getWYE(), null, "ThdPhV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdOddPhV(), theDataclassesPackage.getWYE(), null, "ThdOddPhV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdEvnV(), theDataclassesPackage.getWYE(), null, "ThdEvnV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdPPV(), theDataclassesPackage.getDEL(), null, "ThdPPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdOddPPV(), theDataclassesPackage.getDEL(), null, "ThdOddPPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdEvnPPV(), theDataclassesPackage.getDEL(), null, "ThdEvnPPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HCfPhV(), theDataclassesPackage.getWYE(), null, "HCfPhV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HCfPPV(), theDataclassesPackage.getDEL(), null, "HCfPPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HCfA(), theDataclassesPackage.getWYE(), null, "HCfA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HTif(), theDataclassesPackage.getWYE(), null, "HTif", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_HzSet(), theDataclassesPackage.getASG(), null, "HzSet", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_EvTmms(), theDataclassesPackage.getASG(), null, "EvTmms", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_NumCyc(), theDataclassesPackage.getING(), null, "NumCyc", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdAVal(), theDataclassesPackage.getASG(), null, "ThdAVal", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdVVal(), theDataclassesPackage.getASG(), null, "ThdVVal", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdATmms(), theDataclassesPackage.getING(), null, "ThdATmms", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_ThdVTmms(), theDataclassesPackage.getING(), null, "ThdVTmms", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAI_NomA(), theDataclassesPackage.getASG(), null, "NomA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMHAI_EEHealth(), theEnumerationsPackage.getHealthStateKind(), "EEHealth", null, 0, 1, substationStandard.LNNodes.LNGroupM.MHAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mhanEClass, substationStandard.LNNodes.LNGroupM.MHAN.class, "MHAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMHAN_EEName(), theDataclassesPackage.getDPL(), null, "EEName", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMHAN_EEHealth(), theEnumerationsPackage.getHealthStateKind(), "EEHealth", null, 0, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_Hz(), theDataclassesPackage.getMV(), null, "Hz", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaAmp(), theDataclassesPackage.getHMV(), null, "HaAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaVol(), theDataclassesPackage.getHMV(), null, "HaVol", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaWatt(), theDataclassesPackage.getHMV(), null, "HaWatt", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaVolAmpr(), theDataclassesPackage.getHMV(), null, "HaVolAmpr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaVolAmp(), theDataclassesPackage.getHMV(), null, "HaVolAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaRmsAmp(), theDataclassesPackage.getMV(), null, "HaRmsAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaRmsVol(), theDataclassesPackage.getMV(), null, "HaRmsVol", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaTuWatt(), theDataclassesPackage.getMV(), null, "HaTuWatt", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaTsWatt(), theDataclassesPackage.getMV(), null, "HaTsWatt", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaAmpTm(), theDataclassesPackage.getMV(), null, "HaAmpTm", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaKFact(), theDataclassesPackage.getMV(), null, "HaKFact", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaTdFact(), theDataclassesPackage.getMV(), null, "HaTdFact", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdAmp(), theDataclassesPackage.getMV(), null, "ThdAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdOddAmp(), theDataclassesPackage.getMV(), null, "ThdOddAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdEvnAmp(), theDataclassesPackage.getMV(), null, "ThdEvnAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_TddAmp(), theDataclassesPackage.getMV(), null, "TddAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_TddOddAmp(), theDataclassesPackage.getMV(), null, "TddOddAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_TddEvnAmp(), theDataclassesPackage.getMV(), null, "TddEvnAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdVol(), theDataclassesPackage.getMV(), null, "ThdVol", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdOddVol(), theDataclassesPackage.getMV(), null, "ThdOddVol", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdEvnVol(), theDataclassesPackage.getMV(), null, "ThdEvnVol", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaCfAmp(), theDataclassesPackage.getMV(), null, "HaCfAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaCfVol(), theDataclassesPackage.getMV(), null, "HaCfVol", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HaTiFact(), theDataclassesPackage.getMV(), null, "HaTiFact", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_HzSet(), theDataclassesPackage.getASG(), null, "HzSet", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_EvTmms(), theDataclassesPackage.getASG(), null, "EvTmms", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_NumCyc(), theDataclassesPackage.getING(), null, "NumCyc", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdAVal(), theDataclassesPackage.getASG(), null, "ThdAVal", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdVVal(), theDataclassesPackage.getASG(), null, "ThdVVal", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdATmms(), theDataclassesPackage.getING(), null, "ThdATmms", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_ThdVTmms(), theDataclassesPackage.getING(), null, "ThdVTmms", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMHAN_NomA(), theDataclassesPackage.getASG(), null, "NomA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MHAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmxuEClass, substationStandard.LNNodes.LNGroupM.MMXU.class, "MMXU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMXU_TotW(), theDataclassesPackage.getMV(), null, "TotW", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMXU_EEHealth(), theEnumerationsPackage.getHealthStateKind(), "EEHealth", null, 0, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_TotVAr(), theDataclassesPackage.getMV(), null, "TotVAr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_TotVA(), theDataclassesPackage.getMV(), null, "TotVA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_TotPF(), theDataclassesPackage.getMV(), null, "TotPF", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_Hz(), theDataclassesPackage.getMV(), null, "Hz", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_PPV(), theDataclassesPackage.getDEL(), null, "PPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_PhV(), theDataclassesPackage.getWYE(), null, "PhV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_A(), theDataclassesPackage.getWYE(), null, "A", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_W(), theDataclassesPackage.getWYE(), null, "W", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_VAr(), theDataclassesPackage.getWYE(), null, "VAr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_VA(), theDataclassesPackage.getWYE(), null, "VA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_PF(), theDataclassesPackage.getWYE(), null, "PF", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXU_Z(), theDataclassesPackage.getWYE(), null, "Z", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msqiEClass, substationStandard.LNNodes.LNGroupM.MSQI.class, "MSQI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSQI_EEName(), theDataclassesPackage.getDPL(), null, "EEName", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSQI_EEHealth(), theEnumerationsPackage.getHealthStateKind(), "EEHealth", null, 0, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_SeqA(), theDataclassesPackage.getSEQ(), null, "SeqA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_SeqV(), theDataclassesPackage.getSEQ(), null, "SeqV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_DQ0Seq(), theDataclassesPackage.getSEQ(), null, "DQ0Seq", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_ImbA(), theDataclassesPackage.getWYE(), null, "ImbA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_ImbNgA(), theDataclassesPackage.getMV(), null, "ImbNgA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_ImbNgV(), theDataclassesPackage.getMV(), null, "ImbNgV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_ImbPPV(), theDataclassesPackage.getDEL(), null, "ImbPPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_ImbV(), theDataclassesPackage.getMV(), null, "ImbV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_ImbZroA(), theDataclassesPackage.getMV(), null, "ImbZroA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_ImbZroV(), theDataclassesPackage.getMV(), null, "ImbZroV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_MaxImbA(), theDataclassesPackage.getWYE(), null, "MaxImbA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_MaxImbPPV(), theDataclassesPackage.getWYE(), null, "MaxImbPPV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSQI_MaxImbV(), theDataclassesPackage.getWYE(), null, "MaxImbV", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSQI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmtrEClass, substationStandard.LNNodes.LNGroupM.MMTR.class, "MMTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMTR_EEName(), theDataclassesPackage.getDPL(), null, "EEName", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMTR_EEHealth(), theEnumerationsPackage.getHealthStateKind(), "EEHealth", null, 0, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMTR_TotVAh(), theDataclassesPackage.getBCR(), null, "TotVAh", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMTR_TotWh(), theDataclassesPackage.getBCR(), null, "TotWh", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMTR_TotVArh(), theDataclassesPackage.getBCR(), null, "TotVArh", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMTR_SupWh(), theDataclassesPackage.getBCR(), null, "SupWh", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMTR_SupVArh(), theDataclassesPackage.getBCR(), null, "SupVArh", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMTR_DmdWh(), theDataclassesPackage.getBCR(), null, "DmdWh", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMTR_DmdVArh(), theDataclassesPackage.getBCR(), null, "DmdVArh", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmxnEClass, substationStandard.LNNodes.LNGroupM.MMXN.class, "MMXN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMXN_EEName(), theDataclassesPackage.getDPL(), null, "EEName", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMXN_EEHealth(), theEnumerationsPackage.getHealthStateKind(), "EEHealth", null, 0, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXN_Amp(), theDataclassesPackage.getMV(), null, "Amp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXN_Vol(), theDataclassesPackage.getMV(), null, "Vol", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXN_Watt(), theDataclassesPackage.getMV(), null, "Watt", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXN_VolAmpr(), theDataclassesPackage.getMV(), null, "VolAmpr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXN_VolAmp(), theDataclassesPackage.getMV(), null, "VolAmp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXN_PwrFact(), theDataclassesPackage.getMV(), null, "PwrFact", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXN_Imp(), theDataclassesPackage.getCMV(), null, "Imp", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMXN_Hz(), theDataclassesPackage.getMV(), null, "Hz", null, 1, 1, substationStandard.LNNodes.LNGroupM.MMXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mstaEClass, substationStandard.LNNodes.LNGroupM.MSTA.class, "MSTA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSTA_EEName(), theDataclassesPackage.getDPL(), null, "EEName", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMSTA_EEHealth(), theEnumerationsPackage.getHealthStateKind(), "EEHealth", null, 0, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_AvAmps(), theDataclassesPackage.getMV(), null, "AvAmps", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MaxAmps(), theDataclassesPackage.getMV(), null, "MaxAmps", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MinAmps(), theDataclassesPackage.getMV(), null, "MinAmps", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_AvVolts(), theDataclassesPackage.getMV(), null, "AvVolts", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MaxVolts(), theDataclassesPackage.getMV(), null, "MaxVolts", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MinVolts(), theDataclassesPackage.getMV(), null, "MinVolts", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_AvVA(), theDataclassesPackage.getMV(), null, "AvVA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MaxVA(), theDataclassesPackage.getMV(), null, "MaxVA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MinVA(), theDataclassesPackage.getMV(), null, "MinVA", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_AvW(), theDataclassesPackage.getMV(), null, "AvW", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MaxW(), theDataclassesPackage.getMV(), null, "MaxW", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MinW(), theDataclassesPackage.getMV(), null, "MinW", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_AvVAr(), theDataclassesPackage.getMV(), null, "AvVAr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MaxVAr(), theDataclassesPackage.getMV(), null, "MaxVAr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_MinVAr(), theDataclassesPackage.getMV(), null, "MinVAr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_EvStr(), theDataclassesPackage.getSPC(), null, "EvStr", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSTA_EvTmms(), theDataclassesPackage.getASG(), null, "EvTmms", null, 1, 1, substationStandard.LNNodes.LNGroupM.MSTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //LNGroupMPackageImpl
