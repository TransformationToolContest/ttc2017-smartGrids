/**
 */
package outagePreventionMjtrace;

import CIM.IEC61968.Common.PositionPoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Position Point Position Point Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_PositionPoint_PositionPoint_Position#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_PositionPoint_PositionPoint_Position#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_PositionPoint_PositionPoint_Position()
 * @model
 * @generated
 */
public interface ref_PositionPoint_PositionPoint_Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PositionPoint)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_PositionPoint_PositionPoint_Position_Source()
	 * @model ordered="false"
	 * @generated
	 */
	PositionPoint getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_PositionPoint_PositionPoint_Position#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PositionPoint value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.PositionPoint)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_PositionPoint_PositionPoint_Position_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.PositionPoint getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_PositionPoint_PositionPoint_Position#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.PositionPoint value);

} // ref_PositionPoint_PositionPoint_Position
