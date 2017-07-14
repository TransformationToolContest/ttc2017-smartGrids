/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.Charge;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile;
import gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval;

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
 * An implementation of the model object '<em><b>Time Tariff Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TimeTariffIntervalImpl#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TimeTariffIntervalImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TimeTariffIntervalImpl#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TimeTariffIntervalImpl#getCharges <em>Charges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeTariffIntervalImpl extends ElementImpl implements TimeTariffInterval {
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
	 * The cached value of the '{@link #getTariffProfiles() <em>Tariff Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<TariffProfile> tariffProfiles;

	/**
	 * The cached value of the '{@link #getCharges() <em>Charges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected EList<Charge> charges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTariffIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TIME_TARIFF_INTERVAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME, oldStartDateTime, startDateTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TariffProfile> getTariffProfiles() {
		if (tariffProfiles == null) {
			tariffProfiles = new EObjectWithInverseResolvingEList.ManyInverse<TariffProfile>(TariffProfile.class, this, PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES, PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS);
		}
		return tariffProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Charge> getCharges() {
		if (charges == null) {
			charges = new EObjectWithInverseResolvingEList.ManyInverse<Charge>(Charge.class, this, PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES, PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS);
		}
		return charges;
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffProfiles()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharges()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				return ((InternalEList<?>)getTariffProfiles()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				return ((InternalEList<?>)getCharges()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME:
				return getStartDateTime();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				return getTariffProfiles();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				return getCharges();
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME:
				setStartDateTime((Date)newValue);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				getTariffProfiles().clear();
				getTariffProfiles().addAll((Collection<? extends TariffProfile>)newValue);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				getCharges().clear();
				getCharges().addAll((Collection<? extends Charge>)newValue);
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME:
				setStartDateTime(START_DATE_TIME_EDEFAULT);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				getTariffProfiles().clear();
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				getCharges().clear();
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME:
				return START_DATE_TIME_EDEFAULT == null ? startDateTime != null : !START_DATE_TIME_EDEFAULT.equals(startDateTime);
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				return tariffProfiles != null && !tariffProfiles.isEmpty();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				return charges != null && !charges.isEmpty();
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
		result.append(" (startDateTime: ");
		result.append(startDateTime);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(')');
		return result.toString();
	}

} //TimeTariffIntervalImpl
