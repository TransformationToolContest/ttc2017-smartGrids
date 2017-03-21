/**
 */
package outagePreventionMjtrace;

import CIM.IEC61968.Common.Location;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Location Location Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_Location_Location_Location#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_Location_Location_Location#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_Location_Location_Location()
 * @model
 * @generated
 */
public interface ref_Location_Location_Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Location)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_Location_Location_Location_Source()
	 * @model ordered="false"
	 * @generated
	 */
	Location getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_Location_Location_Location#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Location value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.Location)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_Location_Location_Location_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.Location getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_Location_Location_Location#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.Location value);

} // ref_Location_Location_Location
