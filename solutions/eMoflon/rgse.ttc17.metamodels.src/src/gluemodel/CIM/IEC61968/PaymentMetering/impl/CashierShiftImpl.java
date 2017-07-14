/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.Cashier;
import gluemodel.CIM.IEC61968.PaymentMetering.CashierShift;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.PointOfSale;
import gluemodel.CIM.IEC61968.PaymentMetering.Receipt;
import gluemodel.CIM.IEC61968.PaymentMetering.Transaction;

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
 * An implementation of the model object '<em><b>Cashier Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl#getCashier <em>Cashier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl#getPointOfSale <em>Point Of Sale</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl#getCashFloat <em>Cash Float</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CashierShiftImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashierShiftImpl extends ShiftImpl implements CashierShift {
	/**
	 * The cached value of the '{@link #getCashier() <em>Cashier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashier()
	 * @generated
	 * @ordered
	 */
	protected Cashier cashier;

	/**
	 * The cached value of the '{@link #getPointOfSale() <em>Point Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfSale()
	 * @generated
	 * @ordered
	 */
	protected PointOfSale pointOfSale;

	/**
	 * The cached value of the '{@link #getReceipts() <em>Receipts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipts()
	 * @generated
	 * @ordered
	 */
	protected EList<Receipt> receipts;

	/**
	 * The default value of the '{@link #getCashFloat() <em>Cash Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float CASH_FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCashFloat() <em>Cash Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashFloat()
	 * @generated
	 * @ordered
	 */
	protected float cashFloat = CASH_FLOAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashierShiftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CASHIER_SHIFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cashier getCashier() {
		if (cashier != null && cashier.eIsProxy()) {
			InternalEObject oldCashier = (InternalEObject)cashier;
			cashier = (Cashier)eResolveProxy(oldCashier);
			if (cashier != oldCashier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CASHIER_SHIFT__CASHIER, oldCashier, cashier));
			}
		}
		return cashier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cashier basicGetCashier() {
		return cashier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCashier(Cashier newCashier, NotificationChain msgs) {
		Cashier oldCashier = cashier;
		cashier = newCashier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CASHIER_SHIFT__CASHIER, oldCashier, newCashier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCashier(Cashier newCashier) {
		if (newCashier != cashier) {
			NotificationChain msgs = null;
			if (cashier != null)
				msgs = ((InternalEObject)cashier).eInverseRemove(this, PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs);
			if (newCashier != null)
				msgs = ((InternalEObject)newCashier).eInverseAdd(this, PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs);
			msgs = basicSetCashier(newCashier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CASHIER_SHIFT__CASHIER, newCashier, newCashier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale getPointOfSale() {
		if (pointOfSale != null && pointOfSale.eIsProxy()) {
			InternalEObject oldPointOfSale = (InternalEObject)pointOfSale;
			pointOfSale = (PointOfSale)eResolveProxy(oldPointOfSale);
			if (pointOfSale != oldPointOfSale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE, oldPointOfSale, pointOfSale));
			}
		}
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale basicGetPointOfSale() {
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOfSale(PointOfSale newPointOfSale, NotificationChain msgs) {
		PointOfSale oldPointOfSale = pointOfSale;
		pointOfSale = newPointOfSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE, oldPointOfSale, newPointOfSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOfSale(PointOfSale newPointOfSale) {
		if (newPointOfSale != pointOfSale) {
			NotificationChain msgs = null;
			if (pointOfSale != null)
				msgs = ((InternalEObject)pointOfSale).eInverseRemove(this, PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs);
			if (newPointOfSale != null)
				msgs = ((InternalEObject)newPointOfSale).eInverseAdd(this, PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs);
			msgs = basicSetPointOfSale(newPointOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE, newPointOfSale, newPointOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receipt> getReceipts() {
		if (receipts == null) {
			receipts = new EObjectWithInverseResolvingEList<Receipt>(Receipt.class, this, PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS, PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT);
		}
		return receipts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCashFloat() {
		return cashFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCashFloat(float newCashFloat) {
		float oldCashFloat = cashFloat;
		cashFloat = newCashFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT, oldCashFloat, cashFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS, PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT);
		}
		return transactions;
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
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				if (cashier != null)
					msgs = ((InternalEObject)cashier).eInverseRemove(this, PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs);
				return basicSetCashier((Cashier)otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				if (pointOfSale != null)
					msgs = ((InternalEObject)pointOfSale).eInverseRemove(this, PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs);
				return basicSetPointOfSale((PointOfSale)otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceipts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactions()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				return basicSetCashier(null, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				return basicSetPointOfSale(null, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				return ((InternalEList<?>)getReceipts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				if (resolve) return getCashier();
				return basicGetCashier();
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				if (resolve) return getPointOfSale();
				return basicGetPointOfSale();
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				return getReceipts();
			case PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT:
				return getCashFloat();
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				return getTransactions();
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
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				setCashier((Cashier)newValue);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				setPointOfSale((PointOfSale)newValue);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				getReceipts().clear();
				getReceipts().addAll((Collection<? extends Receipt>)newValue);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT:
				setCashFloat((Float)newValue);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
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
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				setCashier((Cashier)null);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				setPointOfSale((PointOfSale)null);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				getReceipts().clear();
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT:
				setCashFloat(CASH_FLOAT_EDEFAULT);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				getTransactions().clear();
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
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				return cashier != null;
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				return pointOfSale != null;
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				return receipts != null && !receipts.isEmpty();
			case PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT:
				return cashFloat != CASH_FLOAT_EDEFAULT;
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
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
		result.append(" (cashFloat: ");
		result.append(cashFloat);
		result.append(')');
		return result.toString();
	}

} //CashierShiftImpl
