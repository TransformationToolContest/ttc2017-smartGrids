/**
 */
package rgse.ttc17.emoflon.tgg.task1.Rules.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractRule;

import rgse.ttc17.emoflon.tgg.task1.Rules.*;

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
 * @see rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage
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
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_CONF_LOAD: {
			EnergyConsumerWithIDConfLoad energyConsumerWithIDConfLoad = (EnergyConsumerWithIDConfLoad) theEObject;
			T result = caseEnergyConsumerWithIDConfLoad(energyConsumerWithIDConfLoad);
			if (result == null)
				result = caseAbstractRule(energyConsumerWithIDConfLoad);
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
		case RulesPackage.POSITION_POINT: {
			PositionPoint positionPoint = (PositionPoint) theEObject;
			T result = casePositionPoint(positionPoint);
			if (result == null)
				result = caseAbstractRule(positionPoint);
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
		case RulesPackage.ENERGY_CONSUMER: {
			EnergyConsumer energyConsumer = (EnergyConsumer) theEObject;
			T result = caseEnergyConsumer(energyConsumer);
			if (result == null)
				result = caseAbstractRule(energyConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.POSITION_POINT_LINK: {
			PositionPointLink positionPointLink = (PositionPointLink) theEObject;
			T result = casePositionPointLink(positionPointLink);
			if (result == null)
				result = caseAbstractRule(positionPointLink);
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
		case RulesPackage.ENERGY_CONSUMER_WITH_ID: {
			EnergyConsumerWithID energyConsumerWithID = (EnergyConsumerWithID) theEObject;
			T result = caseEnergyConsumerWithID(energyConsumerWithID);
			if (result == null)
				result = caseAbstractRule(energyConsumerWithID);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ENERGY_CONSUMER_WITH_ID_NON_CONF_LOAD: {
			EnergyConsumerWithIDNonConfLoad energyConsumerWithIDNonConfLoad = (EnergyConsumerWithIDNonConfLoad) theEObject;
			T result = caseEnergyConsumerWithIDNonConfLoad(energyConsumerWithIDNonConfLoad);
			if (result == null)
				result = caseAbstractRule(energyConsumerWithIDNonConfLoad);
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
		case RulesPackage.SDP_LOCATION: {
			SDPLocation sdpLocation = (SDPLocation) theEObject;
			T result = caseSDPLocation(sdpLocation);
			if (result == null)
				result = caseAbstractRule(sdpLocation);
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
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumer With ID Conf Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumer With ID Conf Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumerWithIDConfLoad(EnergyConsumerWithIDConfLoad object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Position Point Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Point Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionPointLink(PositionPointLink object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumer With ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumer With ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumerWithID(EnergyConsumerWithID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumer With ID Non Conf Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumer With ID Non Conf Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumerWithIDNonConfLoad(EnergyConsumerWithIDNonConfLoad object) {
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
