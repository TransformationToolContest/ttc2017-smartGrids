/**
 */
package COSEM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMRoot#getPhysicalDevice <em>Physical Device</em>}</li>
 *   <li>{@link COSEM.COSEMRoot#getLogicalDevice <em>Logical Device</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMPackage#getCOSEMRoot()
 * @model
 * @generated
 */
public interface COSEMRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Device</b></em>' containment reference list.
	 * The list contents are of type {@link COSEM.PhysicalDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Device</em>' containment reference list.
	 * @see COSEM.COSEMPackage#getCOSEMRoot_PhysicalDevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalDevice> getPhysicalDevice();

	/**
	 * Returns the value of the '<em><b>Logical Device</b></em>' containment reference list.
	 * The list contents are of type {@link COSEM.LogicalDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Device</em>' containment reference list.
	 * @see COSEM.COSEMPackage#getCOSEMRoot_LogicalDevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalDevice> getLogicalDevice();

} // COSEMRoot
