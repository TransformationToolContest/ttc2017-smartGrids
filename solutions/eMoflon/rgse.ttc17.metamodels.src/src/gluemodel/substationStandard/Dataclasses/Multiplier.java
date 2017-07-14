/**
 */
package gluemodel.substationStandard.Dataclasses;

import gluemodel.substationStandard.Enumerations.MultiplierKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.Multiplier#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMultiplier()
 * @model
 * @generated
 */
public interface Multiplier extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.MultiplierKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.MultiplierKind
	 * @see #setVal(MultiplierKind)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getMultiplier_Val()
	 * @model
	 * @generated
	 */
	MultiplierKind getVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.Multiplier#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.MultiplierKind
	 * @see #getVal()
	 * @generated
	 */
	void setVal(MultiplierKind value);

} // Multiplier
