/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incremental Heat Rate Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getIncrementalHeatRateCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between unit incremental heat rate in (delta energy/time) per (delta active power) and unit output in active power. The IHR curve represents the slope of the HeatInputCurve. Note that the \"incremental heat rate\" and the \"heat rate\" have the same engineering units.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between unit incremental heat rate in (delta energy/time) per (delta active power) and unit output in active power. The IHR curve represents the slope of the HeatInputCurve. Note that the \"incremental heat rate\" and the \"heat rate\" have the same engineering units.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between unit incremental heat rate in (delta energy/time) per (delta active power) and unit output in active power. The IHR curve represents the slope of the HeatInputCurve. Note that the \"incremental heat rate\" and the \"heat rate\" have the same engineering units.' Profile\040documentation='Relationship between unit incremental heat rate in (delta energy/time) per (delta active power) and unit output in active power. The IHR curve represents the slope of the HeatInputCurve. Note that the \"incremental heat rate\" and the \"heat rate\" have the same engineering units.'"
 * @generated
 */
public interface IncrementalHeatRateCurve extends Curve {
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
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getIncrementalHeatRateCurve_IsNetGrossP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag is set to true when output is expressed in net active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag is set to true when output is expressed in net active power'"
	 * @generated
	 */
	boolean isIsNetGrossP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Net Gross P</em>' attribute.
	 * @see #isIsNetGrossP()
	 * @generated
	 */
	void setIsNetGrossP(boolean value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getIncrementalHeatRateCurve_ThermalGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve
	 * @model opposite="IncrementalHeatRateCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have an incremental heat rate curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have an incremental heat rate curve'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

} // IncrementalHeatRateCurve
