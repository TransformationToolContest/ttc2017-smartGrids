/**
 */
package COSEM.InterfaceClasses.impl;

import COSEM.Datatypes.DisconnectControlState;
import COSEM.Datatypes.DisconnectControlTransition;

import COSEM.InterfaceClasses.DisconnectControl;
import COSEM.InterfaceClasses.InterfaceClassesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disconnect Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.InterfaceClasses.impl.DisconnectControlImpl#getState <em>State</em>}</li>
 *   <li>{@link COSEM.InterfaceClasses.impl.DisconnectControlImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisconnectControlImpl extends BaseImpl implements DisconnectControl {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final DisconnectControlState STATE_EDEFAULT = DisconnectControlState.DISCONNECTED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected DisconnectControlState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected static final DisconnectControlTransition TRANSITION_EDEFAULT = DisconnectControlTransition.REMOTE_RECONNECT;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected DisconnectControlTransition transition = TRANSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisconnectControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfaceClassesPackage.Literals.DISCONNECT_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControlState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(DisconnectControlState newState) {
		DisconnectControlState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.DISCONNECT_CONTROL__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectControlTransition getTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(DisconnectControlTransition newTransition) {
		DisconnectControlTransition oldTransition = transition;
		transition = newTransition == null ? TRANSITION_EDEFAULT : newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfaceClassesPackage.DISCONNECT_CONTROL__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterfaceClassesPackage.DISCONNECT_CONTROL__STATE:
				return getState();
			case InterfaceClassesPackage.DISCONNECT_CONTROL__TRANSITION:
				return getTransition();
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
			case InterfaceClassesPackage.DISCONNECT_CONTROL__STATE:
				setState((DisconnectControlState)newValue);
				return;
			case InterfaceClassesPackage.DISCONNECT_CONTROL__TRANSITION:
				setTransition((DisconnectControlTransition)newValue);
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
			case InterfaceClassesPackage.DISCONNECT_CONTROL__STATE:
				setState(STATE_EDEFAULT);
				return;
			case InterfaceClassesPackage.DISCONNECT_CONTROL__TRANSITION:
				setTransition(TRANSITION_EDEFAULT);
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
			case InterfaceClassesPackage.DISCONNECT_CONTROL__STATE:
				return state != STATE_EDEFAULT;
			case InterfaceClassesPackage.DISCONNECT_CONTROL__TRANSITION:
				return transition != TRANSITION_EDEFAULT;
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
		result.append(" (state: ");
		result.append(state);
		result.append(", transition: ");
		result.append(transition);
		result.append(')');
		return result.toString();
	}

} //DisconnectControlImpl
