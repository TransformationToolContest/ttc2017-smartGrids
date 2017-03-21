/**
 */
package substationStandard.impl;

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

import substationStandard.LNNodes.LNGroupZ.LNGroupZPackage;

import substationStandard.LNNodes.LNGroupZ.impl.LNGroupZPackageImpl;

import substationStandard.Substandard;
import substationStandard.SubstationStandardFactory;
import substationStandard.SubstationStandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstationStandardPackageImpl extends EPackageImpl implements SubstationStandardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substandardEClass = null;

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
	 * @see substationStandard.SubstationStandardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubstationStandardPackageImpl() {
		super(eNS_URI, SubstationStandardFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SubstationStandardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubstationStandardPackage init() {
		if (isInited) return (SubstationStandardPackage)EPackage.Registry.INSTANCE.getEPackage(SubstationStandardPackage.eNS_URI);

		// Obtain or create and register package
		SubstationStandardPackageImpl theSubstationStandardPackage = (SubstationStandardPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SubstationStandardPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SubstationStandardPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DomainLNsPackageImpl theDomainLNsPackage = (DomainLNsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) instanceof DomainLNsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainLNsPackage.eNS_URI) : DomainLNsPackage.eINSTANCE);
		LNGroupPPackageImpl theLNGroupPPackage = (LNGroupPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) instanceof LNGroupPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI) : LNGroupPPackage.eINSTANCE);
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
		theLNGroupZPackage.createPackageContents();
		theDataclassesPackage.createPackageContents();
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
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
		theLNGroupZPackage.initializePackageContents();
		theDataclassesPackage.initializePackageContents();
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubstationStandardPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubstationStandardPackage.eNS_URI, theSubstationStandardPackage);
		return theSubstationStandardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstandard() {
		return substandardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_LN() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_NamePlt() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_LPL() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_DPC() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_ACT() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_SPS() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_BSC() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_ISC() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_SPC() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_MV() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_INS() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_ASG() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_WYE() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_DPStatus() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_AnalogueValue() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_CMV() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_ValWithTrans() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_BSControl() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstandard_Vector() {
		return (EReference)substandardEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstationStandardFactory getSubstationStandardFactory() {
		return (SubstationStandardFactory)getEFactoryInstance();
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
		substandardEClass = createEClass(SUBSTANDARD);
		createEReference(substandardEClass, SUBSTANDARD__LN);
		createEReference(substandardEClass, SUBSTANDARD__NAME_PLT);
		createEReference(substandardEClass, SUBSTANDARD__LPL);
		createEReference(substandardEClass, SUBSTANDARD__DPC);
		createEReference(substandardEClass, SUBSTANDARD__ACT);
		createEReference(substandardEClass, SUBSTANDARD__SPS);
		createEReference(substandardEClass, SUBSTANDARD__BSC);
		createEReference(substandardEClass, SUBSTANDARD__ISC);
		createEReference(substandardEClass, SUBSTANDARD__SPC);
		createEReference(substandardEClass, SUBSTANDARD__MV);
		createEReference(substandardEClass, SUBSTANDARD__INS);
		createEReference(substandardEClass, SUBSTANDARD__ASG);
		createEReference(substandardEClass, SUBSTANDARD__WYE);
		createEReference(substandardEClass, SUBSTANDARD__DP_STATUS);
		createEReference(substandardEClass, SUBSTANDARD__ANALOGUE_VALUE);
		createEReference(substandardEClass, SUBSTANDARD__CMV);
		createEReference(substandardEClass, SUBSTANDARD__VAL_WITH_TRANS);
		createEReference(substandardEClass, SUBSTANDARD__BS_CONTROL);
		createEReference(substandardEClass, SUBSTANDARD__VECTOR);
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
		LNGroupPPackage theLNGroupPPackage = (LNGroupPPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupPPackage.eNS_URI);
		LNGroupRPackage theLNGroupRPackage = (LNGroupRPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupRPackage.eNS_URI);
		LNGroupCPackage theLNGroupCPackage = (LNGroupCPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupCPackage.eNS_URI);
		LNGroupAPackage theLNGroupAPackage = (LNGroupAPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI);
		LNGroupMPackage theLNGroupMPackage = (LNGroupMPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI);
		LNGroupXPackage theLNGroupXPackage = (LNGroupXPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupXPackage.eNS_URI);
		LNGroupTPackage theLNGroupTPackage = (LNGroupTPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupTPackage.eNS_URI);
		LNGroupYPackage theLNGroupYPackage = (LNGroupYPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI);
		LNGroupZPackage theLNGroupZPackage = (LNGroupZPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI);
		DataclassesPackage theDataclassesPackage = (DataclassesPackage)EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI);
		EnumerationsPackage theEnumerationsPackage = (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDomainLNsPackage);
		getESubpackages().add(theLNGroupPPackage);
		getESubpackages().add(theLNGroupRPackage);
		getESubpackages().add(theLNGroupCPackage);
		getESubpackages().add(theLNGroupAPackage);
		getESubpackages().add(theLNGroupMPackage);
		getESubpackages().add(theLNGroupXPackage);
		getESubpackages().add(theLNGroupTPackage);
		getESubpackages().add(theLNGroupYPackage);
		getESubpackages().add(theLNGroupZPackage);
		getESubpackages().add(theDataclassesPackage);
		getESubpackages().add(theEnumerationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(substandardEClass, Substandard.class, "Substandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstandard_LN(), theDomainLNsPackage.getDomainLN(), null, "LN", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_NamePlt(), theDataclassesPackage.getLPL(), null, "NamePlt", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_LPL(), theDataclassesPackage.getLPL(), null, "LPL", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_DPC(), theDataclassesPackage.getDPC(), null, "DPC", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_ACT(), theDataclassesPackage.getACT(), null, "ACT", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_SPS(), theDataclassesPackage.getSPS(), null, "SPS", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_BSC(), theDataclassesPackage.getBSC(), null, "BSC", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_ISC(), theDataclassesPackage.getISC(), null, "ISC", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_SPC(), theDataclassesPackage.getSPC(), null, "SPC", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_MV(), theDataclassesPackage.getMV(), null, "MV", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_INS(), theDataclassesPackage.getINS(), null, "INS", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_ASG(), theDataclassesPackage.getASG(), null, "ASG", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_WYE(), theDataclassesPackage.getWYE(), null, "WYE", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_DPStatus(), theDataclassesPackage.getDPStatus(), null, "DPStatus", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_AnalogueValue(), theDataclassesPackage.getAnalogueValue(), null, "AnalogueValue", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_CMV(), theDataclassesPackage.getCMV(), null, "CMV", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_ValWithTrans(), theDataclassesPackage.getValWithTrans(), null, "ValWithTrans", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_BSControl(), theDataclassesPackage.getBSControl(), null, "BSControl", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstandard_Vector(), theDataclassesPackage.getVector(), null, "Vector", null, 0, -1, Substandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SubstationStandardPackageImpl
