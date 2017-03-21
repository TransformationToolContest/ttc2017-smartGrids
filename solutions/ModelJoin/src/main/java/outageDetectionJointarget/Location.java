/**
 */
package outageDetectionJointarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outageDetectionJointarget.Location#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getLocation()
 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing' order='2'"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(PositionPoint)
	 * @see outageDetectionJointarget.OutageDetectionJointargetPackage#getLocation_Position()
	 * @model annotation="edu.kit.ipd.sdq.mdsd.mj.createdBy operator='keepoutgoing'"
	 * @generated
	 */
	PositionPoint getPosition();

	/**
	 * Sets the value of the '{@link outageDetectionJointarget.Location#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionPoint value);

} // Location
