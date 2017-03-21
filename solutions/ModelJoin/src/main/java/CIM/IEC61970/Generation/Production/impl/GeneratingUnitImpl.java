/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit;
import CIM.IEC61970.ControlArea.ControlAreaPackage;

import CIM.IEC61970.Core.impl.EquipmentImpl;

import CIM.IEC61970.Generation.Production.GenUnitOpCostCurve;
import CIM.IEC61970.Generation.Production.GenUnitOpSchedule;
import CIM.IEC61970.Generation.Production.GeneratingUnit;
import CIM.IEC61970.Generation.Production.GeneratorControlMode;
import CIM.IEC61970.Generation.Production.GeneratorControlSource;
import CIM.IEC61970.Generation.Production.GeneratorOperatingMode;
import CIM.IEC61970.Generation.Production.GrossToNetActivePowerCurve;
import CIM.IEC61970.Generation.Production.ProductionPackage;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.SubControlArea;

import CIM.IEC61970.Informative.Financial.FinancialPackage;
import CIM.IEC61970.Informative.Financial.GenerationProvider;

import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.RegisteredGenerator;

import CIM.IEC61970.Wires.SynchronousMachine;
import CIM.IEC61970.Wires.WiresPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getHighControlLimit <em>High Control Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getOperatedBy_GenerationProvider <em>Operated By Generation Provider</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getRaiseRampRate <em>Raise Ramp Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getGenOperatingMode <em>Gen Operating Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getControlPulseLow <em>Control Pulse Low</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getGovernorMPL <em>Governor MPL</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getAllocSpinResP <em>Alloc Spin Res P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getStepChange <em>Step Change</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getSpinReserveRamp <em>Spin Reserve Ramp</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getNominalP <em>Nominal P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getPenaltyFactor <em>Penalty Factor</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getControlPulseHigh <em>Control Pulse High</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getEnergyMinP <em>Energy Min P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getTieLinePF <em>Tie Line PF</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getLowerRampRate <em>Lower Ramp Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getInitialP <em>Initial P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getControlResponseRate <em>Control Response Rate</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getMinEconomicP <em>Min Economic P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getModelDetail <em>Model Detail</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getFuelPriority <em>Fuel Priority</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getMaxEconomicP <em>Max Economic P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getVariableCost <em>Variable Cost</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getMinOperatingP <em>Min Operating P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getBaseP <em>Base P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getLowControlLimit <em>Low Control Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getRegisteredGenerator <em>Registered Generator</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getSubControlArea <em>Sub Control Area</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#isFastStartFlag <em>Fast Start Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getGenControlMode <em>Gen Control Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getMinimumOffTime <em>Minimum Off Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#isDispReserveFlag <em>Disp Reserve Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getControlDeadband <em>Control Deadband</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.GeneratingUnitImpl#getNormalPF <em>Normal PF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratingUnitImpl extends EquipmentImpl implements GeneratingUnit {
	/**
	 * The default value of the '{@link #getHighControlLimit() <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighControlLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_CONTROL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighControlLimit() <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighControlLimit()
	 * @generated
	 * @ordered
	 */
	protected float highControlLimit = HIGH_CONTROL_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperatedBy_GenerationProvider() <em>Operated By Generation Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatedBy_GenerationProvider()
	 * @generated
	 * @ordered
	 */
	protected GenerationProvider operatedBy_GenerationProvider;

	/**
	 * The default value of the '{@link #getRaiseRampRate() <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final float RAISE_RAMP_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRaiseRampRate() <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseRampRate()
	 * @generated
	 * @ordered
	 */
	protected float raiseRampRate = RAISE_RAMP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenOperatingMode() <em>Gen Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratorOperatingMode GEN_OPERATING_MODE_EDEFAULT = GeneratorOperatingMode.FIXED;

	/**
	 * The cached value of the '{@link #getGenOperatingMode() <em>Gen Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected GeneratorOperatingMode genOperatingMode = GEN_OPERATING_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoCntrlMarginP() <em>Auto Cntrl Margin P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCntrlMarginP()
	 * @generated
	 * @ordered
	 */
	protected static final float AUTO_CNTRL_MARGIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAutoCntrlMarginP() <em>Auto Cntrl Margin P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCntrlMarginP()
	 * @generated
	 * @ordered
	 */
	protected float autoCntrlMarginP = AUTO_CNTRL_MARGIN_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlPulseLow() <em>Control Pulse Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPulseLow()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PULSE_LOW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPulseLow() <em>Control Pulse Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPulseLow()
	 * @generated
	 * @ordered
	 */
	protected float controlPulseLow = CONTROL_PULSE_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getGovernorMPL() <em>Governor MPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernorMPL()
	 * @generated
	 * @ordered
	 */
	protected static final float GOVERNOR_MPL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGovernorMPL() <em>Governor MPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernorMPL()
	 * @generated
	 * @ordered
	 */
	protected float governorMPL = GOVERNOR_MPL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_GROSS_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMaxP()
	 * @generated
	 * @ordered
	 */
	protected float ratedGrossMaxP = RATED_GROSS_MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocSpinResP() <em>Alloc Spin Res P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocSpinResP()
	 * @generated
	 * @ordered
	 */
	protected static final float ALLOC_SPIN_RES_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAllocSpinResP() <em>Alloc Spin Res P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocSpinResP()
	 * @generated
	 * @ordered
	 */
	protected float allocSpinResP = ALLOC_SPIN_RES_P_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenUnitOpSchedule() <em>Gen Unit Op Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenUnitOpSchedule()
	 * @generated
	 * @ordered
	 */
	protected GenUnitOpSchedule genUnitOpSchedule;

	/**
	 * The default value of the '{@link #getStepChange() <em>Step Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepChange()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_CHANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepChange() <em>Step Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepChange()
	 * @generated
	 * @ordered
	 */
	protected float stepChange = STEP_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupCost()
	 * @generated
	 * @ordered
	 */
	protected static final float STARTUP_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupCost()
	 * @generated
	 * @ordered
	 */
	protected float startupCost = STARTUP_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpinReserveRamp() <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinReserveRamp()
	 * @generated
	 * @ordered
	 */
	protected static final float SPIN_RESERVE_RAMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpinReserveRamp() <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinReserveRamp()
	 * @generated
	 * @ordered
	 */
	protected float spinReserveRamp = SPIN_RESERVE_RAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalP() <em>Nominal P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalP()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalP() <em>Nominal P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalP()
	 * @generated
	 * @ordered
	 */
	protected float nominalP = NOMINAL_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernorSCD()
	 * @generated
	 * @ordered
	 */
	protected static final float GOVERNOR_SCD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernorSCD()
	 * @generated
	 * @ordered
	 */
	protected float governorSCD = GOVERNOR_SCD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenaltyFactor() <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float PENALTY_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPenaltyFactor() <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyFactor()
	 * @generated
	 * @ordered
	 */
	protected float penaltyFactor = PENALTY_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlPulseHigh() <em>Control Pulse High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPulseHigh()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PULSE_HIGH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPulseHigh() <em>Control Pulse High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPulseHigh()
	 * @generated
	 * @ordered
	 */
	protected float controlPulseHigh = CONTROL_PULSE_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyMinP() <em>Energy Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyMinP() <em>Energy Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMinP()
	 * @generated
	 * @ordered
	 */
	protected float energyMinP = ENERGY_MIN_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected static final float STARTUP_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected float startupTime = STARTUP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTieLinePF() <em>Tie Line PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieLinePF()
	 * @generated
	 * @ordered
	 */
	protected static final float TIE_LINE_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTieLinePF() <em>Tie Line PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieLinePF()
	 * @generated
	 * @ordered
	 */
	protected float tieLinePF = TIE_LINE_PF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerRampRate() <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_RAMP_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerRampRate() <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRampRate()
	 * @generated
	 * @ordered
	 */
	protected float lowerRampRate = LOWER_RAMP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialP() <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialP()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialP() <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialP()
	 * @generated
	 * @ordered
	 */
	protected float initialP = INITIAL_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlResponseRate() <em>Control Response Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlResponseRate()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_RESPONSE_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlResponseRate() <em>Control Response Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlResponseRate()
	 * @generated
	 * @ordered
	 */
	protected float controlResponseRate = CONTROL_RESPONSE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinEconomicP() <em>Min Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEconomicP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_ECONOMIC_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinEconomicP() <em>Min Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEconomicP()
	 * @generated
	 * @ordered
	 */
	protected float minEconomicP = MIN_ECONOMIC_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelDetail() <em>Model Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDetail()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MODEL_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelDetail() <em>Model Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDetail()
	 * @generated
	 * @ordered
	 */
	protected BigInteger modelDetail = MODEL_DETAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAreaGeneratingUnit> controlAreaGeneratingUnit;

	/**
	 * The default value of the '{@link #getFuelPriority() <em>Fuel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int FUEL_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFuelPriority() <em>Fuel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelPriority()
	 * @generated
	 * @ordered
	 */
	protected int fuelPriority = FUEL_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrossToNetActivePowerCurves() <em>Gross To Net Active Power Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossToNetActivePowerCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<GrossToNetActivePowerCurve> grossToNetActivePowerCurves;

	/**
	 * The cached value of the '{@link #getGenUnitOpCostCurves() <em>Gen Unit Op Cost Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenUnitOpCostCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<GenUnitOpCostCurve> genUnitOpCostCurves;

	/**
	 * The default value of the '{@link #getMaxEconomicP() <em>Max Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEconomicP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ECONOMIC_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxEconomicP() <em>Max Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEconomicP()
	 * @generated
	 * @ordered
	 */
	protected float maxEconomicP = MAX_ECONOMIC_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlSource()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratorControlSource GEN_CONTROL_SOURCE_EDEFAULT = GeneratorControlSource.ON_AGC;

	/**
	 * The cached value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlSource()
	 * @generated
	 * @ordered
	 */
	protected GeneratorControlSource genControlSource = GEN_CONTROL_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_GROSS_MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMinP()
	 * @generated
	 * @ordered
	 */
	protected float ratedGrossMinP = RATED_GROSS_MIN_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCost()
	 * @generated
	 * @ordered
	 */
	protected static final float VARIABLE_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCost()
	 * @generated
	 * @ordered
	 */
	protected float variableCost = VARIABLE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOperatingP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_OPERATING_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOperatingP()
	 * @generated
	 * @ordered
	 */
	protected float minOperatingP = MIN_OPERATING_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseP() <em>Base P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseP()
	 * @generated
	 * @ordered
	 */
	protected static final float BASE_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBaseP() <em>Base P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseP()
	 * @generated
	 * @ordered
	 */
	protected float baseP = BASE_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortPF()
	 * @generated
	 * @ordered
	 */
	protected static final float SHORT_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortPF()
	 * @generated
	 * @ordered
	 */
	protected float shortPF = SHORT_PF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSynchronousMachines() <em>Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> synchronousMachines;

	/**
	 * The default value of the '{@link #getLowControlLimit() <em>Low Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowControlLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_CONTROL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowControlLimit() <em>Low Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowControlLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowControlLimit = LOW_CONTROL_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongPF()
	 * @generated
	 * @ordered
	 */
	protected static final float LONG_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongPF()
	 * @generated
	 * @ordered
	 */
	protected float longPF = LONG_PF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegisteredGenerator() <em>Registered Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredGenerator()
	 * @generated
	 * @ordered
	 */
	protected RegisteredGenerator registeredGenerator;

	/**
	 * The cached value of the '{@link #getSubControlArea() <em>Sub Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubControlArea()
	 * @generated
	 * @ordered
	 */
	protected SubControlArea subControlArea;

	/**
	 * The default value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_OPERATING_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingP()
	 * @generated
	 * @ordered
	 */
	protected float maxOperatingP = MAX_OPERATING_P_EDEFAULT;

	/**
	 * The default value of the '{@link #isFastStartFlag() <em>Fast Start Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFastStartFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAST_START_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFastStartFlag() <em>Fast Start Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFastStartFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean fastStartFlag = FAST_START_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenControlMode() <em>Gen Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratorControlMode GEN_CONTROL_MODE_EDEFAULT = GeneratorControlMode.SETPOINT;

	/**
	 * The cached value of the '{@link #getGenControlMode() <em>Gen Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlMode()
	 * @generated
	 * @ordered
	 */
	protected GeneratorControlMode genControlMode = GEN_CONTROL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedNetMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_NET_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedNetMaxP()
	 * @generated
	 * @ordered
	 */
	protected float ratedNetMaxP = RATED_NET_MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected static final float EFFICIENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected float efficiency = EFFICIENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumOffTime() <em>Minimum Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOffTime()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_OFF_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumOffTime() <em>Minimum Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOffTime()
	 * @generated
	 * @ordered
	 */
	protected float minimumOffTime = MINIMUM_OFF_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDispReserveFlag() <em>Disp Reserve Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDispReserveFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISP_RESERVE_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDispReserveFlag() <em>Disp Reserve Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDispReserveFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean dispReserveFlag = DISP_RESERVE_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 * @ordered
	 */
	protected float maximumAllowableSpinningReserve = MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlDeadband() <em>Control Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDeadband()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_DEADBAND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlDeadband() <em>Control Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDeadband()
	 * @generated
	 * @ordered
	 */
	protected float controlDeadband = CONTROL_DEADBAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPF()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPF()
	 * @generated
	 * @ordered
	 */
	protected float normalPF = NORMAL_PF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.GENERATING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighControlLimit() {
		return highControlLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighControlLimit(float newHighControlLimit) {
		float oldHighControlLimit = highControlLimit;
		highControlLimit = newHighControlLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT, oldHighControlLimit, highControlLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationProvider getOperatedBy_GenerationProvider() {
		if (operatedBy_GenerationProvider != null && operatedBy_GenerationProvider.eIsProxy()) {
			InternalEObject oldOperatedBy_GenerationProvider = (InternalEObject)operatedBy_GenerationProvider;
			operatedBy_GenerationProvider = (GenerationProvider)eResolveProxy(oldOperatedBy_GenerationProvider);
			if (operatedBy_GenerationProvider != oldOperatedBy_GenerationProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER, oldOperatedBy_GenerationProvider, operatedBy_GenerationProvider));
			}
		}
		return operatedBy_GenerationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationProvider basicGetOperatedBy_GenerationProvider() {
		return operatedBy_GenerationProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatedBy_GenerationProvider(GenerationProvider newOperatedBy_GenerationProvider, NotificationChain msgs) {
		GenerationProvider oldOperatedBy_GenerationProvider = operatedBy_GenerationProvider;
		operatedBy_GenerationProvider = newOperatedBy_GenerationProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER, oldOperatedBy_GenerationProvider, newOperatedBy_GenerationProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatedBy_GenerationProvider(GenerationProvider newOperatedBy_GenerationProvider) {
		if (newOperatedBy_GenerationProvider != operatedBy_GenerationProvider) {
			NotificationChain msgs = null;
			if (operatedBy_GenerationProvider != null)
				msgs = ((InternalEObject)operatedBy_GenerationProvider).eInverseRemove(this, FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS, GenerationProvider.class, msgs);
			if (newOperatedBy_GenerationProvider != null)
				msgs = ((InternalEObject)newOperatedBy_GenerationProvider).eInverseAdd(this, FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS, GenerationProvider.class, msgs);
			msgs = basicSetOperatedBy_GenerationProvider(newOperatedBy_GenerationProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER, newOperatedBy_GenerationProvider, newOperatedBy_GenerationProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRaiseRampRate() {
		return raiseRampRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaiseRampRate(float newRaiseRampRate) {
		float oldRaiseRampRate = raiseRampRate;
		raiseRampRate = newRaiseRampRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE, oldRaiseRampRate, raiseRampRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorOperatingMode getGenOperatingMode() {
		return genOperatingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOperatingMode(GeneratorOperatingMode newGenOperatingMode) {
		GeneratorOperatingMode oldGenOperatingMode = genOperatingMode;
		genOperatingMode = newGenOperatingMode == null ? GEN_OPERATING_MODE_EDEFAULT : newGenOperatingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE, oldGenOperatingMode, genOperatingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAutoCntrlMarginP() {
		return autoCntrlMarginP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoCntrlMarginP(float newAutoCntrlMarginP) {
		float oldAutoCntrlMarginP = autoCntrlMarginP;
		autoCntrlMarginP = newAutoCntrlMarginP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P, oldAutoCntrlMarginP, autoCntrlMarginP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlPulseLow() {
		return controlPulseLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPulseLow(float newControlPulseLow) {
		float oldControlPulseLow = controlPulseLow;
		controlPulseLow = newControlPulseLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW, oldControlPulseLow, controlPulseLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGovernorMPL() {
		return governorMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGovernorMPL(float newGovernorMPL) {
		float oldGovernorMPL = governorMPL;
		governorMPL = newGovernorMPL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL, oldGovernorMPL, governorMPL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedGrossMaxP() {
		return ratedGrossMaxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedGrossMaxP(float newRatedGrossMaxP) {
		float oldRatedGrossMaxP = ratedGrossMaxP;
		ratedGrossMaxP = newRatedGrossMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P, oldRatedGrossMaxP, ratedGrossMaxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAllocSpinResP() {
		return allocSpinResP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocSpinResP(float newAllocSpinResP) {
		float oldAllocSpinResP = allocSpinResP;
		allocSpinResP = newAllocSpinResP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P, oldAllocSpinResP, allocSpinResP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitOpSchedule getGenUnitOpSchedule() {
		if (genUnitOpSchedule != null && genUnitOpSchedule.eIsProxy()) {
			InternalEObject oldGenUnitOpSchedule = (InternalEObject)genUnitOpSchedule;
			genUnitOpSchedule = (GenUnitOpSchedule)eResolveProxy(oldGenUnitOpSchedule);
			if (genUnitOpSchedule != oldGenUnitOpSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE, oldGenUnitOpSchedule, genUnitOpSchedule));
			}
		}
		return genUnitOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitOpSchedule basicGetGenUnitOpSchedule() {
		return genUnitOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenUnitOpSchedule(GenUnitOpSchedule newGenUnitOpSchedule, NotificationChain msgs) {
		GenUnitOpSchedule oldGenUnitOpSchedule = genUnitOpSchedule;
		genUnitOpSchedule = newGenUnitOpSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE, oldGenUnitOpSchedule, newGenUnitOpSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenUnitOpSchedule(GenUnitOpSchedule newGenUnitOpSchedule) {
		if (newGenUnitOpSchedule != genUnitOpSchedule) {
			NotificationChain msgs = null;
			if (genUnitOpSchedule != null)
				msgs = ((InternalEObject)genUnitOpSchedule).eInverseRemove(this, ProductionPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs);
			if (newGenUnitOpSchedule != null)
				msgs = ((InternalEObject)newGenUnitOpSchedule).eInverseAdd(this, ProductionPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs);
			msgs = basicSetGenUnitOpSchedule(newGenUnitOpSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE, newGenUnitOpSchedule, newGenUnitOpSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStepChange() {
		return stepChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepChange(float newStepChange) {
		float oldStepChange = stepChange;
		stepChange = newStepChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__STEP_CHANGE, oldStepChange, stepChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStartupCost() {
		return startupCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupCost(float newStartupCost) {
		float oldStartupCost = startupCost;
		startupCost = newStartupCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__STARTUP_COST, oldStartupCost, startupCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpinReserveRamp() {
		return spinReserveRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpinReserveRamp(float newSpinReserveRamp) {
		float oldSpinReserveRamp = spinReserveRamp;
		spinReserveRamp = newSpinReserveRamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP, oldSpinReserveRamp, spinReserveRamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNominalP() {
		return nominalP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalP(float newNominalP) {
		float oldNominalP = nominalP;
		nominalP = newNominalP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__NOMINAL_P, oldNominalP, nominalP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGovernorSCD() {
		return governorSCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGovernorSCD(float newGovernorSCD) {
		float oldGovernorSCD = governorSCD;
		governorSCD = newGovernorSCD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD, oldGovernorSCD, governorSCD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPenaltyFactor() {
		return penaltyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenaltyFactor(float newPenaltyFactor) {
		float oldPenaltyFactor = penaltyFactor;
		penaltyFactor = newPenaltyFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR, oldPenaltyFactor, penaltyFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlPulseHigh() {
		return controlPulseHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPulseHigh(float newControlPulseHigh) {
		float oldControlPulseHigh = controlPulseHigh;
		controlPulseHigh = newControlPulseHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH, oldControlPulseHigh, controlPulseHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyMinP() {
		return energyMinP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyMinP(float newEnergyMinP) {
		float oldEnergyMinP = energyMinP;
		energyMinP = newEnergyMinP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P, oldEnergyMinP, energyMinP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStartupTime() {
		return startupTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupTime(float newStartupTime) {
		float oldStartupTime = startupTime;
		startupTime = newStartupTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__STARTUP_TIME, oldStartupTime, startupTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTieLinePF() {
		return tieLinePF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieLinePF(float newTieLinePF) {
		float oldTieLinePF = tieLinePF;
		tieLinePF = newTieLinePF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__TIE_LINE_PF, oldTieLinePF, tieLinePF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerRampRate() {
		return lowerRampRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerRampRate(float newLowerRampRate) {
		float oldLowerRampRate = lowerRampRate;
		lowerRampRate = newLowerRampRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE, oldLowerRampRate, lowerRampRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInitialP() {
		return initialP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialP(float newInitialP) {
		float oldInitialP = initialP;
		initialP = newInitialP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__INITIAL_P, oldInitialP, initialP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlResponseRate() {
		return controlResponseRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlResponseRate(float newControlResponseRate) {
		float oldControlResponseRate = controlResponseRate;
		controlResponseRate = newControlResponseRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE, oldControlResponseRate, controlResponseRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinEconomicP() {
		return minEconomicP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinEconomicP(float newMinEconomicP) {
		float oldMinEconomicP = minEconomicP;
		minEconomicP = newMinEconomicP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P, oldMinEconomicP, minEconomicP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getModelDetail() {
		return modelDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelDetail(BigInteger newModelDetail) {
		BigInteger oldModelDetail = modelDetail;
		modelDetail = newModelDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__MODEL_DETAIL, oldModelDetail, modelDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
		if (controlAreaGeneratingUnit == null) {
			controlAreaGeneratingUnit = new EObjectWithInverseResolvingEList<ControlAreaGeneratingUnit>(ControlAreaGeneratingUnit.class, this, ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT);
		}
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFuelPriority() {
		return fuelPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelPriority(int newFuelPriority) {
		int oldFuelPriority = fuelPriority;
		fuelPriority = newFuelPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY, oldFuelPriority, fuelPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrossToNetActivePowerCurve> getGrossToNetActivePowerCurves() {
		if (grossToNetActivePowerCurves == null) {
			grossToNetActivePowerCurves = new EObjectWithInverseResolvingEList<GrossToNetActivePowerCurve>(GrossToNetActivePowerCurve.class, this, ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES, ProductionPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT);
		}
		return grossToNetActivePowerCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenUnitOpCostCurve> getGenUnitOpCostCurves() {
		if (genUnitOpCostCurves == null) {
			genUnitOpCostCurves = new EObjectWithInverseResolvingEList<GenUnitOpCostCurve>(GenUnitOpCostCurve.class, this, ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES, ProductionPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT);
		}
		return genUnitOpCostCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxEconomicP() {
		return maxEconomicP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEconomicP(float newMaxEconomicP) {
		float oldMaxEconomicP = maxEconomicP;
		maxEconomicP = newMaxEconomicP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P, oldMaxEconomicP, maxEconomicP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorControlSource getGenControlSource() {
		return genControlSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenControlSource(GeneratorControlSource newGenControlSource) {
		GeneratorControlSource oldGenControlSource = genControlSource;
		genControlSource = newGenControlSource == null ? GEN_CONTROL_SOURCE_EDEFAULT : newGenControlSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE, oldGenControlSource, genControlSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedGrossMinP() {
		return ratedGrossMinP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedGrossMinP(float newRatedGrossMinP) {
		float oldRatedGrossMinP = ratedGrossMinP;
		ratedGrossMinP = newRatedGrossMinP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P, oldRatedGrossMinP, ratedGrossMinP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVariableCost() {
		return variableCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableCost(float newVariableCost) {
		float oldVariableCost = variableCost;
		variableCost = newVariableCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__VARIABLE_COST, oldVariableCost, variableCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinOperatingP() {
		return minOperatingP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOperatingP(float newMinOperatingP) {
		float oldMinOperatingP = minOperatingP;
		minOperatingP = newMinOperatingP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P, oldMinOperatingP, minOperatingP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBaseP() {
		return baseP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseP(float newBaseP) {
		float oldBaseP = baseP;
		baseP = newBaseP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__BASE_P, oldBaseP, baseP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShortPF() {
		return shortPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortPF(float newShortPF) {
		float oldShortPF = shortPF;
		shortPF = newShortPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__SHORT_PF, oldShortPF, shortPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronousMachine> getSynchronousMachines() {
		if (synchronousMachines == null) {
			synchronousMachines = new EObjectWithInverseResolvingEList<SynchronousMachine>(SynchronousMachine.class, this, ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES, WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT);
		}
		return synchronousMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowControlLimit() {
		return lowControlLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowControlLimit(float newLowControlLimit) {
		float oldLowControlLimit = lowControlLimit;
		lowControlLimit = newLowControlLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT, oldLowControlLimit, lowControlLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLongPF() {
		return longPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongPF(float newLongPF) {
		float oldLongPF = longPF;
		longPF = newLongPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__LONG_PF, oldLongPF, longPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredGenerator getRegisteredGenerator() {
		if (registeredGenerator != null && registeredGenerator.eIsProxy()) {
			InternalEObject oldRegisteredGenerator = (InternalEObject)registeredGenerator;
			registeredGenerator = (RegisteredGenerator)eResolveProxy(oldRegisteredGenerator);
			if (registeredGenerator != oldRegisteredGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR, oldRegisteredGenerator, registeredGenerator));
			}
		}
		return registeredGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredGenerator basicGetRegisteredGenerator() {
		return registeredGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisteredGenerator(RegisteredGenerator newRegisteredGenerator, NotificationChain msgs) {
		RegisteredGenerator oldRegisteredGenerator = registeredGenerator;
		registeredGenerator = newRegisteredGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR, oldRegisteredGenerator, newRegisteredGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredGenerator(RegisteredGenerator newRegisteredGenerator) {
		if (newRegisteredGenerator != registeredGenerator) {
			NotificationChain msgs = null;
			if (registeredGenerator != null)
				msgs = ((InternalEObject)registeredGenerator).eInverseRemove(this, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT, RegisteredGenerator.class, msgs);
			if (newRegisteredGenerator != null)
				msgs = ((InternalEObject)newRegisteredGenerator).eInverseAdd(this, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT, RegisteredGenerator.class, msgs);
			msgs = basicSetRegisteredGenerator(newRegisteredGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR, newRegisteredGenerator, newRegisteredGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea getSubControlArea() {
		if (subControlArea != null && subControlArea.eIsProxy()) {
			InternalEObject oldSubControlArea = (InternalEObject)subControlArea;
			subControlArea = (SubControlArea)eResolveProxy(oldSubControlArea);
			if (subControlArea != oldSubControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA, oldSubControlArea, subControlArea));
			}
		}
		return subControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubControlArea basicGetSubControlArea() {
		return subControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubControlArea(SubControlArea newSubControlArea, NotificationChain msgs) {
		SubControlArea oldSubControlArea = subControlArea;
		subControlArea = newSubControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA, oldSubControlArea, newSubControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubControlArea(SubControlArea newSubControlArea) {
		if (newSubControlArea != subControlArea) {
			NotificationChain msgs = null;
			if (subControlArea != null)
				msgs = ((InternalEObject)subControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS, SubControlArea.class, msgs);
			if (newSubControlArea != null)
				msgs = ((InternalEObject)newSubControlArea).eInverseAdd(this, EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS, SubControlArea.class, msgs);
			msgs = basicSetSubControlArea(newSubControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA, newSubControlArea, newSubControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxOperatingP() {
		return maxOperatingP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOperatingP(float newMaxOperatingP) {
		float oldMaxOperatingP = maxOperatingP;
		maxOperatingP = newMaxOperatingP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P, oldMaxOperatingP, maxOperatingP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFastStartFlag() {
		return fastStartFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFastStartFlag(boolean newFastStartFlag) {
		boolean oldFastStartFlag = fastStartFlag;
		fastStartFlag = newFastStartFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__FAST_START_FLAG, oldFastStartFlag, fastStartFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorControlMode getGenControlMode() {
		return genControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenControlMode(GeneratorControlMode newGenControlMode) {
		GeneratorControlMode oldGenControlMode = genControlMode;
		genControlMode = newGenControlMode == null ? GEN_CONTROL_MODE_EDEFAULT : newGenControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE, oldGenControlMode, genControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedNetMaxP() {
		return ratedNetMaxP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedNetMaxP(float newRatedNetMaxP) {
		float oldRatedNetMaxP = ratedNetMaxP;
		ratedNetMaxP = newRatedNetMaxP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P, oldRatedNetMaxP, ratedNetMaxP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEfficiency() {
		return efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfficiency(float newEfficiency) {
		float oldEfficiency = efficiency;
		efficiency = newEfficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__EFFICIENCY, oldEfficiency, efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumOffTime() {
		return minimumOffTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumOffTime(float newMinimumOffTime) {
		float oldMinimumOffTime = minimumOffTime;
		minimumOffTime = newMinimumOffTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME, oldMinimumOffTime, minimumOffTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDispReserveFlag() {
		return dispReserveFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispReserveFlag(boolean newDispReserveFlag) {
		boolean oldDispReserveFlag = dispReserveFlag;
		dispReserveFlag = newDispReserveFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG, oldDispReserveFlag, dispReserveFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaximumAllowableSpinningReserve() {
		return maximumAllowableSpinningReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumAllowableSpinningReserve(float newMaximumAllowableSpinningReserve) {
		float oldMaximumAllowableSpinningReserve = maximumAllowableSpinningReserve;
		maximumAllowableSpinningReserve = newMaximumAllowableSpinningReserve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE, oldMaximumAllowableSpinningReserve, maximumAllowableSpinningReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getControlDeadband() {
		return controlDeadband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlDeadband(float newControlDeadband) {
		float oldControlDeadband = controlDeadband;
		controlDeadband = newControlDeadband;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND, oldControlDeadband, controlDeadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormalPF() {
		return normalPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalPF(float newNormalPF) {
		float oldNormalPF = normalPF;
		normalPF = newNormalPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.GENERATING_UNIT__NORMAL_PF, oldNormalPF, normalPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER:
				if (operatedBy_GenerationProvider != null)
					msgs = ((InternalEObject)operatedBy_GenerationProvider).eInverseRemove(this, FinancialPackage.GENERATION_PROVIDER__GENERATING_UNITS, GenerationProvider.class, msgs);
				return basicSetOperatedBy_GenerationProvider((GenerationProvider)otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				if (genUnitOpSchedule != null)
					msgs = ((InternalEObject)genUnitOpSchedule).eInverseRemove(this, ProductionPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs);
				return basicSetGenUnitOpSchedule((GenUnitOpSchedule)otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlAreaGeneratingUnit()).basicAdd(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGrossToNetActivePowerCurves()).basicAdd(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenUnitOpCostCurves()).basicAdd(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchronousMachines()).basicAdd(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR:
				if (registeredGenerator != null)
					msgs = ((InternalEObject)registeredGenerator).eInverseRemove(this, MarketOperationsPackage.REGISTERED_GENERATOR__GENERATING_UNIT, RegisteredGenerator.class, msgs);
				return basicSetRegisteredGenerator((RegisteredGenerator)otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA:
				if (subControlArea != null)
					msgs = ((InternalEObject)subControlArea).eInverseRemove(this, EnergySchedulingPackage.SUB_CONTROL_AREA__GENERATING_UNITS, SubControlArea.class, msgs);
				return basicSetSubControlArea((SubControlArea)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER:
				return basicSetOperatedBy_GenerationProvider(null, msgs);
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				return basicSetGenUnitOpSchedule(null, msgs);
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<?>)getControlAreaGeneratingUnit()).basicRemove(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return ((InternalEList<?>)getGrossToNetActivePowerCurves()).basicRemove(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				return ((InternalEList<?>)getGenUnitOpCostCurves()).basicRemove(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getSynchronousMachines()).basicRemove(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR:
				return basicSetRegisteredGenerator(null, msgs);
			case ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA:
				return basicSetSubControlArea(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
				return getHighControlLimit();
			case ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER:
				if (resolve) return getOperatedBy_GenerationProvider();
				return basicGetOperatedBy_GenerationProvider();
			case ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
				return getRaiseRampRate();
			case ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE:
				return getGenOperatingMode();
			case ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
				return getAutoCntrlMarginP();
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
				return getControlPulseLow();
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL:
				return getGovernorMPL();
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				return getRatedGrossMaxP();
			case ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
				return getAllocSpinResP();
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				if (resolve) return getGenUnitOpSchedule();
				return basicGetGenUnitOpSchedule();
			case ProductionPackage.GENERATING_UNIT__STEP_CHANGE:
				return getStepChange();
			case ProductionPackage.GENERATING_UNIT__STARTUP_COST:
				return getStartupCost();
			case ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP:
				return getSpinReserveRamp();
			case ProductionPackage.GENERATING_UNIT__NOMINAL_P:
				return getNominalP();
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD:
				return getGovernorSCD();
			case ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR:
				return getPenaltyFactor();
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
				return getControlPulseHigh();
			case ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P:
				return getEnergyMinP();
			case ProductionPackage.GENERATING_UNIT__STARTUP_TIME:
				return getStartupTime();
			case ProductionPackage.GENERATING_UNIT__TIE_LINE_PF:
				return getTieLinePF();
			case ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
				return getLowerRampRate();
			case ProductionPackage.GENERATING_UNIT__INITIAL_P:
				return getInitialP();
			case ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
				return getControlResponseRate();
			case ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
				return getMinEconomicP();
			case ProductionPackage.GENERATING_UNIT__MODEL_DETAIL:
				return getModelDetail();
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return getControlAreaGeneratingUnit();
			case ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY:
				return getFuelPriority();
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return getGrossToNetActivePowerCurves();
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				return getGenUnitOpCostCurves();
			case ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
				return getMaxEconomicP();
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				return getGenControlSource();
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				return getRatedGrossMinP();
			case ProductionPackage.GENERATING_UNIT__VARIABLE_COST:
				return getVariableCost();
			case ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P:
				return getMinOperatingP();
			case ProductionPackage.GENERATING_UNIT__BASE_P:
				return getBaseP();
			case ProductionPackage.GENERATING_UNIT__SHORT_PF:
				return getShortPF();
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				return getSynchronousMachines();
			case ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
				return getLowControlLimit();
			case ProductionPackage.GENERATING_UNIT__LONG_PF:
				return getLongPF();
			case ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR:
				if (resolve) return getRegisteredGenerator();
				return basicGetRegisteredGenerator();
			case ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA:
				if (resolve) return getSubControlArea();
				return basicGetSubControlArea();
			case ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P:
				return getMaxOperatingP();
			case ProductionPackage.GENERATING_UNIT__FAST_START_FLAG:
				return isFastStartFlag();
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
				return getGenControlMode();
			case ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				return getRatedNetMaxP();
			case ProductionPackage.GENERATING_UNIT__EFFICIENCY:
				return getEfficiency();
			case ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
				return getMinimumOffTime();
			case ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG:
				return isDispReserveFlag();
			case ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				return getMaximumAllowableSpinningReserve();
			case ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND:
				return getControlDeadband();
			case ProductionPackage.GENERATING_UNIT__NORMAL_PF:
				return getNormalPF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
				setHighControlLimit((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER:
				setOperatedBy_GenerationProvider((GenerationProvider)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
				setRaiseRampRate((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE:
				setGenOperatingMode((GeneratorOperatingMode)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
				setAutoCntrlMarginP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
				setControlPulseLow((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL:
				setGovernorMPL((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				setRatedGrossMaxP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
				setAllocSpinResP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				setGenUnitOpSchedule((GenUnitOpSchedule)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__STEP_CHANGE:
				setStepChange((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__STARTUP_COST:
				setStartupCost((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP:
				setSpinReserveRamp((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__NOMINAL_P:
				setNominalP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD:
				setGovernorSCD((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR:
				setPenaltyFactor((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
				setControlPulseHigh((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P:
				setEnergyMinP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__STARTUP_TIME:
				setStartupTime((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__TIE_LINE_PF:
				setTieLinePF((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
				setLowerRampRate((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__INITIAL_P:
				setInitialP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
				setControlResponseRate((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
				setMinEconomicP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MODEL_DETAIL:
				setModelDetail((BigInteger)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				getControlAreaGeneratingUnit().addAll((Collection<? extends ControlAreaGeneratingUnit>)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY:
				setFuelPriority((Integer)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				getGrossToNetActivePowerCurves().clear();
				getGrossToNetActivePowerCurves().addAll((Collection<? extends GrossToNetActivePowerCurve>)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				getGenUnitOpCostCurves().clear();
				getGenUnitOpCostCurves().addAll((Collection<? extends GenUnitOpCostCurve>)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
				setMaxEconomicP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				setGenControlSource((GeneratorControlSource)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				setRatedGrossMinP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__VARIABLE_COST:
				setVariableCost((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P:
				setMinOperatingP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__BASE_P:
				setBaseP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__SHORT_PF:
				setShortPF((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				getSynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
				setLowControlLimit((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__LONG_PF:
				setLongPF((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR:
				setRegisteredGenerator((RegisteredGenerator)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA:
				setSubControlArea((SubControlArea)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P:
				setMaxOperatingP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__FAST_START_FLAG:
				setFastStartFlag((Boolean)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
				setGenControlMode((GeneratorControlMode)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				setRatedNetMaxP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__EFFICIENCY:
				setEfficiency((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
				setMinimumOffTime((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG:
				setDispReserveFlag((Boolean)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				setMaximumAllowableSpinningReserve((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND:
				setControlDeadband((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__NORMAL_PF:
				setNormalPF((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
				setHighControlLimit(HIGH_CONTROL_LIMIT_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER:
				setOperatedBy_GenerationProvider((GenerationProvider)null);
				return;
			case ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
				setRaiseRampRate(RAISE_RAMP_RATE_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE:
				setGenOperatingMode(GEN_OPERATING_MODE_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
				setAutoCntrlMarginP(AUTO_CNTRL_MARGIN_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
				setControlPulseLow(CONTROL_PULSE_LOW_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL:
				setGovernorMPL(GOVERNOR_MPL_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				setRatedGrossMaxP(RATED_GROSS_MAX_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
				setAllocSpinResP(ALLOC_SPIN_RES_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				setGenUnitOpSchedule((GenUnitOpSchedule)null);
				return;
			case ProductionPackage.GENERATING_UNIT__STEP_CHANGE:
				setStepChange(STEP_CHANGE_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__STARTUP_COST:
				setStartupCost(STARTUP_COST_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP:
				setSpinReserveRamp(SPIN_RESERVE_RAMP_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__NOMINAL_P:
				setNominalP(NOMINAL_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD:
				setGovernorSCD(GOVERNOR_SCD_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR:
				setPenaltyFactor(PENALTY_FACTOR_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
				setControlPulseHigh(CONTROL_PULSE_HIGH_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P:
				setEnergyMinP(ENERGY_MIN_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__STARTUP_TIME:
				setStartupTime(STARTUP_TIME_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__TIE_LINE_PF:
				setTieLinePF(TIE_LINE_PF_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
				setLowerRampRate(LOWER_RAMP_RATE_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__INITIAL_P:
				setInitialP(INITIAL_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
				setControlResponseRate(CONTROL_RESPONSE_RATE_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
				setMinEconomicP(MIN_ECONOMIC_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__MODEL_DETAIL:
				setModelDetail(MODEL_DETAIL_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				return;
			case ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY:
				setFuelPriority(FUEL_PRIORITY_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				getGrossToNetActivePowerCurves().clear();
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				getGenUnitOpCostCurves().clear();
				return;
			case ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
				setMaxEconomicP(MAX_ECONOMIC_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				setGenControlSource(GEN_CONTROL_SOURCE_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				setRatedGrossMinP(RATED_GROSS_MIN_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__VARIABLE_COST:
				setVariableCost(VARIABLE_COST_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P:
				setMinOperatingP(MIN_OPERATING_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__BASE_P:
				setBaseP(BASE_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__SHORT_PF:
				setShortPF(SHORT_PF_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				return;
			case ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
				setLowControlLimit(LOW_CONTROL_LIMIT_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__LONG_PF:
				setLongPF(LONG_PF_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR:
				setRegisteredGenerator((RegisteredGenerator)null);
				return;
			case ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA:
				setSubControlArea((SubControlArea)null);
				return;
			case ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P:
				setMaxOperatingP(MAX_OPERATING_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__FAST_START_FLAG:
				setFastStartFlag(FAST_START_FLAG_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
				setGenControlMode(GEN_CONTROL_MODE_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				setRatedNetMaxP(RATED_NET_MAX_P_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__EFFICIENCY:
				setEfficiency(EFFICIENCY_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
				setMinimumOffTime(MINIMUM_OFF_TIME_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG:
				setDispReserveFlag(DISP_RESERVE_FLAG_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				setMaximumAllowableSpinningReserve(MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND:
				setControlDeadband(CONTROL_DEADBAND_EDEFAULT);
				return;
			case ProductionPackage.GENERATING_UNIT__NORMAL_PF:
				setNormalPF(NORMAL_PF_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
				return highControlLimit != HIGH_CONTROL_LIMIT_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__OPERATED_BY_GENERATION_PROVIDER:
				return operatedBy_GenerationProvider != null;
			case ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
				return raiseRampRate != RAISE_RAMP_RATE_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE:
				return genOperatingMode != GEN_OPERATING_MODE_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
				return autoCntrlMarginP != AUTO_CNTRL_MARGIN_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
				return controlPulseLow != CONTROL_PULSE_LOW_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL:
				return governorMPL != GOVERNOR_MPL_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				return ratedGrossMaxP != RATED_GROSS_MAX_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
				return allocSpinResP != ALLOC_SPIN_RES_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				return genUnitOpSchedule != null;
			case ProductionPackage.GENERATING_UNIT__STEP_CHANGE:
				return stepChange != STEP_CHANGE_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__STARTUP_COST:
				return startupCost != STARTUP_COST_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP:
				return spinReserveRamp != SPIN_RESERVE_RAMP_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__NOMINAL_P:
				return nominalP != NOMINAL_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD:
				return governorSCD != GOVERNOR_SCD_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR:
				return penaltyFactor != PENALTY_FACTOR_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
				return controlPulseHigh != CONTROL_PULSE_HIGH_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P:
				return energyMinP != ENERGY_MIN_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__STARTUP_TIME:
				return startupTime != STARTUP_TIME_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__TIE_LINE_PF:
				return tieLinePF != TIE_LINE_PF_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
				return lowerRampRate != LOWER_RAMP_RATE_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__INITIAL_P:
				return initialP != INITIAL_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
				return controlResponseRate != CONTROL_RESPONSE_RATE_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
				return minEconomicP != MIN_ECONOMIC_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__MODEL_DETAIL:
				return MODEL_DETAIL_EDEFAULT == null ? modelDetail != null : !MODEL_DETAIL_EDEFAULT.equals(modelDetail);
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return controlAreaGeneratingUnit != null && !controlAreaGeneratingUnit.isEmpty();
			case ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY:
				return fuelPriority != FUEL_PRIORITY_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return grossToNetActivePowerCurves != null && !grossToNetActivePowerCurves.isEmpty();
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				return genUnitOpCostCurves != null && !genUnitOpCostCurves.isEmpty();
			case ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
				return maxEconomicP != MAX_ECONOMIC_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				return genControlSource != GEN_CONTROL_SOURCE_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				return ratedGrossMinP != RATED_GROSS_MIN_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__VARIABLE_COST:
				return variableCost != VARIABLE_COST_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P:
				return minOperatingP != MIN_OPERATING_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__BASE_P:
				return baseP != BASE_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__SHORT_PF:
				return shortPF != SHORT_PF_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				return synchronousMachines != null && !synchronousMachines.isEmpty();
			case ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
				return lowControlLimit != LOW_CONTROL_LIMIT_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__LONG_PF:
				return longPF != LONG_PF_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__REGISTERED_GENERATOR:
				return registeredGenerator != null;
			case ProductionPackage.GENERATING_UNIT__SUB_CONTROL_AREA:
				return subControlArea != null;
			case ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P:
				return maxOperatingP != MAX_OPERATING_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__FAST_START_FLAG:
				return fastStartFlag != FAST_START_FLAG_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
				return genControlMode != GEN_CONTROL_MODE_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				return ratedNetMaxP != RATED_NET_MAX_P_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__EFFICIENCY:
				return efficiency != EFFICIENCY_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
				return minimumOffTime != MINIMUM_OFF_TIME_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG:
				return dispReserveFlag != DISP_RESERVE_FLAG_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				return maximumAllowableSpinningReserve != MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND:
				return controlDeadband != CONTROL_DEADBAND_EDEFAULT;
			case ProductionPackage.GENERATING_UNIT__NORMAL_PF:
				return normalPF != NORMAL_PF_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (highControlLimit: ");
		result.append(highControlLimit);
		result.append(", raiseRampRate: ");
		result.append(raiseRampRate);
		result.append(", genOperatingMode: ");
		result.append(genOperatingMode);
		result.append(", autoCntrlMarginP: ");
		result.append(autoCntrlMarginP);
		result.append(", controlPulseLow: ");
		result.append(controlPulseLow);
		result.append(", governorMPL: ");
		result.append(governorMPL);
		result.append(", ratedGrossMaxP: ");
		result.append(ratedGrossMaxP);
		result.append(", allocSpinResP: ");
		result.append(allocSpinResP);
		result.append(", stepChange: ");
		result.append(stepChange);
		result.append(", startupCost: ");
		result.append(startupCost);
		result.append(", spinReserveRamp: ");
		result.append(spinReserveRamp);
		result.append(", nominalP: ");
		result.append(nominalP);
		result.append(", governorSCD: ");
		result.append(governorSCD);
		result.append(", penaltyFactor: ");
		result.append(penaltyFactor);
		result.append(", controlPulseHigh: ");
		result.append(controlPulseHigh);
		result.append(", energyMinP: ");
		result.append(energyMinP);
		result.append(", startupTime: ");
		result.append(startupTime);
		result.append(", tieLinePF: ");
		result.append(tieLinePF);
		result.append(", lowerRampRate: ");
		result.append(lowerRampRate);
		result.append(", initialP: ");
		result.append(initialP);
		result.append(", controlResponseRate: ");
		result.append(controlResponseRate);
		result.append(", minEconomicP: ");
		result.append(minEconomicP);
		result.append(", modelDetail: ");
		result.append(modelDetail);
		result.append(", fuelPriority: ");
		result.append(fuelPriority);
		result.append(", maxEconomicP: ");
		result.append(maxEconomicP);
		result.append(", genControlSource: ");
		result.append(genControlSource);
		result.append(", ratedGrossMinP: ");
		result.append(ratedGrossMinP);
		result.append(", variableCost: ");
		result.append(variableCost);
		result.append(", minOperatingP: ");
		result.append(minOperatingP);
		result.append(", baseP: ");
		result.append(baseP);
		result.append(", shortPF: ");
		result.append(shortPF);
		result.append(", lowControlLimit: ");
		result.append(lowControlLimit);
		result.append(", longPF: ");
		result.append(longPF);
		result.append(", maxOperatingP: ");
		result.append(maxOperatingP);
		result.append(", fastStartFlag: ");
		result.append(fastStartFlag);
		result.append(", genControlMode: ");
		result.append(genControlMode);
		result.append(", ratedNetMaxP: ");
		result.append(ratedNetMaxP);
		result.append(", efficiency: ");
		result.append(efficiency);
		result.append(", minimumOffTime: ");
		result.append(minimumOffTime);
		result.append(", dispReserveFlag: ");
		result.append(dispReserveFlag);
		result.append(", maximumAllowableSpinningReserve: ");
		result.append(maximumAllowableSpinningReserve);
		result.append(", controlDeadband: ");
		result.append(controlDeadband);
		result.append(", normalPF: ");
		result.append(normalPF);
		result.append(')');
		return result.toString();
	}

} //GeneratingUnitImpl
