/**
 */
package outagePreventionMjtrace;

import CIM.IEC61970.ControlArea.TieFlow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Tie Flow Tie Flow Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_TieFlow_TieFlow_TieFlow#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_TieFlow_TieFlow_TieFlow#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_TieFlow_TieFlow_TieFlow()
 * @model
 * @generated
 */
public interface ref_TieFlow_TieFlow_TieFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TieFlow)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_TieFlow_TieFlow_TieFlow_Source()
	 * @model ordered="false"
	 * @generated
	 */
	TieFlow getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_TieFlow_TieFlow_TieFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TieFlow value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.TieFlow)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_TieFlow_TieFlow_TieFlow_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.TieFlow getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_TieFlow_TieFlow_TieFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.TieFlow value);

} // ref_TieFlow_TieFlow_TieFlow
