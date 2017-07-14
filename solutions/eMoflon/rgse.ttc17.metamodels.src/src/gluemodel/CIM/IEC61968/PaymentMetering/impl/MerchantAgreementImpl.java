/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.Common.impl.AgreementImpl;

import gluemodel.CIM.IEC61968.PaymentMetering.MerchantAccount;
import gluemodel.CIM.IEC61968.PaymentMetering.MerchantAgreement;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merchant Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.MerchantAgreementImpl#getMerchantAccounts <em>Merchant Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MerchantAgreementImpl extends AgreementImpl implements MerchantAgreement {
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
	protected MerchantAgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.MERCHANT_AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MerchantAccount> getMerchantAccounts() {
		if (merchantAccounts == null) {
			merchantAccounts = new EObjectWithInverseResolvingEList<MerchantAccount>(MerchantAccount.class, this, PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT);
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
				return merchantAccounts != null && !merchantAccounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MerchantAgreementImpl
