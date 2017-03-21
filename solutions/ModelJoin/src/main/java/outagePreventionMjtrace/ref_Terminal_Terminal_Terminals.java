/**
 */
package outagePreventionMjtrace;

import CIM.IEC61970.Core.Terminal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Terminal Terminal Terminals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_Terminal_Terminal_Terminals#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_Terminal_Terminal_Terminals#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_Terminal_Terminal_Terminals()
 * @model
 * @generated
 */
public interface ref_Terminal_Terminal_Terminals extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Terminal)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_Terminal_Terminal_Terminals_Source()
	 * @model ordered="false"
	 * @generated
	 */
	Terminal getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_Terminal_Terminal_Terminals#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Terminal value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.Terminal)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_Terminal_Terminal_Terminals_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.Terminal getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_Terminal_Terminal_Terminals#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.Terminal value);

} // ref_Terminal_Terminal_Terminals
