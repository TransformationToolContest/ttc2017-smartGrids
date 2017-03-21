/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.OverheadCost;
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
 * An implementation of the model object '<em><b>Overhead Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.OverheadCostImpl#getWorkCostDetails <em>Work Cost Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverheadCostImpl extends IdentifiedObjectImpl implements OverheadCost {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkTask> workTasks;

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
	 * The cached value of the '{@link #getWorkCostDetails() <em>Work Cost Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCostDetail> workCostDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverheadCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.OVERHEAD_COST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.OVERHEAD_COST__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.OVERHEAD_COST__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new EObjectWithInverseResolvingEList<WorkTask>(WorkTask.class, this, InfWorkPackage.OVERHEAD_COST__WORK_TASKS, InfWorkPackage.WORK_TASK__OVERHEAD_COST);
		}
		return workTasks;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.OVERHEAD_COST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.OVERHEAD_COST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new EObjectWithInverseResolvingEList<WorkCostDetail>(WorkCostDetail.class, this, InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS, InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST);
		}
		return workCostDetails;
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
			case InfWorkPackage.OVERHEAD_COST__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.OVERHEAD_COST__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.OVERHEAD_COST__CODE:
				return getCode();
			case InfWorkPackage.OVERHEAD_COST__COST:
				return getCost();
			case InfWorkPackage.OVERHEAD_COST__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.OVERHEAD_COST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS:
				return getWorkCostDetails();
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
			case InfWorkPackage.OVERHEAD_COST__CODE:
				setCode((String)newValue);
				return;
			case InfWorkPackage.OVERHEAD_COST__COST:
				setCost((Float)newValue);
				return;
			case InfWorkPackage.OVERHEAD_COST__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.OVERHEAD_COST__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
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
			case InfWorkPackage.OVERHEAD_COST__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case InfWorkPackage.OVERHEAD_COST__COST:
				setCost(COST_EDEFAULT);
				return;
			case InfWorkPackage.OVERHEAD_COST__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.OVERHEAD_COST__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
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
			case InfWorkPackage.OVERHEAD_COST__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case InfWorkPackage.OVERHEAD_COST__COST:
				return cost != COST_EDEFAULT;
			case InfWorkPackage.OVERHEAD_COST__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.OVERHEAD_COST__STATUS:
				return status != null;
			case InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //OverheadCostImpl
