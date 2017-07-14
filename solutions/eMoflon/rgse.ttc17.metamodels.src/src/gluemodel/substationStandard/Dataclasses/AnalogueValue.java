/**
 */
package gluemodel.substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analogue Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.AnalogueValue#getI <em>I</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.AnalogueValue#getF <em>F</em>}</li>
 * </ul>
 *
 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAnalogueValue()
 * @model
 * @generated
 */
public interface AnalogueValue extends EObject {
	/**
	 * Returns the value of the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' attribute.
	 * @see #setI(int)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAnalogueValue_I()
	 * @model
	 * @generated
	 */
	int getI();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.AnalogueValue#getI <em>I</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I</em>' attribute.
	 * @see #getI()
	 * @generated
	 */
	void setI(int value);

	/**
	 * Returns the value of the '<em><b>F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F</em>' attribute.
	 * @see #setF(float)
	 * @see gluemodel.substationStandard.Dataclasses.DataclassesPackage#getAnalogueValue_F()
	 * @model
	 * @generated
	 */
	float getF();

	/**
	 * Sets the value of the '{@link gluemodel.substationStandard.Dataclasses.AnalogueValue#getF <em>F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F</em>' attribute.
	 * @see #getF()
	 * @generated
	 */
	void setF(float value);

} // AnalogueValue
