/**
 */
package CIM.IEC61970.Informative.MarketOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ancillary Service Clearing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMcp <em>Mcp</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getClearedMW <em>Cleared MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMarketCaseClearing <em>Market Case Clearing</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getCommodityType <em>Commodity Type</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getAncillaryServiceClearing()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ancillary services clearing results are posted for a given settlement period.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Ancillary services clearing results are posted for a given settlement period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ancillary services clearing results are posted for a given settlement period.' Profile\040documentation='Ancillary services clearing results are posted for a given settlement period.'"
 * @generated
 */
public interface AncillaryServiceClearing extends MarketFactors {
	/**
	 * Returns the value of the '<em><b>Mcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mcp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcp</em>' attribute.
	 * @see #setMcp(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getAncillaryServiceClearing_Mcp()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Market clearing price (MCP) in monetary units.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Market clearing price (MCP) in monetary units.'"
	 * @generated
	 */
	float getMcp();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMcp <em>Mcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcp</em>' attribute.
	 * @see #getMcp()
	 * @generated
	 */
	void setMcp(float value);

	/**
	 * Returns the value of the '<em><b>Cleared MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cleared MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleared MW</em>' attribute.
	 * @see #setClearedMW(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getAncillaryServiceClearing_ClearedMW()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cleared MWs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cleared MWs.'"
	 * @generated
	 */
	float getClearedMW();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getClearedMW <em>Cleared MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleared MW</em>' attribute.
	 * @see #getClearedMW()
	 * @generated
	 */
	void setClearedMW(float value);

	/**
	 * Returns the value of the '<em><b>Market Case Clearing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getAncillaryServiceClearing <em>Ancillary Service Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Case Clearing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Case Clearing</em>' reference.
	 * @see #setMarketCaseClearing(MarketCaseClearing)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getAncillaryServiceClearing_MarketCaseClearing()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketCaseClearing#getAncillaryServiceClearing
	 * @model opposite="AncillaryServiceClearing"
	 * @generated
	 */
	MarketCaseClearing getMarketCaseClearing();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getMarketCaseClearing <em>Market Case Clearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Case Clearing</em>' reference.
	 * @see #getMarketCaseClearing()
	 * @generated
	 */
	void setMarketCaseClearing(MarketCaseClearing value);

	/**
	 * Returns the value of the '<em><b>Commodity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commodity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commodity Type</em>' attribute.
	 * @see #setCommodityType(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getAncillaryServiceClearing_CommodityType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Requirement type:\n \'En\' - Energy\n \'Ru\' - Regulation Up\n \'Rd\' - Regulation Dn\n \'Sr\' - Spinning Reserve\n \'Nr\' - Non-Spinning Reserve\n \'Or\' - Operating Reserve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Requirement type:\n \'En\' - Energy\n \'Ru\' - Regulation Up\n \'Rd\' - Regulation Dn\n \'Sr\' - Spinning Reserve\n \'Nr\' - Non-Spinning Reserve\n \'Or\' - Operating Reserve'"
	 * @generated
	 */
	String getCommodityType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.AncillaryServiceClearing#getCommodityType <em>Commodity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity Type</em>' attribute.
	 * @see #getCommodityType()
	 * @generated
	 */
	void setCommodityType(String value);

} // AncillaryServiceClearing
