/**
 */
package gluemodel.CIM.IEC61970.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.EquipmentContainer#getEquipments <em>Equipments</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipmentContainer()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A modeling construct to provide a root class for containing equipment.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A modeling construct to provide a root class for containing equipment.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A modeling construct to provide a root class for containing equipment.' Profile\040documentation='A modeling construct to provide a root class for containing equipment.'"
 * @generated
 */
public interface EquipmentContainer extends ConnectivityNodeContainer {
	/**
	 * Returns the value of the '<em><b>Equipments</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Core.Equipment}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.Equipment#getEquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipments</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Core.CorePackage#getEquipmentContainer_Equipments()
	 * @see gluemodel.CIM.IEC61970.Core.Equipment#getEquipmentContainer
	 * @model opposite="EquipmentContainer"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The association is used in the naming hierarchy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The association is used in the naming hierarchy.'"
	 * @generated
	 */
	EList<Equipment> getEquipments();

} // EquipmentContainer
