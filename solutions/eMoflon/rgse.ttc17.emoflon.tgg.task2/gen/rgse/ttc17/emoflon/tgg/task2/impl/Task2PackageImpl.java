/**
 */
package rgse.ttc17.emoflon.tgg.task2.impl;

import gluemodel.GluemodelPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.moflon.tgg.language.LanguagePackage;

import outagePreventionJointarget.OutagePreventionJointargetPackage;

import rgse.ttc17.emoflon.tgg.task2.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task2.Rules.impl.RulesPackageImpl;

import rgse.ttc17.emoflon.tgg.task2.Task2Factory;
import rgse.ttc17.emoflon.tgg.task2.Task2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Task2PackageImpl extends EPackageImpl implements Task2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "task2.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlAreaToControlSreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDeliveryPointToServiceDeliveryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSystemResourceToPowerSystemResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalDeviceToPrivateMeterVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationToLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumerToEnergyConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterAssetToPrivateMeterVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterAssetToMMXUToVoltageMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmxuToPMUVoltageMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadGroupToConformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subLoadAreaToSubLoadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadAreaToLoadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterAssetToPMUVoltageMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionPointToPositionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadGroupNonToConformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalToTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tieFlowToTieFlowEClass = null;

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
	 * @see rgse.ttc17.emoflon.tgg.task2.Task2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Task2PackageImpl() {
		super(eNS_URI, Task2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Task2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Task2Package init() {
		if (isInited)
			return (Task2Package) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI);

		// Obtain or create and register package
		Task2PackageImpl theTask2Package = (Task2PackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Task2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Task2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OutagePreventionJointargetPackage.eINSTANCE.eClass();
		GluemodelPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theTask2Package.loadPackage();

		// Fix loaded packages
		theTask2Package.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theTask2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Task2Package.eNS_URI, theTask2Package);
		return theTask2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlAreaToControlSrea() {
		if (controlAreaToControlSreaEClass == null) {
			controlAreaToControlSreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(0);
		}
		return controlAreaToControlSreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlAreaToControlSrea_Source() {
		return (EReference) getControlAreaToControlSrea().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlAreaToControlSrea_Target() {
		return (EReference) getControlAreaToControlSrea().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDeliveryPointToServiceDeliveryPoint() {
		if (serviceDeliveryPointToServiceDeliveryPointEClass == null) {
			serviceDeliveryPointToServiceDeliveryPointEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Task2Package.eNS_URI).getEClassifiers().get(1);
		}
		return serviceDeliveryPointToServiceDeliveryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPointToServiceDeliveryPoint_Source() {
		return (EReference) getServiceDeliveryPointToServiceDeliveryPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDeliveryPointToServiceDeliveryPoint_Target() {
		return (EReference) getServiceDeliveryPointToServiceDeliveryPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSystemResourceToPowerSystemResource() {
		if (powerSystemResourceToPowerSystemResourceEClass == null) {
			powerSystemResourceToPowerSystemResourceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Task2Package.eNS_URI).getEClassifiers().get(2);
		}
		return powerSystemResourceToPowerSystemResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSystemResourceToPowerSystemResource_Source() {
		return (EReference) getPowerSystemResourceToPowerSystemResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSystemResourceToPowerSystemResource_Target() {
		return (EReference) getPowerSystemResourceToPowerSystemResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalDeviceToPrivateMeterVoltage() {
		if (physicalDeviceToPrivateMeterVoltageEClass == null) {
			physicalDeviceToPrivateMeterVoltageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Task2Package.eNS_URI).getEClassifiers().get(3);
		}
		return physicalDeviceToPrivateMeterVoltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDeviceToPrivateMeterVoltage_Source() {
		return (EReference) getPhysicalDeviceToPrivateMeterVoltage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDeviceToPrivateMeterVoltage_Target() {
		return (EReference) getPhysicalDeviceToPrivateMeterVoltage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationToLocation() {
		if (locationToLocationEClass == null) {
			locationToLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(4);
		}
		return locationToLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationToLocation_Source() {
		return (EReference) getLocationToLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationToLocation_Target() {
		return (EReference) getLocationToLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyConsumerToEnergyConsumer() {
		if (energyConsumerToEnergyConsumerEClass == null) {
			energyConsumerToEnergyConsumerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(5);
		}
		return energyConsumerToEnergyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyConsumerToEnergyConsumer_Source() {
		return (EReference) getEnergyConsumerToEnergyConsumer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyConsumerToEnergyConsumer_Target() {
		return (EReference) getEnergyConsumerToEnergyConsumer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeterAssetToPrivateMeterVoltage() {
		if (meterAssetToPrivateMeterVoltageEClass == null) {
			meterAssetToPrivateMeterVoltageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Task2Package.eNS_URI).getEClassifiers().get(6);
		}
		return meterAssetToPrivateMeterVoltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAssetToPrivateMeterVoltage_Source() {
		return (EReference) getMeterAssetToPrivateMeterVoltage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAssetToPrivateMeterVoltage_Target() {
		return (EReference) getMeterAssetToPrivateMeterVoltage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeterAssetToMMXUToVoltageMeter() {
		if (meterAssetToMMXUToVoltageMeterEClass == null) {
			meterAssetToMMXUToVoltageMeterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(7);
		}
		return meterAssetToMMXUToVoltageMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAssetToMMXUToVoltageMeter_Source() {
		return (EReference) getMeterAssetToMMXUToVoltageMeter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAssetToMMXUToVoltageMeter_Target() {
		return (EReference) getMeterAssetToMMXUToVoltageMeter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMXUToPMUVoltageMeter() {
		if (mmxuToPMUVoltageMeterEClass == null) {
			mmxuToPMUVoltageMeterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(8);
		}
		return mmxuToPMUVoltageMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXUToPMUVoltageMeter_Source() {
		return (EReference) getMMXUToPMUVoltageMeter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMXUToPMUVoltageMeter_Target() {
		return (EReference) getMMXUToPMUVoltageMeter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformLoadGroupToConformLoadGroup() {
		if (conformLoadGroupToConformLoadGroupEClass == null) {
			conformLoadGroupToConformLoadGroupEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Task2Package.eNS_URI).getEClassifiers().get(9);
		}
		return conformLoadGroupToConformLoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformLoadGroupToConformLoadGroup_Source() {
		return (EReference) getConformLoadGroupToConformLoadGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformLoadGroupToConformLoadGroup_Target() {
		return (EReference) getConformLoadGroupToConformLoadGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubLoadAreaToSubLoadArea() {
		if (subLoadAreaToSubLoadAreaEClass == null) {
			subLoadAreaToSubLoadAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(10);
		}
		return subLoadAreaToSubLoadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubLoadAreaToSubLoadArea_Source() {
		return (EReference) getSubLoadAreaToSubLoadArea().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubLoadAreaToSubLoadArea_Target() {
		return (EReference) getSubLoadAreaToSubLoadArea().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadAreaToLoadArea() {
		if (loadAreaToLoadAreaEClass == null) {
			loadAreaToLoadAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(11);
		}
		return loadAreaToLoadAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadAreaToLoadArea_Source() {
		return (EReference) getLoadAreaToLoadArea().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadAreaToLoadArea_Target() {
		return (EReference) getLoadAreaToLoadArea().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeterAssetToPMUVoltageMeter() {
		if (meterAssetToPMUVoltageMeterEClass == null) {
			meterAssetToPMUVoltageMeterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(12);
		}
		return meterAssetToPMUVoltageMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAssetToPMUVoltageMeter_Source() {
		return (EReference) getMeterAssetToPMUVoltageMeter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAssetToPMUVoltageMeter_Target() {
		return (EReference) getMeterAssetToPMUVoltageMeter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionPointToPositionPoint() {
		if (positionPointToPositionPointEClass == null) {
			positionPointToPositionPointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(13);
		}
		return positionPointToPositionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionPointToPositionPoint_Source() {
		return (EReference) getPositionPointToPositionPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionPointToPositionPoint_Target() {
		return (EReference) getPositionPointToPositionPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConformLoadGroupNonToConformLoadGroup() {
		if (nonConformLoadGroupNonToConformLoadGroupEClass == null) {
			nonConformLoadGroupNonToConformLoadGroupEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(Task2Package.eNS_URI).getEClassifiers().get(14);
		}
		return nonConformLoadGroupNonToConformLoadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonConformLoadGroupNonToConformLoadGroup_Source() {
		return (EReference) getNonConformLoadGroupNonToConformLoadGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonConformLoadGroupNonToConformLoadGroup_Target() {
		return (EReference) getNonConformLoadGroupNonToConformLoadGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalToTerminal() {
		if (terminalToTerminalEClass == null) {
			terminalToTerminalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(15);
		}
		return terminalToTerminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminalToTerminal_Source() {
		return (EReference) getTerminalToTerminal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminalToTerminal_Target() {
		return (EReference) getTerminalToTerminal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTieFlowToTieFlow() {
		if (tieFlowToTieFlowEClass == null) {
			tieFlowToTieFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task2Package.eNS_URI)
					.getEClassifiers().get(16);
		}
		return tieFlowToTieFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTieFlowToTieFlow_Source() {
		return (EReference) getTieFlowToTieFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTieFlowToTieFlow_Target() {
		return (EReference) getTieFlowToTieFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2Factory getTask2Factory() {
		return (Task2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("rgse.ttc17.emoflon.tgg.task2." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Task2PackageImpl
