/**
 */
package CIM.IEC61970.Outage;

import CIM.IEC61970.Core.IrregularIntervalSchedule;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Informative.InfOperations.PlannedOutage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Outage.OutageSchedule#getPlannedOutage <em>Planned Outage</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.OutageSchedule#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.OutageSchedule#getSwitchingOperations <em>Switching Operations</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Outage.OutagePackage#getOutageSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The period of time that a piece of equipment is out of service, for example, for maintenance or testing; including the equipment\'s active power rating while under maintenance. The X-axis represents absolute time and the Y-axis represents the equipment\'s available rating while out of service.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The period of time that a piece of equipment is out of service, for example, for maintenance or testing; including the equipment\'s active power rating while under maintenance. The X-axis represents absolute time and the Y-axis represents the equipment\'s available rating while out of service.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The period of time that a piece of equipment is out of service, for example, for maintenance or testing; including the equipment\'s active power rating while under maintenance. The X-axis represents absolute time and the Y-axis represents the equipment\'s available rating while out of service.' Profile\040documentation='The period of time that a piece of equipment is out of service, for example, for maintenance or testing; including the equipment\'s active power rating while under maintenance. The X-axis represents absolute time and the Y-axis represents the equipment\'s available rating while out of service.'"
 * @generated
 */
public interface OutageSchedule extends IrregularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Planned Outage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules <em>Outage Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Outage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Outage</em>' reference.
	 * @see #setPlannedOutage(PlannedOutage)
	 * @see CIM.IEC61970.Outage.OutagePackage#getOutageSchedule_PlannedOutage()
	 * @see CIM.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules
	 * @model opposite="OutageSchedules"
	 * @generated
	 */
	PlannedOutage getPlannedOutage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.OutageSchedule#getPlannedOutage <em>Planned Outage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Outage</em>' reference.
	 * @see #getPlannedOutage()
	 * @generated
	 */
	void setPlannedOutage(PlannedOutage value);

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.PowerSystemResource#getOutageSchedule <em>Outage Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see CIM.IEC61970.Outage.OutagePackage#getOutageSchedule_PowerSystemResource()
	 * @see CIM.IEC61970.Core.PowerSystemResource#getOutageSchedule
	 * @model opposite="OutageSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A power system resource may have an outage schedule'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A power system resource may have an outage schedule'"
	 * @generated
	 */
	PowerSystemResource getPowerSystemResource();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.OutageSchedule#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	void setPowerSystemResource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Switching Operations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Outage.SwitchingOperation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Outage.SwitchingOperation#getOutageSchedule <em>Outage Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Operations</em>' reference list.
	 * @see CIM.IEC61970.Outage.OutagePackage#getOutageSchedule_SwitchingOperations()
	 * @see CIM.IEC61970.Outage.SwitchingOperation#getOutageSchedule
	 * @model opposite="OutageSchedule"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An OutageSchedule may operate many switches.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An OutageSchedule may operate many switches.'"
	 * @generated
	 */
	EList<SwitchingOperation> getSwitchingOperations();

} // OutageSchedule
