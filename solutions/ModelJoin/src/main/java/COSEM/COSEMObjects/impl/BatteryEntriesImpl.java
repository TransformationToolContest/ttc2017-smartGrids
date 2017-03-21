/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.BatteryEntries;
import COSEM.COSEMObjects.COSEMObjectsPackage;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getBattery_use_time_counter <em>Battery use time counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getBattery_charge_display <em>Battery charge display</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getDate_of_next_battery_change <em>Date of next battery change</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getBattery_voltage <em>Battery voltage</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getBattery_initial_capacity <em>Battery initial capacity</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getBattery_installation_date_and_time <em>Battery installation date and time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getBattery_estimated_remaining_use_time <em>Battery estimated remaining use time</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getAux_supply_use_time_counter <em>Aux supply use time counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BatteryEntriesImpl#getAux_voltage <em>Aux voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryEntriesImpl extends DataImpl implements BatteryEntries {
	/**
	 * The default value of the '{@link #getBattery_use_time_counter() <em>Battery use time counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_use_time_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int BATTERY_USE_TIME_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBattery_use_time_counter() <em>Battery use time counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_use_time_counter()
	 * @generated
	 * @ordered
	 */
	protected int battery_use_time_counter = BATTERY_USE_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattery_charge_display() <em>Battery charge display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_charge_display()
	 * @generated
	 * @ordered
	 */
	protected static final String BATTERY_CHARGE_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBattery_charge_display() <em>Battery charge display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_charge_display()
	 * @generated
	 * @ordered
	 */
	protected String battery_charge_display = BATTERY_CHARGE_DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_of_next_battery_change() <em>Date of next battery change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_next_battery_change()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_NEXT_BATTERY_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_of_next_battery_change() <em>Date of next battery change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_next_battery_change()
	 * @generated
	 * @ordered
	 */
	protected String date_of_next_battery_change = DATE_OF_NEXT_BATTERY_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattery_voltage() <em>Battery voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final double BATTERY_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBattery_voltage() <em>Battery voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_voltage()
	 * @generated
	 * @ordered
	 */
	protected double battery_voltage = BATTERY_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattery_initial_capacity() <em>Battery initial capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_initial_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final double BATTERY_INITIAL_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBattery_initial_capacity() <em>Battery initial capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_initial_capacity()
	 * @generated
	 * @ordered
	 */
	protected double battery_initial_capacity = BATTERY_INITIAL_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattery_installation_date_and_time() <em>Battery installation date and time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_installation_date_and_time()
	 * @generated
	 * @ordered
	 */
	protected static final String BATTERY_INSTALLATION_DATE_AND_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBattery_installation_date_and_time() <em>Battery installation date and time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_installation_date_and_time()
	 * @generated
	 * @ordered
	 */
	protected String battery_installation_date_and_time = BATTERY_INSTALLATION_DATE_AND_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattery_estimated_remaining_use_time() <em>Battery estimated remaining use time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_estimated_remaining_use_time()
	 * @generated
	 * @ordered
	 */
	protected static final String BATTERY_ESTIMATED_REMAINING_USE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBattery_estimated_remaining_use_time() <em>Battery estimated remaining use time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery_estimated_remaining_use_time()
	 * @generated
	 * @ordered
	 */
	protected String battery_estimated_remaining_use_time = BATTERY_ESTIMATED_REMAINING_USE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux_supply_use_time_counter() <em>Aux supply use time counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_supply_use_time_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int AUX_SUPPLY_USE_TIME_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAux_supply_use_time_counter() <em>Aux supply use time counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_supply_use_time_counter()
	 * @generated
	 * @ordered
	 */
	protected int aux_supply_use_time_counter = AUX_SUPPLY_USE_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux_voltage() <em>Aux voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final double AUX_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAux_voltage() <em>Aux voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_voltage()
	 * @generated
	 * @ordered
	 */
	protected double aux_voltage = AUX_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryEntriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getBatteryEntries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBattery_use_time_counter() {
		return battery_use_time_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery_use_time_counter(int newBattery_use_time_counter) {
		int oldBattery_use_time_counter = battery_use_time_counter;
		battery_use_time_counter = newBattery_use_time_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_USE_TIME_COUNTER, oldBattery_use_time_counter, battery_use_time_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBattery_charge_display() {
		return battery_charge_display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery_charge_display(String newBattery_charge_display) {
		String oldBattery_charge_display = battery_charge_display;
		battery_charge_display = newBattery_charge_display;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_CHARGE_DISPLAY, oldBattery_charge_display, battery_charge_display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate_of_next_battery_change() {
		return date_of_next_battery_change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_of_next_battery_change(String newDate_of_next_battery_change) {
		String oldDate_of_next_battery_change = date_of_next_battery_change;
		date_of_next_battery_change = newDate_of_next_battery_change;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__DATE_OF_NEXT_BATTERY_CHANGE, oldDate_of_next_battery_change, date_of_next_battery_change));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBattery_voltage() {
		return battery_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery_voltage(double newBattery_voltage) {
		double oldBattery_voltage = battery_voltage;
		battery_voltage = newBattery_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_VOLTAGE, oldBattery_voltage, battery_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBattery_initial_capacity() {
		return battery_initial_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery_initial_capacity(double newBattery_initial_capacity) {
		double oldBattery_initial_capacity = battery_initial_capacity;
		battery_initial_capacity = newBattery_initial_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INITIAL_CAPACITY, oldBattery_initial_capacity, battery_initial_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBattery_installation_date_and_time() {
		return battery_installation_date_and_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery_installation_date_and_time(String newBattery_installation_date_and_time) {
		String oldBattery_installation_date_and_time = battery_installation_date_and_time;
		battery_installation_date_and_time = newBattery_installation_date_and_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INSTALLATION_DATE_AND_TIME, oldBattery_installation_date_and_time, battery_installation_date_and_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBattery_estimated_remaining_use_time() {
		return battery_estimated_remaining_use_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery_estimated_remaining_use_time(String newBattery_estimated_remaining_use_time) {
		String oldBattery_estimated_remaining_use_time = battery_estimated_remaining_use_time;
		battery_estimated_remaining_use_time = newBattery_estimated_remaining_use_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_ESTIMATED_REMAINING_USE_TIME, oldBattery_estimated_remaining_use_time, battery_estimated_remaining_use_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAux_supply_use_time_counter() {
		return aux_supply_use_time_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux_supply_use_time_counter(int newAux_supply_use_time_counter) {
		int oldAux_supply_use_time_counter = aux_supply_use_time_counter;
		aux_supply_use_time_counter = newAux_supply_use_time_counter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__AUX_SUPPLY_USE_TIME_COUNTER, oldAux_supply_use_time_counter, aux_supply_use_time_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAux_voltage() {
		return aux_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux_voltage(double newAux_voltage) {
		double oldAux_voltage = aux_voltage;
		aux_voltage = newAux_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BATTERY_ENTRIES__AUX_VOLTAGE, oldAux_voltage, aux_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_USE_TIME_COUNTER:
				return getBattery_use_time_counter();
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_CHARGE_DISPLAY:
				return getBattery_charge_display();
			case COSEMObjectsPackage.BATTERY_ENTRIES__DATE_OF_NEXT_BATTERY_CHANGE:
				return getDate_of_next_battery_change();
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_VOLTAGE:
				return getBattery_voltage();
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INITIAL_CAPACITY:
				return getBattery_initial_capacity();
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INSTALLATION_DATE_AND_TIME:
				return getBattery_installation_date_and_time();
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_ESTIMATED_REMAINING_USE_TIME:
				return getBattery_estimated_remaining_use_time();
			case COSEMObjectsPackage.BATTERY_ENTRIES__AUX_SUPPLY_USE_TIME_COUNTER:
				return getAux_supply_use_time_counter();
			case COSEMObjectsPackage.BATTERY_ENTRIES__AUX_VOLTAGE:
				return getAux_voltage();
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
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_USE_TIME_COUNTER:
				setBattery_use_time_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_CHARGE_DISPLAY:
				setBattery_charge_display((String)newValue);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__DATE_OF_NEXT_BATTERY_CHANGE:
				setDate_of_next_battery_change((String)newValue);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_VOLTAGE:
				setBattery_voltage((Double)newValue);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INITIAL_CAPACITY:
				setBattery_initial_capacity((Double)newValue);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INSTALLATION_DATE_AND_TIME:
				setBattery_installation_date_and_time((String)newValue);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_ESTIMATED_REMAINING_USE_TIME:
				setBattery_estimated_remaining_use_time((String)newValue);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__AUX_SUPPLY_USE_TIME_COUNTER:
				setAux_supply_use_time_counter((Integer)newValue);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__AUX_VOLTAGE:
				setAux_voltage((Double)newValue);
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
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_USE_TIME_COUNTER:
				setBattery_use_time_counter(BATTERY_USE_TIME_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_CHARGE_DISPLAY:
				setBattery_charge_display(BATTERY_CHARGE_DISPLAY_EDEFAULT);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__DATE_OF_NEXT_BATTERY_CHANGE:
				setDate_of_next_battery_change(DATE_OF_NEXT_BATTERY_CHANGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_VOLTAGE:
				setBattery_voltage(BATTERY_VOLTAGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INITIAL_CAPACITY:
				setBattery_initial_capacity(BATTERY_INITIAL_CAPACITY_EDEFAULT);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INSTALLATION_DATE_AND_TIME:
				setBattery_installation_date_and_time(BATTERY_INSTALLATION_DATE_AND_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_ESTIMATED_REMAINING_USE_TIME:
				setBattery_estimated_remaining_use_time(BATTERY_ESTIMATED_REMAINING_USE_TIME_EDEFAULT);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__AUX_SUPPLY_USE_TIME_COUNTER:
				setAux_supply_use_time_counter(AUX_SUPPLY_USE_TIME_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.BATTERY_ENTRIES__AUX_VOLTAGE:
				setAux_voltage(AUX_VOLTAGE_EDEFAULT);
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
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_USE_TIME_COUNTER:
				return battery_use_time_counter != BATTERY_USE_TIME_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_CHARGE_DISPLAY:
				return BATTERY_CHARGE_DISPLAY_EDEFAULT == null ? battery_charge_display != null : !BATTERY_CHARGE_DISPLAY_EDEFAULT.equals(battery_charge_display);
			case COSEMObjectsPackage.BATTERY_ENTRIES__DATE_OF_NEXT_BATTERY_CHANGE:
				return DATE_OF_NEXT_BATTERY_CHANGE_EDEFAULT == null ? date_of_next_battery_change != null : !DATE_OF_NEXT_BATTERY_CHANGE_EDEFAULT.equals(date_of_next_battery_change);
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_VOLTAGE:
				return battery_voltage != BATTERY_VOLTAGE_EDEFAULT;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INITIAL_CAPACITY:
				return battery_initial_capacity != BATTERY_INITIAL_CAPACITY_EDEFAULT;
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_INSTALLATION_DATE_AND_TIME:
				return BATTERY_INSTALLATION_DATE_AND_TIME_EDEFAULT == null ? battery_installation_date_and_time != null : !BATTERY_INSTALLATION_DATE_AND_TIME_EDEFAULT.equals(battery_installation_date_and_time);
			case COSEMObjectsPackage.BATTERY_ENTRIES__BATTERY_ESTIMATED_REMAINING_USE_TIME:
				return BATTERY_ESTIMATED_REMAINING_USE_TIME_EDEFAULT == null ? battery_estimated_remaining_use_time != null : !BATTERY_ESTIMATED_REMAINING_USE_TIME_EDEFAULT.equals(battery_estimated_remaining_use_time);
			case COSEMObjectsPackage.BATTERY_ENTRIES__AUX_SUPPLY_USE_TIME_COUNTER:
				return aux_supply_use_time_counter != AUX_SUPPLY_USE_TIME_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.BATTERY_ENTRIES__AUX_VOLTAGE:
				return aux_voltage != AUX_VOLTAGE_EDEFAULT;
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
		result.append(" (Battery_use_time_counter: ");
		result.append(battery_use_time_counter);
		result.append(", Battery_charge_display: ");
		result.append(battery_charge_display);
		result.append(", Date_of_next_battery_change: ");
		result.append(date_of_next_battery_change);
		result.append(", Battery_voltage: ");
		result.append(battery_voltage);
		result.append(", Battery_initial_capacity: ");
		result.append(battery_initial_capacity);
		result.append(", Battery_installation_date_and_time: ");
		result.append(battery_installation_date_and_time);
		result.append(", Battery_estimated_remaining_use_time: ");
		result.append(battery_estimated_remaining_use_time);
		result.append(", Aux_supply_use_time_counter: ");
		result.append(aux_supply_use_time_counter);
		result.append(", Aux_voltage: ");
		result.append(aux_voltage);
		result.append(')');
		return result.toString();
	}

} //BatteryEntriesImpl
