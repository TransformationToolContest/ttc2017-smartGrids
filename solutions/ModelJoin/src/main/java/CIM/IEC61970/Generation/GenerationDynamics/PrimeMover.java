/**
 */
package CIM.IEC61970.Generation.GenerationDynamics;

import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Wires.SynchronousMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prime Mover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPrimeMover()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The machine used to develop mechanical energy used to drive a generator.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The machine used to develop mechanical energy used to drive a generator.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The machine used to develop mechanical energy used to drive a generator.' Profile\040documentation='The machine used to develop mechanical energy used to drive a generator.'"
 * @generated
 */
public interface PrimeMover extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Prime Mover Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prime Mover Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prime Mover Rating</em>' attribute.
	 * @see #setPrimeMoverRating(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPrimeMover_PrimeMoverRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rating of prime mover'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rating of prime mover'"
	 * @generated
	 */
	float getPrimeMoverRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Mover Rating</em>' attribute.
	 * @see #getPrimeMoverRating()
	 * @generated
	 */
	void setPrimeMoverRating(float value);

	/**
	 * Returns the value of the '<em><b>Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Machines</em>' reference list.
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getPrimeMover_SynchronousMachines()
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getPrimeMovers
	 * @model opposite="PrimeMovers"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Synchronous machines this Prime mover drives.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Synchronous machines this Prime mover drives.'"
	 * @generated
	 */
	EList<SynchronousMachine> getSynchronousMachines();

} // PrimeMover
