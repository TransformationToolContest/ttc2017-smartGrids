/**
 */
package substationStandard.LNNodes.LNGroupY.impl;

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

import substationStandard.LNNodes.LNGroupY.GroupY;
import substationStandard.LNNodes.LNGroupY.LNGroupYFactory;
import substationStandard.LNNodes.LNGroupY.LNGroupYPackage;

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
public class LNGroupYPackageImpl extends EPackageImpl implements LNGroupYPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yefnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yltcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ypshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yptrEClass = null;

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
	 * @see substationStandard.LNNodes.LNGroupY.LNGroupYPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LNGroupYPackageImpl() {
		super(eNS_URI, LNGroupYFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LNGroupYPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LNGroupYPackage init() {
		if (isInited) return (LNGroupYPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupYPackage.eNS_URI);

		// Obtain or create and register package
		LNGroupYPackageImpl theLNGroupYPackage = (LNGroupYPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LNGroupYPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LNGroupYPackageImpl());

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
		LNGroupZPackageImpl theLNGroupZPackage = (LNGroupZPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) instanceof LNGroupZPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) : LNGroupZPackage.eINSTANCE);
		DataclassesPackageImpl theDataclassesPackage = (DataclassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) instanceof DataclassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) : DataclassesPackage.eINSTANCE);
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);

		// Create package meta-data objects
		theLNGroupYPackage.createPackageContents();
		theSubstationStandardPackage.createPackageContents();
		theDomainLNsPackage.createPackageContents();
		theLNGroupPPackage.createPackageContents();
		theLNGroupRPackage.createPackageContents();
		theLNGroupCPackage.createPackageContents();
		theLNGroupAPackage.createPackageContents();
		theLNGroupMPackage.createPackageContents();
		theLNGroupXPackage.createPackageContents();
		theLNGroupTPackage.createPackageContents();
		theLNGroupZPackage.createPackageContents();
		theDataclassesPackage.createPackageContents();
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theLNGroupYPackage.initializePackageContents();
		theSubstationStandardPackage.initializePackageContents();
		theDomainLNsPackage.initializePackageContents();
		theLNGroupPPackage.initializePackageContents();
		theLNGroupRPackage.initializePackageContents();
		theLNGroupCPackage.initializePackageContents();
		theLNGroupAPackage.initializePackageContents();
		theLNGroupMPackage.initializePackageContents();
		theLNGroupXPackage.initializePackageContents();
		theLNGroupTPackage.initializePackageContents();
		theLNGroupZPackage.initializePackageContents();
		theDataclassesPackage.initializePackageContents();
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLNGroupYPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LNGroupYPackage.eNS_URI, theLNGroupYPackage);
		return theLNGroupYPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupY() {
		return groupYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupY_EEName() {
		return (EReference)groupYEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupY_EEHealth() {
		return (EAttribute)groupYEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEFN() {
		return yefnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEFN_Loc() {
		return (EReference)yefnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEFN_OpTmh() {
		return (EReference)yefnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEFN_ECA() {
		return (EReference)yefnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEFN_ColTapPos() {
		return (EReference)yefnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEFN_ColPos() {
		return (EReference)yefnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYLTC() {
		return yltcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLTC_OpCnt() {
		return (EReference)yltcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLTC_Torq() {
		return (EReference)yltcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLTC_MotDrvA() {
		return (EReference)yltcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLTC_TapPos() {
		return (EReference)yltcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLTC_TapChg() {
		return (EReference)yltcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLTC_EndPosR() {
		return (EReference)yltcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLTC_EndPosL() {
		return (EReference)yltcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLTC_OilFil() {
		return (EReference)yltcEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPSH() {
		return ypshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPSH_OpTmh() {
		return (EReference)ypshEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPSH_Pos() {
		return (EReference)ypshEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPSH_BlkOpn() {
		return (EReference)ypshEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPSH_BlkCls() {
		return (EReference)ypshEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPSH_ChaMotEna() {
		return (EReference)ypshEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPSH_ShOpCap() {
		return (EAttribute)ypshEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYPSH_MaxOpCap() {
		return (EAttribute)ypshEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYPTR() {
		return yptrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_OpTmh() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_HPTmp() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_HPZmpAlm() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_HPTmpTr() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_OANL() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_OpOvA() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_OpOvV() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_OpUnV() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_CGAlm() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_HiVRtg() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_LoVRtg() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_PwrRtg() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYPTR_TransformerControl() {
		return (EReference)yptrEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupYFactory getLNGroupYFactory() {
		return (LNGroupYFactory)getEFactoryInstance();
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
		groupYEClass = createEClass(GROUP_Y);
		createEReference(groupYEClass, GROUP_Y__EE_NAME);
		createEAttribute(groupYEClass, GROUP_Y__EE_HEALTH);

		yefnEClass = createEClass(YEFN);
		createEReference(yefnEClass, YEFN__LOC);
		createEReference(yefnEClass, YEFN__OP_TMH);
		createEReference(yefnEClass, YEFN__ECA);
		createEReference(yefnEClass, YEFN__COL_TAP_POS);
		createEReference(yefnEClass, YEFN__COL_POS);

		yltcEClass = createEClass(YLTC);
		createEReference(yltcEClass, YLTC__OP_CNT);
		createEReference(yltcEClass, YLTC__TORQ);
		createEReference(yltcEClass, YLTC__MOT_DRV_A);
		createEReference(yltcEClass, YLTC__TAP_POS);
		createEReference(yltcEClass, YLTC__TAP_CHG);
		createEReference(yltcEClass, YLTC__END_POS_R);
		createEReference(yltcEClass, YLTC__END_POS_L);
		createEReference(yltcEClass, YLTC__OIL_FIL);

		ypshEClass = createEClass(YPSH);
		createEReference(ypshEClass, YPSH__OP_TMH);
		createEReference(ypshEClass, YPSH__POS);
		createEReference(ypshEClass, YPSH__BLK_OPN);
		createEReference(ypshEClass, YPSH__BLK_CLS);
		createEReference(ypshEClass, YPSH__CHA_MOT_ENA);
		createEAttribute(ypshEClass, YPSH__SH_OP_CAP);
		createEAttribute(ypshEClass, YPSH__MAX_OP_CAP);

		yptrEClass = createEClass(YPTR);
		createEReference(yptrEClass, YPTR__OP_TMH);
		createEReference(yptrEClass, YPTR__HP_TMP);
		createEReference(yptrEClass, YPTR__HP_ZMP_ALM);
		createEReference(yptrEClass, YPTR__HP_TMP_TR);
		createEReference(yptrEClass, YPTR__OANL);
		createEReference(yptrEClass, YPTR__OP_OV_A);
		createEReference(yptrEClass, YPTR__OP_OV_V);
		createEReference(yptrEClass, YPTR__OP_UN_V);
		createEReference(yptrEClass, YPTR__CG_ALM);
		createEReference(yptrEClass, YPTR__HI_VRTG);
		createEReference(yptrEClass, YPTR__LO_VRTG);
		createEReference(yptrEClass, YPTR__PWR_RTG);
		createEReference(yptrEClass, YPTR__TRANSFORMER_CONTROL);
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
		LNGroupAPackage theLNGroupAPackage = (LNGroupAPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groupYEClass.getESuperTypes().add(theDomainLNsPackage.getDomainLN());
		yefnEClass.getESuperTypes().add(this.getGroupY());
		yltcEClass.getESuperTypes().add(this.getGroupY());
		ypshEClass.getESuperTypes().add(this.getGroupY());
		yptrEClass.getESuperTypes().add(this.getGroupY());

		// Initialize classes, features, and operations; add parameters
		initEClass(groupYEClass, GroupY.class, "GroupY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupY_EEName(), theDataclassesPackage.getDPL(), null, "EEName", null, 1, 1, GroupY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupY_EEHealth(), theEnumerationsPackage.getHealthStateKind(), "EEHealth", null, 0, 1, GroupY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yefnEClass, substationStandard.LNNodes.LNGroupY.YEFN.class, "YEFN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEFN_Loc(), theDataclassesPackage.getSPS(), null, "Loc", null, 1, 1, substationStandard.LNNodes.LNGroupY.YEFN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEFN_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupY.YEFN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEFN_ECA(), theDataclassesPackage.getMV(), null, "ECA", null, 1, 1, substationStandard.LNNodes.LNGroupY.YEFN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEFN_ColTapPos(), theDataclassesPackage.getISC(), null, "ColTapPos", null, 1, 1, substationStandard.LNNodes.LNGroupY.YEFN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEFN_ColPos(), theDataclassesPackage.getAPC(), null, "ColPos", null, 1, 1, substationStandard.LNNodes.LNGroupY.YEFN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yltcEClass, substationStandard.LNNodes.LNGroupY.YLTC.class, "YLTC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYLTC_OpCnt(), theDataclassesPackage.getINS(), null, "OpCnt", null, 1, 1, substationStandard.LNNodes.LNGroupY.YLTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYLTC_Torq(), theDataclassesPackage.getMV(), null, "Torq", null, 1, 1, substationStandard.LNNodes.LNGroupY.YLTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYLTC_MotDrvA(), theDataclassesPackage.getMV(), null, "MotDrvA", null, 1, 1, substationStandard.LNNodes.LNGroupY.YLTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYLTC_TapPos(), theDataclassesPackage.getISC(), null, "TapPos", null, 1, 1, substationStandard.LNNodes.LNGroupY.YLTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYLTC_TapChg(), theDataclassesPackage.getBSC(), null, "TapChg", null, 1, 1, substationStandard.LNNodes.LNGroupY.YLTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYLTC_EndPosR(), theDataclassesPackage.getSPS(), null, "EndPosR", null, 1, 1, substationStandard.LNNodes.LNGroupY.YLTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYLTC_EndPosL(), theDataclassesPackage.getSPS(), null, "EndPosL", null, 1, 1, substationStandard.LNNodes.LNGroupY.YLTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYLTC_OilFil(), theDataclassesPackage.getSPS(), null, "OilFil", null, 1, 1, substationStandard.LNNodes.LNGroupY.YLTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ypshEClass, substationStandard.LNNodes.LNGroupY.YPSH.class, "YPSH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYPSH_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPSH_Pos(), theDataclassesPackage.getDPC(), null, "Pos", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPSH_BlkOpn(), theDataclassesPackage.getSPC(), null, "BlkOpn", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPSH_BlkCls(), theDataclassesPackage.getSPC(), null, "BlkCls", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPSH_ChaMotEna(), theDataclassesPackage.getSPC(), null, "ChaMotEna", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYPSH_ShOpCap(), theEnumerationsPackage.getSwitchingCapabilityKind(), "ShOpCap", null, 0, 1, substationStandard.LNNodes.LNGroupY.YPSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYPSH_MaxOpCap(), theEnumerationsPackage.getSwitchingCapabilityKind(), "MaxOpCap", null, 0, 1, substationStandard.LNNodes.LNGroupY.YPSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yptrEClass, substationStandard.LNNodes.LNGroupY.YPTR.class, "YPTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYPTR_OpTmh(), theDataclassesPackage.getINS(), null, "OpTmh", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_HPTmp(), theDataclassesPackage.getMV(), null, "HPTmp", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_HPZmpAlm(), theDataclassesPackage.getSPS(), null, "HPZmpAlm", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_HPTmpTr(), theDataclassesPackage.getSPS(), null, "HPTmpTr", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_OANL(), theDataclassesPackage.getSPS(), null, "OANL", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_OpOvA(), theDataclassesPackage.getSPS(), null, "OpOvA", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_OpOvV(), theDataclassesPackage.getSPS(), null, "OpOvV", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_OpUnV(), theDataclassesPackage.getSPS(), null, "OpUnV", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_CGAlm(), theDataclassesPackage.getSPS(), null, "CGAlm", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_HiVRtg(), theDataclassesPackage.getASG(), null, "HiVRtg", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_LoVRtg(), theDataclassesPackage.getASG(), null, "LoVRtg", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_PwrRtg(), theDataclassesPackage.getASG(), null, "PwrRtg", null, 1, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYPTR_TransformerControl(), theLNGroupAPackage.getATCC(), null, "TransformerControl", null, 0, 1, substationStandard.LNNodes.LNGroupY.YPTR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //LNGroupYPackageImpl
