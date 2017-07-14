/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleInfo;
import gluemodel.CIM.IEC61970.Informative.InfAssets.VehicleUsageKind;

import gluemodel.CIM.IEC61970.Informative.InfWork.Crew;
import gluemodel.CIM.IEC61970.Informative.InfWork.InfWorkPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.VehicleInfoImpl#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.VehicleInfoImpl#getOdometerReadDateTime <em>Odometer Read Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.VehicleInfoImpl#getCrew <em>Crew</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.VehicleInfoImpl#getOdometerReading <em>Odometer Reading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleInfoImpl extends AssetInfoImpl implements VehicleInfo {
	/**
	 * The default value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageKind()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleUsageKind USAGE_KIND_EDEFAULT = VehicleUsageKind.CREW;

	/**
	 * The cached value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageKind()
	 * @generated
	 * @ordered
	 */
	protected VehicleUsageKind usageKind = USAGE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOdometerReadDateTime() <em>Odometer Read Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometerReadDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ODOMETER_READ_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOdometerReadDateTime() <em>Odometer Read Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometerReadDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date odometerReadDateTime = ODOMETER_READ_DATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * The default value of the '{@link #getOdometerReading() <em>Odometer Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometerReading()
	 * @generated
	 * @ordered
	 */
	protected static final float ODOMETER_READING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOdometerReading() <em>Odometer Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometerReading()
	 * @generated
	 * @ordered
	 */
	protected float odometerReading = ODOMETER_READING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getVehicleInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleUsageKind getUsageKind() {
		return usageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageKind(VehicleUsageKind newUsageKind) {
		VehicleUsageKind oldUsageKind = usageKind;
		usageKind = newUsageKind == null ? USAGE_KIND_EDEFAULT : newUsageKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.VEHICLE_INFO__USAGE_KIND, oldUsageKind, usageKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOdometerReadDateTime() {
		return odometerReadDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOdometerReadDateTime(Date newOdometerReadDateTime) {
		Date oldOdometerReadDateTime = odometerReadDateTime;
		odometerReadDateTime = newOdometerReadDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.VEHICLE_INFO__ODOMETER_READ_DATE_TIME, oldOdometerReadDateTime, odometerReadDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew getCrew() {
		if (crew != null && crew.eIsProxy()) {
			InternalEObject oldCrew = (InternalEObject)crew;
			crew = (Crew)eResolveProxy(oldCrew);
			if (crew != oldCrew) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.VEHICLE_INFO__CREW, oldCrew, crew));
			}
		}
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew basicGetCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.VEHICLE_INFO__CREW, oldCrew, newCrew);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__VEHICLES, Crew.class, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, InfWorkPackage.CREW__VEHICLES, Crew.class, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.VEHICLE_INFO__CREW, newCrew, newCrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOdometerReading() {
		return odometerReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOdometerReading(float newOdometerReading) {
		float oldOdometerReading = odometerReading;
		odometerReading = newOdometerReading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.VEHICLE_INFO__ODOMETER_READING, oldOdometerReading, odometerReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.VEHICLE_INFO__CREW:
				if (crew != null)
					msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__VEHICLES, Crew.class, msgs);
				return basicSetCrew((Crew)otherEnd, msgs);
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
			case InfAssetsPackage.VEHICLE_INFO__CREW:
				return basicSetCrew(null, msgs);
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
			case InfAssetsPackage.VEHICLE_INFO__USAGE_KIND:
				return getUsageKind();
			case InfAssetsPackage.VEHICLE_INFO__ODOMETER_READ_DATE_TIME:
				return getOdometerReadDateTime();
			case InfAssetsPackage.VEHICLE_INFO__CREW:
				if (resolve) return getCrew();
				return basicGetCrew();
			case InfAssetsPackage.VEHICLE_INFO__ODOMETER_READING:
				return getOdometerReading();
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
			case InfAssetsPackage.VEHICLE_INFO__USAGE_KIND:
				setUsageKind((VehicleUsageKind)newValue);
				return;
			case InfAssetsPackage.VEHICLE_INFO__ODOMETER_READ_DATE_TIME:
				setOdometerReadDateTime((Date)newValue);
				return;
			case InfAssetsPackage.VEHICLE_INFO__CREW:
				setCrew((Crew)newValue);
				return;
			case InfAssetsPackage.VEHICLE_INFO__ODOMETER_READING:
				setOdometerReading((Float)newValue);
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
			case InfAssetsPackage.VEHICLE_INFO__USAGE_KIND:
				setUsageKind(USAGE_KIND_EDEFAULT);
				return;
			case InfAssetsPackage.VEHICLE_INFO__ODOMETER_READ_DATE_TIME:
				setOdometerReadDateTime(ODOMETER_READ_DATE_TIME_EDEFAULT);
				return;
			case InfAssetsPackage.VEHICLE_INFO__CREW:
				setCrew((Crew)null);
				return;
			case InfAssetsPackage.VEHICLE_INFO__ODOMETER_READING:
				setOdometerReading(ODOMETER_READING_EDEFAULT);
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
			case InfAssetsPackage.VEHICLE_INFO__USAGE_KIND:
				return usageKind != USAGE_KIND_EDEFAULT;
			case InfAssetsPackage.VEHICLE_INFO__ODOMETER_READ_DATE_TIME:
				return ODOMETER_READ_DATE_TIME_EDEFAULT == null ? odometerReadDateTime != null : !ODOMETER_READ_DATE_TIME_EDEFAULT.equals(odometerReadDateTime);
			case InfAssetsPackage.VEHICLE_INFO__CREW:
				return crew != null;
			case InfAssetsPackage.VEHICLE_INFO__ODOMETER_READING:
				return odometerReading != ODOMETER_READING_EDEFAULT;
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
		result.append(" (usageKind: ");
		result.append(usageKind);
		result.append(", odometerReadDateTime: ");
		result.append(odometerReadDateTime);
		result.append(", odometerReading: ");
		result.append(odometerReading);
		result.append(')');
		return result.toString();
	}

} //VehicleInfoImpl
