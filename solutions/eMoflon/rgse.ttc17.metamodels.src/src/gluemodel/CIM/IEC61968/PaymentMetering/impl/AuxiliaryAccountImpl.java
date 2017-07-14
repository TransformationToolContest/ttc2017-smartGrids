/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountMovement;
import gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount;
import gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAgreement;
import gluemodel.CIM.IEC61968.PaymentMetering.Charge;
import gluemodel.CIM.IEC61968.PaymentMetering.Due;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
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
 * An implementation of the model object '<em><b>Auxiliary Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl#getDue <em>Due</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl#getLastCredit <em>Last Credit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl#getPrincipleAmount <em>Principle Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl#getCharges <em>Charges</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl#getLastDebit <em>Last Debit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AuxiliaryAccountImpl#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuxiliaryAccountImpl extends DocumentImpl implements AuxiliaryAccount {
	/**
	 * The cached value of the '{@link #getPaymentTransactions() <em>Payment Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> paymentTransactions;

	/**
	 * The cached value of the '{@link #getDue() <em>Due</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue()
	 * @generated
	 * @ordered
	 */
	protected Due due;

	/**
	 * The cached value of the '{@link #getLastCredit() <em>Last Credit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCredit()
	 * @generated
	 * @ordered
	 */
	protected AccountMovement lastCredit;

	/**
	 * The default value of the '{@link #getPrincipleAmount() <em>Principle Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipleAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PRINCIPLE_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrincipleAmount() <em>Principle Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipleAmount()
	 * @generated
	 * @ordered
	 */
	protected float principleAmount = PRINCIPLE_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuxiliaryAgreement() <em>Auxiliary Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryAgreement auxiliaryAgreement;

	/**
	 * The cached value of the '{@link #getCharges() <em>Charges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected EList<Charge> charges;

	/**
	 * The cached value of the '{@link #getLastDebit() <em>Last Debit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDebit()
	 * @generated
	 * @ordered
	 */
	protected AccountMovement lastDebit;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected float balance = BALANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuxiliaryAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.AUXILIARY_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getPaymentTransactions() {
		if (paymentTransactions == null) {
			paymentTransactions = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT);
		}
		return paymentTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Due getDue() {
		if (due != null && due.eIsProxy()) {
			InternalEObject oldDue = (InternalEObject)due;
			due = (Due)eResolveProxy(oldDue);
			if (due != oldDue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE, oldDue, due));
			}
		}
		return due;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Due basicGetDue() {
		return due;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDue(Due newDue) {
		Due oldDue = due;
		due = newDue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE, oldDue, due));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMovement getLastCredit() {
		if (lastCredit != null && lastCredit.eIsProxy()) {
			InternalEObject oldLastCredit = (InternalEObject)lastCredit;
			lastCredit = (AccountMovement)eResolveProxy(oldLastCredit);
			if (lastCredit != oldLastCredit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, oldLastCredit, lastCredit));
			}
		}
		return lastCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMovement basicGetLastCredit() {
		return lastCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCredit(AccountMovement newLastCredit) {
		AccountMovement oldLastCredit = lastCredit;
		lastCredit = newLastCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, oldLastCredit, lastCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrincipleAmount() {
		return principleAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipleAmount(float newPrincipleAmount) {
		float oldPrincipleAmount = principleAmount;
		principleAmount = newPrincipleAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT, oldPrincipleAmount, principleAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAgreement getAuxiliaryAgreement() {
		if (auxiliaryAgreement != null && auxiliaryAgreement.eIsProxy()) {
			InternalEObject oldAuxiliaryAgreement = (InternalEObject)auxiliaryAgreement;
			auxiliaryAgreement = (AuxiliaryAgreement)eResolveProxy(oldAuxiliaryAgreement);
			if (auxiliaryAgreement != oldAuxiliaryAgreement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT, oldAuxiliaryAgreement, auxiliaryAgreement));
			}
		}
		return auxiliaryAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAgreement basicGetAuxiliaryAgreement() {
		return auxiliaryAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuxiliaryAgreement(AuxiliaryAgreement newAuxiliaryAgreement, NotificationChain msgs) {
		AuxiliaryAgreement oldAuxiliaryAgreement = auxiliaryAgreement;
		auxiliaryAgreement = newAuxiliaryAgreement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT, oldAuxiliaryAgreement, newAuxiliaryAgreement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliaryAgreement(AuxiliaryAgreement newAuxiliaryAgreement) {
		if (newAuxiliaryAgreement != auxiliaryAgreement) {
			NotificationChain msgs = null;
			if (auxiliaryAgreement != null)
				msgs = ((InternalEObject)auxiliaryAgreement).eInverseRemove(this, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs);
			if (newAuxiliaryAgreement != null)
				msgs = ((InternalEObject)newAuxiliaryAgreement).eInverseAdd(this, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs);
			msgs = basicSetAuxiliaryAgreement(newAuxiliaryAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT, newAuxiliaryAgreement, newAuxiliaryAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Charge> getCharges() {
		if (charges == null) {
			charges = new EObjectWithInverseResolvingEList.ManyInverse<Charge>(Charge.class, this, PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES, PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS);
		}
		return charges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMovement getLastDebit() {
		if (lastDebit != null && lastDebit.eIsProxy()) {
			InternalEObject oldLastDebit = (InternalEObject)lastDebit;
			lastDebit = (AccountMovement)eResolveProxy(oldLastDebit);
			if (lastDebit != oldLastDebit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, oldLastDebit, lastDebit));
			}
		}
		return lastDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMovement basicGetLastDebit() {
		return lastDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastDebit(AccountMovement newLastDebit) {
		AccountMovement oldLastDebit = lastDebit;
		lastDebit = newLastDebit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, oldLastDebit, lastDebit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(float newBalance) {
		float oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE, oldBalance, balance));
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaymentTransactions()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				if (auxiliaryAgreement != null)
					msgs = ((InternalEObject)auxiliaryAgreement).eInverseRemove(this, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs);
				return basicSetAuxiliaryAgreement((AuxiliaryAgreement)otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharges()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				return ((InternalEList<?>)getPaymentTransactions()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				return basicSetAuxiliaryAgreement(null, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				return ((InternalEList<?>)getCharges()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				return getPaymentTransactions();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				if (resolve) return getDue();
				return basicGetDue();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				if (resolve) return getLastCredit();
				return basicGetLastCredit();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
				return getPrincipleAmount();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				if (resolve) return getAuxiliaryAgreement();
				return basicGetAuxiliaryAgreement();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				return getCharges();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				if (resolve) return getLastDebit();
				return basicGetLastDebit();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE:
				return getBalance();
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				getPaymentTransactions().clear();
				getPaymentTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				setDue((Due)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				setLastCredit((AccountMovement)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
				setPrincipleAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				setAuxiliaryAgreement((AuxiliaryAgreement)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				getCharges().clear();
				getCharges().addAll((Collection<? extends Charge>)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				setLastDebit((AccountMovement)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE:
				setBalance((Float)newValue);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				getPaymentTransactions().clear();
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				setDue((Due)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				setLastCredit((AccountMovement)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
				setPrincipleAmount(PRINCIPLE_AMOUNT_EDEFAULT);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				setAuxiliaryAgreement((AuxiliaryAgreement)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				getCharges().clear();
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				setLastDebit((AccountMovement)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE:
				setBalance(BALANCE_EDEFAULT);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				return paymentTransactions != null && !paymentTransactions.isEmpty();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				return due != null;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				return lastCredit != null;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
				return principleAmount != PRINCIPLE_AMOUNT_EDEFAULT;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				return auxiliaryAgreement != null;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				return charges != null && !charges.isEmpty();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				return lastDebit != null;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE:
				return balance != BALANCE_EDEFAULT;
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
		result.append(" (principleAmount: ");
		result.append(principleAmount);
		result.append(", balance: ");
		result.append(balance);
		result.append(')');
		return result.toString();
	}

} //AuxiliaryAccountImpl
