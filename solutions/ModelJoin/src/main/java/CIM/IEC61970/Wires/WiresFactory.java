/**
 */
package CIM.IEC61970.Wires;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Wires.WiresPackage
 * @generated
 */
public interface WiresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiresFactory eINSTANCE = CIM.IEC61970.Wires.impl.WiresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Series Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Series Compensator</em>'.
	 * @generated
	 */
	SeriesCompensator createSeriesCompensator();

	/**
	 * Returns a new object of class '<em>Power Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Transformer</em>'.
	 * @generated
	 */
	PowerTransformer createPowerTransformer();

	/**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
	Switch createSwitch();

	/**
	 * Returns a new object of class '<em>Jumper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jumper</em>'.
	 * @generated
	 */
	Jumper createJumper();

	/**
	 * Returns a new object of class '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plant</em>'.
	 * @generated
	 */
	Plant createPlant();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Energy Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Source</em>'.
	 * @generated
	 */
	EnergySource createEnergySource();

	/**
	 * Returns a new object of class '<em>Frequency Converter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frequency Converter</em>'.
	 * @generated
	 */
	FrequencyConverter createFrequencyConverter();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Ground</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground</em>'.
	 * @generated
	 */
	Ground createGround();

	/**
	 * Returns a new object of class '<em>Load Break Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Break Switch</em>'.
	 * @generated
	 */
	LoadBreakSwitch createLoadBreakSwitch();

	/**
	 * Returns a new object of class '<em>Impedance Variation Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impedance Variation Curve</em>'.
	 * @generated
	 */
	ImpedanceVariationCurve createImpedanceVariationCurve();

	/**
	 * Returns a new object of class '<em>Tap Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tap Schedule</em>'.
	 * @generated
	 */
	TapSchedule createTapSchedule();

	/**
	 * Returns a new object of class '<em>Mutual Coupling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutual Coupling</em>'.
	 * @generated
	 */
	MutualCoupling createMutualCoupling();

	/**
	 * Returns a new object of class '<em>DC Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DC Line Segment</em>'.
	 * @generated
	 */
	DCLineSegment createDCLineSegment();

	/**
	 * Returns a new object of class '<em>Switch Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Schedule</em>'.
	 * @generated
	 */
	SwitchSchedule createSwitchSchedule();

	/**
	 * Returns a new object of class '<em>Composite Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Switch</em>'.
	 * @generated
	 */
	CompositeSwitch createCompositeSwitch();

	/**
	 * Returns a new object of class '<em>AC Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AC Line Segment</em>'.
	 * @generated
	 */
	ACLineSegment createACLineSegment();

	/**
	 * Returns a new object of class '<em>Phase Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase Tap Changer</em>'.
	 * @generated
	 */
	PhaseTapChanger createPhaseTapChanger();

	/**
	 * Returns a new object of class '<em>Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Consumer</em>'.
	 * @generated
	 */
	EnergyConsumer createEnergyConsumer();

	/**
	 * Returns a new object of class '<em>Regulating Cond Eq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulating Cond Eq</em>'.
	 * @generated
	 */
	RegulatingCondEq createRegulatingCondEq();

	/**
	 * Returns a new object of class '<em>Heat Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heat Exchanger</em>'.
	 * @generated
	 */
	HeatExchanger createHeatExchanger();

	/**
	 * Returns a new object of class '<em>Static Var Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Var Compensator</em>'.
	 * @generated
	 */
	StaticVarCompensator createStaticVarCompensator();

	/**
	 * Returns a new object of class '<em>Phase Variation Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase Variation Curve</em>'.
	 * @generated
	 */
	PhaseVariationCurve createPhaseVariationCurve();

	/**
	 * Returns a new object of class '<em>Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tap Changer</em>'.
	 * @generated
	 */
	TapChanger createTapChanger();

	/**
	 * Returns a new object of class '<em>Winding Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Winding Test</em>'.
	 * @generated
	 */
	WindingTest createWindingTest();

	/**
	 * Returns a new object of class '<em>Fuse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuse</em>'.
	 * @generated
	 */
	Fuse createFuse();

	/**
	 * Returns a new object of class '<em>Regulating Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulating Control</em>'.
	 * @generated
	 */
	RegulatingControl createRegulatingControl();

	/**
	 * Returns a new object of class '<em>Busbar Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Busbar Section</em>'.
	 * @generated
	 */
	BusbarSection createBusbarSection();

	/**
	 * Returns a new object of class '<em>Resistor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resistor</em>'.
	 * @generated
	 */
	Resistor createResistor();

	/**
	 * Returns a new object of class '<em>Ratio Variation Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratio Variation Curve</em>'.
	 * @generated
	 */
	RatioVariationCurve createRatioVariationCurve();

	/**
	 * Returns a new object of class '<em>Rectifier Inverter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectifier Inverter</em>'.
	 * @generated
	 */
	RectifierInverter createRectifierInverter();

	/**
	 * Returns a new object of class '<em>Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breaker</em>'.
	 * @generated
	 */
	Breaker createBreaker();

	/**
	 * Returns a new object of class '<em>Transformer Winding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformer Winding</em>'.
	 * @generated
	 */
	TransformerWinding createTransformerWinding();

	/**
	 * Returns a new object of class '<em>Ground Disconnector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Disconnector</em>'.
	 * @generated
	 */
	GroundDisconnector createGroundDisconnector();

	/**
	 * Returns a new object of class '<em>Voltage Control Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voltage Control Zone</em>'.
	 * @generated
	 */
	VoltageControlZone createVoltageControlZone();

	/**
	 * Returns a new object of class '<em>Protected Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protected Switch</em>'.
	 * @generated
	 */
	ProtectedSwitch createProtectedSwitch();

	/**
	 * Returns a new object of class '<em>Shunt Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shunt Compensator</em>'.
	 * @generated
	 */
	ShuntCompensator createShuntCompensator();

	/**
	 * Returns a new object of class '<em>Conductor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conductor</em>'.
	 * @generated
	 */
	Conductor createConductor();

	/**
	 * Returns a new object of class '<em>Disconnector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconnector</em>'.
	 * @generated
	 */
	Disconnector createDisconnector();

	/**
	 * Returns a new object of class '<em>Synchronous Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronous Machine</em>'.
	 * @generated
	 */
	SynchronousMachine createSynchronousMachine();

	/**
	 * Returns a new object of class '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Junction</em>'.
	 * @generated
	 */
	Junction createJunction();

	/**
	 * Returns a new object of class '<em>Regulation Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulation Schedule</em>'.
	 * @generated
	 */
	RegulationSchedule createRegulationSchedule();

	/**
	 * Returns a new object of class '<em>Reactive Capability Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactive Capability Curve</em>'.
	 * @generated
	 */
	ReactiveCapabilityCurve createReactiveCapabilityCurve();

	/**
	 * Returns a new object of class '<em>Ratio Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratio Tap Changer</em>'.
	 * @generated
	 */
	RatioTapChanger createRatioTapChanger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WiresPackage getWiresPackage();

} //WiresFactory
