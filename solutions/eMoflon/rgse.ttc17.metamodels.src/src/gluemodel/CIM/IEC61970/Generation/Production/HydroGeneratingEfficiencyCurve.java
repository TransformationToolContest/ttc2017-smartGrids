/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Generating Efficiency Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingEfficiencyCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between unit efficiency in percent and unit output active power for a given net head in meters. The relationship between efficiency, discharge, head, and power output is expressed as follows:   E =KP/HQ\nWhere:  (E=percentage)  (P=active power)  (H=height)  (Q=volume/time unit)  (K=constant)\nFor example, a curve instance for a given net head could relate efficiency (Y-axis) versus active power output (X-axis) or versus discharge on the X-axis.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between unit efficiency in percent and unit output active power for a given net head in meters. The relationship between efficiency, discharge, head, and power output is expressed as follows:   E =KP/HQ\nWhere:  (E=percentage)  (P=active power)  (H=height)  (Q=volume/time unit)  (K=constant)\nFor example, a curve instance for a given net head could relate efficiency (Y-axis) versus active power output (X-axis) or versus discharge on the X-axis.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between unit efficiency in percent and unit output active power for a given net head in meters. The relationship between efficiency, discharge, head, and power output is expressed as follows:   E =KP/HQ\nWhere:  (E=percentage)  (P=active power)  (H=height)  (Q=volume/time unit)  (K=constant)\nFor example, a curve instance for a given net head could relate efficiency (Y-axis) versus active power output (X-axis) or versus discharge on the X-axis.' Profile\040documentation='Relationship between unit efficiency in percent and unit output active power for a given net head in meters. The relationship between efficiency, discharge, head, and power output is expressed as follows:   E =KP/HQ\nWhere:  (E=percentage)  (P=active power)  (H=height)  (Q=volume/time unit)  (K=constant)\nFor example, a curve instance for a given net head could relate efficiency (Y-axis) versus active power output (X-axis) or versus discharge on the X-axis.'"
 * @generated
 */
public interface HydroGeneratingEfficiencyCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Generating Unit</em>' reference.
	 * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingEfficiencyCurve_HydroGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves
	 * @model opposite="HydroGeneratingEfficiencyCurves"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A hydro generating unit has an efficiency curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A hydro generating unit has an efficiency curve'"
	 * @generated
	 */
	HydroGeneratingUnit getHydroGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Generating Unit</em>' reference.
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	void setHydroGeneratingUnit(HydroGeneratingUnit value);

} // HydroGeneratingEfficiencyCurve
