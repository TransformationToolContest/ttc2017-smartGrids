/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio Variation Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RatioVariationCurve#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRatioVariationCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A Ratio Variation Curve describes the change in tap ratio in relationship to tap step changes.  The tap step is represented using the xValue and the ratio using y1value.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A Ratio Variation Curve describes the change in tap ratio in relationship to tap step changes.  The tap step is represented using the xValue and the ratio using y1value.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Ratio Variation Curve describes the change in tap ratio in relationship to tap step changes.  The tap step is represented using the xValue and the ratio using y1value.' Profile\040documentation='A Ratio Variation Curve describes the change in tap ratio in relationship to tap step changes.  The tap step is represented using the xValue and the ratio using y1value.'"
 * @generated
 */
public interface RatioVariationCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getRatioVariationCurve <em>Ratio Variation Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Tap Changer</em>' reference.
	 * @see #setRatioTapChanger(RatioTapChanger)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRatioVariationCurve_RatioTapChanger()
	 * @see gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getRatioVariationCurve
	 * @model opposite="RatioVariationCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A RatioVariationCurve defines tap ratio changes for a RatioTapChanger.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A RatioVariationCurve defines tap ratio changes for a RatioTapChanger.'"
	 * @generated
	 */
	RatioTapChanger getRatioTapChanger();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RatioVariationCurve#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Tap Changer</em>' reference.
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	void setRatioTapChanger(RatioTapChanger value);

} // RatioVariationCurve
