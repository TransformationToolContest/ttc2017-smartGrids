/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getRatioVariationCurve <em>Ratio Variation Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getWinding <em>Winding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRatioTapChanger()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A tap changer that changes the voltage ratio impacting the voltage magnitude but not direclty the phase angle across the transformer..'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A tap changer that changes the voltage ratio impacting the voltage magnitude but not direclty the phase angle across the transformer..'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A tap changer that changes the voltage ratio impacting the voltage magnitude but not direclty the phase angle across the transformer..' Profile\040documentation='A tap changer that changes the voltage ratio impacting the voltage magnitude but not direclty the phase angle across the transformer..'"
 * @generated
 */
public interface RatioTapChanger extends TapChanger {
	/**
	 * Returns the value of the '<em><b>Ratio Variation Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.RatioVariationCurve#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Variation Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Variation Curve</em>' reference.
	 * @see #setRatioVariationCurve(RatioVariationCurve)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRatioTapChanger_RatioVariationCurve()
	 * @see gluemodel.CIM.IEC61970.Wires.RatioVariationCurve#getRatioTapChanger
	 * @model opposite="RatioTapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A RatioTapChanger can have an associated RatioVariationCurve to define tap ratio variations with tap step changes.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A RatioTapChanger can have an associated RatioVariationCurve to define tap ratio variations with tap step changes.'"
	 * @generated
	 */
	RatioVariationCurve getRatioVariationCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getRatioVariationCurve <em>Ratio Variation Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Variation Curve</em>' reference.
	 * @see #getRatioVariationCurve()
	 * @generated
	 */
	void setRatioVariationCurve(RatioVariationCurve value);

	/**
	 * Returns the value of the '<em><b>Transformer Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.TransformerWinding#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Winding</em>' reference.
	 * @see #setTransformerWinding(TransformerWinding)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRatioTapChanger_TransformerWinding()
	 * @see gluemodel.CIM.IEC61970.Wires.TransformerWinding#getRatioTapChanger
	 * @model opposite="RatioTapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The transformer winding to which the ratio tap changer belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The transformer winding to which the ratio tap changer belongs.'"
	 * @generated
	 */
	TransformerWinding getTransformerWinding();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getTransformerWinding <em>Transformer Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Winding</em>' reference.
	 * @see #getTransformerWinding()
	 * @generated
	 */
	void setTransformerWinding(TransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding</em>' reference.
	 * @see #setWinding(DistributionTransformerWinding)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRatioTapChanger_Winding()
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformerWinding#getRatioTapChanger
	 * @model opposite="RatioTapChanger"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Winding to which this ratio tap changer belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Winding to which this ratio tap changer belongs.'"
	 * @generated
	 */
	DistributionTransformerWinding getWinding();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getWinding <em>Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding</em>' reference.
	 * @see #getWinding()
	 * @generated
	 */
	void setWinding(DistributionTransformerWinding value);

	/**
	 * Returns the value of the '<em><b>Tcul Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Wires.TransformerControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcul Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcul Control Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.TransformerControlMode
	 * @see #setTculControlMode(TransformerControlMode)
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getRatioTapChanger_TculControlMode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Specifies the regulation control mode (voltage or reactive) of the RatioTapChanger.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Specifies the regulation control mode (voltage or reactive) of the RatioTapChanger.'"
	 * @generated
	 */
	TransformerControlMode getTculControlMode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Wires.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcul Control Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Wires.TransformerControlMode
	 * @see #getTculControlMode()
	 * @generated
	 */
	void setTculControlMode(TransformerControlMode value);

} // RatioTapChanger
