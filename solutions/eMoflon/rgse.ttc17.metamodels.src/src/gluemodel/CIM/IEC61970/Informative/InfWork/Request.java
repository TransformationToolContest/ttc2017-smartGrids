/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Work.Work;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getPriority <em>Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getWorks <em>Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getProjects <em>Projects</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getActionNeeded <em>Action Needed</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRequest()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A request for work, service or project.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A request for work, service or project.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A request for work, service or project.' Profile\040documentation='A request for work, service or project.'"
 * @generated
 */
public interface Request extends Document {
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
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRequest_Priority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The priority of this request.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The priority of this request.'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' reference.
	 * @see #setOrganisation(ErpOrganisation)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRequest_Organisation()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRequests
	 * @model opposite="Requests"
	 * @generated
	 */
	ErpOrganisation getOrganisation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getOrganisation <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(ErpOrganisation value);

	/**
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #setCorporateCode(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRequest_CorporateCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The corporate code for this request.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The corporate code for this request.'"
	 * @generated
	 */
	String getCorporateCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #getCorporateCode()
	 * @generated
	 */
	void setCorporateCode(String value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Work.Work#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRequest_Works()
	 * @see gluemodel.CIM.IEC61968.Work.Work#getRequest
	 * @model opposite="Request"
	 * @generated
	 */
	EList<Work> getWorks();

	/**
	 * Returns the value of the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #setErpQuoteLineItem(ErpQuoteLineItem)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRequest_ErpQuoteLineItem()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest
	 * @model opposite="Request"
	 * @generated
	 */
	ErpQuoteLineItem getErpQuoteLineItem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	void setErpQuoteLineItem(ErpQuoteLineItem value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfWork.Project}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Project#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRequest_Projects()
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.Project#getRequests
	 * @model opposite="Requests"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Action Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Needed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Needed</em>' attribute.
	 * @see #setActionNeeded(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getRequest_ActionNeeded()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Based on the current \'Status.status\', the action that is needed before this Request can transition to the desired state, such as initiating the requested Work. For example, missing or additionally needed information may be required from the requesting organisation before a work Design may be created.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Based on the current \'Status.status\', the action that is needed before this Request can transition to the desired state, such as initiating the requested Work. For example, missing or additionally needed information may be required from the requesting organisation before a work Design may be created.'"
	 * @generated
	 */
	String getActionNeeded();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Request#getActionNeeded <em>Action Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Needed</em>' attribute.
	 * @see #getActionNeeded()
	 * @generated
	 */
	void setActionNeeded(String value);

} // Request
