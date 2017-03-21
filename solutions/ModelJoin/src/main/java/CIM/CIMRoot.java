/**
 */
package CIM;

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
 *   <li>{@link CIM.CIMRoot#getIDobject <em>IDobject</em>}</li>
 * </ul>
 *
 * @see CIM.CIMPackage#getCIMRoot()
 * @model
 * @generated
 */
public interface CIMRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>IDobject</b></em>' containment reference list.
	 * The list contents are of type {@link CIM.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IDobject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IDobject</em>' containment reference list.
	 * @see CIM.CIMPackage#getCIMRoot_IDobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getIDobject();

} // CIMRoot
