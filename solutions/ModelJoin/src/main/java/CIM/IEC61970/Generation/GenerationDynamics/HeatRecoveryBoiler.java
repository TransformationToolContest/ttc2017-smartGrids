/**
 */
package CIM.IEC61970.Generation.GenerationDynamics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heat Recovery Boiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHeatRecoveryBoiler()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The heat recovery system associated with combustion turbines in order to produce steam for combined cycle plants'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The heat recovery system associated with combustion turbines in order to produce steam for combined cycle plants'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The heat recovery system associated with combustion turbines in order to produce steam for combined cycle plants' Profile\040documentation='The heat recovery system associated with combustion turbines in order to produce steam for combined cycle plants'"
 * @generated
 */
public interface HeatRecoveryBoiler extends FossilSteamSupply {
	/**
	 * Returns the value of the '<em><b>Combustion Turbines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Turbines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Turbines</em>' reference list.
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHeatRecoveryBoiler_CombustionTurbines()
	 * @see CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler
	 * @model opposite="HeatRecoveryBoiler"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A combustion turbine may have a heat recovery boiler for making steam'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A combustion turbine may have a heat recovery boiler for making steam'"
	 * @generated
	 */
	EList<CombustionTurbine> getCombustionTurbines();

	/**
	 * Returns the value of the '<em><b>Steam Supply Rating2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Supply Rating2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Supply Rating2</em>' attribute.
	 * @see #setSteamSupplyRating2(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getHeatRecoveryBoiler_SteamSupplyRating2()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The steam supply rating in kilopounds per hour, if dual pressure boiler'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The steam supply rating in kilopounds per hour, if dual pressure boiler'"
	 * @generated
	 */
	float getSteamSupplyRating2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Supply Rating2</em>' attribute.
	 * @see #getSteamSupplyRating2()
	 * @generated
	 */
	void setSteamSupplyRating2(float value);

} // HeatRecoveryBoiler
