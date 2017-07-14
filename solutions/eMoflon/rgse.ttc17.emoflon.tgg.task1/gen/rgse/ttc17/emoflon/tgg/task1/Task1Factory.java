/**
 */
package rgse.ttc17.emoflon.tgg.task1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rgse.ttc17.emoflon.tgg.task1.Task1Package
 * @generated
 */
public interface Task1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Task1Factory eINSTANCE = rgse.ttc17.emoflon.tgg.task1.impl.Task1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Control Area To Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Area To Energy Consumer</em>'.
	 * @generated
	 */
	ControlAreaToEnergyConsumer createControlAreaToEnergyConsumer();

	/**
	 * Returns a new object of class '<em>Location To Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location To Location</em>'.
	 * @generated
	 */
	LocationToLocation createLocationToLocation();

	/**
	 * Returns a new object of class '<em>Physical Device To Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Device To Energy Consumer</em>'.
	 * @generated
	 */
	PhysicalDeviceToEnergyConsumer createPhysicalDeviceToEnergyConsumer();

	/**
	 * Returns a new object of class '<em>Position Point To Position Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Point To Position Point</em>'.
	 * @generated
	 */
	PositionPointToPositionPoint createPositionPointToPositionPoint();

	/**
	 * Returns a new object of class '<em>Meter Asset To Energy Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter Asset To Energy Consumer</em>'.
	 * @generated
	 */
	MeterAssetToEnergyConsumer createMeterAssetToEnergyConsumer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Task1Package getTask1Package();

} //Task1Factory
