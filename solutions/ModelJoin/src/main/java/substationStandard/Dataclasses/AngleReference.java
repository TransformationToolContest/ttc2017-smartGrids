/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

import substationStandard.Enumerations.AngleReferenceKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.AngleReference#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getAngleReference()
 * @model
 * @generated
 */
public interface AngleReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.AngleReferenceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see substationStandard.Enumerations.AngleReferenceKind
	 * @see #setVal(AngleReferenceKind)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getAngleReference_Val()
	 * @model
	 * @generated
	 */
	AngleReferenceKind getVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.AngleReference#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see substationStandard.Enumerations.AngleReferenceKind
	 * @see #getVal()
	 * @generated
	 */
	void setVal(AngleReferenceKind value);

} // AngleReference
