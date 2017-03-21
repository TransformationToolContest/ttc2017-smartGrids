/**
 */
package CIM.IEC61970.Generation.Production;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thermal Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generating unit whose prime mover could be a steam turbine, combustion turbine, or diesel engine.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A generating unit whose prime mover could be a steam turbine, combustion turbine, or diesel engine.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit whose prime mover could be a steam turbine, combustion turbine, or diesel engine.' Profile\040documentation='A generating unit whose prime mover could be a steam turbine, combustion turbine, or diesel engine.'"
 * @generated
 */
public interface ThermalGeneratingUnit extends GeneratingUnit {
	/**
	 * Returns the value of the '<em><b>Combined Cycle Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Cycle Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Cycle Plant</em>' reference.
	 * @see #setCombinedCyclePlant(CombinedCyclePlant)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_CombinedCyclePlant()
	 * @see CIM.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits
	 * @model opposite="ThermalGeneratingUnits"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may be a member of a combined cycle plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may be a member of a combined cycle plant'"
	 * @generated
	 */
	CombinedCyclePlant getCombinedCyclePlant();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Cycle Plant</em>' reference.
	 * @see #getCombinedCyclePlant()
	 * @generated
	 */
	void setCombinedCyclePlant(CombinedCyclePlant value);

	/**
	 * Returns the value of the '<em><b>CAES Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CAES Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CAES Plant</em>' reference.
	 * @see #setCAESPlant(CAESPlant)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_CAESPlant()
	 * @see CIM.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may be a member of a compressed air energy storage plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may be a member of a compressed air energy storage plant'"
	 * @generated
	 */
	CAESPlant getCAESPlant();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAES Plant</em>' reference.
	 * @see #getCAESPlant()
	 * @generated
	 */
	void setCAESPlant(CAESPlant value);

	/**
	 * Returns the value of the '<em><b>Emission Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.EmissionCurve}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Curves</em>' reference list.
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_EmissionCurves()
	 * @see CIM.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have  one or more emission curves'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have  one or more emission curves'"
	 * @generated
	 */
	EList<EmissionCurve> getEmissionCurves();

	/**
	 * Returns the value of the '<em><b>Heat Input Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Input Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Input Curve</em>' reference.
	 * @see #setHeatInputCurve(HeatInputCurve)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_HeatInputCurve()
	 * @see CIM.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have a heat input curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have a heat input curve'"
	 * @generated
	 */
	HeatInputCurve getHeatInputCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Input Curve</em>' reference.
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	void setHeatInputCurve(HeatInputCurve value);

	/**
	 * Returns the value of the '<em><b>Shutdown Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Curve</em>' reference.
	 * @see #setShutdownCurve(ShutdownCurve)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_ShutdownCurve()
	 * @see CIM.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have a shutdown curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have a shutdown curve'"
	 * @generated
	 */
	ShutdownCurve getShutdownCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Curve</em>' reference.
	 * @see #getShutdownCurve()
	 * @generated
	 */
	void setShutdownCurve(ShutdownCurve value);

	/**
	 * Returns the value of the '<em><b>Heat Rate Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Rate Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Rate Curve</em>' reference.
	 * @see #setHeatRateCurve(HeatRateCurve)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_HeatRateCurve()
	 * @see CIM.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have a heat rate curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have a heat rate curve'"
	 * @generated
	 */
	HeatRateCurve getHeatRateCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Rate Curve</em>' reference.
	 * @see #getHeatRateCurve()
	 * @generated
	 */
	void setHeatRateCurve(HeatRateCurve value);

	/**
	 * Returns the value of the '<em><b>Incremental Heat Rate Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Heat Rate Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Heat Rate Curve</em>' reference.
	 * @see #setIncrementalHeatRateCurve(IncrementalHeatRateCurve)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_IncrementalHeatRateCurve()
	 * @see CIM.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have an incremental heat rate curve'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have an incremental heat rate curve'"
	 * @generated
	 */
	IncrementalHeatRateCurve getIncrementalHeatRateCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Heat Rate Curve</em>' reference.
	 * @see #getIncrementalHeatRateCurve()
	 * @generated
	 */
	void setIncrementalHeatRateCurve(IncrementalHeatRateCurve value);

	/**
	 * Returns the value of the '<em><b>OM Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM Cost</em>' attribute.
	 * @see #setOMCost(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_OMCost()
	 * @model dataType="CIM.IEC61970.Generation.Production.CostPerHeatUnit" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operating and maintenance cost for the thermal unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operating and maintenance cost for the thermal unit'"
	 * @generated
	 */
	float getOMCost();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM Cost</em>' attribute.
	 * @see #getOMCost()
	 * @generated
	 */
	void setOMCost(float value);

	/**
	 * Returns the value of the '<em><b>Cogeneration Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogeneration Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogeneration Plant</em>' reference.
	 * @see #setCogenerationPlant(CogenerationPlant)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_CogenerationPlant()
	 * @see CIM.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits
	 * @model opposite="ThermalGeneratingUnits"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may be a member of a cogeneration plant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may be a member of a cogeneration plant'"
	 * @generated
	 */
	CogenerationPlant getCogenerationPlant();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogeneration Plant</em>' reference.
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	void setCogenerationPlant(CogenerationPlant value);

	/**
	 * Returns the value of the '<em><b>Fossil Fuels</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.FossilFuel}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fossil Fuels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fossil Fuels</em>' reference list.
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_FossilFuels()
	 * @see CIM.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have one or more fossil fuels'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have one or more fossil fuels'"
	 * @generated
	 */
	EList<FossilFuel> getFossilFuels();

	/**
	 * Returns the value of the '<em><b>Startup Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Model</em>' reference.
	 * @see #setStartupModel(StartupModel)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_StartupModel()
	 * @see CIM.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have a startup model'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have a startup model'"
	 * @generated
	 */
	StartupModel getStartupModel();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Model</em>' reference.
	 * @see #getStartupModel()
	 * @generated
	 */
	void setStartupModel(StartupModel value);

	/**
	 * Returns the value of the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Allocation Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Allocation Schedules</em>' reference list.
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_FuelAllocationSchedules()
	 * @see CIM.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have one or more fuel allocation schedules'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have one or more fuel allocation schedules'"
	 * @generated
	 */
	EList<FuelAllocationSchedule> getFuelAllocationSchedules();

	/**
	 * Returns the value of the '<em><b>Emmission Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Generation.Production.EmissionAccount}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emmission Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emmission Accounts</em>' reference list.
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit_EmmissionAccounts()
	 * @see CIM.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit
	 * @model opposite="ThermalGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A thermal generating unit may have one or more emission allowance accounts'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A thermal generating unit may have one or more emission allowance accounts'"
	 * @generated
	 */
	EList<EmissionAccount> getEmmissionAccounts();

} // ThermalGeneratingUnit
