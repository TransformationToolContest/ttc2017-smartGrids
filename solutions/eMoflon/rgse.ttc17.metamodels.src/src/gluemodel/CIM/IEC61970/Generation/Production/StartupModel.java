/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Startup Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStbyAuxP <em>Stby Aux P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartupDate <em>Startup Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartupPriority <em>Startup Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit start up characteristics depending on how long the unit has been off line'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Unit start up characteristics depending on how long the unit has been off line'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit start up characteristics depending on how long the unit has been off line' Profile\040documentation='Unit start up characteristics depending on how long the unit has been off line'"
 * @generated
 */
public interface StartupModel extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Start Ign Fuel Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Ign Fuel Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Ign Fuel Curve</em>' reference.
	 * @see #setStartIgnFuelCurve(StartIgnFuelCurve)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_StartIgnFuelCurve()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel
	 * @model opposite="StartupModel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit\'s startup model may have a startup ignition fuel curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s startup model may have a startup ignition fuel curve'"
	 * @generated
	 */
	StartIgnFuelCurve getStartIgnFuelCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ign Fuel Curve</em>' reference.
	 * @see #getStartIgnFuelCurve()
	 * @generated
	 */
	void setStartIgnFuelCurve(StartIgnFuelCurve value);

	/**
	 * Returns the value of the '<em><b>Fixed Maint Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Maint Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Maint Cost</em>' attribute.
	 * @see #setFixedMaintCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_FixedMaintCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CostRate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fixed Maintenance Cost'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fixed Maintenance Cost'"
	 * @generated
	 */
	float getFixedMaintCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Maint Cost</em>' attribute.
	 * @see #getFixedMaintCost()
	 * @generated
	 */
	void setFixedMaintCost(float value);

	/**
	 * Returns the value of the '<em><b>Risk Factor Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Factor Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Factor Cost</em>' attribute.
	 * @see #setRiskFactorCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_RiskFactorCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The opportunity cost associated with the return in monetary unit. This represents the restart\'s \"share\" of the unit depreciation and risk of an event which would damage the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The opportunity cost associated with the return in monetary unit. This represents the restart\'s \"share\" of the unit depreciation and risk of an event which would damage the unit.'"
	 * @generated
	 */
	float getRiskFactorCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Factor Cost</em>' attribute.
	 * @see #getRiskFactorCost()
	 * @generated
	 */
	void setRiskFactorCost(float value);

	/**
	 * Returns the value of the '<em><b>Stby Aux P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stby Aux P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stby Aux P</em>' attribute.
	 * @see #setStbyAuxP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_StbyAuxP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit\'s auxiliary active power consumption to maintain standby mode'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s auxiliary active power consumption to maintain standby mode'"
	 * @generated
	 */
	float getStbyAuxP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStbyAuxP <em>Stby Aux P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stby Aux P</em>' attribute.
	 * @see #getStbyAuxP()
	 * @generated
	 */
	void setStbyAuxP(float value);

	/**
	 * Returns the value of the '<em><b>Startup Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Date</em>' attribute.
	 * @see #setStartupDate(Date)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_StartupDate()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The date and time of the most recent generating unit startup'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The date and time of the most recent generating unit startup'"
	 * @generated
	 */
	Date getStartupDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartupDate <em>Startup Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Date</em>' attribute.
	 * @see #getStartupDate()
	 * @generated
	 */
	void setStartupDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Ramp Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.StartRampCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Ramp Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Ramp Curve</em>' reference.
	 * @see #setStartRampCurve(StartRampCurve)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_StartRampCurve()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.StartRampCurve#getStartupModel
	 * @model opposite="StartupModel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit\'s startup model may have a startup ramp curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s startup model may have a startup ramp curve'"
	 * @generated
	 */
	StartRampCurve getStartRampCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ramp Curve</em>' reference.
	 * @see #getStartRampCurve()
	 * @generated
	 */
	void setStartRampCurve(StartRampCurve value);

	/**
	 * Returns the value of the '<em><b>Minimum Down Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Down Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Down Time</em>' attribute.
	 * @see #setMinimumDownTime(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_MinimumDownTime()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Hours" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum number of hours the unit must be down before restart'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum number of hours the unit must be down before restart'"
	 * @generated
	 */
	float getMinimumDownTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Down Time</em>' attribute.
	 * @see #getMinimumDownTime()
	 * @generated
	 */
	void setMinimumDownTime(float value);

	/**
	 * Returns the value of the '<em><b>Minimum Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Run Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Run Time</em>' attribute.
	 * @see #setMinimumRunTime(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_MinimumRunTime()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Hours" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum number of hours the unit must be operating before being allowed to shut down'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum number of hours the unit must be operating before being allowed to shut down'"
	 * @generated
	 */
	float getMinimumRunTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Run Time</em>' attribute.
	 * @see #getMinimumRunTime()
	 * @generated
	 */
	void setMinimumRunTime(float value);

	/**
	 * Returns the value of the '<em><b>Start Main Fuel Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Main Fuel Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Main Fuel Curve</em>' reference.
	 * @see #setStartMainFuelCurve(StartMainFuelCurve)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_StartMainFuelCurve()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel
	 * @model opposite="StartupModel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit\'s startup model may have a startup main fuel curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s startup model may have a startup main fuel curve'"
	 * @generated
	 */
	StartMainFuelCurve getStartMainFuelCurve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Main Fuel Curve</em>' reference.
	 * @see #getStartMainFuelCurve()
	 * @generated
	 */
	void setStartMainFuelCurve(StartMainFuelCurve value);

	/**
	 * Returns the value of the '<em><b>Startup Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Priority</em>' attribute.
	 * @see #setStartupPriority(int)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_StartupPriority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Startup priority within control area where lower numbers indicate higher priorities.  More than one unit in an area may be assigned the same priority.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Startup priority within control area where lower numbers indicate higher priorities.  More than one unit in an area may be assigned the same priority.'"
	 * @generated
	 */
	int getStartupPriority();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartupPriority <em>Startup Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Priority</em>' attribute.
	 * @see #getStartupPriority()
	 * @generated
	 */
	void setStartupPriority(int value);

	/**
	 * Returns the value of the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Cost</em>' attribute.
	 * @see #setStartupCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_StartupCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Total miscellaneous start up costs'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Total miscellaneous start up costs'"
	 * @generated
	 */
	float getStartupCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getStartupCost <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Cost</em>' attribute.
	 * @see #getStartupCost()
	 * @generated
	 */
	void setStartupCost(float value);

	/**
	 * Returns the value of the '<em><b>Hot Standby Heat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Standby Heat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Standby Heat</em>' attribute.
	 * @see #setHotStandbyHeat(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_HotStandbyHeat()
	 * @model dataType="gluemodel.CIM.IEC61970.Generation.Production.HeatRate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The amount of heat input per time uint required for hot standby operation'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The amount of heat input per time uint required for hot standby operation'"
	 * @generated
	 */
	float getHotStandbyHeat();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Standby Heat</em>' attribute.
	 * @see #getHotStandbyHeat()
	 * @generated
	 */
	void setHotStandbyHeat(float value);

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_ThermalGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel
	 * @model opposite="StartupModel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have a startup model'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have a startup model'"
	 * @generated
	 */
	ThermalGeneratingUnit getThermalGeneratingUnit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	void setThermalGeneratingUnit(ThermalGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Incremental Maint Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Maint Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Maint Cost</em>' attribute.
	 * @see #setIncrementalMaintCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getStartupModel_IncrementalMaintCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CostPerEnergyUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Incremental Maintenance Cost'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Incremental Maintenance Cost'"
	 * @generated
	 */
	float getIncrementalMaintCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Maint Cost</em>' attribute.
	 * @see #getIncrementalMaintCost()
	 * @generated
	 */
	void setIncrementalMaintCost(float value);

} // StartupModel
