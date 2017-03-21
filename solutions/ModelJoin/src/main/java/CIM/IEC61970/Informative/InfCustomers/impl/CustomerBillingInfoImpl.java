/**
 */
package CIM.IEC61970.Informative.InfCustomers.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.Customers.CustomerAccount;
import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo;
import CIM.IEC61970.Informative.InfCustomers.CustomerBillingKind;
import CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * An implementation of the model object '<em><b>Customer Billing Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getPymtPlanAmt <em>Pymt Plan Amt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getLastPaymentDate <em>Last Payment Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getBillingDate <em>Billing Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getLastPaymentAmt <em>Last Payment Amt</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getPymtPlanType <em>Pymt Plan Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getOutBalance <em>Out Balance</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.CustomerBillingInfoImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerBillingInfoImpl extends DocumentImpl implements CustomerBillingInfo {
	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPymtPlanAmt() <em>Pymt Plan Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPymtPlanAmt()
	 * @generated
	 * @ordered
	 */
	protected static final float PYMT_PLAN_AMT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPymtPlanAmt() <em>Pymt Plan Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPymtPlanAmt()
	 * @generated
	 * @ordered
	 */
	protected float pymtPlanAmt = PYMT_PLAN_AMT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerAccount() <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAccount()
	 * @generated
	 * @ordered
	 */
	protected CustomerAccount customerAccount;

	/**
	 * The default value of the '{@link #getLastPaymentDate() <em>Last Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastPaymentDate() <em>Last Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected String lastPaymentDate = LAST_PAYMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingDate() <em>Billing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingDate()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingDate() <em>Billing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingDate()
	 * @generated
	 * @ordered
	 */
	protected String billingDate = BILLING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPaymentAmt() <em>Last Payment Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPaymentAmt()
	 * @generated
	 * @ordered
	 */
	protected static final float LAST_PAYMENT_AMT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLastPaymentAmt() <em>Last Payment Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPaymentAmt()
	 * @generated
	 * @ordered
	 */
	protected float lastPaymentAmt = LAST_PAYMENT_AMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPymtPlanType() <em>Pymt Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPymtPlanType()
	 * @generated
	 * @ordered
	 */
	protected static final String PYMT_PLAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPymtPlanType() <em>Pymt Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPymtPlanType()
	 * @generated
	 * @ordered
	 */
	protected String pymtPlanType = PYMT_PLAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutBalance() <em>Out Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float OUT_BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOutBalance() <em>Out Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBalance()
	 * @generated
	 * @ordered
	 */
	protected float outBalance = OUT_BALANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpInvoiceLineItems() <em>Erp Invoice Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpInvoiceLineItems;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final CustomerBillingKind KIND_EDEFAULT = CustomerBillingKind.CONSOLIDATED_UDC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CustomerBillingKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerBillingInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.CUSTOMER_BILLING_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(String newDueDate) {
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPymtPlanAmt() {
		return pymtPlanAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPymtPlanAmt(float newPymtPlanAmt) {
		float oldPymtPlanAmt = pymtPlanAmt;
		pymtPlanAmt = newPymtPlanAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT, oldPymtPlanAmt, pymtPlanAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount getCustomerAccount() {
		if (customerAccount != null && customerAccount.eIsProxy()) {
			InternalEObject oldCustomerAccount = (InternalEObject)customerAccount;
			customerAccount = (CustomerAccount)eResolveProxy(oldCustomerAccount);
			if (customerAccount != oldCustomerAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT, oldCustomerAccount, customerAccount));
			}
		}
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount basicGetCustomerAccount() {
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAccount(CustomerAccount newCustomerAccount, NotificationChain msgs) {
		CustomerAccount oldCustomerAccount = customerAccount;
		customerAccount = newCustomerAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT, oldCustomerAccount, newCustomerAccount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAccount(CustomerAccount newCustomerAccount) {
		if (newCustomerAccount != customerAccount) {
			NotificationChain msgs = null;
			if (customerAccount != null)
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT, newCustomerAccount, newCustomerAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastPaymentDate() {
		return lastPaymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPaymentDate(String newLastPaymentDate) {
		String oldLastPaymentDate = lastPaymentDate;
		lastPaymentDate = newLastPaymentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE, oldLastPaymentDate, lastPaymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillingDate() {
		return billingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingDate(String newBillingDate) {
		String oldBillingDate = billingDate;
		billingDate = newBillingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE, oldBillingDate, billingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLastPaymentAmt() {
		return lastPaymentAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPaymentAmt(float newLastPaymentAmt) {
		float oldLastPaymentAmt = lastPaymentAmt;
		lastPaymentAmt = newLastPaymentAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT, oldLastPaymentAmt, lastPaymentAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPymtPlanType() {
		return pymtPlanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPymtPlanType(String newPymtPlanType) {
		String oldPymtPlanType = pymtPlanType;
		pymtPlanType = newPymtPlanType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE, oldPymtPlanType, pymtPlanType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOutBalance() {
		return outBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutBalance(float newOutBalance) {
		float oldOutBalance = outBalance;
		outBalance = newOutBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE, oldOutBalance, outBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpInvoiceLineItem>(ErpInvoiceLineItem.class, this, InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS);
		}
		return erpInvoiceLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerBillingKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CustomerBillingKind newKind) {
		CustomerBillingKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND, oldKind, kind));
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE:
				return getDueDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT:
				return getPymtPlanAmt();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE:
				return getLastPaymentDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE:
				return getBillingDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT:
				return getLastPaymentAmt();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE:
				return getPymtPlanType();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE:
				return getOutBalance();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND:
				return getKind();
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT:
				setPymtPlanAmt((Float)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE:
				setLastPaymentDate((String)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE:
				setBillingDate((String)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT:
				setLastPaymentAmt((Float)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE:
				setPymtPlanType((String)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE:
				setOutBalance((Float)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND:
				setKind((CustomerBillingKind)newValue);
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT:
				setPymtPlanAmt(PYMT_PLAN_AMT_EDEFAULT);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE:
				setLastPaymentDate(LAST_PAYMENT_DATE_EDEFAULT);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE:
				setBillingDate(BILLING_DATE_EDEFAULT);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT:
				setLastPaymentAmt(LAST_PAYMENT_AMT_EDEFAULT);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE:
				setPymtPlanType(PYMT_PLAN_TYPE_EDEFAULT);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE:
				setOutBalance(OUT_BALANCE_EDEFAULT);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND:
				setKind(KIND_EDEFAULT);
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT:
				return pymtPlanAmt != PYMT_PLAN_AMT_EDEFAULT;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
				return customerAccount != null;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE:
				return LAST_PAYMENT_DATE_EDEFAULT == null ? lastPaymentDate != null : !LAST_PAYMENT_DATE_EDEFAULT.equals(lastPaymentDate);
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE:
				return BILLING_DATE_EDEFAULT == null ? billingDate != null : !BILLING_DATE_EDEFAULT.equals(billingDate);
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT:
				return lastPaymentAmt != LAST_PAYMENT_AMT_EDEFAULT;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE:
				return PYMT_PLAN_TYPE_EDEFAULT == null ? pymtPlanType != null : !PYMT_PLAN_TYPE_EDEFAULT.equals(pymtPlanType);
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE:
				return outBalance != OUT_BALANCE_EDEFAULT;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (dueDate: ");
		result.append(dueDate);
		result.append(", pymtPlanAmt: ");
		result.append(pymtPlanAmt);
		result.append(", lastPaymentDate: ");
		result.append(lastPaymentDate);
		result.append(", billingDate: ");
		result.append(billingDate);
		result.append(", lastPaymentAmt: ");
		result.append(lastPaymentAmt);
		result.append(", pymtPlanType: ");
		result.append(pymtPlanType);
		result.append(", outBalance: ");
		result.append(outBalance);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //CustomerBillingInfoImpl
