/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.BasicIntervalSchedule;
import gluemodel.CIM.IEC61970.Core.CorePackage;

import gluemodel.CIM.IEC61970.Domain.UnitMultiplier;
import gluemodel.CIM.IEC61970.Domain.UnitSymbol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl#getValue2Multiplier <em>Value2 Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl#getValue1Multiplier <em>Value1 Multiplier</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl#getValue2Unit <em>Value2 Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.BasicIntervalScheduleImpl#getValue1Unit <em>Value1 Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicIntervalScheduleImpl extends IdentifiedObjectImpl implements BasicIntervalSchedule {
	/**
	 * The default value of the '{@link #getValue2Multiplier() <em>Value2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier VALUE2_MULTIPLIER_EDEFAULT = UnitMultiplier.SMALL_M;

	/**
	 * The cached value of the '{@link #getValue2Multiplier() <em>Value2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier value2Multiplier = VALUE2_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue1Multiplier() <em>Value1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier VALUE1_MULTIPLIER_EDEFAULT = UnitMultiplier.SMALL_M;

	/**
	 * The cached value of the '{@link #getValue1Multiplier() <em>Value1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier value1Multiplier = VALUE1_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue2Unit() <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol VALUE2_UNIT_EDEFAULT = UnitSymbol.A;

	/**
	 * The cached value of the '{@link #getValue2Unit() <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol value2Unit = VALUE2_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue1Unit() <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol VALUE1_UNIT_EDEFAULT = UnitSymbol.A;

	/**
	 * The cached value of the '{@link #getValue1Unit() <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol value1Unit = VALUE1_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicIntervalScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BASIC_INTERVAL_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplier getValue2Multiplier() {
		return value2Multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue2Multiplier(UnitMultiplier newValue2Multiplier) {
		UnitMultiplier oldValue2Multiplier = value2Multiplier;
		value2Multiplier = newValue2Multiplier == null ? VALUE2_MULTIPLIER_EDEFAULT : newValue2Multiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER, oldValue2Multiplier, value2Multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplier getValue1Multiplier() {
		return value1Multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1Multiplier(UnitMultiplier newValue1Multiplier) {
		UnitMultiplier oldValue1Multiplier = value1Multiplier;
		value1Multiplier = newValue1Multiplier == null ? VALUE1_MULTIPLIER_EDEFAULT : newValue1Multiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER, oldValue1Multiplier, value1Multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getValue2Unit() {
		return value2Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue2Unit(UnitSymbol newValue2Unit) {
		UnitSymbol oldValue2Unit = value2Unit;
		value2Unit = newValue2Unit == null ? VALUE2_UNIT_EDEFAULT : newValue2Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT, oldValue2Unit, value2Unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSymbol getValue1Unit() {
		return value1Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1Unit(UnitSymbol newValue1Unit) {
		UnitSymbol oldValue1Unit = value1Unit;
		value1Unit = newValue1Unit == null ? VALUE1_UNIT_EDEFAULT : newValue1Unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT, oldValue1Unit, value1Unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER:
				return getValue2Multiplier();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER:
				return getValue1Multiplier();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				return getStartTime();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				return getValue2Unit();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				return getValue1Unit();
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
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER:
				setValue2Multiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER:
				setValue1Multiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				setStartTime((String)newValue);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				setValue2Unit((UnitSymbol)newValue);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				setValue1Unit((UnitSymbol)newValue);
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
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER:
				setValue2Multiplier(VALUE2_MULTIPLIER_EDEFAULT);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER:
				setValue1Multiplier(VALUE1_MULTIPLIER_EDEFAULT);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				setValue2Unit(VALUE2_UNIT_EDEFAULT);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				setValue1Unit(VALUE1_UNIT_EDEFAULT);
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
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER:
				return value2Multiplier != VALUE2_MULTIPLIER_EDEFAULT;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER:
				return value1Multiplier != VALUE1_MULTIPLIER_EDEFAULT;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				return value2Unit != VALUE2_UNIT_EDEFAULT;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				return value1Unit != VALUE1_UNIT_EDEFAULT;
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
		result.append(" (value2Multiplier: ");
		result.append(value2Multiplier);
		result.append(", value1Multiplier: ");
		result.append(value1Multiplier);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", value2Unit: ");
		result.append(value2Unit);
		result.append(", value1Unit: ");
		result.append(value1Unit);
		result.append(')');
		return result.toString();
	}

} //BasicIntervalScheduleImpl
