/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.CUMaterialItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.CompatibleUnit;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkActionKind;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail;

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
 * An implementation of the model object '<em><b>Property Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl#getPropertyAccount <em>Property Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl#getCUMaterialItems <em>CU Material Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl#getAccountingUsage <em>Accounting Usage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.PropertyUnitImpl#getActivityCode <em>Activity Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyUnitImpl extends IdentifiedObjectImpl implements PropertyUnit {
	/**
	 * The cached value of the '{@link #getWorkCostDetails() <em>Work Cost Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCostDetail> workCostDetails;

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
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * The default value of the '{@link #getPropertyAccount() <em>Property Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyAccount() <em>Property Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAccount()
	 * @generated
	 * @ordered
	 */
	protected String propertyAccount = PROPERTY_ACCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCUMaterialItems() <em>CU Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUMaterialItem> cuMaterialItems;

	/**
	 * The default value of the '{@link #getAccountingUsage() <em>Accounting Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNTING_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountingUsage() <em>Accounting Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingUsage()
	 * @generated
	 * @ordered
	 */
	protected String accountingUsage = ACCOUNTING_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected static final WorkActionKind ACTIVITY_CODE_EDEFAULT = WorkActionKind.ABANDON;

	/**
	 * The cached value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected WorkActionKind activityCode = ACTIVITY_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.PROPERTY_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new EObjectWithInverseResolvingEList.ManyInverse<WorkCostDetail>(WorkCostDetail.class, this, InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS, InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS);
		}
		return workCostDetails;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.PROPERTY_UNIT__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROPERTY_UNIT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new EObjectWithInverseResolvingEList<CompatibleUnit>(CompatibleUnit.class, this, InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS, InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT);
		}
		return compatibleUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyAccount() {
		return propertyAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyAccount(String newPropertyAccount) {
		String oldPropertyAccount = propertyAccount;
		propertyAccount = newPropertyAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT, oldPropertyAccount, propertyAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CUMaterialItem> getCUMaterialItems() {
		if (cuMaterialItems == null) {
			cuMaterialItems = new EObjectWithInverseResolvingEList.ManyInverse<CUMaterialItem>(CUMaterialItem.class, this, InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS, InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS);
		}
		return cuMaterialItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountingUsage() {
		return accountingUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountingUsage(String newAccountingUsage) {
		String oldAccountingUsage = accountingUsage;
		accountingUsage = newAccountingUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE, oldAccountingUsage, accountingUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkActionKind getActivityCode() {
		return activityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityCode(WorkActionKind newActivityCode) {
		WorkActionKind oldActivityCode = activityCode;
		activityCode = newActivityCode == null ? ACTIVITY_CODE_EDEFAULT : newActivityCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE, oldActivityCode, activityCode));
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
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUMaterialItems()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				return ((InternalEList<?>)getCUMaterialItems()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT:
				return getPropertyAccount();
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				return getCUMaterialItems();
			case InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE:
				return getAccountingUsage();
			case InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE:
				return getActivityCode();
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
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT:
				setPropertyAccount((String)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				getCUMaterialItems().addAll((Collection<? extends CUMaterialItem>)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE:
				setAccountingUsage((String)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE:
				setActivityCode((WorkActionKind)newValue);
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
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT:
				setPropertyAccount(PROPERTY_ACCOUNT_EDEFAULT);
				return;
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				return;
			case InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE:
				setAccountingUsage(ACCOUNTING_USAGE_EDEFAULT);
				return;
			case InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE:
				setActivityCode(ACTIVITY_CODE_EDEFAULT);
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
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				return status != null;
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT:
				return PROPERTY_ACCOUNT_EDEFAULT == null ? propertyAccount != null : !PROPERTY_ACCOUNT_EDEFAULT.equals(propertyAccount);
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				return cuMaterialItems != null && !cuMaterialItems.isEmpty();
			case InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE:
				return ACCOUNTING_USAGE_EDEFAULT == null ? accountingUsage != null : !ACCOUNTING_USAGE_EDEFAULT.equals(accountingUsage);
			case InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE:
				return activityCode != ACTIVITY_CODE_EDEFAULT;
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
		result.append(" (propertyAccount: ");
		result.append(propertyAccount);
		result.append(", accountingUsage: ");
		result.append(accountingUsage);
		result.append(", activityCode: ");
		result.append(activityCode);
		result.append(')');
		return result.toString();
	}

} //PropertyUnitImpl
