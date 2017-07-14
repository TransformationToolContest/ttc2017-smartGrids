/**
 */
package gluemodel.COSEM.InterfaceClasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association LN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.InterfaceClasses.AssociationLN#getAA <em>AA</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage#getAssociationLN()
 * @model
 * @generated
 */
public interface AssociationLN extends Base {
	/**
	 * Returns the value of the '<em><b>AA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AA</em>' reference.
	 * @see #setAA(ApplicationAssociation)
	 * @see gluemodel.COSEM.InterfaceClasses.InterfaceClassesPackage#getAssociationLN_AA()
	 * @model required="true"
	 * @generated
	 */
	ApplicationAssociation getAA();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.InterfaceClasses.AssociationLN#getAA <em>AA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AA</em>' reference.
	 * @see #getAA()
	 * @generated
	 */
	void setAA(ApplicationAssociation value);

} // AssociationLN
