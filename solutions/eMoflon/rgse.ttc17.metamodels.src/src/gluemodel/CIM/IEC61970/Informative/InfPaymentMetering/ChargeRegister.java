/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit;
import gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getChargeKind <em>Charge Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getSPAccountingFunction <em>SP Accounting Function</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getChargeAmount <em>Charge Amount</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getChargeRegister()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Accumulated charges transacted per ChargeKind for a given function. There could be several of these registers, one for each ChargeKind; depending on the application.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Accumulated charges transacted per ChargeKind for a given function. There could be several of these registers, one for each ChargeKind; depending on the application.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Accumulated charges transacted per ChargeKind for a given function. There could be several of these registers, one for each ChargeKind; depending on the application.' Profile\040documentation='Accumulated charges transacted per ChargeKind for a given function. There could be several of these registers, one for each ChargeKind; depending on the application.'"
 * @generated
 */
public interface ChargeRegister extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Charge Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind
	 * @see #setChargeKind(ChargeKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getChargeRegister_ChargeKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Several different types of charges are typically implemented in the case of a prepayment meter.\nFor example: a charge according to a tariff for consumption and possibly a demand component, or a charge for a debt that is loaded in the meter to be recovered on a time basis, or a standing charge to be levied at the end of each billing period, or a tax charge loaded in the meter to be recovered on a consumption basis or a time basis.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Several different types of charges are typically implemented in the case of a prepayment meter.\nFor example: a charge according to a tariff for consumption and possibly a demand component, or a charge for a debt that is loaded in the meter to be recovered on a time basis, or a standing charge to be levied at the end of each billing period, or a tax charge loaded in the meter to be recovered on a consumption basis or a time basis.'"
	 * @generated
	 */
	ChargeKind getChargeKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getChargeKind <em>Charge Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind
	 * @see #getChargeKind()
	 * @generated
	 */
	void setChargeKind(ChargeKind value);

	/**
	 * Returns the value of the '<em><b>SP Accounting Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getChargeRegisters <em>Charge Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SP Accounting Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SP Accounting Function</em>' reference.
	 * @see #setSPAccountingFunction(SDPAccountingFunction)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getChargeRegister_SPAccountingFunction()
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getChargeRegisters
	 * @model opposite="ChargeRegisters"
	 * @generated
	 */
	SDPAccountingFunction getSPAccountingFunction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getSPAccountingFunction <em>SP Accounting Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SP Accounting Function</em>' reference.
	 * @see #getSPAccountingFunction()
	 * @generated
	 */
	void setSPAccountingFunction(SDPAccountingFunction value);

	/**
	 * Returns the value of the '<em><b>Charge Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Amount</em>' reference.
	 * @see #setChargeAmount(AccountingUnit)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getChargeRegister_ChargeAmount()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Charge amount in favour of the supplier. The units are either in currency units or service units, depending on the value of \'AccountingUnit.accountingMode\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Charge amount in favour of the supplier. The units are either in currency units or service units, depending on the value of \'AccountingUnit.accountingMode\'.'"
	 * @generated
	 */
	AccountingUnit getChargeAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getChargeAmount <em>Charge Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Amount</em>' reference.
	 * @see #getChargeAmount()
	 * @generated
	 */
	void setChargeAmount(AccountingUnit value);

} // ChargeRegister
