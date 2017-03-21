/**
 */
package CIM.IEC61970.Informative.InfWork.impl;

import CIM.IEC61968.Assets.Asset;
import CIM.IEC61968.Assets.AssetsPackage;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.Work.Work;
import CIM.IEC61968.Work.WorkPackage;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.SwitchingSchedule;

import CIM.IEC61970.Informative.InfWork.Capability;
import CIM.IEC61970.Informative.InfWork.ContractorItem;
import CIM.IEC61970.Informative.InfWork.Crew;
import CIM.IEC61970.Informative.InfWork.Design;
import CIM.IEC61970.Informative.InfWork.DesignLocationCU;
import CIM.IEC61970.Informative.InfWork.EquipmentItem;
import CIM.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM.IEC61970.Informative.InfWork.LaborItem;
import CIM.IEC61970.Informative.InfWork.MaterialItem;
import CIM.IEC61970.Informative.InfWork.MiscCostItem;
import CIM.IEC61970.Informative.InfWork.OverheadCost;
import CIM.IEC61970.Informative.InfWork.QualificationRequirement;
import CIM.IEC61970.Informative.InfWork.Usage;
import CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import CIM.IEC61970.Informative.InfWork.WorkFlowStep;
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
 * An implementation of the model object '<em><b>Work Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getSwitchingSchedules <em>Switching Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getMiscCostItems <em>Misc Cost Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getWorkFlowStep <em>Work Flow Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getSchedOverride <em>Sched Override</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getWork <em>Work</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getContractorItems <em>Contractor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getEquipmentItems <em>Equipment Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.impl.WorkTaskImpl#getOverheadCost <em>Overhead Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkTaskImpl extends DocumentImpl implements WorkTask {
	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The cached value of the '{@link #getSwitchingSchedules() <em>Switching Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingSchedule> switchingSchedules;

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
	 * The cached value of the '{@link #getLaborItems() <em>Labor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborItems()
	 * @generated
	 * @ordered
	 */
	protected EList<LaborItem> laborItems;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkFlowStep() <em>Work Flow Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFlowStep()
	 * @generated
	 * @ordered
	 */
	protected WorkFlowStep workFlowStep;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * The default value of the '{@link #getSchedOverride() <em>Sched Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHED_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedOverride() <em>Sched Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedOverride()
	 * @generated
	 * @ordered
	 */
	protected String schedOverride = SCHED_OVERRIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Work work;

	/**
	 * The cached value of the '{@link #getDesignLocationCUs() <em>Design Location CUs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocationCUs()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocationCU> designLocationCUs;

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
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected Design design;

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
	 * The cached value of the '{@link #getMaterialItems() <em>Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialItem> materialItems;

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
	 * The cached value of the '{@link #getQualificationRequirements() <em>Qualification Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<QualificationRequirement> qualificationRequirements;

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
	 * The cached value of the '{@link #getOverheadCost() <em>Overhead Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverheadCost()
	 * @generated
	 * @ordered
	 */
	protected OverheadCost overheadCost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new EObjectWithInverseResolvingEList.ManyInverse<Crew>(Crew.class, this, InfWorkPackage.WORK_TASK__CREWS, InfWorkPackage.CREW__WORK_TASKS);
		}
		return crews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchingSchedule> getSwitchingSchedules() {
		if (switchingSchedules == null) {
			switchingSchedules = new EObjectWithInverseResolvingEList<SwitchingSchedule>(SwitchingSchedule.class, this, InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES, InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK);
		}
		return switchingSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiscCostItem> getMiscCostItems() {
		if (miscCostItems == null) {
			miscCostItems = new EObjectWithInverseResolvingEList<MiscCostItem>(MiscCostItem.class, this, InfWorkPackage.WORK_TASK__MISC_COST_ITEMS, InfWorkPackage.MISC_COST_ITEM__WORK_TASK);
		}
		return miscCostItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaborItem> getLaborItems() {
		if (laborItems == null) {
			laborItems = new EObjectWithInverseResolvingEList<LaborItem>(LaborItem.class, this, InfWorkPackage.WORK_TASK__LABOR_ITEMS, InfWorkPackage.LABOR_ITEM__WORK_TASK);
		}
		return laborItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowStep getWorkFlowStep() {
		if (workFlowStep != null && workFlowStep.eIsProxy()) {
			InternalEObject oldWorkFlowStep = (InternalEObject)workFlowStep;
			workFlowStep = (WorkFlowStep)eResolveProxy(oldWorkFlowStep);
			if (workFlowStep != oldWorkFlowStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_TASK__WORK_FLOW_STEP, oldWorkFlowStep, workFlowStep));
			}
		}
		return workFlowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowStep basicGetWorkFlowStep() {
		return workFlowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkFlowStep(WorkFlowStep newWorkFlowStep, NotificationChain msgs) {
		WorkFlowStep oldWorkFlowStep = workFlowStep;
		workFlowStep = newWorkFlowStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__WORK_FLOW_STEP, oldWorkFlowStep, newWorkFlowStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkFlowStep(WorkFlowStep newWorkFlowStep) {
		if (newWorkFlowStep != workFlowStep) {
			NotificationChain msgs = null;
			if (workFlowStep != null)
				msgs = ((InternalEObject)workFlowStep).eInverseRemove(this, InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS, WorkFlowStep.class, msgs);
			if (newWorkFlowStep != null)
				msgs = ((InternalEObject)newWorkFlowStep).eInverseAdd(this, InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS, WorkFlowStep.class, msgs);
			msgs = basicSetWorkFlowStep(newWorkFlowStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__WORK_FLOW_STEP, newWorkFlowStep, newWorkFlowStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectWithInverseResolvingEList<Asset>(Asset.class, this, InfWorkPackage.WORK_TASK__ASSETS, AssetsPackage.ASSET__WORK_TASK);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, InfWorkPackage.WORK_TASK__CAPABILITIES, InfWorkPackage.CAPABILITY__WORK_TASKS);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedOverride() {
		return schedOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedOverride(String newSchedOverride) {
		String oldSchedOverride = schedOverride;
		schedOverride = newSchedOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__SCHED_OVERRIDE, oldSchedOverride, schedOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work getWork() {
		if (work != null && work.eIsProxy()) {
			InternalEObject oldWork = (InternalEObject)work;
			work = (Work)eResolveProxy(oldWork);
			if (work != oldWork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_TASK__WORK, oldWork, work));
			}
		}
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work basicGetWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(Work newWork, NotificationChain msgs) {
		Work oldWork = work;
		work = newWork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__WORK, oldWork, newWork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (newWork != work) {
			NotificationChain msgs = null;
			if (work != null)
				msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__WORK_TASKS, Work.class, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, WorkPackage.WORK__WORK_TASKS, Work.class, msgs);
			msgs = basicSetWork(newWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__WORK, newWork, newWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new EObjectWithInverseResolvingEList.ManyInverse<DesignLocationCU>(DesignLocationCU.class, this, InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS, InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS);
		}
		return designLocationCUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractorItem> getContractorItems() {
		if (contractorItems == null) {
			contractorItems = new EObjectWithInverseResolvingEList<ContractorItem>(ContractorItem.class, this, InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS, InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK);
		}
		return contractorItems;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_TASK__DESIGN, oldDesign, design));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__DESIGN, oldDesign, newDesign);
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
				msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__WORK_TASKS, Design.class, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, InfWorkPackage.DESIGN__WORK_TASKS, Design.class, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EquipmentItem> getEquipmentItems() {
		if (equipmentItems == null) {
			equipmentItems = new EObjectWithInverseResolvingEList<EquipmentItem>(EquipmentItem.class, this, InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS, InfWorkPackage.EQUIPMENT_ITEM__WORK_TASK);
		}
		return equipmentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new EObjectWithInverseResolvingEList<MaterialItem>(MaterialItem.class, this, InfWorkPackage.WORK_TASK__MATERIAL_ITEMS, InfWorkPackage.MATERIAL_ITEM__WORK_TASK);
		}
		return materialItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new EObjectWithInverseResolvingEList<WorkCostDetail>(WorkCostDetail.class, this, InfWorkPackage.WORK_TASK__WORK_COST_DETAILS, InfWorkPackage.WORK_COST_DETAIL__WORK_TASK);
		}
		return workCostDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualificationRequirement> getQualificationRequirements() {
		if (qualificationRequirements == null) {
			qualificationRequirements = new EObjectWithInverseResolvingEList.ManyInverse<QualificationRequirement>(QualificationRequirement.class, this, InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS, InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS);
		}
		return qualificationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Usage> getUsages() {
		if (usages == null) {
			usages = new EObjectWithInverseResolvingEList<Usage>(Usage.class, this, InfWorkPackage.WORK_TASK__USAGES, InfWorkPackage.USAGE__WORK_TASK);
		}
		return usages;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfWorkPackage.WORK_TASK__OVERHEAD_COST, oldOverheadCost, overheadCost));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__OVERHEAD_COST, oldOverheadCost, newOverheadCost);
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
				msgs = ((InternalEObject)overheadCost).eInverseRemove(this, InfWorkPackage.OVERHEAD_COST__WORK_TASKS, OverheadCost.class, msgs);
			if (newOverheadCost != null)
				msgs = ((InternalEObject)newOverheadCost).eInverseAdd(this, InfWorkPackage.OVERHEAD_COST__WORK_TASKS, OverheadCost.class, msgs);
			msgs = basicSetOverheadCost(newOverheadCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfWorkPackage.WORK_TASK__OVERHEAD_COST, newOverheadCost, newOverheadCost));
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
			case InfWorkPackage.WORK_TASK__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingSchedules()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMiscCostItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLaborItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				if (workFlowStep != null)
					msgs = ((InternalEObject)workFlowStep).eInverseRemove(this, InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS, WorkFlowStep.class, msgs);
				return basicSetWorkFlowStep((WorkFlowStep)otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilities()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK:
				if (work != null)
					msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__WORK_TASKS, Work.class, msgs);
				return basicSetWork((Work)otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContractorItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__DESIGN:
				if (design != null)
					msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__WORK_TASKS, Design.class, msgs);
				return basicSetDesign((Design)otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquipmentItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationRequirements()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				if (overheadCost != null)
					msgs = ((InternalEObject)overheadCost).eInverseRemove(this, InfWorkPackage.OVERHEAD_COST__WORK_TASKS, OverheadCost.class, msgs);
				return basicSetOverheadCost((OverheadCost)otherEnd, msgs);
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
			case InfWorkPackage.WORK_TASK__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				return ((InternalEList<?>)getSwitchingSchedules()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				return ((InternalEList<?>)getMiscCostItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				return ((InternalEList<?>)getLaborItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				return basicSetWorkFlowStep(null, msgs);
			case InfWorkPackage.WORK_TASK__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK:
				return basicSetWork(null, msgs);
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				return ((InternalEList<?>)getContractorItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__DESIGN:
				return basicSetDesign(null, msgs);
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				return ((InternalEList<?>)getEquipmentItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<?>)getQualificationRequirements()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				return basicSetOverheadCost(null, msgs);
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
			case InfWorkPackage.WORK_TASK__CREWS:
				return getCrews();
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				return getSwitchingSchedules();
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				return getMiscCostItems();
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				return getLaborItems();
			case InfWorkPackage.WORK_TASK__PRIORITY:
				return getPriority();
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				if (resolve) return getWorkFlowStep();
				return basicGetWorkFlowStep();
			case InfWorkPackage.WORK_TASK__ASSETS:
				return getAssets();
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				return getCapabilities();
			case InfWorkPackage.WORK_TASK__SCHED_OVERRIDE:
				return getSchedOverride();
			case InfWorkPackage.WORK_TASK__WORK:
				if (resolve) return getWork();
				return basicGetWork();
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				return getContractorItems();
			case InfWorkPackage.WORK_TASK__DESIGN:
				if (resolve) return getDesign();
				return basicGetDesign();
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				return getEquipmentItems();
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				return getQualificationRequirements();
			case InfWorkPackage.WORK_TASK__USAGES:
				return getUsages();
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				if (resolve) return getOverheadCost();
				return basicGetOverheadCost();
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
			case InfWorkPackage.WORK_TASK__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				getSwitchingSchedules().clear();
				getSwitchingSchedules().addAll((Collection<? extends SwitchingSchedule>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				getMiscCostItems().addAll((Collection<? extends MiscCostItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				getLaborItems().clear();
				getLaborItems().addAll((Collection<? extends LaborItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__PRIORITY:
				setPriority((String)newValue);
				return;
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				setWorkFlowStep((WorkFlowStep)newValue);
				return;
			case InfWorkPackage.WORK_TASK__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__SCHED_OVERRIDE:
				setSchedOverride((String)newValue);
				return;
			case InfWorkPackage.WORK_TASK__WORK:
				setWork((Work)newValue);
				return;
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				getContractorItems().addAll((Collection<? extends ContractorItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__DESIGN:
				setDesign((Design)newValue);
				return;
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				getEquipmentItems().clear();
				getEquipmentItems().addAll((Collection<? extends EquipmentItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				getQualificationRequirements().addAll((Collection<? extends QualificationRequirement>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends Usage>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				setOverheadCost((OverheadCost)newValue);
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
			case InfWorkPackage.WORK_TASK__CREWS:
				getCrews().clear();
				return;
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				getSwitchingSchedules().clear();
				return;
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				getLaborItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				setWorkFlowStep((WorkFlowStep)null);
				return;
			case InfWorkPackage.WORK_TASK__ASSETS:
				getAssets().clear();
				return;
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				getCapabilities().clear();
				return;
			case InfWorkPackage.WORK_TASK__SCHED_OVERRIDE:
				setSchedOverride(SCHED_OVERRIDE_EDEFAULT);
				return;
			case InfWorkPackage.WORK_TASK__WORK:
				setWork((Work)null);
				return;
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				return;
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__DESIGN:
				setDesign((Design)null);
				return;
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				getEquipmentItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				return;
			case InfWorkPackage.WORK_TASK__USAGES:
				getUsages().clear();
				return;
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				setOverheadCost((OverheadCost)null);
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
			case InfWorkPackage.WORK_TASK__CREWS:
				return crews != null && !crews.isEmpty();
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				return switchingSchedules != null && !switchingSchedules.isEmpty();
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				return miscCostItems != null && !miscCostItems.isEmpty();
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				return laborItems != null && !laborItems.isEmpty();
			case InfWorkPackage.WORK_TASK__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				return workFlowStep != null;
			case InfWorkPackage.WORK_TASK__ASSETS:
				return assets != null && !assets.isEmpty();
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case InfWorkPackage.WORK_TASK__SCHED_OVERRIDE:
				return SCHED_OVERRIDE_EDEFAULT == null ? schedOverride != null : !SCHED_OVERRIDE_EDEFAULT.equals(schedOverride);
			case InfWorkPackage.WORK_TASK__WORK:
				return work != null;
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				return contractorItems != null && !contractorItems.isEmpty();
			case InfWorkPackage.WORK_TASK__DESIGN:
				return design != null;
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				return equipmentItems != null && !equipmentItems.isEmpty();
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				return qualificationRequirements != null && !qualificationRequirements.isEmpty();
			case InfWorkPackage.WORK_TASK__USAGES:
				return usages != null && !usages.isEmpty();
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				return overheadCost != null;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", schedOverride: ");
		result.append(schedOverride);
		result.append(')');
		return result.toString();
	}

} //WorkTaskImpl
