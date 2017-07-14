/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensitivity Price Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve#getReserveReq <em>Reserve Req</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSensitivityPriceCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Optionally, this curve expresses elasticity of the associated requirement.  For example, used to reduce requirements when clearing price exceeds reasonable values when the supply quantity becomes scarce.  For example, a single point value of $1000/MW for a spinning reserve will cause a reduction in the required spinning reserve. \nX axis is constrained quantity (e.g., MW)\nY1 axis is money per constrained quantity'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Optionally, this curve expresses elasticity of the associated requirement.  For example, used to reduce requirements when clearing price exceeds reasonable values when the supply quantity becomes scarce.  For example, a single point value of $1000/MW for a spinning reserve will cause a reduction in the required spinning reserve. \nX axis is constrained quantity (e.g., MW)\nY1 axis is money per constrained quantity'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Optionally, this curve expresses elasticity of the associated requirement.  For example, used to reduce requirements when clearing price exceeds reasonable values when the supply quantity becomes scarce.  For example, a single point value of $1000/MW for a spinning reserve will cause a reduction in the required spinning reserve. \nX axis is constrained quantity (e.g., MW)\nY1 axis is money per constrained quantity' Profile\040documentation='Optionally, this curve expresses elasticity of the associated requirement.  For example, used to reduce requirements when clearing price exceeds reasonable values when the supply quantity becomes scarce.  For example, a single point value of $1000/MW for a spinning reserve will cause a reduction in the required spinning reserve. \nX axis is constrained quantity (e.g., MW)\nY1 axis is money per constrained quantity'"
 * @generated
 */
public interface SensitivityPriceCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Reserve Req</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getSensitivityPriceCurve <em>Sensitivity Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Req</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Req</em>' reference.
	 * @see #setReserveReq(ReserveReq)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSensitivityPriceCurve_ReserveReq()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ReserveReq#getSensitivityPriceCurve
	 * @model opposite="SensitivityPriceCurve"
	 * @generated
	 */
	ReserveReq getReserveReq();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve#getReserveReq <em>Reserve Req</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Req</em>' reference.
	 * @see #getReserveReq()
	 * @generated
	 */
	void setReserveReq(ReserveReq value);

} // SensitivityPriceCurve
