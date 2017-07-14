/**
 */
package gluemodel.CIM.IEC61970.Generation.Production.impl;

import gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import gluemodel.CIM.IEC61970.Generation.Production.AirCompressor;
import gluemodel.CIM.IEC61970.Generation.Production.CAESPlant;
import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;
import gluemodel.CIM.IEC61970.Generation.Production.ThermalGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAES Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.CAESPlantImpl#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.CAESPlantImpl#getRatedCapacityP <em>Rated Capacity P</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.CAESPlantImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.CAESPlantImpl#getAirCompressor <em>Air Compressor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAESPlantImpl extends PowerSystemResourceImpl implements CAESPlant {
	/**
	 * The default value of the '{@link #getEnergyStorageCapacity() <em>Energy Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_STORAGE_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyStorageCapacity() <em>Energy Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected float energyStorageCapacity = ENERGY_STORAGE_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedCapacityP() <em>Rated Capacity P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCapacityP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CAPACITY_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCapacityP() <em>Rated Capacity P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCapacityP()
	 * @generated
	 * @ordered
	 */
	protected float ratedCapacityP = RATED_CAPACITY_P_EDEFAULT;

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
	 * The cached value of the '{@link #getAirCompressor() <em>Air Compressor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCompressor()
	 * @generated
	 * @ordered
	 */
	protected AirCompressor airCompressor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAESPlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.CAES_PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyStorageCapacity() {
		return energyStorageCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyStorageCapacity(float newEnergyStorageCapacity) {
		float oldEnergyStorageCapacity = energyStorageCapacity;
		energyStorageCapacity = newEnergyStorageCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY, oldEnergyStorageCapacity, energyStorageCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedCapacityP() {
		return ratedCapacityP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedCapacityP(float newRatedCapacityP) {
		float oldRatedCapacityP = ratedCapacityP;
		ratedCapacityP = newRatedCapacityP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.CAES_PLANT__RATED_CAPACITY_P, oldRatedCapacityP, ratedCapacityP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, thermalGeneratingUnit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit);
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
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, newThermalGeneratingUnit, newThermalGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirCompressor getAirCompressor() {
		if (airCompressor != null && airCompressor.eIsProxy()) {
			InternalEObject oldAirCompressor = (InternalEObject)airCompressor;
			airCompressor = (AirCompressor)eResolveProxy(oldAirCompressor);
			if (airCompressor != oldAirCompressor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, oldAirCompressor, airCompressor));
			}
		}
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirCompressor basicGetAirCompressor() {
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirCompressor(AirCompressor newAirCompressor, NotificationChain msgs) {
		AirCompressor oldAirCompressor = airCompressor;
		airCompressor = newAirCompressor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, oldAirCompressor, newAirCompressor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirCompressor(AirCompressor newAirCompressor) {
		if (newAirCompressor != airCompressor) {
			NotificationChain msgs = null;
			if (airCompressor != null)
				msgs = ((InternalEObject)airCompressor).eInverseRemove(this, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs);
			if (newAirCompressor != null)
				msgs = ((InternalEObject)newAirCompressor).eInverseAdd(this, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs);
			msgs = basicSetAirCompressor(newAirCompressor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, newAirCompressor, newAirCompressor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				if (airCompressor != null)
					msgs = ((InternalEObject)airCompressor).eInverseRemove(this, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs);
				return basicSetAirCompressor((AirCompressor)otherEnd, msgs);
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
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				return basicSetAirCompressor(null, msgs);
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
			case ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
				return getEnergyStorageCapacity();
			case ProductionPackage.CAES_PLANT__RATED_CAPACITY_P:
				return getRatedCapacityP();
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				if (resolve) return getAirCompressor();
				return basicGetAirCompressor();
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
			case ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
				setEnergyStorageCapacity((Float)newValue);
				return;
			case ProductionPackage.CAES_PLANT__RATED_CAPACITY_P:
				setRatedCapacityP((Float)newValue);
				return;
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				setAirCompressor((AirCompressor)newValue);
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
			case ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
				setEnergyStorageCapacity(ENERGY_STORAGE_CAPACITY_EDEFAULT);
				return;
			case ProductionPackage.CAES_PLANT__RATED_CAPACITY_P:
				setRatedCapacityP(RATED_CAPACITY_P_EDEFAULT);
				return;
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				setAirCompressor((AirCompressor)null);
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
			case ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
				return energyStorageCapacity != ENERGY_STORAGE_CAPACITY_EDEFAULT;
			case ProductionPackage.CAES_PLANT__RATED_CAPACITY_P:
				return ratedCapacityP != RATED_CAPACITY_P_EDEFAULT;
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				return airCompressor != null;
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
		result.append(" (energyStorageCapacity: ");
		result.append(energyStorageCapacity);
		result.append(", ratedCapacityP: ");
		result.append(ratedCapacityP);
		result.append(')');
		return result.toString();
	}

} //CAESPlantImpl
