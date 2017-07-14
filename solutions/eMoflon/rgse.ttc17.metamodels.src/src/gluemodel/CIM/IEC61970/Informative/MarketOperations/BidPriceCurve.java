/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bid Price Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidPriceCurve#getProductBids <em>Product Bids</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidPriceCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between unit operating price in $/hour (Y-axis) and unit output in MW (X-axis).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between unit operating price in $/hour (Y-axis) and unit output in MW (X-axis).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between unit operating price in $/hour (Y-axis) and unit output in MW (X-axis).' Profile\040documentation='Relationship between unit operating price in $/hour (Y-axis) and unit output in MW (X-axis).'"
 * @generated
 */
public interface BidPriceCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Product Bids</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getBidPriceCurve <em>Bid Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Bids</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidPriceCurve_ProductBids()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.ProductBid#getBidPriceCurve
	 * @model opposite="BidPriceCurve"
	 * @generated
	 */
	EList<ProductBid> getProductBids();

} // BidPriceCurve
