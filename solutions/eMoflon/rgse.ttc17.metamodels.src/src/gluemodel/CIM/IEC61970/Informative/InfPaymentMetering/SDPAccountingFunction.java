/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering;

import gluemodel.CIM.IEC61968.Customers.ServiceCategory;

import gluemodel.CIM.IEC61968.Metering.DeviceFunction;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDP Accounting Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getAvailableCredit <em>Available Credit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditRegisters <em>Credit Registers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getChargeRegisters <em>Charge Registers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getLowCreditWarningLevel <em>Low Credit Warning Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditExpiryLevel <em>Credit Expiry Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getServiceKind <em>Service Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getSDPAccountingFunction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Service delivery point accounting function, particularly for payment meter.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Service delivery point accounting function, particularly for payment meter.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Service delivery point accounting function, particularly for payment meter.' Profile\040documentation='Service delivery point accounting function, particularly for payment meter.'"
 * @generated
 */
public interface SDPAccountingFunction extends DeviceFunction {
	/**
	 * Returns the value of the '<em><b>Available Credit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Credit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Credit</em>' reference.
	 * @see #setAvailableCredit(AccountingUnit)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getSDPAccountingFunction_AvailableCredit()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value is the balance of the sum of credits minus the sum of charges from the CreditRegisters and the ChargeRegisters. The sum might be complex function.\nThe units are either in currency units or service units, depending on the value of accountingMode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value is the balance of the sum of credits minus the sum of charges from the CreditRegisters and the ChargeRegisters. The sum might be complex function.\nThe units are either in currency units or service units, depending on the value of accountingMode.'"
	 * @generated
	 */
	AccountingUnit getAvailableCredit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getAvailableCredit <em>Available Credit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Credit</em>' reference.
	 * @see #getAvailableCredit()
	 * @generated
	 */
	void setAvailableCredit(AccountingUnit value);

	/**
	 * Returns the value of the '<em><b>Credit Registers</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getSDPAccountingFunction <em>SDP Accounting Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Registers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Registers</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getSDPAccountingFunction_CreditRegisters()
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister#getSDPAccountingFunction
	 * @model opposite="SDPAccountingFunction"
	 * @generated
	 */
	EList<CreditRegister> getCreditRegisters();

	/**
	 * Returns the value of the '<em><b>Charge Registers</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getSPAccountingFunction <em>SP Accounting Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Registers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Registers</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getSDPAccountingFunction_ChargeRegisters()
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister#getSPAccountingFunction
	 * @model opposite="SPAccountingFunction"
	 * @generated
	 */
	EList<ChargeRegister> getChargeRegisters();

	/**
	 * Returns the value of the '<em><b>Low Credit Warning Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Credit Warning Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Credit Warning Level</em>' reference.
	 * @see #setLowCreditWarningLevel(AccountingUnit)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getSDPAccountingFunction_LowCreditWarningLevel()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value is a predefined set point for the level of the availableCredit to reach when a warning will be indicated to the customer. It serves to warn the customer that it is time to purchase more credit in the case of a prepayment meter implementation.\nThe units are either in currency units or service units, depending on the value of accountingMode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value is a predefined set point for the level of the availableCredit to reach when a warning will be indicated to the customer. It serves to warn the customer that it is time to purchase more credit in the case of a prepayment meter implementation.\nThe units are either in currency units or service units, depending on the value of accountingMode.'"
	 * @generated
	 */
	AccountingUnit getLowCreditWarningLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getLowCreditWarningLevel <em>Low Credit Warning Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Credit Warning Level</em>' reference.
	 * @see #getLowCreditWarningLevel()
	 * @generated
	 */
	void setLowCreditWarningLevel(AccountingUnit value);

	/**
	 * Returns the value of the '<em><b>Credit Expiry Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Expiry Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Expiry Level</em>' reference.
	 * @see #setCreditExpiryLevel(AccountingUnit)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getSDPAccountingFunction_CreditExpiryLevel()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The value is a predefined set point for the level of the availableCredit to reach when the service will be interrupted. In the case of a prepayment meter the interruption is typically implemented by means of an electro-mechanical switch and the value is typically set = 0.\nThe units are either in currency units or service units, depending on the value of accountingMode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The value is a predefined set point for the level of the availableCredit to reach when the service will be interrupted. In the case of a prepayment meter the interruption is typically implemented by means of an electro-mechanical switch and the value is typically set = 0.\nThe units are either in currency units or service units, depending on the value of accountingMode.'"
	 * @generated
	 */
	AccountingUnit getCreditExpiryLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getCreditExpiryLevel <em>Credit Expiry Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Expiry Level</em>' reference.
	 * @see #getCreditExpiryLevel()
	 * @generated
	 */
	void setCreditExpiryLevel(AccountingUnit value);

	/**
	 * Returns the value of the '<em><b>Service Kind</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.ServiceCategory#getSPAccountingFunctions <em>SP Accounting Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Kind</em>' reference.
	 * @see #setServiceKind(ServiceCategory)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getSDPAccountingFunction_ServiceKind()
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceCategory#getSPAccountingFunctions
	 * @model opposite="SPAccountingFunctions"
	 * @generated
	 */
	ServiceCategory getServiceKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction#getServiceKind <em>Service Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Kind</em>' reference.
	 * @see #getServiceKind()
	 * @generated
	 */
	void setServiceKind(ServiceCategory value);

} // SDPAccountingFunction
