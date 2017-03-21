/**
 */
package CIM.IEC61968.PaymentMetering.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.PaymentMetering.MerchantAccount;
import CIM.IEC61968.PaymentMetering.MerchantAgreement;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.Transactor;
import CIM.IEC61968.PaymentMetering.Vendor;
import CIM.IEC61968.PaymentMetering.VendorShift;

import CIM.IEC61970.Informative.InfPaymentMetering.BankStatement;
import CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;

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
 * An implementation of the model object '<em><b>Merchant Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl#getBankStatements <em>Bank Statements</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl#getMerchantAgreement <em>Merchant Agreement</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl#getTransactors <em>Transactors</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl#getProvisionalBalance <em>Provisional Balance</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl#getCurrentBalance <em>Current Balance</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl#getVendors <em>Vendors</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.MerchantAccountImpl#getVendorShifts <em>Vendor Shifts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MerchantAccountImpl extends DocumentImpl implements MerchantAccount {
	/**
	 * The cached value of the '{@link #getBankStatements() <em>Bank Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<BankStatement> bankStatements;

	/**
	 * The cached value of the '{@link #getMerchantAgreement() <em>Merchant Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantAgreement()
	 * @generated
	 * @ordered
	 */
	protected MerchantAgreement merchantAgreement;

	/**
	 * The cached value of the '{@link #getTransactors() <em>Transactors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Transactor> transactors;

	/**
	 * The default value of the '{@link #getProvisionalBalance() <em>Provisional Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionalBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float PROVISIONAL_BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProvisionalBalance() <em>Provisional Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionalBalance()
	 * @generated
	 * @ordered
	 */
	protected float provisionalBalance = PROVISIONAL_BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentBalance() <em>Current Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentBalance() <em>Current Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBalance()
	 * @generated
	 * @ordered
	 */
	protected float currentBalance = CURRENT_BALANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendors() <em>Vendors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendors()
	 * @generated
	 * @ordered
	 */
	protected EList<Vendor> vendors;

	/**
	 * The cached value of the '{@link #getVendorShifts() <em>Vendor Shifts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<VendorShift> vendorShifts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MerchantAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.MERCHANT_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankStatement> getBankStatements() {
		if (bankStatements == null) {
			bankStatements = new EObjectWithInverseResolvingEList<BankStatement>(BankStatement.class, this, PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS, InfPaymentMeteringPackage.BANK_STATEMENT__MERCHANT_ACCOUNT);
		}
		return bankStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAgreement getMerchantAgreement() {
		if (merchantAgreement != null && merchantAgreement.eIsProxy()) {
			InternalEObject oldMerchantAgreement = (InternalEObject)merchantAgreement;
			merchantAgreement = (MerchantAgreement)eResolveProxy(oldMerchantAgreement);
			if (merchantAgreement != oldMerchantAgreement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT, oldMerchantAgreement, merchantAgreement));
			}
		}
		return merchantAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAgreement basicGetMerchantAgreement() {
		return merchantAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMerchantAgreement(MerchantAgreement newMerchantAgreement, NotificationChain msgs) {
		MerchantAgreement oldMerchantAgreement = merchantAgreement;
		merchantAgreement = newMerchantAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT, oldMerchantAgreement, newMerchantAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerchantAgreement(MerchantAgreement newMerchantAgreement) {
		if (newMerchantAgreement != merchantAgreement) {
			NotificationChain msgs = null;
			if (merchantAgreement != null)
				msgs = ((InternalEObject)merchantAgreement).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs);
			if (newMerchantAgreement != null)
				msgs = ((InternalEObject)newMerchantAgreement).eInverseAdd(this, PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs);
			msgs = basicSetMerchantAgreement(newMerchantAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT, newMerchantAgreement, newMerchantAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transactor> getTransactors() {
		if (transactors == null) {
			transactors = new EObjectWithInverseResolvingEList.ManyInverse<Transactor>(Transactor.class, this, PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS, PaymentMeteringPackage.TRANSACTOR__MERCHANT_ACCOUNTS);
		}
		return transactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProvisionalBalance() {
		return provisionalBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvisionalBalance(float newProvisionalBalance) {
		float oldProvisionalBalance = provisionalBalance;
		provisionalBalance = newProvisionalBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE, oldProvisionalBalance, provisionalBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentBalance() {
		return currentBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentBalance(float newCurrentBalance) {
		float oldCurrentBalance = currentBalance;
		currentBalance = newCurrentBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE, oldCurrentBalance, currentBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vendor> getVendors() {
		if (vendors == null) {
			vendors = new EObjectWithInverseResolvingEList<Vendor>(Vendor.class, this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS, PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT);
		}
		return vendors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorShift> getVendorShifts() {
		if (vendorShifts == null) {
			vendorShifts = new EObjectWithInverseResolvingEList<VendorShift>(VendorShift.class, this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT);
		}
		return vendorShifts;
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBankStatements()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				if (merchantAgreement != null)
					msgs = ((InternalEObject)merchantAgreement).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs);
				return basicSetMerchantAgreement((MerchantAgreement)otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactors()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVendors()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVendorShifts()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS:
				return ((InternalEList<?>)getBankStatements()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				return basicSetMerchantAgreement(null, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				return ((InternalEList<?>)getTransactors()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS:
				return ((InternalEList<?>)getVendors()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				return ((InternalEList<?>)getVendorShifts()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS:
				return getBankStatements();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				if (resolve) return getMerchantAgreement();
				return basicGetMerchantAgreement();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				return getTransactors();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
				return getProvisionalBalance();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
				return getCurrentBalance();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS:
				return getVendors();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				return getVendorShifts();
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS:
				getBankStatements().clear();
				getBankStatements().addAll((Collection<? extends BankStatement>)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				setMerchantAgreement((MerchantAgreement)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				getTransactors().clear();
				getTransactors().addAll((Collection<? extends Transactor>)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
				setProvisionalBalance((Float)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
				setCurrentBalance((Float)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS:
				getVendors().clear();
				getVendors().addAll((Collection<? extends Vendor>)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				getVendorShifts().clear();
				getVendorShifts().addAll((Collection<? extends VendorShift>)newValue);
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS:
				getBankStatements().clear();
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				setMerchantAgreement((MerchantAgreement)null);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				getTransactors().clear();
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
				setProvisionalBalance(PROVISIONAL_BALANCE_EDEFAULT);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
				setCurrentBalance(CURRENT_BALANCE_EDEFAULT);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS:
				getVendors().clear();
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				getVendorShifts().clear();
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__BANK_STATEMENTS:
				return bankStatements != null && !bankStatements.isEmpty();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				return merchantAgreement != null;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				return transactors != null && !transactors.isEmpty();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
				return provisionalBalance != PROVISIONAL_BALANCE_EDEFAULT;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
				return currentBalance != CURRENT_BALANCE_EDEFAULT;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS:
				return vendors != null && !vendors.isEmpty();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				return vendorShifts != null && !vendorShifts.isEmpty();
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
		result.append(" (provisionalBalance: ");
		result.append(provisionalBalance);
		result.append(", currentBalance: ");
		result.append(currentBalance);
		result.append(')');
		return result.toString();
	}

} //MerchantAccountImpl
