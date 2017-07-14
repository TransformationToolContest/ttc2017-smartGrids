/**
 */
package rgse.ttc17.emoflon.tgg.task1.impl;

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

import outageDetectionJointarget.OutageDetectionJointargetPackage;

import rgse.ttc17.emoflon.tgg.task1.Rules.RulesPackage;

import rgse.ttc17.emoflon.tgg.task1.Rules.impl.RulesPackageImpl;

import rgse.ttc17.emoflon.tgg.task1.Task1Factory;
import rgse.ttc17.emoflon.tgg.task1.Task1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Task1PackageImpl extends EPackageImpl implements Task1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "task1.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlAreaToEnergyConsumerEClass = null;

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
	private EClass physicalDeviceToEnergyConsumerEClass = null;

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
	private EClass meterAssetToEnergyConsumerEClass = null;

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
	 * @see rgse.ttc17.emoflon.tgg.task1.Task1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Task1PackageImpl() {
		super(eNS_URI, Task1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Task1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Task1Package init() {
		if (isInited)
			return (Task1Package) EPackage.Registry.INSTANCE.getEPackage(Task1Package.eNS_URI);

		// Obtain or create and register package
		Task1PackageImpl theTask1Package = (Task1PackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Task1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Task1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OutageDetectionJointargetPackage.eINSTANCE.eClass();
		GluemodelPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theTask1Package.loadPackage();

		// Fix loaded packages
		theTask1Package.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theTask1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Task1Package.eNS_URI, theTask1Package);
		return theTask1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlAreaToEnergyConsumer() {
		if (controlAreaToEnergyConsumerEClass == null) {
			controlAreaToEnergyConsumerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task1Package.eNS_URI)
					.getEClassifiers().get(0);
		}
		return controlAreaToEnergyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlAreaToEnergyConsumer_Source() {
		return (EReference) getControlAreaToEnergyConsumer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlAreaToEnergyConsumer_Target() {
		return (EReference) getControlAreaToEnergyConsumer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationToLocation() {
		if (locationToLocationEClass == null) {
			locationToLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task1Package.eNS_URI)
					.getEClassifiers().get(1);
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
	public EClass getPhysicalDeviceToEnergyConsumer() {
		if (physicalDeviceToEnergyConsumerEClass == null) {
			physicalDeviceToEnergyConsumerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task1Package.eNS_URI)
					.getEClassifiers().get(2);
		}
		return physicalDeviceToEnergyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDeviceToEnergyConsumer_Source() {
		return (EReference) getPhysicalDeviceToEnergyConsumer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDeviceToEnergyConsumer_Target() {
		return (EReference) getPhysicalDeviceToEnergyConsumer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionPointToPositionPoint() {
		if (positionPointToPositionPointEClass == null) {
			positionPointToPositionPointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task1Package.eNS_URI)
					.getEClassifiers().get(3);
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
	public EClass getMeterAssetToEnergyConsumer() {
		if (meterAssetToEnergyConsumerEClass == null) {
			meterAssetToEnergyConsumerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Task1Package.eNS_URI)
					.getEClassifiers().get(4);
		}
		return meterAssetToEnergyConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAssetToEnergyConsumer_Source() {
		return (EReference) getMeterAssetToEnergyConsumer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeterAssetToEnergyConsumer_Target() {
		return (EReference) getMeterAssetToEnergyConsumer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task1Factory getTask1Factory() {
		return (Task1Factory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("rgse.ttc17.emoflon.tgg.task1." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Task1PackageImpl
