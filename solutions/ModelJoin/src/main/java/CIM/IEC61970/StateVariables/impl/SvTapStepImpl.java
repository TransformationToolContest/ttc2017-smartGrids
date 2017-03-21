/**
 */
package CIM.IEC61970.StateVariables.impl;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvTapStep;

import CIM.IEC61970.Wires.TapChanger;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Tap Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvTapStepImpl#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvTapStepImpl#getContinuousPosition <em>Continuous Position</em>}</li>
 *   <li>{@link CIM.IEC61970.StateVariables.impl.SvTapStepImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvTapStepImpl extends StateVariableImpl implements SvTapStep {
	/**
	 * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChanger()
	 * @generated
	 * @ordered
	 */
	protected TapChanger tapChanger;

	/**
	 * The default value of the '{@link #getContinuousPosition() <em>Continuous Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuousPosition()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTINUOUS_POSITION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getContinuousPosition() <em>Continuous Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuousPosition()
	 * @generated
	 * @ordered
	 */
	protected float continuousPosition = CONTINUOUS_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvTapStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_TAP_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger getTapChanger() {
		if (tapChanger != null && tapChanger.eIsProxy()) {
			InternalEObject oldTapChanger = (InternalEObject)tapChanger;
			tapChanger = (TapChanger)eResolveProxy(oldTapChanger);
			if (tapChanger != oldTapChanger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, oldTapChanger, tapChanger));
			}
		}
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger basicGetTapChanger() {
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTapChanger(TapChanger newTapChanger, NotificationChain msgs) {
		TapChanger oldTapChanger = tapChanger;
		tapChanger = newTapChanger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, oldTapChanger, newTapChanger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapChanger(TapChanger newTapChanger) {
		if (newTapChanger != tapChanger) {
			NotificationChain msgs = null;
			if (tapChanger != null)
				msgs = ((InternalEObject)tapChanger).eInverseRemove(this, WiresPackage.TAP_CHANGER__SV_TAP_STEP, TapChanger.class, msgs);
			if (newTapChanger != null)
				msgs = ((InternalEObject)newTapChanger).eInverseAdd(this, WiresPackage.TAP_CHANGER__SV_TAP_STEP, TapChanger.class, msgs);
			msgs = basicSetTapChanger(newTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, newTapChanger, newTapChanger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getContinuousPosition() {
		return continuousPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuousPosition(float newContinuousPosition) {
		float oldContinuousPosition = continuousPosition;
		continuousPosition = newContinuousPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_TAP_STEP__CONTINUOUS_POSITION, oldContinuousPosition, continuousPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateVariablesPackage.SV_TAP_STEP__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				if (tapChanger != null)
					msgs = ((InternalEObject)tapChanger).eInverseRemove(this, WiresPackage.TAP_CHANGER__SV_TAP_STEP, TapChanger.class, msgs);
				return basicSetTapChanger((TapChanger)otherEnd, msgs);
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				return basicSetTapChanger(null, msgs);
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				if (resolve) return getTapChanger();
				return basicGetTapChanger();
			case StateVariablesPackage.SV_TAP_STEP__CONTINUOUS_POSITION:
				return getContinuousPosition();
			case StateVariablesPackage.SV_TAP_STEP__POSITION:
				return getPosition();
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				setTapChanger((TapChanger)newValue);
				return;
			case StateVariablesPackage.SV_TAP_STEP__CONTINUOUS_POSITION:
				setContinuousPosition((Float)newValue);
				return;
			case StateVariablesPackage.SV_TAP_STEP__POSITION:
				setPosition((Integer)newValue);
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				setTapChanger((TapChanger)null);
				return;
			case StateVariablesPackage.SV_TAP_STEP__CONTINUOUS_POSITION:
				setContinuousPosition(CONTINUOUS_POSITION_EDEFAULT);
				return;
			case StateVariablesPackage.SV_TAP_STEP__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				return tapChanger != null;
			case StateVariablesPackage.SV_TAP_STEP__CONTINUOUS_POSITION:
				return continuousPosition != CONTINUOUS_POSITION_EDEFAULT;
			case StateVariablesPackage.SV_TAP_STEP__POSITION:
				return position != POSITION_EDEFAULT;
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
		result.append(" (continuousPosition: ");
		result.append(continuousPosition);
		result.append(", position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //SvTapStepImpl
