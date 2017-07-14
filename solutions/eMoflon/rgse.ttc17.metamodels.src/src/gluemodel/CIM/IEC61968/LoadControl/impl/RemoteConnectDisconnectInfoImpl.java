/**
 */
package gluemodel.CIM.IEC61968.LoadControl.impl;

import gluemodel.CIM.IEC61968.LoadControl.LoadControlPackage;
import gluemodel.CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo;

import gluemodel.CIM.impl.ElementImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Connect Disconnect Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#getPowerLimit <em>Power Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#getEnergyLimit <em>Energy Limit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#isIsEnergyLimiting <em>Is Energy Limiting</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#getEnergyUsageWarning <em>Energy Usage Warning</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#isUsePushbutton <em>Use Pushbutton</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#isIsArmDisconnect <em>Is Arm Disconnect</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#isIsArmConnect <em>Is Arm Connect</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.LoadControl.impl.RemoteConnectDisconnectInfoImpl#getArmedTimeout <em>Armed Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteConnectDisconnectInfoImpl extends ElementImpl implements RemoteConnectDisconnectInfo {
	/**
	 * The default value of the '{@link #getPowerLimit() <em>Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPowerLimit() <em>Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected float powerLimit = POWER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerVoltageLimit() <em>Customer Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float CUSTOMER_VOLTAGE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCustomerVoltageLimit() <em>Customer Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected float customerVoltageLimit = CUSTOMER_VOLTAGE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyLimit() <em>Energy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyLimit() <em>Energy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyLimit()
	 * @generated
	 * @ordered
	 */
	protected float energyLimit = ENERGY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEnergyLimiting() <em>Is Energy Limiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnergyLimiting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENERGY_LIMITING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnergyLimiting() <em>Is Energy Limiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnergyLimiting()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnergyLimiting = IS_ENERGY_LIMITING_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyUsageWarning() <em>Energy Usage Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUsageWarning()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_USAGE_WARNING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyUsageWarning() <em>Energy Usage Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUsageWarning()
	 * @generated
	 * @ordered
	 */
	protected float energyUsageWarning = ENERGY_USAGE_WARNING_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsVoltageLimitCheck() <em>Needs Voltage Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsVoltageLimitCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsVoltageLimitCheck() <em>Needs Voltage Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsVoltageLimitCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean needsVoltageLimitCheck = NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyUsageStartDateTime() <em>Energy Usage Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUsageStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENERGY_USAGE_START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnergyUsageStartDateTime() <em>Energy Usage Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUsageStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date energyUsageStartDateTime = ENERGY_USAGE_START_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsePushbutton() <em>Use Pushbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePushbutton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_PUSHBUTTON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsePushbutton() <em>Use Pushbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePushbutton()
	 * @generated
	 * @ordered
	 */
	protected boolean usePushbutton = USE_PUSHBUTTON_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsArmDisconnect() <em>Is Arm Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArmDisconnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ARM_DISCONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsArmDisconnect() <em>Is Arm Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArmDisconnect()
	 * @generated
	 * @ordered
	 */
	protected boolean isArmDisconnect = IS_ARM_DISCONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsArmConnect() <em>Is Arm Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArmConnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ARM_CONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsArmConnect() <em>Is Arm Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArmConnect()
	 * @generated
	 * @ordered
	 */
	protected boolean isArmConnect = IS_ARM_CONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsPowerLimitCheck() <em>Needs Power Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsPowerLimitCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_POWER_LIMIT_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsPowerLimitCheck() <em>Needs Power Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsPowerLimitCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean needsPowerLimitCheck = NEEDS_POWER_LIMIT_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getArmedTimeout() <em>Armed Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmedTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final float ARMED_TIMEOUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArmedTimeout() <em>Armed Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmedTimeout()
	 * @generated
	 * @ordered
	 */
	protected float armedTimeout = ARMED_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteConnectDisconnectInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadControlPackage.Literals.REMOTE_CONNECT_DISCONNECT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPowerLimit() {
		return powerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerLimit(float newPowerLimit) {
		float oldPowerLimit = powerLimit;
		powerLimit = newPowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT, oldPowerLimit, powerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCustomerVoltageLimit() {
		return customerVoltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerVoltageLimit(float newCustomerVoltageLimit) {
		float oldCustomerVoltageLimit = customerVoltageLimit;
		customerVoltageLimit = newCustomerVoltageLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT, oldCustomerVoltageLimit, customerVoltageLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyLimit() {
		return energyLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyLimit(float newEnergyLimit) {
		float oldEnergyLimit = energyLimit;
		energyLimit = newEnergyLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT, oldEnergyLimit, energyLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnergyLimiting() {
		return isEnergyLimiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnergyLimiting(boolean newIsEnergyLimiting) {
		boolean oldIsEnergyLimiting = isEnergyLimiting;
		isEnergyLimiting = newIsEnergyLimiting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING, oldIsEnergyLimiting, isEnergyLimiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyUsageWarning() {
		return energyUsageWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyUsageWarning(float newEnergyUsageWarning) {
		float oldEnergyUsageWarning = energyUsageWarning;
		energyUsageWarning = newEnergyUsageWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING, oldEnergyUsageWarning, energyUsageWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsVoltageLimitCheck() {
		return needsVoltageLimitCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsVoltageLimitCheck(boolean newNeedsVoltageLimitCheck) {
		boolean oldNeedsVoltageLimitCheck = needsVoltageLimitCheck;
		needsVoltageLimitCheck = newNeedsVoltageLimitCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK, oldNeedsVoltageLimitCheck, needsVoltageLimitCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnergyUsageStartDateTime() {
		return energyUsageStartDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyUsageStartDateTime(Date newEnergyUsageStartDateTime) {
		Date oldEnergyUsageStartDateTime = energyUsageStartDateTime;
		energyUsageStartDateTime = newEnergyUsageStartDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME, oldEnergyUsageStartDateTime, energyUsageStartDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsePushbutton() {
		return usePushbutton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsePushbutton(boolean newUsePushbutton) {
		boolean oldUsePushbutton = usePushbutton;
		usePushbutton = newUsePushbutton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON, oldUsePushbutton, usePushbutton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsArmDisconnect() {
		return isArmDisconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsArmDisconnect(boolean newIsArmDisconnect) {
		boolean oldIsArmDisconnect = isArmDisconnect;
		isArmDisconnect = newIsArmDisconnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT, oldIsArmDisconnect, isArmDisconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsArmConnect() {
		return isArmConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsArmConnect(boolean newIsArmConnect) {
		boolean oldIsArmConnect = isArmConnect;
		isArmConnect = newIsArmConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT, oldIsArmConnect, isArmConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsPowerLimitCheck() {
		return needsPowerLimitCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsPowerLimitCheck(boolean newNeedsPowerLimitCheck) {
		boolean oldNeedsPowerLimitCheck = needsPowerLimitCheck;
		needsPowerLimitCheck = newNeedsPowerLimitCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK, oldNeedsPowerLimitCheck, needsPowerLimitCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getArmedTimeout() {
		return armedTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmedTimeout(float newArmedTimeout) {
		float oldArmedTimeout = armedTimeout;
		armedTimeout = newArmedTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT, oldArmedTimeout, armedTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
				return getPowerLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
				return getCustomerVoltageLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
				return getEnergyLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
				return isIsEnergyLimiting();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
				return getEnergyUsageWarning();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
				return isNeedsVoltageLimitCheck();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
				return getEnergyUsageStartDateTime();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
				return isUsePushbutton();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
				return isIsArmDisconnect();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
				return isIsArmConnect();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
				return isNeedsPowerLimitCheck();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
				return getArmedTimeout();
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
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
				setPowerLimit((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
				setCustomerVoltageLimit((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
				setEnergyLimit((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
				setIsEnergyLimiting((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
				setEnergyUsageWarning((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
				setNeedsVoltageLimitCheck((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
				setEnergyUsageStartDateTime((Date)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
				setUsePushbutton((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
				setIsArmDisconnect((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
				setIsArmConnect((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
				setNeedsPowerLimitCheck((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
				setArmedTimeout((Float)newValue);
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
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
				setPowerLimit(POWER_LIMIT_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
				setCustomerVoltageLimit(CUSTOMER_VOLTAGE_LIMIT_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
				setEnergyLimit(ENERGY_LIMIT_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
				setIsEnergyLimiting(IS_ENERGY_LIMITING_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
				setEnergyUsageWarning(ENERGY_USAGE_WARNING_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
				setNeedsVoltageLimitCheck(NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
				setEnergyUsageStartDateTime(ENERGY_USAGE_START_DATE_TIME_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
				setUsePushbutton(USE_PUSHBUTTON_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
				setIsArmDisconnect(IS_ARM_DISCONNECT_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
				setIsArmConnect(IS_ARM_CONNECT_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
				setNeedsPowerLimitCheck(NEEDS_POWER_LIMIT_CHECK_EDEFAULT);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
				setArmedTimeout(ARMED_TIMEOUT_EDEFAULT);
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
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
				return powerLimit != POWER_LIMIT_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
				return customerVoltageLimit != CUSTOMER_VOLTAGE_LIMIT_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
				return energyLimit != ENERGY_LIMIT_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
				return isEnergyLimiting != IS_ENERGY_LIMITING_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
				return energyUsageWarning != ENERGY_USAGE_WARNING_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
				return needsVoltageLimitCheck != NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
				return ENERGY_USAGE_START_DATE_TIME_EDEFAULT == null ? energyUsageStartDateTime != null : !ENERGY_USAGE_START_DATE_TIME_EDEFAULT.equals(energyUsageStartDateTime);
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
				return usePushbutton != USE_PUSHBUTTON_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
				return isArmDisconnect != IS_ARM_DISCONNECT_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
				return isArmConnect != IS_ARM_CONNECT_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
				return needsPowerLimitCheck != NEEDS_POWER_LIMIT_CHECK_EDEFAULT;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
				return armedTimeout != ARMED_TIMEOUT_EDEFAULT;
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
		result.append(" (powerLimit: ");
		result.append(powerLimit);
		result.append(", customerVoltageLimit: ");
		result.append(customerVoltageLimit);
		result.append(", energyLimit: ");
		result.append(energyLimit);
		result.append(", isEnergyLimiting: ");
		result.append(isEnergyLimiting);
		result.append(", energyUsageWarning: ");
		result.append(energyUsageWarning);
		result.append(", needsVoltageLimitCheck: ");
		result.append(needsVoltageLimitCheck);
		result.append(", energyUsageStartDateTime: ");
		result.append(energyUsageStartDateTime);
		result.append(", usePushbutton: ");
		result.append(usePushbutton);
		result.append(", isArmDisconnect: ");
		result.append(isArmDisconnect);
		result.append(", isArmConnect: ");
		result.append(isArmConnect);
		result.append(", needsPowerLimitCheck: ");
		result.append(needsPowerLimitCheck);
		result.append(", armedTimeout: ");
		result.append(armedTimeout);
		result.append(')');
		return result.toString();
	}

} //RemoteConnectDisconnectInfoImpl
