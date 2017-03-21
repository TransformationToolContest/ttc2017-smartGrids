/**
 */
package CIM.IEC61970.Informative.InfLoadControl.impl;

import CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;
import CIM.IEC61970.Informative.InfLoadControl.LoadLimitFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Limit Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadLimitFunctionImpl#isIsAutoReconOp <em>Is Auto Recon Op</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadLimitFunctionImpl#getMaximumLoad <em>Maximum Load</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadLimitFunctionImpl#getReconnectTimeDelay <em>Reconnect Time Delay</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfLoadControl.impl.LoadLimitFunctionImpl#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadLimitFunctionImpl extends LoadMgmtFunctionImpl implements LoadLimitFunction {
	/**
	 * The default value of the '{@link #isIsAutoReconOp() <em>Is Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTO_RECON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutoReconOp() <em>Is Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutoReconOp = IS_AUTO_RECON_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumLoad() <em>Maximum Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLoad()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_LOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumLoad() <em>Maximum Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLoad()
	 * @generated
	 * @ordered
	 */
	protected float maximumLoad = MAXIMUM_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getReconnectTimeDelay() <em>Reconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float RECONNECT_TIME_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReconnectTimeDelay() <em>Reconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected float reconnectTimeDelay = RECONNECT_TIME_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisconnectTimeDelay() <em>Disconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnectTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCONNECT_TIME_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDisconnectTimeDelay() <em>Disconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnectTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected float disconnectTimeDelay = DISCONNECT_TIME_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadLimitFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLoadControlPackage.Literals.LOAD_LIMIT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAutoReconOp() {
		return isAutoReconOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutoReconOp(boolean newIsAutoReconOp) {
		boolean oldIsAutoReconOp = isAutoReconOp;
		isAutoReconOp = newIsAutoReconOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP, oldIsAutoReconOp, isAutoReconOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaximumLoad() {
		return maximumLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumLoad(float newMaximumLoad) {
		float oldMaximumLoad = maximumLoad;
		maximumLoad = newMaximumLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD, oldMaximumLoad, maximumLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReconnectTimeDelay() {
		return reconnectTimeDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconnectTimeDelay(float newReconnectTimeDelay) {
		float oldReconnectTimeDelay = reconnectTimeDelay;
		reconnectTimeDelay = newReconnectTimeDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY, oldReconnectTimeDelay, reconnectTimeDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDisconnectTimeDelay() {
		return disconnectTimeDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisconnectTimeDelay(float newDisconnectTimeDelay) {
		float oldDisconnectTimeDelay = disconnectTimeDelay;
		disconnectTimeDelay = newDisconnectTimeDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY, oldDisconnectTimeDelay, disconnectTimeDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP:
				return isIsAutoReconOp();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD:
				return getMaximumLoad();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY:
				return getReconnectTimeDelay();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY:
				return getDisconnectTimeDelay();
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
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP:
				setIsAutoReconOp((Boolean)newValue);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD:
				setMaximumLoad((Float)newValue);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY:
				setReconnectTimeDelay((Float)newValue);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY:
				setDisconnectTimeDelay((Float)newValue);
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
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP:
				setIsAutoReconOp(IS_AUTO_RECON_OP_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD:
				setMaximumLoad(MAXIMUM_LOAD_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY:
				setReconnectTimeDelay(RECONNECT_TIME_DELAY_EDEFAULT);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY:
				setDisconnectTimeDelay(DISCONNECT_TIME_DELAY_EDEFAULT);
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
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP:
				return isAutoReconOp != IS_AUTO_RECON_OP_EDEFAULT;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD:
				return maximumLoad != MAXIMUM_LOAD_EDEFAULT;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY:
				return reconnectTimeDelay != RECONNECT_TIME_DELAY_EDEFAULT;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY:
				return disconnectTimeDelay != DISCONNECT_TIME_DELAY_EDEFAULT;
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
		result.append(" (isAutoReconOp: ");
		result.append(isAutoReconOp);
		result.append(", maximumLoad: ");
		result.append(maximumLoad);
		result.append(", reconnectTimeDelay: ");
		result.append(reconnectTimeDelay);
		result.append(", disconnectTimeDelay: ");
		result.append(disconnectTimeDelay);
		result.append(')');
		return result.toString();
	}

} //LoadLimitFunctionImpl
