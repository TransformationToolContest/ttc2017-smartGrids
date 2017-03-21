/**
 */
package outagePreventionMjtrace.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import outagePreventionMjtrace.*;

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
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage
 * @generated
 */
public class OutagePreventionMjtraceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutagePreventionMjtracePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionMjtraceSwitch() {
		if (modelPackage == null) {
			modelPackage = OutagePreventionMjtracePackage.eINSTANCE;
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
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_MMXU_PMU_VOLTAGE_METER: {
				join_MeterAsset_MMXU_PMUVoltageMeter join_MeterAsset_MMXU_PMUVoltageMeter = (join_MeterAsset_MMXU_PMUVoltageMeter)theEObject;
				T result = casejoin_MeterAsset_MMXU_PMUVoltageMeter(join_MeterAsset_MMXU_PMUVoltageMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE: {
				join_MeterAsset_PhysicalDevice_PrivateMeterVoltage join_MeterAsset_PhysicalDevice_PrivateMeterVoltage = (join_MeterAsset_PhysicalDevice_PrivateMeterVoltage)theEObject;
				T result = casejoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage(join_MeterAsset_PhysicalDevice_PrivateMeterVoltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION: {
				ref_Location_Location_Location ref_Location_Location_Location = (ref_Location_Location_Location)theEObject;
				T result = caseref_Location_Location_Location(ref_Location_Location_Location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION: {
				ref_PositionPoint_PositionPoint_Position ref_PositionPoint_PositionPoint_Position = (ref_PositionPoint_PositionPoint_Position)theEObject;
				T result = caseref_PositionPoint_PositionPoint_Position(ref_PositionPoint_PositionPoint_Position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES: {
				ref_PowerSystemResource_PowerSystemResource_PowerSystemResources ref_PowerSystemResource_PowerSystemResource_PowerSystemResources = (ref_PowerSystemResource_PowerSystemResource_PowerSystemResources)theEObject;
				T result = caseref_PowerSystemResource_PowerSystemResource_PowerSystemResources(ref_PowerSystemResource_PowerSystemResource_PowerSystemResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_TERMINAL_TERMINAL_TERMINALS: {
				ref_Terminal_Terminal_Terminals ref_Terminal_Terminal_Terminals = (ref_Terminal_Terminal_Terminals)theEObject;
				T result = caseref_Terminal_Terminal_Terminals(ref_Terminal_Terminal_Terminals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_TIE_FLOW_TIE_FLOW_TIE_FLOW: {
				ref_TieFlow_TieFlow_TieFlow ref_TieFlow_TieFlow_TieFlow = (ref_TieFlow_TieFlow_TieFlow)theEObject;
				T result = caseref_TieFlow_TieFlow_TieFlow(ref_TieFlow_TieFlow_TieFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA: {
				ref_ControlArea_ControlArea_ControlArea ref_ControlArea_ControlArea_ControlArea = (ref_ControlArea_ControlArea_ControlArea)theEObject;
				T result = caseref_ControlArea_ControlArea_ControlArea(ref_ControlArea_ControlArea_ControlArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT: {
				ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint = (ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint)theEObject;
				T result = caseref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint(ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER: {
				ref_EnergyConsumer_EnergyConsumer_EnergyConsumer ref_EnergyConsumer_EnergyConsumer_EnergyConsumer = (ref_EnergyConsumer_EnergyConsumer_EnergyConsumer)theEObject;
				T result = caseref_EnergyConsumer_EnergyConsumer_EnergyConsumer(ref_EnergyConsumer_EnergyConsumer_EnergyConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP: {
				ref_ConformLoadGroup_ConformLoadGroup_LoadGroup ref_ConformLoadGroup_ConformLoadGroup_LoadGroup = (ref_ConformLoadGroup_ConformLoadGroup_LoadGroup)theEObject;
				T result = caseref_ConformLoadGroup_ConformLoadGroup_LoadGroup(ref_ConformLoadGroup_ConformLoadGroup_LoadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA: {
				ref_SubLoadArea_SubLoadArea_SubLoadArea ref_SubLoadArea_SubLoadArea_SubLoadArea = (ref_SubLoadArea_SubLoadArea_SubLoadArea)theEObject;
				T result = caseref_SubLoadArea_SubLoadArea_SubLoadArea(ref_SubLoadArea_SubLoadArea_SubLoadArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_LOAD_AREA_LOAD_AREA_LOAD_AREA: {
				ref_LoadArea_LoadArea_LoadArea ref_LoadArea_LoadArea_LoadArea = (ref_LoadArea_LoadArea_LoadArea)theEObject;
				T result = caseref_LoadArea_LoadArea_LoadArea(ref_LoadArea_LoadArea_LoadArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP: {
				ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup = (ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup)theEObject;
				T result = caseref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup(ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>join Meter Asset MMXU PMU Voltage Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>join Meter Asset MMXU PMU Voltage Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejoin_MeterAsset_MMXU_PMUVoltageMeter(join_MeterAsset_MMXU_PMUVoltageMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>join Meter Asset Physical Device Private Meter Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>join Meter Asset Physical Device Private Meter Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage(join_MeterAsset_PhysicalDevice_PrivateMeterVoltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Location Location Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Location Location Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_Location_Location_Location(ref_Location_Location_Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Position Point Position Point Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Position Point Position Point Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_PositionPoint_PositionPoint_Position(ref_PositionPoint_PositionPoint_Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Power System Resource Power System Resource Power System Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Power System Resource Power System Resource Power System Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_PowerSystemResource_PowerSystemResource_PowerSystemResources(ref_PowerSystemResource_PowerSystemResource_PowerSystemResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Terminal Terminal Terminals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Terminal Terminal Terminals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_Terminal_Terminal_Terminals(ref_Terminal_Terminal_Terminals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Tie Flow Tie Flow Tie Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Tie Flow Tie Flow Tie Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_TieFlow_TieFlow_TieFlow(ref_TieFlow_TieFlow_TieFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Control Area Control Area Control Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Control Area Control Area Control Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_ControlArea_ControlArea_ControlArea(ref_ControlArea_ControlArea_ControlArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Service Delivery Point Service Delivery Point Service Delivery Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Service Delivery Point Service Delivery Point Service Delivery Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint(ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Energy Consumer Energy Consumer Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Energy Consumer Energy Consumer Energy Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_EnergyConsumer_EnergyConsumer_EnergyConsumer(ref_EnergyConsumer_EnergyConsumer_EnergyConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Conform Load Group Conform Load Group Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Conform Load Group Conform Load Group Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_ConformLoadGroup_ConformLoadGroup_LoadGroup(ref_ConformLoadGroup_ConformLoadGroup_LoadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Sub Load Area Sub Load Area Sub Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Sub Load Area Sub Load Area Sub Load Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_SubLoadArea_SubLoadArea_SubLoadArea(ref_SubLoadArea_SubLoadArea_SubLoadArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Load Area Load Area Load Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Load Area Load Area Load Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_LoadArea_LoadArea_LoadArea(ref_LoadArea_LoadArea_LoadArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ref Non Conform Load Group Non Conform Load Group Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ref Non Conform Load Group Non Conform Load Group Load Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup(ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup object) {
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

} //OutagePreventionMjtraceSwitch
