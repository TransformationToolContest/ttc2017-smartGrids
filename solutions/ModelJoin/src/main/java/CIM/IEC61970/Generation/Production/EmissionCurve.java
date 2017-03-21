/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emission Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.EmissionCurve#getEmissionContent <em>Emission Content</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.EmissionCurve#getEmissionType <em>Emission Type</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between the unit\'s emission rate in units of mass per hour (Y-axis) and output active power (X-axis) for a given type of emission. This curve applies when only one type of fuel is being burned.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between the unit\'s emission rate in units of mass per hour (Y-axis) and output active power (X-axis) for a given type of emission. This curve applies when only one type of fuel is being burned.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between the unit\'s emission rate in units of mass per hour (Y-axis) and output active power (X-axis) for a given type of emission. This curve applies when only one type of fuel is being burned.' Profile\040documentation='Relationship between the unit\'s emission rate in units of mass per hour (Y-axis) and output active power (X-axis) for a given type of emission. This curve applies when only one type of fuel is being burned.'"
 * @generated
 */
public interface EmissionCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Emission Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Content</em>' attribute.
	 * @see #setEmissionContent(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionCurve_EmissionContent()
	 * @model dataType="CIM.IEC61970.Generation.Production.Emission" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The emission content per quantity of fuel burned'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The emission content per quantity of fuel burned'"
	 * @generated
	 */
	float getEmissionContent();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.EmissionCurve#getEmissionContent <em>Emission Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Content</em>' attribute.
	 * @see #getEmissionContent()
	 * @generated
	 */
	void setEmissionContent(float value);

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
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionCurve_IsNetGrossP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag is set to true when output is expressed in net active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag is set to true when output is expressed in net active power'"
	 * @generated
	 */
	boolean isIsNetGrossP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Net Gross P</em>' attribute.
	 * @see #isIsNetGrossP()
	 * @generated
	 */
	void setIsNetGrossP(boolean value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionCurve_ThermalGeneratingUnit()
	 * @see CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves
	 * @model opposite="EmissionCurves"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have  one or more emission curves'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have  one or more emission curves'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Emission Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Generation.Production.EmissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.EmissionType
	 * @see #setEmissionType(EmissionType)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionCurve_EmissionType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of emission, which also gives the production rate measurement unit. The y1AxisUnits of the curve contains the unit of measure (e.g. kg) and the emissionType is the type of emission (e.g. sulfer dioxide).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of emission, which also gives the production rate measurement unit. The y1AxisUnits of the curve contains the unit of measure (e.g. kg) and the emissionType is the type of emission (e.g. sulfer dioxide).'"
	 * @generated
	 */
	EmissionType getEmissionType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.EmissionCurve#getEmissionType <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.EmissionType
	 * @see #getEmissionType()
	 * @generated
	 */
	void setEmissionType(EmissionType value);

} // EmissionCurve
