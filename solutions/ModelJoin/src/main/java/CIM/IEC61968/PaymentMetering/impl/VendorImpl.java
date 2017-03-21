/**
 */
package CIM.IEC61968.PaymentMetering.impl;

import CIM.IEC61968.PaymentMetering.Cashier;
import CIM.IEC61968.PaymentMetering.MerchantAccount;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.PointOfSale;
import CIM.IEC61968.PaymentMetering.Vendor;
import CIM.IEC61968.PaymentMetering.VendorShift;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Vendor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.VendorImpl#getPointOfSales <em>Point Of Sales</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.VendorImpl#getCashiers <em>Cashiers</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.VendorImpl#getMerchantAccount <em>Merchant Account</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.VendorImpl#getBankStatements <em>Bank Statements</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.VendorImpl#getVendorShifts <em>Vendor Shifts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VendorImpl extends IdentifiedObjectImpl implements Vendor {
	/**
	 * The cached value of the '{@link #getPointOfSales() <em>Point Of Sales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfSales()
	 * @generated
	 * @ordered
	 */
	protected EList<PointOfSale> pointOfSales;

	/**
	 * The cached value of the '{@link #getCashiers() <em>Cashiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Cashier> cashiers;

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
	 * The cached value of the '{@link #getBankStatements() <em>Bank Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<BankStatement> bankStatements;

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
	protected VendorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.VENDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointOfSale> getPointOfSales() {
		if (pointOfSales == null) {
			pointOfSales = new EObjectWithInverseResolvingEList<PointOfSale>(PointOfSale.class, this, PaymentMeteringPackage.VENDOR__POINT_OF_SALES, PaymentMeteringPackage.POINT_OF_SALE__VENDOR);
		}
		return pointOfSales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cashier> getCashiers() {
		if (cashiers == null) {
			cashiers = new EObjectWithInverseResolvingEList<Cashier>(Cashier.class, this, PaymentMeteringPackage.VENDOR__CASHIERS, PaymentMeteringPackage.CASHIER__VENDOR);
		}
		return cashiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT, oldMerchantAccount, merchantAccount));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT, oldMerchantAccount, newMerchantAccount);
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
				msgs = ((InternalEObject)merchantAccount).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS, MerchantAccount.class, msgs);
			if (newMerchantAccount != null)
				msgs = ((InternalEObject)newMerchantAccount).eInverseAdd(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS, MerchantAccount.class, msgs);
			msgs = basicSetMerchantAccount(newMerchantAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT, newMerchantAccount, newMerchantAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankStatement> getBankStatements() {
		if (bankStatements == null) {
			bankStatements = new EObjectWithInverseResolvingEList<BankStatement>(BankStatement.class, this, PaymentMeteringPackage.VENDOR__BANK_STATEMENTS, InfPaymentMeteringPackage.BANK_STATEMENT__VENDOR);
		}
		return bankStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorShift> getVendorShifts() {
		if (vendorShifts == null) {
			vendorShifts = new EObjectWithInverseResolvingEList<VendorShift>(VendorShift.class, this, PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS, PaymentMeteringPackage.VENDOR_SHIFT__VENDOR);
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
			case PaymentMeteringPackage.VENDOR__POINT_OF_SALES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPointOfSales()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR__CASHIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCashiers()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT:
				if (merchantAccount != null)
					msgs = ((InternalEObject)merchantAccount).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDORS, MerchantAccount.class, msgs);
				return basicSetMerchantAccount((MerchantAccount)otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR__BANK_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBankStatements()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__POINT_OF_SALES:
				return ((InternalEList<?>)getPointOfSales()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR__CASHIERS:
				return ((InternalEList<?>)getCashiers()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT:
				return basicSetMerchantAccount(null, msgs);
			case PaymentMeteringPackage.VENDOR__BANK_STATEMENTS:
				return ((InternalEList<?>)getBankStatements()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__POINT_OF_SALES:
				return getPointOfSales();
			case PaymentMeteringPackage.VENDOR__CASHIERS:
				return getCashiers();
			case PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT:
				if (resolve) return getMerchantAccount();
				return basicGetMerchantAccount();
			case PaymentMeteringPackage.VENDOR__BANK_STATEMENTS:
				return getBankStatements();
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__POINT_OF_SALES:
				getPointOfSales().clear();
				getPointOfSales().addAll((Collection<? extends PointOfSale>)newValue);
				return;
			case PaymentMeteringPackage.VENDOR__CASHIERS:
				getCashiers().clear();
				getCashiers().addAll((Collection<? extends Cashier>)newValue);
				return;
			case PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT:
				setMerchantAccount((MerchantAccount)newValue);
				return;
			case PaymentMeteringPackage.VENDOR__BANK_STATEMENTS:
				getBankStatements().clear();
				getBankStatements().addAll((Collection<? extends BankStatement>)newValue);
				return;
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__POINT_OF_SALES:
				getPointOfSales().clear();
				return;
			case PaymentMeteringPackage.VENDOR__CASHIERS:
				getCashiers().clear();
				return;
			case PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT:
				setMerchantAccount((MerchantAccount)null);
				return;
			case PaymentMeteringPackage.VENDOR__BANK_STATEMENTS:
				getBankStatements().clear();
				return;
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__POINT_OF_SALES:
				return pointOfSales != null && !pointOfSales.isEmpty();
			case PaymentMeteringPackage.VENDOR__CASHIERS:
				return cashiers != null && !cashiers.isEmpty();
			case PaymentMeteringPackage.VENDOR__MERCHANT_ACCOUNT:
				return merchantAccount != null;
			case PaymentMeteringPackage.VENDOR__BANK_STATEMENTS:
				return bankStatements != null && !bankStatements.isEmpty();
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
				return vendorShifts != null && !vendorShifts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VendorImpl
