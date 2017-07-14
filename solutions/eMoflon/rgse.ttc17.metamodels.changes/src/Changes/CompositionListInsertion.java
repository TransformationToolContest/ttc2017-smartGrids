/**
 */
package Changes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition List Insertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Changes.CompositionListInsertion#getAddedElement <em>Added Element</em>}</li>
 * </ul>
 *
 * @see Changes.ChangesPackage#getCompositionListInsertion()
 * @model
 * @generated
 */
public interface CompositionListInsertion extends ListInsertion {
	/**
	 * Returns the value of the '<em><b>Added Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Element</em>' containment reference.
	 * @see #setAddedElement(EObject)
	 * @see Changes.ChangesPackage#getCompositionListInsertion_AddedElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EObject getAddedElement();

	/**
	 * Sets the value of the '{@link Changes.CompositionListInsertion#getAddedElement <em>Added Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added Element</em>' containment reference.
	 * @see #getAddedElement()
	 * @generated
	 */
	void setAddedElement(EObject value);

} // CompositionListInsertion
