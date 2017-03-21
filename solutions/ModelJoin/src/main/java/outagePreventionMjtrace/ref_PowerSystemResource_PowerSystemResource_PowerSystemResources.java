/**
 */
package outagePreventionMjtrace;

import CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Power System Resource Power System Resource Power System Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_PowerSystemResource_PowerSystemResource_PowerSystemResources#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_PowerSystemResource_PowerSystemResource_PowerSystemResources#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_PowerSystemResource_PowerSystemResource_PowerSystemResources()
 * @model
 * @generated
 */
public interface ref_PowerSystemResource_PowerSystemResource_PowerSystemResources extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PowerSystemResource)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_PowerSystemResource_PowerSystemResource_PowerSystemResources_Source()
	 * @model ordered="false"
	 * @generated
	 */
	PowerSystemResource getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_PowerSystemResource_PowerSystemResource_PowerSystemResources#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PowerSystemResource value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.PowerSystemResource)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_PowerSystemResource_PowerSystemResource_PowerSystemResources_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.PowerSystemResource getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_PowerSystemResource_PowerSystemResource_PowerSystemResources#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.PowerSystemResource value);

} // ref_PowerSystemResource_PowerSystemResource_PowerSystemResources
