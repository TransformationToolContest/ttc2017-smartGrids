/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bid Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.BidSet#getGeneratingBids <em>Generating Bids</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidSet()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='As set of mutually exclusive bids for which a maximum of one may be scheduled.\nOf these generating bids, only one generating bid can be scheduled at a time.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='As set of mutually exclusive bids for which a maximum of one may be scheduled.\nOf these generating bids, only one generating bid can be scheduled at a time.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='As set of mutually exclusive bids for which a maximum of one may be scheduled.\nOf these generating bids, only one generating bid can be scheduled at a time.' Profile\040documentation='As set of mutually exclusive bids for which a maximum of one may be scheduled.\nOf these generating bids, only one generating bid can be scheduled at a time.'"
 * @generated
 */
public interface BidSet extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Generating Bids</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getBidSet <em>Bid Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Bids</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getBidSet_GeneratingBids()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getBidSet
	 * @model opposite="BidSet"
	 * @generated
	 */
	EList<GeneratingBid> getGeneratingBids();

} // BidSet
