/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.ConductingEquipment#getTerminals <em>Terminals</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getConductingEquipment()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepsubtype' order='7'"
 * @generated
 */
public interface ConductingEquipment extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link outagePreventionJointarget.Terminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getConductingEquipment_Terminals()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ConductingEquipment has 1 or 2 terminals that may be connected to other ConductingEquipment terminals via ConnectivityNodes'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	EList<Terminal> getTerminals();

} // ConductingEquipment
