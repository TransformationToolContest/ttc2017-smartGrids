/**
 */
package CIM.IEC61968.PaymentMetering;

import CIM.IEC61968.Common.DateTimeInterval;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary;
import CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Shift#getActivityInterval <em>Activity Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Shift#getTransactionSummaries <em>Transaction Summaries</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptSummaries <em>Receipt Summaries</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generally referring to a period of operation or work performed. Whether shift is open/closed can be derived from attributes \'activiryInterval.start\' and \'activityInterval.end\'.\nThe grand total for receipts (i.e., cumulative total of all actual receipted amounts during this shift; bankable + non-bankable; excludes rounding error totals) can be derived from Receipt attributes:\n=sum(Receipt.receiptAmount) ; includes bankable and non-bankable receipts.\nMust also reconcile against:\n=sum(receiptsGrandTotalBankable + receiptsGrandTotalNonBankable).\nMust also reconcile against ReceiptSummary:\n=sum(ReceiptSummary.receiptsTotal).\nThe attributes with \"GrandTotal\" defined in this class may need to be used when the source data is periodically flushed from the system and then these cannot be derived.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Generally referring to a period of operation or work performed. Whether shift is open/closed can be derived from attributes \'activiryInterval.start\' and \'activityInterval.end\'.\nThe grand total for receipts (i.e., cumulative total of all actual receipted amounts during this shift; bankable + non-bankable; excludes rounding error totals) can be derived from Receipt attributes:\n=sum(Receipt.receiptAmount) ; includes bankable and non-bankable receipts.\nMust also reconcile against:\n=sum(receiptsGrandTotalBankable + receiptsGrandTotalNonBankable).\nMust also reconcile against ReceiptSummary:\n=sum(ReceiptSummary.receiptsTotal).\nThe attributes with \"GrandTotal\" defined in this class may need to be used when the source data is periodically flushed from the system and then these cannot be derived.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generally referring to a period of operation or work performed. Whether shift is open/closed can be derived from attributes \'activiryInterval.start\' and \'activityInterval.end\'.\nThe grand total for receipts (i.e., cumulative total of all actual receipted amounts during this shift; bankable + non-bankable; excludes rounding error totals) can be derived from Receipt attributes:\n=sum(Receipt.receiptAmount) ; includes bankable and non-bankable receipts.\nMust also reconcile against:\n=sum(receiptsGrandTotalBankable + receiptsGrandTotalNonBankable).\nMust also reconcile against ReceiptSummary:\n=sum(ReceiptSummary.receiptsTotal).\nThe attributes with \"GrandTotal\" defined in this class may need to be used when the source data is periodically flushed from the system and then these cannot be derived.' Profile\040documentation='Generally referring to a period of operation or work performed. Whether shift is open/closed can be derived from attributes \'activiryInterval.start\' and \'activityInterval.end\'.\nThe grand total for receipts (i.e., cumulative total of all actual receipted amounts during this shift; bankable + non-bankable; excludes rounding error totals) can be derived from Receipt attributes:\n=sum(Receipt.receiptAmount) ; includes bankable and non-bankable receipts.\nMust also reconcile against:\n=sum(receiptsGrandTotalBankable + receiptsGrandTotalNonBankable).\nMust also reconcile against ReceiptSummary:\n=sum(ReceiptSummary.receiptsTotal).\nThe attributes with \"GrandTotal\" defined in this class may need to be used when the source data is periodically flushed from the system and then these cannot be derived.'"
 * @generated
 */
public interface Shift extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Transactions Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions Grand Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions Grand Total</em>' attribute.
	 * @see #setTransactionsGrandTotal(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift_TransactionsGrandTotal()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cumulative total of transacted amounts during this shift. Values are obtained from Transaction attributes:\n=sum(Transaction.transactionAmount). It must also reconcile against TransactionSummary:\n=sum(TransactionSummary.transactionsTotal).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cumulative total of transacted amounts during this shift. Values are obtained from Transaction attributes:\n=sum(Transaction.transactionAmount). It must also reconcile against TransactionSummary:\n=sum(TransactionSummary.transactionsTotal).'"
	 * @generated
	 */
	float getTransactionsGrandTotal();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactions Grand Total</em>' attribute.
	 * @see #getTransactionsGrandTotal()
	 * @generated
	 */
	void setTransactionsGrandTotal(float value);

	/**
	 * Returns the value of the '<em><b>Activity Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Interval</em>' reference.
	 * @see #setActivityInterval(DateTimeInterval)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift_ActivityInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Interval for activity of this shift.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Interval for activity of this shift.'"
	 * @generated
	 */
	DateTimeInterval getActivityInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Shift#getActivityInterval <em>Activity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Interval</em>' reference.
	 * @see #getActivityInterval()
	 * @generated
	 */
	void setActivityInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Transaction Summaries</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Summaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Summaries</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift_TransactionSummaries()
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getShift
	 * @model opposite="Shift"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All transaction summaries recorded for this shift.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All transaction summaries recorded for this shift.'"
	 * @generated
	 */
	EList<TransactionSummary> getTransactionSummaries();

	/**
	 * Returns the value of the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts Grand Total Rounding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts Grand Total Rounding</em>' attribute.
	 * @see #setReceiptsGrandTotalRounding(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift_ReceiptsGrandTotalRounding()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cumulative amount in error due to process rounding not reflected in receiptsGrandTotal. Values are obtained from Receipt attributes:\n=sum(Receipt.receiptRounding).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cumulative amount in error due to process rounding not reflected in receiptsGrandTotal. Values are obtained from Receipt attributes:\n=sum(Receipt.receiptRounding).'"
	 * @generated
	 */
	float getReceiptsGrandTotalRounding();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipts Grand Total Rounding</em>' attribute.
	 * @see #getReceiptsGrandTotalRounding()
	 * @generated
	 */
	void setReceiptsGrandTotalRounding(float value);

	/**
	 * Returns the value of the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions Grand Total Rounding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions Grand Total Rounding</em>' attribute.
	 * @see #setTransactionsGrandTotalRounding(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift_TransactionsGrandTotalRounding()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cumulative amount in error due to process rounding not reflected in transactionsGandTotal. Values are obtained from Transaction attributes:\n=sum(Transaction.transactionRounding).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cumulative amount in error due to process rounding not reflected in transactionsGandTotal. Values are obtained from Transaction attributes:\n=sum(Transaction.transactionRounding).'"
	 * @generated
	 */
	float getTransactionsGrandTotalRounding();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactions Grand Total Rounding</em>' attribute.
	 * @see #getTransactionsGrandTotalRounding()
	 * @generated
	 */
	void setTransactionsGrandTotalRounding(float value);

	/**
	 * Returns the value of the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts Grand Total Non Bankable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts Grand Total Non Bankable</em>' attribute.
	 * @see #setReceiptsGrandTotalNonBankable(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift_ReceiptsGrandTotalNonBankable()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total of amounts receipted during this shift that cannot be manually banked (card payments for example). Values are obtained from Receipt attributes:\n=sum(Receipt.receiptAmount) for all Receipt.bankable = false.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total of amounts receipted during this shift that cannot be manually banked (card payments for example). Values are obtained from Receipt attributes:\n=sum(Receipt.receiptAmount) for all Receipt.bankable = false.'"
	 * @generated
	 */
	float getReceiptsGrandTotalNonBankable();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipts Grand Total Non Bankable</em>' attribute.
	 * @see #getReceiptsGrandTotalNonBankable()
	 * @generated
	 */
	void setReceiptsGrandTotalNonBankable(float value);

	/**
	 * Returns the value of the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts Grand Total Bankable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts Grand Total Bankable</em>' attribute.
	 * @see #setReceiptsGrandTotalBankable(float)
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift_ReceiptsGrandTotalBankable()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total of amounts receipted during this shift that can be manually banked (cash and cheques for example). Values are obtained from Receipt attributes:\n=sum(Receipt.receiptAmount) for all Receipt.bankable = true.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total of amounts receipted during this shift that can be manually banked (cash and cheques for example). Values are obtained from Receipt attributes:\n=sum(Receipt.receiptAmount) for all Receipt.bankable = true.'"
	 * @generated
	 */
	float getReceiptsGrandTotalBankable();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipts Grand Total Bankable</em>' attribute.
	 * @see #getReceiptsGrandTotalBankable()
	 * @generated
	 */
	void setReceiptsGrandTotalBankable(float value);

	/**
	 * Returns the value of the '<em><b>Receipt Summaries</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Summaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Summaries</em>' reference list.
	 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift_ReceiptSummaries()
	 * @see CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary#getShift
	 * @model opposite="Shift"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All receipt summaries for this shift.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All receipt summaries for this shift.'"
	 * @generated
	 */
	EList<ReceiptSummary> getReceiptSummaries();

} // Shift
