/**
 */
package outageDetectionMjtrace.impl;

import CIM.CIMPackage;

import CIM.IEC61968.Common.CommonPackage;

import CIM.IEC61968.Metering.MeteringPackage;

import COSEM.COSEMPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import outageDetectionJointarget.OutageDetectionJointargetPackage;

import outageDetectionJointarget.impl.OutageDetectionJointargetPackageImpl;

import outageDetectionMjtrace.OutageDetectionMjtraceFactory;
import outageDetectionMjtrace.OutageDetectionMjtracePackage;
import outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer;
import outageDetectionMjtrace.ref_Location_Location_Location;
import outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position;

import substationStandard.SubstationStandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutageDetectionMjtracePackageImpl extends EPackageImpl implements OutageDetectionMjtracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass join_MeterAsset_PhysicalDevice_EnergyConsumerEClass = null;

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
	 * @see outageDetectionMjtrace.OutageDetectionMjtracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OutageDetectionMjtracePackageImpl() {
		super(eNS_URI, OutageDetectionMjtraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OutageDetectionMjtracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OutageDetectionMjtracePackage init() {
		if (isInited) return (OutageDetectionMjtracePackage)EPackage.Registry.INSTANCE.getEPackage(OutageDetectionMjtracePackage.eNS_URI);

		// Obtain or create and register package
		OutageDetectionMjtracePackageImpl theOutageDetectionMjtracePackage = (OutageDetectionMjtracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OutageDetectionMjtracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OutageDetectionMjtracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SubstationStandardPackage.eINSTANCE.eClass();
		COSEMPackage.eINSTANCE.eClass();
		CIMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OutageDetectionJointargetPackageImpl theOutageDetectionJointargetPackage = (OutageDetectionJointargetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutageDetectionJointargetPackage.eNS_URI) instanceof OutageDetectionJointargetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutageDetectionJointargetPackage.eNS_URI) : OutageDetectionJointargetPackage.eINSTANCE);

		// Create package meta-data objects
		theOutageDetectionMjtracePackage.createPackageContents();
		theOutageDetectionJointargetPackage.createPackageContents();

		// Initialize created meta-data
		theOutageDetectionMjtracePackage.initializePackageContents();
		theOutageDetectionJointargetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOutageDetectionMjtracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OutageDetectionMjtracePackage.eNS_URI, theOutageDetectionMjtracePackage);
		return theOutageDetectionMjtracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjoin_MeterAsset_PhysicalDevice_EnergyConsumer() {
		return join_MeterAsset_PhysicalDevice_EnergyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Left() {
		return (EReference)join_MeterAsset_PhysicalDevice_EnergyConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Right() {
		return (EReference)join_MeterAsset_PhysicalDevice_EnergyConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Target() {
		return (EReference)join_MeterAsset_PhysicalDevice_EnergyConsumerEClass.getEStructuralFeatures().get(2);
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
	public OutageDetectionMjtraceFactory getOutageDetectionMjtraceFactory() {
		return (OutageDetectionMjtraceFactory)getEFactoryInstance();
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
		join_MeterAsset_PhysicalDevice_EnergyConsumerEClass = createEClass(JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER);
		createEReference(join_MeterAsset_PhysicalDevice_EnergyConsumerEClass, JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT);
		createEReference(join_MeterAsset_PhysicalDevice_EnergyConsumerEClass, JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT);
		createEReference(join_MeterAsset_PhysicalDevice_EnergyConsumerEClass, JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET);

		ref_Location_Location_LocationEClass = createEClass(REF_LOCATION_LOCATION_LOCATION);
		createEReference(ref_Location_Location_LocationEClass, REF_LOCATION_LOCATION_LOCATION__SOURCE);
		createEReference(ref_Location_Location_LocationEClass, REF_LOCATION_LOCATION_LOCATION__TARGET);

		ref_PositionPoint_PositionPoint_PositionEClass = createEClass(REF_POSITION_POINT_POSITION_POINT_POSITION);
		createEReference(ref_PositionPoint_PositionPoint_PositionEClass, REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE);
		createEReference(ref_PositionPoint_PositionPoint_PositionEClass, REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET);
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
		COSEMPackage theCOSEMPackage = (COSEMPackage)EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI);
		OutageDetectionJointargetPackage theOutageDetectionJointargetPackage = (OutageDetectionJointargetPackage)EPackage.Registry.INSTANCE.getEPackage(OutageDetectionJointargetPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(join_MeterAsset_PhysicalDevice_EnergyConsumerEClass, join_MeterAsset_PhysicalDevice_EnergyConsumer.class, "join_MeterAsset_PhysicalDevice_EnergyConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Left(), theMeteringPackage.getMeterAsset(), null, "left", null, 0, 1, join_MeterAsset_PhysicalDevice_EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Right(), theCOSEMPackage.getPhysicalDevice(), null, "right", null, 0, 1, join_MeterAsset_PhysicalDevice_EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Target(), theOutageDetectionJointargetPackage.getEnergyConsumer(), null, "target", null, 0, 1, join_MeterAsset_PhysicalDevice_EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_Location_Location_LocationEClass, ref_Location_Location_Location.class, "ref_Location_Location_Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_Location_Location_Location_Source(), theCommonPackage.getLocation(), null, "source", null, 0, 1, ref_Location_Location_Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_Location_Location_Location_Target(), theOutageDetectionJointargetPackage.getLocation(), null, "target", null, 0, 1, ref_Location_Location_Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ref_PositionPoint_PositionPoint_PositionEClass, ref_PositionPoint_PositionPoint_Position.class, "ref_PositionPoint_PositionPoint_Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getref_PositionPoint_PositionPoint_Position_Source(), theCommonPackage.getPositionPoint(), null, "source", null, 0, 1, ref_PositionPoint_PositionPoint_Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getref_PositionPoint_PositionPoint_Position_Target(), theOutageDetectionJointargetPackage.getPositionPoint(), null, "target", null, 0, 1, ref_PositionPoint_PositionPoint_Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OutageDetectionMjtracePackageImpl
