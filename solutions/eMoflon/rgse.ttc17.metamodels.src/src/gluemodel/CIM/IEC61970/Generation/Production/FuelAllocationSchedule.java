/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.Curve;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuel Allocation Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount of fuel of a given type which is allocated for consumption over a specified period of time'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The amount of fuel of a given type which is allocated for consumption over a specified period of time'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount of fuel of a given type which is allocated for consumption over a specified period of time' Profile\040documentation='The amount of fuel of a given type which is allocated for consumption over a specified period of time'"
 * @generated
 */
public interface FuelAllocationSchedule extends Curve {
	/**
	 * Returns the value of the '<em><b>Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.FuelType
	 * @see #setFuelType(FuelType)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule_FuelType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of fuel, which also indicates the corresponding measurement unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of fuel, which also indicates the corresponding measurement unit'"
	 * @generated
	 */
	FuelType getFuelType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.FuelType
	 * @see #getFuelType()
	 * @generated
	 */
	void setFuelType(FuelType value);

	/**
	 * Returns the value of the '<em><b>Max Fuel Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Fuel Allocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Fuel Allocation</em>' attribute.
	 * @see #setMaxFuelAllocation(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule_MaxFuelAllocation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum amount fuel that is allocated for consumption for the scheduled time period'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum amount fuel that is allocated for consumption for the scheduled time period'"
	 * @generated
	 */
	float getMaxFuelAllocation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Fuel Allocation</em>' attribute.
	 * @see #getMaxFuelAllocation()
	 * @generated
	 */
	void setMaxFuelAllocation(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Allocation Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Allocation Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Allocation Start Date</em>' attribute.
	 * @see #setFuelAllocationStartDate(Date)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule_FuelAllocationStartDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The start time and date of the fuel allocation schedule'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The start time and date of the fuel allocation schedule'"
	 * @generated
	 */
	Date getFuelAllocationStartDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Allocation Start Date</em>' attribute.
	 * @see #getFuelAllocationStartDate()
	 * @generated
	 */
	void setFuelAllocationStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fossil Fuel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fossil Fuel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fossil Fuel</em>' reference.
	 * @see #setFossilFuel(FossilFuel)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule_FossilFuel()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules
	 * @model opposite="FuelAllocationSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A fuel allocation schedule must have a fossil fuel'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A fuel allocation schedule must have a fossil fuel'"
	 * @generated
	 */
	FossilFuel getFossilFuel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fossil Fuel</em>' reference.
	 * @see #getFossilFuel()
	 * @generated
	 */
	void setFossilFuel(FossilFuel value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule_ThermalGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules
	 * @model opposite="FuelAllocationSchedules"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have one or more fuel allocation schedules'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have one or more fuel allocation schedules'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Min Fuel Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Fuel Allocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Fuel Allocation</em>' attribute.
	 * @see #setMinFuelAllocation(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule_MinFuelAllocation()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum amount fuel that is allocated for consumption for the scheduled time period, e.g., based on a \"take-or-pay\" contract'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum amount fuel that is allocated for consumption for the scheduled time period, e.g., based on a \"take-or-pay\" contract'"
	 * @generated
	 */
	float getMinFuelAllocation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Fuel Allocation</em>' attribute.
	 * @see #getMinFuelAllocation()
	 * @generated
	 */
	void setMinFuelAllocation(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Allocation End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Allocation End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Allocation End Date</em>' attribute.
	 * @see #setFuelAllocationEndDate(Date)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule_FuelAllocationEndDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The end time and date of the fuel allocation schedule'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The end time and date of the fuel allocation schedule'"
	 * @generated
	 */
	Date getFuelAllocationEndDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Allocation End Date</em>' attribute.
	 * @see #getFuelAllocationEndDate()
	 * @generated
	 */
	void setFuelAllocationEndDate(Date value);

} // FuelAllocationSchedule
