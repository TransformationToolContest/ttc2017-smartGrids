/**
 */
package gluemodel.substationStandard.Dataclasses;

import gluemodel.substationStandard.Enumerations.PhaseReferenceKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.PhaseReference#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getPhaseReference()
 * @model
 * @generated
 */
public interface PhaseReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.PhaseReferenceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.PhaseReferenceKind
	 * @see #setVal(PhaseReferenceKind)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getPhaseReference_Val()
	 * @model
	 * @generated
	 */
	PhaseReferenceKind getVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.PhaseReference#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.PhaseReferenceKind
	 * @see #getVal()
	 * @generated
	 */
	void setVal(PhaseReferenceKind value);

} // PhaseReference
