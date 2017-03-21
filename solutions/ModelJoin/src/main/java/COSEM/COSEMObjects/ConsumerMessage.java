/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.ConsumerMessage#getConsumer_message_via_local_consumer_information_port <em>Consumer message via local consumer information port</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ConsumerMessage#getConsumer_message_via_meter_display <em>Consumer message via meter display</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getConsumerMessage()
 * @model
 * @generated
 */
public interface ConsumerMessage extends Data {
	/**
	 * Returns the value of the '<em><b>Consumer message via local consumer information port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer message via local consumer information port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer message via local consumer information port</em>' attribute.
	 * @see #setConsumer_message_via_local_consumer_information_port(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getConsumerMessage_Consumer_message_via_local_consumer_information_port()
	 * @model
	 * @generated
	 */
	String getConsumer_message_via_local_consumer_information_port();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ConsumerMessage#getConsumer_message_via_local_consumer_information_port <em>Consumer message via local consumer information port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer message via local consumer information port</em>' attribute.
	 * @see #getConsumer_message_via_local_consumer_information_port()
	 * @generated
	 */
	void setConsumer_message_via_local_consumer_information_port(String value);

	/**
	 * Returns the value of the '<em><b>Consumer message via meter display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer message via meter display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer message via meter display</em>' attribute.
	 * @see #setConsumer_message_via_meter_display(String)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getConsumerMessage_Consumer_message_via_meter_display()
	 * @model
	 * @generated
	 */
	String getConsumer_message_via_meter_display();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ConsumerMessage#getConsumer_message_via_meter_display <em>Consumer message via meter display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer message via meter display</em>' attribute.
	 * @see #getConsumer_message_via_meter_display()
	 * @generated
	 */
	void setConsumer_message_via_meter_display(String value);

} // ConsumerMessage
