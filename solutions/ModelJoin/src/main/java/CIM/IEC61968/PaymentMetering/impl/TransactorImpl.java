/**
 */
package CIM.IEC61968.PaymentMetering.impl;

import CIM.IEC61968.PaymentMetering.MerchantAccount;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.Transactor;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transactor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.TransactorImpl#getMerchantAccounts <em>Merchant Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactorImpl extends IdentifiedObjectImpl implements Transactor {
	/**
	 * The cached value of the '{@link #getMerchantAccounts() <em>Merchant Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<MerchantAccount> merchantAccounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TRANSACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MerchantAccount> getMerchantAccounts() {
		if (merchantAccounts == null) {
			merchantAccounts = new EObjectWithInverseResolvingEList.ManyInverse<MerchantAccount>(MerchantAccount.class, this, PaymentMeteringPackage.TRANSACTOR__MERCHANT_ACCOUNTS, PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS);
		}
		return merchantAccounts;
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
			case PaymentMeteringPackage.TRANSACTOR__MERCHANT_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMerchantAccounts()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.TRANSACTOR__MERCHANT_ACCOUNTS:
				return ((InternalEList<?>)getMerchantAccounts()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.TRANSACTOR__MERCHANT_ACCOUNTS:
				return getMerchantAccounts();
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
			case PaymentMeteringPackage.TRANSACTOR__MERCHANT_ACCOUNTS:
				getMerchantAccounts().clear();
				getMerchantAccounts().addAll((Collection<? extends MerchantAccount>)newValue);
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
			case PaymentMeteringPackage.TRANSACTOR__MERCHANT_ACCOUNTS:
				getMerchantAccounts().clear();
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
			case PaymentMeteringPackage.TRANSACTOR__MERCHANT_ACCOUNTS:
				return merchantAccounts != null && !merchantAccounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactorImpl
