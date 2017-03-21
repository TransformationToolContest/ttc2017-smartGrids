/**
 */
package outagePreventionMjtrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import outagePreventionMjtrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutagePreventionMjtraceFactoryImpl extends EFactoryImpl implements OutagePreventionMjtraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutagePreventionMjtraceFactory init() {
		try {
			OutagePreventionMjtraceFactory theOutagePreventionMjtraceFactory = (OutagePreventionMjtraceFactory)EPackage.Registry.INSTANCE.getEFactory(OutagePreventionMjtracePackage.eNS_URI);
			if (theOutagePreventionMjtraceFactory != null) {
				return theOutagePreventionMjtraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OutagePreventionMjtraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionMjtraceFactoryImpl() {
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
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_MMXU_PMU_VOLTAGE_METER: return createjoin_MeterAsset_MMXU_PMUVoltageMeter();
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE: return createjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage();
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION: return createref_Location_Location_Location();
			case OutagePreventionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION: return createref_PositionPoint_PositionPoint_Position();
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES: return createref_PowerSystemResource_PowerSystemResource_PowerSystemResources();
			case OutagePreventionMjtracePackage.REF_TERMINAL_TERMINAL_TERMINALS: return createref_Terminal_Terminal_Terminals();
			case OutagePreventionMjtracePackage.REF_TIE_FLOW_TIE_FLOW_TIE_FLOW: return createref_TieFlow_TieFlow_TieFlow();
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA: return createref_ControlArea_ControlArea_ControlArea();
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT: return createref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint();
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER: return createref_EnergyConsumer_EnergyConsumer_EnergyConsumer();
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP: return createref_ConformLoadGroup_ConformLoadGroup_LoadGroup();
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA: return createref_SubLoadArea_SubLoadArea_SubLoadArea();
			case OutagePreventionMjtracePackage.REF_LOAD_AREA_LOAD_AREA_LOAD_AREA: return createref_LoadArea_LoadArea_LoadArea();
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP: return createref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public join_MeterAsset_MMXU_PMUVoltageMeter createjoin_MeterAsset_MMXU_PMUVoltageMeter() {
		join_MeterAsset_MMXU_PMUVoltageMeterImpl join_MeterAsset_MMXU_PMUVoltageMeter = new join_MeterAsset_MMXU_PMUVoltageMeterImpl();
		return join_MeterAsset_MMXU_PMUVoltageMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public join_MeterAsset_PhysicalDevice_PrivateMeterVoltage createjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage() {
		join_MeterAsset_PhysicalDevice_PrivateMeterVoltageImpl join_MeterAsset_PhysicalDevice_PrivateMeterVoltage = new join_MeterAsset_PhysicalDevice_PrivateMeterVoltageImpl();
		return join_MeterAsset_PhysicalDevice_PrivateMeterVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_Location_Location_Location createref_Location_Location_Location() {
		ref_Location_Location_LocationImpl ref_Location_Location_Location = new ref_Location_Location_LocationImpl();
		return ref_Location_Location_Location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_PositionPoint_PositionPoint_Position createref_PositionPoint_PositionPoint_Position() {
		ref_PositionPoint_PositionPoint_PositionImpl ref_PositionPoint_PositionPoint_Position = new ref_PositionPoint_PositionPoint_PositionImpl();
		return ref_PositionPoint_PositionPoint_Position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_PowerSystemResource_PowerSystemResource_PowerSystemResources createref_PowerSystemResource_PowerSystemResource_PowerSystemResources() {
		ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesImpl ref_PowerSystemResource_PowerSystemResource_PowerSystemResources = new ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesImpl();
		return ref_PowerSystemResource_PowerSystemResource_PowerSystemResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_Terminal_Terminal_Terminals createref_Terminal_Terminal_Terminals() {
		ref_Terminal_Terminal_TerminalsImpl ref_Terminal_Terminal_Terminals = new ref_Terminal_Terminal_TerminalsImpl();
		return ref_Terminal_Terminal_Terminals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_TieFlow_TieFlow_TieFlow createref_TieFlow_TieFlow_TieFlow() {
		ref_TieFlow_TieFlow_TieFlowImpl ref_TieFlow_TieFlow_TieFlow = new ref_TieFlow_TieFlow_TieFlowImpl();
		return ref_TieFlow_TieFlow_TieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_ControlArea_ControlArea_ControlArea createref_ControlArea_ControlArea_ControlArea() {
		ref_ControlArea_ControlArea_ControlAreaImpl ref_ControlArea_ControlArea_ControlArea = new ref_ControlArea_ControlArea_ControlAreaImpl();
		return ref_ControlArea_ControlArea_ControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint createref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint() {
		ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointImpl ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint = new ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointImpl();
		return ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_EnergyConsumer_EnergyConsumer_EnergyConsumer createref_EnergyConsumer_EnergyConsumer_EnergyConsumer() {
		ref_EnergyConsumer_EnergyConsumer_EnergyConsumerImpl ref_EnergyConsumer_EnergyConsumer_EnergyConsumer = new ref_EnergyConsumer_EnergyConsumer_EnergyConsumerImpl();
		return ref_EnergyConsumer_EnergyConsumer_EnergyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_ConformLoadGroup_ConformLoadGroup_LoadGroup createref_ConformLoadGroup_ConformLoadGroup_LoadGroup() {
		ref_ConformLoadGroup_ConformLoadGroup_LoadGroupImpl ref_ConformLoadGroup_ConformLoadGroup_LoadGroup = new ref_ConformLoadGroup_ConformLoadGroup_LoadGroupImpl();
		return ref_ConformLoadGroup_ConformLoadGroup_LoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_SubLoadArea_SubLoadArea_SubLoadArea createref_SubLoadArea_SubLoadArea_SubLoadArea() {
		ref_SubLoadArea_SubLoadArea_SubLoadAreaImpl ref_SubLoadArea_SubLoadArea_SubLoadArea = new ref_SubLoadArea_SubLoadArea_SubLoadAreaImpl();
		return ref_SubLoadArea_SubLoadArea_SubLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_LoadArea_LoadArea_LoadArea createref_LoadArea_LoadArea_LoadArea() {
		ref_LoadArea_LoadArea_LoadAreaImpl ref_LoadArea_LoadArea_LoadArea = new ref_LoadArea_LoadArea_LoadAreaImpl();
		return ref_LoadArea_LoadArea_LoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup createref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup() {
		ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupImpl ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup = new ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupImpl();
		return ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionMjtracePackage getOutagePreventionMjtracePackage() {
		return (OutagePreventionMjtracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OutagePreventionMjtracePackage getPackage() {
		return OutagePreventionMjtracePackage.eINSTANCE;
	}

} //OutagePreventionMjtraceFactoryImpl
