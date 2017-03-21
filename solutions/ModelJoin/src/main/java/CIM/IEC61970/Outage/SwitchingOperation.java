/**
 */
package CIM.IEC61970.Outage;

import CIM.IEC61970.Core.IdentifiedObject;

import CIM.IEC61970.Wires.Switch;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switching Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Outage.SwitchingOperation#getSwitches <em>Switches</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.SwitchingOperation#getOperationTime <em>Operation Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.SwitchingOperation#getOutageSchedule <em>Outage Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Outage.SwitchingOperation#getNewState <em>New State</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Outage.OutagePackage#getSwitchingOperation()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A SwitchingOperation is used to define individual switch operations for an OutageSchedule. This OutageSchedule may be associated with another item of Substation such as a Transformer, Line, or Generator; or with the Switch itself as a PowerSystemResource. A Switch may be referenced by many OutageSchedules.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A SwitchingOperation is used to define individual switch operations for an OutageSchedule. This OutageSchedule may be associated with another item of Substation such as a Transformer, Line, or Generator; or with the Switch itself as a PowerSystemResource. A Switch may be referenced by many OutageSchedules.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A SwitchingOperation is used to define individual switch operations for an OutageSchedule. This OutageSchedule may be associated with another item of Substation such as a Transformer, Line, or Generator; or with the Switch itself as a PowerSystemResource. A Switch may be referenced by many OutageSchedules.' Profile\040documentation='A SwitchingOperation is used to define individual switch operations for an OutageSchedule. This OutageSchedule may be associated with another item of Substation such as a Transformer, Line, or Generator; or with the Switch itself as a PowerSystemResource. A Switch may be referenced by many OutageSchedules.'"
 * @generated
 */
public interface SwitchingOperation extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.Switch}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.Switch#getSwitchingOperations <em>Switching Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see CIM.IEC61970.Outage.OutagePackage#getSwitchingOperation_Switches()
	 * @see CIM.IEC61970.Wires.Switch#getSwitchingOperations
	 * @model opposite="SwitchingOperations"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A switch may be operated by many schedules.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A switch may be operated by many schedules.'"
	 * @generated
	 */
	EList<Switch> getSwitches();

	/**
	 * Returns the value of the '<em><b>Operation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Time</em>' attribute.
	 * @see #setOperationTime(Date)
	 * @see CIM.IEC61970.Outage.OutagePackage#getSwitchingOperation_OperationTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time of operation in same units as OutageSchedule.xAxixUnits.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time of operation in same units as OutageSchedule.xAxixUnits.'"
	 * @generated
	 */
	Date getOperationTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.SwitchingOperation#getOperationTime <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Time</em>' attribute.
	 * @see #getOperationTime()
	 * @generated
	 */
	void setOperationTime(Date value);

	/**
	 * Returns the value of the '<em><b>Outage Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Outage.OutageSchedule#getSwitchingOperations <em>Switching Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Schedule</em>' reference.
	 * @see #setOutageSchedule(OutageSchedule)
	 * @see CIM.IEC61970.Outage.OutagePackage#getSwitchingOperation_OutageSchedule()
	 * @see CIM.IEC61970.Outage.OutageSchedule#getSwitchingOperations
	 * @model opposite="SwitchingOperations"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An OutageSchedule may operate many switches.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An OutageSchedule may operate many switches.'"
	 * @generated
	 */
	OutageSchedule getOutageSchedule();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.SwitchingOperation#getOutageSchedule <em>Outage Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Schedule</em>' reference.
	 * @see #getOutageSchedule()
	 * @generated
	 */
	void setOutageSchedule(OutageSchedule value);

	/**
	 * Returns the value of the '<em><b>New State</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Outage.SwitchState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New State</em>' attribute.
	 * @see CIM.IEC61970.Outage.SwitchState
	 * @see #setNewState(SwitchState)
	 * @see CIM.IEC61970.Outage.OutagePackage#getSwitchingOperation_NewState()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The switch position that shall result from this SwitchingOperation'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The switch position that shall result from this SwitchingOperation'"
	 * @generated
	 */
	SwitchState getNewState();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Outage.SwitchingOperation#getNewState <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New State</em>' attribute.
	 * @see CIM.IEC61970.Outage.SwitchState
	 * @see #getNewState()
	 * @generated
	 */
	void setNewState(SwitchState value);

} // SwitchingOperation
