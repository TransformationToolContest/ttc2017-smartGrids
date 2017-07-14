/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.EnergyConsumer#getMRID <em>MRID</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getEnergyConsumer()
 * @model
 * @generated
 */
public interface EnergyConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRID</em>' attribute.
	 * @see #setMRID(String)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getEnergyConsumer_MRID()
	 * @model required="true"
	 * @generated
	 */
	String getMRID();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.EnergyConsumer#getMRID <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRID</em>' attribute.
	 * @see #getMRID()
	 * @generated
	 */
	void setMRID(String value);

} // EnergyConsumer
