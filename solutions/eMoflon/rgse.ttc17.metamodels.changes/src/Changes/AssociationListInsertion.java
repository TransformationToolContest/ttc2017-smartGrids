/**
 */
package Changes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association List Insertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Changes.AssociationListInsertion#getAddedElement <em>Added Element</em>}</li>
 * </ul>
 *
 * @see Changes.ChangesPackage#getAssociationListInsertion()
 * @model
 * @generated
 */
public interface AssociationListInsertion extends ListInsertion {
	/**
	 * Returns the value of the '<em><b>Added Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Element</em>' reference.
	 * @see #setAddedElement(EObject)
	 * @see Changes.ChangesPackage#getAssociationListInsertion_AddedElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getAddedElement();

	/**
	 * Sets the value of the '{@link Changes.AssociationListInsertion#getAddedElement <em>Added Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added Element</em>' reference.
	 * @see #getAddedElement()
	 * @generated
	 */
	void setAddedElement(EObject value);

} // AssociationListInsertion
