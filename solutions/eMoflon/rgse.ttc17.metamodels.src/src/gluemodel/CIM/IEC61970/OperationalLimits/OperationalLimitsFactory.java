/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage
 * @generated
 */
public interface OperationalLimitsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationalLimitsFactory eINSTANCE = gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Branch Group Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Group Terminal</em>'.
	 * @generated
	 */
	BranchGroupTerminal createBranchGroupTerminal();

	/**
	 * Returns a new object of class '<em>Operational Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Limit</em>'.
	 * @generated
	 */
	OperationalLimit createOperationalLimit();

	/**
	 * Returns a new object of class '<em>Branch Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Group</em>'.
	 * @generated
	 */
	BranchGroup createBranchGroup();

	/**
	 * Returns a new object of class '<em>Voltage Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voltage Limit</em>'.
	 * @generated
	 */
	VoltageLimit createVoltageLimit();

	/**
	 * Returns a new object of class '<em>Apparent Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apparent Power Limit</em>'.
	 * @generated
	 */
	ApparentPowerLimit createApparentPowerLimit();

	/**
	 * Returns a new object of class '<em>Current Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Limit</em>'.
	 * @generated
	 */
	CurrentLimit createCurrentLimit();

	/**
	 * Returns a new object of class '<em>Operational Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Limit Set</em>'.
	 * @generated
	 */
	OperationalLimitSet createOperationalLimitSet();

	/**
	 * Returns a new object of class '<em>Active Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Power Limit</em>'.
	 * @generated
	 */
	ActivePowerLimit createActivePowerLimit();

	/**
	 * Returns a new object of class '<em>Operational Limit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Limit Type</em>'.
	 * @generated
	 */
	OperationalLimitType createOperationalLimitType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationalLimitsPackage getOperationalLimitsPackage();

} //OperationalLimitsFactory
