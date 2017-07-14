/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Op Cost Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpCostCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between unit operating cost (Y-axis) and unit output active power (X-axis). The operating cost curve for thermal units is derived from heat input and fuel costs. The operating cost curve for hydro units is derived from water flow rates and equivalent water costs.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between unit operating cost (Y-axis) and unit output active power (X-axis). The operating cost curve for thermal units is derived from heat input and fuel costs. The operating cost curve for hydro units is derived from water flow rates and equivalent water costs.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between unit operating cost (Y-axis) and unit output active power (X-axis). The operating cost curve for thermal units is derived from heat input and fuel costs. The operating cost curve for hydro units is derived from water flow rates and equivalent water costs.' Profile\040documentation='Relationship between unit operating cost (Y-axis) and unit output active power (X-axis). The operating cost curve for thermal units is derived from heat input and fuel costs. The operating cost curve for hydro units is derived from water flow rates and equivalent water costs.'"
 * @generated
 */
public interface GenUnitOpCostCurve extends Curve {
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
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpCostCurve_IsNetGrossP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag is set to true when output is expressed in net active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag is set to true when output is expressed in net active power'"
	 * @generated
	 */
	boolean isIsNetGrossP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Net Gross P</em>' attribute.
	 * @see #isIsNetGrossP()
	 * @generated
	 */
	void setIsNetGrossP(boolean value);

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpCostCurve_GeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpCostCurves
	 * @model opposite="GenUnitOpCostCurves"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generating unit may have one or more cost curves, depending upon fuel mixture and fuel cost.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit may have one or more cost curves, depending upon fuel mixture and fuel cost.'"
	 * @generated
	 */
	GeneratingUnit getGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	void setGeneratingUnit(GeneratingUnit value);

} // GenUnitOpCostCurve
