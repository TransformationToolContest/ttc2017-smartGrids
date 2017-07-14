/**
 */
package gluemodel.CIM.IEC61970.StateVariables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.StateVariables.StateVariablesPackage
 * @generated
 */
public interface StateVariablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateVariablesFactory eINSTANCE = gluemodel.CIM.IEC61970.StateVariables.impl.StateVariablesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sv Injection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sv Injection</em>'.
	 * @generated
	 */
	SvInjection createSvInjection();

	/**
	 * Returns a new object of class '<em>Sv Power Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sv Power Flow</em>'.
	 * @generated
	 */
	SvPowerFlow createSvPowerFlow();

	/**
	 * Returns a new object of class '<em>Topological Island</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topological Island</em>'.
	 * @generated
	 */
	TopologicalIsland createTopologicalIsland();

	/**
	 * Returns a new object of class '<em>Sv Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sv Status</em>'.
	 * @generated
	 */
	SvStatus createSvStatus();

	/**
	 * Returns a new object of class '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Variable</em>'.
	 * @generated
	 */
	StateVariable createStateVariable();

	/**
	 * Returns a new object of class '<em>Sv Short Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sv Short Circuit</em>'.
	 * @generated
	 */
	SvShortCircuit createSvShortCircuit();

	/**
	 * Returns a new object of class '<em>Sv Tap Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sv Tap Step</em>'.
	 * @generated
	 */
	SvTapStep createSvTapStep();

	/**
	 * Returns a new object of class '<em>Sv Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sv Voltage</em>'.
	 * @generated
	 */
	SvVoltage createSvVoltage();

	/**
	 * Returns a new object of class '<em>Sv Shunt Compensator Sections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sv Shunt Compensator Sections</em>'.
	 * @generated
	 */
	SvShuntCompensatorSections createSvShuntCompensatorSections();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StateVariablesPackage getStateVariablesPackage();

} //StateVariablesFactory
