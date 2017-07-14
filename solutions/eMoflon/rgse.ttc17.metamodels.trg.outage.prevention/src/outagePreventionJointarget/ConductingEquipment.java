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
 * @model
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
	 * @model
	 * @generated
	 */
	EList<Terminal> getTerminals();

} // ConductingEquipment
