/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impedance Variation Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.ImpedanceVariationCurve#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getImpedanceVariationCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An Impedance Variation Curve describes the change in Transformer Winding impedance values in relationship to tap step changes.  The tap step is represented using the xValue, resistance using y1value, reactance using y2value, and magnetizing susceptance using y3value.\n\nThe resistance (r), reactance (x), and magnetizing susceptance (b) of the associated TransformerWinding define the impedance when the tap is at neutral step.  The curve values represent the change to the impedance from the neutral step values.  The impedance at a non-neutral step is calculated by adding the neutral step impedance (from the TransformerWinding) to the delta value from the curve.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An Impedance Variation Curve describes the change in Transformer Winding impedance values in relationship to tap step changes.  The tap step is represented using the xValue, resistance using y1value, reactance using y2value, and magnetizing susceptance using y3value.\n\nThe resistance (r), reactance (x), and magnetizing susceptance (b) of the associated TransformerWinding define the impedance when the tap is at neutral step.  The curve values represent the change to the impedance from the neutral step values.  The impedance at a non-neutral step is calculated by adding the neutral step impedance (from the TransformerWinding) to the delta value from the curve.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An Impedance Variation Curve describes the change in Transformer Winding impedance values in relationship to tap step changes.  The tap step is represented using the xValue, resistance using y1value, reactance using y2value, and magnetizing susceptance using y3value.\n\nThe resistance (r), reactance (x), and magnetizing susceptance (b) of the associated TransformerWinding define the impedance when the tap is at neutral step.  The curve values represent the change to the impedance from the neutral step values.  The impedance at a non-neutral step is calculated by adding the neutral step impedance (from the TransformerWinding) to the delta value from the curve.' Profile\040documentation='An Impedance Variation Curve describes the change in Transformer Winding impedance values in relationship to tap step changes.  The tap step is represented using the xValue, resistance using y1value, reactance using y2value, and magnetizing susceptance using y3value.\n\nThe resistance (r), reactance (x), and magnetizing susceptance (b) of the associated TransformerWinding define the impedance when the tap is at neutral step.  The curve values represent the change to the impedance from the neutral step values.  The impedance at a non-neutral step is calculated by adding the neutral step impedance (from the TransformerWinding) to the delta value from the curve.'"
 * @generated
 */
public interface ImpedanceVariationCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.TapChanger#getImpedanceVariationCurve <em>Impedance Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer</em>' reference.
	 * @see #setTapChanger(TapChanger)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getImpedanceVariationCurve_TapChanger()
	 * @see gluemodel.CIM.IEC61970.Wires.TapChanger#getImpedanceVariationCurve
	 * @model opposite="ImpedanceVariationCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An ImpedanceVariationCurve is defines impedance changes for a TapChanger.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An ImpedanceVariationCurve is defines impedance changes for a TapChanger.'"
	 * @generated
	 */
	TapChanger getTapChanger();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.ImpedanceVariationCurve#getTapChanger <em>Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Changer</em>' reference.
	 * @see #getTapChanger()
	 * @generated
	 */
	void setTapChanger(TapChanger value);

} // ImpedanceVariationCurve
