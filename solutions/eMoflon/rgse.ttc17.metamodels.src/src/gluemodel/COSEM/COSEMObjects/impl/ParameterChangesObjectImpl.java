/**
 */
package gluemodel.COSEM.COSEMObjects.impl;

import gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage;
import gluemodel.COSEM.COSEMObjects.ParameterChangesObject;

import gluemodel.COSEM.InterfaceClasses.impl.DataImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Changes Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getNumberConfigProgramChanges <em>Number Config Program Changes</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateLastConfigChange <em>Date Last Config Change</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateLastSwitchChange <em>Date Last Switch Change</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateLastRippleControlChange <em>Date Last Ripple Control Change</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getStatusSecuritySwitches <em>Status Security Switches</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateLastCalibration <em>Date Last Calibration</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateNextConfig <em>Date Next Config</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateActivationPassivCalendar <em>Date Activation Passiv Calendar</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getNumberProtectedConfigChanges <em>Number Protected Config Changes</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateLastProtectedConfigChange <em>Date Last Protected Config Change</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateLastClockSynch <em>Date Last Clock Synch</em>}</li>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.impl.ParameterChangesObjectImpl#getDateLastFirmwareActivation <em>Date Last Firmware Activation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterChangesObjectImpl extends DataImpl implements ParameterChangesObject {
	/**
	 * The default value of the '{@link #getNumberConfigProgramChanges() <em>Number Config Program Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberConfigProgramChanges()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_CONFIG_PROGRAM_CHANGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberConfigProgramChanges() <em>Number Config Program Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberConfigProgramChanges()
	 * @generated
	 * @ordered
	 */
	protected int numberConfigProgramChanges = NUMBER_CONFIG_PROGRAM_CHANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLastConfigChange() <em>Date Last Config Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastConfigChange()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LAST_CONFIG_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLastConfigChange() <em>Date Last Config Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastConfigChange()
	 * @generated
	 * @ordered
	 */
	protected Date dateLastConfigChange = DATE_LAST_CONFIG_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLastSwitchChange() <em>Date Last Switch Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastSwitchChange()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LAST_SWITCH_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLastSwitchChange() <em>Date Last Switch Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastSwitchChange()
	 * @generated
	 * @ordered
	 */
	protected Date dateLastSwitchChange = DATE_LAST_SWITCH_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLastRippleControlChange() <em>Date Last Ripple Control Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastRippleControlChange()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LAST_RIPPLE_CONTROL_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLastRippleControlChange() <em>Date Last Ripple Control Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastRippleControlChange()
	 * @generated
	 * @ordered
	 */
	protected Date dateLastRippleControlChange = DATE_LAST_RIPPLE_CONTROL_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusSecuritySwitches() <em>Status Security Switches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusSecuritySwitches()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_SECURITY_SWITCHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusSecuritySwitches() <em>Status Security Switches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusSecuritySwitches()
	 * @generated
	 * @ordered
	 */
	protected String statusSecuritySwitches = STATUS_SECURITY_SWITCHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLastCalibration() <em>Date Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastCalibration()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LAST_CALIBRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLastCalibration() <em>Date Last Calibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastCalibration()
	 * @generated
	 * @ordered
	 */
	protected Date dateLastCalibration = DATE_LAST_CALIBRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateNextConfig() <em>Date Next Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateNextConfig()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_NEXT_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateNextConfig() <em>Date Next Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateNextConfig()
	 * @generated
	 * @ordered
	 */
	protected Date dateNextConfig = DATE_NEXT_CONFIG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateActivationPassivCalendar() <em>Date Activation Passiv Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateActivationPassivCalendar()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ACTIVATION_PASSIV_CALENDAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateActivationPassivCalendar() <em>Date Activation Passiv Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateActivationPassivCalendar()
	 * @generated
	 * @ordered
	 */
	protected Date dateActivationPassivCalendar = DATE_ACTIVATION_PASSIV_CALENDAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberProtectedConfigChanges() <em>Number Protected Config Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberProtectedConfigChanges()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_PROTECTED_CONFIG_CHANGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberProtectedConfigChanges() <em>Number Protected Config Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberProtectedConfigChanges()
	 * @generated
	 * @ordered
	 */
	protected int numberProtectedConfigChanges = NUMBER_PROTECTED_CONFIG_CHANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLastProtectedConfigChange() <em>Date Last Protected Config Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastProtectedConfigChange()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LAST_PROTECTED_CONFIG_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLastProtectedConfigChange() <em>Date Last Protected Config Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastProtectedConfigChange()
	 * @generated
	 * @ordered
	 */
	protected Date dateLastProtectedConfigChange = DATE_LAST_PROTECTED_CONFIG_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLastClockSynch() <em>Date Last Clock Synch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastClockSynch()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LAST_CLOCK_SYNCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLastClockSynch() <em>Date Last Clock Synch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastClockSynch()
	 * @generated
	 * @ordered
	 */
	protected Date dateLastClockSynch = DATE_LAST_CLOCK_SYNCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLastFirmwareActivation() <em>Date Last Firmware Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastFirmwareActivation()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LAST_FIRMWARE_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLastFirmwareActivation() <em>Date Last Firmware Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastFirmwareActivation()
	 * @generated
	 * @ordered
	 */
	protected Date dateLastFirmwareActivation = DATE_LAST_FIRMWARE_ACTIVATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterChangesObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getParameterChangesObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberConfigProgramChanges() {
		return numberConfigProgramChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberConfigProgramChanges(int newNumberConfigProgramChanges) {
		int oldNumberConfigProgramChanges = numberConfigProgramChanges;
		numberConfigProgramChanges = newNumberConfigProgramChanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_CONFIG_PROGRAM_CHANGES, oldNumberConfigProgramChanges, numberConfigProgramChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateLastConfigChange() {
		return dateLastConfigChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLastConfigChange(Date newDateLastConfigChange) {
		Date oldDateLastConfigChange = dateLastConfigChange;
		dateLastConfigChange = newDateLastConfigChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CONFIG_CHANGE, oldDateLastConfigChange, dateLastConfigChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateLastSwitchChange() {
		return dateLastSwitchChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLastSwitchChange(Date newDateLastSwitchChange) {
		Date oldDateLastSwitchChange = dateLastSwitchChange;
		dateLastSwitchChange = newDateLastSwitchChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_SWITCH_CHANGE, oldDateLastSwitchChange, dateLastSwitchChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateLastRippleControlChange() {
		return dateLastRippleControlChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLastRippleControlChange(Date newDateLastRippleControlChange) {
		Date oldDateLastRippleControlChange = dateLastRippleControlChange;
		dateLastRippleControlChange = newDateLastRippleControlChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_RIPPLE_CONTROL_CHANGE, oldDateLastRippleControlChange, dateLastRippleControlChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatusSecuritySwitches() {
		return statusSecuritySwitches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusSecuritySwitches(String newStatusSecuritySwitches) {
		String oldStatusSecuritySwitches = statusSecuritySwitches;
		statusSecuritySwitches = newStatusSecuritySwitches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__STATUS_SECURITY_SWITCHES, oldStatusSecuritySwitches, statusSecuritySwitches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateLastCalibration() {
		return dateLastCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLastCalibration(Date newDateLastCalibration) {
		Date oldDateLastCalibration = dateLastCalibration;
		dateLastCalibration = newDateLastCalibration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CALIBRATION, oldDateLastCalibration, dateLastCalibration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateNextConfig() {
		return dateNextConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateNextConfig(Date newDateNextConfig) {
		Date oldDateNextConfig = dateNextConfig;
		dateNextConfig = newDateNextConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_NEXT_CONFIG, oldDateNextConfig, dateNextConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateActivationPassivCalendar() {
		return dateActivationPassivCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateActivationPassivCalendar(Date newDateActivationPassivCalendar) {
		Date oldDateActivationPassivCalendar = dateActivationPassivCalendar;
		dateActivationPassivCalendar = newDateActivationPassivCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_ACTIVATION_PASSIV_CALENDAR, oldDateActivationPassivCalendar, dateActivationPassivCalendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberProtectedConfigChanges() {
		return numberProtectedConfigChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberProtectedConfigChanges(int newNumberProtectedConfigChanges) {
		int oldNumberProtectedConfigChanges = numberProtectedConfigChanges;
		numberProtectedConfigChanges = newNumberProtectedConfigChanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_PROTECTED_CONFIG_CHANGES, oldNumberProtectedConfigChanges, numberProtectedConfigChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateLastProtectedConfigChange() {
		return dateLastProtectedConfigChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLastProtectedConfigChange(Date newDateLastProtectedConfigChange) {
		Date oldDateLastProtectedConfigChange = dateLastProtectedConfigChange;
		dateLastProtectedConfigChange = newDateLastProtectedConfigChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_PROTECTED_CONFIG_CHANGE, oldDateLastProtectedConfigChange, dateLastProtectedConfigChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateLastClockSynch() {
		return dateLastClockSynch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLastClockSynch(Date newDateLastClockSynch) {
		Date oldDateLastClockSynch = dateLastClockSynch;
		dateLastClockSynch = newDateLastClockSynch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CLOCK_SYNCH, oldDateLastClockSynch, dateLastClockSynch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateLastFirmwareActivation() {
		return dateLastFirmwareActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLastFirmwareActivation(Date newDateLastFirmwareActivation) {
		Date oldDateLastFirmwareActivation = dateLastFirmwareActivation;
		dateLastFirmwareActivation = newDateLastFirmwareActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_FIRMWARE_ACTIVATION, oldDateLastFirmwareActivation, dateLastFirmwareActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_CONFIG_PROGRAM_CHANGES:
				return getNumberConfigProgramChanges();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CONFIG_CHANGE:
				return getDateLastConfigChange();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_SWITCH_CHANGE:
				return getDateLastSwitchChange();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_RIPPLE_CONTROL_CHANGE:
				return getDateLastRippleControlChange();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__STATUS_SECURITY_SWITCHES:
				return getStatusSecuritySwitches();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CALIBRATION:
				return getDateLastCalibration();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_NEXT_CONFIG:
				return getDateNextConfig();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_ACTIVATION_PASSIV_CALENDAR:
				return getDateActivationPassivCalendar();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_PROTECTED_CONFIG_CHANGES:
				return getNumberProtectedConfigChanges();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_PROTECTED_CONFIG_CHANGE:
				return getDateLastProtectedConfigChange();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CLOCK_SYNCH:
				return getDateLastClockSynch();
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_FIRMWARE_ACTIVATION:
				return getDateLastFirmwareActivation();
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
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_CONFIG_PROGRAM_CHANGES:
				setNumberConfigProgramChanges((Integer)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CONFIG_CHANGE:
				setDateLastConfigChange((Date)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_SWITCH_CHANGE:
				setDateLastSwitchChange((Date)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_RIPPLE_CONTROL_CHANGE:
				setDateLastRippleControlChange((Date)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__STATUS_SECURITY_SWITCHES:
				setStatusSecuritySwitches((String)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CALIBRATION:
				setDateLastCalibration((Date)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_NEXT_CONFIG:
				setDateNextConfig((Date)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_ACTIVATION_PASSIV_CALENDAR:
				setDateActivationPassivCalendar((Date)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_PROTECTED_CONFIG_CHANGES:
				setNumberProtectedConfigChanges((Integer)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_PROTECTED_CONFIG_CHANGE:
				setDateLastProtectedConfigChange((Date)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CLOCK_SYNCH:
				setDateLastClockSynch((Date)newValue);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_FIRMWARE_ACTIVATION:
				setDateLastFirmwareActivation((Date)newValue);
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
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_CONFIG_PROGRAM_CHANGES:
				setNumberConfigProgramChanges(NUMBER_CONFIG_PROGRAM_CHANGES_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CONFIG_CHANGE:
				setDateLastConfigChange(DATE_LAST_CONFIG_CHANGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_SWITCH_CHANGE:
				setDateLastSwitchChange(DATE_LAST_SWITCH_CHANGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_RIPPLE_CONTROL_CHANGE:
				setDateLastRippleControlChange(DATE_LAST_RIPPLE_CONTROL_CHANGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__STATUS_SECURITY_SWITCHES:
				setStatusSecuritySwitches(STATUS_SECURITY_SWITCHES_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CALIBRATION:
				setDateLastCalibration(DATE_LAST_CALIBRATION_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_NEXT_CONFIG:
				setDateNextConfig(DATE_NEXT_CONFIG_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_ACTIVATION_PASSIV_CALENDAR:
				setDateActivationPassivCalendar(DATE_ACTIVATION_PASSIV_CALENDAR_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_PROTECTED_CONFIG_CHANGES:
				setNumberProtectedConfigChanges(NUMBER_PROTECTED_CONFIG_CHANGES_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_PROTECTED_CONFIG_CHANGE:
				setDateLastProtectedConfigChange(DATE_LAST_PROTECTED_CONFIG_CHANGE_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CLOCK_SYNCH:
				setDateLastClockSynch(DATE_LAST_CLOCK_SYNCH_EDEFAULT);
				return;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_FIRMWARE_ACTIVATION:
				setDateLastFirmwareActivation(DATE_LAST_FIRMWARE_ACTIVATION_EDEFAULT);
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
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_CONFIG_PROGRAM_CHANGES:
				return numberConfigProgramChanges != NUMBER_CONFIG_PROGRAM_CHANGES_EDEFAULT;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CONFIG_CHANGE:
				return DATE_LAST_CONFIG_CHANGE_EDEFAULT == null ? dateLastConfigChange != null : !DATE_LAST_CONFIG_CHANGE_EDEFAULT.equals(dateLastConfigChange);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_SWITCH_CHANGE:
				return DATE_LAST_SWITCH_CHANGE_EDEFAULT == null ? dateLastSwitchChange != null : !DATE_LAST_SWITCH_CHANGE_EDEFAULT.equals(dateLastSwitchChange);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_RIPPLE_CONTROL_CHANGE:
				return DATE_LAST_RIPPLE_CONTROL_CHANGE_EDEFAULT == null ? dateLastRippleControlChange != null : !DATE_LAST_RIPPLE_CONTROL_CHANGE_EDEFAULT.equals(dateLastRippleControlChange);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__STATUS_SECURITY_SWITCHES:
				return STATUS_SECURITY_SWITCHES_EDEFAULT == null ? statusSecuritySwitches != null : !STATUS_SECURITY_SWITCHES_EDEFAULT.equals(statusSecuritySwitches);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CALIBRATION:
				return DATE_LAST_CALIBRATION_EDEFAULT == null ? dateLastCalibration != null : !DATE_LAST_CALIBRATION_EDEFAULT.equals(dateLastCalibration);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_NEXT_CONFIG:
				return DATE_NEXT_CONFIG_EDEFAULT == null ? dateNextConfig != null : !DATE_NEXT_CONFIG_EDEFAULT.equals(dateNextConfig);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_ACTIVATION_PASSIV_CALENDAR:
				return DATE_ACTIVATION_PASSIV_CALENDAR_EDEFAULT == null ? dateActivationPassivCalendar != null : !DATE_ACTIVATION_PASSIV_CALENDAR_EDEFAULT.equals(dateActivationPassivCalendar);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__NUMBER_PROTECTED_CONFIG_CHANGES:
				return numberProtectedConfigChanges != NUMBER_PROTECTED_CONFIG_CHANGES_EDEFAULT;
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_PROTECTED_CONFIG_CHANGE:
				return DATE_LAST_PROTECTED_CONFIG_CHANGE_EDEFAULT == null ? dateLastProtectedConfigChange != null : !DATE_LAST_PROTECTED_CONFIG_CHANGE_EDEFAULT.equals(dateLastProtectedConfigChange);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_CLOCK_SYNCH:
				return DATE_LAST_CLOCK_SYNCH_EDEFAULT == null ? dateLastClockSynch != null : !DATE_LAST_CLOCK_SYNCH_EDEFAULT.equals(dateLastClockSynch);
			case COSEMObjectsPackage.PARAMETER_CHANGES_OBJECT__DATE_LAST_FIRMWARE_ACTIVATION:
				return DATE_LAST_FIRMWARE_ACTIVATION_EDEFAULT == null ? dateLastFirmwareActivation != null : !DATE_LAST_FIRMWARE_ACTIVATION_EDEFAULT.equals(dateLastFirmwareActivation);
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
		result.append(" (NumberConfigProgramChanges: ");
		result.append(numberConfigProgramChanges);
		result.append(", DateLastConfigChange: ");
		result.append(dateLastConfigChange);
		result.append(", DateLastSwitchChange: ");
		result.append(dateLastSwitchChange);
		result.append(", DateLastRippleControlChange: ");
		result.append(dateLastRippleControlChange);
		result.append(", StatusSecuritySwitches: ");
		result.append(statusSecuritySwitches);
		result.append(", DateLastCalibration: ");
		result.append(dateLastCalibration);
		result.append(", DateNextConfig: ");
		result.append(dateNextConfig);
		result.append(", DateActivationPassivCalendar: ");
		result.append(dateActivationPassivCalendar);
		result.append(", NumberProtectedConfigChanges: ");
		result.append(numberProtectedConfigChanges);
		result.append(", DateLastProtectedConfigChange: ");
		result.append(dateLastProtectedConfigChange);
		result.append(", DateLastClockSynch: ");
		result.append(dateLastClockSynch);
		result.append(", DateLastFirmwareActivation: ");
		result.append(dateLastFirmwareActivation);
		result.append(')');
		return result.toString();
	}

} //ParameterChangesObjectImpl
