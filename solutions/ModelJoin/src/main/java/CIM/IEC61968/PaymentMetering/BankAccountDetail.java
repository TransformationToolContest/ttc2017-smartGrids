/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Account Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getHolderID <em>Holder ID</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode <em>Branch Code</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getHolderName <em>Holder Name</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getBankAccountDetail()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details of a bank account.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Details of a bank account.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details of a bank account.' Profile\040documentation='Details of a bank account.'"
 * @generated
 */
public interface BankAccountDetail extends Element {
	/**
	 * Returns the value of the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Name</em>' attribute.
	 * @see #setBankName(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getBankAccountDetail_BankName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of bank where account is held.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of bank where account is held.'"
	 * @generated
	 */
	String getBankName();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getBankName <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Name</em>' attribute.
	 * @see #getBankName()
	 * @generated
	 */
	void setBankName(String value);

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
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getBankAccountDetail_AccountNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operational account reference number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operational account reference number.'"
	 * @generated
	 */
	String getAccountNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #getAccountNumber()
	 * @generated
	 */
	void setAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Holder ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder ID</em>' attribute.
	 * @see #setHolderID(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getBankAccountDetail_HolderID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='National identity number (or equivalent) of account holder.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='National identity number (or equivalent) of account holder.'"
	 * @generated
	 */
	String getHolderID();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getHolderID <em>Holder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder ID</em>' attribute.
	 * @see #getHolderID()
	 * @generated
	 */
	void setHolderID(String value);

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
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getBankAccountDetail_BranchCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Branch of bank where account is held.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Branch of bank where account is held.'"
	 * @generated
	 */
	String getBranchCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Code</em>' attribute.
	 * @see #getBranchCode()
	 * @generated
	 */
	void setBranchCode(String value);

	/**
	 * Returns the value of the '<em><b>Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder Name</em>' attribute.
	 * @see #setHolderName(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getBankAccountDetail_HolderName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of account holder.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of account holder.'"
	 * @generated
	 */
	String getHolderName();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.BankAccountDetail#getHolderName <em>Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder Name</em>' attribute.
	 * @see #getHolderName()
	 * @generated
	 */
	void setHolderName(String value);

} // BankAccountDetail
