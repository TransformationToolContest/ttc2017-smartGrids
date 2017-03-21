/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Bid Clearing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getClearedMW <em>Cleared MW</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getProductBids <em>Product Bids</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getProductBidClearing()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Product Bid clearing results posted for a given settlement period.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Product Bid clearing results posted for a given settlement period.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Product Bid clearing results posted for a given settlement period.' Profile\040documentation='Product Bid clearing results posted for a given settlement period.'"
 * @generated
 */
public interface ProductBidClearing extends MarketFactors {
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
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getProductBidClearing_ClearedMW()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Cleared MWs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Cleared MWs.'"
	 * @generated
	 */
	float getClearedMW();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getClearedMW <em>Cleared MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleared MW</em>' attribute.
	 * @see #getClearedMW()
	 * @generated
	 */
	void setClearedMW(float value);

	/**
	 * Returns the value of the '<em><b>Product Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ProductBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getProductBidClearing <em>Product Bid Clearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getProductBidClearing_ProductBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.ProductBid#getProductBidClearing
	 * @model opposite="ProductBidClearing"
	 * @generated
	 */
	EList<ProductBid> getProductBids();

} // ProductBidClearing
