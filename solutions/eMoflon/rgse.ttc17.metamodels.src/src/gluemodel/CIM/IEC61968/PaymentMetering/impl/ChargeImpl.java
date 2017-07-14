/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit;
import gluemodel.CIM.IEC61968.PaymentMetering.AuxiliaryAccount;
import gluemodel.CIM.IEC61968.PaymentMetering.Charge;
import gluemodel.CIM.IEC61968.PaymentMetering.ChargeKind;
import gluemodel.CIM.IEC61968.PaymentMetering.ConsumptionTariffInterval;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.TimeTariffInterval;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ChargeImpl#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ChargeImpl#getParentCharge <em>Parent Charge</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ChargeImpl#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ChargeImpl#getChildCharges <em>Child Charges</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ChargeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ChargeImpl#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ChargeImpl#getVariablePortion <em>Variable Portion</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ChargeImpl#getFixedPortion <em>Fixed Portion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeImpl extends IdentifiedObjectImpl implements Charge {
	/**
	 * The cached value of the '{@link #getAuxiliaryAccounts() <em>Auxiliary Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryAccount> auxiliaryAccounts;

	/**
	 * The cached value of the '{@link #getParentCharge() <em>Parent Charge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCharge()
	 * @generated
	 * @ordered
	 */
	protected Charge parentCharge;

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
	 * The cached value of the '{@link #getChildCharges() <em>Child Charges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildCharges()
	 * @generated
	 * @ordered
	 */
	protected EList<Charge> childCharges;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ChargeKind KIND_EDEFAULT = ChargeKind.AUXILIARY_CHARGE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ChargeKind kind = KIND_EDEFAULT;

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
	 * The default value of the '{@link #getVariablePortion() <em>Variable Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablePortion()
	 * @generated
	 * @ordered
	 */
	protected static final float VARIABLE_PORTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVariablePortion() <em>Variable Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablePortion()
	 * @generated
	 * @ordered
	 */
	protected float variablePortion = VARIABLE_PORTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFixedPortion() <em>Fixed Portion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPortion()
	 * @generated
	 * @ordered
	 */
	protected AccountingUnit fixedPortion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CHARGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryAccount> getAuxiliaryAccounts() {
		if (auxiliaryAccounts == null) {
			auxiliaryAccounts = new EObjectWithInverseResolvingEList.ManyInverse<AuxiliaryAccount>(AuxiliaryAccount.class, this, PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS, PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES);
		}
		return auxiliaryAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charge getParentCharge() {
		if (parentCharge != null && parentCharge.eIsProxy()) {
			InternalEObject oldParentCharge = (InternalEObject)parentCharge;
			parentCharge = (Charge)eResolveProxy(oldParentCharge);
			if (parentCharge != oldParentCharge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CHARGE__PARENT_CHARGE, oldParentCharge, parentCharge));
			}
		}
		return parentCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charge basicGetParentCharge() {
		return parentCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCharge(Charge newParentCharge, NotificationChain msgs) {
		Charge oldParentCharge = parentCharge;
		parentCharge = newParentCharge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHARGE__PARENT_CHARGE, oldParentCharge, newParentCharge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCharge(Charge newParentCharge) {
		if (newParentCharge != parentCharge) {
			NotificationChain msgs = null;
			if (parentCharge != null)
				msgs = ((InternalEObject)parentCharge).eInverseRemove(this, PaymentMeteringPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs);
			if (newParentCharge != null)
				msgs = ((InternalEObject)newParentCharge).eInverseAdd(this, PaymentMeteringPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs);
			msgs = basicSetParentCharge(newParentCharge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHARGE__PARENT_CHARGE, newParentCharge, newParentCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsumptionTariffInterval> getConsumptionTariffIntervals() {
		if (consumptionTariffIntervals == null) {
			consumptionTariffIntervals = new EObjectWithInverseResolvingEList.ManyInverse<ConsumptionTariffInterval>(ConsumptionTariffInterval.class, this, PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS, PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES);
		}
		return consumptionTariffIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Charge> getChildCharges() {
		if (childCharges == null) {
			childCharges = new EObjectWithInverseResolvingEList<Charge>(Charge.class, this, PaymentMeteringPackage.CHARGE__CHILD_CHARGES, PaymentMeteringPackage.CHARGE__PARENT_CHARGE);
		}
		return childCharges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ChargeKind newKind) {
		ChargeKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHARGE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeTariffInterval> getTimeTariffIntervals() {
		if (timeTariffIntervals == null) {
			timeTariffIntervals = new EObjectWithInverseResolvingEList.ManyInverse<TimeTariffInterval>(TimeTariffInterval.class, this, PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS, PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES);
		}
		return timeTariffIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVariablePortion() {
		return variablePortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariablePortion(float newVariablePortion) {
		float oldVariablePortion = variablePortion;
		variablePortion = newVariablePortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHARGE__VARIABLE_PORTION, oldVariablePortion, variablePortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit getFixedPortion() {
		if (fixedPortion != null && fixedPortion.eIsProxy()) {
			InternalEObject oldFixedPortion = (InternalEObject)fixedPortion;
			fixedPortion = (AccountingUnit)eResolveProxy(oldFixedPortion);
			if (fixedPortion != oldFixedPortion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CHARGE__FIXED_PORTION, oldFixedPortion, fixedPortion));
			}
		}
		return fixedPortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit basicGetFixedPortion() {
		return fixedPortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedPortion(AccountingUnit newFixedPortion) {
		AccountingUnit oldFixedPortion = fixedPortion;
		fixedPortion = newFixedPortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHARGE__FIXED_PORTION, oldFixedPortion, fixedPortion));
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
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryAccounts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				if (parentCharge != null)
					msgs = ((InternalEObject)parentCharge).eInverseRemove(this, PaymentMeteringPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs);
				return basicSetParentCharge((Charge)otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumptionTariffIntervals()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCharges()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeTariffIntervals()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				return ((InternalEList<?>)getAuxiliaryAccounts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				return basicSetParentCharge(null, msgs);
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<?>)getConsumptionTariffIntervals()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				return ((InternalEList<?>)getChildCharges()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				return ((InternalEList<?>)getTimeTariffIntervals()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				return getAuxiliaryAccounts();
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				if (resolve) return getParentCharge();
				return basicGetParentCharge();
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				return getConsumptionTariffIntervals();
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				return getChildCharges();
			case PaymentMeteringPackage.CHARGE__KIND:
				return getKind();
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				return getTimeTariffIntervals();
			case PaymentMeteringPackage.CHARGE__VARIABLE_PORTION:
				return getVariablePortion();
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				if (resolve) return getFixedPortion();
				return basicGetFixedPortion();
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
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				getAuxiliaryAccounts().clear();
				getAuxiliaryAccounts().addAll((Collection<? extends AuxiliaryAccount>)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				setParentCharge((Charge)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				getConsumptionTariffIntervals().addAll((Collection<? extends ConsumptionTariffInterval>)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				getChildCharges().clear();
				getChildCharges().addAll((Collection<? extends Charge>)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__KIND:
				setKind((ChargeKind)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				getTimeTariffIntervals().clear();
				getTimeTariffIntervals().addAll((Collection<? extends TimeTariffInterval>)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__VARIABLE_PORTION:
				setVariablePortion((Float)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				setFixedPortion((AccountingUnit)newValue);
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
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				getAuxiliaryAccounts().clear();
				return;
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				setParentCharge((Charge)null);
				return;
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				return;
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				getChildCharges().clear();
				return;
			case PaymentMeteringPackage.CHARGE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				getTimeTariffIntervals().clear();
				return;
			case PaymentMeteringPackage.CHARGE__VARIABLE_PORTION:
				setVariablePortion(VARIABLE_PORTION_EDEFAULT);
				return;
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				setFixedPortion((AccountingUnit)null);
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
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				return auxiliaryAccounts != null && !auxiliaryAccounts.isEmpty();
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				return parentCharge != null;
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				return consumptionTariffIntervals != null && !consumptionTariffIntervals.isEmpty();
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				return childCharges != null && !childCharges.isEmpty();
			case PaymentMeteringPackage.CHARGE__KIND:
				return kind != KIND_EDEFAULT;
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				return timeTariffIntervals != null && !timeTariffIntervals.isEmpty();
			case PaymentMeteringPackage.CHARGE__VARIABLE_PORTION:
				return variablePortion != VARIABLE_PORTION_EDEFAULT;
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				return fixedPortion != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", variablePortion: ");
		result.append(variablePortion);
		result.append(')');
		return result.toString();
	}

} //ChargeImpl
