/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit;
import gluemodel.CIM.IEC61968.PaymentMetering.CreditKind;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getCreditKind <em>Credit Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getSDPAccountingFunction <em>SDP Accounting Function</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getCreditRegister()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Accumulated credits transacted per CreditKind for a given function. There could be several of these registers, one for each CreditKind; depending on the application.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Accumulated credits transacted per CreditKind for a given function. There could be several of these registers, one for each CreditKind; depending on the application.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Accumulated credits transacted per CreditKind for a given function. There could be several of these registers, one for each CreditKind; depending on the application.' Profile\040documentation='Accumulated credits transacted per CreditKind for a given function. There could be several of these registers, one for each CreditKind; depending on the application.'"
 * @generated
 */
public interface CreditRegister extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Credit Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Amount</em>' reference.
	 * @see #setCreditAmount(AccountingUnit)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getCreditRegister_CreditAmount()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Credit amount in favour of the customer. The units are either in currency units or service units, depending on the value of \'AccountingUnit.accountingMode\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Credit amount in favour of the customer. The units are either in currency units or service units, depending on the value of \'AccountingUnit.accountingMode\'.'"
	 * @generated
	 */
	AccountingUnit getCreditAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getCreditAmount <em>Credit Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Amount</em>' reference.
	 * @see #getCreditAmount()
	 * @generated
	 */
	void setCreditAmount(AccountingUnit value);

	/**
	 * Returns the value of the '<em><b>Credit Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.PaymentMetering.CreditKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.CreditKind
	 * @see #setCreditKind(CreditKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getCreditRegister_CreditKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Several different types of credit are typically implemented in the case of a prepayment meter. \nFor example: credit transferred by means of a token carrier, or credit advanced automatically inside the meter under certain conditions, or credit held in reserved to be released under emergency conditions, or credit granted by local authority as a basic life support mechanism and may be dispensed automatically by the meter under certain conditions or credit available under severe climate conditions such as during winter over a weekend.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Several different types of credit are typically implemented in the case of a prepayment meter. \nFor example: credit transferred by means of a token carrier, or credit advanced automatically inside the meter under certain conditions, or credit held in reserved to be released under emergency conditions, or credit granted by local authority as a basic life support mechanism and may be dispensed automatically by the meter under certain conditions or credit available under severe climate conditions such as during winter over a weekend.'"
	 * @generated
	 */
	CreditKind getCreditKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getCreditKind <em>Credit Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.CreditKind
	 * @see #getCreditKind()
	 * @generated
	 */
	void setCreditKind(CreditKind value);

	/**
	 * Returns the value of the '<em><b>SDP Accounting Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditRegisters <em>Credit Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDP Accounting Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDP Accounting Function</em>' reference.
	 * @see #setSDPAccountingFunction(SDPAccountingFunction)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getCreditRegister_SDPAccountingFunction()
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditRegisters
	 * @model opposite="CreditRegisters"
	 * @generated
	 */
	SDPAccountingFunction getSDPAccountingFunction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getSDPAccountingFunction <em>SDP Accounting Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDP Accounting Function</em>' reference.
	 * @see #getSDPAccountingFunction()
	 * @generated
	 */
	void setSDPAccountingFunction(SDPAccountingFunction value);

} // CreditRegister
