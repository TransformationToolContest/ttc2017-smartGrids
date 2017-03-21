/**
 */
package COSEM.impl;

import COSEM.COSEMObjects.AutoConnectObject;
import COSEM.COSEMObjects.BillingPeriodValues;
import COSEM.COSEMObjects.CurrentAssociation;
import COSEM.COSEMObjects.CurrentlyActiveTariff;
import COSEM.COSEMObjects.ElectricityHarmonics;
import COSEM.COSEMObjects.ElectricityID;
import COSEM.COSEMObjects.ElectricityNominalValues;
import COSEM.COSEMObjects.ElectricityProgramEntries;
import COSEM.COSEMObjects.ElectricityRelatedStatusData;
import COSEM.COSEMObjects.ElectricityValues;
import COSEM.COSEMObjects.ExtendedPhaseAngleMeasurement;
import COSEM.COSEMObjects.InputPulseValuesOrConstants;
import COSEM.COSEMObjects.MeasurementMethods;
import COSEM.COSEMObjects.MeasurementPeriod_recordingInterval_billingPeriodDuration;
import COSEM.COSEMObjects.MeasurementValues;
import COSEM.COSEMObjects.MeteringPointID;
import COSEM.COSEMObjects.OutputPulseValues_constants;
import COSEM.COSEMObjects.ReadingFactorAndCT_VTratio;
import COSEM.COSEMObjects.RegisterMonitorObject;
import COSEM.COSEMObjects.TimeEntries;
import COSEM.COSEMObjects.TransformerAndLineLosses;

import COSEM.COSEMPackage;
import COSEM.LogicalDevice;
import COSEM.ManagementLogicalDevice;
import COSEM.PhysicalDevice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getManagementLogicalDevice <em>Management Logical Device</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getID <em>ID</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getLogicalDevice <em>Logical Device</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getElectricityRelatedStatus <em>Electricity Related Status</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getAA <em>AA</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getAutoConnect <em>Auto Connect</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getBillingPeriodValues <em>Billing Period Values</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getElectricityID <em>Electricity ID</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getProgramEntries <em>Program Entries</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getOutputPulse <em>Output Pulse</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getReadingFactor <em>Reading Factor</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getNominalValues <em>Nominal Values</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getInputPulse <em>Input Pulse</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getMeasurementPeriod <em>Measurement Period</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getTimeEntries <em>Time Entries</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getTransformerLineLosses <em>Transformer Line Losses</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getMeasurementAlgorithm <em>Measurement Algorithm</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getMeteringPoint <em>Metering Point</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getRegisterMonitor <em>Register Monitor</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getElectricityValues <em>Electricity Values</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getMeasurementValueTypes <em>Measurement Value Types</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getHarmonics <em>Harmonics</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link COSEM.impl.PhysicalDeviceImpl#getPhaseangles <em>Phaseangles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalDeviceImpl extends MinimalEObjectImpl.Container implements PhysicalDevice {
	/**
	 * The cached value of the '{@link #getManagementLogicalDevice() <em>Management Logical Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementLogicalDevice()
	 * @generated
	 * @ordered
	 */
	protected ManagementLogicalDevice managementLogicalDevice;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalDevice() <em>Logical Device</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalDevice> logicalDevice;

	/**
	 * The cached value of the '{@link #getElectricityRelatedStatus() <em>Electricity Related Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricityRelatedStatus()
	 * @generated
	 * @ordered
	 */
	protected ElectricityRelatedStatusData electricityRelatedStatus;

	/**
	 * The cached value of the '{@link #getAA() <em>AA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAA()
	 * @generated
	 * @ordered
	 */
	protected CurrentAssociation aa;

	/**
	 * The cached value of the '{@link #getAutoConnect() <em>Auto Connect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoConnect()
	 * @generated
	 * @ordered
	 */
	protected AutoConnectObject autoConnect;

	/**
	 * The cached value of the '{@link #getBillingPeriodValues() <em>Billing Period Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingPeriodValues()
	 * @generated
	 * @ordered
	 */
	protected BillingPeriodValues billingPeriodValues;

	/**
	 * The cached value of the '{@link #getElectricityID() <em>Electricity ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricityID()
	 * @generated
	 * @ordered
	 */
	protected ElectricityID electricityID;

	/**
	 * The cached value of the '{@link #getProgramEntries() <em>Program Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramEntries()
	 * @generated
	 * @ordered
	 */
	protected ElectricityProgramEntries programEntries;

	/**
	 * The cached value of the '{@link #getOutputPulse() <em>Output Pulse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPulse()
	 * @generated
	 * @ordered
	 */
	protected OutputPulseValues_constants outputPulse;

	/**
	 * The cached value of the '{@link #getReadingFactor() <em>Reading Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingFactor()
	 * @generated
	 * @ordered
	 */
	protected ReadingFactorAndCT_VTratio readingFactor;

	/**
	 * The cached value of the '{@link #getNominalValues() <em>Nominal Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalValues()
	 * @generated
	 * @ordered
	 */
	protected ElectricityNominalValues nominalValues;

	/**
	 * The cached value of the '{@link #getInputPulse() <em>Input Pulse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPulse()
	 * @generated
	 * @ordered
	 */
	protected InputPulseValuesOrConstants inputPulse;

	/**
	 * The cached value of the '{@link #getMeasurementPeriod() <em>Measurement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPeriod()
	 * @generated
	 * @ordered
	 */
	protected MeasurementPeriod_recordingInterval_billingPeriodDuration measurementPeriod;

	/**
	 * The cached value of the '{@link #getTimeEntries() <em>Time Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEntries()
	 * @generated
	 * @ordered
	 */
	protected TimeEntries timeEntries;

	/**
	 * The cached value of the '{@link #getTransformerLineLosses() <em>Transformer Line Losses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerLineLosses()
	 * @generated
	 * @ordered
	 */
	protected TransformerAndLineLosses transformerLineLosses;

	/**
	 * The cached value of the '{@link #getMeasurementAlgorithm() <em>Measurement Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected MeasurementMethods measurementAlgorithm;

	/**
	 * The cached value of the '{@link #getMeteringPoint() <em>Metering Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeteringPoint()
	 * @generated
	 * @ordered
	 */
	protected MeteringPointID meteringPoint;

	/**
	 * The cached value of the '{@link #getRegisterMonitor() <em>Register Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterMonitor()
	 * @generated
	 * @ordered
	 */
	protected RegisterMonitorObject registerMonitor;

	/**
	 * The cached value of the '{@link #getElectricityValues() <em>Electricity Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricityValues()
	 * @generated
	 * @ordered
	 */
	protected ElectricityValues electricityValues;

	/**
	 * The cached value of the '{@link #getMeasurementValueTypes() <em>Measurement Value Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValueTypes()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValues measurementValueTypes;

	/**
	 * The cached value of the '{@link #getHarmonics() <em>Harmonics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarmonics()
	 * @generated
	 * @ordered
	 */
	protected ElectricityHarmonics harmonics;

	/**
	 * The cached value of the '{@link #getTariffs() <em>Tariffs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffs()
	 * @generated
	 * @ordered
	 */
	protected CurrentlyActiveTariff tariffs;

	/**
	 * The cached value of the '{@link #getPhaseangles() <em>Phaseangles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseangles()
	 * @generated
	 * @ordered
	 */
	protected ExtendedPhaseAngleMeasurement phaseangles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMPackage.Literals.PHYSICAL_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementLogicalDevice getManagementLogicalDevice() {
		if (managementLogicalDevice != null && managementLogicalDevice.eIsProxy()) {
			InternalEObject oldManagementLogicalDevice = (InternalEObject)managementLogicalDevice;
			managementLogicalDevice = (ManagementLogicalDevice)eResolveProxy(oldManagementLogicalDevice);
			if (managementLogicalDevice != oldManagementLogicalDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, COSEMPackage.PHYSICAL_DEVICE__MANAGEMENT_LOGICAL_DEVICE, oldManagementLogicalDevice, managementLogicalDevice));
			}
		}
		return managementLogicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementLogicalDevice basicGetManagementLogicalDevice() {
		return managementLogicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementLogicalDevice(ManagementLogicalDevice newManagementLogicalDevice) {
		ManagementLogicalDevice oldManagementLogicalDevice = managementLogicalDevice;
		managementLogicalDevice = newManagementLogicalDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__MANAGEMENT_LOGICAL_DEVICE, oldManagementLogicalDevice, managementLogicalDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalDevice> getLogicalDevice() {
		if (logicalDevice == null) {
			logicalDevice = new EObjectResolvingEList<LogicalDevice>(LogicalDevice.class, this, COSEMPackage.PHYSICAL_DEVICE__LOGICAL_DEVICE);
		}
		return logicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityRelatedStatusData getElectricityRelatedStatus() {
		return electricityRelatedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectricityRelatedStatus(ElectricityRelatedStatusData newElectricityRelatedStatus, NotificationChain msgs) {
		ElectricityRelatedStatusData oldElectricityRelatedStatus = electricityRelatedStatus;
		electricityRelatedStatus = newElectricityRelatedStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS, oldElectricityRelatedStatus, newElectricityRelatedStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricityRelatedStatus(ElectricityRelatedStatusData newElectricityRelatedStatus) {
		if (newElectricityRelatedStatus != electricityRelatedStatus) {
			NotificationChain msgs = null;
			if (electricityRelatedStatus != null)
				msgs = ((InternalEObject)electricityRelatedStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS, null, msgs);
			if (newElectricityRelatedStatus != null)
				msgs = ((InternalEObject)newElectricityRelatedStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS, null, msgs);
			msgs = basicSetElectricityRelatedStatus(newElectricityRelatedStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS, newElectricityRelatedStatus, newElectricityRelatedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentAssociation getAA() {
		return aa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAA(CurrentAssociation newAA, NotificationChain msgs) {
		CurrentAssociation oldAA = aa;
		aa = newAA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__AA, oldAA, newAA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAA(CurrentAssociation newAA) {
		if (newAA != aa) {
			NotificationChain msgs = null;
			if (aa != null)
				msgs = ((InternalEObject)aa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__AA, null, msgs);
			if (newAA != null)
				msgs = ((InternalEObject)newAA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__AA, null, msgs);
			msgs = basicSetAA(newAA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__AA, newAA, newAA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoConnectObject getAutoConnect() {
		return autoConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoConnect(AutoConnectObject newAutoConnect, NotificationChain msgs) {
		AutoConnectObject oldAutoConnect = autoConnect;
		autoConnect = newAutoConnect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT, oldAutoConnect, newAutoConnect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoConnect(AutoConnectObject newAutoConnect) {
		if (newAutoConnect != autoConnect) {
			NotificationChain msgs = null;
			if (autoConnect != null)
				msgs = ((InternalEObject)autoConnect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT, null, msgs);
			if (newAutoConnect != null)
				msgs = ((InternalEObject)newAutoConnect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT, null, msgs);
			msgs = basicSetAutoConnect(newAutoConnect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT, newAutoConnect, newAutoConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingPeriodValues getBillingPeriodValues() {
		return billingPeriodValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillingPeriodValues(BillingPeriodValues newBillingPeriodValues, NotificationChain msgs) {
		BillingPeriodValues oldBillingPeriodValues = billingPeriodValues;
		billingPeriodValues = newBillingPeriodValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES, oldBillingPeriodValues, newBillingPeriodValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingPeriodValues(BillingPeriodValues newBillingPeriodValues) {
		if (newBillingPeriodValues != billingPeriodValues) {
			NotificationChain msgs = null;
			if (billingPeriodValues != null)
				msgs = ((InternalEObject)billingPeriodValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES, null, msgs);
			if (newBillingPeriodValues != null)
				msgs = ((InternalEObject)newBillingPeriodValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES, null, msgs);
			msgs = basicSetBillingPeriodValues(newBillingPeriodValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES, newBillingPeriodValues, newBillingPeriodValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityID getElectricityID() {
		return electricityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectricityID(ElectricityID newElectricityID, NotificationChain msgs) {
		ElectricityID oldElectricityID = electricityID;
		electricityID = newElectricityID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID, oldElectricityID, newElectricityID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricityID(ElectricityID newElectricityID) {
		if (newElectricityID != electricityID) {
			NotificationChain msgs = null;
			if (electricityID != null)
				msgs = ((InternalEObject)electricityID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID, null, msgs);
			if (newElectricityID != null)
				msgs = ((InternalEObject)newElectricityID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID, null, msgs);
			msgs = basicSetElectricityID(newElectricityID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID, newElectricityID, newElectricityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityProgramEntries getProgramEntries() {
		return programEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramEntries(ElectricityProgramEntries newProgramEntries, NotificationChain msgs) {
		ElectricityProgramEntries oldProgramEntries = programEntries;
		programEntries = newProgramEntries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES, oldProgramEntries, newProgramEntries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramEntries(ElectricityProgramEntries newProgramEntries) {
		if (newProgramEntries != programEntries) {
			NotificationChain msgs = null;
			if (programEntries != null)
				msgs = ((InternalEObject)programEntries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES, null, msgs);
			if (newProgramEntries != null)
				msgs = ((InternalEObject)newProgramEntries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES, null, msgs);
			msgs = basicSetProgramEntries(newProgramEntries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES, newProgramEntries, newProgramEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPulseValues_constants getOutputPulse() {
		return outputPulse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputPulse(OutputPulseValues_constants newOutputPulse, NotificationChain msgs) {
		OutputPulseValues_constants oldOutputPulse = outputPulse;
		outputPulse = newOutputPulse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE, oldOutputPulse, newOutputPulse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPulse(OutputPulseValues_constants newOutputPulse) {
		if (newOutputPulse != outputPulse) {
			NotificationChain msgs = null;
			if (outputPulse != null)
				msgs = ((InternalEObject)outputPulse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE, null, msgs);
			if (newOutputPulse != null)
				msgs = ((InternalEObject)newOutputPulse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE, null, msgs);
			msgs = basicSetOutputPulse(newOutputPulse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE, newOutputPulse, newOutputPulse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingFactorAndCT_VTratio getReadingFactor() {
		return readingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadingFactor(ReadingFactorAndCT_VTratio newReadingFactor, NotificationChain msgs) {
		ReadingFactorAndCT_VTratio oldReadingFactor = readingFactor;
		readingFactor = newReadingFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR, oldReadingFactor, newReadingFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingFactor(ReadingFactorAndCT_VTratio newReadingFactor) {
		if (newReadingFactor != readingFactor) {
			NotificationChain msgs = null;
			if (readingFactor != null)
				msgs = ((InternalEObject)readingFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR, null, msgs);
			if (newReadingFactor != null)
				msgs = ((InternalEObject)newReadingFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR, null, msgs);
			msgs = basicSetReadingFactor(newReadingFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR, newReadingFactor, newReadingFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityNominalValues getNominalValues() {
		return nominalValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominalValues(ElectricityNominalValues newNominalValues, NotificationChain msgs) {
		ElectricityNominalValues oldNominalValues = nominalValues;
		nominalValues = newNominalValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES, oldNominalValues, newNominalValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalValues(ElectricityNominalValues newNominalValues) {
		if (newNominalValues != nominalValues) {
			NotificationChain msgs = null;
			if (nominalValues != null)
				msgs = ((InternalEObject)nominalValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES, null, msgs);
			if (newNominalValues != null)
				msgs = ((InternalEObject)newNominalValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES, null, msgs);
			msgs = basicSetNominalValues(newNominalValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES, newNominalValues, newNominalValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPulseValuesOrConstants getInputPulse() {
		return inputPulse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPulse(InputPulseValuesOrConstants newInputPulse, NotificationChain msgs) {
		InputPulseValuesOrConstants oldInputPulse = inputPulse;
		inputPulse = newInputPulse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE, oldInputPulse, newInputPulse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPulse(InputPulseValuesOrConstants newInputPulse) {
		if (newInputPulse != inputPulse) {
			NotificationChain msgs = null;
			if (inputPulse != null)
				msgs = ((InternalEObject)inputPulse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE, null, msgs);
			if (newInputPulse != null)
				msgs = ((InternalEObject)newInputPulse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE, null, msgs);
			msgs = basicSetInputPulse(newInputPulse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE, newInputPulse, newInputPulse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementPeriod_recordingInterval_billingPeriodDuration getMeasurementPeriod() {
		return measurementPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPeriod(MeasurementPeriod_recordingInterval_billingPeriodDuration newMeasurementPeriod, NotificationChain msgs) {
		MeasurementPeriod_recordingInterval_billingPeriodDuration oldMeasurementPeriod = measurementPeriod;
		measurementPeriod = newMeasurementPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD, oldMeasurementPeriod, newMeasurementPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementPeriod(MeasurementPeriod_recordingInterval_billingPeriodDuration newMeasurementPeriod) {
		if (newMeasurementPeriod != measurementPeriod) {
			NotificationChain msgs = null;
			if (measurementPeriod != null)
				msgs = ((InternalEObject)measurementPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD, null, msgs);
			if (newMeasurementPeriod != null)
				msgs = ((InternalEObject)newMeasurementPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD, null, msgs);
			msgs = basicSetMeasurementPeriod(newMeasurementPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD, newMeasurementPeriod, newMeasurementPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEntries getTimeEntries() {
		return timeEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeEntries(TimeEntries newTimeEntries, NotificationChain msgs) {
		TimeEntries oldTimeEntries = timeEntries;
		timeEntries = newTimeEntries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES, oldTimeEntries, newTimeEntries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeEntries(TimeEntries newTimeEntries) {
		if (newTimeEntries != timeEntries) {
			NotificationChain msgs = null;
			if (timeEntries != null)
				msgs = ((InternalEObject)timeEntries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES, null, msgs);
			if (newTimeEntries != null)
				msgs = ((InternalEObject)newTimeEntries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES, null, msgs);
			msgs = basicSetTimeEntries(newTimeEntries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES, newTimeEntries, newTimeEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAndLineLosses getTransformerLineLosses() {
		return transformerLineLosses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerLineLosses(TransformerAndLineLosses newTransformerLineLosses, NotificationChain msgs) {
		TransformerAndLineLosses oldTransformerLineLosses = transformerLineLosses;
		transformerLineLosses = newTransformerLineLosses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES, oldTransformerLineLosses, newTransformerLineLosses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerLineLosses(TransformerAndLineLosses newTransformerLineLosses) {
		if (newTransformerLineLosses != transformerLineLosses) {
			NotificationChain msgs = null;
			if (transformerLineLosses != null)
				msgs = ((InternalEObject)transformerLineLosses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES, null, msgs);
			if (newTransformerLineLosses != null)
				msgs = ((InternalEObject)newTransformerLineLosses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES, null, msgs);
			msgs = basicSetTransformerLineLosses(newTransformerLineLosses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES, newTransformerLineLosses, newTransformerLineLosses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementMethods getMeasurementAlgorithm() {
		return measurementAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementAlgorithm(MeasurementMethods newMeasurementAlgorithm, NotificationChain msgs) {
		MeasurementMethods oldMeasurementAlgorithm = measurementAlgorithm;
		measurementAlgorithm = newMeasurementAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM, oldMeasurementAlgorithm, newMeasurementAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementAlgorithm(MeasurementMethods newMeasurementAlgorithm) {
		if (newMeasurementAlgorithm != measurementAlgorithm) {
			NotificationChain msgs = null;
			if (measurementAlgorithm != null)
				msgs = ((InternalEObject)measurementAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM, null, msgs);
			if (newMeasurementAlgorithm != null)
				msgs = ((InternalEObject)newMeasurementAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM, null, msgs);
			msgs = basicSetMeasurementAlgorithm(newMeasurementAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM, newMeasurementAlgorithm, newMeasurementAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringPointID getMeteringPoint() {
		return meteringPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeteringPoint(MeteringPointID newMeteringPoint, NotificationChain msgs) {
		MeteringPointID oldMeteringPoint = meteringPoint;
		meteringPoint = newMeteringPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__METERING_POINT, oldMeteringPoint, newMeteringPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeteringPoint(MeteringPointID newMeteringPoint) {
		if (newMeteringPoint != meteringPoint) {
			NotificationChain msgs = null;
			if (meteringPoint != null)
				msgs = ((InternalEObject)meteringPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__METERING_POINT, null, msgs);
			if (newMeteringPoint != null)
				msgs = ((InternalEObject)newMeteringPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__METERING_POINT, null, msgs);
			msgs = basicSetMeteringPoint(newMeteringPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__METERING_POINT, newMeteringPoint, newMeteringPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterMonitorObject getRegisterMonitor() {
		return registerMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterMonitor(RegisterMonitorObject newRegisterMonitor, NotificationChain msgs) {
		RegisterMonitorObject oldRegisterMonitor = registerMonitor;
		registerMonitor = newRegisterMonitor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR, oldRegisterMonitor, newRegisterMonitor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterMonitor(RegisterMonitorObject newRegisterMonitor) {
		if (newRegisterMonitor != registerMonitor) {
			NotificationChain msgs = null;
			if (registerMonitor != null)
				msgs = ((InternalEObject)registerMonitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR, null, msgs);
			if (newRegisterMonitor != null)
				msgs = ((InternalEObject)newRegisterMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR, null, msgs);
			msgs = basicSetRegisterMonitor(newRegisterMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR, newRegisterMonitor, newRegisterMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityValues getElectricityValues() {
		return electricityValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectricityValues(ElectricityValues newElectricityValues, NotificationChain msgs) {
		ElectricityValues oldElectricityValues = electricityValues;
		electricityValues = newElectricityValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES, oldElectricityValues, newElectricityValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricityValues(ElectricityValues newElectricityValues) {
		if (newElectricityValues != electricityValues) {
			NotificationChain msgs = null;
			if (electricityValues != null)
				msgs = ((InternalEObject)electricityValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES, null, msgs);
			if (newElectricityValues != null)
				msgs = ((InternalEObject)newElectricityValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES, null, msgs);
			msgs = basicSetElectricityValues(newElectricityValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES, newElectricityValues, newElectricityValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValues getMeasurementValueTypes() {
		return measurementValueTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValueTypes(MeasurementValues newMeasurementValueTypes, NotificationChain msgs) {
		MeasurementValues oldMeasurementValueTypes = measurementValueTypes;
		measurementValueTypes = newMeasurementValueTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES, oldMeasurementValueTypes, newMeasurementValueTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementValueTypes(MeasurementValues newMeasurementValueTypes) {
		if (newMeasurementValueTypes != measurementValueTypes) {
			NotificationChain msgs = null;
			if (measurementValueTypes != null)
				msgs = ((InternalEObject)measurementValueTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES, null, msgs);
			if (newMeasurementValueTypes != null)
				msgs = ((InternalEObject)newMeasurementValueTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES, null, msgs);
			msgs = basicSetMeasurementValueTypes(newMeasurementValueTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES, newMeasurementValueTypes, newMeasurementValueTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricityHarmonics getHarmonics() {
		return harmonics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHarmonics(ElectricityHarmonics newHarmonics, NotificationChain msgs) {
		ElectricityHarmonics oldHarmonics = harmonics;
		harmonics = newHarmonics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__HARMONICS, oldHarmonics, newHarmonics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHarmonics(ElectricityHarmonics newHarmonics) {
		if (newHarmonics != harmonics) {
			NotificationChain msgs = null;
			if (harmonics != null)
				msgs = ((InternalEObject)harmonics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__HARMONICS, null, msgs);
			if (newHarmonics != null)
				msgs = ((InternalEObject)newHarmonics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__HARMONICS, null, msgs);
			msgs = basicSetHarmonics(newHarmonics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__HARMONICS, newHarmonics, newHarmonics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentlyActiveTariff getTariffs() {
		return tariffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTariffs(CurrentlyActiveTariff newTariffs, NotificationChain msgs) {
		CurrentlyActiveTariff oldTariffs = tariffs;
		tariffs = newTariffs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__TARIFFS, oldTariffs, newTariffs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTariffs(CurrentlyActiveTariff newTariffs) {
		if (newTariffs != tariffs) {
			NotificationChain msgs = null;
			if (tariffs != null)
				msgs = ((InternalEObject)tariffs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__TARIFFS, null, msgs);
			if (newTariffs != null)
				msgs = ((InternalEObject)newTariffs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__TARIFFS, null, msgs);
			msgs = basicSetTariffs(newTariffs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__TARIFFS, newTariffs, newTariffs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPhaseAngleMeasurement getPhaseangles() {
		return phaseangles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseangles(ExtendedPhaseAngleMeasurement newPhaseangles, NotificationChain msgs) {
		ExtendedPhaseAngleMeasurement oldPhaseangles = phaseangles;
		phaseangles = newPhaseangles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES, oldPhaseangles, newPhaseangles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseangles(ExtendedPhaseAngleMeasurement newPhaseangles) {
		if (newPhaseangles != phaseangles) {
			NotificationChain msgs = null;
			if (phaseangles != null)
				msgs = ((InternalEObject)phaseangles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES, null, msgs);
			if (newPhaseangles != null)
				msgs = ((InternalEObject)newPhaseangles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES, null, msgs);
			msgs = basicSetPhaseangles(newPhaseangles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES, newPhaseangles, newPhaseangles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS:
				return basicSetElectricityRelatedStatus(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__AA:
				return basicSetAA(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT:
				return basicSetAutoConnect(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES:
				return basicSetBillingPeriodValues(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID:
				return basicSetElectricityID(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES:
				return basicSetProgramEntries(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE:
				return basicSetOutputPulse(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR:
				return basicSetReadingFactor(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES:
				return basicSetNominalValues(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE:
				return basicSetInputPulse(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD:
				return basicSetMeasurementPeriod(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES:
				return basicSetTimeEntries(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES:
				return basicSetTransformerLineLosses(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM:
				return basicSetMeasurementAlgorithm(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__METERING_POINT:
				return basicSetMeteringPoint(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR:
				return basicSetRegisterMonitor(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES:
				return basicSetElectricityValues(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES:
				return basicSetMeasurementValueTypes(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__HARMONICS:
				return basicSetHarmonics(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__TARIFFS:
				return basicSetTariffs(null, msgs);
			case COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES:
				return basicSetPhaseangles(null, msgs);
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
			case COSEMPackage.PHYSICAL_DEVICE__MANAGEMENT_LOGICAL_DEVICE:
				if (resolve) return getManagementLogicalDevice();
				return basicGetManagementLogicalDevice();
			case COSEMPackage.PHYSICAL_DEVICE__ID:
				return getID();
			case COSEMPackage.PHYSICAL_DEVICE__LOGICAL_DEVICE:
				return getLogicalDevice();
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS:
				return getElectricityRelatedStatus();
			case COSEMPackage.PHYSICAL_DEVICE__AA:
				return getAA();
			case COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT:
				return getAutoConnect();
			case COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES:
				return getBillingPeriodValues();
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID:
				return getElectricityID();
			case COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES:
				return getProgramEntries();
			case COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE:
				return getOutputPulse();
			case COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR:
				return getReadingFactor();
			case COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES:
				return getNominalValues();
			case COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE:
				return getInputPulse();
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD:
				return getMeasurementPeriod();
			case COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES:
				return getTimeEntries();
			case COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES:
				return getTransformerLineLosses();
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM:
				return getMeasurementAlgorithm();
			case COSEMPackage.PHYSICAL_DEVICE__METERING_POINT:
				return getMeteringPoint();
			case COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR:
				return getRegisterMonitor();
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES:
				return getElectricityValues();
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES:
				return getMeasurementValueTypes();
			case COSEMPackage.PHYSICAL_DEVICE__HARMONICS:
				return getHarmonics();
			case COSEMPackage.PHYSICAL_DEVICE__TARIFFS:
				return getTariffs();
			case COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES:
				return getPhaseangles();
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
			case COSEMPackage.PHYSICAL_DEVICE__MANAGEMENT_LOGICAL_DEVICE:
				setManagementLogicalDevice((ManagementLogicalDevice)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__ID:
				setID((String)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__LOGICAL_DEVICE:
				getLogicalDevice().clear();
				getLogicalDevice().addAll((Collection<? extends LogicalDevice>)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS:
				setElectricityRelatedStatus((ElectricityRelatedStatusData)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__AA:
				setAA((CurrentAssociation)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT:
				setAutoConnect((AutoConnectObject)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES:
				setBillingPeriodValues((BillingPeriodValues)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID:
				setElectricityID((ElectricityID)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES:
				setProgramEntries((ElectricityProgramEntries)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE:
				setOutputPulse((OutputPulseValues_constants)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR:
				setReadingFactor((ReadingFactorAndCT_VTratio)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES:
				setNominalValues((ElectricityNominalValues)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE:
				setInputPulse((InputPulseValuesOrConstants)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD:
				setMeasurementPeriod((MeasurementPeriod_recordingInterval_billingPeriodDuration)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES:
				setTimeEntries((TimeEntries)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES:
				setTransformerLineLosses((TransformerAndLineLosses)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM:
				setMeasurementAlgorithm((MeasurementMethods)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__METERING_POINT:
				setMeteringPoint((MeteringPointID)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR:
				setRegisterMonitor((RegisterMonitorObject)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES:
				setElectricityValues((ElectricityValues)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES:
				setMeasurementValueTypes((MeasurementValues)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__HARMONICS:
				setHarmonics((ElectricityHarmonics)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__TARIFFS:
				setTariffs((CurrentlyActiveTariff)newValue);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES:
				setPhaseangles((ExtendedPhaseAngleMeasurement)newValue);
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
			case COSEMPackage.PHYSICAL_DEVICE__MANAGEMENT_LOGICAL_DEVICE:
				setManagementLogicalDevice((ManagementLogicalDevice)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__ID:
				setID(ID_EDEFAULT);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__LOGICAL_DEVICE:
				getLogicalDevice().clear();
				return;
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS:
				setElectricityRelatedStatus((ElectricityRelatedStatusData)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__AA:
				setAA((CurrentAssociation)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT:
				setAutoConnect((AutoConnectObject)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES:
				setBillingPeriodValues((BillingPeriodValues)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID:
				setElectricityID((ElectricityID)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES:
				setProgramEntries((ElectricityProgramEntries)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE:
				setOutputPulse((OutputPulseValues_constants)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR:
				setReadingFactor((ReadingFactorAndCT_VTratio)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES:
				setNominalValues((ElectricityNominalValues)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE:
				setInputPulse((InputPulseValuesOrConstants)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD:
				setMeasurementPeriod((MeasurementPeriod_recordingInterval_billingPeriodDuration)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES:
				setTimeEntries((TimeEntries)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES:
				setTransformerLineLosses((TransformerAndLineLosses)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM:
				setMeasurementAlgorithm((MeasurementMethods)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__METERING_POINT:
				setMeteringPoint((MeteringPointID)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR:
				setRegisterMonitor((RegisterMonitorObject)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES:
				setElectricityValues((ElectricityValues)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES:
				setMeasurementValueTypes((MeasurementValues)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__HARMONICS:
				setHarmonics((ElectricityHarmonics)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__TARIFFS:
				setTariffs((CurrentlyActiveTariff)null);
				return;
			case COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES:
				setPhaseangles((ExtendedPhaseAngleMeasurement)null);
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
			case COSEMPackage.PHYSICAL_DEVICE__MANAGEMENT_LOGICAL_DEVICE:
				return managementLogicalDevice != null;
			case COSEMPackage.PHYSICAL_DEVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case COSEMPackage.PHYSICAL_DEVICE__LOGICAL_DEVICE:
				return logicalDevice != null && !logicalDevice.isEmpty();
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_RELATED_STATUS:
				return electricityRelatedStatus != null;
			case COSEMPackage.PHYSICAL_DEVICE__AA:
				return aa != null;
			case COSEMPackage.PHYSICAL_DEVICE__AUTO_CONNECT:
				return autoConnect != null;
			case COSEMPackage.PHYSICAL_DEVICE__BILLING_PERIOD_VALUES:
				return billingPeriodValues != null;
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_ID:
				return electricityID != null;
			case COSEMPackage.PHYSICAL_DEVICE__PROGRAM_ENTRIES:
				return programEntries != null;
			case COSEMPackage.PHYSICAL_DEVICE__OUTPUT_PULSE:
				return outputPulse != null;
			case COSEMPackage.PHYSICAL_DEVICE__READING_FACTOR:
				return readingFactor != null;
			case COSEMPackage.PHYSICAL_DEVICE__NOMINAL_VALUES:
				return nominalValues != null;
			case COSEMPackage.PHYSICAL_DEVICE__INPUT_PULSE:
				return inputPulse != null;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_PERIOD:
				return measurementPeriod != null;
			case COSEMPackage.PHYSICAL_DEVICE__TIME_ENTRIES:
				return timeEntries != null;
			case COSEMPackage.PHYSICAL_DEVICE__TRANSFORMER_LINE_LOSSES:
				return transformerLineLosses != null;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_ALGORITHM:
				return measurementAlgorithm != null;
			case COSEMPackage.PHYSICAL_DEVICE__METERING_POINT:
				return meteringPoint != null;
			case COSEMPackage.PHYSICAL_DEVICE__REGISTER_MONITOR:
				return registerMonitor != null;
			case COSEMPackage.PHYSICAL_DEVICE__ELECTRICITY_VALUES:
				return electricityValues != null;
			case COSEMPackage.PHYSICAL_DEVICE__MEASUREMENT_VALUE_TYPES:
				return measurementValueTypes != null;
			case COSEMPackage.PHYSICAL_DEVICE__HARMONICS:
				return harmonics != null;
			case COSEMPackage.PHYSICAL_DEVICE__TARIFFS:
				return tariffs != null;
			case COSEMPackage.PHYSICAL_DEVICE__PHASEANGLES:
				return phaseangles != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PhysicalDeviceImpl
