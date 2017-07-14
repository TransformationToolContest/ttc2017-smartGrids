/**
 */
package gluemodel.CIM.IEC61970.Informative.MarketOperations;

import gluemodel.CIM.IEC61970.Core.Curve;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ramp Rate Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getRampRateType <em>Ramp Rate Type</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRampRateCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Ramp rate as a function of resource MW output'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Ramp rate as a function of resource MW output'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Ramp rate as a function of resource MW output' Profile\040documentation='Ramp rate as a function of resource MW output'"
 * @generated
 */
public interface RampRateCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRampRateCurves <em>Ramp Rate Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRampRateCurve_GeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getRampRateCurves
	 * @model opposite="RampRateCurves"
	 * @generated
	 */
	EList<RegisteredGenerator> getGeneratingUnit();

	/**
	 * Returns the value of the '<em><b>Ramp Rate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Rate Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Rate Type</em>' attribute.
	 * @see #setRampRateType(String)
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage#getRampRateCurve_RampRateType()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='How ramp rate is applied (e.g., raise or lower, as when applied to a generation resource)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='How ramp rate is applied (e.g., raise or lower, as when applied to a generation resource)'"
	 * @generated
	 */
	String getRampRateType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RampRateCurve#getRampRateType <em>Ramp Rate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Rate Type</em>' attribute.
	 * @see #getRampRateType()
	 * @generated
	 */
	void setRampRateType(String value);

} // RampRateCurve
