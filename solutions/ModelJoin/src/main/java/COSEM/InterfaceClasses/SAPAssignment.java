/**
 */
package COSEM.InterfaceClasses;

import COSEM.LogicalDeviceName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAP Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.SAPAssignment#getLdnname <em>Ldnname</em>}</li>
 * </ul>
 *
 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getSAPAssignment()
 * @model
 * @generated
 */
public interface SAPAssignment extends Base {
	/**
	 * Returns the value of the '<em><b>Ldnname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldnname</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldnname</em>' reference.
	 * @see #setLdnname(LogicalDeviceName)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getSAPAssignment_Ldnname()
	 * @model
	 * @generated
	 */
	LogicalDeviceName getLdnname();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.SAPAssignment#getLdnname <em>Ldnname</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldnname</em>' reference.
	 * @see #getLdnname()
	 * @generated
	 */
	void setLdnname(LogicalDeviceName value);

} // SAPAssignment
