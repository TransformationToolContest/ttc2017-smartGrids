/**
 */
package gluemodel.CIM.IEC61970.Informative.InfWork;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.StreetAddress;

import gluemodel.CIM.IEC61970.Informative.InfCommon.ScheduledEvent;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;

import gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getRemark <em>Remark</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getAddress <em>Address</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getCallBack <em>Call Back</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getMeetingInterval <em>Meeting Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#isCallAhead <em>Call Ahead</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meeting time and location.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Meeting time and location.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meeting time and location.' Profile\040documentation='Meeting time and location.'"
 * @generated
 */
public interface Appointment extends ScheduledEvent {
	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #setRemark(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment_Remark()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Information about the appointment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Information about the appointment.'"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(StreetAddress)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment_Address()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Address for appointment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Address for appointment.'"
	 * @generated
	 */
	StreetAddress getAddress();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(StreetAddress value);

	/**
	 * Returns the value of the '<em><b>Call Back</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Back</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Back</em>' reference.
	 * @see #setCallBack(CallBack)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment_CallBack()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getAppointments
	 * @model opposite="Appointments"
	 * @generated
	 */
	CallBack getCallBack();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getCallBack <em>Call Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Back</em>' reference.
	 * @see #getCallBack()
	 * @generated
	 */
	void setCallBack(CallBack value);

	/**
	 * Returns the value of the '<em><b>Meeting Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meeting Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meeting Interval</em>' reference.
	 * @see #setMeetingInterval(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment_MeetingInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time reserved for appointment.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time reserved for appointment.'"
	 * @generated
	 */
	DateTimeInterval getMeetingInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#getMeetingInterval <em>Meeting Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting Interval</em>' reference.
	 * @see #getMeetingInterval()
	 * @generated
	 */
	void setMeetingInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment_ErpPersons()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments
	 * @model opposite="Appointments"
	 * @generated
	 */
	EList<ErpPerson> getErpPersons();

	/**
	 * Returns the value of the '<em><b>Call Ahead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Ahead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Ahead</em>' attribute.
	 * @see #setCallAhead(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment_CallAhead()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if requested to call customer when someone is about to arrive at their premises.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if requested to call customer when someone is about to arrive at their premises.'"
	 * @generated
	 */
	boolean isCallAhead();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfWork.Appointment#isCallAhead <em>Call Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Ahead</em>' attribute.
	 * @see #isCallAhead()
	 * @generated
	 */
	void setCallAhead(boolean value);

} // Appointment
