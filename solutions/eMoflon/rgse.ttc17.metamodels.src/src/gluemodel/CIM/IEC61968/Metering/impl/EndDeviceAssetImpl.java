/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.EndDeviceModel;

import gluemodel.CIM.IEC61968.Assets.impl.AssetContainerImpl;

import gluemodel.CIM.IEC61968.Customers.Customer;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.ServiceLocation;

import gluemodel.CIM.IEC61968.Metering.DeviceFunction;
import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.EndDeviceControl;
import gluemodel.CIM.IEC61968.Metering.EndDeviceGroup;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.Reading;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

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
 * An implementation of the model object '<em><b>End Device Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isRelayCapable <em>Relay Capable</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isMetrology <em>Metrology</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getTimeZoneOffset <em>Time Zone Offset</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getEndDeviceModel <em>End Device Model</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isReadRequest <em>Read Request</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isDstEnabled <em>Dst Enabled</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getDeviceFunctions <em>Device Functions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isReverseFlowHandling <em>Reverse Flow Handling</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isDemandResponse <em>Demand Response</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getAmrSystem <em>Amr System</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isLoadControl <em>Load Control</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#isOutageReport <em>Outage Report</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.EndDeviceAssetImpl#getEndDeviceGroups <em>End Device Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceAssetImpl extends AssetContainerImpl implements EndDeviceAsset {
	/**
	 * The default value of the '{@link #isDisconnect() <em>Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisconnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisconnect() <em>Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisconnect()
	 * @generated
	 * @ordered
	 */
	protected boolean disconnect = DISCONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRelayCapable() <em>Relay Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelayCapable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELAY_CAPABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelayCapable() <em>Relay Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelayCapable()
	 * @generated
	 * @ordered
	 */
	protected boolean relayCapable = RELAY_CAPABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Reading> readings;

	/**
	 * The cached value of the '{@link #getServiceDeliveryPoint() <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 * @ordered
	 */
	protected ServiceDeliveryPoint serviceDeliveryPoint;

	/**
	 * The default value of the '{@link #isMetrology() <em>Metrology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetrology()
	 * @generated
	 * @ordered
	 */
	protected static final boolean METROLOGY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMetrology() <em>Metrology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetrology()
	 * @generated
	 * @ordered
	 */
	protected boolean metrology = METROLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratedCurrent = RATED_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeZoneOffset() <em>Time Zone Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_ZONE_OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeZoneOffset() <em>Time Zone Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneOffset()
	 * @generated
	 * @ordered
	 */
	protected float timeZoneOffset = TIME_ZONE_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceLocation() <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLocation()
	 * @generated
	 * @ordered
	 */
	protected ServiceLocation serviceLocation;

	/**
	 * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceControl> endDeviceControls;

	/**
	 * The cached value of the '{@link #getEndDeviceModel() <em>End Device Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceModel()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceModel endDeviceModel;

	/**
	 * The default value of the '{@link #isReadRequest() <em>Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadRequest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_REQUEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadRequest() <em>Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadRequest()
	 * @generated
	 * @ordered
	 */
	protected boolean readRequest = READ_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #isDstEnabled() <em>Dst Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDstEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DST_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDstEnabled() <em>Dst Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDstEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean dstEnabled = DST_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected int phaseCount = PHASE_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeviceFunctions() <em>Device Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceFunction> deviceFunctions;

	/**
	 * The default value of the '{@link #isReverseFlowHandling() <em>Reverse Flow Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverseFlowHandling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSE_FLOW_HANDLING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReverseFlowHandling() <em>Reverse Flow Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverseFlowHandling()
	 * @generated
	 * @ordered
	 */
	protected boolean reverseFlowHandling = REVERSE_FLOW_HANDLING_EDEFAULT;

	/**
	 * The default value of the '{@link #isDemandResponse() <em>Demand Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDemandResponse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEMAND_RESPONSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDemandResponse() <em>Demand Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDemandResponse()
	 * @generated
	 * @ordered
	 */
	protected boolean demandResponse = DEMAND_RESPONSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The default value of the '{@link #getAmrSystem() <em>Amr System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String AMR_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmrSystem() <em>Amr System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrSystem()
	 * @generated
	 * @ordered
	 */
	protected String amrSystem = AMR_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoadControl() <em>Load Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOAD_CONTROL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoadControl() <em>Load Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadControl()
	 * @generated
	 * @ordered
	 */
	protected boolean loadControl = LOAD_CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutageReport() <em>Outage Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutageReport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTAGE_REPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutageReport() <em>Outage Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutageReport()
	 * @generated
	 * @ordered
	 */
	protected boolean outageReport = OUTAGE_REPORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndDeviceGroups() <em>End Device Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceGroup> endDeviceGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisconnect() {
		return disconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisconnect(boolean newDisconnect) {
		boolean oldDisconnect = disconnect;
		disconnect = newDisconnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__DISCONNECT, oldDisconnect, disconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelayCapable() {
		return relayCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelayCapable(boolean newRelayCapable) {
		boolean oldRelayCapable = relayCapable;
		relayCapable = newRelayCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__RELAY_CAPABLE, oldRelayCapable, relayCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reading> getReadings() {
		if (readings == null) {
			readings = new EObjectWithInverseResolvingEList<Reading>(Reading.class, this, MeteringPackage.END_DEVICE_ASSET__READINGS, MeteringPackage.READING__END_DEVICE_ASSET);
		}
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint getServiceDeliveryPoint() {
		if (serviceDeliveryPoint != null && serviceDeliveryPoint.eIsProxy()) {
			InternalEObject oldServiceDeliveryPoint = (InternalEObject)serviceDeliveryPoint;
			serviceDeliveryPoint = (ServiceDeliveryPoint)eResolveProxy(oldServiceDeliveryPoint);
			if (serviceDeliveryPoint != oldServiceDeliveryPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, serviceDeliveryPoint));
			}
		}
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint basicGetServiceDeliveryPoint() {
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint, NotificationChain msgs) {
		ServiceDeliveryPoint oldServiceDeliveryPoint = serviceDeliveryPoint;
		serviceDeliveryPoint = newServiceDeliveryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, newServiceDeliveryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint) {
		if (newServiceDeliveryPoint != serviceDeliveryPoint) {
			NotificationChain msgs = null;
			if (serviceDeliveryPoint != null)
				msgs = ((InternalEObject)serviceDeliveryPoint).eInverseRemove(this, MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS, ServiceDeliveryPoint.class, msgs);
			if (newServiceDeliveryPoint != null)
				msgs = ((InternalEObject)newServiceDeliveryPoint).eInverseAdd(this, MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS, ServiceDeliveryPoint.class, msgs);
			msgs = basicSetServiceDeliveryPoint(newServiceDeliveryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT, newServiceDeliveryPoint, newServiceDeliveryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetrology() {
		return metrology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrology(boolean newMetrology) {
		boolean oldMetrology = metrology;
		metrology = newMetrology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__METROLOGY, oldMetrology, metrology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedVoltage() {
		return ratedVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedVoltage(float newRatedVoltage) {
		float oldRatedVoltage = ratedVoltage;
		ratedVoltage = newRatedVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedCurrent() {
		return ratedCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedCurrent(float newRatedCurrent) {
		float oldRatedCurrent = ratedCurrent;
		ratedCurrent = newRatedCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__RATED_CURRENT, oldRatedCurrent, ratedCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeZoneOffset() {
		return timeZoneOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeZoneOffset(float newTimeZoneOffset) {
		float oldTimeZoneOffset = timeZoneOffset;
		timeZoneOffset = newTimeZoneOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__TIME_ZONE_OFFSET, oldTimeZoneOffset, timeZoneOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation getServiceLocation() {
		if (serviceLocation != null && serviceLocation.eIsProxy()) {
			InternalEObject oldServiceLocation = (InternalEObject)serviceLocation;
			serviceLocation = (ServiceLocation)eResolveProxy(oldServiceLocation);
			if (serviceLocation != oldServiceLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION, oldServiceLocation, serviceLocation));
			}
		}
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation basicGetServiceLocation() {
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLocation(ServiceLocation newServiceLocation, NotificationChain msgs) {
		ServiceLocation oldServiceLocation = serviceLocation;
		serviceLocation = newServiceLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION, oldServiceLocation, newServiceLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLocation(ServiceLocation newServiceLocation) {
		if (newServiceLocation != serviceLocation) {
			NotificationChain msgs = null;
			if (serviceLocation != null)
				msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS, ServiceLocation.class, msgs);
			if (newServiceLocation != null)
				msgs = ((InternalEObject)newServiceLocation).eInverseAdd(this, CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS, ServiceLocation.class, msgs);
			msgs = basicSetServiceLocation(newServiceLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION, newServiceLocation, newServiceLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceControl> getEndDeviceControls() {
		if (endDeviceControls == null) {
			endDeviceControls = new EObjectWithInverseResolvingEList<EndDeviceControl>(EndDeviceControl.class, this, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS, MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_ASSET);
		}
		return endDeviceControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceModel getEndDeviceModel() {
		if (endDeviceModel != null && endDeviceModel.eIsProxy()) {
			InternalEObject oldEndDeviceModel = (InternalEObject)endDeviceModel;
			endDeviceModel = (EndDeviceModel)eResolveProxy(oldEndDeviceModel);
			if (endDeviceModel != oldEndDeviceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL, oldEndDeviceModel, endDeviceModel));
			}
		}
		return endDeviceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceModel basicGetEndDeviceModel() {
		return endDeviceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceModel(EndDeviceModel newEndDeviceModel, NotificationChain msgs) {
		EndDeviceModel oldEndDeviceModel = endDeviceModel;
		endDeviceModel = newEndDeviceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL, oldEndDeviceModel, newEndDeviceModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDeviceModel(EndDeviceModel newEndDeviceModel) {
		if (newEndDeviceModel != endDeviceModel) {
			NotificationChain msgs = null;
			if (endDeviceModel != null)
				msgs = ((InternalEObject)endDeviceModel).eInverseRemove(this, AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS, EndDeviceModel.class, msgs);
			if (newEndDeviceModel != null)
				msgs = ((InternalEObject)newEndDeviceModel).eInverseAdd(this, AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS, EndDeviceModel.class, msgs);
			msgs = basicSetEndDeviceModel(newEndDeviceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL, newEndDeviceModel, newEndDeviceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadRequest() {
		return readRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadRequest(boolean newReadRequest) {
		boolean oldReadRequest = readRequest;
		readRequest = newReadRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__READ_REQUEST, oldReadRequest, readRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDstEnabled() {
		return dstEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDstEnabled(boolean newDstEnabled) {
		boolean oldDstEnabled = dstEnabled;
		dstEnabled = newDstEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__DST_ENABLED, oldDstEnabled, dstEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhaseCount() {
		return phaseCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseCount(int newPhaseCount) {
		int oldPhaseCount = phaseCount;
		phaseCount = newPhaseCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__PHASE_COUNT, oldPhaseCount, phaseCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceFunction> getDeviceFunctions() {
		if (deviceFunctions == null) {
			deviceFunctions = new EObjectWithInverseResolvingEList<DeviceFunction>(DeviceFunction.class, this, MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS, MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET);
		}
		return deviceFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReverseFlowHandling() {
		return reverseFlowHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseFlowHandling(boolean newReverseFlowHandling) {
		boolean oldReverseFlowHandling = reverseFlowHandling;
		reverseFlowHandling = newReverseFlowHandling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__REVERSE_FLOW_HANDLING, oldReverseFlowHandling, reverseFlowHandling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDemandResponse() {
		return demandResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandResponse(boolean newDemandResponse) {
		boolean oldDemandResponse = demandResponse;
		demandResponse = newDemandResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__DEMAND_RESPONSE, oldDemandResponse, demandResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.END_DEVICE_ASSET__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, CustomersPackage.CUSTOMER__END_DEVICE_ASSETS, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, CustomersPackage.CUSTOMER__END_DEVICE_ASSETS, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmrSystem() {
		return amrSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmrSystem(String newAmrSystem) {
		String oldAmrSystem = amrSystem;
		amrSystem = newAmrSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__AMR_SYSTEM, oldAmrSystem, amrSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoadControl() {
		return loadControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadControl(boolean newLoadControl) {
		boolean oldLoadControl = loadControl;
		loadControl = newLoadControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__LOAD_CONTROL, oldLoadControl, loadControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutageReport() {
		return outageReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutageReport(boolean newOutageReport) {
		boolean oldOutageReport = outageReport;
		outageReport = newOutageReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.END_DEVICE_ASSET__OUTAGE_REPORT, oldOutageReport, outageReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceGroup> getEndDeviceGroups() {
		if (endDeviceGroups == null) {
			endDeviceGroups = new EObjectWithInverseResolvingEList.ManyInverse<EndDeviceGroup>(EndDeviceGroup.class, this, MeteringPackage.END_DEVICE_ASSET__END_DEVICE_GROUPS, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_ASSETS);
		}
		return endDeviceGroups;
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
			case MeteringPackage.END_DEVICE_ASSET__READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				if (serviceDeliveryPoint != null)
					msgs = ((InternalEObject)serviceDeliveryPoint).eInverseRemove(this, MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICE_ASSETS, ServiceDeliveryPoint.class, msgs);
				return basicSetServiceDeliveryPoint((ServiceDeliveryPoint)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION:
				if (serviceLocation != null)
					msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS, ServiceLocation.class, msgs);
				return basicSetServiceLocation((ServiceLocation)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceControls()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL:
				if (endDeviceModel != null)
					msgs = ((InternalEObject)endDeviceModel).eInverseRemove(this, AssetModelsPackage.END_DEVICE_MODEL__END_DEVICE_ASSETS, EndDeviceModel.class, msgs);
				return basicSetEndDeviceModel((EndDeviceModel)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeviceFunctions()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, CustomersPackage.CUSTOMER__END_DEVICE_ASSETS, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceGroups()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_ASSET__READINGS:
				return ((InternalEList<?>)getReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				return basicSetServiceDeliveryPoint(null, msgs);
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION:
				return basicSetServiceLocation(null, msgs);
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS:
				return ((InternalEList<?>)getEndDeviceControls()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL:
				return basicSetEndDeviceModel(null, msgs);
			case MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS:
				return ((InternalEList<?>)getDeviceFunctions()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_ASSET__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_GROUPS:
				return ((InternalEList<?>)getEndDeviceGroups()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_ASSET__DISCONNECT:
				return isDisconnect();
			case MeteringPackage.END_DEVICE_ASSET__RELAY_CAPABLE:
				return isRelayCapable();
			case MeteringPackage.END_DEVICE_ASSET__READINGS:
				return getReadings();
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				if (resolve) return getServiceDeliveryPoint();
				return basicGetServiceDeliveryPoint();
			case MeteringPackage.END_DEVICE_ASSET__METROLOGY:
				return isMetrology();
			case MeteringPackage.END_DEVICE_ASSET__RATED_VOLTAGE:
				return getRatedVoltage();
			case MeteringPackage.END_DEVICE_ASSET__RATED_CURRENT:
				return getRatedCurrent();
			case MeteringPackage.END_DEVICE_ASSET__TIME_ZONE_OFFSET:
				return getTimeZoneOffset();
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION:
				if (resolve) return getServiceLocation();
				return basicGetServiceLocation();
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS:
				return getEndDeviceControls();
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL:
				if (resolve) return getEndDeviceModel();
				return basicGetEndDeviceModel();
			case MeteringPackage.END_DEVICE_ASSET__READ_REQUEST:
				return isReadRequest();
			case MeteringPackage.END_DEVICE_ASSET__DST_ENABLED:
				return isDstEnabled();
			case MeteringPackage.END_DEVICE_ASSET__PHASE_COUNT:
				return getPhaseCount();
			case MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS:
				return getDeviceFunctions();
			case MeteringPackage.END_DEVICE_ASSET__REVERSE_FLOW_HANDLING:
				return isReverseFlowHandling();
			case MeteringPackage.END_DEVICE_ASSET__DEMAND_RESPONSE:
				return isDemandResponse();
			case MeteringPackage.END_DEVICE_ASSET__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case MeteringPackage.END_DEVICE_ASSET__AMR_SYSTEM:
				return getAmrSystem();
			case MeteringPackage.END_DEVICE_ASSET__LOAD_CONTROL:
				return isLoadControl();
			case MeteringPackage.END_DEVICE_ASSET__OUTAGE_REPORT:
				return isOutageReport();
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_GROUPS:
				return getEndDeviceGroups();
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
			case MeteringPackage.END_DEVICE_ASSET__DISCONNECT:
				setDisconnect((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__RELAY_CAPABLE:
				setRelayCapable((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__READINGS:
				getReadings().clear();
				getReadings().addAll((Collection<? extends Reading>)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__METROLOGY:
				setMetrology((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__TIME_ZONE_OFFSET:
				setTimeZoneOffset((Float)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				getEndDeviceControls().addAll((Collection<? extends EndDeviceControl>)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL:
				setEndDeviceModel((EndDeviceModel)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__READ_REQUEST:
				setReadRequest((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__DST_ENABLED:
				setDstEnabled((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__PHASE_COUNT:
				setPhaseCount((Integer)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS:
				getDeviceFunctions().clear();
				getDeviceFunctions().addAll((Collection<? extends DeviceFunction>)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__REVERSE_FLOW_HANDLING:
				setReverseFlowHandling((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__DEMAND_RESPONSE:
				setDemandResponse((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__AMR_SYSTEM:
				setAmrSystem((String)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__LOAD_CONTROL:
				setLoadControl((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__OUTAGE_REPORT:
				setOutageReport((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_GROUPS:
				getEndDeviceGroups().clear();
				getEndDeviceGroups().addAll((Collection<? extends EndDeviceGroup>)newValue);
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
			case MeteringPackage.END_DEVICE_ASSET__DISCONNECT:
				setDisconnect(DISCONNECT_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__RELAY_CAPABLE:
				setRelayCapable(RELAY_CAPABLE_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__READINGS:
				getReadings().clear();
				return;
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)null);
				return;
			case MeteringPackage.END_DEVICE_ASSET__METROLOGY:
				setMetrology(METROLOGY_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__RATED_VOLTAGE:
				setRatedVoltage(RATED_VOLTAGE_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__RATED_CURRENT:
				setRatedCurrent(RATED_CURRENT_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__TIME_ZONE_OFFSET:
				setTimeZoneOffset(TIME_ZONE_OFFSET_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)null);
				return;
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				return;
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL:
				setEndDeviceModel((EndDeviceModel)null);
				return;
			case MeteringPackage.END_DEVICE_ASSET__READ_REQUEST:
				setReadRequest(READ_REQUEST_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__DST_ENABLED:
				setDstEnabled(DST_ENABLED_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__PHASE_COUNT:
				setPhaseCount(PHASE_COUNT_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS:
				getDeviceFunctions().clear();
				return;
			case MeteringPackage.END_DEVICE_ASSET__REVERSE_FLOW_HANDLING:
				setReverseFlowHandling(REVERSE_FLOW_HANDLING_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__DEMAND_RESPONSE:
				setDemandResponse(DEMAND_RESPONSE_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case MeteringPackage.END_DEVICE_ASSET__AMR_SYSTEM:
				setAmrSystem(AMR_SYSTEM_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__LOAD_CONTROL:
				setLoadControl(LOAD_CONTROL_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__OUTAGE_REPORT:
				setOutageReport(OUTAGE_REPORT_EDEFAULT);
				return;
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_GROUPS:
				getEndDeviceGroups().clear();
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
			case MeteringPackage.END_DEVICE_ASSET__DISCONNECT:
				return disconnect != DISCONNECT_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__RELAY_CAPABLE:
				return relayCapable != RELAY_CAPABLE_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__READINGS:
				return readings != null && !readings.isEmpty();
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				return serviceDeliveryPoint != null;
			case MeteringPackage.END_DEVICE_ASSET__METROLOGY:
				return metrology != METROLOGY_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__RATED_VOLTAGE:
				return ratedVoltage != RATED_VOLTAGE_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__RATED_CURRENT:
				return ratedCurrent != RATED_CURRENT_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__TIME_ZONE_OFFSET:
				return timeZoneOffset != TIME_ZONE_OFFSET_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION:
				return serviceLocation != null;
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_CONTROLS:
				return endDeviceControls != null && !endDeviceControls.isEmpty();
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_MODEL:
				return endDeviceModel != null;
			case MeteringPackage.END_DEVICE_ASSET__READ_REQUEST:
				return readRequest != READ_REQUEST_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__DST_ENABLED:
				return dstEnabled != DST_ENABLED_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__PHASE_COUNT:
				return phaseCount != PHASE_COUNT_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS:
				return deviceFunctions != null && !deviceFunctions.isEmpty();
			case MeteringPackage.END_DEVICE_ASSET__REVERSE_FLOW_HANDLING:
				return reverseFlowHandling != REVERSE_FLOW_HANDLING_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__DEMAND_RESPONSE:
				return demandResponse != DEMAND_RESPONSE_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__CUSTOMER:
				return customer != null;
			case MeteringPackage.END_DEVICE_ASSET__AMR_SYSTEM:
				return AMR_SYSTEM_EDEFAULT == null ? amrSystem != null : !AMR_SYSTEM_EDEFAULT.equals(amrSystem);
			case MeteringPackage.END_DEVICE_ASSET__LOAD_CONTROL:
				return loadControl != LOAD_CONTROL_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__OUTAGE_REPORT:
				return outageReport != OUTAGE_REPORT_EDEFAULT;
			case MeteringPackage.END_DEVICE_ASSET__END_DEVICE_GROUPS:
				return endDeviceGroups != null && !endDeviceGroups.isEmpty();
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
		result.append(" (disconnect: ");
		result.append(disconnect);
		result.append(", relayCapable: ");
		result.append(relayCapable);
		result.append(", metrology: ");
		result.append(metrology);
		result.append(", ratedVoltage: ");
		result.append(ratedVoltage);
		result.append(", ratedCurrent: ");
		result.append(ratedCurrent);
		result.append(", timeZoneOffset: ");
		result.append(timeZoneOffset);
		result.append(", readRequest: ");
		result.append(readRequest);
		result.append(", dstEnabled: ");
		result.append(dstEnabled);
		result.append(", phaseCount: ");
		result.append(phaseCount);
		result.append(", reverseFlowHandling: ");
		result.append(reverseFlowHandling);
		result.append(", demandResponse: ");
		result.append(demandResponse);
		result.append(", amrSystem: ");
		result.append(amrSystem);
		result.append(", loadControl: ");
		result.append(loadControl);
		result.append(", outageReport: ");
		result.append(outageReport);
		result.append(')');
		return result.toString();
	}

} //EndDeviceAssetImpl
