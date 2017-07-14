/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heat Rate Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HeatRateCurve#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHeatRateCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between unit heat rate per active power (Y-axis) and  unit output (X-axis). The heat input is from all fuels.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between unit heat rate per active power (Y-axis) and  unit output (X-axis). The heat input is from all fuels.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between unit heat rate per active power (Y-axis) and  unit output (X-axis). The heat input is from all fuels.' Profile\040documentation='Relationship between unit heat rate per active power (Y-axis) and  unit output (X-axis). The heat input is from all fuels.'"
 * @generated
 */
public interface HeatRateCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHeatRateCurve_ThermalGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve
	 * @model opposite="HeatRateCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have a heat rate curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have a heat rate curve'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Net Gross P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Net Gross P</em>' attribute.
	 * @see #setIsNetGrossP(boolean)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHeatRateCurve_IsNetGrossP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag is set to true when output is expressed in net active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag is set to true when output is expressed in net active power'"
	 * @generated
	 */
	boolean isIsNetGrossP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.HeatRateCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Net Gross P</em>' attribute.
	 * @see #isIsNetGrossP()
	 * @generated
	 */
	void setIsNetGrossP(boolean value);

} // HeatRateCurve
