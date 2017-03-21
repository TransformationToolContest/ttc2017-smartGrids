/**
 */
package CIM.IEC61968.Customers.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.Customers.CustomerAccount;
import CIM.IEC61968.Customers.CustomerAgreement;
import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.Transaction;

import CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo;
import CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoice;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerAccountImpl#getWorkBillingInfos <em>Work Billing Infos</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerAccountImpl#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerAccountImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerAccountImpl#getErpInvoicees <em>Erp Invoicees</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerAccountImpl#getCustomerBillingInfos <em>Customer Billing Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerAccountImpl extends DocumentImpl implements CustomerAccount {
	/**
	 * The cached value of the '{@link #getWorkBillingInfos() <em>Work Billing Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkBillingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkBillingInfo> workBillingInfos;

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
	 * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAgreement> customerAgreements;

	/**
	 * The cached value of the '{@link #getErpInvoicees() <em>Erp Invoicees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoicees()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoice> erpInvoicees;

	/**
	 * The cached value of the '{@link #getCustomerBillingInfos() <em>Customer Billing Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerBillingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerBillingInfo> customerBillingInfos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.CUSTOMER_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkBillingInfo> getWorkBillingInfos() {
		if (workBillingInfos == null) {
			workBillingInfos = new EObjectWithInverseResolvingEList<WorkBillingInfo>(WorkBillingInfo.class, this, CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS, InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT);
		}
		return workBillingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getPaymentTransactions() {
		if (paymentTransactions == null) {
			paymentTransactions = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT);
		}
		return paymentTransactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new EObjectWithInverseResolvingEList<CustomerAgreement>(CustomerAgreement.class, this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT);
		}
		return customerAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoice> getErpInvoicees() {
		if (erpInvoicees == null) {
			erpInvoicees = new EObjectWithInverseResolvingEList<ErpInvoice>(ErpInvoice.class, this, CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES, InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT);
		}
		return erpInvoicees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerBillingInfo> getCustomerBillingInfos() {
		if (customerBillingInfos == null) {
			customerBillingInfos = new EObjectWithInverseResolvingEList<CustomerBillingInfo>(CustomerBillingInfo.class, this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS, InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT);
		}
		return customerBillingInfos;
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkBillingInfos()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaymentTransactions()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoicees()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerBillingInfos()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				return ((InternalEList<?>)getWorkBillingInfos()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				return ((InternalEList<?>)getPaymentTransactions()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				return ((InternalEList<?>)getErpInvoicees()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				return ((InternalEList<?>)getCustomerBillingInfos()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				return getWorkBillingInfos();
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				return getPaymentTransactions();
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				return getErpInvoicees();
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				return getCustomerBillingInfos();
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				getWorkBillingInfos().clear();
				getWorkBillingInfos().addAll((Collection<? extends WorkBillingInfo>)newValue);
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				getPaymentTransactions().clear();
				getPaymentTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				getErpInvoicees().clear();
				getErpInvoicees().addAll((Collection<? extends ErpInvoice>)newValue);
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				getCustomerBillingInfos().clear();
				getCustomerBillingInfos().addAll((Collection<? extends CustomerBillingInfo>)newValue);
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				getWorkBillingInfos().clear();
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				getPaymentTransactions().clear();
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				getErpInvoicees().clear();
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				getCustomerBillingInfos().clear();
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				return workBillingInfos != null && !workBillingInfos.isEmpty();
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				return paymentTransactions != null && !paymentTransactions.isEmpty();
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				return erpInvoicees != null && !erpInvoicees.isEmpty();
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				return customerBillingInfos != null && !customerBillingInfos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerAccountImpl
