/**
 */
package gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl;

import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.EnergySchedulingPackage;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.Profile;
import gluemodel.CIM.IEC61970.Informative.EnergyScheduling.ProfileData;

import gluemodel.CIM.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Profile Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl#getCapacityLevel <em>Capacity Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl#getStopDateTime <em>Stop Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.EnergyScheduling.impl.ProfileDataImpl#getEnergyLevel <em>Energy Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileDataImpl extends ElementImpl implements ProfileData {
	/**
	 * The default value of the '{@link #getCapacityLevel() <em>Capacity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITY_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacityLevel() <em>Capacity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityLevel()
	 * @generated
	 * @ordered
	 */
	protected float capacityLevel = CAPACITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date startDateTime = START_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Profile> profile;

	/**
	 * The default value of the '{@link #getStopDateTime() <em>Stop Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STOP_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopDateTime() <em>Stop Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date stopDateTime = STOP_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergyLevel() <em>Energy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyLevel() <em>Energy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyLevel()
	 * @generated
	 * @ordered
	 */
	protected float energyLevel = ENERGY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergySchedulingPackage.Literals.PROFILE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapacityLevel() {
		return capacityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityLevel(float newCapacityLevel) {
		float oldCapacityLevel = capacityLevel;
		capacityLevel = newCapacityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.PROFILE_DATA__CAPACITY_LEVEL, oldCapacityLevel, capacityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDateTime(Date newStartDateTime) {
		Date oldStartDateTime = startDateTime;
		startDateTime = newStartDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.PROFILE_DATA__START_DATE_TIME, oldStartDateTime, startDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.PROFILE_DATA__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getProfile() {
		if (profile == null) {
			profile = new EObjectWithInverseResolvingEList.ManyInverse<Profile>(Profile.class, this, EnergySchedulingPackage.PROFILE_DATA__PROFILE, EnergySchedulingPackage.PROFILE__PROFILE_DATAS);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStopDateTime() {
		return stopDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopDateTime(Date newStopDateTime) {
		Date oldStopDateTime = stopDateTime;
		stopDateTime = newStopDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.PROFILE_DATA__STOP_DATE_TIME, oldStopDateTime, stopDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEnergyLevel() {
		return energyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyLevel(float newEnergyLevel) {
		float oldEnergyLevel = energyLevel;
		energyLevel = newEnergyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergySchedulingPackage.PROFILE_DATA__ENERGY_LEVEL, oldEnergyLevel, energyLevel));
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
			case EnergySchedulingPackage.PROFILE_DATA__PROFILE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProfile()).basicAdd(otherEnd, msgs);
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
			case EnergySchedulingPackage.PROFILE_DATA__PROFILE:
				return ((InternalEList<?>)getProfile()).basicRemove(otherEnd, msgs);
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
			case EnergySchedulingPackage.PROFILE_DATA__CAPACITY_LEVEL:
				return getCapacityLevel();
			case EnergySchedulingPackage.PROFILE_DATA__START_DATE_TIME:
				return getStartDateTime();
			case EnergySchedulingPackage.PROFILE_DATA__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case EnergySchedulingPackage.PROFILE_DATA__PROFILE:
				return getProfile();
			case EnergySchedulingPackage.PROFILE_DATA__STOP_DATE_TIME:
				return getStopDateTime();
			case EnergySchedulingPackage.PROFILE_DATA__ENERGY_LEVEL:
				return getEnergyLevel();
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
			case EnergySchedulingPackage.PROFILE_DATA__CAPACITY_LEVEL:
				setCapacityLevel((Float)newValue);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__START_DATE_TIME:
				setStartDateTime((Date)newValue);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection<? extends Profile>)newValue);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__STOP_DATE_TIME:
				setStopDateTime((Date)newValue);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__ENERGY_LEVEL:
				setEnergyLevel((Float)newValue);
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
			case EnergySchedulingPackage.PROFILE_DATA__CAPACITY_LEVEL:
				setCapacityLevel(CAPACITY_LEVEL_EDEFAULT);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__START_DATE_TIME:
				setStartDateTime(START_DATE_TIME_EDEFAULT);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__PROFILE:
				getProfile().clear();
				return;
			case EnergySchedulingPackage.PROFILE_DATA__STOP_DATE_TIME:
				setStopDateTime(STOP_DATE_TIME_EDEFAULT);
				return;
			case EnergySchedulingPackage.PROFILE_DATA__ENERGY_LEVEL:
				setEnergyLevel(ENERGY_LEVEL_EDEFAULT);
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
			case EnergySchedulingPackage.PROFILE_DATA__CAPACITY_LEVEL:
				return capacityLevel != CAPACITY_LEVEL_EDEFAULT;
			case EnergySchedulingPackage.PROFILE_DATA__START_DATE_TIME:
				return START_DATE_TIME_EDEFAULT == null ? startDateTime != null : !START_DATE_TIME_EDEFAULT.equals(startDateTime);
			case EnergySchedulingPackage.PROFILE_DATA__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case EnergySchedulingPackage.PROFILE_DATA__PROFILE:
				return profile != null && !profile.isEmpty();
			case EnergySchedulingPackage.PROFILE_DATA__STOP_DATE_TIME:
				return STOP_DATE_TIME_EDEFAULT == null ? stopDateTime != null : !STOP_DATE_TIME_EDEFAULT.equals(stopDateTime);
			case EnergySchedulingPackage.PROFILE_DATA__ENERGY_LEVEL:
				return energyLevel != ENERGY_LEVEL_EDEFAULT;
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
		result.append(" (capacityLevel: ");
		result.append(capacityLevel);
		result.append(", startDateTime: ");
		result.append(startDateTime);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", stopDateTime: ");
		result.append(stopDateTime);
		result.append(", energyLevel: ");
		result.append(energyLevel);
		result.append(')');
		return result.toString();
	}

} //ProfileDataImpl
