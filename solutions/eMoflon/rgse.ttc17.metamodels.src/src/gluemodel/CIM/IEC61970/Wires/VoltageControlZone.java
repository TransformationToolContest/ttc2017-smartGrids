/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Control Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getVoltageControlZone()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An area of the power system network which is defined for secondary voltage control purposes. A voltage control zone consists of a collection of substations with a designated bus bar section whose voltage will be controlled.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An area of the power system network which is defined for secondary voltage control purposes. A voltage control zone consists of a collection of substations with a designated bus bar section whose voltage will be controlled.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An area of the power system network which is defined for secondary voltage control purposes. A voltage control zone consists of a collection of substations with a designated bus bar section whose voltage will be controlled.' Profile\040documentation='An area of the power system network which is defined for secondary voltage control purposes. A voltage control zone consists of a collection of substations with a designated bus bar section whose voltage will be controlled.'"
 * @generated
 */
public interface VoltageControlZone extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Regulation Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Schedule</em>' reference.
	 * @see #setRegulationSchedule(RegulationSchedule)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getVoltageControlZone_RegulationSchedule()
	 * @see gluemodel.CIM.IEC61970.Wires.RegulationSchedule#getVoltageControlZones
	 * @model opposite="VoltageControlZones"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A VoltageControlZone may have a  voltage regulation schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A VoltageControlZone may have a  voltage regulation schedule.'"
	 * @generated
	 */
	RegulationSchedule getRegulationSchedule();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Schedule</em>' reference.
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	void setRegulationSchedule(RegulationSchedule value);

	/**
	 * Returns the value of the '<em><b>Busbar Section</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busbar Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busbar Section</em>' reference.
	 * @see #setBusbarSection(BusbarSection)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getVoltageControlZone_BusbarSection()
	 * @see gluemodel.CIM.IEC61970.Wires.BusbarSection#getVoltageControlZone
	 * @model opposite="VoltageControlZone"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A VoltageControlZone is controlled by a designated BusbarSection.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A VoltageControlZone is controlled by a designated BusbarSection.'"
	 * @generated
	 */
	BusbarSection getBusbarSection();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busbar Section</em>' reference.
	 * @see #getBusbarSection()
	 * @generated
	 */
	void setBusbarSection(BusbarSection value);

} // VoltageControlZone
