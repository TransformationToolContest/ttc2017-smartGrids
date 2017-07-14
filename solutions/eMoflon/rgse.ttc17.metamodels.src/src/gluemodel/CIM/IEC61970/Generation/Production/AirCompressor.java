/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Air Compressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.AirCompressor#getCAESPlant <em>CAES Plant</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getAirCompressor()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Combustion turbine air compressor which is an integral part of a compressed air energy storage (CAES) plant'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Combustion turbine air compressor which is an integral part of a compressed air energy storage (CAES) plant'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Combustion turbine air compressor which is an integral part of a compressed air energy storage (CAES) plant' Profile\040documentation='Combustion turbine air compressor which is an integral part of a compressed air energy storage (CAES) plant'"
 * @generated
 */
public interface AirCompressor extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Combustion Turbine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Turbine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Turbine</em>' reference.
	 * @see #setCombustionTurbine(CombustionTurbine)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getAirCompressor_CombustionTurbine()
	 * @see gluemodel.CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor
	 * @model opposite="AirCompressor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A CAES air compressor is driven by combustion turbine'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A CAES air compressor is driven by combustion turbine'"
	 * @generated
	 */
	CombustionTurbine getCombustionTurbine();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combustion Turbine</em>' reference.
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	void setCombustionTurbine(CombustionTurbine value);

	/**
	 * Returns the value of the '<em><b>CAES Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getAirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CAES Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CAES Plant</em>' reference.
	 * @see #setCAESPlant(CAESPlant)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getAirCompressor_CAESPlant()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getAirCompressor
	 * @model opposite="AirCompressor"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An air compressor may be a member of a compressed air energy storage plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An air compressor may be a member of a compressed air energy storage plant'"
	 * @generated
	 */
	CAESPlant getCAESPlant();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.AirCompressor#getCAESPlant <em>CAES Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAES Plant</em>' reference.
	 * @see #getCAESPlant()
	 * @generated
	 */
	void setCAESPlant(CAESPlant value);

	/**
	 * Returns the value of the '<em><b>Air Compressor Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air Compressor Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Compressor Rating</em>' attribute.
	 * @see #setAirCompressorRating(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getAirCompressor_AirCompressorRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rating of the CAES air compressor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rating of the CAES air compressor'"
	 * @generated
	 */
	float getAirCompressorRating();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Compressor Rating</em>' attribute.
	 * @see #getAirCompressorRating()
	 * @generated
	 */
	void setAirCompressorRating(float value);

} // AirCompressor
