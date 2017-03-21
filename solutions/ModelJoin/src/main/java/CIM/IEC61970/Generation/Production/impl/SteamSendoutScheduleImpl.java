/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl;

import CIM.IEC61970.Generation.Production.CogenerationPlant;
import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.SteamSendoutSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Steam Sendout Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.SteamSendoutScheduleImpl#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SteamSendoutScheduleImpl extends RegularIntervalScheduleImpl implements SteamSendoutSchedule {
	/**
	 * The cached value of the '{@link #getCogenerationPlant() <em>Cogeneration Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenerationPlant()
	 * @generated
	 * @ordered
	 */
	protected CogenerationPlant cogenerationPlant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SteamSendoutScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.STEAM_SENDOUT_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CogenerationPlant getCogenerationPlant() {
		if (cogenerationPlant != null && cogenerationPlant.eIsProxy()) {
			InternalEObject oldCogenerationPlant = (InternalEObject)cogenerationPlant;
			cogenerationPlant = (CogenerationPlant)eResolveProxy(oldCogenerationPlant);
			if (cogenerationPlant != oldCogenerationPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, oldCogenerationPlant, cogenerationPlant));
			}
		}
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CogenerationPlant basicGetCogenerationPlant() {
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCogenerationPlant(CogenerationPlant newCogenerationPlant, NotificationChain msgs) {
		CogenerationPlant oldCogenerationPlant = cogenerationPlant;
		cogenerationPlant = newCogenerationPlant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, oldCogenerationPlant, newCogenerationPlant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCogenerationPlant(CogenerationPlant newCogenerationPlant) {
		if (newCogenerationPlant != cogenerationPlant) {
			NotificationChain msgs = null;
			if (cogenerationPlant != null)
				msgs = ((InternalEObject)cogenerationPlant).eInverseRemove(this, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs);
			if (newCogenerationPlant != null)
				msgs = ((InternalEObject)newCogenerationPlant).eInverseAdd(this, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs);
			msgs = basicSetCogenerationPlant(newCogenerationPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, newCogenerationPlant, newCogenerationPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				if (cogenerationPlant != null)
					msgs = ((InternalEObject)cogenerationPlant).eInverseRemove(this, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs);
				return basicSetCogenerationPlant((CogenerationPlant)otherEnd, msgs);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				return basicSetCogenerationPlant(null, msgs);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				if (resolve) return getCogenerationPlant();
				return basicGetCogenerationPlant();
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				setCogenerationPlant((CogenerationPlant)newValue);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				setCogenerationPlant((CogenerationPlant)null);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				return cogenerationPlant != null;
		}
		return super.eIsSet(featureID);
	}

} //SteamSendoutScheduleImpl
