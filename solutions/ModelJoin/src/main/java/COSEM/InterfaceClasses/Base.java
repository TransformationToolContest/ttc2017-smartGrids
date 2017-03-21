/**
 */
package COSEM.InterfaceClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.Base#getLogical_name <em>Logical name</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.Base#getOBIScode <em>OBI Scode</em>}</li>
 * </ul>
 *
 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getBase()
 * @model
 * @generated
 */
public interface Base extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical name</em>' attribute.
	 * @see #setLogical_name(String)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getBase_Logical_name()
	 * @model
	 * @generated
	 */
	String getLogical_name();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Base#getLogical_name <em>Logical name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical name</em>' attribute.
	 * @see #getLogical_name()
	 * @generated
	 */
	void setLogical_name(String value);

	/**
	 * Returns the value of the '<em><b>OBI Scode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OBI Scode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OBI Scode</em>' attribute.
	 * @see #setOBIScode(String)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getBase_OBIScode()
	 * @model
	 * @generated
	 */
	String getOBIScode();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Base#getOBIScode <em>OBI Scode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OBI Scode</em>' attribute.
	 * @see #getOBIScode()
	 * @generated
	 */
	void setOBIScode(String value);

} // Base
