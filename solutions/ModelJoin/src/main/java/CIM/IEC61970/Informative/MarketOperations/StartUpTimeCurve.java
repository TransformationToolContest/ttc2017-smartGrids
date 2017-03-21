/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Up Time Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.StartUpTimeCurve#getGeneratingBids <em>Generating Bids</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getStartUpTimeCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Startup time curve as a function of down time, where time is specified in seconds.  Relationship between unit startup time (Y1-axis) vs. unit elapsed down time (X-axis).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Startup time curve as a function of down time, where time is specified in seconds.  Relationship between unit startup time (Y1-axis) vs. unit elapsed down time (X-axis).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Startup time curve as a function of down time, where time is specified in seconds.  Relationship between unit startup time (Y1-axis) vs. unit elapsed down time (X-axis).' Profile\040documentation='Startup time curve as a function of down time, where time is specified in seconds.  Relationship between unit startup time (Y1-axis) vs. unit elapsed down time (X-axis).'"
 * @generated
 */
public interface StartUpTimeCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Generating Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpTimeCurve <em>Start Up Time Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getStartUpTimeCurve_GeneratingBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpTimeCurve
	 * @model opposite="StartUpTimeCurve"
	 * @generated
	 */
	EList<GeneratingBid> getGeneratingBids();

} // StartUpTimeCurve
