/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heat Input Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between unit heat input in energy per time for main fuel (Y1-axis) and supplemental fuel (Y2-axis) versus unit output in active power (X-axis). The quantity of main fuel used to sustain generation at this output level is prorated for throttling between definition points. The quantity of supplemental fuel used at this output level is fixed and not prorated.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between unit heat input in energy per time for main fuel (Y1-axis) and supplemental fuel (Y2-axis) versus unit output in active power (X-axis). The quantity of main fuel used to sustain generation at this output level is prorated for throttling between definition points. The quantity of supplemental fuel used at this output level is fixed and not prorated.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between unit heat input in energy per time for main fuel (Y1-axis) and supplemental fuel (Y2-axis) versus unit output in active power (X-axis). The quantity of main fuel used to sustain generation at this output level is prorated for throttling between definition points. The quantity of supplemental fuel used at this output level is fixed and not prorated.' Profile\040documentation='Relationship between unit heat input in energy per time for main fuel (Y1-axis) and supplemental fuel (Y2-axis) versus unit output in active power (X-axis). The quantity of main fuel used to sustain generation at this output level is prorated for throttling between definition points. The quantity of supplemental fuel used at this output level is fixed and not prorated.'"
 * @generated
 */
public interface HeatInputCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Heat Input Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Input Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Input Offset</em>' attribute.
	 * @see #setHeatInputOffset(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve_HeatInputOffset()
	 * @model dataType="CIM.IEC61970.Generation.Production.HeatRate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Heat input - offset adjustment factor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Heat input - offset adjustment factor.'"
	 * @generated
	 */
	float getHeatInputOffset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Input Offset</em>' attribute.
	 * @see #getHeatInputOffset()
	 * @generated
	 */
	void setHeatInputOffset(float value);

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
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve_IsNetGrossP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag is set to true when output is expressed in net active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag is set to true when output is expressed in net active power'"
	 * @generated
	 */
	boolean isIsNetGrossP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Net Gross P</em>' attribute.
	 * @see #isIsNetGrossP()
	 * @generated
	 */
	void setIsNetGrossP(boolean value);

	/**
	 * Returns the value of the '<em><b>Heat Input Eff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Input Eff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Input Eff</em>' attribute.
	 * @see #setHeatInputEff(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve_HeatInputEff()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Heat input - efficiency multiplier adjustment factor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Heat input - efficiency multiplier adjustment factor.'"
	 * @generated
	 */
	float getHeatInputEff();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Input Eff</em>' attribute.
	 * @see #getHeatInputEff()
	 * @generated
	 */
	void setHeatInputEff(float value);

	/**
	 * Returns the value of the '<em><b>Aux Power Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Power Mult</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Power Mult</em>' attribute.
	 * @see #setAuxPowerMult(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve_AuxPowerMult()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Power output - auxiliary power multiplier adjustment factor.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Power output - auxiliary power multiplier adjustment factor.'"
	 * @generated
	 */
	float getAuxPowerMult();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Mult</em>' attribute.
	 * @see #getAuxPowerMult()
	 * @generated
	 */
	void setAuxPowerMult(float value);

	/**
	 * Returns the value of the '<em><b>Aux Power Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Power Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Power Offset</em>' attribute.
	 * @see #setAuxPowerOffset(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve_AuxPowerOffset()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Power output - auxiliary power offset adjustment factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Power output - auxiliary power offset adjustment factor'"
	 * @generated
	 */
	float getAuxPowerOffset();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Offset</em>' attribute.
	 * @see #getAuxPowerOffset()
	 * @generated
	 */
	void setAuxPowerOffset(float value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve_ThermalGeneratingUnit()
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve
	 * @model opposite="HeatInputCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have a heat input curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have a heat input curve'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

} // HeatInputCurve
