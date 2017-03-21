/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.COSEMObjectsPackage;
import COSEM.COSEMObjects.InputPulseValuesOrConstants;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Pulse Values Or Constants</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getActiveEnergy <em>Active Energy</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getReactive_energy <em>Reactive energy</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getApparent_energy <em>Apparent energy</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getVolt_squared_hours <em>Volt squared hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getAmpere_squared_hours <em>Ampere squared hours</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getUnitless_quantities <em>Unitless quantities</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getActive_energy_export <em>Active energy export</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getReactive_energy_export <em>Reactive energy export</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.InputPulseValuesOrConstantsImpl#getApparent_energy_export <em>Apparent energy export</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPulseValuesOrConstantsImpl extends DataImpl implements InputPulseValuesOrConstants {
	/**
	 * The default value of the '{@link #getActiveEnergy() <em>Active Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_ENERGY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActiveEnergy() <em>Active Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveEnergy()
	 * @generated
	 * @ordered
	 */
	protected double activeEnergy = ACTIVE_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_energy() <em>Reactive energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_energy()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_ENERGY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_energy() <em>Reactive energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_energy()
	 * @generated
	 * @ordered
	 */
	protected double reactive_energy = REACTIVE_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparent_energy() <em>Apparent energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparent_energy()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_ENERGY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparent_energy() <em>Apparent energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparent_energy()
	 * @generated
	 * @ordered
	 */
	protected double apparent_energy = APPARENT_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolt_squared_hours() <em>Volt squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolt_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLT_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolt_squared_hours() <em>Volt squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolt_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected double volt_squared_hours = VOLT_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmpere_squared_hours() <em>Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmpere_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected static final double AMPERE_SQUARED_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmpere_squared_hours() <em>Ampere squared hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmpere_squared_hours()
	 * @generated
	 * @ordered
	 */
	protected double ampere_squared_hours = AMPERE_SQUARED_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitless_quantities() <em>Unitless quantities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitless_quantities()
	 * @generated
	 * @ordered
	 */
	protected static final double UNITLESS_QUANTITIES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUnitless_quantities() <em>Unitless quantities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitless_quantities()
	 * @generated
	 * @ordered
	 */
	protected double unitless_quantities = UNITLESS_QUANTITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_energy_export() <em>Active energy export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_energy_export()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTIVE_ENERGY_EXPORT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActive_energy_export() <em>Active energy export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_energy_export()
	 * @generated
	 * @ordered
	 */
	protected double active_energy_export = ACTIVE_ENERGY_EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactive_energy_export() <em>Reactive energy export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_energy_export()
	 * @generated
	 * @ordered
	 */
	protected static final double REACTIVE_ENERGY_EXPORT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReactive_energy_export() <em>Reactive energy export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactive_energy_export()
	 * @generated
	 * @ordered
	 */
	protected double reactive_energy_export = REACTIVE_ENERGY_EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getApparent_energy_export() <em>Apparent energy export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparent_energy_export()
	 * @generated
	 * @ordered
	 */
	protected static final double APPARENT_ENERGY_EXPORT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApparent_energy_export() <em>Apparent energy export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparent_energy_export()
	 * @generated
	 * @ordered
	 */
	protected double apparent_energy_export = APPARENT_ENERGY_EXPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPulseValuesOrConstantsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getInputPulseValuesOrConstants();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActiveEnergy() {
		return activeEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveEnergy(double newActiveEnergy) {
		double oldActiveEnergy = activeEnergy;
		activeEnergy = newActiveEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY, oldActiveEnergy, activeEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_energy() {
		return reactive_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_energy(double newReactive_energy) {
		double oldReactive_energy = reactive_energy;
		reactive_energy = newReactive_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY, oldReactive_energy, reactive_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparent_energy() {
		return apparent_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparent_energy(double newApparent_energy) {
		double oldApparent_energy = apparent_energy;
		apparent_energy = newApparent_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY, oldApparent_energy, apparent_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolt_squared_hours() {
		return volt_squared_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolt_squared_hours(double newVolt_squared_hours) {
		double oldVolt_squared_hours = volt_squared_hours;
		volt_squared_hours = newVolt_squared_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__VOLT_SQUARED_HOURS, oldVolt_squared_hours, volt_squared_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmpere_squared_hours() {
		return ampere_squared_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmpere_squared_hours(double newAmpere_squared_hours) {
		double oldAmpere_squared_hours = ampere_squared_hours;
		ampere_squared_hours = newAmpere_squared_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__AMPERE_SQUARED_HOURS, oldAmpere_squared_hours, ampere_squared_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnitless_quantities() {
		return unitless_quantities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitless_quantities(double newUnitless_quantities) {
		double oldUnitless_quantities = unitless_quantities;
		unitless_quantities = newUnitless_quantities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__UNITLESS_QUANTITIES, oldUnitless_quantities, unitless_quantities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActive_energy_export() {
		return active_energy_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_energy_export(double newActive_energy_export) {
		double oldActive_energy_export = active_energy_export;
		active_energy_export = newActive_energy_export;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY_EXPORT, oldActive_energy_export, active_energy_export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReactive_energy_export() {
		return reactive_energy_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactive_energy_export(double newReactive_energy_export) {
		double oldReactive_energy_export = reactive_energy_export;
		reactive_energy_export = newReactive_energy_export;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY_EXPORT, oldReactive_energy_export, reactive_energy_export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApparent_energy_export() {
		return apparent_energy_export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApparent_energy_export(double newApparent_energy_export) {
		double oldApparent_energy_export = apparent_energy_export;
		apparent_energy_export = newApparent_energy_export;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY_EXPORT, oldApparent_energy_export, apparent_energy_export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY:
				return getActiveEnergy();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY:
				return getReactive_energy();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY:
				return getApparent_energy();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__VOLT_SQUARED_HOURS:
				return getVolt_squared_hours();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__AMPERE_SQUARED_HOURS:
				return getAmpere_squared_hours();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__UNITLESS_QUANTITIES:
				return getUnitless_quantities();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY_EXPORT:
				return getActive_energy_export();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY_EXPORT:
				return getReactive_energy_export();
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY_EXPORT:
				return getApparent_energy_export();
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
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY:
				setActiveEnergy((Double)newValue);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY:
				setReactive_energy((Double)newValue);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY:
				setApparent_energy((Double)newValue);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__VOLT_SQUARED_HOURS:
				setVolt_squared_hours((Double)newValue);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__AMPERE_SQUARED_HOURS:
				setAmpere_squared_hours((Double)newValue);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__UNITLESS_QUANTITIES:
				setUnitless_quantities((Double)newValue);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY_EXPORT:
				setActive_energy_export((Double)newValue);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY_EXPORT:
				setReactive_energy_export((Double)newValue);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY_EXPORT:
				setApparent_energy_export((Double)newValue);
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
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY:
				setActiveEnergy(ACTIVE_ENERGY_EDEFAULT);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY:
				setReactive_energy(REACTIVE_ENERGY_EDEFAULT);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY:
				setApparent_energy(APPARENT_ENERGY_EDEFAULT);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__VOLT_SQUARED_HOURS:
				setVolt_squared_hours(VOLT_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__AMPERE_SQUARED_HOURS:
				setAmpere_squared_hours(AMPERE_SQUARED_HOURS_EDEFAULT);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__UNITLESS_QUANTITIES:
				setUnitless_quantities(UNITLESS_QUANTITIES_EDEFAULT);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY_EXPORT:
				setActive_energy_export(ACTIVE_ENERGY_EXPORT_EDEFAULT);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY_EXPORT:
				setReactive_energy_export(REACTIVE_ENERGY_EXPORT_EDEFAULT);
				return;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY_EXPORT:
				setApparent_energy_export(APPARENT_ENERGY_EXPORT_EDEFAULT);
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
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY:
				return activeEnergy != ACTIVE_ENERGY_EDEFAULT;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY:
				return reactive_energy != REACTIVE_ENERGY_EDEFAULT;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY:
				return apparent_energy != APPARENT_ENERGY_EDEFAULT;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__VOLT_SQUARED_HOURS:
				return volt_squared_hours != VOLT_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__AMPERE_SQUARED_HOURS:
				return ampere_squared_hours != AMPERE_SQUARED_HOURS_EDEFAULT;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__UNITLESS_QUANTITIES:
				return unitless_quantities != UNITLESS_QUANTITIES_EDEFAULT;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__ACTIVE_ENERGY_EXPORT:
				return active_energy_export != ACTIVE_ENERGY_EXPORT_EDEFAULT;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__REACTIVE_ENERGY_EXPORT:
				return reactive_energy_export != REACTIVE_ENERGY_EXPORT_EDEFAULT;
			case COSEMObjectsPackage.INPUT_PULSE_VALUES_OR_CONSTANTS__APPARENT_ENERGY_EXPORT:
				return apparent_energy_export != APPARENT_ENERGY_EXPORT_EDEFAULT;
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
		result.append(" (ActiveEnergy: ");
		result.append(activeEnergy);
		result.append(", Reactive_energy: ");
		result.append(reactive_energy);
		result.append(", Apparent_energy: ");
		result.append(apparent_energy);
		result.append(", Volt_squared_hours: ");
		result.append(volt_squared_hours);
		result.append(", Ampere_squared_hours: ");
		result.append(ampere_squared_hours);
		result.append(", Unitless_quantities: ");
		result.append(unitless_quantities);
		result.append(", Active_energy_export: ");
		result.append(active_energy_export);
		result.append(", Reactive_energy_export: ");
		result.append(reactive_energy_export);
		result.append(", Apparent_energy_export: ");
		result.append(apparent_energy_export);
		result.append(')');
		return result.toString();
	}

} //InputPulseValuesOrConstantsImpl
