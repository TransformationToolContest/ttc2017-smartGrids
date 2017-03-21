/**
 */
package CIM.IEC61970.Meas;

import CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.ControlType#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Meas.MeasPackage#getControlType()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the type of Control, e.g. BreakerOn/Off, GeneratorVoltageSetPoint, TieLineFlow etc. The ControlType.name shall be unique among all specified types and describe the type. The ControlType.aliasName is meant to be used for localization.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Specifies the type of Control, e.g. BreakerOn/Off, GeneratorVoltageSetPoint, TieLineFlow etc. The ControlType.name shall be unique among all specified types and describe the type. The ControlType.aliasName is meant to be used for localization.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the type of Control, e.g. BreakerOn/Off, GeneratorVoltageSetPoint, TieLineFlow etc. The ControlType.name shall be unique among all specified types and describe the type. The ControlType.aliasName is meant to be used for localization.' Profile\040documentation='Specifies the type of Control, e.g. BreakerOn/Off, GeneratorVoltageSetPoint, TieLineFlow etc. The ControlType.name shall be unique among all specified types and describe the type. The ControlType.aliasName is meant to be used for localization.'"
 * @generated
 */
public interface ControlType extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Meas.Control}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.Control#getControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see CIM.IEC61970.Meas.MeasPackage#getControlType_Controls()
	 * @see CIM.IEC61970.Meas.Control#getControlType
	 * @model opposite="ControlType"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The Controls having the ControlType'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The Controls having the ControlType'"
	 * @generated
	 */
	EList<Control> getControls();

} // ControlType
