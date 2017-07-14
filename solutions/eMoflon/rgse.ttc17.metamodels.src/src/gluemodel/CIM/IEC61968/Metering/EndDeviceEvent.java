/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.IEC61968.Common.ActivityRecord;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getUserID <em>User ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getDeviceFunction <em>Device Function</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceEvent()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Event detected by a DeviceFunction associated with EndDeviceAsset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Event detected by a DeviceFunction associated with EndDeviceAsset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Event detected by a DeviceFunction associated with EndDeviceAsset.' Profile\040documentation='Event detected by a DeviceFunction associated with EndDeviceAsset.'"
 * @generated
 */
public interface EndDeviceEvent extends ActivityRecord {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceEvent_UserID()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(if user initiated) ID of user who initiated this end device event.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(if user initiated) ID of user who initiated this end device event.'"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Meter Reading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getEndDeviceEvents <em>End Device Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Reading</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Reading</em>' reference.
	 * @see #setMeterReading(MeterReading)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceEvent_MeterReading()
	 * @see gluemodel.CIM.IEC61968.Metering.MeterReading#getEndDeviceEvents
	 * @model opposite="EndDeviceEvents"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set of measured values to which this event applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set of measured values to which this event applies.'"
	 * @generated
	 */
	MeterReading getMeterReading();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Reading</em>' reference.
	 * @see #getMeterReading()
	 * @generated
	 */
	void setMeterReading(MeterReading value);

	/**
	 * Returns the value of the '<em><b>Device Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction#getEndDeviceEvents <em>End Device Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Function</em>' reference.
	 * @see #setDeviceFunction(DeviceFunction)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceEvent_DeviceFunction()
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction#getEndDeviceEvents
	 * @model opposite="EndDeviceEvents"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Device function that reported this end device event.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Device function that reported this end device event.'"
	 * @generated
	 */
	DeviceFunction getDeviceFunction();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getDeviceFunction <em>Device Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Function</em>' reference.
	 * @see #getDeviceFunction()
	 * @generated
	 */
	void setDeviceFunction(DeviceFunction value);

} // EndDeviceEvent
