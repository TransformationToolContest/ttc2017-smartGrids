/**
 */
package CIM.IEC61970.Informative.InfWork;

import CIM.IEC61968.Common.Status;

import CIM.IEC61968.Work.Work;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Flow Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkFlowStep()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A pre-defined set of work steps for a given type of work.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A pre-defined set of work steps for a given type of work.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A pre-defined set of work steps for a given type of work.' Profile\040documentation='A pre-defined set of work steps for a given type of work.'"
 * @generated
 */
public interface WorkFlowStep extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkFlowStep_SequenceNumber()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Used to define dependencies of each work flow step, which is for the instance of WorkTask associated with a given instance of WorkFlow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Used to define dependencies of each work flow step, which is for the instance of WorkTask associated with a given instance of WorkFlow.'"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep <em>Work Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkFlowStep_WorkTasks()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep
	 * @model opposite="WorkFlowStep"
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
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkFlowStep_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Work.Work#getWorkFlowSteps <em>Work Flow Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(Work)
	 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getWorkFlowStep_Work()
	 * @see CIM.IEC61968.Work.Work#getWorkFlowSteps
	 * @model opposite="WorkFlowSteps"
	 * @generated
	 */
	Work getWork();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWork <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' reference.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Work value);

} // WorkFlowStep
