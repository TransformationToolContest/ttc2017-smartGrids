/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit;

import gluemodel.CIM.IEC61970.Core.Equipment;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;

import gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator;

import gluemodel.CIM.IEC61970.Wires.SynchronousMachine;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getOperatedBy_GenerationProvider <em>Operated By Generation Provider</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode <em>Gen Operating Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getStepChange <em>Step Change</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp <em>Spin Reserve Ramp</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getNominalP <em>Nominal P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP <em>Energy Min P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getModelDetail <em>Model Detail</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority <em>Fuel Priority</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getVariableCost <em>Variable Cost</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getBaseP <em>Base P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRegisteredGenerator <em>Registered Generator</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getSubControlArea <em>Sub Control Area</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag <em>Fast Start Flag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag <em>Disp Reserve Flag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.' Profile\040documentation='A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.'"
 * @generated
 */
public interface GeneratingUnit extends Equipment {
	/**
	 * Returns the value of the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Control Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Control Limit</em>' attribute.
	 * @see #setHighControlLimit(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_HighControlLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='High limit for secondary (AGC) control'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='High limit for secondary (AGC) control'"
	 * @generated
	 */
	float getHighControlLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Control Limit</em>' attribute.
	 * @see #getHighControlLimit()
	 * @generated
	 */
	void setHighControlLimit(float value);

	/**
	 * Returns the value of the '<em><b>Operated By Generation Provider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider#getGeneratingUnits <em>Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operated By Generation Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operated By Generation Provider</em>' reference.
	 * @see #setOperatedBy_GenerationProvider(GenerationProvider)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_OperatedBy_GenerationProvider()
	 * @see gluemodel.CIM.IEC61970.Informative.Financial.GenerationProvider#getGeneratingUnits
	 * @model opposite="GeneratingUnits"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A GenerationProvider operates one or more GeneratingUnits.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A GenerationProvider operates one or more GeneratingUnits.'"
	 * @generated
	 */
	GenerationProvider getOperatedBy_GenerationProvider();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getOperatedBy_GenerationProvider <em>Operated By Generation Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operated By Generation Provider</em>' reference.
	 * @see #getOperatedBy_GenerationProvider()
	 * @generated
	 */
	void setOperatedBy_GenerationProvider(GenerationProvider value);

	/**
	 * Returns the value of the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise Ramp Rate</em>' attribute.
	 * @see #setRaiseRampRate(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_RaiseRampRate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePowerChangeRate" required="true"
	 * @generated
	 */
	float getRaiseRampRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raise Ramp Rate</em>' attribute.
	 * @see #getRaiseRampRate()
	 * @generated
	 */
	void setRaiseRampRate(float value);

	/**
	 * Returns the value of the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.GeneratorOperatingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Operating Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Operating Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratorOperatingMode
	 * @see #setGenOperatingMode(GeneratorOperatingMode)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_GenOperatingMode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operating mode for secondary control.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operating mode for secondary control.'"
	 * @generated
	 */
	GeneratorOperatingMode getGenOperatingMode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode <em>Gen Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Operating Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratorOperatingMode
	 * @see #getGenOperatingMode()
	 * @generated
	 */
	void setGenOperatingMode(GeneratorOperatingMode value);

	/**
	 * Returns the value of the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Cntrl Margin P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Cntrl Margin P</em>' attribute.
	 * @see #setAutoCntrlMarginP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_AutoCntrlMarginP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The planned unused capacity which can be used to support automatic control overruns.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The planned unused capacity which can be used to support automatic control overruns.'"
	 * @generated
	 */
	float getAutoCntrlMarginP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Cntrl Margin P</em>' attribute.
	 * @see #getAutoCntrlMarginP()
	 * @generated
	 */
	void setAutoCntrlMarginP(float value);

	/**
	 * Returns the value of the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Pulse Low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Pulse Low</em>' attribute.
	 * @see #setControlPulseLow(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_ControlPulseLow()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pulse low limit which is the smallest control pulse that the unit can respond to'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pulse low limit which is the smallest control pulse that the unit can respond to'"
	 * @generated
	 */
	float getControlPulseLow();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Pulse Low</em>' attribute.
	 * @see #getControlPulseLow()
	 * @generated
	 */
	void setControlPulseLow(float value);

	/**
	 * Returns the value of the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Governor MPL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governor MPL</em>' attribute.
	 * @see #setGovernorMPL(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_GovernorMPL()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Governor Motor Position Limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Governor Motor Position Limit'"
	 * @generated
	 */
	float getGovernorMPL();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governor MPL</em>' attribute.
	 * @see #getGovernorMPL()
	 * @generated
	 */
	void setGovernorMPL(float value);

	/**
	 * Returns the value of the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Gross Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Gross Max P</em>' attribute.
	 * @see #setRatedGrossMaxP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_RatedGrossMaxP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit\'s gross rated maximum capacity (Book Value).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit\'s gross rated maximum capacity (Book Value).'"
	 * @generated
	 */
	float getRatedGrossMaxP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Gross Max P</em>' attribute.
	 * @see #getRatedGrossMaxP()
	 * @generated
	 */
	void setRatedGrossMaxP(float value);

	/**
	 * Returns the value of the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alloc Spin Res P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alloc Spin Res P</em>' attribute.
	 * @see #setAllocSpinResP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_AllocSpinResP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The planned unused capacity (spinning reserve) which can be used to support emergency load'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The planned unused capacity (spinning reserve) which can be used to support emergency load'"
	 * @generated
	 */
	float getAllocSpinResP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alloc Spin Res P</em>' attribute.
	 * @see #getAllocSpinResP()
	 * @generated
	 */
	void setAllocSpinResP(float value);

	/**
	 * Returns the value of the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Unit Op Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Unit Op Schedule</em>' reference.
	 * @see #setGenUnitOpSchedule(GenUnitOpSchedule)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_GenUnitOpSchedule()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generating unit may have an operating schedule, indicating the planned operation of the unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit may have an operating schedule, indicating the planned operation of the unit'"
	 * @generated
	 */
	GenUnitOpSchedule getGenUnitOpSchedule();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Unit Op Schedule</em>' reference.
	 * @see #getGenUnitOpSchedule()
	 * @generated
	 */
	void setGenUnitOpSchedule(GenUnitOpSchedule value);

	/**
	 * Returns the value of the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Change</em>' attribute.
	 * @see #setStepChange(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_StepChange()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 * @generated
	 */
	float getStepChange();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getStepChange <em>Step Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Change</em>' attribute.
	 * @see #getStepChange()
	 * @generated
	 */
	void setStepChange(float value);

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
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_StartupCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The initial startup cost incurred for each start of the GeneratingUnit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The initial startup cost incurred for each start of the GeneratingUnit.'"
	 * @generated
	 */
	float getStartupCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Cost</em>' attribute.
	 * @see #getStartupCost()
	 * @generated
	 */
	void setStartupCost(float value);

	/**
	 * Returns the value of the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spin Reserve Ramp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spin Reserve Ramp</em>' attribute.
	 * @see #setSpinReserveRamp(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_SpinReserveRamp()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePowerChangeRate" required="true"
	 * @generated
	 */
	float getSpinReserveRamp();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spin Reserve Ramp</em>' attribute.
	 * @see #getSpinReserveRamp()
	 * @generated
	 */
	void setSpinReserveRamp(float value);

	/**
	 * Returns the value of the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal P</em>' attribute.
	 * @see #setNominalP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_NominalP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The nominal power of the generating unit.  Used to give precise meaning to percentage based attributes such as the govenor speed change droop (govenorSCD attribute).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The nominal power of the generating unit.  Used to give precise meaning to percentage based attributes such as the govenor speed change droop (govenorSCD attribute).'"
	 * @generated
	 */
	float getNominalP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal P</em>' attribute.
	 * @see #getNominalP()
	 * @generated
	 */
	void setNominalP(float value);

	/**
	 * Returns the value of the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Governor SCD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governor SCD</em>' attribute.
	 * @see #setGovernorSCD(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_GovernorSCD()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Governor Speed Changer Droop.   This is the change in generator power output divided by the change in frequency normalized by the nominal power of the generator and the nominal frequency and expressed in percent and negated. A positive value of speed change droop provides additional generator output upon a drop in frequency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Governor Speed Changer Droop.   This is the change in generator power output divided by the change in frequency normalized by the nominal power of the generator and the nominal frequency and expressed in percent and negated. A positive value of speed change droop provides additional generator output upon a drop in frequency.'"
	 * @generated
	 */
	float getGovernorSCD();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governor SCD</em>' attribute.
	 * @see #getGovernorSCD()
	 * @generated
	 */
	void setGovernorSCD(float value);

	/**
	 * Returns the value of the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalty Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalty Factor</em>' attribute.
	 * @see #setPenaltyFactor(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_PenaltyFactor()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Defined as: 1 / ( 1 - Incremental Transmission Loss); with the Incremental Transmission Loss expressed as a plus or minus value. The typical range of penalty factors is (0.9 to 1.1).'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Defined as: 1 / ( 1 - Incremental Transmission Loss); with the Incremental Transmission Loss expressed as a plus or minus value. The typical range of penalty factors is (0.9 to 1.1).'"
	 * @generated
	 */
	float getPenaltyFactor();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Factor</em>' attribute.
	 * @see #getPenaltyFactor()
	 * @generated
	 */
	void setPenaltyFactor(float value);

	/**
	 * Returns the value of the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Pulse High</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Pulse High</em>' attribute.
	 * @see #setControlPulseHigh(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_ControlPulseHigh()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Pulse high limit which is the largest control pulse that the unit can respond to'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Pulse high limit which is the largest control pulse that the unit can respond to'"
	 * @generated
	 */
	float getControlPulseHigh();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Pulse High</em>' attribute.
	 * @see #getControlPulseHigh()
	 * @generated
	 */
	void setControlPulseHigh(float value);

	/**
	 * Returns the value of the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Min P</em>' attribute.
	 * @see #setEnergyMinP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_EnergyMinP()
	 * @model dataType="gluemodel.CIM.IEC61970.Generation.Production.HeatRate" required="true"
	 * @generated
	 */
	float getEnergyMinP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP <em>Energy Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Min P</em>' attribute.
	 * @see #getEnergyMinP()
	 * @generated
	 */
	void setEnergyMinP(float value);

	/**
	 * Returns the value of the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Time</em>' attribute.
	 * @see #setStartupTime(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_StartupTime()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Time it takes to get the unit on-line, from the time that the prime mover mechanical power is applied'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Time it takes to get the unit on-line, from the time that the prime mover mechanical power is applied'"
	 * @generated
	 */
	float getStartupTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Time</em>' attribute.
	 * @see #getStartupTime()
	 * @generated
	 */
	void setStartupTime(float value);

	/**
	 * Returns the value of the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Line PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Line PF</em>' attribute.
	 * @see #setTieLinePF(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_TieLinePF()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generating unit economic participation factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generating unit economic participation factor'"
	 * @generated
	 */
	float getTieLinePF();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tie Line PF</em>' attribute.
	 * @see #getTieLinePF()
	 * @generated
	 */
	void setTieLinePF(float value);

	/**
	 * Returns the value of the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Ramp Rate</em>' attribute.
	 * @see #setLowerRampRate(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_LowerRampRate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePowerChangeRate" required="true"
	 * @generated
	 */
	float getLowerRampRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Ramp Rate</em>' attribute.
	 * @see #getLowerRampRate()
	 * @generated
	 */
	void setLowerRampRate(float value);

	/**
	 * Returns the value of the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial P</em>' attribute.
	 * @see #setInitialP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_InitialP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Default Initial active power  which is used to store a powerflow result for the initial active power for this unit in this network configuration'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Default Initial active power  which is used to store a powerflow result for the initial active power for this unit in this network configuration'"
	 * @generated
	 */
	float getInitialP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial P</em>' attribute.
	 * @see #getInitialP()
	 * @generated
	 */
	void setInitialP(float value);

	/**
	 * Returns the value of the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Response Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Response Rate</em>' attribute.
	 * @see #setControlResponseRate(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_ControlResponseRate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePowerChangeRate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit response rate which specifies the active power change for a control pulse of one second in the most responsive loading level of the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit response rate which specifies the active power change for a control pulse of one second in the most responsive loading level of the unit.'"
	 * @generated
	 */
	float getControlResponseRate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Response Rate</em>' attribute.
	 * @see #getControlResponseRate()
	 * @generated
	 */
	void setControlResponseRate(float value);

	/**
	 * Returns the value of the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Economic P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Economic P</em>' attribute.
	 * @see #setMinEconomicP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_MinEconomicP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Low economic active power limit that must be greater than or equal to the minimum operating active power limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Low economic active power limit that must be greater than or equal to the minimum operating active power limit'"
	 * @generated
	 */
	float getMinEconomicP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Economic P</em>' attribute.
	 * @see #getMinEconomicP()
	 * @generated
	 */
	void setMinEconomicP(float value);

	/**
	 * Returns the value of the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Detail</em>' attribute.
	 * @see #setModelDetail(BigInteger)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_ModelDetail()
	 * @model dataType="gluemodel.CIM.IEC61970.Generation.Production.Classification" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Detail level of the generator model data'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Detail level of the generator model data'"
	 * @generated
	 */
	BigInteger getModelDetail();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getModelDetail <em>Model Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Detail</em>' attribute.
	 * @see #getModelDetail()
	 * @generated
	 */
	void setModelDetail(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_ControlAreaGeneratingUnit()
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='ControlArea specifications for this generating unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='ControlArea specifications for this generating unit.'"
	 * @generated
	 */
	EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit();

	/**
	 * Returns the value of the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Priority</em>' attribute.
	 * @see #setFuelPriority(int)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_FuelPriority()
	 * @model required="true"
	 * @generated
	 */
	int getFuelPriority();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority <em>Fuel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Priority</em>' attribute.
	 * @see #getFuelPriority()
	 * @generated
	 */
	void setFuelPriority(int value);

	/**
	 * Returns the value of the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.GrossToNetActivePowerCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross To Net Active Power Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross To Net Active Power Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_GrossToNetActivePowerCurves()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit'"
	 * @generated
	 */
	EList<GrossToNetActivePowerCurve> getGrossToNetActivePowerCurves();

	/**
	 * Returns the value of the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpCostCurve}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Unit Op Cost Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Unit Op Cost Curves</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_GenUnitOpCostCurves()
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A generating unit may have one or more cost curves, depending upon fuel mixture and fuel cost.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A generating unit may have one or more cost curves, depending upon fuel mixture and fuel cost.'"
	 * @generated
	 */
	EList<GenUnitOpCostCurve> getGenUnitOpCostCurves();

	/**
	 * Returns the value of the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Economic P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Economic P</em>' attribute.
	 * @see #setMaxEconomicP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_MaxEconomicP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum high economic active power limit, that should not exceed the maximum operating active power limit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum high economic active power limit, that should not exceed the maximum operating active power limit'"
	 * @generated
	 */
	float getMaxEconomicP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Economic P</em>' attribute.
	 * @see #getMaxEconomicP()
	 * @generated
	 */
	void setMaxEconomicP(float value);

	/**
	 * Returns the value of the '<em><b>Gen Control Source</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.GeneratorControlSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Control Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Control Source</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratorControlSource
	 * @see #setGenControlSource(GeneratorControlSource)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_GenControlSource()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The source of controls for a generating unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The source of controls for a generating unit.'"
	 * @generated
	 */
	GeneratorControlSource getGenControlSource();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Control Source</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratorControlSource
	 * @see #getGenControlSource()
	 * @generated
	 */
	void setGenControlSource(GeneratorControlSource value);

	/**
	 * Returns the value of the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Gross Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Gross Min P</em>' attribute.
	 * @see #setRatedGrossMinP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_RatedGrossMinP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid'"
	 * @generated
	 */
	float getRatedGrossMinP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Gross Min P</em>' attribute.
	 * @see #getRatedGrossMinP()
	 * @generated
	 */
	void setRatedGrossMinP(float value);

	/**
	 * Returns the value of the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Cost</em>' attribute.
	 * @see #setVariableCost(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_VariableCost()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Money" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The variable cost component of production per unit of ActivePower.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The variable cost component of production per unit of ActivePower.'"
	 * @generated
	 */
	float getVariableCost();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Cost</em>' attribute.
	 * @see #getVariableCost()
	 * @generated
	 */
	void setVariableCost(float value);

	/**
	 * Returns the value of the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Operating P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Operating P</em>' attribute.
	 * @see #setMinOperatingP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_MinOperatingP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is the minimum operating active power limit the dispatcher can enter for this unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the minimum operating active power limit the dispatcher can enter for this unit.'"
	 * @generated
	 */
	float getMinOperatingP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Operating P</em>' attribute.
	 * @see #getMinOperatingP()
	 * @generated
	 */
	void setMinOperatingP(float value);

	/**
	 * Returns the value of the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base P</em>' attribute.
	 * @see #setBaseP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_BaseP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='For dispatchable units, this value represents the economic active power basepoint, for units that are not dispatchable, this value represents the fixed generation value. The value must be between the operating low and high limits.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='For dispatchable units, this value represents the economic active power basepoint, for units that are not dispatchable, this value represents the fixed generation value. The value must be between the operating low and high limits.'"
	 * @generated
	 */
	float getBaseP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getBaseP <em>Base P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base P</em>' attribute.
	 * @see #getBaseP()
	 * @generated
	 */
	void setBaseP(float value);

	/**
	 * Returns the value of the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short PF</em>' attribute.
	 * @see #setShortPF(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_ShortPF()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generating unit economic participation factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generating unit economic participation factor'"
	 * @generated
	 */
	float getShortPF();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short PF</em>' attribute.
	 * @see #getShortPF()
	 * @generated
	 */
	void setShortPF(float value);

	/**
	 * Returns the value of the '<em><b>Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Machines</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_SynchronousMachines()
	 * @see gluemodel.CIM.IEC61970.Wires.SynchronousMachine#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A synchronous machine may operate as a generator and as such becomes a member of a generating unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A synchronous machine may operate as a generator and as such becomes a member of a generating unit'"
	 * @generated
	 */
	EList<SynchronousMachine> getSynchronousMachines();

	/**
	 * Returns the value of the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Control Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Control Limit</em>' attribute.
	 * @see #setLowControlLimit(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_LowControlLimit()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Low limit for secondary (AGC) control'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Low limit for secondary (AGC) control'"
	 * @generated
	 */
	float getLowControlLimit();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Control Limit</em>' attribute.
	 * @see #getLowControlLimit()
	 * @generated
	 */
	void setLowControlLimit(float value);

	/**
	 * Returns the value of the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long PF</em>' attribute.
	 * @see #setLongPF(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_LongPF()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generating unit economic participation factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generating unit economic participation factor'"
	 * @generated
	 */
	float getLongPF();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long PF</em>' attribute.
	 * @see #getLongPF()
	 * @generated
	 */
	void setLongPF(float value);

	/**
	 * Returns the value of the '<em><b>Registered Generator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Generator</em>' reference.
	 * @see #setRegisteredGenerator(RegisteredGenerator)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_RegisteredGenerator()
	 * @see gluemodel.CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator#getGeneratingUnit
	 * @model opposite="GeneratingUnit"
	 * @generated
	 */
	RegisteredGenerator getRegisteredGenerator();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRegisteredGenerator <em>Registered Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Generator</em>' reference.
	 * @see #getRegisteredGenerator()
	 * @generated
	 */
	void setRegisteredGenerator(RegisteredGenerator value);

	/**
	 * Returns the value of the '<em><b>Sub Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getGeneratingUnits <em>Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Control Area</em>' reference.
	 * @see #setSubControlArea(SubControlArea)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_SubControlArea()
	 * @see gluemodel.CIM.IEC61970.Informative.EnergyScheduling.SubControlArea#getGeneratingUnits
	 * @model opposite="GeneratingUnits"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A GeneratingUnit injects energy into a SubControlArea.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A GeneratingUnit injects energy into a SubControlArea.'"
	 * @generated
	 */
	SubControlArea getSubControlArea();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getSubControlArea <em>Sub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Control Area</em>' reference.
	 * @see #getSubControlArea()
	 * @generated
	 */
	void setSubControlArea(SubControlArea value);

	/**
	 * Returns the value of the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Operating P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Operating P</em>' attribute.
	 * @see #setMaxOperatingP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_MaxOperatingP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='This is the maximum operating active power limit the dispatcher can enter for this unit'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='This is the maximum operating active power limit the dispatcher can enter for this unit'"
	 * @generated
	 */
	float getMaxOperatingP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Operating P</em>' attribute.
	 * @see #getMaxOperatingP()
	 * @generated
	 */
	void setMaxOperatingP(float value);

	/**
	 * Returns the value of the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fast Start Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fast Start Flag</em>' attribute.
	 * @see #setFastStartFlag(boolean)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_FastStartFlag()
	 * @model required="true"
	 * @generated
	 */
	boolean isFastStartFlag();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag <em>Fast Start Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fast Start Flag</em>' attribute.
	 * @see #isFastStartFlag()
	 * @generated
	 */
	void setFastStartFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Gen Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Generation.Production.GeneratorControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Control Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratorControlMode
	 * @see #setGenControlMode(GeneratorControlMode)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_GenControlMode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The unit control mode.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The unit control mode.'"
	 * @generated
	 */
	GeneratorControlMode getGenControlMode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Control Mode</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Generation.Production.GeneratorControlMode
	 * @see #getGenControlMode()
	 * @generated
	 */
	void setGenControlMode(GeneratorControlMode value);

	/**
	 * Returns the value of the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Net Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Net Max P</em>' attribute.
	 * @see #setRatedNetMaxP(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_RatedNetMaxP()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity'"
	 * @generated
	 */
	float getRatedNetMaxP();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Net Max P</em>' attribute.
	 * @see #getRatedNetMaxP()
	 * @generated
	 */
	void setRatedNetMaxP(float value);

	/**
	 * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efficiency</em>' attribute.
	 * @see #setEfficiency(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_Efficiency()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PU" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The efficiency of the unit in converting mechanical energy, from the prime mover, into electrical energy.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The efficiency of the unit in converting mechanical energy, from the prime mover, into electrical energy.'"
	 * @generated
	 */
	float getEfficiency();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficiency</em>' attribute.
	 * @see #getEfficiency()
	 * @generated
	 */
	void setEfficiency(float value);

	/**
	 * Returns the value of the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Off Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Off Time</em>' attribute.
	 * @see #setMinimumOffTime(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_MinimumOffTime()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Seconds" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum time interval between unit shutdown and startup'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum time interval between unit shutdown and startup'"
	 * @generated
	 */
	float getMinimumOffTime();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Off Time</em>' attribute.
	 * @see #getMinimumOffTime()
	 * @generated
	 */
	void setMinimumOffTime(float value);

	/**
	 * Returns the value of the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disp Reserve Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disp Reserve Flag</em>' attribute.
	 * @see #setDispReserveFlag(boolean)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_DispReserveFlag()
	 * @model required="true"
	 * @generated
	 */
	boolean isDispReserveFlag();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag <em>Disp Reserve Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disp Reserve Flag</em>' attribute.
	 * @see #isDispReserveFlag()
	 * @generated
	 */
	void setDispReserveFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Allowable Spinning Reserve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
	 * @see #setMaximumAllowableSpinningReserve(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_MaximumAllowableSpinningReserve()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum allowable spinning reserve. Spinning reserve will never be considered greater than this value regardless of the current operating point.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum allowable spinning reserve. Spinning reserve will never be considered greater than this value regardless of the current operating point.'"
	 * @generated
	 */
	float getMaximumAllowableSpinningReserve();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 */
	void setMaximumAllowableSpinningReserve(float value);

	/**
	 * Returns the value of the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Deadband</em>' attribute.
	 * @see #setControlDeadband(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_ControlDeadband()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Unit control error deadband. When a unit\'s desired active power change is less than this deadband, then no control pulses will be sent to the unit.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Unit control error deadband. When a unit\'s desired active power change is less than this deadband, then no control pulses will be sent to the unit.'"
	 * @generated
	 */
	float getControlDeadband();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Deadband</em>' attribute.
	 * @see #getControlDeadband()
	 * @generated
	 */
	void setControlDeadband(float value);

	/**
	 * Returns the value of the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal PF</em>' attribute.
	 * @see #setNormalPF(float)
	 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit_NormalPF()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generating unit economic participation factor'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generating unit economic participation factor'"
	 * @generated
	 */
	float getNormalPF();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal PF</em>' attribute.
	 * @see #getNormalPF()
	 * @generated
	 */
	void setNormalPF(float value);

} // GeneratingUnit
