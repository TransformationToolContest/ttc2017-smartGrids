/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAES Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP <em>Rated Capacity P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getAirCompressor <em>Air Compressor</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getCAESPlant()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Compressed air energy storage plant'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Compressed air energy storage plant'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Compressed air energy storage plant' Profile\040documentation='Compressed air energy storage plant'"
 * @generated
 */
public interface CAESPlant extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Energy Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Storage Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Storage Capacity</em>' attribute.
	 * @see #setEnergyStorageCapacity(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getCAESPlant_EnergyStorageCapacity()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.RealEnergy" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The rated energy storage capacity.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The rated energy storage capacity.'"
	 * @generated
	 */
	float getEnergyStorageCapacity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Storage Capacity</em>' attribute.
	 * @see #getEnergyStorageCapacity()
	 * @generated
	 */
	void setEnergyStorageCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Rated Capacity P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Capacity P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Capacity P</em>' attribute.
	 * @see #setRatedCapacityP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getCAESPlant_RatedCapacityP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The CAES plant\'s gross rated generating capacity'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The CAES plant\'s gross rated generating capacity'"
	 * @generated
	 */
	float getRatedCapacityP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP <em>Rated Capacity P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Capacity P</em>' attribute.
	 * @see #getRatedCapacityP()
	 * @generated
	 */
	void setRatedCapacityP(float value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getCAESPlant_ThermalGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant
	 * @model opposite="CAESPlant"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may be a member of a compressed air energy storage plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may be a member of a compressed air energy storage plant'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Air Compressor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.AirCompressor#getCAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air Compressor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Compressor</em>' reference.
	 * @see #setAirCompressor(AirCompressor)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getCAESPlant_AirCompressor()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.AirCompressor#getCAESPlant
	 * @model opposite="CAESPlant"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An air compressor may be a member of a compressed air energy storage plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An air compressor may be a member of a compressed air energy storage plant'"
	 * @generated
	 */
	AirCompressor getAirCompressor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.CAESPlant#getAirCompressor <em>Air Compressor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Compressor</em>' reference.
	 * @see #getAirCompressor()
	 * @generated
	 */
	void setAirCompressor(AirCompressor value);

} // CAESPlant
