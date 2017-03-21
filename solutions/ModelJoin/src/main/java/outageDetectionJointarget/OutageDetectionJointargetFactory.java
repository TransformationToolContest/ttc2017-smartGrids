/**
 */
package outageDetectionJointarget;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see outageDetectionJointarget.OutageDetectionJointargetPackage
 * @generated
 */
public interface OutageDetectionJointargetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutageDetectionJointargetFactory eINSTANCE = outageDetectionJointarget.impl.OutageDetectionJointargetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Consumer</em>'.
	 * @generated
	 */
	EnergyConsumer createEnergyConsumer();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Position Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Point</em>'.
	 * @generated
	 */
	PositionPoint createPositionPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OutageDetectionJointargetPackage getOutageDetectionJointargetPackage();

} //OutageDetectionJointargetFactory
