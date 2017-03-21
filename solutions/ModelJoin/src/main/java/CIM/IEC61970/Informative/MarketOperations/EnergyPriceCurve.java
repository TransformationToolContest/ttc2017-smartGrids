/**
 */
package CIM.IEC61970.Informative.MarketOperations;

import CIM.IEC61970.Core.Curve;

import CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Price Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getFTRs <em>FT Rs</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.MarketOperations.EnergyPriceCurve#getEnergyTransactions <em>Energy Transactions</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getEnergyPriceCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between a price in $/hour (Y-axis) and a MW value (X-axis).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between a price in $/hour (Y-axis) and a MW value (X-axis).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between a price in $/hour (Y-axis) and a MW value (X-axis).' Profile\040documentation='Relationship between a price in $/hour (Y-axis) and a MW value (X-axis).'"
 * @generated
 */
public interface EnergyPriceCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>FT Rs</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.MarketOperations.FTR}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.MarketOperations.FTR#getEnergyPriceCurve <em>Energy Price Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FT Rs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FT Rs</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getEnergyPriceCurve_FTRs()
	 * @see CIM.IEC61970.Informative.MarketOperations.FTR#getEnergyPriceCurve
	 * @model opposite="EnergyPriceCurve"
	 * @generated
	 */
	EList<FTR> getFTRs();

	/**
	 * Returns the value of the '<em><b>Energy Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyPriceCurves <em>Energy Price Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Transactions</em>' reference list.
	 * @see CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getEnergyPriceCurve_EnergyTransactions()
	 * @see CIM.IEC61970.Informative.EnergyScheduling.EnergyTransaction#getEnergyPriceCurves
	 * @model opposite="EnergyPriceCurves"
	 * @generated
	 */
	EList<EnergyTransaction> getEnergyTransactions();

} // EnergyPriceCurve
