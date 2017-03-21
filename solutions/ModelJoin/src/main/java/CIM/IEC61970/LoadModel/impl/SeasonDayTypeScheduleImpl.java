/**
 */
package CIM.IEC61970.LoadModel.impl;

import CIM.IEC61970.Core.impl.RegularIntervalScheduleImpl;

import CIM.IEC61970.LoadModel.DayType;
import CIM.IEC61970.LoadModel.LoadModelPackage;
import CIM.IEC61970.LoadModel.Season;
import CIM.IEC61970.LoadModel.SeasonDayTypeSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Season Day Type Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SeasonDayTypeScheduleImpl#getDayType <em>Day Type</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SeasonDayTypeScheduleImpl#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonDayTypeScheduleImpl extends RegularIntervalScheduleImpl implements SeasonDayTypeSchedule {
	/**
	 * The cached value of the '{@link #getDayType() <em>Day Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayType()
	 * @generated
	 * @ordered
	 */
	protected DayType dayType;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected Season season;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonDayTypeScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.SEASON_DAY_TYPE_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType getDayType() {
		if (dayType != null && dayType.eIsProxy()) {
			InternalEObject oldDayType = (InternalEObject)dayType;
			dayType = (DayType)eResolveProxy(oldDayType);
			if (dayType != oldDayType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE, oldDayType, dayType));
			}
		}
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType basicGetDayType() {
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDayType(DayType newDayType, NotificationChain msgs) {
		DayType oldDayType = dayType;
		dayType = newDayType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE, oldDayType, newDayType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayType(DayType newDayType) {
		if (newDayType != dayType) {
			NotificationChain msgs = null;
			if (dayType != null)
				msgs = ((InternalEObject)dayType).eInverseRemove(this, LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs);
			if (newDayType != null)
				msgs = ((InternalEObject)newDayType).eInverseAdd(this, LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs);
			msgs = basicSetDayType(newDayType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE, newDayType, newDayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season getSeason() {
		if (season != null && season.eIsProxy()) {
			InternalEObject oldSeason = (InternalEObject)season;
			season = (Season)eResolveProxy(oldSeason);
			if (season != oldSeason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON, oldSeason, season));
			}
		}
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season basicGetSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(Season newSeason, NotificationChain msgs) {
		Season oldSeason = season;
		season = newSeason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON, oldSeason, newSeason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		if (newSeason != season) {
			NotificationChain msgs = null;
			if (season != null)
				msgs = ((InternalEObject)season).eInverseRemove(this, LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				if (dayType != null)
					msgs = ((InternalEObject)dayType).eInverseRemove(this, LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs);
				return basicSetDayType((DayType)otherEnd, msgs);
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				if (season != null)
					msgs = ((InternalEObject)season).eInverseRemove(this, LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs);
				return basicSetSeason((Season)otherEnd, msgs);
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				return basicSetDayType(null, msgs);
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				return basicSetSeason(null, msgs);
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				if (resolve) return getDayType();
				return basicGetDayType();
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				if (resolve) return getSeason();
				return basicGetSeason();
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				setDayType((DayType)newValue);
				return;
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				setSeason((Season)newValue);
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				setDayType((DayType)null);
				return;
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				setSeason((Season)null);
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				return dayType != null;
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				return season != null;
		}
		return super.eIsSet(featureID);
	}

} //SeasonDayTypeScheduleImpl
