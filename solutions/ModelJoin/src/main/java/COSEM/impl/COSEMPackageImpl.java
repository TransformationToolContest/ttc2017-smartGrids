/**
 */
package COSEM.impl;

import COSEM.COSEMFactory;

import COSEM.COSEMObjects.COSEMObjectsPackage;

import COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl;

import COSEM.COSEMPackage;

import COSEM.Datatypes.DatatypesPackage;

import COSEM.Datatypes.impl.DatatypesPackageImpl;

import COSEM.InterfaceClasses.InterfaceClassesPackage;

import COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class COSEMPackageImpl extends EPackageImpl implements COSEMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "COSEM.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementLogicalDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalDeviceNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cosemRootEClass = null;

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
	 * @see COSEM.COSEMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private COSEMPackageImpl() {
		super(eNS_URI, COSEMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link COSEMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static COSEMPackage init() {
		if (isInited) return (COSEMPackage)EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI);

		// Obtain or create and register package
		COSEMPackageImpl theCOSEMPackage = (COSEMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof COSEMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new COSEMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		InterfaceClassesPackageImpl theInterfaceClassesPackage = (InterfaceClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI) instanceof InterfaceClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI) : InterfaceClassesPackage.eINSTANCE);
		COSEMObjectsPackageImpl theCOSEMObjectsPackage = (COSEMObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI) instanceof COSEMObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI) : COSEMObjectsPackage.eINSTANCE);

		// Load packages
		theCOSEMPackage.loadPackage();

		// Fix loaded packages
		theCOSEMPackage.fixPackageContents();
		theDatatypesPackage.fixPackageContents();
		theInterfaceClassesPackage.fixPackageContents();
		theCOSEMObjectsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theCOSEMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(COSEMPackage.eNS_URI, theCOSEMPackage);
		return theCOSEMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalDevice() {
		if (logicalDeviceEClass == null) {
			logicalDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI).getEClassifiers().get(0);
		}
		return logicalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_AA() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_Name() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_AutoConnect() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_BillingPeriodValues() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_ElectricityID() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_ProgramEntries() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_OutputPulse() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_ReadingFactor() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_NominalValues() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_InputPulse() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_MeasurementPeriod() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_TimeEntries() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_TransformerLineLosses() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_MeasurementAlgorithm() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_MeteringPoint() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_ElectricityRelatedStatus() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_RegisterMonitor() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_ElectricityValues() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_MeasurementValueTypes() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_Harmonics() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_Tariffs() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDevice_Phaseangles() {
        return (EReference)getLogicalDevice().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalDevice_ID() {
        return (EAttribute)getLogicalDevice().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalDevice() {
		if (physicalDeviceEClass == null) {
			physicalDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI).getEClassifiers().get(1);
		}
		return physicalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_ManagementLogicalDevice() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalDevice_ID() {
        return (EAttribute)getPhysicalDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_LogicalDevice() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_ElectricityRelatedStatus() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_AA() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_AutoConnect() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_BillingPeriodValues() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_ElectricityID() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_ProgramEntries() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_OutputPulse() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_ReadingFactor() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_NominalValues() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_InputPulse() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_MeasurementPeriod() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_TimeEntries() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_TransformerLineLosses() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_MeasurementAlgorithm() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_MeteringPoint() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_RegisterMonitor() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_ElectricityValues() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_MeasurementValueTypes() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_Harmonics() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_Tariffs() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDevice_Phaseangles() {
        return (EReference)getPhysicalDevice().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementLogicalDevice() {
		if (managementLogicalDeviceEClass == null) {
			managementLogicalDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI).getEClassifiers().get(2);
		}
		return managementLogicalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalDeviceName() {
		if (logicalDeviceNameEClass == null) {
			logicalDeviceNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI).getEClassifiers().get(3);
		}
		return logicalDeviceNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDeviceName_Name() {
        return (EReference)getLogicalDeviceName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOSEMRoot() {
		if (cosemRootEClass == null) {
			cosemRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI).getEClassifiers().get(4);
		}
		return cosemRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOSEMRoot_PhysicalDevice() {
        return (EReference)getCOSEMRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOSEMRoot_LogicalDevice() {
        return (EReference)getCOSEMRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COSEMFactory getCOSEMFactory() {
		return (COSEMFactory)getEFactoryInstance();
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
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
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
		if (isFixed) return;
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
			eClassifier.setInstanceClassName("COSEM." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //COSEMPackageImpl
