/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;
import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Customers.Customer;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trouble Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime <em>First Call Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks <em>Call Backs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack <em>Call Back</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord <em>Incident Record</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind <em>Reporting Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getPriority <em>Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData <em>Customer Data</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored <em>Inform Before Restored</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice <em>Advice</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored <em>Inform After Restored</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode <em>Hazard Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getTroublePeriod <em>Trouble Period</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A document used to report electrical trouble. The trouble may either be an outage or non-outage problem, such as power quality. It must always be associated with an Incident Record.\nNote that a separate Activity Record is created for each call associated with an instance of Trouble Ticket. The time of a call is stored in ActivityRecord.createdOn and comments are recorded in ActivityRecord.remarks.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A document used to report electrical trouble. The trouble may either be an outage or non-outage problem, such as power quality. It must always be associated with an Incident Record.\nNote that a separate Activity Record is created for each call associated with an instance of Trouble Ticket. The time of a call is stored in ActivityRecord.createdOn and comments are recorded in ActivityRecord.remarks.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A document used to report electrical trouble. The trouble may either be an outage or non-outage problem, such as power quality. It must always be associated with an Incident Record.\nNote that a separate Activity Record is created for each call associated with an instance of Trouble Ticket. The time of a call is stored in ActivityRecord.createdOn and comments are recorded in ActivityRecord.remarks.' Profile\040documentation='A document used to report electrical trouble. The trouble may either be an outage or non-outage problem, such as power quality. It must always be associated with an Incident Record.\nNote that a separate Activity Record is created for each call associated with an instance of Trouble Ticket. The time of a call is stored in ActivityRecord.createdOn and comments are recorded in ActivityRecord.remarks.'"
 * @generated
 */
public interface TroubleTicket extends Document {
	/**
	 * Returns the value of the '<em><b>First Call Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Call Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Call Date Time</em>' attribute.
	 * @see #setFirstCallDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_FirstCallDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time trouble call first received. The date and time of subsequent calls by the same customer for the same trouble are recorded in associated Activity Records.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time trouble call first received. The date and time of subsequent calls by the same customer for the same trouble are recorded in associated Activity Records.'"
	 * @generated
	 */
	Date getFirstCallDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime <em>First Call Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Call Date Time</em>' attribute.
	 * @see #getFirstCallDateTime()
	 * @generated
	 */
	void setFirstCallDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Call Backs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Backs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Backs</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_CallBacks()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets
	 * @model opposite="TroubleTickets"
	 * @generated
	 */
	EList<CallBack> getCallBacks();

	/**
	 * Returns the value of the '<em><b>Call Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Back</em>' attribute.
	 * @see #setCallBack(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_CallBack()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if requested to customer when someone is about to arrive at their premises.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if requested to customer when someone is about to arrive at their premises.'"
	 * @generated
	 */
	boolean isCallBack();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack <em>Call Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Back</em>' attribute.
	 * @see #isCallBack()
	 * @generated
	 */
	void setCallBack(boolean value);

	/**
	 * Returns the value of the '<em><b>Incident Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incident Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incident Record</em>' reference.
	 * @see #setIncidentRecord(IncidentRecord)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_IncidentRecord()
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets
	 * @model opposite="TroubleTickets"
	 * @generated
	 */
	IncidentRecord getIncidentRecord();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord <em>Incident Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incident Record</em>' reference.
	 * @see #getIncidentRecord()
	 * @generated
	 */
	void setIncidentRecord(IncidentRecord value);

	/**
	 * Returns the value of the '<em><b>Estimated Restore Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Restore Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Restore Date Time</em>' attribute.
	 * @see #setEstimatedRestoreDateTime(Date)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_EstimatedRestoreDateTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Estimated restoration date and time last provided to the customer.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Estimated restoration date and time last provided to the customer.'"
	 * @generated
	 */
	Date getEstimatedRestoreDateTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Restore Date Time</em>' attribute.
	 * @see #getEstimatedRestoreDateTime()
	 * @generated
	 */
	void setEstimatedRestoreDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Reporting Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind
	 * @see #setReportingKind(TroubleReportingKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_ReportingKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Means the customer used to report trouble (default is \'call\').'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Means the customer used to report trouble (default is \'call\').'"
	 * @generated
	 */
	TroubleReportingKind getReportingKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind <em>Reporting Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleReportingKind
	 * @see #getReportingKind()
	 * @generated
	 */
	void setReportingKind(TroubleReportingKind value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_Priority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Priority of trouble call.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Priority of trouble call.'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Customer Data</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.Customer#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Data</em>' reference.
	 * @see #setCustomerData(Customer)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_CustomerData()
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getTroubleTickets
	 * @model opposite="TroubleTickets"
	 * @generated
	 */
	Customer getCustomerData();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData <em>Customer Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Data</em>' reference.
	 * @see #getCustomerData()
	 * @generated
	 */
	void setCustomerData(Customer value);

	/**
	 * Returns the value of the '<em><b>Inform Before Restored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inform Before Restored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inform Before Restored</em>' attribute.
	 * @see #setInformBeforeRestored(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_InformBeforeRestored()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if person reporting trouble requested a call back when sigificant information became available about cause of the outage and the estimated restoration time. The person and their contact information are maintained in the assoicated Customer information. Call back results are recorded in assoicated \'ActivityRecord.Status.remarks\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if person reporting trouble requested a call back when sigificant information became available about cause of the outage and the estimated restoration time. The person and their contact information are maintained in the assoicated Customer information. Call back results are recorded in assoicated \'ActivityRecord.Status.remarks\'.'"
	 * @generated
	 */
	boolean isInformBeforeRestored();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored <em>Inform Before Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inform Before Restored</em>' attribute.
	 * @see #isInformBeforeRestored()
	 * @generated
	 */
	void setInformBeforeRestored(boolean value);

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
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_Advice()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Advice already given to the customer at time when trouble was first reported.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Advice already given to the customer at time when trouble was first reported.'"
	 * @generated
	 */
	String getAdvice();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice <em>Advice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice</em>' attribute.
	 * @see #getAdvice()
	 * @generated
	 */
	void setAdvice(String value);

	/**
	 * Returns the value of the '<em><b>Inform After Restored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inform After Restored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inform After Restored</em>' attribute.
	 * @see #setInformAfterRestored(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_InformAfterRestored()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if person reporting trouble requested a call back to confirm power has been restored. The person and their contact information is maintained in the assoicated Customer informaiton. Call back results are recorded in assoicated \'ActivityRecord.Status.remarks\'.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if person reporting trouble requested a call back to confirm power has been restored. The person and their contact information is maintained in the assoicated Customer informaiton. Call back results are recorded in assoicated \'ActivityRecord.Status.remarks\'.'"
	 * @generated
	 */
	boolean isInformAfterRestored();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored <em>Inform After Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inform After Restored</em>' attribute.
	 * @see #isInformAfterRestored()
	 * @generated
	 */
	void setInformAfterRestored(boolean value);

	/**
	 * Returns the value of the '<em><b>Hazard Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Code</em>' attribute.
	 * @see #setHazardCode(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_HazardCode()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Code for a reported hazard condition.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Code for a reported hazard condition.'"
	 * @generated
	 */
	String getHazardCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode <em>Hazard Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Code</em>' attribute.
	 * @see #getHazardCode()
	 * @generated
	 */
	void setHazardCode(String value);

	/**
	 * Returns the value of the '<em><b>Trouble Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trouble Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trouble Period</em>' reference.
	 * @see #setTroublePeriod(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket_TroublePeriod()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Period between this source of trouble started and was resolved.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Period between this source of trouble started and was resolved.'"
	 * @generated
	 */
	DateTimeInterval getTroublePeriod();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.TroubleTicket#getTroublePeriod <em>Trouble Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trouble Period</em>' reference.
	 * @see #getTroublePeriod()
	 * @generated
	 */
	void setTroublePeriod(DateTimeInterval value);

} // TroubleTicket
