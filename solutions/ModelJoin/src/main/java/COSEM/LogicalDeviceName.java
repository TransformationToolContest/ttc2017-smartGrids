/**
 */
package COSEM;

import COSEM.COSEMObjects.SAPAssignmentCurrent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Device Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.LogicalDeviceName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMPackage#getLogicalDeviceName()
 * @model
 * @generated
 */
public interface LogicalDeviceName extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(SAPAssignmentCurrent)
	 * @see COSEM.COSEMPackage#getLogicalDeviceName_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SAPAssignmentCurrent getName();

	/**
	 * Sets the value of the '{@link COSEM.LogicalDeviceName#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(SAPAssignmentCurrent value);

} // LogicalDeviceName
