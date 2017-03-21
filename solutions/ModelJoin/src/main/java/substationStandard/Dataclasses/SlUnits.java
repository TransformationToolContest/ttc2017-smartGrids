/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

import substationStandard.Enumerations.SIUnitsKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sl Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.SlUnits#getSlUnitsKind <em>Sl Units Kind</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getSlUnits()
 * @model
 * @generated
 */
public interface SlUnits extends EObject {
	/**
	 * Returns the value of the '<em><b>Sl Units Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link substationStandard.Enumerations.SIUnitsKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sl Units Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sl Units Kind</em>' attribute.
	 * @see substationStandard.Enumerations.SIUnitsKind
	 * @see #setSlUnitsKind(SIUnitsKind)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getSlUnits_SlUnitsKind()
	 * @model
	 * @generated
	 */
	SIUnitsKind getSlUnitsKind();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.SlUnits#getSlUnitsKind <em>Sl Units Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sl Units Kind</em>' attribute.
	 * @see substationStandard.Enumerations.SIUnitsKind
	 * @see #getSlUnitsKind()
	 * @generated
	 */
	void setSlUnitsKind(SIUnitsKind value);

} // SlUnits
