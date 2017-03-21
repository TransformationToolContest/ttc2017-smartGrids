/**
 */
package CIM.IEC61970.Topology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Topology.TopologyPackage
 * @generated
 */
public interface TopologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyFactory eINSTANCE = CIM.IEC61970.Topology.impl.TopologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Topological Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topological Node</em>'.
	 * @generated
	 */
	TopologicalNode createTopologicalNode();

	/**
	 * Returns a new object of class '<em>Bus Name Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Name Marker</em>'.
	 * @generated
	 */
	BusNameMarker createBusNameMarker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopologyPackage getTopologyPackage();

} //TopologyFactory
