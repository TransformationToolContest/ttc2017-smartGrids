/**
 */
package CIM.IEC61970.Generation.GenerationDynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BWR Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getLowPowerLimit <em>Low Power Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getInCoreThermalTC <em>In Core Thermal TC</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getIntegralGain <em>Integral Gain</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointGA <em>Pressure Setpoint GA</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux1 <em>Rf Aux1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux2 <em>Rf Aux2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRodPatternConstant <em>Rod Pattern Constant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux8 <em>Rf Aux8</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux7 <em>Rf Aux7</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRodPattern <em>Rod Pattern</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux4 <em>Rf Aux4</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux3 <em>Rf Aux3</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux6 <em>Rf Aux6</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux5 <em>Rf Aux5</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getProportionalGain <em>Proportional Gain</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getHighPowerLimit <em>High Power Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointTC2 <em>Pressure Setpoint TC2</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointTC1 <em>Pressure Setpoint TC1</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureLimit <em>Pressure Limit</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Boiling water reactor used as a steam supply to a steam turbine'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Boiling water reactor used as a steam supply to a steam turbine'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Boiling water reactor used as a steam supply to a steam turbine' Profile\040documentation='Boiling water reactor used as a steam supply to a steam turbine'"
 * @generated
 */
public interface BWRSteamSupply extends SteamSupply {
	/**
	 * Returns the value of the '<em><b>Low Power Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Power Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Power Limit</em>' attribute.
	 * @see #setLowPowerLimit(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_LowPowerLimit()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Low Power Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Low Power Limit'"
	 * @generated
	 */
	float getLowPowerLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getLowPowerLimit <em>Low Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Power Limit</em>' attribute.
	 * @see #getLowPowerLimit()
	 * @generated
	 */
	void setLowPowerLimit(float value);

	/**
	 * Returns the value of the '<em><b>In Core Thermal TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Core Thermal TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Core Thermal TC</em>' attribute.
	 * @see #setInCoreThermalTC(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_InCoreThermalTC()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='In-Core Thermal Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='In-Core Thermal Time Constant'"
	 * @generated
	 */
	float getInCoreThermalTC();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getInCoreThermalTC <em>In Core Thermal TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Core Thermal TC</em>' attribute.
	 * @see #getInCoreThermalTC()
	 * @generated
	 */
	void setInCoreThermalTC(float value);

	/**
	 * Returns the value of the '<em><b>Integral Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integral Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integral Gain</em>' attribute.
	 * @see #setIntegralGain(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_IntegralGain()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Integral Gain'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Integral Gain'"
	 * @generated
	 */
	float getIntegralGain();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getIntegralGain <em>Integral Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integral Gain</em>' attribute.
	 * @see #getIntegralGain()
	 * @generated
	 */
	void setIntegralGain(float value);

	/**
	 * Returns the value of the '<em><b>Pressure Setpoint GA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Setpoint GA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Setpoint GA</em>' attribute.
	 * @see #setPressureSetpointGA(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_PressureSetpointGA()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Setpoint Gain Adjuster'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Setpoint Gain Adjuster'"
	 * @generated
	 */
	float getPressureSetpointGA();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointGA <em>Pressure Setpoint GA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Setpoint GA</em>' attribute.
	 * @see #getPressureSetpointGA()
	 * @generated
	 */
	void setPressureSetpointGA(float value);

	/**
	 * Returns the value of the '<em><b>Rf Aux1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rf Aux1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf Aux1</em>' attribute.
	 * @see #setRfAux1(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RfAux1()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 * @generated
	 */
	float getRfAux1();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux1 <em>Rf Aux1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rf Aux1</em>' attribute.
	 * @see #getRfAux1()
	 * @generated
	 */
	void setRfAux1(float value);

	/**
	 * Returns the value of the '<em><b>Rf Aux2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rf Aux2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf Aux2</em>' attribute.
	 * @see #setRfAux2(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RfAux2()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 * @generated
	 */
	float getRfAux2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux2 <em>Rf Aux2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rf Aux2</em>' attribute.
	 * @see #getRfAux2()
	 * @generated
	 */
	void setRfAux2(float value);

	/**
	 * Returns the value of the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Limit</em>' attribute.
	 * @see #setLowerLimit(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_LowerLimit()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Initial Lower Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Initial Lower Limit'"
	 * @generated
	 */
	float getLowerLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getLowerLimit <em>Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Limit</em>' attribute.
	 * @see #getLowerLimit()
	 * @generated
	 */
	void setLowerLimit(float value);

	/**
	 * Returns the value of the '<em><b>Rod Pattern Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rod Pattern Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rod Pattern Constant</em>' attribute.
	 * @see #setRodPatternConstant(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RodPatternConstant()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Constant Associated With Rod Pattern'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Constant Associated With Rod Pattern'"
	 * @generated
	 */
	float getRodPatternConstant();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRodPatternConstant <em>Rod Pattern Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rod Pattern Constant</em>' attribute.
	 * @see #getRodPatternConstant()
	 * @generated
	 */
	void setRodPatternConstant(float value);

	/**
	 * Returns the value of the '<em><b>Rf Aux8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rf Aux8</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf Aux8</em>' attribute.
	 * @see #setRfAux8(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RfAux8()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 * @generated
	 */
	float getRfAux8();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux8 <em>Rf Aux8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rf Aux8</em>' attribute.
	 * @see #getRfAux8()
	 * @generated
	 */
	void setRfAux8(float value);

	/**
	 * Returns the value of the '<em><b>Rf Aux7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rf Aux7</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf Aux7</em>' attribute.
	 * @see #setRfAux7(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RfAux7()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 * @generated
	 */
	float getRfAux7();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux7 <em>Rf Aux7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rf Aux7</em>' attribute.
	 * @see #getRfAux7()
	 * @generated
	 */
	void setRfAux7(float value);

	/**
	 * Returns the value of the '<em><b>Rod Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rod Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rod Pattern</em>' attribute.
	 * @see #setRodPattern(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RodPattern()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rod Pattern'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rod Pattern'"
	 * @generated
	 */
	float getRodPattern();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRodPattern <em>Rod Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rod Pattern</em>' attribute.
	 * @see #getRodPattern()
	 * @generated
	 */
	void setRodPattern(float value);

	/**
	 * Returns the value of the '<em><b>Rf Aux4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rf Aux4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf Aux4</em>' attribute.
	 * @see #setRfAux4(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RfAux4()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 * @generated
	 */
	float getRfAux4();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux4 <em>Rf Aux4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rf Aux4</em>' attribute.
	 * @see #getRfAux4()
	 * @generated
	 */
	void setRfAux4(float value);

	/**
	 * Returns the value of the '<em><b>Rf Aux3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rf Aux3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf Aux3</em>' attribute.
	 * @see #setRfAux3(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RfAux3()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 * @generated
	 */
	float getRfAux3();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux3 <em>Rf Aux3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rf Aux3</em>' attribute.
	 * @see #getRfAux3()
	 * @generated
	 */
	void setRfAux3(float value);

	/**
	 * Returns the value of the '<em><b>Rf Aux6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rf Aux6</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf Aux6</em>' attribute.
	 * @see #setRfAux6(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RfAux6()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 * @generated
	 */
	float getRfAux6();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux6 <em>Rf Aux6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rf Aux6</em>' attribute.
	 * @see #getRfAux6()
	 * @generated
	 */
	void setRfAux6(float value);

	/**
	 * Returns the value of the '<em><b>Rf Aux5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rf Aux5</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf Aux5</em>' attribute.
	 * @see #setRfAux5(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_RfAux5()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Coefficient for modeling the effect of off-nominal frequency and voltage on recirculation and core flow, which affects the BWR power output.'"
	 * @generated
	 */
	float getRfAux5();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getRfAux5 <em>Rf Aux5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rf Aux5</em>' attribute.
	 * @see #getRfAux5()
	 * @generated
	 */
	void setRfAux5(float value);

	/**
	 * Returns the value of the '<em><b>Proportional Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proportional Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proportional Gain</em>' attribute.
	 * @see #setProportionalGain(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_ProportionalGain()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Proportional Gain'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Proportional Gain'"
	 * @generated
	 */
	float getProportionalGain();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getProportionalGain <em>Proportional Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proportional Gain</em>' attribute.
	 * @see #getProportionalGain()
	 * @generated
	 */
	void setProportionalGain(float value);

	/**
	 * Returns the value of the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Limit</em>' attribute.
	 * @see #setUpperLimit(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_UpperLimit()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Initial Upper Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Initial Upper Limit'"
	 * @generated
	 */
	float getUpperLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getUpperLimit <em>Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Limit</em>' attribute.
	 * @see #getUpperLimit()
	 * @generated
	 */
	void setUpperLimit(float value);

	/**
	 * Returns the value of the '<em><b>High Power Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Power Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Power Limit</em>' attribute.
	 * @see #setHighPowerLimit(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_HighPowerLimit()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='High Power Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='High Power Limit'"
	 * @generated
	 */
	float getHighPowerLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getHighPowerLimit <em>High Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Power Limit</em>' attribute.
	 * @see #getHighPowerLimit()
	 * @generated
	 */
	void setHighPowerLimit(float value);

	/**
	 * Returns the value of the '<em><b>Pressure Setpoint TC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Setpoint TC2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Setpoint TC2</em>' attribute.
	 * @see #setPressureSetpointTC2(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_PressureSetpointTC2()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Setpoint Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Setpoint Time Constant'"
	 * @generated
	 */
	float getPressureSetpointTC2();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointTC2 <em>Pressure Setpoint TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Setpoint TC2</em>' attribute.
	 * @see #getPressureSetpointTC2()
	 * @generated
	 */
	void setPressureSetpointTC2(float value);

	/**
	 * Returns the value of the '<em><b>Pressure Setpoint TC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Setpoint TC1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Setpoint TC1</em>' attribute.
	 * @see #setPressureSetpointTC1(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_PressureSetpointTC1()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Setpoint Time Constant'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Setpoint Time Constant'"
	 * @generated
	 */
	float getPressureSetpointTC1();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureSetpointTC1 <em>Pressure Setpoint TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Setpoint TC1</em>' attribute.
	 * @see #getPressureSetpointTC1()
	 * @generated
	 */
	void setPressureSetpointTC1(float value);

	/**
	 * Returns the value of the '<em><b>Pressure Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Limit</em>' attribute.
	 * @see #setPressureLimit(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getBWRSteamSupply_PressureLimit()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pressure Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pressure Limit'"
	 * @generated
	 */
	float getPressureLimit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.BWRSteamSupply#getPressureLimit <em>Pressure Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Limit</em>' attribute.
	 * @see #getPressureLimit()
	 * @generated
	 */
	void setPressureLimit(float value);

} // BWRSteamSupply
