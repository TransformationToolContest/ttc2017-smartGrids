/**
 */
package CIM.IEC61968.LoadControl.impl;

import CIM.IEC61968.LoadControl.ConnectDisconnectFunction;
import CIM.IEC61968.LoadControl.LoadControlPackage;
import CIM.IEC61968.LoadControl.RemoteConnectDisconnectInfo;

import CIM.IEC61968.Metering.impl.DeviceFunctionImpl;

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
 * An implementation of the model object '<em><b>Connect Disconnect Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#isIsDelayedDiscon <em>Is Delayed Discon</em>}</li>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}</li>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}</li>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#getSwitches <em>Switches</em>}</li>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#isIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#getRcdInfo <em>Rcd Info</em>}</li>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}</li>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#getEventCount <em>Event Count</em>}</li>
 *   <li>{@link CIM.IEC61968.LoadControl.impl.ConnectDisconnectFunctionImpl#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectDisconnectFunctionImpl extends DeviceFunctionImpl implements ConnectDisconnectFunction {
	/**
	 * The default value of the '{@link #isIsDelayedDiscon() <em>Is Delayed Discon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDelayedDiscon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DELAYED_DISCON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDelayedDiscon() <em>Is Delayed Discon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDelayedDiscon()
	 * @generated
	 * @ordered
	 */
	protected boolean isDelayedDiscon = IS_DELAYED_DISCON_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLocalAutoReconOp() <em>Is Local Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCAL_AUTO_RECON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocalAutoReconOp() <em>Is Local Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalAutoReconOp = IS_LOCAL_AUTO_RECON_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLocalAutoDisconOp() <em>Is Local Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalAutoDisconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCAL_AUTO_DISCON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocalAutoDisconOp() <em>Is Local Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalAutoDisconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalAutoDisconOp = IS_LOCAL_AUTO_DISCON_OP_EDEFAULT;

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
	 * The default value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean isConnected = IS_CONNECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRcdInfo() <em>Rcd Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcdInfo()
	 * @generated
	 * @ordered
	 */
	protected RemoteConnectDisconnectInfo rcdInfo;

	/**
	 * The default value of the '{@link #isIsRemoteAutoDisconOp() <em>Is Remote Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoteAutoDisconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REMOTE_AUTO_DISCON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRemoteAutoDisconOp() <em>Is Remote Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoteAutoDisconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isRemoteAutoDisconOp = IS_REMOTE_AUTO_DISCON_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventCount() <em>Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCount()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEventCount() <em>Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCount()
	 * @generated
	 * @ordered
	 */
	protected int eventCount = EVENT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRemoteAutoReconOp() <em>Is Remote Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoteAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REMOTE_AUTO_RECON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRemoteAutoReconOp() <em>Is Remote Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoteAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isRemoteAutoReconOp = IS_REMOTE_AUTO_RECON_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectDisconnectFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadControlPackage.Literals.CONNECT_DISCONNECT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDelayedDiscon() {
		return isDelayedDiscon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDelayedDiscon(boolean newIsDelayedDiscon) {
		boolean oldIsDelayedDiscon = isDelayedDiscon;
		isDelayedDiscon = newIsDelayedDiscon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON, oldIsDelayedDiscon, isDelayedDiscon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocalAutoReconOp() {
		return isLocalAutoReconOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocalAutoReconOp(boolean newIsLocalAutoReconOp) {
		boolean oldIsLocalAutoReconOp = isLocalAutoReconOp;
		isLocalAutoReconOp = newIsLocalAutoReconOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP, oldIsLocalAutoReconOp, isLocalAutoReconOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocalAutoDisconOp() {
		return isLocalAutoDisconOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocalAutoDisconOp(boolean newIsLocalAutoDisconOp) {
		boolean oldIsLocalAutoDisconOp = isLocalAutoDisconOp;
		isLocalAutoDisconOp = newIsLocalAutoDisconOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP, oldIsLocalAutoDisconOp, isLocalAutoDisconOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new EObjectWithInverseResolvingEList.ManyInverse<Switch>(Switch.class, this, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES, WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS);
		}
		return switches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConnected() {
		return isConnected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConnected(boolean newIsConnected) {
		boolean oldIsConnected = isConnected;
		isConnected = newIsConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED, oldIsConnected, isConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteConnectDisconnectInfo getRcdInfo() {
		if (rcdInfo != null && rcdInfo.eIsProxy()) {
			InternalEObject oldRcdInfo = (InternalEObject)rcdInfo;
			rcdInfo = (RemoteConnectDisconnectInfo)eResolveProxy(oldRcdInfo);
			if (rcdInfo != oldRcdInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, oldRcdInfo, rcdInfo));
			}
		}
		return rcdInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteConnectDisconnectInfo basicGetRcdInfo() {
		return rcdInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRcdInfo(RemoteConnectDisconnectInfo newRcdInfo) {
		RemoteConnectDisconnectInfo oldRcdInfo = rcdInfo;
		rcdInfo = newRcdInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, oldRcdInfo, rcdInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRemoteAutoDisconOp() {
		return isRemoteAutoDisconOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRemoteAutoDisconOp(boolean newIsRemoteAutoDisconOp) {
		boolean oldIsRemoteAutoDisconOp = isRemoteAutoDisconOp;
		isRemoteAutoDisconOp = newIsRemoteAutoDisconOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP, oldIsRemoteAutoDisconOp, isRemoteAutoDisconOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEventCount() {
		return eventCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventCount(int newEventCount) {
		int oldEventCount = eventCount;
		eventCount = newEventCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT, oldEventCount, eventCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRemoteAutoReconOp() {
		return isRemoteAutoReconOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRemoteAutoReconOp(boolean newIsRemoteAutoReconOp) {
		boolean oldIsRemoteAutoReconOp = isRemoteAutoReconOp;
		isRemoteAutoReconOp = newIsRemoteAutoReconOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP, oldIsRemoteAutoReconOp, isRemoteAutoReconOp));
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitches()).basicAdd(otherEnd, msgs);
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
				return isIsDelayedDiscon();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
				return isIsLocalAutoReconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
				return isIsLocalAutoDisconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				return getSwitches();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
				return isIsConnected();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				if (resolve) return getRcdInfo();
				return basicGetRcdInfo();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
				return isIsRemoteAutoDisconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
				return getEventCount();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
				return isIsRemoteAutoReconOp();
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
				setIsDelayedDiscon((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
				setIsLocalAutoReconOp((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
				setIsLocalAutoDisconOp((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
				setIsConnected((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				setRcdInfo((RemoteConnectDisconnectInfo)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
				setIsRemoteAutoDisconOp((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
				setEventCount((Integer)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
				setIsRemoteAutoReconOp((Boolean)newValue);
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
				setIsDelayedDiscon(IS_DELAYED_DISCON_EDEFAULT);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
				setIsLocalAutoReconOp(IS_LOCAL_AUTO_RECON_OP_EDEFAULT);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
				setIsLocalAutoDisconOp(IS_LOCAL_AUTO_DISCON_OP_EDEFAULT);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				getSwitches().clear();
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
				setIsConnected(IS_CONNECTED_EDEFAULT);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				setRcdInfo((RemoteConnectDisconnectInfo)null);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
				setIsRemoteAutoDisconOp(IS_REMOTE_AUTO_DISCON_OP_EDEFAULT);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
				setEventCount(EVENT_COUNT_EDEFAULT);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
				setIsRemoteAutoReconOp(IS_REMOTE_AUTO_RECON_OP_EDEFAULT);
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
				return isDelayedDiscon != IS_DELAYED_DISCON_EDEFAULT;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
				return isLocalAutoReconOp != IS_LOCAL_AUTO_RECON_OP_EDEFAULT;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
				return isLocalAutoDisconOp != IS_LOCAL_AUTO_DISCON_OP_EDEFAULT;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				return switches != null && !switches.isEmpty();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
				return isConnected != IS_CONNECTED_EDEFAULT;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				return rcdInfo != null;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
				return isRemoteAutoDisconOp != IS_REMOTE_AUTO_DISCON_OP_EDEFAULT;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
				return eventCount != EVENT_COUNT_EDEFAULT;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
				return isRemoteAutoReconOp != IS_REMOTE_AUTO_RECON_OP_EDEFAULT;
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
		result.append(" (isDelayedDiscon: ");
		result.append(isDelayedDiscon);
		result.append(", isLocalAutoReconOp: ");
		result.append(isLocalAutoReconOp);
		result.append(", isLocalAutoDisconOp: ");
		result.append(isLocalAutoDisconOp);
		result.append(", isConnected: ");
		result.append(isConnected);
		result.append(", isRemoteAutoDisconOp: ");
		result.append(isRemoteAutoDisconOp);
		result.append(", eventCount: ");
		result.append(eventCount);
		result.append(", isRemoteAutoReconOp: ");
		result.append(isRemoteAutoReconOp);
		result.append(')');
		return result.toString();
	}

} //ConnectDisconnectFunctionImpl
