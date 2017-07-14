/**
 */
package gluemodel.CIM.IEC61970.Informative.Financial;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.Financial.FinancialPackage
 * @generated
 */
public interface FinancialFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinancialFactory eINSTANCE = gluemodel.CIM.IEC61970.Informative.Financial.impl.FinancialFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	FinancialVersion createFinancialVersion();

	/**
	 * Returns a new object of class '<em>Marketer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marketer</em>'.
	 * @generated
	 */
	Marketer createMarketer();

	/**
	 * Returns a new object of class '<em>Int Sched Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Sched Agreement</em>'.
	 * @generated
	 */
	IntSchedAgreement createIntSchedAgreement();

	/**
	 * Returns a new object of class '<em>Transmission Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission Provider</em>'.
	 * @generated
	 */
	TransmissionProvider createTransmissionProvider();

	/**
	 * Returns a new object of class '<em>Transmission Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission Product</em>'.
	 * @generated
	 */
	TransmissionProduct createTransmissionProduct();

	/**
	 * Returns a new object of class '<em>Generation Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Provider</em>'.
	 * @generated
	 */
	GenerationProvider createGenerationProvider();

	/**
	 * Returns a new object of class '<em>Customer Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Consumer</em>'.
	 * @generated
	 */
	CustomerConsumer createCustomerConsumer();

	/**
	 * Returns a new object of class '<em>Open Access Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Access Product</em>'.
	 * @generated
	 */
	OpenAccessProduct createOpenAccessProduct();

	/**
	 * Returns a new object of class '<em>Control Area Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Area Operator</em>'.
	 * @generated
	 */
	ControlAreaOperator createControlAreaOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FinancialPackage getFinancialPackage();

} //FinancialFactory
