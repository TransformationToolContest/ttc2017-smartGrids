/**
 */
package CIM.IEC61970.Informative.InfOperations;

import CIM.IEC61968.Common.Status;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import CIM.IEC61970.Informative.InfWork.Appointment;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Back</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getAdvice <em>Advice</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getProblemInfo <em>Problem Info</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getContactDetail <em>Contact Detail</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.CallBack#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information about a planned CallBack or a CallBack that has occurred, from the utility to a customer regarding the status and plans about resolving trouble, performing work, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Information about a planned CallBack or a CallBack that has occurred, from the utility to a customer regarding the status and plans about resolving trouble, performing work, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information about a planned CallBack or a CallBack that has occurred, from the utility to a customer regarding the status and plans about resolving trouble, performing work, etc.' Profile\040documentation='Information about a planned CallBack or a CallBack that has occurred, from the utility to a customer regarding the status and plans about resolving trouble, performing work, etc.'"
 * @generated
 */
public interface CallBack extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Advice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' attribute.
	 * @see #setAdvice(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_Advice()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Advice already given to the customer during this call back.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Advice already given to the customer during this call back.'"
	 * @generated
	 */
	String getAdvice();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.CallBack#getAdvice <em>Advice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice</em>' attribute.
	 * @see #getAdvice()
	 * @generated
	 */
	void setAdvice(String value);

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
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.CallBack#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_ErpPersons()
	 * @see CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks
	 * @model opposite="CallBacks"
	 * @generated
	 */
	EList<ErpPerson> getErpPersons();

	/**
	 * Returns the value of the '<em><b>Problem Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Info</em>' attribute.
	 * @see #setProblemInfo(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_ProblemInfo()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Descriptiion of the problem reported during this call back.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Descriptiion of the problem reported during this call back.'"
	 * @generated
	 */
	String getProblemInfo();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.CallBack#getProblemInfo <em>Problem Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Info</em>' attribute.
	 * @see #getProblemInfo()
	 * @generated
	 */
	void setProblemInfo(String value);

	/**
	 * Returns the value of the '<em><b>Contact Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Detail</em>' attribute.
	 * @see #setContactDetail(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_ContactDetail()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Additional contact details that are not provided for ErpPerson with ErpTelephoneNumber.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Additional contact details that are not provided for ErpPerson with ErpTelephoneNumber.'"
	 * @generated
	 */
	String getContactDetail();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.CallBack#getContactDetail <em>Contact Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Detail</em>' attribute.
	 * @see #getContactDetail()
	 * @generated
	 */
	void setContactDetail(String value);

	/**
	 * Returns the value of the '<em><b>Appointments</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfWork.Appointment}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Appointment#getCallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointments</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_Appointments()
	 * @see CIM.IEC61970.Informative.InfWork.Appointment#getCallBack
	 * @model opposite="CallBack"
	 * @generated
	 */
	EList<Appointment> getAppointments();

	/**
	 * Returns the value of the '<em><b>Trouble Tickets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfOperations.TroubleTicket}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trouble Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trouble Tickets</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_TroubleTickets()
	 * @see CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks
	 * @model opposite="CallBacks"
	 * @generated
	 */
	EList<TroubleTicket> getTroubleTickets();

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_DateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if callback already occured) Date and time when this call back occurred.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if callback already occured) Date and time when this call back occurred.'"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.CallBack#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack_Comment()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Comments by customer during this call back.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Comments by customer during this call back.'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfOperations.CallBack#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // CallBack
