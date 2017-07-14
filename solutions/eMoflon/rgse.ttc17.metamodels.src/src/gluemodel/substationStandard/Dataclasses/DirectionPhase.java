/**
 */
package gluemodel.substationStandard.Dataclasses;

import gluemodel.substationStandard.Enumerations.DirectionPhaseKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.DirectionPhase#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getDirectionPhase()
 * @model
 * @generated
 */
public interface DirectionPhase extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.DirectionPhaseKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.DirectionPhaseKind
	 * @see #setVal(DirectionPhaseKind)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getDirectionPhase_Val()
	 * @model
	 * @generated
	 */
	DirectionPhaseKind getVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.DirectionPhase#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.DirectionPhaseKind
	 * @see #getVal()
	 * @generated
	 */
	void setVal(DirectionPhaseKind value);

} // DirectionPhase
