/**
 */
package outagePreventionMjtrace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import outagePreventionMjtrace.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage
 * @generated
 */
public class OutagePreventionMjtraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutagePreventionMjtracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionMjtraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OutagePreventionMjtracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutagePreventionMjtraceSwitch<Adapter> modelSwitch =
		new OutagePreventionMjtraceSwitch<Adapter>() {
			@Override
			public Adapter casejoin_MeterAsset_MMXU_PMUVoltageMeter(join_MeterAsset_MMXU_PMUVoltageMeter object) {
				return createjoin_MeterAsset_MMXU_PMUVoltageMeterAdapter();
			}
			@Override
			public Adapter casejoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage(join_MeterAsset_PhysicalDevice_PrivateMeterVoltage object) {
				return createjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltageAdapter();
			}
			@Override
			public Adapter caseref_Location_Location_Location(ref_Location_Location_Location object) {
				return createref_Location_Location_LocationAdapter();
			}
			@Override
			public Adapter caseref_PositionPoint_PositionPoint_Position(ref_PositionPoint_PositionPoint_Position object) {
				return createref_PositionPoint_PositionPoint_PositionAdapter();
			}
			@Override
			public Adapter caseref_PowerSystemResource_PowerSystemResource_PowerSystemResources(ref_PowerSystemResource_PowerSystemResource_PowerSystemResources object) {
				return createref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesAdapter();
			}
			@Override
			public Adapter caseref_Terminal_Terminal_Terminals(ref_Terminal_Terminal_Terminals object) {
				return createref_Terminal_Terminal_TerminalsAdapter();
			}
			@Override
			public Adapter caseref_TieFlow_TieFlow_TieFlow(ref_TieFlow_TieFlow_TieFlow object) {
				return createref_TieFlow_TieFlow_TieFlowAdapter();
			}
			@Override
			public Adapter caseref_ControlArea_ControlArea_ControlArea(ref_ControlArea_ControlArea_ControlArea object) {
				return createref_ControlArea_ControlArea_ControlAreaAdapter();
			}
			@Override
			public Adapter caseref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint(ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint object) {
				return createref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointAdapter();
			}
			@Override
			public Adapter caseref_EnergyConsumer_EnergyConsumer_EnergyConsumer(ref_EnergyConsumer_EnergyConsumer_EnergyConsumer object) {
				return createref_EnergyConsumer_EnergyConsumer_EnergyConsumerAdapter();
			}
			@Override
			public Adapter caseref_ConformLoadGroup_ConformLoadGroup_LoadGroup(ref_ConformLoadGroup_ConformLoadGroup_LoadGroup object) {
				return createref_ConformLoadGroup_ConformLoadGroup_LoadGroupAdapter();
			}
			@Override
			public Adapter caseref_SubLoadArea_SubLoadArea_SubLoadArea(ref_SubLoadArea_SubLoadArea_SubLoadArea object) {
				return createref_SubLoadArea_SubLoadArea_SubLoadAreaAdapter();
			}
			@Override
			public Adapter caseref_LoadArea_LoadArea_LoadArea(ref_LoadArea_LoadArea_LoadArea object) {
				return createref_LoadArea_LoadArea_LoadAreaAdapter();
			}
			@Override
			public Adapter caseref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup(ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup object) {
				return createref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter <em>join Meter Asset MMXU PMU Voltage Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter
	 * @generated
	 */
	public Adapter createjoin_MeterAsset_MMXU_PMUVoltageMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage <em>join Meter Asset Physical Device Private Meter Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage
	 * @generated
	 */
	public Adapter createjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_Location_Location_Location <em>ref Location Location Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_Location_Location_Location
	 * @generated
	 */
	public Adapter createref_Location_Location_LocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_PositionPoint_PositionPoint_Position <em>ref Position Point Position Point Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_PositionPoint_PositionPoint_Position
	 * @generated
	 */
	public Adapter createref_PositionPoint_PositionPoint_PositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_PowerSystemResource_PowerSystemResource_PowerSystemResources <em>ref Power System Resource Power System Resource Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_PowerSystemResource_PowerSystemResource_PowerSystemResources
	 * @generated
	 */
	public Adapter createref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_Terminal_Terminal_Terminals <em>ref Terminal Terminal Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_Terminal_Terminal_Terminals
	 * @generated
	 */
	public Adapter createref_Terminal_Terminal_TerminalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_TieFlow_TieFlow_TieFlow <em>ref Tie Flow Tie Flow Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_TieFlow_TieFlow_TieFlow
	 * @generated
	 */
	public Adapter createref_TieFlow_TieFlow_TieFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_ControlArea_ControlArea_ControlArea <em>ref Control Area Control Area Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_ControlArea_ControlArea_ControlArea
	 * @generated
	 */
	public Adapter createref_ControlArea_ControlArea_ControlAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint <em>ref Service Delivery Point Service Delivery Point Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint
	 * @generated
	 */
	public Adapter createref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_EnergyConsumer_EnergyConsumer_EnergyConsumer <em>ref Energy Consumer Energy Consumer Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_EnergyConsumer_EnergyConsumer_EnergyConsumer
	 * @generated
	 */
	public Adapter createref_EnergyConsumer_EnergyConsumer_EnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_ConformLoadGroup_ConformLoadGroup_LoadGroup <em>ref Conform Load Group Conform Load Group Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_ConformLoadGroup_ConformLoadGroup_LoadGroup
	 * @generated
	 */
	public Adapter createref_ConformLoadGroup_ConformLoadGroup_LoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_SubLoadArea_SubLoadArea_SubLoadArea <em>ref Sub Load Area Sub Load Area Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_SubLoadArea_SubLoadArea_SubLoadArea
	 * @generated
	 */
	public Adapter createref_SubLoadArea_SubLoadArea_SubLoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_LoadArea_LoadArea_LoadArea <em>ref Load Area Load Area Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_LoadArea_LoadArea_LoadArea
	 * @generated
	 */
	public Adapter createref_LoadArea_LoadArea_LoadAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link outagePreventionMjtrace.ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup <em>ref Non Conform Load Group Non Conform Load Group Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see outagePreventionMjtrace.ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup
	 * @generated
	 */
	public Adapter createref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OutagePreventionMjtraceAdapterFactory
