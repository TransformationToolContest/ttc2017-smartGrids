/**
 */
package outagePreventionMjtrace;

import CIM.IEC61970.LoadModel.LoadArea;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Load Area Load Area Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_LoadArea_LoadArea_LoadArea#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_LoadArea_LoadArea_LoadArea#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_LoadArea_LoadArea_LoadArea()
 * @model
 * @generated
 */
public interface ref_LoadArea_LoadArea_LoadArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LoadArea)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_LoadArea_LoadArea_LoadArea_Source()
	 * @model ordered="false"
	 * @generated
	 */
	LoadArea getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_LoadArea_LoadArea_LoadArea#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LoadArea value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.LoadArea)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_LoadArea_LoadArea_LoadArea_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.LoadArea getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_LoadArea_LoadArea_LoadArea#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.LoadArea value);

} // ref_LoadArea_LoadArea_LoadArea
