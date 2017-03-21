/**
 */
package outageDetectionJointarget.impl;

import CIM.CIMPackage;

import COSEM.COSEMPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import outageDetectionJointarget.EnergyConsumer;
import outageDetectionJointarget.Location;
import outageDetectionJointarget.OutageDetectionJointargetFactory;
import outageDetectionJointarget.OutageDetectionJointargetPackage;
import outageDetectionJointarget.PositionPoint;

import outageDetectionMjtrace.OutageDetectionMjtracePackage;

import outageDetectionMjtrace.impl.OutageDetectionMjtracePackageImpl;

import substationStandard.SubstationStandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutageDetectionJointargetPackageImpl extends EPackageImpl implements OutageDetectionJointargetPackage {
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
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionPointEClass = null;

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
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OutageDetectionJointargetPackageImpl() {
		super(eNS_URI, OutageDetectionJointargetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OutageDetectionJointargetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OutageDetectionJointargetPackage init() {
		if (isInited) return (OutageDetectionJointargetPackage)EPackage.Registry.INSTANCE.getEPackage(OutageDetectionJointargetPackage.eNS_URI);

		// Obtain or create and register package
		OutageDetectionJointargetPackageImpl theOutageDetectionJointargetPackage = (OutageDetectionJointargetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OutageDetectionJointargetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OutageDetectionJointargetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SubstationStandardPackage.eINSTANCE.eClass();
		COSEMPackage.eINSTANCE.eClass();
		CIMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OutageDetectionMjtracePackageImpl theOutageDetectionMjtracePackage = (OutageDetectionMjtracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OutageDetectionMjtracePackage.eNS_URI) instanceof OutageDetectionMjtracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OutageDetectionMjtracePackage.eNS_URI) : OutageDetectionMjtracePackage.eINSTANCE);

		// Create package meta-data objects
		theOutageDetectionJointargetPackage.createPackageContents();
		theOutageDetectionMjtracePackage.createPackageContents();

		// Initialize created meta-data
		theOutageDetectionJointargetPackage.initializePackageContents();
		theOutageDetectionMjtracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOutageDetectionJointargetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OutageDetectionJointargetPackage.eNS_URI, theOutageDetectionJointargetPackage);
		return theOutageDetectionJointargetPackage;
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
	public EReference getEnergyConsumer_Location() {
		return (EReference)energyConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_Reachability() {
		return (EAttribute)energyConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_PowerA() {
		return (EAttribute)energyConsumerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyConsumer_ID() {
		return (EAttribute)energyConsumerEClass.getEStructuralFeatures().get(3);
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
	public OutageDetectionJointargetFactory getOutageDetectionJointargetFactory() {
		return (OutageDetectionJointargetFactory)getEFactoryInstance();
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
		energyConsumerEClass = createEClass(ENERGY_CONSUMER);
		createEReference(energyConsumerEClass, ENERGY_CONSUMER__LOCATION);
		createEAttribute(energyConsumerEClass, ENERGY_CONSUMER__REACHABILITY);
		createEAttribute(energyConsumerEClass, ENERGY_CONSUMER__POWER_A);
		createEAttribute(energyConsumerEClass, ENERGY_CONSUMER__ID);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__POSITION);

		positionPointEClass = createEClass(POSITION_POINT);
		createEAttribute(positionPointEClass, POSITION_POINT__XPOSITION);
		createEAttribute(positionPointEClass, POSITION_POINT__YPOSITION);
		createEAttribute(positionPointEClass, POSITION_POINT__ZPOSITION);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(energyConsumerEClass, EnergyConsumer.class, "EnergyConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnergyConsumer_Location(), this.getLocation(), null, "Location", null, 0, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_Reachability(), ecorePackage.getEInt(), "Reachability", null, 0, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_PowerA(), ecorePackage.getEDouble(), "PowerA", null, 0, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyConsumer_ID(), ecorePackage.getEString(), "ID", null, 0, 1, EnergyConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Position(), this.getPositionPoint(), null, "Position", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionPointEClass, PositionPoint.class, "PositionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionPoint_XPosition(), ecorePackage.getEString(), "xPosition", null, 1, 1, PositionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionPoint_YPosition(), ecorePackage.getEString(), "yPosition", null, 1, 1, PositionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionPoint_ZPosition(), ecorePackage.getEString(), "zPosition", null, 1, 1, PositionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.oftype
		createEdu_6Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.reference
		createEdu_7Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace
		createEdu_8Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.reftrace
		createEdu_9Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.attribute
		createEdu_10Annotations();
		// edu.kit.ipd.sdq.mdsd.mj.classTrace.context
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
			 URI.createURI(OutageDetectionMjtracePackage.eNS_URI).appendFragment("/")
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
		  (energyConsumerEClass, 
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
		  (energyConsumerEClass, 
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
		  (energyConsumerEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutageDetectionMjtracePackage.eNS_URI).appendFragment("//join_MeterAsset_PhysicalDevice_EnergyConsumer")
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
		  (energyConsumerEClass, 
		   source, 
		   new String[] {
			 "order", "1",
			 "operator", "thetajoin",
			 "condition", "CIM.IEC61968.Metering.MeterAsset.mRID = COSEM.PhysicalDevice.ID"
		   });	
		addAnnotation
		  (getEnergyConsumer_Location(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (getEnergyConsumer_Reachability(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "COSEM.PhysicalDevice.AutoConnect.Connection"
		   });	
		addAnnotation
		  (getEnergyConsumer_PowerA(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "COSEM.PhysicalDevice.ElectricityValues.ApparentPowermL1"
		   });	
		addAnnotation
		  (getEnergyConsumer_ID(), 
		   source, 
		   new String[] {
			 "operator", "keepcalculated",
			 "formula", "CIM.IEC61968.Metering.MeterAsset.ServiceDeliveryPoint.EnergyConsumer.mRID"
		   });	
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "2"
		   });	
		addAnnotation
		  (getLocation_Position(), 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing"
		   });	
		addAnnotation
		  (positionPointEClass, 
		   source, 
		   new String[] {
			 "operator", "keepoutgoing",
			 "order", "3"
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
		  (getEnergyConsumer_Location(), 
		   source, 
		   new String[] {
			 "Documentation", "Location of this asset."
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
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.oftype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_6Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.oftype";	
		addAnnotation
		  (getEnergyConsumer_Location(), 
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
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.reference</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_7Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.reference";	
		addAnnotation
		  (getEnergyConsumer_Location(), 
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
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_8Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace";	
		addAnnotation
		  (getEnergyConsumer_Location(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CIMPackage.eNS_URI).appendFragment("//IEC61968/Metering/MeterAsset")
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
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.reftrace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_9Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.reftrace";	
		addAnnotation
		  (getEnergyConsumer_Location(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutageDetectionMjtracePackage.eNS_URI).appendFragment("//ref_Location_Location_Location")
		   });	
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutageDetectionMjtracePackage.eNS_URI).appendFragment("//ref_Location_Location_Location")
		   });	
		addAnnotation
		  (getLocation_Position(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutageDetectionMjtracePackage.eNS_URI).appendFragment("//ref_PositionPoint_PositionPoint_Position")
		   });	
		addAnnotation
		  (positionPointEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(OutageDetectionMjtracePackage.eNS_URI).appendFragment("//ref_PositionPoint_PositionPoint_Position")
		   });
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.attribute</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_10Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.attribute";	
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
	}

	/**
	 * Initializes the annotations for <b>edu.kit.ipd.sdq.mdsd.mj.classTrace.context</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdu_11Annotations() {
		String source = "edu.kit.ipd.sdq.mdsd.mj.classTrace.context";	
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
	}

} //OutageDetectionJointargetPackageImpl
