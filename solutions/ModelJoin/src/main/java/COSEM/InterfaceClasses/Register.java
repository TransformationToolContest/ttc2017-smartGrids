/**
 */
package COSEM.InterfaceClasses;

import COSEM.Datatypes.scal_unit_type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.Register#getValue <em>Value</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.Register#getScaler_unit <em>Scaler unit</em>}</li>
 * </ul>
 *
 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getRegister()
 * @model
 * @generated
 */
public interface Register extends Data {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getRegister_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Register#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Scaler unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaler unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaler unit</em>' reference.
	 * @see #setScaler_unit(scal_unit_type)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getRegister_Scaler_unit()
	 * @model required="true"
	 * @generated
	 */
	scal_unit_type getScaler_unit();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.Register#getScaler_unit <em>Scaler unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaler unit</em>' reference.
	 * @see #getScaler_unit()
	 * @generated
	 */
	void setScaler_unit(scal_unit_type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();

} // Register
