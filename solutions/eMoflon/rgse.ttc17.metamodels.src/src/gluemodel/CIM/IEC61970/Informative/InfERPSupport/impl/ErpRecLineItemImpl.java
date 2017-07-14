/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPayment;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpRecLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpReceivable;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * An implementation of the model object '<em><b>Erp Rec Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl#getErpReceivable <em>Erp Receivable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpRecLineItemImpl#getErpPayments <em>Erp Payments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpRecLineItemImpl extends IdentifiedObjectImpl implements ErpRecLineItem {
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
	 * The cached value of the '{@link #getErpJournalEntries() <em>Erp Journal Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJournalEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpJournalEntry> erpJournalEntries;

	/**
	 * The cached value of the '{@link #getErpReceivable() <em>Erp Receivable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReceivable()
	 * @generated
	 * @ordered
	 */
	protected ErpReceivable erpReceivable;

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
	 * The cached value of the '{@link #getErpPayments() <em>Erp Payments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayments()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayment> erpPayments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpRecLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_REC_LINE_ITEM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REC_LINE_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_LINE_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpJournalEntry> getErpJournalEntries() {
		if (erpJournalEntries == null) {
			erpJournalEntries = new EObjectWithInverseResolvingEList.ManyInverse<ErpJournalEntry>(ErpJournalEntry.class, this, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS);
		}
		return erpJournalEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceivable getErpReceivable() {
		if (erpReceivable != null && erpReceivable.eIsProxy()) {
			InternalEObject oldErpReceivable = (InternalEObject)erpReceivable;
			erpReceivable = (ErpReceivable)eResolveProxy(oldErpReceivable);
			if (erpReceivable != oldErpReceivable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE, oldErpReceivable, erpReceivable));
			}
		}
		return erpReceivable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceivable basicGetErpReceivable() {
		return erpReceivable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpReceivable(ErpReceivable newErpReceivable, NotificationChain msgs) {
		ErpReceivable oldErpReceivable = erpReceivable;
		erpReceivable = newErpReceivable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE, oldErpReceivable, newErpReceivable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpReceivable(ErpReceivable newErpReceivable) {
		if (newErpReceivable != erpReceivable) {
			NotificationChain msgs = null;
			if (erpReceivable != null)
				msgs = ((InternalEObject)erpReceivable).eInverseRemove(this, InfERPSupportPackage.ERP_RECEIVABLE__ERP_REC_LINE_ITEMS, ErpReceivable.class, msgs);
			if (newErpReceivable != null)
				msgs = ((InternalEObject)newErpReceivable).eInverseAdd(this, InfERPSupportPackage.ERP_RECEIVABLE__ERP_REC_LINE_ITEMS, ErpReceivable.class, msgs);
			msgs = basicSetErpReceivable(newErpReceivable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE, newErpReceivable, newErpReceivable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, oldErpInvoiceLineItem, erpInvoiceLineItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, oldErpInvoiceLineItem, newErpInvoiceLineItem);
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
				msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			if (newErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetErpInvoiceLineItem(newErpInvoiceLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, newErpInvoiceLineItem, newErpInvoiceLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPayment> getErpPayments() {
		if (erpPayments == null) {
			erpPayments = new EObjectWithInverseResolvingEList.ManyInverse<ErpPayment>(ErpPayment.class, this, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_PAYMENTS, InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS);
		}
		return erpPayments;
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
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpJournalEntries()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE:
				if (erpReceivable != null)
					msgs = ((InternalEObject)erpReceivable).eInverseRemove(this, InfERPSupportPackage.ERP_RECEIVABLE__ERP_REC_LINE_ITEMS, ErpReceivable.class, msgs);
				return basicSetErpReceivable((ErpReceivable)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (erpInvoiceLineItem != null)
					msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
				return basicSetErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_PAYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayments()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<?>)getErpJournalEntries()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE:
				return basicSetErpReceivable(null, msgs);
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return basicSetErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_PAYMENTS:
				return ((InternalEList<?>)getErpPayments()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return getErpJournalEntries();
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE:
				if (resolve) return getErpReceivable();
				return basicGetErpReceivable();
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (resolve) return getErpInvoiceLineItem();
				return basicGetErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_PAYMENTS:
				return getErpPayments();
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
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				getErpJournalEntries().addAll((Collection<? extends ErpJournalEntry>)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE:
				setErpReceivable((ErpReceivable)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_PAYMENTS:
				getErpPayments().clear();
				getErpPayments().addAll((Collection<? extends ErpPayment>)newValue);
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
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				return;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE:
				setErpReceivable((ErpReceivable)null);
				return;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_PAYMENTS:
				getErpPayments().clear();
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
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return erpJournalEntries != null && !erpJournalEntries.isEmpty();
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_RECEIVABLE:
				return erpReceivable != null;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return erpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_PAYMENTS:
				return erpPayments != null && !erpPayments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErpRecLineItemImpl
