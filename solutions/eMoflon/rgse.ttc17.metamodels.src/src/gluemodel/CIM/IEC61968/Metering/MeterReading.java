/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getMeterAsset <em>Meter Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getValuesInterval <em>Values Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getReadings <em>Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterReading()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set of values obtained from the meter.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Set of values obtained from the meter.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set of values obtained from the meter.' Profile\040documentation='Set of values obtained from the meter.'"
 * @generated
 */
public interface MeterReading extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>End Device Events</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Events</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterReading_EndDeviceEvents()
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceEvent#getMeterReading
	 * @model opposite="MeterReading"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device events associated with this set of measured values.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device events associated with this set of measured values.'"
	 * @generated
	 */
	EList<EndDeviceEvent> getEndDeviceEvents();

	/**
	 * Returns the value of the '<em><b>Service Delivery Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Point</em>' reference.
	 * @see #setServiceDeliveryPoint(ServiceDeliveryPoint)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterReading_ServiceDeliveryPoint()
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings
	 * @model opposite="MeterReadings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Service delivery point from which this meter reading (set of values) has been obtained.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Service delivery point from which this meter reading (set of values) has been obtained.'"
	 * @generated
	 */
	ServiceDeliveryPoint getServiceDeliveryPoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getServiceDeliveryPoint <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delivery Point</em>' reference.
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	void setServiceDeliveryPoint(ServiceDeliveryPoint value);

	/**
	 * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreement</em>' reference.
	 * @see #setCustomerAgreement(CustomerAgreement)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterReading_CustomerAgreement()
	 * @see gluemodel.CIM.IEC61968.Customers.CustomerAgreement#getMeterReadings
	 * @model opposite="MeterReadings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='(could be deprecated in the future) Customer agreement for this meter reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='(could be deprecated in the future) Customer agreement for this meter reading.'"
	 * @generated
	 */
	CustomerAgreement getCustomerAgreement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Agreement</em>' reference.
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	void setCustomerAgreement(CustomerAgreement value);

	/**
	 * Returns the value of the '<em><b>Meter Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Asset</em>' reference.
	 * @see #setMeterAsset(MeterAsset)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterReading_MeterAsset()
	 * @see gluemodel.CIM.IEC61968.Metering.MeterAsset#getMeterReadings
	 * @model opposite="MeterReadings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Meter asset providing this meter reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Meter asset providing this meter reading.'"
	 * @generated
	 */
	MeterAsset getMeterAsset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getMeterAsset <em>Meter Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Asset</em>' reference.
	 * @see #getMeterAsset()
	 * @generated
	 */
	void setMeterAsset(MeterAsset value);

	/**
	 * Returns the value of the '<em><b>Values Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Interval</em>' reference.
	 * @see #setValuesInterval(DateTimeInterval)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterReading_ValuesInterval()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date and time interval of the data items contained within this meter reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date and time interval of the data items contained within this meter reading.'"
	 * @generated
	 */
	DateTimeInterval getValuesInterval();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.MeterReading#getValuesInterval <em>Values Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Interval</em>' reference.
	 * @see #getValuesInterval()
	 * @generated
	 */
	void setValuesInterval(DateTimeInterval value);

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.Reading}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.Reading#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterReading_Readings()
	 * @see gluemodel.CIM.IEC61968.Metering.Reading#getMeterReadings
	 * @model opposite="MeterReadings"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All reading values contained within this meter reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All reading values contained within this meter reading.'"
	 * @generated
	 */
	EList<Reading> getReadings();

	/**
	 * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.IntervalBlock}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.IntervalBlock#getMeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Blocks</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getMeterReading_IntervalBlocks()
	 * @see gluemodel.CIM.IEC61968.Metering.IntervalBlock#getMeterReading
	 * @model opposite="MeterReading"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All interval blocks contained in this meter reading.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All interval blocks contained in this meter reading.'"
	 * @generated
	 */
	EList<IntervalBlock> getIntervalBlocks();

} // MeterReading
