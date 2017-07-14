/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Movement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountMovement#getReason <em>Reason</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountMovement#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountMovement#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountMovement()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Credit/debit movements for an account.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Credit/debit movements for an account.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Credit/debit movements for an account.' Profile\040documentation='Credit/debit movements for an account.'"
 * @generated
 */
public interface AccountMovement extends Element {
	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountMovement_Reason()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reason for credit/debit transaction on an account. Example: payment received/arrears interest levied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reason for credit/debit transaction on an account. Example: payment received/arrears interest levied.'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountMovement#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountMovement_Amount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount that was credited to/debited from an account. For example: payment received/interest charge on arrears.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount that was credited to/debited from an account. For example: payment received/interest charge on arrears.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountMovement#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountMovement_DateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time when the credit/debit transaction was performed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time when the credit/debit transaction was performed.'"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.AccountMovement#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

} // AccountMovement
