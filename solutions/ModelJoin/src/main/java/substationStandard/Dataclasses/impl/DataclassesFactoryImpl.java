/**
 */
package substationStandard.Dataclasses.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import substationStandard.Dataclasses.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataclassesFactoryImpl extends EFactoryImpl implements DataclassesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataclassesFactory init() {
		try {
			DataclassesFactory theDataclassesFactory = (DataclassesFactory)EPackage.Registry.INSTANCE.getEFactory(DataclassesPackage.eNS_URI);
			if (theDataclassesFactory != null) {
				return theDataclassesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataclassesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataclassesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataclassesPackage.TIME_STAMP: return createTimeStamp();
			case DataclassesPackage.PTIME_STAMP: return createP_TimeStamp();
			case DataclassesPackage.TIME_QUALITY: return createTimeQuality();
			case DataclassesPackage.ANALOGUE_VALUE: return createAnalogueValue();
			case DataclassesPackage.ANGLE_REFERENCE: return createAngleReference();
			case DataclassesPackage.BS_CONTROL: return createBSControl();
			case DataclassesPackage.CMV_ANGLE_REFERENCE: return createCMVAngleReference();
			case DataclassesPackage.CONTROL_OUTPUT: return createControlOutput();
			case DataclassesPackage.CTL_MODELS: return createCtlModels();
			case DataclassesPackage.CURVE_CHAR: return createCurveChar();
			case DataclassesPackage.DIRECTION_PHASE: return createDirectionPhase();
			case DataclassesPackage.DP_STATUS: return createDPStatus();
			case DataclassesPackage.FAULT_DIRECTION: return createFaultDirection();
			case DataclassesPackage.MAG_REFERENCE: return createMagReference();
			case DataclassesPackage.MULTIPLIER: return createMultiplier();
			case DataclassesPackage.ORIGINATOR: return createOriginator();
			case DataclassesPackage.ORIGINATOR_CATEGORY: return createOriginatorCategory();
			case DataclassesPackage.PHASE_REFERENCE: return createPhaseReference();
			case DataclassesPackage.POINT: return createPoint();
			case DataclassesPackage.POINT_ARRAY: return createPointArray();
			case DataclassesPackage.PULSE_CONFIG: return createPulseConfig();
			case DataclassesPackage.QUALITY: return createQuality();
			case DataclassesPackage.DETAIL_QUAL: return createDetailQual();
			case DataclassesPackage.RANGE: return createRange();
			case DataclassesPackage.RANGE_CONFIG: return createRangeConfig();
			case DataclassesPackage.SBO_CLASSES: return createSboClasses();
			case DataclassesPackage.SCALED_VALUE_CONFIG: return createScaledValueConfig();
			case DataclassesPackage.SEQUENCE: return createSequence();
			case DataclassesPackage.SEVERITY: return createSeverity();
			case DataclassesPackage.SL_UNITS: return createSlUnits();
			case DataclassesPackage.UNITS: return createUnits();
			case DataclassesPackage.VAL_WITH_TRANS: return createValWithTrans();
			case DataclassesPackage.VECTOR: return createVector();
			case DataclassesPackage.VECTOR_ARRAY: return createVectorArray();
			case DataclassesPackage.CPRIMITIVE_CDC: return createC_PrimitiveCDC();
			case DataclassesPackage.CCOMPOSED_CDC: return createC_ComposedCDC();
			case DataclassesPackage.STATUS_INFO: return createStatusInfo();
			case DataclassesPackage.SPS: return createSPS();
			case DataclassesPackage.INS: return createINS();
			case DataclassesPackage.DPS: return createDPS();
			case DataclassesPackage.ACT: return createACT();
			case DataclassesPackage.ACD: return createACD();
			case DataclassesPackage.SEC: return createSEC();
			case DataclassesPackage.BCR: return createBCR();
			case DataclassesPackage.PRIMITIVE_MEASURE_AND_INFO: return createPrimitiveMeasureAndInfo();
			case DataclassesPackage.COMPOSED_MEASURE_AND_INFO: return createComposedMeasureAndInfo();
			case DataclassesPackage.MV: return createMV();
			case DataclassesPackage.CMV: return createCMV();
			case DataclassesPackage.SAV: return createSAV();
			case DataclassesPackage.DEL: return createDEL();
			case DataclassesPackage.WYE: return createWYE();
			case DataclassesPackage.SEQ: return createSEQ();
			case DataclassesPackage.HMV: return createHMV();
			case DataclassesPackage.HYWE: return createHYWE();
			case DataclassesPackage.HDEL: return createHDEL();
			case DataclassesPackage.CONTROLLABLE_STATUS_INFO: return createControllableStatusInfo();
			case DataclassesPackage.SPC: return createSPC();
			case DataclassesPackage.DPC: return createDPC();
			case DataclassesPackage.INC: return createINC();
			case DataclassesPackage.BSC: return createBSC();
			case DataclassesPackage.ISC: return createISC();
			case DataclassesPackage.CONTROLLABLE_ANALOGUE_INFO: return createControllableAnalogueInfo();
			case DataclassesPackage.APC: return createAPC();
			case DataclassesPackage.SPG: return createSPG();
			case DataclassesPackage.ING: return createING();
			case DataclassesPackage.ANALOGUE_SETTINGS: return createAnalogueSettings();
			case DataclassesPackage.ASG: return createASG();
			case DataclassesPackage.CURVE: return createCURVE();
			case DataclassesPackage.DESCRIPTION_INFO: return createDescriptionInfo();
			case DataclassesPackage.DPL: return createDPL();
			case DataclassesPackage.LPL: return createLPL();
			case DataclassesPackage.CSD: return createCSD();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStamp createTimeStamp() {
		TimeStampImpl timeStamp = new TimeStampImpl();
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_TimeStamp createP_TimeStamp() {
		P_TimeStampImpl p_TimeStamp = new P_TimeStampImpl();
		return p_TimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeQuality createTimeQuality() {
		TimeQualityImpl timeQuality = new TimeQualityImpl();
		return timeQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueValue createAnalogueValue() {
		AnalogueValueImpl analogueValue = new AnalogueValueImpl();
		return analogueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleReference createAngleReference() {
		AngleReferenceImpl angleReference = new AngleReferenceImpl();
		return angleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSControl createBSControl() {
		BSControlImpl bsControl = new BSControlImpl();
		return bsControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMVAngleReference createCMVAngleReference() {
		CMVAngleReferenceImpl cmvAngleReference = new CMVAngleReferenceImpl();
		return cmvAngleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlOutput createControlOutput() {
		ControlOutputImpl controlOutput = new ControlOutputImpl();
		return controlOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlModels createCtlModels() {
		CtlModelsImpl ctlModels = new CtlModelsImpl();
		return ctlModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveChar createCurveChar() {
		CurveCharImpl curveChar = new CurveCharImpl();
		return curveChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPhase createDirectionPhase() {
		DirectionPhaseImpl directionPhase = new DirectionPhaseImpl();
		return directionPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPStatus createDPStatus() {
		DPStatusImpl dpStatus = new DPStatusImpl();
		return dpStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultDirection createFaultDirection() {
		FaultDirectionImpl faultDirection = new FaultDirectionImpl();
		return faultDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagReference createMagReference() {
		MagReferenceImpl magReference = new MagReferenceImpl();
		return magReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplier createMultiplier() {
		MultiplierImpl multiplier = new MultiplierImpl();
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Originator createOriginator() {
		OriginatorImpl originator = new OriginatorImpl();
		return originator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginatorCategory createOriginatorCategory() {
		OriginatorCategoryImpl originatorCategory = new OriginatorCategoryImpl();
		return originatorCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseReference createPhaseReference() {
		PhaseReferenceImpl phaseReference = new PhaseReferenceImpl();
		return phaseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointArray createPointArray() {
		PointArrayImpl pointArray = new PointArrayImpl();
		return pointArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PulseConfig createPulseConfig() {
		PulseConfigImpl pulseConfig = new PulseConfigImpl();
		return pulseConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality createQuality() {
		QualityImpl quality = new QualityImpl();
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailQual createDetailQual() {
		DetailQualImpl detailQual = new DetailQualImpl();
		return detailQual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeConfig createRangeConfig() {
		RangeConfigImpl rangeConfig = new RangeConfigImpl();
		return rangeConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SboClasses createSboClasses() {
		SboClassesImpl sboClasses = new SboClassesImpl();
		return sboClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaledValueConfig createScaledValueConfig() {
		ScaledValueConfigImpl scaledValueConfig = new ScaledValueConfigImpl();
		return scaledValueConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverity() {
		SeverityImpl severity = new SeverityImpl();
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlUnits createSlUnits() {
		SlUnitsImpl slUnits = new SlUnitsImpl();
		return slUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units createUnits() {
		UnitsImpl units = new UnitsImpl();
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValWithTrans createValWithTrans() {
		ValWithTransImpl valWithTrans = new ValWithTransImpl();
		return valWithTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector createVector() {
		VectorImpl vector = new VectorImpl();
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorArray createVectorArray() {
		VectorArrayImpl vectorArray = new VectorArrayImpl();
		return vectorArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_PrimitiveCDC createC_PrimitiveCDC() {
		C_PrimitiveCDCImpl c_PrimitiveCDC = new C_PrimitiveCDCImpl();
		return c_PrimitiveCDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C_ComposedCDC createC_ComposedCDC() {
		C_ComposedCDCImpl c_ComposedCDC = new C_ComposedCDCImpl();
		return c_ComposedCDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusInfo createStatusInfo() {
		StatusInfoImpl statusInfo = new StatusInfoImpl();
		return statusInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS createSPS() {
		SPSImpl sps = new SPSImpl();
		return sps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INS createINS() {
		INSImpl ins = new INSImpl();
		return ins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPS createDPS() {
		DPSImpl dps = new DPSImpl();
		return dps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACT createACT() {
		ACTImpl act = new ACTImpl();
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACD createACD() {
		ACDImpl acd = new ACDImpl();
		return acd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEC createSEC() {
		SECImpl sec = new SECImpl();
		return sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCR createBCR() {
		BCRImpl bcr = new BCRImpl();
		return bcr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveMeasureAndInfo createPrimitiveMeasureAndInfo() {
		PrimitiveMeasureAndInfoImpl primitiveMeasureAndInfo = new PrimitiveMeasureAndInfoImpl();
		return primitiveMeasureAndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedMeasureAndInfo createComposedMeasureAndInfo() {
		ComposedMeasureAndInfoImpl composedMeasureAndInfo = new ComposedMeasureAndInfoImpl();
		return composedMeasureAndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MV createMV() {
		MVImpl mv = new MVImpl();
		return mv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMV createCMV() {
		CMVImpl cmv = new CMVImpl();
		return cmv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAV createSAV() {
		SAVImpl sav = new SAVImpl();
		return sav;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEL createDEL() {
		DELImpl del = new DELImpl();
		return del;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WYE createWYE() {
		WYEImpl wye = new WYEImpl();
		return wye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ createSEQ() {
		SEQImpl seq = new SEQImpl();
		return seq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMV createHMV() {
		HMVImpl hmv = new HMVImpl();
		return hmv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HYWE createHYWE() {
		HYWEImpl hywe = new HYWEImpl();
		return hywe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDEL createHDEL() {
		HDELImpl hdel = new HDELImpl();
		return hdel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllableStatusInfo createControllableStatusInfo() {
		ControllableStatusInfoImpl controllableStatusInfo = new ControllableStatusInfoImpl();
		return controllableStatusInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPC createSPC() {
		SPCImpl spc = new SPCImpl();
		return spc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPC createDPC() {
		DPCImpl dpc = new DPCImpl();
		return dpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INC createINC() {
		INCImpl inc = new INCImpl();
		return inc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSC createBSC() {
		BSCImpl bsc = new BSCImpl();
		return bsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISC createISC() {
		ISCImpl isc = new ISCImpl();
		return isc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllableAnalogueInfo createControllableAnalogueInfo() {
		ControllableAnalogueInfoImpl controllableAnalogueInfo = new ControllableAnalogueInfoImpl();
		return controllableAnalogueInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APC createAPC() {
		APCImpl apc = new APCImpl();
		return apc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPG createSPG() {
		SPGImpl spg = new SPGImpl();
		return spg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ING createING() {
		INGImpl ing = new INGImpl();
		return ing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueSettings createAnalogueSettings() {
		AnalogueSettingsImpl analogueSettings = new AnalogueSettingsImpl();
		return analogueSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASG createASG() {
		ASGImpl asg = new ASGImpl();
		return asg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CURVE createCURVE() {
		CURVEImpl curve = new CURVEImpl();
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionInfo createDescriptionInfo() {
		DescriptionInfoImpl descriptionInfo = new DescriptionInfoImpl();
		return descriptionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPL createDPL() {
		DPLImpl dpl = new DPLImpl();
		return dpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPL createLPL() {
		LPLImpl lpl = new LPLImpl();
		return lpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSD createCSD() {
		CSDImpl csd = new CSDImpl();
		return csd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataclassesPackage getDataclassesPackage() {
		return (DataclassesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataclassesPackage getPackage() {
		return DataclassesPackage.eINSTANCE;
	}

} //DataclassesFactoryImpl
