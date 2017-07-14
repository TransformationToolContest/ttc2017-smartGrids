/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Variation Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.PhaseVariationCurve#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPhaseVariationCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Phase Variation Curve describes the phase shift in relationship to tap step changes.  The tap step is represented using the xValue and the phase shift using y1value.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Phase Variation Curve describes the phase shift in relationship to tap step changes.  The tap step is represented using the xValue and the phase shift using y1value.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Phase Variation Curve describes the phase shift in relationship to tap step changes.  The tap step is represented using the xValue and the phase shift using y1value.' Profile\040documentation='A Phase Variation Curve describes the phase shift in relationship to tap step changes.  The tap step is represented using the xValue and the phase shift using y1value.'"
 * @generated
 */
public interface PhaseVariationCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Phase Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.PhaseTapChanger#getPhaseVariationCurve <em>Phase Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer</em>' reference.
	 * @see #setPhaseTapChanger(PhaseTapChanger)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getPhaseVariationCurve_PhaseTapChanger()
	 * @see gluemodel.CIM.IEC61970.Wires.PhaseTapChanger#getPhaseVariationCurve
	 * @model opposite="PhaseVariationCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A PhaseVariationCurve defines phase shift changes for a PhaseTapChanger.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A PhaseVariationCurve defines phase shift changes for a PhaseTapChanger.'"
	 * @generated
	 */
	PhaseTapChanger getPhaseTapChanger();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.PhaseVariationCurve#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Tap Changer</em>' reference.
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	void setPhaseTapChanger(PhaseTapChanger value);

} // PhaseVariationCurve
