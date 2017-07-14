/**
 */
package gluemodel.CIM.IEC61970.Wires;

import gluemodel.CIM.IEC61970.Protection.RecloseSequence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protected Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getProtectedSwitch()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A ProtectedSwitch is a switching device that can be operated by ProtectionEquipment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A ProtectedSwitch is a switching device that can be operated by ProtectionEquipment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A ProtectedSwitch is a switching device that can be operated by ProtectionEquipment.' Profile\040documentation='A ProtectedSwitch is a switching device that can be operated by ProtectionEquipment.'"
 * @generated
 */
public interface ProtectedSwitch extends Switch {
	/**
	 * Returns the value of the '<em><b>Reclose Sequences</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Protection.RecloseSequence}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Protection.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclose Sequences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclose Sequences</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getProtectedSwitch_RecloseSequences()
	 * @see gluemodel.CIM.IEC61970.Protection.RecloseSequence#getProtectedSwitch
	 * @model opposite="ProtectedSwitch"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A breaker may have zero or more automatic reclosures after a trip occurs.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A breaker may have zero or more automatic reclosures after a trip occurs.'"
	 * @generated
	 */
	EList<RecloseSequence> getRecloseSequences();

} // ProtectedSwitch
