/**
 */
package CIM.IEC61968.PaymentMetering;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cashier Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.CashierShift#getCashier <em>Cashier</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.CashierShift#getPointOfSale <em>Point Of Sale</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.CashierShift#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.CashierShift#getCashFloat <em>Cash Float</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.CashierShift#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashierShift()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The operating shift for a cashier, during which he may transact against the CashierShift, subject to VendorShift being open.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The operating shift for a cashier, during which he may transact against the CashierShift, subject to VendorShift being open.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The operating shift for a cashier, during which he may transact against the CashierShift, subject to VendorShift being open.' Profile\040documentation='The operating shift for a cashier, during which he may transact against the CashierShift, subject to VendorShift being open.'"
 * @generated
 */
public interface CashierShift extends Shift {
	/**
	 * Returns the value of the '<em><b>Cashier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Cashier#getCashierShifts <em>Cashier Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier</em>' reference.
	 * @see #setCashier(Cashier)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashierShift_Cashier()
	 * @see CIM.IEC61968.PaymentMetering.Cashier#getCashierShifts
	 * @model opposite="CashierShifts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cashier operating this shift.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cashier operating this shift.'"
	 * @generated
	 */
	Cashier getCashier();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.CashierShift#getCashier <em>Cashier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier</em>' reference.
	 * @see #getCashier()
	 * @generated
	 */
	void setCashier(Cashier value);

	/**
	 * Returns the value of the '<em><b>Point Of Sale</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of Sale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Sale</em>' reference.
	 * @see #setPointOfSale(PointOfSale)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashierShift_PointOfSale()
	 * @see CIM.IEC61968.PaymentMetering.PointOfSale#getCashierShifts
	 * @model opposite="CashierShifts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Point of sale that is in operation during this shift.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Point of sale that is in operation during this shift.'"
	 * @generated
	 */
	PointOfSale getPointOfSale();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.CashierShift#getPointOfSale <em>Point Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Sale</em>' reference.
	 * @see #getPointOfSale()
	 * @generated
	 */
	void setPointOfSale(PointOfSale value);

	/**
	 * Returns the value of the '<em><b>Receipts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.Receipt}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Receipt#getCashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashierShift_Receipts()
	 * @see CIM.IEC61968.PaymentMetering.Receipt#getCashierShift
	 * @model opposite="CashierShift"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All Receipts recorded for this Shift.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All Receipts recorded for this Shift.'"
	 * @generated
	 */
	EList<Receipt> getReceipts();

	/**
	 * Returns the value of the '<em><b>Cash Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cash Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cash Float</em>' attribute.
	 * @see #setCashFloat(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashierShift_CashFloat()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount of cash that the cashier brings with him to start his shift and that he will take away at the end of his shift; i.e. the cash float does not get banked.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount of cash that the cashier brings with him to start his shift and that he will take away at the end of his shift; i.e. the cash float does not get banked.'"
	 * @generated
	 */
	float getCashFloat();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.CashierShift#getCashFloat <em>Cash Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cash Float</em>' attribute.
	 * @see #getCashFloat()
	 * @generated
	 */
	void setCashFloat(float value);

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Transaction#getCashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashierShift_Transactions()
	 * @see CIM.IEC61968.PaymentMetering.Transaction#getCashierShift
	 * @model opposite="CashierShift"
	 * @generated
	 */
	EList<Transaction> getTransactions();

} // CashierShift
