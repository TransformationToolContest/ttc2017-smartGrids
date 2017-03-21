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
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing' order='8'"
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
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The control area tie flows to which this terminal associates.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control area tie flows to which this terminal associates.'"
	 *        annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	EList<TieFlow> getTieFlow();

} // Terminal
