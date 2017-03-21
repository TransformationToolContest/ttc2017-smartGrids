/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Assets.Asset;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.Work.Work;

import CIM.IEC61970.Informative.InfOperations.SwitchingSchedule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules <em>Switching Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems <em>Misc Cost Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getPriority <em>Priority</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep <em>Work Flow Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getSchedOverride <em>Sched Override</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWork <em>Work</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getContractorItems <em>Contractor Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getDesign <em>Design</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getEquipmentItems <em>Equipment Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getUsages <em>Usages</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkTask#getOverheadCost <em>Overhead Cost</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A set of tasks is required to implement a design.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A set of tasks is required to implement a design.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A set of tasks is required to implement a design.' Profile\040documentation='A set of tasks is required to implement a design.'"
 * @generated
 */
public interface WorkTask extends Document {
	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Crew#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_Crews()
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getWorkTasks
	 * @model opposite="WorkTasks"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All Crews participating in this WorkTask.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All Crews participating in this WorkTask.'"
	 * @generated
	 */
	EList<Crew> getCrews();

	/**
	 * Returns the value of the '<em><b>Switching Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.SwitchingSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Schedules</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_SwitchingSchedules()
	 * @see CIM.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<SwitchingSchedule> getSwitchingSchedules();

	/**
	 * Returns the value of the '<em><b>Misc Cost Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.MiscCostItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Cost Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Cost Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_MiscCostItems()
	 * @see CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<MiscCostItem> getMiscCostItems();

	/**
	 * Returns the value of the '<em><b>Labor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.LaborItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_LaborItems()
	 * @see CIM.IEC61970.Informative.InfWork.LaborItem#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<LaborItem> getLaborItems();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_Priority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The priority of this work task.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The priority of this work task.'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Work Flow Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Flow Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Flow Step</em>' reference.
	 * @see #setWorkFlowStep(WorkFlowStep)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_WorkFlowStep()
	 * @see CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks
	 * @model opposite="WorkTasks"
	 * @generated
	 */
	WorkFlowStep getWorkFlowStep();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep <em>Work Flow Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Flow Step</em>' reference.
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	void setWorkFlowStep(WorkFlowStep value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Assets.Asset#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_Assets()
	 * @see CIM.IEC61968.Assets.Asset#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Capability}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Capability#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_Capabilities()
	 * @see CIM.IEC61970.Informative.InfWork.Capability#getWorkTasks
	 * @model opposite="WorkTasks"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Sched Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Override</em>' attribute.
	 * @see #setSchedOverride(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_SchedOverride()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If specified, override schedule and perform this task in accordance with instructions specified here.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If specified, override schedule and perform this task in accordance with instructions specified here.'"
	 * @generated
	 */
	String getSchedOverride();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Override</em>' attribute.
	 * @see #getSchedOverride()
	 * @generated
	 */
	void setSchedOverride(String value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Work.Work#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(Work)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_Work()
	 * @see CIM.IEC61968.Work.Work#getWorkTasks
	 * @model opposite="WorkTasks"
	 * @generated
	 */
	Work getWork();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWork <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' reference.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Work value);

	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_DesignLocationCUs()
	 * @see CIM.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks
	 * @model opposite="WorkTasks"
	 * @generated
	 */
	EList<DesignLocationCU> getDesignLocationCUs();

	/**
	 * Returns the value of the '<em><b>Contractor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.ContractorItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractor Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_ContractorItems()
	 * @see CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<ContractorItem> getContractorItems();

	/**
	 * Returns the value of the '<em><b>Design</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Design#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' reference.
	 * @see #setDesign(Design)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_Design()
	 * @see CIM.IEC61970.Informative.InfWork.Design#getWorkTasks
	 * @model opposite="WorkTasks"
	 * @generated
	 */
	Design getDesign();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getDesign <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(Design value);

	/**
	 * Returns the value of the '<em><b>Equipment Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.EquipmentItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.EquipmentItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_EquipmentItems()
	 * @see CIM.IEC61970.Informative.InfWork.EquipmentItem#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<EquipmentItem> getEquipmentItems();

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_MaterialItems()
	 * @see CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<MaterialItem> getMaterialItems();

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_WorkCostDetails()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<WorkCostDetail> getWorkCostDetails();

	/**
	 * Returns the value of the '<em><b>Qualification Requirements</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.QualificationRequirement}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Requirements</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_QualificationRequirements()
	 * @see CIM.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks
	 * @model opposite="WorkTasks"
	 * @generated
	 */
	EList<QualificationRequirement> getQualificationRequirements();

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Usage}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Usage#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_Usages()
	 * @see CIM.IEC61970.Informative.InfWork.Usage#getWorkTask
	 * @model opposite="WorkTask"
	 * @generated
	 */
	EList<Usage> getUsages();

	/**
	 * Returns the value of the '<em><b>Overhead Cost</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead Cost</em>' reference.
	 * @see #setOverheadCost(OverheadCost)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask_OverheadCost()
	 * @see CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks
	 * @model opposite="WorkTasks"
	 * @generated
	 */
	OverheadCost getOverheadCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getOverheadCost <em>Overhead Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overhead Cost</em>' reference.
	 * @see #getOverheadCost()
	 * @generated
	 */
	void setOverheadCost(OverheadCost value);

} // WorkTask
