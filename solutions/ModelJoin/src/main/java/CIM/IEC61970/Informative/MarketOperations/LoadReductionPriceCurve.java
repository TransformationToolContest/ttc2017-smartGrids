/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Reduction Price Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.LoadReductionPriceCurve#getLoadBids <em>Load Bids</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadReductionPriceCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is the price sensitivity that bidder expresses for allowing market load interruption.  Relationship between price (Y1-axis) vs. MW (X-axis).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='This is the price sensitivity that bidder expresses for allowing market load interruption.  Relationship between price (Y1-axis) vs. MW (X-axis).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the price sensitivity that bidder expresses for allowing market load interruption.  Relationship between price (Y1-axis) vs. MW (X-axis).' Profile\040documentation='This is the price sensitivity that bidder expresses for allowing market load interruption.  Relationship between price (Y1-axis) vs. MW (X-axis).'"
 * @generated
 */
public interface LoadReductionPriceCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Load Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.LoadBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.LoadBid#getLoadReductionPriceCurve <em>Load Reduction Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getLoadReductionPriceCurve_LoadBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.LoadBid#getLoadReductionPriceCurve
	 * @model opposite="LoadReductionPriceCurve"
	 * @generated
	 */
	EList<LoadBid> getLoadBids();

} // LoadReductionPriceCurve
