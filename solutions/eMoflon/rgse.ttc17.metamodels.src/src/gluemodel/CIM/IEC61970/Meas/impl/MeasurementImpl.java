/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61968.Assets.Asset;
import gluemodel.CIM.IEC61968.Assets.AssetsPackage;

import gluemodel.CIM.IEC61968.Common.CommonPackage;
import gluemodel.CIM.IEC61968.Common.Document;
import gluemodel.CIM.IEC61968.Common.Location;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;
import gluemodel.CIM.IEC61970.Core.Terminal;
import gluemodel.CIM.IEC61970.Core.Unit;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.DynamicSchedule;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;

import gluemodel.CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.Pnode;
import gluemodel.CIM.IEC61970.Informative.MarketOperations.ViolationLimit;

import gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage;
import gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint;

import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.Measurement;

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
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getBy_TiePoint <em>By Tie Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getDynamicSchedules <em>Dynamic Schedules</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getViolationLimits <em>Violation Limits</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getPnode <em>Pnode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.MeasurementImpl#getFor_TiePoint <em>For Tie Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementImpl extends IdentifiedObjectImpl implements Measurement {
	/**
	 * The cached value of the '{@link #getBy_TiePoint() <em>By Tie Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBy_TiePoint()
	 * @generated
	 * @ordered
	 */
	protected TiePoint by_TiePoint;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The cached value of the '{@link #getDynamicSchedules() <em>Dynamic Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicSchedule> dynamicSchedules;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The cached value of the '{@link #getViolationLimits() <em>Violation Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<ViolationLimit> violationLimits;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

	/**
	 * The cached value of the '{@link #getPnode() <em>Pnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnode()
	 * @generated
	 * @ordered
	 */
	protected Pnode pnode;

	/**
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource powerSystemResource;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The default value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASUREMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementType()
	 * @generated
	 * @ordered
	 */
	protected String measurementType = MEASUREMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFor_TiePoint() <em>For Tie Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor_TiePoint()
	 * @generated
	 * @ordered
	 */
	protected TiePoint for_TiePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiePoint getBy_TiePoint() {
		if (by_TiePoint != null && by_TiePoint.eIsProxy()) {
			InternalEObject oldBy_TiePoint = (InternalEObject)by_TiePoint;
			by_TiePoint = (TiePoint)eResolveProxy(oldBy_TiePoint);
			if (by_TiePoint != oldBy_TiePoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__BY_TIE_POINT, oldBy_TiePoint, by_TiePoint));
			}
		}
		return by_TiePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiePoint basicGetBy_TiePoint() {
		return by_TiePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBy_TiePoint(TiePoint newBy_TiePoint, NotificationChain msgs) {
		TiePoint oldBy_TiePoint = by_TiePoint;
		by_TiePoint = newBy_TiePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__BY_TIE_POINT, oldBy_TiePoint, newBy_TiePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBy_TiePoint(TiePoint newBy_TiePoint) {
		if (newBy_TiePoint != by_TiePoint) {
			NotificationChain msgs = null;
			if (by_TiePoint != null)
				msgs = ((InternalEObject)by_TiePoint).eInverseRemove(this, ReservationPackage.TIE_POINT__BY_MEASUREMENTS, TiePoint.class, msgs);
			if (newBy_TiePoint != null)
				msgs = ((InternalEObject)newBy_TiePoint).eInverseAdd(this, ReservationPackage.TIE_POINT__BY_MEASUREMENTS, TiePoint.class, msgs);
			msgs = basicSetBy_TiePoint(newBy_TiePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__BY_TIE_POINT, newBy_TiePoint, newBy_TiePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__TERMINAL, oldTerminal, terminal));
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__TERMINAL, oldTerminal, newTerminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__TERMINAL, newTerminal, newTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicSchedule> getDynamicSchedules() {
		if (dynamicSchedules == null) {
			dynamicSchedules = new EObjectWithInverseResolvingEList<DynamicSchedule>(DynamicSchedule.class, this, MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES, EnergySchedulingPackage.DYNAMIC_SCHEDULE__MEASUREMENT);
		}
		return dynamicSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectWithInverseResolvingEList.ManyInverse<Location>(Location.class, this, MeasPackage.MEASUREMENT__LOCATIONS, CommonPackage.LOCATION__MEASUREMENTS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__ASSET, oldAsset, asset));
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__ASSET, oldAsset, newAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__MEASUREMENTS, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, AssetsPackage.ASSET__MEASUREMENTS, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__ASSET, newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViolationLimit> getViolationLimits() {
		if (violationLimits == null) {
			violationLimits = new EObjectWithInverseResolvingEList<ViolationLimit>(ViolationLimit.class, this, MeasPackage.MEASUREMENT__VIOLATION_LIMITS, MarketOperationsPackage.VIOLATION_LIMIT__MEASUREMENT);
		}
		return violationLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectWithInverseResolvingEList.ManyInverse<Document>(Document.class, this, MeasPackage.MEASUREMENT__DOCUMENTS, CommonPackage.DOCUMENT__MEASUREMENTS);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode getPnode() {
		if (pnode != null && pnode.eIsProxy()) {
			InternalEObject oldPnode = (InternalEObject)pnode;
			pnode = (Pnode)eResolveProxy(oldPnode);
			if (pnode != oldPnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__PNODE, oldPnode, pnode));
			}
		}
		return pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pnode basicGetPnode() {
		return pnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPnode(Pnode newPnode, NotificationChain msgs) {
		Pnode oldPnode = pnode;
		pnode = newPnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__PNODE, oldPnode, newPnode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPnode(Pnode newPnode) {
		if (newPnode != pnode) {
			NotificationChain msgs = null;
			if (pnode != null)
				msgs = ((InternalEObject)pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__MEASUREMENTS, Pnode.class, msgs);
			if (newPnode != null)
				msgs = ((InternalEObject)newPnode).eInverseAdd(this, MarketOperationsPackage.PNODE__MEASUREMENTS, Pnode.class, msgs);
			msgs = basicSetPnode(newPnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__PNODE, newPnode, newPnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource getPowerSystemResource() {
		if (powerSystemResource != null && powerSystemResource.eIsProxy()) {
			InternalEObject oldPowerSystemResource = (InternalEObject)powerSystemResource;
			powerSystemResource = (PowerSystemResource)eResolveProxy(oldPowerSystemResource);
			if (powerSystemResource != oldPowerSystemResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, powerSystemResource));
			}
		}
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetPowerSystemResource() {
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSystemResource(PowerSystemResource newPowerSystemResource, NotificationChain msgs) {
		PowerSystemResource oldPowerSystemResource = powerSystemResource;
		powerSystemResource = newPowerSystemResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSystemResource(PowerSystemResource newPowerSystemResource) {
		if (newPowerSystemResource != powerSystemResource) {
			NotificationChain msgs = null;
			if (powerSystemResource != null)
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE, newPowerSystemResource, newPowerSystemResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, CorePackage.UNIT__MEASUREMENTS, Unit.class, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, CorePackage.UNIT__MEASUREMENTS, Unit.class, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasurementType() {
		return measurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementType(String newMeasurementType) {
		String oldMeasurementType = measurementType;
		measurementType = newMeasurementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__MEASUREMENT_TYPE, oldMeasurementType, measurementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiePoint getFor_TiePoint() {
		if (for_TiePoint != null && for_TiePoint.eIsProxy()) {
			InternalEObject oldFor_TiePoint = (InternalEObject)for_TiePoint;
			for_TiePoint = (TiePoint)eResolveProxy(oldFor_TiePoint);
			if (for_TiePoint != oldFor_TiePoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.MEASUREMENT__FOR_TIE_POINT, oldFor_TiePoint, for_TiePoint));
			}
		}
		return for_TiePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiePoint basicGetFor_TiePoint() {
		return for_TiePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor_TiePoint(TiePoint newFor_TiePoint, NotificationChain msgs) {
		TiePoint oldFor_TiePoint = for_TiePoint;
		for_TiePoint = newFor_TiePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__FOR_TIE_POINT, oldFor_TiePoint, newFor_TiePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor_TiePoint(TiePoint newFor_TiePoint) {
		if (newFor_TiePoint != for_TiePoint) {
			NotificationChain msgs = null;
			if (for_TiePoint != null)
				msgs = ((InternalEObject)for_TiePoint).eInverseRemove(this, ReservationPackage.TIE_POINT__FOR_MEASUREMENTS, TiePoint.class, msgs);
			if (newFor_TiePoint != null)
				msgs = ((InternalEObject)newFor_TiePoint).eInverseAdd(this, ReservationPackage.TIE_POINT__FOR_MEASUREMENTS, TiePoint.class, msgs);
			msgs = basicSetFor_TiePoint(newFor_TiePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.MEASUREMENT__FOR_TIE_POINT, newFor_TiePoint, newFor_TiePoint));
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
			case MeasPackage.MEASUREMENT__BY_TIE_POINT:
				if (by_TiePoint != null)
					msgs = ((InternalEObject)by_TiePoint).eInverseRemove(this, ReservationPackage.TIE_POINT__BY_MEASUREMENTS, TiePoint.class, msgs);
				return basicSetBy_TiePoint((TiePoint)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDynamicSchedules()).basicAdd(otherEnd, msgs);
			case MeasPackage.MEASUREMENT__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case MeasPackage.MEASUREMENT__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__MEASUREMENTS, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__VIOLATION_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViolationLimits()).basicAdd(otherEnd, msgs);
			case MeasPackage.MEASUREMENT__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
			case MeasPackage.MEASUREMENT__PNODE:
				if (pnode != null)
					msgs = ((InternalEObject)pnode).eInverseRemove(this, MarketOperationsPackage.PNODE__MEASUREMENTS, Pnode.class, msgs);
				return basicSetPnode((Pnode)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__UNIT:
				if (unit != null)
					msgs = ((InternalEObject)unit).eInverseRemove(this, CorePackage.UNIT__MEASUREMENTS, Unit.class, msgs);
				return basicSetUnit((Unit)otherEnd, msgs);
			case MeasPackage.MEASUREMENT__FOR_TIE_POINT:
				if (for_TiePoint != null)
					msgs = ((InternalEObject)for_TiePoint).eInverseRemove(this, ReservationPackage.TIE_POINT__FOR_MEASUREMENTS, TiePoint.class, msgs);
				return basicSetFor_TiePoint((TiePoint)otherEnd, msgs);
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
			case MeasPackage.MEASUREMENT__BY_TIE_POINT:
				return basicSetBy_TiePoint(null, msgs);
			case MeasPackage.MEASUREMENT__TERMINAL:
				return basicSetTerminal(null, msgs);
			case MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES:
				return ((InternalEList<?>)getDynamicSchedules()).basicRemove(otherEnd, msgs);
			case MeasPackage.MEASUREMENT__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case MeasPackage.MEASUREMENT__ASSET:
				return basicSetAsset(null, msgs);
			case MeasPackage.MEASUREMENT__VIOLATION_LIMITS:
				return ((InternalEList<?>)getViolationLimits()).basicRemove(otherEnd, msgs);
			case MeasPackage.MEASUREMENT__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
			case MeasPackage.MEASUREMENT__PNODE:
				return basicSetPnode(null, msgs);
			case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
			case MeasPackage.MEASUREMENT__UNIT:
				return basicSetUnit(null, msgs);
			case MeasPackage.MEASUREMENT__FOR_TIE_POINT:
				return basicSetFor_TiePoint(null, msgs);
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
			case MeasPackage.MEASUREMENT__BY_TIE_POINT:
				if (resolve) return getBy_TiePoint();
				return basicGetBy_TiePoint();
			case MeasPackage.MEASUREMENT__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES:
				return getDynamicSchedules();
			case MeasPackage.MEASUREMENT__LOCATIONS:
				return getLocations();
			case MeasPackage.MEASUREMENT__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case MeasPackage.MEASUREMENT__VIOLATION_LIMITS:
				return getViolationLimits();
			case MeasPackage.MEASUREMENT__DOCUMENTS:
				return getDocuments();
			case MeasPackage.MEASUREMENT__PNODE:
				if (resolve) return getPnode();
				return basicGetPnode();
			case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
			case MeasPackage.MEASUREMENT__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				return getMeasurementType();
			case MeasPackage.MEASUREMENT__FOR_TIE_POINT:
				if (resolve) return getFor_TiePoint();
				return basicGetFor_TiePoint();
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
			case MeasPackage.MEASUREMENT__BY_TIE_POINT:
				setBy_TiePoint((TiePoint)newValue);
				return;
			case MeasPackage.MEASUREMENT__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES:
				getDynamicSchedules().clear();
				getDynamicSchedules().addAll((Collection<? extends DynamicSchedule>)newValue);
				return;
			case MeasPackage.MEASUREMENT__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case MeasPackage.MEASUREMENT__ASSET:
				setAsset((Asset)newValue);
				return;
			case MeasPackage.MEASUREMENT__VIOLATION_LIMITS:
				getViolationLimits().clear();
				getViolationLimits().addAll((Collection<? extends ViolationLimit>)newValue);
				return;
			case MeasPackage.MEASUREMENT__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
				return;
			case MeasPackage.MEASUREMENT__PNODE:
				setPnode((Pnode)newValue);
				return;
			case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
				return;
			case MeasPackage.MEASUREMENT__UNIT:
				setUnit((Unit)newValue);
				return;
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				setMeasurementType((String)newValue);
				return;
			case MeasPackage.MEASUREMENT__FOR_TIE_POINT:
				setFor_TiePoint((TiePoint)newValue);
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
			case MeasPackage.MEASUREMENT__BY_TIE_POINT:
				setBy_TiePoint((TiePoint)null);
				return;
			case MeasPackage.MEASUREMENT__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES:
				getDynamicSchedules().clear();
				return;
			case MeasPackage.MEASUREMENT__LOCATIONS:
				getLocations().clear();
				return;
			case MeasPackage.MEASUREMENT__ASSET:
				setAsset((Asset)null);
				return;
			case MeasPackage.MEASUREMENT__VIOLATION_LIMITS:
				getViolationLimits().clear();
				return;
			case MeasPackage.MEASUREMENT__DOCUMENTS:
				getDocuments().clear();
				return;
			case MeasPackage.MEASUREMENT__PNODE:
				setPnode((Pnode)null);
				return;
			case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
				return;
			case MeasPackage.MEASUREMENT__UNIT:
				setUnit((Unit)null);
				return;
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				setMeasurementType(MEASUREMENT_TYPE_EDEFAULT);
				return;
			case MeasPackage.MEASUREMENT__FOR_TIE_POINT:
				setFor_TiePoint((TiePoint)null);
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
			case MeasPackage.MEASUREMENT__BY_TIE_POINT:
				return by_TiePoint != null;
			case MeasPackage.MEASUREMENT__TERMINAL:
				return terminal != null;
			case MeasPackage.MEASUREMENT__DYNAMIC_SCHEDULES:
				return dynamicSchedules != null && !dynamicSchedules.isEmpty();
			case MeasPackage.MEASUREMENT__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case MeasPackage.MEASUREMENT__ASSET:
				return asset != null;
			case MeasPackage.MEASUREMENT__VIOLATION_LIMITS:
				return violationLimits != null && !violationLimits.isEmpty();
			case MeasPackage.MEASUREMENT__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case MeasPackage.MEASUREMENT__PNODE:
				return pnode != null;
			case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
			case MeasPackage.MEASUREMENT__UNIT:
				return unit != null;
			case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
				return MEASUREMENT_TYPE_EDEFAULT == null ? measurementType != null : !MEASUREMENT_TYPE_EDEFAULT.equals(measurementType);
			case MeasPackage.MEASUREMENT__FOR_TIE_POINT:
				return for_TiePoint != null;
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
		result.append(" (measurementType: ");
		result.append(measurementType);
		result.append(')');
		return result.toString();
	}

} //MeasurementImpl
