/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.Status;
import CIM.IEC61968.Common.UserAttribute;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpAccountKind;
import CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry;
import CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpLedger;
import CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * An implementation of the model object '<em><b>Erp Ledger Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getErpJounalEntry <em>Erp Jounal Entry</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getErpLedgerEntry <em>Erp Ledger Entry</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getSettlements <em>Settlements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getPostedDateTime <em>Posted Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getAccountKind <em>Account Kind</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedgerEntryImpl#getErpLedger <em>Erp Ledger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpLedgerEntryImpl extends IdentifiedObjectImpl implements ErpLedgerEntry {
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
	 * The cached value of the '{@link #getErpJounalEntry() <em>Erp Jounal Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJounalEntry()
	 * @generated
	 * @ordered
	 */
	protected ErpJournalEntry erpJounalEntry;

	/**
	 * The cached value of the '{@link #getErpLedgerEntry() <em>Erp Ledger Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerEntry()
	 * @generated
	 * @ordered
	 */
	protected ErpLedBudLineItem erpLedgerEntry;

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
	 * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userAttributes;

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
	 * The cached value of the '{@link #getSettlements() <em>Settlements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlements()
	 * @generated
	 * @ordered
	 */
	protected EList<Settlement> settlements;

	/**
	 * The default value of the '{@link #getPostedDateTime() <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostedDateTime() <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date postedDateTime = POSTED_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountKind() <em>Account Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountKind()
	 * @generated
	 * @ordered
	 */
	protected static final ErpAccountKind ACCOUNT_KIND_EDEFAULT = ErpAccountKind.NORMAL;

	/**
	 * The cached value of the '{@link #getAccountKind() <em>Account Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountKind()
	 * @generated
	 * @ordered
	 */
	protected ErpAccountKind accountKind = ACCOUNT_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpLedger() <em>Erp Ledger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedger()
	 * @generated
	 * @ordered
	 */
	protected ErpLedger erpLedger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpLedgerEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_LEDGER_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME, oldTransactionDateTime, transactionDateTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID, oldAccountID, accountID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournalEntry getErpJounalEntry() {
		if (erpJounalEntry != null && erpJounalEntry.eIsProxy()) {
			InternalEObject oldErpJounalEntry = (InternalEObject)erpJounalEntry;
			erpJounalEntry = (ErpJournalEntry)eResolveProxy(oldErpJounalEntry);
			if (erpJounalEntry != oldErpJounalEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, oldErpJounalEntry, erpJounalEntry));
			}
		}
		return erpJounalEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournalEntry basicGetErpJounalEntry() {
		return erpJounalEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpJounalEntry(ErpJournalEntry newErpJounalEntry, NotificationChain msgs) {
		ErpJournalEntry oldErpJounalEntry = erpJounalEntry;
		erpJounalEntry = newErpJounalEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, oldErpJounalEntry, newErpJounalEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpJounalEntry(ErpJournalEntry newErpJounalEntry) {
		if (newErpJounalEntry != erpJounalEntry) {
			NotificationChain msgs = null;
			if (erpJounalEntry != null)
				msgs = ((InternalEObject)erpJounalEntry).eInverseRemove(this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, ErpJournalEntry.class, msgs);
			if (newErpJounalEntry != null)
				msgs = ((InternalEObject)newErpJounalEntry).eInverseAdd(this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, ErpJournalEntry.class, msgs);
			msgs = basicSetErpJounalEntry(newErpJounalEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, newErpJounalEntry, newErpJounalEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedBudLineItem getErpLedgerEntry() {
		if (erpLedgerEntry != null && erpLedgerEntry.eIsProxy()) {
			InternalEObject oldErpLedgerEntry = (InternalEObject)erpLedgerEntry;
			erpLedgerEntry = (ErpLedBudLineItem)eResolveProxy(oldErpLedgerEntry);
			if (erpLedgerEntry != oldErpLedgerEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, oldErpLedgerEntry, erpLedgerEntry));
			}
		}
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedBudLineItem basicGetErpLedgerEntry() {
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedgerEntry(ErpLedBudLineItem newErpLedgerEntry, NotificationChain msgs) {
		ErpLedBudLineItem oldErpLedgerEntry = erpLedgerEntry;
		erpLedgerEntry = newErpLedgerEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, oldErpLedgerEntry, newErpLedgerEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpLedgerEntry(ErpLedBudLineItem newErpLedgerEntry) {
		if (newErpLedgerEntry != erpLedgerEntry) {
			NotificationChain msgs = null;
			if (erpLedgerEntry != null)
				msgs = ((InternalEObject)erpLedgerEntry).eInverseRemove(this, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, ErpLedBudLineItem.class, msgs);
			if (newErpLedgerEntry != null)
				msgs = ((InternalEObject)newErpLedgerEntry).eInverseAdd(this, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, ErpLedBudLineItem.class, msgs);
			msgs = basicSetErpLedgerEntry(newErpLedgerEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, newErpLedgerEntry, newErpLedgerEntry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new EObjectWithInverseResolvingEList.ManyInverse<UserAttribute>(UserAttribute.class, this, InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES, CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES);
		}
		return userAttributes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Settlement> getSettlements() {
		if (settlements == null) {
			settlements = new EObjectWithInverseResolvingEList.ManyInverse<Settlement>(Settlement.class, this, InfERPSupportPackage.ERP_LEDGER_ENTRY__SETTLEMENTS, MarketOperationsPackage.SETTLEMENT__ERP_LEDGER_ENTRIES);
		}
		return settlements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPostedDateTime() {
		return postedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostedDateTime(Date newPostedDateTime) {
		Date oldPostedDateTime = postedDateTime;
		postedDateTime = newPostedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME, oldPostedDateTime, postedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpAccountKind getAccountKind() {
		return accountKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountKind(ErpAccountKind newAccountKind) {
		ErpAccountKind oldAccountKind = accountKind;
		accountKind = newAccountKind == null ? ACCOUNT_KIND_EDEFAULT : newAccountKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND, oldAccountKind, accountKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedger getErpLedger() {
		if (erpLedger != null && erpLedger.eIsProxy()) {
			InternalEObject oldErpLedger = (InternalEObject)erpLedger;
			erpLedger = (ErpLedger)eResolveProxy(oldErpLedger);
			if (erpLedger != oldErpLedger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER, oldErpLedger, erpLedger));
			}
		}
		return erpLedger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedger basicGetErpLedger() {
		return erpLedger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedger(ErpLedger newErpLedger, NotificationChain msgs) {
		ErpLedger oldErpLedger = erpLedger;
		erpLedger = newErpLedger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER, oldErpLedger, newErpLedger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpLedger(ErpLedger newErpLedger) {
		if (newErpLedger != erpLedger) {
			NotificationChain msgs = null;
			if (erpLedger != null)
				msgs = ((InternalEObject)erpLedger).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES, ErpLedger.class, msgs);
			if (newErpLedger != null)
				msgs = ((InternalEObject)newErpLedger).eInverseAdd(this, InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES, ErpLedger.class, msgs);
			msgs = basicSetErpLedger(newErpLedger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER, newErpLedger, newErpLedger));
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				if (erpJounalEntry != null)
					msgs = ((InternalEObject)erpJounalEntry).eInverseRemove(this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, ErpJournalEntry.class, msgs);
				return basicSetErpJounalEntry((ErpJournalEntry)otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				if (erpLedgerEntry != null)
					msgs = ((InternalEObject)erpLedgerEntry).eInverseRemove(this, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, ErpLedBudLineItem.class, msgs);
				return basicSetErpLedgerEntry((ErpLedBudLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__SETTLEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSettlements()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				if (erpLedger != null)
					msgs = ((InternalEObject)erpLedger).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES, ErpLedger.class, msgs);
				return basicSetErpLedger((ErpLedger)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				return basicSetErpJounalEntry(null, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				return basicSetErpLedgerEntry(null, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__SETTLEMENTS:
				return ((InternalEList<?>)getSettlements()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				return basicSetErpLedger(null, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME:
				return getTransactionDateTime();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID:
				return getAccountID();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				if (resolve) return getErpJounalEntry();
				return basicGetErpJounalEntry();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				if (resolve) return getErpLedgerEntry();
				return basicGetErpLedgerEntry();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT:
				return getAmount();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				return getUserAttributes();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__SETTLEMENTS:
				return getSettlements();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME:
				return getPostedDateTime();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND:
				return getAccountKind();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				if (resolve) return getErpLedger();
				return basicGetErpLedger();
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME:
				setTransactionDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				setErpJounalEntry((ErpJournalEntry)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				setErpLedgerEntry((ErpLedBudLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT:
				setAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__SETTLEMENTS:
				getSettlements().clear();
				getSettlements().addAll((Collection<? extends Settlement>)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME:
				setPostedDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND:
				setAccountKind((ErpAccountKind)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				setErpLedger((ErpLedger)newValue);
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME:
				setTransactionDateTime(TRANSACTION_DATE_TIME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				setErpJounalEntry((ErpJournalEntry)null);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				setErpLedgerEntry((ErpLedBudLineItem)null);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__SETTLEMENTS:
				getSettlements().clear();
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME:
				setPostedDateTime(POSTED_DATE_TIME_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND:
				setAccountKind(ACCOUNT_KIND_EDEFAULT);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				setErpLedger((ErpLedger)null);
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME:
				return TRANSACTION_DATE_TIME_EDEFAULT == null ? transactionDateTime != null : !TRANSACTION_DATE_TIME_EDEFAULT.equals(transactionDateTime);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? accountID != null : !ACCOUNT_ID_EDEFAULT.equals(accountID);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				return erpJounalEntry != null;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				return erpLedgerEntry != null;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__SETTLEMENTS:
				return settlements != null && !settlements.isEmpty();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME:
				return POSTED_DATE_TIME_EDEFAULT == null ? postedDateTime != null : !POSTED_DATE_TIME_EDEFAULT.equals(postedDateTime);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND:
				return accountKind != ACCOUNT_KIND_EDEFAULT;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				return erpLedger != null;
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
		result.append(" (transactionDateTime: ");
		result.append(transactionDateTime);
		result.append(", accountID: ");
		result.append(accountID);
		result.append(", amount: ");
		result.append(amount);
		result.append(", postedDateTime: ");
		result.append(postedDateTime);
		result.append(", accountKind: ");
		result.append(accountKind);
		result.append(')');
		return result.toString();
	}

} //ErpLedgerEntryImpl
