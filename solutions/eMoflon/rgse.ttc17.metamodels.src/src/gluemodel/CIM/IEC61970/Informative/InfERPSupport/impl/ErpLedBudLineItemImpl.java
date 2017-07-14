/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerBudget;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Led Bud Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedBudLineItemImpl#getErpLedgerBudget <em>Erp Ledger Budget</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedBudLineItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpLedBudLineItemImpl#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpLedBudLineItemImpl extends IdentifiedObjectImpl implements ErpLedBudLineItem {
	/**
	 * The cached value of the '{@link #getErpLedgerBudget() <em>Erp Ledger Budget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerBudget()
	 * @generated
	 * @ordered
	 */
	protected ErpLedgerBudget erpLedgerBudget;

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
	 * The cached value of the '{@link #getErpLedBudLineItem() <em>Erp Led Bud Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedBudLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpLedgerEntry erpLedBudLineItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpLedBudLineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_LED_BUD_LINE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerBudget getErpLedgerBudget() {
		if (erpLedgerBudget != null && erpLedgerBudget.eIsProxy()) {
			InternalEObject oldErpLedgerBudget = (InternalEObject)erpLedgerBudget;
			erpLedgerBudget = (ErpLedgerBudget)eResolveProxy(oldErpLedgerBudget);
			if (erpLedgerBudget != oldErpLedgerBudget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET, oldErpLedgerBudget, erpLedgerBudget));
			}
		}
		return erpLedgerBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerBudget basicGetErpLedgerBudget() {
		return erpLedgerBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedgerBudget(ErpLedgerBudget newErpLedgerBudget, NotificationChain msgs) {
		ErpLedgerBudget oldErpLedgerBudget = erpLedgerBudget;
		erpLedgerBudget = newErpLedgerBudget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET, oldErpLedgerBudget, newErpLedgerBudget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpLedgerBudget(ErpLedgerBudget newErpLedgerBudget) {
		if (newErpLedgerBudget != erpLedgerBudget) {
			NotificationChain msgs = null;
			if (erpLedgerBudget != null)
				msgs = ((InternalEObject)erpLedgerBudget).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS, ErpLedgerBudget.class, msgs);
			if (newErpLedgerBudget != null)
				msgs = ((InternalEObject)newErpLedgerBudget).eInverseAdd(this, InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS, ErpLedgerBudget.class, msgs);
			msgs = basicSetErpLedgerBudget(newErpLedgerBudget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET, newErpLedgerBudget, newErpLedgerBudget));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerEntry getErpLedBudLineItem() {
		if (erpLedBudLineItem != null && erpLedBudLineItem.eIsProxy()) {
			InternalEObject oldErpLedBudLineItem = (InternalEObject)erpLedBudLineItem;
			erpLedBudLineItem = (ErpLedgerEntry)eResolveProxy(oldErpLedBudLineItem);
			if (erpLedBudLineItem != oldErpLedBudLineItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, oldErpLedBudLineItem, erpLedBudLineItem));
			}
		}
		return erpLedBudLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerEntry basicGetErpLedBudLineItem() {
		return erpLedBudLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedBudLineItem(ErpLedgerEntry newErpLedBudLineItem, NotificationChain msgs) {
		ErpLedgerEntry oldErpLedBudLineItem = erpLedBudLineItem;
		erpLedBudLineItem = newErpLedBudLineItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, oldErpLedBudLineItem, newErpLedBudLineItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpLedBudLineItem(ErpLedgerEntry newErpLedBudLineItem) {
		if (newErpLedBudLineItem != erpLedBudLineItem) {
			NotificationChain msgs = null;
			if (erpLedBudLineItem != null)
				msgs = ((InternalEObject)erpLedBudLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, ErpLedgerEntry.class, msgs);
			if (newErpLedBudLineItem != null)
				msgs = ((InternalEObject)newErpLedBudLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, ErpLedgerEntry.class, msgs);
			msgs = basicSetErpLedBudLineItem(newErpLedBudLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, newErpLedBudLineItem, newErpLedBudLineItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				if (erpLedgerBudget != null)
					msgs = ((InternalEObject)erpLedgerBudget).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS, ErpLedgerBudget.class, msgs);
				return basicSetErpLedgerBudget((ErpLedgerBudget)otherEnd, msgs);
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				if (erpLedBudLineItem != null)
					msgs = ((InternalEObject)erpLedBudLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, ErpLedgerEntry.class, msgs);
				return basicSetErpLedBudLineItem((ErpLedgerEntry)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				return basicSetErpLedgerBudget(null, msgs);
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				return basicSetErpLedBudLineItem(null, msgs);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				if (resolve) return getErpLedgerBudget();
				return basicGetErpLedgerBudget();
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				if (resolve) return getErpLedBudLineItem();
				return basicGetErpLedBudLineItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				setErpLedgerBudget((ErpLedgerBudget)newValue);
				return;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				setErpLedBudLineItem((ErpLedgerEntry)newValue);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				setErpLedgerBudget((ErpLedgerBudget)null);
				return;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				setErpLedBudLineItem((ErpLedgerEntry)null);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				return erpLedgerBudget != null;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				return erpLedBudLineItem != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpLedBudLineItemImpl
