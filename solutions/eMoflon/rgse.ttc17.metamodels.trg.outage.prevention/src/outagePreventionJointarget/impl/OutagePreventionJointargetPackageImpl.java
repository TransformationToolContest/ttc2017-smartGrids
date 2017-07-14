/**
 */
package outagePreventionJointarget.impl;

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

		// Create package meta-data objects
		theOutagePreventionJointargetPackage.createPackageContents();

		// Initialize created meta-data
		theOutagePreventionJointargetPackage.initializePackageContents();

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
	}

} //OutagePreventionJointargetPackageImpl
