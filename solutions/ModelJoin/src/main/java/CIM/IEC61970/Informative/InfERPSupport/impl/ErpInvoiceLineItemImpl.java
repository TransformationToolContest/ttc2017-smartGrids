/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.DateTimeInterval;
import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfCustomers.CustomerBillingInfo;
import CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoice;
import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind;
import CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry;
import CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpPayment;
import CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.MarketOperations.MarketFactors;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.Settlement;

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
 * An implementation of the model object '<em><b>Erp Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getNetAmount <em>Net Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getErpPayableLineItem <em>Erp Payable Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getLineAmount <em>Line Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getErpRecLineItem <em>Erp Rec Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getSettlements <em>Settlements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getPreviousAmount <em>Previous Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getWorkBillingInfos <em>Work Billing Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getMarketFactors <em>Market Factors</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getErpPayments <em>Erp Payments</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getGlDateTime <em>Gl Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getGlAccount <em>Gl Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getBillPeriod <em>Bill Period</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getLineVersion <em>Line Version</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getErpInvoice <em>Erp Invoice</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getCustomerBillingInfos <em>Customer Billing Infos</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getComponentErpInvoiceLineItems <em>Component Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpInvoiceLineItemImpl#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpInvoiceLineItemImpl extends DocumentImpl implements ErpInvoiceLineItem {
	/**
	 * The cached value of the '{@link #getErpQuoteLineItem() <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpQuoteLineItem erpQuoteLineItem;

	/**
	 * The default value of the '{@link #getNetAmount() <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float NET_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetAmount() <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAmount()
	 * @generated
	 * @ordered
	 */
	protected float netAmount = NET_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpPayableLineItem() <em>Erp Payable Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayableLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpPayableLineItem erpPayableLineItem;

	/**
	 * The default value of the '{@link #getLineAmount() <em>Line Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineAmount() <em>Line Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAmount()
	 * @generated
	 * @ordered
	 */
	protected float lineAmount = LINE_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpRecLineItem() <em>Erp Rec Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpRecLineItem erpRecLineItem;

	/**
	 * The cached value of the '{@link #getSettlements() <em>Settlements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlements()
	 * @generated
	 * @ordered
	 */
	protected EList<Settlement> settlements;

	/**
	 * The default value of the '{@link #getPreviousAmount() <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PREVIOUS_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPreviousAmount() <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousAmount()
	 * @generated
	 * @ordered
	 */
	protected float previousAmount = PREVIOUS_AMOUNT_EDEFAULT;

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
	 * The cached value of the '{@link #getMarketFactors() <em>Market Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketFactors> marketFactors;

	/**
	 * The cached value of the '{@link #getErpPayments() <em>Erp Payments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayments()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayment> erpPayments;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ErpInvoiceLineItemKind KIND_EDEFAULT = ErpInvoiceLineItemKind.RECALCULATION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceLineItemKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlDateTime() <em>Gl Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date GL_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlDateTime() <em>Gl Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date glDateTime = GL_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainerErpInvoiceLineItem() <em>Container Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerErpInvoiceLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceLineItem containerErpInvoiceLineItem;

	/**
	 * The cached value of the '{@link #getErpRecDelvLineItem() <em>Erp Rec Delv Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpRecDelvLineItem erpRecDelvLineItem;

	/**
	 * The default value of the '{@link #getGlAccount() <em>Gl Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlAccount() <em>Gl Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccount()
	 * @generated
	 * @ordered
	 */
	protected String glAccount = GL_ACCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBillPeriod() <em>Bill Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillPeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval billPeriod;

	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected String lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userAttributes;

	/**
	 * The default value of the '{@link #getLineVersion() <em>Line Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineVersion() <em>Line Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineVersion()
	 * @generated
	 * @ordered
	 */
	protected String lineVersion = LINE_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpInvoice() <em>Erp Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoice()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoice erpInvoice;

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
	 * The cached value of the '{@link #getComponentErpInvoiceLineItems() <em>Component Erp Invoice Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentErpInvoiceLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> componentErpInvoiceLineItems;

	/**
	 * The cached value of the '{@link #getErpJournalEntries() <em>Erp Journal Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJournalEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpJournalEntry> erpJournalEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpInvoiceLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_INVOICE_LINE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem getErpQuoteLineItem() {
		if (erpQuoteLineItem != null && erpQuoteLineItem.eIsProxy()) {
			InternalEObject oldErpQuoteLineItem = (InternalEObject)erpQuoteLineItem;
			erpQuoteLineItem = (ErpQuoteLineItem)eResolveProxy(oldErpQuoteLineItem);
			if (erpQuoteLineItem != oldErpQuoteLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, oldErpQuoteLineItem, erpQuoteLineItem));
			}
		}
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem basicGetErpQuoteLineItem() {
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem, NotificationChain msgs) {
		ErpQuoteLineItem oldErpQuoteLineItem = erpQuoteLineItem;
		erpQuoteLineItem = newErpQuoteLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, oldErpQuoteLineItem, newErpQuoteLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem) {
		if (newErpQuoteLineItem != erpQuoteLineItem) {
			NotificationChain msgs = null;
			if (erpQuoteLineItem != null)
				msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpQuoteLineItem.class, msgs);
			if (newErpQuoteLineItem != null)
				msgs = ((InternalEObject)newErpQuoteLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpQuoteLineItem.class, msgs);
			msgs = basicSetErpQuoteLineItem(newErpQuoteLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, newErpQuoteLineItem, newErpQuoteLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNetAmount() {
		return netAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetAmount(float newNetAmount) {
		float oldNetAmount = netAmount;
		netAmount = newNetAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT, oldNetAmount, netAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayableLineItem getErpPayableLineItem() {
		if (erpPayableLineItem != null && erpPayableLineItem.eIsProxy()) {
			InternalEObject oldErpPayableLineItem = (InternalEObject)erpPayableLineItem;
			erpPayableLineItem = (ErpPayableLineItem)eResolveProxy(oldErpPayableLineItem);
			if (erpPayableLineItem != oldErpPayableLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM, oldErpPayableLineItem, erpPayableLineItem));
			}
		}
		return erpPayableLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayableLineItem basicGetErpPayableLineItem() {
		return erpPayableLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPayableLineItem(ErpPayableLineItem newErpPayableLineItem, NotificationChain msgs) {
		ErpPayableLineItem oldErpPayableLineItem = erpPayableLineItem;
		erpPayableLineItem = newErpPayableLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM, oldErpPayableLineItem, newErpPayableLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpPayableLineItem(ErpPayableLineItem newErpPayableLineItem) {
		if (newErpPayableLineItem != erpPayableLineItem) {
			NotificationChain msgs = null;
			if (erpPayableLineItem != null)
				msgs = ((InternalEObject)erpPayableLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpPayableLineItem.class, msgs);
			if (newErpPayableLineItem != null)
				msgs = ((InternalEObject)newErpPayableLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpPayableLineItem.class, msgs);
			msgs = basicSetErpPayableLineItem(newErpPayableLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM, newErpPayableLineItem, newErpPayableLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLineAmount() {
		return lineAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineAmount(float newLineAmount) {
		float oldLineAmount = lineAmount;
		lineAmount = newLineAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT, oldLineAmount, lineAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecLineItem getErpRecLineItem() {
		if (erpRecLineItem != null && erpRecLineItem.eIsProxy()) {
			InternalEObject oldErpRecLineItem = (InternalEObject)erpRecLineItem;
			erpRecLineItem = (ErpRecLineItem)eResolveProxy(oldErpRecLineItem);
			if (erpRecLineItem != oldErpRecLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM, oldErpRecLineItem, erpRecLineItem));
			}
		}
		return erpRecLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecLineItem basicGetErpRecLineItem() {
		return erpRecLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpRecLineItem(ErpRecLineItem newErpRecLineItem, NotificationChain msgs) {
		ErpRecLineItem oldErpRecLineItem = erpRecLineItem;
		erpRecLineItem = newErpRecLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM, oldErpRecLineItem, newErpRecLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpRecLineItem(ErpRecLineItem newErpRecLineItem) {
		if (newErpRecLineItem != erpRecLineItem) {
			NotificationChain msgs = null;
			if (erpRecLineItem != null)
				msgs = ((InternalEObject)erpRecLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecLineItem.class, msgs);
			if (newErpRecLineItem != null)
				msgs = ((InternalEObject)newErpRecLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecLineItem.class, msgs);
			msgs = basicSetErpRecLineItem(newErpRecLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM, newErpRecLineItem, newErpRecLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Settlement> getSettlements() {
		if (settlements == null) {
			settlements = new EObjectWithInverseResolvingEList.ManyInverse<Settlement>(Settlement.class, this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__SETTLEMENTS, MarketOperationsPackage.SETTLEMENT__ERP_INVOICE_LINE_ITEMS);
		}
		return settlements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPreviousAmount() {
		return previousAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousAmount(float newPreviousAmount) {
		float oldPreviousAmount = previousAmount;
		previousAmount = newPreviousAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT, oldPreviousAmount, previousAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkBillingInfo> getWorkBillingInfos() {
		if (workBillingInfos == null) {
			workBillingInfos = new EObjectWithInverseResolvingEList.ManyInverse<WorkBillingInfo>(WorkBillingInfo.class, this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS, InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS);
		}
		return workBillingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketFactors> getMarketFactors() {
		if (marketFactors == null) {
			marketFactors = new EObjectWithInverseResolvingEList.ManyInverse<MarketFactors>(MarketFactors.class, this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__MARKET_FACTORS, MarketOperationsPackage.MARKET_FACTORS__ERP_INVOICES);
		}
		return marketFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPayment> getErpPayments() {
		if (erpPayments == null) {
			erpPayments = new EObjectWithInverseResolvingEList.ManyInverse<ErpPayment>(ErpPayment.class, this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS, InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS);
		}
		return erpPayments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItemKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ErpInvoiceLineItemKind newKind) {
		ErpInvoiceLineItemKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getGlDateTime() {
		return glDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlDateTime(Date newGlDateTime) {
		Date oldGlDateTime = glDateTime;
		glDateTime = newGlDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME, oldGlDateTime, glDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem getContainerErpInvoiceLineItem() {
		if (containerErpInvoiceLineItem != null && containerErpInvoiceLineItem.eIsProxy()) {
			InternalEObject oldContainerErpInvoiceLineItem = (InternalEObject)containerErpInvoiceLineItem;
			containerErpInvoiceLineItem = (ErpInvoiceLineItem)eResolveProxy(oldContainerErpInvoiceLineItem);
			if (containerErpInvoiceLineItem != oldContainerErpInvoiceLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM, oldContainerErpInvoiceLineItem, containerErpInvoiceLineItem));
			}
		}
		return containerErpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem basicGetContainerErpInvoiceLineItem() {
		return containerErpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerErpInvoiceLineItem(ErpInvoiceLineItem newContainerErpInvoiceLineItem, NotificationChain msgs) {
		ErpInvoiceLineItem oldContainerErpInvoiceLineItem = containerErpInvoiceLineItem;
		containerErpInvoiceLineItem = newContainerErpInvoiceLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM, oldContainerErpInvoiceLineItem, newContainerErpInvoiceLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerErpInvoiceLineItem(ErpInvoiceLineItem newContainerErpInvoiceLineItem) {
		if (newContainerErpInvoiceLineItem != containerErpInvoiceLineItem) {
			NotificationChain msgs = null;
			if (containerErpInvoiceLineItem != null)
				msgs = ((InternalEObject)containerErpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS, ErpInvoiceLineItem.class, msgs);
			if (newContainerErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newContainerErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetContainerErpInvoiceLineItem(newContainerErpInvoiceLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM, newContainerErpInvoiceLineItem, newContainerErpInvoiceLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecDelvLineItem getErpRecDelvLineItem() {
		if (erpRecDelvLineItem != null && erpRecDelvLineItem.eIsProxy()) {
			InternalEObject oldErpRecDelvLineItem = (InternalEObject)erpRecDelvLineItem;
			erpRecDelvLineItem = (ErpRecDelvLineItem)eResolveProxy(oldErpRecDelvLineItem);
			if (erpRecDelvLineItem != oldErpRecDelvLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, oldErpRecDelvLineItem, erpRecDelvLineItem));
			}
		}
		return erpRecDelvLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecDelvLineItem basicGetErpRecDelvLineItem() {
		return erpRecDelvLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpRecDelvLineItem(ErpRecDelvLineItem newErpRecDelvLineItem, NotificationChain msgs) {
		ErpRecDelvLineItem oldErpRecDelvLineItem = erpRecDelvLineItem;
		erpRecDelvLineItem = newErpRecDelvLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, oldErpRecDelvLineItem, newErpRecDelvLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpRecDelvLineItem(ErpRecDelvLineItem newErpRecDelvLineItem) {
		if (newErpRecDelvLineItem != erpRecDelvLineItem) {
			NotificationChain msgs = null;
			if (erpRecDelvLineItem != null)
				msgs = ((InternalEObject)erpRecDelvLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
			if (newErpRecDelvLineItem != null)
				msgs = ((InternalEObject)newErpRecDelvLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
			msgs = basicSetErpRecDelvLineItem(newErpRecDelvLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, newErpRecDelvLineItem, newErpRecDelvLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlAccount() {
		return glAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlAccount(String newGlAccount) {
		String oldGlAccount = glAccount;
		glAccount = newGlAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT, oldGlAccount, glAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getBillPeriod() {
		if (billPeriod != null && billPeriod.eIsProxy()) {
			InternalEObject oldBillPeriod = (InternalEObject)billPeriod;
			billPeriod = (DateTimeInterval)eResolveProxy(oldBillPeriod);
			if (billPeriod != oldBillPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD, oldBillPeriod, billPeriod));
			}
		}
		return billPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetBillPeriod() {
		return billPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillPeriod(DateTimeInterval newBillPeriod) {
		DateTimeInterval oldBillPeriod = billPeriod;
		billPeriod = newBillPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD, oldBillPeriod, billPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(String newLineNumber) {
		String oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new EObjectWithInverseResolvingEList.ManyInverse<UserAttribute>(UserAttribute.class, this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES, CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS);
		}
		return userAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineVersion() {
		return lineVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineVersion(String newLineVersion) {
		String oldLineVersion = lineVersion;
		lineVersion = newLineVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION, oldLineVersion, lineVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoice getErpInvoice() {
		if (erpInvoice != null && erpInvoice.eIsProxy()) {
			InternalEObject oldErpInvoice = (InternalEObject)erpInvoice;
			erpInvoice = (ErpInvoice)eResolveProxy(oldErpInvoice);
			if (erpInvoice != oldErpInvoice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE, oldErpInvoice, erpInvoice));
			}
		}
		return erpInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoice basicGetErpInvoice() {
		return erpInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpInvoice(ErpInvoice newErpInvoice, NotificationChain msgs) {
		ErpInvoice oldErpInvoice = erpInvoice;
		erpInvoice = newErpInvoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE, oldErpInvoice, newErpInvoice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpInvoice(ErpInvoice newErpInvoice) {
		if (newErpInvoice != erpInvoice) {
			NotificationChain msgs = null;
			if (erpInvoice != null)
				msgs = ((InternalEObject)erpInvoice).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS, ErpInvoice.class, msgs);
			if (newErpInvoice != null)
				msgs = ((InternalEObject)newErpInvoice).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS, ErpInvoice.class, msgs);
			msgs = basicSetErpInvoice(newErpInvoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE, newErpInvoice, newErpInvoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerBillingInfo> getCustomerBillingInfos() {
		if (customerBillingInfos == null) {
			customerBillingInfos = new EObjectWithInverseResolvingEList.ManyInverse<CustomerBillingInfo>(CustomerBillingInfo.class, this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS, InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS);
		}
		return customerBillingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getComponentErpInvoiceLineItems() {
		if (componentErpInvoiceLineItems == null) {
			componentErpInvoiceLineItems = new EObjectWithInverseResolvingEList<ErpInvoiceLineItem>(ErpInvoiceLineItem.class, this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM);
		}
		return componentErpInvoiceLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpJournalEntry> getErpJournalEntries() {
		if (erpJournalEntries == null) {
			erpJournalEntries = new EObjectWithInverseResolvingEList<ErpJournalEntry>(ErpJournalEntry.class, this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM);
		}
		return erpJournalEntries;
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				if (erpQuoteLineItem != null)
					msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpQuoteLineItem.class, msgs);
				return basicSetErpQuoteLineItem((ErpQuoteLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				if (erpPayableLineItem != null)
					msgs = ((InternalEObject)erpPayableLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpPayableLineItem.class, msgs);
				return basicSetErpPayableLineItem((ErpPayableLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				if (erpRecLineItem != null)
					msgs = ((InternalEObject)erpRecLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecLineItem.class, msgs);
				return basicSetErpRecLineItem((ErpRecLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__SETTLEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSettlements()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkBillingInfos()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__MARKET_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarketFactors()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayments()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				if (containerErpInvoiceLineItem != null)
					msgs = ((InternalEObject)containerErpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS, ErpInvoiceLineItem.class, msgs);
				return basicSetContainerErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				if (erpRecDelvLineItem != null)
					msgs = ((InternalEObject)erpRecDelvLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
				return basicSetErpRecDelvLineItem((ErpRecDelvLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				if (erpInvoice != null)
					msgs = ((InternalEObject)erpInvoice).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS, ErpInvoice.class, msgs);
				return basicSetErpInvoice((ErpInvoice)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerBillingInfos()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpJournalEntries()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				return basicSetErpQuoteLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				return basicSetErpPayableLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				return basicSetErpRecLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__SETTLEMENTS:
				return ((InternalEList<?>)getSettlements()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				return ((InternalEList<?>)getWorkBillingInfos()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__MARKET_FACTORS:
				return ((InternalEList<?>)getMarketFactors()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				return ((InternalEList<?>)getErpPayments()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				return basicSetContainerErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				return basicSetErpRecDelvLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				return basicSetErpInvoice(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				return ((InternalEList<?>)getCustomerBillingInfos()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getComponentErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<?>)getErpJournalEntries()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				if (resolve) return getErpQuoteLineItem();
				return basicGetErpQuoteLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT:
				return getNetAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				if (resolve) return getErpPayableLineItem();
				return basicGetErpPayableLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT:
				return getLineAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				if (resolve) return getErpRecLineItem();
				return basicGetErpRecLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__SETTLEMENTS:
				return getSettlements();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT:
				return getPreviousAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				return getWorkBillingInfos();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__MARKET_FACTORS:
				return getMarketFactors();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				return getErpPayments();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND:
				return getKind();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME:
				return getGlDateTime();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				if (resolve) return getContainerErpInvoiceLineItem();
				return basicGetContainerErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				if (resolve) return getErpRecDelvLineItem();
				return basicGetErpRecDelvLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT:
				return getGlAccount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				if (resolve) return getBillPeriod();
				return basicGetBillPeriod();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER:
				return getLineNumber();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				return getUserAttributes();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION:
				return getLineVersion();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				if (resolve) return getErpInvoice();
				return basicGetErpInvoice();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				return getCustomerBillingInfos();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				return getComponentErpInvoiceLineItems();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return getErpJournalEntries();
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT:
				setNetAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				setErpPayableLineItem((ErpPayableLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT:
				setLineAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				setErpRecLineItem((ErpRecLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__SETTLEMENTS:
				getSettlements().clear();
				getSettlements().addAll((Collection<? extends Settlement>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT:
				setPreviousAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				getWorkBillingInfos().clear();
				getWorkBillingInfos().addAll((Collection<? extends WorkBillingInfo>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__MARKET_FACTORS:
				getMarketFactors().clear();
				getMarketFactors().addAll((Collection<? extends MarketFactors>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				getErpPayments().clear();
				getErpPayments().addAll((Collection<? extends ErpPayment>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND:
				setKind((ErpInvoiceLineItemKind)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME:
				setGlDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				setContainerErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				setErpRecDelvLineItem((ErpRecDelvLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT:
				setGlAccount((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				setBillPeriod((DateTimeInterval)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER:
				setLineNumber((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION:
				setLineVersion((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				setErpInvoice((ErpInvoice)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				getCustomerBillingInfos().clear();
				getCustomerBillingInfos().addAll((Collection<? extends CustomerBillingInfo>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				getComponentErpInvoiceLineItems().clear();
				getComponentErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				getErpJournalEntries().addAll((Collection<? extends ErpJournalEntry>)newValue);
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT:
				setNetAmount(NET_AMOUNT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				setErpPayableLineItem((ErpPayableLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT:
				setLineAmount(LINE_AMOUNT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				setErpRecLineItem((ErpRecLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__SETTLEMENTS:
				getSettlements().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT:
				setPreviousAmount(PREVIOUS_AMOUNT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				getWorkBillingInfos().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__MARKET_FACTORS:
				getMarketFactors().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				getErpPayments().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME:
				setGlDateTime(GL_DATE_TIME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				setContainerErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				setErpRecDelvLineItem((ErpRecDelvLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT:
				setGlAccount(GL_ACCOUNT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				setBillPeriod((DateTimeInterval)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION:
				setLineVersion(LINE_VERSION_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				setErpInvoice((ErpInvoice)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				getCustomerBillingInfos().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				getComponentErpInvoiceLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				return erpQuoteLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT:
				return netAmount != NET_AMOUNT_EDEFAULT;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				return erpPayableLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT:
				return lineAmount != LINE_AMOUNT_EDEFAULT;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				return erpRecLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__SETTLEMENTS:
				return settlements != null && !settlements.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT:
				return previousAmount != PREVIOUS_AMOUNT_EDEFAULT;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				return workBillingInfos != null && !workBillingInfos.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__MARKET_FACTORS:
				return marketFactors != null && !marketFactors.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				return erpPayments != null && !erpPayments.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND:
				return kind != KIND_EDEFAULT;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME:
				return GL_DATE_TIME_EDEFAULT == null ? glDateTime != null : !GL_DATE_TIME_EDEFAULT.equals(glDateTime);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				return containerErpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				return erpRecDelvLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT:
				return GL_ACCOUNT_EDEFAULT == null ? glAccount != null : !GL_ACCOUNT_EDEFAULT.equals(glAccount);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				return billPeriod != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER:
				return LINE_NUMBER_EDEFAULT == null ? lineNumber != null : !LINE_NUMBER_EDEFAULT.equals(lineNumber);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION:
				return LINE_VERSION_EDEFAULT == null ? lineVersion != null : !LINE_VERSION_EDEFAULT.equals(lineVersion);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				return erpInvoice != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				return customerBillingInfos != null && !customerBillingInfos.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				return componentErpInvoiceLineItems != null && !componentErpInvoiceLineItems.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return erpJournalEntries != null && !erpJournalEntries.isEmpty();
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
		result.append(" (netAmount: ");
		result.append(netAmount);
		result.append(", lineAmount: ");
		result.append(lineAmount);
		result.append(", previousAmount: ");
		result.append(previousAmount);
		result.append(", kind: ");
		result.append(kind);
		result.append(", glDateTime: ");
		result.append(glDateTime);
		result.append(", glAccount: ");
		result.append(glAccount);
		result.append(", lineNumber: ");
		result.append(lineNumber);
		result.append(", lineVersion: ");
		result.append(lineVersion);
		result.append(')');
		return result.toString();
	}

} //ErpInvoiceLineItemImpl
