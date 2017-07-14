/**
 */
package gluemodel.CIM.IEC61968.Customers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage
 * @generated
 */
public interface CustomersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomersFactory eINSTANCE = gluemodel.CIM.IEC61968.Customers.impl.CustomersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Service Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Category</em>'.
	 * @generated
	 */
	ServiceCategory createServiceCategory();

	/**
	 * Returns a new object of class '<em>Pricing Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pricing Structure</em>'.
	 * @generated
	 */
	PricingStructure createPricingStructure();

	/**
	 * Returns a new object of class '<em>Service Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Location</em>'.
	 * @generated
	 */
	ServiceLocation createServiceLocation();

	/**
	 * Returns a new object of class '<em>Customer Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Account</em>'.
	 * @generated
	 */
	CustomerAccount createCustomerAccount();

	/**
	 * Returns a new object of class '<em>Customer Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Agreement</em>'.
	 * @generated
	 */
	CustomerAgreement createCustomerAgreement();

	/**
	 * Returns a new object of class '<em>Tariff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tariff</em>'.
	 * @generated
	 */
	Tariff createTariff();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CustomersPackage getCustomersPackage();

} //CustomersFactory
