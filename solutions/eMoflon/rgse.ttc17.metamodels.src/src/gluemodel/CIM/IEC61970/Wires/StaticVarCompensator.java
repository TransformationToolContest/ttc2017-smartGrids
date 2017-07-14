/**
 */
package gluemodel.CIM.IEC61970.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getSlope <em>Slope</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getStaticVarCompensator()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.\n\nThe SVC may operate in fixed MVar output mode or in voltage control mode.  When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.\n\nThe SVC may operate in fixed MVar output mode or in voltage control mode.  When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.\n\nThe SVC may operate in fixed MVar output mode or in voltage control mode.  When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.' Profile\040documentation='A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.\n\nThe SVC may operate in fixed MVar output mode or in voltage control mode.  When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.'"
 * @generated
 */
public interface StaticVarCompensator extends RegulatingCondEq {
	/**
	 * Returns the value of the '<em><b>SVC Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Wires.SVCControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SVC Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SVC Control Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.SVCControlMode
	 * @see #setSVCControlMode(SVCControlMode)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getStaticVarCompensator_SVCControlMode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='SVC control mode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='SVC control mode.'"
	 * @generated
	 */
	SVCControlMode getSVCControlMode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SVC Control Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.SVCControlMode
	 * @see #getSVCControlMode()
	 * @generated
	 */
	void setSVCControlMode(SVCControlMode value);

	/**
	 * Returns the value of the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inductive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inductive Rating</em>' attribute.
	 * @see #setInductiveRating(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getStaticVarCompensator_InductiveRating()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum available inductive reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum available inductive reactive power'"
	 * @generated
	 */
	float getInductiveRating();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inductive Rating</em>' attribute.
	 * @see #getInductiveRating()
	 * @generated
	 */
	void setInductiveRating(float value);

	/**
	 * Returns the value of the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #setCapacitiveRating(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getStaticVarCompensator_CapacitiveRating()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum available capacitive reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum available capacitive reactive power'"
	 * @generated
	 */
	float getCapacitiveRating();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #getCapacitiveRating()
	 * @generated
	 */
	void setCapacitiveRating(float value);

	/**
	 * Returns the value of the '<em><b>Voltage Set Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Set Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Set Point</em>' attribute.
	 * @see #setVoltageSetPoint(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getStaticVarCompensator_VoltageSetPoint()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reactive power output of the SVC is proportional to the difference between the voltage at the regulated bus and the voltage setpoint.  When the regulated bus voltage is equal to the voltage setpoint, the reactive power output is zero.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reactive power output of the SVC is proportional to the difference between the voltage at the regulated bus and the voltage setpoint.  When the regulated bus voltage is equal to the voltage setpoint, the reactive power output is zero.'"
	 * @generated
	 */
	float getVoltageSetPoint();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Set Point</em>' attribute.
	 * @see #getVoltageSetPoint()
	 * @generated
	 */
	void setVoltageSetPoint(float value);

	/**
	 * Returns the value of the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope</em>' attribute.
	 * @see #setSlope(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getStaticVarCompensator_Slope()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.VoltagePerReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The characteristics slope of an SVC defines how the reactive power output changes in proportion to the difference between the regulated bus voltage and the voltage setpoint.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The characteristics slope of an SVC defines how the reactive power output changes in proportion to the difference between the regulated bus voltage and the voltage setpoint.'"
	 * @generated
	 */
	float getSlope();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.StaticVarCompensator#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #getSlope()
	 * @generated
	 */
	void setSlope(float value);

} // StaticVarCompensator
