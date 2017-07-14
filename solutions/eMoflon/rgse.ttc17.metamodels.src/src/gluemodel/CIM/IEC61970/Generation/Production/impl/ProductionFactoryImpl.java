/**
 */
package gluemodel.CIM.IEC61970.Generation.Production.impl;

import gluemodel.CIM.IEC61970.Generation.Production.*;

import java.math.BigInteger;

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
public class ProductionFactoryImpl extends EFactoryImpl implements ProductionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductionFactory init() {
		try {
			ProductionFactory theProductionFactory = (ProductionFactory)EPackage.Registry.INSTANCE.getEFactory(ProductionPackage.eNS_URI);
			if (theProductionFactory != null) {
				return theProductionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionFactoryImpl() {
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
			case ProductionPackage.HYDRO_GENERATING_UNIT: return createHydroGeneratingUnit();
			case ProductionPackage.HEAT_RATE_CURVE: return createHeatRateCurve();
			case ProductionPackage.START_IGN_FUEL_CURVE: return createStartIgnFuelCurve();
			case ProductionPackage.COGENERATION_PLANT: return createCogenerationPlant();
			case ProductionPackage.CAES_PLANT: return createCAESPlant();
			case ProductionPackage.THERMAL_GENERATING_UNIT: return createThermalGeneratingUnit();
			case ProductionPackage.WIND_GENERATING_UNIT: return createWindGeneratingUnit();
			case ProductionPackage.TAILBAY_LOSS_CURVE: return createTailbayLossCurve();
			case ProductionPackage.START_RAMP_CURVE: return createStartRampCurve();
			case ProductionPackage.STARTUP_MODEL: return createStartupModel();
			case ProductionPackage.COMBINED_CYCLE_PLANT: return createCombinedCyclePlant();
			case ProductionPackage.HYDRO_PUMP: return createHydroPump();
			case ProductionPackage.PENSTOCK_LOSS_CURVE: return createPenstockLossCurve();
			case ProductionPackage.SHUTDOWN_CURVE: return createShutdownCurve();
			case ProductionPackage.INCREMENTAL_HEAT_RATE_CURVE: return createIncrementalHeatRateCurve();
			case ProductionPackage.GEN_UNIT_OP_SCHEDULE: return createGenUnitOpSchedule();
			case ProductionPackage.TARGET_LEVEL_SCHEDULE: return createTargetLevelSchedule();
			case ProductionPackage.EMISSION_CURVE: return createEmissionCurve();
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE: return createGenUnitOpCostCurve();
			case ProductionPackage.FOSSIL_FUEL: return createFossilFuel();
			case ProductionPackage.INFLOW_FORECAST: return createInflowForecast();
			case ProductionPackage.HYDRO_POWER_PLANT: return createHydroPowerPlant();
			case ProductionPackage.START_MAIN_FUEL_CURVE: return createStartMainFuelCurve();
			case ProductionPackage.LEVEL_VS_VOLUME_CURVE: return createLevelVsVolumeCurve();
			case ProductionPackage.HEAT_INPUT_CURVE: return createHeatInputCurve();
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE: return createHydroPumpOpSchedule();
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE: return createSteamSendoutSchedule();
			case ProductionPackage.GENERATING_UNIT: return createGeneratingUnit();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE: return createFuelAllocationSchedule();
			case ProductionPackage.RESERVOIR: return createReservoir();
			case ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE: return createHydroGeneratingEfficiencyCurve();
			case ProductionPackage.NUCLEAR_GENERATING_UNIT: return createNuclearGeneratingUnit();
			case ProductionPackage.AIR_COMPRESSOR: return createAirCompressor();
			case ProductionPackage.EMISSION_ACCOUNT: return createEmissionAccount();
			case ProductionPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE: return createGrossToNetActivePowerCurve();
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
			case ProductionPackage.FUEL_TYPE:
				return createFuelTypeFromString(eDataType, initialValue);
			case ProductionPackage.PENSTOCK_TYPE:
				return createPenstockTypeFromString(eDataType, initialValue);
			case ProductionPackage.GENERATOR_CONTROL_SOURCE:
				return createGeneratorControlSourceFromString(eDataType, initialValue);
			case ProductionPackage.EMISSION_VALUE_SOURCE:
				return createEmissionValueSourceFromString(eDataType, initialValue);
			case ProductionPackage.GENERATOR_OPERATING_MODE:
				return createGeneratorOperatingModeFromString(eDataType, initialValue);
			case ProductionPackage.SPILLWAY_GATE_TYPE:
				return createSpillwayGateTypeFromString(eDataType, initialValue);
			case ProductionPackage.GENERATOR_CONTROL_MODE:
				return createGeneratorControlModeFromString(eDataType, initialValue);
			case ProductionPackage.HYDRO_PLANT_TYPE:
				return createHydroPlantTypeFromString(eDataType, initialValue);
			case ProductionPackage.EMISSION_TYPE:
				return createEmissionTypeFromString(eDataType, initialValue);
			case ProductionPackage.HYDRO_ENERGY_CONVERSION_KIND:
				return createHydroEnergyConversionKindFromString(eDataType, initialValue);
			case ProductionPackage.SURGE_TANK_CODE:
				return createSurgeTankCodeFromString(eDataType, initialValue);
			case ProductionPackage.HEAT_RATE:
				return createHeatRateFromString(eDataType, initialValue);
			case ProductionPackage.CLASSIFICATION:
				return createClassificationFromString(eDataType, initialValue);
			case ProductionPackage.EMISSION:
				return createEmissionFromString(eDataType, initialValue);
			case ProductionPackage.COST_PER_HEAT_UNIT:
				return createCostPerHeatUnitFromString(eDataType, initialValue);
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
			case ProductionPackage.FUEL_TYPE:
				return convertFuelTypeToString(eDataType, instanceValue);
			case ProductionPackage.PENSTOCK_TYPE:
				return convertPenstockTypeToString(eDataType, instanceValue);
			case ProductionPackage.GENERATOR_CONTROL_SOURCE:
				return convertGeneratorControlSourceToString(eDataType, instanceValue);
			case ProductionPackage.EMISSION_VALUE_SOURCE:
				return convertEmissionValueSourceToString(eDataType, instanceValue);
			case ProductionPackage.GENERATOR_OPERATING_MODE:
				return convertGeneratorOperatingModeToString(eDataType, instanceValue);
			case ProductionPackage.SPILLWAY_GATE_TYPE:
				return convertSpillwayGateTypeToString(eDataType, instanceValue);
			case ProductionPackage.GENERATOR_CONTROL_MODE:
				return convertGeneratorControlModeToString(eDataType, instanceValue);
			case ProductionPackage.HYDRO_PLANT_TYPE:
				return convertHydroPlantTypeToString(eDataType, instanceValue);
			case ProductionPackage.EMISSION_TYPE:
				return convertEmissionTypeToString(eDataType, instanceValue);
			case ProductionPackage.HYDRO_ENERGY_CONVERSION_KIND:
				return convertHydroEnergyConversionKindToString(eDataType, instanceValue);
			case ProductionPackage.SURGE_TANK_CODE:
				return convertSurgeTankCodeToString(eDataType, instanceValue);
			case ProductionPackage.HEAT_RATE:
				return convertHeatRateToString(eDataType, instanceValue);
			case ProductionPackage.CLASSIFICATION:
				return convertClassificationToString(eDataType, instanceValue);
			case ProductionPackage.EMISSION:
				return convertEmissionToString(eDataType, instanceValue);
			case ProductionPackage.COST_PER_HEAT_UNIT:
				return convertCostPerHeatUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroGeneratingUnit createHydroGeneratingUnit() {
		HydroGeneratingUnitImpl hydroGeneratingUnit = new HydroGeneratingUnitImpl();
		return hydroGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRateCurve createHeatRateCurve() {
		HeatRateCurveImpl heatRateCurve = new HeatRateCurveImpl();
		return heatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartIgnFuelCurve createStartIgnFuelCurve() {
		StartIgnFuelCurveImpl startIgnFuelCurve = new StartIgnFuelCurveImpl();
		return startIgnFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CogenerationPlant createCogenerationPlant() {
		CogenerationPlantImpl cogenerationPlant = new CogenerationPlantImpl();
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAESPlant createCAESPlant() {
		CAESPlantImpl caesPlant = new CAESPlantImpl();
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit createThermalGeneratingUnit() {
		ThermalGeneratingUnitImpl thermalGeneratingUnit = new ThermalGeneratingUnitImpl();
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindGeneratingUnit createWindGeneratingUnit() {
		WindGeneratingUnitImpl windGeneratingUnit = new WindGeneratingUnitImpl();
		return windGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TailbayLossCurve createTailbayLossCurve() {
		TailbayLossCurveImpl tailbayLossCurve = new TailbayLossCurveImpl();
		return tailbayLossCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartRampCurve createStartRampCurve() {
		StartRampCurveImpl startRampCurve = new StartRampCurveImpl();
		return startRampCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupModel createStartupModel() {
		StartupModelImpl startupModel = new StartupModelImpl();
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedCyclePlant createCombinedCyclePlant() {
		CombinedCyclePlantImpl combinedCyclePlant = new CombinedCyclePlantImpl();
		return combinedCyclePlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPump createHydroPump() {
		HydroPumpImpl hydroPump = new HydroPumpImpl();
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenstockLossCurve createPenstockLossCurve() {
		PenstockLossCurveImpl penstockLossCurve = new PenstockLossCurveImpl();
		return penstockLossCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownCurve createShutdownCurve() {
		ShutdownCurveImpl shutdownCurve = new ShutdownCurveImpl();
		return shutdownCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalHeatRateCurve createIncrementalHeatRateCurve() {
		IncrementalHeatRateCurveImpl incrementalHeatRateCurve = new IncrementalHeatRateCurveImpl();
		return incrementalHeatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitOpSchedule createGenUnitOpSchedule() {
		GenUnitOpScheduleImpl genUnitOpSchedule = new GenUnitOpScheduleImpl();
		return genUnitOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetLevelSchedule createTargetLevelSchedule() {
		TargetLevelScheduleImpl targetLevelSchedule = new TargetLevelScheduleImpl();
		return targetLevelSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmissionCurve createEmissionCurve() {
		EmissionCurveImpl emissionCurve = new EmissionCurveImpl();
		return emissionCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitOpCostCurve createGenUnitOpCostCurve() {
		GenUnitOpCostCurveImpl genUnitOpCostCurve = new GenUnitOpCostCurveImpl();
		return genUnitOpCostCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FossilFuel createFossilFuel() {
		FossilFuelImpl fossilFuel = new FossilFuelImpl();
		return fossilFuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InflowForecast createInflowForecast() {
		InflowForecastImpl inflowForecast = new InflowForecastImpl();
		return inflowForecast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPowerPlant createHydroPowerPlant() {
		HydroPowerPlantImpl hydroPowerPlant = new HydroPowerPlantImpl();
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartMainFuelCurve createStartMainFuelCurve() {
		StartMainFuelCurveImpl startMainFuelCurve = new StartMainFuelCurveImpl();
		return startMainFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelVsVolumeCurve createLevelVsVolumeCurve() {
		LevelVsVolumeCurveImpl levelVsVolumeCurve = new LevelVsVolumeCurveImpl();
		return levelVsVolumeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatInputCurve createHeatInputCurve() {
		HeatInputCurveImpl heatInputCurve = new HeatInputCurveImpl();
		return heatInputCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPumpOpSchedule createHydroPumpOpSchedule() {
		HydroPumpOpScheduleImpl hydroPumpOpSchedule = new HydroPumpOpScheduleImpl();
		return hydroPumpOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteamSendoutSchedule createSteamSendoutSchedule() {
		SteamSendoutScheduleImpl steamSendoutSchedule = new SteamSendoutScheduleImpl();
		return steamSendoutSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit createGeneratingUnit() {
		GeneratingUnitImpl generatingUnit = new GeneratingUnitImpl();
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuelAllocationSchedule createFuelAllocationSchedule() {
		FuelAllocationScheduleImpl fuelAllocationSchedule = new FuelAllocationScheduleImpl();
		return fuelAllocationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir createReservoir() {
		ReservoirImpl reservoir = new ReservoirImpl();
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroGeneratingEfficiencyCurve createHydroGeneratingEfficiencyCurve() {
		HydroGeneratingEfficiencyCurveImpl hydroGeneratingEfficiencyCurve = new HydroGeneratingEfficiencyCurveImpl();
		return hydroGeneratingEfficiencyCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NuclearGeneratingUnit createNuclearGeneratingUnit() {
		NuclearGeneratingUnitImpl nuclearGeneratingUnit = new NuclearGeneratingUnitImpl();
		return nuclearGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirCompressor createAirCompressor() {
		AirCompressorImpl airCompressor = new AirCompressorImpl();
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmissionAccount createEmissionAccount() {
		EmissionAccountImpl emissionAccount = new EmissionAccountImpl();
		return emissionAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrossToNetActivePowerCurve createGrossToNetActivePowerCurve() {
		GrossToNetActivePowerCurveImpl grossToNetActivePowerCurve = new GrossToNetActivePowerCurveImpl();
		return grossToNetActivePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuelType createFuelTypeFromString(EDataType eDataType, String initialValue) {
		FuelType result = FuelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFuelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenstockType createPenstockTypeFromString(EDataType eDataType, String initialValue) {
		PenstockType result = PenstockType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPenstockTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorControlSource createGeneratorControlSourceFromString(EDataType eDataType, String initialValue) {
		GeneratorControlSource result = GeneratorControlSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratorControlSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmissionValueSource createEmissionValueSourceFromString(EDataType eDataType, String initialValue) {
		EmissionValueSource result = EmissionValueSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmissionValueSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorOperatingMode createGeneratorOperatingModeFromString(EDataType eDataType, String initialValue) {
		GeneratorOperatingMode result = GeneratorOperatingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratorOperatingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpillwayGateType createSpillwayGateTypeFromString(EDataType eDataType, String initialValue) {
		SpillwayGateType result = SpillwayGateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpillwayGateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorControlMode createGeneratorControlModeFromString(EDataType eDataType, String initialValue) {
		GeneratorControlMode result = GeneratorControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratorControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPlantType createHydroPlantTypeFromString(EDataType eDataType, String initialValue) {
		HydroPlantType result = HydroPlantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHydroPlantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmissionType createEmissionTypeFromString(EDataType eDataType, String initialValue) {
		EmissionType result = EmissionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmissionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroEnergyConversionKind createHydroEnergyConversionKindFromString(EDataType eDataType, String initialValue) {
		HydroEnergyConversionKind result = HydroEnergyConversionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHydroEnergyConversionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeTankCode createSurgeTankCodeFromString(EDataType eDataType, String initialValue) {
		SurgeTankCode result = SurgeTankCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSurgeTankCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createHeatRateFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeatRateToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createClassificationFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEmissionFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmissionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createCostPerHeatUnitFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCostPerHeatUnitToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionPackage getProductionPackage() {
		return (ProductionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductionPackage getPackage() {
		return ProductionPackage.eINSTANCE;
	}

} //ProductionFactoryImpl
