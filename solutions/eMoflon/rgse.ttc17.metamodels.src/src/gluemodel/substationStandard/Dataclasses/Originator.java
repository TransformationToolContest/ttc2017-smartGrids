/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Originator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Originator#getOrident <em>Orident</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Originator#getOrCat <em>Or Cat</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getOriginator()
 * @model
 * @generated
 */
public interface Originator extends EObject {
	/**
	 * Returns the value of the '<em><b>Orident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orident</em>' attribute.
	 * @see #setOrident(String)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getOriginator_Orident()
	 * @model
	 * @generated
	 */
	String getOrident();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Originator#getOrident <em>Orident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orident</em>' attribute.
	 * @see #getOrident()
	 * @generated
	 */
	void setOrident(String value);

	/**
	 * Returns the value of the '<em><b>Or Cat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Cat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Cat</em>' reference.
	 * @see #setOrCat(OriginatorCategory)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getOriginator_OrCat()
	 * @model required="true"
	 * @generated
	 */
	OriginatorCategory getOrCat();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Originator#getOrCat <em>Or Cat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Cat</em>' reference.
	 * @see #getOrCat()
	 * @generated
	 */
	void setOrCat(OriginatorCategory value);

} // Originator
