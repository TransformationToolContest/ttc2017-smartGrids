/**
 */
package Changes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute List Insertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Changes.AttributeListInsertion#getAddedValue <em>Added Value</em>}</li>
 * </ul>
 *
 * @see Changes.ChangesPackage#getAttributeListInsertion()
 * @model
 * @generated
 */
public interface AttributeListInsertion extends ListInsertion {
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
	 * @see Changes.ChangesPackage#getAttributeListInsertion_AddedValue()
	 * @model required="true"
	 * @generated
	 */
	String getAddedValue();

	/**
	 * Sets the value of the '{@link Changes.AttributeListInsertion#getAddedValue <em>Added Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added Value</em>' attribute.
	 * @see #getAddedValue()
	 * @generated
	 */
	void setAddedValue(String value);

} // AttributeListInsertion
