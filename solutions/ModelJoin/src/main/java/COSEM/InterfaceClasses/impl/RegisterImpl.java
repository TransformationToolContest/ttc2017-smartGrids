/**
 */
package COSEM.InterfaceClasses.impl;

import COSEM.Datatypes.scal_unit_type;

import COSEM.InterfaceClasses.InterfaceClassesPackage;
import COSEM.InterfaceClasses.Register;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.impl.RegisterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.impl.RegisterImpl#getScaler_unit <em>Scaler unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterImpl extends DataImpl implements Register {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScaler_unit() <em>Scaler unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaler_unit()
	 * @generated
	 * @ordered
	 */
	protected scal_unit_type scaler_unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.REGISTER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scal_unit_type getScaler_unit() {
		if (scaler_unit != null && scaler_unit.eIsProxy()) {
			InternalEObject oldScaler_unit = (InternalEObject)scaler_unit;
			scaler_unit = (scal_unit_type)eResolveProxy(oldScaler_unit);
			if (scaler_unit != oldScaler_unit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfaceClassesPackage.REGISTER__SCALER_UNIT, oldScaler_unit, scaler_unit));
			}
		}
		return scaler_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scal_unit_type basicGetScaler_unit() {
		return scaler_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaler_unit(scal_unit_type newScaler_unit) {
		scal_unit_type oldScaler_unit = scaler_unit;
		scaler_unit = newScaler_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.REGISTER__SCALER_UNIT, oldScaler_unit, scaler_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset() {
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
			case InterfaceClassesPackage.REGISTER__VALUE:
				return getValue();
			case InterfaceClassesPackage.REGISTER__SCALER_UNIT:
				if (resolve) return getScaler_unit();
				return basicGetScaler_unit();
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
			case InterfaceClassesPackage.REGISTER__VALUE:
				setValue((Float)newValue);
				return;
			case InterfaceClassesPackage.REGISTER__SCALER_UNIT:
				setScaler_unit((scal_unit_type)newValue);
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
			case InterfaceClassesPackage.REGISTER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case InterfaceClassesPackage.REGISTER__SCALER_UNIT:
				setScaler_unit((scal_unit_type)null);
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
			case InterfaceClassesPackage.REGISTER__VALUE:
				return value != VALUE_EDEFAULT;
			case InterfaceClassesPackage.REGISTER__SCALER_UNIT:
				return scaler_unit != null;
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
			case InterfaceClassesPackage.REGISTER___RESET:
				reset();
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //RegisterImpl
