/**
 */
package gluemodel.CIM.IEC61970.Informative.InfCustomers.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Customers.CustomerAccount;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61968.Work.Work;
import gluemodel.CIM.IEC61968.Work.WorkPackage;

import gluemodel.CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import gluemodel.CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Work Billing Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getReceivedDateTime <em>Received Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getIssueDateTime <em>Issue Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getErpLineItems <em>Erp Line Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getDueDateTime <em>Due Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getDeposit <em>Deposit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getWorkPrice <em>Work Price</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfCustomers.impl.WorkBillingInfoImpl#getCostEstimate <em>Cost Estimate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkBillingInfoImpl extends DocumentImpl implements WorkBillingInfo {
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
	 * The default value of the '{@link #getReceivedDateTime() <em>Received Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECEIVED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedDateTime() <em>Received Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date receivedDateTime = RECEIVED_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected float discount = DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueDateTime() <em>Issue Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDateTime() <em>Issue Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date issueDateTime = ISSUE_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpLineItems() <em>Erp Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpLineItems;

	/**
	 * The default value of the '{@link #getDueDateTime() <em>Due Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDateTime() <em>Due Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dueDateTime = DUE_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeposit() <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeposit()
	 * @generated
	 * @ordered
	 */
	protected static final float DEPOSIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDeposit() <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeposit()
	 * @generated
	 * @ordered
	 */
	protected float deposit = DEPOSIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

	/**
	 * The default value of the '{@link #getWorkPrice() <em>Work Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float WORK_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorkPrice() <em>Work Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkPrice()
	 * @generated
	 * @ordered
	 */
	protected float workPrice = WORK_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostEstimate() <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_ESTIMATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostEstimate() <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostEstimate()
	 * @generated
	 * @ordered
	 */
	protected float costEstimate = COST_ESTIMATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkBillingInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.WORK_BILLING_INFO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT, oldCustomerAccount, customerAccount));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT, oldCustomerAccount, newCustomerAccount);
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
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT, newCustomerAccount, newCustomerAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReceivedDateTime() {
		return receivedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedDateTime(Date newReceivedDateTime) {
		Date oldReceivedDateTime = receivedDateTime;
		receivedDateTime = newReceivedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME, oldReceivedDateTime, receivedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscount(float newDiscount) {
		float oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIssueDateTime() {
		return issueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDateTime(Date newIssueDateTime) {
		Date oldIssueDateTime = issueDateTime;
		issueDateTime = newIssueDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME, oldIssueDateTime, issueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpLineItems() {
		if (erpLineItems == null) {
			erpLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpInvoiceLineItem>(ErpInvoiceLineItem.class, this, InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS);
		}
		return erpLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDueDateTime() {
		return dueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDateTime(Date newDueDateTime) {
		Date oldDueDateTime = dueDateTime;
		dueDateTime = newDueDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME, oldDueDateTime, dueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDeposit() {
		return deposit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeposit(float newDeposit) {
		float oldDeposit = deposit;
		deposit = newDeposit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT, oldDeposit, deposit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new EObjectWithInverseResolvingEList<Work>(Work.class, this, InfCustomersPackage.WORK_BILLING_INFO__WORKS, WorkPackage.WORK__WORK_BILLING_INFO);
		}
		return works;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorkPrice() {
		return workPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkPrice(float newWorkPrice) {
		float oldWorkPrice = workPrice;
		workPrice = newWorkPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE, oldWorkPrice, workPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCostEstimate() {
		return costEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostEstimate(float newCostEstimate) {
		float oldCostEstimate = costEstimate;
		costEstimate = newCostEstimate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE, oldCostEstimate, costEstimate));
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
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpLineItems()).basicAdd(otherEnd, msgs);
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
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
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				return ((InternalEList<?>)getErpLineItems()).basicRemove(otherEnd, msgs);
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
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
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
			case InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME:
				return getReceivedDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT:
				return getDiscount();
			case InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME:
				return getIssueDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				return getErpLineItems();
			case InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME:
				return getDueDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT:
				return getDeposit();
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				return getWorks();
			case InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE:
				return getWorkPrice();
			case InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE:
				return getCostEstimate();
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
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME:
				setReceivedDateTime((Date)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT:
				setDiscount((Float)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME:
				setIssueDateTime((Date)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				getErpLineItems().clear();
				getErpLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME:
				setDueDateTime((Date)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT:
				setDeposit((Float)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE:
				setWorkPrice((Float)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE:
				setCostEstimate((Float)newValue);
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
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME:
				setReceivedDateTime(RECEIVED_DATE_TIME_EDEFAULT);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME:
				setIssueDateTime(ISSUE_DATE_TIME_EDEFAULT);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				getErpLineItems().clear();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME:
				setDueDateTime(DUE_DATE_TIME_EDEFAULT);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT:
				setDeposit(DEPOSIT_EDEFAULT);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				getWorks().clear();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE:
				setWorkPrice(WORK_PRICE_EDEFAULT);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE:
				setCostEstimate(COST_ESTIMATE_EDEFAULT);
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
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				return customerAccount != null;
			case InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME:
				return RECEIVED_DATE_TIME_EDEFAULT == null ? receivedDateTime != null : !RECEIVED_DATE_TIME_EDEFAULT.equals(receivedDateTime);
			case InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT:
				return discount != DISCOUNT_EDEFAULT;
			case InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME:
				return ISSUE_DATE_TIME_EDEFAULT == null ? issueDateTime != null : !ISSUE_DATE_TIME_EDEFAULT.equals(issueDateTime);
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				return erpLineItems != null && !erpLineItems.isEmpty();
			case InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME:
				return DUE_DATE_TIME_EDEFAULT == null ? dueDateTime != null : !DUE_DATE_TIME_EDEFAULT.equals(dueDateTime);
			case InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT:
				return deposit != DEPOSIT_EDEFAULT;
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				return works != null && !works.isEmpty();
			case InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE:
				return workPrice != WORK_PRICE_EDEFAULT;
			case InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE:
				return costEstimate != COST_ESTIMATE_EDEFAULT;
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
		result.append(" (receivedDateTime: ");
		result.append(receivedDateTime);
		result.append(", discount: ");
		result.append(discount);
		result.append(", issueDateTime: ");
		result.append(issueDateTime);
		result.append(", dueDateTime: ");
		result.append(dueDateTime);
		result.append(", deposit: ");
		result.append(deposit);
		result.append(", workPrice: ");
		result.append(workPrice);
		result.append(", costEstimate: ");
		result.append(costEstimate);
		result.append(')');
		return result.toString();
	}

} //WorkBillingInfoImpl
