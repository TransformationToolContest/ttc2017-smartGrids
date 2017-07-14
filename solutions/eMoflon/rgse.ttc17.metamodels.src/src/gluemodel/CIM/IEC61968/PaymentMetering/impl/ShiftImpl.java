/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Shift;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ReceiptSummary;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.TransactionSummary;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ShiftImpl#getTransactionsGrandTotal <em>Transactions Grand Total</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ShiftImpl#getActivityInterval <em>Activity Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ShiftImpl#getTransactionSummaries <em>Transaction Summaries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ShiftImpl#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ShiftImpl#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ShiftImpl#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ShiftImpl#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ShiftImpl#getReceiptSummaries <em>Receipt Summaries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShiftImpl extends IdentifiedObjectImpl implements Shift {
	/**
	 * The default value of the '{@link #getTransactionsGrandTotal() <em>Transactions Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSACTIONS_GRAND_TOTAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransactionsGrandTotal() <em>Transactions Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected float transactionsGrandTotal = TRANSACTIONS_GRAND_TOTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivityInterval() <em>Activity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval activityInterval;

	/**
	 * The cached value of the '{@link #getTransactionSummaries() <em>Transaction Summaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionSummaries()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionSummary> transactionSummaries;

	/**
	 * The default value of the '{@link #getReceiptsGrandTotalRounding() <em>Receipts Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalRounding()
	 * @generated
	 * @ordered
	 */
	protected static final float RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReceiptsGrandTotalRounding() <em>Receipts Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalRounding()
	 * @generated
	 * @ordered
	 */
	protected float receiptsGrandTotalRounding = RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionsGrandTotalRounding() <em>Transactions Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsGrandTotalRounding()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransactionsGrandTotalRounding() <em>Transactions Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsGrandTotalRounding()
	 * @generated
	 * @ordered
	 */
	protected float transactionsGrandTotalRounding = TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiptsGrandTotalNonBankable() <em>Receipts Grand Total Non Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalNonBankable()
	 * @generated
	 * @ordered
	 */
	protected static final float RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReceiptsGrandTotalNonBankable() <em>Receipts Grand Total Non Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalNonBankable()
	 * @generated
	 * @ordered
	 */
	protected float receiptsGrandTotalNonBankable = RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiptsGrandTotalBankable() <em>Receipts Grand Total Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalBankable()
	 * @generated
	 * @ordered
	 */
	protected static final float RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReceiptsGrandTotalBankable() <em>Receipts Grand Total Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalBankable()
	 * @generated
	 * @ordered
	 */
	protected float receiptsGrandTotalBankable = RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceiptSummaries() <em>Receipt Summaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptSummaries()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiptSummary> receiptSummaries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.SHIFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransactionsGrandTotal() {
		return transactionsGrandTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionsGrandTotal(float newTransactionsGrandTotal) {
		float oldTransactionsGrandTotal = transactionsGrandTotal;
		transactionsGrandTotal = newTransactionsGrandTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL, oldTransactionsGrandTotal, transactionsGrandTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getActivityInterval() {
		if (activityInterval != null && activityInterval.eIsProxy()) {
			InternalEObject oldActivityInterval = (InternalEObject)activityInterval;
			activityInterval = (DateTimeInterval)eResolveProxy(oldActivityInterval);
			if (activityInterval != oldActivityInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL, oldActivityInterval, activityInterval));
			}
		}
		return activityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetActivityInterval() {
		return activityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityInterval(DateTimeInterval newActivityInterval) {
		DateTimeInterval oldActivityInterval = activityInterval;
		activityInterval = newActivityInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL, oldActivityInterval, activityInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactionSummary> getTransactionSummaries() {
		if (transactionSummaries == null) {
			transactionSummaries = new EObjectWithInverseResolvingEList<TransactionSummary>(TransactionSummary.class, this, PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES, InfPaymentMeteringPackage.TRANSACTION_SUMMARY__SHIFT);
		}
		return transactionSummaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReceiptsGrandTotalRounding() {
		return receiptsGrandTotalRounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiptsGrandTotalRounding(float newReceiptsGrandTotalRounding) {
		float oldReceiptsGrandTotalRounding = receiptsGrandTotalRounding;
		receiptsGrandTotalRounding = newReceiptsGrandTotalRounding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING, oldReceiptsGrandTotalRounding, receiptsGrandTotalRounding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransactionsGrandTotalRounding() {
		return transactionsGrandTotalRounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionsGrandTotalRounding(float newTransactionsGrandTotalRounding) {
		float oldTransactionsGrandTotalRounding = transactionsGrandTotalRounding;
		transactionsGrandTotalRounding = newTransactionsGrandTotalRounding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING, oldTransactionsGrandTotalRounding, transactionsGrandTotalRounding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReceiptsGrandTotalNonBankable() {
		return receiptsGrandTotalNonBankable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiptsGrandTotalNonBankable(float newReceiptsGrandTotalNonBankable) {
		float oldReceiptsGrandTotalNonBankable = receiptsGrandTotalNonBankable;
		receiptsGrandTotalNonBankable = newReceiptsGrandTotalNonBankable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE, oldReceiptsGrandTotalNonBankable, receiptsGrandTotalNonBankable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReceiptsGrandTotalBankable() {
		return receiptsGrandTotalBankable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiptsGrandTotalBankable(float newReceiptsGrandTotalBankable) {
		float oldReceiptsGrandTotalBankable = receiptsGrandTotalBankable;
		receiptsGrandTotalBankable = newReceiptsGrandTotalBankable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE, oldReceiptsGrandTotalBankable, receiptsGrandTotalBankable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReceiptSummary> getReceiptSummaries() {
		if (receiptSummaries == null) {
			receiptSummaries = new EObjectWithInverseResolvingEList<ReceiptSummary>(ReceiptSummary.class, this, PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES, InfPaymentMeteringPackage.RECEIPT_SUMMARY__SHIFT);
		}
		return receiptSummaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactionSummaries()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiptSummaries()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES:
				return ((InternalEList<?>)getTransactionSummaries()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES:
				return ((InternalEList<?>)getReceiptSummaries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
				return getTransactionsGrandTotal();
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				if (resolve) return getActivityInterval();
				return basicGetActivityInterval();
			case PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES:
				return getTransactionSummaries();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
				return getReceiptsGrandTotalRounding();
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
				return getTransactionsGrandTotalRounding();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
				return getReceiptsGrandTotalNonBankable();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
				return getReceiptsGrandTotalBankable();
			case PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES:
				return getReceiptSummaries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
				setTransactionsGrandTotal((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				setActivityInterval((DateTimeInterval)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES:
				getTransactionSummaries().clear();
				getTransactionSummaries().addAll((Collection<? extends TransactionSummary>)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
				setReceiptsGrandTotalRounding((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
				setTransactionsGrandTotalRounding((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
				setReceiptsGrandTotalNonBankable((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
				setReceiptsGrandTotalBankable((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES:
				getReceiptSummaries().clear();
				getReceiptSummaries().addAll((Collection<? extends ReceiptSummary>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
				setTransactionsGrandTotal(TRANSACTIONS_GRAND_TOTAL_EDEFAULT);
				return;
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				setActivityInterval((DateTimeInterval)null);
				return;
			case PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES:
				getTransactionSummaries().clear();
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
				setReceiptsGrandTotalRounding(RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT);
				return;
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
				setTransactionsGrandTotalRounding(TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
				setReceiptsGrandTotalNonBankable(RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
				setReceiptsGrandTotalBankable(RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES:
				getReceiptSummaries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
				return transactionsGrandTotal != TRANSACTIONS_GRAND_TOTAL_EDEFAULT;
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				return activityInterval != null;
			case PaymentMeteringPackage.SHIFT__TRANSACTION_SUMMARIES:
				return transactionSummaries != null && !transactionSummaries.isEmpty();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
				return receiptsGrandTotalRounding != RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT;
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
				return transactionsGrandTotalRounding != TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
				return receiptsGrandTotalNonBankable != RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
				return receiptsGrandTotalBankable != RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT;
			case PaymentMeteringPackage.SHIFT__RECEIPT_SUMMARIES:
				return receiptSummaries != null && !receiptSummaries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (transactionsGrandTotal: ");
		result.append(transactionsGrandTotal);
		result.append(", receiptsGrandTotalRounding: ");
		result.append(receiptsGrandTotalRounding);
		result.append(", transactionsGrandTotalRounding: ");
		result.append(transactionsGrandTotalRounding);
		result.append(", receiptsGrandTotalNonBankable: ");
		result.append(receiptsGrandTotalNonBankable);
		result.append(", receiptsGrandTotalBankable: ");
		result.append(receiptsGrandTotalBankable);
		result.append(')');
		return result.toString();
	}

} //ShiftImpl
