/**
 */
package Changes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association List Deletion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Changes.AssociationListDeletion#getDeletedElement <em>Deleted Element</em>}</li>
 * </ul>
 *
 * @see Changes.ChangesPackage#getAssociationListDeletion()
 * @model
 * @generated
 */
public interface AssociationListDeletion extends ListDeletion {
	/**
	 * Returns the value of the '<em><b>Deleted Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Element</em>' reference.
	 * @see #setDeletedElement(EObject)
	 * @see Changes.ChangesPackage#getAssociationListDeletion_DeletedElement()
	 * @model
	 * @generated
	 */
	EObject getDeletedElement();

	/**
	 * Sets the value of the '{@link Changes.AssociationListDeletion#getDeletedElement <em>Deleted Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted Element</em>' reference.
	 * @see #getDeletedElement()
	 * @generated
	 */
	void setDeletedElement(EObject value);

} // AssociationListDeletion
