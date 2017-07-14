/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getServiceDeliveryPoint()
 * @model
 * @generated
 */
public interface ServiceDeliveryPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Energy Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumer</em>' reference.
	 * @see #setEnergyConsumer(EnergyConsumer)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getServiceDeliveryPoint_EnergyConsumer()
	 * @model
	 * @generated
	 */
	EnergyConsumer getEnergyConsumer();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Consumer</em>' reference.
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	void setEnergyConsumer(EnergyConsumer value);

} // ServiceDeliveryPoint
