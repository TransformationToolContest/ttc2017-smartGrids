/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.MerchantAccount;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Receipt;
import gluemodel.CIM.IEC61968.PaymentMetering.Transaction;
import gluemodel.CIM.IEC61968.PaymentMetering.Vendor;
import gluemodel.CIM.IEC61968.PaymentMetering.VendorShift;

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
 * An implementation of the model object '<em><b>Vendor Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl#getMerchantDebitAmount <em>Merchant Debit Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl#getMerchantAccount <em>Merchant Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.VendorShiftImpl#isPosted <em>Posted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VendorShiftImpl extends ShiftImpl implements VendorShift {
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
	 * The default value of the '{@link #getMerchantDebitAmount() <em>Merchant Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float MERCHANT_DEBIT_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMerchantDebitAmount() <em>Merchant Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected float merchantDebitAmount = MERCHANT_DEBIT_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected Vendor vendor;

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
	 * The cached value of the '{@link #getMerchantAccount() <em>Merchant Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantAccount()
	 * @generated
	 * @ordered
	 */
	protected MerchantAccount merchantAccount;

	/**
	 * The default value of the '{@link #isPosted() <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPosted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPosted() <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPosted()
	 * @generated
	 * @ordered
	 */
	protected boolean posted = POSTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendorShiftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.VENDOR_SHIFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receipt> getReceipts() {
		if (receipts == null) {
			receipts = new EObjectWithInverseResolvingEList<Receipt>(Receipt.class, this, PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS, PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT);
		}
		return receipts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMerchantDebitAmount() {
		return merchantDebitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerchantDebitAmount(float newMerchantDebitAmount) {
		float oldMerchantDebitAmount = merchantDebitAmount;
		merchantDebitAmount = newMerchantDebitAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT, oldMerchantDebitAmount, merchantDebitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor getVendor() {
		if (vendor != null && vendor.eIsProxy()) {
			InternalEObject oldVendor = (InternalEObject)vendor;
			vendor = (Vendor)eResolveProxy(oldVendor);
			if (vendor != oldVendor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.VENDOR_SHIFT__VENDOR, oldVendor, vendor));
			}
		}
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor basicGetVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendor(Vendor newVendor, NotificationChain msgs) {
		Vendor oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.VENDOR_SHIFT__VENDOR, oldVendor, newVendor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(Vendor newVendor) {
		if (newVendor != vendor) {
			NotificationChain msgs = null;
			if (vendor != null)
				msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs);
			if (newVendor != null)
				msgs = ((InternalEObject)newVendor).eInverseAdd(this, PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs);
			msgs = basicSetVendor(newVendor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.VENDOR_SHIFT__VENDOR, newVendor, newVendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS, PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT);
		}
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAccount getMerchantAccount() {
		if (merchantAccount != null && merchantAccount.eIsProxy()) {
			InternalEObject oldMerchantAccount = (InternalEObject)merchantAccount;
			merchantAccount = (MerchantAccount)eResolveProxy(oldMerchantAccount);
			if (merchantAccount != oldMerchantAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT, oldMerchantAccount, merchantAccount));
			}
		}
		return merchantAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAccount basicGetMerchantAccount() {
		return merchantAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMerchantAccount(MerchantAccount newMerchantAccount, NotificationChain msgs) {
		MerchantAccount oldMerchantAccount = merchantAccount;
		merchantAccount = newMerchantAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT, oldMerchantAccount, newMerchantAccount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerchantAccount(MerchantAccount newMerchantAccount) {
		if (newMerchantAccount != merchantAccount) {
			NotificationChain msgs = null;
			if (merchantAccount != null)
				msgs = ((InternalEObject)merchantAccount).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs);
			if (newMerchantAccount != null)
				msgs = ((InternalEObject)newMerchantAccount).eInverseAdd(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs);
			msgs = basicSetMerchantAccount(newMerchantAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT, newMerchantAccount, newMerchantAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPosted() {
		return posted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosted(boolean newPosted) {
		boolean oldPosted = posted;
		posted = newPosted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.VENDOR_SHIFT__POSTED, oldPosted, posted));
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
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceipts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				if (vendor != null)
					msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs);
				return basicSetVendor((Vendor)otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactions()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				if (merchantAccount != null)
					msgs = ((InternalEObject)merchantAccount).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs);
				return basicSetMerchantAccount((MerchantAccount)otherEnd, msgs);
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
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				return ((InternalEList<?>)getReceipts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				return basicSetVendor(null, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				return basicSetMerchantAccount(null, msgs);
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
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				return getReceipts();
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
				return getMerchantDebitAmount();
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				if (resolve) return getVendor();
				return basicGetVendor();
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
				return getTransactions();
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				if (resolve) return getMerchantAccount();
				return basicGetMerchantAccount();
			case PaymentMeteringPackage.VENDOR_SHIFT__POSTED:
				return isPosted();
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
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				getReceipts().clear();
				getReceipts().addAll((Collection<? extends Receipt>)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
				setMerchantDebitAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				setVendor((Vendor)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				setMerchantAccount((MerchantAccount)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__POSTED:
				setPosted((Boolean)newValue);
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
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				getReceipts().clear();
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
				setMerchantDebitAmount(MERCHANT_DEBIT_AMOUNT_EDEFAULT);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				setVendor((Vendor)null);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
				getTransactions().clear();
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				setMerchantAccount((MerchantAccount)null);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__POSTED:
				setPosted(POSTED_EDEFAULT);
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
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				return receipts != null && !receipts.isEmpty();
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
				return merchantDebitAmount != MERCHANT_DEBIT_AMOUNT_EDEFAULT;
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				return vendor != null;
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				return merchantAccount != null;
			case PaymentMeteringPackage.VENDOR_SHIFT__POSTED:
				return posted != POSTED_EDEFAULT;
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
		result.append(" (merchantDebitAmount: ");
		result.append(merchantDebitAmount);
		result.append(", posted: ");
		result.append(posted);
		result.append(')');
		return result.toString();
	}

} //VendorShiftImpl
