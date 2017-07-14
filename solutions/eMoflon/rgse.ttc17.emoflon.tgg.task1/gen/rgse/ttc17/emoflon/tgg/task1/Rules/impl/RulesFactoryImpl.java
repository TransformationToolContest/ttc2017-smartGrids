/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rgse.ttc17.emoflon.tgg.task1.Rules.*;

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
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD:
			return createEnergyConsumerWithIDConfLoad();
		case RulesPackage.GML_POSITION:
			return createGmlPosition();
		case RulesPackage.POSITION_POINT:
			return createPositionPoint();
		case RulesPackage.WORK_LOCATION:
			return createWorkLocation();
		case RulesPackage.ENERGY_CONSUMER:
			return createEnergyConsumer();
		case RulesPackage.POSITION_POINT_LINK:
			return createPositionPointLink();
		case RulesPackage.SERVICE_LOCATION:
			return createServiceLocation();
		case RulesPackage.LOCATION:
			return createLocation();
		case RulesPackage.ENERGY_CONSUMER_WITH_ID:
			return createEnergyConsumerWithID();
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD:
			return createEnergyConsumerWithIDNonConfLoad();
		case RulesPackage.LOCATION_LINK:
			return createLocationLink();
		case RulesPackage.SDP_LOCATION:
			return createSDPLocation();
		case RulesPackage.ZONE:
			return createZone();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumerWithIDConfLoad createEnergyConsumerWithIDConfLoad() {
		EnergyConsumerWithIDConfLoadImpl energyConsumerWithIDConfLoad = new EnergyConsumerWithIDConfLoadImpl();
		return energyConsumerWithIDConfLoad;
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
	public PositionPoint createPositionPoint() {
		PositionPointImpl positionPoint = new PositionPointImpl();
		return positionPoint;
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
	public EnergyConsumer createEnergyConsumer() {
		EnergyConsumerImpl energyConsumer = new EnergyConsumerImpl();
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPointLink createPositionPointLink() {
		PositionPointLinkImpl positionPointLink = new PositionPointLinkImpl();
		return positionPointLink;
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
	public EnergyConsumerWithID createEnergyConsumerWithID() {
		EnergyConsumerWithIDImpl energyConsumerWithID = new EnergyConsumerWithIDImpl();
		return energyConsumerWithID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumerWithIDNonConfLoad createEnergyConsumerWithIDNonConfLoad() {
		EnergyConsumerWithIDNonConfLoadImpl energyConsumerWithIDNonConfLoad = new EnergyConsumerWithIDNonConfLoadImpl();
		return energyConsumerWithIDNonConfLoad;
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
	public SDPLocation createSDPLocation() {
		SDPLocationImpl sdpLocation = new SDPLocationImpl();
		return sdpLocation;
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
