/**
 */
package COSEM.InterfaceClasses.impl;

import COSEM.InterfaceClasses.DemandRegister;
import COSEM.InterfaceClasses.InterfaceClassesPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Demand Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.impl.DemandRegisterImpl#getNumber_of_periods <em>Number of periods</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.impl.DemandRegisterImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.impl.DemandRegisterImpl#getCurrent_average_value <em>Current average value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemandRegisterImpl extends ExtendedRegisterImpl implements DemandRegister {
	/**
	 * The default value of the '{@link #getNumber_of_periods() <em>Number of periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_periods()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_PERIODS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber_of_periods() <em>Number of periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_periods()
	 * @generated
	 * @ordered
	 */
	protected int number_of_periods = NUMBER_OF_PERIODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_average_value() <em>Current average value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_average_value()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_AVERAGE_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrent_average_value() <em>Current average value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_average_value()
	 * @generated
	 * @ordered
	 */
	protected float current_average_value = CURRENT_AVERAGE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemandRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.DEMAND_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber_of_periods() {
		return number_of_periods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_of_periods(int newNumber_of_periods) {
		int oldNumber_of_periods = number_of_periods;
		number_of_periods = newNumber_of_periods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.DEMAND_REGISTER__NUMBER_OF_PERIODS, oldNumber_of_periods, number_of_periods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.DEMAND_REGISTER__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrent_average_value() {
		return current_average_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_average_value(float newCurrent_average_value) {
		float oldCurrent_average_value = current_average_value;
		current_average_value = newCurrent_average_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.DEMAND_REGISTER__CURRENT_AVERAGE_VALUE, oldCurrent_average_value, current_average_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculate_current_average_value() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculate_last_average_value() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceClassesPackage.DEMAND_REGISTER__NUMBER_OF_PERIODS:
				return getNumber_of_periods();
			case InterfaceClassesPackage.DEMAND_REGISTER__PERIOD:
				return getPeriod();
			case InterfaceClassesPackage.DEMAND_REGISTER__CURRENT_AVERAGE_VALUE:
				return getCurrent_average_value();
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
			case InterfaceClassesPackage.DEMAND_REGISTER__NUMBER_OF_PERIODS:
				setNumber_of_periods((Integer)newValue);
				return;
			case InterfaceClassesPackage.DEMAND_REGISTER__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case InterfaceClassesPackage.DEMAND_REGISTER__CURRENT_AVERAGE_VALUE:
				setCurrent_average_value((Float)newValue);
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
			case InterfaceClassesPackage.DEMAND_REGISTER__NUMBER_OF_PERIODS:
				setNumber_of_periods(NUMBER_OF_PERIODS_EDEFAULT);
				return;
			case InterfaceClassesPackage.DEMAND_REGISTER__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case InterfaceClassesPackage.DEMAND_REGISTER__CURRENT_AVERAGE_VALUE:
				setCurrent_average_value(CURRENT_AVERAGE_VALUE_EDEFAULT);
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
			case InterfaceClassesPackage.DEMAND_REGISTER__NUMBER_OF_PERIODS:
				return number_of_periods != NUMBER_OF_PERIODS_EDEFAULT;
			case InterfaceClassesPackage.DEMAND_REGISTER__PERIOD:
				return period != PERIOD_EDEFAULT;
			case InterfaceClassesPackage.DEMAND_REGISTER__CURRENT_AVERAGE_VALUE:
				return current_average_value != CURRENT_AVERAGE_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InterfaceClassesPackage.DEMAND_REGISTER___CALCULATE_CURRENT_AVERAGE_VALUE:
				calculate_current_average_value();
				return null;
			case InterfaceClassesPackage.DEMAND_REGISTER___CALCULATE_LAST_AVERAGE_VALUE:
				calculate_last_average_value();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (number_of_periods: ");
		result.append(number_of_periods);
		result.append(", period: ");
		result.append(period);
		result.append(", current_average_value: ");
		result.append(current_average_value);
		result.append(')');
		return result.toString();
	}

} //DemandRegisterImpl
