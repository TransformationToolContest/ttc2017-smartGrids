/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Work.Work;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getBudget <em>Budget</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getWorks <em>Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getRequests <em>Requests</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getBusinessCase <em>Business Case</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getSubProjects <em>Sub Projects</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getParentProject <em>Parent Project</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getProject()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A collection of related work. For construction projects and maintenance projects, multiple phases may be performed.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A collection of related work. For construction projects and maintenance projects, multiple phases may be performed.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A collection of related work. For construction projects and maintenance projects, multiple phases may be performed.' Profile\040documentation='A collection of related work. For construction projects and maintenance projects, multiple phases may be performed.'"
 * @generated
 */
public interface Project extends Document {
	/**
	 * Returns the value of the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' attribute.
	 * @see #setBudget(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getProject_Budget()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Overall project budget.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Overall project budget.'"
	 * @generated
	 */
	float getBudget();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getBudget <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' attribute.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(float value);

	/**
	 * Returns the value of the '<em><b>Erp Project Accounting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Project Accounting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #setErpProjectAccounting(ErpProjectAccounting)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getProject_ErpProjectAccounting()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects
	 * @model opposite="Projects"
	 * @generated
	 */
	ErpProjectAccounting getErpProjectAccounting();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getErpProjectAccounting <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	void setErpProjectAccounting(ErpProjectAccounting value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Work.Work#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getProject_Works()
	 * @see gluemodel.CIM.IEC61968.Work.Work#getProject
	 * @model opposite="Project"
	 * @generated
	 */
	EList<Work> getWorks();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Request}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getProject_Requests()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Request#getProjects
	 * @model opposite="Projects"
	 * @generated
	 */
	EList<Request> getRequests();

	/**
	 * Returns the value of the '<em><b>Business Case</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.BusinessCase#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Case</em>' reference.
	 * @see #setBusinessCase(BusinessCase)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getProject_BusinessCase()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.BusinessCase#getProjects
	 * @model opposite="Projects"
	 * @generated
	 */
	BusinessCase getBusinessCase();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getBusinessCase <em>Business Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Case</em>' reference.
	 * @see #getBusinessCase()
	 * @generated
	 */
	void setBusinessCase(BusinessCase value);

	/**
	 * Returns the value of the '<em><b>Sub Projects</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Project}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getParentProject <em>Parent Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Projects</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getProject_SubProjects()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Project#getParentProject
	 * @model opposite="ParentProject"
	 * @generated
	 */
	EList<Project> getSubProjects();

	/**
	 * Returns the value of the '<em><b>Parent Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getSubProjects <em>Sub Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Project</em>' reference.
	 * @see #setParentProject(Project)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getProject_ParentProject()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Project#getSubProjects
	 * @model opposite="SubProjects"
	 * @generated
	 */
	Project getParentProject();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getParentProject <em>Parent Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Project</em>' reference.
	 * @see #getParentProject()
	 * @generated
	 */
	void setParentProject(Project value);

} // Project
