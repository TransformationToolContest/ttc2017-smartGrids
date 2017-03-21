/**
 */
package outagePreventionMjtrace;

import CIM.IEC61970.Wires.EnergyConsumer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Energy Consumer Energy Consumer Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_EnergyConsumer_EnergyConsumer_EnergyConsumer#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_EnergyConsumer_EnergyConsumer_EnergyConsumer#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_EnergyConsumer_EnergyConsumer_EnergyConsumer()
 * @model
 * @generated
 */
public interface ref_EnergyConsumer_EnergyConsumer_EnergyConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EnergyConsumer)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_EnergyConsumer_EnergyConsumer_EnergyConsumer_Source()
	 * @model ordered="false"
	 * @generated
	 */
	EnergyConsumer getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_EnergyConsumer_EnergyConsumer_EnergyConsumer#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EnergyConsumer value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.EnergyConsumer)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_EnergyConsumer_EnergyConsumer_EnergyConsumer_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.EnergyConsumer getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_EnergyConsumer_EnergyConsumer_EnergyConsumer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.EnergyConsumer value);

} // ref_EnergyConsumer_EnergyConsumer_EnergyConsumer
