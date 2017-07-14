/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.Equipment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.CompositeSwitch#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getCompositeSwitch()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A model of a set of individual Switches normally enclosed within the same cabinet and possibly with interlocks that restrict the combination of switch positions. These are typically found in medium voltage distribution networks. \nA CompositeSwitch could represent a Ring-Main-Unit (RMU), or pad-mounted switchgear, with primitive internal devices such as an internal bus-bar plus 3 or 4 internal switches each of which may individually be open or closed. A CompositeSwitch and a set of contained Switches can also be used to represent a multi-position switch e.g. a switch that can connect a circuit to Ground, Open or Busbar.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A model of a set of individual Switches normally enclosed within the same cabinet and possibly with interlocks that restrict the combination of switch positions. These are typically found in medium voltage distribution networks. \nA CompositeSwitch could represent a Ring-Main-Unit (RMU), or pad-mounted switchgear, with primitive internal devices such as an internal bus-bar plus 3 or 4 internal switches each of which may individually be open or closed. A CompositeSwitch and a set of contained Switches can also be used to represent a multi-position switch e.g. a switch that can connect a circuit to Ground, Open or Busbar.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A model of a set of individual Switches normally enclosed within the same cabinet and possibly with interlocks that restrict the combination of switch positions. These are typically found in medium voltage distribution networks. \nA CompositeSwitch could represent a Ring-Main-Unit (RMU), or pad-mounted switchgear, with primitive internal devices such as an internal bus-bar plus 3 or 4 internal switches each of which may individually be open or closed. A CompositeSwitch and a set of contained Switches can also be used to represent a multi-position switch e.g. a switch that can connect a circuit to Ground, Open or Busbar.' Profile\040documentation='A model of a set of individual Switches normally enclosed within the same cabinet and possibly with interlocks that restrict the combination of switch positions. These are typically found in medium voltage distribution networks. \nA CompositeSwitch could represent a Ring-Main-Unit (RMU), or pad-mounted switchgear, with primitive internal devices such as an internal bus-bar plus 3 or 4 internal switches each of which may individually be open or closed. A CompositeSwitch and a set of contained Switches can also be used to represent a multi-position switch e.g. a switch that can connect a circuit to Ground, Open or Busbar.'"
 * @generated
 */
public interface CompositeSwitch extends Equipment {
	/**
	 * Returns the value of the '<em><b>Composite Switch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Switch Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Switch Type</em>' attribute.
	 * @see #setCompositeSwitchType(String)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getCompositeSwitch_CompositeSwitchType()
	 * @model dataType="gluemodel.CIM.IEC61970.Wires.CompositeSwitchType" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An alphanumeric code that can be used as a reference to extar information such as the description of the interlocking scheme if any'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An alphanumeric code that can be used as a reference to extar information such as the description of the interlocking scheme if any'"
	 * @generated
	 */
	String getCompositeSwitchType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Switch Type</em>' attribute.
	 * @see #getCompositeSwitchType()
	 * @generated
	 */
	void setCompositeSwitchType(String value);

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.Switch}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.Switch#getCompositeSwitch <em>Composite Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getCompositeSwitch_Switches()
	 * @see gluemodel.CIM.IEC61970.Wires.Switch#getCompositeSwitch
	 * @model opposite="CompositeSwitch"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Switches contained in this Composite switch.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Switches contained in this Composite switch.'"
	 * @generated
	 */
	EList<Switch> getSwitches();

} // CompositeSwitch
