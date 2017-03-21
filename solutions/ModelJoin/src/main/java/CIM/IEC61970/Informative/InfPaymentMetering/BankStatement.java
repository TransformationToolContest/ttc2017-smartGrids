/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.PaymentMetering.MerchantAccount;
import CIM.IEC61968.PaymentMetering.Vendor;

import CIM.IEC61970.Informative.InfCommon.BankAccount;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantCreditAmount <em>Merchant Credit Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getBankAccount <em>Bank Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getDepositAmount <em>Deposit Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getDepositDateTime <em>Deposit Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantAccount <em>Merchant Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getVendor <em>Vendor</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#isPosted <em>Posted</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBankStatement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of Document that records bank deposits made by Vendor of revenue collected at PointOfSale.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A type of Document that records bank deposits made by Vendor of revenue collected at PointOfSale.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of Document that records bank deposits made by Vendor of revenue collected at PointOfSale.' Profile\040documentation='A type of Document that records bank deposits made by Vendor of revenue collected at PointOfSale.'"
 * @generated
 */
public interface BankStatement extends Document {
	/**
	 * Returns the value of the '<em><b>Merchant Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Credit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Credit Amount</em>' attribute.
	 * @see #setMerchantCreditAmount(float)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBankStatement_MerchantCreditAmount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount on this statement that is to be credited to MerchantAccount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount on this statement that is to be credited to MerchantAccount.'"
	 * @generated
	 */
	float getMerchantCreditAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantCreditAmount <em>Merchant Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Credit Amount</em>' attribute.
	 * @see #getMerchantCreditAmount()
	 * @generated
	 */
	void setMerchantCreditAmount(float value);

	/**
	 * Returns the value of the '<em><b>Bank Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getBankStatements <em>Bank Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Account</em>' reference.
	 * @see #setBankAccount(BankAccount)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBankStatement_BankAccount()
	 * @see CIM.IEC61970.Informative.InfCommon.BankAccount#getBankStatements
	 * @model opposite="BankStatements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='BankAccount that generated this bank statement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='BankAccount that generated this bank statement.'"
	 * @generated
	 */
	BankAccount getBankAccount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getBankAccount <em>Bank Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Account</em>' reference.
	 * @see #getBankAccount()
	 * @generated
	 */
	void setBankAccount(BankAccount value);

	/**
	 * Returns the value of the '<em><b>Deposit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposit Amount</em>' attribute.
	 * @see #setDepositAmount(float)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBankStatement_DepositAmount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount that is deposited into the bank via BankAccount.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount that is deposited into the bank via BankAccount.'"
	 * @generated
	 */
	float getDepositAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getDepositAmount <em>Deposit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposit Amount</em>' attribute.
	 * @see #getDepositAmount()
	 * @generated
	 */
	void setDepositAmount(float value);

	/**
	 * Returns the value of the '<em><b>Deposit Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposit Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposit Date Time</em>' attribute.
	 * @see #setDepositDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBankStatement_DepositDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date and time the deposit is made.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date and time the deposit is made.'"
	 * @generated
	 */
	Date getDepositDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getDepositDateTime <em>Deposit Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposit Date Time</em>' attribute.
	 * @see #getDepositDateTime()
	 * @generated
	 */
	void setDepositDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Merchant Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getBankStatements <em>Bank Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Account</em>' reference.
	 * @see #setMerchantAccount(MerchantAccount)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBankStatement_MerchantAccount()
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getBankStatements
	 * @model opposite="BankStatements"
	 * @generated
	 */
	MerchantAccount getMerchantAccount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getMerchantAccount <em>Merchant Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Account</em>' reference.
	 * @see #getMerchantAccount()
	 * @generated
	 */
	void setMerchantAccount(MerchantAccount value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Vendor#getBankStatements <em>Bank Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' reference.
	 * @see #setVendor(Vendor)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBankStatement_Vendor()
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getBankStatements
	 * @model opposite="BankStatements"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Vendor that made this BankStatement (by making deposit).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Vendor that made this BankStatement (by making deposit).'"
	 * @generated
	 */
	Vendor getVendor();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#getVendor <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' reference.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Vendor value);

	/**
	 * Returns the value of the '<em><b>Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted</em>' attribute.
	 * @see #setPosted(boolean)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBankStatement_Posted()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if mechantCreditAmount has been cerdited to MerchantAccount; typically happens when bank statement details are captured into payment system.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if mechantCreditAmount has been cerdited to MerchantAccount; typically happens when bank statement details are captured into payment system.'"
	 * @generated
	 */
	boolean isPosted();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.BankStatement#isPosted <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted</em>' attribute.
	 * @see #isPosted()
	 * @generated
	 */
	void setPosted(boolean value);

} // BankStatement
