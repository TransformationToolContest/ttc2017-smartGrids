/**
 */
package gluemodel.CIM.IEC61970.Generation.Production.impl;

import gluemodel.CIM.IEC61970.Core.impl.PowerSystemResourceImpl;

import gluemodel.CIM.IEC61970.Generation.Production.HydroPowerPlant;
import gluemodel.CIM.IEC61970.Generation.Production.InflowForecast;
import gluemodel.CIM.IEC61970.Generation.Production.LevelVsVolumeCurve;
import gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage;
import gluemodel.CIM.IEC61970.Generation.Production.Reservoir;
import gluemodel.CIM.IEC61970.Generation.Production.SpillwayGateType;
import gluemodel.CIM.IEC61970.Generation.Production.TargetLevelSchedule;

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
 * An implementation of the model object '<em><b>Reservoir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getActiveStorageCapacity <em>Active Storage Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getSpillsFromReservoir <em>Spills From Reservoir</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getInflowForecasts <em>Inflow Forecasts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getSpillTravelDelay <em>Spill Travel Delay</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getRiverOutletWorks <em>River Outlet Works</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getSpillwayCrestLevel <em>Spillway Crest Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getFullSupplyLevel <em>Full Supply Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getSpillwayCapacity <em>Spillway Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getTargetLevelSchedule <em>Target Level Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getSpillWayGateType <em>Spill Way Gate Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getSpillwayCrestLength <em>Spillway Crest Length</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getEnergyStorageRating <em>Energy Storage Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getGrossCapacity <em>Gross Capacity</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Generation.Production.impl.ReservoirImpl#getHydroPowerPlants <em>Hydro Power Plants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservoirImpl extends PowerSystemResourceImpl implements Reservoir {
	/**
	 * The default value of the '{@link #getActiveStorageCapacity() <em>Active Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTIVE_STORAGE_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActiveStorageCapacity() <em>Active Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected float activeStorageCapacity = ACTIVE_STORAGE_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpstreamFromHydroPowerPlants() <em>Upstream From Hydro Power Plants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamFromHydroPowerPlants()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroPowerPlant> upstreamFromHydroPowerPlants;

	/**
	 * The cached value of the '{@link #getSpillsIntoReservoirs() <em>Spills Into Reservoirs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillsIntoReservoirs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservoir> spillsIntoReservoirs;

	/**
	 * The cached value of the '{@link #getSpillsFromReservoir() <em>Spills From Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillsFromReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir spillsFromReservoir;

	/**
	 * The cached value of the '{@link #getLevelVsVolumeCurves() <em>Level Vs Volume Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelVsVolumeCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<LevelVsVolumeCurve> levelVsVolumeCurves;

	/**
	 * The cached value of the '{@link #getInflowForecasts() <em>Inflow Forecasts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInflowForecasts()
	 * @generated
	 * @ordered
	 */
	protected EList<InflowForecast> inflowForecasts;

	/**
	 * The default value of the '{@link #getSpillTravelDelay() <em>Spill Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillTravelDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float SPILL_TRAVEL_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpillTravelDelay() <em>Spill Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillTravelDelay()
	 * @generated
	 * @ordered
	 */
	protected float spillTravelDelay = SPILL_TRAVEL_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiverOutletWorks() <em>River Outlet Works</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiverOutletWorks()
	 * @generated
	 * @ordered
	 */
	protected static final String RIVER_OUTLET_WORKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiverOutletWorks() <em>River Outlet Works</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiverOutletWorks()
	 * @generated
	 * @ordered
	 */
	protected String riverOutletWorks = RIVER_OUTLET_WORKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalMinOperateLevel() <em>Normal Min Operate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalMinOperateLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_MIN_OPERATE_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalMinOperateLevel() <em>Normal Min Operate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalMinOperateLevel()
	 * @generated
	 * @ordered
	 */
	protected float normalMinOperateLevel = NORMAL_MIN_OPERATE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpillwayCrestLevel() <em>Spillway Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCrestLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float SPILLWAY_CREST_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpillwayCrestLevel() <em>Spillway Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCrestLevel()
	 * @generated
	 * @ordered
	 */
	protected float spillwayCrestLevel = SPILLWAY_CREST_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullSupplyLevel() <em>Full Supply Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullSupplyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float FULL_SUPPLY_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFullSupplyLevel() <em>Full Supply Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullSupplyLevel()
	 * @generated
	 * @ordered
	 */
	protected float fullSupplyLevel = FULL_SUPPLY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpillwayCapacity() <em>Spillway Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float SPILLWAY_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpillwayCapacity() <em>Spillway Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCapacity()
	 * @generated
	 * @ordered
	 */
	protected float spillwayCapacity = SPILLWAY_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetLevelSchedule() <em>Target Level Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLevelSchedule()
	 * @generated
	 * @ordered
	 */
	protected TargetLevelSchedule targetLevelSchedule;

	/**
	 * The default value of the '{@link #getSpillWayGateType() <em>Spill Way Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillWayGateType()
	 * @generated
	 * @ordered
	 */
	protected static final SpillwayGateType SPILL_WAY_GATE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpillWayGateType() <em>Spill Way Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillWayGateType()
	 * @generated
	 * @ordered
	 */
	protected SpillwayGateType spillWayGateType = SPILL_WAY_GATE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpillwayCrestLength() <em>Spillway Crest Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCrestLength()
	 * @generated
	 * @ordered
	 */
	protected static final float SPILLWAY_CREST_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpillwayCrestLength() <em>Spillway Crest Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCrestLength()
	 * @generated
	 * @ordered
	 */
	protected float spillwayCrestLength = SPILLWAY_CREST_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyStorageRating() <em>Energy Storage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyStorageRating()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_STORAGE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyStorageRating() <em>Energy Storage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyStorageRating()
	 * @generated
	 * @ordered
	 */
	protected float energyStorageRating = ENERGY_STORAGE_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrossCapacity() <em>Gross Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float GROSS_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGrossCapacity() <em>Gross Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossCapacity()
	 * @generated
	 * @ordered
	 */
	protected float grossCapacity = GROSS_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHydroPowerPlants() <em>Hydro Power Plants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPowerPlants()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroPowerPlant> hydroPowerPlants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservoirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.RESERVOIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getActiveStorageCapacity() {
		return activeStorageCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveStorageCapacity(float newActiveStorageCapacity) {
		float oldActiveStorageCapacity = activeStorageCapacity;
		activeStorageCapacity = newActiveStorageCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY, oldActiveStorageCapacity, activeStorageCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HydroPowerPlant> getUpstreamFromHydroPowerPlants() {
		if (upstreamFromHydroPowerPlants == null) {
			upstreamFromHydroPowerPlants = new EObjectWithInverseResolvingEList<HydroPowerPlant>(HydroPowerPlant.class, this, ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR);
		}
		return upstreamFromHydroPowerPlants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservoir> getSpillsIntoReservoirs() {
		if (spillsIntoReservoirs == null) {
			spillsIntoReservoirs = new EObjectWithInverseResolvingEList<Reservoir>(Reservoir.class, this, ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR);
		}
		return spillsIntoReservoirs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir getSpillsFromReservoir() {
		if (spillsFromReservoir != null && spillsFromReservoir.eIsProxy()) {
			InternalEObject oldSpillsFromReservoir = (InternalEObject)spillsFromReservoir;
			spillsFromReservoir = (Reservoir)eResolveProxy(oldSpillsFromReservoir);
			if (spillsFromReservoir != oldSpillsFromReservoir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR, oldSpillsFromReservoir, spillsFromReservoir));
			}
		}
		return spillsFromReservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetSpillsFromReservoir() {
		return spillsFromReservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpillsFromReservoir(Reservoir newSpillsFromReservoir, NotificationChain msgs) {
		Reservoir oldSpillsFromReservoir = spillsFromReservoir;
		spillsFromReservoir = newSpillsFromReservoir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR, oldSpillsFromReservoir, newSpillsFromReservoir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpillsFromReservoir(Reservoir newSpillsFromReservoir) {
		if (newSpillsFromReservoir != spillsFromReservoir) {
			NotificationChain msgs = null;
			if (spillsFromReservoir != null)
				msgs = ((InternalEObject)spillsFromReservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs);
			if (newSpillsFromReservoir != null)
				msgs = ((InternalEObject)newSpillsFromReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs);
			msgs = basicSetSpillsFromReservoir(newSpillsFromReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR, newSpillsFromReservoir, newSpillsFromReservoir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LevelVsVolumeCurve> getLevelVsVolumeCurves() {
		if (levelVsVolumeCurves == null) {
			levelVsVolumeCurves = new EObjectWithInverseResolvingEList<LevelVsVolumeCurve>(LevelVsVolumeCurve.class, this, ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES, ProductionPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR);
		}
		return levelVsVolumeCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InflowForecast> getInflowForecasts() {
		if (inflowForecasts == null) {
			inflowForecasts = new EObjectWithInverseResolvingEList<InflowForecast>(InflowForecast.class, this, ProductionPackage.RESERVOIR__INFLOW_FORECASTS, ProductionPackage.INFLOW_FORECAST__RESERVOIR);
		}
		return inflowForecasts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpillTravelDelay() {
		return spillTravelDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpillTravelDelay(float newSpillTravelDelay) {
		float oldSpillTravelDelay = spillTravelDelay;
		spillTravelDelay = newSpillTravelDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY, oldSpillTravelDelay, spillTravelDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRiverOutletWorks() {
		return riverOutletWorks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiverOutletWorks(String newRiverOutletWorks) {
		String oldRiverOutletWorks = riverOutletWorks;
		riverOutletWorks = newRiverOutletWorks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS, oldRiverOutletWorks, riverOutletWorks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormalMinOperateLevel() {
		return normalMinOperateLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalMinOperateLevel(float newNormalMinOperateLevel) {
		float oldNormalMinOperateLevel = normalMinOperateLevel;
		normalMinOperateLevel = newNormalMinOperateLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL, oldNormalMinOperateLevel, normalMinOperateLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpillwayCrestLevel() {
		return spillwayCrestLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpillwayCrestLevel(float newSpillwayCrestLevel) {
		float oldSpillwayCrestLevel = spillwayCrestLevel;
		spillwayCrestLevel = newSpillwayCrestLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL, oldSpillwayCrestLevel, spillwayCrestLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFullSupplyLevel() {
		return fullSupplyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullSupplyLevel(float newFullSupplyLevel) {
		float oldFullSupplyLevel = fullSupplyLevel;
		fullSupplyLevel = newFullSupplyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL, oldFullSupplyLevel, fullSupplyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpillwayCapacity() {
		return spillwayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpillwayCapacity(float newSpillwayCapacity) {
		float oldSpillwayCapacity = spillwayCapacity;
		spillwayCapacity = newSpillwayCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY, oldSpillwayCapacity, spillwayCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetLevelSchedule getTargetLevelSchedule() {
		if (targetLevelSchedule != null && targetLevelSchedule.eIsProxy()) {
			InternalEObject oldTargetLevelSchedule = (InternalEObject)targetLevelSchedule;
			targetLevelSchedule = (TargetLevelSchedule)eResolveProxy(oldTargetLevelSchedule);
			if (targetLevelSchedule != oldTargetLevelSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, oldTargetLevelSchedule, targetLevelSchedule));
			}
		}
		return targetLevelSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetLevelSchedule basicGetTargetLevelSchedule() {
		return targetLevelSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetLevelSchedule(TargetLevelSchedule newTargetLevelSchedule, NotificationChain msgs) {
		TargetLevelSchedule oldTargetLevelSchedule = targetLevelSchedule;
		targetLevelSchedule = newTargetLevelSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, oldTargetLevelSchedule, newTargetLevelSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLevelSchedule(TargetLevelSchedule newTargetLevelSchedule) {
		if (newTargetLevelSchedule != targetLevelSchedule) {
			NotificationChain msgs = null;
			if (targetLevelSchedule != null)
				msgs = ((InternalEObject)targetLevelSchedule).eInverseRemove(this, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs);
			if (newTargetLevelSchedule != null)
				msgs = ((InternalEObject)newTargetLevelSchedule).eInverseAdd(this, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs);
			msgs = basicSetTargetLevelSchedule(newTargetLevelSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, newTargetLevelSchedule, newTargetLevelSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpillwayGateType getSpillWayGateType() {
		return spillWayGateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpillWayGateType(SpillwayGateType newSpillWayGateType) {
		SpillwayGateType oldSpillWayGateType = spillWayGateType;
		spillWayGateType = newSpillWayGateType == null ? SPILL_WAY_GATE_TYPE_EDEFAULT : newSpillWayGateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE, oldSpillWayGateType, spillWayGateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpillwayCrestLength() {
		return spillwayCrestLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpillwayCrestLength(float newSpillwayCrestLength) {
		float oldSpillwayCrestLength = spillwayCrestLength;
		spillwayCrestLength = newSpillwayCrestLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH, oldSpillwayCrestLength, spillwayCrestLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyStorageRating() {
		return energyStorageRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyStorageRating(float newEnergyStorageRating) {
		float oldEnergyStorageRating = energyStorageRating;
		energyStorageRating = newEnergyStorageRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING, oldEnergyStorageRating, energyStorageRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGrossCapacity() {
		return grossCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrossCapacity(float newGrossCapacity) {
		float oldGrossCapacity = grossCapacity;
		grossCapacity = newGrossCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.RESERVOIR__GROSS_CAPACITY, oldGrossCapacity, grossCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HydroPowerPlant> getHydroPowerPlants() {
		if (hydroPowerPlants == null) {
			hydroPowerPlants = new EObjectWithInverseResolvingEList<HydroPowerPlant>(HydroPowerPlant.class, this, ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS, ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR);
		}
		return hydroPowerPlants;
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
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUpstreamFromHydroPowerPlants()).basicAdd(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpillsIntoReservoirs()).basicAdd(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				if (spillsFromReservoir != null)
					msgs = ((InternalEObject)spillsFromReservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs);
				return basicSetSpillsFromReservoir((Reservoir)otherEnd, msgs);
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLevelVsVolumeCurves()).basicAdd(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInflowForecasts()).basicAdd(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				if (targetLevelSchedule != null)
					msgs = ((InternalEObject)targetLevelSchedule).eInverseRemove(this, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs);
				return basicSetTargetLevelSchedule((TargetLevelSchedule)otherEnd, msgs);
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHydroPowerPlants()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				return ((InternalEList<?>)getUpstreamFromHydroPowerPlants()).basicRemove(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				return ((InternalEList<?>)getSpillsIntoReservoirs()).basicRemove(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				return basicSetSpillsFromReservoir(null, msgs);
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				return ((InternalEList<?>)getLevelVsVolumeCurves()).basicRemove(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				return ((InternalEList<?>)getInflowForecasts()).basicRemove(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				return basicSetTargetLevelSchedule(null, msgs);
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				return ((InternalEList<?>)getHydroPowerPlants()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
				return getActiveStorageCapacity();
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				return getUpstreamFromHydroPowerPlants();
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				return getSpillsIntoReservoirs();
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				if (resolve) return getSpillsFromReservoir();
				return basicGetSpillsFromReservoir();
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				return getLevelVsVolumeCurves();
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				return getInflowForecasts();
			case ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
				return getSpillTravelDelay();
			case ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS:
				return getRiverOutletWorks();
			case ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
				return getNormalMinOperateLevel();
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
				return getSpillwayCrestLevel();
			case ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
				return getFullSupplyLevel();
			case ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY:
				return getSpillwayCapacity();
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				if (resolve) return getTargetLevelSchedule();
				return basicGetTargetLevelSchedule();
			case ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
				return getSpillWayGateType();
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
				return getSpillwayCrestLength();
			case ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING:
				return getEnergyStorageRating();
			case ProductionPackage.RESERVOIR__GROSS_CAPACITY:
				return getGrossCapacity();
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				return getHydroPowerPlants();
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
			case ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
				setActiveStorageCapacity((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				getUpstreamFromHydroPowerPlants().clear();
				getUpstreamFromHydroPowerPlants().addAll((Collection<? extends HydroPowerPlant>)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				getSpillsIntoReservoirs().clear();
				getSpillsIntoReservoirs().addAll((Collection<? extends Reservoir>)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				setSpillsFromReservoir((Reservoir)newValue);
				return;
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				getLevelVsVolumeCurves().clear();
				getLevelVsVolumeCurves().addAll((Collection<? extends LevelVsVolumeCurve>)newValue);
				return;
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				getInflowForecasts().clear();
				getInflowForecasts().addAll((Collection<? extends InflowForecast>)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
				setSpillTravelDelay((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS:
				setRiverOutletWorks((String)newValue);
				return;
			case ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
				setNormalMinOperateLevel((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
				setSpillwayCrestLevel((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
				setFullSupplyLevel((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY:
				setSpillwayCapacity((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				setTargetLevelSchedule((TargetLevelSchedule)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
				setSpillWayGateType((SpillwayGateType)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
				setSpillwayCrestLength((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING:
				setEnergyStorageRating((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__GROSS_CAPACITY:
				setGrossCapacity((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				getHydroPowerPlants().clear();
				getHydroPowerPlants().addAll((Collection<? extends HydroPowerPlant>)newValue);
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
			case ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
				setActiveStorageCapacity(ACTIVE_STORAGE_CAPACITY_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				getUpstreamFromHydroPowerPlants().clear();
				return;
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				getSpillsIntoReservoirs().clear();
				return;
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				setSpillsFromReservoir((Reservoir)null);
				return;
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				getLevelVsVolumeCurves().clear();
				return;
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				getInflowForecasts().clear();
				return;
			case ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
				setSpillTravelDelay(SPILL_TRAVEL_DELAY_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS:
				setRiverOutletWorks(RIVER_OUTLET_WORKS_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
				setNormalMinOperateLevel(NORMAL_MIN_OPERATE_LEVEL_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
				setSpillwayCrestLevel(SPILLWAY_CREST_LEVEL_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
				setFullSupplyLevel(FULL_SUPPLY_LEVEL_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY:
				setSpillwayCapacity(SPILLWAY_CAPACITY_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				setTargetLevelSchedule((TargetLevelSchedule)null);
				return;
			case ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
				setSpillWayGateType(SPILL_WAY_GATE_TYPE_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
				setSpillwayCrestLength(SPILLWAY_CREST_LENGTH_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING:
				setEnergyStorageRating(ENERGY_STORAGE_RATING_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__GROSS_CAPACITY:
				setGrossCapacity(GROSS_CAPACITY_EDEFAULT);
				return;
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				getHydroPowerPlants().clear();
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
			case ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
				return activeStorageCapacity != ACTIVE_STORAGE_CAPACITY_EDEFAULT;
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				return upstreamFromHydroPowerPlants != null && !upstreamFromHydroPowerPlants.isEmpty();
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				return spillsIntoReservoirs != null && !spillsIntoReservoirs.isEmpty();
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				return spillsFromReservoir != null;
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				return levelVsVolumeCurves != null && !levelVsVolumeCurves.isEmpty();
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				return inflowForecasts != null && !inflowForecasts.isEmpty();
			case ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
				return spillTravelDelay != SPILL_TRAVEL_DELAY_EDEFAULT;
			case ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS:
				return RIVER_OUTLET_WORKS_EDEFAULT == null ? riverOutletWorks != null : !RIVER_OUTLET_WORKS_EDEFAULT.equals(riverOutletWorks);
			case ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
				return normalMinOperateLevel != NORMAL_MIN_OPERATE_LEVEL_EDEFAULT;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
				return spillwayCrestLevel != SPILLWAY_CREST_LEVEL_EDEFAULT;
			case ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
				return fullSupplyLevel != FULL_SUPPLY_LEVEL_EDEFAULT;
			case ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY:
				return spillwayCapacity != SPILLWAY_CAPACITY_EDEFAULT;
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				return targetLevelSchedule != null;
			case ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
				return spillWayGateType != SPILL_WAY_GATE_TYPE_EDEFAULT;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
				return spillwayCrestLength != SPILLWAY_CREST_LENGTH_EDEFAULT;
			case ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING:
				return energyStorageRating != ENERGY_STORAGE_RATING_EDEFAULT;
			case ProductionPackage.RESERVOIR__GROSS_CAPACITY:
				return grossCapacity != GROSS_CAPACITY_EDEFAULT;
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				return hydroPowerPlants != null && !hydroPowerPlants.isEmpty();
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
		result.append(" (activeStorageCapacity: ");
		result.append(activeStorageCapacity);
		result.append(", spillTravelDelay: ");
		result.append(spillTravelDelay);
		result.append(", riverOutletWorks: ");
		result.append(riverOutletWorks);
		result.append(", normalMinOperateLevel: ");
		result.append(normalMinOperateLevel);
		result.append(", spillwayCrestLevel: ");
		result.append(spillwayCrestLevel);
		result.append(", fullSupplyLevel: ");
		result.append(fullSupplyLevel);
		result.append(", spillwayCapacity: ");
		result.append(spillwayCapacity);
		result.append(", spillWayGateType: ");
		result.append(spillWayGateType);
		result.append(", spillwayCrestLength: ");
		result.append(spillwayCrestLength);
		result.append(", energyStorageRating: ");
		result.append(energyStorageRating);
		result.append(", grossCapacity: ");
		result.append(grossCapacity);
		result.append(')');
		return result.toString();
	}

} //ReservoirImpl
