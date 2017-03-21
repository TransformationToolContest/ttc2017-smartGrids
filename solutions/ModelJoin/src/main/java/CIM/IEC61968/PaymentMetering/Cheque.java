/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cheque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cheque#getMicrNumber <em>Micr Number</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cheque#getDate <em>Date</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cheque#getChequeNumber <em>Cheque Number</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cheque#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cheque#getBankAccountDetail <em>Bank Account Detail</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Cheque#getTender <em>Tender</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The actual tender when it is a type of cheque.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The actual tender when it is a type of cheque.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The actual tender when it is a type of cheque.' Profile\040documentation='The actual tender when it is a type of cheque.'"
 * @generated
 */
public interface Cheque extends Element {
	/**
	 * Returns the value of the '<em><b>Micr Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Micr Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Micr Number</em>' attribute.
	 * @see #setMicrNumber(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque_MicrNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The magnetic ink character recognition number printed on the cheque.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The magnetic ink character recognition number printed on the cheque.'"
	 * @generated
	 */
	String getMicrNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Cheque#getMicrNumber <em>Micr Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Micr Number</em>' attribute.
	 * @see #getMicrNumber()
	 * @generated
	 */
	void setMicrNumber(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque_Date()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date when cheque becomes valid.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date when cheque becomes valid.'"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Cheque#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Cheque Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cheque Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cheque Number</em>' attribute.
	 * @see #setChequeNumber(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque_ChequeNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cheque reference number as printed on the cheque.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cheque reference number as printed on the cheque.'"
	 * @generated
	 */
	String getChequeNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Cheque#getChequeNumber <em>Cheque Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cheque Number</em>' attribute.
	 * @see #getChequeNumber()
	 * @generated
	 */
	void setChequeNumber(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.PaymentMetering.ChequeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.PaymentMetering.ChequeKind
	 * @see #setKind(ChequeKind)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of cheque.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of cheque.'"
	 * @generated
	 */
	ChequeKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Cheque#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.PaymentMetering.ChequeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ChequeKind value);

	/**
	 * Returns the value of the '<em><b>Bank Account Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Account Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Account Detail</em>' reference.
	 * @see #setBankAccountDetail(BankAccountDetail)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque_BankAccountDetail()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details of the account holder and bank.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details of the account holder and bank.'"
	 * @generated
	 */
	BankAccountDetail getBankAccountDetail();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Cheque#getBankAccountDetail <em>Bank Account Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Account Detail</em>' reference.
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	void setBankAccountDetail(BankAccountDetail value);

	/**
	 * Returns the value of the '<em><b>Tender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Tender#getCheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tender</em>' reference.
	 * @see #setTender(Tender)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque_Tender()
	 * @see CIM.IEC61968.PaymentMetering.Tender#getCheque
	 * @model opposite="Cheque"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Payment tender the cheque is being used for.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Payment tender the cheque is being used for.'"
	 * @generated
	 */
	Tender getTender();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Cheque#getTender <em>Tender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tender</em>' reference.
	 * @see #getTender()
	 * @generated
	 */
	void setTender(Tender value);

} // Cheque
