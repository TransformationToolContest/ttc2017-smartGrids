/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getActivePower <em>Active Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getRn <em>Rn</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getVoltageAngle <em>Voltage Angle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getXn <em>Xn</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getX0 <em>X0</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generic equivalent for an energy supplier on a transmission or distribution voltage level.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A generic equivalent for an energy supplier on a transmission or distribution voltage level.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generic equivalent for an energy supplier on a transmission or distribution voltage level.' Profile\040documentation='A generic equivalent for an energy supplier on a transmission or distribution voltage level.'"
 * @generated
 */
public interface EnergySource extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Power</em>' attribute.
	 * @see #setActivePower(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_ActivePower()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='High voltage source load'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='High voltage source load'"
	 * @generated
	 */
	float getActivePower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getActivePower <em>Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Power</em>' attribute.
	 * @see #getActivePower()
	 * @generated
	 */
	void setActivePower(float value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_R()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence Thevenin resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence Thevenin resistance.'"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_X()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence Thevenin reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence Thevenin reactance.'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Rn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rn</em>' attribute.
	 * @see #setRn(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_Rn()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Negative sequence Thevenin resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Negative sequence Thevenin resistance.'"
	 * @generated
	 */
	float getRn();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getRn <em>Rn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rn</em>' attribute.
	 * @see #getRn()
	 * @generated
	 */
	void setRn(float value);

	/**
	 * Returns the value of the '<em><b>Voltage Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Magnitude</em>' attribute.
	 * @see #setVoltageMagnitude(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_VoltageMagnitude()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase-to-phase open circuit voltage magnitude.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase-to-phase open circuit voltage magnitude.'"
	 * @generated
	 */
	float getVoltageMagnitude();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Magnitude</em>' attribute.
	 * @see #getVoltageMagnitude()
	 * @generated
	 */
	void setVoltageMagnitude(float value);

	/**
	 * Returns the value of the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0</em>' attribute.
	 * @see #setR0(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_R0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence Thevenin resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence Thevenin resistance.'"
	 * @generated
	 */
	float getR0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #getR0()
	 * @generated
	 */
	void setR0(float value);

	/**
	 * Returns the value of the '<em><b>Voltage Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Angle</em>' attribute.
	 * @see #setVoltageAngle(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_VoltageAngle()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AngleRadians" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase angle of a-phase open circuit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase angle of a-phase open circuit.'"
	 * @generated
	 */
	float getVoltageAngle();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getVoltageAngle <em>Voltage Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Angle</em>' attribute.
	 * @see #getVoltageAngle()
	 * @generated
	 */
	void setVoltageAngle(float value);

	/**
	 * Returns the value of the '<em><b>Xn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xn</em>' attribute.
	 * @see #setXn(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_Xn()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Negative sequence Thevenin reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Negative sequence Thevenin reactance.'"
	 * @generated
	 */
	float getXn();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getXn <em>Xn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xn</em>' attribute.
	 * @see #getXn()
	 * @generated
	 */
	void setXn(float value);

	/**
	 * Returns the value of the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #setNominalVoltage(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_NominalVoltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Phase-to-phase nominal voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Phase-to-phase nominal voltage.'"
	 * @generated
	 */
	float getNominalVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #getNominalVoltage()
	 * @generated
	 */
	void setNominalVoltage(float value);

	/**
	 * Returns the value of the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' attribute.
	 * @see #setX0(float)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getEnergySource_X0()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence Thevenin reactance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence Thevenin reactance.'"
	 * @generated
	 */
	float getX0();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.EnergySource#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(float value);

} // EnergySource
