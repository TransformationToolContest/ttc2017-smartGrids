/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Bid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getBid <em>Bid</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getProductBidClearing <em>Product Bid Clearing</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getBidPriceCurve <em>Bid Price Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getMarketProduct <em>Market Product</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getProductBid()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Component of a bid that pertains to one market product.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Component of a bid that pertains to one market product.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Component of a bid that pertains to one market product.' Profile\040documentation='Component of a bid that pertains to one market product.'"
 * @generated
 */
public interface ProductBid extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Bid</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Bid#getProductBids <em>Product Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid</em>' reference.
	 * @see #setBid(Bid)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getProductBid_Bid()
	 * @see CIM.IEC61970.Informative.MarketOperations.Bid#getProductBids
	 * @model opposite="ProductBids"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A bid comprises one or more product bids of market products'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A bid comprises one or more product bids of market products'"
	 * @generated
	 */
	Bid getBid();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getBid <em>Bid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid</em>' reference.
	 * @see #getBid()
	 * @generated
	 */
	void setBid(Bid value);

	/**
	 * Returns the value of the '<em><b>Product Bid Clearing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getProductBids <em>Product Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bid Clearing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bid Clearing</em>' reference.
	 * @see #setProductBidClearing(ProductBidClearing)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getProductBid_ProductBidClearing()
	 * @see CIM.IEC61970.Informative.MarketOperations.ProductBidClearing#getProductBids
	 * @model opposite="ProductBids"
	 * @generated
	 */
	ProductBidClearing getProductBidClearing();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getProductBidClearing <em>Product Bid Clearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Bid Clearing</em>' reference.
	 * @see #getProductBidClearing()
	 * @generated
	 */
	void setProductBidClearing(ProductBidClearing value);

	/**
	 * Returns the value of the '<em><b>Bid Price Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.BidPriceCurve#getProductBids <em>Product Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid Price Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid Price Curve</em>' reference.
	 * @see #setBidPriceCurve(BidPriceCurve)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getProductBid_BidPriceCurve()
	 * @see CIM.IEC61970.Informative.MarketOperations.BidPriceCurve#getProductBids
	 * @model opposite="ProductBids"
	 * @generated
	 */
	BidPriceCurve getBidPriceCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getBidPriceCurve <em>Bid Price Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid Price Curve</em>' reference.
	 * @see #getBidPriceCurve()
	 * @generated
	 */
	void setBidPriceCurve(BidPriceCurve value);

	/**
	 * Returns the value of the '<em><b>Market Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.MarketProduct#getProductBids <em>Product Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Product</em>' reference.
	 * @see #setMarketProduct(MarketProduct)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getProductBid_MarketProduct()
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketProduct#getProductBids
	 * @model opposite="ProductBids"
	 * @generated
	 */
	MarketProduct getMarketProduct();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getMarketProduct <em>Market Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Product</em>' reference.
	 * @see #getMarketProduct()
	 * @generated
	 */
	void setMarketProduct(MarketProduct value);

} // ProductBid
