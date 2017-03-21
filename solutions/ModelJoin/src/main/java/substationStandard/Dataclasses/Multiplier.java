/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

import substationStandard.Enumerations.MultiplierKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.Multiplier#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getMultiplier()
 * @model
 * @generated
 */
public interface Multiplier extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.MultiplierKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see substationStandard.Enumerations.MultiplierKind
	 * @see #setVal(MultiplierKind)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getMultiplier_Val()
	 * @model
	 * @generated
	 */
	MultiplierKind getVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.Multiplier#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see substationStandard.Enumerations.MultiplierKind
	 * @see #getVal()
	 * @generated
	 */
	void setVal(MultiplierKind value);

} // Multiplier
