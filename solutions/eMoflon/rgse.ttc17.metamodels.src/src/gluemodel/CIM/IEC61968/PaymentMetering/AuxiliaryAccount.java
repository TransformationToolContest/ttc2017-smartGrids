/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61968.Common.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getDue <em>Due</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges <em>Charges</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Variable and dynamic part of AuxiliaryAgreement, generally representing the current state of the account related to the outstanding balance defined in AuxiliaryAgreement.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Variable and dynamic part of AuxiliaryAgreement, generally representing the current state of the account related to the outstanding balance defined in AuxiliaryAgreement.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Variable and dynamic part of AuxiliaryAgreement, generally representing the current state of the account related to the outstanding balance defined in AuxiliaryAgreement.' Profile\040documentation='Variable and dynamic part of AuxiliaryAgreement, generally representing the current state of the account related to the outstanding balance defined in AuxiliaryAgreement.'"
 * @generated
 */
public interface AuxiliaryAccount extends Document {
	/**
	 * Returns the value of the '<em><b>Payment Transactions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Transactions</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount_PaymentTransactions()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount
	 * @model opposite="AuxiliaryAccount"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All payments against this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All payments against this account.'"
	 * @generated
	 */
	EList<Transaction> getPaymentTransactions();

	/**
	 * Returns the value of the '<em><b>Due</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due</em>' reference.
	 * @see #setDue(Due)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount_Due()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Current amounts now due for payment on this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Current amounts now due for payment on this account.'"
	 * @generated
	 */
	Due getDue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getDue <em>Due</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due</em>' reference.
	 * @see #getDue()
	 * @generated
	 */
	void setDue(Due value);

	/**
	 * Returns the value of the '<em><b>Last Credit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Credit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Credit</em>' reference.
	 * @see #setLastCredit(AccountMovement)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount_LastCredit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details of the last credit transaction performed on this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details of the last credit transaction performed on this account.'"
	 * @generated
	 */
	AccountMovement getLastCredit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Credit</em>' reference.
	 * @see #getLastCredit()
	 * @generated
	 */
	void setLastCredit(AccountMovement value);

	/**
	 * Returns the value of the '<em><b>Principle Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principle Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principle Amount</em>' attribute.
	 * @see #setPrincipleAmount(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount_PrincipleAmount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The initial principle amount, with which this account was instantiated.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The initial principle amount, with which this account was instantiated.'"
	 * @generated
	 */
	float getPrincipleAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principle Amount</em>' attribute.
	 * @see #getPrincipleAmount()
	 * @generated
	 */
	void setPrincipleAmount(float value);

	/**
	 * Returns the value of the '<em><b>Auxiliary Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Agreement</em>' reference.
	 * @see #setAuxiliaryAgreement(AuxiliaryAgreement)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount_AuxiliaryAgreement()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts
	 * @model opposite="AuxiliaryAccounts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Auxiliary agreement regulating this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Auxiliary agreement regulating this account.'"
	 * @generated
	 */
	AuxiliaryAgreement getAuxiliaryAgreement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary Agreement</em>' reference.
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	void setAuxiliaryAgreement(AuxiliaryAgreement value);

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Charge}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount_Charges()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts
	 * @model opposite="AuxiliaryAccounts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All charges levied on this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All charges levied on this account.'"
	 * @generated
	 */
	EList<Charge> getCharges();

	/**
	 * Returns the value of the '<em><b>Last Debit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Debit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Debit</em>' reference.
	 * @see #setLastDebit(AccountMovement)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount_LastDebit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details of the last debit transaction performed on this account.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details of the last debit transaction performed on this account.'"
	 * @generated
	 */
	AccountMovement getLastDebit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Debit</em>' reference.
	 * @see #getLastDebit()
	 * @generated
	 */
	void setLastDebit(AccountMovement value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount_Balance()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The total amount currently remaining on this account that is required to be paid in order to settle the account to zero. This excludes any due amounts not yet paid.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The total amount currently remaining on this account that is required to be paid in order to settle the account to zero. This excludes any due amounts not yet paid.'"
	 * @generated
	 */
	float getBalance();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(float value);

} // AuxiliaryAccount
