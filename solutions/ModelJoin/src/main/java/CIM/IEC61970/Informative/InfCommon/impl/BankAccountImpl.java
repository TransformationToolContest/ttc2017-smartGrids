/**
 */
package CIM.IEC61970.Informative.InfCommon.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.ServiceSupplier;

import CIM.IEC61970.Informative.InfCommon.BankAccount;
import CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import CIM.IEC61970.Informative.InfPaymentMetering.Bank;
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
 * An implementation of the model object '<em><b>Bank Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.BankAccountImpl#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.BankAccountImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.BankAccountImpl#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCommon.impl.BankAccountImpl#getBankStatements <em>Bank Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankAccountImpl extends DocumentImpl implements BankAccount {
	/**
	 * The default value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String accountNumber = ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected Bank bank;

	/**
	 * The cached value of the '{@link #getServiceSupplier() <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSupplier()
	 * @generated
	 * @ordered
	 */
	protected ServiceSupplier serviceSupplier;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.BANK_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountNumber(String newAccountNumber) {
		String oldAccountNumber = accountNumber;
		accountNumber = newAccountNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER, oldAccountNumber, accountNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank getBank() {
		if (bank != null && bank.eIsProxy()) {
			InternalEObject oldBank = (InternalEObject)bank;
			bank = (Bank)eResolveProxy(oldBank);
			if (bank != oldBank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.BANK_ACCOUNT__BANK, oldBank, bank));
			}
		}
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank basicGetBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBank(Bank newBank, NotificationChain msgs) {
		Bank oldBank = bank;
		bank = newBank;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.BANK_ACCOUNT__BANK, oldBank, newBank);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(Bank newBank) {
		if (newBank != bank) {
			NotificationChain msgs = null;
			if (bank != null)
				msgs = ((InternalEObject)bank).eInverseRemove(this, InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS, Bank.class, msgs);
			if (newBank != null)
				msgs = ((InternalEObject)newBank).eInverseAdd(this, InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS, Bank.class, msgs);
			msgs = basicSetBank(newBank, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.BANK_ACCOUNT__BANK, newBank, newBank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier getServiceSupplier() {
		if (serviceSupplier != null && serviceSupplier.eIsProxy()) {
			InternalEObject oldServiceSupplier = (InternalEObject)serviceSupplier;
			serviceSupplier = (ServiceSupplier)eResolveProxy(oldServiceSupplier);
			if (serviceSupplier != oldServiceSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER, oldServiceSupplier, serviceSupplier));
			}
		}
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier basicGetServiceSupplier() {
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSupplier(ServiceSupplier newServiceSupplier, NotificationChain msgs) {
		ServiceSupplier oldServiceSupplier = serviceSupplier;
		serviceSupplier = newServiceSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER, oldServiceSupplier, newServiceSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceSupplier(ServiceSupplier newServiceSupplier) {
		if (newServiceSupplier != serviceSupplier) {
			NotificationChain msgs = null;
			if (serviceSupplier != null)
				msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS, ServiceSupplier.class, msgs);
			if (newServiceSupplier != null)
				msgs = ((InternalEObject)newServiceSupplier).eInverseAdd(this, PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS, ServiceSupplier.class, msgs);
			msgs = basicSetServiceSupplier(newServiceSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER, newServiceSupplier, newServiceSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankStatement> getBankStatements() {
		if (bankStatements == null) {
			bankStatements = new EObjectWithInverseResolvingEList<BankStatement>(BankStatement.class, this, InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS, InfPaymentMeteringPackage.BANK_STATEMENT__BANK_ACCOUNT);
		}
		return bankStatements;
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
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				if (bank != null)
					msgs = ((InternalEObject)bank).eInverseRemove(this, InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS, Bank.class, msgs);
				return basicSetBank((Bank)otherEnd, msgs);
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				if (serviceSupplier != null)
					msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS, ServiceSupplier.class, msgs);
				return basicSetServiceSupplier((ServiceSupplier)otherEnd, msgs);
			case InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBankStatements()).basicAdd(otherEnd, msgs);
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
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				return basicSetBank(null, msgs);
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				return basicSetServiceSupplier(null, msgs);
			case InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS:
				return ((InternalEList<?>)getBankStatements()).basicRemove(otherEnd, msgs);
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
			case InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER:
				return getAccountNumber();
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				if (resolve) return getBank();
				return basicGetBank();
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				if (resolve) return getServiceSupplier();
				return basicGetServiceSupplier();
			case InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS:
				return getBankStatements();
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
			case InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER:
				setAccountNumber((String)newValue);
				return;
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				setBank((Bank)newValue);
				return;
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)newValue);
				return;
			case InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS:
				getBankStatements().clear();
				getBankStatements().addAll((Collection<? extends BankStatement>)newValue);
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
			case InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER:
				setAccountNumber(ACCOUNT_NUMBER_EDEFAULT);
				return;
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				setBank((Bank)null);
				return;
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)null);
				return;
			case InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS:
				getBankStatements().clear();
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
			case InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER:
				return ACCOUNT_NUMBER_EDEFAULT == null ? accountNumber != null : !ACCOUNT_NUMBER_EDEFAULT.equals(accountNumber);
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				return bank != null;
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				return serviceSupplier != null;
			case InfCommonPackage.BANK_ACCOUNT__BANK_STATEMENTS:
				return bankStatements != null && !bankStatements.isEmpty();
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
		result.append(" (accountNumber: ");
		result.append(accountNumber);
		result.append(')');
		return result.toString();
	}

} //BankAccountImpl
