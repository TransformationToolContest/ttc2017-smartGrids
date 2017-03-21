/**
 */
package CIM.PackageDependencies;

import CIM.CIMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CIM.PackageDependencies.PackageDependenciesFactory
 * @model kind="package"
 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This package shows all the root level subpackage dependencies of the combined CIM model.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This package shows all the root level subpackage dependencies of the combined CIM model.'"
 * @generated
 */
public interface PackageDependenciesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PackageDependencies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iec.ch/TC57/2009/CIM-schema-cim14#PackageDependencies";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cimPackageDependencies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackageDependenciesPackage eINSTANCE = CIM.PackageDependencies.impl.PackageDependenciesPackageImpl.init();

	/**
	 * The meta object id for the '{@link CIM.PackageDependencies.impl.PackageDependenciesCIMVeresionImpl <em>CIM Veresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM.PackageDependencies.impl.PackageDependenciesCIMVeresionImpl
	 * @see CIM.PackageDependencies.impl.PackageDependenciesPackageImpl#getPackageDependenciesCIMVeresion()
	 * @generated
	 */
	int PACKAGE_DEPENDENCIES_CIM_VERESION = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCIES_CIM_VERESION__UUID = CIMPackage.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCIES_CIM_VERESION__DATE = CIMPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCIES_CIM_VERESION__VESION = CIMPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CIM Veresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCIES_CIM_VERESION_FEATURE_COUNT = CIMPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CIM Veresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCIES_CIM_VERESION_OPERATION_COUNT = CIMPackage.ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CIM.PackageDependencies.PackageDependenciesCIMVeresion <em>CIM Veresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIM Veresion</em>'.
	 * @see CIM.PackageDependencies.PackageDependenciesCIMVeresion
	 * @generated
	 */
	EClass getPackageDependenciesCIMVeresion();

	/**
	 * Returns the meta object for the attribute '{@link CIM.PackageDependencies.PackageDependenciesCIMVeresion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see CIM.PackageDependencies.PackageDependenciesCIMVeresion#getDate()
	 * @see #getPackageDependenciesCIMVeresion()
	 * @generated
	 */
	EAttribute getPackageDependenciesCIMVeresion_Date();

	/**
	 * Returns the meta object for the attribute '{@link CIM.PackageDependencies.PackageDependenciesCIMVeresion#getVesion <em>Vesion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vesion</em>'.
	 * @see CIM.PackageDependencies.PackageDependenciesCIMVeresion#getVesion()
	 * @see #getPackageDependenciesCIMVeresion()
	 * @generated
	 */
	EAttribute getPackageDependenciesCIMVeresion_Vesion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackageDependenciesFactory getPackageDependenciesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CIM.PackageDependencies.impl.PackageDependenciesCIMVeresionImpl <em>CIM Veresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM.PackageDependencies.impl.PackageDependenciesCIMVeresionImpl
		 * @see CIM.PackageDependencies.impl.PackageDependenciesPackageImpl#getPackageDependenciesCIMVeresion()
		 * @generated
		 */
		EClass PACKAGE_DEPENDENCIES_CIM_VERESION = eINSTANCE.getPackageDependenciesCIMVeresion();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_DEPENDENCIES_CIM_VERESION__DATE = eINSTANCE.getPackageDependenciesCIMVeresion_Date();

		/**
		 * The meta object literal for the '<em><b>Vesion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_DEPENDENCIES_CIM_VERESION__VESION = eINSTANCE.getPackageDependenciesCIMVeresion_Vesion();

	}

} //PackageDependenciesPackage
