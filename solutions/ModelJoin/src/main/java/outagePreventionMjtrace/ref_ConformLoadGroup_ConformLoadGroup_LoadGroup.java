/**
 */
package outagePreventionMjtrace;

import CIM.IEC61970.LoadModel.ConformLoadGroup;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Conform Load Group Conform Load Group Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_ConformLoadGroup_ConformLoadGroup_LoadGroup#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_ConformLoadGroup_ConformLoadGroup_LoadGroup#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ConformLoadGroup_ConformLoadGroup_LoadGroup()
 * @model
 * @generated
 */
public interface ref_ConformLoadGroup_ConformLoadGroup_LoadGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConformLoadGroup)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ConformLoadGroup_ConformLoadGroup_LoadGroup_Source()
	 * @model ordered="false"
	 * @generated
	 */
	ConformLoadGroup getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_ConformLoadGroup_ConformLoadGroup_LoadGroup#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConformLoadGroup value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.ConformLoadGroup)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ConformLoadGroup_ConformLoadGroup_LoadGroup_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.ConformLoadGroup getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_ConformLoadGroup_ConformLoadGroup_LoadGroup#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.ConformLoadGroup value);

} // ref_ConformLoadGroup_ConformLoadGroup_LoadGroup
