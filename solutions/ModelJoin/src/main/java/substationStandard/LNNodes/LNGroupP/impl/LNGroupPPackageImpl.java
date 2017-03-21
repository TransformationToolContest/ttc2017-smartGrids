/**
 */
package substationStandard.LNNodes.LNGroupP.impl;

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

import substationStandard.LNNodes.LNGroupP.GroupP;
import substationStandard.LNNodes.LNGroupP.LNGroupPFactory;
import substationStandard.LNNodes.LNGroupP.LNGroupPPackage;

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
public class LNGroupPPackageImpl extends EPackageImpl implements LNGroupPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pfrcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ppamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phizEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass piocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pmriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pmssEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pschEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psdeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptofEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptovEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptucEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptufEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pvocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pvphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptrcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptuvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pupfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzsuEClass = null;

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
	 * @see substationStandard.LNNodes.LNGroupP.LNGroupPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LNGroupPPackageImpl() {
		super(eNS_URI, LNGroupPFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LNGroupPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LNGroupPPackage init() {
		if (isInited) return (LNGroupPPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI);

		// Obtain or create and register package
		LNGroupPPackageImpl theLNGroupPPackage = (LNGroupPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LNGroupPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LNGroupPPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SubstationStandardPackageImpl theSubstationStandardPackage = (SubstationStandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) instanceof SubstationStandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) : SubstationStandardPackage.eINSTANCE);
		DomainLNsPackageImpl theDomainLNsPackage = (DomainLNsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) instanceof DomainLNsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) : DomainLNsPackage.eINSTANCE);
		LNGroupRPackageImpl theLNGroupRPackage = (LNGroupRPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI) instanceof LNGroupRPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI) : LNGroupRPackage.eINSTANCE);
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
		theLNGroupPPackage.createPackageContents();
		theSubstationStandardPackage.createPackageContents();
		theDomainLNsPackage.createPackageContents();
		theLNGroupRPackage.createPackageContents();
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
		theLNGroupPPackage.initializePackageContents();
		theSubstationStandardPackage.initializePackageContents();
		theDomainLNsPackage.initializePackageContents();
		theLNGroupRPackage.initializePackageContents();
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
		theLNGroupPPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LNGroupPPackage.eNS_URI, theLNGroupPPackage);
		return theLNGroupPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupP() {
		return groupPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupP_OpCntRs() {
		return (EReference)groupPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDIF() {
		return pdifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_Str() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_Op() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_TmASt() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_DifAClc() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_RstA() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_LinCapac() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_LoSet() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_HiSet() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_MinOpTmms() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_MaxOpTmms() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_RstMod() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_RsDiTmms() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIF_TmACrv() {
		return (EReference)pdifEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDIR() {
		return pdirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIR_Str() {
		return (EReference)pdirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIR_Op() {
		return (EReference)pdirEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIR_RsDiTmms() {
		return (EReference)pdirEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPFRC() {
		return pfrcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFRC_Str() {
		return (EReference)pfrcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFRC_Op() {
		return (EReference)pfrcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFRC_BlkV() {
		return (EReference)pfrcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFRC_StrVal() {
		return (EReference)pfrcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFRC_BlkVal() {
		return (EReference)pfrcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFRC_OpDiTmms() {
		return (EReference)pfrcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPFRC_RsDiTmms() {
		return (EReference)pfrcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPHAR() {
		return pharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHAR_Str() {
		return (EReference)pharEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHAR_HaRst() {
		return (EReference)pharEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHAR_PhStr() {
		return (EReference)pharEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHAR_PhStop() {
		return (EReference)pharEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHAR_OpDiTmms() {
		return (EReference)pharEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHAR_RsDiTmms() {
		return (EReference)pharEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOPF() {
		return popfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_Str() {
		return (EReference)popfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_Op() {
		return (EReference)popfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_BlkA() {
		return (EReference)popfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_BlkV() {
		return (EReference)popfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_StrVal() {
		return (EReference)popfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_OpDiTmms() {
		return (EReference)popfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_RsDiTmms() {
		return (EReference)popfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_BlkValA() {
		return (EReference)popfEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOPF_BlkValV() {
		return (EReference)popfEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPAM() {
		return ppamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPAM_Str() {
		return (EReference)ppamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPAM_Op() {
		return (EReference)ppamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPAM_StrVal() {
		return (EReference)ppamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDIS() {
		return pdisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_Str() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_Op() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_PoRch() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_PhStr() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_GndStr() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_DirMod() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_PctRch() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_Ofs() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_PctOfs() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_RisLod() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_AngLod() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_TmDlMod() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_OpDlTmms() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_PhDlMod() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_PhDlTmms() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_GndDlMod() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_GndDlTmms() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_X1() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_LinAng() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_RisGndRch() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_RisPhRch() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_K0Fact() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_K0FactAng() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDIS_RsDlTmms() {
		return (EReference)pdisEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDOP() {
		return pdopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDOP_Str() {
		return (EReference)pdopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDOP_Op() {
		return (EReference)pdopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDOP_DirMod() {
		return (EReference)pdopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDOP_StrVal() {
		return (EReference)pdopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDOP_OpDlTmms() {
		return (EReference)pdopEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDOP_RsDlTmms() {
		return (EReference)pdopEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPHIZ() {
		return phizEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHIZ_Str() {
		return (EReference)phizEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHIZ_Op() {
		return (EReference)phizEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHIZ_AStr() {
		return (EReference)phizEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHIZ_VStr() {
		return (EReference)phizEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHIZ_HVStr() {
		return (EReference)phizEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHIZ_OpDlTmms() {
		return (EReference)phizEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHIZ_RsDlTmms() {
		return (EReference)phizEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIOC() {
		return piocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIOC_Str() {
		return (EReference)piocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIOC_Op() {
		return (EReference)piocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIOC_StrVal() {
		return (EReference)piocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPMRI() {
		return pmriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_Op() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_StrInh() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_StrInhTmm() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_SetA() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_SetTms() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_MaxNumStr() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_MaxWrmStr() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_MaxStrTmm() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_EqTmm() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMRI_InhTmm() {
		return (EReference)pmriEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPMSS() {
		return pmssEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMSS_Str() {
		return (EReference)pmssEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMSS_Op() {
		return (EReference)pmssEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMSS_SetA() {
		return (EReference)pmssEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMSS_SetTms() {
		return (EReference)pmssEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMSS_MotStr() {
		return (EReference)pmssEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMSS_LokRotTms() {
		return (EReference)pmssEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSCH() {
		return pschEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_ProTx() {
		return (EReference)pschEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_ProRx() {
		return (EReference)pschEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_Str() {
		return (EReference)pschEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_Op() {
		return (EReference)pschEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_CarRx() {
		return (EReference)pschEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_LosOfGrd() {
		return (EReference)pschEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_Echo() {
		return (EReference)pschEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_WeiOp() {
		return (EReference)pschEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_RvABlk() {
		return (EReference)pschEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_GrdRx() {
		return (EReference)pschEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_SchTyp() {
		return (EReference)pschEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_OpDlTmms() {
		return (EReference)pschEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_CrdTmms() {
		return (EReference)pschEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_DurTmms() {
		return (EReference)pschEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_UnBlkMod() {
		return (EReference)pschEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_SecTmms() {
		return (EReference)pschEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_WeiMod() {
		return (EReference)pschEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_WeiTmms() {
		return (EReference)pschEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_PPVVal() {
		return (EReference)pschEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_PhGndVal() {
		return (EReference)pschEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_RvAMod() {
		return (EReference)pschEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_RvATmms() {
		return (EReference)pschEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSCH_RvRsTmms() {
		return (EReference)pschEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSDE() {
		return psdeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSDE_Str() {
		return (EReference)psdeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSDE_Op() {
		return (EReference)psdeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSDE_Ang() {
		return (EReference)psdeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSDE_GndStr() {
		return (EReference)psdeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSDE_GndOp() {
		return (EReference)psdeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSDE_StrDlTmms() {
		return (EReference)psdeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSDE_OpDlTmms() {
		return (EReference)psdeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSDE_DirMod() {
		return (EReference)psdeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDUP() {
		return pdupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDUP_Str() {
		return (EReference)pdupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDUP_Op() {
		return (EReference)pdupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDUP_StrVal() {
		return (EReference)pdupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDUP_OpDlTmms() {
		return (EReference)pdupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDUP_RsDlTmms() {
		return (EReference)pdupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDUP_DirMod() {
		return (EReference)pdupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTEF() {
		return ptefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTEF_Str() {
		return (EReference)ptefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTEF_Op() {
		return (EReference)ptefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTEF_GndStr() {
		return (EReference)ptefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTEF_DirMod() {
		return (EReference)ptefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTOC() {
		return ptocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_Str() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_Op() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_TmASt() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_TmACrv() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_StrVal() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_TmMult() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_MinOpTmms() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_MaxOpTmms() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_OpDlTmms() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_TypRsCrv() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_RsDlTmms() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOC_DirMod() {
		return (EReference)ptocEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTOF() {
		return ptofEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOF_Str() {
		return (EReference)ptofEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOF_Op() {
		return (EReference)ptofEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOF_BlkV() {
		return (EReference)ptofEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOF_StrVal() {
		return (EReference)ptofEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOF_BlkVal() {
		return (EReference)ptofEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOF_OpDlTmms() {
		return (EReference)ptofEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOF_RsDlTmms() {
		return (EReference)ptofEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTOV() {
		return ptovEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_Str() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_Op() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_TmVst() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_TmVCrv() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_StrVal() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_TmMult() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_MinOpTmms() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_MaxOpTmms() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_OpDlTmms() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTOV_RsDlTmms() {
		return (EReference)ptovEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTTR() {
		return pttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_Amp() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_Tmp() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_TmpRl() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_LodRsvAlm() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_LodRsvTr() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_AgeRat() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_Str() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_Op() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_AlmThm() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_TmTmpSt() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_TmASt() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_TmTmpCrv() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_TmACrv() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_TmpMax() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_StrVal() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_OpDlTmms() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_MinOpTmms() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_MaxOpTmms() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_RsDlTmms() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_ConsTms() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTTR_AlmVal() {
		return (EReference)pttrEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTUC() {
		return ptucEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_Str() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_Op() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_TmASt() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_TmACrv() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_StrVal() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_OpDlTmms() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_TmMult() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_MinOpTmms() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_MaxOpTmms() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_RsDlTmms() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_ConsTms() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUC_AlmVal() {
		return (EReference)ptucEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTUF() {
		return ptufEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUF_Str() {
		return (EReference)ptufEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUF_Op() {
		return (EReference)ptufEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUF_BlkV() {
		return (EReference)ptufEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUF_StrVal() {
		return (EReference)ptufEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUF_BlkVal() {
		return (EReference)ptufEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUF_OpDlTmms() {
		return (EReference)ptufEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUF_RsDlTmms() {
		return (EReference)ptufEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPVOC() {
		return pvocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_Str() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_Op() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_AVSt() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_TmASt() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_TmMult() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_AVCrv() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_TmACrv() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_MinOpTmms() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_MaxOpTmms() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_OpDlTmms() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_TypRsCrv() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVOC_RsDlTmms() {
		return (EReference)pvocEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPVPH() {
		return pvphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_Str() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_Op() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_VHzSt() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_VHzCrv() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_StrVal() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_OpDlTmms() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_TypRsCrv() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_RsDlTmms() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_TmMult() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_MinOpTmms() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVPH_MaxOpTmms() {
		return (EReference)pvphEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTRC() {
		return ptrcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTRC_Tr() {
		return (EReference)ptrcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTRC_Op() {
		return (EReference)ptrcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTRC_Str() {
		return (EReference)ptrcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTRC_TrMod() {
		return (EReference)ptrcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTRC_TrPlsTmms() {
		return (EReference)ptrcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTUV() {
		return ptuvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_Str() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_Op() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_TmVSt() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_TmVCrv() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_StrVal() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_TmMult() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_MinOpTmms() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_MaxOpTmms() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_OpDlTmms() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTUV_RsDlTmms() {
		return (EReference)ptuvEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPUPF() {
		return pupfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_Str() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_Op() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_BlkA() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_BlkV() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_StrVal() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_OpDlTmms() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_RsDlTmms() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_BlkValA() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPUPF_BlkValV() {
		return (EReference)pupfEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPZSU() {
		return pzsuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPZSU_Str() {
		return (EReference)pzsuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPZSU_Op() {
		return (EReference)pzsuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPZSU_StrVal() {
		return (EReference)pzsuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPZSU_OpDlTmms() {
		return (EReference)pzsuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPZSU_RsDlTmms() {
		return (EReference)pzsuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupPFactory getLNGroupPFactory() {
		return (LNGroupPFactory)getEFactoryInstance();
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
		groupPEClass = createEClass(GROUP_P);
		createEReference(groupPEClass, GROUP_P__OP_CNT_RS);

		pdifEClass = createEClass(PDIF);
		createEReference(pdifEClass, PDIF__STR);
		createEReference(pdifEClass, PDIF__OP);
		createEReference(pdifEClass, PDIF__TM_AST);
		createEReference(pdifEClass, PDIF__DIF_ACLC);
		createEReference(pdifEClass, PDIF__RST_A);
		createEReference(pdifEClass, PDIF__LIN_CAPAC);
		createEReference(pdifEClass, PDIF__LO_SET);
		createEReference(pdifEClass, PDIF__HI_SET);
		createEReference(pdifEClass, PDIF__MIN_OP_TMMS);
		createEReference(pdifEClass, PDIF__MAX_OP_TMMS);
		createEReference(pdifEClass, PDIF__RST_MOD);
		createEReference(pdifEClass, PDIF__RS_DI_TMMS);
		createEReference(pdifEClass, PDIF__TM_ACRV);

		pdirEClass = createEClass(PDIR);
		createEReference(pdirEClass, PDIR__STR);
		createEReference(pdirEClass, PDIR__OP);
		createEReference(pdirEClass, PDIR__RS_DI_TMMS);

		pfrcEClass = createEClass(PFRC);
		createEReference(pfrcEClass, PFRC__STR);
		createEReference(pfrcEClass, PFRC__OP);
		createEReference(pfrcEClass, PFRC__BLK_V);
		createEReference(pfrcEClass, PFRC__STR_VAL);
		createEReference(pfrcEClass, PFRC__BLK_VAL);
		createEReference(pfrcEClass, PFRC__OP_DI_TMMS);
		createEReference(pfrcEClass, PFRC__RS_DI_TMMS);

		pharEClass = createEClass(PHAR);
		createEReference(pharEClass, PHAR__STR);
		createEReference(pharEClass, PHAR__HA_RST);
		createEReference(pharEClass, PHAR__PH_STR);
		createEReference(pharEClass, PHAR__PH_STOP);
		createEReference(pharEClass, PHAR__OP_DI_TMMS);
		createEReference(pharEClass, PHAR__RS_DI_TMMS);

		popfEClass = createEClass(POPF);
		createEReference(popfEClass, POPF__STR);
		createEReference(popfEClass, POPF__OP);
		createEReference(popfEClass, POPF__BLK_A);
		createEReference(popfEClass, POPF__BLK_V);
		createEReference(popfEClass, POPF__STR_VAL);
		createEReference(popfEClass, POPF__OP_DI_TMMS);
		createEReference(popfEClass, POPF__RS_DI_TMMS);
		createEReference(popfEClass, POPF__BLK_VAL_A);
		createEReference(popfEClass, POPF__BLK_VAL_V);

		ppamEClass = createEClass(PPAM);
		createEReference(ppamEClass, PPAM__STR);
		createEReference(ppamEClass, PPAM__OP);
		createEReference(ppamEClass, PPAM__STR_VAL);

		pdisEClass = createEClass(PDIS);
		createEReference(pdisEClass, PDIS__STR);
		createEReference(pdisEClass, PDIS__OP);
		createEReference(pdisEClass, PDIS__PO_RCH);
		createEReference(pdisEClass, PDIS__PH_STR);
		createEReference(pdisEClass, PDIS__GND_STR);
		createEReference(pdisEClass, PDIS__DIR_MOD);
		createEReference(pdisEClass, PDIS__PCT_RCH);
		createEReference(pdisEClass, PDIS__OFS);
		createEReference(pdisEClass, PDIS__PCT_OFS);
		createEReference(pdisEClass, PDIS__RIS_LOD);
		createEReference(pdisEClass, PDIS__ANG_LOD);
		createEReference(pdisEClass, PDIS__TM_DL_MOD);
		createEReference(pdisEClass, PDIS__OP_DL_TMMS);
		createEReference(pdisEClass, PDIS__PH_DL_MOD);
		createEReference(pdisEClass, PDIS__PH_DL_TMMS);
		createEReference(pdisEClass, PDIS__GND_DL_MOD);
		createEReference(pdisEClass, PDIS__GND_DL_TMMS);
		createEReference(pdisEClass, PDIS__X1);
		createEReference(pdisEClass, PDIS__LIN_ANG);
		createEReference(pdisEClass, PDIS__RIS_GND_RCH);
		createEReference(pdisEClass, PDIS__RIS_PH_RCH);
		createEReference(pdisEClass, PDIS__K0_FACT);
		createEReference(pdisEClass, PDIS__K0_FACT_ANG);
		createEReference(pdisEClass, PDIS__RS_DL_TMMS);

		pdopEClass = createEClass(PDOP);
		createEReference(pdopEClass, PDOP__STR);
		createEReference(pdopEClass, PDOP__OP);
		createEReference(pdopEClass, PDOP__DIR_MOD);
		createEReference(pdopEClass, PDOP__STR_VAL);
		createEReference(pdopEClass, PDOP__OP_DL_TMMS);
		createEReference(pdopEClass, PDOP__RS_DL_TMMS);

		phizEClass = createEClass(PHIZ);
		createEReference(phizEClass, PHIZ__STR);
		createEReference(phizEClass, PHIZ__OP);
		createEReference(phizEClass, PHIZ__ASTR);
		createEReference(phizEClass, PHIZ__VSTR);
		createEReference(phizEClass, PHIZ__HV_STR);
		createEReference(phizEClass, PHIZ__OP_DL_TMMS);
		createEReference(phizEClass, PHIZ__RS_DL_TMMS);

		piocEClass = createEClass(PIOC);
		createEReference(piocEClass, PIOC__STR);
		createEReference(piocEClass, PIOC__OP);
		createEReference(piocEClass, PIOC__STR_VAL);

		pmriEClass = createEClass(PMRI);
		createEReference(pmriEClass, PMRI__OP);
		createEReference(pmriEClass, PMRI__STR_INH);
		createEReference(pmriEClass, PMRI__STR_INH_TMM);
		createEReference(pmriEClass, PMRI__SET_A);
		createEReference(pmriEClass, PMRI__SET_TMS);
		createEReference(pmriEClass, PMRI__MAX_NUM_STR);
		createEReference(pmriEClass, PMRI__MAX_WRM_STR);
		createEReference(pmriEClass, PMRI__MAX_STR_TMM);
		createEReference(pmriEClass, PMRI__EQ_TMM);
		createEReference(pmriEClass, PMRI__INH_TMM);

		pmssEClass = createEClass(PMSS);
		createEReference(pmssEClass, PMSS__STR);
		createEReference(pmssEClass, PMSS__OP);
		createEReference(pmssEClass, PMSS__SET_A);
		createEReference(pmssEClass, PMSS__SET_TMS);
		createEReference(pmssEClass, PMSS__MOT_STR);
		createEReference(pmssEClass, PMSS__LOK_ROT_TMS);

		pschEClass = createEClass(PSCH);
		createEReference(pschEClass, PSCH__PRO_TX);
		createEReference(pschEClass, PSCH__PRO_RX);
		createEReference(pschEClass, PSCH__STR);
		createEReference(pschEClass, PSCH__OP);
		createEReference(pschEClass, PSCH__CAR_RX);
		createEReference(pschEClass, PSCH__LOS_OF_GRD);
		createEReference(pschEClass, PSCH__ECHO);
		createEReference(pschEClass, PSCH__WEI_OP);
		createEReference(pschEClass, PSCH__RV_ABLK);
		createEReference(pschEClass, PSCH__GRD_RX);
		createEReference(pschEClass, PSCH__SCH_TYP);
		createEReference(pschEClass, PSCH__OP_DL_TMMS);
		createEReference(pschEClass, PSCH__CRD_TMMS);
		createEReference(pschEClass, PSCH__DUR_TMMS);
		createEReference(pschEClass, PSCH__UN_BLK_MOD);
		createEReference(pschEClass, PSCH__SEC_TMMS);
		createEReference(pschEClass, PSCH__WEI_MOD);
		createEReference(pschEClass, PSCH__WEI_TMMS);
		createEReference(pschEClass, PSCH__PPV_VAL);
		createEReference(pschEClass, PSCH__PH_GND_VAL);
		createEReference(pschEClass, PSCH__RV_AMOD);
		createEReference(pschEClass, PSCH__RV_ATMMS);
		createEReference(pschEClass, PSCH__RV_RS_TMMS);

		psdeEClass = createEClass(PSDE);
		createEReference(psdeEClass, PSDE__STR);
		createEReference(psdeEClass, PSDE__OP);
		createEReference(psdeEClass, PSDE__ANG);
		createEReference(psdeEClass, PSDE__GND_STR);
		createEReference(psdeEClass, PSDE__GND_OP);
		createEReference(psdeEClass, PSDE__STR_DL_TMMS);
		createEReference(psdeEClass, PSDE__OP_DL_TMMS);
		createEReference(psdeEClass, PSDE__DIR_MOD);

		pdupEClass = createEClass(PDUP);
		createEReference(pdupEClass, PDUP__STR);
		createEReference(pdupEClass, PDUP__OP);
		createEReference(pdupEClass, PDUP__STR_VAL);
		createEReference(pdupEClass, PDUP__OP_DL_TMMS);
		createEReference(pdupEClass, PDUP__RS_DL_TMMS);
		createEReference(pdupEClass, PDUP__DIR_MOD);

		ptefEClass = createEClass(PTEF);
		createEReference(ptefEClass, PTEF__STR);
		createEReference(ptefEClass, PTEF__OP);
		createEReference(ptefEClass, PTEF__GND_STR);
		createEReference(ptefEClass, PTEF__DIR_MOD);

		ptocEClass = createEClass(PTOC);
		createEReference(ptocEClass, PTOC__STR);
		createEReference(ptocEClass, PTOC__OP);
		createEReference(ptocEClass, PTOC__TM_AST);
		createEReference(ptocEClass, PTOC__TM_ACRV);
		createEReference(ptocEClass, PTOC__STR_VAL);
		createEReference(ptocEClass, PTOC__TM_MULT);
		createEReference(ptocEClass, PTOC__MIN_OP_TMMS);
		createEReference(ptocEClass, PTOC__MAX_OP_TMMS);
		createEReference(ptocEClass, PTOC__OP_DL_TMMS);
		createEReference(ptocEClass, PTOC__TYP_RS_CRV);
		createEReference(ptocEClass, PTOC__RS_DL_TMMS);
		createEReference(ptocEClass, PTOC__DIR_MOD);

		ptofEClass = createEClass(PTOF);
		createEReference(ptofEClass, PTOF__STR);
		createEReference(ptofEClass, PTOF__OP);
		createEReference(ptofEClass, PTOF__BLK_V);
		createEReference(ptofEClass, PTOF__STR_VAL);
		createEReference(ptofEClass, PTOF__BLK_VAL);
		createEReference(ptofEClass, PTOF__OP_DL_TMMS);
		createEReference(ptofEClass, PTOF__RS_DL_TMMS);

		ptovEClass = createEClass(PTOV);
		createEReference(ptovEClass, PTOV__STR);
		createEReference(ptovEClass, PTOV__OP);
		createEReference(ptovEClass, PTOV__TM_VST);
		createEReference(ptovEClass, PTOV__TM_VCRV);
		createEReference(ptovEClass, PTOV__STR_VAL);
		createEReference(ptovEClass, PTOV__TM_MULT);
		createEReference(ptovEClass, PTOV__MIN_OP_TMMS);
		createEReference(ptovEClass, PTOV__MAX_OP_TMMS);
		createEReference(ptovEClass, PTOV__OP_DL_TMMS);
		createEReference(ptovEClass, PTOV__RS_DL_TMMS);

		pttrEClass = createEClass(PTTR);
		createEReference(pttrEClass, PTTR__AMP);
		createEReference(pttrEClass, PTTR__TMP);
		createEReference(pttrEClass, PTTR__TMP_RL);
		createEReference(pttrEClass, PTTR__LOD_RSV_ALM);
		createEReference(pttrEClass, PTTR__LOD_RSV_TR);
		createEReference(pttrEClass, PTTR__AGE_RAT);
		createEReference(pttrEClass, PTTR__STR);
		createEReference(pttrEClass, PTTR__OP);
		createEReference(pttrEClass, PTTR__ALM_THM);
		createEReference(pttrEClass, PTTR__TM_TMP_ST);
		createEReference(pttrEClass, PTTR__TM_AST);
		createEReference(pttrEClass, PTTR__TM_TMP_CRV);
		createEReference(pttrEClass, PTTR__TM_ACRV);
		createEReference(pttrEClass, PTTR__TMP_MAX);
		createEReference(pttrEClass, PTTR__STR_VAL);
		createEReference(pttrEClass, PTTR__OP_DL_TMMS);
		createEReference(pttrEClass, PTTR__MIN_OP_TMMS);
		createEReference(pttrEClass, PTTR__MAX_OP_TMMS);
		createEReference(pttrEClass, PTTR__RS_DL_TMMS);
		createEReference(pttrEClass, PTTR__CONS_TMS);
		createEReference(pttrEClass, PTTR__ALM_VAL);

		ptucEClass = createEClass(PTUC);
		createEReference(ptucEClass, PTUC__STR);
		createEReference(ptucEClass, PTUC__OP);
		createEReference(ptucEClass, PTUC__TM_AST);
		createEReference(ptucEClass, PTUC__TM_ACRV);
		createEReference(ptucEClass, PTUC__STR_VAL);
		createEReference(ptucEClass, PTUC__OP_DL_TMMS);
		createEReference(ptucEClass, PTUC__TM_MULT);
		createEReference(ptucEClass, PTUC__MIN_OP_TMMS);
		createEReference(ptucEClass, PTUC__MAX_OP_TMMS);
		createEReference(ptucEClass, PTUC__RS_DL_TMMS);
		createEReference(ptucEClass, PTUC__CONS_TMS);
		createEReference(ptucEClass, PTUC__ALM_VAL);

		ptufEClass = createEClass(PTUF);
		createEReference(ptufEClass, PTUF__STR);
		createEReference(ptufEClass, PTUF__OP);
		createEReference(ptufEClass, PTUF__BLK_V);
		createEReference(ptufEClass, PTUF__STR_VAL);
		createEReference(ptufEClass, PTUF__BLK_VAL);
		createEReference(ptufEClass, PTUF__OP_DL_TMMS);
		createEReference(ptufEClass, PTUF__RS_DL_TMMS);

		pvocEClass = createEClass(PVOC);
		createEReference(pvocEClass, PVOC__STR);
		createEReference(pvocEClass, PVOC__OP);
		createEReference(pvocEClass, PVOC__AV_ST);
		createEReference(pvocEClass, PVOC__TM_AST);
		createEReference(pvocEClass, PVOC__TM_MULT);
		createEReference(pvocEClass, PVOC__AV_CRV);
		createEReference(pvocEClass, PVOC__TM_ACRV);
		createEReference(pvocEClass, PVOC__MIN_OP_TMMS);
		createEReference(pvocEClass, PVOC__MAX_OP_TMMS);
		createEReference(pvocEClass, PVOC__OP_DL_TMMS);
		createEReference(pvocEClass, PVOC__TYP_RS_CRV);
		createEReference(pvocEClass, PVOC__RS_DL_TMMS);

		pvphEClass = createEClass(PVPH);
		createEReference(pvphEClass, PVPH__STR);
		createEReference(pvphEClass, PVPH__OP);
		createEReference(pvphEClass, PVPH__VHZ_ST);
		createEReference(pvphEClass, PVPH__VHZ_CRV);
		createEReference(pvphEClass, PVPH__STR_VAL);
		createEReference(pvphEClass, PVPH__OP_DL_TMMS);
		createEReference(pvphEClass, PVPH__TYP_RS_CRV);
		createEReference(pvphEClass, PVPH__RS_DL_TMMS);
		createEReference(pvphEClass, PVPH__TM_MULT);
		createEReference(pvphEClass, PVPH__MIN_OP_TMMS);
		createEReference(pvphEClass, PVPH__MAX_OP_TMMS);

		ptrcEClass = createEClass(PTRC);
		createEReference(ptrcEClass, PTRC__TR);
		createEReference(ptrcEClass, PTRC__OP);
		createEReference(ptrcEClass, PTRC__STR);
		createEReference(ptrcEClass, PTRC__TR_MOD);
		createEReference(ptrcEClass, PTRC__TR_PLS_TMMS);

		ptuvEClass = createEClass(PTUV);
		createEReference(ptuvEClass, PTUV__STR);
		createEReference(ptuvEClass, PTUV__OP);
		createEReference(ptuvEClass, PTUV__TM_VST);
		createEReference(ptuvEClass, PTUV__TM_VCRV);
		createEReference(ptuvEClass, PTUV__STR_VAL);
		createEReference(ptuvEClass, PTUV__TM_MULT);
		createEReference(ptuvEClass, PTUV__MIN_OP_TMMS);
		createEReference(ptuvEClass, PTUV__MAX_OP_TMMS);
		createEReference(ptuvEClass, PTUV__OP_DL_TMMS);
		createEReference(ptuvEClass, PTUV__RS_DL_TMMS);

		pupfEClass = createEClass(PUPF);
		createEReference(pupfEClass, PUPF__STR);
		createEReference(pupfEClass, PUPF__OP);
		createEReference(pupfEClass, PUPF__BLK_A);
		createEReference(pupfEClass, PUPF__BLK_V);
		createEReference(pupfEClass, PUPF__STR_VAL);
		createEReference(pupfEClass, PUPF__OP_DL_TMMS);
		createEReference(pupfEClass, PUPF__RS_DL_TMMS);
		createEReference(pupfEClass, PUPF__BLK_VAL_A);
		createEReference(pupfEClass, PUPF__BLK_VAL_V);

		pzsuEClass = createEClass(PZSU);
		createEReference(pzsuEClass, PZSU__STR);
		createEReference(pzsuEClass, PZSU__OP);
		createEReference(pzsuEClass, PZSU__STR_VAL);
		createEReference(pzsuEClass, PZSU__OP_DL_TMMS);
		createEReference(pzsuEClass, PZSU__RS_DL_TMMS);
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
		groupPEClass.getESuperTypes().add(theDomainLNsPackage.getDomainLN());
		pdifEClass.getESuperTypes().add(this.getGroupP());
		pdirEClass.getESuperTypes().add(this.getGroupP());
		pfrcEClass.getESuperTypes().add(this.getGroupP());
		pharEClass.getESuperTypes().add(this.getGroupP());
		popfEClass.getESuperTypes().add(this.getGroupP());
		ppamEClass.getESuperTypes().add(this.getGroupP());
		pdisEClass.getESuperTypes().add(this.getGroupP());
		pdopEClass.getESuperTypes().add(this.getGroupP());
		phizEClass.getESuperTypes().add(this.getGroupP());
		piocEClass.getESuperTypes().add(this.getGroupP());
		pmriEClass.getESuperTypes().add(this.getGroupP());
		pmssEClass.getESuperTypes().add(this.getGroupP());
		pschEClass.getESuperTypes().add(this.getGroupP());
		psdeEClass.getESuperTypes().add(this.getGroupP());
		pdupEClass.getESuperTypes().add(this.getGroupP());
		ptefEClass.getESuperTypes().add(this.getGroupP());
		ptocEClass.getESuperTypes().add(this.getGroupP());
		ptofEClass.getESuperTypes().add(this.getGroupP());
		ptovEClass.getESuperTypes().add(this.getGroupP());
		pttrEClass.getESuperTypes().add(this.getGroupP());
		ptucEClass.getESuperTypes().add(this.getGroupP());
		ptufEClass.getESuperTypes().add(this.getGroupP());
		pvocEClass.getESuperTypes().add(this.getGroupP());
		pvphEClass.getESuperTypes().add(this.getGroupP());
		ptrcEClass.getESuperTypes().add(this.getGroupP());
		ptuvEClass.getESuperTypes().add(this.getGroupP());
		pupfEClass.getESuperTypes().add(this.getGroupP());
		pzsuEClass.getESuperTypes().add(this.getGroupP());

		// Initialize classes, features, and operations; add parameters
		initEClass(groupPEClass, GroupP.class, "GroupP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupP_OpCntRs(), theDataclassesPackage.getINC(), null, "OpCntRs", null, 1, 1, GroupP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdifEClass, substationStandard.LNNodes.LNGroupP.PDIF.class, "PDIF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDIF_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_TmASt(), theDataclassesPackage.getCSD(), null, "TmASt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_DifAClc(), theDataclassesPackage.getWYE(), null, "DifAClc", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_RstA(), theDataclassesPackage.getWYE(), null, "RstA", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_LinCapac(), theDataclassesPackage.getASG(), null, "LinCapac", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_LoSet(), theDataclassesPackage.getING(), null, "LoSet", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_HiSet(), theDataclassesPackage.getING(), null, "HiSet", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_MinOpTmms(), theDataclassesPackage.getING(), null, "MinOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_MaxOpTmms(), theDataclassesPackage.getING(), null, "MaxOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_RstMod(), theDataclassesPackage.getING(), null, "RstMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_RsDiTmms(), theDataclassesPackage.getING(), null, "RsDiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIF_TmACrv(), theDataclassesPackage.getCURVE(), null, "TmACrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdirEClass, substationStandard.LNNodes.LNGroupP.PDIR.class, "PDIR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDIR_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIR_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIR_RsDiTmms(), theDataclassesPackage.getING(), null, "RsDiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pfrcEClass, substationStandard.LNNodes.LNGroupP.PFRC.class, "PFRC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPFRC_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PFRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFRC_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PFRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFRC_BlkV(), theDataclassesPackage.getSPS(), null, "BlkV", null, 1, 1, substationStandard.LNNodes.LNGroupP.PFRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFRC_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PFRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFRC_BlkVal(), theDataclassesPackage.getASG(), null, "BlkVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PFRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFRC_OpDiTmms(), theDataclassesPackage.getING(), null, "OpDiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PFRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPFRC_RsDiTmms(), theDataclassesPackage.getING(), null, "RsDiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PFRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pharEClass, substationStandard.LNNodes.LNGroupP.PHAR.class, "PHAR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPHAR_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHAR_HaRst(), theDataclassesPackage.getING(), null, "HaRst", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHAR_PhStr(), theDataclassesPackage.getASG(), null, "PhStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHAR_PhStop(), theDataclassesPackage.getASG(), null, "PhStop", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHAR_OpDiTmms(), theDataclassesPackage.getING(), null, "OpDiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHAR_RsDiTmms(), theDataclassesPackage.getING(), null, "RsDiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(popfEClass, substationStandard.LNNodes.LNGroupP.POPF.class, "POPF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPOPF_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOPF_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOPF_BlkA(), theDataclassesPackage.getSPS(), null, "BlkA", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOPF_BlkV(), theDataclassesPackage.getSPS(), null, "BlkV", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOPF_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOPF_OpDiTmms(), theDataclassesPackage.getING(), null, "OpDiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOPF_RsDiTmms(), theDataclassesPackage.getING(), null, "RsDiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOPF_BlkValA(), theDataclassesPackage.getASG(), null, "BlkValA", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOPF_BlkValV(), theDataclassesPackage.getASG(), null, "BlkValV", null, 1, 1, substationStandard.LNNodes.LNGroupP.POPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ppamEClass, substationStandard.LNNodes.LNGroupP.PPAM.class, "PPAM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPPAM_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PPAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPPAM_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PPAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPPAM_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 0, 1, substationStandard.LNNodes.LNGroupP.PPAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdisEClass, substationStandard.LNNodes.LNGroupP.PDIS.class, "PDIS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDIS_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_PoRch(), theDataclassesPackage.getASG(), null, "PoRch", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_PhStr(), theDataclassesPackage.getASG(), null, "PhStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_GndStr(), theDataclassesPackage.getASG(), null, "GndStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_DirMod(), theDataclassesPackage.getING(), null, "DirMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_PctRch(), theDataclassesPackage.getASG(), null, "PctRch", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_Ofs(), theDataclassesPackage.getASG(), null, "Ofs", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_PctOfs(), theDataclassesPackage.getASG(), null, "PctOfs", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_RisLod(), theDataclassesPackage.getASG(), null, "RisLod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_AngLod(), theDataclassesPackage.getASG(), null, "AngLod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_TmDlMod(), theDataclassesPackage.getSPG(), null, "TmDlMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_PhDlMod(), theDataclassesPackage.getSPG(), null, "PhDlMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_PhDlTmms(), theDataclassesPackage.getING(), null, "PhDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_GndDlMod(), theDataclassesPackage.getSPG(), null, "GndDlMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_GndDlTmms(), theDataclassesPackage.getING(), null, "GndDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_X1(), theDataclassesPackage.getASG(), null, "X1", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_LinAng(), theDataclassesPackage.getASG(), null, "LinAng", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_RisGndRch(), theDataclassesPackage.getASG(), null, "RisGndRch", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_RisPhRch(), theDataclassesPackage.getASG(), null, "RisPhRch", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_K0Fact(), theDataclassesPackage.getASG(), null, "K0Fact", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_K0FactAng(), theDataclassesPackage.getASG(), null, "K0FactAng", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDIS_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdopEClass, substationStandard.LNNodes.LNGroupP.PDOP.class, "PDOP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDOP_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDOP_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDOP_DirMod(), theDataclassesPackage.getING(), null, "DirMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDOP_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDOP_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDOP_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phizEClass, substationStandard.LNNodes.LNGroupP.PHIZ.class, "PHIZ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPHIZ_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHIZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHIZ_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHIZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHIZ_AStr(), theDataclassesPackage.getASG(), null, "AStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHIZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHIZ_VStr(), theDataclassesPackage.getASG(), null, "VStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHIZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHIZ_HVStr(), theDataclassesPackage.getASG(), null, "HVStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHIZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHIZ_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHIZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHIZ_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PHIZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(piocEClass, substationStandard.LNNodes.LNGroupP.PIOC.class, "PIOC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPIOC_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PIOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPIOC_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PIOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPIOC_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PIOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pmriEClass, substationStandard.LNNodes.LNGroupP.PMRI.class, "PMRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPMRI_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_StrInh(), theDataclassesPackage.getSPS(), null, "StrInh", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_StrInhTmm(), theDataclassesPackage.getINS(), null, "StrInhTmm", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_SetA(), theDataclassesPackage.getASG(), null, "SetA", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_SetTms(), theDataclassesPackage.getING(), null, "SetTms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_MaxNumStr(), theDataclassesPackage.getING(), null, "MaxNumStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_MaxWrmStr(), theDataclassesPackage.getING(), null, "MaxWrmStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_MaxStrTmm(), theDataclassesPackage.getING(), null, "MaxStrTmm", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_EqTmm(), theDataclassesPackage.getING(), null, "EqTmm", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMRI_InhTmm(), theDataclassesPackage.getING(), null, "InhTmm", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pmssEClass, substationStandard.LNNodes.LNGroupP.PMSS.class, "PMSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPMSS_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMSS_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMSS_SetA(), theDataclassesPackage.getASG(), null, "SetA", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMSS_SetTms(), theDataclassesPackage.getING(), null, "SetTms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMSS_MotStr(), theDataclassesPackage.getASG(), null, "MotStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMSS_LokRotTms(), theDataclassesPackage.getING(), null, "LokRotTms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PMSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pschEClass, substationStandard.LNNodes.LNGroupP.PSCH.class, "PSCH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSCH_ProTx(), theDataclassesPackage.getSPS(), null, "ProTx", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_ProRx(), theDataclassesPackage.getSPS(), null, "ProRx", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_CarRx(), theDataclassesPackage.getACT(), null, "CarRx", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_LosOfGrd(), theDataclassesPackage.getSPS(), null, "LosOfGrd", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_Echo(), theDataclassesPackage.getACT(), null, "Echo", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_WeiOp(), theDataclassesPackage.getACT(), null, "WeiOp", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_RvABlk(), theDataclassesPackage.getACT(), null, "RvABlk", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_GrdRx(), theDataclassesPackage.getSPS(), null, "GrdRx", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_SchTyp(), theDataclassesPackage.getING(), null, "SchTyp", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_CrdTmms(), theDataclassesPackage.getING(), null, "CrdTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_DurTmms(), theDataclassesPackage.getING(), null, "DurTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_UnBlkMod(), theDataclassesPackage.getING(), null, "UnBlkMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_SecTmms(), theDataclassesPackage.getING(), null, "SecTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_WeiMod(), theDataclassesPackage.getING(), null, "WeiMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_WeiTmms(), theDataclassesPackage.getING(), null, "WeiTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_PPVVal(), theDataclassesPackage.getASG(), null, "PPVVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_PhGndVal(), theDataclassesPackage.getASG(), null, "PhGndVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_RvAMod(), theDataclassesPackage.getING(), null, "RvAMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_RvATmms(), theDataclassesPackage.getING(), null, "RvATmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSCH_RvRsTmms(), theDataclassesPackage.getING(), null, "RvRsTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSCH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psdeEClass, substationStandard.LNNodes.LNGroupP.PSDE.class, "PSDE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSDE_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSDE_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSDE_Ang(), theDataclassesPackage.getASG(), null, "Ang", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSDE_GndStr(), theDataclassesPackage.getASG(), null, "GndStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSDE_GndOp(), theDataclassesPackage.getASG(), null, "GndOp", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSDE_StrDlTmms(), theDataclassesPackage.getING(), null, "StrDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSDE_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSDE_DirMod(), theDataclassesPackage.getING(), null, "DirMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PSDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdupEClass, substationStandard.LNNodes.LNGroupP.PDUP.class, "PDUP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDUP_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDUP_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDUP_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDUP_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDUP_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDUP_DirMod(), theDataclassesPackage.getING(), null, "DirMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PDUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptefEClass, substationStandard.LNNodes.LNGroupP.PTEF.class, "PTEF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTEF_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTEF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTEF_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTEF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTEF_GndStr(), theDataclassesPackage.getASG(), null, "GndStr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTEF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTEF_DirMod(), theDataclassesPackage.getING(), null, "DirMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTEF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptocEClass, substationStandard.LNNodes.LNGroupP.PTOC.class, "PTOC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTOC_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_TmASt(), theDataclassesPackage.getCSD(), null, "TmASt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_TmACrv(), theDataclassesPackage.getCURVE(), null, "TmACrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_TmMult(), theDataclassesPackage.getASG(), null, "TmMult", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_MinOpTmms(), theDataclassesPackage.getING(), null, "MinOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_MaxOpTmms(), theDataclassesPackage.getING(), null, "MaxOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_TypRsCrv(), theDataclassesPackage.getING(), null, "TypRsCrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOC_DirMod(), theDataclassesPackage.getING(), null, "DirMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptofEClass, substationStandard.LNNodes.LNGroupP.PTOF.class, "PTOF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTOF_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOF_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOF_BlkV(), theDataclassesPackage.getSPS(), null, "BlkV", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOF_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOF_BlkVal(), theDataclassesPackage.getASG(), null, "BlkVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOF_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOF_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptovEClass, substationStandard.LNNodes.LNGroupP.PTOV.class, "PTOV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTOV_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_TmVst(), theDataclassesPackage.getCSD(), null, "TmVst", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_TmVCrv(), theDataclassesPackage.getCURVE(), null, "TmVCrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_TmMult(), theDataclassesPackage.getASG(), null, "TmMult", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_MinOpTmms(), theDataclassesPackage.getING(), null, "MinOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_MaxOpTmms(), theDataclassesPackage.getING(), null, "MaxOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTOV_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTOV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pttrEClass, substationStandard.LNNodes.LNGroupP.PTTR.class, "PTTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTTR_Amp(), theDataclassesPackage.getMV(), null, "Amp", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_Tmp(), theDataclassesPackage.getMV(), null, "Tmp", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_TmpRl(), theDataclassesPackage.getMV(), null, "TmpRl", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_LodRsvAlm(), theDataclassesPackage.getMV(), null, "LodRsvAlm", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_LodRsvTr(), theDataclassesPackage.getMV(), null, "LodRsvTr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_AgeRat(), theDataclassesPackage.getMV(), null, "AgeRat", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_AlmThm(), theDataclassesPackage.getACT(), null, "AlmThm", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_TmTmpSt(), theDataclassesPackage.getCSD(), null, "TmTmpSt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_TmASt(), theDataclassesPackage.getCSD(), null, "TmASt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_TmTmpCrv(), theDataclassesPackage.getCURVE(), null, "TmTmpCrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_TmACrv(), theDataclassesPackage.getCURVE(), null, "TmACrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_TmpMax(), theDataclassesPackage.getASG(), null, "TmpMax", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_MinOpTmms(), theDataclassesPackage.getING(), null, "MinOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_MaxOpTmms(), theDataclassesPackage.getING(), null, "MaxOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_ConsTms(), theDataclassesPackage.getING(), null, "ConsTms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTTR_AlmVal(), theDataclassesPackage.getASG(), null, "AlmVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptucEClass, substationStandard.LNNodes.LNGroupP.PTUC.class, "PTUC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTUC_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_TmASt(), theDataclassesPackage.getCSD(), null, "TmASt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_TmACrv(), theDataclassesPackage.getCURVE(), null, "TmACrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_TmMult(), theDataclassesPackage.getASG(), null, "TmMult", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_MinOpTmms(), theDataclassesPackage.getING(), null, "MinOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_MaxOpTmms(), theDataclassesPackage.getING(), null, "MaxOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_ConsTms(), theDataclassesPackage.getING(), null, "ConsTms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUC_AlmVal(), theDataclassesPackage.getASG(), null, "AlmVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptufEClass, substationStandard.LNNodes.LNGroupP.PTUF.class, "PTUF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTUF_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUF_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUF_BlkV(), theDataclassesPackage.getSPS(), null, "BlkV", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUF_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUF_BlkVal(), theDataclassesPackage.getACT(), null, "BlkVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUF_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUF_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pvocEClass, substationStandard.LNNodes.LNGroupP.PVOC.class, "PVOC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPVOC_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_AVSt(), theDataclassesPackage.getCSD(), null, "AVSt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_TmASt(), theDataclassesPackage.getCSD(), null, "TmASt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_TmMult(), theDataclassesPackage.getASG(), null, "TmMult", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_AVCrv(), theDataclassesPackage.getCURVE(), null, "AVCrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_TmACrv(), theDataclassesPackage.getCURVE(), null, "TmACrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_MinOpTmms(), theDataclassesPackage.getING(), null, "MinOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_MaxOpTmms(), theDataclassesPackage.getING(), null, "MaxOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_TypRsCrv(), theDataclassesPackage.getING(), null, "TypRsCrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVOC_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pvphEClass, substationStandard.LNNodes.LNGroupP.PVPH.class, "PVPH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPVPH_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_VHzSt(), theDataclassesPackage.getCSD(), null, "VHzSt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_VHzCrv(), theDataclassesPackage.getCURVE(), null, "VHzCrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_TypRsCrv(), theDataclassesPackage.getING(), null, "TypRsCrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_TmMult(), theDataclassesPackage.getASG(), null, "TmMult", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_MinOpTmms(), theDataclassesPackage.getING(), null, "MinOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVPH_MaxOpTmms(), theDataclassesPackage.getING(), null, "MaxOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PVPH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptrcEClass, substationStandard.LNNodes.LNGroupP.PTRC.class, "PTRC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTRC_Tr(), theDataclassesPackage.getACT(), null, "Tr", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTRC_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTRC_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTRC_TrMod(), theDataclassesPackage.getING(), null, "TrMod", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTRC_TrPlsTmms(), theDataclassesPackage.getING(), null, "TrPlsTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptuvEClass, substationStandard.LNNodes.LNGroupP.PTUV.class, "PTUV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTUV_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_TmVSt(), theDataclassesPackage.getCSD(), null, "TmVSt", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_TmVCrv(), theDataclassesPackage.getCURVE(), null, "TmVCrv", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_TmMult(), theDataclassesPackage.getASG(), null, "TmMult", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_MinOpTmms(), theDataclassesPackage.getING(), null, "MinOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_MaxOpTmms(), theDataclassesPackage.getING(), null, "MaxOpTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTUV_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PTUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pupfEClass, substationStandard.LNNodes.LNGroupP.PUPF.class, "PUPF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPUPF_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUPF_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUPF_BlkA(), theDataclassesPackage.getSPS(), null, "BlkA", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUPF_BlkV(), theDataclassesPackage.getSPS(), null, "BlkV", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUPF_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUPF_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUPF_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUPF_BlkValA(), theDataclassesPackage.getASG(), null, "BlkValA", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPUPF_BlkValV(), theDataclassesPackage.getASG(), null, "BlkValV", null, 1, 1, substationStandard.LNNodes.LNGroupP.PUPF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzsuEClass, substationStandard.LNNodes.LNGroupP.PZSU.class, "PZSU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZSU_Str(), theDataclassesPackage.getACD(), null, "Str", null, 1, 1, substationStandard.LNNodes.LNGroupP.PZSU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZSU_Op(), theDataclassesPackage.getACT(), null, "Op", null, 1, 1, substationStandard.LNNodes.LNGroupP.PZSU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZSU_StrVal(), theDataclassesPackage.getASG(), null, "StrVal", null, 1, 1, substationStandard.LNNodes.LNGroupP.PZSU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZSU_OpDlTmms(), theDataclassesPackage.getING(), null, "OpDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PZSU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZSU_RsDlTmms(), theDataclassesPackage.getING(), null, "RsDlTmms", null, 1, 1, substationStandard.LNNodes.LNGroupP.PZSU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //LNGroupPPackageImpl
