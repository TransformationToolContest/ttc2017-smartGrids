/**
 */
package Changes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Change Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Changes.ModelChangeSet#getChanges <em>Changes</em>}</li>
 * </ul>
 *
 * @see Changes.ChangesPackage#getModelChangeSet()
 * @model
 * @generated
 */
public interface ModelChangeSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
	 * The list contents are of type {@link Changes.ModelChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' containment reference list.
	 * @see Changes.ChangesPackage#getModelChangeSet_Changes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelChange> getChanges();

} // ModelChangeSet
