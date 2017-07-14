/**
 */
package Changes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Collection Deletion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Changes.AttributeCollectionDeletion#getDeletedValue <em>Deleted Value</em>}</li>
 * </ul>
 *
 * @see Changes.ChangesPackage#getAttributeCollectionDeletion()
 * @model
 * @generated
 */
public interface AttributeCollectionDeletion extends CollectionDeletion {
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
	 * @see Changes.ChangesPackage#getAttributeCollectionDeletion_DeletedValue()
	 * @model required="true"
	 * @generated
	 */
	String getDeletedValue();

	/**
	 * Sets the value of the '{@link Changes.AttributeCollectionDeletion#getDeletedValue <em>Deleted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted Value</em>' attribute.
	 * @see #getDeletedValue()
	 * @generated
	 */
	void setDeletedValue(String value);

} // AttributeCollectionDeletion
