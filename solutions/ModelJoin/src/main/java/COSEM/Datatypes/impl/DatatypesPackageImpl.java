/**
 */
package COSEM.Datatypes.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;

import COSEM.COSEMObjects.impl.COSEMObjectsPackageImpl;

import COSEM.COSEMPackage;

import COSEM.Datatypes.DatatypesFactory;
import COSEM.Datatypes.DatatypesPackage;

import COSEM.InterfaceClasses.InterfaceClassesPackage;

import COSEM.InterfaceClasses.impl.InterfaceClassesPackageImpl;

import COSEM.impl.COSEMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scal_unit_typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum disconnectControlStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum disconnectControlTransitionEEnum = null;

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
	 * @see COSEM.Datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		COSEMPackageImpl theCOSEMPackage = (COSEMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) instanceof COSEMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMPackage.eNS_URI) : COSEMPackage.eINSTANCE);
		InterfaceClassesPackageImpl theInterfaceClassesPackage = (InterfaceClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI) instanceof InterfaceClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfaceClassesPackage.eNS_URI) : InterfaceClassesPackage.eINSTANCE);
		COSEMObjectsPackageImpl theCOSEMObjectsPackage = (COSEMObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI) instanceof COSEMObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(COSEMObjectsPackage.eNS_URI) : COSEMObjectsPackage.eINSTANCE);

		// Load packages
		theCOSEMPackage.loadPackage();

		// Fix loaded packages
		theDatatypesPackage.fixPackageContents();
		theCOSEMPackage.fixPackageContents();
		theInterfaceClassesPackage.fixPackageContents();
		theCOSEMObjectsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscal_unit_type() {
		if (scal_unit_typeEClass == null) {
			scal_unit_typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return scal_unit_typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getscal_unit_type_Scaler() {
        return (EAttribute)getscal_unit_type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getscal_unit_type_Unit() {
        return (EAttribute)getscal_unit_type().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnits() {
		if (unitsEEnum == null) {
			unitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return unitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisconnectControlState() {
		if (disconnectControlStateEEnum == null) {
			disconnectControlStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return disconnectControlStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisconnectControlTransition() {
		if (disconnectControlTransitionEEnum == null) {
			disconnectControlTransitionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return disconnectControlTransitionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("COSEM.Datatypes." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //DatatypesPackageImpl
