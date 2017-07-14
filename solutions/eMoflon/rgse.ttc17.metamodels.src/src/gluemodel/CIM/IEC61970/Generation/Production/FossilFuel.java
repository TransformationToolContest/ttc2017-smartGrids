/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fossil Fuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelCost <em>Fuel Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The fossil fuel consumed by the non-nuclear thermal generating units, e.g., coal, oil, gas'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='The fossil fuel consumed by the non-nuclear thermal generating units, e.g., coal, oil, gas'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The fossil fuel consumed by the non-nuclear thermal generating units, e.g., coal, oil, gas' Profile\040documentation='The fossil fuel consumed by the non-nuclear thermal generating units, e.g., coal, oil, gas'"
 * @generated
 */
public interface FossilFuel extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Fuel Eff Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Eff Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Eff Factor</em>' attribute.
	 * @see #setFuelEffFactor(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FuelEffFactor()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The efficiency factor for the fuel (per unit) in terms of the effective energy absorbed'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The efficiency factor for the fuel (per unit) in terms of the effective energy absorbed'"
	 * @generated
	 */
	float getFuelEffFactor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Eff Factor</em>' attribute.
	 * @see #getFuelEffFactor()
	 * @generated
	 */
	void setFuelEffFactor(float value);

	/**
	 * Returns the value of the '<em><b>Fossil Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fossil Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fossil Fuel Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.FuelType
	 * @see #setFossilFuelType(FuelType)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FossilFuelType()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The type of fossil fuel, such as coal, oil, or gas.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The type of fossil fuel, such as coal, oil, or gas.'"
	 * @generated
	 */
	FuelType getFossilFuelType();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fossil Fuel Type</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.FuelType
	 * @see #getFossilFuelType()
	 * @generated
	 */
	void setFossilFuelType(FuelType value);

	/**
	 * Returns the value of the '<em><b>Fuel Mixture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Mixture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Mixture</em>' attribute.
	 * @see #setFuelMixture(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FuelMixture()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Relative amount of the given type of fuel, when multiple fuels are being consumed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Relative amount of the given type of fuel, when multiple fuels are being consumed.'"
	 * @generated
	 */
	float getFuelMixture();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Mixture</em>' attribute.
	 * @see #getFuelMixture()
	 * @generated
	 */
	void setFuelMixture(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Cost</em>' attribute.
	 * @see #setFuelCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FuelCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Generation.Production.CostPerHeatUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The cost in terms of heat value for the given type of fuel'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The cost in terms of heat value for the given type of fuel'"
	 * @generated
	 */
	float getFuelCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelCost <em>Fuel Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Cost</em>' attribute.
	 * @see #getFuelCost()
	 * @generated
	 */
	void setFuelCost(float value);

	/**
	 * Returns the value of the '<em><b>Low Breakpoint P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Breakpoint P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Breakpoint P</em>' attribute.
	 * @see #setLowBreakpointP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_LowBreakpointP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The active power output level of the unit at which the given type of fuel is switched off. This fuel (e.g., oil) is sometimes used to stabilize the base fuel (e.g., coal) at low active power output levels.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The active power output level of the unit at which the given type of fuel is switched off. This fuel (e.g., oil) is sometimes used to stabilize the base fuel (e.g., coal) at low active power output levels.'"
	 * @generated
	 */
	float getLowBreakpointP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Breakpoint P</em>' attribute.
	 * @see #getLowBreakpointP()
	 * @generated
	 */
	void setLowBreakpointP(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Handling Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Handling Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Handling Cost</em>' attribute.
	 * @see #setFuelHandlingCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FuelHandlingCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Generation.Production.CostPerHeatUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Handling and processing cost associated with this fuel'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Handling and processing cost associated with this fuel'"
	 * @generated
	 */
	float getFuelHandlingCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Handling Cost</em>' attribute.
	 * @see #getFuelHandlingCost()
	 * @generated
	 */
	void setFuelHandlingCost(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Allocation Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Allocation Schedules</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FuelAllocationSchedules()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel
	 * @model opposite="FossilFuel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A fuel allocation schedule must have a fossil fuel'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A fuel allocation schedule must have a fossil fuel'"
	 * @generated
	 */
	EList<FuelAllocationSchedule> getFuelAllocationSchedules();

	/**
	 * Returns the value of the '<em><b>Fuel Sulfur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Sulfur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Sulfur</em>' attribute.
	 * @see #setFuelSulfur(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FuelSulfur()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The fuel\'s fraction of pollution credit per unit of heat content'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The fuel\'s fraction of pollution credit per unit of heat content'"
	 * @generated
	 */
	float getFuelSulfur();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Sulfur</em>' attribute.
	 * @see #getFuelSulfur()
	 * @generated
	 */
	void setFuelSulfur(float value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_ThermalGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels
	 * @model opposite="FossilFuels"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have one or more fossil fuels'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have one or more fossil fuels'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Fuel Heat Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Heat Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Heat Content</em>' attribute.
	 * @see #setFuelHeatContent(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FuelHeatContent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount of heat per weight (or volume) of the given type of fuel'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount of heat per weight (or volume) of the given type of fuel'"
	 * @generated
	 */
	float getFuelHeatContent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Heat Content</em>' attribute.
	 * @see #getFuelHeatContent()
	 * @generated
	 */
	void setFuelHeatContent(float value);

	/**
	 * Returns the value of the '<em><b>High Breakpoint P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Breakpoint P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Breakpoint P</em>' attribute.
	 * @see #setHighBreakpointP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_HighBreakpointP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The active power output level of the unit at which the given type of fuel is switched on. This fuel (e.g., oil) is sometimes used to supplement the base fuel (e.g., coal) at high active power output levels.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The active power output level of the unit at which the given type of fuel is switched on. This fuel (e.g., oil) is sometimes used to supplement the base fuel (e.g., coal) at high active power output levels.'"
	 * @generated
	 */
	float getHighBreakpointP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Breakpoint P</em>' attribute.
	 * @see #getHighBreakpointP()
	 * @generated
	 */
	void setHighBreakpointP(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Dispatch Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Dispatch Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Dispatch Cost</em>' attribute.
	 * @see #setFuelDispatchCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getFossilFuel_FuelDispatchCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Generation.Production.CostPerHeatUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The cost of fuel used for economic dispatching which includes: fuel cost, transportation cost,  and incremental maintenance cost'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The cost of fuel used for economic dispatching which includes: fuel cost, transportation cost,  and incremental maintenance cost'"
	 * @generated
	 */
	float getFuelDispatchCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Dispatch Cost</em>' attribute.
	 * @see #getFuelDispatchCost()
	 * @generated
	 */
	void setFuelDispatchCost(float value);

} // FossilFuel
