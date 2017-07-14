/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Constraints Clearing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getMwLimit <em>Mw Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getMwFlow <em>Mw Flow</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getShadowPrice <em>Shadow Price</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintsClearing()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Binding security constrained clearing results posted for a given settlement period.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Binding security constrained clearing results posted for a given settlement period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Binding security constrained clearing results posted for a given settlement period.' Profile\040documentation='Binding security constrained clearing results posted for a given settlement period.'"
 * @generated
 */
public interface SecurityConstraintsClearing extends MarketFactors {
	/**
	 * Returns the value of the '<em><b>Mw Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mw Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mw Limit</em>' attribute.
	 * @see #setMwLimit(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintsClearing_MwLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Binding MW limit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Binding MW limit.'"
	 * @generated
	 */
	float getMwLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getMwLimit <em>Mw Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mw Limit</em>' attribute.
	 * @see #getMwLimit()
	 * @generated
	 */
	void setMwLimit(float value);

	/**
	 * Returns the value of the '<em><b>Mw Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mw Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mw Flow</em>' attribute.
	 * @see #setMwFlow(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintsClearing_MwFlow()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Optimal MW flow'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Optimal MW flow'"
	 * @generated
	 */
	float getMwFlow();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getMwFlow <em>Mw Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mw Flow</em>' attribute.
	 * @see #getMwFlow()
	 * @generated
	 */
	void setMwFlow(float value);

	/**
	 * Returns the value of the '<em><b>Shadow Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Price</em>' attribute.
	 * @see #setShadowPrice(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getSecurityConstraintsClearing_ShadowPrice()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Security constraint shadow price.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Security constraint shadow price.'"
	 * @generated
	 */
	float getShadowPrice();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.SecurityConstraintsClearing#getShadowPrice <em>Shadow Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Price</em>' attribute.
	 * @see #getShadowPrice()
	 * @generated
	 */
	void setShadowPrice(float value);

} // SecurityConstraintsClearing
