/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.IEC61968.Common.Document;

import CIM.IEC61970.Informative.InfPaymentMetering.BankStatement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merchant Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getBankStatements <em>Bank Statements</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getTransactors <em>Transactors</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance <em>Current Balance</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getVendors <em>Vendors</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The operating account controlled by MerchantAgreement, against which Vendor may vend tokens or receipt payments. Transactions via VendorShift debit the account and bank deposits via BankStatement credit the account.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The operating account controlled by MerchantAgreement, against which Vendor may vend tokens or receipt payments. Transactions via VendorShift debit the account and bank deposits via BankStatement credit the account.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The operating account controlled by MerchantAgreement, against which Vendor may vend tokens or receipt payments. Transactions via VendorShift debit the account and bank deposits via BankStatement credit the account.' Profile\040documentation='The operating account controlled by MerchantAgreement, against which Vendor may vend tokens or receipt payments. Transactions via VendorShift debit the account and bank deposits via BankStatement credit the account.'"
 * @generated
 */
public interface MerchantAccount extends Document {
	/**
	 * Returns the value of the '<em><b>Bank Statements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Statements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Statements</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount_BankStatements()
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantAccount
	 * @model opposite="MerchantAccount"
	 * @generated
	 */
	EList<BankStatement> getBankStatements();

	/**
	 * Returns the value of the '<em><b>Merchant Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts <em>Merchant Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Agreement</em>' reference.
	 * @see #setMerchantAgreement(MerchantAgreement)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount_MerchantAgreement()
	 * @see CIM.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts
	 * @model opposite="MerchantAccounts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Merchant agreement that instantiated this merchant account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Merchant agreement that instantiated this merchant account.'"
	 * @generated
	 */
	MerchantAgreement getMerchantAgreement();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Agreement</em>' reference.
	 * @see #getMerchantAgreement()
	 * @generated
	 */
	void setMerchantAgreement(MerchantAgreement value);

	/**
	 * Returns the value of the '<em><b>Transactors</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.Transactor}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Transactor#getMerchantAccounts <em>Merchant Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactors</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount_Transactors()
	 * @see CIM.IEC61968.PaymentMetering.Transactor#getMerchantAccounts
	 * @model opposite="MerchantAccounts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All transactors this merchant account is registered with.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All transactors this merchant account is registered with.'"
	 * @generated
	 */
	EList<Transactor> getTransactors();

	/**
	 * Returns the value of the '<em><b>Provisional Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provisional Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provisional Balance</em>' attribute.
	 * @see #setProvisionalBalance(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount_ProvisionalBalance()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The balance of this account after taking into account any pending debits from VendorShift.merchantDebitAmount and pending credits from BankStatement.merchantCreditAmount or credits (see also BankStatement attributes and VendorShift attributes).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The balance of this account after taking into account any pending debits from VendorShift.merchantDebitAmount and pending credits from BankStatement.merchantCreditAmount or credits (see also BankStatement attributes and VendorShift attributes).'"
	 * @generated
	 */
	float getProvisionalBalance();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provisional Balance</em>' attribute.
	 * @see #getProvisionalBalance()
	 * @generated
	 */
	void setProvisionalBalance(float value);

	/**
	 * Returns the value of the '<em><b>Current Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Balance</em>' attribute.
	 * @see #setCurrentBalance(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount_CurrentBalance()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The current operating balance of this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The current operating balance of this account.'"
	 * @generated
	 */
	float getCurrentBalance();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance <em>Current Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Balance</em>' attribute.
	 * @see #getCurrentBalance()
	 * @generated
	 */
	void setCurrentBalance(float value);

	/**
	 * Returns the value of the '<em><b>Vendors</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.Vendor}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Vendor#getMerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendors</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount_Vendors()
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getMerchantAccount
	 * @model opposite="MerchantAccount"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All vendors selling tokens or receipt payments against this merchant account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All vendors selling tokens or receipt payments against this merchant account.'"
	 * @generated
	 */
	EList<Vendor> getVendors();

	/**
	 * Returns the value of the '<em><b>Vendor Shifts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.VendorShift}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.VendorShift#getMerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Shifts</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount_VendorShifts()
	 * @see CIM.IEC61968.PaymentMetering.VendorShift#getMerchantAccount
	 * @model opposite="MerchantAccount"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All vendor shifts that operate on this merchant account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All vendor shifts that operate on this merchant account.'"
	 * @generated
	 */
	EList<VendorShift> getVendorShifts();

} // MerchantAccount
