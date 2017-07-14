/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;

import gluemodel.CIM.IEC61970.Meas.Control;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulating Cond Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RegulatingCondEq#getControls <em>Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulatingCondEq()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A type of conducting equipment that can regulate a quanity (i.e. voltage or flow) at a specific point in the network.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A type of conducting equipment that can regulate a quanity (i.e. voltage or flow) at a specific point in the network.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A type of conducting equipment that can regulate a quanity (i.e. voltage or flow) at a specific point in the network.' Profile\040documentation='A type of conducting equipment that can regulate a quanity (i.e. voltage or flow) at a specific point in the network.'"
 * @generated
 */
public interface RegulatingCondEq extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Meas.Control}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.Control#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulatingCondEq_Controls()
	 * @see gluemodel.CIM.IEC61970.Meas.Control#getRegulatingCondEq
	 * @model opposite="RegulatingCondEq"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The controller outputs used to actually govern a regulating device, e.g. the magnetization of a synchronous machine or capacitor bank breaker actuator.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The controller outputs used to actually govern a regulating device, e.g. the magnetization of a synchronous machine or capacitor bank breaker actuator.'"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference.
	 * @see #setRegulatingControl(RegulatingControl)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRegulatingCondEq_RegulatingControl()
	 * @see gluemodel.CIM.IEC61970.Wires.RegulatingControl#getRegulatingCondEq
	 * @model opposite="RegulatingCondEq"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The regulating control scheme in which this equipment participates.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The regulating control scheme in which this equipment participates.'"
	 * @generated
	 */
	RegulatingControl getRegulatingControl();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulating Control</em>' reference.
	 * @see #getRegulatingControl()
	 * @generated
	 */
	void setRegulatingControl(RegulatingControl value);

} // RegulatingCondEq
