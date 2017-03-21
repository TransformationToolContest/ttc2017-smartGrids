/**
 */
package CIM.IEC61968.PaymentMetering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.VendorShift#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.VendorShift#getVendor <em>Vendor</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.VendorShift#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.VendorShift#getMerchantAccount <em>Merchant Account</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.VendorShift#isPosted <em>Posted</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The operating shift for a vendor during which he may transact against the merchant\'s account. It aggregates transactions and receipts during the shift and periodically debits a merchant account. The totals in VendorShift should always = sum of totals aggregated in all cashier shifts that were open under the particular vendor shift.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The operating shift for a vendor during which he may transact against the merchant\'s account. It aggregates transactions and receipts during the shift and periodically debits a merchant account. The totals in VendorShift should always = sum of totals aggregated in all cashier shifts that were open under the particular vendor shift.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The operating shift for a vendor during which he may transact against the merchant\'s account. It aggregates transactions and receipts during the shift and periodically debits a merchant account. The totals in VendorShift should always = sum of totals aggregated in all cashier shifts that were open under the particular vendor shift.' Profile\040documentation='The operating shift for a vendor during which he may transact against the merchant\'s account. It aggregates transactions and receipts during the shift and periodically debits a merchant account. The totals in VendorShift should always = sum of totals aggregated in all cashier shifts that were open under the particular vendor shift.'"
 * @generated
 */
public interface VendorShift extends Shift {
	/**
	 * Returns the value of the '<em><b>Receipts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.Receipt}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Receipt#getVendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift_Receipts()
	 * @see CIM.IEC61968.PaymentMetering.Receipt#getVendorShift
	 * @model opposite="VendorShift"
	 * @generated
	 */
	EList<Receipt> getReceipts();

	/**
	 * Returns the value of the '<em><b>Merchant Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Debit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Debit Amount</em>' attribute.
	 * @see #setMerchantDebitAmount(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift_MerchantDebitAmount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount that is to be debited from the merchant account for this vendor shift. This amount reflects the sum(PaymentTransaction.transactionAmount).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount that is to be debited from the merchant account for this vendor shift. This amount reflects the sum(PaymentTransaction.transactionAmount).'"
	 * @generated
	 */
	float getMerchantDebitAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Debit Amount</em>' attribute.
	 * @see #getMerchantDebitAmount()
	 * @generated
	 */
	void setMerchantDebitAmount(float value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Vendor#getVendorShifts <em>Vendor Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' reference.
	 * @see #setVendor(Vendor)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift_Vendor()
	 * @see CIM.IEC61968.PaymentMetering.Vendor#getVendorShifts
	 * @model opposite="VendorShifts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Vendor that opens and owns this vendor shift.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Vendor that opens and owns this vendor shift.'"
	 * @generated
	 */
	Vendor getVendor();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.VendorShift#getVendor <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' reference.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Vendor value);

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Transaction#getVendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift_Transactions()
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getVendorShift
	 * @model opposite="VendorShift"
	 * @generated
	 */
	EList<Transaction> getTransactions();

	/**
	 * Returns the value of the '<em><b>Merchant Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Account</em>' reference.
	 * @see #setMerchantAccount(MerchantAccount)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift_MerchantAccount()
	 * @see CIM.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts
	 * @model opposite="VendorShifts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Merchant account this vendor shift periodically debits (based on aggregated transactions).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Merchant account this vendor shift periodically debits (based on aggregated transactions).'"
	 * @generated
	 */
	MerchantAccount getMerchantAccount();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.VendorShift#getMerchantAccount <em>Merchant Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Account</em>' reference.
	 * @see #getMerchantAccount()
	 * @generated
	 */
	void setMerchantAccount(MerchantAccount value);

	/**
	 * Returns the value of the '<em><b>Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted</em>' attribute.
	 * @see #setPosted(boolean)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift_Posted()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='= true if merchantDebitAmount has been debited from MerchantAccount; typically happens at the end of VendorShift when it closes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='= true if merchantDebitAmount has been debited from MerchantAccount; typically happens at the end of VendorShift when it closes.'"
	 * @generated
	 */
	boolean isPosted();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.VendorShift#isPosted <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted</em>' attribute.
	 * @see #isPosted()
	 * @generated
	 */
	void setPosted(boolean value);

} // VendorShift
