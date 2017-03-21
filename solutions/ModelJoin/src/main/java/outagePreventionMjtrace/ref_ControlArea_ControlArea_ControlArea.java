/**
 */
package outagePreventionMjtrace;

import CIM.IEC61970.ControlArea.ControlArea;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Control Area Control Area Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_ControlArea_ControlArea_ControlArea#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_ControlArea_ControlArea_ControlArea#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ControlArea_ControlArea_ControlArea()
 * @model
 * @generated
 */
public interface ref_ControlArea_ControlArea_ControlArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ControlArea)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ControlArea_ControlArea_ControlArea_Source()
	 * @model ordered="false"
	 * @generated
	 */
	ControlArea getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_ControlArea_ControlArea_ControlArea#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ControlArea value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.ControlArea)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ControlArea_ControlArea_ControlArea_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.ControlArea getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_ControlArea_ControlArea_ControlArea#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.ControlArea value);

} // ref_ControlArea_ControlArea_ControlArea
