/**
 */
package outagePreventionJointarget.impl;

import CIM.CIMPackage;

import COSEM.COSEMPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import outagePreventionJointarget.Asset;
import outagePreventionJointarget.ConductingEquipment;
import outagePreventionJointarget.ConformLoad;
import outagePreventionJointarget.ConformLoadGroup;
import outagePreventionJointarget.ControlArea;
import outagePreventionJointarget.EndDeviceAsset;
import outagePreventionJointarget.EnergyConsumer;
import outagePreventionJointarget.LoadArea;
import outagePreventionJointarget.LoadGroup;
import outagePreventionJointarget.Location;
import outagePreventionJointarget.NonConformLoad;
import outagePreventionJointarget.NonConformLoadGroup;
import outagePreventionJointarget.OutagePreventionJointargetFactory;
import outagePreventionJointarget.OutagePreventionJointargetPackage;
import outagePreventionJointarget.PMUVoltageMeter;
import outagePreventionJointarget.PositionPoint;
import outagePreventionJointarget.PowerSystemResource;
import outagePreventionJointarget.PrivateMeterVoltage;
import outagePreventionJointarget.ServiceDeliveryPoint;
import outagePreventionJointarget.SubLoadArea;
import outagePreventionJointarget.Terminal;
import outagePreventionJointarget.TieFlow;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;

import outagePreventionMjtrace.impl.OutagePreventionMjtracePackageImpl;

import substationStandard.SubstationStandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutagePreventionJointargetPackageImpl extends EPackageImpl implements OutagePreventionJointargetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pmuVoltageMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateMeterVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSystemResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductingEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tieFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDeliveryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subLoadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadGroupEClass = null;

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
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OutagePreventionJointargetPackageImpl() {
		super(eNS_URI, OutagePreventionJointargetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OutagePreventionJointargetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OutagePreventionJointargetPackage init() {
		if (isInited) return (OutagePreventionJointargetPackage)EPackage.Registry.INSTANCE.getEPackage(OutagePreventionJointargetPackage.eNS_URI);

		// Obtain or create and register package
		OutagePreventionJointargetPackageImpl theOutagePreventionJointargetPackage = (OutagePreventionJointargetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OutagePreventionJointargetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OutagePreventionJointargetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SubstationStandardPackage.eINSTANCE.eClass();
		COSEMPackage.eINSTANCE.eClass();
		CIMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OutagePreventionMjtracePackageImpl theOutagePreventionMjtracePackage = (OutagePreventionMjtracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutagePreventionMjtracePackage.eNS_URI) instanceof OutagePreventionMjtracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutagePreventionMjtracePackage.eNS_URI) : OutagePreventionMjtracePackage.eINSTANCE);

		// Create package meta-data objects
		theOutagePreventionJointargetPackage.createPackageContents();
		theOutagePreventionMjtracePackage.createPackageContents();

		// Initialize created meta-data
		theOutagePreventionJointargetPackage.initializePackageContents();
		theOutagePreventionMjtracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOutagePreventionJointargetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OutagePreventionJointargetPackage.eNS_URI, theOutagePreventionJointargetPackage);
		return theOutagePreventionJointargetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPMUVoltageMeter() {
		return pmuVoltageMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_MRID() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageAMag() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageAAng() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageBMag() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageBAng() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageCMag() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageCAng() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageNeutMag() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageNeutAng() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageNetMag() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageNetAng() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageResMag() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMUVoltageMeter_VoltageResAng() {
		return (EAttribute)pmuVoltageMeterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivateMeterVoltage() {
		return privateMeterVoltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivateMeterVoltage_ID() {
		return (EAttribute)privateMeterVoltageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivateMeterVoltage_VoltageA() {
		return (EAttribute)privateMeterVoltageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivateMeterVoltage_VoltageB() {
		return (EAttribute)privateMeterVoltageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivateMeterVoltage_VoltageC() {
		return (EAttribute)privateMeterVoltageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsset_Location() {
		return (EReference)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Position() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_PowerSystemResources() {
		return (EReference)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionPoint() {
		return positionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionPoint_XPosition() {
		return (EAttribute)positionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionPoint_YPosition() {
		return (EAttribute)positionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionPoint_ZPosition() {
		return (EAttribute)positionPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSystemResource() {
		return powerSystemResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConductingEquipment() {
		return conductingEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductingEquipment_Terminals() {
		return (EReference)conductingEquipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminal_TieFlow() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTieFlow() {
		return tieFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTieFlow_ControlArea() {
		return (EReference)tieFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlArea() {
		return controlAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlArea_MRID() {
		return (EAttribute)controlAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndDeviceAsset() {
		return endDeviceAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndDeviceAsset_ServiceDeliveryPoint() {
		return (EReference)endDeviceAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDeliveryPoint() {
		return serviceDeliveryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_EnergyConsumer() {
		return (EReference)serviceDeliveryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumer() {
		return energyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_MRID() {
		return (EAttribute)energyConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformLoad() {
		return conformLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformLoad_LoadGroup() {
		return (EReference)conformLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformLoadGroup() {
		return conformLoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadGroup() {
		return loadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadGroup_SubLoadArea() {
		return (EReference)loadGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubLoadArea() {
		return subLoadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubLoadArea_LoadArea() {
		return (EReference)subLoadAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadArea() {
		return loadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadArea_ControlArea() {
		return (EReference)loadAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConformLoad() {
		return nonConformLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonConformLoad_LoadGroup() {
		return (EReference)nonConformLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConformLoadGroup() {
		return nonConformLoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutagePreventionJointargetFactory getOutagePreventionJointargetFactory() {
		return (OutagePreventionJointargetFactory)getEFactoryInstance();
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
		pmuVoltageMeterEClass = createEClass(PMU_VOLTAGE_METER);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__MRID);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_AMAG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_AANG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_BMAG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_BANG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_CMAG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_CANG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_NEUT_MAG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_NEUT_ANG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_NET_MAG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_NET_ANG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_RES_MAG);
		createEAttribute(pmuVoltageMeterEClass, PMU_VOLTAGE_METER__VOLTAGE_RES_ANG);

		privateMeterVoltageEClass = createEClass(PRIVATE_METER_VOLTAGE);
		createEAttribute(privateMeterVoltageEClass, PRIVATE_METER_VOLTAGE__ID);
		createEAttribute(privateMeterVoltageEClass, PRIVATE_METER_VOLTAGE__VOLTAGE_A);
		createEAttribute(privateMeterVoltageEClass, PRIVATE_METER_VOLTAGE__VOLTAGE_B);
		createEAttribute(privateMeterVoltageEClass, PRIVATE_METER_VOLTAGE__VOLTAGE_C);

		assetEClass = createEClass(ASSET);
		createEReference(assetEClass, ASSET__LOCATION);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__POSITION);
		createEReference(locationEClass, LOCATION__POWER_SYSTEM_RESOURCES);

		positionPointEClass = createEClass(POSITION_POINT);
		createEAttribute(positionPointEClass, POSITION_POINT__XPOSITION);
		createEAttribute(positionPointEClass, POSITION_POINT__YPOSITION);
		createEAttribute(positionPointEClass, POSITION_POINT__ZPOSITION);

		powerSystemResourceEClass = createEClass(POWER_SYSTEM_RESOURCE);

		conductingEquipmentEClass = createEClass(CONDUCTING_EQUIPMENT);
		createEReference(conductingEquipmentEClass, CONDUCTING_EQUIPMENT__TERMINALS);

		terminalEClass = createEClass(TERMINAL);
		createEReference(terminalEClass, TERMINAL__TIE_FLOW);

		tieFlowEClass = createEClass(TIE_FLOW);
		createEReference(tieFlowEClass, TIE_FLOW__CONTROL_AREA);

		controlAreaEClass = createEClass(CONTROL_AREA);
		createEAttribute(controlAreaEClass, CONTROL_AREA__MRID);

		endDeviceAssetEClass = createEClass(END_DEVICE_ASSET);
		createEReference(endDeviceAssetEClass, END_DEVICE_ASSET__SERVICE_DELIVERY_POINT);

		serviceDeliveryPointEClass = createEClass(SERVICE_DELIVERY_POINT);
		createEReference(serviceDeliveryPointEClass, SERVICE_DELIVERY_POINT__ENERGY_CONSUMER);

		energyConsumerEClass = createEClass(ENERGY_CONSUMER);
		createEAttribute(energyConsumerEClass, ENERGY_CONSUMER__MRID);

		conformLoadEClass = createEClass(CONFORM_LOAD);
		createEReference(conformLoadEClass, CONFORM_LOAD__LOAD_GROUP);

		conformLoadGroupEClass = createEClass(CONFORM_LOAD_GROUP);

		loadGroupEClass = createEClass(LOAD_GROUP);
		createEReference(loadGroupEClass, LOAD_GROUP__SUB_LOAD_AREA);

		subLoadAreaEClass = createEClass(SUB_LOAD_AREA);
		createEReference(subLoadAreaEClass, SUB_LOAD_AREA__LOAD_AREA);

		loadAreaEClass = createEClass(LOAD_AREA);
		createEReference(loadAreaEClass, LOAD_AREA__CONTROL_AREA);

		nonConformLoadEClass = createEClass(NON_CONFORM_LOAD);
		createEReference(nonConformLoadEClass, NON_CONFORM_LOAD__LOAD_GROUP);

		nonConformLoadGroupEClass = createEClass(NON_CONFORM_LOAD_GROUP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pmuVoltageMeterEClass.getESuperTypes().add(this.getAsset());
		pmuVoltageMeterEClass.getESuperTypes().add(this.getEndDeviceAsset());
		privateMeterVoltageEClass.getESuperTypes().add(this.getAsset());
		privateMeterVoltageEClass.getESuperTypes().add(this.getEndDeviceAsset());
		conductingEquipmentEClass.getESuperTypes().add(this.getPowerSystemResource());
		conformLoadEClass.getESuperTypes().add(this.getEnergyConsumer());
		conformLoadGroupEClass.getESuperTypes().add(this.getLoadGroup());
		nonConformLoadEClass.getESuperTypes().add(this.getEnergyConsumer());
		nonConformLoadGroupEClass.getESuperTypes().add(this.getLoadGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(pmuVoltageMeterEClass, PMUVoltageMeter.class, "PMUVoltageMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPMUVoltageMeter_MRID(), ecorePackage.getEString(), "mRID", null, 1, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageAMag(), ecorePackage.getEDouble(), "VoltageAMag", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageAAng(), ecorePackage.getEDouble(), "VoltageAAng", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageBMag(), ecorePackage.getEDouble(), "VoltageBMag", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageBAng(), ecorePackage.getEDouble(), "VoltageBAng", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageCMag(), ecorePackage.getEDouble(), "VoltageCMag", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageCAng(), ecorePackage.getEDouble(), "VoltageCAng", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageNeutMag(), ecorePackage.getEDouble(), "VoltageNeutMag", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageNeutAng(), ecorePackage.getEDouble(), "VoltageNeutAng", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageNetMag(), ecorePackage.getEDouble(), "VoltageNetMag", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageNetAng(), ecorePackage.getEDouble(), "VoltageNetAng", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageResMag(), ecorePackage.getEDouble(), "VoltageResMag", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPMUVoltageMeter_VoltageResAng(), ecorePackage.getEDouble(), "VoltageResAng", null, 0, 1, PMUVoltageMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateMeterVoltageEClass, PrivateMeterVoltage.class, "PrivateMeterVoltage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivateMeterVoltage_ID(), ecorePackage.getEString(), "ID", null, 0, 1, PrivateMeterVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateMeterVoltage_VoltageA(), ecorePackage.getEDouble(), "VoltageA", null, 0, 1, PrivateMeterVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateMeterVoltage_VoltageB(), ecorePackage.getEDouble(), "VoltageB", null, 0, 1, PrivateMeterVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateMeterVoltage_VoltageC(), ecorePackage.getEDouble(), "VoltageC", null, 0, 1, PrivateMeterVoltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsset_Location(), this.getLocation(), null, "Location", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Position(), this.getPositionPoint(), null, "Position", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_PowerSystemResources(), this.getPowerSystemResource(), null, "PowerSystemResources", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionPointEClass, PositionPoint.class, "PositionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionPoint_XPosition(), ecorePackage.getEString(), "xPosition", null, 1, 1, PositionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionPoint_YPosition(), ecorePackage.getEString(), "yPosition", null, 1, 1, PositionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionPoint_ZPosition(), ecorePackage.getEString(), "zPosition", null, 1, 1, PositionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerSystemResourceEClass, PowerSystemResource.class, "PowerSystemResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conductingEquipmentEClass, ConductingEquipment.class, "ConductingEquipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConductingEquipment_Terminals(), this.getTerminal(), null, "Terminals", null, 0, -1, ConductingEquipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminal_TieFlow(), this.getTieFlow(), null, "TieFlow", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tieFlowEClass, TieFlow.class, "TieFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTieFlow_ControlArea(), this.getControlArea(), null, "ControlArea", null, 0, 1, TieFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlAreaEClass, ControlArea.class, "ControlArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlArea_MRID(), ecorePackage.getEString(), "mRID", null, 1, 1, ControlArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endDeviceAssetEClass, EndDeviceAsset.class, "EndDeviceAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndDeviceAsset_ServiceDeliveryPoint(), this.getServiceDeliveryPoint(), null, "ServiceDeliveryPoint", null, 0, 1, EndDeviceAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDeliveryPointEClass, ServiceDeliveryPoint.class, "ServiceDeliveryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDeliveryPoint_EnergyConsumer(), this.getEnergyConsumer(), null, "EnergyConsumer", null, 0, 1, ServiceDeliveryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energyConsumerEClass, EnergyConsumer.class, "EnergyConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergyConsumer_MRID(), ecorePackage.getEString(), "mRID", null, 1, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conformLoadEClass, ConformLoad.class, "ConformLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConformLoad_LoadGroup(), this.getConformLoadGroup(), null, "LoadGroup", null, 0, 1, ConformLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conformLoadGroupEClass, ConformLoadGroup.class, "ConformLoadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadGroupEClass, LoadGroup.class, "LoadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadGroup_SubLoadArea(), this.getSubLoadArea(), null, "SubLoadArea", null, 0, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subLoadAreaEClass, SubLoadArea.class, "SubLoadArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubLoadArea_LoadArea(), this.getLoadArea(), null, "LoadArea", null, 0, 1, SubLoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadAreaEClass, LoadArea.class, "LoadArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadArea_ControlArea(), this.getControlArea(), null, "ControlArea", null, 0, 1, LoadArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonConformLoadEClass, NonConformLoad.class, "NonConformLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonConformLoad_LoadGroup(), this.getNonConformLoadGroup(), null, "LoadGroup", null, 0, 1, NonConformLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonConformLoadGroupEClass, NonConformLoadGroup.class, "NonConformLoadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// edu.kit.ipd.sdq.mdsd.mj.sourceModels
		createEduAnnotations();
		// edu.kit.ipd.sdq.mdsd.mj.traceModel
		createEdu_1Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.left
		createEdu_2Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.right
		createEdu_3Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.jointrace
		createEdu_4Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.createdBy
		createEdu_5Annotations();
		// http://iec.ch/TC57/2009/CIM-schema-cim14
		createCIMschemacim14Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace
		createEdu_6Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.attribute
		createEdu_7Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.context
		createEdu_8Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.oftype
		createEdu_9Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.reference
		createEdu_10Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.reftrace
		createEdu_11Annotations();
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.sourceModels</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEduAnnotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.sourceModels";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("/"),
			 URI.createURI(COSEMPackage.eNS_URI).appendFragment("/"),
			 URI.createURI(SubstationStandardPackage.eNS_URI).appendFragment("/")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.traceModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_1Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.traceModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("/")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.left</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_2Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.left";	
		addAnnotation
		  (pmuVoltageMeterEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/MeterAsset")
		   });	
		addAnnotation
		  (privateMeterVoltageEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/MeterAsset")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.right</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_3Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.right";	
		addAnnotation
		  (pmuVoltageMeterEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SubstationStandardPackage.eNS_URI).appendFragment("//LNNodes/LNGroupM/MMXU")
		   });	
		addAnnotation
		  (privateMeterVoltageEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(COSEMPackage.eNS_URI).appendFragment("//PhysicalDevice")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.jointrace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_4Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.jointrace";	
		addAnnotation
		  (pmuVoltageMeterEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//join_MeterAsset_MMXU_PMUVoltageMeter")
		   });	
		addAnnotation
		  (privateMeterVoltageEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//join_MeterAsset_PhysicalDevice_PrivateMeterVoltage")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.createdBy</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_5Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.createdBy";	
		addAnnotation
		  (pmuVoltageMeterEClass, 
		   source, 
		   new String[] {
			 "order", "1",
			 "operator", "thetajoin",
			 "condition", "CIM.IEC61968.Metering.MeterAsset = substationStandard.LNNodes.LNGroupM.MMXU.NamePlt.IdNs"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_MRID(), 
		   source, 
		   new String[] {
			 "operator", "keepattributes"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageAMag(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsA.cVal.mag.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageAAng(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsA.cVal.ang.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageBMag(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsB.cVal.mag.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageBAng(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsB.cVal.ang.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageCMag(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsC.cVal.mag.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageCAng(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.phsC.cVal.ang.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageNeutMag(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.neut.cVal.mag.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageNeutAng(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.neut.cVal.ang.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageNetMag(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.net.cVal.mag.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageNetAng(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.net.cVal.ang.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageResMag(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.res.cVal.mag.f"
		   });	
		addAnnotation
		  (getPMUVoltageMeter_VoltageResAng(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "substationStandard.LNNodes.LNGroupM.MMXU.PhV.res.cVal.ang.f"
		   });	
		addAnnotation
		  (privateMeterVoltageEClass, 
		   source, 
		   new String[] {
			 "order", "2",
			 "operator", "thetajoin",
			 "condition", "CIM.IEC61968.Metering.MeterAsset.mRID = COSEM.PhysicalDevice.ID"
		   });	
		addAnnotation
		  (getPrivateMeterVoltage_ID(), 
		   source, 
		   new String[] {
			 "operator", "keepattributes"
		   });	
		addAnnotation
		  (getPrivateMeterVoltage_VoltageA(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "COSEM.PhysicalDevice.ElectricityValues.VoltageL1"
		   });	
		addAnnotation
		  (getPrivateMeterVoltage_VoltageB(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "COSEM.PhysicalDevice.ElectricityValues.VoltageL2"
		   });	
		addAnnotation
		  (getPrivateMeterVoltage_VoltageC(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "COSEM.PhysicalDevice.ElectricityValues.VoltageL3"
		   });	
		addAnnotation
		  (assetEClass, 
		   source, 
		   new String[] {
			 "operator", "keepsupertype",
			 "order", "3"
		   });	
		addAnnotation
		  (getAsset_Location(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "4"
		   });	
		addAnnotation
		  (getLocation_Position(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (getLocation_PowerSystemResources(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (positionPointEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "5"
		   });	
		addAnnotation
		  (getPositionPoint_XPosition(), 
		   source, 
		   new String[] {
			 "operator", "keepattributes"
		   });	
		addAnnotation
		  (getPositionPoint_YPosition(), 
		   source, 
		   new String[] {
			 "operator", "keepattributes"
		   });	
		addAnnotation
		  (getPositionPoint_ZPosition(), 
		   source, 
		   new String[] {
			 "operator", "keepattributes"
		   });	
		addAnnotation
		  (powerSystemResourceEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "6"
		   });	
		addAnnotation
		  (conductingEquipmentEClass, 
		   source, 
		   new String[] {
			 "operator", "keepsubtype",
			 "order", "7"
		   });	
		addAnnotation
		  (getConductingEquipment_Terminals(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (terminalEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "8"
		   });	
		addAnnotation
		  (getTerminal_TieFlow(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (tieFlowEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "9"
		   });	
		addAnnotation
		  (getTieFlow_ControlArea(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (controlAreaEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "19"
		   });	
		addAnnotation
		  (getControlArea_MRID(), 
		   source, 
		   new String[] {
			 "operator", "keepattributes"
		   });	
		addAnnotation
		  (endDeviceAssetEClass, 
		   source, 
		   new String[] {
			 "operator", "keepsupertype",
			 "order", "11"
		   });	
		addAnnotation
		  (getEndDeviceAsset_ServiceDeliveryPoint(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (serviceDeliveryPointEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "12"
		   });	
		addAnnotation
		  (getServiceDeliveryPoint_EnergyConsumer(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (energyConsumerEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "13"
		   });	
		addAnnotation
		  (getEnergyConsumer_MRID(), 
		   source, 
		   new String[] {
			 "operator", "keepattributes"
		   });	
		addAnnotation
		  (conformLoadEClass, 
		   source, 
		   new String[] {
			 "operator", "keepsubtype",
			 "order", "14"
		   });	
		addAnnotation
		  (getConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (conformLoadGroupEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "15"
		   });	
		addAnnotation
		  (loadGroupEClass, 
		   source, 
		   new String[] {
			 "operator", "keepsupertype",
			 "order", "16"
		   });	
		addAnnotation
		  (loadGroupEClass, 
		   source, 
		   new String[] {
			 "operator", "keepsupertype",
			 "order", "22"
		   });	
		addAnnotation
		  (getLoadGroup_SubLoadArea(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (subLoadAreaEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "17"
		   });	
		addAnnotation
		  (getSubLoadArea_LoadArea(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (loadAreaEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "18"
		   });	
		addAnnotation
		  (getLoadArea_ControlArea(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (nonConformLoadEClass, 
		   source, 
		   new String[] {
			 "operator", "keepsubtype",
			 "order", "20"
		   });	
		addAnnotation
		  (getNonConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (nonConformLoadGroupEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "21"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://iec.ch/TC57/2009/CIM-schema-cim14</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCIMschemacim14Annotations() {
		String source = "http://iec.ch/TC57/2009/CIM-schema-cim14";	
		addAnnotation
		  (getPMUVoltageMeter_MRID(), 
		   source, 
		   new String[] {
			 "Documentation", "A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique."
		   });	
		addAnnotation
		  (getAsset_Location(), 
		   source, 
		   new String[] {
			 "Documentation", "Location of this asset."
		   });	
		addAnnotation
		  (getLocation_PowerSystemResources(), 
		   source, 
		   new String[] {
			 "Documentation", "All power system resources at this location."
		   });	
		addAnnotation
		  (getPositionPoint_XPosition(), 
		   source, 
		   new String[] {
			 "Documentation", "X axis position."
		   });	
		addAnnotation
		  (getPositionPoint_YPosition(), 
		   source, 
		   new String[] {
			 "Documentation", "Y axis position."
		   });	
		addAnnotation
		  (getPositionPoint_ZPosition(), 
		   source, 
		   new String[] {
			 "Documentation", "(if applicable) Z axis position."
		   });	
		addAnnotation
		  (getConductingEquipment_Terminals(), 
		   source, 
		   new String[] {
			 "Documentation", "ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes"
		   });	
		addAnnotation
		  (getTerminal_TieFlow(), 
		   source, 
		   new String[] {
			 "Documentation", "The control area tie flows to which this terminal associates."
		   });	
		addAnnotation
		  (getTieFlow_ControlArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The control area of the tie flows."
		   });	
		addAnnotation
		  (getControlArea_MRID(), 
		   source, 
		   new String[] {
			 "Documentation", "A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique."
		   });	
		addAnnotation
		  (getEndDeviceAsset_ServiceDeliveryPoint(), 
		   source, 
		   new String[] {
			 "Documentation", "Service delivery point to which this end device asset belongs."
		   });	
		addAnnotation
		  (getEnergyConsumer_MRID(), 
		   source, 
		   new String[] {
			 "Documentation", "A Model Authority issues mRIDs. Given that each Model Authority has a unique id and this id is part of the mRID, then the mRID is globally unique."
		   });	
		addAnnotation
		  (getConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
			 "Documentation", "Group of this ConformLoad."
		   });	
		addAnnotation
		  (getLoadGroup_SubLoadArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The SubLoadArea where the Loadgroup belongs."
		   });	
		addAnnotation
		  (getSubLoadArea_LoadArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The LoadArea where the SubLoadArea belongs."
		   });	
		addAnnotation
		  (getLoadArea_ControlArea(), 
		   source, 
		   new String[] {
			 "Documentation", "The control area specification that is used for the load forecast."
		   });	
		addAnnotation
		  (getNonConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
			 "Documentation", "Group of this ConformLoad."
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_6Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace";	
		addAnnotation
		  (getPMUVoltageMeter_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/MeterAsset")
		   });	
		addAnnotation
		  (getPrivateMeterVoltage_ID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(COSEMPackage.eNS_URI).appendFragment("//PhysicalDevice")
		   });	
		addAnnotation
		  (assetEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Assets/Asset")
		   });	
		addAnnotation
		  (getAsset_Location(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Assets/Asset")
		   });	
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/Location")
		   });	
		addAnnotation
		  (getLocation_Position(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/Location")
		   });	
		addAnnotation
		  (getLocation_PowerSystemResources(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/Location")
		   });	
		addAnnotation
		  (positionPointEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/PositionPoint")
		   });	
		addAnnotation
		  (getPositionPoint_XPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/PositionPoint")
		   });	
		addAnnotation
		  (getPositionPoint_YPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/PositionPoint")
		   });	
		addAnnotation
		  (getPositionPoint_ZPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/PositionPoint")
		   });	
		addAnnotation
		  (powerSystemResourceEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/PowerSystemResource")
		   });	
		addAnnotation
		  (conductingEquipmentEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/ConductingEquipment")
		   });	
		addAnnotation
		  (getConductingEquipment_Terminals(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/ConductingEquipment")
		   });	
		addAnnotation
		  (terminalEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/Terminal")
		   });	
		addAnnotation
		  (getTerminal_TieFlow(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/Terminal")
		   });	
		addAnnotation
		  (tieFlowEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/ControlArea/TieFlow")
		   });	
		addAnnotation
		  (getTieFlow_ControlArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/ControlArea/TieFlow")
		   });	
		addAnnotation
		  (controlAreaEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/ControlArea/ControlArea")
		   });	
		addAnnotation
		  (getControlArea_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/ControlArea/ControlArea")
		   });	
		addAnnotation
		  (endDeviceAssetEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/EndDeviceAsset")
		   });	
		addAnnotation
		  (getEndDeviceAsset_ServiceDeliveryPoint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/EndDeviceAsset")
		   });	
		addAnnotation
		  (serviceDeliveryPointEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/ServiceDeliveryPoint")
		   });	
		addAnnotation
		  (getServiceDeliveryPoint_EnergyConsumer(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/ServiceDeliveryPoint")
		   });	
		addAnnotation
		  (energyConsumerEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Wires/EnergyConsumer")
		   });	
		addAnnotation
		  (getEnergyConsumer_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Wires/EnergyConsumer")
		   });	
		addAnnotation
		  (conformLoadEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/ConformLoad")
		   });	
		addAnnotation
		  (getConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/ConformLoad")
		   });	
		addAnnotation
		  (conformLoadGroupEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/ConformLoadGroup")
		   });	
		addAnnotation
		  (loadGroupEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/LoadGroup")
		   });	
		addAnnotation
		  (getLoadGroup_SubLoadArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/LoadGroup")
		   });	
		addAnnotation
		  (subLoadAreaEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/SubLoadArea")
		   });	
		addAnnotation
		  (getSubLoadArea_LoadArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/SubLoadArea")
		   });	
		addAnnotation
		  (loadAreaEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/LoadArea")
		   });	
		addAnnotation
		  (getLoadArea_ControlArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/LoadArea")
		   });	
		addAnnotation
		  (nonConformLoadEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/NonConformLoad")
		   });	
		addAnnotation
		  (getNonConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/NonConformLoad")
		   });	
		addAnnotation
		  (nonConformLoadGroupEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/NonConformLoadGroup")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.attribute</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_7Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.attribute";	
		addAnnotation
		  (getPMUVoltageMeter_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/IdentifiedObject/mRID")
		   });	
		addAnnotation
		  (getPrivateMeterVoltage_ID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(COSEMPackage.eNS_URI).appendFragment("//PhysicalDevice/ID")
		   });	
		addAnnotation
		  (getPositionPoint_XPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/PositionPoint/xPosition")
		   });	
		addAnnotation
		  (getPositionPoint_YPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/PositionPoint/yPosition")
		   });	
		addAnnotation
		  (getPositionPoint_ZPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/PositionPoint/zPosition")
		   });	
		addAnnotation
		  (getControlArea_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/IdentifiedObject/mRID")
		   });	
		addAnnotation
		  (getEnergyConsumer_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/IdentifiedObject/mRID")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.context</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_8Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.context";	
		addAnnotation
		  (getPMUVoltageMeter_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PMUVoltageMeter")
		   });	
		addAnnotation
		  (getPrivateMeterVoltage_ID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PrivateMeterVoltage")
		   });	
		addAnnotation
		  (getPositionPoint_XPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PositionPoint")
		   });	
		addAnnotation
		  (getPositionPoint_YPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PositionPoint")
		   });	
		addAnnotation
		  (getPositionPoint_ZPosition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PositionPoint")
		   });	
		addAnnotation
		  (getControlArea_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ControlArea")
		   });	
		addAnnotation
		  (getEnergyConsumer_MRID(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//EnergyConsumer")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.oftype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_9Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.oftype";	
		addAnnotation
		  (getAsset_Location(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/Location")
		   });	
		addAnnotation
		  (getLocation_Position(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/PositionPoint")
		   });	
		addAnnotation
		  (getLocation_PowerSystemResources(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/PowerSystemResource")
		   });	
		addAnnotation
		  (getConductingEquipment_Terminals(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/Terminal")
		   });	
		addAnnotation
		  (getTerminal_TieFlow(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/ControlArea/TieFlow")
		   });	
		addAnnotation
		  (getTieFlow_ControlArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/ControlArea/ControlArea")
		   });	
		addAnnotation
		  (getEndDeviceAsset_ServiceDeliveryPoint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/ServiceDeliveryPoint")
		   });	
		addAnnotation
		  (getServiceDeliveryPoint_EnergyConsumer(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Wires/EnergyConsumer")
		   });	
		addAnnotation
		  (getConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/ConformLoadGroup")
		   });	
		addAnnotation
		  (getLoadGroup_SubLoadArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/SubLoadArea")
		   });	
		addAnnotation
		  (getSubLoadArea_LoadArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/LoadArea")
		   });	
		addAnnotation
		  (getLoadArea_ControlArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/ControlArea/ControlArea")
		   });	
		addAnnotation
		  (getNonConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/NonConformLoadGroup")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.reference</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_10Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.reference";	
		addAnnotation
		  (getAsset_Location(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Assets/Asset/Location")
		   });	
		addAnnotation
		  (getLocation_Position(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/Location/Position")
		   });	
		addAnnotation
		  (getLocation_PowerSystemResources(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Common/Location/PowerSystemResources")
		   });	
		addAnnotation
		  (getConductingEquipment_Terminals(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/ConductingEquipment/Terminals")
		   });	
		addAnnotation
		  (getTerminal_TieFlow(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/Core/Terminal/TieFlow")
		   });	
		addAnnotation
		  (getTieFlow_ControlArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/ControlArea/TieFlow/ControlArea")
		   });	
		addAnnotation
		  (getEndDeviceAsset_ServiceDeliveryPoint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/EndDeviceAsset/ServiceDeliveryPoint")
		   });	
		addAnnotation
		  (getServiceDeliveryPoint_EnergyConsumer(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/ServiceDeliveryPoint/EnergyConsumer")
		   });	
		addAnnotation
		  (getConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/ConformLoad/LoadGroup")
		   });	
		addAnnotation
		  (getLoadGroup_SubLoadArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/LoadGroup/SubLoadArea")
		   });	
		addAnnotation
		  (getSubLoadArea_LoadArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/SubLoadArea/LoadArea")
		   });	
		addAnnotation
		  (getLoadArea_ControlArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/EnergyArea/ControlArea")
		   });	
		addAnnotation
		  (getNonConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61970/LoadModel/NonConformLoad/LoadGroup")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.reftrace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_11Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.reftrace";	
		addAnnotation
		  (getAsset_Location(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_Location_Location_Location")
		   });	
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_Location_Location_Location")
		   });	
		addAnnotation
		  (getLocation_Position(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_PositionPoint_PositionPoint_Position")
		   });	
		addAnnotation
		  (getLocation_PowerSystemResources(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_PowerSystemResource_PowerSystemResource_PowerSystemResources")
		   });	
		addAnnotation
		  (positionPointEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_PositionPoint_PositionPoint_Position")
		   });	
		addAnnotation
		  (powerSystemResourceEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_PowerSystemResource_PowerSystemResource_PowerSystemResources")
		   });	
		addAnnotation
		  (getConductingEquipment_Terminals(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_Terminal_Terminal_Terminals")
		   });	
		addAnnotation
		  (terminalEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_Terminal_Terminal_Terminals")
		   });	
		addAnnotation
		  (getTerminal_TieFlow(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_TieFlow_TieFlow_TieFlow")
		   });	
		addAnnotation
		  (tieFlowEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_TieFlow_TieFlow_TieFlow")
		   });	
		addAnnotation
		  (getTieFlow_ControlArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_ControlArea_ControlArea_ControlArea")
		   });	
		addAnnotation
		  (controlAreaEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_ControlArea_ControlArea_ControlArea")
		   });	
		addAnnotation
		  (controlAreaEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEndDeviceAsset_ServiceDeliveryPoint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint")
		   });	
		addAnnotation
		  (serviceDeliveryPointEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint")
		   });	
		addAnnotation
		  (getServiceDeliveryPoint_EnergyConsumer(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_EnergyConsumer_EnergyConsumer_EnergyConsumer")
		   });	
		addAnnotation
		  (energyConsumerEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_EnergyConsumer_EnergyConsumer_EnergyConsumer")
		   });	
		addAnnotation
		  (getConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_ConformLoadGroup_ConformLoadGroup_LoadGroup")
		   });	
		addAnnotation
		  (conformLoadGroupEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_ConformLoadGroup_ConformLoadGroup_LoadGroup")
		   });	
		addAnnotation
		  (getLoadGroup_SubLoadArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_SubLoadArea_SubLoadArea_SubLoadArea")
		   });	
		addAnnotation
		  (subLoadAreaEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_SubLoadArea_SubLoadArea_SubLoadArea")
		   });	
		addAnnotation
		  (getSubLoadArea_LoadArea(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_LoadArea_LoadArea_LoadArea")
		   });	
		addAnnotation
		  (loadAreaEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_LoadArea_LoadArea_LoadArea")
		   });	
		addAnnotation
		  (getLoadArea_ControlArea(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNonConformLoad_LoadGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup")
		   });	
		addAnnotation
		  (nonConformLoadGroupEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutagePreventionMjtracePackage.eNS_URI).appendFragment("//ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup")
		   });
	}

} //OutagePreventionJointargetPackageImpl
