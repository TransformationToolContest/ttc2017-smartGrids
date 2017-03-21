/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import substationStandard.Dataclasses.AnalogueSettings;
import substationStandard.Dataclasses.AnalogueValue;
import substationStandard.Dataclasses.AngleReference;
import substationStandard.Dataclasses.BSControl;
import substationStandard.Dataclasses.CMVAngleReference;
import substationStandard.Dataclasses.C_ComposedCDC;
import substationStandard.Dataclasses.C_PrimitiveCDC;
import substationStandard.Dataclasses.ComposedMeasureAndInfo;
import substationStandard.Dataclasses.ControlOutput;
import substationStandard.Dataclasses.ControllableAnalogueInfo;
import substationStandard.Dataclasses.ControllableStatusInfo;
import substationStandard.Dataclasses.CtlModels;
import substationStandard.Dataclasses.CurveChar;
import substationStandard.Dataclasses.DPStatus;
import substationStandard.Dataclasses.DataclassesFactory;
import substationStandard.Dataclasses.DataclassesPackage;
import substationStandard.Dataclasses.DescriptionInfo;
import substationStandard.Dataclasses.DetailQual;
import substationStandard.Dataclasses.DirectionPhase;
import substationStandard.Dataclasses.FaultDirection;
import substationStandard.Dataclasses.MagReference;
import substationStandard.Dataclasses.Multiplier;
import substationStandard.Dataclasses.Originator;
import substationStandard.Dataclasses.OriginatorCategory;
import substationStandard.Dataclasses.P_TimeStamp;
import substationStandard.Dataclasses.PhaseReference;
import substationStandard.Dataclasses.Point;
import substationStandard.Dataclasses.PointArray;
import substationStandard.Dataclasses.PrimitiveMeasureAndInfo;
import substationStandard.Dataclasses.PulseConfig;
import substationStandard.Dataclasses.Quality;
import substationStandard.Dataclasses.Range;
import substationStandard.Dataclasses.RangeConfig;
import substationStandard.Dataclasses.SboClasses;
import substationStandard.Dataclasses.ScaledValueConfig;
import substationStandard.Dataclasses.Sequence;
import substationStandard.Dataclasses.Severity;
import substationStandard.Dataclasses.SlUnits;
import substationStandard.Dataclasses.StatusInfo;
import substationStandard.Dataclasses.TimeQuality;
import substationStandard.Dataclasses.TimeStamp;
import substationStandard.Dataclasses.Units;
import substationStandard.Dataclasses.ValWithTrans;
import substationStandard.Dataclasses.Vector;
import substationStandard.Dataclasses.VectorArray;

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

import substationStandard.SubstationStandardPackage;

import substationStandard.impl.SubstationStandardPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataclassesPackageImpl extends EPackageImpl implements DataclassesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p_TimeStampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeQualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogueValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bsControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmvAngleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctlModelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionPhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originatorCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pulseConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailQualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sboClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaledValueConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slUnitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valWithTransEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c_PrimitiveCDCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c_ComposedCDCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bcrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveMeasureAndInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedMeasureAndInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass savEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wyeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyweEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllableStatusInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bscEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iscEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllableAnalogueInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogueSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csdEClass = null;

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
	 * @see substationStandard.Dataclasses.DataclassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataclassesPackageImpl() {
		super(eNS_URI, DataclassesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataclassesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataclassesPackage init() {
		if (isInited) return (DataclassesPackage)EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI);

		// Obtain or create and register package
		DataclassesPackageImpl theDataclassesPackage = (DataclassesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataclassesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataclassesPackageImpl());

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
		LNGroupZPackageImpl theLNGroupZPackage = (LNGroupZPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) instanceof LNGroupZPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LNGroupZPackage.eNS_URI) : LNGroupZPackage.eINSTANCE);
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);

		// Create package meta-data objects
		theDataclassesPackage.createPackageContents();
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
		theEnumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theDataclassesPackage.initializePackageContents();
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
		theEnumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataclassesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataclassesPackage.eNS_URI, theDataclassesPackage);
		return theDataclassesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStamp() {
		return timeStampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStamp_Val() {
		return (EReference)timeStampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP_TimeStamp() {
		return p_TimeStampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP_TimeStamp_SecondSinceEpoch() {
		return (EAttribute)p_TimeStampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getP_TimeStamp_FractionOfSecond() {
		return (EAttribute)p_TimeStampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getP_TimeStamp_TimeQuality() {
		return (EReference)p_TimeStampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeQuality() {
		return timeQualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeQuality_LeapSecondsKnown() {
		return (EAttribute)timeQualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeQuality_ClockFailure() {
		return (EAttribute)timeQualityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeQuality_ClockNotSynchronized() {
		return (EAttribute)timeQualityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeQuality_TimeAccuracy() {
		return (EAttribute)timeQualityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogueValue() {
		return analogueValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueValue_I() {
		return (EAttribute)analogueValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueValue_F() {
		return (EAttribute)analogueValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleReference() {
		return angleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleReference_Val() {
		return (EAttribute)angleReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBSControl() {
		return bsControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSControl_Val() {
		return (EAttribute)bsControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMVAngleReference() {
		return cmvAngleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMVAngleReference_Val() {
		return (EAttribute)cmvAngleReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlOutput() {
		return controlOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlOutput_Val() {
		return (EAttribute)controlOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtlModels() {
		return ctlModelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtlModels_Val() {
		return (EAttribute)ctlModelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurveChar() {
		return curveCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveChar_Val() {
		return (EAttribute)curveCharEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectionPhase() {
		return directionPhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPhase_Val() {
		return (EAttribute)directionPhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPStatus() {
		return dpStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPStatus_Val() {
		return (EAttribute)dpStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultDirection() {
		return faultDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultDirection_Val() {
		return (EAttribute)faultDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMagReference() {
		return magReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagReference_Val() {
		return (EAttribute)magReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplier() {
		return multiplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplier_Val() {
		return (EAttribute)multiplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOriginator() {
		return originatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOriginator_Orident() {
		return (EAttribute)originatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOriginator_OrCat() {
		return (EReference)originatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOriginatorCategory() {
		return originatorCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOriginatorCategory_Val() {
		return (EAttribute)originatorCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhaseReference() {
		return phaseReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseReference_Val() {
		return (EAttribute)phaseReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_XVal() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_YVal() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointArray() {
		return pointArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointArray_Point() {
		return (EReference)pointArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPulseConfig() {
		return pulseConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPulseConfig_OnDur() {
		return (EAttribute)pulseConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPulseConfig_OffDur() {
		return (EAttribute)pulseConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPulseConfig_NumPls() {
		return (EAttribute)pulseConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPulseConfig_CmdQual() {
		return (EReference)pulseConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuality() {
		return qualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuality_Test() {
		return (EAttribute)qualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuality_OperatorBlocked() {
		return (EAttribute)qualityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuality_Validity() {
		return (EAttribute)qualityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuality_Source() {
		return (EAttribute)qualityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuality_DetailQual() {
		return (EReference)qualityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailQual() {
		return detailQualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailQual_Overflow() {
		return (EAttribute)detailQualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailQual_OutOfRange() {
		return (EAttribute)detailQualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailQual_BadReference() {
		return (EAttribute)detailQualEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailQual_Oscillatory() {
		return (EAttribute)detailQualEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailQual_Failure() {
		return (EAttribute)detailQualEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailQual_OldData() {
		return (EAttribute)detailQualEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailQual_Inconsistent() {
		return (EAttribute)detailQualEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailQual_Inaccurate() {
		return (EAttribute)detailQualEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Val() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeConfig() {
		return rangeConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeConfig_HhLim() {
		return (EReference)rangeConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeConfig_HLim() {
		return (EReference)rangeConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeConfig_LLim() {
		return (EReference)rangeConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeConfig_LlLim() {
		return (EReference)rangeConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeConfig_Min() {
		return (EReference)rangeConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeConfig_Max() {
		return (EReference)rangeConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSboClasses() {
		return sboClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSboClasses_Val() {
		return (EAttribute)sboClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaledValueConfig() {
		return scaledValueConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaledValueConfig_ScaleFactor() {
		return (EAttribute)scaledValueConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaledValueConfig_Offset() {
		return (EAttribute)scaledValueConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_Val() {
		return (EAttribute)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverity() {
		return severityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeverity_Val() {
		return (EAttribute)severityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlUnits() {
		return slUnitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlUnits_SlUnitsKind() {
		return (EAttribute)slUnitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnits() {
		return unitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnits_SlUnits() {
		return (EReference)unitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnits_Multiplier() {
		return (EReference)unitsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValWithTrans() {
		return valWithTransEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValWithTrans_PosVal() {
		return (EAttribute)valWithTransEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValWithTrans_TransInd() {
		return (EAttribute)valWithTransEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector() {
		return vectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector_Mag() {
		return (EReference)vectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector_Ang() {
		return (EReference)vectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorArray() {
		return vectorArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVectorArray_Vector() {
		return (EReference)vectorArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC_PrimitiveCDC() {
		return c_PrimitiveCDCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_PrimitiveCDC_CdcNs() {
		return (EAttribute)c_PrimitiveCDCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_PrimitiveCDC_CdcName() {
		return (EAttribute)c_PrimitiveCDCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_PrimitiveCDC_DataNs() {
		return (EAttribute)c_PrimitiveCDCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC_ComposedCDC() {
		return c_ComposedCDCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_ComposedCDC_CdcNs() {
		return (EAttribute)c_ComposedCDCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_ComposedCDC_CdcName() {
		return (EAttribute)c_ComposedCDCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC_ComposedCDC_DataNs() {
		return (EAttribute)c_ComposedCDCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusInfo() {
		return statusInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatusInfo_T() {
		return (EReference)statusInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusInfo_D() {
		return (EAttribute)statusInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusInfo_DU() {
		return (EAttribute)statusInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPS() {
		return spsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPS_StVal() {
		return (EAttribute)spsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPS_Q() {
		return (EReference)spsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPS_SubEna() {
		return (EAttribute)spsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPS_SubVal() {
		return (EAttribute)spsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPS_SubQ() {
		return (EReference)spsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPS_SubID() {
		return (EAttribute)spsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINS() {
		return insEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINS_StVal() {
		return (EAttribute)insEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINS_Q() {
		return (EReference)insEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINS_SubEna() {
		return (EAttribute)insEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINS_SubVal() {
		return (EAttribute)insEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINS_SubQ() {
		return (EReference)insEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINS_SubID() {
		return (EAttribute)insEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPS() {
		return dpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPS_StVal() {
		return (EReference)dpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPS_Q() {
		return (EReference)dpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPS_SubEna() {
		return (EAttribute)dpsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPS_SubVal() {
		return (EReference)dpsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPS_SubQ() {
		return (EReference)dpsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPS_SubID() {
		return (EAttribute)dpsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACT() {
		return actEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACT_General() {
		return (EAttribute)actEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACT_PhsA() {
		return (EAttribute)actEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACT_PhsB() {
		return (EAttribute)actEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACT_PhsC() {
		return (EAttribute)actEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACT_Neut() {
		return (EAttribute)actEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACT_Q() {
		return (EReference)actEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACT_OperTm() {
		return (EReference)actEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACD() {
		return acdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACD_General() {
		return (EAttribute)acdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACD_DirGeneral() {
		return (EReference)acdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACD_PhsA() {
		return (EAttribute)acdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACD_DirPhsA() {
		return (EReference)acdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACD_PhsB() {
		return (EAttribute)acdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACD_DirPhsB() {
		return (EReference)acdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACD_PhsC() {
		return (EAttribute)acdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACD_DirPhsC() {
		return (EReference)acdEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACD_Neut() {
		return (EAttribute)acdEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACD_DirNeut() {
		return (EReference)acdEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACD_Q() {
		return (EReference)acdEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEC() {
		return secEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEC_Cnt() {
		return (EAttribute)secEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEC_Sev() {
		return (EReference)secEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEC_Addr() {
		return (EAttribute)secEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEC_AddInfo() {
		return (EAttribute)secEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBCR() {
		return bcrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBCR_ActVal() {
		return (EAttribute)bcrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBCR_FrVal() {
		return (EAttribute)bcrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCR_FrTm() {
		return (EReference)bcrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCR_Q() {
		return (EReference)bcrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCR_Units() {
		return (EReference)bcrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBCR_PulsQty() {
		return (EAttribute)bcrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBCR_FrEna() {
		return (EAttribute)bcrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCR_StrTm() {
		return (EReference)bcrEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBCR_FrPd() {
		return (EAttribute)bcrEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBCR_FrRs() {
		return (EAttribute)bcrEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveMeasureAndInfo() {
		return primitiveMeasureAndInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveMeasureAndInfo_D() {
		return (EAttribute)primitiveMeasureAndInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveMeasureAndInfo_DU() {
		return (EAttribute)primitiveMeasureAndInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedMeasureAndInfo() {
		return composedMeasureAndInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposedMeasureAndInfo_D() {
		return (EAttribute)composedMeasureAndInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposedMeasureAndInfo_DU() {
		return (EAttribute)composedMeasureAndInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMV() {
		return mvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_InstMag() {
		return (EReference)mvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_Mag() {
		return (EReference)mvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_Range() {
		return (EReference)mvEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_Q() {
		return (EReference)mvEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_T() {
		return (EReference)mvEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMV_SubEna() {
		return (EAttribute)mvEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_SubMag() {
		return (EReference)mvEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_SubQ() {
		return (EReference)mvEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMV_SubID() {
		return (EAttribute)mvEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_Units() {
		return (EReference)mvEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMV_Db() {
		return (EAttribute)mvEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMV_ZeroDb() {
		return (EAttribute)mvEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_SVC() {
		return (EReference)mvEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMV_RangeC() {
		return (EReference)mvEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMV_SmpRate() {
		return (EAttribute)mvEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMV() {
		return cmvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_InstCVal() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_CVal() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_Range() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_Q() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_T() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMV_SubEna() {
		return (EAttribute)cmvEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_SubCVal() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_SubQ() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMV_SubID() {
		return (EAttribute)cmvEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_Units() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMV_Db() {
		return (EAttribute)cmvEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMV_ZeroDb() {
		return (EAttribute)cmvEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_RangeC() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_MagSVC() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_AngSVC() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMV_AngRef() {
		return (EReference)cmvEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCMV_SmpRate() {
		return (EAttribute)cmvEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAV() {
		return savEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAV_InstMag() {
		return (EReference)savEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAV_Q() {
		return (EReference)savEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAV_T() {
		return (EReference)savEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAV_Units() {
		return (EReference)savEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAV_SVC() {
		return (EReference)savEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAV_Min() {
		return (EReference)savEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAV_Max() {
		return (EReference)savEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEL() {
		return delEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEL_PhsAB() {
		return (EReference)delEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEL_PhsBC() {
		return (EReference)delEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEL_PhsCA() {
		return (EReference)delEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEL_AngRef() {
		return (EReference)delEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWYE() {
		return wyeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWYE_PhsA() {
		return (EReference)wyeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWYE_PhsB() {
		return (EReference)wyeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWYE_PhsC() {
		return (EReference)wyeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWYE_Neut() {
		return (EReference)wyeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWYE_Net() {
		return (EReference)wyeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWYE_Res() {
		return (EReference)wyeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWYE_AngRef() {
		return (EReference)wyeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEQ() {
		return seqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEQ_C1() {
		return (EReference)seqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEQ_C2() {
		return (EReference)seqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEQ_C3() {
		return (EReference)seqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEQ_SeqT() {
		return (EReference)seqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSEQ_PhsRef() {
		return (EReference)seqEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMV() {
		return hmvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMV_Q() {
		return (EReference)hmvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMV_T() {
		return (EReference)hmvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMV_Har() {
		return (EReference)hmvEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMV_NumHar() {
		return (EAttribute)hmvEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMV_NumCyc() {
		return (EAttribute)hmvEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMV_EvalTm() {
		return (EAttribute)hmvEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMV_Units() {
		return (EReference)hmvEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMV_SmpRate() {
		return (EAttribute)hmvEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMV_Frequency() {
		return (EAttribute)hmvEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMV_HvRef() {
		return (EReference)hmvEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMV_RmsCyc() {
		return (EAttribute)hmvEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHYWE() {
		return hyweEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_Q() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_T() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_PhsAHar() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_PhsBHar() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_PhsCHar() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_NeutHar() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_NetHar() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_ResHar() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHYWE_NumHar() {
		return (EAttribute)hyweEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHYWE_NumCyc() {
		return (EAttribute)hyweEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHYWE_EvalTm() {
		return (EAttribute)hyweEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_Units() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_AngRef() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHYWE_SmpRate() {
		return (EAttribute)hyweEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHYWE_Frequency() {
		return (EAttribute)hyweEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHYWE_HvRef() {
		return (EReference)hyweEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHYWE_RmsCyc() {
		return (EAttribute)hyweEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDEL() {
		return hdelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDEL_Q() {
		return (EReference)hdelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDEL_T() {
		return (EReference)hdelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDEL_PhsABHar() {
		return (EReference)hdelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDEL_PhsBCHar() {
		return (EReference)hdelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDEL_PhsCAHar() {
		return (EReference)hdelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDEL_NumHar() {
		return (EAttribute)hdelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDEL_NumCyc() {
		return (EAttribute)hdelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDEL_EvalTm() {
		return (EAttribute)hdelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDEL_Units() {
		return (EReference)hdelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDEL_AngRef() {
		return (EReference)hdelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDEL_SmpRate() {
		return (EAttribute)hdelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDEL_Frequency() {
		return (EAttribute)hdelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDEL_HvRef() {
		return (EReference)hdelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDEL_RmsCyc() {
		return (EAttribute)hdelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllableStatusInfo() {
		return controllableStatusInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllableStatusInfo_OperTm() {
		return (EReference)controllableStatusInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllableStatusInfo_Origin() {
		return (EReference)controllableStatusInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllableStatusInfo_CtlNum() {
		return (EAttribute)controllableStatusInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllableStatusInfo_StSeld() {
		return (EAttribute)controllableStatusInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllableStatusInfo_SubEna() {
		return (EAttribute)controllableStatusInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllableStatusInfo_SubQ() {
		return (EReference)controllableStatusInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllableStatusInfo_SubID() {
		return (EAttribute)controllableStatusInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllableStatusInfo_CtlModel() {
		return (EReference)controllableStatusInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllableStatusInfo_SboTimeout() {
		return (EAttribute)controllableStatusInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllableStatusInfo_SboClass() {
		return (EReference)controllableStatusInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllableStatusInfo_D() {
		return (EAttribute)controllableStatusInfoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllableStatusInfo_DU() {
		return (EAttribute)controllableStatusInfoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPC() {
		return spcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPC_CtlVal() {
		return (EAttribute)spcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPC_StVal() {
		return (EAttribute)spcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPC_Q() {
		return (EReference)spcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPC_T() {
		return (EReference)spcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPC_SubVal() {
		return (EAttribute)spcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPC_PulseConfig() {
		return (EReference)spcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPC() {
		return dpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPC_CtlVal() {
		return (EAttribute)dpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPC_StVal() {
		return (EReference)dpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPC_Q() {
		return (EReference)dpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPC_T() {
		return (EReference)dpcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPC_SubVal() {
		return (EReference)dpcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPC_PulseConfig() {
		return (EReference)dpcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINC() {
		return incEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINC_CtlVal() {
		return (EAttribute)incEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINC_StVal() {
		return (EAttribute)incEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINC_Q() {
		return (EReference)incEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINC_T() {
		return (EReference)incEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINC_SubVal() {
		return (EAttribute)incEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINC_MinVal() {
		return (EAttribute)incEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINC_MaxVal() {
		return (EAttribute)incEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINC_StepSize() {
		return (EAttribute)incEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBSC() {
		return bscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSC_CtlVal() {
		return (EReference)bscEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSC_ValWTr() {
		return (EReference)bscEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSC_Q() {
		return (EReference)bscEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSC_T() {
		return (EReference)bscEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSC_SubVal() {
		return (EReference)bscEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSC_Persistent() {
		return (EAttribute)bscEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSC_MinVal() {
		return (EAttribute)bscEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSC_MaxVal() {
		return (EAttribute)bscEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSC_StepSize() {
		return (EAttribute)bscEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISC() {
		return iscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISC_CtlVal() {
		return (EAttribute)iscEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISC_ValWTr() {
		return (EReference)iscEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISC_T() {
		return (EReference)iscEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISC_Q() {
		return (EReference)iscEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISC_SubVal() {
		return (EReference)iscEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISC_MinVal() {
		return (EAttribute)iscEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISC_MaxVal() {
		return (EAttribute)iscEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISC_StepSize() {
		return (EAttribute)iscEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllableAnalogueInfo() {
		return controllableAnalogueInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllableAnalogueInfo_APC() {
		return (EReference)controllableAnalogueInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllableAnalogueInfo_C_PrimitiveCDC() {
		return (EReference)controllableAnalogueInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPC() {
		return apcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_SetMag() {
		return (EReference)apcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_Origin() {
		return (EReference)apcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_OperTm() {
		return (EReference)apcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_Q() {
		return (EReference)apcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_T() {
		return (EReference)apcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_CtlModel() {
		return (EReference)apcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_Units() {
		return (EReference)apcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_SVC() {
		return (EReference)apcEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_MinVal() {
		return (EReference)apcEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_MaxVal() {
		return (EReference)apcEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPC_StepSize() {
		return (EReference)apcEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPC_D() {
		return (EAttribute)apcEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPC_DU() {
		return (EAttribute)apcEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPG() {
		return spgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPG_SetVal() {
		return (EAttribute)spgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getING() {
		return ingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getING_SetVal() {
		return (EAttribute)ingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getING_MinVal() {
		return (EAttribute)ingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getING_MaxVal() {
		return (EAttribute)ingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getING_StepSize() {
		return (EAttribute)ingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogueSettings() {
		return analogueSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueSettings_D() {
		return (EAttribute)analogueSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueSettings_DU() {
		return (EAttribute)analogueSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASG() {
		return asgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASG_SetMag() {
		return (EReference)asgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASG_Units() {
		return (EReference)asgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASG_SVC() {
		return (EReference)asgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASG_MinVal() {
		return (EReference)asgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASG_MaxVal() {
		return (EReference)asgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASG_StepSize() {
		return (EReference)asgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCURVE() {
		return curveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCURVE_SetCharact() {
		return (EReference)curveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCURVE_SetParA() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCURVE_SetParB() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCURVE_SetParC() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCURVE_SetParD() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCURVE_SetParE() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCURVE_SetParF() {
		return (EAttribute)curveEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionInfo() {
		return descriptionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionInfo_DPL() {
		return (EReference)descriptionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionInfo_LPL() {
		return (EReference)descriptionInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionInfo_CSD() {
		return (EReference)descriptionInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionInfo_C_PrimitiveCDC() {
		return (EReference)descriptionInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPL() {
		return dplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPL_Vendor() {
		return (EAttribute)dplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPL_HwRev() {
		return (EAttribute)dplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPL_SwRev() {
		return (EAttribute)dplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPL_SerNum() {
		return (EAttribute)dplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPL_Model() {
		return (EAttribute)dplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPL_Location() {
		return (EAttribute)dplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLPL() {
		return lplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPL_Vendor() {
		return (EAttribute)lplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPL_SwRev() {
		return (EAttribute)lplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPL_D() {
		return (EAttribute)lplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPL_DU() {
		return (EAttribute)lplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPL_ConfigRev() {
		return (EAttribute)lplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPL_IdNs() {
		return (EAttribute)lplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLPL_LnNs() {
		return (EAttribute)lplEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSD() {
		return csdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSD_XUnit() {
		return (EReference)csdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSD_XD() {
		return (EAttribute)csdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSD_YUnit() {
		return (EReference)csdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSD_YD() {
		return (EAttribute)csdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSD_NumPts() {
		return (EAttribute)csdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSD_CrvPts() {
		return (EReference)csdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSD_D() {
		return (EAttribute)csdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSD_DU() {
		return (EAttribute)csdEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataclassesFactory getDataclassesFactory() {
		return (DataclassesFactory)getEFactoryInstance();
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
		timeStampEClass = createEClass(TIME_STAMP);
		createEReference(timeStampEClass, TIME_STAMP__VAL);

		p_TimeStampEClass = createEClass(PTIME_STAMP);
		createEAttribute(p_TimeStampEClass, PTIME_STAMP__SECOND_SINCE_EPOCH);
		createEAttribute(p_TimeStampEClass, PTIME_STAMP__FRACTION_OF_SECOND);
		createEReference(p_TimeStampEClass, PTIME_STAMP__TIME_QUALITY);

		timeQualityEClass = createEClass(TIME_QUALITY);
		createEAttribute(timeQualityEClass, TIME_QUALITY__LEAP_SECONDS_KNOWN);
		createEAttribute(timeQualityEClass, TIME_QUALITY__CLOCK_FAILURE);
		createEAttribute(timeQualityEClass, TIME_QUALITY__CLOCK_NOT_SYNCHRONIZED);
		createEAttribute(timeQualityEClass, TIME_QUALITY__TIME_ACCURACY);

		analogueValueEClass = createEClass(ANALOGUE_VALUE);
		createEAttribute(analogueValueEClass, ANALOGUE_VALUE__I);
		createEAttribute(analogueValueEClass, ANALOGUE_VALUE__F);

		angleReferenceEClass = createEClass(ANGLE_REFERENCE);
		createEAttribute(angleReferenceEClass, ANGLE_REFERENCE__VAL);

		bsControlEClass = createEClass(BS_CONTROL);
		createEAttribute(bsControlEClass, BS_CONTROL__VAL);

		cmvAngleReferenceEClass = createEClass(CMV_ANGLE_REFERENCE);
		createEAttribute(cmvAngleReferenceEClass, CMV_ANGLE_REFERENCE__VAL);

		controlOutputEClass = createEClass(CONTROL_OUTPUT);
		createEAttribute(controlOutputEClass, CONTROL_OUTPUT__VAL);

		ctlModelsEClass = createEClass(CTL_MODELS);
		createEAttribute(ctlModelsEClass, CTL_MODELS__VAL);

		curveCharEClass = createEClass(CURVE_CHAR);
		createEAttribute(curveCharEClass, CURVE_CHAR__VAL);

		directionPhaseEClass = createEClass(DIRECTION_PHASE);
		createEAttribute(directionPhaseEClass, DIRECTION_PHASE__VAL);

		dpStatusEClass = createEClass(DP_STATUS);
		createEAttribute(dpStatusEClass, DP_STATUS__VAL);

		faultDirectionEClass = createEClass(FAULT_DIRECTION);
		createEAttribute(faultDirectionEClass, FAULT_DIRECTION__VAL);

		magReferenceEClass = createEClass(MAG_REFERENCE);
		createEAttribute(magReferenceEClass, MAG_REFERENCE__VAL);

		multiplierEClass = createEClass(MULTIPLIER);
		createEAttribute(multiplierEClass, MULTIPLIER__VAL);

		originatorEClass = createEClass(ORIGINATOR);
		createEAttribute(originatorEClass, ORIGINATOR__ORIDENT);
		createEReference(originatorEClass, ORIGINATOR__OR_CAT);

		originatorCategoryEClass = createEClass(ORIGINATOR_CATEGORY);
		createEAttribute(originatorCategoryEClass, ORIGINATOR_CATEGORY__VAL);

		phaseReferenceEClass = createEClass(PHASE_REFERENCE);
		createEAttribute(phaseReferenceEClass, PHASE_REFERENCE__VAL);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__XVAL);
		createEAttribute(pointEClass, POINT__YVAL);

		pointArrayEClass = createEClass(POINT_ARRAY);
		createEReference(pointArrayEClass, POINT_ARRAY__POINT);

		pulseConfigEClass = createEClass(PULSE_CONFIG);
		createEAttribute(pulseConfigEClass, PULSE_CONFIG__ON_DUR);
		createEAttribute(pulseConfigEClass, PULSE_CONFIG__OFF_DUR);
		createEAttribute(pulseConfigEClass, PULSE_CONFIG__NUM_PLS);
		createEReference(pulseConfigEClass, PULSE_CONFIG__CMD_QUAL);

		qualityEClass = createEClass(QUALITY);
		createEAttribute(qualityEClass, QUALITY__TEST);
		createEAttribute(qualityEClass, QUALITY__OPERATOR_BLOCKED);
		createEAttribute(qualityEClass, QUALITY__VALIDITY);
		createEAttribute(qualityEClass, QUALITY__SOURCE);
		createEReference(qualityEClass, QUALITY__DETAIL_QUAL);

		detailQualEClass = createEClass(DETAIL_QUAL);
		createEAttribute(detailQualEClass, DETAIL_QUAL__OVERFLOW);
		createEAttribute(detailQualEClass, DETAIL_QUAL__OUT_OF_RANGE);
		createEAttribute(detailQualEClass, DETAIL_QUAL__BAD_REFERENCE);
		createEAttribute(detailQualEClass, DETAIL_QUAL__OSCILLATORY);
		createEAttribute(detailQualEClass, DETAIL_QUAL__FAILURE);
		createEAttribute(detailQualEClass, DETAIL_QUAL__OLD_DATA);
		createEAttribute(detailQualEClass, DETAIL_QUAL__INCONSISTENT);
		createEAttribute(detailQualEClass, DETAIL_QUAL__INACCURATE);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__VAL);

		rangeConfigEClass = createEClass(RANGE_CONFIG);
		createEReference(rangeConfigEClass, RANGE_CONFIG__HH_LIM);
		createEReference(rangeConfigEClass, RANGE_CONFIG__HLIM);
		createEReference(rangeConfigEClass, RANGE_CONFIG__LLIM);
		createEReference(rangeConfigEClass, RANGE_CONFIG__LL_LIM);
		createEReference(rangeConfigEClass, RANGE_CONFIG__MIN);
		createEReference(rangeConfigEClass, RANGE_CONFIG__MAX);

		sboClassesEClass = createEClass(SBO_CLASSES);
		createEAttribute(sboClassesEClass, SBO_CLASSES__VAL);

		scaledValueConfigEClass = createEClass(SCALED_VALUE_CONFIG);
		createEAttribute(scaledValueConfigEClass, SCALED_VALUE_CONFIG__SCALE_FACTOR);
		createEAttribute(scaledValueConfigEClass, SCALED_VALUE_CONFIG__OFFSET);

		sequenceEClass = createEClass(SEQUENCE);
		createEAttribute(sequenceEClass, SEQUENCE__VAL);

		severityEClass = createEClass(SEVERITY);
		createEAttribute(severityEClass, SEVERITY__VAL);

		slUnitsEClass = createEClass(SL_UNITS);
		createEAttribute(slUnitsEClass, SL_UNITS__SL_UNITS_KIND);

		unitsEClass = createEClass(UNITS);
		createEReference(unitsEClass, UNITS__SL_UNITS);
		createEReference(unitsEClass, UNITS__MULTIPLIER);

		valWithTransEClass = createEClass(VAL_WITH_TRANS);
		createEAttribute(valWithTransEClass, VAL_WITH_TRANS__POS_VAL);
		createEAttribute(valWithTransEClass, VAL_WITH_TRANS__TRANS_IND);

		vectorEClass = createEClass(VECTOR);
		createEReference(vectorEClass, VECTOR__MAG);
		createEReference(vectorEClass, VECTOR__ANG);

		vectorArrayEClass = createEClass(VECTOR_ARRAY);
		createEReference(vectorArrayEClass, VECTOR_ARRAY__VECTOR);

		c_PrimitiveCDCEClass = createEClass(CPRIMITIVE_CDC);
		createEAttribute(c_PrimitiveCDCEClass, CPRIMITIVE_CDC__CDC_NS);
		createEAttribute(c_PrimitiveCDCEClass, CPRIMITIVE_CDC__CDC_NAME);
		createEAttribute(c_PrimitiveCDCEClass, CPRIMITIVE_CDC__DATA_NS);

		c_ComposedCDCEClass = createEClass(CCOMPOSED_CDC);
		createEAttribute(c_ComposedCDCEClass, CCOMPOSED_CDC__CDC_NS);
		createEAttribute(c_ComposedCDCEClass, CCOMPOSED_CDC__CDC_NAME);
		createEAttribute(c_ComposedCDCEClass, CCOMPOSED_CDC__DATA_NS);

		statusInfoEClass = createEClass(STATUS_INFO);
		createEReference(statusInfoEClass, STATUS_INFO__T);
		createEAttribute(statusInfoEClass, STATUS_INFO__D);
		createEAttribute(statusInfoEClass, STATUS_INFO__DU);

		spsEClass = createEClass(SPS);
		createEAttribute(spsEClass, SPS__ST_VAL);
		createEReference(spsEClass, SPS__Q);
		createEAttribute(spsEClass, SPS__SUB_ENA);
		createEAttribute(spsEClass, SPS__SUB_VAL);
		createEReference(spsEClass, SPS__SUB_Q);
		createEAttribute(spsEClass, SPS__SUB_ID);

		insEClass = createEClass(INS);
		createEAttribute(insEClass, INS__ST_VAL);
		createEReference(insEClass, INS__Q);
		createEAttribute(insEClass, INS__SUB_ENA);
		createEAttribute(insEClass, INS__SUB_VAL);
		createEReference(insEClass, INS__SUB_Q);
		createEAttribute(insEClass, INS__SUB_ID);

		dpsEClass = createEClass(DPS);
		createEReference(dpsEClass, DPS__ST_VAL);
		createEReference(dpsEClass, DPS__Q);
		createEAttribute(dpsEClass, DPS__SUB_ENA);
		createEReference(dpsEClass, DPS__SUB_VAL);
		createEReference(dpsEClass, DPS__SUB_Q);
		createEAttribute(dpsEClass, DPS__SUB_ID);

		actEClass = createEClass(ACT);
		createEAttribute(actEClass, ACT__GENERAL);
		createEAttribute(actEClass, ACT__PHS_A);
		createEAttribute(actEClass, ACT__PHS_B);
		createEAttribute(actEClass, ACT__PHS_C);
		createEAttribute(actEClass, ACT__NEUT);
		createEReference(actEClass, ACT__Q);
		createEReference(actEClass, ACT__OPER_TM);

		acdEClass = createEClass(ACD);
		createEAttribute(acdEClass, ACD__GENERAL);
		createEReference(acdEClass, ACD__DIR_GENERAL);
		createEAttribute(acdEClass, ACD__PHS_A);
		createEReference(acdEClass, ACD__DIR_PHS_A);
		createEAttribute(acdEClass, ACD__PHS_B);
		createEReference(acdEClass, ACD__DIR_PHS_B);
		createEAttribute(acdEClass, ACD__PHS_C);
		createEReference(acdEClass, ACD__DIR_PHS_C);
		createEAttribute(acdEClass, ACD__NEUT);
		createEReference(acdEClass, ACD__DIR_NEUT);
		createEReference(acdEClass, ACD__Q);

		secEClass = createEClass(SEC);
		createEAttribute(secEClass, SEC__CNT);
		createEReference(secEClass, SEC__SEV);
		createEAttribute(secEClass, SEC__ADDR);
		createEAttribute(secEClass, SEC__ADD_INFO);

		bcrEClass = createEClass(BCR);
		createEAttribute(bcrEClass, BCR__ACT_VAL);
		createEAttribute(bcrEClass, BCR__FR_VAL);
		createEReference(bcrEClass, BCR__FR_TM);
		createEReference(bcrEClass, BCR__Q);
		createEReference(bcrEClass, BCR__UNITS);
		createEAttribute(bcrEClass, BCR__PULS_QTY);
		createEAttribute(bcrEClass, BCR__FR_ENA);
		createEReference(bcrEClass, BCR__STR_TM);
		createEAttribute(bcrEClass, BCR__FR_PD);
		createEAttribute(bcrEClass, BCR__FR_RS);

		primitiveMeasureAndInfoEClass = createEClass(PRIMITIVE_MEASURE_AND_INFO);
		createEAttribute(primitiveMeasureAndInfoEClass, PRIMITIVE_MEASURE_AND_INFO__D);
		createEAttribute(primitiveMeasureAndInfoEClass, PRIMITIVE_MEASURE_AND_INFO__DU);

		composedMeasureAndInfoEClass = createEClass(COMPOSED_MEASURE_AND_INFO);
		createEAttribute(composedMeasureAndInfoEClass, COMPOSED_MEASURE_AND_INFO__D);
		createEAttribute(composedMeasureAndInfoEClass, COMPOSED_MEASURE_AND_INFO__DU);

		mvEClass = createEClass(MV);
		createEReference(mvEClass, MV__INST_MAG);
		createEReference(mvEClass, MV__MAG);
		createEReference(mvEClass, MV__RANGE);
		createEReference(mvEClass, MV__Q);
		createEReference(mvEClass, MV__T);
		createEAttribute(mvEClass, MV__SUB_ENA);
		createEReference(mvEClass, MV__SUB_MAG);
		createEReference(mvEClass, MV__SUB_Q);
		createEAttribute(mvEClass, MV__SUB_ID);
		createEReference(mvEClass, MV__UNITS);
		createEAttribute(mvEClass, MV__DB);
		createEAttribute(mvEClass, MV__ZERO_DB);
		createEReference(mvEClass, MV__SVC);
		createEReference(mvEClass, MV__RANGE_C);
		createEAttribute(mvEClass, MV__SMP_RATE);

		cmvEClass = createEClass(CMV);
		createEReference(cmvEClass, CMV__INST_CVAL);
		createEReference(cmvEClass, CMV__CVAL);
		createEReference(cmvEClass, CMV__RANGE);
		createEReference(cmvEClass, CMV__Q);
		createEReference(cmvEClass, CMV__T);
		createEAttribute(cmvEClass, CMV__SUB_ENA);
		createEReference(cmvEClass, CMV__SUB_CVAL);
		createEReference(cmvEClass, CMV__SUB_Q);
		createEAttribute(cmvEClass, CMV__SUB_ID);
		createEReference(cmvEClass, CMV__UNITS);
		createEAttribute(cmvEClass, CMV__DB);
		createEAttribute(cmvEClass, CMV__ZERO_DB);
		createEReference(cmvEClass, CMV__RANGE_C);
		createEReference(cmvEClass, CMV__MAG_SVC);
		createEReference(cmvEClass, CMV__ANG_SVC);
		createEReference(cmvEClass, CMV__ANG_REF);
		createEAttribute(cmvEClass, CMV__SMP_RATE);

		savEClass = createEClass(SAV);
		createEReference(savEClass, SAV__INST_MAG);
		createEReference(savEClass, SAV__Q);
		createEReference(savEClass, SAV__T);
		createEReference(savEClass, SAV__UNITS);
		createEReference(savEClass, SAV__SVC);
		createEReference(savEClass, SAV__MIN);
		createEReference(savEClass, SAV__MAX);

		delEClass = createEClass(DEL);
		createEReference(delEClass, DEL__PHS_AB);
		createEReference(delEClass, DEL__PHS_BC);
		createEReference(delEClass, DEL__PHS_CA);
		createEReference(delEClass, DEL__ANG_REF);

		wyeEClass = createEClass(WYE);
		createEReference(wyeEClass, WYE__PHS_A);
		createEReference(wyeEClass, WYE__PHS_B);
		createEReference(wyeEClass, WYE__PHS_C);
		createEReference(wyeEClass, WYE__NEUT);
		createEReference(wyeEClass, WYE__NET);
		createEReference(wyeEClass, WYE__RES);
		createEReference(wyeEClass, WYE__ANG_REF);

		seqEClass = createEClass(SEQ);
		createEReference(seqEClass, SEQ__C1);
		createEReference(seqEClass, SEQ__C2);
		createEReference(seqEClass, SEQ__C3);
		createEReference(seqEClass, SEQ__SEQ_T);
		createEReference(seqEClass, SEQ__PHS_REF);

		hmvEClass = createEClass(HMV);
		createEReference(hmvEClass, HMV__Q);
		createEReference(hmvEClass, HMV__T);
		createEReference(hmvEClass, HMV__HAR);
		createEAttribute(hmvEClass, HMV__NUM_HAR);
		createEAttribute(hmvEClass, HMV__NUM_CYC);
		createEAttribute(hmvEClass, HMV__EVAL_TM);
		createEReference(hmvEClass, HMV__UNITS);
		createEAttribute(hmvEClass, HMV__SMP_RATE);
		createEAttribute(hmvEClass, HMV__FREQUENCY);
		createEReference(hmvEClass, HMV__HV_REF);
		createEAttribute(hmvEClass, HMV__RMS_CYC);

		hyweEClass = createEClass(HYWE);
		createEReference(hyweEClass, HYWE__Q);
		createEReference(hyweEClass, HYWE__T);
		createEReference(hyweEClass, HYWE__PHS_AHAR);
		createEReference(hyweEClass, HYWE__PHS_BHAR);
		createEReference(hyweEClass, HYWE__PHS_CHAR);
		createEReference(hyweEClass, HYWE__NEUT_HAR);
		createEReference(hyweEClass, HYWE__NET_HAR);
		createEReference(hyweEClass, HYWE__RES_HAR);
		createEAttribute(hyweEClass, HYWE__NUM_HAR);
		createEAttribute(hyweEClass, HYWE__NUM_CYC);
		createEAttribute(hyweEClass, HYWE__EVAL_TM);
		createEReference(hyweEClass, HYWE__UNITS);
		createEReference(hyweEClass, HYWE__ANG_REF);
		createEAttribute(hyweEClass, HYWE__SMP_RATE);
		createEAttribute(hyweEClass, HYWE__FREQUENCY);
		createEReference(hyweEClass, HYWE__HV_REF);
		createEAttribute(hyweEClass, HYWE__RMS_CYC);

		hdelEClass = createEClass(HDEL);
		createEReference(hdelEClass, HDEL__Q);
		createEReference(hdelEClass, HDEL__T);
		createEReference(hdelEClass, HDEL__PHS_AB_HAR);
		createEReference(hdelEClass, HDEL__PHS_BC_HAR);
		createEReference(hdelEClass, HDEL__PHS_CA_HAR);
		createEAttribute(hdelEClass, HDEL__NUM_HAR);
		createEAttribute(hdelEClass, HDEL__NUM_CYC);
		createEAttribute(hdelEClass, HDEL__EVAL_TM);
		createEReference(hdelEClass, HDEL__UNITS);
		createEReference(hdelEClass, HDEL__ANG_REF);
		createEAttribute(hdelEClass, HDEL__SMP_RATE);
		createEAttribute(hdelEClass, HDEL__FREQUENCY);
		createEReference(hdelEClass, HDEL__HV_REF);
		createEAttribute(hdelEClass, HDEL__RMS_CYC);

		controllableStatusInfoEClass = createEClass(CONTROLLABLE_STATUS_INFO);
		createEReference(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__OPER_TM);
		createEReference(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__ORIGIN);
		createEAttribute(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__CTL_NUM);
		createEAttribute(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__ST_SELD);
		createEAttribute(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__SUB_ENA);
		createEReference(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__SUB_Q);
		createEAttribute(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__SUB_ID);
		createEReference(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__CTL_MODEL);
		createEAttribute(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__SBO_TIMEOUT);
		createEReference(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__SBO_CLASS);
		createEAttribute(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__D);
		createEAttribute(controllableStatusInfoEClass, CONTROLLABLE_STATUS_INFO__DU);

		spcEClass = createEClass(SPC);
		createEAttribute(spcEClass, SPC__CTL_VAL);
		createEAttribute(spcEClass, SPC__ST_VAL);
		createEReference(spcEClass, SPC__Q);
		createEReference(spcEClass, SPC__T);
		createEAttribute(spcEClass, SPC__SUB_VAL);
		createEReference(spcEClass, SPC__PULSE_CONFIG);

		dpcEClass = createEClass(DPC);
		createEAttribute(dpcEClass, DPC__CTL_VAL);
		createEReference(dpcEClass, DPC__ST_VAL);
		createEReference(dpcEClass, DPC__Q);
		createEReference(dpcEClass, DPC__T);
		createEReference(dpcEClass, DPC__SUB_VAL);
		createEReference(dpcEClass, DPC__PULSE_CONFIG);

		incEClass = createEClass(INC);
		createEAttribute(incEClass, INC__CTL_VAL);
		createEAttribute(incEClass, INC__ST_VAL);
		createEReference(incEClass, INC__Q);
		createEReference(incEClass, INC__T);
		createEAttribute(incEClass, INC__SUB_VAL);
		createEAttribute(incEClass, INC__MIN_VAL);
		createEAttribute(incEClass, INC__MAX_VAL);
		createEAttribute(incEClass, INC__STEP_SIZE);

		bscEClass = createEClass(BSC);
		createEReference(bscEClass, BSC__CTL_VAL);
		createEReference(bscEClass, BSC__VAL_WTR);
		createEReference(bscEClass, BSC__Q);
		createEReference(bscEClass, BSC__T);
		createEReference(bscEClass, BSC__SUB_VAL);
		createEAttribute(bscEClass, BSC__PERSISTENT);
		createEAttribute(bscEClass, BSC__MIN_VAL);
		createEAttribute(bscEClass, BSC__MAX_VAL);
		createEAttribute(bscEClass, BSC__STEP_SIZE);

		iscEClass = createEClass(ISC);
		createEAttribute(iscEClass, ISC__CTL_VAL);
		createEReference(iscEClass, ISC__VAL_WTR);
		createEReference(iscEClass, ISC__T);
		createEReference(iscEClass, ISC__Q);
		createEReference(iscEClass, ISC__SUB_VAL);
		createEAttribute(iscEClass, ISC__MIN_VAL);
		createEAttribute(iscEClass, ISC__MAX_VAL);
		createEAttribute(iscEClass, ISC__STEP_SIZE);

		controllableAnalogueInfoEClass = createEClass(CONTROLLABLE_ANALOGUE_INFO);
		createEReference(controllableAnalogueInfoEClass, CONTROLLABLE_ANALOGUE_INFO__APC);
		createEReference(controllableAnalogueInfoEClass, CONTROLLABLE_ANALOGUE_INFO__CPRIMITIVE_CDC);

		apcEClass = createEClass(APC);
		createEReference(apcEClass, APC__SET_MAG);
		createEReference(apcEClass, APC__ORIGIN);
		createEReference(apcEClass, APC__OPER_TM);
		createEReference(apcEClass, APC__Q);
		createEReference(apcEClass, APC__T);
		createEReference(apcEClass, APC__CTL_MODEL);
		createEReference(apcEClass, APC__UNITS);
		createEReference(apcEClass, APC__SVC);
		createEReference(apcEClass, APC__MIN_VAL);
		createEReference(apcEClass, APC__MAX_VAL);
		createEReference(apcEClass, APC__STEP_SIZE);
		createEAttribute(apcEClass, APC__D);
		createEAttribute(apcEClass, APC__DU);

		spgEClass = createEClass(SPG);
		createEAttribute(spgEClass, SPG__SET_VAL);

		ingEClass = createEClass(ING);
		createEAttribute(ingEClass, ING__SET_VAL);
		createEAttribute(ingEClass, ING__MIN_VAL);
		createEAttribute(ingEClass, ING__MAX_VAL);
		createEAttribute(ingEClass, ING__STEP_SIZE);

		analogueSettingsEClass = createEClass(ANALOGUE_SETTINGS);
		createEAttribute(analogueSettingsEClass, ANALOGUE_SETTINGS__D);
		createEAttribute(analogueSettingsEClass, ANALOGUE_SETTINGS__DU);

		asgEClass = createEClass(ASG);
		createEReference(asgEClass, ASG__SET_MAG);
		createEReference(asgEClass, ASG__UNITS);
		createEReference(asgEClass, ASG__SVC);
		createEReference(asgEClass, ASG__MIN_VAL);
		createEReference(asgEClass, ASG__MAX_VAL);
		createEReference(asgEClass, ASG__STEP_SIZE);

		curveEClass = createEClass(CURVE);
		createEReference(curveEClass, CURVE__SET_CHARACT);
		createEAttribute(curveEClass, CURVE__SET_PAR_A);
		createEAttribute(curveEClass, CURVE__SET_PAR_B);
		createEAttribute(curveEClass, CURVE__SET_PAR_C);
		createEAttribute(curveEClass, CURVE__SET_PAR_D);
		createEAttribute(curveEClass, CURVE__SET_PAR_E);
		createEAttribute(curveEClass, CURVE__SET_PAR_F);

		descriptionInfoEClass = createEClass(DESCRIPTION_INFO);
		createEReference(descriptionInfoEClass, DESCRIPTION_INFO__DPL);
		createEReference(descriptionInfoEClass, DESCRIPTION_INFO__LPL);
		createEReference(descriptionInfoEClass, DESCRIPTION_INFO__CSD);
		createEReference(descriptionInfoEClass, DESCRIPTION_INFO__CPRIMITIVE_CDC);

		dplEClass = createEClass(DPL);
		createEAttribute(dplEClass, DPL__VENDOR);
		createEAttribute(dplEClass, DPL__HW_REV);
		createEAttribute(dplEClass, DPL__SW_REV);
		createEAttribute(dplEClass, DPL__SER_NUM);
		createEAttribute(dplEClass, DPL__MODEL);
		createEAttribute(dplEClass, DPL__LOCATION);

		lplEClass = createEClass(LPL);
		createEAttribute(lplEClass, LPL__VENDOR);
		createEAttribute(lplEClass, LPL__SW_REV);
		createEAttribute(lplEClass, LPL__D);
		createEAttribute(lplEClass, LPL__DU);
		createEAttribute(lplEClass, LPL__CONFIG_REV);
		createEAttribute(lplEClass, LPL__ID_NS);
		createEAttribute(lplEClass, LPL__LN_NS);

		csdEClass = createEClass(CSD);
		createEReference(csdEClass, CSD__XUNIT);
		createEAttribute(csdEClass, CSD__XD);
		createEReference(csdEClass, CSD__YUNIT);
		createEAttribute(csdEClass, CSD__YD);
		createEAttribute(csdEClass, CSD__NUM_PTS);
		createEReference(csdEClass, CSD__CRV_PTS);
		createEAttribute(csdEClass, CSD__D);
		createEAttribute(csdEClass, CSD__DU);
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
		EnumerationsPackage theEnumerationsPackage = (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(timeStampEClass, TimeStamp.class, "TimeStamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeStamp_Val(), this.getP_TimeStamp(), null, "val", null, 1, 1, TimeStamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(p_TimeStampEClass, P_TimeStamp.class, "P_TimeStamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getP_TimeStamp_SecondSinceEpoch(), ecorePackage.getEInt(), "secondSinceEpoch", null, 0, 1, P_TimeStamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getP_TimeStamp_FractionOfSecond(), ecorePackage.getEInt(), "fractionOfSecond", null, 0, 1, P_TimeStamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getP_TimeStamp_TimeQuality(), this.getTimeQuality(), null, "timeQuality", null, 1, 1, P_TimeStamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeQualityEClass, TimeQuality.class, "TimeQuality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeQuality_LeapSecondsKnown(), ecorePackage.getEBoolean(), "leapSecondsKnown", null, 0, 1, TimeQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeQuality_ClockFailure(), ecorePackage.getEBoolean(), "clockFailure", null, 0, 1, TimeQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeQuality_ClockNotSynchronized(), ecorePackage.getEBoolean(), "clockNotSynchronized", null, 0, 1, TimeQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeQuality_TimeAccuracy(), theEnumerationsPackage.getTimeAccuracyKind(), "timeAccuracy", null, 0, 1, TimeQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogueValueEClass, AnalogueValue.class, "AnalogueValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalogueValue_I(), ecorePackage.getEInt(), "i", null, 0, 1, AnalogueValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueValue_F(), ecorePackage.getEFloat(), "f", null, 0, 1, AnalogueValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(angleReferenceEClass, AngleReference.class, "AngleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngleReference_Val(), theEnumerationsPackage.getAngleReferenceKind(), "val", null, 0, 1, AngleReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bsControlEClass, BSControl.class, "BSControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBSControl_Val(), theEnumerationsPackage.getBSControlKind(), "val", null, 0, 1, BSControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmvAngleReferenceEClass, CMVAngleReference.class, "CMVAngleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCMVAngleReference_Val(), theEnumerationsPackage.getCMVAngleReferenceKind(), "val", null, 0, 1, CMVAngleReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlOutputEClass, ControlOutput.class, "ControlOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlOutput_Val(), theEnumerationsPackage.getControlOutputKind(), "val", null, 0, 1, ControlOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctlModelsEClass, CtlModels.class, "CtlModels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCtlModels_Val(), theEnumerationsPackage.getCtlModelsKind(), "val", null, 0, 1, CtlModels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curveCharEClass, CurveChar.class, "CurveChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurveChar_Val(), theEnumerationsPackage.getCurveCharKind(), "val", null, 0, 1, CurveChar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directionPhaseEClass, DirectionPhase.class, "DirectionPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectionPhase_Val(), theEnumerationsPackage.getDirectionPhaseKind(), "val", null, 0, 1, DirectionPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dpStatusEClass, DPStatus.class, "DPStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDPStatus_Val(), theEnumerationsPackage.getDPStatusKind(), "val", null, 0, 1, DPStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultDirectionEClass, FaultDirection.class, "FaultDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaultDirection_Val(), theEnumerationsPackage.getFaultDirectionKind(), "val", null, 0, 1, FaultDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(magReferenceEClass, MagReference.class, "MagReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMagReference_Val(), theEnumerationsPackage.getMagReferenceKind(), "val", null, 0, 1, MagReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplierEClass, Multiplier.class, "Multiplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplier_Val(), theEnumerationsPackage.getMultiplierKind(), "val", null, 0, 1, Multiplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(originatorEClass, Originator.class, "Originator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOriginator_Orident(), ecorePackage.getEString(), "orident", null, 0, 1, Originator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOriginator_OrCat(), this.getOriginatorCategory(), null, "orCat", null, 1, 1, Originator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(originatorCategoryEClass, OriginatorCategory.class, "OriginatorCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOriginatorCategory_Val(), theEnumerationsPackage.getOriginatorCategoryKind(), "val", null, 0, 1, OriginatorCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseReferenceEClass, PhaseReference.class, "PhaseReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhaseReference_Val(), theEnumerationsPackage.getPhaseReferenceKind(), "val", null, 0, 1, PhaseReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_XVal(), ecorePackage.getEFloat(), "xVal", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_YVal(), ecorePackage.getEFloat(), "yVal", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointArrayEClass, PointArray.class, "PointArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointArray_Point(), this.getPoint(), null, "point", null, 1, -1, PointArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pulseConfigEClass, PulseConfig.class, "PulseConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPulseConfig_OnDur(), ecorePackage.getEInt(), "onDur", null, 0, 1, PulseConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPulseConfig_OffDur(), ecorePackage.getEInt(), "offDur", null, 0, 1, PulseConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPulseConfig_NumPls(), ecorePackage.getEInt(), "numPls", null, 0, 1, PulseConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPulseConfig_CmdQual(), this.getControlOutput(), null, "cmdQual", null, 1, 1, PulseConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityEClass, Quality.class, "Quality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuality_Test(), ecorePackage.getEBoolean(), "test", null, 0, 1, Quality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuality_OperatorBlocked(), ecorePackage.getEBoolean(), "operatorBlocked", null, 0, 1, Quality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuality_Validity(), theEnumerationsPackage.getValidityKind(), "validity", null, 0, 1, Quality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuality_Source(), theEnumerationsPackage.getSourceKind(), "source", null, 0, 1, Quality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuality_DetailQual(), this.getDetailQual(), null, "detailQual", null, 1, 1, Quality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailQualEClass, DetailQual.class, "DetailQual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailQual_Overflow(), ecorePackage.getEBoolean(), "overflow", null, 0, 1, DetailQual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailQual_OutOfRange(), ecorePackage.getEBoolean(), "outOfRange", null, 0, 1, DetailQual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailQual_BadReference(), ecorePackage.getEBoolean(), "badReference", null, 0, 1, DetailQual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailQual_Oscillatory(), ecorePackage.getEBoolean(), "oscillatory", null, 0, 1, DetailQual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailQual_Failure(), ecorePackage.getEBoolean(), "failure", null, 0, 1, DetailQual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailQual_OldData(), ecorePackage.getEBoolean(), "oldData", null, 0, 1, DetailQual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailQual_Inconsistent(), ecorePackage.getEBoolean(), "inconsistent", null, 0, 1, DetailQual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailQual_Inaccurate(), ecorePackage.getEBoolean(), "inaccurate", null, 0, 1, DetailQual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_Val(), theEnumerationsPackage.getRangeKind(), "val", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeConfigEClass, RangeConfig.class, "RangeConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeConfig_HhLim(), this.getAnalogueValue(), null, "hhLim", null, 1, 1, RangeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangeConfig_HLim(), this.getAnalogueValue(), null, "hLim", null, 1, 1, RangeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangeConfig_LLim(), this.getAnalogueValue(), null, "lLim", null, 1, 1, RangeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangeConfig_LlLim(), this.getAnalogueValue(), null, "llLim", null, 1, 1, RangeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangeConfig_Min(), this.getAnalogueValue(), null, "min", null, 1, 1, RangeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangeConfig_Max(), this.getAnalogueValue(), null, "max", null, 1, 1, RangeConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sboClassesEClass, SboClasses.class, "SboClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSboClasses_Val(), theEnumerationsPackage.getSboClassesKind(), "val", null, 0, 1, SboClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaledValueConfigEClass, ScaledValueConfig.class, "ScaledValueConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScaledValueConfig_ScaleFactor(), ecorePackage.getEFloat(), "scaleFactor", null, 0, 1, ScaledValueConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScaledValueConfig_Offset(), ecorePackage.getEFloat(), "offset", null, 0, 1, ScaledValueConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequence_Val(), theEnumerationsPackage.getSequenceKind(), "val", null, 0, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(severityEClass, Severity.class, "Severity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeverity_Val(), theEnumerationsPackage.getSeverityKind(), "val", null, 0, 1, Severity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slUnitsEClass, SlUnits.class, "SlUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlUnits_SlUnitsKind(), theEnumerationsPackage.getSIUnitsKind(), "SlUnitsKind", null, 0, 1, SlUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitsEClass, Units.class, "Units", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnits_SlUnits(), this.getSlUnits(), null, "SlUnits", null, 1, 1, Units.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnits_Multiplier(), this.getMultiplier(), null, "multiplier", null, 1, 1, Units.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valWithTransEClass, ValWithTrans.class, "ValWithTrans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValWithTrans_PosVal(), ecorePackage.getEInt(), "posVal", null, 0, 1, ValWithTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValWithTrans_TransInd(), ecorePackage.getEBoolean(), "transInd", null, 0, 1, ValWithTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorEClass, Vector.class, "Vector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVector_Mag(), this.getAnalogueValue(), null, "mag", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVector_Ang(), this.getAnalogueValue(), null, "ang", null, 1, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorArrayEClass, VectorArray.class, "VectorArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVectorArray_Vector(), this.getVector(), null, "Vector", null, 1, -1, VectorArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c_PrimitiveCDCEClass, C_PrimitiveCDC.class, "C_PrimitiveCDC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC_PrimitiveCDC_CdcNs(), ecorePackage.getEString(), "cdcNs", null, 0, 1, C_PrimitiveCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC_PrimitiveCDC_CdcName(), ecorePackage.getEString(), "cdcName", null, 0, 1, C_PrimitiveCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC_PrimitiveCDC_DataNs(), ecorePackage.getEString(), "dataNs", null, 0, 1, C_PrimitiveCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c_ComposedCDCEClass, C_ComposedCDC.class, "C_ComposedCDC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC_ComposedCDC_CdcNs(), ecorePackage.getEString(), "cdcNs", null, 0, 1, C_ComposedCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC_ComposedCDC_CdcName(), ecorePackage.getEString(), "cdcName", null, 0, 1, C_ComposedCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC_ComposedCDC_DataNs(), ecorePackage.getEString(), "dataNs", null, 0, 1, C_ComposedCDC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusInfoEClass, StatusInfo.class, "StatusInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatusInfo_T(), this.getTimeStamp(), null, "t", null, 1, 1, StatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusInfo_D(), ecorePackage.getEString(), "d", null, 0, 1, StatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusInfo_DU(), ecorePackage.getEString(), "dU", null, 0, 1, StatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spsEClass, substationStandard.Dataclasses.SPS.class, "SPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPS_StVal(), ecorePackage.getEBoolean(), "stVal", null, 0, 1, substationStandard.Dataclasses.SPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPS_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.SPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPS_SubEna(), ecorePackage.getEBoolean(), "subEna", null, 0, 1, substationStandard.Dataclasses.SPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPS_SubVal(), ecorePackage.getEBoolean(), "subVal", null, 0, 1, substationStandard.Dataclasses.SPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPS_SubQ(), this.getQuality(), null, "subQ", null, 1, 1, substationStandard.Dataclasses.SPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPS_SubID(), ecorePackage.getEString(), "subID", null, 0, 1, substationStandard.Dataclasses.SPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insEClass, substationStandard.Dataclasses.INS.class, "INS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINS_StVal(), ecorePackage.getEInt(), "stVal", null, 0, 1, substationStandard.Dataclasses.INS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getINS_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.INS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINS_SubEna(), ecorePackage.getEBoolean(), "subEna", null, 0, 1, substationStandard.Dataclasses.INS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINS_SubVal(), ecorePackage.getEInt(), "subVal", null, 0, 1, substationStandard.Dataclasses.INS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getINS_SubQ(), this.getQuality(), null, "subQ", null, 1, 1, substationStandard.Dataclasses.INS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINS_SubID(), ecorePackage.getEString(), "subID", null, 0, 1, substationStandard.Dataclasses.INS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dpsEClass, substationStandard.Dataclasses.DPS.class, "DPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDPS_StVal(), this.getDPStatus(), null, "stVal", null, 1, 1, substationStandard.Dataclasses.DPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPS_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.DPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPS_SubEna(), ecorePackage.getEBoolean(), "subEna", null, 0, 1, substationStandard.Dataclasses.DPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPS_SubVal(), this.getDPStatus(), null, "subVal", null, 1, 1, substationStandard.Dataclasses.DPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPS_SubQ(), this.getQuality(), null, "subQ", null, 1, 1, substationStandard.Dataclasses.DPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPS_SubID(), ecorePackage.getEString(), "subID", null, 0, 1, substationStandard.Dataclasses.DPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actEClass, substationStandard.Dataclasses.ACT.class, "ACT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getACT_General(), ecorePackage.getEBoolean(), "general", null, 0, 1, substationStandard.Dataclasses.ACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACT_PhsA(), ecorePackage.getEBoolean(), "phsA", null, 0, 1, substationStandard.Dataclasses.ACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACT_PhsB(), ecorePackage.getEBoolean(), "phsB", null, 0, 1, substationStandard.Dataclasses.ACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACT_PhsC(), ecorePackage.getEBoolean(), "phsC", null, 0, 1, substationStandard.Dataclasses.ACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACT_Neut(), ecorePackage.getEBoolean(), "neut", null, 0, 1, substationStandard.Dataclasses.ACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACT_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.ACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACT_OperTm(), this.getTimeStamp(), null, "operTm", null, 1, 1, substationStandard.Dataclasses.ACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acdEClass, substationStandard.Dataclasses.ACD.class, "ACD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getACD_General(), ecorePackage.getEBoolean(), "general", null, 0, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACD_DirGeneral(), this.getFaultDirection(), null, "dirGeneral", null, 1, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACD_PhsA(), ecorePackage.getEBoolean(), "phsA", null, 0, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACD_DirPhsA(), this.getDirectionPhase(), null, "dirPhsA", null, 1, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACD_PhsB(), ecorePackage.getEBoolean(), "phsB", null, 0, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACD_DirPhsB(), this.getDirectionPhase(), null, "dirPhsB", null, 1, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACD_PhsC(), ecorePackage.getEBoolean(), "phsC", null, 0, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACD_DirPhsC(), this.getDirectionPhase(), null, "dirPhsC", null, 1, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACD_Neut(), ecorePackage.getEBoolean(), "neut", null, 0, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACD_DirNeut(), this.getDirectionPhase(), null, "dirNeut", null, 1, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACD_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.ACD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secEClass, substationStandard.Dataclasses.SEC.class, "SEC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSEC_Cnt(), ecorePackage.getEInt(), "cnt", null, 0, 1, substationStandard.Dataclasses.SEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSEC_Sev(), this.getSeverity(), null, "sev", null, 1, 1, substationStandard.Dataclasses.SEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSEC_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, substationStandard.Dataclasses.SEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSEC_AddInfo(), ecorePackage.getEString(), "addInfo", null, 0, 1, substationStandard.Dataclasses.SEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bcrEClass, substationStandard.Dataclasses.BCR.class, "BCR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBCR_ActVal(), ecorePackage.getEInt(), "actVal", null, 0, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBCR_FrVal(), ecorePackage.getEInt(), "frVal", null, 0, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCR_FrTm(), this.getTimeStamp(), null, "frTm", null, 1, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCR_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCR_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBCR_PulsQty(), ecorePackage.getEFloat(), "pulsQty", null, 0, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBCR_FrEna(), ecorePackage.getEBoolean(), "frEna", null, 0, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCR_StrTm(), this.getTimeStamp(), null, "strTm", null, 1, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBCR_FrPd(), ecorePackage.getEInt(), "frPd", null, 0, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBCR_FrRs(), ecorePackage.getEBoolean(), "frRs", null, 0, 1, substationStandard.Dataclasses.BCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveMeasureAndInfoEClass, PrimitiveMeasureAndInfo.class, "PrimitiveMeasureAndInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveMeasureAndInfo_D(), ecorePackage.getEString(), "d", null, 0, 1, PrimitiveMeasureAndInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimitiveMeasureAndInfo_DU(), ecorePackage.getEString(), "dU", null, 0, 1, PrimitiveMeasureAndInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedMeasureAndInfoEClass, ComposedMeasureAndInfo.class, "ComposedMeasureAndInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposedMeasureAndInfo_D(), ecorePackage.getEString(), "d", null, 0, 1, ComposedMeasureAndInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposedMeasureAndInfo_DU(), ecorePackage.getEString(), "dU", null, 0, 1, ComposedMeasureAndInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mvEClass, substationStandard.Dataclasses.MV.class, "MV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMV_InstMag(), this.getAnalogueValue(), null, "instMag", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_Mag(), this.getAnalogueValue(), null, "mag", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_Range(), this.getRange(), null, "range", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMV_SubEna(), ecorePackage.getEBoolean(), "subEna", null, 0, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_SubMag(), this.getAnalogueValue(), null, "subMag", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_SubQ(), this.getQuality(), null, "subQ", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMV_SubID(), ecorePackage.getEString(), "subID", null, 0, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMV_Db(), ecorePackage.getEInt(), "db", null, 0, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMV_ZeroDb(), ecorePackage.getEInt(), "zeroDb", null, 0, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_SVC(), this.getScaledValueConfig(), null, "sVC", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMV_RangeC(), this.getRangeConfig(), null, "rangeC", null, 1, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMV_SmpRate(), ecorePackage.getEInt(), "smpRate", null, 0, 1, substationStandard.Dataclasses.MV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmvEClass, substationStandard.Dataclasses.CMV.class, "CMV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMV_InstCVal(), this.getVector(), null, "instCVal", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_CVal(), this.getVector(), null, "cVal", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_Range(), this.getRange(), null, "range", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMV_SubEna(), ecorePackage.getEBoolean(), "subEna", null, 0, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_SubCVal(), this.getVector(), null, "subCVal", null, 0, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_SubQ(), this.getQuality(), null, "subQ", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMV_SubID(), ecorePackage.getEString(), "subID", null, 0, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMV_Db(), ecorePackage.getEInt(), "db", null, 0, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMV_ZeroDb(), ecorePackage.getEInt(), "zeroDb", null, 0, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_RangeC(), this.getRangeConfig(), null, "rangeC", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_MagSVC(), this.getScaledValueConfig(), null, "magSVC", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_AngSVC(), this.getScaledValueConfig(), null, "angSVC", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMV_AngRef(), this.getCMVAngleReference(), null, "angRef", null, 1, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCMV_SmpRate(), ecorePackage.getEInt(), "smpRate", null, 0, 1, substationStandard.Dataclasses.CMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(savEClass, substationStandard.Dataclasses.SAV.class, "SAV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSAV_InstMag(), this.getAnalogueValue(), null, "instMag", null, 1, 1, substationStandard.Dataclasses.SAV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAV_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.SAV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAV_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.SAV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAV_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.SAV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAV_SVC(), this.getScaledValueConfig(), null, "sVC", null, 1, 1, substationStandard.Dataclasses.SAV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAV_Min(), this.getAnalogueValue(), null, "min", null, 1, 1, substationStandard.Dataclasses.SAV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAV_Max(), this.getAnalogueValue(), null, "max", null, 1, 1, substationStandard.Dataclasses.SAV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delEClass, substationStandard.Dataclasses.DEL.class, "DEL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEL_PhsAB(), this.getCMV(), null, "phsAB", null, 1, 1, substationStandard.Dataclasses.DEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEL_PhsBC(), this.getCMV(), null, "phsBC", null, 1, 1, substationStandard.Dataclasses.DEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEL_PhsCA(), this.getCMV(), null, "phsCA", null, 1, 1, substationStandard.Dataclasses.DEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEL_AngRef(), this.getAngleReference(), null, "angRef", null, 1, 1, substationStandard.Dataclasses.DEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wyeEClass, substationStandard.Dataclasses.WYE.class, "WYE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWYE_PhsA(), this.getCMV(), null, "phsA", null, 1, 1, substationStandard.Dataclasses.WYE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWYE_PhsB(), this.getCMV(), null, "phsB", null, 1, 1, substationStandard.Dataclasses.WYE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWYE_PhsC(), this.getCMV(), null, "phsC", null, 1, 1, substationStandard.Dataclasses.WYE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWYE_Neut(), this.getCMV(), null, "neut", null, 1, 1, substationStandard.Dataclasses.WYE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWYE_Net(), this.getCMV(), null, "net", null, 1, 1, substationStandard.Dataclasses.WYE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWYE_Res(), this.getCMV(), null, "res", null, 1, 1, substationStandard.Dataclasses.WYE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWYE_AngRef(), this.getAngleReference(), null, "angRef", null, 1, 1, substationStandard.Dataclasses.WYE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seqEClass, substationStandard.Dataclasses.SEQ.class, "SEQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEQ_C1(), this.getCMV(), null, "c1", null, 1, 1, substationStandard.Dataclasses.SEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSEQ_C2(), this.getCMV(), null, "c2", null, 1, 1, substationStandard.Dataclasses.SEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSEQ_C3(), this.getCMV(), null, "c3", null, 1, 1, substationStandard.Dataclasses.SEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSEQ_SeqT(), this.getSequence(), null, "seqT", null, 1, 1, substationStandard.Dataclasses.SEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSEQ_PhsRef(), this.getPhaseReference(), null, "phsRef", null, 1, 1, substationStandard.Dataclasses.SEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmvEClass, substationStandard.Dataclasses.HMV.class, "HMV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMV_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMV_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMV_Har(), this.getVectorArray(), null, "har", null, 1, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHMV_NumHar(), ecorePackage.getEInt(), "numHar", null, 0, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHMV_NumCyc(), ecorePackage.getEInt(), "numCyc", null, 0, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHMV_EvalTm(), ecorePackage.getEInt(), "evalTm", null, 0, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMV_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHMV_SmpRate(), ecorePackage.getEInt(), "smpRate", null, 0, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHMV_Frequency(), ecorePackage.getEFloat(), "frequency", null, 0, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMV_HvRef(), this.getMagReference(), null, "hvRef", null, 1, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHMV_RmsCyc(), ecorePackage.getEInt(), "rmsCyc", null, 0, 1, substationStandard.Dataclasses.HMV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hyweEClass, substationStandard.Dataclasses.HYWE.class, "HYWE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHYWE_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_PhsAHar(), this.getVectorArray(), null, "phsAHar", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_PhsBHar(), this.getVectorArray(), null, "phsBHar", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_PhsCHar(), this.getVectorArray(), null, "phsCHar", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_NeutHar(), this.getVectorArray(), null, "neutHar", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_NetHar(), this.getVectorArray(), null, "netHar", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_ResHar(), this.getVectorArray(), null, "resHar", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHYWE_NumHar(), ecorePackage.getEInt(), "numHar", null, 0, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHYWE_NumCyc(), ecorePackage.getEInt(), "numCyc", null, 0, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHYWE_EvalTm(), ecorePackage.getEInt(), "evalTm", null, 0, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_AngRef(), this.getAngleReference(), null, "angRef", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHYWE_SmpRate(), ecorePackage.getEInt(), "smpRate", null, 0, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHYWE_Frequency(), ecorePackage.getEFloat(), "frequency", null, 0, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHYWE_HvRef(), this.getMagReference(), null, "hvRef", null, 1, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHYWE_RmsCyc(), ecorePackage.getEInt(), "rmsCyc", null, 0, 1, substationStandard.Dataclasses.HYWE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hdelEClass, substationStandard.Dataclasses.HDEL.class, "HDEL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHDEL_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDEL_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDEL_PhsABHar(), this.getVectorArray(), null, "phsABHar", null, 1, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDEL_PhsBCHar(), this.getVectorArray(), null, "phsBCHar", null, 1, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDEL_PhsCAHar(), this.getVectorArray(), null, "phsCAHar", null, 1, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHDEL_NumHar(), ecorePackage.getEInt(), "numHar", null, 0, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHDEL_NumCyc(), ecorePackage.getEInt(), "numCyc", null, 0, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHDEL_EvalTm(), ecorePackage.getEInt(), "evalTm", null, 0, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDEL_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDEL_AngRef(), this.getAngleReference(), null, "angRef", null, 1, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHDEL_SmpRate(), ecorePackage.getEInt(), "smpRate", null, 0, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHDEL_Frequency(), ecorePackage.getEFloat(), "frequency", null, 0, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDEL_HvRef(), this.getMagReference(), null, "hvRef", null, 1, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHDEL_RmsCyc(), ecorePackage.getEInt(), "rmsCyc", null, 0, 1, substationStandard.Dataclasses.HDEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllableStatusInfoEClass, ControllableStatusInfo.class, "ControllableStatusInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllableStatusInfo_OperTm(), this.getTimeStamp(), null, "operTm", null, 1, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllableStatusInfo_Origin(), this.getOriginator(), null, "origin", null, 1, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllableStatusInfo_CtlNum(), ecorePackage.getEInt(), "ctlNum", null, 0, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllableStatusInfo_StSeld(), ecorePackage.getEBoolean(), "stSeld", null, 0, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllableStatusInfo_SubEna(), ecorePackage.getEBoolean(), "subEna", null, 0, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllableStatusInfo_SubQ(), this.getQuality(), null, "subQ", null, 1, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllableStatusInfo_SubID(), ecorePackage.getEString(), "subID", null, 0, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllableStatusInfo_CtlModel(), this.getCtlModels(), null, "ctlModel", null, 1, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllableStatusInfo_SboTimeout(), ecorePackage.getEInt(), "sboTimeout", null, 0, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllableStatusInfo_SboClass(), this.getSboClasses(), null, "sboClass", null, 1, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllableStatusInfo_D(), ecorePackage.getEString(), "d", null, 0, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllableStatusInfo_DU(), ecorePackage.getEString(), "dU", null, 0, 1, ControllableStatusInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spcEClass, substationStandard.Dataclasses.SPC.class, "SPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPC_CtlVal(), ecorePackage.getEBoolean(), "ctlVal", null, 0, 1, substationStandard.Dataclasses.SPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPC_StVal(), ecorePackage.getEBoolean(), "stVal", null, 0, 1, substationStandard.Dataclasses.SPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPC_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.SPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPC_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.SPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPC_SubVal(), ecorePackage.getEBoolean(), "subVal", null, 0, 1, substationStandard.Dataclasses.SPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPC_PulseConfig(), this.getPulseConfig(), null, "pulseConfig", null, 1, 1, substationStandard.Dataclasses.SPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dpcEClass, substationStandard.Dataclasses.DPC.class, "DPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDPC_CtlVal(), ecorePackage.getEBoolean(), "ctlVal", null, 0, 1, substationStandard.Dataclasses.DPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPC_StVal(), this.getDPStatus(), null, "stVal", null, 1, 1, substationStandard.Dataclasses.DPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPC_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.DPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPC_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.DPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPC_SubVal(), this.getDPStatus(), null, "subVal", null, 1, 1, substationStandard.Dataclasses.DPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPC_PulseConfig(), this.getPulseConfig(), null, "pulseConfig", null, 1, 1, substationStandard.Dataclasses.DPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incEClass, substationStandard.Dataclasses.INC.class, "INC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINC_CtlVal(), ecorePackage.getEInt(), "ctlVal", null, 0, 1, substationStandard.Dataclasses.INC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINC_StVal(), ecorePackage.getEInt(), "stVal", null, 0, 1, substationStandard.Dataclasses.INC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getINC_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.INC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getINC_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.INC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINC_SubVal(), ecorePackage.getEInt(), "subVal", null, 0, 1, substationStandard.Dataclasses.INC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINC_MinVal(), ecorePackage.getEInt(), "minVal", null, 0, 1, substationStandard.Dataclasses.INC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINC_MaxVal(), ecorePackage.getEInt(), "maxVal", null, 0, 1, substationStandard.Dataclasses.INC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINC_StepSize(), ecorePackage.getEInt(), "stepSize", null, 0, 1, substationStandard.Dataclasses.INC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bscEClass, substationStandard.Dataclasses.BSC.class, "BSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBSC_CtlVal(), this.getBSControl(), null, "ctlVal", null, 1, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSC_ValWTr(), this.getValWithTrans(), null, "valWTr", null, 1, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSC_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSC_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBSC_SubVal(), this.getValWithTrans(), null, "subVal", null, 1, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBSC_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 0, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBSC_MinVal(), ecorePackage.getEInt(), "minVal", null, 0, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBSC_MaxVal(), ecorePackage.getEInt(), "maxVal", null, 0, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBSC_StepSize(), ecorePackage.getEInt(), "stepSize", null, 0, 1, substationStandard.Dataclasses.BSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iscEClass, substationStandard.Dataclasses.ISC.class, "ISC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISC_CtlVal(), ecorePackage.getEInt(), "ctlVal", null, 0, 1, substationStandard.Dataclasses.ISC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISC_ValWTr(), this.getValWithTrans(), null, "valWTr", null, 1, 1, substationStandard.Dataclasses.ISC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISC_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.ISC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISC_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.ISC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISC_SubVal(), this.getValWithTrans(), null, "subVal", null, 1, 1, substationStandard.Dataclasses.ISC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISC_MinVal(), ecorePackage.getEInt(), "minVal", null, 0, 1, substationStandard.Dataclasses.ISC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISC_MaxVal(), ecorePackage.getEInt(), "maxVal", null, 0, 1, substationStandard.Dataclasses.ISC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISC_StepSize(), ecorePackage.getEInt(), "stepSize", null, 0, 1, substationStandard.Dataclasses.ISC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllableAnalogueInfoEClass, ControllableAnalogueInfo.class, "ControllableAnalogueInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllableAnalogueInfo_APC(), this.getAPC(), null, "APC", null, 1, -1, ControllableAnalogueInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllableAnalogueInfo_C_PrimitiveCDC(), this.getC_PrimitiveCDC(), null, "C_PrimitiveCDC", null, 1, -1, ControllableAnalogueInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apcEClass, substationStandard.Dataclasses.APC.class, "APC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPC_SetMag(), this.getAnalogueValue(), null, "setMag", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_Origin(), this.getOriginator(), null, "origin", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_OperTm(), this.getTimeStamp(), null, "operTm", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_Q(), this.getQuality(), null, "q", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_T(), this.getTimeStamp(), null, "t", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_CtlModel(), this.getCtlModels(), null, "ctlModel", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_SVC(), this.getScaledValueConfig(), null, "sVC", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_MinVal(), this.getAnalogueValue(), null, "minVal", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_MaxVal(), this.getAnalogueValue(), null, "maxVal", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPC_StepSize(), this.getAnalogueValue(), null, "stepSize", null, 1, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPC_D(), ecorePackage.getEString(), "d", null, 0, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPC_DU(), ecorePackage.getEString(), "dU", null, 0, 1, substationStandard.Dataclasses.APC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spgEClass, substationStandard.Dataclasses.SPG.class, "SPG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPG_SetVal(), ecorePackage.getEBoolean(), "setVal", null, 0, 1, substationStandard.Dataclasses.SPG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingEClass, substationStandard.Dataclasses.ING.class, "ING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getING_SetVal(), ecorePackage.getEInt(), "setVal", null, 0, 1, substationStandard.Dataclasses.ING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getING_MinVal(), ecorePackage.getEInt(), "minVal", null, 0, 1, substationStandard.Dataclasses.ING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getING_MaxVal(), ecorePackage.getEInt(), "maxVal", null, 0, 1, substationStandard.Dataclasses.ING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getING_StepSize(), ecorePackage.getEInt(), "stepSize", null, 0, 1, substationStandard.Dataclasses.ING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogueSettingsEClass, AnalogueSettings.class, "AnalogueSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalogueSettings_D(), ecorePackage.getEString(), "d", null, 0, 1, AnalogueSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueSettings_DU(), ecorePackage.getEString(), "dU", null, 0, 1, AnalogueSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asgEClass, substationStandard.Dataclasses.ASG.class, "ASG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getASG_SetMag(), this.getAnalogueValue(), null, "setMag", null, 1, 1, substationStandard.Dataclasses.ASG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASG_Units(), this.getUnits(), null, "units", null, 1, 1, substationStandard.Dataclasses.ASG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASG_SVC(), this.getScaledValueConfig(), null, "sVC", null, 1, 1, substationStandard.Dataclasses.ASG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASG_MinVal(), this.getAnalogueValue(), null, "minVal", null, 1, 1, substationStandard.Dataclasses.ASG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASG_MaxVal(), this.getAnalogueValue(), null, "maxVal", null, 1, 1, substationStandard.Dataclasses.ASG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getASG_StepSize(), this.getAnalogueValue(), null, "stepSize", null, 1, 1, substationStandard.Dataclasses.ASG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curveEClass, substationStandard.Dataclasses.CURVE.class, "CURVE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCURVE_SetCharact(), this.getCurveChar(), null, "setCharact", null, 1, 1, substationStandard.Dataclasses.CURVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCURVE_SetParA(), ecorePackage.getEFloat(), "setParA", null, 0, 1, substationStandard.Dataclasses.CURVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCURVE_SetParB(), ecorePackage.getEFloat(), "setParB", null, 0, 1, substationStandard.Dataclasses.CURVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCURVE_SetParC(), ecorePackage.getEFloat(), "setParC", null, 0, 1, substationStandard.Dataclasses.CURVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCURVE_SetParD(), ecorePackage.getEFloat(), "setParD", null, 0, 1, substationStandard.Dataclasses.CURVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCURVE_SetParE(), ecorePackage.getEFloat(), "setParE", null, 0, 1, substationStandard.Dataclasses.CURVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCURVE_SetParF(), ecorePackage.getEFloat(), "setParF", null, 0, 1, substationStandard.Dataclasses.CURVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionInfoEClass, DescriptionInfo.class, "DescriptionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionInfo_DPL(), this.getDPL(), null, "DPL", null, 1, -1, DescriptionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionInfo_LPL(), this.getLPL(), null, "LPL", null, 1, -1, DescriptionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionInfo_CSD(), this.getCSD(), null, "CSD", null, 1, -1, DescriptionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionInfo_C_PrimitiveCDC(), this.getC_PrimitiveCDC(), null, "C_PrimitiveCDC", null, 1, -1, DescriptionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dplEClass, substationStandard.Dataclasses.DPL.class, "DPL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDPL_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, substationStandard.Dataclasses.DPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPL_HwRev(), ecorePackage.getEString(), "hwRev", null, 0, 1, substationStandard.Dataclasses.DPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPL_SwRev(), ecorePackage.getEString(), "swRev", null, 0, 1, substationStandard.Dataclasses.DPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPL_SerNum(), ecorePackage.getEString(), "serNum", null, 0, 1, substationStandard.Dataclasses.DPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPL_Model(), ecorePackage.getEString(), "model", null, 0, 1, substationStandard.Dataclasses.DPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPL_Location(), ecorePackage.getEString(), "location", null, 0, 1, substationStandard.Dataclasses.DPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lplEClass, substationStandard.Dataclasses.LPL.class, "LPL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLPL_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, substationStandard.Dataclasses.LPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPL_SwRev(), ecorePackage.getEString(), "swRev", null, 0, 1, substationStandard.Dataclasses.LPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPL_D(), ecorePackage.getEString(), "d", null, 0, 1, substationStandard.Dataclasses.LPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPL_DU(), ecorePackage.getEString(), "dU", null, 0, 1, substationStandard.Dataclasses.LPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPL_ConfigRev(), ecorePackage.getEString(), "configRev", null, 0, 1, substationStandard.Dataclasses.LPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPL_IdNs(), ecorePackage.getEString(), "IdNs", null, 0, 1, substationStandard.Dataclasses.LPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLPL_LnNs(), ecorePackage.getEString(), "lnNs", null, 0, 1, substationStandard.Dataclasses.LPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csdEClass, substationStandard.Dataclasses.CSD.class, "CSD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSD_XUnit(), this.getUnits(), null, "xUnit", null, 1, 1, substationStandard.Dataclasses.CSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSD_XD(), ecorePackage.getEString(), "xD", null, 0, 1, substationStandard.Dataclasses.CSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSD_YUnit(), this.getUnits(), null, "yUnit", null, 1, 1, substationStandard.Dataclasses.CSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSD_YD(), ecorePackage.getEString(), "yD", null, 0, 1, substationStandard.Dataclasses.CSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSD_NumPts(), ecorePackage.getEInt(), "numPts", null, 0, 1, substationStandard.Dataclasses.CSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSD_CrvPts(), this.getPointArray(), null, "crvPts", null, 1, 1, substationStandard.Dataclasses.CSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSD_D(), ecorePackage.getEString(), "d", null, 0, 1, substationStandard.Dataclasses.CSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSD_DU(), ecorePackage.getEString(), "dU", null, 0, 1, substationStandard.Dataclasses.CSD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DataclassesPackageImpl
