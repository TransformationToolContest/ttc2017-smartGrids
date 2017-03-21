/**
 */
package CIM.IEC61970.Informative.InfLocations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfLocations.InfLocationsPackage
 * @generated
 */
public interface InfLocationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfLocationsFactory eINSTANCE = CIM.IEC61970.Informative.InfLocations.impl.InfLocationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Person Property Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Property Role</em>'.
	 * @generated
	 */
	PersonPropertyRole createPersonPropertyRole();

	/**
	 * Returns a new object of class '<em>Red Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Red Line</em>'.
	 * @generated
	 */
	RedLine createRedLine();

	/**
	 * Returns a new object of class '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard</em>'.
	 * @generated
	 */
	Hazard createHazard();

	/**
	 * Returns a new object of class '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route</em>'.
	 * @generated
	 */
	Route createRoute();

	/**
	 * Returns a new object of class '<em>Location Grant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Grant</em>'.
	 * @generated
	 */
	LocationGrant createLocationGrant();

	/**
	 * Returns a new object of class '<em>Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direction</em>'.
	 * @generated
	 */
	Direction createDirection();

	/**
	 * Returns a new object of class '<em>Land Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Land Property</em>'.
	 * @generated
	 */
	LandProperty createLandProperty();

	/**
	 * Returns a new object of class '<em>Org Property Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Org Property Role</em>'.
	 * @generated
	 */
	OrgPropertyRole createOrgPropertyRole();

	/**
	 * Returns a new object of class '<em>Right Of Way</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Of Way</em>'.
	 * @generated
	 */
	RightOfWay createRightOfWay();

	/**
	 * Returns a new object of class '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone</em>'.
	 * @generated
	 */
	Zone createZone();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfLocationsPackage getInfLocationsPackage();

} //InfLocationsFactory
