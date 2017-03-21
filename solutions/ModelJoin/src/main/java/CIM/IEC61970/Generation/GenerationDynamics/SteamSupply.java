/**
 */
package CIM.IEC61970.Generation.GenerationDynamics;

import CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamSupply()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Steam supply for steam turbine'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Steam supply for steam turbine'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Steam supply for steam turbine' Profile\040documentation='Steam supply for steam turbine'"
 * @generated
 */
public interface SteamSupply extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Steam Turbines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Turbines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Turbines</em>' reference list.
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamSupply_SteamTurbines()
	 * @see CIM.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamSupplys
	 * @model opposite="SteamSupplys"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Steam turbines may have steam supplied by a steam supply'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Steam turbines may have steam supplied by a steam supply'"
	 * @generated
	 */
	EList<SteamTurbine> getSteamTurbines();

	/**
	 * Returns the value of the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Supply Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Supply Rating</em>' attribute.
	 * @see #setSteamSupplyRating(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getSteamSupply_SteamSupplyRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rating of steam supply'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rating of steam supply'"
	 * @generated
	 */
	float getSteamSupplyRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Supply Rating</em>' attribute.
	 * @see #getSteamSupplyRating()
	 * @generated
	 */
	void setSteamSupplyRating(float value);

} // SteamSupply
