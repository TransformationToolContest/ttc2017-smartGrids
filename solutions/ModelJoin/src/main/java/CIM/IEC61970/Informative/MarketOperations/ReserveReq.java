/**
 */
package CIM.IEC61970.Informative.MarketOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserve Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ReserveReq#getSensitivityPriceCurve <em>Sensitivity Price Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ReserveReq#getReserveReqCurve <em>Reserve Req Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ReserveReq#getMarketProduct <em>Market Product</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getReserveReq()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Requirements for minimum amount of reserve and/or regulation to be supplied by a set of qualified resources.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Requirements for minimum amount of reserve and/or regulation to be supplied by a set of qualified resources.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Requirements for minimum amount of reserve and/or regulation to be supplied by a set of qualified resources.' Profile\040documentation='Requirements for minimum amount of reserve and/or regulation to be supplied by a set of qualified resources.'"
 * @generated
 */
public interface ReserveReq extends ResourceGroupReq {
	/**
	 * Returns the value of the '<em><b>Sensitivity Price Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve#getReserveReq <em>Reserve Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitivity Price Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitivity Price Curve</em>' reference.
	 * @see #setSensitivityPriceCurve(SensitivityPriceCurve)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getReserveReq_SensitivityPriceCurve()
	 * @see CIM.IEC61970.Informative.MarketOperations.SensitivityPriceCurve#getReserveReq
	 * @model opposite="ReserveReq"
	 * @generated
	 */
	SensitivityPriceCurve getSensitivityPriceCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ReserveReq#getSensitivityPriceCurve <em>Sensitivity Price Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitivity Price Curve</em>' reference.
	 * @see #getSensitivityPriceCurve()
	 * @generated
	 */
	void setSensitivityPriceCurve(SensitivityPriceCurve value);

	/**
	 * Returns the value of the '<em><b>Reserve Req Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve#getReserveReq <em>Reserve Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Req Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Req Curve</em>' reference.
	 * @see #setReserveReqCurve(ReserveReqCurve)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getReserveReq_ReserveReqCurve()
	 * @see CIM.IEC61970.Informative.MarketOperations.ReserveReqCurve#getReserveReq
	 * @model opposite="ReserveReq"
	 * @generated
	 */
	ReserveReqCurve getReserveReqCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ReserveReq#getReserveReqCurve <em>Reserve Req Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Req Curve</em>' reference.
	 * @see #getReserveReqCurve()
	 * @generated
	 */
	void setReserveReqCurve(ReserveReqCurve value);

	/**
	 * Returns the value of the '<em><b>Market Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketProduct#getReserveReqs <em>Reserve Reqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Product</em>' reference.
	 * @see #setMarketProduct(MarketProduct)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getReserveReq_MarketProduct()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketProduct#getReserveReqs
	 * @model opposite="ReserveReqs"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Market product associated with reserve requirement must be a reserve or regulation product.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Market product associated with reserve requirement must be a reserve or regulation product.'"
	 * @generated
	 */
	MarketProduct getMarketProduct();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ReserveReq#getMarketProduct <em>Market Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Product</em>' reference.
	 * @see #getMarketProduct()
	 * @generated
	 */
	void setMarketProduct(MarketProduct value);

} // ReserveReq
