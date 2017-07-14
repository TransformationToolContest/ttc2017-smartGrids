/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostSummary;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Cost Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.WorkCostSummaryImpl#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkCostSummaryImpl extends DocumentImpl implements WorkCostSummary {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkCostSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_COST_SUMMARY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, oldWorkCostDetail, workCostDetail));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, oldWorkCostDetail, newWorkCostDetail);
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
				msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY, WorkCostDetail.class, msgs);
			if (newWorkCostDetail != null)
				msgs = ((InternalEObject)newWorkCostDetail).eInverseAdd(this, InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY, WorkCostDetail.class, msgs);
			msgs = basicSetWorkCostDetail(newWorkCostDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, newWorkCostDetail, newWorkCostDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL:
				if (workCostDetail != null)
					msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY, WorkCostDetail.class, msgs);
				return basicSetWorkCostDetail((WorkCostDetail)otherEnd, msgs);
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
			case InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL:
				return basicSetWorkCostDetail(null, msgs);
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
			case InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL:
				if (resolve) return getWorkCostDetail();
				return basicGetWorkCostDetail();
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
			case InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)newValue);
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
			case InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)null);
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
			case InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL:
				return workCostDetail != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkCostSummaryImpl
