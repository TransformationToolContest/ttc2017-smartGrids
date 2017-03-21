/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bid Clearing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getStartUpCost <em>Start Up Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getBid <em>Bid</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getNoLoadCost <em>No Load Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getLostOpCost <em>Lost Op Cost</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidClearing()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bid clearing results posted for a given settlement period.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Bid clearing results posted for a given settlement period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bid clearing results posted for a given settlement period.' Profile\040documentation='Bid clearing results posted for a given settlement period.'"
 * @generated
 */
public interface BidClearing extends Element {
	/**
	 * Returns the value of the '<em><b>Start Up Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Up Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Up Cost</em>' attribute.
	 * @see #setStartUpCost(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidClearing_StartUpCost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Start up cost in case of energy commodity in monetary units.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Start up cost in case of energy commodity in monetary units.'"
	 * @generated
	 */
	float getStartUpCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getStartUpCost <em>Start Up Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Up Cost</em>' attribute.
	 * @see #getStartUpCost()
	 * @generated
	 */
	void setStartUpCost(float value);

	/**
	 * Returns the value of the '<em><b>Bid</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Bid#getBidClearing <em>Bid Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid</em>' reference.
	 * @see #setBid(Bid)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidClearing_Bid()
	 * @see CIM.IEC61970.Informative.MarketOperations.Bid#getBidClearing
	 * @model opposite="BidClearing"
	 * @generated
	 */
	Bid getBid();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getBid <em>Bid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid</em>' reference.
	 * @see #getBid()
	 * @generated
	 */
	void setBid(Bid value);

	/**
	 * Returns the value of the '<em><b>No Load Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Load Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Load Cost</em>' attribute.
	 * @see #setNoLoadCost(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidClearing_NoLoadCost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='No-load cost in monetary units.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='No-load cost in monetary units.'"
	 * @generated
	 */
	float getNoLoadCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getNoLoadCost <em>No Load Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Load Cost</em>' attribute.
	 * @see #getNoLoadCost()
	 * @generated
	 */
	void setNoLoadCost(float value);

	/**
	 * Returns the value of the '<em><b>Lost Op Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lost Op Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lost Op Cost</em>' attribute.
	 * @see #setLostOpCost(float)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidClearing_LostOpCost()
	 * @model dataType="CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Energy lost opportunity cost in monetary units.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Energy lost opportunity cost in monetary units.'"
	 * @generated
	 */
	float getLostOpCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getLostOpCost <em>Lost Op Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lost Op Cost</em>' attribute.
	 * @see #getLostOpCost()
	 * @generated
	 */
	void setLostOpCost(float value);

} // BidClearing
