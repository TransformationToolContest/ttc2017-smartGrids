/**
 */
package CIM.IEC61970.Generation.GenerationDynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fossil Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlPG <em>Pressure Ctrl PG</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterPG <em>Feed Water PG</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlTC <em>Control TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMaxErrorRateP <em>Max Error Rate P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlIC <em>Control IC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMinErrorRateP <em>Min Error Rate P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelDemandLimit <em>Fuel Demand Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlDG <em>Pressure Ctrl DG</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPC <em>Control PC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterTC <em>Feed Water TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlErrorBiasP <em>Control Error Bias P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterIG <em>Feed Water IG</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlIG <em>Pressure Ctrl IG</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyTC <em>Fuel Supply TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureFeedback <em>Pressure Feedback</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyDelay <em>Fuel Supply Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getBoilerControlMode <em>Boiler Control Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPEB <em>Control PEB</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPED <em>Control PED</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fossil fueled boiler (e.g., coal, oil, gas)'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Fossil fueled boiler (e.g., coal, oil, gas)'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fossil fueled boiler (e.g., coal, oil, gas)' Profile\040documentation='Fossil fueled boiler (e.g., coal, oil, gas)'"
 * @generated
 */
public interface FossilSteamSupply extends SteamSupply {
	/**
	 * Returns the value of the '<em><b>Pressure Ctrl PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Ctrl PG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Ctrl PG</em>' attribute.
	 * @see #setPressureCtrlPG(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_PressureCtrlPG()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Control Proportional Gain ratio'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Control Proportional Gain ratio'"
	 * @generated
	 */
	float getPressureCtrlPG();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlPG <em>Pressure Ctrl PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Ctrl PG</em>' attribute.
	 * @see #getPressureCtrlPG()
	 * @generated
	 */
	void setPressureCtrlPG(float value);

	/**
	 * Returns the value of the '<em><b>Super Heater1 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Heater1 Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Heater1 Capacity</em>' attribute.
	 * @see #setSuperHeater1Capacity(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_SuperHeater1Capacity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Drum/Primary Superheater Capacity'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Drum/Primary Superheater Capacity'"
	 * @generated
	 */
	float getSuperHeater1Capacity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Heater1 Capacity</em>' attribute.
	 * @see #getSuperHeater1Capacity()
	 * @generated
	 */
	void setSuperHeater1Capacity(float value);

	/**
	 * Returns the value of the '<em><b>Feed Water PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Water PG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Water PG</em>' attribute.
	 * @see #setFeedWaterPG(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_FeedWaterPG()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Feedwater Proportional Gain ratio'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Feedwater Proportional Gain ratio'"
	 * @generated
	 */
	float getFeedWaterPG();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterPG <em>Feed Water PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Water PG</em>' attribute.
	 * @see #getFeedWaterPG()
	 * @generated
	 */
	void setFeedWaterPG(float value);

	/**
	 * Returns the value of the '<em><b>Control TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control TC</em>' attribute.
	 * @see #setControlTC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_ControlTC()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time Constant'"
	 * @generated
	 */
	float getControlTC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlTC <em>Control TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control TC</em>' attribute.
	 * @see #getControlTC()
	 * @generated
	 */
	void setControlTC(float value);

	/**
	 * Returns the value of the '<em><b>Mech Power Sensor Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mech Power Sensor Lag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mech Power Sensor Lag</em>' attribute.
	 * @see #setMechPowerSensorLag(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_MechPowerSensorLag()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Mechanical Power Sensor Lag'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Mechanical Power Sensor Lag'"
	 * @generated
	 */
	float getMechPowerSensorLag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mech Power Sensor Lag</em>' attribute.
	 * @see #getMechPowerSensorLag()
	 * @generated
	 */
	void setMechPowerSensorLag(float value);

	/**
	 * Returns the value of the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle Pressure SP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle Pressure SP</em>' attribute.
	 * @see #setThrottlePressureSP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_ThrottlePressureSP()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Throttle Pressure Setpoint'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Throttle Pressure Setpoint'"
	 * @generated
	 */
	float getThrottlePressureSP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle Pressure SP</em>' attribute.
	 * @see #getThrottlePressureSP()
	 * @generated
	 */
	void setThrottlePressureSP(float value);

	/**
	 * Returns the value of the '<em><b>Max Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Error Rate P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Error Rate P</em>' attribute.
	 * @see #setMaxErrorRateP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_MaxErrorRateP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Active power Maximum Error Rate Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power Maximum Error Rate Limit'"
	 * @generated
	 */
	float getMaxErrorRateP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMaxErrorRateP <em>Max Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Error Rate P</em>' attribute.
	 * @see #getMaxErrorRateP()
	 * @generated
	 */
	void setMaxErrorRateP(float value);

	/**
	 * Returns the value of the '<em><b>Control IC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control IC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control IC</em>' attribute.
	 * @see #setControlIC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_ControlIC()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Integral Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Integral Constant'"
	 * @generated
	 */
	float getControlIC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlIC <em>Control IC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control IC</em>' attribute.
	 * @see #getControlIC()
	 * @generated
	 */
	void setControlIC(float value);

	/**
	 * Returns the value of the '<em><b>Min Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Error Rate P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Error Rate P</em>' attribute.
	 * @see #setMinErrorRateP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_MinErrorRateP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Active power Minimum Error Rate Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power Minimum Error Rate Limit'"
	 * @generated
	 */
	float getMinErrorRateP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMinErrorRateP <em>Min Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Error Rate P</em>' attribute.
	 * @see #getMinErrorRateP()
	 * @generated
	 */
	void setMinErrorRateP(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Demand Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Demand Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Demand Limit</em>' attribute.
	 * @see #setFuelDemandLimit(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_FuelDemandLimit()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fuel Demand Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fuel Demand Limit'"
	 * @generated
	 */
	float getFuelDemandLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelDemandLimit <em>Fuel Demand Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Demand Limit</em>' attribute.
	 * @see #getFuelDemandLimit()
	 * @generated
	 */
	void setFuelDemandLimit(float value);

	/**
	 * Returns the value of the '<em><b>Super Heater Pipe PD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Heater Pipe PD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Heater Pipe PD</em>' attribute.
	 * @see #setSuperHeaterPipePD(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_SuperHeaterPipePD()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Superheater Pipe Pressure Drop Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Superheater Pipe Pressure Drop Constant'"
	 * @generated
	 */
	float getSuperHeaterPipePD();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Heater Pipe PD</em>' attribute.
	 * @see #getSuperHeaterPipePD()
	 * @generated
	 */
	void setSuperHeaterPipePD(float value);

	/**
	 * Returns the value of the '<em><b>Pressure Ctrl DG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Ctrl DG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Ctrl DG</em>' attribute.
	 * @see #setPressureCtrlDG(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_PressureCtrlDG()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Control Derivative Gain ratio'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Control Derivative Gain ratio'"
	 * @generated
	 */
	float getPressureCtrlDG();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlDG <em>Pressure Ctrl DG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Ctrl DG</em>' attribute.
	 * @see #getPressureCtrlDG()
	 * @generated
	 */
	void setPressureCtrlDG(float value);

	/**
	 * Returns the value of the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Power Versus Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Power Versus Voltage</em>' attribute.
	 * @see #setAuxPowerVersusVoltage(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_AuxPowerVersusVoltage()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Off nominal voltage effect on auxiliary real power. Per unit active power variation versus per unit voltage variation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Off nominal voltage effect on auxiliary real power. Per unit active power variation versus per unit voltage variation.'"
	 * @generated
	 */
	float getAuxPowerVersusVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Versus Voltage</em>' attribute.
	 * @see #getAuxPowerVersusVoltage()
	 * @generated
	 */
	void setAuxPowerVersusVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Control PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control PC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control PC</em>' attribute.
	 * @see #setControlPC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_ControlPC()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Proportional Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Proportional Constant'"
	 * @generated
	 */
	float getControlPC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPC <em>Control PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control PC</em>' attribute.
	 * @see #getControlPC()
	 * @generated
	 */
	void setControlPC(float value);

	/**
	 * Returns the value of the '<em><b>Feed Water TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Water TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Water TC</em>' attribute.
	 * @see #setFeedWaterTC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_FeedWaterTC()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Feedwater Time Constant rato'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Feedwater Time Constant rato'"
	 * @generated
	 */
	float getFeedWaterTC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterTC <em>Feed Water TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Water TC</em>' attribute.
	 * @see #getFeedWaterTC()
	 * @generated
	 */
	void setFeedWaterTC(float value);

	/**
	 * Returns the value of the '<em><b>Control Error Bias P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Error Bias P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Error Bias P</em>' attribute.
	 * @see #setControlErrorBiasP(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_ControlErrorBiasP()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Active power Error Bias ratio'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Active power Error Bias ratio'"
	 * @generated
	 */
	float getControlErrorBiasP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlErrorBiasP <em>Control Error Bias P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Error Bias P</em>' attribute.
	 * @see #getControlErrorBiasP()
	 * @generated
	 */
	void setControlErrorBiasP(float value);

	/**
	 * Returns the value of the '<em><b>Feed Water IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Water IG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Water IG</em>' attribute.
	 * @see #setFeedWaterIG(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_FeedWaterIG()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Feedwater Integral Gain ratio'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Feedwater Integral Gain ratio'"
	 * @generated
	 */
	float getFeedWaterIG();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterIG <em>Feed Water IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Water IG</em>' attribute.
	 * @see #getFeedWaterIG()
	 * @generated
	 */
	void setFeedWaterIG(float value);

	/**
	 * Returns the value of the '<em><b>Pressure Ctrl IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Ctrl IG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Ctrl IG</em>' attribute.
	 * @see #setPressureCtrlIG(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_PressureCtrlIG()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Control Integral Gain ratio'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Control Integral Gain ratio'"
	 * @generated
	 */
	float getPressureCtrlIG();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlIG <em>Pressure Ctrl IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Ctrl IG</em>' attribute.
	 * @see #getPressureCtrlIG()
	 * @generated
	 */
	void setPressureCtrlIG(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Supply TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Supply TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Supply TC</em>' attribute.
	 * @see #setFuelSupplyTC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_FuelSupplyTC()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fuel Supply Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fuel Supply Time Constant'"
	 * @generated
	 */
	float getFuelSupplyTC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyTC <em>Fuel Supply TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Supply TC</em>' attribute.
	 * @see #getFuelSupplyTC()
	 * @generated
	 */
	void setFuelSupplyTC(float value);

	/**
	 * Returns the value of the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Power Versus Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Power Versus Frequency</em>' attribute.
	 * @see #setAuxPowerVersusFrequency(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_AuxPowerVersusFrequency()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Off nominal frequency effect on auxiliary real power. Per unit active power variation versus per unit frequency variation.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Off nominal frequency effect on auxiliary real power. Per unit active power variation versus per unit frequency variation.'"
	 * @generated
	 */
	float getAuxPowerVersusFrequency();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Versus Frequency</em>' attribute.
	 * @see #getAuxPowerVersusFrequency()
	 * @generated
	 */
	void setAuxPowerVersusFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Pressure Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Feedback</em>' attribute.
	 * @see #setPressureFeedback(int)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_PressureFeedback()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Feedback Indicator'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Feedback Indicator'"
	 * @generated
	 */
	int getPressureFeedback();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureFeedback <em>Pressure Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Feedback</em>' attribute.
	 * @see #getPressureFeedback()
	 * @generated
	 */
	void setPressureFeedback(int value);

	/**
	 * Returns the value of the '<em><b>Fuel Supply Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Supply Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Supply Delay</em>' attribute.
	 * @see #setFuelSupplyDelay(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_FuelSupplyDelay()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Fuel Delay'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Fuel Delay'"
	 * @generated
	 */
	float getFuelSupplyDelay();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyDelay <em>Fuel Supply Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Supply Delay</em>' attribute.
	 * @see #getFuelSupplyDelay()
	 * @generated
	 */
	void setFuelSupplyDelay(float value);

	/**
	 * Returns the value of the '<em><b>Boiler Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boiler Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boiler Control Mode</em>' attribute.
	 * @see CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode
	 * @see #setBoilerControlMode(BoilerControlMode)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_BoilerControlMode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The control mode of the boiler'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control mode of the boiler'"
	 * @generated
	 */
	BoilerControlMode getBoilerControlMode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getBoilerControlMode <em>Boiler Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boiler Control Mode</em>' attribute.
	 * @see CIM.IEC61970.Generation.GenerationDynamics.BoilerControlMode
	 * @see #getBoilerControlMode()
	 * @generated
	 */
	void setBoilerControlMode(BoilerControlMode value);

	/**
	 * Returns the value of the '<em><b>Super Heater2 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Heater2 Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Heater2 Capacity</em>' attribute.
	 * @see #setSuperHeater2Capacity(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_SuperHeater2Capacity()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Secondary Superheater Capacity'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Secondary Superheater Capacity'"
	 * @generated
	 */
	float getSuperHeater2Capacity();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Heater2 Capacity</em>' attribute.
	 * @see #getSuperHeater2Capacity()
	 * @generated
	 */
	void setSuperHeater2Capacity(float value);

	/**
	 * Returns the value of the '<em><b>Control PEB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control PEB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control PEB</em>' attribute.
	 * @see #setControlPEB(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_ControlPEB()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Error Bias ratio'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Error Bias ratio'"
	 * @generated
	 */
	float getControlPEB();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPEB <em>Control PEB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control PEB</em>' attribute.
	 * @see #getControlPEB()
	 * @generated
	 */
	void setControlPEB(float value);

	/**
	 * Returns the value of the '<em><b>Control PED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control PED</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control PED</em>' attribute.
	 * @see #setControlPED(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getFossilSteamSupply_ControlPED()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Error Deadband'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Error Deadband'"
	 * @generated
	 */
	float getControlPED();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPED <em>Control PED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control PED</em>' attribute.
	 * @see #getControlPED()
	 * @generated
	 */
	void setControlPED(float value);

} // FossilSteamSupply
