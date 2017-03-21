/**
 */
package CIM.IEC61968.Work;

import CIM.IEC61968.Common.Document;

import CIM.IEC61968.Customers.Customer;

import CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;

import CIM.IEC61970.Informative.InfWork.BusinessCase;
import CIM.IEC61970.Informative.InfWork.Design;
import CIM.IEC61970.Informative.InfWork.Project;
import CIM.IEC61970.Informative.InfWork.Request;
import CIM.IEC61970.Informative.InfWork.WorkCostDetail;
import CIM.IEC61970.Informative.InfWork.WorkFlowStep;
import CIM.IEC61970.Informative.InfWork.WorkTask;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Work.Work#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getDesigns <em>Designs</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getBusinessCase <em>Business Case</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getWorkFlowSteps <em>Work Flow Steps</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getPriority <em>Priority</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getProject <em>Project</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getRequest <em>Request</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getWorkBillingInfo <em>Work Billing Info</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getRequestDateTime <em>Request Date Time</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.Work.Work#getCustomers <em>Customers</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.Work.WorkPackage#getWork()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Document used to request, initiate, track and record work. This is synonymous with Work Breakdown Structure (WBS), which is traversed through the (currently informative) recursive association of Work.\nNote that the work name is equal to the WBS name, which is given in the inherited \"name\" attribute.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Document used to request, initiate, track and record work. This is synonymous with Work Breakdown Structure (WBS), which is traversed through the (currently informative) recursive association of Work.\nNote that the work name is equal to the WBS name, which is given in the inherited \"name\" attribute.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Document used to request, initiate, track and record work. This is synonymous with Work Breakdown Structure (WBS), which is traversed through the (currently informative) recursive association of Work.\nNote that the work name is equal to the WBS name, which is given in the inherited \"name\" attribute.' Profile\040documentation='Document used to request, initiate, track and record work. This is synonymous with Work Breakdown Structure (WBS), which is traversed through the (currently informative) recursive association of Work.\nNote that the work name is equal to the WBS name, which is given in the inherited \"name\" attribute.'"
 * @generated
 */
public interface Work extends Document {
	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkTask#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_WorkTasks()
	 * @see CIM.IEC61970.Informative.InfWork.WorkTask#getWork
	 * @model opposite="Work"
	 * @generated
	 */
	EList<WorkTask> getWorkTasks();

	/**
	 * Returns the value of the '<em><b>Designs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Design}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Design#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designs</em>' reference list.
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_Designs()
	 * @see CIM.IEC61970.Informative.InfWork.Design#getWork
	 * @model opposite="Work"
	 * @generated
	 */
	EList<Design> getDesigns();

	/**
	 * Returns the value of the '<em><b>Business Case</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.BusinessCase#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Case</em>' reference.
	 * @see #setBusinessCase(BusinessCase)
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_BusinessCase()
	 * @see CIM.IEC61970.Informative.InfWork.BusinessCase#getWorks
	 * @model opposite="Works"
	 * @generated
	 */
	BusinessCase getBusinessCase();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Work.Work#getBusinessCase <em>Business Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Case</em>' reference.
	 * @see #getBusinessCase()
	 * @generated
	 */
	void setBusinessCase(BusinessCase value);

	/**
	 * Returns the value of the '<em><b>Work Flow Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkFlowStep}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Flow Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Flow Steps</em>' reference list.
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_WorkFlowSteps()
	 * @see CIM.IEC61970.Informative.InfWork.WorkFlowStep#getWork
	 * @model opposite="Work"
	 * @generated
	 */
	EList<WorkFlowStep> getWorkFlowSteps();

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
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_Priority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Priority of work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Priority of work.'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Work.Work#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_WorkCostDetails()
	 * @see CIM.IEC61970.Informative.InfWork.WorkCostDetail#getWorks
	 * @model opposite="Works"
	 * @generated
	 */
	EList<WorkCostDetail> getWorkCostDetails();

	/**
	 * Returns the value of the '<em><b>Erp Project Accounting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Project Accounting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #setErpProjectAccounting(ErpProjectAccounting)
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_ErpProjectAccounting()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks
	 * @model opposite="Works"
	 * @generated
	 */
	ErpProjectAccounting getErpProjectAccounting();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Work.Work#getErpProjectAccounting <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	void setErpProjectAccounting(ErpProjectAccounting value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Project#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_Project()
	 * @see CIM.IEC61970.Informative.InfWork.Project#getWorks
	 * @model opposite="Works"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Work.Work#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Request#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Request)
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_Request()
	 * @see CIM.IEC61970.Informative.InfWork.Request#getWorks
	 * @model opposite="Works"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Work.Work#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

	/**
	 * Returns the value of the '<em><b>Work Billing Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Billing Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Billing Info</em>' reference.
	 * @see #setWorkBillingInfo(WorkBillingInfo)
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_WorkBillingInfo()
	 * @see CIM.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorks
	 * @model opposite="Works"
	 * @generated
	 */
	WorkBillingInfo getWorkBillingInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Work.Work#getWorkBillingInfo <em>Work Billing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Billing Info</em>' reference.
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	void setWorkBillingInfo(WorkBillingInfo value);

	/**
	 * Returns the value of the '<em><b>Request Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Date Time</em>' attribute.
	 * @see #setRequestDateTime(Date)
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_RequestDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time work was requested.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time work was requested.'"
	 * @generated
	 */
	Date getRequestDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Work.Work#getRequestDateTime <em>Request Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Date Time</em>' attribute.
	 * @see #getRequestDateTime()
	 * @generated
	 */
	void setRequestDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61968.Work.WorkKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.Work.WorkKind
	 * @see #setKind(WorkKind)
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of work.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of work.'"
	 * @generated
	 */
	WorkKind getKind();

	/**
	 * Sets the value of the '{@link CIM.IEC61968.Work.Work#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM.IEC61968.Work.WorkKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(WorkKind value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Customers.Customer}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Customers.Customer#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' reference list.
	 * @see CIM.IEC61968.Work.WorkPackage#getWork_Customers()
	 * @see CIM.IEC61968.Customers.Customer#getWorks
	 * @model opposite="Works"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All the customers for which this work is performed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All the customers for which this work is performed.'"
	 * @generated
	 */
	EList<Customer> getCustomers();

} // Work
