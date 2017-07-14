/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getCashierShift <em>Cashier Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getTenders <em>Tenders</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#isIsBankable <em>Is Bankable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Record of total receipted payment from customer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Record of total receipted payment from customer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Record of total receipted payment from customer.' Profile\040documentation='Record of total receipted payment from customer.'"
 * @generated
 */
public interface Receipt extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Transaction#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt_Transactions()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Transaction#getReceipt
	 * @model opposite="Receipt"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All transactions recorded for this receipted payment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All transactions recorded for this receipted payment.'"
	 * @generated
	 */
	EList<Transaction> getTransactions();

	/**
	 * Returns the value of the '<em><b>Cashier Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.CashierShift#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier Shift</em>' reference.
	 * @see #setCashierShift(CashierShift)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt_CashierShift()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.CashierShift#getReceipts
	 * @model opposite="Receipts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cashier shift during which this receipt was recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cashier shift during which this receipt was recorded.'"
	 * @generated
	 */
	CashierShift getCashierShift();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getCashierShift <em>Cashier Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier Shift</em>' reference.
	 * @see #getCashierShift()
	 * @generated
	 */
	void setCashierShift(CashierShift value);

	/**
	 * Returns the value of the '<em><b>Tenders</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.PaymentMetering.Tender}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Tender#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenders</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt_Tenders()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Tender#getReceipt
	 * @model opposite="Receipt"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All payments received in the form of tenders recorded by this receipt.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All payments received in the form of tenders recorded by this receipt.'"
	 * @generated
	 */
	EList<Tender> getTenders();

	/**
	 * Returns the value of the '<em><b>Vendor Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.VendorShift#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Shift</em>' reference.
	 * @see #setVendorShift(VendorShift)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt_VendorShift()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.VendorShift#getReceipts
	 * @model opposite="Receipts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Vendor shift during which this receipt was recorded.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Vendor shift during which this receipt was recorded.'"
	 * @generated
	 */
	VendorShift getVendorShift();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getVendorShift <em>Vendor Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Shift</em>' reference.
	 * @see #getVendorShift()
	 * @generated
	 */
	void setVendorShift(VendorShift value);

	/**
	 * Returns the value of the '<em><b>Is Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bankable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bankable</em>' attribute.
	 * @see #setIsBankable(boolean)
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt_IsBankable()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this receipted payment is manually bankable, otherwise it is an electronic funds transfer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this receipted payment is manually bankable, otherwise it is an electronic funds transfer.'"
	 * @generated
	 */
	boolean isIsBankable();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#isIsBankable <em>Is Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bankable</em>' attribute.
	 * @see #isIsBankable()
	 * @generated
	 */
	void setIsBankable(boolean value);

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
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt_Line()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Receipted amount with rounding, date and note.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Receipted amount with rounding, date and note.'"
	 * @generated
	 */
	LineDetail getLine();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.PaymentMetering.Receipt#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(LineDetail value);

} // Receipt
