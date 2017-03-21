/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Wires.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WiresFactoryImpl extends EFactoryImpl implements WiresFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiresFactory init() {
		try {
			WiresFactory theWiresFactory = (WiresFactory)EPackage.Registry.INSTANCE.getEFactory(WiresPackage.eNS_URI);
			if (theWiresFactory != null) {
				return theWiresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresFactoryImpl() {
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
			case WiresPackage.SERIES_COMPENSATOR: return createSeriesCompensator();
			case WiresPackage.POWER_TRANSFORMER: return createPowerTransformer();
			case WiresPackage.SWITCH: return createSwitch();
			case WiresPackage.JUMPER: return createJumper();
			case WiresPackage.PLANT: return createPlant();
			case WiresPackage.LINE: return createLine();
			case WiresPackage.ENERGY_SOURCE: return createEnergySource();
			case WiresPackage.FREQUENCY_CONVERTER: return createFrequencyConverter();
			case WiresPackage.CONNECTOR: return createConnector();
			case WiresPackage.GROUND: return createGround();
			case WiresPackage.LOAD_BREAK_SWITCH: return createLoadBreakSwitch();
			case WiresPackage.IMPEDANCE_VARIATION_CURVE: return createImpedanceVariationCurve();
			case WiresPackage.TAP_SCHEDULE: return createTapSchedule();
			case WiresPackage.MUTUAL_COUPLING: return createMutualCoupling();
			case WiresPackage.DC_LINE_SEGMENT: return createDCLineSegment();
			case WiresPackage.SWITCH_SCHEDULE: return createSwitchSchedule();
			case WiresPackage.COMPOSITE_SWITCH: return createCompositeSwitch();
			case WiresPackage.AC_LINE_SEGMENT: return createACLineSegment();
			case WiresPackage.PHASE_TAP_CHANGER: return createPhaseTapChanger();
			case WiresPackage.ENERGY_CONSUMER: return createEnergyConsumer();
			case WiresPackage.REGULATING_COND_EQ: return createRegulatingCondEq();
			case WiresPackage.HEAT_EXCHANGER: return createHeatExchanger();
			case WiresPackage.STATIC_VAR_COMPENSATOR: return createStaticVarCompensator();
			case WiresPackage.PHASE_VARIATION_CURVE: return createPhaseVariationCurve();
			case WiresPackage.TAP_CHANGER: return createTapChanger();
			case WiresPackage.WINDING_TEST: return createWindingTest();
			case WiresPackage.FUSE: return createFuse();
			case WiresPackage.REGULATING_CONTROL: return createRegulatingControl();
			case WiresPackage.BUSBAR_SECTION: return createBusbarSection();
			case WiresPackage.RESISTOR: return createResistor();
			case WiresPackage.RATIO_VARIATION_CURVE: return createRatioVariationCurve();
			case WiresPackage.RECTIFIER_INVERTER: return createRectifierInverter();
			case WiresPackage.BREAKER: return createBreaker();
			case WiresPackage.TRANSFORMER_WINDING: return createTransformerWinding();
			case WiresPackage.GROUND_DISCONNECTOR: return createGroundDisconnector();
			case WiresPackage.VOLTAGE_CONTROL_ZONE: return createVoltageControlZone();
			case WiresPackage.PROTECTED_SWITCH: return createProtectedSwitch();
			case WiresPackage.SHUNT_COMPENSATOR: return createShuntCompensator();
			case WiresPackage.CONDUCTOR: return createConductor();
			case WiresPackage.DISCONNECTOR: return createDisconnector();
			case WiresPackage.SYNCHRONOUS_MACHINE: return createSynchronousMachine();
			case WiresPackage.JUNCTION: return createJunction();
			case WiresPackage.REGULATION_SCHEDULE: return createRegulationSchedule();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE: return createReactiveCapabilityCurve();
			case WiresPackage.RATIO_TAP_CHANGER: return createRatioTapChanger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WiresPackage.SVC_CONTROL_MODE:
				return createSVCControlModeFromString(eDataType, initialValue);
			case WiresPackage.PHASE_TAP_CHANGER_KIND:
				return createPhaseTapChangerKindFromString(eDataType, initialValue);
			case WiresPackage.WINDING_TYPE:
				return createWindingTypeFromString(eDataType, initialValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_TYPE:
				return createSynchronousMachineTypeFromString(eDataType, initialValue);
			case WiresPackage.COOLANT_TYPE:
				return createCoolantTypeFromString(eDataType, initialValue);
			case WiresPackage.TRANSFORMER_CONTROL_MODE:
				return createTransformerControlModeFromString(eDataType, initialValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
				return createSynchronousMachineOperatingModeFromString(eDataType, initialValue);
			case WiresPackage.WINDING_CONNECTION:
				return createWindingConnectionFromString(eDataType, initialValue);
			case WiresPackage.TAP_CHANGER_KIND:
				return createTapChangerKindFromString(eDataType, initialValue);
			case WiresPackage.REGULATING_CONTROL_MODE_KIND:
				return createRegulatingControlModeKindFromString(eDataType, initialValue);
			case WiresPackage.OPERATING_MODE:
				return createOperatingModeFromString(eDataType, initialValue);
			case WiresPackage.COMPOSITE_SWITCH_TYPE:
				return createCompositeSwitchTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WiresPackage.SVC_CONTROL_MODE:
				return convertSVCControlModeToString(eDataType, instanceValue);
			case WiresPackage.PHASE_TAP_CHANGER_KIND:
				return convertPhaseTapChangerKindToString(eDataType, instanceValue);
			case WiresPackage.WINDING_TYPE:
				return convertWindingTypeToString(eDataType, instanceValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_TYPE:
				return convertSynchronousMachineTypeToString(eDataType, instanceValue);
			case WiresPackage.COOLANT_TYPE:
				return convertCoolantTypeToString(eDataType, instanceValue);
			case WiresPackage.TRANSFORMER_CONTROL_MODE:
				return convertTransformerControlModeToString(eDataType, instanceValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
				return convertSynchronousMachineOperatingModeToString(eDataType, instanceValue);
			case WiresPackage.WINDING_CONNECTION:
				return convertWindingConnectionToString(eDataType, instanceValue);
			case WiresPackage.TAP_CHANGER_KIND:
				return convertTapChangerKindToString(eDataType, instanceValue);
			case WiresPackage.REGULATING_CONTROL_MODE_KIND:
				return convertRegulatingControlModeKindToString(eDataType, instanceValue);
			case WiresPackage.OPERATING_MODE:
				return convertOperatingModeToString(eDataType, instanceValue);
			case WiresPackage.COMPOSITE_SWITCH_TYPE:
				return convertCompositeSwitchTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesCompensator createSeriesCompensator() {
		SeriesCompensatorImpl seriesCompensator = new SeriesCompensatorImpl();
		return seriesCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer createPowerTransformer() {
		PowerTransformerImpl powerTransformer = new PowerTransformerImpl();
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jumper createJumper() {
		JumperImpl jumper = new JumperImpl();
		return jumper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant createPlant() {
		PlantImpl plant = new PlantImpl();
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergySource createEnergySource() {
		EnergySourceImpl energySource = new EnergySourceImpl();
		return energySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConverter createFrequencyConverter() {
		FrequencyConverterImpl frequencyConverter = new FrequencyConverterImpl();
		return frequencyConverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ground createGround() {
		GroundImpl ground = new GroundImpl();
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBreakSwitch createLoadBreakSwitch() {
		LoadBreakSwitchImpl loadBreakSwitch = new LoadBreakSwitchImpl();
		return loadBreakSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpedanceVariationCurve createImpedanceVariationCurve() {
		ImpedanceVariationCurveImpl impedanceVariationCurve = new ImpedanceVariationCurveImpl();
		return impedanceVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapSchedule createTapSchedule() {
		TapScheduleImpl tapSchedule = new TapScheduleImpl();
		return tapSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualCoupling createMutualCoupling() {
		MutualCouplingImpl mutualCoupling = new MutualCouplingImpl();
		return mutualCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCLineSegment createDCLineSegment() {
		DCLineSegmentImpl dcLineSegment = new DCLineSegmentImpl();
		return dcLineSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchSchedule createSwitchSchedule() {
		SwitchScheduleImpl switchSchedule = new SwitchScheduleImpl();
		return switchSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitch createCompositeSwitch() {
		CompositeSwitchImpl compositeSwitch = new CompositeSwitchImpl();
		return compositeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACLineSegment createACLineSegment() {
		ACLineSegmentImpl acLineSegment = new ACLineSegmentImpl();
		return acLineSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChanger createPhaseTapChanger() {
		PhaseTapChangerImpl phaseTapChanger = new PhaseTapChangerImpl();
		return phaseTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer createEnergyConsumer() {
		EnergyConsumerImpl energyConsumer = new EnergyConsumerImpl();
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingCondEq createRegulatingCondEq() {
		RegulatingCondEqImpl regulatingCondEq = new RegulatingCondEqImpl();
		return regulatingCondEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatExchanger createHeatExchanger() {
		HeatExchangerImpl heatExchanger = new HeatExchangerImpl();
		return heatExchanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticVarCompensator createStaticVarCompensator() {
		StaticVarCompensatorImpl staticVarCompensator = new StaticVarCompensatorImpl();
		return staticVarCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseVariationCurve createPhaseVariationCurve() {
		PhaseVariationCurveImpl phaseVariationCurve = new PhaseVariationCurveImpl();
		return phaseVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger createTapChanger() {
		TapChangerImpl tapChanger = new TapChangerImpl();
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingTest createWindingTest() {
		WindingTestImpl windingTest = new WindingTestImpl();
		return windingTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fuse createFuse() {
		FuseImpl fuse = new FuseImpl();
		return fuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl createRegulatingControl() {
		RegulatingControlImpl regulatingControl = new RegulatingControlImpl();
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusbarSection createBusbarSection() {
		BusbarSectionImpl busbarSection = new BusbarSectionImpl();
		return busbarSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resistor createResistor() {
		ResistorImpl resistor = new ResistorImpl();
		return resistor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioVariationCurve createRatioVariationCurve() {
		RatioVariationCurveImpl ratioVariationCurve = new RatioVariationCurveImpl();
		return ratioVariationCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifierInverter createRectifierInverter() {
		RectifierInverterImpl rectifierInverter = new RectifierInverterImpl();
		return rectifierInverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breaker createBreaker() {
		BreakerImpl breaker = new BreakerImpl();
		return breaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerWinding createTransformerWinding() {
		TransformerWindingImpl transformerWinding = new TransformerWindingImpl();
		return transformerWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundDisconnector createGroundDisconnector() {
		GroundDisconnectorImpl groundDisconnector = new GroundDisconnectorImpl();
		return groundDisconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageControlZone createVoltageControlZone() {
		VoltageControlZoneImpl voltageControlZone = new VoltageControlZoneImpl();
		return voltageControlZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectedSwitch createProtectedSwitch() {
		ProtectedSwitchImpl protectedSwitch = new ProtectedSwitchImpl();
		return protectedSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensator createShuntCompensator() {
		ShuntCompensatorImpl shuntCompensator = new ShuntCompensatorImpl();
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor createConductor() {
		ConductorImpl conductor = new ConductorImpl();
		return conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disconnector createDisconnector() {
		DisconnectorImpl disconnector = new DisconnectorImpl();
		return disconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachine createSynchronousMachine() {
		SynchronousMachineImpl synchronousMachine = new SynchronousMachineImpl();
		return synchronousMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Junction createJunction() {
		JunctionImpl junction = new JunctionImpl();
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationSchedule createRegulationSchedule() {
		RegulationScheduleImpl regulationSchedule = new RegulationScheduleImpl();
		return regulationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveCapabilityCurve createReactiveCapabilityCurve() {
		ReactiveCapabilityCurveImpl reactiveCapabilityCurve = new ReactiveCapabilityCurveImpl();
		return reactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChanger createRatioTapChanger() {
		RatioTapChangerImpl ratioTapChanger = new RatioTapChangerImpl();
		return ratioTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVCControlMode createSVCControlModeFromString(EDataType eDataType, String initialValue) {
		SVCControlMode result = SVCControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSVCControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerKind createPhaseTapChangerKindFromString(EDataType eDataType, String initialValue) {
		PhaseTapChangerKind result = PhaseTapChangerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseTapChangerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingType createWindingTypeFromString(EDataType eDataType, String initialValue) {
		WindingType result = WindingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineType createSynchronousMachineTypeFromString(EDataType eDataType, String initialValue) {
		SynchronousMachineType result = SynchronousMachineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronousMachineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoolantType createCoolantTypeFromString(EDataType eDataType, String initialValue) {
		CoolantType result = CoolantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoolantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerControlMode createTransformerControlModeFromString(EDataType eDataType, String initialValue) {
		TransformerControlMode result = TransformerControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineOperatingMode createSynchronousMachineOperatingModeFromString(EDataType eDataType, String initialValue) {
		SynchronousMachineOperatingMode result = SynchronousMachineOperatingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronousMachineOperatingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingConnection createWindingConnectionFromString(EDataType eDataType, String initialValue) {
		WindingConnection result = WindingConnection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindingConnectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerKind createTapChangerKindFromString(EDataType eDataType, String initialValue) {
		TapChangerKind result = TapChangerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTapChangerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControlModeKind createRegulatingControlModeKindFromString(EDataType eDataType, String initialValue) {
		RegulatingControlModeKind result = RegulatingControlModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegulatingControlModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOperatingModeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatingModeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCompositeSwitchTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeSwitchTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresPackage getWiresPackage() {
		return (WiresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiresPackage getPackage() {
		return WiresPackage.eINSTANCE;
	}

} //WiresFactoryImpl
