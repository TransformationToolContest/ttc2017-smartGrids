/**
 */
package gluemodel;

import gluemodel.CIM.IEC61968.Metering.MeterAsset;

import gluemodel.COSEM.PhysicalDevice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Asset Physical Device Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.MeterAssetPhysicalDevicePair#getA <em>A</em>}</li>
 *   <li>{@link gluemodel.MeterAssetPhysicalDevicePair#getB <em>B</em>}</li>
 *   <li>{@link gluemodel.MeterAssetPhysicalDevicePair#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see gluemodel.GluemodelPackage#getMeterAssetPhysicalDevicePair()
 * @model
 * @generated
 */
public interface MeterAssetPhysicalDevicePair extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference.
	 * @see #setA(MeterAsset)
	 * @see gluemodel.GluemodelPackage#getMeterAssetPhysicalDevicePair_A()
	 * @model
	 * @generated
	 */
	MeterAsset getA();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetPhysicalDevicePair#getA <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(MeterAsset value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference.
	 * @see #setB(PhysicalDevice)
	 * @see gluemodel.GluemodelPackage#getMeterAssetPhysicalDevicePair_B()
	 * @model
	 * @generated
	 */
	PhysicalDevice getB();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetPhysicalDevicePair#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(PhysicalDevice value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gluemodel.GluemodelPackage#getMeterAssetPhysicalDevicePair_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gluemodel.MeterAssetPhysicalDevicePair#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MeterAssetPhysicalDevicePair
