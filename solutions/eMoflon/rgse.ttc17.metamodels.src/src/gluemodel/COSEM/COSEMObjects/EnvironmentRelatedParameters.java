/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Register;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Related Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getAmbient_temperature <em>Ambient temperature</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getAmbient_pressure <em>Ambient pressure</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getRelative_humidity <em>Relative humidity</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getEnvironmentRelatedParameters()
 * @model
 * @generated
 */
public interface EnvironmentRelatedParameters extends Register {
	/**
	 * Returns the value of the '<em><b>Ambient temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambient temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient temperature</em>' attribute.
	 * @see #setAmbient_temperature(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getEnvironmentRelatedParameters_Ambient_temperature()
	 * @model
	 * @generated
	 */
	double getAmbient_temperature();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getAmbient_temperature <em>Ambient temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient temperature</em>' attribute.
	 * @see #getAmbient_temperature()
	 * @generated
	 */
	void setAmbient_temperature(double value);

	/**
	 * Returns the value of the '<em><b>Ambient pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambient pressure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient pressure</em>' attribute.
	 * @see #setAmbient_pressure(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getEnvironmentRelatedParameters_Ambient_pressure()
	 * @model
	 * @generated
	 */
	double getAmbient_pressure();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getAmbient_pressure <em>Ambient pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient pressure</em>' attribute.
	 * @see #getAmbient_pressure()
	 * @generated
	 */
	void setAmbient_pressure(double value);

	/**
	 * Returns the value of the '<em><b>Relative humidity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative humidity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative humidity</em>' attribute.
	 * @see #setRelative_humidity(double)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getEnvironmentRelatedParameters_Relative_humidity()
	 * @model
	 * @generated
	 */
	double getRelative_humidity();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.EnvironmentRelatedParameters#getRelative_humidity <em>Relative humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative humidity</em>' attribute.
	 * @see #getRelative_humidity()
	 * @generated
	 */
	void setRelative_humidity(double value);

} // EnvironmentRelatedParameters
