/**
 */
package rgse.ttc17.emoflon.tgg.task2.Rules.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractRule;

import rgse.ttc17.emoflon.tgg.task2.Rules.*;

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
 * @see rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
		case RulesPackage.TIE_FLOW: {
			TieFlow tieFlow = (TieFlow) theEObject;
			T result = caseTieFlow(tieFlow);
			if (result == null)
				result = caseAbstractRule(tieFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.POSITION_POINT: {
			PositionPoint positionPoint = (PositionPoint) theEObject;
			T result = casePositionPoint(positionPoint);
			if (result == null)
				result = caseAbstractRule(positionPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NON_CONFORM_LOAD: {
			NonConformLoad nonConformLoad = (NonConformLoad) theEObject;
			T result = caseNonConformLoad(nonConformLoad);
			if (result == null)
				result = caseAbstractRule(nonConformLoad);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SERVICE_DELIVERY_POINT_LINK_METER_ASSET: {
			ServiceDeliveryPointLinkMeterAsset serviceDeliveryPointLinkMeterAsset = (ServiceDeliveryPointLinkMeterAsset) theEObject;
			T result = caseServiceDeliveryPointLinkMeterAsset(serviceDeliveryPointLinkMeterAsset);
			if (result == null)
				result = caseAbstractRule(serviceDeliveryPointLinkMeterAsset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ZONE: {
			Zone zone = (Zone) theEObject;
			T result = caseZone(zone);
			if (result == null)
				result = caseAbstractRule(zone);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LOAD_AREA: {
			LoadArea loadArea = (LoadArea) theEObject;
			T result = caseLoadArea(loadArea);
			if (result == null)
				result = caseAbstractRule(loadArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SERVICE_LOCATION: {
			ServiceLocation serviceLocation = (ServiceLocation) theEObject;
			T result = caseServiceLocation(serviceLocation);
			if (result == null)
				result = caseAbstractRule(serviceLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = caseAbstractRule(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SDP_LOCATION: {
			SDPLocation sdpLocation = (SDPLocation) theEObject;
			T result = caseSDPLocation(sdpLocation);
			if (result == null)
				result = caseAbstractRule(sdpLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONFORM_LOAD: {
			ConformLoad conformLoad = (ConformLoad) theEObject;
			T result = caseConformLoad(conformLoad);
			if (result == null)
				result = caseAbstractRule(conformLoad);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONTROL_AREA: {
			ControlArea controlArea = (ControlArea) theEObject;
			T result = caseControlArea(controlArea);
			if (result == null)
				result = caseAbstractRule(controlArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CONFORM_LOAD_GROUP: {
			ConformLoadGroup conformLoadGroup = (ConformLoadGroup) theEObject;
			T result = caseConformLoadGroup(conformLoadGroup);
			if (result == null)
				result = caseAbstractRule(conformLoadGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.STATION_SUPPLY: {
			StationSupply stationSupply = (StationSupply) theEObject;
			T result = caseStationSupply(stationSupply);
			if (result == null)
				result = caseAbstractRule(stationSupply);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TERMINAL: {
			Terminal terminal = (Terminal) theEObject;
			T result = caseTerminal(terminal);
			if (result == null)
				result = caseAbstractRule(terminal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SERVICE_DELIVERY_POINT: {
			ServiceDeliveryPoint serviceDeliveryPoint = (ServiceDeliveryPoint) theEObject;
			T result = caseServiceDeliveryPoint(serviceDeliveryPoint);
			if (result == null)
				result = caseAbstractRule(serviceDeliveryPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ENERGY_CONSUMER_LINK_SERVICE_DELIVERY_POINT: {
			EnergyConsumerLinkServiceDeliveryPoint energyConsumerLinkServiceDeliveryPoint = (EnergyConsumerLinkServiceDeliveryPoint) theEObject;
			T result = caseEnergyConsumerLinkServiceDeliveryPoint(energyConsumerLinkServiceDeliveryPoint);
			if (result == null)
				result = caseAbstractRule(energyConsumerLinkServiceDeliveryPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LOAD_AREA_LINK_CONTROL_AREA: {
			LoadAreaLinkControlArea loadAreaLinkControlArea = (LoadAreaLinkControlArea) theEObject;
			T result = caseLoadAreaLinkControlArea(loadAreaLinkControlArea);
			if (result == null)
				result = caseAbstractRule(loadAreaLinkControlArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.GML_POSITION: {
			GmlPosition gmlPosition = (GmlPosition) theEObject;
			T result = caseGmlPosition(gmlPosition);
			if (result == null)
				result = caseAbstractRule(gmlPosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NON_CONFORM_LOAD_GROUP: {
			NonConformLoadGroup nonConformLoadGroup = (NonConformLoadGroup) theEObject;
			T result = caseNonConformLoadGroup(nonConformLoadGroup);
			if (result == null)
				result = caseAbstractRule(nonConformLoadGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WORK_LOCATION: {
			WorkLocation workLocation = (WorkLocation) theEObject;
			T result = caseWorkLocation(workLocation);
			if (result == null)
				result = caseAbstractRule(workLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TIE_FLOW_LINK_CONTROL_AREA: {
			TieFlowLinkControlArea tieFlowLinkControlArea = (TieFlowLinkControlArea) theEObject;
			T result = caseTieFlowLinkControlArea(tieFlowLinkControlArea);
			if (result == null)
				result = caseAbstractRule(tieFlowLinkControlArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.POWER_SYSTEM_RESOURCE: {
			PowerSystemResource powerSystemResource = (PowerSystemResource) theEObject;
			T result = casePowerSystemResource(powerSystemResource);
			if (result == null)
				result = caseAbstractRule(powerSystemResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PRIVATE_METER_VOLTAGE: {
			PrivateMeterVoltage privateMeterVoltage = (PrivateMeterVoltage) theEObject;
			T result = casePrivateMeterVoltage(privateMeterVoltage);
			if (result == null)
				result = caseAbstractRule(privateMeterVoltage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LOCATION_LINK: {
			LocationLink locationLink = (LocationLink) theEObject;
			T result = caseLocationLink(locationLink);
			if (result == null)
				result = caseAbstractRule(locationLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PMU_VOLTAGE_METER: {
			PMUVoltageMeter pmuVoltageMeter = (PMUVoltageMeter) theEObject;
			T result = casePMUVoltageMeter(pmuVoltageMeter);
			if (result == null)
				result = caseAbstractRule(pmuVoltageMeter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SUB_LOAD_AREA: {
			SubLoadArea subLoadArea = (SubLoadArea) theEObject;
			T result = caseSubLoadArea(subLoadArea);
			if (result == null)
				result = caseAbstractRule(subLoadArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ENERGY_CONSUMER: {
			EnergyConsumer energyConsumer = (EnergyConsumer) theEObject;
			T result = caseEnergyConsumer(energyConsumer);
			if (result == null)
				result = caseAbstractRule(energyConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tie Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tie Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTieFlow(TieFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionPoint(PositionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Conform Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Conform Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonConformLoad(NonConformLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Delivery Point Link Meter Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Delivery Point Link Meter Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDeliveryPointLinkMeterAsset(ServiceDeliveryPointLinkMeterAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadArea(LoadArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLocation(ServiceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDP Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDP Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDPLocation(SDPLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conform Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conform Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformLoad(ConformLoad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlArea(ControlArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conform Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformLoadGroup(ConformLoadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationSupply(StationSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Delivery Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Delivery Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDeliveryPoint(ServiceDeliveryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumer Link Service Delivery Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumer Link Service Delivery Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumerLinkServiceDeliveryPoint(EnergyConsumerLinkServiceDeliveryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Area Link Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Area Link Control Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadAreaLinkControlArea(LoadAreaLinkControlArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlPosition(GmlPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Conform Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonConformLoadGroup(NonConformLoadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkLocation(WorkLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tie Flow Link Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tie Flow Link Control Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTieFlowLinkControlArea(TieFlowLinkControlArea object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Private Meter Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Meter Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateMeterVoltage(PrivateMeterVoltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationLink(LocationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PMU Voltage Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PMU Voltage Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMUVoltageMeter(PMUVoltageMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Load Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubLoadArea(SubLoadArea object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
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

} //RulesSwitch
