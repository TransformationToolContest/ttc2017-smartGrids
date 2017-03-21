/**
 */
package CIM.IEC61970.Equivalents;

import CIM.IEC61970.Core.ConnectivityNodeContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Equivalents.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentNetwork()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A class that represents an external meshed network that has been reduced to an electrically equivalent model. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are NOT contained by the equivalent.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A class that represents an external meshed network that has been reduced to an electrically equivalent model. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are NOT contained by the equivalent.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A class that represents an external meshed network that has been reduced to an electrically equivalent model. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are NOT contained by the equivalent.' Profile\040documentation='A class that represents an external meshed network that has been reduced to an electrically equivalent model. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are NOT contained by the equivalent.'"
 * @generated
 */
public interface EquivalentNetwork extends ConnectivityNodeContainer {
	/**
	 * Returns the value of the '<em><b>Equivalent Equipments</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Equivalents.EquivalentEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Equipments</em>' reference list.
	 * @see CIM.IEC61970.Equivalents.EquivalentsPackage#getEquivalentNetwork_EquivalentEquipments()
	 * @see CIM.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork
	 * @model opposite="EquivalentNetwork"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The associated reduced equivalents.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The associated reduced equivalents.'"
	 * @generated
	 */
	EList<EquivalentEquipment> getEquivalentEquipments();

} // EquivalentNetwork
