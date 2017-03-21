/**
 */
package COSEM.InterfaceClasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demand Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.DemandRegister#getNumber_of_periods <em>Number of periods</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.DemandRegister#getPeriod <em>Period</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.DemandRegister#getCurrent_average_value <em>Current average value</em>}</li>
 * </ul>
 *
 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getDemandRegister()
 * @model
 * @generated
 */
public interface DemandRegister extends ExtendedRegister {
	/**
	 * Returns the value of the '<em><b>Number of periods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number of periods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number of periods</em>' attribute.
	 * @see #setNumber_of_periods(int)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getDemandRegister_Number_of_periods()
	 * @model
	 * @generated
	 */
	int getNumber_of_periods();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.DemandRegister#getNumber_of_periods <em>Number of periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number of periods</em>' attribute.
	 * @see #getNumber_of_periods()
	 * @generated
	 */
	void setNumber_of_periods(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getDemandRegister_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.DemandRegister#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Current average value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current average value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current average value</em>' attribute.
	 * @see #setCurrent_average_value(float)
	 * @see COSEM.InterfaceClasses.InterfaceClassesPackage#getDemandRegister_Current_average_value()
	 * @model derived="true"
	 * @generated
	 */
	float getCurrent_average_value();

	/**
	 * Sets the value of the '{@link COSEM.InterfaceClasses.DemandRegister#getCurrent_average_value <em>Current average value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current average value</em>' attribute.
	 * @see #getCurrent_average_value()
	 * @generated
	 */
	void setCurrent_average_value(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculate_current_average_value();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculate_last_average_value();

} // DemandRegister
