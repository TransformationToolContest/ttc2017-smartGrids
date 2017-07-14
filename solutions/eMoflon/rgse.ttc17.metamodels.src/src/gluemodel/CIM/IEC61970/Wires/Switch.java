/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;

import gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction;

import gluemodel.CIM.IEC61970.Outage.SwitchingOperation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#isRetained <em>Retained</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#getLoadMgmtFunctions <em>Load Mgmt Functions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#isNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#getSwitchingOperations <em>Switching Operations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#getSwitchSchedules <em>Switch Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.Switch#getCompositeSwitch <em>Composite Switch</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generic device designed to close, or open, or both, one or more electric circuits.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A generic device designed to close, or open, or both, one or more electric circuits.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generic device designed to close, or open, or both, one or more electric circuits.' Profile\040documentation='A generic device designed to close, or open, or both, one or more electric circuits.'"
 * @generated
 */
public interface Switch extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retained</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retained</em>' attribute.
	 * @see #setRetained(boolean)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_Retained()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Branch is retained in a bus branch model.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Branch is retained in a bus branch model.'"
	 * @generated
	 */
	boolean isRetained();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Switch#isRetained <em>Retained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retained</em>' attribute.
	 * @see #isRetained()
	 * @generated
	 */
	void setRetained(boolean value);

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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_SwitchOnDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date and time when the switch was last switched on.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date and time when the switch was last switched on.'"
	 * @generated
	 */
	Date getSwitchOnDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Switch#getSwitchOnDate <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch On Date</em>' attribute.
	 * @see #getSwitchOnDate()
	 * @generated
	 */
	void setSwitchOnDate(Date value);

	/**
	 * Returns the value of the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Mgmt Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Mgmt Functions</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_LoadMgmtFunctions()
	 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches
	 * @model opposite="Switches"
	 * @generated
	 */
	EList<LoadMgmtFunction> getLoadMgmtFunctions();

	/**
	 * Returns the value of the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Disconnect Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Disconnect Functions</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_ConnectDisconnectFunctions()
	 * @see gluemodel.CIM.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches
	 * @model opposite="Switches"
	 * @generated
	 */
	EList<ConnectDisconnectFunction> getConnectDisconnectFunctions();

	/**
	 * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Open</em>' attribute.
	 * @see #setNormalOpen(boolean)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_NormalOpen()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The attribute is used in cases when no Measurement for the status value is present. If the Switch has a status measurment the Discrete.normalValue is expected to match with the Switch.normalOpen.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The attribute is used in cases when no Measurement for the status value is present. If the Switch has a status measurment the Discrete.normalValue is expected to match with the Switch.normalOpen.'"
	 * @generated
	 */
	boolean isNormalOpen();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Switch#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Open</em>' attribute.
	 * @see #isNormalOpen()
	 * @generated
	 */
	void setNormalOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Switching Operations</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Outage.SwitchingOperation}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Outage.SwitchingOperation#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Operations</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_SwitchingOperations()
	 * @see gluemodel.CIM.IEC61970.Outage.SwitchingOperation#getSwitches
	 * @model opposite="Switches"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A switch may be operated by many schedules.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A switch may be operated by many schedules.'"
	 * @generated
	 */
	EList<SwitchingOperation> getSwitchingOperations();

	/**
	 * Returns the value of the '<em><b>Switch Schedules</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.SwitchSchedule}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.SwitchSchedule#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Schedules</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_SwitchSchedules()
	 * @see gluemodel.CIM.IEC61970.Wires.SwitchSchedule#getSwitch
	 * @model opposite="Switch"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Switch can be associated with SwitchSchedules.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Switch can be associated with SwitchSchedules.'"
	 * @generated
	 */
	EList<SwitchSchedule> getSwitchSchedules();

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
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_SwitchOnCount()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The switch on count since the switch was last reset or initialized.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The switch on count since the switch was last reset or initialized.'"
	 * @generated
	 */
	int getSwitchOnCount();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Switch#getSwitchOnCount <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch On Count</em>' attribute.
	 * @see #getSwitchOnCount()
	 * @generated
	 */
	void setSwitchOnCount(int value);

	/**
	 * Returns the value of the '<em><b>Composite Switch</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.CompositeSwitch#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Switch</em>' reference.
	 * @see #setCompositeSwitch(CompositeSwitch)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getSwitch_CompositeSwitch()
	 * @see gluemodel.CIM.IEC61970.Wires.CompositeSwitch#getSwitches
	 * @model opposite="Switches"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Composite switch this Switch belongs to'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Composite switch this Switch belongs to'"
	 * @generated
	 */
	CompositeSwitch getCompositeSwitch();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.Switch#getCompositeSwitch <em>Composite Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Switch</em>' reference.
	 * @see #getCompositeSwitch()
	 * @generated
	 */
	void setCompositeSwitch(CompositeSwitch value);

} // Switch
