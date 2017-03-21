/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpPayable;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.ContractorItem;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import CIM.IEC61970.Informative.InfWork.WorkTask;

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
 * An implementation of the model object '<em><b>Contractor Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl#getErpPayables <em>Erp Payables</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.ContractorItemImpl#getBidAmount <em>Bid Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractorItemImpl extends IdentifiedObjectImpl implements ContractorItem {
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
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected String activityCode = ACTIVITY_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErpPayables() <em>Erp Payables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayables()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayable> erpPayables;

	/**
	 * The cached value of the '{@link #getWorkCostDetail() <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetail()
	 * @generated
	 * @ordered
	 */
	protected WorkCostDetail workCostDetail;

	/**
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * The default value of the '{@link #getBidAmount() <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float BID_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBidAmount() <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidAmount()
	 * @generated
	 * @ordered
	 */
	protected float bidAmount = BID_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractorItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CONTRACTOR_ITEM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CONTRACTOR_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONTRACTOR_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONTRACTOR_ITEM__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityCode() {
		return activityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityCode(String newActivityCode) {
		String oldActivityCode = activityCode;
		activityCode = newActivityCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE, oldActivityCode, activityCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPayable> getErpPayables() {
		if (erpPayables == null) {
			erpPayables = new EObjectWithInverseResolvingEList.ManyInverse<ErpPayable>(ErpPayable.class, this, InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES, InfERPSupportPackage.ERP_PAYABLE__CONTRACTOR_ITEMS);
		}
		return erpPayables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostDetail getWorkCostDetail() {
		if (workCostDetail != null && workCostDetail.eIsProxy()) {
			InternalEObject oldWorkCostDetail = (InternalEObject)workCostDetail;
			workCostDetail = (WorkCostDetail)eResolveProxy(oldWorkCostDetail);
			if (workCostDetail != oldWorkCostDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL, oldWorkCostDetail, workCostDetail));
			}
		}
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostDetail basicGetWorkCostDetail() {
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkCostDetail(WorkCostDetail newWorkCostDetail, NotificationChain msgs) {
		WorkCostDetail oldWorkCostDetail = workCostDetail;
		workCostDetail = newWorkCostDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL, oldWorkCostDetail, newWorkCostDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkCostDetail(WorkCostDetail newWorkCostDetail) {
		if (newWorkCostDetail != workCostDetail) {
			NotificationChain msgs = null;
			if (workCostDetail != null)
				msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS, WorkCostDetail.class, msgs);
			if (newWorkCostDetail != null)
				msgs = ((InternalEObject)newWorkCostDetail).eInverseAdd(this, InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS, WorkCostDetail.class, msgs);
			msgs = basicSetWorkCostDetail(newWorkCostDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL, newWorkCostDetail, newWorkCostDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask getWorkTask() {
		if (workTask != null && workTask.eIsProxy()) {
			InternalEObject oldWorkTask = (InternalEObject)workTask;
			workTask = (WorkTask)eResolveProxy(oldWorkTask);
			if (workTask != oldWorkTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK, oldWorkTask, workTask));
			}
		}
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask basicGetWorkTask() {
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTask(WorkTask newWorkTask, NotificationChain msgs) {
		WorkTask oldWorkTask = workTask;
		workTask = newWorkTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK, oldWorkTask, newWorkTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkTask(WorkTask newWorkTask) {
		if (newWorkTask != workTask) {
			NotificationChain msgs = null;
			if (workTask != null)
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK, newWorkTask, newWorkTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBidAmount() {
		return bidAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidAmount(float newBidAmount) {
		float oldBidAmount = bidAmount;
		bidAmount = newBidAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT, oldBidAmount, bidAmount));
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
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayables()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				if (workCostDetail != null)
					msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS, WorkCostDetail.class, msgs);
				return basicSetWorkCostDetail((WorkCostDetail)otherEnd, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
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
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				return ((InternalEList<?>)getErpPayables()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				return basicSetWorkCostDetail(null, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				return basicSetWorkTask(null, msgs);
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
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.CONTRACTOR_ITEM__COST:
				return getCost();
			case InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE:
				return getActivityCode();
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				return getErpPayables();
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				if (resolve) return getWorkCostDetail();
				return basicGetWorkCostDetail();
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT:
				return getBidAmount();
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
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__COST:
				setCost((Float)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE:
				setActivityCode((String)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				getErpPayables().clear();
				getErpPayables().addAll((Collection<? extends ErpPayable>)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT:
				setBidAmount((Float)newValue);
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
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__COST:
				setCost(COST_EDEFAULT);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE:
				setActivityCode(ACTIVITY_CODE_EDEFAULT);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				getErpPayables().clear();
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)null);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT:
				setBidAmount(BID_AMOUNT_EDEFAULT);
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
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.CONTRACTOR_ITEM__COST:
				return cost != COST_EDEFAULT;
			case InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE:
				return ACTIVITY_CODE_EDEFAULT == null ? activityCode != null : !ACTIVITY_CODE_EDEFAULT.equals(activityCode);
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				return erpPayables != null && !erpPayables.isEmpty();
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				return workCostDetail != null;
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT:
				return bidAmount != BID_AMOUNT_EDEFAULT;
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", activityCode: ");
		result.append(activityCode);
		result.append(", bidAmount: ");
		result.append(bidAmount);
		result.append(')');
		return result.toString();
	}

} //ContractorItemImpl
