/**
 */
package gluemodel.CIM.IEC61970.Outage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Outage.OutagePackage
 * @generated
 */
public interface OutageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutageFactory eINSTANCE = gluemodel.CIM.IEC61970.Outage.impl.OutageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule</em>'.
	 * @generated
	 */
	OutageSchedule createOutageSchedule();

	/**
	 * Returns a new object of class '<em>Clearance Tag Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clearance Tag Type</em>'.
	 * @generated
	 */
	ClearanceTagType createClearanceTagType();

	/**
	 * Returns a new object of class '<em>Clearance Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clearance Tag</em>'.
	 * @generated
	 */
	ClearanceTag createClearanceTag();

	/**
	 * Returns a new object of class '<em>Switching Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switching Operation</em>'.
	 * @generated
	 */
	SwitchingOperation createSwitchingOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OutagePackage getOutagePackage();

} //OutageFactory
