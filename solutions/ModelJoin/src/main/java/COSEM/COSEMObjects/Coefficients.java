/**
 */
package COSEM.COSEMObjects;

import COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.Coefficients#getTransformer_magnetic_losses <em>Transformer magnetic losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.Coefficients#getTransformer_iron_losses <em>Transformer iron losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.Coefficients#getLine_resistance_losses <em>Line resistance losses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.Coefficients#getLine_reactance_losses <em>Line reactance losses</em>}</li>
 * </ul>
 *
 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getCoefficients()
 * @model
 * @generated
 */
public interface Coefficients extends Data {
	/**
	 * Returns the value of the '<em><b>Transformer magnetic losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer magnetic losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer magnetic losses</em>' attribute.
	 * @see #setTransformer_magnetic_losses(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getCoefficients_Transformer_magnetic_losses()
	 * @model
	 * @generated
	 */
	double getTransformer_magnetic_losses();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.Coefficients#getTransformer_magnetic_losses <em>Transformer magnetic losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer magnetic losses</em>' attribute.
	 * @see #getTransformer_magnetic_losses()
	 * @generated
	 */
	void setTransformer_magnetic_losses(double value);

	/**
	 * Returns the value of the '<em><b>Transformer iron losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer iron losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer iron losses</em>' attribute.
	 * @see #setTransformer_iron_losses(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getCoefficients_Transformer_iron_losses()
	 * @model
	 * @generated
	 */
	double getTransformer_iron_losses();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.Coefficients#getTransformer_iron_losses <em>Transformer iron losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer iron losses</em>' attribute.
	 * @see #getTransformer_iron_losses()
	 * @generated
	 */
	void setTransformer_iron_losses(double value);

	/**
	 * Returns the value of the '<em><b>Line resistance losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line resistance losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line resistance losses</em>' attribute.
	 * @see #setLine_resistance_losses(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getCoefficients_Line_resistance_losses()
	 * @model
	 * @generated
	 */
	double getLine_resistance_losses();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.Coefficients#getLine_resistance_losses <em>Line resistance losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line resistance losses</em>' attribute.
	 * @see #getLine_resistance_losses()
	 * @generated
	 */
	void setLine_resistance_losses(double value);

	/**
	 * Returns the value of the '<em><b>Line reactance losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line reactance losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line reactance losses</em>' attribute.
	 * @see #setLine_reactance_losses(double)
	 * @see COSEM.COSEMObjects.COSEMObjectsPackage#getCoefficients_Line_reactance_losses()
	 * @model
	 * @generated
	 */
	double getLine_reactance_losses();

	/**
	 * Sets the value of the '{@link COSEM.COSEMObjects.Coefficients#getLine_reactance_losses <em>Line reactance losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line reactance losses</em>' attribute.
	 * @see #getLine_reactance_losses()
	 * @generated
	 */
	void setLine_reactance_losses(double value);

} // Coefficients
