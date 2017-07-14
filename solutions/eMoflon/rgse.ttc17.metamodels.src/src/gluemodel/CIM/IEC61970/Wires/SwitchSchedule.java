/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.SwitchSchedule#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitchSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A schedule of switch positions.  If RegularTimePoint.value1 is 0, the switch is open.  If 1, the switch is closed.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A schedule of switch positions.  If RegularTimePoint.value1 is 0, the switch is open.  If 1, the switch is closed.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A schedule of switch positions.  If RegularTimePoint.value1 is 0, the switch is open.  If 1, the switch is closed.' Profile\040documentation='A schedule of switch positions.  If RegularTimePoint.value1 is 0, the switch is open.  If 1, the switch is closed.'"
 * @generated
 */
public interface SwitchSchedule extends SeasonDayTypeSchedule {
	/**
	 * Returns the value of the '<em><b>Switch</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.Switch#getSwitchSchedules <em>Switch Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' reference.
	 * @see #setSwitch(Switch)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitchSchedule_Switch()
	 * @see gluemodel.CIM.IEC61970.Wires.Switch#getSwitchSchedules
	 * @model opposite="SwitchSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A SwitchSchedule is associated with a Switch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A SwitchSchedule is associated with a Switch.'"
	 * @generated
	 */
	Switch getSwitch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.SwitchSchedule#getSwitch <em>Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' reference.
	 * @see #getSwitch()
	 * @generated
	 */
	void setSwitch(Switch value);

} // SwitchSchedule
