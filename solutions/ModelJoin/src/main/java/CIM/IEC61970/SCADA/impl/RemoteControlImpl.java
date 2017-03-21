/**
 */
package CIM.IEC61970.SCADA.impl;

import CIM.IEC61970.Meas.Control;
import CIM.IEC61970.Meas.MeasPackage;

import CIM.IEC61970.SCADA.RemoteControl;
import CIM.IEC61970.SCADA.SCADAPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteControlImpl#getControl <em>Control</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteControlImpl#getActuatorMaximum <em>Actuator Maximum</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteControlImpl#isRemoteControlled <em>Remote Controlled</em>}</li>
 *   <li>{@link CIM.IEC61970.SCADA.impl.RemoteControlImpl#getActuatorMinimum <em>Actuator Minimum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteControlImpl extends RemotePointImpl implements RemoteControl {
	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected Control control;

	/**
	 * The default value of the '{@link #getActuatorMaximum() <em>Actuator Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUATOR_MAXIMUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActuatorMaximum() <em>Actuator Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorMaximum()
	 * @generated
	 * @ordered
	 */
	protected float actuatorMaximum = ACTUATOR_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoteControlled() <em>Remote Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteControlled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_CONTROLLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteControlled() <em>Remote Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteControlled()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteControlled = REMOTE_CONTROLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getActuatorMinimum() <em>Actuator Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUATOR_MINIMUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActuatorMinimum() <em>Actuator Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorMinimum()
	 * @generated
	 * @ordered
	 */
	protected float actuatorMinimum = ACTUATOR_MINIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.REMOTE_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getControl() {
		if (control != null && control.eIsProxy()) {
			InternalEObject oldControl = (InternalEObject)control;
			control = (Control)eResolveProxy(oldControl);
			if (control != oldControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCADAPackage.REMOTE_CONTROL__CONTROL, oldControl, control));
			}
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(Control newControl, NotificationChain msgs) {
		Control oldControl = control;
		control = newControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_CONTROL__CONTROL, oldControl, newControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(Control newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject)control).eInverseRemove(this, MeasPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs);
			if (newControl != null)
				msgs = ((InternalEObject)newControl).eInverseAdd(this, MeasPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_CONTROL__CONTROL, newControl, newControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getActuatorMaximum() {
		return actuatorMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatorMaximum(float newActuatorMaximum) {
		float oldActuatorMaximum = actuatorMaximum;
		actuatorMaximum = newActuatorMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM, oldActuatorMaximum, actuatorMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteControlled() {
		return remoteControlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteControlled(boolean newRemoteControlled) {
		boolean oldRemoteControlled = remoteControlled;
		remoteControlled = newRemoteControlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED, oldRemoteControlled, remoteControlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getActuatorMinimum() {
		return actuatorMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatorMinimum(float newActuatorMinimum) {
		float oldActuatorMinimum = actuatorMinimum;
		actuatorMinimum = newActuatorMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM, oldActuatorMinimum, actuatorMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				if (control != null)
					msgs = ((InternalEObject)control).eInverseRemove(this, MeasPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs);
				return basicSetControl((Control)otherEnd, msgs);
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				return basicSetControl(null, msgs);
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				if (resolve) return getControl();
				return basicGetControl();
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
				return getActuatorMaximum();
			case SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
				return isRemoteControlled();
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
				return getActuatorMinimum();
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				setControl((Control)newValue);
				return;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
				setActuatorMaximum((Float)newValue);
				return;
			case SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
				setRemoteControlled((Boolean)newValue);
				return;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
				setActuatorMinimum((Float)newValue);
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				setControl((Control)null);
				return;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
				setActuatorMaximum(ACTUATOR_MAXIMUM_EDEFAULT);
				return;
			case SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
				setRemoteControlled(REMOTE_CONTROLLED_EDEFAULT);
				return;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
				setActuatorMinimum(ACTUATOR_MINIMUM_EDEFAULT);
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				return control != null;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
				return actuatorMaximum != ACTUATOR_MAXIMUM_EDEFAULT;
			case SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
				return remoteControlled != REMOTE_CONTROLLED_EDEFAULT;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
				return actuatorMinimum != ACTUATOR_MINIMUM_EDEFAULT;
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
		result.append(" (actuatorMaximum: ");
		result.append(actuatorMaximum);
		result.append(", remoteControlled: ");
		result.append(remoteControlled);
		result.append(", actuatorMinimum: ");
		result.append(actuatorMinimum);
		result.append(')');
		return result.toString();
	}

} //RemoteControlImpl
