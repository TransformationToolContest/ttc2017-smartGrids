/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Work.Work;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Cost Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems <em>Contractor Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getEquipmentItems <em>Equipment Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits <em>Property Units</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getDesign <em>Design</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems <em>Misc Cost Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary <em>Work Cost Summary</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit <em>Is Debit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost <em>Overhead Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorks <em>Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A collection of all of the individual cost items collected from multiple sources.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A collection of all of the individual cost items collected from multiple sources.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of all of the individual cost items collected from multiple sources.' Profile\040documentation='A collection of all of the individual cost items collected from multiple sources.'"
 * @generated
 */
public interface WorkCostDetail extends Document {
	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.CostType#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' reference.
	 * @see #setCostType(CostType)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_CostType()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.CostType#getWorkCostDetails
	 * @model opposite="WorkCostDetails"
	 * @generated
	 */
	CostType getCostType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getCostType <em>Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' reference.
	 * @see #getCostType()
	 * @generated
	 */
	void setCostType(CostType value);

	/**
	 * Returns the value of the '<em><b>Contractor Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.ContractorItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractor Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_ContractorItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail
	 * @model opposite="WorkCostDetail"
	 * @generated
	 */
	EList<ContractorItem> getContractorItems();

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_MaterialItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail
	 * @model opposite="WorkCostDetail"
	 * @generated
	 */
	EList<MaterialItem> getMaterialItems();

	/**
	 * Returns the value of the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #setTransactionDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_TransactionDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time that \'amount\' is posted to the work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time that \'amount\' is posted to the work.'"
	 * @generated
	 */
	Date getTransactionDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #getTransactionDateTime()
	 * @generated
	 */
	void setTransactionDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Equipment Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.EquipmentItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.EquipmentItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_EquipmentItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.EquipmentItem#getWorkCostDetail
	 * @model opposite="WorkCostDetail"
	 * @generated
	 */
	EList<EquipmentItem> getEquipmentItems();

	/**
	 * Returns the value of the '<em><b>Property Units</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Units</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_PropertyUnits()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails
	 * @model opposite="WorkCostDetails"
	 * @generated
	 */
	EList<PropertyUnit> getPropertyUnits();

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_Amount()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Amount in designated currency for work, either a total or an individual element. As defined in the attribute \"type,\" multiple instances are applicable to each work for: planned cost, actual cost, authorized cost, budgeted cost, forecasted cost, other.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Amount in designated currency for work, either a total or an individual element. As defined in the attribute \"type,\" multiple instances are applicable to each work for: planned cost, actual cost, authorized cost, budgeted cost, forecasted cost, other.'"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Design</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Design#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' reference.
	 * @see #setDesign(Design)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_Design()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Design#getWorkCostDetails
	 * @model opposite="WorkCostDetails"
	 * @generated
	 */
	Design getDesign();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getDesign <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(Design value);

	/**
	 * Returns the value of the '<em><b>Misc Cost Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Cost Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Cost Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_MiscCostItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail
	 * @model opposite="WorkCostDetail"
	 * @generated
	 */
	EList<MiscCostItem> getMiscCostItems();

	/**
	 * Returns the value of the '<em><b>Work Cost Summary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Summary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Summary</em>' reference.
	 * @see #setWorkCostSummary(WorkCostSummary)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_WorkCostSummary()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail
	 * @model opposite="WorkCostDetail"
	 * @generated
	 */
	WorkCostSummary getWorkCostSummary();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary <em>Work Cost Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Summary</em>' reference.
	 * @see #getWorkCostSummary()
	 * @generated
	 */
	void setWorkCostSummary(WorkCostSummary value);

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_WorkTask()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails
	 * @model opposite="WorkCostDetails"
	 * @generated
	 */
	WorkTask getWorkTask();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	void setWorkTask(WorkTask value);

	/**
	 * Returns the value of the '<em><b>Is Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Debit</em>' attribute.
	 * @see #setIsDebit(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_IsDebit()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if \'amount\' is a debit, false if it is a credit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if \'amount\' is a debit, false if it is a credit.'"
	 * @generated
	 */
	boolean isIsDebit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit <em>Is Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Debit</em>' attribute.
	 * @see #isIsDebit()
	 * @generated
	 */
	void setIsDebit(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_Type()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of work cost.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of work cost.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Overhead Cost</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead Cost</em>' reference.
	 * @see #setOverheadCost(OverheadCost)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_OverheadCost()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails
	 * @model opposite="WorkCostDetails"
	 * @generated
	 */
	OverheadCost getOverheadCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost <em>Overhead Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overhead Cost</em>' reference.
	 * @see #getOverheadCost()
	 * @generated
	 */
	void setOverheadCost(OverheadCost value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Work.Work#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_Works()
	 * @see gluemodel.CIM.IEC61968.Work.Work#getWorkCostDetails
	 * @model opposite="WorkCostDetails"
	 * @generated
	 */
	EList<Work> getWorks();

	/**
	 * Returns the value of the '<em><b>Labor Items</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.LaborItem}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Items</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_LaborItems()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail
	 * @model opposite="WorkCostDetail"
	 * @generated
	 */
	EList<LaborItem> getLaborItems();

	/**
	 * Returns the value of the '<em><b>Erp Project Accounting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Project Accounting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #setErpProjectAccounting(ErpProjectAccounting)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail_ErpProjectAccounting()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails
	 * @model opposite="WorkCostDetails"
	 * @generated
	 */
	ErpProjectAccounting getErpProjectAccounting();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	void setErpProjectAccounting(ErpProjectAccounting value);

} // WorkCostDetail
