/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservoir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getInflowForecasts <em>Inflow Forecasts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getGrossCapacity <em>Gross Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A water storage facility within a hydro system, including: ponds, lakes, lagoons, and rivers. The storage is usually behind some type of dam.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A water storage facility within a hydro system, including: ponds, lakes, lagoons, and rivers. The storage is usually behind some type of dam.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A water storage facility within a hydro system, including: ponds, lakes, lagoons, and rivers. The storage is usually behind some type of dam.' Profile\040documentation='A water storage facility within a hydro system, including: ponds, lakes, lagoons, and rivers. The storage is usually behind some type of dam.'"
 * @generated
 */
public interface Reservoir extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Active Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Storage Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Storage Capacity</em>' attribute.
	 * @see #setActiveStorageCapacity(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_ActiveStorageCapacity()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Volume" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Storage volume between the full supply level and the normal minimum operating level'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Storage volume between the full supply level and the normal minimum operating level'"
	 * @generated
	 */
	float getActiveStorageCapacity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Storage Capacity</em>' attribute.
	 * @see #getActiveStorageCapacity()
	 * @generated
	 */
	void setActiveStorageCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Upstream From Hydro Power Plants</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upstream From Hydro Power Plants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream From Hydro Power Plants</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_UpstreamFromHydroPowerPlants()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir
	 * @model opposite="GenSourcePumpDischargeReservoir"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generators are supplied water from or pumps discharge water to an upstream reservoir'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generators are supplied water from or pumps discharge water to an upstream reservoir'"
	 * @generated
	 */
	EList<HydroPowerPlant> getUpstreamFromHydroPowerPlants();

	/**
	 * Returns the value of the '<em><b>Spills Into Reservoirs</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spills Into Reservoirs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spills Into Reservoirs</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_SpillsIntoReservoirs()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir
	 * @model opposite="SpillsFromReservoir"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reservoir may spill into a downstream reservoir'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reservoir may spill into a downstream reservoir'"
	 * @generated
	 */
	EList<Reservoir> getSpillsIntoReservoirs();

	/**
	 * Returns the value of the '<em><b>Spills From Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spills From Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spills From Reservoir</em>' reference.
	 * @see #setSpillsFromReservoir(Reservoir)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_SpillsFromReservoir()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs
	 * @model opposite="SpillsIntoReservoirs"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reservoir may spill into a downstream reservoir'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reservoir may spill into a downstream reservoir'"
	 * @generated
	 */
	Reservoir getSpillsFromReservoir();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spills From Reservoir</em>' reference.
	 * @see #getSpillsFromReservoir()
	 * @generated
	 */
	void setSpillsFromReservoir(Reservoir value);

	/**
	 * Returns the value of the '<em><b>Level Vs Volume Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.LevelVsVolumeCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Vs Volume Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Vs Volume Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_LevelVsVolumeCurves()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir
	 * @model opposite="Reservoir"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reservoir may have a level versus volume relationship.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reservoir may have a level versus volume relationship.'"
	 * @generated
	 */
	EList<LevelVsVolumeCurve> getLevelVsVolumeCurves();

	/**
	 * Returns the value of the '<em><b>Inflow Forecasts</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.InflowForecast}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.InflowForecast#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inflow Forecasts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inflow Forecasts</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_InflowForecasts()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.InflowForecast#getReservoir
	 * @model opposite="Reservoir"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reservoir may have a \"natural\" inflow forecast.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reservoir may have a \"natural\" inflow forecast.'"
	 * @generated
	 */
	EList<InflowForecast> getInflowForecasts();

	/**
	 * Returns the value of the '<em><b>Spill Travel Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spill Travel Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spill Travel Delay</em>' attribute.
	 * @see #setSpillTravelDelay(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_SpillTravelDelay()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The spillway water travel delay to the next downstream reservoir'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The spillway water travel delay to the next downstream reservoir'"
	 * @generated
	 */
	float getSpillTravelDelay();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spill Travel Delay</em>' attribute.
	 * @see #getSpillTravelDelay()
	 * @generated
	 */
	void setSpillTravelDelay(float value);

	/**
	 * Returns the value of the '<em><b>River Outlet Works</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>River Outlet Works</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>River Outlet Works</em>' attribute.
	 * @see #setRiverOutletWorks(String)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_RiverOutletWorks()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='River outlet works for riparian right releases or other purposes'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='River outlet works for riparian right releases or other purposes'"
	 * @generated
	 */
	String getRiverOutletWorks();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>River Outlet Works</em>' attribute.
	 * @see #getRiverOutletWorks()
	 * @generated
	 */
	void setRiverOutletWorks(String value);

	/**
	 * Returns the value of the '<em><b>Normal Min Operate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Min Operate Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Min Operate Level</em>' attribute.
	 * @see #setNormalMinOperateLevel(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_NormalMinOperateLevel()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.WaterLevel" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Normal minimum operating level below which the penstocks will draw air'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Normal minimum operating level below which the penstocks will draw air'"
	 * @generated
	 */
	float getNormalMinOperateLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Min Operate Level</em>' attribute.
	 * @see #getNormalMinOperateLevel()
	 * @generated
	 */
	void setNormalMinOperateLevel(float value);

	/**
	 * Returns the value of the '<em><b>Spillway Crest Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spillway Crest Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spillway Crest Level</em>' attribute.
	 * @see #setSpillwayCrestLevel(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_SpillwayCrestLevel()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.WaterLevel" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Spillway crest level above which water will spill'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Spillway crest level above which water will spill'"
	 * @generated
	 */
	float getSpillwayCrestLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spillway Crest Level</em>' attribute.
	 * @see #getSpillwayCrestLevel()
	 * @generated
	 */
	void setSpillwayCrestLevel(float value);

	/**
	 * Returns the value of the '<em><b>Full Supply Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Supply Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Supply Level</em>' attribute.
	 * @see #setFullSupplyLevel(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_FullSupplyLevel()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.WaterLevel" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Full supply level, above which water will spill. This can be the spillway crest level or the top of closed gates.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Full supply level, above which water will spill. This can be the spillway crest level or the top of closed gates.'"
	 * @generated
	 */
	float getFullSupplyLevel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Supply Level</em>' attribute.
	 * @see #getFullSupplyLevel()
	 * @generated
	 */
	void setFullSupplyLevel(float value);

	/**
	 * Returns the value of the '<em><b>Spillway Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spillway Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spillway Capacity</em>' attribute.
	 * @see #setSpillwayCapacity(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_SpillwayCapacity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The flow capacity of the spillway in cubic meters per second'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The flow capacity of the spillway in cubic meters per second'"
	 * @generated
	 */
	float getSpillwayCapacity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spillway Capacity</em>' attribute.
	 * @see #getSpillwayCapacity()
	 * @generated
	 */
	void setSpillwayCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Target Level Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Level Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Level Schedule</em>' reference.
	 * @see #setTargetLevelSchedule(TargetLevelSchedule)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_TargetLevelSchedule()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir
	 * @model opposite="Reservoir"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A reservoir may have a water level target schedule.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A reservoir may have a water level target schedule.'"
	 * @generated
	 */
	TargetLevelSchedule getTargetLevelSchedule();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Level Schedule</em>' reference.
	 * @see #getTargetLevelSchedule()
	 * @generated
	 */
	void setTargetLevelSchedule(TargetLevelSchedule value);

	/**
	 * Returns the value of the '<em><b>Spill Way Gate Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.SpillwayGateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spill Way Gate Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spill Way Gate Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.SpillwayGateType
	 * @see #setSpillWayGateType(SpillwayGateType)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_SpillWayGateType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Type of spillway gate, including parameters'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Type of spillway gate, including parameters'"
	 * @generated
	 */
	SpillwayGateType getSpillWayGateType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spill Way Gate Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.SpillwayGateType
	 * @see #getSpillWayGateType()
	 * @generated
	 */
	void setSpillWayGateType(SpillwayGateType value);

	/**
	 * Returns the value of the '<em><b>Spillway Crest Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spillway Crest Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spillway Crest Length</em>' attribute.
	 * @see #setSpillwayCrestLength(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_SpillwayCrestLength()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The length of the spillway crest'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The length of the spillway crest'"
	 * @generated
	 */
	float getSpillwayCrestLength();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spillway Crest Length</em>' attribute.
	 * @see #getSpillwayCrestLength()
	 * @generated
	 */
	void setSpillwayCrestLength(float value);

	/**
	 * Returns the value of the '<em><b>Energy Storage Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Storage Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Storage Rating</em>' attribute.
	 * @see #setEnergyStorageRating(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_EnergyStorageRating()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The reservoir\'s energy storage rating in energy for given head conditions'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The reservoir\'s energy storage rating in energy for given head conditions'"
	 * @generated
	 */
	float getEnergyStorageRating();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Storage Rating</em>' attribute.
	 * @see #getEnergyStorageRating()
	 * @generated
	 */
	void setEnergyStorageRating(float value);

	/**
	 * Returns the value of the '<em><b>Gross Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross Capacity</em>' attribute.
	 * @see #setGrossCapacity(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_GrossCapacity()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Volume" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total capacity of reservoir'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total capacity of reservoir'"
	 * @generated
	 */
	float getGrossCapacity();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.Reservoir#getGrossCapacity <em>Gross Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Capacity</em>' attribute.
	 * @see #getGrossCapacity()
	 * @generated
	 */
	void setGrossCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Hydro Power Plants</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Power Plants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Power Plants</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getReservoir_HydroPowerPlants()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant#getReservoir
	 * @model opposite="Reservoir"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generators discharge water to or pumps are supplied water from a downstream reservoir'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generators discharge water to or pumps are supplied water from a downstream reservoir'"
	 * @generated
	 */
	EList<HydroPowerPlant> getHydroPowerPlants();

} // Reservoir
