/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tailbay Loss Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getTailbayLossCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between tailbay head loss hight (y-axis) and the total discharge into the power station\'s tailbay volume per time unit (x-axis) . There could be more than one curve depending on the level of the tailbay reservoir or river level'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between tailbay head loss hight (y-axis) and the total discharge into the power station\'s tailbay volume per time unit (x-axis) . There could be more than one curve depending on the level of the tailbay reservoir or river level'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between tailbay head loss hight (y-axis) and the total discharge into the power station\'s tailbay volume per time unit (x-axis) . There could be more than one curve depending on the level of the tailbay reservoir or river level' Profile\040documentation='Relationship between tailbay head loss hight (y-axis) and the total discharge into the power station\'s tailbay volume per time unit (x-axis) . There could be more than one curve depending on the level of the tailbay reservoir or river level'"
 * @generated
 */
public interface TailbayLossCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Generating Unit</em>' reference.
	 * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getTailbayLossCurve_HydroGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve
	 * @model opposite="TailbayLossCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A hydro generating unit has a tailbay loss curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A hydro generating unit has a tailbay loss curve'"
	 * @generated
	 */
	HydroGeneratingUnit getHydroGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Generating Unit</em>' reference.
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	void setHydroGeneratingUnit(HydroGeneratingUnit value);

} // TailbayLossCurve
