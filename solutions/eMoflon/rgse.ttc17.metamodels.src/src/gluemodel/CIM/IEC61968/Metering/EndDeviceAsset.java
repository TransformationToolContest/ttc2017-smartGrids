/**
 */
package gluemodel.CIM.IEC61968.Metering;

import gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel;

import gluemodel.CIM.IEC61968.Assets.AssetContainer;

import gluemodel.CIM.IEC61968.Customers.Customer;
import gluemodel.CIM.IEC61968.Customers.ServiceLocation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isRelayCapable <em>Relay Capable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getReadings <em>Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isMetrology <em>Metrology</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getTimeZoneOffset <em>Time Zone Offset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceModel <em>End Device Model</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isReadRequest <em>Read Request</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDstEnabled <em>Dst Enabled</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getDeviceFunctions <em>Device Functions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isReverseFlowHandling <em>Reverse Flow Handling</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDemandResponse <em>Demand Response</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getCustomer <em>Customer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getAmrSystem <em>Amr System</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isLoadControl <em>Load Control</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isOutageReport <em>Outage Report</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceGroups <em>End Device Groups</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='AssetContainer that performs one or more end device functions. One type of EndDeviceAsset is a MeterAsset which can perform metering, load management, connect/disconnect, accounting functions, etc. Some EndDeviceAssets, such as ones monitoring and controlling air conditioner, refrigerator, pool pumps may be connected to a MeterAsset. All EndDeviceAssets may have communication capability defined by the associated ComFunction(s). An EndDeviceAsset may be owned by a consumer, a service provider, utility or otherwise.\nThere may be a related end device function that identifies a sensor or control point within a metering application or communications systems (e.g., water, gas, electricity).\nSome devices may use an optical port that conforms to the ANSI C12.18 standard for communications.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='AssetContainer that performs one or more end device functions. One type of EndDeviceAsset is a MeterAsset which can perform metering, load management, connect/disconnect, accounting functions, etc. Some EndDeviceAssets, such as ones monitoring and controlling air conditioner, refrigerator, pool pumps may be connected to a MeterAsset. All EndDeviceAssets may have communication capability defined by the associated ComFunction(s). An EndDeviceAsset may be owned by a consumer, a service provider, utility or otherwise.\nThere may be a related end device function that identifies a sensor or control point within a metering application or communications systems (e.g., water, gas, electricity).\nSome devices may use an optical port that conforms to the ANSI C12.18 standard for communications.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='AssetContainer that performs one or more end device functions. One type of EndDeviceAsset is a MeterAsset which can perform metering, load management, connect/disconnect, accounting functions, etc. Some EndDeviceAssets, such as ones monitoring and controlling air conditioner, refrigerator, pool pumps may be connected to a MeterAsset. All EndDeviceAssets may have communication capability defined by the associated ComFunction(s). An EndDeviceAsset may be owned by a consumer, a service provider, utility or otherwise.\nThere may be a related end device function that identifies a sensor or control point within a metering application or communications systems (e.g., water, gas, electricity).\nSome devices may use an optical port that conforms to the ANSI C12.18 standard for communications.' Profile\040documentation='AssetContainer that performs one or more end device functions. One type of EndDeviceAsset is a MeterAsset which can perform metering, load management, connect/disconnect, accounting functions, etc. Some EndDeviceAssets, such as ones monitoring and controlling air conditioner, refrigerator, pool pumps may be connected to a MeterAsset. All EndDeviceAssets may have communication capability defined by the associated ComFunction(s). An EndDeviceAsset may be owned by a consumer, a service provider, utility or otherwise.\nThere may be a related end device function that identifies a sensor or control point within a metering application or communications systems (e.g., water, gas, electricity).\nSome devices may use an optical port that conforms to the ANSI C12.18 standard for communications.'"
 * @generated
 */
public interface EndDeviceAsset extends AssetContainer {
	/**
	 * Returns the value of the '<em><b>Disconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disconnect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disconnect</em>' attribute.
	 * @see #setDisconnect(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_Disconnect()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this end device asset is capable of supporting remote whole-house disconnect capability. To determine whether this functionality is installed and enabled, check the \'DeviceFunction.disabled\' attribute of the ConnectDisconnectFunction contained by this end device asset. For example, to be able to remotely disconnect the device, the following values of attributes must hold:\n- EndDeviceAsset.disconnect = true (device supports disconnect)\n- ConnectDisconnectFunction.disabled (inherited from DeviceFunction) = false (function enabled)\n- ConnectDisconnectFunction.isConnected = true (currently connected).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this end device asset is capable of supporting remote whole-house disconnect capability. To determine whether this functionality is installed and enabled, check the \'DeviceFunction.disabled\' attribute of the ConnectDisconnectFunction contained by this end device asset. For example, to be able to remotely disconnect the device, the following values of attributes must hold:\n- EndDeviceAsset.disconnect = true (device supports disconnect)\n- ConnectDisconnectFunction.disabled (inherited from DeviceFunction) = false (function enabled)\n- ConnectDisconnectFunction.isConnected = true (currently connected).'"
	 * @generated
	 */
	boolean isDisconnect();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDisconnect <em>Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disconnect</em>' attribute.
	 * @see #isDisconnect()
	 * @generated
	 */
	void setDisconnect(boolean value);

	/**
	 * Returns the value of the '<em><b>Relay Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relay Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relay Capable</em>' attribute.
	 * @see #setRelayCapable(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_RelayCapable()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this end device asset is capable of supporting one or more relays. The relays may be programmable in the meter and tied to TOU, time pulse, load control or other functions. To determine whether this functionality is installed and enabled, check the \'DeviceFunction.disabled\' attribute of the respective function contained by this end device asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this end device asset is capable of supporting one or more relays. The relays may be programmable in the meter and tied to TOU, time pulse, load control or other functions. To determine whether this functionality is installed and enabled, check the \'DeviceFunction.disabled\' attribute of the respective function contained by this end device asset.'"
	 * @generated
	 */
	boolean isRelayCapable();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isRelayCapable <em>Relay Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relay Capable</em>' attribute.
	 * @see #isRelayCapable()
	 * @generated
	 */
	void setRelayCapable(boolean value);

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.Reading}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.Reading#getEndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_Readings()
	 * @see gluemodel.CIM.IEC61968.Metering.Reading#getEndDeviceAsset
	 * @model opposite="EndDeviceAsset"
	 * @generated
	 */
	EList<Reading> getReadings();

	/**
	 * Returns the value of the '<em><b>Service Delivery Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Point</em>' reference.
	 * @see #setServiceDeliveryPoint(ServiceDeliveryPoint)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_ServiceDeliveryPoint()
	 * @see gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint#getEndDeviceAssets
	 * @model opposite="EndDeviceAssets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Service delivery point to which this end device asset belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Service delivery point to which this end device asset belongs.'"
	 * @generated
	 */
	ServiceDeliveryPoint getServiceDeliveryPoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceDeliveryPoint <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delivery Point</em>' reference.
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	void setServiceDeliveryPoint(ServiceDeliveryPoint value);

	/**
	 * Returns the value of the '<em><b>Metrology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrology</em>' attribute.
	 * @see #setMetrology(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_Metrology()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this end device asset is capable of supporting the presentation of metered values to a user or another system (always true for a meter, but might not be true for a load control unit.)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this end device asset is capable of supporting the presentation of metered values to a user or another system (always true for a meter, but might not be true for a load control unit.)'"
	 * @generated
	 */
	boolean isMetrology();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isMetrology <em>Metrology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrology</em>' attribute.
	 * @see #isMetrology()
	 * @generated
	 */
	void setMetrology(boolean value);

	/**
	 * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Voltage</em>' attribute.
	 * @see #setRatedVoltage(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_RatedVoltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated voltage.'"
	 * @generated
	 */
	float getRatedVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Voltage</em>' attribute.
	 * @see #getRatedVoltage()
	 * @generated
	 */
	void setRatedVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #setRatedCurrent(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_RatedCurrent()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rated current.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rated current.'"
	 * @generated
	 */
	float getRatedCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #getRatedCurrent()
	 * @generated
	 */
	void setRatedCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Time Zone Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Zone Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone Offset</em>' attribute.
	 * @see #setTimeZoneOffset(float)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_TimeZoneOffset()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Minutes" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time zone offset relative to GMT for the location of this end device.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time zone offset relative to GMT for the location of this end device.'"
	 * @generated
	 */
	float getTimeZoneOffset();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone Offset</em>' attribute.
	 * @see #getTimeZoneOffset()
	 * @generated
	 */
	void setTimeZoneOffset(float value);

	/**
	 * Returns the value of the '<em><b>Service Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.ServiceLocation#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Location</em>' reference.
	 * @see #setServiceLocation(ServiceLocation)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_ServiceLocation()
	 * @see gluemodel.CIM.IEC61968.Customers.ServiceLocation#getEndDeviceAssets
	 * @model opposite="EndDeviceAssets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Service location whose service delivery is measured by this end device asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Service location whose service delivery is measured by this end device asset.'"
	 * @generated
	 */
	ServiceLocation getServiceLocation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getServiceLocation <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Location</em>' reference.
	 * @see #getServiceLocation()
	 * @generated
	 */
	void setServiceLocation(ServiceLocation value);

	/**
	 * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Controls</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_EndDeviceControls()
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceControl#getEndDeviceAsset
	 * @model opposite="EndDeviceAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device controls sending commands to this end device asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device controls sending commands to this end device asset.'"
	 * @generated
	 */
	EList<EndDeviceControl> getEndDeviceControls();

	/**
	 * Returns the value of the '<em><b>End Device Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Model</em>' reference.
	 * @see #setEndDeviceModel(EndDeviceModel)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_EndDeviceModel()
	 * @see gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel#getEndDeviceAssets
	 * @model opposite="EndDeviceAssets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Product documentation for this end device asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Product documentation for this end device asset.'"
	 * @generated
	 */
	EndDeviceModel getEndDeviceModel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceModel <em>End Device Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Model</em>' reference.
	 * @see #getEndDeviceModel()
	 * @generated
	 */
	void setEndDeviceModel(EndDeviceModel value);

	/**
	 * Returns the value of the '<em><b>Read Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Request</em>' attribute.
	 * @see #setReadRequest(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_ReadRequest()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this end device asset is capable of supporting on-request reads for this end device.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this end device asset is capable of supporting on-request reads for this end device.'"
	 * @generated
	 */
	boolean isReadRequest();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isReadRequest <em>Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Request</em>' attribute.
	 * @see #isReadRequest()
	 * @generated
	 */
	void setReadRequest(boolean value);

	/**
	 * Returns the value of the '<em><b>Dst Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Enabled</em>' attribute.
	 * @see #setDstEnabled(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_DstEnabled()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this end device asset is capable of supporting the autonomous application of daylight savings time (DST).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this end device asset is capable of supporting the autonomous application of daylight savings time (DST).'"
	 * @generated
	 */
	boolean isDstEnabled();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDstEnabled <em>Dst Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst Enabled</em>' attribute.
	 * @see #isDstEnabled()
	 * @generated
	 */
	void setDstEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Count</em>' attribute.
	 * @see #setPhaseCount(int)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_PhaseCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of potential phases the asset supports, typically 0, 1 or 3.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of potential phases the asset supports, typically 0, 1 or 3.'"
	 * @generated
	 */
	int getPhaseCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Count</em>' attribute.
	 * @see #getPhaseCount()
	 * @generated
	 */
	void setPhaseCount(int value);

	/**
	 * Returns the value of the '<em><b>Device Functions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.DeviceFunction}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.DeviceFunction#getEndDeviceAsset <em>End Device Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Functions</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_DeviceFunctions()
	 * @see gluemodel.CIM.IEC61968.Metering.DeviceFunction#getEndDeviceAsset
	 * @model opposite="EndDeviceAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All device functions this end device asset performs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All device functions this end device asset performs.'"
	 * @generated
	 */
	EList<DeviceFunction> getDeviceFunctions();

	/**
	 * Returns the value of the '<em><b>Reverse Flow Handling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Flow Handling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Flow Handling</em>' attribute.
	 * @see #setReverseFlowHandling(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_ReverseFlowHandling()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this EndDeviceAsset is capable of supporting detection and monitoring of reverse flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this EndDeviceAsset is capable of supporting detection and monitoring of reverse flow.'"
	 * @generated
	 */
	boolean isReverseFlowHandling();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isReverseFlowHandling <em>Reverse Flow Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Flow Handling</em>' attribute.
	 * @see #isReverseFlowHandling()
	 * @generated
	 */
	void setReverseFlowHandling(boolean value);

	/**
	 * Returns the value of the '<em><b>Demand Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Response</em>' attribute.
	 * @see #setDemandResponse(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_DemandResponse()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this end device asset is capable of supporting demand response functions. To determine whether this functionality is installed and enabled, check the \'DeviceFunction.disabled\' attribute of the respective function contained by this end device asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this end device asset is capable of supporting demand response functions. To determine whether this functionality is installed and enabled, check the \'DeviceFunction.disabled\' attribute of the respective function contained by this end device asset.'"
	 * @generated
	 */
	boolean isDemandResponse();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isDemandResponse <em>Demand Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Response</em>' attribute.
	 * @see #isDemandResponse()
	 * @generated
	 */
	void setDemandResponse(boolean value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Customers.Customer#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_Customer()
	 * @see gluemodel.CIM.IEC61968.Customers.Customer#getEndDeviceAssets
	 * @model opposite="EndDeviceAssets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Customer owning this end device asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Customer owning this end device asset.'"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Amr System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amr System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amr System</em>' attribute.
	 * @see #setAmrSystem(String)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_AmrSystem()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Automated meter reading (AMR) system responsible for communications to this end device.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Automated meter reading (AMR) system responsible for communications to this end device.'"
	 * @generated
	 */
	String getAmrSystem();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#getAmrSystem <em>Amr System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amr System</em>' attribute.
	 * @see #getAmrSystem()
	 * @generated
	 */
	void setAmrSystem(String value);

	/**
	 * Returns the value of the '<em><b>Load Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Control</em>' attribute.
	 * @see #setLoadControl(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_LoadControl()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this end device asset is capable of supporting load control functions through either the meter or the AMR option. To determine whether this functionality is installed and enabled, check the \'DeviceFunction.disabled\' attribute of the respective function contained by this end device asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this end device asset is capable of supporting load control functions through either the meter or the AMR option. To determine whether this functionality is installed and enabled, check the \'DeviceFunction.disabled\' attribute of the respective function contained by this end device asset.'"
	 * @generated
	 */
	boolean isLoadControl();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isLoadControl <em>Load Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Control</em>' attribute.
	 * @see #isLoadControl()
	 * @generated
	 */
	void setLoadControl(boolean value);

	/**
	 * Returns the value of the '<em><b>Outage Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Report</em>' attribute.
	 * @see #setOutageReport(boolean)
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_OutageReport()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if this end device asset is capable of supporting the means to report historical power interruption data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if this end device asset is capable of supporting the means to report historical power interruption data.'"
	 * @generated
	 */
	boolean isOutageReport();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceAsset#isOutageReport <em>Outage Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Report</em>' attribute.
	 * @see #isOutageReport()
	 * @generated
	 */
	void setOutageReport(boolean value);

	/**
	 * Returns the value of the '<em><b>End Device Groups</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceAssets <em>End Device Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Groups</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getEndDeviceAsset_EndDeviceGroups()
	 * @see gluemodel.CIM.IEC61968.Metering.EndDeviceGroup#getEndDeviceAssets
	 * @model opposite="EndDeviceAssets"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device groups referring to this end device asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device groups referring to this end device asset.'"
	 * @generated
	 */
	EList<EndDeviceGroup> getEndDeviceGroups();

} // EndDeviceAsset
