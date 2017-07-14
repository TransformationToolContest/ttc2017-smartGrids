/**
 */
package gluemodel.substationStandard.Dataclasses;

import gluemodel.substationStandard.Enumerations.CurveCharKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Char</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.CurveChar#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getCurveChar()
 * @model
 * @generated
 */
public interface CurveChar extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.substationStandard.Enumerations.CurveCharKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.CurveCharKind
	 * @see #setVal(CurveCharKind)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getCurveChar_Val()
	 * @model
	 * @generated
	 */
	CurveCharKind getVal();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.CurveChar#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see gluemodel.substationStandard.Enumerations.CurveCharKind
	 * @see #getVal()
	 * @generated
	 */
	void setVal(CurveCharKind value);

} // CurveChar
