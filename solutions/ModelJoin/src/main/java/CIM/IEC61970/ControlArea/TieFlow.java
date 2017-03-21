/**
 */
package CIM.IEC61970.ControlArea;

import CIM.Element;

import CIM.IEC61970.Core.Terminal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.ControlArea.TieFlow#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.TieFlow#getControlArea <em>Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getTieFlow()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A flow specification in terms of location and direction for a control area.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A flow specification in terms of location and direction for a control area.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A flow specification in terms of location and direction for a control area.' Profile\040documentation='A flow specification in terms of location and direction for a control area.'"
 * @generated
 */
public interface TieFlow extends Element {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Core.Terminal#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getTieFlow_Terminal()
	 * @see CIM.IEC61970.Core.Terminal#getTieFlow
	 * @model opposite="TieFlow"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The terminal to which this tie flow belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The terminal to which this tie flow belongs.'"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.TieFlow#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Alt Tie Meas</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.ControlArea.AltTieMeas}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.AltTieMeas#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Tie Meas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Tie Meas</em>' reference list.
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getTieFlow_AltTieMeas()
	 * @see CIM.IEC61970.ControlArea.AltTieMeas#getTieFlow
	 * @model opposite="TieFlow"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The primary and alternate tie flow measurements associated with the tie flow.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The primary and alternate tie flow measurements associated with the tie flow.'"
	 * @generated
	 */
	EList<AltTieMeas> getAltTieMeas();

	/**
	 * Returns the value of the '<em><b>Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.ControlArea#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area</em>' reference.
	 * @see #setControlArea(ControlArea)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getTieFlow_ControlArea()
	 * @see CIM.IEC61970.ControlArea.ControlArea#getTieFlow
	 * @model opposite="TieFlow"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The control area of the tie flows.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control area of the tie flows.'"
	 * @generated
	 */
	ControlArea getControlArea();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.TieFlow#getControlArea <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area</em>' reference.
	 * @see #getControlArea()
	 * @generated
	 */
	void setControlArea(ControlArea value);

	/**
	 * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Flow In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Flow In</em>' attribute.
	 * @see #setPositiveFlowIn(boolean)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getTieFlow_PositiveFlowIn()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The flow is positive into the terminal.  A flow is positive if it is an import into the control area.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The flow is positive into the terminal.  A flow is positive if it is an import into the control area.'"
	 * @generated
	 */
	boolean isPositiveFlowIn();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isPositiveFlowIn()
	 * @generated
	 */
	void setPositiveFlowIn(boolean value);

} // TieFlow
