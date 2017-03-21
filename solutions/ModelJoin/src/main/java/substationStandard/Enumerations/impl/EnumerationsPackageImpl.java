/**
 */
package substationStandard.Enumerations.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import substationStandard.Dataclasses.DataclassesPackage;

import substationStandard.Dataclasses.impl.DataclassesPackageImpl;

import substationStandard.Enumerations.AngleReferenceKind;
import substationStandard.Enumerations.AutoReclosingStatusKind;
import substationStandard.Enumerations.BSControlKind;
import substationStandard.Enumerations.BreakerOperatingCapabilityKind;
import substationStandard.Enumerations.CMVAngleReferenceKind;
import substationStandard.Enumerations.ControlOutputKind;
import substationStandard.Enumerations.CtlModelsKind;
import substationStandard.Enumerations.CurrentReversalModeKind;
import substationStandard.Enumerations.CurveCharKind;
import substationStandard.Enumerations.DPStatusKind;
import substationStandard.Enumerations.DirectionModeKind;
import substationStandard.Enumerations.DirectionPhaseKind;
import substationStandard.Enumerations.EnumerationsFactory;
import substationStandard.Enumerations.EnumerationsPackage;
import substationStandard.Enumerations.FailureDetectionModeKind;
import substationStandard.Enumerations.FanControlKind;
import substationStandard.Enumerations.FaultDirectionKind;
import substationStandard.Enumerations.FaultLoopKind;
import substationStandard.Enumerations.FcKind;
import substationStandard.Enumerations.GeneratorStateKind;
import substationStandard.Enumerations.HealthStateKind;
import substationStandard.Enumerations.InternalTriggerModeKind;
import substationStandard.Enumerations.LiveDeadModeKind;
import substationStandard.Enumerations.MagReferenceKind;
import substationStandard.Enumerations.ModeBehaviourKind;
import substationStandard.Enumerations.MultiplierKind;
import substationStandard.Enumerations.OriginatorCategoryKind;
import substationStandard.Enumerations.PhaseReferenceKind;
import substationStandard.Enumerations.PolarizingQuantityKind;
import substationStandard.Enumerations.PresenceCondition;
import substationStandard.Enumerations.PumpControlKind;
import substationStandard.Enumerations.RangeKind;
import substationStandard.Enumerations.RecordingModeKind;
import substationStandard.Enumerations.ResetCurveKind;
import substationStandard.Enumerations.RestraintModeKind;
import substationStandard.Enumerations.RetripModeKind;
import substationStandard.Enumerations.SIUnitsKind;
import substationStandard.Enumerations.SboClassesKind;
import substationStandard.Enumerations.SchemeTypeKind;
import substationStandard.Enumerations.SequenceKind;
import substationStandard.Enumerations.SeverityKind;
import substationStandard.Enumerations.SourceKind;
import substationStandard.Enumerations.SwitchTypeKind;
import substationStandard.Enumerations.SwitchingCapabilityKind;
import substationStandard.Enumerations.TimeAccuracyKind;
import substationStandard.Enumerations.TrgOpKind;
import substationStandard.Enumerations.TriggerSourceKind;
import substationStandard.Enumerations.TripModeKind;
import substationStandard.Enumerations.UnblockFunctionModeKind;
import substationStandard.Enumerations.ValidityKind;
import substationStandard.Enumerations.WeakEndInfeedModeKind;

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
public class EnumerationsPackageImpl extends EPackageImpl implements EnumerationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeAccuracyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum angleReferenceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bsControlKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmvAngleReferenceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlOutputKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ctlModelsKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum curveCharKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dpStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionPhaseKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum faultDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum magReferenceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplierKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum originatorCategoryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phaseReferenceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rangeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sboClassesKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sequenceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum siUnitsKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum autoReclosingStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum breakerOperatingCapabilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currentReversalModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failureDetectionModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fanControlKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum faultLoopKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatorStateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum healthStateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum internalTriggerModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeBehaviourKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum liveDeadModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum polarizingQuantityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pumpControlKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recordingModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resetCurveKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restraintModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum retripModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemeTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum switchingCapabilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum switchTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerSourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tripModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unblockFunctionModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weakEndInfeedModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fcKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trgOpKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presenceConditionEEnum = null;

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
	 * @see substationStandard.Enumerations.EnumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumerationsPackageImpl() {
		super(eNS_URI, EnumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumerationsPackage init() {
		if (isInited) return (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);

		// Obtain or create and register package
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnumerationsPackageImpl());

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
		DataclassesPackageImpl theDataclassesPackage = (DataclassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) instanceof DataclassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataclassesPackage.eNS_URI) : DataclassesPackage.eINSTANCE);

		// Create package meta-data objects
		theEnumerationsPackage.createPackageContents();
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

		// Initialize created meta-data
		theEnumerationsPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theEnumerationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumerationsPackage.eNS_URI, theEnumerationsPackage);
		return theEnumerationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeAccuracyKind() {
		return timeAccuracyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAngleReferenceKind() {
		return angleReferenceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBSControlKind() {
		return bsControlKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCMVAngleReferenceKind() {
		return cmvAngleReferenceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlOutputKind() {
		return controlOutputKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCtlModelsKind() {
		return ctlModelsKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurveCharKind() {
		return curveCharKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDPStatusKind() {
		return dpStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionPhaseKind() {
		return directionPhaseKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFaultDirectionKind() {
		return faultDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMagReferenceKind() {
		return magReferenceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplierKind() {
		return multiplierKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOriginatorCategoryKind() {
		return originatorCategoryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhaseReferenceKind() {
		return phaseReferenceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRangeKind() {
		return rangeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSboClassesKind() {
		return sboClassesKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSequenceKind() {
		return sequenceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverityKind() {
		return severityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSIUnitsKind() {
		return siUnitsKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAutoReclosingStatusKind() {
		return autoReclosingStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBreakerOperatingCapabilityKind() {
		return breakerOperatingCapabilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurrentReversalModeKind() {
		return currentReversalModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionModeKind() {
		return directionModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFailureDetectionModeKind() {
		return failureDetectionModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFanControlKind() {
		return fanControlKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFaultLoopKind() {
		return faultLoopKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeneratorStateKind() {
		return generatorStateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHealthStateKind() {
		return healthStateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInternalTriggerModeKind() {
		return internalTriggerModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModeBehaviourKind() {
		return modeBehaviourKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLiveDeadModeKind() {
		return liveDeadModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolarizingQuantityKind() {
		return polarizingQuantityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPumpControlKind() {
		return pumpControlKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecordingModeKind() {
		return recordingModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResetCurveKind() {
		return resetCurveKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestraintModeKind() {
		return restraintModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRetripModeKind() {
		return retripModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemeTypeKind() {
		return schemeTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSwitchingCapabilityKind() {
		return switchingCapabilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSwitchTypeKind() {
		return switchTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerSourceKind() {
		return triggerSourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTripModeKind() {
		return tripModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnblockFunctionModeKind() {
		return unblockFunctionModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeakEndInfeedModeKind() {
		return weakEndInfeedModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValidityKind() {
		return validityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceKind() {
		return sourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFcKind() {
		return fcKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTrgOpKind() {
		return trgOpKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresenceCondition() {
		return presenceConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationsFactory getEnumerationsFactory() {
		return (EnumerationsFactory)getEFactoryInstance();
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

		// Create enums
		timeAccuracyKindEEnum = createEEnum(TIME_ACCURACY_KIND);
		angleReferenceKindEEnum = createEEnum(ANGLE_REFERENCE_KIND);
		bsControlKindEEnum = createEEnum(BS_CONTROL_KIND);
		cmvAngleReferenceKindEEnum = createEEnum(CMV_ANGLE_REFERENCE_KIND);
		controlOutputKindEEnum = createEEnum(CONTROL_OUTPUT_KIND);
		ctlModelsKindEEnum = createEEnum(CTL_MODELS_KIND);
		curveCharKindEEnum = createEEnum(CURVE_CHAR_KIND);
		dpStatusKindEEnum = createEEnum(DP_STATUS_KIND);
		directionPhaseKindEEnum = createEEnum(DIRECTION_PHASE_KIND);
		faultDirectionKindEEnum = createEEnum(FAULT_DIRECTION_KIND);
		magReferenceKindEEnum = createEEnum(MAG_REFERENCE_KIND);
		multiplierKindEEnum = createEEnum(MULTIPLIER_KIND);
		originatorCategoryKindEEnum = createEEnum(ORIGINATOR_CATEGORY_KIND);
		phaseReferenceKindEEnum = createEEnum(PHASE_REFERENCE_KIND);
		rangeKindEEnum = createEEnum(RANGE_KIND);
		sboClassesKindEEnum = createEEnum(SBO_CLASSES_KIND);
		sequenceKindEEnum = createEEnum(SEQUENCE_KIND);
		severityKindEEnum = createEEnum(SEVERITY_KIND);
		siUnitsKindEEnum = createEEnum(SI_UNITS_KIND);
		autoReclosingStatusKindEEnum = createEEnum(AUTO_RECLOSING_STATUS_KIND);
		breakerOperatingCapabilityKindEEnum = createEEnum(BREAKER_OPERATING_CAPABILITY_KIND);
		currentReversalModeKindEEnum = createEEnum(CURRENT_REVERSAL_MODE_KIND);
		directionModeKindEEnum = createEEnum(DIRECTION_MODE_KIND);
		failureDetectionModeKindEEnum = createEEnum(FAILURE_DETECTION_MODE_KIND);
		fanControlKindEEnum = createEEnum(FAN_CONTROL_KIND);
		faultLoopKindEEnum = createEEnum(FAULT_LOOP_KIND);
		generatorStateKindEEnum = createEEnum(GENERATOR_STATE_KIND);
		healthStateKindEEnum = createEEnum(HEALTH_STATE_KIND);
		internalTriggerModeKindEEnum = createEEnum(INTERNAL_TRIGGER_MODE_KIND);
		modeBehaviourKindEEnum = createEEnum(MODE_BEHAVIOUR_KIND);
		liveDeadModeKindEEnum = createEEnum(LIVE_DEAD_MODE_KIND);
		polarizingQuantityKindEEnum = createEEnum(POLARIZING_QUANTITY_KIND);
		pumpControlKindEEnum = createEEnum(PUMP_CONTROL_KIND);
		recordingModeKindEEnum = createEEnum(RECORDING_MODE_KIND);
		resetCurveKindEEnum = createEEnum(RESET_CURVE_KIND);
		restraintModeKindEEnum = createEEnum(RESTRAINT_MODE_KIND);
		retripModeKindEEnum = createEEnum(RETRIP_MODE_KIND);
		schemeTypeKindEEnum = createEEnum(SCHEME_TYPE_KIND);
		switchingCapabilityKindEEnum = createEEnum(SWITCHING_CAPABILITY_KIND);
		switchTypeKindEEnum = createEEnum(SWITCH_TYPE_KIND);
		triggerSourceKindEEnum = createEEnum(TRIGGER_SOURCE_KIND);
		tripModeKindEEnum = createEEnum(TRIP_MODE_KIND);
		unblockFunctionModeKindEEnum = createEEnum(UNBLOCK_FUNCTION_MODE_KIND);
		weakEndInfeedModeKindEEnum = createEEnum(WEAK_END_INFEED_MODE_KIND);
		validityKindEEnum = createEEnum(VALIDITY_KIND);
		sourceKindEEnum = createEEnum(SOURCE_KIND);
		fcKindEEnum = createEEnum(FC_KIND);
		trgOpKindEEnum = createEEnum(TRG_OP_KIND);
		presenceConditionEEnum = createEEnum(PRESENCE_CONDITION);
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

		// Initialize enums and add enum literals
		initEEnum(timeAccuracyKindEEnum, TimeAccuracyKind.class, "TimeAccuracyKind");
		addEEnumLiteral(timeAccuracyKindEEnum, TimeAccuracyKind.T0);
		addEEnumLiteral(timeAccuracyKindEEnum, TimeAccuracyKind.T1);
		addEEnumLiteral(timeAccuracyKindEEnum, TimeAccuracyKind.T2);
		addEEnumLiteral(timeAccuracyKindEEnum, TimeAccuracyKind.T3);
		addEEnumLiteral(timeAccuracyKindEEnum, TimeAccuracyKind.T4);
		addEEnumLiteral(timeAccuracyKindEEnum, TimeAccuracyKind.T5);
		addEEnumLiteral(timeAccuracyKindEEnum, TimeAccuracyKind.UNSPECIFIED);

		initEEnum(angleReferenceKindEEnum, AngleReferenceKind.class, "AngleReferenceKind");
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.VA);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.VB);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.VC);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.AA);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.AB);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.AC);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.VAB);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.VBC);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.VCA);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.VOTHER);
		addEEnumLiteral(angleReferenceKindEEnum, AngleReferenceKind.AOTHER);

		initEEnum(bsControlKindEEnum, BSControlKind.class, "BSControlKind");
		addEEnumLiteral(bsControlKindEEnum, BSControlKind.STOP);
		addEEnumLiteral(bsControlKindEEnum, BSControlKind.LOWER);
		addEEnumLiteral(bsControlKindEEnum, BSControlKind.HIGHER);
		addEEnumLiteral(bsControlKindEEnum, BSControlKind.RESERVED);

		initEEnum(cmvAngleReferenceKindEEnum, CMVAngleReferenceKind.class, "CMVAngleReferenceKind");
		addEEnumLiteral(cmvAngleReferenceKindEEnum, CMVAngleReferenceKind.VOLT);
		addEEnumLiteral(cmvAngleReferenceKindEEnum, CMVAngleReferenceKind.AMPERE);
		addEEnumLiteral(cmvAngleReferenceKindEEnum, CMVAngleReferenceKind.OTHER);

		initEEnum(controlOutputKindEEnum, ControlOutputKind.class, "ControlOutputKind");
		addEEnumLiteral(controlOutputKindEEnum, ControlOutputKind.PULSE);
		addEEnumLiteral(controlOutputKindEEnum, ControlOutputKind.PERSISTENT);

		initEEnum(ctlModelsKindEEnum, CtlModelsKind.class, "CtlModelsKind");
		addEEnumLiteral(ctlModelsKindEEnum, CtlModelsKind.STATUS_ONLY);
		addEEnumLiteral(ctlModelsKindEEnum, CtlModelsKind.DIRECT_WITH_NORMAL_SECURITY);
		addEEnumLiteral(ctlModelsKindEEnum, CtlModelsKind.SBO_WITH_NORMAL_SECURITY);
		addEEnumLiteral(ctlModelsKindEEnum, CtlModelsKind.DIRECT_WITH_ENHANCED_SECURITY);
		addEEnumLiteral(ctlModelsKindEEnum, CtlModelsKind.SBO_WITH_ENHANCED_SECURITY);

		initEEnum(curveCharKindEEnum, CurveCharKind.class, "CurveCharKind");
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.ANSI_EXTREMELY_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.ANSI_VERY_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.ANSI_NORMAL_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.ANSI_MODERATE_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.ANSI_DEFINITE_TIME);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.LONG_TIME_EXTREMELY_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.LONG_TIME_VERY_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.LONG_TIME_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.IEC_NORMAL_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.IEC_VERY_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.IEC_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.IEC_EXTREMELY_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.IEC_SHORT_TIME_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.IEC_LONG_TIME_INVERSE);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.IEC_DEFINITE_TIME);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.RESERVED);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA1);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA2);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA3);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA4);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA5);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA6);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA7);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA8);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA9);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA10);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA11);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA12);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA13);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA14);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA15);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.FORMULA16);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS1);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS2);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS3);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS4);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS5);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS6);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS7);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS8);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS9);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS10);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS11);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS12);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS13);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS14);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS15);
		addEEnumLiteral(curveCharKindEEnum, CurveCharKind.VENDOR_POINTS16);

		initEEnum(dpStatusKindEEnum, DPStatusKind.class, "DPStatusKind");
		addEEnumLiteral(dpStatusKindEEnum, DPStatusKind.INTERMEDIATE_STATE);
		addEEnumLiteral(dpStatusKindEEnum, DPStatusKind.OFF_OR_FALSE);
		addEEnumLiteral(dpStatusKindEEnum, DPStatusKind.ON_OR_TRUE);
		addEEnumLiteral(dpStatusKindEEnum, DPStatusKind.BAD_STATE);

		initEEnum(directionPhaseKindEEnum, DirectionPhaseKind.class, "DirectionPhaseKind");
		addEEnumLiteral(directionPhaseKindEEnum, DirectionPhaseKind.UNKNOWN);
		addEEnumLiteral(directionPhaseKindEEnum, DirectionPhaseKind.FORWARD);
		addEEnumLiteral(directionPhaseKindEEnum, DirectionPhaseKind.BACKWARD);

		initEEnum(faultDirectionKindEEnum, FaultDirectionKind.class, "FaultDirectionKind");
		addEEnumLiteral(faultDirectionKindEEnum, FaultDirectionKind.UNKNOWN);
		addEEnumLiteral(faultDirectionKindEEnum, FaultDirectionKind.FORWARD);
		addEEnumLiteral(faultDirectionKindEEnum, FaultDirectionKind.BACKWARD);
		addEEnumLiteral(faultDirectionKindEEnum, FaultDirectionKind.BOTH);

		initEEnum(magReferenceKindEEnum, MagReferenceKind.class, "MagReferenceKind");
		addEEnumLiteral(magReferenceKindEEnum, MagReferenceKind.FUNDAMENTAL);
		addEEnumLiteral(magReferenceKindEEnum, MagReferenceKind.RMS);
		addEEnumLiteral(magReferenceKindEEnum, MagReferenceKind.ABSOLUTE);

		initEEnum(multiplierKindEEnum, MultiplierKind.class, "MultiplierKind");
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.YOCTO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.ZEPTO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.ATTO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.FEMTO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.PICO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.NANO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.MICRO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.MILLI);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.CENTI);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.DECI);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.NONE);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.DECA);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.HECTO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.KILO);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.MEGA);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.GIGA);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.TERA);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.PETRA);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.EXA);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.ZETTA);
		addEEnumLiteral(multiplierKindEEnum, MultiplierKind.YOTTA);

		initEEnum(originatorCategoryKindEEnum, OriginatorCategoryKind.class, "OriginatorCategoryKind");
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.NOT_SUPPORTED);
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.BAY_CONTROL);
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.STATION_CONTROL);
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.REMOTE_CONTROL);
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.AUTOMATIC_BAY);
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.AUTOMATIC_STATION);
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.AUTOMATIC_REMOTE);
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.MAINTENANCE);
		addEEnumLiteral(originatorCategoryKindEEnum, OriginatorCategoryKind.PROCESS);

		initEEnum(phaseReferenceKindEEnum, PhaseReferenceKind.class, "PhaseReferenceKind");
		addEEnumLiteral(phaseReferenceKindEEnum, PhaseReferenceKind.A);
		addEEnumLiteral(phaseReferenceKindEEnum, PhaseReferenceKind.B);
		addEEnumLiteral(phaseReferenceKindEEnum, PhaseReferenceKind.C);

		initEEnum(rangeKindEEnum, RangeKind.class, "RangeKind");
		addEEnumLiteral(rangeKindEEnum, RangeKind.NORMAL);
		addEEnumLiteral(rangeKindEEnum, RangeKind.HIGH);
		addEEnumLiteral(rangeKindEEnum, RangeKind.LOW);
		addEEnumLiteral(rangeKindEEnum, RangeKind.HIGH_HIGH);
		addEEnumLiteral(rangeKindEEnum, RangeKind.LOW_LOW);

		initEEnum(sboClassesKindEEnum, SboClassesKind.class, "SboClassesKind");
		addEEnumLiteral(sboClassesKindEEnum, SboClassesKind.OPERATE_ONCE);
		addEEnumLiteral(sboClassesKindEEnum, SboClassesKind.OPERATE_MANY);

		initEEnum(sequenceKindEEnum, SequenceKind.class, "SequenceKind");
		addEEnumLiteral(sequenceKindEEnum, SequenceKind.POS_NEG_ZERO);
		addEEnumLiteral(sequenceKindEEnum, SequenceKind.DIR_QUAD_ZERO);

		initEEnum(severityKindEEnum, SeverityKind.class, "SeverityKind");
		addEEnumLiteral(severityKindEEnum, SeverityKind.UNKNOWN);
		addEEnumLiteral(severityKindEEnum, SeverityKind.CRITICAL);
		addEEnumLiteral(severityKindEEnum, SeverityKind.MAJOR);
		addEEnumLiteral(severityKindEEnum, SeverityKind.MINOR);
		addEEnumLiteral(severityKindEEnum, SeverityKind.WARNING);

		initEEnum(siUnitsKindEEnum, SIUnitsKind.class, "SIUnitsKind");
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.DIMENSIONLESS);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.METER);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.KILOGRAM);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.AMPERE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.KELVIN);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.MOLE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.CANDELA);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.DEGREE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.RADIAN);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.STERADIAN);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.GRAY);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.BECQUEREL);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.DEGREE_CELSIUS);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.SIEVERT);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.FARAD);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.COULOMB);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.SIEMENS);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.HENRY);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.VOLT);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.OHM);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.JOULE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.NEWTON);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.HERTZ);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.LUX);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.LUMEN);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.WEBER);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.TESLA);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.WATT_GENERAL);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.PASCAL);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.SQUARE_METER);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.CUBIC_METER);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.METER_PER_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.METER_PER_SQUARE_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.CUBIC_METER_PER_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.METER_PER_CUBIC_METER);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.KILOGRAM_METER);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.KILOGRAM_PER_CUBIC_METER);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.SQUARE_METER_PER_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.WATT_PER_METER_KELVIN);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.JOULE_PER_KELVIN);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.PART_PER_MILLION);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.ROTATION_PER_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.RADIAN_PER_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.VOLT_AMPERE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.WATT);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.VOLT_AMPERE_REACTIVE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.PHASE_ANGLE_DEGREE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.COS_THETA);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.VOLT_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.VOLT_SQUARE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.AMP_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.AMP_SQUARE);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.AMP_SQUARE_SECOND);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.VOLT_AMPERE_HOUR);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.WATT_HOUR);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.VOLT_AMPERE_REACTIVE_HOUR);
		addEEnumLiteral(siUnitsKindEEnum, SIUnitsKind.VOLT_PER_HERTZ);

		initEEnum(autoReclosingStatusKindEEnum, AutoReclosingStatusKind.class, "AutoReclosingStatusKind");
		addEEnumLiteral(autoReclosingStatusKindEEnum, AutoReclosingStatusKind.READY);
		addEEnumLiteral(autoReclosingStatusKindEEnum, AutoReclosingStatusKind.IN_PROGRESS);
		addEEnumLiteral(autoReclosingStatusKindEEnum, AutoReclosingStatusKind.SUCCESSFULL);

		initEEnum(breakerOperatingCapabilityKindEEnum, BreakerOperatingCapabilityKind.class, "BreakerOperatingCapabilityKind");
		addEEnumLiteral(breakerOperatingCapabilityKindEEnum, BreakerOperatingCapabilityKind.NONE);
		addEEnumLiteral(breakerOperatingCapabilityKindEEnum, BreakerOperatingCapabilityKind.OPEN);
		addEEnumLiteral(breakerOperatingCapabilityKindEEnum, BreakerOperatingCapabilityKind.CLOSE_OPEN);
		addEEnumLiteral(breakerOperatingCapabilityKindEEnum, BreakerOperatingCapabilityKind.OPEN_CLOSE_OPEN);
		addEEnumLiteral(breakerOperatingCapabilityKindEEnum, BreakerOperatingCapabilityKind.CLOSE_OPEN_CLOSE_OPEN);

		initEEnum(currentReversalModeKindEEnum, CurrentReversalModeKind.class, "CurrentReversalModeKind");
		addEEnumLiteral(currentReversalModeKindEEnum, CurrentReversalModeKind.OFF);
		addEEnumLiteral(currentReversalModeKindEEnum, CurrentReversalModeKind.ON);

		initEEnum(directionModeKindEEnum, DirectionModeKind.class, "DirectionModeKind");
		addEEnumLiteral(directionModeKindEEnum, DirectionModeKind.NON_DIRECTIONAL);
		addEEnumLiteral(directionModeKindEEnum, DirectionModeKind.FORWARD);
		addEEnumLiteral(directionModeKindEEnum, DirectionModeKind.REVERSE);

		initEEnum(failureDetectionModeKindEEnum, FailureDetectionModeKind.class, "FailureDetectionModeKind");
		addEEnumLiteral(failureDetectionModeKindEEnum, FailureDetectionModeKind.CURRENT);
		addEEnumLiteral(failureDetectionModeKindEEnum, FailureDetectionModeKind.BREAKER_STATUS);
		addEEnumLiteral(failureDetectionModeKindEEnum, FailureDetectionModeKind.BOTH);
		addEEnumLiteral(failureDetectionModeKindEEnum, FailureDetectionModeKind.OTHER);

		initEEnum(fanControlKindEEnum, FanControlKind.class, "FanControlKind");
		addEEnumLiteral(fanControlKindEEnum, FanControlKind.INACTIVE);
		addEEnumLiteral(fanControlKindEEnum, FanControlKind.STAGE1);
		addEEnumLiteral(fanControlKindEEnum, FanControlKind.STAGE2);
		addEEnumLiteral(fanControlKindEEnum, FanControlKind.STAGE3);

		initEEnum(faultLoopKindEEnum, FaultLoopKind.class, "FaultLoopKind");
		addEEnumLiteral(faultLoopKindEEnum, FaultLoopKind.PH_ATO_GROUND);
		addEEnumLiteral(faultLoopKindEEnum, FaultLoopKind.PH_BTO_GROUND);
		addEEnumLiteral(faultLoopKindEEnum, FaultLoopKind.PH_CTO_GROUND);
		addEEnumLiteral(faultLoopKindEEnum, FaultLoopKind.PH_ATO_PH_B);
		addEEnumLiteral(faultLoopKindEEnum, FaultLoopKind.PH_BTO_PH_C);
		addEEnumLiteral(faultLoopKindEEnum, FaultLoopKind.PH_CTO_PH_A);
		addEEnumLiteral(faultLoopKindEEnum, FaultLoopKind.OTHER);

		initEEnum(generatorStateKindEEnum, GeneratorStateKind.class, "GeneratorStateKind");
		addEEnumLiteral(generatorStateKindEEnum, GeneratorStateKind.STOPPED);
		addEEnumLiteral(generatorStateKindEEnum, GeneratorStateKind.STOPPING);
		addEEnumLiteral(generatorStateKindEEnum, GeneratorStateKind.STARTED);
		addEEnumLiteral(generatorStateKindEEnum, GeneratorStateKind.STARTING);
		addEEnumLiteral(generatorStateKindEEnum, GeneratorStateKind.DISABLED);

		initEEnum(healthStateKindEEnum, HealthStateKind.class, "HealthStateKind");
		addEEnumLiteral(healthStateKindEEnum, HealthStateKind.OK);
		addEEnumLiteral(healthStateKindEEnum, HealthStateKind.WARNING);
		addEEnumLiteral(healthStateKindEEnum, HealthStateKind.ALARM);

		initEEnum(internalTriggerModeKindEEnum, InternalTriggerModeKind.class, "InternalTriggerModeKind");
		addEEnumLiteral(internalTriggerModeKindEEnum, InternalTriggerModeKind.POSITIVE_OR_RISING);
		addEEnumLiteral(internalTriggerModeKindEEnum, InternalTriggerModeKind.NEGATIVE_OR_FALLING);
		addEEnumLiteral(internalTriggerModeKindEEnum, InternalTriggerModeKind.BOTH);
		addEEnumLiteral(internalTriggerModeKindEEnum, InternalTriggerModeKind.OTHER);

		initEEnum(modeBehaviourKindEEnum, ModeBehaviourKind.class, "ModeBehaviourKind");
		addEEnumLiteral(modeBehaviourKindEEnum, ModeBehaviourKind.ON);
		addEEnumLiteral(modeBehaviourKindEEnum, ModeBehaviourKind.BLOCKED);
		addEEnumLiteral(modeBehaviourKindEEnum, ModeBehaviourKind.TEST);
		addEEnumLiteral(modeBehaviourKindEEnum, ModeBehaviourKind.TEST_BLOCKED);
		addEEnumLiteral(modeBehaviourKindEEnum, ModeBehaviourKind.OFF);

		initEEnum(liveDeadModeKindEEnum, LiveDeadModeKind.class, "LiveDeadModeKind");
		addEEnumLiteral(liveDeadModeKindEEnum, LiveDeadModeKind.LINE_LIVE);
		addEEnumLiteral(liveDeadModeKindEEnum, LiveDeadModeKind.BOTH_DEAD);
		addEEnumLiteral(liveDeadModeKindEEnum, LiveDeadModeKind.BUS_LIVE);
		addEEnumLiteral(liveDeadModeKindEEnum, LiveDeadModeKind.BOTH_DEAD_OR_LINE_LIVE);
		addEEnumLiteral(liveDeadModeKindEEnum, LiveDeadModeKind.BOTH_DEAD_OR_BUS_LIVE);
		addEEnumLiteral(liveDeadModeKindEEnum, LiveDeadModeKind.LINE_LIVE_BUS_DEAD_OR_BUS_LIVE_LINE_DEAD);
		addEEnumLiteral(liveDeadModeKindEEnum, LiveDeadModeKind.BOTH_DEAD_OR_ONLY_ONE_LIVE);

		initEEnum(polarizingQuantityKindEEnum, PolarizingQuantityKind.class, "PolarizingQuantityKind");
		addEEnumLiteral(polarizingQuantityKindEEnum, PolarizingQuantityKind.NONE);
		addEEnumLiteral(polarizingQuantityKindEEnum, PolarizingQuantityKind.ZERO_SEQ_CURRENT);
		addEEnumLiteral(polarizingQuantityKindEEnum, PolarizingQuantityKind.ZERO_SEQ_VOLTAGE);
		addEEnumLiteral(polarizingQuantityKindEEnum, PolarizingQuantityKind.NEG_SEQ_VOLTAGE);
		addEEnumLiteral(polarizingQuantityKindEEnum, PolarizingQuantityKind.PH_TO_PH_VOLTAGES);
		addEEnumLiteral(polarizingQuantityKindEEnum, PolarizingQuantityKind.PH_TO_GROUND_VOLTAGES);

		initEEnum(pumpControlKindEEnum, PumpControlKind.class, "PumpControlKind");
		addEEnumLiteral(pumpControlKindEEnum, PumpControlKind.INACTIVE);
		addEEnumLiteral(pumpControlKindEEnum, PumpControlKind.STAGE1);
		addEEnumLiteral(pumpControlKindEEnum, PumpControlKind.STAGE2);
		addEEnumLiteral(pumpControlKindEEnum, PumpControlKind.STAGE3);

		initEEnum(recordingModeKindEEnum, RecordingModeKind.class, "RecordingModeKind");
		addEEnumLiteral(recordingModeKindEEnum, RecordingModeKind.OVERWRITE);
		addEEnumLiteral(recordingModeKindEEnum, RecordingModeKind.STOP_WHEN_FULL);

		initEEnum(resetCurveKindEEnum, ResetCurveKind.class, "ResetCurveKind");
		addEEnumLiteral(resetCurveKindEEnum, ResetCurveKind.NONE);
		addEEnumLiteral(resetCurveKindEEnum, ResetCurveKind.DEFINITE_TIME_DELAYED);
		addEEnumLiteral(resetCurveKindEEnum, ResetCurveKind.INVERSE);

		initEEnum(restraintModeKindEEnum, RestraintModeKind.class, "RestraintModeKind");
		addEEnumLiteral(restraintModeKindEEnum, RestraintModeKind.NONE);
		addEEnumLiteral(restraintModeKindEEnum, RestraintModeKind.HARM2);
		addEEnumLiteral(restraintModeKindEEnum, RestraintModeKind.HARM5);
		addEEnumLiteral(restraintModeKindEEnum, RestraintModeKind.HARM2_AND_HARM5);
		addEEnumLiteral(restraintModeKindEEnum, RestraintModeKind.WAVEFORM_ANALYSIS);
		addEEnumLiteral(restraintModeKindEEnum, RestraintModeKind.HARM2_AND_WAVEFORM_ANALYSIS);
		addEEnumLiteral(restraintModeKindEEnum, RestraintModeKind.OTHER);

		initEEnum(retripModeKindEEnum, RetripModeKind.class, "RetripModeKind");
		addEEnumLiteral(retripModeKindEEnum, RetripModeKind.OFF);
		addEEnumLiteral(retripModeKindEEnum, RetripModeKind.NO_CHECK);
		addEEnumLiteral(retripModeKindEEnum, RetripModeKind.CURRENT_CHECK);
		addEEnumLiteral(retripModeKindEEnum, RetripModeKind.BREAKER_STATUS_CHECK);
		addEEnumLiteral(retripModeKindEEnum, RetripModeKind.BOTH_CHECKS);
		addEEnumLiteral(retripModeKindEEnum, RetripModeKind.OTHER);

		initEEnum(schemeTypeKindEEnum, SchemeTypeKind.class, "SchemeTypeKind");
		addEEnumLiteral(schemeTypeKindEEnum, SchemeTypeKind.NONE);
		addEEnumLiteral(schemeTypeKindEEnum, SchemeTypeKind.INTERTRIP);
		addEEnumLiteral(schemeTypeKindEEnum, SchemeTypeKind.PERMISSIVE_UNDER_REACH);
		addEEnumLiteral(schemeTypeKindEEnum, SchemeTypeKind.PERMISSIVE_OVER_REACH);
		addEEnumLiteral(schemeTypeKindEEnum, SchemeTypeKind.BLOCKING);

		initEEnum(switchingCapabilityKindEEnum, SwitchingCapabilityKind.class, "SwitchingCapabilityKind");
		addEEnumLiteral(switchingCapabilityKindEEnum, SwitchingCapabilityKind.NONE);
		addEEnumLiteral(switchingCapabilityKindEEnum, SwitchingCapabilityKind.OPEN);
		addEEnumLiteral(switchingCapabilityKindEEnum, SwitchingCapabilityKind.CLOSE);
		addEEnumLiteral(switchingCapabilityKindEEnum, SwitchingCapabilityKind.BOTH);

		initEEnum(switchTypeKindEEnum, SwitchTypeKind.class, "SwitchTypeKind");
		addEEnumLiteral(switchTypeKindEEnum, SwitchTypeKind.LOAD_BREAK);
		addEEnumLiteral(switchTypeKindEEnum, SwitchTypeKind.DISCONNECTOR);
		addEEnumLiteral(switchTypeKindEEnum, SwitchTypeKind.EARTHING_SWITCH);
		addEEnumLiteral(switchTypeKindEEnum, SwitchTypeKind.HIGH_SPEED_EARTHING_SWITCH);

		initEEnum(triggerSourceKindEEnum, TriggerSourceKind.class, "TriggerSourceKind");
		addEEnumLiteral(triggerSourceKindEEnum, TriggerSourceKind.INTERNAL);
		addEEnumLiteral(triggerSourceKindEEnum, TriggerSourceKind.EXTERNAL);
		addEEnumLiteral(triggerSourceKindEEnum, TriggerSourceKind.BOTH);

		initEEnum(tripModeKindEEnum, TripModeKind.class, "TripModeKind");
		addEEnumLiteral(tripModeKindEEnum, TripModeKind.THREE_PHASE);
		addEEnumLiteral(tripModeKindEEnum, TripModeKind.ONE_OR_THREE_PHASE);
		addEEnumLiteral(tripModeKindEEnum, TripModeKind.SPECIFIC);

		initEEnum(unblockFunctionModeKindEEnum, UnblockFunctionModeKind.class, "UnblockFunctionModeKind");
		addEEnumLiteral(unblockFunctionModeKindEEnum, UnblockFunctionModeKind.OFF);
		addEEnumLiteral(unblockFunctionModeKindEEnum, UnblockFunctionModeKind.PERMANENT);
		addEEnumLiteral(unblockFunctionModeKindEEnum, UnblockFunctionModeKind.TIME_WINDOW);

		initEEnum(weakEndInfeedModeKindEEnum, WeakEndInfeedModeKind.class, "WeakEndInfeedModeKind");
		addEEnumLiteral(weakEndInfeedModeKindEEnum, WeakEndInfeedModeKind.OFF);
		addEEnumLiteral(weakEndInfeedModeKindEEnum, WeakEndInfeedModeKind.OPERATE);
		addEEnumLiteral(weakEndInfeedModeKindEEnum, WeakEndInfeedModeKind.ECHO);
		addEEnumLiteral(weakEndInfeedModeKindEEnum, WeakEndInfeedModeKind.ECHO_AND_OPERATE);

		initEEnum(validityKindEEnum, ValidityKind.class, "ValidityKind");
		addEEnumLiteral(validityKindEEnum, ValidityKind.GOOD);
		addEEnumLiteral(validityKindEEnum, ValidityKind.INVALID);
		addEEnumLiteral(validityKindEEnum, ValidityKind.QUESTIONABLE);

		initEEnum(sourceKindEEnum, SourceKind.class, "SourceKind");
		addEEnumLiteral(sourceKindEEnum, SourceKind.PROCESS);
		addEEnumLiteral(sourceKindEEnum, SourceKind.SUBSTITUTED);

		initEEnum(fcKindEEnum, FcKind.class, "FcKind");
		addEEnumLiteral(fcKindEEnum, FcKind.ST);
		addEEnumLiteral(fcKindEEnum, FcKind.MX);
		addEEnumLiteral(fcKindEEnum, FcKind.CO);
		addEEnumLiteral(fcKindEEnum, FcKind.MC);
		addEEnumLiteral(fcKindEEnum, FcKind.SP);
		addEEnumLiteral(fcKindEEnum, FcKind.SV);
		addEEnumLiteral(fcKindEEnum, FcKind.CF);
		addEEnumLiteral(fcKindEEnum, FcKind.DC);
		addEEnumLiteral(fcKindEEnum, FcKind.SG);
		addEEnumLiteral(fcKindEEnum, FcKind.SE);
		addEEnumLiteral(fcKindEEnum, FcKind.EX);
		addEEnumLiteral(fcKindEEnum, FcKind.XX);

		initEEnum(trgOpKindEEnum, TrgOpKind.class, "TrgOpKind");
		addEEnumLiteral(trgOpKindEEnum, TrgOpKind.NONE);
		addEEnumLiteral(trgOpKindEEnum, TrgOpKind.DCHG);
		addEEnumLiteral(trgOpKindEEnum, TrgOpKind.QCHG);
		addEEnumLiteral(trgOpKindEEnum, TrgOpKind.DUPD);
		addEEnumLiteral(trgOpKindEEnum, TrgOpKind.DCHG_DUPD);

		initEEnum(presenceConditionEEnum, PresenceCondition.class, "PresenceCondition");
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.M);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.O);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.PICS_SUBST);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.GC_1);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.GC_2N);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.GC_CON);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_LN0_M);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_LN0_EX);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_DLD_M);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_DLN_M);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_DLNDA_M);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_SCAV);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_ST);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_CO_M);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_CO_O);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_SG_M);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_SG_O);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_NSG_M);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_NSG_O);
		addEEnumLiteral(presenceConditionEEnum, PresenceCondition.AC_RMS_M);
	}

} //EnumerationsPackageImpl
