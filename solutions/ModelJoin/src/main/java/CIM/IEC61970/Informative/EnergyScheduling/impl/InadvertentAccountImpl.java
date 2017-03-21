/**
 */
package CIM.IEC61970.Informative.EnergyScheduling.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import CIM.IEC61970.Informative.EnergyScheduling.HostControlArea;
import CIM.IEC61970.Informative.EnergyScheduling.InadvertentAccount;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inadvertent Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.EnergyScheduling.impl.InadvertentAccountImpl#getHostControlArea <em>Host Control Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InadvertentAccountImpl extends CurveImpl implements InadvertentAccount {
	/**
	 * The cached value of the '{@link #getHostControlArea() <em>Host Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostControlArea()
	 * @generated
	 * @ordered
	 */
	protected HostControlArea hostControlArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InadvertentAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.INADVERTENT_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea getHostControlArea() {
		if (hostControlArea != null && hostControlArea.eIsProxy()) {
			InternalEObject oldHostControlArea = (InternalEObject)hostControlArea;
			hostControlArea = (HostControlArea)eResolveProxy(oldHostControlArea);
			if (hostControlArea != oldHostControlArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA, oldHostControlArea, hostControlArea));
			}
		}
		return hostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostControlArea basicGetHostControlArea() {
		return hostControlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostControlArea(HostControlArea newHostControlArea, NotificationChain msgs) {
		HostControlArea oldHostControlArea = hostControlArea;
		hostControlArea = newHostControlArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA, oldHostControlArea, newHostControlArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostControlArea(HostControlArea newHostControlArea) {
		if (newHostControlArea != hostControlArea) {
			NotificationChain msgs = null;
			if (hostControlArea != null)
				msgs = ((InternalEObject)hostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS, HostControlArea.class, msgs);
			if (newHostControlArea != null)
				msgs = ((InternalEObject)newHostControlArea).eInverseAdd(this, EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS, HostControlArea.class, msgs);
			msgs = basicSetHostControlArea(newHostControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA, newHostControlArea, newHostControlArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA:
				if (hostControlArea != null)
					msgs = ((InternalEObject)hostControlArea).eInverseRemove(this, EnergySchedulingPackage.HOST_CONTROL_AREA__INADVERTENT_ACCOUNTS, HostControlArea.class, msgs);
				return basicSetHostControlArea((HostControlArea)otherEnd, msgs);
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
			case EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA:
				return basicSetHostControlArea(null, msgs);
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
			case EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA:
				if (resolve) return getHostControlArea();
				return basicGetHostControlArea();
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
			case EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA:
				setHostControlArea((HostControlArea)newValue);
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
			case EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA:
				setHostControlArea((HostControlArea)null);
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
			case EnergySchedulingPackage.INADVERTENT_ACCOUNT__HOST_CONTROL_AREA:
				return hostControlArea != null;
		}
		return super.eIsSet(featureID);
	}

} //InadvertentAccountImpl
