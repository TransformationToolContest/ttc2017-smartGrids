/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import outagePreventionJointarget.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutagePreventionJointargetFactoryImpl extends EFactoryImpl implements OutagePreventionJointargetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutagePreventionJointargetFactory init() {
		try {
			OutagePreventionJointargetFactory theOutagePreventionJointargetFactory = (OutagePreventionJointargetFactory)EPackage.Registry.INSTANCE.getEFactory(OutagePreventionJointargetPackage.eNS_URI);
			if (theOutagePreventionJointargetFactory != null) {
				return theOutagePreventionJointargetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OutagePreventionJointargetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionJointargetFactoryImpl() {
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
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER: return createPMUVoltageMeter();
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE: return createPrivateMeterVoltage();
			case OutagePreventionJointargetPackage.ASSET: return createAsset();
			case OutagePreventionJointargetPackage.LOCATION: return createLocation();
			case OutagePreventionJointargetPackage.POSITION_POINT: return createPositionPoint();
			case OutagePreventionJointargetPackage.POWER_SYSTEM_RESOURCE: return createPowerSystemResource();
			case OutagePreventionJointargetPackage.CONDUCTING_EQUIPMENT: return createConductingEquipment();
			case OutagePreventionJointargetPackage.TERMINAL: return createTerminal();
			case OutagePreventionJointargetPackage.TIE_FLOW: return createTieFlow();
			case OutagePreventionJointargetPackage.CONTROL_AREA: return createControlArea();
			case OutagePreventionJointargetPackage.END_DEVICE_ASSET: return createEndDeviceAsset();
			case OutagePreventionJointargetPackage.SERVICE_DELIVERY_POINT: return createServiceDeliveryPoint();
			case OutagePreventionJointargetPackage.ENERGY_CONSUMER: return createEnergyConsumer();
			case OutagePreventionJointargetPackage.CONFORM_LOAD: return createConformLoad();
			case OutagePreventionJointargetPackage.CONFORM_LOAD_GROUP: return createConformLoadGroup();
			case OutagePreventionJointargetPackage.LOAD_GROUP: return createLoadGroup();
			case OutagePreventionJointargetPackage.SUB_LOAD_AREA: return createSubLoadArea();
			case OutagePreventionJointargetPackage.LOAD_AREA: return createLoadArea();
			case OutagePreventionJointargetPackage.NON_CONFORM_LOAD: return createNonConformLoad();
			case OutagePreventionJointargetPackage.NON_CONFORM_LOAD_GROUP: return createNonConformLoadGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMUVoltageMeter createPMUVoltageMeter() {
		PMUVoltageMeterImpl pmuVoltageMeter = new PMUVoltageMeterImpl();
		return pmuVoltageMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateMeterVoltage createPrivateMeterVoltage() {
		PrivateMeterVoltageImpl privateMeterVoltage = new PrivateMeterVoltageImpl();
		return privateMeterVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPoint createPositionPoint() {
		PositionPointImpl positionPoint = new PositionPointImpl();
		return positionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource createPowerSystemResource() {
		PowerSystemResourceImpl powerSystemResource = new PowerSystemResourceImpl();
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment createConductingEquipment() {
		ConductingEquipmentImpl conductingEquipment = new ConductingEquipmentImpl();
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieFlow createTieFlow() {
		TieFlowImpl tieFlow = new TieFlowImpl();
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea createControlArea() {
		ControlAreaImpl controlArea = new ControlAreaImpl();
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceAsset createEndDeviceAsset() {
		EndDeviceAssetImpl endDeviceAsset = new EndDeviceAssetImpl();
		return endDeviceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint createServiceDeliveryPoint() {
		ServiceDeliveryPointImpl serviceDeliveryPoint = new ServiceDeliveryPointImpl();
		return serviceDeliveryPoint;
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
	public ConformLoad createConformLoad() {
		ConformLoadImpl conformLoad = new ConformLoadImpl();
		return conformLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup createConformLoadGroup() {
		ConformLoadGroupImpl conformLoadGroup = new ConformLoadGroupImpl();
		return conformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadGroup createLoadGroup() {
		LoadGroupImpl loadGroup = new LoadGroupImpl();
		return loadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea createSubLoadArea() {
		SubLoadAreaImpl subLoadArea = new SubLoadAreaImpl();
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea createLoadArea() {
		LoadAreaImpl loadArea = new LoadAreaImpl();
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoad createNonConformLoad() {
		NonConformLoadImpl nonConformLoad = new NonConformLoadImpl();
		return nonConformLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup createNonConformLoadGroup() {
		NonConformLoadGroupImpl nonConformLoadGroup = new NonConformLoadGroupImpl();
		return nonConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionJointargetPackage getOutagePreventionJointargetPackage() {
		return (OutagePreventionJointargetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OutagePreventionJointargetPackage getPackage() {
		return OutagePreventionJointargetPackage.eINSTANCE;
	}

} //OutagePreventionJointargetFactoryImpl
