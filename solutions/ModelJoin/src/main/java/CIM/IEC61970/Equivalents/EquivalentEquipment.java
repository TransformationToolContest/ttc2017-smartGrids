/**
 */
package CIM.IEC61970.Equivalents;

import CIM.IEC61970.Core.ConductingEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentEquipment()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of different types.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of different types.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of different types.' Profile\040documentation='The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of different types.'"
 * @generated
 */
public interface EquivalentEquipment extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Equivalent Network</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Equivalents.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Network</em>' reference.
	 * @see #setEquivalentNetwork(EquivalentNetwork)
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentEquipment_EquivalentNetwork()
	 * @see CIM.IEC61970.Equivalents.EquivalentNetwork#getEquivalentEquipments
	 * @model opposite="EquivalentEquipments"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The equivalent where the reduced model belongs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The equivalent where the reduced model belongs.'"
	 * @generated
	 */
	EquivalentNetwork getEquivalentNetwork();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent Network</em>' reference.
	 * @see #getEquivalentNetwork()
	 * @generated
	 */
	void setEquivalentNetwork(EquivalentNetwork value);

} // EquivalentEquipment
