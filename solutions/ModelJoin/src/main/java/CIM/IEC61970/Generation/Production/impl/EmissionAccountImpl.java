/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Generation.Production.EmissionAccount;
import CIM.IEC61970.Generation.Production.EmissionType;
import CIM.IEC61970.Generation.Production.EmissionValueSource;
import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.ThermalGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emission Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.EmissionAccountImpl#getEmissionValueSource <em>Emission Value Source</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.EmissionAccountImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.EmissionAccountImpl#getEmissionType <em>Emission Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmissionAccountImpl extends CurveImpl implements EmissionAccount {
	/**
	 * The default value of the '{@link #getEmissionValueSource() <em>Emission Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionValueSource()
	 * @generated
	 * @ordered
	 */
	protected static final EmissionValueSource EMISSION_VALUE_SOURCE_EDEFAULT = EmissionValueSource.MEASURED;

	/**
	 * The cached value of the '{@link #getEmissionValueSource() <em>Emission Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionValueSource()
	 * @generated
	 * @ordered
	 */
	protected EmissionValueSource emissionValueSource = EMISSION_VALUE_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ThermalGeneratingUnit thermalGeneratingUnit;

	/**
	 * The default value of the '{@link #getEmissionType() <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionType()
	 * @generated
	 * @ordered
	 */
	protected static final EmissionType EMISSION_TYPE_EDEFAULT = EmissionType.CHLORINE;

	/**
	 * The cached value of the '{@link #getEmissionType() <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionType()
	 * @generated
	 * @ordered
	 */
	protected EmissionType emissionType = EMISSION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmissionAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.EMISSION_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmissionValueSource getEmissionValueSource() {
		return emissionValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmissionValueSource(EmissionValueSource newEmissionValueSource) {
		EmissionValueSource oldEmissionValueSource = emissionValueSource;
		emissionValueSource = newEmissionValueSource == null ? EMISSION_VALUE_SOURCE_EDEFAULT : newEmissionValueSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE, oldEmissionValueSource, emissionValueSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit getThermalGeneratingUnit() {
		if (thermalGeneratingUnit != null && thermalGeneratingUnit.eIsProxy()) {
			InternalEObject oldThermalGeneratingUnit = (InternalEObject)thermalGeneratingUnit;
			thermalGeneratingUnit = (ThermalGeneratingUnit)eResolveProxy(oldThermalGeneratingUnit);
			if (thermalGeneratingUnit != oldThermalGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, thermalGeneratingUnit));
			}
		}
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit basicGetThermalGeneratingUnit() {
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit, NotificationChain msgs) {
		ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
		thermalGeneratingUnit = newThermalGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit) {
		if (newThermalGeneratingUnit != thermalGeneratingUnit) {
			NotificationChain msgs = null;
			if (thermalGeneratingUnit != null)
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT, newThermalGeneratingUnit, newThermalGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmissionType getEmissionType() {
		return emissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmissionType(EmissionType newEmissionType) {
		EmissionType oldEmissionType = emissionType;
		emissionType = newEmissionType == null ? EMISSION_TYPE_EDEFAULT : newEmissionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE, oldEmissionType, emissionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
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
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE:
				return getEmissionValueSource();
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE:
				return getEmissionType();
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
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE:
				setEmissionValueSource((EmissionValueSource)newValue);
				return;
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE:
				setEmissionType((EmissionType)newValue);
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
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE:
				setEmissionValueSource(EMISSION_VALUE_SOURCE_EDEFAULT);
				return;
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE:
				setEmissionType(EMISSION_TYPE_EDEFAULT);
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
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE:
				return emissionValueSource != EMISSION_VALUE_SOURCE_EDEFAULT;
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE:
				return emissionType != EMISSION_TYPE_EDEFAULT;
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
		result.append(" (emissionValueSource: ");
		result.append(emissionValueSource);
		result.append(", emissionType: ");
		result.append(emissionType);
		result.append(')');
		return result.toString();
	}

} //EmissionAccountImpl
