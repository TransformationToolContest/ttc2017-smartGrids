/**
 */
package CIM.PackageDependencies;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.PackageDependencies.PackageDependenciesPackage
 * @generated
 */
public interface PackageDependenciesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackageDependenciesFactory eINSTANCE = CIM.PackageDependencies.impl.PackageDependenciesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CIM Veresion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Veresion</em>'.
	 * @generated
	 */
	PackageDependenciesCIMVeresion createPackageDependenciesCIMVeresion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PackageDependenciesPackage getPackageDependenciesPackage();

} //PackageDependenciesFactory
