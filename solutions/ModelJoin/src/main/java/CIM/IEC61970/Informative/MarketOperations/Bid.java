/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61968.Common.Document;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Bid#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Bid#getMarketType <em>Market Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Bid#getProductBids <em>Product Bids</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Bid#getBidClearing <em>Bid Clearing</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Bid#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.Bid#getMarket <em>Market</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBid()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Represents both bids to purchase and offers to sell energy or ancillary services in an RTO-sponsored market.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Represents both bids to purchase and offers to sell energy or ancillary services in an RTO-sponsored market.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Represents both bids to purchase and offers to sell energy or ancillary services in an RTO-sponsored market.' Profile\040documentation='Represents both bids to purchase and offers to sell energy or ancillary services in an RTO-sponsored market.'"
 * @generated
 */
public interface Bid extends Document {
	/**
	 * Returns the value of the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Time</em>' attribute.
	 * @see #setStopTime(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBid_StopTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Stop time and date for which bid is applicable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Stop time and date for which bid is applicable.'"
	 * @generated
	 */
	Date getStopTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Bid#getStopTime <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Time</em>' attribute.
	 * @see #getStopTime()
	 * @generated
	 */
	void setStopTime(Date value);

	/**
	 * Returns the value of the '<em><b>Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Type</em>' attribute.
	 * @see #setMarketType(String)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBid_MarketType()
	 * @model required="true"
	 * @generated
	 */
	String getMarketType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Bid#getMarketType <em>Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Type</em>' attribute.
	 * @see #getMarketType()
	 * @generated
	 */
	void setMarketType(String value);

	/**
	 * Returns the value of the '<em><b>Product Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.ProductBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.ProductBid#getBid <em>Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBid_ProductBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.ProductBid#getBid
	 * @model opposite="Bid"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A bid comprises one or more product bids of market products'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A bid comprises one or more product bids of market products'"
	 * @generated
	 */
	EList<ProductBid> getProductBids();

	/**
	 * Returns the value of the '<em><b>Bid Clearing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.BidClearing#getBid <em>Bid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid Clearing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid Clearing</em>' reference.
	 * @see #setBidClearing(BidClearing)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBid_BidClearing()
	 * @see CIM.IEC61970.Informative.MarketOperations.BidClearing#getBid
	 * @model opposite="Bid"
	 * @generated
	 */
	BidClearing getBidClearing();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Bid#getBidClearing <em>Bid Clearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid Clearing</em>' reference.
	 * @see #getBidClearing()
	 * @generated
	 */
	void setBidClearing(BidClearing value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBid_StartTime()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Start time and date for which bid applies.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Start time and date for which bid applies.'"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Bid#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Market</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.Market#getBids <em>Bids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market</em>' reference.
	 * @see #setMarket(Market)
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBid_Market()
	 * @see CIM.IEC61970.Informative.MarketOperations.Market#getBids
	 * @model opposite="Bids"
	 * @generated
	 */
	Market getMarket();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.MarketOperations.Bid#getMarket <em>Market</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market</em>' reference.
	 * @see #getMarket()
	 * @generated
	 */
	void setMarket(Market value);

} // Bid
