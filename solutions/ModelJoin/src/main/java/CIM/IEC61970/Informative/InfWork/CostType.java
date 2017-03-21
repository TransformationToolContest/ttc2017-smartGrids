/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getLevel <em>Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getParentCostType <em>Parent Cost Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getChildCostTypes <em>Child Cost Types</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#isAmountAssignmentFlag <em>Amount Assignment Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.CostType#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A categorization for resources, often costs, in accounting transactions. Examples include: material components, building in service, coal sales, overhead, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A categorization for resources, often costs, in accounting transactions. Examples include: material components, building in service, coal sales, overhead, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A categorization for resources, often costs, in accounting transactions. Examples include: material components, building in service, coal sales, overhead, etc.' Profile\040documentation='A categorization for resources, often costs, in accounting transactions. Examples include: material components, building in service, coal sales, overhead, etc.'"
 * @generated
 */
public interface CostType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_Level()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The level of the resource element in the hierarchy of resource elements (recursive relationship).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The level of the resource element in the hierarchy of resource elements (recursive relationship).'"
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CostType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes <em>Cost Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal Entries</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_ErpJournalEntries()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes
	 * @model opposite="CostTypes"
	 * @generated
	 */
	EList<ErpJournalEntry> getErpJournalEntries();

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_WorkCostDetails()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getCostType
	 * @model opposite="CostType"
	 * @generated
	 */
	EList<WorkCostDetail> getWorkCostDetails();

	/**
	 * Returns the value of the '<em><b>Parent Cost Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CostType#getChildCostTypes <em>Child Cost Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Cost Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Cost Type</em>' reference.
	 * @see #setParentCostType(CostType)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_ParentCostType()
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getChildCostTypes
	 * @model opposite="ChildCostTypes"
	 * @generated
	 */
	CostType getParentCostType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CostType#getParentCostType <em>Parent Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Cost Type</em>' reference.
	 * @see #getParentCostType()
	 * @generated
	 */
	void setParentCostType(CostType value);

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_CompatibleUnits()
	 * @see CIM.IEC61970.Informative.InfWork.CompatibleUnit#getCostType
	 * @model opposite="CostType"
	 * @generated
	 */
	EList<CompatibleUnit> getCompatibleUnits();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CostType#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Child Cost Types</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.CostType}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.CostType#getParentCostType <em>Parent Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Cost Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Cost Types</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_ChildCostTypes()
	 * @see CIM.IEC61970.Informative.InfWork.CostType#getParentCostType
	 * @model opposite="ParentCostType"
	 * @generated
	 */
	EList<CostType> getChildCostTypes();

	/**
	 * Returns the value of the '<em><b>Amount Assignment Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Assignment Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Assignment Flag</em>' attribute.
	 * @see #setAmountAssignmentFlag(boolean)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_AmountAssignmentFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if an amount can be assigned to the resource element (e.g., building in service, transmission plant, software development capital); false otherwise (e.g., internal labor, material components).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if an amount can be assigned to the resource element (e.g., building in service, transmission plant, software development capital); false otherwise (e.g., internal labor, material components).'"
	 * @generated
	 */
	boolean isAmountAssignmentFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CostType#isAmountAssignmentFlag <em>Amount Assignment Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Assignment Flag</em>' attribute.
	 * @see #isAmountAssignmentFlag()
	 * @generated
	 */
	void setAmountAssignmentFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A codified representation of the resource element.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A codified representation of the resource element.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CostType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see #setStage(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getCostType_Stage()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The stage for which this costType applies: estimated design, estimated actual or actual actual.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The stage for which this costType applies: estimated design, estimated actual or actual actual.'"
	 * @generated
	 */
	String getStage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.CostType#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(String value);

} // CostType
