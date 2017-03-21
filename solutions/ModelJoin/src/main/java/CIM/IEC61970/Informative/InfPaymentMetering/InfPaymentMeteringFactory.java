/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage
 * @generated
 */
public interface InfPaymentMeteringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfPaymentMeteringFactory eINSTANCE = CIM.IEC61970.Informative.InfPaymentMetering.impl.InfPaymentMeteringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TSP Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSP Agreement</em>'.
	 * @generated
	 */
	TSPAgreement createTSPAgreement();

	/**
	 * Returns a new object of class '<em>Receipt Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receipt Summary</em>'.
	 * @generated
	 */
	ReceiptSummary createReceiptSummary();

	/**
	 * Returns a new object of class '<em>Transaction Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Summary</em>'.
	 * @generated
	 */
	TransactionSummary createTransactionSummary();

	/**
	 * Returns a new object of class '<em>Bank Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Statement</em>'.
	 * @generated
	 */
	BankStatement createBankStatement();

	/**
	 * Returns a new object of class '<em>SDP Accounting Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDP Accounting Function</em>'.
	 * @generated
	 */
	SDPAccountingFunction createSDPAccountingFunction();

	/**
	 * Returns a new object of class '<em>Credit Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Register</em>'.
	 * @generated
	 */
	CreditRegister createCreditRegister();

	/**
	 * Returns a new object of class '<em>Charge Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Charge Register</em>'.
	 * @generated
	 */
	ChargeRegister createChargeRegister();

	/**
	 * Returns a new object of class '<em>Bank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank</em>'.
	 * @generated
	 */
	Bank createBank();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfPaymentMeteringPackage getInfPaymentMeteringPackage();

} //InfPaymentMeteringFactory
