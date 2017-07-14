/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.Terminal#getTieFlow <em>Tie Flow</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
	 * The list contents are of type {@link outagePreventionJointarget.TieFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Flow</em>' reference list.
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getTerminal_TieFlow()
	 * @model
	 * @generated
	 */
	EList<TieFlow> getTieFlow();

} // Terminal
