/**
 */
package outagePreventionJointarget.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import outagePreventionJointarget.*;

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
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage
 * @generated
 */
public class OutagePreventionJointargetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutagePreventionJointargetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionJointargetSwitch() {
		if (modelPackage == null) {
			modelPackage = OutagePreventionJointargetPackage.eINSTANCE;
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
			case OutagePreventionJointargetPackage.PMU_VOLTAGE_METER: {
				PMUVoltageMeter pmuVoltageMeter = (PMUVoltageMeter)theEObject;
				T result = casePMUVoltageMeter(pmuVoltageMeter);
				if (result == null) result = caseAsset(pmuVoltageMeter);
				if (result == null) result = caseEndDeviceAsset(pmuVoltageMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE: {
				PrivateMeterVoltage privateMeterVoltage = (PrivateMeterVoltage)theEObject;
				T result = casePrivateMeterVoltage(privateMeterVoltage);
				if (result == null) result = caseAsset(privateMeterVoltage);
				if (result == null) result = caseEndDeviceAsset(privateMeterVoltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.POSITION_POINT: {
				PositionPoint positionPoint = (PositionPoint)theEObject;
				T result = casePositionPoint(positionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.POWER_SYSTEM_RESOURCE: {
				PowerSystemResource powerSystemResource = (PowerSystemResource)theEObject;
				T result = casePowerSystemResource(powerSystemResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.CONDUCTING_EQUIPMENT: {
				ConductingEquipment conductingEquipment = (ConductingEquipment)theEObject;
				T result = caseConductingEquipment(conductingEquipment);
				if (result == null) result = casePowerSystemResource(conductingEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.TIE_FLOW: {
				TieFlow tieFlow = (TieFlow)theEObject;
				T result = caseTieFlow(tieFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.CONTROL_AREA: {
				ControlArea controlArea = (ControlArea)theEObject;
				T result = caseControlArea(controlArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.END_DEVICE_ASSET: {
				EndDeviceAsset endDeviceAsset = (EndDeviceAsset)theEObject;
				T result = caseEndDeviceAsset(endDeviceAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.SERVICE_DELIVERY_POINT: {
				ServiceDeliveryPoint serviceDeliveryPoint = (ServiceDeliveryPoint)theEObject;
				T result = caseServiceDeliveryPoint(serviceDeliveryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.ENERGY_CONSUMER: {
				EnergyConsumer energyConsumer = (EnergyConsumer)theEObject;
				T result = caseEnergyConsumer(energyConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.CONFORM_LOAD: {
				ConformLoad conformLoad = (ConformLoad)theEObject;
				T result = caseConformLoad(conformLoad);
				if (result == null) result = caseEnergyConsumer(conformLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.CONFORM_LOAD_GROUP: {
				ConformLoadGroup conformLoadGroup = (ConformLoadGroup)theEObject;
				T result = caseConformLoadGroup(conformLoadGroup);
				if (result == null) result = caseLoadGroup(conformLoadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.LOAD_GROUP: {
				LoadGroup loadGroup = (LoadGroup)theEObject;
				T result = caseLoadGroup(loadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.SUB_LOAD_AREA: {
				SubLoadArea subLoadArea = (SubLoadArea)theEObject;
				T result = caseSubLoadArea(subLoadArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.LOAD_AREA: {
				LoadArea loadArea = (LoadArea)theEObject;
				T result = caseLoadArea(loadArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.NON_CONFORM_LOAD: {
				NonConformLoad nonConformLoad = (NonConformLoad)theEObject;
				T result = caseNonConformLoad(nonConformLoad);
				if (result == null) result = caseEnergyConsumer(nonConformLoad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionJointargetPackage.NON_CONFORM_LOAD_GROUP: {
				NonConformLoadGroup nonConformLoadGroup = (NonConformLoadGroup)theEObject;
				T result = caseNonConformLoadGroup(nonConformLoadGroup);
				if (result == null) result = caseLoadGroup(nonConformLoadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductingEquipment(ConductingEquipment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>End Device Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceAsset(EndDeviceAsset object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadGroup(LoadGroup object) {
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

} //OutagePreventionJointargetSwitch
