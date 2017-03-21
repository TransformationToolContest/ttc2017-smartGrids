/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering;

import CIM.Element;

import CIM.IEC61968.PaymentMetering.LineDetail;
import CIM.IEC61968.PaymentMetering.Shift;
import CIM.IEC61968.PaymentMetering.TenderKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getLine <em>Line</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getTenderKind <em>Tender Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getReceiptSummary()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Record of detail of receipts pertaining to one shift of operation (one record per \'tenderKind\').'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Record of detail of receipts pertaining to one shift of operation (one record per \'tenderKind\').'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Record of detail of receipts pertaining to one shift of operation (one record per \'tenderKind\').' Profile\040documentation='Record of detail of receipts pertaining to one shift of operation (one record per \'tenderKind\').'"
 * @generated
 */
public interface ReceiptSummary extends Element {
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
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getReceiptSummary_Line()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Totalised amount receipted during the shift for \'tenderKind\', i.e., sum of (\'Tender.amount\' - \'Tender.change\') per \'Tender.kind\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Totalised amount receipted during the shift for \'tenderKind\', i.e., sum of (\'Tender.amount\' - \'Tender.change\') per \'Tender.kind\'.'"
	 * @generated
	 */
	LineDetail getLine();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(LineDetail value);

	/**
	 * Returns the value of the '<em><b>Tender Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.PaymentMetering.TenderKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tender Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tender Kind</em>' attribute.
	 * @see CIM.IEC61968.PaymentMetering.TenderKind
	 * @see #setTenderKind(TenderKind)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getReceiptSummary_TenderKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='\'Tender.kind\' for which \'receiptsTotal\' is given.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='\'Tender.kind\' for which \'receiptsTotal\' is given.'"
	 * @generated
	 */
	TenderKind getTenderKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getTenderKind <em>Tender Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tender Kind</em>' attribute.
	 * @see CIM.IEC61968.PaymentMetering.TenderKind
	 * @see #getTenderKind()
	 * @generated
	 */
	void setTenderKind(TenderKind value);

	/**
	 * Returns the value of the '<em><b>Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptSummaries <em>Receipt Summaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' reference.
	 * @see #setShift(Shift)
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getReceiptSummary_Shift()
	 * @see CIM.IEC61968.PaymentMetering.Shift#getReceiptSummaries
	 * @model opposite="ReceiptSummaries"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Shift for which this summary is given.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Shift for which this summary is given.'"
	 * @generated
	 */
	Shift getShift();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getShift <em>Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' reference.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(Shift value);

} // ReceiptSummary
