/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.Core.PowerSystemResource;
import CIM.IEC61970.Core.Terminal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulating Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.RegulatingControl#getMode <em>Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RegulatingControl#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RegulatingControl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RegulatingControl#getTargetRange <em>Target Range</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RegulatingControl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RegulatingControl#isDiscrete <em>Discrete</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.' Profile\040documentation='Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.'"
 * @generated
 */
public interface RegulatingControl extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Wires.RegulatingControlModeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see CIM.IEC61970.Wires.RegulatingControlModeKind
	 * @see #setMode(RegulatingControlModeKind)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl_Mode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The regulating control mode presently available.  This specifications allows for determining the kind of regualation without need for obtaining the units from a schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The regulating control mode presently available.  This specifications allows for determining the kind of regualation without need for obtaining the units from a schedule.'"
	 * @generated
	 */
	RegulatingControlModeKind getMode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RegulatingControl#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see CIM.IEC61970.Wires.RegulatingControlModeKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(RegulatingControlModeKind value);

	/**
	 * Returns the value of the '<em><b>Tap Changer</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.TapChanger}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.TapChanger#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer</em>' reference list.
	 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl_TapChanger()
	 * @see CIM.IEC61970.Wires.TapChanger#getRegulatingControl
	 * @model opposite="RegulatingControl"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='copy from reg conduting eq'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='copy from reg conduting eq'"
	 * @generated
	 */
	EList<TapChanger> getTapChanger();

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl_Terminal()
	 * @see CIM.IEC61970.Core.Terminal#getRegulatingControl
	 * @model opposite="RegulatingControl"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The terminal associated with this regulating control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminal associated with this regulating control.'"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RegulatingControl#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Regulating Cond Eq</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.RegulatingCondEq}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Cond Eq</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Cond Eq</em>' reference list.
	 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl_RegulatingCondEq()
	 * @see CIM.IEC61970.Wires.RegulatingCondEq#getRegulatingControl
	 * @model opposite="RegulatingControl"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The equipment that participates in this regulating control scheme.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equipment that participates in this regulating control scheme.'"
	 * @generated
	 */
	EList<RegulatingCondEq> getRegulatingCondEq();

	/**
	 * Returns the value of the '<em><b>Target Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Range</em>' attribute.
	 * @see #setTargetRange(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl_TargetRange()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is the case input target range.   This performs the same function as the value2 attribute on the regulation schedule in the case that schedules are not used.   The units of those appropriate for the mode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the case input target range.   This performs the same function as the value2 attribute on the regulation schedule in the case that schedules are not used.   The units of those appropriate for the mode.'"
	 * @generated
	 */
	float getTargetRange();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RegulatingControl#getTargetRange <em>Target Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Range</em>' attribute.
	 * @see #getTargetRange()
	 * @generated
	 */
	void setTargetRange(float value);

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' attribute.
	 * @see #setTargetValue(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl_TargetValue()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The target value specified for case input.   This value can be used for the target value wihout the use of schedules. The value has the units appropriate to the mode attribute.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The target value specified for case input.   This value can be used for the target value wihout the use of schedules. The value has the units appropriate to the mode attribute.'"
	 * @generated
	 */
	float getTargetValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' attribute.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(float value);

	/**
	 * Returns the value of the '<em><b>Regulation Schedule</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.RegulationSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Schedule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Schedule</em>' reference list.
	 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl_RegulationSchedule()
	 * @see CIM.IEC61970.Wires.RegulationSchedule#getRegulatingControl
	 * @model opposite="RegulatingControl"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Schedule for this Regulating regulating control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Schedule for this Regulating regulating control.'"
	 * @generated
	 */
	EList<RegulationSchedule> getRegulationSchedule();

	/**
	 * Returns the value of the '<em><b>Discrete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete</em>' attribute.
	 * @see #setDiscrete(boolean)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRegulatingControl_Discrete()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The regulation is performed in a discrete mode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The regulation is performed in a discrete mode.'"
	 * @generated
	 */
	boolean isDiscrete();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RegulatingControl#isDiscrete <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete</em>' attribute.
	 * @see #isDiscrete()
	 * @generated
	 */
	void setDiscrete(boolean value);

} // RegulatingControl
