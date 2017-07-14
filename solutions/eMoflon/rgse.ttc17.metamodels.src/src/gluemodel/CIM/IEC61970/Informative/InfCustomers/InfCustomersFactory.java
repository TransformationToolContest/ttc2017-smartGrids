/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCustomers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage
 * @generated
 */
public interface InfCustomersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfCustomersFactory eINSTANCE = gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.InfCustomersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Standard Industry Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Industry Code</em>'.
	 * @generated
	 */
	StandardIndustryCode createStandardIndustryCode();

	/**
	 * Returns a new object of class '<em>Customer Billing Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Billing Info</em>'.
	 * @generated
	 */
	CustomerBillingInfo createCustomerBillingInfo();

	/**
	 * Returns a new object of class '<em>Power Quality Pricing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Quality Pricing</em>'.
	 * @generated
	 */
	PowerQualityPricing createPowerQualityPricing();

	/**
	 * Returns a new object of class '<em>Outage History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outage History</em>'.
	 * @generated
	 */
	OutageHistory createOutageHistory();

	/**
	 * Returns a new object of class '<em>Work Billing Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Billing Info</em>'.
	 * @generated
	 */
	WorkBillingInfo createWorkBillingInfo();

	/**
	 * Returns a new object of class '<em>Subscribe Power Curve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscribe Power Curve</em>'.
	 * @generated
	 */
	SubscribePowerCurve createSubscribePowerCurve();

	/**
	 * Returns a new object of class '<em>Service Guarantee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Guarantee</em>'.
	 * @generated
	 */
	ServiceGuarantee createServiceGuarantee();

	/**
	 * Returns a new object of class '<em>External Customer Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Customer Agreement</em>'.
	 * @generated
	 */
	ExternalCustomerAgreement createExternalCustomerAgreement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfCustomersPackage getInfCustomersPackage();

} //InfCustomersFactory
