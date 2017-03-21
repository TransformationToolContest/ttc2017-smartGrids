/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.ElectricityValues;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electricity Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerpL1 <em>Active Powerp L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerpall <em>Active Powerpall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerpL2 <em>Active Powerp L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerpL3 <em>Active Powerp L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowermL2 <em>Active Powerm L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowermL1 <em>Active Powerm L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowermL3 <em>Active Powerm L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowermall <em>Active Powermall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerpL1 <em>Reactive Powerp L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerpL2 <em>Reactive Powerp L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerpL3 <em>Reactive Powerp L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerpall <em>Reactive Powerpall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowermL1 <em>Reactive Powerm L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowermL2 <em>Reactive Powerm L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowermL3 <em>Reactive Powerm L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowermall <em>Reactive Powermall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIL1 <em>Reactive Power QIL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIL2 <em>Reactive Power QIL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIL3 <em>Reactive Power QIL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIall <em>Reactive Power QIall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIIL1 <em>Reactive Power QIIL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIIL2 <em>Reactive Power QIIL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIIL3 <em>Reactive Power QIIL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIIall <em>Reactive Power QI Iall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIIIL1 <em>Reactive Power QIIIL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIIIL2 <em>Reactive Power QIIIL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIIIL3 <em>Reactive Power QIIIL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIIIall <em>Reactive Power QII Iall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIVL1 <em>Reactive Power QIVL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIVL2 <em>Reactive Power QIVL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIVL3 <em>Reactive Power QIVL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getReactivePowerQIVall <em>Reactive Power QI Vall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getApparentPowerpL1 <em>Apparent Powerp L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getApparentPowerpL2 <em>Apparent Powerp L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getApparentPowerpL3 <em>Apparent Powerp L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getApparentPowerpAll <em>Apparent Powerp All</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getApparentPowermL1 <em>Apparent Powerm L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getApparentPowermL2 <em>Apparent Powerm L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getApparentPowermL3 <em>Apparent Powerm L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getApparentPowermAll <em>Apparent Powerm All</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getCurrentL1 <em>Current L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getCurrentL2 <em>Current L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getCurrentL3 <em>Current L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getCurrentAll <em>Current All</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getVoltageL1 <em>Voltage L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getVoltageL2 <em>Voltage L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getVoltageL3 <em>Voltage L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getVoltageAll <em>Voltage All</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getPowerFactorL1 <em>Power Factor L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getPowerFactorL2 <em>Power Factor L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getPowerFactorL3 <em>Power Factor L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getPowerFactorAll <em>Power Factor All</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getSupplyFrequencyL1 <em>Supply Frequency L1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getSupplyFrequencyL2 <em>Supply Frequency L2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getSupplyFrequencyL3 <em>Supply Frequency L3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getSupplyFrequencyAll <em>Supply Frequency All</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerAbsPL1 <em>Active Power Abs PL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerAbsPL2 <em>Active Power Abs PL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerAbsPL3 <em>Active Power Abs PL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerAbsPAll <em>Active Power Abs PAll</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerAbsML1 <em>Active Power Abs ML1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerAbsML2 <em>Active Power Abs ML2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerAbsML3 <em>Active Power Abs ML3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerAbsMAll <em>Active Power Abs MAll</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIL1 <em>Active Power QIL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIL2 <em>Active Power QIL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIL3 <em>Active Power QIL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIall <em>Active Power QIall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIIL1 <em>Active Power QIIL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIIL2 <em>Active Power QIIL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIIL3 <em>Active Power QIIL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIIall <em>Active Power QI Iall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIIIL1 <em>Active Power QIIIL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIIIL2 <em>Active Power QIIIL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIIIL3 <em>Active Power QIIIL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIIIall <em>Active Power QII Iall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIVL1 <em>Active Power QIVL1</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIVL2 <em>Active Power QIVL2</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIVL3 <em>Active Power QIVL3</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getActivePowerQIVall <em>Active Power QI Vall</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getAngles <em>Angles</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getPulses <em>Pulses</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getAmpere_squaredHours <em>Ampere squared Hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getVolt_squaredHours <em>Volt squared Hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getNeutralCurrent <em>Neutral Current</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.ElectricityValuesImpl#getNeutralVoltage <em>Neutral Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricityValuesImpl extends DataImpl implements ElectricityValues {
	/**
	 * The default value of the '{@link #getActivePowerpL1() <em>Active Powerp L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerpL1()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWERP_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerpL1() <em>Active Powerp L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerpL1()
	 * @generated
	 * @ordered
	 */
	protected double activePowerpL1 = ACTIVE_POWERP_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerpall() <em>Active Powerpall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerpall()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWERPALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerpall() <em>Active Powerpall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerpall()
	 * @generated
	 * @ordered
	 */
	protected double activePowerpall = ACTIVE_POWERPALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerpL2() <em>Active Powerp L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerpL2()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWERP_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerpL2() <em>Active Powerp L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerpL2()
	 * @generated
	 * @ordered
	 */
	protected double activePowerpL2 = ACTIVE_POWERP_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerpL3() <em>Active Powerp L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerpL3()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWERP_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerpL3() <em>Active Powerp L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerpL3()
	 * @generated
	 * @ordered
	 */
	protected double activePowerpL3 = ACTIVE_POWERP_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowermL2() <em>Active Powerm L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowermL2()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWERM_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowermL2() <em>Active Powerm L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowermL2()
	 * @generated
	 * @ordered
	 */
	protected double activePowermL2 = ACTIVE_POWERM_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowermL1() <em>Active Powerm L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowermL1()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWERM_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowermL1() <em>Active Powerm L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowermL1()
	 * @generated
	 * @ordered
	 */
	protected double activePowermL1 = ACTIVE_POWERM_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowermL3() <em>Active Powerm L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowermL3()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWERM_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowermL3() <em>Active Powerm L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowermL3()
	 * @generated
	 * @ordered
	 */
	protected double activePowermL3 = ACTIVE_POWERM_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowermall() <em>Active Powermall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowermall()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWERMALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowermall() <em>Active Powermall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowermall()
	 * @generated
	 * @ordered
	 */
	protected double activePowermall = ACTIVE_POWERMALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerpL1() <em>Reactive Powerp L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerpL1()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWERP_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerpL1() <em>Reactive Powerp L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerpL1()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerpL1 = REACTIVE_POWERP_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerpL2() <em>Reactive Powerp L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerpL2()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWERP_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerpL2() <em>Reactive Powerp L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerpL2()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerpL2 = REACTIVE_POWERP_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerpL3() <em>Reactive Powerp L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerpL3()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWERP_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerpL3() <em>Reactive Powerp L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerpL3()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerpL3 = REACTIVE_POWERP_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerpall() <em>Reactive Powerpall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerpall()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWERPALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerpall() <em>Reactive Powerpall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerpall()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerpall = REACTIVE_POWERPALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowermL1() <em>Reactive Powerm L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowermL1()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWERM_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowermL1() <em>Reactive Powerm L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowermL1()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowermL1 = REACTIVE_POWERM_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowermL2() <em>Reactive Powerm L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowermL2()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWERM_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowermL2() <em>Reactive Powerm L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowermL2()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowermL2 = REACTIVE_POWERM_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowermL3() <em>Reactive Powerm L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowermL3()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWERM_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowermL3() <em>Reactive Powerm L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowermL3()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowermL3 = REACTIVE_POWERM_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowermall() <em>Reactive Powermall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowermall()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWERMALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowermall() <em>Reactive Powermall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowermall()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowermall = REACTIVE_POWERMALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIL1() <em>Reactive Power QIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIL1() <em>Reactive Power QIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIL1()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIL1 = REACTIVE_POWER_QIL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIL2() <em>Reactive Power QIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIL2() <em>Reactive Power QIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIL2()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIL2 = REACTIVE_POWER_QIL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIL3() <em>Reactive Power QIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIL3() <em>Reactive Power QIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIL3()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIL3 = REACTIVE_POWER_QIL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIall() <em>Reactive Power QIall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIall()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIall() <em>Reactive Power QIall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIall()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIall = REACTIVE_POWER_QIALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIIL1() <em>Reactive Power QIIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIIL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIIL1() <em>Reactive Power QIIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIL1()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIIL1 = REACTIVE_POWER_QIIL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIIL2() <em>Reactive Power QIIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIIL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIIL2() <em>Reactive Power QIIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIL2()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIIL2 = REACTIVE_POWER_QIIL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIIL3() <em>Reactive Power QIIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIIL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIIL3() <em>Reactive Power QIIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIL3()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIIL3 = REACTIVE_POWER_QIIL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIIall() <em>Reactive Power QI Iall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIall()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QI_IALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIIall() <em>Reactive Power QI Iall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIall()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIIall = REACTIVE_POWER_QI_IALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIIIL1() <em>Reactive Power QIIIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIIIL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIIIL1() <em>Reactive Power QIIIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIIL1()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIIIL1 = REACTIVE_POWER_QIIIL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIIIL2() <em>Reactive Power QIIIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIIIL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIIIL2() <em>Reactive Power QIIIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIIL2()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIIIL2 = REACTIVE_POWER_QIIIL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIIIL3() <em>Reactive Power QIIIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIIIL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIIIL3() <em>Reactive Power QIIIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIIL3()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIIIL3 = REACTIVE_POWER_QIIIL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIIIall() <em>Reactive Power QII Iall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIIall()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QII_IALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIIIall() <em>Reactive Power QII Iall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIIIall()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIIIall = REACTIVE_POWER_QII_IALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIVL1() <em>Reactive Power QIVL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIVL1()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIVL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIVL1() <em>Reactive Power QIVL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIVL1()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIVL1 = REACTIVE_POWER_QIVL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIVL2() <em>Reactive Power QIVL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIVL2()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIVL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIVL2() <em>Reactive Power QIVL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIVL2()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIVL2 = REACTIVE_POWER_QIVL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIVL3() <em>Reactive Power QIVL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIVL3()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QIVL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIVL3() <em>Reactive Power QIVL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIVL3()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIVL3 = REACTIVE_POWER_QIVL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactivePowerQIVall() <em>Reactive Power QI Vall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIVall()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_POWER_QI_VALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactivePowerQIVall() <em>Reactive Power QI Vall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePowerQIVall()
	 * @generated
	 * @ordered
	 */
	protected double reactivePowerQIVall = REACTIVE_POWER_QI_VALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparentPowerpL1() <em>Apparent Powerp L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerpL1()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_POWERP_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparentPowerpL1() <em>Apparent Powerp L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerpL1()
	 * @generated
	 * @ordered
	 */
	protected double apparentPowerpL1 = APPARENT_POWERP_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparentPowerpL2() <em>Apparent Powerp L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerpL2()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_POWERP_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparentPowerpL2() <em>Apparent Powerp L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerpL2()
	 * @generated
	 * @ordered
	 */
	protected double apparentPowerpL2 = APPARENT_POWERP_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparentPowerpL3() <em>Apparent Powerp L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerpL3()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_POWERP_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparentPowerpL3() <em>Apparent Powerp L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerpL3()
	 * @generated
	 * @ordered
	 */
	protected double apparentPowerpL3 = APPARENT_POWERP_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparentPowerpAll() <em>Apparent Powerp All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerpAll()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_POWERP_ALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparentPowerpAll() <em>Apparent Powerp All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerpAll()
	 * @generated
	 * @ordered
	 */
	protected double apparentPowerpAll = APPARENT_POWERP_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparentPowermL1() <em>Apparent Powerm L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowermL1()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_POWERM_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparentPowermL1() <em>Apparent Powerm L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowermL1()
	 * @generated
	 * @ordered
	 */
	protected double apparentPowermL1 = APPARENT_POWERM_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparentPowermL2() <em>Apparent Powerm L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowermL2()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_POWERM_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparentPowermL2() <em>Apparent Powerm L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowermL2()
	 * @generated
	 * @ordered
	 */
	protected double apparentPowermL2 = APPARENT_POWERM_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparentPowermL3() <em>Apparent Powerm L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowermL3()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_POWERM_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparentPowermL3() <em>Apparent Powerm L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowermL3()
	 * @generated
	 * @ordered
	 */
	protected double apparentPowermL3 = APPARENT_POWERM_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparentPowermAll() <em>Apparent Powerm All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowermAll()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_POWERM_ALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparentPowermAll() <em>Apparent Powerm All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowermAll()
	 * @generated
	 * @ordered
	 */
	protected double apparentPowermAll = APPARENT_POWERM_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentL1() <em>Current L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentL1()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentL1() <em>Current L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentL1()
	 * @generated
	 * @ordered
	 */
	protected double currentL1 = CURRENT_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentL2() <em>Current L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentL2()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentL2() <em>Current L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentL2()
	 * @generated
	 * @ordered
	 */
	protected double currentL2 = CURRENT_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentL3() <em>Current L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentL3()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentL3() <em>Current L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentL3()
	 * @generated
	 * @ordered
	 */
	protected double currentL3 = CURRENT_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentAll() <em>Current All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAll()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_ALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentAll() <em>Current All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAll()
	 * @generated
	 * @ordered
	 */
	protected double currentAll = CURRENT_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageL1() <em>Voltage L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageL1()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageL1() <em>Voltage L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageL1()
	 * @generated
	 * @ordered
	 */
	protected double voltageL1 = VOLTAGE_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageL2() <em>Voltage L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageL2()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageL2() <em>Voltage L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageL2()
	 * @generated
	 * @ordered
	 */
	protected double voltageL2 = VOLTAGE_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageL3() <em>Voltage L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageL3()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageL3() <em>Voltage L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageL3()
	 * @generated
	 * @ordered
	 */
	protected double voltageL3 = VOLTAGE_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageAll() <em>Voltage All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAll()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_ALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageAll() <em>Voltage All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAll()
	 * @generated
	 * @ordered
	 */
	protected double voltageAll = VOLTAGE_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerFactorL1() <em>Power Factor L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorL1()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_FACTOR_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPowerFactorL1() <em>Power Factor L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorL1()
	 * @generated
	 * @ordered
	 */
	protected double powerFactorL1 = POWER_FACTOR_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerFactorL2() <em>Power Factor L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorL2()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_FACTOR_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPowerFactorL2() <em>Power Factor L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorL2()
	 * @generated
	 * @ordered
	 */
	protected double powerFactorL2 = POWER_FACTOR_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerFactorL3() <em>Power Factor L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorL3()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_FACTOR_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPowerFactorL3() <em>Power Factor L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorL3()
	 * @generated
	 * @ordered
	 */
	protected double powerFactorL3 = POWER_FACTOR_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerFactorAll() <em>Power Factor All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorAll()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_FACTOR_ALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPowerFactorAll() <em>Power Factor All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactorAll()
	 * @generated
	 * @ordered
	 */
	protected double powerFactorAll = POWER_FACTOR_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplyFrequencyL1() <em>Supply Frequency L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyFrequencyL1()
	 * @generated
	 * @ordered
	 */
	protected static final double SUPPLY_FREQUENCY_L1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSupplyFrequencyL1() <em>Supply Frequency L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyFrequencyL1()
	 * @generated
	 * @ordered
	 */
	protected double supplyFrequencyL1 = SUPPLY_FREQUENCY_L1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplyFrequencyL2() <em>Supply Frequency L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyFrequencyL2()
	 * @generated
	 * @ordered
	 */
	protected static final double SUPPLY_FREQUENCY_L2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSupplyFrequencyL2() <em>Supply Frequency L2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyFrequencyL2()
	 * @generated
	 * @ordered
	 */
	protected double supplyFrequencyL2 = SUPPLY_FREQUENCY_L2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplyFrequencyL3() <em>Supply Frequency L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyFrequencyL3()
	 * @generated
	 * @ordered
	 */
	protected static final double SUPPLY_FREQUENCY_L3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSupplyFrequencyL3() <em>Supply Frequency L3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyFrequencyL3()
	 * @generated
	 * @ordered
	 */
	protected double supplyFrequencyL3 = SUPPLY_FREQUENCY_L3_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplyFrequencyAll() <em>Supply Frequency All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyFrequencyAll()
	 * @generated
	 * @ordered
	 */
	protected static final double SUPPLY_FREQUENCY_ALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSupplyFrequencyAll() <em>Supply Frequency All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyFrequencyAll()
	 * @generated
	 * @ordered
	 */
	protected double supplyFrequencyAll = SUPPLY_FREQUENCY_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerAbsPL1() <em>Active Power Abs PL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsPL1()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_ABS_PL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerAbsPL1() <em>Active Power Abs PL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsPL1()
	 * @generated
	 * @ordered
	 */
	protected double activePowerAbsPL1 = ACTIVE_POWER_ABS_PL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerAbsPL2() <em>Active Power Abs PL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsPL2()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_ABS_PL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerAbsPL2() <em>Active Power Abs PL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsPL2()
	 * @generated
	 * @ordered
	 */
	protected double activePowerAbsPL2 = ACTIVE_POWER_ABS_PL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerAbsPL3() <em>Active Power Abs PL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsPL3()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_ABS_PL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerAbsPL3() <em>Active Power Abs PL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsPL3()
	 * @generated
	 * @ordered
	 */
	protected double activePowerAbsPL3 = ACTIVE_POWER_ABS_PL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerAbsPAll() <em>Active Power Abs PAll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsPAll()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_ABS_PALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerAbsPAll() <em>Active Power Abs PAll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsPAll()
	 * @generated
	 * @ordered
	 */
	protected double activePowerAbsPAll = ACTIVE_POWER_ABS_PALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerAbsML1() <em>Active Power Abs ML1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsML1()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_ABS_ML1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerAbsML1() <em>Active Power Abs ML1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsML1()
	 * @generated
	 * @ordered
	 */
	protected double activePowerAbsML1 = ACTIVE_POWER_ABS_ML1_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerAbsML2() <em>Active Power Abs ML2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsML2()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_ABS_ML2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerAbsML2() <em>Active Power Abs ML2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsML2()
	 * @generated
	 * @ordered
	 */
	protected double activePowerAbsML2 = ACTIVE_POWER_ABS_ML2_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerAbsML3() <em>Active Power Abs ML3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsML3()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_ABS_ML3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerAbsML3() <em>Active Power Abs ML3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsML3()
	 * @generated
	 * @ordered
	 */
	protected double activePowerAbsML3 = ACTIVE_POWER_ABS_ML3_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerAbsMAll() <em>Active Power Abs MAll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsMAll()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_ABS_MALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerAbsMAll() <em>Active Power Abs MAll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerAbsMAll()
	 * @generated
	 * @ordered
	 */
	protected double activePowerAbsMAll = ACTIVE_POWER_ABS_MALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIL1() <em>Active Power QIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIL1() <em>Active Power QIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIL1()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIL1 = ACTIVE_POWER_QIL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIL2() <em>Active Power QIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIL2() <em>Active Power QIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIL2()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIL2 = ACTIVE_POWER_QIL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIL3() <em>Active Power QIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIL3() <em>Active Power QIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIL3()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIL3 = ACTIVE_POWER_QIL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIall() <em>Active Power QIall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIall()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIall() <em>Active Power QIall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIall()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIall = ACTIVE_POWER_QIALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIIL1() <em>Active Power QIIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIIL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIIL1() <em>Active Power QIIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIL1()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIIL1 = ACTIVE_POWER_QIIL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIIL2() <em>Active Power QIIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIIL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIIL2() <em>Active Power QIIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIL2()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIIL2 = ACTIVE_POWER_QIIL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIIL3() <em>Active Power QIIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIIL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIIL3() <em>Active Power QIIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIL3()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIIL3 = ACTIVE_POWER_QIIL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIIall() <em>Active Power QI Iall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIall()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QI_IALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIIall() <em>Active Power QI Iall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIall()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIIall = ACTIVE_POWER_QI_IALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIIIL1() <em>Active Power QIIIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIIL1()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIIIL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIIIL1() <em>Active Power QIIIL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIIL1()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIIIL1 = ACTIVE_POWER_QIIIL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIIIL2() <em>Active Power QIIIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIIL2()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIIIL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIIIL2() <em>Active Power QIIIL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIIL2()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIIIL2 = ACTIVE_POWER_QIIIL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIIIL3() <em>Active Power QIIIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIIL3()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIIIL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIIIL3() <em>Active Power QIIIL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIIL3()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIIIL3 = ACTIVE_POWER_QIIIL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIIIall() <em>Active Power QII Iall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIIall()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QII_IALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIIIall() <em>Active Power QII Iall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIIIall()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIIIall = ACTIVE_POWER_QII_IALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIVL1() <em>Active Power QIVL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIVL1()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIVL1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIVL1() <em>Active Power QIVL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIVL1()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIVL1 = ACTIVE_POWER_QIVL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIVL2() <em>Active Power QIVL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIVL2()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIVL2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIVL2() <em>Active Power QIVL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIVL2()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIVL2 = ACTIVE_POWER_QIVL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIVL3() <em>Active Power QIVL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIVL3()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QIVL3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIVL3() <em>Active Power QIVL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIVL3()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIVL3 = ACTIVE_POWER_QIVL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivePowerQIVall() <em>Active Power QI Vall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIVall()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_POWER_QI_VALL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActivePowerQIVall() <em>Active Power QI Vall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerQIVall()
	 * @generated
	 * @ordered
	 */
	protected double activePowerQIVall = ACTIVE_POWER_QI_VALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngles() <em>Angles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngles()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngles() <em>Angles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngles()
	 * @generated
	 * @ordered
	 */
	protected double angles = ANGLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPulses() <em>Pulses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulses()
	 * @generated
	 * @ordered
	 */
	protected static final int PULSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPulses() <em>Pulses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulses()
	 * @generated
	 * @ordered
	 */
	protected int pulses = PULSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmpere_squaredHours() <em>Ampere squared Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmpere_squaredHours()
	 * @generated
	 * @ordered
	 */
	protected static final double AMPERE_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmpere_squaredHours() <em>Ampere squared Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmpere_squaredHours()
	 * @generated
	 * @ordered
	 */
	protected double ampere_squaredHours = AMPERE_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolt_squaredHours() <em>Volt squared Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolt_squaredHours()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLT_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolt_squaredHours() <em>Volt squared Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolt_squaredHours()
	 * @generated
	 * @ordered
	 */
	protected double volt_squaredHours = VOLT_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralCurrent() <em>Neutral Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final double NEUTRAL_CURRENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNeutralCurrent() <em>Neutral Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralCurrent()
	 * @generated
	 * @ordered
	 */
	protected double neutralCurrent = NEUTRAL_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeutralVoltage() <em>Neutral Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double NEUTRAL_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNeutralVoltage() <em>Neutral Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralVoltage()
	 * @generated
	 * @ordered
	 */
	protected double neutralVoltage = NEUTRAL_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricityValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getElectricityValues();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerpL1() {
		return activePowerpL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerpL1(double newActivePowerpL1) {
		double oldActivePowerpL1 = activePowerpL1;
		activePowerpL1 = newActivePowerpL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L1, oldActivePowerpL1, activePowerpL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerpall() {
		return activePowerpall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerpall(double newActivePowerpall) {
		double oldActivePowerpall = activePowerpall;
		activePowerpall = newActivePowerpall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERPALL, oldActivePowerpall, activePowerpall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerpL2() {
		return activePowerpL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerpL2(double newActivePowerpL2) {
		double oldActivePowerpL2 = activePowerpL2;
		activePowerpL2 = newActivePowerpL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L2, oldActivePowerpL2, activePowerpL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerpL3() {
		return activePowerpL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerpL3(double newActivePowerpL3) {
		double oldActivePowerpL3 = activePowerpL3;
		activePowerpL3 = newActivePowerpL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L3, oldActivePowerpL3, activePowerpL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowermL2() {
		return activePowermL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowermL2(double newActivePowermL2) {
		double oldActivePowermL2 = activePowermL2;
		activePowermL2 = newActivePowermL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L2, oldActivePowermL2, activePowermL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowermL1() {
		return activePowermL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowermL1(double newActivePowermL1) {
		double oldActivePowermL1 = activePowermL1;
		activePowermL1 = newActivePowermL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L1, oldActivePowermL1, activePowermL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowermL3() {
		return activePowermL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowermL3(double newActivePowermL3) {
		double oldActivePowermL3 = activePowermL3;
		activePowermL3 = newActivePowermL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L3, oldActivePowermL3, activePowermL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowermall() {
		return activePowermall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowermall(double newActivePowermall) {
		double oldActivePowermall = activePowermall;
		activePowermall = newActivePowermall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERMALL, oldActivePowermall, activePowermall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerpL1() {
		return reactivePowerpL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerpL1(double newReactivePowerpL1) {
		double oldReactivePowerpL1 = reactivePowerpL1;
		reactivePowerpL1 = newReactivePowerpL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L1, oldReactivePowerpL1, reactivePowerpL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerpL2() {
		return reactivePowerpL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerpL2(double newReactivePowerpL2) {
		double oldReactivePowerpL2 = reactivePowerpL2;
		reactivePowerpL2 = newReactivePowerpL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L2, oldReactivePowerpL2, reactivePowerpL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerpL3() {
		return reactivePowerpL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerpL3(double newReactivePowerpL3) {
		double oldReactivePowerpL3 = reactivePowerpL3;
		reactivePowerpL3 = newReactivePowerpL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L3, oldReactivePowerpL3, reactivePowerpL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerpall() {
		return reactivePowerpall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerpall(double newReactivePowerpall) {
		double oldReactivePowerpall = reactivePowerpall;
		reactivePowerpall = newReactivePowerpall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERPALL, oldReactivePowerpall, reactivePowerpall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowermL1() {
		return reactivePowermL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowermL1(double newReactivePowermL1) {
		double oldReactivePowermL1 = reactivePowermL1;
		reactivePowermL1 = newReactivePowermL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L1, oldReactivePowermL1, reactivePowermL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowermL2() {
		return reactivePowermL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowermL2(double newReactivePowermL2) {
		double oldReactivePowermL2 = reactivePowermL2;
		reactivePowermL2 = newReactivePowermL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L2, oldReactivePowermL2, reactivePowermL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowermL3() {
		return reactivePowermL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowermL3(double newReactivePowermL3) {
		double oldReactivePowermL3 = reactivePowermL3;
		reactivePowermL3 = newReactivePowermL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L3, oldReactivePowermL3, reactivePowermL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowermall() {
		return reactivePowermall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowermall(double newReactivePowermall) {
		double oldReactivePowermall = reactivePowermall;
		reactivePowermall = newReactivePowermall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERMALL, oldReactivePowermall, reactivePowermall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIL1() {
		return reactivePowerQIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIL1(double newReactivePowerQIL1) {
		double oldReactivePowerQIL1 = reactivePowerQIL1;
		reactivePowerQIL1 = newReactivePowerQIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL1, oldReactivePowerQIL1, reactivePowerQIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIL2() {
		return reactivePowerQIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIL2(double newReactivePowerQIL2) {
		double oldReactivePowerQIL2 = reactivePowerQIL2;
		reactivePowerQIL2 = newReactivePowerQIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL2, oldReactivePowerQIL2, reactivePowerQIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIL3() {
		return reactivePowerQIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIL3(double newReactivePowerQIL3) {
		double oldReactivePowerQIL3 = reactivePowerQIL3;
		reactivePowerQIL3 = newReactivePowerQIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL3, oldReactivePowerQIL3, reactivePowerQIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIall() {
		return reactivePowerQIall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIall(double newReactivePowerQIall) {
		double oldReactivePowerQIall = reactivePowerQIall;
		reactivePowerQIall = newReactivePowerQIall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIALL, oldReactivePowerQIall, reactivePowerQIall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIIL1() {
		return reactivePowerQIIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIIL1(double newReactivePowerQIIL1) {
		double oldReactivePowerQIIL1 = reactivePowerQIIL1;
		reactivePowerQIIL1 = newReactivePowerQIIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL1, oldReactivePowerQIIL1, reactivePowerQIIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIIL2() {
		return reactivePowerQIIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIIL2(double newReactivePowerQIIL2) {
		double oldReactivePowerQIIL2 = reactivePowerQIIL2;
		reactivePowerQIIL2 = newReactivePowerQIIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL2, oldReactivePowerQIIL2, reactivePowerQIIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIIL3() {
		return reactivePowerQIIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIIL3(double newReactivePowerQIIL3) {
		double oldReactivePowerQIIL3 = reactivePowerQIIL3;
		reactivePowerQIIL3 = newReactivePowerQIIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL3, oldReactivePowerQIIL3, reactivePowerQIIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIIall() {
		return reactivePowerQIIall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIIall(double newReactivePowerQIIall) {
		double oldReactivePowerQIIall = reactivePowerQIIall;
		reactivePowerQIIall = newReactivePowerQIIall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_IALL, oldReactivePowerQIIall, reactivePowerQIIall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIIIL1() {
		return reactivePowerQIIIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIIIL1(double newReactivePowerQIIIL1) {
		double oldReactivePowerQIIIL1 = reactivePowerQIIIL1;
		reactivePowerQIIIL1 = newReactivePowerQIIIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL1, oldReactivePowerQIIIL1, reactivePowerQIIIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIIIL2() {
		return reactivePowerQIIIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIIIL2(double newReactivePowerQIIIL2) {
		double oldReactivePowerQIIIL2 = reactivePowerQIIIL2;
		reactivePowerQIIIL2 = newReactivePowerQIIIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL2, oldReactivePowerQIIIL2, reactivePowerQIIIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIIIL3() {
		return reactivePowerQIIIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIIIL3(double newReactivePowerQIIIL3) {
		double oldReactivePowerQIIIL3 = reactivePowerQIIIL3;
		reactivePowerQIIIL3 = newReactivePowerQIIIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL3, oldReactivePowerQIIIL3, reactivePowerQIIIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIIIall() {
		return reactivePowerQIIIall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIIIall(double newReactivePowerQIIIall) {
		double oldReactivePowerQIIIall = reactivePowerQIIIall;
		reactivePowerQIIIall = newReactivePowerQIIIall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QII_IALL, oldReactivePowerQIIIall, reactivePowerQIIIall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIVL1() {
		return reactivePowerQIVL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIVL1(double newReactivePowerQIVL1) {
		double oldReactivePowerQIVL1 = reactivePowerQIVL1;
		reactivePowerQIVL1 = newReactivePowerQIVL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL1, oldReactivePowerQIVL1, reactivePowerQIVL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIVL2() {
		return reactivePowerQIVL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIVL2(double newReactivePowerQIVL2) {
		double oldReactivePowerQIVL2 = reactivePowerQIVL2;
		reactivePowerQIVL2 = newReactivePowerQIVL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL2, oldReactivePowerQIVL2, reactivePowerQIVL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIVL3() {
		return reactivePowerQIVL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIVL3(double newReactivePowerQIVL3) {
		double oldReactivePowerQIVL3 = reactivePowerQIVL3;
		reactivePowerQIVL3 = newReactivePowerQIVL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL3, oldReactivePowerQIVL3, reactivePowerQIVL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactivePowerQIVall() {
		return reactivePowerQIVall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactivePowerQIVall(double newReactivePowerQIVall) {
		double oldReactivePowerQIVall = reactivePowerQIVall;
		reactivePowerQIVall = newReactivePowerQIVall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_VALL, oldReactivePowerQIVall, reactivePowerQIVall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparentPowerpL1() {
		return apparentPowerpL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparentPowerpL1(double newApparentPowerpL1) {
		double oldApparentPowerpL1 = apparentPowerpL1;
		apparentPowerpL1 = newApparentPowerpL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L1, oldApparentPowerpL1, apparentPowerpL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparentPowerpL2() {
		return apparentPowerpL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparentPowerpL2(double newApparentPowerpL2) {
		double oldApparentPowerpL2 = apparentPowerpL2;
		apparentPowerpL2 = newApparentPowerpL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L2, oldApparentPowerpL2, apparentPowerpL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparentPowerpL3() {
		return apparentPowerpL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparentPowerpL3(double newApparentPowerpL3) {
		double oldApparentPowerpL3 = apparentPowerpL3;
		apparentPowerpL3 = newApparentPowerpL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L3, oldApparentPowerpL3, apparentPowerpL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparentPowerpAll() {
		return apparentPowerpAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparentPowerpAll(double newApparentPowerpAll) {
		double oldApparentPowerpAll = apparentPowerpAll;
		apparentPowerpAll = newApparentPowerpAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_ALL, oldApparentPowerpAll, apparentPowerpAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparentPowermL1() {
		return apparentPowermL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparentPowermL1(double newApparentPowermL1) {
		double oldApparentPowermL1 = apparentPowermL1;
		apparentPowermL1 = newApparentPowermL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L1, oldApparentPowermL1, apparentPowermL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparentPowermL2() {
		return apparentPowermL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparentPowermL2(double newApparentPowermL2) {
		double oldApparentPowermL2 = apparentPowermL2;
		apparentPowermL2 = newApparentPowermL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L2, oldApparentPowermL2, apparentPowermL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparentPowermL3() {
		return apparentPowermL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparentPowermL3(double newApparentPowermL3) {
		double oldApparentPowermL3 = apparentPowermL3;
		apparentPowermL3 = newApparentPowermL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L3, oldApparentPowermL3, apparentPowermL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparentPowermAll() {
		return apparentPowermAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparentPowermAll(double newApparentPowermAll) {
		double oldApparentPowermAll = apparentPowermAll;
		apparentPowermAll = newApparentPowermAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_ALL, oldApparentPowermAll, apparentPowermAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentL1() {
		return currentL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentL1(double newCurrentL1) {
		double oldCurrentL1 = currentL1;
		currentL1 = newCurrentL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L1, oldCurrentL1, currentL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentL2() {
		return currentL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentL2(double newCurrentL2) {
		double oldCurrentL2 = currentL2;
		currentL2 = newCurrentL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L2, oldCurrentL2, currentL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentL3() {
		return currentL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentL3(double newCurrentL3) {
		double oldCurrentL3 = currentL3;
		currentL3 = newCurrentL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L3, oldCurrentL3, currentL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentAll() {
		return currentAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentAll(double newCurrentAll) {
		double oldCurrentAll = currentAll;
		currentAll = newCurrentAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_ALL, oldCurrentAll, currentAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageL1() {
		return voltageL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageL1(double newVoltageL1) {
		double oldVoltageL1 = voltageL1;
		voltageL1 = newVoltageL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L1, oldVoltageL1, voltageL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageL2() {
		return voltageL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageL2(double newVoltageL2) {
		double oldVoltageL2 = voltageL2;
		voltageL2 = newVoltageL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L2, oldVoltageL2, voltageL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageL3() {
		return voltageL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageL3(double newVoltageL3) {
		double oldVoltageL3 = voltageL3;
		voltageL3 = newVoltageL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L3, oldVoltageL3, voltageL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageAll() {
		return voltageAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageAll(double newVoltageAll) {
		double oldVoltageAll = voltageAll;
		voltageAll = newVoltageAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_ALL, oldVoltageAll, voltageAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPowerFactorL1() {
		return powerFactorL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerFactorL1(double newPowerFactorL1) {
		double oldPowerFactorL1 = powerFactorL1;
		powerFactorL1 = newPowerFactorL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L1, oldPowerFactorL1, powerFactorL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPowerFactorL2() {
		return powerFactorL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerFactorL2(double newPowerFactorL2) {
		double oldPowerFactorL2 = powerFactorL2;
		powerFactorL2 = newPowerFactorL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L2, oldPowerFactorL2, powerFactorL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPowerFactorL3() {
		return powerFactorL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerFactorL3(double newPowerFactorL3) {
		double oldPowerFactorL3 = powerFactorL3;
		powerFactorL3 = newPowerFactorL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L3, oldPowerFactorL3, powerFactorL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPowerFactorAll() {
		return powerFactorAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerFactorAll(double newPowerFactorAll) {
		double oldPowerFactorAll = powerFactorAll;
		powerFactorAll = newPowerFactorAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_ALL, oldPowerFactorAll, powerFactorAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSupplyFrequencyL1() {
		return supplyFrequencyL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyFrequencyL1(double newSupplyFrequencyL1) {
		double oldSupplyFrequencyL1 = supplyFrequencyL1;
		supplyFrequencyL1 = newSupplyFrequencyL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L1, oldSupplyFrequencyL1, supplyFrequencyL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSupplyFrequencyL2() {
		return supplyFrequencyL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyFrequencyL2(double newSupplyFrequencyL2) {
		double oldSupplyFrequencyL2 = supplyFrequencyL2;
		supplyFrequencyL2 = newSupplyFrequencyL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L2, oldSupplyFrequencyL2, supplyFrequencyL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSupplyFrequencyL3() {
		return supplyFrequencyL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyFrequencyL3(double newSupplyFrequencyL3) {
		double oldSupplyFrequencyL3 = supplyFrequencyL3;
		supplyFrequencyL3 = newSupplyFrequencyL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L3, oldSupplyFrequencyL3, supplyFrequencyL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSupplyFrequencyAll() {
		return supplyFrequencyAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyFrequencyAll(double newSupplyFrequencyAll) {
		double oldSupplyFrequencyAll = supplyFrequencyAll;
		supplyFrequencyAll = newSupplyFrequencyAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_ALL, oldSupplyFrequencyAll, supplyFrequencyAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerAbsPL1() {
		return activePowerAbsPL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerAbsPL1(double newActivePowerAbsPL1) {
		double oldActivePowerAbsPL1 = activePowerAbsPL1;
		activePowerAbsPL1 = newActivePowerAbsPL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL1, oldActivePowerAbsPL1, activePowerAbsPL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerAbsPL2() {
		return activePowerAbsPL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerAbsPL2(double newActivePowerAbsPL2) {
		double oldActivePowerAbsPL2 = activePowerAbsPL2;
		activePowerAbsPL2 = newActivePowerAbsPL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL2, oldActivePowerAbsPL2, activePowerAbsPL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerAbsPL3() {
		return activePowerAbsPL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerAbsPL3(double newActivePowerAbsPL3) {
		double oldActivePowerAbsPL3 = activePowerAbsPL3;
		activePowerAbsPL3 = newActivePowerAbsPL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL3, oldActivePowerAbsPL3, activePowerAbsPL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerAbsPAll() {
		return activePowerAbsPAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerAbsPAll(double newActivePowerAbsPAll) {
		double oldActivePowerAbsPAll = activePowerAbsPAll;
		activePowerAbsPAll = newActivePowerAbsPAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PALL, oldActivePowerAbsPAll, activePowerAbsPAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerAbsML1() {
		return activePowerAbsML1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerAbsML1(double newActivePowerAbsML1) {
		double oldActivePowerAbsML1 = activePowerAbsML1;
		activePowerAbsML1 = newActivePowerAbsML1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML1, oldActivePowerAbsML1, activePowerAbsML1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerAbsML2() {
		return activePowerAbsML2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerAbsML2(double newActivePowerAbsML2) {
		double oldActivePowerAbsML2 = activePowerAbsML2;
		activePowerAbsML2 = newActivePowerAbsML2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML2, oldActivePowerAbsML2, activePowerAbsML2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerAbsML3() {
		return activePowerAbsML3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerAbsML3(double newActivePowerAbsML3) {
		double oldActivePowerAbsML3 = activePowerAbsML3;
		activePowerAbsML3 = newActivePowerAbsML3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML3, oldActivePowerAbsML3, activePowerAbsML3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerAbsMAll() {
		return activePowerAbsMAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerAbsMAll(double newActivePowerAbsMAll) {
		double oldActivePowerAbsMAll = activePowerAbsMAll;
		activePowerAbsMAll = newActivePowerAbsMAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_MALL, oldActivePowerAbsMAll, activePowerAbsMAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIL1() {
		return activePowerQIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIL1(double newActivePowerQIL1) {
		double oldActivePowerQIL1 = activePowerQIL1;
		activePowerQIL1 = newActivePowerQIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL1, oldActivePowerQIL1, activePowerQIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIL2() {
		return activePowerQIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIL2(double newActivePowerQIL2) {
		double oldActivePowerQIL2 = activePowerQIL2;
		activePowerQIL2 = newActivePowerQIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL2, oldActivePowerQIL2, activePowerQIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIL3() {
		return activePowerQIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIL3(double newActivePowerQIL3) {
		double oldActivePowerQIL3 = activePowerQIL3;
		activePowerQIL3 = newActivePowerQIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL3, oldActivePowerQIL3, activePowerQIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIall() {
		return activePowerQIall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIall(double newActivePowerQIall) {
		double oldActivePowerQIall = activePowerQIall;
		activePowerQIall = newActivePowerQIall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIALL, oldActivePowerQIall, activePowerQIall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIIL1() {
		return activePowerQIIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIIL1(double newActivePowerQIIL1) {
		double oldActivePowerQIIL1 = activePowerQIIL1;
		activePowerQIIL1 = newActivePowerQIIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL1, oldActivePowerQIIL1, activePowerQIIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIIL2() {
		return activePowerQIIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIIL2(double newActivePowerQIIL2) {
		double oldActivePowerQIIL2 = activePowerQIIL2;
		activePowerQIIL2 = newActivePowerQIIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL2, oldActivePowerQIIL2, activePowerQIIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIIL3() {
		return activePowerQIIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIIL3(double newActivePowerQIIL3) {
		double oldActivePowerQIIL3 = activePowerQIIL3;
		activePowerQIIL3 = newActivePowerQIIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL3, oldActivePowerQIIL3, activePowerQIIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIIall() {
		return activePowerQIIall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIIall(double newActivePowerQIIall) {
		double oldActivePowerQIIall = activePowerQIIall;
		activePowerQIIall = newActivePowerQIIall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_IALL, oldActivePowerQIIall, activePowerQIIall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIIIL1() {
		return activePowerQIIIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIIIL1(double newActivePowerQIIIL1) {
		double oldActivePowerQIIIL1 = activePowerQIIIL1;
		activePowerQIIIL1 = newActivePowerQIIIL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL1, oldActivePowerQIIIL1, activePowerQIIIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIIIL2() {
		return activePowerQIIIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIIIL2(double newActivePowerQIIIL2) {
		double oldActivePowerQIIIL2 = activePowerQIIIL2;
		activePowerQIIIL2 = newActivePowerQIIIL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL2, oldActivePowerQIIIL2, activePowerQIIIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIIIL3() {
		return activePowerQIIIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIIIL3(double newActivePowerQIIIL3) {
		double oldActivePowerQIIIL3 = activePowerQIIIL3;
		activePowerQIIIL3 = newActivePowerQIIIL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL3, oldActivePowerQIIIL3, activePowerQIIIL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIIIall() {
		return activePowerQIIIall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIIIall(double newActivePowerQIIIall) {
		double oldActivePowerQIIIall = activePowerQIIIall;
		activePowerQIIIall = newActivePowerQIIIall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QII_IALL, oldActivePowerQIIIall, activePowerQIIIall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIVL1() {
		return activePowerQIVL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIVL1(double newActivePowerQIVL1) {
		double oldActivePowerQIVL1 = activePowerQIVL1;
		activePowerQIVL1 = newActivePowerQIVL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL1, oldActivePowerQIVL1, activePowerQIVL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIVL2() {
		return activePowerQIVL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIVL2(double newActivePowerQIVL2) {
		double oldActivePowerQIVL2 = activePowerQIVL2;
		activePowerQIVL2 = newActivePowerQIVL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL2, oldActivePowerQIVL2, activePowerQIVL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIVL3() {
		return activePowerQIVL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIVL3(double newActivePowerQIVL3) {
		double oldActivePowerQIVL3 = activePowerQIVL3;
		activePowerQIVL3 = newActivePowerQIVL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL3, oldActivePowerQIVL3, activePowerQIVL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActivePowerQIVall() {
		return activePowerQIVall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePowerQIVall(double newActivePowerQIVall) {
		double oldActivePowerQIVall = activePowerQIVall;
		activePowerQIVall = newActivePowerQIVall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_VALL, oldActivePowerQIVall, activePowerQIVall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngles() {
		return angles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngles(double newAngles) {
		double oldAngles = angles;
		angles = newAngles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__ANGLES, oldAngles, angles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPulses() {
		return pulses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPulses(int newPulses) {
		int oldPulses = pulses;
		pulses = newPulses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__PULSES, oldPulses, pulses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmpere_squaredHours() {
		return ampere_squaredHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmpere_squaredHours(double newAmpere_squaredHours) {
		double oldAmpere_squaredHours = ampere_squaredHours;
		ampere_squaredHours = newAmpere_squaredHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__AMPERE_SQUARED_HOURS, oldAmpere_squaredHours, ampere_squaredHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolt_squaredHours() {
		return volt_squaredHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolt_squaredHours(double newVolt_squaredHours) {
		double oldVolt_squaredHours = volt_squaredHours;
		volt_squaredHours = newVolt_squaredHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__VOLT_SQUARED_HOURS, oldVolt_squaredHours, volt_squaredHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNeutralCurrent() {
		return neutralCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralCurrent(double newNeutralCurrent) {
		double oldNeutralCurrent = neutralCurrent;
		neutralCurrent = newNeutralCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_CURRENT, oldNeutralCurrent, neutralCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNeutralVoltage() {
		return neutralVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeutralVoltage(double newNeutralVoltage) {
		double oldNeutralVoltage = neutralVoltage;
		neutralVoltage = newNeutralVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_VOLTAGE, oldNeutralVoltage, neutralVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L1:
				return getActivePowerpL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERPALL:
				return getActivePowerpall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L2:
				return getActivePowerpL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L3:
				return getActivePowerpL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L2:
				return getActivePowermL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L1:
				return getActivePowermL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L3:
				return getActivePowermL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERMALL:
				return getActivePowermall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L1:
				return getReactivePowerpL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L2:
				return getReactivePowerpL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L3:
				return getReactivePowerpL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERPALL:
				return getReactivePowerpall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L1:
				return getReactivePowermL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L2:
				return getReactivePowermL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L3:
				return getReactivePowermL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERMALL:
				return getReactivePowermall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL1:
				return getReactivePowerQIL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL2:
				return getReactivePowerQIL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL3:
				return getReactivePowerQIL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIALL:
				return getReactivePowerQIall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL1:
				return getReactivePowerQIIL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL2:
				return getReactivePowerQIIL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL3:
				return getReactivePowerQIIL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_IALL:
				return getReactivePowerQIIall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL1:
				return getReactivePowerQIIIL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL2:
				return getReactivePowerQIIIL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL3:
				return getReactivePowerQIIIL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QII_IALL:
				return getReactivePowerQIIIall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL1:
				return getReactivePowerQIVL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL2:
				return getReactivePowerQIVL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL3:
				return getReactivePowerQIVL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_VALL:
				return getReactivePowerQIVall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L1:
				return getApparentPowerpL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L2:
				return getApparentPowerpL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L3:
				return getApparentPowerpL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_ALL:
				return getApparentPowerpAll();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L1:
				return getApparentPowermL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L2:
				return getApparentPowermL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L3:
				return getApparentPowermL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_ALL:
				return getApparentPowermAll();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L1:
				return getCurrentL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L2:
				return getCurrentL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L3:
				return getCurrentL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_ALL:
				return getCurrentAll();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L1:
				return getVoltageL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L2:
				return getVoltageL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L3:
				return getVoltageL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_ALL:
				return getVoltageAll();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L1:
				return getPowerFactorL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L2:
				return getPowerFactorL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L3:
				return getPowerFactorL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_ALL:
				return getPowerFactorAll();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L1:
				return getSupplyFrequencyL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L2:
				return getSupplyFrequencyL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L3:
				return getSupplyFrequencyL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_ALL:
				return getSupplyFrequencyAll();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL1:
				return getActivePowerAbsPL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL2:
				return getActivePowerAbsPL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL3:
				return getActivePowerAbsPL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PALL:
				return getActivePowerAbsPAll();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML1:
				return getActivePowerAbsML1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML2:
				return getActivePowerAbsML2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML3:
				return getActivePowerAbsML3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_MALL:
				return getActivePowerAbsMAll();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL1:
				return getActivePowerQIL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL2:
				return getActivePowerQIL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL3:
				return getActivePowerQIL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIALL:
				return getActivePowerQIall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL1:
				return getActivePowerQIIL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL2:
				return getActivePowerQIIL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL3:
				return getActivePowerQIIL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_IALL:
				return getActivePowerQIIall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL1:
				return getActivePowerQIIIL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL2:
				return getActivePowerQIIIL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL3:
				return getActivePowerQIIIL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QII_IALL:
				return getActivePowerQIIIall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL1:
				return getActivePowerQIVL1();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL2:
				return getActivePowerQIVL2();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL3:
				return getActivePowerQIVL3();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_VALL:
				return getActivePowerQIVall();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ANGLES:
				return getAngles();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__PULSES:
				return getPulses();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__AMPERE_SQUARED_HOURS:
				return getAmpere_squaredHours();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLT_SQUARED_HOURS:
				return getVolt_squaredHours();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_CURRENT:
				return getNeutralCurrent();
			case COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_VOLTAGE:
				return getNeutralVoltage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L1:
				setActivePowerpL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERPALL:
				setActivePowerpall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L2:
				setActivePowerpL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L3:
				setActivePowerpL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L2:
				setActivePowermL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L1:
				setActivePowermL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L3:
				setActivePowermL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERMALL:
				setActivePowermall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L1:
				setReactivePowerpL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L2:
				setReactivePowerpL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L3:
				setReactivePowerpL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERPALL:
				setReactivePowerpall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L1:
				setReactivePowermL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L2:
				setReactivePowermL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L3:
				setReactivePowermL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERMALL:
				setReactivePowermall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL1:
				setReactivePowerQIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL2:
				setReactivePowerQIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL3:
				setReactivePowerQIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIALL:
				setReactivePowerQIall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL1:
				setReactivePowerQIIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL2:
				setReactivePowerQIIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL3:
				setReactivePowerQIIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_IALL:
				setReactivePowerQIIall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL1:
				setReactivePowerQIIIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL2:
				setReactivePowerQIIIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL3:
				setReactivePowerQIIIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QII_IALL:
				setReactivePowerQIIIall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL1:
				setReactivePowerQIVL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL2:
				setReactivePowerQIVL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL3:
				setReactivePowerQIVL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_VALL:
				setReactivePowerQIVall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L1:
				setApparentPowerpL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L2:
				setApparentPowerpL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L3:
				setApparentPowerpL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_ALL:
				setApparentPowerpAll((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L1:
				setApparentPowermL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L2:
				setApparentPowermL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L3:
				setApparentPowermL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_ALL:
				setApparentPowermAll((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L1:
				setCurrentL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L2:
				setCurrentL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L3:
				setCurrentL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_ALL:
				setCurrentAll((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L1:
				setVoltageL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L2:
				setVoltageL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L3:
				setVoltageL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_ALL:
				setVoltageAll((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L1:
				setPowerFactorL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L2:
				setPowerFactorL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L3:
				setPowerFactorL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_ALL:
				setPowerFactorAll((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L1:
				setSupplyFrequencyL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L2:
				setSupplyFrequencyL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L3:
				setSupplyFrequencyL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_ALL:
				setSupplyFrequencyAll((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL1:
				setActivePowerAbsPL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL2:
				setActivePowerAbsPL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL3:
				setActivePowerAbsPL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PALL:
				setActivePowerAbsPAll((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML1:
				setActivePowerAbsML1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML2:
				setActivePowerAbsML2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML3:
				setActivePowerAbsML3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_MALL:
				setActivePowerAbsMAll((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL1:
				setActivePowerQIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL2:
				setActivePowerQIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL3:
				setActivePowerQIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIALL:
				setActivePowerQIall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL1:
				setActivePowerQIIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL2:
				setActivePowerQIIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL3:
				setActivePowerQIIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_IALL:
				setActivePowerQIIall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL1:
				setActivePowerQIIIL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL2:
				setActivePowerQIIIL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL3:
				setActivePowerQIIIL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QII_IALL:
				setActivePowerQIIIall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL1:
				setActivePowerQIVL1((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL2:
				setActivePowerQIVL2((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL3:
				setActivePowerQIVL3((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_VALL:
				setActivePowerQIVall((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ANGLES:
				setAngles((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__PULSES:
				setPulses((Integer)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__AMPERE_SQUARED_HOURS:
				setAmpere_squaredHours((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLT_SQUARED_HOURS:
				setVolt_squaredHours((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_CURRENT:
				setNeutralCurrent((Double)newValue);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_VOLTAGE:
				setNeutralVoltage((Double)newValue);
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
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L1:
				setActivePowerpL1(ACTIVE_POWERP_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERPALL:
				setActivePowerpall(ACTIVE_POWERPALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L2:
				setActivePowerpL2(ACTIVE_POWERP_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L3:
				setActivePowerpL3(ACTIVE_POWERP_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L2:
				setActivePowermL2(ACTIVE_POWERM_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L1:
				setActivePowermL1(ACTIVE_POWERM_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L3:
				setActivePowermL3(ACTIVE_POWERM_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERMALL:
				setActivePowermall(ACTIVE_POWERMALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L1:
				setReactivePowerpL1(REACTIVE_POWERP_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L2:
				setReactivePowerpL2(REACTIVE_POWERP_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L3:
				setReactivePowerpL3(REACTIVE_POWERP_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERPALL:
				setReactivePowerpall(REACTIVE_POWERPALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L1:
				setReactivePowermL1(REACTIVE_POWERM_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L2:
				setReactivePowermL2(REACTIVE_POWERM_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L3:
				setReactivePowermL3(REACTIVE_POWERM_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERMALL:
				setReactivePowermall(REACTIVE_POWERMALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL1:
				setReactivePowerQIL1(REACTIVE_POWER_QIL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL2:
				setReactivePowerQIL2(REACTIVE_POWER_QIL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL3:
				setReactivePowerQIL3(REACTIVE_POWER_QIL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIALL:
				setReactivePowerQIall(REACTIVE_POWER_QIALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL1:
				setReactivePowerQIIL1(REACTIVE_POWER_QIIL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL2:
				setReactivePowerQIIL2(REACTIVE_POWER_QIIL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL3:
				setReactivePowerQIIL3(REACTIVE_POWER_QIIL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_IALL:
				setReactivePowerQIIall(REACTIVE_POWER_QI_IALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL1:
				setReactivePowerQIIIL1(REACTIVE_POWER_QIIIL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL2:
				setReactivePowerQIIIL2(REACTIVE_POWER_QIIIL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL3:
				setReactivePowerQIIIL3(REACTIVE_POWER_QIIIL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QII_IALL:
				setReactivePowerQIIIall(REACTIVE_POWER_QII_IALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL1:
				setReactivePowerQIVL1(REACTIVE_POWER_QIVL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL2:
				setReactivePowerQIVL2(REACTIVE_POWER_QIVL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL3:
				setReactivePowerQIVL3(REACTIVE_POWER_QIVL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_VALL:
				setReactivePowerQIVall(REACTIVE_POWER_QI_VALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L1:
				setApparentPowerpL1(APPARENT_POWERP_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L2:
				setApparentPowerpL2(APPARENT_POWERP_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L3:
				setApparentPowerpL3(APPARENT_POWERP_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_ALL:
				setApparentPowerpAll(APPARENT_POWERP_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L1:
				setApparentPowermL1(APPARENT_POWERM_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L2:
				setApparentPowermL2(APPARENT_POWERM_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L3:
				setApparentPowermL3(APPARENT_POWERM_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_ALL:
				setApparentPowermAll(APPARENT_POWERM_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L1:
				setCurrentL1(CURRENT_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L2:
				setCurrentL2(CURRENT_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L3:
				setCurrentL3(CURRENT_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_ALL:
				setCurrentAll(CURRENT_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L1:
				setVoltageL1(VOLTAGE_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L2:
				setVoltageL2(VOLTAGE_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L3:
				setVoltageL3(VOLTAGE_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_ALL:
				setVoltageAll(VOLTAGE_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L1:
				setPowerFactorL1(POWER_FACTOR_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L2:
				setPowerFactorL2(POWER_FACTOR_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L3:
				setPowerFactorL3(POWER_FACTOR_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_ALL:
				setPowerFactorAll(POWER_FACTOR_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L1:
				setSupplyFrequencyL1(SUPPLY_FREQUENCY_L1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L2:
				setSupplyFrequencyL2(SUPPLY_FREQUENCY_L2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L3:
				setSupplyFrequencyL3(SUPPLY_FREQUENCY_L3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_ALL:
				setSupplyFrequencyAll(SUPPLY_FREQUENCY_ALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL1:
				setActivePowerAbsPL1(ACTIVE_POWER_ABS_PL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL2:
				setActivePowerAbsPL2(ACTIVE_POWER_ABS_PL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL3:
				setActivePowerAbsPL3(ACTIVE_POWER_ABS_PL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PALL:
				setActivePowerAbsPAll(ACTIVE_POWER_ABS_PALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML1:
				setActivePowerAbsML1(ACTIVE_POWER_ABS_ML1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML2:
				setActivePowerAbsML2(ACTIVE_POWER_ABS_ML2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML3:
				setActivePowerAbsML3(ACTIVE_POWER_ABS_ML3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_MALL:
				setActivePowerAbsMAll(ACTIVE_POWER_ABS_MALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL1:
				setActivePowerQIL1(ACTIVE_POWER_QIL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL2:
				setActivePowerQIL2(ACTIVE_POWER_QIL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL3:
				setActivePowerQIL3(ACTIVE_POWER_QIL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIALL:
				setActivePowerQIall(ACTIVE_POWER_QIALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL1:
				setActivePowerQIIL1(ACTIVE_POWER_QIIL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL2:
				setActivePowerQIIL2(ACTIVE_POWER_QIIL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL3:
				setActivePowerQIIL3(ACTIVE_POWER_QIIL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_IALL:
				setActivePowerQIIall(ACTIVE_POWER_QI_IALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL1:
				setActivePowerQIIIL1(ACTIVE_POWER_QIIIL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL2:
				setActivePowerQIIIL2(ACTIVE_POWER_QIIIL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL3:
				setActivePowerQIIIL3(ACTIVE_POWER_QIIIL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QII_IALL:
				setActivePowerQIIIall(ACTIVE_POWER_QII_IALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL1:
				setActivePowerQIVL1(ACTIVE_POWER_QIVL1_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL2:
				setActivePowerQIVL2(ACTIVE_POWER_QIVL2_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL3:
				setActivePowerQIVL3(ACTIVE_POWER_QIVL3_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_VALL:
				setActivePowerQIVall(ACTIVE_POWER_QI_VALL_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ANGLES:
				setAngles(ANGLES_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__PULSES:
				setPulses(PULSES_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__AMPERE_SQUARED_HOURS:
				setAmpere_squaredHours(AMPERE_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLT_SQUARED_HOURS:
				setVolt_squaredHours(VOLT_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_CURRENT:
				setNeutralCurrent(NEUTRAL_CURRENT_EDEFAULT);
				return;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_VOLTAGE:
				setNeutralVoltage(NEUTRAL_VOLTAGE_EDEFAULT);
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
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L1:
				return activePowerpL1 != ACTIVE_POWERP_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERPALL:
				return activePowerpall != ACTIVE_POWERPALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L2:
				return activePowerpL2 != ACTIVE_POWERP_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERP_L3:
				return activePowerpL3 != ACTIVE_POWERP_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L2:
				return activePowermL2 != ACTIVE_POWERM_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L1:
				return activePowermL1 != ACTIVE_POWERM_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERM_L3:
				return activePowermL3 != ACTIVE_POWERM_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWERMALL:
				return activePowermall != ACTIVE_POWERMALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L1:
				return reactivePowerpL1 != REACTIVE_POWERP_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L2:
				return reactivePowerpL2 != REACTIVE_POWERP_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERP_L3:
				return reactivePowerpL3 != REACTIVE_POWERP_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERPALL:
				return reactivePowerpall != REACTIVE_POWERPALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L1:
				return reactivePowermL1 != REACTIVE_POWERM_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L2:
				return reactivePowermL2 != REACTIVE_POWERM_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERM_L3:
				return reactivePowermL3 != REACTIVE_POWERM_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWERMALL:
				return reactivePowermall != REACTIVE_POWERMALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL1:
				return reactivePowerQIL1 != REACTIVE_POWER_QIL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL2:
				return reactivePowerQIL2 != REACTIVE_POWER_QIL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIL3:
				return reactivePowerQIL3 != REACTIVE_POWER_QIL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIALL:
				return reactivePowerQIall != REACTIVE_POWER_QIALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL1:
				return reactivePowerQIIL1 != REACTIVE_POWER_QIIL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL2:
				return reactivePowerQIIL2 != REACTIVE_POWER_QIIL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIL3:
				return reactivePowerQIIL3 != REACTIVE_POWER_QIIL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_IALL:
				return reactivePowerQIIall != REACTIVE_POWER_QI_IALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL1:
				return reactivePowerQIIIL1 != REACTIVE_POWER_QIIIL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL2:
				return reactivePowerQIIIL2 != REACTIVE_POWER_QIIIL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIIIL3:
				return reactivePowerQIIIL3 != REACTIVE_POWER_QIIIL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QII_IALL:
				return reactivePowerQIIIall != REACTIVE_POWER_QII_IALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL1:
				return reactivePowerQIVL1 != REACTIVE_POWER_QIVL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL2:
				return reactivePowerQIVL2 != REACTIVE_POWER_QIVL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QIVL3:
				return reactivePowerQIVL3 != REACTIVE_POWER_QIVL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__REACTIVE_POWER_QI_VALL:
				return reactivePowerQIVall != REACTIVE_POWER_QI_VALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L1:
				return apparentPowerpL1 != APPARENT_POWERP_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L2:
				return apparentPowerpL2 != APPARENT_POWERP_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_L3:
				return apparentPowerpL3 != APPARENT_POWERP_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERP_ALL:
				return apparentPowerpAll != APPARENT_POWERP_ALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L1:
				return apparentPowermL1 != APPARENT_POWERM_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L2:
				return apparentPowermL2 != APPARENT_POWERM_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_L3:
				return apparentPowermL3 != APPARENT_POWERM_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__APPARENT_POWERM_ALL:
				return apparentPowermAll != APPARENT_POWERM_ALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L1:
				return currentL1 != CURRENT_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L2:
				return currentL2 != CURRENT_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_L3:
				return currentL3 != CURRENT_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__CURRENT_ALL:
				return currentAll != CURRENT_ALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L1:
				return voltageL1 != VOLTAGE_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L2:
				return voltageL2 != VOLTAGE_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_L3:
				return voltageL3 != VOLTAGE_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLTAGE_ALL:
				return voltageAll != VOLTAGE_ALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L1:
				return powerFactorL1 != POWER_FACTOR_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L2:
				return powerFactorL2 != POWER_FACTOR_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_L3:
				return powerFactorL3 != POWER_FACTOR_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__POWER_FACTOR_ALL:
				return powerFactorAll != POWER_FACTOR_ALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L1:
				return supplyFrequencyL1 != SUPPLY_FREQUENCY_L1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L2:
				return supplyFrequencyL2 != SUPPLY_FREQUENCY_L2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_L3:
				return supplyFrequencyL3 != SUPPLY_FREQUENCY_L3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__SUPPLY_FREQUENCY_ALL:
				return supplyFrequencyAll != SUPPLY_FREQUENCY_ALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL1:
				return activePowerAbsPL1 != ACTIVE_POWER_ABS_PL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL2:
				return activePowerAbsPL2 != ACTIVE_POWER_ABS_PL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PL3:
				return activePowerAbsPL3 != ACTIVE_POWER_ABS_PL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_PALL:
				return activePowerAbsPAll != ACTIVE_POWER_ABS_PALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML1:
				return activePowerAbsML1 != ACTIVE_POWER_ABS_ML1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML2:
				return activePowerAbsML2 != ACTIVE_POWER_ABS_ML2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_ML3:
				return activePowerAbsML3 != ACTIVE_POWER_ABS_ML3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_ABS_MALL:
				return activePowerAbsMAll != ACTIVE_POWER_ABS_MALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL1:
				return activePowerQIL1 != ACTIVE_POWER_QIL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL2:
				return activePowerQIL2 != ACTIVE_POWER_QIL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIL3:
				return activePowerQIL3 != ACTIVE_POWER_QIL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIALL:
				return activePowerQIall != ACTIVE_POWER_QIALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL1:
				return activePowerQIIL1 != ACTIVE_POWER_QIIL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL2:
				return activePowerQIIL2 != ACTIVE_POWER_QIIL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIL3:
				return activePowerQIIL3 != ACTIVE_POWER_QIIL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_IALL:
				return activePowerQIIall != ACTIVE_POWER_QI_IALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL1:
				return activePowerQIIIL1 != ACTIVE_POWER_QIIIL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL2:
				return activePowerQIIIL2 != ACTIVE_POWER_QIIIL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIIIL3:
				return activePowerQIIIL3 != ACTIVE_POWER_QIIIL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QII_IALL:
				return activePowerQIIIall != ACTIVE_POWER_QII_IALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL1:
				return activePowerQIVL1 != ACTIVE_POWER_QIVL1_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL2:
				return activePowerQIVL2 != ACTIVE_POWER_QIVL2_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QIVL3:
				return activePowerQIVL3 != ACTIVE_POWER_QIVL3_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ACTIVE_POWER_QI_VALL:
				return activePowerQIVall != ACTIVE_POWER_QI_VALL_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__ANGLES:
				return angles != ANGLES_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__PULSES:
				return pulses != PULSES_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__AMPERE_SQUARED_HOURS:
				return ampere_squaredHours != AMPERE_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__VOLT_SQUARED_HOURS:
				return volt_squaredHours != VOLT_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_CURRENT:
				return neutralCurrent != NEUTRAL_CURRENT_EDEFAULT;
			case COSEMObjectsPackage.ELECTRICITY_VALUES__NEUTRAL_VOLTAGE:
				return neutralVoltage != NEUTRAL_VOLTAGE_EDEFAULT;
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
		result.append(" (ActivePowerpL1: ");
		result.append(activePowerpL1);
		result.append(", ActivePowerpall: ");
		result.append(activePowerpall);
		result.append(", ActivePowerpL2: ");
		result.append(activePowerpL2);
		result.append(", ActivePowerpL3: ");
		result.append(activePowerpL3);
		result.append(", ActivePowermL2: ");
		result.append(activePowermL2);
		result.append(", ActivePowermL1: ");
		result.append(activePowermL1);
		result.append(", ActivePowermL3: ");
		result.append(activePowermL3);
		result.append(", ActivePowermall: ");
		result.append(activePowermall);
		result.append(", ReactivePowerpL1: ");
		result.append(reactivePowerpL1);
		result.append(", ReactivePowerpL2: ");
		result.append(reactivePowerpL2);
		result.append(", ReactivePowerpL3: ");
		result.append(reactivePowerpL3);
		result.append(", ReactivePowerpall: ");
		result.append(reactivePowerpall);
		result.append(", ReactivePowermL1: ");
		result.append(reactivePowermL1);
		result.append(", ReactivePowermL2: ");
		result.append(reactivePowermL2);
		result.append(", ReactivePowermL3: ");
		result.append(reactivePowermL3);
		result.append(", ReactivePowermall: ");
		result.append(reactivePowermall);
		result.append(", ReactivePowerQIL1: ");
		result.append(reactivePowerQIL1);
		result.append(", ReactivePowerQIL2: ");
		result.append(reactivePowerQIL2);
		result.append(", ReactivePowerQIL3: ");
		result.append(reactivePowerQIL3);
		result.append(", ReactivePowerQIall: ");
		result.append(reactivePowerQIall);
		result.append(", ReactivePowerQIIL1: ");
		result.append(reactivePowerQIIL1);
		result.append(", ReactivePowerQIIL2: ");
		result.append(reactivePowerQIIL2);
		result.append(", ReactivePowerQIIL3: ");
		result.append(reactivePowerQIIL3);
		result.append(", ReactivePowerQIIall: ");
		result.append(reactivePowerQIIall);
		result.append(", ReactivePowerQIIIL1: ");
		result.append(reactivePowerQIIIL1);
		result.append(", ReactivePowerQIIIL2: ");
		result.append(reactivePowerQIIIL2);
		result.append(", ReactivePowerQIIIL3: ");
		result.append(reactivePowerQIIIL3);
		result.append(", ReactivePowerQIIIall: ");
		result.append(reactivePowerQIIIall);
		result.append(", ReactivePowerQIVL1: ");
		result.append(reactivePowerQIVL1);
		result.append(", ReactivePowerQIVL2: ");
		result.append(reactivePowerQIVL2);
		result.append(", ReactivePowerQIVL3: ");
		result.append(reactivePowerQIVL3);
		result.append(", ReactivePowerQIVall: ");
		result.append(reactivePowerQIVall);
		result.append(", ApparentPowerpL1: ");
		result.append(apparentPowerpL1);
		result.append(", ApparentPowerpL2: ");
		result.append(apparentPowerpL2);
		result.append(", ApparentPowerpL3: ");
		result.append(apparentPowerpL3);
		result.append(", ApparentPowerpAll: ");
		result.append(apparentPowerpAll);
		result.append(", ApparentPowermL1: ");
		result.append(apparentPowermL1);
		result.append(", ApparentPowermL2: ");
		result.append(apparentPowermL2);
		result.append(", ApparentPowermL3: ");
		result.append(apparentPowermL3);
		result.append(", ApparentPowermAll: ");
		result.append(apparentPowermAll);
		result.append(", CurrentL1: ");
		result.append(currentL1);
		result.append(", CurrentL2: ");
		result.append(currentL2);
		result.append(", CurrentL3: ");
		result.append(currentL3);
		result.append(", CurrentAll: ");
		result.append(currentAll);
		result.append(", VoltageL1: ");
		result.append(voltageL1);
		result.append(", VoltageL2: ");
		result.append(voltageL2);
		result.append(", VoltageL3: ");
		result.append(voltageL3);
		result.append(", VoltageAll: ");
		result.append(voltageAll);
		result.append(", PowerFactorL1: ");
		result.append(powerFactorL1);
		result.append(", PowerFactorL2: ");
		result.append(powerFactorL2);
		result.append(", PowerFactorL3: ");
		result.append(powerFactorL3);
		result.append(", PowerFactorAll: ");
		result.append(powerFactorAll);
		result.append(", SupplyFrequencyL1: ");
		result.append(supplyFrequencyL1);
		result.append(", SupplyFrequencyL2: ");
		result.append(supplyFrequencyL2);
		result.append(", SupplyFrequencyL3: ");
		result.append(supplyFrequencyL3);
		result.append(", SupplyFrequencyAll: ");
		result.append(supplyFrequencyAll);
		result.append(", ActivePowerAbsPL1: ");
		result.append(activePowerAbsPL1);
		result.append(", ActivePowerAbsPL2: ");
		result.append(activePowerAbsPL2);
		result.append(", ActivePowerAbsPL3: ");
		result.append(activePowerAbsPL3);
		result.append(", ActivePowerAbsPAll: ");
		result.append(activePowerAbsPAll);
		result.append(", ActivePowerAbsML1: ");
		result.append(activePowerAbsML1);
		result.append(", ActivePowerAbsML2: ");
		result.append(activePowerAbsML2);
		result.append(", ActivePowerAbsML3: ");
		result.append(activePowerAbsML3);
		result.append(", ActivePowerAbsMAll: ");
		result.append(activePowerAbsMAll);
		result.append(", ActivePowerQIL1: ");
		result.append(activePowerQIL1);
		result.append(", ActivePowerQIL2: ");
		result.append(activePowerQIL2);
		result.append(", ActivePowerQIL3: ");
		result.append(activePowerQIL3);
		result.append(", ActivePowerQIall: ");
		result.append(activePowerQIall);
		result.append(", ActivePowerQIIL1: ");
		result.append(activePowerQIIL1);
		result.append(", ActivePowerQIIL2: ");
		result.append(activePowerQIIL2);
		result.append(", ActivePowerQIIL3: ");
		result.append(activePowerQIIL3);
		result.append(", ActivePowerQIIall: ");
		result.append(activePowerQIIall);
		result.append(", ActivePowerQIIIL1: ");
		result.append(activePowerQIIIL1);
		result.append(", ActivePowerQIIIL2: ");
		result.append(activePowerQIIIL2);
		result.append(", ActivePowerQIIIL3: ");
		result.append(activePowerQIIIL3);
		result.append(", ActivePowerQIIIall: ");
		result.append(activePowerQIIIall);
		result.append(", ActivePowerQIVL1: ");
		result.append(activePowerQIVL1);
		result.append(", ActivePowerQIVL2: ");
		result.append(activePowerQIVL2);
		result.append(", ActivePowerQIVL3: ");
		result.append(activePowerQIVL3);
		result.append(", ActivePowerQIVall: ");
		result.append(activePowerQIVall);
		result.append(", Angles: ");
		result.append(angles);
		result.append(", Pulses: ");
		result.append(pulses);
		result.append(", Ampere_squaredHours: ");
		result.append(ampere_squaredHours);
		result.append(", Volt_squaredHours: ");
		result.append(volt_squaredHours);
		result.append(", NeutralCurrent: ");
		result.append(neutralCurrent);
		result.append(", NeutralVoltage: ");
		result.append(neutralVoltage);
		result.append(')');
		return result.toString();
	}

} //ElectricityValuesImpl
