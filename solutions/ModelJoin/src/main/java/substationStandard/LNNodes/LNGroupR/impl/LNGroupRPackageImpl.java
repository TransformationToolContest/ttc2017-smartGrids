/**
 */
package substationStandard.LNNodes.LNGroupR.impl;

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

import substationStandard.LNNodes.LNGroupM.LNGroupMPackage;

import substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl;

import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;

import substationStandard.LNNodes.LNGroupP.impl.LNGroupPPackageImpl;

import substationStandard.LNNodes.LNGroupR.GroupR;
import substationStandard.LNNodes.LNGroupR.LNGroupRFactory;
import substationStandard.LNNodes.LNGroupR.LNGroupRPackage;

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
public class LNGroupRPackageImpl extends EPackageImpl implements LNGroupRPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdrsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpsbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbrfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbdrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rfloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rrecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsynEClass = null;

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
	 * @see substationStandard.LNNodes.LNGroupR.LNGroupRPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LNGroupRPackageImpl() {
		super(eNS_URI, LNGroupRFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LNGroupRPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LNGroupRPackage init() {
		if (isInited) return (LNGroupRPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI);

		// Obtain or create and register package
		LNGroupRPackageImpl theLNGroupRPackage = (LNGroupRPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LNGroupRPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LNGroupRPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SubstationStandardPackageImpl theSubstationStandardPackage = (SubstationStandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) instanceof SubstationStandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) : SubstationStandardPackage.eINSTANCE);
		DomainLNsPackageImpl theDomainLNsPackage = (DomainLNsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) instanceof DomainLNsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) : DomainLNsPackage.eINSTANCE);
		LNGroupPPackageImpl theLNGroupPPackage = (LNGroupPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) instanceof LNGroupPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) : LNGroupPPackage.eINSTANCE);
		LNGroupCPackageImpl theLNGroupCPackage = (LNGroupCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI) instanceof LNGroupCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI) : LNGroupCPackage.eINSTANCE);
		LNGroupAPackageImpl theLNGroupAPackage = (LNGroupAPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI) instanceof LNGroupAPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI) : LNGroupAPackage.eINSTANCE);
		LNGroupMPackageImpl theLNGroupMPackage = (LNGroupMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI) instanceof LNGroupMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI) : LNGroupMPackage.eINSTANCE);
		LNGroupXPackageImpl theLNGroupXPackage = (LNGroupXPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI) instanceof LNGroupXPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI) : LNGroupXPackage.eINSTANCE);
		LNGroupTPackageImpl theLNGroupTPackage = (LNGroupTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI) instanceof LNGroupTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI) : LNGroupTPackage.eINSTANCE);
		LNGroupYPackageImpl theLNGroupYPackage = (LNGroupYPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI) instanceof LNGroupYPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI) : LNGroupYPackage.eINSTANCE);
		LNGroupZPackageImpl theLNGroupZPackage = (LNGroupZPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) instanceof LNGroupZPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) : LNGroupZPackage.eINSTANCE);
		DataclassesPackageImpl theDataclassesPackage = (DataclassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) instanceof DataclassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) : DataclassesPackage.eINSTANCE);
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);

		// Create package meta-data objects
		theLNGroupRPackage.createPackageContents();
		theSubstationStandardPackage.createPackageContents();
		theDomainLNsPackage.createPackageContents();
		theLNGroupPPackage.createPackageContents();
		theLNGroupCPackage.createPackageContents();
		theLNGroupAPackage.createPackageContents();
		theLNGroupMPackage.createPackageContents();
		theLNGroupXPackage.createPackageContents();
		theLNGroupTPackage.createPackageContents();
		theLNGroupYPackage.createPackageContents();
		theLNGroupZPackage.createPackageContents();
		theDataclassesPackage.createPackageContents();
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theLNGroupRPackage.initializePackageContents();
		theSubstationStandardPackage.initializePackageContents();
		theDomainLNsPackage.initializePackageContents();
		theLNGroupPPackage.initializePackageContents();
		theLNGroupCPackage.initializePackageContents();
		theLNGroupAPackage.initializePackageContents();
		theLNGroupMPackage.initializePackageContents();
		theLNGroupXPackage.initializePackageContents();
		theLNGroupTPackage.initializePackageContents();
		theLNGroupYPackage.initializePackageContents();
		theLNGroupZPackage.initializePackageContents();
		theDataclassesPackage.initializePackageContents();
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLNGroupRPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LNGroupRPackage.eNS_URI, theLNGroupRPackage);
		return theLNGroupRPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupR() {
		return groupREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDRE() {
		return rdreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_OpCntRs() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_RcdTrg() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_MemRs() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_MemClr() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_RcdMade() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_FltNum() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_GriFltNum() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_RcdStr() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_MemUsed() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_TrgMod() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_LevMod() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_PreTmms() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_PstTmms() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_MemFull() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_MaxNumRcd() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_ReTrgMod() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_PerTrgTms() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_ExclTmms() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRE_OpMod() {
		return (EReference)rdreEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDRS() {
		return rdrsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRS_AutoUpLod() {
		return (EReference)rdrsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDRS_DltRcd() {
		return (EReference)rdrsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPSB() {
		return rpsbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_OpCntRs() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_Str() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_Op() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_BlkZn() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_ZeroEna() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_NgEna() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_MaxEna() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_SwgVal() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_SwgRis() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_SwgReact() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_SwgTmms() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_UnBlkTmms() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_MaxNumSlp() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPSB_EvTmms() {
		return (EReference)rpsbEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBRF() {
		return rbrfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_OpCntRs() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_Str() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_OpEx() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_OpIn() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_FailMod() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_FailTmms() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_SPlTrTmms() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_TPTrTmms() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_DetValA() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBRF_ReTrMod() {
		return (EReference)rbrfEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRADR() {
		return radrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_OpCntRs() {
		return (EReference)radrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_ChTrg() {
		return (EReference)radrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_ChNum() {
		return (EReference)radrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_TrGMod() {
		return (EReference)radrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_LevMod() {
		return (EReference)radrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_HiTrgLev() {
		return (EReference)radrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_LoTrgLev() {
		return (EReference)radrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_PreTmms() {
		return (EReference)radrEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRADR_PstTmms() {
		return (EReference)radrEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBDR() {
		return rbdrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBDR_OpCntRs() {
		return (EReference)rbdrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBDR_ChTrg() {
		return (EReference)rbdrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBDR_ChNum() {
		return (EReference)rbdrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBDR_TrgMod() {
		return (EReference)rbdrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBDR_LevMod() {
		return (EReference)rbdrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBDR_PreTmms() {
		return (EReference)rbdrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBDR_PstTmms() {
		return (EReference)rbdrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDIR() {
		return rdirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_Dir() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_ChrAng() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_MinFwdAng() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_MinRvAng() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_MaxFwdAng() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_MaxRvAng() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_BlkValA() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_BlkValV() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_PolQty() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDIR_MinPPV() {
		return (EReference)rdirEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRFLO() {
		return rfloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_OpCntRs() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_FltZ() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_FltDiskm() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_FltLoop() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_LinLenKm() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_R1() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_X1() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_R0() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_X0() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_Z1Mod() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_Z1Ang() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_Z0Mod() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_Z0Ang() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_Rm0() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_Xm0() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_Zm0Mod() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRFLO_Zm0Ang() {
		return (EReference)rfloEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRREC() {
		return rrecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_OpCntRs() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_BlkRec() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_ChkRec() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_Auto() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_Op() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_AutoRecSt() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_Rec1Tmms() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_Rec2Tmms() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_Rec3Tmms() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_PlsTmms() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRREC_RclTmms() {
		return (EReference)rrecEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSYN() {
		return rsynEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_RHz() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_LHz() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_RV() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_LV() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_Rel() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_Vlnd() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_AngInd() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_HzInd() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_SynPrg() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_DifVClc() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_DifAngClc() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_DifV() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_DifHz() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_DifAng() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_LivDeaMod() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_DeaLinVal() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_LivLinVal() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_DeaBusVal() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_PlsTmms() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSYN_BkrTmms() {
		return (EReference)rsynEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupRFactory getLNGroupRFactory() {
		return (LNGroupRFactory)getEFactoryInstance();
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
		groupREClass = createEClass(GROUP_R);

		rdreEClass = createEClass(RDRE);
		createEReference(rdreEClass, RDRE__OP_CNT_RS);
		createEReference(rdreEClass, RDRE__RCD_TRG);
		createEReference(rdreEClass, RDRE__MEM_RS);
		createEReference(rdreEClass, RDRE__MEM_CLR);
		createEReference(rdreEClass, RDRE__RCD_MADE);
		createEReference(rdreEClass, RDRE__FLT_NUM);
		createEReference(rdreEClass, RDRE__GRI_FLT_NUM);
		createEReference(rdreEClass, RDRE__RCD_STR);
		createEReference(rdreEClass, RDRE__MEM_USED);
		createEReference(rdreEClass, RDRE__TRG_MOD);
		createEReference(rdreEClass, RDRE__LEV_MOD);
		createEReference(rdreEClass, RDRE__PRE_TMMS);
		createEReference(rdreEClass, RDRE__PST_TMMS);
		createEReference(rdreEClass, RDRE__MEM_FULL);
		createEReference(rdreEClass, RDRE__MAX_NUM_RCD);
		createEReference(rdreEClass, RDRE__RE_TRG_MOD);
		createEReference(rdreEClass, RDRE__PER_TRG_TMS);
		createEReference(rdreEClass, RDRE__EXCL_TMMS);
		createEReference(rdreEClass, RDRE__OP_MOD);

		rdrsEClass = createEClass(RDRS);
		createEReference(rdrsEClass, RDRS__AUTO_UP_LOD);
		createEReference(rdrsEClass, RDRS__DLT_RCD);

		rpsbEClass = createEClass(RPSB);
		createEReference(rpsbEClass, RPSB__OP_CNT_RS);
		createEReference(rpsbEClass, RPSB__STR);
		createEReference(rpsbEClass, RPSB__OP);
		createEReference(rpsbEClass, RPSB__BLK_ZN);
		createEReference(rpsbEClass, RPSB__ZERO_ENA);
		createEReference(rpsbEClass, RPSB__NG_ENA);
		createEReference(rpsbEClass, RPSB__MAX_ENA);
		createEReference(rpsbEClass, RPSB__SWG_VAL);
		createEReference(rpsbEClass, RPSB__SWG_RIS);
		createEReference(rpsbEClass, RPSB__SWG_REACT);
		createEReference(rpsbEClass, RPSB__SWG_TMMS);
		createEReference(rpsbEClass, RPSB__UN_BLK_TMMS);
		createEReference(rpsbEClass, RPSB__MAX_NUM_SLP);
		createEReference(rpsbEClass, RPSB__EV_TMMS);

		rbrfEClass = createEClass(RBRF);
		createEReference(rbrfEClass, RBRF__OP_CNT_RS);
		createEReference(rbrfEClass, RBRF__STR);
		createEReference(rbrfEClass, RBRF__OP_EX);
		createEReference(rbrfEClass, RBRF__OP_IN);
		createEReference(rbrfEClass, RBRF__FAIL_MOD);
		createEReference(rbrfEClass, RBRF__FAIL_TMMS);
		createEReference(rbrfEClass, RBRF__SPL_TR_TMMS);
		createEReference(rbrfEClass, RBRF__TP_TR_TMMS);
		createEReference(rbrfEClass, RBRF__DET_VAL_A);
		createEReference(rbrfEClass, RBRF__RE_TR_MOD);

		radrEClass = createEClass(RADR);
		createEReference(radrEClass, RADR__OP_CNT_RS);
		createEReference(radrEClass, RADR__CH_TRG);
		createEReference(radrEClass, RADR__CH_NUM);
		createEReference(radrEClass, RADR__TR_GMOD);
		createEReference(radrEClass, RADR__LEV_MOD);
		createEReference(radrEClass, RADR__HI_TRG_LEV);
		createEReference(radrEClass, RADR__LO_TRG_LEV);
		createEReference(radrEClass, RADR__PRE_TMMS);
		createEReference(radrEClass, RADR__PST_TMMS);

		rbdrEClass = createEClass(RBDR);
		createEReference(rbdrEClass, RBDR__OP_CNT_RS);
		createEReference(rbdrEClass, RBDR__CH_TRG);
		createEReference(rbdrEClass, RBDR__CH_NUM);
		createEReference(rbdrEClass, RBDR__TRG_MOD);
		createEReference(rbdrEClass, RBDR__LEV_MOD);
		createEReference(rbdrEClass, RBDR__PRE_TMMS);
		createEReference(rbdrEClass, RBDR__PST_TMMS);

		rdirEClass = createEClass(RDIR);
		createEReference(rdirEClass, RDIR__DIR);
		createEReference(rdirEClass, RDIR__CHR_ANG);
		createEReference(rdirEClass, RDIR__MIN_FWD_ANG);
		createEReference(rdirEClass, RDIR__MIN_RV_ANG);
		createEReference(rdirEClass, RDIR__MAX_FWD_ANG);
		createEReference(rdirEClass, RDIR__MAX_RV_ANG);
		createEReference(rdirEClass, RDIR__BLK_VAL_A);
		createEReference(rdirEClass, RDIR__BLK_VAL_V);
		createEReference(rdirEClass, RDIR__POL_QTY);
		createEReference(rdirEClass, RDIR__MIN_PPV);

		rfloEClass = createEClass(RFLO);
		createEReference(rfloEClass, RFLO__OP_CNT_RS);
		createEReference(rfloEClass, RFLO__FLT_Z);
		createEReference(rfloEClass, RFLO__FLT_DISKM);
		createEReference(rfloEClass, RFLO__FLT_LOOP);
		createEReference(rfloEClass, RFLO__LIN_LEN_KM);
		createEReference(rfloEClass, RFLO__R1);
		createEReference(rfloEClass, RFLO__X1);
		createEReference(rfloEClass, RFLO__R0);
		createEReference(rfloEClass, RFLO__X0);
		createEReference(rfloEClass, RFLO__Z1_MOD);
		createEReference(rfloEClass, RFLO__Z1_ANG);
		createEReference(rfloEClass, RFLO__Z0_MOD);
		createEReference(rfloEClass, RFLO__Z0_ANG);
		createEReference(rfloEClass, RFLO__RM0);
		createEReference(rfloEClass, RFLO__XM0);
		createEReference(rfloEClass, RFLO__ZM0_MOD);
		createEReference(rfloEClass, RFLO__ZM0_ANG);

		rrecEClass = createEClass(RREC);
		createEReference(rrecEClass, RREC__OP_CNT_RS);
		createEReference(rrecEClass, RREC__BLK_REC);
		createEReference(rrecEClass, RREC__CHK_REC);
		createEReference(rrecEClass, RREC__AUTO);
		createEReference(rrecEClass, RREC__OP);
		createEReference(rrecEClass, RREC__AUTO_REC_ST);
		createEReference(rrecEClass, RREC__REC1_TMMS);
		createEReference(rrecEClass, RREC__REC2_TMMS);
		createEReference(rrecEClass, RREC__REC3_TMMS);
		createEReference(rrecEClass, RREC__PLS_TMMS);
		createEReference(rrecEClass, RREC__RCL_TMMS);

		rsynEClass = createEClass(RSYN);
		createEReference(rsynEClass, RSYN__RHZ);
		createEReference(rsynEClass, RSYN__LHZ);
		createEReference(rsynEClass, RSYN__RV);
		createEReference(rsynEClass, RSYN__LV);
		createEReference(rsynEClass, RSYN__REL);
		createEReference(rsynEClass, RSYN__VLND);
		createEReference(rsynEClass, RSYN__ANG_IND);
		createEReference(rsynEClass, RSYN__HZ_IND);
		createEReference(rsynEClass, RSYN__SYN_PRG);
		createEReference(rsynEClass, RSYN__DIF_VCLC);
		createEReference(rsynEClass, RSYN__DIF_ANG_CLC);
		createEReference(rsynEClass, RSYN__DIF_V);
		createEReference(rsynEClass, RSYN__DIF_HZ);
		createEReference(rsynEClass, RSYN__DIF_ANG);
		createEReference(rsynEClass, RSYN__LIV_DEA_MOD);
		createEReference(rsynEClass, RSYN__DEA_LIN_VAL);
		createEReference(rsynEClass, RSYN__LIV_LIN_VAL);
		createEReference(rsynEClass, RSYN__DEA_BUS_VAL);
		createEReference(rsynEClass, RSYN__PLS_TMMS);
		createEReference(rsynEClass, RSYN__BKR_TMMS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groupREClass.getESuperTypes().add(theDomainLNsPackage.getDomainLN());
		rdreEClass.getESuperTypes().add(this.getGroupR());
		rdrsEClass.getESuperTypes().add(this.getGroupR());
		rpsbEClass.getESuperTypes().add(this.getGroupR());
		rbrfEClass.getESuperTypes().add(this.getGroupR());
		radrEClass.getESuperTypes().add(this.getGroupR());
		rbdrEClass.getESuperTypes().add(this.getGroupR());
		rdirEClass.getESuperTypes().add(this.getGroupR());
		rfloEClass.getESuperTypes().add(this.getGroupR());
		rrecEClass.getESuperTypes().add(this.getGroupR());
		rsynEClass.getESuperTypes().add(this.getGroupR());

		// Initialize classes, features, and operations; add parameters
		initEClass(groupREClass, GroupR.class, "GroupR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdreEClass, substationStandard.LNNodes.LNGroupR.RDRE.class, "RDRE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDRE_OpCntRs(), theDataclassesPackage.getINC(), null, "OpCntRs", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_RcdTrg(), theDataclassesPackage.getSPC(), null, "RcdTrg", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_MemRs(), theDataclassesPackage.getSPC(), null, "MemRs", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_MemClr(), theDataclassesPackage.getSPC(), null, "MemClr", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_RcdMade(), theDataclassesPackage.getSPS(), null, "RcdMade", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_FltNum(), theDataclassesPackage.getINS(), null, "FltNum", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_GriFltNum(), theDataclassesPackage.getINS(), null, "GriFltNum", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_RcdStr(), theDataclassesPackage.getSPS(), null, "RcdStr", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_MemUsed(), theDataclassesPackage.getINS(), null, "MemUsed", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_TrgMod(), theDataclassesPackage.getING(), null, "TrgMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_LevMod(), theDataclassesPackage.getING(), null, "LevMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_PreTmms(), theDataclassesPackage.getING(), null, "PreTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_PstTmms(), theDataclassesPackage.getING(), null, "PstTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_MemFull(), theDataclassesPackage.getING(), null, "MemFull", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_MaxNumRcd(), theDataclassesPackage.getING(), null, "MaxNumRcd", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_ReTrgMod(), theDataclassesPackage.getING(), null, "ReTrgMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_PerTrgTms(), theDataclassesPackage.getING(), null, "PerTrgTms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_ExclTmms(), theDataclassesPackage.getING(), null, "ExclTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRE_OpMod(), theDataclassesPackage.getING(), null, "OpMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdrsEClass, substationStandard.LNNodes.LNGroupR.RDRS.class, "RDRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDRS_AutoUpLod(), theDataclassesPackage.getSPC(), null, "AutoUpLod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDRS_DltRcd(), theDataclassesPackage.getSPC(), null, "DltRcd", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpsbEClass, substationStandard.LNNodes.LNGroupR.RPSB.class, "RPSB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPSB_OpCntRs(), theDataclassesPackage.getINC(), null, "OpCntRs", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_BlkZn(), theDataclassesPackage.getSPS(), null, "BlkZn", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_ZeroEna(), theDataclassesPackage.getSPG(), null, "ZeroEna", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_NgEna(), theDataclassesPackage.getSPG(), null, "NgEna", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_MaxEna(), theDataclassesPackage.getSPG(), null, "MaxEna", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_SwgVal(), theDataclassesPackage.getASG(), null, "SwgVal", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_SwgRis(), theDataclassesPackage.getASG(), null, "SwgRis", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_SwgReact(), theDataclassesPackage.getASG(), null, "SwgReact", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_SwgTmms(), theDataclassesPackage.getING(), null, "SwgTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_UnBlkTmms(), theDataclassesPackage.getING(), null, "UnBlkTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_MaxNumSlp(), theDataclassesPackage.getING(), null, "MaxNumSlp", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPSB_EvTmms(), theDataclassesPackage.getING(), null, "EvTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RPSB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rbrfEClass, substationStandard.LNNodes.LNGroupR.RBRF.class, "RBRF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRBRF_OpCntRs(), theDataclassesPackage.getINC(), null, "OpCntRs", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_OpEx(), theDataclassesPackage.getACT(), null, "OpEx", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_OpIn(), theDataclassesPackage.getACT(), null, "OpIn", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_FailMod(), theDataclassesPackage.getING(), null, "FailMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_FailTmms(), theDataclassesPackage.getING(), null, "FailTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_SPlTrTmms(), theDataclassesPackage.getING(), null, "SPlTrTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_TPTrTmms(), theDataclassesPackage.getING(), null, "TPTrTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_DetValA(), theDataclassesPackage.getASG(), null, "DetValA", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBRF_ReTrMod(), theDataclassesPackage.getING(), null, "ReTrMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBRF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radrEClass, substationStandard.LNNodes.LNGroupR.RADR.class, "RADR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRADR_OpCntRs(), theDataclassesPackage.getINC(), null, "OpCntRs", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRADR_ChTrg(), theDataclassesPackage.getSPS(), null, "ChTrg", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRADR_ChNum(), theDataclassesPackage.getING(), null, "ChNum", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRADR_TrGMod(), theDataclassesPackage.getING(), null, "TrGMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRADR_LevMod(), theDataclassesPackage.getING(), null, "LevMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRADR_HiTrgLev(), theDataclassesPackage.getASG(), null, "HiTrgLev", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRADR_LoTrgLev(), theDataclassesPackage.getASG(), null, "LoTrgLev", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRADR_PreTmms(), theDataclassesPackage.getING(), null, "PreTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRADR_PstTmms(), theDataclassesPackage.getING(), null, "PstTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RADR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rbdrEClass, substationStandard.LNNodes.LNGroupR.RBDR.class, "RBDR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRBDR_OpCntRs(), theDataclassesPackage.getINC(), null, "OpCntRs", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBDR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBDR_ChTrg(), theDataclassesPackage.getSPS(), null, "ChTrg", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBDR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBDR_ChNum(), theDataclassesPackage.getING(), null, "ChNum", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBDR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBDR_TrgMod(), theDataclassesPackage.getING(), null, "TrgMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBDR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBDR_LevMod(), theDataclassesPackage.getING(), null, "LevMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBDR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBDR_PreTmms(), theDataclassesPackage.getING(), null, "PreTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBDR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBDR_PstTmms(), theDataclassesPackage.getING(), null, "PstTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RBDR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdirEClass, substationStandard.LNNodes.LNGroupR.RDIR.class, "RDIR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDIR_Dir(), theDataclassesPackage.getACD(), null, "Dir", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_ChrAng(), theDataclassesPackage.getASG(), null, "ChrAng", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_MinFwdAng(), theDataclassesPackage.getASG(), null, "MinFwdAng", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_MinRvAng(), theDataclassesPackage.getASG(), null, "MinRvAng", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_MaxFwdAng(), theDataclassesPackage.getASG(), null, "MaxFwdAng", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_MaxRvAng(), theDataclassesPackage.getASG(), null, "MaxRvAng", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_BlkValA(), theDataclassesPackage.getASG(), null, "BlkValA", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_BlkValV(), theDataclassesPackage.getASG(), null, "BlkValV", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_PolQty(), theDataclassesPackage.getING(), null, "PolQty", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDIR_MinPPV(), theDataclassesPackage.getASG(), null, "MinPPV", null, 1, 1, substationStandard.LNNodes.LNGroupR.RDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rfloEClass, substationStandard.LNNodes.LNGroupR.RFLO.class, "RFLO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRFLO_OpCntRs(), theDataclassesPackage.getINC(), null, "OpCntRs", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_FltZ(), theDataclassesPackage.getCMV(), null, "FltZ", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_FltDiskm(), theDataclassesPackage.getMV(), null, "FltDiskm", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_FltLoop(), theDataclassesPackage.getINS(), null, "FltLoop", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_LinLenKm(), theDataclassesPackage.getASG(), null, "LinLenKm", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_R1(), theDataclassesPackage.getASG(), null, "R1", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_X1(), theDataclassesPackage.getASG(), null, "X1", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_R0(), theDataclassesPackage.getASG(), null, "R0", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_X0(), theDataclassesPackage.getASG(), null, "X0", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_Z1Mod(), theDataclassesPackage.getASG(), null, "Z1Mod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_Z1Ang(), theDataclassesPackage.getASG(), null, "Z1Ang", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_Z0Mod(), theDataclassesPackage.getASG(), null, "Z0Mod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_Z0Ang(), theDataclassesPackage.getASG(), null, "Z0Ang", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_Rm0(), theDataclassesPackage.getASG(), null, "Rm0", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_Xm0(), theDataclassesPackage.getASG(), null, "Xm0", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_Zm0Mod(), theDataclassesPackage.getASG(), null, "Zm0Mod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRFLO_Zm0Ang(), theDataclassesPackage.getASG(), null, "Zm0Ang", null, 1, 1, substationStandard.LNNodes.LNGroupR.RFLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rrecEClass, substationStandard.LNNodes.LNGroupR.RREC.class, "RREC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRREC_OpCntRs(), theDataclassesPackage.getINC(), null, "OpCntRs", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_BlkRec(), theDataclassesPackage.getSPC(), null, "BlkRec", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_ChkRec(), theDataclassesPackage.getSPC(), null, "ChkRec", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_Auto(), theDataclassesPackage.getSPS(), null, "Auto", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_AutoRecSt(), theDataclassesPackage.getINS(), null, "AutoRecSt", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_Rec1Tmms(), theDataclassesPackage.getING(), null, "Rec1Tmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_Rec2Tmms(), theDataclassesPackage.getING(), null, "Rec2Tmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_Rec3Tmms(), theDataclassesPackage.getING(), null, "Rec3Tmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_PlsTmms(), theDataclassesPackage.getING(), null, "PlsTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRREC_RclTmms(), theDataclassesPackage.getING(), null, "RclTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RREC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsynEClass, substationStandard.LNNodes.LNGroupR.RSYN.class, "RSYN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRSYN_RHz(), theDataclassesPackage.getSPC(), null, "RHz", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_LHz(), theDataclassesPackage.getSPC(), null, "LHz", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_RV(), theDataclassesPackage.getSPC(), null, "RV", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_LV(), theDataclassesPackage.getSPC(), null, "LV", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_Rel(), theDataclassesPackage.getSPS(), null, "Rel", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_Vlnd(), theDataclassesPackage.getSPS(), null, "Vlnd", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_AngInd(), theDataclassesPackage.getSPS(), null, "AngInd", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_HzInd(), theDataclassesPackage.getSPS(), null, "HzInd", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_SynPrg(), theDataclassesPackage.getSPS(), null, "SynPrg", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_DifVClc(), theDataclassesPackage.getMV(), null, "DifVClc", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_DifAngClc(), theDataclassesPackage.getMV(), null, "DifAngClc", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_DifV(), theDataclassesPackage.getASG(), null, "DifV", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_DifHz(), theDataclassesPackage.getASG(), null, "DifHz", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_DifAng(), theDataclassesPackage.getASG(), null, "DifAng", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_LivDeaMod(), theDataclassesPackage.getING(), null, "LivDeaMod", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_DeaLinVal(), theDataclassesPackage.getASG(), null, "DeaLinVal", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_LivLinVal(), theDataclassesPackage.getASG(), null, "LivLinVal", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_DeaBusVal(), theDataclassesPackage.getASG(), null, "DeaBusVal", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_PlsTmms(), theDataclassesPackage.getING(), null, "PlsTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSYN_BkrTmms(), theDataclassesPackage.getING(), null, "BkrTmms", null, 1, 1, substationStandard.LNNodes.LNGroupR.RSYN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //LNGroupRPackageImpl
