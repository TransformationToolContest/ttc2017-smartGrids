/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfERPSupport.ErpPayable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contractor Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getErpPayables <em>Erp Payables</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getBidAmount <em>Bid Amount</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Contractor information for work task.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Contractor information for work task.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Contractor information for work task.' Profile\040documentation='Contractor information for work task.'"
 * @generated
 */
public interface ContractorItem extends IdentifiedObject {
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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem_Cost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The total amount charged.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The total amount charged.'"
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Code</em>' attribute.
	 * @see #setActivityCode(String)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem_ActivityCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Activity code identifies a specific and distinguishable unit of work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Activity code identifies a specific and distinguishable unit of work.'"
	 * @generated
	 */
	String getActivityCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Code</em>' attribute.
	 * @see #getActivityCode()
	 * @generated
	 */
	void setActivityCode(String value);

	/**
	 * Returns the value of the '<em><b>Erp Payables</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPayable}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payables</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem_ErpPayables()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems
	 * @model opposite="ContractorItems"
	 * @generated
	 */
	EList<ErpPayable> getErpPayables();

	/**
	 * Returns the value of the '<em><b>Work Cost Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Detail</em>' reference.
	 * @see #setWorkCostDetail(WorkCostDetail)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem_WorkCostDetail()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems
	 * @model opposite="ContractorItems"
	 * @generated
	 */
	WorkCostDetail getWorkCostDetail();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Detail</em>' reference.
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	void setWorkCostDetail(WorkCostDetail value);

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem_WorkTask()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getContractorItems
	 * @model opposite="ContractorItems"
	 * @generated
	 */
	WorkTask getWorkTask();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	void setWorkTask(WorkTask value);

	/**
	 * Returns the value of the '<em><b>Bid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid Amount</em>' attribute.
	 * @see #setBidAmount(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem_BidAmount()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount that a given contractor will charge for performing this unit of work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount that a given contractor will charge for performing this unit of work.'"
	 * @generated
	 */
	float getBidAmount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.ContractorItem#getBidAmount <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid Amount</em>' attribute.
	 * @see #getBidAmount()
	 * @generated
	 */
	void setBidAmount(float value);

} // ContractorItem
