/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.Bay;
import gluemodel.CIM.IEC61970.Core.BreakerConfiguration;
import gluemodel.CIM.IEC61970.Core.BusbarConfiguration;
import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.Substation;
import gluemodel.CIM.IEC61970.Core.VoltageLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BayImpl#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BayImpl#getBusBarConfiguration <em>Bus Bar Configuration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BayImpl#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BayImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BayImpl#getBreakerConfiguration <em>Breaker Configuration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BayImpl#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BayImpl extends EquipmentContainerImpl implements Bay {
	/**
	 * The default value of the '{@link #isBayEnergyMeasFlag() <em>Bay Energy Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBayEnergyMeasFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAY_ENERGY_MEAS_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBayEnergyMeasFlag() <em>Bay Energy Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBayEnergyMeasFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean bayEnergyMeasFlag = BAY_ENERGY_MEAS_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusBarConfiguration() <em>Bus Bar Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusBarConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final BusbarConfiguration BUS_BAR_CONFIGURATION_EDEFAULT = BusbarConfiguration.MAIN_WITH_TRANSFER;

	/**
	 * The cached value of the '{@link #getBusBarConfiguration() <em>Bus Bar Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusBarConfiguration()
	 * @generated
	 * @ordered
	 */
	protected BusbarConfiguration busBarConfiguration = BUS_BAR_CONFIGURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isBayPowerMeasFlag() <em>Bay Power Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBayPowerMeasFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAY_POWER_MEAS_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBayPowerMeasFlag() <em>Bay Power Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBayPowerMeasFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean bayPowerMeasFlag = BAY_POWER_MEAS_FLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevel()
	 * @generated
	 * @ordered
	 */
	protected VoltageLevel voltageLevel;

	/**
	 * The default value of the '{@link #getBreakerConfiguration() <em>Breaker Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakerConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final BreakerConfiguration BREAKER_CONFIGURATION_EDEFAULT = BreakerConfiguration.BREAKER_AND_AHALF;

	/**
	 * The cached value of the '{@link #getBreakerConfiguration() <em>Breaker Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakerConfiguration()
	 * @generated
	 * @ordered
	 */
	protected BreakerConfiguration breakerConfiguration = BREAKER_CONFIGURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected Substation substation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBayEnergyMeasFlag() {
		return bayEnergyMeasFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBayEnergyMeasFlag(boolean newBayEnergyMeasFlag) {
		boolean oldBayEnergyMeasFlag = bayEnergyMeasFlag;
		bayEnergyMeasFlag = newBayEnergyMeasFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAY__BAY_ENERGY_MEAS_FLAG, oldBayEnergyMeasFlag, bayEnergyMeasFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusbarConfiguration getBusBarConfiguration() {
		return busBarConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusBarConfiguration(BusbarConfiguration newBusBarConfiguration) {
		BusbarConfiguration oldBusBarConfiguration = busBarConfiguration;
		busBarConfiguration = newBusBarConfiguration == null ? BUS_BAR_CONFIGURATION_EDEFAULT : newBusBarConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAY__BUS_BAR_CONFIGURATION, oldBusBarConfiguration, busBarConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBayPowerMeasFlag() {
		return bayPowerMeasFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBayPowerMeasFlag(boolean newBayPowerMeasFlag) {
		boolean oldBayPowerMeasFlag = bayPowerMeasFlag;
		bayPowerMeasFlag = newBayPowerMeasFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAY__BAY_POWER_MEAS_FLAG, oldBayPowerMeasFlag, bayPowerMeasFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel getVoltageLevel() {
		if (voltageLevel != null && voltageLevel.eIsProxy()) {
			InternalEObject oldVoltageLevel = (InternalEObject)voltageLevel;
			voltageLevel = (VoltageLevel)eResolveProxy(oldVoltageLevel);
			if (voltageLevel != oldVoltageLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.BAY__VOLTAGE_LEVEL, oldVoltageLevel, voltageLevel));
			}
		}
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel basicGetVoltageLevel() {
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltageLevel(VoltageLevel newVoltageLevel, NotificationChain msgs) {
		VoltageLevel oldVoltageLevel = voltageLevel;
		voltageLevel = newVoltageLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BAY__VOLTAGE_LEVEL, oldVoltageLevel, newVoltageLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageLevel(VoltageLevel newVoltageLevel) {
		if (newVoltageLevel != voltageLevel) {
			NotificationChain msgs = null;
			if (voltageLevel != null)
				msgs = ((InternalEObject)voltageLevel).eInverseRemove(this, CorePackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs);
			if (newVoltageLevel != null)
				msgs = ((InternalEObject)newVoltageLevel).eInverseAdd(this, CorePackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs);
			msgs = basicSetVoltageLevel(newVoltageLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAY__VOLTAGE_LEVEL, newVoltageLevel, newVoltageLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakerConfiguration getBreakerConfiguration() {
		return breakerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakerConfiguration(BreakerConfiguration newBreakerConfiguration) {
		BreakerConfiguration oldBreakerConfiguration = breakerConfiguration;
		breakerConfiguration = newBreakerConfiguration == null ? BREAKER_CONFIGURATION_EDEFAULT : newBreakerConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAY__BREAKER_CONFIGURATION, oldBreakerConfiguration, breakerConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation getSubstation() {
		if (substation != null && substation.eIsProxy()) {
			InternalEObject oldSubstation = (InternalEObject)substation;
			substation = (Substation)eResolveProxy(oldSubstation);
			if (substation != oldSubstation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.BAY__SUBSTATION, oldSubstation, substation));
			}
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation basicGetSubstation() {
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstation(Substation newSubstation, NotificationChain msgs) {
		Substation oldSubstation = substation;
		substation = newSubstation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.BAY__SUBSTATION, oldSubstation, newSubstation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstation(Substation newSubstation) {
		if (newSubstation != substation) {
			NotificationChain msgs = null;
			if (substation != null)
				msgs = ((InternalEObject)substation).eInverseRemove(this, CorePackage.SUBSTATION__BAYS, Substation.class, msgs);
			if (newSubstation != null)
				msgs = ((InternalEObject)newSubstation).eInverseAdd(this, CorePackage.SUBSTATION__BAYS, Substation.class, msgs);
			msgs = basicSetSubstation(newSubstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BAY__SUBSTATION, newSubstation, newSubstation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.BAY__VOLTAGE_LEVEL:
				if (voltageLevel != null)
					msgs = ((InternalEObject)voltageLevel).eInverseRemove(this, CorePackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs);
				return basicSetVoltageLevel((VoltageLevel)otherEnd, msgs);
			case CorePackage.BAY__SUBSTATION:
				if (substation != null)
					msgs = ((InternalEObject)substation).eInverseRemove(this, CorePackage.SUBSTATION__BAYS, Substation.class, msgs);
				return basicSetSubstation((Substation)otherEnd, msgs);
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
			case CorePackage.BAY__VOLTAGE_LEVEL:
				return basicSetVoltageLevel(null, msgs);
			case CorePackage.BAY__SUBSTATION:
				return basicSetSubstation(null, msgs);
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
			case CorePackage.BAY__BAY_ENERGY_MEAS_FLAG:
				return isBayEnergyMeasFlag();
			case CorePackage.BAY__BUS_BAR_CONFIGURATION:
				return getBusBarConfiguration();
			case CorePackage.BAY__BAY_POWER_MEAS_FLAG:
				return isBayPowerMeasFlag();
			case CorePackage.BAY__VOLTAGE_LEVEL:
				if (resolve) return getVoltageLevel();
				return basicGetVoltageLevel();
			case CorePackage.BAY__BREAKER_CONFIGURATION:
				return getBreakerConfiguration();
			case CorePackage.BAY__SUBSTATION:
				if (resolve) return getSubstation();
				return basicGetSubstation();
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
			case CorePackage.BAY__BAY_ENERGY_MEAS_FLAG:
				setBayEnergyMeasFlag((Boolean)newValue);
				return;
			case CorePackage.BAY__BUS_BAR_CONFIGURATION:
				setBusBarConfiguration((BusbarConfiguration)newValue);
				return;
			case CorePackage.BAY__BAY_POWER_MEAS_FLAG:
				setBayPowerMeasFlag((Boolean)newValue);
				return;
			case CorePackage.BAY__VOLTAGE_LEVEL:
				setVoltageLevel((VoltageLevel)newValue);
				return;
			case CorePackage.BAY__BREAKER_CONFIGURATION:
				setBreakerConfiguration((BreakerConfiguration)newValue);
				return;
			case CorePackage.BAY__SUBSTATION:
				setSubstation((Substation)newValue);
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
			case CorePackage.BAY__BAY_ENERGY_MEAS_FLAG:
				setBayEnergyMeasFlag(BAY_ENERGY_MEAS_FLAG_EDEFAULT);
				return;
			case CorePackage.BAY__BUS_BAR_CONFIGURATION:
				setBusBarConfiguration(BUS_BAR_CONFIGURATION_EDEFAULT);
				return;
			case CorePackage.BAY__BAY_POWER_MEAS_FLAG:
				setBayPowerMeasFlag(BAY_POWER_MEAS_FLAG_EDEFAULT);
				return;
			case CorePackage.BAY__VOLTAGE_LEVEL:
				setVoltageLevel((VoltageLevel)null);
				return;
			case CorePackage.BAY__BREAKER_CONFIGURATION:
				setBreakerConfiguration(BREAKER_CONFIGURATION_EDEFAULT);
				return;
			case CorePackage.BAY__SUBSTATION:
				setSubstation((Substation)null);
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
			case CorePackage.BAY__BAY_ENERGY_MEAS_FLAG:
				return bayEnergyMeasFlag != BAY_ENERGY_MEAS_FLAG_EDEFAULT;
			case CorePackage.BAY__BUS_BAR_CONFIGURATION:
				return busBarConfiguration != BUS_BAR_CONFIGURATION_EDEFAULT;
			case CorePackage.BAY__BAY_POWER_MEAS_FLAG:
				return bayPowerMeasFlag != BAY_POWER_MEAS_FLAG_EDEFAULT;
			case CorePackage.BAY__VOLTAGE_LEVEL:
				return voltageLevel != null;
			case CorePackage.BAY__BREAKER_CONFIGURATION:
				return breakerConfiguration != BREAKER_CONFIGURATION_EDEFAULT;
			case CorePackage.BAY__SUBSTATION:
				return substation != null;
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
		result.append(" (bayEnergyMeasFlag: ");
		result.append(bayEnergyMeasFlag);
		result.append(", busBarConfiguration: ");
		result.append(busBarConfiguration);
		result.append(", bayPowerMeasFlag: ");
		result.append(bayPowerMeasFlag);
		result.append(", breakerConfiguration: ");
		result.append(breakerConfiguration);
		result.append(')');
		return result.toString();
	}

} //BayImpl
