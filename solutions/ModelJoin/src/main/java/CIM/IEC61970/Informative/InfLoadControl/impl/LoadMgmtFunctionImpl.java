/**
 */
package CIM.IEC61970.Informative.InfLoadControl.impl;

import CIM.IEC61968.Metering.impl.DeviceFunctionImpl;

import CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;
import CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction;
import CIM.IEC61970.Informative.InfLoadControl.LoadMgmtKind;
import CIM.IEC61970.Informative.InfLoadControl.LoadMgmtRecord;
import CIM.IEC61970.Informative.InfLoadControl.LoadStateKind;

import CIM.IEC61970.Wires.Switch;
import CIM.IEC61970.Wires.WiresPackage;

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
 * An implementation of the model object '<em><b>Load Mgmt Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl#isManualOverRide <em>Manual Over Ride</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl#isIsAutoOp <em>Is Auto Op</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl#getSchedulingBasis <em>Scheduling Basis</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl#isRemoteOverRide <em>Remote Over Ride</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl#getLoadStatus <em>Load Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl#getSwitches <em>Switches</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl#getLoadMgmtRecords <em>Load Mgmt Records</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadMgmtFunctionImpl#getOverRideTimeOut <em>Over Ride Time Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadMgmtFunctionImpl extends DeviceFunctionImpl implements LoadMgmtFunction {
	/**
	 * The default value of the '{@link #isManualOverRide() <em>Manual Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualOverRide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_OVER_RIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManualOverRide() <em>Manual Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualOverRide()
	 * @generated
	 * @ordered
	 */
	protected boolean manualOverRide = MANUAL_OVER_RIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAutoOp() <em>Is Auto Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTO_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutoOp() <em>Is Auto Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutoOp = IS_AUTO_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulingBasis() <em>Scheduling Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingBasis()
	 * @generated
	 * @ordered
	 */
	protected static final LoadMgmtKind SCHEDULING_BASIS_EDEFAULT = LoadMgmtKind.TIME_BASED;

	/**
	 * The cached value of the '{@link #getSchedulingBasis() <em>Scheduling Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingBasis()
	 * @generated
	 * @ordered
	 */
	protected LoadMgmtKind schedulingBasis = SCHEDULING_BASIS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoteOverRide() <em>Remote Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteOverRide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_OVER_RIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteOverRide() <em>Remote Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteOverRide()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteOverRide = REMOTE_OVER_RIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadStatus() <em>Load Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadStatus()
	 * @generated
	 * @ordered
	 */
	protected static final LoadStateKind LOAD_STATUS_EDEFAULT = LoadStateKind.LIMITED_LOAD;

	/**
	 * The cached value of the '{@link #getLoadStatus() <em>Load Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadStatus()
	 * @generated
	 * @ordered
	 */
	protected LoadStateKind loadStatus = LOAD_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switches;

	/**
	 * The cached value of the '{@link #getLoadMgmtRecords() <em>Load Mgmt Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmtRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadMgmtRecord> loadMgmtRecords;

	/**
	 * The default value of the '{@link #getOverRideTimeOut() <em>Over Ride Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverRideTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final float OVER_RIDE_TIME_OUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOverRideTimeOut() <em>Over Ride Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverRideTimeOut()
	 * @generated
	 * @ordered
	 */
	protected float overRideTimeOut = OVER_RIDE_TIME_OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadMgmtFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLoadControlPackage.Literals.LOAD_MGMT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManualOverRide() {
		return manualOverRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualOverRide(boolean newManualOverRide) {
		boolean oldManualOverRide = manualOverRide;
		manualOverRide = newManualOverRide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE, oldManualOverRide, manualOverRide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAutoOp() {
		return isAutoOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutoOp(boolean newIsAutoOp) {
		boolean oldIsAutoOp = isAutoOp;
		isAutoOp = newIsAutoOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP, oldIsAutoOp, isAutoOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMgmtKind getSchedulingBasis() {
		return schedulingBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingBasis(LoadMgmtKind newSchedulingBasis) {
		LoadMgmtKind oldSchedulingBasis = schedulingBasis;
		schedulingBasis = newSchedulingBasis == null ? SCHEDULING_BASIS_EDEFAULT : newSchedulingBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS, oldSchedulingBasis, schedulingBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteOverRide() {
		return remoteOverRide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteOverRide(boolean newRemoteOverRide) {
		boolean oldRemoteOverRide = remoteOverRide;
		remoteOverRide = newRemoteOverRide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE, oldRemoteOverRide, remoteOverRide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadStateKind getLoadStatus() {
		return loadStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadStatus(LoadStateKind newLoadStatus) {
		LoadStateKind oldLoadStatus = loadStatus;
		loadStatus = newLoadStatus == null ? LOAD_STATUS_EDEFAULT : newLoadStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS, oldLoadStatus, loadStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new EObjectWithInverseResolvingEList.ManyInverse<Switch>(Switch.class, this, InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES, WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS);
		}
		return switches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadMgmtRecord> getLoadMgmtRecords() {
		if (loadMgmtRecords == null) {
			loadMgmtRecords = new EObjectWithInverseResolvingEList<LoadMgmtRecord>(LoadMgmtRecord.class, this, InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS, InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION);
		}
		return loadMgmtRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOverRideTimeOut() {
		return overRideTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverRideTimeOut(float newOverRideTimeOut) {
		float oldOverRideTimeOut = overRideTimeOut;
		overRideTimeOut = newOverRideTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT, oldOverRideTimeOut, overRideTimeOut));
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitches()).basicAdd(otherEnd, msgs);
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadMgmtRecords()).basicAdd(otherEnd, msgs);
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				return ((InternalEList<?>)getLoadMgmtRecords()).basicRemove(otherEnd, msgs);
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE:
				return isManualOverRide();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP:
				return isIsAutoOp();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS:
				return getSchedulingBasis();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE:
				return isRemoteOverRide();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS:
				return getLoadStatus();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				return getSwitches();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				return getLoadMgmtRecords();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT:
				return getOverRideTimeOut();
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE:
				setManualOverRide((Boolean)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP:
				setIsAutoOp((Boolean)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS:
				setSchedulingBasis((LoadMgmtKind)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE:
				setRemoteOverRide((Boolean)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS:
				setLoadStatus((LoadStateKind)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				getLoadMgmtRecords().clear();
				getLoadMgmtRecords().addAll((Collection<? extends LoadMgmtRecord>)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT:
				setOverRideTimeOut((Float)newValue);
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE:
				setManualOverRide(MANUAL_OVER_RIDE_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP:
				setIsAutoOp(IS_AUTO_OP_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS:
				setSchedulingBasis(SCHEDULING_BASIS_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE:
				setRemoteOverRide(REMOTE_OVER_RIDE_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS:
				setLoadStatus(LOAD_STATUS_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				getSwitches().clear();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				getLoadMgmtRecords().clear();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT:
				setOverRideTimeOut(OVER_RIDE_TIME_OUT_EDEFAULT);
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE:
				return manualOverRide != MANUAL_OVER_RIDE_EDEFAULT;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP:
				return isAutoOp != IS_AUTO_OP_EDEFAULT;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS:
				return schedulingBasis != SCHEDULING_BASIS_EDEFAULT;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE:
				return remoteOverRide != REMOTE_OVER_RIDE_EDEFAULT;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS:
				return loadStatus != LOAD_STATUS_EDEFAULT;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				return switches != null && !switches.isEmpty();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				return loadMgmtRecords != null && !loadMgmtRecords.isEmpty();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT:
				return overRideTimeOut != OVER_RIDE_TIME_OUT_EDEFAULT;
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
		result.append(" (manualOverRide: ");
		result.append(manualOverRide);
		result.append(", isAutoOp: ");
		result.append(isAutoOp);
		result.append(", schedulingBasis: ");
		result.append(schedulingBasis);
		result.append(", remoteOverRide: ");
		result.append(remoteOverRide);
		result.append(", loadStatus: ");
		result.append(loadStatus);
		result.append(", overRideTimeOut: ");
		result.append(overRideTimeOut);
		result.append(')');
		return result.toString();
	}

} //LoadMgmtFunctionImpl
