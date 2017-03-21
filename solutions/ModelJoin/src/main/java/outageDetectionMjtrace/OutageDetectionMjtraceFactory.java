/**
 */
package outageDetectionMjtrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see outageDetectionMjtrace.OutageDetectionMjtracePackage
 * @generated
 */
public interface OutageDetectionMjtraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutageDetectionMjtraceFactory eINSTANCE = outageDetectionMjtrace.impl.OutageDetectionMjtraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>join Meter Asset Physical Device Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>join Meter Asset Physical Device Energy Consumer</em>'.
	 * @generated
	 */
	join_MeterAsset_PhysicalDevice_EnergyConsumer createjoin_MeterAsset_PhysicalDevice_EnergyConsumer();

	/**
	 * Returns a new object of class '<em>ref Location Location Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ref Location Location Location</em>'.
	 * @generated
	 */
	ref_Location_Location_Location createref_Location_Location_Location();

	/**
	 * Returns a new object of class '<em>ref Position Point Position Point Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ref Position Point Position Point Position</em>'.
	 * @generated
	 */
	ref_PositionPoint_PositionPoint_Position createref_PositionPoint_PositionPoint_Position();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OutageDetectionMjtracePackage getOutageDetectionMjtracePackage();

} //OutageDetectionMjtraceFactory
