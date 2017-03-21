/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Up Cost Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getGeneratingBids <em>Generating Bids</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.StartUpCostCurve#getRegisteredGenerators <em>Registered Generators</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getStartUpCostCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Startup costs and time as a function of down time.  Relationship between unit startup cost (Y1-axis) and unit startup time (Y2-axis) vs. unit elapsed down time (X-axis).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Startup costs and time as a function of down time.  Relationship between unit startup cost (Y1-axis) and unit startup time (Y2-axis) vs. unit elapsed down time (X-axis).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Startup costs and time as a function of down time.  Relationship between unit startup cost (Y1-axis) and unit startup time (Y2-axis) vs. unit elapsed down time (X-axis).' Profile\040documentation='Startup costs and time as a function of down time.  Relationship between unit startup cost (Y1-axis) and unit startup time (Y2-axis) vs. unit elapsed down time (X-axis).'"
 * @generated
 */
public interface StartUpCostCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Generating Bids</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpCostCurve <em>Start Up Cost Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Bids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Bids</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getStartUpCostCurve_GeneratingBids()
	 * @see CIM.IEC61970.Informative.MarketOperations.GeneratingBid#getStartUpCostCurve
	 * @model opposite="StartUpCostCurve"
	 * @generated
	 */
	EList<GeneratingBid> getGeneratingBids();

	/**
	 * Returns the value of the '<em><b>Registered Generators</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getStartUpCostCurves <em>Start Up Cost Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Generators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Generators</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getStartUpCostCurve_RegisteredGenerators()
	 * @see CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getStartUpCostCurves
	 * @model opposite="StartUpCostCurves"
	 * @generated
	 */
	EList<RegisteredGenerator> getRegisteredGenerators();

} // StartUpCostCurve
