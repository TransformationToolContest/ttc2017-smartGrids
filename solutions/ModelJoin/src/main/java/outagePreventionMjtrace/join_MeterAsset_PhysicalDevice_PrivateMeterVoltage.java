/**
 */
package outagePreventionMjtrace;

import CIM.IEC61968.Metering.MeterAsset;

import COSEM.PhysicalDevice;

import org.eclipse.emf.ecore.EObject;

import outagePreventionJointarget.PrivateMeterVoltage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>join Meter Asset Physical Device Private Meter Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage#getLeft <em>Left</em>}</li>
 *   <li>{@link outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage#getRight <em>Right</em>}</li>
 *   <li>{@link outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage()
 * @model
 * @generated
 */
public interface join_MeterAsset_PhysicalDevice_PrivateMeterVoltage extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(MeterAsset)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Left()
	 * @model ordered="false"
	 * @generated
	 */
	MeterAsset getLeft();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(MeterAsset value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(PhysicalDevice)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Right()
	 * @model ordered="false"
	 * @generated
	 */
	PhysicalDevice getRight();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(PhysicalDevice value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PrivateMeterVoltage)
	 * @see outagePreventionMjtrace.OutagePreventionMjtracePackage#getjoin_MeterAsset_PhysicalDevice_PrivateMeterVoltage_Target()
	 * @model ordered="false"
	 * @generated
	 */
	PrivateMeterVoltage getTarget();

	/**
	 * Sets the value of the '{@link outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PrivateMeterVoltage value);

} // join_MeterAsset_PhysicalDevice_PrivateMeterVoltage
