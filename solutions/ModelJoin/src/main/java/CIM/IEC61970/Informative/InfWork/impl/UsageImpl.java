/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.WorkEquipmentInfo;

import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.MaterialItem;
import CIM.IEC61970.Informative.InfWork.Usage;
import CIM.IEC61970.Informative.InfWork.WorkTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.UsageImpl#getWorkEquipmentAsset <em>Work Equipment Asset</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.UsageImpl#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.UsageImpl#getMaterialItem <em>Material Item</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.UsageImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageImpl extends IdentifiedObjectImpl implements Usage {
	/**
	 * The cached value of the '{@link #getWorkEquipmentAsset() <em>Work Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEquipmentAsset()
	 * @generated
	 * @ordered
	 */
	protected WorkEquipmentInfo workEquipmentAsset;

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
	 * The cached value of the '{@link #getMaterialItem() <em>Material Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItem()
	 * @generated
	 * @ordered
	 */
	protected MaterialItem materialItem;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEquipmentInfo getWorkEquipmentAsset() {
		if (workEquipmentAsset != null && workEquipmentAsset.eIsProxy()) {
			InternalEObject oldWorkEquipmentAsset = (InternalEObject)workEquipmentAsset;
			workEquipmentAsset = (WorkEquipmentInfo)eResolveProxy(oldWorkEquipmentAsset);
			if (workEquipmentAsset != oldWorkEquipmentAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET, oldWorkEquipmentAsset, workEquipmentAsset));
			}
		}
		return workEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEquipmentInfo basicGetWorkEquipmentAsset() {
		return workEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkEquipmentAsset(WorkEquipmentInfo newWorkEquipmentAsset, NotificationChain msgs) {
		WorkEquipmentInfo oldWorkEquipmentAsset = workEquipmentAsset;
		workEquipmentAsset = newWorkEquipmentAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET, oldWorkEquipmentAsset, newWorkEquipmentAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkEquipmentAsset(WorkEquipmentInfo newWorkEquipmentAsset) {
		if (newWorkEquipmentAsset != workEquipmentAsset) {
			NotificationChain msgs = null;
			if (workEquipmentAsset != null)
				msgs = ((InternalEObject)workEquipmentAsset).eInverseRemove(this, InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES, WorkEquipmentInfo.class, msgs);
			if (newWorkEquipmentAsset != null)
				msgs = ((InternalEObject)newWorkEquipmentAsset).eInverseAdd(this, InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES, WorkEquipmentInfo.class, msgs);
			msgs = basicSetWorkEquipmentAsset(newWorkEquipmentAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET, newWorkEquipmentAsset, newWorkEquipmentAsset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.USAGE__WORK_TASK, oldWorkTask, workTask));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.USAGE__WORK_TASK, oldWorkTask, newWorkTask);
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
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__USAGES, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__USAGES, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.USAGE__WORK_TASK, newWorkTask, newWorkTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialItem getMaterialItem() {
		if (materialItem != null && materialItem.eIsProxy()) {
			InternalEObject oldMaterialItem = (InternalEObject)materialItem;
			materialItem = (MaterialItem)eResolveProxy(oldMaterialItem);
			if (materialItem != oldMaterialItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.USAGE__MATERIAL_ITEM, oldMaterialItem, materialItem));
			}
		}
		return materialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialItem basicGetMaterialItem() {
		return materialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialItem(MaterialItem newMaterialItem, NotificationChain msgs) {
		MaterialItem oldMaterialItem = materialItem;
		materialItem = newMaterialItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.USAGE__MATERIAL_ITEM, oldMaterialItem, newMaterialItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialItem(MaterialItem newMaterialItem) {
		if (newMaterialItem != materialItem) {
			NotificationChain msgs = null;
			if (materialItem != null)
				msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__USAGES, MaterialItem.class, msgs);
			if (newMaterialItem != null)
				msgs = ((InternalEObject)newMaterialItem).eInverseAdd(this, InfWorkPackage.MATERIAL_ITEM__USAGES, MaterialItem.class, msgs);
			msgs = basicSetMaterialItem(newMaterialItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.USAGE__MATERIAL_ITEM, newMaterialItem, newMaterialItem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.USAGE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.USAGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				if (workEquipmentAsset != null)
					msgs = ((InternalEObject)workEquipmentAsset).eInverseRemove(this, InfAssetsPackage.WORK_EQUIPMENT_INFO__USAGES, WorkEquipmentInfo.class, msgs);
				return basicSetWorkEquipmentAsset((WorkEquipmentInfo)otherEnd, msgs);
			case InfWorkPackage.USAGE__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__USAGES, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				if (materialItem != null)
					msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__USAGES, MaterialItem.class, msgs);
				return basicSetMaterialItem((MaterialItem)otherEnd, msgs);
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
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				return basicSetWorkEquipmentAsset(null, msgs);
			case InfWorkPackage.USAGE__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				return basicSetMaterialItem(null, msgs);
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
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				if (resolve) return getWorkEquipmentAsset();
				return basicGetWorkEquipmentAsset();
			case InfWorkPackage.USAGE__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				if (resolve) return getMaterialItem();
				return basicGetMaterialItem();
			case InfWorkPackage.USAGE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
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
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				setWorkEquipmentAsset((WorkEquipmentInfo)newValue);
				return;
			case InfWorkPackage.USAGE__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)newValue);
				return;
			case InfWorkPackage.USAGE__STATUS:
				setStatus((Status)newValue);
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
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				setWorkEquipmentAsset((WorkEquipmentInfo)null);
				return;
			case InfWorkPackage.USAGE__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)null);
				return;
			case InfWorkPackage.USAGE__STATUS:
				setStatus((Status)null);
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
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				return workEquipmentAsset != null;
			case InfWorkPackage.USAGE__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				return materialItem != null;
			case InfWorkPackage.USAGE__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} //UsageImpl
