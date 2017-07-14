/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getChange <em>Change</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getCheque <em>Cheque</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tender is what is \"offered\" by the customer towards making a payment and is often more than the required payment (hence the need for \'change\'). The payment is thus that part of the Tender that goes towards settlement of a particular transaction.\nTender is modelled as an aggregation of Cheque and Card. Both these tender types can exist in a single tender bid thus \'accountHolderName\' must exist separately in each of Cheque and Card as each could have a different account holder name.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Tender is what is \"offered\" by the customer towards making a payment and is often more than the required payment (hence the need for \'change\'). The payment is thus that part of the Tender that goes towards settlement of a particular transaction.\nTender is modelled as an aggregation of Cheque and Card. Both these tender types can exist in a single tender bid thus \'accountHolderName\' must exist separately in each of Cheque and Card as each could have a different account holder name.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tender is what is \"offered\" by the customer towards making a payment and is often more than the required payment (hence the need for \'change\'). The payment is thus that part of the Tender that goes towards settlement of a particular transaction.\nTender is modelled as an aggregation of Cheque and Card. Both these tender types can exist in a single tender bid thus \'accountHolderName\' must exist separately in each of Cheque and Card as each could have a different account holder name.' Profile\040documentation='Tender is what is \"offered\" by the customer towards making a payment and is often more than the required payment (hence the need for \'change\'). The payment is thus that part of the Tender that goes towards settlement of a particular transaction.\nTender is modelled as an aggregation of Cheque and Card. Both these tender types can exist in a single tender bid thus \'accountHolderName\' must exist separately in each of Cheque and Card as each could have a different account holder name.'"
 * @generated
 */
public interface Tender extends IdentifiedObject {
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
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender_Amount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount tendered by customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount tendered by customer.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' attribute.
	 * @see #setChange(float)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender_Change()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Difference between amount tendered by customer and the amount charged by point of sale.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Difference between amount tendered by customer and the amount charged by point of sale.'"
	 * @generated
	 */
	float getChange();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getChange <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' attribute.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(float value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.PaymentMetering.TenderKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.TenderKind
	 * @see #setKind(TenderKind)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of tender from customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of tender from customer.'"
	 * @generated
	 */
	TenderKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.TenderKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TenderKind value);

	/**
	 * Returns the value of the '<em><b>Receipt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getTenders <em>Tenders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt</em>' reference.
	 * @see #setReceipt(Receipt)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender_Receipt()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getTenders
	 * @model opposite="Tenders"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Receipt that recorded this receiving of a payment in the form of tenders.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Receipt that recorded this receiving of a payment in the form of tenders.'"
	 * @generated
	 */
	Receipt getReceipt();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getReceipt <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt</em>' reference.
	 * @see #getReceipt()
	 * @generated
	 */
	void setReceipt(Receipt value);

	/**
	 * Returns the value of the '<em><b>Cheque</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Cheque#getTender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cheque</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cheque</em>' reference.
	 * @see #setCheque(Cheque)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender_Cheque()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Cheque#getTender
	 * @model opposite="Tender"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cheque used to tender payment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cheque used to tender payment.'"
	 * @generated
	 */
	Cheque getCheque();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getCheque <em>Cheque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cheque</em>' reference.
	 * @see #getCheque()
	 * @generated
	 */
	void setCheque(Cheque value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Card#getTender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(Card)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender_Card()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Card#getTender
	 * @model opposite="Tender"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Card used to tender payment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Card used to tender payment.'"
	 * @generated
	 */
	Card getCard();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(Card value);

} // Tender
