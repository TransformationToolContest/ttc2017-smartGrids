/**
 */
package substationStandard.Dataclasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link substationStandard.Dataclasses.Point#getXVal <em>XVal</em>}</li>
 *   <li>{@link substationStandard.Dataclasses.Point#getYVal <em>YVal</em>}</li>
 * </ul>
 *
 * @see substationStandard.Dataclasses.DataclassesPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject {
	/**
	 * Returns the value of the '<em><b>XVal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XVal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XVal</em>' attribute.
	 * @see #setXVal(float)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getPoint_XVal()
	 * @model
	 * @generated
	 */
	float getXVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.Point#getXVal <em>XVal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XVal</em>' attribute.
	 * @see #getXVal()
	 * @generated
	 */
	void setXVal(float value);

	/**
	 * Returns the value of the '<em><b>YVal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YVal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YVal</em>' attribute.
	 * @see #setYVal(float)
	 * @see substationStandard.Dataclasses.DataclassesPackage#getPoint_YVal()
	 * @model
	 * @generated
	 */
	float getYVal();

	/**
	 * Sets the value of the '{@link substationStandard.Dataclasses.Point#getYVal <em>YVal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YVal</em>' attribute.
	 * @see #getYVal()
	 * @generated
	 */
	void setYVal(float value);

} // Point
