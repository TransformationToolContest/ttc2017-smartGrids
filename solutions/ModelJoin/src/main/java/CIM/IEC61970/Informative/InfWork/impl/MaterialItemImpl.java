/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpInventoryCount;
import CIM.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import CIM.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.DesignLocation;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.MaterialItem;
import CIM.IEC61970.Informative.InfWork.TypeMaterial;
import CIM.IEC61970.Informative.InfWork.Usage;
import CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import CIM.IEC61970.Informative.InfWork.WorkTask;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Material Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getErpInventoryCounts <em>Erp Inventory Counts</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getExternalRefID <em>External Ref ID</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.MaterialItemImpl#getMaterialCode <em>Material Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialItemImpl extends IdentifiedObjectImpl implements MaterialItem {
	/**
	 * The cached value of the '{@link #getErpPOLineItems() <em>Erp PO Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPOLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPOLineItem> erpPOLineItems;

	/**
	 * The cached value of the '{@link #getTypeMaterial() <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMaterial()
	 * @generated
	 * @ordered
	 */
	protected TypeMaterial typeMaterial;

	/**
	 * The cached value of the '{@link #getErpInventoryCounts() <em>Erp Inventory Counts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInventoryCounts()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInventoryCount> erpInventoryCounts;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<Usage> usages;

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
	 * The default value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected String costDescription = COST_DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getErpRecDelvLineItems() <em>Erp Rec Delv Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecDelvLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecDelvLineItem> erpRecDelvLineItems;

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
	 * The default value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUAL_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected float actualCost = ACTUAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaterialCode() <em>Material Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialCode()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaterialCode() <em>Material Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialCode()
	 * @generated
	 * @ordered
	 */
	protected String materialCode = MATERIAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.MATERIAL_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPOLineItem> getErpPOLineItems() {
		if (erpPOLineItems == null) {
			erpPOLineItems = new EObjectWithInverseResolvingEList<ErpPOLineItem>(ErpPOLineItem.class, this, InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS, InfERPSupportPackage.ERP_PO_LINE_ITEM__MATERIAL_ITEM);
		}
		return erpPOLineItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial getTypeMaterial() {
		if (typeMaterial != null && typeMaterial.eIsProxy()) {
			InternalEObject oldTypeMaterial = (InternalEObject)typeMaterial;
			typeMaterial = (TypeMaterial)eResolveProxy(oldTypeMaterial);
			if (typeMaterial != oldTypeMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL, oldTypeMaterial, typeMaterial));
			}
		}
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial basicGetTypeMaterial() {
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMaterial(TypeMaterial newTypeMaterial, NotificationChain msgs) {
		TypeMaterial oldTypeMaterial = typeMaterial;
		typeMaterial = newTypeMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL, oldTypeMaterial, newTypeMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMaterial(TypeMaterial newTypeMaterial) {
		if (newTypeMaterial != typeMaterial) {
			NotificationChain msgs = null;
			if (typeMaterial != null)
				msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS, TypeMaterial.class, msgs);
			if (newTypeMaterial != null)
				msgs = ((InternalEObject)newTypeMaterial).eInverseAdd(this, InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS, TypeMaterial.class, msgs);
			msgs = basicSetTypeMaterial(newTypeMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL, newTypeMaterial, newTypeMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpInventoryCount> getErpInventoryCounts() {
		if (erpInventoryCounts == null) {
			erpInventoryCounts = new EObjectWithInverseResolvingEList<ErpInventoryCount>(ErpInventoryCount.class, this, InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS, InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM);
		}
		return erpInventoryCounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Usage> getUsages() {
		if (usages == null) {
			usages = new EObjectWithInverseResolvingEList<Usage>(Usage.class, this, InfWorkPackage.MATERIAL_ITEM__USAGES, InfWorkPackage.USAGE__MATERIAL_ITEM);
		}
		return usages;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL, oldWorkCostDetail, workCostDetail));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL, oldWorkCostDetail, newWorkCostDetail);
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
				msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS, WorkCostDetail.class, msgs);
			if (newWorkCostDetail != null)
				msgs = ((InternalEObject)newWorkCostDetail).eInverseAdd(this, InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS, WorkCostDetail.class, msgs);
			msgs = basicSetWorkCostDetail(newWorkCostDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL, newWorkCostDetail, newWorkCostDetail));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MATERIAL_ITEM__WORK_TASK, oldWorkTask, workTask));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__WORK_TASK, oldWorkTask, newWorkTask);
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
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__WORK_TASK, newWorkTask, newWorkTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__ACCOUNT, oldAccount, account));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCostDescription() {
		return costDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostDescription(String newCostDescription) {
		String oldCostDescription = costDescription;
		costDescription = newCostDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION, oldCostDescription, costDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__COST_TYPE, oldCostType, costType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID, oldExternalRefID, externalRefID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MATERIAL_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpRecDelvLineItem> getErpRecDelvLineItems() {
		if (erpRecDelvLineItems == null) {
			erpRecDelvLineItems = new EObjectWithInverseResolvingEList.ManyInverse<ErpRecDelvLineItem>(ErpRecDelvLineItem.class, this, InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS);
		}
		return erpRecDelvLineItems;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION, oldDesignLocation, designLocation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION, oldDesignLocation, newDesignLocation);
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
				msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS, DesignLocation.class, msgs);
			if (newDesignLocation != null)
				msgs = ((InternalEObject)newDesignLocation).eInverseAdd(this, InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS, DesignLocation.class, msgs);
			msgs = basicSetDesignLocation(newDesignLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION, newDesignLocation, newDesignLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getActualCost() {
		return actualCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualCost(float newActualCost) {
		float oldActualCost = actualCost;
		actualCost = newActualCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST, oldActualCost, actualCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaterialCode() {
		return materialCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialCode(String newMaterialCode) {
		String oldMaterialCode = materialCode;
		materialCode = newMaterialCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE, oldMaterialCode, materialCode));
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPOLineItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				if (typeMaterial != null)
					msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS, TypeMaterial.class, msgs);
				return basicSetTypeMaterial((TypeMaterial)otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInventoryCounts()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				if (workCostDetail != null)
					msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS, WorkCostDetail.class, msgs);
				return basicSetWorkCostDetail((WorkCostDetail)otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecDelvLineItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				if (designLocation != null)
					msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS, DesignLocation.class, msgs);
				return basicSetDesignLocation((DesignLocation)otherEnd, msgs);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				return ((InternalEList<?>)getErpPOLineItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				return basicSetTypeMaterial(null, msgs);
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				return ((InternalEList<?>)getErpInventoryCounts()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				return basicSetWorkCostDetail(null, msgs);
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				return ((InternalEList<?>)getErpRecDelvLineItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				return basicSetDesignLocation(null, msgs);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				return getErpPOLineItems();
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				if (resolve) return getTypeMaterial();
				return basicGetTypeMaterial();
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				return getErpInventoryCounts();
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				return getUsages();
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				if (resolve) return getWorkCostDetail();
				return basicGetWorkCostDetail();
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.MATERIAL_ITEM__ACCOUNT:
				return getAccount();
			case InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION:
				return getCostDescription();
			case InfWorkPackage.MATERIAL_ITEM__QUANTITY:
				return getQuantity();
			case InfWorkPackage.MATERIAL_ITEM__COST_TYPE:
				return getCostType();
			case InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID:
				return getExternalRefID();
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				return getErpRecDelvLineItems();
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				if (resolve) return getDesignLocation();
				return basicGetDesignLocation();
			case InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST:
				return getActualCost();
			case InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE:
				return getMaterialCode();
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				getErpPOLineItems().addAll((Collection<? extends ErpPOLineItem>)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				getErpInventoryCounts().clear();
				getErpInventoryCounts().addAll((Collection<? extends ErpInventoryCount>)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends Usage>)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ACCOUNT:
				setAccount((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION:
				setCostDescription((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__COST_TYPE:
				setCostType((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID:
				setExternalRefID((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				getErpRecDelvLineItems().clear();
				getErpRecDelvLineItems().addAll((Collection<? extends ErpRecDelvLineItem>)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST:
				setActualCost((Float)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE:
				setMaterialCode((String)newValue);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				return;
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				getErpInventoryCounts().clear();
				return;
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				getUsages().clear();
				return;
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ACCOUNT:
				setAccount(ACCOUNT_EDEFAULT);
				return;
			case InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION:
				setCostDescription(COST_DESCRIPTION_EDEFAULT);
				return;
			case InfWorkPackage.MATERIAL_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InfWorkPackage.MATERIAL_ITEM__COST_TYPE:
				setCostType(COST_TYPE_EDEFAULT);
				return;
			case InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID:
				setExternalRefID(EXTERNAL_REF_ID_EDEFAULT);
				return;
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				getErpRecDelvLineItems().clear();
				return;
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST:
				setActualCost(ACTUAL_COST_EDEFAULT);
				return;
			case InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE:
				setMaterialCode(MATERIAL_CODE_EDEFAULT);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				return erpPOLineItems != null && !erpPOLineItems.isEmpty();
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				return typeMaterial != null;
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				return erpInventoryCounts != null && !erpInventoryCounts.isEmpty();
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				return usages != null && !usages.isEmpty();
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				return workCostDetail != null;
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.MATERIAL_ITEM__ACCOUNT:
				return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
			case InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION:
				return COST_DESCRIPTION_EDEFAULT == null ? costDescription != null : !COST_DESCRIPTION_EDEFAULT.equals(costDescription);
			case InfWorkPackage.MATERIAL_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InfWorkPackage.MATERIAL_ITEM__COST_TYPE:
				return COST_TYPE_EDEFAULT == null ? costType != null : !COST_TYPE_EDEFAULT.equals(costType);
			case InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID:
				return EXTERNAL_REF_ID_EDEFAULT == null ? externalRefID != null : !EXTERNAL_REF_ID_EDEFAULT.equals(externalRefID);
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				return erpRecDelvLineItems != null && !erpRecDelvLineItems.isEmpty();
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				return designLocation != null;
			case InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST:
				return actualCost != ACTUAL_COST_EDEFAULT;
			case InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE:
				return MATERIAL_CODE_EDEFAULT == null ? materialCode != null : !MATERIAL_CODE_EDEFAULT.equals(materialCode);
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
		result.append(" (account: ");
		result.append(account);
		result.append(", costDescription: ");
		result.append(costDescription);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", costType: ");
		result.append(costType);
		result.append(", externalRefID: ");
		result.append(externalRefID);
		result.append(", actualCost: ");
		result.append(actualCost);
		result.append(", materialCode: ");
		result.append(materialCode);
		result.append(')');
		return result.toString();
	}

} //MaterialItemImpl
