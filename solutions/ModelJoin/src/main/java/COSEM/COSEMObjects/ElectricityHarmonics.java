/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electricity Harmonics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.ElectricityHarmonics#getTotal <em>Total</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityHarmonics#getFundamental_harmonic <em>Fundamental harmonic</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityHarmonics#getHarmonic <em>Harmonic</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityHarmonics#getTotal_Harmoni_Distortion <em>Total Harmoni Distortion</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityHarmonics#getTotal_Demand_Distortion <em>Total Demand Distortion</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityHarmonics#getAll_harmonics <em>All harmonics</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.ElectricityHarmonics#getAll_harmonics_to_nominal_value_ratio <em>All harmonics to nominal value ratio</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityHarmonics()
 * @model
 * @generated
 */
public interface ElectricityHarmonics extends Data {
	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityHarmonics_Total()
	 * @model
	 * @generated
	 */
	double getTotal();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityHarmonics#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(double value);

	/**
	 * Returns the value of the '<em><b>Fundamental harmonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fundamental harmonic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fundamental harmonic</em>' attribute.
	 * @see #setFundamental_harmonic(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityHarmonics_Fundamental_harmonic()
	 * @model
	 * @generated
	 */
	double getFundamental_harmonic();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityHarmonics#getFundamental_harmonic <em>Fundamental harmonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fundamental harmonic</em>' attribute.
	 * @see #getFundamental_harmonic()
	 * @generated
	 */
	void setFundamental_harmonic(double value);

	/**
	 * Returns the value of the '<em><b>Harmonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Harmonic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Harmonic</em>' attribute.
	 * @see #setHarmonic(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityHarmonics_Harmonic()
	 * @model
	 * @generated
	 */
	double getHarmonic();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityHarmonics#getHarmonic <em>Harmonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Harmonic</em>' attribute.
	 * @see #getHarmonic()
	 * @generated
	 */
	void setHarmonic(double value);

	/**
	 * Returns the value of the '<em><b>Total Harmoni Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Harmoni Distortion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Harmoni Distortion</em>' attribute.
	 * @see #setTotal_Harmoni_Distortion(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityHarmonics_Total_Harmoni_Distortion()
	 * @model
	 * @generated
	 */
	double getTotal_Harmoni_Distortion();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityHarmonics#getTotal_Harmoni_Distortion <em>Total Harmoni Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Harmoni Distortion</em>' attribute.
	 * @see #getTotal_Harmoni_Distortion()
	 * @generated
	 */
	void setTotal_Harmoni_Distortion(double value);

	/**
	 * Returns the value of the '<em><b>Total Demand Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Demand Distortion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Demand Distortion</em>' attribute.
	 * @see #setTotal_Demand_Distortion(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityHarmonics_Total_Demand_Distortion()
	 * @model
	 * @generated
	 */
	double getTotal_Demand_Distortion();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityHarmonics#getTotal_Demand_Distortion <em>Total Demand Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Demand Distortion</em>' attribute.
	 * @see #getTotal_Demand_Distortion()
	 * @generated
	 */
	void setTotal_Demand_Distortion(double value);

	/**
	 * Returns the value of the '<em><b>All harmonics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All harmonics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All harmonics</em>' attribute.
	 * @see #setAll_harmonics(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityHarmonics_All_harmonics()
	 * @model
	 * @generated
	 */
	double getAll_harmonics();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityHarmonics#getAll_harmonics <em>All harmonics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All harmonics</em>' attribute.
	 * @see #getAll_harmonics()
	 * @generated
	 */
	void setAll_harmonics(double value);

	/**
	 * Returns the value of the '<em><b>All harmonics to nominal value ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All harmonics to nominal value ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All harmonics to nominal value ratio</em>' attribute.
	 * @see #setAll_harmonics_to_nominal_value_ratio(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getElectricityHarmonics_All_harmonics_to_nominal_value_ratio()
	 * @model
	 * @generated
	 */
	double getAll_harmonics_to_nominal_value_ratio();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.ElectricityHarmonics#getAll_harmonics_to_nominal_value_ratio <em>All harmonics to nominal value ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All harmonics to nominal value ratio</em>' attribute.
	 * @see #getAll_harmonics_to_nominal_value_ratio()
	 * @generated
	 */
	void setAll_harmonics_to_nominal_value_ratio(double value);

} // ElectricityHarmonics
