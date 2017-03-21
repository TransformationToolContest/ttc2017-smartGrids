/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Power Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType <em>Hydro Plant Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getReservoir <em>Reservoir</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A hydro power station which can generate or pump. When generating, the generator turbines receive there water from an upper reservoir. When pumping, the pumps receive their water from a lower reservoir.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A hydro power station which can generate or pump. When generating, the generator turbines receive there water from an upper reservoir. When pumping, the pumps receive their water from a lower reservoir.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A hydro power station which can generate or pump. When generating, the generator turbines receive there water from an upper reservoir. When pumping, the pumps receive their water from a lower reservoir.' Profile\040documentation='A hydro power station which can generate or pump. When generating, the generator turbines receive there water from an upper reservoir. When pumping, the pumps receive their water from a lower reservoir.'"
 * @generated
 */
public interface HydroPowerPlant extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Gen Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Rated P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Rated P</em>' attribute.
	 * @see #setGenRatedP(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_GenRatedP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro plant\'s generating rating active power for rated head conditions'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro plant\'s generating rating active power for rated head conditions'"
	 * @generated
	 */
	float getGenRatedP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Rated P</em>' attribute.
	 * @see #getGenRatedP()
	 * @generated
	 */
	void setGenRatedP(float value);

	/**
	 * Returns the value of the '<em><b>Gen Source Pump Discharge Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Source Pump Discharge Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Source Pump Discharge Reservoir</em>' reference.
	 * @see #setGenSourcePumpDischargeReservoir(Reservoir)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_GenSourcePumpDischargeReservoir()
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants
	 * @model opposite="UpstreamFromHydroPowerPlants"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generators are supplied water from or pumps discharge water to an upstream reservoir'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generators are supplied water from or pumps discharge water to an upstream reservoir'"
	 * @generated
	 */
	Reservoir getGenSourcePumpDischargeReservoir();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Source Pump Discharge Reservoir</em>' reference.
	 * @see #getGenSourcePumpDischargeReservoir()
	 * @generated
	 */
	void setGenSourcePumpDischargeReservoir(Reservoir value);

	/**
	 * Returns the value of the '<em><b>Hydro Generating Units</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Generating Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Generating Units</em>' reference list.
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_HydroGeneratingUnits()
	 * @see CIM.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant
	 * @model opposite="HydroPowerPlant"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro generating unit belongs to a hydro power plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro generating unit belongs to a hydro power plant'"
	 * @generated
	 */
	EList<HydroGeneratingUnit> getHydroGeneratingUnits();

	/**
	 * Returns the value of the '<em><b>Surge Tank Crest Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surge Tank Crest Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surge Tank Crest Level</em>' attribute.
	 * @see #setSurgeTankCrestLevel(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_SurgeTankCrestLevel()
	 * @model dataType="CIM.IEC61970.Domain.WaterLevel" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The level at which the surge tank spills'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The level at which the surge tank spills'"
	 * @generated
	 */
	float getSurgeTankCrestLevel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surge Tank Crest Level</em>' attribute.
	 * @see #getSurgeTankCrestLevel()
	 * @generated
	 */
	void setSurgeTankCrestLevel(float value);

	/**
	 * Returns the value of the '<em><b>Discharge Travel Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discharge Travel Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discharge Travel Delay</em>' attribute.
	 * @see #setDischargeTravelDelay(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_DischargeTravelDelay()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Water travel delay from tailbay to next downstream hydro power station'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Water travel delay from tailbay to next downstream hydro power station'"
	 * @generated
	 */
	float getDischargeTravelDelay();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discharge Travel Delay</em>' attribute.
	 * @see #getDischargeTravelDelay()
	 * @generated
	 */
	void setDischargeTravelDelay(float value);

	/**
	 * Returns the value of the '<em><b>Pump Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Rated P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Rated P</em>' attribute.
	 * @see #setPumpRatedP(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_PumpRatedP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro plant\'s pumping rating active power for rated head conditions'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro plant\'s pumping rating active power for rated head conditions'"
	 * @generated
	 */
	float getPumpRatedP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Rated P</em>' attribute.
	 * @see #getPumpRatedP()
	 * @generated
	 */
	void setPumpRatedP(float value);

	/**
	 * Returns the value of the '<em><b>Penstock Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Generation.Production.PenstockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penstock Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penstock Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.PenstockType
	 * @see #setPenstockType(PenstockType)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_PenstockType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type and configuration of hydro plant penstock(s)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type and configuration of hydro plant penstock(s)'"
	 * @generated
	 */
	PenstockType getPenstockType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penstock Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.PenstockType
	 * @see #getPenstockType()
	 * @generated
	 */
	void setPenstockType(PenstockType value);

	/**
	 * Returns the value of the '<em><b>Hydro Plant Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Generation.Production.HydroPlantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Plant Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Plant Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.HydroPlantType
	 * @see #setHydroPlantType(HydroPlantType)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_HydroPlantType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of hydro power plant.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of hydro power plant.'"
	 * @generated
	 */
	HydroPlantType getHydroPlantType();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType <em>Hydro Plant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Plant Type</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.HydroPlantType
	 * @see #getHydroPlantType()
	 * @generated
	 */
	void setHydroPlantType(HydroPlantType value);

	/**
	 * Returns the value of the '<em><b>Hydro Pumps</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.HydroPump}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Pumps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Pumps</em>' reference list.
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_HydroPumps()
	 * @see CIM.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant
	 * @model opposite="HydroPowerPlant"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro pump may be a member of a pumped storage plant or a pump for distributing water'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro pump may be a member of a pumped storage plant or a pump for distributing water'"
	 * @generated
	 */
	EList<HydroPump> getHydroPumps();

	/**
	 * Returns the value of the '<em><b>Plant Rated Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Rated Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Rated Head</em>' attribute.
	 * @see #setPlantRatedHead(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_PlantRatedHead()
	 * @model dataType="CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The plant\'s rated gross head'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The plant\'s rated gross head'"
	 * @generated
	 */
	float getPlantRatedHead();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Rated Head</em>' attribute.
	 * @see #getPlantRatedHead()
	 * @generated
	 */
	void setPlantRatedHead(float value);

	/**
	 * Returns the value of the '<em><b>Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservoir</em>' reference.
	 * @see #setReservoir(Reservoir)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_Reservoir()
	 * @see CIM.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants
	 * @model opposite="HydroPowerPlants"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generators discharge water to or pumps are supplied water from a downstream reservoir'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generators discharge water to or pumps are supplied water from a downstream reservoir'"
	 * @generated
	 */
	Reservoir getReservoir();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getReservoir <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservoir</em>' reference.
	 * @see #getReservoir()
	 * @generated
	 */
	void setReservoir(Reservoir value);

	/**
	 * Returns the value of the '<em><b>Surge Tank Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Generation.Production.SurgeTankCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surge Tank Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surge Tank Code</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.SurgeTankCode
	 * @see #setSurgeTankCode(SurgeTankCode)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_SurgeTankCode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A code describing the type (or absence) of surge tank that is associated with the hydro power plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A code describing the type (or absence) of surge tank that is associated with the hydro power plant'"
	 * @generated
	 */
	SurgeTankCode getSurgeTankCode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surge Tank Code</em>' attribute.
	 * @see CIM.IEC61970.Generation.Production.SurgeTankCode
	 * @see #getSurgeTankCode()
	 * @generated
	 */
	void setSurgeTankCode(SurgeTankCode value);

	/**
	 * Returns the value of the '<em><b>Plant Discharge Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Discharge Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Discharge Capacity</em>' attribute.
	 * @see #setPlantDischargeCapacity(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant_PlantDischargeCapacity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total plant discharge capacity in cubic meters per second'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total plant discharge capacity in cubic meters per second'"
	 * @generated
	 */
	float getPlantDischargeCapacity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Discharge Capacity</em>' attribute.
	 * @see #getPlantDischargeCapacity()
	 * @generated
	 */
	void setPlantDischargeCapacity(float value);

} // HydroPowerPlant
