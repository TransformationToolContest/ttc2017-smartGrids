/**
 */
package CIM.IEC61970.Generation.Production;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Generation.Production.ProductionPackage
 * @generated
 */
public interface ProductionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductionFactory eINSTANCE = CIM.IEC61970.Generation.Production.impl.ProductionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hydro Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydro Generating Unit</em>'.
	 * @generated
	 */
	HydroGeneratingUnit createHydroGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Heat Rate Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heat Rate Curve</em>'.
	 * @generated
	 */
	HeatRateCurve createHeatRateCurve();

	/**
	 * Returns a new object of class '<em>Start Ign Fuel Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Ign Fuel Curve</em>'.
	 * @generated
	 */
	StartIgnFuelCurve createStartIgnFuelCurve();

	/**
	 * Returns a new object of class '<em>Cogeneration Plant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cogeneration Plant</em>'.
	 * @generated
	 */
	CogenerationPlant createCogenerationPlant();

	/**
	 * Returns a new object of class '<em>CAES Plant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAES Plant</em>'.
	 * @generated
	 */
	CAESPlant createCAESPlant();

	/**
	 * Returns a new object of class '<em>Thermal Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thermal Generating Unit</em>'.
	 * @generated
	 */
	ThermalGeneratingUnit createThermalGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Wind Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wind Generating Unit</em>'.
	 * @generated
	 */
	WindGeneratingUnit createWindGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Tailbay Loss Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tailbay Loss Curve</em>'.
	 * @generated
	 */
	TailbayLossCurve createTailbayLossCurve();

	/**
	 * Returns a new object of class '<em>Start Ramp Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Ramp Curve</em>'.
	 * @generated
	 */
	StartRampCurve createStartRampCurve();

	/**
	 * Returns a new object of class '<em>Startup Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Startup Model</em>'.
	 * @generated
	 */
	StartupModel createStartupModel();

	/**
	 * Returns a new object of class '<em>Combined Cycle Plant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Cycle Plant</em>'.
	 * @generated
	 */
	CombinedCyclePlant createCombinedCyclePlant();

	/**
	 * Returns a new object of class '<em>Hydro Pump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydro Pump</em>'.
	 * @generated
	 */
	HydroPump createHydroPump();

	/**
	 * Returns a new object of class '<em>Penstock Loss Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Penstock Loss Curve</em>'.
	 * @generated
	 */
	PenstockLossCurve createPenstockLossCurve();

	/**
	 * Returns a new object of class '<em>Shutdown Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shutdown Curve</em>'.
	 * @generated
	 */
	ShutdownCurve createShutdownCurve();

	/**
	 * Returns a new object of class '<em>Incremental Heat Rate Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incremental Heat Rate Curve</em>'.
	 * @generated
	 */
	IncrementalHeatRateCurve createIncrementalHeatRateCurve();

	/**
	 * Returns a new object of class '<em>Gen Unit Op Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Unit Op Schedule</em>'.
	 * @generated
	 */
	GenUnitOpSchedule createGenUnitOpSchedule();

	/**
	 * Returns a new object of class '<em>Target Level Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Level Schedule</em>'.
	 * @generated
	 */
	TargetLevelSchedule createTargetLevelSchedule();

	/**
	 * Returns a new object of class '<em>Emission Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emission Curve</em>'.
	 * @generated
	 */
	EmissionCurve createEmissionCurve();

	/**
	 * Returns a new object of class '<em>Gen Unit Op Cost Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Unit Op Cost Curve</em>'.
	 * @generated
	 */
	GenUnitOpCostCurve createGenUnitOpCostCurve();

	/**
	 * Returns a new object of class '<em>Fossil Fuel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fossil Fuel</em>'.
	 * @generated
	 */
	FossilFuel createFossilFuel();

	/**
	 * Returns a new object of class '<em>Inflow Forecast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inflow Forecast</em>'.
	 * @generated
	 */
	InflowForecast createInflowForecast();

	/**
	 * Returns a new object of class '<em>Hydro Power Plant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydro Power Plant</em>'.
	 * @generated
	 */
	HydroPowerPlant createHydroPowerPlant();

	/**
	 * Returns a new object of class '<em>Start Main Fuel Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Main Fuel Curve</em>'.
	 * @generated
	 */
	StartMainFuelCurve createStartMainFuelCurve();

	/**
	 * Returns a new object of class '<em>Level Vs Volume Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Vs Volume Curve</em>'.
	 * @generated
	 */
	LevelVsVolumeCurve createLevelVsVolumeCurve();

	/**
	 * Returns a new object of class '<em>Heat Input Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heat Input Curve</em>'.
	 * @generated
	 */
	HeatInputCurve createHeatInputCurve();

	/**
	 * Returns a new object of class '<em>Hydro Pump Op Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydro Pump Op Schedule</em>'.
	 * @generated
	 */
	HydroPumpOpSchedule createHydroPumpOpSchedule();

	/**
	 * Returns a new object of class '<em>Steam Sendout Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steam Sendout Schedule</em>'.
	 * @generated
	 */
	SteamSendoutSchedule createSteamSendoutSchedule();

	/**
	 * Returns a new object of class '<em>Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generating Unit</em>'.
	 * @generated
	 */
	GeneratingUnit createGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Fuel Allocation Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuel Allocation Schedule</em>'.
	 * @generated
	 */
	FuelAllocationSchedule createFuelAllocationSchedule();

	/**
	 * Returns a new object of class '<em>Reservoir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservoir</em>'.
	 * @generated
	 */
	Reservoir createReservoir();

	/**
	 * Returns a new object of class '<em>Hydro Generating Efficiency Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydro Generating Efficiency Curve</em>'.
	 * @generated
	 */
	HydroGeneratingEfficiencyCurve createHydroGeneratingEfficiencyCurve();

	/**
	 * Returns a new object of class '<em>Nuclear Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nuclear Generating Unit</em>'.
	 * @generated
	 */
	NuclearGeneratingUnit createNuclearGeneratingUnit();

	/**
	 * Returns a new object of class '<em>Air Compressor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Air Compressor</em>'.
	 * @generated
	 */
	AirCompressor createAirCompressor();

	/**
	 * Returns a new object of class '<em>Emission Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emission Account</em>'.
	 * @generated
	 */
	EmissionAccount createEmissionAccount();

	/**
	 * Returns a new object of class '<em>Gross To Net Active Power Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gross To Net Active Power Curve</em>'.
	 * @generated
	 */
	GrossToNetActivePowerCurve createGrossToNetActivePowerCurve();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductionPackage getProductionPackage();

} //ProductionFactory
