/**
 */
package Changes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute List Deletion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Changes.AttributeListDeletion#getDeletedValue <em>Deleted Value</em>}</li>
 * </ul>
 *
 * @see Changes.ChangesPackage#getAttributeListDeletion()
 * @model
 * @generated
 */
public interface AttributeListDeletion extends ListDeletion {
	/**
	 * Returns the value of the '<em><b>Deleted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Value</em>' attribute.
	 * @see #setDeletedValue(String)
	 * @see Changes.ChangesPackage#getAttributeListDeletion_DeletedValue()
	 * @model
	 * @generated
	 */
	String getDeletedValue();

	/**
	 * Sets the value of the '{@link Changes.AttributeListDeletion#getDeletedValue <em>Deleted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted Value</em>' attribute.
	 * @see #getDeletedValue()
	 * @generated
	 */
	void setDeletedValue(String value);

} // AttributeListDeletion
