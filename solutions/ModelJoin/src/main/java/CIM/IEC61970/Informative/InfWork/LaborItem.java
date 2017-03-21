/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labor Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.LaborItem#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.LaborItem#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.LaborItem#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.LaborItem#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.LaborItem#getLaborDuration <em>Labor Duration</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.LaborItem#getLaborRate <em>Labor Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.LaborItem#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Labor used for work order.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Labor used for work order.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Labor used for work order.' Profile\040documentation='Labor used for work order.'"
 * @generated
 */
public interface LaborItem extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem_WorkTask()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getLaborItems
	 * @model opposite="LaborItems"
	 * @generated
	 */
	WorkTask getWorkTask();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	void setWorkTask(WorkTask value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem_ActivityCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Activity code identifies a specific and distinguishable unit of work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Activity code identifies a specific and distinguishable unit of work.'"
	 * @generated
	 */
	String getActivityCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Code</em>' attribute.
	 * @see #getActivityCode()
	 * @generated
	 */
	void setActivityCode(String value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem_Cost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total cost for labor. Note that this may not be able to be derived from labor rate and time charged.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total cost for labor. Note that this may not be able to be derived from labor rate and time charged.'"
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem_ErpPersons()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getLaborItems
	 * @model opposite="LaborItems"
	 * @generated
	 */
	EList<ErpPerson> getErpPersons();

	/**
	 * Returns the value of the '<em><b>Labor Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Duration</em>' attribute.
	 * @see #setLaborDuration(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem_LaborDuration()
	 * @model dataType="CIM.IEC61970.Domain.Hours" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time required to perform work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time required to perform work.'"
	 * @generated
	 */
	float getLaborDuration();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getLaborDuration <em>Labor Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labor Duration</em>' attribute.
	 * @see #getLaborDuration()
	 * @generated
	 */
	void setLaborDuration(float value);

	/**
	 * Returns the value of the '<em><b>Labor Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Rate</em>' attribute.
	 * @see #setLaborRate(float)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem_LaborRate()
	 * @model dataType="CIM.IEC61970.Domain.CostRate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The labor rate applied for work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The labor rate applied for work.'"
	 * @generated
	 */
	float getLaborRate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getLaborRate <em>Labor Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labor Rate</em>' attribute.
	 * @see #getLaborRate()
	 * @generated
	 */
	void setLaborRate(float value);

	/**
	 * Returns the value of the '<em><b>Work Cost Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Detail</em>' reference.
	 * @see #setWorkCostDetail(WorkCostDetail)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem_WorkCostDetail()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getLaborItems
	 * @model opposite="LaborItems"
	 * @generated
	 */
	WorkCostDetail getWorkCostDetail();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Detail</em>' reference.
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	void setWorkCostDetail(WorkCostDetail value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.LaborItem#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // LaborItem
