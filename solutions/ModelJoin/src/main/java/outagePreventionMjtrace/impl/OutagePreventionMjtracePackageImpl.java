/**
 */
package outagePreventionMjtrace.impl;

import CIM.CIMPackage;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61970.ControlArea.ControlAreaPackage;

import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.LoadModel.LoadModelPackage;

import CIM.IEC61970.Wires.WiresPackage;

import COSEM.COSEMPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import outagePreventionJointarget.OutagePreventionJointargetPackage;

import outagePreventionJointarget.impl.OutagePreventionJointargetPackageImpl;

import outagePreventionMjtrace.OutagePreventionMjtraceFactory;
import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.join_MeterAsset_MMXU_PMUVoltageMeter;
import outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage;
import outagePreventionMjtrace.ref_ConformLoadGroup_ConformLoadGroup_LoadGroup;
import outagePreventionMjtrace.ref_ControlArea_ControlArea_ControlArea;
import outagePreventionMjtrace.ref_EnergyConsumer_EnergyConsumer_EnergyConsumer;
import outagePreventionMjtrace.ref_LoadArea_LoadArea_LoadArea;
import outagePreventionMjtrace.ref_Location_Location_Location;
import outagePreventionMjtrace.ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup;
import outagePreventionMjtrace.ref_PositionPoint_PositionPoint_Position;
import outagePreventionMjtrace.ref_PowerSystemResource_PowerSystemResource_PowerSystemResources;
import outagePreventionMjtrace.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint;
import outagePreventionMjtrace.ref_SubLoadArea_SubLoadArea_SubLoadArea;
import outagePreventionMjtrace.ref_Terminal_Terminal_Terminals;
import outagePreventionMjtrace.ref_TieFlow_TieFlow_TieFlow;

import substationStandard.LNNodes.LNGroupM.LNGroupMPackage;

import substationStandard.SubstationStandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutagePreventionMjtracePackageImpl extends EPackageImpl implements OutagePreventionMjtracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass join_MeterAsset_MMXU_PMUVoltageMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_Location_Location_LocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_PositionPoint_PositionPoint_PositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_Terminal_Terminal_TerminalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_TieFlow_TieFlow_TieFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_ControlArea_ControlArea_ControlAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_EnergyConsumer_EnergyConsumer_EnergyConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_ConformLoadGroup_ConformLoadGroup_LoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_SubLoadArea_SubLoadArea_SubLoadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_LoadArea_LoadArea_LoadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OutagePreventionMjtracePackageImpl() {
		super(eNS_URI, OutagePreventionMjtraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OutagePreventionMjtracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OutagePreventionMjtracePackage init() {
		if (isInited) return (OutagePreventionMjtracePackage)EPackage.Registry.INSTANCE.getEPackage(OutagePreventionMjtracePackage.eNS_URI);

		// Obtain or create and register package
		OutagePreventionMjtracePackageImpl theOutagePreventionMjtracePackage = (OutagePreventionMjtracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OutagePreventionMjtracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OutagePreventionMjtracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SubstationStandardPackage.eINSTANCE.eClass();
		COSEMPackage.eINSTANCE.eClass();
		CIMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OutagePreventionJointargetPackageImpl theOutagePreventionJointargetPackage = (OutagePreventionJointargetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutagePreventionJointargetPackage.eNS_URI) instanceof OutagePreventionJointargetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutagePreventionJointargetPackage.eNS_URI) : OutagePreventionJointargetPackage.eINSTANCE);

		// Create package meta-data objects
		theOutagePreventionMjtracePackage.createPackageContents();
		theOutagePreventionJointargetPackage.createPackageContents();

		// Initialize created meta-data
		theOutagePreventionMjtracePackage.initializePackageContents();
		theOutagePreventionJointargetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOutagePreventionMjtracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OutagePreventionMjtracePackage.eNS_URI, theOutagePreventionMjtracePackage);
		return theOutagePreventionMjtracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjoin_MeterAsset_MMXU_PMUVoltageMeter() {
		return join_MeterAsset_MMXU_PMUVoltageMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_MMXU_PMUVoltageMeter_Left() {
		return (EReference)join_MeterAsset_MMXU_PMUVoltageMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_MMXU_PMUVoltageMeter_Right() {
		return (EReference)join_MeterAsset_MMXU_PMUVoltageMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_MMXU_PMUVoltageMeter_Target() {
		return (EReference)join_MeterAsset_MMXU_PMUVoltageMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage() {
		return join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Left() {
		return (EReference)join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Right() {
		return (EReference)join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Target() {
		return (EReference)join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_Location_Location_Location() {
		return ref_Location_Location_LocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_Location_Location_Location_Source() {
		return (EReference)ref_Location_Location_LocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_Location_Location_Location_Target() {
		return (EReference)ref_Location_Location_LocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_PositionPoint_PositionPoint_Position() {
		return ref_PositionPoint_PositionPoint_PositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_PositionPoint_PositionPoint_Position_Source() {
		return (EReference)ref_PositionPoint_PositionPoint_PositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_PositionPoint_PositionPoint_Position_Target() {
		return (EReference)ref_PositionPoint_PositionPoint_PositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_PowerSystemResource_PowerSystemResource_PowerSystemResources() {
		return ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_PowerSystemResource_PowerSystemResource_PowerSystemResources_Source() {
		return (EReference)ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_PowerSystemResource_PowerSystemResource_PowerSystemResources_Target() {
		return (EReference)ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_Terminal_Terminal_Terminals() {
		return ref_Terminal_Terminal_TerminalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_Terminal_Terminal_Terminals_Source() {
		return (EReference)ref_Terminal_Terminal_TerminalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_Terminal_Terminal_Terminals_Target() {
		return (EReference)ref_Terminal_Terminal_TerminalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_TieFlow_TieFlow_TieFlow() {
		return ref_TieFlow_TieFlow_TieFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_TieFlow_TieFlow_TieFlow_Source() {
		return (EReference)ref_TieFlow_TieFlow_TieFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_TieFlow_TieFlow_TieFlow_Target() {
		return (EReference)ref_TieFlow_TieFlow_TieFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_ControlArea_ControlArea_ControlArea() {
		return ref_ControlArea_ControlArea_ControlAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_ControlArea_ControlArea_ControlArea_Source() {
		return (EReference)ref_ControlArea_ControlArea_ControlAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_ControlArea_ControlArea_ControlArea_Target() {
		return (EReference)ref_ControlArea_ControlArea_ControlAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint() {
		return ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint_Source() {
		return (EReference)ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint_Target() {
		return (EReference)ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_EnergyConsumer_EnergyConsumer_EnergyConsumer() {
		return ref_EnergyConsumer_EnergyConsumer_EnergyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_EnergyConsumer_EnergyConsumer_EnergyConsumer_Source() {
		return (EReference)ref_EnergyConsumer_EnergyConsumer_EnergyConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_EnergyConsumer_EnergyConsumer_EnergyConsumer_Target() {
		return (EReference)ref_EnergyConsumer_EnergyConsumer_EnergyConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_ConformLoadGroup_ConformLoadGroup_LoadGroup() {
		return ref_ConformLoadGroup_ConformLoadGroup_LoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_ConformLoadGroup_ConformLoadGroup_LoadGroup_Source() {
		return (EReference)ref_ConformLoadGroup_ConformLoadGroup_LoadGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_ConformLoadGroup_ConformLoadGroup_LoadGroup_Target() {
		return (EReference)ref_ConformLoadGroup_ConformLoadGroup_LoadGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_SubLoadArea_SubLoadArea_SubLoadArea() {
		return ref_SubLoadArea_SubLoadArea_SubLoadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_SubLoadArea_SubLoadArea_SubLoadArea_Source() {
		return (EReference)ref_SubLoadArea_SubLoadArea_SubLoadAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_SubLoadArea_SubLoadArea_SubLoadArea_Target() {
		return (EReference)ref_SubLoadArea_SubLoadArea_SubLoadAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_LoadArea_LoadArea_LoadArea() {
		return ref_LoadArea_LoadArea_LoadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_LoadArea_LoadArea_LoadArea_Source() {
		return (EReference)ref_LoadArea_LoadArea_LoadAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_LoadArea_LoadArea_LoadArea_Target() {
		return (EReference)ref_LoadArea_LoadArea_LoadAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup() {
		return ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup_Source() {
		return (EReference)ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup_Target() {
		return (EReference)ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionMjtraceFactory getOutagePreventionMjtraceFactory() {
		return (OutagePreventionMjtraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		join_MeterAsset_MMXU_PMUVoltageMeterEClass = createEClass(JOIN_METER_ASSET_MMXU_PMU_VOLTAGE_METER);
		createEReference(join_MeterAsset_MMXU_PMUVoltageMeterEClass, JOIN_METER_ASSET_MMXU_PMU_VOLTAGE_METER__LEFT);
		createEReference(join_MeterAsset_MMXU_PMUVoltageMeterEClass, JOIN_METER_ASSET_MMXU_PMU_VOLTAGE_METER__RIGHT);
		createEReference(join_MeterAsset_MMXU_PMUVoltageMeterEClass, JOIN_METER_ASSET_MMXU_PMU_VOLTAGE_METER__TARGET);

		join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass = createEClass(JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE);
		createEReference(join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass, JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__LEFT);
		createEReference(join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass, JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__RIGHT);
		createEReference(join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass, JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__TARGET);

		ref_Location_Location_LocationEClass = createEClass(REF_LOCATION_LOCATION_LOCATION);
		createEReference(ref_Location_Location_LocationEClass, REF_LOCATION_LOCATION_LOCATION__SOURCE);
		createEReference(ref_Location_Location_LocationEClass, REF_LOCATION_LOCATION_LOCATION__TARGET);

		ref_PositionPoint_PositionPoint_PositionEClass = createEClass(REF_POSITION_POINT_POSITION_POINT_POSITION);
		createEReference(ref_PositionPoint_PositionPoint_PositionEClass, REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE);
		createEReference(ref_PositionPoint_PositionPoint_PositionEClass, REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET);

		ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesEClass = createEClass(REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES);
		createEReference(ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesEClass, REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__SOURCE);
		createEReference(ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesEClass, REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__TARGET);

		ref_Terminal_Terminal_TerminalsEClass = createEClass(REF_TERMINAL_TERMINAL_TERMINALS);
		createEReference(ref_Terminal_Terminal_TerminalsEClass, REF_TERMINAL_TERMINAL_TERMINALS__SOURCE);
		createEReference(ref_Terminal_Terminal_TerminalsEClass, REF_TERMINAL_TERMINAL_TERMINALS__TARGET);

		ref_TieFlow_TieFlow_TieFlowEClass = createEClass(REF_TIE_FLOW_TIE_FLOW_TIE_FLOW);
		createEReference(ref_TieFlow_TieFlow_TieFlowEClass, REF_TIE_FLOW_TIE_FLOW_TIE_FLOW__SOURCE);
		createEReference(ref_TieFlow_TieFlow_TieFlowEClass, REF_TIE_FLOW_TIE_FLOW_TIE_FLOW__TARGET);

		ref_ControlArea_ControlArea_ControlAreaEClass = createEClass(REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA);
		createEReference(ref_ControlArea_ControlArea_ControlAreaEClass, REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__SOURCE);
		createEReference(ref_ControlArea_ControlArea_ControlAreaEClass, REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__TARGET);

		ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointEClass = createEClass(REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT);
		createEReference(ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointEClass, REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__SOURCE);
		createEReference(ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointEClass, REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__TARGET);

		ref_EnergyConsumer_EnergyConsumer_EnergyConsumerEClass = createEClass(REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER);
		createEReference(ref_EnergyConsumer_EnergyConsumer_EnergyConsumerEClass, REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__SOURCE);
		createEReference(ref_EnergyConsumer_EnergyConsumer_EnergyConsumerEClass, REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__TARGET);

		ref_ConformLoadGroup_ConformLoadGroup_LoadGroupEClass = createEClass(REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP);
		createEReference(ref_ConformLoadGroup_ConformLoadGroup_LoadGroupEClass, REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE);
		createEReference(ref_ConformLoadGroup_ConformLoadGroup_LoadGroupEClass, REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET);

		ref_SubLoadArea_SubLoadArea_SubLoadAreaEClass = createEClass(REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA);
		createEReference(ref_SubLoadArea_SubLoadArea_SubLoadAreaEClass, REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__SOURCE);
		createEReference(ref_SubLoadArea_SubLoadArea_SubLoadAreaEClass, REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__TARGET);

		ref_LoadArea_LoadArea_LoadAreaEClass = createEClass(REF_LOAD_AREA_LOAD_AREA_LOAD_AREA);
		createEReference(ref_LoadArea_LoadArea_LoadAreaEClass, REF_LOAD_AREA_LOAD_AREA_LOAD_AREA__SOURCE);
		createEReference(ref_LoadArea_LoadArea_LoadAreaEClass, REF_LOAD_AREA_LOAD_AREA_LOAD_AREA__TARGET);

		ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupEClass = createEClass(REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP);
		createEReference(ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupEClass, REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE);
		createEReference(ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupEClass, REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MeteringPackage theMeteringPackage = (MeteringPackage)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI);
		LNGroupMPackage theLNGroupMPackage = (LNGroupMPackage)EPackage.Registry.INSTANCE.getEPackage(LNGroupMPackage.eNS_URI);
		OutagePreventionJointargetPackage theOutagePreventionJointargetPackage = (OutagePreventionJointargetPackage)EPackage.Registry.INSTANCE.getEPackage(OutagePreventionJointargetPackage.eNS_URI);
		COSEMPackage theCOSEMPackage = (COSEMPackage)EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ControlAreaPackage theControlAreaPackage = (ControlAreaPackage)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI);
		WiresPackage theWiresPackage = (WiresPackage)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI);
		LoadModelPackage theLoadModelPackage = (LoadModelPackage)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(join_MeterAsset_MMXU_PMUVoltageMeterEClass, join_MeterAsset_MMXU_PMUVoltageMeter.class, "join_MeterAsset_MMXU_PMUVoltageMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjoin_MeterAsset_MMXU_PMUVoltageMeter_Left(), theMeteringPackage.getMeterAsset(), null, "left", null, 0, 1, join_MeterAsset_MMXU_PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getjoin_MeterAsset_MMXU_PMUVoltageMeter_Right(), theLNGroupMPackage.getMMXU(), null, "right", null, 0, 1, join_MeterAsset_MMXU_PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getjoin_MeterAsset_MMXU_PMUVoltageMeter_Target(), theOutagePreventionJointargetPackage.getPMUVoltageMeter(), null, "target", null, 0, 1, join_MeterAsset_MMXU_PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(join_MeterAsset_PhysicalDevice_PrivateMeterVoltageEClass, join_MeterAsset_PhysicalDevice_PrivateMeterVoltage.class, "join_MeterAsset_PhysicalDevice_PrivateMeterVoltage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Left(), theMeteringPackage.getMeterAsset(), null, "left", null, 0, 1, join_MeterAsset_PhysicalDevice_PrivateMeterVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Right(), theCOSEMPackage.getPhysicalDevice(), null, "right", null, 0, 1, join_MeterAsset_PhysicalDevice_PrivateMeterVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Target(), theOutagePreventionJointargetPackage.getPrivateMeterVoltage(), null, "target", null, 0, 1, join_MeterAsset_PhysicalDevice_PrivateMeterVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_Location_Location_LocationEClass, ref_Location_Location_Location.class, "ref_Location_Location_Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_Location_Location_Location_Source(), theCommonPackage.getLocation(), null, "source", null, 0, 1, ref_Location_Location_Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_Location_Location_Location_Target(), theOutagePreventionJointargetPackage.getLocation(), null, "target", null, 0, 1, ref_Location_Location_Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_PositionPoint_PositionPoint_PositionEClass, ref_PositionPoint_PositionPoint_Position.class, "ref_PositionPoint_PositionPoint_Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_PositionPoint_PositionPoint_Position_Source(), theCommonPackage.getPositionPoint(), null, "source", null, 0, 1, ref_PositionPoint_PositionPoint_Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_PositionPoint_PositionPoint_Position_Target(), theOutagePreventionJointargetPackage.getPositionPoint(), null, "target", null, 0, 1, ref_PositionPoint_PositionPoint_Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesEClass, ref_PowerSystemResource_PowerSystemResource_PowerSystemResources.class, "ref_PowerSystemResource_PowerSystemResource_PowerSystemResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_PowerSystemResource_PowerSystemResource_PowerSystemResources_Source(), theCorePackage.getPowerSystemResource(), null, "source", null, 0, 1, ref_PowerSystemResource_PowerSystemResource_PowerSystemResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_PowerSystemResource_PowerSystemResource_PowerSystemResources_Target(), theOutagePreventionJointargetPackage.getPowerSystemResource(), null, "target", null, 0, 1, ref_PowerSystemResource_PowerSystemResource_PowerSystemResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_Terminal_Terminal_TerminalsEClass, ref_Terminal_Terminal_Terminals.class, "ref_Terminal_Terminal_Terminals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_Terminal_Terminal_Terminals_Source(), theCorePackage.getTerminal(), null, "source", null, 0, 1, ref_Terminal_Terminal_Terminals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_Terminal_Terminal_Terminals_Target(), theOutagePreventionJointargetPackage.getTerminal(), null, "target", null, 0, 1, ref_Terminal_Terminal_Terminals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_TieFlow_TieFlow_TieFlowEClass, ref_TieFlow_TieFlow_TieFlow.class, "ref_TieFlow_TieFlow_TieFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_TieFlow_TieFlow_TieFlow_Source(), theControlAreaPackage.getTieFlow(), null, "source", null, 0, 1, ref_TieFlow_TieFlow_TieFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_TieFlow_TieFlow_TieFlow_Target(), theOutagePreventionJointargetPackage.getTieFlow(), null, "target", null, 0, 1, ref_TieFlow_TieFlow_TieFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_ControlArea_ControlArea_ControlAreaEClass, ref_ControlArea_ControlArea_ControlArea.class, "ref_ControlArea_ControlArea_ControlArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_ControlArea_ControlArea_ControlArea_Source(), theControlAreaPackage.getControlArea(), null, "source", null, 0, 1, ref_ControlArea_ControlArea_ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_ControlArea_ControlArea_ControlArea_Target(), theOutagePreventionJointargetPackage.getControlArea(), null, "target", null, 0, 1, ref_ControlArea_ControlArea_ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointEClass, ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint.class, "ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint_Source(), theMeteringPackage.getServiceDeliveryPoint(), null, "source", null, 0, 1, ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint_Target(), theOutagePreventionJointargetPackage.getServiceDeliveryPoint(), null, "target", null, 0, 1, ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_EnergyConsumer_EnergyConsumer_EnergyConsumerEClass, ref_EnergyConsumer_EnergyConsumer_EnergyConsumer.class, "ref_EnergyConsumer_EnergyConsumer_EnergyConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_EnergyConsumer_EnergyConsumer_EnergyConsumer_Source(), theWiresPackage.getEnergyConsumer(), null, "source", null, 0, 1, ref_EnergyConsumer_EnergyConsumer_EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_EnergyConsumer_EnergyConsumer_EnergyConsumer_Target(), theOutagePreventionJointargetPackage.getEnergyConsumer(), null, "target", null, 0, 1, ref_EnergyConsumer_EnergyConsumer_EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_ConformLoadGroup_ConformLoadGroup_LoadGroupEClass, ref_ConformLoadGroup_ConformLoadGroup_LoadGroup.class, "ref_ConformLoadGroup_ConformLoadGroup_LoadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_ConformLoadGroup_ConformLoadGroup_LoadGroup_Source(), theLoadModelPackage.getConformLoadGroup(), null, "source", null, 0, 1, ref_ConformLoadGroup_ConformLoadGroup_LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_ConformLoadGroup_ConformLoadGroup_LoadGroup_Target(), theOutagePreventionJointargetPackage.getConformLoadGroup(), null, "target", null, 0, 1, ref_ConformLoadGroup_ConformLoadGroup_LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_SubLoadArea_SubLoadArea_SubLoadAreaEClass, ref_SubLoadArea_SubLoadArea_SubLoadArea.class, "ref_SubLoadArea_SubLoadArea_SubLoadArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_SubLoadArea_SubLoadArea_SubLoadArea_Source(), theLoadModelPackage.getSubLoadArea(), null, "source", null, 0, 1, ref_SubLoadArea_SubLoadArea_SubLoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_SubLoadArea_SubLoadArea_SubLoadArea_Target(), theOutagePreventionJointargetPackage.getSubLoadArea(), null, "target", null, 0, 1, ref_SubLoadArea_SubLoadArea_SubLoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_LoadArea_LoadArea_LoadAreaEClass, ref_LoadArea_LoadArea_LoadArea.class, "ref_LoadArea_LoadArea_LoadArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_LoadArea_LoadArea_LoadArea_Source(), theLoadModelPackage.getLoadArea(), null, "source", null, 0, 1, ref_LoadArea_LoadArea_LoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_LoadArea_LoadArea_LoadArea_Target(), theOutagePreventionJointargetPackage.getLoadArea(), null, "target", null, 0, 1, ref_LoadArea_LoadArea_LoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupEClass, ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup.class, "ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup_Source(), theLoadModelPackage.getNonConformLoadGroup(), null, "source", null, 0, 1, ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup_Target(), theOutagePreventionJointargetPackage.getNonConformLoadGroup(), null, "target", null, 0, 1, ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OutagePreventionMjtracePackageImpl
