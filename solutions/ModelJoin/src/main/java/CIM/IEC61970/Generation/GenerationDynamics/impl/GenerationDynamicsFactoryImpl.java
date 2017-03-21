/**
 */
package CIM.IEC61970.Generation.GenerationDynamics.impl;

import CIM.IEC61970.Generation.GenerationDynamics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenerationDynamicsFactoryImpl extends EFactoryImpl implements GenerationDynamicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenerationDynamicsFactory init() {
		try {
			GenerationDynamicsFactory theGenerationDynamicsFactory = (GenerationDynamicsFactory)EPackage.Registry.INSTANCE.getEFactory(GenerationDynamicsPackage.eNS_URI);
			if (theGenerationDynamicsFactory != null) {
				return theGenerationDynamicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenerationDynamicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationDynamicsFactoryImpl() {
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
			case GenerationDynamicsPackage.SUPERCRITICAL: return createSupercritical();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE: return createCombustionTurbine();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY: return createFossilSteamSupply();
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE: return createCTTempActivePowerCurve();
			case GenerationDynamicsPackage.SUBCRITICAL: return createSubcritical();
			case GenerationDynamicsPackage.STEAM_SUPPLY: return createSteamSupply();
			case GenerationDynamicsPackage.PRIME_MOVER: return createPrimeMover();
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER: return createHeatRecoveryBoiler();
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY: return createBWRSteamSupply();
			case GenerationDynamicsPackage.DRUM_BOILER: return createDrumBoiler();
			case GenerationDynamicsPackage.STEAM_TURBINE: return createSteamTurbine();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY: return createPWRSteamSupply();
			case GenerationDynamicsPackage.HYDRO_TURBINE: return createHydroTurbine();
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
			case GenerationDynamicsPackage.TURBINE_TYPE:
				return createTurbineTypeFromString(eDataType, initialValue);
			case GenerationDynamicsPackage.BOILER_CONTROL_MODE:
				return createBoilerControlModeFromString(eDataType, initialValue);
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
			case GenerationDynamicsPackage.TURBINE_TYPE:
				return convertTurbineTypeToString(eDataType, instanceValue);
			case GenerationDynamicsPackage.BOILER_CONTROL_MODE:
				return convertBoilerControlModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supercritical createSupercritical() {
		SupercriticalImpl supercritical = new SupercriticalImpl();
		return supercritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombustionTurbine createCombustionTurbine() {
		CombustionTurbineImpl combustionTurbine = new CombustionTurbineImpl();
		return combustionTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FossilSteamSupply createFossilSteamSupply() {
		FossilSteamSupplyImpl fossilSteamSupply = new FossilSteamSupplyImpl();
		return fossilSteamSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTempActivePowerCurve createCTTempActivePowerCurve() {
		CTTempActivePowerCurveImpl ctTempActivePowerCurve = new CTTempActivePowerCurveImpl();
		return ctTempActivePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcritical createSubcritical() {
		SubcriticalImpl subcritical = new SubcriticalImpl();
		return subcritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteamSupply createSteamSupply() {
		SteamSupplyImpl steamSupply = new SteamSupplyImpl();
		return steamSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimeMover createPrimeMover() {
		PrimeMoverImpl primeMover = new PrimeMoverImpl();
		return primeMover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRecoveryBoiler createHeatRecoveryBoiler() {
		HeatRecoveryBoilerImpl heatRecoveryBoiler = new HeatRecoveryBoilerImpl();
		return heatRecoveryBoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWRSteamSupply createBWRSteamSupply() {
		BWRSteamSupplyImpl bwrSteamSupply = new BWRSteamSupplyImpl();
		return bwrSteamSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrumBoiler createDrumBoiler() {
		DrumBoilerImpl drumBoiler = new DrumBoilerImpl();
		return drumBoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteamTurbine createSteamTurbine() {
		SteamTurbineImpl steamTurbine = new SteamTurbineImpl();
		return steamTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PWRSteamSupply createPWRSteamSupply() {
		PWRSteamSupplyImpl pwrSteamSupply = new PWRSteamSupplyImpl();
		return pwrSteamSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroTurbine createHydroTurbine() {
		HydroTurbineImpl hydroTurbine = new HydroTurbineImpl();
		return hydroTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurbineType createTurbineTypeFromString(EDataType eDataType, String initialValue) {
		TurbineType result = TurbineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTurbineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoilerControlMode createBoilerControlModeFromString(EDataType eDataType, String initialValue) {
		BoilerControlMode result = BoilerControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoilerControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationDynamicsPackage getGenerationDynamicsPackage() {
		return (GenerationDynamicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenerationDynamicsPackage getPackage() {
		return GenerationDynamicsPackage.eINSTANCE;
	}

} //GenerationDynamicsFactoryImpl
