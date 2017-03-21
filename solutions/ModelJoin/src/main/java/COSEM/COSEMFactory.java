/**
 */
package COSEM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see COSEM.COSEMPackage
 * @generated
 */
public interface COSEMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	COSEMFactory eINSTANCE = COSEM.impl.COSEMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logical Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Device</em>'.
	 * @generated
	 */
	LogicalDevice createLogicalDevice();

	/**
	 * Returns a new object of class '<em>Physical Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Device</em>'.
	 * @generated
	 */
	PhysicalDevice createPhysicalDevice();

	/**
	 * Returns a new object of class '<em>Management Logical Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Logical Device</em>'.
	 * @generated
	 */
	ManagementLogicalDevice createManagementLogicalDevice();

	/**
	 * Returns a new object of class '<em>Logical Device Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Device Name</em>'.
	 * @generated
	 */
	LogicalDeviceName createLogicalDeviceName();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	COSEMRoot createCOSEMRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	COSEMPackage getCOSEMPackage();

} //COSEMFactory
