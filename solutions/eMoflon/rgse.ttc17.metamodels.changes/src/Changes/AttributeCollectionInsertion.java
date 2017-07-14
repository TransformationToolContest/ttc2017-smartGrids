/**
 */
package Changes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Collection Insertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Changes.AttributeCollectionInsertion#getAddedValue <em>Added Value</em>}</li>
 * </ul>
 *
 * @see Changes.ChangesPackage#getAttributeCollectionInsertion()
 * @model
 * @generated
 */
public interface AttributeCollectionInsertion extends CollectionInsertion {
	/**
	 * Returns the value of the '<em><b>Added Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Value</em>' attribute.
	 * @see #setAddedValue(String)
	 * @see Changes.ChangesPackage#getAttributeCollectionInsertion_AddedValue()
	 * @model required="true"
	 * @generated
	 */
	String getAddedValue();

	/**
	 * Sets the value of the '{@link Changes.AttributeCollectionInsertion#getAddedValue <em>Added Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added Value</em>' attribute.
	 * @see #getAddedValue()
	 * @generated
	 */
	void setAddedValue(String value);

} // AttributeCollectionInsertion
