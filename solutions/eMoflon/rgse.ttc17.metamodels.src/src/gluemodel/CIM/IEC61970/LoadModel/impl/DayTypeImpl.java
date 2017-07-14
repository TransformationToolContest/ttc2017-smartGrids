/**
 */
package gluemodel.CIM.IEC61970.LoadModel.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.LoadModel.DayType;
import gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage;
import gluemodel.CIM.IEC61970.LoadModel.SeasonDayTypeSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.impl.DayTypeImpl#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DayTypeImpl extends IdentifiedObjectImpl implements DayType {
	/**
	 * The cached value of the '{@link #getSeasonDayTypeSchedules() <em>Season Day Type Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonDayTypeSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<SeasonDayTypeSchedule> seasonDayTypeSchedules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.DAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SeasonDayTypeSchedule> getSeasonDayTypeSchedules() {
		if (seasonDayTypeSchedules == null) {
			seasonDayTypeSchedules = new EObjectWithInverseResolvingEList<SeasonDayTypeSchedule>(SeasonDayTypeSchedule.class, this, LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE);
		}
		return seasonDayTypeSchedules;
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeasonDayTypeSchedules()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				return ((InternalEList<?>)getSeasonDayTypeSchedules()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				return getSeasonDayTypeSchedules();
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				getSeasonDayTypeSchedules().clear();
				getSeasonDayTypeSchedules().addAll((Collection<? extends SeasonDayTypeSchedule>)newValue);
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				getSeasonDayTypeSchedules().clear();
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				return seasonDayTypeSchedules != null && !seasonDayTypeSchedules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DayTypeImpl
