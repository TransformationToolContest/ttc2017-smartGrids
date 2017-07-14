/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.CashierShift;
import gluemodel.CIM.IEC61968.PaymentMetering.LineDetail;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Receipt;
import gluemodel.CIM.IEC61968.PaymentMetering.Tender;
import gluemodel.CIM.IEC61968.PaymentMetering.Transaction;
import gluemodel.CIM.IEC61968.PaymentMetering.VendorShift;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ReceiptImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ReceiptImpl#getCashierShift <em>Cashier Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ReceiptImpl#getTenders <em>Tenders</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ReceiptImpl#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ReceiptImpl#isIsBankable <em>Is Bankable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ReceiptImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiptImpl extends IdentifiedObjectImpl implements Receipt {
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
	 * The cached value of the '{@link #getCashierShift() <em>Cashier Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashierShift()
	 * @generated
	 * @ordered
	 */
	protected CashierShift cashierShift;

	/**
	 * The cached value of the '{@link #getTenders() <em>Tenders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenders()
	 * @generated
	 * @ordered
	 */
	protected EList<Tender> tenders;

	/**
	 * The cached value of the '{@link #getVendorShift() <em>Vendor Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorShift()
	 * @generated
	 * @ordered
	 */
	protected VendorShift vendorShift;

	/**
	 * The default value of the '{@link #isIsBankable() <em>Is Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBankable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BANKABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBankable() <em>Is Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBankable()
	 * @generated
	 * @ordered
	 */
	protected boolean isBankable = IS_BANKABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected LineDetail line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.RECEIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, PaymentMeteringPackage.RECEIPT__TRANSACTIONS, PaymentMeteringPackage.TRANSACTION__RECEIPT);
		}
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierShift getCashierShift() {
		if (cashierShift != null && cashierShift.eIsProxy()) {
			InternalEObject oldCashierShift = (InternalEObject)cashierShift;
			cashierShift = (CashierShift)eResolveProxy(oldCashierShift);
			if (cashierShift != oldCashierShift) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT, oldCashierShift, cashierShift));
			}
		}
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierShift basicGetCashierShift() {
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCashierShift(CashierShift newCashierShift, NotificationChain msgs) {
		CashierShift oldCashierShift = cashierShift;
		cashierShift = newCashierShift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT, oldCashierShift, newCashierShift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCashierShift(CashierShift newCashierShift) {
		if (newCashierShift != cashierShift) {
			NotificationChain msgs = null;
			if (cashierShift != null)
				msgs = ((InternalEObject)cashierShift).eInverseRemove(this, PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs);
			if (newCashierShift != null)
				msgs = ((InternalEObject)newCashierShift).eInverseAdd(this, PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs);
			msgs = basicSetCashierShift(newCashierShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT, newCashierShift, newCashierShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tender> getTenders() {
		if (tenders == null) {
			tenders = new EObjectWithInverseResolvingEList<Tender>(Tender.class, this, PaymentMeteringPackage.RECEIPT__TENDERS, PaymentMeteringPackage.TENDER__RECEIPT);
		}
		return tenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorShift getVendorShift() {
		if (vendorShift != null && vendorShift.eIsProxy()) {
			InternalEObject oldVendorShift = (InternalEObject)vendorShift;
			vendorShift = (VendorShift)eResolveProxy(oldVendorShift);
			if (vendorShift != oldVendorShift) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT, oldVendorShift, vendorShift));
			}
		}
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorShift basicGetVendorShift() {
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorShift(VendorShift newVendorShift, NotificationChain msgs) {
		VendorShift oldVendorShift = vendorShift;
		vendorShift = newVendorShift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT, oldVendorShift, newVendorShift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorShift(VendorShift newVendorShift) {
		if (newVendorShift != vendorShift) {
			NotificationChain msgs = null;
			if (vendorShift != null)
				msgs = ((InternalEObject)vendorShift).eInverseRemove(this, PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs);
			if (newVendorShift != null)
				msgs = ((InternalEObject)newVendorShift).eInverseAdd(this, PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs);
			msgs = basicSetVendorShift(newVendorShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT, newVendorShift, newVendorShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBankable() {
		return isBankable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBankable(boolean newIsBankable) {
		boolean oldIsBankable = isBankable;
		isBankable = newIsBankable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.RECEIPT__IS_BANKABLE, oldIsBankable, isBankable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineDetail getLine() {
		if (line != null && line.eIsProxy()) {
			InternalEObject oldLine = (InternalEObject)line;
			line = (LineDetail)eResolveProxy(oldLine);
			if (line != oldLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.RECEIPT__LINE, oldLine, line));
			}
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineDetail basicGetLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(LineDetail newLine) {
		LineDetail oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.RECEIPT__LINE, oldLine, line));
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
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactions()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				if (cashierShift != null)
					msgs = ((InternalEObject)cashierShift).eInverseRemove(this, PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs);
				return basicSetCashierShift((CashierShift)otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTenders()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				if (vendorShift != null)
					msgs = ((InternalEObject)vendorShift).eInverseRemove(this, PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs);
				return basicSetVendorShift((VendorShift)otherEnd, msgs);
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
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				return basicSetCashierShift(null, msgs);
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				return ((InternalEList<?>)getTenders()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				return basicSetVendorShift(null, msgs);
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
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				return getTransactions();
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				if (resolve) return getCashierShift();
				return basicGetCashierShift();
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				return getTenders();
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				if (resolve) return getVendorShift();
				return basicGetVendorShift();
			case PaymentMeteringPackage.RECEIPT__IS_BANKABLE:
				return isIsBankable();
			case PaymentMeteringPackage.RECEIPT__LINE:
				if (resolve) return getLine();
				return basicGetLine();
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
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				setCashierShift((CashierShift)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				getTenders().clear();
				getTenders().addAll((Collection<? extends Tender>)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				setVendorShift((VendorShift)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__IS_BANKABLE:
				setIsBankable((Boolean)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__LINE:
				setLine((LineDetail)newValue);
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
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				getTransactions().clear();
				return;
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				setCashierShift((CashierShift)null);
				return;
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				getTenders().clear();
				return;
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				setVendorShift((VendorShift)null);
				return;
			case PaymentMeteringPackage.RECEIPT__IS_BANKABLE:
				setIsBankable(IS_BANKABLE_EDEFAULT);
				return;
			case PaymentMeteringPackage.RECEIPT__LINE:
				setLine((LineDetail)null);
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
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				return cashierShift != null;
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				return tenders != null && !tenders.isEmpty();
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				return vendorShift != null;
			case PaymentMeteringPackage.RECEIPT__IS_BANKABLE:
				return isBankable != IS_BANKABLE_EDEFAULT;
			case PaymentMeteringPackage.RECEIPT__LINE:
				return line != null;
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
		result.append(" (isBankable: ");
		result.append(isBankable);
		result.append(')');
		return result.toString();
	}

} //ReceiptImpl
