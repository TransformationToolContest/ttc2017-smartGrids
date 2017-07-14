/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork.impl;

import gluemodel.CIM.IEC61968.Common.Status;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfWork.DesignLocation;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Misc Cost Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getCostPerUnit <em>Cost Per Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getExternalRefID <em>External Ref ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.impl.MiscCostItemImpl#getCostType <em>Cost Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiscCostItemImpl extends IdentifiedObjectImpl implements MiscCostItem {
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
	 * The cached value of the '{@link #getDesignLocation() <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocation()
	 * @generated
	 * @ordered
	 */
	protected DesignLocation designLocation;

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
	 * The default value of the '{@link #getCostPerUnit() <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUnit()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_PER_UNIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostPerUnit() <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUnit()
	 * @generated
	 * @ordered
	 */
	protected float costPerUnit = COST_PER_UNIT_EDEFAULT;

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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected String account = ACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalRefID() <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRefID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalRefID() <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRefID()
	 * @generated
	 * @ordered
	 */
	protected String externalRefID = EXTERNAL_REF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected String costType = COST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiscCostItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.MISC_COST_ITEM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MISC_COST_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation getDesignLocation() {
		if (designLocation != null && designLocation.eIsProxy()) {
			InternalEObject oldDesignLocation = (InternalEObject)designLocation;
			designLocation = (DesignLocation)eResolveProxy(oldDesignLocation);
			if (designLocation != oldDesignLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION, oldDesignLocation, designLocation));
			}
		}
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation basicGetDesignLocation() {
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignLocation(DesignLocation newDesignLocation, NotificationChain msgs) {
		DesignLocation oldDesignLocation = designLocation;
		designLocation = newDesignLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION, oldDesignLocation, newDesignLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignLocation(DesignLocation newDesignLocation) {
		if (newDesignLocation != designLocation) {
			NotificationChain msgs = null;
			if (designLocation != null)
				msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS, DesignLocation.class, msgs);
			if (newDesignLocation != null)
				msgs = ((InternalEObject)newDesignLocation).eInverseAdd(this, InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS, DesignLocation.class, msgs);
			msgs = basicSetDesignLocation(newDesignLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION, newDesignLocation, newDesignLocation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MISC_COST_ITEM__WORK_TASK, oldWorkTask, workTask));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__WORK_TASK, oldWorkTask, newWorkTask);
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
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__MISC_COST_ITEMS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__MISC_COST_ITEMS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__WORK_TASK, newWorkTask, newWorkTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCostPerUnit() {
		return costPerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerUnit(float newCostPerUnit) {
		float oldCostPerUnit = costPerUnit;
		costPerUnit = newCostPerUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT, oldCostPerUnit, costPerUnit));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL, oldWorkCostDetail, workCostDetail));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL, oldWorkCostDetail, newWorkCostDetail);
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
				msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS, WorkCostDetail.class, msgs);
			if (newWorkCostDetail != null)
				msgs = ((InternalEObject)newWorkCostDetail).eInverseAdd(this, InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS, WorkCostDetail.class, msgs);
			msgs = basicSetWorkCostDetail(newWorkCostDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL, newWorkCostDetail, newWorkCostDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(BigInteger newQuantity) {
		BigInteger oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(String newAccount) {
		String oldAccount = account;
		account = newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__ACCOUNT, oldAccount, account));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalRefID() {
		return externalRefID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalRefID(String newExternalRefID) {
		String oldExternalRefID = externalRefID;
		externalRefID = newExternalRefID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID, oldExternalRefID, externalRefID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCostType() {
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostType(String newCostType) {
		String oldCostType = costType;
		costType = newCostType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MISC_COST_ITEM__COST_TYPE, oldCostType, costType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				if (designLocation != null)
					msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS, DesignLocation.class, msgs);
				return basicSetDesignLocation((DesignLocation)otherEnd, msgs);
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__MISC_COST_ITEMS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				if (workCostDetail != null)
					msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS, WorkCostDetail.class, msgs);
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
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				return basicSetDesignLocation(null, msgs);
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
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
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				if (resolve) return getDesignLocation();
				return basicGetDesignLocation();
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT:
				return getCostPerUnit();
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				if (resolve) return getWorkCostDetail();
				return basicGetWorkCostDetail();
			case InfWorkPackage.MISC_COST_ITEM__QUANTITY:
				return getQuantity();
			case InfWorkPackage.MISC_COST_ITEM__ACCOUNT:
				return getAccount();
			case InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID:
				return getExternalRefID();
			case InfWorkPackage.MISC_COST_ITEM__COST_TYPE:
				return getCostType();
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
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT:
				setCostPerUnit((Float)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__ACCOUNT:
				setAccount((String)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID:
				setExternalRefID((String)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__COST_TYPE:
				setCostType((String)newValue);
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
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)null);
				return;
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT:
				setCostPerUnit(COST_PER_UNIT_EDEFAULT);
				return;
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)null);
				return;
			case InfWorkPackage.MISC_COST_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InfWorkPackage.MISC_COST_ITEM__ACCOUNT:
				setAccount(ACCOUNT_EDEFAULT);
				return;
			case InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID:
				setExternalRefID(EXTERNAL_REF_ID_EDEFAULT);
				return;
			case InfWorkPackage.MISC_COST_ITEM__COST_TYPE:
				setCostType(COST_TYPE_EDEFAULT);
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
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				return designLocation != null;
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT:
				return costPerUnit != COST_PER_UNIT_EDEFAULT;
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				return workCostDetail != null;
			case InfWorkPackage.MISC_COST_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InfWorkPackage.MISC_COST_ITEM__ACCOUNT:
				return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
			case InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID:
				return EXTERNAL_REF_ID_EDEFAULT == null ? externalRefID != null : !EXTERNAL_REF_ID_EDEFAULT.equals(externalRefID);
			case InfWorkPackage.MISC_COST_ITEM__COST_TYPE:
				return COST_TYPE_EDEFAULT == null ? costType != null : !COST_TYPE_EDEFAULT.equals(costType);
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
		result.append(" (costPerUnit: ");
		result.append(costPerUnit);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", account: ");
		result.append(account);
		result.append(", externalRefID: ");
		result.append(externalRefID);
		result.append(", costType: ");
		result.append(costType);
		result.append(')');
		return result.toString();
	}

} //MiscCostItemImpl
