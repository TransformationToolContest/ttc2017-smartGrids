/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61968.Customers.CustomerAccount;
import CIM.IEC61968.Customers.PricingStructure;

import CIM.IEC61968.Metering.MeterAsset;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getServiceUnitsError <em>Service Units Error</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getReversedId <em>Reversed Id</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getMeterAsset <em>Meter Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getLine <em>Line</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getReceiverReference <em>Receiver Reference</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getDonorReference <em>Donor Reference</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getCashierShift <em>Cashier Shift</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getPricingStructure <em>Pricing Structure</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Transaction#getDiverseReference <em>Diverse Reference</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The record of details of payment for service or token sale.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The record of details of payment for service or token sale.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The record of details of payment for service or token sale.' Profile\040documentation='The record of details of payment for service or token sale.'"
 * @generated
 */
public interface Transaction extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.PaymentMetering.TransactionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.PaymentMetering.TransactionKind
	 * @see #setKind(TransactionKind)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of transaction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of transaction.'"
	 * @generated
	 */
	TransactionKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.PaymentMetering.TransactionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransactionKind value);

	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Common.UserAttribute#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_UserAttributes()
	 * @see CIM.IEC61968.Common.UserAttribute#getTransaction
	 * @model opposite="Transaction"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All snapshots of meter parameters recorded at the time of this transaction. Use \'name\' and \'value.value\' attributes to specify name and value of a parameter from meter.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All snapshots of meter parameters recorded at the time of this transaction. Use \'name\' and \'value.value\' attributes to specify name and value of a parameter from meter.'"
	 * @generated
	 */
	EList<UserAttribute> getUserAttributes();

	/**
	 * Returns the value of the '<em><b>Service Units Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Units Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Units Error</em>' attribute.
	 * @see #setServiceUnitsError(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_ServiceUnitsError()
	 * @model dataType="CIM.IEC61970.Domain.RealEnergy" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of service units not reflected in \'serviceUnitsEnergy\' due to process rounding or truncating errors.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of service units not reflected in \'serviceUnitsEnergy\' due to process rounding or truncating errors.'"
	 * @generated
	 */
	float getServiceUnitsError();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getServiceUnitsError <em>Service Units Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Units Error</em>' attribute.
	 * @see #getServiceUnitsError()
	 * @generated
	 */
	void setServiceUnitsError(float value);

	/**
	 * Returns the value of the '<em><b>Reversed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reversed Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reversed Id</em>' attribute.
	 * @see #setReversedId(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_ReversedId()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if \'kind\' is transactionReversal) Reference to the original transaction that is being reversed by this transaction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if \'kind\' is transactionReversal) Reference to the original transaction that is being reversed by this transaction.'"
	 * @generated
	 */
	String getReversedId();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getReversedId <em>Reversed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reversed Id</em>' attribute.
	 * @see #getReversedId()
	 * @generated
	 */
	void setReversedId(String value);

	/**
	 * Returns the value of the '<em><b>Meter Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.MeterAsset#getVendingTransactions <em>Vending Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Asset</em>' reference.
	 * @see #setMeterAsset(MeterAsset)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_MeterAsset()
	 * @see CIM.IEC61968.Metering.MeterAsset#getVendingTransactions
	 * @model opposite="VendingTransactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter asset for this vending transaction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter asset for this vending transaction.'"
	 * @generated
	 */
	MeterAsset getMeterAsset();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getMeterAsset <em>Meter Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Asset</em>' reference.
	 * @see #getMeterAsset()
	 * @generated
	 */
	void setMeterAsset(MeterAsset value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference.
	 * @see #setLine(LineDetail)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_Line()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Transaction amount, rounding, date and note for this transaction line.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Transaction amount, rounding, date and note for this transaction line.'"
	 * @generated
	 */
	LineDetail getLine();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(LineDetail value);

	/**
	 * Returns the value of the '<em><b>Receiver Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Reference</em>' attribute.
	 * @see #setReceiverReference(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_ReceiverReference()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reference to the entity that is the recipient of \'amount\' (for example, supplier for service charge payment; or tax receiver for VAT).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reference to the entity that is the recipient of \'amount\' (for example, supplier for service charge payment; or tax receiver for VAT).'"
	 * @generated
	 */
	String getReceiverReference();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getReceiverReference <em>Receiver Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Reference</em>' attribute.
	 * @see #getReceiverReference()
	 * @generated
	 */
	void setReceiverReference(String value);

	/**
	 * Returns the value of the '<em><b>Donor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donor Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donor Reference</em>' attribute.
	 * @see #setDonorReference(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_DonorReference()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reference to the entity that is the source of \'amount\' (for example: customer for token purchase; or supplier for free issue token).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reference to the entity that is the source of \'amount\' (for example: customer for token purchase; or supplier for free issue token).'"
	 * @generated
	 */
	String getDonorReference();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getDonorReference <em>Donor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donor Reference</em>' attribute.
	 * @see #getDonorReference()
	 * @generated
	 */
	void setDonorReference(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.VendorShift#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Shift</em>' reference.
	 * @see #setVendorShift(VendorShift)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_VendorShift()
	 * @see CIM.IEC61968.PaymentMetering.VendorShift#getTransactions
	 * @model opposite="Transactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Vendor shift during which this transaction was recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Vendor shift during which this transaction was recorded.'"
	 * @generated
	 */
	VendorShift getVendorShift();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getVendorShift <em>Vendor Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Shift</em>' reference.
	 * @see #getVendorShift()
	 * @generated
	 */
	void setVendorShift(VendorShift value);

	/**
	 * Returns the value of the '<em><b>Cashier Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.CashierShift#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier Shift</em>' reference.
	 * @see #setCashierShift(CashierShift)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_CashierShift()
	 * @see CIM.IEC61968.PaymentMetering.CashierShift#getTransactions
	 * @model opposite="Transactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cashier shift during which this transaction was recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cashier shift during which this transaction was recorded.'"
	 * @generated
	 */
	CashierShift getCashierShift();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getCashierShift <em>Cashier Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier Shift</em>' reference.
	 * @see #getCashierShift()
	 * @generated
	 */
	void setCashierShift(CashierShift value);

	/**
	 * Returns the value of the '<em><b>Auxiliary Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Account</em>' reference.
	 * @see #setAuxiliaryAccount(AuxiliaryAccount)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_AuxiliaryAccount()
	 * @see CIM.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions
	 * @model opposite="PaymentTransactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Auxiliary account for this payment transaction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Auxiliary account for this payment transaction.'"
	 * @generated
	 */
	AuxiliaryAccount getAuxiliaryAccount();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary Account</em>' reference.
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	void setAuxiliaryAccount(AuxiliaryAccount value);

	/**
	 * Returns the value of the '<em><b>Pricing Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.PricingStructure#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structure</em>' reference.
	 * @see #setPricingStructure(PricingStructure)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_PricingStructure()
	 * @see CIM.IEC61968.Customers.PricingStructure#getTransactions
	 * @model opposite="Transactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pricing structure applicable for this transaction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pricing structure applicable for this transaction.'"
	 * @generated
	 */
	PricingStructure getPricingStructure();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getPricingStructure <em>Pricing Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Structure</em>' reference.
	 * @see #getPricingStructure()
	 * @generated
	 */
	void setPricingStructure(PricingStructure value);

	/**
	 * Returns the value of the '<em><b>Service Units Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Units Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Units Energy</em>' attribute.
	 * @see #setServiceUnitsEnergy(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_ServiceUnitsEnergy()
	 * @model dataType="CIM.IEC61970.Domain.RealEnergy" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Actual amount of service units that is being paid for.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Actual amount of service units that is being paid for.'"
	 * @generated
	 */
	float getServiceUnitsEnergy();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Units Energy</em>' attribute.
	 * @see #getServiceUnitsEnergy()
	 * @generated
	 */
	void setServiceUnitsEnergy(float value);

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_CustomerAccount()
	 * @see CIM.IEC61968.Customers.CustomerAccount#getPaymentTransactions
	 * @model opposite="PaymentTransactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Customer account for this payment transaction.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Customer account for this payment transaction.'"
	 * @generated
	 */
	CustomerAccount getCustomerAccount();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getCustomerAccount <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Account</em>' reference.
	 * @see #getCustomerAccount()
	 * @generated
	 */
	void setCustomerAccount(CustomerAccount value);

	/**
	 * Returns the value of the '<em><b>Receipt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Receipt#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt</em>' reference.
	 * @see #setReceipt(Receipt)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_Receipt()
	 * @see CIM.IEC61968.PaymentMetering.Receipt#getTransactions
	 * @model opposite="Transactions"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The receipted payment for which this transaction has been recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The receipted payment for which this transaction has been recorded.'"
	 * @generated
	 */
	Receipt getReceipt();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getReceipt <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt</em>' reference.
	 * @see #getReceipt()
	 * @generated
	 */
	void setReceipt(Receipt value);

	/**
	 * Returns the value of the '<em><b>Diverse Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diverse Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diverse Reference</em>' attribute.
	 * @see #setDiverseReference(String)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction_DiverseReference()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Formal reference for use with diverse payment (traffic fine for example).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Formal reference for use with diverse payment (traffic fine for example).'"
	 * @generated
	 */
	String getDiverseReference();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Transaction#getDiverseReference <em>Diverse Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diverse Reference</em>' attribute.
	 * @see #getDiverseReference()
	 * @generated
	 */
	void setDiverseReference(String value);

} // Transaction
