/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.Work.Work;
import CIM.IEC61968.Work.WorkPackage;

import CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfWork.ContractorItem;
import CIM.IEC61970.Informative.InfWork.CostType;
import CIM.IEC61970.Informative.InfWork.Design;
import CIM.IEC61970.Informative.InfWork.EquipmentItem;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.LaborItem;
import CIM.IEC61970.Informative.InfWork.MaterialItem;
import CIM.IEC61970.Informative.InfWork.MiscCostItem;
import CIM.IEC61970.Informative.InfWork.OverheadCost;
import CIM.IEC61970.Informative.InfWork.PropertyUnit;
import CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import CIM.IEC61970.Informative.InfWork.WorkCostSummary;
import CIM.IEC61970.Informative.InfWork.WorkTask;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Work Cost Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getContractorItems <em>Contractor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getEquipmentItems <em>Equipment Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getPropertyUnits <em>Property Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getMiscCostItems <em>Misc Cost Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getWorkCostSummary <em>Work Cost Summary</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#isIsDebit <em>Is Debit</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getOverheadCost <em>Overhead Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkCostDetailImpl#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkCostDetailImpl extends DocumentImpl implements WorkCostDetail {
	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected CostType costType;

	/**
	 * The cached value of the '{@link #getContractorItems() <em>Contractor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractorItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractorItem> contractorItems;

	/**
	 * The cached value of the '{@link #getMaterialItems() <em>Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialItem> materialItems;

	/**
	 * The default value of the '{@link #getTransactionDateTime() <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDateTime() <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDateTime = TRANSACTION_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquipmentItems() <em>Equipment Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EquipmentItem> equipmentItems;

	/**
	 * The cached value of the '{@link #getPropertyUnits() <em>Property Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyUnit> propertyUnits;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected Design design;

	/**
	 * The cached value of the '{@link #getMiscCostItems() <em>Misc Cost Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscCostItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MiscCostItem> miscCostItems;

	/**
	 * The cached value of the '{@link #getWorkCostSummary() <em>Work Cost Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostSummary()
	 * @generated
	 * @ordered
	 */
	protected WorkCostSummary workCostSummary;

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
	 * The default value of the '{@link #isIsDebit() <em>Is Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDebit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEBIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDebit() <em>Is Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDebit()
	 * @generated
	 * @ordered
	 */
	protected boolean isDebit = IS_DEBIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverheadCost() <em>Overhead Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverheadCost()
	 * @generated
	 * @ordered
	 */
	protected OverheadCost overheadCost;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

	/**
	 * The cached value of the '{@link #getLaborItems() <em>Labor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborItems()
	 * @generated
	 * @ordered
	 */
	protected EList<LaborItem> laborItems;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkCostDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_COST_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType getCostType() {
		if (costType != null && costType.eIsProxy()) {
			InternalEObject oldCostType = (InternalEObject)costType;
			costType = (CostType)eResolveProxy(oldCostType);
			if (costType != oldCostType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_COST_DETAIL__COST_TYPE, oldCostType, costType));
			}
		}
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType basicGetCostType() {
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostType(CostType newCostType, NotificationChain msgs) {
		CostType oldCostType = costType;
		costType = newCostType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__COST_TYPE, oldCostType, newCostType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostType(CostType newCostType) {
		if (newCostType != costType) {
			NotificationChain msgs = null;
			if (costType != null)
				msgs = ((InternalEObject)costType).eInverseRemove(this, InfWorkPackage.COST_TYPE__WORK_COST_DETAILS, CostType.class, msgs);
			if (newCostType != null)
				msgs = ((InternalEObject)newCostType).eInverseAdd(this, InfWorkPackage.COST_TYPE__WORK_COST_DETAILS, CostType.class, msgs);
			msgs = basicSetCostType(newCostType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__COST_TYPE, newCostType, newCostType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractorItem> getContractorItems() {
		if (contractorItems == null) {
			contractorItems = new EObjectWithInverseResolvingEList<ContractorItem>(ContractorItem.class, this, InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS, InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL);
		}
		return contractorItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new EObjectWithInverseResolvingEList<MaterialItem>(MaterialItem.class, this, InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS, InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL);
		}
		return materialItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTransactionDateTime() {
		return transactionDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionDateTime(Date newTransactionDateTime) {
		Date oldTransactionDateTime = transactionDateTime;
		transactionDateTime = newTransactionDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME, oldTransactionDateTime, transactionDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquipmentItem> getEquipmentItems() {
		if (equipmentItems == null) {
			equipmentItems = new EObjectWithInverseResolvingEList<EquipmentItem>(EquipmentItem.class, this, InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS, InfWorkPackage.EQUIPMENT_ITEM__WORK_COST_DETAIL);
		}
		return equipmentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyUnit> getPropertyUnits() {
		if (propertyUnits == null) {
			propertyUnits = new EObjectWithInverseResolvingEList.ManyInverse<PropertyUnit>(PropertyUnit.class, this, InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS, InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS);
		}
		return propertyUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design getDesign() {
		if (design != null && design.eIsProxy()) {
			InternalEObject oldDesign = (InternalEObject)design;
			design = (Design)eResolveProxy(oldDesign);
			if (design != oldDesign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_COST_DETAIL__DESIGN, oldDesign, design));
			}
		}
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design basicGetDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(Design newDesign, NotificationChain msgs) {
		Design oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(Design newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__WORK_COST_DETAILS, Design.class, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, InfWorkPackage.DESIGN__WORK_COST_DETAILS, Design.class, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiscCostItem> getMiscCostItems() {
		if (miscCostItems == null) {
			miscCostItems = new EObjectWithInverseResolvingEList<MiscCostItem>(MiscCostItem.class, this, InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS, InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL);
		}
		return miscCostItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostSummary getWorkCostSummary() {
		if (workCostSummary != null && workCostSummary.eIsProxy()) {
			InternalEObject oldWorkCostSummary = (InternalEObject)workCostSummary;
			workCostSummary = (WorkCostSummary)eResolveProxy(oldWorkCostSummary);
			if (workCostSummary != oldWorkCostSummary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY, oldWorkCostSummary, workCostSummary));
			}
		}
		return workCostSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostSummary basicGetWorkCostSummary() {
		return workCostSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkCostSummary(WorkCostSummary newWorkCostSummary, NotificationChain msgs) {
		WorkCostSummary oldWorkCostSummary = workCostSummary;
		workCostSummary = newWorkCostSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY, oldWorkCostSummary, newWorkCostSummary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkCostSummary(WorkCostSummary newWorkCostSummary) {
		if (newWorkCostSummary != workCostSummary) {
			NotificationChain msgs = null;
			if (workCostSummary != null)
				msgs = ((InternalEObject)workCostSummary).eInverseRemove(this, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, WorkCostSummary.class, msgs);
			if (newWorkCostSummary != null)
				msgs = ((InternalEObject)newWorkCostSummary).eInverseAdd(this, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, WorkCostSummary.class, msgs);
			msgs = basicSetWorkCostSummary(newWorkCostSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY, newWorkCostSummary, newWorkCostSummary));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_COST_DETAIL__WORK_TASK, oldWorkTask, workTask));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__WORK_TASK, oldWorkTask, newWorkTask);
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
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__WORK_COST_DETAILS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__WORK_COST_DETAILS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__WORK_TASK, newWorkTask, newWorkTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDebit() {
		return isDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDebit(boolean newIsDebit) {
		boolean oldIsDebit = isDebit;
		isDebit = newIsDebit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT, oldIsDebit, isDebit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadCost getOverheadCost() {
		if (overheadCost != null && overheadCost.eIsProxy()) {
			InternalEObject oldOverheadCost = (InternalEObject)overheadCost;
			overheadCost = (OverheadCost)eResolveProxy(oldOverheadCost);
			if (overheadCost != oldOverheadCost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST, oldOverheadCost, overheadCost));
			}
		}
		return overheadCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadCost basicGetOverheadCost() {
		return overheadCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverheadCost(OverheadCost newOverheadCost, NotificationChain msgs) {
		OverheadCost oldOverheadCost = overheadCost;
		overheadCost = newOverheadCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST, oldOverheadCost, newOverheadCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverheadCost(OverheadCost newOverheadCost) {
		if (newOverheadCost != overheadCost) {
			NotificationChain msgs = null;
			if (overheadCost != null)
				msgs = ((InternalEObject)overheadCost).eInverseRemove(this, InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS, OverheadCost.class, msgs);
			if (newOverheadCost != null)
				msgs = ((InternalEObject)newOverheadCost).eInverseAdd(this, InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS, OverheadCost.class, msgs);
			msgs = basicSetOverheadCost(newOverheadCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST, newOverheadCost, newOverheadCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new EObjectWithInverseResolvingEList.ManyInverse<Work>(Work.class, this, InfWorkPackage.WORK_COST_DETAIL__WORKS, WorkPackage.WORK__WORK_COST_DETAILS);
		}
		return works;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaborItem> getLaborItems() {
		if (laborItems == null) {
			laborItems = new EObjectWithInverseResolvingEList<LaborItem>(LaborItem.class, this, InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS, InfWorkPackage.LABOR_ITEM__WORK_COST_DETAIL);
		}
		return laborItems;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING, oldErpProjectAccounting, erpProjectAccounting));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING, oldErpProjectAccounting, newErpProjectAccounting);
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
				msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS, ErpProjectAccounting.class, msgs);
			if (newErpProjectAccounting != null)
				msgs = ((InternalEObject)newErpProjectAccounting).eInverseAdd(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS, ErpProjectAccounting.class, msgs);
			msgs = basicSetErpProjectAccounting(newErpProjectAccounting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING, newErpProjectAccounting, newErpProjectAccounting));
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
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				if (costType != null)
					msgs = ((InternalEObject)costType).eInverseRemove(this, InfWorkPackage.COST_TYPE__WORK_COST_DETAILS, CostType.class, msgs);
				return basicSetCostType((CostType)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContractorItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquipmentItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				if (design != null)
					msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__WORK_COST_DETAILS, Design.class, msgs);
				return basicSetDesign((Design)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMiscCostItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				if (workCostSummary != null)
					msgs = ((InternalEObject)workCostSummary).eInverseRemove(this, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, WorkCostSummary.class, msgs);
				return basicSetWorkCostSummary((WorkCostSummary)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__WORK_COST_DETAILS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				if (overheadCost != null)
					msgs = ((InternalEObject)overheadCost).eInverseRemove(this, InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS, OverheadCost.class, msgs);
				return basicSetOverheadCost((OverheadCost)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLaborItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				if (erpProjectAccounting != null)
					msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS, ErpProjectAccounting.class, msgs);
				return basicSetErpProjectAccounting((ErpProjectAccounting)otherEnd, msgs);
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
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				return basicSetCostType(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				return ((InternalEList<?>)getContractorItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				return ((InternalEList<?>)getEquipmentItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				return ((InternalEList<?>)getPropertyUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				return basicSetDesign(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				return ((InternalEList<?>)getMiscCostItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				return basicSetWorkCostSummary(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				return basicSetOverheadCost(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				return ((InternalEList<?>)getLaborItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				return basicSetErpProjectAccounting(null, msgs);
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
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				if (resolve) return getCostType();
				return basicGetCostType();
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				return getContractorItems();
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME:
				return getTransactionDateTime();
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				return getEquipmentItems();
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				return getPropertyUnits();
			case InfWorkPackage.WORK_COST_DETAIL__AMOUNT:
				return getAmount();
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				if (resolve) return getDesign();
				return basicGetDesign();
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				return getMiscCostItems();
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				if (resolve) return getWorkCostSummary();
				return basicGetWorkCostSummary();
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT:
				return isIsDebit();
			case InfWorkPackage.WORK_COST_DETAIL__TYPE:
				return getType();
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				if (resolve) return getOverheadCost();
				return basicGetOverheadCost();
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				return getWorks();
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				return getLaborItems();
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				if (resolve) return getErpProjectAccounting();
				return basicGetErpProjectAccounting();
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
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				setCostType((CostType)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				getContractorItems().addAll((Collection<? extends ContractorItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME:
				setTransactionDateTime((Date)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				getEquipmentItems().clear();
				getEquipmentItems().addAll((Collection<? extends EquipmentItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				getPropertyUnits().clear();
				getPropertyUnits().addAll((Collection<? extends PropertyUnit>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__AMOUNT:
				setAmount((Float)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				setDesign((Design)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				getMiscCostItems().addAll((Collection<? extends MiscCostItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				setWorkCostSummary((WorkCostSummary)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT:
				setIsDebit((Boolean)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__TYPE:
				setType((String)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				setOverheadCost((OverheadCost)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				getLaborItems().clear();
				getLaborItems().addAll((Collection<? extends LaborItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)newValue);
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
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				setCostType((CostType)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME:
				setTransactionDateTime(TRANSACTION_DATE_TIME_EDEFAULT);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				getEquipmentItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				getPropertyUnits().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				setDesign((Design)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				setWorkCostSummary((WorkCostSummary)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT:
				setIsDebit(IS_DEBIT_EDEFAULT);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				setOverheadCost((OverheadCost)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				getWorks().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				getLaborItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)null);
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
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				return costType != null;
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				return contractorItems != null && !contractorItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME:
				return TRANSACTION_DATE_TIME_EDEFAULT == null ? transactionDateTime != null : !TRANSACTION_DATE_TIME_EDEFAULT.equals(transactionDateTime);
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				return equipmentItems != null && !equipmentItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				return propertyUnits != null && !propertyUnits.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				return design != null;
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				return miscCostItems != null && !miscCostItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				return workCostSummary != null;
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT:
				return isDebit != IS_DEBIT_EDEFAULT;
			case InfWorkPackage.WORK_COST_DETAIL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				return overheadCost != null;
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				return works != null && !works.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				return laborItems != null && !laborItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				return erpProjectAccounting != null;
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
		result.append(" (transactionDateTime: ");
		result.append(transactionDateTime);
		result.append(", amount: ");
		result.append(amount);
		result.append(", isDebit: ");
		result.append(isDebit);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //WorkCostDetailImpl
