/**
 */
package COSEM.Datatypes.impl;

import COSEM.Datatypes.DatatypesPackage;
import COSEM.Datatypes.Units;
import COSEM.Datatypes.scal_unit_type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>scal unit type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.Datatypes.impl.scal_unit_typeImpl#getScaler <em>Scaler</em>}</li>
 *   <li>{@link COSEM.Datatypes.impl.scal_unit_typeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class scal_unit_typeImpl extends MinimalEObjectImpl.Container implements scal_unit_type {
	/**
	 * The default value of the '{@link #getScaler() <em>Scaler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaler()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScaler() <em>Scaler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaler()
	 * @generated
	 * @ordered
	 */
	protected int scaler = SCALER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Units UNIT_EDEFAULT = Units.YEAR;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Units unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scal_unit_typeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.SCAL_UNIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScaler() {
		return scaler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaler(int newScaler) {
		int oldScaler = scaler;
		scaler = newScaler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.SCAL_UNIT_TYPE__SCALER, oldScaler, scaler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Units newUnit) {
		Units oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.SCAL_UNIT_TYPE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.SCAL_UNIT_TYPE__SCALER:
				return getScaler();
			case DatatypesPackage.SCAL_UNIT_TYPE__UNIT:
				return getUnit();
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
			case DatatypesPackage.SCAL_UNIT_TYPE__SCALER:
				setScaler((Integer)newValue);
				return;
			case DatatypesPackage.SCAL_UNIT_TYPE__UNIT:
				setUnit((Units)newValue);
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
			case DatatypesPackage.SCAL_UNIT_TYPE__SCALER:
				setScaler(SCALER_EDEFAULT);
				return;
			case DatatypesPackage.SCAL_UNIT_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case DatatypesPackage.SCAL_UNIT_TYPE__SCALER:
				return scaler != SCALER_EDEFAULT;
			case DatatypesPackage.SCAL_UNIT_TYPE__UNIT:
				return unit != UNIT_EDEFAULT;
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
		result.append(" (scaler: ");
		result.append(scaler);
		result.append(", Unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //scal_unit_typeImpl
