/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rgse.ttc17.emoflon.tgg.task2.Rules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
		case RulesPackage.TIE_FLOW:
			return createTieFlow();
		case RulesPackage.POSITION_POINT:
			return createPositionPoint();
		case RulesPackage.NON_CONFORM_LOAD:
			return createNonConformLoad();
		case RulesPackage.SERVICE_DELIVERY_POINT_LINK_METER_ASSET:
			return createServiceDeliveryPointLinkMeterAsset();
		case RulesPackage.ZONE:
			return createZone();
		case RulesPackage.LOAD_AREA:
			return createLoadArea();
		case RulesPackage.SERVICE_LOCATION:
			return createServiceLocation();
		case RulesPackage.LOCATION:
			return createLocation();
		case RulesPackage.SDP_LOCATION:
			return createSDPLocation();
		case RulesPackage.CONFORM_LOAD:
			return createConformLoad();
		case RulesPackage.CONTROL_AREA:
			return createControlArea();
		case RulesPackage.CONFORM_LOAD_GROUP:
			return createConformLoadGroup();
		case RulesPackage.STATION_SUPPLY:
			return createStationSupply();
		case RulesPackage.TERMINAL:
			return createTerminal();
		case RulesPackage.SERVICE_DELIVERY_POINT:
			return createServiceDeliveryPoint();
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT:
			return createEnergyConsumerLinkServiceDeliveryPoint();
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA:
			return createLoadAreaLinkControlArea();
		case RulesPackage.GML_POSITION:
			return createGmlPosition();
		case RulesPackage.NON_CONFORM_LOAD_GROUP:
			return createNonConformLoadGroup();
		case RulesPackage.WORK_LOCATION:
			return createWorkLocation();
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA:
			return createTieFlowLinkControlArea();
		case RulesPackage.POWER_SYSTEM_RESOURCE:
			return createPowerSystemResource();
		case RulesPackage.PRIVATE_METER_VOLTAGE:
			return createPrivateMeterVoltage();
		case RulesPackage.LOCATION_LINK:
			return createLocationLink();
		case RulesPackage.PMU_VOLTAGE_METER:
			return createPMUVoltageMeter();
		case RulesPackage.SUB_LOAD_AREA:
			return createSubLoadArea();
		case RulesPackage.ENERGY_CONSUMER:
			return createEnergyConsumer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public PositionPoint createPositionPoint() {
		PositionPointImpl positionPoint = new PositionPointImpl();
		return positionPoint;
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
	public ServiceDeliveryPointLinkMeterAsset createServiceDeliveryPointLinkMeterAsset() {
		ServiceDeliveryPointLinkMeterAssetImpl serviceDeliveryPointLinkMeterAsset = new ServiceDeliveryPointLinkMeterAssetImpl();
		return serviceDeliveryPointLinkMeterAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
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
	public ServiceLocation createServiceLocation() {
		ServiceLocationImpl serviceLocation = new ServiceLocationImpl();
		return serviceLocation;
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
	public SDPLocation createSDPLocation() {
		SDPLocationImpl sdpLocation = new SDPLocationImpl();
		return sdpLocation;
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
	public ControlArea createControlArea() {
		ControlAreaImpl controlArea = new ControlAreaImpl();
		return controlArea;
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
	public StationSupply createStationSupply() {
		StationSupplyImpl stationSupply = new StationSupplyImpl();
		return stationSupply;
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
	public ServiceDeliveryPoint createServiceDeliveryPoint() {
		ServiceDeliveryPointImpl serviceDeliveryPoint = new ServiceDeliveryPointImpl();
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumerLinkServiceDeliveryPoint createEnergyConsumerLinkServiceDeliveryPoint() {
		EnergyConsumerLinkServiceDeliveryPointImpl energyConsumerLinkServiceDeliveryPoint = new EnergyConsumerLinkServiceDeliveryPointImpl();
		return energyConsumerLinkServiceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadAreaLinkControlArea createLoadAreaLinkControlArea() {
		LoadAreaLinkControlAreaImpl loadAreaLinkControlArea = new LoadAreaLinkControlAreaImpl();
		return loadAreaLinkControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPosition createGmlPosition() {
		GmlPositionImpl gmlPosition = new GmlPositionImpl();
		return gmlPosition;
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
	public WorkLocation createWorkLocation() {
		WorkLocationImpl workLocation = new WorkLocationImpl();
		return workLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieFlowLinkControlArea createTieFlowLinkControlArea() {
		TieFlowLinkControlAreaImpl tieFlowLinkControlArea = new TieFlowLinkControlAreaImpl();
		return tieFlowLinkControlArea;
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
	public PrivateMeterVoltage createPrivateMeterVoltage() {
		PrivateMeterVoltageImpl privateMeterVoltage = new PrivateMeterVoltageImpl();
		return privateMeterVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationLink createLocationLink() {
		LocationLinkImpl locationLink = new LocationLinkImpl();
		return locationLink;
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
	public SubLoadArea createSubLoadArea() {
		SubLoadAreaImpl subLoadArea = new SubLoadAreaImpl();
		return subLoadArea;
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
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
