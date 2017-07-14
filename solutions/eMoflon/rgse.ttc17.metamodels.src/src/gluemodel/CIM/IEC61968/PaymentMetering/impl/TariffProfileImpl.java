/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.Tariff;

import gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.TariffProfile;
import gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Tariff Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TariffProfileImpl#getTariffCycle <em>Tariff Cycle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TariffProfileImpl#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TariffProfileImpl#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.TariffProfileImpl#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TariffProfileImpl extends DocumentImpl implements TariffProfile {
	/**
	 * The default value of the '{@link #getTariffCycle() <em>Tariff Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String TARIFF_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTariffCycle() <em>Tariff Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffCycle()
	 * @generated
	 * @ordered
	 */
	protected String tariffCycle = TARIFF_CYCLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeTariffIntervals() <em>Time Tariff Intervals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTariffIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeTariffInterval> timeTariffIntervals;

	/**
	 * The cached value of the '{@link #getTariffs() <em>Tariffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Tariff> tariffs;

	/**
	 * The cached value of the '{@link #getConsumptionTariffIntervals() <em>Consumption Tariff Intervals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumptionTariffIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsumptionTariffInterval> consumptionTariffIntervals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TariffProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TARIFF_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTariffCycle() {
		return tariffCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTariffCycle(String newTariffCycle) {
		String oldTariffCycle = tariffCycle;
		tariffCycle = newTariffCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE, oldTariffCycle, tariffCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeTariffInterval> getTimeTariffIntervals() {
		if (timeTariffIntervals == null) {
			timeTariffIntervals = new EObjectWithInverseResolvingEList.ManyInverse<TimeTariffInterval>(TimeTariffInterval.class, this, PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS, PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES);
		}
		return timeTariffIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tariff> getTariffs() {
		if (tariffs == null) {
			tariffs = new EObjectWithInverseResolvingEList.ManyInverse<Tariff>(Tariff.class, this, PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS, CustomersPackage.TARIFF__TARIFF_PROFILES);
		}
		return tariffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsumptionTariffInterval> getConsumptionTariffIntervals() {
		if (consumptionTariffIntervals == null) {
			consumptionTariffIntervals = new EObjectWithInverseResolvingEList.ManyInverse<ConsumptionTariffInterval>(ConsumptionTariffInterval.class, this, PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS, PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES);
		}
		return consumptionTariffIntervals;
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeTariffIntervals()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffs()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumptionTariffIntervals()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				return ((InternalEList<?>)getTimeTariffIntervals()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				return ((InternalEList<?>)getTariffs()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<?>)getConsumptionTariffIntervals()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE:
				return getTariffCycle();
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				return getTimeTariffIntervals();
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				return getTariffs();
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				return getConsumptionTariffIntervals();
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE:
				setTariffCycle((String)newValue);
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				getTimeTariffIntervals().clear();
				getTimeTariffIntervals().addAll((Collection<? extends TimeTariffInterval>)newValue);
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				getTariffs().clear();
				getTariffs().addAll((Collection<? extends Tariff>)newValue);
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				getConsumptionTariffIntervals().addAll((Collection<? extends ConsumptionTariffInterval>)newValue);
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE:
				setTariffCycle(TARIFF_CYCLE_EDEFAULT);
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				getTimeTariffIntervals().clear();
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				getTariffs().clear();
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE:
				return TARIFF_CYCLE_EDEFAULT == null ? tariffCycle != null : !TARIFF_CYCLE_EDEFAULT.equals(tariffCycle);
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				return timeTariffIntervals != null && !timeTariffIntervals.isEmpty();
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				return tariffs != null && !tariffs.isEmpty();
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				return consumptionTariffIntervals != null && !consumptionTariffIntervals.isEmpty();
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
		result.append(" (tariffCycle: ");
		result.append(tariffCycle);
		result.append(')');
		return result.toString();
	}

} //TariffProfileImpl
