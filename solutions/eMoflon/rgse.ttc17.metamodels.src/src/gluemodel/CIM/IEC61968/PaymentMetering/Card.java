/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getCvNumber <em>Cv Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getPan <em>Pan</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getAccountHolderName <em>Account Holder Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getTender <em>Tender</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCard()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation of the tender when it is a type of card (credit, debit, etc).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation of the tender when it is a type of card (credit, debit, etc).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation of the tender when it is a type of card (credit, debit, etc).' Profile\040documentation='Documentation of the tender when it is a type of card (credit, debit, etc).'"
 * @generated
 */
public interface Card extends Element {
	/**
	 * Returns the value of the '<em><b>Cv Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cv Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cv Number</em>' attribute.
	 * @see #setCvNumber(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCard_CvNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The card verification number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The card verification number.'"
	 * @generated
	 */
	String getCvNumber();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getCvNumber <em>Cv Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cv Number</em>' attribute.
	 * @see #getCvNumber()
	 * @generated
	 */
	void setCvNumber(String value);

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCard_ExpiryDate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date when this card expires.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date when this card expires.'"
	 * @generated
	 */
	String getExpiryDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(String value);

	/**
	 * Returns the value of the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan</em>' attribute.
	 * @see #setPan(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCard_Pan()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The primary account number.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The primary account number.'"
	 * @generated
	 */
	String getPan();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getPan <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan</em>' attribute.
	 * @see #getPan()
	 * @generated
	 */
	void setPan(String value);

	/**
	 * Returns the value of the '<em><b>Account Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Holder Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Holder Name</em>' attribute.
	 * @see #setAccountHolderName(String)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCard_AccountHolderName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of account holder.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of account holder.'"
	 * @generated
	 */
	String getAccountHolderName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getAccountHolderName <em>Account Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Holder Name</em>' attribute.
	 * @see #getAccountHolderName()
	 * @generated
	 */
	void setAccountHolderName(String value);

	/**
	 * Returns the value of the '<em><b>Tender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tender</em>' reference.
	 * @see #setTender(Tender)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCard_Tender()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Tender#getCard
	 * @model opposite="Card"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Payment tender this card is being used for.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Payment tender this card is being used for.'"
	 * @generated
	 */
	Tender getTender();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getTender <em>Tender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tender</em>' reference.
	 * @see #getTender()
	 * @generated
	 */
	void setTender(Tender value);

} // Card
