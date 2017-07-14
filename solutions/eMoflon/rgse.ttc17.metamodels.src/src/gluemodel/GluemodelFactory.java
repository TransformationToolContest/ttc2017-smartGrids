/**
 */
package gluemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.GluemodelPackage
 * @generated
 */
public interface GluemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GluemodelFactory eINSTANCE = gluemodel.impl.GluemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Meter Asset MMXU Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter Asset MMXU Pair</em>'.
	 * @generated
	 */
	MeterAssetMMXUPair createMeterAssetMMXUPair();

	/**
	 * Returns a new object of class '<em>Meter Asset Physical Device Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter Asset Physical Device Pair</em>'.
	 * @generated
	 */
	MeterAssetPhysicalDevicePair createMeterAssetPhysicalDevicePair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GluemodelPackage getGluemodelPackage();

} //GluemodelFactory
