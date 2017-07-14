/**
 */
package gluemodel.CIM.IEC61970.Generation.GenerationDynamics;

import gluemodel.CIM.IEC61970.Core.Curve;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CT Temp Active Power Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCTTempActivePowerCurve()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relationship between the combustion turbine\'s power output rating in gross active power (X-axis) and the ambient air temperature (Y-axis)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Relationship between the combustion turbine\'s power output rating in gross active power (X-axis) and the ambient air temperature (Y-axis)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relationship between the combustion turbine\'s power output rating in gross active power (X-axis) and the ambient air temperature (Y-axis)' Profile\040documentation='Relationship between the combustion turbine\'s power output rating in gross active power (X-axis) and the ambient air temperature (Y-axis)'"
 * @generated
 */
public interface CTTempActivePowerCurve extends Curve {
	/**
	 * Returns the value of the '<em><b>Combustion Turbine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Turbine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Turbine</em>' reference.
	 * @see #setCombustionTurbine(CombustionTurbine)
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCTTempActivePowerCurve_CombustionTurbine()
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve
	 * @model opposite="CTTempActivePowerCurve"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A combustion turbine may have an active power versus ambient temperature relationship'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A combustion turbine may have an active power versus ambient temperature relationship'"
	 * @generated
	 */
	CombustionTurbine getCombustionTurbine();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combustion Turbine</em>' reference.
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	void setCombustionTurbine(CombustionTurbine value);

} // CTTempActivePowerCurve
