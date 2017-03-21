/**
 */
package outageDetectionMjtrace;

import CIM.IEC61968.Metering.MeterAsset;

import COSEM.PhysicalDevice;

import org.eclipse.emf.ecore.EObject;

import outageDetectionJointarget.EnergyConsumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>join Meter Asset Physical Device Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getLeft <em>Left</em>}</li>
 *   <li>{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getRight <em>Right</em>}</li>
 *   <li>{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see outageDetectionMjtrace.OutageDetectionMjtracePackage#getjoin_MeterAsset_PhysicalDevice_EnergyConsumer()
 * @model
 * @generated
 */
public interface join_MeterAsset_PhysicalDevice_EnergyConsumer extends EObject {
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
	 * @see outageDetectionMjtrace.OutageDetectionMjtracePackage#getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Left()
	 * @model ordered="false"
	 * @generated
	 */
	MeterAsset getLeft();

	/**
	 * Sets the value of the '{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getLeft <em>Left</em>}' reference.
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
	 * @see outageDetectionMjtrace.OutageDetectionMjtracePackage#getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Right()
	 * @model ordered="false"
	 * @generated
	 */
	PhysicalDevice getRight();

	/**
	 * Sets the value of the '{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getRight <em>Right</em>}' reference.
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
	 * @see #setTarget(EnergyConsumer)
	 * @see outageDetectionMjtrace.OutageDetectionMjtracePackage#getjoin_MeterAsset_PhysicalDevice_EnergyConsumer_Target()
	 * @model ordered="false"
	 * @generated
	 */
	EnergyConsumer getTarget();

	/**
	 * Sets the value of the '{@link outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EnergyConsumer value);

} // join_MeterAsset_PhysicalDevice_EnergyConsumer
