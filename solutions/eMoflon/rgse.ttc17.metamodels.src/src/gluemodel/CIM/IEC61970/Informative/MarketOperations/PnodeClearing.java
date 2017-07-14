/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pnode Clearing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getCongestLMP <em>Congest LMP</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getCostLMP <em>Cost LMP</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getLossLMP <em>Loss LMP</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getPnode <em>Pnode</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnodeClearing()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pricing node clearing results posted for a given settlement period.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Pricing node clearing results posted for a given settlement period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pricing node clearing results posted for a given settlement period.' Profile\040documentation='Pricing node clearing results posted for a given settlement period.'"
 * @generated
 */
public interface PnodeClearing extends MarketFactors {
	/**
	 * Returns the value of the '<em><b>Congest LMP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Congest LMP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Congest LMP</em>' attribute.
	 * @see #setCongestLMP(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnodeClearing_CongestLMP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CostPerEnergyUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Congestion component of Location Marginal Price (LMP) in monetary units per MW.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Congestion component of Location Marginal Price (LMP) in monetary units per MW.'"
	 * @generated
	 */
	float getCongestLMP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getCongestLMP <em>Congest LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Congest LMP</em>' attribute.
	 * @see #getCongestLMP()
	 * @generated
	 */
	void setCongestLMP(float value);

	/**
	 * Returns the value of the '<em><b>Cost LMP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost LMP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost LMP</em>' attribute.
	 * @see #setCostLMP(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnodeClearing_CostLMP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CostPerEnergyUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cost component of Locational Marginal Pricing (LMP) in monetary units per MW.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cost component of Locational Marginal Pricing (LMP) in monetary units per MW.'"
	 * @generated
	 */
	float getCostLMP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getCostLMP <em>Cost LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost LMP</em>' attribute.
	 * @see #getCostLMP()
	 * @generated
	 */
	void setCostLMP(float value);

	/**
	 * Returns the value of the '<em><b>Loss LMP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loss LMP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss LMP</em>' attribute.
	 * @see #setLossLMP(float)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnodeClearing_LossLMP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CostPerEnergyUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Loss component of Location Marginal Price (LMP) in monetary units per MW.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Loss component of Location Marginal Price (LMP) in monetary units per MW.'"
	 * @generated
	 */
	float getLossLMP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getLossLMP <em>Loss LMP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss LMP</em>' attribute.
	 * @see #getLossLMP()
	 * @generated
	 */
	void setLossLMP(float value);

	/**
	 * Returns the value of the '<em><b>Pnode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getPnodeClearing <em>Pnode Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnode</em>' reference.
	 * @see #setPnode(Pnode)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getPnodeClearing_Pnode()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode#getPnodeClearing
	 * @model opposite="PnodeClearing"
	 * @generated
	 */
	Pnode getPnode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.PnodeClearing#getPnode <em>Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pnode</em>' reference.
	 * @see #getPnode()
	 * @generated
	 */
	void setPnode(Pnode value);

} // PnodeClearing
