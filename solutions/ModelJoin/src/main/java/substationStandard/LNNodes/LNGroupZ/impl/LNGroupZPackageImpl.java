/**
 */
package substationStandard.LNNodes.LNGroupZ.impl;

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

import substationStandard.LNNodes.LNGroupM.LNGroupMPackage;

import substationStandard.LNNodes.LNGroupM.impl.LNGroupMPackageImpl;

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

import substationStandard.LNNodes.LNGroupZ.GroupZ;
import substationStandard.LNNodes.LNGroupZ.LNGroupZFactory;
import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;

import substationStandard.SubstationStandardPackage;

import substationStandard.impl.SubstationStandardPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LNGroupZPackageImpl extends EPackageImpl implements LNGroupZPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupZEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zaxnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zgilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zmotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zbshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zrrcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zsarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ztcfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ztcrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zcabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zcapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zgenEClass = null;

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
	 * @see substationStandard.LNNodes.LNGroupZ.LNGroupZPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LNGroupZPackageImpl() {
		super(eNS_URI, LNGroupZFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LNGroupZPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LNGroupZPackage init() {
		if (isInited) return (LNGroupZPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI);

		// Obtain or create and register package
		LNGroupZPackageImpl theLNGroupZPackage = (LNGroupZPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LNGroupZPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LNGroupZPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SubstationStandardPackageImpl theSubstationStandardPackage = (SubstationStandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) instanceof SubstationStandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI) : SubstationStandardPackage.eINSTANCE);
		DomainLNsPackageImpl theDomainLNsPackage = (DomainLNsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) instanceof DomainLNsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) : DomainLNsPackage.eINSTANCE);
		LNGroupPPackageImpl theLNGroupPPackage = (LNGroupPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) instanceof LNGroupPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) : LNGroupPPackage.eINSTANCE);
		LNGroupRPackageImpl theLNGroupRPackage = (LNGroupRPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI) instanceof LNGroupRPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI) : LNGroupRPackage.eINSTANCE);
		LNGroupCPackageImpl theLNGroupCPackage = (LNGroupCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI) instanceof LNGroupCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI) : LNGroupCPackage.eINSTANCE);
		LNGroupAPackageImpl theLNGroupAPackage = (LNGroupAPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI) instanceof LNGroupAPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI) : LNGroupAPackage.eINSTANCE);
		LNGroupMPackageImpl theLNGroupMPackage = (LNGroupMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI) instanceof LNGroupMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI) : LNGroupMPackage.eINSTANCE);
		LNGroupXPackageImpl theLNGroupXPackage = (LNGroupXPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI) instanceof LNGroupXPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI) : LNGroupXPackage.eINSTANCE);
		LNGroupTPackageImpl theLNGroupTPackage = (LNGroupTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI) instanceof LNGroupTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI) : LNGroupTPackage.eINSTANCE);
		LNGroupYPackageImpl theLNGroupYPackage = (LNGroupYPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI) instanceof LNGroupYPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI) : LNGroupYPackage.eINSTANCE);
		DataclassesPackageImpl theDataclassesPackage = (DataclassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) instanceof DataclassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) : DataclassesPackage.eINSTANCE);
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);

		// Create package meta-data objects
		theLNGroupZPackage.createPackageContents();
		theSubstationStandardPackage.createPackageContents();
		theDomainLNsPackage.createPackageContents();
		theLNGroupPPackage.createPackageContents();
		theLNGroupRPackage.createPackageContents();
		theLNGroupCPackage.createPackageContents();
		theLNGroupAPackage.createPackageContents();
		theLNGroupMPackage.createPackageContents();
		theLNGroupXPackage.createPackageContents();
		theLNGroupTPackage.createPackageContents();
		theLNGroupYPackage.createPackageContents();
		theDataclassesPackage.createPackageContents();
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theLNGroupZPackage.initializePackageContents();
		theSubstationStandardPackage.initializePackageContents();
		theDomainLNsPackage.initializePackageContents();
		theLNGroupPPackage.initializePackageContents();
		theLNGroupRPackage.initializePackageContents();
		theLNGroupCPackage.initializePackageContents();
		theLNGroupAPackage.initializePackageContents();
		theLNGroupMPackage.initializePackageContents();
		theLNGroupXPackage.initializePackageContents();
		theLNGroupTPackage.initializePackageContents();
		theLNGroupYPackage.initializePackageContents();
		theDataclassesPackage.initializePackageContents();
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLNGroupZPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LNGroupZPackage.eNS_URI, theLNGroupZPackage);
		return theLNGroupZPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupZ() {
		return groupZEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZAXN() {
		return zaxnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZAXN_OpTmh() {
		return (EReference)zaxnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZAXN_Vol() {
		return (EReference)zaxnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZAXN_Amp() {
		return (EReference)zaxnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZGIL() {
		return zgilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGIL_OpTmh() {
		return (EReference)zgilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZBAT() {
		return zbatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_OpTmh() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_Vol() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_VolChgRte() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_Amp() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_BatTest() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_TestRsl() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_BatHi() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_BatLo() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_LoBatVal() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBAT_HiBatVal() {
		return (EReference)zbatEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZLIN() {
		return zlinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZLIN_OpTmh() {
		return (EReference)zlinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZMOT() {
		return zmotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZMOT_OpTmh() {
		return (EReference)zmotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZMOT_DExt() {
		return (EReference)zmotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZMOT_LosOil() {
		return (EReference)zmotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZMOT_LosVac() {
		return (EReference)zmotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZMOT_PresAlm() {
		return (EReference)zmotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZREA() {
		return zreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZREA_OpTmh() {
		return (EReference)zreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZREA_ReactorControl() {
		return (EReference)zreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZBSH() {
		return zbshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBSH_OpTmh() {
		return (EReference)zbshEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBSH_React() {
		return (EReference)zbshEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBSH_LosFact() {
		return (EReference)zbshEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBSH_Vol() {
		return (EReference)zbshEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBSH_RefReact() {
		return (EReference)zbshEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBSH_RefPF() {
		return (EReference)zbshEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZBSH_RefV() {
		return (EReference)zbshEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZRRC() {
		return zrrcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZRRC_OpTmh() {
		return (EReference)zrrcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZSAR() {
		return zsarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZSAR_OpCnt() {
		return (EReference)zsarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZSAR_OPSA() {
		return (EReference)zsarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZTCF() {
		return ztcfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZTCF_OpTmh() {
		return (EReference)ztcfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZTCF_PwrFrq() {
		return (EReference)ztcfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZTCR() {
		return ztcrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZTCR_OpTmh() {
		return (EReference)ztcrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZCAB() {
		return zcabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZCAB_OpTmh() {
		return (EReference)zcabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZCAP() {
		return zcapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZCAP_OpTmh() {
		return (EReference)zcapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZCAP_CapDS() {
		return (EReference)zcapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZCAP_DschBlk() {
		return (EReference)zcapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZCAP_CapControl() {
		return (EReference)zcapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZCON() {
		return zconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZCON_OpTmh() {
		return (EReference)zconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZGEN() {
		return zgenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_OpTmh() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_GnCtl() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_DExt() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_AuxSCO() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_StopVlv() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_ReactPwrR() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_ReactPwrL() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_GnSpd() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_OANL() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZGEN_GnSt() {
		return (EAttribute)zgenEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_ClkRot() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_CntClkRot() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_OpUnExt() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_OpOvExt() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_LosOil() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_LosVac() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_PresAlm() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_DmdPwr() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_PwrRtg() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZGEN_VRtg() {
		return (EReference)zgenEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupZFactory getLNGroupZFactory() {
		return (LNGroupZFactory)getEFactoryInstance();
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
		groupZEClass = createEClass(GROUP_Z);

		zaxnEClass = createEClass(ZAXN);
		createEReference(zaxnEClass, ZAXN__OP_TMH);
		createEReference(zaxnEClass, ZAXN__VOL);
		createEReference(zaxnEClass, ZAXN__AMP);

		zgilEClass = createEClass(ZGIL);
		createEReference(zgilEClass, ZGIL__OP_TMH);

		zbatEClass = createEClass(ZBAT);
		createEReference(zbatEClass, ZBAT__OP_TMH);
		createEReference(zbatEClass, ZBAT__VOL);
		createEReference(zbatEClass, ZBAT__VOL_CHG_RTE);
		createEReference(zbatEClass, ZBAT__AMP);
		createEReference(zbatEClass, ZBAT__BAT_TEST);
		createEReference(zbatEClass, ZBAT__TEST_RSL);
		createEReference(zbatEClass, ZBAT__BAT_HI);
		createEReference(zbatEClass, ZBAT__BAT_LO);
		createEReference(zbatEClass, ZBAT__LO_BAT_VAL);
		createEReference(zbatEClass, ZBAT__HI_BAT_VAL);

		zlinEClass = createEClass(ZLIN);
		createEReference(zlinEClass, ZLIN__OP_TMH);

		zmotEClass = createEClass(ZMOT);
		createEReference(zmotEClass, ZMOT__OP_TMH);
		createEReference(zmotEClass, ZMOT__DEXT);
		createEReference(zmotEClass, ZMOT__LOS_OIL);
		createEReference(zmotEClass, ZMOT__LOS_VAC);
		createEReference(zmotEClass, ZMOT__PRES_ALM);

		zreaEClass = createEClass(ZREA);
		createEReference(zreaEClass, ZREA__OP_TMH);
		createEReference(zreaEClass, ZREA__REACTOR_CONTROL);

		zbshEClass = createEClass(ZBSH);
		createEReference(zbshEClass, ZBSH__OP_TMH);
		createEReference(zbshEClass, ZBSH__REACT);
		createEReference(zbshEClass, ZBSH__LOS_FACT);
		createEReference(zbshEClass, ZBSH__VOL);
		createEReference(zbshEClass, ZBSH__REF_REACT);
		createEReference(zbshEClass, ZBSH__REF_PF);
		createEReference(zbshEClass, ZBSH__REF_V);

		zrrcEClass = createEClass(ZRRC);
		createEReference(zrrcEClass, ZRRC__OP_TMH);

		zsarEClass = createEClass(ZSAR);
		createEReference(zsarEClass, ZSAR__OP_CNT);
		createEReference(zsarEClass, ZSAR__OPSA);

		ztcfEClass = createEClass(ZTCF);
		createEReference(ztcfEClass, ZTCF__OP_TMH);
		createEReference(ztcfEClass, ZTCF__PWR_FRQ);

		ztcrEClass = createEClass(ZTCR);
		createEReference(ztcrEClass, ZTCR__OP_TMH);

		zcabEClass = createEClass(ZCAB);
		createEReference(zcabEClass, ZCAB__OP_TMH);

		zcapEClass = createEClass(ZCAP);
		createEReference(zcapEClass, ZCAP__OP_TMH);
		createEReference(zcapEClass, ZCAP__CAP_DS);
		createEReference(zcapEClass, ZCAP__DSCH_BLK);
		createEReference(zcapEClass, ZCAP__CAP_CONTROL);

		zconEClass = createEClass(ZCON);
		createEReference(zconEClass, ZCON__OP_TMH);

		zgenEClass = createEClass(ZGEN);
		createEReference(zgenEClass, ZGEN__OP_TMH);
		createEReference(zgenEClass, ZGEN__GN_CTL);
		createEReference(zgenEClass, ZGEN__DEXT);
		createEReference(zgenEClass, ZGEN__AUX_SCO);
		createEReference(zgenEClass, ZGEN__STOP_VLV);
		createEReference(zgenEClass, ZGEN__REACT_PWR_R);
		createEReference(zgenEClass, ZGEN__REACT_PWR_L);
		createEReference(zgenEClass, ZGEN__GN_SPD);
		createEReference(zgenEClass, ZGEN__OANL);
		createEAttribute(zgenEClass, ZGEN__GN_ST);
		createEReference(zgenEClass, ZGEN__CLK_ROT);
		createEReference(zgenEClass, ZGEN__CNT_CLK_ROT);
		createEReference(zgenEClass, ZGEN__OP_UN_EXT);
		createEReference(zgenEClass, ZGEN__OP_OV_EXT);
		createEReference(zgenEClass, ZGEN__LOS_OIL);
		createEReference(zgenEClass, ZGEN__LOS_VAC);
		createEReference(zgenEClass, ZGEN__PRES_ALM);
		createEReference(zgenEClass, ZGEN__DMD_PWR);
		createEReference(zgenEClass, ZGEN__PWR_RTG);
		createEReference(zgenEClass, ZGEN__VRTG);
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
		LNGroupAPackage theLNGroupAPackage = (LNGroupAPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI);
		EnumerationsPackage theEnumerationsPackage = (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groupZEClass.getESuperTypes().add(theDomainLNsPackage.getDomainLN());
		zaxnEClass.getESuperTypes().add(this.getGroupZ());
		zgilEClass.getESuperTypes().add(this.getGroupZ());
		zbatEClass.getESuperTypes().add(this.getGroupZ());
		zlinEClass.getESuperTypes().add(this.getGroupZ());
		zmotEClass.getESuperTypes().add(this.getGroupZ());
		zreaEClass.getESuperTypes().add(this.getGroupZ());
		zbshEClass.getESuperTypes().add(this.getGroupZ());
		zrrcEClass.getESuperTypes().add(this.getGroupZ());
		zsarEClass.getESuperTypes().add(this.getGroupZ());
		ztcfEClass.getESuperTypes().add(this.getGroupZ());
		ztcrEClass.getESuperTypes().add(this.getGroupZ());
		zcabEClass.getESuperTypes().add(this.getGroupZ());
		zcapEClass.getESuperTypes().add(this.getGroupZ());
		zconEClass.getESuperTypes().add(this.getGroupZ());
		zgenEClass.getESuperTypes().add(this.getGroupZ());

		// Initialize classes, features, and operations; add parameters
		initEClass(groupZEClass, GroupZ.class, "GroupZ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zaxnEClass, substationStandard.LNNodes.LNGroupZ.ZAXN.class, "ZAXN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZAXN_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZAXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZAXN_Vol(), theDataclassesPackage.getMV(), null, "Vol", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZAXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZAXN_Amp(), theDataclassesPackage.getMV(), null, "Amp", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZAXN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zgilEClass, substationStandard.LNNodes.LNGroupZ.ZGIL.class, "ZGIL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZGIL_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGIL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zbatEClass, substationStandard.LNNodes.LNGroupZ.ZBAT.class, "ZBAT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZBAT_OpTmh(), theDataclassesPackage.getMV(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_Vol(), theDataclassesPackage.getMV(), null, "Vol", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_VolChgRte(), theDataclassesPackage.getMV(), null, "VolChgRte", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_Amp(), theDataclassesPackage.getMV(), null, "Amp", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_BatTest(), theDataclassesPackage.getSPC(), null, "BatTest", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_TestRsl(), theDataclassesPackage.getSPC(), null, "TestRsl", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_BatHi(), theDataclassesPackage.getSPC(), null, "BatHi", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_BatLo(), theDataclassesPackage.getSPC(), null, "BatLo", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_LoBatVal(), theDataclassesPackage.getASG(), null, "LoBatVal", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBAT_HiBatVal(), theDataclassesPackage.getASG(), null, "HiBatVal", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlinEClass, substationStandard.LNNodes.LNGroupZ.ZLIN.class, "ZLIN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZLIN_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZLIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zmotEClass, substationStandard.LNNodes.LNGroupZ.ZMOT.class, "ZMOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZMOT_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZMOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZMOT_DExt(), theDataclassesPackage.getSPC(), null, "DExt", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZMOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZMOT_LosOil(), theDataclassesPackage.getSPS(), null, "LosOil", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZMOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZMOT_LosVac(), theDataclassesPackage.getSPS(), null, "LosVac", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZMOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZMOT_PresAlm(), theDataclassesPackage.getSPS(), null, "PresAlm", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZMOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zreaEClass, substationStandard.LNNodes.LNGroupZ.ZREA.class, "ZREA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZREA_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZREA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZREA_ReactorControl(), theLNGroupAPackage.getARCO(), null, "ReactorControl", null, 0, 1, substationStandard.LNNodes.LNGroupZ.ZREA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zbshEClass, substationStandard.LNNodes.LNGroupZ.ZBSH.class, "ZBSH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZBSH_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBSH_React(), theDataclassesPackage.getMV(), null, "React", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBSH_LosFact(), theDataclassesPackage.getMV(), null, "LosFact", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBSH_Vol(), theDataclassesPackage.getMV(), null, "Vol", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBSH_RefReact(), theDataclassesPackage.getASG(), null, "RefReact", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBSH_RefPF(), theDataclassesPackage.getASG(), null, "RefPF", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZBSH_RefV(), theDataclassesPackage.getASG(), null, "RefV", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZBSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zrrcEClass, substationStandard.LNNodes.LNGroupZ.ZRRC.class, "ZRRC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZRRC_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZRRC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zsarEClass, substationStandard.LNNodes.LNGroupZ.ZSAR.class, "ZSAR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZSAR_OpCnt(), theDataclassesPackage.getINS(), null, "OpCnt", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZSAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZSAR_OPSA(), theDataclassesPackage.getSPS(), null, "OPSA", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZSAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ztcfEClass, substationStandard.LNNodes.LNGroupZ.ZTCF.class, "ZTCF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZTCF_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZTCF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZTCF_PwrFrq(), theDataclassesPackage.getASG(), null, "PwrFrq", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZTCF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ztcrEClass, substationStandard.LNNodes.LNGroupZ.ZTCR.class, "ZTCR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZTCR_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZTCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zcabEClass, substationStandard.LNNodes.LNGroupZ.ZCAB.class, "ZCAB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZCAB_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZCAB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zcapEClass, substationStandard.LNNodes.LNGroupZ.ZCAP.class, "ZCAP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZCAP_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZCAP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZCAP_CapDS(), theDataclassesPackage.getSPC(), null, "CapDS", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZCAP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZCAP_DschBlk(), theDataclassesPackage.getSPS(), null, "DschBlk", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZCAP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZCAP_CapControl(), theLNGroupAPackage.getARCO(), null, "CapControl", null, 0, 1, substationStandard.LNNodes.LNGroupZ.ZCAP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zconEClass, substationStandard.LNNodes.LNGroupZ.ZCON.class, "ZCON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZCON_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZCON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zgenEClass, substationStandard.LNNodes.LNGroupZ.ZGEN.class, "ZGEN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZGEN_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_GnCtl(), theDataclassesPackage.getDPC(), null, "GnCtl", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_DExt(), theDataclassesPackage.getSPC(), null, "DExt", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_AuxSCO(), theDataclassesPackage.getSPC(), null, "AuxSCO", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_StopVlv(), theDataclassesPackage.getSPC(), null, "StopVlv", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_ReactPwrR(), theDataclassesPackage.getSPC(), null, "ReactPwrR", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_ReactPwrL(), theDataclassesPackage.getSPC(), null, "ReactPwrL", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_GnSpd(), theDataclassesPackage.getMV(), null, "GnSpd", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_OANL(), theDataclassesPackage.getSPS(), null, "OANL", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZGEN_GnSt(), theEnumerationsPackage.getGeneratorStateKind(), "GnSt", null, 0, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_ClkRot(), theDataclassesPackage.getSPS(), null, "ClkRot", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_CntClkRot(), theDataclassesPackage.getSPS(), null, "CntClkRot", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_OpUnExt(), theDataclassesPackage.getSPS(), null, "OpUnExt", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_OpOvExt(), theDataclassesPackage.getSPS(), null, "OpOvExt", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_LosOil(), theDataclassesPackage.getSPS(), null, "LosOil", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_LosVac(), theDataclassesPackage.getSPS(), null, "LosVac", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_PresAlm(), theDataclassesPackage.getSPS(), null, "PresAlm", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_DmdPwr(), theDataclassesPackage.getASG(), null, "DmdPwr", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_PwrRtg(), theDataclassesPackage.getASG(), null, "PwrRtg", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZGEN_VRtg(), theDataclassesPackage.getASG(), null, "VRtg", null, 1, 1, substationStandard.LNNodes.LNGroupZ.ZGEN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //LNGroupZPackageImpl
