/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

import gluemodel.CIM.IEC61970.Domain.Currency;
import gluemodel.CIM.IEC61970.Domain.UnitMultiplier;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accounting Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AccountingUnitImpl#getMonetaryUnit <em>Monetary Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AccountingUnitImpl#getEnergyUnit <em>Energy Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AccountingUnitImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.AccountingUnitImpl#getMultiplier <em>Multiplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountingUnitImpl extends ElementImpl implements AccountingUnit {
	/**
	 * The default value of the '{@link #getMonetaryUnit() <em>Monetary Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Currency MONETARY_UNIT_EDEFAULT = Currency.GBP;

	/**
	 * The cached value of the '{@link #getMonetaryUnit() <em>Monetary Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected Currency monetaryUnit = MONETARY_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyUnit() <em>Energy Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUnit()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_UNIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyUnit() <em>Energy Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUnit()
	 * @generated
	 * @ordered
	 */
	protected float energyUnit = ENERGY_UNIT_EDEFAULT;

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
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier MULTIPLIER_EDEFAULT = UnitMultiplier.SMALL_M;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.ACCOUNTING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency getMonetaryUnit() {
		return monetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonetaryUnit(Currency newMonetaryUnit) {
		Currency oldMonetaryUnit = monetaryUnit;
		monetaryUnit = newMonetaryUnit == null ? MONETARY_UNIT_EDEFAULT : newMonetaryUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT, oldMonetaryUnit, monetaryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyUnit() {
		return energyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyUnit(float newEnergyUnit) {
		float oldEnergyUnit = energyUnit;
		energyUnit = newEnergyUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT, oldEnergyUnit, energyUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplier getMultiplier() {
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplier(UnitMultiplier newMultiplier) {
		UnitMultiplier oldMultiplier = multiplier;
		multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER, oldMultiplier, multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
				return getMonetaryUnit();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
				return getEnergyUnit();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE:
				return getValue();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER:
				return getMultiplier();
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
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
				setMonetaryUnit((Currency)newValue);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
				setEnergyUnit((Float)newValue);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE:
				setValue((Float)newValue);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER:
				setMultiplier((UnitMultiplier)newValue);
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
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
				setMonetaryUnit(MONETARY_UNIT_EDEFAULT);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
				setEnergyUnit(ENERGY_UNIT_EDEFAULT);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER:
				setMultiplier(MULTIPLIER_EDEFAULT);
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
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
				return monetaryUnit != MONETARY_UNIT_EDEFAULT;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
				return energyUnit != ENERGY_UNIT_EDEFAULT;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE:
				return value != VALUE_EDEFAULT;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER:
				return multiplier != MULTIPLIER_EDEFAULT;
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
		result.append(" (monetaryUnit: ");
		result.append(monetaryUnit);
		result.append(", energyUnit: ");
		result.append(energyUnit);
		result.append(", value: ");
		result.append(value);
		result.append(", multiplier: ");
		result.append(multiplier);
		result.append(')');
		return result.toString();
	}

} //AccountingUnitImpl
