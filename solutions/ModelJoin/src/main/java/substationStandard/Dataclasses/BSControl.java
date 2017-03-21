/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

import substationStandard.Enumerations.BSControlKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.BSControl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getBSControl()
 * @model
 * @generated
 */
public interface BSControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.BSControlKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see substationStandard.Enumerations.BSControlKind
	 * @see #setVal(BSControlKind)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getBSControl_Val()
	 * @model
	 * @generated
	 */
	BSControlKind getVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.BSControl#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see substationStandard.Enumerations.BSControlKind
	 * @see #getVal()
	 * @generated
	 */
	void setVal(BSControlKind value);

} // BSControl
