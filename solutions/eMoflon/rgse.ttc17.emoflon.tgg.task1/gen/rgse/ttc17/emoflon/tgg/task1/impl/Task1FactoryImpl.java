/**
 */
package rgse.ttc17.emoflon.tgg.task1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rgse.ttc17.emoflon.tgg.task1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Task1FactoryImpl extends EFactoryImpl implements Task1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Task1Factory init() {
		try {
			Task1Factory theTask1Factory = (Task1Factory) EPackage.Registry.INSTANCE.getEFactory(Task1Package.eNS_URI);
			if (theTask1Factory != null) {
				return theTask1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Task1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task1FactoryImpl() {
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
		case Task1Package.CONTROL_AREA_TO_ENERGY_CONSUMER:
			return createControlAreaToEnergyConsumer();
		case Task1Package.LOCATION_TO_LOCATION:
			return createLocationToLocation();
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER:
			return createPhysicalDeviceToEnergyConsumer();
		case Task1Package.POSITION_POINT_TO_POSITION_POINT:
			return createPositionPointToPositionPoint();
		case Task1Package.METER_ASSET_TO_ENERGY_CONSUMER:
			return createMeterAssetToEnergyConsumer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaToEnergyConsumer createControlAreaToEnergyConsumer() {
		ControlAreaToEnergyConsumerImpl controlAreaToEnergyConsumer = new ControlAreaToEnergyConsumerImpl();
		return controlAreaToEnergyConsumer;
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
	public PhysicalDeviceToEnergyConsumer createPhysicalDeviceToEnergyConsumer() {
		PhysicalDeviceToEnergyConsumerImpl physicalDeviceToEnergyConsumer = new PhysicalDeviceToEnergyConsumerImpl();
		return physicalDeviceToEnergyConsumer;
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
	public MeterAssetToEnergyConsumer createMeterAssetToEnergyConsumer() {
		MeterAssetToEnergyConsumerImpl meterAssetToEnergyConsumer = new MeterAssetToEnergyConsumerImpl();
		return meterAssetToEnergyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task1Package getTask1Package() {
		return (Task1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Task1Package getPackage() {
		return Task1Package.eINSTANCE;
	}

} //Task1FactoryImpl
