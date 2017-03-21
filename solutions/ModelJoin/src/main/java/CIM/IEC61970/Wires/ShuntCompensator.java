/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.StateVariables.SvShuntCompensatorSections;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getB0PerSection <em>B0 Per Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getNomQ <em>Nom Q</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getNomU <em>Nom U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getBPerSection <em>BPer Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getGPerSection <em>GPer Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getG0PerSection <em>G0 Per Section</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  A negative value for reactivePerSection indicates that the compensator is a reactor. ShuntCompensator is a single terminal device.  Ground is implied.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  A negative value for reactivePerSection indicates that the compensator is a reactor. ShuntCompensator is a single terminal device.  Ground is implied.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  A negative value for reactivePerSection indicates that the compensator is a reactor. ShuntCompensator is a single terminal device.  Ground is implied.' Profile\040documentation='A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  A negative value for reactivePerSection indicates that the compensator is a reactor. ShuntCompensator is a single terminal device.  Ground is implied.'"
 * @generated
 */
public interface ShuntCompensator extends RegulatingCondEq {
	/**
	 * Returns the value of the '<em><b>Normal Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Sections</em>' attribute.
	 * @see #setNormalSections(int)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_NormalSections()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For a capacitor bank, the normal number of sections switched in. This number should correspond to the nominal reactive power (nomQ).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a capacitor bank, the normal number of sections switched in. This number should correspond to the nominal reactive power (nomQ).'"
	 * @generated
	 */
	int getNormalSections();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Sections</em>' attribute.
	 * @see #getNormalSections()
	 * @generated
	 */
	void setNormalSections(int value);

	/**
	 * Returns the value of the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min U</em>' attribute.
	 * @see #setMinU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_MinU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum voltage at which the capacitor bank should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum voltage at which the capacitor bank should operate.'"
	 * @generated
	 */
	float getMinU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getMinU <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min U</em>' attribute.
	 * @see #getMinU()
	 * @generated
	 */
	void setMinU(float value);

	/**
	 * Returns the value of the '<em><b>B0 Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0 Per Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0 Per Section</em>' attribute.
	 * @see #setB0PerSection(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_B0PerSection()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence shunt (charging) susceptance per section'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence shunt (charging) susceptance per section'"
	 * @generated
	 */
	float getB0PerSection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0 Per Section</em>' attribute.
	 * @see #getB0PerSection()
	 * @generated
	 */
	void setB0PerSection(float value);

	/**
	 * Returns the value of the '<em><b>Nom Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Q</em>' attribute.
	 * @see #setNomQ(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_NomQ()
	 * @model dataType="CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Nominal reactive power output of the capacitor bank at the nominal voltage. This number should be positive.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Nominal reactive power output of the capacitor bank at the nominal voltage. This number should be positive.'"
	 * @generated
	 */
	float getNomQ();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getNomQ <em>Nom Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Q</em>' attribute.
	 * @see #getNomQ()
	 * @generated
	 */
	void setNomQ(float value);

	/**
	 * Returns the value of the '<em><b>Nom U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom U</em>' attribute.
	 * @see #setNomU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_NomU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The nominal voltage at which the nominal reactive power was measured. This should normally be within 10% of the voltage at which the capacitor is connected to the network.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The nominal voltage at which the nominal reactive power was measured. This should normally be within 10% of the voltage at which the capacitor is connected to the network.'"
	 * @generated
	 */
	float getNomU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getNomU <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom U</em>' attribute.
	 * @see #getNomU()
	 * @generated
	 */
	void setNomU(float value);

	/**
	 * Returns the value of the '<em><b>Maximum Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Sections</em>' attribute.
	 * @see #setMaximumSections(int)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_MaximumSections()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For a capacitor bank, the maximum number of sections that may be switched in.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a capacitor bank, the maximum number of sections that may be switched in.'"
	 * @generated
	 */
	int getMaximumSections();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Sections</em>' attribute.
	 * @see #getMaximumSections()
	 * @generated
	 */
	void setMaximumSections(int value);

	/**
	 * Returns the value of the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch On Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch On Count</em>' attribute.
	 * @see #setSwitchOnCount(int)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_SwitchOnCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The switch on count since the capacitor count was last reset or initialized.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The switch on count since the capacitor count was last reset or initialized.'"
	 * @generated
	 */
	int getSwitchOnCount();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch On Count</em>' attribute.
	 * @see #getSwitchOnCount()
	 * @generated
	 */
	void setSwitchOnCount(int value);

	/**
	 * Returns the value of the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max U</em>' attribute.
	 * @see #setMaxU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_MaxU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum voltage at which the capacitor bank should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum voltage at which the capacitor bank should operate.'"
	 * @generated
	 */
	float getMaxU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getMaxU <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max U</em>' attribute.
	 * @see #getMaxU()
	 * @generated
	 */
	void setMaxU(float value);

	/**
	 * Returns the value of the '<em><b>BPer Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPer Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPer Section</em>' attribute.
	 * @see #setBPerSection(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_BPerSection()
	 * @model dataType="CIM.IEC61970.Domain.Susceptance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence shunt (charging) susceptance per section'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt (charging) susceptance per section'"
	 * @generated
	 */
	float getBPerSection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPer Section</em>' attribute.
	 * @see #getBPerSection()
	 * @generated
	 */
	void setBPerSection(float value);

	/**
	 * Returns the value of the '<em><b>GPer Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPer Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPer Section</em>' attribute.
	 * @see #setGPerSection(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_GPerSection()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Positive sequence shunt (charging) conductance per section'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Positive sequence shunt (charging) conductance per section'"
	 * @generated
	 */
	float getGPerSection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPer Section</em>' attribute.
	 * @see #getGPerSection()
	 * @generated
	 */
	void setGPerSection(float value);

	/**
	 * Returns the value of the '<em><b>Sv Shunt Compensator Sections</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Shunt Compensator Sections</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Shunt Compensator Sections</em>' reference.
	 * @see #setSvShuntCompensatorSections(SvShuntCompensatorSections)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_SvShuntCompensatorSections()
	 * @see CIM.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator
	 * @model opposite="ShuntCompensator"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The state for the number of shunt compensator sections in service.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The state for the number of shunt compensator sections in service.'"
	 * @generated
	 */
	SvShuntCompensatorSections getSvShuntCompensatorSections();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Shunt Compensator Sections</em>' reference.
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 */
	void setSvShuntCompensatorSections(SvShuntCompensatorSections value);

	/**
	 * Returns the value of the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch On Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch On Date</em>' attribute.
	 * @see #setSwitchOnDate(Date)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_SwitchOnDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date and time when the capacitor bank was last switched on.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date and time when the capacitor bank was last switched on.'"
	 * @generated
	 */
	Date getSwitchOnDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch On Date</em>' attribute.
	 * @see #getSwitchOnDate()
	 * @generated
	 */
	void setSwitchOnDate(Date value);

	/**
	 * Returns the value of the '<em><b>AVR Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AVR Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AVR Delay</em>' attribute.
	 * @see #setAVRDelay(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_AVRDelay()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time delay required for the device to be connected or disconnected by automatic voltage regulation (AVR).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time delay required for the device to be connected or disconnected by automatic voltage regulation (AVR).'"
	 * @generated
	 */
	float getAVRDelay();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AVR Delay</em>' attribute.
	 * @see #getAVRDelay()
	 * @generated
	 */
	void setAVRDelay(float value);

	/**
	 * Returns the value of the '<em><b>Voltage Sensitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Sensitivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Sensitivity</em>' attribute.
	 * @see #setVoltageSensitivity(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_VoltageSensitivity()
	 * @model dataType="CIM.IEC61970.Domain.VoltagePerReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Voltage sensitivity required for the device to regulate the bus voltage, in voltage/reactive power.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Voltage sensitivity required for the device to regulate the bus voltage, in voltage/reactive power.'"
	 * @generated
	 */
	float getVoltageSensitivity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Sensitivity</em>' attribute.
	 * @see #getVoltageSensitivity()
	 * @generated
	 */
	void setVoltageSensitivity(float value);

	/**
	 * Returns the value of the '<em><b>G0 Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0 Per Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0 Per Section</em>' attribute.
	 * @see #setG0PerSection(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_G0PerSection()
	 * @model dataType="CIM.IEC61970.Domain.Conductance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Zero sequence shunt (charging) conductance per section'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Zero sequence shunt (charging) conductance per section'"
	 * @generated
	 */
	float getG0PerSection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0 Per Section</em>' attribute.
	 * @see #getG0PerSection()
	 * @generated
	 */
	void setG0PerSection(float value);

	/**
	 * Returns the value of the '<em><b>Reactive Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive Per Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive Per Section</em>' attribute.
	 * @see #setReactivePerSection(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getShuntCompensator_ReactivePerSection()
	 * @model dataType="CIM.IEC61970.Domain.ReactivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For a capacitor bank, the size in reactive power of each switchable section at the nominal voltage.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For a capacitor bank, the size in reactive power of each switchable section at the nominal voltage.'"
	 * @generated
	 */
	float getReactivePerSection();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive Per Section</em>' attribute.
	 * @see #getReactivePerSection()
	 * @generated
	 */
	void setReactivePerSection(float value);

} // ShuntCompensator
