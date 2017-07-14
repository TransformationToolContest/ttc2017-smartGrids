/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61968.PaymentMetering.LineDetail;
import gluemodel.CIM.IEC61968.PaymentMetering.Shift;
import gluemodel.CIM.IEC61968.PaymentMetering.TransactionKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getTransactionKind <em>Transaction Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getLine <em>Line</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getTransactionSummary()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The record of detail of payment transactions pertaining to one shift of operation (one record per \'transactionKind\').'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The record of detail of payment transactions pertaining to one shift of operation (one record per \'transactionKind\').'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The record of detail of payment transactions pertaining to one shift of operation (one record per \'transactionKind\').' Profile\040documentation='The record of detail of payment transactions pertaining to one shift of operation (one record per \'transactionKind\').'"
 * @generated
 */
public interface TransactionSummary extends Element {
	/**
	 * Returns the value of the '<em><b>Transaction Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61968.PaymentMetering.TransactionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.TransactionKind
	 * @see #setTransactionKind(TransactionKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getTransactionSummary_TransactionKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='\'Transaction.kind\' for which \'transactionsTotal\' is given.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='\'Transaction.kind\' for which \'transactionsTotal\' is given.'"
	 * @generated
	 */
	TransactionKind getTransactionKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getTransactionKind <em>Transaction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.TransactionKind
	 * @see #getTransactionKind()
	 * @generated
	 */
	void setTransactionKind(TransactionKind value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getTransactionSummary_Line()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Totalised amount transacted during the shift for this specific \'transactionKind\', i.e., sum of \'Transaction.line.amount\' per \'Transaction.kind\'.\nCumulative amount of rounding errors due to process rounding not reflected in \'LineDetail.amount\' for \'transactionKind\', i.e., sum of \'Transaction.line.rounding\' per \'Transaction.kind\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Totalised amount transacted during the shift for this specific \'transactionKind\', i.e., sum of \'Transaction.line.amount\' per \'Transaction.kind\'.\nCumulative amount of rounding errors due to process rounding not reflected in \'LineDetail.amount\' for \'transactionKind\', i.e., sum of \'Transaction.line.rounding\' per \'Transaction.kind\'.'"
	 * @generated
	 */
	LineDetail getLine();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(LineDetail value);

	/**
	 * Returns the value of the '<em><b>Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.PaymentMetering.Shift#getTransactionSummaries <em>Transaction Summaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' reference.
	 * @see #setShift(Shift)
	 * @see gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage#getTransactionSummary_Shift()
	 * @see gluemodel.CIM.IEC61968.PaymentMetering.Shift#getTransactionSummaries
	 * @model opposite="TransactionSummaries"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Shift to which this summary applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Shift to which this summary applies.'"
	 * @generated
	 */
	Shift getShift();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary#getShift <em>Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' reference.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(Shift value);

} // TransactionSummary
