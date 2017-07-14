/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeEntry;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpTimeSheet;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Time Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeEntryImpl#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeEntryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.impl.ErpTimeEntryImpl#getErpTimeSheet <em>Erp Time Sheet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpTimeEntryImpl extends IdentifiedObjectImpl implements ErpTimeEntry {
	/**
	 * The cached value of the '{@link #getErpProjectAccounting() <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpProjectAccounting()
	 * @generated
	 * @ordered
	 */
	protected ErpProjectAccounting erpProjectAccounting;

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
	 * The cached value of the '{@link #getErpTimeSheet() <em>Erp Time Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpTimeSheet()
	 * @generated
	 * @ordered
	 */
	protected ErpTimeSheet erpTimeSheet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpTimeEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_TIME_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpProjectAccounting getErpProjectAccounting() {
		if (erpProjectAccounting != null && erpProjectAccounting.eIsProxy()) {
			InternalEObject oldErpProjectAccounting = (InternalEObject)erpProjectAccounting;
			erpProjectAccounting = (ErpProjectAccounting)eResolveProxy(oldErpProjectAccounting);
			if (erpProjectAccounting != oldErpProjectAccounting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING, oldErpProjectAccounting, erpProjectAccounting));
			}
		}
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpProjectAccounting basicGetErpProjectAccounting() {
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpProjectAccounting(ErpProjectAccounting newErpProjectAccounting, NotificationChain msgs) {
		ErpProjectAccounting oldErpProjectAccounting = erpProjectAccounting;
		erpProjectAccounting = newErpProjectAccounting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING, oldErpProjectAccounting, newErpProjectAccounting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpProjectAccounting(ErpProjectAccounting newErpProjectAccounting) {
		if (newErpProjectAccounting != erpProjectAccounting) {
			NotificationChain msgs = null;
			if (erpProjectAccounting != null)
				msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES, ErpProjectAccounting.class, msgs);
			if (newErpProjectAccounting != null)
				msgs = ((InternalEObject)newErpProjectAccounting).eInverseAdd(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES, ErpProjectAccounting.class, msgs);
			msgs = basicSetErpProjectAccounting(newErpProjectAccounting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING, newErpProjectAccounting, newErpProjectAccounting));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_TIME_ENTRY__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_TIME_ENTRY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpTimeSheet getErpTimeSheet() {
		if (erpTimeSheet != null && erpTimeSheet.eIsProxy()) {
			InternalEObject oldErpTimeSheet = (InternalEObject)erpTimeSheet;
			erpTimeSheet = (ErpTimeSheet)eResolveProxy(oldErpTimeSheet);
			if (erpTimeSheet != oldErpTimeSheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET, oldErpTimeSheet, erpTimeSheet));
			}
		}
		return erpTimeSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpTimeSheet basicGetErpTimeSheet() {
		return erpTimeSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpTimeSheet(ErpTimeSheet newErpTimeSheet, NotificationChain msgs) {
		ErpTimeSheet oldErpTimeSheet = erpTimeSheet;
		erpTimeSheet = newErpTimeSheet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET, oldErpTimeSheet, newErpTimeSheet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpTimeSheet(ErpTimeSheet newErpTimeSheet) {
		if (newErpTimeSheet != erpTimeSheet) {
			NotificationChain msgs = null;
			if (erpTimeSheet != null)
				msgs = ((InternalEObject)erpTimeSheet).eInverseRemove(this, InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES, ErpTimeSheet.class, msgs);
			if (newErpTimeSheet != null)
				msgs = ((InternalEObject)newErpTimeSheet).eInverseAdd(this, InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES, ErpTimeSheet.class, msgs);
			msgs = basicSetErpTimeSheet(newErpTimeSheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET, newErpTimeSheet, newErpTimeSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				if (erpProjectAccounting != null)
					msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES, ErpProjectAccounting.class, msgs);
				return basicSetErpProjectAccounting((ErpProjectAccounting)otherEnd, msgs);
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				if (erpTimeSheet != null)
					msgs = ((InternalEObject)erpTimeSheet).eInverseRemove(this, InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES, ErpTimeSheet.class, msgs);
				return basicSetErpTimeSheet((ErpTimeSheet)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				return basicSetErpProjectAccounting(null, msgs);
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				return basicSetErpTimeSheet(null, msgs);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				if (resolve) return getErpProjectAccounting();
				return basicGetErpProjectAccounting();
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				if (resolve) return getErpTimeSheet();
				return basicGetErpTimeSheet();
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)newValue);
				return;
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				setErpTimeSheet((ErpTimeSheet)newValue);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)null);
				return;
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				setErpTimeSheet((ErpTimeSheet)null);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				return erpProjectAccounting != null;
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				return erpTimeSheet != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpTimeEntryImpl
