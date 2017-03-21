/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpJournal;
import CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry;
import CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;
import CIM.IEC61970.Informative.InfERPSupport.ErpPayableLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.CostType;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;

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
 * An implementation of the model object '<em><b>Erp Journal Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getErpLedgerEntry <em>Erp Ledger Entry</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getErpJournal <em>Erp Journal</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getPostingDateTime <em>Posting Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getCostTypes <em>Cost Types</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getErpPayableLineItems <em>Erp Payable Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getErpRecLineItems <em>Erp Rec Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpJournalEntryImpl#getSourceID <em>Source ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpJournalEntryImpl extends IdentifiedObjectImpl implements ErpJournalEntry {
	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected String accountID = ACCOUNT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpLedgerEntry() <em>Erp Ledger Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerEntry()
	 * @generated
	 * @ordered
	 */
	protected ErpLedgerEntry erpLedgerEntry;

	/**
	 * The cached value of the '{@link #getErpJournal() <em>Erp Journal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJournal()
	 * @generated
	 * @ordered
	 */
	protected ErpJournal erpJournal;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getPostingDateTime() <em>Posting Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostingDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTING_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostingDateTime() <em>Posting Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostingDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date postingDateTime = POSTING_DATE_TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getCostTypes() <em>Cost Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CostType> costTypes;

	/**
	 * The cached value of the '{@link #getErpInvoiceLineItem() <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceLineItem erpInvoiceLineItem;

	/**
	 * The cached value of the '{@link #getErpPayableLineItems() <em>Erp Payable Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayableLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayableLineItem> erpPayableLineItems;

	/**
	 * The cached value of the '{@link #getErpRecLineItems() <em>Erp Rec Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecLineItem> erpRecLineItems;

	/**
	 * The default value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected String sourceID = SOURCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpJournalEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_JOURNAL_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		String oldAccountID = accountID;
		accountID = newAccountID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID, oldAccountID, accountID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerEntry getErpLedgerEntry() {
		if (erpLedgerEntry != null && erpLedgerEntry.eIsProxy()) {
			InternalEObject oldErpLedgerEntry = (InternalEObject)erpLedgerEntry;
			erpLedgerEntry = (ErpLedgerEntry)eResolveProxy(oldErpLedgerEntry);
			if (erpLedgerEntry != oldErpLedgerEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, oldErpLedgerEntry, erpLedgerEntry));
			}
		}
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerEntry basicGetErpLedgerEntry() {
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedgerEntry(ErpLedgerEntry newErpLedgerEntry, NotificationChain msgs) {
		ErpLedgerEntry oldErpLedgerEntry = erpLedgerEntry;
		erpLedgerEntry = newErpLedgerEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, oldErpLedgerEntry, newErpLedgerEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpLedgerEntry(ErpLedgerEntry newErpLedgerEntry) {
		if (newErpLedgerEntry != erpLedgerEntry) {
			NotificationChain msgs = null;
			if (erpLedgerEntry != null)
				msgs = ((InternalEObject)erpLedgerEntry).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, ErpLedgerEntry.class, msgs);
			if (newErpLedgerEntry != null)
				msgs = ((InternalEObject)newErpLedgerEntry).eInverseAdd(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, ErpLedgerEntry.class, msgs);
			msgs = basicSetErpLedgerEntry(newErpLedgerEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, newErpLedgerEntry, newErpLedgerEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournal getErpJournal() {
		if (erpJournal != null && erpJournal.eIsProxy()) {
			InternalEObject oldErpJournal = (InternalEObject)erpJournal;
			erpJournal = (ErpJournal)eResolveProxy(oldErpJournal);
			if (erpJournal != oldErpJournal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL, oldErpJournal, erpJournal));
			}
		}
		return erpJournal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournal basicGetErpJournal() {
		return erpJournal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpJournal(ErpJournal newErpJournal, NotificationChain msgs) {
		ErpJournal oldErpJournal = erpJournal;
		erpJournal = newErpJournal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL, oldErpJournal, newErpJournal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpJournal(ErpJournal newErpJournal) {
		if (newErpJournal != erpJournal) {
			NotificationChain msgs = null;
			if (erpJournal != null)
				msgs = ((InternalEObject)erpJournal).eInverseRemove(this, InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES, ErpJournal.class, msgs);
			if (newErpJournal != null)
				msgs = ((InternalEObject)newErpJournal).eInverseAdd(this, InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES, ErpJournal.class, msgs);
			msgs = basicSetErpJournal(newErpJournal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL, newErpJournal, newErpJournal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPostingDateTime() {
		return postingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostingDateTime(Date newPostingDateTime) {
		Date oldPostingDateTime = postingDateTime;
		postingDateTime = newPostingDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME, oldPostingDateTime, postingDateTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME, oldTransactionDateTime, transactionDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CostType> getCostTypes() {
		if (costTypes == null) {
			costTypes = new EObjectWithInverseResolvingEList.ManyInverse<CostType>(CostType.class, this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES, InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES);
		}
		return costTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem getErpInvoiceLineItem() {
		if (erpInvoiceLineItem != null && erpInvoiceLineItem.eIsProxy()) {
			InternalEObject oldErpInvoiceLineItem = (InternalEObject)erpInvoiceLineItem;
			erpInvoiceLineItem = (ErpInvoiceLineItem)eResolveProxy(oldErpInvoiceLineItem);
			if (erpInvoiceLineItem != oldErpInvoiceLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM, oldErpInvoiceLineItem, erpInvoiceLineItem));
			}
		}
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem basicGetErpInvoiceLineItem() {
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpInvoiceLineItem(ErpInvoiceLineItem newErpInvoiceLineItem, NotificationChain msgs) {
		ErpInvoiceLineItem oldErpInvoiceLineItem = erpInvoiceLineItem;
		erpInvoiceLineItem = newErpInvoiceLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM, oldErpInvoiceLineItem, newErpInvoiceLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpInvoiceLineItem(ErpInvoiceLineItem newErpInvoiceLineItem) {
		if (newErpInvoiceLineItem != erpInvoiceLineItem) {
			NotificationChain msgs = null;
			if (erpInvoiceLineItem != null)
				msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES, ErpInvoiceLineItem.class, msgs);
			if (newErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetErpInvoiceLineItem(newErpInvoiceLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM, newErpInvoiceLineItem, newErpInvoiceLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPayableLineItem> getErpPayableLineItems() {
		if (erpPayableLineItems == null) {
			erpPayableLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpPayableLineItem>(ErpPayableLineItem.class, this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_JOURNAL_ENTRIES);
		}
		return erpPayableLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpRecLineItem> getErpRecLineItems() {
		if (erpRecLineItems == null) {
			erpRecLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpRecLineItem>(ErpRecLineItem.class, this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES);
		}
		return erpRecLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceID() {
		return sourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceID(String newSourceID) {
		String oldSourceID = sourceID;
		sourceID = newSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID, oldSourceID, sourceID));
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
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				if (erpLedgerEntry != null)
					msgs = ((InternalEObject)erpLedgerEntry).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, ErpLedgerEntry.class, msgs);
				return basicSetErpLedgerEntry((ErpLedgerEntry)otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				if (erpJournal != null)
					msgs = ((InternalEObject)erpJournal).eInverseRemove(this, InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES, ErpJournal.class, msgs);
				return basicSetErpJournal((ErpJournal)otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCostTypes()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				if (erpInvoiceLineItem != null)
					msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES, ErpInvoiceLineItem.class, msgs);
				return basicSetErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayableLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				return basicSetErpLedgerEntry(null, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				return basicSetErpJournal(null, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				return ((InternalEList<?>)getCostTypes()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				return basicSetErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<?>)getErpPayableLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				return ((InternalEList<?>)getErpRecLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID:
				return getAccountID();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				if (resolve) return getErpLedgerEntry();
				return basicGetErpLedgerEntry();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				if (resolve) return getErpJournal();
				return basicGetErpJournal();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT:
				return getAmount();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME:
				return getPostingDateTime();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME:
				return getTransactionDateTime();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				return getCostTypes();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				if (resolve) return getErpInvoiceLineItem();
				return basicGetErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				return getErpPayableLineItems();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				return getErpRecLineItems();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID:
				return getSourceID();
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
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				setErpLedgerEntry((ErpLedgerEntry)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				setErpJournal((ErpJournal)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT:
				setAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME:
				setPostingDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME:
				setTransactionDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				getCostTypes().clear();
				getCostTypes().addAll((Collection<? extends CostType>)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				getErpPayableLineItems().addAll((Collection<? extends ErpPayableLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				getErpRecLineItems().clear();
				getErpRecLineItems().addAll((Collection<? extends ErpRecLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID:
				setSourceID((String)newValue);
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
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				setErpLedgerEntry((ErpLedgerEntry)null);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				setErpJournal((ErpJournal)null);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME:
				setPostingDateTime(POSTING_DATE_TIME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME:
				setTransactionDateTime(TRANSACTION_DATE_TIME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				getCostTypes().clear();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				getErpRecLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
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
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? accountID != null : !ACCOUNT_ID_EDEFAULT.equals(accountID);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				return erpLedgerEntry != null;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				return erpJournal != null;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME:
				return POSTING_DATE_TIME_EDEFAULT == null ? postingDateTime != null : !POSTING_DATE_TIME_EDEFAULT.equals(postingDateTime);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME:
				return TRANSACTION_DATE_TIME_EDEFAULT == null ? transactionDateTime != null : !TRANSACTION_DATE_TIME_EDEFAULT.equals(transactionDateTime);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				return costTypes != null && !costTypes.isEmpty();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				return erpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				return erpPayableLineItems != null && !erpPayableLineItems.isEmpty();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				return erpRecLineItems != null && !erpRecLineItems.isEmpty();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
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
		result.append(" (accountID: ");
		result.append(accountID);
		result.append(", amount: ");
		result.append(amount);
		result.append(", postingDateTime: ");
		result.append(postingDateTime);
		result.append(", transactionDateTime: ");
		result.append(transactionDateTime);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(')');
		return result.toString();
	}

} //ErpJournalEntryImpl
