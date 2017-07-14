/**
 */
package gluemodel.CIM.PackageDependencies.impl;

import gluemodel.CIM.PackageDependencies.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageDependenciesFactoryImpl extends EFactoryImpl implements PackageDependenciesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageDependenciesFactory init() {
		try {
			PackageDependenciesFactory thePackageDependenciesFactory = (PackageDependenciesFactory)EPackage.Registry.INSTANCE.getEFactory(PackageDependenciesPackage.eNS_URI);
			if (thePackageDependenciesFactory != null) {
				return thePackageDependenciesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackageDependenciesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDependenciesFactoryImpl() {
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION: return createPackageDependenciesCIMVeresion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDependenciesCIMVeresion createPackageDependenciesCIMVeresion() {
		PackageDependenciesCIMVeresionImpl packageDependenciesCIMVeresion = new PackageDependenciesCIMVeresionImpl();
		return packageDependenciesCIMVeresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDependenciesPackage getPackageDependenciesPackage() {
		return (PackageDependenciesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackageDependenciesPackage getPackage() {
		return PackageDependenciesPackage.eINSTANCE;
	}

} //PackageDependenciesFactoryImpl
