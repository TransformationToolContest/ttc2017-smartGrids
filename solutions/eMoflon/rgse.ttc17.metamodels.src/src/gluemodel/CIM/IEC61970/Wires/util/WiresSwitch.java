/**
 */
package gluemodel.CIM.IEC61970.Wires.util;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule;
import gluemodel.CIM.IEC61970.Core.ConductingEquipment;
import gluemodel.CIM.IEC61970.Core.ConnectivityNodeContainer;
import gluemodel.CIM.IEC61970.Core.Curve;
import gluemodel.CIM.IEC61970.Core.Equipment;
import gluemodel.CIM.IEC61970.Core.EquipmentContainer;
import gluemodel.CIM.IEC61970.Core.IdentifiedObject;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;
import gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule;

import gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule;

import gluemodel.CIM.IEC61970.Wires.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage
 * @generated
 */
public class WiresSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WiresPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresSwitch() {
		if (modelPackage == null) {
			modelPackage = WiresPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WiresPackage.SERIES_COMPENSATOR: {
				SeriesCompensator seriesCompensator = (SeriesCompensator)theEObject;
				T result = caseSeriesCompensator(seriesCompensator);
				if (result == null) result = caseConductingEquipment(seriesCompensator);
				if (result == null) result = caseEquipment(seriesCompensator);
				if (result == null) result = casePowerSystemResource(seriesCompensator);
				if (result == null) result = caseIdentifiedObject(seriesCompensator);
				if (result == null) result = caseElement(seriesCompensator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.POWER_TRANSFORMER: {
				PowerTransformer powerTransformer = (PowerTransformer)theEObject;
				T result = casePowerTransformer(powerTransformer);
				if (result == null) result = caseEquipment(powerTransformer);
				if (result == null) result = casePowerSystemResource(powerTransformer);
				if (result == null) result = caseIdentifiedObject(powerTransformer);
				if (result == null) result = caseElement(powerTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.SWITCH: {
				gluemodel.CIM.IEC61970.Wires.Switch switch_ = (gluemodel.CIM.IEC61970.Wires.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseConductingEquipment(switch_);
				if (result == null) result = caseEquipment(switch_);
				if (result == null) result = casePowerSystemResource(switch_);
				if (result == null) result = caseIdentifiedObject(switch_);
				if (result == null) result = caseElement(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.JUMPER: {
				Jumper jumper = (Jumper)theEObject;
				T result = caseJumper(jumper);
				if (result == null) result = caseSwitch(jumper);
				if (result == null) result = caseConductingEquipment(jumper);
				if (result == null) result = caseEquipment(jumper);
				if (result == null) result = casePowerSystemResource(jumper);
				if (result == null) result = caseIdentifiedObject(jumper);
				if (result == null) result = caseElement(jumper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.PLANT: {
				Plant plant = (Plant)theEObject;
				T result = casePlant(plant);
				if (result == null) result = caseEquipmentContainer(plant);
				if (result == null) result = caseConnectivityNodeContainer(plant);
				if (result == null) result = casePowerSystemResource(plant);
				if (result == null) result = caseIdentifiedObject(plant);
				if (result == null) result = caseElement(plant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseEquipmentContainer(line);
				if (result == null) result = caseConnectivityNodeContainer(line);
				if (result == null) result = casePowerSystemResource(line);
				if (result == null) result = caseIdentifiedObject(line);
				if (result == null) result = caseElement(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.ENERGY_SOURCE: {
				EnergySource energySource = (EnergySource)theEObject;
				T result = caseEnergySource(energySource);
				if (result == null) result = caseConductingEquipment(energySource);
				if (result == null) result = caseEquipment(energySource);
				if (result == null) result = casePowerSystemResource(energySource);
				if (result == null) result = caseIdentifiedObject(energySource);
				if (result == null) result = caseElement(energySource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.FREQUENCY_CONVERTER: {
				FrequencyConverter frequencyConverter = (FrequencyConverter)theEObject;
				T result = caseFrequencyConverter(frequencyConverter);
				if (result == null) result = caseRegulatingCondEq(frequencyConverter);
				if (result == null) result = caseConductingEquipment(frequencyConverter);
				if (result == null) result = caseEquipment(frequencyConverter);
				if (result == null) result = casePowerSystemResource(frequencyConverter);
				if (result == null) result = caseIdentifiedObject(frequencyConverter);
				if (result == null) result = caseElement(frequencyConverter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseConductingEquipment(connector);
				if (result == null) result = caseEquipment(connector);
				if (result == null) result = casePowerSystemResource(connector);
				if (result == null) result = caseIdentifiedObject(connector);
				if (result == null) result = caseElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.GROUND: {
				Ground ground = (Ground)theEObject;
				T result = caseGround(ground);
				if (result == null) result = caseConductingEquipment(ground);
				if (result == null) result = caseEquipment(ground);
				if (result == null) result = casePowerSystemResource(ground);
				if (result == null) result = caseIdentifiedObject(ground);
				if (result == null) result = caseElement(ground);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.LOAD_BREAK_SWITCH: {
				LoadBreakSwitch loadBreakSwitch = (LoadBreakSwitch)theEObject;
				T result = caseLoadBreakSwitch(loadBreakSwitch);
				if (result == null) result = caseProtectedSwitch(loadBreakSwitch);
				if (result == null) result = caseSwitch(loadBreakSwitch);
				if (result == null) result = caseConductingEquipment(loadBreakSwitch);
				if (result == null) result = caseEquipment(loadBreakSwitch);
				if (result == null) result = casePowerSystemResource(loadBreakSwitch);
				if (result == null) result = caseIdentifiedObject(loadBreakSwitch);
				if (result == null) result = caseElement(loadBreakSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.IMPEDANCE_VARIATION_CURVE: {
				ImpedanceVariationCurve impedanceVariationCurve = (ImpedanceVariationCurve)theEObject;
				T result = caseImpedanceVariationCurve(impedanceVariationCurve);
				if (result == null) result = caseCurve(impedanceVariationCurve);
				if (result == null) result = caseIdentifiedObject(impedanceVariationCurve);
				if (result == null) result = caseElement(impedanceVariationCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.TAP_SCHEDULE: {
				TapSchedule tapSchedule = (TapSchedule)theEObject;
				T result = caseTapSchedule(tapSchedule);
				if (result == null) result = caseSeasonDayTypeSchedule(tapSchedule);
				if (result == null) result = caseRegularIntervalSchedule(tapSchedule);
				if (result == null) result = caseBasicIntervalSchedule(tapSchedule);
				if (result == null) result = caseIdentifiedObject(tapSchedule);
				if (result == null) result = caseElement(tapSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.MUTUAL_COUPLING: {
				MutualCoupling mutualCoupling = (MutualCoupling)theEObject;
				T result = caseMutualCoupling(mutualCoupling);
				if (result == null) result = caseIdentifiedObject(mutualCoupling);
				if (result == null) result = caseElement(mutualCoupling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.DC_LINE_SEGMENT: {
				DCLineSegment dcLineSegment = (DCLineSegment)theEObject;
				T result = caseDCLineSegment(dcLineSegment);
				if (result == null) result = caseConductor(dcLineSegment);
				if (result == null) result = caseConductingEquipment(dcLineSegment);
				if (result == null) result = caseEquipment(dcLineSegment);
				if (result == null) result = casePowerSystemResource(dcLineSegment);
				if (result == null) result = caseIdentifiedObject(dcLineSegment);
				if (result == null) result = caseElement(dcLineSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.SWITCH_SCHEDULE: {
				SwitchSchedule switchSchedule = (SwitchSchedule)theEObject;
				T result = caseSwitchSchedule(switchSchedule);
				if (result == null) result = caseSeasonDayTypeSchedule(switchSchedule);
				if (result == null) result = caseRegularIntervalSchedule(switchSchedule);
				if (result == null) result = caseBasicIntervalSchedule(switchSchedule);
				if (result == null) result = caseIdentifiedObject(switchSchedule);
				if (result == null) result = caseElement(switchSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.COMPOSITE_SWITCH: {
				CompositeSwitch compositeSwitch = (CompositeSwitch)theEObject;
				T result = caseCompositeSwitch(compositeSwitch);
				if (result == null) result = caseEquipment(compositeSwitch);
				if (result == null) result = casePowerSystemResource(compositeSwitch);
				if (result == null) result = caseIdentifiedObject(compositeSwitch);
				if (result == null) result = caseElement(compositeSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.AC_LINE_SEGMENT: {
				ACLineSegment acLineSegment = (ACLineSegment)theEObject;
				T result = caseACLineSegment(acLineSegment);
				if (result == null) result = caseConductor(acLineSegment);
				if (result == null) result = caseConductingEquipment(acLineSegment);
				if (result == null) result = caseEquipment(acLineSegment);
				if (result == null) result = casePowerSystemResource(acLineSegment);
				if (result == null) result = caseIdentifiedObject(acLineSegment);
				if (result == null) result = caseElement(acLineSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.PHASE_TAP_CHANGER: {
				PhaseTapChanger phaseTapChanger = (PhaseTapChanger)theEObject;
				T result = casePhaseTapChanger(phaseTapChanger);
				if (result == null) result = caseTapChanger(phaseTapChanger);
				if (result == null) result = casePowerSystemResource(phaseTapChanger);
				if (result == null) result = caseIdentifiedObject(phaseTapChanger);
				if (result == null) result = caseElement(phaseTapChanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.ENERGY_CONSUMER: {
				EnergyConsumer energyConsumer = (EnergyConsumer)theEObject;
				T result = caseEnergyConsumer(energyConsumer);
				if (result == null) result = caseConductingEquipment(energyConsumer);
				if (result == null) result = caseEquipment(energyConsumer);
				if (result == null) result = casePowerSystemResource(energyConsumer);
				if (result == null) result = caseIdentifiedObject(energyConsumer);
				if (result == null) result = caseElement(energyConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.REGULATING_COND_EQ: {
				RegulatingCondEq regulatingCondEq = (RegulatingCondEq)theEObject;
				T result = caseRegulatingCondEq(regulatingCondEq);
				if (result == null) result = caseConductingEquipment(regulatingCondEq);
				if (result == null) result = caseEquipment(regulatingCondEq);
				if (result == null) result = casePowerSystemResource(regulatingCondEq);
				if (result == null) result = caseIdentifiedObject(regulatingCondEq);
				if (result == null) result = caseElement(regulatingCondEq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.HEAT_EXCHANGER: {
				HeatExchanger heatExchanger = (HeatExchanger)theEObject;
				T result = caseHeatExchanger(heatExchanger);
				if (result == null) result = caseEquipment(heatExchanger);
				if (result == null) result = casePowerSystemResource(heatExchanger);
				if (result == null) result = caseIdentifiedObject(heatExchanger);
				if (result == null) result = caseElement(heatExchanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.STATIC_VAR_COMPENSATOR: {
				StaticVarCompensator staticVarCompensator = (StaticVarCompensator)theEObject;
				T result = caseStaticVarCompensator(staticVarCompensator);
				if (result == null) result = caseRegulatingCondEq(staticVarCompensator);
				if (result == null) result = caseConductingEquipment(staticVarCompensator);
				if (result == null) result = caseEquipment(staticVarCompensator);
				if (result == null) result = casePowerSystemResource(staticVarCompensator);
				if (result == null) result = caseIdentifiedObject(staticVarCompensator);
				if (result == null) result = caseElement(staticVarCompensator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.PHASE_VARIATION_CURVE: {
				PhaseVariationCurve phaseVariationCurve = (PhaseVariationCurve)theEObject;
				T result = casePhaseVariationCurve(phaseVariationCurve);
				if (result == null) result = caseCurve(phaseVariationCurve);
				if (result == null) result = caseIdentifiedObject(phaseVariationCurve);
				if (result == null) result = caseElement(phaseVariationCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.TAP_CHANGER: {
				TapChanger tapChanger = (TapChanger)theEObject;
				T result = caseTapChanger(tapChanger);
				if (result == null) result = casePowerSystemResource(tapChanger);
				if (result == null) result = caseIdentifiedObject(tapChanger);
				if (result == null) result = caseElement(tapChanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.WINDING_TEST: {
				WindingTest windingTest = (WindingTest)theEObject;
				T result = caseWindingTest(windingTest);
				if (result == null) result = caseIdentifiedObject(windingTest);
				if (result == null) result = caseElement(windingTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.FUSE: {
				Fuse fuse = (Fuse)theEObject;
				T result = caseFuse(fuse);
				if (result == null) result = caseSwitch(fuse);
				if (result == null) result = caseConductingEquipment(fuse);
				if (result == null) result = caseEquipment(fuse);
				if (result == null) result = casePowerSystemResource(fuse);
				if (result == null) result = caseIdentifiedObject(fuse);
				if (result == null) result = caseElement(fuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.REGULATING_CONTROL: {
				RegulatingControl regulatingControl = (RegulatingControl)theEObject;
				T result = caseRegulatingControl(regulatingControl);
				if (result == null) result = casePowerSystemResource(regulatingControl);
				if (result == null) result = caseIdentifiedObject(regulatingControl);
				if (result == null) result = caseElement(regulatingControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.BUSBAR_SECTION: {
				BusbarSection busbarSection = (BusbarSection)theEObject;
				T result = caseBusbarSection(busbarSection);
				if (result == null) result = caseConnector(busbarSection);
				if (result == null) result = caseConductingEquipment(busbarSection);
				if (result == null) result = caseEquipment(busbarSection);
				if (result == null) result = casePowerSystemResource(busbarSection);
				if (result == null) result = caseIdentifiedObject(busbarSection);
				if (result == null) result = caseElement(busbarSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.RESISTOR: {
				Resistor resistor = (Resistor)theEObject;
				T result = caseResistor(resistor);
				if (result == null) result = caseConductingEquipment(resistor);
				if (result == null) result = caseEquipment(resistor);
				if (result == null) result = casePowerSystemResource(resistor);
				if (result == null) result = caseIdentifiedObject(resistor);
				if (result == null) result = caseElement(resistor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.RATIO_VARIATION_CURVE: {
				RatioVariationCurve ratioVariationCurve = (RatioVariationCurve)theEObject;
				T result = caseRatioVariationCurve(ratioVariationCurve);
				if (result == null) result = caseCurve(ratioVariationCurve);
				if (result == null) result = caseIdentifiedObject(ratioVariationCurve);
				if (result == null) result = caseElement(ratioVariationCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.RECTIFIER_INVERTER: {
				RectifierInverter rectifierInverter = (RectifierInverter)theEObject;
				T result = caseRectifierInverter(rectifierInverter);
				if (result == null) result = caseConductingEquipment(rectifierInverter);
				if (result == null) result = caseEquipment(rectifierInverter);
				if (result == null) result = casePowerSystemResource(rectifierInverter);
				if (result == null) result = caseIdentifiedObject(rectifierInverter);
				if (result == null) result = caseElement(rectifierInverter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.BREAKER: {
				Breaker breaker = (Breaker)theEObject;
				T result = caseBreaker(breaker);
				if (result == null) result = caseProtectedSwitch(breaker);
				if (result == null) result = caseSwitch(breaker);
				if (result == null) result = caseConductingEquipment(breaker);
				if (result == null) result = caseEquipment(breaker);
				if (result == null) result = casePowerSystemResource(breaker);
				if (result == null) result = caseIdentifiedObject(breaker);
				if (result == null) result = caseElement(breaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.TRANSFORMER_WINDING: {
				TransformerWinding transformerWinding = (TransformerWinding)theEObject;
				T result = caseTransformerWinding(transformerWinding);
				if (result == null) result = caseConductingEquipment(transformerWinding);
				if (result == null) result = caseEquipment(transformerWinding);
				if (result == null) result = casePowerSystemResource(transformerWinding);
				if (result == null) result = caseIdentifiedObject(transformerWinding);
				if (result == null) result = caseElement(transformerWinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.GROUND_DISCONNECTOR: {
				GroundDisconnector groundDisconnector = (GroundDisconnector)theEObject;
				T result = caseGroundDisconnector(groundDisconnector);
				if (result == null) result = caseSwitch(groundDisconnector);
				if (result == null) result = caseConductingEquipment(groundDisconnector);
				if (result == null) result = caseEquipment(groundDisconnector);
				if (result == null) result = casePowerSystemResource(groundDisconnector);
				if (result == null) result = caseIdentifiedObject(groundDisconnector);
				if (result == null) result = caseElement(groundDisconnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.VOLTAGE_CONTROL_ZONE: {
				VoltageControlZone voltageControlZone = (VoltageControlZone)theEObject;
				T result = caseVoltageControlZone(voltageControlZone);
				if (result == null) result = casePowerSystemResource(voltageControlZone);
				if (result == null) result = caseIdentifiedObject(voltageControlZone);
				if (result == null) result = caseElement(voltageControlZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.PROTECTED_SWITCH: {
				ProtectedSwitch protectedSwitch = (ProtectedSwitch)theEObject;
				T result = caseProtectedSwitch(protectedSwitch);
				if (result == null) result = caseSwitch(protectedSwitch);
				if (result == null) result = caseConductingEquipment(protectedSwitch);
				if (result == null) result = caseEquipment(protectedSwitch);
				if (result == null) result = casePowerSystemResource(protectedSwitch);
				if (result == null) result = caseIdentifiedObject(protectedSwitch);
				if (result == null) result = caseElement(protectedSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.SHUNT_COMPENSATOR: {
				ShuntCompensator shuntCompensator = (ShuntCompensator)theEObject;
				T result = caseShuntCompensator(shuntCompensator);
				if (result == null) result = caseRegulatingCondEq(shuntCompensator);
				if (result == null) result = caseConductingEquipment(shuntCompensator);
				if (result == null) result = caseEquipment(shuntCompensator);
				if (result == null) result = casePowerSystemResource(shuntCompensator);
				if (result == null) result = caseIdentifiedObject(shuntCompensator);
				if (result == null) result = caseElement(shuntCompensator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.CONDUCTOR: {
				Conductor conductor = (Conductor)theEObject;
				T result = caseConductor(conductor);
				if (result == null) result = caseConductingEquipment(conductor);
				if (result == null) result = caseEquipment(conductor);
				if (result == null) result = casePowerSystemResource(conductor);
				if (result == null) result = caseIdentifiedObject(conductor);
				if (result == null) result = caseElement(conductor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.DISCONNECTOR: {
				Disconnector disconnector = (Disconnector)theEObject;
				T result = caseDisconnector(disconnector);
				if (result == null) result = caseSwitch(disconnector);
				if (result == null) result = caseConductingEquipment(disconnector);
				if (result == null) result = caseEquipment(disconnector);
				if (result == null) result = casePowerSystemResource(disconnector);
				if (result == null) result = caseIdentifiedObject(disconnector);
				if (result == null) result = caseElement(disconnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.SYNCHRONOUS_MACHINE: {
				SynchronousMachine synchronousMachine = (SynchronousMachine)theEObject;
				T result = caseSynchronousMachine(synchronousMachine);
				if (result == null) result = caseRegulatingCondEq(synchronousMachine);
				if (result == null) result = caseConductingEquipment(synchronousMachine);
				if (result == null) result = caseEquipment(synchronousMachine);
				if (result == null) result = casePowerSystemResource(synchronousMachine);
				if (result == null) result = caseIdentifiedObject(synchronousMachine);
				if (result == null) result = caseElement(synchronousMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.JUNCTION: {
				Junction junction = (Junction)theEObject;
				T result = caseJunction(junction);
				if (result == null) result = caseConnector(junction);
				if (result == null) result = caseConductingEquipment(junction);
				if (result == null) result = caseEquipment(junction);
				if (result == null) result = casePowerSystemResource(junction);
				if (result == null) result = caseIdentifiedObject(junction);
				if (result == null) result = caseElement(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.REGULATION_SCHEDULE: {
				RegulationSchedule regulationSchedule = (RegulationSchedule)theEObject;
				T result = caseRegulationSchedule(regulationSchedule);
				if (result == null) result = caseSeasonDayTypeSchedule(regulationSchedule);
				if (result == null) result = caseRegularIntervalSchedule(regulationSchedule);
				if (result == null) result = caseBasicIntervalSchedule(regulationSchedule);
				if (result == null) result = caseIdentifiedObject(regulationSchedule);
				if (result == null) result = caseElement(regulationSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.REACTIVE_CAPABILITY_CURVE: {
				ReactiveCapabilityCurve reactiveCapabilityCurve = (ReactiveCapabilityCurve)theEObject;
				T result = caseReactiveCapabilityCurve(reactiveCapabilityCurve);
				if (result == null) result = caseCurve(reactiveCapabilityCurve);
				if (result == null) result = caseIdentifiedObject(reactiveCapabilityCurve);
				if (result == null) result = caseElement(reactiveCapabilityCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.RATIO_TAP_CHANGER: {
				RatioTapChanger ratioTapChanger = (RatioTapChanger)theEObject;
				T result = caseRatioTapChanger(ratioTapChanger);
				if (result == null) result = caseTapChanger(ratioTapChanger);
				if (result == null) result = casePowerSystemResource(ratioTapChanger);
				if (result == null) result = caseIdentifiedObject(ratioTapChanger);
				if (result == null) result = caseElement(ratioTapChanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Compensator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesCompensator(SeriesCompensator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerTransformer(PowerTransformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(gluemodel.CIM.IEC61970.Wires.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jumper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jumper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumper(Jumper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlant(Plant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergySource(EnergySource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Converter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Converter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConverter(FrequencyConverter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGround(Ground object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Break Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Break Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBreakSwitch(LoadBreakSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impedance Variation Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impedance Variation Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpedanceVariationCurve(ImpedanceVariationCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tap Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tap Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapSchedule(TapSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutual Coupling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutual Coupling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutualCoupling(MutualCoupling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DC Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DC Line Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCLineSegment(DCLineSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchSchedule(SwitchSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSwitch(CompositeSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACLineSegment(ACLineSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseTapChanger(PhaseTapChanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumer(EnergyConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulating Cond Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulating Cond Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatingCondEq(RegulatingCondEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heat Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heat Exchanger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeatExchanger(HeatExchanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Var Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Var Compensator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticVarCompensator(StaticVarCompensator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Variation Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Variation Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseVariationCurve(PhaseVariationCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapChanger(TapChanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Winding Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Winding Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindingTest(WindingTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuse(Fuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulating Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulating Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatingControl(RegulatingControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Busbar Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Busbar Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusbarSection(BusbarSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resistor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resistor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResistor(Resistor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio Variation Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio Variation Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatioVariationCurve(RatioVariationCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectifier Inverter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectifier Inverter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectifierInverter(RectifierInverter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreaker(Breaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Winding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Winding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerWinding(TransformerWinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Disconnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Disconnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundDisconnector(GroundDisconnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Control Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Control Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageControlZone(VoltageControlZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protected Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protected Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectedSwitch(ProtectedSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shunt Compensator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shunt Compensator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShuntCompensator(ShuntCompensator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conductor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conductor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductor(Conductor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnector(Disconnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousMachine(SynchronousMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunction(Junction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulation Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulation Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulationSchedule(RegulationSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reactive Capability Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactive Capability Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactiveCapabilityCurve(ReactiveCapabilityCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio Tap Changer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatioTapChanger(RatioTapChanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResource(PowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipment(Equipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductingEquipment(ConductingEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityNodeContainer(ConnectivityNodeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipmentContainer(EquipmentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicIntervalSchedule(BasicIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularIntervalSchedule(RegularIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Season Day Type Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Season Day Type Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeasonDayTypeSchedule(SeasonDayTypeSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WiresSwitch
