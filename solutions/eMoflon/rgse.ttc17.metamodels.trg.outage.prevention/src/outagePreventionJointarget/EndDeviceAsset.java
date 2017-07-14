/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.EndDeviceAsset#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getEndDeviceAsset()
 * @model
 * @generated
 */
public interface EndDeviceAsset extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Point</em>' reference.
	 * @see #setServiceDeliveryPoint(ServiceDeliveryPoint)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getEndDeviceAsset_ServiceDeliveryPoint()
	 * @model
	 * @generated
	 */
	ServiceDeliveryPoint getServiceDeliveryPoint();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.EndDeviceAsset#getServiceDeliveryPoint <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delivery Point</em>' reference.
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	void setServiceDeliveryPoint(ServiceDeliveryPoint value);

} // EndDeviceAsset
