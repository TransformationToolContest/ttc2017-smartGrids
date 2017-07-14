/**
 */
package rgse.ttc17.emoflon.tgg.task2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rgse.ttc17.emoflon.tgg.task2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Task2FactoryImpl extends EFactoryImpl implements Task2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Task2Factory init() {
		try {
			Task2Factory theTask2Factory = (Task2Factory) EPackage.Registry.INSTANCE.getEFactory(Task2Package.eNS_URI);
			if (theTask2Factory != null) {
				return theTask2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Task2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2FactoryImpl() {
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
		case Task2Package.CONTROL_AREA_TO_CONTROL_SREA:
			return createControlAreaToControlSrea();
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT:
			return createServiceDeliveryPointToServiceDeliveryPoint();
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE:
			return createPowerSystemResourceToPowerSystemResource();
		case Task2Package.PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE:
			return createPhysicalDeviceToPrivateMeterVoltage();
		case Task2Package.LOCATION_TO_LOCATION:
			return createLocationToLocation();
		case Task2Package.ENERGY_CONSUMER_TO_ENERGY_CONSUMER:
			return createEnergyConsumerToEnergyConsumer();
		case Task2Package.METER_ASSET_TO_PRIVATE_METER_VOLTAGE:
			return createMeterAssetToPrivateMeterVoltage();
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER:
			return createMeterAssetToMMXUToVoltageMeter();
		case Task2Package.MMXU_TO_PMU_VOLTAGE_METER:
			return createMMXUToPMUVoltageMeter();
		case Task2Package.CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP:
			return createConformLoadGroupToConformLoadGroup();
		case Task2Package.SUB_LOAD_AREA_TO_SUB_LOAD_AREA:
			return createSubLoadAreaToSubLoadArea();
		case Task2Package.LOAD_AREA_TO_LOAD_AREA:
			return createLoadAreaToLoadArea();
		case Task2Package.METER_ASSET_TO_PMU_VOLTAGE_METER:
			return createMeterAssetToPMUVoltageMeter();
		case Task2Package.POSITION_POINT_TO_POSITION_POINT:
			return createPositionPointToPositionPoint();
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP:
			return createNonConformLoadGroupNonToConformLoadGroup();
		case Task2Package.TERMINAL_TO_TERMINAL:
			return createTerminalToTerminal();
		case Task2Package.TIE_FLOW_TO_TIE_FLOW:
			return createTieFlowToTieFlow();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaToControlSrea createControlAreaToControlSrea() {
		ControlAreaToControlSreaImpl controlAreaToControlSrea = new ControlAreaToControlSreaImpl();
		return controlAreaToControlSrea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPointToServiceDeliveryPoint createServiceDeliveryPointToServiceDeliveryPoint() {
		ServiceDeliveryPointToServiceDeliveryPointImpl serviceDeliveryPointToServiceDeliveryPoint = new ServiceDeliveryPointToServiceDeliveryPointImpl();
		return serviceDeliveryPointToServiceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResourceToPowerSystemResource createPowerSystemResourceToPowerSystemResource() {
		PowerSystemResourceToPowerSystemResourceImpl powerSystemResourceToPowerSystemResource = new PowerSystemResourceToPowerSystemResourceImpl();
		return powerSystemResourceToPowerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDeviceToPrivateMeterVoltage createPhysicalDeviceToPrivateMeterVoltage() {
		PhysicalDeviceToPrivateMeterVoltageImpl physicalDeviceToPrivateMeterVoltage = new PhysicalDeviceToPrivateMeterVoltageImpl();
		return physicalDeviceToPrivateMeterVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationToLocation createLocationToLocation() {
		LocationToLocationImpl locationToLocation = new LocationToLocationImpl();
		return locationToLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumerToEnergyConsumer createEnergyConsumerToEnergyConsumer() {
		EnergyConsumerToEnergyConsumerImpl energyConsumerToEnergyConsumer = new EnergyConsumerToEnergyConsumerImpl();
		return energyConsumerToEnergyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetToPrivateMeterVoltage createMeterAssetToPrivateMeterVoltage() {
		MeterAssetToPrivateMeterVoltageImpl meterAssetToPrivateMeterVoltage = new MeterAssetToPrivateMeterVoltageImpl();
		return meterAssetToPrivateMeterVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetToMMXUToVoltageMeter createMeterAssetToMMXUToVoltageMeter() {
		MeterAssetToMMXUToVoltageMeterImpl meterAssetToMMXUToVoltageMeter = new MeterAssetToMMXUToVoltageMeterImpl();
		return meterAssetToMMXUToVoltageMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMXUToPMUVoltageMeter createMMXUToPMUVoltageMeter() {
		MMXUToPMUVoltageMeterImpl mmxuToPMUVoltageMeter = new MMXUToPMUVoltageMeterImpl();
		return mmxuToPMUVoltageMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroupToConformLoadGroup createConformLoadGroupToConformLoadGroup() {
		ConformLoadGroupToConformLoadGroupImpl conformLoadGroupToConformLoadGroup = new ConformLoadGroupToConformLoadGroupImpl();
		return conformLoadGroupToConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadAreaToSubLoadArea createSubLoadAreaToSubLoadArea() {
		SubLoadAreaToSubLoadAreaImpl subLoadAreaToSubLoadArea = new SubLoadAreaToSubLoadAreaImpl();
		return subLoadAreaToSubLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadAreaToLoadArea createLoadAreaToLoadArea() {
		LoadAreaToLoadAreaImpl loadAreaToLoadArea = new LoadAreaToLoadAreaImpl();
		return loadAreaToLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetToPMUVoltageMeter createMeterAssetToPMUVoltageMeter() {
		MeterAssetToPMUVoltageMeterImpl meterAssetToPMUVoltageMeter = new MeterAssetToPMUVoltageMeterImpl();
		return meterAssetToPMUVoltageMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPointToPositionPoint createPositionPointToPositionPoint() {
		PositionPointToPositionPointImpl positionPointToPositionPoint = new PositionPointToPositionPointImpl();
		return positionPointToPositionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroupNonToConformLoadGroup createNonConformLoadGroupNonToConformLoadGroup() {
		NonConformLoadGroupNonToConformLoadGroupImpl nonConformLoadGroupNonToConformLoadGroup = new NonConformLoadGroupNonToConformLoadGroupImpl();
		return nonConformLoadGroupNonToConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalToTerminal createTerminalToTerminal() {
		TerminalToTerminalImpl terminalToTerminal = new TerminalToTerminalImpl();
		return terminalToTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieFlowToTieFlow createTieFlowToTieFlow() {
		TieFlowToTieFlowImpl tieFlowToTieFlow = new TieFlowToTieFlowImpl();
		return tieFlowToTieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2Package getTask2Package() {
		return (Task2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Task2Package getPackage() {
		return Task2Package.eINSTANCE;
	}

} //Task2FactoryImpl
