/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Core.impl.CurveImpl;

import gluemodel.CIM.IEC61970.Wires.ReactiveCapabilityCurve;
import gluemodel.CIM.IEC61970.Wires.SynchronousMachine;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reactive Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ReactiveCapabilityCurveImpl#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ReactiveCapabilityCurveImpl#getHydrogenPressure <em>Hydrogen Pressure</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ReactiveCapabilityCurveImpl#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.ReactiveCapabilityCurveImpl#getCoolantTemperature <em>Coolant Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactiveCapabilityCurveImpl extends CurveImpl implements ReactiveCapabilityCurve {
	/**
	 * The cached value of the '{@link #getInitiallyUsedBySynchronousMachines() <em>Initially Used By Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiallyUsedBySynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> initiallyUsedBySynchronousMachines;

	/**
	 * The default value of the '{@link #getHydrogenPressure() <em>Hydrogen Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydrogenPressure()
	 * @generated
	 * @ordered
	 */
	protected static final float HYDROGEN_PRESSURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHydrogenPressure() <em>Hydrogen Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydrogenPressure()
	 * @generated
	 * @ordered
	 */
	protected float hydrogenPressure = HYDROGEN_PRESSURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSynchronousMachines() <em>Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> synchronousMachines;

	/**
	 * The default value of the '{@link #getCoolantTemperature() <em>Coolant Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float COOLANT_TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoolantTemperature() <em>Coolant Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantTemperature()
	 * @generated
	 * @ordered
	 */
	protected float coolantTemperature = COOLANT_TEMPERATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactiveCapabilityCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REACTIVE_CAPABILITY_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronousMachine> getInitiallyUsedBySynchronousMachines() {
		if (initiallyUsedBySynchronousMachines == null) {
			initiallyUsedBySynchronousMachines = new EObjectWithInverseResolvingEList<SynchronousMachine>(SynchronousMachine.class, this, WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES, WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE);
		}
		return initiallyUsedBySynchronousMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHydrogenPressure() {
		return hydrogenPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydrogenPressure(float newHydrogenPressure) {
		float oldHydrogenPressure = hydrogenPressure;
		hydrogenPressure = newHydrogenPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE, oldHydrogenPressure, hydrogenPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronousMachine> getSynchronousMachines() {
		if (synchronousMachines == null) {
			synchronousMachines = new EObjectWithInverseResolvingEList.ManyInverse<SynchronousMachine>(SynchronousMachine.class, this, WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES, WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES);
		}
		return synchronousMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoolantTemperature() {
		return coolantTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoolantTemperature(float newCoolantTemperature) {
		float oldCoolantTemperature = coolantTemperature;
		coolantTemperature = newCoolantTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE, oldCoolantTemperature, coolantTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInitiallyUsedBySynchronousMachines()).basicAdd(otherEnd, msgs);
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchronousMachines()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getInitiallyUsedBySynchronousMachines()).basicRemove(otherEnd, msgs);
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getSynchronousMachines()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				return getInitiallyUsedBySynchronousMachines();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
				return getHydrogenPressure();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				return getSynchronousMachines();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
				return getCoolantTemperature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				getInitiallyUsedBySynchronousMachines().clear();
				getInitiallyUsedBySynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
				setHydrogenPressure((Float)newValue);
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				getSynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
				setCoolantTemperature((Float)newValue);
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				getInitiallyUsedBySynchronousMachines().clear();
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
				setHydrogenPressure(HYDROGEN_PRESSURE_EDEFAULT);
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
				setCoolantTemperature(COOLANT_TEMPERATURE_EDEFAULT);
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				return initiallyUsedBySynchronousMachines != null && !initiallyUsedBySynchronousMachines.isEmpty();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
				return hydrogenPressure != HYDROGEN_PRESSURE_EDEFAULT;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				return synchronousMachines != null && !synchronousMachines.isEmpty();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
				return coolantTemperature != COOLANT_TEMPERATURE_EDEFAULT;
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
		result.append(" (hydrogenPressure: ");
		result.append(hydrogenPressure);
		result.append(", coolantTemperature: ");
		result.append(coolantTemperature);
		result.append(')');
		return result.toString();
	}

} //ReactiveCapabilityCurveImpl
