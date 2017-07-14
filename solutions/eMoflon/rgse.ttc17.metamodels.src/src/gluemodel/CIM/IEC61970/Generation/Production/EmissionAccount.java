/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emission Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.EmissionAccount#getEmissionType <em>Emission Type</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionAccount()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Accounts for tracking emissions usage and credits for thermal generating units. A unit may have zero or more emission accounts, and will typically have one for tracking usage and one for tracking credits.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Accounts for tracking emissions usage and credits for thermal generating units. A unit may have zero or more emission accounts, and will typically have one for tracking usage and one for tracking credits.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Accounts for tracking emissions usage and credits for thermal generating units. A unit may have zero or more emission accounts, and will typically have one for tracking usage and one for tracking credits.' Profile\040documentation='Accounts for tracking emissions usage and credits for thermal generating units. A unit may have zero or more emission accounts, and will typically have one for tracking usage and one for tracking credits.'"
 * @generated
 */
public interface EmissionAccount extends Curve {
	/**
	 * Returns the value of the '<em><b>Emission Value Source</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.EmissionValueSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Value Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Value Source</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.EmissionValueSource
	 * @see #setEmissionValueSource(EmissionValueSource)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionAccount_EmissionValueSource()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The source of the emission value.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The source of the emission value.'"
	 * @generated
	 */
	EmissionValueSource getEmissionValueSource();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Value Source</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.EmissionValueSource
	 * @see #getEmissionValueSource()
	 * @generated
	 */
	void setEmissionValueSource(EmissionValueSource value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionAccount_ThermalGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts
	 * @model opposite="EmmissionAccounts"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have one or more emission allowance accounts'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have one or more emission allowance accounts'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Emission Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.EmissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.EmissionType
	 * @see #setEmissionType(EmissionType)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getEmissionAccount_EmissionType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of emission, for example sulfur dioxide (SO2). The y1AxisUnits of the curve contains the unit of measure (e.g. kg) and the emissionType is the type of emission (e.g. sulfer dioxide).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of emission, for example sulfur dioxide (SO2). The y1AxisUnits of the curve contains the unit of measure (e.g. kg) and the emissionType is the type of emission (e.g. sulfer dioxide).'"
	 * @generated
	 */
	EmissionType getEmissionType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.EmissionAccount#getEmissionType <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.EmissionType
	 * @see #getEmissionType()
	 * @generated
	 */
	void setEmissionType(EmissionType value);

} // EmissionAccount
