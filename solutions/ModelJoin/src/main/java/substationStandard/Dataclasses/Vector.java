/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.Vector#getMag <em>Mag</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.Vector#getAng <em>Ang</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getVector()
 * @model
 * @generated
 */
public interface Vector extends EObject {
	/**
	 * Returns the value of the '<em><b>Mag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mag</em>' reference.
	 * @see #setMag(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getVector_Mag()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getMag();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.Vector#getMag <em>Mag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mag</em>' reference.
	 * @see #getMag()
	 * @generated
	 */
	void setMag(AnalogueValue value);

	/**
	 * Returns the value of the '<em><b>Ang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ang</em>' reference.
	 * @see #setAng(AnalogueValue)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getVector_Ang()
	 * @model required="true"
	 * @generated
	 */
	AnalogueValue getAng();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.Vector#getAng <em>Ang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ang</em>' reference.
	 * @see #getAng()
	 * @generated
	 */
	void setAng(AnalogueValue value);

} // Vector
