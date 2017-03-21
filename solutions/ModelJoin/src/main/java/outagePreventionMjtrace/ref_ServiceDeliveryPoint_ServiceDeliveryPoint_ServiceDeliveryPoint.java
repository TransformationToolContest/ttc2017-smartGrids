/**
 */
package outagePreventionMjtrace;

import CIM.IEC61968.Metering.ServiceDeliveryPoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ref Service Delivery Point Service Delivery Point Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint()
 * @model
 * @generated
 */
public interface ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ServiceDeliveryPoint)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint_Source()
	 * @model ordered="false"
	 * @generated
	 */
	ServiceDeliveryPoint getSource();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ServiceDeliveryPoint value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(outagePreventionJointarget.ServiceDeliveryPoint)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint_Target()
	 * @model ordered="false"
	 * @generated
	 */
	outagePreventionJointarget.ServiceDeliveryPoint getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(outagePreventionJointarget.ServiceDeliveryPoint value);

} // ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint
