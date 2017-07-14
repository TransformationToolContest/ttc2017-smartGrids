/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLocations.impl;

import gluemodel.CIM.IEC61970.Informative.InfLocations.*;

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
public class InfLocationsFactoryImpl extends EFactoryImpl implements InfLocationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfLocationsFactory init() {
		try {
			InfLocationsFactory theInfLocationsFactory = (InfLocationsFactory)EPackage.Registry.INSTANCE.getEFactory(InfLocationsPackage.eNS_URI);
			if (theInfLocationsFactory != null) {
				return theInfLocationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfLocationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfLocationsFactoryImpl() {
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
			case InfLocationsPackage.PERSON_PROPERTY_ROLE: return createPersonPropertyRole();
			case InfLocationsPackage.RED_LINE: return createRedLine();
			case InfLocationsPackage.HAZARD: return createHazard();
			case InfLocationsPackage.ROUTE: return createRoute();
			case InfLocationsPackage.LOCATION_GRANT: return createLocationGrant();
			case InfLocationsPackage.DIRECTION: return createDirection();
			case InfLocationsPackage.LAND_PROPERTY: return createLandProperty();
			case InfLocationsPackage.ORG_PROPERTY_ROLE: return createOrgPropertyRole();
			case InfLocationsPackage.RIGHT_OF_WAY: return createRightOfWay();
			case InfLocationsPackage.ZONE: return createZone();
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
			case InfLocationsPackage.LAND_PROPERTY_KIND:
				return createLandPropertyKindFromString(eDataType, initialValue);
			case InfLocationsPackage.ZONE_KIND:
				return createZoneKindFromString(eDataType, initialValue);
			case InfLocationsPackage.DEMOGRAPHIC_KIND:
				return createDemographicKindFromString(eDataType, initialValue);
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
			case InfLocationsPackage.LAND_PROPERTY_KIND:
				return convertLandPropertyKindToString(eDataType, instanceValue);
			case InfLocationsPackage.ZONE_KIND:
				return convertZoneKindToString(eDataType, instanceValue);
			case InfLocationsPackage.DEMOGRAPHIC_KIND:
				return convertDemographicKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonPropertyRole createPersonPropertyRole() {
		PersonPropertyRoleImpl personPropertyRole = new PersonPropertyRoleImpl();
		return personPropertyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedLine createRedLine() {
		RedLineImpl redLine = new RedLineImpl();
		return redLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard createHazard() {
		HazardImpl hazard = new HazardImpl();
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationGrant createLocationGrant() {
		LocationGrantImpl locationGrant = new LocationGrantImpl();
		return locationGrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirection() {
		DirectionImpl direction = new DirectionImpl();
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandProperty createLandProperty() {
		LandPropertyImpl landProperty = new LandPropertyImpl();
		return landProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgPropertyRole createOrgPropertyRole() {
		OrgPropertyRoleImpl orgPropertyRole = new OrgPropertyRoleImpl();
		return orgPropertyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightOfWay createRightOfWay() {
		RightOfWayImpl rightOfWay = new RightOfWayImpl();
		return rightOfWay;
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
	public LandPropertyKind createLandPropertyKindFromString(EDataType eDataType, String initialValue) {
		LandPropertyKind result = LandPropertyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLandPropertyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneKind createZoneKindFromString(EDataType eDataType, String initialValue) {
		ZoneKind result = ZoneKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZoneKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemographicKind createDemographicKindFromString(EDataType eDataType, String initialValue) {
		DemographicKind result = DemographicKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDemographicKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfLocationsPackage getInfLocationsPackage() {
		return (InfLocationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfLocationsPackage getPackage() {
		return InfLocationsPackage.eINSTANCE;
	}

} //InfLocationsFactoryImpl
