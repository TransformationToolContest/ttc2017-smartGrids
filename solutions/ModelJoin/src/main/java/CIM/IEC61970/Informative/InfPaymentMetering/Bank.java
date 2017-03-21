/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering;

import CIM.IEC61968.Common.Organisation;

import CIM.IEC61970.Informative.InfCommon.BankAccount;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBankAccounts <em>Bank Accounts</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBranchCode <em>Branch Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBic <em>Bic</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getIban <em>Iban</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBank()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Organisation that is a commercial bank, agency, or other institution that offers a similar service.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Organisation that is a commercial bank, agency, or other institution that offers a similar service.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Organisation that is a commercial bank, agency, or other institution that offers a similar service.' Profile\040documentation='Organisation that is a commercial bank, agency, or other institution that offers a similar service.'"
 * @generated
 */
public interface Bank extends Organisation {
	/**
	 * Returns the value of the '<em><b>Bank Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfCommon.BankAccount}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCommon.BankAccount#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Accounts</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBank_BankAccounts()
	 * @see CIM.IEC61970.Informative.InfCommon.BankAccount#getBank
	 * @model opposite="Bank"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All BankAccounts this Bank provides.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All BankAccounts this Bank provides.'"
	 * @generated
	 */
	EList<BankAccount> getBankAccounts();

	/**
	 * Returns the value of the '<em><b>Branch Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Code</em>' attribute.
	 * @see #setBranchCode(String)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBank_BranchCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Codified reference to the particular branch of the bank where BankAccount is held.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Codified reference to the particular branch of the bank where BankAccount is held.'"
	 * @generated
	 */
	String getBranchCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBranchCode <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Code</em>' attribute.
	 * @see #getBranchCode()
	 * @generated
	 */
	void setBranchCode(String value);

	/**
	 * Returns the value of the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bic</em>' attribute.
	 * @see #setBic(String)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBank_Bic()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bank identifier code as defined in ISO 9362; for use in countries wher IBAN is not yet in operation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bank identifier code as defined in ISO 9362; for use in countries wher IBAN is not yet in operation.'"
	 * @generated
	 */
	String getBic();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getBic <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bic</em>' attribute.
	 * @see #getBic()
	 * @generated
	 */
	void setBic(String value);

	/**
	 * Returns the value of the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iban</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iban</em>' attribute.
	 * @see #setIban(String)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getBank_Iban()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='International bank account number defined in ISO 13616; for countries where IBAN is not in operation, the existing BIC or SWIFT codes may be used instead (see ISO 9362).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='International bank account number defined in ISO 13616; for countries where IBAN is not in operation, the existing BIC or SWIFT codes may be used instead (see ISO 9362).'"
	 * @generated
	 */
	String getIban();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.Bank#getIban <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iban</em>' attribute.
	 * @see #getIban()
	 * @generated
	 */
	void setIban(String value);

} // Bank
