/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Time Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.NotificationTimeCurve#getGeneratingBids <em>Generating Bids</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getNotificationTimeCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Notification time curve as a function of down time.  Relationship between crew notification time (Y1-axis) and unit startup time (Y2-axis) vs. unit elapsed down time (X-axis).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Notification time curve as a function of down time.  Relationship between crew notification time (Y1-axis) and unit startup time (Y2-axis) vs. unit elapsed down time (X-axis).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Notification time curve as a function of down time.  Relationship between crew notification time (Y1-axis) and unit startup time (Y2-axis) vs. unit elapsed down time (X-axis).' Profile\040documentation='Notification time curve as a function of down time.  Relationship between crew notification time (Y1-axis) and unit startup time (Y2-axis) vs. unit elapsed down time (X-axis).'"
 * @generated
 */
public interface NotificationTimeCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Generating Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTimeCurve <em>Notification Time Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getNotificationTimeCurve_GeneratingBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getNotificationTimeCurve
	 * @model opposite="NotificationTimeCurve"
	 * @generated
	 */
	EList<GeneratingBid> getGeneratingBids();

} // NotificationTimeCurve
