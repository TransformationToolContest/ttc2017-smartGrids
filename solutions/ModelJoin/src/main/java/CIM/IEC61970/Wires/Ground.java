/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.Core.ConductingEquipment;

import CIM.IEC61970.Informative.InfAssets.WindingInsulation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.Ground#getWindingInsulations <em>Winding Insulations</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getGround()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A common point for connecting grounded conducting equipment such as shunt capacitors. The power system model can have more than one ground.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A common point for connecting grounded conducting equipment such as shunt capacitors. The power system model can have more than one ground.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A common point for connecting grounded conducting equipment such as shunt capacitors. The power system model can have more than one ground.' Profile\040documentation='A common point for connecting grounded conducting equipment such as shunt capacitors. The power system model can have more than one ground.'"
 * @generated
 */
public interface Ground extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Winding Insulations</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.WindingInsulation}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.WindingInsulation#getGround <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Insulations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Insulations</em>' reference list.
	 * @see CIM.IEC61970.Wires.WiresPackage#getGround_WindingInsulations()
	 * @see CIM.IEC61970.Informative.InfAssets.WindingInsulation#getGround
	 * @model opposite="Ground"
	 * @generated
	 */
	EList<WindingInsulation> getWindingInsulations();

} // Ground
