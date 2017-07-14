/**
 */
package gluemodel.CIM.IEC61970.SCADA;

import gluemodel.CIM.IEC61970.Meas.Control;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#getControl <em>Control</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#isRemoteControlled <em>Remote Controlled</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteControl()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Remote controls are ouputs that are sent by the remote unit to actuators in the process.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Remote controls are ouputs that are sent by the remote unit to actuators in the process.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Remote controls are ouputs that are sent by the remote unit to actuators in the process.' Profile\040documentation='Remote controls are ouputs that are sent by the remote unit to actuators in the process.'"
 * @generated
 */
public interface RemoteControl extends RemotePoint {
	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Control#getRemoteControl <em>Remote Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference.
	 * @see #setControl(Control)
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteControl_Control()
	 * @see gluemodel.CIM.IEC61970.Meas.Control#getRemoteControl
	 * @model opposite="RemoteControl"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Control for the RemoteControl point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Control for the RemoteControl point.'"
	 * @generated
	 */
	Control getControl();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#getControl <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Control value);

	/**
	 * Returns the value of the '<em><b>Actuator Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Maximum</em>' attribute.
	 * @see #setActuatorMaximum(float)
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteControl_ActuatorMaximum()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum set point value accepted by the remote control point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum set point value accepted by the remote control point.'"
	 * @generated
	 */
	float getActuatorMaximum();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Maximum</em>' attribute.
	 * @see #getActuatorMaximum()
	 * @generated
	 */
	void setActuatorMaximum(float value);

	/**
	 * Returns the value of the '<em><b>Remote Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Controlled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Controlled</em>' attribute.
	 * @see #setRemoteControlled(boolean)
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteControl_RemoteControlled()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set to true if the actuator is remotely controlled.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set to true if the actuator is remotely controlled.'"
	 * @generated
	 */
	boolean isRemoteControlled();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#isRemoteControlled <em>Remote Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Controlled</em>' attribute.
	 * @see #isRemoteControlled()
	 * @generated
	 */
	void setRemoteControlled(boolean value);

	/**
	 * Returns the value of the '<em><b>Actuator Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Minimum</em>' attribute.
	 * @see #setActuatorMinimum(float)
	 * @see gluemodel.CIM.IEC61970.SCADA.SCADAPackage#getRemoteControl_ActuatorMinimum()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum set point value accepted by the remote control point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum set point value accepted by the remote control point.'"
	 * @generated
	 */
	float getActuatorMinimum();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.SCADA.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Minimum</em>' attribute.
	 * @see #getActuatorMinimum()
	 * @generated
	 */
	void setActuatorMinimum(float value);

} // RemoteControl
