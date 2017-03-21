/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61968.LoadControl.ConnectDisconnectFunction;
import CIM.IEC61968.LoadControl.LoadControlPackage;

import CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;
import CIM.IEC61970.Informative.InfLoadControl.LoadMgmtFunction;

import CIM.IEC61970.Outage.OutagePackage;
import CIM.IEC61970.Outage.SwitchingOperation;

import CIM.IEC61970.Wires.CompositeSwitch;
import CIM.IEC61970.Wires.Switch;
import CIM.IEC61970.Wires.SwitchSchedule;
import CIM.IEC61970.Wires.WiresPackage;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#isRetained <em>Retained</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#getLoadMgmtFunctions <em>Load Mgmt Functions</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#isNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#getSwitchingOperations <em>Switching Operations</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#getSwitchSchedules <em>Switch Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.SwitchImpl#getCompositeSwitch <em>Composite Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends ConductingEquipmentImpl implements Switch {
	/**
	 * The default value of the '{@link #isRetained() <em>Retained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetained()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETAINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetained() <em>Retained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetained()
	 * @generated
	 * @ordered
	 */
	protected boolean retained = RETAINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SWITCH_ON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnDate()
	 * @generated
	 * @ordered
	 */
	protected Date switchOnDate = SWITCH_ON_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadMgmtFunctions() <em>Load Mgmt Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmtFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadMgmtFunction> loadMgmtFunctions;

	/**
	 * The cached value of the '{@link #getConnectDisconnectFunctions() <em>Connect Disconnect Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectDisconnectFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectDisconnectFunction> connectDisconnectFunctions;

	/**
	 * The default value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMAL_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean normalOpen = NORMAL_OPEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitchingOperations() <em>Switching Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingOperation> switchingOperations;

	/**
	 * The cached value of the '{@link #getSwitchSchedules() <em>Switch Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchSchedule> switchSchedules;

	/**
	 * The default value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SWITCH_ON_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnCount()
	 * @generated
	 * @ordered
	 */
	protected int switchOnCount = SWITCH_ON_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompositeSwitch() <em>Composite Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSwitch()
	 * @generated
	 * @ordered
	 */
	protected CompositeSwitch compositeSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetained() {
		return retained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetained(boolean newRetained) {
		boolean oldRetained = retained;
		retained = newRetained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SWITCH__RETAINED, oldRetained, retained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSwitchOnDate() {
		return switchOnDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchOnDate(Date newSwitchOnDate) {
		Date oldSwitchOnDate = switchOnDate;
		switchOnDate = newSwitchOnDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SWITCH__SWITCH_ON_DATE, oldSwitchOnDate, switchOnDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadMgmtFunction> getLoadMgmtFunctions() {
		if (loadMgmtFunctions == null) {
			loadMgmtFunctions = new EObjectWithInverseResolvingEList.ManyInverse<LoadMgmtFunction>(LoadMgmtFunction.class, this, WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS, InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES);
		}
		return loadMgmtFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectDisconnectFunction> getConnectDisconnectFunctions() {
		if (connectDisconnectFunctions == null) {
			connectDisconnectFunctions = new EObjectWithInverseResolvingEList.ManyInverse<ConnectDisconnectFunction>(ConnectDisconnectFunction.class, this, WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES);
		}
		return connectDisconnectFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNormalOpen() {
		return normalOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalOpen(boolean newNormalOpen) {
		boolean oldNormalOpen = normalOpen;
		normalOpen = newNormalOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SWITCH__NORMAL_OPEN, oldNormalOpen, normalOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchingOperation> getSwitchingOperations() {
		if (switchingOperations == null) {
			switchingOperations = new EObjectWithInverseResolvingEList.ManyInverse<SwitchingOperation>(SwitchingOperation.class, this, WiresPackage.SWITCH__SWITCHING_OPERATIONS, OutagePackage.SWITCHING_OPERATION__SWITCHES);
		}
		return switchingOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchSchedule> getSwitchSchedules() {
		if (switchSchedules == null) {
			switchSchedules = new EObjectWithInverseResolvingEList<SwitchSchedule>(SwitchSchedule.class, this, WiresPackage.SWITCH__SWITCH_SCHEDULES, WiresPackage.SWITCH_SCHEDULE__SWITCH);
		}
		return switchSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSwitchOnCount() {
		return switchOnCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchOnCount(int newSwitchOnCount) {
		int oldSwitchOnCount = switchOnCount;
		switchOnCount = newSwitchOnCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SWITCH__SWITCH_ON_COUNT, oldSwitchOnCount, switchOnCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitch getCompositeSwitch() {
		if (compositeSwitch != null && compositeSwitch.eIsProxy()) {
			InternalEObject oldCompositeSwitch = (InternalEObject)compositeSwitch;
			compositeSwitch = (CompositeSwitch)eResolveProxy(oldCompositeSwitch);
			if (compositeSwitch != oldCompositeSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.SWITCH__COMPOSITE_SWITCH, oldCompositeSwitch, compositeSwitch));
			}
		}
		return compositeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitch basicGetCompositeSwitch() {
		return compositeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeSwitch(CompositeSwitch newCompositeSwitch, NotificationChain msgs) {
		CompositeSwitch oldCompositeSwitch = compositeSwitch;
		compositeSwitch = newCompositeSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.SWITCH__COMPOSITE_SWITCH, oldCompositeSwitch, newCompositeSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeSwitch(CompositeSwitch newCompositeSwitch) {
		if (newCompositeSwitch != compositeSwitch) {
			NotificationChain msgs = null;
			if (compositeSwitch != null)
				msgs = ((InternalEObject)compositeSwitch).eInverseRemove(this, WiresPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs);
			if (newCompositeSwitch != null)
				msgs = ((InternalEObject)newCompositeSwitch).eInverseAdd(this, WiresPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs);
			msgs = basicSetCompositeSwitch(newCompositeSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.SWITCH__COMPOSITE_SWITCH, newCompositeSwitch, newCompositeSwitch));
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
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadMgmtFunctions()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectDisconnectFunctions()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingOperations()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchSchedules()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				if (compositeSwitch != null)
					msgs = ((InternalEObject)compositeSwitch).eInverseRemove(this, WiresPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs);
				return basicSetCompositeSwitch((CompositeSwitch)otherEnd, msgs);
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
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				return ((InternalEList<?>)getLoadMgmtFunctions()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				return ((InternalEList<?>)getConnectDisconnectFunctions()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				return ((InternalEList<?>)getSwitchingOperations()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				return ((InternalEList<?>)getSwitchSchedules()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				return basicSetCompositeSwitch(null, msgs);
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
			case WiresPackage.SWITCH__RETAINED:
				return isRetained();
			case WiresPackage.SWITCH__SWITCH_ON_DATE:
				return getSwitchOnDate();
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				return getLoadMgmtFunctions();
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				return getConnectDisconnectFunctions();
			case WiresPackage.SWITCH__NORMAL_OPEN:
				return isNormalOpen();
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				return getSwitchingOperations();
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				return getSwitchSchedules();
			case WiresPackage.SWITCH__SWITCH_ON_COUNT:
				return getSwitchOnCount();
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				if (resolve) return getCompositeSwitch();
				return basicGetCompositeSwitch();
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
			case WiresPackage.SWITCH__RETAINED:
				setRetained((Boolean)newValue);
				return;
			case WiresPackage.SWITCH__SWITCH_ON_DATE:
				setSwitchOnDate((Date)newValue);
				return;
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				getLoadMgmtFunctions().clear();
				getLoadMgmtFunctions().addAll((Collection<? extends LoadMgmtFunction>)newValue);
				return;
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				getConnectDisconnectFunctions().clear();
				getConnectDisconnectFunctions().addAll((Collection<? extends ConnectDisconnectFunction>)newValue);
				return;
			case WiresPackage.SWITCH__NORMAL_OPEN:
				setNormalOpen((Boolean)newValue);
				return;
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				getSwitchingOperations().clear();
				getSwitchingOperations().addAll((Collection<? extends SwitchingOperation>)newValue);
				return;
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				getSwitchSchedules().clear();
				getSwitchSchedules().addAll((Collection<? extends SwitchSchedule>)newValue);
				return;
			case WiresPackage.SWITCH__SWITCH_ON_COUNT:
				setSwitchOnCount((Integer)newValue);
				return;
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				setCompositeSwitch((CompositeSwitch)newValue);
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
			case WiresPackage.SWITCH__RETAINED:
				setRetained(RETAINED_EDEFAULT);
				return;
			case WiresPackage.SWITCH__SWITCH_ON_DATE:
				setSwitchOnDate(SWITCH_ON_DATE_EDEFAULT);
				return;
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				getLoadMgmtFunctions().clear();
				return;
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				getConnectDisconnectFunctions().clear();
				return;
			case WiresPackage.SWITCH__NORMAL_OPEN:
				setNormalOpen(NORMAL_OPEN_EDEFAULT);
				return;
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				getSwitchingOperations().clear();
				return;
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				getSwitchSchedules().clear();
				return;
			case WiresPackage.SWITCH__SWITCH_ON_COUNT:
				setSwitchOnCount(SWITCH_ON_COUNT_EDEFAULT);
				return;
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				setCompositeSwitch((CompositeSwitch)null);
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
			case WiresPackage.SWITCH__RETAINED:
				return retained != RETAINED_EDEFAULT;
			case WiresPackage.SWITCH__SWITCH_ON_DATE:
				return SWITCH_ON_DATE_EDEFAULT == null ? switchOnDate != null : !SWITCH_ON_DATE_EDEFAULT.equals(switchOnDate);
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				return loadMgmtFunctions != null && !loadMgmtFunctions.isEmpty();
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				return connectDisconnectFunctions != null && !connectDisconnectFunctions.isEmpty();
			case WiresPackage.SWITCH__NORMAL_OPEN:
				return normalOpen != NORMAL_OPEN_EDEFAULT;
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				return switchingOperations != null && !switchingOperations.isEmpty();
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				return switchSchedules != null && !switchSchedules.isEmpty();
			case WiresPackage.SWITCH__SWITCH_ON_COUNT:
				return switchOnCount != SWITCH_ON_COUNT_EDEFAULT;
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				return compositeSwitch != null;
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
		result.append(" (retained: ");
		result.append(retained);
		result.append(", switchOnDate: ");
		result.append(switchOnDate);
		result.append(", normalOpen: ");
		result.append(normalOpen);
		result.append(", switchOnCount: ");
		result.append(switchOnCount);
		result.append(')');
		return result.toString();
	}

} //SwitchImpl
