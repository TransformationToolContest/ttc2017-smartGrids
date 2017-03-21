/**
 */
package CIM.IEC61970.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Busbar Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getBusbarSection()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation. \nVoltage measurements are typically obtained from VoltageTransformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation. \nVoltage measurements are typically obtained from VoltageTransformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation. \nVoltage measurements are typically obtained from VoltageTransformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal.' Profile\040documentation='A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation. \nVoltage measurements are typically obtained from VoltageTransformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal.'"
 * @generated
 */
public interface BusbarSection extends Connector {
	/**
	 * Returns the value of the '<em><b>Voltage Control Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Control Zone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Control Zone</em>' reference.
	 * @see #setVoltageControlZone(VoltageControlZone)
	 * @see CIM.IEC61970.Wires.WiresPackage#getBusbarSection_VoltageControlZone()
	 * @see CIM.IEC61970.Wires.VoltageControlZone#getBusbarSection
	 * @model opposite="BusbarSection"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A VoltageControlZone is controlled by a designated BusbarSection.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A VoltageControlZone is controlled by a designated BusbarSection.'"
	 * @generated
	 */
	VoltageControlZone getVoltageControlZone();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Control Zone</em>' reference.
	 * @see #getVoltageControlZone()
	 * @generated
	 */
	void setVoltageControlZone(VoltageControlZone value);

} // BusbarSection
