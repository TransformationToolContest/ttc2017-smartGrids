/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.Element;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.LineDetail#getRounding <em>Rounding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.LineDetail#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.LineDetail#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.LineDetail#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getLineDetail()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details on an amount line, with rounding, date and note.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Details on an amount line, with rounding, date and note.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details on an amount line, with rounding, date and note.' Profile\040documentation='Details on an amount line, with rounding, date and note.'"
 * @generated
 */
public interface LineDetail extends Element {
	/**
	 * Returns the value of the '<em><b>Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounding</em>' attribute.
	 * @see #setRounding(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getLineDetail_Rounding()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Totalised monetary value of all errors due to process rounding or truncating that is not reflected in \'amount\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Totalised monetary value of all errors due to process rounding or truncating that is not reflected in \'amount\'.'"
	 * @generated
	 */
	float getRounding();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.LineDetail#getRounding <em>Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding</em>' attribute.
	 * @see #getRounding()
	 * @generated
	 */
	void setRounding(float value);

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
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getLineDetail_Amount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount for this line item.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount for this line item.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.LineDetail#getAmount <em>Amount</em>}' attribute.
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
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getLineDetail_DateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time when this line was created in the application process.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time when this line was created in the application process.'"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.LineDetail#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getLineDetail_Note()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Free format note relevant to this line.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Free format note relevant to this line.'"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.LineDetail#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

} // LineDetail
