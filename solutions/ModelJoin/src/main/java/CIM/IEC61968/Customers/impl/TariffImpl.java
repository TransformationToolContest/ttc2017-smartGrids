/**
 */
package CIM.IEC61968.Customers.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61968.Customers.CustomersPackage;
import CIM.IEC61968.Customers.PricingStructure;
import CIM.IEC61968.Customers.Tariff;

import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.TariffProfile;

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
 * An implementation of the model object '<em><b>Tariff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Customers.impl.TariffImpl#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.TariffImpl#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.TariffImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.TariffImpl#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TariffImpl extends DocumentImpl implements Tariff {
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
	 * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingStructure> pricingStructures;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TariffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.TARIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TariffProfile> getTariffProfiles() {
		if (tariffProfiles == null) {
			tariffProfiles = new EObjectWithInverseResolvingEList.ManyInverse<TariffProfile>(TariffProfile.class, this, CustomersPackage.TARIFF__TARIFF_PROFILES, PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS);
		}
		return tariffProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PricingStructure> getPricingStructures() {
		if (pricingStructures == null) {
			pricingStructures = new EObjectWithInverseResolvingEList.ManyInverse<PricingStructure>(PricingStructure.class, this, CustomersPackage.TARIFF__PRICING_STRUCTURES, CustomersPackage.PRICING_STRUCTURE__TARIFFS);
		}
		return pricingStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.TARIFF__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.TARIFF__START_DATE, oldStartDate, startDate));
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
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffProfiles()).basicAdd(otherEnd, msgs);
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPricingStructures()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				return ((InternalEList<?>)getTariffProfiles()).basicRemove(otherEnd, msgs);
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				return ((InternalEList<?>)getPricingStructures()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				return getTariffProfiles();
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				return getPricingStructures();
			case CustomersPackage.TARIFF__END_DATE:
				return getEndDate();
			case CustomersPackage.TARIFF__START_DATE:
				return getStartDate();
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
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				getTariffProfiles().clear();
				getTariffProfiles().addAll((Collection<? extends TariffProfile>)newValue);
				return;
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				getPricingStructures().clear();
				getPricingStructures().addAll((Collection<? extends PricingStructure>)newValue);
				return;
			case CustomersPackage.TARIFF__END_DATE:
				setEndDate((String)newValue);
				return;
			case CustomersPackage.TARIFF__START_DATE:
				setStartDate((String)newValue);
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
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				getTariffProfiles().clear();
				return;
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				getPricingStructures().clear();
				return;
			case CustomersPackage.TARIFF__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case CustomersPackage.TARIFF__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
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
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				return tariffProfiles != null && !tariffProfiles.isEmpty();
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				return pricingStructures != null && !pricingStructures.isEmpty();
			case CustomersPackage.TARIFF__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case CustomersPackage.TARIFF__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
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
		result.append(" (endDate: ");
		result.append(endDate);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(')');
		return result.toString();
	}

} //TariffImpl
