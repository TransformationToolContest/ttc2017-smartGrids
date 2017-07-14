/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61968.Customers.Customer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount <em>Expected Interruption Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getDuration <em>Duration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas <em>Customer Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageNotification()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A document containing information to be sent to customers notifying that an outage will take place. This is used to generate mailing lists for customers.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A document containing information to be sent to customers notifying that an outage will take place. This is used to generate mailing lists for customers.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A document containing information to be sent to customers notifying that an outage will take place. This is used to generate mailing lists for customers.' Profile\040documentation='A document containing information to be sent to customers notifying that an outage will take place. This is used to generate mailing lists for customers.'"
 * @generated
 */
public interface OutageNotification extends Document {
	/**
	 * Returns the value of the '<em><b>Expected Interruption Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Interruption Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Interruption Count</em>' attribute.
	 * @see #setExpectedInterruptionCount(int)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageNotification_ExpectedInterruptionCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of possible interruptions that the customer may expect for this event.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of possible interruptions that the customer may expect for this event.'"
	 * @generated
	 */
	int getExpectedInterruptionCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount <em>Expected Interruption Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Interruption Count</em>' attribute.
	 * @see #getExpectedInterruptionCount()
	 * @generated
	 */
	void setExpectedInterruptionCount(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageNotification_Duration()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Likely duration of the interruption(s).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Likely duration of the interruption(s).'"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Customer Datas</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Customers.Customer}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.Customer#getOutageNotifications <em>Outage Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Datas</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageNotification_CustomerDatas()
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getOutageNotifications
	 * @model opposite="OutageNotifications"
	 * @generated
	 */
	EList<Customer> getCustomerDatas();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageNotification_Reason()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Details of the outage \"reason\".'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Details of the outage \"reason\".'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

} // OutageNotification
