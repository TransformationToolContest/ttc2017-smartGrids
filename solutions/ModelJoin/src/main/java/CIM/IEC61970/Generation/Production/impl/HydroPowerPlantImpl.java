/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import CIM.IEC61970.Generation.Production.HydroGeneratingUnit;
import CIM.IEC61970.Generation.Production.HydroPlantType;
import CIM.IEC61970.Generation.Production.HydroPowerPlant;
import CIM.IEC61970.Generation.Production.HydroPump;
import CIM.IEC61970.Generation.Production.PenstockType;
import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.Reservoir;
import CIM.IEC61970.Generation.Production.SurgeTankCode;

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
 * An implementation of the model object '<em><b>Hydro Power Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getGenRatedP <em>Gen Rated P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getHydroGeneratingUnits <em>Hydro Generating Units</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getDischargeTravelDelay <em>Discharge Travel Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getPumpRatedP <em>Pump Rated P</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getPenstockType <em>Penstock Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getHydroPlantType <em>Hydro Plant Type</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getHydroPumps <em>Hydro Pumps</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getPlantRatedHead <em>Plant Rated Head</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getReservoir <em>Reservoir</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getSurgeTankCode <em>Surge Tank Code</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.HydroPowerPlantImpl#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroPowerPlantImpl extends PowerSystemResourceImpl implements HydroPowerPlant {
	/**
	 * The default value of the '{@link #getGenRatedP() <em>Gen Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenRatedP()
	 * @generated
	 * @ordered
	 */
	protected static final float GEN_RATED_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGenRatedP() <em>Gen Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenRatedP()
	 * @generated
	 * @ordered
	 */
	protected float genRatedP = GEN_RATED_P_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenSourcePumpDischargeReservoir() <em>Gen Source Pump Discharge Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenSourcePumpDischargeReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir genSourcePumpDischargeReservoir;

	/**
	 * The cached value of the '{@link #getHydroGeneratingUnits() <em>Hydro Generating Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroGeneratingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroGeneratingUnit> hydroGeneratingUnits;

	/**
	 * The default value of the '{@link #getSurgeTankCrestLevel() <em>Surge Tank Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeTankCrestLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float SURGE_TANK_CREST_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSurgeTankCrestLevel() <em>Surge Tank Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeTankCrestLevel()
	 * @generated
	 * @ordered
	 */
	protected float surgeTankCrestLevel = SURGE_TANK_CREST_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDischargeTravelDelay() <em>Discharge Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeTravelDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCHARGE_TRAVEL_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDischargeTravelDelay() <em>Discharge Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeTravelDelay()
	 * @generated
	 * @ordered
	 */
	protected float dischargeTravelDelay = DISCHARGE_TRAVEL_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPumpRatedP() <em>Pump Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpRatedP()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_RATED_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpRatedP() <em>Pump Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpRatedP()
	 * @generated
	 * @ordered
	 */
	protected float pumpRatedP = PUMP_RATED_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenstockType() <em>Penstock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenstockType()
	 * @generated
	 * @ordered
	 */
	protected static final PenstockType PENSTOCK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPenstockType() <em>Penstock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenstockType()
	 * @generated
	 * @ordered
	 */
	protected PenstockType penstockType = PENSTOCK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHydroPlantType() <em>Hydro Plant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPlantType()
	 * @generated
	 * @ordered
	 */
	protected static final HydroPlantType HYDRO_PLANT_TYPE_EDEFAULT = HydroPlantType.MAJOR_STORAGE;

	/**
	 * The cached value of the '{@link #getHydroPlantType() <em>Hydro Plant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPlantType()
	 * @generated
	 * @ordered
	 */
	protected HydroPlantType hydroPlantType = HYDRO_PLANT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHydroPumps() <em>Hydro Pumps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPumps()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroPump> hydroPumps;

	/**
	 * The default value of the '{@link #getPlantRatedHead() <em>Plant Rated Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantRatedHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PLANT_RATED_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPlantRatedHead() <em>Plant Rated Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantRatedHead()
	 * @generated
	 * @ordered
	 */
	protected float plantRatedHead = PLANT_RATED_HEAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReservoir() <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir reservoir;

	/**
	 * The default value of the '{@link #getSurgeTankCode() <em>Surge Tank Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeTankCode()
	 * @generated
	 * @ordered
	 */
	protected static final SurgeTankCode SURGE_TANK_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurgeTankCode() <em>Surge Tank Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeTankCode()
	 * @generated
	 * @ordered
	 */
	protected SurgeTankCode surgeTankCode = SURGE_TANK_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlantDischargeCapacity() <em>Plant Discharge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantDischargeCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float PLANT_DISCHARGE_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPlantDischargeCapacity() <em>Plant Discharge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantDischargeCapacity()
	 * @generated
	 * @ordered
	 */
	protected float plantDischargeCapacity = PLANT_DISCHARGE_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroPowerPlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_POWER_PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGenRatedP() {
		return genRatedP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenRatedP(float newGenRatedP) {
		float oldGenRatedP = genRatedP;
		genRatedP = newGenRatedP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P, oldGenRatedP, genRatedP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir getGenSourcePumpDischargeReservoir() {
		if (genSourcePumpDischargeReservoir != null && genSourcePumpDischargeReservoir.eIsProxy()) {
			InternalEObject oldGenSourcePumpDischargeReservoir = (InternalEObject)genSourcePumpDischargeReservoir;
			genSourcePumpDischargeReservoir = (Reservoir)eResolveProxy(oldGenSourcePumpDischargeReservoir);
			if (genSourcePumpDischargeReservoir != oldGenSourcePumpDischargeReservoir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR, oldGenSourcePumpDischargeReservoir, genSourcePumpDischargeReservoir));
			}
		}
		return genSourcePumpDischargeReservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetGenSourcePumpDischargeReservoir() {
		return genSourcePumpDischargeReservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenSourcePumpDischargeReservoir(Reservoir newGenSourcePumpDischargeReservoir, NotificationChain msgs) {
		Reservoir oldGenSourcePumpDischargeReservoir = genSourcePumpDischargeReservoir;
		genSourcePumpDischargeReservoir = newGenSourcePumpDischargeReservoir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR, oldGenSourcePumpDischargeReservoir, newGenSourcePumpDischargeReservoir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenSourcePumpDischargeReservoir(Reservoir newGenSourcePumpDischargeReservoir) {
		if (newGenSourcePumpDischargeReservoir != genSourcePumpDischargeReservoir) {
			NotificationChain msgs = null;
			if (genSourcePumpDischargeReservoir != null)
				msgs = ((InternalEObject)genSourcePumpDischargeReservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs);
			if (newGenSourcePumpDischargeReservoir != null)
				msgs = ((InternalEObject)newGenSourcePumpDischargeReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs);
			msgs = basicSetGenSourcePumpDischargeReservoir(newGenSourcePumpDischargeReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR, newGenSourcePumpDischargeReservoir, newGenSourcePumpDischargeReservoir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HydroGeneratingUnit> getHydroGeneratingUnits() {
		if (hydroGeneratingUnits == null) {
			hydroGeneratingUnits = new EObjectWithInverseResolvingEList<HydroGeneratingUnit>(HydroGeneratingUnit.class, this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT);
		}
		return hydroGeneratingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSurgeTankCrestLevel() {
		return surgeTankCrestLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurgeTankCrestLevel(float newSurgeTankCrestLevel) {
		float oldSurgeTankCrestLevel = surgeTankCrestLevel;
		surgeTankCrestLevel = newSurgeTankCrestLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL, oldSurgeTankCrestLevel, surgeTankCrestLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDischargeTravelDelay() {
		return dischargeTravelDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDischargeTravelDelay(float newDischargeTravelDelay) {
		float oldDischargeTravelDelay = dischargeTravelDelay;
		dischargeTravelDelay = newDischargeTravelDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY, oldDischargeTravelDelay, dischargeTravelDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPumpRatedP() {
		return pumpRatedP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPumpRatedP(float newPumpRatedP) {
		float oldPumpRatedP = pumpRatedP;
		pumpRatedP = newPumpRatedP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P, oldPumpRatedP, pumpRatedP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenstockType getPenstockType() {
		return penstockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenstockType(PenstockType newPenstockType) {
		PenstockType oldPenstockType = penstockType;
		penstockType = newPenstockType == null ? PENSTOCK_TYPE_EDEFAULT : newPenstockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE, oldPenstockType, penstockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPlantType getHydroPlantType() {
		return hydroPlantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroPlantType(HydroPlantType newHydroPlantType) {
		HydroPlantType oldHydroPlantType = hydroPlantType;
		hydroPlantType = newHydroPlantType == null ? HYDRO_PLANT_TYPE_EDEFAULT : newHydroPlantType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE, oldHydroPlantType, hydroPlantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HydroPump> getHydroPumps() {
		if (hydroPumps == null) {
			hydroPumps = new EObjectWithInverseResolvingEList<HydroPump>(HydroPump.class, this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT);
		}
		return hydroPumps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPlantRatedHead() {
		return plantRatedHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantRatedHead(float newPlantRatedHead) {
		float oldPlantRatedHead = plantRatedHead;
		plantRatedHead = newPlantRatedHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD, oldPlantRatedHead, plantRatedHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir getReservoir() {
		if (reservoir != null && reservoir.eIsProxy()) {
			InternalEObject oldReservoir = (InternalEObject)reservoir;
			reservoir = (Reservoir)eResolveProxy(oldReservoir);
			if (reservoir != oldReservoir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR, oldReservoir, reservoir));
			}
		}
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetReservoir() {
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservoir(Reservoir newReservoir, NotificationChain msgs) {
		Reservoir oldReservoir = reservoir;
		reservoir = newReservoir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR, oldReservoir, newReservoir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservoir(Reservoir newReservoir) {
		if (newReservoir != reservoir) {
			NotificationChain msgs = null;
			if (reservoir != null)
				msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs);
			if (newReservoir != null)
				msgs = ((InternalEObject)newReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs);
			msgs = basicSetReservoir(newReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR, newReservoir, newReservoir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeTankCode getSurgeTankCode() {
		return surgeTankCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurgeTankCode(SurgeTankCode newSurgeTankCode) {
		SurgeTankCode oldSurgeTankCode = surgeTankCode;
		surgeTankCode = newSurgeTankCode == null ? SURGE_TANK_CODE_EDEFAULT : newSurgeTankCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE, oldSurgeTankCode, surgeTankCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPlantDischargeCapacity() {
		return plantDischargeCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantDischargeCapacity(float newPlantDischargeCapacity) {
		float oldPlantDischargeCapacity = plantDischargeCapacity;
		plantDischargeCapacity = newPlantDischargeCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY, oldPlantDischargeCapacity, plantDischargeCapacity));
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
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				if (genSourcePumpDischargeReservoir != null)
					msgs = ((InternalEObject)genSourcePumpDischargeReservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs);
				return basicSetGenSourcePumpDischargeReservoir((Reservoir)otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHydroGeneratingUnits()).basicAdd(otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHydroPumps()).basicAdd(otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				if (reservoir != null)
					msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs);
				return basicSetReservoir((Reservoir)otherEnd, msgs);
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
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				return basicSetGenSourcePumpDischargeReservoir(null, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				return ((InternalEList<?>)getHydroGeneratingUnits()).basicRemove(otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				return ((InternalEList<?>)getHydroPumps()).basicRemove(otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				return basicSetReservoir(null, msgs);
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
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
				return getGenRatedP();
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				if (resolve) return getGenSourcePumpDischargeReservoir();
				return basicGetGenSourcePumpDischargeReservoir();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				return getHydroGeneratingUnits();
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
				return getSurgeTankCrestLevel();
			case ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
				return getDischargeTravelDelay();
			case ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
				return getPumpRatedP();
			case ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
				return getPenstockType();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE:
				return getHydroPlantType();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				return getHydroPumps();
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
				return getPlantRatedHead();
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				if (resolve) return getReservoir();
				return basicGetReservoir();
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
				return getSurgeTankCode();
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
				return getPlantDischargeCapacity();
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
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
				setGenRatedP((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				setGenSourcePumpDischargeReservoir((Reservoir)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				getHydroGeneratingUnits().clear();
				getHydroGeneratingUnits().addAll((Collection<? extends HydroGeneratingUnit>)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
				setSurgeTankCrestLevel((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
				setDischargeTravelDelay((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
				setPumpRatedP((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
				setPenstockType((PenstockType)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE:
				setHydroPlantType((HydroPlantType)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				getHydroPumps().clear();
				getHydroPumps().addAll((Collection<? extends HydroPump>)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
				setPlantRatedHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				setReservoir((Reservoir)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
				setSurgeTankCode((SurgeTankCode)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
				setPlantDischargeCapacity((Float)newValue);
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
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
				setGenRatedP(GEN_RATED_P_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				setGenSourcePumpDischargeReservoir((Reservoir)null);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				getHydroGeneratingUnits().clear();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
				setSurgeTankCrestLevel(SURGE_TANK_CREST_LEVEL_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
				setDischargeTravelDelay(DISCHARGE_TRAVEL_DELAY_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
				setPumpRatedP(PUMP_RATED_P_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
				setPenstockType(PENSTOCK_TYPE_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE:
				setHydroPlantType(HYDRO_PLANT_TYPE_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				getHydroPumps().clear();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
				setPlantRatedHead(PLANT_RATED_HEAD_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				setReservoir((Reservoir)null);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
				setSurgeTankCode(SURGE_TANK_CODE_EDEFAULT);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
				setPlantDischargeCapacity(PLANT_DISCHARGE_CAPACITY_EDEFAULT);
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
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
				return genRatedP != GEN_RATED_P_EDEFAULT;
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				return genSourcePumpDischargeReservoir != null;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				return hydroGeneratingUnits != null && !hydroGeneratingUnits.isEmpty();
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
				return surgeTankCrestLevel != SURGE_TANK_CREST_LEVEL_EDEFAULT;
			case ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
				return dischargeTravelDelay != DISCHARGE_TRAVEL_DELAY_EDEFAULT;
			case ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
				return pumpRatedP != PUMP_RATED_P_EDEFAULT;
			case ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
				return penstockType != PENSTOCK_TYPE_EDEFAULT;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE:
				return hydroPlantType != HYDRO_PLANT_TYPE_EDEFAULT;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				return hydroPumps != null && !hydroPumps.isEmpty();
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
				return plantRatedHead != PLANT_RATED_HEAD_EDEFAULT;
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				return reservoir != null;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
				return surgeTankCode != SURGE_TANK_CODE_EDEFAULT;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
				return plantDischargeCapacity != PLANT_DISCHARGE_CAPACITY_EDEFAULT;
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
		result.append(" (genRatedP: ");
		result.append(genRatedP);
		result.append(", surgeTankCrestLevel: ");
		result.append(surgeTankCrestLevel);
		result.append(", dischargeTravelDelay: ");
		result.append(dischargeTravelDelay);
		result.append(", pumpRatedP: ");
		result.append(pumpRatedP);
		result.append(", penstockType: ");
		result.append(penstockType);
		result.append(", hydroPlantType: ");
		result.append(hydroPlantType);
		result.append(", plantRatedHead: ");
		result.append(plantRatedHead);
		result.append(", surgeTankCode: ");
		result.append(surgeTankCode);
		result.append(", plantDischargeCapacity: ");
		result.append(plantDischargeCapacity);
		result.append(')');
		return result.toString();
	}

} //HydroPowerPlantImpl
