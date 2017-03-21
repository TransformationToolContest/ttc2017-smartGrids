/**
 */
package outagePreventionMjtrace;

import CIM.IEC61970.LoadModel.SubLoadArea;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Sub Load Area Sub Load Area Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_SubLoadArea_SubLoadArea_SubLoadArea#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_SubLoadArea_SubLoadArea_SubLoadArea#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_SubLoadArea_SubLoadArea_SubLoadArea()
 * @model
 * @generated
 */
public interface ref_SubLoadArea_SubLoadArea_SubLoadArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SubLoadArea)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_SubLoadArea_SubLoadArea_SubLoadArea_Source()
	 * @model ordered="false"
	 * @generated
	 */
	SubLoadArea getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_SubLoadArea_SubLoadArea_SubLoadArea#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SubLoadArea value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.SubLoadArea)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_SubLoadArea_SubLoadArea_SubLoadArea_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.SubLoadArea getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_SubLoadArea_SubLoadArea_SubLoadArea#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.SubLoadArea value);

} // ref_SubLoadArea_SubLoadArea_SubLoadArea
