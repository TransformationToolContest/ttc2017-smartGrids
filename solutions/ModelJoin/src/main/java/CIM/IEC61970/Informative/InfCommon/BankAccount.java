/**
 */
package CIM.IEC61970.Informative.InfCommon;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.PaymentMetering.ServiceSupplier;

import CIM.IEC61970.Informative.InfPaymentMetering.Bank;
import CIM.IEC61970.Informative.InfPaymentMetering.BankStatement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getBank <em>Bank</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getBankStatements <em>Bank Statements</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBankAccount()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bank account.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Bank account.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bank account.' Profile\040documentation='Bank account.'"
 * @generated
 */
public interface BankAccount extends Document {
	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Number</em>' attribute.
	 * @see #setAccountNumber(String)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBankAccount_AccountNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Account reference number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Account reference number.'"
	 * @generated
	 */
	String getAccountNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #getAccountNumber()
	 * @generated
	 */
	void setAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBankAccounts <em>Bank Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' reference.
	 * @see #setBank(Bank)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBankAccount_Bank()
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBankAccounts
	 * @model opposite="BankAccounts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bank that provides this BankAccount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bank that provides this BankAccount.'"
	 * @generated
	 */
	Bank getBank();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(Bank value);

	/**
	 * Returns the value of the '<em><b>Service Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts <em>Bank Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Supplier</em>' reference.
	 * @see #setServiceSupplier(ServiceSupplier)
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBankAccount_ServiceSupplier()
	 * @see CIM.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts
	 * @model opposite="BankAccounts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='ServiceSupplier that is owner of this BankAccount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ServiceSupplier that is owner of this BankAccount.'"
	 * @generated
	 */
	ServiceSupplier getServiceSupplier();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getServiceSupplier <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Supplier</em>' reference.
	 * @see #getServiceSupplier()
	 * @generated
	 */
	void setServiceSupplier(ServiceSupplier value);

	/**
	 * Returns the value of the '<em><b>Bank Statements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getBankAccount <em>Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Statements</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfCommon.InfCommonPackage#getBankAccount_BankStatements()
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getBankAccount
	 * @model opposite="BankAccount"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All bank statements generated from this bank account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All bank statements generated from this bank account.'"
	 * @generated
	 */
	EList<BankStatement> getBankStatements();

} // BankAccount
