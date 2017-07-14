/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatement;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketStatementLineItem;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Market Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl#getTradeDate <em>Trade Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl#getMarketStatementLineItem <em>Market Statement Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.impl.MarketStatementImpl#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketStatementImpl extends DocumentImpl implements MarketStatement {
	/**
	 * The default value of the '{@link #getTradeDate() <em>Trade Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRADE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTradeDate() <em>Trade Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeDate()
	 * @generated
	 * @ordered
	 */
	protected Date tradeDate = TRADE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDate = TRANSACTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarketStatementLineItem() <em>Market Statement Line Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketStatementLineItem()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketStatementLineItem> marketStatementLineItem;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarketOperationsPackage.Literals.MARKET_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTradeDate() {
		return tradeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradeDate(Date newTradeDate) {
		Date oldTradeDate = tradeDate;
		tradeDate = newTradeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT__TRADE_DATE, oldTradeDate, tradeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionDate(Date newTransactionDate) {
		Date oldTransactionDate = transactionDate;
		transactionDate = newTransactionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT__TRANSACTION_DATE, oldTransactionDate, transactionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketStatementLineItem> getMarketStatementLineItem() {
		if (marketStatementLineItem == null) {
			marketStatementLineItem = new EObjectWithInverseResolvingEList<MarketStatementLineItem>(MarketStatementLineItem.class, this, MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM, MarketOperationsPackage.MARKET_STATEMENT_LINE_ITEM__MARKET_STATEMENT);
		}
		return marketStatementLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarketOperationsPackage.MARKET_STATEMENT__START, oldStart, start));
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
			case MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarketStatementLineItem()).basicAdd(otherEnd, msgs);
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
			case MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM:
				return ((InternalEList<?>)getMarketStatementLineItem()).basicRemove(otherEnd, msgs);
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
			case MarketOperationsPackage.MARKET_STATEMENT__TRADE_DATE:
				return getTradeDate();
			case MarketOperationsPackage.MARKET_STATEMENT__TRANSACTION_DATE:
				return getTransactionDate();
			case MarketOperationsPackage.MARKET_STATEMENT__REFERENCE_NUMBER:
				return getReferenceNumber();
			case MarketOperationsPackage.MARKET_STATEMENT__END:
				return getEnd();
			case MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM:
				return getMarketStatementLineItem();
			case MarketOperationsPackage.MARKET_STATEMENT__START:
				return getStart();
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
			case MarketOperationsPackage.MARKET_STATEMENT__TRADE_DATE:
				setTradeDate((Date)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__TRANSACTION_DATE:
				setTransactionDate((Date)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__END:
				setEnd((Date)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM:
				getMarketStatementLineItem().clear();
				getMarketStatementLineItem().addAll((Collection<? extends MarketStatementLineItem>)newValue);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__START:
				setStart((Date)newValue);
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
			case MarketOperationsPackage.MARKET_STATEMENT__TRADE_DATE:
				setTradeDate(TRADE_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__END:
				setEnd(END_EDEFAULT);
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM:
				getMarketStatementLineItem().clear();
				return;
			case MarketOperationsPackage.MARKET_STATEMENT__START:
				setStart(START_EDEFAULT);
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
			case MarketOperationsPackage.MARKET_STATEMENT__TRADE_DATE:
				return TRADE_DATE_EDEFAULT == null ? tradeDate != null : !TRADE_DATE_EDEFAULT.equals(tradeDate);
			case MarketOperationsPackage.MARKET_STATEMENT__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case MarketOperationsPackage.MARKET_STATEMENT__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
			case MarketOperationsPackage.MARKET_STATEMENT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case MarketOperationsPackage.MARKET_STATEMENT__MARKET_STATEMENT_LINE_ITEM:
				return marketStatementLineItem != null && !marketStatementLineItem.isEmpty();
			case MarketOperationsPackage.MARKET_STATEMENT__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
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
		result.append(" (tradeDate: ");
		result.append(tradeDate);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(", end: ");
		result.append(end);
		result.append(", start: ");
		result.append(start);
		result.append(')');
		return result.toString();
	}

} //MarketStatementImpl
