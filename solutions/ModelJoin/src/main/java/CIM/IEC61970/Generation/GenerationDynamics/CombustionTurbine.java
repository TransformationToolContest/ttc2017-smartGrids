/**
 */
package CIM.IEC61970.Generation.GenerationDynamics;

import CIM.IEC61970.Generation.Production.AirCompressor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combustion Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#isHeatRecoveryFlag <em>Heat Recovery Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getTimeConstant <em>Time Constant</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A prime mover that is typically fueled by gas or light oil'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A prime mover that is typically fueled by gas or light oil'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A prime mover that is typically fueled by gas or light oil' Profile\040documentation='A prime mover that is typically fueled by gas or light oil'"
 * @generated
 */
public interface CombustionTurbine extends PrimeMover {
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
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_AuxPowerVersusFrequency()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Off-nominal frequency effect on turbine auxiliaries. Per unit reduction in auxiliary active power consumption versus per unit reduction in frequency (from rated frequency).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Off-nominal frequency effect on turbine auxiliaries. Per unit reduction in auxiliary active power consumption versus per unit reduction in frequency (from rated frequency).'"
	 * @generated
	 */
	float getAuxPowerVersusFrequency();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Versus Frequency</em>' attribute.
	 * @see #getAuxPowerVersusFrequency()
	 * @generated
	 */
	void setAuxPowerVersusFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Power Variation By Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Variation By Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Variation By Temp</em>' attribute.
	 * @see #setPowerVariationByTemp(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_PowerVariationByTemp()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Per unit change in power per (versus) unit change in ambient temperature'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Per unit change in power per (versus) unit change in ambient temperature'"
	 * @generated
	 */
	float getPowerVariationByTemp();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Variation By Temp</em>' attribute.
	 * @see #getPowerVariationByTemp()
	 * @generated
	 */
	void setPowerVariationByTemp(float value);

	/**
	 * Returns the value of the '<em><b>Ambient Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambient Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient Temp</em>' attribute.
	 * @see #setAmbientTemp(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_AmbientTemp()
	 * @model dataType="CIM.IEC61970.Domain.Temperature" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Default ambient temperature to be used in modeling applications'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Default ambient temperature to be used in modeling applications'"
	 * @generated
	 */
	float getAmbientTemp();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Temp</em>' attribute.
	 * @see #getAmbientTemp()
	 * @generated
	 */
	void setAmbientTemp(float value);

	/**
	 * Returns the value of the '<em><b>Reference Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Temp</em>' attribute.
	 * @see #setReferenceTemp(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_ReferenceTemp()
	 * @model dataType="CIM.IEC61970.Domain.Temperature" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Reference temperature at which the output of the turbine was defined.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Reference temperature at which the output of the turbine was defined.'"
	 * @generated
	 */
	float getReferenceTemp();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Temp</em>' attribute.
	 * @see #getReferenceTemp()
	 * @generated
	 */
	void setReferenceTemp(float value);

	/**
	 * Returns the value of the '<em><b>Heat Recovery Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Recovery Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Recovery Flag</em>' attribute.
	 * @see #setHeatRecoveryFlag(boolean)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_HeatRecoveryFlag()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Flag that is set to true if the combustion turbine is associated with a heat recovery boiler'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Flag that is set to true if the combustion turbine is associated with a heat recovery boiler'"
	 * @generated
	 */
	boolean isHeatRecoveryFlag();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#isHeatRecoveryFlag <em>Heat Recovery Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Recovery Flag</em>' attribute.
	 * @see #isHeatRecoveryFlag()
	 * @generated
	 */
	void setHeatRecoveryFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Capability Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Versus Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Versus Frequency</em>' attribute.
	 * @see #setCapabilityVersusFrequency(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_CapabilityVersusFrequency()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Off-nominal frequency effect on turbine capability. Per unit reduction in unit active power capability versus per unit reduction in frequency (from rated frequency).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Off-nominal frequency effect on turbine capability. Per unit reduction in unit active power capability versus per unit reduction in frequency (from rated frequency).'"
	 * @generated
	 */
	float getCapabilityVersusFrequency();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Versus Frequency</em>' attribute.
	 * @see #getCapabilityVersusFrequency()
	 * @generated
	 */
	void setCapabilityVersusFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Heat Recovery Boiler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Recovery Boiler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Recovery Boiler</em>' reference.
	 * @see #setHeatRecoveryBoiler(HeatRecoveryBoiler)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_HeatRecoveryBoiler()
	 * @see CIM.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getCombustionTurbines
	 * @model opposite="CombustionTurbines"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A combustion turbine may have a heat recovery boiler for making steam'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A combustion turbine may have a heat recovery boiler for making steam'"
	 * @generated
	 */
	HeatRecoveryBoiler getHeatRecoveryBoiler();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Recovery Boiler</em>' reference.
	 * @see #getHeatRecoveryBoiler()
	 * @generated
	 */
	void setHeatRecoveryBoiler(HeatRecoveryBoiler value);

	/**
	 * Returns the value of the '<em><b>CT Temp Active Power Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CT Temp Active Power Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CT Temp Active Power Curve</em>' reference.
	 * @see #setCTTempActivePowerCurve(CTTempActivePowerCurve)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_CTTempActivePowerCurve()
	 * @see CIM.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine
	 * @model opposite="CombustionTurbine"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A combustion turbine may have an active power versus ambient temperature relationship'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A combustion turbine may have an active power versus ambient temperature relationship'"
	 * @generated
	 */
	CTTempActivePowerCurve getCTTempActivePowerCurve();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CT Temp Active Power Curve</em>' reference.
	 * @see #getCTTempActivePowerCurve()
	 * @generated
	 */
	void setCTTempActivePowerCurve(CTTempActivePowerCurve value);

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
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_AuxPowerVersusVoltage()
	 * @model dataType="CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Off-nominal voltage effect on turbine auxiliaries. Per unit reduction in auxiliary active power consumption versus per unit reduction in auxiliary bus voltage (from a specified voltage level).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Off-nominal voltage effect on turbine auxiliaries. Per unit reduction in auxiliary active power consumption versus per unit reduction in auxiliary bus voltage (from a specified voltage level).'"
	 * @generated
	 */
	float getAuxPowerVersusVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Versus Voltage</em>' attribute.
	 * @see #getAuxPowerVersusVoltage()
	 * @generated
	 */
	void setAuxPowerVersusVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Air Compressor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air Compressor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Compressor</em>' reference.
	 * @see #setAirCompressor(AirCompressor)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_AirCompressor()
	 * @see CIM.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine
	 * @model opposite="CombustionTurbine"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A CAES air compressor is driven by combustion turbine'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A CAES air compressor is driven by combustion turbine'"
	 * @generated
	 */
	AirCompressor getAirCompressor();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Compressor</em>' reference.
	 * @see #getAirCompressor()
	 * @generated
	 */
	void setAirCompressor(AirCompressor value);

	/**
	 * Returns the value of the '<em><b>Time Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Constant</em>' attribute.
	 * @see #setTimeConstant(float)
	 * @see CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getCombustionTurbine_TimeConstant()
	 * @model dataType="CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The time constant for the turbine.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The time constant for the turbine.'"
	 * @generated
	 */
	float getTimeConstant();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getTimeConstant <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Constant</em>' attribute.
	 * @see #getTimeConstant()
	 * @generated
	 */
	void setTimeConstant(float value);

} // CombustionTurbine
