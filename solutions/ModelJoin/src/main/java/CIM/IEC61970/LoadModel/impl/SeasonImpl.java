/**
 */
package CIM.IEC61970.LoadModel.impl;

import CIM.IEC61970.Informative.MarketOperations.CapacityBenefitMargin;
import CIM.IEC61970.Informative.MarketOperations.MarketOperationsPackage;
import CIM.IEC61970.Informative.MarketOperations.ViolationLimit;

import CIM.IEC61970.LoadModel.LoadModelPackage;
import CIM.IEC61970.LoadModel.Season;
import CIM.IEC61970.LoadModel.SeasonDayTypeSchedule;
import CIM.IEC61970.LoadModel.SeasonName;

import CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SeasonImpl#getViolationLimits <em>Violation Limits</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SeasonImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SeasonImpl#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SeasonImpl#getName <em>Name</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SeasonImpl#getCapacityBenefitMargin <em>Capacity Benefit Margin</em>}</li>
 *   <li>{@link CIM.IEC61970.LoadModel.impl.SeasonImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonImpl extends ElementImpl implements Season {
	/**
	 * The cached value of the '{@link #getViolationLimits() <em>Violation Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<ViolationLimit> violationLimits;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final SeasonName NAME_EDEFAULT = SeasonName.WINTER;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected SeasonName name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapacityBenefitMargin() <em>Capacity Benefit Margin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityBenefitMargin()
	 * @generated
	 * @ordered
	 */
	protected EList<CapacityBenefitMargin> capacityBenefitMargin;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.SEASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViolationLimit> getViolationLimits() {
		if (violationLimits == null) {
			violationLimits = new EObjectWithInverseResolvingEList<ViolationLimit>(ViolationLimit.class, this, LoadModelPackage.SEASON__VIOLATION_LIMITS, MarketOperationsPackage.VIOLATION_LIMIT__SEASON);
		}
		return violationLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.SEASON__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SeasonDayTypeSchedule> getSeasonDayTypeSchedules() {
		if (seasonDayTypeSchedules == null) {
			seasonDayTypeSchedules = new EObjectWithInverseResolvingEList<SeasonDayTypeSchedule>(SeasonDayTypeSchedule.class, this, LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON);
		}
		return seasonDayTypeSchedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SeasonName newName) {
		SeasonName oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.SEASON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapacityBenefitMargin> getCapacityBenefitMargin() {
		if (capacityBenefitMargin == null) {
			capacityBenefitMargin = new EObjectWithInverseResolvingEList<CapacityBenefitMargin>(CapacityBenefitMargin.class, this, LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN, MarketOperationsPackage.CAPACITY_BENEFIT_MARGIN__SEASON);
		}
		return capacityBenefitMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadModelPackage.SEASON__END_DATE, oldEndDate, endDate));
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
			case LoadModelPackage.SEASON__VIOLATION_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViolationLimits()).basicAdd(otherEnd, msgs);
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeasonDayTypeSchedules()).basicAdd(otherEnd, msgs);
			case LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapacityBenefitMargin()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.SEASON__VIOLATION_LIMITS:
				return ((InternalEList<?>)getViolationLimits()).basicRemove(otherEnd, msgs);
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
				return ((InternalEList<?>)getSeasonDayTypeSchedules()).basicRemove(otherEnd, msgs);
			case LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN:
				return ((InternalEList<?>)getCapacityBenefitMargin()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.SEASON__VIOLATION_LIMITS:
				return getViolationLimits();
			case LoadModelPackage.SEASON__START_DATE:
				return getStartDate();
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
				return getSeasonDayTypeSchedules();
			case LoadModelPackage.SEASON__NAME:
				return getName();
			case LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN:
				return getCapacityBenefitMargin();
			case LoadModelPackage.SEASON__END_DATE:
				return getEndDate();
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
			case LoadModelPackage.SEASON__VIOLATION_LIMITS:
				getViolationLimits().clear();
				getViolationLimits().addAll((Collection<? extends ViolationLimit>)newValue);
				return;
			case LoadModelPackage.SEASON__START_DATE:
				setStartDate((Date)newValue);
				return;
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
				getSeasonDayTypeSchedules().clear();
				getSeasonDayTypeSchedules().addAll((Collection<? extends SeasonDayTypeSchedule>)newValue);
				return;
			case LoadModelPackage.SEASON__NAME:
				setName((SeasonName)newValue);
				return;
			case LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN:
				getCapacityBenefitMargin().clear();
				getCapacityBenefitMargin().addAll((Collection<? extends CapacityBenefitMargin>)newValue);
				return;
			case LoadModelPackage.SEASON__END_DATE:
				setEndDate((Date)newValue);
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
			case LoadModelPackage.SEASON__VIOLATION_LIMITS:
				getViolationLimits().clear();
				return;
			case LoadModelPackage.SEASON__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
				getSeasonDayTypeSchedules().clear();
				return;
			case LoadModelPackage.SEASON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN:
				getCapacityBenefitMargin().clear();
				return;
			case LoadModelPackage.SEASON__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case LoadModelPackage.SEASON__VIOLATION_LIMITS:
				return violationLimits != null && !violationLimits.isEmpty();
			case LoadModelPackage.SEASON__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
				return seasonDayTypeSchedules != null && !seasonDayTypeSchedules.isEmpty();
			case LoadModelPackage.SEASON__NAME:
				return name != NAME_EDEFAULT;
			case LoadModelPackage.SEASON__CAPACITY_BENEFIT_MARGIN:
				return capacityBenefitMargin != null && !capacityBenefitMargin.isEmpty();
			case LoadModelPackage.SEASON__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", name: ");
		result.append(name);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //SeasonImpl
