/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling;

import gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule;

import gluemodel.CIM.IEC61970.Meas.Measurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getDynSchedStatus <em>Dyn Sched Status</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getReceive_HostControlArea <em>Receive Host Control Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getSend_HostControlArea <em>Send Host Control Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#isDynSchedSignRev <em>Dyn Sched Sign Rev</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getDynamicSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A continuously variable component of a control area\'s active power net interchange schedule. Dynamic schedules are sent and received by control areas.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A continuously variable component of a control area\'s active power net interchange schedule. Dynamic schedules are sent and received by control areas.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A continuously variable component of a control area\'s active power net interchange schedule. Dynamic schedules are sent and received by control areas.' Profile\040documentation='A continuously variable component of a control area\'s active power net interchange schedule. Dynamic schedules are sent and received by control areas.'"
 * @generated
 */
public interface DynamicSchedule extends RegularIntervalSchedule {
	/**
	 * Returns the value of the '<em><b>Dyn Sched Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dyn Sched Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dyn Sched Status</em>' attribute.
	 * @see #setDynSchedStatus(String)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getDynamicSchedule_DynSchedStatus()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The \"active\" or \"inactive\" status of the dynamic schedule'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The \"active\" or \"inactive\" status of the dynamic schedule'"
	 * @generated
	 */
	String getDynSchedStatus();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getDynSchedStatus <em>Dyn Sched Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dyn Sched Status</em>' attribute.
	 * @see #getDynSchedStatus()
	 * @generated
	 */
	void setDynSchedStatus(String value);

	/**
	 * Returns the value of the '<em><b>Receive Host Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getReceive_DynamicSchedules <em>Receive Dynamic Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Host Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Host Control Area</em>' reference.
	 * @see #setReceive_HostControlArea(HostControlArea)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getDynamicSchedule_Receive_HostControlArea()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getReceive_DynamicSchedules
	 * @model opposite="Receive_DynamicSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area can receive dynamic schedules from other control areas'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area can receive dynamic schedules from other control areas'"
	 * @generated
	 */
	HostControlArea getReceive_HostControlArea();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getReceive_HostControlArea <em>Receive Host Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Host Control Area</em>' reference.
	 * @see #getReceive_HostControlArea()
	 * @generated
	 */
	void setReceive_HostControlArea(HostControlArea value);

	/**
	 * Returns the value of the '<em><b>Measurement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Measurement#getDynamicSchedules <em>Dynamic Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' reference.
	 * @see #setMeasurement(Measurement)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getDynamicSchedule_Measurement()
	 * @see gluemodel.CIM.IEC61970.Meas.Measurement#getDynamicSchedules
	 * @model opposite="DynamicSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A measurement is a data source for dynamic interchange schedules'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A measurement is a data source for dynamic interchange schedules'"
	 * @generated
	 */
	Measurement getMeasurement();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getMeasurement <em>Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement</em>' reference.
	 * @see #getMeasurement()
	 * @generated
	 */
	void setMeasurement(Measurement value);

	/**
	 * Returns the value of the '<em><b>Send Host Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSend_DynamicSchedules <em>Send Dynamic Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Host Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Host Control Area</em>' reference.
	 * @see #setSend_HostControlArea(HostControlArea)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getDynamicSchedule_Send_HostControlArea()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.HostControlArea#getSend_DynamicSchedules
	 * @model opposite="Send_DynamicSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A control area can send dynamic schedules to other control areas'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A control area can send dynamic schedules to other control areas'"
	 * @generated
	 */
	HostControlArea getSend_HostControlArea();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#getSend_HostControlArea <em>Send Host Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Host Control Area</em>' reference.
	 * @see #getSend_HostControlArea()
	 * @generated
	 */
	void setSend_HostControlArea(HostControlArea value);

	/**
	 * Returns the value of the '<em><b>Dyn Sched Sign Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dyn Sched Sign Rev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dyn Sched Sign Rev</em>' attribute.
	 * @see #setDynSchedSignRev(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage#getDynamicSchedule_DynSchedSignRev()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Dynamic schedule sign reversal required (yes/no)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Dynamic schedule sign reversal required (yes/no)'"
	 * @generated
	 */
	boolean isDynSchedSignRev();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule#isDynSchedSignRev <em>Dyn Sched Sign Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dyn Sched Sign Rev</em>' attribute.
	 * @see #isDynSchedSignRev()
	 * @generated
	 */
	void setDynSchedSignRev(boolean value);

} // DynamicSchedule
