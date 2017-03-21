/**
 */
package CIM.IEC61970.SCADA;

import CIM.IEC61970.Meas.MeasurementValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.SCADA.RemoteSource#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.RemoteSource#getMeasurementValue <em>Measurement Value</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.RemoteSource#getScanInterval <em>Scan Interval</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.SCADA.SCADAPackage#getRemoteSource()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remote sources are state variables that are telemetered or calculated within the remote unit.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Remote sources are state variables that are telemetered or calculated within the remote unit.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remote sources are state variables that are telemetered or calculated within the remote unit.' Profile\040documentation='Remote sources are state variables that are telemetered or calculated within the remote unit.'"
 * @generated
 */
public interface RemoteSource extends RemotePoint {
	/**
	 * Returns the value of the '<em><b>Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadband</em>' attribute.
	 * @see #setDeadband(float)
	 * @see CIM.IEC61970.SCADA.SCADAPackage#getRemoteSource_Deadband()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The smallest change in value to be reported.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The smallest change in value to be reported.'"
	 * @generated
	 */
	float getDeadband();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.SCADA.RemoteSource#getDeadband <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadband</em>' attribute.
	 * @see #getDeadband()
	 * @generated
	 */
	void setDeadband(float value);

	/**
	 * Returns the value of the '<em><b>Sensor Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Minimum</em>' attribute.
	 * @see #setSensorMinimum(float)
	 * @see CIM.IEC61970.SCADA.SCADAPackage#getRemoteSource_SensorMinimum()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum value the telemetry item can return.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum value the telemetry item can return.'"
	 * @generated
	 */
	float getSensorMinimum();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.SCADA.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Minimum</em>' attribute.
	 * @see #getSensorMinimum()
	 * @generated
	 */
	void setSensorMinimum(float value);

	/**
	 * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.MeasurementValue#getRemoteSource <em>Remote Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value</em>' reference.
	 * @see #setMeasurementValue(MeasurementValue)
	 * @see CIM.IEC61970.SCADA.SCADAPackage#getRemoteSource_MeasurementValue()
	 * @see CIM.IEC61970.Meas.MeasurementValue#getRemoteSource
	 * @model opposite="RemoteSource"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Link to the physical telemetered point associated with this measurement.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Link to the physical telemetered point associated with this measurement.'"
	 * @generated
	 */
	MeasurementValue getMeasurementValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.SCADA.RemoteSource#getMeasurementValue <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value</em>' reference.
	 * @see #getMeasurementValue()
	 * @generated
	 */
	void setMeasurementValue(MeasurementValue value);

	/**
	 * Returns the value of the '<em><b>Scan Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scan Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Interval</em>' attribute.
	 * @see #setScanInterval(float)
	 * @see CIM.IEC61970.SCADA.SCADAPackage#getRemoteSource_ScanInterval()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time interval between scans.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time interval between scans.'"
	 * @generated
	 */
	float getScanInterval();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.SCADA.RemoteSource#getScanInterval <em>Scan Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Interval</em>' attribute.
	 * @see #getScanInterval()
	 * @generated
	 */
	void setScanInterval(float value);

	/**
	 * Returns the value of the '<em><b>Sensor Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Maximum</em>' attribute.
	 * @see #setSensorMaximum(float)
	 * @see CIM.IEC61970.SCADA.SCADAPackage#getRemoteSource_SensorMaximum()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum value the telemetry item can return.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum value the telemetry item can return.'"
	 * @generated
	 */
	float getSensorMaximum();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.SCADA.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Maximum</em>' attribute.
	 * @see #getSensorMaximum()
	 * @generated
	 */
	void setSensorMaximum(float value);

} // RemoteSource
