/**
 */
package rgse.ttc17.emoflon.tgg.task2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import rgse.ttc17.emoflon.tgg.task2.*;

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
 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package
 * @generated
 */
public class Task2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Task2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2Switch() {
		if (modelPackage == null) {
			modelPackage = Task2Package.eINSTANCE;
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
		case Task2Package.CONTROL_AREA_TO_CONTROL_SREA: {
			ControlAreaToControlSrea controlAreaToControlSrea = (ControlAreaToControlSrea) theEObject;
			T result = caseControlAreaToControlSrea(controlAreaToControlSrea);
			if (result == null)
				result = caseAbstractCorrespondence(controlAreaToControlSrea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT: {
			ServiceDeliveryPointToServiceDeliveryPoint serviceDeliveryPointToServiceDeliveryPoint = (ServiceDeliveryPointToServiceDeliveryPoint) theEObject;
			T result = caseServiceDeliveryPointToServiceDeliveryPoint(serviceDeliveryPointToServiceDeliveryPoint);
			if (result == null)
				result = caseAbstractCorrespondence(serviceDeliveryPointToServiceDeliveryPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE: {
			PowerSystemResourceToPowerSystemResource powerSystemResourceToPowerSystemResource = (PowerSystemResourceToPowerSystemResource) theEObject;
			T result = casePowerSystemResourceToPowerSystemResource(powerSystemResourceToPowerSystemResource);
			if (result == null)
				result = caseAbstractCorrespondence(powerSystemResourceToPowerSystemResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.PHYSICAL_DEVICE_TO_PRIVATE_METER_VOLTAGE: {
			PhysicalDeviceToPrivateMeterVoltage physicalDeviceToPrivateMeterVoltage = (PhysicalDeviceToPrivateMeterVoltage) theEObject;
			T result = casePhysicalDeviceToPrivateMeterVoltage(physicalDeviceToPrivateMeterVoltage);
			if (result == null)
				result = caseAbstractCorrespondence(physicalDeviceToPrivateMeterVoltage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.LOCATION_TO_LOCATION: {
			LocationToLocation locationToLocation = (LocationToLocation) theEObject;
			T result = caseLocationToLocation(locationToLocation);
			if (result == null)
				result = caseAbstractCorrespondence(locationToLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.ENERGY_CONSUMER_TO_ENERGY_CONSUMER: {
			EnergyConsumerToEnergyConsumer energyConsumerToEnergyConsumer = (EnergyConsumerToEnergyConsumer) theEObject;
			T result = caseEnergyConsumerToEnergyConsumer(energyConsumerToEnergyConsumer);
			if (result == null)
				result = caseAbstractCorrespondence(energyConsumerToEnergyConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.METER_ASSET_TO_PRIVATE_METER_VOLTAGE: {
			MeterAssetToPrivateMeterVoltage meterAssetToPrivateMeterVoltage = (MeterAssetToPrivateMeterVoltage) theEObject;
			T result = caseMeterAssetToPrivateMeterVoltage(meterAssetToPrivateMeterVoltage);
			if (result == null)
				result = caseAbstractCorrespondence(meterAssetToPrivateMeterVoltage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER: {
			MeterAssetToMMXUToVoltageMeter meterAssetToMMXUToVoltageMeter = (MeterAssetToMMXUToVoltageMeter) theEObject;
			T result = caseMeterAssetToMMXUToVoltageMeter(meterAssetToMMXUToVoltageMeter);
			if (result == null)
				result = caseAbstractCorrespondence(meterAssetToMMXUToVoltageMeter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.MMXU_TO_PMU_VOLTAGE_METER: {
			MMXUToPMUVoltageMeter mmxuToPMUVoltageMeter = (MMXUToPMUVoltageMeter) theEObject;
			T result = caseMMXUToPMUVoltageMeter(mmxuToPMUVoltageMeter);
			if (result == null)
				result = caseAbstractCorrespondence(mmxuToPMUVoltageMeter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.CONFORM_LOAD_GROUP_TO_CONFORM_LOAD_GROUP: {
			ConformLoadGroupToConformLoadGroup conformLoadGroupToConformLoadGroup = (ConformLoadGroupToConformLoadGroup) theEObject;
			T result = caseConformLoadGroupToConformLoadGroup(conformLoadGroupToConformLoadGroup);
			if (result == null)
				result = caseAbstractCorrespondence(conformLoadGroupToConformLoadGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.SUB_LOAD_AREA_TO_SUB_LOAD_AREA: {
			SubLoadAreaToSubLoadArea subLoadAreaToSubLoadArea = (SubLoadAreaToSubLoadArea) theEObject;
			T result = caseSubLoadAreaToSubLoadArea(subLoadAreaToSubLoadArea);
			if (result == null)
				result = caseAbstractCorrespondence(subLoadAreaToSubLoadArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.LOAD_AREA_TO_LOAD_AREA: {
			LoadAreaToLoadArea loadAreaToLoadArea = (LoadAreaToLoadArea) theEObject;
			T result = caseLoadAreaToLoadArea(loadAreaToLoadArea);
			if (result == null)
				result = caseAbstractCorrespondence(loadAreaToLoadArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.METER_ASSET_TO_PMU_VOLTAGE_METER: {
			MeterAssetToPMUVoltageMeter meterAssetToPMUVoltageMeter = (MeterAssetToPMUVoltageMeter) theEObject;
			T result = caseMeterAssetToPMUVoltageMeter(meterAssetToPMUVoltageMeter);
			if (result == null)
				result = caseAbstractCorrespondence(meterAssetToPMUVoltageMeter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.POSITION_POINT_TO_POSITION_POINT: {
			PositionPointToPositionPoint positionPointToPositionPoint = (PositionPointToPositionPoint) theEObject;
			T result = casePositionPointToPositionPoint(positionPointToPositionPoint);
			if (result == null)
				result = caseAbstractCorrespondence(positionPointToPositionPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP: {
			NonConformLoadGroupNonToConformLoadGroup nonConformLoadGroupNonToConformLoadGroup = (NonConformLoadGroupNonToConformLoadGroup) theEObject;
			T result = caseNonConformLoadGroupNonToConformLoadGroup(nonConformLoadGroupNonToConformLoadGroup);
			if (result == null)
				result = caseAbstractCorrespondence(nonConformLoadGroupNonToConformLoadGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.TERMINAL_TO_TERMINAL: {
			TerminalToTerminal terminalToTerminal = (TerminalToTerminal) theEObject;
			T result = caseTerminalToTerminal(terminalToTerminal);
			if (result == null)
				result = caseAbstractCorrespondence(terminalToTerminal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Task2Package.TIE_FLOW_TO_TIE_FLOW: {
			TieFlowToTieFlow tieFlowToTieFlow = (TieFlowToTieFlow) theEObject;
			T result = caseTieFlowToTieFlow(tieFlowToTieFlow);
			if (result == null)
				result = caseAbstractCorrespondence(tieFlowToTieFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Area To Control Srea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Area To Control Srea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlAreaToControlSrea(ControlAreaToControlSrea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Delivery Point To Service Delivery Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Delivery Point To Service Delivery Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDeliveryPointToServiceDeliveryPoint(ServiceDeliveryPointToServiceDeliveryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource To Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource To Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResourceToPowerSystemResource(PowerSystemResourceToPowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Device To Private Meter Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Device To Private Meter Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalDeviceToPrivateMeterVoltage(PhysicalDeviceToPrivateMeterVoltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location To Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location To Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationToLocation(LocationToLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumer To Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumer To Energy Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumerToEnergyConsumer(EnergyConsumerToEnergyConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Asset To Private Meter Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Asset To Private Meter Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterAssetToPrivateMeterVoltage(MeterAssetToPrivateMeterVoltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Asset To MMXU To Voltage Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Asset To MMXU To Voltage Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterAssetToMMXUToVoltageMeter(MeterAssetToMMXUToVoltageMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMXU To PMU Voltage Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMXU To PMU Voltage Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMXUToPMUVoltageMeter(MMXUToPMUVoltageMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conform Load Group To Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conform Load Group To Conform Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformLoadGroupToConformLoadGroup(ConformLoadGroupToConformLoadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Load Area To Sub Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Load Area To Sub Load Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubLoadAreaToSubLoadArea(SubLoadAreaToSubLoadArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Area To Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Area To Load Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadAreaToLoadArea(LoadAreaToLoadArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Asset To PMU Voltage Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Asset To PMU Voltage Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterAssetToPMUVoltageMeter(MeterAssetToPMUVoltageMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Point To Position Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Point To Position Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionPointToPositionPoint(PositionPointToPositionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Conform Load Group Non To Conform Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Conform Load Group Non To Conform Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonConformLoadGroupNonToConformLoadGroup(NonConformLoadGroupNonToConformLoadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal To Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal To Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminalToTerminal(TerminalToTerminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tie Flow To Tie Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tie Flow To Tie Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTieFlowToTieFlow(TieFlowToTieFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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

} //Task2Switch
