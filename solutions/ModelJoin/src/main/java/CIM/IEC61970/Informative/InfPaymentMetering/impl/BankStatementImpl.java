/**
 */
package CIM.IEC61970.Informative.InfPaymentMetering.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.PaymentMetering.MerchantAccount;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.Vendor;

import CIM.IEC61970.Informative.InfCommon.BankAccount;
import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import CIM.IEC61970.Informative.InfPaymentMetering.BankStatement;
import CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl#getMerchantCreditAmount <em>Merchant Credit Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl#getBankAccount <em>Bank Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl#getDepositAmount <em>Deposit Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl#getDepositDateTime <em>Deposit Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl#getMerchantAccount <em>Merchant Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfPaymentMetering.impl.BankStatementImpl#isPosted <em>Posted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankStatementImpl extends DocumentImpl implements BankStatement {
	/**
	 * The default value of the '{@link #getMerchantCreditAmount() <em>Merchant Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float MERCHANT_CREDIT_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMerchantCreditAmount() <em>Merchant Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected float merchantCreditAmount = MERCHANT_CREDIT_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBankAccount() <em>Bank Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAccount()
	 * @generated
	 * @ordered
	 */
	protected BankAccount bankAccount;

	/**
	 * The default value of the '{@link #getDepositAmount() <em>Deposit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float DEPOSIT_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDepositAmount() <em>Deposit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositAmount()
	 * @generated
	 * @ordered
	 */
	protected float depositAmount = DEPOSIT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepositDateTime() <em>Deposit Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEPOSIT_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepositDateTime() <em>Deposit Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepositDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date depositDateTime = DEPOSIT_DATE_TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected Vendor vendor;

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
	protected BankStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfPaymentMeteringPackage.Literals.BANK_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMerchantCreditAmount() {
		return merchantCreditAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerchantCreditAmount(float newMerchantCreditAmount) {
		float oldMerchantCreditAmount = merchantCreditAmount;
		merchantCreditAmount = newMerchantCreditAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_CREDIT_AMOUNT, oldMerchantCreditAmount, merchantCreditAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccount getBankAccount() {
		if (bankAccount != null && bankAccount.eIsProxy()) {
			InternalEObject oldBankAccount = (InternalEObject)bankAccount;
			bankAccount = (BankAccount)eResolveProxy(oldBankAccount);
			if (bankAccount != oldBankAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT, oldBankAccount, bankAccount));
			}
		}
		return bankAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccount basicGetBankAccount() {
		return bankAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBankAccount(BankAccount newBankAccount, NotificationChain msgs) {
		BankAccount oldBankAccount = bankAccount;
		bankAccount = newBankAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT, oldBankAccount, newBankAccount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankAccount(BankAccount newBankAccount) {
		if (newBankAccount != bankAccount) {
			NotificationChain msgs = null;
			if (bankAccount != null)
				msgs = ((InternalEObject)bankAccount).eInverseRemove(this, InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS, BankAccount.class, msgs);
			if (newBankAccount != null)
				msgs = ((InternalEObject)newBankAccount).eInverseAdd(this, InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS, BankAccount.class, msgs);
			msgs = basicSetBankAccount(newBankAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT, newBankAccount, newBankAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDepositAmount() {
		return depositAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepositAmount(float newDepositAmount) {
		float oldDepositAmount = depositAmount;
		depositAmount = newDepositAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_AMOUNT, oldDepositAmount, depositAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDepositDateTime() {
		return depositDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepositDateTime(Date newDepositDateTime) {
		Date oldDepositDateTime = depositDateTime;
		depositDateTime = newDepositDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_DATE_TIME, oldDepositDateTime, depositDateTime));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT, oldMerchantAccount, merchantAccount));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT, oldMerchantAccount, newMerchantAccount);
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
				msgs = ((InternalEObject)merchantAccount).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS, MerchantAccount.class, msgs);
			if (newMerchantAccount != null)
				msgs = ((InternalEObject)newMerchantAccount).eInverseAdd(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS, MerchantAccount.class, msgs);
			msgs = basicSetMerchantAccount(newMerchantAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT, newMerchantAccount, newMerchantAccount));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR, oldVendor, vendor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR, oldVendor, newVendor);
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
				msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__BANK_STATEMENTS, Vendor.class, msgs);
			if (newVendor != null)
				msgs = ((InternalEObject)newVendor).eInverseAdd(this, PaymentMeteringPackage.VENDOR__BANK_STATEMENTS, Vendor.class, msgs);
			msgs = basicSetVendor(newVendor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR, newVendor, newVendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK_STATEMENT__POSTED, oldPosted, posted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT:
				if (bankAccount != null)
					msgs = ((InternalEObject)bankAccount).eInverseRemove(this, InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS, BankAccount.class, msgs);
				return basicSetBankAccount((BankAccount)otherEnd, msgs);
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT:
				if (merchantAccount != null)
					msgs = ((InternalEObject)merchantAccount).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS, MerchantAccount.class, msgs);
				return basicSetMerchantAccount((MerchantAccount)otherEnd, msgs);
			case InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR:
				if (vendor != null)
					msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__BANK_STATEMENTS, Vendor.class, msgs);
				return basicSetVendor((Vendor)otherEnd, msgs);
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
			case InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT:
				return basicSetBankAccount(null, msgs);
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT:
				return basicSetMerchantAccount(null, msgs);
			case InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR:
				return basicSetVendor(null, msgs);
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
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_CREDIT_AMOUNT:
				return getMerchantCreditAmount();
			case InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT:
				if (resolve) return getBankAccount();
				return basicGetBankAccount();
			case InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_AMOUNT:
				return getDepositAmount();
			case InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_DATE_TIME:
				return getDepositDateTime();
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT:
				if (resolve) return getMerchantAccount();
				return basicGetMerchantAccount();
			case InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR:
				if (resolve) return getVendor();
				return basicGetVendor();
			case InfPaymentMeteringPackage.BANK_STATEMENT__POSTED:
				return isPosted();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_CREDIT_AMOUNT:
				setMerchantCreditAmount((Float)newValue);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT:
				setBankAccount((BankAccount)newValue);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_AMOUNT:
				setDepositAmount((Float)newValue);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_DATE_TIME:
				setDepositDateTime((Date)newValue);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT:
				setMerchantAccount((MerchantAccount)newValue);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR:
				setVendor((Vendor)newValue);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__POSTED:
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
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_CREDIT_AMOUNT:
				setMerchantCreditAmount(MERCHANT_CREDIT_AMOUNT_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT:
				setBankAccount((BankAccount)null);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_AMOUNT:
				setDepositAmount(DEPOSIT_AMOUNT_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_DATE_TIME:
				setDepositDateTime(DEPOSIT_DATE_TIME_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT:
				setMerchantAccount((MerchantAccount)null);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR:
				setVendor((Vendor)null);
				return;
			case InfPaymentMeteringPackage.BANK_STATEMENT__POSTED:
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
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_CREDIT_AMOUNT:
				return merchantCreditAmount != MERCHANT_CREDIT_AMOUNT_EDEFAULT;
			case InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT:
				return bankAccount != null;
			case InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_AMOUNT:
				return depositAmount != DEPOSIT_AMOUNT_EDEFAULT;
			case InfPaymentMeteringPackage.BANK_STATEMENT__DEPOSIT_DATE_TIME:
				return DEPOSIT_DATE_TIME_EDEFAULT == null ? depositDateTime != null : !DEPOSIT_DATE_TIME_EDEFAULT.equals(depositDateTime);
			case InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT:
				return merchantAccount != null;
			case InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR:
				return vendor != null;
			case InfPaymentMeteringPackage.BANK_STATEMENT__POSTED:
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
		result.append(" (merchantCreditAmount: ");
		result.append(merchantCreditAmount);
		result.append(", depositAmount: ");
		result.append(depositAmount);
		result.append(", depositDateTime: ");
		result.append(depositDateTime);
		result.append(", posted: ");
		result.append(posted);
		result.append(')');
		return result.toString();
	}

} //BankStatementImpl
