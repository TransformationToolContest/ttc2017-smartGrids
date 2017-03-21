/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overhead Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getCode <em>Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails <em>Work Cost Details</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOverheadCost()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Overhead cost applied to work order.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Overhead cost applied to work order.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Overhead cost applied to work order.' Profile\040documentation='Overhead cost applied to work order.'"
 * @generated
 */
public interface OverheadCost extends IdentifiedObject {
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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOverheadCost_Code()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Overhead code.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Overhead code.'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOverheadCost_Cost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The overhead cost to be applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The overhead cost to be applied.'"
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getOverheadCost <em>Overhead Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOverheadCost_WorkTasks()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getOverheadCost
	 * @model opposite="OverheadCost"
	 * @generated
	 */
	EList<WorkTask> getWorkTasks();

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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOverheadCost_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.OverheadCost#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost <em>Overhead Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getOverheadCost_WorkCostDetails()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost
	 * @model opposite="OverheadCost"
	 * @generated
	 */
	EList<WorkCostDetail> getWorkCostDetails();

} // OverheadCost
