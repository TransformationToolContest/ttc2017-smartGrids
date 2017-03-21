/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.Customers.CustomerAccount;
import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61970.Informative.InfERPSupport.BillMediaKind;
import CIM.IEC61970.Informative.InfERPSupport.ErpInvoice;
import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceKind;
import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * An implementation of the model object '<em><b>Erp Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getMailedDate <em>Mailed Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getTransferType <em>Transfer Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#isProForma <em>Pro Forma</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getBillMediaKind <em>Bill Media Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceImpl#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpInvoiceImpl extends DocumentImpl implements ErpInvoice {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ErpInvoiceKind KIND_EDEFAULT = ErpInvoiceKind.PURCHASE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionDateTime() <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDateTime() <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDateTime = TRANSACTION_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getMailedDate() <em>Mailed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MAILED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMailedDate() <em>Mailed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailedDate()
	 * @generated
	 * @ordered
	 */
	protected String mailedDate = MAILED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransferType() <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransferType() <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferType()
	 * @generated
	 * @ordered
	 */
	protected String transferType = TRANSFER_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isProForma() <em>Pro Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProForma()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRO_FORMA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProForma() <em>Pro Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProForma()
	 * @generated
	 * @ordered
	 */
	protected boolean proForma = PRO_FORMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillMediaKind() <em>Bill Media Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillMediaKind()
	 * @generated
	 * @ordered
	 */
	protected static final BillMediaKind BILL_MEDIA_KIND_EDEFAULT = BillMediaKind.PAPER;

	/**
	 * The cached value of the '{@link #getBillMediaKind() <em>Bill Media Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillMediaKind()
	 * @generated
	 * @ordered
	 */
	protected BillMediaKind billMediaKind = BILL_MEDIA_KIND_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpInvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ErpInvoiceKind newKind) {
		ErpInvoiceKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTransactionDateTime() {
		return transactionDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionDateTime(Date newTransactionDateTime) {
		Date oldTransactionDateTime = transactionDateTime;
		transactionDateTime = newTransactionDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME, oldTransactionDateTime, transactionDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMailedDate() {
		return mailedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMailedDate(String newMailedDate) {
		String oldMailedDate = mailedDate;
		mailedDate = newMailedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__MAILED_DATE, oldMailedDate, mailedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransferType() {
		return transferType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferType(String newTransferType) {
		String oldTransferType = transferType;
		transferType = newTransferType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE, oldTransferType, transferType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT, oldCustomerAccount, customerAccount));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT, oldCustomerAccount, newCustomerAccount);
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
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT, newCustomerAccount, newCustomerAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProForma() {
		return proForma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProForma(boolean newProForma) {
		boolean oldProForma = proForma;
		proForma = newProForma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__PRO_FORMA, oldProForma, proForma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillMediaKind getBillMediaKind() {
		return billMediaKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillMediaKind(BillMediaKind newBillMediaKind) {
		BillMediaKind oldBillMediaKind = billMediaKind;
		billMediaKind = newBillMediaKind == null ? BILL_MEDIA_KIND_EDEFAULT : newBillMediaKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND, oldBillMediaKind, billMediaKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new EObjectWithInverseResolvingEList<ErpInvoiceLineItem>(ErpInvoiceLineItem.class, this, InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE);
		}
		return erpInvoiceLineItems;
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
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
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
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
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
			case InfERPSupportPackage.ERP_INVOICE__AMOUNT:
				return getAmount();
			case InfERPSupportPackage.ERP_INVOICE__KIND:
				return getKind();
			case InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME:
				return getTransactionDateTime();
			case InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER:
				return getReferenceNumber();
			case InfERPSupportPackage.ERP_INVOICE__DUE_DATE:
				return getDueDate();
			case InfERPSupportPackage.ERP_INVOICE__MAILED_DATE:
				return getMailedDate();
			case InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE:
				return getTransferType();
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
			case InfERPSupportPackage.ERP_INVOICE__PRO_FORMA:
				return isProForma();
			case InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND:
				return getBillMediaKind();
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
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
			case InfERPSupportPackage.ERP_INVOICE__AMOUNT:
				setAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__KIND:
				setKind((ErpInvoiceKind)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME:
				setTransactionDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__MAILED_DATE:
				setMailedDate((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE:
				setTransferType((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__PRO_FORMA:
				setProForma((Boolean)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND:
				setBillMediaKind((BillMediaKind)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_INVOICE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME:
				setTransactionDateTime(TRANSACTION_DATE_TIME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__MAILED_DATE:
				setMailedDate(MAILED_DATE_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE:
				setTransferType(TRANSFER_TYPE_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE__PRO_FORMA:
				setProForma(PRO_FORMA_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND:
				setBillMediaKind(BILL_MEDIA_KIND_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
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
			case InfERPSupportPackage.ERP_INVOICE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case InfERPSupportPackage.ERP_INVOICE__KIND:
				return kind != KIND_EDEFAULT;
			case InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME:
				return TRANSACTION_DATE_TIME_EDEFAULT == null ? transactionDateTime != null : !TRANSACTION_DATE_TIME_EDEFAULT.equals(transactionDateTime);
			case InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
			case InfERPSupportPackage.ERP_INVOICE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case InfERPSupportPackage.ERP_INVOICE__MAILED_DATE:
				return MAILED_DATE_EDEFAULT == null ? mailedDate != null : !MAILED_DATE_EDEFAULT.equals(mailedDate);
			case InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE:
				return TRANSFER_TYPE_EDEFAULT == null ? transferType != null : !TRANSFER_TYPE_EDEFAULT.equals(transferType);
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				return customerAccount != null;
			case InfERPSupportPackage.ERP_INVOICE__PRO_FORMA:
				return proForma != PRO_FORMA_EDEFAULT;
			case InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND:
				return billMediaKind != BILL_MEDIA_KIND_EDEFAULT;
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(", kind: ");
		result.append(kind);
		result.append(", transactionDateTime: ");
		result.append(transactionDateTime);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", mailedDate: ");
		result.append(mailedDate);
		result.append(", transferType: ");
		result.append(transferType);
		result.append(", proForma: ");
		result.append(proForma);
		result.append(", billMediaKind: ");
		result.append(billMediaKind);
		result.append(')');
		return result.toString();
	}

} //ErpInvoiceImpl
